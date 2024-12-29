package com.yeelight.yeelib.pickcolor;

import android.app.AlertDialog;
import android.content.ContentResolver;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.provider.MediaStore;
import android.view.KeyEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.core.view.ViewCompat;
import com.google.p017ar.schemas.sceneform.ParameterInitDefType;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.C2563g;
import com.google.zxing.DecodeHintType;
import com.miot.common.ReturnCode;
import com.yeelight.yeelib.R$drawable;
import com.yeelight.yeelib.R$id;
import com.yeelight.yeelib.R$layout;
import com.yeelight.yeelib.R$string;
import com.yeelight.yeelib.device.base.C3012e;
import com.yeelight.yeelib.device.base.DeviceStatusBase;
import com.yeelight.yeelib.managers.YeelightDeviceManager;
import com.yeelight.yeelib.models.C8313f;
import com.yeelight.yeelib.nativelib.NativeLightMix;
import com.yeelight.yeelib.p142ui.activity.BaseActivity;
import com.yeelight.yeelib.pickcolor.ViewfinderView;
import com.yeelight.yeelib.utils.AppUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collection;
import java.util.Map;
import p124a4.C3969d;
import p223w3.C11627r;
import p237z3.C12143c;

public class CaptureActivity extends BaseActivity implements SurfaceHolder.Callback, C12143c, ViewfinderView.C8339c {

    /* renamed from: s */
    private static final String f14351s = CaptureActivity.class.getSimpleName();
    /* access modifiers changed from: private */

    /* renamed from: a */
    public CaptureActivityHandler f14352a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public boolean f14353b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C3969d f14354c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public ViewfinderView f14355d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public boolean f14356e;

    /* renamed from: f */
    private Collection<BarcodeFormat> f14357f;

    /* renamed from: g */
    private Map<DecodeHintType, ?> f14358g;

    /* renamed from: h */
    private String f14359h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public C3012e f14360i;

    /* renamed from: j */
    private TextView f14361j;

    /* renamed from: k */
    private TextView f14362k;

    /* renamed from: l */
    private ImageView f14363l;

    /* renamed from: m */
    private ImageView f14364m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public ImageButton f14365n;

    /* renamed from: o */
    private int f14366o;

    /* renamed from: p */
    private int f14367p;

    /* renamed from: q */
    private boolean f14368q;

    /* renamed from: r */
    private File f14369r;

    /* renamed from: com.yeelight.yeelib.pickcolor.CaptureActivity$a */
    class C8332a implements View.OnClickListener {
        C8332a() {
        }

        public void onClick(View view) {
            CaptureActivity.this.setResult(-1);
            CaptureActivity.this.finish();
        }
    }

    /* renamed from: com.yeelight.yeelib.pickcolor.CaptureActivity$b */
    class C8333b implements View.OnClickListener {
        C8333b() {
        }

        public void onClick(View view) {
            CaptureActivity.this.f14360i.mo23165w1(DeviceStatusBase.DeviceMode.DEVICE_MODE_COLOR);
            int selectColor = CaptureActivity.this.f14355d.getSelectColor();
            if (CaptureActivity.this.f14360i instanceof C11627r) {
                CaptureActivity.this.f14360i.mo23148l1();
                CaptureActivity.this.f14360i.mo23155q1(NativeLightMix.color_rgb_trans((char) Color.red(selectColor), (char) Color.green(selectColor), (char) Color.blue(selectColor)));
                return;
            }
            CaptureActivity.this.f14360i.mo23168x1(new C8313f("", -1, 2, CaptureActivity.this.f14360i.mo23221d0().mo31601m(), selectColor));
        }
    }

    /* renamed from: com.yeelight.yeelib.pickcolor.CaptureActivity$c */
    class C8334c implements View.OnClickListener {
        C8334c() {
        }

        public void onClick(View view) {
            if (CaptureActivity.this.f14354c != null) {
                CaptureActivity.this.f14354c.mo26516m();
            }
        }
    }

    /* renamed from: com.yeelight.yeelib.pickcolor.CaptureActivity$d */
    class C8335d implements View.OnClickListener {
        C8335d() {
        }

