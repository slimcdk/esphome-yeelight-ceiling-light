package com.yeelight.yeelib.p142ui.activity;

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
import com.yeelight.yeelib.device.base.C3012e;
import com.yeelight.yeelib.managers.YeelightDeviceManager;
import com.yeelight.yeelib.p142ui.view.AlarmTextView;
import com.yeelight.yeelib.p142ui.view.CommonTitleBar;
import com.yeelight.yeelib.p142ui.view.RedSpotTipImageView;
import com.yeelight.yeelib.p142ui.view.TimePicker;
import com.yeelight.yeelib.utils.AppUtils;
import p051j4.C9193k;
import p160g4.C9071c;
import p232y3.C12045h;
import p237z3.C12143c;

/* renamed from: com.yeelight.yeelib.ui.activity.NightLightActivity */
public class NightLightActivity extends BaseActivity implements C12143c {
    /* access modifiers changed from: private */

    /* renamed from: t */
    public static final String f14962t = "NightLightActivity";

    /* renamed from: a */
    CommonTitleBar f14963a;

    /* renamed from: b */
    LinearLayout f14964b;

    /* renamed from: c */
    LinearLayout f14965c;

    /* renamed from: d */
    ImageView f14966d;

    /* renamed from: e */
    AlarmTextView f14967e;

    /* renamed from: f */
    AlarmTextView f14968f;

    /* renamed from: g */
    TimePicker f14969g;

    /* renamed from: h */
    private C3012e f14970h;

    /* renamed from: i */
    String f14971i = "";

    /* renamed from: j */
    String f14972j = "";

    /* renamed from: k */
    int f14973k = 0;

    /* renamed from: l */
    int f14974l = 0;

    /* renamed from: m */
    int f14975m = 5;

    /* renamed from: n */
    int f14976n = 0;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public boolean f14977o = false;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public int f14978p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public int f14979q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public int f14980r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public int f14981s;

    /* renamed from: com.yeelight.yeelib.ui.activity.NightLightActivity$a */
    class C8539a implements View.OnClickListener {
        C8539a() {
        }

