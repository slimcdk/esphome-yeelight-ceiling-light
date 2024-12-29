package com.yeelight.yeelib.p194ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;
import com.yeelight.yeelib.R$id;
import com.yeelight.yeelib.R$layout;
import com.yeelight.yeelib.R$string;
import com.yeelight.yeelib.p150c.p151i.C4200i;
import com.yeelight.yeelib.p152f.C4257w;
import com.yeelight.yeelib.p153g.C9833d;
import com.yeelight.yeelib.p153g.C9835f;
import com.yeelight.yeelib.p153g.C9836g;
import com.yeelight.yeelib.p153g.C9851t;
import com.yeelight.yeelib.p153g.C9856y;
import com.yeelight.yeelib.p194ui.view.BrightnessSeekBarView;
import com.yeelight.yeelib.p194ui.view.CommonTitleBar;
import com.yeelight.yeelib.p194ui.view.ModeSelectionLightAdjustView;
import com.yeelight.yeelib.utils.C10547m;
import com.yeelight.yeelib.utils.C4308b;

/* renamed from: com.yeelight.yeelib.ui.activity.LightAdjustViewActivity */
public class LightAdjustViewActivity extends BaseActivity {

    /* renamed from: h */
    private static final String f18488h = LightAdjustViewActivity.class.getSimpleName();

    /* renamed from: b */
    CommonTitleBar f18489b;

    /* renamed from: c */
    LinearLayout f18490c;

    /* renamed from: d */
    LinearLayout f18491d;

    /* renamed from: e */
    ModeSelectionLightAdjustView f18492e;

    /* renamed from: f */
    BrightnessSeekBarView f18493f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public C4200i f18494g;

    /* renamed from: com.yeelight.yeelib.ui.activity.LightAdjustViewActivity$a */
    class C10074a implements View.OnClickListener {
        C10074a() {
        }

        public void onClick(View view) {
            LightAdjustViewActivity.this.onBackPressed();
            LightAdjustViewActivity.this.setResult(0);
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.LightAdjustViewActivity$b */
    class C10075b implements View.OnClickListener {
        C10075b() {
        }

        public void onClick(View view) {
            if (!LightAdjustViewActivity.this.f18494g.mo23331k0()) {
                Toast.makeText(LightAdjustViewActivity.this, R$string.create_scene_preview_error_offline, 0).show();
            } else {
                LightAdjustViewActivity.this.f18494g.mo23355x1(LightAdjustViewActivity.this.m24569X());
            }
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.LightAdjustViewActivity$c */
    class C10076c implements View.OnClickListener {
        C10076c() {
        }

        public void onClick(View view) {
            Intent intent = new Intent();
            intent.putExtra("light_adjust_mode", LightAdjustViewActivity.this.f18492e.getCurrentMode());
            intent.putExtra("light_adjust_bright", LightAdjustViewActivity.this.f18493f.getBright());
            intent.putExtra("light_adjust_color", LightAdjustViewActivity.this.f18492e.getColor());
            intent.putExtra("light_adjust_ct", LightAdjustViewActivity.this.f18492e.getCt());
            intent.putExtra("com.yeelight.cherry.device_id", LightAdjustViewActivity.this.f18494g.mo23372G());
            intent.putExtra("light_adjust_json", LightAdjustViewActivity.this.f18492e.getFlowScene().toString());
            LightAdjustViewActivity.this.setResult(-1, intent);
            LightAdjustViewActivity.this.finish();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: X */
    public C9856y m24569X() {
        int currentMode = this.f18492e.getCurrentMode();
        if (currentMode == 0) {
            return new C9836g("", -1, 3, this.f18493f.getBright(), this.f18492e.getCt());
        }
        if (currentMode == 1) {
            return new C9835f("", -1, 2, this.f18493f.getBright(), this.f18492e.getColor());
        }
        if (currentMode == 2) {
            return this.f18492e.getFlowScene();
        }
        if (currentMode == 3) {
            return new C9833d("", -1, 3, this.f18493f.getBright());
        }
        if (currentMode == 4) {
            return new C9851t("", -1, 6, this.f18493f.getBright());
        }
        "No reason to run here! " + new Exception();
        return null;
    }

    /* renamed from: Y */
    private void m24570Y(String str) {
        this.f18492e.setDeviceId(str);
        this.f18493f.setDeviceId(str);
    }

    /* renamed from: Z */
    private void m24571Z() {
        this.f18493f.mo32740i();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo32193P();
        C10547m.m25758h(true, this);
        setContentView(R$layout.activity_light_adjust_view);
        this.f18489b = (CommonTitleBar) findViewById(R$id.title_bar);
        this.f18490c = (LinearLayout) findViewById(R$id.layout_left);
        this.f18491d = (LinearLayout) findViewById(R$id.layout_right);
        this.f18492e = (ModeSelectionLightAdjustView) findViewById(R$id.mode_selection_view);
        this.f18493f = (BrightnessSeekBarView) findViewById(R$id.brightness_seek_bar);
        Intent intent = getIntent();
        if (!intent.hasExtra("com.yeelight.cherry.device_id")) {
            C4308b.m12141t(f18488h, "Activity has not device id", false);
            finish();
            return;
        }
        C4200i o0 = C4257w.m11953o0(intent.getStringExtra("com.yeelight.cherry.device_id"));
        this.f18494g = o0;
        if (o0 == null) {
            BaseActivity.m24384U(this);
            finish();
            return;
        }
        this.f18489b.mo32825a(o0.mo23397U(), new C10074a(), (View.OnClickListener) null);
        this.f18489b.setTitleTextSize(16);
        this.f18490c.setOnClickListener(new C10075b());
        this.f18491d.setOnClickListener(new C10076c());
        this.f18492e.setBrightnessSeekbarView(this.f18493f);
        this.f18493f.mo32739h();
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
        this.f18489b.setTitle(this.f18494g.mo23397U());
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        if (!C4257w.m11933V(this.f18494g.mo23372G())) {
            finish();
            return;
        }
        m24570Y(this.f18494g.mo23372G());
        this.f18493f.mo32741j(false);
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        m24571Z();
    }
}
