package com.yeelight.yeelib.p194ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.yeelight.yeelib.R$drawable;
import com.yeelight.yeelib.R$id;
import com.yeelight.yeelib.R$layout;
import com.yeelight.yeelib.p150c.p151i.C4200i;
import com.yeelight.yeelib.p150c.p151i.C6024e;
import com.yeelight.yeelib.p152f.C4257w;
import com.yeelight.yeelib.p186e.C9770e;
import com.yeelight.yeelib.utils.C10547m;
import com.yeelight.yeelib.utils.C4308b;

/* renamed from: com.yeelight.yeelib.ui.activity.GestureSwitchSettingActivity */
public class GestureSwitchSettingActivity extends BaseActivity implements View.OnClickListener, C9770e {

    /* renamed from: d */
    private static final String f18402d = GestureSwitchSettingActivity.class.getSimpleName();

    /* renamed from: b */
    ImageView f18403b;

    /* renamed from: c */
    private C4200i f18404c;

    /* renamed from: W */
    private void m24526W() {
        runOnUiThread(new C10301a0(this));
    }

    /* renamed from: V */
    public /* synthetic */ void mo32332V() {
        this.f18403b.setImageResource(this.f18404c.mo23408d0().mo27665T() ? R$drawable.icon_yeelight_switch_point_on_new : R$drawable.icon_yeelight_switch_point_off_new);
    }

    public void onClick(View view) {
        int id = view.getId();
        if (id == R$id.img_back_view) {
            onBackPressed();
        } else if (id == R$id.img_switch_view) {
            C4200i iVar = this.f18404c;
            iVar.mo23429d1(!iVar.mo23408d0().mo27665T());
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C10547m.m25758h(true, this);
        setContentView(R$layout.activity_gesture_switch_setting);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        findViewById(R$id.title_view).setLayoutParams(layoutParams);
        layoutParams.setMargins(0, C10547m.m25755e(this), 0, 0);
        this.f18403b = (ImageView) findViewById(R$id.img_switch_view);
        Intent intent = getIntent();
        if (!intent.hasExtra("com.yeelight.cherry.device_id")) {
            C4308b.m12141t(f18402d, "Activity has not device id", false);
            finish();
            return;
        }
        C4200i o0 = C4257w.m11953o0(intent.getStringExtra("com.yeelight.cherry.device_id"));
        this.f18404c = o0;
        if (o0 == null || !o0.mo23331k0()) {
            BaseActivity.m24384U(this);
            finish();
            return;
        }
        findViewById(R$id.img_back_view).setOnClickListener(this);
        this.f18403b.setOnClickListener(this);
        m24526W();
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        this.f18404c.mo23400W0(this);
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        this.f18404c.mo23365B0(this);
    }

    public void onStatusChange(int i, C6024e eVar) {
        if (i == 4096) {
            m24526W();
        }
    }
}
