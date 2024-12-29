package com.yeelight.yeelib.p142ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;
import com.yeelight.yeelib.R$id;
import com.yeelight.yeelib.R$layout;
import com.yeelight.yeelib.R$string;
import com.yeelight.yeelib.device.base.C3012e;
import com.yeelight.yeelib.managers.YeelightDeviceManager;
import com.yeelight.yeelib.models.C8311d;
import com.yeelight.yeelib.models.C8313f;
import com.yeelight.yeelib.models.C8314g;
import com.yeelight.yeelib.models.C8322n;
import com.yeelight.yeelib.models.C8327s;
import com.yeelight.yeelib.p142ui.view.BrightnessSeekBarView;
import com.yeelight.yeelib.p142ui.view.CommonTitleBar;
import com.yeelight.yeelib.p142ui.view.ModeSelectionLightAdjustView;
import com.yeelight.yeelib.utils.AppUtils;
import p051j4.C9193k;

/* renamed from: com.yeelight.yeelib.ui.activity.LightAdjustViewActivity */
public class LightAdjustViewActivity extends BaseActivity {

    /* renamed from: g */
    private static final String f14796g = "LightAdjustViewActivity";

    /* renamed from: a */
    CommonTitleBar f14797a;

    /* renamed from: b */
    LinearLayout f14798b;

    /* renamed from: c */
    LinearLayout f14799c;

    /* renamed from: d */
    ModeSelectionLightAdjustView f14800d;

    /* renamed from: e */
    BrightnessSeekBarView f14801e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public C3012e f14802f;

    /* renamed from: com.yeelight.yeelib.ui.activity.LightAdjustViewActivity$a */
    class C8492a implements View.OnClickListener {
        C8492a() {
        }

        public void onClick(View view) {
            LightAdjustViewActivity.this.onBackPressed();
            LightAdjustViewActivity.this.setResult(0);
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.LightAdjustViewActivity$b */
    class C8493b implements View.OnClickListener {
        C8493b() {
        }

        public void onClick(View view) {
            if (!LightAdjustViewActivity.this.f14802f.mo23145k0()) {
                Toast.makeText(LightAdjustViewActivity.this, R$string.create_scene_preview_error_offline, 0).show();
            } else {
                LightAdjustViewActivity.this.f14802f.mo23168x1(LightAdjustViewActivity.this.m20169X());
            }
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.LightAdjustViewActivity$c */
    class C8494c implements View.OnClickListener {
        C8494c() {
        }

        public void onClick(View view) {
            Intent intent = new Intent();
            intent.putExtra("light_adjust_mode", LightAdjustViewActivity.this.f14800d.getCurrentMode());
            intent.putExtra("light_adjust_bright", LightAdjustViewActivity.this.f14801e.getBright());
            intent.putExtra("light_adjust_color", LightAdjustViewActivity.this.f14800d.getColor());
            intent.putExtra("light_adjust_ct", LightAdjustViewActivity.this.f14800d.getCt());
            intent.putExtra("com.yeelight.cherry.device_id", LightAdjustViewActivity.this.f14802f.mo23185G());
            intent.putExtra("light_adjust_json", LightAdjustViewActivity.this.f14800d.getFlowScene().toString());
            LightAdjustViewActivity.this.setResult(-1, intent);
            LightAdjustViewActivity.this.finish();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: X */
    public C8327s m20169X() {
        int currentMode = this.f14800d.getCurrentMode();
        if (currentMode == 0) {
            return new C8314g("", -1, 3, this.f14801e.getBright(), this.f14800d.getCt());
        }
        if (currentMode == 1) {
            return new C8313f("", -1, 2, this.f14801e.getBright(), this.f14800d.getColor());
        }
        if (currentMode == 2) {
            return this.f14800d.getFlowScene();
        }
        if (currentMode == 3) {
            return new C8311d("", -1, 3, this.f14801e.getBright());
        }
        if (currentMode == 4) {
            return new C8322n("", -1, 6, this.f14801e.getBright());
        }
        StringBuilder sb = new StringBuilder();
        sb.append("No reason to run here! ");
        sb.append(new Exception());
        return null;
    }

    /* renamed from: Y */
    private void m20170Y(String str) {
        this.f14800d.setDeviceId(str);
        this.f14801e.setDeviceId(str);
    }

    /* renamed from: Z */
    private void m20171Z() {
        this.f14801e.mo36110i();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo35653P();
        C9193k.m22157h(true, this);
        setContentView(R$layout.activity_light_adjust_view);
        this.f14797a = (CommonTitleBar) findViewById(R$id.title_bar);
        this.f14798b = (LinearLayout) findViewById(R$id.layout_left);
        this.f14799c = (LinearLayout) findViewById(R$id.layout_right);
        this.f14800d = (ModeSelectionLightAdjustView) findViewById(R$id.mode_selection_view);
        this.f14801e = (BrightnessSeekBarView) findViewById(R$id.brightness_seek_bar);
        Intent intent = getIntent();
        if (!intent.hasExtra("com.yeelight.cherry.device_id")) {
            AppUtils.m8302w(f14796g, "Activity has not device id", false);
            finish();
            return;
        }
        C3012e r0 = YeelightDeviceManager.m7804r0(intent.getStringExtra("com.yeelight.cherry.device_id"));
        this.f14802f = r0;
        if (r0 == null) {
            BaseActivity.m19947U(this);
            finish();
            return;
        }
        this.f14797a.mo36195a(r0.mo23210U(), new C8492a(), (View.OnClickListener) null);
        this.f14797a.setTitleTextSize(16);
        this.f14798b.setOnClickListener(new C8493b());
        this.f14799c.setOnClickListener(new C8494c());
        this.f14800d.setBrightnessSeekbarView(this.f14801e);
        this.f14801e.mo36109h();
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        this.f14797a.setTitle(this.f14802f.mo23210U());
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        if (!YeelightDeviceManager.m7780X(this.f14802f.mo23185G())) {
            finish();
            return;
        }
        m20170Y(this.f14802f.mo23185G());
        this.f14801e.mo36111j(false);
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        m20171Z();
    }
}
