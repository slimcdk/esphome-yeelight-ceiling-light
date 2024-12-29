package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import com.miot.service.qrcode.ScanBarcodeActivity;
import com.xiaomi.channel.commonutils.logger.C4408b;
import com.xiaomi.push.C4516al;
import com.xiaomi.push.C4551bj;
import com.xiaomi.push.C4554bk;
import com.xiaomi.push.C4560bo;
import com.xiaomi.push.C4783if;
import com.xiaomi.push.C4992t;
import com.xiaomi.push.service.C4898ba;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: com.xiaomi.mipush.sdk.i */
public class C4483i {

    /* renamed from: a */
    private static HashMap<String, String> f7505a = new HashMap<>();

    /* renamed from: a */
    public static int m12761a() {
        Integer num = (Integer) C4554bk.m13013a("com.xiaomi.assemble.control.AssembleConstants", "ASSEMBLE_VERSION_CODE");
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0049, code lost:
        r6 = r0.getInt(m12780b(r7), 0);
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int m12762a(android.content.Context r6, com.xiaomi.mipush.sdk.C4479e r7, java.lang.String r8) {
        /*
            java.lang.String r0 = "mipush_extra"
            r1 = 0
            android.content.SharedPreferences r0 = r6.getSharedPreferences(r0, r1)
            java.lang.String r2 = m12767a((com.xiaomi.mipush.sdk.C4479e) r7)
            java.lang.String r3 = ""
            java.lang.String r4 = r0.getString(r2, r3)
            com.xiaomi.mipush.sdk.b r6 = com.xiaomi.mipush.sdk.C4475b.m12705a((android.content.Context) r6)
            java.lang.String r6 = r6.mo28694c()
            java.lang.String r5 = "last_check_token"
            java.lang.String r3 = r0.getString(r5, r3)
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 == 0) goto L_0x002b
            java.lang.String r6 = "ASSEMBLE_PUSH : can not find the key of token used in sp file"
            com.xiaomi.channel.commonutils.logger.C4408b.m12464a((java.lang.String) r6)
            return r1
        L_0x002b:
            boolean r2 = android.text.TextUtils.isEmpty(r4)
            if (r2 == 0) goto L_0x0033
            r6 = 1
            return r6
        L_0x0033:
            boolean r8 = r4.equals(r8)
            if (r8 != 0) goto L_0x003b
            r6 = 2
            return r6
        L_0x003b:
            boolean r6 = android.text.TextUtils.equals(r6, r3)
            if (r6 != 0) goto L_0x0043
            r6 = 3
            return r6
        L_0x0043:
            boolean r6 = m12767a((com.xiaomi.mipush.sdk.C4479e) r7)
            if (r6 == 0) goto L_0x0059
            java.lang.String r6 = m12780b((com.xiaomi.mipush.sdk.C4479e) r7)
            int r6 = r0.getInt(r6, r1)
            int r7 = m12761a()
            if (r7 == r6) goto L_0x0059
            r6 = 4
            return r6
        L_0x0059:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.mipush.sdk.C4483i.m12762a(android.content.Context, com.xiaomi.mipush.sdk.e, java.lang.String):int");
    }

    /* renamed from: a */
    public static MiPushMessage m12763a(String str) {
        MiPushMessage miPushMessage = new MiPushMessage();
        if (!TextUtils.isEmpty(str)) {
            try {
                String str2 = "extra";
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.has("messageId")) {
                    miPushMessage.setMessageId(jSONObject.getString("messageId"));
                }
                if (jSONObject.has("description")) {
                    miPushMessage.setDescription(jSONObject.getString("description"));
                }
                if (jSONObject.has(ScanBarcodeActivity.TITLE)) {
                    miPushMessage.setTitle(jSONObject.getString(ScanBarcodeActivity.TITLE));
                }
                if (jSONObject.has("content")) {
                    miPushMessage.setContent(jSONObject.getString("content"));
                }
                if (jSONObject.has("passThrough")) {
                    miPushMessage.setPassThrough(jSONObject.getInt("passThrough"));
                }
                if (jSONObject.has("notifyType")) {
                    miPushMessage.setNotifyType(jSONObject.getInt("notifyType"));
                }
                if (jSONObject.has("messageType")) {
                    miPushMessage.setMessageType(jSONObject.getInt("messageType"));
                }
                if (jSONObject.has("alias")) {
                    miPushMessage.setAlias(jSONObject.getString("alias"));
                }
                if (jSONObject.has("topic")) {
                    miPushMessage.setTopic(jSONObject.getString("topic"));
                }
                if (jSONObject.has("user_account")) {
                    miPushMessage.setUserAccount(jSONObject.getString("user_account"));
                }
                if (jSONObject.has("notifyId")) {
                    miPushMessage.setNotifyId(jSONObject.getInt("notifyId"));
                }
                if (jSONObject.has("category")) {
                    miPushMessage.setCategory(jSONObject.getString("category"));
                }
                if (jSONObject.has("isNotified")) {
                    miPushMessage.setNotified(jSONObject.getBoolean("isNotified"));
                }
                String str3 = str2;
                if (jSONObject.has(str3)) {
                    JSONObject jSONObject2 = jSONObject.getJSONObject(str3);
                    Iterator<String> keys = jSONObject2.keys();
                    HashMap hashMap = new HashMap();
                    while (keys != null && keys.hasNext()) {
                        String next = keys.next();
                        hashMap.put(next, jSONObject2.getString(next));
                    }
                    if (hashMap.size() > 0) {
                        miPushMessage.setExtra(hashMap);
                    }
                }
            } catch (Exception e) {
                C4408b.m12483d(e.toString());
            }
        }
        return miPushMessage;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003f A[Catch:{ Exception -> 0x004f }] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x004e A[RETURN] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected static com.xiaomi.mipush.sdk.PushMessageReceiver m12764a(android.content.Context r5) {
        /*
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r1 = "com.xiaomi.mipush.RECEIVE_MESSAGE"
            r0.<init>(r1)
            java.lang.String r1 = r5.getPackageName()
            r0.setPackage(r1)
            android.content.pm.PackageManager r1 = r5.getPackageManager()
            r2 = 32
            r3 = 0
            java.util.List r0 = r1.queryBroadcastReceivers(r0, r2)     // Catch:{ Exception -> 0x004f }
            if (r0 == 0) goto L_0x003c
            java.util.Iterator r0 = r0.iterator()     // Catch:{ Exception -> 0x004f }
        L_0x001f:
            boolean r1 = r0.hasNext()     // Catch:{ Exception -> 0x004f }
            if (r1 == 0) goto L_0x003c
            java.lang.Object r1 = r0.next()     // Catch:{ Exception -> 0x004f }
            android.content.pm.ResolveInfo r1 = (android.content.pm.ResolveInfo) r1     // Catch:{ Exception -> 0x004f }
            android.content.pm.ActivityInfo r2 = r1.activityInfo     // Catch:{ Exception -> 0x004f }
            if (r2 == 0) goto L_0x001f
            java.lang.String r2 = r2.packageName     // Catch:{ Exception -> 0x004f }
            java.lang.String r4 = r5.getPackageName()     // Catch:{ Exception -> 0x004f }
            boolean r2 = r2.equals(r4)     // Catch:{ Exception -> 0x004f }
            if (r2 == 0) goto L_0x001f
            goto L_0x003d
        L_0x003c:
            r1 = r3
        L_0x003d:
            if (r1 == 0) goto L_0x004e
            android.content.pm.ActivityInfo r0 = r1.activityInfo     // Catch:{ Exception -> 0x004f }
            java.lang.String r0 = r0.name     // Catch:{ Exception -> 0x004f }
            java.lang.Class r5 = com.xiaomi.push.C4994v.m15735a(r5, r0)     // Catch:{ Exception -> 0x004f }
            java.lang.Object r5 = r5.newInstance()     // Catch:{ Exception -> 0x004f }
            com.xiaomi.mipush.sdk.PushMessageReceiver r5 = (com.xiaomi.mipush.sdk.PushMessageReceiver) r5     // Catch:{ Exception -> 0x004f }
            return r5
        L_0x004e:
            return r3
        L_0x004f:
            r5 = move-exception
            java.lang.String r5 = r5.toString()
            com.xiaomi.channel.commonutils.logger.C4408b.m12483d(r5)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.mipush.sdk.C4483i.m12764a(android.content.Context):com.xiaomi.mipush.sdk.PushMessageReceiver");
    }

    /* renamed from: a */
    static String m12765a(Context context, C4479e eVar) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("mipush_extra", 0);
        String a = m12767a(eVar);
        if (!TextUtils.isEmpty(a)) {
            return sharedPreferences.getString(a, "");
        }
        return null;
    }

    /* renamed from: a */
    protected static synchronized String m12766a(Context context, String str) {
        String str2;
        synchronized (C4483i.class) {
            str2 = f7505a.get(str);
            if (TextUtils.isEmpty(str2)) {
                str2 = "";
            }
        }
        return str2;
    }

    /* renamed from: a */
    public static String m12767a(C4479e eVar) {
        int i = C4485k.f7509a[eVar.ordinal()];
        if (i == 1) {
            return "hms_push_token";
        }
        if (i == 2) {
            return "fcm_push_token_v2";
        }
        if (i == 3) {
            return "cos_push_token";
        }
        if (i != 4) {
            return null;
        }
        return "ftos_push_token";
    }

    /* JADX WARNING: type inference failed for: r4v3, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r4v5, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r4v6, types: [java.lang.String] */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0058, code lost:
        if (r12 != 0) goto L_0x005a;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.HashMap<java.lang.String, java.lang.String> m12768a(android.content.Context r11, com.xiaomi.mipush.sdk.C4479e r12) {
        /*
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.lang.String r1 = m12767a((com.xiaomi.mipush.sdk.C4479e) r12)
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 == 0) goto L_0x0010
            return r0
        L_0x0010:
            int[] r2 = com.xiaomi.mipush.sdk.C4485k.f7509a
            int r12 = r12.ordinal()
            r12 = r2[r12]
            r2 = 1
            java.lang.String r3 = "brand:"
            r4 = 0
            java.lang.String r5 = "package_name"
            java.lang.String r6 = "token"
            java.lang.String r7 = "~"
            java.lang.String r8 = ":"
            if (r12 == r2) goto L_0x00c8
            r2 = 2
            java.lang.String r9 = "brand"
            java.lang.String r10 = "version"
            if (r12 == r2) goto L_0x009e
            r2 = 3
            if (r12 == r2) goto L_0x0067
            r2 = 4
            if (r12 == r2) goto L_0x0035
            goto L_0x012f
        L_0x0035:
            com.xiaomi.push.w$a r12 = new com.xiaomi.push.w$a
            r12.<init>(r8, r7)
            com.xiaomi.mipush.sdk.ag r2 = com.xiaomi.mipush.sdk.C4457ag.VIVO
            java.lang.String r2 = r2.name()
            com.xiaomi.push.w$a r12 = r12.mo30094a(r9, r2)
            java.lang.String r1 = m12766a((android.content.Context) r11, (java.lang.String) r1)
            com.xiaomi.push.w$a r12 = r12.mo30094a(r6, r1)
            java.lang.String r11 = r11.getPackageName()
            com.xiaomi.push.w$a r11 = r12.mo30094a(r5, r11)
            int r12 = m12761a()
            if (r12 == 0) goto L_0x0061
        L_0x005a:
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r11.mo30094a(r10, r12)
        L_0x0061:
            java.lang.String r4 = r11.toString()
            goto L_0x012f
        L_0x0067:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r3)
            com.xiaomi.mipush.sdk.ag r2 = com.xiaomi.mipush.sdk.C4457ag.OPPO
            java.lang.String r2 = r2.name()
            r12.append(r2)
            r12.append(r7)
            r12.append(r6)
            r12.append(r8)
            java.lang.String r1 = m12766a((android.content.Context) r11, (java.lang.String) r1)
            r12.append(r1)
            r12.append(r7)
            r12.append(r5)
            r12.append(r8)
            java.lang.String r11 = r11.getPackageName()
            r12.append(r11)
            java.lang.String r4 = r12.toString()
            goto L_0x012f
        L_0x009e:
            com.xiaomi.push.w$a r12 = new com.xiaomi.push.w$a
            r12.<init>(r8, r7)
            com.xiaomi.mipush.sdk.ag r2 = com.xiaomi.mipush.sdk.C4457ag.FCM
            java.lang.String r2 = r2.name()
            com.xiaomi.push.w$a r12 = r12.mo30094a(r9, r2)
            java.lang.String r1 = m12766a((android.content.Context) r11, (java.lang.String) r1)
            com.xiaomi.push.w$a r12 = r12.mo30094a(r6, r1)
            java.lang.String r11 = r11.getPackageName()
            com.xiaomi.push.w$a r11 = r12.mo30094a(r5, r11)
            int r12 = m12761a()
            if (r12 == 0) goto L_0x00c4
            goto L_0x005a
        L_0x00c4:
            r12 = 40091(0x9c9b, float:5.618E-41)
            goto L_0x005a
        L_0x00c8:
            android.content.pm.PackageManager r12 = r11.getPackageManager()     // Catch:{ Exception -> 0x00d7 }
            java.lang.String r2 = r11.getPackageName()     // Catch:{ Exception -> 0x00d7 }
            r9 = 128(0x80, float:1.794E-43)
            android.content.pm.ApplicationInfo r4 = r12.getApplicationInfo(r2, r9)     // Catch:{ Exception -> 0x00d7 }
            goto L_0x00df
        L_0x00d7:
            r12 = move-exception
            java.lang.String r12 = r12.toString()
            com.xiaomi.channel.commonutils.logger.C4408b.m12483d(r12)
        L_0x00df:
            r12 = -1
            if (r4 == 0) goto L_0x00ea
            android.os.Bundle r12 = r4.metaData
            java.lang.String r2 = "com.huawei.hms.client.appid"
            int r12 = r12.getInt(r2)
        L_0x00ea:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r3)
            com.xiaomi.mipush.sdk.ag r3 = com.xiaomi.mipush.sdk.C4489n.m12791a((android.content.Context) r11)
            java.lang.String r3 = r3.name()
            r2.append(r3)
            r2.append(r7)
            r2.append(r6)
            r2.append(r8)
            java.lang.String r1 = m12766a((android.content.Context) r11, (java.lang.String) r1)
            r2.append(r1)
            r2.append(r7)
            r2.append(r5)
            r2.append(r8)
            java.lang.String r11 = r11.getPackageName()
            r2.append(r11)
            r2.append(r7)
            java.lang.String r11 = "app_id"
            r2.append(r11)
            r2.append(r8)
            r2.append(r12)
            java.lang.String r4 = r2.toString()
        L_0x012f:
            java.lang.String r11 = "RegInfo"
            r0.put(r11, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.mipush.sdk.C4483i.m12768a(android.content.Context, com.xiaomi.mipush.sdk.e):java.util.HashMap");
    }

    /* renamed from: a */
    static void m12769a(Context context) {
        boolean z = false;
        SharedPreferences sharedPreferences = context.getSharedPreferences("mipush_extra", 0);
        String a = m12767a(C4479e.ASSEMBLE_PUSH_HUAWEI);
        String a2 = m12767a(C4479e.ASSEMBLE_PUSH_FCM);
        if (!TextUtils.isEmpty(sharedPreferences.getString(a, "")) && TextUtils.isEmpty(sharedPreferences.getString(a2, ""))) {
            z = true;
        }
        if (z) {
            C4465ao.m12646a(context).mo28656a(2, a);
        }
    }

    /* renamed from: a */
    public static void m12770a(Context context, C4479e eVar) {
        String a = m12767a(eVar);
        if (!TextUtils.isEmpty(a)) {
            C4992t.m15731a(context.getSharedPreferences("mipush_extra", 0).edit().putString(a, ""));
        }
    }

    /* renamed from: a */
    public static void m12771a(Context context, C4479e eVar, String str) {
        if (!TextUtils.isEmpty(str)) {
            int a = m12762a(context, eVar, str);
            if (a != 0) {
                C4408b.m12464a("ASSEMBLE_PUSH : send token upload, check:" + a);
                m12773a(eVar, str);
                C4472au a2 = C4486l.m12787a(eVar);
                if (a2 != null) {
                    C4465ao.m12646a(context).mo28669a((String) null, a2, eVar);
                    return;
                }
                return;
            }
            C4408b.m12464a("ASSEMBLE_PUSH : do not need to send token");
        }
    }

    /* renamed from: a */
    public static void m12772a(Intent intent) {
        Bundle extras;
        if (intent != null && (extras = intent.getExtras()) != null && extras.containsKey("pushMsg")) {
            intent.putExtra(PushMessageHelper.KEY_MESSAGE, m12763a(extras.getString("pushMsg")));
        }
    }

    /* renamed from: a */
    private static synchronized void m12773a(C4479e eVar, String str) {
        synchronized (C4483i.class) {
            String a = m12767a(eVar);
            if (TextUtils.isEmpty(a)) {
                C4408b.m12464a("ASSEMBLE_PUSH : can not find the key of token used in sp file");
            } else if (TextUtils.isEmpty(str)) {
                C4408b.m12464a("ASSEMBLE_PUSH : token is null");
            } else {
                f7505a.put(a, str);
            }
        }
    }

    /* renamed from: a */
    public static void m12774a(String str, int i) {
        MiTinyDataClient.upload("hms_push_error", str, 1, "error code = " + i);
    }

    /* renamed from: a */
    public static boolean m12775a(Context context) {
        if (context == null) {
            return false;
        }
        return C4551bj.m13000b(context);
    }

    /* renamed from: a */
    public static boolean m12776a(Context context, C4479e eVar) {
        if (C4486l.m12787a(eVar) != null) {
            return C4898ba.m15362a(context).mo29996a(C4486l.m12787a(eVar).mo29322a(), true);
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m12777a(C4479e eVar) {
        return eVar == C4479e.ASSEMBLE_PUSH_FTOS || eVar == C4479e.ASSEMBLE_PUSH_FCM;
    }

    /* renamed from: a */
    public static boolean m12778a(C4783if ifVar, C4479e eVar) {
        if (ifVar == null || ifVar.mo29558a() == null || ifVar.mo29558a().mo29392a() == null) {
            return false;
        }
        return (eVar == C4479e.ASSEMBLE_PUSH_FCM ? "FCM" : "").equalsIgnoreCase((String) ifVar.mo29558a().mo29392a().get("assemble_push_type"));
    }

    /* renamed from: a */
    public static byte[] m12779a(Context context, C4783if ifVar, C4479e eVar) {
        if (m12778a(ifVar, eVar)) {
            return C4560bo.m13038a(m12765a(context, eVar));
        }
        return null;
    }

    /* renamed from: b */
    public static String m12780b(C4479e eVar) {
        return m12767a(eVar) + "_version";
    }

    /* renamed from: b */
    public static void m12781b(Context context) {
        C4480f.m12751a(context).register();
    }

    /* renamed from: b */
    public static void m12782b(Context context, C4479e eVar, String str) {
        C4516al.m12857a(context).mo28733a((Runnable) new C4484j(str, context, eVar));
    }

    /* renamed from: c */
    public static String m12783c(C4479e eVar) {
        int i = C4485k.f7509a[eVar.ordinal()];
        if (i == 1) {
            return "hms_push_error";
        }
        if (i == 2) {
            return "fcm_push_error";
        }
        if (i == 3) {
            return "cos_push_error";
        }
        if (i != 4) {
            return null;
        }
        return "ftos_push_error";
    }

    /* renamed from: c */
    public static void m12784c(Context context) {
        C4480f.m12751a(context).unregister();
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static synchronized void m12786d(Context context, C4479e eVar, String str) {
        synchronized (C4483i.class) {
            String a = m12767a(eVar);
            if (TextUtils.isEmpty(a)) {
                C4408b.m12464a("ASSEMBLE_PUSH : can not find the key of token used in sp file");
                return;
            }
            SharedPreferences.Editor edit = context.getSharedPreferences("mipush_extra", 0).edit();
            edit.putString(a, str).putString("last_check_token", C4475b.m12705a(context).mo28694c());
            if (m12767a(eVar)) {
                edit.putInt(m12780b(eVar), m12761a());
            }
            C4992t.m15731a(edit);
            C4408b.m12464a("ASSEMBLE_PUSH : update sp file success!  " + str);
        }
    }
}
