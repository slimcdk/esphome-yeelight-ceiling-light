package com.yeelight.cherry.p141ui.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.yeelight.cherry.C12228R$layout;
import com.yeelight.yeelib.device.base.C3010c;
import com.yeelight.yeelib.device.base.C3012e;
import com.yeelight.yeelib.managers.YeelightDeviceManager;
import com.yeelight.yeelib.p142ui.activity.BaseActivity;
import com.yeelight.yeelib.p142ui.view.CommonTitleBar;
import com.yeelight.yeelib.p142ui.view.ConnectCircleView;
import com.yeelight.yeelib.utils.AppUtils;
import p051j4.C9193k;
import p237z3.C12143c;

/* renamed from: com.yeelight.cherry.ui.activity.BleMeshConnectActivity */
public class BleMeshConnectActivity extends BaseActivity implements C12143c {

    /* renamed from: d */
    private static final String f9893d = "BleMeshConnectActivity";
    /* access modifiers changed from: private */

    /* renamed from: a */
    public C3010c f9894a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public int f9895b = 0;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public Handler f9896c = new Handler(new C5049a());
    @BindView(2131296490)
    Button mBtnRetry;
    @BindView(2131297245)
    ConnectCircleView mCircleView;
    @BindView(2131296759)
    ImageView mFailedLayout;
    @BindView(2131297251)
    RelativeLayout mProgressLayout;
    @BindView(2131297253)
    TextView mProgressView;
    @BindView(2131297516)
    TextView mSubView;
    @BindView(2131297591)
    CommonTitleBar mTitleBar;
    @BindView(2131297589)
    TextView mTitleView;

    /* renamed from: com.yeelight.cherry.ui.activity.BleMeshConnectActivity$a */
    class C5049a implements Handler.Callback {
        C5049a() {
        }

        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                if (BleMeshConnectActivity.this.f9895b < 6) {
                    BleMeshConnectActivity.m15849X(BleMeshConnectActivity.this);
                    BleMeshConnectActivity.this.f9896c.sendEmptyMessageDelayed(1, 1000);
                }
                if (BleMeshConnectActivity.this.f9895b >= 8 && BleMeshConnectActivity.this.f9895b < 10) {
                    BleMeshConnectActivity.m15849X(BleMeshConnectActivity.this);
                    BleMeshConnectActivity.this.f9896c.sendEmptyMessageDelayed(1, 1000);
                }
                BleMeshConnectActivity.this.mProgressView.setText(String.format("%d%%", new Object[]{Integer.valueOf(BleMeshConnectActivity.this.f9895b * 10)}));
                if (BleMeshConnectActivity.this.f9895b == 10) {
                    BleMeshConnectActivity.this.f9896c.sendEmptyMessage(2);
                }
            } else if (i == 2) {
                BleMeshConnectActivity.this.mCircleView.setComplete(true);
                BleMeshConnectActivity.this.mTitleView.setText(2131755139);
                BleMeshConnectActivity.this.mSubView.setText(2131755141);
                if (BleMeshConnectActivity.this.f9894a instanceof C3012e) {
                    BleMeshConnectActivity.this.m15853b0();
                } else {
                    BleMeshConnectActivity.this.finish();
                }
            }
            return false;
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.BleMeshConnectActivity$b */
    class C5050b implements View.OnClickListener {
        C5050b() {
        }

