package com.google.p107ar.sceneform.rendering;

import androidx.annotation.Nullable;
import com.google.p107ar.core.Plane;
import com.google.p107ar.core.TrackingState;
import com.google.p107ar.sceneform.common.TransformProvider;
import com.google.p107ar.sceneform.math.Matrix;
import com.google.p107ar.sceneform.math.Vector3;
import com.google.p107ar.sceneform.rendering.ModelRenderable;
import com.google.p107ar.sceneform.rendering.RenderableDefinition;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;

/* renamed from: com.google.ar.sceneform.rendering.o0 */
class C2767o0 implements TransformProvider {

    /* renamed from: a */
    private final Plane f5338a;

    /* renamed from: b */
    private final Renderer f5339b;

    /* renamed from: c */
    private final Matrix f5340c = new Matrix();

    /* renamed from: d */
    private boolean f5341d = false;

    /* renamed from: e */
    private boolean f5342e = false;

    /* renamed from: f */
    private boolean f5343f = false;

    /* renamed from: g */
    private boolean f5344g = false;
    @Nullable

    /* renamed from: h */
    private ModelRenderable f5345h = null;
    @Nullable

    /* renamed from: i */
    private RenderableInstance f5346i;

    /* renamed from: j */
    private final ArrayList<Vertex> f5347j = new ArrayList<>();

    /* renamed from: k */
    private final ArrayList<Integer> f5348k = new ArrayList<>();

    /* renamed from: l */
    private final RenderableDefinition f5349l;
    @Nullable

    /* renamed from: m */
    private RenderableDefinition.Submesh f5350m;
    @Nullable

    /* renamed from: n */
    private RenderableDefinition.Submesh f5351n;

    C2767o0(Plane plane, Renderer renderer) {
        this.f5338a = plane;
        this.f5339b = renderer;
        this.f5349l = RenderableDefinition.builder().setVertices(this.f5347j).build();
    }

    /* renamed from: a */
    private void m8400a() {
        RenderableInstance renderableInstance;
        if (!this.f5341d && (renderableInstance = this.f5346i) != null) {
            this.f5339b.addInstance(renderableInstance);
            this.f5341d = true;
        }
    }

    /* renamed from: c */
    private void m8401c() {
        RenderableInstance renderableInstance;
        if (this.f5341d && (renderableInstance = this.f5346i) != null) {
            this.f5339b.removeInstance(renderableInstance);
            this.f5341d = false;
        }
    }

