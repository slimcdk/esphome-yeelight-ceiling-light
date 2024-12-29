package com.yeelight.cherry.p141ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.miot.api.DeviceManager;
import com.miot.api.MiotManager;
import com.miot.common.device.firmware.MiotFirmware;
import com.miot.common.exception.MiotException;
import com.yeelight.cherry.C12225R$id;
import com.yeelight.cherry.C12228R$layout;
import com.yeelight.yeelib.device.WifiDeviceBase;
import com.yeelight.yeelib.managers.YeelightDeviceManager;
import com.yeelight.yeelib.p142ui.activity.BaseActivity;
import com.yeelight.yeelib.p142ui.view.CommonTitleBar;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import p051j4.C9193k;
import p227x3.C11981q;

/* renamed from: com.yeelight.cherry.ui.activity.FirmwareCenterActivity */
public class FirmwareCenterActivity extends BaseActivity {
    /* access modifiers changed from: private */

    /* renamed from: h */
    public static String f10471h = "FirmwareCenterActivity";

    /* renamed from: a */
    C5307e f10472a;

    /* renamed from: b */
    LinearLayout f10473b;

    /* renamed from: c */
    List<WifiDeviceBase> f10474c = new ArrayList();

    /* renamed from: d */
    ListView f10475d;

    /* renamed from: e */
    LinearLayout f10476e;

    /* renamed from: f */
    TextView f10477f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public Handler f10478g = new C5304c();

    /* renamed from: com.yeelight.cherry.ui.activity.FirmwareCenterActivity$a */
    class C5302a implements View.OnClickListener {
        C5302a() {
        }

