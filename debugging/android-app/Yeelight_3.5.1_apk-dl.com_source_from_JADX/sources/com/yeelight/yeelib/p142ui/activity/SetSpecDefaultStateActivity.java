package com.yeelight.yeelib.p142ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.yeelight.cherry.p141ui.activity.DemoControlViewActivity;
import com.yeelight.yeelib.R$color;
import com.yeelight.yeelib.R$drawable;
import com.yeelight.yeelib.R$id;
import com.yeelight.yeelib.R$layout;
import com.yeelight.yeelib.R$string;
import com.yeelight.yeelib.device.base.C6100g;
import com.yeelight.yeelib.device.base.C6117h;
import com.yeelight.yeelib.device.base.DeviceStatusBase;
import com.yeelight.yeelib.managers.YeelightDeviceManager;
import com.yeelight.yeelib.p142ui.view.CommonTitleBar;
import com.yeelight.yeelib.utils.AppUtils;
import p051j4.C9193k;
import p150e4.C8993v;
import p150e4.C8994w;
import p150e4.C8995x;
import p150e4.C8996y;
import p150e4.C8997z;
import p237z3.C12145e;

/* renamed from: com.yeelight.yeelib.ui.activity.SetSpecDefaultStateActivity */
public class SetSpecDefaultStateActivity extends BaseActivity implements C12145e {

    /* renamed from: i */
    private static final String f15213i = "SetSpecDefaultStateActivity";

    /* renamed from: a */
    CommonTitleBar f15214a;

    /* renamed from: b */
    ImageView f15215b;

    /* renamed from: c */
    LinearLayout f15216c;

    /* renamed from: d */
    LinearLayout f15217d;

    /* renamed from: e */
    TextView f15218e;

    /* renamed from: f */
    ImageView f15219f;

    /* renamed from: g */
    TextView f15220g;

    /* renamed from: h */
    private C6100g f15221h;

    /* renamed from: a0 */
    private String m20404a0() {
        if (!(this.f15221h instanceof C6117h)) {
            return getResources().getString(R$string.switch1_on_from_power);
        }
        return String.format(getResources().getString(R$string.switch1_on_from_power_device), new Object[]{Integer.valueOf(((C6117h) this.f15221h).mo31738p2() + 1)});
    }

    /* renamed from: b0 */
    private void m20405b0() {
        String T = this.f15221h.mo23208T();
        T.hashCode();
        int i = 0;
        boolean z = T.equals("yeelink.light.ml1") || T.equals("yeelink.light.ml2");
        LinearLayout linearLayout = this.f15216c;
        if (!z) {
            i = 4;
        }
        linearLayout.setVisibility(i);
    }

    /* renamed from: c0 */
    private boolean m20406c0() {
        return this.f15221h.mo23211V();
    }

    /* access modifiers changed from: private */
    /* renamed from: d0 */
    public /* synthetic */ void m20407d0(View view) {
        onBackPressed();
    }

    /* access modifiers changed from: private */
    /* renamed from: e0 */
    public /* synthetic */ void m20408e0(View view) {
        C6100g gVar = this.f15221h;
        gVar.mo31730c2(!gVar.mo23221d0().mo31586e0());
    }

    /* access modifiers changed from: private */
    /* renamed from: f0 */
    public /* synthetic */ void m20409f0(View view) {
        this.f15221h.mo31726Y1(m20406c0() ^ true ? 1 : 0);
    }

    /* access modifiers changed from: private */
    /* renamed from: g0 */
    public /* synthetic */ void m20410g0(View view) {
        Class<DemoControlViewActivity> cls = DemoControlViewActivity.class;
        try {
            int i = DemoControlViewActivity.f10265p;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            cls = null;
        }
        if (cls != null) {
            Intent intent = new Intent();
            intent.setClass(this, cls);
            intent.putExtra("com.yeelight.cherry.device_id", this.f15221h.mo23185G());
            intent.putExtra("set_device_default", true);
            startActivityForResult(intent, 100);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: h0 */
    public /* synthetic */ void m20411h0() {
        C8993v vVar;
        LinearLayout linearLayout;
        this.f15219f.setImageResource(m20406c0() ? R$drawable.icon_yeelight_switch_point_on_new : R$drawable.icon_yeelight_switch_point_off_new);
        if (this.f15221h.mo23221d0().mo31586e0()) {
            this.f15215b.setImageResource(R$drawable.icon_yeelight_switch_point_on_new);
            this.f15218e.setTextColor(getResources().getColor(R$color.common_text_color_not_clickable_cc));
            linearLayout = this.f15217d;
            vVar = null;
        } else {
            this.f15215b.setImageResource(R$drawable.icon_yeelight_switch_point_off_new);
            this.f15218e.setTextColor(getResources().getColor(R$color.common_text_color_primary_33));
            linearLayout = this.f15217d;
            vVar = new C8993v(this);
        }
        linearLayout.setOnClickListener(vVar);
    }

    /* renamed from: i0 */
    private void m20412i0() {
        runOnUiThread(new C8997z(this));
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 100 && i2 == -1 && this.f15221h.mo23160t1()) {
            Toast.makeText(this, getText(R$string.save_default_msg_save_success).toString(), 0).show();
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo35653P();
        C9193k.m22157h(true, this);
        setContentView(R$layout.activity_set_default);
        this.f15214a = (CommonTitleBar) findViewById(R$id.title_bar);
        this.f15215b = (ImageView) findViewById(R$id.img_switch_view);
        LinearLayout linearLayout = (LinearLayout) findViewById(R$id.automatic_recovery_layout);
        this.f15217d = (LinearLayout) findViewById(R$id.default_state_layout);
        this.f15218e = (TextView) findViewById(R$id.default_state_title);
        LinearLayout linearLayout2 = (LinearLayout) findViewById(R$id.automatic_power_on);
        this.f15219f = (ImageView) findViewById(R$id.img_switch_on_from_power);
        this.f15216c = (LinearLayout) findViewById(R$id.ll_recover);
        this.f15220g = (TextView) findViewById(R$id.on_from_power);
        Intent intent = getIntent();
        if (!intent.hasExtra("com.yeelight.cherry.device_id")) {
            AppUtils.m8302w(f15213i, "Activity has not device id", false);
            finish();
            return;
        }
        C6100g gVar = (C6100g) YeelightDeviceManager.m7794j0(intent.getStringExtra("com.yeelight.cherry.device_id"));
        this.f15221h = gVar;
        if (gVar == null) {
            BaseActivity.m19947U(this);
            finish();
            return;
        }
        this.f15214a.mo36195a(getString(R$string.feature_set_default), new C8996y(this), (View.OnClickListener) null);
        this.f15215b.setOnClickListener(new C8994w(this));
        this.f15220g.setText(m20404a0());
        m20405b0();
        m20412i0();
        this.f15219f.setOnClickListener(new C8995x(this));
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        this.f15221h.mo23213W0(this);
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        if (this.f15221h.mo23145k0()) {
            this.f15221h.mo23178B0(this);
            this.f15221h.mo23167x0();
            return;
        }
        finish();
    }

    public void onStatusChange(int i, DeviceStatusBase deviceStatusBase) {
        if (i == -1 || i == 4096) {
            m20412i0();
        }
    }
}
