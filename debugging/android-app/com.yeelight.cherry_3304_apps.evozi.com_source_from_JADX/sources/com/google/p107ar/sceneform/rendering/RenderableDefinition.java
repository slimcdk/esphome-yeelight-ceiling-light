package com.google.p107ar.sceneform.rendering;

import androidx.annotation.Nullable;
import com.google.android.filament.IndexBuffer;
import com.google.android.filament.VertexBuffer;
import com.google.p107ar.sceneform.math.MathHelper;
import com.google.p107ar.sceneform.math.Matrix;
import com.google.p107ar.sceneform.math.Quaternion;
import com.google.p107ar.sceneform.math.Vector3;
import com.google.p107ar.sceneform.rendering.C2769p0;
import com.google.p107ar.sceneform.rendering.Vertex;
import com.google.p107ar.sceneform.utilities.AndroidPreconditions;
import com.google.p107ar.sceneform.utilities.Preconditions;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;

/* renamed from: com.google.ar.sceneform.rendering.RenderableDefinition */
public class RenderableDefinition {
    private static final int BYTES_PER_FLOAT = 4;
    private static final int COLOR_SIZE = 4;
    private static final int POSITION_SIZE = 3;
    private static final int TANGENTS_SIZE = 4;
    private static final int UV_SIZE = 2;
    private static final Matrix scratchMatrix = new Matrix();
    private List<Submesh> submeshes;
    private List<Vertex> vertices;

    /* renamed from: com.google.ar.sceneform.rendering.RenderableDefinition$Builder */
    public static final class Builder {
        /* access modifiers changed from: private */
        @Nullable
        public List<Submesh> submeshes = new ArrayList();
        /* access modifiers changed from: private */
        @Nullable
        public List<Vertex> vertices;

        public RenderableDefinition build() {
            return new RenderableDefinition(this);
        }

        public Builder setSubmeshes(List<Submesh> list) {
            this.submeshes = list;
            return this;
        }

        public Builder setVertices(List<Vertex> list) {
            this.vertices = list;
            return this;
        }
    }

    /* renamed from: com.google.ar.sceneform.rendering.RenderableDefinition$Submesh */
    public static class Submesh {
        private Material material;
        @Nullable
        private String name;
        private List<Integer> triangleIndices;

        /* renamed from: com.google.ar.sceneform.rendering.RenderableDefinition$Submesh$Builder */
        public static final class Builder {
            /* access modifiers changed from: private */
            @Nullable
            public Material material;
            /* access modifiers changed from: private */
            @Nullable
            public String name;
            /* access modifiers changed from: private */
            @Nullable
            public List<Integer> triangleIndices;

            public Submesh build() {
                return new Submesh(this);
            }

            public Builder setMaterial(Material material2) {
                this.material = material2;
                return this;
            }

            public Builder setName(String str) {
                this.name = str;
                return this;
            }

            public Builder setTriangleIndices(List<Integer> list) {
                this.triangleIndices = list;
                return this;
            }
        }

        private Submesh(Builder builder) {
            this.triangleIndices = (List) Preconditions.checkNotNull(builder.triangleIndices);
            this.material = (Material) Preconditions.checkNotNull(builder.material);
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public Material getMaterial() {
            return this.material;
        }

        @Nullable
        public String getName() {
            return this.name;
        }

        public List<Integer> getTriangleIndices() {
            return this.triangleIndices;
        }

        public void setMaterial(Material material2) {
            this.material = material2;
        }

        public void setName(String str) {
            this.name = str;
        }

        public void setTriangleIndices(List<Integer> list) {
            this.triangleIndices = list;
        }
    }

    private RenderableDefinition(Builder builder) {
        this.vertices = (List) Preconditions.checkNotNull(builder.vertices);
        this.submeshes = (List) Preconditions.checkNotNull(builder.submeshes);
    }

    private static void addColorToBuffer(Color color, FloatBuffer floatBuffer) {
        floatBuffer.put(color.f5213r);
        floatBuffer.put(color.f5212g);
        floatBuffer.put(color.f5211b);
        floatBuffer.put(color.f5210a);
    }

