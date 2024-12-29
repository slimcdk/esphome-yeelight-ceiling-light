package com.yeelight.yeelib.p194ui.activity;

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
import com.yeelight.yeelib.p150c.p151i.C4200i;
import com.yeelight.yeelib.p150c.p184n.C7561k;
import com.yeelight.yeelib.p152f.C4257w;
import com.yeelight.yeelib.p186e.C9768c;
import com.yeelight.yeelib.p191j.p192a.C9878a;
import com.yeelight.yeelib.p191j.p192a.C9897c;
import com.yeelight.yeelib.p194ui.view.CommonTitleBar;
import com.yeelight.yeelib.p194ui.view.TimePicker;
import com.yeelight.yeelib.utils.C10543g;
import com.yeelight.yeelib.utils.C10544j;
import com.yeelight.yeelib.utils.C10547m;
import com.yeelight.yeelib.utils.C4308b;
import java.util.Arrays;
import java.util.Calendar;

/* renamed from: com.yeelight.yeelib.ui.activity.WakeUpActivity */
public class WakeUpActivity extends BaseActivity implements C9768c {
    /* access modifiers changed from: private */

    /* renamed from: v */
    public static final String f18962v = WakeUpActivity.class.getSimpleName();

    /* renamed from: b */
    CommonTitleBar f18963b;

    /* renamed from: c */
    TextView f18964c;

    /* renamed from: d */
    ImageView f18965d;

    /* renamed from: e */
    TimePicker f18966e;

    /* renamed from: f */
    TextView f18967f;

    /* renamed from: g */
    LinearLayout f18968g;

    /* renamed from: h */
    LinearLayout f18969h;

    /* renamed from: i */
    LinearLayout f18970i;

    /* renamed from: j */
    private C4200i f18971j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public boolean f18972k = false;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public int f18973l = -1;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public int f18974m = -1;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public int f18975n = -1;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public String f18976o = "";
    /* access modifiers changed from: private */

    /* renamed from: p */
    public boolean[] f18977p = new boolean[7];
    /* access modifiers changed from: private */

    /* renamed from: q */
    public int f18978q = -1;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public int f18979r = -1;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public int f18980s = -1;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public String f18981t = "";

    /* renamed from: u */
    private C7561k f18982u;

    /* renamed from: com.yeelight.yeelib.ui.activity.WakeUpActivity$a */
    class C10240a implements View.OnClickListener {
        C10240a() {
        }

