package com.yeelight.yeelib.p142ui.activity;

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
import com.yeelight.yeelib.device.WifiDeviceBase;
import com.yeelight.yeelib.device.base.C3010c;
import com.yeelight.yeelib.device.base.C3012e;
import com.yeelight.yeelib.device.base.DeviceStatusBase;
import com.yeelight.yeelib.managers.YeelightDeviceManager;
import com.yeelight.yeelib.p142ui.widget.WheelPicker;
import com.yeelight.yeelib.utils.AppUtils;
import p051j4.C9193k;
import p170i4.C9113d;
import p207s3.C10344f;
import p223w3.C11627r;
import p232y3.C12045h;
import p237z3.C12145e;

/* renamed from: com.yeelight.yeelib.ui.activity.NightLightNewActivity */
public class NightLightNewActivity extends BaseActivity implements C12145e {

    /* renamed from: A */
    private static final String f14992A = "NightLightNewActivity";

    /* renamed from: a */
    ImageView f14993a;

    /* renamed from: b */
    ImageView f14994b;

    /* renamed from: c */
    WheelPicker f14995c;

    /* renamed from: d */
    WheelPicker f14996d;

    /* renamed from: e */
    TextView f14997e;

    /* renamed from: f */
    CheckedTextView f14998f;

    /* renamed from: g */
    CheckedTextView f14999g;

    /* renamed from: h */
    CheckedTextView f15000h;

    /* renamed from: i */
    CheckedTextView f15001i;

    /* renamed from: j */
    CheckedTextView f15002j;

    /* renamed from: k */
    CheckedTextView f15003k;

    /* renamed from: l */
    Button f15004l;

    /* renamed from: m */
    LinearLayout f15005m;

    /* renamed from: n */
    TextView f15006n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public C3010c f15007o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public int f15008p;

    /* renamed from: q */
    private int f15009q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public int f15010r;

    /* renamed from: s */
    private int f15011s;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public int f15012t = -1;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public boolean f15013u = false;
    /* access modifiers changed from: private */

    /* renamed from: v */
    public boolean f15014v = false;
    /* access modifiers changed from: private */

    /* renamed from: w */
    public int f15015w = 23;
    /* access modifiers changed from: private */

    /* renamed from: x */
    public int f15016x = 6;
    /* access modifiers changed from: private */

    /* renamed from: y */
    public int f15017y = 0;

    /* renamed from: z */
    private C9113d f15018z;

    /* renamed from: com.yeelight.yeelib.ui.activity.NightLightNewActivity$a */
    class C8549a implements View.OnClickListener {
        C8549a() {
        }

