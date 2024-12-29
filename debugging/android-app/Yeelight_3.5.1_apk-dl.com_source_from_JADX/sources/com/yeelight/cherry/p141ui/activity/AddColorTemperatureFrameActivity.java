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
import com.yeelight.yeelib.p142ui.view.ColorTemperatureSeekBarView;
import com.yeelight.yeelib.p142ui.view.CommonTitleBar;
import com.yeelight.yeelib.p142ui.view.DurationSelectionView;
import p051j4.C9193k;

/* renamed from: com.yeelight.cherry.ui.activity.AddColorTemperatureFrameActivity */
public class AddColorTemperatureFrameActivity extends BaseActivity {

    /* renamed from: a */
    private BrightnessSeekBarView2 f9827a;

    /* renamed from: b */
    private ColorTemperatureSeekBarView f9828b;

    /* renamed from: c */
    private DurationSelectionView f9829c;

    /* renamed from: d */
    boolean f9830d;

    /* renamed from: e */
    boolean f9831e;

    /* renamed from: f */
    int f9832f;

    /* renamed from: g */
    private CustomAdvancedFlowScene f9833g;

    /* renamed from: h */
    private Handler f9834h = new C5027c();

    /* renamed from: com.yeelight.cherry.ui.activity.AddColorTemperatureFrameActivity$a */
    class C5025a implements View.OnClickListener {
        C5025a() {
        }

        public void onClick(View view) {
            AddColorTemperatureFrameActivity.this.onBackPressed();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.AddColorTemperatureFrameActivity$b */
    class C5026b implements View.OnClickListener {
        C5026b() {
        }

        public void onClick(View view) {
            AddColorTemperatureFrameActivity.this.m15796W();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.AddColorTemperatureFrameActivity$c */
    class C5027c extends Handler {
        C5027c() {
        }

        public void handleMessage(Message message) {
            super.handleMessage(message);
            if (message.what == 0) {
                AddColorTemperatureFrameActivity addColorTemperatureFrameActivity = AddColorTemperatureFrameActivity.this;
                Toast.makeText(addColorTemperatureFrameActivity, addColorTemperatureFrameActivity.getText(2131756030), 0).show();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: W */
    public void m15796W() {
        if (this.f9829c.getCurrentValue() != 0) {
            if (this.f9830d) {
                this.f9833g.mo35436c().mo35338h().get(this.f9832f).mo35380h(this.f9828b.getCurrentValue());
                this.f9833g.mo35436c().mo35338h().get(this.f9832f).mo35378f(this.f9827a.getCurrentValue());
                this.f9833g.mo35436c().mo35338h().get(this.f9832f).mo35379g(this.f9829c.getCurrentValue());
            } else {
                this.f9833g.mo35436c().mo35334a(new C8319k(this.f9829c.getCurrentValue(), FlowItemMode.FLOW_MODE_CT, this.f9828b.getCurrentValue(), this.f9827a.getCurrentValue()));
            }
            finish();
            return;
        }
        this.f9834h.removeMessages(0);
        this.f9834h.sendEmptyMessageDelayed(0, 500);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo35653P();
        boolean z = true;
        C9193k.m22157h(true, this);
        setContentView(C12228R$layout.activity_add_color_temperature_frame);
        CommonTitleBar commonTitleBar = (CommonTitleBar) findViewById(2131297591);
        commonTitleBar.mo36195a(getText(2131756001).toString(), new C5025a(), new C5026b());
        commonTitleBar.setTitleTextSize(16);
        commonTitleBar.setRightTextColor(getResources().getColor(2131099805));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        commonTitleBar.setLayoutParams(layoutParams);
        layoutParams.setMargins(0, C9193k.m22154e(this), 0, 0);
        this.f9827a = (BrightnessSeekBarView2) findViewById(2131296433);
        this.f9828b = (ColorTemperatureSeekBarView) findViewById(C12225R$id.ct_bar);
        this.f9829c = (DurationSelectionView) findViewById(C12225R$id.duration_view);
        Intent intent = getIntent();
        int intExtra = intent.getIntExtra("custom_scene_index", -1);
        if (intExtra == -1) {
            z = false;
        }
        this.f9831e = z;
        this.f9833g = z ? C3112v.m8242u().mo23558i().get(intExtra) : C3112v.m8242u().mo23566r();
        this.f9830d = intent.getBooleanExtra("scene_edit", false);
        this.f9832f = intent.getIntExtra("scene_edit_index", 0);
        if (this.f9830d) {
            C8319k kVar = this.f9833g.mo35436c().mo35338h().get(this.f9832f);
            this.f9829c.mo36226b(kVar.mo35375c() / 60000, (kVar.mo35375c() % 60000) / 1000, (kVar.mo35375c() % 1000) / 100);
            this.f9828b.mo36182d(kVar.mo35377e());
            this.f9827a.mo36131b(kVar.mo35374b());
        }
    }
}
