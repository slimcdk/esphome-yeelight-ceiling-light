package com.yeelight.yeelib.p194ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.yeelight.yeelib.R$drawable;
import com.yeelight.yeelib.R$id;
import com.yeelight.yeelib.R$layout;
import com.yeelight.yeelib.p150c.C6006h;
import com.yeelight.yeelib.p150c.p151i.C6024e;
import com.yeelight.yeelib.p150c.p183m.C7130o0;
import com.yeelight.yeelib.p152f.C4257w;
import com.yeelight.yeelib.p186e.C9770e;
import com.yeelight.yeelib.utils.C10547m;
import com.yeelight.yeelib.utils.C4308b;

/* renamed from: com.yeelight.yeelib.ui.activity.LEDIndicatorActivity */
public class LEDIndicatorActivity extends BaseActivity implements C9770e {

    /* renamed from: f */
    private static final String f18468f = LEDIndicatorActivity.class.getSimpleName();

    /* renamed from: b */
    ImageView f18469b;

    /* renamed from: c */
    ImageView f18470c;

    /* renamed from: d */
    ImageView f18471d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public C6006h f18472e;

    /* renamed from: com.yeelight.yeelib.ui.activity.LEDIndicatorActivity$a */
    class C10067a implements View.OnClickListener {
        C10067a() {
        }

        public void onClick(View view) {
            LEDIndicatorActivity.this.onBackPressed();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.LEDIndicatorActivity$b */
    class C10068b implements View.OnClickListener {
        C10068b() {
        }

        public void onClick(View view) {
            LEDIndicatorActivity.this.f18472e.mo23350v1(!LEDIndicatorActivity.this.f18472e.mo23408d0().mo27674Y());
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.LEDIndicatorActivity$c */
    class C10069c implements Runnable {
        C10069c() {
        }

        public void run() {
            ImageView imageView;
            int i;
            boolean Y = LEDIndicatorActivity.this.f18472e.mo23408d0().mo27674Y();
            LEDIndicatorActivity.this.f18470c.setImageResource(Y ? R$drawable.icon_yeelight_switch_point_on_new : R$drawable.icon_yeelight_switch_point_off_new);
            if (LEDIndicatorActivity.this.f18472e instanceof C7130o0) {
                imageView = LEDIndicatorActivity.this.f18471d;
                i = Y ? R$drawable.icon_yeelight_gateway_led_indicator_on_bg : R$drawable.icon_yeelight_gateway_led_indicator_off_bg;
            } else {
                imageView = LEDIndicatorActivity.this.f18471d;
                i = Y ? R$drawable.icon_yeelight_led_indicator_on_bg : R$drawable.icon_yeelight_led_indicator_off_bg;
            }
            imageView.setImageResource(i);
        }
    }

    /* renamed from: W */
    private void m24559W() {
        runOnUiThread(new C10069c());
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo32193P();
        C10547m.m25758h(true, this);
        setContentView(R$layout.activity_led_indicator);
        this.f18469b = (ImageView) findViewById(R$id.img_back_view);
        this.f18470c = (ImageView) findViewById(R$id.img_switch_view);
        this.f18471d = (ImageView) findViewById(R$id.led_indicator_bg);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        findViewById(R$id.title_view).setLayoutParams(layoutParams);
        layoutParams.setMargins(0, C10547m.m25755e(this), 0, 0);
        Intent intent = getIntent();
        if (!intent.hasExtra("com.yeelight.cherry.device_id")) {
            C4308b.m12141t(f18468f, "Activity has not device id", false);
            finish();
            return;
        }
        C6006h L0 = C4257w.m11947l0().mo23651L0(intent.getStringExtra("com.yeelight.cherry.device_id"));
        this.f18472e = L0;
        if (L0 == null || !L0.mo23331k0()) {
            BaseActivity.m24384U(this);
            finish();
            return;
        }
        this.f18469b.setOnClickListener(new C10067a());
        this.f18470c.setOnClickListener(new C10068b());
        m24559W();
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        this.f18472e.mo23400W0(this);
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        this.f18472e.mo23365B0(this);
    }

    public void onStatusChange(int i, C6024e eVar) {
        if (i == -1 || i == 4096) {
            m24559W();
        }
    }
}
