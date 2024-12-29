package com.yeelight.yeelib.p142ui.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.yeelight.yeelib.R$color;
import com.yeelight.yeelib.R$id;
import com.yeelight.yeelib.R$layout;
import com.yeelight.yeelib.R$string;
import com.yeelight.yeelib.p142ui.view.CommonTitleBar;
import p051j4.C9193k;

/* renamed from: com.yeelight.yeelib.ui.activity.FeedbackSuccessActivity */
public class FeedbackSuccessActivity extends BaseActivity {

    /* renamed from: a */
    private CommonTitleBar f14669a;

    /* renamed from: b */
    private Button f14670b;

    /* renamed from: com.yeelight.yeelib.ui.activity.FeedbackSuccessActivity$a */
    class C8446a implements View.OnClickListener {
        C8446a() {
        }

        public void onClick(View view) {
            FeedbackSuccessActivity.this.finish();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.FeedbackSuccessActivity$b */
    class C8447b implements View.OnClickListener {
        C8447b() {
        }

        public void onClick(View view) {
            FeedbackSuccessActivity.this.finish();
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo35653P();
        C9193k.m22157h(true, this);
        setContentView(R$layout.activity_feedback_success);
        this.f14669a = (CommonTitleBar) findViewById(R$id.title_bar);
        this.f14670b = (Button) findViewById(R$id.btn_complete);
        this.f14669a.mo36195a(getString(R$string.feature_feedback), new C8446a(), (View.OnClickListener) null);
        this.f14669a.setTitleTextColor(R$color.common_text_color_primary_33);
        this.f14670b.setOnClickListener(new C8447b());
    }
}
