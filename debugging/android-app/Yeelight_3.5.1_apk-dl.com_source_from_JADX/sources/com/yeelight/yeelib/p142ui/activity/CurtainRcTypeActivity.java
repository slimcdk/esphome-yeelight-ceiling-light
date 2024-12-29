package com.yeelight.yeelib.p142ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckedTextView;
import android.widget.ImageView;
import com.yeelight.yeelib.R$drawable;
import com.yeelight.yeelib.R$id;
import com.yeelight.yeelib.R$layout;
import com.yeelight.yeelib.R$string;
import com.yeelight.yeelib.device.base.DeviceStatusBase;
import com.yeelight.yeelib.managers.YeelightDeviceManager;
import com.yeelight.yeelib.p142ui.view.CommonTitleBar;
import com.yeelight.yeelib.utils.AppUtils;
import p051j4.C9193k;
import p150e4.C8970c;
import p150e4.C8972d;
import p150e4.C8974e;
import p223w3.C11911z;
import p237z3.C12145e;

/* renamed from: com.yeelight.yeelib.ui.activity.CurtainRcTypeActivity */
public class CurtainRcTypeActivity extends BaseActivity implements View.OnClickListener, C12145e {

    /* renamed from: m */
    private static final String f14513m = CurtainRcTypeActivity.class.getSimpleName();

    /* renamed from: a */
    CommonTitleBar f14514a;

    /* renamed from: b */
    private CheckedTextView f14515b;

    /* renamed from: c */
    private ImageView f14516c;

    /* renamed from: d */
    private CheckedTextView f14517d;

    /* renamed from: e */
    private ImageView f14518e;

    /* renamed from: f */
    private ImageView f14519f;

    /* renamed from: g */
    private ImageView f14520g;

    /* renamed from: h */
    private ImageView f14521h;

    /* renamed from: i */
    private ImageView f14522i;

    /* renamed from: j */
    private C11911z f14523j;

    /* renamed from: k */
    private int f14524k;

    /* renamed from: l */
    private boolean f14525l;

    /* access modifiers changed from: private */
    /* renamed from: X */
    public /* synthetic */ void m20016X(View view) {
        onBackPressed();
    }

    /* access modifiers changed from: private */
    /* renamed from: Y */
    public /* synthetic */ void m20017Y(View view) {
        this.f14523j.mo42400J2(this.f14524k);
        this.f14525l = true;
    }

    /* renamed from: Z */
    private void m20018Z(int i) {
        int i2 = 0;
        boolean z = i == 0;
        this.f14515b.setChecked(z);
        this.f14517d.setChecked(!z);
        this.f14516c.setVisibility(z ? 0 : 4);
        ImageView imageView = this.f14518e;
        if (z) {
            i2 = 4;
        }
        imageView.setVisibility(i2);
        this.f14519f.setImageResource(z ? R$drawable.icon_yeelight_curtain_seesaw_click_selected : R$drawable.icon_yeelight_curtain_seesaw_click_normal);
        this.f14520g.setImageResource(z ? R$drawable.icon_yeelight_curtain_seesaw_rotate_selected : R$drawable.icon_yeelight_curtain_seesaw_rotate_normal);
        this.f14521h.setImageResource(z ? R$drawable.icon_yeelight_curtain_seesaw_double_click_normal : R$drawable.icon_yeelight_curtain_seesaw_double_click_selected);
        this.f14522i.setImageResource(z ? R$drawable.icon_yeelight_curtain_seesaw_press_rotate_normal : R$drawable.icon_yeelight_curtain_seesaw_press_rotate_selected);
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
        this.f14524k = i;
        m20018Z(i);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R$layout.activity_curtain_seesaw);
        C9193k.m22157h(true, this);
        this.f14514a = (CommonTitleBar) findViewById(R$id.title_bar);
        this.f14515b = (CheckedTextView) findViewById(R$id.ctv_control_style1);
        this.f14516c = (ImageView) findViewById(R$id.img_control_style1);
        this.f14519f = (ImageView) findViewById(R$id.img_click);
        this.f14520g = (ImageView) findViewById(R$id.img_rotate);
        this.f14517d = (CheckedTextView) findViewById(R$id.ctv_control_style2);
        this.f14518e = (ImageView) findViewById(R$id.img_control_style2);
        this.f14521h = (ImageView) findViewById(R$id.img_double_click);
        this.f14522i = (ImageView) findViewById(R$id.img_press_rotate);
        Intent intent = getIntent();
        if (!intent.hasExtra("com.yeelight.cherry.device_id")) {
            AppUtils.m8302w(f14513m, "Activity has not device id", false);
            finish();
            return;
        }
        C11911z zVar = (C11911z) YeelightDeviceManager.m7804r0(intent.getStringExtra("com.yeelight.cherry.device_id"));
        this.f14523j = zVar;
        if (zVar == null || !zVar.mo23145k0()) {
            BaseActivity.m19947U(this);
            finish();
            return;
        }
        this.f14515b.setOnClickListener(this);
        this.f14517d.setOnClickListener(this);
        this.f14514a.mo36195a(getResources().getString(R$string.remote_control_seesaw), new C8972d(this), new C8970c(this));
        int s2 = this.f14523j.mo41872s2();
        this.f14524k = s2;
        m20018Z(s2);
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        this.f14523j.mo23178B0(this);
    }

    public void onStatusChange(int i, DeviceStatusBase deviceStatusBase) {
        if (i == 4096 && this.f14525l && this.f14524k == this.f14523j.mo41872s2()) {
            runOnUiThread(new C8974e(this));
        }
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
    }
}
