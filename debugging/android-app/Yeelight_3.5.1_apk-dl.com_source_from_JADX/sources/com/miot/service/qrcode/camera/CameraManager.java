package com.miot.service.qrcode.camera;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Handler;
import com.google.zxing.C2561e;
import com.miot.common.utils.DisplayUtils;
import com.miot.service.qrcode.camera.open.OpenCamera;

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
        CameraConfigurationManager cameraConfigurationManager = new CameraConfigurationManager(context2);
        this.configManager = cameraConfigurationManager;
        this.previewCallback = new PreviewCallback(cameraConfigurationManager);
    }

    private static int findDesiredDimensionInRange(int i, int i2, int i3) {
        int i4 = (i * 5) / 8;
        return i4 < i2 ? i2 : i4 > i3 ? i3 : i4;
    }

    public C2561e buildLuminanceSource(byte[] bArr, int i, int i2) {
        Rect framingRectInPreview2 = getFramingRectInPreview();
        if (framingRectInPreview2 == null) {
            return null;
        }
        return new C2561e(bArr, i, i2, framingRectInPreview2.left, framingRectInPreview2.top, framingRectInPreview2.width(), framingRectInPreview2.height(), false);
    }

    public synchronized void closeDriver() {
        OpenCamera openCamera = this.camera;
        if (openCamera != null) {
            openCamera.getCamera().release();
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
            StringBuilder sb = new StringBuilder();
            sb.append("Calculated framing rect: ");
            sb.append(this.framingRect);
        }
        return this.framingRect;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0051, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized android.graphics.Rect getFramingRectInPreview() {
        /*
            r7 = this;
            monitor-enter(r7)
            android.graphics.Rect r0 = r7.framingRectInPreview     // Catch:{ all -> 0x0056 }
            if (r0 != 0) goto L_0x0052
            android.graphics.Rect r0 = r7.getFramingRect()     // Catch:{ all -> 0x0056 }
            r1 = 0
            if (r0 != 0) goto L_0x000e
            monitor-exit(r7)
            return r1
        L_0x000e:
            android.graphics.Rect r2 = new android.graphics.Rect     // Catch:{ all -> 0x0056 }
            r2.<init>(r0)     // Catch:{ all -> 0x0056 }
            com.miot.service.qrcode.camera.CameraConfigurationManager r0 = r7.configManager     // Catch:{ all -> 0x0056 }
            android.graphics.Point r0 = r0.getCameraResolution()     // Catch:{ all -> 0x0056 }
            com.miot.service.qrcode.camera.CameraConfigurationManager r3 = r7.configManager     // Catch:{ all -> 0x0056 }
            android.graphics.Point r3 = r3.getScreenResolution()     // Catch:{ all -> 0x0056 }
            if (r0 == 0) goto L_0x0050
            if (r3 != 0) goto L_0x0024
            goto L_0x0050
        L_0x0024:
            android.graphics.Rect r1 = new android.graphics.Rect     // Catch:{ all -> 0x0056 }
            r1.<init>()     // Catch:{ all -> 0x0056 }
            r7.framingRectInPreview = r1     // Catch:{ all -> 0x0056 }
            int r4 = r2.top     // Catch:{ all -> 0x0056 }
            int r5 = r0.x     // Catch:{ all -> 0x0056 }
            int r4 = r4 * r5
            int r6 = r3.y     // Catch:{ all -> 0x0056 }
            int r4 = r4 / r6
            r1.left = r4     // Catch:{ all -> 0x0056 }
            int r4 = r2.bottom     // Catch:{ all -> 0x0056 }
            int r4 = r4 * r5
            int r4 = r4 / r6
            r1.right = r4     // Catch:{ all -> 0x0056 }
            int r4 = r2.left     // Catch:{ all -> 0x0056 }
            int r0 = r0.y     // Catch:{ all -> 0x0056 }
            int r4 = r4 * r0
            int r3 = r3.x     // Catch:{ all -> 0x0056 }
            int r4 = r4 / r3
            r1.top = r4     // Catch:{ all -> 0x0056 }
            int r2 = r2.right     // Catch:{ all -> 0x0056 }
            int r2 = r2 * r0
            int r2 = r2 / r3
            r1.bottom = r2     // Catch:{ all -> 0x0056 }
            goto L_0x0052
        L_0x0050:
            monitor-exit(r7)
            return r1
        L_0x0052:
            android.graphics.Rect r0 = r7.framingRectInPreview     // Catch:{ all -> 0x0056 }
            monitor-exit(r7)
            return r0
        L_0x0056:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.miot.service.qrcode.camera.CameraManager.getFramingRectInPreview():android.graphics.Rect");
    }

    public synchronized boolean isOpen() {
        return this.camera != null;
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x004d */
    /* JADX WARNING: Missing exception handler attribute for start block: B:28:0x006b */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x005c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void openDriver(android.view.SurfaceHolder r5, int r6, int r7) {
        /*
            r4 = this;
            monitor-enter(r4)
            com.miot.service.qrcode.camera.open.OpenCamera r0 = r4.camera     // Catch:{ all -> 0x0070 }
            if (r0 != 0) goto L_0x001b
            int r0 = r4.requestedCameraId     // Catch:{ all -> 0x0070 }
            com.miot.service.qrcode.camera.open.OpenCamera r0 = com.miot.service.qrcode.camera.open.OpenCameraInterface.open(r0)     // Catch:{ all -> 0x0070 }
            if (r0 == 0) goto L_0x0013
            r4.camera = r0     // Catch:{ all -> 0x0070 }
            r0.setPreviewSize(r6, r7)     // Catch:{ all -> 0x0070 }
            goto L_0x001b
        L_0x0013:
            java.io.IOException r5 = new java.io.IOException     // Catch:{ all -> 0x0070 }
            java.lang.String r6 = "Camera.open() failed to return object from driver"
            r5.<init>(r6)     // Catch:{ all -> 0x0070 }
            throw r5     // Catch:{ all -> 0x0070 }
        L_0x001b:
            boolean r6 = r4.initialized     // Catch:{ all -> 0x0070 }
            r7 = 1
            r1 = 0
            if (r6 != 0) goto L_0x0037
            r4.initialized = r7     // Catch:{ all -> 0x0070 }
            com.miot.service.qrcode.camera.CameraConfigurationManager r6 = r4.configManager     // Catch:{ all -> 0x0070 }
            r6.initFromCameraParameters(r0)     // Catch:{ all -> 0x0070 }
            int r6 = r4.requestedFramingRectWidth     // Catch:{ all -> 0x0070 }
            if (r6 <= 0) goto L_0x0037
            int r2 = r4.requestedFramingRectHeight     // Catch:{ all -> 0x0070 }
            if (r2 <= 0) goto L_0x0037
            r4.setManualFramingRect(r6, r2)     // Catch:{ all -> 0x0070 }
            r4.requestedFramingRectWidth = r1     // Catch:{ all -> 0x0070 }
            r4.requestedFramingRectHeight = r1     // Catch:{ all -> 0x0070 }
        L_0x0037:
            android.hardware.Camera r6 = r0.getCamera()     // Catch:{ all -> 0x0070 }
            android.hardware.Camera$Parameters r2 = r6.getParameters()     // Catch:{ all -> 0x0070 }
            if (r2 != 0) goto L_0x0043
            r2 = 0
            goto L_0x0047
        L_0x0043:
            java.lang.String r2 = r2.flatten()     // Catch:{ all -> 0x0070 }
        L_0x0047:
            com.miot.service.qrcode.camera.CameraConfigurationManager r3 = r4.configManager     // Catch:{ RuntimeException -> 0x004d }
            r3.setDesiredCameraParameters(r0, r1)     // Catch:{ RuntimeException -> 0x004d }
            goto L_0x006b
        L_0x004d:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0070 }
            r1.<init>()     // Catch:{ all -> 0x0070 }
            java.lang.String r3 = "Resetting to saved camera params: "
            r1.append(r3)     // Catch:{ all -> 0x0070 }
            r1.append(r2)     // Catch:{ all -> 0x0070 }
            if (r2 == 0) goto L_0x006b
            android.hardware.Camera$Parameters r1 = r6.getParameters()     // Catch:{ all -> 0x0070 }
            r1.unflatten(r2)     // Catch:{ all -> 0x0070 }
            r6.setParameters(r1)     // Catch:{ RuntimeException -> 0x006b }
            com.miot.service.qrcode.camera.CameraConfigurationManager r1 = r4.configManager     // Catch:{ RuntimeException -> 0x006b }
            r1.setDesiredCameraParameters(r0, r7)     // Catch:{ RuntimeException -> 0x006b }
        L_0x006b:
            r6.setPreviewDisplay(r5)     // Catch:{ all -> 0x0070 }
            monitor-exit(r4)
            return
        L_0x0070:
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
            int i3 = screenResolution.x;
            if (i > i3) {
                i = i3;
            }
            int i4 = screenResolution.y;
            if (i2 > i4) {
                i2 = i4;
            }
            int i5 = (i3 - i) / 2;
            int i6 = (i4 - i2) / 2;
            this.framingRect = new Rect(i5, i6, i + i5, i2 + i6);
            StringBuilder sb = new StringBuilder();
            sb.append("Calculated manual framing rect: ");
            sb.append(this.framingRect);
            this.framingRectInPreview = null;
        } else {
            this.requestedFramingRectWidth = i;
            this.requestedFramingRectHeight = i2;
        }
    }

    public synchronized void setTorch(boolean z) {
        OpenCamera openCamera = this.camera;
        if (!(openCamera == null || z == this.configManager.getTorchState(openCamera.getCamera()))) {
            AutoFocusManager autoFocusManager2 = this.autoFocusManager;
            boolean z2 = autoFocusManager2 != null;
            if (z2) {
                autoFocusManager2.stop();
                this.autoFocusManager = null;
            }
            this.configManager.setTorch(openCamera.getCamera(), z);
            if (z2) {
                AutoFocusManager autoFocusManager3 = new AutoFocusManager(this.context, openCamera.getCamera());
                this.autoFocusManager = autoFocusManager3;
                autoFocusManager3.start();
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
        AutoFocusManager autoFocusManager2 = this.autoFocusManager;
        if (autoFocusManager2 != null) {
            autoFocusManager2.stop();
            this.autoFocusManager = null;
        }
        OpenCamera openCamera = this.camera;
        if (openCamera != null && this.previewing) {
            openCamera.getCamera().stopPreview();
            this.previewCallback.setHandler((Handler) null, 0);
            this.previewing = false;
        }
    }
}
