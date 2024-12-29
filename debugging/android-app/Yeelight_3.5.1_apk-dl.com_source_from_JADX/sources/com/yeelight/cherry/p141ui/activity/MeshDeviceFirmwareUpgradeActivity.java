package com.yeelight.cherry.p141ui.activity;

import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.AlertDialog;
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
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.constraintlayout.motion.widget.Key;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.inuker.bluetooth.library.connect.response.BluetoothConnectStatusResponse;
import com.miot.api.bluetooth.response.BleResponse;
import com.yeelight.cherry.C12224R$drawable;
import com.yeelight.cherry.C12225R$id;
import com.yeelight.cherry.C12228R$layout;
import com.yeelight.yeelib.device.base.C6094f;
import com.yeelight.yeelib.managers.C3064h;
import com.yeelight.yeelib.managers.C3108x;
import com.yeelight.yeelib.managers.C8272e;
import com.yeelight.yeelib.managers.YeelightDeviceManager;
import com.yeelight.yeelib.p142ui.activity.BaseActivity;
import com.yeelight.yeelib.p142ui.view.CommonTitleBar;
import com.yeelight.yeelib.utils.AppUtils;
import java.util.Locale;
import p051j4.C9193k;
import p227x3.C11971h;

/* renamed from: com.yeelight.cherry.ui.activity.MeshDeviceFirmwareUpgradeActivity */
public class MeshDeviceFirmwareUpgradeActivity extends BaseActivity {
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final String f10753g = "MeshDeviceFirmwareUpgradeActivity";

    /* renamed from: h */
    public static final /* synthetic */ int f10754h = 0;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public C6094f f10755a;

    /* renamed from: b */
    private ObjectAnimator f10756b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public int f10757c = 0;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public int f10758d = 0;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public boolean f10759e = false;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public Handler f10760f = new Handler(new C5415a());
    @BindView(2131296489)
    Button mBtnReCheckVersion;
    @BindView(2131296490)
    Button mBtnRetry;
    @BindView(2131296500)
    Button mBtnUpdate;
    @BindView(2131297017)
    LinearLayout mCheckVersionFailLayout;
    @BindView(2131296822)
    ImageView mGetVersionProgress;
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
    @BindView(2131297016)
    LinearLayout mQueryCurrentFirmwareVersionLayout;
    @BindView(2131297591)
    CommonTitleBar mTitleBar;
    @BindView(2131296792)
    LinearLayout mUpdateFailLayout;
    @BindView(2131297715)
    TextView mUpdatingHint;
    @BindView(2131296793)
    LinearLayout mUpdatingLayout;

    /* renamed from: com.yeelight.cherry.ui.activity.MeshDeviceFirmwareUpgradeActivity$a */
    class C5415a implements Handler.Callback {
        C5415a() {
        }

