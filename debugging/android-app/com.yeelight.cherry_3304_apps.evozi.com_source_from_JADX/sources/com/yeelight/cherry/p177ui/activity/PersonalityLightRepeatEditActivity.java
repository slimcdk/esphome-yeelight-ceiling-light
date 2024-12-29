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
import android.widget.Toast;
import com.yeelight.cherry.C11745R$id;
import com.yeelight.cherry.C11748R$layout;
import com.yeelight.yeelib.p153g.C4300b0;
import com.yeelight.yeelib.p153g.C9830b;
import com.yeelight.yeelib.p153g.C9849r;
import com.yeelight.yeelib.p194ui.activity.BaseActivity;
import com.yeelight.yeelib.p194ui.view.CommonTitleBar;
import com.yeelight.yeelib.p194ui.widget.C10526e;
import com.yeelight.yeelib.utils.C10536b0;
import com.yeelight.yeelib.utils.C10547m;
import com.yeelight.yeelib.utils.C4308b;
import java.util.List;

/* renamed from: com.yeelight.cherry.ui.activity.PersonalityLightRepeatEditActivity */
public class PersonalityLightRepeatEditActivity extends BaseActivity {

    /* renamed from: m */
    private static String f11482m = PersonalityLightRepeatEditActivity.class.getSimpleName();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public ImageView f11483b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public ImageView f11484c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public ImageView f11485d;

    /* renamed from: e */
    private LinearLayout f11486e;

    /* renamed from: f */
    private LinearLayout f11487f;

    /* renamed from: g */
    private LinearLayout f11488g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public TextView f11489h;

    /* renamed from: i */
    int f11490i;

    /* renamed from: j */
    int f11491j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public C10526e f11492k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public Handler f11493l = new C5499a();

    /* renamed from: com.yeelight.cherry.ui.activity.PersonalityLightRepeatEditActivity$a */
    class C5499a extends Handler {
        C5499a() {
        }