    private static void addQuaternionToBuffer(Quaternion quaternion, FloatBuffer floatBuffer) {
        floatBuffer.put(quaternion.f5199x);
        floatBuffer.put(quaternion.f5200y);
        floatBuffer.put(quaternion.f5201z);
        floatBuffer.put(quaternion.f5198w);
    }

    private static void addUvToBuffer(Vertex.UvCoordinate uvCoordinate, FloatBuffer floatBuffer) {
        floatBuffer.put(uvCoordinate.f5272x);
        floatBuffer.put(uvCoordinate.f5273y);
    }

    private static void addVector3ToBuffer(Vector3 vector3, FloatBuffer floatBuffer) {
        floatBuffer.put(vector3.f5202x);
        floatBuffer.put(vector3.f5203y);
        floatBuffer.put(vector3.f5204z);
    }

    private void applyDefinitionToDataIndexBuffer(IRenderableInternalData iRenderableInternalData) {
        int i = 0;
        for (int i2 = 0; i2 < this.submeshes.size(); i2++) {
            i += this.submeshes.get(i2).getTriangleIndices().size();
        }
        IntBuffer q = iRenderableInternalData.mo15921q();
        if (q == null || q.capacity() < i) {
            q = IntBuffer.allocate(i);
            iRenderableInternalData.mo15916l(q);
        } else {
            q.rewind();
        }
        for (int i3 = 0; i3 < this.submeshes.size(); i3++) {
            List<Integer> triangleIndices = this.submeshes.get(i3).getTriangleIndices();
            for (int i4 = 0; i4 < triangleIndices.size(); i4++) {
                q.put(triangleIndices.get(i4).intValue());
            }
        }
        q.rewind();
        IndexBuffer d = iRenderableInternalData.mo15908d();
        IEngine engine = EngineInstance.getEngine();
        if (d == null || d.getIndexCount() < i) {
            if (d != null) {
                engine.destroyIndexBuffer(d);
            }
            d = new IndexBuffer.Builder().indexCount(i).bufferType(IndexBuffer.Builder.IndexType.UINT).build(engine.getFilamentEngine());
            iRenderableInternalData.mo15906b(d);
        }
        d.setBuffer(engine.getFilamentEngine(), q, 0, i);
    }

