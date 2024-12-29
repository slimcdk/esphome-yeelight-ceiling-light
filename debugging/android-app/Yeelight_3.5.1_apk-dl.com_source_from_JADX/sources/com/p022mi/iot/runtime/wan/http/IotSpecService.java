package com.p022mi.iot.runtime.wan.http;

import retrofit.http.GET;
import retrofit.http.Query;

/* renamed from: com.mi.iot.runtime.wan.http.IotSpecService */
public interface IotSpecService {
    @GET("instance/device")
    ApiResponse<String> getProfile(@Query("type") String str);

    @GET("miot-spec-v2/instance")
    ApiResponse<String> getProfileV2(@Query("type") String str);
}
