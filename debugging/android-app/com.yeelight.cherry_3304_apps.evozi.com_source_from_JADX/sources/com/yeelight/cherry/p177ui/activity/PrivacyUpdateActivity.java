package com.yeelight.cherry.p177ui.activity;

import android.app.AlertDialog;
import android.content.Intent;
import android.graphics.Paint;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.yeelight.cherry.C11745R$id;
import com.yeelight.cherry.C11748R$layout;
import com.yeelight.yeelib.p150c.p151i.C4198d;
import com.yeelight.yeelib.p152f.C4201a;
import com.yeelight.yeelib.p152f.C4257w;
import com.yeelight.yeelib.p152f.C9786f;
import com.yeelight.yeelib.p152f.C9807q;
import com.yeelight.yeelib.p194ui.activity.BaseActivity;
import com.yeelight.yeelib.p194ui.activity.YeelightWebviewActivity;
import com.yeelight.yeelib.utils.C10547m;

/* renamed from: com.yeelight.cherry.ui.activity.PrivacyUpdateActivity */
public class PrivacyUpdateActivity extends BaseActivity implements C4201a.C4202i {

    /* renamed from: com.yeelight.cherry.ui.activity.PrivacyUpdateActivity$a */
    class C5543a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ImageView f11588a;

        /* renamed from: b */
        final /* synthetic */ Button f11589b;

        C5543a(PrivacyUpdateActivity privacyUpdateActivity, ImageView imageView, Button button) {
            this.f11588a = imageView;
            this.f11589b = button;
        }

        public void onClick(View view) {
            ImageView imageView = this.f11588a;
            imageView.setEnabled(!imageView.isEnabled());
            this.f11589b.setEnabled(this.f11588a.isEnabled());
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.PrivacyUpdateActivity$b */
    class C5544b implements View.OnClickListener {
        C5544b() {
        }

        public void onClick(View view) {
            C9807q.m23812c().mo31678h(true);
            PrivacyUpdateActivity.this.finish();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.PrivacyUpdateActivity$c */
    class C5545c implements View.OnClickListener {
        C5545c() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(PrivacyUpdateActivity.this, YeelightWebviewActivity.class);
            intent.putExtra("url_index", 23);
            PrivacyUpdateActivity.this.startActivity(intent);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.PrivacyUpdateActivity$d */
    class C5546d implements View.OnClickListener {
        C5546d() {
        }

        public void onClick(View view) {
            PrivacyUpdateActivity.this.m16872Y();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.PrivacyUpdateActivity$e */
    class C5547e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AlertDialog f11593a;

        C5547e(PrivacyUpdateActivity privacyUpdateActivity, AlertDialog alertDialog) {
            this.f11593a = alertDialog;
        }

        public void onClick(View view) {
            this.f11593a.dismiss();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.PrivacyUpdateActivity$f */
    class C5548f implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AlertDialog f11594a;

        C5548f(AlertDialog alertDialog) {
            this.f11594a = alertDialog;
        }

        public void onClick(View view) {
            PrivacyUpdateActivity.this.m16871X();
            C4201a.m11607r().mo23440D();
            this.f11594a.dismiss();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: X */
    public void m16871X() {
        C9786f.m23727d().mo31639c();
        for (C4198d next : C4257w.m11947l0().mo23665e0()) {
            next.mo23317U0();
            next.mo23349v0();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: Y */
    public void m16872Y() {
        View inflate = View.inflate(this, C11748R$layout.privacy_update_confirm_layout, (ViewGroup) null);
        inflate.setLayerType(1, (Paint) null);
        AlertDialog create = new AlertDialog.Builder(this, 2131820937).create();
        ((Button) inflate.findViewById(C11745R$id.dialog_btn_cancel)).setOnClickListener(new C5547e(this, create));
        ((Button) inflate.findViewById(C11745R$id.dialog_btn_confirm)).setOnClickListener(new C5548f(create));
        create.requestWindowFeature(1);
        create.setCancelable(false);
        create.show();
        create.setContentView(inflate);
        Display defaultDisplay = getWindowManager().getDefaultDisplay();
        WindowManager.LayoutParams attributes = create.getWindow().getAttributes();
        attributes.height = -2;
        double width = (double) defaultDisplay.getWidth();
        Double.isNaN(width);
        attributes.width = (int) (width * 0.78d);
        create.getWindow().setAttributes(attributes);
    }

    /* renamed from: C */
    public void mo23456C(C4201a.C4212k kVar) {
    }

    /* renamed from: H */
    public void mo23457H() {
    }

    /* renamed from: d */
    public void mo23458d() {
    }

    /* renamed from: g */
    public void mo23459g() {
        Intent intent = new Intent(this, WelcomeGuideNewActivity.class);
        intent.setFlags(268468224);
        startActivity(intent);
    }

    /* renamed from: i */
    public void mo23460i() {
    }

    /* renamed from: l */
    public void mo23461l() {
    }

    public void onBackPressed() {
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo32193P();
        C10547m.m25758h(true, this);
        setContentView(C11748R$layout.activity_privacy_update);
        Button button = (Button) findViewById(C11745R$id.btn_agree);
        ImageView imageView = (ImageView) findViewById(C11745R$id.items_and_conditions_image);
        TextView textView = (TextView) findViewById(C11745R$id.items_and_conditions_privacy);
        imageView.setEnabled(false);
        button.setEnabled(imageView.isEnabled());
        String string = getString(2131756080);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(getResources().getColor(2131099842)), string.indexOf("privacy@yeelight.com"), string.length(), 34);
        ((TextView) findViewById(C11745R$id.text_view_privacy_update)).setText(spannableStringBuilder);
        String string2 = getString(2131756075);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(string2);
        spannableStringBuilder2.setSpan(new ForegroundColorSpan(getResources().getColor(2131099842)), string2.indexOf(getString(2131756077)), string2.length(), 34);
        textView.setText(spannableStringBuilder2);
        ((LinearLayout) findViewById(C11745R$id.items_and_conditions_layout)).setOnClickListener(new C5543a(this, imageView, button));
        button.setOnClickListener(new C5544b());
        textView.setOnClickListener(new C5545c());
        ((Button) findViewById(C11745R$id.btn_disagree)).setOnClickListener(new C5546d());
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        C4201a.m11607r().mo23444M(this);
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        C4201a.m11607r().mo23445N(this);
    }

    /* renamed from: q */
    public void mo23462q(String str) {
    }

    /* renamed from: r */
    public void mo23463r(String str) {
    }
}
