package com.yeelight.yeelib.pickcolor.p193g;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.hardware.Camera;
import android.os.Handler;
import p011c.p012a.p053e.C0824k;

/* renamed from: com.yeelight.yeelib.pickcolor.g.d */
public final class C9927d {

    /* renamed from: a */
    private final C9924b f18093a;

    /* renamed from: b */
    private Camera f18094b;

    /* renamed from: c */
    private C9921a f18095c;

    /* renamed from: d */
    private Rect f18096d;

    /* renamed from: e */
    private Rect f18097e;

    /* renamed from: f */
    private boolean f18098f;

    /* renamed from: g */
    private boolean f18099g;

    /* renamed from: h */
    private int f18100h = -1;

    /* renamed from: i */
    private int f18101i;

    /* renamed from: j */
    private int f18102j;

    /* renamed from: k */
    private final C9929f f18103k;

    public C9927d(Context context) {
        this.f18093a = new C9924b(context);
        this.f18103k = new C9929f(this.f18093a);
    }

    /* renamed from: c */
    private static int m24359c(int i, int i2, int i3) {
        int i4 = (i * 5) / 8;
        return i4 < i2 ? i2 : i4 > i3 ? i3 : i4;
    }

    /* renamed from: a */
    public C0824k mo32072a(byte[] bArr, int i, int i2) {
        Rect f = mo32076f();
        if (f == null) {
            return null;
        }
        byte[] bArr2 = new byte[bArr.length];
        for (int i3 = 0; i3 < i2; i3++) {
            for (int i4 = 0; i4 < i; i4++) {
                bArr2[(((i4 * i2) + i2) - i3) - 1] = bArr[(i3 * i) + i4];
            }
        }
        return new C0824k(bArr2, i2, i, f.left, f.top, f.width(), f.height(), false);
    }

    /* renamed from: b */
    public synchronized void mo32073b() {
        if (this.f18094b != null) {
            this.f18094b.release();
            this.f18094b = null;
            this.f18096d = null;
            this.f18097e = null;
        }
    }

