package com.google.p017ar.sceneform.rendering;

import android.view.View;
import com.google.p017ar.sceneform.math.Vector3;
import com.google.p017ar.sceneform.utilities.Preconditions;

/* renamed from: com.google.ar.sceneform.rendering.DpToMetersViewSizer */
public class DpToMetersViewSizer implements ViewSizer {
    private static final float DEFAULT_SIZE_Z = 0.0f;
    private final int dpPerMeters;

    public DpToMetersViewSizer(int i) {
        if (i > 0) {
            this.dpPerMeters = i;
            return;
        }
        throw new IllegalArgumentException("dpPerMeters must be greater than zero.");
    }

    public int getDpPerMeters() {
        return this.dpPerMeters;
    }

    public Vector3 getSize(View view) {
        Preconditions.checkNotNull(view, "Parameter \"view\" was null.");
        float a = C2155q0.m5361a(view.getWidth());
        float a2 = C2155q0.m5361a(view.getHeight());
        int i = this.dpPerMeters;
        return new Vector3(a / ((float) i), a2 / ((float) i), 0.0f);
    }
}