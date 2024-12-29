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
import com.yeelight.yeelib.p194ui.view.CommonTitleBar;
import com.yeelight.yeelib.p194ui.view.DurationSelectionView;
import com.yeelight.yeelib.utils.C10547m;

/* renamed from: com.yeelight.cherry.ui.activity.AddBrightFrameActivity */
public class AddBrightFrameActivity extends BaseActivity {

    /* renamed from: b */
    private BrightnessSeekBarView2 f10263b;

    /* renamed from: c */
    private DurationSelectionView f10264c;

    /* renamed from: d */
    boolean f10265d;

    /* renamed from: e */
    boolean f10266e;

    /* renamed from: f */
    int f10267f;

    /* renamed from: g */
    private C9838i f10268g;

    /* renamed from: h */
    private Handler f10269h = new C4976c();

    /* renamed from: com.yeelight.cherry.ui.activity.AddBrightFrameActivity$a */
    class C4974a implements View.OnClickListener {
        C4974a() {
        }

        public void onClick(View view) {
            AddBrightFrameActivity.this.onBackPressed();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.AddBrightFrameActivity$b */
    class C4975b implements View.OnClickListener {
        C4975b() {
        }

        public void onClick(View view) {
            AddBrightFrameActivity.this.m15937W();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.AddBrightFrameActivity$c */
    class C4976c extends Handler {
        C4976c() {
        }

        public void handleMessage(Message message) {
            super.handleMessage(message);
            if (message.what == 0) {
                AddBrightFrameActivity addBrightFrameActivity = AddBrightFrameActivity.this;
                Toast.makeText(addBrightFrameActivity, addBrightFrameActivity.getText(2131756018), 0).show();
            }
        }
    }

    static {
        Class<AddBrightFrameActivity> cls = AddBrightFrameActivity.class;
    }

    /* access modifiers changed from: private */
    /* renamed from: W */
    public void m15937W() {
        if (this.f10264c.getCurrentValue() != 0) {
            if (this.f10265d) {
                this.f10268g.mo31871c().mo31723h().get(this.f10267f).mo31791f(this.f10263b.getCurrentValue());
                this.f10268g.mo31871c().mo31723h().get(this.f10267f).mo31792g(this.f10264c.getCurrentValue());
            } else {
                this.f10268g.mo31871c().mo31719a(new C9844m(this.f10264c.getCurrentValue(), C9845n.FLOW_MODE_BRIGHT, -1, this.f10263b.getCurrentValue()));
            }
            finish();
            return;
        }
        this.f10269h.removeMessages(0);
        this.f10269h.sendEmptyMessageDelayed(0, 500);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo32193P();
        boolean z = true;
        C10547m.m25758h(true, this);
        setContentView(C11748R$layout.activity_add_bright_frame);
        CommonTitleBar commonTitleBar = (CommonTitleBar) findViewById(2131297424);
        commonTitleBar.mo32825a(getText(2131755987).toString(), new C4974a(), new C4975b());
        commonTitleBar.setTitleTextSize(16);
        commonTitleBar.setRightTextColor(getResources().getColor(2131099802));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        commonTitleBar.setLayoutParams(layoutParams);
        layoutParams.setMargins(0, C10547m.m25755e(this), 0, 0);
        this.f10263b = (BrightnessSeekBarView2) findViewById(2131296375);
        this.f10264c = (DurationSelectionView) findViewById(C11745R$id.duration_view);
        Intent intent = getIntent();
        int intExtra = intent.getIntExtra("custom_scene_index", -1);
        if (intExtra == -1) {
            z = false;
        }
        this.f10266e = z;
        this.f10268g = z ? C4300b0.m12083u().mo23745i().get(intExtra) : C4300b0.m12083u().mo23753r();
        this.f10265d = intent.getBooleanExtra("scene_edit", false);
        this.f10267f = intent.getIntExtra("scene_edit_index", 0);
        if (this.f10265d) {
            C9844m mVar = this.f10268g.mo31871c().mo31723h().get(this.f10267f);
            this.f10264c.mo32856b(mVar.mo31788c() / 60000, (mVar.mo31788c() % 60000) / 1000, (mVar.mo31788c() % 1000) / 100);
            this.f10263b.mo32761b(mVar.mo31787b());
        }
    }
}
