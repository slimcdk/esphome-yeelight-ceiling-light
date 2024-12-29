package com.yeelight.cherry.p177ui.activity;

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
import com.yeelight.cherry.C11745R$id;
import com.yeelight.cherry.C11748R$layout;
import com.yeelight.yeelib.device.models.C7640n0;
import com.yeelight.yeelib.p150c.C6006h;
import com.yeelight.yeelib.p152f.C4257w;
import com.yeelight.yeelib.p194ui.activity.BaseActivity;
import com.yeelight.yeelib.p194ui.view.CommonTitleBar;
import com.yeelight.yeelib.utils.C10547m;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* renamed from: com.yeelight.cherry.ui.activity.FirmwareCenterActivity */
public class FirmwareCenterActivity extends BaseActivity {
    /* access modifiers changed from: private */

    /* renamed from: i */
    public static String f10906i = FirmwareCenterActivity.class.getSimpleName();

    /* renamed from: b */
    C5259e f10907b;

    /* renamed from: c */
    LinearLayout f10908c;

    /* renamed from: d */
    List<C6006h> f10909d = new ArrayList();

    /* renamed from: e */
    ListView f10910e;

    /* renamed from: f */
    LinearLayout f10911f;

    /* renamed from: g */
    TextView f10912g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public Handler f10913h = new C5256c();

    /* renamed from: com.yeelight.cherry.ui.activity.FirmwareCenterActivity$a */
    class C5253a implements View.OnClickListener {
        C5253a() {
        }

