package com.xiaomi.push;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.xiaomi.push.C4516al;
import com.xiaomi.push.C4583cj;
import com.xiaomi.push.service.C4898ba;
import com.xiaomi.push.service.C4935bz;

/* renamed from: com.xiaomi.push.bx */
public class C4569bx {

    /* renamed from: a */
    private static volatile C4569bx f7671a;

    /* renamed from: a */
    private Context f7672a;

    /* renamed from: a */
    private C4516al.C4517a f7673a = new C4570by(this);

    /* renamed from: a */
    private C4591cm f7674a;

    /* renamed from: a */
    private C4592cn f7675a;

    /* renamed from: a */
    private final String f7676a = "push_stat_sp";

    /* renamed from: b */
    private C4516al.C4517a f7677b = new C4571bz(this);

    /* renamed from: b */
    private final String f7678b = "upload_time";

    /* renamed from: c */
    private C4516al.C4517a f7679c = new C4574ca(this);

    /* renamed from: c */
    private final String f7680c = "delete_time";

    /* renamed from: d */
    private final String f7681d = "check_time";

    /* renamed from: e */
    private String f7682e;

    /* renamed from: f */
    private String f7683f;

    private C4569bx(Context context) {
        this.f7672a = context;
    }

    /* renamed from: a */
    public static C4569bx m13076a(Context context) {
        if (f7671a == null) {
            synchronized (C4569bx.class) {
                if (f7671a == null) {
                    f7671a = new C4569bx(context);
                }
            }
        }
        return f7671a;
    }

    /* renamed from: a */
    private boolean mo28791a() {
        return C4898ba.m15362a(this.f7672a).mo29996a(C4765ho.StatDataSwitch.mo29322a(), true);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m13081b(String str) {
        SharedPreferences.Editor edit = this.f7672a.getSharedPreferences("push_stat_sp", 0).edit();
        edit.putLong(str, System.currentTimeMillis());
        C4992t.m15731a(edit);
    }

    /* renamed from: c */
    private String m13082c() {
        return this.f7672a.getDatabasePath(C4575cb.f7693a).getAbsolutePath();
    }

    /* renamed from: a */
    public String m13083a() {
        return this.f7682e;
    }

    /* renamed from: a */
    public void mo28792a(C4583cj.C4584a aVar) {
        C4583cj.m13154a(this.f7672a).mo28833a(aVar);
    }

    /* renamed from: a */
    public void mo28793a(C4764hn hnVar) {
        if (mo28791a() && C4935bz.m15499a(hnVar.mo29310e())) {
            mo28792a((C4583cj.C4584a) C4580cg.m13150a(this.f7672a, m13082c(), hnVar));
        }
    }

    /* renamed from: a */
    public void mo28794a(String str) {
        if (mo28791a() && !TextUtils.isEmpty(str)) {
            mo28793a(C4593co.m13185a(this.f7672a, str));
        }
    }

    /* renamed from: a */
    public void mo28795a(String str, String str2, Boolean bool) {
        if (this.f7674a == null) {
            return;
        }
        if (bool.booleanValue()) {
            this.f7674a.mo28845a(this.f7672a, str2, str);
        } else {
            this.f7674a.mo28846b(this.f7672a, str2, str);
        }
    }

    /* renamed from: b */
    public String mo28796b() {
        return this.f7683f;
    }
}
