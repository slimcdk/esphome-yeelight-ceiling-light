package com.yeelight.cherry.p177ui.activity;

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
import com.yeelight.cherry.C11748R$layout;
import com.yeelight.yeelib.p152f.C4247u;
import com.yeelight.yeelib.p153g.C9858z;
import com.yeelight.yeelib.p187h.p189h.C9874b;
import com.yeelight.yeelib.p194ui.activity.BaseActivity;
import com.yeelight.yeelib.p194ui.activity.ShortcutIntentHandlingActivity;
import com.yeelight.yeelib.p194ui.view.CommonTitleBar;
import com.yeelight.yeelib.p194ui.widget.C10526e;
import com.yeelight.yeelib.service.ShortcutUtils;
import com.yeelight.yeelib.utils.C10547m;
import com.yeelight.yeelib.utils.C10549p;
import com.yeelight.yeelib.utils.C4308b;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.yeelight.cherry.ui.activity.SceneBundleSettingActivity */
public class SceneBundleSettingActivity extends BaseActivity {

    /* renamed from: b */
    private String f11725b;

    /* renamed from: c */
    private int f11726c = -1;

    /* renamed from: d */
    private boolean f11727d = false;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public C9858z f11728e;

    /* renamed from: f */
    private int f11729f;
    @BindView(2131296311)
    LinearLayout mAddShortcutLayout;
    @BindView(2131296594)
    LinearLayout mManagerLayout;
    @BindView(2131296597)
    LinearLayout mNameLayout;
    @BindView(2131297266)
    TextView mNameView;
    @BindView(2131296598)
    TextView mNumberView;
    @BindView(2131297113)
    ProgressBar mPbAddShortcut;
    @BindView(2131297424)
    CommonTitleBar mTitleBar;
    @BindView(2131297267)
    ImageView mTypeImage;
    @BindView(2131296606)
    LinearLayout mTypeLayout;

    /* renamed from: com.yeelight.cherry.ui.activity.SceneBundleSettingActivity$a */
    class C5600a implements View.OnClickListener {
        C5600a() {
        }

