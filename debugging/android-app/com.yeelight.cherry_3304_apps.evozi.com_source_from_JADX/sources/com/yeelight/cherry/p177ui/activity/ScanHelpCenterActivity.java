package com.yeelight.cherry.p177ui.activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.yeelight.cherry.C11748R$layout;
import com.yeelight.yeelib.p194ui.activity.BaseActivity;
import com.yeelight.yeelib.p194ui.view.CommonTitleBar;
import com.yeelight.yeelib.utils.C10547m;

/* renamed from: com.yeelight.cherry.ui.activity.ScanHelpCenterActivity */
public class ScanHelpCenterActivity extends BaseActivity {
    @BindView(2131297424)
    CommonTitleBar mTitleBar;

    /* renamed from: V */
    public /* synthetic */ void mo26886V(View view) {
        onBackPressed();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C11748R$layout.activity_scan_help_center);
        C10547m.m25758h(true, this);
        ButterKnife.bind((Activity) this);
        this.mTitleBar.mo32825a(getString(2131755213), new C5733k2(this), (View.OnClickListener) null);
        this.mTitleBar.setTitleTextColor(2131099837);
    }
}
