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
import com.yeelight.yeelib.p152f.C4257w;
import com.yeelight.yeelib.p186e.C9770e;
import com.yeelight.yeelib.utils.C10547m;
import com.yeelight.yeelib.utils.C4308b;

/* renamed from: com.yeelight.yeelib.ui.activity.KidModeNewActivity */
public class KidModeNewActivity extends BaseActivity implements C9770e {

    /* renamed from: e */
    private static final String f18458e = KidModeNewActivity.class.getSimpleName();

    /* renamed from: b */
    ImageView f18459b;

    /* renamed from: c */
    ImageView f18460c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C6006h f18461d;

    /* renamed from: com.yeelight.yeelib.ui.activity.KidModeNewActivity$a */
    class C10064a implements View.OnClickListener {
        C10064a() {
        }

        public void onClick(View view) {
            KidModeNewActivity.this.onBackPressed();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.KidModeNewActivity$b */
    class C10065b implements View.OnClickListener {
        C10065b() {
        }

        public void onClick(View view) {
            KidModeNewActivity.this.f18461d.mo27569O1(!KidModeNewActivity.this.f18461d.mo23408d0().mo27671W());
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.KidModeNewActivity$c */
    class C10066c implements Runnable {
        C10066c() {
        }

        public void run() {
            int i;
            ImageView imageView;
            if (KidModeNewActivity.this.f18461d.mo23408d0().mo27671W()) {
                imageView = KidModeNewActivity.this.f18460c;
                i = R$drawable.icon_yeelight_switch_point_on_new;
            } else {
                imageView = KidModeNewActivity.this.f18460c;
                i = R$drawable.icon_yeelight_switch_point_off_new;
            }
            imageView.setImageResource(i);
        }
    }

    /* renamed from: W */
    private void m24554W() {
        runOnUiThread(new C10066c());
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo32193P();
        C10547m.m25758h(true, this);
        setContentView(R$layout.activity_kid_mode_new);
        this.f18459b = (ImageView) findViewById(R$id.img_back_view);
        this.f18460c = (ImageView) findViewById(R$id.img_switch_view);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        findViewById(R$id.title_view).setLayoutParams(layoutParams);
        layoutParams.setMargins(0, C10547m.m25755e(this), 0, 0);
        Intent intent = getIntent();
        if (!intent.hasExtra("com.yeelight.cherry.device_id")) {
            C4308b.m12141t(f18458e, "Activity has not device id", false);
            finish();
            return;
        }
        C6006h L0 = C4257w.m11947l0().mo23651L0(intent.getStringExtra("com.yeelight.cherry.device_id"));
        this.f18461d = L0;
        if (L0 == null || !L0.mo23331k0()) {
            BaseActivity.m24384U(this);
            finish();
            return;
        }
        this.f18459b.setOnClickListener(new C10064a());
        this.f18460c.setOnClickListener(new C10065b());
        m24554W();
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        this.f18461d.mo23400W0(this);
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        this.f18461d.mo23365B0(this);
    }

    public void onStatusChange(int i, C6024e eVar) {
        if (i == -1 || i == 4096) {
            m24554W();
        }
    }
}
