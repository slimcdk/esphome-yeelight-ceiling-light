package com.yeelight.cherry.p141ui.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.p022mi.iot.common.error.IotError;
import com.p022mi.iot.common.handler.CompletedHandler;
import com.yeelight.cherry.C12225R$id;
import com.yeelight.cherry.C12228R$layout;
import com.yeelight.cherry.p141ui.view.CurtainControlView;
import com.yeelight.yeelib.device.base.DeviceStatusBase;
import com.yeelight.yeelib.managers.YeelightDeviceManager;
import com.yeelight.yeelib.p142ui.activity.BaseActivity;
import com.yeelight.yeelib.p142ui.view.CommonTitleBar;
import com.yeelight.yeelib.utils.AppUtils;
import p051j4.C3283v;
import p051j4.C9193k;
import p223w3.C11911z;
import p237z3.C12145e;

/* renamed from: com.yeelight.cherry.ui.activity.CurtainControlActivity */
public class CurtainControlActivity extends BaseActivity implements CurtainControlView.C6025b, C12145e {

    /* renamed from: c */
    private static final String f10205c = "CurtainControlActivity";

    /* renamed from: d */
    public static final /* synthetic */ int f10206d = 0;

    /* renamed from: a */
    private C11911z f10207a;

    /* renamed from: b */
    private CompletedHandler f10208b = new C5184a(this);
    @BindView(2131296258)
    CurtainControlView mCurtainView;
    @BindView(2131297591)
    CommonTitleBar mTitleBar;
    @BindView(2131297671)
    TextView mTvProgress;

    /* renamed from: com.yeelight.cherry.ui.activity.CurtainControlActivity$a */
    class C5184a implements CompletedHandler {
        C5184a(CurtainControlActivity curtainControlActivity) {
        }

        public void onFailed(IotError iotError) {
        }

        public void onSucceed() {
        }
    }

    /* renamed from: X */
    private int m16103X() {
        Integer q2 = this.f10207a.mo41870q2();
        if (q2 != null) {
            return q2.intValue();
        }
        return C3283v.m8837c(this.f10207a.mo31698M1() + "CURTAIN_MODE", 1);
    }

    /* access modifiers changed from: private */
    /* renamed from: Y */
    public /* synthetic */ void m16104Y(View view) {
        onBackPressed();
    }

    /* access modifiers changed from: private */
    /* renamed from: Z */
    public /* synthetic */ void m16105Z(View view) {
        Intent intent = new Intent(this, DeviceSettingActivity.class);
        intent.putExtra("com.yeelight.cherry.device_id", this.f10207a.mo23185G());
        startActivity(intent);
    }

    /* renamed from: a */
    public void mo30361a(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append("onProgressChange: ");
        sb.append(i);
        C11911z zVar = this.f10207a;
        if (zVar != null) {
            zVar.mo42401K2(100 - i);
        }
        TextView textView = this.mTvProgress;
        textView.setText(i + "%");
    }

    /* renamed from: f */
    public void mo30362f(int i) {
        TextView textView = this.mTvProgress;
        textView.setText(i + "%");
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C12228R$layout.activity_curtain_control);
        C9193k.m22157h(true, this);
        ButterKnife.bind((Activity) this);
        Intent intent = getIntent();
        if (!intent.hasExtra("com.yeelight.cherry.device_id")) {
            AppUtils.m8302w(f10205c, "Activity has not device id", false);
            finish();
            return;
        }
        C11911z zVar = (C11911z) YeelightDeviceManager.m7804r0(intent.getStringExtra("com.yeelight.cherry.device_id"));
        this.f10207a = zVar;
        if (zVar == null || !zVar.mo23145k0()) {
            BaseActivity.m19947U(this);
            finish();
            return;
        }
        this.f10207a.mo23178B0(this);
        this.mCurtainView.setOnStatusChangeListener(this);
        this.mTitleBar.mo36195a(this.f10207a.mo23210U(), new C5783k0(this), new C5789l0(this));
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        C11911z zVar = this.f10207a;
        if (zVar != null) {
            zVar.mo23213W0(this);
        }
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        this.mTitleBar.setTitle(this.f10207a.mo23210U());
        this.mCurtainView.setCurtainMode(m16103X());
        this.mCurtainView.setProgress(this.f10207a.mo41869p2());
        this.mCurtainView.setRouteTime(this.f10207a.mo41873t2());
        TextView textView = this.mTvProgress;
        textView.setText((100 - this.f10207a.mo41869p2()) + "%");
    }

    public void onStatusChange(int i, DeviceStatusBase deviceStatusBase) {
        if (i == 67108864) {
            this.mCurtainView.setCurtainMode(m16103X());
        }
    }

    /* access modifiers changed from: protected */
    @OnClick({2131296906, 2131296907, 2131296880})
    public void onViewClick(View view) {
        switch (view.getId()) {
            case C12225R$id.img_close:
                this.f10207a.mo41878y2(2, this.f10208b);
                this.mCurtainView.mo31369f();
                return;
            case C12225R$id.img_open:
                this.f10207a.mo41878y2(1, this.f10208b);
                this.mCurtainView.mo31371l();
                return;
            case C12225R$id.img_pause:
                this.f10207a.mo41878y2(0, this.f10208b);
                this.mCurtainView.mo31372m();
                return;
            default:
                return;
        }
    }
}
