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
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.Nullable;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.miot.api.Constants;
import com.miot.service.manager.timer.TimerCodec;
import com.yeelight.cherry.C12228R$layout;
import com.yeelight.yeelib.device.base.C3012e;
import com.yeelight.yeelib.device.models.ProductModelBase;
import com.yeelight.yeelib.managers.C3096u;
import com.yeelight.yeelib.managers.YeelightDeviceManager;
import com.yeelight.yeelib.models.C8311d;
import com.yeelight.yeelib.models.C8313f;
import com.yeelight.yeelib.models.C8314g;
import com.yeelight.yeelib.models.C8322n;
import com.yeelight.yeelib.models.C8329t;
import com.yeelight.yeelib.models.C8330u;
import com.yeelight.yeelib.models.SceneTemplateBean;
import com.yeelight.yeelib.p142ui.activity.BaseActivity;
import com.yeelight.yeelib.p142ui.view.CommonTitleBar;
import com.yeelight.yeelib.utils.AppUtils;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import p051j4.C9183a0;
import p051j4.C9193k;
import p051j4.C9195n;
import p134c4.C4007b;

/* renamed from: com.yeelight.cherry.ui.activity.CreateSceneNameActivity */
public class CreateSceneNameActivity extends BaseActivity {

    /* renamed from: d */
    public static final String f10173d = "CreateSceneNameActivity";
    /* access modifiers changed from: private */

    /* renamed from: a */
    public SceneTemplateBean f10174a;

    /* renamed from: b */
    private List<C8330u> f10175b = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public boolean f10176c = false;
    @BindView(2131296460)
    ImageButton mBtnClear;
    @BindView(2131296462)
    TextView mBtnComplete;
    @BindView(2131296749)
    EditText mEtName;
    @BindView(2131297019)
    FrameLayout mImageSelect;
    @BindView(2131297591)
    CommonTitleBar mTitleBar;
    @BindView(2131297449)
    ImageView mTypeImageView;

    /* renamed from: com.yeelight.cherry.ui.activity.CreateSceneNameActivity$a */
    class C5171a implements View.OnClickListener {
        C5171a() {
        }

