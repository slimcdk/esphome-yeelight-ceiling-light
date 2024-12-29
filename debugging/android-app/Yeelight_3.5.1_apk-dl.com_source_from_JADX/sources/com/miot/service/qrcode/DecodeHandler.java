package com.miot.service.qrcode;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.zxing.C2550d;
import com.google.zxing.C2561e;
import com.google.zxing.DecodeHintType;
import com.miot.service.C2875R;
import java.io.ByteArrayOutputStream;
import java.util.Map;

final class DecodeHandler extends Handler {
    private static final String TAG = DecodeHandler.class.getSimpleName();
    private final ScanBarcodeActivity activity;
    private final C2550d multiFormatReader;
    private boolean running = true;

    DecodeHandler(ScanBarcodeActivity scanBarcodeActivity, Map<DecodeHintType, Object> map) {
        C2550d dVar = new C2550d();
        this.multiFormatReader = dVar;
        dVar.mo19509d(map);
        this.activity = scanBarcodeActivity;
    }

    private static void bundleThumbnail(C2561e eVar, Bundle bundle) {
        int[] i = eVar.mo19536i();
        int h = eVar.mo19535h();
        Bitmap createBitmap = Bitmap.createBitmap(i, 0, h, h, eVar.mo19534g(), Bitmap.Config.ARGB_8888);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        createBitmap.compress(Bitmap.CompressFormat.JPEG, 50, byteArrayOutputStream);
        bundle.putByteArray(DecodeThread.BARCODE_BITMAP, byteArrayOutputStream.toByteArray());
        bundle.putFloat(DecodeThread.BARCODE_SCALED_FACTOR, ((float) h) / ((float) eVar.mo19464d()));
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x005b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void decode(byte[] r6, int r7, int r8) {
        /*
            r5 = this;
            long r0 = java.lang.System.currentTimeMillis()
            com.miot.service.qrcode.ScanBarcodeActivity r2 = r5.activity
            com.miot.service.qrcode.camera.CameraManager r2 = r2.getCameraManager()
            com.google.zxing.e r6 = r2.buildLuminanceSource(r6, r7, r8)
            if (r6 == 0) goto L_0x0032
            com.google.zxing.b r7 = new com.google.zxing.b
            d2.g r8 = new d2.g
            r8.<init>(r6)
            r7.<init>(r8)
            com.google.zxing.d r6 = r5.multiFormatReader     // Catch:{ ReaderException -> 0x002d, all -> 0x0026 }
            com.google.zxing.g r6 = r6.mo19508c(r7)     // Catch:{ ReaderException -> 0x002d, all -> 0x0026 }
            com.google.zxing.d r7 = r5.multiFormatReader
            r7.reset()
            goto L_0x0033
        L_0x0026:
            r6 = move-exception
            com.google.zxing.d r7 = r5.multiFormatReader
            r7.reset()
            throw r6
        L_0x002d:
            com.google.zxing.d r6 = r5.multiFormatReader
            r6.reset()
        L_0x0032:
            r6 = 0
        L_0x0033:
            com.miot.service.qrcode.ScanBarcodeActivity r7 = r5.activity
            android.os.Handler r7 = r7.getHandler()
            if (r6 == 0) goto L_0x005b
            long r2 = java.lang.System.currentTimeMillis()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r4 = "Found barcode in "
            r8.append(r4)
            long r2 = r2 - r0
            r8.append(r2)
            java.lang.String r0 = " ms"
            r8.append(r0)
            if (r7 == 0) goto L_0x0066
            int r8 = com.miot.service.C2875R.C2877id.decode_succeeded
            android.os.Message r6 = android.os.Message.obtain(r7, r8, r6)
            goto L_0x0063
        L_0x005b:
            if (r7 == 0) goto L_0x0066
            int r6 = com.miot.service.C2875R.C2877id.decode_failed
            android.os.Message r6 = android.os.Message.obtain(r7, r6)
        L_0x0063:
            r6.sendToTarget()
        L_0x0066:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.miot.service.qrcode.DecodeHandler.decode(byte[], int, int):void");
    }

    public void handleMessage(Message message) {
        if (this.running) {
            int i = message.what;
            if (i == C2875R.C2877id.decode) {
                decode((byte[]) message.obj, message.arg1, message.arg2);
            } else if (i == C2875R.C2877id.quit) {
                this.running = false;
                Looper.myLooper().quit();
            }
        }
    }
}
