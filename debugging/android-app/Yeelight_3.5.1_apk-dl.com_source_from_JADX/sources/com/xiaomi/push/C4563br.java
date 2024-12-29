package com.xiaomi.push;

import android.content.Context;
import com.xiaomi.channel.commonutils.logger.C4408b;
import com.xiaomi.clientreport.manager.C4412a;
import com.xiaomi.push.C4516al;

/* renamed from: com.xiaomi.push.br */
public class C4563br extends C4516al.C4517a {

    /* renamed from: a */
    private Context f7666a;

    public C4563br(Context context) {
        this.f7666a = context;
    }

    /* renamed from: a */
    private boolean mo28479a() {
        return C4412a.m12487a(this.f7666a).mo28468a().isPerfUploadSwitchOpen();
    }

    /* renamed from: a */
    public String m13058a() {
        return "100887";
    }

    public void run() {
        try {
            if (mo28479a()) {
                C4412a.m12487a(this.f7666a).mo28476c();
                C4408b.m12482c(this.f7666a.getPackageName() + " perf begin upload");
            }
        } catch (Exception e) {
            C4408b.m12483d("fail to send perf data. " + e);
        }
    }
}
