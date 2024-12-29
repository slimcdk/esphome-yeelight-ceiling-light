package com.xiaomi.push;

import android.content.Context;
import android.text.TextUtils;
import com.miot.common.ReturnCode;
import com.xiaomi.channel.commonutils.logger.C3989b;
import com.xiaomi.clientreport.data.Config;
import com.xiaomi.clientreport.data.EventClientReport;
import com.xiaomi.clientreport.data.PerfClientReport;
import com.xiaomi.clientreport.manager.ClientReportClient;
import com.xiaomi.push.service.C4854ak;
import com.xiaomi.push.service.C4890bi;
import com.xiaomi.push.service.C4891bj;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.xiaomi.push.fa */
public class C4660fa {

    /* renamed from: a */
    private static C4661a f8608a;

    /* renamed from: a */
    private static Map<String, C4749hw> f8609a;

    /* renamed from: com.xiaomi.push.fa$a */
    public interface C4661a {
        void uploader(Context context, C4743hq hqVar);
    }

    /* renamed from: a */
    public static int m14135a(int i) {
        if (i > 0) {
            return i + 1000;
        }
        return -1;
    }

    /* renamed from: a */
    public static int m14136a(Enum enumR) {
        if (enumR != null) {
            if (enumR instanceof C4739hm) {
                return enumR.ordinal() + 1001;
            }
            if (enumR instanceof C4749hw) {
                return enumR.ordinal() + ReturnCode.E_ACTION_NOT_SUPPORT;
            }
            if (enumR instanceof C4668fg) {
                return enumR.ordinal() + ReturnCode.E_SERVICE_NOT_BOUND;
            }
        }
        return -1;
    }

    /* renamed from: a */
    public static Config m14137a(Context context) {
        boolean a = C4854ak.m15568a(context).mo25911a(C4744hr.PerfUploadSwitch.mo25291a(), false);
        boolean a2 = C4854ak.m15568a(context).mo25911a(C4744hr.EventUploadNewSwitch.mo25291a(), false);
        int a3 = C4854ak.m15568a(context).mo25906a(C4744hr.PerfUploadFrequency.mo25291a(), 86400);
        return Config.getBuilder().setEventUploadSwitchOpen(a2).setEventUploadFrequency((long) C4854ak.m15568a(context).mo25906a(C4744hr.EventUploadFrequency.mo25291a(), 86400)).setPerfUploadSwitchOpen(a).setPerfUploadFrequency((long) a3).build(context);
    }

    /* renamed from: a */
    public static EventClientReport m14138a(Context context, String str, String str2, int i, long j, String str3) {
        EventClientReport a = m14139a(str);
        a.eventId = str2;
        a.eventType = i;
        a.eventTime = j;
        a.eventContent = str3;
        return a;
    }

    /* renamed from: a */
    public static EventClientReport m14139a(String str) {
        EventClientReport eventClientReport = new EventClientReport();
        eventClientReport.production = 1000;
        eventClientReport.reportType = 1001;
        eventClientReport.clientInterfaceId = str;
        return eventClientReport;
    }

    /* renamed from: a */
    public static PerfClientReport m14140a() {
        PerfClientReport perfClientReport = new PerfClientReport();
        perfClientReport.production = 1000;
        perfClientReport.reportType = 1000;
        perfClientReport.clientInterfaceId = "P100000";
        return perfClientReport;
    }

    /* renamed from: a */
    public static PerfClientReport m14141a(Context context, int i, long j, long j2) {
        PerfClientReport a = m14140a();
        a.code = i;
        a.perfCounts = j;
        a.perfLatencies = j2;
        return a;
    }

    /* renamed from: a */
    public static C4743hq m14142a(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        C4743hq hqVar = new C4743hq();
        hqVar.mo25276d("category_client_report_data");
        hqVar.mo25266a("push_sdk_channel");
        hqVar.mo25265a(1);
        hqVar.mo25269b(str);
        hqVar.mo25267a(true);
        hqVar.mo25268b(System.currentTimeMillis());
        hqVar.mo25283g(context.getPackageName());
        hqVar.mo25278e("com.xiaomi.xmsf");
        hqVar.mo25281f(C4890bi.m15702a());
        hqVar.mo25272c("quality_support");
        return hqVar;
    }

    /* renamed from: a */
    public static C4749hw m14143a(String str) {
        if (f8609a == null) {
            synchronized (C4749hw.class) {
                if (f8609a == null) {
                    f8609a = new HashMap();
                    for (C4749hw hwVar : C4749hw.values()) {
                        f8609a.put(hwVar.f9252a.toLowerCase(), hwVar);
                    }
                }
            }
        }
        C4749hw hwVar2 = f8609a.get(str.toLowerCase());
        return hwVar2 != null ? hwVar2 : C4749hw.Invalid;
    }

    /* renamed from: a */
    public static String m14144a(int i) {
        return i == 1000 ? "E100000" : i == 3000 ? "E100002" : i == 2000 ? "E100001" : i == 6000 ? "E100003" : "";
    }

    /* renamed from: a */
    public static void m14145a(Context context) {
        ClientReportClient.updateConfig(context, m14137a(context));
    }

    /* renamed from: a */
    public static void m14146a(Context context, Config config) {
        ClientReportClient.init(context, config, new C4657ey(context), new C4658ez(context));
    }

    /* renamed from: a */
    private static void m14147a(Context context, C4743hq hqVar) {
        if (m14137a(context.getApplicationContext())) {
            C4891bj.m15707a(context.getApplicationContext(), hqVar);
            return;
        }
        C4661a aVar = f8608a;
        if (aVar != null) {
            aVar.uploader(context, hqVar);
        }
    }

    /* renamed from: a */
    public static void m14148a(Context context, List<String> list) {
        if (list != null) {
            try {
                for (String a : list) {
                    C4743hq a2 = m14142a(context, a);
                    if (!C4890bi.m15705a(a2, false)) {
                        m14147a(context, a2);
                    }
                }
            } catch (Throwable th) {
                C3989b.m10681d(th.getMessage());
            }
        }
    }

    /* renamed from: a */
    public static void m14149a(C4661a aVar) {
        f8608a = aVar;
    }

    /* renamed from: a */
    public static boolean m14150a(Context context) {
        return context != null && !TextUtils.isEmpty(context.getPackageName()) && "com.xiaomi.xmsf".equals(context.getPackageName());
    }
}
