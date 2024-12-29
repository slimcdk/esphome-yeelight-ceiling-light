package com.yeelight.cherry.p141ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.squareup.picasso.Picasso;
import com.yeelight.cherry.C12225R$id;
import com.yeelight.cherry.C12228R$layout;
import com.yeelight.yeelib.managers.C3051a;
import com.yeelight.yeelib.managers.C3108x;
import com.yeelight.yeelib.p142ui.activity.BaseActivity;
import com.yeelight.yeelib.p142ui.view.CircleImageView;
import com.yeelight.yeelib.p142ui.view.CommonTitleBar;
import com.yeelight.yeelib.utils.AppUtils;
import p051j4.C9193k;

/* renamed from: com.yeelight.cherry.ui.activity.AccountCenterActivity */
public class AccountCenterActivity extends BaseActivity implements C3051a.C3052i {

    /* renamed from: a */
    Button f9789a;

    /* renamed from: b */
    CircleImageView f9790b;

    /* renamed from: c */
    TextView f9791c;

    /* renamed from: d */
    TextView f9792d;

    /* renamed from: e */
    int f9793e = 0;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public Handler f9794f = new C5008a();

    /* renamed from: com.yeelight.cherry.ui.activity.AccountCenterActivity$a */
    class C5008a extends Handler {
        C5008a() {
        }

        public void handleMessage(Message message) {
            if (message.what == 1) {
                AccountCenterActivity.this.f9793e = 0;
            }
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.AccountCenterActivity$b */
    class C5009b implements View.OnClickListener {
        C5009b() {
        }

        public void onClick(View view) {
            AccountCenterActivity.this.onBackPressed();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.AccountCenterActivity$c */
    class C5010c implements View.OnClickListener {
        C5010c(AccountCenterActivity accountCenterActivity) {
        }

        public void onClick(View view) {
            C3051a.m7925r().mo23354D();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.AccountCenterActivity$d */
    class C5011d implements View.OnClickListener {
        C5011d() {
        }

        public void onClick(View view) {
            if (!AppUtils.f4977a) {
                AccountCenterActivity accountCenterActivity = AccountCenterActivity.this;
                accountCenterActivity.f9793e++;
                accountCenterActivity.f9794f.removeMessages(1);
                AccountCenterActivity accountCenterActivity2 = AccountCenterActivity.this;
                if (accountCenterActivity2.f9793e >= 10) {
                    accountCenterActivity2.f9793e = 0;
                    AppUtils.f4977a = true;
                    AppUtils.m8297r(true);
                    AccountCenterActivity accountCenterActivity3 = AccountCenterActivity.this;
                    Toast.makeText(accountCenterActivity3, accountCenterActivity3.getString(2131755444), 0).show();
                    return;
                }
                accountCenterActivity2.f9794f.sendEmptyMessageDelayed(1, 500);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: X */
    public /* synthetic */ void m15772X(View view) {
        startActivity(new Intent(this, AccountManageActivity.class));
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

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo35653P();
        C9193k.m22157h(true, this);
        setContentView(C12228R$layout.activity_account_center);
        CommonTitleBar commonTitleBar = (CommonTitleBar) findViewById(2131297591);
        commonTitleBar.mo36195a(getString(2131756384), new C5009b(), (View.OnClickListener) null);
        commonTitleBar.setTitleTextSize(16);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        commonTitleBar.setLayoutParams(layoutParams);
        layoutParams.setMargins(0, C9193k.m22154e(this), 0, 0);
        this.f9789a = (Button) findViewById(C12225R$id.button_logout);
        this.f9790b = (CircleImageView) findViewById(C12225R$id.user_avatar_view);
        this.f9791c = (TextView) findViewById(C12225R$id.user_name_view);
        this.f9792d = (TextView) findViewById(C12225R$id.user_id_view);
        this.f9789a.setOnClickListener(new C5010c(this));
        findViewById(C12225R$id.button_account_service).setOnClickListener(new C5764h(this));
        if (TextUtils.isEmpty(C3051a.m7925r().mo23363p())) {
            this.f9790b.setImageResource(2131231281);
        } else {
            Picasso.m12253o(C3108x.f4951e).mo28111j(C3051a.m7925r().mo23363p()).mo28225f(2131231281).mo28223d(this.f9790b);
        }
        this.f9791c.setText(C3051a.m7925r().mo23367w());
        this.f9792d.setText(C3051a.m7925r().mo23366v());
        this.f9792d.setOnClickListener(new C5011d());
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
