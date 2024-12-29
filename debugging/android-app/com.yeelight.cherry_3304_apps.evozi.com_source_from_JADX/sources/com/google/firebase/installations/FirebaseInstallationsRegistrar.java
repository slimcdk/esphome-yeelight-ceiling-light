package com.google.firebase.installations;

import androidx.annotation.Keep;
import com.google.firebase.C2816c;
import com.google.firebase.components.C2825d;
import com.google.firebase.components.C2828e;
import com.google.firebase.components.C2834h;
import com.google.firebase.components.C2843n;
import com.google.firebase.p132h.C3198c;
import com.google.firebase.p138k.C3316g;
import com.google.firebase.p138k.C3317h;
import java.util.Arrays;
import java.util.List;

@Keep
public class FirebaseInstallationsRegistrar implements C2834h {
    static /* synthetic */ C3277h lambda$getComponents$0(C2828e eVar) {
        return new C3274g((C2816c) eVar.mo17074a(C2816c.class), (C3317h) eVar.mo17074a(C3317h.class), (C3198c) eVar.mo17074a(C3198c.class));
    }

    public List<C2825d<?>> getComponents() {
        C2825d.C2827b<C3277h> a = C2825d.m8587a(C3277h.class);
        a.mo17084b(C2843n.m8645f(C2816c.class));
        a.mo17084b(C2843n.m8645f(C3198c.class));
        a.mo17084b(C2843n.m8645f(C3317h.class));
        a.mo17088f(C3280j.m10169b());
        return Arrays.asList(new C2825d[]{a.mo17086d(), C3316g.m10312a("fire-installations", "16.2.1")});
    }
}
