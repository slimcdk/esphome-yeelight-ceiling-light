package p124a4;

import android.content.Context;
import android.graphics.Point;
import android.hardware.Camera;
import android.view.Display;
import android.view.WindowManager;

/* renamed from: a4.b */
final class C3966b {

    /* renamed from: a */
    private final Context f6698a;

    /* renamed from: b */
    private Point f6699b;

    /* renamed from: c */
    private Point f6700c;

    C3966b(Context context) {
        this.f6698a = context;
    }

    /* renamed from: a */
    private void m11435a(Camera.Parameters parameters, boolean z, boolean z2) {
        C3967c.m11446d(parameters, z);
    }

    /* renamed from: f */
    private void m11436f(Camera.Parameters parameters, boolean z) {
        m11435a(parameters, false, z);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public Point mo26497b() {
        return this.f6700c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public Point mo26498c() {
        return this.f6699b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean mo26499d(Camera camera) {
        Camera.Parameters parameters;
        String flashMode;
        if (camera == null || (parameters = camera.getParameters()) == null || (flashMode = parameters.getFlashMode()) == null) {
            return false;
        }
        return "on".equals(flashMode) || "torch".equals(flashMode);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo26500e(Camera camera) {
        Camera.Parameters parameters = camera.getParameters();
        Display defaultDisplay = ((WindowManager) this.f6698a.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getSize(point);
        this.f6699b = point;
        StringBuilder sb = new StringBuilder();
        sb.append("Screen resolution: ");
        sb.append(this.f6699b);
        Point point2 = new Point();
        Point point3 = this.f6699b;
        point2.x = point3.x;
        point2.y = point3.y;
        int i = point3.x;
        int i2 = point3.y;
        if (i < i2) {
            point2.x = i2;
            point2.y = point3.x;
        }
        this.f6700c = C3967c.m11443a(parameters, point2);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Camera resolution: ");
        sb2.append(this.f6700c);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo26501g(Camera camera, boolean z) {
        Camera.Parameters parameters = camera.getParameters();
        if (parameters != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("Initial camera parameters: ");
            sb.append(parameters.flatten());
            m11436f(parameters, z);
            C3967c.m11445c(parameters, true, true, z);
            Point point = this.f6700c;
            parameters.setPreviewSize(point.x, point.y);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Final camera parameters: ");
            sb2.append(parameters.flatten());
            camera.setParameters(parameters);
            Camera.Size previewSize = camera.getParameters().getPreviewSize();
            if (previewSize != null) {
                Point point2 = this.f6700c;
                if (point2.x != previewSize.width || point2.y != previewSize.height) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("Camera said it supported preview size ");
                    sb3.append(this.f6700c.x);
                    sb3.append('x');
                    sb3.append(this.f6700c.y);
                    sb3.append(", but after setting it, preview size is ");
                    sb3.append(previewSize.width);
                    sb3.append('x');
                    sb3.append(previewSize.height);
                    Point point3 = this.f6700c;
                    point3.x = previewSize.width;
                    point3.y = previewSize.height;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo26502h(Camera camera, boolean z) {
        Camera.Parameters parameters = camera.getParameters();
        m11435a(parameters, z, false);
        camera.setParameters(parameters);
    }
}
