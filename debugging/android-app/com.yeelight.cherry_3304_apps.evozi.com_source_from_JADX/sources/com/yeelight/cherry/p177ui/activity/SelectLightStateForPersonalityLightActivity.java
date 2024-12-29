package com.yeelight.cherry.p177ui.activity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.text.method.DigitsKeyListener;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.yeelight.cherry.C11745R$id;
import com.yeelight.cherry.C11748R$layout;
import com.yeelight.yeelib.p153g.C4300b0;
import com.yeelight.yeelib.p153g.C9843l;
import com.yeelight.yeelib.p194ui.activity.BaseActivity;
import com.yeelight.yeelib.p194ui.view.CommonTitleBar;
import com.yeelight.yeelib.p194ui.widget.C10526e;
import com.yeelight.yeelib.utils.C10536b0;
import com.yeelight.yeelib.utils.C10547m;

/* renamed from: com.yeelight.cherry.ui.activity.SelectLightStateForPersonalityLightActivity */
public class SelectLightStateForPersonalityLightActivity extends BaseActivity {
    /* access modifiers changed from: private */

    /* renamed from: b */
    public ImageView f11821b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public ImageView f11822c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public ImageView f11823d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public ImageView f11824e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public ImageView f11825f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public ImageView f11826g;

    /* renamed from: h */
    private LinearLayout f11827h;

    /* renamed from: i */
    private LinearLayout f11828i;

    /* renamed from: j */
    private LinearLayout f11829j;

    /* renamed from: k */
    private LinearLayout f11830k;

    /* renamed from: l */
    private LinearLayout f11831l;

    /* renamed from: m */
    private LinearLayout f11832m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public TextView f11833n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public C10526e f11834o;

    /* renamed from: p */
    int f11835p = 1;

    /* renamed from: q */
    C9843l f11836q = C9843l.RECOVER;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public Handler f11837r = new C5643f();

    /* renamed from: com.yeelight.cherry.ui.activity.SelectLightStateForPersonalityLightActivity$a */
    class C5638a implements Runnable {
        C5638a() {
        }

