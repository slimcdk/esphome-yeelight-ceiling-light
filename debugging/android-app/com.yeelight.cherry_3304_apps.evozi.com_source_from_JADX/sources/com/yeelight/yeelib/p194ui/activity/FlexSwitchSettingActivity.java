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
import android.widget.TextView;
import com.yeelight.yeelib.R$drawable;
import com.yeelight.yeelib.R$id;
import com.yeelight.yeelib.R$layout;
import com.yeelight.yeelib.R$string;
import com.yeelight.yeelib.R$style;
import com.yeelight.yeelib.p150c.p151i.C4198d;
import com.yeelight.yeelib.p150c.p151i.C6024e;
import com.yeelight.yeelib.p150c.p183m.C6922j1;
import com.yeelight.yeelib.p152f.C4257w;
import com.yeelight.yeelib.p186e.C9770e;
import com.yeelight.yeelib.utils.C10547m;
import com.yeelight.yeelib.utils.C4308b;

/* renamed from: com.yeelight.yeelib.ui.activity.FlexSwitchSettingActivity */
public class FlexSwitchSettingActivity extends BaseActivity implements View.OnClickListener, C9770e {

    /* renamed from: f */
    private static final String f18386f = FlexSwitchSettingActivity.class.getSimpleName();

    /* renamed from: b */
    ImageView f18387b;

    /* renamed from: c */
    TextView f18388c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C4198d f18389d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public AlertDialog f18390e;

    /* renamed from: com.yeelight.yeelib.ui.activity.FlexSwitchSettingActivity$a */
    class C10037a implements View.OnClickListener {
        C10037a() {
        }

        public void onClick(View view) {
            if (FlexSwitchSettingActivity.this.f18390e != null) {
                FlexSwitchSettingActivity.this.f18390e.dismiss();
            }
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.FlexSwitchSettingActivity$b */
    class C10038b implements View.OnClickListener {
        C10038b() {
        }

        public void onClick(View view) {
            FlexSwitchSettingActivity.this.f18389d.mo23424v(true);
            if (FlexSwitchSettingActivity.this.f18390e != null) {
                FlexSwitchSettingActivity.this.f18390e.dismiss();
            }
        }
    }

    /* renamed from: Y */
    private void m24521Y() {
        AlertDialog alertDialog = this.f18390e;
        if (alertDialog == null) {
            View inflate = LayoutInflater.from(this).inflate(R$layout.dialog_flex_switch, (ViewGroup) null, false);
            inflate.findViewById(R$id.btn_left).setOnClickListener(new C10037a());
            inflate.findViewById(R$id.btn_right).setOnClickListener(new C10038b());
            AlertDialog create = new AlertDialog.Builder(this, R$style.Theme_Transparent).create();
            this.f18390e = create;
            create.requestWindowFeature(1);
            this.f18390e.setCancelable(false);
            Display defaultDisplay = getWindowManager().getDefaultDisplay();
            WindowManager.LayoutParams attributes = this.f18390e.getWindow().getAttributes();
            attributes.height = -2;
            double width = (double) defaultDisplay.getWidth();
            Double.isNaN(width);
            attributes.width = (int) (width * 0.78d);
            this.f18390e.getWindow().setAttributes(attributes);
            this.f18390e.show();
            this.f18390e.setContentView(inflate);
            return;
        }
        alertDialog.show();
    }

    /* renamed from: Z */
    private void m24522Z() {
        runOnUiThread(new C10352z(this));
    }

    /* renamed from: X */
    public /* synthetic */ void mo32324X() {
        this.f18387b.setImageResource(this.f18389d.mo23408d0().mo27659Q() ? R$drawable.icon_yeelight_switch_point_on_new : R$drawable.icon_yeelight_switch_point_off_new);
    }

    public void onClick(View view) {
        int id = view.getId();
        if (id == R$id.img_back_view) {
            onBackPressed();
        } else if (id != R$id.img_switch_view) {
        } else {
            if (this.f18389d.mo23408d0().mo27659Q()) {
                this.f18389d.mo23424v(false);
            } else {
                m24521Y();
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        TextView textView;
        int i;
        super.onCreate(bundle);
        C10547m.m25758h(true, this);
        setContentView(R$layout.activity_flex_switch_setting);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        findViewById(R$id.title_view).setLayoutParams(layoutParams);
        layoutParams.setMargins(0, C10547m.m25755e(this), 0, 0);
        this.f18387b = (ImageView) findViewById(R$id.img_switch_view);
        this.f18388c = (TextView) findViewById(R$id.tv_desc1);
        Intent intent = getIntent();
        if (!intent.hasExtra("com.yeelight.cherry.device_id")) {
            C4308b.m12141t(f18386f, "Activity has not device id", false);
            finish();
            return;
        }
        C4198d h0 = C4257w.m11945h0(intent.getStringExtra("com.yeelight.cherry.device_id"));
        this.f18389d = h0;
        if (h0 == null || !h0.mo23331k0()) {
            BaseActivity.m24384U(this);
            finish();
            return;
        }
        if (this.f18389d instanceof C6922j1) {
            textView = this.f18388c;
            i = R$string.settings_flex_switch_tm_sw1_hint1;
        } else {
            textView = this.f18388c;
            i = R$string.settings_flex_switch_tm_hint1;
        }
        textView.setText(i);
        findViewById(R$id.img_back_view).setOnClickListener(this);
        this.f18387b.setOnClickListener(this);
        m24522Z();
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        AlertDialog alertDialog = this.f18390e;
        if (alertDialog != null && alertDialog.isShowing()) {
            this.f18390e.dismiss();
        }
        super.onDestroy();
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        this.f18389d.mo23400W0(this);
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        this.f18389d.mo23365B0(this);
    }

    public void onStatusChange(int i, C6024e eVar) {
        if (i == 4096) {
            m24522Z();
        }
    }
}
