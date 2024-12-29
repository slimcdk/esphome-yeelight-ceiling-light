package com.google.p107ar.sceneform.rendering;

import android.content.Context;
import android.net.Uri;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.android.filament.Material;
import com.google.android.filament.MaterialInstance;
import com.google.ar.sceneform.assets.ModelData;
import com.google.p107ar.sceneform.math.Vector3;
import com.google.p107ar.sceneform.utilities.AndroidPreconditions;
import com.google.p107ar.sceneform.utilities.LoadHelper;
import com.google.p107ar.sceneform.utilities.Preconditions;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.concurrent.Callable;
import java.util.concurrent.CompletableFuture;

@RequiresApi(api = 24)
/* renamed from: com.google.ar.sceneform.rendering.Material */
public class Material {
    /* access modifiers changed from: private */
    public static final String TAG = "Material";
    private final IMaterialInstance internalMaterialInstance;
    @Nullable
    private final MaterialInternalData materialData;
    private final MaterialParameters materialParameters;

    /* renamed from: com.google.ar.sceneform.rendering.Material$Builder */
    public static final class Builder {
        com.google.android.filament.Material existingMaterial;
        @Nullable
        private Callable<InputStream> inputStreamCreator;
        @Nullable
        private Object registryId;
        @Nullable
        ByteBuffer sourceBuffer;

