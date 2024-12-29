package com.yeelight.cherry.p141ui.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.yeelight.cherry.C12228R$layout;
import com.yeelight.yeelib.p142ui.activity.BaseActivity;
import com.yeelight.yeelib.utils.AppUtils;
import p051j4.C9193k;

/* renamed from: com.yeelight.cherry.ui.activity.MiBandOpenBluetoothActivity */
public class MiBandOpenBluetoothActivity extends BaseActivity {

    /* renamed from: b */
    private static final String f10900b = "MiBandOpenBluetoothActivity";

    /* renamed from: a */
    private int f10901a;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C12228R$layout.activity_mi_band_open_bluetooth);
        ButterKnife.bind((Activity) this);
        if (getIntent() != null) {
            this.f10901a = getIntent().getIntExtra("deviceType", 0);
        }
        C9193k.m22157h(true, this);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        findViewById(2131297598).setLayoutParams(layoutParams);
        layoutParams.setMargins(0, C9193k.m22154e(this), 0, 0);
        Intent intent = getIntent();
        if (intent != null && !intent.hasExtra("com.yeelight.cherry.device_id")) {
            AppUtils.m8302w(f10900b, "Activity has not device id", false);
            finish();
        }
    }

    @OnClick({2131296483, 2131296876})
    public void onViewClicked(View view) {
        Intent intent;
        int id = view.getId();
        if (id == 2131296483) {
            int i = this.f10901a;
            if (i == 1) {
                intent = new Intent(this, MiBandSearchActivity.class);
            } else if (i == 2) {
                intent = new Intent(this, BleMiBandSearchActivity.class);
            } else {
                return;
            }
            intent.putExtra("com.yeelight.cherry.device_id", getIntent().getStringExtra("com.yeelight.cherry.device_id"));
            startActivity(intent);
        } else if (id != 2131296876) {
            return;
        }
        finish();
    }
}
