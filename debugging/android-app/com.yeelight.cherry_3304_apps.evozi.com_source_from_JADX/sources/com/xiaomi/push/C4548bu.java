package com.xiaomi.push;

import android.content.Context;
import com.xiaomi.channel.commonutils.logger.C3989b;
import com.xiaomi.push.C4557cb;
import java.lang.ref.WeakReference;

/* renamed from: com.xiaomi.push.bu */
public class C4548bu implements Runnable {

    /* renamed from: a */
    private String f8259a;

    /* renamed from: a */
    private WeakReference<Context> f8260a;

    public C4548bu(String str, WeakReference<Context> weakReference) {
        this.f8259a = str;
        this.f8260a = weakReference;
    }

    public void run() {
        Context context;
        WeakReference<Context> weakReference = this.f8260a;
        if (weakReference != null && (context = (Context) weakReference.get()) != null) {
            if (C4568ch.m13584a(this.f8259a) > C4547bt.f8257a) {
                C4551bx a = C4551bx.m13498a(this.f8259a);
                C4550bw a2 = C4550bw.m13493a(this.f8259a);
                a.mo24832a((C4557cb.C4558a) a2);
                a2.mo24832a((C4557cb.C4558a) C4549bv.m13490a(context, this.f8259a, 1000));
                C4557cb.m13552a(context).mo24825a((C4557cb.C4558a) a);
                return;
            }
            C3989b.m10679b("=====> do not need clean db");
        }
    }
}
