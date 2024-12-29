package com.yeelight.yeelib.p194ui.activity;

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
import com.yeelight.yeelib.p150c.p151i.C4200i;
import com.yeelight.yeelib.p150c.p184n.C7561k;
import com.yeelight.yeelib.p152f.C4257w;
import com.yeelight.yeelib.p186e.C9768c;
import com.yeelight.yeelib.p191j.p192a.C9878a;
import com.yeelight.yeelib.p191j.p192a.C9897c;
import com.yeelight.yeelib.p194ui.view.CommonTitleBar;
import com.yeelight.yeelib.p194ui.view.TimePicker;
import com.yeelight.yeelib.utils.C10543g;
import com.yeelight.yeelib.utils.C10547m;
import com.yeelight.yeelib.utils.C4308b;
import java.util.Arrays;
import java.util.Calendar;

/* renamed from: com.yeelight.yeelib.ui.activity.LightAlarmDetailActivity */
public class LightAlarmDetailActivity extends BaseActivity implements View.OnClickListener, C9768c {

    /* renamed from: A */
    private static final String f18520A = LightAlarmDetailActivity.class.getSimpleName();

    /* renamed from: b */
    CommonTitleBar f18521b;

    /* renamed from: c */
    TimePicker f18522c;

    /* renamed from: d */
    TextView f18523d;

    /* renamed from: e */
    TextView f18524e;

    /* renamed from: f */
    private ImageView f18525f;

    /* renamed from: g */
    private ImageView f18526g;

    /* renamed from: h */
    private ImageView f18527h;

    /* renamed from: i */
    private ImageView f18528i;

    /* renamed from: j */
    private ImageView f18529j;

    /* renamed from: k */
    private ImageView f18530k;

    /* renamed from: l */
    private ImageView f18531l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public int f18532m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public int f18533n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public int f18534o;

    /* renamed from: p */
    private int f18535p = 0;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public String f18536q = "";

    /* renamed from: r */
    private int f18537r = 1;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public boolean f18538s = true;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public boolean[] f18539t = new boolean[7];

    /* renamed from: u */
    private int f18540u;

    /* renamed from: v */
    private int f18541v;

    /* renamed from: w */
    private int f18542w;

    /* renamed from: x */
    private boolean f18543x;

    /* renamed from: y */
    private String f18544y = "";

    /* renamed from: z */
    private C4200i f18545z;

    /* renamed from: com.yeelight.yeelib.ui.activity.LightAlarmDetailActivity$a */
    class C10083a implements View.OnClickListener {
        C10083a() {
        }

