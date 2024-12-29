package com.yeelight.yeelib.p194ui.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.yeelight.yeelib.R$color;
import com.yeelight.yeelib.R$id;
import com.yeelight.yeelib.R$layout;
import com.yeelight.yeelib.R$string;
import com.yeelight.yeelib.p194ui.view.CommonTitleBar;
import com.yeelight.yeelib.utils.C10547m;

/* renamed from: com.yeelight.yeelib.ui.activity.FeedbackSuccessActivity */
public class FeedbackSuccessActivity extends BaseActivity {

    /* renamed from: b */
    private CommonTitleBar f18361b;

    /* renamed from: c */
    private Button f18362c;

    /* renamed from: com.yeelight.yeelib.ui.activity.FeedbackSuccessActivity$a */
    class C10028a implements View.OnClickListener {
        C10028a() {
        }

        public void onClick(View view) {
            FeedbackSuccessActivity.this.finish();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.FeedbackSuccessActivity$b */
    class C10029b implements View.OnClickListener {
        C10029b() {
        }

        public void onClick(View view) {
            FeedbackSuccessActivity.this.finish();
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo32193P();
        C10547m.m25758h(true, this);
        setContentView(R$layout.activity_feedback_success);
        this.f18361b = (CommonTitleBar) findViewById(R$id.title_bar);
        this.f18362c = (Button) findViewById(R$id.btn_complete);
        this.f18361b.mo32825a(getString(R$string.feature_feedback), new C10028a(), (View.OnClickListener) null);
        this.f18361b.setTitleTextColor(R$color.common_text_color_primary_33);
        this.f18362c.setOnClickListener(new C10029b());
    }
}
