package com.yeelight.cherry.p141ui.activity;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.ContentObserver;
import android.graphics.Paint;
import android.location.LocationManager;
import android.os.Build;
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
import androidx.annotation.NonNull;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.yeelight.cherry.C12224R$drawable;
import com.yeelight.cherry.C12225R$id;
import com.yeelight.cherry.C12228R$layout;
import com.yeelight.cherry.p141ui.adapter.AutoSearchAdapter;
import com.yeelight.cherry.p141ui.adapter.DeviceCategoryAdapter;
import com.yeelight.yeelib.device.base.C3012e;
import com.yeelight.yeelib.managers.C3088r;
import com.yeelight.yeelib.managers.C3108x;
import com.yeelight.yeelib.managers.C8272e;
import com.yeelight.yeelib.managers.YeelightDeviceManager;
import com.yeelight.yeelib.models.C8325q;
import com.yeelight.yeelib.p142ui.view.CommonTitleBar;
import java.util.ArrayList;
import java.util.List;
import p051j4.C9193k;
import p197p3.C10267c;
import p237z3.C12144d;

/* renamed from: com.yeelight.cherry.ui.activity.SearchDeviceAutoActivity */
public class SearchDeviceAutoActivity extends ScanDeviceBaseActivity implements C12144d {
    /* access modifiers changed from: private */

    /* renamed from: m */
    public static final String f11369m = SearchDeviceAutoActivity.class.getSimpleName();

    /* renamed from: d */
    private final Handler f11370d = new Handler(Looper.getMainLooper(), new C5792l3(this));

    /* renamed from: e */
    private final BroadcastReceiver f11371e = new C5673a();

    /* renamed from: f */
    private final BroadcastReceiver f11372f = new C5674b();

    /* renamed from: g */
    private final ContentObserver f11373g = new C5675c((Handler) null);
    /* access modifiers changed from: private */

    /* renamed from: h */
    public LocationManager f11374h;

    /* renamed from: i */
    private AutoSearchAdapter f11375i;

    /* renamed from: j */
    private int f11376j;

    /* renamed from: k */
    private List<C10267c> f11377k = new ArrayList();

    /* renamed from: l */
    private List<C8325q> f11378l = new ArrayList();
    @BindView(2131296544)
    View mClScnanning;
    @BindView(2131296904)
    ImageView mImgMore;
    @BindView(2131296915)
    ImageView mImgScanning;
    @BindView(2131297384)
    RecyclerView mRvCategory;
    @BindView(2131297387)
    RecyclerView mRvScannedDevice;
    @BindView(2131297591)
    CommonTitleBar mTitleBar;
    @BindView(2131297655)
    TextView mTvGoSetting;
    @BindView(2131297667)
    TextView mTvPermissionDenied;
    @BindView(2131297676)
    TextView mTvScanNoDevice;

    /* renamed from: com.yeelight.cherry.ui.activity.SearchDeviceAutoActivity$a */
    class C5673a extends BroadcastReceiver {
        C5673a() {
        }

