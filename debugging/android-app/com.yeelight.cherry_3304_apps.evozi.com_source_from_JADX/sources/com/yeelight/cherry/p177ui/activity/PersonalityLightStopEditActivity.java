package com.yeelight.cherry.p177ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;
import com.yeelight.cherry.C11745R$id;
import com.yeelight.cherry.C11748R$layout;
import com.yeelight.yeelib.p153g.C4300b0;
import com.yeelight.yeelib.p153g.C9830b;
import com.yeelight.yeelib.p153g.C9843l;
import com.yeelight.yeelib.p153g.C9849r;
import com.yeelight.yeelib.p194ui.activity.BaseActivity;
import com.yeelight.yeelib.p194ui.view.CommonTitleBar;
import com.yeelight.yeelib.utils.C10547m;
import com.yeelight.yeelib.utils.C4308b;
import java.util.List;

/* renamed from: com.yeelight.cherry.ui.activity.PersonalityLightStopEditActivity */
public class PersonalityLightStopEditActivity extends BaseActivity {

    /* renamed from: j */
    private static String f11505j = PersonalityLightStopEditActivity.class.getSimpleName();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public ImageView f11506b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public ImageView f11507c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public ImageView f11508d;

    /* renamed from: e */
    private LinearLayout f11509e;

    /* renamed from: f */
    private LinearLayout f11510f;

    /* renamed from: g */
    private LinearLayout f11511g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public C9843l f11512h;

    /* renamed from: i */
    int f11513i;

    /* renamed from: com.yeelight.cherry.ui.activity.PersonalityLightStopEditActivity$a */
    class C5510a implements View.OnClickListener {
        C5510a() {
        }

