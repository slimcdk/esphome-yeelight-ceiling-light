package com.google.p107ar.sceneform.rendering;

import androidx.annotation.Nullable;
import com.google.android.filament.Entity;
import com.google.android.filament.EntityManager;
import com.google.android.filament.LightManager;
import com.google.p107ar.sceneform.common.TransformProvider;
import com.google.p107ar.sceneform.math.Matrix;
import com.google.p107ar.sceneform.math.Vector3;
import com.google.p107ar.sceneform.rendering.Light;
import com.google.p107ar.sceneform.utilities.AndroidPreconditions;

/* renamed from: com.google.ar.sceneform.rendering.LightInstance */
public class LightInstance {
    private static final String TAG = "LightInstance";
    private LightInstanceChangeListener changeListener = new LightInstanceChangeListener();
    /* access modifiers changed from: private */
    public boolean dirty;
    @Entity
    private final int entity;
    private final Light light;
    private Vector3 localDirection;
    private Vector3 localPosition;
    @Nullable
    private Renderer renderer;
    @Nullable
    private TransformProvider transformProvider = null;

    /* renamed from: com.google.ar.sceneform.rendering.LightInstance$LightInstanceChangeListener */
    private class LightInstanceChangeListener implements Light.LightChangedListener {
        private LightInstanceChangeListener() {
        }

        /* renamed from: a */
        public void mo15954a() {
            boolean unused = LightInstance.this.dirty = true;
        }
    }

    LightInstance(Light light2, TransformProvider transformProvider2) {
        LightManager.Builder builder;
        LightManager.Builder spotLightCone;
        this.light = light2;
        this.transformProvider = transformProvider2;
        this.localPosition = light2.getLocalPosition();
        this.localDirection = light2.getLocalDirection();
        this.dirty = false;
        light2.addChangedListener(this.changeListener);
        this.entity = EntityManager.get().create();
        IEngine engine = EngineInstance.getEngine();
        if (light2.getType() == Light.Type.POINT) {
            spotLightCone = new LightManager.Builder(LightManager.Type.POINT).position(light2.getLocalPosition().f5202x, light2.getLocalPosition().f5203y, light2.getLocalPosition().f5204z).color(light2.getColor().f5213r, light2.getColor().f5212g, light2.getColor().f5211b).intensity(light2.getIntensity()).falloff(light2.getFalloffRadius());
        } else if (light2.getType() == Light.Type.DIRECTIONAL) {
            spotLightCone = new LightManager.Builder(LightManager.Type.DIRECTIONAL).direction(light2.getLocalDirection().f5202x, light2.getLocalDirection().f5203y, light2.getLocalDirection().f5204z).color(light2.getColor().f5213r, light2.getColor().f5212g, light2.getColor().f5211b).intensity(light2.getIntensity());
        } else {
            if (light2.getType() == Light.Type.SPOTLIGHT) {
                builder = new LightManager.Builder(LightManager.Type.SPOT);
            } else if (light2.getType() == Light.Type.FOCUSED_SPOTLIGHT) {
                builder = new LightManager.Builder(LightManager.Type.FOCUSED_SPOT);
            } else {
                throw new UnsupportedOperationException("Unsupported light type.");
            }
            spotLightCone = builder.position(light2.getLocalPosition().f5202x, light2.getLocalPosition().f5203y, light2.getLocalPosition().f5204z).direction(light2.getLocalDirection().f5202x, light2.getLocalDirection().f5203y, light2.getLocalDirection().f5204z).color(light2.getColor().f5213r, light2.getColor().f5212g, light2.getColor().f5211b).intensity(light2.getIntensity()).spotLightCone(Math.min(light2.getInnerConeAngle(), light2.getOuterConeAngle()), light2.getOuterConeAngle());
        }
        spotLightCone.castShadows(light2.isShadowCastingEnabled()).build(engine.getFilamentEngine(), this.entity);
    }

