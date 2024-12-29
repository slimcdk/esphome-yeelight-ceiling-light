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
import com.yeelight.yeelib.p194ui.view.CommonTitleBar;
import com.yeelight.yeelib.p194ui.view.DurationSelectionView;
import com.yeelight.yeelib.utils.C10547m;

/* renamed from: com.yeelight.cherry.ui.activity.AddSuspendFrameActivity */
public class AddSuspendFrameActivity extends BaseActivity {

    /* renamed from: b */
    private DurationSelectionView f10336b;

    /* renamed from: c */
    boolean f10337c;

    /* renamed from: d */
    boolean f10338d;

    /* renamed from: e */
    int f10339e;

    /* renamed from: f */
    private C9838i f10340f;

    /* renamed from: g */
    private Handler f10341g = new C5002c();

    /* renamed from: com.yeelight.cherry.ui.activity.AddSuspendFrameActivity$a */
    class C5000a implements View.OnClickListener {
        C5000a() {
        }

        public void onClick(View view) {
            AddSuspendFrameActivity.this.onBackPressed();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.AddSuspendFrameActivity$b */
    class C5001b implements View.OnClickListener {
        C5001b() {
        }

        public void onClick(View view) {
            AddSuspendFrameActivity.this.m15990W();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.AddSuspendFrameActivity$c */
    class C5002c extends Handler {
        C5002c() {
        }

        public void handleMessage(Message message) {
            super.handleMessage(message);
            if (message.what == 0) {
                AddSuspendFrameActivity addSuspendFrameActivity = AddSuspendFrameActivity.this;
                Toast.makeText(addSuspendFrameActivity, addSuspendFrameActivity.getText(2131756018), 0).show();
            }
        }
    }

    static {
        Class<AddSuspendFrameActivity> cls = AddSuspendFrameActivity.class;
    }

    /* access modifiers changed from: private */
    /* renamed from: W */
    public void m15990W() {
        if (this.f10336b.getCurrentValue() != 0) {
            if (this.f10337c) {
                this.f10340f.mo31871c().mo31723h().get(this.f10339e).mo31792g(this.f10336b.getCurrentValue());
            } else {
                this.f10340f.mo31871c().mo31719a(new C9844m(this.f10336b.getCurrentValue(), C9845n.FLOW_MODE_SLEEP, 0, 0));
            }
            finish();
            return;
        }
        this.f10341g.removeMessages(0);
        this.f10341g.sendEmptyMessageDelayed(0, 500);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo32193P();
        boolean z = true;
        C10547m.m25758h(true, this);
        setContentView(C11748R$layout.activity_add_suspend_frame);
        CommonTitleBar commonTitleBar = (CommonTitleBar) findViewById(2131297424);
        commonTitleBar.mo32825a(getText(2131755990).toString(), new C5000a(), new C5001b());
        commonTitleBar.setTitleTextSize(16);
        commonTitleBar.setRightTextColor(getResources().getColor(2131099802));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        commonTitleBar.setLayoutParams(layoutParams);
        layoutParams.setMargins(0, C10547m.m25755e(this), 0, 0);
        DurationSelectionView durationSelectionView = (DurationSelectionView) findViewById(C11745R$id.duration_view);
        this.f10336b = durationSelectionView;
        durationSelectionView.setTitle(2131755993);
        Intent intent = getIntent();
        int intExtra = intent.getIntExtra("custom_scene_index", -1);
        if (intExtra == -1) {
            z = false;
        }
        this.f10338d = z;
        this.f10340f = z ? C4300b0.m12083u().mo23745i().get(intExtra) : C4300b0.m12083u().mo23753r();
        this.f10337c = intent.getBooleanExtra("scene_edit", false);
        this.f10339e = intent.getIntExtra("scene_edit_index", 0);
        if (this.f10337c) {
            C9844m mVar = this.f10340f.mo31871c().mo31723h().get(this.f10339e);
            this.f10336b.mo32856b(mVar.mo31788c() / 60000, (mVar.mo31788c() % 60000) / 1000, (mVar.mo31788c() % 1000) / 100);
        }
    }
}
