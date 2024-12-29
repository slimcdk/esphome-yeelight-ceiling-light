package p129b4;

import com.yeelight.yeelib.managers.C8261b;
import com.yeelight.yeelib.retrofit.Interceptor.C8346a;
import com.yeelight.yeelib.retrofit.Interceptor.HttpResponseFailureInterceptor;
import java.io.File;
import java.util.concurrent.TimeUnit;
import okhttp3.C3511c;
import okhttp3.C3552x;
import p051j4.C9194m;

/* renamed from: b4.a */
public class C3987a {

    /* renamed from: a */
    private C3552x.C3554b f6734a = m11562b();

    /* renamed from: b */
    private C3552x.C3554b m11562b() {
        C3552x.C3554b bVar = new C3552x.C3554b();
        bVar.mo24630a(new C8346a());
        bVar.mo24630a(new HttpResponseFailureInterceptor());
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        bVar.mo24633d(20000, timeUnit);
        bVar.mo24635f(20000, timeUnit);
        bVar.mo24638i(20000, timeUnit);
        bVar.mo24636g(true);
        bVar.mo24632c(new C3511c(new File(C9194m.m22163f()), 10485760));
        C8261b a = C3997e.m11613a();
        bVar.mo24637h(a, a.mo35177a());
        bVar.mo24634e(C3997e.m11614b());
        return bVar;
    }

    /* renamed from: c */
    public static C3987a m11563c() {
        return new C3987a();
    }

    /* renamed from: a */
    public C3552x mo26570a() {
        return this.f6734a.mo24631b();
    }
}
