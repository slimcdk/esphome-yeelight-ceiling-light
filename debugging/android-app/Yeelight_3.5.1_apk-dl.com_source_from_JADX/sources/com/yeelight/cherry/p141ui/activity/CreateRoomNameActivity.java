package com.yeelight.cherry.p141ui.activity;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
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
import com.yeelight.yeelib.p142ui.activity.BaseActivity;
import com.yeelight.yeelib.p142ui.view.CommonTitleBar;
import com.yeelight.yeelib.utils.AppUtils;
import p051j4.C9193k;
import p051j4.C9195n;
import p170i4.C9113d;

/* renamed from: com.yeelight.cherry.ui.activity.CreateRoomNameActivity */
public class CreateRoomNameActivity extends BaseActivity {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public boolean f10117a;

    /* renamed from: b */
    private C9113d f10118b;
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

    /* renamed from: com.yeelight.cherry.ui.activity.CreateRoomNameActivity$a */
    class C5145a implements View.OnClickListener {
        C5145a() {
        }

        public void onClick(View view) {
            CreateRoomNameActivity.this.mEtName.setText("");
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.CreateRoomNameActivity$b */
    class C5146b implements View.OnClickListener {
        C5146b() {
        }

        public void onClick(View view) {
            CreateRoomNameActivity.this.onBackPressed();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.CreateRoomNameActivity$c */
    class C5147c implements View.OnClickListener {

        /* renamed from: com.yeelight.cherry.ui.activity.CreateRoomNameActivity$c$a */
        class C5148a implements DialogInterface.OnClickListener {
            C5148a() {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                Intent intent = new Intent(CreateRoomNameActivity.this, MainActivity.class);
                intent.addFlags(71303168);
                CreateRoomNameActivity.this.startActivity(intent);
                CreateRoomNameActivity.this.finish();
            }
        }

        C5147c() {
        }

        public void onClick(View view) {
            if (!CreateRoomNameActivity.this.f10117a) {
                CreateRoomNameActivity.this.m16046Y().mo37156g(-1, CreateRoomNameActivity.this.getString(2131755281), new C5148a());
                CreateRoomNameActivity.this.m16046Y().show();
                return;
            }
            CreateRoomNameActivity.this.m16047Z();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.CreateRoomNameActivity$d */
    class C5149d implements TextView.OnEditorActionListener {
        C5149d() {
        }

        public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            if (i == 6) {
                ((InputMethodManager) CreateRoomNameActivity.this.getSystemService("input_method")).hideSoftInputFromWindow(textView.getWindowToken(), 0);
                CreateRoomNameActivity.this.m16047Z();
            }
            return false;
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.CreateRoomNameActivity$e */
    class C5150e implements DialogInterface.OnClickListener {
        C5150e() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
            CreateRoomNameActivity.this.finish();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: Y */
    public C9113d m16046Y() {
        if (this.f10118b == null) {
            C9113d.C9118e eVar = new C9113d.C9118e(this);
            eVar.mo37178h(2131755279);
            eVar.mo37176f(2131755287);
            eVar.mo37174d(-1, getString(2131755281), new C5150e()).mo37174d(-2, getString(2131755232), (DialogInterface.OnClickListener) null);
            this.f10118b = eVar.mo37172b();
        }
        return this.f10118b;
    }

    /* access modifiers changed from: private */
    /* renamed from: Z */
    public void m16047Z() {
        if (TextUtils.isEmpty(this.mEtName.getText().toString())) {
            Toast.makeText(this, "名字不能为空", 0).show();
            return;
        }
        Intent intent = new Intent(this, CreateRoomSelectDeviceActivity.class);
        intent.putExtra("room_name", this.mEtName.getText().toString());
        intent.putExtra("create_res_index", getIntent().getIntExtra("create_res_index", -1));
        if (this.f10117a) {
            setResult(-1, intent);
            finish();
            return;
        }
        startActivity(intent);
    }

    @OnClick({2131297165})
    public void nextStep() {
        m16047Z();
    }

    public void onBackPressed() {
        m16046Y().show();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
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
        this.f10117a = getIntent().getBooleanExtra("edit_mode", false);
        this.mTypeImageView.setImageResource(C9195n.m22164a(3, intExtra));
        this.mBtnClear.setOnClickListener(new C5145a());
        this.mTitleBar.mo36195a("创建房间名称", new C5146b(), new C5147c());
        this.mTitleBar.setTitleTextSize(16);
        this.mTitleBar.setRightTextStr(getString(2131755309));
        this.mTitleBar.setRightTextColor(getResources().getColor(2131099842));
        this.mEtName.setHint(getString(2131756191));
        if (this.f10117a) {
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
        this.mEtName.setOnEditorActionListener(new C5149d());
    }
}