        public void onReceive(Context context, Intent intent) {
            if (intent.getAction().equals("android.net.wifi.WIFI_STATE_CHANGED") && intent.getIntExtra("wifi_state", 0) == 3) {
                boolean unused = SearchDeviceAutoActivity.this.m17043l0(2);
            }
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.SearchDeviceAutoActivity$b */
    class C5674b extends BroadcastReceiver {
        C5674b() {
        }

        public void onReceive(Context context, Intent intent) {
            if (intent.getIntExtra("android.bluetooth.adapter.extra.STATE", 10) == 12) {
                boolean unused = SearchDeviceAutoActivity.this.m17043l0(4);
            }
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.SearchDeviceAutoActivity$c */
    class C5675c extends ContentObserver {
        C5675c(Handler handler) {
            super(handler);
        }

        public void onChange(boolean z) {
            super.onChange(z);
            boolean isProviderEnabled = SearchDeviceAutoActivity.this.f11374h.isProviderEnabled("gps");
            String unused = SearchDeviceAutoActivity.f11369m;
            StringBuilder sb = new StringBuilder();
            sb.append("gps enabled: ");
            sb.append(isProviderEnabled);
            if (isProviderEnabled) {
                boolean unused2 = SearchDeviceAutoActivity.this.m17043l0(5);
            }
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.SearchDeviceAutoActivity$d */
    class C5676d extends ClickableSpan {
        C5676d() {
        }

        public void onClick(View view) {
            SearchDeviceAutoActivity.this.startActivity(new Intent(SearchDeviceAutoActivity.this, ScanHelpCenterActivity.class));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: l0 */
    public boolean m17043l0(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append("checkScanPermissions: ");
        sb.append(i);
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i == 5) {
                            LocationManager locationManager = (LocationManager) getSystemService("location");
                            if (!locationManager.isProviderEnabled("gps") || !locationManager.isProviderEnabled("network")) {
                                this.f11370d.removeMessages(5);
                                this.f11370d.sendEmptyMessageDelayed(5, 500);
                            } else {
                                this.f11370d.removeMessages(6);
                                this.f11370d.sendEmptyMessageDelayed(6, 500);
                                return true;
                            }
                        }
                        return false;
                    } else if (ContextCompat.checkSelfPermission(this, "android.permission.ACCESS_COARSE_LOCATION") == 0 && ContextCompat.checkSelfPermission(this, "android.permission.ACCESS_FINE_LOCATION") == 0) {
                        return m17043l0(5);
                    } else {
                        if (ActivityCompat.shouldShowRequestPermissionRationale(this, "android.permission.ACCESS_FINE_LOCATION")) {
                            mo35655S(2131755994);
                            return false;
                        }
                        this.f11370d.removeMessages(4);
                        this.f11370d.sendEmptyMessageDelayed(4, 500);
                        return false;
                    }
                } else if (C8272e.m19511b().mo35203c()) {
                    return m17043l0(4);
                } else {
                    this.f11370d.removeMessages(3);
                    this.f11370d.sendEmptyMessageDelayed(3, 500);
                    return false;
                }
            } else if (Build.VERSION.SDK_INT < 31) {
                return m17043l0(3);
            } else {
                int checkSelfPermission = ContextCompat.checkSelfPermission(this, "android.permission.BLUETOOTH_SCAN");
                int checkSelfPermission2 = ContextCompat.checkSelfPermission(this, "android.permission.BLUETOOTH_CONNECT");
                if (checkSelfPermission == 0 && checkSelfPermission2 == 0) {
                    return m17043l0(3);
                }
                if (ActivityCompat.shouldShowRequestPermissionRationale(this, "android.permission.BLUETOOTH_SCAN")) {
                    mo35655S(2131755993);
                    return false;
                }
                this.f11370d.removeMessages(2);
                this.f11370d.sendEmptyMessageDelayed(2, 500);
                return false;
            }
        } else if (C8272e.m19511b().mo35205e()) {
            return m17043l0(2);
        } else {
            this.f11370d.removeMessages(1);
            this.f11370d.sendEmptyMessageDelayed(1, 500);
            return false;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: m0 */
    public /* synthetic */ boolean m17044m0(Message message) {
        int i = message.what;
        switch (i) {
            case 1:
            case 3:
            case 4:
            case 5:
                m17052u0(i);
                return false;
            case 2:
                if (Build.VERSION.SDK_INT < 31) {
                    return false;
                }
                ActivityCompat.requestPermissions(this, new String[]{"android.permission.BLUETOOTH_SCAN", "android.permission.BLUETOOTH_CONNECT"}, 302);
                return false;
            case 6:
                m17051t0(true);
                m17048q0();
                return false;
            default:
                return false;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: n0 */
    public /* synthetic */ void m17045n0(View view) {
        onBackPressed();
    }

    /* access modifiers changed from: private */
    /* renamed from: o0 */
    public /* synthetic */ void m17046o0(View view) {
        startActivity(new Intent(this, ScanHelpCenterActivity.class));
    }

    /* access modifiers changed from: private */
    /* renamed from: p0 */
    public /* synthetic */ void m17047p0(int i, C10267c cVar) {
        mo30859Z(cVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: s0 */
    public /* synthetic */ void m17050s0(AlertDialog alertDialog, int i, View view) {
        alertDialog.dismiss();
        if (i == 1) {
            C3108x.m8223f().mo23547m(this, true);
        } else if (i == 3) {
            C3108x.m8223f().mo23541b().enable();
        } else if (i == 4) {
            ActivityCompat.requestPermissions(this, new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, 1000);
        } else if (i == 5) {
            startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
        }
    }

    /* renamed from: t0 */
    private void m17051t0(boolean z) {
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

    /* renamed from: u0 */
    private void m17052u0(int i) {
        int i2;
        View inflate = View.inflate(this, C12228R$layout.dialog_device_scan_permission_denied, (ViewGroup) null);
        TextView textView = (TextView) inflate.findViewById(C12225R$id.tv_permission_content);
        ImageView imageView = (ImageView) inflate.findViewById(C12225R$id.img_permission_type);
        if (i == 1) {
            textView.setText(2131755201);
            i2 = C12224R$drawable.icon_device_permission_wifi;
        } else if (i != 3) {
            if (i == 4 || i == 5) {
                textView.setText(2131755522);
                i2 = C12224R$drawable.icon_device_permission_location;
            }
            inflate.setLayerType(1, (Paint) null);
            AlertDialog create = new AlertDialog.Builder(this, 2131820942).create();
            create.requestWindowFeature(1);
            create.setCancelable(false);
            create.show();
            create.setContentView(inflate);
            inflate.findViewById(2131296480).setOnClickListener(new C5798m3(create));
            inflate.findViewById(2131296491).setOnClickListener(new C5814p3(this, create, i));
            Display defaultDisplay = getWindowManager().getDefaultDisplay();
            WindowManager.LayoutParams attributes = create.getWindow().getAttributes();
            attributes.height = -2;
            double width = (double) defaultDisplay.getWidth();
            Double.isNaN(width);
            attributes.width = (int) (width * 0.78d);
            create.getWindow().setAttributes(attributes);
        } else {
            textView.setText(2131755196);
            i2 = C12224R$drawable.icon_device_permission_bluetooth;
        }
        imageView.setImageResource(i2);
        inflate.setLayerType(1, (Paint) null);
        AlertDialog create2 = new AlertDialog.Builder(this, 2131820942).create();
        create2.requestWindowFeature(1);
        create2.setCancelable(false);
        create2.show();
        create2.setContentView(inflate);
        inflate.findViewById(2131296480).setOnClickListener(new C5798m3(create2));
        inflate.findViewById(2131296491).setOnClickListener(new C5814p3(this, create2, i));
        Display defaultDisplay2 = getWindowManager().getDefaultDisplay();
        WindowManager.LayoutParams attributes2 = create2.getWindow().getAttributes();
        attributes2.height = -2;
        double width2 = (double) defaultDisplay2.getWidth();
        Double.isNaN(width2);
        attributes2.width = (int) (width2 * 0.78d);
        create2.getWindow().setAttributes(attributes2);
    }

    /* access modifiers changed from: private */
    /* renamed from: v0 */
    public void m17048q0() {
        this.f11376j++;
        YeelightDeviceManager.m7800o0().mo23278Z(true, true, false);
    }

    /* renamed from: w0 */
    private void m17054w0() {
        YeelightDeviceManager.m7800o0().mo23254B1();
        YeelightDeviceManager.m7800o0().mo23257C1();
    }

    /* renamed from: E */
    public void mo30149E(C3012e eVar) {
    }

    /* renamed from: L */
    public void mo30150L() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a0 */
    public void mo30860a0(List<C10267c> list) {
        this.f11377k.clear();
        this.f11377k.addAll(list);
        int i = 0;
        this.mRvScannedDevice.setVisibility(this.f11377k.size() > 0 ? 0 : 4);
        this.mTvScanNoDevice.setVisibility(this.f11377k.size() > 0 ? 4 : 0);
        ImageView imageView = this.mImgMore;
        if (this.f11377k.size() <= 3) {
            i = 4;
        }
        imageView.setVisibility(i);
        this.f11375i.notifyDataSetChanged();
    }

    /* renamed from: k */
    public void mo30151k() {
    }

    /* renamed from: m */
    public void mo30152m(C3012e eVar) {
    }

    /* renamed from: o */
    public void mo30153o() {
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C12228R$layout.activity_search_device_auto);
        C9193k.m22157h(true, this);
        ButterKnife.bind((Activity) this);
        this.mTitleBar.mo36195a(getString(2131755216), new C5804n3(this), new C5809o3(this));
        this.mTitleBar.setTitleTextSize(16);
        this.mTitleBar.setTitleTextColor(2131099840);
        String string = getString(2131755482);
        String string2 = getString(2131755476);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string + string2);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(ContextCompat.getColor(this, 2131099845)), string.length(), string.length() + string2.length(), 33);
        spannableStringBuilder.setSpan(new C5676d(), string.length(), string.length() + string2.length(), 33);
        this.mTvScanNoDevice.setMovementMethod(LinkMovementMethod.getInstance());
        this.mTvScanNoDevice.setText(spannableStringBuilder);
        registerReceiver(this.f11372f, new IntentFilter("android.bluetooth.adapter.action.STATE_CHANGED"));
        registerReceiver(this.f11371e, new IntentFilter("android.net.wifi.WIFI_STATE_CHANGED"));
        if (!m17043l0(1)) {
            m17051t0(false);
        }
        this.f11374h = (LocationManager) getSystemService("location");
        getContentResolver().registerContentObserver(Settings.Secure.getUriFor("location_providers_allowed"), false, this.f11373g);
        AutoSearchAdapter autoSearchAdapter = new AutoSearchAdapter(this, this.f11377k, 0);
        this.f11375i = autoSearchAdapter;
        autoSearchAdapter.mo31104g(new C5819q3(this));
        this.mRvScannedDevice.setLayoutManager(new LinearLayoutManager(this, 0, false));
        this.mRvScannedDevice.setAdapter(this.f11375i);
        this.mRvScannedDevice.setVisibility(4);
        ArrayList arrayList = new ArrayList();
        this.f11378l = arrayList;
        arrayList.addAll(C3088r.m8117g().mo23469i());
        DeviceCategoryAdapter deviceCategoryAdapter = new DeviceCategoryAdapter(this, C3088r.m8117g().mo23469i());
        this.mRvCategory.setLayoutManager(new LinearLayoutManager(this));
        this.mRvCategory.setAdapter(deviceCategoryAdapter);
        YeelightDeviceManager.m7800o0().mo23309q1(this);
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        this.f11370d.removeCallbacksAndMessages((Object) null);
        YeelightDeviceManager.m7800o0().mo23271L1(this);
        unregisterReceiver(this.f11372f);
        unregisterReceiver(this.f11371e);
        getContentResolver().unregisterContentObserver(this.f11373g);
        m17054w0();
    }

    public void onRequestPermissionsResult(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (i != 302) {
            if (i == 1000) {
                if (iArr.length != 2) {
                    finish();
                } else if (iArr[0] == 0 && iArr[1] == 0) {
                    LocationManager locationManager = (LocationManager) getSystemService("location");
                    if (!locationManager.isProviderEnabled("gps") || !locationManager.isProviderEnabled("network")) {
                        startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
                        return;
                    }
                    this.f11370d.removeMessages(6);
                    this.f11370d.sendEmptyMessageDelayed(6, 500);
                } else {
                    int i2 = iArr[0];
                }
            }
        } else if (iArr.length > 0 && iArr[0] == 0) {
            m17043l0(3);
        }
    }

    /* access modifiers changed from: protected */
    @OnClick({2131296904, 2131297655})
    public void onViewClick(View view) {
        int id = view.getId();
        if (id == 2131296904) {
            startActivity(new Intent(this, SearchDeviceDetailActivity.class));
        } else if (id == 2131297655) {
            m17043l0(1);
        }
    }

    /* renamed from: t */
    public void mo30160t() {
        if (this.f11376j <= 2) {
            m17048q0();
        } else {
            this.f11370d.postDelayed(new C5824r3(this), 15000);
        }
    }

    /* renamed from: y */
    public void mo30163y(int i) {
    }
}
