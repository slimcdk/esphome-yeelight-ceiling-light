package com.xiaomi.mipush.sdk;

import android.content.Context;
import com.xiaomi.channel.commonutils.logger.C3989b;
import com.xiaomi.push.C4744hr;
import com.xiaomi.push.service.C4854ak;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.xiaomi.mipush.sdk.e */
public class C4060e implements AbstractPushManager {

    /* renamed from: a */
    private static volatile C4060e f6931a;

    /* renamed from: a */
    private Context f6932a;

    /* renamed from: a */
    private PushConfiguration f6933a;

    /* renamed from: a */
    private Map<C4059d, AbstractPushManager> f6934a = new HashMap();
    /* access modifiers changed from: private */

    /* renamed from: a */
    public boolean f6935a = false;

    private C4060e(Context context) {
        this.f6932a = context.getApplicationContext();
    }

    /* renamed from: a */
    public static C4060e m10932a(Context context) {
        if (f6931a == null) {
            synchronized (C4060e.class) {
                if (f6931a == null) {
                    f6931a = new C4060e(context);
                }
            }
        }
        return f6931a;
    }

    /* JADX WARNING: type inference failed for: r2v5, types: [boolean] */
    /* JADX WARNING: type inference failed for: r2v19, types: [boolean] */
    /* JADX WARNING: type inference failed for: r2v35, types: [boolean] */
    /* renamed from: a */
    private void m10933a() {
        AbstractPushManager a;
        AbstractPushManager a2;
        AbstractPushManager a3;
        AbstractPushManager a4;
        PushConfiguration pushConfiguration = this.f6933a;
        if (pushConfiguration != null) {
            if (pushConfiguration.getOpenHmsPush()) {
                StringBuilder sb = new StringBuilder();
                sb.append("ASSEMBLE_PUSH : ");
                sb.append(" HW user switch : " + this.f6933a.getOpenHmsPush() + " HW online switch : " + C4063h.m10946a(this.f6932a, C4059d.ASSEMBLE_PUSH_HUAWEI) + " HW isSupport : " + C4038ah.HUAWEI.equals(C4069m.m10965a(this.f6932a)));
                C3989b.m10669a(sb.toString());
            }
            if (this.f6933a.getOpenHmsPush() && C4063h.m10946a(this.f6932a, C4059d.ASSEMBLE_PUSH_HUAWEI) != null && C4038ah.HUAWEI.equals(C4069m.m10965a(this.f6932a))) {
                if (!mo22955a(C4059d.ASSEMBLE_PUSH_HUAWEI)) {
                    C4059d dVar = C4059d.ASSEMBLE_PUSH_HUAWEI;
                    mo22957a(dVar, C4042al.m10808a(this.f6932a, dVar));
                }
                C3989b.m10680c("hw manager add to list");
            } else if (mo22955a(C4059d.ASSEMBLE_PUSH_HUAWEI) && (a4 = mo22955a(C4059d.ASSEMBLE_PUSH_HUAWEI)) != null) {
                mo22955a(C4059d.ASSEMBLE_PUSH_HUAWEI);
                a4.unregister();
            }
            if (this.f6933a.getOpenFCMPush()) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("ASSEMBLE_PUSH : ");
                sb2.append(" FCM user switch : " + this.f6933a.getOpenFCMPush() + " FCM online switch : " + C4063h.m10946a(this.f6932a, C4059d.ASSEMBLE_PUSH_FCM) + " FCM isSupport : " + C4069m.m10965a(this.f6932a));
                C3989b.m10669a(sb2.toString());
            }
            if (this.f6933a.getOpenFCMPush() && C4063h.m10946a(this.f6932a, C4059d.ASSEMBLE_PUSH_FCM) != null && C4069m.m10965a(this.f6932a)) {
                if (!mo22955a(C4059d.ASSEMBLE_PUSH_FCM)) {
                    C4059d dVar2 = C4059d.ASSEMBLE_PUSH_FCM;
                    mo22957a(dVar2, C4042al.m10808a(this.f6932a, dVar2));
                }
                C3989b.m10680c("fcm manager add to list");
            } else if (mo22955a(C4059d.ASSEMBLE_PUSH_FCM) && (a3 = mo22955a(C4059d.ASSEMBLE_PUSH_FCM)) != null) {
                mo22955a(C4059d.ASSEMBLE_PUSH_FCM);
                a3.unregister();
            }
            if (this.f6933a.getOpenCOSPush()) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("ASSEMBLE_PUSH : ");
                sb3.append(" COS user switch : " + this.f6933a.getOpenCOSPush() + " COS online switch : " + C4063h.m10946a(this.f6932a, C4059d.ASSEMBLE_PUSH_COS) + " COS isSupport : " + C4069m.m10968b(this.f6932a));
                C3989b.m10669a(sb3.toString());
            }
            if (this.f6933a.getOpenCOSPush() && C4063h.m10946a(this.f6932a, C4059d.ASSEMBLE_PUSH_COS) != null && C4069m.m10968b(this.f6932a)) {
                C4059d dVar3 = C4059d.ASSEMBLE_PUSH_COS;
                mo22957a(dVar3, C4042al.m10808a(this.f6932a, dVar3));
            } else if (mo22955a(C4059d.ASSEMBLE_PUSH_COS) && (a2 = mo22955a(C4059d.ASSEMBLE_PUSH_COS)) != null) {
                mo22955a(C4059d.ASSEMBLE_PUSH_COS);
                a2.unregister();
            }
            if (this.f6933a.getOpenFTOSPush() && C4063h.m10946a(this.f6932a, C4059d.ASSEMBLE_PUSH_FTOS) != null && C4069m.m10969c(this.f6932a)) {
                C4059d dVar4 = C4059d.ASSEMBLE_PUSH_FTOS;
                mo22957a(dVar4, C4042al.m10808a(this.f6932a, dVar4));
            } else if (mo22955a(C4059d.ASSEMBLE_PUSH_FTOS) && (a = mo22955a(C4059d.ASSEMBLE_PUSH_FTOS)) != null) {
                mo22955a(C4059d.ASSEMBLE_PUSH_FTOS);
                a.unregister();
            }
        }
    }

    /* renamed from: a */
    public AbstractPushManager mo22955a(C4059d dVar) {
        return this.f6934a.get(dVar);
    }

    /* renamed from: a */
    public void mo22956a(PushConfiguration pushConfiguration) {
        this.f6933a = pushConfiguration;
        this.f6935a = C4854ak.m15568a(this.f6932a).mo25911a(C4744hr.AggregatePushSwitch.mo25291a(), true);
        if (this.f6933a.getOpenHmsPush() || this.f6933a.getOpenFCMPush() || this.f6933a.getOpenCOSPush()) {
            C4854ak.m15568a(this.f6932a).mo25909a((C4854ak.C4855a) new C4061f(this, 101, "assemblePush"));
        }
    }

    /* renamed from: a */
    public void m10938a(C4059d dVar) {
        this.f6934a.remove(dVar);
    }

    /* renamed from: a */
    public void mo22957a(C4059d dVar, AbstractPushManager abstractPushManager) {
        if (abstractPushManager != null) {
            if (this.f6934a.containsKey(dVar)) {
                this.f6934a.remove(dVar);
            }
            this.f6934a.put(dVar, abstractPushManager);
        }
    }

    /* renamed from: a */
    public boolean m10940a(C4059d dVar) {
        return this.f6934a.containsKey(dVar);
    }

    /* renamed from: b */
    public boolean mo22958b(C4059d dVar) {
        int i = C4062g.f6937a[dVar.ordinal()];
        boolean z = false;
        if (i == 1) {
            PushConfiguration pushConfiguration = this.f6933a;
            if (pushConfiguration != null) {
                return pushConfiguration.getOpenHmsPush();
            }
            return false;
        } else if (i != 2) {
            if (i == 3) {
                PushConfiguration pushConfiguration2 = this.f6933a;
                if (pushConfiguration2 != null) {
                    z = pushConfiguration2.getOpenCOSPush();
                }
            } else if (i != 4) {
                return false;
            }
            PushConfiguration pushConfiguration3 = this.f6933a;
            return pushConfiguration3 != null ? pushConfiguration3.getOpenFTOSPush() : z;
        } else {
            PushConfiguration pushConfiguration4 = this.f6933a;
            if (pushConfiguration4 != null) {
                return pushConfiguration4.getOpenFCMPush();
            }
            return false;
        }
    }

    public void register() {
        C3989b.m10669a("ASSEMBLE_PUSH : assemble push register");
        if (this.f6934a.size() <= 0) {
            m10933a();
        }
        if (this.f6934a.size() > 0) {
            for (AbstractPushManager next : this.f6934a.values()) {
                if (next != null) {
                    next.register();
                }
            }
            C4063h.m10943a(this.f6932a);
        }
    }

    public void unregister() {
        C3989b.m10669a("ASSEMBLE_PUSH : assemble push unregister");
        for (AbstractPushManager next : this.f6934a.values()) {
            if (next != null) {
                next.unregister();
            }
        }
        this.f6934a.clear();
    }
}
