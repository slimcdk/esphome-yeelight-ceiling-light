package com.yeelight.yeelib.p142ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.yeelight.yeelib.R$anim;
import com.yeelight.yeelib.R$id;
import com.yeelight.yeelib.R$layout;
import com.yeelight.yeelib.p142ui.widget.C8891a;
import com.yeelight.yeelib.utils.AppUtils;

/* renamed from: com.yeelight.yeelib.ui.activity.SceneActionSelectActivity */
public class SceneActionSelectActivity extends BaseActivity {

    /* renamed from: k */
    private static final String f15174k = "SceneActionSelectActivity";

    /* renamed from: a */
    private LinearLayout f15175a;

    /* renamed from: b */
    private LinearLayout f15176b;

    /* renamed from: c */
    private LinearLayout f15177c;

    /* renamed from: d */
    private LinearLayout f15178d;

    /* renamed from: e */
    private LinearLayout f15179e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public String f15180f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public int f15181g;

    /* renamed from: h */
    private boolean f15182h;

    /* renamed from: i */
    private boolean f15183i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public C8891a f15184j;

    /* renamed from: com.yeelight.yeelib.ui.activity.SceneActionSelectActivity$a */
    class C8621a implements View.OnClickListener {
        C8621a() {
        }

        public void onClick(View view) {
            Intent intent = new Intent();
            intent.putExtra("com.yeelight.cherry.device_id", SceneActionSelectActivity.this.f15180f);
            intent.putExtra("position", SceneActionSelectActivity.this.f15181g);
            SceneActionSelectActivity.this.setResult(1004, intent);
            SceneActionSelectActivity.this.finish();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.SceneActionSelectActivity$b */
    class C8622b implements View.OnClickListener {
        C8622b() {
        }

        public void onClick(View view) {
            Intent intent = new Intent();
            intent.putExtra("com.yeelight.cherry.device_id", SceneActionSelectActivity.this.f15180f);
            intent.putExtra("position", SceneActionSelectActivity.this.f15181g);
            SceneActionSelectActivity.this.setResult(1001, intent);
            SceneActionSelectActivity.this.finish();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.SceneActionSelectActivity$c */
    class C8623c implements View.OnClickListener {
        C8623c() {
        }

        public void onClick(View view) {
            Intent intent = new Intent();
            intent.putExtra("com.yeelight.cherry.device_id", SceneActionSelectActivity.this.f15180f);
            intent.putExtra("position", SceneActionSelectActivity.this.f15181g);
            SceneActionSelectActivity.this.setResult(1000, intent);
            SceneActionSelectActivity.this.finish();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.SceneActionSelectActivity$d */
    class C8624d implements View.OnClickListener {
        C8624d() {
        }

        public void onClick(View view) {
            Intent intent = new Intent();
            intent.putExtra("com.yeelight.cherry.device_id", SceneActionSelectActivity.this.f15180f);
            intent.setClass(SceneActionSelectActivity.this, LightAdjustViewActivity.class);
            SceneActionSelectActivity.this.startActivityForResult(intent, 100);
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.SceneActionSelectActivity$e */
    class C8625e implements View.OnClickListener {
        C8625e() {
        }

        public void onClick(View view) {
            Intent intent = new Intent();
            intent.putExtra("com.yeelight.cherry.device_id", SceneActionSelectActivity.this.f15180f);
            intent.setClass(SceneActionSelectActivity.this, LightSceneSelectViewActivity.class);
            SceneActionSelectActivity.this.startActivityForResult(intent, 101);
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.SceneActionSelectActivity$f */
    class C8626f implements View.OnClickListener {
        C8626f() {
        }

        public void onClick(View view) {
            SceneActionSelectActivity.this.f15184j.dismiss();
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
                intent2.putExtra("com.yeelight.cherry.device_id", this.f15180f);
                intent2.putExtra("position", this.f15181g);
                i3 = 1002;
            } else if (i == 101) {
                intent2.putExtra("scene_select_mode", intent.getIntExtra("scene_select_mode", -1));
                intent2.putExtra("scene_select_position", intent.getIntExtra("scene_select_position", -1));
                intent2.putExtra("com.yeelight.cherry.device_id", this.f15180f);
                intent2.putExtra("position", this.f15181g);
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
        mo35653P();
        setContentView(R$layout.activity_scene_select_layout);
        Intent intent = getIntent();
        if (!intent.hasExtra("com.yeelight.cherry.device_id")) {
            AppUtils.m8302w(f15174k, "Activity has no device id", false);
            finish();
            return;
        }
        this.f15180f = intent.getStringExtra("com.yeelight.cherry.device_id");
        this.f15181g = intent.getIntExtra("position", -1);
        this.f15182h = intent.getBooleanExtra("scene_schedule_select", false);
        this.f15183i = intent.getBooleanExtra("recommend_template_enable", false);
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        C8891a aVar = this.f15184j;
        if (aVar != null && aVar.isShowing()) {
            this.f15184j.dismiss();
        }
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        if (this.f15184j == null) {
            View inflate = View.inflate(this, R$layout.scene_item_type_select_layout_new, (ViewGroup) null);
            this.f15184j = new C8891a.C8893b(this).mo36655a();
            this.f15175a = (LinearLayout) inflate.findViewById(R$id.power_off);
            this.f15176b = (LinearLayout) inflate.findViewById(R$id.power_on);
            this.f15177c = (LinearLayout) inflate.findViewById(R$id.power_on_and_adjust);
            this.f15178d = (LinearLayout) inflate.findViewById(R$id.power_on_and_apply);
            this.f15179e = (LinearLayout) inflate.findViewById(R$id.use_recommend_template);
            TextView textView = (TextView) inflate.findViewById(R$id.cancel_button);
            if (this.f15182h) {
                this.f15175a.setVisibility(8);
                this.f15176b.setVisibility(8);
            }
            if (this.f15183i) {
                this.f15179e.setVisibility(0);
                this.f15179e.setOnClickListener(new C8621a());
            } else {
                this.f15179e.setVisibility(8);
            }
            this.f15175a.setOnClickListener(new C8622b());
            this.f15176b.setOnClickListener(new C8623c());
            this.f15177c.setOnClickListener(new C8624d());
            this.f15178d.setOnClickListener(new C8625e());
            textView.setOnClickListener(new C8626f());
            this.f15184j.mo36648e(inflate);
            this.f15184j.setCanceledOnTouchOutside(false);
        }
        this.f15184j.show();
    }
}
