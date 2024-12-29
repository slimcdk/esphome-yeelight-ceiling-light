package p124a4;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.hardware.Camera;
import android.os.Handler;
import com.google.zxing.C2561e;

/* renamed from: a4.d */
public final class C3969d {

    /* renamed from: a */
    private final C3966b f6701a;

    /* renamed from: b */
    private Camera f6702b;

    /* renamed from: c */
    private C3963a f6703c;

    /* renamed from: d */
    private Rect f6704d;

    /* renamed from: e */
    private Rect f6705e;

    /* renamed from: f */
    private boolean f6706f;

    /* renamed from: g */
    private boolean f6707g;

    /* renamed from: h */
    private int f6708h = -1;

    /* renamed from: i */
    private int f6709i;

    /* renamed from: j */
    private int f6710j;

    /* renamed from: k */
    private final C3971f f6711k;

    public C3969d(Context context) {
        C3966b bVar = new C3966b(context);
        this.f6701a = bVar;
        this.f6711k = new C3971f(bVar);
    }

    /* renamed from: c */
    private static int m11448c(int i, int i2, int i3) {
        int i4 = (i * 5) / 8;
        return i4 < i2 ? i2 : i4 > i3 ? i3 : i4;
    }

    /* renamed from: a */
    public C2561e mo26505a(byte[] bArr, int i, int i2) {
        Rect f = mo26509f();
        if (f == null) {
            return null;
        }
        byte[] bArr2 = new byte[bArr.length];
        for (int i3 = 0; i3 < i2; i3++) {
            for (int i4 = 0; i4 < i; i4++) {
                bArr2[(((i4 * i2) + i2) - i3) - 1] = bArr[(i3 * i) + i4];
            }
        }
        return new C2561e(bArr2, i2, i, f.left, f.top, f.width(), f.height(), false);
    }

    /* renamed from: b */
    public synchronized void mo26506b() {
        Camera camera = this.f6702b;
        if (camera != null) {
            camera.release();
            this.f6702b = null;
            this.f6704d = null;
            this.f6705e = null;
        }
    }

    /* renamed from: d */
    public int mo26507d() {
        int numberOfCameras = Camera.getNumberOfCameras();
        if (numberOfCameras == 0) {
            return -1;
        }
        int i = 0;
        while (i < numberOfCameras) {
            Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
            Camera.getCameraInfo(i, cameraInfo);
            if (cameraInfo.facing == 0) {
                break;
            }
            i++;
        }
        return i;
    }

