package com.yeelight.yeelib.p142ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.yeelight.yeelib.R$id;
import com.yeelight.yeelib.R$layout;
import com.yeelight.yeelib.R$string;
import com.yeelight.yeelib.device.base.C3010c;
import com.yeelight.yeelib.device.base.C6100g;
import com.yeelight.yeelib.managers.YeelightDeviceManager;
import com.yeelight.yeelib.p142ui.view.CommonTitleBar;
import com.yeelight.yeelib.utils.AppUtils;
import p051j4.C9193k;

/* renamed from: com.yeelight.yeelib.ui.activity.DeviceInfoActivity */
public class DeviceInfoActivity extends BaseActivity {

    /* renamed from: c */
    private static final String f14581c = SetDefaultSaveStateActivity.class.getSimpleName();

    /* renamed from: a */
    CommonTitleBar f14582a;

    /* renamed from: b */
    private C3010c f14583b;

    /* renamed from: com.yeelight.yeelib.ui.activity.DeviceInfoActivity$a */
    class C8409a implements View.OnClickListener {
        C8409a() {
        }

        public void onClick(View view) {
            DeviceInfoActivity.this.onBackPressed();
        }
    }

    /* renamed from: V */
    private String m20049V(int i) {
        int i2 = i / 60;
        int i3 = i2 / 60;
        int i4 = i2 % 60;
        if (i3 > 0) {
            return i3 + getResources().getString(R$string.device_info_life_time_hour) + i4 + getResources().getString(R$string.picker_minite);
        }
        return i4 + getResources().getString(R$string.picker_minite);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo35653P();
        C9193k.m22157h(true, this);
        setContentView(R$layout.activity_device_info);
        this.f14582a = (CommonTitleBar) findViewById(R$id.title_bar);
        Intent intent = getIntent();
        if (!intent.hasExtra("com.yeelight.cherry.device_id")) {
            AppUtils.m8302w(f14581c, "Activity has not device id", false);
        } else {
            C3010c j0 = YeelightDeviceManager.m7794j0(intent.getStringExtra("com.yeelight.cherry.device_id"));
            this.f14583b = j0;
            if (j0 == null) {
                BaseActivity.m19947U(this);
            } else {
                this.f14582a.mo36195a(getString(R$string.feature_device_info), new C8409a(), (View.OnClickListener) null);
                this.f14582a.setTitleTextSize(16);
                TextView textView = (TextView) findViewById(R$id.device_id);
                TextView textView2 = (TextView) findViewById(R$id.device_model);
                ((TextView) findViewById(R$id.life_duration)).setText(m20049V(this.f14583b.mo23221d0().mo31617u()));
                ((TextView) findViewById(R$id.network)).setText(this.f14583b.mo23221d0().mo31548L());
                ((TextView) findViewById(R$id.device_rssi)).setText(this.f14583b.mo23221d0().mo31546K() + "db");
                ((TextView) findViewById(R$id.ip_address)).setText(this.f14583b.mo23221d0().mo31621w());
                ((TextView) findViewById(R$id.mac_address)).setText(this.f14583b.mo23221d0().mo31623x());
                ((TextView) findViewById(R$id.wifi_module_temperature)).setText(this.f14583b.mo23221d0().mo31550M() + getResources().getString(R$string.centigrade));
                C3010c cVar = this.f14583b;
                textView.setText(cVar instanceof C6100g ? ((C6100g) cVar).mo31698M1() : cVar.mo23185G());
                textView2.setText(this.f14583b.mo23208T());
                if (AppUtils.f4977a) {
                    findViewById(R$id.layout_temperature).setVisibility(0);
                    findViewById(R$id.line_separate).setVisibility(0);
                    findViewById(R$id.layout_device_id).setVisibility(0);
                    return;
                }
                findViewById(R$id.layout_temperature).setVisibility(8);
                findViewById(R$id.layout_device_id).setVisibility(8);
                findViewById(R$id.line_separate).setVisibility(8);
                return;
            }
        }
        finish();
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
    }
}
