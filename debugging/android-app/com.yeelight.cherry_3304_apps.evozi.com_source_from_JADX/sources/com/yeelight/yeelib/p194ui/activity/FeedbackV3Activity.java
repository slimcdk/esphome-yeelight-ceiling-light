package com.yeelight.yeelib.p194ui.activity;

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
import com.yeelight.yeelib.p150c.p151i.C4198d;
import com.yeelight.yeelib.p152f.C4201a;
import com.yeelight.yeelib.p152f.C4239r;
import com.yeelight.yeelib.p152f.C4257w;
import com.yeelight.yeelib.p153g.C9842k;
import com.yeelight.yeelib.p187h.p189h.C9874b;
import com.yeelight.yeelib.p194ui.view.CommonTitleBar;
import com.yeelight.yeelib.utils.C10547m;
import com.yeelight.yeelib.utils.C4312n;
import org.json.JSONObject;

/* renamed from: com.yeelight.yeelib.ui.activity.FeedbackV3Activity */
public class FeedbackV3Activity extends BaseActivity {

    /* renamed from: b */
    CommonTitleBar f18365b;

    /* renamed from: c */
    EditText f18366c;

    /* renamed from: d */
    FrameLayout f18367d;

    /* renamed from: e */
    ViewGroup f18368e;

    /* renamed from: f */
    TextView f18369f;

    /* renamed from: g */
    TextView f18370g;

    /* renamed from: h */
    EditText f18371h;

    /* renamed from: i */
    Button f18372i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public int f18373j = -2;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public String f18374k = null;

    /* renamed from: l */
    private C4198d f18375l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public ProgressDialog f18376m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public Handler f18377n = new Handler(new C10030a());

    /* renamed from: o */
    private C9874b<String> f18378o = new C10031b();

    /* renamed from: com.yeelight.yeelib.ui.activity.FeedbackV3Activity$a */
    class C10030a implements Handler.Callback {
        C10030a() {
        }

