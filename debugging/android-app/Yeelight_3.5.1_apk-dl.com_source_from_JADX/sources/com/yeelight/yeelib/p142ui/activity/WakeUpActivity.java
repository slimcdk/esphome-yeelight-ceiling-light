package com.yeelight.yeelib.p142ui.activity;

import android.animation.ObjectAnimator;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.core.content.ContextCompat;
import com.miot.service.manager.timer.TimerCodec;
import com.xiaomi.mipush.sdk.Constants;
import com.yeelight.yeelib.R$color;
import com.yeelight.yeelib.R$drawable;
import com.yeelight.yeelib.R$id;
import com.yeelight.yeelib.R$layout;
import com.yeelight.yeelib.R$string;
import com.yeelight.yeelib.device.base.C3012e;
import com.yeelight.yeelib.device.status.TimerModel;
import com.yeelight.yeelib.managers.YeelightDeviceManager;
import com.yeelight.yeelib.p142ui.view.CommonTitleBar;
import com.yeelight.yeelib.p142ui.view.TimePicker;
import com.yeelight.yeelib.utils.AppUtils;
import java.util.Arrays;
import java.util.Calendar;
import p051j4.C9189e;
import p051j4.C9190h;
import p051j4.C9193k;
import p160g4.C9052a;
import p160g4.C9071c;
import p237z3.C12143c;

/* renamed from: com.yeelight.yeelib.ui.activity.WakeUpActivity */
public class WakeUpActivity extends BaseActivity implements C12143c {
    /* access modifiers changed from: private */

    /* renamed from: u */
    public static final String f15270u = "WakeUpActivity";

    /* renamed from: a */
    CommonTitleBar f15271a;

    /* renamed from: b */
    TextView f15272b;

    /* renamed from: c */
    ImageView f15273c;

    /* renamed from: d */
    TimePicker f15274d;

    /* renamed from: e */
    TextView f15275e;

    /* renamed from: f */
    LinearLayout f15276f;

    /* renamed from: g */
    LinearLayout f15277g;

    /* renamed from: h */
    LinearLayout f15278h;

    /* renamed from: i */
    private C3012e f15279i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public boolean f15280j = false;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public int f15281k = -1;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public int f15282l = -1;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public int f15283m = -1;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public String f15284n = "";
    /* access modifiers changed from: private */

    /* renamed from: o */
    public boolean[] f15285o = new boolean[7];
    /* access modifiers changed from: private */

    /* renamed from: p */
    public int f15286p = -1;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public int f15287q = -1;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public int f15288r = -1;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public String f15289s = "";

    /* renamed from: t */
    private TimerModel f15290t;

    /* renamed from: com.yeelight.yeelib.ui.activity.WakeUpActivity$a */
    class C8658a implements View.OnClickListener {
        C8658a() {
        }

