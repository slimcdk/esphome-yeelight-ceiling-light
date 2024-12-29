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
import com.google.p107ar.schemas.sceneform.ParameterInitDefType;
import com.miot.common.ReturnCode;
import com.yeelight.yeelib.R$drawable;
import com.yeelight.yeelib.R$id;
import com.yeelight.yeelib.R$layout;
import com.yeelight.yeelib.R$string;
import com.yeelight.yeelib.nativelib.NativeLightMix;
import com.yeelight.yeelib.p150c.p151i.C4200i;
import com.yeelight.yeelib.p150c.p151i.C6024e;
import com.yeelight.yeelib.p150c.p183m.C7186q;
import com.yeelight.yeelib.p152f.C4257w;
import com.yeelight.yeelib.p153g.C9835f;
import com.yeelight.yeelib.p186e.C9768c;
import com.yeelight.yeelib.p194ui.activity.BaseActivity;
import com.yeelight.yeelib.pickcolor.ViewfinderView;
import com.yeelight.yeelib.pickcolor.p193g.C9927d;
import com.yeelight.yeelib.utils.C4308b;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collection;
import java.util.Map;
import p011c.p012a.p053e.C0814a;
import p011c.p012a.p053e.C0818e;
import p011c.p012a.p053e.C0827n;

public class CaptureActivity extends BaseActivity implements SurfaceHolder.Callback, C9768c, ViewfinderView.C9913c {

    /* renamed from: t */
    private static final String f18018t = CaptureActivity.class.getSimpleName();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C9915b f18019b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public boolean f18020c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C9927d f18021d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public ViewfinderView f18022e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public boolean f18023f;

    /* renamed from: g */
    private Collection<C0814a> f18024g;

    /* renamed from: h */
    private Map<C0818e, ?> f18025h;

    /* renamed from: i */
    private String f18026i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public C4200i f18027j;

    /* renamed from: k */
    private TextView f18028k;

    /* renamed from: l */
    private TextView f18029l;

    /* renamed from: m */
    private ImageView f18030m;

    /* renamed from: n */
    private ImageView f18031n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public ImageButton f18032o;

    /* renamed from: p */
    private int f18033p;

    /* renamed from: q */
    private int f18034q;

    /* renamed from: r */
    private boolean f18035r;

    /* renamed from: s */
    private File f18036s;

    /* renamed from: com.yeelight.yeelib.pickcolor.CaptureActivity$a */
    class C9906a implements View.OnClickListener {
        C9906a() {
        }

        public void onClick(View view) {
            CaptureActivity.this.setResult(-1);
            CaptureActivity.this.finish();
        }
    }

    /* renamed from: com.yeelight.yeelib.pickcolor.CaptureActivity$b */
    class C9907b implements View.OnClickListener {
        C9907b() {
        }

        public void onClick(View view) {
            CaptureActivity.this.f18027j.mo23352w1(C6024e.C6028d.DEVICE_MODE_COLOR);
            int selectColor = CaptureActivity.this.f18022e.getSelectColor();
            if (CaptureActivity.this.f18027j instanceof C7186q) {
                CaptureActivity.this.f18027j.mo23334l1();
                CaptureActivity.this.f18027j.mo23341q1(NativeLightMix.color_rgb_trans((char) Color.red(selectColor), (char) Color.green(selectColor), (char) Color.blue(selectColor)));
                return;
            }
            CaptureActivity.this.f18027j.mo23355x1(new C9835f("", -1, 2, CaptureActivity.this.f18027j.mo23408d0().mo27700m(), selectColor));
        }
    }

    /* renamed from: com.yeelight.yeelib.pickcolor.CaptureActivity$c */
    class C9908c implements View.OnClickListener {
        C9908c() {
        }

        public void onClick(View view) {
            if (CaptureActivity.this.f18021d != null) {
                CaptureActivity.this.f18021d.mo32083m();
            }
        }
    }

    /* renamed from: com.yeelight.yeelib.pickcolor.CaptureActivity$d */
    class C9909d implements View.OnClickListener {
        C9909d() {
        }

