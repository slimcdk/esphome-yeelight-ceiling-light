package com.yeelight.yeelib.p194ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.yeelight.yeelib.R$drawable;
import com.yeelight.yeelib.R$id;
import com.yeelight.yeelib.R$layout;
import com.yeelight.yeelib.R$string;
import com.yeelight.yeelib.data.DeviceDataProvider;
import com.yeelight.yeelib.p150c.p151i.C4200i;
import com.yeelight.yeelib.p150c.p184n.C7554e;
import com.yeelight.yeelib.p152f.C4257w;
import com.yeelight.yeelib.p191j.p192a.C9897c;
import com.yeelight.yeelib.p194ui.view.CommonTitleBar;
import com.yeelight.yeelib.p194ui.view.NumberPicker;
import com.yeelight.yeelib.p194ui.view.RedSpotTipImageView;
import com.yeelight.yeelib.utils.C10547m;
import com.yeelight.yeelib.utils.C4308b;
import java.lang.ref.WeakReference;

/* renamed from: com.yeelight.yeelib.ui.activity.WifiDelaySetActivity */
public class WifiDelaySetActivity extends BaseActivity {

    /* renamed from: k */
    private static final String f18994k = WifiDelaySetActivity.class.getSimpleName();

    /* renamed from: b */
    CommonTitleBar f18995b;

    /* renamed from: c */
    TextView f18996c;

    /* renamed from: d */
    TextView f18997d;

    /* renamed from: e */
    NumberPicker f18998e;

    /* renamed from: f */
    private C4200i f18999f;

    /* renamed from: g */
    C7554e f19000g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public int f19001h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public int f19002i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public String f19003j;

    /* renamed from: com.yeelight.yeelib.ui.activity.WifiDelaySetActivity$a */
    class C10250a implements View.OnClickListener {
        C10250a() {
        }