        public void onClick(View view) {
            int i;
            boolean z;
            CaptureActivity captureActivity;
            if (CaptureActivity.this.f14356e && CaptureActivity.this.f14354c != null) {
                if (CaptureActivity.this.f14352a != null) {
                    CaptureActivity.this.f14352a.mo35509a();
                    CaptureActivityHandler unused = CaptureActivity.this.f14352a = null;
                }
                CaptureActivity.this.f14354c.mo26506b();
                C3969d unused2 = CaptureActivity.this.f14354c = new C3969d(CaptureActivity.this.getApplicationContext());
                if (CaptureActivity.this.f14353b) {
                    i = CaptureActivity.this.f14354c.mo26510g();
                    captureActivity = CaptureActivity.this;
                    z = false;
                } else {
                    i = CaptureActivity.this.f14354c.mo26507d();
                    captureActivity = CaptureActivity.this;
                    z = true;
                }
                boolean unused3 = captureActivity.f14353b = z;
                CaptureActivity.this.f14354c.mo26514k(i);
                CaptureActivity captureActivity2 = CaptureActivity.this;
                ViewfinderView unused4 = captureActivity2.f14355d = (ViewfinderView) captureActivity2.findViewById(R$id.viewfinder_view);
                CaptureActivity.this.f14355d.setCameraManager(CaptureActivity.this.f14354c);
                CaptureActivity.this.m19902q0(((SurfaceView) CaptureActivity.this.findViewById(R$id.preview_view)).getHolder());
            }
        }
    }

    /* renamed from: com.yeelight.yeelib.pickcolor.CaptureActivity$e */
    class C8336e implements View.OnClickListener {
        C8336e() {
        }

        public void onClick(View view) {
            if (CaptureActivity.this.f14355d.mo35515h()) {
                CaptureActivity.this.startActivityForResult(new Intent("android.intent.action.PICK", MediaStore.Images.Media.EXTERNAL_CONTENT_URI), ReturnCode.E_INVALID_OPERATION);
                return;
            }
            CaptureActivity.this.f14365n.setImageResource(R$drawable.capture_picture);
            CaptureActivity.this.f14355d.mo35517k();
            CaptureActivity captureActivity = CaptureActivity.this;
            ViewfinderView unused = captureActivity.f14355d = (ViewfinderView) captureActivity.findViewById(R$id.viewfinder_view);
            CaptureActivity.this.f14355d.setCameraManager(CaptureActivity.this.f14354c);
            CaptureActivity.this.m19902q0(((SurfaceView) CaptureActivity.this.findViewById(R$id.preview_view)).getHolder());
        }
    }

