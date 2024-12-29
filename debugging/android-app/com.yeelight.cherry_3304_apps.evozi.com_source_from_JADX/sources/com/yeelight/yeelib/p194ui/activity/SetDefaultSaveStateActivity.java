package com.yeelight.yeelib.p194ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.yeelight.yeelib.R$color;
import com.yeelight.yeelib.R$drawable;
import com.yeelight.yeelib.R$id;
import com.yeelight.yeelib.R$layout;
import com.yeelight.yeelib.R$string;
import com.yeelight.yeelib.p150c.C6006h;
import com.yeelight.yeelib.p150c.p151i.C6017a;
import com.yeelight.yeelib.p150c.p151i.C6024e;
import com.yeelight.yeelib.p152f.C4257w;
import com.yeelight.yeelib.p186e.C9770e;
import com.yeelight.yeelib.p194ui.view.CommonTitleBar;
import com.yeelight.yeelib.utils.C10547m;
import com.yeelight.yeelib.utils.C4308b;

/* renamed from: com.yeelight.yeelib.ui.activity.SetDefaultSaveStateActivity */
public class SetDefaultSaveStateActivity extends BaseActivity implements C9770e {

    /* renamed from: k */
    private static final String f18890k = SetDefaultSaveStateActivity.class.getSimpleName();

    /* renamed from: b */
    CommonTitleBar f18891b;

    /* renamed from: c */
    ImageView f18892c;

    /* renamed from: d */
    LinearLayout f18893d;

    /* renamed from: e */
    LinearLayout f18894e;

    /* renamed from: f */
    LinearLayout f18895f;

    /* renamed from: g */
    TextView f18896g;

    /* renamed from: h */
    LinearLayout f18897h;

    /* renamed from: i */
    ImageView f18898i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public C6006h f18899j;

    /* renamed from: com.yeelight.yeelib.ui.activity.SetDefaultSaveStateActivity$a */
    class C10210a implements View.OnClickListener {
        C10210a() {
        }

