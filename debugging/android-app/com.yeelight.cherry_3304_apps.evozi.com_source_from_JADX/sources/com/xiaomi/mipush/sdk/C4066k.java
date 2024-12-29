package com.xiaomi.mipush.sdk;

import com.xiaomi.push.C4744hr;
import java.util.HashMap;

/* renamed from: com.xiaomi.mipush.sdk.k */
public class C4066k {

    /* renamed from: a */
    private static HashMap<C4059d, C4067a> f6943a = new HashMap<>();

    /* renamed from: com.xiaomi.mipush.sdk.k$a */
    static class C4067a {

        /* renamed from: a */
        public String f6944a;

        /* renamed from: b */
        public String f6945b;

        public C4067a(String str, String str2) {
            this.f6944a = str;
            this.f6945b = str2;
        }
    }

    static {
        m10964a(C4059d.ASSEMBLE_PUSH_HUAWEI, new C4067a("com.xiaomi.assemble.control.HmsPushManager", "newInstance"));
        m10964a(C4059d.ASSEMBLE_PUSH_FCM, new C4067a("com.xiaomi.assemble.control.FCMPushManager", "newInstance"));
        m10964a(C4059d.ASSEMBLE_PUSH_COS, new C4067a("com.xiaomi.assemble.control.COSPushManager", "newInstance"));
        m10964a(C4059d.ASSEMBLE_PUSH_FTOS, new C4067a("com.xiaomi.assemble.control.FTOSPushManager", "newInstance"));
    }

    /* renamed from: a */
    public static C4053av m10961a(C4059d dVar) {
        int i = C4068l.f6946a[dVar.ordinal()];
        if (i == 1) {
            return C4053av.UPLOAD_HUAWEI_TOKEN;
        }
        if (i == 2) {
            return C4053av.UPLOAD_FCM_TOKEN;
        }
        if (i == 3) {
            return C4053av.UPLOAD_COS_TOKEN;
        }
        if (i != 4) {
            return null;
        }
        return C4053av.UPLOAD_FTOS_TOKEN;
    }

    /* renamed from: a */
    public static C4067a m10962a(C4059d dVar) {
        return f6943a.get(dVar);
    }

    /* renamed from: a */
    public static C4744hr m10963a(C4059d dVar) {
        return C4744hr.AggregatePushSwitch;
    }

    /* renamed from: a */
    private static void m10964a(C4059d dVar, C4067a aVar) {
        if (aVar != null) {
            f6943a.put(dVar, aVar);
        }
    }
}
