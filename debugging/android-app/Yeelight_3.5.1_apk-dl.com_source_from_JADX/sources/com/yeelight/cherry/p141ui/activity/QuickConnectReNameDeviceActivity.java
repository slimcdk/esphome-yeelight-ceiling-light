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
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.yeelight.cherry.C12225R$id;
import com.yeelight.cherry.C12228R$layout;
import com.yeelight.yeelib.device.WifiDeviceBase;
import com.yeelight.yeelib.device.base.C3010c;
import com.yeelight.yeelib.managers.C8293t;
import com.yeelight.yeelib.managers.YeelightDeviceManager;
import com.yeelight.yeelib.p142ui.activity.BaseActivity;
import com.yeelight.yeelib.utils.AppUtils;
import java.util.List;
import p051j4.C9183a0;
import p051j4.C9193k;
import p145d4.C8937a;
import p207s3.C10344f;
import p223w3.C10797d1;
import p223w3.C10916f1;
import p223w3.C11406l1;
import p223w3.C11571p0;
import p223w3.C11911z;

/* renamed from: com.yeelight.cherry.ui.activity.QuickConnectReNameDeviceActivity */
public class QuickConnectReNameDeviceActivity extends BaseActivity {

    /* renamed from: f */
    private static String f11199f = "QuickConnectReNameDeviceActivity";
    /* access modifiers changed from: private */

    /* renamed from: a */
    public EditText f11200a;

    /* renamed from: b */
    private C3010c f11201b;

    /* renamed from: c */
    private Button f11202c;

    /* renamed from: d */
    private boolean f11203d = false;

    /* renamed from: e */
    private Handler f11204e = new Handler(new C5610f());

    /* renamed from: com.yeelight.cherry.ui.activity.QuickConnectReNameDeviceActivity$a */
    class C5605a implements View.OnClickListener {
        C5605a() {
        }

