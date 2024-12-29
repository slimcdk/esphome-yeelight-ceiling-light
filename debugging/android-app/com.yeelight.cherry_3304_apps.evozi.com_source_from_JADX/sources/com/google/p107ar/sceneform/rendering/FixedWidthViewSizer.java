package com.google.p107ar.sceneform.rendering;

import android.view.View;
import com.google.p107ar.sceneform.math.Vector3;
import com.google.p107ar.sceneform.utilities.Preconditions;

/* renamed from: com.google.ar.sceneform.rendering.FixedWidthViewSizer */
public class FixedWidthViewSizer implements ViewSizer {
    private static final float DEFAULT_SIZE_Z = 0.0f;
    private final float widthMeters;

    public FixedWidthViewSizer(float f) {
        if (f > 0.0f) {
            this.widthMeters = f;
            return;
        }
        throw new IllegalArgumentException("widthMeters must be greater than zero.");
    }

    public Vector3 getSize(View view) {
        Preconditions.checkNotNull(view, "Parameter \"view\" was null.");
        float b = C2772q0.m8439b(view);
        if (b == 0.0f) {
            return Vector3.zero();
        }
        float f = this.widthMeters;
        return new Vector3(f, f / b, 0.0f);
    }

    public float getWidth() {
        return this.widthMeters;
    }
}
