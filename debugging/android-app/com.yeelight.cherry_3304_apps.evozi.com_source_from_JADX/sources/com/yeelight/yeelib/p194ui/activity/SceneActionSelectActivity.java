package com.yeelight.yeelib.p194ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.yeelight.yeelib.R$anim;
import com.yeelight.yeelib.R$id;
import com.yeelight.yeelib.R$layout;
import com.yeelight.yeelib.p194ui.widget.C10521d;
import com.yeelight.yeelib.utils.C4308b;

/* renamed from: com.yeelight.yeelib.ui.activity.SceneActionSelectActivity */
public class SceneActionSelectActivity extends BaseActivity {

    /* renamed from: l */
    private static final String f18866l = SceneActionSelectActivity.class.getSimpleName();

    /* renamed from: b */
    private LinearLayout f18867b;

    /* renamed from: c */
    private LinearLayout f18868c;

    /* renamed from: d */
    private LinearLayout f18869d;

    /* renamed from: e */
    private LinearLayout f18870e;

    /* renamed from: f */
    private LinearLayout f18871f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public String f18872g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public int f18873h;

    /* renamed from: i */
    private boolean f18874i;

    /* renamed from: j */
    private boolean f18875j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public C10521d f18876k;

    /* renamed from: com.yeelight.yeelib.ui.activity.SceneActionSelectActivity$a */
    class C10203a implements View.OnClickListener {
        C10203a() {
        }

        public void onClick(View view) {
            Intent intent = new Intent();
            intent.putExtra("com.yeelight.cherry.device_id", SceneActionSelectActivity.this.f18872g);
            intent.putExtra("position", SceneActionSelectActivity.this.f18873h);
            SceneActionSelectActivity.this.setResult(1004, intent);
            SceneActionSelectActivity.this.finish();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.SceneActionSelectActivity$b */
    class C10204b implements View.OnClickListener {
        C10204b() {
        }

        public void onClick(View view) {
            Intent intent = new Intent();
            intent.putExtra("com.yeelight.cherry.device_id", SceneActionSelectActivity.this.f18872g);
            intent.putExtra("position", SceneActionSelectActivity.this.f18873h);
            SceneActionSelectActivity.this.setResult(1001, intent);
            SceneActionSelectActivity.this.finish();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.SceneActionSelectActivity$c */
    class C10205c implements View.OnClickListener {
        C10205c() {
        }

        public void onClick(View view) {
            Intent intent = new Intent();
            intent.putExtra("com.yeelight.cherry.device_id", SceneActionSelectActivity.this.f18872g);
            intent.putExtra("position", SceneActionSelectActivity.this.f18873h);
            SceneActionSelectActivity.this.setResult(1000, intent);
            SceneActionSelectActivity.this.finish();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.SceneActionSelectActivity$d */
    class C10206d implements View.OnClickListener {
        C10206d() {
        }

        public void onClick(View view) {
            Intent intent = new Intent();
            intent.putExtra("com.yeelight.cherry.device_id", SceneActionSelectActivity.this.f18872g);
            intent.setClass(SceneActionSelectActivity.this, LightAdjustViewActivity.class);
            SceneActionSelectActivity.this.startActivityForResult(intent, 100);
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.SceneActionSelectActivity$e */
    class C10207e implements View.OnClickListener {
        C10207e() {
        }

        public void onClick(View view) {
            Intent intent = new Intent();
            intent.putExtra("com.yeelight.cherry.device_id", SceneActionSelectActivity.this.f18872g);
            intent.setClass(SceneActionSelectActivity.this, LightSceneSelectViewActivity.class);
            SceneActionSelectActivity.this.startActivityForResult(intent, 101);
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.SceneActionSelectActivity$f */
    class C10208f implements View.OnClickListener {
        C10208f() {
        }

        public void onClick(View view) {
            SceneActionSelectActivity.this.f18876k.dismiss();
            SceneActionSelectActivity.this.finish();
        }
    }

    public void finish() {
        super.finish();
        overridePendingTransition(0, R$anim.device_prompt_finish_anim);
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        int i3;
        Intent intent2 = new Intent();
        if (i2 == 0) {
            finish();
        } else if (intent != null) {
            if (i == 100) {
                intent2.putExtra("light_adjust_mode", intent.getIntExtra("light_adjust_mode", -1));
                intent2.putExtra("light_adjust_bright", intent.getIntExtra("light_adjust_bright", -1));
                intent2.putExtra("light_adjust_color", intent.getIntExtra("light_adjust_color", -1));
                intent2.putExtra("light_adjust_ct", intent.getIntExtra("light_adjust_ct", -1));
                intent2.putExtra("light_adjust_json", intent.getStringExtra("light_adjust_json"));
                intent2.putExtra("com.yeelight.cherry.device_id", this.f18872g);
                intent2.putExtra("position", this.f18873h);
                i3 = 1002;
            } else if (i == 101) {
                intent2.putExtra("scene_select_mode", intent.getIntExtra("scene_select_mode", -1));
                intent2.putExtra("scene_select_position", intent.getIntExtra("scene_select_position", -1));
                intent2.putExtra("com.yeelight.cherry.device_id", this.f18872g);
                intent2.putExtra("position", this.f18873h);
                i3 = 1003;
            } else {
                return;
            }
            setResult(i3, intent2);
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo32193P();
        setContentView(R$layout.activity_scene_select_layout);
        Intent intent = getIntent();
        if (!intent.hasExtra("com.yeelight.cherry.device_id")) {
            C4308b.m12141t(f18866l, "Activity has no device id", false);
            finish();
            return;
        }
        this.f18872g = intent.getStringExtra("com.yeelight.cherry.device_id");
        this.f18873h = intent.getIntExtra("position", -1);
        this.f18874i = intent.getBooleanExtra("scene_schedule_select", false);
        this.f18875j = intent.getBooleanExtra("recommend_template_enable", false);
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        C10521d dVar = this.f18876k;
        if (dVar != null && dVar.isShowing()) {
            this.f18876k.dismiss();
        }
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        if (this.f18876k == null) {
            View inflate = View.inflate(this, R$layout.scene_item_type_select_layout_new, (ViewGroup) null);
            this.f18876k = new C10521d.C10523b(this).mo33316a();
            this.f18867b = (LinearLayout) inflate.findViewById(R$id.power_off);
            this.f18868c = (LinearLayout) inflate.findViewById(R$id.power_on);
            this.f18869d = (LinearLayout) inflate.findViewById(R$id.power_on_and_adjust);
            this.f18870e = (LinearLayout) inflate.findViewById(R$id.power_on_and_apply);
            this.f18871f = (LinearLayout) inflate.findViewById(R$id.use_recommend_template);
            TextView textView = (TextView) inflate.findViewById(R$id.cancel_button);
            if (this.f18874i) {
                this.f18867b.setVisibility(8);
                this.f18868c.setVisibility(8);
            }
            if (this.f18875j) {
                this.f18871f.setVisibility(0);
                this.f18871f.setOnClickListener(new C10203a());
            } else {
                this.f18871f.setVisibility(8);
            }
            this.f18867b.setOnClickListener(new C10204b());
            this.f18868c.setOnClickListener(new C10205c());
            this.f18869d.setOnClickListener(new C10206d());
            this.f18870e.setOnClickListener(new C10207e());
            textView.setOnClickListener(new C10208f());
            this.f18876k.mo33309e(inflate);
            this.f18876k.setCanceledOnTouchOutside(false);
        }
        this.f18876k.show();
    }
}
