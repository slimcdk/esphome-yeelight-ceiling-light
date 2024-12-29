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
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.yeelight.cherry.C11745R$id;
import com.yeelight.cherry.C11748R$layout;
import com.yeelight.yeelib.p150c.C6006h;
import com.yeelight.yeelib.p150c.p151i.C4198d;
import com.yeelight.yeelib.p150c.p151i.C6067o;
import com.yeelight.yeelib.p150c.p183m.C6318b1;
import com.yeelight.yeelib.p150c.p183m.C6418d1;
import com.yeelight.yeelib.p150c.p183m.C6922j1;
import com.yeelight.yeelib.p150c.p183m.C7130o0;
import com.yeelight.yeelib.p150c.p183m.C7472y;
import com.yeelight.yeelib.p152f.C4257w;
import com.yeelight.yeelib.p152f.C9812t;
import com.yeelight.yeelib.p190i.C9875a;
import com.yeelight.yeelib.p194ui.activity.BaseActivity;
import com.yeelight.yeelib.utils.C10536b0;
import com.yeelight.yeelib.utils.C10547m;
import com.yeelight.yeelib.utils.C4308b;
import java.util.List;

/* renamed from: com.yeelight.cherry.ui.activity.QuickConnectReNameDeviceActivity */
public class QuickConnectReNameDeviceActivity extends BaseActivity {

    /* renamed from: g */
    private static String f11636g = QuickConnectReNameDeviceActivity.class.getSimpleName();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public EditText f11637b;

    /* renamed from: c */
    private C4198d f11638c;

    /* renamed from: d */
    private Button f11639d;

    /* renamed from: e */
    private boolean f11640e = false;

    /* renamed from: f */
    private Handler f11641f = new Handler(new C5569f());

    /* renamed from: com.yeelight.cherry.ui.activity.QuickConnectReNameDeviceActivity$a */
    class C5564a implements View.OnClickListener {
        C5564a() {
        }