        public void onClick(View view) {
            CreateSceneNameActivity.this.mEtName.setText("");
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.CreateSceneNameActivity$b */
    class C5172b implements View.OnClickListener {
        C5172b() {
        }

        public void onClick(View view) {
            CreateSceneNameActivity.this.onBackPressed();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.CreateSceneNameActivity$c */
    class C5173c implements TextView.OnEditorActionListener {
        C5173c() {
        }

        public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            if (i == 6) {
                ((InputMethodManager) CreateSceneNameActivity.this.getSystemService("input_method")).hideSoftInputFromWindow(textView.getWindowToken(), 0);
            }
            return false;
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.CreateSceneNameActivity$d */
    class C5174d implements TextWatcher {
        C5174d() {
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            int i4;
            ImageButton imageButton;
            if (charSequence.length() > 0) {
                imageButton = CreateSceneNameActivity.this.mBtnClear;
                i4 = 0;
            } else {
                imageButton = CreateSceneNameActivity.this.mBtnClear;
                i4 = 8;
            }
            imageButton.setVisibility(i4);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.CreateSceneNameActivity$e */
    class C5175e implements View.OnClickListener {
        C5175e() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(CreateSceneNameActivity.this, CreateSceneImageSelectionActivity.class);
            intent.putExtra("create_res_index", CreateSceneNameActivity.this.f10174a.getIconId());
            CreateSceneNameActivity.this.startActivityForResult(intent, 100);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.CreateSceneNameActivity$f */
    class C5176f implements View.OnClickListener {
        C5176f() {
        }

        public void onClick(View view) {
            CreateSceneNameActivity.this.m16078a0();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.CreateSceneNameActivity$g */
    class C5177g implements Runnable {
        C5177g() {
        }

        public void run() {
            ((InputMethodManager) CreateSceneNameActivity.this.getSystemService("input_method")).showSoftInput(CreateSceneNameActivity.this.mEtName, 2);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.CreateSceneNameActivity$h */
    class C5178h implements C4007b<String> {
        C5178h() {
        }

        /* access modifiers changed from: private */
        /* renamed from: f */
        public /* synthetic */ void m16084f() {
            Toast.makeText(CreateSceneNameActivity.this, 2131755311, 0).show();
        }

        /* access modifiers changed from: private */
        /* renamed from: g */
        public /* synthetic */ void m16085g() {
            Toast.makeText(CreateSceneNameActivity.this, 2131755312, 0).show();
            try {
                int i = MainActivity.f10688y;
                Intent intent = new Intent(CreateSceneNameActivity.this, MainActivity.class);
                intent.addFlags(67108864);
                CreateSceneNameActivity.this.startActivity(intent);
                CreateSceneNameActivity.this.setResult(-1);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
            CreateSceneNameActivity.this.finish();
        }

        /* access modifiers changed from: private */
        /* renamed from: h */
        public /* synthetic */ void m16086h() {
            Toast.makeText(CreateSceneNameActivity.this, 2131756230, 0).show();
        }

        /* access modifiers changed from: private */
        /* renamed from: i */
        public /* synthetic */ void m16087i() {
            Toast.makeText(CreateSceneNameActivity.this, 2131755311, 0).show();
        }

        /* renamed from: j */
        public void mo23338a(String str) {
            CreateSceneNameActivity createSceneNameActivity;
            Runnable h0Var;
            String str2 = CreateSceneNameActivity.f10173d;
            StringBuilder sb = new StringBuilder();
            sb.append("scene bundle save onSuccess ");
            sb.append(str);
            try {
                int i = new JSONObject(str).getInt("code");
                if (i == 1) {
                    C3096u.m8175n().mo23508D();
                    createSceneNameActivity = CreateSceneNameActivity.this;
                    h0Var = new C5777j0(this);
                } else if (i == 3002) {
                    createSceneNameActivity = CreateSceneNameActivity.this;
                    h0Var = new C5771i0(this);
                } else {
                    createSceneNameActivity = CreateSceneNameActivity.this;
                    h0Var = new C5765h0(this);
                }
                createSceneNameActivity.runOnUiThread(h0Var);
            } catch (Exception e) {
                e.printStackTrace();
            }
            boolean unused = CreateSceneNameActivity.this.f10176c = false;
        }

        public void onFailure(int i, String str) {
            String str2 = CreateSceneNameActivity.f10173d;
            StringBuilder sb = new StringBuilder();
            sb.append("scene bundle save onFailure msg = ");
            sb.append(str);
            CreateSceneNameActivity.this.runOnUiThread(new C5759g0(this));
            boolean unused = CreateSceneNameActivity.this.f10176c = false;
        }
    }

    /* renamed from: Y */
    public static C8330u m16076Y(String str, SceneTemplateBean sceneTemplateBean) {
        C3012e r0 = YeelightDeviceManager.m7804r0(str);
        C8330u uVar = null;
        if (r0 == null) {
            return null;
        }
        try {
            if (r0.mo23220c0() == null) {
                return null;
            }
            C8330u uVar2 = new C8330u(r0.mo23185G(), Constants.EXTRA_PUSH_COMMAND);
            try {
                JSONObject jSONObject = new JSONObject();
                JSONArray jSONArray = new JSONArray();
                if (sceneTemplateBean != null) {
                    if (TextUtils.equals(sceneTemplateBean.getOnoff(), "2")) {
                        try {
                            jSONObject.put("method", "set_power");
                            jSONArray.put("off");
                            jSONObject.put("params", jSONArray);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    } else if (TextUtils.equals(sceneTemplateBean.getOnoff(), TimerCodec.ENABLE)) {
                        try {
                            jSONObject.put("method", "set_power");
                            jSONArray.put("on");
                            jSONObject.put("params", jSONArray);
                        } catch (Exception e2) {
                            e2.printStackTrace();
                        }
                    } else {
                        uVar2.mo35485h((!r0.mo23188I().mo31881b(ProductModelBase.CapabilityType.BTN_COLOR) || sceneTemplateBean.getColor() == 0) ? (!r0.mo23188I().mo31881b(ProductModelBase.CapabilityType.BTN_NIGHT_LIGHT) || sceneTemplateBean.getNightBright() == 0) ? (!r0.mo23188I().mo31881b(ProductModelBase.CapabilityType.BTN_CT) || sceneTemplateBean.getCt() == 0) ? new C8311d(sceneTemplateBean.getTitle(), -1, 1, sceneTemplateBean.getBright()).mo35294a() : new C8314g(sceneTemplateBean.getTitle(), -1, 3, sceneTemplateBean.getBright(), sceneTemplateBean.getCt()).mo35294a() : new C8322n(sceneTemplateBean.getTitle(), -1, 6, sceneTemplateBean.getNightBright()).mo35294a() : new C8313f(sceneTemplateBean.getTitle(), -1, 2, sceneTemplateBean.getBright(), sceneTemplateBean.getColor()).mo35294a());
                    }
                    uVar2.mo35485h(jSONObject);
                }
                return uVar2;
            } catch (Exception unused) {
                uVar = uVar2;
                AppUtils.m8300u(f10173d, "applySceneTemplate error");
                return uVar;
            }
        } catch (Exception unused2) {
            AppUtils.m8300u(f10173d, "applySceneTemplate error");
            return uVar;
        }
    }

    /* renamed from: Z */
    private void m16077Z(String str) {
        if (str == null) {
            AppUtils.m8300u(f10173d, "Invalid deviceId in clearCurrentSceneItem");
            return;
        }
        for (C8330u next : this.f10175b) {
            if (str.equals(next.mo35482e())) {
                this.f10175b.remove(next);
                return;
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a0 */
    public void m16078a0() {
        String obj = this.mEtName.getText().toString();
        if (TextUtils.isEmpty(obj.trim())) {
            Toast.makeText(this, 2131756014, 0).show();
            return;
        }
        SceneTemplateBean sceneTemplateBean = this.f10174a;
        if (sceneTemplateBean != null) {
            for (String next : sceneTemplateBean.getDeviceIds()) {
                C8330u Y = m16076Y(next, this.f10174a);
                if (Y != null) {
                    m16077Z(next);
                    this.f10175b.add(Y);
                }
            }
        }
        m16079b0(obj);
    }

    /* renamed from: b0 */
    private void m16079b0(String str) {
        if (!this.f10176c) {
            this.f10176c = true;
            SceneTemplateBean sceneTemplateBean = this.f10174a;
            if (sceneTemplateBean != null) {
                C3096u.m8175n().mo23507B(C8329t.m19855e(this.f10175b, str, sceneTemplateBean.getIconId(), this.f10174a.getDescription(), "2", this.f10174a.getTemplateId()), new C5178h());
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, @Nullable Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 100 && i2 == -1 && intent != null) {
            int intExtra = intent.getIntExtra("create_res_index", 0);
            this.f10174a.setIconId(intExtra);
            this.mTypeImageView.setImageResource(C9195n.m22164a(3, intExtra));
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo35653P();
        C9193k.m22157h(true, this);
        setContentView(C12228R$layout.activity_create_scene_name);
        ButterKnife.bind((Activity) this);
        Intent intent = getIntent();
        if (intent != null) {
            this.f10174a = (SceneTemplateBean) intent.getSerializableExtra("data_template");
        }
        SceneTemplateBean sceneTemplateBean = this.f10174a;
        if (sceneTemplateBean == null) {
            AppUtils.m8300u("NoDataFound", "No selected device data found!");
            finish();
            return;
        }
        this.mTypeImageView.setImageResource(C9195n.m22164a(3, sceneTemplateBean.getIconId()));
        String title = this.f10174a.getTitle();
        if (title != null) {
            this.mEtName.setText(title);
            this.mEtName.setSelection(title.length());
        }
        this.mBtnClear.setOnClickListener(new C5171a());
        this.mTitleBar.mo36195a("", new C5172b(), (View.OnClickListener) null);
        this.mTitleBar.setTitleTextSize(17);
        this.mTitleBar.setTitle(getString(2131756222));
        EditText editText = this.mEtName;
        editText.addTextChangedListener(new C9183a0(20, editText));
        this.mEtName.setOnEditorActionListener(new C5173c());
        this.mEtName.addTextChangedListener(new C5174d());
        this.mImageSelect.setOnClickListener(new C5175e());
        this.mBtnComplete.setOnClickListener(new C5176f());
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
        this.mEtName.postDelayed(new C5177g(), 200);
    }
}
