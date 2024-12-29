package com.google.p017ar.sceneform.math;

import android.animation.TypeEvaluator;

/* renamed from: com.google.ar.sceneform.math.Vector3Evaluator */
public class Vector3Evaluator implements TypeEvaluator<Vector3> {
    public Vector3 evaluate(float f, Vector3 vector3, Vector3 vector32) {
        return Vector3.lerp(vector3, vector32, f);
    }
}
