package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import p011c.p012a.p019b.p020a.p021i.C0487l;
import p011c.p012a.p019b.p020a.p021i.C0492p;
import p011c.p012a.p019b.p020a.p021i.p027w.C0555a;

public class AlarmManagerSchedulerBroadcastReceiver extends BroadcastReceiver {
    /* renamed from: a */
    static /* synthetic */ void m3492a() {
    }

    public void onReceive(Context context, Intent intent) {
        String queryParameter = intent.getData().getQueryParameter("backendName");
        String queryParameter2 = intent.getData().getQueryParameter("extras");
        int intValue = Integer.valueOf(intent.getData().getQueryParameter("priority")).intValue();
        int i = intent.getExtras().getInt("attemptNumber");
        C0492p.m146f(context);
        C0487l.C0488a a = C0487l.m131a();
        a.mo8442b(queryParameter);
        a.mo8444d(C0555a.m317b(intValue));
        if (queryParameter2 != null) {
            a.mo8443c(Base64.decode(queryParameter2, 0));
        }
        C0492p.m144c().mo8472e().mo10262g(a.mo8441a(), i, C1330b.m3496b());
    }
}
