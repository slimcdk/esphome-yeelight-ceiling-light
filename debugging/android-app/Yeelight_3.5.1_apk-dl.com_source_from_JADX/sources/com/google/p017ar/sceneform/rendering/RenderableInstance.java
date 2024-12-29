package com.google.p017ar.sceneform.rendering;

import androidx.annotation.Nullable;
import androidx.annotation.Size;
import com.google.android.filament.Entity;
import com.google.android.filament.EntityManager;
import com.google.android.filament.RenderableManager;
import com.google.android.filament.TransformManager;
import com.google.p017ar.sceneform.common.TransformProvider;
import com.google.p017ar.sceneform.math.Matrix;
import com.google.p017ar.sceneform.math.Vector3;
import com.google.p017ar.sceneform.utilities.AndroidPreconditions;
import com.google.p017ar.sceneform.utilities.ChangeId;
import com.google.p017ar.sceneform.utilities.Preconditions;
import java.nio.FloatBuffer;

/* renamed from: com.google.ar.sceneform.rendering.RenderableInstance */
public class RenderableInstance {
    private static final String TAG = "RenderableInstance";
    @Nullable
    private Renderer attachedRenderer;
    @Nullable
    private Matrix cachedRelativeTransform;
    @Nullable
    private Matrix cachedRelativeTransformInverse;
    @Entity
    private int childEntity = 0;
    @Entity
    private int entity = 0;
    private final Renderable renderable;
    int renderableId = 0;
    @Nullable
    private SkinningModifier skinningModifier;
    private final TransformProvider transformProvider;

    /* renamed from: com.google.ar.sceneform.rendering.RenderableInstance$SkinningModifier */
    public interface SkinningModifier {
        boolean isModifiedSinceLastRender();

        FloatBuffer modifyMaterialBoneTransformsBuffer(FloatBuffer floatBuffer);
    }

    /* renamed from: com.google.ar.sceneform.rendering.RenderableInstance$a */
    private static final class C2112a implements Runnable {

        /* renamed from: a */
        private final int f3339a;

        /* renamed from: b */
        private final int f3340b;

        C2112a(int i, int i2) {
            this.f3339a = i;
            this.f3340b = i2;
        }

        public void run() {
            AndroidPreconditions.checkUiThread();
            IEngine engine = EngineInstance.getEngine();
            if (engine != null && engine.isValid()) {
                RenderableManager renderableManager = engine.getRenderableManager();
                int i = this.f3339a;
                if (i != 0) {
                    renderableManager.destroy(i);
                }
                int i2 = this.f3340b;
                if (i2 != 0) {
                    renderableManager.destroy(i2);
                }
            }
        }
    }

    public RenderableInstance(TransformProvider transformProvider2, Renderable renderable2) {
        Preconditions.checkNotNull(transformProvider2, "Parameter \"transformProvider\" was null.");
        Preconditions.checkNotNull(renderable2, "Parameter \"renderable\" was null.");
        this.transformProvider = transformProvider2;
        this.renderable = renderable2;
        this.entity = createFilamentEntity(EngineInstance.getEngine());
        Matrix relativeTransform = getRelativeTransform();
        if (relativeTransform != null) {
            this.childEntity = createFilamentChildEntity(EngineInstance.getEngine(), this.entity, relativeTransform);
        }
        createGltfModelInstance();
        ResourceManager.getInstance().getRenderableInstanceCleanupRegistry().register(this, new C2112a(this.entity, this.childEntity));
    }

    @Entity
    private static int createFilamentChildEntity(IEngine iEngine, @Entity int i, Matrix matrix) {
        int create = EntityManager.get().create();
        TransformManager transformManager = iEngine.getTransformManager();
        transformManager.create(create, transformManager.getInstance(i), matrix.data);
        return create;
    }

    @Entity
    private static int createFilamentEntity(IEngine iEngine) {
        int create = EntityManager.get().create();
        iEngine.getTransformManager().create(create);
        return create;
    }

