package com.yeelight.cherry.p141ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.yeelight.cherry.C12225R$id;
import com.yeelight.cherry.C12228R$layout;
import com.yeelight.yeelib.device.base.C3010c;
import com.yeelight.yeelib.managers.C3051a;
import com.yeelight.yeelib.managers.C8274f;
import com.yeelight.yeelib.managers.YeelightDeviceManager;
import com.yeelight.yeelib.p142ui.activity.BaseActivity;
import p051j4.C9193k;

/* renamed from: com.yeelight.cherry.ui.activity.PrivacyWithdrawActivity */
public class PrivacyWithdrawActivity extends BaseActivity implements C3051a.C3052i {

    /* renamed from: com.yeelight.cherry.ui.activity.PrivacyWithdrawActivity$a */
    class C5592a implements View.OnClickListener {
        C5592a() {
        }

        public void onClick(View view) {
            PrivacyWithdrawActivity.this.m16872W();
            C3051a.m7925r().mo23354D();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: W */
    public void m16872W() {
        C8274f.m19527d().mo35215c();
        for (C3010c next : YeelightDeviceManager.m7800o0().mo23289g0()) {
            next.mo23131U0();
            next.mo23163v0();
        }
    }

    /* renamed from: C */
    public void mo23255C(C3051a.C3062k kVar) {
    }

    /* renamed from: H */
    public void mo23262H() {
    }

    /* renamed from: d */
    public void mo23283d() {
    }

    /* renamed from: g */
    public void mo23288g() {
        Intent intent = new Intent(this, WelcomeGuideNewActivity.class);
        intent.setFlags(268468224);
        startActivity(intent);
    }

    /* renamed from: h */
    public void mo23291h() {
    }

    /* renamed from: l */
    public void mo23300l() {
    }

    public void onBackPressed() {
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo35653P();
        C9193k.m22157h(true, this);
        setContentView(C12228R$layout.activity_privacy_withdraw);
        String string = getString(2131756099);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(getResources().getColor(2131099845)), string.indexOf("privacy@yeelight.com"), string.length(), 34);
        ((TextView) findViewById(C12225R$id.text_view_privacy_update)).setText(spannableStringBuilder);
        ((Button) findViewById(C12225R$id.btn_agree)).setOnClickListener(new C5592a());
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        C3051a.m7925r().mo23358M(this);
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        C3051a.m7925r().mo23359N(this);
    }

    /* renamed from: q */
    public void mo23308q(String str) {
    }

    /* renamed from: r */
    public void mo23310r(String str) {
    }
}
