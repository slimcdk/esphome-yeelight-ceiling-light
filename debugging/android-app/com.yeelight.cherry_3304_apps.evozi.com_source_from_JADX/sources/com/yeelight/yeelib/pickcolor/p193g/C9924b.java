package com.yeelight.yeelib.pickcolor.p193g;

import android.content.Context;
import android.graphics.Point;
import android.hardware.Camera;
import android.view.Display;
import android.view.WindowManager;

/* renamed from: com.yeelight.yeelib.pickcolor.g.b */
final class C9924b {

    /* renamed from: a */
    private final Context f18090a;

    /* renamed from: b */
    private Point f18091b;

    /* renamed from: c */
    private Point f18092c;

    C9924b(Context context) {
        this.f18090a = context;
    }

    /* renamed from: a */
    private void m24346a(Camera.Parameters parameters, boolean z, boolean z2) {
        C9925c.m24357d(parameters, z);
    }

    /* renamed from: f */
    private void m24347f(Camera.Parameters parameters, boolean z) {
        m24346a(parameters, false, z);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public Point mo32064b() {
        return this.f18092c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public Point mo32065c() {
        return this.f18091b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean mo32066d(Camera camera) {
        Camera.Parameters parameters;
        String flashMode;
        if (camera == null || (parameters = camera.getParameters()) == null || (flashMode = parameters.getFlashMode()) == null) {
            return false;
        }
        return "on".equals(flashMode) || "torch".equals(flashMode);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo32067e(Camera camera) {
        Camera.Parameters parameters = camera.getParameters();
        Display defaultDisplay = ((WindowManager) this.f18090a.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getSize(point);
        this.f18091b = point;
        "Screen resolution: " + this.f18091b;
        Point point2 = new Point();
        Point point3 = this.f18091b;
        point2.x = point3.x;
        point2.y = point3.y;
        int i = point3.x;
        int i2 = point3.y;
        if (i < i2) {
            point2.x = i2;
            point2.y = point3.x;
        }
        this.f18092c = C9925c.m24354a(parameters, point2);
        "Camera resolution: " + this.f18092c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo32068g(Camera camera, boolean z) {
        Camera.Parameters parameters = camera.getParameters();
        if (parameters != null) {
            "Initial camera parameters: " + parameters.flatten();
            m24347f(parameters, z);
            C9925c.m24356c(parameters, true, true, z);
            Point point = this.f18092c;
            parameters.setPreviewSize(point.x, point.y);
            "Final camera parameters: " + parameters.flatten();
            camera.setParameters(parameters);
            Camera.Size previewSize = camera.getParameters().getPreviewSize();
            if (previewSize != null) {
                Point point2 = this.f18092c;
                if (point2.x != previewSize.width || point2.y != previewSize.height) {
                    "Camera said it supported preview size " + this.f18092c.x + 'x' + this.f18092c.y + ", but after setting it, preview size is " + previewSize.width + 'x' + previewSize.height;
                    Point point3 = this.f18092c;
                    point3.x = previewSize.width;
                    point3.y = previewSize.height;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo32069h(Camera camera, boolean z) {
        Camera.Parameters parameters = camera.getParameters();
        m24346a(parameters, z, false);
        camera.setParameters(parameters);
    }
}
