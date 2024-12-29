package com.xiaomi.push.service;

import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.channel.commonutils.logger.C4408b;
import com.xiaomi.mipush.sdk.Constants;
import com.xiaomi.push.C4506ab;
import com.xiaomi.push.C4561bp;
import com.xiaomi.push.C4763hm;
import com.xiaomi.push.C4764hn;
import com.xiaomi.push.C4770ht;
import com.xiaomi.push.C4786ii;
import com.xiaomi.push.C4797it;
import com.xiaomi.push.C4994v;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.xiaomi.push.service.bz */
public class C4935bz {

    /* renamed from: a */
    private static String f9644a;

    /* renamed from: a */
    private static SimpleDateFormat f9645a;

    /* renamed from: a */
    private static AtomicLong f9646a = new AtomicLong(0);

    static {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd");
        f9645a = simpleDateFormat;
        f9644a = simpleDateFormat.format(Long.valueOf(System.currentTimeMillis()));
    }

    /* renamed from: a */
    private static C4786ii m15493a(String str, String str2, C4763hm hmVar) {
        return new C4786ii("-1", false).mo29606d(str).mo29599b(str2).mo29597a(C4506ab.m12836a(C4797it.m14834a(hmVar))).mo29602c(C4770ht.UploadTinyData.f8718a);
    }