    /* renamed from: k */
    private boolean m8402k() {
        FloatBuffer polygon = this.f5338a.getPolygon();
        if (polygon == null) {
            return false;
        }
        polygon.rewind();
        int limit = polygon.limit() / 2;
        if (limit == 0) {
            return false;
        }
        this.f5347j.clear();
        this.f5347j.ensureCapacity(limit * 2);
        int i = limit - 2;
        this.f5348k.clear();
        this.f5348k.ensureCapacity((limit * 6) + (i * 3));
        Vector3 up = Vector3.m8263up();
        while (polygon.hasRemaining()) {
            this.f5347j.add(Vertex.builder().setPosition(new Vector3(polygon.get(), 0.0f, polygon.get())).setNormal(up).build());
        }
        polygon.rewind();
        while (polygon.hasRemaining()) {
            float f = polygon.get();
            float f2 = polygon.get();
            float hypot = (float) Math.hypot((double) f, (double) f2);
            float f3 = 0.8f;
            if (hypot != 0.0f) {
                f3 = 1.0f - Math.min(0.2f / hypot, 0.2f);
            }
            this.f5347j.add(Vertex.builder().setPosition(new Vector3(f * f3, 1.0f, f2 * f3)).setNormal(up).build());
        }
        short s = (short) limit;
        for (int i2 = 0; i2 < i; i2++) {
            this.f5348k.add(Integer.valueOf(s));
            int i3 = s + i2;
            this.f5348k.add(Integer.valueOf(i3 + 1));
            this.f5348k.add(Integer.valueOf(i3 + 2));
        }
        short s2 = 0;
        while (s2 < limit) {
            int i4 = 0 + s2;
            int i5 = s2 + 1;
            int i6 = i5 % limit;
            int i7 = 0 + i6;
            int i8 = s2 + s;
            this.f5348k.add(Integer.valueOf(i4));
            this.f5348k.add(Integer.valueOf(i7));
            this.f5348k.add(Integer.valueOf(i8));
            this.f5348k.add(Integer.valueOf(i8));
            this.f5348k.add(Integer.valueOf(i7));
            this.f5348k.add(Integer.valueOf(i6 + s));
            s2 = i5;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo16295b() {
        m8401c();
        this.f5345h = null;
    }

    /* renamed from: d */
    public void mo16296d(boolean z) {
        if (this.f5342e != z) {
            this.f5342e = z;
            mo16301i();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo16297e(Material material) {
        RenderableDefinition.Submesh submesh = this.f5350m;
        if (submesh == null) {
            this.f5350m = RenderableDefinition.Submesh.builder().setTriangleIndices(this.f5348k).setMaterial(material).build();
        } else {
            submesh.setMaterial(material);
        }
        if (this.f5345h != null) {
            mo16302j();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo16298f(Material material) {
        RenderableDefinition.Submesh submesh = this.f5351n;
        if (submesh == null) {
            this.f5351n = RenderableDefinition.Submesh.builder().setTriangleIndices(this.f5348k).setMaterial(material).build();
        } else {
            submesh.setMaterial(material);
        }
        if (this.f5345h != null) {
            mo16302j();
        }
    }

    /* renamed from: g */
    public void mo16299g(boolean z) {
        if (this.f5343f != z) {
            this.f5343f = z;
            mo16301i();
        }
    }

    public Matrix getWorldModelMatrix() {
        return this.f5340c;
    }

    /* renamed from: h */
    public void mo16300h(boolean z) {
        if (this.f5344g != z) {
            this.f5344g = z;
            mo16301i();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo16301i() {
        if (!this.f5342e || (!this.f5344g && !this.f5343f)) {
            m8401c();
        } else if (this.f5338a.getTrackingState() != TrackingState.TRACKING) {
            m8401c();
        } else {
            this.f5338a.getCenterPose().toMatrix(this.f5340c.data, 0);
            if (!m8402k()) {
                m8401c();
                return;
            }
            mo16302j();
            m8400a();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo16302j() {
        RenderableDefinition.Submesh submesh;
        RenderableDefinition.Submesh submesh2;
        List<RenderableDefinition.Submesh> submeshes = this.f5349l.getSubmeshes();
        submeshes.clear();
        if (this.f5344g && (submesh2 = this.f5350m) != null) {
            submeshes.add(submesh2);
        }
        if (this.f5343f && (submesh = this.f5351n) != null) {
            submeshes.add(submesh);
        }
        if (submeshes.isEmpty()) {
            m8401c();
            return;
        }
        ModelRenderable modelRenderable = this.f5345h;
        if (modelRenderable == null) {
            try {
                ModelRenderable modelRenderable2 = (ModelRenderable) ((ModelRenderable.Builder) ModelRenderable.builder().setSource(this.f5349l)).build().get();
                this.f5345h = modelRenderable2;
                modelRenderable2.setShadowCaster(false);
                this.f5346i = this.f5345h.createInstance(this);
            } catch (InterruptedException | ExecutionException unused) {
                throw new AssertionError("Unable to create plane renderable.");
            }
        } else {
            modelRenderable.updateFromDefinition(this.f5349l);
        }
        if (this.f5346i != null && submeshes.size() > 1) {
            this.f5346i.setBlendOrderAt(0, 0);
            this.f5346i.setBlendOrderAt(1, 1);
        }
    }
}
