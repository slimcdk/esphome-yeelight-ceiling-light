package com.xiaomi.push.service.receivers;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.xiaomi.channel.commonutils.logger.C3989b;
import com.xiaomi.mipush.sdk.C4037ag;
import com.xiaomi.mipush.sdk.C4047aq;
import com.xiaomi.mipush.sdk.C4053av;
import com.xiaomi.mipush.sdk.C4056b;
import com.xiaomi.mipush.sdk.COSPushHelper;
import com.xiaomi.mipush.sdk.FTOSPushHelper;
import com.xiaomi.mipush.sdk.HWPushHelper;
import com.xiaomi.mipush.sdk.MiPushClient;
import com.xiaomi.push.C4521az;
import com.xiaomi.push.C4718gx;
import com.xiaomi.push.service.C4881bb;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class NetworkStatusReceiver extends BroadcastReceiver {

    /* renamed from: a */
    private static int f10182a = 1;

    /* renamed from: a */
    private static BlockingQueue<Runnable> f10183a = new LinkedBlockingQueue();

    /* renamed from: a */
    private static ThreadPoolExecutor f10184a = new ThreadPoolExecutor(f10182a, f10186b, (long) f10187c, TimeUnit.SECONDS, f10183a);

    /* renamed from: a */
    private static boolean f10185a = false;

    /* renamed from: b */
    private static int f10186b = 1;

    /* renamed from: c */
    private static int f10187c = 2;

    /* renamed from: b */
    private boolean f10188b;

    public NetworkStatusReceiver() {
        this.f10188b = false;
        this.f10188b = true;
    }

    public NetworkStatusReceiver(Object obj) {
        this.f10188b = false;
        f10185a = true;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m15840a(Context context) {
        if (!C4047aq.m10835a(context).mo22903a() && C4056b.m10888a(context).mo22940c() && !C4056b.m10888a(context).mo22942e()) {
            try {
                Intent intent = new Intent();
                intent.setComponent(new ComponentName(context, "com.xiaomi.push.service.XMPushService"));
                intent.setAction("com.xiaomi.push.network_status_changed");
                C4881bb.m15666a(context).mo25943a(intent);
            } catch (Exception e) {
                C3989b.m10678a((Throwable) e);
            }
        }
        C4718gx.m14469a(context);
        if (C4521az.m13366b(context) && C4047aq.m10835a(context).mo22920b()) {
            C4047aq.m10835a(context).mo22922c();
        }
        if (C4521az.m13366b(context)) {
            if ("syncing".equals(C4037ag.m10796a(context).mo22895a(C4053av.DISABLE_PUSH))) {
                MiPushClient.disablePush(context);
            }
            if ("syncing".equals(C4037ag.m10796a(context).mo22895a(C4053av.ENABLE_PUSH))) {
                MiPushClient.enablePush(context);
            }
            if ("syncing".equals(C4037ag.m10796a(context).mo22895a(C4053av.UPLOAD_HUAWEI_TOKEN))) {
                MiPushClient.syncAssemblePushToken(context);
            }
            if ("syncing".equals(C4037ag.m10796a(context).mo22895a(C4053av.UPLOAD_FCM_TOKEN))) {
                MiPushClient.syncAssembleFCMPushToken(context);
            }
            if ("syncing".equals(C4037ag.m10796a(context).mo22895a(C4053av.UPLOAD_COS_TOKEN))) {
                MiPushClient.syncAssembleCOSPushToken(context);
            }
            if ("syncing".equals(C4037ag.m10796a(context).mo22895a(C4053av.UPLOAD_FTOS_TOKEN))) {
                MiPushClient.syncAssembleFTOSPushToken(context);
            }
            if (HWPushHelper.needConnect() && HWPushHelper.shouldTryConnect(context)) {
                HWPushHelper.setConnectTime(context);
                HWPushHelper.registerHuaWeiAssemblePush(context);
            }
            COSPushHelper.doInNetworkChange(context);
            FTOSPushHelper.doInNetworkChange(context);
        }
    }

    /* renamed from: a */
    public static boolean m15842a() {
        return f10185a;
    }

    public void onReceive(Context context, Intent intent) {
        if (!this.f10188b) {
            f10184a.execute(new C4928a(this, context));
        }
    }
}
