package com.yeelight.cherry.p141ui.activity;

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
import com.yeelight.cherry.C12225R$id;
import com.yeelight.cherry.C12228R$layout;
import com.yeelight.yeelib.models.C3112v;
import com.yeelight.yeelib.models.FlowCompleteAction;
import com.yeelight.yeelib.p142ui.activity.BaseActivity;
import com.yeelight.yeelib.p142ui.view.CommonTitleBar;
import p051j4.C9183a0;
import p051j4.C9193k;
import p170i4.C9113d;

/* renamed from: com.yeelight.cherry.ui.activity.SelectLightStateForPersonalityLightActivity */
public class SelectLightStateForPersonalityLightActivity extends BaseActivity {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public ImageView f11392a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public ImageView f11393b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public ImageView f11394c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public ImageView f11395d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public ImageView f11396e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public ImageView f11397f;

    /* renamed from: g */
    private LinearLayout f11398g;

    /* renamed from: h */
    private LinearLayout f11399h;

    /* renamed from: i */
    private LinearLayout f11400i;

    /* renamed from: j */
    private LinearLayout f11401j;

    /* renamed from: k */
    private LinearLayout f11402k;

    /* renamed from: l */
    private LinearLayout f11403l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public TextView f11404m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public C9113d f11405n;

    /* renamed from: o */
    int f11406o = 1;

    /* renamed from: p */
    FlowCompleteAction f11407p = FlowCompleteAction.RECOVER;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public Handler f11408q = new C5684f();

    /* renamed from: com.yeelight.cherry.ui.activity.SelectLightStateForPersonalityLightActivity$a */
    class C5679a implements Runnable {
        C5679a() {
        }

