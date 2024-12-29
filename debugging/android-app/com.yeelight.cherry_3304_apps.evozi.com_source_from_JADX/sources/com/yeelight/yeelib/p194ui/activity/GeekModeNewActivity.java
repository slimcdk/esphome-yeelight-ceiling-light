package com.yeelight.yeelib.p194ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.yeelight.yeelib.R$drawable;
import com.yeelight.yeelib.R$id;
import com.yeelight.yeelib.R$layout;
import com.yeelight.yeelib.p150c.C6006h;
import com.yeelight.yeelib.p150c.p151i.C6024e;
import com.yeelight.yeelib.p152f.C4257w;
import com.yeelight.yeelib.p186e.C9770e;
import com.yeelight.yeelib.utils.C10547m;
import com.yeelight.yeelib.utils.C4308b;

/* renamed from: com.yeelight.yeelib.ui.activity.GeekModeNewActivity */
public class GeekModeNewActivity extends BaseActivity implements C9770e {

    /* renamed from: f */
    private static final String f18393f = GeekModeNewActivity.class.getSimpleName();

    /* renamed from: b */
    ImageView f18394b;

    /* renamed from: c */
    ImageView f18395c;

    /* renamed from: d */
    TextView f18396d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public C6006h f18397e;

    /* renamed from: com.yeelight.yeelib.ui.activity.GeekModeNewActivity$a */
    class C10039a implements View.OnClickListener {
        C10039a() {
        }

        public void onClick(View view) {
            GeekModeNewActivity.this.onBackPressed();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.GeekModeNewActivity$b */
    class C10040b implements View.OnClickListener {
        C10040b() {
        }

        public void onClick(View view) {
            GeekModeNewActivity.this.f18397e.mo27567M1(!GeekModeNewActivity.this.f18397e.mo23408d0().mo27663S());
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.GeekModeNewActivity$c */
    class C10041c implements View.OnClickListener {
        C10041c() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(view.getContext(), YeelightWebviewActivity.class);
            intent.putExtra("url_index", 14);
            GeekModeNewActivity.this.startActivity(intent);
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.GeekModeNewActivity$d */
    class C10042d implements Runnable {
        C10042d() {
        }

        public void run() {
            int i;
            ImageView imageView;
            if (GeekModeNewActivity.this.f18397e.mo23408d0().mo27663S()) {
                imageView = GeekModeNewActivity.this.f18395c;
                i = R$drawable.icon_yeelight_switch_point_on_new;
            } else {
                imageView = GeekModeNewActivity.this.f18395c;
                i = R$drawable.icon_yeelight_switch_point_off_new;
            }
            imageView.setImageResource(i);
        }
    }

    /* renamed from: W */
    private void m24525W() {
        runOnUiThread(new C10042d());
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo32193P();
        C10547m.m25758h(true, this);
        setContentView(R$layout.activity_geek_mode_new);
        this.f18394b = (ImageView) findViewById(R$id.img_back_view);
        this.f18395c = (ImageView) findViewById(R$id.img_switch_view);
        this.f18396d = (TextView) findViewById(R$id.tv_third_party_protocol);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        findViewById(R$id.title_view).setLayoutParams(layoutParams);
        layoutParams.setMargins(0, C10547m.m25755e(this), 0, 0);
        Intent intent = getIntent();
        if (!intent.hasExtra("com.yeelight.cherry.device_id")) {
            C4308b.m12141t(f18393f, "Activity has not device id", false);
            finish();
            return;
        }
        C6006h L0 = C4257w.m11947l0().mo23651L0(intent.getStringExtra("com.yeelight.cherry.device_id"));
        this.f18397e = L0;
        if (L0 == null || !L0.mo23331k0()) {
            BaseActivity.m24384U(this);
            finish();
            return;
        }
        this.f18394b.setOnClickListener(new C10039a());
        this.f18395c.setOnClickListener(new C10040b());
        this.f18396d.setOnClickListener(new C10041c());
        m24525W();
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        this.f18397e.mo23400W0(this);
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        this.f18397e.mo23365B0(this);
    }

    public void onStatusChange(int i, C6024e eVar) {
        if (i == -1 || i == 4096) {
            m24525W();
        }
    }
}
