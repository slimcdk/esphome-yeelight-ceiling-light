package com.google.p017ar.sceneform.rendering;

import android.view.Surface;
import androidx.annotation.NonNull;
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
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: com.google.ar.sceneform.rendering.HeadlessEngineWrapper */
public class HeadlessEngineWrapper implements IEngine {
    private static final Constructor<Engine> engineInit;
    private static final Method getNativeEngineMethod;
    private static final Constructor<SwapChain> swapChainInit;
    final Engine engine = createEngine();
    final long nativeHandle = nGetSwiftShaderInstance();

    static {
        Class<Engine> cls = Engine.class;
        Class<SwapChain> cls2 = SwapChain.class;
        try {
            Class cls3 = Long.TYPE;
            Constructor<SwapChain> declaredConstructor = cls2.getDeclaredConstructor(new Class[]{cls3, Object.class});
            swapChainInit = declaredConstructor;
            Method declaredMethod = cls.getDeclaredMethod("getNativeObject", new Class[0]);
            getNativeEngineMethod = declaredMethod;
            Constructor<Engine> declaredConstructor2 = cls.getDeclaredConstructor(new Class[]{cls3});
            engineInit = declaredConstructor2;
            declaredConstructor.setAccessible(true);
            declaredConstructor2.setAccessible(true);
            declaredMethod.setAccessible(true);
        } catch (Exception e) {
            throw new IllegalStateException("Couldn't get native getters", e);
        }
    }

    public static Engine createEngine() {
        try {
            return engineInit.newInstance(new Object[]{Long.valueOf(nCreateSwiftShaderEngine())});
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e) {
            throw new AssertionError("Error creating engine.", e);
        }
    }

    static SwapChain createSwapChain(long j, @NonNull Object obj) {
        try {
            return swapChainInit.newInstance(new Object[]{Long.valueOf(j), obj});
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e) {
            throw new AssertionError("Error creating swapchain.", e);
        }
    }

    private static long getNativeEngine(Engine engine2) {
        try {
            Long l = (Long) getNativeEngineMethod.invoke(engine2, new Object[0]);
            if (l != null) {
                return l.longValue();
            }
            throw new IllegalStateException("Got null native engine handle");
        } catch (Exception e) {
            throw new IllegalStateException("Couldn't get native engine", e);
        }
    }

    private static native long nCreateSwiftShaderEngine();

    private static native long nCreateSwiftshaderSwapChain(long j, Object obj, long j2);

    private static native long nDestroySwiftShaderEngine(long j);

    private static native long nGetSwiftShaderInstance();

    @NonNull
    public Camera createCamera() {
        return this.engine.createCamera();
    }

    @NonNull
    public Camera createCamera(int i) {
        return this.engine.createCamera(i);
    }

    @NonNull
    public Fence createFence(@NonNull Fence.Type type) {
        return this.engine.createFence(type);
    }

    @NonNull
    public Renderer createRenderer() {
        return this.engine.createRenderer();
    }

    @NonNull
    public Scene createScene() {
        return this.engine.createScene();
    }

    public SwapChain createSwapChain(@NonNull Object obj) {
        return this.engine.createSwapChain(obj);
    }

    public SwapChain createSwapChain(@NonNull Object obj, long j) {
        if (validateSurface(obj)) {
            long nCreateSwiftshaderSwapChain = nCreateSwiftshaderSwapChain(this.nativeHandle, obj, j);
            if (nCreateSwiftshaderSwapChain != 0) {
                return createSwapChain(nCreateSwiftshaderSwapChain, obj);
            }
            throw new IllegalStateException("Couldn't create SwapChain");
        }
        String valueOf = String.valueOf(obj);
        StringBuilder sb = new StringBuilder(valueOf.length() + 16);
        sb.append("Invalid surface ");
        sb.append(valueOf);
        throw new IllegalArgumentException(sb.toString());
    }

    public SwapChain createSwapChainFromNativeSurface(@NonNull NativeSurface nativeSurface, long j) {
        return this.engine.createSwapChainFromNativeSurface(nativeSurface, j);
    }

    @NonNull
    public View createView() {
        return this.engine.createView();
    }

    public void destroy() {
        nDestroySwiftShaderEngine(getNativeEngine(this.engine));
    }

    public void destroyCamera(@NonNull Camera camera) {
        this.engine.destroyCamera(camera);
    }

    public void destroyEntity(int i) {
        this.engine.destroyEntity(i);
    }

    public void destroyFence(@NonNull Fence fence) {
        this.engine.destroyFence(fence);
    }

    public void destroyIndexBuffer(@NonNull IndexBuffer indexBuffer) {
        this.engine.destroyIndexBuffer(indexBuffer);
    }

    public void destroyIndirectLight(@NonNull IndirectLight indirectLight) {
        this.engine.destroyIndirectLight(indirectLight);
    }

    public void destroyMaterial(@NonNull Material material) {
        this.engine.destroyMaterial(material);
    }

    public void destroyMaterialInstance(@NonNull MaterialInstance materialInstance) {
        this.engine.destroyMaterialInstance(materialInstance);
    }

    public void destroyRenderer(@NonNull Renderer renderer) {
        this.engine.destroyRenderer(renderer);
    }

    public void destroyScene(@NonNull Scene scene) {
        this.engine.destroyScene(scene);
    }

    public void destroySkybox(@NonNull Skybox skybox) {
        this.engine.destroySkybox(skybox);
    }

    public void destroyStream(@NonNull Stream stream) {
        this.engine.destroyStream(stream);
    }

    public void destroySwapChain(@NonNull SwapChain swapChain) {
        this.engine.destroySwapChain(swapChain);
    }

    public void destroyTexture(@NonNull Texture texture) {
        this.engine.destroyTexture(texture);
    }

    public void destroyVertexBuffer(@NonNull VertexBuffer vertexBuffer) {
        this.engine.destroyVertexBuffer(vertexBuffer);
    }

    public void destroyView(@NonNull View view) {
        this.engine.destroyView(view);
    }

    public void flushAndWait() {
        this.engine.flushAndWait();
    }

    public Engine getFilamentEngine() {
        return this.engine;
    }

    @NonNull
    public LightManager getLightManager() {
        return this.engine.getLightManager();
    }

    @NonNull
    public RenderableManager getRenderableManager() {
        return this.engine.getRenderableManager();
    }

    @NonNull
    public TransformManager getTransformManager() {
        return this.engine.getTransformManager();
    }

    public boolean isValid() {
        return false;
    }

    /* access modifiers changed from: package-private */
    public boolean validateSurface(Object obj) {
        return obj instanceof Surface;
    }
}