    private void applyDefinitionToDataVertexBuffer(IRenderableInternalData iRenderableInternalData) {
        boolean z;
        FloatBuffer floatBuffer;
        if (!this.vertices.isEmpty()) {
            int size = this.vertices.size();
            int i = 0;
            Vertex vertex = this.vertices.get(0);
            EnumSet of = EnumSet.of(VertexBuffer.VertexAttribute.POSITION);
            if (vertex.getNormal() != null) {
                of.add(VertexBuffer.VertexAttribute.TANGENTS);
            }
            if (vertex.getUvCoordinate() != null) {
                of.add(VertexBuffer.VertexAttribute.UV0);
            }
            if (vertex.getColor() != null) {
                of.add(VertexBuffer.VertexAttribute.COLOR);
            }
            VertexBuffer h = iRenderableInternalData.mo15912h();
            if (h != null) {
                EnumSet of2 = EnumSet.of(VertexBuffer.VertexAttribute.POSITION);
                if (iRenderableInternalData.mo15913i() != null) {
                    of2.add(VertexBuffer.VertexAttribute.TANGENTS);
                }
                if (iRenderableInternalData.mo15914j() != null) {
                    of2.add(VertexBuffer.VertexAttribute.UV0);
                }
                if (iRenderableInternalData.mo15919o() != null) {
                    of2.add(VertexBuffer.VertexAttribute.COLOR);
                }
                z = !of2.equals(of) || h.getVertexCount() < size;
                if (z) {
                    EngineInstance.getEngine().destroyVertexBuffer(h);
                }
            } else {
                z = true;
            }
            if (z) {
                h = createVertexBuffer(size, of);
                iRenderableInternalData.mo15910f(h);
            }
            FloatBuffer m = iRenderableInternalData.mo15917m();
            if (m == null || m.capacity() < size * 3) {
                m = FloatBuffer.allocate(size * 3);
                iRenderableInternalData.mo15918n(m);
            } else {
                m.rewind();
            }
            FloatBuffer floatBuffer2 = m;
            FloatBuffer i2 = iRenderableInternalData.mo15913i();
            if (of.contains(VertexBuffer.VertexAttribute.TANGENTS) && (i2 == null || i2.capacity() < size * 4)) {
                i2 = FloatBuffer.allocate(size * 4);
                iRenderableInternalData.mo15922r(i2);
            } else if (i2 != null) {
                i2.rewind();
            }
            FloatBuffer floatBuffer3 = i2;
            FloatBuffer j = iRenderableInternalData.mo15914j();
            if (of.contains(VertexBuffer.VertexAttribute.UV0) && (j == null || j.capacity() < size * 2)) {
                j = FloatBuffer.allocate(size * 2);
                iRenderableInternalData.mo15915k(j);
            } else if (j != null) {
                j.rewind();
            }
            FloatBuffer floatBuffer4 = j;
            FloatBuffer o = iRenderableInternalData.mo15919o();
            if (!of.contains(VertexBuffer.VertexAttribute.COLOR) || (o != null && o.capacity() >= size * 4)) {
                if (o != null) {
                    o.rewind();
                }
                floatBuffer = o;
            } else {
                floatBuffer = FloatBuffer.allocate(size * 4);
                iRenderableInternalData.mo15920p(floatBuffer);
            }
            Vector3 vector3 = new Vector3();
            Vector3 vector32 = new Vector3();
            Vector3 position = vertex.getPosition();
            vector3.set(position);
            vector32.set(position);
            for (int i3 = 0; i3 < this.vertices.size(); i3++) {
                Vertex vertex2 = this.vertices.get(i3);
                Vector3 position2 = vertex2.getPosition();
                vector3.set(Vector3.min(vector3, position2));
                vector32.set(Vector3.max(vector32, position2));
                addVector3ToBuffer(position2, floatBuffer2);
                if (floatBuffer3 != null) {
                    Vector3 normal = vertex2.getNormal();
                    if (normal != null) {
                        addQuaternionToBuffer(normalToTangent(normal), floatBuffer3);
                    } else {
                        throw new IllegalArgumentException("Missing normal: If any Vertex in a RenderableDescription has a normal, all vertices must have one.");
                    }
                }
                if (floatBuffer4 != null) {
                    Vertex.UvCoordinate uvCoordinate = vertex2.getUvCoordinate();
                    if (uvCoordinate != null) {
                        addUvToBuffer(uvCoordinate, floatBuffer4);
                    } else {
                        throw new IllegalArgumentException("Missing UV Coordinate: If any Vertex in a RenderableDescription has a UV Coordinate, all vertices must have one.");
                    }
                }
                if (floatBuffer != null) {
                    Color color = vertex2.getColor();
                    if (color != null) {
                        addColorToBuffer(color, floatBuffer);
                    } else {
                        throw new IllegalArgumentException("Missing Color: If any Vertex in a RenderableDescription has a Color, all vertices must have one.");
                    }
                }
            }
            Vector3 scaled = Vector3.subtract(vector32, vector3).scaled(0.5f);
            Vector3 add = Vector3.add(vector3, scaled);
            iRenderableInternalData.mo15911g(scaled);
            iRenderableInternalData.mo15923s(add);
            if (h != null) {
                IEngine engine = EngineInstance.getEngine();
                floatBuffer2.rewind();
                h.setBufferAt(engine.getFilamentEngine(), 0, floatBuffer2, 0, size * 3);
                if (floatBuffer3 != null) {
                    floatBuffer3.rewind();
                    i = 1;
                    h.setBufferAt(engine.getFilamentEngine(), 1, floatBuffer3, 0, size * 4);
                }
                if (floatBuffer4 != null) {
                    floatBuffer4.rewind();
                    i++;
                    h.setBufferAt(engine.getFilamentEngine(), i, floatBuffer4, 0, size * 2);
                }
                if (floatBuffer != null) {
                    floatBuffer.rewind();
                    h.setBufferAt(engine.getFilamentEngine(), i + 1, floatBuffer, 0, size * 4);
                    return;
                }
                return;
            }
            throw new AssertionError("VertexBuffer is null.");
        }
        throw new IllegalArgumentException("RenderableDescription must have at least one vertex.");
    }

    public static Builder builder() {
        return new Builder();
    }

