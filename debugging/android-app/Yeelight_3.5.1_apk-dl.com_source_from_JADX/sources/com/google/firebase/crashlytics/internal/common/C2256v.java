package com.google.firebase.crashlytics.internal.common;

import android.content.Context;

/* renamed from: com.google.firebase.crashlytics.internal.common.v */
class C2256v {

    /* renamed from: a */
    private String f3655a;

    C2256v() {
    }

    /* renamed from: b */
    private static String m5782b(Context context) {
        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
        return installerPackageName == null ? "" : installerPackageName;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized String mo18617a(Context context) {
        if (this.f3655a == null) {
            this.f3655a = m5782b(context);
        }
        return "".equals(this.f3655a) ? null : this.f3655a;
    }
}
