package com.google.android.gms.measurement.internal;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.MainThread;

@TargetApi(14)
@MainThread
/* renamed from: com.google.android.gms.measurement.internal.s7 */
final class C1779s7 implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a */
    final /* synthetic */ C1791t7 f2662a;

    /* synthetic */ C1779s7(C1791t7 t7Var, C1767r7 r7Var) {
        this.f2662a = t7Var;
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        try {
            this.f2662a.f2143a.mo14228b().mo14039v().mo14693a("onActivityCreated");
            Intent intent = activity.getIntent();
            if (intent != null) {
                Uri data = intent.getData();
                if (data != null) {
                    if (data.isHierarchical()) {
                        this.f2662a.f2143a.mo14382N();
                        String stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
                        boolean z = true;
                        String str = true != ("android-app://com.google.android.googlequicksearchbox/https/www.google.com".equals(stringExtra) || "https://www.google.com".equals(stringExtra) || "android-app://com.google.appcrawler".equals(stringExtra)) ? "auto" : "gs";
                        String queryParameter = data.getQueryParameter("referrer");
                        if (bundle != null) {
                            z = false;
                        }
                        this.f2662a.f2143a.mo14227a().mo14310z(new C1755q7(this, z, data, str, queryParameter));
                    }
                }
            }
        } catch (RuntimeException e) {
            this.f2662a.f2143a.mo14228b().mo14035r().mo14694b("Throwable caught in onActivityCreated", e);
        } catch (Throwable th) {
            this.f2662a.f2143a.mo14379K().mo14267z(activity, bundle);
            throw th;
        }
        this.f2662a.f2143a.mo14379K().mo14267z(activity, bundle);
    }

    public final void onActivityDestroyed(Activity activity) {
        this.f2662a.f2143a.mo14379K().mo14257A(activity);
    }

    @MainThread
    public final void onActivityPaused(Activity activity) {
        this.f2662a.f2143a.mo14379K().mo14258B(activity);
        C1865z9 M = this.f2662a.f2143a.mo14381M();
        M.f2143a.mo14227a().mo14310z(new C1781s9(M, M.f2143a.mo14229c().mo11030b()));
    }

    @MainThread
    public final void onActivityResumed(Activity activity) {
        C1865z9 M = this.f2662a.f2143a.mo14381M();
        M.f2143a.mo14227a().mo14310z(new C1769r9(M, M.f2143a.mo14229c().mo11030b()));
        this.f2662a.f2143a.mo14379K().mo14259C(activity);
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        this.f2662a.f2143a.mo14379K().mo14260D(activity, bundle);
    }

    public final void onActivityStarted(Activity activity) {
    }

    public final void onActivityStopped(Activity activity) {
    }
}
