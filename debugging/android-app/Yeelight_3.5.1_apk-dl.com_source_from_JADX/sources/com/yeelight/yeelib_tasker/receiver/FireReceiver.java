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
import com.yeelight.yeelib.interaction.ActionType;
import com.yeelight.yeelib.managers.C8263d;
import com.yeelight.yeelib.models.C8316i;
import com.yeelight.yeelib.p142ui.activity.BaseActivity;
import p051j4.C3279g;
import p185m4.C9547a;
import p185m4.C9548b;

public final class FireReceiver extends BroadcastReceiver {

    /* renamed from: com.yeelight.yeelib_tasker.receiver.FireReceiver$a */
    class C8901a implements C8263d.C8271h {

        /* renamed from: a */
        final /* synthetic */ Context f16350a;

        /* renamed from: com.yeelight.yeelib_tasker.receiver.FireReceiver$a$a */
        class C8902a extends Thread {

            /* renamed from: com.yeelight.yeelib_tasker.receiver.FireReceiver$a$a$a */
            class C8903a implements Runnable {
                C8903a() {
                }

                public void run() {
                    Context context = C8901a.this.f16350a;
                    Toast.makeText(context, context.getText(R$string.account_login_ouath_failed_info), 0).show();
                }
            }

            C8902a() {
            }

            public void run() {
                new Handler(Looper.getMainLooper()).post(new C8903a());
            }
        }

        C8901a(FireReceiver fireReceiver, Context context) {
            this.f16350a = context;
        }

        public void tokenOauthFailed() {
            new C8902a().start();
            BaseActivity.m19947U(this.f16350a);
        }
    }

    /* renamed from: a */
    private boolean m21270a(String str, String str2, String str3) {
        return ActionType.valueOf(str2) != ActionType.COMMAND || !TextUtils.isEmpty(str3);
    }

    public void onReceive(Context context, Intent intent) {
        if ("com.twofortyfouram.locale.intent.action.FIRE_SETTING".equals(intent.getAction())) {
            C9547a.m23216a(intent);
            Bundle bundleExtra = intent.getBundleExtra("com.twofortyfouram.locale.intent.extra.BUNDLE");
            C9547a.m23217b(bundleExtra);
            if (C9548b.m23219b(bundleExtra)) {
                String string = bundleExtra.getString("com.yeelight.tasker.extra.DEVICE_TYPE");
                if (string == null || string.isEmpty()) {
                    string = "type_device";
                }
                String string2 = bundleExtra.getString("com.yeelight.tasker.extra.DEVICE_ID");
                String OPEN_CLSOE_2_ON_OFF = ActionType.OPEN_CLSOE_2_ON_OFF(bundleExtra.getString("com.yeelight.tasker.extra.ACTION"));
                String string3 = bundleExtra.getString("com.yeelight.tasker.extra.PARAM");
                StringBuilder sb = new StringBuilder();
                sb.append("Received bundle, device id: ");
                sb.append(string2);
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Received bundle, action: ");
                sb2.append(OPEN_CLSOE_2_ON_OFF);
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Received bundle, param: ");
                sb3.append(string3);
                if (m21270a(string2, OPEN_CLSOE_2_ON_OFF, string3)) {
                    C8316i iVar = new C8316i(string, string2, ActionType.valueOf(OPEN_CLSOE_2_ON_OFF), string3);
                    C3279g.m8813m(OPEN_CLSOE_2_ON_OFF);
                    C8263d.m19484t().mo35189k(iVar, new C8901a(this, context));
                    return;
                }
                Toast.makeText(context, "Invalid param, please double check your configuration!", 1).show();
            }
        }
    }
}
