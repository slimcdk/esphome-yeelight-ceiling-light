package p124a4;

import android.hardware.Camera;

/* renamed from: a4.e */
public final class C3970e {
    /* renamed from: a */
    public static Camera m11464a(int i) {
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
            StringBuilder sb = new StringBuilder();
            sb.append("Opening camera #");
            sb.append(i);
            return Camera.open(i);
        } else if (!z) {
            return Camera.open(0);
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Requested camera does not exist: ");
            sb2.append(i);
            return null;
        }
    }
}
