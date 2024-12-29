package com.miot.service.qrcode;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.miot.service.C3602R;
import java.io.ByteArrayOutputStream;
import java.util.Map;
import p011c.p012a.p053e.C0818e;
import p011c.p012a.p053e.C0822i;
import p011c.p012a.p053e.C0824k;

final class DecodeHandler extends Handler {
    private static final String TAG = DecodeHandler.class.getSimpleName();
    private final ScanBarcodeActivity activity;
    private final C0822i multiFormatReader;
    private boolean running = true;

    DecodeHandler(ScanBarcodeActivity scanBarcodeActivity, Map<C0818e, Object> map) {
        C0822i iVar = new C0822i();
        this.multiFormatReader = iVar;
        iVar.mo9005d(map);
        this.activity = scanBarcodeActivity;
    }

    private static void bundleThumbnail(C0824k kVar, Bundle bundle) {
        int[] i = kVar.mo9009i();
        int h = kVar.mo9008h();
        Bitmap createBitmap = Bitmap.createBitmap(i, 0, h, h, kVar.mo9007g(), Bitmap.Config.ARGB_8888);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        createBitmap.compress(Bitmap.CompressFormat.JPEG, 50, byteArrayOutputStream);
        bundle.putByteArray(DecodeThread.BARCODE_BITMAP, byteArrayOutputStream.toByteArray());
        bundle.putFloat(DecodeThread.BARCODE_SCALED_FACTOR, ((float) h) / ((float) kVar.mo8999d()));
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x005e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void decode(byte[] r6, int r7, int r8) {
        /*
            r5 = this;
            long r0 = java.lang.System.currentTimeMillis()
            com.miot.service.qrcode.ScanBarcodeActivity r2 = r5.activity
            com.miot.service.qrcode.camera.CameraManager r2 = r2.getCameraManager()
            c.a.e.k r6 = r2.buildLuminanceSource(r6, r7, r8)
            if (r6 == 0) goto L_0x0032
            c.a.e.c r7 = new c.a.e.c
            c.a.e.t.j r8 = new c.a.e.t.j
            r8.<init>(r6)
            r7.<init>(r8)
            c.a.e.i r6 = r5.multiFormatReader     // Catch:{ m -> 0x002d, all -> 0x0026 }
            c.a.e.n r6 = r6.mo9004c(r7)     // Catch:{ m -> 0x002d, all -> 0x0026 }
            c.a.e.i r7 = r5.multiFormatReader
            r7.reset()
            goto L_0x0033
        L_0x0026:
            r6 = move-exception
            c.a.e.i r7 = r5.multiFormatReader
            r7.reset()
            throw r6
        L_0x002d:
            c.a.e.i r6 = r5.multiFormatReader
            r6.reset()
        L_0x0032:
            r6 = 0
        L_0x0033:
            com.miot.service.qrcode.ScanBarcodeActivity r7 = r5.activity
            android.os.Handler r7 = r7.getHandler()
            if (r6 == 0) goto L_0x005e
            long r2 = java.lang.System.currentTimeMillis()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r4 = "Found barcode in "
            r8.append(r4)
            long r2 = r2 - r0
            r8.append(r2)
            java.lang.String r0 = " ms"
            r8.append(r0)
            r8.toString()
            if (r7 == 0) goto L_0x0069
            int r8 = com.miot.service.C3602R.C3604id.decode_succeeded
            android.os.Message r6 = android.os.Message.obtain(r7, r8, r6)
            goto L_0x0066
        L_0x005e:
            if (r7 == 0) goto L_0x0069
            int r6 = com.miot.service.C3602R.C3604id.decode_failed
            android.os.Message r6 = android.os.Message.obtain(r7, r6)
        L_0x0066:
            r6.sendToTarget()
        L_0x0069:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.miot.service.qrcode.DecodeHandler.decode(byte[], int, int):void");
    }

    public void handleMessage(Message message) {
        if (this.running) {
            int i = message.what;
            if (i == C3602R.C3604id.decode) {
                decode((byte[]) message.obj, message.arg1, message.arg2);
            } else if (i == C3602R.C3604id.quit) {
                this.running = false;
                Looper.myLooper().quit();
            }
        }
    }
}
