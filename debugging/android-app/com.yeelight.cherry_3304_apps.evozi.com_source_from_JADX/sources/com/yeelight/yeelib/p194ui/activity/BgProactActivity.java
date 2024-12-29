package com.yeelight.yeelib.p194ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import com.yeelight.yeelib.R$drawable;
import com.yeelight.yeelib.R$id;
import com.yeelight.yeelib.R$layout;
import com.yeelight.yeelib.R$string;
import com.yeelight.yeelib.p150c.C6006h;
import com.yeelight.yeelib.p150c.p151i.C6017a;
import com.yeelight.yeelib.p150c.p151i.C6024e;
import com.yeelight.yeelib.p152f.C4257w;
import com.yeelight.yeelib.p186e.C9770e;
import com.yeelight.yeelib.p194ui.view.CommonTitleBar;
import com.yeelight.yeelib.utils.C10547m;
import com.yeelight.yeelib.utils.C4308b;

/* renamed from: com.yeelight.yeelib.ui.activity.BgProactActivity */
public class BgProactActivity extends BaseActivity implements C9770e {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final String f18128f = SetDefaultSaveStateActivity.class.getSimpleName();

    /* renamed from: b */
    CommonTitleBar f18129b;

    /* renamed from: c */
    ImageView f18130c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C6006h f18131d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public long f18132e = 0;

    /* renamed from: com.yeelight.yeelib.ui.activity.BgProactActivity$a */
    class C9950a implements View.OnClickListener {
        C9950a() {
        }

        public void onClick(View view) {
            BgProactActivity.this.onBackPressed();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.BgProactActivity$b */
    class C9951b implements View.OnClickListener {
        C9951b() {
        }

        public void onClick(View view) {
            if (System.currentTimeMillis() - BgProactActivity.this.f18132e >= 800) {
                long unused = BgProactActivity.this.f18132e = System.currentTimeMillis();
                if (BgProactActivity.this.f18131d instanceof C6017a) {
                    ((C6017a) BgProactActivity.this.f18131d).mo27594n2(!BgProactActivity.this.f18131d.mo23408d0().mo27698l());
                } else {
                    C4308b.m12139r(BgProactActivity.f18128f, "Invalid device type!");
                }
            }
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.BgProactActivity$c */
    class C9952c implements Runnable {
        C9952c() {
        }

        public void run() {
            int i;
            ImageView imageView;
            if (BgProactActivity.this.f18131d.mo23408d0().mo27698l()) {
                imageView = BgProactActivity.this.f18130c;
                i = R$drawable.icon_yeelight_switch_point_on_new;
            } else {
                imageView = BgProactActivity.this.f18130c;
                i = R$drawable.icon_yeelight_switch_point_off_new;
            }
            imageView.setImageResource(i);
        }
    }

    /* renamed from: Z */
    private void m24394Z() {
        runOnUiThread(new C9952c());
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo32193P();
        C10547m.m25758h(true, this);
        setContentView(R$layout.activity_bg_proact);
        this.f18129b = (CommonTitleBar) findViewById(R$id.title_bar);
        this.f18130c = (ImageView) findViewById(R$id.img_switch_ambi_setting);
        Intent intent = getIntent();
        if (!intent.hasExtra("com.yeelight.cherry.device_id")) {
            C4308b.m12141t(f18128f, "Activity has not device id", false);
            finish();
            return;
        }
        C6006h L0 = C4257w.m11947l0().mo23651L0(intent.getStringExtra("com.yeelight.cherry.device_id"));
        this.f18131d = L0;
        if (L0 == null) {
            BaseActivity.m24384U(this);
            finish();
            return;
        }
        this.f18129b.mo32825a(getString(R$string.settings_feature_ambi_title), new C9950a(), (View.OnClickListener) null);
        this.f18129b.setTitleTextSize(16);
        m24394Z();
        this.f18130c.setOnClickListener(new C9951b());
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        this.f18131d.mo23400W0(this);
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        this.f18131d.mo23365B0(this);
        this.f18131d.mo23354x0();
    }

    public void onStatusChange(int i, C6024e eVar) {
        if (i == -1 || i == 4096) {
            m24394Z();
        }
    }
}
