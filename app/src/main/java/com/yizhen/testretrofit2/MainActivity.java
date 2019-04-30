package com.yizhen.testretrofit2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

public class MainActivity extends AppCompatActivity {

    private BlogService service;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



//        Retrofit retrofit = new Retrofit.Builder()
//                .baseUrl("http://183.56.131.6:8001/")
//                .build();
//
//        service = retrofit.create(BlogService.class);
//        Call<ResponseBody> call = service.getBlog(2);
//        // 用法和OkHttp的call如出一辙,
//        // 不同的是如果是Android系统回调方法执行在主线程
//        call.enqueue(new Callback<ResponseBody>() {
//            @Override
//            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
//                try {
//                    System.out.println(response.body().string());
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//
//            @Override
//            public void onFailure(Call<ResponseBody> call, Throwable t) {
//                t.printStackTrace();
//                System.out.println("--onFailure--");
//            }
//        });




        // http://183.56.131.6:8001
        // bussIntfAction!getVersionUpdateInfoByEncrypt.action
//        ParRequest request = new ParRequest();
//        request.setSendUrl(AppConstant.getApp().REQUEST_URL);
//        request.setMethod("bussIntfAction!getVersionUpdateInfoByEncrypt.action");
//        request.setToken_id("");
//        HashMap<String, Object> map = new HashMap<String, Object>();
//        map.put("versionType", "1");
//        map.put("versionTypeName", String.valueOf(AppConstant.getApp().VERSION_CODE));


    }

    public interface BlogService {
        @GET("blog/{id}")
        Call<ResponseBody> getBlog(@Path("id") int id);
    }


//
//    public interface PostBodyInterface {
//        @POST("bussIntfAction!getVersionUpdateInfo.action")
//        Call<ResponseBody> getCall(@Body PostBodyReq postBodyReq);
//    }
//
//    /**
//     * post 在body中发送json
//     * retrofit 自动把java.class转成json字符串，并放在body中
//     */
//    public void postBodyRequest() {
//        HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
//        //设置日志Level
//        if (BuildConfig.DEBUG) {
//            // development build
//            logging.setLevel(HttpLoggingInterceptor.Level.BODY);
//        } else {
//            // production build
//            logging.setLevel(HttpLoggingInterceptor.Level.BASIC);
//        }
//        OkHttpClient.Builder httpClient = new OkHttpClient.Builder()
//                .connectTimeout(15, TimeUnit.SECONDS)
//                .readTimeout(15, TimeUnit.SECONDS)
//                .writeTimeout(15, TimeUnit.SECONDS)
//                //添加拦截器到OkHttp，这是最关键的
//                .addInterceptor(logging);
//
//        Log.w("tan","postBodyRequest");
//        //步骤4:创建Retrofit对象
//        Retrofit retrofit = new Retrofit.Builder()
//                .baseUrl("http://14.116.xxx.xxx:9001/dp-bussintf/") // 设置 网络请求 Url
//                .addConverterFactory(GsonConverterFactory.create()) //设置使用Gson解析(记得加入依赖)
//                .client(httpClient.build())
//                .build();
//
//        // 步骤5:创建 网络请求接口 的实例
//        PostBodyInterface request = retrofit.create(PostBodyInterface.class);
//        PostBodyReq postBodyReq=new PostBodyReq();
//        postBodyReq.appId="";
//        postBodyReq.method="bussIntfAction!getVersionUpdateInfo.action";
//        postBodyReq.tokenId="";
//        PostBodyData postBodyData=new PostBodyData();
//        postBodyData.versionTypeName="45";
//        postBodyData.versionType="1";
//        postBodyReq.data=postBodyData;
//        //对 发送请求 进行封装(设置需要翻译的内容)
//        Call<ResponseBody> call = request.getCall(postBodyReq);
//        //步骤6:发送网络请求(异步)
//        call.enqueue(new Callback<ResponseBody>() {
//            //请求成功时回调
//            @Override
//            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
//                // 步骤7：处理返回的数据结果：输出翻译的内容
//                try{
//                    Log.w("tan",response.body().string());
//                    //不要用下面这个
//                    //Log.w("tan",response.body().toString());
//                }catch (Exception e){
//                    e.printStackTrace();
//                }
//
//            }
//
//            //请求失败时回调
//            @Override
//            public void onFailure(Call<ResponseBody> call, Throwable throwable) {
//                Log.w("tan","请求失败");
//                Log.w("tan",throwable.getMessage());
//            }
//        });
//    }





}
