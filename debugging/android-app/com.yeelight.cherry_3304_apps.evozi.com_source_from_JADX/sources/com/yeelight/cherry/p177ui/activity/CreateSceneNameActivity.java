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
import com.yeelight.cherry.C11748R$layout;
import com.yeelight.yeelib.device.models.C7628j;
import com.yeelight.yeelib.p150c.p151i.C4200i;
import com.yeelight.yeelib.p152f.C4247u;
import com.yeelight.yeelib.p152f.C4257w;
import com.yeelight.yeelib.p153g.C9828a0;
import com.yeelight.yeelib.p153g.C9832c0;
import com.yeelight.yeelib.p153g.C9833d;
import com.yeelight.yeelib.p153g.C9835f;
import com.yeelight.yeelib.p153g.C9836g;
import com.yeelight.yeelib.p153g.C9851t;
import com.yeelight.yeelib.p153g.C9858z;
import com.yeelight.yeelib.p187h.p189h.C9874b;
import com.yeelight.yeelib.p194ui.activity.BaseActivity;
import com.yeelight.yeelib.p194ui.view.CommonTitleBar;
import com.yeelight.yeelib.utils.C10536b0;
import com.yeelight.yeelib.utils.C10547m;
import com.yeelight.yeelib.utils.C10549p;
import com.yeelight.yeelib.utils.C4308b;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.yeelight.cherry.ui.activity.CreateSceneNameActivity */
public class CreateSceneNameActivity extends BaseActivity {

    /* renamed from: e */
    public static final String f10620e = CreateSceneNameActivity.class.getSimpleName();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C9832c0 f10621b;

    /* renamed from: c */
    private List<C9828a0> f10622c = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: d */
    public boolean f10623d = false;
    @BindView(2131296402)
    ImageButton mBtnClear;
    @BindView(2131296404)
    TextView mBtnComplete;
    @BindView(2131296655)
    EditText mEtName;
    @BindView(2131296908)
    FrameLayout mImageSelect;
    @BindView(2131297424)
    CommonTitleBar mTitleBar;
    @BindView(2131297306)
    ImageView mTypeImageView;

    /* renamed from: com.yeelight.cherry.ui.activity.CreateSceneNameActivity$a */
    class C5123a implements View.OnClickListener {
        C5123a() {
        }

