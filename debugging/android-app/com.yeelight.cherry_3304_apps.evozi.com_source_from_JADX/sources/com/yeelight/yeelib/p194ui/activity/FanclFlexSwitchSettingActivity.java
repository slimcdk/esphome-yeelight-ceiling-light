package com.yeelight.yeelib.p194ui.activity;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.yeelight.yeelib.R$drawable;
import com.yeelight.yeelib.R$id;
import com.yeelight.yeelib.R$layout;
import com.yeelight.yeelib.R$style;
import com.yeelight.yeelib.p150c.p151i.C6024e;
import com.yeelight.yeelib.p150c.p151i.C6033g;
import com.yeelight.yeelib.p152f.C4257w;
import com.yeelight.yeelib.p186e.C9770e;
import com.yeelight.yeelib.utils.C10547m;
import com.yeelight.yeelib.utils.C4308b;

/* renamed from: com.yeelight.yeelib.ui.activity.FanclFlexSwitchSettingActivity */
public class FanclFlexSwitchSettingActivity extends BaseActivity implements View.OnClickListener, C9770e {

    /* renamed from: h */
    private static final String f18335h = FanclFlexSwitchSettingActivity.class.getSimpleName();

    /* renamed from: b */
    ImageView f18336b;

    /* renamed from: c */
    ImageView f18337c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C6033g f18338d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public AlertDialog f18339e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public boolean f18340f;

    /* renamed from: g */
    private View.OnClickListener f18341g = new C10021a();

    /* renamed from: com.yeelight.yeelib.ui.activity.FanclFlexSwitchSettingActivity$a */
    class C10021a implements View.OnClickListener {
        C10021a() {
        }

        public void onClick(View view) {
            if (FanclFlexSwitchSettingActivity.this.f18340f) {
                FanclFlexSwitchSettingActivity.this.f18338d.mo23424v(true);
            } else {
                FanclFlexSwitchSettingActivity.this.f18338d.mo27751q2(true);
            }
            if (FanclFlexSwitchSettingActivity.this.f18339e != null) {
                FanclFlexSwitchSettingActivity.this.f18339e.dismiss();
            }
        }
    }

    /* renamed from: a0 */
    private void m24502a0() {
        AlertDialog alertDialog = this.f18339e;
        if (alertDialog == null) {
            View inflate = LayoutInflater.from(this).inflate(R$layout.dialog_flex_switch, (ViewGroup) null, false);
            inflate.findViewById(R$id.btn_left).setOnClickListener(new C10348x(this));
            inflate.findViewById(R$id.btn_right).setOnClickListener(this.f18341g);
            AlertDialog create = new AlertDialog.Builder(this, R$style.Theme_Transparent).create();
            this.f18339e = create;
            create.requestWindowFeature(1);
            this.f18339e.setCancelable(false);
            Display defaultDisplay = getWindowManager().getDefaultDisplay();
            WindowManager.LayoutParams attributes = this.f18339e.getWindow().getAttributes();
            attributes.height = -2;
            double width = (double) defaultDisplay.getWidth();
            Double.isNaN(width);
            attributes.width = (int) (width * 0.78d);
            this.f18339e.getWindow().setAttributes(attributes);
            this.f18339e.show();
            this.f18339e.setContentView(inflate);
            return;
        }
        alertDialog.show();
    }

    /* renamed from: b0 */
    private void m24503b0() {
        runOnUiThread(new C10350y(this));
    }

    /* renamed from: Y */
    public /* synthetic */ void mo32302Y(View view) {
        AlertDialog alertDialog = this.f18339e;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
    }

    /* renamed from: Z */
    public /* synthetic */ void mo32303Z() {
        boolean Q = this.f18338d.mo23408d0().mo27659Q();
        boolean Q2 = this.f18338d.mo27756v2().mo27659Q();
        this.f18336b.setImageResource(Q ? R$drawable.icon_yeelight_switch_point_on_new : R$drawable.icon_yeelight_switch_point_off_new);
        this.f18337c.setImageResource(Q2 ? R$drawable.icon_yeelight_switch_point_on_new : R$drawable.icon_yeelight_switch_point_off_new);
    }

    public void onClick(View view) {
        int id = view.getId();
        if (id == R$id.img_back_view) {
            onBackPressed();
            return;
        }
        if (id == R$id.img_switch_light) {
            this.f18340f = true;
            if (this.f18338d.mo23408d0().mo27659Q()) {
                this.f18338d.mo23424v(false);
                return;
            }
        } else if (id == R$id.img_switch_fan) {
            this.f18340f = false;
            if (this.f18338d.mo27756v2().mo27659Q()) {
                this.f18338d.mo27751q2(false);
                return;
            }
        } else {
            return;
        }
        m24502a0();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C10547m.m25758h(true, this);
        setContentView(R$layout.activity_fancl_flex_switch_setting);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        findViewById(R$id.title_view).setLayoutParams(layoutParams);
        layoutParams.setMargins(0, C10547m.m25755e(this), 0, 0);
        this.f18336b = (ImageView) findViewById(R$id.img_switch_light);
        this.f18337c = (ImageView) findViewById(R$id.img_switch_fan);
        Intent intent = getIntent();
        if (!intent.hasExtra("com.yeelight.cherry.device_id")) {
            C4308b.m12141t(f18335h, "Activity has not device id", false);
            finish();
            return;
        }
        C6033g gVar = (C6033g) C4257w.m11945h0(intent.getStringExtra("com.yeelight.cherry.device_id"));
        this.f18338d = gVar;
        if (gVar == null || !gVar.mo23331k0()) {
            BaseActivity.m24384U(this);
            finish();
            return;
        }
        findViewById(R$id.img_back_view).setOnClickListener(this);
        this.f18336b.setOnClickListener(this);
        this.f18337c.setOnClickListener(this);
        m24503b0();
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        AlertDialog alertDialog = this.f18339e;
        if (alertDialog != null && alertDialog.isShowing()) {
            this.f18339e.dismiss();
        }
        super.onDestroy();
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        this.f18338d.mo23400W0(this);
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        this.f18338d.mo23365B0(this);
    }

    public void onStatusChange(int i, C6024e eVar) {
        if (i == 4096) {
            m24503b0();
        }
    }
}