    private static boolean lightTypeRequiresDirection(Light.Type type) {
        return type == Light.Type.SPOTLIGHT || type == Light.Type.FOCUSED_SPOTLIGHT || type == Light.Type.DIRECTIONAL;
    }

    private static boolean lightTypeRequiresPosition(Light.Type type) {
        return type == Light.Type.POINT || type == Light.Type.SPOTLIGHT || type == Light.Type.FOCUSED_SPOTLIGHT;
    }

    private void updateProperties() {
        if (this.dirty) {
            this.dirty = false;
            LightManager lightManager = EngineInstance.getEngine().getLightManager();
            int instance = lightManager.getInstance(this.entity);
            this.localPosition = this.light.getLocalPosition();
            this.localDirection = this.light.getLocalDirection();
            if (this.transformProvider == null) {
                if (lightTypeRequiresPosition(this.light.getType())) {
                    Vector3 vector3 = this.localPosition;
                    lightManager.setPosition(instance, vector3.f5202x, vector3.f5203y, vector3.f5204z);
                }
                if (lightTypeRequiresDirection(this.light.getType())) {
                    Vector3 vector32 = this.localDirection;
                    lightManager.setDirection(instance, vector32.f5202x, vector32.f5203y, vector32.f5204z);
                }
            }
            lightManager.setColor(instance, this.light.getColor().f5213r, this.light.getColor().f5212g, this.light.getColor().f5211b);
            lightManager.setIntensity(instance, this.light.getIntensity());
            if (this.light.getType() == Light.Type.POINT) {
                lightManager.setFalloff(instance, this.light.getFalloffRadius());
            } else if (this.light.getType() == Light.Type.SPOTLIGHT || this.light.getType() == Light.Type.FOCUSED_SPOTLIGHT) {
                lightManager.setSpotLightCone(instance, Math.min(this.light.getInnerConeAngle(), this.light.getOuterConeAngle()), this.light.getOuterConeAngle());
            }
        }
    }

    public void attachToRenderer(Renderer renderer2) {
        renderer2.addLight(this);
        this.renderer = renderer2;
    }

    public void detachFromRenderer() {
        Renderer renderer2 = this.renderer;
        if (renderer2 != null) {
            renderer2.removeLight(this);
        }
    }

    /* renamed from: dispose */
    public void mo15955a() {
        AndroidPreconditions.checkUiThread();
        Light light2 = this.light;
        if (light2 != null) {
            light2.removeChangedListener(this.changeListener);
            this.changeListener = null;
        }
        IEngine engine = EngineInstance.getEngine();
        if (engine != null && engine.isValid()) {
            engine.getLightManager().destroy(this.entity);
            EntityManager.get().destroy(this.entity);
        }
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        try {
            ThreadPools.getMainExecutor().execute(new C2742d(this));
        } catch (Exception unused) {
        } catch (Throwable th) {
            super.finalize();
            throw th;
        }
        super.finalize();
    }

    /* access modifiers changed from: package-private */
    @Entity
    public int getEntity() {
        return this.entity;
    }

    public Light getLight() {
        return this.light;
    }

    public void updateTransform() {
        updateProperties();
        if (this.transformProvider != null) {
            LightManager lightManager = EngineInstance.getEngine().getLightManager();
            int instance = lightManager.getInstance(this.entity);
            Matrix worldModelMatrix = this.transformProvider.getWorldModelMatrix();
            if (lightTypeRequiresPosition(this.light.getType())) {
                Vector3 transformPoint = worldModelMatrix.transformPoint(this.localPosition);
                lightManager.setPosition(instance, transformPoint.f5202x, transformPoint.f5203y, transformPoint.f5204z);
            }
            if (lightTypeRequiresDirection(this.light.getType())) {
                Vector3 transformDirection = worldModelMatrix.transformDirection(this.localDirection);
                lightManager.setDirection(instance, transformDirection.f5202x, transformDirection.f5203y, transformDirection.f5204z);
            }
        }
    }
}
