package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.ServiceInfo;
import android.text.TextUtils;
import com.xiaomi.channel.commonutils.logger.C3989b;
import com.xiaomi.clientreport.data.Config;
import com.xiaomi.clientreport.manager.C3992a;
import com.xiaomi.clientreport.manager.ClientReportClient;
import com.xiaomi.mistatistic.sdk.MiStatInterface;
import com.xiaomi.push.C4498ai;
import com.xiaomi.push.C4516au;
import com.xiaomi.push.C4532bf;
import com.xiaomi.push.C4610dq;
import com.xiaomi.push.C4611dr;
import com.xiaomi.push.C4657ey;
import com.xiaomi.push.C4658ez;
import com.xiaomi.push.C4660fa;
import com.xiaomi.push.C4668fg;
import com.xiaomi.push.C4689g;
import com.xiaomi.push.C4739hm;
import com.xiaomi.push.C4743hq;
import com.xiaomi.push.C4744hr;
import com.xiaomi.push.C4749hw;
import com.xiaomi.push.C4752hz;
import com.xiaomi.push.C4753i;
import com.xiaomi.push.C4754ia;
import com.xiaomi.push.C4760ig;
import com.xiaomi.push.C4765il;
import com.xiaomi.push.C4766im;
import com.xiaomi.push.C4770iq;
import com.xiaomi.push.C4772is;
import com.xiaomi.push.C4774iu;
import com.xiaomi.push.C4808l;
import com.xiaomi.push.C4815r;
import com.xiaomi.push.C4937t;
import com.xiaomi.push.service.C4854ak;
import com.xiaomi.push.service.C4858an;
import com.xiaomi.push.service.receivers.NetworkStatusReceiver;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;

public abstract class MiPushClient {
    public static final String COMMAND_REGISTER = "register";
    public static final String COMMAND_SET_ACCEPT_TIME = "accept-time";
    public static final String COMMAND_SET_ACCOUNT = "set-account";
    public static final String COMMAND_SET_ALIAS = "set-alias";
    public static final String COMMAND_SUBSCRIBE_TOPIC = "subscribe-topic";
    public static final String COMMAND_UNREGISTER = "unregister";
    public static final String COMMAND_UNSET_ACCOUNT = "unset-account";
    public static final String COMMAND_UNSET_ALIAS = "unset-alias";
    public static final String COMMAND_UNSUBSCRIBE_TOPIC = "unsubscibe-topic";
    public static final String PREF_EXTRA = "mipush_extra";
    private static boolean isCrashHandlerSuggested = false;
    /* access modifiers changed from: private */
    public static Context sContext;
    private static long sCurMsgId = System.currentTimeMillis();

    public static class CodeResult {
        private long resultCode = -1;

        public long getResultCode() {
            return this.resultCode;
        }

        /* access modifiers changed from: protected */
        public void setResultCode(long j) {
            this.resultCode = j;
        }
    }

    public interface ICallbackResult<R> {
        void onResult(R r);
    }

    @Deprecated
    public static abstract class MiPushClientCallback {
        private String category;

        /* access modifiers changed from: protected */
        public String getCategory() {
            return this.category;
        }

        public void onCommandResult(String str, long j, String str2, List<String> list) {
        }

        public void onInitializeResult(long j, String str, String str2) {
        }

        public void onReceiveMessage(MiPushMessage miPushMessage) {
        }

        public void onReceiveMessage(String str, String str2, String str3, boolean z) {
        }

        public void onSubscribeResult(long j, String str, String str2) {
        }

        public void onUnsubscribeResult(long j, String str, String str2) {
        }

        /* access modifiers changed from: protected */
        public void setCategory(String str) {
            this.category = str;
        }
    }

    public static class TokenResult {
        private long resultCode = -1;
        private String token = null;

        public long getResultCode() {
            return this.resultCode;
        }

        public String getToken() {
            return this.token;
        }

        /* access modifiers changed from: protected */
        public void setResultCode(long j) {
            this.resultCode = j;
        }

        /* access modifiers changed from: protected */
        public void setToken(String str) {
            this.token = str;
        }
    }

    public interface UPSRegisterCallBack extends ICallbackResult<TokenResult> {
    }

    public interface UPSTurnCallBack extends ICallbackResult<CodeResult> {
    }

    public interface UPSUnRegisterCallBack extends ICallbackResult<TokenResult> {
    }

    private static boolean acceptTimeSet(Context context, String str, String str2) {
        String acceptTime = getAcceptTime(context);
        return TextUtils.equals(acceptTime, str + Constants.ACCEPT_TIME_SEPARATOR_SP + str2);
    }