        public boolean handleMessage(Message message) {
            switch (message.what) {
                case 0:
                    MeshDeviceFirmwareUpgradeActivity.this.m16565y0();
                    break;
                case 1:
                    MeshDeviceFirmwareUpgradeActivity.this.m16526A0();
                    break;
                case 2:
                    MeshDeviceFirmwareUpgradeActivity.this.m16566z0();
                    break;
                case 3:
                    MeshDeviceFirmwareUpgradeActivity.this.m16534I0();
                    if (MeshDeviceFirmwareUpgradeActivity.this.f10755a.mo23197N() != null) {
                        MeshDeviceFirmwareUpgradeActivity.this.f10755a.mo23197N().mo42539k(false);
                    }
                    MeshDeviceFirmwareUpgradeActivity.this.mProgress.setText(String.valueOf(100));
                    MeshDeviceFirmwareUpgradeActivity.this.f10760f.removeMessages(6);
                    MeshDeviceFirmwareUpgradeActivity.this.f10760f.sendEmptyMessageDelayed(4, 1000);
                    break;
                case 4:
                    MeshDeviceFirmwareUpgradeActivity.this.m16530E0();
                    break;
                case 5:
                    String unused = MeshDeviceFirmwareUpgradeActivity.f10753g;
                    MeshDeviceFirmwareUpgradeActivity.this.f10760f.removeMessages(6);
                    MeshDeviceFirmwareUpgradeActivity.this.m16532G0();
                    if (MeshDeviceFirmwareUpgradeActivity.this.f10755a.mo23197N() != null) {
                        MeshDeviceFirmwareUpgradeActivity.this.f10755a.mo23197N().mo42539k(false);
                        break;
                    }
                    break;
                case 6:
                    MeshDeviceFirmwareUpgradeActivity.this.m16532G0();
                    break;
                case 8:
                    MeshDeviceFirmwareUpgradeActivity.this.m16528C0();
                    break;
            }
            return false;
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.MeshDeviceFirmwareUpgradeActivity$b */
    class C5416b implements View.OnClickListener {
        C5416b() {
        }

        public void onClick(View view) {
            MeshDeviceFirmwareUpgradeActivity.this.onBackPressed();
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.MeshDeviceFirmwareUpgradeActivity$c */
    class C5417c extends BluetoothConnectStatusResponse {

        /* renamed from: com.yeelight.cherry.ui.activity.MeshDeviceFirmwareUpgradeActivity$c$a */
        class C5418a implements BleResponse<String> {
            C5418a() {
            }

            /* renamed from: a */
            public void onResponse(int i, String str) {
                int i2;
                Handler handler;
                if (i == 0) {
                    String unused = MeshDeviceFirmwareUpgradeActivity.f10753g;
                    StringBuilder sb = new StringBuilder();
                    sb.append("current version = ");
                    sb.append(str);
                    MeshDeviceFirmwareUpgradeActivity.this.f10755a.mo23191J0(new C11971h(str));
                    handler = MeshDeviceFirmwareUpgradeActivity.this.f10760f;
                    i2 = 1;
                } else {
                    handler = MeshDeviceFirmwareUpgradeActivity.this.f10760f;
                    i2 = 8;
                }
                handler.sendEmptyMessage(i2);
            }
        }

        C5417c() {
        }

        public void onAuthResponse(int i, Bundle bundle) {
            String unused = MeshDeviceFirmwareUpgradeActivity.f10753g;
        }

        public void onBindResponse(int i, Bundle bundle) {
            String unused = MeshDeviceFirmwareUpgradeActivity.f10753g;
        }

        public void onCallback(int i, Bundle bundle) {
            String unused = MeshDeviceFirmwareUpgradeActivity.f10753g;
            if (i == 0) {
                MeshDeviceFirmwareUpgradeActivity.this.f10755a.mo31703j2(new C5418a());
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("connect device fail ");
            sb.append(MeshDeviceFirmwareUpgradeActivity.this.f10757c);
            if (MeshDeviceFirmwareUpgradeActivity.this.f10757c < 5) {
                MeshDeviceFirmwareUpgradeActivity.this.f10760f.sendEmptyMessageDelayed(0, 3000);
            } else {
                MeshDeviceFirmwareUpgradeActivity.this.f10760f.sendEmptyMessage(8);
            }
            MeshDeviceFirmwareUpgradeActivity.m16543c0(MeshDeviceFirmwareUpgradeActivity.this);
        }

        public void onConnectResponse(int i, Bundle bundle) {
            String unused = MeshDeviceFirmwareUpgradeActivity.f10753g;
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.MeshDeviceFirmwareUpgradeActivity$d */
    class C5419d implements View.OnClickListener {
        C5419d() {
        }

        public void onClick(View view) {
            boolean unused = MeshDeviceFirmwareUpgradeActivity.this.f10759e = false;
            int unused2 = MeshDeviceFirmwareUpgradeActivity.this.f10758d = 0;
            int unused3 = MeshDeviceFirmwareUpgradeActivity.this.f10757c = 0;
            MeshDeviceFirmwareUpgradeActivity.this.m16531F0();
            MeshDeviceFirmwareUpgradeActivity.this.f10760f.sendEmptyMessage(0);
            MeshDeviceFirmwareUpgradeActivity.this.f10760f.sendEmptyMessageDelayed(6, 600000);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.MeshDeviceFirmwareUpgradeActivity$e */
    class C5420e implements View.OnClickListener {
        C5420e() {
        }

        public void onClick(View view) {
            int unused = MeshDeviceFirmwareUpgradeActivity.this.f10758d = 0;
            int unused2 = MeshDeviceFirmwareUpgradeActivity.this.f10757c = 0;
            MeshDeviceFirmwareUpgradeActivity.this.m16531F0();
            MeshDeviceFirmwareUpgradeActivity.this.f10760f.sendEmptyMessage(0);
        }
    }

    /* renamed from: com.yeelight.cherry.ui.activity.MeshDeviceFirmwareUpgradeActivity$f */
    class C5421f implements Runnable {

        /* renamed from: a */
        final /* synthetic */ int f10767a;

        C5421f(int i) {
            this.f10767a = i;
        }

        public void run() {
            MeshDeviceFirmwareUpgradeActivity.this.mProgress.setText(String.valueOf(this.f10767a));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: A0 */
    public void m16526A0() {
        C3064h.C3069d m = C3064h.m7982j().mo23393m(this.f10755a.mo23208T());
        if (m == null) {
            if (this.f10758d < 5) {
                this.f10755a.mo31706m2();
                this.f10760f.sendEmptyMessageDelayed(1, 3000);
            } else {
                this.f10760f.sendEmptyMessage(8);
            }
            this.f10758d++;
        } else if (this.f10755a.mo23197N() != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("current version = ");
            sb.append(this.f10755a.mo23197N().mo42510b());
            sb.append(" ,latest version = ");
            sb.append(m.mo23418a());
            if (m.mo23418a() > this.f10755a.mo23197N().mo42510b()) {
                m16529D0();
            } else if (!this.f10759e) {
                m16530E0();
            } else {
                this.f10760f.sendEmptyMessage(3);
            }
        }
    }

    /* renamed from: B0 */
    private void m16527B0(int i) {
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
            inflate.findViewById(2131296480).setOnClickListener(new C5812p1(create));
            inflate.findViewById(2131296491).setOnClickListener(new C5822r1(this, create, i));
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
        inflate.findViewById(2131296480).setOnClickListener(new C5812p1(create2));
        inflate.findViewById(2131296491).setOnClickListener(new C5822r1(this, create2, i));
        Display defaultDisplay2 = getWindowManager().getDefaultDisplay();
        WindowManager.LayoutParams attributes2 = create2.getWindow().getAttributes();
        attributes2.height = -2;
        double width2 = (double) defaultDisplay2.getWidth();
        Double.isNaN(width2);
        attributes2.width = (int) (width2 * 0.78d);
        create2.getWindow().setAttributes(attributes2);
    }

    /* access modifiers changed from: private */
    /* renamed from: C0 */
    public void m16528C0() {
        this.mNewUpdateLayout.setVisibility(8);
        this.mNoupdateLayout.setVisibility(8);
        this.mUpdatingLayout.setVisibility(8);
        this.mUpdateFailLayout.setVisibility(8);
        this.mQueryCurrentFirmwareVersionLayout.setVisibility(8);
        this.mCheckVersionFailLayout.setVisibility(0);
        ObjectAnimator objectAnimator = this.f10756b;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        this.mBtnReCheckVersion.setOnClickListener(new C5420e());
    }

    /* renamed from: D0 */
    private void m16529D0() {
        C3064h.C3071f fVar = (C3064h.C3071f) C3064h.m7982j().mo23393m(this.f10755a.mo23208T());
        this.mNewUpdateLayout.setVisibility(0);
        this.mNoupdateLayout.setVisibility(8);
        this.mUpdatingLayout.setVisibility(8);
        this.mUpdateFailLayout.setVisibility(8);
        this.mQueryCurrentFirmwareVersionLayout.setVisibility(8);
        this.mCheckVersionFailLayout.setVisibility(8);
        Locale locale = Locale.US;
        String format = String.format(locale, getText(2131755656).toString(), new Object[]{this.f10755a.mo23197N().mo42511c()});
        String format2 = String.format(locale, getText(2131755657).toString(), new Object[]{fVar.mo23429f()});
        this.mNewUpdateCurrentVersion.setText(format);
        this.mNewUpdateLatestVersion.setText(format2);
        this.mNewUpdateReleaseNote.setText(fVar.mo23430g());
        ObjectAnimator objectAnimator = this.f10756b;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        this.mBtnUpdate.setOnClickListener(new C5817q1(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: E0 */
    public void m16530E0() {
        C3064h.C3071f fVar = (C3064h.C3071f) C3064h.m7982j().mo23393m(this.f10755a.mo23208T());
        this.mNewUpdateLayout.setVisibility(8);
        this.mNoupdateLayout.setVisibility(0);
        this.mUpdatingLayout.setVisibility(8);
        this.mUpdateFailLayout.setVisibility(8);
        this.mQueryCurrentFirmwareVersionLayout.setVisibility(8);
        this.mCheckVersionFailLayout.setVisibility(8);
        if (this.f10755a.mo23197N() != null) {
            this.mNoUpdateCurrentVersion.setText(String.format(Locale.US, getText(2131755656).toString(), new Object[]{fVar.mo23429f()}));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: F0 */
    public void m16531F0() {
        this.mNewUpdateLayout.setVisibility(8);
        this.mNoupdateLayout.setVisibility(8);
        this.mUpdatingLayout.setVisibility(8);
        this.mUpdateFailLayout.setVisibility(8);
        this.mQueryCurrentFirmwareVersionLayout.setVisibility(0);
        this.mCheckVersionFailLayout.setVisibility(8);
        this.mGetVersionProgress.setImageResource(2131231509);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.mGetVersionProgress, Key.ROTATION, new float[]{0.0f, 359.0f});
        this.f10756b = ofFloat;
        ofFloat.setInterpolator(new LinearInterpolator());
        this.f10756b.setDuration(1500);
        this.f10756b.setRepeatMode(1);
        this.f10756b.setRepeatCount(-1);
        this.f10756b.start();
    }

    /* access modifiers changed from: private */
    /* renamed from: G0 */
    public void m16532G0() {
        this.mNewUpdateLayout.setVisibility(8);
        this.mNoupdateLayout.setVisibility(8);
        this.mUpdatingLayout.setVisibility(8);
        this.mUpdateFailLayout.setVisibility(0);
        this.mQueryCurrentFirmwareVersionLayout.setVisibility(8);
        this.mCheckVersionFailLayout.setVisibility(8);
        ObjectAnimator objectAnimator = this.f10756b;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        this.mBtnRetry.setOnClickListener(new C5419d());
    }

    /* renamed from: H0 */
    private void m16533H0() {
        this.mNewUpdateLayout.setVisibility(8);
        this.mNoupdateLayout.setVisibility(8);
        this.mUpdatingLayout.setVisibility(0);
        this.mUpdateFailLayout.setVisibility(8);
        this.mQueryCurrentFirmwareVersionLayout.setVisibility(8);
        this.mCheckVersionFailLayout.setVisibility(8);
        this.mUpdatingHint.setText(2131755663);
        m16566z0();
        this.mProgressView.setImageResource(2131231509);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.mProgressView, Key.ROTATION, new float[]{0.0f, 359.0f});
        this.f10756b = ofFloat;
        ofFloat.setInterpolator(new LinearInterpolator());
        this.f10756b.setDuration(1500);
        this.f10756b.setRepeatMode(1);
        this.f10756b.setRepeatCount(-1);
        this.f10756b.start();
    }

    /* access modifiers changed from: private */
    /* renamed from: I0 */
    public void m16534I0() {
        this.mNewUpdateLayout.setVisibility(8);
        this.mNoupdateLayout.setVisibility(8);
        this.mUpdatingLayout.setVisibility(0);
        this.mUpdateFailLayout.setVisibility(8);
        this.mQueryCurrentFirmwareVersionLayout.setVisibility(8);
        this.mCheckVersionFailLayout.setVisibility(8);
        ObjectAnimator objectAnimator = this.f10756b;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        this.mProgressView.setImageResource(2131231508);
        this.mUpdatingHint.setText(2131755660);
    }

    /* renamed from: J0 */
    private void m16535J0() {
        this.f10755a.mo23137Y0();
        m16533H0();
        this.f10760f.sendEmptyMessageDelayed(6, 600000);
    }

    /* renamed from: c0 */
    static /* synthetic */ int m16543c0(MeshDeviceFirmwareUpgradeActivity meshDeviceFirmwareUpgradeActivity) {
        int i = meshDeviceFirmwareUpgradeActivity.f10757c;
        meshDeviceFirmwareUpgradeActivity.f10757c = i + 1;
        return i;
    }

    /* renamed from: o0 */
    private void m16555o0() {
        if (C8272e.m19511b().mo35203c()) {
            m16535J0();
        } else {
            m16527B0(2);
        }
    }

    @RequiresApi(api = 31)
    /* renamed from: p0 */
    private void m16556p0() {
        if (m16561u0("android.permission.BLUETOOTH_SCAN") && m16561u0("android.permission.BLUETOOTH_CONNECT")) {
            m16555o0();
        } else if (ActivityCompat.shouldShowRequestPermissionRationale(this, "android.permission.BLUETOOTH_SCAN") || ActivityCompat.shouldShowRequestPermissionRationale(this, "android.permission.BLUETOOTH_CONNECT")) {
            mo35655S(2131755993);
        } else {
            ActivityCompat.requestPermissions(this, new String[]{"android.permission.BLUETOOTH_SCAN", "android.permission.BLUETOOTH_CONNECT"}, 2);
        }
    }

    /* renamed from: q0 */
    private void m16557q0() {
        if (!C8272e.m19511b().mo35203c()) {
            m16527B0(2);
        } else if (m16561u0("android.permission.ACCESS_FINE_LOCATION") && m16561u0("android.permission.ACCESS_COARSE_LOCATION")) {
            m16558r0();
        } else if (ActivityCompat.shouldShowRequestPermissionRationale(this, "android.permission.ACCESS_FINE_LOCATION")) {
            mo35655S(2131755994);
        } else {
            ActivityCompat.requestPermissions(this, new String[]{"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"}, 1);
        }
    }

    /* renamed from: r0 */
    private void m16558r0() {
        LocationManager locationManager = (LocationManager) getSystemService("location");
        if (!locationManager.isProviderEnabled("gps") || !locationManager.isProviderEnabled("network")) {
            m16527B0(1);
        } else {
            m16535J0();
        }
    }

    /* renamed from: s0 */
    private void m16559s0() {
        if (Build.VERSION.SDK_INT < 31) {
            m16557q0();
        } else {
            m16556p0();
        }
    }

    @SuppressLint({"MissingPermission"})
    /* renamed from: t0 */
    private void m16560t0() {
        if (Build.VERSION.SDK_INT < 33) {
            C3108x.m8223f().mo23541b().enable();
        } else {
            startActivity(new Intent("android.bluetooth.adapter.action.REQUEST_ENABLE"));
        }
    }

    /* renamed from: u0 */
    private boolean m16561u0(String str) {
        return ContextCompat.checkSelfPermission(this, str) == 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: w0 */
    public /* synthetic */ void m16563w0(AlertDialog alertDialog, int i, View view) {
        alertDialog.dismiss();
        if (i == 1) {
            startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
        } else if (i == 2) {
            m16560t0();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: x0 */
    public /* synthetic */ void m16564x0(View view) {
        m16559s0();
    }

    /* access modifiers changed from: private */
    /* renamed from: y0 */
    public void m16565y0() {
        this.f10755a.mo31702i2(new C5417c());
    }

    /* access modifiers changed from: private */
    /* renamed from: z0 */
    public void m16566z0() {
        if (!(this.f10755a.mo23197N() instanceof C11971h)) {
            return;
        }
        if (((C11971h) this.f10755a.mo23197N()).mo42542l() == 0) {
            int e = this.f10755a.mo23197N().mo42523e();
            StringBuilder sb = new StringBuilder();
            sb.append("queryFirmwareUpgradeProgress!!! ");
            sb.append(e);
            if (e == 100) {
                this.f10759e = true;
                this.f10760f.sendEmptyMessageDelayed(0, 30000);
                return;
            }
            runOnUiThread(new C5421f(e));
            this.f10759e = false;
            this.f10760f.sendEmptyMessageDelayed(2, 3000);
            return;
        }
        this.f10760f.sendEmptyMessage(5);
    }

    public void onBackPressed() {
        super.onBackPressed();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo35653P();
        getWindow().addFlags(128);
        C9193k.m22157h(true, this);
        setContentView(C12228R$layout.activity_mesh_device_firmware_upgrade);
        ButterKnife.bind((Activity) this);
        Intent intent = getIntent();
        if (!intent.hasExtra("com.yeelight.cherry.device_id")) {
            AppUtils.m8302w(f10753g, "Activity has no device id", false);
            finish();
            return;
        }
        this.f10755a = YeelightDeviceManager.m7800o0().mo23314t0(intent.getStringExtra("com.yeelight.cherry.device_id"));
        StringBuilder sb = new StringBuilder();
        sb.append("device id = ");
        sb.append(this.f10755a.mo23185G());
        C6094f fVar = this.f10755a;
        if (fVar == null || !fVar.mo23145k0()) {
            BaseActivity.m19947U(this);
            finish();
            return;
        }
        this.mTitleBar.mo36195a(getResources().getString(2131755659), new C5416b(), (View.OnClickListener) null);
        this.mTitleBar.setTitleTextSize(16);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        this.mTitleBar.setLayoutParams(layoutParams);
        layoutParams.setMargins(0, C9193k.m22154e(this), 0, 0);
        m16531F0();
        this.f10760f.sendEmptyMessage(0);
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        this.f10760f.removeCallbacksAndMessages((Object) null);
        super.onDestroy();
        mo35652M(this);
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
                m16558r0();
                return;
            }
            i2 = 2131755994;
        } else if (i != 2) {
            return;
        } else {
            if (z) {
                m16555o0();
                return;
            }
            i2 = 2131755993;
        }
        mo35655S(i2);
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
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
