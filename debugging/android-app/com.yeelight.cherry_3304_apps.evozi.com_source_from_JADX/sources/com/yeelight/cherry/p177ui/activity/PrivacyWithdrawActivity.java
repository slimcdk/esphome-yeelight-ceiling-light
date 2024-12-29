package com.yeelight.cherry.p177ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.yeelight.cherry.C11745R$id;
import com.yeelight.cherry.C11748R$layout;
import com.yeelight.yeelib.p150c.p151i.C4198d;
import com.yeelight.yeelib.p152f.C4201a;
import com.yeelight.yeelib.p152f.C4257w;
import com.yeelight.yeelib.p152f.C9786f;
import com.yeelight.yeelib.p194ui.activity.BaseActivity;
import com.yeelight.yeelib.utils.C10547m;

/* renamed from: com.yeelight.cherry.ui.activity.PrivacyWithdrawActivity */
public class PrivacyWithdrawActivity extends BaseActivity implements C4201a.C4202i {

    /* renamed from: com.yeelight.cherry.ui.activity.PrivacyWithdrawActivity$a */
    class C5549a implements View.OnClickListener {
        C5549a() {
        }

        public void onClick(View view) {
            PrivacyWithdrawActivity.this.m16882W();
            C4201a.m11607r().mo23440D();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: W */
    public void m16882W() {
        C9786f.m23727d().mo31639c();
        for (C4198d next : C4257w.m11947l0().mo23665e0()) {
            next.mo23317U0();
            next.mo23349v0();
        }
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
        setContentView(C11748R$layout.activity_privacy_withdraw);
        String string = getString(2131756080);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(getResources().getColor(2131099842)), string.indexOf("privacy@yeelight.com"), string.length(), 34);
        ((TextView) findViewById(C11745R$id.text_view_privacy_update)).setText(spannableStringBuilder);
        ((Button) findViewById(C11745R$id.btn_agree)).setOnClickListener(new C5549a());
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