    /* renamed from: e */
    public synchronized Rect mo26508e() {
        if (this.f6704d == null) {
            if (this.f6702b == null) {
                return null;
            }
            Point c = this.f6701a.mo26498c();
            if (c == null) {
                return null;
            }
            int c2 = m11448c(c.x, 240, 1200);
            int c3 = m11448c(c.y, 240, 675);
            int i = (c.x - c2) / 2;
            int i2 = (c.y - c3) / 2;
            this.f6704d = new Rect(i, i2, c2 + i, c3 + i2);
            StringBuilder sb = new StringBuilder();
            sb.append("Calculated framing rect: ");
            sb.append(this.f6704d);
        }
        return this.f6704d;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004c, code lost:
        return null;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized android.graphics.Rect mo26509f() {
        /*
            r6 = this;
            monitor-enter(r6)
            android.graphics.Rect r0 = r6.f6705e     // Catch:{ all -> 0x0051 }
            if (r0 != 0) goto L_0x004d
            android.graphics.Rect r0 = r6.mo26508e()     // Catch:{ all -> 0x0051 }
            r1 = 0
            if (r0 != 0) goto L_0x000e
            monitor-exit(r6)
            return r1
        L_0x000e:
            android.graphics.Rect r2 = new android.graphics.Rect     // Catch:{ all -> 0x0051 }
            r2.<init>(r0)     // Catch:{ all -> 0x0051 }
            a4.b r0 = r6.f6701a     // Catch:{ all -> 0x0051 }
            android.graphics.Point r0 = r0.mo26497b()     // Catch:{ all -> 0x0051 }
            a4.b r3 = r6.f6701a     // Catch:{ all -> 0x0051 }
            android.graphics.Point r3 = r3.mo26498c()     // Catch:{ all -> 0x0051 }
            if (r0 == 0) goto L_0x004b
            if (r3 != 0) goto L_0x0024
            goto L_0x004b
        L_0x0024:
            int r1 = r2.left     // Catch:{ all -> 0x0051 }
            int r4 = r0.y     // Catch:{ all -> 0x0051 }
            int r1 = r1 * r4
            int r5 = r3.x     // Catch:{ all -> 0x0051 }
            int r1 = r1 / r5
            r2.left = r1     // Catch:{ all -> 0x0051 }
            int r1 = r2.right     // Catch:{ all -> 0x0051 }
            int r1 = r1 * r4
            int r1 = r1 / r5
            r2.right = r1     // Catch:{ all -> 0x0051 }
            int r1 = r2.top     // Catch:{ all -> 0x0051 }
            int r0 = r0.x     // Catch:{ all -> 0x0051 }
            int r1 = r1 * r0
            int r3 = r3.y     // Catch:{ all -> 0x0051 }
            int r1 = r1 / r3
            r2.top = r1     // Catch:{ all -> 0x0051 }
            int r1 = r2.bottom     // Catch:{ all -> 0x0051 }
            int r1 = r1 * r0
            int r1 = r1 / r3
            r2.bottom = r1     // Catch:{ all -> 0x0051 }
            r6.f6705e = r2     // Catch:{ all -> 0x0051 }
            goto L_0x004d
        L_0x004b:
            monitor-exit(r6)
            return r1
        L_0x004d:
            android.graphics.Rect r0 = r6.f6705e     // Catch:{ all -> 0x0051 }
            monitor-exit(r6)
            return r0
        L_0x0051:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p124a4.C3969d.mo26509f():android.graphics.Rect");
    }

    /* renamed from: g */
    public int mo26510g() {
        int numberOfCameras = Camera.getNumberOfCameras();
        if (numberOfCameras == 0) {
            return -1;
        }
        int i = 0;
        while (i < numberOfCameras) {
            Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
            Camera.getCameraInfo(i, cameraInfo);
            if (cameraInfo.facing == 1) {
                break;
            }
            i++;
        }
        return i;
    }

    /* renamed from: h */
    public synchronized boolean mo26511h() {
        return this.f6702b != null;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(13:1|2|(2:4|(1:6)(2:7|8))|9|(2:11|(1:15))|16|(1:18)(1:19)|20|21|22|23|(3:25|26|27)|28) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x004c */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x005b  */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void mo26512i(android.view.SurfaceHolder r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            android.hardware.Camera r0 = r4.f6702b     // Catch:{ all -> 0x006c }
            if (r0 != 0) goto L_0x0016
            int r0 = r4.f6708h     // Catch:{ all -> 0x006c }
            android.hardware.Camera r0 = p124a4.C3970e.m11464a(r0)     // Catch:{ all -> 0x006c }
            if (r0 == 0) goto L_0x0010
            r4.f6702b = r0     // Catch:{ all -> 0x006c }
            goto L_0x0016
        L_0x0010:
            java.io.IOException r5 = new java.io.IOException     // Catch:{ all -> 0x006c }
            r5.<init>()     // Catch:{ all -> 0x006c }
            throw r5     // Catch:{ all -> 0x006c }
        L_0x0016:
            r1 = 90
            r0.setDisplayOrientation(r1)     // Catch:{ all -> 0x006c }
            r0.setPreviewDisplay(r5)     // Catch:{ all -> 0x006c }
            boolean r5 = r4.f6706f     // Catch:{ all -> 0x006c }
            r1 = 1
            r2 = 0
            if (r5 != 0) goto L_0x003a
            r4.f6706f = r1     // Catch:{ all -> 0x006c }
            a4.b r5 = r4.f6701a     // Catch:{ all -> 0x006c }
            r5.mo26500e(r0)     // Catch:{ all -> 0x006c }
            int r5 = r4.f6709i     // Catch:{ all -> 0x006c }
            if (r5 <= 0) goto L_0x003a
            int r3 = r4.f6710j     // Catch:{ all -> 0x006c }
            if (r3 <= 0) goto L_0x003a
            r4.mo26515l(r5, r3)     // Catch:{ all -> 0x006c }
            r4.f6709i = r2     // Catch:{ all -> 0x006c }
            r4.f6710j = r2     // Catch:{ all -> 0x006c }
        L_0x003a:
            android.hardware.Camera$Parameters r5 = r0.getParameters()     // Catch:{ all -> 0x006c }
            if (r5 != 0) goto L_0x0042
            r5 = 0
            goto L_0x0046
        L_0x0042:
            java.lang.String r5 = r5.flatten()     // Catch:{ all -> 0x006c }
        L_0x0046:
            a4.b r3 = r4.f6701a     // Catch:{ RuntimeException -> 0x004c }
            r3.mo26501g(r0, r2)     // Catch:{ RuntimeException -> 0x004c }
            goto L_0x006a
        L_0x004c:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x006c }
            r2.<init>()     // Catch:{ all -> 0x006c }
            java.lang.String r3 = "Resetting to saved camera params: "
            r2.append(r3)     // Catch:{ all -> 0x006c }
            r2.append(r5)     // Catch:{ all -> 0x006c }
            if (r5 == 0) goto L_0x006a
            android.hardware.Camera$Parameters r2 = r0.getParameters()     // Catch:{ all -> 0x006c }
            r2.unflatten(r5)     // Catch:{ all -> 0x006c }
            r0.setParameters(r2)     // Catch:{ RuntimeException -> 0x006a }
            a4.b r5 = r4.f6701a     // Catch:{ RuntimeException -> 0x006a }
            r5.mo26501g(r0, r1)     // Catch:{ RuntimeException -> 0x006a }
        L_0x006a:
            monitor-exit(r4)
            return
        L_0x006c:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p124a4.C3969d.mo26512i(android.view.SurfaceHolder):void");
    }

    /* renamed from: j */
    public synchronized void mo26513j(Handler handler, int i) {
        Camera camera = this.f6702b;
        if (camera != null && this.f6707g) {
            this.f6711k.mo26520a(handler, i);
            camera.setOneShotPreviewCallback(this.f6711k);
        }
    }

    /* renamed from: k */
    public synchronized void mo26514k(int i) {
        this.f6708h = i;
    }

    /* renamed from: l */
    public synchronized void mo26515l(int i, int i2) {
        if (this.f6706f) {
            Point c = this.f6701a.mo26498c();
            int i3 = c.x;
            if (i > i3) {
                i = i3;
            }
            int i4 = c.y;
            if (i2 > i4) {
                i2 = i4;
            }
            int i5 = (i3 - i) / 2;
            int i6 = (i4 - i2) / 2;
            this.f6704d = new Rect(i5, i6, i + i5, i2 + i6);
            StringBuilder sb = new StringBuilder();
            sb.append("Calculated manual framing rect: ");
            sb.append(this.f6704d);
            this.f6705e = null;
        } else {
            this.f6709i = i;
            this.f6710j = i2;
        }
    }

    /* renamed from: m */
    public synchronized void mo26516m() {
        if (this.f6702b != null) {
            C3963a aVar = this.f6703c;
            if (aVar != null) {
                aVar.mo26494d();
            }
            C3966b bVar = this.f6701a;
            Camera camera = this.f6702b;
            bVar.mo26502h(camera, !bVar.mo26499d(camera));
            C3963a aVar2 = this.f6703c;
            if (aVar2 != null) {
                aVar2.mo26493c();
            }
        }
    }

    /* renamed from: n */
    public synchronized void mo26517n(boolean z) {
        if (!(z == this.f6701a.mo26499d(this.f6702b) || this.f6702b == null)) {
            C3963a aVar = this.f6703c;
            if (aVar != null) {
                aVar.mo26494d();
            }
            this.f6701a.mo26502h(this.f6702b, z);
            C3963a aVar2 = this.f6703c;
            if (aVar2 != null) {
                aVar2.mo26493c();
            }
        }
    }

    /* renamed from: o */
    public synchronized void mo26518o() {
        Camera camera = this.f6702b;
        if (camera != null && !this.f6707g) {
            camera.startPreview();
            this.f6707g = true;
            this.f6703c = new C3963a(this.f6702b);
        }
    }

    /* renamed from: p */
    public synchronized void mo26519p() {
        C3963a aVar = this.f6703c;
        if (aVar != null) {
            aVar.mo26494d();
            this.f6703c = null;
        }
        Camera camera = this.f6702b;
        if (camera != null && this.f6707g) {
            camera.stopPreview();
            this.f6711k.mo26520a((Handler) null, 0);
            this.f6707g = false;
        }
    }
}
