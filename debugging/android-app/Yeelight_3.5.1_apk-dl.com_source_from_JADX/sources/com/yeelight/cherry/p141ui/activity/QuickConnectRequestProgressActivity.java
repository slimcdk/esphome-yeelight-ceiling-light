package com.yeelight.cherry.p141ui.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.yeelight.cherry.C12228R$layout;
import com.yeelight.yeelib.p142ui.activity.BaseActivity;
import com.yeelight.yeelib.p142ui.view.CommonTitleBar;
import p051j4.C9193k;

/* renamed from: com.yeelight.cherry.ui.activity.QuickConnectRequestProgressActivity */
public class QuickConnectRequestProgressActivity extends BaseActivity {
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static String f11211b = "QuickConnectRequestProgressActivity";

    /* renamed from: c */
    public static final /* synthetic */ int f11212c = 0;

    /* renamed from: a */
    private Handler f11213a = new Handler(new C5611a());
    @BindView(2131297516)
    TextView mSubView;
    @BindView(2131297591)
    CommonTitleBar mTitleBar;
    @BindView(2131297589)
    TextView mTitleView;

    /* renamed from: com.yeelight.cherry.ui.activity.QuickConnectRequestProgressActivity$a */
    class C5611a implements Handler.Callback {
        C5611a() {
        }

        public boolean handleMessage(Message message) {
            if (message.what != 1 || QuickConnectRequestProgressActivity.this.isFinishing()) {
                return false;
            }
            String unused = QuickConnectRequestProgressActivity.f11211b;
            Intent intent = new Intent(QuickConnectRequestProgressActivity.this, MainActivity.class);
            intent.addFlags(67108864);
            QuickConnectRequestProgressActivity.this.startActivity(intent);
            QuickConnectRequestProgressActivity.this.finish();
            return false;
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.QuickConnectRequestProgressActivity$b */
    class C5612b implements View.OnClickListener {
        C5612b() {
        }

        public void onClick(View view) {
            QuickConnectRequestProgressActivity.this.finish();
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo35653P();
        C9193k.m22157h(true, this);
        setContentView(C12228R$layout.activity_quick_connect_request_progress);
        ButterKnife.bind((Activity) this);
        this.mTitleBar.mo36195a("", new C5612b(), (View.OnClickListener) null);
        this.mTitleView.setText(2131755139);
        this.mSubView.setText(2131755141);
        this.f11213a.sendEmptyMessageDelayed(1, 15000);
    }

    /* access modifiers changed from: protected */
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (intent != null) {
            Handler handler = this.f11213a;
            if (handler != null) {
                handler.removeMessages(1);
            }
            boolean booleanExtra = intent.getBooleanExtra("request_flag", false);
            String stringExtra = intent.getStringExtra("com.yeelight.cherry.device_id");
            StringBuilder sb = new StringBuilder();
            sb.append("onNewIntent requestFlag = ");
            sb.append(booleanExtra);
            sb.append(", deviceId = ");
            sb.append(stringExtra);
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
