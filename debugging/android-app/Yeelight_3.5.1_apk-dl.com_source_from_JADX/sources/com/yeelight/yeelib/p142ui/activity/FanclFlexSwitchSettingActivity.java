package com.yeelight.yeelib.p142ui.activity;

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
import com.yeelight.yeelib.device.base.DeviceStatusBase;
import com.yeelight.yeelib.managers.YeelightDeviceManager;
import com.yeelight.yeelib.utils.AppUtils;
import p051j4.C9193k;
import p150e4.C8982k;
import p150e4.C8983l;
import p207s3.C10337c;
import p237z3.C12145e;

/* renamed from: com.yeelight.yeelib.ui.activity.FanclFlexSwitchSettingActivity */
public class FanclFlexSwitchSettingActivity extends BaseActivity implements View.OnClickListener, C12145e {

    /* renamed from: g */
    private static final String f14643g = FanclFlexSwitchSettingActivity.class.getSimpleName();

    /* renamed from: a */
    ImageView f14644a;

    /* renamed from: b */
    ImageView f14645b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C10337c f14646c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public AlertDialog f14647d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public boolean f14648e;

    /* renamed from: f */
    private View.OnClickListener f14649f = new C8439a();

    /* renamed from: com.yeelight.yeelib.ui.activity.FanclFlexSwitchSettingActivity$a */
    class C8439a implements View.OnClickListener {
        C8439a() {
        }

        public void onClick(View view) {
            if (FanclFlexSwitchSettingActivity.this.f14648e) {
                FanclFlexSwitchSettingActivity.this.f14646c.mo23238v(true);
            } else {
                FanclFlexSwitchSettingActivity.this.f14646c.mo41899q2(true);
            }
            if (FanclFlexSwitchSettingActivity.this.f14647d != null) {
                FanclFlexSwitchSettingActivity.this.f14647d.dismiss();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a0 */
    public /* synthetic */ void m20094a0(View view) {
        AlertDialog alertDialog = this.f14647d;
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b0 */
    public /* synthetic */ void m20095b0() {
        boolean R = this.f14646c.mo23221d0().mo31560R();
        boolean R2 = this.f14646c.mo41904v2().mo31560R();
        this.f14644a.setImageResource(R ? R$drawable.icon_yeelight_switch_point_on_new : R$drawable.icon_yeelight_switch_point_off_new);
        this.f14645b.setImageResource(R2 ? R$drawable.icon_yeelight_switch_point_on_new : R$drawable.icon_yeelight_switch_point_off_new);
    }

    /* renamed from: c0 */
    private void m20096c0() {
        AlertDialog alertDialog = this.f14647d;
        if (alertDialog == null) {
            View inflate = LayoutInflater.from(this).inflate(R$layout.dialog_flex_switch, (ViewGroup) null, false);
            inflate.findViewById(R$id.btn_left).setOnClickListener(new C8982k(this));
            inflate.findViewById(R$id.btn_right).setOnClickListener(this.f14649f);
            AlertDialog create = new AlertDialog.Builder(this, R$style.Theme_Transparent).create();
            this.f14647d = create;
            create.requestWindowFeature(1);
            this.f14647d.setCancelable(false);
            Display defaultDisplay = getWindowManager().getDefaultDisplay();
            WindowManager.LayoutParams attributes = this.f14647d.getWindow().getAttributes();
            attributes.height = -2;
            double width = (double) defaultDisplay.getWidth();
            Double.isNaN(width);
            attributes.width = (int) (width * 0.78d);
            this.f14647d.getWindow().setAttributes(attributes);
            this.f14647d.show();
            this.f14647d.setContentView(inflate);
            return;
        }
        alertDialog.show();
    }

    /* renamed from: d0 */
    private void m20097d0() {
        runOnUiThread(new C8983l(this));
    }

    public void onClick(View view) {
        int id = view.getId();
        if (id == R$id.img_back_view) {
            onBackPressed();
            return;
        }
        if (id == R$id.img_switch_light) {
            this.f14648e = true;
            if (this.f14646c.mo23221d0().mo31560R()) {
                this.f14646c.mo23238v(false);
                return;
            }
        } else if (id == R$id.img_switch_fan) {
            this.f14648e = false;
            if (this.f14646c.mo41904v2().mo31560R()) {
                this.f14646c.mo41899q2(false);
                return;
            }
        } else {
            return;
        }
        m20096c0();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C9193k.m22157h(true, this);
        setContentView(R$layout.activity_fancl_flex_switch_setting);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        findViewById(R$id.title_view).setLayoutParams(layoutParams);
        layoutParams.setMargins(0, C9193k.m22154e(this), 0, 0);
        this.f14644a = (ImageView) findViewById(R$id.img_switch_light);
        this.f14645b = (ImageView) findViewById(R$id.img_switch_fan);
        Intent intent = getIntent();
        if (!intent.hasExtra("com.yeelight.cherry.device_id")) {
            AppUtils.m8302w(f14643g, "Activity has not device id", false);
            finish();
            return;
        }
        C10337c cVar = (C10337c) YeelightDeviceManager.m7794j0(intent.getStringExtra("com.yeelight.cherry.device_id"));
        this.f14646c = cVar;
        if (cVar == null || !cVar.mo23145k0()) {
            BaseActivity.m19947U(this);
            finish();
            return;
        }
        findViewById(R$id.img_back_view).setOnClickListener(this);
        this.f14644a.setOnClickListener(this);
        this.f14645b.setOnClickListener(this);
        m20097d0();
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        AlertDialog alertDialog = this.f14647d;
        if (alertDialog != null && alertDialog.isShowing()) {
            this.f14647d.dismiss();
        }
        super.onDestroy();
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        this.f14646c.mo23213W0(this);
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        this.f14646c.mo23178B0(this);
    }

    public void onStatusChange(int i, DeviceStatusBase deviceStatusBase) {
        if (i == 4096) {
            m20097d0();
        }
    }
}
