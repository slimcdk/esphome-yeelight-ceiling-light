package com.yeelight.yeelib.p142ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Base64;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.yeelight.yeelib.R$id;
import com.yeelight.yeelib.R$layout;
import com.yeelight.yeelib.device.WifiDeviceBase;
import com.yeelight.yeelib.device.base.DeviceStatusBase;
import com.yeelight.yeelib.managers.YeelightDeviceManager;
import com.yeelight.yeelib.models.C3112v;
import com.yeelight.yeelib.models.C8327s;
import com.yeelight.yeelib.utils.AppUtils;
import p051j4.C9193k;
import p232y3.C12047j;
import p237z3.C12145e;

/* renamed from: com.yeelight.yeelib.ui.activity.MangoShortKeyNewActivity */
public class MangoShortKeyNewActivity extends BaseActivity implements C12145e {

    /* renamed from: l */
    private static final String f14946l = "MangoShortKeyNewActivity";
    /* access modifiers changed from: private */

    /* renamed from: a */
    public WifiDeviceBase f14947a;

    /* renamed from: b */
    ImageView f14948b;

    /* renamed from: c */
    LinearLayout f14949c;

    /* renamed from: d */
    LinearLayout f14950d;

    /* renamed from: e */
    LinearLayout f14951e;

    /* renamed from: f */
    ImageView f14952f;

    /* renamed from: g */
    ImageView f14953g;

    /* renamed from: h */
    ImageView f14954h;

    /* renamed from: i */
    TextView f14955i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public int f14956j = -1;

    /* renamed from: k */
    private String f14957k;

    /* renamed from: com.yeelight.yeelib.ui.activity.MangoShortKeyNewActivity$a */
    class C8535a implements View.OnClickListener {
        C8535a() {
        }

