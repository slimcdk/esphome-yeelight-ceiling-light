package com.yeelight.cherry.p141ui.activity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.yeelight.cherry.C12225R$id;
import com.yeelight.cherry.C12228R$layout;
import com.yeelight.yeelib.models.C3112v;
import com.yeelight.yeelib.models.C8321m;
import com.yeelight.yeelib.p142ui.activity.BaseActivity;
import com.yeelight.yeelib.p142ui.view.CommonTitleBar;
import com.yeelight.yeelib.utils.AppUtils;
import java.util.List;
import p051j4.C9193k;
import p170i4.C9113d;

/* renamed from: com.yeelight.cherry.ui.activity.PersonalityLightProfileEditActivity */
public class PersonalityLightProfileEditActivity extends BaseActivity {

    /* renamed from: k */
    private static String f11026k = "PersonalityLightProfileEditActivity";

    /* renamed from: a */
    private LinearLayout f11027a;

    /* renamed from: b */
    private LinearLayout f11028b;

    /* renamed from: c */
    private LinearLayout f11029c;

    /* renamed from: d */
    private LinearLayout f11030d;

    /* renamed from: e */
    private ImageView f11031e;

    /* renamed from: f */
    private TextView f11032f;

    /* renamed from: g */
    private TextView f11033g;

    /* renamed from: h */
    private TextView f11034h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public int f11035i;

    /* renamed from: j */
    private TextView f11036j;

    /* renamed from: com.yeelight.cherry.ui.activity.PersonalityLightProfileEditActivity$a */
    class C5533a implements View.OnClickListener {
        C5533a() {
        }

