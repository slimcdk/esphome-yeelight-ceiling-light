package com.google.p107ar.sceneform.utilities;

/* renamed from: com.google.ar.sceneform.utilities.EnvironmentalHdrParameters */
public class EnvironmentalHdrParameters {
    private final float ambientShScaleForFilament;
    private final float directIntensityForFilament;
    private final float reflectionScaleForFilament;

    /* renamed from: com.google.ar.sceneform.utilities.EnvironmentalHdrParameters$Builder */
    public static class Builder {
        /* access modifiers changed from: private */
        public float ambientShScaleForFilament;
        /* access modifiers changed from: private */
        public float directIntensityForFilament;
        /* access modifiers changed from: private */
        public float reflectionScaleForFilament;

        public EnvironmentalHdrParameters build() {
            return new EnvironmentalHdrParameters(this);
        }

        public Builder setAmbientShScaleForFilament(float f) {
            this.ambientShScaleForFilament = f;
            return this;
        }

        public Builder setDirectIntensityForFilament(float f) {
            this.directIntensityForFilament = f;
            return this;
        }

        public Builder setReflectionScaleForFilament(float f) {
            this.reflectionScaleForFilament = f;
            return this;
        }
    }

    private EnvironmentalHdrParameters(Builder builder) {
        this.ambientShScaleForFilament = builder.ambientShScaleForFilament;
        this.directIntensityForFilament = builder.directIntensityForFilament;
        this.reflectionScaleForFilament = builder.reflectionScaleForFilament;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EnvironmentalHdrParameters makeDefault() {
        return builder().setAmbientShScaleForFilament(1.5f).setDirectIntensityForFilament(0.0f).setReflectionScaleForFilament(0.5f).build();
    }

    public float getAmbientShScaleForFilament() {
        return this.ambientShScaleForFilament;
    }

    public float getDirectIntensityForFilament() {
        return this.directIntensityForFilament;
    }

    public float getReflectionScaleForFilament() {
        return this.reflectionScaleForFilament;
    }
}
