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
import com.yeelight.yeelib.data.DeviceDataProvider;
import com.yeelight.yeelib.p142ui.activity.BaseActivity;
import com.yeelight.yeelib.p142ui.view.CommonTitleBar;
import p051j4.C9183a0;
import p051j4.C9193k;

/* renamed from: com.yeelight.cherry.ui.activity.CreateGroupNameActivity */
public class CreateGroupNameActivity extends BaseActivity {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public boolean f10076a;

    /* renamed from: b */
    private String f10077b;
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

    /* renamed from: com.yeelight.cherry.ui.activity.CreateGroupNameActivity$a */
    class C5123a implements View.OnClickListener {
        C5123a() {
        }

        public void onClick(View view) {
            CreateGroupNameActivity.this.mEtName.setText("");
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.CreateGroupNameActivity$b */
    class C5124b implements View.OnClickListener {
        C5124b() {
        }

        public void onClick(View view) {
            CreateGroupNameActivity.this.onBackPressed();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.CreateGroupNameActivity$c */
    class C5125c implements View.OnClickListener {
        C5125c() {
        }

        public void onClick(View view) {
            if (!CreateGroupNameActivity.this.f10076a) {
                Intent intent = new Intent(CreateGroupNameActivity.this, MainActivity.class);
                intent.addFlags(71303168);
                CreateGroupNameActivity.this.startActivity(intent);
                CreateGroupNameActivity.this.finish();
                return;
            }
            CreateGroupNameActivity.this.m16033X();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.CreateGroupNameActivity$d */
    class C5126d implements TextView.OnEditorActionListener {
        C5126d() {
        }

        public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            if (i == 6) {
                ((InputMethodManager) CreateGroupNameActivity.this.getSystemService("input_method")).hideSoftInputFromWindow(textView.getWindowToken(), 0);
                CreateGroupNameActivity.this.m16033X();
            }
            return false;
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.CreateGroupNameActivity$e */
    class C5127e implements TextWatcher {
        C5127e() {
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            int i4;
            ImageButton imageButton;
            if (charSequence.length() > 0) {
                imageButton = CreateGroupNameActivity.this.mBtnClear;
                i4 = 0;
            } else {
                imageButton = CreateGroupNameActivity.this.mBtnClear;
                i4 = 8;
            }
            imageButton.setVisibility(i4);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.CreateGroupNameActivity$f */
    class C5128f implements Runnable {
        C5128f() {
        }

        public void run() {
            ((InputMethodManager) CreateGroupNameActivity.this.getSystemService("input_method")).showSoftInput(CreateGroupNameActivity.this.mEtName, 2);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: X */
    public void m16033X() {
        String obj = this.mEtName.getText().toString();
        if (TextUtils.isEmpty(obj)) {
            Toast.makeText(this, 2131756014, 0).show();
        } else if (DeviceDataProvider.m17609V(obj)) {
            Toast.makeText(this, 2131755556, 0).show();
        } else {
            Intent intent = new Intent(this, CreateGroupSelectDeviceActivity.class);
            intent.putExtra("type_group", this.f10077b);
            intent.putExtra("group_name", this.mEtName.getText().toString());
            if (this.f10076a) {
                setResult(-1, intent);
                finish();
                return;
            }
            startActivity(intent);
        }
    }

    @OnClick({2131297165})
    public void nextStep() {
        m16033X();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        ImageView imageView;
        int i;
        super.onCreate(bundle);
        mo35653P();
        C9193k.m22157h(true, this);
        setContentView(C12228R$layout.activity_create_room_name);
        ButterKnife.bind((Activity) this);
        this.mEtName.clearFocus();
        this.f10077b = getIntent().getStringExtra("type_group");
        this.f10076a = getIntent().getBooleanExtra("edit_mode", false);
        if (TextUtils.equals(this.f10077b, "yeelink.light.dn2grp")) {
            imageView = this.mTypeImageView;
            i = 2131231353;
        } else if (TextUtils.equals(this.f10077b, "yeelink.light.mb1grp")) {
            imageView = this.mTypeImageView;
            i = 2131231417;
        } else if (TextUtils.equals(this.f10077b, "yeelink.light.mb2grp")) {
            imageView = this.mTypeImageView;
            i = 2131231419;
        } else if (TextUtils.equals(this.f10077b, "yeelink.light.sp1grp")) {
            imageView = this.mTypeImageView;
            i = 2131231459;
        } else {
            imageView = this.mTypeImageView;
            i = 2131231383;
        }
        imageView.setImageResource(i);
        this.mBtnClear.setOnClickListener(new C5123a());
        this.mTitleBar.mo36195a(getString(2131755244), new C5124b(), new C5125c());
        this.mTitleBar.setTitleTextSize(16);
        this.mTitleBar.setRightTextStr(getString(2131755309));
        this.mTitleBar.setRightTextColor(getResources().getColor(2131099842));
        if (this.f10076a) {
            String stringExtra = getIntent().getStringExtra("group_name");
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
        this.mBtnClear.setVisibility(8);
        this.mEtName.setOnEditorActionListener(new C5126d());
        EditText editText = this.mEtName;
        editText.addTextChangedListener(new C9183a0(20, editText));
        this.mEtName.addTextChangedListener(new C5127e());
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
        this.mEtName.postDelayed(new C5128f(), 200);
    }
}
