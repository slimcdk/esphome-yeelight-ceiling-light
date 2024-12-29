package com.yeelight.cherry.p141ui.activity;

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
import com.yeelight.cherry.C12225R$id;
import com.yeelight.cherry.C12228R$layout;
import com.yeelight.yeelib.device.base.C3010c;
import com.yeelight.yeelib.managers.C3051a;
import com.yeelight.yeelib.managers.C8274f;
import com.yeelight.yeelib.managers.C8287q;
import com.yeelight.yeelib.managers.YeelightDeviceManager;
import com.yeelight.yeelib.p142ui.activity.BaseActivity;
import com.yeelight.yeelib.p142ui.activity.YeelightWebviewActivity;
import p051j4.C9193k;

/* renamed from: com.yeelight.cherry.ui.activity.PrivacyUpdateActivity */
public class PrivacyUpdateActivity extends BaseActivity implements C3051a.C3052i {

    /* renamed from: com.yeelight.cherry.ui.activity.PrivacyUpdateActivity$a */
    class C5586a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ ImageView f11153a;

        /* renamed from: b */
        final /* synthetic */ Button f11154b;

        C5586a(PrivacyUpdateActivity privacyUpdateActivity, ImageView imageView, Button button) {
            this.f11153a = imageView;
            this.f11154b = button;
        }

        public void onClick(View view) {
            ImageView imageView = this.f11153a;
            imageView.setEnabled(!imageView.isEnabled());
            this.f11154b.setEnabled(this.f11153a.isEnabled());
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.PrivacyUpdateActivity$b */
    class C5587b implements View.OnClickListener {
        C5587b() {
        }

        public void onClick(View view) {
            C8287q.m19593e().mo35245l(true);
            PrivacyUpdateActivity.this.finish();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.PrivacyUpdateActivity$c */
    class C5588c implements View.OnClickListener {
        C5588c() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(PrivacyUpdateActivity.this, YeelightWebviewActivity.class);
            intent.putExtra("url_index", 23);
            PrivacyUpdateActivity.this.startActivity(intent);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.PrivacyUpdateActivity$d */
    class C5589d implements View.OnClickListener {
        C5589d() {
        }

        public void onClick(View view) {
            PrivacyUpdateActivity.this.m16862Y();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.PrivacyUpdateActivity$e */
    class C5590e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AlertDialog f11158a;

        C5590e(PrivacyUpdateActivity privacyUpdateActivity, AlertDialog alertDialog) {
            this.f11158a = alertDialog;
        }

        public void onClick(View view) {
            this.f11158a.dismiss();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.PrivacyUpdateActivity$f */
    class C5591f implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AlertDialog f11159a;

        C5591f(AlertDialog alertDialog) {
            this.f11159a = alertDialog;
        }

        public void onClick(View view) {
            PrivacyUpdateActivity.this.m16861X();
            C3051a.m7925r().mo23354D();
            this.f11159a.dismiss();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: X */
    public void m16861X() {
        C8274f.m19527d().mo35215c();
        for (C3010c next : YeelightDeviceManager.m7800o0().mo23289g0()) {
            next.mo23131U0();
            next.mo23163v0();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: Y */
    public void m16862Y() {
        View inflate = View.inflate(this, C12228R$layout.privacy_update_confirm_layout, (ViewGroup) null);
        inflate.setLayerType(1, (Paint) null);
        AlertDialog create = new AlertDialog.Builder(this, 2131820942).create();
        ((Button) inflate.findViewById(C12225R$id.dialog_btn_cancel)).setOnClickListener(new C5590e(this, create));
        ((Button) inflate.findViewById(C12225R$id.dialog_btn_confirm)).setOnClickListener(new C5591f(create));
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
        setContentView(C12228R$layout.activity_privacy_update);
        Button button = (Button) findViewById(C12225R$id.btn_agree);
        ImageView imageView = (ImageView) findViewById(C12225R$id.items_and_conditions_image);
        TextView textView = (TextView) findViewById(C12225R$id.items_and_conditions_privacy);
        imageView.setEnabled(false);
        button.setEnabled(imageView.isEnabled());
        String string = getString(2131756099);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(getResources().getColor(2131099845)), string.indexOf("privacy@yeelight.com"), string.length(), 34);
        ((TextView) findViewById(C12225R$id.text_view_privacy_update)).setText(spannableStringBuilder);
        String string2 = getString(2131756094);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(string2);
        spannableStringBuilder2.setSpan(new ForegroundColorSpan(getResources().getColor(2131099845)), string2.indexOf(getString(2131756096)), string2.length(), 34);
        textView.setText(spannableStringBuilder2);
        ((LinearLayout) findViewById(C12225R$id.items_and_conditions_layout)).setOnClickListener(new C5586a(this, imageView, button));
        button.setOnClickListener(new C5587b());
        textView.setOnClickListener(new C5588c());
        ((Button) findViewById(C12225R$id.btn_disagree)).setOnClickListener(new C5589d());
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
