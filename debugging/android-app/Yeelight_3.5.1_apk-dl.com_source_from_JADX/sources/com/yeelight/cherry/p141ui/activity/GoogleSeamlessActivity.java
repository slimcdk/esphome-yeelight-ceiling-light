package com.yeelight.cherry.p141ui.activity;

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
import com.yeelight.cherry.C12228R$layout;
import com.yeelight.yeelib.p142ui.activity.BaseActivity;
import com.yeelight.yeelib.p142ui.activity.YeelightWebviewActivity;
import p051j4.C3279g;

/* renamed from: com.yeelight.cherry.ui.activity.GoogleSeamlessActivity */
public class GoogleSeamlessActivity extends BaseActivity {
    @BindView(2131297659)
    TextView mTvGoogleSetup;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C12228R$layout.activity_google_seamless);
        ButterKnife.bind((Activity) this);
        TextView textView = this.mTvGoogleSetup;
        textView.setText(Html.fromHtml("<u>" + this.mTvGoogleSetup.getText().toString() + "</u>"));
    }

    /* access modifiers changed from: protected */
    @OnClick({2131296875, 2131296485, 2131297659})
    public void onViewClick(View view) {
        int id = view.getId();
        if (id == 2131296485) {
            startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://madeby.google.com/home-app/")));
            C3279g.m8806f();
        } else if (id == 2131296875) {
            onBackPressed();
        } else if (id == 2131297659) {
            Intent intent = new Intent(this, YeelightWebviewActivity.class);
            intent.putExtra("url_index", 32);
            startActivity(intent);
            C3279g.m8807g();
        }
    }
}
