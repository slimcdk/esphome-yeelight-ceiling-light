package com.yeelight.yeelib.p142ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.yeelight.yeelib.R$id;
import com.yeelight.yeelib.R$layout;
import com.yeelight.yeelib.R$string;
import com.yeelight.yeelib.device.base.C3012e;
import com.yeelight.yeelib.managers.YeelightDeviceManager;
import com.yeelight.yeelib.p142ui.fragment.FavoriteSceneFragment;
import com.yeelight.yeelib.p142ui.view.CommonTitleBar;
import com.yeelight.yeelib.utils.AppUtils;
import p051j4.C9193k;

/* renamed from: com.yeelight.yeelib.ui.activity.SceneActivity */
public class SceneActivity extends BaseActivity {

    /* renamed from: f */
    private static final String f15191f = "SceneActivity";

    /* renamed from: a */
    CommonTitleBar f15192a;

    /* renamed from: b */
    private String f15193b;

    /* renamed from: c */
    private boolean f15194c = false;

    /* renamed from: d */
    private C3012e f15195d;

    /* renamed from: e */
    private int f15196e = -1;

    /* renamed from: com.yeelight.yeelib.ui.activity.SceneActivity$a */
    class C8627a implements View.OnClickListener {
        C8627a() {
        }

        public void onClick(View view) {
            SceneActivity.this.onBackPressed();
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (!intent.hasExtra("com.yeelight.cherry.device_id")) {
            AppUtils.m8302w(f15191f, "Activity has not device id", false);
            finish();
            return;
        }
        String stringExtra = intent.getStringExtra("com.yeelight.cherry.device_id");
        this.f15193b = stringExtra;
        C3012e r0 = YeelightDeviceManager.m7804r0(stringExtra);
        this.f15195d = r0;
        if (r0 == null) {
            BaseActivity.m19947U(this);
            finish();
            return;
        }
        this.f15194c = intent.getBooleanExtra("start_for_result", false);
        this.f15196e = intent.getIntExtra("position", -1);
        int intExtra = intent.getIntExtra("device_lamp_mode", -1);
        mo35653P();
        C9193k.m22157h(true, this);
        setContentView(R$layout.activity_scene);
        CommonTitleBar commonTitleBar = (CommonTitleBar) findViewById(R$id.title_bar);
        this.f15192a = commonTitleBar;
        commonTitleBar.mo36195a(getString(R$string.common_text_favorite), new C8627a(), (View.OnClickListener) null);
        this.f15192a.setTitleTextSize(16);
        Fragment findFragmentById = getSupportFragmentManager().findFragmentById(R$id.favorite_fragment);
        Bundle bundle2 = new Bundle();
        bundle2.putString("com.yeelight.cherry.device_id", this.f15193b);
        bundle2.putBoolean("start_for_result", this.f15194c);
        bundle2.putInt("position", this.f15196e);
        bundle2.putInt("device_lamp_mode", intExtra);
        ((FavoriteSceneFragment) findFragmentById).mo36098G(bundle2);
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
    }
}