    /* renamed from: d */
    public int mo32074d() {
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
    public synchronized Rect mo32075e() {
        if (this.f18096d == null) {
            if (this.f18094b == null) {
                return null;
            }
            Point c = this.f18093a.mo32065c();
            if (c == null) {
                return null;
            }
            int c2 = m24359c(c.x, 240, 1200);
            int c3 = m24359c(c.y, 240, 675);
            int i = (c.x - c2) / 2;
            int i2 = (c.y - c3) / 2;
            this.f18096d = new Rect(i, i2, c2 + i, c3 + i2);
            "Calculated framing rect: " + this.f18096d;
        }
        return this.f18096d;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0054, code lost:
        return null;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized android.graphics.Rect mo32076f() {
        /*
            r5 = this;
            monitor-enter(r5)
            android.graphics.Rect r0 = r5.f18097e     // Catch:{ all -> 0x0059 }
            if (r0 != 0) goto L_0x0055
            android.graphics.Rect r0 = r5.mo32075e()     // Catch:{ all -> 0x0059 }
            r1 = 0
            if (r0 != 0) goto L_0x000e
            monitor-exit(r5)
            return r1
        L_0x000e:
            android.graphics.Rect r2 = new android.graphics.Rect     // Catch:{ all -> 0x0059 }
            r2.<init>(r0)     // Catch:{ all -> 0x0059 }
            com.yeelight.yeelib.pickcolor.g.b r0 = r5.f18093a     // Catch:{ all -> 0x0059 }
            android.graphics.Point r0 = r0.mo32064b()     // Catch:{ all -> 0x0059 }
            com.yeelight.yeelib.pickcolor.g.b r3 = r5.f18093a     // Catch:{ all -> 0x0059 }
            android.graphics.Point r3 = r3.mo32065c()     // Catch:{ all -> 0x0059 }
            if (r0 == 0) goto L_0x0053
            if (r3 != 0) goto L_0x0024
            goto L_0x0053
        L_0x0024:
            int r1 = r2.left     // Catch:{ all -> 0x0059 }
            int r4 = r0.y     // Catch:{ all -> 0x0059 }
            int r1 = r1 * r4
            int r4 = r3.x     // Catch:{ all -> 0x0059 }
            int r1 = r1 / r4
            r2.left = r1     // Catch:{ all -> 0x0059 }
            int r1 = r2.right     // Catch:{ all -> 0x0059 }
            int r4 = r0.y     // Catch:{ all -> 0x0059 }
            int r1 = r1 * r4
            int r4 = r3.x     // Catch:{ all -> 0x0059 }
            int r1 = r1 / r4
            r2.right = r1     // Catch:{ all -> 0x0059 }
            int r1 = r2.top     // Catch:{ all -> 0x0059 }
            int r4 = r0.x     // Catch:{ all -> 0x0059 }
            int r1 = r1 * r4
            int r4 = r3.y     // Catch:{ all -> 0x0059 }
            int r1 = r1 / r4
            r2.top = r1     // Catch:{ all -> 0x0059 }
            int r1 = r2.bottom     // Catch:{ all -> 0x0059 }
            int r0 = r0.x     // Catch:{ all -> 0x0059 }
            int r1 = r1 * r0
            int r0 = r3.y     // Catch:{ all -> 0x0059 }
            int r1 = r1 / r0
            r2.bottom = r1     // Catch:{ all -> 0x0059 }
            r5.f18097e = r2     // Catch:{ all -> 0x0059 }
            goto L_0x0055
        L_0x0053:
            monitor-exit(r5)
            return r1
        L_0x0055:
            android.graphics.Rect r0 = r5.f18097e     // Catch:{ all -> 0x0059 }
            monitor-exit(r5)
            return r0
        L_0x0059:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.pickcolor.p193g.C9927d.mo32076f():android.graphics.Rect");
    }

    /* renamed from: g */
    public int mo32077g() {
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
    public synchronized boolean mo32078h() {
        return this.f18094b != null;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(13:1|2|(2:4|(1:6)(2:7|8))|9|(2:11|(1:15))|16|(1:18)(1:19)|20|21|22|23|(3:25|26|27)|28) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x0050 */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0062  */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void mo32079i(android.view.SurfaceHolder r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            android.hardware.Camera r0 = r4.f18094b     // Catch:{ all -> 0x0073 }
            if (r0 != 0) goto L_0x0016
            int r0 = r4.f18100h     // Catch:{ all -> 0x0073 }
            android.hardware.Camera r0 = com.yeelight.yeelib.pickcolor.p193g.C9928e.m24375a(r0)     // Catch:{ all -> 0x0073 }
            if (r0 == 0) goto L_0x0010
            r4.f18094b = r0     // Catch:{ all -> 0x0073 }
            goto L_0x0016
        L_0x0010:
            java.io.IOException r5 = new java.io.IOException     // Catch:{ all -> 0x0073 }
            r5.<init>()     // Catch:{ all -> 0x0073 }
            throw r5     // Catch:{ all -> 0x0073 }
        L_0x0016:
            r1 = 90
            r0.setDisplayOrientation(r1)     // Catch:{ all -> 0x0073 }
            r0.setPreviewDisplay(r5)     // Catch:{ all -> 0x0073 }
            boolean r5 = r4.f18098f     // Catch:{ all -> 0x0073 }
            r1 = 1
            r2 = 0
            if (r5 != 0) goto L_0x003e
            r4.f18098f = r1     // Catch:{ all -> 0x0073 }
            com.yeelight.yeelib.pickcolor.g.b r5 = r4.f18093a     // Catch:{ all -> 0x0073 }
            r5.mo32067e(r0)     // Catch:{ all -> 0x0073 }
            int r5 = r4.f18101i     // Catch:{ all -> 0x0073 }
            if (r5 <= 0) goto L_0x003e
            int r5 = r4.f18102j     // Catch:{ all -> 0x0073 }
            if (r5 <= 0) goto L_0x003e
            int r5 = r4.f18101i     // Catch:{ all -> 0x0073 }
            int r3 = r4.f18102j     // Catch:{ all -> 0x0073 }
            r4.mo32082l(r5, r3)     // Catch:{ all -> 0x0073 }
            r4.f18101i = r2     // Catch:{ all -> 0x0073 }
            r4.f18102j = r2     // Catch:{ all -> 0x0073 }
        L_0x003e:
            android.hardware.Camera$Parameters r5 = r0.getParameters()     // Catch:{ all -> 0x0073 }
            if (r5 != 0) goto L_0x0046
            r5 = 0
            goto L_0x004a
        L_0x0046:
            java.lang.String r5 = r5.flatten()     // Catch:{ all -> 0x0073 }
        L_0x004a:
            com.yeelight.yeelib.pickcolor.g.b r3 = r4.f18093a     // Catch:{ RuntimeException -> 0x0050 }
            r3.mo32068g(r0, r2)     // Catch:{ RuntimeException -> 0x0050 }
            goto L_0x0071
        L_0x0050:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0073 }
            r2.<init>()     // Catch:{ all -> 0x0073 }
            java.lang.String r3 = "Resetting to saved camera params: "
            r2.append(r3)     // Catch:{ all -> 0x0073 }
            r2.append(r5)     // Catch:{ all -> 0x0073 }
            r2.toString()     // Catch:{ all -> 0x0073 }
            if (r5 == 0) goto L_0x0071
            android.hardware.Camera$Parameters r2 = r0.getParameters()     // Catch:{ all -> 0x0073 }
            r2.unflatten(r5)     // Catch:{ all -> 0x0073 }
            r0.setParameters(r2)     // Catch:{ RuntimeException -> 0x0071 }
            com.yeelight.yeelib.pickcolor.g.b r5 = r4.f18093a     // Catch:{ RuntimeException -> 0x0071 }
            r5.mo32068g(r0, r1)     // Catch:{ RuntimeException -> 0x0071 }
        L_0x0071:
            monitor-exit(r4)
            return
        L_0x0073:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.pickcolor.p193g.C9927d.mo32079i(android.view.SurfaceHolder):void");
    }

    /* renamed from: j */
    public synchronized void mo32080j(Handler handler, int i) {
        Camera camera = this.f18094b;
        if (camera != null && this.f18099g) {
            this.f18103k.mo32087a(handler, i);
            camera.setOneShotPreviewCallback(this.f18103k);
        }
    }

    /* renamed from: k */
    public synchronized void mo32081k(int i) {
        this.f18100h = i;
    }

    /* renamed from: l */
    public synchronized void mo32082l(int i, int i2) {
        if (this.f18098f) {
            Point c = this.f18093a.mo32065c();
            if (i > c.x) {
                i = c.x;
            }
            if (i2 > c.y) {
                i2 = c.y;
            }
            int i3 = (c.x - i) / 2;
            int i4 = (c.y - i2) / 2;
            this.f18096d = new Rect(i3, i4, i + i3, i2 + i4);
            "Calculated manual framing rect: " + this.f18096d;
            this.f18097e = null;
        } else {
            this.f18101i = i;
            this.f18102j = i2;
        }
    }

    /* renamed from: m */
    public synchronized void mo32083m() {
        if (this.f18094b != null) {
            if (this.f18095c != null) {
                this.f18095c.mo32061d();
            }
            this.f18093a.mo32069h(this.f18094b, !this.f18093a.mo32066d(this.f18094b));
            if (this.f18095c != null) {
                this.f18095c.mo32060c();
            }
        }
    }

    /* renamed from: n */
    public synchronized void mo32084n(boolean z) {
        if (!(z == this.f18093a.mo32066d(this.f18094b) || this.f18094b == null)) {
            if (this.f18095c != null) {
                this.f18095c.mo32061d();
            }
            this.f18093a.mo32069h(this.f18094b, z);
            if (this.f18095c != null) {
                this.f18095c.mo32060c();
            }
        }
    }

    /* renamed from: o */
    public synchronized void mo32085o() {
        Camera camera = this.f18094b;
        if (camera != null && !this.f18099g) {
            camera.startPreview();
            this.f18099g = true;
            this.f18095c = new C9921a(this.f18094b);
        }
    }

    /* renamed from: p */
    public synchronized void mo32086p() {
        if (this.f18095c != null) {
            this.f18095c.mo32061d();
            this.f18095c = null;
        }
        if (this.f18094b != null && this.f18099g) {
            this.f18094b.stopPreview();
            this.f18103k.mo32087a((Handler) null, 0);
            this.f18099g = false;
        }
    }
}
