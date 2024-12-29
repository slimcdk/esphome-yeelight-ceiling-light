package com.google.firebase.analytics.connector.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.firebase.C2816c;
import com.google.firebase.analytics.p109a.C2801a;
import com.google.firebase.components.C2825d;
import com.google.firebase.components.C2834h;
import com.google.firebase.components.C2843n;
import com.google.firebase.p131g.C3195d;
import com.google.firebase.p138k.C3316g;
import java.util.Arrays;
import java.util.List;

@KeepForSdk
@Keep
public class AnalyticsConnectorRegistrar implements C2834h {
    @SuppressLint({"MissingPermission"})
    @Keep
    @KeepForSdk
    public List<C2825d<?>> getComponents() {
        C2825d.C2827b<C2801a> a = C2825d.m8587a(C2801a.class);
        a.mo17084b(C2843n.m8645f(C2816c.class));
        a.mo17084b(C2843n.m8645f(Context.class));
        a.mo17084b(C2843n.m8645f(C3195d.class));
        a.mo17088f(C2809a.f5415a);
        a.mo17087e();
        return Arrays.asList(new C2825d[]{a.mo17086d(), C3316g.m10312a("fire-analytics", "17.4.1")});
    }
}
