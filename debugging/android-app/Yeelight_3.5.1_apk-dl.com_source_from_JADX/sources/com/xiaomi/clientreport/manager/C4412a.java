package com.xiaomi.clientreport.manager;

import android.content.Context;
import com.xiaomi.channel.commonutils.logger.C4408b;
import com.xiaomi.clientreport.data.C4410a;
import com.xiaomi.clientreport.data.Config;
import com.xiaomi.clientreport.data.EventClientReport;
import com.xiaomi.clientreport.data.PerfClientReport;
import com.xiaomi.clientreport.processor.C4423c;
import com.xiaomi.clientreport.processor.IEventProcessor;
import com.xiaomi.clientreport.processor.IPerfProcessor;
import com.xiaomi.push.C4516al;
import com.xiaomi.push.C4561bp;
import com.xiaomi.push.C4562bq;
import com.xiaomi.push.C4563br;
import com.xiaomi.push.C4564bs;
import com.xiaomi.push.C4565bt;
import com.xiaomi.push.C4568bw;
import com.xiaomi.push.C4830m;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: com.xiaomi.clientreport.manager.a */
public class C4412a {

    /* renamed from: a */
    private static final int f7365a = (C4830m.m14997a() ? 30 : 10);

    /* renamed from: a */
    private static volatile C4412a f7366a;

    /* renamed from: a */
    private Context f7367a;

    /* renamed from: a */
    private Config f7368a;

    /* renamed from: a */
    private IEventProcessor f7369a;

    /* renamed from: a */
    private IPerfProcessor f7370a;

    /* renamed from: a */
    private String f7371a;

    /* renamed from: a */
    private HashMap<String, HashMap<String, C4410a>> f7372a = new HashMap<>();

    /* renamed from: a */
    private ExecutorService f7373a = Executors.newSingleThreadExecutor();

    /* renamed from: b */
    private HashMap<String, ArrayList<C4410a>> f7374b = new HashMap<>();

    private C4412a(Context context) {
        this.f7367a = context;
    }

    /* renamed from: a */
    private int mo28468a() {
        HashMap<String, ArrayList<C4410a>> hashMap = this.f7374b;
        if (hashMap == null) {
            return 0;
        }
        int i = 0;
        for (String str : hashMap.keySet()) {
            ArrayList arrayList = this.f7374b.get(str);
            i += arrayList != null ? arrayList.size() : 0;
        }
        return i;
    }

    /* renamed from: a */
    public static C4412a m12487a(Context context) {
        if (f7366a == null) {
            synchronized (C4412a.class) {
                if (f7366a == null) {
                    f7366a = new C4412a(context);
                }
            }
        }
        return f7366a;
    }

    /* renamed from: a */
    private void m12492a(C4516al.C4517a aVar, int i) {
        C4516al.m12857a(this.f7367a).mo28740b(aVar, i);
    }

