package com.yeelight.yeelib_tasker.p143ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.yeelight.yeelib.device.C6081a;
import com.yeelight.yeelib.device.base.C3012e;
import com.yeelight.yeelib.device.base.C6094f;
import com.yeelight.yeelib.device.models.ProductModelBase;
import com.yeelight.yeelib.interaction.ActionType;
import com.yeelight.yeelib.managers.YeelightDeviceManager;
import com.yeelight.yeelib.p142ui.activity.SceneActionSelectActivity;
import com.yeelight.yeelib.p142ui.view.CommonTitleBar;
import com.yeelight.yeelib_tasker.R$id;
import com.yeelight.yeelib_tasker.R$layout;
import p051j4.C9193k;

/* renamed from: com.yeelight.yeelib_tasker.ui.TaskerActionActivity */
public class TaskerActionActivity extends AbstractPluginActivity {

    /* renamed from: b */
    CommonTitleBar f16354b;

    /* renamed from: c */
    LinearLayout f16355c;

    /* renamed from: d */
    LinearLayout f16356d;

    /* renamed from: e */
    LinearLayout f16357e;

    /* renamed from: f */
    LinearLayout f16358f;

    /* renamed from: g */
    LinearLayout f16359g;

    /* renamed from: h */
    LinearLayout f16360h;

    /* renamed from: i */
    TextView f16361i;

    /* renamed from: j */
    LinearLayout f16362j;

    /* renamed from: k */
    TextView f16363k;

    /* renamed from: l */
    LinearLayout f16364l;

    /* renamed from: m */
    TextView f16365m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public String f16366n = "";
    /* access modifiers changed from: private */

    /* renamed from: o */
    public int f16367o = 0;

    /* renamed from: com.yeelight.yeelib_tasker.ui.TaskerActionActivity$a */
    class C8904a implements View.OnClickListener {
        C8904a() {
        }

        public void onClick(View view) {
            TaskerActionActivity.this.onBackPressed();
        }
    }

    /* renamed from: com.yeelight.yeelib_tasker.ui.TaskerActionActivity$b */
    class C8905b implements View.OnClickListener {
        C8905b() {
        }

        public void onClick(View view) {
            Intent intent = new Intent();
            intent.putExtra("com.yeelight.cherry.device_action", ActionType.ON.ordinal());
            TaskerActionActivity.this.setResult(-1, intent);
            TaskerActionActivity.this.finish();
        }
    }

    /* renamed from: com.yeelight.yeelib_tasker.ui.TaskerActionActivity$c */
    class C8906c implements View.OnClickListener {
        C8906c() {
        }

        public void onClick(View view) {
            Intent intent = new Intent();
            intent.putExtra("com.yeelight.cherry.device_action", ActionType.OFF.ordinal());
            TaskerActionActivity.this.setResult(-1, intent);
            TaskerActionActivity.this.finish();
        }
    }

    /* renamed from: com.yeelight.yeelib_tasker.ui.TaskerActionActivity$d */
    class C8907d implements View.OnClickListener {
        C8907d() {
        }

        public void onClick(View view) {
            Intent intent = new Intent();
            intent.putExtra("com.yeelight.cherry.device_action", ActionType.TOGGLE.ordinal());
            TaskerActionActivity.this.setResult(-1, intent);
            TaskerActionActivity.this.finish();
        }
    }

    /* renamed from: com.yeelight.yeelib_tasker.ui.TaskerActionActivity$e */
    class C8908e implements View.OnClickListener {
        C8908e() {
        }

        public void onClick(View view) {
            Intent intent = new Intent(TaskerActionActivity.this, TaskerBrightActivity.class);
            if (TaskerActionActivity.this.f16367o != 0) {
                intent.putExtra("com.yeelight.cherry.device_bright", TaskerActionActivity.this.f16367o);
            }
            TaskerActionActivity.this.startActivityForResult(intent, 0);
        }
    }

    /* renamed from: com.yeelight.yeelib_tasker.ui.TaskerActionActivity$f */
    class C8909f implements View.OnClickListener {
        C8909f() {
        }

        public void onClick(View view) {
            Intent intent = new Intent();
            intent.putExtra("com.yeelight.cherry.device_action", ActionType.BRIGHT_VARIABLE.ordinal());
            TaskerActionActivity.this.setResult(-1, intent);
            TaskerActionActivity.this.finish();
        }
    }

    /* renamed from: com.yeelight.yeelib_tasker.ui.TaskerActionActivity$g */
    class C8910g implements View.OnClickListener {
        C8910g() {
        }

        public void onClick(View view) {
            Intent intent = new Intent();
            intent.putExtra("com.yeelight.cherry.device_action", ActionType.CT_VARIABLE.ordinal());
            TaskerActionActivity.this.setResult(-1, intent);
            TaskerActionActivity.this.finish();
        }
    }

    /* renamed from: com.yeelight.yeelib_tasker.ui.TaskerActionActivity$h */
    class C8911h implements View.OnClickListener {
        C8911h() {
        }

