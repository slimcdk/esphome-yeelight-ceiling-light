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

/* renamed from: com.yeelight.yeelib.ui.activity.HumanInductionActivity */
public class HumanInductionActivity extends BaseActivity implements View.OnClickListener, C9770e {

    /* renamed from: d */
    private static final String f18448d = HumanInductionActivity.class.getSimpleName();

    /* renamed from: b */
    ImageView f18449b;

    /* renamed from: c */
    private C4200i f18450c;

    /* renamed from: W */
    private void m24549W() {
        runOnUiThread(new C10304b0(this));
    }

    /* renamed from: V */
    public /* synthetic */ void mo32352V() {
        this.f18449b.setImageResource(this.f18450c.mo23408d0().mo27667U() ? R$drawable.icon_yeelight_switch_point_on_new : R$drawable.icon_yeelight_switch_point_off_new);
    }

    public void onClick(View view) {
        int id = view.getId();
        if (id == R$id.img_back_view) {
            onBackPressed();
        } else if (id == R$id.img_switch_view) {
            C4200i iVar = this.f18450c;
            iVar.mo23430e1(!iVar.mo23408d0().mo27667U());
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C10547m.m25758h(true, this);
        setContentView(R$layout.activity_human_induction);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        findViewById(R$id.title_view).setLayoutParams(layoutParams);
        layoutParams.setMargins(0, C10547m.m25755e(this), 0, 0);
        this.f18449b = (ImageView) findViewById(R$id.img_switch_view);
        Intent intent = getIntent();
        if (!intent.hasExtra("com.yeelight.cherry.device_id")) {
            C4308b.m12141t(f18448d, "Activity has not device id", false);
            finish();
            return;
        }
        C4200i o0 = C4257w.m11953o0(intent.getStringExtra("com.yeelight.cherry.device_id"));
        this.f18450c = o0;
        if (o0 == null || !o0.mo23331k0()) {
            BaseActivity.m24384U(this);
            finish();
            return;
        }
        findViewById(R$id.img_back_view).setOnClickListener(this);
        this.f18449b.setOnClickListener(this);
        m24549W();
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        this.f18450c.mo23400W0(this);
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        this.f18450c.mo23365B0(this);
    }

    public void onStatusChange(int i, C6024e eVar) {
        if (i == 4096) {
            m24549W();
        }
    }
}