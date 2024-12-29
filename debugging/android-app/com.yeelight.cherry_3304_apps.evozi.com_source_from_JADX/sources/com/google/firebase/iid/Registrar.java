package com.google.firebase.iid;

import androidx.annotation.Keep;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.firebase.C2816c;
import com.google.firebase.components.C2825d;
import com.google.firebase.components.C2834h;
import com.google.firebase.components.C2843n;
import com.google.firebase.iid.p134b.C3207a;
import com.google.firebase.installations.C3277h;
import com.google.firebase.p131g.C3195d;
import com.google.firebase.p132h.C3198c;
import com.google.firebase.p138k.C3316g;
import com.google.firebase.p138k.C3317h;
import java.util.Arrays;
import java.util.List;

@KeepForSdk
@Keep
public final class Registrar implements C2834h {

    /* renamed from: com.google.firebase.iid.Registrar$a */
    private static class C3203a implements C3207a {

        /* renamed from: a */
        private final FirebaseInstanceId f6195a;

        public C3203a(FirebaseInstanceId firebaseInstanceId) {
            this.f6195a = firebaseInstanceId;
        }

        public final String getId() {
            return this.f6195a.mo17785a();
        }
    }

    @Keep
    public final List<C2825d<?>> getComponents() {
        Class<FirebaseInstanceId> cls = FirebaseInstanceId.class;
        C2825d.C2827b<FirebaseInstanceId> a = C2825d.m8587a(cls);
        a.mo17084b(C2843n.m8645f(C2816c.class));
        a.mo17084b(C2843n.m8645f(C3195d.class));
        a.mo17084b(C2843n.m8645f(C3317h.class));
        a.mo17084b(C2843n.m8645f(C3198c.class));
        a.mo17084b(C2843n.m8645f(C3277h.class));
        a.mo17088f(C3249s.f6284a);
        a.mo17085c();
        C2825d<FirebaseInstanceId> d = a.mo17086d();
        C2825d.C2827b<C3207a> a2 = C2825d.m8587a(C3207a.class);
        a2.mo17084b(C2843n.m8645f(cls));
        a2.mo17088f(C3251t.f6286a);
        return Arrays.asList(new C2825d[]{d, a2.mo17086d(), C3316g.m10312a("fire-iid", "20.1.5")});
    }
}
