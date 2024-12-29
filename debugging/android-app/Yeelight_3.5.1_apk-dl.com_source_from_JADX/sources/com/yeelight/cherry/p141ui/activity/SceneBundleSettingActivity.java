package com.yeelight.cherry.p141ui.activity;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.yeelight.cherry.C12228R$layout;
import com.yeelight.yeelib.managers.C3096u;
import com.yeelight.yeelib.models.C8329t;
import com.yeelight.yeelib.p142ui.activity.BaseActivity;
import com.yeelight.yeelib.p142ui.activity.ShortcutIntentHandlingActivity;
import com.yeelight.yeelib.p142ui.view.CommonTitleBar;
import com.yeelight.yeelib.service.ShortcutUtils;
import com.yeelight.yeelib.utils.AppUtils;
import org.json.JSONException;
import org.json.JSONObject;
import p051j4.C9193k;
import p051j4.C9195n;
import p134c4.C4007b;
import p170i4.C9113d;

/* renamed from: com.yeelight.cherry.ui.activity.SceneBundleSettingActivity */
public class SceneBundleSettingActivity extends BaseActivity {

    /* renamed from: a */
    private String f11295a;

    /* renamed from: b */
    private int f11296b = -1;

    /* renamed from: c */
    private boolean f11297c = false;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C8329t f11298d;

    /* renamed from: e */
    private int f11299e;
    @BindView(2131296352)
    LinearLayout mAddShortcutLayout;
    @BindView(2131296672)
    LinearLayout mManagerLayout;
    @BindView(2131296675)
    LinearLayout mNameLayout;
    @BindView(2131297409)
    TextView mNameView;
    @BindView(2131296676)
    TextView mNumberView;
    @BindView(2131297246)
    ProgressBar mPbAddShortcut;
    @BindView(2131297591)
    CommonTitleBar mTitleBar;
    @BindView(2131297410)
    ImageView mTypeImage;
    @BindView(2131296684)
    LinearLayout mTypeLayout;

    /* renamed from: com.yeelight.cherry.ui.activity.SceneBundleSettingActivity$a */
    class C5641a implements View.OnClickListener {
        C5641a() {
        }

