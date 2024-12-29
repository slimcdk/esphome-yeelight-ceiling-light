package com.miot.service.qrcode;

import android.os.Handler;
import android.os.Looper;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.C2565i;
import com.google.zxing.DecodeHintType;
import java.util.Collection;
import java.util.EnumMap;
import java.util.Map;
import java.util.concurrent.CountDownLatch;

final class DecodeThread extends Thread {
    public static final String BARCODE_BITMAP = "barcode_bitmap";
    public static final String BARCODE_SCALED_FACTOR = "barcode_scaled_factor";
    private final ScanBarcodeActivity activity;
    private Handler handler;
    private final CountDownLatch handlerInitLatch = new CountDownLatch(1);
    private final Map<DecodeHintType, Object> hints;

    DecodeThread(ScanBarcodeActivity scanBarcodeActivity, Collection<BarcodeFormat> collection, Map<DecodeHintType, ?> map, String str, C2565i iVar) {
        this.activity = scanBarcodeActivity;
        EnumMap enumMap = new EnumMap(DecodeHintType.class);
        this.hints = enumMap;
        if (map != null) {
            enumMap.putAll(map);
        }
        enumMap.put(DecodeHintType.POSSIBLE_FORMATS, collection);
        if (str != null) {
            enumMap.put(DecodeHintType.CHARACTER_SET, str);
        }
        enumMap.put(DecodeHintType.NEED_RESULT_POINT_CALLBACK, iVar);
        StringBuilder sb = new StringBuilder();
        sb.append("Hints: ");
        sb.append(enumMap);
    }

    /* access modifiers changed from: package-private */
    public Handler getHandler() {
        try {
            this.handlerInitLatch.await();
        } catch (InterruptedException unused) {
        }
        return this.handler;
    }

    public void run() {
        Looper.prepare();
        this.handler = new DecodeHandler(this.activity, this.hints);
        this.handlerInitLatch.countDown();
        Looper.loop();
    }
}