    /* renamed from: a */
    public static synchronized String m15494a() {
        String str;
        synchronized (C4935bz.class) {
            String format = f9645a.format(Long.valueOf(System.currentTimeMillis()));
            if (!TextUtils.equals(f9644a, format)) {
                f9646a.set(0);
                f9644a = format;
            }
            str = format + Constants.ACCEPT_TIME_SEPARATOR_SERVER + f9646a.incrementAndGet();
        }
        return str;
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0066  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.ArrayList<com.xiaomi.push.C4786ii> m15495a(java.util.List<com.xiaomi.push.C4764hn> r11, java.lang.String r12, java.lang.String r13, int r14) {
        /*
            r0 = 0
            if (r11 != 0) goto L_0x0009
            java.lang.String r11 = "requests can not be null in TinyDataHelper.transToThriftObj()."
        L_0x0005:
            com.xiaomi.channel.commonutils.logger.C4408b.m12483d(r11)
            return r0
        L_0x0009:
            int r1 = r11.size()
            if (r1 != 0) goto L_0x0012
            java.lang.String r11 = "requests.length is 0 in TinyDataHelper.transToThriftObj()."
            goto L_0x0005
        L_0x0012:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            com.xiaomi.push.hm r2 = new com.xiaomi.push.hm
            r2.<init>()
            r3 = 0
            r4 = 0
            r5 = 0
        L_0x001f:
            int r6 = r11.size()
            if (r4 >= r6) goto L_0x00aa
            java.lang.Object r6 = r11.get(r4)
            com.xiaomi.push.hn r6 = (com.xiaomi.push.C4764hn) r6
            if (r6 != 0) goto L_0x002f
            goto L_0x00a6
        L_0x002f:
            java.util.Map r7 = r6.mo29293a()
            if (r7 == 0) goto L_0x006e
            java.util.Map r7 = r6.mo29293a()
            java.lang.String r8 = "item_size"
            boolean r7 = r7.containsKey(r8)
            if (r7 == 0) goto L_0x006e
            java.util.Map r7 = r6.mo29293a()
            java.lang.Object r7 = r7.get(r8)
            java.lang.String r7 = (java.lang.String) r7
            boolean r9 = android.text.TextUtils.isEmpty(r7)
            if (r9 != 0) goto L_0x0056
            int r7 = java.lang.Integer.parseInt(r7)     // Catch:{ Exception -> 0x0056 }
            goto L_0x0057
        L_0x0056:
            r7 = 0
        L_0x0057:
            java.util.Map r9 = r6.mo29293a()
            int r9 = r9.size()
            r10 = 1
            if (r9 != r10) goto L_0x0066
            r6.mo29296a((java.util.Map<java.lang.String, java.lang.String>) r0)
            goto L_0x006f
        L_0x0066:
            java.util.Map r9 = r6.mo29293a()
            r9.remove(r8)
            goto L_0x006f
        L_0x006e:
            r7 = 0
        L_0x006f:
            if (r7 > 0) goto L_0x0076
            byte[] r7 = com.xiaomi.push.C4797it.m14834a(r6)
            int r7 = r7.length
        L_0x0076:
            if (r7 <= r14) goto L_0x0091
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "TinyData is too big, ignore upload request item:"
            r7.append(r8)
            java.lang.String r6 = r6.mo29308d()
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            com.xiaomi.channel.commonutils.logger.C4408b.m12483d(r6)
            goto L_0x00a6
        L_0x0091:
            int r8 = r5 + r7
            if (r8 <= r14) goto L_0x00a2
            com.xiaomi.push.ii r2 = m15493a(r12, r13, r2)
            r1.add(r2)
            com.xiaomi.push.hm r2 = new com.xiaomi.push.hm
            r2.<init>()
            r5 = 0
        L_0x00a2:
            r2.mo29287a((com.xiaomi.push.C4764hn) r6)
            int r5 = r5 + r7
        L_0x00a6:
            int r4 = r4 + 1
            goto L_0x001f
        L_0x00aa:
            int r11 = r2.mo29285a()
            if (r11 == 0) goto L_0x00b7
            com.xiaomi.push.ii r11 = m15493a(r12, r13, r2)
            r1.add(r11)
        L_0x00b7:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.service.C4935bz.m15495a(java.util.List, java.lang.String, java.lang.String, int):java.util.ArrayList");
    }

    /* renamed from: a */
    public static void m15496a(Context context, String str, String str2, long j, String str3) {
        C4764hn hnVar = new C4764hn();
        hnVar.mo29307d(str);
        hnVar.mo29303c(str2);
        hnVar.mo29294a(j);
        hnVar.mo29300b(str3);
        hnVar.mo29295a("push_sdk_channel");
        hnVar.mo29314g(context.getPackageName());
        hnVar.mo29309e(context.getPackageName());
        hnVar.mo29297a(true);
        hnVar.mo29299b(System.currentTimeMillis());
        hnVar.mo29312f(m15494a());
        C4937ca.m15503a(context, hnVar);
    }

    /* renamed from: a */
    public static void m15497a(String str, String str2, String str3, C4880ao aoVar) {
        if (aoVar != null) {
            C4764hn hnVar = new C4764hn();
            hnVar.mo29307d(str);
            hnVar.mo29303c(str2);
            hnVar.mo29314g(str3);
            hnVar.mo29309e(str3);
            HashMap hashMap = new HashMap();
            hashMap.put("chid", String.valueOf(aoVar.f9469a));
            hashMap.put("screen_on", String.valueOf(aoVar.f9471a));
            hashMap.put("wifi", String.valueOf(aoVar.f9474b));
            hashMap.put("rx_msg", String.valueOf(aoVar.f9470a));
            hashMap.put("enqueue", String.valueOf(aoVar.f9473b));
            hashMap.put("num", String.valueOf(aoVar.f9472b));
            hashMap.put("run", String.valueOf(aoVar.f9475c));
            hashMap.put("send", String.valueOf(System.currentTimeMillis()));
            hnVar.mo29296a((Map<String, String>) hashMap);
            C4937ca.m15504a(hnVar);
        }
    }

    /* renamed from: a */
    public static boolean m15498a(C4764hn hnVar, boolean z) {
        String str;
        if (hnVar == null) {
            str = "item is null, verfiy ClientUploadDataItem failed.";
        } else if (!z && TextUtils.isEmpty(hnVar.f8493a)) {
            str = "item.channel is null or empty, verfiy ClientUploadDataItem failed.";
        } else if (TextUtils.isEmpty(hnVar.f8500d)) {
            str = "item.category is null or empty, verfiy ClientUploadDataItem failed.";
        } else if (TextUtils.isEmpty(hnVar.f8499c)) {
            str = "item.name is null or empty, verfiy ClientUploadDataItem failed.";
        } else if (!C4561bp.m13042a(hnVar.f8500d)) {
            str = "item.category can only contain ascii char, verfiy ClientUploadDataItem failed.";
        } else if (!C4561bp.m13042a(hnVar.f8499c)) {
            str = "item.name can only contain ascii char, verfiy ClientUploadDataItem failed.";
        } else {
            String str2 = hnVar.f8498b;
            if (str2 == null || str2.length() <= 10240) {
                return false;
            }
            str = "item.data is too large(" + hnVar.f8498b.length() + "), max size for data is " + 10240 + " , verfiy ClientUploadDataItem failed.";
        }
        C4408b.m12464a(str);
        return true;
    }

    /* renamed from: a */
    public static boolean m15499a(String str) {
        return !C4994v.m15740b() || Constants.HYBRID_PACKAGE_NAME.equals(str);
    }
}
