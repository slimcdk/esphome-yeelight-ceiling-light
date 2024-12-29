package com.miot.service.qrcode;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import com.miot.service.qrcode.camera.CameraManager;

final class AmbientLightManager implements SensorEventListener {
    private static final float BRIGHT_ENOUGH_LUX = 450.0f;
    private static final float TOO_DARK_LUX = 45.0f;
    private CameraManager cameraManager;
    private final Context context;
    private Sensor lightSensor;

    AmbientLightManager(Context context2) {
        this.context = context2;
    }

    public void onAccuracyChanged(Sensor sensor, int i) {
    }

    public void onSensorChanged(SensorEvent sensorEvent) {
        float f = sensorEvent.values[0];
        CameraManager cameraManager2 = this.cameraManager;
        if (cameraManager2 == null) {
            return;
        }
        if (f <= TOO_DARK_LUX) {
            cameraManager2.setTorch(true);
        } else if (f >= BRIGHT_ENOUGH_LUX) {
            cameraManager2.setTorch(false);
        }
    }

    /* access modifiers changed from: package-private */
    public void start(CameraManager cameraManager2) {
        this.cameraManager = cameraManager2;
    }

    /* access modifiers changed from: package-private */
    public void stop() {
        if (this.lightSensor != null) {
            ((SensorManager) this.context.getSystemService("sensor")).unregisterListener(this);
            this.cameraManager = null;
            this.lightSensor = null;
        }
    }
}
