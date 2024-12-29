package com.yeelight.yeelib.pickcolor.p193g;

import android.graphics.Point;
import android.hardware.Camera;
import android.os.Handler;

/* renamed from: com.yeelight.yeelib.pickcolor.g.f */
final class C9929f implements Camera.PreviewCallback {

    /* renamed from: d */
    private static final String f18104d = C9929f.class.getSimpleName();

    /* renamed from: a */
    private final C9924b f18105a;

    /* renamed from: b */
    private Handler f18106b;

    /* renamed from: c */
    private int f18107c;

    C9929f(C9924b bVar) {
        this.f18105a = bVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo32087a(Handler handler, int i) {
        this.f18106b = handler;
        this.f18107c = i;
    }

    public void onPreviewFrame(byte[] bArr, Camera camera) {
        Point b = this.f18105a.mo32064b();
        Handler handler = this.f18106b;
        if (b != null && handler != null) {
            handler.obtainMessage(this.f18107c, b.x, b.y, bArr).sendToTarget();
            this.f18106b = null;
        }
    }
}
