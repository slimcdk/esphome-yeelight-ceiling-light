package com.xiaomi.mistatistic.sdk;

import com.xiaomi.mistatistic.sdk.controller.C4113c;
import com.xiaomi.mistatistic.sdk.controller.C4115d;
import com.xiaomi.mistatistic.sdk.controller.C4122f;
import com.xiaomi.mistatistic.sdk.controller.C4137k;
import com.xiaomi.mistatistic.sdk.controller.C4139l;

public class CustomSettings {

    /* renamed from: a */
    private static boolean f6977a = false;

    /* renamed from: b */
    private static boolean f6978b = false;

    /* renamed from: c */
    private static boolean f6979c = true;

    /* renamed from: d */
    private static boolean f6980d = false;

    /* renamed from: e */
    private static boolean f6981e = false;

    /* renamed from: com.xiaomi.mistatistic.sdk.CustomSettings$a */
    static class C4086a implements C4115d.C4118a {
        C4086a() {
        }

        /* renamed from: a */
        public void mo22986a() {
            new C4122f().mo23055c(System.currentTimeMillis() + 1000);
        }
    }

    public static void addCustomEvent(String str) {
        MiStatInterface.recordCustomEvent(str);
    }

    public static void clearData() {
        C4137k.m11209b(C4113c.m11105a());
        C4115d.m11118a().mo23037a((C4115d.C4118a) new C4086a());
    }

    public static void enableMultiProcess(String str) {
        C4122f.f7059b = true;
        C4122f.f7058a = str;
    }

    public static boolean isDataUploadingEnabled() {
        return f6979c;
    }

    public static boolean isUploadForegroundPackageEnabled() {
        return f6981e;
    }

    public static boolean isUploadInstalledPackageEnabled() {
        return f6980d;
    }

    public static boolean isUseSystemStatService() {
        return f6978b;
    }

    public static boolean isUseSystemUploadingService() {
        return f6977a;
    }

    public static void setAppVersion(String str) {
        C4113c.m11107a(str);
    }

    public static void setDataUploadingEnabled(boolean z) {
        f6979c = z;
        if (z) {
            new C4139l().mo23077a();
        }
    }

    public static void setPackageName(String str) {
        C4113c.m11109b(str);
    }

    public static void setUploadForegroundPackageEnabled(boolean z) {
        f6981e = z;
    }

    public static void setUploadInstalledPackageEnabled(boolean z) {
        f6980d = z;
    }

    public static void setUseSystemStatService(boolean z) {
        if (!z || (C4113c.m11105a().getApplicationInfo().flags & 1) != 0) {
            f6978b = z;
        }
    }

    public static void setUseSystemUploadingService(boolean z) {
        f6977a = z;
    }
}
