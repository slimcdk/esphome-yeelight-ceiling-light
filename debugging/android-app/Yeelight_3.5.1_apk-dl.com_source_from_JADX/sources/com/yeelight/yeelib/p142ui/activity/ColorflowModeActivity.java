package com.yeelight.yeelib.p142ui.activity;

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
import com.yeelight.yeelib.device.base.C3012e;
import com.yeelight.yeelib.managers.YeelightDeviceManager;
import com.yeelight.yeelib.models.C8321m;
import com.yeelight.yeelib.models.C8327s;
import com.yeelight.yeelib.nativelib.NativeLightMix;
import com.yeelight.yeelib.p142ui.view.ColorsLinearLayout;
import com.yeelight.yeelib.utils.AppUtils;

/* renamed from: com.yeelight.yeelib.ui.activity.ColorflowModeActivity */
public class ColorflowModeActivity extends BaseActivity {

    /* renamed from: l */
    private static final String f14468l = "ColorflowModeActivity";

    /* renamed from: a */
    ColorsLinearLayout f14469a;

    /* renamed from: b */
    TextView f14470b;

    /* renamed from: c */
    TextView f14471c;

    /* renamed from: d */
    ImageView f14472d;

    /* renamed from: e */
    TextView f14473e;

    /* renamed from: f */
    private C3012e f14474f;

    /* renamed from: g */
    private int f14475g = 0;

    /* renamed from: h */
    private FragmentManager f14476h;

    /* renamed from: i */
    private FragmentTransaction f14477i;

    /* renamed from: j */
    private ColorflowSelectorFragment f14478j;

    /* renamed from: k */
    private PhotoColorFragment f14479k;

    /* renamed from: com.yeelight.yeelib.ui.activity.ColorflowModeActivity$a */
    class C8380a implements View.OnClickListener {
        C8380a() {
        }

        public void onClick(View view) {
            view.setAlpha(1.0f);
            ColorflowModeActivity.this.f14471c.setAlpha(0.3f);
            ColorflowModeActivity.this.m19968Y();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.ColorflowModeActivity$b */
    class C8381b implements View.OnClickListener {
        C8381b() {
        }

        public void onClick(View view) {
            view.setAlpha(1.0f);
            ColorflowModeActivity.this.f14470b.setAlpha(0.3f);
            ColorflowModeActivity.this.m19969Z();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.ColorflowModeActivity$c */
    class C8382c implements View.OnClickListener {
        C8382c() {
        }

        public void onClick(View view) {
            ColorflowModeActivity.this.onBackPressed();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.ColorflowModeActivity$d */
    class C8383d implements View.OnClickListener {
        C8383d() {
        }

        public void onClick(View view) {
            ColorflowModeActivity.this.m19970a0();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.ColorflowModeActivity$e */
    public interface C8384e {
        /* renamed from: a */
        void mo35679a(int i);
    }

    /* access modifiers changed from: private */
    /* renamed from: Y */
    public void m19968Y() {
        this.f14475g = 0;
        FragmentTransaction beginTransaction = this.f14476h.beginTransaction();
        this.f14477i = beginTransaction;
        beginTransaction.hide(this.f14479k).show(this.f14478j);
        this.f14477i.commit();
    }

    /* access modifiers changed from: private */
    /* renamed from: Z */
    public void m19969Z() {
        this.f14475g = 1;
        FragmentTransaction beginTransaction = this.f14476h.beginTransaction();
        this.f14477i = beginTransaction;
        beginTransaction.hide(this.f14478j).show(this.f14479k);
        this.f14477i.commit();
    }

    /* access modifiers changed from: private */
    /* renamed from: a0 */
    public void m19970a0() {
        int[] z = this.f14475g == 0 ? this.f14478j.mo35681z() : this.f14479k.mo35882x();
        for (int i = 0; i < z.length; i++) {
            z[i] = NativeLightMix.color_rgb_trans((char) Color.red(z[i]), (char) Color.green(z[i]), (char) Color.blue(z[i]));
        }
        int length = z.length;
        C8327s.C8328a[] aVarArr = new C8327s.C8328a[length];
        for (int i2 = 0; i2 < length; i2++) {
            aVarArr[i2] = new C8327s.C8328a(2000, 1, z[i2], 100);
        }
        C3012e eVar = this.f14474f;
        eVar.mo23168x1(new C8321m("", 4, eVar.mo23221d0().mo31601m(), -1, -1, aVarArr));
        finish();
    }

    /* renamed from: b0 */
    public void mo35674b0(int i) {
        this.f14469a.setColor(i);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (this.f14475g == 0) {
            this.f14478j.onActivityResult(i, i2, intent);
        } else {
            this.f14479k.onActivityResult(i, i2, intent);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo35653P();
        setContentView(R$layout.activity_colorflow_mode);
        this.f14469a = (ColorsLinearLayout) findViewById(R$id.color_flow_bg);
        this.f14470b = (TextView) findViewById(R$id.btn_color);
        this.f14471c = (TextView) findViewById(R$id.btn_photo);
        this.f14472d = (ImageView) findViewById(R$id.header_left_btn);
        this.f14473e = (TextView) findViewById(R$id.title_bar_more);
        Intent intent = getIntent();
        if (!intent.hasExtra("com.yeelight.cherry.device_id")) {
            AppUtils.m8302w(f14468l, "Activity has not device id", false);
            finish();
            return;
        }
        C3012e r0 = YeelightDeviceManager.m7804r0(intent.getStringExtra("com.yeelight.cherry.device_id"));
        this.f14474f = r0;
        if (r0 == null || !r0.mo23145k0()) {
            BaseActivity.m19947U(this);
            finish();
            return;
        }
        this.f14478j = new ColorflowSelectorFragment();
        this.f14479k = new PhotoColorFragment();
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        this.f14476h = supportFragmentManager;
        FragmentTransaction beginTransaction = supportFragmentManager.beginTransaction();
        this.f14477i = beginTransaction;
        int i = R$id.colorflow_content;
        beginTransaction.add(i, (Fragment) this.f14478j);
        this.f14477i.add(i, (Fragment) this.f14479k);
        this.f14477i.hide(this.f14479k);
        this.f14477i.commit();
        this.f14470b.setOnClickListener(new C8380a());
        this.f14471c.setOnClickListener(new C8381b());
        this.f14472d.setOnClickListener(new C8382c());
        this.f14473e.setOnClickListener(new C8383d());
    }
}
