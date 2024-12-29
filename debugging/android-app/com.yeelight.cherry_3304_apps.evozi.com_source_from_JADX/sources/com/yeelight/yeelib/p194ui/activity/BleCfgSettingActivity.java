package com.yeelight.yeelib.p194ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import com.yeelight.yeelib.R$drawable;
import com.yeelight.yeelib.R$id;
import com.yeelight.yeelib.R$layout;
import com.yeelight.yeelib.R$string;
import com.yeelight.yeelib.p150c.p151i.C4198d;
import com.yeelight.yeelib.p150c.p151i.C6024e;
import com.yeelight.yeelib.p152f.C4257w;
import com.yeelight.yeelib.p186e.C9770e;
import com.yeelight.yeelib.p194ui.view.CommonTitleBar;
import com.yeelight.yeelib.utils.C10547m;
import com.yeelight.yeelib.utils.C4308b;

/* renamed from: com.yeelight.yeelib.ui.activity.BleCfgSettingActivity */
public class BleCfgSettingActivity extends BaseActivity implements View.OnClickListener, C9770e {

    /* renamed from: d */
    private static final String f18136d = BleCfgSettingActivity.class.getSimpleName();

    /* renamed from: b */
    private C4198d f18137b;

    /* renamed from: c */
    private ImageView f18138c;

    /* renamed from: X */
    private void m24395X() {
        runOnUiThread(new C10303b(this));
    }

    /* renamed from: V */
    public /* synthetic */ void mo32203V(View view) {
        onBackPressed();
    }

    /* renamed from: W */
    public /* synthetic */ void mo32204W() {
        int i;
        ImageView imageView;
        if (this.f18137b.mo23408d0().mo27657P()) {
            imageView = this.f18138c;
            i = R$drawable.icon_yeelight_switch_point_on_new;
        } else {
            imageView = this.f18138c;
            i = R$drawable.icon_yeelight_switch_point_off_new;
        }
        imageView.setImageResource(i);
    }

    public void onClick(View view) {
        if (view.getId() == R$id.img_switch) {
            C4198d dVar = this.f18137b;
            dVar.mo23423u(!dVar.mo23408d0().mo27657P());
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C10547m.m25758h(true, this);
        setContentView(R$layout.activity_ble_cfg_setting);
        this.f18138c = (ImageView) findViewById(R$id.img_switch);
        ((CommonTitleBar) findViewById(R$id.title_bar)).mo32825a(getString(R$string.common_text_bluetooth_mode), new C10300a(this), (View.OnClickListener) null);
        Intent intent = getIntent();
        if (!intent.hasExtra("com.yeelight.cherry.device_id")) {
            C4308b.m12141t(f18136d, "Activity has not device id", false);
            finish();
            return;
        }
        this.f18137b = C4257w.m11945h0(intent.getStringExtra("com.yeelight.cherry.device_id"));
        this.f18138c.setOnClickListener(this);
        m24395X();
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        this.f18137b.mo23400W0(this);
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        this.f18137b.mo23365B0(this);
    }

    public void onStatusChange(int i, C6024e eVar) {
        if (i == -1 || i == 4096) {
            m24395X();
        }
    }
}
