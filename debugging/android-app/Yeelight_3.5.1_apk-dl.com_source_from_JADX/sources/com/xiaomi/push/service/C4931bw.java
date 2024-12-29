package com.xiaomi.push.service;

import com.xiaomi.push.C4521ao;
import com.xiaomi.push.service.C4929bv;

/* renamed from: com.xiaomi.push.service.bw */
class C4931bw extends C4521ao.C4523b {

    /* renamed from: a */
    final /* synthetic */ C4929bv f9633a;

    /* renamed from: a */
    boolean f9634a = false;

    C4931bw(C4929bv bvVar) {
        this.f9633a = bvVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0039 A[Catch:{ Exception -> 0x0047 }] */
    /* JADX WARNING: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo28749b() {
        /*
            r3 = this;
            android.content.Context r0 = com.xiaomi.push.C4994v.m15733a()     // Catch:{ Exception -> 0x0047 }
            com.xiaomi.push.service.a r0 = com.xiaomi.push.service.C4860a.m15159a((android.content.Context) r0)     // Catch:{ Exception -> 0x0047 }
            java.lang.String r0 = r0.mo29957a()     // Catch:{ Exception -> 0x0047 }
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch:{ Exception -> 0x0047 }
            if (r1 != 0) goto L_0x0022
            com.xiaomi.push.q r1 = com.xiaomi.push.C4835q.China     // Catch:{ Exception -> 0x0047 }
            java.lang.String r1 = r1.name()     // Catch:{ Exception -> 0x0047 }
            boolean r0 = r1.equals(r0)     // Catch:{ Exception -> 0x0047 }
            if (r0 == 0) goto L_0x001f
            goto L_0x0022
        L_0x001f:
            java.lang.String r0 = "https://resolver.msg.global.xiaomi.net/psc/?t=a"
            goto L_0x0024
        L_0x0022:
            java.lang.String r0 = "https://resolver.msg.xiaomi.net/psc/?t=a"
        L_0x0024:
            android.content.Context r1 = com.xiaomi.push.C4994v.m15733a()     // Catch:{ Exception -> 0x0047 }
            r2 = 0
            java.lang.String r0 = com.xiaomi.push.C4606cz.m13267a((android.content.Context) r1, (java.lang.String) r0, (java.util.List<com.xiaomi.push.C4550bi>) r2)     // Catch:{ Exception -> 0x0047 }
            r1 = 10
            byte[] r0 = android.util.Base64.decode(r0, r1)     // Catch:{ Exception -> 0x0047 }
            com.xiaomi.push.dw$a r0 = com.xiaomi.push.C4635dw.C4636a.m13363a((byte[]) r0)     // Catch:{ Exception -> 0x0047 }
            if (r0 == 0) goto L_0x0060
            com.xiaomi.push.service.bv r1 = r3.f9633a     // Catch:{ Exception -> 0x0047 }
            com.xiaomi.push.C4635dw.C4636a unused = r1.f9631a = r0     // Catch:{ Exception -> 0x0047 }
            r0 = 1
            r3.f9634a = r0     // Catch:{ Exception -> 0x0047 }
            com.xiaomi.push.service.bv r0 = r3.f9633a     // Catch:{ Exception -> 0x0047 }
            com.xiaomi.push.service.C4929bv.m15464a((com.xiaomi.push.service.C4929bv) r0)     // Catch:{ Exception -> 0x0047 }
            goto L_0x0060
        L_0x0047:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "fetch config failure: "
            r1.append(r2)
            java.lang.String r0 = r0.getMessage()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.xiaomi.channel.commonutils.logger.C4408b.m12464a((java.lang.String) r0)
        L_0x0060:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.service.C4931bw.mo28749b():void");
    }

    /* renamed from: c */
    public void mo28750c() {
        C4929bv.C4930a[] aVarArr;
        C4521ao.C4523b unused = this.f9633a.f9630a = null;
        if (this.f9634a) {
            synchronized (this.f9633a) {
                aVarArr = (C4929bv.C4930a[]) C4929bv.m15464a(this.f9633a).toArray(new C4929bv.C4930a[C4929bv.m15464a(this.f9633a).size()]);
            }
            for (C4929bv.C4930a a : aVarArr) {
                a.mo30022a(C4929bv.m15464a(this.f9633a));
            }
        }
    }
}
