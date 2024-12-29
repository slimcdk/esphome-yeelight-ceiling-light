package com.yeelight.yeelib.p194ui.activity;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import com.yeelight.yeelib.R$color;
import com.yeelight.yeelib.R$drawable;
import com.yeelight.yeelib.R$id;
import com.yeelight.yeelib.R$layout;
import com.yeelight.yeelib.R$string;
import com.yeelight.yeelib.device.xiaomi.WifiSpeakerService;
import com.yeelight.yeelib.p150c.p151i.C6024e;
import com.yeelight.yeelib.p150c.p183m.C6418d1;
import com.yeelight.yeelib.p152f.C4257w;
import com.yeelight.yeelib.p186e.C9768c;
import com.yeelight.yeelib.p186e.C9770e;
import com.yeelight.yeelib.p194ui.view.CommonTitleBar;
import com.yeelight.yeelib.p194ui.widget.C10515b;
import com.yeelight.yeelib.utils.C10547m;

/* renamed from: com.yeelight.yeelib.ui.activity.SwitchAiProviderActivity */
public class SwitchAiProviderActivity extends BaseActivity implements View.OnClickListener, C9770e, C9768c {

    /* renamed from: b */
    private ImageView f18952b;

    /* renamed from: c */
    private ImageView f18953c;

    /* renamed from: d */
    private C6418d1 f18954d;

    /* renamed from: e */
    private WifiSpeakerService.C9665g f18955e;

    /* renamed from: f */
    private C10515b.C10517b f18956f;

    /* renamed from: g */
    private C10515b f18957g;

    /* renamed from: h */
    private Handler f18958h;

    /* renamed from: Y */
    private void m24819Y(WifiSpeakerService.C9665g gVar) {
        if (this.f18956f == null) {
            this.f18956f = new C10515b.C10517b(this);
        }
        this.f18956f.mo33281b(0, getString(R$string.speaker_system_switching));
        if (this.f18957g == null) {
            this.f18957g = this.f18956f.mo33280a();
        }
        if (!this.f18957g.isShowing()) {
            this.f18957g.show();
        }
        this.f18955e = gVar;
        this.f18954d.mo28157d2(gVar);
        m24820Z();
    }

    /* renamed from: Z */
    private void m24820Z() {
        ImageView imageView;
        int i;
        ImageView imageView2;
        int i2;
        WifiSpeakerService.C9665g gVar = this.f18955e;
        if (gVar == WifiSpeakerService.C9665g.mibrain) {
            imageView = this.f18952b;
            i = R$drawable.icon_yeelight_common_choice_selected;
        } else if (gVar == WifiSpeakerService.C9665g.xiaobing) {
            this.f18952b.setImageResource(R$drawable.icon_yeelight_common_choice_normal);
            imageView2 = this.f18953c;
            i2 = R$drawable.icon_yeelight_common_choice_selected;
            imageView2.setImageResource(i2);
        } else {
            imageView = this.f18952b;
            i = R$drawable.icon_yeelight_common_choice_normal;
        }
        imageView.setImageResource(i);
        imageView2 = this.f18953c;
        i2 = R$drawable.icon_yeelight_common_choice_normal;
        imageView2.setImageResource(i2);
    }

    /* renamed from: V */
    public /* synthetic */ void mo32539V(View view) {
        finish();
    }

    /* renamed from: W */
    public /* synthetic */ void mo32540W() {
        C10515b.C10517b bVar;
        if (!isFinishing() && (bVar = this.f18956f) != null) {
            bVar.mo33281b(1, getString(R$string.speaker_operation_successed));
        }
    }

    /* renamed from: X */
    public /* synthetic */ void mo32541X() {
        C10515b.C10517b bVar;
        if (!isFinishing() && (bVar = this.f18956f) != null) {
            bVar.mo33281b(2, getString(R$string.speaker_operation_failed));
        }
    }

    public void onClick(View view) {
        WifiSpeakerService.C9665g gVar;
        int id = view.getId();
        if (id == R$id.ll_xiaoai) {
            gVar = WifiSpeakerService.C9665g.mibrain;
        } else if (id == R$id.ll_xiaobing) {
            gVar = WifiSpeakerService.C9665g.xiaobing;
        } else {
            return;
        }
        m24819Y(gVar);
    }

    public void onConnectionStateChanged(int i, int i2) {
        if (i2 == 0) {
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f18958h = new Handler();
        C10547m.m25758h(true, this);
        if (getIntent().hasExtra("com.yeelight.cherry.device_id")) {
            this.f18954d = (C6418d1) C4257w.m11945h0(getIntent().getStringExtra("com.yeelight.cherry.device_id"));
        }
        setContentView(R$layout.activity_switch_ai_provider);
        this.f18952b = (ImageView) findViewById(R$id.img_xiaoai);
        this.f18953c = (ImageView) findViewById(R$id.img_xiaobing);
        findViewById(R$id.ll_xiaoai).setOnClickListener(this);
        findViewById(R$id.ll_xiaobing).setOnClickListener(this);
        if (this.f18954d == null) {
            finish();
            return;
        }
        CommonTitleBar commonTitleBar = (CommonTitleBar) findViewById(R$id.title_bar);
        commonTitleBar.setTitleTextColor(R$color.common_text_color_primary_33);
        commonTitleBar.mo32825a(getString(R$string.speaker_voice_system_switching), new C10343u0(this), (View.OnClickListener) null);
        this.f18955e = this.f18954d.mo28155a2();
        m24820Z();
        this.f18954d.mo23365B0(this);
        this.f18954d.mo23358z0(this);
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        this.f18958h.removeCallbacksAndMessages((Object) null);
        C6418d1 d1Var = this.f18954d;
        if (d1Var != null) {
            d1Var.mo23400W0(this);
            this.f18954d.mo23319V0(this);
        }
        C10515b bVar = this.f18957g;
        if (bVar != null && bVar.isShowing()) {
            this.f18957g.dismiss();
        }
        super.onDestroy();
    }

    public void onLocalConnected() {
    }

    public void onLocalDisconnected() {
    }

    public void onStatusChange(int i, C6024e eVar) {
        if (i == 16777216) {
            this.f18958h.postDelayed(new C10345v0(this), 4000);
        } else if (i == 33554432) {
            this.f18958h.post(new C10347w0(this));
        }
    }
}
