package com.xiaomi.clientreport.manager;

import android.content.Context;
import com.xiaomi.channel.commonutils.logger.C3989b;
import com.xiaomi.clientreport.data.C3990a;
import com.xiaomi.clientreport.data.Config;
import com.xiaomi.clientreport.data.EventClientReport;
import com.xiaomi.clientreport.data.PerfClientReport;
import com.xiaomi.clientreport.processor.C4003c;
import com.xiaomi.clientreport.processor.IEventProcessor;
import com.xiaomi.clientreport.processor.IPerfProcessor;
import com.xiaomi.push.C4498ai;
import com.xiaomi.push.C4532bf;
import com.xiaomi.push.C4533bg;
import com.xiaomi.push.C4534bh;
import com.xiaomi.push.C4535bi;
import com.xiaomi.push.C4536bj;
import com.xiaomi.push.C4539bm;
import com.xiaomi.push.C4808l;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: com.xiaomi.clientreport.manager.a */
public class C3992a {

    /* renamed from: a */
    private static final int f6798a = (C4808l.m15356a() ? 30 : 10);

    /* renamed from: a */
    private static volatile C3992a f6799a;

    /* renamed from: a */
    private Context f6800a;

    /* renamed from: a */
    private Config f6801a;

    /* renamed from: a */
    private IEventProcessor f6802a;

    /* renamed from: a */
    private IPerfProcessor f6803a;

    /* renamed from: a */
    private String f6804a;

    /* renamed from: a */
    private HashMap<String, HashMap<String, C3990a>> f6805a = new HashMap<>();

    /* renamed from: a */
    private ExecutorService f6806a = Executors.newSingleThreadExecutor();

    /* renamed from: b */
    private HashMap<String, ArrayList<C3990a>> f6807b = new HashMap<>();

    private C3992a(Context context) {
        this.f6800a = context;
    }

    /* renamed from: a */
    private int mo22723a() {
        HashMap<String, ArrayList<C3990a>> hashMap = this.f6807b;
        if (hashMap == null) {
            return 0;
        }
        int i = 0;
        for (String str : hashMap.keySet()) {
            ArrayList arrayList = this.f6807b.get(str);
            i += arrayList != null ? arrayList.size() : 0;
        }
        return i;
    }

    /* renamed from: a */
    public static C3992a m10684a(Context context) {
        if (f6799a == null) {
            synchronized (C3992a.class) {
                if (f6799a == null) {
                    f6799a = new C3992a(context);
                }
            }
        }
        return f6799a;
    }

    /* renamed from: a */
    private void m10689a(C4498ai.C4499a aVar, int i) {
        C4498ai.m13271a(this.f6800a).mo24731b(aVar, i);
    }

