package com.yeelight.cherry.p141ui.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.yeelight.cherry.C12228R$layout;
import com.yeelight.yeelib.device.C6169f;
import com.yeelight.yeelib.device.WifiDeviceBase;
import com.yeelight.yeelib.device.base.C3010c;
import com.yeelight.yeelib.managers.C3096u;
import com.yeelight.yeelib.managers.YeelightDeviceManager;
import com.yeelight.yeelib.models.C8329t;
import com.yeelight.yeelib.models.C8330u;
import com.yeelight.yeelib.p142ui.activity.BaseActivity;
import com.yeelight.yeelib.p142ui.activity.CreateSceneBundleNewActivity;
import com.yeelight.yeelib.p142ui.view.CommonTitleBar;
import com.yeelight.yeelib.utils.AppUtils;
import java.util.ArrayList;
import org.json.JSONObject;
import p051j4.C9183a0;
import p051j4.C9193k;
import p051j4.C9195n;
import p134c4.C4007b;

/* renamed from: com.yeelight.cherry.ui.activity.CommonCreateNameActivity */
public class CommonCreateNameActivity extends BaseActivity {

    /* renamed from: d */
    public static final String f10062d = "CommonCreateNameActivity";
    /* access modifiers changed from: private */

    /* renamed from: a */
    public boolean f10063a;

    /* renamed from: b */
    private int f10064b = 0;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public String f10065c;
    @BindView(2131296460)
    ImageButton mBtnClear;
    @BindView(2131297165)
    TextView mBtnNext;
    @BindView(2131296749)
    EditText mEtName;
    @BindView(2131297591)
    CommonTitleBar mTitleBar;
    @BindView(2131297366)
    ImageView mTypeImageView;

    /* renamed from: com.yeelight.cherry.ui.activity.CommonCreateNameActivity$a */
    class C5115a implements View.OnClickListener {
        C5115a() {
        }

