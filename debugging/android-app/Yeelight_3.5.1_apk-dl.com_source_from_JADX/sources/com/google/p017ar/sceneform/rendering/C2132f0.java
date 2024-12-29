package com.google.p017ar.sceneform.rendering;

import androidx.annotation.Nullable;
import com.google.p017ar.core.Plane;
import com.google.p017ar.core.TrackingState;
import com.google.p017ar.sceneform.common.TransformProvider;
import com.google.p017ar.sceneform.math.Matrix;
import com.google.p017ar.sceneform.math.Vector3;
import com.google.p017ar.sceneform.rendering.ModelRenderable;
import com.google.p017ar.sceneform.rendering.RenderableDefinition;
import java.nio.FloatBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;

/* renamed from: com.google.ar.sceneform.rendering.f0 */
class C2132f0 implements TransformProvider {

    /* renamed from: a */
    private final Plane f3368a;

    /* renamed from: b */
    private final Renderer f3369b;

    /* renamed from: c */
    private final Matrix f3370c = new Matrix();

    /* renamed from: d */
    private boolean f3371d = false;

    /* renamed from: e */
    private boolean f3372e = false;

    /* renamed from: f */
    private boolean f3373f = false;

    /* renamed from: g */
    private boolean f3374g = false;
    @Nullable

    /* renamed from: h */
    private ModelRenderable f3375h = null;
    @Nullable

    /* renamed from: i */
    private RenderableInstance f3376i;

    /* renamed from: j */
    private final ArrayList<Vertex> f3377j;

    /* renamed from: k */
    private final ArrayList<Integer> f3378k;

    /* renamed from: l */
    private final RenderableDefinition f3379l;
    @Nullable

    /* renamed from: m */
    private RenderableDefinition.Submesh f3380m;
    @Nullable

    /* renamed from: n */
    private RenderableDefinition.Submesh f3381n;

    C2132f0(Plane plane, Renderer renderer) {
        ArrayList<Vertex> arrayList = new ArrayList<>();
        this.f3377j = arrayList;
        this.f3378k = new ArrayList<>();
        this.f3368a = plane;
        this.f3369b = renderer;
        this.f3379l = RenderableDefinition.builder().setVertices(arrayList).build();
    }

    /* renamed from: a */
    private void m5322a() {
        RenderableInstance renderableInstance;
        if (!this.f3371d && (renderableInstance = this.f3376i) != null) {
            this.f3369b.addInstance(renderableInstance);
            this.f3371d = true;
        }
    }

    /* renamed from: c */
    private void m5323c() {
        RenderableInstance renderableInstance;
        if (this.f3371d && (renderableInstance = this.f3376i) != null) {
            this.f3369b.removeInstance(renderableInstance);
            this.f3371d = false;
        }
    }