        public void onClick(View view) {
            SceneBundleSettingActivity.this.finish();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.SceneBundleSettingActivity$b */
    class C5601b implements C9874b<String> {

        /* renamed from: a */
        final /* synthetic */ int f11731a;

        C5601b(int i) {
            this.f11731a = i;
        }

        /* renamed from: b */
        public void mo23475a(String str) {
            "onSuccess : " + str;
            try {
                if (new JSONObject(str).getInt("code") != 1) {
                    SceneBundleSettingActivity.this.m16967b0(this.f11731a);
                }
            } catch (JSONException e) {
                e.printStackTrace();
                SceneBundleSettingActivity.this.m16967b0(this.f11731a);
            }
        }

        public void onFailure(int i, String str) {
            "onFailure msg = " + str;
            SceneBundleSettingActivity.this.m16967b0(this.f11731a);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.SceneBundleSettingActivity$c */
    class C5602c implements C9874b<String> {

        /* renamed from: a */
        final /* synthetic */ String f11733a;

        C5602c(String str) {
            this.f11733a = str;
        }

        /* renamed from: b */
        public void mo23475a(String str) {
            "onSuccess : " + str;
            try {
                if (new JSONObject(str).getInt("code") != 1) {
                    SceneBundleSettingActivity.this.m16966a0(this.f11733a);
                }
            } catch (Exception e) {
                e.printStackTrace();
                SceneBundleSettingActivity.this.m16966a0(this.f11733a);
            }
        }

        public void onFailure(int i, String str) {
            "onFailure msg = " + str;
            SceneBundleSettingActivity.this.m16966a0(this.f11733a);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.SceneBundleSettingActivity$d */
    class C5603d implements DialogInterface.OnClickListener {
        C5603d() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
            C4247u.m11865n().mo23618m(SceneBundleSettingActivity.this.f11728e);
            Intent intent = new Intent(SceneBundleSettingActivity.this, MainActivity.class);
            intent.addFlags(71303168);
            SceneBundleSettingActivity.this.startActivity(intent);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.SceneBundleSettingActivity$e */
    class C5604e implements Runnable {
        C5604e() {
        }

        public void run() {
            if (!SceneBundleSettingActivity.this.isFinishing()) {
                SceneBundleSettingActivity.this.mPbAddShortcut.setVisibility(8);
            }
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.SceneBundleSettingActivity$f */
    class C5605f implements Runnable {
        C5605f() {
        }

        public void run() {
            if (!SceneBundleSettingActivity.this.isFinishing()) {
                Toast.makeText(SceneBundleSettingActivity.this, 2131756340, 0).show();
                SceneBundleSettingActivity.this.mPbAddShortcut.setVisibility(8);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a0 */
    public void m16966a0(String str) {
        runOnUiThread(new C5743m2(this));
        this.f11728e.mo31911q(str);
        this.mNameView.setText(str);
    }

    /* access modifiers changed from: private */
    /* renamed from: b0 */
    public void m16967b0(int i) {
        runOnUiThread(new C5738l2(this));
        this.f11728e.mo31913s(i);
        this.mTypeImage.setImageResource(C10549p.m25765a(3, i));
    }

    /* renamed from: Y */
    public /* synthetic */ void mo26887Y() {
        Toast.makeText(this, getString(2131756206), 0).show();
    }

    /* renamed from: Z */
    public /* synthetic */ void mo26888Z() {
        Toast.makeText(this, getString(2131756206), 0).show();
    }

    @OnClick({2131296311})
    public void addShortcut() {
        if (Build.VERSION.SDK_INT >= 26) {
            ShortcutManager shortcutManager = (ShortcutManager) getSystemService(ShortcutManager.class);
            if (!shortcutManager.isRequestPinShortcutSupported()) {
                Toast.makeText(this, 2131756341, 0).show();
                return;
            }
            ShortcutInfo.Builder builder = new ShortcutInfo.Builder(this, this.f11728e.mo31907m());
            builder.setShortLabel(this.f11728e.mo31907m());
            builder.setLongLabel(this.f11728e.mo31907m());
            builder.setIcon(Icon.createWithResource(this, 2131231156));
            this.mPbAddShortcut.setVisibility(0);
            this.mPbAddShortcut.postDelayed(new C5604e(), 800);
            Intent intent = new Intent(this, ShortcutIntentHandlingActivity.class);
            intent.setAction(ShortcutUtils.ACTION_YEELIGHT_SHORTCUT);
            intent.setFlags(1476395008);
            intent.putExtra("com.yeelight.cherry.type", "type_scene_bundle");
            intent.putExtra(ShortcutUtils.EXTRA_SHORTCUT_TYPE, ShortcutUtils.SHORTCUT_TYPE_SCENE_BUNDLE);
            intent.putExtra(ShortcutUtils.EXTRA_SHORTCUT_PARAM, this.f11728e.mo31906l());
            builder.setIntent(intent);
            shortcutManager.requestPinShortcut(builder.build(), (IntentSender) null);
            return;
        }
        Intent intent2 = new Intent(ShortcutUtils.ACTION_ADD_SHORTCUT);
        intent2.putExtra("duplicate", false);
        intent2.putExtra("android.intent.extra.shortcut.NAME", this.f11728e.mo31907m());
        intent2.putExtra("android.intent.extra.shortcut.ICON_RESOURCE", Intent.ShortcutIconResource.fromContext(this, 2131231156));
        this.mPbAddShortcut.setVisibility(0);
        this.mPbAddShortcut.postDelayed(new C5605f(), 800);
        Intent intent3 = new Intent(this, ShortcutIntentHandlingActivity.class);
        intent3.setAction(ShortcutUtils.ACTION_YEELIGHT_SHORTCUT);
        intent3.setFlags(1476395008);
        intent3.putExtra("com.yeelight.cherry.type", "type_scene_bundle");
        intent3.putExtra(ShortcutUtils.EXTRA_SHORTCUT_TYPE, ShortcutUtils.SHORTCUT_TYPE_SCENE_BUNDLE);
        intent3.putExtra(ShortcutUtils.EXTRA_SHORTCUT_PARAM, this.f11728e.mo31906l());
        intent2.putExtra("android.intent.extra.shortcut.INTENT", intent3);
        sendBroadcast(intent2);
    }

    @OnClick({2131297261})
    public void deleteRoom() {
        C10526e.C10531e eVar = new C10526e.C10531e(this);
        eVar.mo33358i(getString(2131755244));
        eVar.mo33356g(getString(2131756190));
        eVar.mo33353d(-2, getString(2131755229), (DialogInterface.OnClickListener) null);
        eVar.mo33353d(-1, getString(2131755277), new C5603d());
        eVar.mo33359j();
    }

    @OnClick({2131296594})
    public void modifyDevice() {
        Intent intent = new Intent(this, SceneItemModifyActivity.class);
        intent.putExtra("com.yeelight.cherry.scene_bundle_id", this.f11728e.mo31906l());
        startActivityForResult(intent, 3);
    }

    @OnClick({2131296597})
    public void modifyName() {
        Intent intent = new Intent(this, CommonCreateNameActivity.class);
        intent.putExtra("edit_mode", true);
        intent.putExtra("create_name_type", 1);
        intent.putExtra("room_name", this.f11728e.mo31907m());
        int i = this.f11726c;
        if (i == -1) {
            i = this.f11728e.mo31910p();
        }
        intent.putExtra("create_res_index", i);
        startActivityForResult(intent, 2);
    }

    @OnClick({2131296606})
    public void modifyType() {
        Intent intent = new Intent(this, ImageModeSelectionActivity.class);
        intent.putExtra("image_type", 3);
        intent.putExtra("type_edit", true);
        int i = this.f11726c;
        if (i == -1) {
            i = this.f11728e.mo31910p();
        }
        intent.putExtra("create_res_index", i);
        startActivityForResult(intent, 1);
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        C9858z zVar;
        C4247u uVar;
        C9874b bVar;
        super.onActivityResult(i, i2, intent);
        if (i == 1) {
            if (i2 != -1 || intent == null) {
                this.f11726c = -1;
                return;
            }
            this.f11727d = true;
            int p = this.f11728e.mo31910p();
            int intExtra = intent.getIntExtra("create_res_index", -1);
            this.f11726c = intExtra;
            this.mTypeImage.setImageResource(C10549p.m25765a(3, intExtra));
            int i3 = this.f11726c;
            if (i3 != -1) {
                this.f11728e.mo31913s(i3);
                uVar = C4247u.m11865n();
                zVar = this.f11728e;
                bVar = new C5601b(p);
            } else {
                return;
            }
        } else if (i == 2) {
            if (i2 == -1 && intent != null) {
                String stringExtra = intent.getStringExtra("room_name");
                this.f11725b = stringExtra;
                if (stringExtra != null) {
                    this.f11727d = true;
                    String m = this.f11728e.mo31907m();
                    this.mNameView.setText(this.f11725b);
                    this.f11728e.mo31911q(this.f11725b);
                    uVar = C4247u.m11865n();
                    zVar = this.f11728e;
                    bVar = new C5602c(m);
                } else {
                    return;
                }
            } else {
                return;
            }
        } else if (i == 3) {
            this.f11727d = true;
            this.f11729f = this.f11728e.mo31908n() == null ? 0 : this.f11728e.mo31908n().size();
            return;
        } else {
            return;
        }
        uVar.mo23617F(zVar, bVar);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo32193P();
        C10547m.m25758h(true, this);
        setContentView(C11748R$layout.activity_scene_bundle_setting);
        ButterKnife.bind((Activity) this);
        if (getIntent().hasExtra("com.yeelight.cherry.scene_bundle_id")) {
            C9858z o = C4247u.m11865n().mo23619o(getIntent().getStringExtra("com.yeelight.cherry.scene_bundle_id"));
            this.f11728e = o;
            if (o == null) {
                finish();
                return;
            }
            int i = 0;
            this.f11729f = o.mo31908n() == null ? 0 : this.f11728e.mo31908n().size();
            "CreateSceneBundleActivity, edit mode, found scene bundle: " + this.f11728e;
            this.mTypeImage.setImageResource(C10549p.m25765a(3, this.f11728e.mo31910p()));
            this.mNameView.setText(this.f11728e.mo31907m());
            this.mTitleBar.setRightTextVisible(false);
            if (Build.VERSION.SDK_INT >= 26) {
                LinearLayout linearLayout = this.mAddShortcutLayout;
                if (!ShortcutUtils.isShortcutSupported()) {
                    i = 8;
                }
                linearLayout.setVisibility(i);
            }
            this.mTitleBar.mo32825a(getString(2131755313), new C5600a(), (View.OnClickListener) null);
            return;
        }
        C4308b.m12139r("SCENE_BUNDLE", "No scene bundle id, should not be here!");
        finish();
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        if (this.f11727d) {
            C4247u.m11865n().mo23615D();
        }
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        this.mNumberView.setText(String.format(getString(2131756191), new Object[]{Integer.valueOf(this.f11729f)}));
    }
}
