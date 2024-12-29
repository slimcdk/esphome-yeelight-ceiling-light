package com.yeelight.yeelib.p142ui.activity;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import com.yeelight.yeelib.R$color;
import com.yeelight.yeelib.R$drawable;
import com.yeelight.yeelib.R$id;
import com.yeelight.yeelib.R$layout;
import com.yeelight.yeelib.R$string;
import com.yeelight.yeelib.device.base.DeviceStatusBase;
import com.yeelight.yeelib.device.xiaomi.WifiSpeakerService;
import com.yeelight.yeelib.managers.YeelightDeviceManager;
import com.yeelight.yeelib.p142ui.view.CommonTitleBar;
import p051j4.C9193k;
import p150e4.C8967a0;
import p150e4.C8969b0;
import p150e4.C8971c0;
import p170i4.C9107b;
import p223w3.C10916f1;
import p237z3.C12143c;
import p237z3.C12145e;

/* renamed from: com.yeelight.yeelib.ui.activity.SwitchAiProviderActivity */
public class SwitchAiProviderActivity extends BaseActivity implements View.OnClickListener, C12145e, C12143c {

    /* renamed from: a */
    private ImageView f15260a;

    /* renamed from: b */
    private ImageView f15261b;

    /* renamed from: c */
    private C10916f1 f15262c;

    /* renamed from: d */
    private WifiSpeakerService.AiProvider f15263d;

    /* renamed from: e */
    private C9107b.C9109b f15264e;

    /* renamed from: f */
    private C9107b f15265f;

    /* renamed from: g */
    private Handler f15266g;

    /* access modifiers changed from: private */
    /* renamed from: Y */
    public /* synthetic */ void m20435Y(View view) {
        finish();
    }

    /* access modifiers changed from: private */
    /* renamed from: Z */
    public /* synthetic */ void m20436Z() {
        C9107b.C9109b bVar;
        if (!isFinishing() && (bVar = this.f15264e) != null) {
            bVar.mo37128b(1, getString(R$string.speaker_operation_successed));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a0 */
    public /* synthetic */ void m20437a0() {
        C9107b.C9109b bVar;
        if (!isFinishing() && (bVar = this.f15264e) != null) {
            bVar.mo37128b(2, getString(R$string.speaker_operation_failed));
        }
    }

    /* renamed from: b0 */
    private void m20438b0(WifiSpeakerService.AiProvider aiProvider) {
        if (this.f15264e == null) {
            this.f15264e = new C9107b.C9109b(this);
        }
        this.f15264e.mo37128b(0, getString(R$string.speaker_system_switching));
        if (this.f15265f == null) {
            this.f15265f = this.f15264e.mo37127a();
        }
        if (!this.f15265f.isShowing()) {
            this.f15265f.show();
        }
        this.f15263d = aiProvider;
        this.f15262c.mo42281d2(aiProvider);
        m20439c0();
    }

    /* renamed from: c0 */
    private void m20439c0() {
        int i;
        ImageView imageView;
        WifiSpeakerService.AiProvider aiProvider = this.f15263d;
        if (aiProvider == WifiSpeakerService.AiProvider.mibrain) {
            this.f15260a.setImageResource(R$drawable.icon_yeelight_common_choice_selected);
            imageView = this.f15261b;
            i = R$drawable.icon_yeelight_common_choice_normal;
        } else if (aiProvider == WifiSpeakerService.AiProvider.xiaobing) {
            this.f15260a.setImageResource(R$drawable.icon_yeelight_common_choice_normal);
            imageView = this.f15261b;
            i = R$drawable.icon_yeelight_common_choice_selected;
        } else {
            ImageView imageView2 = this.f15260a;
            i = R$drawable.icon_yeelight_common_choice_normal;
            imageView2.setImageResource(i);
            imageView = this.f15261b;
        }
        imageView.setImageResource(i);
    }

    public void onClick(View view) {
        WifiSpeakerService.AiProvider aiProvider;
        int id = view.getId();
        if (id == R$id.ll_xiaoai) {
            aiProvider = WifiSpeakerService.AiProvider.mibrain;
        } else if (id == R$id.ll_xiaobing) {
            aiProvider = WifiSpeakerService.AiProvider.xiaobing;
        } else {
            return;
        }
        m20438b0(aiProvider);
    }

    public void onConnectionStateChanged(int i, int i2) {
        if (i2 == 0) {
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f15266g = new Handler();
        C9193k.m22157h(true, this);
        if (getIntent().hasExtra("com.yeelight.cherry.device_id")) {
            this.f15262c = (C10916f1) YeelightDeviceManager.m7794j0(getIntent().getStringExtra("com.yeelight.cherry.device_id"));
        }
        setContentView(R$layout.activity_switch_ai_provider);
        this.f15260a = (ImageView) findViewById(R$id.img_xiaoai);
        this.f15261b = (ImageView) findViewById(R$id.img_xiaobing);
        findViewById(R$id.ll_xiaoai).setOnClickListener(this);
        findViewById(R$id.ll_xiaobing).setOnClickListener(this);
        if (this.f15262c == null) {
            finish();
            return;
        }
        CommonTitleBar commonTitleBar = (CommonTitleBar) findViewById(R$id.title_bar);
        commonTitleBar.setTitleTextColor(R$color.common_text_color_primary_33);
        commonTitleBar.mo36195a(getString(R$string.speaker_voice_system_switching), new C8967a0(this), (View.OnClickListener) null);
        this.f15263d = this.f15262c.mo42279a2();
        m20439c0();
        this.f15262c.mo23178B0(this);
        this.f15262c.mo23171z0(this);
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        this.f15266g.removeCallbacksAndMessages((Object) null);
        C10916f1 f1Var = this.f15262c;
        if (f1Var != null) {
            f1Var.mo23213W0(this);
            this.f15262c.mo23133V0(this);
        }
        C9107b bVar = this.f15265f;
        if (bVar != null && bVar.isShowing()) {
            this.f15265f.dismiss();
        }
        super.onDestroy();
    }

    public void onLocalConnected() {
    }

    public void onLocalDisconnected() {
    }

    public void onStatusChange(int i, DeviceStatusBase deviceStatusBase) {
        if (i == 16777216) {
            this.f15266g.postDelayed(new C8971c0(this), 4000);
        } else if (i == 33554432) {
            this.f15266g.post(new C8969b0(this));
        }
    }
}
