package com.yeelight.cherry.p177ui.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.p146mi.iot.common.error.IotError;
import com.p146mi.iot.common.handler.CompletedHandler;
import com.yeelight.cherry.C11745R$id;
import com.yeelight.cherry.C11748R$layout;
import com.yeelight.cherry.p177ui.view.CurtainControlView;
import com.yeelight.yeelib.p150c.p151i.C6024e;
import com.yeelight.yeelib.p150c.p183m.C7472y;
import com.yeelight.yeelib.p152f.C4257w;
import com.yeelight.yeelib.p186e.C9770e;
import com.yeelight.yeelib.p194ui.activity.BaseActivity;
import com.yeelight.yeelib.p194ui.view.CommonTitleBar;
import com.yeelight.yeelib.utils.C10547m;
import com.yeelight.yeelib.utils.C10559w;
import com.yeelight.yeelib.utils.C4308b;

/* renamed from: com.yeelight.cherry.ui.activity.CurtainControlActivity */
public class CurtainControlActivity extends BaseActivity implements CurtainControlView.C5963b, C9770e {

    /* renamed from: d */
    private static final String f10652d = CurtainControlActivity.class.getSimpleName();

    /* renamed from: b */
    private C7472y f10653b;

    /* renamed from: c */
    private CompletedHandler f10654c = new C5136a(this);
    @BindView(2131296258)
    CurtainControlView mCurtainView;
    @BindView(2131297424)
    CommonTitleBar mTitleBar;
    @BindView(2131297495)
    TextView mTvProgress;

    /* renamed from: com.yeelight.cherry.ui.activity.CurtainControlActivity$a */
    class C5136a implements CompletedHandler {
        C5136a(CurtainControlActivity curtainControlActivity) {
        }

        public void onFailed(IotError iotError) {
        }

        public void onSucceed() {
        }
    }

    /* renamed from: V */
    private int m16193V() {
        Integer q2 = this.f10653b.mo27617q2();
        if (q2 != null) {
            return q2.intValue();
        }
        return C10559w.m25807c(this.f10653b.mo27788M1() + "CURTAIN_MODE", 1);
    }

    /* renamed from: W */
    public /* synthetic */ void mo26317W(View view) {
        onBackPressed();
    }

    /* renamed from: X */
    public /* synthetic */ void mo26318X(View view) {
        Intent intent = new Intent(this, DeviceSettingActivity.class);
        intent.putExtra("com.yeelight.cherry.device_id", this.f10653b.mo23372G());
        startActivity(intent);
    }

    /* renamed from: a */
    public void mo26319a(int i) {
        "onProgressChange: " + i;
        C7472y yVar = this.f10653b;
        if (yVar != null) {
            yVar.mo28817K2(100 - i);
        }
        this.mTvProgress.setText(i + "%");
    }

    /* renamed from: f */
    public void mo26320f(int i) {
        TextView textView = this.mTvProgress;
        textView.setText(i + "%");
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C11748R$layout.activity_curtain_control);
        C10547m.m25758h(true, this);
        ButterKnife.bind((Activity) this);
        Intent intent = getIntent();
        if (!intent.hasExtra("com.yeelight.cherry.device_id")) {
            C4308b.m12141t(f10652d, "Activity has not device id", false);
            finish();
            return;
        }
        C7472y yVar = (C7472y) C4257w.m11953o0(intent.getStringExtra("com.yeelight.cherry.device_id"));
        this.f10653b = yVar;
        if (yVar == null || !yVar.mo23331k0()) {
            BaseActivity.m24384U(this);
            finish();
            return;
        }
        this.f10653b.mo23365B0(this);
        this.mCurtainView.setOnStatusChangeListener(this);
        this.mTitleBar.mo32825a(this.f10653b.mo23397U(), new C5794y(this), new C5798z(this));
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        C7472y yVar = this.f10653b;
        if (yVar != null) {
            yVar.mo23400W0(this);
        }
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        this.mTitleBar.setTitle(this.f10653b.mo23397U());
        this.mCurtainView.setCurtainMode(m16193V());
        this.mCurtainView.setProgress(this.f10653b.mo27616p2());
        this.mCurtainView.setRouteTime(this.f10653b.mo27620t2());
        TextView textView = this.mTvProgress;
        textView.setText((100 - this.f10653b.mo27616p2()) + "%");
    }

    public void onStatusChange(int i, C6024e eVar) {
        if (i == 67108864) {
            this.mCurtainView.setCurtainMode(m16193V());
        }
    }

    /* access modifiers changed from: protected */
    @OnClick({2131296802, 2131296803, 2131296776})
    public void onViewClick(View view) {
        switch (view.getId()) {
            case C11745R$id.img_close:
                this.f10653b.mo27625y2(2, this.f10654c);
                this.mCurtainView.mo27425e();
                return;
            case C11745R$id.img_open:
                this.f10653b.mo27625y2(1, this.f10654c);
                this.mCurtainView.mo27428k();
                return;
            case C11745R$id.img_pause:
                this.f10653b.mo27625y2(0, this.f10654c);
                this.mCurtainView.mo27429l();
                return;
            default:
                return;
        }
    }
}
