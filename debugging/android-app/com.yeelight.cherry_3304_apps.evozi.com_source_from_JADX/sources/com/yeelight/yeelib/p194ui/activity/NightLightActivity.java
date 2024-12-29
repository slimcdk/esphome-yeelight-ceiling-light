package com.yeelight.yeelib.p194ui.activity;

import android.animation.ObjectAnimator;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;
import androidx.core.content.ContextCompat;
import com.xiaomi.mipush.sdk.Constants;
import com.yeelight.yeelib.R$drawable;
import com.yeelight.yeelib.R$id;
import com.yeelight.yeelib.R$layout;
import com.yeelight.yeelib.R$string;
import com.yeelight.yeelib.p150c.p151i.C4200i;
import com.yeelight.yeelib.p150c.p184n.C7558h;
import com.yeelight.yeelib.p152f.C4257w;
import com.yeelight.yeelib.p186e.C9768c;
import com.yeelight.yeelib.p191j.p192a.C9897c;
import com.yeelight.yeelib.p194ui.view.AlarmTextView;
import com.yeelight.yeelib.p194ui.view.CommonTitleBar;
import com.yeelight.yeelib.p194ui.view.RedSpotTipImageView;
import com.yeelight.yeelib.p194ui.view.TimePicker;
import com.yeelight.yeelib.utils.C10547m;
import com.yeelight.yeelib.utils.C4308b;

/* renamed from: com.yeelight.yeelib.ui.activity.NightLightActivity */
public class NightLightActivity extends BaseActivity implements C9768c {
    /* access modifiers changed from: private */

    /* renamed from: u */
    public static final String f18654u = NightLightActivity.class.getSimpleName();

    /* renamed from: b */
    CommonTitleBar f18655b;

    /* renamed from: c */
    LinearLayout f18656c;

    /* renamed from: d */
    LinearLayout f18657d;

    /* renamed from: e */
    ImageView f18658e;

    /* renamed from: f */
    AlarmTextView f18659f;

    /* renamed from: g */
    AlarmTextView f18660g;

    /* renamed from: h */
    TimePicker f18661h;

    /* renamed from: i */
    private C4200i f18662i;

    /* renamed from: j */
    String f18663j = "";

    /* renamed from: k */
    String f18664k = "";

    /* renamed from: l */
    int f18665l = 0;

    /* renamed from: m */
    int f18666m = 0;

    /* renamed from: n */
    int f18667n = 5;

    /* renamed from: o */
    int f18668o = 0;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public boolean f18669p = false;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public int f18670q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public int f18671r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public int f18672s;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public int f18673t;

    /* renamed from: com.yeelight.yeelib.ui.activity.NightLightActivity$a */
    class C10121a implements View.OnClickListener {
        C10121a() {
        }

