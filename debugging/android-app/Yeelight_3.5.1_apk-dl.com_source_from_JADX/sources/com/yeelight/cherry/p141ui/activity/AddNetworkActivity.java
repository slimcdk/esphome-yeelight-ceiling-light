package com.yeelight.cherry.p141ui.activity;

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
import com.yeelight.cherry.C12228R$layout;
import com.yeelight.yeelib.data.DeviceDataProvider;
import com.yeelight.yeelib.device.C6081a;
import com.yeelight.yeelib.device.C6164e;
import com.yeelight.yeelib.device.base.C3010c;
import com.yeelight.yeelib.device.base.PrivateMeshDeviceBase;
import com.yeelight.yeelib.managers.YeelightDeviceManager;
import com.yeelight.yeelib.models.MeshNetWork;
import com.yeelight.yeelib.p142ui.activity.BaseActivity;
import com.yeelight.yeelib.p142ui.view.CommonTitleBar;
import com.yeelight.yeelib.utils.AppUtils;
import p051j4.C9183a0;
import p051j4.C9193k;

/* renamed from: com.yeelight.cherry.ui.activity.AddNetworkActivity */
public class AddNetworkActivity extends BaseActivity {

    /* renamed from: a */
    private String f9866a = AddNetworkActivity.class.getSimpleName();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public String f9867b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public String f9868c;

    /* renamed from: d */
    private boolean f9869d = false;

    /* renamed from: e */
    private String f9870e;

    /* renamed from: f */
    private PrivateMeshDeviceBase f9871f;

    /* renamed from: g */
    private boolean f9872g = false;
    @BindView(2131297163)
    Button mBtnNext;
    @BindView(2131296584)
    LinearLayout mContentTop;
    @BindView(2131296750)
    EditText mEtPwd;
    @BindView(2131296752)
    EditText mEtSsid;
    @BindView(2131297264)
    ImageView mPwdIcon;
    @BindView(2131297498)
    ImageView mSsidIcon;
    @BindView(2131297499)
    LinearLayout mSsidLayout;
    @BindView(2131297516)
    TextView mSubInfo;
    @BindView(2131297589)
    TextView mTitle;
    @BindView(2131297591)
    CommonTitleBar mTitleBar;

    /* renamed from: com.yeelight.cherry.ui.activity.AddNetworkActivity$a */
    class C5040a implements View.OnClickListener {
        C5040a() {
        }

        public void onClick(View view) {
            AddNetworkActivity.this.finish();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.AddNetworkActivity$b */
    class C5041b implements C9183a0.C9184a {
        C5041b() {
        }

        /* renamed from: a */
        public void mo30178a(String str) {
            String unused = AddNetworkActivity.this.f9868c = str;
            AddNetworkActivity addNetworkActivity = AddNetworkActivity.this;
            addNetworkActivity.mBtnNext.setEnabled(!TextUtils.isEmpty(addNetworkActivity.f9867b) && !TextUtils.isEmpty(AddNetworkActivity.this.f9868c));
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.AddNetworkActivity$c */
    class C5042c implements C9183a0.C9184a {
        C5042c() {
        }

        /* renamed from: a */
        public void mo30178a(String str) {
            String unused = AddNetworkActivity.this.f9867b = str;
            AddNetworkActivity addNetworkActivity = AddNetworkActivity.this;
            addNetworkActivity.mBtnNext.setEnabled(!TextUtils.isEmpty(addNetworkActivity.f9867b) && !TextUtils.isEmpty(AddNetworkActivity.this.f9868c));
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.AddNetworkActivity$d */
    class C5043d implements View.OnClickListener {
        C5043d() {
        }

        public void onClick(View view) {
            AddNetworkActivity.this.finish();
        }
    }

    /* renamed from: Z */
    public static boolean m15840Z(String str) {
        return true;
    }

    @OnClick({2131297163})
    public void next() {
        String obj = this.mEtSsid.getText().toString();
        String obj2 = this.mEtPwd.getText().toString();
        if (!m15840Z(obj) || !m15840Z(obj2)) {
            Toast.makeText(this, "Name and Pwd must be English, name= " + obj + " , pwd = " + obj2, 0).show();
            return;
        }
        MeshNetWork meshNetWork = new MeshNetWork();
        meshNetWork.setName(obj);
        meshNetWork.setNetworkName(obj);
        meshNetWork.setPassword(obj2);
        int d = DeviceDataProvider.m17620d(meshNetWork);
        meshNetWork.setId(268435455 & d);
        if (d != -1) {
            if ((d >> 30) != 1) {
                YeelightDeviceManager.m7800o0().mo23275Q(new C6164e(meshNetWork));
            }
            if (!this.f9872g) {
                Intent intent = new Intent(this, SelectNetworkActivity.class);
                intent.putExtra("id", d);
                if (this.f9869d) {
                    this.f9871f.mo31647i2(meshNetWork);
                    C3010c j0 = YeelightDeviceManager.m7794j0(meshNetWork.getName() + "_" + meshNetWork.getId());
                    if (j0 != null) {
                        ((C6164e) j0).mo31758P1();
                    }
                    intent.putExtra("com.yeelight.cherry.device_id", this.f9870e);
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
        mo35653P();
        setContentView(C12228R$layout.activity_add_network);
        ButterKnife.bind((Activity) this);
        C9193k.m22157h(true, this);
        this.f9872g = getIntent().getBooleanExtra("ADD_MESH_GROUP", false);
        this.mTitleBar.mo36195a("", new C5040a(), (View.OnClickListener) null);
        setTitleBarPadding(this.mTitleBar);
        EditText editText = this.mEtPwd;
        editText.addTextChangedListener(new C9183a0(12, 1, editText, new C5041b()));
        EditText editText2 = this.mEtSsid;
        editText2.addTextChangedListener(new C9183a0(12, 1, editText2, new C5042c()));
        if (getIntent().hasExtra("updateMesh")) {
            try {
                String str = new String(getIntent().getByteArrayExtra("updateMesh"));
                this.f9867b = str;
                this.mEtSsid.setText(str);
                this.mEtPwd.requestFocus();
                this.mEtSsid.clearFocus();
            } catch (Exception e) {
                e.printStackTrace();
            }
            this.f9870e = getIntent().getStringExtra("com.yeelight.cherry.device_id");
            C6081a i0 = YeelightDeviceManager.m7800o0().mo23295i0(this.f9870e);
            if (i0 instanceof PrivateMeshDeviceBase) {
                this.f9871f = (PrivateMeshDeviceBase) i0;
                this.f9869d = true;
            } else {
                AppUtils.m8302w(this.f9866a, "add network activity accept Mesh device only", false);
                finish();
                return;
            }
        }
        if (this.f9872g) {
            this.mBtnNext.setText(2131755281);
            this.mTitleBar.setRightButtonResource(2131231214);
            this.mTitleBar.setRightButtonVisibility(0);
            this.mTitleBar.setRightButtonClickListener(new C5043d());
        }
    }
}
