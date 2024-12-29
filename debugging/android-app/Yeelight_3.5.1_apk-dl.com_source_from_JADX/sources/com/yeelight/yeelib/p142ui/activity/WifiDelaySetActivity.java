package com.yeelight.yeelib.p142ui.activity;

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
import com.yeelight.yeelib.device.base.C3012e;
import com.yeelight.yeelib.managers.YeelightDeviceManager;
import com.yeelight.yeelib.p142ui.view.CommonTitleBar;
import com.yeelight.yeelib.p142ui.view.NumberPicker;
import com.yeelight.yeelib.p142ui.view.RedSpotTipImageView;
import com.yeelight.yeelib.utils.AppUtils;
import java.lang.ref.WeakReference;
import p051j4.C9193k;
import p160g4.C9071c;
import p232y3.C12041e;

/* renamed from: com.yeelight.yeelib.ui.activity.WifiDelaySetActivity */
public class WifiDelaySetActivity extends BaseActivity {

    /* renamed from: j */
    private static final String f15302j = "WifiDelaySetActivity";

    /* renamed from: a */
    CommonTitleBar f15303a;

    /* renamed from: b */
    TextView f15304b;

    /* renamed from: c */
    TextView f15305c;

    /* renamed from: d */
    NumberPicker f15306d;

    /* renamed from: e */
    private C3012e f15307e;

    /* renamed from: f */
    C12041e f15308f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public int f15309g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public int f15310h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public String f15311i;

    /* renamed from: com.yeelight.yeelib.ui.activity.WifiDelaySetActivity$a */
    class C8668a implements View.OnClickListener {
        C8668a() {
        }

