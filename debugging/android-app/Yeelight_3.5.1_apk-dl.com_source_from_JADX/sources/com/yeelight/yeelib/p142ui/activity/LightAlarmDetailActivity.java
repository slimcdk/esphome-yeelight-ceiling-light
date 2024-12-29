package com.yeelight.yeelib.p142ui.activity;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.miot.service.manager.timer.TimerCodec;
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
import p051j4.C9193k;
import p160g4.C9052a;
import p160g4.C9071c;
import p237z3.C12143c;

/* renamed from: com.yeelight.yeelib.ui.activity.LightAlarmDetailActivity */
public class LightAlarmDetailActivity extends BaseActivity implements View.OnClickListener, C12143c {

    /* renamed from: z */
    private static final String f14828z = LightAlarmDetailActivity.class.getSimpleName();

    /* renamed from: a */
    CommonTitleBar f14829a;

    /* renamed from: b */
    TimePicker f14830b;

    /* renamed from: c */
    TextView f14831c;

    /* renamed from: d */
    TextView f14832d;

    /* renamed from: e */
    private ImageView f14833e;

    /* renamed from: f */
    private ImageView f14834f;

    /* renamed from: g */
    private ImageView f14835g;

    /* renamed from: h */
    private ImageView f14836h;

    /* renamed from: i */
    private ImageView f14837i;

    /* renamed from: j */
    private ImageView f14838j;

    /* renamed from: k */
    private ImageView f14839k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public int f14840l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public int f14841m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public int f14842n;

    /* renamed from: o */
    private int f14843o = 0;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public String f14844p = "";

    /* renamed from: q */
    private int f14845q = 1;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public boolean f14846r = true;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public boolean[] f14847s = new boolean[7];

    /* renamed from: t */
    private int f14848t;

    /* renamed from: u */
    private int f14849u;

    /* renamed from: v */
    private int f14850v;

    /* renamed from: w */
    private boolean f14851w;

    /* renamed from: x */
    private String f14852x = "";

    /* renamed from: y */
    private C3012e f14853y;

    /* renamed from: com.yeelight.yeelib.ui.activity.LightAlarmDetailActivity$a */
    class C8501a implements View.OnClickListener {
        C8501a() {
        }

