package com.google.p107ar.sceneform.rendering;

import com.google.p107ar.core.Frame;
import com.google.p107ar.core.HitResult;
import com.google.p107ar.core.Plane;
import com.google.p107ar.core.Pose;
import com.google.p107ar.core.Trackable;
import com.google.p107ar.core.TrackingState;
import com.google.p107ar.sceneform.math.Vector3;
import com.google.p107ar.sceneform.rendering.Texture;
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
    private final Map<Plane, C2767o0> visualizerMap = new HashMap();

    public PlaneRenderer(Renderer renderer2) {
        this.renderer = renderer2;
        loadPlaneMaterial();
        loadShadowMaterial();
    }

    /* renamed from: c */
    static /* synthetic */ Void m8342c(Throwable th) {
        return null;
    }

    private Vector3 getFocusPoint(Frame frame, int i, int i2) {
        List<HitResult> hitTest = frame.hitTest((float) (i / 2), (float) (i2 / 2));
        if (hitTest != null && !hitTest.isEmpty()) {
            for (HitResult next : hitTest) {
                Trackable trackable = next.getTrackable();
                Pose hitPose = next.getHitPose();
                if ((trackable instanceof Plane) && ((Plane) trackable).isPoseInPolygon(hitPose)) {
                    Vector3 vector3 = new Vector3(hitPose.mo15124tx(), hitPose.mo15125ty(), hitPose.mo15126tz());
                    this.lastPlaneHitDistance = next.getDistance();
                    return vector3;
                }
            }
        }
        Pose pose = frame.getCamera().getPose();
        Vector3 vector32 = new Vector3(pose.mo15124tx(), pose.mo15125ty(), pose.mo15126tz());
        float[] zAxis = pose.getZAxis();
        return Vector3.add(vector32, new Vector3(zAxis[0], zAxis[1], zAxis[2]).scaled(-this.lastPlaneHitDistance));
    }

    private void loadPlaneMaterial() {
        this.planeMaterialFuture = Material.builder().setSource(this.renderer.getContext(), C2722R.raw.sceneform_plane_material).build().thenCombine(Texture.builder().setSource(this.renderer.getContext(), C2722R.C2723drawable.sceneform_plane).setSampler(Texture.Sampler.builder().setMinMagFilter(Texture.Sampler.MagFilter.LINEAR).setWrapMode(Texture.Sampler.WrapMode.REPEAT).build()).build(), new C2779y(this));
    }

    private void loadShadowMaterial() {
        Material.builder().setSource(this.renderer.getContext(), C2722R.raw.sceneform_plane_shadow_material).build().thenAccept(new C2737a0(this)).exceptionally(C2780z.f5375a);
    }

    /* renamed from: a */
    public /* synthetic */ Material mo16062a(Material material, Texture texture) {
        material.setTexture("texture", texture);
        material.setFloat3("color", 1.0f, 1.0f, 1.0f);
        material.setFloat2(MATERIAL_UV_SCALE, BASE_UV_SCALE, 4.569201f);
        for (Map.Entry next : this.visualizerMap.entrySet()) {
            if (!this.materialOverrides.containsKey(next.getKey())) {
                ((C2767o0) next.getValue()).mo16297e(material);
            }
        }
        return material;
    }

    /* renamed from: b */
    public /* synthetic */ void mo16063b(Material material) {
        this.shadowMaterial = material;
        for (C2767o0 f : this.visualizerMap.values()) {
            f.mo16298f(this.shadowMaterial);
        }
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
            for (C2767o0 d : this.visualizerMap.values()) {
                d.mo16296d(this.isEnabled);
            }
        }
    }

    public void setShadowReceiver(boolean z) {
        if (this.isShadowReceiver != z) {
            this.isShadowReceiver = z;
            for (C2767o0 g : this.visualizerMap.values()) {
                g.mo16299g(this.isShadowReceiver);
            }
        }
    }

    public void setVisible(boolean z) {
        if (this.isVisible != z) {
            this.isVisible = z;
            for (C2767o0 h : this.visualizerMap.values()) {
                h.mo16300h(this.isVisible);
            }
        }
    }

    public void update(Frame frame, int i, int i2) {
        C2767o0 o0Var;
        Collection<Plane> updatedTrackables = frame.getUpdatedTrackables(Plane.class);
        Vector3 focusPoint = getFocusPoint(frame, i, i2);
        Material now = this.planeMaterialFuture.getNow((Object) null);
        if (now != null) {
            now.setFloat3(MATERIAL_SPOTLIGHT_FOCUS_POINT, focusPoint);
            now.setFloat(MATERIAL_SPOTLIGHT_RADIUS, SPOTLIGHT_RADIUS);
        }
        for (Plane next : updatedTrackables) {
            if (this.visualizerMap.containsKey(next)) {
                o0Var = this.visualizerMap.get(next);
            } else {
                C2767o0 o0Var2 = new C2767o0(next, this.renderer);
                Material material = this.materialOverrides.get(next);
                if (material != null) {
                    o0Var2.mo16297e(material);
                } else if (now != null) {
                    o0Var2.mo16297e(now);
                }
                Material material2 = this.shadowMaterial;
                if (material2 != null) {
                    o0Var2.mo16298f(material2);
                }
                o0Var2.mo16299g(this.isShadowReceiver);
                o0Var2.mo16300h(this.isVisible);
                o0Var2.mo16296d(this.isEnabled);
                this.visualizerMap.put(next, o0Var2);
                o0Var = o0Var2;
            }
            o0Var.mo16301i();
        }
        Iterator<Map.Entry<Plane, C2767o0>> it = this.visualizerMap.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry next2 = it.next();
            Plane plane = (Plane) next2.getKey();
            C2767o0 o0Var3 = (C2767o0) next2.getValue();
            if (plane.getSubsumedBy() != null || plane.getTrackingState() == TrackingState.STOPPED) {
                o0Var3.mo16295b();
                it.remove();
            }
        }
    }
}