        public void onClick(View view) {
            PersonalityLightStopEditActivity.this.onBackPressed();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.PersonalityLightStopEditActivity$b */
    class C5511b implements View.OnClickListener {

        /* renamed from: com.yeelight.cherry.ui.activity.PersonalityLightStopEditActivity$b$a */
        class C5512a implements C4300b0.C4307g {
            C5512a() {
            }

            /* renamed from: a */
            public void mo23766a(String str) {
                PersonalityLightStopEditActivity.this.runOnUiThread(new C5772s1(this, str));
            }

            /* renamed from: b */
            public /* synthetic */ void mo26769b(String str) {
                Toast toast;
                if (str == null || str.isEmpty()) {
                    PersonalityLightStopEditActivity personalityLightStopEditActivity = PersonalityLightStopEditActivity.this;
                    toast = Toast.makeText(personalityLightStopEditActivity, personalityLightStopEditActivity.getText(2131755306), 0);
                } else {
                    toast = Toast.makeText(PersonalityLightStopEditActivity.this, str, 0);
                }
                toast.show();
            }

            /* renamed from: f */
            public void mo23767f() {
            }

            /* renamed from: n */
            public void mo23768n(boolean z, List<C9849r> list) {
            }

            public void onRefresh() {
            }

            /* renamed from: p */
            public void mo23770p(String str) {
            }
        }

        C5511b() {
        }

        public void onClick(View view) {
            C9830b bVar = C4300b0.m12083u().mo23745i().get(PersonalityLightStopEditActivity.this.f11513i);
            bVar.mo31871c().mo31726k(PersonalityLightStopEditActivity.this.f11512h);
            C4300b0.m12083u().mo23740C(bVar, new C5512a());
            PersonalityLightStopEditActivity.this.finish();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.PersonalityLightStopEditActivity$c */
    class C5513c implements View.OnClickListener {
        C5513c() {
        }

        public void onClick(View view) {
            C9843l unused = PersonalityLightStopEditActivity.this.f11512h = C9843l.RECOVER;
            PersonalityLightStopEditActivity.this.m16813b0();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.PersonalityLightStopEditActivity$d */
    class C5514d implements View.OnClickListener {
        C5514d() {
        }

        public void onClick(View view) {
            C9843l unused = PersonalityLightStopEditActivity.this.f11512h = C9843l.STAY;
            PersonalityLightStopEditActivity.this.m16813b0();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.PersonalityLightStopEditActivity$e */
    class C5515e implements View.OnClickListener {
        C5515e() {
        }

        public void onClick(View view) {
            C9843l unused = PersonalityLightStopEditActivity.this.f11512h = C9843l.OFF;
            PersonalityLightStopEditActivity.this.m16813b0();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.PersonalityLightStopEditActivity$f */
    class C5516f implements Runnable {
        C5516f() {
        }

        public void run() {
            int i = C5517g.f11521a[PersonalityLightStopEditActivity.this.f11512h.ordinal()];
            if (i == 1) {
                PersonalityLightStopEditActivity.this.f11506b.setEnabled(true);
                PersonalityLightStopEditActivity.this.f11507c.setEnabled(false);
            } else if (i == 2) {
                PersonalityLightStopEditActivity.this.f11506b.setEnabled(false);
                PersonalityLightStopEditActivity.this.f11507c.setEnabled(true);
            } else if (i == 3) {
                PersonalityLightStopEditActivity.this.f11506b.setEnabled(false);
                PersonalityLightStopEditActivity.this.f11507c.setEnabled(false);
                PersonalityLightStopEditActivity.this.f11508d.setEnabled(true);
                return;
            } else {
                return;
            }
            PersonalityLightStopEditActivity.this.f11508d.setEnabled(false);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.PersonalityLightStopEditActivity$g */
    static /* synthetic */ class C5517g {

        /* renamed from: a */
        static final /* synthetic */ int[] f11521a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.yeelight.yeelib.g.l[] r0 = com.yeelight.yeelib.p153g.C9843l.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f11521a = r0
                com.yeelight.yeelib.g.l r1 = com.yeelight.yeelib.p153g.C9843l.RECOVER     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f11521a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.yeelight.yeelib.g.l r1 = com.yeelight.yeelib.p153g.C9843l.STAY     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f11521a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.yeelight.yeelib.g.l r1 = com.yeelight.yeelib.p153g.C9843l.OFF     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.cherry.p177ui.activity.PersonalityLightStopEditActivity.C5517g.<clinit>():void");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b0 */
    public void m16813b0() {
        this.f11506b.post(new C5516f());
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo32193P();
        C10547m.m25758h(true, this);
        setContentView(C11748R$layout.activity_personality_stop_edit);
        CommonTitleBar commonTitleBar = (CommonTitleBar) findViewById(2131297424);
        commonTitleBar.mo32825a(getText(2131756012).toString(), new C5510a(), new C5511b());
        commonTitleBar.setTitleTextSize(16);
        commonTitleBar.setRightTextColor(getResources().getColor(2131099802));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        commonTitleBar.setLayoutParams(layoutParams);
        layoutParams.setMargins(0, C10547m.m25755e(this), 0, 0);
        Intent intent = getIntent();
        if (!intent.hasExtra("custom_scene_index")) {
            C4308b.m12141t(f11505j, "Activity has not edit scene index", false);
            finish();
            return;
        }
        this.f11506b = (ImageView) findViewById(C11745R$id.stop_recovery_select_img);
        this.f11507c = (ImageView) findViewById(C11745R$id.stop_stay_select_img);
        this.f11508d = (ImageView) findViewById(C11745R$id.stop_off_select_img);
        this.f11509e = (LinearLayout) findViewById(C11745R$id.stop_recovery_layout);
        this.f11510f = (LinearLayout) findViewById(C11745R$id.stop_stay_layout);
        this.f11511g = (LinearLayout) findViewById(C11745R$id.stop_off_layout);
        this.f11513i = intent.getIntExtra("custom_scene_index", -1);
        this.f11512h = C4300b0.m12083u().mo23745i().get(this.f11513i).mo31871c().mo31721f();
        this.f11509e.setOnClickListener(new C5513c());
        this.f11510f.setOnClickListener(new C5514d());
        this.f11511g.setOnClickListener(new C5515e());
        m16813b0();
    }
}