        public void onClick(View view) {
            LightAlarmDetailActivity.this.onBackPressed();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.LightAlarmDetailActivity$b */
    class C8502b implements View.OnClickListener {
        C8502b() {
        }

        public void onClick(View view) {
            LightAlarmDetailActivity.this.m20189h0();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.LightAlarmDetailActivity$c */
    class C8503c implements TimePicker.C8867g {
        C8503c() {
        }

        /* renamed from: a */
        public void mo35818a(TimePicker timePicker, int i, int i2) {
            int unused = LightAlarmDetailActivity.this.f14841m = i;
            int unused2 = LightAlarmDetailActivity.this.f14842n = i2;
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.LightAlarmDetailActivity$d */
    class C8504d implements C9052a.C9064l {

        /* renamed from: a */
        final /* synthetic */ C9052a f14857a;

        C8504d(C9052a aVar) {
            this.f14857a = aVar;
        }

        /* renamed from: a */
        public void mo35819a(boolean z) {
            Resources resources;
            int i;
            TextView textView;
            boolean unused = LightAlarmDetailActivity.this.f14846r = z;
            if (z) {
                LightAlarmDetailActivity lightAlarmDetailActivity = LightAlarmDetailActivity.this;
                textView = lightAlarmDetailActivity.f14831c;
                resources = lightAlarmDetailActivity.getResources();
                i = R$string.alarm_action_turn_on;
            } else {
                LightAlarmDetailActivity lightAlarmDetailActivity2 = LightAlarmDetailActivity.this;
                textView = lightAlarmDetailActivity2.f14831c;
                resources = lightAlarmDetailActivity2.getResources();
                i = R$string.alarm_action_turn_off;
            }
            textView.setText(resources.getString(i));
            this.f14857a.dismiss();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.LightAlarmDetailActivity$e */
    class C8505e implements C9052a.C9063k {

        /* renamed from: a */
        final /* synthetic */ C9052a f14859a;

        /* renamed from: com.yeelight.yeelib.ui.activity.LightAlarmDetailActivity$e$a */
        class C8506a implements C9052a.C9062j {
            C8506a() {
            }

            /* renamed from: a */
            public void mo35821a(boolean[] zArr) {
                TextView textView;
                String alarmRepeatDays;
                Resources resources;
                int i;
                boolean[] unused = LightAlarmDetailActivity.this.f14847s = zArr;
                int b0 = LightAlarmDetailActivity.this.m20187f0(zArr);
                if (b0 == 1) {
                    LightAlarmDetailActivity lightAlarmDetailActivity = LightAlarmDetailActivity.this;
                    textView = lightAlarmDetailActivity.f14832d;
                    resources = lightAlarmDetailActivity.getResources();
                    i = R$string.common_text_repeat_once;
                } else if (b0 == 2) {
                    LightAlarmDetailActivity lightAlarmDetailActivity2 = LightAlarmDetailActivity.this;
                    textView = lightAlarmDetailActivity2.f14832d;
                    resources = lightAlarmDetailActivity2.getResources();
                    i = R$string.common_text_repeat_everyday;
                } else {
                    int length = zArr.length;
                    String str = "";
                    for (int i2 = 0; i2 < length; i2++) {
                        boolean z = zArr[i2];
                        StringBuilder sb = new StringBuilder();
                        sb.append(str);
                        sb.append(z ? TimerCodec.ENABLE : TimerCodec.DISENABLE);
                        str = sb.toString();
                    }
                    String unused2 = LightAlarmDetailActivity.this.f14844p = str;
                    LightAlarmDetailActivity lightAlarmDetailActivity3 = LightAlarmDetailActivity.this;
                    textView = lightAlarmDetailActivity3.f14832d;
                    alarmRepeatDays = TimerModel.getAlarmRepeatDays(lightAlarmDetailActivity3, str);
                    textView.setText(alarmRepeatDays);
                }
                alarmRepeatDays = resources.getString(i);
                textView.setText(alarmRepeatDays);
            }
        }

        /* renamed from: com.yeelight.yeelib.ui.activity.LightAlarmDetailActivity$e$b */
        class C8507b implements DialogInterface.OnDismissListener {

            /* renamed from: a */
            final /* synthetic */ C9052a f14862a;

            C8507b(C8505e eVar, C9052a aVar) {
                this.f14862a = aVar;
            }

            public void onDismiss(DialogInterface dialogInterface) {
                this.f14862a.show();
            }
        }

        C8505e(C9052a aVar) {
            this.f14859a = aVar;
        }

        /* renamed from: a */
        public void mo35820a(int i) {
            TextView textView;
            Resources resources;
            int i2;
            if (i == 0) {
                Arrays.fill(LightAlarmDetailActivity.this.f14847s, false);
            } else if (i == 1) {
                Arrays.fill(LightAlarmDetailActivity.this.f14847s, true);
            } else if (i == 2) {
                LightAlarmDetailActivity.this.f14847s[0] = false;
                LightAlarmDetailActivity.this.f14847s[1] = true;
                LightAlarmDetailActivity.this.f14847s[2] = true;
                LightAlarmDetailActivity.this.f14847s[3] = true;
                LightAlarmDetailActivity.this.f14847s[4] = true;
                LightAlarmDetailActivity.this.f14847s[5] = true;
                LightAlarmDetailActivity.this.f14847s[6] = false;
            } else if (i == 3) {
                C9052a m = C9052a.m21694m(LightAlarmDetailActivity.this, 2);
                m.mo36988p(LightAlarmDetailActivity.this.f14847s);
                m.mo36990r(new C8506a());
                this.f14859a.setOnDismissListener(new C8507b(this, m));
            }
            LightAlarmDetailActivity lightAlarmDetailActivity = LightAlarmDetailActivity.this;
            int unused = lightAlarmDetailActivity.f14840l = lightAlarmDetailActivity.m20187f0(lightAlarmDetailActivity.f14847s);
            if (LightAlarmDetailActivity.this.f14840l == 1) {
                LightAlarmDetailActivity lightAlarmDetailActivity2 = LightAlarmDetailActivity.this;
                textView = lightAlarmDetailActivity2.f14832d;
                resources = lightAlarmDetailActivity2.getResources();
                i2 = R$string.common_text_repeat_once;
            } else if (LightAlarmDetailActivity.this.f14840l == 2) {
                LightAlarmDetailActivity lightAlarmDetailActivity3 = LightAlarmDetailActivity.this;
                textView = lightAlarmDetailActivity3.f14832d;
                resources = lightAlarmDetailActivity3.getResources();
                i2 = R$string.common_text_repeat_everyday;
            } else {
                boolean[] Z = LightAlarmDetailActivity.this.f14847s;
                int length = Z.length;
                String str = "";
                for (int i3 = 0; i3 < length; i3++) {
                    boolean z = Z[i3];
                    StringBuilder sb = new StringBuilder();
                    sb.append(str);
                    sb.append(z ? TimerCodec.ENABLE : TimerCodec.DISENABLE);
                    str = sb.toString();
                }
                LightAlarmDetailActivity lightAlarmDetailActivity4 = LightAlarmDetailActivity.this;
                lightAlarmDetailActivity4.f14832d.setText(TimerModel.getAlarmRepeatDays(lightAlarmDetailActivity4, str));
                String unused2 = LightAlarmDetailActivity.this.f14844p = str;
                this.f14859a.dismiss();
            }
            textView.setText(resources.getString(i2));
            this.f14859a.dismiss();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.LightAlarmDetailActivity$f */
    class C8508f implements C9071c.C9075d {
        C8508f() {
        }

        /* renamed from: a */
        public void mo31271a(String str, C9071c cVar) {
            LightAlarmDetailActivity.this.m20189h0();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.LightAlarmDetailActivity$g */
    class C8509g implements C9071c.C9075d {
        C8509g() {
        }

        /* renamed from: a */
        public void mo31271a(String str, C9071c cVar) {
            LightAlarmDetailActivity.this.finish();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: f0 */
    public int m20187f0(boolean[] zArr) {
        int i = 1;
        for (boolean z : zArr) {
            if (z) {
                i = 2;
            }
        }
        if (i == 2) {
            for (boolean z2 : zArr) {
                if (!z2) {
                    return 3;
                }
            }
        }
        return i;
    }

    /* renamed from: g0 */
    private void m20188g0() {
        Calendar instance = Calendar.getInstance();
        this.f14841m = getIntent().getIntExtra(TimerModel.HOUR, instance.get(11));
        this.f14842n = getIntent().getIntExtra(TimerModel.MINUTE, instance.get(12));
        this.f14830b.setCurrentHour(Integer.valueOf(this.f14841m));
        this.f14830b.setCurrentMinute(Integer.valueOf(this.f14842n));
        this.f14830b.setOnTimeChangedListener(new C8503c());
        String stringExtra = getIntent().getStringExtra(TimerModel.REPEAT);
        this.f14844p = stringExtra;
        this.f14852x = stringExtra;
        C9189e.m22140c(stringExtra);
        this.f14845q = getIntent().getIntExtra(TimerModel.GRADUAL, 1);
        boolean z = getIntent().getIntExtra(TimerModel.ON_OFF, 1) == 1 || getIntent().getIntExtra(TimerModel.ON_OFF, 1) == 3;
        this.f14846r = z;
        this.f14851w = z;
        this.f14849u = this.f14841m;
        this.f14850v = this.f14842n;
        this.f14831c.setText(z ? R$string.alarm_action_turn_on : R$string.alarm_action_turn_off);
        if (this.f14844p != null) {
            int intExtra = getIntent().getIntExtra("type", 1);
            this.f14840l = intExtra;
            this.f14848t = intExtra;
            if (intExtra == 1) {
                this.f14832d.setText(R$string.common_text_repeat_once);
            } else if (intExtra == 2) {
                this.f14832d.setText(R$string.common_text_repeat_everyday);
                Arrays.fill(this.f14847s, true);
            } else {
                this.f14832d.setText(TimerModel.getAlarmRepeatDays(this, this.f14844p));
                char[] charArray = this.f14844p.toCharArray();
                for (int i = 0; i < charArray.length; i++) {
                    this.f14847s[i] = charArray[i] == '1';
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0044, code lost:
        if (r6.get(12) >= r13.f14842n) goto L_0x0030;
     */
    /* renamed from: h0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m20189h0() {
        /*
            r13 = this;
            android.content.Intent r0 = r13.getIntent()
            java.lang.String r1 = "index"
            r2 = 1
            int r3 = r0.getIntExtra(r1, r2)
            boolean[] r0 = r13.f14847s
            int r7 = r13.m20187f0(r0)
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.lang.String r1 = "repeat"
            java.lang.String r4 = "%02d"
            r5 = 0
            if (r7 != r2) goto L_0x0076
            java.util.Calendar r6 = java.util.Calendar.getInstance()
            r8 = 5
            int r9 = r6.get(r8)
            int r10 = r13.f14841m
            r11 = 11
            int r12 = r6.get(r11)
            if (r10 >= r12) goto L_0x0034
        L_0x0030:
            r6.add(r8, r2)
            goto L_0x0052
        L_0x0034:
            int r10 = r13.f14841m
            int r11 = r6.get(r11)
            if (r10 != r11) goto L_0x0047
            r9 = 12
            int r9 = r6.get(r9)
            int r10 = r13.f14842n
            if (r9 < r10) goto L_0x0052
            goto L_0x0030
        L_0x0047:
            java.lang.Object[] r10 = new java.lang.Object[r2]
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r10[r5] = r9
            java.lang.String.format(r4, r10)
        L_0x0052:
            int r6 = r6.get(r8)
            java.lang.String[] r8 = new java.lang.String[r2]
            java.lang.Object[] r9 = new java.lang.Object[r2]
            java.lang.Integer r10 = java.lang.Integer.valueOf(r6)
            r9[r5] = r10
            java.lang.String r9 = java.lang.String.format(r4, r9)
            r8[r5] = r9
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r2[r5] = r6
            java.lang.String r2 = java.lang.String.format(r4, r2)
            r0.put(r1, r2)
            goto L_0x00c1
        L_0x0076:
            r6 = 2
            if (r7 != r6) goto L_0x0090
            java.lang.String[] r6 = new java.lang.String[r2]
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.Integer r8 = java.lang.Integer.valueOf(r5)
            r2[r5] = r8
            java.lang.String r2 = java.lang.String.format(r4, r2)
            r6[r5] = r2
            java.lang.String r2 = "00"
        L_0x008b:
            r0.put(r1, r2)
            r8 = r6
            goto L_0x00c1
        L_0x0090:
            boolean[] r4 = r13.f14847s
            int r4 = r4.length
            java.lang.String[] r6 = new java.lang.String[r4]
        L_0x0095:
            boolean[] r8 = r13.f14847s
            int r9 = r8.length
            if (r5 >= r9) goto L_0x00a8
            boolean r8 = r8[r5]
            if (r8 == 0) goto L_0x00a1
            java.lang.String r8 = "1"
            goto L_0x00a3
        L_0x00a1:
            java.lang.String r8 = "0"
        L_0x00a3:
            r6[r5] = r8
            int r5 = r5 + 1
            goto L_0x0095
        L_0x00a8:
            int r4 = r4 - r2
            java.lang.String r2 = ""
        L_0x00ab:
            if (r4 < 0) goto L_0x008b
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r2)
            r2 = r6[r4]
            r5.append(r2)
            java.lang.String r2 = r5.toString()
            int r4 = r4 + -1
            goto L_0x00ab
        L_0x00c1:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            int r2 = r13.f14841m
            r1.append(r2)
            java.lang.String r2 = ":"
            r1.append(r2)
            int r2 = r13.f14842n
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "time"
            r0.put(r2, r1)
            boolean r1 = r13.f14846r
            if (r1 == 0) goto L_0x00e5
            java.lang.String r1 = "on"
            goto L_0x00e7
        L_0x00e5:
            java.lang.String r1 = "off"
        L_0x00e7:
            java.lang.String r2 = "operation"
            r0.put(r2, r1)
            java.lang.String r1 = java.lang.String.valueOf(r7)
            java.lang.String r2 = "mode"
            r0.put(r2, r1)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "add repeat = "
            r0.append(r1)
            java.lang.String r1 = java.util.Arrays.toString(r8)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "timer"
            p051j4.C9189e.m22138a(r1, r0)
            int r4 = r13.f14841m
            int r5 = r13.f14842n
            int r6 = r13.f14843o
            int r9 = r13.f14845q
            boolean r0 = r13.f14846r
            if (r0 == 0) goto L_0x011e
            r0 = 3
            r10 = 3
            goto L_0x0120
        L_0x011e:
            r0 = 4
            r10 = 4
        L_0x0120:
            r11 = 0
            r12 = 1
            x3.d r0 = p051j4.C9186c.m22117n(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            com.yeelight.yeelib.device.base.e r1 = r13.f14853y
            r2 = 9
            r1.mo23166x(r2, r0)
            r13.finish()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.p142ui.activity.LightAlarmDetailActivity.m20189h0():void");
    }

    public void onBackPressed() {
        String str;
        if (this.f14851w == this.f14846r && this.f14849u == this.f14841m && this.f14850v == this.f14842n) {
            int i = this.f14840l;
            if (i == this.f14848t && i != 3) {
                finish();
                return;
            } else if (i != 3 || !this.f14844p.equals(this.f14852x)) {
                str = "error 2 ";
            } else {
                finish();
                return;
            }
        } else {
            str = "error 1 ";
        }
        C9189e.m22140c(str);
        C9071c.m21727p(this, getString(R$string.common_text_discard), getString(R$string.common_text_save), getString(R$string.common_text_cancel), new C8508f(), new C8509g());
    }

    public void onClick(View view) {
        TextView textView;
        String alarmRepeatDays;
        Resources resources;
        int i;
        ImageView imageView;
        int i2;
        ImageView imageView2;
        int i3;
        ImageView imageView3;
        int i4;
        ImageView imageView4;
        int i5;
        ImageView imageView5;
        int i6;
        ImageView imageView6;
        int i7;
        ImageView imageView7;
        int i8;
        int id = view.getId();
        if (id == R$id.alarm_repeat_1) {
            if (this.f14847s[1]) {
                imageView7 = this.f14833e;
                i8 = R$drawable.alarm_selector_unselected;
            } else {
                imageView7 = this.f14833e;
                i8 = R$drawable.alarm_selector_selected;
            }
            imageView7.setImageResource(i8);
            boolean[] zArr = this.f14847s;
            zArr[1] = !zArr[1];
        } else if (id == R$id.alarm_repeat_2) {
            if (this.f14847s[2]) {
                imageView6 = this.f14834f;
                i7 = R$drawable.alarm_selector_unselected;
            } else {
                imageView6 = this.f14834f;
                i7 = R$drawable.alarm_selector_selected;
            }
            imageView6.setImageResource(i7);
            boolean[] zArr2 = this.f14847s;
            zArr2[2] = !zArr2[2];
        } else if (id == R$id.alarm_repeat_3) {
            if (this.f14847s[3]) {
                imageView5 = this.f14835g;
                i6 = R$drawable.alarm_selector_unselected;
            } else {
                imageView5 = this.f14835g;
                i6 = R$drawable.alarm_selector_selected;
            }
            imageView5.setImageResource(i6);
            boolean[] zArr3 = this.f14847s;
            zArr3[3] = !zArr3[3];
        } else if (id == R$id.alarm_repeat_4) {
            if (this.f14847s[4]) {
                imageView4 = this.f14836h;
                i5 = R$drawable.alarm_selector_unselected;
            } else {
                imageView4 = this.f14836h;
                i5 = R$drawable.alarm_selector_selected;
            }
            imageView4.setImageResource(i5);
            boolean[] zArr4 = this.f14847s;
            zArr4[4] = !zArr4[4];
        } else if (id == R$id.alarm_repeat_5) {
            if (this.f14847s[5]) {
                imageView3 = this.f14837i;
                i4 = R$drawable.alarm_selector_unselected;
            } else {
                imageView3 = this.f14837i;
                i4 = R$drawable.alarm_selector_selected;
            }
            imageView3.setImageResource(i4);
            boolean[] zArr5 = this.f14847s;
            zArr5[5] = !zArr5[5];
        } else if (id == R$id.alarm_repeat_6) {
            if (this.f14847s[6]) {
                imageView2 = this.f14838j;
                i3 = R$drawable.alarm_selector_unselected;
            } else {
                imageView2 = this.f14838j;
                i3 = R$drawable.alarm_selector_selected;
            }
            imageView2.setImageResource(i3);
            boolean[] zArr6 = this.f14847s;
            zArr6[6] = !zArr6[6];
        } else if (id == R$id.alarm_repeat_7) {
            if (this.f14847s[0]) {
                imageView = this.f14839k;
                i2 = R$drawable.alarm_selector_unselected;
            } else {
                imageView = this.f14839k;
                i2 = R$drawable.alarm_selector_selected;
            }
            imageView.setImageResource(i2);
            boolean[] zArr7 = this.f14847s;
            zArr7[0] = !zArr7[0];
        }
        int f0 = m20187f0(this.f14847s);
        this.f14840l = f0;
        if (f0 == 1) {
            textView = this.f14832d;
            resources = getResources();
            i = R$string.common_text_repeat_once;
        } else if (f0 == 2) {
            textView = this.f14832d;
            resources = getResources();
            i = R$string.common_text_repeat_everyday;
        } else {
            boolean[] zArr8 = this.f14847s;
            int length = zArr8.length;
            String str = "";
            for (int i9 = 0; i9 < length; i9++) {
                boolean z = zArr8[i9];
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(z ? TimerCodec.ENABLE : TimerCodec.DISENABLE);
                str = sb.toString();
            }
            this.f14844p = str;
            textView = this.f14832d;
            alarmRepeatDays = TimerModel.getAlarmRepeatDays(this, str);
            textView.setText(alarmRepeatDays);
        }
        alarmRepeatDays = resources.getString(i);
        textView.setText(alarmRepeatDays);
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
        setContentView(R$layout.activity_light_alarm_detail);
        this.f14829a = (CommonTitleBar) findViewById(R$id.title_bar);
        this.f14830b = (TimePicker) findViewById(R$id.timerPicker);
        this.f14831c = (TextView) findViewById(R$id.switch_text);
        this.f14832d = (TextView) findViewById(R$id.repeat_text);
        this.f14829a.mo36195a(getResources().getString(R$string.alarm_set_time), new C8501a(), new C8502b());
        this.f14829a.setTitleTextSize(16);
        this.f14830b.setIs24HourView(Boolean.TRUE);
        Intent intent = getIntent();
        if (!intent.hasExtra("com.yeelight.cherry.device_id")) {
            AppUtils.m8302w(f14828z, "Activity has not device id", false);
            finish();
            return;
        }
        C3012e r0 = YeelightDeviceManager.m7804r0(intent.getStringExtra("com.yeelight.cherry.device_id"));
        this.f14853y = r0;
        if (r0 == null) {
            finish();
        } else {
            m20188g0();
        }
    }

    public void onLocalConnected() {
    }

    public void onLocalDisconnected() {
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        this.f14853y.mo23133V0(this);
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        this.f14853y.mo23171z0(this);
    }

    public void repeatSelect(View view) {
        C9052a m = C9052a.m21694m(this, 1);
        m.mo36991s(new C8505e(m));
        int f0 = m20187f0(this.f14847s);
        if (f0 == 1) {
            m.mo36993u(0);
        } else if (f0 == 2) {
            m.mo36993u(1);
        } else {
            boolean[] zArr = this.f14847s;
            if (zArr[0] || !zArr[1] || !zArr[2] || !zArr[3] || !zArr[4] || !zArr[5] || zArr[6]) {
                m.mo36993u(3);
            } else {
                m.mo36993u(2);
            }
        }
        m.show();
    }

    public void switchSelect(View view) {
        C9052a m = C9052a.m21694m(this, 0);
        m.mo36989q(this.f14846r);
        m.mo36992t(new C8504d(m));
        m.show();
    }
}
