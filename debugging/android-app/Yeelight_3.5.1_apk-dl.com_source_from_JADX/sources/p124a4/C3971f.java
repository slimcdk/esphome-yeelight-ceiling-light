package p124a4;

import android.graphics.Point;
import android.hardware.Camera;
import android.os.Handler;

/* renamed from: a4.f */
final class C3971f implements Camera.PreviewCallback {

    /* renamed from: d */
    private static final String f6712d = C3971f.class.getSimpleName();

    /* renamed from: a */
    private final C3966b f6713a;

    /* renamed from: b */
    private Handler f6714b;

    /* renamed from: c */
    private int f6715c;

    C3971f(C3966b bVar) {
        this.f6713a = bVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo26520a(Handler handler, int i) {
        this.f6714b = handler;
        this.f6715c = i;
    }

    public void onPreviewFrame(byte[] bArr, Camera camera) {
        Point b = this.f6713a.mo26497b();
        Handler handler = this.f6714b;
        if (b != null && handler != null) {
            handler.obtainMessage(this.f6715c, b.x, b.y, bArr).sendToTarget();
            this.f6714b = null;
        }
    }
}
