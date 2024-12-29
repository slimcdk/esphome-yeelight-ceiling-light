package com.yeelight.cherry.p177ui.activity;

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
import com.yeelight.cherry.C11748R$layout;
import com.yeelight.yeelib.device.models.C7622g;
import com.yeelight.yeelib.p150c.p183m.C7130o0;
import com.yeelight.yeelib.p152f.C4257w;
import com.yeelight.yeelib.p186e.C9768c;
import com.yeelight.yeelib.p194ui.activity.BaseActivity;
import com.yeelight.yeelib.p194ui.view.CommonTitleBar;
import com.yeelight.yeelib.p194ui.widget.C10526e;
import com.yeelight.yeelib.utils.C10547m;
import com.yeelight.yeelib.utils.C4308b;
import java.util.TimeZone;

/* renamed from: com.yeelight.cherry.ui.activity.MeshGatewayControlActivity */
public class MeshGatewayControlActivity extends BaseActivity implements C9768c {

    /* renamed from: d */
    private static final String f11216d = MeshGatewayControlActivity.class.getSimpleName();

    /* renamed from: b */
    private C7130o0 f11217b;

    /* renamed from: c */
    private C10526e f11218c;
    @BindView(2131297424)
    CommonTitleBar mTitleBar;
    @BindView(2131297512)
    TextView mTvVersion;

    /* renamed from: V */
    private int m16620V() {
        TimeZone timeZone = TimeZone.getDefault();
        System.out.println(timeZone.getDisplayName());
        int offset = timeZone.getOffset(System.currentTimeMillis()) / 3600000;
        "getTimeZone timezone: " + offset;
        return -offset;
    }

    /* renamed from: W */
    private String m16621W() {
        StringBuilder sb;
        String str;
        int V = m16620V();
        if (V >= 0) {
            str = "GMT+";
        } else {
            sb = new StringBuilder();
            str = "GMT";
        }
        sb.append(str);
        sb.append(V);
        return String.valueOf(sb.toString());
    }

    /* renamed from: X */
    private void m16622X() {
        String k2 = this.f11217b.mo28583k2();
        if (!TextUtils.isEmpty(k2)) {
            String replace = k2.replace("GMT", "");
            "timezone=: " + replace;
            try {
                if (Integer.valueOf(replace).intValue() != m16620V()) {
                    new Handler().postDelayed(new C5692c1(this), 500);
                }
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c0 */
    public void mo26628Y() {
        C10526e.C10531e eVar = new C10526e.C10531e(this);
        eVar.mo33358i(getString(2131755668));
        eVar.mo33356g(getString(2131755669));
        eVar.mo33353d(-2, getString(2131755667), (DialogInterface.OnClickListener) null);
        eVar.mo33353d(-1, getString(2131755670), new C5697d1(this));
        C10526e b = eVar.mo33351b();
        this.f11218c = b;
        b.show();
    }

    /* renamed from: Z */
    public /* synthetic */ void mo26629Z(View view) {
        onBackPressed();
    }

    /* renamed from: a0 */
    public /* synthetic */ void mo26630a0(View view) {
        Intent intent = new Intent(this, DeviceSettingActivity.class);
        intent.putExtra("com.yeelight.cherry.device_id", this.f11217b.mo23372G());
        startActivity(intent);
    }

    /* renamed from: b0 */
    public /* synthetic */ void mo26631b0(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        this.f11217b.mo28584m2(m16621W());
    }

    public void onConnectionStateChanged(int i, int i2) {
        if (i2 == 0) {
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C10547m.m25758h(true, this);
        setContentView(C11748R$layout.activity_mesh_device_control);
        ButterKnife.bind((Activity) this);
        Intent intent = getIntent();
        if (!intent.hasExtra("com.yeelight.cherry.device_id")) {
            C4308b.m12141t(f11216d, "Activity has not device id", false);
            finish();
            return;
        }
        C7130o0 o0Var = (C7130o0) C4257w.m11945h0(intent.getStringExtra("com.yeelight.cherry.device_id"));
        this.f11217b = o0Var;
        if (o0Var == null || !o0Var.mo23331k0()) {
            BaseActivity.m24384U(this);
            finish();
            return;
        }
        this.mTitleBar.mo32825a(this.f11217b.mo23397U(), new C5702e1(this), new C5687b1(this));
        this.mTitleBar.setTitleTextSize(16);
        C7622g N = this.f11217b.mo23384N();
        if (N != null) {
            this.mTvVersion.setText(String.format(getText(2131756299).toString(), new Object[]{N.mo29040c()}));
        } else {
            this.mTvVersion.setText(String.format(getText(2131756299).toString(), new Object[]{"--"}));
        }
        m16622X();
        this.f11217b.mo23358z0(this);
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        C10526e eVar = this.f11218c;
        if (eVar != null && eVar.isShowing()) {
            this.f11218c.dismiss();
        }
        super.onDestroy();
        this.f11217b.mo23319V0(this);
    }

    public void onLocalConnected() {
    }

    public void onLocalDisconnected() {
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        this.mTitleBar.setTitle(this.f11217b.mo23397U());
    }
}
