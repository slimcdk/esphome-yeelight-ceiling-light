package com.google.p107ar.sceneform.rendering;

import androidx.annotation.Nullable;
import com.google.p107ar.sceneform.resources.ResourceHolder;
import com.google.p107ar.sceneform.resources.ResourceRegistry;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.google.ar.sceneform.rendering.ResourceManager */
public class ResourceManager {
    @Nullable
    private static ResourceManager instance;
    private final CleanupRegistry<CameraStream> cameraStreamCleanupRegistry = new CleanupRegistry<>();
    private final CleanupRegistry<ExternalTexture> externalTextureCleanupRegistry = new CleanupRegistry<>();
    private final CleanupRegistry<Material> materialCleanupRegistry = new CleanupRegistry<>();
    private final ResourceRegistry<Material> materialRegistry = new ResourceRegistry<>();
    private final ResourceRegistry<ModelRenderable> modelRenderableRegistry = new ResourceRegistry<>();
    private final CleanupRegistry<RenderableInstance> renderableInstanceCleanupRegistry = new CleanupRegistry<>();
    private final ArrayList<ResourceHolder> resourceHolders = new ArrayList<>();
    private final CleanupRegistry<Texture> textureCleanupRegistry = new CleanupRegistry<>();
    private final ResourceRegistry<Texture> textureRegistry = new ResourceRegistry<>();
    private final ResourceRegistry<ViewRenderable> viewRenderableRegistry = new ResourceRegistry<>();

    private ResourceManager() {
        addResourceHolder(this.textureRegistry);
        addResourceHolder(this.materialRegistry);
        addResourceHolder(this.modelRenderableRegistry);
        addViewRenderableRegistry();
        addResourceHolder(this.cameraStreamCleanupRegistry);
        addResourceHolder(this.externalTextureCleanupRegistry);
        addResourceHolder(this.materialCleanupRegistry);
        addResourceHolder(this.renderableInstanceCleanupRegistry);
        addResourceHolder(this.textureCleanupRegistry);
    }

    private void addViewRenderableRegistry() {
        addResourceHolder(this.viewRenderableRegistry);
    }

    public static ResourceManager getInstance() {
        if (instance == null) {
            instance = new ResourceManager();
        }
        return instance;
    }

    public void addResourceHolder(ResourceHolder resourceHolder) {
        this.resourceHolders.add(resourceHolder);
    }

    public void destroyAllResources() {
        Iterator<ResourceHolder> it = this.resourceHolders.iterator();
        while (it.hasNext()) {
            it.next().destroyAllResources();
        }
    }

    /* access modifiers changed from: package-private */
    public CleanupRegistry<CameraStream> getCameraStreamCleanupRegistry() {
        return this.cameraStreamCleanupRegistry;
    }

    /* access modifiers changed from: package-private */
    public CleanupRegistry<ExternalTexture> getExternalTextureCleanupRegistry() {
        return this.externalTextureCleanupRegistry;
    }

    /* access modifiers changed from: package-private */
    public CleanupRegistry<Material> getMaterialCleanupRegistry() {
        return this.materialCleanupRegistry;
    }

    /* access modifiers changed from: package-private */
    public ResourceRegistry<Material> getMaterialRegistry() {
        return this.materialRegistry;
    }

    /* access modifiers changed from: package-private */
    public ResourceRegistry<ModelRenderable> getModelRenderableRegistry() {
        return this.modelRenderableRegistry;
    }

    /* access modifiers changed from: package-private */
    public CleanupRegistry<RenderableInstance> getRenderableInstanceCleanupRegistry() {
        return this.renderableInstanceCleanupRegistry;
    }

    /* access modifiers changed from: package-private */
    public CleanupRegistry<Texture> getTextureCleanupRegistry() {
        return this.textureCleanupRegistry;
    }

    /* access modifiers changed from: package-private */
    public ResourceRegistry<Texture> getTextureRegistry() {
        return this.textureRegistry;
    }

    /* access modifiers changed from: package-private */
    public ResourceRegistry<ViewRenderable> getViewRenderableRegistry() {
        return this.viewRenderableRegistry;
    }

    public long reclaimReleasedResources() {
        Iterator<ResourceHolder> it = this.resourceHolders.iterator();
        long j = 0;
        while (it.hasNext()) {
            j += it.next().reclaimReleasedResources();
        }
        return j;
    }
}
