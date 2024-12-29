package com.yeelight.cherry.p177ui.activity;

import android.content.Intent;
import android.graphics.Color;
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
import com.yeelight.yeelib.p194ui.view.ColorSeekBarView;
import com.yeelight.yeelib.p194ui.view.CommonTitleBar;
import com.yeelight.yeelib.p194ui.view.DurationSelectionView;
import com.yeelight.yeelib.utils.C10547m;
import java.util.List;

/* renamed from: com.yeelight.cherry.ui.activity.AddColorFrameActivity */
public class AddColorFrameActivity extends BaseActivity {

    /* renamed from: b */
    private BrightnessSeekBarView2 f10273b;

    /* renamed from: c */
    private ColorSeekBarView f10274c;

    /* renamed from: d */
    private DurationSelectionView f10275d;

    /* renamed from: e */
    boolean f10276e;

    /* renamed from: f */
    int f10277f;

    /* renamed from: g */
    private C9838i f10278g;

    /* renamed from: h */
    private Handler f10279h = new C4979c();

    /* renamed from: com.yeelight.cherry.ui.activity.AddColorFrameActivity$a */
    class C4977a implements View.OnClickListener {
        C4977a() {
        }

        public void onClick(View view) {
            AddColorFrameActivity.this.onBackPressed();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.AddColorFrameActivity$b */
    class C4978b implements View.OnClickListener {
        C4978b() {
        }

        public void onClick(View view) {
            AddColorFrameActivity.this.m15940X();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.AddColorFrameActivity$c */
    class C4979c extends Handler {
        C4979c() {
        }

        public void handleMessage(Message message) {
            super.handleMessage(message);
            if (message.what == 0) {
                AddColorFrameActivity addColorFrameActivity = AddColorFrameActivity.this;
                Toast.makeText(addColorFrameActivity, addColorFrameActivity.getText(2131756018), 0).show();
            }
        }
    }

    static {
        Class<AddColorFrameActivity> cls = AddColorFrameActivity.class;
    }

    /* renamed from: W */
    private int m15939W(int i) {
        return Color.rgb((i >> 16) & 255, (i >> 8) & 255, (i >> 0) & 255);
    }

    /* access modifiers changed from: private */
    /* renamed from: X */
    public void m15940X() {
        if (this.f10275d.getCurrentValue() != 0) {
            if (this.f10276e) {
                this.f10278g.mo31871c().mo31723h().get(this.f10277f).mo31793h(this.f10274c.getCurrentValue());
                this.f10278g.mo31871c().mo31723h().get(this.f10277f).mo31791f(this.f10273b.getCurrentValue());
                this.f10278g.mo31871c().mo31723h().get(this.f10277f).mo31792g(this.f10275d.getCurrentValue());
            } else {
                this.f10278g.mo31871c().mo31719a(new C9844m(this.f10275d.getCurrentValue(), C9845n.FLOW_MODE_COLOR, this.f10274c.getCurrentValue(), this.f10273b.getCurrentValue()));
            }
            finish();
            return;
        }
        this.f10279h.removeMessages(0);
        this.f10279h.sendEmptyMessageDelayed(0, 500);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo32193P();
        C10547m.m25758h(true, this);
        setContentView(C11748R$layout.activity_add_color_frame);
        CommonTitleBar commonTitleBar = (CommonTitleBar) findViewById(2131297424);
        commonTitleBar.mo32825a(getText(2131755988).toString(), new C4977a(), new C4978b());
        commonTitleBar.setTitleTextSize(16);
        commonTitleBar.setRightTextColor(getResources().getColor(2131099802));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        commonTitleBar.setLayoutParams(layoutParams);
        layoutParams.setMargins(0, C10547m.m25755e(this), 0, 0);
        this.f10273b = (BrightnessSeekBarView2) findViewById(2131296375);
        this.f10274c = (ColorSeekBarView) findViewById(2131296489);
        this.f10275d = (DurationSelectionView) findViewById(C11745R$id.duration_view);
        Intent intent = getIntent();
        int intExtra = intent.getIntExtra("custom_scene_index", -1);
        List<C9838i> i = C4300b0.m12083u().mo23745i();
        this.f10278g = (i == null || i.size() <= intExtra || intExtra < 0) ? C4300b0.m12083u().mo23753r() : i.get(intExtra);
        this.f10276e = intent.getBooleanExtra("scene_edit", false);
        this.f10277f = intent.getIntExtra("scene_edit_index", 0);
        if (this.f10276e) {
            C9844m mVar = this.f10278g.mo31871c().mo31723h().get(this.f10277f);
            this.f10275d.mo32856b(mVar.mo31788c() / 60000, (mVar.mo31788c() % 60000) / 1000, (mVar.mo31788c() % 1000) / 100);
            this.f10273b.mo32761b(mVar.mo31787b());
            this.f10274c.mo32802h(m15939W(mVar.mo31790e()));
        }
    }
}