        private Builder() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:14:0x001c, code lost:
            r1 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x001d, code lost:
            if (r2 != null) goto L_0x001f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
            r2.close();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0027, code lost:
            throw r1;
         */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        static /* synthetic */ java.nio.ByteBuffer m8296b(java.util.concurrent.Callable r2) {
            /*
                java.lang.Object r2 = r2.call()     // Catch:{ Exception -> 0x0028 }
                java.io.InputStream r2 = (java.io.InputStream) r2     // Catch:{ Exception -> 0x0028 }
                java.nio.ByteBuffer r0 = com.google.p107ar.sceneform.utilities.SceneformBufferUtils.readStream(r2)     // Catch:{ all -> 0x001a }
                if (r2 == 0) goto L_0x000f
                r2.close()     // Catch:{ Exception -> 0x0028 }
            L_0x000f:
                if (r0 == 0) goto L_0x0012
                return r0
            L_0x0012:
                java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
                java.lang.String r0 = "Unable to read data from input stream."
                r2.<init>(r0)
                throw r2
            L_0x001a:
                r0 = move-exception
                throw r0     // Catch:{ all -> 0x001c }
            L_0x001c:
                r1 = move-exception
                if (r2 == 0) goto L_0x0027
                r2.close()     // Catch:{ all -> 0x0023 }
                goto L_0x0027
            L_0x0023:
                r2 = move-exception
                r0.addSuppressed(r2)     // Catch:{ Exception -> 0x0028 }
            L_0x0027:
                throw r1     // Catch:{ Exception -> 0x0028 }
            L_0x0028:
                r2 = move-exception
                java.util.concurrent.CompletionException r0 = new java.util.concurrent.CompletionException
                r0.<init>(r2)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.p107ar.sceneform.rendering.Material.Builder.m8296b(java.util.concurrent.Callable):java.nio.ByteBuffer");
        }

        private void checkPreconditions() {
            AndroidPreconditions.checkUiThread();
            if (!hasSource().booleanValue()) {
                throw new AssertionError("Material must have a source.");
            }
        }

        private com.google.android.filament.Material createFilamentMaterial(ByteBuffer byteBuffer) {
            try {
                return new Material.Builder().payload(byteBuffer, byteBuffer.limit()).build(EngineInstance.getEngine().getFilamentEngine());
            } catch (Exception e) {
                throw new IllegalArgumentException("Unable to create material from source byte buffer.", e);
            }
        }

        private Boolean hasSource() {
            return Boolean.valueOf((this.inputStreamCreator == null && this.sourceBuffer == null && this.existingMaterial == null) ? false : true);
        }

        public CompletableFuture<Material> build() {
            CompletableFuture<Material> completableFuture;
            try {
                checkPreconditions();
                Object obj = this.registryId;
                if (obj != null && (completableFuture = ResourceManager.getInstance().getMaterialRegistry().get(obj)) != null) {
                    return completableFuture.thenApply(C2768p.f5352a);
                }
                ByteBuffer byteBuffer = this.sourceBuffer;
                if (byteBuffer != null) {
                    Material material = new Material(new C2765n0(createFilamentMaterial(byteBuffer)));
                    if (obj != null) {
                        ResourceManager.getInstance().getMaterialRegistry().register(obj, CompletableFuture.completedFuture(material));
                    }
                    CompletableFuture<Material> completedFuture = CompletableFuture.completedFuture(material.makeCopy());
                    String access$100 = Material.TAG;
                    String valueOf = String.valueOf(obj);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 37);
                    sb.append("Unable to load Material registryId='");
                    sb.append(valueOf);
                    sb.append("'");
                    C2759l0.m8369b(access$100, completedFuture, sb.toString());
                    return completedFuture;
                }
                com.google.android.filament.Material material2 = this.existingMaterial;
                if (material2 != null) {
                    Material material3 = new Material(new MaterialInternalDataGltfImpl(material2));
                    if (obj != null) {
                        ResourceManager.getInstance().getMaterialRegistry().register(obj, CompletableFuture.completedFuture(material3.makeCopy()));
                    }
                    CompletableFuture<Material> completedFuture2 = CompletableFuture.completedFuture(material3);
                    String access$1002 = Material.TAG;
                    String valueOf2 = String.valueOf(obj);
                    StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 37);
                    sb2.append("Unable to load Material registryId='");
                    sb2.append(valueOf2);
                    sb2.append("'");
                    C2759l0.m8369b(access$1002, completedFuture2, sb2.toString());
                    return completedFuture2;
                }
                Callable<InputStream> callable = this.inputStreamCreator;
                if (callable == null) {
                    CompletableFuture<Material> completableFuture2 = new CompletableFuture<>();
                    completableFuture2.completeExceptionally(new AssertionError("Input Stream Creator is null."));
                    return completableFuture2;
                }
                CompletableFuture thenApplyAsync = CompletableFuture.supplyAsync(new C2774t(callable), ThreadPools.getThreadPoolExecutor()).thenApplyAsync(new C2771q(this), ThreadPools.getMainExecutor());
                if (obj != null) {
                    ResourceManager.getInstance().getMaterialRegistry().register(obj, thenApplyAsync);
                }
                return thenApplyAsync.thenApply(C2773s.f5368a);
            } catch (Throwable th) {
                CompletableFuture<Material> completableFuture3 = new CompletableFuture<>();
                completableFuture3.completeExceptionally(th);
                String access$1003 = Material.TAG;
                String valueOf3 = String.valueOf(this.registryId);
                StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf3).length() + 37);
                sb3.append("Unable to load Material registryId='");
                sb3.append(valueOf3);
                sb3.append("'");
                C2759l0.m8369b(access$1003, completableFuture3, sb3.toString());
                return completableFuture3;
            }
        }

        /* renamed from: c */
        public /* synthetic */ Material mo16010c(ByteBuffer byteBuffer) {
            return new Material(new C2765n0(createFilamentMaterial(byteBuffer)));
        }

        public Builder setRegistryId(Object obj) {
            this.registryId = obj;
            return this;
        }

        public Builder setSource(Context context, int i) {
            this.registryId = context.getResources().getResourceName(i);
            this.inputStreamCreator = LoadHelper.fromResource(context, i);
            this.sourceBuffer = null;
            return this;
        }

        public Builder setSource(Context context, Uri uri) {
            Preconditions.checkNotNull(uri, "Parameter \"sourceUri\" was null.");
            this.registryId = uri;
            this.inputStreamCreator = LoadHelper.fromUri(context, uri);
            this.sourceBuffer = null;
            return this;
        }

        public Builder setSource(ByteBuffer byteBuffer) {
            Preconditions.checkNotNull(byteBuffer, "Parameter \"materialBuffer\" was null.");
            this.inputStreamCreator = null;
            this.sourceBuffer = byteBuffer;
            return this;
        }

        public Builder setSource(Callable<InputStream> callable) {
            Preconditions.checkNotNull(callable, "Parameter \"sourceInputStreamCallable\" was null.");
            this.inputStreamCreator = callable;
            this.sourceBuffer = null;
            return this;
        }
    }

    /* renamed from: com.google.ar.sceneform.rendering.Material$IMaterialInstance */
    interface IMaterialInstance {
        /* renamed from: a */
        MaterialInstance mo16016a();

        /* renamed from: b */
        void mo16017b();

        /* renamed from: c */
        boolean mo16018c();
    }

    /* renamed from: com.google.ar.sceneform.rendering.Material$a */
    private static final class C2702a implements Runnable {
        @Nullable

        /* renamed from: a */
        private final MaterialInternalData f5217a;
        @Nullable

