package com.xiaomi.push.service.receivers;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.xiaomi.channel.commonutils.logger.C4408b;
import com.xiaomi.mipush.sdk.C4456af;
import com.xiaomi.mipush.sdk.C4465ao;
import com.xiaomi.mipush.sdk.C4472au;
import com.xiaomi.mipush.sdk.C4475b;
import com.xiaomi.mipush.sdk.COSPushHelper;
import com.xiaomi.mipush.sdk.FTOSPushHelper;
import com.xiaomi.mipush.sdk.HWPushHelper;
import com.xiaomi.mipush.sdk.MiPushClient;
import com.xiaomi.push.C4551bj;
import com.xiaomi.push.C4750hb;
import com.xiaomi.push.C4832o;
import com.xiaomi.push.service.ServiceClient;

public class NetworkStatusReceiver extends BroadcastReceiver {

    /* renamed from: a */
    private static boolean f9732a = false;

    /* renamed from: b */
    private boolean f9733b;

    public NetworkStatusReceiver() {
        this.f9733b = false;
        this.f9733b = true;
    }

    public NetworkStatusReceiver(Object obj) {
        this.f9733b = false;
        f9732a = true;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m15663a(Context context) {
        if (!C4465ao.m12646a(context).mo28653a() && C4475b.m12705a(context).mo28694c() && !C4475b.m12705a(context).mo28697f()) {
            try {
                Intent intent = new Intent();
                intent.setComponent(new ComponentName(context, "com.xiaomi.push.service.XMPushService"));
                intent.setAction("com.xiaomi.push.network_status_changed");
                ServiceClient.getInstance(context).startServiceSafely(intent);
            } catch (Exception e) {
                C4408b.m12478a((Throwable) e);
            }
        }
        C4750hb.m14138a(context);
        if (C4551bj.m13000b(context) && C4465ao.m12646a(context).mo28673b()) {
            C4465ao.m12646a(context).mo28675c();
        }
        if (C4551bj.m13000b(context)) {
            if ("syncing".equals(C4456af.m12606a(context).mo28646a(C4472au.DISABLE_PUSH))) {
                MiPushClient.disablePush(context);
            }
            if ("syncing".equals(C4456af.m12606a(context).mo28646a(C4472au.ENABLE_PUSH))) {
                MiPushClient.enablePush(context);
            }
            if ("syncing".equals(C4456af.m12606a(context).mo28646a(C4472au.UPLOAD_HUAWEI_TOKEN))) {
                MiPushClient.syncAssemblePushToken(context);
            }
            if ("syncing".equals(C4456af.m12606a(context).mo28646a(C4472au.UPLOAD_FCM_TOKEN))) {
                MiPushClient.syncAssembleFCMPushToken(context);
            }
            if ("syncing".equals(C4456af.m12606a(context).mo28646a(C4472au.UPLOAD_COS_TOKEN))) {
                MiPushClient.syncAssembleCOSPushToken(context);
            }
            if ("syncing".equals(C4456af.m12606a(context).mo28646a(C4472au.UPLOAD_FTOS_TOKEN))) {
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
    public static boolean m15665a() {
        return f9732a;
    }

    public void onReceive(Context context, Intent intent) {
        if (!this.f9733b) {
            C4832o.m15025a().post(new C4982a(this, context));
        }
    }
}
