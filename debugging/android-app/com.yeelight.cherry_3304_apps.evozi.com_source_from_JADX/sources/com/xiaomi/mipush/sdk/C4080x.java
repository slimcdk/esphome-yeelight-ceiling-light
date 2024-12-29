package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PermissionInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

/* renamed from: com.xiaomi.mipush.sdk.x */
public class C4080x {

    /* renamed from: com.xiaomi.mipush.sdk.x$a */
    public static class C4081a extends RuntimeException {
        public C4081a(String str) {
            super(str);
        }
    }

    /* renamed from: com.xiaomi.mipush.sdk.x$b */
    public static class C4082b {

        /* renamed from: a */
        public String f6963a;

        /* renamed from: a */
        public boolean f6964a;

        /* renamed from: b */
        public String f6965b;

        /* renamed from: b */
        public boolean f6966b;

        public C4082b(String str, boolean z, boolean z2, String str2) {
            this.f6963a = str;
            this.f6964a = z;
            this.f6966b = z2;
            this.f6965b = str2;
        }
    }

    /* renamed from: a */
    private static ActivityInfo m10994a(PackageManager packageManager, Intent intent, Class<?> cls) {
        for (ResolveInfo resolveInfo : packageManager.queryBroadcastReceivers(intent, 16384)) {
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            if (activityInfo != null && cls.getCanonicalName().equals(activityInfo.name)) {
                return activityInfo;
            }
        }
        return null;
    }

    /* renamed from: a */
    public static void m10995a(Context context) {
        new Thread(new C4083y(context)).start();
    }

    /* renamed from: a */
    private static void m10997a(Context context, String str, String str2) {
        PackageManager packageManager = context.getPackageManager();
        String packageName = context.getPackageName();
        Intent intent = new Intent(str);
        intent.setPackage(packageName);
        boolean z = false;
        for (ResolveInfo resolveInfo : packageManager.queryBroadcastReceivers(intent, 16384)) {
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            if (activityInfo == null || TextUtils.isEmpty(activityInfo.name) || !activityInfo.name.equals(str2)) {
                z = false;
                continue;
            } else {
                z = true;
                continue;
            }
            if (z) {
                break;
            }
        }
        if (!z) {
            throw new C4081a(String.format("<receiver android:name=\"%1$s\" .../> is missing or disabled in AndroidManifest.", new Object[]{str2}));
        }
    }

    /* renamed from: a */
    private static void m10998a(ActivityInfo activityInfo, Boolean[] boolArr) {
        if (boolArr[0].booleanValue() != activityInfo.enabled) {
            throw new C4081a(String.format("<receiver android:name=\"%1$s\" .../> in AndroidManifest had the wrong enabled attribute, which should be android:enabled=%2$b.", new Object[]{activityInfo.name, boolArr[0]}));
        } else if (boolArr[1].booleanValue() != activityInfo.exported) {
            throw new C4081a(String.format("<receiver android:name=\"%1$s\" .../> in AndroidManifest had the wrong exported attribute, which should be android:exported=%2$b.", new Object[]{activityInfo.name, boolArr[1]}));
        }
    }