        public void onClick(View view) {
            FirmwareCenterActivity.this.onBackPressed();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.FirmwareCenterActivity$b */
    class C5254b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ int f10915a;

        /* renamed from: b */
        final /* synthetic */ int f10916b;

        /* renamed from: com.yeelight.cherry.ui.activity.FirmwareCenterActivity$b$a */
        class C5255a implements View.OnClickListener {
            C5255a() {
            }

            public void onClick(View view) {
                FirmwareCenterActivity.this.m16379k0();
                FirmwareCenterActivity.this.f10907b.notifyDataSetChanged();
                FirmwareCenterActivity.this.f10913h.removeMessages(0);
                FirmwareCenterActivity.this.m16377i0(10000);
            }
        }

        C5254b(int i, int i2) {
            this.f10915a = i;
            this.f10916b = i2;
        }

        public void run() {
            TextView textView;
            int i;
            LinearLayout linearLayout;
            C5255a aVar = null;
            if (this.f10915a > 0) {
                FirmwareCenterActivity firmwareCenterActivity = FirmwareCenterActivity.this;
                firmwareCenterActivity.f10912g.setTextColor(firmwareCenterActivity.getResources().getColor(2131099838));
                textView = FirmwareCenterActivity.this.f10912g;
                i = 2131755657;
            } else if (this.f10916b > 0) {
                FirmwareCenterActivity firmwareCenterActivity2 = FirmwareCenterActivity.this;
                firmwareCenterActivity2.f10912g.setTextColor(firmwareCenterActivity2.getResources().getColor(2131099802));
                FirmwareCenterActivity.this.f10912g.setText(2131755645);
                FirmwareCenterActivity.this.f10912g.setBackgroundResource(2131230931);
                linearLayout = FirmwareCenterActivity.this.f10911f;
                aVar = new C5255a();
                linearLayout.setOnClickListener(aVar);
            } else {
                FirmwareCenterActivity firmwareCenterActivity3 = FirmwareCenterActivity.this;
                firmwareCenterActivity3.f10912g.setTextColor(firmwareCenterActivity3.getResources().getColor(2131099836));
                textView = FirmwareCenterActivity.this.f10912g;
                i = 2131755659;
            }
            textView.setText(i);
            FirmwareCenterActivity firmwareCenterActivity4 = FirmwareCenterActivity.this;
            firmwareCenterActivity4.f10912g.setBackgroundColor(firmwareCenterActivity4.getResources().getColor(2131099840));
            linearLayout = FirmwareCenterActivity.this.f10911f;
            linearLayout.setOnClickListener(aVar);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.FirmwareCenterActivity$c */
    class C5256c extends Handler {

        /* renamed from: com.yeelight.cherry.ui.activity.FirmwareCenterActivity$c$a */
        class C5257a implements Runnable {
            C5257a() {
            }

            public void run() {
                FirmwareCenterActivity.this.m16378j0();
                FirmwareCenterActivity.this.f10907b.notifyDataSetChanged();
            }
        }

        C5256c() {
        }

        public void handleMessage(Message message) {
            message.getData();
            int i = message.what;
            if (i != 0) {
                if (i == 1 || i == 2 || i == 3) {
                    FirmwareCenterActivity.this.runOnUiThread(new C5257a());
                }
            } else if (FirmwareCenterActivity.this.m16373e0()) {
                FirmwareCenterActivity.this.m16377i0(10000);
            }
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.FirmwareCenterActivity$d */
    class C5258d implements DeviceManager.QueryFirmwareHandler {

        /* renamed from: a */
        final /* synthetic */ C6006h f10921a;

        C5258d(C6006h hVar) {
            this.f10921a = hVar;
        }

        public void onFailed(int i, String str) {
            String unused = FirmwareCenterActivity.f10906i;
            FirmwareCenterActivity.this.m16376h0();
        }

        public void onSucceed(MiotFirmware miotFirmware) {
            String unused = FirmwareCenterActivity.f10906i;
            "queryFirmwareUpgradeInfo onSucceed, miotFirmware upgrading? " + miotFirmware.isUpgrading();
            new C7640n0(miotFirmware).mo29068k(miotFirmware.isUpgrading());
            this.f10921a.mo23378J0(new C7640n0(miotFirmware));
            if (miotFirmware.isLatestVersion()) {
                FirmwareCenterActivity.this.m16375g0();
                this.f10921a.mo23356y0();
            }
            if (FirmwareCenterActivity.this.f10909d.size() > 1) {
                FirmwareCenterActivity.this.f10913h.sendEmptyMessage(3);
            }
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.FirmwareCenterActivity$e */
    private class C5259e extends BaseAdapter {

        /* renamed from: com.yeelight.cherry.ui.activity.FirmwareCenterActivity$e$a */
        class C5260a implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ C6006h f10924a;

            C5260a(C6006h hVar) {
                this.f10924a = hVar;
            }

            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(FirmwareCenterActivity.this, FirmwareUpgradeActivity.class);
                intent.putExtra("com.yeelight.cherry.device_id", this.f10924a.mo23372G());
                FirmwareCenterActivity.this.startActivity(intent);
            }
        }

        /* renamed from: com.yeelight.cherry.ui.activity.FirmwareCenterActivity$e$b */
        class C5261b implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ C6006h f10926a;

            /* renamed from: b */
            final /* synthetic */ C5262f f10927b;

            C5261b(C6006h hVar, C5262f fVar) {
                this.f10926a = hVar;
                this.f10927b = fVar;
            }

            public void onClick(View view) {
                this.f10926a.mo23323Y0();
                FirmwareCenterActivity.this.f10913h.removeMessages(0);
                FirmwareCenterActivity.this.m16377i0(1000);
                this.f10927b.f10930b.setVisibility(4);
                this.f10927b.f10933e.setVisibility(0);
            }
        }

        private C5259e() {
        }

        /* synthetic */ C5259e(FirmwareCenterActivity firmwareCenterActivity, C5253a aVar) {
            this();
        }

        public int getCount() {
            return FirmwareCenterActivity.this.f10909d.size();
        }

        public Object getItem(int i) {
            return FirmwareCenterActivity.this.f10909d.get(i);
        }

        public long getItemId(int i) {
            return 0;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            C5262f fVar;
            if (view != null) {
                fVar = (C5262f) view.getTag();
            } else {
                C5262f fVar2 = new C5262f();
                View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(2131493134, viewGroup, false);
                fVar2.f10929a = (ImageView) inflate.findViewById(2131296588);
                fVar2.f10931c = (TextView) inflate.findViewById(2131296589);
                fVar2.f10932d = (TextView) inflate.findViewById(2131296590);
                fVar2.f10930b = (TextView) inflate.findViewById(2131296587);
                fVar2.f10933e = (ProgressBar) inflate.findViewById(2131296585);
                fVar2.f10934f = (LinearLayout) inflate.findViewById(2131296697);
                inflate.setTag(fVar2);
                View view2 = inflate;
                fVar = fVar2;
                view = view2;
            }
            C6006h hVar = FirmwareCenterActivity.this.f10909d.get(i);
            fVar.f10929a.setBackground(ContextCompat.getDrawable(view.getContext(), hVar.mo23303F()));
            fVar.f10931c.setText(hVar.mo23397U());
            if (hVar.mo23384N() != null) {
                if (hVar.mo23384N().mo29067h()) {
                    fVar.f10932d.setText(FirmwareCenterActivity.this.getText(2131755657));
                    fVar.f10933e.setVisibility(0);
                } else if (hVar.mo23384N().mo29042g()) {
                    fVar.f10932d.setText(String.format(Locale.US, FirmwareCenterActivity.this.getString(2131755651), new Object[]{hVar.mo23384N().mo29041d()}));
                    fVar.f10933e.setVisibility(4);
                    fVar.f10930b.setVisibility(0);
                } else {
                    fVar.f10932d.setText(FirmwareCenterActivity.this.getString(2131755647));
                    fVar.f10933e.setVisibility(4);
                }
                fVar.f10930b.setVisibility(4);
            }
            fVar.f10934f.setOnClickListener(new C5260a(hVar));
            fVar.f10930b.setOnClickListener(new C5261b(hVar, fVar));
            return view;
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.FirmwareCenterActivity$f */
    static class C5262f {

        /* renamed from: a */
        public ImageView f10929a;

        /* renamed from: b */
        public TextView f10930b;

        /* renamed from: c */
        public TextView f10931c;

        /* renamed from: d */
        public TextView f10932d;

        /* renamed from: e */
        public ProgressBar f10933e;

        /* renamed from: f */
        public LinearLayout f10934f;

        C5262f() {
        }
    }

    /* renamed from: d0 */
    private void m16372d0(C6006h hVar) {
        try {
            MiotManager.getDeviceManager().queryFirmwareUpgradeInfo(hVar.mo23393S(), new C5258d(hVar));
        } catch (MiotException e) {
            e.printStackTrace();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e0 */
    public boolean m16373e0() {
        return m16374f0(false);
    }

    /* renamed from: f0 */
    private boolean m16374f0(boolean z) {
        boolean z2 = false;
        for (C6006h next : this.f10909d) {
            if (next.mo23384N().mo29067h() || z) {
                "queryFirmwareUpgradeProgress, query for device: " + next.mo23372G();
                m16372d0(next);
                z2 = true;
            }
        }
        return z2;
    }

    /* access modifiers changed from: private */
    /* renamed from: g0 */
    public void m16375g0() {
        this.f10913h.sendEmptyMessage(1);
    }

    /* access modifiers changed from: private */
    /* renamed from: h0 */
    public void m16376h0() {
        this.f10913h.sendEmptyMessage(2);
    }

    /* access modifiers changed from: private */
    /* renamed from: i0 */
    public void m16377i0(long j) {
        this.f10913h.sendEmptyMessageDelayed(0, j);
    }

    /* access modifiers changed from: private */
    /* renamed from: j0 */
    public void m16378j0() {
        int i = 0;
        int i2 = 0;
        for (C6006h next : this.f10909d) {
            if (next.mo23384N() != null && next.mo23384N().mo29067h()) {
                i++;
            }
            if (next.mo23384N() != null && next.mo23384N().mo29042g()) {
                i2++;
            }
        }
        "updateingmnum = " + i + ", updateAvail = " + i2;
        this.f10912g.post(new C5254b(i, i2));
    }

    /* access modifiers changed from: private */
    /* renamed from: k0 */
    public void m16379k0() {
        for (C6006h Y0 : this.f10909d) {
            Y0.mo23323Y0();
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo32193P();
        C10547m.m25758h(true, this);
        setContentView(C11748R$layout.activity_firmware_update);
        CommonTitleBar commonTitleBar = (CommonTitleBar) findViewById(2131297424);
        commonTitleBar.mo32825a(getText(2131756271).toString(), new C5253a(), (View.OnClickListener) null);
        commonTitleBar.setTitleTextSize(16);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        commonTitleBar.setLayoutParams(layoutParams);
        layoutParams.setMargins(0, C10547m.m25755e(this), 0, 0);
        this.f10910e = (ListView) findViewById(2131296591);
        C5259e eVar = new C5259e(this, (C5253a) null);
        this.f10907b = eVar;
        this.f10910e.setAdapter(eVar);
        this.f10908c = (LinearLayout) findViewById(2131297053);
        this.f10911f = (LinearLayout) findViewById(C11745R$id.update_all_layout);
        this.f10912g = (TextView) findViewById(C11745R$id.update_tips);
        this.f10909d.clear();
        for (C6006h next : C4257w.m11947l0().mo23697y0()) {
            if (next.mo23384N() != null && next.mo23384N().mo29042g()) {
                this.f10909d.add(next);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        if (this.f10909d.size() == 0) {
            this.f10908c.setVisibility(0);
            this.f10911f.setVisibility(4);
            this.f10910e.setVisibility(8);
            return;
        }
        if (this.f10909d.size() == 1) {
            this.f10911f.setVisibility(4);
        } else {
            this.f10911f.setVisibility(0);
        }
        this.f10908c.setVisibility(8);
        this.f10907b.notifyDataSetChanged();
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        m16377i0(1000);
        m16378j0();
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        this.f10913h.removeCallbacksAndMessages((Object) null);
    }
}
