package com.yeelight.cherry.p177ui.activity;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.yeelight.cherry.C11748R$layout;
import com.yeelight.yeelib.p194ui.activity.BaseActivity;
import com.yeelight.yeelib.p194ui.activity.YeelightWebviewActivity;
import com.yeelight.yeelib.utils.C4311i;

/* renamed from: com.yeelight.cherry.ui.activity.GoogleSeamlessActivity */
public class GoogleSeamlessActivity extends BaseActivity {
    @BindView(2131297484)
    TextView mTvGoogleSetup;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C11748R$layout.activity_google_seamless);
        ButterKnife.bind((Activity) this);
        TextView textView = this.mTvGoogleSetup;
        textView.setText(Html.fromHtml("<u>" + this.mTvGoogleSetup.getText().toString() + "</u>"));
    }

    /* access modifiers changed from: protected */
    @OnClick({2131296771, 2131296427, 2131297484})
    public void onViewClick(View view) {
        int id = view.getId();
        if (id == 2131296427) {
            startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://madeby.google.com/home-app/")));
            C4311i.m12155f();
        } else if (id == 2131296771) {
            onBackPressed();
        } else if (id == 2131297484) {
            Intent intent = new Intent(this, YeelightWebviewActivity.class);
            intent.putExtra("url_index", 32);
            startActivity(intent);
            C4311i.m12156g();
        }
    }
}
