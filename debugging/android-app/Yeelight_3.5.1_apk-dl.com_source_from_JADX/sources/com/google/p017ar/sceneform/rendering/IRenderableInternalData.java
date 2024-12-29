package com.google.p017ar.sceneform.rendering;

import androidx.annotation.Nullable;
import com.google.android.filament.Entity;
import com.google.android.filament.IndexBuffer;
import com.google.android.filament.VertexBuffer;
import com.google.p017ar.sceneform.math.Vector3;
import com.google.p017ar.sceneform.rendering.C2140j0;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.util.ArrayList;

/* renamed from: com.google.ar.sceneform.rendering.IRenderableInternalData */
interface IRenderableInternalData {
    /* renamed from: a */
    float mo17357a();

    /* renamed from: b */
    void mo17358b(@Nullable IndexBuffer indexBuffer);

    /* renamed from: c */
    Vector3 mo17359c();

    @Nullable
    /* renamed from: d */
    IndexBuffer mo17360d();

    /* renamed from: e */
    Vector3 mo17361e();

    /* renamed from: f */
    void mo17362f(@Nullable VertexBuffer vertexBuffer);

    /* renamed from: g */
    void mo17363g(Vector3 vector3);

    @Nullable
    /* renamed from: h */
    VertexBuffer mo17364h();

    @Nullable
    /* renamed from: i */
    FloatBuffer mo17365i();

    @Nullable
    /* renamed from: j */
    FloatBuffer mo17366j();

    /* renamed from: k */
    void mo17367k(@Nullable FloatBuffer floatBuffer);

    /* renamed from: l */
    void mo17368l(@Nullable IntBuffer intBuffer);

    @Nullable
    /* renamed from: m */
    FloatBuffer mo17369m();

    /* renamed from: n */
    void mo17370n(@Nullable FloatBuffer floatBuffer);

    @Nullable
    /* renamed from: o */
    FloatBuffer mo17371o();

    /* renamed from: p */
    void mo17372p(@Nullable FloatBuffer floatBuffer);

    @Nullable
    /* renamed from: q */
    IntBuffer mo17373q();

    /* renamed from: r */
    void mo17374r(@Nullable FloatBuffer floatBuffer);

    /* renamed from: s */
    void mo17375s(Vector3 vector3);

    /* renamed from: t */
    Vector3 mo17376t();

    /* renamed from: u */
    ArrayList<C2140j0.C2141a> mo17377u();

    /* renamed from: v */
    Vector3 mo17378v();

    /* renamed from: w */
    void mo17379w(Renderable renderable, @Nullable SkeletonRig skeletonRig, @Entity int i);
}
