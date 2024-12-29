package com.yeelight.cherry.p177ui.activity;

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
import com.yeelight.cherry.C11748R$layout;
import com.yeelight.yeelib.p194ui.activity.BaseActivity;
import com.yeelight.yeelib.p194ui.view.CommonTitleBar;
import com.yeelight.yeelib.p194ui.widget.C10526e;
import com.yeelight.yeelib.utils.C10547m;
import com.yeelight.yeelib.utils.C10549p;
import com.yeelight.yeelib.utils.C4308b;

/* renamed from: com.yeelight.cherry.ui.activity.CreateRoomNameActivity */
public class CreateRoomNameActivity extends BaseActivity {
    /* access modifiers changed from: private */

    /* renamed from: b */
    public boolean f10566b;

    /* renamed from: c */
    private C10526e f10567c;
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

    /* renamed from: com.yeelight.cherry.ui.activity.CreateRoomNameActivity$a */
    class C5098a implements View.OnClickListener {
        C5098a() {
        }

        public void onClick(View view) {
            CreateRoomNameActivity.this.mEtName.setText("");
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.CreateRoomNameActivity$b */
    class C5099b implements View.OnClickListener {
        C5099b() {
        }

        public void onClick(View view) {
            CreateRoomNameActivity.this.onBackPressed();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.CreateRoomNameActivity$c */
    class C5100c implements View.OnClickListener {

        /* renamed from: com.yeelight.cherry.ui.activity.CreateRoomNameActivity$c$a */
        class C5101a implements DialogInterface.OnClickListener {
            C5101a() {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                Intent intent = new Intent(CreateRoomNameActivity.this, MainActivity.class);
                intent.addFlags(71303168);
                CreateRoomNameActivity.this.startActivity(intent);
                CreateRoomNameActivity.this.finish();
            }
        }

        C5100c() {
        }

        public void onClick(View view) {
            if (!CreateRoomNameActivity.this.f10566b) {
                CreateRoomNameActivity.this.m16147Y().mo33335g(-1, CreateRoomNameActivity.this.getString(2131755277), new C5101a());
                CreateRoomNameActivity.this.m16147Y().show();
                return;
            }
            CreateRoomNameActivity.this.m16148Z();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.CreateRoomNameActivity$d */
    class C5102d implements TextView.OnEditorActionListener {
        C5102d() {
        }

        public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            if (i == 6) {
                ((InputMethodManager) CreateRoomNameActivity.this.getSystemService("input_method")).hideSoftInputFromWindow(textView.getWindowToken(), 0);
                CreateRoomNameActivity.this.m16148Z();
            }
            return false;
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.CreateRoomNameActivity$e */
    class C5103e implements DialogInterface.OnClickListener {
        C5103e() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
            CreateRoomNameActivity.this.finish();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: Y */
    public C10526e m16147Y() {
        if (this.f10567c == null) {
            C10526e.C10531e eVar = new C10526e.C10531e(this);
            eVar.mo33357h(2131755275);
            eVar.mo33355f(2131755283);
            eVar.mo33353d(-1, getString(2131755277), new C5103e());
            eVar.mo33353d(-2, getString(2131755229), (DialogInterface.OnClickListener) null);
            this.f10567c = eVar.mo33351b();
        }
        return this.f10567c;
    }

    /* access modifiers changed from: private */
    /* renamed from: Z */
    public void m16148Z() {
        if (TextUtils.isEmpty(this.mEtName.getText().toString())) {
            Toast.makeText(this, "名字不能为空", 0).show();
            return;
        }
        Intent intent = new Intent(this, CreateRoomSelectDeviceActivity.class);
        intent.putExtra("room_name", this.mEtName.getText().toString());
        intent.putExtra("create_res_index", getIntent().getIntExtra("create_res_index", -1));
        if (this.f10566b) {
            setResult(-1, intent);
            finish();
            return;
        }
        startActivity(intent);
    }

    @OnClick({2131297043})
    public void nextStep() {
        m16148Z();
    }

    public void onBackPressed() {
        m16147Y().show();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
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
        this.f10566b = getIntent().getBooleanExtra("edit_mode", false);
        this.mTypeImageView.setImageResource(C10549p.m25765a(3, intExtra));
        this.mBtnClear.setOnClickListener(new C5098a());
        this.mTitleBar.mo32825a("创建房间名称", new C5099b(), new C5100c());
        this.mTitleBar.setTitleTextSize(16);
        this.mTitleBar.setRightTextStr(getString(2131755305));
        this.mTitleBar.setRightTextColor(getResources().getColor(2131099839));
        this.mEtName.setHint(getString(2131756167));
        if (this.f10566b) {
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
        this.mEtName.setOnEditorActionListener(new C5102d());
    }
}
