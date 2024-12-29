package com.google.p017ar.sceneform.rendering;

import com.google.p017ar.core.Frame;
import com.google.p017ar.core.HitResult;
import com.google.p017ar.core.Plane;
import com.google.p017ar.core.Pose;
import com.google.p017ar.core.Trackable;
import com.google.p017ar.core.TrackingState;
import com.google.p017ar.sceneform.math.Vector3;
import com.google.p017ar.sceneform.rendering.Texture;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

/* renamed from: com.google.ar.sceneform.rendering.PlaneRenderer */
public class PlaneRenderer {
    private static final float BASE_UV_SCALE = 8.0f;
    private static final float DEFAULT_TEXTURE_HEIGHT = 513.0f;
    private static final float DEFAULT_TEXTURE_WIDTH = 293.0f;
    public static final String MATERIAL_COLOR = "color";
    private static final String MATERIAL_SPOTLIGHT_FOCUS_POINT = "focusPoint";
    public static final String MATERIAL_SPOTLIGHT_RADIUS = "radius";
    public static final String MATERIAL_TEXTURE = "texture";
    public static final String MATERIAL_UV_SCALE = "uvScale";
    private static final float SPOTLIGHT_RADIUS = 0.5f;
    private static final String TAG = "PlaneRenderer";
    private boolean isEnabled = true;
    private boolean isShadowReceiver = true;
    private boolean isVisible = true;
    private float lastPlaneHitDistance = 4.0f;
    private final Map<Plane, Material> materialOverrides = new HashMap();
    private CompletableFuture<Material> planeMaterialFuture;
    private final Renderer renderer;
    private Material shadowMaterial;
    private final Map<Plane, C2132f0> visualizerMap = new HashMap();

    public PlaneRenderer(Renderer renderer2) {
        this.renderer = renderer2;
        loadPlaneMaterial();
        loadShadowMaterial();
    }

    private Vector3 getFocusPoint(Frame frame, int i, int i2) {
        List<HitResult> hitTest = frame.hitTest((float) (i / 2), (float) (i2 / 2));
        if (hitTest != null && !hitTest.isEmpty()) {
            for (HitResult next : hitTest) {
                Trackable trackable = next.getTrackable();
                Pose hitPose = next.getHitPose();
                if ((trackable instanceof Plane) && ((Plane) trackable).isPoseInPolygon(hitPose)) {
                    Vector3 vector3 = new Vector3(hitPose.mo16574tx(), hitPose.mo16575ty(), hitPose.mo16576tz());
                    this.lastPlaneHitDistance = next.getDistance();
                    return vector3;
                }
            }
        }
        Pose pose = frame.getCamera().getPose();
        Vector3 vector32 = new Vector3(pose.mo16574tx(), pose.mo16575ty(), pose.mo16576tz());
        float[] zAxis = pose.getZAxis();
        return Vector3.add(vector32, new Vector3(zAxis[0], zAxis[1], zAxis[2]).scaled(-this.lastPlaneHitDistance));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Material lambda$loadPlaneMaterial$2(Material material, Texture texture) {
        material.setTexture("texture", texture);
        material.setFloat3("color", 1.0f, 1.0f, 1.0f);
        material.setFloat2(MATERIAL_UV_SCALE, BASE_UV_SCALE, 4.569201f);
        for (Map.Entry next : this.visualizerMap.entrySet()) {
            if (!this.materialOverrides.containsKey(next.getKey())) {
                ((C2132f0) next.getValue()).mo17717e(material);
            }
        }
        return material;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$loadShadowMaterial$0(Material material) {
        this.shadowMaterial = material;
        for (C2132f0 f : this.visualizerMap.values()) {
            f.mo17718f(this.shadowMaterial);
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Void lambda$loadShadowMaterial$1(Throwable th) {
        return null;
    }

    private void loadPlaneMaterial() {
        this.planeMaterialFuture = Material.builder().setSource(this.renderer.getContext(), C2108R.raw.sceneform_plane_material).build().thenCombine(Texture.builder().setSource(this.renderer.getContext(), C2108R.C2109drawable.sceneform_plane).setSampler(Texture.Sampler.builder().setMinMagFilter(Texture.Sampler.MagFilter.LINEAR).setWrapMode(Texture.Sampler.WrapMode.REPEAT).build()).build(), new C2126c0(this));
    }

    private void loadShadowMaterial() {
        Material.builder().setSource(this.renderer.getContext(), C2108R.raw.sceneform_plane_shadow_material).build().thenAccept(new C2128d0(this)).exceptionally(C2130e0.f3366a);
    }

    public CompletableFuture<Material> getMaterial() {
        return this.planeMaterialFuture;
    }

    public boolean isEnabled() {
        return this.isEnabled;
    }

    public boolean isShadowReceiver() {
        return this.isShadowReceiver;
    }

    public boolean isVisible() {
        return this.isVisible;
    }

    public void setEnabled(boolean z) {
        if (this.isEnabled != z) {
            this.isEnabled = z;
            for (C2132f0 d : this.visualizerMap.values()) {
                d.mo17716d(this.isEnabled);
            }
        }
    }

    public void setShadowReceiver(boolean z) {
        if (this.isShadowReceiver != z) {
            this.isShadowReceiver = z;
            for (C2132f0 g : this.visualizerMap.values()) {
                g.mo17719g(this.isShadowReceiver);
            }
        }
    }

    public void setVisible(boolean z) {
        if (this.isVisible != z) {
            this.isVisible = z;
            for (C2132f0 h : this.visualizerMap.values()) {
                h.mo17720h(this.isVisible);
            }
        }
    }

    public void update(Frame frame, int i, int i2) {
        C2132f0 f0Var;
        Collection<Plane> updatedTrackables = frame.getUpdatedTrackables(Plane.class);
        Vector3 focusPoint = getFocusPoint(frame, i, i2);
        Material now = this.planeMaterialFuture.getNow((Object) null);
        if (now != null) {
            now.setFloat3(MATERIAL_SPOTLIGHT_FOCUS_POINT, focusPoint);
            now.setFloat(MATERIAL_SPOTLIGHT_RADIUS, SPOTLIGHT_RADIUS);
        }
        for (Plane next : updatedTrackables) {
            if (this.visualizerMap.containsKey(next)) {
                f0Var = this.visualizerMap.get(next);
            } else {
                C2132f0 f0Var2 = new C2132f0(next, this.renderer);
                Material material = this.materialOverrides.get(next);
                if (material != null) {
                    f0Var2.mo17717e(material);
                } else if (now != null) {
                    f0Var2.mo17717e(now);
                }
                Material material2 = this.shadowMaterial;
                if (material2 != null) {
                    f0Var2.mo17718f(material2);
                }
                f0Var2.mo17719g(this.isShadowReceiver);
                f0Var2.mo17720h(this.isVisible);
                f0Var2.mo17716d(this.isEnabled);
                this.visualizerMap.put(next, f0Var2);
                f0Var = f0Var2;
            }
            f0Var.mo17721i();
        }
        Iterator<Map.Entry<Plane, C2132f0>> it = this.visualizerMap.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry next2 = it.next();
            Plane plane = (Plane) next2.getKey();
            C2132f0 f0Var3 = (C2132f0) next2.getValue();
            if (plane.getSubsumedBy() != null || plane.getTrackingState() == TrackingState.STOPPED) {
                f0Var3.mo17715b();
                it.remove();
            }
        }
    }
}