    /* renamed from: b */
    private int mo22730b() {
        HashMap<String, HashMap<String, C3990a>> hashMap = this.f6805a;
        int i = 0;
        if (hashMap != null) {
            for (String str : hashMap.keySet()) {
                HashMap hashMap2 = this.f6805a.get(str);
                if (hashMap2 != null) {
                    for (String str2 : hashMap2.keySet()) {
                        C3990a aVar = (C3990a) hashMap2.get(str2);
                        if (aVar instanceof PerfClientReport) {
                            i = (int) (((long) i) + ((PerfClientReport) aVar).perfCounts);
                        }
                    }
                }
            }
        }
        return i;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m10692b(EventClientReport eventClientReport) {
        IEventProcessor iEventProcessor = this.f6802a;
        if (iEventProcessor != null) {
            iEventProcessor.mo22747a(eventClientReport);
            if (mo22723a() >= 10) {
                m10695d();
                C4498ai.m13271a(this.f6800a).mo24727a(100888);
                return;
            }
            m10689a((C4498ai.C4499a) new C3995d(this), f6798a);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m10693b(PerfClientReport perfClientReport) {
        IPerfProcessor iPerfProcessor = this.f6803a;
        if (iPerfProcessor != null) {
            iPerfProcessor.mo22747a(perfClientReport);
            if (mo22730b() >= 10) {
                m10696e();
                C4498ai.m13271a(this.f6800a).mo24727a(100889);
                return;
            }
            m10689a((C4498ai.C4499a) new C3997f(this), f6798a);
        }
    }

    /* renamed from: d */
    private void m10695d() {
        try {
            this.f6802a.mo22750b();
        } catch (Exception e) {
            C3989b.m10681d("we: " + e.getMessage());
        }
    }

    /* renamed from: e */
    private void m10696e() {
        try {
            this.f6803a.mo22750b();
        } catch (Exception e) {
            C3989b.m10681d("wp: " + e.getMessage());
        }
    }

    /* renamed from: f */
    private void m10697f() {
        if (m10684a(this.f6800a).mo22723a().isEventUploadSwitchOpen()) {
            C4533bg bgVar = new C4533bg(this.f6800a);
            int eventUploadFrequency = (int) m10684a(this.f6800a).mo22723a().getEventUploadFrequency();
            if (eventUploadFrequency < 1800) {
                eventUploadFrequency = 1800;
            }
            if (System.currentTimeMillis() - C4539bm.m13458a(this.f6800a).mo24775a("sp_client_report_status", "event_last_upload_time", 0) > ((long) (eventUploadFrequency * 1000))) {
                C4498ai.m13271a(this.f6800a).mo24726a((Runnable) new C3999h(this, bgVar), 10);
            }
            synchronized (C3992a.class) {
                if (!C4498ai.m13271a(this.f6800a).mo24729a((C4498ai.C4499a) bgVar, eventUploadFrequency)) {
                    C4498ai.m13271a(this.f6800a).mo24727a(100886);
                    C4498ai.m13271a(this.f6800a).mo24729a((C4498ai.C4499a) bgVar, eventUploadFrequency);
                }
            }
        }
    }

    /* renamed from: g */
    private void m10698g() {
        if (m10684a(this.f6800a).mo22723a().isPerfUploadSwitchOpen()) {
            C4534bh bhVar = new C4534bh(this.f6800a);
            int perfUploadFrequency = (int) m10684a(this.f6800a).mo22723a().getPerfUploadFrequency();
            if (perfUploadFrequency < 1800) {
                perfUploadFrequency = 1800;
            }
            if (System.currentTimeMillis() - C4539bm.m13458a(this.f6800a).mo24775a("sp_client_report_status", "perf_last_upload_time", 0) > ((long) (perfUploadFrequency * 1000))) {
                C4498ai.m13271a(this.f6800a).mo24726a((Runnable) new C4000i(this, bhVar), 15);
            }
            synchronized (C3992a.class) {
                if (!C4498ai.m13271a(this.f6800a).mo24729a((C4498ai.C4499a) bhVar, perfUploadFrequency)) {
                    C4498ai.m13271a(this.f6800a).mo24727a(100887);
                    C4498ai.m13271a(this.f6800a).mo24729a((C4498ai.C4499a) bhVar, perfUploadFrequency);
                }
            }
        }
    }

    /* renamed from: a */
    public synchronized Config m10699a() {
        if (this.f6801a == null) {
            this.f6801a = Config.defaultConfig(this.f6800a);
        }
        return this.f6801a;
    }

    /* renamed from: a */
    public EventClientReport mo22724a(int i, String str) {
        EventClientReport eventClientReport = new EventClientReport();
        eventClientReport.eventContent = str;
        eventClientReport.eventTime = System.currentTimeMillis();
        eventClientReport.eventType = i;
        eventClientReport.eventId = C4532bf.m13430a(6);
        eventClientReport.production = 1000;
        eventClientReport.reportType = 1001;
        eventClientReport.clientInterfaceId = "E100004";
        eventClientReport.setAppPackageName(this.f6800a.getPackageName());
        eventClientReport.setSdkVersion(this.f6804a);
        return eventClientReport;
    }

    /* renamed from: a */
    public void m10701a() {
        m10684a(this.f6800a).m10697f();
        m10684a(this.f6800a).m10698g();
    }

    /* renamed from: a */
    public void mo22725a(Config config, IEventProcessor iEventProcessor, IPerfProcessor iPerfProcessor) {
        this.f6801a = config;
        this.f6802a = iEventProcessor;
        this.f6803a = iPerfProcessor;
        iEventProcessor.setEventMap(this.f6807b);
        this.f6803a.setPerfMap(this.f6805a);
    }

    /* renamed from: a */
    public void mo22726a(EventClientReport eventClientReport) {
        if (mo22723a().isEventUploadSwitchOpen()) {
            this.f6806a.execute(new C3993b(this, eventClientReport));
        }
    }

    /* renamed from: a */
    public void mo22727a(PerfClientReport perfClientReport) {
        if (mo22723a().isPerfUploadSwitchOpen()) {
            this.f6806a.execute(new C3994c(this, perfClientReport));
        }
    }

    /* renamed from: a */
    public void mo22728a(String str) {
        this.f6804a = str;
    }

    /* renamed from: a */
    public void mo22729a(boolean z, boolean z2, long j, long j2) {
        Config config = this.f6801a;
        if (config == null) {
            return;
        }
        if (z != config.isEventUploadSwitchOpen() || z2 != this.f6801a.isPerfUploadSwitchOpen() || j != this.f6801a.getEventUploadFrequency() || j2 != this.f6801a.getPerfUploadFrequency()) {
            long eventUploadFrequency = this.f6801a.getEventUploadFrequency();
            long perfUploadFrequency = this.f6801a.getPerfUploadFrequency();
            Config build = Config.getBuilder().setAESKey(C4536bj.m13450a(this.f6800a)).setEventEncrypted(this.f6801a.isEventEncrypted()).setEventUploadSwitchOpen(z).setEventUploadFrequency(j).setPerfUploadSwitchOpen(z2).setPerfUploadFrequency(j2).build(this.f6800a);
            this.f6801a = build;
            if (!build.isEventUploadSwitchOpen()) {
                C4498ai.m13271a(this.f6800a).mo24727a(100886);
            } else if (eventUploadFrequency != build.getEventUploadFrequency()) {
                C3989b.m10680c(this.f6800a.getPackageName() + "reset event job " + build.getEventUploadFrequency());
                m10697f();
            }
            if (!this.f6801a.isPerfUploadSwitchOpen()) {
                C4498ai.m13271a(this.f6800a).mo24727a(100887);
            } else if (perfUploadFrequency != build.getPerfUploadFrequency()) {
                C3989b.m10680c(this.f6800a.getPackageName() + "reset perf job " + build.getPerfUploadFrequency());
                m10698g();
            }
        }
    }

    /* renamed from: b */
    public void m10707b() {
        if (mo22723a().isEventUploadSwitchOpen()) {
            C4535bi biVar = new C4535bi();
            biVar.mo24770a(this.f6800a);
            biVar.mo24771a((C4003c) this.f6802a);
            this.f6806a.execute(biVar);
        }
    }

    /* renamed from: c */
    public void mo22731c() {
        if (mo22723a().isPerfUploadSwitchOpen()) {
            C4535bi biVar = new C4535bi();
            biVar.mo24771a((C4003c) this.f6803a);
            biVar.mo24770a(this.f6800a);
            this.f6806a.execute(biVar);
        }
    }
}