        public void onClick(View view) {
            Intent intent = new Intent();
            intent.putExtra("com.yeelight.cherry.device_action", ActionType.COLOR_VARIABLE.ordinal());
            TaskerActionActivity.this.setResult(-1, intent);
            TaskerActionActivity.this.finish();
        }
    }

    /* renamed from: com.yeelight.yeelib_tasker.ui.TaskerActionActivity$i */
    class C8912i implements View.OnClickListener {
        C8912i() {
        }

        public void onClick(View view) {
            Intent intent = new Intent();
            intent.putExtra("com.yeelight.cherry.device_id", TaskerActionActivity.this.f16366n);
            intent.putExtra("scene_schedule_select", true);
            intent.setClass(TaskerActionActivity.this, SceneActionSelectActivity.class);
            TaskerActionActivity.this.startActivityForResult(intent, 0);
        }
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        StringBuilder sb = new StringBuilder();
        sb.append("TaskerActionActivity on Activity result called!!! resultCode = ");
        sb.append(i2);
        Intent intent2 = new Intent();
        if (intent != null) {
            if (i == 0 && i2 == -1) {
                int intExtra = intent.getIntExtra("com.yeelight.cherry.device_bright", 50);
                StringBuilder sb2 = new StringBuilder();
                sb2.append("TaskerActionActivity, onActivityResult, bright: ");
                sb2.append(intExtra);
                intent2.putExtra("com.yeelight.cherry.device_action", ActionType.BRIGHT.ordinal());
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
                intent2.putExtra("com.yeelight.cherry.device_action", ActionType.SCENE.ordinal());
                intent2.putExtra("com.yeelight.cherry.device_id", this.f16366n);
            }
            setResult(-1, intent2);
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo35653P();
        C9193k.m22157h(true, this);
        setContentView(R$layout.activity_tasker_action_select);
        this.f16354b = (CommonTitleBar) findViewById(R$id.title_bar);
        this.f16355c = (LinearLayout) findViewById(R$id.layout_action_open);
        TextView textView = (TextView) findViewById(R$id.action_title_open);
        this.f16356d = (LinearLayout) findViewById(R$id.layout_action_close);
        TextView textView2 = (TextView) findViewById(R$id.action_title_close);
        this.f16357e = (LinearLayout) findViewById(R$id.layout_action_toggle);
        TextView textView3 = (TextView) findViewById(R$id.action_title_toggle);
        this.f16358f = (LinearLayout) findViewById(R$id.layout_action_bright);
        TextView textView4 = (TextView) findViewById(R$id.action_title_bright);
        this.f16359g = (LinearLayout) findViewById(R$id.layout_action_bright_variable);
        TextView textView5 = (TextView) findViewById(R$id.action_title_bright_variable);
        this.f16360h = (LinearLayout) findViewById(R$id.layout_action_ct_variable);
        this.f16361i = (TextView) findViewById(R$id.action_title_ct_variable);
        this.f16362j = (LinearLayout) findViewById(R$id.layout_action_color_variable);
        this.f16363k = (TextView) findViewById(R$id.action_title_color_variable);
        this.f16364l = (LinearLayout) findViewById(R$id.layout_action_scene);
        this.f16365m = (TextView) findViewById(R$id.action_title_scene);
        this.f16354b.mo36195a("Tasker", new C8904a(), (View.OnClickListener) null);
        this.f16354b.setTitleTextSize(16);
        this.f16366n = getIntent().getStringExtra("com.yeelight.cherry.device_id");
        this.f16367o = getIntent().getIntExtra("com.yeelight.cherry.device_bright", 0);
        this.f16355c.setOnClickListener(new C8905b());
        this.f16356d.setOnClickListener(new C8906c());
        this.f16357e.setOnClickListener(new C8907d());
        this.f16358f.setOnClickListener(new C8908e());
        this.f16359g.setOnClickListener(new C8909f());
        if (YeelightDeviceManager.m7794j0(this.f16366n) == null || !YeelightDeviceManager.m7794j0(this.f16366n).mo23188I().mo31881b(ProductModelBase.CapabilityType.CONTROL_CT_H)) {
            this.f16361i.setTextColor(-7829368);
        } else {
            this.f16360h.setOnClickListener(new C8910g());
        }
        if (YeelightDeviceManager.m7794j0(this.f16366n) == null || !YeelightDeviceManager.m7794j0(this.f16366n).mo23188I().mo31881b(ProductModelBase.CapabilityType.CONTROL_COLOR_H)) {
            this.f16363k.setTextColor(-7829368);
        } else {
            this.f16362j.setOnClickListener(new C8911h());
        }
        C3012e r0 = YeelightDeviceManager.m7804r0(this.f16366n);
        if ((r0 instanceof C6081a) || (r0 instanceof C6094f)) {
            this.f16365m.setTextColor(-7829368);
        } else {
            this.f16364l.setOnClickListener(new C8912i());
        }
    }
}
