package com.xiaomi.push;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.xiaomi.push.service.C4874al;
import java.util.HashMap;

/* renamed from: com.xiaomi.push.ed */
public final class C4655ed {

    /* renamed from: a */
    private static volatile C4655ed f7974a;

    /* renamed from: a */
    private int f7975a;

    /* renamed from: a */
    private Context f7976a;

    /* renamed from: a */
    private C4659eh f7977a;

    /* renamed from: a */
    private String f7978a;

    /* renamed from: a */
    private HashMap<C4657ef, C4658eg> f7979a;

    /* renamed from: b */
    private String f7980b;

    private C4655ed(Context context) {
        HashMap<C4657ef, C4658eg> hashMap = new HashMap<>();
        this.f7979a = hashMap;
        this.f7976a = context;
        hashMap.put(C4657ef.SERVICE_ACTION, new C4661ej());
        this.f7979a.put(C4657ef.SERVICE_COMPONENT, new C4662ek());
        this.f7979a.put(C4657ef.ACTIVITY, new C4653eb());
        this.f7979a.put(C4657ef.PROVIDER, new C4660ei());
    }

    /* renamed from: a */
    public static C4655ed m13639a(Context context) {
        if (f7974a == null) {
            synchronized (C4655ed.class) {
                if (f7974a == null) {
                    f7974a = new C4655ed(context);
                }
            }
        }
        return f7974a;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m13641a(C4657ef efVar, Context context, C4654ec ecVar) {
        this.f7979a.get(efVar).mo29029a(context, ecVar);
    }

    /* renamed from: a */
    public static boolean m13642a(Context context) {
        return C4874al.m15207a(context, context.getPackageName());
    }

    /* renamed from: a */
    public int mo29039a() {
        return this.f7975a;
    }

    /* renamed from: a */
    public C4659eh m13644a() {
        return this.f7977a;
    }

    /* renamed from: a */
    public String m13645a() {
        return this.f7978a;
    }

    /* renamed from: a */
    public void mo29040a(int i) {
        this.f7975a = i;
    }

    /* renamed from: a */
    public void mo29041a(Context context, String str, int i, String str2, String str3) {
        if (context == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            C4650dz.m13610a(context, "" + str, 1008, "A receive a incorrect message");
            return;
        }
        mo29040a(i);
        C4516al.m12857a(this.f7976a).mo28733a((Runnable) new C4656ee(this, str, context, str2, str3));
    }

    /* renamed from: a */
    public void mo29042a(C4657ef efVar, Context context, Intent intent, String str) {
        if (efVar != null) {
            this.f7979a.get(efVar).mo29028a(context, intent, str);
        } else {
            C4650dz.m13610a(context, "null", 1008, "A receive a incorrect message with empty type");
        }
    }

    /* renamed from: a */
    public void mo29043a(C4659eh ehVar) {
        this.f7977a = ehVar;
    }

    /* renamed from: a */
    public void mo29044a(String str) {
        this.f7978a = str;
    }

    /* renamed from: a */
    public void mo29045a(String str, String str2, int i, C4659eh ehVar) {
        mo29044a(str);
        mo29047b(str2);
        mo29040a(i);
        mo29043a(ehVar);
    }

    /* renamed from: b */
    public String mo29046b() {
        return this.f7980b;
    }

    /* renamed from: b */
    public void mo29047b(String str) {
        this.f7980b = str;
    }
}
