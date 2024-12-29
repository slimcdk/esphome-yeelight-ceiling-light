package com.miot.service.qrcode.camera.open;

import android.hardware.Camera;
import java.util.List;

public final class OpenCamera {
    private final Camera camera;
    private final CameraFacing facing;
    private final int index;
    private final int orientation;

    public OpenCamera(int i, Camera camera2, CameraFacing cameraFacing, int i2) {
        this.index = i;
        this.camera = camera2;
        this.facing = cameraFacing;
        this.orientation = i2;
    }

    private static Camera.Size getOptimalSize(List<Camera.Size> list, int i, int i2) {
        double d = (double) i2;
        double d2 = (double) i;
        Double.isNaN(d);
        Double.isNaN(d2);
        double d3 = d / d2;
        double d4 = Double.MAX_VALUE;
        Camera.Size size = null;
        double d5 = Double.MAX_VALUE;
        for (Camera.Size next : list) {
            double d6 = (double) next.width;
            double d7 = (double) next.height;
            Double.isNaN(d6);
            Double.isNaN(d7);
            double d8 = (d6 / d7) - d3;
            if (Math.abs(d8) <= 0.1d && Math.abs(d8) < d5) {
                d5 = Math.abs(d8);
                size = next;
            }
        }
        if (size == null) {
            for (Camera.Size next2 : list) {
                double d9 = (double) next2.width;
                double d10 = (double) next2.height;
                Double.isNaN(d9);
                Double.isNaN(d10);
                double d11 = (d9 / d10) - d3;
                if (Math.abs(d11) < d4) {
                    d4 = Math.abs(d11);
                    size = next2;
                }
            }
        }
        return size;
    }

    public Camera getCamera() {
        return this.camera;
    }

    public CameraFacing getFacing() {
        return this.facing;
    }

    public int getOrientation() {
        return this.orientation;
    }

    public void setPreviewSize(int i, int i2) {
        Camera camera2 = this.camera;
        if (camera2 != null) {
            Camera.Parameters parameters = camera2.getParameters();
            Camera.Size optimalSize = getOptimalSize(parameters.getSupportedPreviewSizes(), i, i2);
            parameters.setPreviewSize(optimalSize.width, optimalSize.height);
            this.camera.setParameters(parameters);
        }
    }

    public String toString() {
        return "Camera #" + this.index + " : " + this.facing + ',' + this.orientation;
    }
}
