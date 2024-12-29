package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Base64;
import com.xiaomi.channel.commonutils.logger.C4408b;
import com.xiaomi.push.C4760hj;
import com.xiaomi.push.C4783if;
import com.xiaomi.push.C4790im;
import com.xiaomi.push.C4797it;
import com.xiaomi.push.C4830m;
import com.xiaomi.push.service.C4990y;
import java.util.HashMap;
import java.util.Map;

public class FCMPushHelper {
    /* renamed from: a */
    private static Map<String, String> m12550a(Context context) {
        HashMap hashMap = new HashMap();
        hashMap.put("actionType", String.valueOf(C4760hj.AckMessage.mo29282a()));
        hashMap.put("deviceStatus", String.valueOf(C4797it.m14832a(context, context.getPackageName())));
        hashMap.put("mat", Long.toString(System.currentTimeMillis()));
        return hashMap;
    }

    /* renamed from: a */
    private static void m12551a(Context context, C4783if ifVar) {
        try {
            MiPushMessage generateMessage = PushMessageHelper.generateMessage((C4790im) C4459ai.m12617a(context, ifVar), ifVar.mo29558a(), false);
            PushMessageReceiver a = C4483i.m12764a(context);
            if (a != null) {
                a.onNotificationMessageArrived(context, generateMessage);
            }
        } catch (Throwable th) {
            C4408b.m12477a("fcm broadcast notification come error ", th);
        }
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [boolean] */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m12552a(android.content.Context r7, byte[] r8) {
        /*
            com.xiaomi.mipush.sdk.ao r0 = com.xiaomi.mipush.sdk.C4465ao.m12646a((android.content.Context) r7)
            boolean r0 = r0.mo28653a()
            java.lang.String r1 = r7.getPackageName()
            java.lang.String r2 = "com.xiaomi.xmsf"
            boolean r1 = r2.equals(r1)
            r3 = 1
            r1 = r1 ^ r3
            boolean r4 = m12550a((android.content.Context) r7)
            r5 = 2
            r6 = 0
            if (r0 == 0) goto L_0x0069
            if (r1 == 0) goto L_0x0069
            if (r4 == 0) goto L_0x0069
            com.xiaomi.mipush.sdk.b r0 = com.xiaomi.mipush.sdk.C4475b.m12705a((android.content.Context) r7)
            java.lang.String r0 = r0.mo28695d()
            byte[] r8 = com.xiaomi.push.service.C4971n.m15584a((byte[]) r8, (java.lang.String) r0)
            if (r8 != 0) goto L_0x0031
            java.lang.String r0 = "fcm message encrypt failed"
            goto L_0x0084
        L_0x0031:
            java.lang.String r0 = android.util.Base64.encodeToString(r8, r5)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto L_0x0042
            java.lang.String r0 = "fcm message buf base64 encode failed"
            com.xiaomi.channel.commonutils.logger.C4408b.m12464a((java.lang.String) r0)
            r3 = 0
            goto L_0x0067
        L_0x0042:
            android.content.Intent r1 = new android.content.Intent
            java.lang.String r4 = com.xiaomi.push.service.C4916bk.f9592n
            r1.<init>(r4)
            r1.setPackage(r2)
            java.lang.String r4 = "com.xiaomi.push.service.XMPushService"
            r1.setClassName(r2, r4)
            java.lang.String r2 = "ext_fcm_container_buffer"
            r1.putExtra(r2, r0)
            java.lang.String r0 = r7.getPackageName()
            java.lang.String r2 = "mipush_app_package"
            r1.putExtra(r2, r0)
            r7.startService(r1)
            java.lang.String r0 = "fcm message reroute to xmsf"
            com.xiaomi.channel.commonutils.logger.C4408b.m12464a((java.lang.String) r0)
        L_0x0067:
            r6 = r3
            goto L_0x0087
        L_0x0069:
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2[r6] = r0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            r2[r3] = r0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            r2[r5] = r0
            java.lang.String r0 = "xmsf can not receive fcm msg - shouldUseMIUIPush=%s;isNotXmsf=%s;xmsfSupport=%s"
            java.lang.String r0 = java.lang.String.format(r0, r2)
        L_0x0084:
            com.xiaomi.channel.commonutils.logger.C4408b.m12464a((java.lang.String) r0)
        L_0x0087:
            if (r6 != 0) goto L_0x0095
            java.lang.String r0 = "fcm message post local"
            com.xiaomi.channel.commonutils.logger.C4408b.m12481b(r0)
            com.xiaomi.push.if r0 = com.xiaomi.push.service.C4990y.m15707a((byte[]) r8)
            com.xiaomi.push.service.C4874al.m15221a((android.content.Context) r7, (com.xiaomi.push.C4783if) r0, (byte[]) r8)
        L_0x0095:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.mipush.sdk.FCMPushHelper.m12552a(android.content.Context, byte[]):void");
    }

    /* renamed from: a */
    private static boolean m12553a(Context context) {
        return ((long) C4830m.m15008b(context)) >= 50002000 && m12554b(context);
    }

    /* renamed from: b */
    private static boolean m12554b(Context context) {
        return context.getSharedPreferences("mipush_extra", 0).getBoolean("is_xmsf_sup_decrypt", false);
    }

    public static void clearToken(Context context) {
        C4483i.m12765a(context, C4479e.ASSEMBLE_PUSH_FCM);
    }

    public static void convertMessage(Intent intent) {
        C4483i.m12772a(intent);
    }

    public static boolean isFCMSwitchOpen(Context context) {
        return C4483i.m12765a(context, C4479e.ASSEMBLE_PUSH_FCM) && MiPushClient.getOpenFCMPush(context);
    }

    public static void notifyFCMNotificationCome(Context context, Map<String, String> map) {
        PushMessageReceiver a;
        String str = map.get("pushMsg");
        if (!TextUtils.isEmpty(str) && (a = C4483i.m12764a(context)) != null) {
            a.onNotificationMessageArrived(context, C4483i.m12763a(str));
        }
    }

    public static Map<String, String> notifyFCMPassThoughMessageCome(Context context, Map<String, String> map) {
        PushMessageReceiver a;
        String str = map.get("pushMsg");
        if (!TextUtils.isEmpty(str) && (a = C4483i.m12764a(context)) != null) {
            a.onReceivePassThroughMessage(context, C4483i.m12763a(str));
        }
        String str2 = map.get("mipushContainer");
        if (TextUtils.isEmpty(str2)) {
            return new HashMap();
        }
        try {
            byte[] decode = Base64.decode(str2, 2);
            m12551a(context, C4990y.m15707a(decode));
            m12552a(context, decode);
        } catch (Throwable th) {
            C4408b.m12477a("fcm notify notification error ", th);
        }
        return m12550a(context);
    }

    public static void persistIfXmsfSupDecrypt(Context context) {
        boolean z = false;
        SharedPreferences.Editor edit = context.getSharedPreferences("mipush_extra", 0).edit();
        if (((long) C4830m.m15008b(context)) >= 50002000) {
            z = true;
        }
        edit.putBoolean("is_xmsf_sup_decrypt", z).apply();
    }

    public static void reportFCMMessageDelete() {
        MiTinyDataClient.upload(C4483i.m12783c(C4479e.ASSEMBLE_PUSH_FCM), "fcm", 1, "some fcm messages was deleted ");
    }

    public static void uploadToken(Context context, String str) {
        C4483i.m12762a(context, C4479e.ASSEMBLE_PUSH_FCM, str);
    }
}
