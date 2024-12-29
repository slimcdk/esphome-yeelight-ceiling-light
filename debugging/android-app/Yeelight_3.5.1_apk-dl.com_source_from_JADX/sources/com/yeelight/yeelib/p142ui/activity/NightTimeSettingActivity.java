package com.yeelight.yeelib.p142ui.activity;

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
import com.yeelight.yeelib.device.WifiDeviceBase;
import com.yeelight.yeelib.managers.YeelightDeviceManager;
import com.yeelight.yeelib.p142ui.view.CommonTitleBar;
import com.yeelight.yeelib.p142ui.view.TimeMinutePicker;
import com.yeelight.yeelib.p142ui.view.TimePicker;
import com.yeelight.yeelib.utils.AppUtils;
import p051j4.C9193k;
import p160g4.C9071c;
import p170i4.C9110c;

/* renamed from: com.yeelight.yeelib.ui.activity.NightTimeSettingActivity */
public class NightTimeSettingActivity extends BaseActivity {

    /* renamed from: a */
    private final String f15032a = NightTimeSettingActivity.class.getSimpleName();

    /* renamed from: b */
    WifiDeviceBase f15033b;

    /* renamed from: c */
    LinearLayout f15034c;

    /* renamed from: d */
    LinearLayout f15035d;

    /* renamed from: e */
    LinearLayout f15036e;

    /* renamed from: f */
    C9110c f15037f;

    /* renamed from: g */
    TimePicker f15038g;

    /* renamed from: h */
    TimeMinutePicker f15039h;

    /* renamed from: i */
    TextView f15040i;

    /* renamed from: j */
    TextView f15041j;

    /* renamed from: k */
    TextView f15042k;

    /* renamed from: l */
    TextView f15043l;

    /* renamed from: m */
    CommonTitleBar f15044m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public String f15045n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public String f15046o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public String f15047p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public String f15048q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public int f15049r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public boolean f15050s;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public boolean f15051t;

    /* renamed from: com.yeelight.yeelib.ui.activity.NightTimeSettingActivity$a */
    class C8562a implements Runnable {
        C8562a() {
        }

