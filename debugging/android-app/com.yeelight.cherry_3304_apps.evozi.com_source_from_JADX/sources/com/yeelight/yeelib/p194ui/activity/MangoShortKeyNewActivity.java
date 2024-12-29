package com.yeelight.yeelib.p194ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Base64;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.yeelight.yeelib.R$id;
import com.yeelight.yeelib.R$layout;
import com.yeelight.yeelib.p150c.C6006h;
import com.yeelight.yeelib.p150c.p151i.C6024e;
import com.yeelight.yeelib.p150c.p184n.C7560j;
import com.yeelight.yeelib.p152f.C4257w;
import com.yeelight.yeelib.p153g.C4300b0;
import com.yeelight.yeelib.p153g.C9856y;
import com.yeelight.yeelib.p186e.C9770e;
import com.yeelight.yeelib.utils.C10547m;
import com.yeelight.yeelib.utils.C4308b;

/* renamed from: com.yeelight.yeelib.ui.activity.MangoShortKeyNewActivity */
public class MangoShortKeyNewActivity extends BaseActivity implements C9770e {

    /* renamed from: m */
    private static final String f18638m = MangoShortKeyNewActivity.class.getSimpleName();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C6006h f18639b;

    /* renamed from: c */
    ImageView f18640c;

    /* renamed from: d */
    LinearLayout f18641d;

    /* renamed from: e */
    LinearLayout f18642e;

    /* renamed from: f */
    LinearLayout f18643f;

    /* renamed from: g */
    ImageView f18644g;

    /* renamed from: h */
    ImageView f18645h;

    /* renamed from: i */
    ImageView f18646i;

    /* renamed from: j */
    TextView f18647j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public int f18648k = -1;

    /* renamed from: l */
    private String f18649l;

    /* renamed from: com.yeelight.yeelib.ui.activity.MangoShortKeyNewActivity$a */
    class C10117a implements View.OnClickListener {
        C10117a() {
        }

