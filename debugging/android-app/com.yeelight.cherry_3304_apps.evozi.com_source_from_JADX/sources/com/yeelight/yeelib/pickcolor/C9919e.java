package com.yeelight.yeelib.pickcolor;

import android.os.Handler;
import android.os.Looper;
import java.util.Collection;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import p011c.p012a.p053e.C0814a;
import p011c.p012a.p053e.C0818e;
import p011c.p012a.p053e.C0830q;

/* renamed from: com.yeelight.yeelib.pickcolor.e */
final class C9919e extends Thread {

    /* renamed from: a */
    private final CaptureActivity f18078a;

    /* renamed from: b */
    private final Map<C0818e, Object> f18079b;

    /* renamed from: c */
    private Handler f18080c;

    /* renamed from: d */
    private final CountDownLatch f18081d = new CountDownLatch(1);

    C9919e(CaptureActivity captureActivity, Collection<C0814a> collection, Map<C0818e, ?> map, String str, C0830q qVar) {
        this.f18078a = captureActivity;
        EnumMap enumMap = new EnumMap(C0818e.class);
        this.f18079b = enumMap;
        if (map != null) {
            enumMap.putAll(map);
        }
        if (collection == null || collection.isEmpty()) {
            collection = EnumSet.noneOf(C0814a.class);
            collection.addAll(C9917c.f18067a);
            collection.addAll(C9917c.f18068b);
            collection.addAll(C9917c.f18070d);
            collection.addAll(C9917c.f18071e);
            collection.addAll(C9917c.f18072f);
            collection.addAll(C9917c.f18073g);
        }
        this.f18079b.put(C0818e.POSSIBLE_FORMATS, collection);
        if (str != null) {
            this.f18079b.put(C0818e.CHARACTER_SET, str);
        }
        this.f18079b.put(C0818e.NEED_RESULT_POINT_CALLBACK, qVar);
        "Hints: " + this.f18079b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public Handler mo32058b() {
        try {
            this.f18081d.await();
        } catch (InterruptedException unused) {
        }
        return this.f18080c;
    }

    public void run() {
        Looper.prepare();
        this.f18080c = new C9918d(this.f18078a, this.f18079b);
        this.f18081d.countDown();
        Looper.loop();
    }
}
