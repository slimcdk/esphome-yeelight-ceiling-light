package com.google.p017ar.sceneform.rendering;

import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.p017ar.sceneform.rendering.Renderable;
import com.google.p017ar.sceneform.resources.ResourceRegistry;
import com.google.p017ar.sceneform.utilities.AndroidPreconditions;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CompletableFuture;

@RequiresApi(api = 24)
/* renamed from: com.google.ar.sceneform.rendering.ModelRenderable */
public class ModelRenderable extends Renderable {
    @Nullable
    private ArrayList<AnimationData> animationData;
    @Nullable
    private SkeletonRig skeletonRig;

    /* renamed from: com.google.ar.sceneform.rendering.ModelRenderable$Builder */
    public static final class Builder extends Renderable.Builder<ModelRenderable, Builder> {
        public /* bridge */ /* synthetic */ CompletableFuture build() {
            return super.build();
        }

        /* access modifiers changed from: protected */
        public Class<ModelRenderable> getRenderableClass() {
            return ModelRenderable.class;
        }

        /* access modifiers changed from: protected */
        public ResourceRegistry<ModelRenderable> getRenderableRegistry() {
            return ResourceManager.getInstance().getModelRenderableRegistry();
        }

        /* access modifiers changed from: protected */
        public Builder getSelf() {
            return this;
        }

        public /* bridge */ /* synthetic */ Boolean hasSource() {
            return super.hasSource();
        }

        /* access modifiers changed from: protected */
        public ModelRenderable makeRenderable() {
            return new ModelRenderable(this);
        }
    }

    private ModelRenderable(Builder builder) {
        super((Renderable.Builder<? extends Renderable, ? extends Renderable.Builder<?, ?>>) builder);
        this.animationData = null;
    }

    private ModelRenderable(ModelRenderable modelRenderable) {
        super((Renderable) modelRenderable);
        this.animationData = null;
        copyAnimationFrom(modelRenderable);
    }

    public static Builder builder() {
        AndroidPreconditions.checkMinAndroidApiLevel();
        return new Builder();
    }

    private void copyAnimationFrom(ModelRenderable modelRenderable) {
        SkeletonRig skeletonRig2 = modelRenderable.skeletonRig;
        if (skeletonRig2 != null) {
            this.skeletonRig = skeletonRig2.makeCopy();
        }
        if (modelRenderable.animationData != null) {
            this.animationData = new ArrayList<>(modelRenderable.animationData);
        }
    }

    public AnimationData getAnimationData(int i) {
        ArrayList<AnimationData> arrayList = this.animationData;
        if (arrayList != null) {
            return arrayList.get(i);
        }
        throw new IndexOutOfBoundsException();
    }

    @Nullable
    public AnimationData getAnimationData(String str) {
        ArrayList<AnimationData> arrayList = this.animationData;
        if (arrayList == null) {
            return null;
        }
        Iterator<AnimationData> it = arrayList.iterator();
        while (it.hasNext()) {
            AnimationData next = it.next();
            if (next.getName().equals(str)) {
                return next;
            }
        }
        return null;
    }

    public int getAnimationDataCount() {
        ArrayList<AnimationData> arrayList = this.animationData;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    public int getBoneCount() {
        SkeletonRig skeletonRig2 = this.skeletonRig;
        if (skeletonRig2 != null) {
            return skeletonRig2.getBoneCount();
        }
        return 0;
    }

    public String getBoneName(int i) {
        SkeletonRig skeletonRig2 = this.skeletonRig;
        return skeletonRig2 != null ? skeletonRig2.getBoneName(i) : "";
    }

    public int getBoneParentIndex(int i) {
        SkeletonRig skeletonRig2 = this.skeletonRig;
        if (skeletonRig2 != null) {
            return skeletonRig2.getBoneParentIndex(i);
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    @Nullable
    public SkeletonRig getSkeletonRig() {
        return this.skeletonRig;
    }

    public ModelRenderable makeCopy() {
        return new ModelRenderable(this);
    }

    public void onAnimationEngineUpdated() {
        SkeletonRig skeletonRig2 = this.skeletonRig;
        if (skeletonRig2 != null) {
            skeletonRig2.updateBoneTransforms();
        }
    }

    /* access modifiers changed from: package-private */
    public void setAnimationData(@Nullable ArrayList<AnimationData> arrayList) {
        this.animationData = arrayList;
    }

    /* access modifiers changed from: package-private */
    public void setSkeletonRig(@Nullable SkeletonRig skeletonRig2) {
        this.skeletonRig = skeletonRig2;
    }
}