        public void onClick(View view) {
            WifiDelaySetActivity.this.onBackPressed();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.WifiDelaySetActivity$b */
    class C10251b implements NumberPicker.C10469i {
        C10251b() {
        }

        /* renamed from: a */
        public void mo32336a(NumberPicker numberPicker, int i, int i2) {
            int unused = WifiDelaySetActivity.this.f19001h = i2;
            WifiDelaySetActivity.this.m24870c0();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.WifiDelaySetActivity$c */
    class C10252c implements C9897c.C9901d {
        C10252c() {
        }

        /* renamed from: a */
        public void mo27312a(String str, C9897c cVar) {
            WifiDelaySetActivity.this.m24869b0();
            WifiDelaySetActivity.this.finish();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.WifiDelaySetActivity$d */
    class C10253d implements C9897c.C9901d {
        C10253d() {
        }

        /* renamed from: a */
        public void mo27312a(String str, C9897c cVar) {
            WifiDelaySetActivity.this.finish();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.WifiDelaySetActivity$e */
    class C10254e implements Runnable {

        /* renamed from: com.yeelight.yeelib.ui.activity.WifiDelaySetActivity$e$a */
        class C10255a implements View.OnClickListener {
            C10255a() {
            }

            public void onClick(View view) {
                WifiDelaySetActivity.this.m24869b0();
                WifiDelaySetActivity.this.finish();
            }
        }

        C10254e() {
        }

        public void run() {
            int i;
            WifiDelaySetActivity wifiDelaySetActivity;
            RedSpotTipImageView redSpotTipImageView;
            if (WifiDelaySetActivity.this.f19001h == WifiDelaySetActivity.this.f19002i) {
                WifiDelaySetActivity.this.f18995b.getRightButton().setOnClickListener((View.OnClickListener) null);
                redSpotTipImageView = WifiDelaySetActivity.this.f18995b.getRightButton();
                wifiDelaySetActivity = WifiDelaySetActivity.this;
                i = R$drawable.icon_yeelight_save_unused;
            } else {
                WifiDelaySetActivity.this.f18995b.getRightButton().setOnClickListener(new C10255a());
                redSpotTipImageView = WifiDelaySetActivity.this.f18995b.getRightButton();
                wifiDelaySetActivity = WifiDelaySetActivity.this;
                i = R$drawable.round_save;
            }
            redSpotTipImageView.setBackground(ContextCompat.getDrawable(wifiDelaySetActivity, i));
            WifiDelaySetActivity wifiDelaySetActivity2 = WifiDelaySetActivity.this;
            wifiDelaySetActivity2.f18996c.setText(String.format(wifiDelaySetActivity2.f19003j, new Object[]{Integer.valueOf(WifiDelaySetActivity.this.f19001h)}));
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.WifiDelaySetActivity$f */
    static class C10256f extends Handler {

        /* renamed from: a */
        WeakReference<WifiDelaySetActivity> f19010a;

        C10256f(WifiDelaySetActivity wifiDelaySetActivity) {
            this.f19010a = new WeakReference<>(wifiDelaySetActivity);
        }

        public void handleMessage(Message message) {
            if (message.what == 0) {
                ((WifiDelaySetActivity) this.f19010a.get()).mo32196T(((WifiDelaySetActivity) this.f19010a.get()).getString(R$string.feature_delay_not_available));
            }
        }
    }

    public WifiDelaySetActivity() {
        new C10256f(this);
    }

    /* access modifiers changed from: private */
    /* renamed from: b0 */
    public void m24869b0() {
        this.f18999f.mo23373G0(this.f19001h);
        DeviceDataProvider.m22393a0(this.f18999f);
        this.f19002i = this.f19001h;
    }

    /* access modifiers changed from: private */
    /* renamed from: c0 */
    public void m24870c0() {
        this.f18995b.post(new C10254e());
    }

    public void onBackPressed() {
        if (this.f19001h == this.f19002i) {
            finish();
            return;
        }
        C9897c.m24274p(this, getString(R$string.common_text_discard), getString(R$string.common_text_save), getString(R$string.common_text_cancel), new C10252c(), new C10253d());
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo32193P();
        C10547m.m25758h(true, this);
        setContentView(R$layout.activity_wifi_delayset);
        this.f18995b = (CommonTitleBar) findViewById(R$id.title_bar);
        LinearLayout linearLayout = (LinearLayout) findViewById(R$id.delay_switch_layout);
        this.f18996c = (TextView) findViewById(R$id.delay_switch_text_info);
        this.f18997d = (TextView) findViewById(R$id.delay_introduce);
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(R$id.delay_time_area);
        this.f18998e = (NumberPicker) findViewById(R$id.minite);
        TextView textView = (TextView) findViewById(R$id.delay_detail);
        Intent intent = getIntent();
        if (!intent.hasExtra("com.yeelight.cherry.device_id")) {
            C4308b.m12141t(f18994k, "Activity has not device id", false);
            finish();
            return;
        }
        this.f18999f = C4257w.m11953o0(intent.getStringExtra("com.yeelight.cherry.device_id"));
        this.f19003j = getResources().getString(R$string.feature_delay_info);
        C4200i iVar = this.f18999f;
        if (iVar == null) {
            finish();
            return;
        }
        int D = iVar.mo23368D();
        this.f19001h = D;
        this.f19002i = D;
        C7554e eVar = (C7554e) this.f18999f.mo23408d0().mo27710r(2);
        this.f19000g = eVar;
        if (eVar == null) {
            finish();
            return;
        }
        this.f18995b.mo32825a(getString(R$string.feature_delay), new C10250a(), (View.OnClickListener) null);
        this.f18995b.setTitleTextSize(16);
        this.f18996c.setText(String.format(this.f19003j, new Object[]{Integer.valueOf(this.f19001h)}));
        this.f18997d.setVisibility(8);
        this.f18998e.setMinValue(1);
        this.f18998e.setMaxValue(60);
        this.f18998e.setWrapSelectorWheel(false);
        this.f18998e.setValue(this.f19001h);
        this.f18998e.setOnValueChangedListener(new C10251b());
    }
}