    private void updateSkinning(boolean z) {
        SkinningModifier skinningModifier2;
        Renderable renderable2 = this.renderable;
        if (renderable2 instanceof ModelRenderable) {
            ModelRenderable modelRenderable = (ModelRenderable) renderable2;
            SkeletonRig skeletonRig = getSkeletonRig();
            if (skeletonRig != null) {
                if (z || skeletonRig.isAnimating(modelRenderable) || ((skinningModifier2 = this.skinningModifier) != null && skinningModifier2.isModifiedSinceLastRender())) {
                    int materialBoneCount = skeletonRig.getMaterialBoneCount();
                    RenderableManager renderableManager = EngineInstance.getEngine().getRenderableManager();
                    int instance = renderableManager.getInstance(getRenderedEntity());
                    FloatBuffer materialBoneTransformsBuffer = skeletonRig.getMaterialBoneTransformsBuffer();
                    SkinningModifier skinningModifier3 = this.skinningModifier;
                    if (skinningModifier3 != null) {
                        materialBoneTransformsBuffer = skinningModifier3.modifyMaterialBoneTransformsBuffer(materialBoneTransformsBuffer);
                    }
                    renderableManager.setBonesAsMatrices(instance, materialBoneTransformsBuffer, materialBoneCount, 0);
                }
            }
        }
    }

    public void attachToRenderer(Renderer renderer) {
        renderer.addInstance(this);
        this.attachedRenderer = renderer;
        this.renderable.attachToRenderer(renderer);
    }

    /* access modifiers changed from: package-private */
    public void createGltfModelInstance() {
    }

    public void detachFromRenderer() {
        Renderer renderer = this.attachedRenderer;
        if (renderer != null) {
            renderer.removeInstance(this);
            this.renderable.detatchFromRenderer();
        }
    }

    @Entity
    public int getEntity() {
        return this.entity;
    }

    @Nullable
    public Matrix getRelativeTransform() {
        Matrix matrix = this.cachedRelativeTransform;
        if (matrix != null) {
            return matrix;
        }
        IRenderableInternalData renderableData = this.renderable.getRenderableData();
        float a = renderableData.mo17357a();
        Vector3 c = renderableData.mo17359c();
        if (a == 1.0f && Vector3.equals(c, Vector3.zero())) {
            return null;
        }
        Matrix matrix2 = new Matrix();
        this.cachedRelativeTransform = matrix2;
        matrix2.makeScale(a);
        this.cachedRelativeTransform.setTranslation(c);
        return this.cachedRelativeTransform;
    }

    @Nullable
    public Matrix getRelativeTransformInverse() {
        Matrix matrix = this.cachedRelativeTransformInverse;
        if (matrix != null) {
            return matrix;
        }
        Matrix relativeTransform = getRelativeTransform();
        if (relativeTransform == null) {
            return null;
        }
        Matrix matrix2 = new Matrix();
        this.cachedRelativeTransformInverse = matrix2;
        Matrix.invert(relativeTransform, matrix2);
        return this.cachedRelativeTransformInverse;
    }

    public Renderable getRenderable() {
        return this.renderable;
    }

    @Entity
    public int getRenderedEntity() {
        int i = this.childEntity;
        return i == 0 ? this.entity : i;
    }

    @Nullable
    public SkeletonRig getSkeletonRig() {
        Renderable renderable2 = this.renderable;
        if (renderable2 instanceof ModelRenderable) {
            return ((ModelRenderable) renderable2).getSkeletonRig();
        }
        return null;
    }

    public Matrix getWorldModelMatrix() {
        return this.renderable.getFinalModelMatrix(this.transformProvider.getWorldModelMatrix());
    }

    public void prepareForDraw() {
        boolean z;
        this.renderable.prepareForDraw();
        ChangeId id = this.renderable.getId();
        if (id.checkChanged(this.renderableId)) {
            this.renderable.getRenderableData().mo17379w(this.renderable, getSkeletonRig(), getRenderedEntity());
            this.renderableId = id.get();
            z = true;
        } else {
            z = false;
        }
        updateSkinning(z);
    }

    /* access modifiers changed from: package-private */
    public void setBlendOrderAt(int i, int i2) {
        RenderableManager renderableManager = EngineInstance.getEngine().getRenderableManager();
        renderableManager.setBlendOrderAt(renderableManager.getInstance(getRenderedEntity()), i, i2);
    }

    /* access modifiers changed from: package-private */
    public void setModelMatrix(TransformManager transformManager, @Size(min = 16) float[] fArr) {
        transformManager.setTransform(transformManager.getInstance(this.entity), fArr);
    }

    public void setSkinningModifier(@Nullable SkinningModifier skinningModifier2) {
        this.skinningModifier = skinningModifier2;
    }
}
