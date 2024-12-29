package com.miot.service.qrcode;

import android.os.Handler;
import android.os.Looper;
import java.util.Collection;
import java.util.EnumMap;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import p011c.p012a.p053e.C0814a;
import p011c.p012a.p053e.C0818e;
import p011c.p012a.p053e.C0830q;

final class DecodeThread extends Thread {
    public static final String BARCODE_BITMAP = "barcode_bitmap";
    public static final String BARCODE_SCALED_FACTOR = "barcode_scaled_factor";
    private final ScanBarcodeActivity activity;
    private Handler handler;
    private final CountDownLatch handlerInitLatch = new CountDownLatch(1);
    private final Map<C0818e, Object> hints;

    DecodeThread(ScanBarcodeActivity scanBarcodeActivity, Collection<C0814a> collection, Map<C0818e, ?> map, String str, C0830q qVar) {
        this.activity = scanBarcodeActivity;
        EnumMap enumMap = new EnumMap(C0818e.class);
        this.hints = enumMap;
        if (map != null) {
            enumMap.putAll(map);
        }
        this.hints.put(C0818e.POSSIBLE_FORMATS, collection);
        if (str != null) {
            this.hints.put(C0818e.CHARACTER_SET, str);
        }
        this.hints.put(C0818e.NEED_RESULT_POINT_CALLBACK, qVar);
        "Hints: " + this.hints;
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
