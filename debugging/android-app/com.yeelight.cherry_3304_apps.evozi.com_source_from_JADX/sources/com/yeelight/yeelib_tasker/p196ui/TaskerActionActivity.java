package com.yeelight.yeelib_tasker.p196ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.yeelight.yeelib.device.models.C7628j;
import com.yeelight.yeelib.p150c.C5972a;
import com.yeelight.yeelib.p150c.p151i.C4200i;
import com.yeelight.yeelib.p150c.p151i.C6039j;
import com.yeelight.yeelib.p152f.C4257w;
import com.yeelight.yeelib.p185d.C7563a;
import com.yeelight.yeelib.p194ui.activity.SceneActionSelectActivity;
import com.yeelight.yeelib.p194ui.view.CommonTitleBar;
import com.yeelight.yeelib.utils.C10547m;
import com.yeelight.yeelib_tasker.R$id;
import com.yeelight.yeelib_tasker.R$layout;

/* renamed from: com.yeelight.yeelib_tasker.ui.TaskerActionActivity */
public class TaskerActionActivity extends AbstractPluginActivity {

    /* renamed from: q */
    public static final String f20209q = TaskerActionActivity.class.getSimpleName();

    /* renamed from: c */
    CommonTitleBar f20210c;

    /* renamed from: d */
    LinearLayout f20211d;

    /* renamed from: e */
    LinearLayout f20212e;

    /* renamed from: f */
    LinearLayout f20213f;

    /* renamed from: g */
    LinearLayout f20214g;

    /* renamed from: h */
    LinearLayout f20215h;

    /* renamed from: i */
    LinearLayout f20216i;

    /* renamed from: j */
    TextView f20217j;

    /* renamed from: k */
    LinearLayout f20218k;

    /* renamed from: l */
    TextView f20219l;

    /* renamed from: m */
    LinearLayout f20220m;

    /* renamed from: n */
    TextView f20221n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public String f20222o = "";
    /* access modifiers changed from: private */

    /* renamed from: p */
    public int f20223p = 0;

    /* renamed from: com.yeelight.yeelib_tasker.ui.TaskerActionActivity$a */
    class C10576a implements View.OnClickListener {
        C10576a() {
        }

        public void onClick(View view) {
            TaskerActionActivity.this.onBackPressed();
        }
    }

    /* renamed from: com.yeelight.yeelib_tasker.ui.TaskerActionActivity$b */
    class C10577b implements View.OnClickListener {
        C10577b() {
        }

        public void onClick(View view) {
            Intent intent = new Intent();
            intent.putExtra("com.yeelight.cherry.device_action", C7563a.ON.ordinal());
            TaskerActionActivity.this.setResult(-1, intent);
            TaskerActionActivity.this.finish();
        }
    }

    /* renamed from: com.yeelight.yeelib_tasker.ui.TaskerActionActivity$c */
    class C10578c implements View.OnClickListener {
        C10578c() {
        }

        public void onClick(View view) {
            Intent intent = new Intent();
            intent.putExtra("com.yeelight.cherry.device_action", C7563a.OFF.ordinal());
            TaskerActionActivity.this.setResult(-1, intent);
            TaskerActionActivity.this.finish();
        }
    }

    /* renamed from: com.yeelight.yeelib_tasker.ui.TaskerActionActivity$d */
    class C10579d implements View.OnClickListener {
        C10579d() {
        }

        public void onClick(View view) {
            Intent intent = new Intent();
            intent.putExtra("com.yeelight.cherry.device_action", C7563a.TOGGLE.ordinal());
            TaskerActionActivity.this.setResult(-1, intent);
            TaskerActionActivity.this.finish();
        }
    }