    private static VertexBuffer createVertexBuffer(int i, EnumSet<VertexBuffer.VertexAttribute> enumSet) {
        int i2;
        VertexBuffer.Builder builder = new VertexBuffer.Builder();
        builder.vertexCount(i).bufferCount(enumSet.size());
        builder.attribute(VertexBuffer.VertexAttribute.POSITION, 0, VertexBuffer.AttributeType.FLOAT3, 0, 12);
        if (enumSet.contains(VertexBuffer.VertexAttribute.TANGENTS)) {
            i2 = 1;
            builder.attribute(VertexBuffer.VertexAttribute.TANGENTS, 1, VertexBuffer.AttributeType.FLOAT4, 0, 16);
        } else {
            i2 = 0;
        }
        if (enumSet.contains(VertexBuffer.VertexAttribute.UV0)) {
            i2++;
            builder.attribute(VertexBuffer.VertexAttribute.UV0, i2, VertexBuffer.AttributeType.FLOAT2, 0, 8);
        }
        if (enumSet.contains(VertexBuffer.VertexAttribute.COLOR)) {
            VertexBuffer.Builder builder2 = builder;
            builder2.attribute(VertexBuffer.VertexAttribute.COLOR, i2 + 1, VertexBuffer.AttributeType.FLOAT4, 0, 16);
        }
        return builder.build(EngineInstance.getEngine().getFilamentEngine());
    }

    private static Quaternion normalToTangent(Vector3 vector3) {
        Vector3 vector32;
        Vector3 cross = Vector3.cross(Vector3.m8263up(), vector3);
        if (MathHelper.almostEqualRelativeAndAbs(Vector3.dot(cross, cross), 0.0f)) {
            Vector3 normalized = Vector3.cross(vector3, Vector3.right()).normalized();
            vector32 = normalized;
            cross = Vector3.cross(normalized, vector3).normalized();
        } else {
            cross.set(cross.normalized());
            vector32 = Vector3.cross(vector3, cross).normalized();
        }
        float[] fArr = scratchMatrix.data;
        fArr[0] = cross.f5202x;
        fArr[1] = cross.f5203y;
        fArr[2] = cross.f5204z;
        fArr[4] = vector32.f5202x;
        fArr[5] = vector32.f5203y;
        fArr[6] = vector32.f5204z;
        fArr[8] = vector3.f5202x;
        fArr[9] = vector3.f5203y;
        fArr[10] = vector3.f5204z;
        Quaternion quaternion = new Quaternion();
        scratchMatrix.extractQuaternion(quaternion);
        return quaternion;
    }

    /* access modifiers changed from: package-private */
    public void applyDefinitionToData(IRenderableInternalData iRenderableInternalData, ArrayList<Material> arrayList, ArrayList<String> arrayList2) {
        C2769p0.C2770a aVar;
        AndroidPreconditions.checkUiThread();
        applyDefinitionToDataIndexBuffer(iRenderableInternalData);
        applyDefinitionToDataVertexBuffer(iRenderableInternalData);
        arrayList.clear();
        arrayList2.clear();
        int i = 0;
        for (int i2 = 0; i2 < this.submeshes.size(); i2++) {
            Submesh submesh = this.submeshes.get(i2);
            if (i2 < iRenderableInternalData.mo15925u().size()) {
                aVar = iRenderableInternalData.mo15925u().get(i2);
            } else {
                aVar = new C2769p0.C2770a();
                iRenderableInternalData.mo15925u().add(aVar);
            }
            aVar.f5365a = i;
            i += submesh.getTriangleIndices().size();
            aVar.f5366b = i;
            arrayList.add(submesh.getMaterial());
            String name = submesh.getName();
            if (name == null) {
                name = "";
            }
            arrayList2.add(name);
        }
        while (iRenderableInternalData.mo15925u().size() > this.submeshes.size()) {
            iRenderableInternalData.mo15925u().remove(iRenderableInternalData.mo15925u().size() - 1);
        }
    }

    /* access modifiers changed from: package-private */
    public List<Submesh> getSubmeshes() {
        return this.submeshes;
    }

    /* access modifiers changed from: package-private */
    public List<Vertex> getVertices() {
        return this.vertices;
    }

    public void setSubmeshes(List<Submesh> list) {
        this.submeshes = list;
    }

    public void setVertices(List<Vertex> list) {
        this.vertices = list;
    }
}
