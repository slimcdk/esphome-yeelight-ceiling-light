package com.xiaomi.clientreport.manager;

import android.content.Context;
import android.os.Process;
import com.xiaomi.channel.commonutils.logger.C4408b;
import com.xiaomi.clientreport.data.Config;
import com.xiaomi.clientreport.data.EventClientReport;
import com.xiaomi.clientreport.data.PerfClientReport;
import com.xiaomi.clientreport.processor.C4421a;
import com.xiaomi.clientreport.processor.C4422b;
import com.xiaomi.clientreport.processor.IEventProcessor;
import com.xiaomi.clientreport.processor.IPerfProcessor;
import com.xiaomi.push.C4747h;

public class ClientReportClient {
    public static void init(Context context) {
        init(context, Config.defaultConfig(context), new C4421a(context), new C4422b(context));
    }

    public static void init(Context context, Config config) {
        init(context, config, new C4421a(context), new C4422b(context));
    }

    public static void init(Context context, Config config, IEventProcessor iEventProcessor, IPerfProcessor iPerfProcessor) {
        C4408b.m12482c("init in  pid :" + Process.myPid() + " threadId: " + Thread.currentThread().getId());
        C4412a.m12487a(context).mo28470a(config, iEventProcessor, iPerfProcessor);
        if (C4747h.m14122a(context)) {
            C4408b.m12482c("init in process　start scheduleJob");
            C4412a.m12487a(context).mo28468a();
        }
    }

    public static void reportEvent(Context context, EventClientReport eventClientReport) {
        if (eventClientReport != null) {
            C4412a.m12487a(context).mo28471a(eventClientReport);
        }
    }

    public static void reportPerf(Context context, PerfClientReport perfClientReport) {
        if (perfClientReport != null) {
            C4412a.m12487a(context).mo28472a(perfClientReport);
        }
    }

    public static void updateConfig(Context context, Config config) {
        if (config != null) {
            C4412a.m12487a(context).mo28474a(config.isEventUploadSwitchOpen(), config.isPerfUploadSwitchOpen(), config.getEventUploadFrequency(), config.getPerfUploadFrequency());
        }
    }
}
