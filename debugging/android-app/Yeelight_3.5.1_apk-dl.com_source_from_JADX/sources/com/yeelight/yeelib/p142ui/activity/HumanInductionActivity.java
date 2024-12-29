package com.yeelight.yeelib.p142ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.yeelight.yeelib.R$drawable;
import com.yeelight.yeelib.R$id;
import com.yeelight.yeelib.R$layout;
import com.yeelight.yeelib.device.base.C3012e;
import com.yeelight.yeelib.device.base.DeviceStatusBase;
import com.yeelight.yeelib.managers.YeelightDeviceManager;
import com.yeelight.yeelib.utils.AppUtils;
import p051j4.C9193k;
import p150e4.C8986o;
import p237z3.C12145e;

/* renamed from: com.yeelight.yeelib.ui.activity.HumanInductionActivity */
public class HumanInductionActivity extends BaseActivity implements View.OnClickListener, C12145e {

    /* renamed from: c */
    private static final String f14756c = HumanInductionActivity.class.getSimpleName();

    /* renamed from: a */
    ImageView f14757a;

    /* renamed from: b */
    private C3012e f14758b;

    /* access modifiers changed from: private */
    /* renamed from: W */
    public /* synthetic */ void m20144W() {
        this.f14757a.setImageResource(this.f14758b.mo23221d0().mo31568V() ? R$drawable.icon_yeelight_switch_point_on_new : R$drawable.icon_yeelight_switch_point_off_new);
    }

    /* renamed from: X */
    private void m20145X() {
        runOnUiThread(new C8986o(this));
    }

    public void onClick(View view) {
        int id = view.getId();
        if (id == R$id.img_back_view) {
            onBackPressed();
        } else if (id == R$id.img_switch_view) {
            C3012e eVar = this.f14758b;
            eVar.mo23244e1(!eVar.mo23221d0().mo31568V());
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C9193k.m22157h(true, this);
        setContentView(R$layout.activity_human_induction);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        findViewById(R$id.title_view).setLayoutParams(layoutParams);
        layoutParams.setMargins(0, C9193k.m22154e(this), 0, 0);
        this.f14757a = (ImageView) findViewById(R$id.img_switch_view);
        Intent intent = getIntent();
        if (!intent.hasExtra("com.yeelight.cherry.device_id")) {
            AppUtils.m8302w(f14756c, "Activity has not device id", false);
            finish();
            return;
        }
        C3012e r0 = YeelightDeviceManager.m7804r0(intent.getStringExtra("com.yeelight.cherry.device_id"));
        this.f14758b = r0;
        if (r0 == null || !r0.mo23145k0()) {
            BaseActivity.m19947U(this);
            finish();
            return;
        }
        findViewById(R$id.img_back_view).setOnClickListener(this);
        this.f14757a.setOnClickListener(this);
        m20145X();
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        this.f14758b.mo23213W0(this);
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        this.f14758b.mo23178B0(this);
    }

    public void onStatusChange(int i, DeviceStatusBase deviceStatusBase) {
        if (i == 4096) {
            m20145X();
        }
    }
}
