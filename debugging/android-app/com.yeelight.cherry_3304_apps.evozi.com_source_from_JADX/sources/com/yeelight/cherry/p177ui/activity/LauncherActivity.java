package com.yeelight.cherry.p177ui.activity;

import android.content.Intent;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.miot.service.common.miotcloud.impl.MiotCloudImpl;
import com.yeelight.cherry.C11745R$id;
import com.yeelight.cherry.C11748R$layout;
import com.yeelight.yeelib.p152f.C4201a;
import com.yeelight.yeelib.p152f.C4226i;
import com.yeelight.yeelib.p152f.C4297y;
import com.yeelight.yeelib.p153g.C9846o;
import com.yeelight.yeelib.p194ui.activity.BaseActivity;
import com.yeelight.yeelib.p194ui.activity.YeelightWebviewActivity;
import com.yeelight.yeelib.utils.C4308b;

/* renamed from: com.yeelight.cherry.ui.activity.LauncherActivity */
public class LauncherActivity extends BaseActivity {
    /* access modifiers changed from: private */

    /* renamed from: b */
    public TextView f11014b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public int f11015c;

    /* renamed from: d */
    private ImageView f11016d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public boolean f11017e = false;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public Handler f11018f = new C5297c();

    /* renamed from: com.yeelight.cherry.ui.activity.LauncherActivity$a */
    class C5295a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C9846o f11019a;

        C5295a(C9846o oVar) {
            this.f11019a = oVar;
        }

        public void onClick(View view) {
            boolean unused = LauncherActivity.this.f11017e = true;
            LauncherActivity.this.f11018f.removeMessages(1);
            LauncherActivity.this.f11018f.removeMessages(0);
            C4226i.m11745j(this.f11019a.mo31798d());
            Intent intent = new Intent(LauncherActivity.this, YeelightWebviewActivity.class);
            intent.putExtra("url_index", 15);
            intent.putExtra("host_url", this.f11019a.mo31796b());
            LauncherActivity.this.startActivity(intent);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.LauncherActivity$b */
    class C5296b implements View.OnClickListener {
        C5296b() {
        }

        public void onClick(View view) {
            LauncherActivity.this.f11018f.removeMessages(1);
            LauncherActivity.this.f11018f.sendEmptyMessage(0);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.LauncherActivity$c */
    class C5297c extends Handler {
        C5297c() {
        }

        public void handleMessage(Message message) {
            super.handleMessage(message);
            int i = message.what;
            if (i == 0) {
                LauncherActivity.this.m16444b0();
            } else if (i == 1) {
                if (LauncherActivity.this.f11015c > 0) {
                    LauncherActivity.this.f11014b.setText(String.format(" %d " + LauncherActivity.this.getString(2131755170), new Object[]{Integer.valueOf(LauncherActivity.this.f11015c)}));
                    LauncherActivity.m16442Z(LauncherActivity.this);
                    sendEmptyMessageDelayed(1, 1000);
                    return;
                }
                LauncherActivity.this.f11014b.setText(LauncherActivity.this.getString(2131755170));
                sendEmptyMessage(0);
            }
        }
    }

    /* renamed from: Z */
    static /* synthetic */ int m16442Z(LauncherActivity launcherActivity) {
        int i = launcherActivity.f11015c;
        launcherActivity.f11015c = i - 1;
        return i;
    }

    /* access modifiers changed from: private */
    /* renamed from: b0 */
    public void m16444b0() {
        startActivity((C4308b.m12131j() || !C4201a.m11610z()) ? new Intent(this, WelcomeGuideNewActivity.class) : new Intent(this, MainActivity.class));
        overridePendingTransition(0, 0);
        finish();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        C4308b.f7486e = 1;
        mo32193P();
        super.onCreate(bundle);
        setContentView(C11748R$layout.activity_launcher);
        if ((getIntent().getFlags() & 4194304) != 0) {
            finish();
            return;
        }
        this.f11014b = (TextView) findViewById(C11745R$id.splash_activity_skip_button);
        this.f11016d = (ImageView) findViewById(C11745R$id.splash_view);
        C9846o b = C4226i.m11744e(this).mo23544b();
        if (b == null || !b.mo31805k()) {
            this.f11014b.setVisibility(8);
            this.f11018f.sendEmptyMessageDelayed(0, 3000);
            return;
        }
        C4226i.m11746k(b.mo31798d());
        this.f11016d.setBackground(new BitmapDrawable(getResources(), BitmapFactory.decodeFile(C4297y.f7456e.getExternalFilesDir((String) null).getAbsolutePath() + "/launch/" + b.mo31798d() + MiotCloudImpl.COOKIE_PATH + "pic.png")));
        if (b.mo31806l()) {
            this.f11016d.setClickable(true);
            this.f11016d.setOnClickListener(new C5295a(b));
        }
        this.f11015c = b.mo31802h();
        this.f11018f.sendEmptyMessage(1);
        this.f11014b.setVisibility(0);
        this.f11014b.setOnClickListener(new C5296b());
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        if (this.f11017e) {
            this.f11018f.sendEmptyMessage(0);
        }
    }
}
