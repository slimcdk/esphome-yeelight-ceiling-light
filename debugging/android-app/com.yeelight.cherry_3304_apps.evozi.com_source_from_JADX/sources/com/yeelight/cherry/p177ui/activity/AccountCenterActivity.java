package com.yeelight.cherry.p177ui.activity;

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
import com.yeelight.cherry.C11745R$id;
import com.yeelight.cherry.C11748R$layout;
import com.yeelight.yeelib.p152f.C4201a;
import com.yeelight.yeelib.p152f.C4297y;
import com.yeelight.yeelib.p194ui.activity.BaseActivity;
import com.yeelight.yeelib.p194ui.view.CircleImageView;
import com.yeelight.yeelib.p194ui.view.CommonTitleBar;
import com.yeelight.yeelib.utils.C10547m;
import com.yeelight.yeelib.utils.C4308b;
import p011c.p083d.p090b.C1203t;
import p011c.p083d.p090b.C1219x;

/* renamed from: com.yeelight.cherry.ui.activity.AccountCenterActivity */
public class AccountCenterActivity extends BaseActivity implements C4201a.C4202i {

    /* renamed from: b */
    Button f10247b;

    /* renamed from: c */
    CircleImageView f10248c;

    /* renamed from: d */
    TextView f10249d;

    /* renamed from: e */
    TextView f10250e;

    /* renamed from: f */
    int f10251f = 0;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public Handler f10252g = new C4964a();

    /* renamed from: com.yeelight.cherry.ui.activity.AccountCenterActivity$a */
    class C4964a extends Handler {
        C4964a() {
        }

        public void handleMessage(Message message) {
            if (message.what == 1) {
                AccountCenterActivity.this.f10251f = 0;
            }
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.AccountCenterActivity$b */
    class C4965b implements View.OnClickListener {
        C4965b() {
        }

        public void onClick(View view) {
            AccountCenterActivity.this.onBackPressed();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.AccountCenterActivity$c */
    class C4966c implements View.OnClickListener {
        C4966c(AccountCenterActivity accountCenterActivity) {
        }

        public void onClick(View view) {
            C4201a.m11607r().mo23440D();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.AccountCenterActivity$d */
    class C4967d implements View.OnClickListener {
        C4967d() {
        }

        public void onClick(View view) {
            if (!C4308b.f7482a) {
                AccountCenterActivity accountCenterActivity = AccountCenterActivity.this;
                accountCenterActivity.f10251f++;
                accountCenterActivity.f10252g.removeMessages(1);
                AccountCenterActivity accountCenterActivity2 = AccountCenterActivity.this;
                if (accountCenterActivity2.f10251f >= 10) {
                    accountCenterActivity2.f10251f = 0;
                    C4308b.f7482a = true;
                    C4308b.m12137p(true);
                    AccountCenterActivity accountCenterActivity3 = AccountCenterActivity.this;
                    Toast.makeText(accountCenterActivity3, accountCenterActivity3.getString(2131755440), 0).show();
                    return;
                }
                accountCenterActivity2.f10252g.sendEmptyMessageDelayed(1, 500);
            }
        }
    }

    static {
        Class<AccountCenterActivity> cls = AccountCenterActivity.class;
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

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo32193P();
        C10547m.m25758h(true, this);
        setContentView(C11748R$layout.activity_account_center);
        CommonTitleBar commonTitleBar = (CommonTitleBar) findViewById(2131297424);
        commonTitleBar.mo32825a(getString(2131756354), new C4965b(), (View.OnClickListener) null);
        commonTitleBar.setTitleTextSize(16);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        commonTitleBar.setLayoutParams(layoutParams);
        layoutParams.setMargins(0, C10547m.m25755e(this), 0, 0);
        this.f10247b = (Button) findViewById(C11745R$id.button_logout);
        this.f10248c = (CircleImageView) findViewById(C11745R$id.user_avatar_view);
        this.f10249d = (TextView) findViewById(C11745R$id.user_name_view);
        this.f10250e = (TextView) findViewById(C11745R$id.user_id_view);
        this.f10247b.setOnClickListener(new C4966c(this));
        if (TextUtils.isEmpty(C4201a.m11607r().mo23449p())) {
            this.f10248c.setImageResource(2131231267);
        } else {
            C1219x j = C1203t.m3106o(C4297y.f7456e).mo10003j(C4201a.m11607r().mo23449p());
            j.mo10038f(2131231267);
            j.mo10036d(this.f10248c);
        }
        this.f10249d.setText(C4201a.m11607r().mo23453w());
        this.f10250e.setText(C4201a.m11607r().mo23452v());
        this.f10250e.setOnClickListener(new C4967d());
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
