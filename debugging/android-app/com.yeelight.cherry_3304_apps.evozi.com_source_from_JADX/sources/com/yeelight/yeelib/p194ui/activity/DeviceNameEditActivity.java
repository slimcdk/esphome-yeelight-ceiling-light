package com.yeelight.yeelib.p194ui.activity;

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
import com.yeelight.yeelib.R$color;
import com.yeelight.yeelib.R$id;
import com.yeelight.yeelib.R$layout;
import com.yeelight.yeelib.R$string;
import com.yeelight.yeelib.p150c.C6006h;
import com.yeelight.yeelib.p150c.p151i.C4198d;
import com.yeelight.yeelib.p150c.p151i.C4200i;
import com.yeelight.yeelib.p152f.C4257w;
import com.yeelight.yeelib.p194ui.view.CommonTitleBar;
import com.yeelight.yeelib.utils.C10536b0;
import com.yeelight.yeelib.utils.C10547m;
import com.yeelight.yeelib.utils.C4308b;
import java.util.Timer;
import java.util.TimerTask;

/* renamed from: com.yeelight.yeelib.ui.activity.DeviceNameEditActivity */
public class DeviceNameEditActivity extends BaseActivity {

    /* renamed from: e */
    private static String f18279e = DeviceNameEditActivity.class.getSimpleName();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public EditText f18280b;

    /* renamed from: c */
    C4198d f18281c;

    /* renamed from: d */
    private Handler f18282d = new C10000h();

    /* renamed from: com.yeelight.yeelib.ui.activity.DeviceNameEditActivity$a */
    class C9993a implements View.OnClickListener {
        C9993a() {
        }

        public void onClick(View view) {
            DeviceNameEditActivity.this.mo32266X();
            DeviceNameEditActivity.this.onBackPressed();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.DeviceNameEditActivity$b */
    class C9994b implements View.OnClickListener {
        C9994b() {
        }

        public void onClick(View view) {
            DeviceNameEditActivity.this.m24469Y();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.DeviceNameEditActivity$c */
    class C9995c implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ ImageView f18285a;

        C9995c(DeviceNameEditActivity deviceNameEditActivity, ImageView imageView) {
            this.f18285a = imageView;
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            int i4;
            ImageView imageView;
            if (charSequence.length() > 0) {
                imageView = this.f18285a;
                i4 = 0;
            } else {
                imageView = this.f18285a;
                i4 = 4;
            }
            imageView.setVisibility(i4);
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.DeviceNameEditActivity$d */
    class C9996d implements C10536b0.C10537a {

        /* renamed from: a */
        final /* synthetic */ ImageView f18286a;

        C9996d(DeviceNameEditActivity deviceNameEditActivity, ImageView imageView) {
            this.f18286a = imageView;
        }

        /* renamed from: a */
        public void mo26122a(String str) {
            ImageView imageView;
            int i;
            if (str.length() > 0) {
                imageView = this.f18286a;
                i = 0;
            } else {
                imageView = this.f18286a;
                i = 4;
            }
            imageView.setVisibility(i);
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.DeviceNameEditActivity$e */
    class C9997e implements View.OnClickListener {
        C9997e() {
        }

        public void onClick(View view) {
            DeviceNameEditActivity.this.f18280b.setText("");
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.DeviceNameEditActivity$f */
    class C9998f implements TextView.OnEditorActionListener {
        C9998f() {
        }

        public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            if (i == 6) {
                ((InputMethodManager) DeviceNameEditActivity.this.getSystemService("input_method")).hideSoftInputFromWindow(textView.getWindowToken(), 0);
            }
            return false;
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.DeviceNameEditActivity$g */
    class C9999g extends TimerTask {
        C9999g() {
        }

        public void run() {
            ((InputMethodManager) DeviceNameEditActivity.this.getSystemService("input_method")).showSoftInput(DeviceNameEditActivity.this.f18280b, 2);
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.DeviceNameEditActivity$h */
    class C10000h extends Handler {
        C10000h() {
        }

        public void handleMessage(Message message) {
            super.handleMessage(message);
            if (message.what == 0) {
                DeviceNameEditActivity deviceNameEditActivity = DeviceNameEditActivity.this;
                Toast.makeText(deviceNameEditActivity, deviceNameEditActivity.getText(R$string.personality_light_create_name_no_input), 0).show();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: Y */
    public void m24469Y() {
        mo32266X();
        String obj = this.f18280b.getText().toString();
        if (!TextUtils.isEmpty(obj.trim())) {
            this.f18281c.mo23353x(1, obj);
            finish();
            return;
        }
        this.f18282d.removeMessages(0);
        this.f18282d.sendEmptyMessageDelayed(0, 500);
    }

    /* renamed from: X */
    public void mo32266X() {
        if (this.f18280b != null) {
            ((InputMethodManager) getSystemService("input_method")).hideSoftInputFromWindow(this.f18280b.getWindowToken(), 0);
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo32193P();
        C10547m.m25758h(true, this);
        setContentView(R$layout.activity_edit_device_name);
        CommonTitleBar commonTitleBar = (CommonTitleBar) findViewById(R$id.title_bar);
        commonTitleBar.mo32825a(getText(R$string.common_text_name).toString(), new C9993a(), new C9994b());
        commonTitleBar.setTitleTextSize(16);
        commonTitleBar.setRightTextColor(getResources().getColor(R$color.common_color_primary));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        commonTitleBar.setLayoutParams(layoutParams);
        layoutParams.setMargins(0, C10547m.m25755e(this), 0, 0);
        Intent intent = getIntent();
        if (!intent.hasExtra("com.yeelight.cherry.device_id")) {
            C4308b.m12141t(f18279e, "Activity has not device id", false);
            finish();
            return;
        }
        C4200i o0 = C4257w.m11953o0(intent.getStringExtra("com.yeelight.cherry.device_id"));
        this.f18281c = o0;
        if (o0 == null || !o0.mo23331k0()) {
            BaseActivity.m24384U(this);
            finish();
            return;
        }
        this.f18280b = (EditText) findViewById(R$id.edit_textView);
        ImageView imageView = (ImageView) findViewById(R$id.edit_reset);
        String A = this.f18281c.mo23408d0().mo27627A();
        if (!TextUtils.isEmpty(A)) {
            this.f18280b.setText(A);
            this.f18280b.setSelection(A.length());
            imageView.setVisibility(0);
        }
        if (this.f18281c instanceof C6006h) {
            EditText editText = this.f18280b;
            editText.addTextChangedListener(new C10536b0(20, editText));
            this.f18280b.addTextChangedListener(new C9995c(this, imageView));
        } else {
            EditText editText2 = this.f18280b;
            editText2.addTextChangedListener(new C10536b0(26, 1, editText2, new C9996d(this, imageView)));
        }
        imageView.setOnClickListener(new C9997e());
        this.f18280b.setOnEditorActionListener(new C9998f());
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        if (this.f18280b != null) {
            new Timer().schedule(new C9999g(), 500);
        }
    }
}