        public void onClick(View view) {
            LightAlarmDetailActivity.this.onBackPressed();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.LightAlarmDetailActivity$b */
    class C10084b implements View.OnClickListener {
        C10084b() {
        }

        public void onClick(View view) {
            LightAlarmDetailActivity.this.m24589h0();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.LightAlarmDetailActivity$c */
    class C10085c implements TimePicker.C10490g {
        C10085c() {
        }

        /* renamed from: a */
        public void mo32387a(TimePicker timePicker, int i, int i2) {
            int unused = LightAlarmDetailActivity.this.f18533n = i;
            int unused2 = LightAlarmDetailActivity.this.f18534o = i2;
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.LightAlarmDetailActivity$d */
    class C10086d implements C9878a.C9890l {

        /* renamed from: a */
        final /* synthetic */ C9878a f18549a;

        C10086d(C9878a aVar) {
            this.f18549a = aVar;
        }

        /* renamed from: a */
        public void mo31990a(boolean z) {
            Resources resources;
            int i;
            TextView textView;
            boolean unused = LightAlarmDetailActivity.this.f18538s = z;
            if (z) {
                LightAlarmDetailActivity lightAlarmDetailActivity = LightAlarmDetailActivity.this;
                textView = lightAlarmDetailActivity.f18523d;
                resources = lightAlarmDetailActivity.getResources();
                i = R$string.alarm_action_turn_on;
            } else {
                LightAlarmDetailActivity lightAlarmDetailActivity2 = LightAlarmDetailActivity.this;
                textView = lightAlarmDetailActivity2.f18523d;
                resources = lightAlarmDetailActivity2.getResources();
                i = R$string.alarm_action_turn_off;
            }
            textView.setText(resources.getString(i));
            this.f18549a.dismiss();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.LightAlarmDetailActivity$e */
    class C10087e implements C9878a.C9889k {

        /* renamed from: a */
        final /* synthetic */ C9878a f18551a;

        /* renamed from: com.yeelight.yeelib.ui.activity.LightAlarmDetailActivity$e$a */
        class C10088a implements C9878a.C9888j {
            C10088a() {
            }

            /* renamed from: a */
            public void mo31988a(boolean[] zArr) {
                TextView textView;
                String b;
                Resources resources;
                int i;
                boolean[] unused = LightAlarmDetailActivity.this.f18539t = zArr;
                int b0 = LightAlarmDetailActivity.this.m24587f0(zArr);
                if (b0 == 1) {
                    LightAlarmDetailActivity lightAlarmDetailActivity = LightAlarmDetailActivity.this;
                    textView = lightAlarmDetailActivity.f18524e;
                    resources = lightAlarmDetailActivity.getResources();
                    i = R$string.common_text_repeat_once;
                } else if (b0 == 2) {
                    LightAlarmDetailActivity lightAlarmDetailActivity2 = LightAlarmDetailActivity.this;
                    textView = lightAlarmDetailActivity2.f18524e;
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
                    String unused2 = LightAlarmDetailActivity.this.f18536q = str;
                    LightAlarmDetailActivity lightAlarmDetailActivity3 = LightAlarmDetailActivity.this;
                    textView = lightAlarmDetailActivity3.f18524e;
                    b = C7561k.m22309b(lightAlarmDetailActivity3, str);
                    textView.setText(b);
                }
                b = resources.getString(i);
                textView.setText(b);
            }
        }

        /* renamed from: com.yeelight.yeelib.ui.activity.LightAlarmDetailActivity$e$b */
        class C10089b implements DialogInterface.OnDismissListener {

            /* renamed from: a */
            final /* synthetic */ C9878a f18554a;

            C10089b(C10087e eVar, C9878a aVar) {
                this.f18554a = aVar;
            }

            public void onDismiss(DialogInterface dialogInterface) {
                this.f18554a.show();
            }
        }

        C10087e(C9878a aVar) {
            this.f18551a = aVar;
        }

        /* renamed from: a */
        public void mo31989a(int i) {
            TextView textView;
            Resources resources;
            int i2;
            if (i == 0) {
                Arrays.fill(LightAlarmDetailActivity.this.f18539t, false);
            } else if (i == 1) {
                Arrays.fill(LightAlarmDetailActivity.this.f18539t, true);
            } else if (i == 2) {
                LightAlarmDetailActivity.this.f18539t[0] = false;
                LightAlarmDetailActivity.this.f18539t[1] = true;
                LightAlarmDetailActivity.this.f18539t[2] = true;
                LightAlarmDetailActivity.this.f18539t[3] = true;
                LightAlarmDetailActivity.this.f18539t[4] = true;
                LightAlarmDetailActivity.this.f18539t[5] = true;
                LightAlarmDetailActivity.this.f18539t[6] = false;
            } else if (i == 3) {
                C9878a m = C9878a.m24241m(LightAlarmDetailActivity.this, 2);
                m.mo31973p(LightAlarmDetailActivity.this.f18539t);
                m.mo31975r(new C10088a());
                this.f18551a.setOnDismissListener(new C10089b(this, m));
            }
            LightAlarmDetailActivity lightAlarmDetailActivity = LightAlarmDetailActivity.this;
            int unused = lightAlarmDetailActivity.f18532m = lightAlarmDetailActivity.m24587f0(lightAlarmDetailActivity.f18539t);
            if (LightAlarmDetailActivity.this.f18532m == 1) {
                LightAlarmDetailActivity lightAlarmDetailActivity2 = LightAlarmDetailActivity.this;
                textView = lightAlarmDetailActivity2.f18524e;
                resources = lightAlarmDetailActivity2.getResources();
                i2 = R$string.common_text_repeat_once;
            } else if (LightAlarmDetailActivity.this.f18532m == 2) {
                LightAlarmDetailActivity lightAlarmDetailActivity3 = LightAlarmDetailActivity.this;
                textView = lightAlarmDetailActivity3.f18524e;
                resources = lightAlarmDetailActivity3.getResources();
                i2 = R$string.common_text_repeat_everyday;
            } else {
                boolean[] Z = LightAlarmDetailActivity.this.f18539t;
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
                lightAlarmDetailActivity4.f18524e.setText(C7561k.m22309b(lightAlarmDetailActivity4, str));
                String unused2 = LightAlarmDetailActivity.this.f18536q = str;
                this.f18551a.dismiss();
            }
            textView.setText(resources.getString(i2));
            this.f18551a.dismiss();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.LightAlarmDetailActivity$f */
    class C10090f implements C9897c.C9901d {
        C10090f() {
        }

        /* renamed from: a */
        public void mo27312a(String str, C9897c cVar) {
            LightAlarmDetailActivity.this.m24589h0();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.LightAlarmDetailActivity$g */
    class C10091g implements C9897c.C9901d {
        C10091g() {
        }

        /* renamed from: a */
        public void mo27312a(String str, C9897c cVar) {
            LightAlarmDetailActivity.this.finish();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: f0 */
    public int m24587f0(boolean[] zArr) {
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
    private void m24588g0() {
        Calendar instance = Calendar.getInstance();
        this.f18533n = getIntent().getIntExtra("hour", instance.get(11));
        this.f18534o = getIntent().getIntExtra("minute", instance.get(12));
        this.f18522c.setCurrentHour(Integer.valueOf(this.f18533n));
        this.f18522c.setCurrentMinute(Integer.valueOf(this.f18534o));
        this.f18522c.setOnTimeChangedListener(new C10085c());
        String stringExtra = getIntent().getStringExtra("repeat");
        this.f18536q = stringExtra;
        this.f18544y = stringExtra;
        C10543g.m25742c(stringExtra);
        this.f18537r = getIntent().getIntExtra("gradual", 1);
        boolean z = getIntent().getIntExtra("on_off", 1) == 1 || getIntent().getIntExtra("on_off", 1) == 3;
        this.f18538s = z;
        this.f18543x = z;
        this.f18541v = this.f18533n;
        this.f18542w = this.f18534o;
        this.f18523d.setText(z ? R$string.alarm_action_turn_on : R$string.alarm_action_turn_off);
        if (this.f18536q != null) {
            int intExtra = getIntent().getIntExtra("type", 1);
            this.f18532m = intExtra;
            this.f18540u = intExtra;
            if (intExtra == 1) {
                this.f18524e.setText(R$string.common_text_repeat_once);
            } else if (intExtra == 2) {
                this.f18524e.setText(R$string.common_text_repeat_everyday);
                Arrays.fill(this.f18539t, true);
            } else {
                this.f18524e.setText(C7561k.m22309b(this, this.f18536q));
                char[] charArray = this.f18536q.toCharArray();
                for (int i = 0; i < charArray.length; i++) {
                    this.f18539t[i] = charArray[i] == '1';
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0044, code lost:
        if (r6.get(12) >= r13.f18534o) goto L_0x0030;
     */
    /* renamed from: h0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m24589h0() {
        /*
            r13 = this;
            android.content.Intent r0 = r13.getIntent()
            java.lang.String r1 = "index"
            r2 = 1
            int r3 = r0.getIntExtra(r1, r2)
            boolean[] r0 = r13.f18539t
            int r7 = r13.m24587f0(r0)
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.lang.String r1 = "repeat"
            java.lang.String r4 = "%02d"
            r5 = 0
            if (r7 != r2) goto L_0x0076
            java.util.Calendar r6 = java.util.Calendar.getInstance()
            r8 = 5
            int r9 = r6.get(r8)
            int r10 = r13.f18533n
            r11 = 11
            int r12 = r6.get(r11)
            if (r10 >= r12) goto L_0x0034
        L_0x0030:
            r6.add(r8, r2)
            goto L_0x0052
        L_0x0034:
            int r10 = r13.f18533n
            int r11 = r6.get(r11)
            if (r10 != r11) goto L_0x0047
            r9 = 12
            int r9 = r6.get(r9)
            int r10 = r13.f18534o
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
            boolean[] r4 = r13.f18539t
            int r4 = r4.length
            java.lang.String[] r6 = new java.lang.String[r4]
        L_0x0095:
            boolean[] r8 = r13.f18539t
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
            int r2 = r13.f18533n
            r1.append(r2)
            java.lang.String r2 = ":"
            r1.append(r2)
            int r2 = r13.f18534o
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "time"
            r0.put(r2, r1)
            boolean r1 = r13.f18538s
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
            com.yeelight.yeelib.utils.C10543g.m25740a(r1, r0)
            int r4 = r13.f18533n
            int r5 = r13.f18534o
            int r6 = r13.f18535p
            int r9 = r13.f18537r
            boolean r0 = r13.f18538s
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
            com.yeelight.yeelib.device.models.e r0 = com.yeelight.yeelib.utils.C10540e.m25719n(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            com.yeelight.yeelib.c.i.i r1 = r13.f18545z
            r2 = 9
            r1.mo23353x(r2, r0)
            r13.finish()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.p194ui.activity.LightAlarmDetailActivity.m24589h0():void");
    }

    public void onBackPressed() {
        String str;
        if (this.f18543x == this.f18538s && this.f18541v == this.f18533n && this.f18542w == this.f18534o) {
            int i = this.f18532m;
            if (i == this.f18540u && i != 3) {
                finish();
                return;
            } else if (this.f18532m != 3 || !this.f18536q.equals(this.f18544y)) {
                str = "error 2 ";
            } else {
                finish();
                return;
            }
        } else {
            str = "error 1 ";
        }
        C10543g.m25742c(str);
        C9897c.m24274p(this, getString(R$string.common_text_discard), getString(R$string.common_text_save), getString(R$string.common_text_cancel), new C10090f(), new C10091g());
    }

    public void onClick(View view) {
        TextView textView;
        String b;
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
            if (this.f18539t[1]) {
                imageView7 = this.f18525f;
                i8 = R$drawable.alarm_selector_unselected;
            } else {
                imageView7 = this.f18525f;
                i8 = R$drawable.alarm_selector_selected;
            }
            imageView7.setImageResource(i8);
            boolean[] zArr = this.f18539t;
            zArr[1] = !zArr[1];
        } else if (id == R$id.alarm_repeat_2) {
            if (this.f18539t[2]) {
                imageView6 = this.f18526g;
                i7 = R$drawable.alarm_selector_unselected;
            } else {
                imageView6 = this.f18526g;
                i7 = R$drawable.alarm_selector_selected;
            }
            imageView6.setImageResource(i7);
            boolean[] zArr2 = this.f18539t;
            zArr2[2] = !zArr2[2];
        } else if (id == R$id.alarm_repeat_3) {
            if (this.f18539t[3]) {
                imageView5 = this.f18527h;
                i6 = R$drawable.alarm_selector_unselected;
            } else {
                imageView5 = this.f18527h;
                i6 = R$drawable.alarm_selector_selected;
            }
            imageView5.setImageResource(i6);
            boolean[] zArr3 = this.f18539t;
            zArr3[3] = !zArr3[3];
        } else if (id == R$id.alarm_repeat_4) {
            if (this.f18539t[4]) {
                imageView4 = this.f18528i;
                i5 = R$drawable.alarm_selector_unselected;
            } else {
                imageView4 = this.f18528i;
                i5 = R$drawable.alarm_selector_selected;
            }
            imageView4.setImageResource(i5);
            boolean[] zArr4 = this.f18539t;
            zArr4[4] = !zArr4[4];
        } else if (id == R$id.alarm_repeat_5) {
            if (this.f18539t[5]) {
                imageView3 = this.f18529j;
                i4 = R$drawable.alarm_selector_unselected;
            } else {
                imageView3 = this.f18529j;
                i4 = R$drawable.alarm_selector_selected;
            }
            imageView3.setImageResource(i4);
            boolean[] zArr5 = this.f18539t;
            zArr5[5] = !zArr5[5];
        } else if (id == R$id.alarm_repeat_6) {
            if (this.f18539t[6]) {
                imageView2 = this.f18530k;
                i3 = R$drawable.alarm_selector_unselected;
            } else {
                imageView2 = this.f18530k;
                i3 = R$drawable.alarm_selector_selected;
            }
            imageView2.setImageResource(i3);
            boolean[] zArr6 = this.f18539t;
            zArr6[6] = !zArr6[6];
        } else if (id == R$id.alarm_repeat_7) {
            if (this.f18539t[0]) {
                imageView = this.f18531l;
                i2 = R$drawable.alarm_selector_unselected;
            } else {
                imageView = this.f18531l;
                i2 = R$drawable.alarm_selector_selected;
            }
            imageView.setImageResource(i2);
            boolean[] zArr7 = this.f18539t;
            zArr7[0] = !zArr7[0];
        }
        int f0 = m24587f0(this.f18539t);
        this.f18532m = f0;
        if (f0 == 1) {
            textView = this.f18524e;
            resources = getResources();
            i = R$string.common_text_repeat_once;
        } else if (f0 == 2) {
            textView = this.f18524e;
            resources = getResources();
            i = R$string.common_text_repeat_everyday;
        } else {
            boolean[] zArr8 = this.f18539t;
            int length = zArr8.length;
            String str = "";
            for (int i9 = 0; i9 < length; i9++) {
                boolean z = zArr8[i9];
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(z ? TimerCodec.ENABLE : TimerCodec.DISENABLE);
                str = sb.toString();
            }
            this.f18536q = str;
            textView = this.f18524e;
            b = C7561k.m22309b(this, str);
            textView.setText(b);
        }
        b = resources.getString(i);
        textView.setText(b);
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
        setContentView(R$layout.activity_light_alarm_detail);
        this.f18521b = (CommonTitleBar) findViewById(R$id.title_bar);
        this.f18522c = (TimePicker) findViewById(R$id.timerPicker);
        this.f18523d = (TextView) findViewById(R$id.switch_text);
        this.f18524e = (TextView) findViewById(R$id.repeat_text);
        this.f18521b.mo32825a(getResources().getString(R$string.alarm_set_time), new C10083a(), new C10084b());
        this.f18521b.setTitleTextSize(16);
        this.f18522c.setIs24HourView(Boolean.TRUE);
        Intent intent = getIntent();
        if (!intent.hasExtra("com.yeelight.cherry.device_id")) {
            C4308b.m12141t(f18520A, "Activity has not device id", false);
            finish();
            return;
        }
        C4200i o0 = C4257w.m11953o0(intent.getStringExtra("com.yeelight.cherry.device_id"));
        this.f18545z = o0;
        if (o0 == null) {
            finish();
        } else {
            m24588g0();
        }
    }

    public void onLocalConnected() {
    }

    public void onLocalDisconnected() {
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        this.f18545z.mo23319V0(this);
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        this.f18545z.mo23358z0(this);
    }

    public void repeatSelect(View view) {
        C9878a m = C9878a.m24241m(this, 1);
        m.mo31976s(new C10087e(m));
        int f0 = m24587f0(this.f18539t);
        if (f0 == 1) {
            m.mo31978u(0);
        } else if (f0 == 2) {
            m.mo31978u(1);
        } else {
            boolean[] zArr = this.f18539t;
            if (zArr[0] || !zArr[1] || !zArr[2] || !zArr[3] || !zArr[4] || !zArr[5] || zArr[6]) {
                m.mo31978u(3);
            } else {
                m.mo31978u(2);
            }
        }
        m.show();
    }

    public void switchSelect(View view) {
        C9878a m = C9878a.m24241m(this, 0);
        m.mo31974q(this.f18538s);
        m.mo31977t(new C10086d(m));
        m.show();
    }
}
