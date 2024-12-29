package com.xiaomi.mipush.sdk;

import android.content.Context;
import com.xiaomi.channel.commonutils.logger.C4408b;
import com.xiaomi.push.C4765ho;
import com.xiaomi.push.service.C4898ba;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.xiaomi.mipush.sdk.f */
public class C4480f implements AbstractPushManager {

    /* renamed from: a */
    private static volatile C4480f f7498a;

    /* renamed from: a */
    private Context f7499a;

    /* renamed from: a */
    private PushConfiguration f7500a;

    /* renamed from: a */
    private Map<C4479e, AbstractPushManager> f7501a = new HashMap();
    /* access modifiers changed from: private */

    /* renamed from: a */
    public boolean f7502a = false;

    private C4480f(Context context) {
        this.f7499a = context.getApplicationContext();
    }

    /* renamed from: a */
    public static C4480f m12751a(Context context) {
        if (f7498a == null) {
            synchronized (C4480f.class) {
                if (f7498a == null) {
                    f7498a = new C4480f(context);
                }
            }
        }
        return f7498a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x013c  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x018b  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x01c3  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x01ed  */
    /* JADX WARNING: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m12752a() {
        /*
            r4 = this;
            com.xiaomi.mipush.sdk.PushConfiguration r0 = r4.f7500a
            if (r0 == 0) goto L_0x01f3
            boolean r0 = r0.getOpenHmsPush()
            java.lang.String r1 = "ASSEMBLE_PUSH : "
            if (r0 == 0) goto L_0x0059
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = " HW user switch : "
            r0.append(r2)
            com.xiaomi.mipush.sdk.PushConfiguration r2 = r4.f7500a
            boolean r2 = r2.getOpenHmsPush()
            r0.append(r2)
            java.lang.String r2 = " HW online switch : "
            r0.append(r2)
            android.content.Context r2 = r4.f7499a
            com.xiaomi.mipush.sdk.e r3 = com.xiaomi.mipush.sdk.C4479e.ASSEMBLE_PUSH_HUAWEI
            boolean r2 = com.xiaomi.mipush.sdk.C4483i.m12765a((android.content.Context) r2, (com.xiaomi.mipush.sdk.C4479e) r3)
            r0.append(r2)
            java.lang.String r2 = " HW isSupport : "
            r0.append(r2)
            com.xiaomi.mipush.sdk.ag r2 = com.xiaomi.mipush.sdk.C4457ag.HUAWEI
            android.content.Context r3 = r4.f7499a
            com.xiaomi.mipush.sdk.ag r3 = com.xiaomi.mipush.sdk.C4489n.m12791a((android.content.Context) r3)
            boolean r2 = r2.equals(r3)
            r0.append(r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            java.lang.String r0 = r0.toString()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.xiaomi.channel.commonutils.logger.C4408b.m12464a((java.lang.String) r0)
        L_0x0059:
            com.xiaomi.mipush.sdk.PushConfiguration r0 = r4.f7500a
            boolean r0 = r0.getOpenHmsPush()
            if (r0 == 0) goto L_0x008e
            android.content.Context r0 = r4.f7499a
            com.xiaomi.mipush.sdk.e r2 = com.xiaomi.mipush.sdk.C4479e.ASSEMBLE_PUSH_HUAWEI
            boolean r0 = com.xiaomi.mipush.sdk.C4483i.m12765a((android.content.Context) r0, (com.xiaomi.mipush.sdk.C4479e) r2)
            if (r0 == 0) goto L_0x008e
            com.xiaomi.mipush.sdk.ag r0 = com.xiaomi.mipush.sdk.C4457ag.HUAWEI
            android.content.Context r3 = r4.f7499a
            com.xiaomi.mipush.sdk.ag r3 = com.xiaomi.mipush.sdk.C4489n.m12791a((android.content.Context) r3)
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x008e
            boolean r0 = r4.mo28709a((com.xiaomi.mipush.sdk.C4479e) r2)
            if (r0 != 0) goto L_0x0088
            android.content.Context r0 = r4.f7499a
            com.xiaomi.mipush.sdk.AbstractPushManager r0 = com.xiaomi.mipush.sdk.C4461ak.m12620a(r0, r2)
            r4.mo28711a((com.xiaomi.mipush.sdk.C4479e) r2, (com.xiaomi.mipush.sdk.AbstractPushManager) r0)
        L_0x0088:
            java.lang.String r0 = "hw manager add to list"
            com.xiaomi.channel.commonutils.logger.C4408b.m12482c(r0)
            goto L_0x00a2
        L_0x008e:
            com.xiaomi.mipush.sdk.e r0 = com.xiaomi.mipush.sdk.C4479e.ASSEMBLE_PUSH_HUAWEI
            boolean r2 = r4.mo28709a((com.xiaomi.mipush.sdk.C4479e) r0)
            if (r2 == 0) goto L_0x00a2
            com.xiaomi.mipush.sdk.AbstractPushManager r2 = r4.mo28709a((com.xiaomi.mipush.sdk.C4479e) r0)
            if (r2 == 0) goto L_0x00a2
            r4.mo28709a((com.xiaomi.mipush.sdk.C4479e) r0)
            r2.unregister()
        L_0x00a2:
            com.xiaomi.mipush.sdk.PushConfiguration r0 = r4.f7500a
            boolean r0 = r0.getOpenFCMPush()
            if (r0 == 0) goto L_0x00f1
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = " FCM user switch : "
            r0.append(r2)
            com.xiaomi.mipush.sdk.PushConfiguration r2 = r4.f7500a
            boolean r2 = r2.getOpenFCMPush()
            r0.append(r2)
            java.lang.String r2 = " FCM online switch : "
            r0.append(r2)
            android.content.Context r2 = r4.f7499a
            com.xiaomi.mipush.sdk.e r3 = com.xiaomi.mipush.sdk.C4479e.ASSEMBLE_PUSH_FCM
            boolean r2 = com.xiaomi.mipush.sdk.C4483i.m12765a((android.content.Context) r2, (com.xiaomi.mipush.sdk.C4479e) r3)
            r0.append(r2)
            java.lang.String r2 = " FCM isSupport : "
            r0.append(r2)
            android.content.Context r2 = r4.f7499a
            boolean r2 = com.xiaomi.mipush.sdk.C4489n.m12791a((android.content.Context) r2)
            r0.append(r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            java.lang.String r0 = r0.toString()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.xiaomi.channel.commonutils.logger.C4408b.m12464a((java.lang.String) r0)
        L_0x00f1:
            com.xiaomi.mipush.sdk.PushConfiguration r0 = r4.f7500a
            boolean r0 = r0.getOpenFCMPush()
            if (r0 == 0) goto L_0x0120
            android.content.Context r0 = r4.f7499a
            com.xiaomi.mipush.sdk.e r2 = com.xiaomi.mipush.sdk.C4479e.ASSEMBLE_PUSH_FCM
            boolean r0 = com.xiaomi.mipush.sdk.C4483i.m12765a((android.content.Context) r0, (com.xiaomi.mipush.sdk.C4479e) r2)
            if (r0 == 0) goto L_0x0120
            android.content.Context r0 = r4.f7499a
            boolean r0 = com.xiaomi.mipush.sdk.C4489n.m12791a((android.content.Context) r0)
            if (r0 == 0) goto L_0x0120
            boolean r0 = r4.mo28709a((com.xiaomi.mipush.sdk.C4479e) r2)
            if (r0 != 0) goto L_0x011a
            android.content.Context r0 = r4.f7499a
            com.xiaomi.mipush.sdk.AbstractPushManager r0 = com.xiaomi.mipush.sdk.C4461ak.m12620a(r0, r2)
            r4.mo28711a((com.xiaomi.mipush.sdk.C4479e) r2, (com.xiaomi.mipush.sdk.AbstractPushManager) r0)
        L_0x011a:
            java.lang.String r0 = "fcm manager add to list"
            com.xiaomi.channel.commonutils.logger.C4408b.m12482c(r0)
            goto L_0x0134
        L_0x0120:
            com.xiaomi.mipush.sdk.e r0 = com.xiaomi.mipush.sdk.C4479e.ASSEMBLE_PUSH_FCM
            boolean r2 = r4.mo28709a((com.xiaomi.mipush.sdk.C4479e) r0)
            if (r2 == 0) goto L_0x0134
            com.xiaomi.mipush.sdk.AbstractPushManager r2 = r4.mo28709a((com.xiaomi.mipush.sdk.C4479e) r0)
            if (r2 == 0) goto L_0x0134
            r4.mo28709a((com.xiaomi.mipush.sdk.C4479e) r0)
            r2.unregister()
        L_0x0134:
            com.xiaomi.mipush.sdk.PushConfiguration r0 = r4.f7500a
            boolean r0 = r0.getOpenCOSPush()
            if (r0 == 0) goto L_0x0183
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = " COS user switch : "
            r0.append(r2)
            com.xiaomi.mipush.sdk.PushConfiguration r2 = r4.f7500a
            boolean r2 = r2.getOpenCOSPush()
            r0.append(r2)
            java.lang.String r2 = " COS online switch : "
            r0.append(r2)
            android.content.Context r2 = r4.f7499a
            com.xiaomi.mipush.sdk.e r3 = com.xiaomi.mipush.sdk.C4479e.ASSEMBLE_PUSH_COS
            boolean r2 = com.xiaomi.mipush.sdk.C4483i.m12765a((android.content.Context) r2, (com.xiaomi.mipush.sdk.C4479e) r3)
            r0.append(r2)
            java.lang.String r2 = " COS isSupport : "
            r0.append(r2)
            android.content.Context r2 = r4.f7499a
            boolean r2 = com.xiaomi.mipush.sdk.C4489n.m12794b(r2)
            r0.append(r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            java.lang.String r0 = r0.toString()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.xiaomi.channel.commonutils.logger.C4408b.m12464a((java.lang.String) r0)
        L_0x0183:
            com.xiaomi.mipush.sdk.PushConfiguration r0 = r4.f7500a
            boolean r0 = r0.getOpenCOSPush()
            if (r0 == 0) goto L_0x01a7
            android.content.Context r0 = r4.f7499a
            com.xiaomi.mipush.sdk.e r1 = com.xiaomi.mipush.sdk.C4479e.ASSEMBLE_PUSH_COS
            boolean r0 = com.xiaomi.mipush.sdk.C4483i.m12765a((android.content.Context) r0, (com.xiaomi.mipush.sdk.C4479e) r1)
            if (r0 == 0) goto L_0x01a7
            android.content.Context r0 = r4.f7499a
            boolean r0 = com.xiaomi.mipush.sdk.C4489n.m12794b(r0)
            if (r0 == 0) goto L_0x01a7
            android.content.Context r0 = r4.f7499a
            com.xiaomi.mipush.sdk.AbstractPushManager r0 = com.xiaomi.mipush.sdk.C4461ak.m12620a(r0, r1)
            r4.mo28711a((com.xiaomi.mipush.sdk.C4479e) r1, (com.xiaomi.mipush.sdk.AbstractPushManager) r0)
            goto L_0x01bb
        L_0x01a7:
            com.xiaomi.mipush.sdk.e r0 = com.xiaomi.mipush.sdk.C4479e.ASSEMBLE_PUSH_COS
            boolean r1 = r4.mo28709a((com.xiaomi.mipush.sdk.C4479e) r0)
            if (r1 == 0) goto L_0x01bb
            com.xiaomi.mipush.sdk.AbstractPushManager r1 = r4.mo28709a((com.xiaomi.mipush.sdk.C4479e) r0)
            if (r1 == 0) goto L_0x01bb
            r4.mo28709a((com.xiaomi.mipush.sdk.C4479e) r0)
            r1.unregister()
        L_0x01bb:
            com.xiaomi.mipush.sdk.PushConfiguration r0 = r4.f7500a
            boolean r0 = r0.getOpenFTOSPush()
            if (r0 == 0) goto L_0x01df
            android.content.Context r0 = r4.f7499a
            com.xiaomi.mipush.sdk.e r1 = com.xiaomi.mipush.sdk.C4479e.ASSEMBLE_PUSH_FTOS
            boolean r0 = com.xiaomi.mipush.sdk.C4483i.m12765a((android.content.Context) r0, (com.xiaomi.mipush.sdk.C4479e) r1)
            if (r0 == 0) goto L_0x01df
            android.content.Context r0 = r4.f7499a
            boolean r0 = com.xiaomi.mipush.sdk.C4489n.m12795c(r0)
            if (r0 == 0) goto L_0x01df
            android.content.Context r0 = r4.f7499a
            com.xiaomi.mipush.sdk.AbstractPushManager r0 = com.xiaomi.mipush.sdk.C4461ak.m12620a(r0, r1)
            r4.mo28711a((com.xiaomi.mipush.sdk.C4479e) r1, (com.xiaomi.mipush.sdk.AbstractPushManager) r0)
            goto L_0x01f3
        L_0x01df:
            com.xiaomi.mipush.sdk.e r0 = com.xiaomi.mipush.sdk.C4479e.ASSEMBLE_PUSH_FTOS
            boolean r1 = r4.mo28709a((com.xiaomi.mipush.sdk.C4479e) r0)
            if (r1 == 0) goto L_0x01f3
            com.xiaomi.mipush.sdk.AbstractPushManager r1 = r4.mo28709a((com.xiaomi.mipush.sdk.C4479e) r0)
            if (r1 == 0) goto L_0x01f3
            r4.mo28709a((com.xiaomi.mipush.sdk.C4479e) r0)
            r1.unregister()
        L_0x01f3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.mipush.sdk.C4480f.m12752a():void");
    }

    /* renamed from: a */
    public AbstractPushManager mo28709a(C4479e eVar) {
        return this.f7501a.get(eVar);
    }

    /* renamed from: a */
    public void mo28710a(PushConfiguration pushConfiguration) {
        this.f7500a = pushConfiguration;
        this.f7502a = C4898ba.m15362a(this.f7499a).mo29996a(C4765ho.AggregatePushSwitch.mo29322a(), true);
        if (this.f7500a.getOpenHmsPush() || this.f7500a.getOpenFCMPush() || this.f7500a.getOpenCOSPush() || this.f7500a.getOpenFTOSPush()) {
            C4898ba.m15362a(this.f7499a).mo29993a((C4898ba.C4899a) new C4481g(this, 101, "assemblePush"));
        }
    }

    /* renamed from: a */
    public void m12757a(C4479e eVar) {
        this.f7501a.remove(eVar);
    }

    /* renamed from: a */
    public void mo28711a(C4479e eVar, AbstractPushManager abstractPushManager) {
        if (abstractPushManager != null) {
            if (this.f7501a.containsKey(eVar)) {
                this.f7501a.remove(eVar);
            }
            this.f7501a.put(eVar, abstractPushManager);
        }
    }

    /* renamed from: a */
    public boolean m12759a(C4479e eVar) {
        return this.f7501a.containsKey(eVar);
    }

    /* renamed from: b */
    public boolean mo28712b(C4479e eVar) {
        int i = C4482h.f7504a[eVar.ordinal()];
        boolean z = false;
        if (i == 1) {
            PushConfiguration pushConfiguration = this.f7500a;
            if (pushConfiguration != null) {
                return pushConfiguration.getOpenHmsPush();
            }
            return false;
        } else if (i != 2) {
            if (i == 3) {
                PushConfiguration pushConfiguration2 = this.f7500a;
                if (pushConfiguration2 != null) {
                    z = pushConfiguration2.getOpenCOSPush();
                }
            } else if (i != 4) {
                return false;
            }
            PushConfiguration pushConfiguration3 = this.f7500a;
            return pushConfiguration3 != null ? pushConfiguration3.getOpenFTOSPush() : z;
        } else {
            PushConfiguration pushConfiguration4 = this.f7500a;
            if (pushConfiguration4 != null) {
                return pushConfiguration4.getOpenFCMPush();
            }
            return false;
        }
    }

    public void register() {
        C4408b.m12464a("ASSEMBLE_PUSH : assemble push register");
        if (this.f7501a.size() <= 0) {
            m12752a();
        }
        if (this.f7501a.size() > 0) {
            for (AbstractPushManager next : this.f7501a.values()) {
                if (next != null) {
                    next.register();
                }
            }
            C4483i.m12764a(this.f7499a);
        }
    }

    public void unregister() {
        C4408b.m12464a("ASSEMBLE_PUSH : assemble push unregister");
        for (AbstractPushManager next : this.f7501a.values()) {
            if (next != null) {
                next.unregister();
            }
        }
        this.f7501a.clear();
    }
}
