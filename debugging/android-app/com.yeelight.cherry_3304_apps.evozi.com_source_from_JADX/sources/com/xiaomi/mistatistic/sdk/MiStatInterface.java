package com.xiaomi.mistatistic.sdk;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.mipush.sdk.Constants;
import com.xiaomi.mistatistic.sdk.controller.C4102a;
import com.xiaomi.mistatistic.sdk.controller.C4113c;
import com.xiaomi.mistatistic.sdk.controller.C4115d;
import com.xiaomi.mistatistic.sdk.controller.C4120e;
import com.xiaomi.mistatistic.sdk.controller.C4122f;
import com.xiaomi.mistatistic.sdk.controller.C4130h;
import com.xiaomi.mistatistic.sdk.controller.C4139l;
import com.xiaomi.mistatistic.sdk.controller.C4145m;
import com.xiaomi.mistatistic.sdk.controller.C4150o;
import com.xiaomi.mistatistic.sdk.controller.C4154p;
import com.xiaomi.mistatistic.sdk.controller.C4162q;
import com.xiaomi.mistatistic.sdk.controller.LocalEventRecorder;
import com.xiaomi.mistatistic.sdk.controller.asyncjobs.C4105a;
import com.xiaomi.mistatistic.sdk.data.C4167c;
import com.xiaomi.mistatistic.sdk.data.C4168d;
import com.xiaomi.mistatistic.sdk.data.C4169e;
import com.xiaomi.mistatistic.sdk.data.C4171g;
import com.xiaomi.mistatistic.sdk.data.C4172h;
import java.util.Map;

public abstract class MiStatInterface {
    private static final String DEFAULT_CATEGORY = "default_category";
    public static final long MAX_UPLOAD_INTERVAL = 86400000;
    public static final long MIN_UPLOAD_INTERVAL = 60000;
    public static final int UPLOAD_POLICY_BATCH = 2;
    public static final int UPLOAD_POLICY_DEVELOPMENT = 5;
    public static final int UPLOAD_POLICY_INTERVAL = 4;
    public static final int UPLOAD_POLICY_REALTIME = 0;
    public static final int UPLOAD_POLICY_WHILE_INITIALIZE = 3;
    public static final int UPLOAD_POLICY_WIFI_ONLY = 1;
    private static boolean sABTestInitialized = false;
    private static boolean sInitialized = false;

    private static boolean checkABTestInitialized() {
        if (!sABTestInitialized) {
            C4130h.m11183d("ABTEST - ABTest  is not registed, do you forget to call ABTestRegister when application started?");
        }
        return sABTestInitialized;
    }

    private static void checkCategoryAndKey(String str, String str2) {
        if (!TextUtils.isEmpty(str) && str.startsWith("mistat_")) {
            throw new IllegalArgumentException("category cannot start with mistat_");
        } else if (!TextUtils.isEmpty(str2) && str2.startsWith("mistat_")) {
            throw new IllegalArgumentException("key cannot start with mistat_");
        }
    }

    private static void checkInitialized() {
        if (!sInitialized) {
            throw new IllegalStateException("not initialized, do you forget to call initialize when application started?");
        }
    }

    public static void enableExceptionCatcher(boolean z) {
        if (!isExceptionCatcherEnabled()) {
            C4094b.m11025a(false);
        }
        C4094b.m11022a(z ? 2 : 3);
    }

    public static void enableGlobalUpload(boolean z) {
        checkInitialized();
        if (!C4162q.m11300d(C4113c.m11105a())) {
            C4162q.m11289a(z);
        }
    }

    public static final void enableLog() {
        C4130h.m11169a();
    }

    public static String getABTestControlValue(int i, String str, String str2) {
        checkInitialized();
        return !checkABTestInitialized() ? str2 : C4102a.m11048a().mo23023a(i, str, str2);
    }

    public static final String getDeviceID(Context context) {
        return new C4120e().mo23042a();
    }

    public static final int getUploadPolicy() {
        checkInitialized();
        return C4154p.m11271a().mo23103g();
    }

    public static final void initialize(Context context, String str, String str2, String str3) {
        initialize(context, str, str2, str3, false);
    }

