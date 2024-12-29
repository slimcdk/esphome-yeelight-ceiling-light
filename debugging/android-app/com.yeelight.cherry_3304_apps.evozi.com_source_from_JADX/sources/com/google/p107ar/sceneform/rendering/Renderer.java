package com.google.p107ar.sceneform.rendering;

import android.content.Context;
import android.view.Surface;
import android.view.SurfaceView;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import com.google.android.filament.Camera;
import com.google.android.filament.IndirectLight;
import com.google.android.filament.Scene;
import com.google.android.filament.SwapChain;
import com.google.android.filament.TransformManager;
import com.google.android.filament.View;
import com.google.android.filament.Viewport;
import com.google.android.filament.android.UiHelper;
import com.google.p107ar.sceneform.utilities.AndroidPreconditions;
import com.google.p107ar.sceneform.utilities.EnvironmentalHdrParameters;
import com.google.p107ar.sceneform.utilities.Preconditions;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.ar.sceneform.rendering.Renderer */
public class Renderer implements UiHelper.RendererCallback {
    private static final float CAMERA_APERATURE = 4.0f;
    private static final float CAMERA_ISO = 320.0f;
    private static final float CAMERA_SHUTTER_SPEED = 0.033333335f;
    private static final Color DEFAULT_CLEAR_COLOR = new Color(0.0f, 0.0f, 0.0f, 1.0f);
    private static final int MAXIMUM_RESOLUTION = 1080;
    private Camera camera;
    private final double[] cameraProjectionMatrix = new double[16];
    @Nullable
    private CameraProvider cameraProvider;
    private View emptyView;
    private EnvironmentalHdrParameters environmentalHdrParameters = EnvironmentalHdrParameters.makeDefault();
    private UiHelper filamentHelper;
    private IndirectLight indirectLight;
    private final ArrayList<LightInstance> lightInstances = new ArrayList<>();
    private final List<C2728b> mirrors = new ArrayList();
    private boolean recreateSwapChain;
    private final ArrayList<RenderableInstance> renderableInstances = new ArrayList<>();
    private com.google.android.filament.Renderer renderer;
    private Scene scene;
    private Surface surface;
    private final SurfaceView surfaceView;
    @Nullable
    private SwapChain swapChain;
    private View view;
    private final ViewAttachmentManager viewAttachmentManager;

    /* renamed from: com.google.ar.sceneform.rendering.Renderer$b */
    private static class C2728b {
        @Nullable

        /* renamed from: a */
        SwapChain f5266a;
        @Nullable

        /* renamed from: b */
        Surface f5267b;

        /* renamed from: c */
        Viewport f5268c;

        private C2728b() {
        }
    }

    @RequiresApi(api = 24)
    public Renderer(SurfaceView surfaceView2) {
        Preconditions.checkNotNull(surfaceView2, "Parameter \"view\" was null.");
        AndroidPreconditions.checkMinAndroidApiLevel();
        this.surfaceView = surfaceView2;
        this.viewAttachmentManager = new ViewAttachmentManager(getContext(), surfaceView2);
        initialize();
    }

    private void addModelInstanceInternal(RenderableInstance renderableInstance) {
    }

    public static void destroyAllResources() {
        ResourceManager.getInstance().destroyAllResources();
        EngineInstance.destroyEngine();
    }

    private Viewport getLetterboxViewport(Viewport viewport, Viewport viewport2) {
        int i;
        float f;
        if (((float) viewport2.width) / ((float) viewport2.height) > ((float) viewport.width) / ((float) viewport.height)) {
            f = (float) viewport2.height;
            i = viewport.height;
        } else {
            f = (float) viewport2.width;
            i = viewport.width;
        }
        float f2 = f / ((float) i);
        int i2 = (int) (((float) viewport.width) * f2);
        int i3 = (int) (((float) viewport.height) * f2);
        return new Viewport((viewport2.width - i2) / 2, (viewport2.height - i3) / 2, i2, i3);
    }

    private void initialize() {
        SurfaceView surfaceView2 = getSurfaceView();
        UiHelper uiHelper = new UiHelper(UiHelper.ContextErrorPolicy.DONT_CHECK);
        this.filamentHelper = uiHelper;
        uiHelper.setRenderCallback(this);
        this.filamentHelper.attachTo(surfaceView2);
        IEngine engine = EngineInstance.getEngine();
        this.renderer = engine.createRenderer();
        this.scene = engine.createScene();
        this.view = engine.createView();
        this.emptyView = engine.createView();
        Camera createCamera = engine.createCamera();
        this.camera = createCamera;
        createCamera.setExposure(CAMERA_APERATURE, CAMERA_SHUTTER_SPEED, CAMERA_ISO);
        setDefaultClearColor();
        this.view.setCamera(this.camera);
        this.view.setScene(this.scene);
        setDynamicResolutionEnabled(true);
        this.emptyView.setClearColor(0.0f, 0.0f, 0.0f, 1.0f);
        this.emptyView.setCamera(engine.createCamera());
        this.emptyView.setScene(engine.createScene());
    }

