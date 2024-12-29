package com.google.p107ar.sceneform.rendering;

import androidx.annotation.Nullable;
import com.google.android.filament.Entity;
import com.google.android.filament.IndexBuffer;
import com.google.android.filament.VertexBuffer;
import com.google.p107ar.sceneform.math.Vector3;
import com.google.p107ar.sceneform.rendering.C2769p0;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.util.ArrayList;

/* renamed from: com.google.ar.sceneform.rendering.IRenderableInternalData */
interface IRenderableInternalData {
    /* renamed from: a */
    float mo15905a();

    /* renamed from: b */
    void mo15906b(@Nullable IndexBuffer indexBuffer);

    /* renamed from: c */
    Vector3 mo15907c();

    @Nullable
    /* renamed from: d */
    IndexBuffer mo15908d();

    /* renamed from: e */
    Vector3 mo15909e();

    /* renamed from: f */
    void mo15910f(@Nullable VertexBuffer vertexBuffer);

    /* renamed from: g */
    void mo15911g(Vector3 vector3);

    @Nullable
    /* renamed from: h */
    VertexBuffer mo15912h();

    @Nullable
    /* renamed from: i */
    FloatBuffer mo15913i();

    @Nullable
    /* renamed from: j */
    FloatBuffer mo15914j();

    /* renamed from: k */
    void mo15915k(@Nullable FloatBuffer floatBuffer);

    /* renamed from: l */
    void mo15916l(@Nullable IntBuffer intBuffer);

    @Nullable
    /* renamed from: m */
    FloatBuffer mo15917m();

    /* renamed from: n */
    void mo15918n(@Nullable FloatBuffer floatBuffer);

    @Nullable
    /* renamed from: o */
    FloatBuffer mo15919o();

    /* renamed from: p */
    void mo15920p(@Nullable FloatBuffer floatBuffer);

    @Nullable
    /* renamed from: q */
    IntBuffer mo15921q();

    /* renamed from: r */
    void mo15922r(@Nullable FloatBuffer floatBuffer);

    /* renamed from: s */
    void mo15923s(Vector3 vector3);

    /* renamed from: t */
    Vector3 mo15924t();

    /* renamed from: u */
    ArrayList<C2769p0.C2770a> mo15925u();

    /* renamed from: v */
    Vector3 mo15926v();

    /* renamed from: w */
    void mo15927w(Renderable renderable, @Nullable SkeletonRig skeletonRig, @Entity int i);
}
