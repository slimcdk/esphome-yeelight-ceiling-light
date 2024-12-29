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
import com.yeelight.yeelib.data.DeviceDataProvider;
import com.yeelight.yeelib.p194ui.activity.BaseActivity;
import com.yeelight.yeelib.p194ui.view.CommonTitleBar;
import com.yeelight.yeelib.utils.C10536b0;
import com.yeelight.yeelib.utils.C10547m;

/* renamed from: com.yeelight.cherry.ui.activity.CreateGroupNameActivity */
public class CreateGroupNameActivity extends BaseActivity {
    /* access modifiers changed from: private */

    /* renamed from: b */
    public boolean f10525b;

    /* renamed from: c */
    private String f10526c;
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

    /* renamed from: com.yeelight.cherry.ui.activity.CreateGroupNameActivity$a */
    class C5076a implements View.OnClickListener {
        C5076a() {
        }

        public void onClick(View view) {
            CreateGroupNameActivity.this.mEtName.setText("");
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.CreateGroupNameActivity$b */
    class C5077b implements View.OnClickListener {
        C5077b() {
        }

        public void onClick(View view) {
            CreateGroupNameActivity.this.onBackPressed();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.CreateGroupNameActivity$c */
    class C5078c implements View.OnClickListener {
        C5078c() {
        }

        public void onClick(View view) {
            if (!CreateGroupNameActivity.this.f10525b) {
                Intent intent = new Intent(CreateGroupNameActivity.this, MainActivity.class);
                intent.addFlags(71303168);
                CreateGroupNameActivity.this.startActivity(intent);
                CreateGroupNameActivity.this.finish();
                return;
            }
            CreateGroupNameActivity.this.m16134X();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.CreateGroupNameActivity$d */
    class C5079d implements TextView.OnEditorActionListener {
        C5079d() {
        }

        public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            if (i == 6) {
                ((InputMethodManager) CreateGroupNameActivity.this.getSystemService("input_method")).hideSoftInputFromWindow(textView.getWindowToken(), 0);
                CreateGroupNameActivity.this.m16134X();
            }
            return false;
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.CreateGroupNameActivity$e */
    class C5080e implements TextWatcher {
        C5080e() {
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
    class C5081f implements Runnable {
        C5081f() {
        }

        public void run() {
            ((InputMethodManager) CreateGroupNameActivity.this.getSystemService("input_method")).showSoftInput(CreateGroupNameActivity.this.mEtName, 2);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: X */
    public void m16134X() {
        String obj = this.mEtName.getText().toString();
        if (TextUtils.isEmpty(obj)) {
            Toast.makeText(this, 2131756002, 0).show();
        } else if (DeviceDataProvider.m22387V(obj)) {
            Toast.makeText(this, 2131755552, 0).show();
        } else {
            Intent intent = new Intent(this, CreateGroupSelectDeviceActivity.class);
            intent.putExtra("type_group", this.f10526c);
            intent.putExtra("group_name", this.mEtName.getText().toString());
            if (this.f10525b) {
                setResult(-1, intent);
                finish();
                return;
            }
            startActivity(intent);
        }
    }

    @OnClick({2131297043})
    public void nextStep() {
        m16134X();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        ImageView imageView;
        int i;
        super.onCreate(bundle);
        mo32193P();
        C10547m.m25758h(true, this);
        setContentView(C11748R$layout.activity_create_room_name);
        ButterKnife.bind((Activity) this);
        this.mEtName.clearFocus();
        this.f10526c = getIntent().getStringExtra("type_group");
        this.f10525b = getIntent().getBooleanExtra("edit_mode", false);
        if (TextUtils.equals(this.f10526c, "yeelink.light.dn2grp")) {
            imageView = this.mTypeImageView;
            i = 2131231337;
        } else if (TextUtils.equals(this.f10526c, "yeelink.light.mb1grp")) {
            imageView = this.mTypeImageView;
            i = 2131231397;
        } else if (TextUtils.equals(this.f10526c, "yeelink.light.mb2grp")) {
            imageView = this.mTypeImageView;
            i = 2131231399;
        } else if (TextUtils.equals(this.f10526c, "yeelink.light.sp1grp")) {
            imageView = this.mTypeImageView;
            i = 2131231437;
        } else {
            imageView = this.mTypeImageView;
            i = 2131231367;
        }
        imageView.setImageResource(i);
        this.mBtnClear.setOnClickListener(new C5076a());
        this.mTitleBar.mo32825a(getString(2131755241), new C5077b(), new C5078c());
        this.mTitleBar.setTitleTextSize(16);
        this.mTitleBar.setRightTextStr(getString(2131755305));
        this.mTitleBar.setRightTextColor(getResources().getColor(2131099839));
        if (this.f10525b) {
            String stringExtra = getIntent().getStringExtra("group_name");
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
        this.mBtnClear.setVisibility(8);
        this.mEtName.setOnEditorActionListener(new C5079d());
        EditText editText = this.mEtName;
        editText.addTextChangedListener(new C10536b0(20, editText));
        this.mEtName.addTextChangedListener(new C5080e());
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
        this.mEtName.postDelayed(new C5081f(), 200);
    }
}
