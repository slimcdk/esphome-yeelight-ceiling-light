package com.yeelight.yeelib.p194ui.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import com.yeelight.yeelib.R$id;
import com.yeelight.yeelib.R$layout;
import com.yeelight.yeelib.R$string;
import com.yeelight.yeelib.p150c.C6006h;
import com.yeelight.yeelib.p150c.p151i.C6024e;
import com.yeelight.yeelib.p152f.C4257w;
import com.yeelight.yeelib.p186e.C9770e;
import com.yeelight.yeelib.p194ui.view.CommonTitleBar;
import com.yeelight.yeelib.utils.C10547m;

/* renamed from: com.yeelight.yeelib.ui.activity.KidModeSelectActivity */
public class KidModeSelectActivity extends BaseActivity implements View.OnClickListener, C9770e {

    /* renamed from: b */
    private ImageView f18465b;

    /* renamed from: c */
    private ImageView f18466c;

    /* renamed from: d */
    private C6006h f18467d;

    /* renamed from: X */
    private void m24555X() {
        runOnUiThread(new C10307c0(this));
    }

    /* renamed from: V */
    public /* synthetic */ void mo32360V(View view) {
        finish();
    }

    /* renamed from: W */
    public /* synthetic */ void mo32361W() {
        boolean X = this.f18467d.mo23408d0().mo27673X();
        int i = 0;
        this.f18465b.setVisibility(X ? 0 : 4);
        ImageView imageView = this.f18466c;
        if (X) {
            i = 4;
        }
        imageView.setVisibility(i);
    }

    public void onClick(View view) {
        C6006h hVar;
        boolean z;
        int id = view.getId();
        if (id == R$id.rl_kids_mode) {
            hVar = this.f18467d;
            z = true;
        } else if (id == R$id.rl_adult_mode) {
            hVar = this.f18467d;
            z = false;
        } else {
            return;
        }
        hVar.mo27570P1(z);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C10547m.m25758h(true, this);
        if (getIntent().hasExtra("com.yeelight.cherry.device_id")) {
            this.f18467d = C4257w.m11947l0().mo23651L0(getIntent().getStringExtra("com.yeelight.cherry.device_id"));
        }
        if (this.f18467d == null) {
            finish();
            return;
        }
        setContentView(R$layout.activity_kid_mode_select);
        this.f18465b = (ImageView) findViewById(R$id.img_kids_mode);
        this.f18466c = (ImageView) findViewById(R$id.img_adult_mode);
        findViewById(R$id.rl_kids_mode).setOnClickListener(this);
        findViewById(R$id.rl_adult_mode).setOnClickListener(this);
        ((CommonTitleBar) findViewById(R$id.title_bar)).mo32825a(getString(R$string.vision_mode_selection), new C10309d0(this), (View.OnClickListener) null);
        m24555X();
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        this.f18467d.mo23400W0(this);
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        this.f18467d.mo23365B0(this);
    }

    public void onStatusChange(int i, C6024e eVar) {
        if (i == 4096) {
            m24555X();
        }
    }
}
