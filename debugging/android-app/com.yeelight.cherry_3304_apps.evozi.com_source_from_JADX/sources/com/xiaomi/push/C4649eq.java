package com.xiaomi.push;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.xiaomi.push.service.C4837aa;
import java.util.HashMap;

/* renamed from: com.xiaomi.push.eq */
public final class C4649eq {

    /* renamed from: a */
    private static volatile C4649eq f8586a;

    /* renamed from: a */
    private int f8587a;

    /* renamed from: a */
    private Context f8588a;

    /* renamed from: a */
    private C4653eu f8589a;

    /* renamed from: a */
    private String f8590a;

    /* renamed from: a */
    private HashMap<C4651es, C4652et> f8591a;

    /* renamed from: b */
    private String f8592b;

    private C4649eq(Context context) {
        HashMap<C4651es, C4652et> hashMap = new HashMap<>();
        this.f8591a = hashMap;
        this.f8588a = context;
        hashMap.put(C4651es.SERVICE_ACTION, new C4655ew());
        this.f8591a.put(C4651es.SERVICE_COMPONENT, new C4656ex());
        this.f8591a.put(C4651es.ACTIVITY, new C4647eo());
        this.f8591a.put(C4651es.PROVIDER, new C4654ev());
    }

    /* renamed from: a */
    public static C4649eq m14098a(Context context) {
        if (f8586a == null) {
            synchronized (C4649eq.class) {
                if (f8586a == null) {
                    f8586a = new C4649eq(context);
                }
            }
        }
        return f8586a;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m14100a(C4651es esVar, Context context, C4648ep epVar) {
        this.f8591a.get(esVar).mo25038a(context, epVar);
    }

    /* renamed from: a */
    public static boolean m14101a(Context context) {
        return C4837aa.m15488a(context, context.getPackageName());
    }

    /* renamed from: a */
    public int mo25048a() {
        return this.f8587a;
    }

    /* renamed from: a */
    public C4653eu m14103a() {
        return this.f8589a;
    }

    /* renamed from: a */
    public String m14104a() {
        return this.f8590a;
    }

    /* renamed from: a */
    public void mo25049a(int i) {
        this.f8587a = i;
    }

    /* renamed from: a */
    public void mo25050a(Context context, String str, int i, String str2, String str3) {
        if (context == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            C4645em.m14078a(context, "" + str, 1008, "A receive a incorrect message");
            return;
        }
        mo25049a(i);
        C4498ai.m13271a(this.f8588a).mo24725a((Runnable) new C4650er(this, str, context, str2, str3));
    }

    /* renamed from: a */
    public void mo25051a(C4651es esVar, Context context, Intent intent, String str) {
        if (esVar != null) {
            this.f8591a.get(esVar).mo25037a(context, intent, str);
        } else {
            C4645em.m14078a(context, "null", 1008, "A receive a incorrect message with empty type");
        }
    }

    /* renamed from: a */
    public void mo25052a(C4653eu euVar) {
        this.f8589a = euVar;
    }

    /* renamed from: a */
    public void mo25053a(String str) {
        this.f8590a = str;
    }

    /* renamed from: a */
    public void mo25054a(String str, String str2, int i, C4653eu euVar) {
        mo25053a(str);
        mo25056b(str2);
        mo25049a(i);
        mo25052a(euVar);
    }

    /* renamed from: b */
    public String mo25055b() {
        return this.f8592b;
    }

    /* renamed from: b */
    public void mo25056b(String str) {
        this.f8592b = str;
    }
}