        public void onClick(View view) {
            if (NightLightNewActivity.this.f15003k.isChecked()) {
                int unused = NightLightNewActivity.this.f15012t = 0;
                NightLightNewActivity.this.f15003k.setChecked(false);
            } else {
                int unused2 = NightLightNewActivity.this.f15012t = 20;
                NightLightNewActivity.this.f15003k.setChecked(true);
            }
            NightLightNewActivity nightLightNewActivity = NightLightNewActivity.this;
            nightLightNewActivity.m20320p0(nightLightNewActivity.f15012t);
            NightLightNewActivity.this.f15004l.setVisibility(0);
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.NightLightNewActivity$b */
    class C8550b implements View.OnClickListener {
        C8550b() {
        }

        public void onClick(View view) {
            ImageView imageView;
            int i;
            NightLightNewActivity nightLightNewActivity = NightLightNewActivity.this;
            boolean unused = nightLightNewActivity.f15013u = !nightLightNewActivity.f15013u;
            if (NightLightNewActivity.this.f15013u) {
                imageView = NightLightNewActivity.this.f14994b;
                i = R$drawable.icon_yeelight_switch_point_on_new;
            } else {
                imageView = NightLightNewActivity.this.f14994b;
                i = R$drawable.icon_yeelight_switch_point_off_new;
            }
            imageView.setImageResource(i);
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.NightLightNewActivity$c */
    class C8551c implements DialogInterface.OnClickListener {
        C8551c() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
            NightLightNewActivity.this.finish();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.NightLightNewActivity$d */
    class C8552d implements Runnable {
        C8552d() {
        }

        public void run() {
            C12045h hVar;
            NightLightNewActivity.this.m20321q0();
            if ((NightLightNewActivity.this.f15007o instanceof C11627r) && NightLightNewActivity.this.f15017y == -1 && (hVar = (C12045h) NightLightNewActivity.this.f15007o.mo23221d0().mo31611r(3)) != null) {
                int unused = NightLightNewActivity.this.f15008p = hVar.mo42717a();
                int unused2 = NightLightNewActivity.this.f15010r = hVar.mo42719c();
                boolean unused3 = NightLightNewActivity.this.f15013u = hVar.mo42721e();
                int unused4 = NightLightNewActivity.this.f15012t = 0;
                NightLightNewActivity nightLightNewActivity = NightLightNewActivity.this;
                nightLightNewActivity.f14995c.mo36586l(nightLightNewActivity.f15008p, false);
                NightLightNewActivity nightLightNewActivity2 = NightLightNewActivity.this;
                nightLightNewActivity2.f14996d.mo36586l(nightLightNewActivity2.f15010r, false);
                int unused5 = NightLightNewActivity.this.f15017y = 0;
                NightLightNewActivity nightLightNewActivity3 = NightLightNewActivity.this;
                int unused6 = nightLightNewActivity3.f15016x = nightLightNewActivity3.f15010r;
                NightLightNewActivity nightLightNewActivity4 = NightLightNewActivity.this;
                int unused7 = nightLightNewActivity4.f15015w = nightLightNewActivity4.f15008p;
                NightLightNewActivity nightLightNewActivity5 = NightLightNewActivity.this;
                boolean unused8 = nightLightNewActivity5.f15014v = nightLightNewActivity5.f15007o.mo23221d0().mo31582c0();
            }
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.NightLightNewActivity$e */
    class C8553e implements WheelPicker.C8878a {
        C8553e() {
        }

        /* renamed from: a */
        public void mo35700a(WheelPicker wheelPicker, Object obj, int i) {
            int unused = NightLightNewActivity.this.f15008p = i;
            NightLightNewActivity.this.f15004l.setVisibility(0);
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.NightLightNewActivity$f */
    class C8554f implements WheelPicker.C8878a {
        C8554f() {
        }

        /* renamed from: a */
        public void mo35700a(WheelPicker wheelPicker, Object obj, int i) {
            int unused = NightLightNewActivity.this.f15010r = i;
            NightLightNewActivity.this.f15004l.setVisibility(0);
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.NightLightNewActivity$g */
    class C8555g implements View.OnClickListener {
        C8555g() {
        }

        public void onClick(View view) {
            NightLightNewActivity.this.onBackPressed();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.NightLightNewActivity$h */
    class C8556h implements View.OnClickListener {
        C8556h() {
        }

        public void onClick(View view) {
            NightLightNewActivity.this.m20319o0();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.NightLightNewActivity$i */
    class C8557i implements View.OnClickListener {
        C8557i() {
        }

        public void onClick(View view) {
            if (NightLightNewActivity.this.f14998f.isChecked()) {
                int unused = NightLightNewActivity.this.f15012t = 0;
                NightLightNewActivity.this.f14998f.setChecked(false);
            } else {
                int unused2 = NightLightNewActivity.this.f15012t = 1;
                NightLightNewActivity.this.f14998f.setChecked(true);
            }
            NightLightNewActivity nightLightNewActivity = NightLightNewActivity.this;
            nightLightNewActivity.m20320p0(nightLightNewActivity.f15012t);
            NightLightNewActivity.this.f15004l.setVisibility(0);
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.NightLightNewActivity$j */
    class C8558j implements View.OnClickListener {
        C8558j() {
        }

        public void onClick(View view) {
            if (NightLightNewActivity.this.f14999g.isChecked()) {
                int unused = NightLightNewActivity.this.f15012t = 0;
                NightLightNewActivity.this.f14999g.setChecked(false);
            } else {
                int unused2 = NightLightNewActivity.this.f15012t = 3;
                NightLightNewActivity.this.f14999g.setChecked(true);
            }
            NightLightNewActivity nightLightNewActivity = NightLightNewActivity.this;
            nightLightNewActivity.m20320p0(nightLightNewActivity.f15012t);
            NightLightNewActivity.this.f15004l.setVisibility(0);
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.NightLightNewActivity$k */
    class C8559k implements View.OnClickListener {
        C8559k() {
        }

        public void onClick(View view) {
            if (NightLightNewActivity.this.f15000h.isChecked()) {
                int unused = NightLightNewActivity.this.f15012t = 0;
                NightLightNewActivity.this.f15000h.setChecked(false);
            } else {
                int unused2 = NightLightNewActivity.this.f15012t = 5;
                NightLightNewActivity.this.f15000h.setChecked(true);
            }
            NightLightNewActivity nightLightNewActivity = NightLightNewActivity.this;
            nightLightNewActivity.m20320p0(nightLightNewActivity.f15012t);
            NightLightNewActivity.this.f15004l.setVisibility(0);
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.NightLightNewActivity$l */
    class C8560l implements View.OnClickListener {
        C8560l() {
        }

        public void onClick(View view) {
            if (NightLightNewActivity.this.f15001i.isChecked()) {
                int unused = NightLightNewActivity.this.f15012t = 0;
                NightLightNewActivity.this.f15001i.setChecked(false);
            } else {
                int unused2 = NightLightNewActivity.this.f15012t = 10;
                NightLightNewActivity.this.f15001i.setChecked(true);
            }
            NightLightNewActivity nightLightNewActivity = NightLightNewActivity.this;
            nightLightNewActivity.m20320p0(nightLightNewActivity.f15012t);
            NightLightNewActivity.this.f15004l.setVisibility(0);
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.NightLightNewActivity$m */
    class C8561m implements View.OnClickListener {
        C8561m() {
        }

        public void onClick(View view) {
            if (NightLightNewActivity.this.f15002j.isChecked()) {
                int unused = NightLightNewActivity.this.f15012t = 0;
                NightLightNewActivity.this.f15002j.setChecked(false);
            } else {
                int unused2 = NightLightNewActivity.this.f15012t = 15;
                NightLightNewActivity.this.f15002j.setChecked(true);
            }
            NightLightNewActivity nightLightNewActivity = NightLightNewActivity.this;
            nightLightNewActivity.m20320p0(nightLightNewActivity.f15012t);
            NightLightNewActivity.this.f15004l.setVisibility(0);
        }
    }

    /* renamed from: m0 */
    private C9113d m20317m0() {
        if (this.f15018z == null) {
            C9113d.C9118e eVar = new C9113d.C9118e(this);
            eVar.mo37179i(getString(R$string.common_text_change_without_save));
            eVar.mo37177g(getString(R$string.common_text_quit_without_save));
            eVar.mo37174d(-1, getString(R$string.common_text_ok), new C8551c()).mo37174d(-2, getString(R$string.common_text_cancel), (DialogInterface.OnClickListener) null);
            this.f15018z = eVar.mo37172b();
        }
        return this.f15018z;
    }

    /* renamed from: n0 */
    private void m20318n0() {
        this.f15004l.setOnClickListener(new C8556h());
        this.f14998f.setOnClickListener(new C8557i());
        this.f14999g.setOnClickListener(new C8558j());
        this.f15000h.setOnClickListener(new C8559k());
        this.f15001i.setOnClickListener(new C8560l());
        this.f15002j.setOnClickListener(new C8561m());
        this.f15003k.setOnClickListener(new C8549a());
    }

    /* access modifiers changed from: private */
    /* renamed from: o0 */
    public void m20319o0() {
        StringBuilder sb;
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("mStartTimeHour = ");
        sb2.append(this.f15008p);
        sb2.append(" , mStartTimeMinute = ");
        sb2.append(this.f15009q);
        StringBuilder sb3 = new StringBuilder();
        sb3.append("mEndTimeHour = ");
        sb3.append(this.f15010r);
        sb3.append(" , mEndTimeMinute = ");
        sb3.append(this.f15011s);
        StringBuilder sb4 = new StringBuilder();
        sb4.append("mDelayOffTime = ");
        sb4.append(this.f15012t);
        if (this.f15008p < 10) {
            sb = new StringBuilder();
            sb.append(TimerCodec.DISENABLE);
        } else {
            sb = new StringBuilder();
        }
        sb.append(String.valueOf(this.f15008p));
        sb.append("00000");
        String sb5 = sb.toString();
        if (this.f15010r < 10) {
            str = TimerCodec.DISENABLE + String.valueOf(this.f15010r) + "00000";
        } else {
            str = String.valueOf(this.f15010r) + "00000";
        }
        C3010c cVar = this.f15007o;
        if (cVar instanceof C11627r) {
            this.f15007o.mo23166x(11, new C12045h(this.f15013u, 0, this.f15008p, 0, this.f15010r, 0));
            this.f15007o.mo23166x(3, (Object) null);
        } else {
            ((C3012e) cVar).mo23245g1(this.f15013u, sb5, str, this.f15012t);
        }
        Toast.makeText(this, R$string.common_text_save_succeed, 0).show();
        finish();
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x02a9  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x02d4  */
    /* renamed from: p0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m20320p0(int r6) {
        /*
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "updateDelayOffTime = "
            r0.append(r1)
            r0.append(r6)
            android.widget.CheckedTextView r0 = r5.f14998f
            r1 = 0
            r0.setChecked(r1)
            android.widget.CheckedTextView r0 = r5.f14999g
            r0.setChecked(r1)
            android.widget.CheckedTextView r0 = r5.f15000h
            r0.setChecked(r1)
            android.widget.CheckedTextView r0 = r5.f15001i
            r0.setChecked(r1)
            android.widget.CheckedTextView r0 = r5.f15002j
            r0.setChecked(r1)
            android.widget.CheckedTextView r0 = r5.f15003k
            r0.setChecked(r1)
            r0 = 20
            r2 = 1
            if (r6 < r0) goto L_0x008c
            r5.f15012t = r0
            android.widget.CheckedTextView r6 = r5.f14998f
            android.content.res.Resources r0 = r5.getResources()
            int r3 = com.yeelight.yeelib.R$color.common_text_color_not_clickable_cc
            int r0 = r0.getColor(r3)
            r6.setTextColor(r0)
            android.widget.CheckedTextView r6 = r5.f14999g
            android.content.res.Resources r0 = r5.getResources()
            int r0 = r0.getColor(r3)
            r6.setTextColor(r0)
            android.widget.CheckedTextView r6 = r5.f15000h
            android.content.res.Resources r0 = r5.getResources()
            int r0 = r0.getColor(r3)
            r6.setTextColor(r0)
            android.widget.CheckedTextView r6 = r5.f15001i
            android.content.res.Resources r0 = r5.getResources()
            int r0 = r0.getColor(r3)
            r6.setTextColor(r0)
            android.widget.CheckedTextView r6 = r5.f15002j
            android.content.res.Resources r0 = r5.getResources()
            int r0 = r0.getColor(r3)
            r6.setTextColor(r0)
            android.widget.CheckedTextView r6 = r5.f15003k
            android.content.res.Resources r0 = r5.getResources()
            int r3 = com.yeelight.yeelib.R$color.white
            int r0 = r0.getColor(r3)
            r6.setTextColor(r0)
            android.widget.CheckedTextView r6 = r5.f15003k
        L_0x0087:
            r6.setChecked(r2)
            goto L_0x02a5
        L_0x008c:
            r0 = 15
            if (r6 < r0) goto L_0x00e7
            r5.f15012t = r0
            android.widget.CheckedTextView r6 = r5.f14998f
            android.content.res.Resources r0 = r5.getResources()
            int r3 = com.yeelight.yeelib.R$color.common_text_color_not_clickable_cc
            int r0 = r0.getColor(r3)
            r6.setTextColor(r0)
            android.widget.CheckedTextView r6 = r5.f14999g
            android.content.res.Resources r0 = r5.getResources()
            int r0 = r0.getColor(r3)
            r6.setTextColor(r0)
            android.widget.CheckedTextView r6 = r5.f15000h
            android.content.res.Resources r0 = r5.getResources()
            int r0 = r0.getColor(r3)
            r6.setTextColor(r0)
            android.widget.CheckedTextView r6 = r5.f15001i
            android.content.res.Resources r0 = r5.getResources()
            int r0 = r0.getColor(r3)
            r6.setTextColor(r0)
            android.widget.CheckedTextView r6 = r5.f15002j
            android.content.res.Resources r0 = r5.getResources()
            int r4 = com.yeelight.yeelib.R$color.white
            int r0 = r0.getColor(r4)
            r6.setTextColor(r0)
            android.widget.CheckedTextView r6 = r5.f15003k
            android.content.res.Resources r0 = r5.getResources()
            int r0 = r0.getColor(r3)
            r6.setTextColor(r0)
            android.widget.CheckedTextView r6 = r5.f15002j
            goto L_0x0087
        L_0x00e7:
            r0 = 10
            if (r6 < r0) goto L_0x0143
            r5.f15012t = r0
            android.widget.CheckedTextView r6 = r5.f14998f
            android.content.res.Resources r0 = r5.getResources()
            int r3 = com.yeelight.yeelib.R$color.common_text_color_not_clickable_cc
            int r0 = r0.getColor(r3)
            r6.setTextColor(r0)
            android.widget.CheckedTextView r6 = r5.f14999g
            android.content.res.Resources r0 = r5.getResources()
            int r0 = r0.getColor(r3)
            r6.setTextColor(r0)
            android.widget.CheckedTextView r6 = r5.f15000h
            android.content.res.Resources r0 = r5.getResources()
            int r0 = r0.getColor(r3)
            r6.setTextColor(r0)
            android.widget.CheckedTextView r6 = r5.f15001i
            android.content.res.Resources r0 = r5.getResources()
            int r4 = com.yeelight.yeelib.R$color.white
            int r0 = r0.getColor(r4)
            r6.setTextColor(r0)
            android.widget.CheckedTextView r6 = r5.f15002j
            android.content.res.Resources r0 = r5.getResources()
            int r0 = r0.getColor(r3)
            r6.setTextColor(r0)
            android.widget.CheckedTextView r6 = r5.f15003k
            android.content.res.Resources r0 = r5.getResources()
            int r0 = r0.getColor(r3)
            r6.setTextColor(r0)
            android.widget.CheckedTextView r6 = r5.f15001i
            goto L_0x0087
        L_0x0143:
            r0 = 5
            if (r6 < r0) goto L_0x019e
            r5.f15012t = r0
            android.widget.CheckedTextView r6 = r5.f14998f
            android.content.res.Resources r0 = r5.getResources()
            int r3 = com.yeelight.yeelib.R$color.common_text_color_not_clickable_cc
            int r0 = r0.getColor(r3)
            r6.setTextColor(r0)
            android.widget.CheckedTextView r6 = r5.f14999g
            android.content.res.Resources r0 = r5.getResources()
            int r0 = r0.getColor(r3)
            r6.setTextColor(r0)
            android.widget.CheckedTextView r6 = r5.f15000h
            android.content.res.Resources r0 = r5.getResources()
            int r4 = com.yeelight.yeelib.R$color.white
            int r0 = r0.getColor(r4)
            r6.setTextColor(r0)
            android.widget.CheckedTextView r6 = r5.f15001i
            android.content.res.Resources r0 = r5.getResources()
            int r0 = r0.getColor(r3)
            r6.setTextColor(r0)
            android.widget.CheckedTextView r6 = r5.f15002j
            android.content.res.Resources r0 = r5.getResources()
            int r0 = r0.getColor(r3)
            r6.setTextColor(r0)
            android.widget.CheckedTextView r6 = r5.f15003k
            android.content.res.Resources r0 = r5.getResources()
            int r0 = r0.getColor(r3)
            r6.setTextColor(r0)
            android.widget.CheckedTextView r6 = r5.f15000h
            goto L_0x0087
        L_0x019e:
            r0 = 3
            if (r6 < r0) goto L_0x01f9
            r5.f15012t = r0
            android.widget.CheckedTextView r6 = r5.f14998f
            android.content.res.Resources r0 = r5.getResources()
            int r3 = com.yeelight.yeelib.R$color.common_text_color_not_clickable_cc
            int r0 = r0.getColor(r3)
            r6.setTextColor(r0)
            android.widget.CheckedTextView r6 = r5.f14999g
            android.content.res.Resources r0 = r5.getResources()
            int r4 = com.yeelight.yeelib.R$color.white
            int r0 = r0.getColor(r4)
            r6.setTextColor(r0)
            android.widget.CheckedTextView r6 = r5.f15000h
            android.content.res.Resources r0 = r5.getResources()
            int r0 = r0.getColor(r3)
            r6.setTextColor(r0)
            android.widget.CheckedTextView r6 = r5.f15001i
            android.content.res.Resources r0 = r5.getResources()
            int r0 = r0.getColor(r3)
            r6.setTextColor(r0)
            android.widget.CheckedTextView r6 = r5.f15002j
            android.content.res.Resources r0 = r5.getResources()
            int r0 = r0.getColor(r3)
            r6.setTextColor(r0)
            android.widget.CheckedTextView r6 = r5.f15003k
            android.content.res.Resources r0 = r5.getResources()
            int r0 = r0.getColor(r3)
            r6.setTextColor(r0)
            android.widget.CheckedTextView r6 = r5.f14999g
            goto L_0x0087
        L_0x01f9:
            if (r6 < r2) goto L_0x0253
            r5.f15012t = r2
            android.widget.CheckedTextView r6 = r5.f14998f
            android.content.res.Resources r0 = r5.getResources()
            int r3 = com.yeelight.yeelib.R$color.white
            int r0 = r0.getColor(r3)
            r6.setTextColor(r0)
            android.widget.CheckedTextView r6 = r5.f14999g
            android.content.res.Resources r0 = r5.getResources()
            int r3 = com.yeelight.yeelib.R$color.common_text_color_not_clickable_cc
            int r0 = r0.getColor(r3)
            r6.setTextColor(r0)
            android.widget.CheckedTextView r6 = r5.f15000h
            android.content.res.Resources r0 = r5.getResources()
            int r0 = r0.getColor(r3)
            r6.setTextColor(r0)
            android.widget.CheckedTextView r6 = r5.f15001i
            android.content.res.Resources r0 = r5.getResources()
            int r0 = r0.getColor(r3)
            r6.setTextColor(r0)
            android.widget.CheckedTextView r6 = r5.f15002j
            android.content.res.Resources r0 = r5.getResources()
            int r0 = r0.getColor(r3)
            r6.setTextColor(r0)
            android.widget.CheckedTextView r6 = r5.f15003k
            android.content.res.Resources r0 = r5.getResources()
            int r0 = r0.getColor(r3)
            r6.setTextColor(r0)
            android.widget.CheckedTextView r6 = r5.f14998f
            goto L_0x0087
        L_0x0253:
            r5.f15012t = r1
            android.widget.CheckedTextView r6 = r5.f14998f
            android.content.res.Resources r0 = r5.getResources()
            int r3 = com.yeelight.yeelib.R$color.common_text_color_not_clickable_cc
            int r0 = r0.getColor(r3)
            r6.setTextColor(r0)
            android.widget.CheckedTextView r6 = r5.f14999g
            android.content.res.Resources r0 = r5.getResources()
            int r0 = r0.getColor(r3)
            r6.setTextColor(r0)
            android.widget.CheckedTextView r6 = r5.f15000h
            android.content.res.Resources r0 = r5.getResources()
            int r0 = r0.getColor(r3)
            r6.setTextColor(r0)
            android.widget.CheckedTextView r6 = r5.f15001i
            android.content.res.Resources r0 = r5.getResources()
            int r0 = r0.getColor(r3)
            r6.setTextColor(r0)
            android.widget.CheckedTextView r6 = r5.f15002j
            android.content.res.Resources r0 = r5.getResources()
            int r0 = r0.getColor(r3)
            r6.setTextColor(r0)
            android.widget.CheckedTextView r6 = r5.f15003k
            android.content.res.Resources r0 = r5.getResources()
            int r0 = r0.getColor(r3)
            r6.setTextColor(r0)
        L_0x02a5:
            int r6 = r5.f15012t
            if (r6 <= 0) goto L_0x02d4
            android.widget.TextView r6 = r5.f14997e
            android.content.res.Resources r0 = r5.getResources()
            int r3 = com.yeelight.yeelib.R$color.common_color_primary
            int r0 = r0.getColor(r3)
            r6.setTextColor(r0)
            java.util.Locale r6 = java.util.Locale.US
            int r0 = com.yeelight.yeelib.R$string.common_text_min_count
            java.lang.String r0 = r5.getString(r0)
            java.lang.Object[] r2 = new java.lang.Object[r2]
            int r3 = r5.f15012t
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r2[r1] = r3
            java.lang.String r6 = java.lang.String.format(r6, r0, r2)
            android.widget.TextView r0 = r5.f14997e
            r0.setText(r6)
            goto L_0x02ea
        L_0x02d4:
            android.widget.TextView r6 = r5.f14997e
            android.content.res.Resources r0 = r5.getResources()
            int r1 = com.yeelight.yeelib.R$color.common_text_color_not_clickable_cc
            int r0 = r0.getColor(r1)
            r6.setTextColor(r0)
            android.widget.TextView r6 = r5.f14997e
            int r0 = com.yeelight.yeelib.R$string.night_light_auto_delay_not_set
            r6.setText(r0)
        L_0x02ea:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.p142ui.activity.NightLightNewActivity.m20320p0(int):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: q0 */
    public void m20321q0() {
        int i;
        ImageView imageView;
        if (this.f15013u) {
            imageView = this.f14994b;
            i = R$drawable.icon_yeelight_switch_point_on_new;
        } else {
            imageView = this.f14994b;
            i = R$drawable.icon_yeelight_switch_point_off_new;
        }
        imageView.setImageResource(i);
        this.f14994b.setOnClickListener(new C8550b());
    }

    public void onBackPressed() {
        if ((this.f15014v == this.f15013u && this.f15015w == this.f15008p && this.f15016x == this.f15010r && this.f15017y == this.f15012t) ? false : true) {
            m20317m0().show();
        } else {
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo35653P();
        C9193k.m22157h(true, this);
        setContentView(R$layout.activity_night_light_new);
        this.f14993a = (ImageView) findViewById(R$id.img_back_view);
        this.f14994b = (ImageView) findViewById(R$id.img_switch_view);
        this.f14995c = (WheelPicker) findViewById(R$id.minute_picker_start_view);
        this.f14996d = (WheelPicker) findViewById(R$id.minute_picker_end_view);
        this.f14997e = (TextView) findViewById(R$id.select_text_info);
        this.f14998f = (CheckedTextView) findViewById(R$id.delay_off_time_1);
        this.f14999g = (CheckedTextView) findViewById(R$id.delay_off_time_3);
        this.f15000h = (CheckedTextView) findViewById(R$id.delay_off_time_5);
        this.f15001i = (CheckedTextView) findViewById(R$id.delay_off_time_10);
        this.f15002j = (CheckedTextView) findViewById(R$id.delay_off_time_15);
        this.f15003k = (CheckedTextView) findViewById(R$id.delay_off_time_20);
        this.f15004l = (Button) findViewById(R$id.btn_complete);
        this.f15005m = (LinearLayout) findViewById(R$id.delay_time_layout);
        this.f15006n = (TextView) findViewById(R$id.night_light_desc);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        findViewById(R$id.title_view).setLayoutParams(layoutParams);
        layoutParams.setMargins(0, C9193k.m22154e(this), 0, 0);
        Intent intent = getIntent();
        if (!intent.hasExtra("com.yeelight.cherry.device_id")) {
            AppUtils.m8302w(f14992A, "Activity has not device id", false);
            finish();
            return;
        }
        C3010c j0 = YeelightDeviceManager.m7794j0(intent.getStringExtra("com.yeelight.cherry.device_id"));
        this.f15007o = j0;
        if (j0 == null || !j0.mo23145k0()) {
            BaseActivity.m19947U(this);
            finish();
            return;
        }
        C3010c cVar = this.f15007o;
        if ((cVar instanceof WifiDeviceBase) || (cVar instanceof C10344f)) {
            this.f15006n.setText(R$string.night_light_info);
            this.f15013u = this.f15007o.mo23221d0().mo31582c0();
            String E = this.f15007o.mo23221d0().mo31534E();
            String D = this.f15007o.mo23221d0().mo31532D();
            StringBuilder sb = new StringBuilder();
            sb.append("start : ");
            sb.append(E);
            sb.append(" , end : ");
            sb.append(D);
            if (E != null) {
                this.f15008p = Integer.valueOf(E.substring(0, 2)).intValue();
                this.f15009q = 0;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("start : ");
                sb2.append(this.f15008p);
                sb2.append(" , end : ");
                sb2.append(this.f15009q);
            } else {
                this.f15008p = 23;
                this.f15009q = 0;
            }
            this.f15010r = D != null ? Integer.valueOf(D.substring(0, 2)).intValue() : 6;
            this.f15011s = 0;
            this.f15012t = this.f15007o.mo23221d0().mo31530C();
        } else {
            this.f15006n.setText(R$string.night_light_sub_info);
            C12045h hVar = (C12045h) this.f15007o.mo23221d0().mo31611r(3);
            if (hVar != null) {
                this.f15008p = hVar.mo42717a();
                this.f15010r = hVar.mo42719c();
                this.f15013u = hVar.mo42721e();
                this.f15012t = 0;
            } else {
                this.f15007o.mo23166x(3, (Object) null);
                this.f15012t = -1;
            }
            this.f15005m.setVisibility(4);
        }
        this.f14995c.setCurved(true);
        this.f14995c.setCyclic(true);
        this.f14996d.setCurved(true);
        this.f14996d.setCyclic(true);
        this.f15017y = this.f15012t;
        this.f15014v = this.f15013u;
        int i = this.f15008p;
        this.f15015w = i;
        this.f15016x = this.f15010r;
        this.f14995c.mo36586l(i, false);
        this.f14996d.mo36586l(this.f15010r, false);
        this.f14995c.setOnItemSelectedListener(new C8553e());
        this.f14996d.setOnItemSelectedListener(new C8554f());
        this.f14993a.setOnClickListener(new C8555g());
        m20318n0();
        m20321q0();
        m20320p0(this.f15012t);
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        this.f15007o.mo23213W0(this);
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        this.f15007o.mo23178B0(this);
    }

    public void onStatusChange(int i, DeviceStatusBase deviceStatusBase) {
        if (i == -1 || i == 4096) {
            this.f14994b.post(new C8552d());
        }
    }
}
