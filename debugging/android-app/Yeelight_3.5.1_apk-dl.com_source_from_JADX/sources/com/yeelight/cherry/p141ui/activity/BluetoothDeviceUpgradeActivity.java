package com.yeelight.cherry.p141ui.activity;

import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Paint;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.animation.LinearInterpolator;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.constraintlayout.motion.widget.Key;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.yeelight.cherry.C12224R$drawable;
import com.yeelight.cherry.C12225R$id;
import com.yeelight.cherry.C12228R$layout;
import com.yeelight.yeelib.device.C6081a;
import com.yeelight.yeelib.device.base.DeviceStatusBase;
import com.yeelight.yeelib.managers.C3064h;
import com.yeelight.yeelib.managers.C3108x;
import com.yeelight.yeelib.managers.C8272e;
import com.yeelight.yeelib.managers.YeelightDeviceManager;
import com.yeelight.yeelib.p142ui.activity.BaseActivity;
import com.yeelight.yeelib.p142ui.view.CommonTitleBar;
import com.yeelight.yeelib.utils.AppUtils;
import java.util.Locale;
import p051j4.C9193k;
import p170i4.C9113d;
import p223w3.C10898f0;
import p237z3.C12143c;
import p237z3.C12145e;

/* renamed from: com.yeelight.cherry.ui.activity.BluetoothDeviceUpgradeActivity */
public class BluetoothDeviceUpgradeActivity extends BaseActivity implements C12143c {

    /* renamed from: k */
    private static final String f9962k = "BluetoothDeviceUpgradeActivity";

    /* renamed from: l */
    public static final /* synthetic */ int f9963l = 0;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public C6081a f9964a;

    /* renamed from: b */
    private ObjectAnimator f9965b;

    /* renamed from: c */
    private C3064h.C3070e f9966c;

    /* renamed from: d */
    private boolean f9967d = false;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public boolean f9968e = false;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public boolean f9969f = false;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public C9113d f9970g = null;

    /* renamed from: h */
    private C9113d f9971h = null;

    /* renamed from: i */
    private C12145e f9972i = new C5074a();
    /* access modifiers changed from: private */

    /* renamed from: j */
    public Handler f9973j = new C5076b();
    @BindView(2131296490)
    Button mBtnRetry;
    @BindView(2131296500)
    Button mBtnUpdate;
    @BindView(2131296605)
    TextView mNewUpdateCurrentVersion;
    @BindView(2131296979)
    TextView mNewUpdateLatestVersion;
    @BindView(2131297027)
    LinearLayout mNewUpdateLayout;
    @BindView(2131297298)
    TextView mNewUpdateReleaseNote;
    @BindView(2131297175)
    TextView mNoUpdateCurrentVersion;
    @BindView(2131297029)
    LinearLayout mNoupdateLayout;
    @BindView(2131297713)
    TextView mProgress;
    @BindView(2131297247)
    ImageView mProgressView;
    @BindView(2131297591)
    CommonTitleBar mTitleBar;
    @BindView(2131296792)
    LinearLayout mUpdateFailLayout;
    @BindView(2131297715)
    TextView mUpdatingHint;
    @BindView(2131296793)
    LinearLayout mUpdatingLayout;

    /* renamed from: com.yeelight.cherry.ui.activity.BluetoothDeviceUpgradeActivity$a */
    class C5074a implements C12145e {

        /* renamed from: com.yeelight.cherry.ui.activity.BluetoothDeviceUpgradeActivity$a$a */
        class C5075a implements Runnable {
            C5075a() {
            }

            public void run() {
                BluetoothDeviceUpgradeActivity.this.m15930y0();
            }
        }

        C5074a() {
        }