        public void handleMessage(Message message) {
            int intValue;
            super.handleMessage(message);
            if (message.what == 0) {
                String str = (String) message.obj;
                if (PersonalityLightRepeatEditActivity.this.f11492k == null) {
                    return;
                }
                if (TextUtils.isEmpty(str) || ((intValue = Integer.valueOf(str).intValue()) >= 2 && intValue <= 99)) {
                    PersonalityLightRepeatEditActivity.this.f11492k.mo33338j(2131756006);
                    PersonalityLightRepeatEditActivity.this.f11492k.mo33340l(2131099838);
                    return;
                }
                PersonalityLightRepeatEditActivity.this.f11492k.mo33338j(2131756005);
                PersonalityLightRepeatEditActivity.this.f11492k.mo33340l(2131099839);
            }
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.PersonalityLightRepeatEditActivity$b */
    class C5500b implements View.OnClickListener {
        C5500b() {
        }

        public void onClick(View view) {
            PersonalityLightRepeatEditActivity.this.onBackPressed();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.PersonalityLightRepeatEditActivity$c */
    class C5501c implements View.OnClickListener {

        /* renamed from: com.yeelight.cherry.ui.activity.PersonalityLightRepeatEditActivity$c$a */
        class C5502a implements C4300b0.C4307g {
            C5502a() {
            }

            /* renamed from: a */
            public void mo23766a(String str) {
                PersonalityLightRepeatEditActivity.this.runOnUiThread(new C5767r1(this, str));
            }

            /* renamed from: b */
            public /* synthetic */ void mo26760b(String str) {
                Toast toast;
                if (str == null || str.isEmpty()) {
                    PersonalityLightRepeatEditActivity personalityLightRepeatEditActivity = PersonalityLightRepeatEditActivity.this;
                    toast = Toast.makeText(personalityLightRepeatEditActivity, personalityLightRepeatEditActivity.getText(2131755306), 0);
                } else {
                    toast = Toast.makeText(PersonalityLightRepeatEditActivity.this, str, 0);
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

        C5501c() {
        }

        public void onClick(View view) {
            C9830b bVar = C4300b0.m12083u().mo23745i().get(PersonalityLightRepeatEditActivity.this.f11491j);
            bVar.mo31871c().mo31728m(PersonalityLightRepeatEditActivity.this.f11490i);
            bVar.mo31871c().mo31727l(PersonalityLightRepeatEditActivity.this.f11490i * bVar.mo31871c().mo31723h().size());
            C4300b0.m12083u().mo23740C(C4300b0.m12083u().mo23745i().get(PersonalityLightRepeatEditActivity.this.f11491j), new C5502a());
            PersonalityLightRepeatEditActivity.this.finish();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.PersonalityLightRepeatEditActivity$d */
    class C5503d implements View.OnClickListener {
        C5503d() {
        }

        public void onClick(View view) {
            PersonalityLightRepeatEditActivity personalityLightRepeatEditActivity = PersonalityLightRepeatEditActivity.this;
            personalityLightRepeatEditActivity.f11490i = 1;
            personalityLightRepeatEditActivity.m16800e0();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.PersonalityLightRepeatEditActivity$e */
    class C5504e implements View.OnClickListener {
        C5504e() {
        }

        public void onClick(View view) {
            PersonalityLightRepeatEditActivity personalityLightRepeatEditActivity = PersonalityLightRepeatEditActivity.this;
            personalityLightRepeatEditActivity.f11490i = 0;
            personalityLightRepeatEditActivity.m16800e0();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.PersonalityLightRepeatEditActivity$f */
    class C5505f implements View.OnClickListener {
        C5505f() {
        }

        public void onClick(View view) {
            PersonalityLightRepeatEditActivity.this.m16799d0();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.PersonalityLightRepeatEditActivity$g */
    class C5506g implements Runnable {
        C5506g() {
        }

        public void run() {
            PersonalityLightRepeatEditActivity personalityLightRepeatEditActivity = PersonalityLightRepeatEditActivity.this;
            int i = personalityLightRepeatEditActivity.f11490i;
            ImageView X = personalityLightRepeatEditActivity.f11483b;
            if (i == 0) {
                X.setEnabled(false);
                PersonalityLightRepeatEditActivity.this.f11485d.setEnabled(true);
            } else if (i == 1) {
                X.setEnabled(true);
                PersonalityLightRepeatEditActivity.this.f11485d.setEnabled(false);
            } else {
                X.setEnabled(false);
                PersonalityLightRepeatEditActivity.this.f11485d.setEnabled(false);
                PersonalityLightRepeatEditActivity.this.f11484c.setEnabled(true);
                PersonalityLightRepeatEditActivity.this.f11489h.setText(String.valueOf(PersonalityLightRepeatEditActivity.this.f11490i));
                return;
            }
            PersonalityLightRepeatEditActivity.this.f11484c.setEnabled(false);
            PersonalityLightRepeatEditActivity.this.f11489h.setText("");
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.PersonalityLightRepeatEditActivity$h */
    class C5507h implements DialogInterface.OnClickListener {
        C5507h() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            PersonalityLightRepeatEditActivity.this.f11492k.mo33333d();
            dialogInterface.dismiss();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.PersonalityLightRepeatEditActivity$i */
    class C5508i implements DialogInterface.OnClickListener {
        C5508i() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            if (!TextUtils.isEmpty(PersonalityLightRepeatEditActivity.this.f11492k.mo33332c().getText().toString())) {
                int intValue = Integer.valueOf(PersonalityLightRepeatEditActivity.this.f11492k.mo33332c().getText().toString()).intValue();
                if (intValue < 2 || intValue > 99) {
                    PersonalityLightRepeatEditActivity.this.f11492k.mo33338j(2131756005);
                    PersonalityLightRepeatEditActivity.this.f11492k.mo33340l(2131099839);
                    return;
                }
                PersonalityLightRepeatEditActivity personalityLightRepeatEditActivity = PersonalityLightRepeatEditActivity.this;
                personalityLightRepeatEditActivity.f11490i = Integer.valueOf(personalityLightRepeatEditActivity.f11492k.mo33332c().getText().toString()).intValue();
                PersonalityLightRepeatEditActivity.this.m16800e0();
                PersonalityLightRepeatEditActivity.this.f11492k.mo33333d();
                dialogInterface.dismiss();
            }
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.PersonalityLightRepeatEditActivity$j */
    class C5509j implements C10536b0.C10537a {
        C5509j() {
        }

        /* renamed from: a */
        public void mo26122a(String str) {
            Message message = new Message();
            message.obj = str;
            message.what = 0;
            PersonalityLightRepeatEditActivity.this.f11493l.removeMessages(0);
            PersonalityLightRepeatEditActivity.this.f11493l.sendMessageDelayed(message, 500);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d0 */
    public void m16799d0() {
        C10526e.C10531e eVar = new C10526e.C10531e(this);
        eVar.mo33358i(getText(2131756004).toString());
        eVar.mo33356g(getText(2131756006).toString());
        eVar.mo33360k(true);
        C10526e b = eVar.mo33351b();
        this.f11492k = b;
        b.mo33335g(-2, getText(2131755229).toString(), new C5507h());
        this.f11492k.mo33335g(-1, getText(2131755277).toString(), new C5508i());
        this.f11492k.setCancelable(true);
        this.f11492k.mo33332c().setHint("2～99");
        this.f11492k.mo33332c().setKeyListener(DigitsKeyListener.getInstance("0123456789"));
        this.f11492k.mo33332c().addTextChangedListener(new C10536b0(2, this.f11492k.mo33332c(), new C5509j()));
        this.f11492k.show();
        this.f11492k.mo33343o();
    }

    /* access modifiers changed from: private */
    /* renamed from: e0 */
    public void m16800e0() {
        this.f11483b.post(new C5506g());
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo32193P();
        C10547m.m25758h(true, this);
        setContentView(C11748R$layout.activity_personality_repeat_edit);
        CommonTitleBar commonTitleBar = (CommonTitleBar) findViewById(2131297424);
        commonTitleBar.mo32825a(getText(2131756003).toString(), new C5500b(), new C5501c());
        commonTitleBar.setTitleTextSize(16);
        commonTitleBar.setRightTextColor(getResources().getColor(2131099802));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        commonTitleBar.setLayoutParams(layoutParams);
        layoutParams.setMargins(0, C10547m.m25755e(this), 0, 0);
        Intent intent = getIntent();
        if (!intent.hasExtra("custom_scene_index")) {
            C4308b.m12141t(f11482m, "Activity has not edit scene index", false);
            finish();
            return;
        }
        this.f11483b = (ImageView) findViewById(C11745R$id.repeat_once_select_img);
        this.f11484c = (ImageView) findViewById(C11745R$id.repeat_custom_select_img);
        this.f11485d = (ImageView) findViewById(C11745R$id.repeat_loop_select_img);
        this.f11486e = (LinearLayout) findViewById(2131297188);
        this.f11487f = (LinearLayout) findViewById(2131297181);
        this.f11488g = (LinearLayout) findViewById(C11745R$id.repeat_loop_layout);
        this.f11489h = (TextView) findViewById(C11745R$id.repeat_custom_count_text);
        this.f11491j = intent.getIntExtra("custom_scene_index", -1);
        this.f11490i = C4300b0.m12083u().mo23745i().get(this.f11491j).mo31871c().mo31725j();
        this.f11486e.setOnClickListener(new C5503d());
        this.f11488g.setOnClickListener(new C5504e());
        this.f11487f.setOnClickListener(new C5505f());
        m16800e0();
    }
}
