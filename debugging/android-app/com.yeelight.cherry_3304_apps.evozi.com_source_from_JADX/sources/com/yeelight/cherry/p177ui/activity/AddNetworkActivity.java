package com.yeelight.cherry.p177ui.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.yeelight.cherry.C11748R$layout;
import com.yeelight.yeelib.data.DeviceDataProvider;
import com.yeelight.yeelib.p150c.C5972a;
import com.yeelight.yeelib.p150c.C6000f;
import com.yeelight.yeelib.p150c.p151i.C4198d;
import com.yeelight.yeelib.p150c.p151i.C6047m;
import com.yeelight.yeelib.p152f.C4257w;
import com.yeelight.yeelib.p153g.C9850s;
import com.yeelight.yeelib.p194ui.activity.BaseActivity;
import com.yeelight.yeelib.p194ui.view.CommonTitleBar;
import com.yeelight.yeelib.utils.C10536b0;
import com.yeelight.yeelib.utils.C10547m;
import com.yeelight.yeelib.utils.C4308b;

/* renamed from: com.yeelight.cherry.ui.activity.AddNetworkActivity */
public class AddNetworkActivity extends BaseActivity {

    /* renamed from: b */
    private String f10322b = AddNetworkActivity.class.getSimpleName();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public String f10323c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public String f10324d;

    /* renamed from: e */
    private boolean f10325e = false;

    /* renamed from: f */
    private String f10326f;

    /* renamed from: g */
    private C6047m f10327g;

    /* renamed from: h */
    private boolean f10328h = false;
    @BindView(2131297041)
    Button mBtnNext;
    @BindView(2131296513)
    LinearLayout mContentTop;
    @BindView(2131296656)
    EditText mEtPwd;
    @BindView(2131296658)
    EditText mEtSsid;
    @BindView(2131297131)
    ImageView mPwdIcon;
    @BindView(2131297348)
    ImageView mSsidIcon;
    @BindView(2131297349)
    LinearLayout mSsidLayout;
    @BindView(2131297361)
    TextView mSubInfo;
    @BindView(2131297422)
    TextView mTitle;
    @BindView(2131297424)
    CommonTitleBar mTitleBar;

    /* renamed from: com.yeelight.cherry.ui.activity.AddNetworkActivity$a */
    class C4995a implements View.OnClickListener {
        C4995a() {
        }

        public void onClick(View view) {
            AddNetworkActivity.this.finish();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.AddNetworkActivity$b */
    class C4996b implements C10536b0.C10537a {
        C4996b() {
        }

        /* renamed from: a */
        public void mo26122a(String str) {
            String unused = AddNetworkActivity.this.f10324d = str;
            AddNetworkActivity addNetworkActivity = AddNetworkActivity.this;
            addNetworkActivity.mBtnNext.setEnabled(!TextUtils.isEmpty(addNetworkActivity.f10323c) && !TextUtils.isEmpty(AddNetworkActivity.this.f10324d));
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.AddNetworkActivity$c */
    class C4997c implements C10536b0.C10537a {
        C4997c() {
        }

        /* renamed from: a */
        public void mo26122a(String str) {
            String unused = AddNetworkActivity.this.f10323c = str;
            AddNetworkActivity addNetworkActivity = AddNetworkActivity.this;
            addNetworkActivity.mBtnNext.setEnabled(!TextUtils.isEmpty(addNetworkActivity.f10323c) && !TextUtils.isEmpty(AddNetworkActivity.this.f10324d));
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.AddNetworkActivity$d */
    class C4998d implements View.OnClickListener {
        C4998d() {
        }

        public void onClick(View view) {
            AddNetworkActivity.this.finish();
        }
    }

    /* renamed from: Z */
    public static boolean m15986Z(String str) {
        return true;
    }

    @OnClick({2131297041})
    public void next() {
        String obj = this.mEtSsid.getText().toString();
        String obj2 = this.mEtPwd.getText().toString();
        if (!m15986Z(obj) || !m15986Z(obj2)) {
            Toast.makeText(this, "Name and Pwd must be English, name= " + obj + " , pwd = " + obj2, 0).show();
            return;
        }
        C9850s sVar = new C9850s();
        sVar.mo31826f(obj);
        sVar.mo31827g(obj);
        sVar.mo31828h(obj2);
        int d = DeviceDataProvider.m22398d(sVar);
        sVar.mo31824e(268435455 & d);
        if (d != -1) {
            if ((d >> 30) != 1) {
                C4257w.m11947l0().mo23652P(new C6000f(sVar));
            }
            if (!this.f10328h) {
                Intent intent = new Intent(this, SelectNetworkActivity.class);
                intent.putExtra("id", d);
                if (this.f10325e) {
                    this.f10327g.mo27817i2(sVar);
                    C4198d h0 = C4257w.m11945h0(sVar.mo31821b() + "_" + sVar.mo31820a());
                    if (h0 != null) {
                        ((C6000f) h0).mo27503P1();
                    }
                    intent.putExtra("com.yeelight.cherry.device_id", this.f10326f);
                    finish();
                    startActivity(intent);
                    return;
                }
                setResult(-1, intent);
            }
        }
        finish();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo32193P();
        setContentView(C11748R$layout.activity_add_network);
        ButterKnife.bind((Activity) this);
        C10547m.m25758h(true, this);
        this.f10328h = getIntent().getBooleanExtra("ADD_MESH_GROUP", false);
        this.mTitleBar.mo32825a("", new C4995a(), (View.OnClickListener) null);
        setTitleBarPadding(this.mTitleBar);
        EditText editText = this.mEtPwd;
        editText.addTextChangedListener(new C10536b0(12, 1, editText, new C4996b()));
        EditText editText2 = this.mEtSsid;
        editText2.addTextChangedListener(new C10536b0(12, 1, editText2, new C4997c()));
        if (getIntent().hasExtra("updateMesh")) {
            try {
                String str = new String(getIntent().getByteArrayExtra("updateMesh"));
                this.f10323c = str;
                this.mEtSsid.setText(str);
                this.mEtPwd.requestFocus();
                this.mEtSsid.clearFocus();
            } catch (Exception e) {
                e.printStackTrace();
            }
            this.f10326f = getIntent().getStringExtra("com.yeelight.cherry.device_id");
            C5972a g0 = C4257w.m11947l0().mo23668g0(this.f10326f);
            if (g0 instanceof C6047m) {
                this.f10327g = (C6047m) g0;
                this.f10325e = true;
            } else {
                C4308b.m12141t(this.f10322b, "add network activity accept Mesh device only", false);
                finish();
                return;
            }
        }
        if (this.f10328h) {
            this.mBtnNext.setText(2131755277);
            this.mTitleBar.setRightButtonResource(2131231200);
            this.mTitleBar.setRightButtonVisibility(0);
            this.mTitleBar.setRightButtonClickListener(new C4998d());
        }
    }
}
