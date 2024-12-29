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
import com.yeelight.yeelib.device.C6119c;
import com.yeelight.yeelib.managers.YeelightDeviceManager;
import com.yeelight.yeelib.p142ui.view.CommonTitleBar;
import com.yeelight.yeelib.p142ui.view.NumberPicker;
import com.yeelight.yeelib.p142ui.view.RedSpotTipImageView;
import com.yeelight.yeelib.utils.AppUtils;
import java.lang.ref.WeakReference;
import p051j4.C9193k;
import p160g4.C9071c;

/* renamed from: com.yeelight.yeelib.ui.activity.GroupDelaySetActivity */
public class GroupDelaySetActivity extends BaseActivity {

    /* renamed from: i */
    private static final String f14713i = "GroupDelaySetActivity";

    /* renamed from: a */
    CommonTitleBar f14714a;

    /* renamed from: b */
    TextView f14715b;

    /* renamed from: c */
    TextView f14716c;

    /* renamed from: d */
    NumberPicker f14717d;

    /* renamed from: e */
    private C6119c f14718e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public int f14719f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public int f14720g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public String f14721h;

    /* renamed from: com.yeelight.yeelib.ui.activity.GroupDelaySetActivity$a */
    class C8461a implements View.OnClickListener {
        C8461a() {
        }

        public void onClick(View view) {
            GroupDelaySetActivity.this.onBackPressed();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.GroupDelaySetActivity$b */
    class C8462b implements NumberPicker.C8846i {
        C8462b() {
        }

        /* renamed from: a */
        public void mo35772a(NumberPicker numberPicker, int i, int i2) {
            int unused = GroupDelaySetActivity.this.f14719f = i2;
            GroupDelaySetActivity.this.m20129c0();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.GroupDelaySetActivity$c */
    class C8463c implements C9071c.C9075d {
        C8463c() {
        }

        /* renamed from: a */
        public void mo31271a(String str, C9071c cVar) {
            GroupDelaySetActivity.this.m20128b0();
            GroupDelaySetActivity.this.finish();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.GroupDelaySetActivity$d */
    class C8464d implements C9071c.C9075d {
        C8464d() {
        }

        /* renamed from: a */
        public void mo31271a(String str, C9071c cVar) {
            GroupDelaySetActivity.this.finish();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.GroupDelaySetActivity$e */
    class C8465e implements Runnable {

        /* renamed from: com.yeelight.yeelib.ui.activity.GroupDelaySetActivity$e$a */
        class C8466a implements View.OnClickListener {
            C8466a() {
            }

            public void onClick(View view) {
                GroupDelaySetActivity.this.m20128b0();
                GroupDelaySetActivity.this.finish();
            }
        }

        C8465e() {
        }

        public void run() {
            int i;
            GroupDelaySetActivity groupDelaySetActivity;
            RedSpotTipImageView redSpotTipImageView;
            if (GroupDelaySetActivity.this.f14719f == GroupDelaySetActivity.this.f14720g) {
                GroupDelaySetActivity.this.f14714a.getRightButton().setOnClickListener((View.OnClickListener) null);
                redSpotTipImageView = GroupDelaySetActivity.this.f14714a.getRightButton();
                groupDelaySetActivity = GroupDelaySetActivity.this;
                i = R$drawable.icon_yeelight_save_unused;
            } else {
                GroupDelaySetActivity.this.f14714a.getRightButton().setOnClickListener(new C8466a());
                redSpotTipImageView = GroupDelaySetActivity.this.f14714a.getRightButton();
                groupDelaySetActivity = GroupDelaySetActivity.this;
                i = R$drawable.round_save;
            }
            redSpotTipImageView.setBackground(ContextCompat.getDrawable(groupDelaySetActivity, i));
            GroupDelaySetActivity groupDelaySetActivity2 = GroupDelaySetActivity.this;
            groupDelaySetActivity2.f14715b.setText(String.format(groupDelaySetActivity2.f14721h, new Object[]{Integer.valueOf(GroupDelaySetActivity.this.f14719f)}));
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.GroupDelaySetActivity$f */
    static class C8467f extends Handler {

        /* renamed from: a */
        WeakReference<GroupDelaySetActivity> f14728a;

        C8467f(GroupDelaySetActivity groupDelaySetActivity) {
            this.f14728a = new WeakReference<>(groupDelaySetActivity);
        }

        public void handleMessage(Message message) {
            if (message.what == 0) {
                ((GroupDelaySetActivity) this.f14728a.get()).mo35656T(((GroupDelaySetActivity) this.f14728a.get()).getString(R$string.feature_delay_not_available));
            }
        }
    }

    public GroupDelaySetActivity() {
        new C8467f(this);
    }

    /* access modifiers changed from: private */
    /* renamed from: b0 */
    public void m20128b0() {
        this.f14718e.mo23186G0(this.f14719f);
        DeviceDataProvider.m17621d0(this.f14718e);
        this.f14720g = this.f14719f;
    }

    /* access modifiers changed from: private */
    /* renamed from: c0 */
    public void m20129c0() {
        this.f14714a.post(new C8465e());
    }

    public void onBackPressed() {
        if (this.f14719f == this.f14720g) {
            finish();
            return;
        }
        C9071c.m21727p(this, getString(R$string.common_text_discard), getString(R$string.common_text_save), getString(R$string.common_text_cancel), new C8463c(), new C8464d());
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo35653P();
        C9193k.m22157h(true, this);
        setContentView(R$layout.activity_wifi_delayset);
        this.f14714a = (CommonTitleBar) findViewById(R$id.title_bar);
        LinearLayout linearLayout = (LinearLayout) findViewById(R$id.delay_switch_layout);
        this.f14715b = (TextView) findViewById(R$id.delay_switch_text_info);
        this.f14716c = (TextView) findViewById(R$id.delay_introduce);
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(R$id.delay_time_area);
        this.f14717d = (NumberPicker) findViewById(R$id.minite);
        TextView textView = (TextView) findViewById(R$id.delay_detail);
        Intent intent = getIntent();
        if (!intent.hasExtra("com.yeelight.cherry.device_id")) {
            AppUtils.m8302w(f14713i, "Activity has not group id", false);
            finish();
            return;
        }
        this.f14718e = (C6119c) YeelightDeviceManager.m7804r0(intent.getStringExtra("com.yeelight.cherry.device_id"));
        this.f14721h = getResources().getString(R$string.feature_delay_info);
        C6119c cVar = this.f14718e;
        if (cVar == null) {
            finish();
            return;
        }
        int D = cVar.mo23181D();
        this.f14719f = D;
        this.f14720g = D;
        this.f14714a.mo36195a(getString(R$string.common_text_delay_off), new C8461a(), (View.OnClickListener) null);
        this.f14714a.setTitleTextSize(16);
        this.f14715b.setText(String.format(this.f14721h, new Object[]{Integer.valueOf(this.f14719f)}));
        this.f14716c.setVisibility(8);
        this.f14717d.setMinValue(1);
        this.f14717d.setMaxValue(60);
        this.f14717d.setWrapSelectorWheel(false);
        this.f14717d.setValue(this.f14719f);
        this.f14717d.setOnValueChangedListener(new C8462b());
    }
}