    public static long accountSetTime(Context context, String str) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("mipush_extra", 0);
        return sharedPreferences.getLong("account_" + str, -1);
    }

    static synchronized void addAcceptTime(Context context, String str, String str2) {
        synchronized (MiPushClient.class) {
            SharedPreferences.Editor edit = context.getSharedPreferences("mipush_extra", 0).edit();
            edit.putString(Constants.EXTRA_KEY_ACCEPT_TIME, str + Constants.ACCEPT_TIME_SEPARATOR_SP + str2);
            C4815r.m15379a(edit);
        }
    }

    static synchronized void addAccount(Context context, String str) {
        synchronized (MiPushClient.class) {
            SharedPreferences.Editor edit = context.getSharedPreferences("mipush_extra", 0).edit();
            edit.putLong("account_" + str, System.currentTimeMillis()).commit();
        }
    }

    static synchronized void addAlias(Context context, String str) {
        synchronized (MiPushClient.class) {
            SharedPreferences.Editor edit = context.getSharedPreferences("mipush_extra", 0).edit();
            edit.putLong("alias_" + str, System.currentTimeMillis()).commit();
        }
    }

    private static void addPullNotificationTime(Context context) {
        SharedPreferences.Editor edit = context.getSharedPreferences("mipush_extra", 0).edit();
        edit.putLong("last_pull_notification", System.currentTimeMillis());
        C4815r.m15379a(edit);
    }

    private static void addRegRequestTime(Context context) {
        SharedPreferences.Editor edit = context.getSharedPreferences("mipush_extra", 0).edit();
        edit.putLong("last_reg_request", System.currentTimeMillis());
        C4815r.m15379a(edit);
    }

    static synchronized void addTopic(Context context, String str) {
        synchronized (MiPushClient.class) {
            SharedPreferences.Editor edit = context.getSharedPreferences("mipush_extra", 0).edit();
            edit.putLong("topic_" + str, System.currentTimeMillis()).commit();
        }
    }

    public static long aliasSetTime(Context context, String str) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("mipush_extra", 0);
        return sharedPreferences.getLong("alias_" + str, -1);
    }

    public static void awakeApps(final Context context, final String[] strArr) {
        C4498ai.m13271a(context).mo24725a((Runnable) new Runnable() {
            public void run() {
                try {
                    for (String str : strArr) {
                        if (!TextUtils.isEmpty(str)) {
                            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(str, 4);
                            if (packageInfo != null) {
                                MiPushClient.awakePushServiceByPackageInfo(context, packageInfo);
                            }
                        }
                    }
                } catch (Throwable th) {
                    C3989b.m10678a(th);
                }
            }
        });
    }

    /* access modifiers changed from: private */
    public static void awakePushServiceByPackageInfo(Context context, PackageInfo packageInfo) {
        ServiceInfo[] serviceInfoArr = packageInfo.services;
        if (serviceInfoArr != null) {
            int length = serviceInfoArr.length;
            int i = 0;
            while (i < length) {
                ServiceInfo serviceInfo = serviceInfoArr[i];
                if (!serviceInfo.exported || !serviceInfo.enabled || !"com.xiaomi.mipush.sdk.PushMessageHandler".equals(serviceInfo.name) || context.getPackageName().equals(serviceInfo.packageName)) {
                    i++;
                } else {
                    try {
                        Thread.sleep(((long) ((Math.random() * 2.0d) + 1.0d)) * 1000);
                        Intent intent = new Intent();
                        intent.setClassName(serviceInfo.packageName, serviceInfo.name);
                        intent.setAction("com.xiaomi.mipush.sdk.WAKEUP");
                        intent.putExtra("waker_pkgname", context.getPackageName());
                        PushMessageHandler.m10776a(context, intent);
                        return;
                    } catch (Throwable unused) {
                        return;
                    }
                }
            }
        }
    }

    private static void checkNotNull(Object obj, String str) {
        if (obj == null) {
            throw new IllegalArgumentException("param " + str + " is not nullable");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0047, code lost:
        if (com.xiaomi.push.C4516au.m13333a(r5).mo24744a() == false) goto L_0x005f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x005c, code lost:
        if (android.text.TextUtils.isEmpty(r4) != false) goto L_0x005f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0062  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean checkPermission(android.content.Context r5) {
        /*
            java.lang.String r0 = "android.permission.WRITE_EXTERNAL_STORAGE"
            java.lang.String r1 = "android.permission.READ_PHONE_STATE"
            r2 = 1
            if (r5 == 0) goto L_0x005f
            boolean r3 = com.xiaomi.push.C4808l.m15356a()
            if (r3 != 0) goto L_0x0060
            java.lang.String r3 = r5.getPackageName()
            java.lang.String r4 = "com.xiaomi.xmsf"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L_0x001a
            goto L_0x0060
        L_0x001a:
            java.lang.String r3 = com.xiaomi.push.C4753i.m14747b((android.content.Context) r5)
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L_0x0025
            goto L_0x0060
        L_0x0025:
            android.content.pm.ApplicationInfo r3 = r5.getApplicationInfo()
            int r3 = r3.targetSdkVersion
            r4 = 23
            if (r3 < r4) goto L_0x004a
            int r3 = android.os.Build.VERSION.SDK_INT
            if (r3 < r4) goto L_0x004a
            boolean r3 = com.xiaomi.push.C4809m.m15367a(r5, r1)
            if (r3 != 0) goto L_0x0060
            boolean r3 = com.xiaomi.push.C4809m.m15367a(r5, r0)
            if (r3 != 0) goto L_0x0060
            com.xiaomi.push.au r3 = com.xiaomi.push.C4516au.m13333a((android.content.Context) r5)
            boolean r3 = r3.mo24744a()
            if (r3 == 0) goto L_0x005f
            goto L_0x0060
        L_0x004a:
            java.lang.String r3 = com.xiaomi.push.C4753i.m14760f(r5)
            java.lang.String r4 = com.xiaomi.push.C4753i.m14735a()
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 == 0) goto L_0x0060
            boolean r3 = android.text.TextUtils.isEmpty(r4)
            if (r3 != 0) goto L_0x005f
            goto L_0x0060
        L_0x005f:
            r2 = 0
        L_0x0060:
            if (r2 != 0) goto L_0x00b3
            java.lang.String r3 = "Because of lack of necessary information, mi push can't be initialized"
            com.xiaomi.channel.commonutils.logger.C3989b.m10681d(r3)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            boolean r4 = com.xiaomi.push.C4809m.m15367a(r5, r1)
            if (r4 != 0) goto L_0x0075
            r3.add(r1)
        L_0x0075:
            boolean r1 = com.xiaomi.push.C4809m.m15367a(r5, r0)
            if (r1 != 0) goto L_0x007e
            r3.add(r0)
        L_0x007e:
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L_0x00b3
            int r0 = r3.size()
            java.lang.String[] r0 = new java.lang.String[r0]
            r3.toArray(r0)
            android.content.Intent r1 = new android.content.Intent
            r1.<init>()
            java.lang.String r3 = "com.xiaomi.mipush.ERROR"
            r1.setAction(r3)
            java.lang.String r3 = r5.getPackageName()
            r1.setPackage(r3)
            r3 = 5
            java.lang.String r4 = "message_type"
            r1.putExtra(r4, r3)
            java.lang.String r3 = "error_type"
            java.lang.String r4 = "error_lack_of_permission"
            r1.putExtra(r3, r4)
            java.lang.String r3 = "error_message"
            r1.putExtra(r3, r0)
            r5.sendBroadcast(r1)
        L_0x00b3:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.mipush.sdk.MiPushClient.checkPermission(android.content.Context):boolean");
    }

    protected static void clearExtras(Context context) {
        SharedPreferences.Editor edit = context.getSharedPreferences("mipush_extra", 0).edit();
        edit.clear();
        edit.commit();
    }

    public static void clearLocalNotificationType(Context context) {
        C4047aq.m10835a(context).mo22924e();
    }

    public static void clearNotification(Context context) {
        C4047aq.m10835a(context).mo22904a(-1);
    }

    public static void clearNotification(Context context, int i) {
        C4047aq.m10835a(context).mo22904a(i);
    }

    public static void clearNotification(Context context, String str, String str2) {
        C4047aq.m10835a(context).mo22917a(str, str2);
    }

    public static void disablePush(Context context) {
        C4047aq.m10835a(context).mo22918a(true);
    }

    public static void enablePush(Context context) {
        C4047aq.m10835a(context).mo22918a(false);
    }

    private static void forceHandleCrash() {
        boolean a = C4854ak.m15568a(sContext).mo25911a(C4744hr.ForceHandleCrashSwitch.mo25291a(), false);
        if (!isCrashHandlerSuggested && a) {
            Thread.setDefaultUncaughtExceptionHandler(new C4078v(sContext));
        }
    }

    protected static String getAcceptTime(Context context) {
        return context.getSharedPreferences("mipush_extra", 0).getString(Constants.EXTRA_KEY_ACCEPT_TIME, "00:00-23:59");
    }

    public static List<String> getAllAlias(Context context) {
        ArrayList arrayList = new ArrayList();
        for (String next : context.getSharedPreferences("mipush_extra", 0).getAll().keySet()) {
            if (next.startsWith("alias_")) {
                arrayList.add(next.substring(6));
            }
        }
        return arrayList;
    }

    public static List<String> getAllTopic(Context context) {
        ArrayList arrayList = new ArrayList();
        for (String next : context.getSharedPreferences("mipush_extra", 0).getAll().keySet()) {
            if (next.startsWith("topic_") && !next.contains("**ALL**")) {
                arrayList.add(next.substring(6));
            }
        }
        return arrayList;
    }

    public static List<String> getAllUserAccount(Context context) {
        ArrayList arrayList = new ArrayList();
        for (String next : context.getSharedPreferences("mipush_extra", 0).getAll().keySet()) {
            if (next.startsWith("account_")) {
                arrayList.add(next.substring(8));
            }
        }
        return arrayList;
    }

    public static String getAppRegion(Context context) {
        if (C4056b.m10888a(context).mo22940c()) {
            return C4056b.m10888a(context).mo22943f();
        }
        return null;
    }

    private static boolean getDefaultSwitch() {
        return C4808l.m15363b();
    }

    protected static boolean getOpenFCMPush(Context context) {
        checkNotNull(context, "context");
        return C4060e.m10932a(context).mo22958b(C4059d.ASSEMBLE_PUSH_FCM);
    }

    protected static boolean getOpenHmsPush(Context context) {
        checkNotNull(context, "context");
        return C4060e.m10932a(context).mo22958b(C4059d.ASSEMBLE_PUSH_HUAWEI);
    }

    protected static boolean getOpenOPPOPush(Context context) {
        checkNotNull(context, "context");
        return C4060e.m10932a(context).mo22958b(C4059d.ASSEMBLE_PUSH_COS);
    }

    protected static boolean getOpenVIVOPush(Context context) {
        return C4060e.m10932a(context).mo22958b(C4059d.ASSEMBLE_PUSH_FTOS);
    }

    public static String getRegId(Context context) {
        if (C4056b.m10888a(context).mo22940c()) {
            return C4056b.m10888a(context).mo22940c();
        }
        return null;
    }

    private static void initEventPerfLogic(final Context context) {
        C4660fa.m14149a((C4660fa.C4661a) new C4660fa.C4661a() {
            public void uploader(Context context, C4743hq hqVar) {
                MiTinyDataClient.upload(context, hqVar);
            }
        });
        Config a = C4660fa.m14137a(context);
        C3992a.m10684a(context).mo22728a("3_7_5");
        ClientReportClient.init(context, a, new C4657ey(context), new C4658ez(context));
        C4030a.m10793a(context);
        C4074r.m10978a(context, a);
        C4854ak.m15568a(context).mo25909a((C4854ak.C4855a) new C4854ak.C4855a(100, "perf event job update") {
            /* access modifiers changed from: protected */
            public void onCallback() {
                C4660fa.m14137a(context);
            }
        });
    }

    @Deprecated
    public static void initialize(Context context, String str, String str2, MiPushClientCallback miPushClientCallback) {
        initialize(context, str, str2, miPushClientCallback, (String) null, (ICallbackResult) null);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x031b A[Catch:{ all -> 0x0332 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void initialize(android.content.Context r17, java.lang.String r18, java.lang.String r19, com.xiaomi.mipush.sdk.MiPushClient.MiPushClientCallback r20, java.lang.String r21, com.xiaomi.mipush.sdk.MiPushClient.ICallbackResult r22) {
        /*
            r0 = r18
            r1 = r19
            r2 = r20
            java.lang.String r3 = "update_devId"
            java.lang.String r4 = "sdk_version = 3_7_5"
            com.xiaomi.channel.commonutils.logger.C3989b.m10669a((java.lang.String) r4)     // Catch:{ all -> 0x0332 }
            if (r2 == 0) goto L_0x0012
            com.xiaomi.mipush.sdk.PushMessageHandler.m10784a((com.xiaomi.mipush.sdk.MiPushClient.MiPushClientCallback) r20)     // Catch:{ all -> 0x0332 }
        L_0x0012:
            if (r22 == 0) goto L_0x0017
            com.xiaomi.mipush.sdk.PushMessageHandler.m10783a((com.xiaomi.mipush.sdk.MiPushClient.ICallbackResult) r22)     // Catch:{ all -> 0x0332 }
        L_0x0017:
            android.content.Context r4 = sContext     // Catch:{ all -> 0x0332 }
            boolean r4 = com.xiaomi.push.C4937t.m15869a((android.content.Context) r4)     // Catch:{ all -> 0x0332 }
            if (r4 == 0) goto L_0x0024
            android.content.Context r4 = sContext     // Catch:{ all -> 0x0332 }
            com.xiaomi.mipush.sdk.C4080x.m10995a(r4)     // Catch:{ all -> 0x0332 }
        L_0x0024:
            android.content.Context r4 = sContext     // Catch:{ all -> 0x0332 }
            com.xiaomi.mipush.sdk.b r4 = com.xiaomi.mipush.sdk.C4056b.m10888a((android.content.Context) r4)     // Catch:{ all -> 0x0332 }
            boolean r4 = r4.mo22936a((java.lang.String) r0, (java.lang.String) r1)     // Catch:{ all -> 0x0332 }
            if (r4 != 0) goto L_0x0039
            android.content.Context r4 = sContext     // Catch:{ all -> 0x0332 }
            boolean r4 = checkPermission(r4)     // Catch:{ all -> 0x0332 }
            if (r4 != 0) goto L_0x0039
            return
        L_0x0039:
            android.content.Context r4 = sContext     // Catch:{ all -> 0x0332 }
            com.xiaomi.mipush.sdk.b r4 = com.xiaomi.mipush.sdk.C4056b.m10888a((android.content.Context) r4)     // Catch:{ all -> 0x0332 }
            int r4 = r4.mo22930a()     // Catch:{ all -> 0x0332 }
            int r5 = com.xiaomi.mipush.sdk.Constants.m10746a()     // Catch:{ all -> 0x0332 }
            r6 = 1
            r7 = 0
            if (r4 == r5) goto L_0x004d
            r4 = 1
            goto L_0x004e
        L_0x004d:
            r4 = 0
        L_0x004e:
            if (r4 != 0) goto L_0x0067
            android.content.Context r5 = sContext     // Catch:{ all -> 0x0332 }
            boolean r5 = shouldSendRegRequest(r5)     // Catch:{ all -> 0x0332 }
            if (r5 != 0) goto L_0x0067
            android.content.Context r0 = sContext     // Catch:{ all -> 0x0332 }
            com.xiaomi.mipush.sdk.aq r0 = com.xiaomi.mipush.sdk.C4047aq.m10835a((android.content.Context) r0)     // Catch:{ all -> 0x0332 }
            r0.mo22903a()     // Catch:{ all -> 0x0332 }
            java.lang.String r0 = "Could not send  register message within 5s repeatly ."
            com.xiaomi.channel.commonutils.logger.C3989b.m10669a((java.lang.String) r0)     // Catch:{ all -> 0x0332 }
            return
        L_0x0067:
            r5 = 30705(0x77f1, float:4.3027E-41)
            java.lang.String r8 = "3_7_5"
            if (r4 != 0) goto L_0x020c
            android.content.Context r9 = sContext     // Catch:{ all -> 0x0332 }
            com.xiaomi.mipush.sdk.b r9 = com.xiaomi.mipush.sdk.C4056b.m10888a((android.content.Context) r9)     // Catch:{ all -> 0x0332 }
            boolean r9 = r9.mo22936a((java.lang.String) r0, (java.lang.String) r1)     // Catch:{ all -> 0x0332 }
            if (r9 == 0) goto L_0x020c
            android.content.Context r9 = sContext     // Catch:{ all -> 0x0332 }
            com.xiaomi.mipush.sdk.b r9 = com.xiaomi.mipush.sdk.C4056b.m10888a((android.content.Context) r9)     // Catch:{ all -> 0x0332 }
            boolean r9 = r9.mo22942e()     // Catch:{ all -> 0x0332 }
            if (r9 != 0) goto L_0x020c
            android.content.Context r1 = sContext     // Catch:{ all -> 0x0332 }
            int r1 = com.xiaomi.mipush.sdk.PushMessageHelper.getPushMode(r1)     // Catch:{ all -> 0x0332 }
            r4 = 0
            if (r6 != r1) goto L_0x00a3
            java.lang.String r1 = "callback"
            checkNotNull(r2, r1)     // Catch:{ all -> 0x0332 }
            r9 = 0
            android.content.Context r1 = sContext     // Catch:{ all -> 0x0332 }
            com.xiaomi.mipush.sdk.b r1 = com.xiaomi.mipush.sdk.C4056b.m10888a((android.content.Context) r1)     // Catch:{ all -> 0x0332 }
            java.lang.String r1 = r1.mo22940c()     // Catch:{ all -> 0x0332 }
            r2.onInitializeResult(r9, r4, r1)     // Catch:{ all -> 0x0332 }
            goto L_0x00c7
        L_0x00a3:
            java.util.ArrayList r12 = new java.util.ArrayList     // Catch:{ all -> 0x0332 }
            r12.<init>()     // Catch:{ all -> 0x0332 }
            android.content.Context r1 = sContext     // Catch:{ all -> 0x0332 }
            com.xiaomi.mipush.sdk.b r1 = com.xiaomi.mipush.sdk.C4056b.m10888a((android.content.Context) r1)     // Catch:{ all -> 0x0332 }
            java.lang.String r1 = r1.mo22940c()     // Catch:{ all -> 0x0332 }
            r12.add(r1)     // Catch:{ all -> 0x0332 }
            com.xiaomi.push.fg r1 = com.xiaomi.push.C4668fg.COMMAND_REGISTER     // Catch:{ all -> 0x0332 }
            java.lang.String r11 = r1.f8633a     // Catch:{ all -> 0x0332 }
            r13 = 0
            r15 = 0
            r16 = 0
            com.xiaomi.mipush.sdk.MiPushCommandMessage r1 = com.xiaomi.mipush.sdk.PushMessageHelper.generateCommandMessage(r11, r12, r13, r15, r16)     // Catch:{ all -> 0x0332 }
            android.content.Context r2 = sContext     // Catch:{ all -> 0x0332 }
            com.xiaomi.mipush.sdk.PushMessageHelper.sendCommandMessageBroadcast(r2, r1)     // Catch:{ all -> 0x0332 }
        L_0x00c7:
            android.content.Context r1 = sContext     // Catch:{ all -> 0x0332 }
            com.xiaomi.mipush.sdk.aq r1 = com.xiaomi.mipush.sdk.C4047aq.m10835a((android.content.Context) r1)     // Catch:{ all -> 0x0332 }
            r1.mo22903a()     // Catch:{ all -> 0x0332 }
            android.content.Context r1 = sContext     // Catch:{ all -> 0x0332 }
            com.xiaomi.mipush.sdk.b r1 = com.xiaomi.mipush.sdk.C4056b.m10888a((android.content.Context) r1)     // Catch:{ all -> 0x0332 }
            boolean r1 = r1.mo22930a()     // Catch:{ all -> 0x0332 }
            if (r1 == 0) goto L_0x015d
            com.xiaomi.push.il r1 = new com.xiaomi.push.il     // Catch:{ all -> 0x0332 }
            r1.<init>()     // Catch:{ all -> 0x0332 }
            android.content.Context r2 = sContext     // Catch:{ all -> 0x0332 }
            com.xiaomi.mipush.sdk.b r2 = com.xiaomi.mipush.sdk.C4056b.m10888a((android.content.Context) r2)     // Catch:{ all -> 0x0332 }
            java.lang.String r2 = r2.mo22930a()     // Catch:{ all -> 0x0332 }
            r1.mo25562b((java.lang.String) r2)     // Catch:{ all -> 0x0332 }
            java.lang.String r2 = "client_info_update"
            r1.mo25565c((java.lang.String) r2)     // Catch:{ all -> 0x0332 }
            java.lang.String r2 = com.xiaomi.push.service.C4858an.m15586a()     // Catch:{ all -> 0x0332 }
            r1.mo25555a((java.lang.String) r2)     // Catch:{ all -> 0x0332 }
            java.util.HashMap r2 = new java.util.HashMap     // Catch:{ all -> 0x0332 }
            r2.<init>()     // Catch:{ all -> 0x0332 }
            r1.f9524a = r2     // Catch:{ all -> 0x0332 }
            java.lang.String r9 = "app_version"
            android.content.Context r10 = sContext     // Catch:{ all -> 0x0332 }
            android.content.Context r11 = sContext     // Catch:{ all -> 0x0332 }
            java.lang.String r11 = r11.getPackageName()     // Catch:{ all -> 0x0332 }
            java.lang.String r10 = com.xiaomi.push.C4689g.m14350a((android.content.Context) r10, (java.lang.String) r11)     // Catch:{ all -> 0x0332 }
            r2.put(r9, r10)     // Catch:{ all -> 0x0332 }
            java.util.Map<java.lang.String, java.lang.String> r2 = r1.f9524a     // Catch:{ all -> 0x0332 }
            java.lang.String r9 = "app_version_code"
            android.content.Context r10 = sContext     // Catch:{ all -> 0x0332 }
            android.content.Context r11 = sContext     // Catch:{ all -> 0x0332 }
            java.lang.String r11 = r11.getPackageName()     // Catch:{ all -> 0x0332 }
            int r10 = com.xiaomi.push.C4689g.m14350a((android.content.Context) r10, (java.lang.String) r11)     // Catch:{ all -> 0x0332 }
            java.lang.String r10 = java.lang.Integer.toString(r10)     // Catch:{ all -> 0x0332 }
            r2.put(r9, r10)     // Catch:{ all -> 0x0332 }
            java.util.Map<java.lang.String, java.lang.String> r2 = r1.f9524a     // Catch:{ all -> 0x0332 }
            java.lang.String r9 = "push_sdk_vn"
            r2.put(r9, r8)     // Catch:{ all -> 0x0332 }
            java.util.Map<java.lang.String, java.lang.String> r2 = r1.f9524a     // Catch:{ all -> 0x0332 }
            java.lang.String r8 = "push_sdk_vc"
            java.lang.String r5 = java.lang.Integer.toString(r5)     // Catch:{ all -> 0x0332 }
            r2.put(r8, r5)     // Catch:{ all -> 0x0332 }
            android.content.Context r2 = sContext     // Catch:{ all -> 0x0332 }
            com.xiaomi.mipush.sdk.b r2 = com.xiaomi.mipush.sdk.C4056b.m10888a((android.content.Context) r2)     // Catch:{ all -> 0x0332 }
            java.lang.String r2 = r2.mo22942e()     // Catch:{ all -> 0x0332 }
            boolean r5 = android.text.TextUtils.isEmpty(r2)     // Catch:{ all -> 0x0332 }
            if (r5 != 0) goto L_0x0152
            java.util.Map<java.lang.String, java.lang.String> r5 = r1.f9524a     // Catch:{ all -> 0x0332 }
            java.lang.String r8 = "deviceid"
            r5.put(r8, r2)     // Catch:{ all -> 0x0332 }
        L_0x0152:
            android.content.Context r2 = sContext     // Catch:{ all -> 0x0332 }
            com.xiaomi.mipush.sdk.aq r2 = com.xiaomi.mipush.sdk.C4047aq.m10835a((android.content.Context) r2)     // Catch:{ all -> 0x0332 }
            com.xiaomi.push.hm r5 = com.xiaomi.push.C4739hm.Notification     // Catch:{ all -> 0x0332 }
            r2.mo22912a(r1, (com.xiaomi.push.C4739hm) r5, (boolean) r7, (com.xiaomi.push.C4752hz) r4)     // Catch:{ all -> 0x0332 }
        L_0x015d:
            android.content.Context r1 = sContext     // Catch:{ all -> 0x0332 }
            boolean r1 = com.xiaomi.push.C4810n.m15369a((android.content.Context) r1, (java.lang.String) r3, (boolean) r7)     // Catch:{ all -> 0x0332 }
            if (r1 != 0) goto L_0x016d
            updateImeiOrOaid()     // Catch:{ all -> 0x0332 }
            android.content.Context r1 = sContext     // Catch:{ all -> 0x0332 }
            com.xiaomi.push.C4810n.m15369a((android.content.Context) r1, (java.lang.String) r3, (boolean) r6)     // Catch:{ all -> 0x0332 }
        L_0x016d:
            android.content.Context r1 = sContext     // Catch:{ all -> 0x0332 }
            java.lang.String r1 = com.xiaomi.push.C4753i.m14756d((android.content.Context) r1)     // Catch:{ all -> 0x0332 }
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x0332 }
            if (r2 != 0) goto L_0x01c4
            com.xiaomi.push.ig r2 = new com.xiaomi.push.ig     // Catch:{ all -> 0x0332 }
            r2.<init>()     // Catch:{ all -> 0x0332 }
            java.lang.String r3 = com.xiaomi.push.service.C4858an.m15586a()     // Catch:{ all -> 0x0332 }
            r2.mo25480a((java.lang.String) r3)     // Catch:{ all -> 0x0332 }
            r2.mo25484b((java.lang.String) r0)     // Catch:{ all -> 0x0332 }
            com.xiaomi.push.fg r0 = com.xiaomi.push.C4668fg.COMMAND_CHK_VDEVID     // Catch:{ all -> 0x0332 }
            java.lang.String r0 = r0.f8633a     // Catch:{ all -> 0x0332 }
            r2.mo25487c((java.lang.String) r0)     // Catch:{ all -> 0x0332 }
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x0332 }
            r0.<init>()     // Catch:{ all -> 0x0332 }
            android.content.Context r3 = sContext     // Catch:{ all -> 0x0332 }
            java.lang.String r3 = com.xiaomi.push.C4753i.m14753c((android.content.Context) r3)     // Catch:{ all -> 0x0332 }
            r0.add(r3)     // Catch:{ all -> 0x0332 }
            r0.add(r1)     // Catch:{ all -> 0x0332 }
            java.lang.String r1 = android.os.Build.MODEL     // Catch:{ all -> 0x0332 }
            java.lang.String r3 = ""
            if (r1 == 0) goto L_0x01a9
            java.lang.String r1 = android.os.Build.MODEL     // Catch:{ all -> 0x0332 }
            goto L_0x01aa
        L_0x01a9:
            r1 = r3
        L_0x01aa:
            r0.add(r1)     // Catch:{ all -> 0x0332 }
            java.lang.String r1 = android.os.Build.BOARD     // Catch:{ all -> 0x0332 }
            if (r1 == 0) goto L_0x01b3
            java.lang.String r3 = android.os.Build.BOARD     // Catch:{ all -> 0x0332 }
        L_0x01b3:
            r0.add(r3)     // Catch:{ all -> 0x0332 }
            r2.mo25481a((java.util.List<java.lang.String>) r0)     // Catch:{ all -> 0x0332 }
            android.content.Context r0 = sContext     // Catch:{ all -> 0x0332 }
            com.xiaomi.mipush.sdk.aq r0 = com.xiaomi.mipush.sdk.C4047aq.m10835a((android.content.Context) r0)     // Catch:{ all -> 0x0332 }
            com.xiaomi.push.hm r1 = com.xiaomi.push.C4739hm.Command     // Catch:{ all -> 0x0332 }
            r0.mo22912a(r2, (com.xiaomi.push.C4739hm) r1, (boolean) r7, (com.xiaomi.push.C4752hz) r4)     // Catch:{ all -> 0x0332 }
        L_0x01c4:
            android.content.Context r0 = sContext     // Catch:{ all -> 0x0332 }
            boolean r0 = shouldUseMIUIPush(r0)     // Catch:{ all -> 0x0332 }
            if (r0 == 0) goto L_0x02f3
            android.content.Context r0 = sContext     // Catch:{ all -> 0x0332 }
            boolean r0 = shouldPullNotification(r0)     // Catch:{ all -> 0x0332 }
            if (r0 == 0) goto L_0x02f3
            com.xiaomi.push.il r2 = new com.xiaomi.push.il     // Catch:{ all -> 0x0332 }
            r2.<init>()     // Catch:{ all -> 0x0332 }
            android.content.Context r0 = sContext     // Catch:{ all -> 0x0332 }
            com.xiaomi.mipush.sdk.b r0 = com.xiaomi.mipush.sdk.C4056b.m10888a((android.content.Context) r0)     // Catch:{ all -> 0x0332 }
            java.lang.String r0 = r0.mo22930a()     // Catch:{ all -> 0x0332 }
            r2.mo25562b((java.lang.String) r0)     // Catch:{ all -> 0x0332 }
            com.xiaomi.push.hw r0 = com.xiaomi.push.C4749hw.PullOfflineMessage     // Catch:{ all -> 0x0332 }
            java.lang.String r0 = r0.f9252a     // Catch:{ all -> 0x0332 }
            r2.mo25565c((java.lang.String) r0)     // Catch:{ all -> 0x0332 }
            java.lang.String r0 = com.xiaomi.push.service.C4858an.m15586a()     // Catch:{ all -> 0x0332 }
            r2.mo25555a((java.lang.String) r0)     // Catch:{ all -> 0x0332 }
            r2.mo25558a((boolean) r7)     // Catch:{ all -> 0x0332 }
            android.content.Context r0 = sContext     // Catch:{ all -> 0x0332 }
            com.xiaomi.mipush.sdk.aq r1 = com.xiaomi.mipush.sdk.C4047aq.m10835a((android.content.Context) r0)     // Catch:{ all -> 0x0332 }
            com.xiaomi.push.hm r3 = com.xiaomi.push.C4739hm.Notification     // Catch:{ all -> 0x0332 }
            r4 = 0
            r5 = 0
            r6 = 0
            r1.mo22913a(r2, (com.xiaomi.push.C4739hm) r3, (boolean) r4, (com.xiaomi.push.C4752hz) r5, (boolean) r6)     // Catch:{ all -> 0x0332 }
            android.content.Context r0 = sContext     // Catch:{ all -> 0x0332 }
            addPullNotificationTime(r0)     // Catch:{ all -> 0x0332 }
            goto L_0x02f3
        L_0x020c:
            r2 = 6
            java.lang.String r2 = com.xiaomi.push.C4532bf.m13430a((int) r2)     // Catch:{ all -> 0x0332 }
            android.content.Context r3 = sContext     // Catch:{ all -> 0x0332 }
            com.xiaomi.mipush.sdk.b r3 = com.xiaomi.mipush.sdk.C4056b.m10888a((android.content.Context) r3)     // Catch:{ all -> 0x0332 }
            r3.mo22930a()     // Catch:{ all -> 0x0332 }
            android.content.Context r3 = sContext     // Catch:{ all -> 0x0332 }
            com.xiaomi.mipush.sdk.b r3 = com.xiaomi.mipush.sdk.C4056b.m10888a((android.content.Context) r3)     // Catch:{ all -> 0x0332 }
            int r7 = com.xiaomi.mipush.sdk.Constants.m10746a()     // Catch:{ all -> 0x0332 }
            r3.mo22932a((int) r7)     // Catch:{ all -> 0x0332 }
            android.content.Context r3 = sContext     // Catch:{ all -> 0x0332 }
            com.xiaomi.mipush.sdk.b r3 = com.xiaomi.mipush.sdk.C4056b.m10888a((android.content.Context) r3)     // Catch:{ all -> 0x0332 }
            r3.mo22934a((java.lang.String) r0, (java.lang.String) r1, (java.lang.String) r2)     // Catch:{ all -> 0x0332 }
            com.xiaomi.mipush.sdk.MiTinyDataClient$a r3 = com.xiaomi.mipush.sdk.MiTinyDataClient.C4027a.mo22856a()     // Catch:{ all -> 0x0332 }
            java.lang.String r7 = "com.xiaomi.xmpushsdk.tinydataPending.appId"
            r3.mo22858b((java.lang.String) r7)     // Catch:{ all -> 0x0332 }
            android.content.Context r3 = sContext     // Catch:{ all -> 0x0332 }
            clearExtras(r3)     // Catch:{ all -> 0x0332 }
            com.xiaomi.push.im r3 = new com.xiaomi.push.im     // Catch:{ all -> 0x0332 }
            r3.<init>()     // Catch:{ all -> 0x0332 }
            java.lang.String r7 = com.xiaomi.push.service.C4858an.m15586a()     // Catch:{ all -> 0x0332 }
            r3.mo25590a((java.lang.String) r7)     // Catch:{ all -> 0x0332 }
            r3.mo25594b((java.lang.String) r0)     // Catch:{ all -> 0x0332 }
            r3.mo25605e((java.lang.String) r1)     // Catch:{ all -> 0x0332 }
            android.content.Context r0 = sContext     // Catch:{ all -> 0x0332 }
            java.lang.String r0 = r0.getPackageName()     // Catch:{ all -> 0x0332 }
            r3.mo25602d((java.lang.String) r0)     // Catch:{ all -> 0x0332 }
            r3.mo25609f((java.lang.String) r2)     // Catch:{ all -> 0x0332 }
            android.content.Context r0 = sContext     // Catch:{ all -> 0x0332 }
            android.content.Context r1 = sContext     // Catch:{ all -> 0x0332 }
            java.lang.String r1 = r1.getPackageName()     // Catch:{ all -> 0x0332 }
            java.lang.String r0 = com.xiaomi.push.C4689g.m14350a((android.content.Context) r0, (java.lang.String) r1)     // Catch:{ all -> 0x0332 }
            r3.mo25598c((java.lang.String) r0)     // Catch:{ all -> 0x0332 }
            android.content.Context r0 = sContext     // Catch:{ all -> 0x0332 }
            android.content.Context r1 = sContext     // Catch:{ all -> 0x0332 }
            java.lang.String r1 = r1.getPackageName()     // Catch:{ all -> 0x0332 }
            int r0 = com.xiaomi.push.C4689g.m14350a((android.content.Context) r0, (java.lang.String) r1)     // Catch:{ all -> 0x0332 }
            r3.mo25593b((int) r0)     // Catch:{ all -> 0x0332 }
            r3.mo25615h(r8)     // Catch:{ all -> 0x0332 }
            r3.mo25588a((int) r5)     // Catch:{ all -> 0x0332 }
            android.content.Context r0 = sContext     // Catch:{ all -> 0x0332 }
            java.lang.String r0 = com.xiaomi.push.C4753i.m14759e(r0)     // Catch:{ all -> 0x0332 }
            r3.mo25618i(r0)     // Catch:{ all -> 0x0332 }
            com.xiaomi.push.ia r0 = com.xiaomi.push.C4754ia.Init     // Catch:{ all -> 0x0332 }
            r3.mo25589a((com.xiaomi.push.C4754ia) r0)     // Catch:{ all -> 0x0332 }
            boolean r0 = android.text.TextUtils.isEmpty(r21)     // Catch:{ all -> 0x0332 }
            if (r0 != 0) goto L_0x0299
            r0 = r21
            r3.mo25612g((java.lang.String) r0)     // Catch:{ all -> 0x0332 }
        L_0x0299:
            boolean r0 = com.xiaomi.push.C4808l.m15366d()     // Catch:{ all -> 0x0332 }
            if (r0 != 0) goto L_0x02cc
            android.content.Context r0 = sContext     // Catch:{ all -> 0x0332 }
            java.lang.String r0 = com.xiaomi.push.C4753i.m14761g(r0)     // Catch:{ all -> 0x0332 }
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x0332 }
            if (r1 != 0) goto L_0x02cc
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0332 }
            r1.<init>()     // Catch:{ all -> 0x0332 }
            java.lang.String r0 = com.xiaomi.push.C4532bf.m13431a((java.lang.String) r0)     // Catch:{ all -> 0x0332 }
            r1.append(r0)     // Catch:{ all -> 0x0332 }
            java.lang.String r0 = ","
            r1.append(r0)     // Catch:{ all -> 0x0332 }
            android.content.Context r0 = sContext     // Catch:{ all -> 0x0332 }
            java.lang.String r0 = com.xiaomi.push.C4753i.m14764j(r0)     // Catch:{ all -> 0x0332 }
            r1.append(r0)     // Catch:{ all -> 0x0332 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0332 }
            r3.mo25622k(r0)     // Catch:{ all -> 0x0332 }
        L_0x02cc:
            java.lang.String r0 = com.xiaomi.push.C4753i.m14735a()     // Catch:{ all -> 0x0332 }
            r3.mo25620j(r0)     // Catch:{ all -> 0x0332 }
            int r0 = com.xiaomi.push.C4753i.m14735a()     // Catch:{ all -> 0x0332 }
            if (r0 < 0) goto L_0x02dc
            r3.mo25597c((int) r0)     // Catch:{ all -> 0x0332 }
        L_0x02dc:
            android.content.Context r0 = sContext     // Catch:{ all -> 0x0332 }
            com.xiaomi.mipush.sdk.aq r0 = com.xiaomi.mipush.sdk.C4047aq.m10835a((android.content.Context) r0)     // Catch:{ all -> 0x0332 }
            r0.mo22908a((com.xiaomi.push.C4766im) r3, (boolean) r4)     // Catch:{ all -> 0x0332 }
            android.content.Context r0 = sContext     // Catch:{ all -> 0x0332 }
            java.lang.String r1 = "mipush_extra"
            r2 = 4
            android.content.SharedPreferences r0 = r0.getSharedPreferences(r1, r2)     // Catch:{ all -> 0x0332 }
            java.lang.String r1 = "mipush_registed"
            r0.getBoolean(r1, r6)     // Catch:{ all -> 0x0332 }
        L_0x02f3:
            android.content.Context r0 = sContext     // Catch:{ all -> 0x0332 }
            addRegRequestTime(r0)     // Catch:{ all -> 0x0332 }
            scheduleOcVersionCheckJob()     // Catch:{ all -> 0x0332 }
            android.content.Context r0 = sContext     // Catch:{ all -> 0x0332 }
            scheduleDataCollectionJobs(r0)     // Catch:{ all -> 0x0332 }
            android.content.Context r0 = sContext     // Catch:{ all -> 0x0332 }
            initEventPerfLogic(r0)     // Catch:{ all -> 0x0332 }
            android.content.Context r0 = sContext     // Catch:{ all -> 0x0332 }
            com.xiaomi.mipush.sdk.C4054aw.m10882a((android.content.Context) r0)     // Catch:{ all -> 0x0332 }
            forceHandleCrash()     // Catch:{ all -> 0x0332 }
            android.content.Context r0 = sContext     // Catch:{ all -> 0x0332 }
            java.lang.String r0 = r0.getPackageName()     // Catch:{ all -> 0x0332 }
            java.lang.String r1 = "com.xiaomi.xmsf"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x0332 }
            if (r0 != 0) goto L_0x032e
            com.xiaomi.channel.commonutils.logger.LoggerInterface r0 = com.xiaomi.mipush.sdk.Logger.getUserLogger()     // Catch:{ all -> 0x0332 }
            if (r0 == 0) goto L_0x032a
            android.content.Context r0 = sContext     // Catch:{ all -> 0x0332 }
            com.xiaomi.channel.commonutils.logger.LoggerInterface r1 = com.xiaomi.mipush.sdk.Logger.getUserLogger()     // Catch:{ all -> 0x0332 }
            com.xiaomi.mipush.sdk.Logger.setLogger(r0, r1)     // Catch:{ all -> 0x0332 }
        L_0x032a:
            r0 = 2
            com.xiaomi.channel.commonutils.logger.C3989b.m10670a((int) r0)     // Catch:{ all -> 0x0332 }
        L_0x032e:
            operateSyncAction(r17)     // Catch:{ all -> 0x0332 }
            goto L_0x0336
        L_0x0332:
            r0 = move-exception
            com.xiaomi.channel.commonutils.logger.C3989b.m10678a((java.lang.Throwable) r0)
        L_0x0336:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.mipush.sdk.MiPushClient.initialize(android.content.Context, java.lang.String, java.lang.String, com.xiaomi.mipush.sdk.MiPushClient$MiPushClientCallback, java.lang.String, com.xiaomi.mipush.sdk.MiPushClient$ICallbackResult):void");
    }

    private static void operateSyncAction(Context context) {
        if ("syncing".equals(C4037ag.m10796a(sContext).mo22895a(C4053av.DISABLE_PUSH))) {
            disablePush(sContext);
        }
        if ("syncing".equals(C4037ag.m10796a(sContext).mo22895a(C4053av.ENABLE_PUSH))) {
            enablePush(sContext);
        }
        if ("syncing".equals(C4037ag.m10796a(sContext).mo22895a(C4053av.UPLOAD_HUAWEI_TOKEN))) {
            syncAssemblePushToken(sContext);
        }
        if ("syncing".equals(C4037ag.m10796a(sContext).mo22895a(C4053av.UPLOAD_FCM_TOKEN))) {
            syncAssembleFCMPushToken(sContext);
        }
        if ("syncing".equals(C4037ag.m10796a(sContext).mo22895a(C4053av.UPLOAD_COS_TOKEN))) {
            syncAssembleCOSPushToken(context);
        }
        if ("syncing".equals(C4037ag.m10796a(sContext).mo22895a(C4053av.UPLOAD_FTOS_TOKEN))) {
            syncAssembleFTOSPushToken(context);
        }
    }

    public static void pausePush(Context context, String str) {
        setAcceptTime(context, 0, 0, 0, 0, str);
    }

    static void reInitialize(Context context, C4754ia iaVar) {
        if (C4056b.m10888a(context).mo22940c()) {
            String a = C4532bf.m13430a(6);
            String a2 = C4056b.m10888a(context).mo22930a();
            String b = C4056b.m10888a(context).mo22937b();
            C4056b.m10888a(context).mo22930a();
            C4056b.m10888a(context).mo22932a(Constants.m10746a());
            C4056b.m10888a(context).mo22934a(a2, b, a);
            C4766im imVar = new C4766im();
            imVar.mo25590a(C4858an.m15586a());
            imVar.mo25594b(a2);
            imVar.mo25605e(b);
            imVar.mo25609f(a);
            imVar.mo25602d(context.getPackageName());
            imVar.mo25598c(C4689g.m14350a(context, context.getPackageName()));
            imVar.mo25589a(iaVar);
            C4047aq.m10835a(context).mo22908a(imVar, false);
        }
    }

    public static void registerCrashHandler(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        Thread.setDefaultUncaughtExceptionHandler(new C4078v(sContext, uncaughtExceptionHandler));
        isCrashHandlerSuggested = true;
    }

    private static void registerNetworkReceiver(Context context) {
        try {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            intentFilter.addCategory("android.intent.category.DEFAULT");
            context.getApplicationContext().registerReceiver(new NetworkStatusReceiver((Object) null), intentFilter);
        } catch (Throwable th) {
            C3989b.m10678a(th);
        }
    }

    public static void registerPush(Context context, String str, String str2) {
        registerPush(context, str, str2, new PushConfiguration());
    }

    public static void registerPush(Context context, String str, String str2, PushConfiguration pushConfiguration) {
        registerPush(context, str, str2, pushConfiguration, (String) null, (ICallbackResult) null);
    }

    private static void registerPush(Context context, final String str, final String str2, PushConfiguration pushConfiguration, final String str3, final ICallbackResult iCallbackResult) {
        checkNotNull(context, "context");
        checkNotNull(str, "appID");
        checkNotNull(str2, "appToken");
        Context applicationContext = context.getApplicationContext();
        sContext = applicationContext;
        if (applicationContext == null) {
            sContext = context;
        }
        Context context2 = sContext;
        C4937t.m15869a(context2);
        if (!NetworkStatusReceiver.m15842a()) {
            registerNetworkReceiver(sContext);
        }
        C4060e.m10932a(sContext).mo22956a(pushConfiguration);
        C4498ai.m13271a(context2).mo24725a((Runnable) new Runnable() {
            public void run() {
                MiPushClient.initialize(MiPushClient.sContext, str, str2, (MiPushClientCallback) null, str3, iCallbackResult);
            }
        });
    }

    public static void registerPush(Context context, String str, String str2, String str3) {
        registerPush(context, str, str2, new PushConfiguration(), str3, (ICallbackResult) null);
    }

    public static void registerToken(Context context, String str, String str2, String str3, UPSRegisterCallBack uPSRegisterCallBack) {
        registerPush(context, str, str2, new PushConfiguration(), (String) null, uPSRegisterCallBack);
    }

    static synchronized void removeAcceptTime(Context context) {
        synchronized (MiPushClient.class) {
            SharedPreferences.Editor edit = context.getSharedPreferences("mipush_extra", 0).edit();
            edit.remove(Constants.EXTRA_KEY_ACCEPT_TIME);
            C4815r.m15379a(edit);
        }
    }

    static synchronized void removeAccount(Context context, String str) {
        synchronized (MiPushClient.class) {
            SharedPreferences.Editor edit = context.getSharedPreferences("mipush_extra", 0).edit();
            edit.remove("account_" + str).commit();
        }
    }

    static synchronized void removeAlias(Context context, String str) {
        synchronized (MiPushClient.class) {
            SharedPreferences.Editor edit = context.getSharedPreferences("mipush_extra", 0).edit();
            edit.remove("alias_" + str).commit();
        }
    }

    static synchronized void removeAllAccounts(Context context) {
        synchronized (MiPushClient.class) {
            for (String removeAccount : getAllUserAccount(context)) {
                removeAccount(context, removeAccount);
            }
        }
    }

    static synchronized void removeAllAliases(Context context) {
        synchronized (MiPushClient.class) {
            for (String removeAlias : getAllAlias(context)) {
                removeAlias(context, removeAlias);
            }
        }
    }

    static synchronized void removeAllTopics(Context context) {
        synchronized (MiPushClient.class) {
            for (String removeTopic : getAllTopic(context)) {
                removeTopic(context, removeTopic);
            }
        }
    }

    static synchronized void removeTopic(Context context, String str) {
        synchronized (MiPushClient.class) {
            SharedPreferences.Editor edit = context.getSharedPreferences("mipush_extra", 0).edit();
            edit.remove("topic_" + str).commit();
        }
    }

    public static void reportAppRunInBackground(Context context, boolean z) {
        if (C4056b.m10888a(context).mo22937b()) {
            C4749hw hwVar = z ? C4749hw.APP_SLEEP : C4749hw.APP_WAKEUP;
            C4765il ilVar = new C4765il();
            ilVar.mo25562b(C4056b.m10888a(context).mo22930a());
            ilVar.mo25565c(hwVar.f9252a);
            ilVar.mo25569d(context.getPackageName());
            ilVar.mo25555a(C4858an.m15586a());
            ilVar.mo25558a(false);
            C4047aq.m10835a(context).mo22913a(ilVar, C4739hm.Notification, false, (C4752hz) null, false);
        }
    }

    static void reportIgnoreRegMessageClicked(Context context, String str, C4752hz hzVar, String str2, String str3) {
        C4765il ilVar = new C4765il();
        if (TextUtils.isEmpty(str3)) {
            C3989b.m10681d("do not report clicked message");
            return;
        }
        ilVar.mo25562b(str3);
        ilVar.mo25565c("bar:click");
        ilVar.mo25555a(str);
        ilVar.mo25558a(false);
        C4047aq.m10835a(context).mo22915a(ilVar, C4739hm.Notification, false, true, hzVar, true, str2, str3);
    }

    public static void reportMessageClicked(Context context, MiPushMessage miPushMessage) {
        C4752hz hzVar = new C4752hz();
        hzVar.mo25364a(miPushMessage.getMessageId());
        hzVar.mo25370b(miPushMessage.getTopic());
        hzVar.mo25378d(miPushMessage.getDescription());
        hzVar.mo25375c(miPushMessage.getTitle());
        hzVar.mo25374c(miPushMessage.getNotifyId());
        hzVar.mo25363a(miPushMessage.getNotifyType());
        hzVar.mo25369b(miPushMessage.getPassThrough());
        hzVar.mo25365a(miPushMessage.getExtra());
        reportMessageClicked(context, miPushMessage.getMessageId(), hzVar, (String) null);
    }

    @Deprecated
    public static void reportMessageClicked(Context context, String str) {
        reportMessageClicked(context, str, (C4752hz) null, (String) null);
    }

    static void reportMessageClicked(Context context, String str, C4752hz hzVar, String str2) {
        C4765il ilVar = new C4765il();
        if (TextUtils.isEmpty(str2)) {
            if (C4056b.m10888a(context).mo22937b()) {
                str2 = C4056b.m10888a(context).mo22930a();
            } else {
                C3989b.m10681d("do not report clicked message");
                return;
            }
        }
        ilVar.mo25562b(str2);
        ilVar.mo25565c("bar:click");
        ilVar.mo25555a(str);
        ilVar.mo25558a(false);
        C4047aq.m10835a(context).mo22912a(ilVar, C4739hm.Notification, false, hzVar);
    }

    public static void resumePush(Context context, String str) {
        setAcceptTime(context, 0, 0, 23, 59, str);
    }

    private static void scheduleDataCollectionJobs(Context context) {
        if (C4854ak.m15568a(sContext).mo25911a(C4744hr.DataCollectionSwitch.mo25291a(), getDefaultSwitch())) {
            C4610dq.mo24924a().mo24925a(new C4073q(context));
            C4498ai.m13271a(sContext).mo24726a((Runnable) new Runnable() {
                public void run() {
                    C4611dr.m13756a(MiPushClient.sContext);
                }
            }, 10);
        }
    }

    private static void scheduleOcVersionCheckJob() {
        C4498ai.m13271a(sContext).mo24730a(new C4036af(sContext), C4854ak.m15568a(sContext).mo25906a(C4744hr.OcVersionCheckFrequency.mo25291a(), 86400), 5);
    }

    public static void setAcceptTime(Context context, int i, int i2, int i3, int i4, String str) {
        Context context2 = context;
        int i5 = i;
        int i6 = i2;
        int i7 = i3;
        int i8 = i4;
        if (i5 < 0 || i5 >= 24 || i7 < 0 || i7 >= 24 || i6 < 0 || i6 >= 60 || i8 < 0 || i8 >= 60) {
            throw new IllegalArgumentException("the input parameter is not valid.");
        }
        long rawOffset = (long) (((TimeZone.getTimeZone("GMT+08").getRawOffset() - TimeZone.getDefault().getRawOffset()) / 1000) / 60);
        long j = ((((long) ((i5 * 60) + i6)) + rawOffset) + 1440) % 1440;
        long j2 = ((((long) ((i7 * 60) + i8)) + rawOffset) + 1440) % 1440;
        ArrayList arrayList = new ArrayList();
        arrayList.add(String.format("%1$02d:%2$02d", new Object[]{Long.valueOf(j / 60), Long.valueOf(j % 60)}));
        arrayList.add(String.format("%1$02d:%2$02d", new Object[]{Long.valueOf(j2 / 60), Long.valueOf(j2 % 60)}));
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(String.format("%1$02d:%2$02d", new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}));
        arrayList2.add(String.format("%1$02d:%2$02d", new Object[]{Integer.valueOf(i3), Integer.valueOf(i4)}));
        if (!acceptTimeSet(context2, (String) arrayList.get(0), (String) arrayList.get(1))) {
            setCommand(context2, C4668fg.COMMAND_SET_ACCEPT_TIME.f8633a, (ArrayList<String>) arrayList, str);
        } else if (1 == PushMessageHelper.getPushMode(context)) {
            PushMessageHandler.m10782a(context, str, C4668fg.COMMAND_SET_ACCEPT_TIME.f8633a, 0, (String) null, arrayList2);
        } else {
            PushMessageHelper.sendCommandMessageBroadcast(context2, PushMessageHelper.generateCommandMessage(C4668fg.COMMAND_SET_ACCEPT_TIME.f8633a, arrayList2, 0, (String) null, (String) null));
        }
    }

    public static void setAlias(Context context, String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            setCommand(context, C4668fg.COMMAND_SET_ALIAS.f8633a, str, str2);
        }
    }

    protected static void setCommand(Context context, String str, String str2, String str3) {
        StringBuilder sb;
        String str4;
        C4668fg fgVar;
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(str2);
        }
        if (!C4668fg.COMMAND_SET_ALIAS.f8633a.equalsIgnoreCase(str) || Math.abs(System.currentTimeMillis() - aliasSetTime(context, str2)) >= MiStatInterface.MAX_UPLOAD_INTERVAL) {
            if (C4668fg.COMMAND_UNSET_ALIAS.f8633a.equalsIgnoreCase(str) && aliasSetTime(context, str2) < 0) {
                sb = new StringBuilder();
                str4 = "Don't cancel alias for ";
            } else if (!C4668fg.COMMAND_SET_ACCOUNT.f8633a.equalsIgnoreCase(str) || Math.abs(System.currentTimeMillis() - accountSetTime(context, str2)) >= 3600000) {
                if (!C4668fg.COMMAND_UNSET_ACCOUNT.f8633a.equalsIgnoreCase(str) || accountSetTime(context, str2) >= 0) {
                    setCommand(context, str, (ArrayList<String>) arrayList, str3);
                    return;
                } else {
                    sb = new StringBuilder();
                    str4 = "Don't cancel account for ";
                }
            } else if (1 != PushMessageHelper.getPushMode(context)) {
                fgVar = C4668fg.COMMAND_SET_ACCOUNT;
                PushMessageHelper.sendCommandMessageBroadcast(context, PushMessageHelper.generateCommandMessage(fgVar.f8633a, arrayList, 0, (String) null, str3));
                return;
            }
            sb.append(str4);
            sb.append(C4532bf.m13432a(arrayList.toString(), 3));
            sb.append(" is unseted");
            C3989b.m10669a(sb.toString());
            return;
        } else if (1 != PushMessageHelper.getPushMode(context)) {
            fgVar = C4668fg.COMMAND_SET_ALIAS;
            PushMessageHelper.sendCommandMessageBroadcast(context, PushMessageHelper.generateCommandMessage(fgVar.f8633a, arrayList, 0, (String) null, str3));
            return;
        }
        PushMessageHandler.m10782a(context, str3, str, 0, (String) null, arrayList);
    }

    protected static void setCommand(Context context, String str, ArrayList<String> arrayList, String str2) {
        if (!TextUtils.isEmpty(C4056b.m10888a(context).mo22930a())) {
            C4760ig igVar = new C4760ig();
            igVar.mo25480a(C4858an.m15586a());
            igVar.mo25484b(C4056b.m10888a(context).mo22930a());
            igVar.mo25487c(str);
            Iterator<String> it = arrayList.iterator();
            while (it.hasNext()) {
                igVar.mo25480a(it.next());
            }
            igVar.mo25493e(str2);
            igVar.mo25491d(context.getPackageName());
            C4047aq.m10835a(context).mo22910a(igVar, C4739hm.Command, (C4752hz) null);
        }
    }

    public static void setLocalNotificationType(Context context, int i) {
        C4047aq.m10835a(context).mo22921b(i & -1);
    }

    public static void setUserAccount(Context context, String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            setCommand(context, C4668fg.COMMAND_SET_ACCOUNT.f8633a, str, str2);
        }
    }

    private static boolean shouldPullNotification(Context context) {
        return Math.abs(System.currentTimeMillis() - context.getSharedPreferences("mipush_extra", 0).getLong("last_pull_notification", -1)) > Constants.ASSEMBLE_PUSH_NETWORK_INTERVAL;
    }

    private static boolean shouldSendRegRequest(Context context) {
        return Math.abs(System.currentTimeMillis() - context.getSharedPreferences("mipush_extra", 0).getLong("last_reg_request", -1)) > 5000;
    }

    public static boolean shouldUseMIUIPush(Context context) {
        return C4047aq.m10835a(context).mo22903a();
    }

    public static void subscribe(Context context, String str, String str2) {
        if (!TextUtils.isEmpty(C4056b.m10888a(context).mo22930a()) && !TextUtils.isEmpty(str)) {
            if (Math.abs(System.currentTimeMillis() - topicSubscribedTime(context, str)) > MiStatInterface.MAX_UPLOAD_INTERVAL) {
                C4770iq iqVar = new C4770iq();
                iqVar.mo25700a(C4858an.m15586a());
                iqVar.mo25702b(C4056b.m10888a(context).mo22930a());
                iqVar.mo25704c(str);
                iqVar.mo25707d(context.getPackageName());
                iqVar.mo25709e(str2);
                C4047aq.m10835a(context).mo22910a(iqVar, C4739hm.Subscription, (C4752hz) null);
            } else if (1 == PushMessageHelper.getPushMode(context)) {
                PushMessageHandler.m10781a(context, str2, 0, (String) null, str);
            } else {
                ArrayList arrayList = new ArrayList();
                arrayList.add(str);
                PushMessageHelper.sendCommandMessageBroadcast(context, PushMessageHelper.generateCommandMessage(C4668fg.COMMAND_SUBSCRIBE_TOPIC.f8633a, arrayList, 0, (String) null, (String) null));
            }
        }
    }

    public static void syncAssembleCOSPushToken(Context context) {
        C4047aq.m10835a(context).mo22916a((String) null, C4053av.UPLOAD_COS_TOKEN, C4059d.ASSEMBLE_PUSH_COS);
    }

    public static void syncAssembleFCMPushToken(Context context) {
        C4047aq.m10835a(context).mo22916a((String) null, C4053av.UPLOAD_FCM_TOKEN, C4059d.ASSEMBLE_PUSH_FCM);
    }

    public static void syncAssembleFTOSPushToken(Context context) {
        C4047aq.m10835a(context).mo22916a((String) null, C4053av.UPLOAD_FTOS_TOKEN, C4059d.ASSEMBLE_PUSH_FTOS);
    }

    public static void syncAssemblePushToken(Context context) {
        C4047aq.m10835a(context).mo22916a((String) null, C4053av.UPLOAD_HUAWEI_TOKEN, C4059d.ASSEMBLE_PUSH_HUAWEI);
    }

    public static long topicSubscribedTime(Context context, String str) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("mipush_extra", 0);
        return sharedPreferences.getLong("topic_" + str, -1);
    }

    public static void turnOffPush(Context context, UPSTurnCallBack uPSTurnCallBack) {
        disablePush(context);
        if (uPSTurnCallBack != null) {
            CodeResult codeResult = new CodeResult();
            codeResult.setResultCode(0);
            codeResult.getResultCode();
            uPSTurnCallBack.onResult(codeResult);
        }
    }

    public static void turnOnPush(Context context, UPSTurnCallBack uPSTurnCallBack) {
        enablePush(context);
        if (uPSTurnCallBack != null) {
            CodeResult codeResult = new CodeResult();
            codeResult.setResultCode(0);
            codeResult.getResultCode();
            uPSTurnCallBack.onResult(codeResult);
        }
    }

    public static void unRegisterToken(Context context, UPSUnRegisterCallBack uPSUnRegisterCallBack) {
        unregisterPush(context);
        if (uPSUnRegisterCallBack != null) {
            TokenResult tokenResult = new TokenResult();
            tokenResult.setToken((String) null);
            tokenResult.getToken();
            tokenResult.setResultCode(0);
            tokenResult.getResultCode();
            uPSUnRegisterCallBack.onResult(tokenResult);
        }
    }

    public static void unregisterPush(Context context) {
        C4063h.m10958c(context);
        C4854ak.m15568a(context).mo25908a();
        if (C4056b.m10888a(context).mo22937b()) {
            C4772is isVar = new C4772is();
            isVar.mo25733a(C4858an.m15586a());
            isVar.mo25736b(C4056b.m10888a(context).mo22930a());
            isVar.mo25739c(C4056b.m10888a(context).mo22940c());
            isVar.mo25744e(C4056b.m10888a(context).mo22937b());
            isVar.mo25742d(context.getPackageName());
            C4047aq.m10835a(context).mo22909a(isVar);
            PushMessageHandler.mo22778a();
            PushMessageHandler.m10786b();
            C4056b.m10888a(context).mo22937b();
            clearLocalNotificationType(context);
            clearNotification(context);
            clearExtras(context);
        }
    }

    public static void unsetAlias(Context context, String str, String str2) {
        setCommand(context, C4668fg.COMMAND_UNSET_ALIAS.f8633a, str, str2);
    }

    public static void unsetUserAccount(Context context, String str, String str2) {
        setCommand(context, C4668fg.COMMAND_UNSET_ACCOUNT.f8633a, str, str2);
    }

    public static void unsubscribe(Context context, String str, String str2) {
        if (C4056b.m10888a(context).mo22937b()) {
            if (topicSubscribedTime(context, str) < 0) {
                C3989b.m10669a("Don't cancel subscribe for " + str + " is unsubscribed");
                return;
            }
            C4774iu iuVar = new C4774iu();
            iuVar.mo25774a(C4858an.m15586a());
            iuVar.mo25776b(C4056b.m10888a(context).mo22930a());
            iuVar.mo25778c(str);
            iuVar.mo25781d(context.getPackageName());
            iuVar.mo25783e(str2);
            C4047aq.m10835a(context).mo22910a(iuVar, C4739hm.UnSubscription, (C4752hz) null);
        }
    }

    private static void updateImeiOrOaid() {
        new Thread(new Runnable() {
            public void run() {
                if (C4808l.m15366d()) {
                    return;
                }
                if (C4753i.m14760f(MiPushClient.sContext) != null || C4516au.m13333a(MiPushClient.sContext).mo24744a()) {
                    C4765il ilVar = new C4765il();
                    ilVar.mo25562b(C4056b.m10888a(MiPushClient.sContext).mo22930a());
                    ilVar.mo25565c("client_info_update");
                    ilVar.mo25555a(C4858an.m15586a());
                    ilVar.mo25557a((Map<String, String>) new HashMap());
                    String str = "";
                    String f = C4753i.m14760f(MiPushClient.sContext);
                    if (!TextUtils.isEmpty(f)) {
                        str = str + C4532bf.m13431a(f);
                    }
                    String h = C4753i.m14762h(MiPushClient.sContext);
                    if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(h)) {
                        str = str + Constants.ACCEPT_TIME_SEPARATOR_SP + h;
                    }
                    if (!TextUtils.isEmpty(str)) {
                        ilVar.mo25560a().put(Constants.EXTRA_KEY_IMEI_MD5, str);
                    }
                    C4516au.m13333a(MiPushClient.sContext).mo24750a((Map<String, String>) ilVar.mo25560a());
                    int a = C4753i.m14735a();
                    if (a >= 0) {
                        ilVar.mo25560a().put("space_id", Integer.toString(a));
                    }
                    C4047aq.m10835a(MiPushClient.sContext).mo22912a(ilVar, C4739hm.Notification, false, (C4752hz) null);
                }
            }
        }).start();
    }
}
