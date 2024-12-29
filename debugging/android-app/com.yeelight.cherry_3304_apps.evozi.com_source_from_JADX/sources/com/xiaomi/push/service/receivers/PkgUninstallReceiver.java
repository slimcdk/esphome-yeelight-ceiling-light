package com.xiaomi.push.service.receivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.xiaomi.channel.commonutils.logger.C3989b;
import com.xiaomi.push.service.C4876ax;
import com.xiaomi.push.service.C4881bb;
import com.xiaomi.push.service.XMPushService;

public class PkgUninstallReceiver extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        if (intent != null && "android.intent.action.PACKAGE_REMOVED".equals(intent.getAction())) {
            boolean z = intent.getExtras().getBoolean("android.intent.extra.REPLACING");
            Uri data = intent.getData();
            if (data != null && !z) {
                try {
                    Intent intent2 = new Intent(context, XMPushService.class);
                    intent2.setAction(C4876ax.f10057a);
                    intent2.putExtra("uninstall_pkg_name", data.getEncodedSchemeSpecificPart());
                    C4881bb.m15666a(context).mo25943a(intent2);
                } catch (Exception e) {
                    C3989b.m10678a((Throwable) e);
                }
            }
        }
    }
}
