package com.yeelight.cherry.p177ui.activity;

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
import com.yeelight.cherry.C11748R$layout;
import com.yeelight.yeelib.p150c.p151i.C4198d;
import com.yeelight.yeelib.p150c.p151i.C4200i;
import com.yeelight.yeelib.p152f.C4257w;
import com.yeelight.yeelib.p186e.C9768c;
import com.yeelight.yeelib.p194ui.activity.BaseActivity;
import com.yeelight.yeelib.p194ui.view.CommonTitleBar;
import com.yeelight.yeelib.p194ui.view.ConnectCircleView;
import com.yeelight.yeelib.utils.C10547m;
import com.yeelight.yeelib.utils.C4308b;

/* renamed from: com.yeelight.cherry.ui.activity.BleMeshConnectActivity */
public class BleMeshConnectActivity extends BaseActivity implements C9768c {

    /* renamed from: e */
    private static final String f10349e = BleMeshConnectActivity.class.getSimpleName();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C4198d f10350b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public int f10351c = 0;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public Handler f10352d = new Handler(new C5004a());
    @BindView(2131296432)
    Button mBtnRetry;
    @BindView(2131297112)
    ConnectCircleView mCircleView;
    @BindView(2131296665)
    ImageView mFailedLayout;
    @BindView(2131297118)
    RelativeLayout mProgressLayout;
    @BindView(2131297120)
    TextView mProgressView;
    @BindView(2131297361)
    TextView mSubView;
    @BindView(2131297424)
    CommonTitleBar mTitleBar;
    @BindView(2131297422)
    TextView mTitleView;

    /* renamed from: com.yeelight.cherry.ui.activity.BleMeshConnectActivity$a */
    class C5004a implements Handler.Callback {
        C5004a() {
        }

        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                if (BleMeshConnectActivity.this.f10351c < 6) {
                    BleMeshConnectActivity.m15995X(BleMeshConnectActivity.this);
                    BleMeshConnectActivity.this.f10352d.sendEmptyMessageDelayed(1, 1000);
                }
                if (BleMeshConnectActivity.this.f10351c >= 8 && BleMeshConnectActivity.this.f10351c < 10) {
                    BleMeshConnectActivity.m15995X(BleMeshConnectActivity.this);
                    BleMeshConnectActivity.this.f10352d.sendEmptyMessageDelayed(1, 1000);
                }
                BleMeshConnectActivity.this.mProgressView.setText(String.format("%d%%", new Object[]{Integer.valueOf(BleMeshConnectActivity.this.f10351c * 10)}));
                if (BleMeshConnectActivity.this.f10351c == 10) {
                    BleMeshConnectActivity.this.f10352d.sendEmptyMessage(2);
                }
            } else if (i == 2) {
                BleMeshConnectActivity.this.mCircleView.setComplete(true);
                BleMeshConnectActivity.this.mTitleView.setText(2131755138);
                BleMeshConnectActivity.this.mSubView.setText(2131755140);
                if (BleMeshConnectActivity.this.f10350b instanceof C4200i) {
                    BleMeshConnectActivity.this.m15999b0();
                } else {
                    BleMeshConnectActivity.this.finish();
                }
            }
            return false;
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.BleMeshConnectActivity$b */
    class C5005b implements View.OnClickListener {
        C5005b() {
        }

