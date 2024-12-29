package com.google.p017ar.sceneform.math;

import android.animation.TypeEvaluator;

/* renamed from: com.google.ar.sceneform.math.QuaternionEvaluator */
public class QuaternionEvaluator implements TypeEvaluator<Quaternion> {
    public Quaternion evaluate(float f, Quaternion quaternion, Quaternion quaternion2) {
        return Quaternion.slerp(quaternion, quaternion2, f);
    }
}
