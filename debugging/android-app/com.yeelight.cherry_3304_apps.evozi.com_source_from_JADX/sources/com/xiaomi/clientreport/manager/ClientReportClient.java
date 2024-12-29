package com.xiaomi.clientreport.manager;

import android.content.Context;
import android.os.Process;
import com.xiaomi.channel.commonutils.logger.C3989b;
import com.xiaomi.clientreport.data.Config;
import com.xiaomi.clientreport.data.EventClientReport;
import com.xiaomi.clientreport.data.PerfClientReport;
import com.xiaomi.clientreport.processor.C4001a;
import com.xiaomi.clientreport.processor.C4002b;
import com.xiaomi.clientreport.processor.IEventProcessor;
import com.xiaomi.clientreport.processor.IPerfProcessor;
import com.xiaomi.push.C4689g;

public class ClientReportClient {
    public static void init(Context context) {
        init(context, Config.defaultConfig(context), new C4001a(context), new C4002b(context));
    }

    public static void init(Context context, Config config) {
        init(context, config, new C4001a(context), new C4002b(context));
    }

    public static void init(Context context, Config config, IEventProcessor iEventProcessor, IPerfProcessor iPerfProcessor) {
        C3989b.m10680c("init in process " + C4689g.m14352a(context) + " pid :" + Process.myPid() + " threadId: " + Thread.currentThread().getId());
        C3992a.m10684a(context).mo22725a(config, iEventProcessor, iPerfProcessor);
        if (C4689g.m14352a(context)) {
            C3989b.m10680c("init in process　start scheduleJob");
            C3992a.m10684a(context).mo22723a();
        }
    }

    public static void reportEvent(Context context, EventClientReport eventClientReport) {
        if (eventClientReport != null) {
            C3992a.m10684a(context).mo22726a(eventClientReport);
        }
    }

    public static void reportPerf(Context context, PerfClientReport perfClientReport) {
        if (perfClientReport != null) {
            C3992a.m10684a(context).mo22727a(perfClientReport);
        }
    }

    public static void updateConfig(Context context, Config config) {
        if (config != null) {
            C3992a.m10684a(context).mo22729a(config.isEventUploadSwitchOpen(), config.isPerfUploadSwitchOpen(), config.getEventUploadFrequency(), config.getPerfUploadFrequency());
        }
    }
}
