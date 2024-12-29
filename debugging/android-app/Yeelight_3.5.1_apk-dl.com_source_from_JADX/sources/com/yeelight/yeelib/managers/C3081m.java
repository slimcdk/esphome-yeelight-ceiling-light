package com.yeelight.yeelib.managers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import p051j4.C9197p;
import p134c4.C4007b;

/* renamed from: com.yeelight.yeelib.managers.m */
public class C3081m {
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final String f4901b = "m";

    /* renamed from: c */
    private static C3081m f4902c;

    /* renamed from: a */
    private BroadcastReceiver f4903a = new C3082a(this);

    /* renamed from: com.yeelight.yeelib.managers.m$a */
    class C3082a extends BroadcastReceiver {

        /* renamed from: com.yeelight.yeelib.managers.m$a$a */
        class C3083a implements C4007b<String> {
            C3083a(C3082a aVar) {
            }

            /* renamed from: b */
            public void mo23338a(String str) {
                StringBuilder sb = new StringBuilder();
                sb.append("Send miot error log, onResponse: ");
                sb.append(str);
            }

            public void onFailure(int i, String str) {
                StringBuilder sb = new StringBuilder();
                sb.append("Send miot error log, onFailure, exception: ");
                sb.append(str);
            }
        }

        C3082a(C3081m mVar) {
        }

        public void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            action.hashCode();
            if (action.equals("com.yeelight.cherry.action.MIOT_SERVICE_CRASHED")) {
                String unused = C3081m.f4901b;
                C9197p.m22174g(new C3083a(this), intent.getStringExtra("exception"));
            }
        }
    }

    private C3081m(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.yeelight.cherry.action.MIOT_SERVICE_CRASHED");
        context.registerReceiver(this.f4903a, intentFilter);
    }

    /* renamed from: b */
    public static C3081m m8085b(Context context) {
        synchronized (C3081m.class) {
            if (f4902c == null) {
                f4902c = new C3081m(context);
            }
        }
        return f4902c;
    }
}
