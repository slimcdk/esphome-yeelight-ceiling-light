package com.yeelight.yeelib.p142ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import com.yeelight.yeelib.R$id;
import com.yeelight.yeelib.R$layout;
import com.yeelight.yeelib.R$string;
import com.yeelight.yeelib.managers.YeelightDeviceManager;
import com.yeelight.yeelib.p142ui.view.CommonTitleBar;
import com.yeelight.yeelib.utils.AppUtils;
import p051j4.C9193k;
import p207s3.C10333b;

/* renamed from: com.yeelight.yeelib.ui.activity.RemoteControlActivity */
public class RemoteControlActivity extends BaseActivity {

    /* renamed from: k */
    private static final String f15097k = "RemoteControlActivity";
    /* access modifiers changed from: private */

    /* renamed from: a */
    public C10333b f15098a;

    /* renamed from: b */
    private ImageButton f15099b;

    /* renamed from: c */
    private ImageButton f15100c;

    /* renamed from: d */
    private ImageButton f15101d;

    /* renamed from: e */
    private ImageButton f15102e;

    /* renamed from: f */
    private ImageButton f15103f;

    /* renamed from: g */
    private ImageButton f15104g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public ImageView f15105h;

    /* renamed from: i */
    private CommonTitleBar f15106i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public Handler f15107j = new C8586e();

    /* renamed from: com.yeelight.yeelib.ui.activity.RemoteControlActivity$a */
    class C8582a implements View.OnClickListener {
        C8582a() {
        }