    /* renamed from: b */
    private int mo28475b() {
        HashMap<String, HashMap<String, C4410a>> hashMap = this.f7372a;
        int i = 0;
        if (hashMap != null) {
            for (String str : hashMap.keySet()) {
                HashMap hashMap2 = this.f7372a.get(str);
                if (hashMap2 != null) {
                    for (String str2 : hashMap2.keySet()) {
                        C4410a aVar = (C4410a) hashMap2.get(str2);
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
    public void m12495b(EventClientReport eventClientReport) {
        IEventProcessor iEventProcessor = this.f7369a;
        if (iEventProcessor != null) {
            iEventProcessor.mo28492a(eventClientReport);
            if (mo28468a() >= 10) {
                m12498d();
                C4516al.m12857a(this.f7367a).mo28739a("100888");
                return;
            }
            m12492a((C4516al.C4517a) new C4415d(this), f7365a);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m12496b(PerfClientReport perfClientReport) {
        IPerfProcessor iPerfProcessor = this.f7370a;
        if (iPerfProcessor != null) {
            iPerfProcessor.mo28492a(perfClientReport);
            if (mo28475b() >= 10) {
                m12499e();
                C4516al.m12857a(this.f7367a).mo28739a("100889");
                return;
            }
            m12492a((C4516al.C4517a) new C4417f(this), f7365a);
        }
    }

    /* renamed from: d */
    private void m12498d() {
        try {
            this.f7369a.mo28495b();
        } catch (Exception e) {
            C4408b.m12483d("we: " + e.getMessage());
        }
    }

    /* renamed from: e */
    private void m12499e() {
        try {
            this.f7370a.mo28495b();
        } catch (Exception e) {
            C4408b.m12483d("wp: " + e.getMessage());
        }
    }

    /* renamed from: f */
    private void m12500f() {
        if (m12487a(this.f7367a).mo28468a().isEventUploadSwitchOpen()) {
            C4562bq bqVar = new C4562bq(this.f7367a);
            int eventUploadFrequency = (int) m12487a(this.f7367a).mo28468a().getEventUploadFrequency();
            if (eventUploadFrequency < 1800) {
                eventUploadFrequency = 1800;
            }
            if (System.currentTimeMillis() - C4568bw.m13070a(this.f7367a).mo28789a("sp_client_report_status", "event_last_upload_time", 0) > ((long) (eventUploadFrequency * 1000))) {
                C4516al.m12857a(this.f7367a).mo28734a((Runnable) new C4419h(this, bqVar), 10);
            }
            synchronized (C4412a.class) {
                if (!C4516al.m12857a(this.f7367a).mo28736a((C4516al.C4517a) bqVar, eventUploadFrequency)) {
                    C4516al.m12857a(this.f7367a).mo28739a("100886");
                    C4516al.m12857a(this.f7367a).mo28736a((C4516al.C4517a) bqVar, eventUploadFrequency);
                }
            }
        }
    }

    /* renamed from: g */
    private void m12501g() {
        if (m12487a(this.f7367a).mo28468a().isPerfUploadSwitchOpen()) {
            C4563br brVar = new C4563br(this.f7367a);
            int perfUploadFrequency = (int) m12487a(this.f7367a).mo28468a().getPerfUploadFrequency();
            if (perfUploadFrequency < 1800) {
                perfUploadFrequency = 1800;
            }
            if (System.currentTimeMillis() - C4568bw.m13070a(this.f7367a).mo28789a("sp_client_report_status", "perf_last_upload_time", 0) > ((long) (perfUploadFrequency * 1000))) {
                C4516al.m12857a(this.f7367a).mo28734a((Runnable) new C4420i(this, brVar), 15);
            }
            synchronized (C4412a.class) {
                if (!C4516al.m12857a(this.f7367a).mo28736a((C4516al.C4517a) brVar, perfUploadFrequency)) {
                    C4516al.m12857a(this.f7367a).mo28739a("100887");
                    C4516al.m12857a(this.f7367a).mo28736a((C4516al.C4517a) brVar, perfUploadFrequency);
                }
            }
        }
    }

    /* renamed from: a */
    public synchronized Config m12502a() {
        if (this.f7368a == null) {
            this.f7368a = Config.defaultConfig(this.f7367a);
        }
        return this.f7368a;
    }

    /* renamed from: a */
    public EventClientReport mo28469a(int i, String str) {
        EventClientReport eventClientReport = new EventClientReport();
        eventClientReport.eventContent = str;
        eventClientReport.eventTime = System.currentTimeMillis();
        eventClientReport.eventType = i;
        eventClientReport.eventId = C4561bp.m13041a(6);
        eventClientReport.production = 1000;
        eventClientReport.reportType = 1001;
        eventClientReport.clientInterfaceId = "E100004";
        eventClientReport.setAppPackageName(this.f7367a.getPackageName());
        eventClientReport.setSdkVersion(this.f7371a);
        return eventClientReport;
    }

    /* renamed from: a */
    public void m12504a() {
        m12487a(this.f7367a).m12500f();
        m12487a(this.f7367a).m12501g();
    }

    /* renamed from: a */
    public void mo28470a(Config config, IEventProcessor iEventProcessor, IPerfProcessor iPerfProcessor) {
        this.f7368a = config;
        this.f7369a = iEventProcessor;
        this.f7370a = iPerfProcessor;
        iEventProcessor.setEventMap(this.f7374b);
        this.f7370a.setPerfMap(this.f7372a);
    }

    /* renamed from: a */
    public void mo28471a(EventClientReport eventClientReport) {
        if (mo28468a().isEventUploadSwitchOpen()) {
            this.f7373a.execute(new C4413b(this, eventClientReport));
        }
    }

    /* renamed from: a */
    public void mo28472a(PerfClientReport perfClientReport) {
        if (mo28468a().isPerfUploadSwitchOpen()) {
            this.f7373a.execute(new C4414c(this, perfClientReport));
        }
    }

    /* renamed from: a */
    public void mo28473a(String str) {
        this.f7371a = str;
    }

    /* renamed from: a */
    public void mo28474a(boolean z, boolean z2, long j, long j2) {
        Config config = this.f7368a;
        if (config == null) {
            return;
        }
        if (z != config.isEventUploadSwitchOpen() || z2 != this.f7368a.isPerfUploadSwitchOpen() || j != this.f7368a.getEventUploadFrequency() || j2 != this.f7368a.getPerfUploadFrequency()) {
            long eventUploadFrequency = this.f7368a.getEventUploadFrequency();
            long perfUploadFrequency = this.f7368a.getPerfUploadFrequency();
            Config build = Config.getBuilder().setAESKey(C4565bt.m13062a(this.f7367a)).setEventEncrypted(this.f7368a.isEventEncrypted()).setEventUploadSwitchOpen(z).setEventUploadFrequency(j).setPerfUploadSwitchOpen(z2).setPerfUploadFrequency(j2).build(this.f7367a);
            this.f7368a = build;
            if (!build.isEventUploadSwitchOpen()) {
                C4516al.m12857a(this.f7367a).mo28739a("100886");
            } else if (eventUploadFrequency != build.getEventUploadFrequency()) {
                C4408b.m12482c(this.f7367a.getPackageName() + "reset event job " + build.getEventUploadFrequency());
                m12500f();
            }
            if (!this.f7368a.isPerfUploadSwitchOpen()) {
                C4516al.m12857a(this.f7367a).mo28739a("100887");
            } else if (perfUploadFrequency != build.getPerfUploadFrequency()) {
                C4408b.m12482c(this.f7367a.getPackageName() + " reset perf job " + build.getPerfUploadFrequency());
                m12501g();
            }
        }
    }

    /* renamed from: b */
    public void m12510b() {
        if (mo28468a().isEventUploadSwitchOpen()) {
            C4564bs bsVar = new C4564bs();
            bsVar.mo28784a(this.f7367a);
            bsVar.mo28785a((C4423c) this.f7369a);
            this.f7373a.execute(bsVar);
        }
    }

    /* renamed from: c */
    public void mo28476c() {
        if (mo28468a().isPerfUploadSwitchOpen()) {
            C4564bs bsVar = new C4564bs();
            bsVar.mo28785a((C4423c) this.f7370a);
            bsVar.mo28784a(this.f7367a);
            this.f7373a.execute(bsVar);
        }
    }
}