        public void onClick(View view) {
            QuickConnectReNameDeviceActivity.this.m16923a0();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.QuickConnectReNameDeviceActivity$b */
    class C5606b implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ ImageView f11206a;

        C5606b(QuickConnectReNameDeviceActivity quickConnectReNameDeviceActivity, ImageView imageView) {
            this.f11206a = imageView;
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            int i4;
            ImageView imageView;
            if (charSequence.length() > 0) {
                imageView = this.f11206a;
                i4 = 0;
            } else {
                imageView = this.f11206a;
                i4 = 4;
            }
            imageView.setVisibility(i4);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.QuickConnectReNameDeviceActivity$c */
    class C5607c implements C9183a0.C9184a {

        /* renamed from: a */
        final /* synthetic */ ImageView f11207a;

        C5607c(QuickConnectReNameDeviceActivity quickConnectReNameDeviceActivity, ImageView imageView) {
            this.f11207a = imageView;
        }

        /* renamed from: a */
        public void mo30178a(String str) {
            ImageView imageView;
            int i;
            if (str.length() > 0) {
                imageView = this.f11207a;
                i = 0;
            } else {
                imageView = this.f11207a;
                i = 4;
            }
            imageView.setVisibility(i);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.QuickConnectReNameDeviceActivity$d */
    class C5608d implements View.OnClickListener {
        C5608d() {
        }

        public void onClick(View view) {
            QuickConnectReNameDeviceActivity.this.f11200a.setText("");
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.QuickConnectReNameDeviceActivity$e */
    class C5609e implements TextView.OnEditorActionListener {
        C5609e() {
        }

        public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            if (i == 6) {
                ((InputMethodManager) QuickConnectReNameDeviceActivity.this.getSystemService("input_method")).hideSoftInputFromWindow(textView.getWindowToken(), 0);
            }
            return false;
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.QuickConnectReNameDeviceActivity$f */
    class C5610f implements Handler.Callback {
        C5610f() {
        }

        public boolean handleMessage(Message message) {
            if (message.what == 0) {
                QuickConnectReNameDeviceActivity quickConnectReNameDeviceActivity = QuickConnectReNameDeviceActivity.this;
                Toast.makeText(quickConnectReNameDeviceActivity, quickConnectReNameDeviceActivity.getText(2131756014), 0).show();
            }
            return false;
        }
    }

    /* renamed from: X */
    private boolean m16921X(C3010c cVar) {
        return !(cVar instanceof C11571p0) && !(cVar instanceof C10916f1) && !(cVar instanceof C11911z) && !(cVar instanceof C11406l1) && !(cVar instanceof C10797d1);
    }

    /* renamed from: Z */
    private void m16922Z() {
        List<C8937a> o;
        View findViewById = findViewById(C12225R$id.two_view);
        if (!m16921X(this.f11201b) || (o = C8293t.m19620n().mo35255o()) == null || o.size() <= 0) {
            this.f11203d = false;
            findViewById.setVisibility(8);
        } else {
            this.f11203d = true;
            findViewById.setVisibility(0);
        }
        View findViewById2 = findViewById(C12225R$id.three_view);
        if (!this.f11201b.mo23229n0(18)) {
            findViewById2.setVisibility(8);
        }
        if (findViewById.getVisibility() == 8 && findViewById2.getVisibility() == 8) {
            ((LinearLayout) findViewById(C12225R$id.layout_indicator)).setVisibility(8);
            this.f11202c.setText(getString(2131755240));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a0 */
    public void m16923a0() {
        Intent intent;
        mo30820Y();
        String obj = this.f11200a.getText().toString();
        if (!TextUtils.isEmpty(obj.trim())) {
            if (!TextUtils.equals(this.f11201b.mo23210U(), obj.trim())) {
                this.f11201b.mo23198N0(obj);
                this.f11201b.mo23166x(1, obj);
            }
            if (this.f11203d) {
                intent = new Intent(this, QuickConnectSelectedRoomActivity.class);
            } else if (this.f11201b.mo23229n0(18)) {
                intent = new Intent(this, QuickConnectLanControlActivity.class);
            } else {
                intent = new Intent();
                intent.setClass(this, MainActivity.class);
                intent.putExtra("com.yeelight.cherry.device_id", this.f11201b.mo23185G());
                intent.addFlags(67108864);
                if (this.f11201b instanceof C11911z) {
                    intent.putExtra("CURTAIN_CONFIG", true);
                }
                startActivity(intent);
                finish();
                return;
            }
            intent.putExtra("com.yeelight.cherry.device_id", this.f11201b.mo23185G());
            startActivity(intent);
            finish();
            return;
        }
        this.f11204e.removeMessages(0);
        this.f11204e.sendEmptyMessageDelayed(0, 500);
    }

    /* renamed from: Y */
    public void mo30820Y() {
        if (this.f11200a != null) {
            ((InputMethodManager) getSystemService("input_method")).hideSoftInputFromWindow(this.f11200a.getWindowToken(), 0);
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo35653P();
        C9193k.m22157h(true, this);
        setContentView(C12228R$layout.activity_quickconnect_rename);
        Intent intent = getIntent();
        if (!intent.hasExtra("com.yeelight.cherry.device_id")) {
            AppUtils.m8302w(f11199f, "Activity has not device id", false);
            finish();
            return;
        }
        String stringExtra = intent.getStringExtra("com.yeelight.cherry.device_id");
        StringBuilder sb = new StringBuilder();
        sb.append("mDevice deviceId = ");
        sb.append(stringExtra);
        C3010c j0 = YeelightDeviceManager.m7794j0(stringExtra);
        this.f11201b = j0;
        if (j0 == null) {
            BaseActivity.m19947U(this);
            finish();
            return;
        }
        this.f11200a = (EditText) findViewById(2131296734);
        ImageView imageView = (ImageView) findViewById(2131296733);
        String U = this.f11201b.mo23210U();
        if (!TextUtils.isEmpty(this.f11201b.mo23210U())) {
            this.f11200a.setText(U);
            this.f11200a.setSelection(U.length());
            imageView.setVisibility(0);
        }
        Button button = (Button) findViewById(C12225R$id.next);
        this.f11202c = button;
        button.setOnClickListener(new C5605a());
        C3010c cVar = this.f11201b;
        if ((cVar instanceof WifiDeviceBase) || (cVar instanceof C10344f)) {
            EditText editText = this.f11200a;
            editText.addTextChangedListener(new C9183a0(20, editText));
            this.f11200a.addTextChangedListener(new C5606b(this, imageView));
        } else {
            EditText editText2 = this.f11200a;
            editText2.addTextChangedListener(new C9183a0(26, 1, editText2, new C5607c(this, imageView)));
        }
        imageView.setOnClickListener(new C5608d());
        this.f11200a.setOnEditorActionListener(new C5609e());
        m16922Z();
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
    }
}
