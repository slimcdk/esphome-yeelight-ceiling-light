package com.yeelight.yeelib.p194ui.activity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import com.yeelight.yeelib.R$id;
import com.yeelight.yeelib.R$layout;
import com.yeelight.yeelib.nativelib.NativeLightMix;
import com.yeelight.yeelib.p150c.p151i.C4200i;
import com.yeelight.yeelib.p152f.C4257w;
import com.yeelight.yeelib.p153g.C9849r;
import com.yeelight.yeelib.p153g.C9856y;
import com.yeelight.yeelib.p194ui.view.ColorsLinearLayout;
import com.yeelight.yeelib.utils.C4308b;

/* renamed from: com.yeelight.yeelib.ui.activity.ColorflowModeActivity */
public class ColorflowModeActivity extends BaseActivity {

    /* renamed from: m */
    private static final String f18162m = ColorflowModeActivity.class.getSimpleName();

    /* renamed from: b */
    ColorsLinearLayout f18163b;

    /* renamed from: c */
    TextView f18164c;

    /* renamed from: d */
    TextView f18165d;

    /* renamed from: e */
    ImageView f18166e;

    /* renamed from: f */
    TextView f18167f;

    /* renamed from: g */
    private C4200i f18168g;

    /* renamed from: h */
    private int f18169h = 0;

    /* renamed from: i */
    private FragmentManager f18170i;

    /* renamed from: j */
    private FragmentTransaction f18171j;

    /* renamed from: k */
    private ColorflowSelectorFragment f18172k;

    /* renamed from: l */
    private PhotoColorFragment f18173l;

    /* renamed from: com.yeelight.yeelib.ui.activity.ColorflowModeActivity$a */
    class C9963a implements View.OnClickListener {
        C9963a() {
        }

        public void onClick(View view) {
            view.setAlpha(1.0f);
            ColorflowModeActivity.this.f18165d.setAlpha(0.3f);
            ColorflowModeActivity.this.m24403Y();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.ColorflowModeActivity$b */
    class C9964b implements View.OnClickListener {
        C9964b() {
        }

        public void onClick(View view) {
            view.setAlpha(1.0f);
            ColorflowModeActivity.this.f18164c.setAlpha(0.3f);
            ColorflowModeActivity.this.m24404Z();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.ColorflowModeActivity$c */
    class C9965c implements View.OnClickListener {
        C9965c() {
        }

        public void onClick(View view) {
            ColorflowModeActivity.this.onBackPressed();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.ColorflowModeActivity$d */
    class C9966d implements View.OnClickListener {
        C9966d() {
        }

        public void onClick(View view) {
            ColorflowModeActivity.this.m24405a0();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.ColorflowModeActivity$e */
    public interface C9967e {
        /* renamed from: a */
        void mo32221a(int i);
    }

    /* access modifiers changed from: private */
    /* renamed from: Y */
    public void m24403Y() {
        this.f18169h = 0;
        FragmentTransaction beginTransaction = this.f18170i.beginTransaction();
        this.f18171j = beginTransaction;
        beginTransaction.hide(this.f18173l).show(this.f18172k);
        this.f18171j.commit();
    }

    /* access modifiers changed from: private */
    /* renamed from: Z */
    public void m24404Z() {
        this.f18169h = 1;
        FragmentTransaction beginTransaction = this.f18170i.beginTransaction();
        this.f18171j = beginTransaction;
        beginTransaction.hide(this.f18172k).show(this.f18173l);
        this.f18171j.commit();
    }

    /* access modifiers changed from: private */
    /* renamed from: a0 */
    public void m24405a0() {
        int[] u = this.f18169h == 0 ? this.f18172k.mo32223u() : this.f18173l.mo32455s();
        for (int i = 0; i < u.length; i++) {
            u[i] = NativeLightMix.color_rgb_trans((char) Color.red(u[i]), (char) Color.green(u[i]), (char) Color.blue(u[i]));
        }
        int length = u.length;
        C9856y.C9857a[] aVarArr = new C9856y.C9857a[length];
        for (int i2 = 0; i2 < length; i2++) {
            aVarArr[i2] = new C9856y.C9857a(2000, 1, u[i2], 100);
        }
        C4200i iVar = this.f18168g;
        iVar.mo23355x1(new C9849r("", 4, iVar.mo23408d0().mo27700m(), -1, -1, aVarArr));
        finish();
    }

    /* renamed from: b0 */
    public void mo32216b0(int i) {
        this.f18163b.setColor(i);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (this.f18169h == 0) {
            this.f18172k.onActivityResult(i, i2, intent);
        } else {
            this.f18173l.onActivityResult(i, i2, intent);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo32193P();
        setContentView(R$layout.activity_colorflow_mode);
        this.f18163b = (ColorsLinearLayout) findViewById(R$id.color_flow_bg);
        this.f18164c = (TextView) findViewById(R$id.btn_color);
        this.f18165d = (TextView) findViewById(R$id.btn_photo);
        this.f18166e = (ImageView) findViewById(R$id.header_left_btn);
        this.f18167f = (TextView) findViewById(R$id.title_bar_more);
        Intent intent = getIntent();
        if (!intent.hasExtra("com.yeelight.cherry.device_id")) {
            C4308b.m12141t(f18162m, "Activity has not device id", false);
            finish();
            return;
        }
        C4200i o0 = C4257w.m11953o0(intent.getStringExtra("com.yeelight.cherry.device_id"));
        this.f18168g = o0;
        if (o0 == null || !o0.mo23331k0()) {
            BaseActivity.m24384U(this);
            finish();
            return;
        }
        this.f18172k = new ColorflowSelectorFragment();
        this.f18173l = new PhotoColorFragment();
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        this.f18170i = supportFragmentManager;
        FragmentTransaction beginTransaction = supportFragmentManager.beginTransaction();
        this.f18171j = beginTransaction;
        beginTransaction.add(R$id.colorflow_content, (Fragment) this.f18172k);
        this.f18171j.add(R$id.colorflow_content, (Fragment) this.f18173l);
        this.f18171j.hide(this.f18173l);
        this.f18171j.commit();
        this.f18164c.setOnClickListener(new C9963a());
        this.f18165d.setOnClickListener(new C9964b());
        this.f18166e.setOnClickListener(new C9965c());
        this.f18167f.setOnClickListener(new C9966d());
    }
}
