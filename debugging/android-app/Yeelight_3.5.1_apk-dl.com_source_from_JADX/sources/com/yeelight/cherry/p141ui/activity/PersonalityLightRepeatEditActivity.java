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
import android.widget.Toast;
import com.yeelight.cherry.C12225R$id;
import com.yeelight.cherry.C12228R$layout;
import com.yeelight.yeelib.models.C3112v;
import com.yeelight.yeelib.models.C8309b;
import com.yeelight.yeelib.models.C8321m;
import com.yeelight.yeelib.p142ui.activity.BaseActivity;
import com.yeelight.yeelib.p142ui.view.CommonTitleBar;
import com.yeelight.yeelib.utils.AppUtils;
import java.util.List;
import p051j4.C9183a0;
import p051j4.C9193k;
import p170i4.C9113d;

/* renamed from: com.yeelight.cherry.ui.activity.PersonalityLightRepeatEditActivity */
public class PersonalityLightRepeatEditActivity extends BaseActivity {

    /* renamed from: l */
    private static String f11046l = "PersonalityLightRepeatEditActivity";
    /* access modifiers changed from: private */

    /* renamed from: a */
    public ImageView f11047a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public ImageView f11048b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public ImageView f11049c;

    /* renamed from: d */
    private LinearLayout f11050d;

    /* renamed from: e */
    private LinearLayout f11051e;

    /* renamed from: f */
    private LinearLayout f11052f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public TextView f11053g;

    /* renamed from: h */
    int f11054h;

    /* renamed from: i */
    int f11055i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public C9113d f11056j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public Handler f11057k = new C5542a();

    /* renamed from: com.yeelight.cherry.ui.activity.PersonalityLightRepeatEditActivity$a */
    class C5542a extends Handler {
        C5542a() {
        }

