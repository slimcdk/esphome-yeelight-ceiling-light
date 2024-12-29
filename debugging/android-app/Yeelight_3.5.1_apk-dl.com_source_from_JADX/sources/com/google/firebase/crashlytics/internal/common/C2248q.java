package com.google.firebase.crashlytics.internal.common;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.gms.tasks.C1872a;
import com.google.firebase.C2406d;
import java.util.concurrent.Executor;
import p065m0.C3339g;
import p118y0.C3916f;

/* renamed from: com.google.firebase.crashlytics.internal.common.q */
public class C2248q {

    /* renamed from: a */
    private final SharedPreferences f3630a;

    /* renamed from: b */
    private final C2406d f3631b;

    /* renamed from: c */
    private final Object f3632c;

    /* renamed from: d */
    C1872a<Void> f3633d = new C1872a<>();

    /* renamed from: e */
    private boolean f3634e = false;
    @Nullable

    /* renamed from: f */
    private Boolean f3635f;

    /* renamed from: g */
    private final C1872a<Void> f3636g = new C1872a<>();

    public C2248q(C2406d dVar) {
        Object obj = new Object();
        this.f3632c = obj;
        Context j = dVar.mo18983j();
        this.f3631b = dVar;
        this.f3630a = CommonUtils.m5549r(j);
        Boolean b = m5750b();
        this.f3635f = b == null ? m5749a(j) : b;
        synchronized (obj) {
            if (mo18607d()) {
                this.f3633d.mo14740e(null);
            }
        }
    }

    @Nullable
    /* renamed from: a */
    private Boolean m5749a(Context context) {
        Boolean f = m5752f(context);
        if (f == null) {
            this.f3634e = false;
            return null;
        }
        this.f3634e = true;
        return Boolean.valueOf(Boolean.TRUE.equals(f));
    }

    @Nullable
    /* renamed from: b */
    private Boolean m5750b() {
        if (!this.f3630a.contains("firebase_crashlytics_collection_enabled")) {
            return null;
        }
        this.f3634e = false;
        return Boolean.valueOf(this.f3630a.getBoolean("firebase_crashlytics_collection_enabled", true));
    }

    /* renamed from: e */
    private void m5751e(boolean z) {
        C3916f.m11190f().mo26399b(String.format("Crashlytics automatic data collection %s by %s.", new Object[]{z ? "ENABLED" : "DISABLED", this.f3635f == null ? "global Firebase setting" : this.f3634e ? "firebase_crashlytics_collection_enabled manifest flag" : "API"}));
    }

    @Nullable
    /* renamed from: f */
    private static Boolean m5752f(Context context) {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_crashlytics_collection_enabled")) {
                return null;
            }
            return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_crashlytics_collection_enabled"));
        } catch (PackageManager.NameNotFoundException e) {
            C3916f.m11190f().mo26402e("Could not read data collection permission from manifest", e);
            return null;
        }
    }

    /* renamed from: c */
    public void mo18606c(boolean z) {
        if (z) {
            this.f3636g.mo14740e(null);
            return;
        }
        throw new IllegalStateException("An invalid data collection token was used.");
    }

    /* renamed from: d */
    public synchronized boolean mo18607d() {
        boolean booleanValue;
        Boolean bool = this.f3635f;
        booleanValue = bool != null ? bool.booleanValue() : this.f3631b.mo18987s();
        m5751e(booleanValue);
        return booleanValue;
    }

    /* renamed from: g */
    public C3339g<Void> mo18608g() {
        C3339g<Void> a;
        synchronized (this.f3632c) {
            a = this.f3633d.mo14736a();
        }
        return a;
    }

    /* renamed from: h */
    public C3339g<Void> mo18609h(Executor executor) {
        return C2220g0.m5627i(executor, this.f3636g.mo14736a(), mo18608g());
    }
}
