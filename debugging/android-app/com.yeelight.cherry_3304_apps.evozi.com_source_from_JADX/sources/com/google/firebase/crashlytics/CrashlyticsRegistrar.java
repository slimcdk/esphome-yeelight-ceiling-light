package com.google.firebase.crashlytics;

import com.google.firebase.C2816c;
import com.google.firebase.analytics.p109a.C2801a;
import com.google.firebase.components.C2825d;
import com.google.firebase.components.C2828e;
import com.google.firebase.components.C2834h;
import com.google.firebase.components.C2843n;
import com.google.firebase.crashlytics.p110c.C2856a;
import com.google.firebase.iid.p134b.C3207a;
import com.google.firebase.p138k.C3316g;
import java.util.Arrays;
import java.util.List;

public class CrashlyticsRegistrar implements C2834h {
    /* access modifiers changed from: private */
    /* renamed from: b */
    public C2854b m8668b(C2828e eVar) {
        return C2854b.m8672b((C2816c) eVar.mo17074a(C2816c.class), eVar.mo17089b(C3207a.class).get(), (C2856a) eVar.mo17074a(C2856a.class), (C2801a) eVar.mo17074a(C2801a.class));
    }

    public List<C2825d<?>> getComponents() {
        C2825d.C2827b<C2854b> a = C2825d.m8587a(C2854b.class);
        a.mo17084b(C2843n.m8645f(C2816c.class));
        a.mo17084b(C2843n.m8646g(C3207a.class));
        a.mo17084b(C2843n.m8644e(C2801a.class));
        a.mo17084b(C2843n.m8644e(C2856a.class));
        a.mo17088f(C2853a.m8669b(this));
        a.mo17087e();
        return Arrays.asList(new C2825d[]{a.mo17086d(), C3316g.m10312a("fire-cls", "17.0.0")});
    }
}
