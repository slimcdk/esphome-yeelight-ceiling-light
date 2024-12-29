package com.yeelight.yeelib.p194ui.activity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckedTextView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.miot.service.manager.timer.TimerCodec;
import com.yeelight.yeelib.R$drawable;
import com.yeelight.yeelib.R$id;
import com.yeelight.yeelib.R$layout;
import com.yeelight.yeelib.R$string;
import com.yeelight.yeelib.p150c.C6006h;
import com.yeelight.yeelib.p150c.p151i.C4198d;
import com.yeelight.yeelib.p150c.p151i.C4200i;
import com.yeelight.yeelib.p150c.p151i.C6024e;
import com.yeelight.yeelib.p150c.p151i.C6067o;
import com.yeelight.yeelib.p150c.p183m.C7186q;
import com.yeelight.yeelib.p150c.p184n.C7558h;
import com.yeelight.yeelib.p152f.C4257w;
import com.yeelight.yeelib.p186e.C9770e;
import com.yeelight.yeelib.p194ui.widget.C10526e;
import com.yeelight.yeelib.p194ui.widget.WheelPicker;
import com.yeelight.yeelib.utils.C10547m;
import com.yeelight.yeelib.utils.C4308b;

/* renamed from: com.yeelight.yeelib.ui.activity.NightLightNewActivity */
public class NightLightNewActivity extends BaseActivity implements C9770e {

    /* renamed from: B */
    private static final String f18684B = NightLightNewActivity.class.getSimpleName();

    /* renamed from: A */
    private C10526e f18685A;

    /* renamed from: b */
    ImageView f18686b;

    /* renamed from: c */
    ImageView f18687c;

    /* renamed from: d */
    WheelPicker f18688d;

    /* renamed from: e */
    WheelPicker f18689e;

    /* renamed from: f */
    TextView f18690f;

    /* renamed from: g */
    CheckedTextView f18691g;

    /* renamed from: h */
    CheckedTextView f18692h;

    /* renamed from: i */
    CheckedTextView f18693i;

    /* renamed from: j */
    CheckedTextView f18694j;

    /* renamed from: k */
    CheckedTextView f18695k;

    /* renamed from: l */
    CheckedTextView f18696l;

    /* renamed from: m */
    Button f18697m;

    /* renamed from: n */
    LinearLayout f18698n;

    /* renamed from: o */
    TextView f18699o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public C4198d f18700p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public int f18701q;

    /* renamed from: r */
    private int f18702r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public int f18703s;

    /* renamed from: t */
    private int f18704t;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public int f18705u = -1;
    /* access modifiers changed from: private */

    /* renamed from: v */
    public boolean f18706v = false;
    /* access modifiers changed from: private */

    /* renamed from: w */
    public boolean f18707w = false;
    /* access modifiers changed from: private */

    /* renamed from: x */
    public int f18708x = 23;
    /* access modifiers changed from: private */

    /* renamed from: y */
    public int f18709y = 6;
    /* access modifiers changed from: private */

    /* renamed from: z */
    public int f18710z = 0;

    /* renamed from: com.yeelight.yeelib.ui.activity.NightLightNewActivity$a */
    class C10131a implements View.OnClickListener {
        C10131a() {
        }

