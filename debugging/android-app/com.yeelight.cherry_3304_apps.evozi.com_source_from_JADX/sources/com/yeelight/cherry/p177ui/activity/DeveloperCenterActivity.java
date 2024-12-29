package com.yeelight.cherry.p177ui.activity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import com.yeelight.cherry.C11745R$id;
import com.yeelight.cherry.C11748R$layout;
import com.yeelight.yeelib.p194ui.activity.BaseActivity;
import com.yeelight.yeelib.p194ui.view.CommonTitleBar;
import com.yeelight.yeelib.p194ui.widget.C10526e;
import com.yeelight.yeelib.utils.C10547m;
import com.yeelight.yeelib.utils.C4308b;

/* renamed from: com.yeelight.cherry.ui.activity.DeveloperCenterActivity */
public class DeveloperCenterActivity extends BaseActivity {

    /* renamed from: b */
    Button f10765b;

    /* renamed from: c */
    Button f10766c;

    /* renamed from: d */
    Button f10767d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public Handler f10768e = new C5193a(this);

    /* renamed from: com.yeelight.cherry.ui.activity.DeveloperCenterActivity$a */
    class C5193a extends Handler {
        C5193a(DeveloperCenterActivity developerCenterActivity) {
        }

        public void handleMessage(Message message) {
            if (message.what == 1) {
                System.exit(0);
            }
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.DeveloperCenterActivity$b */
    class C5194b implements View.OnClickListener {
        C5194b() {
        }

        public void onClick(View view) {
            DeveloperCenterActivity.this.onBackPressed();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.DeveloperCenterActivity$c */
    class C5195c implements View.OnClickListener {

        /* renamed from: com.yeelight.cherry.ui.activity.DeveloperCenterActivity$c$a */
        class C5196a implements DialogInterface.OnClickListener {
            C5196a() {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
                C4308b.f7482a = false;
                C4308b.m12137p(false);
                DeveloperCenterActivity.this.f10768e.sendEmptyMessageDelayed(1, 2000);
            }
        }

        C5195c() {
        }

        public void onClick(View view) {
            C10526e.C10531e eVar = new C10526e.C10531e(DeveloperCenterActivity.this);
            eVar.mo33358i("Disable Dev Mode");
            eVar.mo33356g("APP will exit to disable dev mode.");
            eVar.mo33353d(-1, DeveloperCenterActivity.this.getString(2131755219), new C5196a());
            eVar.mo33359j();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.DeveloperCenterActivity$d */
    class C5197d implements View.OnClickListener {
        C5197d() {
        }

        public void onClick(View view) {
            DeveloperCenterActivity.this.startActivity(new Intent(DeveloperCenterActivity.this, ARCoreDemoActivity.class));
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.DeveloperCenterActivity$e */
    class C5198e implements View.OnClickListener {
        C5198e() {
        }

        public void onClick(View view) {
            DeveloperCenterActivity.this.startActivity(new Intent(DeveloperCenterActivity.this, AugmentedImagesDemoActivity.class));
        }
    }

    static {
        Class<DeveloperCenterActivity> cls = DeveloperCenterActivity.class;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo32193P();
        C10547m.m25758h(true, this);
        setContentView(C11748R$layout.activity_developer_center);
        CommonTitleBar commonTitleBar = (CommonTitleBar) findViewById(2131297424);
        commonTitleBar.mo32825a(getText(2131756268).toString(), new C5194b(), (View.OnClickListener) null);
        commonTitleBar.setTitleTextSize(16);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        commonTitleBar.setLayoutParams(layoutParams);
        layoutParams.setMargins(0, C10547m.m25755e(this), 0, 0);
        Button button = (Button) findViewById(C11745R$id.btn_exit_dev_mode);
        this.f10765b = button;
        button.setOnClickListener(new C5195c());
        Button button2 = (Button) findViewById(C11745R$id.btn_ar_core_demo);
        this.f10766c = button2;
        button2.setOnClickListener(new C5197d());
        Button button3 = (Button) findViewById(C11745R$id.btn_augmented_image_demo);
        this.f10767d = button3;
        button3.setOnClickListener(new C5198e());
        Button button4 = (Button) findViewById(C11745R$id.btn_log_upload);
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
    }
}
