package com.yeelight.yeelib.p142ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.yeelight.yeelib.R$drawable;
import com.yeelight.yeelib.R$id;
import com.yeelight.yeelib.R$layout;
import com.yeelight.yeelib.device.WifiDeviceBase;
import com.yeelight.yeelib.device.base.DeviceStatusBase;
import com.yeelight.yeelib.managers.YeelightDeviceManager;
import com.yeelight.yeelib.utils.AppUtils;
import p051j4.C9193k;
import p237z3.C12145e;

/* renamed from: com.yeelight.yeelib.ui.activity.GeekModeNewActivity */
public class GeekModeNewActivity extends BaseActivity implements C12145e {

    /* renamed from: e */
    private static final String f14701e = "GeekModeNewActivity";

    /* renamed from: a */
    ImageView f14702a;

    /* renamed from: b */
    ImageView f14703b;

    /* renamed from: c */
    TextView f14704c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public WifiDeviceBase f14705d;

    /* renamed from: com.yeelight.yeelib.ui.activity.GeekModeNewActivity$a */
    class C8457a implements View.OnClickListener {
        C8457a() {
        }

        public void onClick(View view) {
            GeekModeNewActivity.this.onBackPressed();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.GeekModeNewActivity$b */
    class C8458b implements View.OnClickListener {
        C8458b() {
        }

        public void onClick(View view) {
            GeekModeNewActivity.this.f14705d.mo31484M1(!GeekModeNewActivity.this.f14705d.mo23221d0().mo31564T());
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.GeekModeNewActivity$c */
    class C8459c implements View.OnClickListener {
        C8459c() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(view.getContext(), YeelightWebviewActivity.class);
            intent.putExtra("url_index", 14);
            GeekModeNewActivity.this.startActivity(intent);
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.GeekModeNewActivity$d */
    class C8460d implements Runnable {
        C8460d() {
        }

        public void run() {
            int i;
            ImageView imageView;
            if (GeekModeNewActivity.this.f14705d.mo23221d0().mo31564T()) {
                imageView = GeekModeNewActivity.this.f14703b;
                i = R$drawable.icon_yeelight_switch_point_on_new;
            } else {
                imageView = GeekModeNewActivity.this.f14703b;
                i = R$drawable.icon_yeelight_switch_point_off_new;
            }
            imageView.setImageResource(i);
        }
    }

    /* renamed from: W */
    private void m20118W() {
        runOnUiThread(new C8460d());
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo35653P();
        C9193k.m22157h(true, this);
        setContentView(R$layout.activity_geek_mode_new);
        this.f14702a = (ImageView) findViewById(R$id.img_back_view);
        this.f14703b = (ImageView) findViewById(R$id.img_switch_view);
        this.f14704c = (TextView) findViewById(R$id.tv_third_party_protocol);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        findViewById(R$id.title_view).setLayoutParams(layoutParams);
        layoutParams.setMargins(0, C9193k.m22154e(this), 0, 0);
        Intent intent = getIntent();
        if (!intent.hasExtra("com.yeelight.cherry.device_id")) {
            AppUtils.m8302w(f14701e, "Activity has not device id", false);
            finish();
            return;
        }
        WifiDeviceBase P0 = YeelightDeviceManager.m7800o0().mo23274P0(intent.getStringExtra("com.yeelight.cherry.device_id"));
        this.f14705d = P0;
        if (P0 == null || !P0.mo23145k0()) {
            BaseActivity.m19947U(this);
            finish();
            return;
        }
        this.f14702a.setOnClickListener(new C8457a());
        this.f14703b.setOnClickListener(new C8458b());
        this.f14704c.setOnClickListener(new C8459c());
        m20118W();
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        this.f14705d.mo23213W0(this);
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        this.f14705d.mo23178B0(this);
    }

    public void onStatusChange(int i, DeviceStatusBase deviceStatusBase) {
        if (i == -1 || i == 4096) {
            m20118W();
        }
    }
}
