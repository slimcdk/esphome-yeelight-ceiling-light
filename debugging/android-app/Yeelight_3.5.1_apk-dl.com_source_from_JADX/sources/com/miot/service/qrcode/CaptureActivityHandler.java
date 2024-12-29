package com.miot.service.qrcode;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.os.Message;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.C2563g;
import com.google.zxing.DecodeHintType;
import com.miot.service.C2875R;
import com.miot.service.qrcode.camera.CameraManager;
import java.util.Collection;
import java.util.Map;

public final class CaptureActivityHandler extends Handler {
    private static final String TAG = CaptureActivityHandler.class.getSimpleName();
    private final ScanBarcodeActivity activity;
    private final CameraManager cameraManager;
    private final DecodeThread decodeThread;
    private State state = State.SUCCESS;

    private enum State {
        PREVIEW,
        SUCCESS,
        DONE
    }

    CaptureActivityHandler(ScanBarcodeActivity scanBarcodeActivity, Collection<BarcodeFormat> collection, Map<DecodeHintType, ?> map, String str, CameraManager cameraManager2) {
        this.activity = scanBarcodeActivity;
        DecodeThread decodeThread2 = new DecodeThread(scanBarcodeActivity, collection, map, str, new ViewfinderResultPointCallback(scanBarcodeActivity.getViewfinderView()));
        this.decodeThread = decodeThread2;
        decodeThread2.start();
        this.cameraManager = cameraManager2;
        cameraManager2.startPreview();
        restartPreviewAndDecode();
    }

    private void restartPreviewAndDecode() {
        if (this.state == State.SUCCESS) {
            this.state = State.PREVIEW;
            this.cameraManager.requestPreviewFrame(this.decodeThread.getHandler(), C2875R.C2877id.decode);
            this.activity.drawViewfinder();
        }
    }

    public void handleMessage(Message message) {
        ActivityInfo activityInfo;
        int i = message.what;
        if (i == C2875R.C2877id.restart_preview) {
            restartPreviewAndDecode();
            return;
        }
        String str = null;
        if (i == C2875R.C2877id.decode_succeeded) {
            this.state = State.SUCCESS;
            this.activity.handleDecode((C2563g) message.obj, (Bitmap) null, 1.0f);
        } else if (i == C2875R.C2877id.decode_failed) {
            this.state = State.PREVIEW;
            this.cameraManager.requestPreviewFrame(this.decodeThread.getHandler(), C2875R.C2877id.decode);
        } else if (i == C2875R.C2877id.return_scan_result) {
            this.activity.setResult(-1, (Intent) message.obj);
            this.activity.finish();
        } else if (i == C2875R.C2877id.launch_product_query) {
            String str2 = (String) message.obj;
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.addFlags(524288);
            intent.setData(Uri.parse(str2));
            ResolveInfo resolveActivity = this.activity.getPackageManager().resolveActivity(intent, 65536);
            if (!(resolveActivity == null || (activityInfo = resolveActivity.activityInfo) == null)) {
                str = activityInfo.packageName;
                StringBuilder sb = new StringBuilder();
                sb.append("Using browser in package ");
                sb.append(str);
            }
            if ("com.android.browser".equals(str) || "com.android.chrome".equals(str)) {
                intent.setPackage(str);
                intent.addFlags(268435456);
                intent.putExtra("com.android.browser.application_id", str);
            }
            try {
                this.activity.startActivity(intent);
            } catch (ActivityNotFoundException unused) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Can't find anything to handle VIEW of URI ");
                sb2.append(str2);
            }
        }
    }

    public void quitSynchronously() {
        this.state = State.DONE;
        this.cameraManager.stopPreview();
        Message.obtain(this.decodeThread.getHandler(), C2875R.C2877id.quit).sendToTarget();
        try {
            this.decodeThread.join(500);
        } catch (InterruptedException unused) {
        }
        removeMessages(C2875R.C2877id.decode_succeeded);
        removeMessages(C2875R.C2877id.decode_failed);
    }
}
