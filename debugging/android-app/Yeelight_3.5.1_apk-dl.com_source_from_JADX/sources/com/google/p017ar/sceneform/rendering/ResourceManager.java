package com.google.p017ar.sceneform.rendering;

import androidx.annotation.Nullable;
import com.google.p017ar.sceneform.resources.ResourceHolder;
import com.google.p017ar.sceneform.resources.ResourceRegistry;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.google.ar.sceneform.rendering.ResourceManager */
public class ResourceManager {
    @Nullable
    private static ResourceManager instance;
    private final CleanupRegistry<CameraStream> cameraStreamCleanupRegistry;
    private final CleanupRegistry<ExternalTexture> externalTextureCleanupRegistry;
    private final CleanupRegistry<Material> materialCleanupRegistry;
    private final ResourceRegistry<Material> materialRegistry;
    private final ResourceRegistry<ModelRenderable> modelRenderableRegistry;
    private final CleanupRegistry<RenderableInstance> renderableInstanceCleanupRegistry;
    private final ArrayList<ResourceHolder> resourceHolders = new ArrayList<>();
    private final CleanupRegistry<Texture> textureCleanupRegistry;
    private final ResourceRegistry<Texture> textureRegistry;
    private final ResourceRegistry<ViewRenderable> viewRenderableRegistry;

    private ResourceManager() {
        ResourceRegistry<Texture> resourceRegistry = new ResourceRegistry<>();
        this.textureRegistry = resourceRegistry;
        ResourceRegistry<Material> resourceRegistry2 = new ResourceRegistry<>();
        this.materialRegistry = resourceRegistry2;
        ResourceRegistry<ModelRenderable> resourceRegistry3 = new ResourceRegistry<>();
        this.modelRenderableRegistry = resourceRegistry3;
        this.viewRenderableRegistry = new ResourceRegistry<>();
        CleanupRegistry<CameraStream> cleanupRegistry = new CleanupRegistry<>();
        this.cameraStreamCleanupRegistry = cleanupRegistry;
        CleanupRegistry<ExternalTexture> cleanupRegistry2 = new CleanupRegistry<>();
        this.externalTextureCleanupRegistry = cleanupRegistry2;
        CleanupRegistry<Material> cleanupRegistry3 = new CleanupRegistry<>();
        this.materialCleanupRegistry = cleanupRegistry3;
        CleanupRegistry<RenderableInstance> cleanupRegistry4 = new CleanupRegistry<>();
        this.renderableInstanceCleanupRegistry = cleanupRegistry4;
        CleanupRegistry<Texture> cleanupRegistry5 = new CleanupRegistry<>();
        this.textureCleanupRegistry = cleanupRegistry5;
        addResourceHolder(resourceRegistry);
        addResourceHolder(resourceRegistry2);
        addResourceHolder(resourceRegistry3);
        addViewRenderableRegistry();
        addResourceHolder(cleanupRegistry);
        addResourceHolder(cleanupRegistry2);
        addResourceHolder(cleanupRegistry3);
        addResourceHolder(cleanupRegistry4);
        addResourceHolder(cleanupRegistry5);
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