        public void run() {
            StringBuilder sb;
            StringBuilder sb2;
            if (NightTimeSettingActivity.this.f15050s) {
                NightTimeSettingActivity.this.f15037f.setChecked(true);
                NightTimeSettingActivity.this.f15036e.setVisibility(0);
                NightTimeSettingActivity.this.f15043l.setVisibility(0);
                if (NightTimeSettingActivity.this.f15049r == 0) {
                    int unused = NightTimeSettingActivity.this.f15049r = 15;
                }
                NightTimeSettingActivity.this.f15042k.setText(NightTimeSettingActivity.this.f15049r + NightTimeSettingActivity.this.getString(R$string.night_light_delay_off_unit));
            } else {
                NightTimeSettingActivity.this.f15037f.setChecked(false);
                NightTimeSettingActivity.this.f15043l.setVisibility(4);
                NightTimeSettingActivity.this.f15036e.setVisibility(4);
                NightTimeSettingActivity.this.f15039h.setVisibility(8);
            }
            if (NightTimeSettingActivity.this.f15046o.length() == 1) {
                sb = new StringBuilder();
                sb.append(NightTimeSettingActivity.this.f15045n);
                sb.append(":0");
            } else {
                sb = new StringBuilder();
                sb.append(NightTimeSettingActivity.this.f15045n);
                sb.append(Constants.COLON_SEPARATOR);
            }
            sb.append(NightTimeSettingActivity.this.f15046o);
            String sb3 = sb.toString();
            if (NightTimeSettingActivity.this.f15048q.length() == 1) {
                sb2 = new StringBuilder();
                sb2.append(NightTimeSettingActivity.this.f15047p);
                sb2.append(":0");
            } else {
                sb2 = new StringBuilder();
                sb2.append(NightTimeSettingActivity.this.f15047p);
                sb2.append(Constants.COLON_SEPARATOR);
            }
            sb2.append(NightTimeSettingActivity.this.f15048q);
            String sb4 = sb2.toString();
            NightTimeSettingActivity.this.f15040i.setText(sb3);
            NightTimeSettingActivity.this.f15041j.setText(sb4);
            NightTimeSettingActivity.this.f15042k.setText(NightTimeSettingActivity.this.f15049r + NightTimeSettingActivity.this.getString(R$string.night_light_delay_off_unit));
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.NightTimeSettingActivity$b */
    class C8563b implements C9071c.C9075d {
        C8563b() {
        }

        /* renamed from: a */
        public void mo31271a(String str, C9071c cVar) {
            NightTimeSettingActivity.this.m20342n0();
            NightTimeSettingActivity.this.finish();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.NightTimeSettingActivity$c */
    class C8564c implements C9071c.C9075d {
        C8564c() {
        }

        /* renamed from: a */
        public void mo31271a(String str, C9071c cVar) {
            NightTimeSettingActivity.this.finish();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.NightTimeSettingActivity$d */
    class C8565d implements View.OnClickListener {
        C8565d() {
        }

        public void onClick(View view) {
            NightTimeSettingActivity.this.onBackPressed();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.NightTimeSettingActivity$e */
    class C8566e implements View.OnClickListener {
        C8566e() {
        }

        public void onClick(View view) {
            NightTimeSettingActivity.this.m20342n0();
            NightTimeSettingActivity.this.finish();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.NightTimeSettingActivity$f */
    class C8567f implements View.OnClickListener {
        C8567f() {
        }

        public void onClick(View view) {
            NightTimeSettingActivity.this.f15039h.setVisibility(4);
            NightTimeSettingActivity.this.f15038g.setVisibility(0);
            NightTimeSettingActivity.this.f15038g.setOnTimeChangedListener((TimePicker.C8867g) null);
            NightTimeSettingActivity.this.m20345q0();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.NightTimeSettingActivity$g */
    class C8568g implements View.OnClickListener {
        C8568g() {
        }

        public void onClick(View view) {
            NightTimeSettingActivity.this.f15039h.setVisibility(4);
            NightTimeSettingActivity.this.f15038g.setVisibility(0);
            NightTimeSettingActivity.this.f15038g.setOnTimeChangedListener((TimePicker.C8867g) null);
            NightTimeSettingActivity.this.m20344p0();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.NightTimeSettingActivity$h */
    class C8569h implements View.OnClickListener {
        C8569h() {
        }

        public void onClick(View view) {
            NightTimeSettingActivity.this.f15039h.setVisibility(0);
            NightTimeSettingActivity.this.f15038g.setVisibility(4);
            NightTimeSettingActivity.this.m20343o0();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.NightTimeSettingActivity$i */
    class C8570i implements CompoundButton.OnCheckedChangeListener {
        C8570i() {
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            boolean unused = NightTimeSettingActivity.this.f15050s = z;
            boolean unused2 = NightTimeSettingActivity.this.f15051t = true;
            NightTimeSettingActivity.this.m20346r0();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.NightTimeSettingActivity$j */
    class C8571j implements TimePicker.C8867g {
        C8571j() {
        }

        /* renamed from: a */
        public void mo35818a(TimePicker timePicker, int i, int i2) {
            String unused = NightTimeSettingActivity.this.f15045n = String.valueOf(i);
            String unused2 = NightTimeSettingActivity.this.f15046o = String.valueOf(i2);
            boolean unused3 = NightTimeSettingActivity.this.f15051t = true;
            NightTimeSettingActivity.this.m20346r0();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.NightTimeSettingActivity$k */
    class C8572k implements TimePicker.C8867g {
        C8572k() {
        }

        /* renamed from: a */
        public void mo35818a(TimePicker timePicker, int i, int i2) {
            String unused = NightTimeSettingActivity.this.f15047p = String.valueOf(i);
            String unused2 = NightTimeSettingActivity.this.f15048q = String.valueOf(i2);
            boolean unused3 = NightTimeSettingActivity.this.f15051t = true;
            NightTimeSettingActivity.this.m20346r0();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.NightTimeSettingActivity$l */
    class C8573l implements TimeMinutePicker.C8859c {
        C8573l() {
        }

        /* renamed from: a */
        public void mo35880a(int i) {
            int unused = NightTimeSettingActivity.this.f15049r = i;
            boolean unused2 = NightTimeSettingActivity.this.f15051t = true;
            NightTimeSettingActivity.this.m20346r0();
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00bd  */
    /* renamed from: n0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m20342n0() {
        /*
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "mStartTimeHour = "
            r0.append(r1)
            java.lang.String r1 = r5.f15045n
            r0.append(r1)
            java.lang.String r1 = " , mStartTimeMinute = "
            r0.append(r1)
            java.lang.String r1 = r5.f15046o
            r0.append(r1)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "mEndTimeHour = "
            r0.append(r1)
            java.lang.String r1 = r5.f15047p
            r0.append(r1)
            java.lang.String r1 = " , mEndTimeMinute = "
            r0.append(r1)
            java.lang.String r1 = r5.f15048q
            r0.append(r1)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "mDelayOffTime = "
            r0.append(r1)
            int r1 = r5.f15049r
            r0.append(r1)
            boolean r0 = r5.f15050s
            if (r0 != 0) goto L_0x0048
            r0 = 0
            r5.f15049r = r0
        L_0x0048:
            java.lang.String r0 = r5.f15045n
            int r0 = r0.length()
            r1 = 1
            java.lang.String r2 = "0"
            java.lang.String r3 = "00"
            if (r0 != r1) goto L_0x006f
            java.lang.String r0 = r5.f15046o
            int r0 = r0.length()
            if (r0 != r1) goto L_0x0066
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
            goto L_0x007c
        L_0x0066:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
            goto L_0x008a
        L_0x006f:
            java.lang.String r0 = r5.f15046o
            int r0 = r0.length()
            if (r0 != r1) goto L_0x0085
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
        L_0x007c:
            java.lang.String r4 = r5.f15045n
            r0.append(r4)
            r0.append(r2)
            goto L_0x008f
        L_0x0085:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
        L_0x008a:
            java.lang.String r4 = r5.f15045n
            r0.append(r4)
        L_0x008f:
            java.lang.String r4 = r5.f15046o
            r0.append(r4)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            java.lang.String r4 = r5.f15047p
            int r4 = r4.length()
            if (r4 != r1) goto L_0x00bd
            java.lang.String r4 = r5.f15048q
            int r4 = r4.length()
            if (r4 != r1) goto L_0x00b4
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r2)
            goto L_0x00ca
        L_0x00b4:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r2)
            goto L_0x00d5
        L_0x00bd:
            java.lang.String r4 = r5.f15048q
            int r4 = r4.length()
            if (r4 != r1) goto L_0x00d0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
        L_0x00ca:
            java.lang.String r4 = r5.f15047p
            r1.append(r4)
            goto L_0x00d7
        L_0x00d0:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
        L_0x00d5:
            java.lang.String r2 = r5.f15047p
        L_0x00d7:
            r1.append(r2)
            java.lang.String r2 = r5.f15048q
            r1.append(r2)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            com.yeelight.yeelib.device.WifiDeviceBase r2 = r5.f15033b
            int r3 = r5.f15049r
            r2.mo31488Q1(r0, r1, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.p142ui.activity.NightTimeSettingActivity.m20342n0():void");
    }

    /* access modifiers changed from: private */
    /* renamed from: o0 */
    public void m20343o0() {
        this.f15039h.setCurrentMinute(Integer.valueOf(this.f15049r));
        this.f15039h.setOnTimeChangedListener(new C8573l());
    }

    /* access modifiers changed from: private */
    /* renamed from: p0 */
    public void m20344p0() {
        this.f15038g.setCurrentHour(Integer.valueOf(this.f15047p));
        this.f15038g.setCurrentMinute(Integer.valueOf(this.f15048q));
        this.f15038g.setOnTimeChangedListener(new C8572k());
    }

    /* access modifiers changed from: private */
    /* renamed from: q0 */
    public void m20345q0() {
        this.f15038g.setCurrentHour(Integer.valueOf(this.f15045n));
        this.f15038g.setCurrentMinute(Integer.valueOf(this.f15046o));
        this.f15038g.setOnTimeChangedListener(new C8571j());
    }

    /* access modifiers changed from: private */
    /* renamed from: r0 */
    public void m20346r0() {
        runOnUiThread(new C8562a());
    }

    public void onBackPressed() {
        if (this.f15051t) {
            C9071c.m21727p(this, getString(R$string.common_text_discard), getString(R$string.common_text_save), getString(R$string.common_text_cancel), new C8563b(), new C8564c());
            return;
        }
        finish();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo35653P();
        boolean z = true;
        C9193k.m22157h(true, this);
        setContentView(R$layout.activity_night_time_settings);
        this.f15034c = (LinearLayout) findViewById(R$id.layout_action_open);
        this.f15035d = (LinearLayout) findViewById(R$id.layout_action_close);
        this.f15036e = (LinearLayout) findViewById(R$id.layout_action_delay_off);
        this.f15037f = (C9110c) findViewById(R$id.switch_btn_auto_delay);
        this.f15038g = (TimePicker) findViewById(R$id.timerPicker);
        this.f15039h = (TimeMinutePicker) findViewById(R$id.delay_num_picker);
        this.f15040i = (TextView) findViewById(R$id.open_time_text);
        this.f15041j = (TextView) findViewById(R$id.close_time_text);
        this.f15042k = (TextView) findViewById(R$id.delay_off_time_text);
        this.f15043l = (TextView) findViewById(R$id.bottom_line);
        this.f15044m = (CommonTitleBar) findViewById(R$id.title_bar);
        Intent intent = getIntent();
        if (!intent.hasExtra("com.yeelight.cherry.device_id")) {
            AppUtils.m8302w(this.f15032a, "Activity has not device id", false);
            finish();
            return;
        }
        WifiDeviceBase wifiDeviceBase = (WifiDeviceBase) YeelightDeviceManager.m7794j0(intent.getStringExtra("com.yeelight.cherry.device_id"));
        this.f15033b = wifiDeviceBase;
        if (wifiDeviceBase == null) {
            BaseActivity.m19947U(this);
            finish();
            return;
        }
        this.f15044m.mo36195a(getString(R$string.feature_night_light), new C8565d(), new C8566e());
        this.f15044m.setTitleTextSize(16);
        this.f15038g.setVisibility(4);
        this.f15038g.setIs24HourView(Boolean.TRUE);
        String E = this.f15033b.mo23221d0().mo31534E();
        String D = this.f15033b.mo23221d0().mo31532D();
        StringBuilder sb = new StringBuilder();
        sb.append("start : ");
        sb.append(E);
        sb.append(" , end : ");
        sb.append(D);
        if (E != null) {
            this.f15045n = E.substring(0, 2);
            this.f15046o = E.substring(2, 4);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("start : ");
            sb2.append(this.f15045n);
            sb2.append(" , end : ");
            sb2.append(this.f15046o);
        } else {
            this.f15045n = "23";
            this.f15046o = "00";
        }
        if (D != null) {
            this.f15047p = D.substring(0, 2);
            this.f15048q = D.substring(2, 4);
        } else {
            this.f15047p = "06";
            this.f15048q = "00";
        }
        int C = this.f15033b.mo23221d0().mo31530C();
        this.f15049r = C;
        if (C == 0) {
            z = false;
        }
        this.f15050s = z;
        this.f15034c.setOnClickListener(new C8567f());
        this.f15035d.setOnClickListener(new C8568g());
        this.f15036e.setOnClickListener(new C8569h());
        this.f15037f.setOnPerformCheckedChangeListener(new C8570i());
        m20346r0();
    }
}
