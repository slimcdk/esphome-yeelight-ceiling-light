package com.google.p017ar.sceneform.rendering;

import androidx.annotation.Nullable;
import com.google.android.filament.EntityManager;
import com.google.android.filament.IndexBuffer;
import com.google.android.filament.RenderableManager;
import com.google.android.filament.Scene;
import com.google.android.filament.VertexBuffer;
import com.google.p017ar.core.Frame;
import com.google.p017ar.sceneform.utilities.AndroidPreconditions;
import com.google.p017ar.sceneform.utilities.Preconditions;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.ShortBuffer;

/* renamed from: com.google.ar.sceneform.rendering.CameraStream */
public class CameraStream {
    private static final short[] CAMERA_INDICES = {0, 1, 2};
    private static final float[] CAMERA_UVS = {0.0f, 0.0f, 0.0f, 2.0f, 2.0f, 0.0f};
    private static final float[] CAMERA_VERTICES = {-1.0f, 1.0f, 1.0f, -1.0f, -3.0f, 1.0f, 3.0f, 1.0f, 1.0f};
    private static final int FLOAT_SIZE_IN_BYTES = 4;
    public static final String MATERIAL_CAMERA_TEXTURE = "cameraTexture";
    private static final int POSITION_BUFFER_INDEX = 0;
    private static final String TAG = "CameraStream";
    private static final int UNINITIALIZED_FILAMENT_RENDERABLE = -1;
    private static final int UV_BUFFER_INDEX = 1;
    private static final int VERTEX_COUNT = 3;
    private final IndexBuffer cameraIndexBuffer;
    @Nullable
    private Material cameraMaterial = null;
    private int cameraStreamRenderable = -1;
    @Nullable
    private ExternalTexture cameraTexture;
    private final int cameraTextureId;
    private final FloatBuffer cameraUvCoords;
    private final VertexBuffer cameraVertexBuffer;
    @Nullable
    private Material defaultCameraMaterial = null;
    private boolean isTextureInitialized = false;
    private int renderablePriority = 7;
    private final Scene scene;
    private final FloatBuffer transformedCameraUvCoords;

    /* renamed from: com.google.ar.sceneform.rendering.CameraStream$a */
    private static final class C2082a implements Runnable {

        /* renamed from: a */
        private final Scene f3281a;

        /* renamed from: b */
        private final int f3282b;

        /* renamed from: c */
        private final IndexBuffer f3283c;

        /* renamed from: d */
        private final VertexBuffer f3284d;

        C2082a(Scene scene, int i, IndexBuffer indexBuffer, VertexBuffer vertexBuffer) {
            this.f3281a = scene;
            this.f3282b = i;
            this.f3283c = indexBuffer;
            this.f3284d = vertexBuffer;
        }

        public void run() {
            AndroidPreconditions.checkUiThread();
            IEngine engine = EngineInstance.getEngine();
            if (engine != null || engine.isValid()) {
                int i = this.f3282b;
                if (i != -1) {
                    this.f3281a.remove(i);
                }
                engine.destroyIndexBuffer(this.f3283c);
                engine.destroyVertexBuffer(this.f3284d);
            }
        }
    }

    public CameraStream(int i, Renderer renderer) {
        this.scene = renderer.getFilamentScene();
        this.cameraTextureId = i;
        IEngine engine = EngineInstance.getEngine();
        short[] sArr = CAMERA_INDICES;
        ShortBuffer allocate = ShortBuffer.allocate(sArr.length);
        allocate.put(sArr);
        IndexBuffer build = new IndexBuffer.Builder().indexCount(allocate.capacity()).bufferType(IndexBuffer.Builder.IndexType.USHORT).build(engine.getFilamentEngine());
        this.cameraIndexBuffer = build;
        allocate.rewind();
        ((IndexBuffer) Preconditions.checkNotNull(build)).setBuffer(engine.getFilamentEngine(), allocate);
        this.cameraUvCoords = createCameraUVBuffer();
        FloatBuffer createCameraUVBuffer = createCameraUVBuffer();
        this.transformedCameraUvCoords = createCameraUVBuffer;
        float[] fArr = CAMERA_VERTICES;
        FloatBuffer allocate2 = FloatBuffer.allocate(fArr.length);
        allocate2.put(fArr);
        VertexBuffer build2 = new VertexBuffer.Builder().vertexCount(3).bufferCount(2).attribute(VertexBuffer.VertexAttribute.POSITION, 0, VertexBuffer.AttributeType.FLOAT3, 0, (fArr.length / 3) * 4).attribute(VertexBuffer.VertexAttribute.UV0, 1, VertexBuffer.AttributeType.FLOAT2, 0, (CAMERA_UVS.length / 3) * 4).build(engine.getFilamentEngine());
        this.cameraVertexBuffer = build2;
        allocate2.rewind();
        ((VertexBuffer) Preconditions.checkNotNull(build2)).setBufferAt(engine.getFilamentEngine(), 0, allocate2);
        adjustCameraUvsForOpenGL();
        build2.setBufferAt(engine.getFilamentEngine(), 1, createCameraUVBuffer);
        Material.builder().setSource(renderer.getContext(), C2108R.raw.sceneform_camera_material).build().thenAccept(new C2121a(this)).exceptionally(C2123b.f3359a);
    }

