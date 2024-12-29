package com.yeelight.yeelib_tasker.p196ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.yeelight.yeelib.p194ui.view.CommonTitleBar;
import com.yeelight.yeelib.utils.C10547m;
import com.yeelight.yeelib_tasker.R$id;
import com.yeelight.yeelib_tasker.R$layout;

/* renamed from: com.yeelight.yeelib_tasker.ui.TaskerBrightActivity */
public class TaskerBrightActivity extends AbstractPluginActivity {

    /* renamed from: c */
    CommonTitleBar f20233c;

    /* renamed from: d */
    TextView f20234d;

    /* renamed from: e */
    ImageView f20235e;

    /* renamed from: f */
    ImageView f20236f;

    /* renamed from: g */
    ProgressBar f20237g;

    /* renamed from: h */
    int f20238h = 50;

    /* renamed from: com.yeelight.yeelib_tasker.ui.TaskerBrightActivity$a */
    class C10585a implements View.OnClickListener {
        C10585a() {
        }

        public void onClick(View view) {
            TaskerBrightActivity.this.onBackPressed();
        }
    }

    /* renamed from: com.yeelight.yeelib_tasker.ui.TaskerBrightActivity$b */
    class C10586b implements View.OnClickListener {
        C10586b() {
        }

        public void onClick(View view) {
            TaskerBrightActivity taskerBrightActivity = TaskerBrightActivity.this;
            int i = taskerBrightActivity.f20238h - 5;
            taskerBrightActivity.f20238h = i;
            if (i < 5) {
                taskerBrightActivity.f20238h = 5;
            }
            TextView textView = TaskerBrightActivity.this.f20234d;
            textView.setText(String.valueOf(TaskerBrightActivity.this.f20238h) + "%");
            TaskerBrightActivity taskerBrightActivity2 = TaskerBrightActivity.this;
            taskerBrightActivity2.f20237g.setProgress(taskerBrightActivity2.f20238h);
        }
    }

    /* renamed from: com.yeelight.yeelib_tasker.ui.TaskerBrightActivity$c */
    class C10587c implements View.OnClickListener {
        C10587c() {
        }

        public void onClick(View view) {
            TaskerBrightActivity taskerBrightActivity = TaskerBrightActivity.this;
            int i = taskerBrightActivity.f20238h + 5;
            taskerBrightActivity.f20238h = i;
            if (i > 100) {
                taskerBrightActivity.f20238h = 100;
            }
            TextView textView = TaskerBrightActivity.this.f20234d;
            textView.setText(String.valueOf(TaskerBrightActivity.this.f20238h) + "%");
            TaskerBrightActivity taskerBrightActivity2 = TaskerBrightActivity.this;
            taskerBrightActivity2.f20237g.setProgress(taskerBrightActivity2.f20238h);
        }
    }

    static {
        Class<TaskerBrightActivity> cls = TaskerBrightActivity.class;
    }

    public void onBackPressed() {
        Intent intent = new Intent();
        intent.putExtra("com.yeelight.cherry.device_bright", this.f20238h);
        setResult(-1, intent);
        super.onBackPressed();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo32193P();
        C10547m.m25758h(true, this);
        setContentView(R$layout.activity_tasker_bright_edit);
        this.f20233c = (CommonTitleBar) findViewById(R$id.title_bar);
        this.f20234d = (TextView) findViewById(R$id.bright_content);
        this.f20235e = (ImageView) findViewById(R$id.bright_minus);
        this.f20236f = (ImageView) findViewById(R$id.bright_plus);
        this.f20237g = (ProgressBar) findViewById(R$id.bright_progress);
        this.f20233c.mo32825a("Tasker", new C10585a(), (View.OnClickListener) null);
        this.f20233c.setTitleTextSize(16);
        this.f20238h = getIntent().getIntExtra("com.yeelight.cherry.device_bright", 50);
        TextView textView = this.f20234d;
        textView.setText(String.valueOf(this.f20238h) + "%");
        this.f20237g.setProgress(this.f20238h);
        this.f20235e.setOnClickListener(new C10586b());
        this.f20236f.setOnClickListener(new C10587c());
    }
}
