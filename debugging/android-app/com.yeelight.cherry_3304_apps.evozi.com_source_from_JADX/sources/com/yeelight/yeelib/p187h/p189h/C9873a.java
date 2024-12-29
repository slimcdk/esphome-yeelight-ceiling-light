package com.yeelight.yeelib.p187h.p189h;

import java.util.Map;
import p156f.C4322b0;
import p156f.C4336d0;
import p173j.C4446b;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.HTTP;
import retrofit2.http.HeaderMap;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.QueryMap;
import retrofit2.http.Streaming;
import retrofit2.http.Url;

/* renamed from: com.yeelight.yeelib.h.h.a */
public interface C9873a {
    @Streaming
    @GET
    /* renamed from: a */
    C4446b<C4336d0> mo31933a(@HeaderMap Map<String, String> map, @Url String str, @QueryMap Map<String, String> map2);

    @FormUrlEncoded
    @POST
    /* renamed from: b */
    C4446b<C4336d0> mo31934b(@HeaderMap Map<String, String> map, @Url String str, @FieldMap Map<String, String> map2);

    @DELETE
    /* renamed from: c */
    C4446b<C4336d0> mo31935c(@HeaderMap Map<String, String> map, @Url String str, @QueryMap Map<String, String> map2);

    @PUT
    /* renamed from: d */
    C4446b<C4336d0> mo31936d(@HeaderMap Map<String, String> map, @Body C4322b0 b0Var, @Url String str, @QueryMap Map<String, String> map2);

    @GET
    /* renamed from: e */
    C4446b<C4336d0> mo31937e(@HeaderMap Map<String, String> map, @Url String str, @QueryMap Map<String, String> map2);

    @POST
    /* renamed from: f */
    C4446b<C4336d0> mo31938f(@HeaderMap Map<String, String> map, @Body C4322b0 b0Var, @Url String str);

    @HTTP(hasBody = true, method = "DELETE")
    /* renamed from: g */
    C4446b<C4336d0> mo31939g(@HeaderMap Map<String, String> map, @Body C4322b0 b0Var, @Url String str, @QueryMap Map<String, String> map2);
}
