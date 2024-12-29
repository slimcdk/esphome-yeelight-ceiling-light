package com.xiaomi.push.service.receivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.xiaomi.channel.commonutils.logger.C3989b;
import com.xiaomi.push.C4663fc;
import com.xiaomi.push.service.C4870at;
import com.xiaomi.push.service.C4881bb;
import com.xiaomi.push.service.XMPushService;

public class PingReceiver extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        C3989b.m10680c(intent.getPackage() + " is the package name");
        if (!C4870at.f10040o.equals(intent.getAction())) {
            C3989b.m10669a("cancel the old ping timer");
            C4663fc.m14161a();
        } else if (TextUtils.equals(context.getPackageName(), intent.getPackage())) {
            C3989b.m10680c("Ping XMChannelService on timer");
            try {
                Intent intent2 = new Intent(context, XMPushService.class);
                intent2.putExtra("time_stamp", System.currentTimeMillis());
                intent2.setAction("com.xiaomi.push.timer");
                C4881bb.m15666a(context).mo25943a(intent2);
            } catch (Exception e) {
                C3989b.m10678a((Throwable) e);
            }
        }
    }
}
