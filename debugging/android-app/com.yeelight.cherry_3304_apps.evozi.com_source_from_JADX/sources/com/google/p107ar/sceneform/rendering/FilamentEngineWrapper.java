package com.google.p107ar.sceneform.rendering;

import com.google.android.filament.Camera;
import com.google.android.filament.Engine;
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

/* renamed from: com.google.ar.sceneform.rendering.FilamentEngineWrapper */
public class FilamentEngineWrapper implements IEngine {
    final Engine engine;

    public FilamentEngineWrapper(Engine engine2) {
        this.engine = engine2;
    }

    public Camera createCamera() {
        return this.engine.createCamera();
    }

    public Camera createCamera(int i) {
        return this.engine.createCamera(i);
    }

    public Fence createFence(Fence.Type type) {
        return this.engine.createFence(type);
    }

    public Renderer createRenderer() {
        return this.engine.createRenderer();
    }

    public Scene createScene() {
        return this.engine.createScene();
    }

    public SwapChain createSwapChain(Object obj) {
        return this.engine.createSwapChain(obj);
    }

    public SwapChain createSwapChain(Object obj, long j) {
        return this.engine.createSwapChain(obj, j);
    }

    public SwapChain createSwapChainFromNativeSurface(NativeSurface nativeSurface, long j) {
        return this.engine.createSwapChainFromNativeSurface(nativeSurface, j);
    }

    public View createView() {
        return this.engine.createView();
    }

    public void destroy() {
        this.engine.destroy();
    }

    public void destroyCamera(Camera camera) {
        this.engine.destroyCamera(camera);
    }

    public void destroyEntity(int i) {
        this.engine.destroyEntity(i);
    }

    public void destroyFence(Fence fence) {
        this.engine.destroyFence(fence);
    }

    public void destroyIndexBuffer(IndexBuffer indexBuffer) {
        this.engine.destroyIndexBuffer(indexBuffer);
    }

    public void destroyIndirectLight(IndirectLight indirectLight) {
        this.engine.destroyIndirectLight(indirectLight);
    }

    public void destroyMaterial(Material material) {
        this.engine.destroyMaterial(material);
    }

    public void destroyMaterialInstance(MaterialInstance materialInstance) {
        this.engine.destroyMaterialInstance(materialInstance);
    }

    public void destroyRenderer(Renderer renderer) {
        this.engine.destroyRenderer(renderer);
    }

    public void destroyScene(Scene scene) {
        this.engine.destroyScene(scene);
    }

    public void destroySkybox(Skybox skybox) {
        this.engine.destroySkybox(skybox);
    }

    public void destroyStream(Stream stream) {
        this.engine.destroyStream(stream);
    }

    public void destroySwapChain(SwapChain swapChain) {
        this.engine.destroySwapChain(swapChain);
    }

    public void destroyTexture(Texture texture) {
        this.engine.destroyTexture(texture);
    }

    public void destroyVertexBuffer(VertexBuffer vertexBuffer) {
        this.engine.destroyVertexBuffer(vertexBuffer);
    }

    public void destroyView(View view) {
        this.engine.destroyView(view);
    }

    public void flushAndWait() {
        this.engine.flushAndWait();
    }

    public Engine getFilamentEngine() {
        return this.engine;
    }

    public LightManager getLightManager() {
        return this.engine.getLightManager();
    }

    public RenderableManager getRenderableManager() {
        return this.engine.getRenderableManager();
    }

    public TransformManager getTransformManager() {
        return this.engine.getTransformManager();
    }

    public boolean isValid() {
        return this.engine.isValid();
    }
}
