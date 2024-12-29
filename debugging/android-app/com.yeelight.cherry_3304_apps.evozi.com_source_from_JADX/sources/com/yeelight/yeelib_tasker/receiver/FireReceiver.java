package com.yeelight.yeelib_tasker.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.widget.Toast;
import com.yeelight.yeelib.R$string;
import com.yeelight.yeelib.p152f.C9775d;
import com.yeelight.yeelib.p153g.C9840j;
import com.yeelight.yeelib.p185d.C7563a;
import com.yeelight.yeelib.p194ui.activity.BaseActivity;
import com.yeelight.yeelib.utils.C4311i;
import com.yeelight.yeelib_tasker.p195c.C10571a;
import com.yeelight.yeelib_tasker.p195c.C10572b;

public final class FireReceiver extends BroadcastReceiver {

    /* renamed from: com.yeelight.yeelib_tasker.receiver.FireReceiver$a */
    class C10573a implements C9775d.C9783h {

        /* renamed from: a */
        final /* synthetic */ Context f20205a;

        /* renamed from: com.yeelight.yeelib_tasker.receiver.FireReceiver$a$a */
        class C10574a extends Thread {

            /* renamed from: com.yeelight.yeelib_tasker.receiver.FireReceiver$a$a$a */
            class C10575a implements Runnable {
                C10575a() {
                }

                public void run() {
                    Context context = C10573a.this.f20205a;
                    Toast.makeText(context, context.getText(R$string.account_login_ouath_failed_info), 0).show();
                }
            }

            C10574a() {
            }

            public void run() {
                new Handler(Looper.getMainLooper()).post(new C10575a());
            }
        }

        C10573a(FireReceiver fireReceiver, Context context) {
            this.f20205a = context;
        }

        public void tokenOauthFailed() {
            new C10574a().start();
            BaseActivity.m24384U(this.f20205a);
        }
    }

    /* renamed from: a */
    private boolean m25880a(String str, String str2, String str3) {
        return C7563a.valueOf(str2) != C7563a.COMMAND || !TextUtils.isEmpty(str3);
    }

    public void onReceive(Context context, Intent intent) {
        if ("com.twofortyfouram.locale.intent.action.FIRE_SETTING".equals(intent.getAction())) {
            C10571a.m25876a(intent);
            Bundle bundleExtra = intent.getBundleExtra("com.twofortyfouram.locale.intent.extra.BUNDLE");
            C10571a.m25877b(bundleExtra);
            if (C10572b.m25879b(bundleExtra)) {
                String string = bundleExtra.getString("com.yeelight.tasker.extra.DEVICE_TYPE");
                if (string == null || string.isEmpty()) {
                    string = "type_device";
                }
                String string2 = bundleExtra.getString("com.yeelight.tasker.extra.DEVICE_ID");
                String a = C7563a.m22345a(bundleExtra.getString("com.yeelight.tasker.extra.ACTION"));
                String string3 = bundleExtra.getString("com.yeelight.tasker.extra.PARAM");
                "Received bundle, device id: " + string2;
                "Received bundle, action: " + a;
                "Received bundle, param: " + string3;
                if (m25880a(string2, a, string3)) {
                    C9840j jVar = new C9840j(string, string2, C7563a.valueOf(a), string3);
                    C4311i.m12162m(a);
                    C9775d.m23684t().mo31613k(jVar, new C10573a(this, context));
                    return;
                }
                Toast.makeText(context, "Invalid param, please double check your configuration!", 1).show();
            }
        }
    }
}