    public static final void initialize(Context context, String str, String str2, String str3, boolean z) {
        String.format("initialize %s, %s, %s, %s", new Object[]{context.getPackageName(), str, str3, Boolean.valueOf(z)});
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            throw new IllegalArgumentException("appID or appKey is empty.");
        }
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        if (TextUtils.isEmpty(str3)) {
            str3 = "mistats_default";
        }
        C4113c.m11106a(context, str, str2, str3);
        C4122f.m11132a();
        new C4120e().mo23042a();
        C4154p.m11271a().mo23098b();
        sInitialized = true;
        if (z) {
            URLStatsRecorder.enableAutoRecord();
        }
    }

    private static boolean isApkDebugable(Context context) {
        try {
            return (context.getApplicationInfo().flags & 2) != 0;
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean isExceptionCatcherEnabled() {
        return C4094b.m11028d() != 1;
    }

    public static void recordABTestCalculateEvent(int i, String str, long j) {
        checkInitialized();
        if (checkABTestInitialized()) {
            C4102a.m11048a().mo23025a(str, j, i);
            C4105a.m11074b();
        }
    }

    public static void recordABTestCountEvent(int i, String str) {
        checkInitialized();
        if (checkABTestInitialized()) {
            C4102a.m11048a().mo23024a(str, i);
        }
    }

    public static void recordABTestNumericEvent(int i, String str, long j) {
        checkInitialized();
        if (checkABTestInitialized()) {
            C4102a.m11048a().mo23028b(str, j, i);
            C4105a.m11074b();
        }
    }

    public static void recordABTestStringPropertyEvent(int i, String str, String str2) {
        checkInitialized();
        if (checkABTestInitialized()) {
            C4102a.m11048a().mo23026a(str, str2, i);
            C4105a.m11074b();
        }
    }

    public static final void recordCalculateEvent(String str, String str2, long j) {
        recordCalculateEvent(str, str2, j, (Map<String, String>) null);
    }

    public static final void recordCalculateEvent(String str, String str2, long j, Map<String, String> map) {
        checkInitialized();
        checkCategoryAndKey(str, str2);
        if (TextUtils.isEmpty(str)) {
            str = DEFAULT_CATEGORY;
        }
        LocalEventRecorder.insertEvent(new C4167c(str, str2, j, map));
        C4105a.m11074b();
    }

    public static final void recordCountEvent(String str, String str2) {
        recordCountEvent(str, str2, (Map<String, String>) null);
    }

    public static final void recordCountEvent(String str, String str2, Map<String, String> map) {
        checkInitialized();
        checkCategoryAndKey(str, str2);
        if (TextUtils.isEmpty(str)) {
            str = DEFAULT_CATEGORY;
        }
        LocalEventRecorder.insertEvent(new C4169e(str, str2, map));
        C4105a.m11074b();
    }

    protected static void recordCustomEvent(String str) {
        checkInitialized();
        if (!TextUtils.isEmpty(str)) {
            LocalEventRecorder.insertEvent(new C4168d(str));
        }
        C4105a.m11074b();
    }

    public static void recordException(final Throwable th) {
        C4115d.m11120b().mo23037a((C4115d.C4118a) new C4115d.C4118a() {
            /* renamed from: a */
            public void mo22986a() {
                new C4094b().mo23015a(Thread.currentThread(), th);
            }
        });
        C4105a.m11074b();
    }

    public static final void recordNumericPropertyEvent(String str, String str2, long j) {
        checkInitialized();
        checkCategoryAndKey(str, str2);
        if (TextUtils.isEmpty(str)) {
            str = DEFAULT_CATEGORY;
        }
        LocalEventRecorder.insertEvent(new C4171g(str, str2, j));
        C4105a.m11074b();
    }

    public static final void recordPageEnd() {
        recordPageEnd((Context) null, "");
    }

    public static final void recordPageEnd(Context context, String str) {
        checkInitialized();
        C4145m.m11235a().mo23079a(context, str);
        C4150o a = C4150o.m11251a();
        if (a.mo23087e()) {
            a.mo23088f();
        }
    }

    public static final void recordPageStart(Activity activity, String str) {
        checkInitialized();
        C4115d.m11118a().mo23037a((C4115d.C4118a) new C4105a());
        C4145m.m11235a().mo23080a((Context) activity, replaceComma(str), "");
        C4150o a = C4150o.m11251a();
        if (a.mo23084b()) {
            a.mo23082a(activity);
        }
    }

    public static final void recordPageStart(Context context, String str) {
        recordPageStart(context, str, "");
    }

    public static final void recordPageStart(Context context, String str, String str2) {
        checkInitialized();
        if (!TextUtils.isEmpty(str) || (context instanceof Activity)) {
            C4115d.m11118a().mo23037a((C4115d.C4118a) new C4105a());
            C4145m.m11235a().mo23080a(context, replaceComma(str), replaceComma(str2));
            if (context instanceof Activity) {
                C4150o a = C4150o.m11251a();
                if (a.mo23084b()) {
                    a.mo23082a((Activity) context);
                    return;
                }
                return;
            }
            return;
        }
        throw new IllegalArgumentException("pageName should't be null");
    }

    public static final void recordStringPropertyEvent(String str, String str2, String str3) {
        checkInitialized();
        checkCategoryAndKey(str, str2);
        if (TextUtils.isEmpty(str)) {
            str = DEFAULT_CATEGORY;
        }
        LocalEventRecorder.insertEvent(new C4172h(str, str2, str3));
        C4105a.m11074b();
    }

    public static void registerABTest(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        if (C4162q.m11292a(context)) {
            C4102a.m11048a().mo23027b();
            sABTestInitialized = true;
        }
    }

    private static final String replaceComma(String str) {
        return TextUtils.isEmpty(str) ? "" : str.contains(Constants.ACCEPT_TIME_SEPARATOR_SP) ? str.replace(Constants.ACCEPT_TIME_SEPARATOR_SP, "") : str;
    }

    public static final void setABTestGroupManually(int i, String str, String str2) {
        checkInitialized();
        if (checkABTestInitialized()) {
            C4102a.m11048a().mo23029b(str, str2, i);
        }
    }

    public static final void setUploadPolicy(int i, long j) {
        checkInitialized();
        if (i != 4 || (j >= MIN_UPLOAD_INTERVAL && j <= MAX_UPLOAD_INTERVAL)) {
            C4154p.m11271a().mo23097a(i, j);
            return;
        }
        throw new IllegalArgumentException("interval should be set between 1 minutes and 1 day");
    }

    public static boolean shouldExceptionUploadImmediately() {
        return C4094b.m11028d() == 2;
    }

    private static void throwExceptionIfDebuggable() {
        C4130h.m11172a("log event without pageStart/pageEnd, ignore.");
        if (isApkDebugable(C4113c.m11105a())) {
            throw new RuntimeException("record pageStart/pageEnd before recording events.");
        }
    }

    public static final void triggerUploadManually() {
        checkInitialized();
        new C4139l().mo23077a();
    }
}
