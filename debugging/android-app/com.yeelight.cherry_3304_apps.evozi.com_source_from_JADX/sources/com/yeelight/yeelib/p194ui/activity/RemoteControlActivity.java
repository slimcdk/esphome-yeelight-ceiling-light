package com.yeelight.yeelib.p194ui.activity;

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
import com.yeelight.yeelib.p150c.p151i.C6029f;
import com.yeelight.yeelib.p152f.C4257w;
import com.yeelight.yeelib.p194ui.view.CommonTitleBar;
import com.yeelight.yeelib.utils.C10547m;
import com.yeelight.yeelib.utils.C4308b;

/* renamed from: com.yeelight.yeelib.ui.activity.RemoteControlActivity */
public class RemoteControlActivity extends BaseActivity {

    /* renamed from: l */
    private static final String f18789l = RemoteControlActivity.class.getSimpleName();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C6029f f18790b;

    /* renamed from: c */
    private ImageButton f18791c;

    /* renamed from: d */
    private ImageButton f18792d;

    /* renamed from: e */
    private ImageButton f18793e;

    /* renamed from: f */
    private ImageButton f18794f;

    /* renamed from: g */
    private ImageButton f18795g;

    /* renamed from: h */
    private ImageButton f18796h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public ImageView f18797i;

    /* renamed from: j */
    private CommonTitleBar f18798j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public Handler f18799k = new C10168e();

    /* renamed from: com.yeelight.yeelib.ui.activity.RemoteControlActivity$a */
    class C10164a implements View.OnClickListener {
        C10164a() {
        }

