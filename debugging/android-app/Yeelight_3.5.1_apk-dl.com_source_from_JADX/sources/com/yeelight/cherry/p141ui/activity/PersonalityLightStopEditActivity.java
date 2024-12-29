package com.yeelight.cherry.p141ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;
import com.yeelight.cherry.C12225R$id;
import com.yeelight.cherry.C12228R$layout;
import com.yeelight.yeelib.models.C3112v;
import com.yeelight.yeelib.models.C8309b;
import com.yeelight.yeelib.models.C8321m;
import com.yeelight.yeelib.models.FlowCompleteAction;
import com.yeelight.yeelib.p142ui.activity.BaseActivity;
import com.yeelight.yeelib.p142ui.view.CommonTitleBar;
import com.yeelight.yeelib.utils.AppUtils;
import java.util.List;
import p051j4.C9193k;

/* renamed from: com.yeelight.cherry.ui.activity.PersonalityLightStopEditActivity */
public class PersonalityLightStopEditActivity extends BaseActivity {

    /* renamed from: i */
    private static String f11069i = "PersonalityLightStopEditActivity";
    /* access modifiers changed from: private */

    /* renamed from: a */
    public ImageView f11070a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public ImageView f11071b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public ImageView f11072c;

    /* renamed from: d */
    private LinearLayout f11073d;

    /* renamed from: e */
    private LinearLayout f11074e;

    /* renamed from: f */
    private LinearLayout f11075f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public FlowCompleteAction f11076g;

    /* renamed from: h */
    int f11077h;

    /* renamed from: com.yeelight.cherry.ui.activity.PersonalityLightStopEditActivity$a */
    class C5553a implements View.OnClickListener {
        C5553a() {
        }