        public void onClick(View view) {
            NightLightActivity.this.onBackPressed();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.NightLightActivity$b */
    class C8540b implements TimePicker.C8867g {
        C8540b() {
        }

        /* renamed from: a */
        public void mo35818a(TimePicker timePicker, int i, int i2) {
            AlarmTextView alarmTextView;
            String str;
            String unused = NightLightActivity.f14962t;
            String str2 = String.format("%02d", new Object[]{Integer.valueOf(i)}) + Constants.COLON_SEPARATOR + String.format("%02d", new Object[]{Integer.valueOf(i2)});
            if (NightLightActivity.this.f14967e.isSelected()) {
                NightLightActivity nightLightActivity = NightLightActivity.this;
                nightLightActivity.f14973k = i;
                nightLightActivity.f14974l = i2;
                alarmTextView = nightLightActivity.f14967e;
                str = String.format(nightLightActivity.f14971i, new Object[]{" " + str2});
            } else {
                NightLightActivity nightLightActivity2 = NightLightActivity.this;
                nightLightActivity2.f14975m = i;
                nightLightActivity2.f14976n = i2;
                alarmTextView = nightLightActivity2.f14968f;
                str = String.format(nightLightActivity2.f14972j, new Object[]{" " + str2});
            }
            alarmTextView.setText(str);
            NightLightActivity.this.m20295k0();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.NightLightActivity$c */
    class C8541c implements View.OnClickListener {
        C8541c() {
        }

        public void onClick(View view) {
            NightLightActivity.this.f14967e.setSelected(true);
            NightLightActivity.this.f14968f.setSelected(false);
            NightLightActivity nightLightActivity = NightLightActivity.this;
            nightLightActivity.f14969g.setCurrentHour(Integer.valueOf(nightLightActivity.f14973k));
            NightLightActivity nightLightActivity2 = NightLightActivity.this;
            nightLightActivity2.f14969g.setCurrentMinute(Integer.valueOf(nightLightActivity2.f14974l));
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.NightLightActivity$d */
    class C8542d implements View.OnClickListener {
        C8542d() {
        }

        public void onClick(View view) {
            NightLightActivity.this.f14967e.setSelected(false);
            NightLightActivity.this.f14968f.setSelected(true);
            NightLightActivity nightLightActivity = NightLightActivity.this;
            nightLightActivity.f14969g.setCurrentHour(Integer.valueOf(nightLightActivity.f14975m));
            NightLightActivity nightLightActivity2 = NightLightActivity.this;
            nightLightActivity2.f14969g.setCurrentMinute(Integer.valueOf(nightLightActivity2.f14976n));
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.NightLightActivity$e */
    class C8543e implements View.OnClickListener {
        C8543e() {
        }

        public void onClick(View view) {
            if (NightLightActivity.this.f14977o) {
                NightLightActivity.this.f14966d.setImageResource(R$drawable.setting_switch_off);
                NightLightActivity.this.m20292h0();
            } else {
                NightLightActivity.this.f14966d.setImageResource(R$drawable.setting_switch_on);
                NightLightActivity.this.m20294j0();
            }
            NightLightActivity nightLightActivity = NightLightActivity.this;
            boolean unused = nightLightActivity.f14977o = !nightLightActivity.f14977o;
            NightLightActivity.this.m20293i0();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.NightLightActivity$f */
    class C8544f implements Runnable {
        C8544f() {
        }

        public void run() {
            NightLightActivity.this.m20296l0();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.NightLightActivity$g */
    class C8545g implements C9071c.C9075d {
        C8545g() {
        }

        /* renamed from: a */
        public void mo31271a(String str, C9071c cVar) {
            NightLightActivity.this.m20293i0();
            NightLightActivity.this.finish();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.NightLightActivity$h */
    class C8546h implements C9071c.C9075d {
        C8546h() {
        }

        /* renamed from: a */
        public void mo31271a(String str, C9071c cVar) {
            NightLightActivity.this.finish();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.NightLightActivity$i */
    class C8547i implements Runnable {

        /* renamed from: com.yeelight.yeelib.ui.activity.NightLightActivity$i$a */
        class C8548a implements View.OnClickListener {
            C8548a() {
            }

            public void onClick(View view) {
                NightLightActivity.this.m20293i0();
                NightLightActivity.this.finish();
            }
        }

        C8547i() {
        }

        public void run() {
            int i;
            NightLightActivity nightLightActivity;
            RedSpotTipImageView redSpotTipImageView;
            NightLightActivity nightLightActivity2 = NightLightActivity.this;
            if (nightLightActivity2.f14973k == nightLightActivity2.f14978p) {
                int f0 = NightLightActivity.this.f14979q;
                NightLightActivity nightLightActivity3 = NightLightActivity.this;
                if (f0 == nightLightActivity3.f14974l) {
                    int g0 = nightLightActivity3.f14980r;
                    NightLightActivity nightLightActivity4 = NightLightActivity.this;
                    if (g0 == nightLightActivity4.f14975m) {
                        int X = nightLightActivity4.f14981s;
                        NightLightActivity nightLightActivity5 = NightLightActivity.this;
                        if (X == nightLightActivity5.f14976n) {
                            nightLightActivity5.f14963a.getRightButton().setOnClickListener((View.OnClickListener) null);
                            redSpotTipImageView = NightLightActivity.this.f14963a.getRightButton();
                            nightLightActivity = NightLightActivity.this;
                            i = R$drawable.icon_yeelight_save_unused;
                            redSpotTipImageView.setBackground(ContextCompat.getDrawable(nightLightActivity, i));
                        }
                    }
                }
            }
            NightLightActivity.this.f14963a.getRightButton().setOnClickListener(new C8548a());
            redSpotTipImageView = NightLightActivity.this.f14963a.getRightButton();
            nightLightActivity = NightLightActivity.this;
            i = R$drawable.round_save;
            redSpotTipImageView.setBackground(ContextCompat.getDrawable(nightLightActivity, i));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: h0 */
    public void m20292h0() {
        this.f14965c.setVisibility(0);
        LinearLayout linearLayout = this.f14965c;
        ObjectAnimator.ofFloat(linearLayout, "translationY", new float[]{0.0f, (float) linearLayout.getHeight()}).start();
        this.f14966d.setImageResource(R$drawable.setting_switch_off);
    }

    /* access modifiers changed from: private */
    /* renamed from: i0 */
    public void m20293i0() {
        int i = this.f14973k;
        this.f14978p = i;
        int i2 = this.f14974l;
        this.f14979q = i2;
        int i3 = this.f14975m;
        this.f14980r = i3;
        int i4 = this.f14976n;
        this.f14981s = i4;
        this.f14970h.mo23166x(11, new C12045h(this.f14977o, 100, i, i2, i3, i4));
        Toast.makeText(this, getResources().getString(R$string.common_text_set_complete), 0).show();
        this.f14970h.mo23166x(3, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: j0 */
    public void m20294j0() {
        this.f14965c.setVisibility(0);
        LinearLayout linearLayout = this.f14965c;
        ObjectAnimator.ofFloat(linearLayout, "translationY", new float[]{(float) linearLayout.getHeight(), 0.0f}).start();
        this.f14966d.setImageResource(R$drawable.setting_switch_on);
    }

    /* access modifiers changed from: private */
    /* renamed from: k0 */
    public void m20295k0() {
        this.f14963a.post(new C8547i());
    }

    /* access modifiers changed from: private */
    /* renamed from: l0 */
    public void m20296l0() {
        int i;
        TimePicker timePicker;
        C12045h hVar = (C12045h) this.f14970h.mo23221d0().mo31611r(3);
        if (hVar != null) {
            if (this.f14977o == hVar.mo42721e() || !hVar.mo42721e()) {
                this.f14977o = false;
                m20292h0();
                this.f14965c.setVisibility(4);
            } else {
                this.f14977o = true;
                m20294j0();
            }
            this.f14973k = hVar.mo42717a();
            this.f14974l = hVar.mo42718b();
            this.f14975m = hVar.mo42719c();
            int d = hVar.mo42720d();
            this.f14976n = d;
            this.f14978p = this.f14973k;
            this.f14979q = this.f14974l;
            this.f14980r = this.f14975m;
            this.f14981s = d;
            if (this.f14967e.isSelected()) {
                this.f14969g.setCurrentHour(Integer.valueOf(this.f14973k));
                timePicker = this.f14969g;
                i = this.f14974l;
            } else {
                this.f14969g.setCurrentHour(Integer.valueOf(this.f14975m));
                timePicker = this.f14969g;
                i = this.f14976n;
            }
            timePicker.setCurrentMinute(Integer.valueOf(i));
            AlarmTextView alarmTextView = this.f14967e;
            String str = this.f14971i;
            alarmTextView.setText(String.format(str, new Object[]{" " + String.format("%02d", new Object[]{Integer.valueOf(this.f14973k)}) + Constants.COLON_SEPARATOR + String.format("%02d", new Object[]{Integer.valueOf(this.f14974l)})}));
            AlarmTextView alarmTextView2 = this.f14968f;
            String str2 = this.f14972j;
            alarmTextView2.setText(String.format(str2, new Object[]{" " + String.format("%02d", new Object[]{Integer.valueOf(this.f14975m)}) + Constants.COLON_SEPARATOR + String.format("%02d", new Object[]{Integer.valueOf(this.f14976n)})}));
        }
    }

    public void onBackPressed() {
        if (this.f14973k == this.f14978p && this.f14979q == this.f14974l && this.f14980r == this.f14975m && this.f14981s == this.f14976n) {
            finish();
            return;
        }
        C9071c.m21727p(this, getString(R$string.common_text_discard), getString(R$string.common_text_save), getString(R$string.common_text_cancel), new C8545g(), new C8546h());
    }

    public void onConnectionStateChanged(int i, int i2) {
        if (i2 == 0) {
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo35653P();
        C9193k.m22157h(true, this);
        setContentView(R$layout.activity_nightlight);
        int i = R$id.title_bar;
        this.f14963a = (CommonTitleBar) findViewById(i);
        this.f14964b = (LinearLayout) findViewById(R$id.nightlight_layout);
        this.f14965c = (LinearLayout) findViewById(R$id.night_light_time_area);
        this.f14966d = (ImageView) findViewById(R$id.nightlight_switch);
        this.f14967e = (AlarmTextView) findViewById(R$id.time_from);
        this.f14968f = (AlarmTextView) findViewById(R$id.time_to);
        this.f14969g = (TimePicker) findViewById(R$id.timerPicker);
        Intent intent = getIntent();
        if (!intent.hasExtra("com.yeelight.cherry.device_id")) {
            AppUtils.m8302w(f14962t, "Activity has not device id", false);
            finish();
            return;
        }
        C3012e r0 = YeelightDeviceManager.m7804r0(intent.getStringExtra("com.yeelight.cherry.device_id"));
        this.f14970h = r0;
        if (r0 == null || !r0.mo23145k0()) {
            BaseActivity.m19947U(this);
            finish();
            return;
        }
        CommonTitleBar commonTitleBar = (CommonTitleBar) findViewById(i);
        this.f14963a = commonTitleBar;
        commonTitleBar.mo36195a(getString(R$string.feature_night_light), new C8539a(), (View.OnClickListener) null);
        this.f14963a.setTitleTextSize(16);
        this.f14965c.setVisibility(8);
        this.f14971i = getResources().getString(R$string.common_text_from);
        this.f14972j = getResources().getString(R$string.common_text_to);
        this.f14967e.setText(String.format(this.f14971i, new Object[]{"00:00"}));
        this.f14968f.setSelected(true);
        this.f14968f.setText(String.format(this.f14972j, new Object[]{"05:00"}));
        this.f14968f.setSelected(false);
        this.f14969g.setIs24HourView(Boolean.TRUE);
        this.f14969g.setCurrentHour(0);
        this.f14969g.setCurrentMinute(0);
        this.f14969g.setOnTimeChangedListener(new C8540b());
        this.f14967e.setOnClickListener(new C8541c());
        this.f14968f.setOnClickListener(new C8542d());
        this.f14964b.setOnClickListener(new C8543e());
        this.f14964b.post(new C8544f());
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
        this.f14970h.mo23133V0(this);
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        this.f14970h.mo23171z0(this);
    }
}
