package com.yeelight.yeelib.p194ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.yeelight.yeelib.R$drawable;
import com.yeelight.yeelib.R$id;
import com.yeelight.yeelib.R$layout;
import com.yeelight.yeelib.p150c.C6006h;
import com.yeelight.yeelib.p150c.p151i.C6024e;
import com.yeelight.yeelib.p152f.C4257w;
import com.yeelight.yeelib.p186e.C9770e;
import com.yeelight.yeelib.utils.C10547m;
import com.yeelight.yeelib.utils.C4308b;

/* renamed from: com.yeelight.yeelib.ui.activity.KidLockActivity */
public class KidLockActivity extends BaseActivity implements C9770e {

    /* renamed from: e */
    private static final String f18451e = KidLockActivity.class.getSimpleName();

    /* renamed from: b */
    ImageView f18452b;

    /* renamed from: c */
    ImageView f18453c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C6006h f18454d;

    /* renamed from: com.yeelight.yeelib.ui.activity.KidLockActivity$a */
    class C10061a implements View.OnClickListener {
        C10061a() {
        }

        public void onClick(View view) {
            KidLockActivity.this.onBackPressed();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.KidLockActivity$b */
    class C10062b implements View.OnClickListener {
        C10062b() {
        }

        public void onClick(View view) {
            KidLockActivity.this.f18454d.mo27568N1(!KidLockActivity.this.f18454d.mo23408d0().mo27669V());
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.KidLockActivity$c */
    class C10063c implements Runnable {
        C10063c() {
        }

        public void run() {
            int i;
            ImageView imageView;
            if (KidLockActivity.this.f18454d.mo23408d0().mo27669V()) {
                imageView = KidLockActivity.this.f18453c;
                i = R$drawable.icon_yeelight_switch_point_on_new;
            } else {
                imageView = KidLockActivity.this.f18453c;
                i = R$drawable.icon_yeelight_switch_point_off_new;
            }
            imageView.setImageResource(i);
        }
    }

    /* renamed from: W */
    private void m24552W() {
        runOnUiThread(new C10063c());
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo32193P();
        C10547m.m25758h(true, this);
        setContentView(R$layout.activity_kid_lock_mode);
        this.f18452b = (ImageView) findViewById(R$id.img_back_view);
        this.f18453c = (ImageView) findViewById(R$id.img_switch_view);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        findViewById(R$id.title_view).setLayoutParams(layoutParams);
        layoutParams.setMargins(0, C10547m.m25755e(this), 0, 0);
        Intent intent = getIntent();
        if (!intent.hasExtra("com.yeelight.cherry.device_id")) {
            C4308b.m12141t(f18451e, "Activity has not device id", false);
            finish();
            return;
        }
        C6006h L0 = C4257w.m11947l0().mo23651L0(intent.getStringExtra("com.yeelight.cherry.device_id"));
        this.f18454d = L0;
        if (L0 == null || !L0.mo23331k0()) {
            BaseActivity.m24384U(this);
            finish();
            return;
        }
        this.f18452b.setOnClickListener(new C10061a());
        this.f18453c.setOnClickListener(new C10062b());
        m24552W();
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        this.f18454d.mo23400W0(this);
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        this.f18454d.mo23365B0(this);
    }

    public void onStatusChange(int i, C6024e eVar) {
        if (i == -1 || i == 4096) {
            m24552W();
        }
    }
}
