package com.xiaomi.push;

import android.content.Context;
import android.text.TextUtils;
import com.miot.common.ReturnCode;
import com.xiaomi.channel.commonutils.logger.C4408b;
import com.xiaomi.clientreport.data.Config;
import com.xiaomi.clientreport.data.EventClientReport;
import com.xiaomi.clientreport.data.PerfClientReport;
import com.xiaomi.clientreport.manager.ClientReportClient;
import com.xiaomi.push.service.C4898ba;
import com.xiaomi.push.service.C4935bz;
import com.xiaomi.push.service.C4937ca;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.xiaomi.push.en */
public class C4665en {

    /* renamed from: a */
    private static C4666a f7992a;

    /* renamed from: a */
    private static Map<String, C4770ht> f7993a;

    /* renamed from: com.xiaomi.push.en$a */
    public interface C4666a {
        void uploader(Context context, C4764hn hnVar);
    }

    /* renamed from: a */
    public static int m13673a(int i) {
        if (i > 0) {
            return i + 1000;
        }
        return -1;
    }

    /* renamed from: a */
    public static int m13674a(Enum enumR) {
        if (enumR != null) {
            if (enumR instanceof C4760hj) {
                return enumR.ordinal() + 1001;
            }
            if (enumR instanceof C4770ht) {
                return enumR.ordinal() + ReturnCode.E_ACTION_NOT_SUPPORT;
            }
            if (enumR instanceof C4678ey) {
                return enumR.ordinal() + ReturnCode.E_SERVICE_NOT_BOUND;
            }
        }
        return -1;
    }

    /* renamed from: a */
    public static Config m13675a(Context context) {
        boolean a = C4898ba.m15362a(context).mo29996a(C4765ho.PerfUploadSwitch.mo29322a(), false);
        boolean a2 = C4898ba.m15362a(context).mo29996a(C4765ho.EventUploadNewSwitch.mo29322a(), false);
        int a3 = C4898ba.m15362a(context).mo29988a(C4765ho.PerfUploadFrequency.mo29322a(), 86400);
        return Config.getBuilder().setEventUploadSwitchOpen(a2).setEventUploadFrequency((long) C4898ba.m15362a(context).mo29988a(C4765ho.EventUploadFrequency.mo29322a(), 86400)).setPerfUploadSwitchOpen(a).setPerfUploadFrequency((long) a3).build(context);
    }

    /* renamed from: a */
    public static EventClientReport m13676a(Context context, String str, String str2, int i, long j, String str3) {
        EventClientReport a = m13677a(str);
        a.eventId = str2;
        a.eventType = i;
        a.eventTime = j;
        a.eventContent = str3;
        return a;
    }

    /* renamed from: a */
    public static EventClientReport m13677a(String str) {
        EventClientReport eventClientReport = new EventClientReport();
        eventClientReport.production = 1000;
        eventClientReport.reportType = 1001;
        eventClientReport.clientInterfaceId = str;
        return eventClientReport;
    }

    /* renamed from: a */
    public static PerfClientReport m13678a() {
        PerfClientReport perfClientReport = new PerfClientReport();
        perfClientReport.production = 1000;
        perfClientReport.reportType = 1000;
        perfClientReport.clientInterfaceId = "P100000";
        return perfClientReport;
    }

    /* renamed from: a */
    public static PerfClientReport m13679a(Context context, int i, long j, long j2) {
        PerfClientReport a = m13678a();
        a.code = i;
        a.perfCounts = j;
        a.perfLatencies = j2;
        return a;
    }

    /* renamed from: a */
    public static C4764hn m13680a(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        C4764hn hnVar = new C4764hn();
        hnVar.mo29307d("category_client_report_data");
        hnVar.mo29295a("push_sdk_channel");
        hnVar.mo29294a(1);
        hnVar.mo29300b(str);
        hnVar.mo29297a(true);
        hnVar.mo29299b(System.currentTimeMillis());
        hnVar.mo29314g(context.getPackageName());
        hnVar.mo29309e("com.xiaomi.xmsf");
        hnVar.mo29312f(C4935bz.m15494a());
        hnVar.mo29303c("quality_support");
        return hnVar;
    }

    /* renamed from: a */
    public static C4770ht m13681a(String str) {
        if (f7993a == null) {
            synchronized (C4770ht.class) {
                if (f7993a == null) {
                    f7993a = new HashMap();
                    for (C4770ht htVar : C4770ht.values()) {
                        f7993a.put(htVar.f8718a.toLowerCase(), htVar);
                    }
                }
            }
        }
        C4770ht htVar2 = f7993a.get(str.toLowerCase());
        return htVar2 != null ? htVar2 : C4770ht.Invalid;
    }

    /* renamed from: a */
    public static String m13682a(int i) {
        return i == 1000 ? "E100000" : i == 3000 ? "E100002" : i == 2000 ? "E100001" : i == 6000 ? "E100003" : "";
    }

    /* renamed from: a */
    public static void m13683a(Context context) {
        ClientReportClient.updateConfig(context, m13675a(context));
    }

    /* renamed from: a */
    public static void m13684a(Context context, Config config) {
        ClientReportClient.init(context, config, new C4663el(context), new C4664em(context));
    }

    /* renamed from: a */
    private static void m13685a(Context context, C4764hn hnVar) {
        if (m13675a(context.getApplicationContext())) {
            C4937ca.m15503a(context.getApplicationContext(), hnVar);
            return;
        }
        C4666a aVar = f7992a;
        if (aVar != null) {
            aVar.uploader(context, hnVar);
        }
    }

    /* renamed from: a */
    public static void m13686a(Context context, List<String> list) {
        if (list != null) {
            try {
                for (String a : list) {
                    C4764hn a2 = m13680a(context, a);
                    if (!C4935bz.m15498a(a2, false)) {
                        m13685a(context, a2);
                    }
                }
            } catch (Throwable th) {
                C4408b.m12483d(th.getMessage());
            }
        }
    }

    /* renamed from: a */
    public static void m13687a(C4666a aVar) {
        f7992a = aVar;
    }

    /* renamed from: a */
    public static boolean m13688a(Context context) {
        return context != null && !TextUtils.isEmpty(context.getPackageName()) && "com.xiaomi.xmsf".equals(context.getPackageName());
    }
}
