package com.miot.service.qrcode.camera;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Point;
import android.hardware.Camera;
import android.preference.PreferenceManager;
import android.view.Display;
import android.view.WindowManager;
import com.miot.service.qrcode.camera.open.CameraFacing;
import com.miot.service.qrcode.camera.open.OpenCamera;

final class CameraConfigurationManager {
    private static final String TAG = "CameraConfiguration";
    private Point bestPreviewSize;
    private Point cameraResolution;
    private final Context context;
    private int cwNeededRotation;
    private int cwRotationFromDisplayToCamera;
    private Point previewSizeOnScreen;
    private Point screenResolution;

    CameraConfigurationManager(Context context2) {
        this.context = context2;
    }

    private void doSetTorch(Camera.Parameters parameters, boolean z, boolean z2) {
        CameraConfigurationUtils.setTorch(parameters, z);
        PreferenceManager.getDefaultSharedPreferences(this.context);
    }

    private void initializeTorch(Camera.Parameters parameters, SharedPreferences sharedPreferences, boolean z) {
        doSetTorch(parameters, FrontLightMode.readPref(sharedPreferences) == FrontLightMode.ON, z);
    }

    /* access modifiers changed from: package-private */
    public Point getBestPreviewSize() {
        return this.bestPreviewSize;
    }

    /* access modifiers changed from: package-private */
    public int getCWNeededRotation() {
        return this.cwNeededRotation;
    }

    /* access modifiers changed from: package-private */
    public Point getCameraResolution() {
        return this.cameraResolution;
    }

    /* access modifiers changed from: package-private */
    public Point getPreviewSizeOnScreen() {
        return this.previewSizeOnScreen;
    }

    /* access modifiers changed from: package-private */
    public Point getScreenResolution() {
        return this.screenResolution;
    }

    /* access modifiers changed from: package-private */
    public boolean getTorchState(Camera camera) {
        String flashMode;
        if (camera == null || camera.getParameters() == null || (flashMode = camera.getParameters().getFlashMode()) == null) {
            return false;
        }
        return "on".equals(flashMode) || "torch".equals(flashMode);
    }

    /* access modifiers changed from: package-private */
    public void initFromCameraParameters(OpenCamera openCamera) {
        int i;
        Point point;
        Camera.Parameters parameters = openCamera.getCamera().getParameters();
        Display defaultDisplay = ((WindowManager) this.context.getSystemService("window")).getDefaultDisplay();
        int rotation = defaultDisplay.getRotation();
        boolean z = false;
        if (rotation == 0) {
            i = 0;
        } else if (rotation == 1) {
            i = 90;
        } else if (rotation == 2) {
            i = 180;
        } else if (rotation == 3) {
            i = 270;
        } else if (rotation % 90 == 0) {
            i = (rotation + 360) % 360;
        } else {
            throw new IllegalArgumentException("Bad rotation: " + rotation);
        }
        "Display at: " + i;
        int orientation = openCamera.getOrientation();
        "Camera at: " + orientation;
        if (openCamera.getFacing() == CameraFacing.FRONT) {
            orientation = (360 - orientation) % 360;
            "Front camera overriden to: " + orientation;
        }
        this.cwRotationFromDisplayToCamera = ((orientation + 360) - i) % 360;
        "Final display orientation: " + this.cwRotationFromDisplayToCamera;
        this.cwNeededRotation = openCamera.getFacing() == CameraFacing.FRONT ? (360 - this.cwRotationFromDisplayToCamera) % 360 : this.cwRotationFromDisplayToCamera;
        "Clockwise rotation from display to camera: " + this.cwNeededRotation;
        Point point2 = new Point();
        defaultDisplay.getSize(point2);
        this.screenResolution = point2;
        "Screen resolution in current orientation: " + this.screenResolution;
        this.cameraResolution = CameraConfigurationUtils.findBestPreviewSizeValue(parameters, this.screenResolution);
        "Camera resolution: " + this.cameraResolution;
        this.bestPreviewSize = CameraConfigurationUtils.findBestPreviewSizeValue(parameters, this.screenResolution);
        "Best available preview size: " + this.bestPreviewSize;
        Point point3 = this.screenResolution;
        boolean z2 = point3.x < point3.y;
        Point point4 = this.bestPreviewSize;
        if (point4.x < point4.y) {
            z = true;
        }
        if (z2 == z) {
            point = this.bestPreviewSize;
        } else {
            Point point5 = this.bestPreviewSize;
            point = new Point(point5.y, point5.x);
        }
        this.previewSizeOnScreen = point;
        "Preview size on screen: " + this.previewSizeOnScreen;
    }

    /* access modifiers changed from: package-private */
    public void setDesiredCameraParameters(OpenCamera openCamera, boolean z) {
        Camera camera = openCamera.getCamera();
        Camera.Parameters parameters = camera.getParameters();
        if (parameters != null) {
            "Initial camera parameters: " + parameters.flatten();
            initializeTorch(parameters, PreferenceManager.getDefaultSharedPreferences(this.context), z);
            CameraConfigurationUtils.setFocus(parameters, true, true, z);
            Point point = this.bestPreviewSize;
            parameters.setPreviewSize(point.x, point.y);
            camera.setParameters(parameters);
            camera.setDisplayOrientation(this.cwRotationFromDisplayToCamera);
            Camera.Size previewSize = camera.getParameters().getPreviewSize();
            if (previewSize != null) {
                Point point2 = this.bestPreviewSize;
                if (point2.x != previewSize.width || point2.y != previewSize.height) {
                    "Camera said it supported preview size " + this.bestPreviewSize.x + 'x' + this.bestPreviewSize.y + ", but after setting it, preview size is " + previewSize.width + 'x' + previewSize.height;
                    Point point3 = this.bestPreviewSize;
                    point3.x = previewSize.width;
                    point3.y = previewSize.height;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void setTorch(Camera camera, boolean z) {
        Camera.Parameters parameters = camera.getParameters();
        doSetTorch(parameters, z, false);
        camera.setParameters(parameters);
    }
}
