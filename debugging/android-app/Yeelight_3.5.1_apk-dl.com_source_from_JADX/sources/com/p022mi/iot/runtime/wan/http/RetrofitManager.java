package com.p022mi.iot.runtime.wan.http;

import com.miot.common.config.AppConfiguration;
import com.miot.service.common.miotcloud.UserAgentInterceptor;
import com.p022mi.iot.runtime.CtrlRuntimeManager;
import com.p022mi.iot.runtime.wan.http.calladapter.ApiCallAdapterFactory;
import com.p022mi.iot.runtime.wan.http.converter.StringConverterFactory;
import com.p022mi.iot.runtime.wan.http.interceptor.AuthInterceptor;
import com.p022mi.iot.runtime.wan.http.interceptor.AuthInterceptorV2;
import com.p022mi.iot.runtime.wan.http.interceptor.LoggingInterceptor;
import com.squareup.okhttp.C4310u;
import java.util.concurrent.TimeUnit;
import p173i7.C9145h;
import p173i7.C9173s;

/* renamed from: com.mi.iot.runtime.wan.http.RetrofitManager */
public class RetrofitManager {
    private static final String TAG = "RetrofitManager";
    private static RetrofitManager sInstance;
    private C4310u mHttpClient;
    private C4310u mHttpClientV2;
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
        C4310u uVar = new C4310u();
        this.mHttpClient = uVar;
        uVar.mo27987E().add(new AuthInterceptor());
        this.mHttpClient.mo27987E().add(new UserAgentInterceptor("mijia-sdk-ua"));
        this.mHttpClient.mo27987E().add(new LoggingInterceptor());
        C4310u uVar2 = this.mHttpClient;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        uVar2.mo27993R(15, timeUnit);
        C4310u uVar3 = new C4310u();
        this.mHttpClientV2 = uVar3;
        uVar3.mo27987E().add(new AuthInterceptorV2());
        this.mHttpClientV2.mo27987E().add(new UserAgentInterceptor("mijia-sdk-ua"));
        this.mHttpClientV2.mo27987E().add(new LoggingInterceptor());
        this.mHttpClientV2.mo27993R(15, timeUnit);
    }

    private void initOpenHomeService() {
        Class cls = OpenHomeService.class;
        this.mOpenHomeService = (OpenHomeService) new C9173s.C9175b().mo37265e(getUrl(false)).mo37267g(this.mHttpClient).mo37262b(C9145h.m21971a()).mo37261a(new ApiCallAdapterFactory()).mo37266f().mo37255d(cls);
        this.mOpenHomeServiceV2 = (OpenHomeService) new C9173s.C9175b().mo37265e(getUrl(false)).mo37267g(this.mHttpClientV2).mo37262b(C9145h.m21971a()).mo37261a(new ApiCallAdapterFactory()).mo37266f().mo37255d(cls);
    }

    private void initSpecService() {
        Class cls = IotSpecService.class;
        this.mSpecService = (IotSpecService) new C9173s.C9175b().mo37265e(getUrl(true)).mo37267g(this.mHttpClient).mo37262b(StringConverterFactory.create()).mo37261a(new ApiCallAdapterFactory()).mo37266f().mo37255d(cls);
        this.mSpecServiceV2 = (IotSpecService) new C9173s.C9175b().mo37265e(getUrl(true)).mo37267g(this.mHttpClientV2).mo37262b(StringConverterFactory.create()).mo37261a(new ApiCallAdapterFactory()).mo37266f().mo37255d(cls);
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