        public void onClick(View view) {
            MangoShortKeyNewActivity.this.onBackPressed();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.MangoShortKeyNewActivity$b */
    class C8536b implements View.OnClickListener {
        C8536b() {
        }

        public void onClick(View view) {
            Intent intent = new Intent();
            intent.setClass(MangoShortKeyNewActivity.this, SceneActivity.class);
            intent.putExtra("com.yeelight.cherry.device_id", MangoShortKeyNewActivity.this.f14947a.mo23185G());
            intent.putExtra("start_for_result", true);
            MangoShortKeyNewActivity.this.startActivityForResult(intent, 0);
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.MangoShortKeyNewActivity$c */
    class C8537c implements View.OnClickListener {
        C8537c() {
        }

        public void onClick(View view) {
            if (MangoShortKeyNewActivity.this.f14952f.getVisibility() != 0) {
                MangoShortKeyNewActivity.this.f14947a.mo23221d0().mo31579b(19, new C12047j(0, ""));
                int unused = MangoShortKeyNewActivity.this.f14956j = 0;
                MangoShortKeyNewActivity.this.f14947a.mo31491T1(MangoShortKeyNewActivity.this.f14956j, 0, 0, "");
                MangoShortKeyNewActivity mangoShortKeyNewActivity = MangoShortKeyNewActivity.this;
                mangoShortKeyNewActivity.m20279a0(mangoShortKeyNewActivity.f14956j);
            }
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.MangoShortKeyNewActivity$d */
    class C8538d implements View.OnClickListener {
        C8538d() {
        }

        public void onClick(View view) {
            if (MangoShortKeyNewActivity.this.f14953g.getVisibility() != 0) {
                MangoShortKeyNewActivity.this.f14947a.mo23221d0().mo31579b(19, new C12047j(1, ""));
                int unused = MangoShortKeyNewActivity.this.f14956j = 1;
                MangoShortKeyNewActivity.this.f14947a.mo31491T1(MangoShortKeyNewActivity.this.f14956j, 0, 0, "");
                MangoShortKeyNewActivity mangoShortKeyNewActivity = MangoShortKeyNewActivity.this;
                mangoShortKeyNewActivity.m20279a0(mangoShortKeyNewActivity.f14956j);
            }
        }
    }

    /* renamed from: Z */
    private void m20278Z() {
        this.f14951e.setOnClickListener(new C8536b());
        this.f14949c.setOnClickListener(new C8537c());
        this.f14950d.setOnClickListener(new C8538d());
        m20279a0(this.f14956j);
    }

    /* access modifiers changed from: private */
    /* renamed from: a0 */
    public void m20279a0(int i) {
        if (i == 0) {
            this.f14952f.setVisibility(0);
            this.f14953g.setVisibility(4);
        } else if (i == 1) {
            this.f14952f.setVisibility(4);
            this.f14953g.setVisibility(0);
        } else if (i == 2) {
            this.f14952f.setVisibility(4);
            this.f14953g.setVisibility(4);
            this.f14954h.setVisibility(0);
            return;
        } else {
            return;
        }
        this.f14954h.setVisibility(4);
        this.f14955i.setText("");
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        C8327s s;
        super.onActivityResult(i, i2, intent);
        if (i == 0 && intent != null && (s = C3112v.m8242u().mo23567s(intent.getExtras().getInt("scene"), this.f14947a.mo23208T())) != null) {
            this.f14956j = 2;
            String q = s.mo35450q();
            String encodeToString = Base64.encodeToString(q.getBytes(), 0);
            int length = q.length();
            while (encodeToString.length() > 32) {
                length--;
                encodeToString = Base64.encodeToString(q.substring(0, length).getBytes(), 0);
            }
            C12047j jVar = new C12047j(2, encodeToString);
            this.f14947a.mo23221d0().mo31579b(19, jVar);
            this.f14955i.setText(q);
            this.f14947a.mo31491T1(this.f14956j, s.mo35439f(), s.mo35441h(), jVar.mo42733b());
            m20279a0(this.f14956j);
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo35653P();
        C9193k.m22157h(true, this);
        setContentView(R$layout.activity_mango_short_key_new);
        this.f14948b = (ImageView) findViewById(R$id.img_back_view);
        this.f14949c = (LinearLayout) findViewById(R$id.layout_focus_mode);
        this.f14950d = (LinearLayout) findViewById(R$id.layout_delay_mode);
        this.f14951e = (LinearLayout) findViewById(R$id.layout_diy_mode);
        this.f14952f = (ImageView) findViewById(R$id.right_mark_of_focus_mode);
        this.f14953g = (ImageView) findViewById(R$id.right_mark_of_delay_mode);
        this.f14954h = (ImageView) findViewById(R$id.right_mark_of_diy);
        TextView textView = (TextView) findViewById(R$id.text_of_focus_mode);
        TextView textView2 = (TextView) findViewById(R$id.text_of_delay_mode);
        TextView textView3 = (TextView) findViewById(R$id.text_of_diy);
        this.f14955i = (TextView) findViewById(R$id.diy_scene_name);
        Intent intent = getIntent();
        if (!intent.hasExtra("com.yeelight.cherry.device_id")) {
            AppUtils.m8302w(f14946l, "Activity has not device id", false);
        } else {
            WifiDeviceBase P0 = YeelightDeviceManager.m7800o0().mo23274P0(intent.getStringExtra("com.yeelight.cherry.device_id"));
            this.f14947a = P0;
            if (P0 == null || !P0.mo23145k0()) {
                BaseActivity.m19947U(this);
            } else {
                this.f14948b.setOnClickListener(new C8535a());
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                findViewById(R$id.title_view).setLayoutParams(layoutParams);
                layoutParams.setMargins(0, C9193k.m22154e(this), 0, 0);
                C12047j jVar = (C12047j) this.f14947a.mo23221d0().mo31611r(19);
                if (jVar != null) {
                    this.f14956j = jVar.mo42732a();
                    m20278Z();
                    this.f14955i.setText("");
                    if (this.f14956j == 2) {
                        String b = jVar.mo42733b();
                        this.f14957k = b;
                        if (b != null) {
                            this.f14955i.setText(new String(Base64.decode(b.getBytes(), 0)));
                            return;
                        }
                        return;
                    }
                    return;
                }
                this.f14956j = 0;
                this.f14957k = "";
                return;
            }
        }
        finish();
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        this.f14947a.mo23213W0(this);
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        this.f14947a.mo23178B0(this);
    }

    public void onStatusChange(int i, DeviceStatusBase deviceStatusBase) {
    }
}
