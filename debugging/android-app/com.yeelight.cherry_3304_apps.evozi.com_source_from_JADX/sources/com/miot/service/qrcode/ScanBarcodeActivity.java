package com.miot.service.qrcode;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.Nullable;
import com.miot.common.utils.DisplayUtils;
import com.miot.service.C3602R;
import com.miot.service.connection.wifi.SmartConfigDataProvider;
import com.miot.service.connection.wifi.SmartConfigMainActivity;
import com.miot.service.qrcode.camera.CameraManager;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import p011c.p012a.p053e.C0814a;
import p011c.p012a.p053e.C0818e;
import p011c.p012a.p053e.C0827n;
import p011c.p012a.p053e.C0829p;

public class ScanBarcodeActivity extends Activity implements SurfaceHolder.Callback {
    public static final int FLAG_FROM_CONNECT_DEVICE = 100;
    public static final int FLAG_FROM_FIND_DEVICE = 200;
    public static final String PID = "pid";
    private static final int REQUEST_RESET_NBIOT = 11;
    public static final int RESULT_NBIOT = -2;
    public static final String SCAN_RESULT = "scan_result";
    private static final String TAG = ScanBarcodeActivity.class.getSimpleName();
    public static final String TITLE = "title";
    private AmbientLightManager ambientLightManager;
    private BeepManager beepManager;
    private CameraManager cameraManager;
    private CaptureActivityHandler handler;
    private boolean hasSurface;
    private InactivityTimer inactivityTimer;
    private boolean isInit = false;
    /* access modifiers changed from: private */
    public boolean isVerifyQrcode = false;
    private C0827n lastResult;
    private int mFrom;
    private String mModel;
    /* access modifiers changed from: private */
    public ObjectAnimator mScanAnim;
    private View mScanLine;
    private C0827n savedResultToShow;
    private ViewfinderView viewfinderView;

    private void decodeOrStoreSavedBitmap(Bitmap bitmap, C0827n nVar) {
        if (this.handler == null) {
            this.savedResultToShow = nVar;
            return;
        }
        if (nVar != null) {
            this.savedResultToShow = nVar;
        }
        C0827n nVar2 = this.savedResultToShow;
        if (nVar2 != null) {
            this.handler.sendMessage(Message.obtain(this.handler, C3602R.C3604id.decode_succeeded, nVar2));
        }
        this.savedResultToShow = null;
    }

