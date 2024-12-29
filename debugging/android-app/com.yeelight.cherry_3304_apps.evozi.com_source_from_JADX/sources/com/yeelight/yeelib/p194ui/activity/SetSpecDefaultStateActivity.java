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
import com.yeelight.yeelib.p150c.p151i.C6024e;
import com.yeelight.yeelib.p150c.p151i.C6050n;
import com.yeelight.yeelib.p150c.p151i.C6072p;
import com.yeelight.yeelib.p152f.C4257w;
import com.yeelight.yeelib.p186e.C9770e;
import com.yeelight.yeelib.p194ui.view.CommonTitleBar;
import com.yeelight.yeelib.utils.C10547m;
import com.yeelight.yeelib.utils.C4308b;

/* renamed from: com.yeelight.yeelib.ui.activity.SetSpecDefaultStateActivity */
public class SetSpecDefaultStateActivity extends BaseActivity implements C9770e {

    /* renamed from: j */
    private static final String f18905j = SetSpecDefaultStateActivity.class.getSimpleName();

    /* renamed from: b */
    CommonTitleBar f18906b;

    /* renamed from: c */
    ImageView f18907c;

    /* renamed from: d */
    LinearLayout f18908d;

    /* renamed from: e */
    LinearLayout f18909e;

    /* renamed from: f */
    TextView f18910f;

    /* renamed from: g */
    ImageView f18911g;

    /* renamed from: h */
    TextView f18912h;

    /* renamed from: i */
    private C6050n f18913i;

    /* renamed from: V */
    private String m24791V() {
        if (!(this.f18913i instanceof C6072p)) {
            return getResources().getString(R$string.switch1_on_from_power);
        }
        return String.format(getResources().getString(R$string.switch1_on_from_power_device), new Object[]{Integer.valueOf(((C6072p) this.f18913i).mo27857p2() + 1)});
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: W */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m24792W() {
        /*
            r4 = this;
            com.yeelight.yeelib.c.i.n r0 = r4.f18913i
            java.lang.String r0 = r0.mo23395T()
            int r1 = r0.hashCode()
            r2 = 1
            r3 = 0
            switch(r1) {
                case 1201766335: goto L_0x001a;
                case 1201766336: goto L_0x0010;
                default: goto L_0x000f;
            }
        L_0x000f:
            goto L_0x0024
        L_0x0010:
            java.lang.String r1 = "yeelink.light.ml2"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0024
            r0 = 1
            goto L_0x0025
        L_0x001a:
            java.lang.String r1 = "yeelink.light.ml1"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0024
            r0 = 0
            goto L_0x0025
        L_0x0024:
            r0 = -1
        L_0x0025:
            if (r0 == 0) goto L_0x002a
            if (r0 == r2) goto L_0x002a
            r2 = 0
        L_0x002a:
            android.widget.LinearLayout r0 = r4.f18908d
            if (r2 == 0) goto L_0x002f
            goto L_0x0030
        L_0x002f:
            r3 = 4
        L_0x0030:
            r0.setVisibility(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.p194ui.activity.SetSpecDefaultStateActivity.m24792W():void");
    }

    /* renamed from: X */
    private boolean m24793X() {
        return this.f18913i.mo23398V();
    }

    /* renamed from: d0 */
    private void m24794d0() {
        runOnUiThread(new C10333p0(this));
    }

    /* renamed from: Y */
    public /* synthetic */ void mo32513Y(View view) {
        Class<?> cls;
        try {
            cls = Class.forName("com.yeelight.cherry.ui.activity.DemoControlViewActivity");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            cls = null;
        }
        if (cls != null) {
            Intent intent = new Intent();
            intent.setClass(this, cls);
            intent.putExtra("com.yeelight.cherry.device_id", this.f18913i.mo23372G());
            intent.putExtra("set_device_default", true);
            startActivityForResult(intent, 100);
        }
    }

    /* renamed from: Z */
    public /* synthetic */ void mo32514Z(View view) {
        onBackPressed();
    }

    /* renamed from: a0 */
    public /* synthetic */ void mo32515a0(View view) {
        C6050n nVar = this.f18913i;
        nVar.mo27844c2(!nVar.mo23408d0().mo27683d0());
    }

    /* renamed from: b0 */
    public /* synthetic */ void mo32516b0(View view) {
        this.f18913i.mo27840Y1(m24793X() ^ true ? 1 : 0);
    }

    /* renamed from: c0 */
    public /* synthetic */ void mo32517c0() {
        C10335q0 q0Var;
        LinearLayout linearLayout;
        this.f18911g.setImageResource(m24793X() ? R$drawable.icon_yeelight_switch_point_on_new : R$drawable.icon_yeelight_switch_point_off_new);
        if (this.f18913i.mo23408d0().mo27683d0()) {
            this.f18907c.setImageResource(R$drawable.icon_yeelight_switch_point_on_new);
            this.f18910f.setTextColor(getResources().getColor(R$color.common_text_color_not_clickable_cc));
            linearLayout = this.f18909e;
            q0Var = null;
        } else {
            this.f18907c.setImageResource(R$drawable.icon_yeelight_switch_point_off_new);
            this.f18910f.setTextColor(getResources().getColor(R$color.common_text_color_primary_33));
            linearLayout = this.f18909e;
            q0Var = new C10335q0(this);
        }
        linearLayout.setOnClickListener(q0Var);
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 100 && i2 == -1 && this.f18913i.mo23346t1()) {
            Toast.makeText(this, getText(R$string.save_default_msg_save_success).toString(), 0).show();
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo32193P();
        C10547m.m25758h(true, this);
        setContentView(R$layout.activity_set_default);
        this.f18906b = (CommonTitleBar) findViewById(R$id.title_bar);
        this.f18907c = (ImageView) findViewById(R$id.img_switch_view);
        LinearLayout linearLayout = (LinearLayout) findViewById(R$id.automatic_recovery_layout);
        this.f18909e = (LinearLayout) findViewById(R$id.default_state_layout);
        this.f18910f = (TextView) findViewById(R$id.default_state_title);
        LinearLayout linearLayout2 = (LinearLayout) findViewById(R$id.automatic_power_on);
        this.f18911g = (ImageView) findViewById(R$id.img_switch_on_from_power);
        this.f18908d = (LinearLayout) findViewById(R$id.ll_recover);
        this.f18912h = (TextView) findViewById(R$id.on_from_power);
        Intent intent = getIntent();
        if (!intent.hasExtra("com.yeelight.cherry.device_id")) {
            C4308b.m12141t(f18905j, "Activity has not device id", false);
            finish();
            return;
        }
        C6050n nVar = (C6050n) C4257w.m11945h0(intent.getStringExtra("com.yeelight.cherry.device_id"));
        this.f18913i = nVar;
        if (nVar == null) {
            BaseActivity.m24384U(this);
            finish();
            return;
        }
        this.f18906b.mo32825a(getString(R$string.feature_set_default), new C10337r0(this), (View.OnClickListener) null);
        this.f18907c.setOnClickListener(new C10339s0(this));
        this.f18912h.setText(m24791V());
        m24792W();
        m24794d0();
        this.f18911g.setOnClickListener(new C10341t0(this));
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        this.f18913i.mo23400W0(this);
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        if (this.f18913i.mo23331k0()) {
            this.f18913i.mo23365B0(this);
            this.f18913i.mo23354x0();
            return;
        }
        finish();
    }

    public void onStatusChange(int i, C6024e eVar) {
        if (i == -1 || i == 4096) {
            m24794d0();
        }
    }
}
