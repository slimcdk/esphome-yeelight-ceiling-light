package com.yeelight.yeelib.pickcolor.p193g;

import android.hardware.Camera;

/* renamed from: com.yeelight.yeelib.pickcolor.g.e */
public final class C9928e {
    /* renamed from: a */
    public static Camera m24375a(int i) {
        int numberOfCameras = Camera.getNumberOfCameras();
        if (numberOfCameras == 0) {
            return null;
        }
        boolean z = i >= 0;
        if (!z) {
            i = 0;
            while (i < numberOfCameras) {
                Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
                Camera.getCameraInfo(i, cameraInfo);
                if (cameraInfo.facing == 0) {
                    break;
                }
                i++;
            }
        }
        if (i < numberOfCameras) {
            "Opening camera #" + i;
            return Camera.open(i);
        } else if (!z) {
            return Camera.open(0);
        } else {
            "Requested camera does not exist: " + i;
            return null;
        }
    }
}
