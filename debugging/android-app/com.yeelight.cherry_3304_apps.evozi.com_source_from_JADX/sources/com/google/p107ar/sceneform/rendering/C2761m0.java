package com.google.p107ar.sceneform.rendering;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.filament.IndexBuffer;
import com.google.android.filament.TextureSampler;
import com.google.android.filament.VertexBuffer;
import com.google.p107ar.sceneform.math.Vector3;
import com.google.p107ar.sceneform.rendering.C2769p0;
import com.google.p107ar.sceneform.rendering.Renderable;
import com.google.p107ar.sceneform.rendering.SceneformBundle;
import com.google.p107ar.sceneform.rendering.Texture;
import com.google.p107ar.sceneform.utilities.Preconditions;
import com.google.p107ar.sceneform.utilities.SceneformBufferUtils;
import com.google.p107ar.schemas.lull.ModelDef;
import com.google.p107ar.schemas.lull.ModelIndexRange;
import com.google.p107ar.schemas.lull.ModelInstanceDef;
import com.google.p107ar.schemas.lull.SkeletonDef;
import com.google.p107ar.schemas.lull.Vec3;
import com.google.p107ar.schemas.lull.VertexAttribute;
import com.google.p107ar.schemas.sceneform.CompiledMaterialDef;
import com.google.p107ar.schemas.sceneform.SamplerDef;
import com.google.p107ar.schemas.sceneform.SceneformBundleDef;
import com.google.p107ar.schemas.sceneform.TransformDef;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;
import java.util.concurrent.CompletionStage;

/* renamed from: com.google.ar.sceneform.rendering.m0 */
class C2761m0<T extends Renderable> {

    /* renamed from: t */
    private static final String f5310t = "m0";

    /* renamed from: a */
    private final T f5311a;

    /* renamed from: b */
    private final C2769p0 f5312b;
    @Nullable

    /* renamed from: c */
    private final Uri f5313c;

    /* renamed from: d */
    private ModelDef f5314d;

    /* renamed from: e */
    private ModelInstanceDef f5315e;

    /* renamed from: f */
    private TransformDef f5316f;

    /* renamed from: g */
    private int f5317g;

    /* renamed from: h */
    private int f5318h;

    /* renamed from: i */
    private int f5319i;

    /* renamed from: j */
    private int f5320j;

    /* renamed from: k */
    private int f5321k;

    /* renamed from: l */
    private IndexBuffer.Builder.IndexType f5322l;

    /* renamed from: m */
    private ByteBuffer f5323m;

    /* renamed from: n */
    private ByteBuffer f5324n;

    /* renamed from: o */
    private final ArrayList<C2763b> f5325o = new ArrayList<>();

    /* renamed from: p */
    private final ArrayList<Material> f5326p = new ArrayList<>();

    /* renamed from: q */
    private final ArrayList<Integer> f5327q = new ArrayList<>();

    /* renamed from: r */
    private final ArrayList<MaterialParameters> f5328r = new ArrayList<>();

    /* renamed from: s */
    private final ArrayList<String> f5329s = new ArrayList<>();