        /* renamed from: b */
        private final IMaterialInstance f5218b;

        C2702a(@Nullable IMaterialInstance iMaterialInstance, @Nullable MaterialInternalData materialInternalData) {
            this.f5218b = iMaterialInstance;
            this.f5217a = materialInternalData;
        }

        public void run() {
            AndroidPreconditions.checkUiThread();
            IMaterialInstance iMaterialInstance = this.f5218b;
            if (iMaterialInstance != null) {
                iMaterialInstance.mo16017b();
            }
            MaterialInternalData materialInternalData = this.f5217a;
            if (materialInternalData != null) {
                materialInternalData.release();
            }
        }
    }

    /* renamed from: com.google.ar.sceneform.rendering.Material$b */
    static class C2703b implements IMaterialInstance {

        /* renamed from: a */
        MaterialInstance f5219a;

        /* renamed from: a */
        public MaterialInstance mo16016a() {
            return (MaterialInstance) Preconditions.checkNotNull(this.f5219a);
        }

        /* renamed from: b */
        public void mo16017b() {
        }

        /* renamed from: c */
        public boolean mo16018c() {
            return this.f5219a != null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo16020d(MaterialInstance materialInstance) {
            this.f5219a = materialInstance;
        }
    }

    /* renamed from: com.google.ar.sceneform.rendering.Material$c */
    static class C2704c implements IMaterialInstance {

        /* renamed from: a */
        final MaterialInstance f5220a;

        public C2704c(MaterialInstance materialInstance) {
            this.f5220a = materialInstance;
        }

        /* renamed from: a */
        public MaterialInstance mo16016a() {
            return this.f5220a;
        }

        /* renamed from: b */
        public void mo16017b() {
            IEngine engine = EngineInstance.getEngine();
            if (engine != null && engine.isValid()) {
                engine.destroyMaterialInstance(this.f5220a);
            }
        }

        /* renamed from: c */
        public boolean mo16018c() {
            return this.f5220a != null;
        }
    }

    private Material(Material material) {
        this(material.materialData);
        copyMaterialParameters(material.materialParameters);
    }

    private Material(MaterialInternalData materialInternalData) {
        this.materialParameters = new MaterialParameters();
        this.materialData = materialInternalData;
        materialInternalData.retain();
        this.internalMaterialInstance = materialInternalData instanceof C2765n0 ? new C2704c(materialInternalData.getFilamentMaterial().createInstance()) : new C2703b();
        ResourceManager.getInstance().getMaterialCleanupRegistry().register(this, new C2702a(this.internalMaterialInstance, materialInternalData));
    }

    public static Builder builder() {
        AndroidPreconditions.checkMinAndroidApiLevel();
        return new Builder();
    }

    private static native Object nGetMaterialParameters(long j, int i);

    /* access modifiers changed from: package-private */
    public void copyMaterialParameters(ModelData modelData, int i) {
        this.materialParameters.mo16024e((MaterialParameters) nGetMaterialParameters(modelData.getNativeHandle(), i));
    }

    /* access modifiers changed from: package-private */
    public void copyMaterialParameters(MaterialParameters materialParameters2) {
        this.materialParameters.mo16024e(materialParameters2);
        if (this.internalMaterialInstance.mo16018c()) {
            this.materialParameters.mo16023b(this.internalMaterialInstance.mo16016a());
        }
    }

    @Nullable
    public ExternalTexture getExternalTexture(String str) {
        return this.materialParameters.mo16025f(str);
    }

    /* access modifiers changed from: package-private */
    public MaterialInstance getFilamentMaterialInstance() {
        if (this.internalMaterialInstance.mo16018c()) {
            return this.internalMaterialInstance.mo16016a();
        }
        throw new AssertionError("Filament Material Instance is null.");
    }

    public Material makeCopy() {
        return new Material(this);
    }

    public void setBoolean(String str, boolean z) {
        this.materialParameters.setBoolean(str, z);
        if (this.internalMaterialInstance.mo16018c()) {
            this.materialParameters.mo16023b(this.internalMaterialInstance.mo16016a());
        }
    }

    public void setBoolean2(String str, boolean z, boolean z2) {
        this.materialParameters.setBoolean2(str, z, z2);
        if (this.internalMaterialInstance.mo16018c()) {
            this.materialParameters.mo16023b(this.internalMaterialInstance.mo16016a());
        }
    }

