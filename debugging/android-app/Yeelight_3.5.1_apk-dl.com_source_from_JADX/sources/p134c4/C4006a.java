package p134c4;

import java.util.Map;
import okhttp3.C3505a0;
import okhttp3.C3518c0;
import p177j7.C9216a;
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

/* renamed from: c4.a */
public interface C4006a {
    @Streaming
    @GET
    /* renamed from: a */
    C9216a<C3518c0> mo26594a(@HeaderMap Map<String, String> map, @Url String str, @QueryMap Map<String, String> map2);

    @FormUrlEncoded
    @POST
    /* renamed from: b */
    C9216a<C3518c0> mo26595b(@HeaderMap Map<String, String> map, @Url String str, @FieldMap Map<String, String> map2);

    @DELETE
    /* renamed from: c */
    C9216a<C3518c0> mo26596c(@HeaderMap Map<String, String> map, @Url String str, @QueryMap Map<String, String> map2);

    @PUT
    /* renamed from: d */
    C9216a<C3518c0> mo26597d(@HeaderMap Map<String, String> map, @Body C3505a0 a0Var, @Url String str, @QueryMap Map<String, String> map2);

    @GET
    /* renamed from: e */
    C9216a<C3518c0> mo26598e(@HeaderMap Map<String, String> map, @Url String str, @QueryMap Map<String, String> map2);

    @POST
    /* renamed from: f */
    C9216a<C3518c0> mo26599f(@HeaderMap Map<String, String> map, @Body C3505a0 a0Var, @Url String str);

    @HTTP(hasBody = true, method = "DELETE")
    /* renamed from: g */
    C9216a<C3518c0> mo26600g(@HeaderMap Map<String, String> map, @Body C3505a0 a0Var, @Url String str, @QueryMap Map<String, String> map2);
}
