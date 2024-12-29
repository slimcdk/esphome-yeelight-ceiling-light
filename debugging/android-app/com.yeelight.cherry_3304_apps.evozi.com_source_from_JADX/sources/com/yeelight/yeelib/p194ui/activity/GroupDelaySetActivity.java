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
import com.yeelight.yeelib.p150c.C5980c;
import com.yeelight.yeelib.p152f.C4257w;
import com.yeelight.yeelib.p191j.p192a.C9897c;
import com.yeelight.yeelib.p194ui.view.CommonTitleBar;
import com.yeelight.yeelib.p194ui.view.NumberPicker;
import com.yeelight.yeelib.p194ui.view.RedSpotTipImageView;
import com.yeelight.yeelib.utils.C10547m;
import com.yeelight.yeelib.utils.C4308b;
import java.lang.ref.WeakReference;

/* renamed from: com.yeelight.yeelib.ui.activity.GroupDelaySetActivity */
public class GroupDelaySetActivity extends BaseActivity {

    /* renamed from: j */
    private static final String f18405j = GroupDelaySetActivity.class.getSimpleName();

    /* renamed from: b */
    CommonTitleBar f18406b;

    /* renamed from: c */
    TextView f18407c;

    /* renamed from: d */
    TextView f18408d;

    /* renamed from: e */
    NumberPicker f18409e;

    /* renamed from: f */
    private C5980c f18410f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public int f18411g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public int f18412h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public String f18413i;

    /* renamed from: com.yeelight.yeelib.ui.activity.GroupDelaySetActivity$a */
    class C10043a implements View.OnClickListener {
        C10043a() {
        }

        public void onClick(View view) {
            GroupDelaySetActivity.this.onBackPressed();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.GroupDelaySetActivity$b */
    class C10044b implements NumberPicker.C10469i {
        C10044b() {
        }

        /* renamed from: a */
        public void mo32336a(NumberPicker numberPicker, int i, int i2) {
            int unused = GroupDelaySetActivity.this.f18411g = i2;
            GroupDelaySetActivity.this.m24535c0();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.GroupDelaySetActivity$c */
    class C10045c implements C9897c.C9901d {
        C10045c() {
        }

        /* renamed from: a */
        public void mo27312a(String str, C9897c cVar) {
            GroupDelaySetActivity.this.m24534b0();
            GroupDelaySetActivity.this.finish();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.GroupDelaySetActivity$d */
    class C10046d implements C9897c.C9901d {
        C10046d() {
        }

        /* renamed from: a */
        public void mo27312a(String str, C9897c cVar) {
            GroupDelaySetActivity.this.finish();
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.GroupDelaySetActivity$e */
    class C10047e implements Runnable {

        /* renamed from: com.yeelight.yeelib.ui.activity.GroupDelaySetActivity$e$a */
        class C10048a implements View.OnClickListener {
            C10048a() {
            }

            public void onClick(View view) {
                GroupDelaySetActivity.this.m24534b0();
                GroupDelaySetActivity.this.finish();
            }
        }

        C10047e() {
        }

        public void run() {
            int i;
            GroupDelaySetActivity groupDelaySetActivity;
            RedSpotTipImageView redSpotTipImageView;
            if (GroupDelaySetActivity.this.f18411g == GroupDelaySetActivity.this.f18412h) {
                GroupDelaySetActivity.this.f18406b.getRightButton().setOnClickListener((View.OnClickListener) null);
                redSpotTipImageView = GroupDelaySetActivity.this.f18406b.getRightButton();
                groupDelaySetActivity = GroupDelaySetActivity.this;
                i = R$drawable.icon_yeelight_save_unused;
            } else {
                GroupDelaySetActivity.this.f18406b.getRightButton().setOnClickListener(new C10048a());
                redSpotTipImageView = GroupDelaySetActivity.this.f18406b.getRightButton();
                groupDelaySetActivity = GroupDelaySetActivity.this;
                i = R$drawable.round_save;
            }
            redSpotTipImageView.setBackground(ContextCompat.getDrawable(groupDelaySetActivity, i));
            GroupDelaySetActivity groupDelaySetActivity2 = GroupDelaySetActivity.this;
            groupDelaySetActivity2.f18407c.setText(String.format(groupDelaySetActivity2.f18413i, new Object[]{Integer.valueOf(GroupDelaySetActivity.this.f18411g)}));
        }
    }

    /* renamed from: com.yeelight.yeelib.ui.activity.GroupDelaySetActivity$f */
    static class C10049f extends Handler {

        /* renamed from: a */
        WeakReference<GroupDelaySetActivity> f18420a;

        C10049f(GroupDelaySetActivity groupDelaySetActivity) {
            this.f18420a = new WeakReference<>(groupDelaySetActivity);
        }

        public void handleMessage(Message message) {
            if (message.what == 0) {
                ((GroupDelaySetActivity) this.f18420a.get()).mo32196T(((GroupDelaySetActivity) this.f18420a.get()).getString(R$string.feature_delay_not_available));
            }
        }
    }

    public GroupDelaySetActivity() {
        new C10049f(this);
    }

    /* access modifiers changed from: private */
    /* renamed from: b0 */
    public void m24534b0() {
        this.f18410f.mo23373G0(this.f18411g);
        DeviceDataProvider.m22399d0(this.f18410f);
        this.f18412h = this.f18411g;
    }

    /* access modifiers changed from: private */
    /* renamed from: c0 */
    public void m24535c0() {
        this.f18406b.post(new C10047e());
    }

    public void onBackPressed() {
        if (this.f18411g == this.f18412h) {
            finish();
            return;
        }
        C9897c.m24274p(this, getString(R$string.common_text_discard), getString(R$string.common_text_save), getString(R$string.common_text_cancel), new C10045c(), new C10046d());
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo32193P();
        C10547m.m25758h(true, this);
        setContentView(R$layout.activity_wifi_delayset);
        this.f18406b = (CommonTitleBar) findViewById(R$id.title_bar);
        LinearLayout linearLayout = (LinearLayout) findViewById(R$id.delay_switch_layout);
        this.f18407c = (TextView) findViewById(R$id.delay_switch_text_info);
        this.f18408d = (TextView) findViewById(R$id.delay_introduce);
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(R$id.delay_time_area);
        this.f18409e = (NumberPicker) findViewById(R$id.minite);
        TextView textView = (TextView) findViewById(R$id.delay_detail);
        Intent intent = getIntent();
        if (!intent.hasExtra("com.yeelight.cherry.device_id")) {
            C4308b.m12141t(f18405j, "Activity has not group id", false);
            finish();
            return;
        }
        this.f18410f = (C5980c) C4257w.m11953o0(intent.getStringExtra("com.yeelight.cherry.device_id"));
        this.f18413i = getResources().getString(R$string.feature_delay_info);
        C5980c cVar = this.f18410f;
        if (cVar == null) {
            finish();
            return;
        }
        int D = cVar.mo23368D();
        this.f18411g = D;
        this.f18412h = D;
        this.f18406b.mo32825a(getString(R$string.feature_delay), new C10043a(), (View.OnClickListener) null);
        this.f18406b.setTitleTextSize(16);
        this.f18407c.setText(String.format(this.f18413i, new Object[]{Integer.valueOf(this.f18411g)}));
        this.f18408d.setVisibility(8);
        this.f18409e.setMinValue(1);
        this.f18409e.setMaxValue(60);
        this.f18409e.setWrapSelectorWheel(false);
        this.f18409e.setValue(this.f18411g);
        this.f18409e.setOnValueChangedListener(new C10044b());
    }
}