    private void adjustCameraUvsForOpenGL() {
        for (int i = 1; i < 6; i += 2) {
            FloatBuffer floatBuffer = this.transformedCameraUvCoords;
            floatBuffer.put(i, 1.0f - floatBuffer.get(i));
        }
    }

    private static FloatBuffer createCameraUVBuffer() {
        float[] fArr = CAMERA_UVS;
        FloatBuffer asFloatBuffer = ByteBuffer.allocateDirect(fArr.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        asFloatBuffer.put(fArr);
        asFloatBuffer.rewind();
        return asFloatBuffer;
    }

    private void initializeFilamentRenderable() {
        this.cameraStreamRenderable = EntityManager.get().create();
        new RenderableManager.Builder(1).castShadows(false).receiveShadows(false).culling(false).priority(this.renderablePriority).geometry(0, RenderableManager.PrimitiveType.TRIANGLES, this.cameraVertexBuffer, this.cameraIndexBuffer).material(0, ((Material) Preconditions.checkNotNull(this.cameraMaterial)).getFilamentMaterialInstance()).build(EngineInstance.getEngine().getFilamentEngine(), this.cameraStreamRenderable);
        this.scene.addEntity(this.cameraStreamRenderable);
        ResourceManager.getInstance().getCameraStreamCleanupRegistry().register(this, new C2082a(this.scene, this.cameraStreamRenderable, this.cameraIndexBuffer, this.cameraVertexBuffer));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(Material material) {
        this.defaultCameraMaterial = material;
        if (this.cameraMaterial == null) {
            setCameraMaterial(material);
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Void lambda$new$1(Throwable th) {
        return null;
    }

    public int getRenderPriority() {
        return this.renderablePriority;
    }

    public void initializeTexture(Frame frame) {
        if (!isTextureInitialized()) {
            int[] imageDimensions = frame.getCamera().getTextureIntrinsics().getImageDimensions();
            this.cameraTexture = new ExternalTexture(this.cameraTextureId, imageDimensions[0], imageDimensions[1]);
            this.isTextureInitialized = true;
            Material material = this.cameraMaterial;
            if (material != null) {
                setCameraMaterial(material);
            }
        }
    }

    public boolean isTextureInitialized() {
        return this.isTextureInitialized;
    }

    public void recalculateCameraUvs(Frame frame) {
        IEngine engine = EngineInstance.getEngine();
        FloatBuffer floatBuffer = this.cameraUvCoords;
        FloatBuffer floatBuffer2 = this.transformedCameraUvCoords;
        VertexBuffer vertexBuffer = this.cameraVertexBuffer;
        frame.transformDisplayUvCoords(floatBuffer, floatBuffer2);
        adjustCameraUvsForOpenGL();
        vertexBuffer.setBufferAt(engine.getFilamentEngine(), 1, floatBuffer2);
    }

    public void setCameraMaterial(Material material) {
        this.cameraMaterial = material;
        if (isTextureInitialized()) {
            material.setExternalTexture(MATERIAL_CAMERA_TEXTURE, (ExternalTexture) Preconditions.checkNotNull(this.cameraTexture));
            if (this.cameraStreamRenderable == -1) {
                initializeFilamentRenderable();
                return;
            }
            RenderableManager renderableManager = EngineInstance.getEngine().getRenderableManager();
            renderableManager.setMaterialInstanceAt(renderableManager.getInstance(this.cameraStreamRenderable), 0, material.getFilamentMaterialInstance());
        }
    }

    public void setCameraMaterialToDefault() {
        Material material = this.defaultCameraMaterial;
        if (material != null) {
            setCameraMaterial(material);
        } else {
            this.cameraMaterial = null;
        }
    }

    public void setRenderPriority(int i) {
        this.renderablePriority = i;
        if (this.cameraStreamRenderable != -1) {
            RenderableManager renderableManager = EngineInstance.getEngine().getRenderableManager();
            renderableManager.setPriority(renderableManager.getInstance(this.cameraStreamRenderable), this.renderablePriority);
        }
    }
}
