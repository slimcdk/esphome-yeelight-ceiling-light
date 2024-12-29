package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.ServiceInfo;
import android.text.TextUtils;
import com.xiaomi.channel.commonutils.logger.C4408b;
import com.xiaomi.clientreport.data.Config;
import com.xiaomi.clientreport.manager.C4412a;
import com.xiaomi.clientreport.manager.ClientReportClient;
import com.xiaomi.push.C4516al;
import com.xiaomi.push.C4539ba;
import com.xiaomi.push.C4561bp;
import com.xiaomi.push.C4625dn;
import com.xiaomi.push.C4626do;
import com.xiaomi.push.C4663el;
import com.xiaomi.push.C4664em;
import com.xiaomi.push.C4665en;
import com.xiaomi.push.C4678ey;
import com.xiaomi.push.C4747h;
import com.xiaomi.push.C4760hj;
import com.xiaomi.push.C4764hn;
import com.xiaomi.push.C4765ho;
import com.xiaomi.push.C4770ht;
import com.xiaomi.push.C4773hw;
import com.xiaomi.push.C4774hx;
import com.xiaomi.push.C4781id;
import com.xiaomi.push.C4786ii;
import com.xiaomi.push.C4787ij;
import com.xiaomi.push.C4791in;
import com.xiaomi.push.C4793ip;
import com.xiaomi.push.C4795ir;
import com.xiaomi.push.C4805j;
import com.xiaomi.push.C4830m;
import com.xiaomi.push.C4832o;
import com.xiaomi.push.C4992t;
import com.xiaomi.push.C4994v;
import com.xiaomi.push.service.C4898ba;
import com.xiaomi.push.service.C4902bd;
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
            C4992t.m15731a(edit);
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
        C4992t.m15731a(edit);
    }

    private static void addRegRequestTime(Context context) {
        SharedPreferences.Editor edit = context.getSharedPreferences("mipush_extra", 0).edit();
        edit.putLong("last_reg_request", System.currentTimeMillis());
        C4992t.m15731a(edit);
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
        C4516al.m12857a(context).mo28733a((Runnable) new Runnable() {
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
                    C4408b.m12478a(th);
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
                        PushMessageHandler.m12586a(context, intent);
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

    protected static void clearExtras(Context context) {
        SharedPreferences.Editor edit = context.getSharedPreferences("mipush_extra", 0).edit();
        edit.clear();
        edit.commit();
    }

    private static void clearExtrasForInitialize(Context context) {
        SharedPreferences.Editor edit = context.getSharedPreferences("mipush_extra", 0).edit();
        for (String str : getAllAlias(context)) {
            edit.remove("alias_" + str);
        }
        for (String str2 : getAllUserAccount(context)) {
            edit.remove("account_" + str2);
        }
        for (String str3 : getAllTopic(context)) {
            edit.remove("topic_" + str3);
        }
        edit.remove(Constants.EXTRA_KEY_ACCEPT_TIME);
        edit.commit();
    }

    public static void clearLocalNotificationType(Context context) {
        C4465ao.m12646a(context).mo28678f();
    }

    public static void clearNotification(Context context) {
        C4465ao.m12646a(context).mo28654a(-1);
    }

    public static void clearNotification(Context context, int i) {
        C4465ao.m12646a(context).mo28654a(i);
    }

    public static void clearNotification(Context context, String str, String str2) {
        C4465ao.m12646a(context).mo28670a(str, str2);
    }

    public static void disablePush(Context context) {
        C4465ao.m12646a(context).mo28671a(true);
    }

    public static void enablePush(Context context) {
        C4465ao.m12646a(context).mo28671a(false);
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
        if (C4475b.m12705a(context).mo28694c()) {
            return C4475b.m12705a(context).mo28697f();
        }
        return null;
    }

    private static boolean getDefaultSwitch() {
        return C4830m.m15010b();
    }

    protected static boolean getOpenFCMPush(Context context) {
        checkNotNull(context, "context");
        return C4480f.m12751a(context).mo28712b(C4479e.ASSEMBLE_PUSH_FCM);
    }

    protected static boolean getOpenHmsPush(Context context) {
        checkNotNull(context, "context");
        return C4480f.m12751a(context).mo28712b(C4479e.ASSEMBLE_PUSH_HUAWEI);
    }

    protected static boolean getOpenOPPOPush(Context context) {
        checkNotNull(context, "context");
        return C4480f.m12751a(context).mo28712b(C4479e.ASSEMBLE_PUSH_COS);
    }

    protected static boolean getOpenVIVOPush(Context context) {
        return C4480f.m12751a(context).mo28712b(C4479e.ASSEMBLE_PUSH_FTOS);
    }

    public static String getRegId(Context context) {
        if (C4475b.m12705a(context).mo28694c()) {
            return C4475b.m12705a(context).mo28694c();
        }
        return null;
    }

    private static void initEventPerfLogic(final Context context) {
        C4665en.m13687a((C4665en.C4666a) new C4665en.C4666a() {
            public void uploader(Context context, C4764hn hnVar) {
                MiTinyDataClient.upload(context, hnVar);
            }
        });
        Config a = C4665en.m13675a(context);
        C4412a.m12487a(context).mo28473a("4_9_1");
        ClientReportClient.init(context, a, new C4663el(context), new C4664em(context));
        C4450a.m12604a(context);
        C4495t.m12812a(context, a);
        C4898ba.m15362a(context).mo29993a((C4898ba.C4899a) new C4898ba.C4899a(100, "perf event job update") {
            /* access modifiers changed from: protected */
            public void onCallback() {
                C4665en.m13675a(context);
            }
        });
    }

    @Deprecated
    public static void initialize(Context context, String str, String str2, MiPushClientCallback miPushClientCallback) {
        initialize(context, str, str2, miPushClientCallback, (String) null, (ICallbackResult) null);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x02ad A[Catch:{ all -> 0x02c4 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void initialize(android.content.Context r18, java.lang.String r19, java.lang.String r20, com.xiaomi.mipush.sdk.MiPushClient.MiPushClientCallback r21, java.lang.String r22, com.xiaomi.mipush.sdk.MiPushClient.ICallbackResult r23) {
        /*
            r0 = r19
            r1 = r20
            r2 = r21
            java.lang.String r3 = "update_devId"
            android.content.Context r4 = r18.getApplicationContext()     // Catch:{ all -> 0x02c4 }
            com.xiaomi.channel.commonutils.logger.C4408b.m12472a((android.content.Context) r4)     // Catch:{ all -> 0x02c4 }
            java.lang.String r4 = "sdk_version = 4_9_1"
            com.xiaomi.channel.commonutils.logger.C4408b.m12484e(r4)     // Catch:{ all -> 0x02c4 }
            com.xiaomi.push.ba r4 = com.xiaomi.push.C4539ba.m12950a((android.content.Context) r18)     // Catch:{ all -> 0x02c4 }
            r4.mo28753a()     // Catch:{ all -> 0x02c4 }
            com.xiaomi.push.C4612dd.m13289a(r18)     // Catch:{ all -> 0x02c4 }
            if (r2 == 0) goto L_0x0023
            com.xiaomi.mipush.sdk.PushMessageHandler.m12594a((com.xiaomi.mipush.sdk.MiPushClient.MiPushClientCallback) r21)     // Catch:{ all -> 0x02c4 }
        L_0x0023:
            if (r23 == 0) goto L_0x0028
            com.xiaomi.mipush.sdk.PushMessageHandler.m12593a((com.xiaomi.mipush.sdk.MiPushClient.ICallbackResult) r23)     // Catch:{ all -> 0x02c4 }
        L_0x0028:
            android.content.Context r4 = sContext     // Catch:{ all -> 0x02c4 }
            boolean r4 = com.xiaomi.push.C4994v.m15737a((android.content.Context) r4)     // Catch:{ all -> 0x02c4 }
            if (r4 == 0) goto L_0x0035
            android.content.Context r4 = sContext     // Catch:{ all -> 0x02c4 }
            com.xiaomi.mipush.sdk.C4497v.m12814a(r4)     // Catch:{ all -> 0x02c4 }
        L_0x0035:
            android.content.Context r4 = sContext     // Catch:{ all -> 0x02c4 }
            com.xiaomi.mipush.sdk.b r4 = com.xiaomi.mipush.sdk.C4475b.m12705a((android.content.Context) r4)     // Catch:{ all -> 0x02c4 }
            int r4 = r4.mo28684a()     // Catch:{ all -> 0x02c4 }
            int r5 = com.xiaomi.mipush.sdk.Constants.m12549a()     // Catch:{ all -> 0x02c4 }
            r6 = 1
            r7 = 0
            if (r4 == r5) goto L_0x0049
            r4 = 1
            goto L_0x004a
        L_0x0049:
            r4 = 0
        L_0x004a:
            if (r4 != 0) goto L_0x0063
            android.content.Context r5 = sContext     // Catch:{ all -> 0x02c4 }
            boolean r5 = shouldSendRegRequest(r5)     // Catch:{ all -> 0x02c4 }
            if (r5 != 0) goto L_0x0063
            android.content.Context r0 = sContext     // Catch:{ all -> 0x02c4 }
            com.xiaomi.mipush.sdk.ao r0 = com.xiaomi.mipush.sdk.C4465ao.m12646a((android.content.Context) r0)     // Catch:{ all -> 0x02c4 }
            r0.mo28653a()     // Catch:{ all -> 0x02c4 }
            java.lang.String r0 = "Could not send  register message within 5s repeatly ."
            com.xiaomi.channel.commonutils.logger.C4408b.m12464a((java.lang.String) r0)     // Catch:{ all -> 0x02c4 }
            return
        L_0x0063:
            r5 = 40091(0x9c9b, float:5.618E-41)
            java.lang.String r8 = "4_9_1"
            if (r4 != 0) goto L_0x01b2
            android.content.Context r9 = sContext     // Catch:{ all -> 0x02c4 }
            com.xiaomi.mipush.sdk.b r9 = com.xiaomi.mipush.sdk.C4475b.m12705a((android.content.Context) r9)     // Catch:{ all -> 0x02c4 }
            boolean r9 = r9.mo28690a((java.lang.String) r0, (java.lang.String) r1)     // Catch:{ all -> 0x02c4 }
            if (r9 == 0) goto L_0x01b2
            android.content.Context r9 = sContext     // Catch:{ all -> 0x02c4 }
            com.xiaomi.mipush.sdk.b r9 = com.xiaomi.mipush.sdk.C4475b.m12705a((android.content.Context) r9)     // Catch:{ all -> 0x02c4 }
            boolean r9 = r9.mo28697f()     // Catch:{ all -> 0x02c4 }
            if (r9 != 0) goto L_0x01b2
            android.content.Context r0 = sContext     // Catch:{ all -> 0x02c4 }
            int r0 = com.xiaomi.mipush.sdk.PushMessageHelper.getPushMode(r0)     // Catch:{ all -> 0x02c4 }
            r1 = 0
            if (r6 != r0) goto L_0x00a0
            java.lang.String r0 = "callback"
            checkNotNull(r2, r0)     // Catch:{ all -> 0x02c4 }
            r9 = 0
            android.content.Context r0 = sContext     // Catch:{ all -> 0x02c4 }
            com.xiaomi.mipush.sdk.b r0 = com.xiaomi.mipush.sdk.C4475b.m12705a((android.content.Context) r0)     // Catch:{ all -> 0x02c4 }
            java.lang.String r0 = r0.mo28694c()     // Catch:{ all -> 0x02c4 }
            r2.onInitializeResult(r9, r1, r0)     // Catch:{ all -> 0x02c4 }
            goto L_0x00c6
        L_0x00a0:
            java.util.ArrayList r12 = new java.util.ArrayList     // Catch:{ all -> 0x02c4 }
            r12.<init>()     // Catch:{ all -> 0x02c4 }
            android.content.Context r0 = sContext     // Catch:{ all -> 0x02c4 }
            com.xiaomi.mipush.sdk.b r0 = com.xiaomi.mipush.sdk.C4475b.m12705a((android.content.Context) r0)     // Catch:{ all -> 0x02c4 }
            java.lang.String r0 = r0.mo28694c()     // Catch:{ all -> 0x02c4 }
            r12.add(r0)     // Catch:{ all -> 0x02c4 }
            com.xiaomi.push.ey r0 = com.xiaomi.push.C4678ey.COMMAND_REGISTER     // Catch:{ all -> 0x02c4 }
            java.lang.String r11 = r0.f8040a     // Catch:{ all -> 0x02c4 }
            r13 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            com.xiaomi.mipush.sdk.MiPushCommandMessage r0 = com.xiaomi.mipush.sdk.PushMessageHelper.generateCommandMessage(r11, r12, r13, r15, r16, r17)     // Catch:{ all -> 0x02c4 }
            android.content.Context r2 = sContext     // Catch:{ all -> 0x02c4 }
            com.xiaomi.mipush.sdk.PushMessageHelper.sendCommandMessageBroadcast(r2, r0)     // Catch:{ all -> 0x02c4 }
        L_0x00c6:
            android.content.Context r0 = sContext     // Catch:{ all -> 0x02c4 }
            com.xiaomi.mipush.sdk.ao r0 = com.xiaomi.mipush.sdk.C4465ao.m12646a((android.content.Context) r0)     // Catch:{ all -> 0x02c4 }
            r0.mo28653a()     // Catch:{ all -> 0x02c4 }
            android.content.Context r0 = sContext     // Catch:{ all -> 0x02c4 }
            com.xiaomi.mipush.sdk.b r0 = com.xiaomi.mipush.sdk.C4475b.m12705a((android.content.Context) r0)     // Catch:{ all -> 0x02c4 }
            boolean r0 = r0.mo28684a()     // Catch:{ all -> 0x02c4 }
            if (r0 == 0) goto L_0x015a
            com.xiaomi.push.ii r0 = new com.xiaomi.push.ii     // Catch:{ all -> 0x02c4 }
            r0.<init>()     // Catch:{ all -> 0x02c4 }
            android.content.Context r2 = sContext     // Catch:{ all -> 0x02c4 }
            com.xiaomi.mipush.sdk.b r2 = com.xiaomi.mipush.sdk.C4475b.m12705a((android.content.Context) r2)     // Catch:{ all -> 0x02c4 }
            java.lang.String r2 = r2.mo28684a()     // Catch:{ all -> 0x02c4 }
            r0.mo29599b((java.lang.String) r2)     // Catch:{ all -> 0x02c4 }
            com.xiaomi.push.ht r2 = com.xiaomi.push.C4770ht.ClientInfoUpdate     // Catch:{ all -> 0x02c4 }
            java.lang.String r2 = r2.f8718a     // Catch:{ all -> 0x02c4 }
            r0.mo29602c((java.lang.String) r2)     // Catch:{ all -> 0x02c4 }
            java.lang.String r2 = com.xiaomi.push.service.C4902bd.m15380a()     // Catch:{ all -> 0x02c4 }
            r0.mo29593a((java.lang.String) r2)     // Catch:{ all -> 0x02c4 }
            java.util.HashMap r2 = new java.util.HashMap     // Catch:{ all -> 0x02c4 }
            r2.<init>()     // Catch:{ all -> 0x02c4 }
            r0.f8983a = r2     // Catch:{ all -> 0x02c4 }
            java.lang.String r4 = "app_version"
            android.content.Context r9 = sContext     // Catch:{ all -> 0x02c4 }
            java.lang.String r10 = r9.getPackageName()     // Catch:{ all -> 0x02c4 }
            java.lang.String r9 = com.xiaomi.push.C4747h.m14123a((android.content.Context) r9, (java.lang.String) r10)     // Catch:{ all -> 0x02c4 }
            r2.put(r4, r9)     // Catch:{ all -> 0x02c4 }
            java.util.Map<java.lang.String, java.lang.String> r2 = r0.f8983a     // Catch:{ all -> 0x02c4 }
            java.lang.String r4 = "app_version_code"
            android.content.Context r9 = sContext     // Catch:{ all -> 0x02c4 }
            java.lang.String r10 = r9.getPackageName()     // Catch:{ all -> 0x02c4 }
            int r9 = com.xiaomi.push.C4747h.m14123a((android.content.Context) r9, (java.lang.String) r10)     // Catch:{ all -> 0x02c4 }
            java.lang.String r9 = java.lang.Integer.toString(r9)     // Catch:{ all -> 0x02c4 }
            r2.put(r4, r9)     // Catch:{ all -> 0x02c4 }
            java.util.Map<java.lang.String, java.lang.String> r2 = r0.f8983a     // Catch:{ all -> 0x02c4 }
            java.lang.String r4 = "push_sdk_vn"
            r2.put(r4, r8)     // Catch:{ all -> 0x02c4 }
            java.util.Map<java.lang.String, java.lang.String> r2 = r0.f8983a     // Catch:{ all -> 0x02c4 }
            java.lang.String r4 = "push_sdk_vc"
            java.lang.String r5 = java.lang.Integer.toString(r5)     // Catch:{ all -> 0x02c4 }
            r2.put(r4, r5)     // Catch:{ all -> 0x02c4 }
            android.content.Context r2 = sContext     // Catch:{ all -> 0x02c4 }
            com.xiaomi.mipush.sdk.b r2 = com.xiaomi.mipush.sdk.C4475b.m12705a((android.content.Context) r2)     // Catch:{ all -> 0x02c4 }
            java.lang.String r2 = r2.mo28696e()     // Catch:{ all -> 0x02c4 }
            boolean r4 = android.text.TextUtils.isEmpty(r2)     // Catch:{ all -> 0x02c4 }
            if (r4 != 0) goto L_0x014f
            java.util.Map<java.lang.String, java.lang.String> r4 = r0.f8983a     // Catch:{ all -> 0x02c4 }
            java.lang.String r5 = "deviceid"
            r4.put(r5, r2)     // Catch:{ all -> 0x02c4 }
        L_0x014f:
            android.content.Context r2 = sContext     // Catch:{ all -> 0x02c4 }
            com.xiaomi.mipush.sdk.ao r2 = com.xiaomi.mipush.sdk.C4465ao.m12646a((android.content.Context) r2)     // Catch:{ all -> 0x02c4 }
            com.xiaomi.push.hj r4 = com.xiaomi.push.C4760hj.Notification     // Catch:{ all -> 0x02c4 }
            r2.mo28663a(r0, (com.xiaomi.push.C4760hj) r4, (boolean) r7, (com.xiaomi.push.C4773hw) r1)     // Catch:{ all -> 0x02c4 }
        L_0x015a:
            android.content.Context r0 = sContext     // Catch:{ all -> 0x02c4 }
            boolean r0 = com.xiaomi.push.C4831n.m15020a((android.content.Context) r0, (java.lang.String) r3, (boolean) r7)     // Catch:{ all -> 0x02c4 }
            if (r0 != 0) goto L_0x016a
            updateImeiOrOaid()     // Catch:{ all -> 0x02c4 }
            android.content.Context r0 = sContext     // Catch:{ all -> 0x02c4 }
            com.xiaomi.push.C4831n.m15020a((android.content.Context) r0, (java.lang.String) r3, (boolean) r6)     // Catch:{ all -> 0x02c4 }
        L_0x016a:
            android.content.Context r0 = sContext     // Catch:{ all -> 0x02c4 }
            boolean r0 = shouldUseMIUIPush(r0)     // Catch:{ all -> 0x02c4 }
            if (r0 == 0) goto L_0x0288
            android.content.Context r0 = sContext     // Catch:{ all -> 0x02c4 }
            boolean r0 = shouldPullNotification(r0)     // Catch:{ all -> 0x02c4 }
            if (r0 == 0) goto L_0x0288
            com.xiaomi.push.ii r2 = new com.xiaomi.push.ii     // Catch:{ all -> 0x02c4 }
            r2.<init>()     // Catch:{ all -> 0x02c4 }
            android.content.Context r0 = sContext     // Catch:{ all -> 0x02c4 }
            com.xiaomi.mipush.sdk.b r0 = com.xiaomi.mipush.sdk.C4475b.m12705a((android.content.Context) r0)     // Catch:{ all -> 0x02c4 }
            java.lang.String r0 = r0.mo28684a()     // Catch:{ all -> 0x02c4 }
            r2.mo29599b((java.lang.String) r0)     // Catch:{ all -> 0x02c4 }
            com.xiaomi.push.ht r0 = com.xiaomi.push.C4770ht.PullOfflineMessage     // Catch:{ all -> 0x02c4 }
            java.lang.String r0 = r0.f8718a     // Catch:{ all -> 0x02c4 }
            r2.mo29602c((java.lang.String) r0)     // Catch:{ all -> 0x02c4 }
            java.lang.String r0 = com.xiaomi.push.service.C4902bd.m15380a()     // Catch:{ all -> 0x02c4 }
            r2.mo29593a((java.lang.String) r0)     // Catch:{ all -> 0x02c4 }
            r2.mo29596a((boolean) r7)     // Catch:{ all -> 0x02c4 }
            android.content.Context r0 = sContext     // Catch:{ all -> 0x02c4 }
            com.xiaomi.mipush.sdk.ao r1 = com.xiaomi.mipush.sdk.C4465ao.m12646a((android.content.Context) r0)     // Catch:{ all -> 0x02c4 }
            com.xiaomi.push.hj r3 = com.xiaomi.push.C4760hj.Notification     // Catch:{ all -> 0x02c4 }
            r4 = 0
            r5 = 0
            r6 = 0
            r1.mo28664a(r2, (com.xiaomi.push.C4760hj) r3, (boolean) r4, (com.xiaomi.push.C4773hw) r5, (boolean) r6)     // Catch:{ all -> 0x02c4 }
            android.content.Context r0 = sContext     // Catch:{ all -> 0x02c4 }
            addPullNotificationTime(r0)     // Catch:{ all -> 0x02c4 }
            goto L_0x0288
        L_0x01b2:
            r2 = 6
            java.lang.String r2 = com.xiaomi.push.C4561bp.m13041a((int) r2)     // Catch:{ all -> 0x02c4 }
            android.content.Context r3 = sContext     // Catch:{ all -> 0x02c4 }
            com.xiaomi.mipush.sdk.b r3 = com.xiaomi.mipush.sdk.C4475b.m12705a((android.content.Context) r3)     // Catch:{ all -> 0x02c4 }
            r3.mo28684a()     // Catch:{ all -> 0x02c4 }
            android.content.Context r3 = sContext     // Catch:{ all -> 0x02c4 }
            com.xiaomi.mipush.sdk.b r3 = com.xiaomi.mipush.sdk.C4475b.m12705a((android.content.Context) r3)     // Catch:{ all -> 0x02c4 }
            int r7 = com.xiaomi.mipush.sdk.Constants.m12549a()     // Catch:{ all -> 0x02c4 }
            r3.mo28686a((int) r7)     // Catch:{ all -> 0x02c4 }
            android.content.Context r3 = sContext     // Catch:{ all -> 0x02c4 }
            com.xiaomi.mipush.sdk.b r3 = com.xiaomi.mipush.sdk.C4475b.m12705a((android.content.Context) r3)     // Catch:{ all -> 0x02c4 }
            r3.mo28688a((java.lang.String) r0, (java.lang.String) r1, (java.lang.String) r2)     // Catch:{ all -> 0x02c4 }
            com.xiaomi.mipush.sdk.MiTinyDataClient$a r3 = com.xiaomi.mipush.sdk.MiTinyDataClient.C4447a.mo28603a()     // Catch:{ all -> 0x02c4 }
            java.lang.String r7 = "com.xiaomi.xmpushsdk.tinydataPending.appId"
            r3.mo28605b((java.lang.String) r7)     // Catch:{ all -> 0x02c4 }
            android.content.Context r3 = sContext     // Catch:{ all -> 0x02c4 }
            clearExtras(r3)     // Catch:{ all -> 0x02c4 }
            clearNotification(r18)     // Catch:{ all -> 0x02c4 }
            com.xiaomi.push.ij r3 = new com.xiaomi.push.ij     // Catch:{ all -> 0x02c4 }
            r3.<init>()     // Catch:{ all -> 0x02c4 }
            java.lang.String r7 = com.xiaomi.push.service.C4902bd.m15382b()     // Catch:{ all -> 0x02c4 }
            r3.mo29628a((java.lang.String) r7)     // Catch:{ all -> 0x02c4 }
            r3.mo29632b((java.lang.String) r0)     // Catch:{ all -> 0x02c4 }
            r3.mo29643e((java.lang.String) r1)     // Catch:{ all -> 0x02c4 }
            android.content.Context r0 = sContext     // Catch:{ all -> 0x02c4 }
            java.lang.String r0 = r0.getPackageName()     // Catch:{ all -> 0x02c4 }
            r3.mo29640d((java.lang.String) r0)     // Catch:{ all -> 0x02c4 }
            r3.mo29647f((java.lang.String) r2)     // Catch:{ all -> 0x02c4 }
            android.content.Context r0 = sContext     // Catch:{ all -> 0x02c4 }
            java.lang.String r1 = r0.getPackageName()     // Catch:{ all -> 0x02c4 }
            java.lang.String r0 = com.xiaomi.push.C4747h.m14123a((android.content.Context) r0, (java.lang.String) r1)     // Catch:{ all -> 0x02c4 }
            r3.mo29636c((java.lang.String) r0)     // Catch:{ all -> 0x02c4 }
            android.content.Context r0 = sContext     // Catch:{ all -> 0x02c4 }
            java.lang.String r1 = r0.getPackageName()     // Catch:{ all -> 0x02c4 }
            int r0 = com.xiaomi.push.C4747h.m14123a((android.content.Context) r0, (java.lang.String) r1)     // Catch:{ all -> 0x02c4 }
            r3.mo29631b((int) r0)     // Catch:{ all -> 0x02c4 }
            r3.mo29653h((java.lang.String) r8)     // Catch:{ all -> 0x02c4 }
            r3.mo29626a((int) r5)     // Catch:{ all -> 0x02c4 }
            com.xiaomi.push.hx r0 = com.xiaomi.push.C4774hx.Init     // Catch:{ all -> 0x02c4 }
            r3.mo29627a((com.xiaomi.push.C4774hx) r0)     // Catch:{ all -> 0x02c4 }
            boolean r0 = android.text.TextUtils.isEmpty(r22)     // Catch:{ all -> 0x02c4 }
            if (r0 != 0) goto L_0x0235
            r0 = r22
            r3.mo29650g((java.lang.String) r0)     // Catch:{ all -> 0x02c4 }
        L_0x0235:
            boolean r0 = com.xiaomi.push.C4830m.m15015d()     // Catch:{ all -> 0x02c4 }
            if (r0 != 0) goto L_0x0268
            android.content.Context r0 = sContext     // Catch:{ all -> 0x02c4 }
            java.lang.String r0 = com.xiaomi.push.C4805j.m14881e(r0)     // Catch:{ all -> 0x02c4 }
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x02c4 }
            if (r1 != 0) goto L_0x0268
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x02c4 }
            r1.<init>()     // Catch:{ all -> 0x02c4 }
            java.lang.String r0 = com.xiaomi.push.C4561bp.m13042a((java.lang.String) r0)     // Catch:{ all -> 0x02c4 }
            r1.append(r0)     // Catch:{ all -> 0x02c4 }
            java.lang.String r0 = ","
            r1.append(r0)     // Catch:{ all -> 0x02c4 }
            android.content.Context r0 = sContext     // Catch:{ all -> 0x02c4 }
            java.lang.String r0 = com.xiaomi.push.C4805j.m14884h(r0)     // Catch:{ all -> 0x02c4 }
            r1.append(r0)     // Catch:{ all -> 0x02c4 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x02c4 }
            r3.mo29657i(r0)     // Catch:{ all -> 0x02c4 }
        L_0x0268:
            int r0 = com.xiaomi.push.C4805j.m14859a()     // Catch:{ all -> 0x02c4 }
            if (r0 < 0) goto L_0x0271
            r3.mo29635c((int) r0)     // Catch:{ all -> 0x02c4 }
        L_0x0271:
            android.content.Context r0 = sContext     // Catch:{ all -> 0x02c4 }
            com.xiaomi.mipush.sdk.ao r0 = com.xiaomi.mipush.sdk.C4465ao.m12646a((android.content.Context) r0)     // Catch:{ all -> 0x02c4 }
            r0.mo28659a((com.xiaomi.push.C4787ij) r3, (boolean) r4)     // Catch:{ all -> 0x02c4 }
            android.content.Context r0 = sContext     // Catch:{ all -> 0x02c4 }
            java.lang.String r1 = "mipush_extra"
            r2 = 4
            android.content.SharedPreferences r0 = r0.getSharedPreferences(r1, r2)     // Catch:{ all -> 0x02c4 }
            java.lang.String r1 = "mipush_registed"
            r0.getBoolean(r1, r6)     // Catch:{ all -> 0x02c4 }
        L_0x0288:
            android.content.Context r0 = sContext     // Catch:{ all -> 0x02c4 }
            addRegRequestTime(r0)     // Catch:{ all -> 0x02c4 }
            scheduleOcVersionCheckJob()     // Catch:{ all -> 0x02c4 }
            android.content.Context r0 = sContext     // Catch:{ all -> 0x02c4 }
            scheduleDataCollectionJobs(r0)     // Catch:{ all -> 0x02c4 }
            android.content.Context r0 = sContext     // Catch:{ all -> 0x02c4 }
            initEventPerfLogic(r0)     // Catch:{ all -> 0x02c4 }
            android.content.Context r0 = sContext     // Catch:{ all -> 0x02c4 }
            com.xiaomi.mipush.sdk.C4473av.m12699a((android.content.Context) r0)     // Catch:{ all -> 0x02c4 }
            android.content.Context r0 = sContext     // Catch:{ all -> 0x02c4 }
            java.lang.String r0 = r0.getPackageName()     // Catch:{ all -> 0x02c4 }
            java.lang.String r1 = "com.xiaomi.xmsf"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x02c4 }
            if (r0 != 0) goto L_0x02c0
            com.xiaomi.channel.commonutils.logger.LoggerInterface r0 = com.xiaomi.mipush.sdk.Logger.getUserLogger()     // Catch:{ all -> 0x02c4 }
            if (r0 == 0) goto L_0x02bc
            android.content.Context r0 = sContext     // Catch:{ all -> 0x02c4 }
            com.xiaomi.channel.commonutils.logger.LoggerInterface r1 = com.xiaomi.mipush.sdk.Logger.getUserLogger()     // Catch:{ all -> 0x02c4 }
            com.xiaomi.mipush.sdk.Logger.setLogger(r0, r1)     // Catch:{ all -> 0x02c4 }
        L_0x02bc:
            r0 = 2
            com.xiaomi.channel.commonutils.logger.C4408b.m12468a((int) r0)     // Catch:{ all -> 0x02c4 }
        L_0x02c0:
            operateSyncAction(r18)     // Catch:{ all -> 0x02c4 }
            goto L_0x02c8
        L_0x02c4:
            r0 = move-exception
            com.xiaomi.channel.commonutils.logger.C4408b.m12478a((java.lang.Throwable) r0)
        L_0x02c8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.mipush.sdk.MiPushClient.initialize(android.content.Context, java.lang.String, java.lang.String, com.xiaomi.mipush.sdk.MiPushClient$MiPushClientCallback, java.lang.String, com.xiaomi.mipush.sdk.MiPushClient$ICallbackResult):void");
    }

    private static void operateSyncAction(Context context) {
        if ("syncing".equals(C4456af.m12606a(sContext).mo28646a(C4472au.DISABLE_PUSH))) {
            disablePush(sContext);
        }
        if ("syncing".equals(C4456af.m12606a(sContext).mo28646a(C4472au.ENABLE_PUSH))) {
            enablePush(sContext);
        }
        if ("syncing".equals(C4456af.m12606a(sContext).mo28646a(C4472au.UPLOAD_HUAWEI_TOKEN))) {
            syncAssemblePushToken(sContext);
        }
        if ("syncing".equals(C4456af.m12606a(sContext).mo28646a(C4472au.UPLOAD_FCM_TOKEN))) {
            syncAssembleFCMPushToken(sContext);
        }
        if ("syncing".equals(C4456af.m12606a(sContext).mo28646a(C4472au.UPLOAD_COS_TOKEN))) {
            syncAssembleCOSPushToken(context);
        }
        if ("syncing".equals(C4456af.m12606a(sContext).mo28646a(C4472au.UPLOAD_FTOS_TOKEN))) {
            syncAssembleFTOSPushToken(context);
        }
    }

    public static void pausePush(Context context, String str) {
        setAcceptTime(context, 0, 0, 0, 0, str);
    }

    static void reInitialize(Context context, C4774hx hxVar) {
        C4408b.m12484e("re-register reason: " + hxVar);
        String a = C4561bp.m13041a(6);
        String a2 = C4475b.m12705a(context).mo28684a();
        String b = C4475b.m12705a(context).mo28691b();
        C4475b.m12705a(context).mo28684a();
        clearExtrasForInitialize(context);
        clearNotification(context);
        C4475b.m12705a(context).mo28686a(Constants.m12549a());
        C4475b.m12705a(context).mo28688a(a2, b, a);
        C4787ij ijVar = new C4787ij();
        ijVar.mo29628a(C4902bd.m15382b());
        ijVar.mo29632b(a2);
        ijVar.mo29643e(b);
        ijVar.mo29647f(a);
        ijVar.mo29640d(context.getPackageName());
        ijVar.mo29636c(C4747h.m14123a(context, context.getPackageName()));
        ijVar.mo29631b(C4747h.m14123a(context, context.getPackageName()));
        ijVar.mo29653h("4_9_1");
        ijVar.mo29626a(40091);
        ijVar.mo29627a(hxVar);
        int a3 = C4805j.m14859a();
        if (a3 >= 0) {
            ijVar.mo29635c(a3);
        }
        C4465ao.m12646a(context).mo28659a(ijVar, false);
    }

    @Deprecated
    public static void registerCrashHandler(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        Thread.setDefaultUncaughtExceptionHandler(uncaughtExceptionHandler);
    }

    private static void registerNetworkReceiver(Context context) {
        try {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            intentFilter.addCategory("android.intent.category.DEFAULT");
            C4832o.m15023a(context.getApplicationContext(), new NetworkStatusReceiver((Object) null), intentFilter);
            C4832o.m15027a(context, (Class<?>) NetworkStatusReceiver.class);
        } catch (Throwable th) {
            C4408b.m12464a("dynamic register network status receiver failed:" + th);
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
        C4994v.m15737a(context2);
        if (!NetworkStatusReceiver.m15665a()) {
            registerNetworkReceiver(sContext);
        }
        C4480f.m12751a(sContext).mo28710a(pushConfiguration);
        C4516al.m12857a(context2).mo28733a((Runnable) new Runnable() {
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
            C4992t.m15731a(edit);
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

    public static void removeWindow(Context context) {
        C4465ao.m12646a(context).mo28677e();
    }

    public static void reportAppRunInBackground(Context context, boolean z) {
        if (C4475b.m12705a(context).mo28691b()) {
            C4770ht htVar = z ? C4770ht.APP_SLEEP : C4770ht.APP_WAKEUP;
            C4786ii iiVar = new C4786ii();
            iiVar.mo29599b(C4475b.m12705a(context).mo28684a());
            iiVar.mo29602c(htVar.f8718a);
            iiVar.mo29606d(context.getPackageName());
            iiVar.mo29593a(C4902bd.m15380a());
            iiVar.mo29596a(false);
            C4465ao.m12646a(context).mo28664a(iiVar, C4760hj.Notification, false, (C4773hw) null, false);
        }
    }

    static void reportIgnoreRegMessageClicked(Context context, String str, C4773hw hwVar, String str2, String str3) {
        C4786ii iiVar = new C4786ii();
        if (TextUtils.isEmpty(str3)) {
            C4408b.m12483d("do not report clicked message");
            return;
        }
        iiVar.mo29599b(str3);
        iiVar.mo29602c("bar:click");
        iiVar.mo29593a(str);
        iiVar.mo29596a(false);
        C4465ao.m12646a(context).mo28666a(iiVar, C4760hj.Notification, false, true, hwVar, true, str2, str3);
    }

    public static void reportMessageClicked(Context context, MiPushMessage miPushMessage) {
        C4773hw hwVar = new C4773hw();
        hwVar.mo29395a(miPushMessage.getMessageId());
        hwVar.mo29401b(miPushMessage.getTopic());
        hwVar.mo29409d(miPushMessage.getDescription());
        hwVar.mo29406c(miPushMessage.getTitle());
        hwVar.mo29405c(miPushMessage.getNotifyId());
        hwVar.mo29394a(miPushMessage.getNotifyType());
        hwVar.mo29400b(miPushMessage.getPassThrough());
        hwVar.mo29396a(miPushMessage.getExtra());
        reportMessageClicked(context, miPushMessage.getMessageId(), hwVar, (String) null);
    }

    @Deprecated
    public static void reportMessageClicked(Context context, String str) {
        reportMessageClicked(context, str, (C4773hw) null, (String) null);
    }

    static void reportMessageClicked(Context context, String str, C4773hw hwVar, String str2) {
        C4786ii iiVar = new C4786ii();
        if (TextUtils.isEmpty(str2)) {
            if (C4475b.m12705a(context).mo28691b()) {
                str2 = C4475b.m12705a(context).mo28684a();
            } else {
                C4408b.m12483d("do not report clicked message");
                return;
            }
        }
        iiVar.mo29599b(str2);
        iiVar.mo29602c("bar:click");
        iiVar.mo29593a(str);
        iiVar.mo29596a(false);
        C4465ao.m12646a(context).mo28663a(iiVar, C4760hj.Notification, false, hwVar);
    }

    public static void resumePush(Context context, String str) {
        setAcceptTime(context, 0, 0, 23, 59, str);
    }

    private static void scheduleDataCollectionJobs(Context context) {
        if (C4898ba.m15362a(sContext).mo29996a(C4765ho.DataCollectionSwitch.mo29322a(), getDefaultSwitch())) {
            C4625dn.mo28915a().mo28916a(new C4493r(context));
            C4516al.m12857a(sContext).mo28734a((Runnable) new Runnable() {
                public void run() {
                    C4626do.m13331a(MiPushClient.sContext);
                }
            }, 10);
        }
    }

    private static void scheduleOcVersionCheckJob() {
        C4516al.m12857a(sContext).mo28737a(new C4455ae(sContext), C4898ba.m15362a(sContext).mo29988a(C4765ho.OcVersionCheckFrequency.mo29322a(), 86400), 5);
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
            setCommand(context2, C4678ey.COMMAND_SET_ACCEPT_TIME.f8040a, (ArrayList<String>) arrayList, str);
        } else if (1 == PushMessageHelper.getPushMode(context)) {
            PushMessageHandler.m12592a(context, str, C4678ey.COMMAND_SET_ACCEPT_TIME.f8040a, 0, (String) null, arrayList2);
        } else {
            PushMessageHelper.sendCommandMessageBroadcast(context2, PushMessageHelper.generateCommandMessage(C4678ey.COMMAND_SET_ACCEPT_TIME.f8040a, arrayList2, 0, (String) null, (String) null, (List<String>) null));
        }
    }

    public static void setAlias(Context context, String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            setCommand(context, C4678ey.COMMAND_SET_ALIAS.f8040a, str, str2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x003e, code lost:
        com.xiaomi.mipush.sdk.PushMessageHelper.sendCommandMessageBroadcast(r12, com.xiaomi.mipush.sdk.PushMessageHelper.generateCommandMessage(r0.f8040a, r6, 0, (java.lang.String) null, r15, (java.util.List<java.lang.String>) null));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00a9, code lost:
        if (1 == com.xiaomi.mipush.sdk.PushMessageHelper.getPushMode(r12)) goto L_0x0033;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0031, code lost:
        if (1 == com.xiaomi.mipush.sdk.PushMessageHelper.getPushMode(r12)) goto L_0x0033;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected static void setCommand(android.content.Context r12, java.lang.String r13, java.lang.String r14, java.lang.String r15) {
        /*
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            boolean r0 = android.text.TextUtils.isEmpty(r14)
            if (r0 != 0) goto L_0x000e
            r6.add(r14)
        L_0x000e:
            com.xiaomi.push.ey r0 = com.xiaomi.push.C4678ey.COMMAND_SET_ALIAS
            java.lang.String r1 = r0.f8040a
            boolean r1 = r1.equalsIgnoreCase(r13)
            r2 = 1
            if (r1 == 0) goto L_0x0050
            long r3 = java.lang.System.currentTimeMillis()
            long r7 = aliasSetTime(r12, r14)
            long r3 = r3 - r7
            long r3 = java.lang.Math.abs(r3)
            r7 = 86400000(0x5265c00, double:4.2687272E-316)
            int r1 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r1 >= 0) goto L_0x0050
            int r14 = com.xiaomi.mipush.sdk.PushMessageHelper.getPushMode(r12)
            if (r2 != r14) goto L_0x003e
        L_0x0033:
            r3 = 0
            r5 = 0
            r0 = r12
            r1 = r15
            r2 = r13
            com.xiaomi.mipush.sdk.PushMessageHandler.m12592a(r0, r1, r2, r3, r5, r6)
            goto L_0x00c9
        L_0x003e:
            java.lang.String r0 = r0.f8040a
            r2 = 0
            r4 = 0
            r13 = 0
            r1 = r6
            r5 = r15
            r6 = r13
            com.xiaomi.mipush.sdk.MiPushCommandMessage r13 = com.xiaomi.mipush.sdk.PushMessageHelper.generateCommandMessage(r0, r1, r2, r4, r5, r6)
            com.xiaomi.mipush.sdk.PushMessageHelper.sendCommandMessageBroadcast(r12, r13)
            goto L_0x00c9
        L_0x0050:
            com.xiaomi.push.ey r0 = com.xiaomi.push.C4678ey.COMMAND_UNSET_ALIAS
            java.lang.String r0 = r0.f8040a
            boolean r0 = r0.equalsIgnoreCase(r13)
            java.lang.String r1 = " is unseted"
            r3 = 3
            r4 = 0
            if (r0 == 0) goto L_0x0087
            long r7 = aliasSetTime(r12, r14)
            int r0 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x0087
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "Don't cancel alias for "
        L_0x006e:
            r12.append(r13)
            java.lang.String r13 = r6.toString()
            java.lang.String r13 = com.xiaomi.push.C4561bp.m13043a((java.lang.String) r13, (int) r3)
            r12.append(r13)
            r12.append(r1)
            java.lang.String r12 = r12.toString()
            com.xiaomi.channel.commonutils.logger.C4408b.m12464a((java.lang.String) r12)
            goto L_0x00c9
        L_0x0087:
            com.xiaomi.push.ey r0 = com.xiaomi.push.C4678ey.COMMAND_SET_ACCOUNT
            java.lang.String r7 = r0.f8040a
            boolean r7 = r7.equalsIgnoreCase(r13)
            if (r7 == 0) goto L_0x00ac
            long r7 = java.lang.System.currentTimeMillis()
            long r9 = accountSetTime(r12, r14)
            long r7 = r7 - r9
            long r7 = java.lang.Math.abs(r7)
            r9 = 3600000(0x36ee80, double:1.7786363E-317)
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 >= 0) goto L_0x00ac
            int r14 = com.xiaomi.mipush.sdk.PushMessageHelper.getPushMode(r12)
            if (r2 != r14) goto L_0x003e
            goto L_0x0033
        L_0x00ac:
            com.xiaomi.push.ey r0 = com.xiaomi.push.C4678ey.COMMAND_UNSET_ACCOUNT
            java.lang.String r0 = r0.f8040a
            boolean r0 = r0.equalsIgnoreCase(r13)
            if (r0 == 0) goto L_0x00c6
            long r7 = accountSetTime(r12, r14)
            int r14 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r14 >= 0) goto L_0x00c6
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "Don't cancel account for "
            goto L_0x006e
        L_0x00c6:
            setCommand((android.content.Context) r12, (java.lang.String) r13, (java.util.ArrayList<java.lang.String>) r6, (java.lang.String) r15)
        L_0x00c9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.mipush.sdk.MiPushClient.setCommand(android.content.Context, java.lang.String, java.lang.String, java.lang.String):void");
    }

    protected static void setCommand(Context context, String str, ArrayList<String> arrayList, String str2) {
        if (!TextUtils.isEmpty(C4475b.m12705a(context).mo28684a())) {
            C4781id idVar = new C4781id();
            String a = C4902bd.m15380a();
            idVar.mo29518a(a);
            idVar.mo29521b(C4475b.m12705a(context).mo28684a());
            idVar.mo29524c(str);
            Iterator<String> it = arrayList.iterator();
            while (it.hasNext()) {
                idVar.mo29518a(it.next());
            }
            idVar.mo29530e(str2);
            idVar.mo29528d(context.getPackageName());
            C4408b.m12484e("cmd:" + str + ", " + a);
            C4465ao.m12646a(context).mo28661a(idVar, C4760hj.Command, (C4773hw) null);
        }
    }

    public static void setLocalNotificationType(Context context, int i) {
        C4465ao.m12646a(context).mo28674b(i & -1);
    }

    public static void setUserAccount(Context context, String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            setCommand(context, C4678ey.COMMAND_SET_ACCOUNT.f8040a, str, str2);
        }
    }

    private static boolean shouldPullNotification(Context context) {
        return Math.abs(System.currentTimeMillis() - context.getSharedPreferences("mipush_extra", 0).getLong("last_pull_notification", -1)) > Constants.ASSEMBLE_PUSH_NETWORK_INTERVAL;
    }

    private static boolean shouldSendRegRequest(Context context) {
        return Math.abs(System.currentTimeMillis() - context.getSharedPreferences("mipush_extra", 0).getLong("last_reg_request", -1)) > 5000;
    }

    public static boolean shouldUseMIUIPush(Context context) {
        return C4465ao.m12646a(context).mo28653a();
    }

    public static void subscribe(Context context, String str, String str2) {
        String str3 = str;
        if (!TextUtils.isEmpty(C4475b.m12705a(context).mo28684a()) && !TextUtils.isEmpty(str)) {
            if (Math.abs(System.currentTimeMillis() - topicSubscribedTime(context, str)) > 86400000) {
                C4791in inVar = new C4791in();
                String a = C4902bd.m15380a();
                inVar.mo29740a(a);
                inVar.mo29742b(C4475b.m12705a(context).mo28684a());
                inVar.mo29744c(str);
                inVar.mo29747d(context.getPackageName());
                inVar.mo29749e(str2);
                C4408b.m12484e("cmd:" + C4678ey.COMMAND_SUBSCRIBE_TOPIC + ", " + a);
                C4465ao.m12646a(context).mo28661a(inVar, C4760hj.Subscription, (C4773hw) null);
                return;
            }
            String str4 = str2;
            if (1 == PushMessageHelper.getPushMode(context)) {
                PushMessageHandler.m12591a(context, str2, 0, (String) null, str);
                return;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(str);
            Context context2 = context;
            PushMessageHelper.sendCommandMessageBroadcast(context, PushMessageHelper.generateCommandMessage(C4678ey.COMMAND_SUBSCRIBE_TOPIC.f8040a, arrayList, 0, (String) null, (String) null, (List<String>) null));
        }
    }

    public static void syncAssembleCOSPushToken(Context context) {
        C4465ao.m12646a(context).mo28669a((String) null, C4472au.UPLOAD_COS_TOKEN, C4479e.ASSEMBLE_PUSH_COS);
    }

    public static void syncAssembleFCMPushToken(Context context) {
        C4465ao.m12646a(context).mo28669a((String) null, C4472au.UPLOAD_FCM_TOKEN, C4479e.ASSEMBLE_PUSH_FCM);
    }

    public static void syncAssembleFTOSPushToken(Context context) {
        C4465ao.m12646a(context).mo28669a((String) null, C4472au.UPLOAD_FTOS_TOKEN, C4479e.ASSEMBLE_PUSH_FTOS);
    }

    public static void syncAssemblePushToken(Context context) {
        C4465ao.m12646a(context).mo28669a((String) null, C4472au.UPLOAD_HUAWEI_TOKEN, C4479e.ASSEMBLE_PUSH_HUAWEI);
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
        C4483i.m12784c(context);
        C4898ba.m15362a(context).mo29992a();
        if (C4475b.m12705a(context).mo28691b()) {
            C4793ip ipVar = new C4793ip();
            ipVar.mo29773a(C4902bd.m15380a());
            ipVar.mo29776b(C4475b.m12705a(context).mo28684a());
            ipVar.mo29779c(C4475b.m12705a(context).mo28694c());
            ipVar.mo29784e(C4475b.m12705a(context).mo28691b());
            ipVar.mo29782d(context.getPackageName());
            C4465ao.m12646a(context).mo28660a(ipVar);
            PushMessageHandler.mo28523a();
            PushMessageHandler.m12596b();
            C4475b.m12705a(context).mo28691b();
            clearLocalNotificationType(context);
            clearNotification(context);
            clearExtras(context);
        }
    }

    public static void unsetAlias(Context context, String str, String str2) {
        setCommand(context, C4678ey.COMMAND_UNSET_ALIAS.f8040a, str, str2);
    }

    public static void unsetUserAccount(Context context, String str, String str2) {
        setCommand(context, C4678ey.COMMAND_UNSET_ACCOUNT.f8040a, str, str2);
    }

    public static void unsubscribe(Context context, String str, String str2) {
        if (C4475b.m12705a(context).mo28691b()) {
            if (topicSubscribedTime(context, str) < 0) {
                C4408b.m12464a("Don't cancel subscribe for " + str + " is unsubscribed");
                return;
            }
            C4795ir irVar = new C4795ir();
            String a = C4902bd.m15380a();
            irVar.mo29814a(a);
            irVar.mo29816b(C4475b.m12705a(context).mo28684a());
            irVar.mo29818c(str);
            irVar.mo29821d(context.getPackageName());
            irVar.mo29823e(str2);
            C4408b.m12484e("cmd:" + C4678ey.COMMAND_UNSUBSCRIBE_TOPIC + ", " + a);
            C4465ao.m12646a(context).mo28661a(irVar, C4760hj.UnSubscription, (C4773hw) null);
        }
    }

    private static void updateImeiOrOaid() {
        new Thread(new Runnable() {
            public void run() {
                if (C4830m.m15015d()) {
                    return;
                }
                if (C4805j.m14879d(MiPushClient.sContext) != null || C4539ba.m12950a(MiPushClient.sContext).mo28753a()) {
                    C4786ii iiVar = new C4786ii();
                    iiVar.mo29599b(C4475b.m12705a(MiPushClient.sContext).mo28684a());
                    iiVar.mo29602c(C4770ht.ClientInfoUpdate.f8718a);
                    iiVar.mo29593a(C4902bd.m15380a());
                    iiVar.mo29595a((Map<String, String>) new HashMap());
                    String str = "";
                    String d = C4805j.m14879d(MiPushClient.sContext);
                    if (!TextUtils.isEmpty(d)) {
                        str = str + C4561bp.m13042a(d);
                    }
                    String f = C4805j.m14882f(MiPushClient.sContext);
                    if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(f)) {
                        str = str + Constants.ACCEPT_TIME_SEPARATOR_SP + f;
                    }
                    if (!TextUtils.isEmpty(str)) {
                        iiVar.mo29592a().put(Constants.EXTRA_KEY_IMEI_MD5, str);
                    }
                    C4539ba.m12950a(MiPushClient.sContext).mo28767a((Map<String, String>) iiVar.mo29592a());
                    int a = C4805j.m14859a();
                    if (a >= 0) {
                        iiVar.mo29592a().put("space_id", Integer.toString(a));
                    }
                    C4465ao.m12646a(MiPushClient.sContext).mo28663a(iiVar, C4760hj.Notification, false, (C4773hw) null);
                }
            }
        }).start();
    }
}
