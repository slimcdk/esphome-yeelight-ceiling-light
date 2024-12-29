package com.yeelight.yeelib_tasker.p143ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.yeelight.yeelib.p142ui.view.CommonTitleBar;
import com.yeelight.yeelib_tasker.R$id;
import com.yeelight.yeelib_tasker.R$layout;
import p051j4.C9193k;

/* renamed from: com.yeelight.yeelib_tasker.ui.TaskerBrightActivity */
public class TaskerBrightActivity extends AbstractPluginActivity {

    /* renamed from: b */
    CommonTitleBar f16377b;

    /* renamed from: c */
    TextView f16378c;

    /* renamed from: d */
    ImageView f16379d;

    /* renamed from: e */
    ImageView f16380e;

    /* renamed from: f */
    ProgressBar f16381f;

    /* renamed from: g */
    int f16382g = 50;

    /* renamed from: com.yeelight.yeelib_tasker.ui.TaskerBrightActivity$a */
    class C8913a implements View.OnClickListener {
        C8913a() {
        }

        public void onClick(View view) {
            TaskerBrightActivity.this.onBackPressed();
        }
    }

    /* renamed from: com.yeelight.yeelib_tasker.ui.TaskerBrightActivity$b */
    class C8914b implements View.OnClickListener {
        C8914b() {
        }

        public void onClick(View view) {
            TaskerBrightActivity taskerBrightActivity = TaskerBrightActivity.this;
            int i = taskerBrightActivity.f16382g - 5;
            taskerBrightActivity.f16382g = i;
            if (i < 5) {
                taskerBrightActivity.f16382g = 5;
            }
            TextView textView = taskerBrightActivity.f16378c;
            textView.setText(String.valueOf(TaskerBrightActivity.this.f16382g) + "%");
            TaskerBrightActivity taskerBrightActivity2 = TaskerBrightActivity.this;
            taskerBrightActivity2.f16381f.setProgress(taskerBrightActivity2.f16382g);
        }
    }

    /* renamed from: com.yeelight.yeelib_tasker.ui.TaskerBrightActivity$c */
    class C8915c implements View.OnClickListener {
        C8915c() {
        }

        public void onClick(View view) {
            TaskerBrightActivity taskerBrightActivity = TaskerBrightActivity.this;
            int i = taskerBrightActivity.f16382g + 5;
            taskerBrightActivity.f16382g = i;
            if (i > 100) {
                taskerBrightActivity.f16382g = 100;
            }
            TextView textView = taskerBrightActivity.f16378c;
            textView.setText(String.valueOf(TaskerBrightActivity.this.f16382g) + "%");
            TaskerBrightActivity taskerBrightActivity2 = TaskerBrightActivity.this;
            taskerBrightActivity2.f16381f.setProgress(taskerBrightActivity2.f16382g);
        }
    }

    public void onBackPressed() {
        Intent intent = new Intent();
        intent.putExtra("com.yeelight.cherry.device_bright", this.f16382g);
        setResult(-1, intent);
        super.onBackPressed();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo35653P();
        C9193k.m22157h(true, this);
        setContentView(R$layout.activity_tasker_bright_edit);
        this.f16377b = (CommonTitleBar) findViewById(R$id.title_bar);
        this.f16378c = (TextView) findViewById(R$id.bright_content);
        this.f16379d = (ImageView) findViewById(R$id.bright_minus);
        this.f16380e = (ImageView) findViewById(R$id.bright_plus);
        this.f16381f = (ProgressBar) findViewById(R$id.bright_progress);
        this.f16377b.mo36195a("Tasker", new C8913a(), (View.OnClickListener) null);
        this.f16377b.setTitleTextSize(16);
        this.f16382g = getIntent().getIntExtra("com.yeelight.cherry.device_bright", 50);
        TextView textView = this.f16378c;
        textView.setText(String.valueOf(this.f16382g) + "%");
        this.f16381f.setProgress(this.f16382g);
        this.f16379d.setOnClickListener(new C8914b());
        this.f16380e.setOnClickListener(new C8915c());
    }
}
