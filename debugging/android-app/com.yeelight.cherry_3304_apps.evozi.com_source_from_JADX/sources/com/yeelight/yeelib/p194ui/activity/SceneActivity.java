package com.yeelight.yeelib.p194ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.yeelight.yeelib.R$id;
import com.yeelight.yeelib.R$layout;
import com.yeelight.yeelib.R$string;
import com.yeelight.yeelib.p150c.p151i.C4200i;
import com.yeelight.yeelib.p152f.C4257w;
import com.yeelight.yeelib.p194ui.fragment.FavoriteSceneFragment;
import com.yeelight.yeelib.p194ui.view.CommonTitleBar;
import com.yeelight.yeelib.utils.C10547m;
import com.yeelight.yeelib.utils.C4308b;

/* renamed from: com.yeelight.yeelib.ui.activity.SceneActivity */
public class SceneActivity extends BaseActivity {

    /* renamed from: g */
    private static final String f18883g = SceneActivity.class.getSimpleName();

    /* renamed from: b */
    CommonTitleBar f18884b;

    /* renamed from: c */
    private String f18885c;

    /* renamed from: d */
    private boolean f18886d = false;

    /* renamed from: e */
    private C4200i f18887e;

    /* renamed from: f */
    private int f18888f = -1;

    /* renamed from: com.yeelight.yeelib.ui.activity.SceneActivity$a */
    class C10209a implements View.OnClickListener {
        C10209a() {
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
            C4308b.m12141t(f18883g, "Activity has not device id", false);
            finish();
            return;
        }
        String stringExtra = intent.getStringExtra("com.yeelight.cherry.device_id");
        this.f18885c = stringExtra;
        C4200i o0 = C4257w.m11953o0(stringExtra);
        this.f18887e = o0;
        if (o0 == null) {
            BaseActivity.m24384U(this);
            finish();
            return;
        }
        this.f18886d = intent.getBooleanExtra("start_for_result", false);
        this.f18888f = intent.getIntExtra("position", -1);
        int intExtra = intent.getIntExtra("device_lamp_mode", -1);
        mo32193P();
        C10547m.m25758h(true, this);
        setContentView(R$layout.activity_scene);
        CommonTitleBar commonTitleBar = (CommonTitleBar) findViewById(R$id.title_bar);
        this.f18884b = commonTitleBar;
        commonTitleBar.mo32825a(getString(R$string.common_text_favorite), new C10209a(), (View.OnClickListener) null);
        this.f18884b.setTitleTextSize(16);
        Fragment findFragmentById = getSupportFragmentManager().findFragmentById(R$id.favorite_fragment);
        Bundle bundle2 = new Bundle();
        bundle2.putString("com.yeelight.cherry.device_id", this.f18885c);
        bundle2.putBoolean("start_for_result", this.f18886d);
        bundle2.putInt("position", this.f18888f);
        bundle2.putInt("device_lamp_mode", intExtra);
        ((FavoriteSceneFragment) findFragmentById).mo32720A(bundle2);
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