        public void onClick(View view) {
            WakeUpActivity.this.onBackPressed();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.WakeUpActivity$b */
    class C8659b implements TimePicker.C8867g {
        C8659b() {
        }

        /* renamed from: a */
        public void mo35818a(TimePicker timePicker, int i, int i2) {
            int unused = WakeUpActivity.this.f15282l = i;
            int unused2 = WakeUpActivity.this.f15283m = i2;
            WakeUpActivity wakeUpActivity = WakeUpActivity.this;
            wakeUpActivity.f15275e.setText(wakeUpActivity.m20469u0(wakeUpActivity.f15282l, WakeUpActivity.this.f15283m));
            WakeUpActivity.this.m20443A0();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.WakeUpActivity$c */
    class C8660c implements View.OnClickListener {
        C8660c() {
        }

        public void onClick(View view) {
            ImageView imageView;
            int i;
            if (WakeUpActivity.this.f15280j) {
                WakeUpActivity.this.m20470v0();
                imageView = WakeUpActivity.this.f15273c;
                i = R$drawable.setting_switch_off;
            } else {
                WakeUpActivity.this.m20474z0();
                imageView = WakeUpActivity.this.f15273c;
                i = R$drawable.setting_switch_on;
            }
            imageView.setImageResource(i);
            WakeUpActivity wakeUpActivity = WakeUpActivity.this;
            boolean unused = wakeUpActivity.f15280j = !wakeUpActivity.f15280j;
            WakeUpActivity.this.m20472x0();
            WakeUpActivity.this.m20443A0();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.WakeUpActivity$d */
    class C8661d implements C9052a.C9063k {

        /* renamed from: a */
        final /* synthetic */ C9052a f15294a;

        /* renamed from: com.yeelight.yeelib.ui.activity.WakeUpActivity$d$a */
        class C8662a implements C9052a.C9062j {
            C8662a() {
            }

            /* renamed from: a */
            public void mo35821a(boolean[] zArr) {
                TextView textView;
                String alarmRepeatDays;
                Resources resources;
                int i;
                boolean[] unused = WakeUpActivity.this.f15285o = zArr;
                int length = zArr.length;
                String str = "";
                for (int i2 = 0; i2 < length; i2++) {
                    boolean z = zArr[i2];
                    StringBuilder sb = new StringBuilder();
                    sb.append(str);
                    sb.append(z ? TimerCodec.ENABLE : TimerCodec.DISENABLE);
                    str = sb.toString();
                }
                String unused2 = WakeUpActivity.this.f15284n = str;
                int Y = WakeUpActivity.this.m20468t0(zArr);
                if (Y == 1) {
                    WakeUpActivity wakeUpActivity = WakeUpActivity.this;
                    textView = wakeUpActivity.f15272b;
                    resources = wakeUpActivity.getResources();
                    i = R$string.common_text_repeat_once;
                } else if (Y == 2) {
                    WakeUpActivity wakeUpActivity2 = WakeUpActivity.this;
                    textView = wakeUpActivity2.f15272b;
                    resources = wakeUpActivity2.getResources();
                    i = R$string.common_text_repeat_everyday;
                } else {
                    WakeUpActivity wakeUpActivity3 = WakeUpActivity.this;
                    textView = wakeUpActivity3.f15272b;
                    alarmRepeatDays = TimerModel.getAlarmRepeatDays(wakeUpActivity3, str);
                    textView.setText(alarmRepeatDays);
                    WakeUpActivity.this.m20443A0();
                }
                alarmRepeatDays = resources.getString(i);
                textView.setText(alarmRepeatDays);
                WakeUpActivity.this.m20443A0();
            }
        }

        /* renamed from: com.yeelight.yeelib.ui.activity.WakeUpActivity$d$b */
        class C8663b implements DialogInterface.OnDismissListener {

            /* renamed from: a */
            final /* synthetic */ C9052a f15297a;

            C8663b(C8661d dVar, C9052a aVar) {
                this.f15297a = aVar;
            }

            public void onDismiss(DialogInterface dialogInterface) {
                this.f15297a.show();
            }
        }

        C8661d(C9052a aVar) {
            this.f15294a = aVar;
        }

        /* renamed from: a */
        public void mo35820a(int i) {
            TextView textView;
            String alarmRepeatDays;
            Resources resources;
            int i2;
            if (i == 0) {
                Arrays.fill(WakeUpActivity.this.f15285o, false);
            } else if (i == 1) {
                Arrays.fill(WakeUpActivity.this.f15285o, true);
            } else if (i == 2) {
                WakeUpActivity.this.f15285o[0] = false;
                WakeUpActivity.this.f15285o[1] = true;
                WakeUpActivity.this.f15285o[2] = true;
                WakeUpActivity.this.f15285o[3] = true;
                WakeUpActivity.this.f15285o[4] = true;
                WakeUpActivity.this.f15285o[5] = true;
                WakeUpActivity.this.f15285o[6] = false;
            } else if (i == 3) {
                C9052a m = C9052a.m21694m(WakeUpActivity.this, 2);
                m.mo36988p(WakeUpActivity.this.f15285o);
                m.mo36990r(new C8662a());
                this.f15294a.setOnDismissListener(new C8663b(this, m));
            }
            WakeUpActivity wakeUpActivity = WakeUpActivity.this;
            int unused = wakeUpActivity.f15281k = wakeUpActivity.m20468t0(wakeUpActivity.f15285o);
            boolean[] o0 = WakeUpActivity.this.f15285o;
            int length = o0.length;
            String str = "";
            for (int i3 = 0; i3 < length; i3++) {
                boolean z = o0[i3];
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(z ? TimerCodec.ENABLE : TimerCodec.DISENABLE);
                str = sb.toString();
            }
            String unused2 = WakeUpActivity.this.f15284n = str;
            if (WakeUpActivity.this.f15281k == 1) {
                WakeUpActivity wakeUpActivity2 = WakeUpActivity.this;
                textView = wakeUpActivity2.f15272b;
                resources = wakeUpActivity2.getResources();
                i2 = R$string.common_text_repeat_once;
            } else if (WakeUpActivity.this.f15281k == 2) {
                WakeUpActivity wakeUpActivity3 = WakeUpActivity.this;
                textView = wakeUpActivity3.f15272b;
                resources = wakeUpActivity3.getResources();
                i2 = R$string.common_text_repeat_everyday;
            } else {
                WakeUpActivity wakeUpActivity4 = WakeUpActivity.this;
                textView = wakeUpActivity4.f15272b;
                alarmRepeatDays = TimerModel.getAlarmRepeatDays(wakeUpActivity4, str);
                textView.setText(alarmRepeatDays);
                this.f15294a.dismiss();
                WakeUpActivity.this.m20443A0();
            }
            alarmRepeatDays = resources.getString(i2);
            textView.setText(alarmRepeatDays);
            this.f15294a.dismiss();
            WakeUpActivity.this.m20443A0();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.WakeUpActivity$e */
    class C8664e implements C9071c.C9075d {
        C8664e() {
        }

        /* renamed from: a */
        public void mo31271a(String str, C9071c cVar) {
            WakeUpActivity.this.m20472x0();
            WakeUpActivity.this.finish();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.WakeUpActivity$f */
    class C8665f implements C9071c.C9075d {
        C8665f() {
        }

        /* renamed from: a */
        public void mo31271a(String str, C9071c cVar) {
            WakeUpActivity.this.finish();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.WakeUpActivity$g */
    class C8666g implements Runnable {

        /* renamed from: com.yeelight.yeelib.ui.activity.WakeUpActivity$g$a */
        class C8667a implements View.OnClickListener {
            C8667a() {
            }

            public void onClick(View view) {
                WakeUpActivity.this.m20472x0();
                WakeUpActivity.this.finish();
            }
        }

        C8666g() {
        }

        public void run() {
            int i;
            CommonTitleBar commonTitleBar;
            Resources resources;
            boolean z = WakeUpActivity.this.f15282l == WakeUpActivity.this.f15287q && WakeUpActivity.this.f15283m == WakeUpActivity.this.f15288r && WakeUpActivity.this.f15281k == WakeUpActivity.this.f15286p && WakeUpActivity.this.f15284n.equals(WakeUpActivity.this.f15289s);
            if (AppUtils.f4977a) {
                String unused = WakeUpActivity.f15270u;
                StringBuilder sb = new StringBuilder();
                sb.append("hour = ");
                sb.append(WakeUpActivity.this.f15282l);
                sb.append(", defHour = ");
                sb.append(WakeUpActivity.this.f15287q);
                String unused2 = WakeUpActivity.f15270u;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("mMinute = ");
                sb2.append(WakeUpActivity.this.f15283m);
                sb2.append(", mDefMinute = ");
                sb2.append(WakeUpActivity.this.f15288r);
                String unused3 = WakeUpActivity.f15270u;
                StringBuilder sb3 = new StringBuilder();
                sb3.append("mType = ");
                sb3.append(WakeUpActivity.this.f15281k);
                sb3.append(", mDefType = ");
                sb3.append(WakeUpActivity.this.f15286p);
                String unused4 = WakeUpActivity.f15270u;
                StringBuilder sb4 = new StringBuilder();
                sb4.append("mRepeat = ");
                sb4.append(WakeUpActivity.this.f15284n);
                sb4.append(", mDefRepeat = ");
                sb4.append(WakeUpActivity.this.f15289s);
            }
            if (z) {
                WakeUpActivity.this.f15271a.setRightButtonClickListener((View.OnClickListener) null);
                WakeUpActivity wakeUpActivity = WakeUpActivity.this;
                commonTitleBar = wakeUpActivity.f15271a;
                resources = wakeUpActivity.getResources();
                i = R$color.common_text_color_not_clickable_cc;
            } else {
                WakeUpActivity.this.f15271a.setRightButtonClickListener(new C8667a());
                WakeUpActivity wakeUpActivity2 = WakeUpActivity.this;
                commonTitleBar = wakeUpActivity2.f15271a;
                resources = wakeUpActivity2.getResources();
                i = R$color.common_text_color_tips;
            }
            commonTitleBar.setRightTextColor(resources.getColor(i));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: A0 */
    public void m20443A0() {
        this.f15271a.post(new C8666g());
    }

    /* renamed from: s0 */
    private void m20467s0() {
        String[] strArr;
        this.f15285o = C9190h.m22145e(this.f15285o, this.f15282l == 0 && this.f15283m < 30);
        int[] d = C9190h.m22144d(this.f15282l, this.f15283m);
        this.f15282l = d[0];
        this.f15283m = d[1];
        int t0 = m20468t0(this.f15285o);
        if (t0 == 1) {
            Calendar instance = Calendar.getInstance();
            if (this.f15282l < instance.get(11) || (this.f15282l == instance.get(11) && instance.get(12) >= this.f15283m)) {
                instance.add(5, 1);
            }
            int i = instance.get(5);
            strArr = new String[]{String.format("%02d", new Object[]{Integer.valueOf(i)})};
            StringBuilder sb = new StringBuilder();
            sb.append("repeat:");
            sb.append(String.format("%02d", new Object[]{Integer.valueOf(i)}));
        } else if (t0 == 2) {
            strArr = new String[]{String.format("%02d", new Object[]{0})};
        } else {
            int length = this.f15285o.length;
            strArr = new String[length];
            int i2 = 0;
            while (true) {
                boolean[] zArr = this.f15285o;
                if (i2 >= zArr.length) {
                    break;
                }
                strArr[i2] = zArr[i2] ? TimerCodec.ENABLE : TimerCodec.DISENABLE;
                i2++;
            }
            String str = "";
            for (int i3 = length - 1; i3 >= 0; i3--) {
                str = str + strArr[i3];
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("repeat :");
            sb2.append(str);
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append("time: ");
        sb3.append(this.f15282l);
        sb3.append(Constants.COLON_SEPARATOR);
        sb3.append(this.f15283m);
        StringBuilder sb4 = new StringBuilder();
        sb4.append("operation :");
        sb4.append(this.f15280j ? "on" : "off");
        StringBuilder sb5 = new StringBuilder();
        sb5.append("mode :");
        sb5.append(String.valueOf(t0));
        C9189e.m22138a("timer", "add repeat = " + Arrays.toString(strArr));
        TimerModel timerModel = new TimerModel();
        timerModel.setHour(this.f15282l);
        timerModel.setMinute(this.f15283m);
        timerModel.setSecond(0);
        timerModel.setMode(t0);
        timerModel.setRepeatArray(strArr);
        timerModel.setEnable(this.f15280j);
        this.f15279i.mo23166x(13, timerModel);
    }

    /* access modifiers changed from: private */
    /* renamed from: t0 */
    public int m20468t0(boolean[] zArr) {
        int i;
        int length = zArr.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                i = 1;
                break;
            } else if (zArr[i2]) {
                i = 2;
                break;
            } else {
                i2++;
            }
        }
        if (i == 2) {
            for (boolean z : zArr) {
                if (!z) {
                    return 3;
                }
            }
        }
        return i;
    }

    /* access modifiers changed from: private */
    /* renamed from: u0 */
    public SpannableString m20469u0(int i, int i2) {
        String format = String.format(getResources().getString(R$string.wake_up_time), new Object[]{String.format("%02d", new Object[]{Integer.valueOf(i)}), String.format("%02d", new Object[]{Integer.valueOf(i2)})});
        int lastIndexOf = format.lastIndexOf(" ");
        SpannableString spannableString = new SpannableString(format);
        spannableString.setSpan(new ForegroundColorSpan(ContextCompat.getColor(this, R$color.alarm_text_red)), lastIndexOf, format.length(), 33);
        return spannableString;
    }

    /* access modifiers changed from: private */
    /* renamed from: v0 */
    public void m20470v0() {
        if (this.f15277g.getAlpha() != 0.0f) {
            ObjectAnimator.ofFloat(this.f15277g, "alpha", new float[]{1.0f, 0.0f}).start();
            LinearLayout linearLayout = this.f15278h;
            ObjectAnimator.ofFloat(linearLayout, "translationY", new float[]{0.0f, (float) linearLayout.getHeight()}).start();
            ObjectAnimator.ofFloat(findViewById(R$id.wake_up_line), "alpha", new float[]{1.0f, 0.0f}).start();
        }
    }

    /* renamed from: w0 */
    private void m20471w0() {
        this.f15271a.mo36195a(getString(R$string.common_text_awake), new C8658a(), (View.OnClickListener) null);
        this.f15271a.setTitleTextSize(16);
        this.f15274d.setIs24HourView(Boolean.TRUE);
        this.f15274d.setOnTimeChangedListener(new C8659b());
        this.f15276f.setOnClickListener(new C8660c());
        TimerModel timerModel = (TimerModel) this.f15279i.mo23221d0().mo31611r(4);
        this.f15290t = timerModel;
        if (timerModel != null) {
            if (timerModel.isEnable()) {
                this.f15280j = true;
                this.f15273c.setImageResource(R$drawable.setting_switch_on);
            } else {
                this.f15280j = false;
                this.f15278h.setVisibility(8);
                this.f15277g.setVisibility(8);
                this.f15273c.setImageResource(R$drawable.setting_switch_off);
                findViewById(R$id.wake_up_line).setVisibility(8);
            }
            int[] b = C9190h.m22142b(this.f15290t.getHour(), this.f15290t.getMinute());
            int i = b[0];
            this.f15282l = i;
            int i2 = b[1];
            this.f15283m = i2;
            String str = "";
            boolean z = i == 0 && i2 < 30;
            this.f15275e.setText(m20469u0(i, i2));
            this.f15274d.setCurrentHour(Integer.valueOf(this.f15282l));
            this.f15274d.setCurrentMinute(Integer.valueOf(this.f15283m));
            int mode = this.f15290t.getMode();
            this.f15281k = mode;
            if (mode == 1) {
                this.f15272b.setText(R$string.common_text_repeat_once);
            } else if (mode == 2) {
                this.f15272b.setText(R$string.common_text_repeat_everyday);
                Arrays.fill(this.f15285o, true);
            } else if (mode == 3) {
                boolean[] f = C9190h.m22146f(this.f15290t.getRepeat());
                this.f15285o = f;
                boolean[] c = C9190h.m22143c(f, z);
                this.f15285o = c;
                int length = c.length;
                for (int i3 = 0; i3 < length; i3++) {
                    boolean z2 = c[i3];
                    StringBuilder sb = new StringBuilder();
                    sb.append(str);
                    sb.append(z2 ? TimerCodec.ENABLE : TimerCodec.DISENABLE);
                    str = sb.toString();
                }
                this.f15272b.setText(TimerModel.getAlarmRepeatDays(this, str));
            }
            this.f15287q = this.f15282l;
            this.f15288r = this.f15283m;
            this.f15286p = this.f15281k;
            this.f15289s = str;
            this.f15284n = str;
        } else {
            this.f15280j = false;
            this.f15278h.setVisibility(8);
            this.f15277g.setVisibility(8);
            this.f15273c.setImageResource(R$drawable.setting_switch_off);
        }
        this.f15271a.setRightTextColor(getResources().getColor(R$color.common_text_color_not_clickable_cc));
    }

    /* access modifiers changed from: private */
    /* renamed from: x0 */
    public void m20472x0() {
        m20467s0();
        this.f15279i.mo23166x(4, (Object) null);
        Toast.makeText(this, getString(R$string.common_text_set_complete), 0).show();
        this.f15287q = this.f15282l;
        this.f15288r = this.f15283m;
        this.f15286p = this.f15281k;
        this.f15289s = this.f15284n;
    }

    /* renamed from: y0 */
    private void m20473y0() {
        C9071c.m21727p(this, getString(R$string.common_text_discard), getString(R$string.common_text_save), getString(R$string.common_text_cancel), new C8664e(), new C8665f());
    }

    /* access modifiers changed from: private */
    /* renamed from: z0 */
    public void m20474z0() {
        this.f15275e.setText(m20469u0(this.f15274d.getCurrentHour().intValue(), this.f15274d.getCurrentMinute().intValue()));
        this.f15277g.setVisibility(0);
        this.f15278h.setVisibility(0);
        int i = R$id.wake_up_line;
        findViewById(i).setVisibility(0);
        ObjectAnimator.ofFloat(this.f15277g, "alpha", new float[]{0.0f, 1.0f}).start();
        LinearLayout linearLayout = this.f15278h;
        ObjectAnimator.ofFloat(linearLayout, "translationY", new float[]{(float) linearLayout.getHeight(), 0.0f}).start();
        ObjectAnimator.ofFloat(findViewById(i), "alpha", new float[]{0.0f, 1.0f}).start();
    }

    public void onBackPressed() {
        if (AppUtils.f4977a) {
            StringBuilder sb = new StringBuilder();
            sb.append("hour = ");
            sb.append(this.f15282l);
            sb.append(", defHour = ");
            sb.append(this.f15287q);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("mMinute = ");
            sb2.append(this.f15283m);
            sb2.append(", mDefMinute = ");
            sb2.append(this.f15288r);
            StringBuilder sb3 = new StringBuilder();
            sb3.append("mType = ");
            sb3.append(this.f15281k);
            sb3.append(", mDefType = ");
            sb3.append(this.f15286p);
            StringBuilder sb4 = new StringBuilder();
            sb4.append("mRepeat = ");
            sb4.append(this.f15284n);
            sb4.append(", mDefRepeat = ");
            sb4.append(this.f15289s);
        }
        if (this.f15282l == this.f15287q && this.f15283m == this.f15288r && this.f15281k == this.f15286p && this.f15284n.equals(this.f15289s)) {
            finish();
        } else {
            m20473y0();
        }
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
        setContentView(R$layout.activity_wake_up);
        this.f15271a = (CommonTitleBar) findViewById(R$id.title_bar);
        this.f15272b = (TextView) findViewById(R$id.repeat_text);
        this.f15273c = (ImageView) findViewById(R$id.wake_up_switch);
        this.f15274d = (TimePicker) findViewById(R$id.timerPicker);
        this.f15275e = (TextView) findViewById(R$id.wake_up_detail);
        this.f15276f = (LinearLayout) findViewById(R$id.wake_up_layout);
        this.f15277g = (LinearLayout) findViewById(R$id.repeat_area);
        this.f15278h = (LinearLayout) findViewById(R$id.wake_up_time_area);
        Intent intent = getIntent();
        if (!intent.hasExtra("com.yeelight.cherry.device_id")) {
            AppUtils.m8302w(f15270u, "Activity has not device id", false);
        } else {
            C3012e r0 = YeelightDeviceManager.m7804r0(intent.getStringExtra("com.yeelight.cherry.device_id"));
            this.f15279i = r0;
            if (r0 == null) {
                BaseActivity.m19947U(this);
            } else {
                m20471w0();
                return;
            }
        }
        finish();
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
        this.f15279i.mo23133V0(this);
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        this.f15279i.mo23171z0(this);
    }

    public void repeatSelect(View view) {
        C9052a m = C9052a.m21694m(this, 1);
        m.mo36991s(new C8661d(m));
        int t0 = m20468t0(this.f15285o);
        if (t0 == 1) {
            m.mo36993u(0);
        } else if (t0 == 2) {
            m.mo36993u(1);
        } else {
            boolean[] zArr = this.f15285o;
            if (zArr[0] || !zArr[1] || !zArr[2] || !zArr[3] || !zArr[4] || !zArr[5] || zArr[6]) {
                m.mo36993u(3);
            } else {
                m.mo36993u(2);
            }
        }
        m.show();
    }
}