        public void onClick(View view) {
            if (NightLightNewActivity.this.f18696l.isChecked()) {
                int unused = NightLightNewActivity.this.f18705u = 0;
                NightLightNewActivity.this.f18696l.setChecked(false);
            } else {
                int unused2 = NightLightNewActivity.this.f18705u = 20;
                NightLightNewActivity.this.f18696l.setChecked(true);
            }
            NightLightNewActivity nightLightNewActivity = NightLightNewActivity.this;
            nightLightNewActivity.m24713p0(nightLightNewActivity.f18705u);
            NightLightNewActivity.this.f18697m.setVisibility(0);
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.NightLightNewActivity$b */
    class C10132b implements View.OnClickListener {
        C10132b() {
        }

        public void onClick(View view) {
            ImageView imageView;
            int i;
            NightLightNewActivity nightLightNewActivity = NightLightNewActivity.this;
            boolean unused = nightLightNewActivity.f18706v = !nightLightNewActivity.f18706v;
            if (NightLightNewActivity.this.f18706v) {
                imageView = NightLightNewActivity.this.f18687c;
                i = R$drawable.icon_yeelight_switch_point_on_new;
            } else {
                imageView = NightLightNewActivity.this.f18687c;
                i = R$drawable.icon_yeelight_switch_point_off_new;
            }
            imageView.setImageResource(i);
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.NightLightNewActivity$c */
    class C10133c implements DialogInterface.OnClickListener {
        C10133c() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
            NightLightNewActivity.this.finish();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.NightLightNewActivity$d */
    class C10134d implements Runnable {
        C10134d() {
        }

        public void run() {
            C7558h hVar;
            NightLightNewActivity.this.m24714q0();
            if ((NightLightNewActivity.this.f18700p instanceof C7186q) && NightLightNewActivity.this.f18710z == -1 && (hVar = (C7558h) NightLightNewActivity.this.f18700p.mo23408d0().mo27710r(3)) != null) {
                int unused = NightLightNewActivity.this.f18701q = hVar.mo28918a();
                int unused2 = NightLightNewActivity.this.f18703s = hVar.mo28920c();
                boolean unused3 = NightLightNewActivity.this.f18706v = hVar.mo28922e();
                int unused4 = NightLightNewActivity.this.f18705u = 0;
                NightLightNewActivity nightLightNewActivity = NightLightNewActivity.this;
                nightLightNewActivity.f18688d.mo33217l(nightLightNewActivity.f18701q, false);
                NightLightNewActivity nightLightNewActivity2 = NightLightNewActivity.this;
                nightLightNewActivity2.f18689e.mo33217l(nightLightNewActivity2.f18703s, false);
                int unused5 = NightLightNewActivity.this.f18710z = 0;
                NightLightNewActivity nightLightNewActivity3 = NightLightNewActivity.this;
                int unused6 = nightLightNewActivity3.f18709y = nightLightNewActivity3.f18703s;
                NightLightNewActivity nightLightNewActivity4 = NightLightNewActivity.this;
                int unused7 = nightLightNewActivity4.f18708x = nightLightNewActivity4.f18701q;
                NightLightNewActivity nightLightNewActivity5 = NightLightNewActivity.this;
                boolean unused8 = nightLightNewActivity5.f18707w = nightLightNewActivity5.f18700p.mo23408d0().mo27679b0();
            }
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.NightLightNewActivity$e */
    class C10135e implements WheelPicker.C10501a {
        C10135e() {
        }

        /* renamed from: a */
        public void mo32260a(WheelPicker wheelPicker, Object obj, int i) {
            int unused = NightLightNewActivity.this.f18701q = i;
            NightLightNewActivity.this.f18697m.setVisibility(0);
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.NightLightNewActivity$f */
    class C10136f implements WheelPicker.C10501a {
        C10136f() {
        }

        /* renamed from: a */
        public void mo32260a(WheelPicker wheelPicker, Object obj, int i) {
            int unused = NightLightNewActivity.this.f18703s = i;
            NightLightNewActivity.this.f18697m.setVisibility(0);
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.NightLightNewActivity$g */
    class C10137g implements View.OnClickListener {
        C10137g() {
        }

        public void onClick(View view) {
            NightLightNewActivity.this.onBackPressed();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.NightLightNewActivity$h */
    class C10138h implements View.OnClickListener {
        C10138h() {
        }

        public void onClick(View view) {
            NightLightNewActivity.this.m24712o0();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.NightLightNewActivity$i */
    class C10139i implements View.OnClickListener {
        C10139i() {
        }

        public void onClick(View view) {
            if (NightLightNewActivity.this.f18691g.isChecked()) {
                int unused = NightLightNewActivity.this.f18705u = 0;
                NightLightNewActivity.this.f18691g.setChecked(false);
            } else {
                int unused2 = NightLightNewActivity.this.f18705u = 1;
                NightLightNewActivity.this.f18691g.setChecked(true);
            }
            NightLightNewActivity nightLightNewActivity = NightLightNewActivity.this;
            nightLightNewActivity.m24713p0(nightLightNewActivity.f18705u);
            NightLightNewActivity.this.f18697m.setVisibility(0);
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.NightLightNewActivity$j */
    class C10140j implements View.OnClickListener {
        C10140j() {
        }

        public void onClick(View view) {
            if (NightLightNewActivity.this.f18692h.isChecked()) {
                int unused = NightLightNewActivity.this.f18705u = 0;
                NightLightNewActivity.this.f18692h.setChecked(false);
            } else {
                int unused2 = NightLightNewActivity.this.f18705u = 3;
                NightLightNewActivity.this.f18692h.setChecked(true);
            }
            NightLightNewActivity nightLightNewActivity = NightLightNewActivity.this;
            nightLightNewActivity.m24713p0(nightLightNewActivity.f18705u);
            NightLightNewActivity.this.f18697m.setVisibility(0);
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.NightLightNewActivity$k */
    class C10141k implements View.OnClickListener {
        C10141k() {
        }

        public void onClick(View view) {
            if (NightLightNewActivity.this.f18693i.isChecked()) {
                int unused = NightLightNewActivity.this.f18705u = 0;
                NightLightNewActivity.this.f18693i.setChecked(false);
            } else {
                int unused2 = NightLightNewActivity.this.f18705u = 5;
                NightLightNewActivity.this.f18693i.setChecked(true);
            }
            NightLightNewActivity nightLightNewActivity = NightLightNewActivity.this;
            nightLightNewActivity.m24713p0(nightLightNewActivity.f18705u);
            NightLightNewActivity.this.f18697m.setVisibility(0);
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.NightLightNewActivity$l */
    class C10142l implements View.OnClickListener {
        C10142l() {
        }

        public void onClick(View view) {
            if (NightLightNewActivity.this.f18694j.isChecked()) {
                int unused = NightLightNewActivity.this.f18705u = 0;
                NightLightNewActivity.this.f18694j.setChecked(false);
            } else {
                int unused2 = NightLightNewActivity.this.f18705u = 10;
                NightLightNewActivity.this.f18694j.setChecked(true);
            }
            NightLightNewActivity nightLightNewActivity = NightLightNewActivity.this;
            nightLightNewActivity.m24713p0(nightLightNewActivity.f18705u);
            NightLightNewActivity.this.f18697m.setVisibility(0);
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.NightLightNewActivity$m */
    class C10143m implements View.OnClickListener {
        C10143m() {
        }

        public void onClick(View view) {
            if (NightLightNewActivity.this.f18695k.isChecked()) {
                int unused = NightLightNewActivity.this.f18705u = 0;
                NightLightNewActivity.this.f18695k.setChecked(false);
            } else {
                int unused2 = NightLightNewActivity.this.f18705u = 15;
                NightLightNewActivity.this.f18695k.setChecked(true);
            }
            NightLightNewActivity nightLightNewActivity = NightLightNewActivity.this;
            nightLightNewActivity.m24713p0(nightLightNewActivity.f18705u);
            NightLightNewActivity.this.f18697m.setVisibility(0);
        }
    }

    /* renamed from: m0 */
    private C10526e m24710m0() {
        if (this.f18685A == null) {
            C10526e.C10531e eVar = new C10526e.C10531e(this);
            eVar.mo33358i(getString(R$string.common_text_change_without_save));
            eVar.mo33356g(getString(R$string.common_text_quit_without_save));
            eVar.mo33353d(-1, getString(R$string.common_text_ok), new C10133c());
            eVar.mo33353d(-2, getString(R$string.common_text_cancel), (DialogInterface.OnClickListener) null);
            this.f18685A = eVar.mo33351b();
        }
        return this.f18685A;
    }

    /* renamed from: n0 */
    private void m24711n0() {
        this.f18697m.setOnClickListener(new C10138h());
        this.f18691g.setOnClickListener(new C10139i());
        this.f18692h.setOnClickListener(new C10140j());
        this.f18693i.setOnClickListener(new C10141k());
        this.f18694j.setOnClickListener(new C10142l());
        this.f18695k.setOnClickListener(new C10143m());
        this.f18696l.setOnClickListener(new C10131a());
    }

    /* access modifiers changed from: private */
    /* renamed from: o0 */
    public void m24712o0() {
        StringBuilder sb;
        String str;
        "mStartTimeHour = " + this.f18701q + " , mStartTimeMinute = " + this.f18702r;
        "mEndTimeHour = " + this.f18703s + " , mEndTimeMinute = " + this.f18704t;
        "mDelayOffTime = " + this.f18705u;
        if (this.f18701q < 10) {
            sb = new StringBuilder();
            sb.append(TimerCodec.DISENABLE);
        } else {
            sb = new StringBuilder();
        }
        sb.append(String.valueOf(this.f18701q));
        sb.append("00000");
        String sb2 = sb.toString();
        if (this.f18703s < 10) {
            str = TimerCodec.DISENABLE + String.valueOf(this.f18703s) + "00000";
        } else {
            str = String.valueOf(this.f18703s) + "00000";
        }
        C4198d dVar = this.f18700p;
        if (dVar instanceof C7186q) {
            this.f18700p.mo23353x(11, new C7558h(this.f18706v, 0, this.f18701q, 0, this.f18703s, 0));
            this.f18700p.mo23353x(3, (Object) null);
        } else {
            ((C4200i) dVar).mo23431g1(this.f18706v, sb2, str, this.f18705u);
        }
        Toast.makeText(this, R$string.common_text_save_succeed, 0).show();
        finish();
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x02e6  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0311  */
    /* renamed from: p0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m24713p0(int r5) {
        /*
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "updateDelayOffTime = "
            r0.append(r1)
            r0.append(r5)
            r0.toString()
            android.widget.CheckedTextView r0 = r4.f18691g
            r1 = 0
            r0.setChecked(r1)
            android.widget.CheckedTextView r0 = r4.f18692h
            r0.setChecked(r1)
            android.widget.CheckedTextView r0 = r4.f18693i
            r0.setChecked(r1)
            android.widget.CheckedTextView r0 = r4.f18694j
            r0.setChecked(r1)
            android.widget.CheckedTextView r0 = r4.f18695k
            r0.setChecked(r1)
            android.widget.CheckedTextView r0 = r4.f18696l
            r0.setChecked(r1)
            r0 = 20
            r2 = 1
            if (r5 < r0) goto L_0x0097
            r4.f18705u = r0
            android.widget.CheckedTextView r5 = r4.f18691g
            android.content.res.Resources r0 = r4.getResources()
            int r3 = com.yeelight.yeelib.R$color.common_text_color_not_clickable_cc
            int r0 = r0.getColor(r3)
            r5.setTextColor(r0)
            android.widget.CheckedTextView r5 = r4.f18692h
            android.content.res.Resources r0 = r4.getResources()
            int r3 = com.yeelight.yeelib.R$color.common_text_color_not_clickable_cc
            int r0 = r0.getColor(r3)
            r5.setTextColor(r0)
            android.widget.CheckedTextView r5 = r4.f18693i
            android.content.res.Resources r0 = r4.getResources()
            int r3 = com.yeelight.yeelib.R$color.common_text_color_not_clickable_cc
            int r0 = r0.getColor(r3)
            r5.setTextColor(r0)
            android.widget.CheckedTextView r5 = r4.f18694j
            android.content.res.Resources r0 = r4.getResources()
            int r3 = com.yeelight.yeelib.R$color.common_text_color_not_clickable_cc
            int r0 = r0.getColor(r3)
            r5.setTextColor(r0)
            android.widget.CheckedTextView r5 = r4.f18695k
            android.content.res.Resources r0 = r4.getResources()
            int r3 = com.yeelight.yeelib.R$color.common_text_color_not_clickable_cc
            int r0 = r0.getColor(r3)
            r5.setTextColor(r0)
            android.widget.CheckedTextView r5 = r4.f18696l
            android.content.res.Resources r0 = r4.getResources()
            int r3 = com.yeelight.yeelib.R$color.white
            int r0 = r0.getColor(r3)
            r5.setTextColor(r0)
            android.widget.CheckedTextView r5 = r4.f18696l
        L_0x0092:
            r5.setChecked(r2)
            goto L_0x02e2
        L_0x0097:
            r0 = 15
            if (r5 < r0) goto L_0x00fa
            r4.f18705u = r0
            android.widget.CheckedTextView r5 = r4.f18691g
            android.content.res.Resources r0 = r4.getResources()
            int r3 = com.yeelight.yeelib.R$color.common_text_color_not_clickable_cc
            int r0 = r0.getColor(r3)
            r5.setTextColor(r0)
            android.widget.CheckedTextView r5 = r4.f18692h
            android.content.res.Resources r0 = r4.getResources()
            int r3 = com.yeelight.yeelib.R$color.common_text_color_not_clickable_cc
            int r0 = r0.getColor(r3)
            r5.setTextColor(r0)
            android.widget.CheckedTextView r5 = r4.f18693i
            android.content.res.Resources r0 = r4.getResources()
            int r3 = com.yeelight.yeelib.R$color.common_text_color_not_clickable_cc
            int r0 = r0.getColor(r3)
            r5.setTextColor(r0)
            android.widget.CheckedTextView r5 = r4.f18694j
            android.content.res.Resources r0 = r4.getResources()
            int r3 = com.yeelight.yeelib.R$color.common_text_color_not_clickable_cc
            int r0 = r0.getColor(r3)
            r5.setTextColor(r0)
            android.widget.CheckedTextView r5 = r4.f18695k
            android.content.res.Resources r0 = r4.getResources()
            int r3 = com.yeelight.yeelib.R$color.white
            int r0 = r0.getColor(r3)
            r5.setTextColor(r0)
            android.widget.CheckedTextView r5 = r4.f18696l
            android.content.res.Resources r0 = r4.getResources()
            int r3 = com.yeelight.yeelib.R$color.common_text_color_not_clickable_cc
            int r0 = r0.getColor(r3)
            r5.setTextColor(r0)
            android.widget.CheckedTextView r5 = r4.f18695k
            goto L_0x0092
        L_0x00fa:
            r0 = 10
            if (r5 < r0) goto L_0x015e
            r4.f18705u = r0
            android.widget.CheckedTextView r5 = r4.f18691g
            android.content.res.Resources r0 = r4.getResources()
            int r3 = com.yeelight.yeelib.R$color.common_text_color_not_clickable_cc
            int r0 = r0.getColor(r3)
            r5.setTextColor(r0)
            android.widget.CheckedTextView r5 = r4.f18692h
            android.content.res.Resources r0 = r4.getResources()
            int r3 = com.yeelight.yeelib.R$color.common_text_color_not_clickable_cc
            int r0 = r0.getColor(r3)
            r5.setTextColor(r0)
            android.widget.CheckedTextView r5 = r4.f18693i
            android.content.res.Resources r0 = r4.getResources()
            int r3 = com.yeelight.yeelib.R$color.common_text_color_not_clickable_cc
            int r0 = r0.getColor(r3)
            r5.setTextColor(r0)
            android.widget.CheckedTextView r5 = r4.f18694j
            android.content.res.Resources r0 = r4.getResources()
            int r3 = com.yeelight.yeelib.R$color.white
            int r0 = r0.getColor(r3)
            r5.setTextColor(r0)
            android.widget.CheckedTextView r5 = r4.f18695k
            android.content.res.Resources r0 = r4.getResources()
            int r3 = com.yeelight.yeelib.R$color.common_text_color_not_clickable_cc
            int r0 = r0.getColor(r3)
            r5.setTextColor(r0)
            android.widget.CheckedTextView r5 = r4.f18696l
            android.content.res.Resources r0 = r4.getResources()
            int r3 = com.yeelight.yeelib.R$color.common_text_color_not_clickable_cc
            int r0 = r0.getColor(r3)
            r5.setTextColor(r0)
            android.widget.CheckedTextView r5 = r4.f18694j
            goto L_0x0092
        L_0x015e:
            r0 = 5
            if (r5 < r0) goto L_0x01c1
            r4.f18705u = r0
            android.widget.CheckedTextView r5 = r4.f18691g
            android.content.res.Resources r0 = r4.getResources()
            int r3 = com.yeelight.yeelib.R$color.common_text_color_not_clickable_cc
            int r0 = r0.getColor(r3)
            r5.setTextColor(r0)
            android.widget.CheckedTextView r5 = r4.f18692h
            android.content.res.Resources r0 = r4.getResources()
            int r3 = com.yeelight.yeelib.R$color.common_text_color_not_clickable_cc
            int r0 = r0.getColor(r3)
            r5.setTextColor(r0)
            android.widget.CheckedTextView r5 = r4.f18693i
            android.content.res.Resources r0 = r4.getResources()
            int r3 = com.yeelight.yeelib.R$color.white
            int r0 = r0.getColor(r3)
            r5.setTextColor(r0)
            android.widget.CheckedTextView r5 = r4.f18694j
            android.content.res.Resources r0 = r4.getResources()
            int r3 = com.yeelight.yeelib.R$color.common_text_color_not_clickable_cc
            int r0 = r0.getColor(r3)
            r5.setTextColor(r0)
            android.widget.CheckedTextView r5 = r4.f18695k
            android.content.res.Resources r0 = r4.getResources()
            int r3 = com.yeelight.yeelib.R$color.common_text_color_not_clickable_cc
            int r0 = r0.getColor(r3)
            r5.setTextColor(r0)
            android.widget.CheckedTextView r5 = r4.f18696l
            android.content.res.Resources r0 = r4.getResources()
            int r3 = com.yeelight.yeelib.R$color.common_text_color_not_clickable_cc
            int r0 = r0.getColor(r3)
            r5.setTextColor(r0)
            android.widget.CheckedTextView r5 = r4.f18693i
            goto L_0x0092
        L_0x01c1:
            r0 = 3
            if (r5 < r0) goto L_0x0224
            r4.f18705u = r0
            android.widget.CheckedTextView r5 = r4.f18691g
            android.content.res.Resources r0 = r4.getResources()
            int r3 = com.yeelight.yeelib.R$color.common_text_color_not_clickable_cc
            int r0 = r0.getColor(r3)
            r5.setTextColor(r0)
            android.widget.CheckedTextView r5 = r4.f18692h
            android.content.res.Resources r0 = r4.getResources()
            int r3 = com.yeelight.yeelib.R$color.white
            int r0 = r0.getColor(r3)
            r5.setTextColor(r0)
            android.widget.CheckedTextView r5 = r4.f18693i
            android.content.res.Resources r0 = r4.getResources()
            int r3 = com.yeelight.yeelib.R$color.common_text_color_not_clickable_cc
            int r0 = r0.getColor(r3)
            r5.setTextColor(r0)
            android.widget.CheckedTextView r5 = r4.f18694j
            android.content.res.Resources r0 = r4.getResources()
            int r3 = com.yeelight.yeelib.R$color.common_text_color_not_clickable_cc
            int r0 = r0.getColor(r3)
            r5.setTextColor(r0)
            android.widget.CheckedTextView r5 = r4.f18695k
            android.content.res.Resources r0 = r4.getResources()
            int r3 = com.yeelight.yeelib.R$color.common_text_color_not_clickable_cc
            int r0 = r0.getColor(r3)
            r5.setTextColor(r0)
            android.widget.CheckedTextView r5 = r4.f18696l
            android.content.res.Resources r0 = r4.getResources()
            int r3 = com.yeelight.yeelib.R$color.common_text_color_not_clickable_cc
            int r0 = r0.getColor(r3)
            r5.setTextColor(r0)
            android.widget.CheckedTextView r5 = r4.f18692h
            goto L_0x0092
        L_0x0224:
            if (r5 < r2) goto L_0x0286
            r4.f18705u = r2
            android.widget.CheckedTextView r5 = r4.f18691g
            android.content.res.Resources r0 = r4.getResources()
            int r3 = com.yeelight.yeelib.R$color.white
            int r0 = r0.getColor(r3)
            r5.setTextColor(r0)
            android.widget.CheckedTextView r5 = r4.f18692h
            android.content.res.Resources r0 = r4.getResources()
            int r3 = com.yeelight.yeelib.R$color.common_text_color_not_clickable_cc
            int r0 = r0.getColor(r3)
            r5.setTextColor(r0)
            android.widget.CheckedTextView r5 = r4.f18693i
            android.content.res.Resources r0 = r4.getResources()
            int r3 = com.yeelight.yeelib.R$color.common_text_color_not_clickable_cc
            int r0 = r0.getColor(r3)
            r5.setTextColor(r0)
            android.widget.CheckedTextView r5 = r4.f18694j
            android.content.res.Resources r0 = r4.getResources()
            int r3 = com.yeelight.yeelib.R$color.common_text_color_not_clickable_cc
            int r0 = r0.getColor(r3)
            r5.setTextColor(r0)
            android.widget.CheckedTextView r5 = r4.f18695k
            android.content.res.Resources r0 = r4.getResources()
            int r3 = com.yeelight.yeelib.R$color.common_text_color_not_clickable_cc
            int r0 = r0.getColor(r3)
            r5.setTextColor(r0)
            android.widget.CheckedTextView r5 = r4.f18696l
            android.content.res.Resources r0 = r4.getResources()
            int r3 = com.yeelight.yeelib.R$color.common_text_color_not_clickable_cc
            int r0 = r0.getColor(r3)
            r5.setTextColor(r0)
            android.widget.CheckedTextView r5 = r4.f18691g
            goto L_0x0092
        L_0x0286:
            r4.f18705u = r1
            android.widget.CheckedTextView r5 = r4.f18691g
            android.content.res.Resources r0 = r4.getResources()
            int r3 = com.yeelight.yeelib.R$color.common_text_color_not_clickable_cc
            int r0 = r0.getColor(r3)
            r5.setTextColor(r0)
            android.widget.CheckedTextView r5 = r4.f18692h
            android.content.res.Resources r0 = r4.getResources()
            int r3 = com.yeelight.yeelib.R$color.common_text_color_not_clickable_cc
            int r0 = r0.getColor(r3)
            r5.setTextColor(r0)
            android.widget.CheckedTextView r5 = r4.f18693i
            android.content.res.Resources r0 = r4.getResources()
            int r3 = com.yeelight.yeelib.R$color.common_text_color_not_clickable_cc
            int r0 = r0.getColor(r3)
            r5.setTextColor(r0)
            android.widget.CheckedTextView r5 = r4.f18694j
            android.content.res.Resources r0 = r4.getResources()
            int r3 = com.yeelight.yeelib.R$color.common_text_color_not_clickable_cc
            int r0 = r0.getColor(r3)
            r5.setTextColor(r0)
            android.widget.CheckedTextView r5 = r4.f18695k
            android.content.res.Resources r0 = r4.getResources()
            int r3 = com.yeelight.yeelib.R$color.common_text_color_not_clickable_cc
            int r0 = r0.getColor(r3)
            r5.setTextColor(r0)
            android.widget.CheckedTextView r5 = r4.f18696l
            android.content.res.Resources r0 = r4.getResources()
            int r3 = com.yeelight.yeelib.R$color.common_text_color_not_clickable_cc
            int r0 = r0.getColor(r3)
            r5.setTextColor(r0)
        L_0x02e2:
            int r5 = r4.f18705u
            if (r5 <= 0) goto L_0x0311
            android.widget.TextView r5 = r4.f18690f
            android.content.res.Resources r0 = r4.getResources()
            int r3 = com.yeelight.yeelib.R$color.common_color_primary
            int r0 = r0.getColor(r3)
            r5.setTextColor(r0)
            java.util.Locale r5 = java.util.Locale.US
            int r0 = com.yeelight.yeelib.R$string.common_text_min_count
            java.lang.String r0 = r4.getString(r0)
            java.lang.Object[] r2 = new java.lang.Object[r2]
            int r3 = r4.f18705u
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r2[r1] = r3
            java.lang.String r5 = java.lang.String.format(r5, r0, r2)
            android.widget.TextView r0 = r4.f18690f
            r0.setText(r5)
            goto L_0x0327
        L_0x0311:
            android.widget.TextView r5 = r4.f18690f
            android.content.res.Resources r0 = r4.getResources()
            int r1 = com.yeelight.yeelib.R$color.common_text_color_not_clickable_cc
            int r0 = r0.getColor(r1)
            r5.setTextColor(r0)
            android.widget.TextView r5 = r4.f18690f
            int r0 = com.yeelight.yeelib.R$string.night_light_auto_delay_not_set
            r5.setText(r0)
        L_0x0327:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.p194ui.activity.NightLightNewActivity.m24713p0(int):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: q0 */
    public void m24714q0() {
        int i;
        ImageView imageView;
        if (this.f18706v) {
            imageView = this.f18687c;
            i = R$drawable.icon_yeelight_switch_point_on_new;
        } else {
            imageView = this.f18687c;
            i = R$drawable.icon_yeelight_switch_point_off_new;
        }
        imageView.setImageResource(i);
        this.f18687c.setOnClickListener(new C10132b());
    }

    public void onBackPressed() {
        if ((this.f18707w == this.f18706v && this.f18708x == this.f18701q && this.f18709y == this.f18703s && this.f18710z == this.f18705u) ? false : true) {
            m24710m0().show();
        } else {
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo32193P();
        C10547m.m25758h(true, this);
        setContentView(R$layout.activity_night_light_new);
        this.f18686b = (ImageView) findViewById(R$id.img_back_view);
        this.f18687c = (ImageView) findViewById(R$id.img_switch_view);
        this.f18688d = (WheelPicker) findViewById(R$id.minute_picker_start_view);
        this.f18689e = (WheelPicker) findViewById(R$id.minute_picker_end_view);
        this.f18690f = (TextView) findViewById(R$id.select_text_info);
        this.f18691g = (CheckedTextView) findViewById(R$id.delay_off_time_1);
        this.f18692h = (CheckedTextView) findViewById(R$id.delay_off_time_3);
        this.f18693i = (CheckedTextView) findViewById(R$id.delay_off_time_5);
        this.f18694j = (CheckedTextView) findViewById(R$id.delay_off_time_10);
        this.f18695k = (CheckedTextView) findViewById(R$id.delay_off_time_15);
        this.f18696l = (CheckedTextView) findViewById(R$id.delay_off_time_20);
        this.f18697m = (Button) findViewById(R$id.btn_complete);
        this.f18698n = (LinearLayout) findViewById(R$id.delay_time_layout);
        this.f18699o = (TextView) findViewById(R$id.night_light_desc);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        findViewById(R$id.title_view).setLayoutParams(layoutParams);
        layoutParams.setMargins(0, C10547m.m25755e(this), 0, 0);
        Intent intent = getIntent();
        if (!intent.hasExtra("com.yeelight.cherry.device_id")) {
            C4308b.m12141t(f18684B, "Activity has not device id", false);
            finish();
            return;
        }
        C4198d h0 = C4257w.m11945h0(intent.getStringExtra("com.yeelight.cherry.device_id"));
        this.f18700p = h0;
        if (h0 == null || !h0.mo23331k0()) {
            BaseActivity.m24384U(this);
            finish();
            return;
        }
        C4198d dVar = this.f18700p;
        if ((dVar instanceof C6006h) || (dVar instanceof C6067o)) {
            this.f18699o.setText(R$string.night_light_info);
            this.f18706v = this.f18700p.mo23408d0().mo27679b0();
            String D = this.f18700p.mo23408d0().mo27633D();
            String C = this.f18700p.mo23408d0().mo27631C();
            "start : " + D + " , end : " + C;
            if (D != null) {
                this.f18701q = Integer.valueOf(D.substring(0, 2)).intValue();
                this.f18702r = 0;
                "start : " + this.f18701q + " , end : " + this.f18702r;
            } else {
                this.f18701q = 23;
                this.f18702r = 0;
            }
            this.f18703s = C != null ? Integer.valueOf(C.substring(0, 2)).intValue() : 6;
            this.f18704t = 0;
            this.f18705u = this.f18700p.mo23408d0().mo27629B();
        } else {
            this.f18699o.setText(R$string.night_light_sub_info);
            C7558h hVar = (C7558h) this.f18700p.mo23408d0().mo27710r(3);
            if (hVar != null) {
                this.f18701q = hVar.mo28918a();
                this.f18703s = hVar.mo28920c();
                this.f18706v = hVar.mo28922e();
                this.f18705u = 0;
            } else {
                this.f18700p.mo23353x(3, (Object) null);
                this.f18705u = -1;
            }
            this.f18698n.setVisibility(4);
        }
        this.f18688d.setCurved(true);
        this.f18688d.setCyclic(true);
        this.f18689e.setCurved(true);
        this.f18689e.setCyclic(true);
        this.f18710z = this.f18705u;
        this.f18707w = this.f18706v;
        int i = this.f18701q;
        this.f18708x = i;
        this.f18709y = this.f18703s;
        this.f18688d.mo33217l(i, false);
        this.f18689e.mo33217l(this.f18703s, false);
        this.f18688d.setOnItemSelectedListener(new C10135e());
        this.f18689e.setOnItemSelectedListener(new C10136f());
        this.f18686b.setOnClickListener(new C10137g());
        m24711n0();
        m24714q0();
        m24713p0(this.f18705u);
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        this.f18700p.mo23400W0(this);
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        this.f18700p.mo23365B0(this);
    }

    public void onStatusChange(int i, C6024e eVar) {
        if (i == -1 || i == 4096) {
            this.f18687c.post(new C10134d());
        }
    }
}