    /* renamed from: com.yeelight.yeelib_tasker.ui.TaskerActionActivity$e */
    class C10580e implements View.OnClickListener {
        C10580e() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(TaskerActionActivity.this, TaskerBrightActivity.class);
            if (TaskerActionActivity.this.f20223p != 0) {
                intent.putExtra("com.yeelight.cherry.device_bright", TaskerActionActivity.this.f20223p);
            }
            TaskerActionActivity.this.startActivityForResult(intent, 0);
        }
    }

    /* renamed from: com.yeelight.yeelib_tasker.ui.TaskerActionActivity$f */
    class C10581f implements View.OnClickListener {
        C10581f() {
        }

        public void onClick(View view) {
            Intent intent = new Intent();
            intent.putExtra("com.yeelight.cherry.device_action", C7563a.BRIGHT_VARIABLE.ordinal());
            TaskerActionActivity.this.setResult(-1, intent);
            TaskerActionActivity.this.finish();
        }
    }

    /* renamed from: com.yeelight.yeelib_tasker.ui.TaskerActionActivity$g */
    class C10582g implements View.OnClickListener {
        C10582g() {
        }

        public void onClick(View view) {
            Intent intent = new Intent();
            intent.putExtra("com.yeelight.cherry.device_action", C7563a.CT_VARIABLE.ordinal());
            TaskerActionActivity.this.setResult(-1, intent);
            TaskerActionActivity.this.finish();
        }
    }

    /* renamed from: com.yeelight.yeelib_tasker.ui.TaskerActionActivity$h */
    class C10583h implements View.OnClickListener {
        C10583h() {
        }

        public void onClick(View view) {
            Intent intent = new Intent();
            intent.putExtra("com.yeelight.cherry.device_action", C7563a.COLOR_VARIABLE.ordinal());
            TaskerActionActivity.this.setResult(-1, intent);
            TaskerActionActivity.this.finish();
        }
    }

    /* renamed from: com.yeelight.yeelib_tasker.ui.TaskerActionActivity$i */
    class C10584i implements View.OnClickListener {
        C10584i() {
        }

        public void onClick(View view) {
            Intent intent = new Intent();
            intent.putExtra("com.yeelight.cherry.device_id", TaskerActionActivity.this.f20222o);
            intent.putExtra("scene_schedule_select", true);
            intent.setClass(TaskerActionActivity.this, SceneActionSelectActivity.class);
            TaskerActionActivity.this.startActivityForResult(intent, 0);
        }
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        "TaskerActionActivity on Activity result called!!! resultCode = " + i2;
        Intent intent2 = new Intent();
        if (intent != null) {
            if (i == 0 && i2 == -1) {
                int intExtra = intent.getIntExtra("com.yeelight.cherry.device_bright", 50);
                "TaskerActionActivity, onActivityResult, bright: " + intExtra;
                intent2.putExtra("com.yeelight.cherry.device_action", C7563a.BRIGHT.ordinal());
                intent2.putExtra("com.yeelight.cherry.device_bright", intExtra);
            } else {
                int i3 = 1002;
                if (i2 != 1002) {
                    i3 = 1003;
                    if (i2 == 1003) {
                        intent2.putExtra("scene_select_mode", intent.getIntExtra("scene_select_mode", -1));
                        intent2.putExtra("scene_select_position", intent.getIntExtra("scene_select_position", -1));
                    } else {
                        return;
                    }
                } else {
                    intent2.putExtra("light_adjust_mode", intent.getIntExtra("light_adjust_mode", -1));
                    intent2.putExtra("light_adjust_bright", intent.getIntExtra("light_adjust_bright", -1));
                    intent2.putExtra("light_adjust_color", intent.getIntExtra("light_adjust_color", -1));
                    intent2.putExtra("light_adjust_ct", intent.getIntExtra("light_adjust_ct", -1));
                    intent2.putExtra("light_adjust_json", intent.getStringExtra("light_adjust_json"));
                }
                intent2.putExtra("scene_type", i3);
                intent2.putExtra("com.yeelight.cherry.device_action", C7563a.SCENE.ordinal());
                intent2.putExtra("com.yeelight.cherry.device_id", this.f20222o);
            }
            setResult(-1, intent2);
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo32193P();
        C10547m.m25758h(true, this);
        setContentView(R$layout.activity_tasker_action_select);
        this.f20210c = (CommonTitleBar) findViewById(R$id.title_bar);
        this.f20211d = (LinearLayout) findViewById(R$id.layout_action_open);
        TextView textView = (TextView) findViewById(R$id.action_title_open);
        this.f20212e = (LinearLayout) findViewById(R$id.layout_action_close);
        TextView textView2 = (TextView) findViewById(R$id.action_title_close);
        this.f20213f = (LinearLayout) findViewById(R$id.layout_action_toggle);
        TextView textView3 = (TextView) findViewById(R$id.action_title_toggle);
        this.f20214g = (LinearLayout) findViewById(R$id.layout_action_bright);
        TextView textView4 = (TextView) findViewById(R$id.action_title_bright);
        this.f20215h = (LinearLayout) findViewById(R$id.layout_action_bright_variable);
        TextView textView5 = (TextView) findViewById(R$id.action_title_bright_variable);
        this.f20216i = (LinearLayout) findViewById(R$id.layout_action_ct_variable);
        this.f20217j = (TextView) findViewById(R$id.action_title_ct_variable);
        this.f20218k = (LinearLayout) findViewById(R$id.layout_action_color_variable);
        this.f20219l = (TextView) findViewById(R$id.action_title_color_variable);
        this.f20220m = (LinearLayout) findViewById(R$id.layout_action_scene);
        this.f20221n = (TextView) findViewById(R$id.action_title_scene);
        this.f20210c.mo32825a("Tasker", new C10576a(), (View.OnClickListener) null);
        this.f20210c.setTitleTextSize(16);
        this.f20222o = getIntent().getStringExtra("com.yeelight.cherry.device_id");
        this.f20223p = getIntent().getIntExtra("com.yeelight.cherry.device_bright", 0);
        this.f20211d.setOnClickListener(new C10577b());
        this.f20212e.setOnClickListener(new C10578c());
        this.f20213f.setOnClickListener(new C10579d());
        this.f20214g.setOnClickListener(new C10580e());
        this.f20215h.setOnClickListener(new C10581f());
        if (C4257w.m11945h0(this.f20222o) == null || !C4257w.m11945h0(this.f20222o).mo23375I().mo29076b(C7628j.C7630b.CONTROL_CT_H)) {
            this.f20217j.setTextColor(-7829368);
        } else {
            this.f20216i.setOnClickListener(new C10582g());
        }
        if (C4257w.m11945h0(this.f20222o) == null || !C4257w.m11945h0(this.f20222o).mo23375I().mo29076b(C7628j.C7630b.CONTROL_COLOR_H)) {
            this.f20219l.setTextColor(-7829368);
        } else {
            this.f20218k.setOnClickListener(new C10583h());
        }
        C4200i o0 = C4257w.m11953o0(this.f20222o);
        if ((o0 instanceof C5972a) || (o0 instanceof C6039j)) {
            this.f20221n.setTextColor(-7829368);
        } else {
            this.f20220m.setOnClickListener(new C10584i());
        }
    }
}
