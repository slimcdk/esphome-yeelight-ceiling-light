package com.yeelight.yeelib.p191j.p192a;

import android.app.Dialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.miot.common.timer.DayOfWeek;
import com.yeelight.yeelib.R$drawable;
import com.yeelight.yeelib.R$id;
import com.yeelight.yeelib.R$layout;
import com.yeelight.yeelib.R$style;
import com.yeelight.yeelib.device.models.YeelightTimer;
import com.yeelight.yeelib.p194ui.view.AlarmTextView;
import java.util.Arrays;

/* renamed from: com.yeelight.yeelib.j.a.a */
public class C9878a extends Dialog implements View.OnClickListener {

    /* renamed from: a */
    private int f17951a = 0;

    /* renamed from: b */
    private LayoutInflater f17952b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public boolean[] f17953c = new boolean[7];
    /* access modifiers changed from: private */

    /* renamed from: d */
    public boolean[] f17954d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public AlarmTextView f17955e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public AlarmTextView f17956f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public AlarmTextView f17957g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public AlarmTextView f17958h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public AlarmTextView f17959i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public AlarmTextView f17960j;

    /* renamed from: k */
    private ImageView f17961k;

    /* renamed from: l */
    private ImageView f17962l;

    /* renamed from: m */
    private ImageView f17963m;

    /* renamed from: n */
    private ImageView f17964n;

    /* renamed from: o */
    private ImageView f17965o;

    /* renamed from: p */
    private ImageView f17966p;

    /* renamed from: q */
    private ImageView f17967q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public C9890l f17968r = null;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public C9889k f17969s = null;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public C9888j f17970t = null;

    /* renamed from: com.yeelight.yeelib.j.a.a$a */
    class C9879a implements View.OnClickListener {
        C9879a() {
        }

        public void onClick(View view) {
            C9878a.this.f17955e.setSelected(true);
            C9878a.this.f17956f.setSelected(false);
            if (C9878a.this.f17968r != null) {
                C9878a.this.f17968r.mo31990a(true);
            }
        }
    }

    /* renamed from: com.yeelight.yeelib.j.a.a$b */
    class C9880b implements View.OnClickListener {
        C9880b() {
        }

        public void onClick(View view) {
            C9878a.this.f17955e.setSelected(false);
            C9878a.this.f17956f.setSelected(true);
            if (C9878a.this.f17968r != null) {
                C9878a.this.f17968r.mo31990a(false);
            }
        }
    }

    /* renamed from: com.yeelight.yeelib.j.a.a$c */
    class C9881c implements View.OnClickListener {
        C9881c() {
        }

        public void onClick(View view) {
            C9878a.this.f17957g.setSelected(true);
            C9878a.this.f17959i.setSelected(false);
            C9878a.this.f17958h.setSelected(false);
            C9878a.this.f17960j.setSelected(false);
            if (C9878a.this.f17969s != null) {
                C9878a.this.f17969s.mo31989a(0);
            }
        }
    }

    /* renamed from: com.yeelight.yeelib.j.a.a$d */
    class C9882d implements View.OnClickListener {
        C9882d() {
        }

        public void onClick(View view) {
            C9878a.this.f17957g.setSelected(false);
            C9878a.this.f17958h.setSelected(true);
            C9878a.this.f17959i.setSelected(false);
            C9878a.this.f17960j.setSelected(false);
            if (C9878a.this.f17969s != null) {
                C9878a.this.f17969s.mo31989a(1);
            }
        }
    }

    /* renamed from: com.yeelight.yeelib.j.a.a$e */
    class C9883e implements View.OnClickListener {
        C9883e() {
        }

        public void onClick(View view) {
            C9878a.this.f17957g.setSelected(false);
            C9878a.this.f17958h.setSelected(false);
            C9878a.this.f17959i.setSelected(true);
            C9878a.this.f17960j.setSelected(false);
            if (C9878a.this.f17969s != null) {
                C9878a.this.f17969s.mo31989a(2);
            }
        }
    }

    /* renamed from: com.yeelight.yeelib.j.a.a$f */
    class C9884f implements View.OnClickListener {
        C9884f() {
        }

        public void onClick(View view) {
            C9878a.this.f17957g.setSelected(false);
            C9878a.this.f17958h.setSelected(false);
            C9878a.this.f17959i.setSelected(false);
            C9878a.this.f17960j.setSelected(true);
            if (C9878a.this.f17969s != null) {
                C9878a.this.f17969s.mo31989a(3);
            }
        }
    }

    /* renamed from: com.yeelight.yeelib.j.a.a$g */
    class C9885g implements View.OnClickListener {
        C9885g() {
        }

        public void onClick(View view) {
            C9878a.this.dismiss();
        }
    }