    /* renamed from: k */
    private boolean m5324k() {
        FloatBuffer polygon = this.f3368a.getPolygon();
        if (polygon == null) {
            return false;
        }
        polygon.rewind();
        int limit = polygon.limit() / 2;
        if (limit == 0) {
            return false;
        }
        this.f3377j.clear();
        this.f3377j.ensureCapacity(limit * 2);
        int i = limit - 2;
        this.f3378k.clear();
        this.f3378k.ensureCapacity((limit * 6) + (i * 3));
        Vector3 up = Vector3.m5216up();
        while (polygon.hasRemaining()) {
            this.f3377j.add(Vertex.builder().setPosition(new Vector3(polygon.get(), 0.0f, polygon.get())).setNormal(up).build());
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
            this.f3377j.add(Vertex.builder().setPosition(new Vector3(f * f3, 1.0f, f2 * f3)).setNormal(up).build());
        }
        short s = (short) limit;
        for (int i2 = 0; i2 < i; i2++) {
            this.f3378k.add(Integer.valueOf(s));
            int i3 = s + i2;
            this.f3378k.add(Integer.valueOf(i3 + 1));
            this.f3378k.add(Integer.valueOf(i3 + 2));
        }
        short s2 = 0;
        while (s2 < limit) {
            int i4 = 0 + s2;
            int i5 = s2 + 1;
            int i6 = i5 % limit;
            int i7 = 0 + i6;
            int i8 = s2 + s;
            this.f3378k.add(Integer.valueOf(i4));
            this.f3378k.add(Integer.valueOf(i7));
            this.f3378k.add(Integer.valueOf(i8));
            this.f3378k.add(Integer.valueOf(i8));
            this.f3378k.add(Integer.valueOf(i7));
            this.f3378k.add(Integer.valueOf(i6 + s));
            s2 = i5;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo17715b() {
        m5323c();
        this.f3375h = null;
    }

    /* renamed from: d */
    public void mo17716d(boolean z) {
        if (this.f3372e != z) {
            this.f3372e = z;
            mo17721i();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo17717e(Material material) {
        RenderableDefinition.Submesh submesh = this.f3380m;
        if (submesh == null) {
            this.f3380m = RenderableDefinition.Submesh.builder().setTriangleIndices(this.f3378k).setMaterial(material).build();
        } else {
            submesh.setMaterial(material);
        }
        if (this.f3375h != null) {
            mo17722j();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo17718f(Material material) {
        RenderableDefinition.Submesh submesh = this.f3381n;
        if (submesh == null) {
            this.f3381n = RenderableDefinition.Submesh.builder().setTriangleIndices(this.f3378k).setMaterial(material).build();
        } else {
            submesh.setMaterial(material);
        }
        if (this.f3375h != null) {
            mo17722j();
        }
    }

    /* renamed from: g */
    public void mo17719g(boolean z) {
        if (this.f3373f != z) {
            this.f3373f = z;
            mo17721i();
        }
    }

    public Matrix getWorldModelMatrix() {
        return this.f3370c;
    }

    /* renamed from: h */
    public void mo17720h(boolean z) {
        if (this.f3374g != z) {
            this.f3374g = z;
            mo17721i();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo17721i() {
        if (!this.f3372e || (!this.f3374g && !this.f3373f)) {
            m5323c();
        } else if (this.f3368a.getTrackingState() != TrackingState.TRACKING) {
            m5323c();
        } else {
            this.f3368a.getCenterPose().toMatrix(this.f3370c.data, 0);
            if (!m5324k()) {
                m5323c();
                return;
            }
            mo17722j();
            m5322a();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo17722j() {
        RenderableDefinition.Submesh submesh;
        RenderableDefinition.Submesh submesh2;
        List<RenderableDefinition.Submesh> submeshes = this.f3379l.getSubmeshes();
        submeshes.clear();
        if (this.f3374g && (submesh2 = this.f3380m) != null) {
            submeshes.add(submesh2);
        }
        if (this.f3373f && (submesh = this.f3381n) != null) {
            submeshes.add(submesh);
        }
        if (submeshes.isEmpty()) {
            m5323c();
            return;
        }
        ModelRenderable modelRenderable = this.f3375h;
        if (modelRenderable == null) {
            try {
                ModelRenderable modelRenderable2 = (ModelRenderable) ((ModelRenderable.Builder) ModelRenderable.builder().setSource(this.f3379l)).build().get();
                this.f3375h = modelRenderable2;
                modelRenderable2.setShadowCaster(false);
                this.f3376i = this.f3375h.createInstance(this);
            } catch (InterruptedException | ExecutionException unused) {
                throw new AssertionError("Unable to create plane renderable.");
            }
        } else {
            modelRenderable.updateFromDefinition(this.f3379l);
        }
        if (this.f3376i != null && submeshes.size() > 1) {
            this.f3376i.setBlendOrderAt(0, 0);
            this.f3376i.setBlendOrderAt(1, 1);
        }
    }
}