    /* renamed from: com.google.ar.sceneform.rendering.m0$a */
    static /* synthetic */ class C2762a {

        /* renamed from: a */
        static final /* synthetic */ int[] f5330a;

        /* renamed from: b */
        static final /* synthetic */ int[] f5331b;

        /* renamed from: c */
        static final /* synthetic */ int[] f5332c;

        /* JADX WARNING: Can't wrap try/catch for region: R(26:0|(2:1|2)|3|(2:5|6)|7|9|10|11|13|14|15|16|17|18|19|20|21|22|23|24|25|27|28|29|30|32) */
        /* JADX WARNING: Can't wrap try/catch for region: R(27:0|1|2|3|(2:5|6)|7|9|10|11|13|14|15|16|17|18|19|20|21|22|23|24|25|27|28|29|30|32) */
        /* JADX WARNING: Can't wrap try/catch for region: R(28:0|1|2|3|5|6|7|9|10|11|13|14|15|16|17|18|19|20|21|22|23|24|25|27|28|29|30|32) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0039 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0043 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x004d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0058 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0063 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x007f */
        static {
            /*
                com.google.android.filament.TextureSampler$WrapMode[] r0 = com.google.android.filament.TextureSampler.WrapMode.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f5332c = r0
                r1 = 1
                com.google.android.filament.TextureSampler$WrapMode r2 = com.google.android.filament.TextureSampler.WrapMode.CLAMP_TO_EDGE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f5332c     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.android.filament.TextureSampler$WrapMode r3 = com.google.android.filament.TextureSampler.WrapMode.REPEAT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f5332c     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.android.filament.TextureSampler$WrapMode r4 = com.google.android.filament.TextureSampler.WrapMode.MIRRORED_REPEAT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                com.google.android.filament.TextureSampler$MinFilter[] r3 = com.google.android.filament.TextureSampler.MinFilter.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                f5331b = r3
                com.google.android.filament.TextureSampler$MinFilter r4 = com.google.android.filament.TextureSampler.MinFilter.NEAREST     // Catch:{ NoSuchFieldError -> 0x0039 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0039 }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                int[] r3 = f5331b     // Catch:{ NoSuchFieldError -> 0x0043 }
                com.google.android.filament.TextureSampler$MinFilter r4 = com.google.android.filament.TextureSampler.MinFilter.LINEAR     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r3[r4] = r0     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                int[] r3 = f5331b     // Catch:{ NoSuchFieldError -> 0x004d }
                com.google.android.filament.TextureSampler$MinFilter r4 = com.google.android.filament.TextureSampler.MinFilter.NEAREST_MIPMAP_NEAREST     // Catch:{ NoSuchFieldError -> 0x004d }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x004d }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x004d }
            L_0x004d:
                int[] r2 = f5331b     // Catch:{ NoSuchFieldError -> 0x0058 }
                com.google.android.filament.TextureSampler$MinFilter r3 = com.google.android.filament.TextureSampler.MinFilter.LINEAR_MIPMAP_NEAREST     // Catch:{ NoSuchFieldError -> 0x0058 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0058 }
                r4 = 4
                r2[r3] = r4     // Catch:{ NoSuchFieldError -> 0x0058 }
            L_0x0058:
                int[] r2 = f5331b     // Catch:{ NoSuchFieldError -> 0x0063 }
                com.google.android.filament.TextureSampler$MinFilter r3 = com.google.android.filament.TextureSampler.MinFilter.NEAREST_MIPMAP_LINEAR     // Catch:{ NoSuchFieldError -> 0x0063 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0063 }
                r4 = 5
                r2[r3] = r4     // Catch:{ NoSuchFieldError -> 0x0063 }
            L_0x0063:
                int[] r2 = f5331b     // Catch:{ NoSuchFieldError -> 0x006e }
                com.google.android.filament.TextureSampler$MinFilter r3 = com.google.android.filament.TextureSampler.MinFilter.LINEAR_MIPMAP_LINEAR     // Catch:{ NoSuchFieldError -> 0x006e }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x006e }
                r4 = 6
                r2[r3] = r4     // Catch:{ NoSuchFieldError -> 0x006e }
            L_0x006e:
                com.google.android.filament.TextureSampler$MagFilter[] r2 = com.google.android.filament.TextureSampler.MagFilter.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                f5330a = r2
                com.google.android.filament.TextureSampler$MagFilter r3 = com.google.android.filament.TextureSampler.MagFilter.NEAREST     // Catch:{ NoSuchFieldError -> 0x007f }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x007f }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x007f }
            L_0x007f:
                int[] r1 = f5330a     // Catch:{ NoSuchFieldError -> 0x0089 }
                com.google.android.filament.TextureSampler$MagFilter r2 = com.google.android.filament.TextureSampler.MagFilter.LINEAR     // Catch:{ NoSuchFieldError -> 0x0089 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0089 }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0089 }
            L_0x0089:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.p107ar.sceneform.rendering.C2761m0.C2762a.<clinit>():void");
        }
    }

    /* renamed from: com.google.ar.sceneform.rendering.m0$b */
    private static class C2763b {

        /* renamed from: a */
        String f5333a;
        /* access modifiers changed from: package-private */
        @Nullable

        /* renamed from: b */
        public Texture f5334b = null;

        C2763b(String str) {
            this.f5333a = str;
        }
    }

    C2761m0(T t, @Nullable Uri uri) {
        this.f5311a = t;
        IRenderableInternalData renderableData = t.getRenderableData();
        if (renderableData instanceof C2769p0) {
            this.f5312b = (C2769p0) renderableData;
            this.f5313c = uri;
            return;
        }
        String valueOf = String.valueOf(f5310t);
        throw new IllegalStateException(valueOf.length() != 0 ? "Expected task type ".concat(valueOf) : new String("Expected task type "));
    }

    /* renamed from: A */
    private T m8370A(SceneformBundleDef sceneformBundleDef) {
        Preconditions.checkNotNull(sceneformBundleDef);
        m8371B();
        m8372C(sceneformBundleDef);
        m8373D();
        this.f5311a.getId().update();
        return this.f5311a;
    }

    /* renamed from: B */
    private void m8371B() {
        IEngine engine = EngineInstance.getEngine();
        IndexBuffer build = new IndexBuffer.Builder().indexCount(this.f5321k).bufferType(this.f5322l).build(engine.getFilamentEngine());
        build.setBuffer(engine.getFilamentEngine(), this.f5324n);
        this.f5312b.mo15906b(build);
        VertexBuffer.Builder bufferCount = new VertexBuffer.Builder().vertexCount(this.f5319i).bufferCount(1);
        int vertexAttributesLength = this.f5315e.vertexAttributesLength();
        int i = 0;
        for (int i2 = 0; i2 < vertexAttributesLength; i2++) {
            VertexAttribute vertexAttributes = this.f5315e.vertexAttributes(i2);
            VertexBuffer.VertexAttribute g = m8379g(vertexAttributes.usage());
            if (g != null) {
                bufferCount.attribute(g, 0, m8378f(vertexAttributes.type()), i, this.f5320j);
                if (m8382j(vertexAttributes.usage())) {
                    bufferCount.normalized(g);
                }
            }
            i += m8381i(vertexAttributes.type());
        }
        VertexBuffer build2 = bufferCount.build(engine.getFilamentEngine());
        build2.setBufferAt(engine.getFilamentEngine(), 0, this.f5323m);
        this.f5312b.mo15910f(build2);
        m8395z();
    }

    /* renamed from: C */
    private void m8372C(SceneformBundleDef sceneformBundleDef) {
        int compiledMaterialsLength = sceneformBundleDef.compiledMaterialsLength();
        int i = 0;
        while (i < compiledMaterialsLength) {
            CompiledMaterialDef compiledMaterials = sceneformBundleDef.compiledMaterials(i);
            int hashCode = compiledMaterials.compiledMaterialAsByteBuffer().hashCode();
            try {
                Material now = Material.builder().setSource(SceneformBufferUtils.copyByteBuffer(compiledMaterials.compiledMaterialAsByteBuffer())).setRegistryId(Integer.valueOf(hashCode)).build().getNow((Object) null);
                if (now != null) {
                    this.f5326p.add(now);
                    i++;
                } else {
                    throw new AssertionError("Material wasn't loaded.");
                }
            } catch (IOException e) {
                throw new CompletionException("Failed to create material", e);
            }
        }
    }

    /* renamed from: D */
    private void m8373D() {
        Vec3 min = this.f5314d.boundingBox().min();
        Vector3 vector3 = new Vector3(min.mo16783x(), min.mo16784y(), min.mo16785z());
        Vec3 max = this.f5314d.boundingBox().max();
        Vector3 scaled = Vector3.subtract(new Vector3(max.mo16783x(), max.mo16784y(), max.mo16785z()), vector3).scaled(0.5f);
        Vector3 add = Vector3.add(vector3, scaled);
        this.f5312b.mo15911g(scaled);
        this.f5312b.mo15923s(add);
        TransformDef transformDef = this.f5316f;
        if (!(transformDef == null || transformDef.scale() == 0.0f)) {
            Vec3 offset = this.f5316f.offset();
            Vector3 vector32 = new Vector3(offset.mo16783x(), offset.mo16784y(), offset.mo16785z());
            this.f5312b.mo16304A(this.f5316f.scale());
            this.f5312b.mo16308z(vector32);
        }
        ArrayList<Material> materialBindings = this.f5311a.getMaterialBindings();
        ArrayList<String> materialNames = this.f5311a.getMaterialNames();
        materialBindings.clear();
        materialNames.clear();
        for (int i = 0; i < this.f5317g; i++) {
            ModelIndexRange ranges = this.f5315e.ranges(i);
            int start = (int) ranges.start();
            int end = (int) ranges.end();
            Material makeCopy = this.f5326p.get(this.f5327q.get(i).intValue()).makeCopy();
            makeCopy.copyMaterialParameters(this.f5328r.get(i));
            C2769p0.C2770a aVar = new C2769p0.C2770a();
            materialBindings.add(makeCopy);
            materialNames.add(this.f5329s.get(i));
            aVar.f5365a = start;
            aVar.f5366b = end;
            this.f5312b.mo15925u().add(aVar);
        }
    }

    /* renamed from: a */
    private void m8374a() {
        ByteBuffer allocateDirect;
        ByteBuffer indices16AsByteBuffer;
        ByteBuffer vertexDataAsByteBuffer = this.f5315e.vertexDataAsByteBuffer();
        Preconditions.checkNotNull(vertexDataAsByteBuffer, "Model Instance geometry data is invalid (vertexData is null).");
        int vertexDataLength = this.f5315e.vertexDataLength();
        this.f5317g = this.f5315e.rangesLength();
        this.f5319i = vertexDataLength / LullModel.getByteCountPerVertex(this.f5315e);
        if (this.f5315e.indices32Length() > 0) {
            int indices32Length = this.f5315e.indices32Length();
            this.f5321k = indices32Length;
            this.f5322l = IndexBuffer.Builder.IndexType.UINT;
            allocateDirect = ByteBuffer.allocateDirect(indices32Length * 4);
            this.f5324n = allocateDirect;
            indices16AsByteBuffer = this.f5315e.indices32AsByteBuffer();
        } else if (this.f5315e.indices16Length() > 0) {
            int indices16Length = this.f5315e.indices16Length();
            this.f5321k = indices16Length;
            this.f5322l = IndexBuffer.Builder.IndexType.USHORT;
            allocateDirect = ByteBuffer.allocateDirect(indices16Length * 2);
            this.f5324n = allocateDirect;
            indices16AsByteBuffer = this.f5315e.indices16AsByteBuffer();
        } else {
            throw new AssertionError("Model Instance geometry data is invalid (model has no index data).");
        }
        allocateDirect.put(indices16AsByteBuffer);
        this.f5324n.flip();
        ByteBuffer allocateDirect2 = ByteBuffer.allocateDirect(vertexDataAsByteBuffer.remaining());
        this.f5323m = allocateDirect2;
        Preconditions.checkNotNull(allocateDirect2, "Failed to allocate geometry for FilamentModel.");
        this.f5323m.put(vertexDataAsByteBuffer);
        this.f5323m.flip();
        this.f5320j = 0;
        int vertexAttributesLength = this.f5315e.vertexAttributesLength();
        for (int i = 0; i < vertexAttributesLength; i++) {
            this.f5320j += m8381i(this.f5315e.vertexAttributes(i).type());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x01b2, code lost:
        r6 = r31;
        r19 = r1;
        r20 = r2;
        r21 = r3;
        r2 = r18;
        r1 = r25;
        r11 = r27;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0203, code lost:
        r19 = r1;
        r20 = r2;
        r21 = r3;
        r2 = r18;
        r1 = r25;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0257, code lost:
        r19 = r1;
        r20 = r2;
        r21 = r3;
        r28 = r4;
        r29 = r6;
        r30 = r11;
        r2 = r18;
        r1 = r25;
        r11 = r27;
        r6 = r31;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0271, code lost:
        r0 = r11 + 1;
        r25 = r1;
        r18 = r2;
        r1 = r19;
        r2 = r20;
        r3 = r21;
        r4 = r28;
        r6 = r29;
        r11 = r30;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.google.p107ar.schemas.sceneform.SceneformBundleDef m8375b(com.google.p107ar.schemas.sceneform.SceneformBundleDef r32) {
        /*
            r31 = this;
            r0 = r31
            r1 = r32
            int r2 = r32.materialsLength()
            if (r2 != 0) goto L_0x000b
            return r1
        L_0x000b:
            r4 = 0
        L_0x000c:
            int r5 = r0.f5317g
            if (r4 >= r5) goto L_0x02a3
            if (r2 > r4) goto L_0x0015
            int r5 = r2 + -1
            goto L_0x0016
        L_0x0015:
            r5 = r4
        L_0x0016:
            com.google.ar.schemas.sceneform.MaterialDef r5 = r1.materials(r5)
            if (r5 != 0) goto L_0x003a
            r5 = 29
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r5)
            java.lang.String r5 = "Material "
            r6.append(r5)
            r6.append(r4)
            java.lang.String r5 = " is null."
            r6.append(r5)
            r6.toString()
            r6 = r0
            r16 = r2
            r17 = r4
            goto L_0x029a
        L_0x003a:
            java.util.ArrayList<java.lang.Integer> r6 = r0.f5327q
            int r7 = r5.compiledIndex()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r6.add(r7)
            com.google.ar.schemas.sceneform.ParameterDef r6 = new com.google.ar.schemas.sceneform.ParameterDef
            r6.<init>()
            com.google.ar.schemas.sceneform.ParameterInitDef r7 = new com.google.ar.schemas.sceneform.ParameterInitDef
            r7.<init>()
            com.google.ar.schemas.sceneform.ScalarInit r8 = new com.google.ar.schemas.sceneform.ScalarInit
            r8.<init>()
            com.google.ar.schemas.sceneform.Vec2Init r9 = new com.google.ar.schemas.sceneform.Vec2Init
            r9.<init>()
            com.google.ar.schemas.sceneform.Vec3Init r10 = new com.google.ar.schemas.sceneform.Vec3Init
            r10.<init>()
            com.google.ar.schemas.sceneform.Vec4Init r11 = new com.google.ar.schemas.sceneform.Vec4Init
            r11.<init>()
            com.google.ar.schemas.sceneform.BoolInit r12 = new com.google.ar.schemas.sceneform.BoolInit
            r12.<init>()
            com.google.ar.schemas.sceneform.BoolVec2Init r13 = new com.google.ar.schemas.sceneform.BoolVec2Init
            r13.<init>()
            com.google.ar.schemas.sceneform.BoolVec3Init r14 = new com.google.ar.schemas.sceneform.BoolVec3Init
            r14.<init>()
            com.google.ar.schemas.sceneform.BoolVec4Init r15 = new com.google.ar.schemas.sceneform.BoolVec4Init
            r15.<init>()
            com.google.ar.schemas.sceneform.IntInit r3 = new com.google.ar.schemas.sceneform.IntInit
            r3.<init>()
            r16 = r2
            com.google.ar.schemas.sceneform.IntVec2Init r2 = new com.google.ar.schemas.sceneform.IntVec2Init
            r2.<init>()
            com.google.ar.schemas.sceneform.IntVec3Init r1 = new com.google.ar.schemas.sceneform.IntVec3Init
            r1.<init>()
            r17 = r4
            com.google.ar.schemas.sceneform.IntVec4Init r4 = new com.google.ar.schemas.sceneform.IntVec4Init
            r4.<init>()
            r18 = r8
            com.google.ar.schemas.sceneform.SamplerInit r8 = new com.google.ar.schemas.sceneform.SamplerInit
            r8.<init>()
            r25 = r10
            com.google.ar.sceneform.rendering.MaterialParameters r10 = new com.google.ar.sceneform.rendering.MaterialParameters
            r10.<init>()
            r26 = r11
            int r11 = r5.parametersLength()
            r0 = 0
        L_0x00a6:
            if (r0 >= r11) goto L_0x0285
            r5.parameters(r6, r0)
            r6.initialValue(r7)
            r27 = r0
            java.lang.String r0 = r6.mo16938id()
            byte r19 = r7.initType()
            switch(r19) {
                case 1: goto L_0x0257;
                case 2: goto L_0x0238;
                case 3: goto L_0x020f;
                case 4: goto L_0x01dd;
                case 5: goto L_0x01c2;
                case 6: goto L_0x019e;
                case 7: goto L_0x018d;
                case 8: goto L_0x0178;
                case 9: goto L_0x015f;
                case 10: goto L_0x013e;
                case 11: goto L_0x012c;
                case 12: goto L_0x0116;
                case 13: goto L_0x00fc;
                case 14: goto L_0x00e0;
                case 15: goto L_0x00bb;
                case 16: goto L_0x0257;
                default: goto L_0x00bb;
            }
        L_0x00bb:
            r19 = r1
            r20 = r2
            r21 = r3
            r28 = r4
            r29 = r6
            r30 = r11
            r2 = r18
            r1 = r25
            r11 = r27
            r6 = r31
            java.lang.String r3 = "Unknown parameter type: "
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r4 = r0.length()
            if (r4 == 0) goto L_0x026c
            r3.concat(r0)
            goto L_0x0271
        L_0x00e0:
            r7.init(r4)
            int r21 = r4.mo16899x()
            int r22 = r4.mo16900y()
            int r23 = r4.mo16901z()
            int r24 = r4.mo16898w()
            r19 = r10
            r20 = r0
            r19.setInt4(r20, r21, r22, r23, r24)
            goto L_0x0257
        L_0x00fc:
            r7.init(r1)
            r28 = r4
            int r4 = r1.mo16893x()
            r29 = r6
            int r6 = r1.mo16894y()
            r30 = r11
            int r11 = r1.mo16895z()
            r10.setInt3(r0, r4, r6, r11)
            goto L_0x01b2
        L_0x0116:
            r28 = r4
            r29 = r6
            r30 = r11
            r7.init(r2)
            int r4 = r2.mo16889x()
            int r6 = r2.mo16890y()
            r10.setInt2(r0, r4, r6)
            goto L_0x01b2
        L_0x012c:
            r28 = r4
            r29 = r6
            r30 = r11
            r7.init(r3)
            int r4 = r3.value()
            r10.setInt(r0, r4)
            goto L_0x01b2
        L_0x013e:
            r28 = r4
            r29 = r6
            r30 = r11
            r7.init(r15)
            boolean r21 = r15.mo16821x()
            boolean r22 = r15.mo16822y()
            boolean r23 = r15.mo16823z()
            boolean r24 = r15.mo16820w()
            r19 = r10
            r20 = r0
            r19.setBoolean4(r20, r21, r22, r23, r24)
            goto L_0x01b2
        L_0x015f:
            r28 = r4
            r29 = r6
            r30 = r11
            r7.init(r14)
            boolean r4 = r14.mo16815x()
            boolean r6 = r14.mo16816y()
            boolean r11 = r14.mo16817z()
            r10.setBoolean3(r0, r4, r6, r11)
            goto L_0x01b2
        L_0x0178:
            r28 = r4
            r29 = r6
            r30 = r11
            r7.init(r13)
            boolean r4 = r13.mo16811x()
            boolean r6 = r13.mo16812y()
            r10.setBoolean2(r0, r4, r6)
            goto L_0x01b2
        L_0x018d:
            r28 = r4
            r29 = r6
            r30 = r11
            r7.init(r12)
            boolean r4 = r12.value()
            r10.setBoolean(r0, r4)
            goto L_0x01b2
        L_0x019e:
            r28 = r4
            r29 = r6
            r30 = r11
            r7.init(r9)
            float r4 = r9.mo17029x()
            float r6 = r9.mo17030y()
            r10.setFloat2(r0, r4, r6)
        L_0x01b2:
            r6 = r31
            r19 = r1
            r20 = r2
            r21 = r3
            r2 = r18
            r1 = r25
            r11 = r27
            goto L_0x0271
        L_0x01c2:
            r28 = r4
            r29 = r6
            r30 = r11
            r7.init(r8)
            java.lang.String r4 = r8.path()
            r6 = r31
            r11 = r27
            com.google.ar.sceneform.rendering.Texture r4 = r6.m8380h(r4)
            if (r4 == 0) goto L_0x0203
            r10.setTexture(r0, r4)
            goto L_0x0203
        L_0x01dd:
            r28 = r4
            r29 = r6
            r30 = r11
            r4 = r26
            r11 = r27
            r6 = r31
            r7.init(r4)
            float r21 = r4.mo17039x()
            float r22 = r4.mo17040y()
            float r23 = r4.mo17041z()
            float r24 = r4.mo17038w()
            r19 = r10
            r20 = r0
            r19.setFloat4(r20, r21, r22, r23, r24)
        L_0x0203:
            r19 = r1
            r20 = r2
            r21 = r3
            r2 = r18
            r1 = r25
            goto L_0x0271
        L_0x020f:
            r19 = r1
            r28 = r4
            r29 = r6
            r30 = r11
            r1 = r25
            r4 = r26
            r11 = r27
            r6 = r31
            r7.init(r1)
            r20 = r2
            float r2 = r1.mo17033x()
            r21 = r3
            float r3 = r1.mo17034y()
            float r4 = r1.mo17035z()
            r10.setFloat3(r0, r2, r3, r4)
            r2 = r18
            goto L_0x0271
        L_0x0238:
            r19 = r1
            r20 = r2
            r21 = r3
            r28 = r4
            r29 = r6
            r30 = r11
            r2 = r18
            r1 = r25
            r11 = r27
            r6 = r31
            r7.init(r2)
            float r3 = r2.value()
            r10.setFloat(r0, r3)
            goto L_0x0271
        L_0x0257:
            r19 = r1
            r20 = r2
            r21 = r3
            r28 = r4
            r29 = r6
            r30 = r11
            r2 = r18
            r1 = r25
            r11 = r27
            r6 = r31
            goto L_0x0271
        L_0x026c:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r3)
        L_0x0271:
            int r0 = r11 + 1
            r25 = r1
            r18 = r2
            r1 = r19
            r2 = r20
            r3 = r21
            r4 = r28
            r6 = r29
            r11 = r30
            goto L_0x00a6
        L_0x0285:
            r6 = r31
            java.util.ArrayList<com.google.ar.sceneform.rendering.MaterialParameters> r0 = r6.f5328r
            r0.add(r10)
            java.lang.String r0 = r5.name()
            java.util.ArrayList<java.lang.String> r1 = r6.f5329s
            if (r0 == 0) goto L_0x0295
            goto L_0x0297
        L_0x0295:
            java.lang.String r0 = ""
        L_0x0297:
            r1.add(r0)
        L_0x029a:
            int r4 = r17 + 1
            r1 = r32
            r0 = r6
            r2 = r16
            goto L_0x000c
        L_0x02a3:
            r6 = r0
            return r32
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.p107ar.sceneform.rendering.C2761m0.m8375b(com.google.ar.schemas.sceneform.SceneformBundleDef):com.google.ar.schemas.sceneform.SceneformBundleDef");
    }

    /* renamed from: c */
    private SceneformBundleDef m8376c(ByteBuffer byteBuffer) {
        try {
            SceneformBundleDef tryLoadSceneformBundle = SceneformBundle.tryLoadSceneformBundle(byteBuffer);
            if (tryLoadSceneformBundle != null) {
                return tryLoadSceneformBundle;
            }
            String valueOf = String.valueOf(this.f5313c);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 20);
            sb.append("No RCB file at uri: ");
            sb.append(valueOf);
            throw new AssertionError(sb.toString());
        } catch (SceneformBundle.C2729a e) {
            throw new CompletionException(e);
        }
    }

    /* renamed from: e */
    private static Texture.Sampler.WrapMode m8377e(TextureSampler.WrapMode wrapMode) {
        int i = C2762a.f5332c[wrapMode.ordinal()];
        if (i == 1) {
            return Texture.Sampler.WrapMode.CLAMP_TO_EDGE;
        }
        if (i == 2) {
            return Texture.Sampler.WrapMode.REPEAT;
        }
        if (i == 3) {
            return Texture.Sampler.WrapMode.MIRRORED_REPEAT;
        }
        throw new IllegalArgumentException("Invalid WrapMode");
    }

    /* renamed from: f */
    private static VertexBuffer.AttributeType m8378f(int i) {
        switch (i) {
            case 1:
                return VertexBuffer.AttributeType.FLOAT;
            case 2:
                return VertexBuffer.AttributeType.FLOAT2;
            case 3:
                return VertexBuffer.AttributeType.FLOAT3;
            case 4:
                return VertexBuffer.AttributeType.FLOAT4;
            case 5:
                return VertexBuffer.AttributeType.USHORT2;
            case 6:
                return VertexBuffer.AttributeType.USHORT4;
            case 7:
                return VertexBuffer.AttributeType.UBYTE4;
            default:
                StringBuilder sb = new StringBuilder(50);
                sb.append("Unsupported VertexAttributeType value: ");
                sb.append(i);
                throw new AssertionError(sb.toString());
        }
    }

    @Nullable
    /* renamed from: g */
    private static VertexBuffer.VertexAttribute m8379g(int i) {
        if (i == 1) {
            return VertexBuffer.VertexAttribute.POSITION;
        }
        if (i == 2) {
            return VertexBuffer.VertexAttribute.COLOR;
        }
        if (i == 3) {
            return VertexBuffer.VertexAttribute.UV0;
        }
        if (i == 6) {
            return VertexBuffer.VertexAttribute.TANGENTS;
        }
        if (i == 7) {
            return VertexBuffer.VertexAttribute.BONE_INDICES;
        }
        if (i != 8) {
            return null;
        }
        return VertexBuffer.VertexAttribute.BONE_WEIGHTS;
    }

    @Nullable
    /* renamed from: h */
    private Texture m8380h(String str) {
        for (int i = 0; i < this.f5318h; i++) {
            if (Objects.equals(str, this.f5325o.get(i).f5333a)) {
                return this.f5325o.get(i).f5334b;
            }
        }
        return null;
    }

    /* renamed from: i */
    private static int m8381i(int i) {
        switch (i) {
            case 0:
                return 0;
            case 1:
            case 5:
            case 7:
                return 4;
            case 2:
            case 6:
                return 8;
            case 3:
                return 12;
            case 4:
                return 16;
            default:
                StringBuilder sb = new StringBuilder(50);
                sb.append("Unsupported VertexAttributeType value: ");
                sb.append(i);
                throw new AssertionError(sb.toString());
        }
    }

    /* renamed from: j */
    private boolean m8382j(int i) {
        return i == 2 || i == 8;
    }

    /* renamed from: n */
    static /* synthetic */ Renderable m8383n(Throwable th) {
        throw new CompletionException(th);
    }

    /* renamed from: q */
    static /* synthetic */ Void m8386q(Throwable th) {
        throw new CompletionException("Texture Load Error", th);
    }

    /* renamed from: r */
    static /* synthetic */ SceneformBundleDef m8387r(SceneformBundleDef sceneformBundleDef, Void voidR) {
        return sceneformBundleDef;
    }

    /* renamed from: s */
    private void m8388s(SceneformBundleDef sceneformBundleDef) {
        if ((this.f5311a instanceof ModelRenderable) && sceneformBundleDef.animationsLength() > 0) {
            ModelRenderable modelRenderable = (ModelRenderable) this.f5311a;
            ArrayList arrayList = new ArrayList();
            int i = 0;
            while (i < sceneformBundleDef.animationsLength()) {
                try {
                    AnimationData createInstance = AnimationData.createInstance(SceneformBufferUtils.copyByteBufferToArray(sceneformBundleDef.animations(i).dataAsByteBuffer()), sceneformBundleDef.animations(i).name());
                    if (createInstance != null) {
                        arrayList.add(createInstance);
                    }
                    i++;
                } catch (IOException e) {
                    throw new CompletionException("Failed to create animation data.", e);
                }
            }
            modelRenderable.setAnimationData(arrayList);
        }
    }

    /* renamed from: t */
    private SceneformBundleDef m8389t(SceneformBundleDef sceneformBundleDef) {
        this.f5316f = sceneformBundleDef.transform();
        ModelDef model = sceneformBundleDef.model();
        this.f5314d = model;
        Preconditions.checkNotNull(model, "Model error: ModelDef is invalid.");
        ModelInstanceDef lods = this.f5314d.lods(0);
        this.f5315e = lods;
        Preconditions.checkNotNull(lods, "Lull Model error: ModelInstanceDef is invalid.");
        m8374a();
        return sceneformBundleDef;
    }

    /* renamed from: u */
    private CompletableFuture<SceneformBundleDef> m8390u(SceneformBundleDef sceneformBundleDef) {
        int samplersLength = sceneformBundleDef.samplersLength();
        this.f5318h = samplersLength;
        CompletableFuture[] completableFutureArr = new CompletableFuture[samplersLength];
        int i = 0;
        while (i < this.f5318h) {
            SamplerDef samplers = sceneformBundleDef.samplers(i);
            C2763b bVar = new C2763b(samplers.name());
            this.f5325o.add(bVar);
            int usageType = samplers.params().usageType();
            Texture.Usage[] values = Texture.Usage.values();
            if (usageType < values.length) {
                Texture.Usage usage = values[usageType];
                if (samplers.dataLength() != 0) {
                    ByteBuffer dataAsByteBuffer = samplers.dataAsByteBuffer();
                    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(dataAsByteBuffer.array(), dataAsByteBuffer.arrayOffset(), dataAsByteBuffer.capacity());
                    boolean z = usage == Texture.Usage.COLOR;
                    byteArrayInputStream.skip((long) dataAsByteBuffer.position());
                    completableFutureArr[i] = Texture.builder().setUsage(usage).setSampler(m8393x(samplers)).setPremultiplied(z).setSource((Callable<InputStream>) new C2756k(byteArrayInputStream)).build().thenAccept(new C2764n(bVar)).exceptionally(C2758l.f5308a);
                    i++;
                } else {
                    throw new IllegalStateException("Unable to load texture, no sampler definition.");
                }
            } else {
                StringBuilder sb = new StringBuilder(34);
                sb.append("Invalid Texture Usage: ");
                sb.append(usageType);
                throw new AssertionError(sb.toString());
            }
        }
        return CompletableFuture.allOf(completableFutureArr).thenApply(new C2754j(sceneformBundleDef));
    }

    /* renamed from: v */
    private static Texture.Sampler.MagFilter m8391v(SamplerDef samplerDef) {
        int i = C2762a.f5330a[TextureSampler.MagFilter.values()[samplerDef.params().magFilter()].ordinal()];
        if (i == 1) {
            return Texture.Sampler.MagFilter.NEAREST;
        }
        if (i == 2) {
            return Texture.Sampler.MagFilter.LINEAR;
        }
        throw new IllegalArgumentException("Invalid MagFilter");
    }

    /* renamed from: w */
    private static Texture.Sampler.MinFilter m8392w(SamplerDef samplerDef) {
        switch (C2762a.f5331b[TextureSampler.MinFilter.values()[samplerDef.params().minFilter()].ordinal()]) {
            case 1:
                return Texture.Sampler.MinFilter.NEAREST;
            case 2:
                return Texture.Sampler.MinFilter.LINEAR;
            case 3:
                return Texture.Sampler.MinFilter.NEAREST_MIPMAP_NEAREST;
            case 4:
                return Texture.Sampler.MinFilter.LINEAR_MIPMAP_NEAREST;
            case 5:
                return Texture.Sampler.MinFilter.NEAREST_MIPMAP_LINEAR;
            case 6:
                return Texture.Sampler.MinFilter.LINEAR_MIPMAP_LINEAR;
            default:
                throw new IllegalArgumentException("Invalid MinFilter");
        }
    }

    /* renamed from: x */
    private static Texture.Sampler m8393x(SamplerDef samplerDef) {
        Texture.Sampler.WrapMode e = m8377e(TextureSampler.WrapMode.values()[samplerDef.params().wrapR()]);
        Texture.Sampler.WrapMode e2 = m8377e(TextureSampler.WrapMode.values()[samplerDef.params().wrapS()]);
        return Texture.Sampler.builder().setMinFilter(m8392w(samplerDef)).setMagFilter(m8391v(samplerDef)).setWrapModeR(e).setWrapModeS(e2).setWrapModeT(m8377e(TextureSampler.WrapMode.values()[samplerDef.params().wrapT()])).build();
    }

    /* renamed from: y */
    private SceneformBundleDef m8394y(SceneformBundleDef sceneformBundleDef) {
        try {
            this.f5311a.collisionShape = SceneformBundle.readCollisionGeometry(sceneformBundleDef);
            return sceneformBundleDef;
        } catch (IOException e) {
            throw new CompletionException("Unable to get collision geometry from sfb", e);
        }
    }

    /* renamed from: z */
    private void m8395z() {
        SkeletonDef skeleton = this.f5314d.skeleton();
        if ((this.f5311a instanceof ModelRenderable) && skeleton.boneTransformsLength() > 0) {
            ((ModelRenderable) this.f5311a).setSkeletonRig(SkeletonRig.createInstance(skeleton, this.f5315e));
        }
    }

    /* renamed from: d */
    public CompletableFuture<T> mo16289d(Callable<InputStream> callable) {
        CompletableFuture<T> thenApplyAsync = CompletableFuture.supplyAsync(new C2750h(this, callable), ThreadPools.getThreadPoolExecutor()).thenComposeAsync(new C2766o(this), ThreadPools.getMainExecutor()).thenApplyAsync(new C2752i(this), ThreadPools.getMainExecutor());
        thenApplyAsync.exceptionally(C2760m.f5309a);
        return thenApplyAsync;
    }

    /* renamed from: k */
    public /* synthetic */ SceneformBundleDef mo16290k(Callable callable) {
        SceneformBundleDef c = m8376c(SceneformBufferUtils.inputStreamToByteBuffer(callable));
        m8394y(c);
        m8389t(c);
        return c;
    }

    /* renamed from: l */
    public /* synthetic */ CompletionStage mo16291l(SceneformBundleDef sceneformBundleDef) {
        m8388s(sceneformBundleDef);
        return m8390u(sceneformBundleDef);
    }

    /* renamed from: m */
    public /* synthetic */ Renderable mo16292m(SceneformBundleDef sceneformBundleDef) {
        m8375b(sceneformBundleDef);
        return m8370A(sceneformBundleDef);
    }
}
