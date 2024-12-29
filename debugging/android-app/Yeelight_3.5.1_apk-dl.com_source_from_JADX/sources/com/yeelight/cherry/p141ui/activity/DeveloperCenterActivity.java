package com.yeelight.cherry.p141ui.activity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import com.yeelight.cherry.C12225R$id;
import com.yeelight.cherry.C12228R$layout;
import com.yeelight.yeelib.p142ui.activity.BaseActivity;
import com.yeelight.yeelib.p142ui.view.CommonTitleBar;
import com.yeelight.yeelib.utils.AppUtils;
import p051j4.C3283v;
import p051j4.C9193k;
import p170i4.C9113d;

/* renamed from: com.yeelight.cherry.ui.activity.DeveloperCenterActivity */
public class DeveloperCenterActivity extends BaseActivity {

    /* renamed from: a */
    Button f10320a;

    /* renamed from: b */
    Button f10321b;

    /* renamed from: c */
    Button f10322c;

    /* renamed from: d */
    RadioGroup f10323d;

    /* renamed from: e */
    RadioButton f10324e;

    /* renamed from: f */
    RadioButton f10325f;

    /* renamed from: g */
    RadioButton f10326g;

    /* renamed from: h */
    RadioButton f10327h;

    /* renamed from: i */
    RadioButton f10328i;

    /* renamed from: j */
    CheckBox f10329j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public Handler f10330k = new C5240a(this);

    /* renamed from: com.yeelight.cherry.ui.activity.DeveloperCenterActivity$a */
    class C5240a extends Handler {
        C5240a(DeveloperCenterActivity developerCenterActivity) {
        }

        public void handleMessage(Message message) {
            if (message.what == 1) {
                System.exit(0);
            }
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.DeveloperCenterActivity$b */
    class C5241b implements View.OnClickListener {
        C5241b() {
        }

        public void onClick(View view) {
            DeveloperCenterActivity.this.onBackPressed();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.DeveloperCenterActivity$c */
    class C5242c implements View.OnClickListener {

        /* renamed from: com.yeelight.cherry.ui.activity.DeveloperCenterActivity$c$a */
        class C5243a implements DialogInterface.OnClickListener {
            C5243a() {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
                AppUtils.f4977a = false;
                AppUtils.m8297r(false);
                DeveloperCenterActivity.this.f10330k.sendEmptyMessageDelayed(1, 2000);
            }
        }

        C5242c() {
        }

        public void onClick(View view) {
            C9113d.C9118e eVar = new C9113d.C9118e(DeveloperCenterActivity.this);
            eVar.mo37179i("Disable Dev Mode").mo37177g("APP will exit to disable dev mode.").mo37174d(-1, DeveloperCenterActivity.this.getString(2131755222), new C5243a());
            eVar.mo37180j();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.DeveloperCenterActivity$d */
    class C5244d implements View.OnClickListener {
        C5244d() {
        }

        public void onClick(View view) {
            DeveloperCenterActivity.this.startActivity(new Intent(DeveloperCenterActivity.this, ARCoreDemoActivity.class));
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.DeveloperCenterActivity$e */
    class C5245e implements View.OnClickListener {
        C5245e() {
        }

        public void onClick(View view) {
            DeveloperCenterActivity.this.startActivity(new Intent(DeveloperCenterActivity.this, AugmentedImagesDemoActivity.class));
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.DeveloperCenterActivity$f */
    class C5246f implements RadioGroup.OnCheckedChangeListener {
        C5246f(DeveloperCenterActivity developerCenterActivity) {
        }

        public void onCheckedChanged(RadioGroup radioGroup, int i) {
            int i2;
            switch (i) {
                case C12225R$id.rb_dev:
                    i2 = 1;
                    break;
                case C12225R$id.rb_pro:
                    i2 = 0;
                    break;
                case C12225R$id.rb_pro2:
                    i2 = 3;
                    break;
                case C12225R$id.rb_stage:
                    i2 = 4;
                    break;
                case C12225R$id.rb_test:
                    i2 = 2;
                    break;
                default:
                    AppUtils.m8304y();
            }
            C3283v.m8845k("APP_ENVIRONMENT", i2);
            AppUtils.f4983g = i2;
            AppUtils.m8304y();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.DeveloperCenterActivity$g */
    class C5247g implements CompoundButton.OnCheckedChangeListener {
        C5247g(DeveloperCenterActivity developerCenterActivity) {
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            AppUtils.m8299t(z);
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo35653P();
        C9193k.m22157h(true, this);
        setContentView(C12228R$layout.activity_developer_center);
        CommonTitleBar commonTitleBar = (CommonTitleBar) findViewById(2131297591);
        commonTitleBar.mo36195a(getText(2131756297).toString(), new C5241b(), (View.OnClickListener) null);
        commonTitleBar.setTitleTextSize(16);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        commonTitleBar.setLayoutParams(layoutParams);
        layoutParams.setMargins(0, C9193k.m22154e(this), 0, 0);
        this.f10320a = (Button) findViewById(C12225R$id.btn_exit_dev_mode);
        this.f10323d = (RadioGroup) findViewById(C12225R$id.rg_mode);
        this.f10324e = (RadioButton) findViewById(C12225R$id.rb_pro);
        this.f10325f = (RadioButton) findViewById(C12225R$id.rb_pro2);
        this.f10326g = (RadioButton) findViewById(C12225R$id.rb_test);
        this.f10327h = (RadioButton) findViewById(C12225R$id.rb_dev);
        this.f10328i = (RadioButton) findViewById(C12225R$id.rb_stage);
        this.f10329j = (CheckBox) findViewById(C12225R$id.cb_crash_force_enable);
        this.f10320a.setOnClickListener(new C5242c());
        Button button = (Button) findViewById(C12225R$id.btn_ar_core_demo);
        this.f10321b = button;
        button.setOnClickListener(new C5244d());
        Button button2 = (Button) findViewById(C12225R$id.btn_augmented_image_demo);
        this.f10322c = button2;
        button2.setOnClickListener(new C5245e());
        int c = C3283v.m8837c("APP_ENVIRONMENT", 0);
        (c != 1 ? c != 2 ? c != 3 ? c != 4 ? this.f10324e : this.f10328i : this.f10325f : this.f10326g : this.f10327h).setChecked(true);
        this.f10323d.setOnCheckedChangeListener(new C5246f(this));
        this.f10329j.setChecked(AppUtils.f4978b);
        this.f10329j.setOnCheckedChangeListener(new C5247g(this));
        Button button3 = (Button) findViewById(C12225R$id.btn_log_upload);
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
    }
}
