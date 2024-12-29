package com.xiaomi.push;

import com.xiaomi.push.C4599di;
import java.io.File;
import java.util.Date;

/* renamed from: com.xiaomi.push.dj */
class C4603dj extends C4599di.C4601b {

    /* renamed from: a */
    final /* synthetic */ int f8400a;

    /* renamed from: a */
    final /* synthetic */ C4599di f8401a;

    /* renamed from: a */
    File f8402a;

    /* renamed from: a */
    final /* synthetic */ String f8403a;

    /* renamed from: a */
    final /* synthetic */ Date f8404a;

    /* renamed from: a */
    final /* synthetic */ boolean f8405a;

    /* renamed from: b */
    final /* synthetic */ String f8406b;

    /* renamed from: b */
    final /* synthetic */ Date f8407b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C4603dj(C4599di diVar, int i, Date date, Date date2, String str, String str2, boolean z) {
        super();
        this.f8401a = diVar;
        this.f8400a = i;
        this.f8404a = date;
        this.f8407b = date2;
        this.f8403a = str;
        this.f8406b = str2;
        this.f8405a = z;
    }

    /* renamed from: b */
    public void mo24740b() {
        if (C4490aa.m13255d()) {
            try {
                File file = new File(C4599di.m13720a(this.f8401a).getExternalFilesDir((String) null) + "/.logcache");
                file.mkdirs();
                if (file.isDirectory()) {
                    C4598dh dhVar = new C4598dh();
                    dhVar.mo24914a(this.f8400a);
                    this.f8402a = dhVar.mo24913a(C4599di.m13720a(this.f8401a), this.f8404a, this.f8407b, file);
                }
            } catch (NullPointerException unused) {
            }
        }
    }

    /* renamed from: c */
    public void mo24741c() {
        File file = this.f8402a;
        if (file != null && file.exists()) {
            C4599di.m13720a(this.f8401a).add(new C4599di.C4602c(this.f8403a, this.f8406b, this.f8402a, this.f8405a));
        }
        this.f8401a.m13723a(0);
    }
}
