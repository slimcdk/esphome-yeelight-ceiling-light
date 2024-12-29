package com.yeelight.cherry.p141ui.activity;

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
import com.yeelight.cherry.C12225R$id;
import com.yeelight.cherry.C12228R$layout;
import com.yeelight.yeelib.managers.C3051a;
import com.yeelight.yeelib.managers.C3076j;
import com.yeelight.yeelib.managers.C3108x;
import com.yeelight.yeelib.models.C8320l;
import com.yeelight.yeelib.p142ui.activity.BaseActivity;
import com.yeelight.yeelib.p142ui.activity.YeelightWebviewActivity;
import com.yeelight.yeelib.utils.AppUtils;

/* renamed from: com.yeelight.cherry.ui.activity.LauncherActivity */
public class LauncherActivity extends BaseActivity {

    /* renamed from: f */
    public static final /* synthetic */ int f10581f = 0;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public TextView f10582a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public int f10583b;

    /* renamed from: c */
    private ImageView f10584c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public boolean f10585d = false;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public Handler f10586e = new C5345c();

    /* renamed from: com.yeelight.cherry.ui.activity.LauncherActivity$a */
    class C5343a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C8320l f10587a;

        C5343a(C8320l lVar) {
            this.f10587a = lVar;
        }

        public void onClick(View view) {
            boolean unused = LauncherActivity.this.f10585d = true;
            LauncherActivity.this.f10586e.removeMessages(1);
            LauncherActivity.this.f10586e.removeMessages(0);
            C3076j.m8062j(this.f10587a.mo35385d());
            Intent intent = new Intent(LauncherActivity.this, YeelightWebviewActivity.class);
            intent.putExtra("url_index", 15);
            intent.putExtra("host_url", this.f10587a.mo35383b());
            LauncherActivity.this.startActivity(intent);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.LauncherActivity$b */
    class C5344b implements View.OnClickListener {
        C5344b() {
        }

        public void onClick(View view) {
            LauncherActivity.this.f10586e.removeMessages(1);
            LauncherActivity.this.f10586e.sendEmptyMessage(0);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.LauncherActivity$c */
    class C5345c extends Handler {
        C5345c() {
        }

        public void handleMessage(Message message) {
            super.handleMessage(message);
            int i = message.what;
            if (i == 0) {
                LauncherActivity.this.m16383b0();
            } else if (i == 1) {
                if (LauncherActivity.this.f10583b > 0) {
                    LauncherActivity.this.f10582a.setText(String.format(" %d " + LauncherActivity.this.getString(2131755171), new Object[]{Integer.valueOf(LauncherActivity.this.f10583b)}));
                    LauncherActivity.m16381Z(LauncherActivity.this);
                    sendEmptyMessageDelayed(1, 1000);
                    return;
                }
                LauncherActivity.this.f10582a.setText(LauncherActivity.this.getString(2131755171));
                sendEmptyMessage(0);
            }
        }
    }

    /* renamed from: Z */
    static /* synthetic */ int m16381Z(LauncherActivity launcherActivity) {
        int i = launcherActivity.f10583b;
        launcherActivity.f10583b = i - 1;
        return i;
    }

    /* access modifiers changed from: private */
    /* renamed from: b0 */
    public void m16383b0() {
        startActivity((AppUtils.m8290k() || !C3051a.m7928z()) ? new Intent(this, WelcomeGuideNewActivity.class) : new Intent(this, MainActivity.class));
        overridePendingTransition(0, 0);
        finish();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        AppUtils.f4982f = 1;
        mo35653P();
        super.onCreate(bundle);
        setContentView(C12228R$layout.activity_launcher);
        if ((getIntent().getFlags() & 4194304) != 0) {
            finish();
            return;
        }
        this.f10582a = (TextView) findViewById(C12225R$id.splash_activity_skip_button);
        this.f10584c = (ImageView) findViewById(C12225R$id.splash_view);
        C8320l b = C3076j.m8061e(this).mo23443b();
        if (b == null || !b.mo35392k()) {
            this.f10582a.setVisibility(8);
            this.f10586e.sendEmptyMessageDelayed(0, 3000);
            return;
        }
        C3076j.m8063k(b.mo35385d());
        this.f10584c.setBackground(new BitmapDrawable(getResources(), BitmapFactory.decodeFile(C3108x.f4951e.getExternalFilesDir((String) null).getAbsolutePath() + "/launch/" + b.mo35385d() + MiotCloudImpl.COOKIE_PATH + "pic.png")));
        if (b.mo35393l()) {
            this.f10584c.setClickable(true);
            this.f10584c.setOnClickListener(new C5343a(b));
        }
        this.f10583b = b.mo35389h();
        this.f10586e.sendEmptyMessage(1);
        this.f10582a.setVisibility(0);
        this.f10582a.setOnClickListener(new C5344b());
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        if (this.f10585d) {
            this.f10586e.sendEmptyMessage(0);
        }
    }
}