        public void onClick(View view) {
            QuickConnectReNameDeviceActivity.this.m16927a0();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.QuickConnectReNameDeviceActivity$b */
    class C5565b implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ ImageView f11643a;

        C5565b(QuickConnectReNameDeviceActivity quickConnectReNameDeviceActivity, ImageView imageView) {
            this.f11643a = imageView;
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            int i4;
            ImageView imageView;
            if (charSequence.length() > 0) {
                imageView = this.f11643a;
                i4 = 0;
            } else {
                imageView = this.f11643a;
                i4 = 4;
            }
            imageView.setVisibility(i4);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.QuickConnectReNameDeviceActivity$c */
    class C5566c implements C10536b0.C10537a {

        /* renamed from: a */
        final /* synthetic */ ImageView f11644a;

        C5566c(QuickConnectReNameDeviceActivity quickConnectReNameDeviceActivity, ImageView imageView) {
            this.f11644a = imageView;
        }

        /* renamed from: a */
        public void mo26122a(String str) {
            ImageView imageView;
            int i;
            if (str.length() > 0) {
                imageView = this.f11644a;
                i = 0;
            } else {
                imageView = this.f11644a;
                i = 4;
            }
            imageView.setVisibility(i);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.QuickConnectReNameDeviceActivity$d */
    class C5567d implements View.OnClickListener {
        C5567d() {
        }

        public void onClick(View view) {
            QuickConnectReNameDeviceActivity.this.f11637b.setText("");
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.QuickConnectReNameDeviceActivity$e */
    class C5568e implements TextView.OnEditorActionListener {
        C5568e() {
        }

        public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            if (i == 6) {
                ((InputMethodManager) QuickConnectReNameDeviceActivity.this.getSystemService("input_method")).hideSoftInputFromWindow(textView.getWindowToken(), 0);
            }
            return false;
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.QuickConnectReNameDeviceActivity$f */
    class C5569f implements Handler.Callback {
        C5569f() {
        }

        public boolean handleMessage(Message message) {
            if (message.what == 0) {
                QuickConnectReNameDeviceActivity quickConnectReNameDeviceActivity = QuickConnectReNameDeviceActivity.this;
                Toast.makeText(quickConnectReNameDeviceActivity, quickConnectReNameDeviceActivity.getText(2131756002), 0).show();
            }
            return false;
        }
    }

    /* renamed from: X */
    private boolean m16925X(C4198d dVar) {
        return !(dVar instanceof C7130o0) && !(dVar instanceof C6418d1) && !(dVar instanceof C7472y) && !(dVar instanceof C6922j1) && !(dVar instanceof C6318b1);
    }

    /* renamed from: Z */
    private void m16926Z() {
        List<C9875a> k;
        View findViewById = findViewById(C11745R$id.two_view);
        if (!m16925X(this.f11638c) || (k = C9812t.m23832j().mo31685k()) == null || k.size() <= 0) {
            this.f11640e = false;
            findViewById.setVisibility(8);
        } else {
            this.f11640e = true;
            findViewById.setVisibility(0);
        }
        View findViewById2 = findViewById(C11745R$id.three_view);
        if (!this.f11638c.mo23415n0(18)) {
            findViewById2.setVisibility(8);
        }
        if (findViewById.getVisibility() == 8 && findViewById2.getVisibility() == 8) {
            ((LinearLayout) findViewById(C11745R$id.layout_indicator)).setVisibility(8);
            this.f11639d.setText(getString(2131755237));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a0 */
    public void m16927a0() {
        Intent intent;
        mo26839Y();
        String obj = this.f11637b.getText().toString();
        if (!TextUtils.isEmpty(obj.trim())) {
            if (!TextUtils.equals(this.f11638c.mo23397U(), obj.trim())) {
                this.f11638c.mo23385N0(obj);
                this.f11638c.mo23353x(1, obj);
            }
            if (this.f11640e) {
                intent = new Intent(this, QuickConnectSelectedRoomActivity.class);
            } else if (this.f11638c.mo23415n0(18)) {
                intent = new Intent(this, QuickConnectLanControlActivity.class);
            } else {
                intent = new Intent();
                intent.setClass(this, MainActivity.class);
                intent.putExtra("com.yeelight.cherry.device_id", this.f11638c.mo23372G());
                intent.addFlags(67108864);
                if (this.f11638c instanceof C7472y) {
                    intent.putExtra("CURTAIN_CONFIG", true);
                }
                startActivity(intent);
                finish();
                return;
            }
            intent.putExtra("com.yeelight.cherry.device_id", this.f11638c.mo23372G());
            startActivity(intent);
            finish();
            return;
        }
        this.f11641f.removeMessages(0);
        this.f11641f.sendEmptyMessageDelayed(0, 500);
    }

    /* renamed from: Y */
    public void mo26839Y() {
        if (this.f11637b != null) {
            ((InputMethodManager) getSystemService("input_method")).hideSoftInputFromWindow(this.f11637b.getWindowToken(), 0);
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo32193P();
        C10547m.m25758h(true, this);
        setContentView(C11748R$layout.activity_quickconnect_rename);
        Intent intent = getIntent();
        if (!intent.hasExtra("com.yeelight.cherry.device_id")) {
            C4308b.m12141t(f11636g, "Activity has not device id", false);
            finish();
            return;
        }
        String stringExtra = intent.getStringExtra("com.yeelight.cherry.device_id");
        "mDevice deviceId = " + stringExtra;
        C4198d h0 = C4257w.m11945h0(stringExtra);
        this.f11638c = h0;
        if (h0 == null) {
            BaseActivity.m24384U(this);
            finish();
            return;
        }
        this.f11637b = (EditText) findViewById(2131296640);
        ImageView imageView = (ImageView) findViewById(2131296639);
        String U = this.f11638c.mo23397U();
        if (!TextUtils.isEmpty(this.f11638c.mo23397U())) {
            this.f11637b.setText(U);
            this.f11637b.setSelection(U.length());
            imageView.setVisibility(0);
        }
        Button button = (Button) findViewById(C11745R$id.next);
        this.f11639d = button;
        button.setOnClickListener(new C5564a());
        C4198d dVar = this.f11638c;
        if ((dVar instanceof C6006h) || (dVar instanceof C6067o)) {
            EditText editText = this.f11637b;
            editText.addTextChangedListener(new C10536b0(20, editText));
            this.f11637b.addTextChangedListener(new C5565b(this, imageView));
        } else {
            EditText editText2 = this.f11637b;
            editText2.addTextChangedListener(new C10536b0(26, 1, editText2, new C5566c(this, imageView)));
        }
        imageView.setOnClickListener(new C5567d());
        this.f11637b.setOnEditorActionListener(new C5568e());
        m16926Z();
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
    }
}
