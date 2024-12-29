package com.yeelight.cherry.p141ui.activity;

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
import com.yeelight.cherry.C12225R$id;
import com.yeelight.cherry.C12228R$layout;
import com.yeelight.yeelib.managers.C3051a;
import com.yeelight.yeelib.managers.C3084o;
import com.yeelight.yeelib.managers.C8281l;
import com.yeelight.yeelib.p142ui.activity.BaseActivity;
import com.yeelight.yeelib.p142ui.activity.FeedbackV3Activity;
import com.yeelight.yeelib.p142ui.activity.YeelightWebviewActivity;
import com.yeelight.yeelib.p142ui.view.CommonTitleBar;
import com.yeelight.yeelib.utils.AppUtils;
import org.json.JSONObject;
import p051j4.C9193k;
import p129b4.C3988b;
import p134c4.C4007b;

/* renamed from: com.yeelight.cherry.ui.activity.MoreActivity */
public class MoreActivity extends BaseActivity {

    /* renamed from: a */
    TextView f10934a;

    /* renamed from: b */
    TextView f10935b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public Handler f10936c = new C5497i();

    /* renamed from: com.yeelight.cherry.ui.activity.MoreActivity$a */
    class C5489a implements View.OnClickListener {
        C5489a() {
        }

        public void onClick(View view) {
            MoreActivity.this.onBackPressed();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.MoreActivity$b */
    class C5490b implements View.OnClickListener {
        C5490b() {
        }

        public void onClick(View view) {
            MoreActivity.this.m16702X();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.MoreActivity$c */
    class C5491c implements View.OnClickListener {
        C5491c() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(MoreActivity.this, YeelightWebviewActivity.class);
            intent.putExtra("server_index", C8281l.m19542b().mo35223a());
            intent.putExtra("url_index", 22);
            MoreActivity.this.startActivity(intent);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.MoreActivity$d */
    class C5492d implements View.OnClickListener {
        C5492d() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(MoreActivity.this, YeelightWebviewActivity.class);
            intent.putExtra("server_index", C8281l.m19542b().mo35223a());
            intent.putExtra("url_index", 23);
            intent.putExtra("with_draw", true);
            MoreActivity.this.startActivity(intent);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.MoreActivity$e */
    class C5493e implements View.OnClickListener {
        C5493e() {
        }

        public void onClick(View view) {
            MoreActivity.this.startActivity(new Intent(MoreActivity.this, GeneralAboutActivity.class));
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.MoreActivity$f */
    class C5494f implements View.OnClickListener {
        C5494f() {
        }

        public void onClick(View view) {
            if (TextUtils.isEmpty(C3084o.m8096k().mo23460q())) {
                C3084o.m8096k().mo23462t();
            }
            MoreActivity.this.startActivity(new Intent(MoreActivity.this, LocaleSelectionActivity.class));
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.MoreActivity$g */
    class C5495g implements View.OnClickListener {
        C5495g() {
        }

        public void onClick(View view) {
            MoreActivity.this.startActivity(new Intent(MoreActivity.this, FeedbackV3Activity.class));
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.MoreActivity$h */
    class C5496h implements C4007b<String> {
        C5496h() {
        }

        /* renamed from: b */
        public void mo23338a(String str) {
            StringBuilder sb = new StringBuilder();
            sb.append("query result = ");
            sb.append(str);
            try {
                JSONObject jSONObject = new JSONObject(str);
                String string = jSONObject.getString("source_reversion");
                MoreActivity.this.f10936c.obtainMessage(1, Integer.parseInt(string), 0, jSONObject.getString("release_note")).sendToTarget();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public void onFailure(int i, String str) {
            MoreActivity.this.f10936c.sendEmptyMessage(2);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.MoreActivity$i */
    class C5497i extends Handler {
        C5497i() {
        }

        public void handleMessage(Message message) {
            Resources resources;
            int i;
            TextView textView;
            super.handleMessage(message);
            int i2 = message.what;
            if (i2 == 1) {
                int i3 = message.arg1;
                if (i3 > AppUtils.m8282c()) {
                    MoreActivity.this.f10934a.setText(String.valueOf(i3));
                    MoreActivity moreActivity = MoreActivity.this;
                    textView = moreActivity.f10934a;
                    resources = moreActivity.getResources();
                    i = 2131099805;
                } else {
                    MoreActivity.this.f10934a.setText(2131755100);
                    MoreActivity moreActivity2 = MoreActivity.this;
                    textView = moreActivity2.f10934a;
                    resources = moreActivity2.getResources();
                    i = 2131099839;
                }
                textView.setTextColor(resources.getColor(i));
            } else if (i2 == 2) {
                MoreActivity.this.f10934a.setText(2131755122);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: X */
    public void m16702X() {
        String str = AppUtils.f4993q + "android/update";
        StringBuilder sb = new StringBuilder();
        sb.append("check sw upgrade url = ");
        sb.append(str);
        C3988b.m11567c(str, String.class, new C5496h());
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo35653P();
        C9193k.m22157h(true, this);
        setContentView(C12228R$layout.activity_more);
        CommonTitleBar commonTitleBar = (CommonTitleBar) findViewById(2131297591);
        commonTitleBar.mo36195a(getText(2131756303).toString(), new C5489a(), (View.OnClickListener) null);
        commonTitleBar.setTitleTextSize(16);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        commonTitleBar.setLayoutParams(layoutParams);
        layoutParams.setMargins(0, C9193k.m22154e(this), 0, 0);
        this.f10934a = (TextView) findViewById(C12225R$id.update_info);
        this.f10935b = (TextView) findViewById(C12225R$id.current_server);
        ((LinearLayout) findViewById(C12225R$id.check_update_layout)).setOnClickListener(new C5490b());
        ((LinearLayout) findViewById(C12225R$id.user_agreement)).setOnClickListener(new C5491c());
        ((LinearLayout) findViewById(C12225R$id.privacy_policy)).setOnClickListener(new C5492d());
        ((LinearLayout) findViewById(C12225R$id.about_yeelight)).setOnClickListener(new C5493e());
        ((LinearLayout) findViewById(C12225R$id.server_select_layout)).setOnClickListener(new C5494f());
        ((LinearLayout) findViewById(C12225R$id.user_feedback)).setOnClickListener(new C5495g());
        m16702X();
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        int i;
        TextView textView;
        super.onResume();
        String a = C8281l.m19542b().mo35223a();
        if (a.equals(AppConfiguration.Locale.cn.name()) || (a.equals("") && C3051a.m7928z())) {
            textView = this.f10935b;
            i = 2131755114;
        } else if (a.equals(AppConfiguration.Locale.sg.name())) {
            textView = this.f10935b;
            i = 2131755119;
        } else if (a.equals(AppConfiguration.Locale.us.name())) {
            textView = this.f10935b;
            i = 2131755121;
        } else if (a.equals(AppConfiguration.Locale.de.name())) {
            textView = this.f10935b;
            i = 2131755116;
        } else if (a.equals(AppConfiguration.Locale.ru.name())) {
            textView = this.f10935b;
            i = 2131755118;
        } else if (a.equals(AppConfiguration.Locale.i2.name())) {
            textView = this.f10935b;
            i = 2131755117;
        } else {
            return;
        }
        textView.setText(getString(i));
    }
}
