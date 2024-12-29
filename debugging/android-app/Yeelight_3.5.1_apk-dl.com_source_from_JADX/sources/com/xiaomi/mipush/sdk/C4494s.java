package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.channel.commonutils.logger.C4408b;
import com.xiaomi.push.C4760hj;
import com.xiaomi.push.C4770ht;
import com.xiaomi.push.C4773hw;
import com.xiaomi.push.C4783if;
import com.xiaomi.push.C4786ii;
import com.xiaomi.push.C4830m;
import java.util.HashMap;

/* renamed from: com.xiaomi.mipush.sdk.s */
public class C4494s {

    /* renamed from: a */
    private static volatile C4494s f7519a;

    /* renamed from: a */
    private final Context f7520a;

    private C4494s(Context context) {
        this.f7520a = context.getApplicationContext();
    }

    /* renamed from: a */
    private static C4494s m12804a(Context context) {
        if (f7519a == null) {
            synchronized (C4494s.class) {
                if (f7519a == null) {
                    f7519a = new C4494s(context);
                }
            }
        }
        return f7519a;
    }

    /* renamed from: a */
    public static void m12805a(Context context, C4783if ifVar) {
        m12804a(context).m12807a(ifVar, 0, true);
    }

    /* renamed from: a */
    public static void m12806a(Context context, C4783if ifVar, boolean z) {
        m12804a(context).m12807a(ifVar, 1, z);
    }

    /* renamed from: a */
    private void m12807a(C4783if ifVar, int i, boolean z) {
        if (!C4830m.m14998a(this.f7520a) && C4830m.m14997a() && ifVar != null && ifVar.f8947a == C4760hj.SendMessage && ifVar.mo29558a() != null && z) {
            C4408b.m12464a("click to start activity result:" + String.valueOf(i));
            C4786ii iiVar = new C4786ii(ifVar.mo29558a().mo29392a(), false);
            iiVar.mo29602c(C4770ht.SDK_START_ACTIVITY.f8718a);
            iiVar.mo29599b(ifVar.mo29558a());
            iiVar.mo29606d(ifVar.f8954b);
            HashMap hashMap = new HashMap();
            iiVar.f8983a = hashMap;
            hashMap.put("result", String.valueOf(i));
            C4465ao.m12646a(this.f7520a).mo28668a(iiVar, C4760hj.Notification, false, false, (C4773hw) null, true, ifVar.f8954b, ifVar.f8950a, true, false);
        }
    }

    /* renamed from: b */
    public static void m12808b(Context context, C4783if ifVar, boolean z) {
        m12804a(context).m12807a(ifVar, 2, z);
    }

    /* renamed from: c */
    public static void m12809c(Context context, C4783if ifVar, boolean z) {
        m12804a(context).m12807a(ifVar, 3, z);
    }

    /* renamed from: d */
    public static void m12810d(Context context, C4783if ifVar, boolean z) {
        m12804a(context).m12807a(ifVar, 4, z);
    }

    /* renamed from: e */
    public static void m12811e(Context context, C4783if ifVar, boolean z) {
        C4494s sVar;
        int i;
        C4475b a = C4475b.m12705a(context);
        if (TextUtils.isEmpty(a.mo28694c()) || TextUtils.isEmpty(a.mo28695d())) {
            sVar = m12804a(context);
            i = 6;
        } else {
            boolean f = a.mo28697f();
            sVar = m12804a(context);
            i = f ? 7 : 5;
        }
        sVar.m12807a(ifVar, i, z);
    }
}
