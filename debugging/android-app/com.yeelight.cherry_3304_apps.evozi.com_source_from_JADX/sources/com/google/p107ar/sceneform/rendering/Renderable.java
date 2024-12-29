package com.google.p107ar.sceneform.rendering;

import android.content.Context;
import android.net.Uri;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.p107ar.sceneform.collision.Box;
import com.google.p107ar.sceneform.collision.CollisionShape;
import com.google.p107ar.sceneform.common.TransformProvider;
import com.google.p107ar.sceneform.math.Matrix;
import com.google.p107ar.sceneform.resources.ResourceRegistry;
import com.google.p107ar.sceneform.utilities.AndroidPreconditions;
import com.google.p107ar.sceneform.utilities.ChangeId;
import com.google.p107ar.sceneform.utilities.LoadHelper;
import com.google.p107ar.sceneform.utilities.Preconditions;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

/* renamed from: com.google.ar.sceneform.rendering.Renderable */
public abstract class Renderable {
    /* access modifiers changed from: private */
    public static final long DEFAULT_MAX_STALE_CACHE = TimeUnit.DAYS.toSeconds(14);
    public static final int RENDER_PRIORITY_DEFAULT = 4;
    public static final int RENDER_PRIORITY_FIRST = 0;
    public static final int RENDER_PRIORITY_LAST = 7;
    private final ChangeId changeId;
    @Nullable
    protected CollisionShape collisionShape;
    private boolean isShadowCaster;
    private boolean isShadowReceiver;
    private final ArrayList<Material> materialBindings;
    private final ArrayList<String> materialNames;
    private int renderPriority;
    private final IRenderableInternalData renderableData;

    /* renamed from: com.google.ar.sceneform.rendering.Renderable$Builder */
    static abstract class Builder<T extends Renderable, B extends Builder<T, B>> {
        @Nullable
        protected Context context = null;
        /* access modifiers changed from: private */
        @Nullable
        public RenderableDefinition definition = null;
        @Nullable
        private Callable<InputStream> inputStreamCreator = null;
        /* access modifiers changed from: private */
        public boolean isGltf = false;
        @Nullable
        private LoadGltfListener loadGltfListener;
        @Nullable
        private byte[] materialsBytes = null;
        @Nullable
        protected Object registryId = null;
        @Nullable
        private Uri sourceUri = null;
        @Nullable
        private Function<String, Uri> uriResolver = null;

        protected Builder() {
        }

        private CompletableFuture<T> loadRenderableFromGltf(@NonNull Context context2, T t, @Nullable byte[] bArr) {
            return null;
        }

        private void setCachingEnabled(Context context2) {
        }

        private B setRemoteSourceHelper(Context context2, Uri uri, boolean z) {
            String str;
            Preconditions.checkNotNull(uri);
            this.sourceUri = uri;
            this.context = context2;
            this.registryId = uri;
            if (z) {
                setCachingEnabled(context2);
            }
            HashMap hashMap = new HashMap();
            if (!z) {
                str = "no-cache";
            } else {
                long access$200 = Renderable.DEFAULT_MAX_STALE_CACHE;
                StringBuilder sb = new StringBuilder(30);
                sb.append("max-stale=");
                sb.append(access$200);
                str = sb.toString();
            }
            hashMap.put("Cache-Control", str);
            this.inputStreamCreator = LoadHelper.fromUri(context2, (Uri) Preconditions.checkNotNull(this.sourceUri), hashMap);
            return getSelf();
        }

        /* renamed from: a */
        public /* synthetic */ Renderable mo16108a(Renderable renderable) {
            return (Renderable) getRenderableClass().cast(renderable.makeCopy());
        }

        /* renamed from: b */
        public /* synthetic */ Renderable mo16109b(Renderable renderable) {
            return (Renderable) getRenderableClass().cast(renderable.makeCopy());
        }

