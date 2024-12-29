package com.yeelight.cherry.p141ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;
import com.yeelight.cherry.C12225R$id;
import com.yeelight.cherry.C12228R$layout;
import com.yeelight.yeelib.models.C3112v;
import com.yeelight.yeelib.models.C8319k;
import com.yeelight.yeelib.models.CustomAdvancedFlowScene;
import com.yeelight.yeelib.models.FlowItemMode;
import com.yeelight.yeelib.p142ui.activity.BaseActivity;
import com.yeelight.yeelib.p142ui.view.BrightnessSeekBarView2;
import com.yeelight.yeelib.p142ui.view.CommonTitleBar;
import com.yeelight.yeelib.p142ui.view.DurationSelectionView;
import p051j4.C9193k;

/* renamed from: com.yeelight.cherry.ui.activity.AddBrightFrameActivity */
public class AddBrightFrameActivity extends BaseActivity {

    /* renamed from: a */
    private BrightnessSeekBarView2 f9807a;

    /* renamed from: b */
    private DurationSelectionView f9808b;

    /* renamed from: c */
    boolean f9809c;

    /* renamed from: d */
    boolean f9810d;

    /* renamed from: e */
    int f9811e;

    /* renamed from: f */
    private CustomAdvancedFlowScene f9812f;

    /* renamed from: g */
    private Handler f9813g = new C5021c();

    /* renamed from: com.yeelight.cherry.ui.activity.AddBrightFrameActivity$a */
    class C5019a implements View.OnClickListener {
        C5019a() {
        }

        public void onClick(View view) {
            AddBrightFrameActivity.this.onBackPressed();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.AddBrightFrameActivity$b */
    class C5020b implements View.OnClickListener {
        C5020b() {
        }

        public void onClick(View view) {
            AddBrightFrameActivity.this.m15791W();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.AddBrightFrameActivity$c */
    class C5021c extends Handler {
        C5021c() {
        }

        public void handleMessage(Message message) {
            super.handleMessage(message);
            if (message.what == 0) {
                AddBrightFrameActivity addBrightFrameActivity = AddBrightFrameActivity.this;
                Toast.makeText(addBrightFrameActivity, addBrightFrameActivity.getText(2131756030), 0).show();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: W */
    public void m15791W() {
        if (this.f9808b.getCurrentValue() != 0) {
            if (this.f9809c) {
                this.f9812f.mo35436c().mo35338h().get(this.f9811e).mo35378f(this.f9807a.getCurrentValue());
                this.f9812f.mo35436c().mo35338h().get(this.f9811e).mo35379g(this.f9808b.getCurrentValue());
            } else {
                this.f9812f.mo35436c().mo35334a(new C8319k(this.f9808b.getCurrentValue(), FlowItemMode.FLOW_MODE_BRIGHT, -1, this.f9807a.getCurrentValue()));
            }
            finish();
            return;
        }
        this.f9813g.removeMessages(0);
        this.f9813g.sendEmptyMessageDelayed(0, 500);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo35653P();
        boolean z = true;
        C9193k.m22157h(true, this);
        setContentView(C12228R$layout.activity_add_bright_frame);
        CommonTitleBar commonTitleBar = (CommonTitleBar) findViewById(2131297591);
        commonTitleBar.mo36195a(getText(2131755999).toString(), new C5019a(), new C5020b());
        commonTitleBar.setTitleTextSize(16);
        commonTitleBar.setRightTextColor(getResources().getColor(2131099805));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        commonTitleBar.setLayoutParams(layoutParams);
        layoutParams.setMargins(0, C9193k.m22154e(this), 0, 0);
        this.f9807a = (BrightnessSeekBarView2) findViewById(2131296433);
        this.f9808b = (DurationSelectionView) findViewById(C12225R$id.duration_view);
        Intent intent = getIntent();
        int intExtra = intent.getIntExtra("custom_scene_index", -1);
        if (intExtra == -1) {
            z = false;
        }
        this.f9810d = z;
        this.f9812f = z ? C3112v.m8242u().mo23558i().get(intExtra) : C3112v.m8242u().mo23566r();
        this.f9809c = intent.getBooleanExtra("scene_edit", false);
        this.f9811e = intent.getIntExtra("scene_edit_index", 0);
        if (this.f9809c) {
            C8319k kVar = this.f9812f.mo35436c().mo35338h().get(this.f9811e);
            this.f9808b.mo36226b(kVar.mo35375c() / 60000, (kVar.mo35375c() % 60000) / 1000, (kVar.mo35375c() % 1000) / 100);
            this.f9807a.mo36131b(kVar.mo35374b());
        }
    }
}
