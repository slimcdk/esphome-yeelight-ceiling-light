package com.xiaomi.push.mpcd.receivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.xiaomi.push.C4616dw;

public class BroadcastActionsReceiver extends BroadcastReceiver {

    /* renamed from: a */
    private C4616dw f9850a;

    public BroadcastActionsReceiver(C4616dw dwVar) {
        this.f9850a = dwVar;
    }

    public void onReceive(Context context, Intent intent) {
        C4616dw dwVar = this.f9850a;
        if (dwVar != null) {
            dwVar.mo24926a(context, intent);
        }
    }
}
