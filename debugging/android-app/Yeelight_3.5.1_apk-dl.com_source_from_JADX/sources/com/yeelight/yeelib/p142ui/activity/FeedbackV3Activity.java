package com.yeelight.yeelib.p142ui.activity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.yeelight.yeelib.R$color;
import com.yeelight.yeelib.R$id;
import com.yeelight.yeelib.R$layout;
import com.yeelight.yeelib.R$string;
import com.yeelight.yeelib.data.AppConfigurationProvider;
import com.yeelight.yeelib.device.base.C3010c;
import com.yeelight.yeelib.managers.C3051a;
import com.yeelight.yeelib.managers.C3088r;
import com.yeelight.yeelib.managers.YeelightDeviceManager;
import com.yeelight.yeelib.models.C8318j;
import com.yeelight.yeelib.p142ui.view.CommonTitleBar;
import org.json.JSONObject;
import p051j4.C3280l;
import p051j4.C9193k;
import p134c4.C4007b;

/* renamed from: com.yeelight.yeelib.ui.activity.FeedbackV3Activity */
public class FeedbackV3Activity extends BaseActivity {

    /* renamed from: a */
    CommonTitleBar f14673a;

    /* renamed from: b */
    EditText f14674b;

    /* renamed from: c */
    FrameLayout f14675c;

    /* renamed from: d */
    ViewGroup f14676d;

    /* renamed from: e */
    TextView f14677e;

    /* renamed from: f */
    TextView f14678f;

    /* renamed from: g */
    EditText f14679g;

    /* renamed from: h */
    Button f14680h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public int f14681i = -2;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public String f14682j = null;

    /* renamed from: k */
    private C3010c f14683k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public ProgressDialog f14684l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public Handler f14685m = new Handler(new C8448a());

    /* renamed from: n */
    private C4007b<String> f14686n = new C8449b();

    /* renamed from: com.yeelight.yeelib.ui.activity.FeedbackV3Activity$a */
    class C8448a implements Handler.Callback {
        C8448a() {
        }

