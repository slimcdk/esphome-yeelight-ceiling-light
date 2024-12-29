package com.yeelight.yeelib.p194ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.xiaomi.mipush.sdk.Constants;
import com.yeelight.yeelib.R$id;
import com.yeelight.yeelib.R$layout;
import com.yeelight.yeelib.R$string;
import com.yeelight.yeelib.p150c.C6006h;
import com.yeelight.yeelib.p152f.C4257w;
import com.yeelight.yeelib.p191j.p192a.C9897c;
import com.yeelight.yeelib.p194ui.view.CommonTitleBar;
import com.yeelight.yeelib.p194ui.view.TimeMinutePicker;
import com.yeelight.yeelib.p194ui.view.TimePicker;
import com.yeelight.yeelib.p194ui.widget.C10518c;
import com.yeelight.yeelib.utils.C10547m;
import com.yeelight.yeelib.utils.C4308b;

/* renamed from: com.yeelight.yeelib.ui.activity.NightTimeSettingActivity */
public class NightTimeSettingActivity extends BaseActivity {

    /* renamed from: b */
    private final String f18724b = NightTimeSettingActivity.class.getSimpleName();

    /* renamed from: c */
    C6006h f18725c;

    /* renamed from: d */
    LinearLayout f18726d;

    /* renamed from: e */
    LinearLayout f18727e;

    /* renamed from: f */
    LinearLayout f18728f;

    /* renamed from: g */
    C10518c f18729g;

    /* renamed from: h */
    TimePicker f18730h;

    /* renamed from: i */
    TimeMinutePicker f18731i;

    /* renamed from: j */
    TextView f18732j;

    /* renamed from: k */
    TextView f18733k;

    /* renamed from: l */
    TextView f18734l;

    /* renamed from: m */
    TextView f18735m;

    /* renamed from: n */
    CommonTitleBar f18736n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public String f18737o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public String f18738p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public String f18739q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public String f18740r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public int f18741s;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public boolean f18742t;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public boolean f18743u;

    /* renamed from: com.yeelight.yeelib.ui.activity.NightTimeSettingActivity$a */
    class C10144a implements Runnable {
        C10144a() {
        }

