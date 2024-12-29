package com.xiaomi.push;

import android.content.Context;
import com.xiaomi.channel.commonutils.logger.C3989b;
import com.xiaomi.clientreport.processor.C4003c;
import com.xiaomi.clientreport.processor.IEventProcessor;
import com.xiaomi.clientreport.processor.IPerfProcessor;

/* renamed from: com.xiaomi.push.bi */
public class C4535bi implements Runnable {

    /* renamed from: a */
    private Context f8226a;

    /* renamed from: a */
    private C4003c f8227a;

    /* renamed from: a */
    public void mo24770a(Context context) {
        this.f8226a = context;
    }

    /* renamed from: a */
    public void mo24771a(C4003c cVar) {
        this.f8227a = cVar;
    }

    public void run() {
        C4539bm a;
        String str;
        long currentTimeMillis;
        try {
            if (this.f8227a != null) {
                this.f8227a.mo22745a();
            }
            C3989b.m10680c("begin read and send perf / event");
            if (this.f8227a instanceof IEventProcessor) {
                a = C4539bm.m13458a(this.f8226a);
                str = "event_last_upload_time";
                currentTimeMillis = System.currentTimeMillis();
            } else if (this.f8227a instanceof IPerfProcessor) {
                a = C4539bm.m13458a(this.f8226a);
                str = "perf_last_upload_time";
                currentTimeMillis = System.currentTimeMillis();
            } else {
                return;
            }
            a.mo24775a("sp_client_report_status", str, currentTimeMillis);
        } catch (Exception e) {
            C3989b.m10678a((Throwable) e);
        }
    }
}