    /* renamed from: com.yeelight.yeelib.j.a.a$h */
    class C9886h implements View.OnClickListener {
        C9886h() {
        }

        public void onClick(View view) {
            if (C9878a.this.f17954d != null) {
                C9878a aVar = C9878a.this;
                boolean[] unused = aVar.f17953c = aVar.f17954d;
            }
            if (C9878a.this.f17970t != null) {
                C9878a.this.f17970t.mo31988a(C9878a.this.f17953c);
            }
            C9878a.this.dismiss();
        }
    }

    /* renamed from: com.yeelight.yeelib.j.a.a$i */
    static /* synthetic */ class C9887i {

        /* renamed from: a */
        static final /* synthetic */ int[] f17979a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|(3:13|14|16)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|16) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.miot.common.timer.DayOfWeek[] r0 = com.miot.common.timer.DayOfWeek.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f17979a = r0
                com.miot.common.timer.DayOfWeek r1 = com.miot.common.timer.DayOfWeek.SUNDAY     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f17979a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.miot.common.timer.DayOfWeek r1 = com.miot.common.timer.DayOfWeek.MONDAY     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f17979a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.miot.common.timer.DayOfWeek r1 = com.miot.common.timer.DayOfWeek.TUESDAY     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f17979a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.miot.common.timer.DayOfWeek r1 = com.miot.common.timer.DayOfWeek.WEDNESDAY     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f17979a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.miot.common.timer.DayOfWeek r1 = com.miot.common.timer.DayOfWeek.THURSDAY     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f17979a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.miot.common.timer.DayOfWeek r1 = com.miot.common.timer.DayOfWeek.FRIDAY     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f17979a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.miot.common.timer.DayOfWeek r1 = com.miot.common.timer.DayOfWeek.SATURDAY     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.p191j.p192a.C9878a.C9887i.<clinit>():void");
        }
    }

    /* renamed from: com.yeelight.yeelib.j.a.a$j */
    public interface C9888j {
        /* renamed from: a */
        void mo31988a(boolean[] zArr);
    }

    /* renamed from: com.yeelight.yeelib.j.a.a$k */
    public interface C9889k {
        /* renamed from: a */
        void mo31989a(int i);
    }

    /* renamed from: com.yeelight.yeelib.j.a.a$l */
    public interface C9890l {
        /* renamed from: a */
        void mo31990a(boolean z);
    }

    public C9878a(Context context) {
        super(context, R$style.dialogstyle);
        this.f17952b = (LayoutInflater) context.getSystemService("layout_inflater");
        requestWindowFeature(1);
        m24242n();
    }

    /* renamed from: m */
    public static C9878a m24241m(Context context, int i) {
        C9878a aVar = new C9878a(context);
        aVar.mo31979v(i);
        return aVar;
    }

    /* renamed from: n */
    private void m24242n() {
        int i = this.f17951a;
        View inflate = this.f17952b.inflate(i != 0 ? i != 1 ? i != 2 ? R$layout.common_dialog_message : R$layout.ui_alarm_repeat_custom : R$layout.ui_alarm_repeat_select : R$layout.ui_alarm_switch_select, (ViewGroup) null, false);
        setContentView(inflate);
        getWindow().setLayout(-1, -2);
        getWindow().getDecorView().setPadding(0, 0, 0, 0);
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        attributes.horizontalMargin = 0.0f;
        attributes.verticalMargin = 0.0f;
        attributes.gravity = 80;
        getWindow().setAttributes(attributes);
        getWindow().setWindowAnimations(R$style.alarm_popup_window_animation_style);
        this.f17955e = (AlarmTextView) inflate.findViewById(R$id.alarm_switch_on);
        this.f17956f = (AlarmTextView) inflate.findViewById(R$id.alarm_switch_off);
        this.f17957g = (AlarmTextView) inflate.findViewById(R$id.repeat_once);
        this.f17958h = (AlarmTextView) inflate.findViewById(R$id.repeat_everyday);
        this.f17959i = (AlarmTextView) inflate.findViewById(R$id.repeat_1_5);
        this.f17960j = (AlarmTextView) inflate.findViewById(R$id.repeat_custom);
        LinearLayout linearLayout = (LinearLayout) inflate.findViewById(R$id.alarm_repeat_1);
        LinearLayout linearLayout2 = (LinearLayout) inflate.findViewById(R$id.alarm_repeat_2);
        LinearLayout linearLayout3 = (LinearLayout) inflate.findViewById(R$id.alarm_repeat_3);
        LinearLayout linearLayout4 = (LinearLayout) inflate.findViewById(R$id.alarm_repeat_4);
        LinearLayout linearLayout5 = (LinearLayout) inflate.findViewById(R$id.alarm_repeat_5);
        LinearLayout linearLayout6 = (LinearLayout) inflate.findViewById(R$id.alarm_repeat_6);
        LinearLayout linearLayout7 = (LinearLayout) inflate.findViewById(R$id.alarm_repeat_7);
        this.f17961k = (ImageView) inflate.findViewById(R$id.alarm_repeat_1_img);
        this.f17962l = (ImageView) inflate.findViewById(R$id.alarm_repeat_2_img);
        this.f17963m = (ImageView) inflate.findViewById(R$id.alarm_repeat_3_img);
        this.f17964n = (ImageView) inflate.findViewById(R$id.alarm_repeat_4_img);
        this.f17965o = (ImageView) inflate.findViewById(R$id.alarm_repeat_5_img);
        this.f17966p = (ImageView) inflate.findViewById(R$id.alarm_repeat_6_img);
        this.f17967q = (ImageView) inflate.findViewById(R$id.alarm_repeat_7_img);
        Button button = (Button) inflate.findViewById(R$id.dialog_btn_left);
        Button button2 = (Button) inflate.findViewById(R$id.dialog_btn_right);
        AlarmTextView alarmTextView = this.f17955e;
        if (alarmTextView != null) {
            alarmTextView.setSelected(true);
            this.f17956f.setSelected(false);
            this.f17955e.setOnClickListener(new C9879a());
            this.f17956f.setOnClickListener(new C9880b());
        }
        AlarmTextView alarmTextView2 = this.f17957g;
        if (alarmTextView2 != null) {
            alarmTextView2.setSelected(true);
            this.f17959i.setSelected(false);
            this.f17958h.setSelected(false);
            this.f17960j.setSelected(false);
            this.f17957g.setOnClickListener(new C9881c());
            this.f17958h.setOnClickListener(new C9882d());
            this.f17959i.setOnClickListener(new C9883e());
            this.f17960j.setOnClickListener(new C9884f());
        }
        if (linearLayout != null) {
            this.f17961k.setImageResource(this.f17953c[1] ? R$drawable.alarm_selector_selected : R$drawable.alarm_selector_unselected);
            this.f17962l.setImageResource(this.f17953c[2] ? R$drawable.alarm_selector_selected : R$drawable.alarm_selector_unselected);
            this.f17963m.setImageResource(this.f17953c[3] ? R$drawable.alarm_selector_selected : R$drawable.alarm_selector_unselected);
            this.f17964n.setImageResource(this.f17953c[4] ? R$drawable.alarm_selector_selected : R$drawable.alarm_selector_unselected);
            this.f17965o.setImageResource(this.f17953c[5] ? R$drawable.alarm_selector_selected : R$drawable.alarm_selector_unselected);
            this.f17966p.setImageResource(this.f17953c[6] ? R$drawable.alarm_selector_selected : R$drawable.alarm_selector_unselected);
            this.f17967q.setImageResource(this.f17953c[0] ? R$drawable.alarm_selector_selected : R$drawable.alarm_selector_unselected);
            linearLayout.setOnClickListener(this);
            linearLayout2.setOnClickListener(this);
            linearLayout3.setOnClickListener(this);
            linearLayout4.setOnClickListener(this);
            linearLayout5.setOnClickListener(this);
            linearLayout6.setOnClickListener(this);
            linearLayout7.setOnClickListener(this);
            button.setOnClickListener(new C9885g());
            button2.setOnClickListener(new C9886h());
        }
    }

    /* renamed from: o */
    public void mo31971o(YeelightTimer yeelightTimer) {
        boolean[] zArr = new boolean[7];
        Arrays.fill(zArr, false);
        for (DayOfWeek ordinal : yeelightTimer.mo29031e().getDayOfWeeks()) {
            switch (C9887i.f17979a[ordinal.ordinal()]) {
                case 1:
                    zArr[0] = true;
                    break;
                case 2:
                    zArr[1] = true;
                    break;
                case 3:
                    zArr[2] = true;
                    break;
                case 4:
                    zArr[3] = true;
                    break;
                case 5:
                    zArr[4] = true;
                    break;
                case 6:
                    zArr[5] = true;
                    break;
                case 7:
                    zArr[6] = true;
                    break;
            }
        }
        mo31973p(zArr);
    }

    public void onClick(View view) {
        ImageView imageView;
        int i;
        ImageView imageView2;
        int i2;
        ImageView imageView3;
        int i3;
        ImageView imageView4;
        int i4;
        ImageView imageView5;
        int i5;
        ImageView imageView6;
        int i6;
        ImageView imageView7;
        int i7;
        if (this.f17954d == null) {
            boolean[] zArr = this.f17953c;
            boolean[] zArr2 = new boolean[zArr.length];
            this.f17954d = zArr2;
            System.arraycopy(zArr, 0, zArr2, 0, zArr.length);
        }
        int id = view.getId();
        if (id == R$id.alarm_repeat_1) {
            if (this.f17954d[1]) {
                imageView7 = this.f17961k;
                i7 = R$drawable.alarm_selector_unselected;
            } else {
                imageView7 = this.f17961k;
                i7 = R$drawable.alarm_selector_selected;
            }
            imageView7.setImageResource(i7);
            boolean[] zArr3 = this.f17954d;
            zArr3[1] = !zArr3[1];
        } else if (id == R$id.alarm_repeat_2) {
            if (this.f17954d[2]) {
                imageView6 = this.f17962l;
                i6 = R$drawable.alarm_selector_unselected;
            } else {
                imageView6 = this.f17962l;
                i6 = R$drawable.alarm_selector_selected;
            }
            imageView6.setImageResource(i6);
            boolean[] zArr4 = this.f17954d;
            zArr4[2] = !zArr4[2];
        } else if (id == R$id.alarm_repeat_3) {
            if (this.f17954d[3]) {
                imageView5 = this.f17963m;
                i5 = R$drawable.alarm_selector_unselected;
            } else {
                imageView5 = this.f17963m;
                i5 = R$drawable.alarm_selector_selected;
            }
            imageView5.setImageResource(i5);
            boolean[] zArr5 = this.f17954d;
            zArr5[3] = !zArr5[3];
        } else if (id == R$id.alarm_repeat_4) {
            if (this.f17954d[4]) {
                imageView4 = this.f17964n;
                i4 = R$drawable.alarm_selector_unselected;
            } else {
                imageView4 = this.f17964n;
                i4 = R$drawable.alarm_selector_selected;
            }
            imageView4.setImageResource(i4);
            boolean[] zArr6 = this.f17954d;
            zArr6[4] = !zArr6[4];
        } else if (id == R$id.alarm_repeat_5) {
            if (this.f17954d[5]) {
                imageView3 = this.f17965o;
                i3 = R$drawable.alarm_selector_unselected;
            } else {
                imageView3 = this.f17965o;
                i3 = R$drawable.alarm_selector_selected;
            }
            imageView3.setImageResource(i3);
            boolean[] zArr7 = this.f17954d;
            zArr7[5] = !zArr7[5];
        } else if (id == R$id.alarm_repeat_6) {
            if (this.f17954d[6]) {
                imageView2 = this.f17966p;
                i2 = R$drawable.alarm_selector_unselected;
            } else {
                imageView2 = this.f17966p;
                i2 = R$drawable.alarm_selector_selected;
            }
            imageView2.setImageResource(i2);
            boolean[] zArr8 = this.f17954d;
            zArr8[6] = !zArr8[6];
        } else if (id == R$id.alarm_repeat_7) {
            if (this.f17954d[0]) {
                imageView = this.f17967q;
                i = R$drawable.alarm_selector_unselected;
            } else {
                imageView = this.f17967q;
                i = R$drawable.alarm_selector_selected;
            }
            imageView.setImageResource(i);
            boolean[] zArr9 = this.f17954d;
            zArr9[0] = !zArr9[0];
        }
    }

    /* renamed from: p */
    public void mo31973p(boolean[] zArr) {
        this.f17953c = zArr;
        mo31979v(2);
    }

    /* renamed from: q */
    public void mo31974q(boolean z) {
        AlarmTextView alarmTextView = this.f17955e;
        if (alarmTextView != null) {
            alarmTextView.setSelected(z);
            this.f17956f.setSelected(!z);
        }
    }

    /* renamed from: r */
    public void mo31975r(C9888j jVar) {
        this.f17970t = jVar;
    }

    /* renamed from: s */
    public void mo31976s(C9889k kVar) {
        this.f17969s = kVar;
    }

    /* renamed from: t */
    public void mo31977t(C9890l lVar) {
        this.f17968r = lVar;
    }

    /* renamed from: u */
    public void mo31978u(int i) {
        AlarmTextView alarmTextView;
        if (i == 0) {
            this.f17957g.setSelected(true);
            this.f17959i.setSelected(false);
            alarmTextView = this.f17958h;
        } else if (i == 1) {
            this.f17957g.setSelected(false);
            this.f17958h.setSelected(true);
            alarmTextView = this.f17959i;
        } else if (i == 2) {
            this.f17957g.setSelected(false);
            this.f17958h.setSelected(false);
            this.f17959i.setSelected(true);
            this.f17960j.setSelected(false);
        } else if (i == 3) {
            this.f17957g.setSelected(false);
            this.f17958h.setSelected(false);
            this.f17959i.setSelected(false);
            this.f17960j.setSelected(true);
            return;
        } else {
            return;
        }
        alarmTextView.setSelected(false);
        this.f17960j.setSelected(false);
    }

    /* renamed from: v */
    public void mo31979v(int i) {
        this.f17951a = i;
        m24242n();
    }
}
