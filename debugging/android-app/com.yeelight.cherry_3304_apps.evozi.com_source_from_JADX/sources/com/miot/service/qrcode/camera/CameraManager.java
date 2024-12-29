package com.miot.service.qrcode.camera;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Handler;
import com.miot.common.utils.DisplayUtils;
import com.miot.service.qrcode.camera.open.OpenCamera;
import p011c.p012a.p053e.C0824k;

public final class CameraManager {
    private static final int MAX_FRAME_HEIGHT = 675;
    private static final int MAX_FRAME_WIDTH = 1200;
    private static final int MIN_FRAME_HEIGHT = 240;
    private static final int MIN_FRAME_WIDTH = 240;
    private static final String TAG = "CameraManager";
    private AutoFocusManager autoFocusManager;
    private OpenCamera camera;
    private final CameraConfigurationManager configManager;
    private final Context context;
    private Rect framingRect;
    private Rect framingRectInPreview;
    private boolean initialized;
    private final PreviewCallback previewCallback;
    private boolean previewing;
    private int requestedCameraId = -1;
    private int requestedFramingRectHeight;
    private int requestedFramingRectWidth;

    public CameraManager(Context context2) {
        this.context = context2;
        this.configManager = new CameraConfigurationManager(context2);
        this.previewCallback = new PreviewCallback(this.configManager);
    }

    private static int findDesiredDimensionInRange(int i, int i2, int i3) {
        int i4 = (i * 5) / 8;
        return i4 < i2 ? i2 : i4 > i3 ? i3 : i4;
    }

    public C0824k buildLuminanceSource(byte[] bArr, int i, int i2) {
        Rect framingRectInPreview2 = getFramingRectInPreview();
        if (framingRectInPreview2 == null) {
            return null;
        }
        return new C0824k(bArr, i, i2, framingRectInPreview2.left, framingRectInPreview2.top, framingRectInPreview2.width(), framingRectInPreview2.height(), false);
    }

    public synchronized void closeDriver() {
        if (this.camera != null) {
            this.camera.getCamera().release();
            this.camera = null;
            this.framingRect = null;
            this.framingRectInPreview = null;
        }
    }

