package com.xiaomi.push;

import android.content.Context;
import com.xiaomi.channel.commonutils.logger.C4408b;
import com.xiaomi.clientreport.manager.C4412a;
import com.xiaomi.push.C4516al;

/* renamed from: com.xiaomi.push.bq */
public class C4562bq extends C4516al.C4517a {

    /* renamed from: a */
    private Context f7665a;

    public C4562bq(Context context) {
        this.f7665a = context;
    }

    /* renamed from: a */
    private boolean mo28479a() {
        return C4412a.m12487a(this.f7665a).mo28468a().isEventUploadSwitchOpen();
    }

    /* renamed from: a */
    public String m13056a() {
        return "100886";
    }

    public void run() {
        try {
            if (mo28479a()) {
                C4408b.m12482c(this.f7665a.getPackageName() + " begin upload event");
                C4412a.m12487a(this.f7665a).mo28475b();
            }
        } catch (Exception e) {
            C4408b.m12478a((Throwable) e);
        }
    }
}
