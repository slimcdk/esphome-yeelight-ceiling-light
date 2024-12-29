package com.xiaomi.push.service.receivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.xiaomi.channel.commonutils.logger.C4408b;
import com.xiaomi.push.C4673eu;
import com.xiaomi.push.service.C4916bk;
import com.xiaomi.push.service.ServiceClient;
import com.xiaomi.push.service.XMPushService;

public class PingReceiver extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        C4408b.m12482c(intent.getPackage() + " is the package name");
        if (!XMPushService.m15085e()) {
            if (!C4916bk.f9594p.equals(intent.getAction())) {
                C4408b.m12464a("cancel the old ping timer");
                C4673eu.m13753a();
            } else if (TextUtils.equals(context.getPackageName(), intent.getPackage())) {
                C4408b.m12482c("Ping XMChannelService on timer");
                try {
                    Intent intent2 = new Intent(context, XMPushService.class);
                    intent2.putExtra("time_stamp", System.currentTimeMillis());
                    intent2.setAction("com.xiaomi.push.timer");
                    ServiceClient.getInstance(context).startServiceSafely(intent2);
                } catch (Exception e) {
                    C4408b.m12478a((Throwable) e);
                }
            }
        }
    }
}