    public synchronized Rect getFramingRect() {
        if (this.framingRect == null) {
            if (this.camera == null) {
                return null;
            }
            Point screenResolution = this.configManager.getScreenResolution();
            if (screenResolution == null) {
                return null;
            }
            int dip2px = DisplayUtils.dip2px(this.context, 194.0f);
            int dip2px2 = DisplayUtils.dip2px(this.context, 194.0f);
            int i = (screenResolution.x - dip2px) / 2;
            int dip2px3 = DisplayUtils.dip2px(this.context, 164.0f);
            this.framingRect = new Rect(i, dip2px3, dip2px + i, dip2px2 + dip2px3);
            "Calculated framing rect: " + this.framingRect;
        }
        return this.framingRect;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0059, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized android.graphics.Rect getFramingRectInPreview() {
        /*
            r6 = this;
            monitor-enter(r6)
            android.graphics.Rect r0 = r6.framingRectInPreview     // Catch:{ all -> 0x005e }
            if (r0 != 0) goto L_0x005a
            android.graphics.Rect r0 = r6.getFramingRect()     // Catch:{ all -> 0x005e }
            r1 = 0
            if (r0 != 0) goto L_0x000e
            monitor-exit(r6)
            return r1
        L_0x000e:
            android.graphics.Rect r2 = new android.graphics.Rect     // Catch:{ all -> 0x005e }
            r2.<init>(r0)     // Catch:{ all -> 0x005e }
            com.miot.service.qrcode.camera.CameraConfigurationManager r0 = r6.configManager     // Catch:{ all -> 0x005e }
            android.graphics.Point r0 = r0.getCameraResolution()     // Catch:{ all -> 0x005e }
            com.miot.service.qrcode.camera.CameraConfigurationManager r3 = r6.configManager     // Catch:{ all -> 0x005e }
            android.graphics.Point r3 = r3.getScreenResolution()     // Catch:{ all -> 0x005e }
            if (r0 == 0) goto L_0x0058
            if (r3 != 0) goto L_0x0024
            goto L_0x0058
        L_0x0024:
            android.graphics.Rect r1 = new android.graphics.Rect     // Catch:{ all -> 0x005e }
            r1.<init>()     // Catch:{ all -> 0x005e }
            r6.framingRectInPreview = r1     // Catch:{ all -> 0x005e }
            int r4 = r2.top     // Catch:{ all -> 0x005e }
            int r5 = r0.x     // Catch:{ all -> 0x005e }
            int r4 = r4 * r5
            int r5 = r3.y     // Catch:{ all -> 0x005e }
            int r4 = r4 / r5
            r1.left = r4     // Catch:{ all -> 0x005e }
            int r4 = r2.bottom     // Catch:{ all -> 0x005e }
            int r5 = r0.x     // Catch:{ all -> 0x005e }
            int r4 = r4 * r5
            int r5 = r3.y     // Catch:{ all -> 0x005e }
            int r4 = r4 / r5
            r1.right = r4     // Catch:{ all -> 0x005e }
            int r4 = r2.left     // Catch:{ all -> 0x005e }
            int r5 = r0.y     // Catch:{ all -> 0x005e }
            int r4 = r4 * r5
            int r5 = r3.x     // Catch:{ all -> 0x005e }
            int r4 = r4 / r5
            r1.top = r4     // Catch:{ all -> 0x005e }
            int r2 = r2.right     // Catch:{ all -> 0x005e }
            int r0 = r0.y     // Catch:{ all -> 0x005e }
            int r2 = r2 * r0
            int r0 = r3.x     // Catch:{ all -> 0x005e }
            int r2 = r2 / r0
            r1.bottom = r2     // Catch:{ all -> 0x005e }
            goto L_0x005a
        L_0x0058:
            monitor-exit(r6)
            return r1
        L_0x005a:
            android.graphics.Rect r0 = r6.framingRectInPreview     // Catch:{ all -> 0x005e }
            monitor-exit(r6)
            return r0
        L_0x005e:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.miot.service.qrcode.camera.CameraManager.getFramingRectInPreview():android.graphics.Rect");
    }

    public synchronized boolean isOpen() {
        return this.camera != null;
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x0051 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:28:0x0072 */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0063  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void openDriver(android.view.SurfaceHolder r5, int r6, int r7) {
        /*
            r4 = this;
            monitor-enter(r4)
            com.miot.service.qrcode.camera.open.OpenCamera r0 = r4.camera     // Catch:{ all -> 0x0077 }
            if (r0 != 0) goto L_0x001b
            int r0 = r4.requestedCameraId     // Catch:{ all -> 0x0077 }
            com.miot.service.qrcode.camera.open.OpenCamera r0 = com.miot.service.qrcode.camera.open.OpenCameraInterface.open(r0)     // Catch:{ all -> 0x0077 }
            if (r0 == 0) goto L_0x0013
            r4.camera = r0     // Catch:{ all -> 0x0077 }
            r0.setPreviewSize(r6, r7)     // Catch:{ all -> 0x0077 }
            goto L_0x001b
        L_0x0013:
            java.io.IOException r5 = new java.io.IOException     // Catch:{ all -> 0x0077 }
            java.lang.String r6 = "Camera.open() failed to return object from driver"
            r5.<init>(r6)     // Catch:{ all -> 0x0077 }
            throw r5     // Catch:{ all -> 0x0077 }
        L_0x001b:
            boolean r6 = r4.initialized     // Catch:{ all -> 0x0077 }
            r7 = 1
            r1 = 0
            if (r6 != 0) goto L_0x003b
            r4.initialized = r7     // Catch:{ all -> 0x0077 }
            com.miot.service.qrcode.camera.CameraConfigurationManager r6 = r4.configManager     // Catch:{ all -> 0x0077 }
            r6.initFromCameraParameters(r0)     // Catch:{ all -> 0x0077 }
            int r6 = r4.requestedFramingRectWidth     // Catch:{ all -> 0x0077 }
            if (r6 <= 0) goto L_0x003b
            int r6 = r4.requestedFramingRectHeight     // Catch:{ all -> 0x0077 }
            if (r6 <= 0) goto L_0x003b
            int r6 = r4.requestedFramingRectWidth     // Catch:{ all -> 0x0077 }
            int r2 = r4.requestedFramingRectHeight     // Catch:{ all -> 0x0077 }
            r4.setManualFramingRect(r6, r2)     // Catch:{ all -> 0x0077 }
            r4.requestedFramingRectWidth = r1     // Catch:{ all -> 0x0077 }
            r4.requestedFramingRectHeight = r1     // Catch:{ all -> 0x0077 }
        L_0x003b:
            android.hardware.Camera r6 = r0.getCamera()     // Catch:{ all -> 0x0077 }
            android.hardware.Camera$Parameters r2 = r6.getParameters()     // Catch:{ all -> 0x0077 }
            if (r2 != 0) goto L_0x0047
            r2 = 0
            goto L_0x004b
        L_0x0047:
            java.lang.String r2 = r2.flatten()     // Catch:{ all -> 0x0077 }
        L_0x004b:
            com.miot.service.qrcode.camera.CameraConfigurationManager r3 = r4.configManager     // Catch:{ RuntimeException -> 0x0051 }
            r3.setDesiredCameraParameters(r0, r1)     // Catch:{ RuntimeException -> 0x0051 }
            goto L_0x0072
        L_0x0051:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0077 }
            r1.<init>()     // Catch:{ all -> 0x0077 }
            java.lang.String r3 = "Resetting to saved camera params: "
            r1.append(r3)     // Catch:{ all -> 0x0077 }
            r1.append(r2)     // Catch:{ all -> 0x0077 }
            r1.toString()     // Catch:{ all -> 0x0077 }
            if (r2 == 0) goto L_0x0072
            android.hardware.Camera$Parameters r1 = r6.getParameters()     // Catch:{ all -> 0x0077 }
            r1.unflatten(r2)     // Catch:{ all -> 0x0077 }
            r6.setParameters(r1)     // Catch:{ RuntimeException -> 0x0072 }
            com.miot.service.qrcode.camera.CameraConfigurationManager r1 = r4.configManager     // Catch:{ RuntimeException -> 0x0072 }
            r1.setDesiredCameraParameters(r0, r7)     // Catch:{ RuntimeException -> 0x0072 }
        L_0x0072:
            r6.setPreviewDisplay(r5)     // Catch:{ all -> 0x0077 }
            monitor-exit(r4)
            return
        L_0x0077:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.miot.service.qrcode.camera.CameraManager.openDriver(android.view.SurfaceHolder, int, int):void");
    }

    public synchronized void requestPreviewFrame(Handler handler, int i) {
        OpenCamera openCamera = this.camera;
        if (openCamera != null && this.previewing) {
            this.previewCallback.setHandler(handler, i);
            openCamera.getCamera().setOneShotPreviewCallback(this.previewCallback);
        }
    }

    public synchronized void setManualCameraId(int i) {
        this.requestedCameraId = i;
    }

    public synchronized void setManualFramingRect(int i, int i2) {
        if (this.initialized) {
            Point screenResolution = this.configManager.getScreenResolution();
            if (i > screenResolution.x) {
                i = screenResolution.x;
            }
            if (i2 > screenResolution.y) {
                i2 = screenResolution.y;
            }
            int i3 = (screenResolution.x - i) / 2;
            int i4 = (screenResolution.y - i2) / 2;
            this.framingRect = new Rect(i3, i4, i + i3, i2 + i4);
            "Calculated manual framing rect: " + this.framingRect;
            this.framingRectInPreview = null;
        } else {
            this.requestedFramingRectWidth = i;
            this.requestedFramingRectHeight = i2;
        }
    }

    public synchronized void setTorch(boolean z) {
        OpenCamera openCamera = this.camera;
        if (!(openCamera == null || z == this.configManager.getTorchState(openCamera.getCamera()))) {
            boolean z2 = this.autoFocusManager != null;
            if (z2) {
                this.autoFocusManager.stop();
                this.autoFocusManager = null;
            }
            this.configManager.setTorch(openCamera.getCamera(), z);
            if (z2) {
                AutoFocusManager autoFocusManager2 = new AutoFocusManager(this.context, openCamera.getCamera());
                this.autoFocusManager = autoFocusManager2;
                autoFocusManager2.start();
            }
        }
    }

    public synchronized void startPreview() {
        OpenCamera openCamera = this.camera;
        if (openCamera != null && !this.previewing) {
            openCamera.getCamera().startPreview();
            this.previewing = true;
            this.autoFocusManager = new AutoFocusManager(this.context, openCamera.getCamera());
        }
    }

    public synchronized void stopPreview() {
        if (this.autoFocusManager != null) {
            this.autoFocusManager.stop();
            this.autoFocusManager = null;
        }
        if (this.camera != null && this.previewing) {
            this.camera.getCamera().stopPreview();
            this.previewCallback.setHandler((Handler) null, 0);
            this.previewing = false;
        }
    }
}