        public void onClick(View view) {
            MangoShortKeyNewActivity.this.onBackPressed();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.MangoShortKeyNewActivity$b */
    class C10118b implements View.OnClickListener {
        C10118b() {
        }

        public void onClick(View view) {
            Intent intent = new Intent();
            intent.setClass(MangoShortKeyNewActivity.this, SceneActivity.class);
            intent.putExtra("com.yeelight.cherry.device_id", MangoShortKeyNewActivity.this.f18639b.mo23372G());
            intent.putExtra("start_for_result", true);
            MangoShortKeyNewActivity.this.startActivityForResult(intent, 0);
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.MangoShortKeyNewActivity$c */
    class C10119c implements View.OnClickListener {
        C10119c() {
        }

        public void onClick(View view) {
            if (MangoShortKeyNewActivity.this.f18644g.getVisibility() != 0) {
                MangoShortKeyNewActivity.this.f18639b.mo23408d0().mo27678b(19, new C7560j(0, ""));
                int unused = MangoShortKeyNewActivity.this.f18648k = 0;
                MangoShortKeyNewActivity.this.f18639b.mo27574T1(MangoShortKeyNewActivity.this.f18648k, 0, 0, "");
                MangoShortKeyNewActivity mangoShortKeyNewActivity = MangoShortKeyNewActivity.this;
                mangoShortKeyNewActivity.m24672a0(mangoShortKeyNewActivity.f18648k);
            }
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.MangoShortKeyNewActivity$d */
    class C10120d implements View.OnClickListener {
        C10120d() {
        }

        public void onClick(View view) {
            if (MangoShortKeyNewActivity.this.f18645h.getVisibility() != 0) {
                MangoShortKeyNewActivity.this.f18639b.mo23408d0().mo27678b(19, new C7560j(1, ""));
                int unused = MangoShortKeyNewActivity.this.f18648k = 1;
                MangoShortKeyNewActivity.this.f18639b.mo27574T1(MangoShortKeyNewActivity.this.f18648k, 0, 0, "");
                MangoShortKeyNewActivity mangoShortKeyNewActivity = MangoShortKeyNewActivity.this;
                mangoShortKeyNewActivity.m24672a0(mangoShortKeyNewActivity.f18648k);
            }
        }
    }

    /* renamed from: Z */
    private void m24671Z() {
        this.f18643f.setOnClickListener(new C10118b());
        this.f18641d.setOnClickListener(new C10119c());
        this.f18642e.setOnClickListener(new C10120d());
        m24672a0(this.f18648k);
    }

    /* access modifiers changed from: private */
    /* renamed from: a0 */
    public void m24672a0(int i) {
        if (i == 0) {
            this.f18644g.setVisibility(0);
            this.f18645h.setVisibility(4);
        } else if (i == 1) {
            this.f18644g.setVisibility(4);
            this.f18645h.setVisibility(0);
        } else if (i == 2) {
            this.f18644g.setVisibility(4);
            this.f18645h.setVisibility(4);
            this.f18646i.setVisibility(0);
            return;
        } else {
            return;
        }
        this.f18646i.setVisibility(4);
        this.f18647j.setText("");
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        C9856y s;
        super.onActivityResult(i, i2, intent);
        if (i == 0 && intent != null && (s = C4300b0.m12083u().mo23754s(intent.getExtras().getInt("scene"), this.f18639b.mo23395T())) != null) {
            this.f18648k = 2;
            String q = s.mo31885q();
            String encodeToString = Base64.encodeToString(q.getBytes(), 0);
            int length = q.length();
            while (encodeToString.length() > 32) {
                length--;
                encodeToString = Base64.encodeToString(q.substring(0, length).getBytes(), 0);
            }
            C7560j jVar = new C7560j(2, encodeToString);
            this.f18639b.mo23408d0().mo27678b(19, jVar);
            this.f18647j.setText(q);
            this.f18639b.mo27574T1(this.f18648k, s.mo31874f(), s.mo31876h(), jVar.mo28934b());
            m24672a0(this.f18648k);
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo32193P();
        C10547m.m25758h(true, this);
        setContentView(R$layout.activity_mango_short_key_new);
        this.f18640c = (ImageView) findViewById(R$id.img_back_view);
        this.f18641d = (LinearLayout) findViewById(R$id.layout_focus_mode);
        this.f18642e = (LinearLayout) findViewById(R$id.layout_delay_mode);
        this.f18643f = (LinearLayout) findViewById(R$id.layout_diy_mode);
        this.f18644g = (ImageView) findViewById(R$id.right_mark_of_focus_mode);
        this.f18645h = (ImageView) findViewById(R$id.right_mark_of_delay_mode);
        this.f18646i = (ImageView) findViewById(R$id.right_mark_of_diy);
        TextView textView = (TextView) findViewById(R$id.text_of_focus_mode);
        TextView textView2 = (TextView) findViewById(R$id.text_of_delay_mode);
        TextView textView3 = (TextView) findViewById(R$id.text_of_diy);
        this.f18647j = (TextView) findViewById(R$id.diy_scene_name);
        Intent intent = getIntent();
        if (!intent.hasExtra("com.yeelight.cherry.device_id")) {
            C4308b.m12141t(f18638m, "Activity has not device id", false);
        } else {
            C6006h L0 = C4257w.m11947l0().mo23651L0(intent.getStringExtra("com.yeelight.cherry.device_id"));
            this.f18639b = L0;
            if (L0 == null || !L0.mo23331k0()) {
                BaseActivity.m24384U(this);
            } else {
                this.f18640c.setOnClickListener(new C10117a());
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                findViewById(R$id.title_view).setLayoutParams(layoutParams);
                layoutParams.setMargins(0, C10547m.m25755e(this), 0, 0);
                C7560j jVar = (C7560j) this.f18639b.mo23408d0().mo27710r(19);
                if (jVar != null) {
                    this.f18648k = jVar.mo28933a();
                    m24671Z();
                    this.f18647j.setText("");
                    if (this.f18648k == 2) {
                        String b = jVar.mo28934b();
                        this.f18649l = b;
                        if (b != null) {
                            this.f18647j.setText(new String(Base64.decode(this.f18649l.getBytes(), 0)));
                            return;
                        }
                        return;
                    }
                    return;
                }
                this.f18648k = 0;
                this.f18649l = "";
                return;
            }
        }
        finish();
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        this.f18639b.mo23400W0(this);
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        this.f18639b.mo23365B0(this);
    }

    public void onStatusChange(int i, C6024e eVar) {
    }
}
