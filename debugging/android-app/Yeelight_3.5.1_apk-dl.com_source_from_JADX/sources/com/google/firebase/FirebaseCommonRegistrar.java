package com.google.firebase;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import com.google.firebase.heartbeatinfo.C2426b;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.p194io.IOUtils;
import p103u1.C3713c;
import p103u1.C3715e;
import p103u1.C3717h;
import p110w0.C3870d;
import p110w0.C3879i;

public class FirebaseCommonRegistrar implements C3879i {
    /* access modifiers changed from: private */
    /* renamed from: e */
    public static /* synthetic */ String m5488e(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        return applicationInfo != null ? String.valueOf(applicationInfo.targetSdkVersion) : "";
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public static /* synthetic */ String m5489f(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        return (applicationInfo == null || Build.VERSION.SDK_INT < 24) ? "" : String.valueOf(applicationInfo.minSdkVersion);
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public static /* synthetic */ String m5490g(Context context) {
        int i = Build.VERSION.SDK_INT;
        return (i < 16 || !context.getPackageManager().hasSystemFeature("android.hardware.type.television")) ? (i < 20 || !context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) ? (i < 23 || !context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) ? (i < 26 || !context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) ? "" : "embedded" : "auto" : "watch" : "tv";
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public static /* synthetic */ String m5491h(Context context) {
        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
        return installerPackageName != null ? m5492i(installerPackageName) : "";
    }

    /* renamed from: i */
    private static String m5492i(String str) {
        return str.replace(' ', '_').replace(IOUtils.DIR_SEPARATOR_UNIX, '_');
    }

    public List<C3870d<?>> getComponents() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(C3713c.m10591c());
        arrayList.add(C2426b.m6472g());
        arrayList.add(C3717h.m10602b("fire-android", String.valueOf(Build.VERSION.SDK_INT)));
        arrayList.add(C3717h.m10602b("fire-core", "20.1.1"));
        arrayList.add(C3717h.m10602b("device-name", m5492i(Build.PRODUCT)));
        arrayList.add(C3717h.m10602b("device-model", m5492i(Build.DEVICE)));
        arrayList.add(C3717h.m10602b("device-brand", m5492i(Build.BRAND)));
        arrayList.add(C3717h.m10603c("android-target-sdk", C2422f.f4070a));
        arrayList.add(C3717h.m10603c("android-min-sdk", C2423g.f4071a));
        arrayList.add(C3717h.m10603c("android-platform", C2424h.f4072a));
        arrayList.add(C3717h.m10603c("android-installer", C2412e.f4043a));
        String a = C3715e.m10597a();
        if (a != null) {
            arrayList.add(C3717h.m10602b("kotlin", a));
        }
        return arrayList;
    }
}