    /* renamed from: h0 */
    private void m19899h0() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(getString(R$string.error_dialog_name));
        builder.setMessage(getString(R$string.msg_camera_framework_bug));
        builder.setPositiveButton(getString(R$string.common_text_cancel), new C8340a(this));
        builder.setOnCancelListener(new C8340a(this));
        builder.show();
    }

    /* renamed from: l0 */
    private int m19900l0(byte[] bArr, int i, int i2, int i3, int i4) {
        getWindowManager();
        int i5 = 255;
        byte b = bArr[(i4 * i) + i3] & 255;
        int i6 = (i2 * i) + ((i4 >> 1) * i) + (i3 & -2);
        byte b2 = bArr[i6 + 0] & 255;
        byte b3 = bArr[i6 + 1] & 255;
        if (b < 16) {
            b = ParameterInitDefType.ExternalSamplerInit;
        }
        float f = ((float) (b - ParameterInitDefType.ExternalSamplerInit)) * 1.164f;
        float f2 = (float) (b3 - 128);
        int round = Math.round((1.596f * f2) + f);
        float f3 = (float) (b2 - 128);
        int round2 = Math.round((f - (f2 * 0.813f)) - (0.391f * f3));
        int round3 = Math.round(f + (f3 * 2.018f));
        if (round < 0) {
            round = 0;
        } else if (round > 255) {
            round = 255;
        }
        if (round2 < 0) {
            round2 = 0;
        } else if (round2 > 255) {
            round2 = 255;
        }
        if (round3 < 0) {
            i5 = 0;
        } else if (round3 <= 255) {
            i5 = round3;
        }
        return (i5 << 16) + ViewCompat.MEASURED_STATE_MASK + (round2 << 8) + round;
    }

    /* renamed from: p0 */
    private void m19901p0() {
        if (!Environment.getExternalStorageState().equals("mounted")) {
            this.f14368q = false;
        } else {
            try {
                this.f14368q = true;
                String str = Environment.getExternalStorageDirectory().getAbsolutePath() + "/yeelight";
                m19905t0(str);
                File file = new File(str + "/crop_capture.jpg");
                this.f14369r = file;
                if (!file.exists()) {
                    this.f14369r.createNewFile();
                }
            } catch (Exception e) {
                this.f14368q = false;
                e.printStackTrace();
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("initCacheFile isStorage: ");
        sb.append(this.f14368q);
    }

    /* access modifiers changed from: private */
    /* renamed from: q0 */
    public void m19902q0(SurfaceHolder surfaceHolder) {
        if (surfaceHolder == null) {
            throw new IllegalStateException("No SurfaceHolder provided");
        } else if (!this.f14354c.mo26511h()) {
            try {
                this.f14354c.mo26512i(surfaceHolder);
                if (this.f14352a == null) {
                    this.f14352a = new CaptureActivityHandler(this, this.f14357f, this.f14358g, this.f14359h, this.f14354c);
                }
            } catch (IOException | RuntimeException unused) {
                m19899h0();
            }
        }
    }

    /* renamed from: r0 */
    private void m19903r0(String str) {
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(str, options);
            int i = options.outWidth;
            int i2 = this.f14366o;
            float f = 1.0f;
            float f2 = i > i2 ? ((float) i) / ((float) i2) : 1.0f;
            int i3 = options.outHeight;
            int i4 = this.f14367p;
            if (i3 > i4 / 2) {
                f = ((float) i3) / ((float) (i4 / 2));
            }
            int i5 = f2 > f ? (int) f2 : (int) f;
            options.inJustDecodeBounds = false;
            options.inSampleSize = 1;
            options.inPreferredConfig = Bitmap.Config.ARGB_8888;
            options.inPurgeable = true;
            options.inInputShareable = true;
            options.inSampleSize = i5;
            this.f14355d.setBitmap(BitmapFactory.decodeStream(new FileInputStream(new File(str))));
            this.f14365n.setImageResource(R$drawable.capture_camera);
            if (this.f14354c.mo26511h()) {
                this.f14354c.mo26506b();
            }
        } catch (Exception unused) {
            Toast.makeText(this, "加载图片失败", 0).show();
        }
    }

    /* renamed from: s0 */
    private boolean m19904s0(Uri uri) {
        ContentResolver contentResolver = getContentResolver();
        String[] strArr = {"_data"};
        if (uri.getScheme().equals("file")) {
            m19903r0(uri.getEncodedPath());
            return true;
        }
        Cursor query = contentResolver.query(uri, strArr, (String) null, (String[]) null, (String) null);
        if (query == null) {
            return false;
        }
        String string = query.moveToFirst() ? query.getString(query.getColumnIndexOrThrow("_data")) : null;
        query.close();
        if (string == null) {
            return false;
        }
        m19903r0(string);
        return true;
    }

    /* renamed from: t0 */
    public static void m19905t0(String str) {
        try {
            File file = new File(str);
            if (!file.exists()) {
                file.mkdir();
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: i0 */
    public void mo35492i0() {
        this.f14355d.mo35511g();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j0 */
    public C3969d mo35493j0() {
        return this.f14354c;
    }

    /* renamed from: k0 */
    public Handler mo35494k0() {
        return this.f14352a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m0 */
    public ViewfinderView mo35495m0() {
        return this.f14355d;
    }

    /* renamed from: n0 */
    public void mo35496n0(byte[] bArr, int i, int i2) {
        if (this.f14355d.mo35515h()) {
            int[] iArr = new int[2];
            this.f14355d.getLocationOnScreen(iArr);
            int l0 = m19900l0(bArr, i, i2, (i / 2) - iArr[1], i2 / 2);
            this.f14355d.setSelectColor(l0);
            this.f14362k.setText(String.format("R:%03d  G:%03d  B:%03d", new Object[]{Integer.valueOf(Color.red(l0)), Integer.valueOf(Color.green(l0)), Integer.valueOf(Color.blue(l0))}));
        }
    }

    /* renamed from: o0 */
    public void mo35497o0(C2563g gVar, Bitmap bitmap, float f) {
        mo35503u0(1000);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (!(i != 1005 || intent == null || intent.getData() == null)) {
            m19904s0(intent.getData());
        }
        if (i == 1006 && i2 == -1) {
            m19904s0(Uri.fromFile(this.f14369r));
        }
    }

    public void onConnectionStateChanged(int i, int i2) {
        if (i2 == 0) {
            finish();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo35653P();
        setContentView(R$layout.activity_capture);
        Intent intent = getIntent();
        if (!intent.hasExtra("com.yeelight.cherry.device_id")) {
            AppUtils.m8302w(f14351s, "Activity has not device id", false);
            finish();
            return;
        }
        C3012e r0 = YeelightDeviceManager.m7804r0(intent.getStringExtra("com.yeelight.cherry.device_id"));
        this.f14360i = r0;
        if (r0 == null || !r0.mo23145k0()) {
            BaseActivity.m19947U(this);
            finish();
            return;
        }
        this.f14366o = getResources().getDisplayMetrics().widthPixels;
        this.f14367p = getResources().getDisplayMetrics().heightPixels;
        this.f14361j = (TextView) findViewById(R$id.capture_apply);
        this.f14362k = (TextView) findViewById(R$id.capture_rgb);
        this.f14363l = (ImageView) findViewById(R$id.capture_light);
        this.f14364m = (ImageView) findViewById(R$id.capture_convert);
        this.f14365n = (ImageButton) findViewById(R$id.capture_type);
        findViewById(R$id.capture_return).setOnClickListener(new C8332a());
        this.f14361j.setOnClickListener(new C8333b());
        this.f14363l.setOnClickListener(new C8334c());
        this.f14364m.setOnClickListener(new C8335d());
        this.f14365n.setOnClickListener(new C8336e());
        this.f14356e = false;
        this.f14357f = C8341b.f14399d;
        this.f14358g = null;
        this.f14359h = null;
        m19901p0();
    }

    public void onDestroy() {
        super.onDestroy();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4) {
            if (!(i == 27 || i == 80)) {
                if (i == 24) {
                    this.f14354c.mo26517n(true);
                } else if (i != 25) {
                    return super.onKeyDown(i, keyEvent);
                } else {
                    this.f14354c.mo26517n(false);
                    return true;
                }
            }
            return true;
        }
        setResult(-1);
        finish();
        return true;
    }

    public void onLocalConnected() {
    }

    public void onLocalDisconnected() {
    }

    public void onPause() {
        CaptureActivityHandler captureActivityHandler = this.f14352a;
        if (captureActivityHandler != null) {
            captureActivityHandler.mo35509a();
            this.f14352a = null;
        }
        if (this.f14354c.mo26511h()) {
            this.f14354c.mo26506b();
        }
        if (!this.f14356e) {
            ((SurfaceView) findViewById(R$id.preview_view)).getHolder().removeCallback(this);
        }
        ViewfinderView viewfinderView = this.f14355d;
        if (viewfinderView != null) {
            viewfinderView.mo35518l();
        }
        this.f14360i.mo23133V0(this);
        super.onPause();
    }

    public void onResume() {
        super.onResume();
        if (getRequestedOrientation() != 1) {
            setRequestedOrientation(1);
        }
        this.f14360i.mo23171z0(this);
        this.f14353b = true;
        this.f14354c = new C3969d(getApplicationContext());
        ViewfinderView viewfinderView = (ViewfinderView) findViewById(R$id.viewfinder_view);
        this.f14355d = viewfinderView;
        viewfinderView.setCameraManager(this.f14354c);
        this.f14355d.mo35516j(this);
        SurfaceHolder holder = ((SurfaceView) findViewById(R$id.preview_view)).getHolder();
        if (this.f14356e) {
            m19902q0(holder);
        } else {
            holder.addCallback(this);
        }
    }

    /* renamed from: s */
    public void mo35499s(String str) {
        this.f14362k.setText(str);
    }

    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
    }

    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        if (!this.f14356e) {
            this.f14356e = true;
            m19902q0(surfaceHolder);
        }
    }

    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        this.f14356e = false;
    }

    /* renamed from: u0 */
    public void mo35503u0(long j) {
        CaptureActivityHandler captureActivityHandler = this.f14352a;
        if (captureActivityHandler != null) {
            captureActivityHandler.sendEmptyMessageDelayed(R$id.restart_preview, j);
        }
    }
}