        public void onClick(View view) {
            NightLightActivity.this.onBackPressed();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.NightLightActivity$b */
    class C10122b implements TimePicker.C10490g {
        C10122b() {
        }

        /* renamed from: a */
        public void mo32387a(TimePicker timePicker, int i, int i2) {
            AlarmTextView alarmTextView;
            String str;
            String unused = NightLightActivity.f18654u;
            String str2 = String.format("%02d", new Object[]{Integer.valueOf(i)}) + Constants.COLON_SEPARATOR + String.format("%02d", new Object[]{Integer.valueOf(i2)});
            if (NightLightActivity.this.f18659f.isSelected()) {
                NightLightActivity nightLightActivity = NightLightActivity.this;
                nightLightActivity.f18665l = i;
                nightLightActivity.f18666m = i2;
                alarmTextView = nightLightActivity.f18659f;
                str = String.format(nightLightActivity.f18663j, new Object[]{" " + str2});
            } else {
                NightLightActivity nightLightActivity2 = NightLightActivity.this;
                nightLightActivity2.f18667n = i;
                nightLightActivity2.f18668o = i2;
                alarmTextView = nightLightActivity2.f18660g;
                str = String.format(nightLightActivity2.f18664k, new Object[]{" " + str2});
            }
            alarmTextView.setText(str);
            NightLightActivity.this.m24688k0();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.NightLightActivity$c */
    class C10123c implements View.OnClickListener {
        C10123c() {
        }

        public void onClick(View view) {
            NightLightActivity.this.f18659f.setSelected(true);
            NightLightActivity.this.f18660g.setSelected(false);
            NightLightActivity nightLightActivity = NightLightActivity.this;
            nightLightActivity.f18661h.setCurrentHour(Integer.valueOf(nightLightActivity.f18665l));
            NightLightActivity nightLightActivity2 = NightLightActivity.this;
            nightLightActivity2.f18661h.setCurrentMinute(Integer.valueOf(nightLightActivity2.f18666m));
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.NightLightActivity$d */
    class C10124d implements View.OnClickListener {
        C10124d() {
        }

        public void onClick(View view) {
            NightLightActivity.this.f18659f.setSelected(false);
            NightLightActivity.this.f18660g.setSelected(true);
            NightLightActivity nightLightActivity = NightLightActivity.this;
            nightLightActivity.f18661h.setCurrentHour(Integer.valueOf(nightLightActivity.f18667n));
            NightLightActivity nightLightActivity2 = NightLightActivity.this;
            nightLightActivity2.f18661h.setCurrentMinute(Integer.valueOf(nightLightActivity2.f18668o));
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.NightLightActivity$e */
    class C10125e implements View.OnClickListener {
        C10125e() {
        }

        public void onClick(View view) {
            if (NightLightActivity.this.f18669p) {
                NightLightActivity.this.f18658e.setImageResource(R$drawable.setting_switch_off);
                NightLightActivity.this.m24685h0();
            } else {
                NightLightActivity.this.f18658e.setImageResource(R$drawable.setting_switch_on);
                NightLightActivity.this.m24687j0();
            }
            NightLightActivity nightLightActivity = NightLightActivity.this;
            boolean unused = nightLightActivity.f18669p = !nightLightActivity.f18669p;
            NightLightActivity.this.m24686i0();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.NightLightActivity$f */
    class C10126f implements Runnable {
        C10126f() {
        }

        public void run() {
            NightLightActivity.this.m24689l0();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.NightLightActivity$g */
    class C10127g implements C9897c.C9901d {
        C10127g() {
        }

        /* renamed from: a */
        public void mo27312a(String str, C9897c cVar) {
            NightLightActivity.this.m24686i0();
            NightLightActivity.this.finish();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.NightLightActivity$h */
    class C10128h implements C9897c.C9901d {
        C10128h() {
        }

        /* renamed from: a */
        public void mo27312a(String str, C9897c cVar) {
            NightLightActivity.this.finish();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.NightLightActivity$i */
    class C10129i implements Runnable {

        /* renamed from: com.yeelight.yeelib.ui.activity.NightLightActivity$i$a */
        class C10130a implements View.OnClickListener {
            C10130a() {
            }

            public void onClick(View view) {
                NightLightActivity.this.m24686i0();
                NightLightActivity.this.finish();
            }
        }

        C10129i() {
        }

        public void run() {
            int i;
            NightLightActivity nightLightActivity;
            RedSpotTipImageView redSpotTipImageView;
            NightLightActivity nightLightActivity2 = NightLightActivity.this;
            if (nightLightActivity2.f18665l == nightLightActivity2.f18670q) {
                int f0 = NightLightActivity.this.f18671r;
                NightLightActivity nightLightActivity3 = NightLightActivity.this;
                if (f0 == nightLightActivity3.f18666m) {
                    int g0 = nightLightActivity3.f18672s;
                    NightLightActivity nightLightActivity4 = NightLightActivity.this;
                    if (g0 == nightLightActivity4.f18667n) {
                        int X = nightLightActivity4.f18673t;
                        NightLightActivity nightLightActivity5 = NightLightActivity.this;
                        if (X == nightLightActivity5.f18668o) {
                            nightLightActivity5.f18655b.getRightButton().setOnClickListener((View.OnClickListener) null);
                            redSpotTipImageView = NightLightActivity.this.f18655b.getRightButton();
                            nightLightActivity = NightLightActivity.this;
                            i = R$drawable.icon_yeelight_save_unused;
                            redSpotTipImageView.setBackground(ContextCompat.getDrawable(nightLightActivity, i));
                        }
                    }
                }
            }
            NightLightActivity.this.f18655b.getRightButton().setOnClickListener(new C10130a());
            redSpotTipImageView = NightLightActivity.this.f18655b.getRightButton();
            nightLightActivity = NightLightActivity.this;
            i = R$drawable.round_save;
            redSpotTipImageView.setBackground(ContextCompat.getDrawable(nightLightActivity, i));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: h0 */
    public void m24685h0() {
        this.f18657d.setVisibility(0);
        LinearLayout linearLayout = this.f18657d;
        ObjectAnimator.ofFloat(linearLayout, "translationY", new float[]{0.0f, (float) linearLayout.getHeight()}).start();
        this.f18658e.setImageResource(R$drawable.setting_switch_off);
    }

    /* access modifiers changed from: private */
    /* renamed from: i0 */
    public void m24686i0() {
        int i = this.f18665l;
        this.f18670q = i;
        int i2 = this.f18666m;
        this.f18671r = i2;
        int i3 = this.f18667n;
        this.f18672s = i3;
        int i4 = this.f18668o;
        this.f18673t = i4;
        this.f18662i.mo23353x(11, new C7558h(this.f18669p, 100, i, i2, i3, i4));
        Toast.makeText(this, getResources().getString(R$string.common_text_set_complete), 0).show();
        this.f18662i.mo23353x(3, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: j0 */
    public void m24687j0() {
        this.f18657d.setVisibility(0);
        LinearLayout linearLayout = this.f18657d;
        ObjectAnimator.ofFloat(linearLayout, "translationY", new float[]{(float) linearLayout.getHeight(), 0.0f}).start();
        this.f18658e.setImageResource(R$drawable.setting_switch_on);
    }

    /* access modifiers changed from: private */
    /* renamed from: k0 */
    public void m24688k0() {
        this.f18655b.post(new C10129i());
    }

    /* access modifiers changed from: private */
    /* renamed from: l0 */
    public void m24689l0() {
        int i;
        TimePicker timePicker;
        C7558h hVar = (C7558h) this.f18662i.mo23408d0().mo27710r(3);
        if (hVar != null) {
            if (this.f18669p == hVar.mo28922e() || !hVar.mo28922e()) {
                this.f18669p = false;
                m24685h0();
                this.f18657d.setVisibility(4);
            } else {
                this.f18669p = true;
                m24687j0();
            }
            this.f18665l = hVar.mo28918a();
            this.f18666m = hVar.mo28919b();
            this.f18667n = hVar.mo28920c();
            int d = hVar.mo28921d();
            this.f18668o = d;
            this.f18670q = this.f18665l;
            this.f18671r = this.f18666m;
            this.f18672s = this.f18667n;
            this.f18673t = d;
            if (this.f18659f.isSelected()) {
                this.f18661h.setCurrentHour(Integer.valueOf(this.f18665l));
                timePicker = this.f18661h;
                i = this.f18666m;
            } else {
                this.f18661h.setCurrentHour(Integer.valueOf(this.f18667n));
                timePicker = this.f18661h;
                i = this.f18668o;
            }
            timePicker.setCurrentMinute(Integer.valueOf(i));
            AlarmTextView alarmTextView = this.f18659f;
            String str = this.f18663j;
            alarmTextView.setText(String.format(str, new Object[]{" " + String.format("%02d", new Object[]{Integer.valueOf(this.f18665l)}) + Constants.COLON_SEPARATOR + String.format("%02d", new Object[]{Integer.valueOf(this.f18666m)})}));
            AlarmTextView alarmTextView2 = this.f18660g;
            String str2 = this.f18664k;
            alarmTextView2.setText(String.format(str2, new Object[]{" " + String.format("%02d", new Object[]{Integer.valueOf(this.f18667n)}) + Constants.COLON_SEPARATOR + String.format("%02d", new Object[]{Integer.valueOf(this.f18668o)})}));
        }
    }

    public void onBackPressed() {
        if (this.f18665l == this.f18670q && this.f18671r == this.f18666m && this.f18672s == this.f18667n && this.f18673t == this.f18668o) {
            finish();
            return;
        }
        C9897c.m24274p(this, getString(R$string.common_text_discard), getString(R$string.common_text_save), getString(R$string.common_text_cancel), new C10127g(), new C10128h());
    }

    public void onConnectionStateChanged(int i, int i2) {
        if (i2 == 0) {
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo32193P();
        C10547m.m25758h(true, this);
        setContentView(R$layout.activity_nightlight);
        this.f18655b = (CommonTitleBar) findViewById(R$id.title_bar);
        this.f18656c = (LinearLayout) findViewById(R$id.nightlight_layout);
        this.f18657d = (LinearLayout) findViewById(R$id.night_light_time_area);
        this.f18658e = (ImageView) findViewById(R$id.nightlight_switch);
        this.f18659f = (AlarmTextView) findViewById(R$id.time_from);
        this.f18660g = (AlarmTextView) findViewById(R$id.time_to);
        this.f18661h = (TimePicker) findViewById(R$id.timerPicker);
        Intent intent = getIntent();
        if (!intent.hasExtra("com.yeelight.cherry.device_id")) {
            C4308b.m12141t(f18654u, "Activity has not device id", false);
            finish();
            return;
        }
        C4200i o0 = C4257w.m11953o0(intent.getStringExtra("com.yeelight.cherry.device_id"));
        this.f18662i = o0;
        if (o0 == null || !o0.mo23331k0()) {
            BaseActivity.m24384U(this);
            finish();
            return;
        }
        CommonTitleBar commonTitleBar = (CommonTitleBar) findViewById(R$id.title_bar);
        this.f18655b = commonTitleBar;
        commonTitleBar.mo32825a(getString(R$string.feature_night_light), new C10121a(), (View.OnClickListener) null);
        this.f18655b.setTitleTextSize(16);
        this.f18657d.setVisibility(8);
        this.f18663j = getResources().getString(R$string.common_text_from);
        this.f18664k = getResources().getString(R$string.common_text_to);
        this.f18659f.setText(String.format(this.f18663j, new Object[]{"00:00"}));
        this.f18660g.setSelected(true);
        this.f18660g.setText(String.format(this.f18664k, new Object[]{"05:00"}));
        this.f18660g.setSelected(false);
        this.f18661h.setIs24HourView(Boolean.TRUE);
        this.f18661h.setCurrentHour(0);
        this.f18661h.setCurrentMinute(0);
        this.f18661h.setOnTimeChangedListener(new C10122b());
        this.f18659f.setOnClickListener(new C10123c());
        this.f18660g.setOnClickListener(new C10124d());
        this.f18656c.setOnClickListener(new C10125e());
        this.f18656c.post(new C10126f());
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
    }

    public void onLocalConnected() {
    }

    public void onLocalDisconnected() {
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        this.f18662i.mo23319V0(this);
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        this.f18662i.mo23358z0(this);
    }
}
