package com.yeelight.cherry.p141ui.activity;

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
import com.yeelight.cherry.C12225R$id;
import com.yeelight.cherry.C12228R$layout;
import com.yeelight.yeelib.models.C3112v;
import com.yeelight.yeelib.p142ui.activity.BaseActivity;
import com.yeelight.yeelib.p142ui.view.CommonTitleBar;
import java.util.Timer;
import java.util.TimerTask;
import p051j4.C9183a0;
import p051j4.C9193k;
import p051j4.C9195n;

/* renamed from: com.yeelight.cherry.ui.activity.CreateNameForPersonalityLightActivity */
public class CreateNameForPersonalityLightActivity extends BaseActivity {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public EditText f10107a;

    /* renamed from: b */
    private Handler f10108b = new C5144h();

    /* renamed from: com.yeelight.cherry.ui.activity.CreateNameForPersonalityLightActivity$a */
    class C5137a implements View.OnClickListener {
        C5137a() {
        }

        public void onClick(View view) {
            CreateNameForPersonalityLightActivity.this.mo30300X();
            CreateNameForPersonalityLightActivity.this.onBackPressed();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.CreateNameForPersonalityLightActivity$b */
    class C5138b implements View.OnClickListener {
        C5138b() {
        }

        public void onClick(View view) {
            CreateNameForPersonalityLightActivity.this.mo30300X();
            Intent intent = new Intent(CreateNameForPersonalityLightActivity.this, PersonalityLightingActivity.class);
            intent.addFlags(71303168);
            CreateNameForPersonalityLightActivity.this.startActivity(intent);
            CreateNameForPersonalityLightActivity.this.finish();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.CreateNameForPersonalityLightActivity$c */
    class C5139c implements View.OnClickListener {
        C5139c() {
        }

        public void onClick(View view) {
            CreateNameForPersonalityLightActivity.this.f10107a.setText("");
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.CreateNameForPersonalityLightActivity$d */
    class C5140d implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ ImageView f10112a;

        C5140d(CreateNameForPersonalityLightActivity createNameForPersonalityLightActivity, ImageView imageView) {
            this.f10112a = imageView;
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            int i4;
            ImageView imageView;
            if (charSequence.length() > 0) {
                imageView = this.f10112a;
                i4 = 0;
            } else {
                imageView = this.f10112a;
                i4 = 4;
            }
            imageView.setVisibility(i4);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.CreateNameForPersonalityLightActivity$e */
    class C5141e implements TextView.OnEditorActionListener {
        C5141e() {
        }

        public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            if (i == 6) {
                ((InputMethodManager) CreateNameForPersonalityLightActivity.this.getSystemService("input_method")).hideSoftInputFromWindow(textView.getWindowToken(), 0);
                CreateNameForPersonalityLightActivity.this.m16041Y();
            }
            return false;
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.CreateNameForPersonalityLightActivity$f */
    class C5142f implements View.OnClickListener {
        C5142f() {
        }

        public void onClick(View view) {
            CreateNameForPersonalityLightActivity.this.m16041Y();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.CreateNameForPersonalityLightActivity$g */
    class C5143g extends TimerTask {
        C5143g() {
        }

        public void run() {
            ((InputMethodManager) CreateNameForPersonalityLightActivity.this.getSystemService("input_method")).showSoftInput(CreateNameForPersonalityLightActivity.this.f10107a, 2);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.CreateNameForPersonalityLightActivity$h */
    class C5144h extends Handler {
        C5144h() {
        }

        public void handleMessage(Message message) {
            super.handleMessage(message);
            if (message.what == 0) {
                CreateNameForPersonalityLightActivity createNameForPersonalityLightActivity = CreateNameForPersonalityLightActivity.this;
                Toast.makeText(createNameForPersonalityLightActivity, createNameForPersonalityLightActivity.getText(2131756014), 0).show();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: Y */
    public void m16041Y() {
        String obj = this.f10107a.getText().toString();
        if (!TextUtils.isEmpty(obj.trim())) {
            C3112v.m8242u().mo23566r().mo35435T(obj);
            Intent intent = new Intent();
            intent.setClass(this, SelectLightStateForPersonalityLightActivity.class);
            startActivity(intent);
            return;
        }
        this.f10108b.removeMessages(0);
        this.f10108b.sendEmptyMessageDelayed(0, 500);
    }

    /* renamed from: X */
    public void mo30300X() {
        if (this.f10107a != null) {
            ((InputMethodManager) getSystemService("input_method")).hideSoftInputFromWindow(this.f10107a.getWindowToken(), 0);
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo35653P();
        C9193k.m22157h(true, this);
        setContentView(C12228R$layout.activity_create_personality_name);
        CommonTitleBar commonTitleBar = (CommonTitleBar) findViewById(2131297591);
        commonTitleBar.mo36195a(getText(2131755244).toString(), new C5137a(), new C5138b());
        commonTitleBar.setTitleTextSize(16);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        commonTitleBar.setLayoutParams(layoutParams);
        int i = 0;
        layoutParams.setMargins(0, C9193k.m22154e(this), 0, 0);
        int d0 = C3112v.m8242u().mo23566r().mo35296d0();
        if (d0 > 0) {
            i = d0;
        }
        ((ImageView) findViewById(C12225R$id.type_view)).setImageResource(C9195n.f17011a.get(i).intValue());
        this.f10107a = (EditText) findViewById(2131296734);
        ImageView imageView = (ImageView) findViewById(2131296733);
        EditText editText = this.f10107a;
        editText.addTextChangedListener(new C9183a0(20, editText));
        imageView.setOnClickListener(new C5139c());
        this.f10107a.addTextChangedListener(new C5140d(this, imageView));
        if (TextUtils.isEmpty(C3112v.m8242u().mo23566r().mo35453t())) {
            this.f10107a.setText(C3112v.m8242u().mo23566r().mo35453t());
        }
        this.f10107a.setOnEditorActionListener(new C5141e());
        ((TextView) findViewById(2131297165)).setOnClickListener(new C5142f());
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        if (this.f10107a != null) {
            new Timer().schedule(new C5143g(), 500);
        }
    }
}
