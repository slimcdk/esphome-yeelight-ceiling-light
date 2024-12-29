package com.miot.service.qrcode.camera;

import android.graphics.Point;
import android.hardware.Camera;
import android.os.Handler;

final class PreviewCallback implements Camera.PreviewCallback {
    private static final String TAG = PreviewCallback.class.getSimpleName();
    private final CameraConfigurationManager configManager;
    private Handler previewHandler;
    private int previewMessage;

    PreviewCallback(CameraConfigurationManager cameraConfigurationManager) {
        this.configManager = cameraConfigurationManager;
    }

    public void onPreviewFrame(byte[] bArr, Camera camera) {
        Point cameraResolution = this.configManager.getCameraResolution();
        Handler handler = this.previewHandler;
        if (cameraResolution != null && handler != null) {
            handler.obtainMessage(this.previewMessage, cameraResolution.x, cameraResolution.y, bArr).sendToTarget();
            this.previewHandler = null;
        }
    }

    /* access modifiers changed from: package-private */
    public void setHandler(Handler handler, int i) {
        this.previewHandler = handler;
        this.previewMessage = i;
    }
}
