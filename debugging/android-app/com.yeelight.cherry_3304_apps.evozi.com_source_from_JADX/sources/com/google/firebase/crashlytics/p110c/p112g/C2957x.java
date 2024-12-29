package com.google.firebase.crashlytics.p110c.p112g;

import android.content.Context;

/* renamed from: com.google.firebase.crashlytics.c.g.x */
class C2957x {

    /* renamed from: a */
    private String f5751a;

    C2957x() {
    }

    /* renamed from: b */
    private static String m9066b(Context context) {
        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
        return installerPackageName == null ? "" : installerPackageName;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized String mo17300a(Context context) {
        if (this.f5751a == null) {
            this.f5751a = m9066b(context);
        }
        return "".equals(this.f5751a) ? null : this.f5751a;
    }
}