        public boolean handleMessage(Message message) {
            FeedbackV3Activity feedbackV3Activity;
            Resources resources;
            int i;
            FeedbackV3Activity.this.f18376m.dismiss();
            int i2 = message.what;
            if (i2 == 1) {
                feedbackV3Activity = FeedbackV3Activity.this;
                resources = feedbackV3Activity.getResources();
                i = R$string.feedback_say_something;
            } else {
                if (i2 == 2) {
                    C9842k kVar = new C9842k();
                    "context = " + FeedbackV3Activity.this.f18366c.getText().toString();
                    kVar.mo31784d(FeedbackV3Activity.this.f18366c.getText().toString());
                    kVar.mo31786f(System.currentTimeMillis());
                    C4312n.m12166c().mo23772e().add(0, kVar);
                    C4312n.f7499g++;
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
    class C10031b implements C9874b<String> {
        C10031b() {
        }

        /* renamed from: b */
        public void mo23475a(String str) {
            try {
                "Feedback result : " + str;
                if (new JSONObject(str).getInt("code") == 1) {
                    FeedbackV3Activity.this.f18377n.sendEmptyMessage(2);
                } else {
                    FeedbackV3Activity.this.f18377n.sendEmptyMessage(3);
                }
            } catch (Exception e) {
                e.printStackTrace();
                FeedbackV3Activity.this.f18377n.sendEmptyMessage(3);
            }
        }

        public void onFailure(int i, String str) {
            FeedbackV3Activity.this.f18377n.sendEmptyMessage(3);
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.FeedbackV3Activity$c */
    class C10032c implements View.OnClickListener {
        C10032c() {
        }

        public void onClick(View view) {
            FeedbackV3Activity.this.finish();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.FeedbackV3Activity$d */
    class C10033d implements View.OnClickListener {
        C10033d() {
        }

        public void onClick(View view) {
            FeedbackV3Activity.this.mo32314Z();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.FeedbackV3Activity$e */
    class C10034e implements View.OnClickListener {
        C10034e() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(FeedbackV3Activity.this, FeedbackSelectDeviceActivity.class);
            intent.putExtra("model", FeedbackV3Activity.this.f18374k);
            FeedbackV3Activity.this.startActivityForResult(intent, 2);
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.FeedbackV3Activity$f */
    class C10035f implements View.OnClickListener {
        C10035f() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(FeedbackV3Activity.this, FeedbackSelectQuestionTypeActivity.class);
            intent.putExtra("id", FeedbackV3Activity.this.f18373j);
            FeedbackV3Activity.this.startActivityForResult(intent, 1);
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.FeedbackV3Activity$g */
    class C10036g implements TextWatcher {
        C10036g() {
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            boolean z;
            Button button;
            if (charSequence.length() <= 0 || FeedbackV3Activity.this.f18373j <= -2) {
                button = FeedbackV3Activity.this.f18372i;
                z = false;
            } else {
                button = FeedbackV3Activity.this.f18372i;
                z = true;
            }
            button.setEnabled(z);
        }
    }

    /* renamed from: Z */
    public void mo32314Z() {
        this.f18365b.setRightButtonVisibility(4);
        String obj = this.f18371h.getText().toString();
        String obj2 = this.f18366c.getText().toString();
        AppConfigurationProvider.m22361n("feedback_contact" + C4201a.m11607r().mo23452v(), obj);
        if (obj2.length() < 1) {
            Toast.makeText(this, getResources().getString(R$string.feedback_say_something), 0).show();
        }
        if (!this.f18376m.isShowing()) {
            this.f18376m.show();
        }
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo == null || !activeNetworkInfo.isAvailable()) {
            Toast.makeText(this, getResources().getString(R$string.feedback_network_err), 0).show();
            this.f18365b.setRightButtonVisibility(0);
            if (this.f18376m.isShowing()) {
                this.f18376m.dismiss();
                return;
            }
            return;
        }
        C4312n.m12166c().mo23775j(obj2, obj, this.f18373j, this.f18375l, this.f18374k, this.f18378o);
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == -1 && intent != null) {
            if (i == 1) {
                String stringExtra = intent.getStringExtra("name");
                this.f18373j = intent.getIntExtra("id", -1);
                this.f18369f.setText(stringExtra);
                if (!TextUtils.isEmpty(this.f18366c.getText().toString())) {
                    this.f18372i.setEnabled(true);
                }
            } else if (i == 2) {
                this.f18374k = intent.getStringExtra("model");
                this.f18370g.setText(intent.getStringExtra("name"));
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo32193P();
        C10547m.m25758h(true, this);
        if (getIntent().hasExtra("com.yeelight.cherry.device_id")) {
            this.f18375l = C4257w.m11945h0(getIntent().getStringExtra("com.yeelight.cherry.device_id"));
        }
        setContentView(R$layout.activity_feedback_v3);
        this.f18366c = (EditText) findViewById(R$id.et_question);
        this.f18371h = (EditText) findViewById(R$id.et_contact);
        this.f18372i = (Button) findViewById(R$id.btn_submit);
        this.f18367d = (FrameLayout) findViewById(R$id.question_type_layout);
        this.f18368e = (ViewGroup) findViewById(R$id.device_type_layout);
        this.f18370g = (TextView) findViewById(R$id.txt_device_type);
        this.f18369f = (TextView) findViewById(R$id.txt_question_type);
        CommonTitleBar commonTitleBar = (CommonTitleBar) findViewById(R$id.title_bar);
        this.f18365b = commonTitleBar;
        commonTitleBar.setTitleTextColor(R$color.common_text_color_primary_33);
        this.f18365b.mo32825a(getString(R$string.feature_feedback), new C10032c(), (View.OnClickListener) null);
        this.f18372i.setOnClickListener(new C10033d());
        this.f18368e.setOnClickListener(new C10034e());
        this.f18367d.setOnClickListener(new C10035f());
        this.f18366c.addTextChangedListener(new C10036g());
        this.f18371h.setText(AppConfigurationProvider.m22353f("feedback_contact" + C4201a.m11607r().mo23452v()));
        C4198d dVar = this.f18375l;
        if (dVar != null) {
            this.f18374k = dVar.mo23395T();
            this.f18370g.setText(C4239r.m11807g().mo23580m(this.f18375l.mo23395T()));
            this.f18368e.setClickable(false);
        }
        ProgressDialog progressDialog = new ProgressDialog(this);
        this.f18376m = progressDialog;
        progressDialog.setMessage(getString(R$string.feedback_sending));
        this.f18376m.setCancelable(false);
    }
}
