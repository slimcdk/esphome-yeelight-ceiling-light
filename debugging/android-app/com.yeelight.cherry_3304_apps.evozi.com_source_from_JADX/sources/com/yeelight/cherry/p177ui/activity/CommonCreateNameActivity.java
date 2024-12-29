package com.yeelight.cherry.p177ui.activity;

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
import com.yeelight.cherry.C11748R$layout;
import com.yeelight.yeelib.p150c.C6005g;
import com.yeelight.yeelib.p150c.C6006h;
import com.yeelight.yeelib.p150c.p151i.C4198d;
import com.yeelight.yeelib.p152f.C4247u;
import com.yeelight.yeelib.p152f.C4257w;
import com.yeelight.yeelib.p153g.C9828a0;
import com.yeelight.yeelib.p153g.C9858z;
import com.yeelight.yeelib.p187h.p189h.C9874b;
import com.yeelight.yeelib.p194ui.activity.BaseActivity;
import com.yeelight.yeelib.p194ui.activity.CreateSceneBundleNewActivity;
import com.yeelight.yeelib.p194ui.view.CommonTitleBar;
import com.yeelight.yeelib.utils.C10536b0;
import com.yeelight.yeelib.utils.C10547m;
import com.yeelight.yeelib.utils.C10549p;
import com.yeelight.yeelib.utils.C4308b;
import java.util.ArrayList;
import org.json.JSONObject;

/* renamed from: com.yeelight.cherry.ui.activity.CommonCreateNameActivity */
public class CommonCreateNameActivity extends BaseActivity {

    /* renamed from: e */
    public static final String f10511e = CommonCreateNameActivity.class.getSimpleName();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public boolean f10512b;

    /* renamed from: c */
    private int f10513c = 0;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public String f10514d;
    @BindView(2131296402)
    ImageButton mBtnClear;
    @BindView(2131297043)
    TextView mBtnNext;
    @BindView(2131296655)
    EditText mEtName;
    @BindView(2131297424)
    CommonTitleBar mTitleBar;
    @BindView(2131297224)
    ImageView mTypeImageView;

    /* renamed from: com.yeelight.cherry.ui.activity.CommonCreateNameActivity$a */
    class C5068a implements View.OnClickListener {
        C5068a() {
        }