        public void onClick(View view) {
            int i;
            boolean z;
            CaptureActivity captureActivity;
            if (CaptureActivity.this.f18023f && CaptureActivity.this.f18021d != null) {
                if (CaptureActivity.this.f18019b != null) {
                    CaptureActivity.this.f18019b.mo32055a();
                    C9915b unused = CaptureActivity.this.f18019b = null;
                }
                CaptureActivity.this.f18021d.mo32073b();
                C9927d unused2 = CaptureActivity.this.f18021d = new C9927d(CaptureActivity.this.getApplicationContext());
                if (CaptureActivity.this.f18020c) {
                    i = CaptureActivity.this.f18021d.mo32077g();
                    captureActivity = CaptureActivity.this;
                    z = false;
                } else {
                    i = CaptureActivity.this.f18021d.mo32074d();
                    captureActivity = CaptureActivity.this;
                    z = true;
                }
                boolean unused3 = captureActivity.f18020c = z;
                CaptureActivity.this.f18021d.mo32081k(i);
                CaptureActivity captureActivity2 = CaptureActivity.this;
                ViewfinderView unused4 = captureActivity2.f18022e = (ViewfinderView) captureActivity2.findViewById(R$id.viewfinder_view);
                CaptureActivity.this.f18022e.setCameraManager(CaptureActivity.this.f18021d);
                CaptureActivity.this.m24311r0(((SurfaceView) CaptureActivity.this.findViewById(R$id.preview_view)).getHolder());
            }
        }
    }

    /* renamed from: com.yeelight.yeelib.pickcolor.CaptureActivity$e */
    class C9910e implements View.OnClickListener {
        C9910e() {
        }

        public void onClick(View view) {
            if (CaptureActivity.this.f18022e.mo32043h()) {
                CaptureActivity.this.startActivityForResult(new Intent("android.intent.action.PICK", MediaStore.Images.Media.EXTERNAL_CONTENT_URI), ReturnCode.E_INVALID_OPERATION);
                return;
            }
            CaptureActivity.this.f18032o.setImageResource(R$drawable.capture_picture);
            CaptureActivity.this.f18022e.mo32045k();
            CaptureActivity captureActivity = CaptureActivity.this;
            ViewfinderView unused = captureActivity.f18022e = (ViewfinderView) captureActivity.findViewById(R$id.viewfinder_view);
            CaptureActivity.this.f18022e.setCameraManager(CaptureActivity.this.f18021d);
            CaptureActivity.this.m24311r0(((SurfaceView) CaptureActivity.this.findViewById(R$id.preview_view)).getHolder());
        }
    }

    /* renamed from: h0 */
    private void m24307h0(Uri uri, int i, int i2, int i3) {
        Intent intent = new Intent("com.android.camera.action.CROP");
        intent.setDataAndType(uri, "image/*");
        intent.putExtra("crop", "true");
        intent.putExtra("aspectX", 1);
        intent.putExtra("aspectY", 1);
        intent.putExtra("outputX", i);
        intent.putExtra("outputY", i2);
        intent.putExtra("scale", false);
        intent.putExtra("output", Uri.fromFile(this.f18036s));
        intent.putExtra("return-data", false);
        intent.putExtra("outputFormat", Bitmap.CompressFormat.JPEG.toString());
        intent.putExtra("noFaceDetection", true);
        startActivityForResult(intent, i3);
    }