        public void onClick(View view) {
            PersonalityLightStopEditActivity.this.onBackPressed();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.PersonalityLightStopEditActivity$b */
    class C5554b implements View.OnClickListener {

        /* renamed from: com.yeelight.cherry.ui.activity.PersonalityLightStopEditActivity$b$a */
        class C5555a implements C3112v.C3119g {
            C5555a() {
            }

            /* access modifiers changed from: private */
            /* renamed from: c */
            public /* synthetic */ void m16790c(String str) {
                Toast toast;
                if (str == null || str.isEmpty()) {
                    PersonalityLightStopEditActivity personalityLightStopEditActivity = PersonalityLightStopEditActivity.this;
                    toast = Toast.makeText(personalityLightStopEditActivity, personalityLightStopEditActivity.getText(2131755310), 0);
                } else {
                    toast = Toast.makeText(PersonalityLightStopEditActivity.this, str, 0);
                }
                toast.show();
            }

            /* renamed from: a */
            public void mo23579a(String str) {
                PersonalityLightStopEditActivity.this.runOnUiThread(new C5779j2(this, str));
            }

            /* renamed from: g */
            public void mo23580g() {
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

        C5554b() {
        }

        public void onClick(View view) {
            C8309b bVar = C3112v.m8242u().mo23558i().get(PersonalityLightStopEditActivity.this.f11077h);
            bVar.mo35436c().mo35341k(PersonalityLightStopEditActivity.this.f11076g);
            C3112v.m8242u().mo23553B(bVar, new C5555a());
            PersonalityLightStopEditActivity.this.finish();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.PersonalityLightStopEditActivity$c */
    class C5556c implements View.OnClickListener {
        C5556c() {
        }

        public void onClick(View view) {
            FlowCompleteAction unused = PersonalityLightStopEditActivity.this.f11076g = FlowCompleteAction.RECOVER;
            PersonalityLightStopEditActivity.this.m16788b0();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.PersonalityLightStopEditActivity$d */
    class C5557d implements View.OnClickListener {
        C5557d() {
        }

        public void onClick(View view) {
            FlowCompleteAction unused = PersonalityLightStopEditActivity.this.f11076g = FlowCompleteAction.STAY;
            PersonalityLightStopEditActivity.this.m16788b0();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.PersonalityLightStopEditActivity$e */
    class C5558e implements View.OnClickListener {
        C5558e() {
        }

        public void onClick(View view) {
            FlowCompleteAction unused = PersonalityLightStopEditActivity.this.f11076g = FlowCompleteAction.OFF;
            PersonalityLightStopEditActivity.this.m16788b0();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.PersonalityLightStopEditActivity$f */
    class C5559f implements Runnable {
        C5559f() {
        }

        public void run() {
            int i = C5560g.f11085a[PersonalityLightStopEditActivity.this.f11076g.ordinal()];
            if (i == 1) {
                PersonalityLightStopEditActivity.this.f11070a.setEnabled(true);
                PersonalityLightStopEditActivity.this.f11071b.setEnabled(false);
            } else if (i == 2) {
                PersonalityLightStopEditActivity.this.f11070a.setEnabled(false);
                PersonalityLightStopEditActivity.this.f11071b.setEnabled(true);
            } else if (i == 3) {
                PersonalityLightStopEditActivity.this.f11070a.setEnabled(false);
                PersonalityLightStopEditActivity.this.f11071b.setEnabled(false);
                PersonalityLightStopEditActivity.this.f11072c.setEnabled(true);
                return;
            } else {
                return;
            }
            PersonalityLightStopEditActivity.this.f11072c.setEnabled(false);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.PersonalityLightStopEditActivity$g */
    static /* synthetic */ class C5560g {

        /* renamed from: a */
        static final /* synthetic */ int[] f11085a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.yeelight.yeelib.models.FlowCompleteAction[] r0 = com.yeelight.yeelib.models.FlowCompleteAction.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f11085a = r0
                com.yeelight.yeelib.models.FlowCompleteAction r1 = com.yeelight.yeelib.models.FlowCompleteAction.RECOVER     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f11085a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.yeelight.yeelib.models.FlowCompleteAction r1 = com.yeelight.yeelib.models.FlowCompleteAction.STAY     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f11085a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.yeelight.yeelib.models.FlowCompleteAction r1 = com.yeelight.yeelib.models.FlowCompleteAction.OFF     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.cherry.p141ui.activity.PersonalityLightStopEditActivity.C5560g.<clinit>():void");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b0 */
    public void m16788b0() {
        this.f11070a.post(new C5559f());
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo35653P();
        C9193k.m22157h(true, this);
        setContentView(C12228R$layout.activity_personality_stop_edit);
        CommonTitleBar commonTitleBar = (CommonTitleBar) findViewById(2131297591);
        commonTitleBar.mo36195a(getText(2131756024).toString(), new C5553a(), new C5554b());
        commonTitleBar.setTitleTextSize(16);
        commonTitleBar.setRightTextColor(getResources().getColor(2131099805));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        commonTitleBar.setLayoutParams(layoutParams);
        layoutParams.setMargins(0, C9193k.m22154e(this), 0, 0);
        Intent intent = getIntent();
        if (!intent.hasExtra("custom_scene_index")) {
            AppUtils.m8302w(f11069i, "Activity has not edit scene index", false);
            finish();
            return;
        }
        this.f11070a = (ImageView) findViewById(C12225R$id.stop_recovery_select_img);
        this.f11071b = (ImageView) findViewById(C12225R$id.stop_stay_select_img);
        this.f11072c = (ImageView) findViewById(C12225R$id.stop_off_select_img);
        this.f11073d = (LinearLayout) findViewById(C12225R$id.stop_recovery_layout);
        this.f11074e = (LinearLayout) findViewById(C12225R$id.stop_stay_layout);
        this.f11075f = (LinearLayout) findViewById(C12225R$id.stop_off_layout);
        this.f11077h = intent.getIntExtra("custom_scene_index", -1);
        this.f11076g = C3112v.m8242u().mo23558i().get(this.f11077h).mo35436c().mo35336f();
        this.f11073d.setOnClickListener(new C5556c());
        this.f11074e.setOnClickListener(new C5557d());
        this.f11075f.setOnClickListener(new C5558e());
        m16788b0();
    }
}
