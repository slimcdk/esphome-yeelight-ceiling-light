package com.google.android.gms.measurement.internal;

import com.xiaomi.mipush.sdk.Constants;
import java.util.HashMap;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.measurement.internal.x4 */
public final /* synthetic */ class C1836x4 implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C1614f5 f2760a;

    /* renamed from: b */
    public final /* synthetic */ String f2761b;

    public /* synthetic */ C1836x4(C1614f5 f5Var, String str) {
        this.f2760a = f5Var;
        this.f2761b = str;
    }

    public final Object call() {
        C1614f5 f5Var = this.f2760a;
        String str = this.f2761b;
        C1589d6 R = f5Var.f2045b.mo14466V().mo14322R(str);
        HashMap hashMap = new HashMap();
        hashMap.put("platform", "android");
        hashMap.put(Constants.PACKAGE_NAME, str);
        f5Var.f2143a.mo14402z().mo14176q();
        hashMap.put("gmp_version", 64000L);
        if (R != null) {
            String h0 = R.mo14095h0();
            if (h0 != null) {
                hashMap.put(Constants.EXTRA_KEY_APP_VERSION, h0);
            }
            hashMap.put("app_version_int", Long.valueOf(R.mo14066M()));
            hashMap.put("dynamite_version", Long.valueOf(R.mo14075V()));
        }
        return hashMap;
    }
}
