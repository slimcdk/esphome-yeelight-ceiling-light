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
import com.yeelight.yeelib.models.C8321m;
import com.yeelight.yeelib.models.CustomAdvancedFlowScene;
import com.yeelight.yeelib.p142ui.activity.BaseActivity;
import com.yeelight.yeelib.p142ui.view.CommonTitleBar;
import com.yeelight.yeelib.utils.AppUtils;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import p051j4.C9183a0;
import p051j4.C9193k;
import p051j4.C9195n;

/* renamed from: com.yeelight.cherry.ui.activity.PersonalityLightNameEditActivity */
public class PersonalityLightNameEditActivity extends BaseActivity {

    /* renamed from: g */
    private static String f10992g = "PersonalityLightNameEditActivity";

    /* renamed from: a */
    private CommonTitleBar f10993a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public EditText f10994b;

    /* renamed from: c */
    private ImageView f10995c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public ImageView f10996d;

    /* renamed from: e */
    int f10997e;

    /* renamed from: f */
    private Handler f10998f = new C5524h();

    /* renamed from: com.yeelight.cherry.ui.activity.PersonalityLightNameEditActivity$a */
    class C5517a implements View.OnClickListener {
        C5517a() {
        }

        public void onClick(View view) {
            PersonalityLightNameEditActivity.this.mo30730Y();
            PersonalityLightNameEditActivity.this.onBackPressed();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.PersonalityLightNameEditActivity$b */
    class C5518b implements View.OnClickListener {
        C5518b() {
        }

        public void onClick(View view) {
            PersonalityLightNameEditActivity.this.m16742Z();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.PersonalityLightNameEditActivity$c */
    class C5519c implements TextWatcher {
        C5519c() {
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            int i4;
            ImageView imageView;
            if (charSequence.length() > 0) {
                imageView = PersonalityLightNameEditActivity.this.f10996d;
                i4 = 0;
            } else {
                imageView = PersonalityLightNameEditActivity.this.f10996d;
                i4 = 4;
            }
            imageView.setVisibility(i4);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.PersonalityLightNameEditActivity$d */
    class C5520d implements View.OnClickListener {
        C5520d() {
        }

        public void onClick(View view) {
            PersonalityLightNameEditActivity.this.f10994b.setText("");
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.PersonalityLightNameEditActivity$e */
    class C5521e implements TextView.OnEditorActionListener {
        C5521e() {
        }

        public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            if (i == 6) {
                ((InputMethodManager) PersonalityLightNameEditActivity.this.getSystemService("input_method")).hideSoftInputFromWindow(textView.getWindowToken(), 0);
            }
            return false;
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.PersonalityLightNameEditActivity$f */
    class C5522f extends TimerTask {
        C5522f() {
        }

        public void run() {
            ((InputMethodManager) PersonalityLightNameEditActivity.this.getSystemService("input_method")).showSoftInput(PersonalityLightNameEditActivity.this.f10994b, 2);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.PersonalityLightNameEditActivity$g */
    class C5523g implements C3112v.C3119g {
        C5523g() {
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public /* synthetic */ void m16745c(String str) {
            Toast toast;
            if (str == null || str.isEmpty()) {
                PersonalityLightNameEditActivity personalityLightNameEditActivity = PersonalityLightNameEditActivity.this;
                toast = Toast.makeText(personalityLightNameEditActivity, personalityLightNameEditActivity.getText(2131755310), 0);
            } else {
                toast = Toast.makeText(PersonalityLightNameEditActivity.this, str, 0);
            }
            toast.show();
        }

        /* renamed from: a */
        public void mo23579a(String str) {
            PersonalityLightNameEditActivity.this.runOnUiThread(new C5761g2(this, str));
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

    /* renamed from: com.yeelight.cherry.ui.activity.PersonalityLightNameEditActivity$h */
    class C5524h extends Handler {
        C5524h() {
        }

        public void handleMessage(Message message) {
            super.handleMessage(message);
            if (message.what == 0) {
                PersonalityLightNameEditActivity personalityLightNameEditActivity = PersonalityLightNameEditActivity.this;
                Toast.makeText(personalityLightNameEditActivity, personalityLightNameEditActivity.getText(2131756014), 0).show();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: Z */
    public void m16742Z() {
        mo30730Y();
        String obj = this.f10994b.getText().toString();
        if (!TextUtils.isEmpty(obj.trim())) {
            C3112v.m8242u().mo23558i().get(this.f10997e).mo35435T(obj);
            C3112v.m8242u().mo23553B(C3112v.m8242u().mo23558i().get(this.f10997e), new C5523g());
            finish();
            return;
        }
        this.f10998f.removeMessages(0);
        this.f10998f.sendEmptyMessageDelayed(0, 500);
    }

    /* renamed from: Y */
    public void mo30730Y() {
        if (this.f10994b != null) {
            ((InputMethodManager) getSystemService("input_method")).hideSoftInputFromWindow(this.f10994b.getWindowToken(), 0);
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo35653P();
        C9193k.m22157h(true, this);
        setContentView(C12228R$layout.activity_edit_personality_name);
        CommonTitleBar commonTitleBar = (CommonTitleBar) findViewById(2131297591);
        this.f10993a = commonTitleBar;
        commonTitleBar.mo36195a(getText(2131755270).toString(), new C5517a(), new C5518b());
        this.f10993a.setTitleTextSize(16);
        this.f10993a.setRightTextColor(getResources().getColor(2131099805));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        this.f10993a.setLayoutParams(layoutParams);
        layoutParams.setMargins(0, C9193k.m22154e(this), 0, 0);
        Intent intent = getIntent();
        if (!intent.hasExtra("custom_scene_index")) {
            AppUtils.m8302w(f10992g, "Activity has not edit scene index", false);
            finish();
            return;
        }
        this.f10997e = intent.getIntExtra("custom_scene_index", -1);
        CustomAdvancedFlowScene customAdvancedFlowScene = C3112v.m8242u().mo23558i().get(this.f10997e);
        ImageView imageView = (ImageView) findViewById(C12225R$id.custom_light_type_img);
        this.f10995c = imageView;
        imageView.setImageResource(C9195n.m22164a(1, customAdvancedFlowScene.mo35296d0()));
        this.f10994b = (EditText) findViewById(2131296734);
        this.f10996d = (ImageView) findViewById(2131296733);
        String t = customAdvancedFlowScene.mo35453t();
        if (!TextUtils.isEmpty(customAdvancedFlowScene.mo35453t())) {
            this.f10994b.setText(t);
            this.f10994b.setSelection(t.length());
        }
        EditText editText = this.f10994b;
        editText.addTextChangedListener(new C9183a0(20, editText));
        this.f10994b.addTextChangedListener(new C5519c());
        this.f10996d.setOnClickListener(new C5520d());
        this.f10994b.setOnEditorActionListener(new C5521e());
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        if (this.f10994b != null) {
            new Timer().schedule(new C5522f(), 500);
        }
    }
}