        public void onClick(View view) {
            SetDefaultSaveStateActivity.this.onBackPressed();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.SetDefaultSaveStateActivity$b */
    class C10211b implements View.OnClickListener {
        C10211b() {
        }

        public void onClick(View view) {
            SetDefaultSaveStateActivity.this.f18899j.mo27573S1(!SetDefaultSaveStateActivity.this.f18899j.mo23408d0().mo27683d0());
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.SetDefaultSaveStateActivity$c */
    class C10212c implements View.OnClickListener {
        C10212c() {
        }

        public void onClick(View view) {
            int H = SetDefaultSaveStateActivity.this.f18899j.mo23408d0().mo27641H();
            C6006h V = SetDefaultSaveStateActivity.this.f18899j;
            int i = 1;
            if (H == 1) {
                i = 2;
            }
            V.mo27572R1(i);
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.SetDefaultSaveStateActivity$d */
    class C10213d implements Runnable {

        /* renamed from: com.yeelight.yeelib.ui.activity.SetDefaultSaveStateActivity$d$a */
        class C10214a implements View.OnClickListener {
            C10214a() {
            }

            public void onClick(View view) {
                Class<?> cls;
                try {
                    cls = Class.forName(SetDefaultSaveStateActivity.this.f18899j instanceof C6017a ? "com.yeelight.cherry.ui.activity.ComboDeviceControlActivity" : "com.yeelight.cherry.ui.activity.DemoControlViewActivity");
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                    cls = null;
                }
                if (cls != null) {
                    Intent intent = new Intent();
                    intent.setClass(SetDefaultSaveStateActivity.this, cls);
                    intent.putExtra("com.yeelight.cherry.device_id", SetDefaultSaveStateActivity.this.f18899j.mo23372G());
                    intent.putExtra("set_device_default", true);
                    SetDefaultSaveStateActivity.this.startActivityForResult(intent, 100);
                }
            }
        }

        C10213d() {
        }

        public void run() {
            C10214a aVar;
            LinearLayout linearLayout;
            int i;
            ImageView imageView;
            if (SetDefaultSaveStateActivity.this.f18899j.mo23408d0().mo27683d0()) {
                SetDefaultSaveStateActivity.this.f18892c.setImageResource(R$drawable.icon_yeelight_switch_point_on_new);
                SetDefaultSaveStateActivity setDefaultSaveStateActivity = SetDefaultSaveStateActivity.this;
                setDefaultSaveStateActivity.f18896g.setTextColor(setDefaultSaveStateActivity.getResources().getColor(R$color.common_text_color_not_clickable_cc));
                linearLayout = SetDefaultSaveStateActivity.this.f18895f;
                aVar = null;
            } else {
                SetDefaultSaveStateActivity.this.f18892c.setImageResource(R$drawable.icon_yeelight_switch_point_off_new);
                SetDefaultSaveStateActivity setDefaultSaveStateActivity2 = SetDefaultSaveStateActivity.this;
                setDefaultSaveStateActivity2.f18896g.setTextColor(setDefaultSaveStateActivity2.getResources().getColor(R$color.common_text_color_primary_33));
                linearLayout = SetDefaultSaveStateActivity.this.f18895f;
                aVar = new C10214a();
            }
            linearLayout.setOnClickListener(aVar);
            if (SetDefaultSaveStateActivity.this.f18899j.mo23415n0(30)) {
                if (SetDefaultSaveStateActivity.this.f18899j.mo23408d0().mo27641H() == 1) {
                    imageView = SetDefaultSaveStateActivity.this.f18898i;
                    i = R$drawable.icon_yeelight_switch_point_on_new;
                } else {
                    imageView = SetDefaultSaveStateActivity.this.f18898i;
                    i = R$drawable.icon_yeelight_switch_point_off_new;
                }
                imageView.setImageResource(i);
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0044, code lost:
        if (android.text.TextUtils.equals(r0.mo23395T(), "yeelink.light.ceiling20") != false) goto L_0x0060;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x009b, code lost:
        if (r0.equals("yeelink.light.ceiling5") != false) goto L_0x009f;
     */
    /* renamed from: W */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m24789W() {
        /*
            r9 = this;
            com.yeelight.yeelib.c.h r0 = r9.f18899j
            r1 = 30
            boolean r0 = r0.mo23415n0(r1)
            r1 = 8
            r2 = 0
            if (r0 != 0) goto L_0x004c
            android.widget.LinearLayout r0 = r9.f18897h
            r0.setVisibility(r1)
            com.yeelight.yeelib.c.h r0 = r9.f18899j
            boolean r3 = r0 instanceof com.yeelight.yeelib.p150c.p183m.C6895j0
            if (r3 == 0) goto L_0x0024
            java.lang.String r0 = r0.mo23395T()
            java.lang.String r3 = "yeelink.light.lamp4"
            boolean r0 = android.text.TextUtils.equals(r0, r3)
            if (r0 == 0) goto L_0x0046
        L_0x0024:
            com.yeelight.yeelib.c.h r0 = r9.f18899j
            boolean r3 = r0 instanceof com.yeelight.yeelib.p150c.p183m.C6754h1
            if (r3 != 0) goto L_0x0046
            boolean r3 = r0 instanceof com.yeelight.yeelib.p150c.p183m.C6545f1
            if (r3 != 0) goto L_0x0046
            boolean r3 = r0 instanceof com.yeelight.yeelib.p150c.p183m.C7101o
            if (r3 != 0) goto L_0x0046
            boolean r3 = r0 instanceof com.yeelight.yeelib.p150c.p183m.C6867j
            if (r3 != 0) goto L_0x0046
            boolean r3 = r0 instanceof com.yeelight.yeelib.p150c.p183m.C6937k
            if (r3 == 0) goto L_0x0060
            java.lang.String r0 = r0.mo23395T()
            java.lang.String r3 = "yeelink.light.ceiling20"
            boolean r0 = android.text.TextUtils.equals(r0, r3)
            if (r0 != 0) goto L_0x0060
        L_0x0046:
            android.widget.LinearLayout r0 = r9.f18894e
            r0.setVisibility(r1)
            goto L_0x0060
        L_0x004c:
            android.widget.LinearLayout r0 = r9.f18897h
            r0.setVisibility(r2)
            android.widget.LinearLayout r0 = r9.f18894e
            r0.setVisibility(r2)
            android.widget.ImageView r0 = r9.f18898i
            com.yeelight.yeelib.ui.activity.SetDefaultSaveStateActivity$c r3 = new com.yeelight.yeelib.ui.activity.SetDefaultSaveStateActivity$c
            r3.<init>()
            r0.setOnClickListener(r3)
        L_0x0060:
            com.yeelight.yeelib.c.h r0 = r9.f18899j
            java.lang.String r0 = r0.mo23395T()
            r3 = -1
            int r4 = r0.hashCode()
            r5 = 922669547(0x36fed1eb, float:7.5942276E-6)
            r6 = 3
            r7 = 2
            r8 = 1
            if (r4 == r5) goto L_0x0095
            switch(r4) {
                case -1462015159: goto L_0x008b;
                case -1462015158: goto L_0x0081;
                case -1462015157: goto L_0x0077;
                default: goto L_0x0076;
            }
        L_0x0076:
            goto L_0x009e
        L_0x0077:
            java.lang.String r2 = "yeelink.light.ceiling23"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x009e
            r2 = 3
            goto L_0x009f
        L_0x0081:
            java.lang.String r2 = "yeelink.light.ceiling22"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x009e
            r2 = 2
            goto L_0x009f
        L_0x008b:
            java.lang.String r2 = "yeelink.light.ceiling21"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x009e
            r2 = 1
            goto L_0x009f
        L_0x0095:
            java.lang.String r4 = "yeelink.light.ceiling5"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x009e
            goto L_0x009f
        L_0x009e:
            r2 = -1
        L_0x009f:
            if (r2 == 0) goto L_0x00a8
            if (r2 == r8) goto L_0x00a8
            if (r2 == r7) goto L_0x00a8
            if (r2 == r6) goto L_0x00a8
            goto L_0x00ad
        L_0x00a8:
            android.widget.LinearLayout r0 = r9.f18893d
            r0.setVisibility(r1)
        L_0x00ad:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.p194ui.activity.SetDefaultSaveStateActivity.m24789W():void");
    }

    /* renamed from: X */
    private void m24790X() {
        runOnUiThread(new C10213d());
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 100 && i2 == -1 && this.f18899j.mo23346t1()) {
            Toast.makeText(this, getText(R$string.save_default_msg_save_success).toString(), 0).show();
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo32193P();
        C10547m.m25758h(true, this);
        setContentView(R$layout.activity_set_default);
        this.f18891b = (CommonTitleBar) findViewById(R$id.title_bar);
        this.f18892c = (ImageView) findViewById(R$id.img_switch_view);
        this.f18894e = (LinearLayout) findViewById(R$id.automatic_recovery_layout);
        this.f18895f = (LinearLayout) findViewById(R$id.default_state_layout);
        this.f18896g = (TextView) findViewById(R$id.default_state_title);
        this.f18897h = (LinearLayout) findViewById(R$id.automatic_power_on);
        this.f18898i = (ImageView) findViewById(R$id.img_switch_on_from_power);
        this.f18893d = (LinearLayout) findViewById(R$id.ll_recover);
        Intent intent = getIntent();
        if (!intent.hasExtra("com.yeelight.cherry.device_id")) {
            C4308b.m12141t(f18890k, "Activity has not device id", false);
            finish();
            return;
        }
        C6006h L0 = C4257w.m11947l0().mo23651L0(intent.getStringExtra("com.yeelight.cherry.device_id"));
        this.f18899j = L0;
        if (L0 == null) {
            BaseActivity.m24384U(this);
            finish();
            return;
        }
        this.f18891b.mo32825a(getString(R$string.feature_set_default), new C10210a(), (View.OnClickListener) null);
        this.f18891b.setTitleTextSize(16);
        this.f18892c.setOnClickListener(new C10211b());
        m24789W();
        m24790X();
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        this.f18899j.mo23400W0(this);
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        if (this.f18899j.mo23331k0()) {
            this.f18899j.mo23365B0(this);
            this.f18899j.mo23354x0();
            return;
        }
        finish();
    }

    public void onStatusChange(int i, C6024e eVar) {
        if (i == -1 || i == 4096) {
            m24790X();
        }
    }
}
