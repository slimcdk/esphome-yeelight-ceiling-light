package com.xiaomi.push;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.xiaomi.push.C4498ai;
import com.xiaomi.push.C4557cb;
import com.xiaomi.push.service.C4854ak;
import com.xiaomi.push.service.C4890bi;

/* renamed from: com.xiaomi.push.bp */
public class C4543bp {

    /* renamed from: a */
    private static volatile C4543bp f8240a;

    /* renamed from: a */
    private Context f8241a;

    /* renamed from: a */
    private C4498ai.C4499a f8242a = new C4544bq(this);

    /* renamed from: a */
    private C4565ce f8243a;

    /* renamed from: a */
    private C4566cf f8244a;

    /* renamed from: a */
    private final String f8245a = "push_stat_sp";

    /* renamed from: b */
    private C4498ai.C4499a f8246b = new C4545br(this);

    /* renamed from: b */
    private final String f8247b = "upload_time";

    /* renamed from: c */
    private C4498ai.C4499a f8248c = new C4546bs(this);

    /* renamed from: c */
    private final String f8249c = "delete_time";

    /* renamed from: d */
    private final String f8250d = "check_time";

    /* renamed from: e */
    private String f8251e;

    /* renamed from: f */
    private String f8252f;

    private C4543bp(Context context) {
        this.f8241a = context;
    }

    /* renamed from: a */
    public static C4543bp m13474a(Context context) {
        if (f8240a == null) {
            synchronized (C4543bp.class) {
                if (f8240a == null) {
                    f8240a = new C4543bp(context);
                }
            }
        }
        return f8240a;
    }

    /* renamed from: a */
    private boolean mo24783a() {
        return C4854ak.m15568a(this.f8241a).mo25911a(C4744hr.StatDataSwitch.mo25291a(), true);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m13479b(String str) {
        SharedPreferences.Editor edit = this.f8241a.getSharedPreferences("push_stat_sp", 0).edit();
        edit.putLong(str, System.currentTimeMillis());
        C4815r.m15379a(edit);
    }

    /* renamed from: c */
    private String m13480c() {
        return this.f8241a.getDatabasePath(C4547bt.f8258a).getAbsolutePath();
    }

    /* renamed from: a */
    public String m13481a() {
        return this.f8251e;
    }

    /* renamed from: a */
    public void mo24784a(C4557cb.C4558a aVar) {
        C4557cb.m13552a(this.f8241a).mo24825a(aVar);
    }

    /* renamed from: a */
    public void mo24785a(C4743hq hqVar) {
        if (mo24783a() && C4890bi.m15706a(hqVar.mo25279e())) {
            mo24784a((C4557cb.C4558a) C4552by.m13499a(this.f8241a, m13480c(), hqVar));
        }
    }

    /* renamed from: a */
    public void mo24786a(String str) {
        if (mo24783a() && !TextUtils.isEmpty(str)) {
            mo24785a(C4567cg.m13583a(this.f8241a, str));
        }
    }

    /* renamed from: a */
    public void mo24787a(String str, String str2, Boolean bool) {
        if (this.f8243a == null) {
            return;
        }
        if (bool.booleanValue()) {
            this.f8243a.mo24837a(this.f8241a, str2, str);
        } else {
            this.f8243a.mo24838b(this.f8241a, str2, str);
        }
    }

    /* renamed from: b */
    public String mo24788b() {
        return this.f8252f;
    }
}