        public CompletableFuture<T> build() {
            CompletableFuture<T> completableFuture;
            Function b0Var;
            try {
                checkPreconditions();
                Object obj = this.registryId;
                if (obj == null || (completableFuture = getRenderableRegistry().get(obj)) == null) {
                    Renderable makeRenderable = makeRenderable();
                    if (this.definition != null) {
                        return CompletableFuture.completedFuture(makeRenderable);
                    }
                    Callable<InputStream> callable = this.inputStreamCreator;
                    if (callable == null) {
                        CompletableFuture<T> completableFuture2 = new CompletableFuture<>();
                        completableFuture2.completeExceptionally(new AssertionError("Input Stream Creator is null."));
                        String simpleName = getRenderableClass().getSimpleName();
                        String valueOf = String.valueOf(obj);
                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 39);
                        sb.append("Unable to load Renderable registryId='");
                        sb.append(valueOf);
                        sb.append("'");
                        C2759l0.m8369b(simpleName, completableFuture2, sb.toString());
                        return completableFuture2;
                    }
                    if (this.isGltf) {
                        Context context2 = this.context;
                        if (context2 != null) {
                            completableFuture = loadRenderableFromGltf(context2, makeRenderable, this.materialsBytes);
                        } else {
                            throw new AssertionError("Gltf Renderable.Builder must have a valid context.");
                        }
                    } else {
                        completableFuture = new C2761m0(makeRenderable, this.sourceUri).mo16289d(callable);
                    }
                    if (obj != null) {
                        getRenderableRegistry().register(obj, completableFuture);
                    }
                    String simpleName2 = getRenderableClass().getSimpleName();
                    String valueOf2 = String.valueOf(obj);
                    StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 39);
                    sb2.append("Unable to load Renderable registryId='");
                    sb2.append(valueOf2);
                    sb2.append("'");
                    C2759l0.m8369b(simpleName2, completableFuture, sb2.toString());
                    b0Var = new C2739b0(this);
                } else {
                    b0Var = new C2741c0(this);
                }
                return completableFuture.thenApply(b0Var);
            } catch (Throwable th) {
                CompletableFuture<T> completableFuture3 = new CompletableFuture<>();
                completableFuture3.completeExceptionally(th);
                String simpleName3 = getRenderableClass().getSimpleName();
                String valueOf3 = String.valueOf(this.registryId);
                StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf3).length() + 39);
                sb3.append("Unable to load Renderable registryId='");
                sb3.append(valueOf3);
                sb3.append("'");
                C2759l0.m8369b(simpleName3, completableFuture3, sb3.toString());
                return completableFuture3;
            }
        }

        /* access modifiers changed from: protected */
        public void checkPreconditions() {
            AndroidPreconditions.checkUiThread();
            if (!hasSource().booleanValue()) {
                throw new AssertionError("ModelRenderable must have a source.");
            }
        }

        /* access modifiers changed from: protected */
        public abstract Class<T> getRenderableClass();

        /* access modifiers changed from: protected */
        public abstract ResourceRegistry<T> getRenderableRegistry();

        /* access modifiers changed from: protected */
        public abstract B getSelf();

        public Boolean hasSource() {
            return Boolean.valueOf((this.sourceUri == null && this.inputStreamCreator == null && this.definition == null) ? false : true);
        }

        /* access modifiers changed from: protected */
        public abstract T makeRenderable();

        public B setRegistryId(@Nullable Object obj) {
            this.registryId = obj;
            return getSelf();
        }

        public B setSource(Context context2, int i) {
            this.inputStreamCreator = LoadHelper.fromResource(context2, i);
            this.context = context2;
            Uri resourceToUri = LoadHelper.resourceToUri(context2, i);
            this.sourceUri = resourceToUri;
            this.registryId = resourceToUri;
            return getSelf();
        }

        public B setSource(Context context2, Uri uri) {
            return setRemoteSourceHelper(context2, uri, true);
        }

        public B setSource(Context context2, Uri uri, boolean z) {
            return null;
        }

        public B setSource(Context context2, Callable<InputStream> callable) {
            Preconditions.checkNotNull(callable);
            this.sourceUri = null;
            this.inputStreamCreator = callable;
            this.context = context2;
            return getSelf();
        }

        public B setSource(RenderableDefinition renderableDefinition) {
            this.definition = renderableDefinition;
            this.registryId = null;
            this.sourceUri = null;
            return getSelf();
        }
    }

    protected Renderable(Builder<? extends Renderable, ? extends Builder<?, ?>> builder) {
        this.materialBindings = new ArrayList<>();
        this.materialNames = new ArrayList<>();
        this.renderPriority = 4;
        this.isShadowCaster = true;
        this.isShadowReceiver = true;
        this.changeId = new ChangeId();
        Preconditions.checkNotNull(builder, "Parameter \"builder\" was null.");
        this.renderableData = builder.isGltf ? createRenderableInternalGltfData() : new C2769p0();
        if (builder.definition != null) {
            updateFromDefinition(builder.definition);
        }
    }

    protected Renderable(Renderable renderable) {
        this.materialBindings = new ArrayList<>();
        this.materialNames = new ArrayList<>();
        this.renderPriority = 4;
        boolean z = true;
        this.isShadowCaster = true;
        this.isShadowReceiver = true;
        this.changeId = new ChangeId();
        if (!renderable.getId().isEmpty()) {
            this.renderableData = renderable.renderableData;
            Preconditions.checkState(renderable.materialNames.size() != renderable.materialBindings.size() ? false : z);
            for (int i = 0; i < renderable.materialBindings.size(); i++) {
                this.materialBindings.add(renderable.materialBindings.get(i).makeCopy());
                this.materialNames.add(renderable.materialNames.get(i));
            }
            this.renderPriority = renderable.renderPriority;
            this.isShadowCaster = renderable.isShadowCaster;
            this.isShadowReceiver = renderable.isShadowReceiver;
            CollisionShape collisionShape2 = renderable.collisionShape;
            if (collisionShape2 != null) {
                this.collisionShape = collisionShape2.makeCopy();
            }
            this.changeId.update();
            return;
        }
        throw new AssertionError("Cannot copy uninitialized Renderable.");
    }

    private IRenderableInternalData createRenderableInternalGltfData() {
        return null;
    }

    private IllegalArgumentException makeSubmeshOutOfRangeException(int i) {
        int submeshCount = getSubmeshCount();
        StringBuilder sb = new StringBuilder(96);
        sb.append("submeshIndex (");
        sb.append(i);
        sb.append(") is out of range. It must be less than the submeshCount (");
        sb.append(submeshCount);
        sb.append(").");
        return new IllegalArgumentException(sb.toString());
    }

    /* access modifiers changed from: package-private */
    public void attachToRenderer(Renderer renderer) {
    }

    public RenderableInstance createInstance(TransformProvider transformProvider) {
        return new RenderableInstance(transformProvider, this);
    }

    /* access modifiers changed from: package-private */
    public void detatchFromRenderer() {
    }

    @Nullable
    public CollisionShape getCollisionShape() {
        return this.collisionShape;
    }

    public Matrix getFinalModelMatrix(Matrix matrix) {
        Preconditions.checkNotNull(matrix, "Parameter \"originalMatrix\" was null.");
        return matrix;
    }

    public ChangeId getId() {
        return this.changeId;
    }

    public Material getMaterial() {
        return getMaterial(0);
    }

    public Material getMaterial(int i) {
        if (i < this.materialBindings.size()) {
            return this.materialBindings.get(i);
        }
        throw makeSubmeshOutOfRangeException(i);
    }

    /* access modifiers changed from: package-private */
    public ArrayList<Material> getMaterialBindings() {
        return this.materialBindings;
    }

    /* access modifiers changed from: package-private */
    public ArrayList<String> getMaterialNames() {
        return this.materialNames;
    }

    public int getRenderPriority() {
        return this.renderPriority;
    }

    /* access modifiers changed from: package-private */
    public IRenderableInternalData getRenderableData() {
        return this.renderableData;
    }

    public int getSubmeshCount() {
        return this.renderableData.mo15925u().size();
    }

    public String getSubmeshName(int i) {
        Preconditions.checkState(this.materialNames.size() == this.materialBindings.size());
        if (i >= 0 && i < this.materialNames.size()) {
            return this.materialNames.get(i);
        }
        throw makeSubmeshOutOfRangeException(i);
    }

    public boolean isShadowCaster() {
        return this.isShadowCaster;
    }

    public boolean isShadowReceiver() {
        return this.isShadowReceiver;
    }

    public abstract Renderable makeCopy();

    /* access modifiers changed from: package-private */
    public void prepareForDraw() {
    }

    public void setCollisionShape(@Nullable CollisionShape collisionShape2) {
        this.collisionShape = collisionShape2;
        this.changeId.update();
    }

    public void setMaterial(int i, Material material) {
        if (i < this.materialBindings.size()) {
            this.materialBindings.set(i, material);
            this.changeId.update();
            return;
        }
        throw makeSubmeshOutOfRangeException(i);
    }

    public void setMaterial(Material material) {
        setMaterial(0, material);
    }

    public void setRenderPriority(@IntRange(from = 0, mo617to = 7) int i) {
        this.renderPriority = Math.min(7, Math.max(0, i));
        this.changeId.update();
    }

    public void setShadowCaster(boolean z) {
        this.isShadowCaster = z;
        this.changeId.update();
    }

    public void setShadowReceiver(boolean z) {
        this.isShadowReceiver = z;
        this.changeId.update();
    }

    public void updateFromDefinition(RenderableDefinition renderableDefinition) {
        Preconditions.checkState(!renderableDefinition.getSubmeshes().isEmpty());
        this.changeId.update();
        renderableDefinition.applyDefinitionToData(this.renderableData, this.materialBindings, this.materialNames);
        this.collisionShape = new Box(this.renderableData.mo15924t(), this.renderableData.mo15909e());
    }
}
