package com.yeelight.cherry.p177ui.activity;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.ContentObserver;
import android.graphics.Paint;
import android.location.LocationManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.provider.Settings;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.yeelight.cherry.C11744R$drawable;
import com.yeelight.cherry.C11745R$id;
import com.yeelight.cherry.C11748R$layout;
import com.yeelight.cherry.p174b.p175a.C4960c;
import com.yeelight.cherry.p177ui.adapter.AutoSearchAdapter;
import com.yeelight.cherry.p177ui.adapter.DeviceCategoryAdapter;
import com.yeelight.yeelib.p150c.p151i.C4200i;
import com.yeelight.yeelib.p152f.C4239r;
import com.yeelight.yeelib.p152f.C4257w;
import com.yeelight.yeelib.p152f.C4297y;
import com.yeelight.yeelib.p152f.C9784e;
import com.yeelight.yeelib.p153g.C9853v;
import com.yeelight.yeelib.p186e.C9769d;
import com.yeelight.yeelib.p194ui.view.CommonTitleBar;
import com.yeelight.yeelib.utils.C10547m;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.yeelight.cherry.ui.activity.SearchDeviceAutoActivity */
public class SearchDeviceAutoActivity extends ScanDeviceBaseActivity implements C9769d {
    /* access modifiers changed from: private */

    /* renamed from: n */
    public static final String f11798n = SearchDeviceAutoActivity.class.getSimpleName();

    /* renamed from: e */
    private final Handler f11799e = new Handler(Looper.getMainLooper(), new C5758p2(this));

    /* renamed from: f */
    private final BroadcastReceiver f11800f = new C5632a();

    /* renamed from: g */
    private final BroadcastReceiver f11801g = new C5633b();

    /* renamed from: h */
    private final ContentObserver f11802h = new C5634c((Handler) null);
    /* access modifiers changed from: private */

    /* renamed from: i */
    public LocationManager f11803i;

    /* renamed from: j */
    private AutoSearchAdapter f11804j;

    /* renamed from: k */
    private int f11805k;

    /* renamed from: l */
    private List<C4960c> f11806l = new ArrayList();

    /* renamed from: m */
    private List<C9853v> f11807m = new ArrayList();
    @BindView(2131296476)
    View mClScnanning;
    @BindView(2131296800)
    ImageView mImgMore;
    @BindView(2131296811)
    ImageView mImgScanning;
    @BindView(2131297242)
    RecyclerView mRvCategory;
    @BindView(2131297245)
    RecyclerView mRvScannedDevice;
    @BindView(2131297424)
    CommonTitleBar mTitleBar;
    @BindView(2131297480)
    TextView mTvGoSetting;
    @BindView(2131297492)
    TextView mTvPermissionDenied;
    @BindView(2131297500)
    TextView mTvScanNoDevice;

    /* renamed from: com.yeelight.cherry.ui.activity.SearchDeviceAutoActivity$a */
    class C5632a extends BroadcastReceiver {
        C5632a() {
        }