        public void onClick(View view) {
            CommonCreateNameActivity.this.mEtName.setText("");
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.CommonCreateNameActivity$b */
    class C5069b implements View.OnClickListener {
        C5069b() {
        }

        public void onClick(View view) {
            CommonCreateNameActivity.this.onBackPressed();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.CommonCreateNameActivity$c */
    class C5070c implements View.OnClickListener {
        C5070c() {
        }

        public void onClick(View view) {
            Intent intent;
            if (!CommonCreateNameActivity.this.f10512b) {
                if (CommonCreateNameActivity.this.f10514d != null) {
                    intent = new Intent(CommonCreateNameActivity.this, DemoControlViewActivity.class);
                    intent.putExtra("com.yeelight.cherry.device_id", CommonCreateNameActivity.this.f10514d);
                    intent.putExtra("room_flag", true);
                } else {
                    intent = new Intent(CommonCreateNameActivity.this, MainActivity.class);
                }
                intent.addFlags(67108864);
                CommonCreateNameActivity.this.startActivity(intent);
                CommonCreateNameActivity.this.finish();
                return;
            }
            CommonCreateNameActivity.this.m16125Y();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.CommonCreateNameActivity$d */
    class C5071d implements TextView.OnEditorActionListener {
        C5071d() {
        }

        public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            if (i == 6) {
                ((InputMethodManager) CommonCreateNameActivity.this.getSystemService("input_method")).hideSoftInputFromWindow(textView.getWindowToken(), 0);
                CommonCreateNameActivity.this.m16125Y();
            }
            return false;
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.CommonCreateNameActivity$e */
    class C5072e implements TextWatcher {
        C5072e() {
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
    class C5073f implements Runnable {
        C5073f() {
        }

        public void run() {
            ((InputMethodManager) CommonCreateNameActivity.this.getSystemService("input_method")).showSoftInput(CommonCreateNameActivity.this.mEtName, 2);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.CommonCreateNameActivity$g */
    class C5074g implements C9874b<String> {
        C5074g() {
        }

        /* renamed from: b */
        public /* synthetic */ void mo26231b() {
            Toast.makeText(CommonCreateNameActivity.this, 2131755307, 0).show();
        }

        /* renamed from: c */
        public /* synthetic */ void mo26232c() {
            Toast.makeText(CommonCreateNameActivity.this, 2131755308, 0).show();
            try {
                Intent intent = new Intent(CommonCreateNameActivity.this, Class.forName("com.yeelight.cherry.ui.activity.MainActivity"));
                intent.addFlags(67108864);
                intent.putExtra("com.yeelight.cherry.fragment", 0);
                CommonCreateNameActivity.this.startActivity(intent);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
            CommonCreateNameActivity.this.finish();
        }

        /* renamed from: d */
        public /* synthetic */ void mo26233d() {
            Toast.makeText(CommonCreateNameActivity.this, 2131756205, 0).show();
        }

        /* renamed from: e */
        public /* synthetic */ void mo26234e() {
            Toast.makeText(CommonCreateNameActivity.this, 2131755307, 0).show();
        }

        /* renamed from: f */
        public void mo23475a(String str) {
            CommonCreateNameActivity commonCreateNameActivity;
            Runnable tVar;
            try {
                JSONObject jSONObject = new JSONObject(str);
                String str2 = CommonCreateNameActivity.f10511e;
                "saveSceneBundle, onResponse, result: " + jSONObject.toString();
                int i = jSONObject.getInt("code");
                if (i == 1) {
                    C4247u.m11865n().mo23615D();
                    CommonCreateNameActivity.this.runOnUiThread(new C5760q(this));
                    return;
                }
                if (i == 3002) {
                    commonCreateNameActivity = CommonCreateNameActivity.this;
                    tVar = new C5765r(this);
                } else {
                    commonCreateNameActivity = CommonCreateNameActivity.this;
                    tVar = new C5774t(this);
                }
                commonCreateNameActivity.runOnUiThread(tVar);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public void onFailure(int i, String str) {
            String str2 = CommonCreateNameActivity.f10511e;
            CommonCreateNameActivity.this.runOnUiThread(new C5770s(this));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: Y */
    public void m16125Y() {
        Class cls;
        String obj = this.mEtName.getText().toString();
        if (TextUtils.isEmpty(obj.trim())) {
            Toast.makeText(this, 2131756002, 0).show();
        } else if (this.f10512b) {
            Intent intent = new Intent();
            intent.putExtra("room_name", this.mEtName.getText().toString());
            intent.putExtra("create_res_index", getIntent().getIntExtra("create_res_index", -1));
            setResult(-1, intent);
            finish();
        } else {
            Intent intent2 = new Intent();
            int i = this.f10513c;
            if (i == 0) {
                cls = CreateRoomSelectDeviceActivity.class;
            } else {
                if (i == 1) {
                    String str = this.f10514d;
                    if (str == null || str.isEmpty()) {
                        cls = CreateSceneBundleNewActivity.class;
                    } else {
                        C6005g G0 = C4257w.m11947l0().mo23647G0(this.f10514d);
                        ArrayList arrayList = new ArrayList();
                        for (C4198d next : G0.mo27498K1()) {
                            if ((next instanceof C6006h) && next.mo23416o0()) {
                                arrayList.add(C9828a0.m23909b(next));
                            }
                        }
                        if (arrayList.size() > 0) {
                            C4247u.m11865n().mo23614B(C9858z.m24108d(arrayList, obj, getIntent().getIntExtra("create_res_index", 0), ""), new C5074g());
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

    @OnClick({2131297043})
    public void nextStep() {
        m16125Y();
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
        mo32193P();
        C10547m.m25758h(true, this);
        setContentView(C11748R$layout.activity_create_room_name);
        ButterKnife.bind((Activity) this);
        int intExtra = getIntent().getIntExtra("create_res_index", -1);
        if (intExtra == -1) {
            C4308b.m12139r("NoResourceFound", "No selected img found!");
            finish();
            return;
        }
        Intent intent = getIntent();
        this.f10512b = intent.getBooleanExtra("edit_mode", false);
        this.f10513c = intent.getIntExtra("create_name_type", 0);
        if (intent.hasExtra("com.yeelight.cherry.room_id")) {
            this.f10514d = intent.getStringExtra("com.yeelight.cherry.room_id");
            this.mBtnNext.setText(getString(2131755237));
        }
        this.mTypeImageView.setImageResource(C10549p.m25765a(this.f10513c, intExtra));
        this.mBtnClear.setVisibility(8);
        this.mBtnClear.setOnClickListener(new C5068a());
        this.mTitleBar.mo32825a("", new C5069b(), new C5070c());
        this.mTitleBar.setTitleTextSize(16);
        this.mTitleBar.setRightTextStr(getString(2131755305));
        this.mTitleBar.setRightTextColor(getResources().getColor(2131099839));
        if (this.f10512b) {
            String stringExtra = getIntent().getStringExtra("room_name");
            if (stringExtra != null) {
                this.mEtName.setText(stringExtra);
                this.mEtName.setSelection(stringExtra.length());
            }
            this.mTitleBar.setRightTextVisible(true);
            this.mBtnNext.setVisibility(8);
        } else {
            this.mTitleBar.setRightButtonResource(2131231200);
            this.mTitleBar.setRightButtonVisibility(0);
        }
        EditText editText = this.mEtName;
        editText.addTextChangedListener(new C10536b0(20, editText));
        int i2 = this.f10513c;
        if (i2 == 0) {
            commonTitleBar = this.mTitleBar;
            if (this.f10512b) {
                i = 2131755266;
            }
            str = getString(2131755241);
            commonTitleBar.setTitle(str);
            this.mEtName.setOnEditorActionListener(new C5071d());
            this.mEtName.addTextChangedListener(new C5072e());
        }
        if (i2 == 1) {
            commonTitleBar = this.mTitleBar;
            if (this.f10512b) {
                i = 2131756197;
            }
            str = getString(2131755241);
            commonTitleBar.setTitle(str);
        }
        this.mEtName.setOnEditorActionListener(new C5071d());
        this.mEtName.addTextChangedListener(new C5072e());
        str = getString(i);
        commonTitleBar.setTitle(str);
        this.mEtName.setOnEditorActionListener(new C5071d());
        this.mEtName.addTextChangedListener(new C5072e());
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
        this.mEtName.postDelayed(new C5073f(), 200);
    }
}
