package com.xiaomi.push;

import android.content.Context;
import com.xiaomi.channel.commonutils.logger.C4408b;
import com.xiaomi.clientreport.processor.C4423c;
import com.xiaomi.clientreport.processor.IEventProcessor;
import com.xiaomi.clientreport.processor.IPerfProcessor;

/* renamed from: com.xiaomi.push.bs */
public class C4564bs implements Runnable {

    /* renamed from: a */
    private Context f7667a;

    /* renamed from: a */
    private C4423c f7668a;

    /* renamed from: a */
    public void mo28784a(Context context) {
        this.f7667a = context;
    }

    /* renamed from: a */
    public void mo28785a(C4423c cVar) {
        this.f7668a = cVar;
    }

    public void run() {
        C4568bw a;
        String str;
        long currentTimeMillis;
        try {
            C4423c cVar = this.f7668a;
            if (cVar != null) {
                cVar.mo28490a();
            }
            C4408b.m12482c("begin read and send perf / event");
            C4423c cVar2 = this.f7668a;
            if (cVar2 instanceof IEventProcessor) {
                a = C4568bw.m13070a(this.f7667a);
                str = "event_last_upload_time";
                currentTimeMillis = System.currentTimeMillis();
            } else if (cVar2 instanceof IPerfProcessor) {
                a = C4568bw.m13070a(this.f7667a);
                str = "perf_last_upload_time";
                currentTimeMillis = System.currentTimeMillis();
            } else {
                return;
            }
            a.mo28789a("sp_client_report_status", str, currentTimeMillis);
        } catch (Exception e) {
            C4408b.m12478a((Throwable) e);
        }
    }
}
