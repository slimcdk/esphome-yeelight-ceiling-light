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
import com.yeelight.yeelib.p194ui.activity.BaseActivity;
import com.yeelight.yeelib.p194ui.view.CommonTitleBar;
import com.yeelight.yeelib.utils.C10536b0;
import com.yeelight.yeelib.utils.C10547m;
import com.yeelight.yeelib.utils.C10549p;
import java.util.Timer;
import java.util.TimerTask;

/* renamed from: com.yeelight.cherry.ui.activity.CreateNameForPersonalityLightActivity */
public class CreateNameForPersonalityLightActivity extends BaseActivity {
    /* access modifiers changed from: private */

    /* renamed from: b */
    public EditText f10556b;

    /* renamed from: c */
    private Handler f10557c = new C5097h();

    /* renamed from: com.yeelight.cherry.ui.activity.CreateNameForPersonalityLightActivity$a */
    class C5090a implements View.OnClickListener {
        C5090a() {
        }

        public void onClick(View view) {
            CreateNameForPersonalityLightActivity.this.mo26254X();
            CreateNameForPersonalityLightActivity.this.onBackPressed();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.CreateNameForPersonalityLightActivity$b */
    class C5091b implements View.OnClickListener {
        C5091b() {
        }

        public void onClick(View view) {
            CreateNameForPersonalityLightActivity.this.mo26254X();
            Intent intent = new Intent(CreateNameForPersonalityLightActivity.this, PersonalityLightingActivity.class);
            intent.addFlags(71303168);
            CreateNameForPersonalityLightActivity.this.startActivity(intent);
            CreateNameForPersonalityLightActivity.this.finish();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.CreateNameForPersonalityLightActivity$c */
    class C5092c implements View.OnClickListener {
        C5092c() {
        }

        public void onClick(View view) {
            CreateNameForPersonalityLightActivity.this.f10556b.setText("");
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.CreateNameForPersonalityLightActivity$d */
    class C5093d implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ ImageView f10561a;

        C5093d(CreateNameForPersonalityLightActivity createNameForPersonalityLightActivity, ImageView imageView) {
            this.f10561a = imageView;
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            int i4;
            ImageView imageView;
            if (charSequence.length() > 0) {
                imageView = this.f10561a;
                i4 = 0;
            } else {
                imageView = this.f10561a;
                i4 = 4;
            }
            imageView.setVisibility(i4);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.CreateNameForPersonalityLightActivity$e */
    class C5094e implements TextView.OnEditorActionListener {
        C5094e() {
        }

        public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            if (i == 6) {
                ((InputMethodManager) CreateNameForPersonalityLightActivity.this.getSystemService("input_method")).hideSoftInputFromWindow(textView.getWindowToken(), 0);
                CreateNameForPersonalityLightActivity.this.m16142Y();
            }
            return false;
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.CreateNameForPersonalityLightActivity$f */
    class C5095f implements View.OnClickListener {
        C5095f() {
        }

        public void onClick(View view) {
            CreateNameForPersonalityLightActivity.this.m16142Y();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.CreateNameForPersonalityLightActivity$g */
    class C5096g extends TimerTask {
        C5096g() {
        }

        public void run() {
            ((InputMethodManager) CreateNameForPersonalityLightActivity.this.getSystemService("input_method")).showSoftInput(CreateNameForPersonalityLightActivity.this.f10556b, 2);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.CreateNameForPersonalityLightActivity$h */
    class C5097h extends Handler {
        C5097h() {
        }

        public void handleMessage(Message message) {
            super.handleMessage(message);
            if (message.what == 0) {
                CreateNameForPersonalityLightActivity createNameForPersonalityLightActivity = CreateNameForPersonalityLightActivity.this;
                Toast.makeText(createNameForPersonalityLightActivity, createNameForPersonalityLightActivity.getText(2131756002), 0).show();
            }
        }
    }

    static {
        Class<CreateNameForPersonalityLightActivity> cls = CreateNameForPersonalityLightActivity.class;
    }

    /* access modifiers changed from: private */
    /* renamed from: Y */
    public void m16142Y() {
        String obj = this.f10556b.getText().toString();
        if (!TextUtils.isEmpty(obj.trim())) {
            C4300b0.m12083u().mo23753r().mo31870S(obj);
            Intent intent = new Intent();
            intent.setClass(this, SelectLightStateForPersonalityLightActivity.class);
            startActivity(intent);
            return;
        }
        this.f10557c.removeMessages(0);
        this.f10557c.sendEmptyMessageDelayed(0, 500);
    }

    /* renamed from: X */
    public void mo26254X() {
        if (this.f10556b != null) {
            ((InputMethodManager) getSystemService("input_method")).hideSoftInputFromWindow(this.f10556b.getWindowToken(), 0);
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo32193P();
        C10547m.m25758h(true, this);
        setContentView(C11748R$layout.activity_create_personality_name);
        CommonTitleBar commonTitleBar = (CommonTitleBar) findViewById(2131297424);
        commonTitleBar.mo32825a(getText(2131755241).toString(), new C5090a(), new C5091b());
        commonTitleBar.setTitleTextSize(16);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        commonTitleBar.setLayoutParams(layoutParams);
        int i = 0;
        layoutParams.setMargins(0, C10547m.m25755e(this), 0, 0);
        int d0 = C4300b0.m12083u().mo23753r().mo31761d0();
        if (d0 > 0) {
            i = d0;
        }
        ((ImageView) findViewById(C11745R$id.type_view)).setImageResource(C10549p.f20166a.get(i).intValue());
        this.f10556b = (EditText) findViewById(2131296640);
        ImageView imageView = (ImageView) findViewById(2131296639);
        EditText editText = this.f10556b;
        editText.addTextChangedListener(new C10536b0(20, editText));
        imageView.setOnClickListener(new C5092c());
        this.f10556b.addTextChangedListener(new C5093d(this, imageView));
        if (TextUtils.isEmpty(C4300b0.m12083u().mo23753r().mo31888t())) {
            this.f10556b.setText(C4300b0.m12083u().mo23753r().mo31888t());
        }
        this.f10556b.setOnEditorActionListener(new C5094e());
        ((TextView) findViewById(2131297043)).setOnClickListener(new C5095f());
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        if (this.f10556b != null) {
            new Timer().schedule(new C5096g(), 500);
        }
    }
}
