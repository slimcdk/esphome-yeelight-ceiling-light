package com.miot.service.qrcode.camera.open;

import android.hardware.Camera;

public final class OpenCameraInterface {
    public static final int NO_REQUESTED_CAMERA = -1;
    private static final String TAG = "com.miot.service.qrcode.camera.open.OpenCameraInterface";

    private OpenCameraInterface() {
    }

    public static OpenCamera open(int i) {
        Camera.CameraInfo cameraInfo;
        int i2;
        Camera camera;
        int numberOfCameras = Camera.getNumberOfCameras();
        if (numberOfCameras == 0) {
            return null;
        }
        boolean z = i >= 0;
        if (!z) {
            i2 = 0;
            while (true) {
                if (i2 >= numberOfCameras) {
                    cameraInfo = null;
                    break;
                }
                cameraInfo = new Camera.CameraInfo();
                Camera.getCameraInfo(i2, cameraInfo);
                if (CameraFacing.values()[cameraInfo.facing] == CameraFacing.BACK) {
                    break;
                }
                i2++;
            }
        } else {
            Camera.CameraInfo cameraInfo2 = new Camera.CameraInfo();
            Camera.getCameraInfo(i, cameraInfo2);
            cameraInfo = cameraInfo2;
            i2 = i;
        }
        if (i2 < numberOfCameras) {
            StringBuilder sb = new StringBuilder();
            sb.append("Opening camera #");
            sb.append(i2);
            camera = Camera.open(i2);
        } else if (z) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Requested camera does not exist: ");
            sb2.append(i);
            camera = null;
        } else {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("No camera facing ");
            sb3.append(CameraFacing.BACK);
            sb3.append("; returning camera #0");
            camera = Camera.open(0);
            cameraInfo = new Camera.CameraInfo();
            Camera.getCameraInfo(0, cameraInfo);
        }
        if (camera == null) {
            return null;
        }
        return new OpenCamera(i2, camera, CameraFacing.values()[cameraInfo.facing], cameraInfo.orientation);
    }
}