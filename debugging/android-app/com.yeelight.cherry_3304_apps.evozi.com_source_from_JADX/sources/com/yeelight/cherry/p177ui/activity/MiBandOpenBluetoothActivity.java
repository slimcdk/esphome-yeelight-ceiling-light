package com.yeelight.cherry.p177ui.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.yeelight.cherry.C11748R$layout;
import com.yeelight.yeelib.p194ui.activity.BaseActivity;
import com.yeelight.yeelib.utils.C10547m;
import com.yeelight.yeelib.utils.C4308b;

/* renamed from: com.yeelight.cherry.ui.activity.MiBandOpenBluetoothActivity */
public class MiBandOpenBluetoothActivity extends BaseActivity {

    /* renamed from: c */
    private static final String f11330c = MiBandOpenBluetoothActivity.class.getSimpleName();

    /* renamed from: b */
    private int f11331b;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C11748R$layout.activity_mi_band_open_bluetooth);
        ButterKnife.bind((Activity) this);
        if (getIntent() != null) {
            this.f11331b = getIntent().getIntExtra("deviceType", 0);
        }
        C10547m.m25758h(true, this);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        findViewById(2131297431).setLayoutParams(layoutParams);
        layoutParams.setMargins(0, C10547m.m25755e(this), 0, 0);
        Intent intent = getIntent();
        if (intent != null && !intent.hasExtra("com.yeelight.cherry.device_id")) {
            C4308b.m12141t(f11330c, "Activity has not device id", false);
            finish();
        }
    }

    @OnClick({2131296425, 2131296772})
    public void onViewClicked(View view) {
        Intent intent;
        int id = view.getId();
        if (id == 2131296425) {
            int i = this.f11331b;
            if (i == 1) {
                intent = new Intent(this, MiBandSearchActivity.class);
            } else if (i == 2) {
                intent = new Intent(this, BleMiBandSearchActivity.class);
            } else {
                return;
            }
            intent.putExtra("com.yeelight.cherry.device_id", getIntent().getStringExtra("com.yeelight.cherry.device_id"));
            startActivity(intent);
        } else if (id != 2131296772) {
            return;
        }
        finish();
    }
}
