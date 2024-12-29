package com.google.p107ar.sceneform.rendering;

import com.google.p107ar.core.Camera;
import com.google.p107ar.sceneform.common.TransformProvider;
import com.google.p107ar.sceneform.math.Matrix;

/* renamed from: com.google.ar.sceneform.rendering.CameraProvider */
public interface CameraProvider extends TransformProvider {
    float getFarClipPlane();

    float getNearClipPlane();

    Matrix getProjectionMatrix();

    Matrix getViewMatrix();

    boolean isActive();

    void updateTrackedPose(Camera camera);
}
