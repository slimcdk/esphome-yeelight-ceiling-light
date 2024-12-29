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
        StringBuilder sb = new StringBuilder();
        sb.append("Display at: ");
        sb.append(i);
        int orientation = openCamera.getOrientation();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Camera at: ");
        sb2.append(orientation);
        CameraFacing facing = openCamera.getFacing();
        CameraFacing cameraFacing = CameraFacing.FRONT;
        if (facing == cameraFacing) {
            orientation = (360 - orientation) % 360;
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Front camera overriden to: ");
            sb3.append(orientation);
        }
        this.cwRotationFromDisplayToCamera = ((orientation + 360) - i) % 360;
        StringBuilder sb4 = new StringBuilder();
        sb4.append("Final display orientation: ");
        sb4.append(this.cwRotationFromDisplayToCamera);
        this.cwNeededRotation = openCamera.getFacing() == cameraFacing ? (360 - this.cwRotationFromDisplayToCamera) % 360 : this.cwRotationFromDisplayToCamera;
        StringBuilder sb5 = new StringBuilder();
        sb5.append("Clockwise rotation from display to camera: ");
        sb5.append(this.cwNeededRotation);
        Point point = new Point();
        defaultDisplay.getSize(point);
        this.screenResolution = point;
        StringBuilder sb6 = new StringBuilder();
        sb6.append("Screen resolution in current orientation: ");
        sb6.append(this.screenResolution);
        this.cameraResolution = CameraConfigurationUtils.findBestPreviewSizeValue(parameters, this.screenResolution);
        StringBuilder sb7 = new StringBuilder();
        sb7.append("Camera resolution: ");
        sb7.append(this.cameraResolution);
        this.bestPreviewSize = CameraConfigurationUtils.findBestPreviewSizeValue(parameters, this.screenResolution);
        StringBuilder sb8 = new StringBuilder();
        sb8.append("Best available preview size: ");
        sb8.append(this.bestPreviewSize);
        Point point2 = this.screenResolution;
        boolean z2 = point2.x < point2.y;
        Point point3 = this.bestPreviewSize;
        if (point3.x < point3.y) {
            z = true;
        }
        if (z2 == z) {
            this.previewSizeOnScreen = point3;
        } else {
            Point point4 = this.bestPreviewSize;
            this.previewSizeOnScreen = new Point(point4.y, point4.x);
        }
        StringBuilder sb9 = new StringBuilder();
        sb9.append("Preview size on screen: ");
        sb9.append(this.previewSizeOnScreen);
    }

    /* access modifiers changed from: package-private */
    public void setDesiredCameraParameters(OpenCamera openCamera, boolean z) {
        Camera camera = openCamera.getCamera();
        Camera.Parameters parameters = camera.getParameters();
        if (parameters != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("Initial camera parameters: ");
            sb.append(parameters.flatten());
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
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Camera said it supported preview size ");
                    sb2.append(this.bestPreviewSize.x);
                    sb2.append('x');
                    sb2.append(this.bestPreviewSize.y);
                    sb2.append(", but after setting it, preview size is ");
                    sb2.append(previewSize.width);
                    sb2.append('x');
                    sb2.append(previewSize.height);
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
