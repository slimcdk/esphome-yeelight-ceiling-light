package com.yeelight.cherry.p177ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.yeelight.cherry.C11745R$id;
import com.yeelight.cherry.C11748R$layout;
import com.yeelight.yeelib.p153g.C4300b0;
import com.yeelight.yeelib.p153g.C9838i;
import com.yeelight.yeelib.p153g.C9849r;
import com.yeelight.yeelib.p194ui.activity.BaseActivity;
import com.yeelight.yeelib.p194ui.view.CommonTitleBar;
import com.yeelight.yeelib.utils.C10536b0;
import com.yeelight.yeelib.utils.C10547m;
import com.yeelight.yeelib.utils.C10549p;
import com.yeelight.yeelib.utils.C4308b;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

/* renamed from: com.yeelight.cherry.ui.activity.PersonalityLightNameEditActivity */
public class PersonalityLightNameEditActivity extends BaseActivity {

    /* renamed from: h */
    private static String f11428h = PersonalityLightNameEditActivity.class.getSimpleName();

    /* renamed from: b */
    private CommonTitleBar f11429b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public EditText f11430c;

    /* renamed from: d */
    private ImageView f11431d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public ImageView f11432e;

    /* renamed from: f */
    int f11433f;

    /* renamed from: g */
    private Handler f11434g = new C5481h();

    /* renamed from: com.yeelight.cherry.ui.activity.PersonalityLightNameEditActivity$a */
    class C5474a implements View.OnClickListener {
        C5474a() {
        }

        public void onClick(View view) {
            PersonalityLightNameEditActivity.this.mo26729Y();
            PersonalityLightNameEditActivity.this.onBackPressed();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.PersonalityLightNameEditActivity$b */
    class C5475b implements View.OnClickListener {
        C5475b() {
        }

        public void onClick(View view) {
            PersonalityLightNameEditActivity.this.m16770Z();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.PersonalityLightNameEditActivity$c */
    class C5476c implements TextWatcher {
        C5476c() {
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            int i4;
            ImageView imageView;
            if (charSequence.length() > 0) {
                imageView = PersonalityLightNameEditActivity.this.f11432e;
                i4 = 0;
            } else {
                imageView = PersonalityLightNameEditActivity.this.f11432e;
                i4 = 4;
            }
            imageView.setVisibility(i4);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.PersonalityLightNameEditActivity$d */
    class C5477d implements View.OnClickListener {
        C5477d() {
        }

        public void onClick(View view) {
            PersonalityLightNameEditActivity.this.f11430c.setText("");
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.PersonalityLightNameEditActivity$e */
    class C5478e implements TextView.OnEditorActionListener {
        C5478e() {
        }

        public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            if (i == 6) {
                ((InputMethodManager) PersonalityLightNameEditActivity.this.getSystemService("input_method")).hideSoftInputFromWindow(textView.getWindowToken(), 0);
            }
            return false;
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.PersonalityLightNameEditActivity$f */
    class C5479f extends TimerTask {
        C5479f() {
        }

        public void run() {
            ((InputMethodManager) PersonalityLightNameEditActivity.this.getSystemService("input_method")).showSoftInput(PersonalityLightNameEditActivity.this.f11430c, 2);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.PersonalityLightNameEditActivity$g */
    class C5480g implements C4300b0.C4307g {
        C5480g() {
        }

        /* renamed from: a */
        public void mo23766a(String str) {
            PersonalityLightNameEditActivity.this.runOnUiThread(new C5757p1(this, str));
        }

        /* renamed from: b */
        public /* synthetic */ void mo26738b(String str) {
            Toast toast;
            if (str == null || str.isEmpty()) {
                PersonalityLightNameEditActivity personalityLightNameEditActivity = PersonalityLightNameEditActivity.this;
                toast = Toast.makeText(personalityLightNameEditActivity, personalityLightNameEditActivity.getText(2131755306), 0);
            } else {
                toast = Toast.makeText(PersonalityLightNameEditActivity.this, str, 0);
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

    /* renamed from: com.yeelight.cherry.ui.activity.PersonalityLightNameEditActivity$h */
    class C5481h extends Handler {
        C5481h() {
        }

        public void handleMessage(Message message) {
            super.handleMessage(message);
            if (message.what == 0) {
                PersonalityLightNameEditActivity personalityLightNameEditActivity = PersonalityLightNameEditActivity.this;
                Toast.makeText(personalityLightNameEditActivity, personalityLightNameEditActivity.getText(2131756002), 0).show();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: Z */
    public void m16770Z() {
        mo26729Y();
        String obj = this.f11430c.getText().toString();
        if (!TextUtils.isEmpty(obj.trim())) {
            C4300b0.m12083u().mo23745i().get(this.f11433f).mo31870S(obj);
            C4300b0.m12083u().mo23740C(C4300b0.m12083u().mo23745i().get(this.f11433f), new C5480g());
            finish();
            return;
        }
        this.f11434g.removeMessages(0);
        this.f11434g.sendEmptyMessageDelayed(0, 500);
    }

    /* renamed from: Y */
    public void mo26729Y() {
        if (this.f11430c != null) {
            ((InputMethodManager) getSystemService("input_method")).hideSoftInputFromWindow(this.f11430c.getWindowToken(), 0);
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo32193P();
        C10547m.m25758h(true, this);
        setContentView(C11748R$layout.activity_edit_personality_name);
        CommonTitleBar commonTitleBar = (CommonTitleBar) findViewById(2131297424);
        this.f11429b = commonTitleBar;
        commonTitleBar.mo32825a(getText(2131755266).toString(), new C5474a(), new C5475b());
        this.f11429b.setTitleTextSize(16);
        this.f11429b.setRightTextColor(getResources().getColor(2131099802));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        this.f11429b.setLayoutParams(layoutParams);
        layoutParams.setMargins(0, C10547m.m25755e(this), 0, 0);
        Intent intent = getIntent();
        if (!intent.hasExtra("custom_scene_index")) {
            C4308b.m12141t(f11428h, "Activity has not edit scene index", false);
            finish();
            return;
        }
        this.f11433f = intent.getIntExtra("custom_scene_index", -1);
        C9838i iVar = C4300b0.m12083u().mo23745i().get(this.f11433f);
        ImageView imageView = (ImageView) findViewById(C11745R$id.custom_light_type_img);
        this.f11431d = imageView;
        imageView.setImageResource(C10549p.m25765a(1, iVar.mo31761d0()));
        this.f11430c = (EditText) findViewById(2131296640);
        this.f11432e = (ImageView) findViewById(2131296639);
        String t = iVar.mo31888t();
        if (!TextUtils.isEmpty(iVar.mo31888t())) {
            this.f11430c.setText(t);
            this.f11430c.setSelection(t.length());
        }
        EditText editText = this.f11430c;
        editText.addTextChangedListener(new C10536b0(20, editText));
        this.f11430c.addTextChangedListener(new C5476c());
        this.f11432e.setOnClickListener(new C5477d());
        this.f11430c.setOnEditorActionListener(new C5478e());
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        if (this.f11430c != null) {
            new Timer().schedule(new C5479f(), 500);
        }
    }
}