        public void onClick(View view) {
            BleMeshConnectActivity.this.finish();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.BleMeshConnectActivity$c */
    class C5051c implements View.OnClickListener {
        C5051c() {
        }

        public void onClick(View view) {
            BleMeshConnectActivity.this.mBtnRetry.setVisibility(8);
            BleMeshConnectActivity.this.mTitleView.setText(2131755080);
            BleMeshConnectActivity.this.mSubView.setText(2131755136);
            BleMeshConnectActivity.this.mProgressView.setText("0%");
            BleMeshConnectActivity.this.f9894a.mo23151n();
            BleMeshConnectActivity.this.mCircleView.mo36218b();
            BleMeshConnectActivity.this.mFailedLayout.setVisibility(8);
            BleMeshConnectActivity.this.mProgressLayout.setVisibility(0);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.BleMeshConnectActivity$d */
    class C5052d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ int f9900a;

        /* renamed from: b */
        final /* synthetic */ int f9901b;

        C5052d(int i, int i2) {
            this.f9900a = i;
            this.f9901b = i2;
        }

        public void run() {
            int i = this.f9900a;
            if (i == 0) {
                BleMeshConnectActivity.this.mBtnRetry.setVisibility(0);
                BleMeshConnectActivity.this.mCircleView.mo36219c();
                BleMeshConnectActivity.this.mProgressLayout.setVisibility(4);
                BleMeshConnectActivity.this.mFailedLayout.setVisibility(0);
                int unused = BleMeshConnectActivity.this.f9895b = 0;
                int i2 = this.f9901b;
                BleMeshConnectActivity.this.mTitleView.setText(2131755323);
                BleMeshConnectActivity.this.mSubView.setText(2131755137);
            } else if (i == 2) {
                BleMeshConnectActivity.this.mTitleView.setText(2131755080);
                BleMeshConnectActivity.this.mSubView.setText(2131755559);
                BleMeshConnectActivity.this.f9896c.sendEmptyMessage(1);
            } else if (i == 11) {
                int unused2 = BleMeshConnectActivity.this.f9895b = 8;
                BleMeshConnectActivity.this.f9896c.sendEmptyMessageDelayed(1, 200);
            }
        }
    }

    /* renamed from: X */
    static /* synthetic */ int m15849X(BleMeshConnectActivity bleMeshConnectActivity) {
        int i = bleMeshConnectActivity.f9895b;
        bleMeshConnectActivity.f9895b = i + 1;
        return i;
    }

    /* access modifiers changed from: private */
    /* renamed from: b0 */
    public void m15853b0() {
        this.mCircleView.mo36219c();
        YeelightDeviceManager.m7800o0().mo23286e0(true, true, this.f9894a.mo23185G());
        if (!isFinishing()) {
            startActivity(new Intent(this, QuickConnectRequestProgressActivity.class));
            finish();
        }
    }

    public void onConnectionStateChanged(int i, int i2) {
        StringBuilder sb = new StringBuilder();
        sb.append("NewConnectActivity, onConnectionStateChanged, new state: ");
        sb.append(i2);
        runOnUiThread(new C5052d(i2, i));
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo35653P();
        getWindow().addFlags(128);
        setContentView(C12228R$layout.activity_ble_mesh_connect);
        ButterKnife.bind((Activity) this);
        C9193k.m22157h(true, this);
        setTitleBarPadding(this.mTitleBar);
        this.mTitleBar.mo36195a("", new C5050b(), (View.OnClickListener) null);
        Intent intent = getIntent();
        if (!intent.hasExtra("com.yeelight.cherry.device_id")) {
            AppUtils.m8302w(f9893d, "Activity has not device id", false);
            finish();
            return;
        }
        C3010c j0 = YeelightDeviceManager.m7794j0(intent.getStringExtra("com.yeelight.cherry.device_id"));
        this.f9894a = j0;
        if (j0 == null) {
            finish();
            return;
        }
        if (j0.mo23113A() == 0) {
            this.f9894a.mo23151n();
        }
        this.mBtnRetry.setOnClickListener(new C5051c());
        this.mTitleView.setText(2131755080);
        this.mSubView.setText(2131755136);
        this.mProgressView.setText("0%");
        this.mBtnRetry.setVisibility(8);
        this.mFailedLayout.setVisibility(8);
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        C3010c cVar = this.f9894a;
        if (cVar != null) {
            cVar.mo23133V0(this);
        }
        mo35652M(this);
    }

    public void onLocalConnected() {
    }

    public void onLocalDisconnected() {
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        this.f9896c.removeCallbacksAndMessages((Object) null);
        this.f9894a.mo23133V0(this);
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        this.f9894a.mo23171z0(this);
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        if (this.f9894a.mo23145k0()) {
            m15853b0();
        }
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
    }
}