        public void onClick(View view) {
            CommonCreateNameActivity.this.mEtName.setText("");
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.CommonCreateNameActivity$b */
    class C5116b implements View.OnClickListener {
        C5116b() {
        }

        public void onClick(View view) {
            CommonCreateNameActivity.this.onBackPressed();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.CommonCreateNameActivity$c */
    class C5117c implements View.OnClickListener {
        C5117c() {
        }

        public void onClick(View view) {
            Intent intent;
            if (!CommonCreateNameActivity.this.f10063a) {
                if (CommonCreateNameActivity.this.f10065c != null) {
                    intent = new Intent(CommonCreateNameActivity.this, DemoControlViewActivity.class);
                    intent.putExtra("com.yeelight.cherry.device_id", CommonCreateNameActivity.this.f10065c);
                    intent.putExtra("room_flag", true);
                } else {
                    intent = new Intent(CommonCreateNameActivity.this, MainActivity.class);
                }
                intent.addFlags(67108864);
                CommonCreateNameActivity.this.startActivity(intent);
                CommonCreateNameActivity.this.finish();
                return;
            }
            CommonCreateNameActivity.this.m16020Y();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.CommonCreateNameActivity$d */
    class C5118d implements TextView.OnEditorActionListener {
        C5118d() {
        }

        public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            if (i == 6) {
                ((InputMethodManager) CommonCreateNameActivity.this.getSystemService("input_method")).hideSoftInputFromWindow(textView.getWindowToken(), 0);
                CommonCreateNameActivity.this.m16020Y();
            }
            return false;
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.CommonCreateNameActivity$e */
    class C5119e implements TextWatcher {
        C5119e() {
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            int i4;
            ImageButton imageButton;
            if (charSequence.length() > 0) {
                imageButton = CommonCreateNameActivity.this.mBtnClear;
                i4 = 0;
            } else {
                imageButton = CommonCreateNameActivity.this.mBtnClear;
                i4 = 8;
            }
            imageButton.setVisibility(i4);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.CommonCreateNameActivity$f */
    class C5120f implements Runnable {
        C5120f() {
        }

        public void run() {
            ((InputMethodManager) CommonCreateNameActivity.this.getSystemService("input_method")).showSoftInput(CommonCreateNameActivity.this.mEtName, 2);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.CommonCreateNameActivity$g */
    class C5121g implements C4007b<String> {
        C5121g() {
        }

        /* access modifiers changed from: private */
        /* renamed from: f */
        public /* synthetic */ void m16025f() {
            Toast.makeText(CommonCreateNameActivity.this, 2131755311, 0).show();
        }

        /* access modifiers changed from: private */
        /* renamed from: g */
        public /* synthetic */ void m16026g() {
            Toast.makeText(CommonCreateNameActivity.this, 2131755312, 0).show();
            try {
                int i = MainActivity.f10688y;
                Intent intent = new Intent(CommonCreateNameActivity.this, MainActivity.class);
                intent.addFlags(67108864);
                intent.putExtra("com.yeelight.cherry.fragment", 0);
                CommonCreateNameActivity.this.startActivity(intent);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
            CommonCreateNameActivity.this.finish();
        }

        /* access modifiers changed from: private */
        /* renamed from: h */
        public /* synthetic */ void m16027h() {
            Toast.makeText(CommonCreateNameActivity.this, 2131756230, 0).show();
        }

        /* access modifiers changed from: private */
        /* renamed from: i */
        public /* synthetic */ void m16028i() {
            Toast.makeText(CommonCreateNameActivity.this, 2131755311, 0).show();
        }

        /* renamed from: j */
        public void mo23338a(String str) {
            CommonCreateNameActivity commonCreateNameActivity;
            Runnable b0Var;
            try {
                JSONObject jSONObject = new JSONObject(str);
                String str2 = CommonCreateNameActivity.f10062d;
                StringBuilder sb = new StringBuilder();
                sb.append("saveSceneBundle, onResponse, result: ");
                sb.append(jSONObject.toString());
                int i = jSONObject.getInt("code");
                if (i == 1) {
                    C3096u.m8175n().mo23508D();
                    CommonCreateNameActivity.this.runOnUiThread(new C5747e0(this));
                    return;
                }
                if (i == 3002) {
                    commonCreateNameActivity = CommonCreateNameActivity.this;
                    b0Var = new C5741d0(this);
                } else {
                    commonCreateNameActivity = CommonCreateNameActivity.this;
                    b0Var = new C5729b0(this);
                }
                commonCreateNameActivity.runOnUiThread(b0Var);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public void onFailure(int i, String str) {
            String str2 = CommonCreateNameActivity.f10062d;
            CommonCreateNameActivity.this.runOnUiThread(new C5735c0(this));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: Y */
    public void m16020Y() {
        Class cls;
        String obj = this.mEtName.getText().toString();
        if (TextUtils.isEmpty(obj.trim())) {
            Toast.makeText(this, 2131756014, 0).show();
        } else if (this.f10063a) {
            Intent intent = new Intent();
            intent.putExtra("room_name", this.mEtName.getText().toString());
            intent.putExtra("create_res_index", getIntent().getIntExtra("create_res_index", -1));
            setResult(-1, intent);
            finish();
        } else {
            Intent intent2 = new Intent();
            int i = this.f10064b;
            if (i == 0) {
                cls = CreateRoomSelectDeviceActivity.class;
            } else {
                if (i == 1) {
                    String str = this.f10065c;
                    if (str == null || str.isEmpty()) {
                        cls = CreateSceneBundleNewActivity.class;
                    } else {
                        C6169f J0 = YeelightDeviceManager.m7800o0().mo23268J0(this.f10065c);
                        ArrayList arrayList = new ArrayList();
                        for (C3010c next : J0.mo31753K1()) {
                            if ((next instanceof WifiDeviceBase) && next.mo23230o0()) {
                                arrayList.add(C8330u.m19874b(next));
                            }
                        }
                        if (arrayList.size() > 0) {
                            C3096u.m8175n().mo23507B(C8329t.m19854d(arrayList, obj, getIntent().getIntExtra("create_res_index", 0), ""), new C5121g());
                            return;
                        }
                    }
                }
                intent2.putExtra("room_name", this.mEtName.getText().toString());
                intent2.putExtra("create_res_index", getIntent().getIntExtra("create_res_index", -1));
                startActivity(intent2);
            }
            intent2.setClass(this, cls);
            intent2.putExtra("room_name", this.mEtName.getText().toString());
            intent2.putExtra("create_res_index", getIntent().getIntExtra("create_res_index", -1));
            startActivity(intent2);
        }
    }

    @OnClick({2131297165})
    public void nextStep() {
        m16020Y();
    }

    public void onBackPressed() {
        finish();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        CommonTitleBar commonTitleBar;
        int i;
        String str;
        super.onCreate(bundle);
        mo35653P();
        C9193k.m22157h(true, this);
        setContentView(C12228R$layout.activity_create_room_name);
        ButterKnife.bind((Activity) this);
        int intExtra = getIntent().getIntExtra("create_res_index", -1);
        if (intExtra == -1) {
            AppUtils.m8300u("NoResourceFound", "No selected img found!");
            finish();
            return;
        }
        Intent intent = getIntent();
        this.f10063a = intent.getBooleanExtra("edit_mode", false);
        this.f10064b = intent.getIntExtra("create_name_type", 0);
        if (intent.hasExtra("com.yeelight.cherry.room_id")) {
            this.f10065c = intent.getStringExtra("com.yeelight.cherry.room_id");
            this.mBtnNext.setText(getString(2131755240));
        }
        this.mTypeImageView.setImageResource(C9195n.m22164a(this.f10064b, intExtra));
        this.mBtnClear.setVisibility(8);
        this.mBtnClear.setOnClickListener(new C5115a());
        this.mTitleBar.mo36195a("", new C5116b(), new C5117c());
        this.mTitleBar.setTitleTextSize(16);
        this.mTitleBar.setRightTextStr(getString(2131755309));
        this.mTitleBar.setRightTextColor(getResources().getColor(2131099842));
        if (this.f10063a) {
            String stringExtra = getIntent().getStringExtra("room_name");
            if (stringExtra != null) {
                this.mEtName.setText(stringExtra);
                this.mEtName.setSelection(stringExtra.length());
            }
            this.mTitleBar.setRightTextVisible(true);
            this.mBtnNext.setVisibility(8);
        } else {
            this.mTitleBar.setRightButtonResource(2131231214);
            this.mTitleBar.setRightButtonVisibility(0);
        }
        EditText editText = this.mEtName;
        editText.addTextChangedListener(new C9183a0(20, editText));
        int i2 = this.f10064b;
        if (i2 == 0) {
            commonTitleBar = this.mTitleBar;
            if (this.f10063a) {
                i = 2131755270;
            }
            str = getString(2131755244);
            commonTitleBar.setTitle(str);
            this.mEtName.setOnEditorActionListener(new C5118d());
            this.mEtName.addTextChangedListener(new C5119e());
        }
        if (i2 == 1) {
            commonTitleBar = this.mTitleBar;
            if (this.f10063a) {
                i = 2131756222;
            }
            str = getString(2131755244);
            commonTitleBar.setTitle(str);
        }
        this.mEtName.setOnEditorActionListener(new C5118d());
        this.mEtName.addTextChangedListener(new C5119e());
        str = getString(i);
        commonTitleBar.setTitle(str);
        this.mEtName.setOnEditorActionListener(new C5118d());
        this.mEtName.addTextChangedListener(new C5119e());
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        this.mEtName.clearFocus();
        ((InputMethodManager) getSystemService("input_method")).hideSoftInputFromWindow(this.mEtName.getWindowToken(), 0);
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        this.mEtName.requestFocus();
        this.mEtName.postDelayed(new C5120f(), 200);
    }
}
