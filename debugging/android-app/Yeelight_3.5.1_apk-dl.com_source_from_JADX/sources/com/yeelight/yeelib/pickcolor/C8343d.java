package com.yeelight.yeelib.pickcolor;

import android.os.Handler;
import android.os.Looper;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.C2565i;
import com.google.zxing.DecodeHintType;
import java.util.Collection;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Map;
import java.util.concurrent.CountDownLatch;

/* renamed from: com.yeelight.yeelib.pickcolor.d */
final class C8343d extends Thread {

    /* renamed from: a */
    private final CaptureActivity f14407a;

    /* renamed from: b */
    private final Map<DecodeHintType, Object> f14408b;

    /* renamed from: c */
    private Handler f14409c;

    /* renamed from: d */
    private final CountDownLatch f14410d = new CountDownLatch(1);

    C8343d(CaptureActivity captureActivity, Collection<BarcodeFormat> collection, Map<DecodeHintType, ?> map, String str, C2565i iVar) {
        this.f14407a = captureActivity;
        EnumMap enumMap = new EnumMap(DecodeHintType.class);
        this.f14408b = enumMap;
        if (map != null) {
            enumMap.putAll(map);
        }
        if (collection == null || collection.isEmpty()) {
            collection = EnumSet.noneOf(BarcodeFormat.class);
            collection.addAll(C8341b.f14396a);
            collection.addAll(C8341b.f14397b);
            collection.addAll(C8341b.f14399d);
            collection.addAll(C8341b.f14400e);
            collection.addAll(C8341b.f14401f);
            collection.addAll(C8341b.f14402g);
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
    /* renamed from: b */
    public Handler mo35528b() {
        try {
            this.f14410d.await();
        } catch (InterruptedException unused) {
        }
        return this.f14409c;
    }

    public void run() {
        Looper.prepare();
        this.f14409c = new C8342c(this.f14407a, this.f14408b);
        this.f14410d.countDown();
        Looper.loop();
    }
}
