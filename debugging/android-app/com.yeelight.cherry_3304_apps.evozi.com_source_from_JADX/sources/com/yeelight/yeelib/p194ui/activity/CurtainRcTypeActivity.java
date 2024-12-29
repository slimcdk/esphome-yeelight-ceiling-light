package com.yeelight.yeelib.p194ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckedTextView;
import android.widget.ImageView;
import com.yeelight.yeelib.R$drawable;
import com.yeelight.yeelib.R$id;
import com.yeelight.yeelib.R$layout;
import com.yeelight.yeelib.R$string;
import com.yeelight.yeelib.p150c.p151i.C6024e;
import com.yeelight.yeelib.p150c.p183m.C7472y;
import com.yeelight.yeelib.p152f.C4257w;
import com.yeelight.yeelib.p186e.C9770e;
import com.yeelight.yeelib.p194ui.view.CommonTitleBar;
import com.yeelight.yeelib.utils.C10547m;
import com.yeelight.yeelib.utils.C4308b;

/* renamed from: com.yeelight.yeelib.ui.activity.CurtainRcTypeActivity */
public class CurtainRcTypeActivity extends BaseActivity implements View.OnClickListener, C9770e {

    /* renamed from: n */
    private static final String f18207n = CurtainRcTypeActivity.class.getSimpleName();

    /* renamed from: b */
    CommonTitleBar f18208b;

    /* renamed from: c */
    private CheckedTextView f18209c;

    /* renamed from: d */
    private ImageView f18210d;

    /* renamed from: e */
    private CheckedTextView f18211e;

    /* renamed from: f */
    private ImageView f18212f;

    /* renamed from: g */
    private ImageView f18213g;

    /* renamed from: h */
    private ImageView f18214h;

    /* renamed from: i */
    private ImageView f18215i;

    /* renamed from: j */
    private ImageView f18216j;

    /* renamed from: k */
    private C7472y f18217k;

    /* renamed from: l */
    private int f18218l;

    /* renamed from: m */
    private boolean f18219m;

    /* renamed from: X */
    private void m24439X(int i) {
        int i2 = 0;
        boolean z = i == 0;
        this.f18209c.setChecked(z);
        this.f18211e.setChecked(!z);
        this.f18210d.setVisibility(z ? 0 : 4);
        ImageView imageView = this.f18212f;
        if (z) {
            i2 = 4;
        }
        imageView.setVisibility(i2);
        this.f18213g.setImageResource(z ? R$drawable.icon_yeelight_curtain_seesaw_click_selected : R$drawable.icon_yeelight_curtain_seesaw_click_normal);
        this.f18214h.setImageResource(z ? R$drawable.icon_yeelight_curtain_seesaw_rotate_selected : R$drawable.icon_yeelight_curtain_seesaw_rotate_normal);
        this.f18215i.setImageResource(z ? R$drawable.icon_yeelight_curtain_seesaw_double_click_normal : R$drawable.icon_yeelight_curtain_seesaw_double_click_selected);
        this.f18216j.setImageResource(z ? R$drawable.icon_yeelight_curtain_seesaw_press_rotate_normal : R$drawable.icon_yeelight_curtain_seesaw_press_rotate_selected);
    }

    /* renamed from: V */
    public /* synthetic */ void mo32242V(View view) {
        onBackPressed();
    }

    /* renamed from: W */
    public /* synthetic */ void mo32243W(View view) {
        this.f18217k.mo28816J2(this.f18218l);
        this.f18219m = true;
    }

    public void onClick(View view) {
        int i;
        if (view.getId() == R$id.ctv_control_style1) {
            i = 0;
        } else if (view.getId() == R$id.ctv_control_style2) {
            i = 1;
        } else {
            return;
        }
        this.f18218l = i;
        m24439X(i);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R$layout.activity_curtain_seesaw);
        C10547m.m25758h(true, this);
        this.f18208b = (CommonTitleBar) findViewById(R$id.title_bar);
        this.f18209c = (CheckedTextView) findViewById(R$id.ctv_control_style1);
        this.f18210d = (ImageView) findViewById(R$id.img_control_style1);
        this.f18213g = (ImageView) findViewById(R$id.img_click);
        this.f18214h = (ImageView) findViewById(R$id.img_rotate);
        this.f18211e = (CheckedTextView) findViewById(R$id.ctv_control_style2);
        this.f18212f = (ImageView) findViewById(R$id.img_control_style2);
        this.f18215i = (ImageView) findViewById(R$id.img_double_click);
        this.f18216j = (ImageView) findViewById(R$id.img_press_rotate);
        Intent intent = getIntent();
        if (!intent.hasExtra("com.yeelight.cherry.device_id")) {
            C4308b.m12141t(f18207n, "Activity has not device id", false);
            finish();
            return;
        }
        C7472y yVar = (C7472y) C4257w.m11953o0(intent.getStringExtra("com.yeelight.cherry.device_id"));
        this.f18217k = yVar;
        if (yVar == null || !yVar.mo23331k0()) {
            BaseActivity.m24384U(this);
            finish();
            return;
        }
        this.f18209c.setOnClickListener(this);
        this.f18211e.setOnClickListener(this);
        this.f18208b.mo32825a(getResources().getString(R$string.remote_control_seesaw), new C10326m(this), new C10328n(this));
        int s2 = this.f18217k.mo27619s2();
        this.f18218l = s2;
        m24439X(s2);
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        this.f18217k.mo23365B0(this);
    }

    public void onStatusChange(int i, C6024e eVar) {
        if (i == 4096 && this.f18219m && this.f18218l == this.f18217k.mo27619s2()) {
            runOnUiThread(new C10302a1(this));
        }
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
    }
}
