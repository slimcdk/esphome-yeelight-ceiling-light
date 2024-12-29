package com.yeelight.cherry.p177ui.activity;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.miot.common.config.AppConfiguration;
import com.yeelight.cherry.C11745R$id;
import com.yeelight.cherry.C11748R$layout;
import com.yeelight.yeelib.p152f.C4201a;
import com.yeelight.yeelib.p152f.C4230l;
import com.yeelight.yeelib.p152f.C4235o;
import com.yeelight.yeelib.p187h.C9862d;
import com.yeelight.yeelib.p187h.p189h.C9874b;
import com.yeelight.yeelib.p194ui.activity.BaseActivity;
import com.yeelight.yeelib.p194ui.activity.FeedbackV3Activity;
import com.yeelight.yeelib.p194ui.activity.YeelightWebviewActivity;
import com.yeelight.yeelib.p194ui.view.CommonTitleBar;
import com.yeelight.yeelib.utils.C10547m;
import com.yeelight.yeelib.utils.C4308b;
import org.json.JSONObject;

/* renamed from: com.yeelight.cherry.ui.activity.MoreActivity */
public class MoreActivity extends BaseActivity {

    /* renamed from: b */
    TextView f11363b;

    /* renamed from: c */
    TextView f11364c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public Handler f11365d = new C5450i();

    /* renamed from: com.yeelight.cherry.ui.activity.MoreActivity$a */
    class C5442a implements View.OnClickListener {
        C5442a() {
        }

        public void onClick(View view) {
            MoreActivity.this.onBackPressed();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.MoreActivity$b */
    class C5443b implements View.OnClickListener {
        C5443b() {
        }

        public void onClick(View view) {
            MoreActivity.this.m16724X();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.MoreActivity$c */
    class C5444c implements View.OnClickListener {
        C5444c() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(MoreActivity.this, YeelightWebviewActivity.class);
            intent.putExtra("server_index", C4230l.m11766b().mo23552a());
            intent.putExtra("url_index", 22);
            MoreActivity.this.startActivity(intent);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.MoreActivity$d */
    class C5445d implements View.OnClickListener {
        C5445d() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(MoreActivity.this, YeelightWebviewActivity.class);
            intent.putExtra("server_index", C4230l.m11766b().mo23552a());
            intent.putExtra("url_index", 23);
            intent.putExtra("with_draw", true);
            MoreActivity.this.startActivity(intent);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.MoreActivity$e */
    class C5446e implements View.OnClickListener {
        C5446e() {
        }

        public void onClick(View view) {
            MoreActivity.this.startActivity(new Intent(MoreActivity.this, GeneralAboutActivity.class));
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.MoreActivity$f */
    class C5447f implements View.OnClickListener {
        C5447f() {
        }

        public void onClick(View view) {
            if (TextUtils.isEmpty(C4235o.m11786k().mo23567q())) {
                C4235o.m11786k().mo23569t();
            }
            MoreActivity.this.startActivity(new Intent(MoreActivity.this, LocaleSelectionActivity.class));
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.MoreActivity$g */
    class C5448g implements View.OnClickListener {
        C5448g() {
        }

        public void onClick(View view) {
            MoreActivity.this.startActivity(new Intent(MoreActivity.this, FeedbackV3Activity.class));
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.MoreActivity$h */
    class C5449h implements C9874b<String> {
        C5449h() {
        }

        /* renamed from: b */
        public void mo23475a(String str) {
            "query result = " + str;
            try {
                JSONObject jSONObject = new JSONObject(str);
                MoreActivity.this.f11365d.obtainMessage(1, Integer.parseInt(jSONObject.getString("source_reversion")), 0, jSONObject.getString("release_note")).sendToTarget();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public void onFailure(int i, String str) {
            MoreActivity.this.f11365d.sendEmptyMessage(2);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.MoreActivity$i */
    class C5450i extends Handler {
        C5450i() {
        }

        public void handleMessage(Message message) {
            Resources resources;
            int i;
            TextView textView;
            super.handleMessage(message);
            int i2 = message.what;
            if (i2 == 1) {
                int i3 = message.arg1;
                if (i3 > C4308b.m12124c()) {
                    MoreActivity.this.f11363b.setText(String.valueOf(i3));
                    MoreActivity moreActivity = MoreActivity.this;
                    textView = moreActivity.f11363b;
                    resources = moreActivity.getResources();
                    i = 2131099802;
                } else {
                    MoreActivity.this.f11363b.setText(2131755101);
                    MoreActivity moreActivity2 = MoreActivity.this;
                    textView = moreActivity2.f11363b;
                    resources = moreActivity2.getResources();
                    i = 2131099836;
                }
                textView.setTextColor(resources.getColor(i));
            } else if (i2 == 2) {
                MoreActivity.this.f11363b.setText(2131755123);
            }
        }
    }

    static {
        Class<MoreActivity> cls = MoreActivity.class;
    }

    /* access modifiers changed from: private */
    /* renamed from: X */
    public void m16724X() {
        String str = C4308b.f7492k + "android/update";
        "check sw upgrade url = " + str;
        C9862d.m24133c(str, String.class, new C5449h());
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo32193P();
        C10547m.m25758h(true, this);
        setContentView(C11748R$layout.activity_more);
        CommonTitleBar commonTitleBar = (CommonTitleBar) findViewById(2131297424);
        commonTitleBar.mo32825a(getText(2131756274).toString(), new C5442a(), (View.OnClickListener) null);
        commonTitleBar.setTitleTextSize(16);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        commonTitleBar.setLayoutParams(layoutParams);
        layoutParams.setMargins(0, C10547m.m25755e(this), 0, 0);
        this.f11363b = (TextView) findViewById(C11745R$id.update_info);
        this.f11364c = (TextView) findViewById(C11745R$id.current_server);
        ((LinearLayout) findViewById(C11745R$id.check_update_layout)).setOnClickListener(new C5443b());
        ((LinearLayout) findViewById(C11745R$id.user_agreement)).setOnClickListener(new C5444c());
        ((LinearLayout) findViewById(C11745R$id.privacy_policy)).setOnClickListener(new C5445d());
        ((LinearLayout) findViewById(C11745R$id.about_yeelight)).setOnClickListener(new C5446e());
        ((LinearLayout) findViewById(C11745R$id.server_select_layout)).setOnClickListener(new C5447f());
        ((LinearLayout) findViewById(C11745R$id.user_feedback)).setOnClickListener(new C5448g());
        m16724X();
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        int i;
        TextView textView;
        super.onResume();
        String a = C4230l.m11766b().mo23552a();
        if (a.equals(AppConfiguration.Locale.cn.name()) || (a.equals("") && C4201a.m11610z())) {
            textView = this.f11364c;
            i = 2131755115;
        } else if (a.equals(AppConfiguration.Locale.sg.name())) {
            textView = this.f11364c;
            i = 2131755120;
        } else if (a.equals(AppConfiguration.Locale.us.name())) {
            textView = this.f11364c;
            i = 2131755122;
        } else if (a.equals(AppConfiguration.Locale.de.name())) {
            textView = this.f11364c;
            i = 2131755117;
        } else if (a.equals(AppConfiguration.Locale.ru.name())) {
            textView = this.f11364c;
            i = 2131755119;
        } else if (a.equals(AppConfiguration.Locale.i2.name())) {
            textView = this.f11364c;
            i = 2131755118;
        } else {
            return;
        }
        textView.setText(getString(i));
    }
}