    private void displayFrameworkBugMessageAndExit() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage(getString(C3602R.string.msg_camera_framework_bug));
        builder.setPositiveButton(C3602R.string.confirm, new FinishListener(this));
        builder.setOnCancelListener(new FinishListener(this));
        builder.show();
    }

    private static void drawLine(Canvas canvas, Paint paint, C0829p pVar, C0829p pVar2, float f) {
        if (pVar != null && pVar2 != null) {
            canvas.drawLine(f * pVar.mo9020c(), f * pVar.mo9021d(), f * pVar2.mo9020c(), f * pVar2.mo9021d(), paint);
        }
    }

    private void drawResultPoints(Bitmap bitmap, float f, C0827n nVar) {
        C0829p pVar;
        C0829p pVar2;
        C0829p[] e = nVar.mo9015e();
        if (e != null && e.length > 0) {
            Canvas canvas = new Canvas(bitmap);
            Paint paint = new Paint();
            paint.setColor(getResources().getColor(C3602R.color.result_points));
            if (e.length == 2) {
                paint.setStrokeWidth(4.0f);
                pVar = e[0];
                pVar2 = e[1];
            } else if (e.length == 4 && (nVar.mo9012b() == C0814a.UPC_A || nVar.mo9012b() == C0814a.EAN_13)) {
                drawLine(canvas, paint, e[0], e[1], f);
                pVar = e[2];
                pVar2 = e[3];
            } else {
                paint.setStrokeWidth(10.0f);
                for (C0829p pVar3 : e) {
                    if (pVar3 != null) {
                        canvas.drawPoint(pVar3.mo9020c() * f, pVar3.mo9021d() * f, paint);
                    }
                }
                return;
            }
            drawLine(canvas, paint, pVar, pVar2, f);
        }
    }

    /* access modifiers changed from: private */
    public void finishThis() {
        Intent intent = new Intent();
        intent.putExtra("finish", false);
        setResult(0, intent);
        finish();
    }

    private void initAnimation() {
        View view = this.mScanLine;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "translationY", new float[]{view.getTranslationY(), (float) DisplayUtils.dip2px((Activity) this, 194.0f)});
        this.mScanAnim = ofFloat;
        ofFloat.setDuration(3000);
        this.mScanAnim.setRepeatCount(-1);
        this.mScanAnim.setInterpolator(new LinearInterpolator());
    }

    private void initCamera(SurfaceHolder surfaceHolder) {
        if (!this.isInit) {
            this.isInit = true;
            if (surfaceHolder == null) {
                throw new IllegalStateException("No SurfaceHolder provided");
            } else if (!this.cameraManager.isOpen()) {
                try {
                    int dimensionPixelSize = getResources().getDimensionPixelSize(C3602R.dimen.std_titlebar_height);
                    DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
                    this.cameraManager.openDriver(surfaceHolder, displayMetrics.widthPixels, displayMetrics.heightPixels - dimensionPixelSize);
                    if (this.handler == null) {
                        Intent intent = getIntent();
                        ArrayList arrayList = new ArrayList();
                        if (intent != null) {
                            C0814a[] values = C0814a.values();
                            int[] intArrayExtra = intent.getIntArrayExtra("barcode_format");
                            if (intArrayExtra != null) {
                                for (int i = 0; i < intArrayExtra.length; i++) {
                                    if (intArrayExtra[i] >= 0 && intArrayExtra[i] < values.length) {
                                        arrayList.add(values[intArrayExtra[i]]);
                                    }
                                }
                            } else {
                                int intExtra = intent.getIntExtra("barcode_format", -1);
                                if (intExtra >= 0 && intExtra < values.length) {
                                    arrayList.add(values[intExtra]);
                                }
                            }
                        }
                        if (arrayList.size() == 0) {
                            arrayList.add(C0814a.QR_CODE);
                        }
                        this.handler = new CaptureActivityHandler(this, arrayList, (Map<C0818e, ?>) null, (String) null, this.cameraManager);
                    }
                    decodeOrStoreSavedBitmap((Bitmap) null, (C0827n) null);
                } catch (IOException | Exception unused) {
                    displayFrameworkBugMessageAndExit();
                }
            }
        }
    }

    private boolean isFromXiaoxunWatch() {
        return !TextUtils.isEmpty(this.mModel) && this.mModel.startsWith("xiaoxun.watch");
    }

    private void processNbIotDevice(QrCodeParser qrCodeParser, String str) {
        if (!TextUtils.isEmpty(qrCodeParser.toString())) {
            Intent intent = new Intent(this, SmartConfigMainActivity.class);
            intent.putExtra("strategy_id", 12);
            intent.putExtra(SmartConfigDataProvider.KEY_SCAN_QR_CODE, qrCodeParser.toString());
            startActivityForResult(intent, 100);
        }
        finish();
    }

    private void resetStatusView() {
        this.viewfinderView.setVisibility(0);
        this.lastResult = null;
    }

    private void verifyFailed() {
        Handler handler2 = getHandler();
        if (handler2 != null) {
            restartPreviewAfterDelay(3000);
            handler2.postDelayed(new Runnable() {
                public void run() {
                    boolean unused = ScanBarcodeActivity.this.isVerifyQrcode = false;
                    if (!ScanBarcodeActivity.this.mScanAnim.isRunning()) {
                        ScanBarcodeActivity.this.mScanAnim.start();
                    }
                    ScanBarcodeActivity scanBarcodeActivity = ScanBarcodeActivity.this;
                    Toast.makeText(scanBarcodeActivity, scanBarcodeActivity.getString(C3602R.string.verifying_qrcode_failed), 0).show();
                }
            }, 1000);
        }
    }

    private void verifyQrcode(String str) {
        QrCodeParser qrCodeParser;
        String stringExtra = getIntent().getStringExtra(PID);
        int i = this.mFrom;
        if (i == 100) {
            if (this.mModel == null) {
                finishThis();
            }
            if (!isFromXiaoxunWatch()) {
                qrCodeParser = new QrCodeParser(str, stringExtra);
                if (qrCodeParser.getType() == null) {
                    return;
                }
            } else {
                return;
            }
        } else if (i == 200) {
            qrCodeParser = new QrCodeParser(str, stringExtra);
            if (qrCodeParser.getType() == null) {
                if (TextUtils.isEmpty(str) || (!str.contains("url.cn/5kZjV2P") && !str.contains("home.mi.com"))) {
                    verifyFailed();
                    return;
                }
                return;
            }
        } else {
            return;
        }
        processNbIotDevice(qrCodeParser, stringExtra);
    }

    public void drawViewfinder() {
        this.viewfinderView.drawViewfinder();
    }

    /* access modifiers changed from: package-private */
    public CameraManager getCameraManager() {
        return this.cameraManager;
    }

    public Handler getHandler() {
        return this.handler;
    }

    /* access modifiers changed from: package-private */
    public ViewfinderView getViewfinderView() {
        return this.viewfinderView;
    }

    public void handleDecode(C0827n nVar, Bitmap bitmap, float f) {
        this.inactivityTimer.onActivity();
        this.lastResult = nVar;
        if (bitmap != null) {
            this.beepManager.playBeepSoundAndVibrate();
            drawResultPoints(bitmap, f, nVar);
        }
        this.mScanAnim.cancel();
        if (this.mFrom != 0) {
            verifyQrcode(nVar.mo9016f());
            return;
        }
        Intent intent = new Intent();
        intent.putExtra(SCAN_RESULT, nVar.mo9016f());
        setResult(-1, intent);
        finish();
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, @Nullable Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 11) {
            if (i2 == -1) {
                setResult(-2, intent);
            }
            finish();
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().addFlags(128);
        setContentView(C3602R.layout.scan_barcode_activity);
        findViewById(C3602R.C3604id.module_a_3_return_btn).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                ScanBarcodeActivity.this.finishThis();
            }
        });
        this.mFrom = getIntent().getIntExtra("from", 0);
        this.mModel = getIntent().getStringExtra("model");
        String stringExtra = getIntent().getStringExtra("desc");
        ((TextView) findViewById(C3602R.C3604id.module_a_3_return_title)).setText(C3602R.string.scan_qrcode_add_device);
        if (this.mFrom == 200) {
            findViewById(C3602R.C3604id.goto_support_qrcode_page).setVisibility(8);
        }
        if (!TextUtils.isEmpty(stringExtra)) {
            ((TextView) findViewById(C3602R.C3604id.tips)).setText(stringExtra);
        }
        this.mScanLine = findViewById(C3602R.C3604id.scan_line);
        this.hasSurface = false;
        this.inactivityTimer = new InactivityTimer(this);
        this.beepManager = new BeepManager(this);
        this.ambientLightManager = new AmbientLightManager(this);
        initAnimation();
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        this.inactivityTimer.shutdown();
        super.onDestroy();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4) {
            if (!(i == 27 || i == 80)) {
                if (i == 24) {
                    this.cameraManager.setTorch(true);
                } else if (i != 25) {
                    return super.onKeyDown(i, keyEvent);
                } else {
                    this.cameraManager.setTorch(false);
                    return true;
                }
            }
            return true;
        }
        finishThis();
        return true;
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        CaptureActivityHandler captureActivityHandler = this.handler;
        if (captureActivityHandler != null) {
            captureActivityHandler.quitSynchronously();
            this.handler = null;
        }
        this.inactivityTimer.onPause();
        this.ambientLightManager.stop();
        this.beepManager.close();
        this.cameraManager.closeDriver();
        if (!this.hasSurface) {
            ((SurfaceView) findViewById(C3602R.C3604id.preview_view)).getHolder().removeCallback(this);
        }
        this.mScanAnim.cancel();
        this.hasSurface = false;
        this.isInit = false;
        super.onPause();
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        if (this.cameraManager == null) {
            this.cameraManager = new CameraManager(getApplication());
            ViewfinderView viewfinderView2 = (ViewfinderView) findViewById(C3602R.C3604id.viewfinder_view);
            this.viewfinderView = viewfinderView2;
            viewfinderView2.setCameraManager(this.cameraManager);
        }
        this.handler = null;
        this.lastResult = null;
        resetStatusView();
        this.beepManager.updatePrefs();
        this.ambientLightManager.start(this.cameraManager);
        this.inactivityTimer.onResume();
        SurfaceHolder holder = ((SurfaceView) findViewById(C3602R.C3604id.preview_view)).getHolder();
        if (this.hasSurface) {
            initCamera(holder);
        } else {
            holder.addCallback(this);
        }
        this.mScanLine.setVisibility(0);
        this.mScanAnim.start();
    }

    public void restartPreviewAfterDelay(long j) {
        CaptureActivityHandler captureActivityHandler = this.handler;
        if (captureActivityHandler != null) {
            captureActivityHandler.sendEmptyMessageDelayed(C3602R.C3604id.restart_preview, j);
        }
        resetStatusView();
    }

    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
    }

    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        if (!this.hasSurface) {
            this.hasSurface = true;
            initCamera(surfaceHolder);
        }
    }

    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        this.hasSurface = false;
    }
}