        public void onClick(View view) {
            RemoteControlActivity.this.f15107j.sendEmptyMessage(0);
            RemoteControlActivity.this.f15098a.mo41885f2(3);
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.RemoteControlActivity$b */
    class C8583b implements View.OnLongClickListener {
        C8583b() {
        }

        public boolean onLongClick(View view) {
            RemoteControlActivity.this.f15107j.sendEmptyMessage(0);
            RemoteControlActivity.this.f15098a.mo41885f2(131075);
            return true;
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.RemoteControlActivity$c */
    class C8584c implements View.OnClickListener {
        C8584c() {
        }

        public void onClick(View view) {
            RemoteControlActivity.this.f15107j.sendEmptyMessage(0);
            RemoteControlActivity.this.f15098a.mo41885f2(5);
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.RemoteControlActivity$d */
    class C8585d implements View.OnLongClickListener {
        C8585d() {
        }

        public boolean onLongClick(View view) {
            RemoteControlActivity.this.f15107j.sendEmptyMessage(0);
            RemoteControlActivity.this.f15098a.mo41885f2(131077);
            return true;
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.RemoteControlActivity$e */
    class C8586e extends Handler {

        /* renamed from: com.yeelight.yeelib.ui.activity.RemoteControlActivity$e$a */
        class C8587a implements Runnable {
            C8587a() {
            }

            public void run() {
                RemoteControlActivity.this.f15105h.setVisibility(0);
                RemoteControlActivity.this.f15107j.sendEmptyMessageDelayed(1, 300);
            }
        }

        /* renamed from: com.yeelight.yeelib.ui.activity.RemoteControlActivity$e$b */
        class C8588b implements Runnable {
            C8588b() {
            }

            public void run() {
                RemoteControlActivity.this.f15105h.setVisibility(4);
            }
        }

        C8586e() {
        }

        public void handleMessage(Message message) {
            RemoteControlActivity remoteControlActivity;
            Runnable runnable;
            super.handleMessage(message);
            int i = message.what;
            if (i == 0) {
                remoteControlActivity = RemoteControlActivity.this;
                runnable = new C8587a();
            } else if (i == 1) {
                remoteControlActivity = RemoteControlActivity.this;
                runnable = new C8588b();
            } else {
                return;
            }
            remoteControlActivity.runOnUiThread(runnable);
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.RemoteControlActivity$f */
    class C8589f implements View.OnClickListener {
        C8589f() {
        }

        public void onClick(View view) {
            RemoteControlActivity.this.onBackPressed();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.RemoteControlActivity$g */
    class C8590g implements View.OnClickListener {
        C8590g() {
        }

        public void onClick(View view) {
            RemoteControlActivity.this.f15107j.sendEmptyMessage(0);
            RemoteControlActivity.this.f15098a.mo41885f2(0);
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.RemoteControlActivity$h */
    class C8591h implements View.OnLongClickListener {
        C8591h() {
        }

        public boolean onLongClick(View view) {
            RemoteControlActivity.this.f15107j.sendEmptyMessage(0);
            RemoteControlActivity.this.f15098a.mo41885f2(131072);
            return true;
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.RemoteControlActivity$i */
    class C8592i implements View.OnClickListener {
        C8592i() {
        }

        public void onClick(View view) {
            RemoteControlActivity.this.f15107j.sendEmptyMessage(0);
            RemoteControlActivity.this.f15098a.mo41885f2(1);
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.RemoteControlActivity$j */
    class C8593j implements View.OnLongClickListener {
        C8593j() {
        }

        public boolean onLongClick(View view) {
            RemoteControlActivity.this.f15107j.sendEmptyMessage(0);
            RemoteControlActivity.this.f15098a.mo41885f2(131073);
            return true;
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.RemoteControlActivity$k */
    class C8594k implements View.OnClickListener {
        C8594k() {
        }

        public void onClick(View view) {
            RemoteControlActivity.this.f15107j.sendEmptyMessage(0);
            RemoteControlActivity.this.f15098a.mo41885f2(2);
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.RemoteControlActivity$l */
    class C8595l implements View.OnLongClickListener {
        C8595l() {
        }

        public boolean onLongClick(View view) {
            RemoteControlActivity.this.f15107j.sendEmptyMessage(0);
            RemoteControlActivity.this.f15098a.mo41885f2(131074);
            return true;
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.RemoteControlActivity$m */
    class C8596m implements View.OnClickListener {
        C8596m() {
        }

        public void onClick(View view) {
            RemoteControlActivity.this.f15107j.sendEmptyMessage(0);
            RemoteControlActivity.this.f15098a.mo41885f2(4);
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.RemoteControlActivity$n */
    class C8597n implements View.OnLongClickListener {
        C8597n() {
        }

        public boolean onLongClick(View view) {
            RemoteControlActivity.this.f15107j.sendEmptyMessage(0);
            RemoteControlActivity.this.f15098a.mo41885f2(131076);
            return true;
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo35653P();
        C9193k.m22157h(true, this);
        setContentView(R$layout.activity_remote_control);
        this.f15099b = (ImageButton) findViewById(R$id.remote_control_on);
        this.f15100c = (ImageButton) findViewById(R$id.remote_control_off);
        this.f15101d = (ImageButton) findViewById(R$id.remote_control_ct);
        this.f15102e = (ImageButton) findViewById(R$id.remote_control_mode);
        this.f15103f = (ImageButton) findViewById(R$id.remote_control_bright_increase);
        this.f15104g = (ImageButton) findViewById(R$id.remote_control_bright_decrease);
        ImageView imageView = (ImageView) findViewById(R$id.remote_control_light_indicator);
        this.f15105h = imageView;
        imageView.setVisibility(4);
        this.f15106i = (CommonTitleBar) findViewById(R$id.title_bar);
        Intent intent = getIntent();
        if (!intent.hasExtra("com.yeelight.cherry.device_id")) {
            AppUtils.m8302w(f15097k, "Activity has not device id", false);
            finish();
            return;
        }
        C10333b bVar = (C10333b) YeelightDeviceManager.m7794j0(intent.getStringExtra("com.yeelight.cherry.device_id"));
        this.f15098a = bVar;
        if (bVar == null) {
            finish();
            return;
        }
        this.f15106i.mo36195a(getString(R$string.feature_remote_management), new C8589f(), (View.OnClickListener) null);
        this.f15106i.setTitleTextSize(16);
        this.f15099b.setOnClickListener(new C8590g());
        this.f15099b.setOnLongClickListener(new C8591h());
        this.f15100c.setOnClickListener(new C8592i());
        this.f15100c.setOnLongClickListener(new C8593j());
        this.f15101d.setOnClickListener(new C8594k());
        this.f15101d.setOnLongClickListener(new C8595l());
        this.f15102e.setOnClickListener(new C8596m());
        this.f15102e.setOnLongClickListener(new C8597n());
        this.f15103f.setOnClickListener(new C8582a());
        this.f15103f.setOnLongClickListener(new C8583b());
        this.f15104g.setOnClickListener(new C8584c());
        this.f15104g.setOnLongClickListener(new C8585d());
    }

    public void onDestroy() {
        super.onDestroy();
    }

    public void onPause() {
        super.onPause();
    }

    public void onResume() {
        super.onResume();
    }
}
