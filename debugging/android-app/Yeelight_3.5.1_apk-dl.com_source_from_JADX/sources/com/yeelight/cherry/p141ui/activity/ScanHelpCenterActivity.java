package com.yeelight.cherry.p141ui.activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.yeelight.cherry.C12228R$layout;
import com.yeelight.yeelib.p142ui.activity.BaseActivity;
import com.yeelight.yeelib.p142ui.view.CommonTitleBar;
import p051j4.C9193k;

/* renamed from: com.yeelight.cherry.ui.activity.ScanHelpCenterActivity */
public class ScanHelpCenterActivity extends BaseActivity {
    @BindView(2131297591)
    CommonTitleBar mTitleBar;

    /* access modifiers changed from: private */
    /* renamed from: W */
    public /* synthetic */ void m16965W(View view) {
        onBackPressed();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C12228R$layout.activity_scan_help_center);
        C9193k.m22157h(true, this);
        ButterKnife.bind((Activity) this);
        this.mTitleBar.mo36195a(getString(2131755216), new C5762g3(this), (View.OnClickListener) null);
        this.mTitleBar.setTitleTextColor(2131099840);
    }
}
