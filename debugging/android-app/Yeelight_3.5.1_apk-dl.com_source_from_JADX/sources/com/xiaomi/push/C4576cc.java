package com.xiaomi.push;

import android.content.Context;
import com.xiaomi.channel.commonutils.logger.C4408b;
import com.xiaomi.push.C4583cj;
import java.lang.ref.WeakReference;

/* renamed from: com.xiaomi.push.cc */
public class C4576cc implements Runnable {

    /* renamed from: a */
    private String f7694a;

    /* renamed from: a */
    private WeakReference<Context> f7695a;

    public C4576cc(String str, WeakReference<Context> weakReference) {
        this.f7694a = str;
        this.f7695a = weakReference;
    }

    public void run() {
        Context context;
        WeakReference<Context> weakReference = this.f7695a;
        if (weakReference != null && (context = (Context) weakReference.get()) != null) {
            if (C4594cp.m13186a(this.f7694a) > C4575cb.f7692a) {
                C4579cf a = C4579cf.m13149a(this.f7694a);
                C4578ce a2 = C4578ce.m13144a(this.f7694a);
                a.mo28840a((C4583cj.C4584a) a2);
                a2.mo28840a((C4583cj.C4584a) C4577cd.m13141a(context, this.f7694a, 1000));
                C4583cj.m13154a(context).mo28833a((C4583cj.C4584a) a);
                return;
            }
            C4408b.m12481b("=====> do not need clean db");
        }
    }
}
