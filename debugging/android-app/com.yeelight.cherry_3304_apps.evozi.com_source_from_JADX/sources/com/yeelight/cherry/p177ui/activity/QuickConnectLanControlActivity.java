package com.yeelight.cherry.p177ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.yeelight.cherry.C11744R$drawable;
import com.yeelight.cherry.C11745R$id;
import com.yeelight.cherry.C11748R$layout;
import com.yeelight.yeelib.p150c.C6006h;
import com.yeelight.yeelib.p150c.p183m.C6418d1;
import com.yeelight.yeelib.p150c.p183m.C7130o0;
import com.yeelight.yeelib.p152f.C4257w;
import com.yeelight.yeelib.p152f.C9812t;
import com.yeelight.yeelib.p190i.C9875a;
import com.yeelight.yeelib.p194ui.activity.BaseActivity;
import com.yeelight.yeelib.p194ui.activity.YeelightWebviewActivity;
import com.yeelight.yeelib.utils.C10547m;
import com.yeelight.yeelib.utils.C4308b;
import java.util.List;

/* renamed from: com.yeelight.cherry.ui.activity.QuickConnectLanControlActivity */
public class QuickConnectLanControlActivity extends BaseActivity {

    /* renamed from: h */
    private static String f11626h = QuickConnectLanControlActivity.class.getSimpleName();

    /* renamed from: b */
    private ImageView f11627b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C6006h f11628c;

    /* renamed from: d */
    private Button f11629d;

    /* renamed from: e */
    private TextView f11630e;

    /* renamed from: f */
    private TextView f11631f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public boolean f11632g = true;

    /* renamed from: com.yeelight.cherry.ui.activity.QuickConnectLanControlActivity$a */
    class C5561a implements View.OnClickListener {
        C5561a() {
        }

        public void onClick(View view) {
            QuickConnectLanControlActivity quickConnectLanControlActivity = QuickConnectLanControlActivity.this;
            boolean unused = quickConnectLanControlActivity.f11632g = !quickConnectLanControlActivity.f11632g;
            QuickConnectLanControlActivity.this.m16921b0();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.QuickConnectLanControlActivity$b */
    class C5562b implements View.OnClickListener {
        C5562b() {
        }

        public void onClick(View view) {
            QuickConnectLanControlActivity.this.f11628c.mo27567M1(QuickConnectLanControlActivity.this.f11632g);
            Intent intent = new Intent();
            intent.setClass(QuickConnectLanControlActivity.this, MainActivity.class);
            intent.putExtra("com.yeelight.cherry.device_id", QuickConnectLanControlActivity.this.f11628c.mo23372G());
            intent.addFlags(67108864);
            QuickConnectLanControlActivity.this.startActivity(intent);
            QuickConnectLanControlActivity.this.finish();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.QuickConnectLanControlActivity$c */
    class C5563c implements View.OnClickListener {
        C5563c() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(view.getContext(), YeelightWebviewActivity.class);
            intent.putExtra("url_index", 14);
            QuickConnectLanControlActivity.this.startActivity(intent);
        }
    }

    /* renamed from: Z */
    private void m16920Z() {
        List<C9875a> k;
        View findViewById = findViewById(C11745R$id.two_view);
        C6006h hVar = this.f11628c;
        if ((hVar instanceof C7130o0) || (hVar instanceof C6418d1) || (k = C9812t.m23832j().mo31685k()) == null || k.size() <= 0) {
            findViewById.setVisibility(8);
        } else {
            findViewById.setVisibility(0);
            findViewById.setBackgroundColor(ContextCompat.getColor(this, 2131099802));
        }
        findViewById(C11745R$id.three_view).setBackgroundColor(ContextCompat.getColor(this, 2131099802));
    }

    /* access modifiers changed from: private */
    /* renamed from: b0 */
    public void m16921b0() {
        int i;
        ImageView imageView;
        if (this.f11632g) {
            imageView = this.f11627b;
            i = C11744R$drawable.icon_quickconnect_lan_control_checked;
        } else {
            imageView = this.f11627b;
            i = C11744R$drawable.icon_quickconnect_lan_control_check;
        }
        imageView.setImageResource(i);
    }

    /* renamed from: a0 */
    public /* synthetic */ void mo26835a0(View view) {
        Intent intent = new Intent(this, YeelightWebviewActivity.class);
        intent.putExtra("url_index", 26);
        startActivity(intent);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo32193P();
        C10547m.m25758h(true, this);
        setContentView(C11748R$layout.activity_quickconnect_lan_control);
        Intent intent = getIntent();
        if (!intent.hasExtra("com.yeelight.cherry.device_id")) {
            C4308b.m12141t(f11626h, "Activity has not device id", false);
            finish();
            return;
        }
        C6006h L0 = C4257w.m11947l0().mo23651L0(intent.getStringExtra("com.yeelight.cherry.device_id"));
        this.f11628c = L0;
        if (L0 == null) {
            BaseActivity.m24384U(this);
            finish();
            return;
        }
        ImageView imageView = (ImageView) findViewById(C11745R$id.lan_control_switch);
        this.f11627b = imageView;
        imageView.setOnClickListener(new C5561a());
        Button button = (Button) findViewById(2131296404);
        this.f11629d = button;
        button.setOnClickListener(new C5562b());
        m16920Z();
        this.f11630e = (TextView) findViewById(C11745R$id.tv_google_home_hint);
        this.f11631f = (TextView) findViewById(C11745R$id.tv_google_lan);
        TextView textView = (TextView) findViewById(2131297507);
        if (!C4257w.m11926R0(this.f11628c.mo23395T())) {
            this.f11630e.setVisibility(0);
            this.f11631f.setVisibility(0);
            TextView textView2 = this.f11631f;
            textView2.setText(Html.fromHtml("<u>" + this.f11631f.getText().toString() + "</u>"));
            this.f11631f.setOnClickListener(new C5723i2(this));
        }
        textView.setText(Html.fromHtml("<u>" + textView.getText().toString() + "</u>"));
        textView.setOnClickListener(new C5563c());
        m16921b0();
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
    }
}