        public void onClick(View view) {
            SceneBundleSettingActivity.this.finish();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.SceneBundleSettingActivity$b */
    class C5642b implements C4007b<String> {

        /* renamed from: a */
        final /* synthetic */ int f11301a;

        C5642b(int i) {
            this.f11301a = i;
        }

        /* renamed from: b */
        public void mo23338a(String str) {
            StringBuilder sb = new StringBuilder();
            sb.append("onSuccess : ");
            sb.append(str);
            try {
                if (new JSONObject(str).getInt("code") != 1) {
                    SceneBundleSettingActivity.this.m16974d0(this.f11301a);
                }
            } catch (JSONException e) {
                e.printStackTrace();
                SceneBundleSettingActivity.this.m16974d0(this.f11301a);
            }
        }

        public void onFailure(int i, String str) {
            StringBuilder sb = new StringBuilder();
            sb.append("onFailure msg = ");
            sb.append(str);
            SceneBundleSettingActivity.this.m16974d0(this.f11301a);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.SceneBundleSettingActivity$c */
    class C5643c implements C4007b<String> {

        /* renamed from: a */
        final /* synthetic */ String f11303a;

        C5643c(String str) {
            this.f11303a = str;
        }

        /* renamed from: b */
        public void mo23338a(String str) {
            StringBuilder sb = new StringBuilder();
            sb.append("onSuccess : ");
            sb.append(str);
            try {
                if (new JSONObject(str).getInt("code") != 1) {
                    SceneBundleSettingActivity.this.m16973c0(this.f11303a);
                }
            } catch (Exception e) {
                e.printStackTrace();
                SceneBundleSettingActivity.this.m16973c0(this.f11303a);
            }
        }

        public void onFailure(int i, String str) {
            StringBuilder sb = new StringBuilder();
            sb.append("onFailure msg = ");
            sb.append(str);
            SceneBundleSettingActivity.this.m16973c0(this.f11303a);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.SceneBundleSettingActivity$d */
    class C5644d implements DialogInterface.OnClickListener {
        C5644d() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
            C3096u.m8175n().mo23511m(SceneBundleSettingActivity.this.f11298d);
            Intent intent = new Intent(SceneBundleSettingActivity.this, MainActivity.class);
            intent.addFlags(71303168);
            SceneBundleSettingActivity.this.startActivity(intent);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.SceneBundleSettingActivity$e */
    class C5645e implements Runnable {
        C5645e() {
        }

        public void run() {
            if (!SceneBundleSettingActivity.this.isFinishing()) {
                SceneBundleSettingActivity.this.mPbAddShortcut.setVisibility(8);
            }
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.SceneBundleSettingActivity$f */
    class C5646f implements Runnable {
        C5646f() {
        }

        public void run() {
            if (!SceneBundleSettingActivity.this.isFinishing()) {
                Toast.makeText(SceneBundleSettingActivity.this, 2131756370, 0).show();
                SceneBundleSettingActivity.this.mPbAddShortcut.setVisibility(8);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a0 */
    public /* synthetic */ void m16971a0() {
        Toast.makeText(this, getString(2131756231), 0).show();
    }

    /* access modifiers changed from: private */
    /* renamed from: b0 */
    public /* synthetic */ void m16972b0() {
        Toast.makeText(this, getString(2131756231), 0).show();
    }

    /* access modifiers changed from: private */
    /* renamed from: c0 */
    public void m16973c0(String str) {
        runOnUiThread(new C5774i3(this));
        this.f11298d.mo35476q(str);
        this.mNameView.setText(str);
    }

    /* access modifiers changed from: private */
    /* renamed from: d0 */
    public void m16974d0(int i) {
        runOnUiThread(new C5768h3(this));
        this.f11298d.mo35478s(i);
        this.mTypeImage.setImageResource(C9195n.m22164a(3, i));
    }

    @OnClick({2131296352})
    public void addShortcut() {
        Class<ShortcutIntentHandlingActivity> cls = ShortcutIntentHandlingActivity.class;
        if (Build.VERSION.SDK_INT >= 26) {
            ShortcutManager shortcutManager = (ShortcutManager) getSystemService(ShortcutManager.class);
            if (!shortcutManager.isRequestPinShortcutSupported()) {
                Toast.makeText(this, 2131756371, 0).show();
                return;
            }
            ShortcutInfo.Builder builder = new ShortcutInfo.Builder(this, this.f11298d.mo35472m());
            builder.setShortLabel(this.f11298d.mo35472m());
            builder.setLongLabel(this.f11298d.mo35472m());
            builder.setIcon(Icon.createWithResource(this, 2131231170));
            this.mPbAddShortcut.setVisibility(0);
            this.mPbAddShortcut.postDelayed(new C5645e(), 800);
            Intent intent = new Intent(this, cls);
            intent.setAction(ShortcutUtils.ACTION_YEELIGHT_SHORTCUT);
            intent.setFlags(1476395008);
            intent.putExtra("com.yeelight.cherry.type", "type_scene_bundle");
            intent.putExtra(ShortcutUtils.EXTRA_SHORTCUT_TYPE, ShortcutUtils.SHORTCUT_TYPE_SCENE_BUNDLE);
            intent.putExtra(ShortcutUtils.EXTRA_SHORTCUT_PARAM, this.f11298d.mo35471l());
            builder.setIntent(intent);
            shortcutManager.requestPinShortcut(builder.build(), (IntentSender) null);
            return;
        }
        Intent intent2 = new Intent(ShortcutUtils.ACTION_ADD_SHORTCUT);
        intent2.putExtra("duplicate", false);
        intent2.putExtra("android.intent.extra.shortcut.NAME", this.f11298d.mo35472m());
        intent2.putExtra("android.intent.extra.shortcut.ICON_RESOURCE", Intent.ShortcutIconResource.fromContext(this, 2131231170));
        this.mPbAddShortcut.setVisibility(0);
        this.mPbAddShortcut.postDelayed(new C5646f(), 800);
        Intent intent3 = new Intent(this, cls);
        intent3.setAction(ShortcutUtils.ACTION_YEELIGHT_SHORTCUT);
        intent3.setFlags(1476395008);
        intent3.putExtra("com.yeelight.cherry.type", "type_scene_bundle");
        intent3.putExtra(ShortcutUtils.EXTRA_SHORTCUT_TYPE, ShortcutUtils.SHORTCUT_TYPE_SCENE_BUNDLE);
        intent3.putExtra(ShortcutUtils.EXTRA_SHORTCUT_PARAM, this.f11298d.mo35471l());
        intent2.putExtra("android.intent.extra.shortcut.INTENT", intent3);
        sendBroadcast(intent2);
    }

    @OnClick({2131297404})
    public void deleteRoom() {
        C9113d.C9118e eVar = new C9113d.C9118e(this);
        eVar.mo37179i(getString(2131755247)).mo37177g(getString(2131756215)).mo37174d(-2, getString(2131755232), (DialogInterface.OnClickListener) null).mo37174d(-1, getString(2131755281), new C5644d());
        eVar.mo37180j();
    }

    @OnClick({2131296672})
    public void modifyDevice() {
        Intent intent = new Intent(this, SceneItemModifyActivity.class);
        intent.putExtra("com.yeelight.cherry.scene_bundle_id", this.f11298d.mo35471l());
        startActivityForResult(intent, 3);
    }

    @OnClick({2131296675})
    public void modifyName() {
        Intent intent = new Intent(this, CommonCreateNameActivity.class);
        intent.putExtra("edit_mode", true);
        intent.putExtra("create_name_type", 1);
        intent.putExtra("room_name", this.f11298d.mo35472m());
        int i = this.f11296b;
        if (i == -1) {
            i = this.f11298d.mo35475p();
        }
        intent.putExtra("create_res_index", i);
        startActivityForResult(intent, 2);
    }

    @OnClick({2131296684})
    public void modifyType() {
        Intent intent = new Intent(this, ImageModeSelectionActivity.class);
        intent.putExtra("image_type", 3);
        intent.putExtra("type_edit", true);
        int i = this.f11296b;
        if (i == -1) {
            i = this.f11298d.mo35475p();
        }
        intent.putExtra("create_res_index", i);
        startActivityForResult(intent, 1);
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        C8329t tVar;
        C3096u uVar;
        C4007b bVar;
        super.onActivityResult(i, i2, intent);
        if (i == 1) {
            if (i2 != -1 || intent == null) {
                this.f11296b = -1;
                return;
            }
            this.f11297c = true;
            int p = this.f11298d.mo35475p();
            int intExtra = intent.getIntExtra("create_res_index", -1);
            this.f11296b = intExtra;
            this.mTypeImage.setImageResource(C9195n.m22164a(3, intExtra));
            int i3 = this.f11296b;
            if (i3 != -1) {
                this.f11298d.mo35478s(i3);
                uVar = C3096u.m8175n();
                tVar = this.f11298d;
                bVar = new C5642b(p);
            } else {
                return;
            }
        } else if (i == 2) {
            if (i2 == -1 && intent != null) {
                String stringExtra = intent.getStringExtra("room_name");
                this.f11295a = stringExtra;
                if (stringExtra != null) {
                    this.f11297c = true;
                    String m = this.f11298d.mo35472m();
                    this.mNameView.setText(this.f11295a);
                    this.f11298d.mo35476q(this.f11295a);
                    uVar = C3096u.m8175n();
                    tVar = this.f11298d;
                    bVar = new C5643c(m);
                } else {
                    return;
                }
            } else {
                return;
            }
        } else if (i == 3) {
            this.f11297c = true;
            this.f11299e = this.f11298d.mo35473n() == null ? 0 : this.f11298d.mo35473n().size();
            return;
        } else {
            return;
        }
        uVar.mo23510F(tVar, bVar);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo35653P();
        C9193k.m22157h(true, this);
        setContentView(C12228R$layout.activity_scene_bundle_setting);
        ButterKnife.bind((Activity) this);
        if (getIntent().hasExtra("com.yeelight.cherry.scene_bundle_id")) {
            C8329t o = C3096u.m8175n().mo23512o(getIntent().getStringExtra("com.yeelight.cherry.scene_bundle_id"));
            this.f11298d = o;
            if (o == null) {
                finish();
                return;
            }
            int i = 0;
            this.f11299e = o.mo35473n() == null ? 0 : this.f11298d.mo35473n().size();
            StringBuilder sb = new StringBuilder();
            sb.append("CreateSceneBundleActivity, edit mode, found scene bundle: ");
            sb.append(this.f11298d);
            this.mTypeImage.setImageResource(C9195n.m22164a(3, this.f11298d.mo35475p()));
            this.mNameView.setText(this.f11298d.mo35472m());
            this.mTitleBar.setRightTextVisible(false);
            if (Build.VERSION.SDK_INT >= 26) {
                LinearLayout linearLayout = this.mAddShortcutLayout;
                if (!ShortcutUtils.isShortcutSupported()) {
                    i = 8;
                }
                linearLayout.setVisibility(i);
            }
            this.mTitleBar.mo36195a(getString(2131755317), new C5641a(), (View.OnClickListener) null);
            return;
        }
        AppUtils.m8300u("SCENE_BUNDLE", "No scene bundle id, should not be here!");
        finish();
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        if (this.f11297c) {
            C3096u.m8175n().mo23508D();
        }
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        this.mNumberView.setText(String.format(getString(2131756216), new Object[]{Integer.valueOf(this.f11299e)}));
    }
}
