package com.yeelight.cherry.p177ui.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.yeelight.cherry.C11748R$layout;
import com.yeelight.yeelib.p194ui.activity.BaseActivity;
import com.yeelight.yeelib.p194ui.view.CommonTitleBar;
import com.yeelight.yeelib.utils.C10547m;

/* renamed from: com.yeelight.cherry.ui.activity.QuickConnectRequestProgressActivity */
public class QuickConnectRequestProgressActivity extends BaseActivity {
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static String f11648c = QuickConnectRequestProgressActivity.class.getSimpleName();

    /* renamed from: b */
    private Handler f11649b = new Handler(new C5570a());
    @BindView(2131297361)
    TextView mSubView;
    @BindView(2131297424)
    CommonTitleBar mTitleBar;
    @BindView(2131297422)
    TextView mTitleView;

    /* renamed from: com.yeelight.cherry.ui.activity.QuickConnectRequestProgressActivity$a */
    class C5570a implements Handler.Callback {
        C5570a() {
        }

        public boolean handleMessage(Message message) {
            if (message.what != 1 || QuickConnectRequestProgressActivity.this.isFinishing()) {
                return false;
            }
            String unused = QuickConnectRequestProgressActivity.f11648c;
            Intent intent = new Intent(QuickConnectRequestProgressActivity.this, MainActivity.class);
            intent.addFlags(67108864);
            QuickConnectRequestProgressActivity.this.startActivity(intent);
            QuickConnectRequestProgressActivity.this.finish();
            return false;
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.QuickConnectRequestProgressActivity$b */
    class C5571b implements View.OnClickListener {
        C5571b() {
        }

        public void onClick(View view) {
            QuickConnectRequestProgressActivity.this.finish();
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo32193P();
        C10547m.m25758h(true, this);
        setContentView(C11748R$layout.activity_quick_connect_request_progress);
        ButterKnife.bind((Activity) this);
        this.mTitleBar.mo32825a("", new C5571b(), (View.OnClickListener) null);
        this.mTitleView.setText(2131755138);
        this.mSubView.setText(2131755140);
        this.f11649b.sendEmptyMessageDelayed(1, 15000);
    }

    /* access modifiers changed from: protected */
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (intent != null) {
            Handler handler = this.f11649b;
            if (handler != null) {
                handler.removeMessages(1);
            }
            boolean booleanExtra = intent.getBooleanExtra("request_flag", false);
            String stringExtra = intent.getStringExtra("com.yeelight.cherry.device_id");
            "onNewIntent requestFlag = " + booleanExtra + ", deviceId = " + stringExtra;
            if (booleanExtra) {
                if (!isFinishing()) {
                    Intent intent2 = new Intent(this, QuickConnectReNameDeviceActivity.class);
                    intent2.addFlags(67108864);
                    intent2.putExtra("com.yeelight.cherry.device_id", stringExtra);
                    startActivity(intent2);
                } else {
                    return;
                }
            } else if (!isFinishing()) {
                Intent intent3 = new Intent(this, MainActivity.class);
                intent3.addFlags(67108864);
                startActivity(intent3);
            } else {
                return;
            }
            finish();
        }
    }
}