        public void onReceive(Context context, Intent intent) {
            if (intent.getAction().equals("android.net.wifi.WIFI_STATE_CHANGED") && intent.getIntExtra("wifi_state", 0) == 3) {
                boolean unused = SearchDeviceAutoActivity.this.m17029e0(2);
            }
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.SearchDeviceAutoActivity$b */
    class C5633b extends BroadcastReceiver {
        C5633b() {
        }

        public void onReceive(Context context, Intent intent) {
            if (intent.getIntExtra("android.bluetooth.adapter.extra.STATE", 10) == 12) {
                boolean unused = SearchDeviceAutoActivity.this.m17029e0(3);
            }
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.SearchDeviceAutoActivity$c */
    class C5634c extends ContentObserver {
        C5634c(Handler handler) {
            super(handler);
        }

        public void onChange(boolean z) {
            super.onChange(z);
            boolean isProviderEnabled = SearchDeviceAutoActivity.this.f11803i.isProviderEnabled("gps");
            String unused = SearchDeviceAutoActivity.f11798n;
            "gps enabled: " + isProviderEnabled;
            if (isProviderEnabled) {
                boolean unused2 = SearchDeviceAutoActivity.this.m17029e0(4);
            }
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.SearchDeviceAutoActivity$d */
    class C5635d extends ClickableSpan {
        C5635d() {
        }

        public void onClick(View view) {
            SearchDeviceAutoActivity.this.startActivity(new Intent(SearchDeviceAutoActivity.this, ScanHelpCenterActivity.class));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e0 */
    public boolean m17029e0(int i) {
        "checkScanPermissions: " + i;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        LocationManager locationManager = (LocationManager) getSystemService("location");
                        if (!locationManager.isProviderEnabled("gps") || !locationManager.isProviderEnabled("network")) {
                            this.f11799e.removeMessages(4);
                            this.f11799e.sendEmptyMessageDelayed(4, 500);
                        } else {
                            this.f11799e.removeMessages(5);
                            this.f11799e.sendEmptyMessageDelayed(5, 500);
                            return true;
                        }
                    }
                    return false;
                } else if (ContextCompat.checkSelfPermission(this, "android.permission.ACCESS_COARSE_LOCATION") == 0 && ContextCompat.checkSelfPermission(this, "android.permission.ACCESS_FINE_LOCATION") == 0) {
                    return m17029e0(4);
                } else {
                    this.f11799e.removeMessages(3);
                    this.f11799e.sendEmptyMessageDelayed(3, 500);
                    return false;
                }
            } else if (C9784e.m23711b().mo31627c()) {
                return m17029e0(3);
            } else {
                this.f11799e.removeMessages(2);
                this.f11799e.sendEmptyMessageDelayed(2, 500);
                return false;
            }
        } else if (C9784e.m23711b().mo31629e()) {
            return m17029e0(2);
        } else {
            this.f11799e.removeMessages(1);
            this.f11799e.sendEmptyMessageDelayed(1, 500);
            return false;
        }
    }

    /* renamed from: m0 */
    private void m17031m0(boolean z) {
        int i = 0;
        this.mClScnanning.setVisibility(z ? 0 : 4);
        this.mTvPermissionDenied.setVisibility(z ? 4 : 0);
        TextView textView = this.mTvGoSetting;
        if (z) {
            i = 4;
        }
        textView.setVisibility(i);
        if (z) {
            RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 360.0f, 1, 0.5f, 1, 0.5f);
            rotateAnimation.setDuration(1000);
            rotateAnimation.setInterpolator(new LinearInterpolator());
            rotateAnimation.setRepeatMode(-1);
            rotateAnimation.setRepeatCount(-1);
            this.mImgScanning.startAnimation(rotateAnimation);
        }
    }

    /* renamed from: n0 */
    private void m17032n0(int i) {
        int i2;
        View inflate = View.inflate(this, C11748R$layout.dialog_device_scan_permission_denied, (ViewGroup) null);
        TextView textView = (TextView) inflate.findViewById(C11745R$id.tv_permission_content);
        ImageView imageView = (ImageView) inflate.findViewById(C11745R$id.img_permission_type);
        if (i == 1) {
            textView.setText(2131755198);
            i2 = C11744R$drawable.icon_device_permission_wifi;
        } else if (i != 2) {
            if (i == 3 || i == 4) {
                textView.setText(2131755518);
                i2 = C11744R$drawable.icon_device_permission_location;
            }
            inflate.setLayerType(1, (Paint) null);
            AlertDialog create = new AlertDialog.Builder(this, 2131820937).create();
            create.requestWindowFeature(1);
            create.setCancelable(false);
            create.show();
            create.setContentView(inflate);
            inflate.findViewById(2131296422).setOnClickListener(new C5768r2(create));
            inflate.findViewById(2131296433).setOnClickListener(new C5785v2(this, create, i));
            Display defaultDisplay = getWindowManager().getDefaultDisplay();
            WindowManager.LayoutParams attributes = create.getWindow().getAttributes();
            attributes.height = -2;
            double width = (double) defaultDisplay.getWidth();
            Double.isNaN(width);
            attributes.width = (int) (width * 0.78d);
            create.getWindow().setAttributes(attributes);
        } else {
            textView.setText(2131755193);
            i2 = C11744R$drawable.icon_device_permission_bluetooth;
        }
        imageView.setImageResource(i2);
        inflate.setLayerType(1, (Paint) null);
        AlertDialog create2 = new AlertDialog.Builder(this, 2131820937).create();
        create2.requestWindowFeature(1);
        create2.setCancelable(false);
        create2.show();
        create2.setContentView(inflate);
        inflate.findViewById(2131296422).setOnClickListener(new C5768r2(create2));
        inflate.findViewById(2131296433).setOnClickListener(new C5785v2(this, create2, i));
        Display defaultDisplay2 = getWindowManager().getDefaultDisplay();
        WindowManager.LayoutParams attributes2 = create2.getWindow().getAttributes();
        attributes2.height = -2;
        double width2 = (double) defaultDisplay2.getWidth();
        Double.isNaN(width2);
        attributes2.width = (int) (width2 * 0.78d);
        create2.getWindow().setAttributes(attributes2);
    }

    /* access modifiers changed from: private */
    /* renamed from: o0 */
    public void mo26929j0() {
        this.f11805k++;
        C4257w.m11947l0().mo23655X(true, true, false);
    }

    /* renamed from: p0 */
    private void m17034p0() {
        C4257w.m11947l0().mo23694w1();
        C4257w.m11947l0().mo23696x1();
    }

    /* renamed from: E */
    public void mo26093E(C4200i iVar) {
    }

    /* renamed from: L */
    public void mo26094L() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a0 */
    public void mo26880a0(List<C4960c> list) {
        this.f11806l.clear();
        this.f11806l.addAll(list);
        int i = 0;
        this.mRvScannedDevice.setVisibility(this.f11806l.size() > 0 ? 0 : 4);
        this.mTvScanNoDevice.setVisibility(this.f11806l.size() > 0 ? 4 : 0);
        ImageView imageView = this.mImgMore;
        if (this.f11806l.size() <= 3) {
            i = 4;
        }
        imageView.setVisibility(i);
        this.f11804j.notifyDataSetChanged();
    }

    /* renamed from: f0 */
    public /* synthetic */ boolean mo26925f0(Message message) {
        int i = message.what;
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
                m17032n0(i);
                return false;
            case 5:
                m17031m0(true);
                mo26929j0();
                return false;
            case 6:
                mo32196T("权限已拒绝，请开启");
                return false;
            default:
                return false;
        }
    }

    /* renamed from: g0 */
    public /* synthetic */ void mo26926g0(View view) {
        onBackPressed();
    }

    /* renamed from: h0 */
    public /* synthetic */ void mo26927h0(View view) {
        startActivity(new Intent(this, ScanHelpCenterActivity.class));
    }

    /* renamed from: i0 */
    public /* synthetic */ void mo26928i0(int i, C4960c cVar) {
        mo26879Z(cVar);
    }

    /* renamed from: k */
    public void mo26095k() {
    }

    /* renamed from: l0 */
    public /* synthetic */ void mo26930l0(AlertDialog alertDialog, int i, View view) {
        alertDialog.dismiss();
        if (i == 1) {
            C4297y.m12064f().mo23737m(this, true);
        } else if (i == 2) {
            C4297y.m12064f().mo23731b().enable();
        } else if (i == 3) {
            ActivityCompat.requestPermissions(this, new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, 1000);
        } else if (i == 4) {
            startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
        }
    }

    /* renamed from: m */
    public void mo26096m(C4200i iVar) {
    }

    /* renamed from: o */
    public void mo26097o() {
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C11748R$layout.activity_search_device_auto);
        C10547m.m25758h(true, this);
        ButterKnife.bind((Activity) this);
        this.mTitleBar.mo32825a(getString(2131755213), new C5781u2(this), new C5763q2(this));
        this.mTitleBar.setTitleTextSize(16);
        this.mTitleBar.setTitleTextColor(2131099837);
        String string = getString(2131755478);
        String string2 = getString(2131755472);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string + string2);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(ContextCompat.getColor(this, 2131099842)), string.length(), string.length() + string2.length(), 33);
        spannableStringBuilder.setSpan(new C5635d(), string.length(), string.length() + string2.length(), 33);
        this.mTvScanNoDevice.setMovementMethod(LinkMovementMethod.getInstance());
        this.mTvScanNoDevice.setText(spannableStringBuilder);
        registerReceiver(this.f11801g, new IntentFilter("android.bluetooth.adapter.action.STATE_CHANGED"));
        registerReceiver(this.f11800f, new IntentFilter("android.net.wifi.WIFI_STATE_CHANGED"));
        if (!m17029e0(1)) {
            m17031m0(false);
        }
        this.f11803i = (LocationManager) getSystemService("location");
        getContentResolver().registerContentObserver(Settings.Secure.getUriFor("location_providers_allowed"), false, this.f11802h);
        AutoSearchAdapter autoSearchAdapter = new AutoSearchAdapter(this, this.f11806l, 0);
        this.f11804j = autoSearchAdapter;
        autoSearchAdapter.mo27136f(new C5773s2(this));
        this.mRvScannedDevice.setLayoutManager(new LinearLayoutManager(this, 0, false));
        this.mRvScannedDevice.setAdapter(this.f11804j);
        this.mRvScannedDevice.setVisibility(4);
        ArrayList arrayList = new ArrayList();
        this.f11807m = arrayList;
        arrayList.addAll(C4239r.m11807g().mo23576i());
        DeviceCategoryAdapter deviceCategoryAdapter = new DeviceCategoryAdapter(this, C4239r.m11807g().mo23576i());
        this.mRvCategory.setLayoutManager(new LinearLayoutManager(this));
        this.mRvCategory.setAdapter(deviceCategoryAdapter);
        C4257w.m11947l0().mo23678m1(this);
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        this.f11799e.removeCallbacksAndMessages((Object) null);
        C4257w.m11947l0().mo23646F1(this);
        unregisterReceiver(this.f11801g);
        unregisterReceiver(this.f11800f);
        getContentResolver().unregisterContentObserver(this.f11802h);
        m17034p0();
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (i != 1000) {
            finish();
        } else if (iArr.length <= 0) {
            finish();
        } else if (iArr[0] == 0) {
            LocationManager locationManager = (LocationManager) getSystemService("location");
            if (!locationManager.isProviderEnabled("gps") || !locationManager.isProviderEnabled("network")) {
                startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
                return;
            }
            this.f11799e.removeMessages(5);
            this.f11799e.sendEmptyMessageDelayed(5, 500);
        } else {
            if (iArr[0] == -1) {
            }
        }
    }

    /* access modifiers changed from: protected */
    @OnClick({2131296800, 2131297480})
    public void onViewClick(View view) {
        int id = view.getId();
        if (id == 2131296800) {
            startActivity(new Intent(this, SearchDeviceDetailActivity.class));
        } else if (id == 2131297480) {
            m17029e0(1);
        }
    }

    /* renamed from: t */
    public void mo26104t() {
        if (this.f11805k <= 2) {
            mo26929j0();
        } else {
            this.f11799e.postDelayed(new C5777t2(this), 15000);
        }
    }

    /* renamed from: y */
    public void mo26107y(int i) {
    }
}
