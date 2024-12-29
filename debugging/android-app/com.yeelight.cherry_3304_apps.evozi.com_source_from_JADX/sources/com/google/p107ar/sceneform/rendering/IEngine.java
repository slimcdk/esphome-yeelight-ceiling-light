package com.google.p107ar.sceneform.rendering;

import com.google.android.filament.Camera;
import com.google.android.filament.Engine;
import com.google.android.filament.Entity;
import com.google.android.filament.Fence;
import com.google.android.filament.IndexBuffer;
import com.google.android.filament.IndirectLight;
import com.google.android.filament.LightManager;
import com.google.android.filament.Material;
import com.google.android.filament.MaterialInstance;
import com.google.android.filament.NativeSurface;
import com.google.android.filament.RenderableManager;
import com.google.android.filament.Renderer;
import com.google.android.filament.Scene;
import com.google.android.filament.Skybox;
import com.google.android.filament.Stream;
import com.google.android.filament.SwapChain;
import com.google.android.filament.Texture;
import com.google.android.filament.TransformManager;
import com.google.android.filament.VertexBuffer;
import com.google.android.filament.View;

/* renamed from: com.google.ar.sceneform.rendering.IEngine */
public interface IEngine {
    Camera createCamera();

    Camera createCamera(@Entity int i);

    Fence createFence(Fence.Type type);

    Renderer createRenderer();

    Scene createScene();

    SwapChain createSwapChain(Object obj);

    SwapChain createSwapChain(Object obj, long j);

    SwapChain createSwapChainFromNativeSurface(NativeSurface nativeSurface, long j);

    View createView();

    void destroy();

    void destroyCamera(Camera camera);

    void destroyEntity(@Entity int i);

    void destroyFence(Fence fence);

    void destroyIndexBuffer(IndexBuffer indexBuffer);

    void destroyIndirectLight(IndirectLight indirectLight);

    void destroyMaterial(Material material);

    void destroyMaterialInstance(MaterialInstance materialInstance);

    void destroyRenderer(Renderer renderer);

    void destroyScene(Scene scene);

    void destroySkybox(Skybox skybox);

    void destroyStream(Stream stream);

    void destroySwapChain(SwapChain swapChain);

    void destroyTexture(Texture texture);

    void destroyVertexBuffer(VertexBuffer vertexBuffer);

    void destroyView(View view);

    void flushAndWait();

    Engine getFilamentEngine();

    LightManager getLightManager();

    RenderableManager getRenderableManager();

    TransformManager getTransformManager();

    boolean isValid();
}