    public static long reclaimReleasedResources() {
        return ResourceManager.getInstance().reclaimReleasedResources();
    }

    private void removeModelInstanceInternal(RenderableInstance renderableInstance) {
    }

    private void updateInstances() {
        TransformManager transformManager = EngineInstance.getEngine().getTransformManager();
        transformManager.openLocalTransformTransaction();
        Iterator<RenderableInstance> it = this.renderableInstances.iterator();
        while (it.hasNext()) {
            RenderableInstance next = it.next();
            next.prepareForDraw();
            next.setModelMatrix(transformManager, next.getWorldModelMatrix().data);
        }
        transformManager.commitLocalTransformTransaction();
    }

    private void updateLights() {
        Iterator<LightInstance> it = this.lightInstances.iterator();
        while (it.hasNext()) {
            it.next().updateTransform();
        }
    }

    /* access modifiers changed from: package-private */
    public void addInstance(RenderableInstance renderableInstance) {
        this.scene.addEntity(renderableInstance.getRenderedEntity());
        addModelInstanceInternal(renderableInstance);
        this.renderableInstances.add(renderableInstance);
    }

    /* access modifiers changed from: package-private */
    public void addLight(LightInstance lightInstance) {
        this.scene.addEntity(lightInstance.getEntity());
        this.lightInstances.add(lightInstance);
    }

    public void dispose() {
        this.filamentHelper.detach();
        IEngine engine = EngineInstance.getEngine();
        IndirectLight indirectLight2 = this.indirectLight;
        if (indirectLight2 != null) {
            engine.destroyIndirectLight(indirectLight2);
        }
        engine.destroyRenderer(this.renderer);
        engine.destroyView(this.view);
        reclaimReleasedResources();
    }

    public Context getContext() {
        return getSurfaceView().getContext();
    }

    public int getDesiredHeight() {
        return this.filamentHelper.getDesiredHeight();
    }

    public int getDesiredWidth() {
        return this.filamentHelper.getDesiredWidth();
    }

    public EnvironmentalHdrParameters getEnvironmentalHdrParameters() {
        return this.environmentalHdrParameters;
    }

    /* access modifiers changed from: package-private */
    public Scene getFilamentScene() {
        return this.scene;
    }

    public SurfaceView getSurfaceView() {
        return this.surfaceView;
    }

    /* access modifiers changed from: package-private */
    public ViewAttachmentManager getViewAttachmentManager() {
        return this.viewAttachmentManager;
    }

    public boolean isFrontFaceWindingInverted() {
        return this.view.isFrontFaceWindingInverted();
    }

    public void onDetachedFromSurface() {
        SwapChain swapChain2 = this.swapChain;
        if (swapChain2 != null) {
            IEngine engine = EngineInstance.getEngine();
            engine.destroySwapChain(swapChain2);
            engine.flushAndWait();
            this.swapChain = null;
        }
    }

    public void onNativeWindowChanged(Surface surface2) {
        synchronized (this) {
            this.surface = surface2;
            this.recreateSwapChain = true;
        }
    }

    public void onPause() {
        this.viewAttachmentManager.mo16246e();
    }

    public void onResized(int i, int i2) {
        this.view.setViewport(new Viewport(0, 0, i, i2));
        this.emptyView.setViewport(new Viewport(0, 0, i, i2));
    }

    public void onResume() {
        this.viewAttachmentManager.mo16247f();
    }

    /* access modifiers changed from: package-private */
    public void removeInstance(RenderableInstance renderableInstance) {
        removeModelInstanceInternal(renderableInstance);
        this.scene.remove(renderableInstance.getRenderedEntity());
        this.renderableInstances.remove(renderableInstance);
    }

    /* access modifiers changed from: package-private */
    public void removeLight(LightInstance lightInstance) {
        this.scene.remove(lightInstance.getEntity());
        this.lightInstances.remove(lightInstance);
    }

