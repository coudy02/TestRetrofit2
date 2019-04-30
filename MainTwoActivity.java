package com.yizhen.exampleInCheck;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import com.yizhen.testretrofit2.BuildConfig;
import com.yizhen.testretrofit2.R;
import com.yizhen.testretrofit2.VersionUpdateInfo;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import okhttp3.ResponseBody;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.Result;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainTwoActivity extends Activity {

    public static final String TAG = "MainTwoActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        postBodyRequest();

    }


    /**
     * post 在body中发送json
     * retrofit 自动把java.class转成json字符串，并放在body中
     */
    public void postBodyRequest() {
        HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
        //设置日志Level
        if (BuildConfig.DEBUG) {
            // development build
            logging.setLevel(HttpLoggingInterceptor.Level.BODY);
        } else {
            // production build
            logging.setLevel(HttpLoggingInterceptor.Level.BASIC);
        }
        OkHttpClient.Builder httpClient = new OkHttpClient.Builder()
                .connectTimeout(15, TimeUnit.SECONDS)
                .readTimeout(15, TimeUnit.SECONDS)
                .writeTimeout(15, TimeUnit.SECONDS)
                //添加拦截器到OkHttp，这是最关键的
                .addInterceptor(logging);

        Log.e(TAG, "postBodyRequest");
        //步骤4:创建Retrofit对象
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(" http://183.56.131.6:8004/dp-bussintf/") // 设置 网络请求 Url
                .addConverterFactory(GsonConverterFactory.create()) //设置使用Gson解析(记得加入依赖)
                .client(httpClient.build())
                .build();

        // 步骤5:创建 网络请求接口 的实例
        PostBodyInterface request = retrofit.create(PostBodyInterface.class);
        PostBodyReq postBodyReq = new PostBodyReq();
        postBodyReq.setAppId("");
        postBodyReq.setMethod("bussIntfAction!getVersionUpdateInfo.action");
        postBodyReq.setTokenId("");
        PostBodyReq.ReqVersionInfo reqVersionInfo = new PostBodyReq.ReqVersionInfo();

        reqVersionInfo.setVersionType("1");
        postBodyReq.setData(reqVersionInfo);
//        //对 发送请求 进行封装(设置需要翻译的内容)
//        Call<ResponseBody> call = request.getCall(postBodyReq);
//        //步骤6:发送网络请求(异步)
//        call.enqueue(new Callback<ResponseBody>() {
//            //请求成功时回调
//            @Override
//            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
//                // 步骤7：处理返回的数据结果：输出翻译的内容
//                try {
//                    Log.e(TAG, response.body().string());
//
//                    Result<VersionUpdateInfo> info = response.body();
//
//
//                } catch (Exception e) {
//                    e.printStackTrace();
//                }
//
//            }
//
//            //请求失败时回调
//            @Override
//            public void onFailure(Call<ResponseBody> call, Throwable throwable) {
//                Log.e(TAG, "请求失败");
//                Log.e(TAG, throwable.getMessage());
//            }
//        });

        //对 发送请求 进行封装(设置需要翻译的内容)
        Call<Result<VersionUpdateInfo>> call = request.getCall(postBodyReq);
        //步骤6:发送网络请求(异步)
        call.enqueue(new Callback<Result<VersionUpdateInfo>>() {
            @Override
            public void onResponse(Call<Result<VersionUpdateInfo>> call, Response<Result<VersionUpdateInfo>> response) {
                try {
                    Log.e(TAG, response.body().toString());

                    Result<VersionUpdateInfo> info = response.body();


                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            @Override
            public void onFailure(Call<Result<VersionUpdateInfo>> call, Throwable throwable) {
                Log.e(TAG, "请求失败");
                Log.e(TAG, throwable.getMessage());
            }
        });


    }

}
