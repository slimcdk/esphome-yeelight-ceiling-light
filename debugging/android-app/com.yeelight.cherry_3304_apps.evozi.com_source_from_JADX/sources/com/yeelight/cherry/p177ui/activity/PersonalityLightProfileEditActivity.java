package com.yeelight.cherry.p177ui.activity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.yeelight.cherry.C11745R$id;
import com.yeelight.cherry.C11748R$layout;
import com.yeelight.yeelib.p153g.C4300b0;
import com.yeelight.yeelib.p153g.C9849r;
import com.yeelight.yeelib.p194ui.activity.BaseActivity;
import com.yeelight.yeelib.p194ui.view.CommonTitleBar;
import com.yeelight.yeelib.p194ui.widget.C10526e;
import com.yeelight.yeelib.utils.C10547m;
import com.yeelight.yeelib.utils.C4308b;
import java.util.List;

/* renamed from: com.yeelight.cherry.ui.activity.PersonalityLightProfileEditActivity */
public class PersonalityLightProfileEditActivity extends BaseActivity {

    /* renamed from: l */
    private static String f11462l = PersonalityLightProfileEditActivity.class.getSimpleName();

    /* renamed from: b */
    private LinearLayout f11463b;

    /* renamed from: c */
    private LinearLayout f11464c;

    /* renamed from: d */
    private LinearLayout f11465d;

    /* renamed from: e */
    private LinearLayout f11466e;

    /* renamed from: f */
    private ImageView f11467f;

    /* renamed from: g */
    private TextView f11468g;

    /* renamed from: h */
    private TextView f11469h;

    /* renamed from: i */
    private TextView f11470i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public int f11471j;

    /* renamed from: k */
    private TextView f11472k;

    /* renamed from: com.yeelight.cherry.ui.activity.PersonalityLightProfileEditActivity$a */
    class C5490a implements View.OnClickListener {
        C5490a() {
        }

