package com.xiaomi.push.service;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.text.TextUtils;
import com.miot.service.manager.timer.TimerCodec;
import com.xiaomi.channel.commonutils.logger.C4408b;
import com.xiaomi.push.C4667eo;
import com.xiaomi.push.C4695fl;
import com.xiaomi.push.C4724gh;
import com.xiaomi.push.C4727gk;
import com.xiaomi.push.C4730gm;
import com.xiaomi.push.C4731gn;
import com.xiaomi.push.C4747h;
import com.xiaomi.push.C4750hb;
import com.xiaomi.push.C4760hj;
import com.xiaomi.push.C4770ht;
import com.xiaomi.push.C4773hw;
import com.xiaomi.push.C4776hz;
import com.xiaomi.push.C4783if;
import com.xiaomi.push.C4786ii;
import com.xiaomi.push.C4797it;
import com.xiaomi.push.C4805j;
import com.xiaomi.push.C4830m;
import com.xiaomi.push.service.C4874al;
import com.xiaomi.push.service.C4906bg;
import com.xiaomi.push.service.XMPushService;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p223w3.C11641s;

/* renamed from: com.xiaomi.push.service.y */
public class C4990y {
    /* renamed from: a */
    public static Intent m15704a(byte[] bArr, long j) {
        C4783if a = m15707a(bArr);
        if (a == null) {
            return null;
        }
        Intent intent = new Intent("com.xiaomi.mipush.RECEIVE_MESSAGE");
        intent.putExtra("mipush_payload", bArr);
        intent.putExtra("mrt", Long.toString(j));
        intent.setPackage(a.f8954b);
        return intent;
    }

    /* renamed from: a */
    public static C4783if m15705a(Context context, C4783if ifVar) {
        return m15706a(context, ifVar, (Map<String, String>) null);
    }

    /* renamed from: a */
    public static C4783if m15706a(Context context, C4783if ifVar, Map<String, String> map) {
        C4776hz hzVar = new C4776hz();
        hzVar.mo29446b(ifVar.mo29558a());
        C4773hw a = ifVar.mo29558a();
        if (a != null) {
            hzVar.mo29442a(a.mo29392a());
            hzVar.mo29441a(a.mo29392a());
            if (!TextUtils.isEmpty(a.mo29399b())) {
                hzVar.mo29449c(a.mo29399b());
            }
        }
        hzVar.mo29443a(C4797it.m14831a(context, ifVar));
        C4783if a2 = C4870ah.m15193a(ifVar.mo29567b(), ifVar.mo29558a(), hzVar, C4760hj.AckMessage);
        C4773hw a3 = ifVar.mo29558a();
        if (a3 != null) {
            a3 = C4925br.m15458a(a3.mo29392a());
        }
        a3.mo29397a("mat", Long.toString(System.currentTimeMillis()));
        if (map != null) {
            try {
                if (map.size() > 0) {
                    for (String next : map.keySet()) {
                        a3.mo29397a(next, map.get(next));
                    }
                }
            } catch (Throwable unused) {
            }
        }
        a2.mo29560a(a3);
        return a2;
    }

    /* renamed from: a */
    public static C4783if m15707a(byte[] bArr) {
        C4783if ifVar = new C4783if();
        try {
            C4797it.m14833a(ifVar, bArr);
            return ifVar;
        } catch (Throwable th) {
            C4408b.m12478a(th);
            return null;
        }
    }

