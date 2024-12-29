package com.yeelight.cherry.p177ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;
import com.yeelight.cherry.C11745R$id;
import com.yeelight.cherry.C11748R$layout;
import com.yeelight.yeelib.p153g.C4300b0;
import com.yeelight.yeelib.p153g.C9838i;
import com.yeelight.yeelib.p153g.C9844m;
import com.yeelight.yeelib.p153g.C9845n;
import com.yeelight.yeelib.p194ui.activity.BaseActivity;
import com.yeelight.yeelib.p194ui.view.BrightnessSeekBarView2;
import com.yeelight.yeelib.p194ui.view.ColorTemperatureSeekBarView;
import com.yeelight.yeelib.p194ui.view.CommonTitleBar;
import com.yeelight.yeelib.p194ui.view.DurationSelectionView;
import com.yeelight.yeelib.utils.C10547m;

/* renamed from: com.yeelight.cherry.ui.activity.AddColorTemperatureFrameActivity */
public class AddColorTemperatureFrameActivity extends BaseActivity {

    /* renamed from: b */
    private BrightnessSeekBarView2 f10283b;

    /* renamed from: c */
    private ColorTemperatureSeekBarView f10284c;

    /* renamed from: d */
    private DurationSelectionView f10285d;

    /* renamed from: e */
    boolean f10286e;

    /* renamed from: f */
    boolean f10287f;

    /* renamed from: g */
    int f10288g;

    /* renamed from: h */
    private C9838i f10289h;

    /* renamed from: i */
    private Handler f10290i = new C4982c();

    /* renamed from: com.yeelight.cherry.ui.activity.AddColorTemperatureFrameActivity$a */
    class C4980a implements View.OnClickListener {
        C4980a() {
        }

        public void onClick(View view) {
            AddColorTemperatureFrameActivity.this.onBackPressed();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.AddColorTemperatureFrameActivity$b */
    class C4981b implements View.OnClickListener {
        C4981b() {
        }

        public void onClick(View view) {
            AddColorTemperatureFrameActivity.this.m15942W();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.AddColorTemperatureFrameActivity$c */
    class C4982c extends Handler {
        C4982c() {
        }

        public void handleMessage(Message message) {
            super.handleMessage(message);
            if (message.what == 0) {
                AddColorTemperatureFrameActivity addColorTemperatureFrameActivity = AddColorTemperatureFrameActivity.this;
                Toast.makeText(addColorTemperatureFrameActivity, addColorTemperatureFrameActivity.getText(2131756018), 0).show();
            }
        }
    }

    static {
        Class<AddColorFrameActivity> cls = AddColorFrameActivity.class;
    }

    /* access modifiers changed from: private */
    /* renamed from: W */
    public void m15942W() {
        if (this.f10285d.getCurrentValue() != 0) {
            if (this.f10286e) {
                this.f10289h.mo31871c().mo31723h().get(this.f10288g).mo31793h(this.f10284c.getCurrentValue());
                this.f10289h.mo31871c().mo31723h().get(this.f10288g).mo31791f(this.f10283b.getCurrentValue());
                this.f10289h.mo31871c().mo31723h().get(this.f10288g).mo31792g(this.f10285d.getCurrentValue());
            } else {
                this.f10289h.mo31871c().mo31719a(new C9844m(this.f10285d.getCurrentValue(), C9845n.FLOW_MODE_CT, this.f10284c.getCurrentValue(), this.f10283b.getCurrentValue()));
            }
            finish();
            return;
        }
        this.f10290i.removeMessages(0);
        this.f10290i.sendEmptyMessageDelayed(0, 500);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo32193P();
        boolean z = true;
        C10547m.m25758h(true, this);
        setContentView(C11748R$layout.activity_add_color_temperature_frame);
        CommonTitleBar commonTitleBar = (CommonTitleBar) findViewById(2131297424);
        commonTitleBar.mo32825a(getText(2131755989).toString(), new C4980a(), new C4981b());
        commonTitleBar.setTitleTextSize(16);
        commonTitleBar.setRightTextColor(getResources().getColor(2131099802));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        commonTitleBar.setLayoutParams(layoutParams);
        layoutParams.setMargins(0, C10547m.m25755e(this), 0, 0);
        this.f10283b = (BrightnessSeekBarView2) findViewById(2131296375);
        this.f10284c = (ColorTemperatureSeekBarView) findViewById(C11745R$id.ct_bar);
        this.f10285d = (DurationSelectionView) findViewById(C11745R$id.duration_view);
        Intent intent = getIntent();
        int intExtra = intent.getIntExtra("custom_scene_index", -1);
        if (intExtra == -1) {
            z = false;
        }
        this.f10287f = z;
        this.f10289h = z ? C4300b0.m12083u().mo23745i().get(intExtra) : C4300b0.m12083u().mo23753r();
        this.f10286e = intent.getBooleanExtra("scene_edit", false);
        this.f10288g = intent.getIntExtra("scene_edit_index", 0);
        if (this.f10286e) {
            C9844m mVar = this.f10289h.mo31871c().mo31723h().get(this.f10288g);
            this.f10285d.mo32856b(mVar.mo31788c() / 60000, (mVar.mo31788c() % 60000) / 1000, (mVar.mo31788c() % 1000) / 100);
            this.f10284c.mo32812d(mVar.mo31790e());
            this.f10283b.mo32761b(mVar.mo31787b());
        }
    }
}
