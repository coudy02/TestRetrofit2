package com.yizhen.exampleInCheck;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface PostBodyInterface {

    @POST("bussIntfAction!getVersionUpdateInfo.action")
    Call<ResponseBody> getCall(@Body PostBodyReq postBodyReq);

//    @POST("bussIntfAction!getVersionUpdateInfo.action")
//    Call<Result<VersionUpdateInfo>> getCall(@Body PostBodyReq postBodyReq);



}
