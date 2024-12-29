package com.yeelight.yeelib.p152f;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.yeelight.yeelib.p187h.p189h.C9874b;
import com.yeelight.yeelib.utils.C10551r;

/* renamed from: com.yeelight.yeelib.f.m */
public class C4232m {
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final String f7345b = "m";

    /* renamed from: c */
    private static C4232m f7346c;

    /* renamed from: a */
    private BroadcastReceiver f7347a = new C4233a(this);

    /* renamed from: com.yeelight.yeelib.f.m$a */
    class C4233a extends BroadcastReceiver {

        /* renamed from: com.yeelight.yeelib.f.m$a$a */
        class C4234a implements C9874b<String> {
            C4234a(C4233a aVar) {
            }

            /* renamed from: b */
            public void mo23475a(String str) {
                "Send miot error log, onResponse: " + str;
            }

            public void onFailure(int i, String str) {
                "Send miot error log, onFailure, exception: " + str;
            }
        }

        C4233a(C4232m mVar) {
        }

        public void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            if (((action.hashCode() == 1069275557 && action.equals("com.yeelight.cherry.action.MIOT_SERVICE_CRASHED")) ? (char) 0 : 65535) == 0) {
                String unused = C4232m.f7345b;
                C10551r.m25775g(new C4234a(this), intent.getStringExtra("exception"));
            }
        }
    }

    private C4232m(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.yeelight.cherry.action.MIOT_SERVICE_CRASHED");
        context.registerReceiver(this.f7347a, intentFilter);
    }

    /* renamed from: b */
    public static C4232m m11775b(Context context) {
        synchronized (C4232m.class) {
            if (f7346c == null) {
                f7346c = new C4232m(context);
            }
        }
        return f7346c;
    }
}
