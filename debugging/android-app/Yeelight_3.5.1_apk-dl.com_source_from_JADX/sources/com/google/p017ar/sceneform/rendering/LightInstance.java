package com.google.p017ar.sceneform.rendering;

import androidx.annotation.Nullable;
import com.google.android.filament.Entity;
import com.google.android.filament.EntityManager;
import com.google.android.filament.LightManager;
import com.google.p017ar.sceneform.common.TransformProvider;
import com.google.p017ar.sceneform.math.Matrix;
import com.google.p017ar.sceneform.math.Vector3;
import com.google.p017ar.sceneform.rendering.Light;
import com.google.p017ar.sceneform.utilities.AndroidPreconditions;

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
        public void mo17406a() {
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
        int create = EntityManager.get().create();
        this.entity = create;
        IEngine engine = EngineInstance.getEngine();
        if (light2.getType() == Light.Type.POINT) {
            spotLightCone = new LightManager.Builder(LightManager.Type.POINT).position(light2.getLocalPosition().f3277x, light2.getLocalPosition().f3278y, light2.getLocalPosition().f3279z).color(light2.getColor().f3288r, light2.getColor().f3287g, light2.getColor().f3286b).intensity(light2.getIntensity()).falloff(light2.getFalloffRadius());
        } else if (light2.getType() == Light.Type.DIRECTIONAL) {
            spotLightCone = new LightManager.Builder(LightManager.Type.DIRECTIONAL).direction(light2.getLocalDirection().f3277x, light2.getLocalDirection().f3278y, light2.getLocalDirection().f3279z).color(light2.getColor().f3288r, light2.getColor().f3287g, light2.getColor().f3286b).intensity(light2.getIntensity());
        } else {
            if (light2.getType() == Light.Type.SPOTLIGHT) {
                builder = new LightManager.Builder(LightManager.Type.SPOT);
            } else if (light2.getType() == Light.Type.FOCUSED_SPOTLIGHT) {
                builder = new LightManager.Builder(LightManager.Type.FOCUSED_SPOT);
            } else {
                throw new UnsupportedOperationException("Unsupported light type.");
            }
            spotLightCone = builder.position(light2.getLocalPosition().f3277x, light2.getLocalPosition().f3278y, light2.getLocalPosition().f3279z).direction(light2.getLocalDirection().f3277x, light2.getLocalDirection().f3278y, light2.getLocalDirection().f3279z).color(light2.getColor().f3288r, light2.getColor().f3287g, light2.getColor().f3286b).intensity(light2.getIntensity()).spotLightCone(Math.min(light2.getInnerConeAngle(), light2.getOuterConeAngle()), light2.getOuterConeAngle());
        }
        spotLightCone.castShadows(light2.isShadowCastingEnabled()).build(engine.getFilamentEngine(), create);
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
                    lightManager.setPosition(instance, vector3.f3277x, vector3.f3278y, vector3.f3279z);
                }
                if (lightTypeRequiresDirection(this.light.getType())) {
                    Vector3 vector32 = this.localDirection;
                    lightManager.setDirection(instance, vector32.f3277x, vector32.f3278y, vector32.f3279z);
                }
            }
            lightManager.setColor(instance, this.light.getColor().f3288r, this.light.getColor().f3287g, this.light.getColor().f3286b);
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
    public void lambda$finalize$0() {
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
            ThreadPools.getMainExecutor().execute(new C2131f(this));
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
                lightManager.setPosition(instance, transformPoint.f3277x, transformPoint.f3278y, transformPoint.f3279z);
            }
            if (lightTypeRequiresDirection(this.light.getType())) {
                Vector3 transformDirection = worldModelMatrix.transformDirection(this.localDirection);
                lightManager.setDirection(instance, transformDirection.f3277x, transformDirection.f3278y, transformDirection.f3279z);
            }
        }
    }
}