        public void onClick(View view) {
            CreateSceneNameActivity.this.mEtName.setText("");
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.CreateSceneNameActivity$b */
    class C5124b implements View.OnClickListener {
        C5124b() {
        }

        public void onClick(View view) {
            CreateSceneNameActivity.this.onBackPressed();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.CreateSceneNameActivity$c */
    class C5125c implements TextView.OnEditorActionListener {
        C5125c() {
        }

        public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            if (i == 6) {
                ((InputMethodManager) CreateSceneNameActivity.this.getSystemService("input_method")).hideSoftInputFromWindow(textView.getWindowToken(), 0);
            }
            return false;
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.CreateSceneNameActivity$d */
    class C5126d implements TextWatcher {
        C5126d() {
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
    class C5127e implements View.OnClickListener {
        C5127e() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(CreateSceneNameActivity.this, CreateSceneImageSelectionActivity.class);
            intent.putExtra("create_res_index", CreateSceneNameActivity.this.f10621b.mo31751f());
            CreateSceneNameActivity.this.startActivityForResult(intent, 100);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.CreateSceneNameActivity$f */
    class C5128f implements View.OnClickListener {
        C5128f() {
        }

        public void onClick(View view) {
            CreateSceneNameActivity.this.m16174a0();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.CreateSceneNameActivity$g */
    class C5129g implements Runnable {
        C5129g() {
        }

        public void run() {
            ((InputMethodManager) CreateSceneNameActivity.this.getSystemService("input_method")).showSoftInput(CreateSceneNameActivity.this.mEtName, 2);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.CreateSceneNameActivity$h */
    class C5130h implements C9874b<String> {
        C5130h() {
        }

        /* renamed from: b */
        public /* synthetic */ void mo26306b() {
            Toast.makeText(CreateSceneNameActivity.this, 2131755307, 0).show();
        }

        /* renamed from: c */
        public /* synthetic */ void mo26307c() {
            Toast.makeText(CreateSceneNameActivity.this, 2131755308, 0).show();
            try {
                Intent intent = new Intent(CreateSceneNameActivity.this, Class.forName("com.yeelight.cherry.ui.activity.MainActivity"));
                intent.addFlags(67108864);
                CreateSceneNameActivity.this.startActivity(intent);
                CreateSceneNameActivity.this.setResult(-1);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
            CreateSceneNameActivity.this.finish();
        }

        /* renamed from: d */
        public /* synthetic */ void mo26308d() {
            Toast.makeText(CreateSceneNameActivity.this, 2131756205, 0).show();
        }

        /* renamed from: e */
        public /* synthetic */ void mo26309e() {
            Toast.makeText(CreateSceneNameActivity.this, 2131755307, 0).show();
        }

        /* renamed from: f */
        public void mo23475a(String str) {
            CreateSceneNameActivity createSceneNameActivity;
            Runnable uVar;
            String str2 = CreateSceneNameActivity.f10620e;
            "scene bundle save onSuccess " + str;
            try {
                int i = new JSONObject(str).getInt("code");
                if (i == 1) {
                    C4247u.m11865n().mo23615D();
                    createSceneNameActivity = CreateSceneNameActivity.this;
                    uVar = new C5782v(this);
                } else if (i == 3002) {
                    createSceneNameActivity = CreateSceneNameActivity.this;
                    uVar = new C5790x(this);
                } else {
                    createSceneNameActivity = CreateSceneNameActivity.this;
                    uVar = new C5778u(this);
                }
                createSceneNameActivity.runOnUiThread(uVar);
            } catch (Exception e) {
                e.printStackTrace();
            }
            boolean unused = CreateSceneNameActivity.this.f10623d = false;
        }

        public void onFailure(int i, String str) {
            String str2 = CreateSceneNameActivity.f10620e;
            "scene bundle save onFailure msg = " + str;
            CreateSceneNameActivity.this.runOnUiThread(new C5786w(this));
            boolean unused = CreateSceneNameActivity.this.f10623d = false;
        }
    }

    /* renamed from: Y */
    public static C9828a0 m16172Y(String str, C9832c0 c0Var) {
        C4200i o0 = C4257w.m11953o0(str);
        C9828a0 a0Var = null;
        if (o0 == null) {
            return null;
        }
        try {
            if (o0.mo23407c0() == null) {
                return null;
            }
            C9828a0 a0Var2 = new C9828a0(o0.mo23372G(), Constants.EXTRA_PUSH_COMMAND);
            try {
                JSONObject jSONObject = new JSONObject();
                JSONArray jSONArray = new JSONArray();
                if (c0Var != null) {
                    if (TextUtils.equals(c0Var.mo31753h(), "2")) {
                        try {
                            jSONObject.put("method", "set_power");
                            jSONArray.put("off");
                            jSONObject.put("params", jSONArray);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    } else if (TextUtils.equals(c0Var.mo31753h(), TimerCodec.ENABLE)) {
                        try {
                            jSONObject.put("method", "set_power");
                            jSONArray.put("on");
                            jSONObject.put("params", jSONArray);
                        } catch (Exception e2) {
                            e2.printStackTrace();
                        }
                    } else {
                        a0Var2.mo31735h((!o0.mo23375I().mo29076b(C7628j.C7630b.BTN_COLOR) || c0Var.mo31747b() == 0) ? (!o0.mo23375I().mo29076b(C7628j.C7630b.BTN_NIGHT_LIGHT) || c0Var.mo31752g() == 0) ? (!o0.mo23375I().mo29076b(C7628j.C7630b.BTN_CT) || c0Var.mo31748c() == 0) ? new C9833d(c0Var.mo31755j(), -1, 1, c0Var.mo31746a()).mo31743a() : new C9836g(c0Var.mo31755j(), -1, 3, c0Var.mo31746a(), c0Var.mo31748c()).mo31743a() : new C9851t(c0Var.mo31755j(), -1, 6, c0Var.mo31752g()).mo31743a() : new C9835f(c0Var.mo31755j(), -1, 2, c0Var.mo31746a(), c0Var.mo31747b()).mo31743a());
                    }
                    a0Var2.mo31735h(jSONObject);
                }
                return a0Var2;
            } catch (Exception unused) {
                a0Var = a0Var2;
                C4308b.m12139r(f10620e, "applySceneTemplate error");
                return a0Var;
            }
        } catch (Exception unused2) {
            C4308b.m12139r(f10620e, "applySceneTemplate error");
            return a0Var;
        }
    }

    /* renamed from: Z */
    private void m16173Z(String str) {
        if (str == null) {
            C4308b.m12139r(f10620e, "Invalid deviceId in clearCurrentSceneItem");
            return;
        }
        for (C9828a0 next : this.f10622c) {
            if (str.equals(next.mo31732e())) {
                this.f10622c.remove(next);
                return;
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a0 */
    public void m16174a0() {
        String obj = this.mEtName.getText().toString();
        if (TextUtils.isEmpty(obj.trim())) {
            Toast.makeText(this, 2131756002, 0).show();
            return;
        }
        C9832c0 c0Var = this.f10621b;
        if (c0Var != null) {
            for (String next : c0Var.mo31750e()) {
                C9828a0 Y = m16172Y(next, this.f10621b);
                if (Y != null) {
                    m16173Z(next);
                    this.f10622c.add(Y);
                }
            }
        }
        m16175b0(obj);
    }

    /* renamed from: b0 */
    private void m16175b0(String str) {
        if (!this.f10623d) {
            this.f10623d = true;
            C9832c0 c0Var = this.f10621b;
            if (c0Var != null) {
                C4247u.m11865n().mo23614B(C9858z.m24109e(this.f10622c, str, c0Var.mo31751f(), this.f10621b.mo31749d(), "2", this.f10621b.mo31754i()), new C5130h());
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, @Nullable Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 100 && i2 == -1 && intent != null) {
            int intExtra = intent.getIntExtra("create_res_index", 0);
            this.f10621b.mo31757l(intExtra);
            this.mTypeImageView.setImageResource(C10549p.m25765a(3, intExtra));
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo32193P();
        C10547m.m25758h(true, this);
        setContentView(C11748R$layout.activity_create_scene_name);
        ButterKnife.bind((Activity) this);
        Intent intent = getIntent();
        if (intent != null) {
            this.f10621b = (C9832c0) intent.getSerializableExtra("data_template");
        }
        C9832c0 c0Var = this.f10621b;
        if (c0Var == null) {
            C4308b.m12139r("NoDataFound", "No selected device data found!");
            finish();
            return;
        }
        this.mTypeImageView.setImageResource(C10549p.m25765a(3, c0Var.mo31751f()));
        String j = this.f10621b.mo31755j();
        if (j != null) {
            this.mEtName.setText(j);
            this.mEtName.setSelection(j.length());
        }
        this.mBtnClear.setOnClickListener(new C5123a());
        this.mTitleBar.mo32825a("", new C5124b(), (View.OnClickListener) null);
        this.mTitleBar.setTitleTextSize(17);
        this.mTitleBar.setTitle(getString(2131756197));
        EditText editText = this.mEtName;
        editText.addTextChangedListener(new C10536b0(20, editText));
        this.mEtName.setOnEditorActionListener(new C5125c());
        this.mEtName.addTextChangedListener(new C5126d());
        this.mImageSelect.setOnClickListener(new C5127e());
        this.mBtnComplete.setOnClickListener(new C5128f());
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
        this.mEtName.postDelayed(new C5129g(), 200);
    }
}