        public void run() {
            StringBuilder sb;
            StringBuilder sb2;
            if (NightTimeSettingActivity.this.f18742t) {
                NightTimeSettingActivity.this.f18729g.setChecked(true);
                NightTimeSettingActivity.this.f18728f.setVisibility(0);
                NightTimeSettingActivity.this.f18735m.setVisibility(0);
                if (NightTimeSettingActivity.this.f18741s == 0) {
                    int unused = NightTimeSettingActivity.this.f18741s = 15;
                }
                NightTimeSettingActivity.this.f18734l.setText(NightTimeSettingActivity.this.f18741s + NightTimeSettingActivity.this.getString(R$string.night_light_delay_off_unit));
            } else {
                NightTimeSettingActivity.this.f18729g.setChecked(false);
                NightTimeSettingActivity.this.f18735m.setVisibility(4);
                NightTimeSettingActivity.this.f18728f.setVisibility(4);
                NightTimeSettingActivity.this.f18731i.setVisibility(8);
            }
            if (NightTimeSettingActivity.this.f18738p.length() == 1) {
                sb = new StringBuilder();
                sb.append(NightTimeSettingActivity.this.f18737o);
                sb.append(":0");
            } else {
                sb = new StringBuilder();
                sb.append(NightTimeSettingActivity.this.f18737o);
                sb.append(Constants.COLON_SEPARATOR);
            }
            sb.append(NightTimeSettingActivity.this.f18738p);
            String sb3 = sb.toString();
            if (NightTimeSettingActivity.this.f18740r.length() == 1) {
                sb2 = new StringBuilder();
                sb2.append(NightTimeSettingActivity.this.f18739q);
                sb2.append(":0");
            } else {
                sb2 = new StringBuilder();
                sb2.append(NightTimeSettingActivity.this.f18739q);
                sb2.append(Constants.COLON_SEPARATOR);
            }
            sb2.append(NightTimeSettingActivity.this.f18740r);
            String sb4 = sb2.toString();
            NightTimeSettingActivity.this.f18732j.setText(sb3);
            NightTimeSettingActivity.this.f18733k.setText(sb4);
            NightTimeSettingActivity.this.f18734l.setText(NightTimeSettingActivity.this.f18741s + NightTimeSettingActivity.this.getString(R$string.night_light_delay_off_unit));
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.NightTimeSettingActivity$b */
    class C10145b implements C9897c.C9901d {
        C10145b() {
        }

        /* renamed from: a */
        public void mo27312a(String str, C9897c cVar) {
            NightTimeSettingActivity.this.m24735n0();
            NightTimeSettingActivity.this.finish();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.NightTimeSettingActivity$c */
    class C10146c implements C9897c.C9901d {
        C10146c() {
        }

        /* renamed from: a */
        public void mo27312a(String str, C9897c cVar) {
            NightTimeSettingActivity.this.finish();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.NightTimeSettingActivity$d */
    class C10147d implements View.OnClickListener {
        C10147d() {
        }

        public void onClick(View view) {
            NightTimeSettingActivity.this.onBackPressed();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.NightTimeSettingActivity$e */
    class C10148e implements View.OnClickListener {
        C10148e() {
        }

        public void onClick(View view) {
            NightTimeSettingActivity.this.m24735n0();
            NightTimeSettingActivity.this.finish();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.NightTimeSettingActivity$f */
    class C10149f implements View.OnClickListener {
        C10149f() {
        }

        public void onClick(View view) {
            NightTimeSettingActivity.this.f18731i.setVisibility(4);
            NightTimeSettingActivity.this.f18730h.setVisibility(0);
            NightTimeSettingActivity.this.f18730h.setOnTimeChangedListener((TimePicker.C10490g) null);
            NightTimeSettingActivity.this.m24738q0();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.NightTimeSettingActivity$g */
    class C10150g implements View.OnClickListener {
        C10150g() {
        }

        public void onClick(View view) {
            NightTimeSettingActivity.this.f18731i.setVisibility(4);
            NightTimeSettingActivity.this.f18730h.setVisibility(0);
            NightTimeSettingActivity.this.f18730h.setOnTimeChangedListener((TimePicker.C10490g) null);
            NightTimeSettingActivity.this.m24737p0();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.NightTimeSettingActivity$h */
    class C10151h implements View.OnClickListener {
        C10151h() {
        }

        public void onClick(View view) {
            NightTimeSettingActivity.this.f18731i.setVisibility(0);
            NightTimeSettingActivity.this.f18730h.setVisibility(4);
            NightTimeSettingActivity.this.m24736o0();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.NightTimeSettingActivity$i */
    class C10152i implements CompoundButton.OnCheckedChangeListener {
        C10152i() {
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            boolean unused = NightTimeSettingActivity.this.f18742t = z;
            boolean unused2 = NightTimeSettingActivity.this.f18743u = true;
            NightTimeSettingActivity.this.m24739r0();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.NightTimeSettingActivity$j */
    class C10153j implements TimePicker.C10490g {
        C10153j() {
        }

        /* renamed from: a */
        public void mo32387a(TimePicker timePicker, int i, int i2) {
            String unused = NightTimeSettingActivity.this.f18737o = String.valueOf(i);
            String unused2 = NightTimeSettingActivity.this.f18738p = String.valueOf(i2);
            boolean unused3 = NightTimeSettingActivity.this.f18743u = true;
            NightTimeSettingActivity.this.m24739r0();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.NightTimeSettingActivity$k */
    class C10154k implements TimePicker.C10490g {
        C10154k() {
        }

        /* renamed from: a */
        public void mo32387a(TimePicker timePicker, int i, int i2) {
            String unused = NightTimeSettingActivity.this.f18739q = String.valueOf(i);
            String unused2 = NightTimeSettingActivity.this.f18740r = String.valueOf(i2);
            boolean unused3 = NightTimeSettingActivity.this.f18743u = true;
            NightTimeSettingActivity.this.m24739r0();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.NightTimeSettingActivity$l */
    class C10155l implements TimeMinutePicker.C10482c {
        C10155l() {
        }

        /* renamed from: a */
        public void mo32453a(int i) {
            int unused = NightTimeSettingActivity.this.f18741s = i;
            boolean unused2 = NightTimeSettingActivity.this.f18743u = true;
            NightTimeSettingActivity.this.m24739r0();
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00c6  */
    /* renamed from: n0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m24735n0() {
        /*
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "mStartTimeHour = "
            r0.append(r1)
            java.lang.String r1 = r5.f18737o
            r0.append(r1)
            java.lang.String r1 = " , mStartTimeMinute = "
            r0.append(r1)
            java.lang.String r1 = r5.f18738p
            r0.append(r1)
            r0.toString()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "mEndTimeHour = "
            r0.append(r1)
            java.lang.String r1 = r5.f18739q
            r0.append(r1)
            java.lang.String r1 = " , mEndTimeMinute = "
            r0.append(r1)
            java.lang.String r1 = r5.f18740r
            r0.append(r1)
            r0.toString()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "mDelayOffTime = "
            r0.append(r1)
            int r1 = r5.f18741s
            r0.append(r1)
            r0.toString()
            boolean r0 = r5.f18742t
            if (r0 != 0) goto L_0x0051
            r0 = 0
            r5.f18741s = r0
        L_0x0051:
            java.lang.String r0 = r5.f18737o
            int r0 = r0.length()
            r1 = 1
            java.lang.String r2 = "0"
            java.lang.String r3 = "00"
            if (r0 != r1) goto L_0x0078
            java.lang.String r0 = r5.f18738p
            int r0 = r0.length()
            if (r0 != r1) goto L_0x006f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
            goto L_0x0085
        L_0x006f:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
            goto L_0x0093
        L_0x0078:
            java.lang.String r0 = r5.f18738p
            int r0 = r0.length()
            if (r0 != r1) goto L_0x008e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
        L_0x0085:
            java.lang.String r4 = r5.f18737o
            r0.append(r4)
            r0.append(r2)
            goto L_0x0098
        L_0x008e:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
        L_0x0093:
            java.lang.String r4 = r5.f18737o
            r0.append(r4)
        L_0x0098:
            java.lang.String r4 = r5.f18738p
            r0.append(r4)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            java.lang.String r4 = r5.f18739q
            int r4 = r4.length()
            if (r4 != r1) goto L_0x00c6
            java.lang.String r4 = r5.f18740r
            int r4 = r4.length()
            if (r4 != r1) goto L_0x00bd
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r2)
            goto L_0x00d3
        L_0x00bd:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r2)
            goto L_0x00de
        L_0x00c6:
            java.lang.String r4 = r5.f18740r
            int r4 = r4.length()
            if (r4 != r1) goto L_0x00d9
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
        L_0x00d3:
            java.lang.String r4 = r5.f18739q
            r1.append(r4)
            goto L_0x00e0
        L_0x00d9:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
        L_0x00de:
            java.lang.String r2 = r5.f18739q
        L_0x00e0:
            r1.append(r2)
            java.lang.String r2 = r5.f18740r
            r1.append(r2)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            com.yeelight.yeelib.c.h r2 = r5.f18725c
            int r3 = r5.f18741s
            r2.mo27571Q1(r0, r1, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.p194ui.activity.NightTimeSettingActivity.m24735n0():void");
    }

    /* access modifiers changed from: private */
    /* renamed from: o0 */
    public void m24736o0() {
        this.f18731i.setCurrentMinute(Integer.valueOf(this.f18741s));
        this.f18731i.setOnTimeChangedListener(new C10155l());
    }

    /* access modifiers changed from: private */
    /* renamed from: p0 */
    public void m24737p0() {
        this.f18730h.setCurrentHour(Integer.valueOf(this.f18739q));
        this.f18730h.setCurrentMinute(Integer.valueOf(this.f18740r));
        this.f18730h.setOnTimeChangedListener(new C10154k());
    }

    /* access modifiers changed from: private */
    /* renamed from: q0 */
    public void m24738q0() {
        this.f18730h.setCurrentHour(Integer.valueOf(this.f18737o));
        this.f18730h.setCurrentMinute(Integer.valueOf(this.f18738p));
        this.f18730h.setOnTimeChangedListener(new C10153j());
    }

    /* access modifiers changed from: private */
    /* renamed from: r0 */
    public void m24739r0() {
        runOnUiThread(new C10144a());
    }

    public void onBackPressed() {
        if (this.f18743u) {
            C9897c.m24274p(this, getString(R$string.common_text_discard), getString(R$string.common_text_save), getString(R$string.common_text_cancel), new C10145b(), new C10146c());
            return;
        }
        finish();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo32193P();
        boolean z = true;
        C10547m.m25758h(true, this);
        setContentView(R$layout.activity_night_time_settings);
        this.f18726d = (LinearLayout) findViewById(R$id.layout_action_open);
        this.f18727e = (LinearLayout) findViewById(R$id.layout_action_close);
        this.f18728f = (LinearLayout) findViewById(R$id.layout_action_delay_off);
        this.f18729g = (C10518c) findViewById(R$id.switch_btn_auto_delay);
        this.f18730h = (TimePicker) findViewById(R$id.timerPicker);
        this.f18731i = (TimeMinutePicker) findViewById(R$id.delay_num_picker);
        this.f18732j = (TextView) findViewById(R$id.open_time_text);
        this.f18733k = (TextView) findViewById(R$id.close_time_text);
        this.f18734l = (TextView) findViewById(R$id.delay_off_time_text);
        this.f18735m = (TextView) findViewById(R$id.bottom_line);
        this.f18736n = (CommonTitleBar) findViewById(R$id.title_bar);
        Intent intent = getIntent();
        if (!intent.hasExtra("com.yeelight.cherry.device_id")) {
            C4308b.m12141t(this.f18724b, "Activity has not device id", false);
            finish();
            return;
        }
        C6006h hVar = (C6006h) C4257w.m11945h0(intent.getStringExtra("com.yeelight.cherry.device_id"));
        this.f18725c = hVar;
        if (hVar == null) {
            BaseActivity.m24384U(this);
            finish();
            return;
        }
        this.f18736n.mo32825a(getString(R$string.feature_night_light), new C10147d(), new C10148e());
        this.f18736n.setTitleTextSize(16);
        this.f18730h.setVisibility(4);
        this.f18730h.setIs24HourView(Boolean.TRUE);
        String D = this.f18725c.mo23408d0().mo27633D();
        String C = this.f18725c.mo23408d0().mo27631C();
        "start : " + D + " , end : " + C;
        if (D != null) {
            this.f18737o = D.substring(0, 2);
            this.f18738p = D.substring(2, 4);
            "start : " + this.f18737o + " , end : " + this.f18738p;
        } else {
            this.f18737o = "23";
            this.f18738p = "00";
        }
        if (C != null) {
            this.f18739q = C.substring(0, 2);
            this.f18740r = C.substring(2, 4);
        } else {
            this.f18739q = "06";
            this.f18740r = "00";
        }
        int B = this.f18725c.mo23408d0().mo27629B();
        this.f18741s = B;
        if (B == 0) {
            z = false;
        }
        this.f18742t = z;
        this.f18726d.setOnClickListener(new C10149f());
        this.f18727e.setOnClickListener(new C10150g());
        this.f18728f.setOnClickListener(new C10151h());
        this.f18729g.setOnPerformCheckedChangeListener(new C10152i());
        m24739r0();
    }
}
