package com.xiaomi.push.service.receivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.xiaomi.channel.commonutils.logger.C3989b;
import com.xiaomi.push.service.C4876ax;
import com.xiaomi.push.service.C4881bb;
import com.xiaomi.push.service.XMPushService;

public class PkgDataClearedReceiver extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        if (intent != null && "android.intent.action.PACKAGE_DATA_CLEARED".equals(intent.getAction()) && intent.getData() != null) {
            String encodedSchemeSpecificPart = intent.getData().getEncodedSchemeSpecificPart();
            if (!TextUtils.isEmpty(encodedSchemeSpecificPart)) {
                try {
                    Intent intent2 = new Intent(context, XMPushService.class);
                    intent2.setAction(C4876ax.f10058b);
                    intent2.putExtra("data_cleared_pkg_name", encodedSchemeSpecificPart);
                    C4881bb.m15666a(context).mo25943a(intent2);
                } catch (Exception e) {
                    C3989b.m10681d("data cleared broadcast error: " + e);
                }
            }
        }
    }
}
