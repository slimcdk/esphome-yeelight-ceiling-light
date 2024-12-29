package com.google.p107ar.sceneform.rendering;

import androidx.annotation.Nullable;
import com.google.android.filament.Box;
import com.google.android.filament.Entity;
import com.google.android.filament.IndexBuffer;
import com.google.android.filament.RenderableManager;
import com.google.android.filament.VertexBuffer;
import com.google.p107ar.sceneform.math.Vector3;
import com.google.p107ar.sceneform.utilities.AndroidPreconditions;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.util.ArrayList;

/* renamed from: com.google.ar.sceneform.rendering.p0 */
class C2769p0 implements IRenderableInternalData {

    /* renamed from: a */
    private final Vector3 f5353a = Vector3.zero();

    /* renamed from: b */
    private final Vector3 f5354b = Vector3.zero();

    /* renamed from: c */
    private float f5355c = 1.0f;

    /* renamed from: d */
    private final Vector3 f5356d = Vector3.zero();
    @Nullable

    /* renamed from: e */
    private IntBuffer f5357e;
    @Nullable

    /* renamed from: f */
    private FloatBuffer f5358f;
    @Nullable

    /* renamed from: g */
    private FloatBuffer f5359g;
    @Nullable

    /* renamed from: h */
    private FloatBuffer f5360h;
    @Nullable

    /* renamed from: i */
    private FloatBuffer f5361i;
    @Nullable

    /* renamed from: j */
    private IndexBuffer f5362j;
    @Nullable

    /* renamed from: k */
    private VertexBuffer f5363k;

    /* renamed from: l */
    private final ArrayList<C2770a> f5364l = new ArrayList<>();

    /* renamed from: com.google.ar.sceneform.rendering.p0$a */
    static class C2770a {

        /* renamed from: a */
        int f5365a;

        /* renamed from: b */
        int f5366b;

        C2770a() {
        }
    }

    C2769p0() {
    }

    /* renamed from: A */
    public void mo16304A(float f) {
        this.f5355c = f;
    }

    /* renamed from: a */
    public float mo15905a() {
        return this.f5355c;
    }

    /* renamed from: b */
    public void mo15906b(@Nullable IndexBuffer indexBuffer) {
        this.f5362j = indexBuffer;
    }

    /* renamed from: c */
    public Vector3 mo15907c() {
        return new Vector3(this.f5356d);
    }

    @Nullable
    /* renamed from: d */
    public IndexBuffer mo15908d() {
        return this.f5362j;
    }

    /* renamed from: e */
    public Vector3 mo15909e() {
        return new Vector3(this.f5353a);
    }

    /* renamed from: f */
    public void mo15910f(@Nullable VertexBuffer vertexBuffer) {
        this.f5363k = vertexBuffer;
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        try {
            ThreadPools.getMainExecutor().execute(new C2743d0(this));
        } catch (Exception unused) {
        } catch (Throwable th) {
            super.finalize();
            throw th;
        }
        super.finalize();
    }

    /* renamed from: g */
    public void mo15911g(Vector3 vector3) {
        this.f5354b.set(vector3);
    }

    @Nullable
    /* renamed from: h */
    public VertexBuffer mo15912h() {
        return this.f5363k;
    }

    @Nullable
    /* renamed from: i */
    public FloatBuffer mo15913i() {
        return this.f5359g;
    }

    @Nullable
    /* renamed from: j */
    public FloatBuffer mo15914j() {
        return this.f5360h;
    }

    /* renamed from: k */
    public void mo15915k(@Nullable FloatBuffer floatBuffer) {
        this.f5360h = floatBuffer;
    }

    /* renamed from: l */
    public void mo15916l(@Nullable IntBuffer intBuffer) {
        this.f5357e = intBuffer;
    }

    @Nullable
    /* renamed from: m */
    public FloatBuffer mo15917m() {
        return this.f5358f;
    }

    /* renamed from: n */
    public void mo15918n(@Nullable FloatBuffer floatBuffer) {
        this.f5358f = floatBuffer;
    }

    @Nullable
    /* renamed from: o */
    public FloatBuffer mo15919o() {
        return this.f5361i;
    }