        public void run() {
            SelectLightStateForPersonalityLightActivity selectLightStateForPersonalityLightActivity = SelectLightStateForPersonalityLightActivity.this;
            int i = selectLightStateForPersonalityLightActivity.f11406o;
            ImageView c0 = selectLightStateForPersonalityLightActivity.f11392a;
            if (i == 0) {
                c0.setEnabled(false);
                SelectLightStateForPersonalityLightActivity.this.f11394c.setEnabled(true);
            } else if (i == 1) {
                c0.setEnabled(true);
                SelectLightStateForPersonalityLightActivity.this.f11394c.setEnabled(false);
            } else {
                c0.setEnabled(false);
                SelectLightStateForPersonalityLightActivity.this.f11394c.setEnabled(false);
                SelectLightStateForPersonalityLightActivity.this.f11393b.setEnabled(true);
                SelectLightStateForPersonalityLightActivity.this.f11404m.setText(String.valueOf(SelectLightStateForPersonalityLightActivity.this.f11406o));
                return;
            }
            SelectLightStateForPersonalityLightActivity.this.f11393b.setEnabled(false);
            SelectLightStateForPersonalityLightActivity.this.f11404m.setText("");
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.SelectLightStateForPersonalityLightActivity$b */
    class C5680b implements Runnable {
        C5680b() {
        }

        public void run() {
            int i = C5685g.f11415a[SelectLightStateForPersonalityLightActivity.this.f11407p.ordinal()];
            if (i == 1) {
                SelectLightStateForPersonalityLightActivity.this.f11395d.setEnabled(true);
                SelectLightStateForPersonalityLightActivity.this.f11396e.setEnabled(false);
            } else if (i == 2) {
                SelectLightStateForPersonalityLightActivity.this.f11395d.setEnabled(false);
                SelectLightStateForPersonalityLightActivity.this.f11396e.setEnabled(true);
            } else if (i == 3) {
                SelectLightStateForPersonalityLightActivity.this.f11395d.setEnabled(false);
                SelectLightStateForPersonalityLightActivity.this.f11396e.setEnabled(false);
                SelectLightStateForPersonalityLightActivity.this.f11397f.setEnabled(true);
                return;
            } else {
                return;
            }
            SelectLightStateForPersonalityLightActivity.this.f11397f.setEnabled(false);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.SelectLightStateForPersonalityLightActivity$c */
    class C5681c implements DialogInterface.OnClickListener {
        C5681c() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            SelectLightStateForPersonalityLightActivity.this.f11405n.mo37154d();
            dialogInterface.dismiss();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.SelectLightStateForPersonalityLightActivity$d */
    class C5682d implements DialogInterface.OnClickListener {
        C5682d() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            if (!TextUtils.isEmpty(SelectLightStateForPersonalityLightActivity.this.f11405n.mo37153c().getText().toString())) {
                int intValue = Integer.valueOf(SelectLightStateForPersonalityLightActivity.this.f11405n.mo37153c().getText().toString()).intValue();
                if (intValue < 2 || intValue > 99) {
                    SelectLightStateForPersonalityLightActivity.this.f11405n.mo37159j(2131756017);
                    SelectLightStateForPersonalityLightActivity.this.f11405n.mo37161l(2131099842);
                    return;
                }
                SelectLightStateForPersonalityLightActivity selectLightStateForPersonalityLightActivity = SelectLightStateForPersonalityLightActivity.this;
                selectLightStateForPersonalityLightActivity.f11406o = Integer.valueOf(selectLightStateForPersonalityLightActivity.f11405n.mo37153c().getText().toString()).intValue();
                SelectLightStateForPersonalityLightActivity.this.m17085k0();
                SelectLightStateForPersonalityLightActivity.this.f11405n.mo37154d();
                dialogInterface.dismiss();
            }
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.SelectLightStateForPersonalityLightActivity$e */
    class C5683e implements C9183a0.C9184a {
        C5683e() {
        }

        /* renamed from: a */
        public void mo30178a(String str) {
            Message message = new Message();
            message.obj = str;
            message.what = 0;
            SelectLightStateForPersonalityLightActivity.this.f11408q.removeMessages(0);
            SelectLightStateForPersonalityLightActivity.this.f11408q.sendMessageDelayed(message, 500);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.SelectLightStateForPersonalityLightActivity$f */
    class C5684f extends Handler {
        C5684f() {
        }

        public void handleMessage(Message message) {
            int intValue;
            super.handleMessage(message);
            if (message.what == 0) {
                String str = (String) message.obj;
                if (SelectLightStateForPersonalityLightActivity.this.f11405n == null) {
                    return;
                }
                if (TextUtils.isEmpty(str) || ((intValue = Integer.valueOf(str).intValue()) >= 2 && intValue <= 99)) {
                    SelectLightStateForPersonalityLightActivity.this.f11405n.mo37159j(2131756018);
                    SelectLightStateForPersonalityLightActivity.this.f11405n.mo37161l(2131099841);
                    return;
                }
                SelectLightStateForPersonalityLightActivity.this.f11405n.mo37159j(2131756017);
                SelectLightStateForPersonalityLightActivity.this.f11405n.mo37161l(2131099842);
            }
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.SelectLightStateForPersonalityLightActivity$g */
    static /* synthetic */ class C5685g {

        /* renamed from: a */
        static final /* synthetic */ int[] f11415a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.yeelight.yeelib.models.FlowCompleteAction[] r0 = com.yeelight.yeelib.models.FlowCompleteAction.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f11415a = r0
                com.yeelight.yeelib.models.FlowCompleteAction r1 = com.yeelight.yeelib.models.FlowCompleteAction.RECOVER     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f11415a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.yeelight.yeelib.models.FlowCompleteAction r1 = com.yeelight.yeelib.models.FlowCompleteAction.STAY     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f11415a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.yeelight.yeelib.models.FlowCompleteAction r1 = com.yeelight.yeelib.models.FlowCompleteAction.OFF     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.cherry.p141ui.activity.SelectLightStateForPersonalityLightActivity.C5685g.<clinit>():void");
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.SelectLightStateForPersonalityLightActivity$h */
    class C5686h implements View.OnClickListener {
        C5686h() {
        }

        public void onClick(View view) {
            SelectLightStateForPersonalityLightActivity.this.onBackPressed();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.SelectLightStateForPersonalityLightActivity$i */
    class C5687i implements View.OnClickListener {
        C5687i() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(SelectLightStateForPersonalityLightActivity.this, PersonalityLightingActivity.class);
            intent.addFlags(71303168);
            SelectLightStateForPersonalityLightActivity.this.startActivity(intent);
            SelectLightStateForPersonalityLightActivity.this.finish();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.SelectLightStateForPersonalityLightActivity$j */
    class C5688j implements View.OnClickListener {
        C5688j() {
        }

        public void onClick(View view) {
            SelectLightStateForPersonalityLightActivity selectLightStateForPersonalityLightActivity = SelectLightStateForPersonalityLightActivity.this;
            selectLightStateForPersonalityLightActivity.f11406o = 1;
            selectLightStateForPersonalityLightActivity.m17085k0();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.SelectLightStateForPersonalityLightActivity$k */
    class C5689k implements View.OnClickListener {
        C5689k() {
        }

        public void onClick(View view) {
            SelectLightStateForPersonalityLightActivity selectLightStateForPersonalityLightActivity = SelectLightStateForPersonalityLightActivity.this;
            selectLightStateForPersonalityLightActivity.f11406o = 0;
            selectLightStateForPersonalityLightActivity.m17085k0();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.SelectLightStateForPersonalityLightActivity$l */
    class C5690l implements View.OnClickListener {
        C5690l() {
        }

        public void onClick(View view) {
            SelectLightStateForPersonalityLightActivity.this.m17084j0();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.SelectLightStateForPersonalityLightActivity$m */
    class C5691m implements View.OnClickListener {
        C5691m() {
        }

        public void onClick(View view) {
            SelectLightStateForPersonalityLightActivity selectLightStateForPersonalityLightActivity = SelectLightStateForPersonalityLightActivity.this;
            selectLightStateForPersonalityLightActivity.f11407p = FlowCompleteAction.RECOVER;
            selectLightStateForPersonalityLightActivity.m17086l0();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.SelectLightStateForPersonalityLightActivity$n */
    class C5692n implements View.OnClickListener {
        C5692n() {
        }

        public void onClick(View view) {
            SelectLightStateForPersonalityLightActivity selectLightStateForPersonalityLightActivity = SelectLightStateForPersonalityLightActivity.this;
            selectLightStateForPersonalityLightActivity.f11407p = FlowCompleteAction.STAY;
            selectLightStateForPersonalityLightActivity.m17086l0();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.SelectLightStateForPersonalityLightActivity$o */
    class C5693o implements View.OnClickListener {
        C5693o() {
        }

        public void onClick(View view) {
            SelectLightStateForPersonalityLightActivity selectLightStateForPersonalityLightActivity = SelectLightStateForPersonalityLightActivity.this;
            selectLightStateForPersonalityLightActivity.f11407p = FlowCompleteAction.OFF;
            selectLightStateForPersonalityLightActivity.m17086l0();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.SelectLightStateForPersonalityLightActivity$p */
    class C5694p implements View.OnClickListener {
        C5694p() {
        }

        public void onClick(View view) {
            SelectLightStateForPersonalityLightActivity.this.m17083i0();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: i0 */
    public void m17083i0() {
        C3112v.m8242u().mo23566r().mo35436c().mo35343m(this.f11406o);
        C3112v.m8242u().mo23566r().mo35436c().mo35341k(this.f11407p);
        Intent intent = new Intent();
        intent.setClass(this, PersonalityLightEditActivity.class);
        startActivity(intent);
    }

    /* access modifiers changed from: private */
    /* renamed from: j0 */
    public void m17084j0() {
        C9113d b = new C9113d.C9118e(this).mo37179i(getText(2131756016).toString()).mo37177g(getText(2131756018).toString()).mo37181k(true).mo37172b();
        this.f11405n = b;
        b.mo37156g(-2, getText(2131755147).toString(), new C5681c());
        this.f11405n.mo37156g(-1, getText(2131755281).toString(), new C5682d());
        this.f11405n.setCancelable(true);
        this.f11405n.mo37153c().setHint("2～99");
        this.f11405n.mo37153c().setKeyListener(DigitsKeyListener.getInstance("0123456789"));
        this.f11405n.mo37153c().addTextChangedListener(new C9183a0(2, this.f11405n.mo37153c(), new C5683e()));
        this.f11405n.show();
        this.f11405n.mo37164o();
    }

    /* access modifiers changed from: private */
    /* renamed from: k0 */
    public void m17085k0() {
        this.f11392a.post(new C5679a());
    }

    /* access modifiers changed from: private */
    /* renamed from: l0 */
    public void m17086l0() {
        this.f11395d.post(new C5680b());
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo35653P();
        C9193k.m22157h(true, this);
        setContentView(C12228R$layout.activity_select_personality_state);
        CommonTitleBar commonTitleBar = (CommonTitleBar) findViewById(2131297591);
        commonTitleBar.mo36195a(getText(2131756023).toString(), new C5686h(), new C5687i());
        commonTitleBar.setTitleTextSize(16);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        commonTitleBar.setLayoutParams(layoutParams);
        layoutParams.setMargins(0, C9193k.m22154e(this), 0, 0);
        this.f11392a = (ImageView) findViewById(C12225R$id.repeat_once_select_img);
        this.f11393b = (ImageView) findViewById(C12225R$id.repeat_custom_select_img);
        this.f11394c = (ImageView) findViewById(C12225R$id.repeat_loop_select_img);
        this.f11398g = (LinearLayout) findViewById(2131297328);
        this.f11399h = (LinearLayout) findViewById(2131297321);
        this.f11400i = (LinearLayout) findViewById(C12225R$id.repeat_loop_layout);
        this.f11395d = (ImageView) findViewById(C12225R$id.stop_recovery_select_img);
        this.f11396e = (ImageView) findViewById(C12225R$id.stop_stay_select_img);
        this.f11397f = (ImageView) findViewById(C12225R$id.stop_off_select_img);
        this.f11401j = (LinearLayout) findViewById(C12225R$id.stop_recovery_layout);
        this.f11402k = (LinearLayout) findViewById(C12225R$id.stop_stay_layout);
        this.f11403l = (LinearLayout) findViewById(C12225R$id.stop_off_layout);
        this.f11404m = (TextView) findViewById(C12225R$id.repeat_custom_count_text);
        this.f11398g.setOnClickListener(new C5688j());
        this.f11400i.setOnClickListener(new C5689k());
        this.f11399h.setOnClickListener(new C5690l());
        this.f11401j.setOnClickListener(new C5691m());
        this.f11402k.setOnClickListener(new C5692n());
        this.f11403l.setOnClickListener(new C5693o());
        ((TextView) findViewById(2131297165)).setOnClickListener(new C5694p());
        m17085k0();
        m17086l0();
    }
}
