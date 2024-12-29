package com.yeelight.cherry.p141ui.activity;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.yeelight.cherry.C12228R$layout;
import com.yeelight.yeelib.managers.YeelightDeviceManager;
import com.yeelight.yeelib.p142ui.activity.BaseActivity;
import com.yeelight.yeelib.p142ui.view.CommonTitleBar;
import com.yeelight.yeelib.utils.AppUtils;
import java.util.TimeZone;
import p051j4.C9193k;
import p170i4.C9113d;
import p223w3.C11571p0;
import p227x3.C11969f;
import p237z3.C12143c;

/* renamed from: com.yeelight.cherry.ui.activity.MeshGatewayControlActivity */
public class MeshGatewayControlActivity extends BaseActivity implements C12143c {

    /* renamed from: c */
    private static final String f10783c = "MeshGatewayControlActivity";

    /* renamed from: d */
    public static final /* synthetic */ int f10784d = 0;

    /* renamed from: a */
    private C11571p0 f10785a;

    /* renamed from: b */
    private C9113d f10786b;
    @BindView(2131297591)
    CommonTitleBar mTitleBar;
    @BindView(2131297691)
    TextView mTvVersion;

    /* renamed from: Z */
    private int m16580Z() {
        TimeZone timeZone = TimeZone.getDefault();
        System.out.println(timeZone.getDisplayName());
        int offset = timeZone.getOffset(System.currentTimeMillis()) / 3600000;
        StringBuilder sb = new StringBuilder();
        sb.append("getTimeZone timezone: ");
        sb.append(offset);
        return -offset;
    }

    /* renamed from: a0 */
    private String m16581a0() {
        StringBuilder sb;
        String str;
        int Z = m16580Z();
        if (Z >= 0) {
            str = "GMT+";
        } else {
            sb = new StringBuilder();
            str = "GMT";
        }
        sb.append(str);
        sb.append(Z);
        return String.valueOf(sb.toString());
    }

    /* renamed from: b0 */
    private void m16582b0() {
        String k2 = this.f10785a.mo42332k2();
        if (!TextUtils.isEmpty(k2)) {
            String replace = k2.replace("GMT", "");
            StringBuilder sb = new StringBuilder();
            sb.append("timezone=: ");
            sb.append(replace);
            try {
                if (Integer.valueOf(replace).intValue() != m16580Z()) {
                    new Handler().postDelayed(new C5842v1(this), 500);
                }
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d0 */
    public /* synthetic */ void m16584d0(View view) {
        onBackPressed();
    }

    /* access modifiers changed from: private */
    /* renamed from: e0 */
    public /* synthetic */ void m16585e0(View view) {
        Intent intent = new Intent(this, DeviceSettingActivity.class);
        intent.putExtra("com.yeelight.cherry.device_id", this.f10785a.mo23185G());
        startActivity(intent);
    }

    /* access modifiers changed from: private */
    /* renamed from: f0 */
    public /* synthetic */ void m16586f0(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        this.f10785a.mo42333m2(m16581a0());
    }

    /* access modifiers changed from: private */
    /* renamed from: g0 */
    public void m16583c0() {
        C9113d b = new C9113d.C9118e(this).mo37179i(getString(2131755676)).mo37177g(getString(2131755677)).mo37174d(-2, getString(2131755674), (DialogInterface.OnClickListener) null).mo37174d(-1, getString(2131755678), new C5827s1(this)).mo37172b();
        this.f10786b = b;
        b.show();
    }

    public void onConnectionStateChanged(int i, int i2) {
        if (i2 == 0) {
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C9193k.m22157h(true, this);
        setContentView(C12228R$layout.activity_mesh_device_control);
        ButterKnife.bind((Activity) this);
        Intent intent = getIntent();
        if (!intent.hasExtra("com.yeelight.cherry.device_id")) {
            AppUtils.m8302w(f10783c, "Activity has not device id", false);
            finish();
            return;
        }
        C11571p0 p0Var = (C11571p0) YeelightDeviceManager.m7794j0(intent.getStringExtra("com.yeelight.cherry.device_id"));
        this.f10785a = p0Var;
        if (p0Var == null || !p0Var.mo23145k0()) {
            BaseActivity.m19947U(this);
            finish();
            return;
        }
        this.mTitleBar.mo36195a(this.f10785a.mo23210U(), new C5832t1(this), new C5837u1(this));
        this.mTitleBar.setTitleTextSize(16);
        C11969f N = this.f10785a.mo23197N();
        if (N != null) {
            this.mTvVersion.setText(String.format(getText(2131756328).toString(), new Object[]{N.mo42511c()}));
        } else {
            this.mTvVersion.setText(String.format(getText(2131756328).toString(), new Object[]{"--"}));
        }
        m16582b0();
        this.f10785a.mo23171z0(this);
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        C9113d dVar = this.f10786b;
        if (dVar != null && dVar.isShowing()) {
            this.f10786b.dismiss();
        }
        super.onDestroy();
        this.f10785a.mo23133V0(this);
    }

    public void onLocalConnected() {
    }

    public void onLocalDisconnected() {
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        this.mTitleBar.setTitle(this.f10785a.mo23210U());
    }
}
