package com.google.firebase.analytics.connector.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.firebase.C2406d;
import java.util.Arrays;
import java.util.List;
import p066m1.C3344d;
import p103u1.C3717h;
import p106v0.C3730a;
import p110w0.C3870d;
import p110w0.C3879i;
import p110w0.C3887q;

@KeepForSdk
@Keep
public class AnalyticsConnectorRegistrar implements C3879i {
    @SuppressLint({"MissingPermission"})
    @Keep
    @NonNull
    @KeepForSdk
    public List<C3870d<?>> getComponents() {
        return Arrays.asList(new C3870d[]{C3870d.m10982c(C3730a.class).mo26346b(C3887q.m11057i(C2406d.class)).mo26346b(C3887q.m11057i(Context.class)).mo26346b(C3887q.m11057i(C3344d.class)).mo26349e(C2192a.f3488a).mo26348d().mo26347c(), C3717h.m10602b("fire-analytics", "21.0.0")});
    }
}
