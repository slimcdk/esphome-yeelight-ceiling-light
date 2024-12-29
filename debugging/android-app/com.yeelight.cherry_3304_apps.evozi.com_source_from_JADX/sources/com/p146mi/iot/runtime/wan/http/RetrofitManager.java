package com.p146mi.iot.runtime.wan.http;

import com.miot.common.config.AppConfiguration;
import com.miot.service.common.miotcloud.UserAgentInterceptor;
import com.p146mi.iot.runtime.CtrlRuntimeManager;
import com.p146mi.iot.runtime.wan.http.calladapter.ApiCallAdapterFactory;
import com.p146mi.iot.runtime.wan.http.converter.StringConverterFactory;
import com.p146mi.iot.runtime.wan.http.interceptor.AuthInterceptor;
import com.p146mi.iot.runtime.wan.http.interceptor.AuthInterceptorV2;
import com.p146mi.iot.runtime.wan.http.interceptor.LoggingInterceptor;
import java.util.concurrent.TimeUnit;
import p011c.p083d.p084a.C1141v;
import p262i.C11534h;
import p262i.C11562s;

/* renamed from: com.mi.iot.runtime.wan.http.RetrofitManager */
public class RetrofitManager {
    private static final String TAG = "RetrofitManager";
    private static RetrofitManager sInstance;
    private C1141v mHttpClient;
    private C1141v mHttpClientV2;
    private OpenHomeService mOpenHomeService;
    private OpenHomeService mOpenHomeServiceV2;
    private IotSpecService mSpecService;
    private IotSpecService mSpecServiceV2;

    private RetrofitManager() {
        initHttpClient();
        initOpenHomeService();
        initSpecService();
    }

    public static synchronized RetrofitManager getInstance() {
        RetrofitManager retrofitManager;
        synchronized (RetrofitManager.class) {
            if (sInstance == null) {
                sInstance = new RetrofitManager();
            }
            retrofitManager = sInstance;
        }
        return retrofitManager;
    }

    private String getUrl(boolean z) {
        AppConfiguration appConfig = CtrlRuntimeManager.getInstance().getAppConfig();
        String str = "";
        String str2 = appConfig.isPreview() ? "pv." : str;
        AppConfiguration.Locale locale = appConfig.getLocale();
        if (!locale.equals(AppConfiguration.Locale.cn)) {
            str = locale.name() + ".";
        }
        if (z) {
            return "https://miot-spec.org/";
        }
        return "https://" + str2 + str + "api.home.mi.com/";
    }

    private void initHttpClient() {
        C1141v vVar = new C1141v();
        this.mHttpClient = vVar;
        vVar.mo9800B().add(new AuthInterceptor());
        this.mHttpClient.mo9800B().add(new UserAgentInterceptor("mijia-sdk-ua"));
        this.mHttpClient.mo9800B().add(new LoggingInterceptor());
        this.mHttpClient.mo9806O(15, TimeUnit.SECONDS);
        C1141v vVar2 = new C1141v();
        this.mHttpClientV2 = vVar2;
        vVar2.mo9800B().add(new AuthInterceptorV2());
        this.mHttpClientV2.mo9800B().add(new UserAgentInterceptor("mijia-sdk-ua"));
        this.mHttpClientV2.mo9800B().add(new LoggingInterceptor());
        this.mHttpClientV2.mo9806O(15, TimeUnit.SECONDS);
    }

    private void initOpenHomeService() {
        Class cls = OpenHomeService.class;
        C11562s.C11564b bVar = new C11562s.C11564b();
        bVar.mo36488d(getUrl(false));
        bVar.mo36491g(this.mHttpClient);
        bVar.mo36486b(C11534h.m30263a());
        bVar.mo36485a(new ApiCallAdapterFactory());
        this.mOpenHomeService = (OpenHomeService) bVar.mo36490f().mo36479d(cls);
        C11562s.C11564b bVar2 = new C11562s.C11564b();
        bVar2.mo36488d(getUrl(false));
        bVar2.mo36491g(this.mHttpClientV2);
        bVar2.mo36486b(C11534h.m30263a());
        bVar2.mo36485a(new ApiCallAdapterFactory());
        this.mOpenHomeServiceV2 = (OpenHomeService) bVar2.mo36490f().mo36479d(cls);
    }

    private void initSpecService() {
        Class cls = IotSpecService.class;
        C11562s.C11564b bVar = new C11562s.C11564b();
        bVar.mo36488d(getUrl(true));
        bVar.mo36491g(this.mHttpClient);
        bVar.mo36486b(StringConverterFactory.create());
        bVar.mo36485a(new ApiCallAdapterFactory());
        this.mSpecService = (IotSpecService) bVar.mo36490f().mo36479d(cls);
        C11562s.C11564b bVar2 = new C11562s.C11564b();
        bVar2.mo36488d(getUrl(true));
        bVar2.mo36491g(this.mHttpClientV2);
        bVar2.mo36486b(StringConverterFactory.create());
        bVar2.mo36485a(new ApiCallAdapterFactory());
        this.mSpecServiceV2 = (IotSpecService) bVar2.mo36490f().mo36479d(cls);
    }

    public void deInit() {
        sInstance = null;
    }

    public OpenHomeService getOpenHomeService() {
        return this.mOpenHomeService;
    }

    public OpenHomeService getOpenHomeServiceV2() {
        return this.mOpenHomeServiceV2;
    }

    public IotSpecService getSpecService() {
        return this.mSpecService;
    }

    public IotSpecService getSpecServiceV2() {
        return this.mSpecServiceV2;
    }
}
