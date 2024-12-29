package com.xiaomi.mipush.sdk;

import com.xiaomi.push.C4765ho;
import java.util.HashMap;

/* renamed from: com.xiaomi.mipush.sdk.l */
public class C4486l {

    /* renamed from: a */
    private static HashMap<C4479e, C4487a> f7510a = new HashMap<>();

    /* renamed from: com.xiaomi.mipush.sdk.l$a */
    static class C4487a {

        /* renamed from: a */
        public String f7511a;

        /* renamed from: b */
        public String f7512b;

        public C4487a(String str, String str2) {
            this.f7511a = str;
            this.f7512b = str2;
        }
    }

    static {
        m12790a(C4479e.ASSEMBLE_PUSH_HUAWEI, new C4487a("com.xiaomi.assemble.control.HmsPushManager", "newInstance"));
        m12790a(C4479e.ASSEMBLE_PUSH_FCM, new C4487a("com.xiaomi.assemble.control.FCMPushManager", "newInstance"));
        m12790a(C4479e.ASSEMBLE_PUSH_COS, new C4487a("com.xiaomi.assemble.control.COSPushManager", "newInstance"));
        m12790a(C4479e.ASSEMBLE_PUSH_FTOS, new C4487a("com.xiaomi.assemble.control.FTOSPushManager", "newInstance"));
    }

    /* renamed from: a */
    public static C4472au m12787a(C4479e eVar) {
        int i = C4488m.f7513a[eVar.ordinal()];
        if (i == 1) {
            return C4472au.UPLOAD_HUAWEI_TOKEN;
        }
        if (i == 2) {
            return C4472au.UPLOAD_FCM_TOKEN;
        }
        if (i == 3) {
            return C4472au.UPLOAD_COS_TOKEN;
        }
        if (i != 4) {
            return null;
        }
        return C4472au.UPLOAD_FTOS_TOKEN;
    }

    /* renamed from: a */
    public static C4487a m12788a(C4479e eVar) {
        return f7510a.get(eVar);
    }

    /* renamed from: a */
    public static C4765ho m12789a(C4479e eVar) {
        return C4765ho.AggregatePushSwitch;
    }

    /* renamed from: a */
    private static void m12790a(C4479e eVar, C4487a aVar) {
        if (aVar != null) {
            f7510a.put(eVar, aVar);
        }
    }
}