        public void onClick(View view) {
            PersonalityLightProfileEditActivity.this.onBackPressed();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.PersonalityLightProfileEditActivity$b */
    class C5491b implements View.OnClickListener {
        C5491b() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(PersonalityLightProfileEditActivity.this, ImageModeSelectionActivity.class);
            intent.putExtra("type_edit", true);
            intent.putExtra("custom_scene_index", PersonalityLightProfileEditActivity.this.f11471j);
            PersonalityLightProfileEditActivity.this.startActivity(intent);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.PersonalityLightProfileEditActivity$c */
    class C5492c implements View.OnClickListener {
        C5492c() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(PersonalityLightProfileEditActivity.this, PersonalityLightNameEditActivity.class);
            intent.putExtra("custom_scene_index", PersonalityLightProfileEditActivity.this.f11471j);
            PersonalityLightProfileEditActivity.this.startActivity(intent);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.PersonalityLightProfileEditActivity$d */
    class C5493d implements View.OnClickListener {
        C5493d() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(PersonalityLightProfileEditActivity.this, PersonalityLightRepeatEditActivity.class);
            intent.putExtra("custom_scene_index", PersonalityLightProfileEditActivity.this.f11471j);
            PersonalityLightProfileEditActivity.this.startActivity(intent);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.PersonalityLightProfileEditActivity$e */
    class C5494e implements View.OnClickListener {
        C5494e() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(PersonalityLightProfileEditActivity.this, PersonalityLightStopEditActivity.class);
            intent.putExtra("custom_scene_index", PersonalityLightProfileEditActivity.this.f11471j);
            PersonalityLightProfileEditActivity.this.startActivity(intent);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.PersonalityLightProfileEditActivity$f */
    class C5495f implements View.OnClickListener {

        /* renamed from: com.yeelight.cherry.ui.activity.PersonalityLightProfileEditActivity$f$a */
        class C5496a implements DialogInterface.OnClickListener {

            /* renamed from: com.yeelight.cherry.ui.activity.PersonalityLightProfileEditActivity$f$a$a */
            class C5497a implements C4300b0.C4307g {
                C5497a() {
                }

                /* renamed from: a */
                public void mo23766a(String str) {
                    PersonalityLightProfileEditActivity.this.runOnUiThread(new C5762q1(this, str));
                }

                /* renamed from: b */
                public /* synthetic */ void mo26756b(String str) {
                    Toast toast;
                    if (str == null || str.isEmpty()) {
                        PersonalityLightProfileEditActivity personalityLightProfileEditActivity = PersonalityLightProfileEditActivity.this;
                        toast = Toast.makeText(personalityLightProfileEditActivity, personalityLightProfileEditActivity.getText(2131755306), 0);
                    } else {
                        toast = Toast.makeText(PersonalityLightProfileEditActivity.this, str, 0);
                    }
                    toast.show();
                }

                /* renamed from: f */
                public void mo23767f() {
                    Intent intent = new Intent();
                    intent.setFlags(67108864);
                    intent.setClass(PersonalityLightProfileEditActivity.this, PersonalityLightingActivity.class);
                    PersonalityLightProfileEditActivity.this.startActivity(intent);
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

            C5496a() {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                C4300b0.m12083u().mo23742f(C4300b0.m12083u().mo23745i().get(PersonalityLightProfileEditActivity.this.f11471j), new C5497a());
            }
        }

        C5495f() {
        }

        public void onClick(View view) {
            C10526e.C10531e eVar = new C10526e.C10531e(PersonalityLightProfileEditActivity.this);
            eVar.mo33358i(PersonalityLightProfileEditActivity.this.getString(2131755244));
            eVar.mo33356g(PersonalityLightProfileEditActivity.this.getString(2131756016));
            eVar.mo33353d(-2, PersonalityLightProfileEditActivity.this.getString(2131755229), (DialogInterface.OnClickListener) null);
            eVar.mo33353d(-1, PersonalityLightProfileEditActivity.this.getString(2131755277), new C5496a());
            eVar.mo33359j();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.PersonalityLightProfileEditActivity$g */
    static /* synthetic */ class C5498g {

        /* renamed from: a */
        static final /* synthetic */ int[] f11481a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.yeelight.yeelib.g.l[] r0 = com.yeelight.yeelib.p153g.C9843l.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f11481a = r0
                com.yeelight.yeelib.g.l r1 = com.yeelight.yeelib.p153g.C9843l.RECOVER     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f11481a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.yeelight.yeelib.g.l r1 = com.yeelight.yeelib.p153g.C9843l.STAY     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f11481a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.yeelight.yeelib.g.l r1 = com.yeelight.yeelib.p153g.C9843l.OFF     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.cherry.p177ui.activity.PersonalityLightProfileEditActivity.C5498g.<clinit>():void");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0080  */
    /* renamed from: W */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m16785W() {
        /*
            r4 = this;
            com.yeelight.yeelib.g.b0 r0 = com.yeelight.yeelib.p153g.C4300b0.m12083u()
            java.util.List r0 = r0.mo23745i()
            int r1 = r4.f11471j
            java.lang.Object r0 = r0.get(r1)
            com.yeelight.yeelib.g.i r0 = (com.yeelight.yeelib.p153g.C9838i) r0
            int r1 = r0.mo31761d0()
            if (r1 <= 0) goto L_0x001b
            int r1 = r0.mo31761d0()
            goto L_0x001c
        L_0x001b:
            r1 = 0
        L_0x001c:
            android.widget.ImageView r2 = r4.f11467f
            java.util.List<java.lang.Integer> r3 = com.yeelight.yeelib.utils.C10549p.f20166a
            java.lang.Object r1 = r3.get(r1)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r2.setImageResource(r1)
            android.widget.TextView r1 = r4.f11468g
            java.lang.String r2 = r0.mo31888t()
            r1.setText(r2)
            com.yeelight.yeelib.g.a r1 = r0.mo31871c()
            int r1 = r1.mo31725j()
            r2 = 1
            if (r1 != 0) goto L_0x004a
            android.widget.TextView r1 = r4.f11469h
            r3 = 2131756007(0x7f1003e7, float:1.914291E38)
        L_0x0046:
            r1.setText(r3)
            goto L_0x005b
        L_0x004a:
            if (r1 != r2) goto L_0x0052
            android.widget.TextView r1 = r4.f11469h
            r3 = 2131756008(0x7f1003e8, float:1.9142911E38)
            goto L_0x0046
        L_0x0052:
            android.widget.TextView r3 = r4.f11469h
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r3.setText(r1)
        L_0x005b:
            com.yeelight.yeelib.g.a r0 = r0.mo31871c()
            com.yeelight.yeelib.g.l r0 = r0.mo31721f()
            int[] r1 = com.yeelight.cherry.p177ui.activity.PersonalityLightProfileEditActivity.C5498g.f11481a
            int r0 = r0.ordinal()
            r0 = r1[r0]
            if (r0 == r2) goto L_0x0080
            r1 = 2
            if (r0 == r1) goto L_0x007a
            r1 = 3
            if (r0 == r1) goto L_0x0074
            goto L_0x0088
        L_0x0074:
            android.widget.TextView r0 = r4.f11470i
            r1 = 2131756015(0x7f1003ef, float:1.9142926E38)
            goto L_0x0085
        L_0x007a:
            android.widget.TextView r0 = r4.f11470i
            r1 = 2131756014(0x7f1003ee, float:1.9142924E38)
            goto L_0x0085
        L_0x0080:
            android.widget.TextView r0 = r4.f11470i
            r1 = 2131756013(0x7f1003ed, float:1.9142922E38)
        L_0x0085:
            r0.setText(r1)
        L_0x0088:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yeelight.cherry.p177ui.activity.PersonalityLightProfileEditActivity.m16785W():void");
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo32193P();
        C10547m.m25758h(true, this);
        setContentView(C11748R$layout.activity_personality_profile_edit);
        Intent intent = getIntent();
        if (!intent.hasExtra("custom_scene_index")) {
            C4308b.m12141t(f11462l, "Activity has not edit scene index", false);
            finish();
            return;
        }
        this.f11471j = intent.getIntExtra("custom_scene_index", -1);
        CommonTitleBar commonTitleBar = (CommonTitleBar) findViewById(2131297424);
        commonTitleBar.mo32825a(getString(2131755313), new C5490a(), (View.OnClickListener) null);
        commonTitleBar.setTitleTextSize(16);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        commonTitleBar.setLayoutParams(layoutParams);
        layoutParams.setMargins(0, C10547m.m25755e(this), 0, 0);
        this.f11463b = (LinearLayout) findViewById(C11745R$id.light_type_layout);
        this.f11464c = (LinearLayout) findViewById(C11745R$id.light_name_layout);
        this.f11465d = (LinearLayout) findViewById(C11745R$id.light_repeat_layout);
        this.f11466e = (LinearLayout) findViewById(C11745R$id.light_stop_layout);
        this.f11467f = (ImageView) findViewById(C11745R$id.light_type_img);
        this.f11468g = (TextView) findViewById(C11745R$id.light_name);
        this.f11469h = (TextView) findViewById(C11745R$id.light_repeat);
        this.f11470i = (TextView) findViewById(C11745R$id.light_stop);
        this.f11472k = (TextView) findViewById(C11745R$id.scene_delete);
        this.f11463b.setOnClickListener(new C5491b());
        this.f11464c.setOnClickListener(new C5492c());
        this.f11465d.setOnClickListener(new C5493d());
        this.f11466e.setOnClickListener(new C5494e());
        this.f11472k.setOnClickListener(new C5495f());
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        m16785W();
    }
}
