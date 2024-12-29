package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.C1018ac;
import java.util.Map;

/* renamed from: com.google.android.gms.measurement.internal.e5 */
final class C1601e5 implements C1018ac {

    /* renamed from: a */
    final /* synthetic */ String f2051a;

    /* renamed from: b */
    final /* synthetic */ C1614f5 f2052b;

    C1601e5(C1614f5 f5Var, String str) {
        this.f2052b = f5Var;
        this.f2051a = str;
    }

    /* renamed from: a */
    public final String mo12546a(String str) {
        Map map = (Map) this.f2052b.f2074d.get(this.f2051a);
        if (map == null || !map.containsKey(str)) {
            return null;
        }
        return (String) map.get(str);
    }
}
