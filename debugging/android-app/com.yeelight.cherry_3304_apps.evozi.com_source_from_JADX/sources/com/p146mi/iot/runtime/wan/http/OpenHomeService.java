package com.p146mi.iot.runtime.wan.http;

import com.p146mi.iot.runtime.wan.http.bean.ActionBean;
import com.p146mi.iot.runtime.wan.http.bean.DeviceBeen;
import com.p146mi.iot.runtime.wan.http.bean.PropertyBeen;
import com.p146mi.iot.runtime.wan.http.bean.SubscribeBean;
import retrofit.http.Body;
import retrofit.http.GET;
import retrofit.http.HTTP;
import retrofit.http.POST;
import retrofit.http.PUT;
import retrofit.http.Query;

/* renamed from: com.mi.iot.runtime.wan.http.OpenHomeService */
public interface OpenHomeService {
    @GET("/api/v1/devices")
    ApiResponse<DeviceBeen> getDevices();

    @GET("api/v1/properties")
    ApiResponse<PropertyBeen> getProperties(@Query("pid") String str);

    @PUT("api/v1/action")
    ApiResponse<ActionBean> invokeAction(@Body ActionBean actionBean);

    @PUT("api/v1/properties")
    ApiResponse<PropertyBeen> setProperties(@Body PropertyBeen propertyBeen);

    @POST("api/v1/subscriptions")
    ApiResponse<SubscribeBean.Response> subscribe(@Body SubscribeBean subscribeBean);

    @HTTP(hasBody = true, method = "DELETE", path = "api/v1/subscriptions")
    ApiResponse<SubscribeBean.Response> unsubscribe(@Body SubscribeBean subscribeBean);
}
