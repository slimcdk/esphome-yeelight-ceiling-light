package p160g4;

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
import com.yeelight.yeelib.p142ui.view.AlarmTextView;
import java.util.Arrays;

/* renamed from: g4.a */
public class C9052a extends Dialog implements View.OnClickListener {

    /* renamed from: a */
    private int f16620a = 0;

    /* renamed from: b */
    private LayoutInflater f16621b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public boolean[] f16622c = new boolean[7];
    /* access modifiers changed from: private */

    /* renamed from: d */
    public boolean[] f16623d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public AlarmTextView f16624e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public AlarmTextView f16625f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public AlarmTextView f16626g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public AlarmTextView f16627h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public AlarmTextView f16628i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public AlarmTextView f16629j;

    /* renamed from: k */
    private ImageView f16630k;

    /* renamed from: l */
    private ImageView f16631l;

    /* renamed from: m */
    private ImageView f16632m;

    /* renamed from: n */
    private ImageView f16633n;

    /* renamed from: o */
    private ImageView f16634o;

    /* renamed from: p */
    private ImageView f16635p;

    /* renamed from: q */
    private ImageView f16636q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public C9064l f16637r = null;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public C9063k f16638s = null;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public C9062j f16639t = null;

    /* renamed from: g4.a$a */
    class C9053a implements View.OnClickListener {
        C9053a() {
        }

        public void onClick(View view) {
            C9052a.this.f16624e.setSelected(true);
            C9052a.this.f16625f.setSelected(false);
            if (C9052a.this.f16637r != null) {
                C9052a.this.f16637r.mo35819a(true);
            }
        }
    }

    /* renamed from: g4.a$b */
    class C9054b implements View.OnClickListener {
        C9054b() {
        }

        public void onClick(View view) {
            C9052a.this.f16624e.setSelected(false);
            C9052a.this.f16625f.setSelected(true);
            if (C9052a.this.f16637r != null) {
                C9052a.this.f16637r.mo35819a(false);
            }
        }
    }

    /* renamed from: g4.a$c */
    class C9055c implements View.OnClickListener {
        C9055c() {
        }

        public void onClick(View view) {
            C9052a.this.f16626g.setSelected(true);
            C9052a.this.f16628i.setSelected(false);
            C9052a.this.f16627h.setSelected(false);
            C9052a.this.f16629j.setSelected(false);
            if (C9052a.this.f16638s != null) {
                C9052a.this.f16638s.mo35820a(0);
            }
        }
    }

    /* renamed from: g4.a$d */
    class C9056d implements View.OnClickListener {
        C9056d() {
        }

        public void onClick(View view) {
            C9052a.this.f16626g.setSelected(false);
            C9052a.this.f16627h.setSelected(true);
            C9052a.this.f16628i.setSelected(false);
            C9052a.this.f16629j.setSelected(false);
            if (C9052a.this.f16638s != null) {
                C9052a.this.f16638s.mo35820a(1);
            }
        }
    }

    /* renamed from: g4.a$e */
    class C9057e implements View.OnClickListener {
        C9057e() {
        }

        public void onClick(View view) {
            C9052a.this.f16626g.setSelected(false);
            C9052a.this.f16627h.setSelected(false);
            C9052a.this.f16628i.setSelected(true);
            C9052a.this.f16629j.setSelected(false);
            if (C9052a.this.f16638s != null) {
                C9052a.this.f16638s.mo35820a(2);
            }
        }
    }

    /* renamed from: g4.a$f */
    class C9058f implements View.OnClickListener {
        C9058f() {
        }

        public void onClick(View view) {
            C9052a.this.f16626g.setSelected(false);
            C9052a.this.f16627h.setSelected(false);
            C9052a.this.f16628i.setSelected(false);
            C9052a.this.f16629j.setSelected(true);
            if (C9052a.this.f16638s != null) {
                C9052a.this.f16638s.mo35820a(3);
            }
        }
    }

    /* renamed from: g4.a$g */
    class C9059g implements View.OnClickListener {
        C9059g() {
        }

        public void onClick(View view) {
            C9052a.this.dismiss();
        }
    }

    /* renamed from: g4.a$h */
    class C9060h implements View.OnClickListener {
        C9060h() {
        }

