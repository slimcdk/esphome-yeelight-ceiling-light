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
import android.widget.TextView;
import com.yeelight.yeelib.R$drawable;
import com.yeelight.yeelib.R$id;
import com.yeelight.yeelib.R$layout;
import com.yeelight.yeelib.R$string;
import com.yeelight.yeelib.R$style;
import com.yeelight.yeelib.device.base.C3010c;
import com.yeelight.yeelib.device.base.DeviceStatusBase;
import com.yeelight.yeelib.managers.YeelightDeviceManager;
import com.yeelight.yeelib.utils.AppUtils;
import p051j4.C9193k;
import p150e4.C8984m;
import p223w3.C11406l1;
import p237z3.C12145e;

/* renamed from: com.yeelight.yeelib.ui.activity.FlexSwitchSettingActivity */
public class FlexSwitchSettingActivity extends BaseActivity implements View.OnClickListener, C12145e {

    /* renamed from: e */
    private static final String f14694e = FlexSwitchSettingActivity.class.getSimpleName();

    /* renamed from: a */
    ImageView f14695a;

    /* renamed from: b */
    TextView f14696b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C3010c f14697c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public AlertDialog f14698d;

    /* renamed from: com.yeelight.yeelib.ui.activity.FlexSwitchSettingActivity$a */
    class C8455a implements View.OnClickListener {
        C8455a() {
        }

        public void onClick(View view) {
            if (FlexSwitchSettingActivity.this.f14698d != null) {
                FlexSwitchSettingActivity.this.f14698d.dismiss();
            }
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.FlexSwitchSettingActivity$b */
    class C8456b implements View.OnClickListener {
        C8456b() {
        }

        public void onClick(View view) {
            FlexSwitchSettingActivity.this.f14697c.mo23238v(true);
            if (FlexSwitchSettingActivity.this.f14698d != null) {
                FlexSwitchSettingActivity.this.f14698d.dismiss();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: Y */
    public /* synthetic */ void m20114Y() {
        this.f14695a.setImageResource(this.f14697c.mo23221d0().mo31560R() ? R$drawable.icon_yeelight_switch_point_on_new : R$drawable.icon_yeelight_switch_point_off_new);
    }

    /* renamed from: Z */
    private void m20115Z() {
        AlertDialog alertDialog = this.f14698d;
        if (alertDialog == null) {
            View inflate = LayoutInflater.from(this).inflate(R$layout.dialog_flex_switch, (ViewGroup) null, false);
            inflate.findViewById(R$id.btn_left).setOnClickListener(new C8455a());
            inflate.findViewById(R$id.btn_right).setOnClickListener(new C8456b());
            AlertDialog create = new AlertDialog.Builder(this, R$style.Theme_Transparent).create();
            this.f14698d = create;
            create.requestWindowFeature(1);
            this.f14698d.setCancelable(false);
            Display defaultDisplay = getWindowManager().getDefaultDisplay();
            WindowManager.LayoutParams attributes = this.f14698d.getWindow().getAttributes();
            attributes.height = -2;
            double width = (double) defaultDisplay.getWidth();
            Double.isNaN(width);
            attributes.width = (int) (width * 0.78d);
            this.f14698d.getWindow().setAttributes(attributes);
            this.f14698d.show();
            this.f14698d.setContentView(inflate);
            return;
        }
        alertDialog.show();
    }

    /* renamed from: a0 */
    private void m20116a0() {
        runOnUiThread(new C8984m(this));
    }

    public void onClick(View view) {
        int id = view.getId();
        if (id == R$id.img_back_view) {
            onBackPressed();
        } else if (id != R$id.img_switch_view) {
        } else {
            if (this.f14697c.mo23221d0().mo31560R()) {
                this.f14697c.mo23238v(false);
            } else {
                m20115Z();
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        TextView textView;
        int i;
        super.onCreate(bundle);
        C9193k.m22157h(true, this);
        setContentView(R$layout.activity_flex_switch_setting);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        findViewById(R$id.title_view).setLayoutParams(layoutParams);
        layoutParams.setMargins(0, C9193k.m22154e(this), 0, 0);
        this.f14695a = (ImageView) findViewById(R$id.img_switch_view);
        this.f14696b = (TextView) findViewById(R$id.tv_desc1);
        Intent intent = getIntent();
        if (!intent.hasExtra("com.yeelight.cherry.device_id")) {
            AppUtils.m8302w(f14694e, "Activity has not device id", false);
            finish();
            return;
        }
        C3010c j0 = YeelightDeviceManager.m7794j0(intent.getStringExtra("com.yeelight.cherry.device_id"));
        this.f14697c = j0;
        if (j0 == null || !j0.mo23145k0()) {
            BaseActivity.m19947U(this);
            finish();
            return;
        }
        if (this.f14697c instanceof C11406l1) {
            textView = this.f14696b;
            i = R$string.settings_flex_switch_tm_sw1_hint1;
        } else {
            textView = this.f14696b;
            i = R$string.settings_flex_switch_tm_hint1;
        }
        textView.setText(i);
        findViewById(R$id.img_back_view).setOnClickListener(this);
        this.f14695a.setOnClickListener(this);
        m20116a0();
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        AlertDialog alertDialog = this.f14698d;
        if (alertDialog != null && alertDialog.isShowing()) {
            this.f14698d.dismiss();
        }
        super.onDestroy();
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        this.f14697c.mo23213W0(this);
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        this.f14697c.mo23178B0(this);
    }

    public void onStatusChange(int i, DeviceStatusBase deviceStatusBase) {
        if (i == 4096) {
            m20116a0();
        }
    }
}
