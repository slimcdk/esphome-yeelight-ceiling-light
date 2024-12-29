package com.xiaomi.push;

import com.xiaomi.push.C4614df;
import java.io.File;
import java.util.Date;

/* renamed from: com.xiaomi.push.dg */
class C4618dg extends C4614df.C4616b {

    /* renamed from: a */
    final /* synthetic */ int f7800a;

    /* renamed from: a */
    final /* synthetic */ C4614df f7801a;

    /* renamed from: a */
    File f7802a;

    /* renamed from: a */
    final /* synthetic */ String f7803a;

    /* renamed from: a */
    final /* synthetic */ Date f7804a;

    /* renamed from: a */
    final /* synthetic */ boolean f7805a;

    /* renamed from: b */
    final /* synthetic */ String f7806b;

    /* renamed from: b */
    final /* synthetic */ Date f7807b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C4618dg(C4614df dfVar, int i, Date date, Date date2, String str, String str2, boolean z) {
        super();
        this.f7801a = dfVar;
        this.f7800a = i;
        this.f7804a = date;
        this.f7807b = date2;
        this.f7803a = str;
        this.f7806b = str2;
        this.f7805a = z;
    }

    /* renamed from: b */
    public void mo28749b() {
        if (C4508ad.m12842d()) {
            try {
                File file = new File(C4614df.m13296a(this.f7801a).getExternalFilesDir((String) null) + "/.logcache");
                file.mkdirs();
                if (file.isDirectory()) {
                    C4613de deVar = new C4613de();
                    deVar.mo28904a(this.f7800a);
                    this.f7802a = deVar.mo28903a(C4614df.m13296a(this.f7801a), this.f7804a, this.f7807b, file);
                }
            } catch (NullPointerException unused) {
            }
        }
    }

    /* renamed from: c */
    public void mo28750c() {
        File file = this.f7802a;
        if (file != null && file.exists()) {
            C4614df.m13296a(this.f7801a).add(new C4614df.C4617c(this.f7803a, this.f7806b, this.f7802a, this.f7805a));
        }
        this.f7801a.m13299a(0);
    }
}
