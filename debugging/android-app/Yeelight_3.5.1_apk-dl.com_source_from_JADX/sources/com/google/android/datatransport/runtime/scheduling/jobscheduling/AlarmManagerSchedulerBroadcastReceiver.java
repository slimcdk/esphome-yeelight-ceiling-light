package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import p035g.C3198o;
import p035g.C3203s;
import p068n.C9701b;
import p087r.C3621a;

public class AlarmManagerSchedulerBroadcastReceiver extends BroadcastReceiver {
    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ void m545b() {
    }

    public void onReceive(Context context, Intent intent) {
        String queryParameter = intent.getData().getQueryParameter("backendName");
        String queryParameter2 = intent.getData().getQueryParameter("extras");
        int intValue = Integer.valueOf(intent.getData().getQueryParameter("priority")).intValue();
        int i = intent.getExtras().getInt("attemptNumber");
        C3203s.m8625f(context);
        C3198o.C3199a d = C3198o.m8609a().mo23737b(queryParameter).mo23739d(C3621a.m10302b(intValue));
        if (queryParameter2 != null) {
            d.mo23738c(Base64.decode(queryParameter2, 0));
        }
        C3203s.m8623c().mo23767e().mo24100v(d.mo23736a(), i, C9701b.f17501a);
    }
}