    /* renamed from: a */
    private static boolean m10999a(PackageInfo packageInfo, String[] strArr) {
        for (ServiceInfo serviceInfo : packageInfo.services) {
            if (m11000a(strArr, serviceInfo.name)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    private static boolean m11000a(String[] strArr, String str) {
        if (!(strArr == null || str == null)) {
            for (String equals : strArr) {
                if (TextUtils.equals(equals, str)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00a2 A[EDGE_INSN: B:39:0x00a2->B:29:0x00a2 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x006e A[SYNTHETIC] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m11003c(android.content.Context r8) {
        /*
            java.lang.String r0 = "com.xiaomi.push.service.receivers.PingReceiver"
            android.content.pm.PackageManager r1 = r8.getPackageManager()
            java.lang.String r2 = r8.getPackageName()
            android.content.Intent r3 = new android.content.Intent
            java.lang.String r4 = com.xiaomi.push.service.C4870at.f10040o
            r3.<init>(r4)
            r3.setPackage(r2)
            r4 = 1
            r5 = 0
            java.lang.Class r6 = com.xiaomi.push.C4937t.m15867a(r8, r0)     // Catch:{ ClassNotFoundException -> 0x0055 }
            android.content.pm.ActivityInfo r3 = m10994a((android.content.pm.PackageManager) r1, (android.content.Intent) r3, (java.lang.Class<?>) r6)     // Catch:{ ClassNotFoundException -> 0x0055 }
            boolean r6 = com.xiaomi.mipush.sdk.MiPushClient.shouldUseMIUIPush(r8)     // Catch:{ ClassNotFoundException -> 0x0055 }
            r7 = 2
            if (r6 != 0) goto L_0x0045
            if (r3 == 0) goto L_0x0035
            java.lang.Boolean[] r0 = new java.lang.Boolean[r7]     // Catch:{ ClassNotFoundException -> 0x0055 }
            java.lang.Boolean r6 = java.lang.Boolean.TRUE     // Catch:{ ClassNotFoundException -> 0x0055 }
            r0[r5] = r6     // Catch:{ ClassNotFoundException -> 0x0055 }
            java.lang.Boolean r6 = java.lang.Boolean.FALSE     // Catch:{ ClassNotFoundException -> 0x0055 }
            r0[r4] = r6     // Catch:{ ClassNotFoundException -> 0x0055 }
            m10998a((android.content.pm.ActivityInfo) r3, (java.lang.Boolean[]) r0)     // Catch:{ ClassNotFoundException -> 0x0055 }
            goto L_0x0059
        L_0x0035:
            com.xiaomi.mipush.sdk.x$a r3 = new com.xiaomi.mipush.sdk.x$a     // Catch:{ ClassNotFoundException -> 0x0055 }
            java.lang.String r6 = "<receiver android:name=\"%1$s\" .../> is missing or disabled in AndroidManifest."
            java.lang.Object[] r7 = new java.lang.Object[r4]     // Catch:{ ClassNotFoundException -> 0x0055 }
            r7[r5] = r0     // Catch:{ ClassNotFoundException -> 0x0055 }
            java.lang.String r0 = java.lang.String.format(r6, r7)     // Catch:{ ClassNotFoundException -> 0x0055 }
            r3.<init>(r0)     // Catch:{ ClassNotFoundException -> 0x0055 }
            throw r3     // Catch:{ ClassNotFoundException -> 0x0055 }
        L_0x0045:
            if (r3 == 0) goto L_0x0059
            java.lang.Boolean[] r0 = new java.lang.Boolean[r7]     // Catch:{ ClassNotFoundException -> 0x0055 }
            java.lang.Boolean r6 = java.lang.Boolean.TRUE     // Catch:{ ClassNotFoundException -> 0x0055 }
            r0[r5] = r6     // Catch:{ ClassNotFoundException -> 0x0055 }
            java.lang.Boolean r6 = java.lang.Boolean.FALSE     // Catch:{ ClassNotFoundException -> 0x0055 }
            r0[r4] = r6     // Catch:{ ClassNotFoundException -> 0x0055 }
            m10998a((android.content.pm.ActivityInfo) r3, (java.lang.Boolean[]) r0)     // Catch:{ ClassNotFoundException -> 0x0055 }
            goto L_0x0059
        L_0x0055:
            r0 = move-exception
            com.xiaomi.channel.commonutils.logger.C3989b.m10678a((java.lang.Throwable) r0)
        L_0x0059:
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r3 = "com.xiaomi.mipush.RECEIVE_MESSAGE"
            r0.<init>(r3)
            r0.setPackage(r2)
            r2 = 16384(0x4000, float:2.2959E-41)
            java.util.List r0 = r1.queryBroadcastReceivers(r0, r2)
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
        L_0x006e:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x00a2
            java.lang.Object r2 = r0.next()
            android.content.pm.ResolveInfo r2 = (android.content.pm.ResolveInfo) r2
            android.content.pm.ActivityInfo r2 = r2.activityInfo
            if (r2 == 0) goto L_0x009f
            java.lang.String r3 = r2.name     // Catch:{ ClassNotFoundException -> 0x009a }
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch:{ ClassNotFoundException -> 0x009a }
            if (r3 != 0) goto L_0x009f
            java.lang.Class<com.xiaomi.mipush.sdk.PushMessageReceiver> r3 = com.xiaomi.mipush.sdk.PushMessageReceiver.class
            java.lang.String r6 = r2.name     // Catch:{ ClassNotFoundException -> 0x009a }
            java.lang.Class r6 = com.xiaomi.push.C4937t.m15867a(r8, r6)     // Catch:{ ClassNotFoundException -> 0x009a }
            boolean r3 = r3.isAssignableFrom(r6)     // Catch:{ ClassNotFoundException -> 0x009a }
            if (r3 == 0) goto L_0x009f
            boolean r1 = r2.enabled     // Catch:{ ClassNotFoundException -> 0x009a }
            if (r1 == 0) goto L_0x009f
            r1 = 1
            goto L_0x00a0
        L_0x009a:
            r2 = move-exception
            com.xiaomi.channel.commonutils.logger.C3989b.m10678a((java.lang.Throwable) r2)
            goto L_0x006e
        L_0x009f:
            r1 = 0
        L_0x00a0:
            if (r1 == 0) goto L_0x006e
        L_0x00a2:
            if (r1 == 0) goto L_0x00c6
            boolean r0 = com.xiaomi.mipush.sdk.MiPushClient.getOpenHmsPush(r8)
            if (r0 == 0) goto L_0x00b8
            java.lang.String r0 = "com.huawei.android.push.intent.RECEIVE"
            java.lang.String r1 = "com.xiaomi.assemble.control.HmsPushReceiver"
            m10997a((android.content.Context) r8, (java.lang.String) r0, (java.lang.String) r1)
            java.lang.String r0 = "com.huawei.intent.action.PUSH"
            java.lang.String r1 = "com.huawei.hms.support.api.push.PushEventReceiver"
            m10997a((android.content.Context) r8, (java.lang.String) r0, (java.lang.String) r1)
        L_0x00b8:
            boolean r0 = com.xiaomi.mipush.sdk.MiPushClient.getOpenVIVOPush(r8)
            if (r0 == 0) goto L_0x00c5
            java.lang.String r0 = "com.vivo.pushclient.action.RECEIVE"
            java.lang.String r1 = "com.xiaomi.assemble.control.FTOSPushMessageReceiver"
            m10997a((android.content.Context) r8, (java.lang.String) r0, (java.lang.String) r1)
        L_0x00c5:
            return
        L_0x00c6:
            com.xiaomi.mipush.sdk.x$a r8 = new com.xiaomi.mipush.sdk.x$a
            java.lang.String r0 = "Receiver: none of the subclasses of PushMessageReceiver is enabled or defined."
            r8.<init>(r0)
            goto L_0x00cf
        L_0x00ce:
            throw r8
        L_0x00cf:
            goto L_0x00ce
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.mipush.sdk.C4080x.m11003c(android.content.Context):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static void m11004c(Context context, PackageInfo packageInfo) {
        boolean z;
        HashSet hashSet = new HashSet();
        String str = context.getPackageName() + ".permission.MIPUSH_RECEIVE";
        hashSet.addAll(Arrays.asList(new String[]{"android.permission.INTERNET", "android.permission.ACCESS_NETWORK_STATE", str, "android.permission.ACCESS_WIFI_STATE", "android.permission.READ_PHONE_STATE", "android.permission.GET_TASKS", "android.permission.VIBRATE"}));
        PermissionInfo[] permissionInfoArr = packageInfo.permissions;
        if (permissionInfoArr != null) {
            int length = permissionInfoArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                } else if (str.equals(permissionInfoArr[i].name)) {
                    z = true;
                    break;
                } else {
                    i++;
                }
            }
        }
        z = false;
        if (z) {
            String[] strArr = packageInfo.requestedPermissions;
            if (strArr != null) {
                for (String str2 : strArr) {
                    if (!TextUtils.isEmpty(str2) && hashSet.contains(str2)) {
                        hashSet.remove(str2);
                        if (hashSet.isEmpty()) {
                            break;
                        }
                    }
                }
            }
            if (!hashSet.isEmpty()) {
                throw new C4081a(String.format("<uses-permission android:name=\"%1$s\"/> is missing in AndroidManifest.", new Object[]{hashSet.iterator().next()}));
            }
            return;
        }
        throw new C4081a(String.format("<permission android:name=\"%1$s\" .../> is undefined in AndroidManifest.", new Object[]{str}));
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static void m11005d(Context context, PackageInfo packageInfo) {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        hashMap2.put(PushMessageHandler.class.getCanonicalName(), new C4082b(PushMessageHandler.class.getCanonicalName(), true, true, ""));
        hashMap2.put(MessageHandleService.class.getCanonicalName(), new C4082b(MessageHandleService.class.getCanonicalName(), true, false, ""));
        if (!MiPushClient.shouldUseMIUIPush(context) || m10999a(packageInfo, new String[]{"com.xiaomi.push.service.XMJobService", "com.xiaomi.push.service.XMPushService"})) {
            hashMap2.put("com.xiaomi.push.service.XMJobService", new C4082b("com.xiaomi.push.service.XMJobService", true, false, "android.permission.BIND_JOB_SERVICE"));
            hashMap2.put("com.xiaomi.push.service.XMPushService", new C4082b("com.xiaomi.push.service.XMPushService", true, false, ""));
        }
        if (MiPushClient.getOpenFCMPush(context)) {
            hashMap2.put("com.xiaomi.assemble.control.MiFireBaseInstanceIdService", new C4082b("com.xiaomi.assemble.control.MiFireBaseInstanceIdService", true, false, ""));
            hashMap2.put("com.xiaomi.assemble.control.MiFirebaseMessagingService", new C4082b("com.xiaomi.assemble.control.MiFirebaseMessagingService", true, false, ""));
        }
        if (MiPushClient.getOpenOPPOPush(context)) {
            hashMap2.put("com.xiaomi.assemble.control.COSPushMessageService", new C4082b("com.xiaomi.assemble.control.COSPushMessageService", true, true, "com.coloros.mcs.permission.SEND_MCS_MESSAGE"));
        }
        ServiceInfo[] serviceInfoArr = packageInfo.services;
        if (serviceInfoArr != null) {
            for (ServiceInfo serviceInfo : serviceInfoArr) {
                if (!TextUtils.isEmpty(serviceInfo.name) && hashMap2.containsKey(serviceInfo.name)) {
                    C4082b bVar = (C4082b) hashMap2.remove(serviceInfo.name);
                    boolean z = bVar.f6964a;
                    boolean z2 = bVar.f6966b;
                    String str = bVar.f6965b;
                    if (z != serviceInfo.enabled) {
                        throw new C4081a(String.format("<service android:name=\"%1$s\" .../> in AndroidManifest had the wrong enabled attribute, which should be android:enabled=%2$b.", new Object[]{serviceInfo.name, Boolean.valueOf(z)}));
                    } else if (z2 != serviceInfo.exported) {
                        throw new C4081a(String.format("<service android:name=\"%1$s\" .../> in AndroidManifest had the wrong exported attribute, which should be android:exported=%2$b.", new Object[]{serviceInfo.name, Boolean.valueOf(z2)}));
                    } else if (TextUtils.isEmpty(str) || TextUtils.equals(str, serviceInfo.permission)) {
                        hashMap.put(serviceInfo.name, serviceInfo.processName);
                        if (hashMap2.isEmpty()) {
                            break;
                        }
                    } else {
                        throw new C4081a(String.format("<service android:name=\"%1$s\" .../> in AndroidManifest had the wrong permission attribute, which should be android:permission=\"%2$s\".", new Object[]{serviceInfo.name, str}));
                    }
                }
            }
        }
        if (!hashMap2.isEmpty()) {
            throw new C4081a(String.format("<service android:name=\"%1$s\" .../> is missing or disabled in AndroidManifest.", new Object[]{hashMap2.keySet().iterator().next()}));
        } else if (!TextUtils.equals((CharSequence) hashMap.get(PushMessageHandler.class.getCanonicalName()), (CharSequence) hashMap.get(MessageHandleService.class.getCanonicalName()))) {
            throw new C4081a(String.format("\"%1$s\" and \"%2$s\" must be running in the same process.", new Object[]{PushMessageHandler.class.getCanonicalName(), MessageHandleService.class.getCanonicalName()}));
        } else if (hashMap.containsKey("com.xiaomi.push.service.XMJobService") && hashMap.containsKey("com.xiaomi.push.service.XMPushService") && !TextUtils.equals((CharSequence) hashMap.get("com.xiaomi.push.service.XMJobService"), (CharSequence) hashMap.get("com.xiaomi.push.service.XMPushService"))) {
            throw new C4081a(String.format("\"%1$s\" and \"%2$s\" must be running in the same process.", new Object[]{"com.xiaomi.push.service.XMJobService", "com.xiaomi.push.service.XMPushService"}));
        }
    }
}