        public void onClick(View view) {
            WifiDelaySetActivity.this.onBackPressed();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.WifiDelaySetActivity$b */
    class C8669b implements NumberPicker.C8846i {
        C8669b() {
        }

        /* renamed from: a */
        public void mo35772a(NumberPicker numberPicker, int i, int i2) {
            int unused = WifiDelaySetActivity.this.f15309g = i2;
            WifiDelaySetActivity.this.m20487c0();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.WifiDelaySetActivity$c */
    class C8670c implements C9071c.C9075d {
        C8670c() {
        }

        /* renamed from: a */
        public void mo31271a(String str, C9071c cVar) {
            WifiDelaySetActivity.this.m20486b0();
            WifiDelaySetActivity.this.finish();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.WifiDelaySetActivity$d */
    class C8671d implements C9071c.C9075d {
        C8671d() {
        }

        /* renamed from: a */
        public void mo31271a(String str, C9071c cVar) {
            WifiDelaySetActivity.this.finish();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.WifiDelaySetActivity$e */
    class C8672e implements Runnable {

        /* renamed from: com.yeelight.yeelib.ui.activity.WifiDelaySetActivity$e$a */
        class C8673a implements View.OnClickListener {
            C8673a() {
            }

            public void onClick(View view) {
                WifiDelaySetActivity.this.m20486b0();
                WifiDelaySetActivity.this.finish();
            }
        }

        C8672e() {
        }

        public void run() {
            int i;
            WifiDelaySetActivity wifiDelaySetActivity;
            RedSpotTipImageView redSpotTipImageView;
            if (WifiDelaySetActivity.this.f15309g == WifiDelaySetActivity.this.f15310h) {
                WifiDelaySetActivity.this.f15303a.getRightButton().setOnClickListener((View.OnClickListener) null);
                redSpotTipImageView = WifiDelaySetActivity.this.f15303a.getRightButton();
                wifiDelaySetActivity = WifiDelaySetActivity.this;
                i = R$drawable.icon_yeelight_save_unused;
            } else {
                WifiDelaySetActivity.this.f15303a.getRightButton().setOnClickListener(new C8673a());
                redSpotTipImageView = WifiDelaySetActivity.this.f15303a.getRightButton();
                wifiDelaySetActivity = WifiDelaySetActivity.this;
                i = R$drawable.round_save;
            }
            redSpotTipImageView.setBackground(ContextCompat.getDrawable(wifiDelaySetActivity, i));
            WifiDelaySetActivity wifiDelaySetActivity2 = WifiDelaySetActivity.this;
            wifiDelaySetActivity2.f15304b.setText(String.format(wifiDelaySetActivity2.f15311i, new Object[]{Integer.valueOf(WifiDelaySetActivity.this.f15309g)}));
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.WifiDelaySetActivity$f */
    static class C8674f extends Handler {

        /* renamed from: a */
        WeakReference<WifiDelaySetActivity> f15318a;

        C8674f(WifiDelaySetActivity wifiDelaySetActivity) {
            this.f15318a = new WeakReference<>(wifiDelaySetActivity);
        }

        public void handleMessage(Message message) {
            if (message.what == 0) {
                ((WifiDelaySetActivity) this.f15318a.get()).mo35656T(((WifiDelaySetActivity) this.f15318a.get()).getString(R$string.feature_delay_not_available));
            }
        }
    }

    public WifiDelaySetActivity() {
        new C8674f(this);
    }

    /* access modifiers changed from: private */
    /* renamed from: b0 */
    public void m20486b0() {
        this.f15307e.mo23186G0(this.f15309g);
        DeviceDataProvider.m17615a0(this.f15307e);
        this.f15310h = this.f15309g;
    }

    /* access modifiers changed from: private */
    /* renamed from: c0 */
    public void m20487c0() {
        this.f15303a.post(new C8672e());
    }

    public void onBackPressed() {
        if (this.f15309g == this.f15310h) {
            finish();
            return;
        }
        C9071c.m21727p(this, getString(R$string.common_text_discard), getString(R$string.common_text_save), getString(R$string.common_text_cancel), new C8670c(), new C8671d());
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo35653P();
        C9193k.m22157h(true, this);
        setContentView(R$layout.activity_wifi_delayset);
        this.f15303a = (CommonTitleBar) findViewById(R$id.title_bar);
        LinearLayout linearLayout = (LinearLayout) findViewById(R$id.delay_switch_layout);
        this.f15304b = (TextView) findViewById(R$id.delay_switch_text_info);
        this.f15305c = (TextView) findViewById(R$id.delay_introduce);
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(R$id.delay_time_area);
        this.f15306d = (NumberPicker) findViewById(R$id.minite);
        TextView textView = (TextView) findViewById(R$id.delay_detail);
        Intent intent = getIntent();
        if (!intent.hasExtra("com.yeelight.cherry.device_id")) {
            AppUtils.m8302w(f15302j, "Activity has not device id", false);
            finish();
            return;
        }
        this.f15307e = YeelightDeviceManager.m7804r0(intent.getStringExtra("com.yeelight.cherry.device_id"));
        this.f15311i = getResources().getString(R$string.feature_delay_info);
        C3012e eVar = this.f15307e;
        if (eVar == null) {
            finish();
            return;
        }
        int D = eVar.mo23181D();
        this.f15309g = D;
        this.f15310h = D;
        C12041e eVar2 = (C12041e) this.f15307e.mo23221d0().mo31611r(2);
        this.f15308f = eVar2;
        if (eVar2 == null) {
            finish();
            return;
        }
        this.f15303a.mo36195a(getString(R$string.common_text_delay_off), new C8668a(), (View.OnClickListener) null);
        this.f15303a.setTitleTextSize(16);
        this.f15304b.setText(String.format(this.f15311i, new Object[]{Integer.valueOf(this.f15309g)}));
        this.f15305c.setVisibility(8);
        this.f15306d.setMinValue(1);
        this.f15306d.setMaxValue(60);
        this.f15306d.setWrapSelectorWheel(false);
        this.f15306d.setValue(this.f15309g);
        this.f15306d.setOnValueChangedListener(new C8669b());
    }
}