    /* renamed from: i0 */
    private void m24308i0() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(getString(R$string.error_dialog_name));
        builder.setMessage(getString(R$string.msg_camera_framework_bug));
        builder.setPositiveButton(getString(R$string.common_text_cancel), new C9914a(this));
        builder.setOnCancelListener(new C9914a(this));
        builder.show();
    }

    /* renamed from: m0 */
    private int m24309m0(byte[] bArr, int i, int i2, int i3, int i4) {
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

    /* renamed from: q0 */
    private void m24310q0() {
        if (!Environment.getExternalStorageState().equals("mounted")) {
            this.f18035r = false;
            return;
        }
        try {
            this.f18035r = true;
            String str = Environment.getExternalStorageDirectory().getAbsolutePath() + "/yeelight";
            m24314u0(str);
            File file = new File(str + "/crop_capture.jpg");
            this.f18036s = file;
            if (!file.exists()) {
                this.f18036s.createNewFile();
            }
        } catch (Exception e) {
            this.f18035r = false;
            e.printStackTrace();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: r0 */
    public void m24311r0(SurfaceHolder surfaceHolder) {
        if (surfaceHolder == null) {
            throw new IllegalStateException("No SurfaceHolder provided");
        } else if (!this.f18021d.mo32078h()) {
            try {
                this.f18021d.mo32079i(surfaceHolder);
                if (this.f18019b == null) {
                    this.f18019b = new C9915b(this, this.f18024g, this.f18025h, this.f18026i, this.f18021d);
                }
            } catch (IOException | RuntimeException unused) {
                m24308i0();
            }
        }
    }

    /* renamed from: s0 */
    private void m24312s0(String str) {
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(str, options);
            float f = 1.0f;
            float f2 = options.outWidth > this.f18033p ? ((float) options.outWidth) / ((float) this.f18033p) : 1.0f;
            if (options.outHeight > this.f18034q / 2) {
                f = ((float) options.outHeight) / ((float) (this.f18034q / 2));
            }
            int i = f2 > f ? (int) f2 : (int) f;
            options.inJustDecodeBounds = false;
            options.inSampleSize = 1;
            options.inPreferredConfig = Bitmap.Config.ARGB_8888;
            options.inPurgeable = true;
            options.inInputShareable = true;
            options.inSampleSize = i;
            this.f18022e.setBitmap(BitmapFactory.decodeStream(new FileInputStream(new File(str))));
            this.f18032o.setImageResource(R$drawable.capture_camera);
            if (this.f18021d.mo32078h()) {
                this.f18021d.mo32073b();
            }
        } catch (Exception unused) {
            Toast.makeText(this, "加载图片失败", 0).show();
        }
    }

    /* renamed from: t0 */
    private boolean m24313t0(Uri uri) {
        ContentResolver contentResolver = getContentResolver();
        String[] strArr = {"_data"};
        if (uri.getScheme().equals("file")) {
            m24312s0(uri.getEncodedPath());
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
        m24312s0(string);
        return true;
    }

    /* renamed from: u0 */
    public static void m24314u0(String str) {
        try {
            File file = new File(str);
            if (!file.exists()) {
                file.mkdir();
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: j0 */
    public void mo32022j0() {
        this.f18022e.mo32039g();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k0 */
    public C9927d mo32023k0() {
        return this.f18021d;
    }

    /* renamed from: l0 */
    public Handler mo32024l0() {
        return this.f18019b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n0 */
    public ViewfinderView mo32025n0() {
        return this.f18022e;
    }

    /* renamed from: o0 */
    public void mo32026o0(byte[] bArr, int i, int i2) {
        if (this.f18022e.mo32043h()) {
            int[] iArr = new int[2];
            this.f18022e.getLocationOnScreen(iArr);
            int m0 = m24309m0(bArr, i, i2, (i / 2) - iArr[1], i2 / 2);
            this.f18022e.setSelectColor(m0);
            this.f18029l.setText(String.format("R:%03d  G:%03d  B:%03d", new Object[]{Integer.valueOf(Color.red(m0)), Integer.valueOf(Color.green(m0)), Integer.valueOf(Color.blue(m0))}));
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (!(i != 1005 || intent == null || intent.getData() == null)) {
            Uri data = intent.getData();
            if (this.f18035r) {
                int i3 = this.f18033p;
                m24307h0(data, i3, i3, 1006);
            } else {
                m24313t0(data);
            }
        }
        if (i == 1006 && i2 == -1) {
            m24313t0(Uri.fromFile(this.f18036s));
        }
    }

    public void onConnectionStateChanged(int i, int i2) {
        if (i2 == 0) {
            finish();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo32193P();
        setContentView(R$layout.activity_capture);
        Intent intent = getIntent();
        if (!intent.hasExtra("com.yeelight.cherry.device_id")) {
            C4308b.m12141t(f18018t, "Activity has not device id", false);
            finish();
            return;
        }
        C4200i o0 = C4257w.m11953o0(intent.getStringExtra("com.yeelight.cherry.device_id"));
        this.f18027j = o0;
        if (o0 == null || !o0.mo23331k0()) {
            BaseActivity.m24384U(this);
            finish();
            return;
        }
        this.f18033p = getResources().getDisplayMetrics().widthPixels;
        this.f18034q = getResources().getDisplayMetrics().heightPixels;
        this.f18028k = (TextView) findViewById(R$id.capture_apply);
        this.f18029l = (TextView) findViewById(R$id.capture_rgb);
        this.f18030m = (ImageView) findViewById(R$id.capture_light);
        this.f18031n = (ImageView) findViewById(R$id.capture_convert);
        this.f18032o = (ImageButton) findViewById(R$id.capture_type);
        findViewById(R$id.capture_return).setOnClickListener(new C9906a());
        this.f18028k.setOnClickListener(new C9907b());
        this.f18030m.setOnClickListener(new C9908c());
        this.f18031n.setOnClickListener(new C9909d());
        this.f18032o.setOnClickListener(new C9910e());
        this.f18023f = false;
        this.f18024g = C9917c.f18070d;
        this.f18025h = null;
        this.f18026i = null;
        m24310q0();
    }

    public void onDestroy() {
        super.onDestroy();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4) {
            if (!(i == 27 || i == 80)) {
                if (i == 24) {
                    this.f18021d.mo32084n(true);
                } else if (i != 25) {
                    return super.onKeyDown(i, keyEvent);
                } else {
                    this.f18021d.mo32084n(false);
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
        C9915b bVar = this.f18019b;
        if (bVar != null) {
            bVar.mo32055a();
            this.f18019b = null;
        }
        if (this.f18021d.mo32078h()) {
            this.f18021d.mo32073b();
        }
        if (!this.f18023f) {
            ((SurfaceView) findViewById(R$id.preview_view)).getHolder().removeCallback(this);
        }
        ViewfinderView viewfinderView = this.f18022e;
        if (viewfinderView != null) {
            viewfinderView.mo32046l();
        }
        this.f18027j.mo23319V0(this);
        super.onPause();
    }

    public void onResume() {
        super.onResume();
        if (getRequestedOrientation() != 1) {
            setRequestedOrientation(1);
        }
        this.f18027j.mo23358z0(this);
        this.f18020c = true;
        this.f18021d = new C9927d(getApplicationContext());
        ViewfinderView viewfinderView = (ViewfinderView) findViewById(R$id.viewfinder_view);
        this.f18022e = viewfinderView;
        viewfinderView.setCameraManager(this.f18021d);
        this.f18022e.mo32044j(this);
        SurfaceHolder holder = ((SurfaceView) findViewById(R$id.preview_view)).getHolder();
        if (this.f18023f) {
            m24311r0(holder);
        } else {
            holder.addCallback(this);
        }
    }

    /* renamed from: p0 */
    public void mo32028p0(C0827n nVar, Bitmap bitmap, float f) {
        mo32033v0(1000);
    }

    /* renamed from: s */
    public void mo32029s(String str) {
        this.f18029l.setText(str);
    }

    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
    }

    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        if (!this.f18023f) {
            this.f18023f = true;
            m24311r0(surfaceHolder);
        }
    }

    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        this.f18023f = false;
    }

    /* renamed from: v0 */
    public void mo32033v0(long j) {
        C9915b bVar = this.f18019b;
        if (bVar != null) {
            bVar.sendEmptyMessageDelayed(R$id.restart_preview, j);
        }
    }
}
