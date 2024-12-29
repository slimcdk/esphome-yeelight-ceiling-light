package com.google.p017ar.sceneform.rendering;

import androidx.annotation.Nullable;
import com.google.android.filament.Box;
import com.google.android.filament.Entity;
import com.google.android.filament.IndexBuffer;
import com.google.android.filament.RenderableManager;
import com.google.android.filament.VertexBuffer;
import com.google.p017ar.sceneform.math.Vector3;
import com.google.p017ar.sceneform.utilities.AndroidPreconditions;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.util.ArrayList;

/* renamed from: com.google.ar.sceneform.rendering.j0 */
class C2140j0 implements IRenderableInternalData {

    /* renamed from: a */
    private final Vector3 f3390a = Vector3.zero();

    /* renamed from: b */
    private final Vector3 f3391b = Vector3.zero();

    /* renamed from: c */
    private float f3392c = 1.0f;

    /* renamed from: d */
    private final Vector3 f3393d = Vector3.zero();
    @Nullable

    /* renamed from: e */
    private IntBuffer f3394e;
    @Nullable

    /* renamed from: f */
    private FloatBuffer f3395f;
    @Nullable

    /* renamed from: g */
    private FloatBuffer f3396g;
    @Nullable

    /* renamed from: h */
    private FloatBuffer f3397h;
    @Nullable

    /* renamed from: i */
    private FloatBuffer f3398i;
    @Nullable

    /* renamed from: j */
    private IndexBuffer f3399j;
    @Nullable

    /* renamed from: k */
    private VertexBuffer f3400k;

    /* renamed from: l */
    private final ArrayList<C2141a> f3401l = new ArrayList<>();

    /* renamed from: com.google.ar.sceneform.rendering.j0$a */
    static class C2141a {

        /* renamed from: a */
        int f3402a;

        /* renamed from: b */
        int f3403b;

        C2141a() {
        }
    }

    C2140j0() {
    }

    /* renamed from: A */
    public void mo17730A(Vector3 vector3) {
        this.f3393d.set(vector3);
    }

    /* renamed from: B */
    public void mo17731B(float f) {
        this.f3392c = f;
    }

    /* renamed from: a */
    public float mo17357a() {
        return this.f3392c;
    }

    /* renamed from: b */
    public void mo17358b(@Nullable IndexBuffer indexBuffer) {
        this.f3399j = indexBuffer;
    }

    /* renamed from: c */
    public Vector3 mo17359c() {
        return new Vector3(this.f3393d);
    }

    @Nullable
    /* renamed from: d */
    public IndexBuffer mo17360d() {
        return this.f3399j;
    }

    /* renamed from: e */
    public Vector3 mo17361e() {
        return new Vector3(this.f3390a);
    }

    /* renamed from: f */
    public void mo17362f(@Nullable VertexBuffer vertexBuffer) {
        this.f3400k = vertexBuffer;
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        try {
            ThreadPools.getMainExecutor().execute(new C2138i0(this));
        } catch (Exception unused) {
        } catch (Throwable th) {
            super.finalize();
            throw th;
        }
        super.finalize();
    }

    /* renamed from: g */
    public void mo17363g(Vector3 vector3) {
        this.f3391b.set(vector3);
    }

    @Nullable
    /* renamed from: h */
    public VertexBuffer mo17364h() {
        return this.f3400k;
    }

    @Nullable
    /* renamed from: i */
    public FloatBuffer mo17365i() {
        return this.f3396g;
    }

    @Nullable
    /* renamed from: j */
    public FloatBuffer mo17366j() {
        return this.f3397h;
    }

    /* renamed from: k */
    public void mo17367k(@Nullable FloatBuffer floatBuffer) {
        this.f3397h = floatBuffer;
    }

    /* renamed from: l */
    public void mo17368l(@Nullable IntBuffer intBuffer) {
        this.f3394e = intBuffer;
    }

    @Nullable
    /* renamed from: m */
    public FloatBuffer mo17369m() {
        return this.f3395f;
    }

    /* renamed from: n */
    public void mo17370n(@Nullable FloatBuffer floatBuffer) {
        this.f3395f = floatBuffer;
    }

    @Nullable
    /* renamed from: o */
    public FloatBuffer mo17371o() {
        return this.f3398i;
    }

    /* renamed from: p */
    public void mo17372p(@Nullable FloatBuffer floatBuffer) {
        this.f3398i = floatBuffer;
    }

    @Nullable
    /* renamed from: q */
    public IntBuffer mo17373q() {
        return this.f3394e;
    }

    /* renamed from: r */
    public void mo17374r(@Nullable FloatBuffer floatBuffer) {
        this.f3396g = floatBuffer;
    }

    /* renamed from: s */
    public void mo17375s(Vector3 vector3) {
        this.f3390a.set(vector3);
    }

    /* renamed from: t */
    public Vector3 mo17376t() {
        return this.f3391b.scaled(2.0f);
    }

    /* renamed from: u */
    public ArrayList<C2141a> mo17377u() {
        return this.f3401l;
    }

    /* renamed from: v */
    public Vector3 mo17378v() {
        return new Vector3(this.f3391b);
    }

    /* renamed from: w */
    public void mo17379w(Renderable renderable, @Nullable SkeletonRig skeletonRig, @Entity int i) {
        IRenderableInternalData renderableData = renderable.getRenderableData();
        ArrayList<Material> materialBindings = renderable.getMaterialBindings();
        RenderableManager renderableManager = EngineInstance.getEngine().getRenderableManager();
        int instance = renderableManager.getInstance(i);
        int size = renderableData.mo17377u().size();
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
        Vector3 v = renderableData.mo17378v();
        Vector3 e = renderableData.mo17361e();
        renderableManager.setAxisAlignedBoundingBox(i2, new Box(e.f3277x, e.f3278y, e.f3279z, v.f3277x, v.f3278y, v.f3279z));
        if (materialBindings.size() == size) {
            RenderableManager.PrimitiveType primitiveType = RenderableManager.PrimitiveType.TRIANGLES;
            for (int i3 = 0; i3 < size; i3++) {
                C2141a aVar = renderableData.mo17377u().get(i3);
                VertexBuffer h = renderableData.mo17364h();
                IndexBuffer d = renderableData.mo17360d();
                if (h == null || d == null) {
                    throw new AssertionError("Internal Error: Failed to get vertex or index buffer");
                }
                int i4 = aVar.f3402a;
                renderableManager.setGeometryAt(i2, i3, primitiveType, h, d, i4, aVar.f3403b - i4);
                renderableManager.setMaterialInstanceAt(i2, i3, materialBindings.get(i3).getFilamentMaterialInstance());
            }
            return;
        }
        throw new AssertionError("Material Bindings are out of sync with meshes.");
    }

    /* renamed from: y */
    public void m5334z() {
        AndroidPreconditions.checkUiThread();
        IEngine engine = EngineInstance.getEngine();
        if (engine != null && engine.isValid()) {
            VertexBuffer vertexBuffer = this.f3400k;
            if (vertexBuffer != null) {
                engine.destroyVertexBuffer(vertexBuffer);
                this.f3400k = null;
            }
            IndexBuffer indexBuffer = this.f3399j;
            if (indexBuffer != null) {
                engine.destroyIndexBuffer(indexBuffer);
                this.f3399j = null;
            }
        }
    }
}