        public void onClick(View view) {
            WakeUpActivity.this.onBackPressed();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.WakeUpActivity$b */
    class C10241b implements TimePicker.C10490g {
        C10241b() {
        }

        /* renamed from: a */
        public void mo32387a(TimePicker timePicker, int i, int i2) {
            int unused = WakeUpActivity.this.f18974m = i;
            int unused2 = WakeUpActivity.this.f18975n = i2;
            WakeUpActivity wakeUpActivity = WakeUpActivity.this;
            wakeUpActivity.f18967f.setText(wakeUpActivity.m24852u0(wakeUpActivity.f18974m, WakeUpActivity.this.f18975n));
            WakeUpActivity.this.m24826A0();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.WakeUpActivity$c */
    class C10242c implements View.OnClickListener {
        C10242c() {
        }

        public void onClick(View view) {
            ImageView imageView;
            int i;
            if (WakeUpActivity.this.f18972k) {
                WakeUpActivity.this.m24853v0();
                imageView = WakeUpActivity.this.f18965d;
                i = R$drawable.setting_switch_off;
            } else {
                WakeUpActivity.this.m24857z0();
                imageView = WakeUpActivity.this.f18965d;
                i = R$drawable.setting_switch_on;
            }
            imageView.setImageResource(i);
            WakeUpActivity wakeUpActivity = WakeUpActivity.this;
            boolean unused = wakeUpActivity.f18972k = !wakeUpActivity.f18972k;
            WakeUpActivity.this.m24855x0();
            WakeUpActivity.this.m24826A0();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.WakeUpActivity$d */
    class C10243d implements C9878a.C9889k {

        /* renamed from: a */
        final /* synthetic */ C9878a f18986a;

        /* renamed from: com.yeelight.yeelib.ui.activity.WakeUpActivity$d$a */
        class C10244a implements C9878a.C9888j {
            C10244a() {
            }

            /* renamed from: a */
            public void mo31988a(boolean[] zArr) {
                TextView textView;
                String b;
                Resources resources;
                int i;
                boolean[] unused = WakeUpActivity.this.f18977p = zArr;
                int length = zArr.length;
                String str = "";
                for (int i2 = 0; i2 < length; i2++) {
                    boolean z = zArr[i2];
                    StringBuilder sb = new StringBuilder();
                    sb.append(str);
                    sb.append(z ? TimerCodec.ENABLE : TimerCodec.DISENABLE);
                    str = sb.toString();
                }
                String unused2 = WakeUpActivity.this.f18976o = str;
                int Y = WakeUpActivity.this.m24851t0(zArr);
                if (Y == 1) {
                    WakeUpActivity wakeUpActivity = WakeUpActivity.this;
                    textView = wakeUpActivity.f18964c;
                    resources = wakeUpActivity.getResources();
                    i = R$string.common_text_repeat_once;
                } else if (Y == 2) {
                    WakeUpActivity wakeUpActivity2 = WakeUpActivity.this;
                    textView = wakeUpActivity2.f18964c;
                    resources = wakeUpActivity2.getResources();
                    i = R$string.common_text_repeat_everyday;
                } else {
                    WakeUpActivity wakeUpActivity3 = WakeUpActivity.this;
                    textView = wakeUpActivity3.f18964c;
                    b = C7561k.m22309b(wakeUpActivity3, str);
                    textView.setText(b);
                    WakeUpActivity.this.m24826A0();
                }
                b = resources.getString(i);
                textView.setText(b);
                WakeUpActivity.this.m24826A0();
            }
        }

        /* renamed from: com.yeelight.yeelib.ui.activity.WakeUpActivity$d$b */
        class C10245b implements DialogInterface.OnDismissListener {

            /* renamed from: a */
            final /* synthetic */ C9878a f18989a;

            C10245b(C10243d dVar, C9878a aVar) {
                this.f18989a = aVar;
            }

            public void onDismiss(DialogInterface dialogInterface) {
                this.f18989a.show();
            }
        }

        C10243d(C9878a aVar) {
            this.f18986a = aVar;
        }

        /* renamed from: a */
        public void mo31989a(int i) {
            TextView textView;
            String b;
            Resources resources;
            int i2;
            if (i == 0) {
                Arrays.fill(WakeUpActivity.this.f18977p, false);
            } else if (i == 1) {
                Arrays.fill(WakeUpActivity.this.f18977p, true);
            } else if (i == 2) {
                WakeUpActivity.this.f18977p[0] = false;
                WakeUpActivity.this.f18977p[1] = true;
                WakeUpActivity.this.f18977p[2] = true;
                WakeUpActivity.this.f18977p[3] = true;
                WakeUpActivity.this.f18977p[4] = true;
                WakeUpActivity.this.f18977p[5] = true;
                WakeUpActivity.this.f18977p[6] = false;
            } else if (i == 3) {
                C9878a m = C9878a.m24241m(WakeUpActivity.this, 2);
                m.mo31973p(WakeUpActivity.this.f18977p);
                m.mo31975r(new C10244a());
                this.f18986a.setOnDismissListener(new C10245b(this, m));
            }
            WakeUpActivity wakeUpActivity = WakeUpActivity.this;
            int unused = wakeUpActivity.f18973l = wakeUpActivity.m24851t0(wakeUpActivity.f18977p);
            boolean[] o0 = WakeUpActivity.this.f18977p;
            int length = o0.length;
            String str = "";
            for (int i3 = 0; i3 < length; i3++) {
                boolean z = o0[i3];
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(z ? TimerCodec.ENABLE : TimerCodec.DISENABLE);
                str = sb.toString();
            }
            String unused2 = WakeUpActivity.this.f18976o = str;
            if (WakeUpActivity.this.f18973l == 1) {
                WakeUpActivity wakeUpActivity2 = WakeUpActivity.this;
                textView = wakeUpActivity2.f18964c;
                resources = wakeUpActivity2.getResources();
                i2 = R$string.common_text_repeat_once;
            } else if (WakeUpActivity.this.f18973l == 2) {
                WakeUpActivity wakeUpActivity3 = WakeUpActivity.this;
                textView = wakeUpActivity3.f18964c;
                resources = wakeUpActivity3.getResources();
                i2 = R$string.common_text_repeat_everyday;
            } else {
                WakeUpActivity wakeUpActivity4 = WakeUpActivity.this;
                textView = wakeUpActivity4.f18964c;
                b = C7561k.m22309b(wakeUpActivity4, str);
                textView.setText(b);
                this.f18986a.dismiss();
                WakeUpActivity.this.m24826A0();
            }
            b = resources.getString(i2);
            textView.setText(b);
            this.f18986a.dismiss();
            WakeUpActivity.this.m24826A0();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.WakeUpActivity$e */
    class C10246e implements C9897c.C9901d {
        C10246e() {
        }

        /* renamed from: a */
        public void mo27312a(String str, C9897c cVar) {
            WakeUpActivity.this.m24855x0();
            WakeUpActivity.this.finish();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.WakeUpActivity$f */
    class C10247f implements C9897c.C9901d {
        C10247f() {
        }

        /* renamed from: a */
        public void mo27312a(String str, C9897c cVar) {
            WakeUpActivity.this.finish();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.WakeUpActivity$g */
    class C10248g implements Runnable {

        /* renamed from: com.yeelight.yeelib.ui.activity.WakeUpActivity$g$a */
        class C10249a implements View.OnClickListener {
            C10249a() {
            }

            public void onClick(View view) {
                WakeUpActivity.this.m24855x0();
                WakeUpActivity.this.finish();
            }
        }

        C10248g() {
        }

        public void run() {
            int i;
            CommonTitleBar commonTitleBar;
            Resources resources;
            boolean z = WakeUpActivity.this.f18974m == WakeUpActivity.this.f18979r && WakeUpActivity.this.f18975n == WakeUpActivity.this.f18980s && WakeUpActivity.this.f18973l == WakeUpActivity.this.f18978q && WakeUpActivity.this.f18976o.equals(WakeUpActivity.this.f18981t);
            if (C4308b.f7482a) {
                String unused = WakeUpActivity.f18962v;
                "hour = " + WakeUpActivity.this.f18974m + ", defHour = " + WakeUpActivity.this.f18979r;
                String unused2 = WakeUpActivity.f18962v;
                "mMinute = " + WakeUpActivity.this.f18975n + ", mDefMinute = " + WakeUpActivity.this.f18980s;
                String unused3 = WakeUpActivity.f18962v;
                "mType = " + WakeUpActivity.this.f18973l + ", mDefType = " + WakeUpActivity.this.f18978q;
                String unused4 = WakeUpActivity.f18962v;
                "mRepeat = " + WakeUpActivity.this.f18976o + ", mDefRepeat = " + WakeUpActivity.this.f18981t;
            }
            if (z) {
                WakeUpActivity.this.f18963b.setRightButtonClickListener((View.OnClickListener) null);
                WakeUpActivity wakeUpActivity = WakeUpActivity.this;
                commonTitleBar = wakeUpActivity.f18963b;
                resources = wakeUpActivity.getResources();
                i = R$color.common_text_color_not_clickable_cc;
            } else {
                WakeUpActivity.this.f18963b.setRightButtonClickListener(new C10249a());
                WakeUpActivity wakeUpActivity2 = WakeUpActivity.this;
                commonTitleBar = wakeUpActivity2.f18963b;
                resources = wakeUpActivity2.getResources();
                i = R$color.common_text_color_tips;
            }
            commonTitleBar.setRightTextColor(resources.getColor(i));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: A0 */
    public void m24826A0() {
        this.f18963b.post(new C10248g());
    }

    /* renamed from: s0 */
    private void m24850s0() {
        String[] strArr;
        this.f18977p = C10544j.m25746d(this.f18977p, this.f18974m == 0 && this.f18975n < 30);
        int[] c = C10544j.m25745c(this.f18974m, this.f18975n);
        this.f18974m = c[0];
        this.f18975n = c[1];
        int t0 = m24851t0(this.f18977p);
        if (t0 == 1) {
            Calendar instance = Calendar.getInstance();
            if (this.f18974m < instance.get(11) || (this.f18974m == instance.get(11) && instance.get(12) >= this.f18975n)) {
                instance.add(5, 1);
            }
            int i = instance.get(5);
            strArr = new String[]{String.format("%02d", new Object[]{Integer.valueOf(i)})};
            "repeat:" + String.format("%02d", new Object[]{Integer.valueOf(i)});
        } else if (t0 == 2) {
            strArr = new String[]{String.format("%02d", new Object[]{0})};
        } else {
            int length = this.f18977p.length;
            strArr = new String[length];
            int i2 = 0;
            while (true) {
                boolean[] zArr = this.f18977p;
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
            "repeat :" + str;
        }
        "time: " + this.f18974m + Constants.COLON_SEPARATOR + this.f18975n;
        StringBuilder sb = new StringBuilder();
        sb.append("operation :");
        sb.append(this.f18972k ? "on" : "off");
        sb.toString();
        "mode :" + String.valueOf(t0);
        C10543g.m25740a("timer", "add repeat = " + Arrays.toString(strArr));
        C7561k kVar = new C7561k();
        kVar.mo28959u(this.f18974m);
        kVar.mo28960v(this.f18975n);
        kVar.mo28936B(0);
        kVar.mo28961w(t0);
        kVar.mo28935A(strArr);
        kVar.mo28957s(this.f18972k);
        this.f18971j.mo23353x(13, kVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: t0 */
    public int m24851t0(boolean[] zArr) {
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
    public SpannableString m24852u0(int i, int i2) {
        String format = String.format(getResources().getString(R$string.wake_up_time), new Object[]{String.format("%02d", new Object[]{Integer.valueOf(i)}), String.format("%02d", new Object[]{Integer.valueOf(i2)})});
        int lastIndexOf = format.lastIndexOf(" ");
        SpannableString spannableString = new SpannableString(format);
        spannableString.setSpan(new ForegroundColorSpan(ContextCompat.getColor(this, R$color.alarm_text_red)), lastIndexOf, format.length(), 33);
        return spannableString;
    }

    /* access modifiers changed from: private */
    /* renamed from: v0 */
    public void m24853v0() {
        if (this.f18969h.getAlpha() != 0.0f) {
            ObjectAnimator.ofFloat(this.f18969h, "alpha", new float[]{1.0f, 0.0f}).start();
            LinearLayout linearLayout = this.f18970i;
            ObjectAnimator.ofFloat(linearLayout, "translationY", new float[]{0.0f, (float) linearLayout.getHeight()}).start();
            ObjectAnimator.ofFloat(findViewById(R$id.wake_up_line), "alpha", new float[]{1.0f, 0.0f}).start();
        }
    }

    /* renamed from: w0 */
    private void m24854w0() {
        this.f18963b.mo32825a(getString(R$string.common_text_awake), new C10240a(), (View.OnClickListener) null);
        this.f18963b.setTitleTextSize(16);
        this.f18966e.setIs24HourView(Boolean.TRUE);
        this.f18966e.setOnTimeChangedListener(new C10241b());
        this.f18968g.setOnClickListener(new C10242c());
        C7561k kVar = (C7561k) this.f18971j.mo23408d0().mo27710r(4);
        this.f18982u = kVar;
        if (kVar != null) {
            if (kVar.mo28955p()) {
                this.f18972k = true;
                this.f18965d.setImageResource(R$drawable.setting_switch_on);
            } else {
                this.f18972k = false;
                this.f18970i.setVisibility(8);
                this.f18969h.setVisibility(8);
                this.f18965d.setImageResource(R$drawable.setting_switch_off);
                findViewById(R$id.wake_up_line).setVisibility(8);
            }
            int[] a = C10544j.m25743a(this.f18982u.mo28942d(), this.f18982u.mo28943e());
            int i = a[0];
            this.f18974m = i;
            int i2 = a[1];
            this.f18975n = i2;
            String str = "";
            boolean z = i == 0 && i2 < 30;
            this.f18967f.setText(m24852u0(this.f18974m, this.f18975n));
            this.f18966e.setCurrentHour(Integer.valueOf(this.f18974m));
            this.f18966e.setCurrentMinute(Integer.valueOf(this.f18975n));
            int f = this.f18982u.mo28945f();
            this.f18973l = f;
            if (f == 1) {
                this.f18964c.setText(R$string.common_text_repeat_once);
            } else if (f == 2) {
                this.f18964c.setText(R$string.common_text_repeat_everyday);
                Arrays.fill(this.f18977p, true);
            } else if (f == 3) {
                boolean[] e = C10544j.m25747e(this.f18982u.mo28950k());
                this.f18977p = e;
                boolean[] b = C10544j.m25744b(e, z);
                this.f18977p = b;
                int length = b.length;
                for (int i3 = 0; i3 < length; i3++) {
                    boolean z2 = b[i3];
                    StringBuilder sb = new StringBuilder();
                    sb.append(str);
                    sb.append(z2 ? TimerCodec.ENABLE : TimerCodec.DISENABLE);
                    str = sb.toString();
                }
                this.f18964c.setText(C7561k.m22309b(this, str));
            }
            this.f18979r = this.f18974m;
            this.f18980s = this.f18975n;
            this.f18978q = this.f18973l;
            this.f18981t = str;
            this.f18976o = str;
        } else {
            this.f18972k = false;
            this.f18970i.setVisibility(8);
            this.f18969h.setVisibility(8);
            this.f18965d.setImageResource(R$drawable.setting_switch_off);
        }
        this.f18963b.setRightTextColor(getResources().getColor(R$color.common_text_color_not_clickable_cc));
    }

    /* access modifiers changed from: private */
    /* renamed from: x0 */
    public void m24855x0() {
        m24850s0();
        this.f18971j.mo23353x(4, (Object) null);
        Toast.makeText(this, getString(R$string.common_text_set_complete), 0).show();
        this.f18979r = this.f18974m;
        this.f18980s = this.f18975n;
        this.f18978q = this.f18973l;
        this.f18981t = this.f18976o;
    }

    /* renamed from: y0 */
    private void m24856y0() {
        C9897c.m24274p(this, getString(R$string.common_text_discard), getString(R$string.common_text_save), getString(R$string.common_text_cancel), new C10246e(), new C10247f());
    }

    /* access modifiers changed from: private */
    /* renamed from: z0 */
    public void m24857z0() {
        this.f18967f.setText(m24852u0(this.f18966e.getCurrentHour().intValue(), this.f18966e.getCurrentMinute().intValue()));
        this.f18969h.setVisibility(0);
        this.f18970i.setVisibility(0);
        findViewById(R$id.wake_up_line).setVisibility(0);
        ObjectAnimator.ofFloat(this.f18969h, "alpha", new float[]{0.0f, 1.0f}).start();
        LinearLayout linearLayout = this.f18970i;
        ObjectAnimator.ofFloat(linearLayout, "translationY", new float[]{(float) linearLayout.getHeight(), 0.0f}).start();
        ObjectAnimator.ofFloat(findViewById(R$id.wake_up_line), "alpha", new float[]{0.0f, 1.0f}).start();
    }

    public void onBackPressed() {
        if (C4308b.f7482a) {
            "hour = " + this.f18974m + ", defHour = " + this.f18979r;
            "mMinute = " + this.f18975n + ", mDefMinute = " + this.f18980s;
            "mType = " + this.f18973l + ", mDefType = " + this.f18978q;
            "mRepeat = " + this.f18976o + ", mDefRepeat = " + this.f18981t;
        }
        if (this.f18974m == this.f18979r && this.f18975n == this.f18980s && this.f18973l == this.f18978q && this.f18976o.equals(this.f18981t)) {
            finish();
        } else {
            m24856y0();
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
        mo32193P();
        C10547m.m25758h(true, this);
        setContentView(R$layout.activity_wake_up);
        this.f18963b = (CommonTitleBar) findViewById(R$id.title_bar);
        this.f18964c = (TextView) findViewById(R$id.repeat_text);
        this.f18965d = (ImageView) findViewById(R$id.wake_up_switch);
        this.f18966e = (TimePicker) findViewById(R$id.timerPicker);
        this.f18967f = (TextView) findViewById(R$id.wake_up_detail);
        this.f18968g = (LinearLayout) findViewById(R$id.wake_up_layout);
        this.f18969h = (LinearLayout) findViewById(R$id.repeat_area);
        this.f18970i = (LinearLayout) findViewById(R$id.wake_up_time_area);
        Intent intent = getIntent();
        if (!intent.hasExtra("com.yeelight.cherry.device_id")) {
            C4308b.m12141t(f18962v, "Activity has not device id", false);
        } else {
            C4200i o0 = C4257w.m11953o0(intent.getStringExtra("com.yeelight.cherry.device_id"));
            this.f18971j = o0;
            if (o0 == null) {
                BaseActivity.m24384U(this);
            } else {
                m24854w0();
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
        this.f18971j.mo23319V0(this);
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        this.f18971j.mo23358z0(this);
    }

    public void repeatSelect(View view) {
        C9878a m = C9878a.m24241m(this, 1);
        m.mo31976s(new C10243d(m));
        int t0 = m24851t0(this.f18977p);
        if (t0 == 1) {
            m.mo31978u(0);
        } else if (t0 == 2) {
            m.mo31978u(1);
        } else {
            boolean[] zArr = this.f18977p;
            if (zArr[0] || !zArr[1] || !zArr[2] || !zArr[3] || !zArr[4] || !zArr[5] || zArr[6]) {
                m.mo31978u(3);
            } else {
                m.mo31978u(2);
            }
        }
        m.show();
    }
}
