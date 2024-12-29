package com.google.p017ar.sceneform;

import androidx.annotation.ColorInt;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.p017ar.sceneform.math.Vector3;
import com.google.p017ar.sceneform.rendering.Color;
import com.google.p017ar.sceneform.rendering.Light;
import com.google.p017ar.sceneform.utilities.Preconditions;

/* renamed from: com.google.ar.sceneform.Sun */
public class Sun extends Node {
    @ColorInt
    static final int DEFAULT_SUNLIGHT_COLOR = -863292;
    static final Vector3 DEFAULT_SUNLIGHT_DIRECTION = new Vector3(0.7f, -1.0f, -0.8f);
    private static final float LIGHT_ESTIMATE_OFFSET = 0.0f;
    private static final float LIGHT_ESTIMATE_SCALE = 1.8f;
    private float baseIntensity = 0.0f;

    @VisibleForTesting(otherwise = 2)
    Sun() {
    }

    Sun(Scene scene) {
        Preconditions.checkNotNull(scene, "Parameter \"scene\" was null.");
        super.setParent(scene);
        setupDefaultLighting(scene.getView());
    }

    private void setupDefaultLighting(SceneView sceneView) {
        Preconditions.checkNotNull(sceneView, "Parameter \"view\" was null.");
        Color color = new Color((int) DEFAULT_SUNLIGHT_COLOR);
        setLookDirection(DEFAULT_SUNLIGHT_DIRECTION.normalized());
        Light build = Light.builder(Light.Type.DIRECTIONAL).setColor(color).setShadowCastingEnabled(true).build();
        if (build != null) {
            setLight(build);
            return;
        }
        throw new AssertionError("Failed to create the default sunlight.");
    }

    /* access modifiers changed from: package-private */
    public void setLightEstimate(Color color, float f) {
        Light light = getLight();
        if (light != null) {
            if (this.baseIntensity == 0.0f) {
                this.baseIntensity = light.getIntensity();
            }
            float min = this.baseIntensity * Math.min((f * LIGHT_ESTIMATE_SCALE) + 0.0f, 1.0f);
            Color color2 = new Color((int) DEFAULT_SUNLIGHT_COLOR);
            color2.f3288r *= color.f3288r;
            color2.f3287g *= color.f3287g;
            color2.f3286b *= color.f3286b;
            light.setColor(color2);
            light.setIntensity(min);
        }
    }

    public void setParent(@Nullable NodeParent nodeParent) {
        throw new UnsupportedOperationException("Sun's parent cannot be changed, it is always the scene.");
    }
}