        public void onClick(View view) {
            if (C9052a.this.f16623d != null) {
                C9052a aVar = C9052a.this;
                boolean[] unused = aVar.f16622c = aVar.f16623d;
            }
            if (C9052a.this.f16639t != null) {
                C9052a.this.f16639t.mo35821a(C9052a.this.f16622c);
            }
            C9052a.this.dismiss();
        }
    }

    /* renamed from: g4.a$i */
    static /* synthetic */ class C9061i {

        /* renamed from: a */
        static final /* synthetic */ int[] f16648a;

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
                f16648a = r0
                com.miot.common.timer.DayOfWeek r1 = com.miot.common.timer.DayOfWeek.SUNDAY     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f16648a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.miot.common.timer.DayOfWeek r1 = com.miot.common.timer.DayOfWeek.MONDAY     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f16648a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.miot.common.timer.DayOfWeek r1 = com.miot.common.timer.DayOfWeek.TUESDAY     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f16648a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.miot.common.timer.DayOfWeek r1 = com.miot.common.timer.DayOfWeek.WEDNESDAY     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f16648a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.miot.common.timer.DayOfWeek r1 = com.miot.common.timer.DayOfWeek.THURSDAY     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f16648a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.miot.common.timer.DayOfWeek r1 = com.miot.common.timer.DayOfWeek.FRIDAY     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f16648a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.miot.common.timer.DayOfWeek r1 = com.miot.common.timer.DayOfWeek.SATURDAY     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p160g4.C9052a.C9061i.<clinit>():void");
        }
    }

    /* renamed from: g4.a$j */
    public interface C9062j {
        /* renamed from: a */
        void mo35821a(boolean[] zArr);
    }

    /* renamed from: g4.a$k */
    public interface C9063k {
        /* renamed from: a */
        void mo35820a(int i);
    }

    /* renamed from: g4.a$l */
    public interface C9064l {
        /* renamed from: a */
        void mo35819a(boolean z);
    }

    public C9052a(Context context) {
        super(context, R$style.dialogstyle);
        this.f16621b = (LayoutInflater) context.getSystemService("layout_inflater");
        requestWindowFeature(1);
        m21695n();
    }

    /* renamed from: m */
    public static C9052a m21694m(Context context, int i) {
        C9052a aVar = new C9052a(context);
        aVar.mo36994v(i);
        return aVar;
    }

    /* renamed from: n */
    private void m21695n() {
        int i = this.f16620a;
        View inflate = this.f16621b.inflate(i != 0 ? i != 1 ? i != 2 ? R$layout.common_dialog_message : R$layout.ui_alarm_repeat_custom : R$layout.ui_alarm_repeat_select : R$layout.ui_alarm_switch_select, (ViewGroup) null, false);
        setContentView(inflate);
        getWindow().setLayout(-1, -2);
        getWindow().getDecorView().setPadding(0, 0, 0, 0);
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        attributes.horizontalMargin = 0.0f;
        attributes.verticalMargin = 0.0f;
        attributes.gravity = 80;
        getWindow().setAttributes(attributes);
        getWindow().setWindowAnimations(R$style.alarm_popup_window_animation_style);
        this.f16624e = (AlarmTextView) inflate.findViewById(R$id.alarm_switch_on);
        this.f16625f = (AlarmTextView) inflate.findViewById(R$id.alarm_switch_off);
        this.f16626g = (AlarmTextView) inflate.findViewById(R$id.repeat_once);
        this.f16627h = (AlarmTextView) inflate.findViewById(R$id.repeat_everyday);
        this.f16628i = (AlarmTextView) inflate.findViewById(R$id.repeat_1_5);
        this.f16629j = (AlarmTextView) inflate.findViewById(R$id.repeat_custom);
        LinearLayout linearLayout = (LinearLayout) inflate.findViewById(R$id.alarm_repeat_1);
        LinearLayout linearLayout2 = (LinearLayout) inflate.findViewById(R$id.alarm_repeat_2);
        LinearLayout linearLayout3 = (LinearLayout) inflate.findViewById(R$id.alarm_repeat_3);
        LinearLayout linearLayout4 = (LinearLayout) inflate.findViewById(R$id.alarm_repeat_4);
        LinearLayout linearLayout5 = (LinearLayout) inflate.findViewById(R$id.alarm_repeat_5);
        LinearLayout linearLayout6 = (LinearLayout) inflate.findViewById(R$id.alarm_repeat_6);
        LinearLayout linearLayout7 = (LinearLayout) inflate.findViewById(R$id.alarm_repeat_7);
        this.f16630k = (ImageView) inflate.findViewById(R$id.alarm_repeat_1_img);
        this.f16631l = (ImageView) inflate.findViewById(R$id.alarm_repeat_2_img);
        this.f16632m = (ImageView) inflate.findViewById(R$id.alarm_repeat_3_img);
        this.f16633n = (ImageView) inflate.findViewById(R$id.alarm_repeat_4_img);
        this.f16634o = (ImageView) inflate.findViewById(R$id.alarm_repeat_5_img);
        this.f16635p = (ImageView) inflate.findViewById(R$id.alarm_repeat_6_img);
        this.f16636q = (ImageView) inflate.findViewById(R$id.alarm_repeat_7_img);
        Button button = (Button) inflate.findViewById(R$id.dialog_btn_left);
        Button button2 = (Button) inflate.findViewById(R$id.dialog_btn_right);
        AlarmTextView alarmTextView = this.f16624e;
        if (alarmTextView != null) {
            alarmTextView.setSelected(true);
            this.f16625f.setSelected(false);
            this.f16624e.setOnClickListener(new C9053a());
            this.f16625f.setOnClickListener(new C9054b());
        }
        AlarmTextView alarmTextView2 = this.f16626g;
        if (alarmTextView2 != null) {
            alarmTextView2.setSelected(true);
            this.f16628i.setSelected(false);
            this.f16627h.setSelected(false);
            this.f16629j.setSelected(false);
            this.f16626g.setOnClickListener(new C9055c());
            this.f16627h.setOnClickListener(new C9056d());
            this.f16628i.setOnClickListener(new C9057e());
            this.f16629j.setOnClickListener(new C9058f());
        }
        if (linearLayout != null) {
            this.f16630k.setImageResource(this.f16622c[1] ? R$drawable.alarm_selector_selected : R$drawable.alarm_selector_unselected);
            this.f16631l.setImageResource(this.f16622c[2] ? R$drawable.alarm_selector_selected : R$drawable.alarm_selector_unselected);
            this.f16632m.setImageResource(this.f16622c[3] ? R$drawable.alarm_selector_selected : R$drawable.alarm_selector_unselected);
            this.f16633n.setImageResource(this.f16622c[4] ? R$drawable.alarm_selector_selected : R$drawable.alarm_selector_unselected);
            this.f16634o.setImageResource(this.f16622c[5] ? R$drawable.alarm_selector_selected : R$drawable.alarm_selector_unselected);
            this.f16635p.setImageResource(this.f16622c[6] ? R$drawable.alarm_selector_selected : R$drawable.alarm_selector_unselected);
            this.f16636q.setImageResource(this.f16622c[0] ? R$drawable.alarm_selector_selected : R$drawable.alarm_selector_unselected);
            linearLayout.setOnClickListener(this);
            linearLayout2.setOnClickListener(this);
            linearLayout3.setOnClickListener(this);
            linearLayout4.setOnClickListener(this);
            linearLayout5.setOnClickListener(this);
            linearLayout6.setOnClickListener(this);
            linearLayout7.setOnClickListener(this);
            button.setOnClickListener(new C9059g());
            button2.setOnClickListener(new C9060h());
        }
    }

    /* renamed from: o */
    public void mo36986o(YeelightTimer yeelightTimer) {
        boolean[] zArr = new boolean[7];
        Arrays.fill(zArr, false);
        for (DayOfWeek ordinal : yeelightTimer.mo31886e().getDayOfWeeks()) {
            switch (C9061i.f16648a[ordinal.ordinal()]) {
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
        mo36988p(zArr);
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
        if (this.f16623d == null) {
            boolean[] zArr = this.f16622c;
            boolean[] zArr2 = new boolean[zArr.length];
            this.f16623d = zArr2;
            System.arraycopy(zArr, 0, zArr2, 0, zArr.length);
        }
        int id = view.getId();
        if (id == R$id.alarm_repeat_1) {
            if (this.f16623d[1]) {
                imageView7 = this.f16630k;
                i7 = R$drawable.alarm_selector_unselected;
            } else {
                imageView7 = this.f16630k;
                i7 = R$drawable.alarm_selector_selected;
            }
            imageView7.setImageResource(i7);
            boolean[] zArr3 = this.f16623d;
            zArr3[1] = !zArr3[1];
        } else if (id == R$id.alarm_repeat_2) {
            if (this.f16623d[2]) {
                imageView6 = this.f16631l;
                i6 = R$drawable.alarm_selector_unselected;
            } else {
                imageView6 = this.f16631l;
                i6 = R$drawable.alarm_selector_selected;
            }
            imageView6.setImageResource(i6);
            boolean[] zArr4 = this.f16623d;
            zArr4[2] = !zArr4[2];
        } else if (id == R$id.alarm_repeat_3) {
            if (this.f16623d[3]) {
                imageView5 = this.f16632m;
                i5 = R$drawable.alarm_selector_unselected;
            } else {
                imageView5 = this.f16632m;
                i5 = R$drawable.alarm_selector_selected;
            }
            imageView5.setImageResource(i5);
            boolean[] zArr5 = this.f16623d;
            zArr5[3] = !zArr5[3];
        } else if (id == R$id.alarm_repeat_4) {
            if (this.f16623d[4]) {
                imageView4 = this.f16633n;
                i4 = R$drawable.alarm_selector_unselected;
            } else {
                imageView4 = this.f16633n;
                i4 = R$drawable.alarm_selector_selected;
            }
            imageView4.setImageResource(i4);
            boolean[] zArr6 = this.f16623d;
            zArr6[4] = !zArr6[4];
        } else if (id == R$id.alarm_repeat_5) {
            if (this.f16623d[5]) {
                imageView3 = this.f16634o;
                i3 = R$drawable.alarm_selector_unselected;
            } else {
                imageView3 = this.f16634o;
                i3 = R$drawable.alarm_selector_selected;
            }
            imageView3.setImageResource(i3);
            boolean[] zArr7 = this.f16623d;
            zArr7[5] = !zArr7[5];
        } else if (id == R$id.alarm_repeat_6) {
            if (this.f16623d[6]) {
                imageView2 = this.f16635p;
                i2 = R$drawable.alarm_selector_unselected;
            } else {
                imageView2 = this.f16635p;
                i2 = R$drawable.alarm_selector_selected;
            }
            imageView2.setImageResource(i2);
            boolean[] zArr8 = this.f16623d;
            zArr8[6] = !zArr8[6];
        } else if (id == R$id.alarm_repeat_7) {
            if (this.f16623d[0]) {
                imageView = this.f16636q;
                i = R$drawable.alarm_selector_unselected;
            } else {
                imageView = this.f16636q;
                i = R$drawable.alarm_selector_selected;
            }
            imageView.setImageResource(i);
            boolean[] zArr9 = this.f16623d;
            zArr9[0] = !zArr9[0];
        }
    }

    /* renamed from: p */
    public void mo36988p(boolean[] zArr) {
        this.f16622c = zArr;
        mo36994v(2);
    }

    /* renamed from: q */
    public void mo36989q(boolean z) {
        AlarmTextView alarmTextView = this.f16624e;
        if (alarmTextView != null) {
            alarmTextView.setSelected(z);
            this.f16625f.setSelected(!z);
        }
    }

    /* renamed from: r */
    public void mo36990r(C9062j jVar) {
        this.f16639t = jVar;
    }

    /* renamed from: s */
    public void mo36991s(C9063k kVar) {
        this.f16638s = kVar;
    }

    /* renamed from: t */
    public void mo36992t(C9064l lVar) {
        this.f16637r = lVar;
    }

    /* renamed from: u */
    public void mo36993u(int i) {
        AlarmTextView alarmTextView;
        if (i == 0) {
            this.f16626g.setSelected(true);
            this.f16628i.setSelected(false);
            alarmTextView = this.f16627h;
        } else if (i == 1) {
            this.f16626g.setSelected(false);
            this.f16627h.setSelected(true);
            alarmTextView = this.f16628i;
        } else if (i == 2) {
            this.f16626g.setSelected(false);
            this.f16627h.setSelected(false);
            this.f16628i.setSelected(true);
            this.f16629j.setSelected(false);
        } else if (i == 3) {
            this.f16626g.setSelected(false);
            this.f16627h.setSelected(false);
            this.f16628i.setSelected(false);
            this.f16629j.setSelected(true);
            return;
        } else {
            return;
        }
        alarmTextView.setSelected(false);
        this.f16629j.setSelected(false);
    }

    /* renamed from: v */
    public void mo36994v(int i) {
        this.f16620a = i;
        m21695n();
    }
}
