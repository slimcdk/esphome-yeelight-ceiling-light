package com.google.p017ar.sceneform.rendering;

import androidx.annotation.RequiresApi;
import com.google.android.filament.Colors;
import com.google.p017ar.sceneform.common.TransformProvider;
import com.google.p017ar.sceneform.math.Vector3;
import com.google.p017ar.sceneform.utilities.AndroidPreconditions;
import java.util.ArrayList;
import java.util.Iterator;

@RequiresApi(api = 24)
/* renamed from: com.google.ar.sceneform.rendering.Light */
public class Light {
    private static final float MIN_LIGHT_INTENSITY = 1.0E-4f;
    private final ArrayList<LightChangedListener> changedListeners;
    private final Color color;
    private Vector3 direction;
    private final boolean enableShadows;
    private float falloffRadius;
    private float intensity;
    private Vector3 position;
    private float spotlightConeInner;
    private float spotlightConeOuter;
    private final Type type;

    /* renamed from: com.google.ar.sceneform.rendering.Light$Builder */
    public static final class Builder {
        private static final float DEFAULT_DIRECTIONAL_INTENSITY = 420.0f;
        /* access modifiers changed from: private */
        public Color color;
        /* access modifiers changed from: private */
        public Vector3 direction;
        /* access modifiers changed from: private */
        public boolean enableShadows;
        /* access modifiers changed from: private */
        public float falloffRadius;
        /* access modifiers changed from: private */
        public float intensity;
        /* access modifiers changed from: private */
        public Vector3 position;
        /* access modifiers changed from: private */
        public float spotlightConeInner;
        /* access modifiers changed from: private */
        public float spotlightConeOuter;
        /* access modifiers changed from: private */
        public final Type type;

        private Builder(Type type2) {
            this.enableShadows = false;
            this.position = new Vector3(0.0f, 0.0f, 0.0f);
            this.direction = new Vector3(0.0f, 0.0f, -1.0f);
            this.color = new Color(1.0f, 1.0f, 1.0f);
            this.intensity = 2500.0f;
            this.falloffRadius = 10.0f;
            this.spotlightConeInner = 0.5f;
            this.spotlightConeOuter = 0.6f;
            this.type = type2;
            if (type2 == Type.DIRECTIONAL) {
                this.intensity = DEFAULT_DIRECTIONAL_INTENSITY;
            }
        }

        public Light build() {
            return new Light(this);
        }

        public Builder setColor(Color color2) {
            this.color = color2;
            return this;
        }

        public Builder setColorTemperature(float f) {
            float[] cct = Colors.cct(f);
            setColor(new Color(cct[0], cct[1], cct[2]));
            return this;
        }

        public Builder setFalloffRadius(float f) {
            this.falloffRadius = f;
            return this;
        }

        public Builder setInnerConeAngle(float f) {
            this.spotlightConeInner = f;
            return this;
        }

        public Builder setIntensity(float f) {
            this.intensity = f;
            return this;
        }

        public Builder setOuterConeAngle(float f) {
            this.spotlightConeOuter = f;
            return this;
        }

        public Builder setShadowCastingEnabled(boolean z) {
            this.enableShadows = z;
            return this;
        }
    }

    /* renamed from: com.google.ar.sceneform.rendering.Light$LightChangedListener */
    interface LightChangedListener {
        /* renamed from: a */
        void mo17406a();
    }

    /* renamed from: com.google.ar.sceneform.rendering.Light$Type */
    public enum Type {
        POINT,
        DIRECTIONAL,
        SPOTLIGHT,
        FOCUSED_SPOTLIGHT
    }

    private Light(Builder builder) {
        this.changedListeners = new ArrayList<>();
        this.type = builder.type;
        this.enableShadows = builder.enableShadows;
        this.position = builder.position;
        this.direction = builder.direction;
        this.color = builder.color;
        this.intensity = builder.intensity;
        this.falloffRadius = builder.falloffRadius;
        this.spotlightConeInner = builder.spotlightConeInner;
        this.spotlightConeOuter = builder.spotlightConeOuter;
    }

    public static Builder builder(Type type2) {
        AndroidPreconditions.checkMinAndroidApiLevel();
        return new Builder(type2);
    }

    private void fireChangedListeners() {
        Iterator<LightChangedListener> it = this.changedListeners.iterator();
        while (it.hasNext()) {
            it.next().mo17406a();
        }
    }

    /* access modifiers changed from: package-private */
    public void addChangedListener(LightChangedListener lightChangedListener) {
        this.changedListeners.add(lightChangedListener);
    }

    public LightInstance createInstance(TransformProvider transformProvider) {
        return new LightInstance(this, transformProvider);
    }

    public Color getColor() {
        return new Color(this.color);
    }

    public float getFalloffRadius() {
        return this.falloffRadius;
    }

    public float getInnerConeAngle() {
        return this.spotlightConeInner;
    }

    public float getIntensity() {
        return this.intensity;
    }

    public Vector3 getLocalDirection() {
        return new Vector3(this.direction);
    }

    public Vector3 getLocalPosition() {
        return new Vector3(this.position);
    }

    public float getOuterConeAngle() {
        return this.spotlightConeOuter;
    }

    public Type getType() {
        return this.type;
    }

    public boolean isShadowCastingEnabled() {
        return this.enableShadows;
    }

    /* access modifiers changed from: package-private */
    public void removeChangedListener(LightChangedListener lightChangedListener) {
        this.changedListeners.remove(lightChangedListener);
    }

    public void setColor(Color color2) {
        this.color.set(color2);
        fireChangedListeners();
    }

    public void setColorTemperature(float f) {
        float[] cct = Colors.cct(f);
        setColor(new Color(cct[0], cct[1], cct[2]));
    }

    public void setFalloffRadius(float f) {
        this.falloffRadius = f;
        fireChangedListeners();
    }

    public void setInnerConeAngle(float f) {
        this.spotlightConeInner = f;
        fireChangedListeners();
    }

    public void setIntensity(float f) {
        this.intensity = Math.max(f, 1.0E-4f);
        fireChangedListeners();
    }

    public void setOuterConeAngle(float f) {
        this.spotlightConeOuter = f;
        fireChangedListeners();
    }
}