        public void onClick(View view) {
            RemoteControlActivity.this.f18799k.sendEmptyMessage(0);
            RemoteControlActivity.this.f18790b.mo27737f2(3);
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.RemoteControlActivity$b */
    class C10165b implements View.OnLongClickListener {
        C10165b() {
        }

        public boolean onLongClick(View view) {
            RemoteControlActivity.this.f18799k.sendEmptyMessage(0);
            RemoteControlActivity.this.f18790b.mo27737f2(131075);
            return true;
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.RemoteControlActivity$c */
    class C10166c implements View.OnClickListener {
        C10166c() {
        }

        public void onClick(View view) {
            RemoteControlActivity.this.f18799k.sendEmptyMessage(0);
            RemoteControlActivity.this.f18790b.mo27737f2(5);
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.RemoteControlActivity$d */
    class C10167d implements View.OnLongClickListener {
        C10167d() {
        }

        public boolean onLongClick(View view) {
            RemoteControlActivity.this.f18799k.sendEmptyMessage(0);
            RemoteControlActivity.this.f18790b.mo27737f2(131077);
            return true;
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.RemoteControlActivity$e */
    class C10168e extends Handler {

        /* renamed from: com.yeelight.yeelib.ui.activity.RemoteControlActivity$e$a */
        class C10169a implements Runnable {
            C10169a() {
            }

            public void run() {
                RemoteControlActivity.this.f18797i.setVisibility(0);
                RemoteControlActivity.this.f18799k.sendEmptyMessageDelayed(1, 300);
            }
        }

        /* renamed from: com.yeelight.yeelib.ui.activity.RemoteControlActivity$e$b */
        class C10170b implements Runnable {
            C10170b() {
            }

            public void run() {
                RemoteControlActivity.this.f18797i.setVisibility(4);
            }
        }

        C10168e() {
        }

        public void handleMessage(Message message) {
            RemoteControlActivity remoteControlActivity;
            Runnable runnable;
            super.handleMessage(message);
            int i = message.what;
            if (i == 0) {
                remoteControlActivity = RemoteControlActivity.this;
                runnable = new C10169a();
            } else if (i == 1) {
                remoteControlActivity = RemoteControlActivity.this;
                runnable = new C10170b();
            } else {
                return;
            }
            remoteControlActivity.runOnUiThread(runnable);
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.RemoteControlActivity$f */
    class C10171f implements View.OnClickListener {
        C10171f() {
        }

        public void onClick(View view) {
            RemoteControlActivity.this.onBackPressed();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.RemoteControlActivity$g */
    class C10172g implements View.OnClickListener {
        C10172g() {
        }

        public void onClick(View view) {
            RemoteControlActivity.this.f18799k.sendEmptyMessage(0);
            RemoteControlActivity.this.f18790b.mo27737f2(0);
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.RemoteControlActivity$h */
    class C10173h implements View.OnLongClickListener {
        C10173h() {
        }

        public boolean onLongClick(View view) {
            RemoteControlActivity.this.f18799k.sendEmptyMessage(0);
            RemoteControlActivity.this.f18790b.mo27737f2(131072);
            return true;
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.RemoteControlActivity$i */
    class C10174i implements View.OnClickListener {
        C10174i() {
        }

        public void onClick(View view) {
            RemoteControlActivity.this.f18799k.sendEmptyMessage(0);
            RemoteControlActivity.this.f18790b.mo27737f2(1);
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.RemoteControlActivity$j */
    class C10175j implements View.OnLongClickListener {
        C10175j() {
        }

        public boolean onLongClick(View view) {
            RemoteControlActivity.this.f18799k.sendEmptyMessage(0);
            RemoteControlActivity.this.f18790b.mo27737f2(131073);
            return true;
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.RemoteControlActivity$k */
    class C10176k implements View.OnClickListener {
        C10176k() {
        }

        public void onClick(View view) {
            RemoteControlActivity.this.f18799k.sendEmptyMessage(0);
            RemoteControlActivity.this.f18790b.mo27737f2(2);
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.RemoteControlActivity$l */
    class C10177l implements View.OnLongClickListener {
        C10177l() {
        }

        public boolean onLongClick(View view) {
            RemoteControlActivity.this.f18799k.sendEmptyMessage(0);
            RemoteControlActivity.this.f18790b.mo27737f2(131074);
            return true;
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.RemoteControlActivity$m */
    class C10178m implements View.OnClickListener {
        C10178m() {
        }

        public void onClick(View view) {
            RemoteControlActivity.this.f18799k.sendEmptyMessage(0);
            RemoteControlActivity.this.f18790b.mo27737f2(4);
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.RemoteControlActivity$n */
    class C10179n implements View.OnLongClickListener {
        C10179n() {
        }

        public boolean onLongClick(View view) {
            RemoteControlActivity.this.f18799k.sendEmptyMessage(0);
            RemoteControlActivity.this.f18790b.mo27737f2(131076);
            return true;
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo32193P();
        C10547m.m25758h(true, this);
        setContentView(R$layout.activity_remote_control);
        this.f18791c = (ImageButton) findViewById(R$id.remote_control_on);
        this.f18792d = (ImageButton) findViewById(R$id.remote_control_off);
        this.f18793e = (ImageButton) findViewById(R$id.remote_control_ct);
        this.f18794f = (ImageButton) findViewById(R$id.remote_control_mode);
        this.f18795g = (ImageButton) findViewById(R$id.remote_control_bright_increase);
        this.f18796h = (ImageButton) findViewById(R$id.remote_control_bright_decrease);
        ImageView imageView = (ImageView) findViewById(R$id.remote_control_light_indicator);
        this.f18797i = imageView;
        imageView.setVisibility(4);
        this.f18798j = (CommonTitleBar) findViewById(R$id.title_bar);
        Intent intent = getIntent();
        if (!intent.hasExtra("com.yeelight.cherry.device_id")) {
            C4308b.m12141t(f18789l, "Activity has not device id", false);
            finish();
            return;
        }
        C6029f fVar = (C6029f) C4257w.m11945h0(intent.getStringExtra("com.yeelight.cherry.device_id"));
        this.f18790b = fVar;
        if (fVar == null) {
            finish();
            return;
        }
        this.f18798j.mo32825a(getString(R$string.feature_remote_management), new C10171f(), (View.OnClickListener) null);
        this.f18798j.setTitleTextSize(16);
        this.f18791c.setOnClickListener(new C10172g());
        this.f18791c.setOnLongClickListener(new C10173h());
        this.f18792d.setOnClickListener(new C10174i());
        this.f18792d.setOnLongClickListener(new C10175j());
        this.f18793e.setOnClickListener(new C10176k());
        this.f18793e.setOnLongClickListener(new C10177l());
        this.f18794f.setOnClickListener(new C10178m());
        this.f18794f.setOnLongClickListener(new C10179n());
        this.f18795g.setOnClickListener(new C10164a());
        this.f18795g.setOnLongClickListener(new C10165b());
        this.f18796h.setOnClickListener(new C10166c());
        this.f18796h.setOnLongClickListener(new C10167d());
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