        public void run() {
            SelectLightStateForPersonalityLightActivity selectLightStateForPersonalityLightActivity = SelectLightStateForPersonalityLightActivity.this;
            int i = selectLightStateForPersonalityLightActivity.f11835p;
            ImageView c0 = selectLightStateForPersonalityLightActivity.f11821b;
            if (i == 0) {
                c0.setEnabled(false);
                SelectLightStateForPersonalityLightActivity.this.f11823d.setEnabled(true);
            } else if (i == 1) {
                c0.setEnabled(true);
                SelectLightStateForPersonalityLightActivity.this.f11823d.setEnabled(false);
            } else {
                c0.setEnabled(false);
                SelectLightStateForPersonalityLightActivity.this.f11823d.setEnabled(false);
                SelectLightStateForPersonalityLightActivity.this.f11822c.setEnabled(true);
                SelectLightStateForPersonalityLightActivity.this.f11833n.setText(String.valueOf(SelectLightStateForPersonalityLightActivity.this.f11835p));
                return;
            }
            SelectLightStateForPersonalityLightActivity.this.f11822c.setEnabled(false);
            SelectLightStateForPersonalityLightActivity.this.f11833n.setText("");
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.SelectLightStateForPersonalityLightActivity$b */
    class C5639b implements Runnable {
        C5639b() {
        }

        public void run() {
            int i = C5644g.f11844a[SelectLightStateForPersonalityLightActivity.this.f11836q.ordinal()];
            if (i == 1) {
                SelectLightStateForPersonalityLightActivity.this.f11824e.setEnabled(true);
                SelectLightStateForPersonalityLightActivity.this.f11825f.setEnabled(false);
            } else if (i == 2) {
                SelectLightStateForPersonalityLightActivity.this.f11824e.setEnabled(false);
                SelectLightStateForPersonalityLightActivity.this.f11825f.setEnabled(true);
            } else if (i == 3) {
                SelectLightStateForPersonalityLightActivity.this.f11824e.setEnabled(false);
                SelectLightStateForPersonalityLightActivity.this.f11825f.setEnabled(false);
                SelectLightStateForPersonalityLightActivity.this.f11826g.setEnabled(true);
                return;
            } else {
                return;
            }
            SelectLightStateForPersonalityLightActivity.this.f11826g.setEnabled(false);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.SelectLightStateForPersonalityLightActivity$c */
    class C5640c implements DialogInterface.OnClickListener {
        C5640c() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            SelectLightStateForPersonalityLightActivity.this.f11834o.mo33333d();
            dialogInterface.dismiss();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.SelectLightStateForPersonalityLightActivity$d */
    class C5641d implements DialogInterface.OnClickListener {
        C5641d() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            if (!TextUtils.isEmpty(SelectLightStateForPersonalityLightActivity.this.f11834o.mo33332c().getText().toString())) {
                int intValue = Integer.valueOf(SelectLightStateForPersonalityLightActivity.this.f11834o.mo33332c().getText().toString()).intValue();
                if (intValue < 2 || intValue > 99) {
                    SelectLightStateForPersonalityLightActivity.this.f11834o.mo33338j(2131756005);
                    SelectLightStateForPersonalityLightActivity.this.f11834o.mo33340l(2131099839);
                    return;
                }
                SelectLightStateForPersonalityLightActivity selectLightStateForPersonalityLightActivity = SelectLightStateForPersonalityLightActivity.this;
                selectLightStateForPersonalityLightActivity.f11835p = Integer.valueOf(selectLightStateForPersonalityLightActivity.f11834o.mo33332c().getText().toString()).intValue();
                SelectLightStateForPersonalityLightActivity.this.m17068k0();
                SelectLightStateForPersonalityLightActivity.this.f11834o.mo33333d();
                dialogInterface.dismiss();
            }
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.SelectLightStateForPersonalityLightActivity$e */
    class C5642e implements C10536b0.C10537a {
        C5642e() {
        }

        /* renamed from: a */
        public void mo26122a(String str) {
            Message message = new Message();
            message.obj = str;
            message.what = 0;
            SelectLightStateForPersonalityLightActivity.this.f11837r.removeMessages(0);
            SelectLightStateForPersonalityLightActivity.this.f11837r.sendMessageDelayed(message, 500);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.SelectLightStateForPersonalityLightActivity$f */
    class C5643f extends Handler {
        C5643f() {
        }

        public void handleMessage(Message message) {
            int intValue;
            super.handleMessage(message);
            if (message.what == 0) {
                String str = (String) message.obj;
                if (SelectLightStateForPersonalityLightActivity.this.f11834o == null) {
                    return;
                }
                if (TextUtils.isEmpty(str) || ((intValue = Integer.valueOf(str).intValue()) >= 2 && intValue <= 99)) {
                    SelectLightStateForPersonalityLightActivity.this.f11834o.mo33338j(2131756006);
                    SelectLightStateForPersonalityLightActivity.this.f11834o.mo33340l(2131099838);
                    return;
                }
                SelectLightStateForPersonalityLightActivity.this.f11834o.mo33338j(2131756005);
                SelectLightStateForPersonalityLightActivity.this.f11834o.mo33340l(2131099839);
            }
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.SelectLightStateForPersonalityLightActivity$g */
    static /* synthetic */ class C5644g {

        /* renamed from: a */
        static final /* synthetic */ int[] f11844a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.yeelight.yeelib.g.l[] r0 = com.yeelight.yeelib.p153g.C9843l.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f11844a = r0
                com.yeelight.yeelib.g.l r1 = com.yeelight.yeelib.p153g.C9843l.RECOVER     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f11844a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.yeelight.yeelib.g.l r1 = com.yeelight.yeelib.p153g.C9843l.STAY     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f11844a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.yeelight.yeelib.g.l r1 = com.yeelight.yeelib.p153g.C9843l.OFF     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.cherry.p177ui.activity.SelectLightStateForPersonalityLightActivity.C5644g.<clinit>():void");
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.SelectLightStateForPersonalityLightActivity$h */
    class C5645h implements View.OnClickListener {
        C5645h() {
        }

        public void onClick(View view) {
            SelectLightStateForPersonalityLightActivity.this.onBackPressed();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.SelectLightStateForPersonalityLightActivity$i */
    class C5646i implements View.OnClickListener {
        C5646i() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(SelectLightStateForPersonalityLightActivity.this, PersonalityLightingActivity.class);
            intent.addFlags(71303168);
            SelectLightStateForPersonalityLightActivity.this.startActivity(intent);
            SelectLightStateForPersonalityLightActivity.this.finish();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.SelectLightStateForPersonalityLightActivity$j */
    class C5647j implements View.OnClickListener {
        C5647j() {
        }

        public void onClick(View view) {
            SelectLightStateForPersonalityLightActivity selectLightStateForPersonalityLightActivity = SelectLightStateForPersonalityLightActivity.this;
            selectLightStateForPersonalityLightActivity.f11835p = 1;
            selectLightStateForPersonalityLightActivity.m17068k0();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.SelectLightStateForPersonalityLightActivity$k */
    class C5648k implements View.OnClickListener {
        C5648k() {
        }

        public void onClick(View view) {
            SelectLightStateForPersonalityLightActivity selectLightStateForPersonalityLightActivity = SelectLightStateForPersonalityLightActivity.this;
            selectLightStateForPersonalityLightActivity.f11835p = 0;
            selectLightStateForPersonalityLightActivity.m17068k0();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.SelectLightStateForPersonalityLightActivity$l */
    class C5649l implements View.OnClickListener {
        C5649l() {
        }

        public void onClick(View view) {
            SelectLightStateForPersonalityLightActivity.this.m17067j0();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.SelectLightStateForPersonalityLightActivity$m */
    class C5650m implements View.OnClickListener {
        C5650m() {
        }

        public void onClick(View view) {
            SelectLightStateForPersonalityLightActivity selectLightStateForPersonalityLightActivity = SelectLightStateForPersonalityLightActivity.this;
            selectLightStateForPersonalityLightActivity.f11836q = C9843l.RECOVER;
            selectLightStateForPersonalityLightActivity.m17069l0();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.SelectLightStateForPersonalityLightActivity$n */
    class C5651n implements View.OnClickListener {
        C5651n() {
        }

        public void onClick(View view) {
            SelectLightStateForPersonalityLightActivity selectLightStateForPersonalityLightActivity = SelectLightStateForPersonalityLightActivity.this;
            selectLightStateForPersonalityLightActivity.f11836q = C9843l.STAY;
            selectLightStateForPersonalityLightActivity.m17069l0();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.SelectLightStateForPersonalityLightActivity$o */
    class C5652o implements View.OnClickListener {
        C5652o() {
        }

        public void onClick(View view) {
            SelectLightStateForPersonalityLightActivity selectLightStateForPersonalityLightActivity = SelectLightStateForPersonalityLightActivity.this;
            selectLightStateForPersonalityLightActivity.f11836q = C9843l.OFF;
            selectLightStateForPersonalityLightActivity.m17069l0();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.SelectLightStateForPersonalityLightActivity$p */
    class C5653p implements View.OnClickListener {
        C5653p() {
        }

        public void onClick(View view) {
            SelectLightStateForPersonalityLightActivity.this.m17066i0();
        }
    }

    static {
        Class<SelectLightStateForPersonalityLightActivity> cls = SelectLightStateForPersonalityLightActivity.class;
    }

    /* access modifiers changed from: private */
    /* renamed from: i0 */
    public void m17066i0() {
        C4300b0.m12083u().mo23753r().mo31871c().mo31728m(this.f11835p);
        C4300b0.m12083u().mo23753r().mo31871c().mo31726k(this.f11836q);
        Intent intent = new Intent();
        intent.setClass(this, PersonalityLightEditActivity.class);
        startActivity(intent);
    }

    /* access modifiers changed from: private */
    /* renamed from: j0 */
    public void m17067j0() {
        C10526e.C10531e eVar = new C10526e.C10531e(this);
        eVar.mo33358i(getText(2131756004).toString());
        eVar.mo33356g(getText(2131756006).toString());
        eVar.mo33360k(true);
        C10526e b = eVar.mo33351b();
        this.f11834o = b;
        b.mo33335g(-2, getText(2131755146).toString(), new C5640c());
        this.f11834o.mo33335g(-1, getText(2131755277).toString(), new C5641d());
        this.f11834o.setCancelable(true);
        this.f11834o.mo33332c().setHint("2～99");
        this.f11834o.mo33332c().setKeyListener(DigitsKeyListener.getInstance("0123456789"));
        this.f11834o.mo33332c().addTextChangedListener(new C10536b0(2, this.f11834o.mo33332c(), new C5642e()));
        this.f11834o.show();
        this.f11834o.mo33343o();
    }

    /* access modifiers changed from: private */
    /* renamed from: k0 */
    public void m17068k0() {
        this.f11821b.post(new C5638a());
    }

    /* access modifiers changed from: private */
    /* renamed from: l0 */
    public void m17069l0() {
        this.f11824e.post(new C5639b());
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo32193P();
        C10547m.m25758h(true, this);
        setContentView(C11748R$layout.activity_select_personality_state);
        CommonTitleBar commonTitleBar = (CommonTitleBar) findViewById(2131297424);
        commonTitleBar.mo32825a(getText(2131756011).toString(), new C5645h(), new C5646i());
        commonTitleBar.setTitleTextSize(16);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        commonTitleBar.setLayoutParams(layoutParams);
        layoutParams.setMargins(0, C10547m.m25755e(this), 0, 0);
        this.f11821b = (ImageView) findViewById(C11745R$id.repeat_once_select_img);
        this.f11822c = (ImageView) findViewById(C11745R$id.repeat_custom_select_img);
        this.f11823d = (ImageView) findViewById(C11745R$id.repeat_loop_select_img);
        this.f11827h = (LinearLayout) findViewById(2131297188);
        this.f11828i = (LinearLayout) findViewById(2131297181);
        this.f11829j = (LinearLayout) findViewById(C11745R$id.repeat_loop_layout);
        this.f11824e = (ImageView) findViewById(C11745R$id.stop_recovery_select_img);
        this.f11825f = (ImageView) findViewById(C11745R$id.stop_stay_select_img);
        this.f11826g = (ImageView) findViewById(C11745R$id.stop_off_select_img);
        this.f11830k = (LinearLayout) findViewById(C11745R$id.stop_recovery_layout);
        this.f11831l = (LinearLayout) findViewById(C11745R$id.stop_stay_layout);
        this.f11832m = (LinearLayout) findViewById(C11745R$id.stop_off_layout);
        this.f11833n = (TextView) findViewById(C11745R$id.repeat_custom_count_text);
        this.f11827h.setOnClickListener(new C5647j());
        this.f11829j.setOnClickListener(new C5648k());
        this.f11828i.setOnClickListener(new C5649l());
        this.f11830k.setOnClickListener(new C5650m());
        this.f11831l.setOnClickListener(new C5651n());
        this.f11832m.setOnClickListener(new C5652o());
        ((TextView) findViewById(2131297043)).setOnClickListener(new C5653p());
        m17068k0();
        m17069l0();
    }
}
