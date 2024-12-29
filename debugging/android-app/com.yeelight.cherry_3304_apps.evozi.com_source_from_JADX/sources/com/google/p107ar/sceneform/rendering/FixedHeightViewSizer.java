package com.google.p107ar.sceneform.rendering;

import android.view.View;
import com.google.p107ar.sceneform.math.Vector3;
import com.google.p107ar.sceneform.utilities.Preconditions;

/* renamed from: com.google.ar.sceneform.rendering.FixedHeightViewSizer */
public class FixedHeightViewSizer implements ViewSizer {
    private static final float DEFAULT_SIZE_Z = 0.0f;
    private final float heightMeters;

    public FixedHeightViewSizer(float f) {
        if (f > 0.0f) {
            this.heightMeters = f;
            return;
        }
        throw new IllegalArgumentException("heightMeters must be greater than zero.");
    }

    public float getHeight() {
        return this.heightMeters;
    }

    public Vector3 getSize(View view) {
        Preconditions.checkNotNull(view, "Parameter \"view\" was null.");
        float b = C2772q0.m8439b(view);
        if (b == 0.0f) {
            return Vector3.zero();
        }
        float f = this.heightMeters;
        return new Vector3(b * f, f, 0.0f);
    }
}