    /* renamed from: a */
    public static void m15708a(Context context, C4783if ifVar, byte[] bArr) {
        try {
            C4874al.m15226a(ifVar);
            ifVar.mo29558a();
            C4874al.C4877c a = C4874al.m15221a(context, ifVar, bArr);
            if (a.f9461a > 0 && !TextUtils.isEmpty(a.f9462a)) {
                C4750hb.m14147a(context, a.f9462a, a.f9461a, true, false, System.currentTimeMillis());
            }
            if (!C4830m.m14998a(context) || !C4867ag.m15182a(context, ifVar, a.f9463a)) {
                m15720b(context, ifVar, bArr);
                return;
            }
            C4867ag.m15178a(context, ifVar);
            C4408b.m12464a("consume this broadcast by tts");
        } catch (Exception e) {
            C4408b.m12464a("notify push msg error " + e);
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    private static void m15709a(XMPushService xMPushService, C4783if ifVar) {
        xMPushService.mo29931a((XMPushService.C4849j) new C4991z(4, xMPushService, ifVar));
    }

    /* renamed from: a */
    private static void m15710a(XMPushService xMPushService, C4783if ifVar, C4786ii iiVar) {
        xMPushService.mo29931a((XMPushService.C4849j) new C4866af(4, iiVar, ifVar, xMPushService));
    }

    /* renamed from: a */
    private static void m15711a(XMPushService xMPushService, C4783if ifVar, String str) {
        xMPushService.mo29931a((XMPushService.C4849j) new C4864ad(4, xMPushService, ifVar, str));
    }

    /* renamed from: a */
    private static void m15712a(XMPushService xMPushService, C4783if ifVar, String str, String str2) {
        xMPushService.mo29931a((XMPushService.C4849j) new C4865ae(4, xMPushService, ifVar, str, str2));
    }

    /* JADX WARNING: type inference failed for: r5v5, types: [com.xiaomi.push.iu] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x03a4 A[SYNTHETIC, Splitter:B:128:0x03a4] */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x03c2  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x03dc  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x0426  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m15713a(com.xiaomi.push.service.XMPushService r19, java.lang.String r20, byte[] r21, android.content.Intent r22) {
        /*
            r1 = r19
            r0 = r21
            r2 = r22
            com.xiaomi.push.if r3 = m15707a((byte[]) r21)
            com.xiaomi.push.hw r4 = r3.mo29558a()
            r5 = 0
            if (r0 == 0) goto L_0x0021
            java.lang.String r6 = r3.mo29567b()
            android.content.Context r7 = r19.getApplicationContext()
            com.xiaomi.push.hj r8 = r3.mo29558a()
            int r9 = r0.length
            com.xiaomi.push.C4610db.m13287a(r6, r7, r5, r8, r9)
        L_0x0021:
            boolean r6 = m15724c(r3)
            if (r6 == 0) goto L_0x0051
            boolean r6 = m15716a((android.content.Context) r19, (java.lang.String) r20)
            if (r6 == 0) goto L_0x0051
            boolean r0 = com.xiaomi.push.service.C4874al.m15259e(r3)
            if (r0 == 0) goto L_0x004c
            android.content.Context r0 = r19.getApplicationContext()
            com.xiaomi.push.eo r0 = com.xiaomi.push.C4667eo.m13689a((android.content.Context) r0)
            java.lang.String r2 = r3.mo29567b()
            java.lang.String r5 = com.xiaomi.push.service.C4874al.m15248b((com.xiaomi.push.C4783if) r3)
            java.lang.String r4 = r4.mo29392a()
            java.lang.String r6 = "5"
            r0.mo29054a((java.lang.String) r2, (java.lang.String) r5, (java.lang.String) r4, (java.lang.String) r6)
        L_0x004c:
            m15723c(r1, r3)
            goto L_0x04b3
        L_0x0051:
            boolean r6 = m15718a((com.xiaomi.push.C4783if) r3)
            if (r6 == 0) goto L_0x0087
            boolean r6 = m15716a((android.content.Context) r19, (java.lang.String) r20)
            if (r6 != 0) goto L_0x0087
            boolean r6 = m15722b(r3)
            if (r6 != 0) goto L_0x0087
            boolean r0 = com.xiaomi.push.service.C4874al.m15259e(r3)
            if (r0 == 0) goto L_0x0082
            android.content.Context r0 = r19.getApplicationContext()
            com.xiaomi.push.eo r0 = com.xiaomi.push.C4667eo.m13689a((android.content.Context) r0)
            java.lang.String r2 = r3.mo29567b()
            java.lang.String r5 = com.xiaomi.push.service.C4874al.m15248b((com.xiaomi.push.C4783if) r3)
            java.lang.String r4 = r4.mo29392a()
            java.lang.String r6 = "6"
            r0.mo29054a((java.lang.String) r2, (java.lang.String) r5, (java.lang.String) r4, (java.lang.String) r6)
        L_0x0082:
            m15725d(r1, r3)
            goto L_0x04b3
        L_0x0087:
            boolean r6 = com.xiaomi.push.service.C4874al.m15226a((com.xiaomi.push.C4783if) r3)
            if (r6 == 0) goto L_0x0095
            java.lang.String r6 = r3.f8954b
            boolean r6 = com.xiaomi.push.C4747h.m14131b((android.content.Context) r1, (java.lang.String) r6)
            if (r6 != 0) goto L_0x009b
        L_0x0095:
            boolean r6 = m15715a((android.content.Context) r1, (android.content.Intent) r2)
            if (r6 == 0) goto L_0x0464
        L_0x009b:
            com.xiaomi.push.hj r6 = com.xiaomi.push.C4760hj.Registration
            com.xiaomi.push.hj r7 = r3.mo29558a()
            r8 = 0
            java.lang.String r9 = "eventMessageType"
            java.lang.String r10 = "messageId"
            if (r6 != r7) goto L_0x011c
            java.lang.String r12 = r3.mo29567b()
            java.lang.String r6 = "pref_registered_pkg_names"
            android.content.SharedPreferences r6 = r1.getSharedPreferences(r6, r8)
            android.content.SharedPreferences$Editor r6 = r6.edit()
            java.lang.String r7 = r3.f8950a
            r6.putString(r12, r7)
            r6.commit()
            com.xiaomi.push.ik r6 = com.xiaomi.push.service.C4971n.m15581a(r3)
            long r13 = r6.mo29678a()
            r15 = 0
            int r7 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r7 != 0) goto L_0x00de
            java.lang.String r7 = r6.mo29680b()
            boolean r7 = android.text.TextUtils.isEmpty(r7)
            if (r7 != 0) goto L_0x00de
            java.lang.String r6 = r6.mo29680b()
            com.xiaomi.push.service.C4971n.m15583a(r1, r12, r6)
            goto L_0x00e3
        L_0x00de:
            java.lang.String r6 = "read regSecret failed"
            com.xiaomi.channel.commonutils.logger.C4408b.m12483d(r6)
        L_0x00e3:
            com.xiaomi.push.service.v r6 = com.xiaomi.push.service.C4987v.m15686a((android.content.Context) r19)
            r6.mo30089e(r12)
            com.xiaomi.push.service.v r6 = com.xiaomi.push.service.C4987v.m15686a((android.content.Context) r19)
            r6.mo30090f(r12)
            android.content.Context r6 = r19.getApplicationContext()
            com.xiaomi.push.eo r11 = com.xiaomi.push.C4667eo.m13689a((android.content.Context) r6)
            java.lang.String r14 = r4.mo29392a()
            r15 = 6003(0x1773, float:8.412E-42)
            r16 = 0
            java.lang.String r13 = "E100003"
            r11.mo29053a(r12, r13, r14, r15, r16)
            java.lang.String r6 = r4.mo29392a()
            boolean r6 = android.text.TextUtils.isEmpty(r6)
            if (r6 != 0) goto L_0x011c
            java.lang.String r6 = r4.mo29392a()
            r2.putExtra(r10, r6)
            r6 = 6000(0x1770, float:8.408E-42)
            r2.putExtra(r9, r6)
        L_0x011c:
            boolean r6 = com.xiaomi.push.service.C4874al.m15257c((com.xiaomi.push.C4783if) r3)
            if (r6 == 0) goto L_0x0157
            android.content.Context r6 = r19.getApplicationContext()
            com.xiaomi.push.eo r11 = com.xiaomi.push.C4667eo.m13689a((android.content.Context) r6)
            java.lang.String r12 = r3.mo29567b()
            java.lang.String r13 = com.xiaomi.push.service.C4874al.m15248b((com.xiaomi.push.C4783if) r3)
            java.lang.String r14 = r4.mo29392a()
            r15 = 1001(0x3e9, float:1.403E-42)
            long r16 = java.lang.System.currentTimeMillis()
            r18 = 0
            r11.mo29052a(r12, r13, r14, r15, r16, r18)
            java.lang.String r6 = r4.mo29392a()
            boolean r6 = android.text.TextUtils.isEmpty(r6)
            if (r6 != 0) goto L_0x0157
            java.lang.String r6 = r4.mo29392a()
            r2.putExtra(r10, r6)
            r6 = 1000(0x3e8, float:1.401E-42)
            r2.putExtra(r9, r6)
        L_0x0157:
            boolean r6 = com.xiaomi.push.service.C4874al.m15248b((com.xiaomi.push.C4783if) r3)
            if (r6 == 0) goto L_0x0192
            android.content.Context r6 = r19.getApplicationContext()
            com.xiaomi.push.eo r11 = com.xiaomi.push.C4667eo.m13689a((android.content.Context) r6)
            java.lang.String r12 = r3.mo29567b()
            java.lang.String r13 = com.xiaomi.push.service.C4874al.m15248b((com.xiaomi.push.C4783if) r3)
            java.lang.String r14 = r4.mo29392a()
            r15 = 2001(0x7d1, float:2.804E-42)
            long r16 = java.lang.System.currentTimeMillis()
            r18 = 0
            r11.mo29052a(r12, r13, r14, r15, r16, r18)
            java.lang.String r6 = r4.mo29392a()
            boolean r6 = android.text.TextUtils.isEmpty(r6)
            if (r6 != 0) goto L_0x0192
            java.lang.String r6 = r4.mo29392a()
            r2.putExtra(r10, r6)
            r6 = 2000(0x7d0, float:2.803E-42)
            r2.putExtra(r9, r6)
        L_0x0192:
            boolean r6 = com.xiaomi.push.service.C4874al.m15226a((com.xiaomi.push.C4783if) r3)
            if (r6 == 0) goto L_0x01cd
            android.content.Context r6 = r19.getApplicationContext()
            com.xiaomi.push.eo r11 = com.xiaomi.push.C4667eo.m13689a((android.content.Context) r6)
            java.lang.String r12 = r3.mo29567b()
            java.lang.String r13 = com.xiaomi.push.service.C4874al.m15248b((com.xiaomi.push.C4783if) r3)
            java.lang.String r14 = r4.mo29392a()
            r15 = 3001(0xbb9, float:4.205E-42)
            long r16 = java.lang.System.currentTimeMillis()
            r18 = 0
            r11.mo29052a(r12, r13, r14, r15, r16, r18)
            java.lang.String r6 = r4.mo29392a()
            boolean r6 = android.text.TextUtils.isEmpty(r6)
            if (r6 != 0) goto L_0x01cd
            java.lang.String r6 = r4.mo29392a()
            r2.putExtra(r10, r6)
            r6 = 3000(0xbb8, float:4.204E-42)
            r2.putExtra(r9, r6)
        L_0x01cd:
            java.lang.String r6 = "com.xiaomi.xmsf"
            r7 = 1
            if (r4 == 0) goto L_0x026f
            java.lang.String r9 = r4.mo29404c()
            boolean r9 = android.text.TextUtils.isEmpty(r9)
            if (r9 != 0) goto L_0x026f
            java.lang.String r9 = r4.mo29410d()
            boolean r9 = android.text.TextUtils.isEmpty(r9)
            if (r9 != 0) goto L_0x026f
            int r9 = r4.f8793b
            if (r9 == r7) goto L_0x026f
            java.lang.String r9 = r3.f8954b
            java.util.Map r10 = r4.mo29392a()
            boolean r10 = com.xiaomi.push.service.C4874al.m15210a((java.util.Map<java.lang.String, java.lang.String>) r10)
            boolean r9 = com.xiaomi.push.service.C4874al.m15219a((android.content.Context) r1, (java.lang.String) r9, (boolean) r10)
            if (r9 == 0) goto L_0x01fc
            goto L_0x026f
        L_0x01fc:
            java.util.Map<java.lang.String, java.lang.String> r2 = r4.f8791a
            if (r2 == 0) goto L_0x0209
            java.lang.String r5 = "jobkey"
            java.lang.Object r2 = r2.get(r5)
            r5 = r2
            java.lang.String r5 = (java.lang.String) r5
        L_0x0209:
            boolean r2 = android.text.TextUtils.isEmpty(r5)
            if (r2 == 0) goto L_0x0213
            java.lang.String r5 = r4.mo29392a()
        L_0x0213:
            java.lang.String r2 = r3.f8954b
            boolean r2 = com.xiaomi.push.service.C4879an.m15262a(r1, r2, r5)
            if (r2 == 0) goto L_0x0258
            android.content.Context r0 = r19.getApplicationContext()
            com.xiaomi.push.eo r0 = com.xiaomi.push.C4667eo.m13689a((android.content.Context) r0)
            java.lang.String r2 = r3.mo29567b()
            java.lang.String r7 = com.xiaomi.push.service.C4874al.m15248b((com.xiaomi.push.C4783if) r3)
            java.lang.String r4 = r4.mo29392a()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "1:"
            r8.append(r9)
            r8.append(r5)
            java.lang.String r8 = r8.toString()
            r0.mo29056c(r2, r7, r4, r8)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "drop a duplicate message, key="
            r0.append(r2)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
        L_0x0254:
            com.xiaomi.channel.commonutils.logger.C4408b.m12464a((java.lang.String) r0)
            goto L_0x026a
        L_0x0258:
            boolean r2 = com.xiaomi.push.C4830m.m14998a((android.content.Context) r19)
            if (r2 == 0) goto L_0x0267
            boolean r2 = com.xiaomi.push.service.C4867ag.m15180a((com.xiaomi.push.C4783if) r3)
            if (r2 == 0) goto L_0x0267
            java.lang.String r0 = "receive pull down message"
            goto L_0x0254
        L_0x0267:
            m15708a((android.content.Context) r1, (com.xiaomi.push.C4783if) r3, (byte[]) r0)
        L_0x026a:
            m15721b(r1, r3)
            goto L_0x044e
        L_0x026f:
            java.lang.String r0 = r3.f8954b
            boolean r0 = r6.contains(r0)
            if (r0 == 0) goto L_0x02ae
            boolean r0 = r3.mo29567b()
            if (r0 != 0) goto L_0x02ae
            if (r4 == 0) goto L_0x02ae
            java.util.Map r0 = r4.mo29392a()
            if (r0 == 0) goto L_0x02ae
            java.util.Map r0 = r4.mo29392a()
            java.lang.String r9 = "ab"
            boolean r0 = r0.containsKey(r9)
            if (r0 == 0) goto L_0x02ae
            m15721b(r1, r3)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "receive abtest message. ack it."
            r0.append(r2)
            java.lang.String r2 = r4.mo29392a()
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.xiaomi.channel.commonutils.logger.C4408b.m12482c(r0)
            goto L_0x044e
        L_0x02ae:
            r0 = r20
            boolean r0 = m15719a((com.xiaomi.push.service.XMPushService) r1, (java.lang.String) r0, (com.xiaomi.push.C4783if) r3, (com.xiaomi.push.C4773hw) r4)
            if (r0 == 0) goto L_0x0435
            if (r4 == 0) goto L_0x033c
            java.lang.String r0 = r4.mo29392a()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x033c
            boolean r0 = com.xiaomi.push.service.C4874al.m15248b((com.xiaomi.push.C4783if) r3)
            if (r0 == 0) goto L_0x02e3
            android.content.Context r0 = r19.getApplicationContext()
            com.xiaomi.push.eo r9 = com.xiaomi.push.C4667eo.m13689a((android.content.Context) r0)
            java.lang.String r10 = r3.mo29567b()
            java.lang.String r11 = com.xiaomi.push.service.C4874al.m15248b((com.xiaomi.push.C4783if) r3)
            java.lang.String r12 = r4.mo29392a()
            r13 = 2002(0x7d2, float:2.805E-42)
            r14 = 0
        L_0x02df:
            r9.mo29053a(r10, r11, r12, r13, r14)
            goto L_0x033c
        L_0x02e3:
            boolean r0 = com.xiaomi.push.service.C4874al.m15226a((com.xiaomi.push.C4783if) r3)
            if (r0 == 0) goto L_0x0303
            android.content.Context r0 = r19.getApplicationContext()
            com.xiaomi.push.eo r0 = com.xiaomi.push.C4667eo.m13689a((android.content.Context) r0)
            java.lang.String r9 = r3.mo29567b()
            java.lang.String r10 = com.xiaomi.push.service.C4874al.m15248b((com.xiaomi.push.C4783if) r3)
            java.lang.String r11 = r4.mo29392a()
            java.lang.String r12 = "7"
        L_0x02ff:
            r0.mo29054a((java.lang.String) r9, (java.lang.String) r10, (java.lang.String) r11, (java.lang.String) r12)
            goto L_0x033c
        L_0x0303:
            boolean r0 = com.xiaomi.push.service.C4874al.m15257c((com.xiaomi.push.C4783if) r3)
            if (r0 == 0) goto L_0x0320
            android.content.Context r0 = r19.getApplicationContext()
            com.xiaomi.push.eo r0 = com.xiaomi.push.C4667eo.m13689a((android.content.Context) r0)
            java.lang.String r9 = r3.mo29567b()
            java.lang.String r10 = com.xiaomi.push.service.C4874al.m15248b((com.xiaomi.push.C4783if) r3)
            java.lang.String r11 = r4.mo29392a()
            java.lang.String r12 = "8"
            goto L_0x02ff
        L_0x0320:
            boolean r0 = com.xiaomi.push.service.C4874al.m15258d(r3)
            if (r0 == 0) goto L_0x033c
            android.content.Context r0 = r19.getApplicationContext()
            com.xiaomi.push.eo r9 = com.xiaomi.push.C4667eo.m13689a((android.content.Context) r0)
            java.lang.String r10 = r3.mo29567b()
            java.lang.String r12 = r4.mo29392a()
            r13 = 6004(0x1774, float:8.413E-42)
            r14 = 0
            java.lang.String r11 = "E100003"
            goto L_0x02df
        L_0x033c:
            com.xiaomi.push.hj r0 = com.xiaomi.push.C4760hj.Notification
            com.xiaomi.push.hj r9 = r3.f8947a
            if (r0 != r9) goto L_0x0423
            com.xiaomi.push.iu r5 = com.xiaomi.push.service.C4941ce.m15521a((android.content.Context) r1, (com.xiaomi.push.C4783if) r3)     // Catch:{ iz -> 0x0361 }
            if (r5 != 0) goto L_0x035f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ iz -> 0x0361 }
            r0.<init>()     // Catch:{ iz -> 0x0361 }
            java.lang.String r9 = "receiving an un-recognized notification message. "
            r0.append(r9)     // Catch:{ iz -> 0x0361 }
            com.xiaomi.push.hj r9 = r3.f8947a     // Catch:{ iz -> 0x0361 }
            r0.append(r9)     // Catch:{ iz -> 0x0361 }
            java.lang.String r0 = r0.toString()     // Catch:{ iz -> 0x0361 }
            com.xiaomi.channel.commonutils.logger.C4408b.m12483d(r0)     // Catch:{ iz -> 0x0361 }
            goto L_0x0376
        L_0x035f:
            r0 = 1
            goto L_0x0377
        L_0x0361:
            r0 = move-exception
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "receive a message which action string is not valid. "
            r9.append(r10)
            r9.append(r0)
            java.lang.String r0 = r9.toString()
            com.xiaomi.channel.commonutils.logger.C4408b.m12483d(r0)
        L_0x0376:
            r0 = 0
        L_0x0377:
            if (r0 == 0) goto L_0x0423
            boolean r0 = r5 instanceof com.xiaomi.push.C4786ii
            if (r0 == 0) goto L_0x0423
            com.xiaomi.push.ii r5 = (com.xiaomi.push.C4786ii) r5
            com.xiaomi.push.ht r0 = com.xiaomi.push.C4770ht.CancelPushMessage
            java.lang.String r0 = r0.f8718a
            java.lang.String r9 = r5.f8988d
            boolean r0 = r0.equals(r9)
            if (r0 == 0) goto L_0x0423
            java.util.Map r0 = r5.mo29592a()
            if (r0 == 0) goto L_0x0423
            java.util.Map r0 = r5.mo29592a()
            java.lang.String r7 = com.xiaomi.push.service.C4916bk.f9577M
            java.lang.Object r0 = r0.get(r7)
            java.lang.String r0 = (java.lang.String) r0
            boolean r7 = android.text.TextUtils.isEmpty(r0)
            r9 = -2
            if (r7 != 0) goto L_0x03bf
            int r9 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x03a9 }
            goto L_0x03bf
        L_0x03a9:
            r0 = move-exception
            r7 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r10 = "parse notifyId from STRING to INT failed: "
            r0.append(r10)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            com.xiaomi.channel.commonutils.logger.C4408b.m12464a((java.lang.String) r0)
        L_0x03bf:
            r0 = -1
            if (r9 < r0) goto L_0x03dc
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r7 = "try to retract a message by notifyId="
            r0.append(r7)
            r0.append(r9)
            java.lang.String r0 = r0.toString()
            com.xiaomi.channel.commonutils.logger.C4408b.m12464a((java.lang.String) r0)
            java.lang.String r0 = r3.f8954b
            com.xiaomi.push.service.C4874al.m15231a((android.content.Context) r1, (java.lang.String) r0, (int) r9)
            goto L_0x03fe
        L_0x03dc:
            java.util.Map r0 = r5.mo29592a()
            java.lang.String r7 = com.xiaomi.push.service.C4916bk.f9575K
            java.lang.Object r0 = r0.get(r7)
            java.lang.String r0 = (java.lang.String) r0
            java.util.Map r7 = r5.mo29592a()
            java.lang.String r9 = com.xiaomi.push.service.C4916bk.f9576L
            java.lang.Object r7 = r7.get(r9)
            java.lang.String r7 = (java.lang.String) r7
            java.lang.String r9 = "try to retract a message by title&description."
            com.xiaomi.channel.commonutils.logger.C4408b.m12464a((java.lang.String) r9)
            java.lang.String r9 = r3.f8954b
            com.xiaomi.push.service.C4874al.m15233a((android.content.Context) r1, (java.lang.String) r9, (java.lang.String) r0, (java.lang.String) r7)
        L_0x03fe:
            if (r4 == 0) goto L_0x041f
            java.util.Map r0 = r4.mo29392a()
            if (r0 == 0) goto L_0x041f
            boolean r0 = com.xiaomi.push.C4830m.m14998a((android.content.Context) r19)
            if (r0 == 0) goto L_0x041f
            java.util.Map r0 = r4.mo29392a()
            java.lang.String r0 = com.xiaomi.push.service.C4894ay.m15346a((java.lang.Object) r0)
            java.lang.String r4 = "pulldown"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x041f
            com.xiaomi.push.service.C4867ag.m15180a((com.xiaomi.push.C4783if) r3)
        L_0x041f:
            m15710a((com.xiaomi.push.service.XMPushService) r1, (com.xiaomi.push.C4783if) r3, (com.xiaomi.push.C4786ii) r5)
            goto L_0x0424
        L_0x0423:
            r8 = 1
        L_0x0424:
            if (r8 == 0) goto L_0x044e
            java.lang.String r0 = "broadcast passthrough message."
            com.xiaomi.channel.commonutils.logger.C4408b.m12464a((java.lang.String) r0)
            java.lang.String r0 = r3.f8954b
            java.lang.String r0 = com.xiaomi.push.service.C4870ah.m15196a((java.lang.String) r0)
            r1.sendBroadcast(r2, r0)
            goto L_0x044e
        L_0x0435:
            android.content.Context r0 = r19.getApplicationContext()
            com.xiaomi.push.eo r0 = com.xiaomi.push.C4667eo.m13689a((android.content.Context) r0)
            java.lang.String r2 = r3.mo29567b()
            java.lang.String r5 = com.xiaomi.push.service.C4874al.m15248b((com.xiaomi.push.C4783if) r3)
            java.lang.String r4 = r4.mo29392a()
            java.lang.String r7 = "9"
            r0.mo29054a((java.lang.String) r2, (java.lang.String) r5, (java.lang.String) r4, (java.lang.String) r7)
        L_0x044e:
            com.xiaomi.push.hj r0 = r3.mo29558a()
            com.xiaomi.push.hj r2 = com.xiaomi.push.C4760hj.UnRegistration
            if (r0 != r2) goto L_0x04b3
            java.lang.String r0 = r19.getPackageName()
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L_0x04b3
            r19.stopSelf()
            goto L_0x04b3
        L_0x0464:
            java.lang.String r0 = r3.f8954b
            boolean r0 = com.xiaomi.push.C4747h.m14131b((android.content.Context) r1, (java.lang.String) r0)
            if (r0 != 0) goto L_0x048f
            boolean r0 = com.xiaomi.push.service.C4874al.m15259e(r3)
            if (r0 == 0) goto L_0x048b
            android.content.Context r0 = r19.getApplicationContext()
            com.xiaomi.push.eo r0 = com.xiaomi.push.C4667eo.m13689a((android.content.Context) r0)
            java.lang.String r2 = r3.mo29567b()
            java.lang.String r5 = com.xiaomi.push.service.C4874al.m15248b((com.xiaomi.push.C4783if) r3)
            java.lang.String r4 = r4.mo29392a()
            java.lang.String r6 = "2"
            r0.mo29055b(r2, r5, r4, r6)
        L_0x048b:
            m15709a((com.xiaomi.push.service.XMPushService) r1, (com.xiaomi.push.C4783if) r3)
            goto L_0x04b3
        L_0x048f:
            java.lang.String r0 = "receive a mipush message, we can see the app, but we can't see the receiver."
            com.xiaomi.channel.commonutils.logger.C4408b.m12464a((java.lang.String) r0)
            boolean r0 = com.xiaomi.push.service.C4874al.m15259e(r3)
            if (r0 == 0) goto L_0x04b3
            android.content.Context r0 = r19.getApplicationContext()
            com.xiaomi.push.eo r0 = com.xiaomi.push.C4667eo.m13689a((android.content.Context) r0)
            java.lang.String r1 = r3.mo29567b()
            java.lang.String r2 = com.xiaomi.push.service.C4874al.m15248b((com.xiaomi.push.C4783if) r3)
            java.lang.String r3 = r4.mo29392a()
            java.lang.String r4 = "3"
            r0.mo29055b(r1, r2, r3, r4)
        L_0x04b3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.service.C4990y.m15713a(com.xiaomi.push.service.XMPushService, java.lang.String, byte[], android.content.Intent):void");
    }

    /* renamed from: a */
    private static void m15714a(XMPushService xMPushService, byte[] bArr, long j) {
        Map a;
        C4783if a2 = m15707a(bArr);
        if (a2 != null) {
            if (TextUtils.isEmpty(a2.f8954b)) {
                C4408b.m12464a("receive a mipush message without package name");
                return;
            }
            Long valueOf = Long.valueOf(System.currentTimeMillis());
            Intent a3 = m15704a(bArr, valueOf.longValue());
            String a4 = C4874al.m15226a(a2);
            C4750hb.m14147a(xMPushService, a4, j, true, true, System.currentTimeMillis());
            C4773hw a5 = a2.mo29558a();
            if (!(a5 == null || a5.mo29392a() == null)) {
                C4408b.m12484e(String.format("receive a message. appid=%1$s, msgid= %2$s, action=%3$s", new Object[]{a2.mo29558a(), C4902bd.m15381a(a5.mo29392a()), a2.mo29558a()}));
            }
            if (a5 != null) {
                a5.mo29397a("mrt", Long.toString(valueOf.longValue()));
            }
            C4760hj hjVar = C4760hj.SendMessage;
            String str = "";
            if (hjVar == a2.mo29558a() && C4987v.m15686a((Context) xMPushService).mo30085a(a2.f8954b) && !C4874al.m15226a(a2)) {
                if (a5 != null) {
                    str = a5.mo29392a();
                    if (C4874al.m15259e(a2)) {
                        C4667eo.m13689a(xMPushService.getApplicationContext()).mo29054a(a2.mo29567b(), C4874al.m15248b(a2), str, TimerCodec.ENABLE);
                    }
                }
                C4408b.m12464a("Drop a message for unregistered, msgid=" + str);
                m15711a(xMPushService, a2, a2.f8954b);
            } else if (hjVar == a2.mo29558a() && C4987v.m15686a((Context) xMPushService).mo30087c(a2.f8954b) && !C4874al.m15226a(a2)) {
                if (a5 != null) {
                    str = a5.mo29392a();
                    if (C4874al.m15259e(a2)) {
                        C4667eo.m13689a(xMPushService.getApplicationContext()).mo29054a(a2.mo29567b(), C4874al.m15248b(a2), str, "2");
                    }
                }
                C4408b.m12464a("Drop a message for push closed, msgid=" + str);
                m15711a(xMPushService, a2, a2.f8954b);
            } else if (hjVar == a2.mo29558a() && !TextUtils.equals(xMPushService.getPackageName(), "com.xiaomi.xmsf") && !TextUtils.equals(xMPushService.getPackageName(), a2.f8954b)) {
                C4408b.m12464a("Receive a message with wrong package name, expect " + xMPushService.getPackageName() + ", received " + a2.f8954b);
                m15712a(xMPushService, a2, "unmatched_package", "package should be " + xMPushService.getPackageName() + ", but got " + a2.f8954b);
                if (a5 != null && C4874al.m15259e(a2)) {
                    C4667eo.m13689a(xMPushService.getApplicationContext()).mo29054a(a2.mo29567b(), C4874al.m15248b(a2), a5.mo29392a(), "3");
                }
            } else if (hjVar == a2.mo29558a() && C4805j.m14859a() == 999 && C4805j.m14866a((Context) xMPushService, a4)) {
                C4408b.m12464a("Receive the uninstalled dual app message");
                try {
                    C4870ah.m15198a(xMPushService, C4870ah.m15192a(a4, a2.mo29558a()));
                    C4408b.m12464a("uninstall " + a4 + " msg sent");
                } catch (C4724gh e) {
                    C4408b.m12483d("Fail to send Message: " + e.getMessage());
                    xMPushService.mo29929a(10, (Exception) e);
                }
                C4874al.m15207a((Context) xMPushService, a4);
            } else if (a5 == null || (a = a5.mo29392a()) == null || !a.containsKey("hide") || !"true".equalsIgnoreCase((String) a.get("hide"))) {
                m15713a(xMPushService, a4, bArr, a3);
            } else {
                m15721b(xMPushService, a2);
            }
        }
    }

    /* renamed from: a */
    private static boolean m15715a(Context context, Intent intent) {
        try {
            List<ResolveInfo> queryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent, 32);
            return queryBroadcastReceivers != null && !queryBroadcastReceivers.isEmpty();
        } catch (Exception unused) {
            return true;
        }
    }

    /* renamed from: a */
    private static boolean m15716a(Context context, String str) {
        Intent intent = new Intent("com.xiaomi.mipush.miui.CLICK_MESSAGE");
        intent.setPackage(str);
        Intent intent2 = new Intent("com.xiaomi.mipush.miui.RECEIVE_MESSAGE");
        intent2.setPackage(str);
        PackageManager packageManager = context.getPackageManager();
        try {
            return !packageManager.queryBroadcastReceivers(intent2, 32).isEmpty() || !packageManager.queryIntentServices(intent, 32).isEmpty();
        } catch (Exception e) {
            C4408b.m12478a((Throwable) e);
            return false;
        }
    }

    /* renamed from: a */
    public static boolean m15717a(Context context, String str, byte[] bArr) {
        if (!C4747h.m14123a(context, str)) {
            return false;
        }
        Intent intent = new Intent("com.xiaomi.mipush.MESSAGE_ARRIVED");
        intent.putExtra("mipush_payload", bArr);
        intent.setPackage(str);
        try {
            if (context.getPackageManager().queryBroadcastReceivers(intent, 0).isEmpty()) {
                return false;
            }
            C4408b.m12464a("broadcast message arrived.");
            context.sendBroadcast(intent, C4870ah.m15196a(str));
            return true;
        } catch (Exception e) {
            C4408b.m12464a("meet error when broadcast message arrived. " + e);
            return false;
        }
    }

    /* renamed from: a */
    private static boolean m15718a(C4783if ifVar) {
        return "com.xiaomi.xmsf".equals(ifVar.f8954b) && ifVar.mo29558a() != null && ifVar.mo29558a().mo29392a() != null && ifVar.mo29558a().mo29392a().containsKey("miui_package_name");
    }

    /* renamed from: a */
    private static boolean m15719a(XMPushService xMPushService, String str, C4783if ifVar, C4773hw hwVar) {
        boolean z = true;
        if (hwVar != null && hwVar.mo29392a() != null && hwVar.mo29392a().containsKey("__check_alive") && hwVar.mo29392a().containsKey("__awake")) {
            C4786ii iiVar = new C4786ii();
            iiVar.mo29599b(ifVar.mo29558a());
            iiVar.mo29606d(str);
            iiVar.mo29602c(C4770ht.AwakeSystemApp.f8718a);
            iiVar.mo29593a(hwVar.mo29392a());
            iiVar.f8983a = new HashMap();
            boolean a = C4747h.m14123a(xMPushService.getApplicationContext(), str);
            iiVar.f8983a.put("app_running", Boolean.toString(a));
            if (!a) {
                boolean parseBoolean = Boolean.parseBoolean((String) hwVar.mo29392a().get("__awake"));
                iiVar.f8983a.put("awaked", Boolean.toString(parseBoolean));
                if (!parseBoolean) {
                    z = false;
                }
            }
            try {
                C4870ah.m15198a(xMPushService, C4870ah.m15193a(ifVar.mo29567b(), ifVar.mo29558a(), iiVar, C4760hj.Notification));
            } catch (C4724gh e) {
                C4408b.m12478a((Throwable) e);
            }
        }
        return z;
    }

    /* renamed from: b */
    private static void m15720b(Context context, C4783if ifVar, byte[] bArr) {
        if (!C4874al.m15226a(ifVar)) {
            String a = C4874al.m15226a(ifVar);
            if (!TextUtils.isEmpty(a) && !m15717a(context, a, bArr)) {
                C4667eo.m13689a(context).mo29055b(a, C4874al.m15248b(ifVar), ifVar.mo29558a().mo29392a(), TimerCodec.ENABLE);
            }
        }
    }

    /* renamed from: b */
    private static void m15721b(XMPushService xMPushService, C4783if ifVar) {
        xMPushService.mo29931a((XMPushService.C4849j) new C4861aa(4, xMPushService, ifVar));
    }

    /* renamed from: b */
    private static boolean m15722b(C4783if ifVar) {
        Map a = ifVar.mo29558a().mo29392a();
        return a != null && a.containsKey("notify_effect");
    }

    /* renamed from: c */
    private static void m15723c(XMPushService xMPushService, C4783if ifVar) {
        xMPushService.mo29931a((XMPushService.C4849j) new C4862ab(4, xMPushService, ifVar));
    }

    /* renamed from: c */
    private static boolean m15724c(C4783if ifVar) {
        if (ifVar.mo29558a() == null || ifVar.mo29558a().mo29392a() == null) {
            return false;
        }
        return TimerCodec.ENABLE.equals(ifVar.mo29558a().mo29392a().get("obslete_ads_message"));
    }

    /* renamed from: d */
    private static void m15725d(XMPushService xMPushService, C4783if ifVar) {
        xMPushService.mo29931a((XMPushService.C4849j) new C4863ac(4, xMPushService, ifVar));
    }

    /* renamed from: a */
    public void mo30091a(Context context, C4906bg.C4908b bVar, boolean z, int i, String str) {
        C4984t a;
        if (!z && (a = C4985u.m15674a(context)) != null && "token-expired".equals(str)) {
            C4985u.m15676a(context, a.f9746f, a.f9744d, a.f9745e);
        }
    }

    /* renamed from: a */
    public void mo30092a(XMPushService xMPushService, C4695fl flVar, C4906bg.C4908b bVar) {
        try {
            m15714a(xMPushService, flVar.mo29149a(bVar.f9548h), (long) flVar.mo29156c());
        } catch (IllegalArgumentException e) {
            C4408b.m12478a((Throwable) e);
        }
    }

    /* renamed from: a */
    public void mo30093a(XMPushService xMPushService, C4731gn gnVar, C4906bg.C4908b bVar) {
        if (gnVar instanceof C4730gm) {
            C4730gm gmVar = (C4730gm) gnVar;
            C4727gk a = gmVar.mo29228a(C11641s.f21397C);
            if (a != null) {
                try {
                    m15714a(xMPushService, C4923bp.m15451a(C4923bp.m15450a(bVar.f9548h, gmVar.mo29251j()), a.mo29220c()), (long) C4750hb.m14139a(gnVar.mo29223a()));
                } catch (IllegalArgumentException e) {
                    C4408b.m12478a((Throwable) e);
                }
            }
        } else {
            C4408b.m12464a("not a mipush message");
        }
    }
}