    public void setBoolean3(String str, boolean z, boolean z2, boolean z3) {
        this.materialParameters.setBoolean3(str, z, z2, z3);
        if (this.internalMaterialInstance.mo16018c()) {
            this.materialParameters.mo16023b(this.internalMaterialInstance.mo16016a());
        }
    }

    public void setBoolean4(String str, boolean z, boolean z2, boolean z3, boolean z4) {
        this.materialParameters.setBoolean4(str, z, z2, z3, z4);
        if (this.internalMaterialInstance.mo16018c()) {
            this.materialParameters.mo16023b(this.internalMaterialInstance.mo16016a());
        }
    }

    public void setExternalTexture(String str, ExternalTexture externalTexture) {
        this.materialParameters.mo16027h(str, externalTexture);
        if (this.internalMaterialInstance.mo16018c()) {
            this.materialParameters.mo16023b(this.internalMaterialInstance.mo16016a());
        }
    }

    public void setFloat(String str, float f) {
        this.materialParameters.setFloat(str, f);
        if (this.internalMaterialInstance.mo16018c()) {
            this.materialParameters.mo16023b(this.internalMaterialInstance.mo16016a());
        }
    }

    public void setFloat2(String str, float f, float f2) {
        this.materialParameters.setFloat2(str, f, f2);
        if (this.internalMaterialInstance.mo16018c()) {
            this.materialParameters.mo16023b(this.internalMaterialInstance.mo16016a());
        }
    }

    public void setFloat3(String str, float f, float f2, float f3) {
        this.materialParameters.setFloat3(str, f, f2, f3);
        if (this.internalMaterialInstance.mo16018c()) {
            this.materialParameters.mo16023b(this.internalMaterialInstance.mo16016a());
        }
    }

    public void setFloat3(String str, Vector3 vector3) {
        this.materialParameters.mo16028i(str, vector3);
        if (this.internalMaterialInstance.mo16018c()) {
            this.materialParameters.mo16023b(this.internalMaterialInstance.mo16016a());
        }
    }

    public void setFloat3(String str, Color color) {
        this.materialParameters.setFloat3(str, color.f5213r, color.f5212g, color.f5211b);
        if (this.internalMaterialInstance.mo16018c()) {
            this.materialParameters.mo16023b(this.internalMaterialInstance.mo16016a());
        }
    }

    public void setFloat4(String str, float f, float f2, float f3, float f4) {
        this.materialParameters.setFloat4(str, f, f2, f3, f4);
        if (this.internalMaterialInstance.mo16018c()) {
            this.materialParameters.mo16023b(this.internalMaterialInstance.mo16016a());
        }
    }

    public void setFloat4(String str, Color color) {
        this.materialParameters.setFloat4(str, color.f5213r, color.f5212g, color.f5211b, color.f5210a);
        if (this.internalMaterialInstance.mo16018c()) {
            this.materialParameters.mo16023b(this.internalMaterialInstance.mo16016a());
        }
    }

    public void setInt(String str, int i) {
        this.materialParameters.setInt(str, i);
        if (this.internalMaterialInstance.mo16018c()) {
            this.materialParameters.mo16023b(this.internalMaterialInstance.mo16016a());
        }
    }

    public void setInt2(String str, int i, int i2) {
        this.materialParameters.setInt2(str, i, i2);
        if (this.internalMaterialInstance.mo16018c()) {
            this.materialParameters.mo16023b(this.internalMaterialInstance.mo16016a());
        }
    }

    public void setInt3(String str, int i, int i2, int i3) {
        this.materialParameters.setInt3(str, i, i2, i3);
        if (this.internalMaterialInstance.mo16018c()) {
            this.materialParameters.mo16023b(this.internalMaterialInstance.mo16016a());
        }
    }

    public void setInt4(String str, int i, int i2, int i3, int i4) {
        this.materialParameters.setInt4(str, i, i2, i3, i4);
        if (this.internalMaterialInstance.mo16018c()) {
            this.materialParameters.mo16023b(this.internalMaterialInstance.mo16016a());
        }
    }

    public void setTexture(String str, Texture texture) {
        this.materialParameters.setTexture(str, texture);
        if (this.internalMaterialInstance.mo16018c()) {
            this.materialParameters.mo16023b(this.internalMaterialInstance.mo16016a());
        }
    }

    /* access modifiers changed from: package-private */
    public void updateGltfMaterialInstance(MaterialInstance materialInstance) {
        IMaterialInstance iMaterialInstance = this.internalMaterialInstance;
        if (iMaterialInstance instanceof C2703b) {
            ((C2703b) iMaterialInstance).mo16020d(materialInstance);
        }
    }
}
