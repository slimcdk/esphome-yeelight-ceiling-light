package com.yeelight.cherry.p141ui.activity;

import android.content.Intent;
import android.graphics.Color;
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
import com.yeelight.yeelib.p142ui.view.ColorSeekBarView;
import com.yeelight.yeelib.p142ui.view.CommonTitleBar;
import com.yeelight.yeelib.p142ui.view.DurationSelectionView;
import java.util.List;
import p051j4.C9193k;

/* renamed from: com.yeelight.cherry.ui.activity.AddColorFrameActivity */
public class AddColorFrameActivity extends BaseActivity {

    /* renamed from: a */
    private BrightnessSeekBarView2 f9817a;

    /* renamed from: b */
    private ColorSeekBarView f9818b;

    /* renamed from: c */
    private DurationSelectionView f9819c;

    /* renamed from: d */
    boolean f9820d;

    /* renamed from: e */
    int f9821e;

    /* renamed from: f */
    private CustomAdvancedFlowScene f9822f;

    /* renamed from: g */
    private Handler f9823g = new C5024c();

    /* renamed from: com.yeelight.cherry.ui.activity.AddColorFrameActivity$a */
    class C5022a implements View.OnClickListener {
        C5022a() {
        }

        public void onClick(View view) {
            AddColorFrameActivity.this.onBackPressed();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.AddColorFrameActivity$b */
    class C5023b implements View.OnClickListener {
        C5023b() {
        }

        public void onClick(View view) {
            AddColorFrameActivity.this.m15794X();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.AddColorFrameActivity$c */
    class C5024c extends Handler {
        C5024c() {
        }

        public void handleMessage(Message message) {
            super.handleMessage(message);
            if (message.what == 0) {
                AddColorFrameActivity addColorFrameActivity = AddColorFrameActivity.this;
                Toast.makeText(addColorFrameActivity, addColorFrameActivity.getText(2131756030), 0).show();
            }
        }
    }

    /* renamed from: W */
    private int m15793W(int i) {
        return Color.rgb((i >> 16) & 255, (i >> 8) & 255, (i >> 0) & 255);
    }

    /* access modifiers changed from: private */
    /* renamed from: X */
    public void m15794X() {
        if (this.f9819c.getCurrentValue() != 0) {
            if (this.f9820d) {
                this.f9822f.mo35436c().mo35338h().get(this.f9821e).mo35380h(this.f9818b.getCurrentValue());
                this.f9822f.mo35436c().mo35338h().get(this.f9821e).mo35378f(this.f9817a.getCurrentValue());
                this.f9822f.mo35436c().mo35338h().get(this.f9821e).mo35379g(this.f9819c.getCurrentValue());
            } else {
                this.f9822f.mo35436c().mo35334a(new C8319k(this.f9819c.getCurrentValue(), FlowItemMode.FLOW_MODE_COLOR, this.f9818b.getCurrentValue(), this.f9817a.getCurrentValue()));
            }
            finish();
            return;
        }
        this.f9823g.removeMessages(0);
        this.f9823g.sendEmptyMessageDelayed(0, 500);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo35653P();
        C9193k.m22157h(true, this);
        setContentView(C12228R$layout.activity_add_color_frame);
        CommonTitleBar commonTitleBar = (CommonTitleBar) findViewById(2131297591);
        commonTitleBar.mo36195a(getText(2131756000).toString(), new C5022a(), new C5023b());
        commonTitleBar.setTitleTextSize(16);
        commonTitleBar.setRightTextColor(getResources().getColor(2131099805));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        commonTitleBar.setLayoutParams(layoutParams);
        layoutParams.setMargins(0, C9193k.m22154e(this), 0, 0);
        this.f9817a = (BrightnessSeekBarView2) findViewById(2131296433);
        this.f9818b = (ColorSeekBarView) findViewById(2131296559);
        this.f9819c = (DurationSelectionView) findViewById(C12225R$id.duration_view);
        Intent intent = getIntent();
        int intExtra = intent.getIntExtra("custom_scene_index", -1);
        List<CustomAdvancedFlowScene> i = C3112v.m8242u().mo23558i();
        this.f9822f = (i == null || i.size() <= intExtra || intExtra < 0) ? C3112v.m8242u().mo23566r() : i.get(intExtra);
        this.f9820d = intent.getBooleanExtra("scene_edit", false);
        this.f9821e = intent.getIntExtra("scene_edit_index", 0);
        if (this.f9820d) {
            C8319k kVar = this.f9822f.mo35436c().mo35338h().get(this.f9821e);
            this.f9819c.mo36226b(kVar.mo35375c() / 60000, (kVar.mo35375c() % 60000) / 1000, (kVar.mo35375c() % 1000) / 100);
            this.f9817a.mo36131b(kVar.mo35374b());
            this.f9818b.mo36172h(m15793W(kVar.mo35377e()));
        }
    }
}
