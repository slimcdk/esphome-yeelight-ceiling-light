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
import com.yeelight.yeelib.p142ui.view.CommonTitleBar;
import com.yeelight.yeelib.p142ui.view.DurationSelectionView;
import p051j4.C9193k;

/* renamed from: com.yeelight.cherry.ui.activity.AddSuspendFrameActivity */
public class AddSuspendFrameActivity extends BaseActivity {

    /* renamed from: a */
    private DurationSelectionView f9880a;

    /* renamed from: b */
    boolean f9881b;

    /* renamed from: c */
    boolean f9882c;

    /* renamed from: d */
    int f9883d;

    /* renamed from: e */
    private CustomAdvancedFlowScene f9884e;

    /* renamed from: f */
    private Handler f9885f = new C5047c();

    /* renamed from: com.yeelight.cherry.ui.activity.AddSuspendFrameActivity$a */
    class C5045a implements View.OnClickListener {
        C5045a() {
        }

        public void onClick(View view) {
            AddSuspendFrameActivity.this.onBackPressed();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.AddSuspendFrameActivity$b */
    class C5046b implements View.OnClickListener {
        C5046b() {
        }

        public void onClick(View view) {
            AddSuspendFrameActivity.this.m15844W();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.AddSuspendFrameActivity$c */
    class C5047c extends Handler {
        C5047c() {
        }

        public void handleMessage(Message message) {
            super.handleMessage(message);
            if (message.what == 0) {
                AddSuspendFrameActivity addSuspendFrameActivity = AddSuspendFrameActivity.this;
                Toast.makeText(addSuspendFrameActivity, addSuspendFrameActivity.getText(2131756030), 0).show();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: W */
    public void m15844W() {
        if (this.f9880a.getCurrentValue() != 0) {
            if (this.f9881b) {
                this.f9884e.mo35436c().mo35338h().get(this.f9883d).mo35379g(this.f9880a.getCurrentValue());
            } else {
                this.f9884e.mo35436c().mo35334a(new C8319k(this.f9880a.getCurrentValue(), FlowItemMode.FLOW_MODE_SLEEP, 0, 0));
            }
            finish();
            return;
        }
        this.f9885f.removeMessages(0);
        this.f9885f.sendEmptyMessageDelayed(0, 500);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo35653P();
        boolean z = true;
        C9193k.m22157h(true, this);
        setContentView(C12228R$layout.activity_add_suspend_frame);
        CommonTitleBar commonTitleBar = (CommonTitleBar) findViewById(2131297591);
        commonTitleBar.mo36195a(getText(2131756002).toString(), new C5045a(), new C5046b());
        commonTitleBar.setTitleTextSize(16);
        commonTitleBar.setRightTextColor(getResources().getColor(2131099805));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        commonTitleBar.setLayoutParams(layoutParams);
        layoutParams.setMargins(0, C9193k.m22154e(this), 0, 0);
        DurationSelectionView durationSelectionView = (DurationSelectionView) findViewById(C12225R$id.duration_view);
        this.f9880a = durationSelectionView;
        durationSelectionView.setTitle(2131756005);
        Intent intent = getIntent();
        int intExtra = intent.getIntExtra("custom_scene_index", -1);
        if (intExtra == -1) {
            z = false;
        }
        this.f9882c = z;
        this.f9884e = z ? C3112v.m8242u().mo23558i().get(intExtra) : C3112v.m8242u().mo23566r();
        this.f9881b = intent.getBooleanExtra("scene_edit", false);
        this.f9883d = intent.getIntExtra("scene_edit_index", 0);
        if (this.f9881b) {
            C8319k kVar = this.f9884e.mo35436c().mo35338h().get(this.f9883d);
            this.f9880a.mo36226b(kVar.mo35375c() / 60000, (kVar.mo35375c() % 60000) / 1000, (kVar.mo35375c() % 1000) / 100);
        }
    }
}
