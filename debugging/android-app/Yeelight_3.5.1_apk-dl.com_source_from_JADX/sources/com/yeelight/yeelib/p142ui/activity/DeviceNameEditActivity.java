package com.yeelight.yeelib.p142ui.activity;

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
import com.yeelight.yeelib.device.WifiDeviceBase;
import com.yeelight.yeelib.device.base.C3010c;
import com.yeelight.yeelib.device.base.C3012e;
import com.yeelight.yeelib.managers.YeelightDeviceManager;
import com.yeelight.yeelib.p142ui.view.CommonTitleBar;
import com.yeelight.yeelib.utils.AppUtils;
import java.util.Timer;
import java.util.TimerTask;
import p051j4.C9183a0;
import p051j4.C9193k;

/* renamed from: com.yeelight.yeelib.ui.activity.DeviceNameEditActivity */
public class DeviceNameEditActivity extends BaseActivity {

    /* renamed from: d */
    private static String f14585d = "DeviceNameEditActivity";
    /* access modifiers changed from: private */

    /* renamed from: a */
    public EditText f14586a;

    /* renamed from: b */
    C3010c f14587b;

    /* renamed from: c */
    private Handler f14588c = new C8417h();

    /* renamed from: com.yeelight.yeelib.ui.activity.DeviceNameEditActivity$a */
    class C8410a implements View.OnClickListener {
        C8410a() {
        }

        public void onClick(View view) {
            DeviceNameEditActivity.this.mo35706X();
            DeviceNameEditActivity.this.onBackPressed();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.DeviceNameEditActivity$b */
    class C8411b implements View.OnClickListener {
        C8411b() {
        }

        public void onClick(View view) {
            DeviceNameEditActivity.this.m20052Y();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.DeviceNameEditActivity$c */
    class C8412c implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ ImageView f14591a;

        C8412c(DeviceNameEditActivity deviceNameEditActivity, ImageView imageView) {
            this.f14591a = imageView;
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            int i4;
            ImageView imageView;
            if (charSequence.length() > 0) {
                imageView = this.f14591a;
                i4 = 0;
            } else {
                imageView = this.f14591a;
                i4 = 4;
            }
            imageView.setVisibility(i4);
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.DeviceNameEditActivity$d */
    class C8413d implements C9183a0.C9184a {

        /* renamed from: a */
        final /* synthetic */ ImageView f14592a;

        C8413d(DeviceNameEditActivity deviceNameEditActivity, ImageView imageView) {
            this.f14592a = imageView;
        }

        /* renamed from: a */
        public void mo30178a(String str) {
            ImageView imageView;
            int i;
            if (str.length() > 0) {
                imageView = this.f14592a;
                i = 0;
            } else {
                imageView = this.f14592a;
                i = 4;
            }
            imageView.setVisibility(i);
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.DeviceNameEditActivity$e */
    class C8414e implements View.OnClickListener {
        C8414e() {
        }

        public void onClick(View view) {
            DeviceNameEditActivity.this.f14586a.setText("");
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.DeviceNameEditActivity$f */
    class C8415f implements TextView.OnEditorActionListener {
        C8415f() {
        }

        public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            if (i == 6) {
                ((InputMethodManager) DeviceNameEditActivity.this.getSystemService("input_method")).hideSoftInputFromWindow(textView.getWindowToken(), 0);
            }
            return false;
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.DeviceNameEditActivity$g */
    class C8416g extends TimerTask {
        C8416g() {
        }

        public void run() {
            ((InputMethodManager) DeviceNameEditActivity.this.getSystemService("input_method")).showSoftInput(DeviceNameEditActivity.this.f14586a, 2);
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.DeviceNameEditActivity$h */
    class C8417h extends Handler {
        C8417h() {
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
    public void m20052Y() {
        mo35706X();
        String obj = this.f14586a.getText().toString();
        if (!TextUtils.isEmpty(obj.trim())) {
            this.f14587b.mo23166x(1, obj);
            finish();
            return;
        }
        this.f14588c.removeMessages(0);
        this.f14588c.sendEmptyMessageDelayed(0, 500);
    }

    /* renamed from: X */
    public void mo35706X() {
        if (this.f14586a != null) {
            ((InputMethodManager) getSystemService("input_method")).hideSoftInputFromWindow(this.f14586a.getWindowToken(), 0);
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo35653P();
        C9193k.m22157h(true, this);
        setContentView(R$layout.activity_edit_device_name);
        CommonTitleBar commonTitleBar = (CommonTitleBar) findViewById(R$id.title_bar);
        commonTitleBar.mo36195a(getText(R$string.common_text_name).toString(), new C8410a(), new C8411b());
        commonTitleBar.setTitleTextSize(16);
        commonTitleBar.setRightTextColor(getResources().getColor(R$color.common_color_primary));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        commonTitleBar.setLayoutParams(layoutParams);
        layoutParams.setMargins(0, C9193k.m22154e(this), 0, 0);
        Intent intent = getIntent();
        if (!intent.hasExtra("com.yeelight.cherry.device_id")) {
            AppUtils.m8302w(f14585d, "Activity has not device id", false);
            finish();
            return;
        }
        C3012e r0 = YeelightDeviceManager.m7804r0(intent.getStringExtra("com.yeelight.cherry.device_id"));
        this.f14587b = r0;
        if (r0 == null || !r0.mo23145k0()) {
            BaseActivity.m19947U(this);
            finish();
            return;
        }
        this.f14586a = (EditText) findViewById(R$id.edit_textView);
        ImageView imageView = (ImageView) findViewById(R$id.edit_reset);
        String A = this.f14587b.mo23221d0().mo31526A();
        if (!TextUtils.isEmpty(A)) {
            this.f14586a.setText(A);
            this.f14586a.setSelection(A.length());
            imageView.setVisibility(0);
        }
        if (this.f14587b instanceof WifiDeviceBase) {
            EditText editText = this.f14586a;
            editText.addTextChangedListener(new C9183a0(20, editText));
            this.f14586a.addTextChangedListener(new C8412c(this, imageView));
        } else {
            EditText editText2 = this.f14586a;
            editText2.addTextChangedListener(new C9183a0(26, 1, editText2, new C8413d(this, imageView)));
        }
        imageView.setOnClickListener(new C8414e());
        this.f14586a.setOnEditorActionListener(new C8415f());
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        if (this.f14586a != null) {
            new Timer().schedule(new C8416g(), 500);
        }
    }
}