        public boolean handleMessage(Message message) {
            FeedbackV3Activity feedbackV3Activity;
            Resources resources;
            int i;
            FeedbackV3Activity.this.f14684l.dismiss();
            int i2 = message.what;
            if (i2 == 1) {
                feedbackV3Activity = FeedbackV3Activity.this;
                resources = feedbackV3Activity.getResources();
                i = R$string.feedback_say_something;
            } else {
                if (i2 == 2) {
                    C8318j jVar = new C8318j();
                    StringBuilder sb = new StringBuilder();
                    sb.append("context = ");
                    sb.append(FeedbackV3Activity.this.f14674b.getText().toString());
                    jVar.mo35371d(FeedbackV3Activity.this.f14674b.getText().toString());
                    jVar.mo35373f(System.currentTimeMillis());
                    C3280l.m8817c().mo23856e().add(0, jVar);
                    C3280l.f5287g++;
                    FeedbackV3Activity.this.startActivity(new Intent(FeedbackV3Activity.this, FeedbackSuccessActivity.class));
                    FeedbackV3Activity.this.finish();
                } else if (i2 == 3) {
                    feedbackV3Activity = FeedbackV3Activity.this;
                    resources = feedbackV3Activity.getResources();
                    i = R$string.feedback_server_error;
                }
                return false;
            }
            Toast.makeText(feedbackV3Activity, resources.getString(i), 0).show();
            return false;
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.FeedbackV3Activity$b */
    class C8449b implements C4007b<String> {
        C8449b() {
        }

        /* renamed from: b */
        public void mo23338a(String str) {
            try {
                StringBuilder sb = new StringBuilder();
                sb.append("Feedback result : ");
                sb.append(str);
                if (new JSONObject(str).getInt("code") == 1) {
                    FeedbackV3Activity.this.f14685m.sendEmptyMessage(2);
                } else {
                    FeedbackV3Activity.this.f14685m.sendEmptyMessage(3);
                }
            } catch (Exception e) {
                e.printStackTrace();
                FeedbackV3Activity.this.f14685m.sendEmptyMessage(3);
            }
        }

        public void onFailure(int i, String str) {
            FeedbackV3Activity.this.f14685m.sendEmptyMessage(3);
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.FeedbackV3Activity$c */
    class C8450c implements View.OnClickListener {
        C8450c() {
        }

        public void onClick(View view) {
            FeedbackV3Activity.this.finish();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.FeedbackV3Activity$d */
    class C8451d implements View.OnClickListener {
        C8451d() {
        }

        public void onClick(View view) {
            FeedbackV3Activity.this.mo35752Z();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.FeedbackV3Activity$e */
    class C8452e implements View.OnClickListener {
        C8452e() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(FeedbackV3Activity.this, FeedbackSelectDeviceActivity.class);
            intent.putExtra("model", FeedbackV3Activity.this.f14682j);
            FeedbackV3Activity.this.startActivityForResult(intent, 2);
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.FeedbackV3Activity$f */
    class C8453f implements View.OnClickListener {
        C8453f() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(FeedbackV3Activity.this, FeedbackSelectQuestionTypeActivity.class);
            intent.putExtra("id", FeedbackV3Activity.this.f14681i);
            FeedbackV3Activity.this.startActivityForResult(intent, 1);
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.FeedbackV3Activity$g */
    class C8454g implements TextWatcher {
        C8454g() {
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            boolean z;
            Button button;
            if (charSequence.length() <= 0 || FeedbackV3Activity.this.f14681i <= -2) {
                button = FeedbackV3Activity.this.f14680h;
                z = false;
            } else {
                button = FeedbackV3Activity.this.f14680h;
                z = true;
            }
            button.setEnabled(z);
        }
    }

    /* renamed from: Z */
    public void mo35752Z() {
        this.f14673a.setRightButtonVisibility(4);
        String obj = this.f14679g.getText().toString();
        String obj2 = this.f14674b.getText().toString();
        AppConfigurationProvider.m17582n("feedback_contact" + C3051a.m7925r().mo23366v(), obj);
        if (obj2.length() < 1) {
            Toast.makeText(this, getResources().getString(R$string.feedback_say_something), 0).show();
        }
        if (!this.f14684l.isShowing()) {
            this.f14684l.show();
        }
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo == null || !activeNetworkInfo.isAvailable()) {
            Toast.makeText(this, getResources().getString(R$string.feedback_network_err), 0).show();
            this.f14673a.setRightButtonVisibility(0);
            if (this.f14684l.isShowing()) {
                this.f14684l.dismiss();
                return;
            }
            return;
        }
        C3280l.m8817c().mo23859j(obj2, obj, this.f14681i, this.f14683k, this.f14682j, this.f14686n);
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == -1 && intent != null) {
            if (i == 1) {
                String stringExtra = intent.getStringExtra("name");
                this.f14681i = intent.getIntExtra("id", -1);
                this.f14677e.setText(stringExtra);
                if (!TextUtils.isEmpty(this.f14674b.getText().toString())) {
                    this.f14680h.setEnabled(true);
                }
            } else if (i == 2) {
                this.f14682j = intent.getStringExtra("model");
                this.f14678f.setText(intent.getStringExtra("name"));
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo35653P();
        C9193k.m22157h(true, this);
        if (getIntent().hasExtra("com.yeelight.cherry.device_id")) {
            this.f14683k = YeelightDeviceManager.m7794j0(getIntent().getStringExtra("com.yeelight.cherry.device_id"));
        }
        setContentView(R$layout.activity_feedback_v3);
        this.f14674b = (EditText) findViewById(R$id.et_question);
        this.f14679g = (EditText) findViewById(R$id.et_contact);
        this.f14680h = (Button) findViewById(R$id.btn_submit);
        this.f14675c = (FrameLayout) findViewById(R$id.question_type_layout);
        this.f14676d = (ViewGroup) findViewById(R$id.device_type_layout);
        this.f14678f = (TextView) findViewById(R$id.txt_device_type);
        this.f14677e = (TextView) findViewById(R$id.txt_question_type);
        CommonTitleBar commonTitleBar = (CommonTitleBar) findViewById(R$id.title_bar);
        this.f14673a = commonTitleBar;
        commonTitleBar.setTitleTextColor(R$color.common_text_color_primary_33);
        this.f14673a.mo36195a(getString(R$string.feature_feedback), new C8450c(), (View.OnClickListener) null);
        this.f14680h.setOnClickListener(new C8451d());
        this.f14676d.setOnClickListener(new C8452e());
        this.f14675c.setOnClickListener(new C8453f());
        this.f14674b.addTextChangedListener(new C8454g());
        this.f14679g.setText(AppConfigurationProvider.m17574f("feedback_contact" + C3051a.m7925r().mo23366v()));
        C3010c cVar = this.f14683k;
        if (cVar != null) {
            this.f14682j = cVar.mo23208T();
            this.f14678f.setText(C3088r.m8117g().mo23473m(this.f14683k.mo23208T()));
            this.f14676d.setClickable(false);
        }
        ProgressDialog progressDialog = new ProgressDialog(this);
        this.f14684l = progressDialog;
        progressDialog.setMessage(getString(R$string.feedback_sending));
        this.f14684l.setCancelable(false);
    }
}
