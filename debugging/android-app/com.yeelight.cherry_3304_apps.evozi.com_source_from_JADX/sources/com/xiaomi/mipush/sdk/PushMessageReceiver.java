package com.xiaomi.mipush.sdk;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.miot.common.ReturnCode;
import com.xiaomi.channel.commonutils.logger.C3989b;
import com.xiaomi.mipush.sdk.MessageHandleService;
import com.xiaomi.push.C4662fb;

public abstract class PushMessageReceiver extends BroadcastReceiver {
    public void onCommandResult(Context context, MiPushCommandMessage miPushCommandMessage) {
    }

    public void onNotificationMessageArrived(Context context, MiPushMessage miPushMessage) {
    }

    public void onNotificationMessageClicked(Context context, MiPushMessage miPushMessage) {
    }

    public final void onReceive(Context context, Intent intent) {
        MessageHandleService.addJob(context.getApplicationContext(), new MessageHandleService.C4020a(intent, this));
        try {
            int intExtra = intent.getIntExtra("eventMessageType", -1);
            if (intExtra == 2000) {
                C4662fb.m14151a(context.getApplicationContext()).mo25059a(context.getPackageName(), intent, (int) ReturnCode.E_ACTION_INVALID, (String) null);
            } else if (intExtra == 6000) {
                C4662fb.m14151a(context.getApplicationContext()).mo25059a(context.getPackageName(), intent, 6005, (String) null);
            }
        } catch (Exception e) {
            C3989b.m10678a((Throwable) e);
        }
    }

    @Deprecated
    public void onReceiveMessage(Context context, MiPushMessage miPushMessage) {
    }

    public void onReceivePassThroughMessage(Context context, MiPushMessage miPushMessage) {
    }

    public void onReceiveRegisterResult(Context context, MiPushCommandMessage miPushCommandMessage) {
    }

    public void onRequirePermissions(Context context, String[] strArr) {
    }
}