        public void onClick(View view) {
            FirmwareCenterActivity.this.onBackPressed();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.FirmwareCenterActivity$b */
    class C5303b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ int f10480a;

        /* renamed from: b */
        final /* synthetic */ int f10481b;

        C5303b(int i, int i2) {
            this.f10480a = i;
            this.f10481b = i2;
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public /* synthetic */ void m16317c(View view) {
            FirmwareCenterActivity.this.m16315k0();
            FirmwareCenterActivity.this.f10472a.notifyDataSetChanged();
            FirmwareCenterActivity.this.f10478g.removeMessages(0);
            FirmwareCenterActivity.this.m16313i0(10000);
        }

        public void run() {
            TextView textView;
            int i;
            LinearLayout linearLayout;
            C5772i1 i1Var = null;
            if (this.f10480a > 0) {
                FirmwareCenterActivity firmwareCenterActivity = FirmwareCenterActivity.this;
                firmwareCenterActivity.f10477f.setTextColor(firmwareCenterActivity.getResources().getColor(2131099841));
                textView = FirmwareCenterActivity.this.f10477f;
                i = 2131755663;
            } else if (this.f10481b > 0) {
                FirmwareCenterActivity firmwareCenterActivity2 = FirmwareCenterActivity.this;
                firmwareCenterActivity2.f10477f.setTextColor(firmwareCenterActivity2.getResources().getColor(2131099805));
                FirmwareCenterActivity.this.f10477f.setText(2131755651);
                FirmwareCenterActivity.this.f10477f.setBackgroundResource(2131230945);
                linearLayout = FirmwareCenterActivity.this.f10476e;
                i1Var = new C5772i1(this);
                linearLayout.setOnClickListener(i1Var);
            } else {
                FirmwareCenterActivity firmwareCenterActivity3 = FirmwareCenterActivity.this;
                firmwareCenterActivity3.f10477f.setTextColor(firmwareCenterActivity3.getResources().getColor(2131099839));
                textView = FirmwareCenterActivity.this.f10477f;
                i = 2131755665;
            }
            textView.setText(i);
            FirmwareCenterActivity firmwareCenterActivity4 = FirmwareCenterActivity.this;
            firmwareCenterActivity4.f10477f.setBackgroundColor(firmwareCenterActivity4.getResources().getColor(2131099843));
            linearLayout = FirmwareCenterActivity.this.f10476e;
            linearLayout.setOnClickListener(i1Var);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.FirmwareCenterActivity$c */
    class C5304c extends Handler {

        /* renamed from: com.yeelight.cherry.ui.activity.FirmwareCenterActivity$c$a */
        class C5305a implements Runnable {
            C5305a() {
            }

            public void run() {
                FirmwareCenterActivity.this.m16314j0();
                FirmwareCenterActivity.this.f10472a.notifyDataSetChanged();
            }
        }

        C5304c() {
        }

        public void handleMessage(Message message) {
            message.getData();
            int i = message.what;
            if (i != 0) {
                if (i == 1 || i == 2 || i == 3) {
                    FirmwareCenterActivity.this.runOnUiThread(new C5305a());
                }
            } else if (FirmwareCenterActivity.this.m16309e0()) {
                FirmwareCenterActivity.this.m16313i0(10000);
            }
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.FirmwareCenterActivity$d */
    class C5306d implements DeviceManager.QueryFirmwareHandler {

        /* renamed from: a */
        final /* synthetic */ WifiDeviceBase f10485a;

        C5306d(WifiDeviceBase wifiDeviceBase) {
            this.f10485a = wifiDeviceBase;
        }

        public void onFailed(int i, String str) {
            String unused = FirmwareCenterActivity.f10471h;
            FirmwareCenterActivity.this.m16312h0();
        }

        public void onSucceed(MiotFirmware miotFirmware) {
            String unused = FirmwareCenterActivity.f10471h;
            StringBuilder sb = new StringBuilder();
            sb.append("queryFirmwareUpgradeInfo onSucceed, miotFirmware upgrading? ");
            sb.append(miotFirmware.isUpgrading());
            new C11981q(miotFirmware).mo42539k(miotFirmware.isUpgrading());
            this.f10485a.mo23191J0(new C11981q(miotFirmware));
            if (miotFirmware.isLatestVersion()) {
                FirmwareCenterActivity.this.m16311g0();
                this.f10485a.mo23169y0();
            }
            if (FirmwareCenterActivity.this.f10474c.size() > 1) {
                FirmwareCenterActivity.this.f10478g.sendEmptyMessage(3);
            }
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.FirmwareCenterActivity$e */
    private class C5307e extends BaseAdapter {

        /* renamed from: com.yeelight.cherry.ui.activity.FirmwareCenterActivity$e$a */
        class C5308a implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ WifiDeviceBase f10488a;

            C5308a(WifiDeviceBase wifiDeviceBase) {
                this.f10488a = wifiDeviceBase;
            }

            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(FirmwareCenterActivity.this, FirmwareUpgradeActivity.class);
                intent.putExtra("com.yeelight.cherry.device_id", this.f10488a.mo23185G());
                FirmwareCenterActivity.this.startActivity(intent);
            }
        }

        /* renamed from: com.yeelight.cherry.ui.activity.FirmwareCenterActivity$e$b */
        class C5309b implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ WifiDeviceBase f10490a;

            /* renamed from: b */
            final /* synthetic */ C5310f f10491b;

            C5309b(WifiDeviceBase wifiDeviceBase, C5310f fVar) {
                this.f10490a = wifiDeviceBase;
                this.f10491b = fVar;
            }

            public void onClick(View view) {
                this.f10490a.mo23137Y0();
                FirmwareCenterActivity.this.f10478g.removeMessages(0);
                FirmwareCenterActivity.this.m16313i0(1000);
                this.f10491b.f10494b.setVisibility(4);
                this.f10491b.f10497e.setVisibility(0);
            }
        }

        private C5307e() {
        }

        /* synthetic */ C5307e(FirmwareCenterActivity firmwareCenterActivity, C5302a aVar) {
            this();
        }

        public int getCount() {
            return FirmwareCenterActivity.this.f10474c.size();
        }

        public Object getItem(int i) {
            return FirmwareCenterActivity.this.f10474c.get(i);
        }

        public long getItemId(int i) {
            return 0;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            C5310f fVar;
            if (view != null) {
                fVar = (C5310f) view.getTag();
            } else {
                C5310f fVar2 = new C5310f();
                View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(2131493138, viewGroup, false);
                fVar2.f10493a = (ImageView) inflate.findViewById(2131296666);
                fVar2.f10495c = (TextView) inflate.findViewById(2131296667);
                fVar2.f10496d = (TextView) inflate.findViewById(2131296668);
                fVar2.f10494b = (TextView) inflate.findViewById(2131296665);
                fVar2.f10497e = (ProgressBar) inflate.findViewById(2131296663);
                fVar2.f10498f = (LinearLayout) inflate.findViewById(2131296791);
                inflate.setTag(fVar2);
                View view2 = inflate;
                fVar = fVar2;
                view = view2;
            }
            WifiDeviceBase wifiDeviceBase = FirmwareCenterActivity.this.f10474c.get(i);
            fVar.f10493a.setBackground(ContextCompat.getDrawable(view.getContext(), wifiDeviceBase.mo23116F()));
            fVar.f10495c.setText(wifiDeviceBase.mo23210U());
            if (wifiDeviceBase.mo23197N() != null) {
                if (wifiDeviceBase.mo23197N().mo42538h()) {
                    fVar.f10496d.setText(FirmwareCenterActivity.this.getText(2131755663));
                    fVar.f10497e.setVisibility(0);
                } else if (wifiDeviceBase.mo23197N().mo42513g()) {
                    fVar.f10496d.setText(String.format(Locale.US, FirmwareCenterActivity.this.getString(2131755657), new Object[]{wifiDeviceBase.mo23197N().mo42512d()}));
                    fVar.f10497e.setVisibility(4);
                    fVar.f10494b.setVisibility(0);
                } else {
                    fVar.f10496d.setText(FirmwareCenterActivity.this.getString(2131755653));
                    fVar.f10497e.setVisibility(4);
                }
                fVar.f10494b.setVisibility(4);
            }
            fVar.f10498f.setOnClickListener(new C5308a(wifiDeviceBase));
            fVar.f10494b.setOnClickListener(new C5309b(wifiDeviceBase, fVar));
            return view;
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.FirmwareCenterActivity$f */
    static class C5310f {

        /* renamed from: a */
        public ImageView f10493a;

        /* renamed from: b */
        public TextView f10494b;

        /* renamed from: c */
        public TextView f10495c;

        /* renamed from: d */
        public TextView f10496d;

        /* renamed from: e */
        public ProgressBar f10497e;

        /* renamed from: f */
        public LinearLayout f10498f;

        C5310f() {
        }
    }

    /* renamed from: d0 */
    private void m16308d0(WifiDeviceBase wifiDeviceBase) {
        try {
            MiotManager.getDeviceManager().queryFirmwareUpgradeInfo(wifiDeviceBase.mo23206S(), new C5306d(wifiDeviceBase));
        } catch (MiotException e) {
            e.printStackTrace();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e0 */
    public boolean m16309e0() {
        return m16310f0(false);
    }

    /* renamed from: f0 */
    private boolean m16310f0(boolean z) {
        boolean z2 = false;
        for (WifiDeviceBase next : this.f10474c) {
            if (next.mo23197N().mo42538h() || z) {
                StringBuilder sb = new StringBuilder();
                sb.append("queryFirmwareUpgradeProgress, query for device: ");
                sb.append(next.mo23185G());
                m16308d0(next);
                z2 = true;
            }
        }
        return z2;
    }

    /* access modifiers changed from: private */
    /* renamed from: g0 */
    public void m16311g0() {
        this.f10478g.sendEmptyMessage(1);
    }

    /* access modifiers changed from: private */
    /* renamed from: h0 */
    public void m16312h0() {
        this.f10478g.sendEmptyMessage(2);
    }

    /* access modifiers changed from: private */
    /* renamed from: i0 */
    public void m16313i0(long j) {
        this.f10478g.sendEmptyMessageDelayed(0, j);
    }

    /* access modifiers changed from: private */
    /* renamed from: j0 */
    public void m16314j0() {
        int i = 0;
        int i2 = 0;
        for (WifiDeviceBase next : this.f10474c) {
            if (next.mo23197N() != null && next.mo23197N().mo42538h()) {
                i++;
            }
            if (next.mo23197N() != null && next.mo23197N().mo42513g()) {
                i2++;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("updateingmnum = ");
        sb.append(i);
        sb.append(", updateAvail = ");
        sb.append(i2);
        this.f10477f.post(new C5303b(i, i2));
    }

    /* access modifiers changed from: private */
    /* renamed from: k0 */
    public void m16315k0() {
        for (WifiDeviceBase Y0 : this.f10474c) {
            Y0.mo23137Y0();
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo35653P();
        C9193k.m22157h(true, this);
        setContentView(C12228R$layout.activity_firmware_update);
        CommonTitleBar commonTitleBar = (CommonTitleBar) findViewById(2131297591);
        commonTitleBar.mo36195a(getText(2131756300).toString(), new C5302a(), (View.OnClickListener) null);
        commonTitleBar.setTitleTextSize(16);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        commonTitleBar.setLayoutParams(layoutParams);
        layoutParams.setMargins(0, C9193k.m22154e(this), 0, 0);
        this.f10475d = (ListView) findViewById(2131296669);
        C5307e eVar = new C5307e(this, (C5302a) null);
        this.f10472a = eVar;
        this.f10475d.setAdapter(eVar);
        this.f10473b = (LinearLayout) findViewById(2131297176);
        this.f10476e = (LinearLayout) findViewById(C12225R$id.update_all_layout);
        this.f10477f = (TextView) findViewById(C12225R$id.update_tips);
        this.f10474c.clear();
        for (WifiDeviceBase next : YeelightDeviceManager.m7800o0().mo23253B0()) {
            if (next.mo23197N() != null && next.mo23197N().mo42513g()) {
                this.f10474c.add(next);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        if (this.f10474c.size() == 0) {
            this.f10473b.setVisibility(0);
            this.f10476e.setVisibility(4);
            this.f10475d.setVisibility(8);
            return;
        }
        if (this.f10474c.size() == 1) {
            this.f10476e.setVisibility(4);
        } else {
            this.f10476e.setVisibility(0);
        }
        this.f10473b.setVisibility(8);
        this.f10472a.notifyDataSetChanged();
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        m16313i0(1000);
        m16314j0();
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        this.f10478g.removeCallbacksAndMessages((Object) null);
    }
}