        public void handleMessage(Message message) {
            int intValue;
            super.handleMessage(message);
            if (message.what == 0) {
                String str = (String) message.obj;
                if (PersonalityLightRepeatEditActivity.this.f11056j == null) {
                    return;
                }
                if (TextUtils.isEmpty(str) || ((intValue = Integer.valueOf(str).intValue()) >= 2 && intValue <= 99)) {
                    PersonalityLightRepeatEditActivity.this.f11056j.mo37159j(2131756018);
                    PersonalityLightRepeatEditActivity.this.f11056j.mo37161l(2131099841);
                    return;
                }
                PersonalityLightRepeatEditActivity.this.f11056j.mo37159j(2131756017);
                PersonalityLightRepeatEditActivity.this.f11056j.mo37161l(2131099842);
            }
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.PersonalityLightRepeatEditActivity$b */
    class C5543b implements View.OnClickListener {
        C5543b() {
        }

        public void onClick(View view) {
            PersonalityLightRepeatEditActivity.this.onBackPressed();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.PersonalityLightRepeatEditActivity$c */
    class C5544c implements View.OnClickListener {

        /* renamed from: com.yeelight.cherry.ui.activity.PersonalityLightRepeatEditActivity$c$a */
        class C5545a implements C3112v.C3119g {
            C5545a() {
            }

            /* access modifiers changed from: private */
            /* renamed from: c */
            public /* synthetic */ void m16776c(String str) {
                Toast toast;
                if (str == null || str.isEmpty()) {
                    PersonalityLightRepeatEditActivity personalityLightRepeatEditActivity = PersonalityLightRepeatEditActivity.this;
                    toast = Toast.makeText(personalityLightRepeatEditActivity, personalityLightRepeatEditActivity.getText(2131755310), 0);
                } else {
                    toast = Toast.makeText(PersonalityLightRepeatEditActivity.this, str, 0);
                }
                toast.show();
            }

            /* renamed from: a */
            public void mo23579a(String str) {
                PersonalityLightRepeatEditActivity.this.runOnUiThread(new C5773i2(this, str));
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

        C5544c() {
        }

        public void onClick(View view) {
            C8309b bVar = C3112v.m8242u().mo23558i().get(PersonalityLightRepeatEditActivity.this.f11055i);
            bVar.mo35436c().mo35343m(PersonalityLightRepeatEditActivity.this.f11054h);
            bVar.mo35436c().mo35342l(PersonalityLightRepeatEditActivity.this.f11054h * bVar.mo35436c().mo35338h().size());
            C3112v.m8242u().mo23553B(C3112v.m8242u().mo23558i().get(PersonalityLightRepeatEditActivity.this.f11055i), new C5545a());
            PersonalityLightRepeatEditActivity.this.finish();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.PersonalityLightRepeatEditActivity$d */
    class C5546d implements View.OnClickListener {
        C5546d() {
        }

        public void onClick(View view) {
            PersonalityLightRepeatEditActivity personalityLightRepeatEditActivity = PersonalityLightRepeatEditActivity.this;
            personalityLightRepeatEditActivity.f11054h = 1;
            personalityLightRepeatEditActivity.m16774e0();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.PersonalityLightRepeatEditActivity$e */
    class C5547e implements View.OnClickListener {
        C5547e() {
        }

        public void onClick(View view) {
            PersonalityLightRepeatEditActivity personalityLightRepeatEditActivity = PersonalityLightRepeatEditActivity.this;
            personalityLightRepeatEditActivity.f11054h = 0;
            personalityLightRepeatEditActivity.m16774e0();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.PersonalityLightRepeatEditActivity$f */
    class C5548f implements View.OnClickListener {
        C5548f() {
        }

        public void onClick(View view) {
            PersonalityLightRepeatEditActivity.this.m16773d0();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.PersonalityLightRepeatEditActivity$g */
    class C5549g implements Runnable {
        C5549g() {
        }

        public void run() {
            PersonalityLightRepeatEditActivity personalityLightRepeatEditActivity = PersonalityLightRepeatEditActivity.this;
            int i = personalityLightRepeatEditActivity.f11054h;
            ImageView X = personalityLightRepeatEditActivity.f11047a;
            if (i == 0) {
                X.setEnabled(false);
                PersonalityLightRepeatEditActivity.this.f11049c.setEnabled(true);
            } else if (i == 1) {
                X.setEnabled(true);
                PersonalityLightRepeatEditActivity.this.f11049c.setEnabled(false);
            } else {
                X.setEnabled(false);
                PersonalityLightRepeatEditActivity.this.f11049c.setEnabled(false);
                PersonalityLightRepeatEditActivity.this.f11048b.setEnabled(true);
                PersonalityLightRepeatEditActivity.this.f11053g.setText(String.valueOf(PersonalityLightRepeatEditActivity.this.f11054h));
                return;
            }
            PersonalityLightRepeatEditActivity.this.f11048b.setEnabled(false);
            PersonalityLightRepeatEditActivity.this.f11053g.setText("");
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.PersonalityLightRepeatEditActivity$h */
    class C5550h implements DialogInterface.OnClickListener {
        C5550h() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            PersonalityLightRepeatEditActivity.this.f11056j.mo37154d();
            dialogInterface.dismiss();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.PersonalityLightRepeatEditActivity$i */
    class C5551i implements DialogInterface.OnClickListener {
        C5551i() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            if (!TextUtils.isEmpty(PersonalityLightRepeatEditActivity.this.f11056j.mo37153c().getText().toString())) {
                int intValue = Integer.valueOf(PersonalityLightRepeatEditActivity.this.f11056j.mo37153c().getText().toString()).intValue();
                if (intValue < 2 || intValue > 99) {
                    PersonalityLightRepeatEditActivity.this.f11056j.mo37159j(2131756017);
                    PersonalityLightRepeatEditActivity.this.f11056j.mo37161l(2131099842);
                    return;
                }
                PersonalityLightRepeatEditActivity personalityLightRepeatEditActivity = PersonalityLightRepeatEditActivity.this;
                personalityLightRepeatEditActivity.f11054h = Integer.valueOf(personalityLightRepeatEditActivity.f11056j.mo37153c().getText().toString()).intValue();
                PersonalityLightRepeatEditActivity.this.m16774e0();
                PersonalityLightRepeatEditActivity.this.f11056j.mo37154d();
                dialogInterface.dismiss();
            }
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.PersonalityLightRepeatEditActivity$j */
    class C5552j implements C9183a0.C9184a {
        C5552j() {
        }

        /* renamed from: a */
        public void mo30178a(String str) {
            Message message = new Message();
            message.obj = str;
            message.what = 0;
            PersonalityLightRepeatEditActivity.this.f11057k.removeMessages(0);
            PersonalityLightRepeatEditActivity.this.f11057k.sendMessageDelayed(message, 500);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d0 */
    public void m16773d0() {
        C9113d b = new C9113d.C9118e(this).mo37179i(getText(2131756016).toString()).mo37177g(getText(2131756018).toString()).mo37181k(true).mo37172b();
        this.f11056j = b;
        b.mo37156g(-2, getText(2131755232).toString(), new C5550h());
        this.f11056j.mo37156g(-1, getText(2131755281).toString(), new C5551i());
        this.f11056j.setCancelable(true);
        this.f11056j.mo37153c().setHint("2～99");
        this.f11056j.mo37153c().setKeyListener(DigitsKeyListener.getInstance("0123456789"));
        this.f11056j.mo37153c().addTextChangedListener(new C9183a0(2, this.f11056j.mo37153c(), new C5552j()));
        this.f11056j.show();
        this.f11056j.mo37164o();
    }

    /* access modifiers changed from: private */
    /* renamed from: e0 */
    public void m16774e0() {
        this.f11047a.post(new C5549g());
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo35653P();
        C9193k.m22157h(true, this);
        setContentView(C12228R$layout.activity_personality_repeat_edit);
        CommonTitleBar commonTitleBar = (CommonTitleBar) findViewById(2131297591);
        commonTitleBar.mo36195a(getText(2131756015).toString(), new C5543b(), new C5544c());
        commonTitleBar.setTitleTextSize(16);
        commonTitleBar.setRightTextColor(getResources().getColor(2131099805));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        commonTitleBar.setLayoutParams(layoutParams);
        layoutParams.setMargins(0, C9193k.m22154e(this), 0, 0);
        Intent intent = getIntent();
        if (!intent.hasExtra("custom_scene_index")) {
            AppUtils.m8302w(f11046l, "Activity has not edit scene index", false);
            finish();
            return;
        }
        this.f11047a = (ImageView) findViewById(C12225R$id.repeat_once_select_img);
        this.f11048b = (ImageView) findViewById(C12225R$id.repeat_custom_select_img);
        this.f11049c = (ImageView) findViewById(C12225R$id.repeat_loop_select_img);
        this.f11050d = (LinearLayout) findViewById(2131297328);
        this.f11051e = (LinearLayout) findViewById(2131297321);
        this.f11052f = (LinearLayout) findViewById(C12225R$id.repeat_loop_layout);
        this.f11053g = (TextView) findViewById(C12225R$id.repeat_custom_count_text);
        this.f11055i = intent.getIntExtra("custom_scene_index", -1);
        this.f11054h = C3112v.m8242u().mo23558i().get(this.f11055i).mo35436c().mo35340j();
        this.f11050d.setOnClickListener(new C5546d());
        this.f11052f.setOnClickListener(new C5547e());
        this.f11051e.setOnClickListener(new C5548f());
        m16774e0();
    }
}