        public void onClick(View view) {
            BleMeshConnectActivity.this.finish();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.BleMeshConnectActivity$c */
    class C5006c implements View.OnClickListener {
        C5006c() {
        }

        public void onClick(View view) {
            BleMeshConnectActivity.this.mBtnRetry.setVisibility(8);
            BleMeshConnectActivity.this.mTitleView.setText(2131755081);
            BleMeshConnectActivity.this.mSubView.setText(2131755135);
            BleMeshConnectActivity.this.mProgressView.setText("0%");
            BleMeshConnectActivity.this.f10350b.mo23337n();
            BleMeshConnectActivity.this.mCircleView.mo32848b();
            BleMeshConnectActivity.this.mFailedLayout.setVisibility(8);
            BleMeshConnectActivity.this.mProgressLayout.setVisibility(0);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.BleMeshConnectActivity$d */
    class C5007d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ int f10356a;

        /* renamed from: b */
        final /* synthetic */ int f10357b;

        C5007d(int i, int i2) {
            this.f10356a = i;
            this.f10357b = i2;
        }

        public void run() {
            int i = this.f10356a;
            if (i == 0) {
                BleMeshConnectActivity.this.mBtnRetry.setVisibility(0);
                BleMeshConnectActivity.this.mCircleView.mo32849c();
                BleMeshConnectActivity.this.mProgressLayout.setVisibility(4);
                BleMeshConnectActivity.this.mFailedLayout.setVisibility(0);
                int unused = BleMeshConnectActivity.this.f10351c = 0;
                int i2 = this.f10357b;
                BleMeshConnectActivity.this.mTitleView.setText(2131755319);
                BleMeshConnectActivity.this.mSubView.setText(2131755136);
            } else if (i == 2) {
                BleMeshConnectActivity.this.mTitleView.setText(2131755081);
                BleMeshConnectActivity.this.mSubView.setText(2131755555);
                BleMeshConnectActivity.this.f10352d.sendEmptyMessage(1);
            } else if (i == 11) {
                int unused2 = BleMeshConnectActivity.this.f10351c = 8;
                BleMeshConnectActivity.this.f10352d.sendEmptyMessageDelayed(1, 200);
            }
        }
    }

    /* renamed from: X */
    static /* synthetic */ int m15995X(BleMeshConnectActivity bleMeshConnectActivity) {
        int i = bleMeshConnectActivity.f10351c;
        bleMeshConnectActivity.f10351c = i + 1;
        return i;
    }

    /* access modifiers changed from: private */
    /* renamed from: b0 */
    public void m15999b0() {
        this.mCircleView.mo32849c();
        C4257w.m11947l0().mo23661c0(true, true, this.f10350b.mo23372G());
        if (!isFinishing()) {
            startActivity(new Intent(this, QuickConnectRequestProgressActivity.class));
            finish();
        }
    }

    public void onConnectionStateChanged(int i, int i2) {
        "NewConnectActivity, onConnectionStateChanged, new state: " + i2;
        runOnUiThread(new C5007d(i2, i));
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo32193P();
        getWindow().addFlags(128);
        setContentView(C11748R$layout.activity_ble_mesh_connect);
        ButterKnife.bind((Activity) this);
        C10547m.m25758h(true, this);
        setTitleBarPadding(this.mTitleBar);
        this.mTitleBar.mo32825a("", new C5005b(), (View.OnClickListener) null);
        Intent intent = getIntent();
        if (!intent.hasExtra("com.yeelight.cherry.device_id")) {
            C4308b.m12141t(f10349e, "Activity has not device id", false);
            finish();
            return;
        }
        C4198d h0 = C4257w.m11945h0(intent.getStringExtra("com.yeelight.cherry.device_id"));
        this.f10350b = h0;
        if (h0 == null) {
            finish();
            return;
        }
        if (h0.mo23299A() == 0) {
            this.f10350b.mo23337n();
        }
        this.mBtnRetry.setOnClickListener(new C5006c());
        this.mTitleView.setText(2131755081);
        this.mSubView.setText(2131755135);
        this.mProgressView.setText("0%");
        this.mBtnRetry.setVisibility(8);
        this.mFailedLayout.setVisibility(8);
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        C4198d dVar = this.f10350b;
        if (dVar != null) {
            dVar.mo23319V0(this);
        }
        mo32192M(this);
    }

    public void onLocalConnected() {
    }

    public void onLocalDisconnected() {
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        this.f10352d.removeCallbacksAndMessages((Object) null);
        this.f10350b.mo23319V0(this);
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        this.f10350b.mo23358z0(this);
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        if (this.f10350b.mo23331k0()) {
            m15999b0();
        }
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
    }
}