    /* renamed from: p */
    public void mo15920p(@Nullable FloatBuffer floatBuffer) {
        this.f5361i = floatBuffer;
    }

    @Nullable
    /* renamed from: q */
    public IntBuffer mo15921q() {
        return this.f5357e;
    }

    /* renamed from: r */
    public void mo15922r(@Nullable FloatBuffer floatBuffer) {
        this.f5359g = floatBuffer;
    }

    /* renamed from: s */
    public void mo15923s(Vector3 vector3) {
        this.f5353a.set(vector3);
    }

    /* renamed from: t */
    public Vector3 mo15924t() {
        return this.f5354b.scaled(2.0f);
    }

    /* renamed from: u */
    public ArrayList<C2770a> mo15925u() {
        return this.f5364l;
    }

    /* renamed from: v */
    public Vector3 mo15926v() {
        return new Vector3(this.f5354b);
    }

    /* renamed from: w */
    public void mo15927w(Renderable renderable, @Nullable SkeletonRig skeletonRig, @Entity int i) {
        IRenderableInternalData renderableData = renderable.getRenderableData();
        ArrayList<Material> materialBindings = renderable.getMaterialBindings();
        RenderableManager renderableManager = EngineInstance.getEngine().getRenderableManager();
        int instance = renderableManager.getInstance(i);
        int size = renderableData.mo15925u().size();
        if (instance == 0 || renderableManager.getPrimitiveCount(instance) != size) {
            if (instance != 0) {
                renderableManager.destroy(i);
            }
            RenderableManager.Builder receiveShadows = new RenderableManager.Builder(size).priority(renderable.getRenderPriority()).castShadows(renderable.isShadowCaster()).receiveShadows(renderable.isShadowReceiver());
            if (skeletonRig != null) {
                receiveShadows.skinning(skeletonRig.getMaterialBoneCount());
            }
            receiveShadows.build(EngineInstance.getEngine().getFilamentEngine(), i);
            instance = renderableManager.getInstance(i);
            if (instance == 0) {
                throw new AssertionError("Unable to create RenderableInstance.");
            }
        } else {
            renderableManager.setPriority(instance, renderable.getRenderPriority());
            renderableManager.setCastShadows(instance, renderable.isShadowCaster());
            renderableManager.setReceiveShadows(instance, renderable.isShadowReceiver());
        }
        int i2 = instance;
        Vector3 v = renderableData.mo15926v();
        Vector3 e = renderableData.mo15909e();
        renderableManager.setAxisAlignedBoundingBox(i2, new Box(e.f5202x, e.f5203y, e.f5204z, v.f5202x, v.f5203y, v.f5204z));
        if (materialBindings.size() == size) {
            RenderableManager.PrimitiveType primitiveType = RenderableManager.PrimitiveType.TRIANGLES;
            for (int i3 = 0; i3 < size; i3++) {
                C2770a aVar = renderableData.mo15925u().get(i3);
                VertexBuffer h = renderableData.mo15912h();
                IndexBuffer d = renderableData.mo15908d();
                if (h == null || d == null) {
                    throw new AssertionError("Internal Error: Failed to get vertex or index buffer");
                }
                int i4 = aVar.f5365a;
                renderableManager.setGeometryAt(i2, i3, primitiveType, h, d, i4, aVar.f5366b - i4);
                renderableManager.setMaterialInstanceAt(i2, i3, materialBindings.get(i3).getFilamentMaterialInstance());
            }
            return;
        }
        throw new AssertionError("Material Bindings are out of sync with meshes.");
    }

    /* renamed from: x */
    public void mo16307y() {
        AndroidPreconditions.checkUiThread();
        IEngine engine = EngineInstance.getEngine();
        if (engine != null && engine.isValid()) {
            VertexBuffer vertexBuffer = this.f5363k;
            if (vertexBuffer != null) {
                engine.destroyVertexBuffer(vertexBuffer);
                this.f5363k = null;
            }
            IndexBuffer indexBuffer = this.f5362j;
            if (indexBuffer != null) {
                engine.destroyIndexBuffer(indexBuffer);
                this.f5362j = null;
            }
        }
    }

    /* renamed from: z */
    public void mo16308z(Vector3 vector3) {
        this.f5356d.set(vector3);
    }
}