        public void onClick(View view) {
            PersonalityLightProfileEditActivity.this.onBackPressed();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.PersonalityLightProfileEditActivity$b */
    class C5534b implements View.OnClickListener {
        C5534b() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(PersonalityLightProfileEditActivity.this, ImageModeSelectionActivity.class);
            intent.putExtra("type_edit", true);
            intent.putExtra("custom_scene_index", PersonalityLightProfileEditActivity.this.f11035i);
            PersonalityLightProfileEditActivity.this.startActivity(intent);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.PersonalityLightProfileEditActivity$c */
    class C5535c implements View.OnClickListener {
        C5535c() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(PersonalityLightProfileEditActivity.this, PersonalityLightNameEditActivity.class);
            intent.putExtra("custom_scene_index", PersonalityLightProfileEditActivity.this.f11035i);
            PersonalityLightProfileEditActivity.this.startActivity(intent);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.PersonalityLightProfileEditActivity$d */
    class C5536d implements View.OnClickListener {
        C5536d() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(PersonalityLightProfileEditActivity.this, PersonalityLightRepeatEditActivity.class);
            intent.putExtra("custom_scene_index", PersonalityLightProfileEditActivity.this.f11035i);
            PersonalityLightProfileEditActivity.this.startActivity(intent);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.PersonalityLightProfileEditActivity$e */
    class C5537e implements View.OnClickListener {
        C5537e() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(PersonalityLightProfileEditActivity.this, PersonalityLightStopEditActivity.class);
            intent.putExtra("custom_scene_index", PersonalityLightProfileEditActivity.this.f11035i);
            PersonalityLightProfileEditActivity.this.startActivity(intent);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.PersonalityLightProfileEditActivity$f */
    class C5538f implements View.OnClickListener {

        /* renamed from: com.yeelight.cherry.ui.activity.PersonalityLightProfileEditActivity$f$a */
        class C5539a implements DialogInterface.OnClickListener {

            /* renamed from: com.yeelight.cherry.ui.activity.PersonalityLightProfileEditActivity$f$a$a */
            class C5540a implements C3112v.C3119g {
                C5540a() {
                }

                /* access modifiers changed from: private */
                /* renamed from: c */
                public /* synthetic */ void m16760c(String str) {
                    Toast toast;
                    if (str == null || str.isEmpty()) {
                        PersonalityLightProfileEditActivity personalityLightProfileEditActivity = PersonalityLightProfileEditActivity.this;
                        toast = Toast.makeText(personalityLightProfileEditActivity, personalityLightProfileEditActivity.getText(2131755310), 0);
                    } else {
                        toast = Toast.makeText(PersonalityLightProfileEditActivity.this, str, 0);
                    }
                    toast.show();
                }

                /* renamed from: a */
                public void mo23579a(String str) {
                    PersonalityLightProfileEditActivity.this.runOnUiThread(new C5767h2(this, str));
                }

                /* renamed from: g */
                public void mo23580g() {
                    Intent intent = new Intent();
                    intent.setFlags(67108864);
                    intent.setClass(PersonalityLightProfileEditActivity.this, PersonalityLightingActivity.class);
                    PersonalityLightProfileEditActivity.this.startActivity(intent);
                }

                public void onRefresh() {
                }

                /* renamed from: r */
                public void mo23582r(boolean z, List<C8321m> list) {
                }

                /* renamed from: s */
                public void mo23583s(String str) {
                }
            }

            C5539a() {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                C3112v.m8242u().mo23555f(C3112v.m8242u().mo23558i().get(PersonalityLightProfileEditActivity.this.f11035i), new C5540a());
            }
        }

        C5538f() {
        }

        public void onClick(View view) {
            C9113d.C9118e eVar = new C9113d.C9118e(PersonalityLightProfileEditActivity.this);
            eVar.mo37179i(PersonalityLightProfileEditActivity.this.getString(2131755247)).mo37177g(PersonalityLightProfileEditActivity.this.getString(2131756028)).mo37174d(-2, PersonalityLightProfileEditActivity.this.getString(2131755232), (DialogInterface.OnClickListener) null).mo37174d(-1, PersonalityLightProfileEditActivity.this.getString(2131755281), new C5539a());
            eVar.mo37180j();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.PersonalityLightProfileEditActivity$g */
    static /* synthetic */ class C5541g {

        /* renamed from: a */
        static final /* synthetic */ int[] f11045a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.yeelight.yeelib.models.FlowCompleteAction[] r0 = com.yeelight.yeelib.models.FlowCompleteAction.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f11045a = r0
                com.yeelight.yeelib.models.FlowCompleteAction r1 = com.yeelight.yeelib.models.FlowCompleteAction.RECOVER     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f11045a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.yeelight.yeelib.models.FlowCompleteAction r1 = com.yeelight.yeelib.models.FlowCompleteAction.STAY     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f11045a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.yeelight.yeelib.models.FlowCompleteAction r1 = com.yeelight.yeelib.models.FlowCompleteAction.OFF     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.cherry.p141ui.activity.PersonalityLightProfileEditActivity.C5541g.<clinit>():void");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0080  */
    /* renamed from: W */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m16758W() {
        /*
            r4 = this;
            com.yeelight.yeelib.models.v r0 = com.yeelight.yeelib.models.C3112v.m8242u()
            java.util.List r0 = r0.mo23558i()
            int r1 = r4.f11035i
            java.lang.Object r0 = r0.get(r1)
            com.yeelight.yeelib.models.CustomAdvancedFlowScene r0 = (com.yeelight.yeelib.models.CustomAdvancedFlowScene) r0
            int r1 = r0.mo35296d0()
            if (r1 <= 0) goto L_0x001b
            int r1 = r0.mo35296d0()
            goto L_0x001c
        L_0x001b:
            r1 = 0
        L_0x001c:
            android.widget.ImageView r2 = r4.f11031e
            java.util.List<java.lang.Integer> r3 = p051j4.C9195n.f17011a
            java.lang.Object r1 = r3.get(r1)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r2.setImageResource(r1)
            android.widget.TextView r1 = r4.f11032f
            java.lang.String r2 = r0.mo35453t()
            r1.setText(r2)
            com.yeelight.yeelib.models.a r1 = r0.mo35436c()
            int r1 = r1.mo35340j()
            r2 = 1
            if (r1 != 0) goto L_0x004a
            android.widget.TextView r1 = r4.f11033g
            r3 = 2131756019(0x7f1003f3, float:1.9142934E38)
        L_0x0046:
            r1.setText(r3)
            goto L_0x005b
        L_0x004a:
            if (r1 != r2) goto L_0x0052
            android.widget.TextView r1 = r4.f11033g
            r3 = 2131756020(0x7f1003f4, float:1.9142936E38)
            goto L_0x0046
        L_0x0052:
            android.widget.TextView r3 = r4.f11033g
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r3.setText(r1)
        L_0x005b:
            com.yeelight.yeelib.models.a r0 = r0.mo35436c()
            com.yeelight.yeelib.models.FlowCompleteAction r0 = r0.mo35336f()
            int[] r1 = com.yeelight.cherry.p141ui.activity.PersonalityLightProfileEditActivity.C5541g.f11045a
            int r0 = r0.ordinal()
            r0 = r1[r0]
            if (r0 == r2) goto L_0x0080
            r1 = 2
            if (r0 == r1) goto L_0x007a
            r1 = 3
            if (r0 == r1) goto L_0x0074
            goto L_0x0088
        L_0x0074:
            android.widget.TextView r0 = r4.f11034h
            r1 = 2131756027(0x7f1003fb, float:1.914295E38)
            goto L_0x0085
        L_0x007a:
            android.widget.TextView r0 = r4.f11034h
            r1 = 2131756026(0x7f1003fa, float:1.9142948E38)
            goto L_0x0085
        L_0x0080:
            android.widget.TextView r0 = r4.f11034h
            r1 = 2131756025(0x7f1003f9, float:1.9142946E38)
        L_0x0085:
            r0.setText(r1)
        L_0x0088:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yeelight.cherry.p141ui.activity.PersonalityLightProfileEditActivity.m16758W():void");
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo35653P();
        C9193k.m22157h(true, this);
        setContentView(C12228R$layout.activity_personality_profile_edit);
        Intent intent = getIntent();
        if (!intent.hasExtra("custom_scene_index")) {
            AppUtils.m8302w(f11026k, "Activity has not edit scene index", false);
            finish();
            return;
        }
        this.f11035i = intent.getIntExtra("custom_scene_index", -1);
        CommonTitleBar commonTitleBar = (CommonTitleBar) findViewById(2131297591);
        commonTitleBar.mo36195a(getString(2131755317), new C5533a(), (View.OnClickListener) null);
        commonTitleBar.setTitleTextSize(16);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        commonTitleBar.setLayoutParams(layoutParams);
        layoutParams.setMargins(0, C9193k.m22154e(this), 0, 0);
        this.f11027a = (LinearLayout) findViewById(C12225R$id.light_type_layout);
        this.f11028b = (LinearLayout) findViewById(C12225R$id.light_name_layout);
        this.f11029c = (LinearLayout) findViewById(C12225R$id.light_repeat_layout);
        this.f11030d = (LinearLayout) findViewById(C12225R$id.light_stop_layout);
        this.f11031e = (ImageView) findViewById(C12225R$id.light_type_img);
        this.f11032f = (TextView) findViewById(C12225R$id.light_name);
        this.f11033g = (TextView) findViewById(C12225R$id.light_repeat);
        this.f11034h = (TextView) findViewById(C12225R$id.light_stop);
        this.f11036j = (TextView) findViewById(C12225R$id.scene_delete);
        this.f11027a.setOnClickListener(new C5534b());
        this.f11028b.setOnClickListener(new C5535c());
        this.f11029c.setOnClickListener(new C5536d());
        this.f11030d.setOnClickListener(new C5537e());
        this.f11036j.setOnClickListener(new C5538f());
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        m16758W();
    }
}