        public void onStatusChange(int i, DeviceStatusBase deviceStatusBase) {
            if (i == 536870916) {
                BluetoothDeviceUpgradeActivity.this.runOnUiThread(new C5075a());
            }
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.BluetoothDeviceUpgradeActivity$b */
    class C5076b extends Handler {
        C5076b() {
        }

        public void handleMessage(Message message) {
            String str;
            C9113d dVar;
            switch (message.what) {
                case 1:
                    BluetoothDeviceUpgradeActivity bluetoothDeviceUpgradeActivity = BluetoothDeviceUpgradeActivity.this;
                    bluetoothDeviceUpgradeActivity.mProgress.setText(String.valueOf(bluetoothDeviceUpgradeActivity.f9964a.mo23143g0()));
                    return;
                case 2:
                    BluetoothDeviceUpgradeActivity.this.f9973j.sendEmptyMessage(1);
                    BluetoothDeviceUpgradeActivity.this.f9973j.sendEmptyMessageDelayed(2, 1000);
                    return;
                case 3:
                    removeMessages(2);
                    BluetoothDeviceUpgradeActivity.this.m15931z0();
                    BluetoothDeviceUpgradeActivity.this.mProgress.setText(String.valueOf(100));
                    removeMessages(6);
                    sendEmptyMessageDelayed(4, 1000);
                    return;
                case 4:
                    BluetoothDeviceUpgradeActivity.this.m15928w0();
                    return;
                case 5:
                    removeMessages(2);
                    removeMessages(6);
                    break;
                case 6:
                    removeMessages(2);
                    break;
                case 7:
                    C10898f0 f0Var = (C10898f0) BluetoothDeviceUpgradeActivity.this.f9964a;
                    if (BluetoothDeviceUpgradeActivity.this.f9968e) {
                        BluetoothDeviceUpgradeActivity bluetoothDeviceUpgradeActivity2 = BluetoothDeviceUpgradeActivity.this;
                        Toast.makeText(bluetoothDeviceUpgradeActivity2, bluetoothDeviceUpgradeActivity2.getResources().getString(2131755861), 0).show();
                    }
                    if (f0Var.mo31635V1().getId() == 0) {
                        BluetoothDeviceUpgradeActivity.this.f9970g.setTitle((CharSequence) BluetoothDeviceUpgradeActivity.this.getResources().getString(2131755540));
                        dVar = BluetoothDeviceUpgradeActivity.this.f9970g;
                        str = BluetoothDeviceUpgradeActivity.this.getResources().getString(2131755527, new Object[]{new String((byte[]) f0Var.mo31634U1("ADV_MESH_NAME"))});
                    } else {
                        BluetoothDeviceUpgradeActivity.this.f9970g.setTitle((CharSequence) BluetoothDeviceUpgradeActivity.this.getResources().getString(2131755541));
                        dVar = BluetoothDeviceUpgradeActivity.this.f9970g;
                        str = BluetoothDeviceUpgradeActivity.this.getResources().getString(2131755529, new Object[]{new String((byte[]) f0Var.mo31634U1("ADV_MESH_NAME"))});
                    }
                    dVar.mo37160k(str);
                    BluetoothDeviceUpgradeActivity.this.f9970g.show();
                    BluetoothDeviceUpgradeActivity.this.m15920o0();
                    return;
                case 8:
                    sendEmptyMessage(5);
                    return;
                default:
                    return;
            }
            BluetoothDeviceUpgradeActivity.this.m15929x0();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.BluetoothDeviceUpgradeActivity$c */
    class C5077c implements View.OnClickListener {
        C5077c() {
        }

        public void onClick(View view) {
            BluetoothDeviceUpgradeActivity.this.onBackPressed();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.BluetoothDeviceUpgradeActivity$d */
    class C5078d implements DialogInterface.OnClickListener {
        C5078d(BluetoothDeviceUpgradeActivity bluetoothDeviceUpgradeActivity) {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.BluetoothDeviceUpgradeActivity$e */
    class C5079e implements DialogInterface.OnClickListener {
        C5079e() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            boolean unused = BluetoothDeviceUpgradeActivity.this.f9968e = true;
            C10898f0 f0Var = (C10898f0) BluetoothDeviceUpgradeActivity.this.f9964a;
            f0Var.mo31635V1().setNetworkName(new String((byte[]) f0Var.mo31634U1("ADV_MESH_NAME")));
            f0Var.mo31635V1().setPassword(BluetoothDeviceUpgradeActivity.this.f9970g.mo37153c().getText().toString());
            BluetoothDeviceUpgradeActivity.this.f9964a.mo23137Y0();
            BluetoothDeviceUpgradeActivity.this.f9973j.sendEmptyMessage(2);
            BluetoothDeviceUpgradeActivity.this.f9973j.sendEmptyMessageDelayed(6, 900000);
            dialogInterface.dismiss();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.BluetoothDeviceUpgradeActivity$f */
    class C5080f implements DialogInterface.OnClickListener {
        C5080f() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
            boolean unused = BluetoothDeviceUpgradeActivity.this.f9969f = true;
            BluetoothDeviceUpgradeActivity.this.f9964a.mo23137Y0();
            BluetoothDeviceUpgradeActivity.this.f9973j.sendEmptyMessage(2);
            BluetoothDeviceUpgradeActivity.this.f9973j.sendEmptyMessageDelayed(6, 900000);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.BluetoothDeviceUpgradeActivity$g */
    class C5081g implements View.OnClickListener {
        C5081g() {
        }

        public void onClick(View view) {
            BluetoothDeviceUpgradeActivity.this.m15930y0();
            BluetoothDeviceUpgradeActivity.this.f9973j.sendEmptyMessage(2);
            BluetoothDeviceUpgradeActivity.this.f9973j.sendEmptyMessageDelayed(6, 900000);
            if (BluetoothDeviceUpgradeActivity.this.f9964a.mo23145k0()) {
                BluetoothDeviceUpgradeActivity.this.f9964a.mo23137Y0();
                return;
            }
            ((C10898f0) BluetoothDeviceUpgradeActivity.this.f9964a).mo42253q3(true);
            BluetoothDeviceUpgradeActivity.this.f9964a.mo23151n();
        }
    }

    @SuppressLint({"MissingPermission"})
    /* renamed from: A0 */
    private void m15900A0() {
        if (!this.f9969f) {
            this.f9971h.show();
            return;
        }
        this.f9968e = false;
        this.f9964a.mo23137Y0();
        this.f9973j.sendEmptyMessage(2);
        this.f9973j.sendEmptyMessageDelayed(6, 900000);
    }

    /* renamed from: j0 */
    private void m15915j0() {
        if (C8272e.m19511b().mo35203c()) {
            m15900A0();
        } else {
            m15926u0(2);
        }
    }

    @RequiresApi(api = 31)
    /* renamed from: k0 */
    private void m15916k0() {
        if (m15922q0("android.permission.BLUETOOTH_SCAN") && m15922q0("android.permission.BLUETOOTH_CONNECT")) {
            m15915j0();
        } else if (ActivityCompat.shouldShowRequestPermissionRationale(this, "android.permission.BLUETOOTH_SCAN") || ActivityCompat.shouldShowRequestPermissionRationale(this, "android.permission.BLUETOOTH_CONNECT")) {
            mo35655S(2131755993);
        } else {
            ActivityCompat.requestPermissions(this, new String[]{"android.permission.BLUETOOTH_SCAN", "android.permission.BLUETOOTH_CONNECT"}, 2);
        }
    }

    /* renamed from: l0 */
    private void m15917l0() {
        if (!C8272e.m19511b().mo35203c()) {
            m15926u0(2);
        } else if (m15922q0("android.permission.ACCESS_FINE_LOCATION") && m15922q0("android.permission.ACCESS_COARSE_LOCATION")) {
            m15918m0();
        } else if (ActivityCompat.shouldShowRequestPermissionRationale(this, "android.permission.ACCESS_FINE_LOCATION")) {
            mo35655S(2131755994);
        } else {
            ActivityCompat.requestPermissions(this, new String[]{"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"}, 1);
        }
    }

    /* renamed from: m0 */
    private void m15918m0() {
        LocationManager locationManager = (LocationManager) getSystemService("location");
        if (!locationManager.isProviderEnabled("gps") || !locationManager.isProviderEnabled("network")) {
            m15926u0(1);
        } else {
            m15900A0();
        }
    }

    /* renamed from: n0 */
    private void m15919n0() {
        if (Build.VERSION.SDK_INT < 31) {
            m15917l0();
        } else {
            m15916k0();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: o0 */
    public void m15920o0() {
        C3064h.C3070e eVar = (C3064h.C3070e) C3064h.m7982j().mo23393m(this.f9964a.mo23208T());
        this.f9966c = eVar;
        if (eVar != null && eVar.mo23418a() > this.f9964a.mo23197N().mo42510b()) {
            this.mNewUpdateLayout.setVisibility(0);
            this.mNoupdateLayout.setVisibility(8);
            this.mUpdatingLayout.setVisibility(8);
            this.mUpdateFailLayout.setVisibility(8);
            m15927v0();
            return;
        }
        this.mNewUpdateLayout.setVisibility(8);
        this.mNoupdateLayout.setVisibility(0);
        this.mUpdatingLayout.setVisibility(8);
        this.mUpdateFailLayout.setVisibility(8);
        m15928w0();
    }

    @SuppressLint({"MissingPermission"})
    /* renamed from: p0 */
    private void m15921p0() {
        if (Build.VERSION.SDK_INT < 33) {
            C3108x.m8223f().mo23541b().enable();
        } else {
            startActivity(new Intent("android.bluetooth.adapter.action.REQUEST_ENABLE"));
        }
    }

    /* renamed from: q0 */
    private boolean m15922q0(String str) {
        return ContextCompat.checkSelfPermission(this, str) == 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: s0 */
    public /* synthetic */ void m15924s0(AlertDialog alertDialog, int i, View view) {
        alertDialog.dismiss();
        if (i == 1) {
            startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
        } else if (i == 2) {
            m15921p0();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: t0 */
    public /* synthetic */ void m15925t0(View view) {
        m15919n0();
    }

    /* renamed from: u0 */
    private void m15926u0(int i) {
        int i2;
        View inflate = View.inflate(this, C12228R$layout.dialog_device_scan_permission_denied, (ViewGroup) null);
        TextView textView = (TextView) inflate.findViewById(C12225R$id.tv_permission_content);
        ImageView imageView = (ImageView) inflate.findViewById(C12225R$id.img_permission_type);
        if (i == 1) {
            textView.setText(2131755522);
            i2 = C12224R$drawable.icon_device_permission_location;
        } else {
            if (i == 2) {
                textView.setText(2131755196);
                i2 = C12224R$drawable.icon_device_permission_bluetooth;
            }
            inflate.setLayerType(1, (Paint) null);
            AlertDialog create = new AlertDialog.Builder(this, 2131820942).create();
            create.requestWindowFeature(1);
            create.setCancelable(false);
            create.show();
            create.setContentView(inflate);
            inflate.findViewById(2131296480).setOnClickListener(new C5825s(create));
            inflate.findViewById(2131296491).setOnClickListener(new C5835u(this, create, i));
            Display defaultDisplay = getWindowManager().getDefaultDisplay();
            WindowManager.LayoutParams attributes = create.getWindow().getAttributes();
            attributes.height = -2;
            double width = (double) defaultDisplay.getWidth();
            Double.isNaN(width);
            attributes.width = (int) (width * 0.78d);
            create.getWindow().setAttributes(attributes);
        }
        imageView.setImageResource(i2);
        inflate.setLayerType(1, (Paint) null);
        AlertDialog create2 = new AlertDialog.Builder(this, 2131820942).create();
        create2.requestWindowFeature(1);
        create2.setCancelable(false);
        create2.show();
        create2.setContentView(inflate);
        inflate.findViewById(2131296480).setOnClickListener(new C5825s(create2));
        inflate.findViewById(2131296491).setOnClickListener(new C5835u(this, create2, i));
        Display defaultDisplay2 = getWindowManager().getDefaultDisplay();
        WindowManager.LayoutParams attributes2 = create2.getWindow().getAttributes();
        attributes2.height = -2;
        double width2 = (double) defaultDisplay2.getWidth();
        Double.isNaN(width2);
        attributes2.width = (int) (width2 * 0.78d);
        create2.getWindow().setAttributes(attributes2);
    }

    /* renamed from: v0 */
    private void m15927v0() {
        this.mNewUpdateLayout.setVisibility(0);
        this.mNoupdateLayout.setVisibility(8);
        this.mUpdatingLayout.setVisibility(8);
        this.mUpdateFailLayout.setVisibility(8);
        Locale locale = Locale.US;
        String format = String.format(locale, getText(2131755656).toString(), new Object[]{this.f9964a.mo23197N().mo42511c()});
        String format2 = String.format(locale, getText(2131755657).toString(), new Object[]{this.f9966c.mo23423f()});
        this.mNewUpdateCurrentVersion.setText(format);
        this.mNewUpdateLatestVersion.setText(format2);
        this.mNewUpdateReleaseNote.setText(this.f9966c.mo23424g());
        this.mBtnUpdate.setOnClickListener(new C5830t(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: w0 */
    public void m15928w0() {
        this.mNewUpdateLayout.setVisibility(8);
        this.mNoupdateLayout.setVisibility(0);
        this.mUpdatingLayout.setVisibility(8);
        this.mUpdateFailLayout.setVisibility(8);
        if (this.f9964a.mo23197N() != null) {
            this.mNoUpdateCurrentVersion.setText(String.format(Locale.US, getText(2131755656).toString(), new Object[]{this.f9964a.mo23197N().mo42511c()}));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: x0 */
    public void m15929x0() {
        this.mNewUpdateLayout.setVisibility(8);
        this.mNoupdateLayout.setVisibility(8);
        this.mUpdatingLayout.setVisibility(8);
        this.mUpdateFailLayout.setVisibility(0);
        ObjectAnimator objectAnimator = this.f9965b;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        this.mBtnRetry.setOnClickListener(new C5081g());
    }

    /* access modifiers changed from: private */
    /* renamed from: y0 */
    public void m15930y0() {
        this.mNewUpdateLayout.setVisibility(8);
        this.mNoupdateLayout.setVisibility(8);
        this.mUpdatingLayout.setVisibility(0);
        this.mUpdateFailLayout.setVisibility(8);
        this.mUpdatingHint.setText(2131755663);
        this.mProgressView.setImageResource(2131231509);
        ObjectAnimator objectAnimator = this.f9965b;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        } else {
            this.f9973j.sendEmptyMessage(2);
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.mProgressView, Key.ROTATION, new float[]{0.0f, 359.0f});
        this.f9965b = ofFloat;
        ofFloat.setInterpolator(new LinearInterpolator());
        this.f9965b.setDuration(1500);
        this.f9965b.setRepeatMode(1);
        this.f9965b.setRepeatCount(-1);
        this.f9965b.start();
    }

    /* access modifiers changed from: private */
    /* renamed from: z0 */
    public void m15931z0() {
        this.mNewUpdateLayout.setVisibility(8);
        this.mNoupdateLayout.setVisibility(8);
        this.mUpdatingLayout.setVisibility(0);
        this.mUpdateFailLayout.setVisibility(8);
        ObjectAnimator objectAnimator = this.f9965b;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        this.mProgressView.setImageResource(2131231508);
        this.mUpdatingHint.setText(2131755660);
    }

    public void onBackPressed() {
        super.onBackPressed();
    }

    public void onConnectionStateChanged(int i, int i2) {
        int i3;
        Handler handler;
        if (i2 == 0) {
            this.f9967d = false;
            handler = this.f9973j;
            i3 = 5;
        } else if (i2 == 1) {
            this.f9967d = true;
            return;
        } else if (i2 != 11) {
            if (i2 == 13) {
                handler = this.f9973j;
                i3 = 7;
            } else {
                return;
            }
        } else if (this.f9967d) {
            this.f9967d = false;
            handler = this.f9973j;
            i3 = 3;
        } else {
            return;
        }
        handler.sendEmptyMessage(i3);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo35653P();
        getWindow().addFlags(128);
        C9193k.m22157h(true, this);
        setContentView(C12228R$layout.activity_wifi_firmware_upgrade_new);
        ButterKnife.bind((Activity) this);
        Intent intent = getIntent();
        if (!intent.hasExtra("com.yeelight.cherry.device_id")) {
            AppUtils.m8302w(f9962k, "Activity has no device id", false);
            finish();
            return;
        }
        C6081a i0 = YeelightDeviceManager.m7800o0().mo23295i0(intent.getStringExtra("com.yeelight.cherry.device_id"));
        this.f9964a = i0;
        if (i0 == null) {
            finish();
            return;
        }
        this.mTitleBar.mo36195a(getResources().getString(2131755659), new C5077c(), (View.OnClickListener) null);
        this.mTitleBar.setTitleTextSize(16);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        this.mTitleBar.setLayoutParams(layoutParams);
        layoutParams.setMargins(0, C9193k.m22154e(this), 0, 0);
        m15920o0();
        this.f9970g = new C9113d.C9118e(this).mo37179i(getText(2131755540).toString()).mo37181k(true).mo37174d(-1, getResources().getString(2131755281), new C5079e()).mo37174d(-2, getResources().getString(2131755232), new C5078d(this)).mo37172b();
        this.f9971h = new C9113d.C9118e(this).mo37179i(getText(2131755539).toString()).mo37177g(getText(2131755526).toString()).mo37174d(-1, getResources().getString(2131755281), new C5080f()).mo37172b();
        this.f9964a.mo23176A0(this, false);
        this.f9964a.mo23180C0(this.f9972i, false);
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        this.f9973j.removeCallbacksAndMessages((Object) null);
        super.onDestroy();
        mo35652M(this);
        C6081a aVar = this.f9964a;
        if (aVar != null) {
            aVar.mo23133V0(this);
            this.f9964a.mo23213W0(this.f9972i);
        }
    }

    public void onLocalConnected() {
    }

    public void onLocalDisconnected() {
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
    }

    public void onRequestPermissionsResult(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
        int i2;
        super.onRequestPermissionsResult(i, strArr, iArr);
        boolean z = false;
        if (iArr.length > 0) {
            int length = iArr.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    z = true;
                    break;
                } else if (iArr[i3] != 0) {
                    break;
                } else {
                    i3++;
                }
            }
        }
        if (i == 1) {
            if (z) {
                m15918m0();
                return;
            }
            i2 = 2131755994;
        } else if (i != 2) {
            return;
        } else {
            if (z) {
                m15915j0();
                return;
            }
            i2 = 2131755993;
        }
        mo35655S(i2);
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        if (!this.f9964a.mo23153p0()) {
            m15920o0();
        } else {
            m15930y0();
        }
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
    }
}
