package com.yeelight.yeelib.p194ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.yeelight.yeelib.R$id;
import com.yeelight.yeelib.R$layout;
import com.yeelight.yeelib.R$string;
import com.yeelight.yeelib.p150c.p151i.C4198d;
import com.yeelight.yeelib.p150c.p151i.C6050n;
import com.yeelight.yeelib.p152f.C4257w;
import com.yeelight.yeelib.p194ui.view.CommonTitleBar;
import com.yeelight.yeelib.utils.C10547m;
import com.yeelight.yeelib.utils.C4308b;

/* renamed from: com.yeelight.yeelib.ui.activity.DeviceInfoActivity */
public class DeviceInfoActivity extends BaseActivity {

    /* renamed from: d */
    private static final String f18275d = SetDefaultSaveStateActivity.class.getSimpleName();

    /* renamed from: b */
    CommonTitleBar f18276b;

    /* renamed from: c */
    private C4198d f18277c;

    /* renamed from: com.yeelight.yeelib.ui.activity.DeviceInfoActivity$a */
    class C9992a implements View.OnClickListener {
        C9992a() {
        }

        public void onClick(View view) {
            DeviceInfoActivity.this.onBackPressed();
        }
    }

    /* renamed from: V */
    private String m24466V(int i) {
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
        mo32193P();
        C10547m.m25758h(true, this);
        setContentView(R$layout.activity_device_info);
        this.f18276b = (CommonTitleBar) findViewById(R$id.title_bar);
        Intent intent = getIntent();
        if (!intent.hasExtra("com.yeelight.cherry.device_id")) {
            C4308b.m12141t(f18275d, "Activity has not device id", false);
        } else {
            C4198d h0 = C4257w.m11945h0(intent.getStringExtra("com.yeelight.cherry.device_id"));
            this.f18277c = h0;
            if (h0 == null) {
                BaseActivity.m24384U(this);
            } else {
                this.f18276b.mo32825a(getString(R$string.feature_device_info), new C9992a(), (View.OnClickListener) null);
                this.f18276b.setTitleTextSize(16);
                TextView textView = (TextView) findViewById(R$id.device_id);
                TextView textView2 = (TextView) findViewById(R$id.device_model);
                ((TextView) findViewById(R$id.life_duration)).setText(m24466V(this.f18277c.mo23408d0().mo27716u()));
                ((TextView) findViewById(R$id.network)).setText(this.f18277c.mo23408d0().mo27647K());
                ((TextView) findViewById(R$id.device_rssi)).setText(this.f18277c.mo23408d0().mo27645J() + "db");
                ((TextView) findViewById(R$id.ip_address)).setText(this.f18277c.mo23408d0().mo27720w());
                ((TextView) findViewById(R$id.mac_address)).setText(this.f18277c.mo23408d0().mo27722x());
                ((TextView) findViewById(R$id.wifi_module_temperature)).setText(this.f18277c.mo23408d0().mo27649L() + getResources().getString(R$string.centigrade));
                C4198d dVar = this.f18277c;
                textView.setText(dVar instanceof C6050n ? ((C6050n) dVar).mo27788M1() : dVar.mo23372G());
                textView2.setText(this.f18277c.mo23395T());
                if (C4308b.f7482a) {
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