    public void render(boolean z) {
        int i;
        synchronized (this) {
            if (this.recreateSwapChain) {
                IEngine engine = EngineInstance.getEngine();
                if (this.swapChain != null) {
                    engine.destroySwapChain(this.swapChain);
                }
                this.swapChain = engine.createSwapChain(this.surface, 2);
                this.recreateSwapChain = false;
            }
        }
        synchronized (this.mirrors) {
            Iterator<C2728b> it = this.mirrors.iterator();
            while (it.hasNext()) {
                C2728b next = it.next();
                if (next.f5267b == null) {
                    if (next.f5266a != null) {
                        EngineInstance.getEngine().destroySwapChain((SwapChain) Preconditions.checkNotNull(next.f5266a));
                    }
                    it.remove();
                } else if (next.f5266a == null) {
                    next.f5266a = EngineInstance.getEngine().createSwapChain(Preconditions.checkNotNull(next.f5267b));
                }
            }
        }
        if (this.filamentHelper.isReadyToRender()) {
            updateInstances();
            updateLights();
            CameraProvider cameraProvider2 = this.cameraProvider;
            if (cameraProvider2 != null) {
                float[] fArr = cameraProvider2.getProjectionMatrix().data;
                for (i = 0; i < 16; i++) {
                    this.cameraProjectionMatrix[i] = (double) fArr[i];
                }
                this.camera.setModelMatrix(cameraProvider2.getWorldModelMatrix().data);
                this.camera.setCustomProjection(this.cameraProjectionMatrix, (double) cameraProvider2.getNearClipPlane(), (double) cameraProvider2.getFarClipPlane());
                SwapChain swapChain2 = this.swapChain;
                if (swapChain2 != null) {
                    if (this.renderer.beginFrame(swapChain2)) {
                        View view2 = cameraProvider2.isActive() ? this.view : this.emptyView;
                        this.renderer.render(view2);
                        synchronized (this.mirrors) {
                            for (C2728b next2 : this.mirrors) {
                                if (next2.f5266a != null) {
                                    this.renderer.mirrorFrame(next2.f5266a, getLetterboxViewport(view2.getViewport(), next2.f5268c), view2.getViewport(), 7);
                                }
                            }
                        }
                        this.renderer.endFrame();
                    }
                    reclaimReleasedResources();
                    return;
                }
                throw new AssertionError("Internal Error: Failed to get swap chain");
            }
        }
    }

    @VisibleForTesting
    public void setAntiAliasing(View.AntiAliasing antiAliasing) {
        this.view.setAntiAliasing(antiAliasing);
    }

    public void setCameraProvider(@Nullable CameraProvider cameraProvider2) {
        this.cameraProvider = cameraProvider2;
    }

    public void setClearColor(Color color) {
        this.view.setClearColor(color.f5213r, color.f5212g, color.f5211b, color.f5210a);
    }

    public void setDefaultClearColor() {
        setClearColor(DEFAULT_CLEAR_COLOR);
    }

    public void setDesiredSize(int i, int i2) {
        int min = Math.min(i, i2);
        int max = Math.max(i, i2);
        if (min > MAXIMUM_RESOLUTION) {
            max = (max * MAXIMUM_RESOLUTION) / min;
            min = MAXIMUM_RESOLUTION;
        }
        if (i >= i2) {
            int i3 = max;
            max = min;
            min = i3;
        }
        this.filamentHelper.setDesiredSize(min, max);
    }

    @VisibleForTesting
    public void setDithering(View.Dithering dithering) {
        this.view.setDithering(dithering);
    }

    public void setDynamicResolutionEnabled(boolean z) {
        View.DynamicResolutionOptions dynamicResolutionOptions = new View.DynamicResolutionOptions();
        dynamicResolutionOptions.enabled = z;
        dynamicResolutionOptions.targetFrameTimeMilli = 33.333332f;
        this.view.setDynamicResolutionOptions(dynamicResolutionOptions);
    }

    public void setEnvironmentalHdrParameters(EnvironmentalHdrParameters environmentalHdrParameters2) {
        this.environmentalHdrParameters = environmentalHdrParameters2;
    }

    public void setFrontFaceWindingInverted(Boolean bool) {
        this.view.setFrontFaceWindingInverted(bool.booleanValue());
    }

    public void setLightProbe(LightProbe lightProbe) {
        if (lightProbe != null) {
            IndirectLight buildIndirectLight = lightProbe.buildIndirectLight();
            if (buildIndirectLight != null) {
                this.scene.setIndirectLight(buildIndirectLight);
                IndirectLight indirectLight2 = this.indirectLight;
                if (indirectLight2 != null && indirectLight2 != buildIndirectLight) {
                    EngineInstance.getEngine().destroyIndirectLight(this.indirectLight);
                    this.indirectLight = buildIndirectLight;
                    return;
                }
                return;
            }
            return;
        }
        throw new AssertionError("Passed in an invalid light probe.");
    }

    public void startMirroring(Surface surface2, int i, int i2, int i3, int i4) {
        C2728b bVar = new C2728b();
        bVar.f5267b = surface2;
        bVar.f5268c = new Viewport(i, i2, i3, i4);
        bVar.f5266a = null;
        synchronized (this.mirrors) {
            this.mirrors.add(bVar);
        }
    }

    public void stopMirroring(Surface surface2) {
        synchronized (this.mirrors) {
            for (C2728b next : this.mirrors) {
                if (next.f5267b == surface2) {
                    next.f5267b = null;
                }
            }
        }
    }
}
