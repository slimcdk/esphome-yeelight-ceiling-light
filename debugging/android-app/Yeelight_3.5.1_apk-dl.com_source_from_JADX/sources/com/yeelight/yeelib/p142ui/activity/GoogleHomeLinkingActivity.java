package com.yeelight.yeelib.p142ui.activity;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.yeelight.yeelib.R$id;
import com.yeelight.yeelib.R$layout;
import p051j4.C9193k;

/* renamed from: com.yeelight.yeelib.ui.activity.GoogleHomeLinkingActivity */
public class GoogleHomeLinkingActivity extends BaseActivity implements View.OnClickListener {
    public void onClick(View view) {
        if (view.getId() == R$id.tv_google || view.getId() == R$id.img_google) {
            startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://madeby.google.com/home-app/?deeplink=setup%2Fha_linking%3Fagent_id%3Dyeelight-975f2")));
        } else if (view.getId() == R$id.img_back_view) {
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R$layout.activity_google_home_linking);
        C9193k.m22157h(true, this);
        ButterKnife.bind((Activity) this);
        TextView textView = (TextView) findViewById(R$id.tv_google);
        findViewById(R$id.img_google).setOnClickListener(this);
        findViewById(R$id.img_back_view).setOnClickListener(this);
        textView.setOnClickListener(this);
        textView.setText(Html.fromHtml("<u>" + textView.getText().toString() + "</u>"));
    }
}
