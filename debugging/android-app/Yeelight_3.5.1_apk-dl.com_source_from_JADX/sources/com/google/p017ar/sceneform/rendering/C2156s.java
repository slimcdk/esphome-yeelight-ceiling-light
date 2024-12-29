package com.google.p017ar.sceneform.rendering;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.filament.IndexBuffer;
import com.google.android.filament.TextureSampler;
import com.google.android.filament.VertexBuffer;
import com.google.p017ar.sceneform.math.Vector3;
import com.google.p017ar.sceneform.rendering.C2140j0;
import com.google.p017ar.sceneform.rendering.Renderable;
import com.google.p017ar.sceneform.rendering.SceneformBundle;
import com.google.p017ar.sceneform.rendering.Texture;
import com.google.p017ar.sceneform.utilities.Preconditions;
import com.google.p017ar.sceneform.utilities.SceneformBufferUtils;
import com.google.p017ar.schemas.lull.ModelDef;
import com.google.p017ar.schemas.lull.ModelIndexRange;
import com.google.p017ar.schemas.lull.ModelInstanceDef;
import com.google.p017ar.schemas.lull.SkeletonDef;
import com.google.p017ar.schemas.lull.Vec3;
import com.google.p017ar.schemas.lull.VertexAttribute;
import com.google.p017ar.schemas.sceneform.CompiledMaterialDef;
import com.google.p017ar.schemas.sceneform.SamplerDef;
import com.google.p017ar.schemas.sceneform.SceneformBundleDef;
import com.google.p017ar.schemas.sceneform.TransformDef;
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

/* renamed from: com.google.ar.sceneform.rendering.s */
class C2156s<T extends Renderable> {

    /* renamed from: t */
    private static final String f3419t = "s";

    /* renamed from: a */
    private final T f3420a;

    /* renamed from: b */
    private final C2140j0 f3421b;
    @Nullable

    /* renamed from: c */
    private final Uri f3422c;

    /* renamed from: d */
    private ModelDef f3423d;

    /* renamed from: e */
    private ModelInstanceDef f3424e;

    /* renamed from: f */
    private TransformDef f3425f;

    /* renamed from: g */
    private int f3426g;

    /* renamed from: h */
    private int f3427h;

    /* renamed from: i */
    private int f3428i;

    /* renamed from: j */
    private int f3429j;

    /* renamed from: k */
    private int f3430k;

    /* renamed from: l */
    private IndexBuffer.Builder.IndexType f3431l;

    /* renamed from: m */
    private ByteBuffer f3432m;

    /* renamed from: n */
    private ByteBuffer f3433n;

    /* renamed from: o */
    private final ArrayList<C2158b> f3434o = new ArrayList<>();

    /* renamed from: p */
    private final ArrayList<Material> f3435p = new ArrayList<>();

    /* renamed from: q */
    private final ArrayList<Integer> f3436q = new ArrayList<>();

    /* renamed from: r */
    private final ArrayList<MaterialParameters> f3437r = new ArrayList<>();

    /* renamed from: s */
    private final ArrayList<String> f3438s = new ArrayList<>();

    /* renamed from: com.google.ar.sceneform.rendering.s$a */
    static /* synthetic */ class C2157a {

        /* renamed from: a */
        static final /* synthetic */ int[] f3439a;

        /* renamed from: b */
        static final /* synthetic */ int[] f3440b;

        /* renamed from: c */
        static final /* synthetic */ int[] f3441c;

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
                f3441c = r0
                r1 = 1
                com.google.android.filament.TextureSampler$WrapMode r2 = com.google.android.filament.TextureSampler.WrapMode.CLAMP_TO_EDGE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f3441c     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.android.filament.TextureSampler$WrapMode r3 = com.google.android.filament.TextureSampler.WrapMode.REPEAT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f3441c     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.android.filament.TextureSampler$WrapMode r4 = com.google.android.filament.TextureSampler.WrapMode.MIRRORED_REPEAT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                com.google.android.filament.TextureSampler$MinFilter[] r3 = com.google.android.filament.TextureSampler.MinFilter.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                f3440b = r3
                com.google.android.filament.TextureSampler$MinFilter r4 = com.google.android.filament.TextureSampler.MinFilter.NEAREST     // Catch:{ NoSuchFieldError -> 0x0039 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0039 }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                int[] r3 = f3440b     // Catch:{ NoSuchFieldError -> 0x0043 }
                com.google.android.filament.TextureSampler$MinFilter r4 = com.google.android.filament.TextureSampler.MinFilter.LINEAR     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r3[r4] = r0     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                int[] r3 = f3440b     // Catch:{ NoSuchFieldError -> 0x004d }
                com.google.android.filament.TextureSampler$MinFilter r4 = com.google.android.filament.TextureSampler.MinFilter.NEAREST_MIPMAP_NEAREST     // Catch:{ NoSuchFieldError -> 0x004d }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x004d }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x004d }
            L_0x004d:
                int[] r2 = f3440b     // Catch:{ NoSuchFieldError -> 0x0058 }
                com.google.android.filament.TextureSampler$MinFilter r3 = com.google.android.filament.TextureSampler.MinFilter.LINEAR_MIPMAP_NEAREST     // Catch:{ NoSuchFieldError -> 0x0058 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0058 }
                r4 = 4
                r2[r3] = r4     // Catch:{ NoSuchFieldError -> 0x0058 }
            L_0x0058:
                int[] r2 = f3440b     // Catch:{ NoSuchFieldError -> 0x0063 }
                com.google.android.filament.TextureSampler$MinFilter r3 = com.google.android.filament.TextureSampler.MinFilter.NEAREST_MIPMAP_LINEAR     // Catch:{ NoSuchFieldError -> 0x0063 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0063 }
                r4 = 5
                r2[r3] = r4     // Catch:{ NoSuchFieldError -> 0x0063 }
            L_0x0063:
                int[] r2 = f3440b     // Catch:{ NoSuchFieldError -> 0x006e }
                com.google.android.filament.TextureSampler$MinFilter r3 = com.google.android.filament.TextureSampler.MinFilter.LINEAR_MIPMAP_LINEAR     // Catch:{ NoSuchFieldError -> 0x006e }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x006e }
                r4 = 6
                r2[r3] = r4     // Catch:{ NoSuchFieldError -> 0x006e }
            L_0x006e:
                com.google.android.filament.TextureSampler$MagFilter[] r2 = com.google.android.filament.TextureSampler.MagFilter.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                f3439a = r2
                com.google.android.filament.TextureSampler$MagFilter r3 = com.google.android.filament.TextureSampler.MagFilter.NEAREST     // Catch:{ NoSuchFieldError -> 0x007f }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x007f }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x007f }
            L_0x007f:
                int[] r1 = f3439a     // Catch:{ NoSuchFieldError -> 0x0089 }
                com.google.android.filament.TextureSampler$MagFilter r2 = com.google.android.filament.TextureSampler.MagFilter.LINEAR     // Catch:{ NoSuchFieldError -> 0x0089 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0089 }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0089 }
            L_0x0089:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.p017ar.sceneform.rendering.C2156s.C2157a.<clinit>():void");
        }
    }

    /* renamed from: com.google.ar.sceneform.rendering.s$b */
    private static class C2158b {

        /* renamed from: a */
        String f3442a;
        /* access modifiers changed from: package-private */
        @Nullable

        /* renamed from: b */
        public Texture f3443b = null;

        C2158b(String str) {
            this.f3442a = str;
        }
    }

    C2156s(T t, @Nullable Uri uri) {
        this.f3420a = t;
        IRenderableInternalData renderableData = t.getRenderableData();
        if (renderableData instanceof C2140j0) {
            this.f3421b = (C2140j0) renderableData;
            this.f3422c = uri;
            return;
        }
        String valueOf = String.valueOf(f3419t);
        throw new IllegalStateException(valueOf.length() != 0 ? "Expected task type ".concat(valueOf) : new String("Expected task type "));
    }

    /* renamed from: A */
    private void m5363A(SceneformBundleDef sceneformBundleDef) {
        if ((this.f3420a instanceof ModelRenderable) && sceneformBundleDef.animationsLength() > 0) {
            ModelRenderable modelRenderable = (ModelRenderable) this.f3420a;
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

    /* renamed from: B */
    private SceneformBundleDef m5364B(SceneformBundleDef sceneformBundleDef) {
        this.f3425f = sceneformBundleDef.transform();
        ModelDef model = sceneformBundleDef.model();
        this.f3423d = model;
        Preconditions.checkNotNull(model, "Model error: ModelDef is invalid.");
        ModelInstanceDef lods = this.f3423d.lods(0);
        this.f3424e = lods;
        Preconditions.checkNotNull(lods, "Lull Model error: ModelInstanceDef is invalid.");
        m5383i();
        return sceneformBundleDef;
    }

    /* renamed from: C */
    private CompletableFuture<SceneformBundleDef> m5365C(SceneformBundleDef sceneformBundleDef) {
        int samplersLength = sceneformBundleDef.samplersLength();
        this.f3427h = samplersLength;
        CompletableFuture[] completableFutureArr = new CompletableFuture[samplersLength];
        int i = 0;
        while (i < this.f3427h) {
            SamplerDef samplers = sceneformBundleDef.samplers(i);
            C2158b bVar = new C2158b(samplers.name());
            this.f3434o.add(bVar);
            int usageType = samplers.params().usageType();
            Texture.Usage[] values = Texture.Usage.values();
            if (usageType < values.length) {
                Texture.Usage usage = values[usageType];
                if (samplers.dataLength() != 0) {
                    ByteBuffer dataAsByteBuffer = samplers.dataAsByteBuffer();
                    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(dataAsByteBuffer.array(), dataAsByteBuffer.arrayOffset(), dataAsByteBuffer.capacity());
                    boolean z = usage == Texture.Usage.COLOR;
                    byteArrayInputStream.skip((long) dataAsByteBuffer.position());
                    completableFutureArr[i] = Texture.builder().setUsage(usage).setSampler(m5368F(samplers)).setPremultiplied(z).setSource((Callable<InputStream>) new C2139j(byteArrayInputStream)).build().thenAccept(new C2142k(bVar)).exceptionally(C2150o.f3413a);
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
        return CompletableFuture.allOf(completableFutureArr).thenApply(new C2148n(sceneformBundleDef));
    }

    /* renamed from: D */
    private static Texture.Sampler.MagFilter m5366D(SamplerDef samplerDef) {
        int i = C2157a.f3439a[TextureSampler.MagFilter.values()[samplerDef.params().magFilter()].ordinal()];
        if (i == 1) {
            return Texture.Sampler.MagFilter.NEAREST;
        }
        if (i == 2) {
            return Texture.Sampler.MagFilter.LINEAR;
        }
        throw new IllegalArgumentException("Invalid MagFilter");
    }

    /* renamed from: E */
    private static Texture.Sampler.MinFilter m5367E(SamplerDef samplerDef) {
        switch (C2157a.f3440b[TextureSampler.MinFilter.values()[samplerDef.params().minFilter()].ordinal()]) {
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

    /* renamed from: F */
    private static Texture.Sampler m5368F(SamplerDef samplerDef) {
        Texture.Sampler.WrapMode m = m5386m(TextureSampler.WrapMode.values()[samplerDef.params().wrapR()]);
        Texture.Sampler.WrapMode m2 = m5386m(TextureSampler.WrapMode.values()[samplerDef.params().wrapS()]);
        return Texture.Sampler.builder().setMinFilter(m5367E(samplerDef)).setMagFilter(m5366D(samplerDef)).setWrapModeR(m).setWrapModeS(m2).setWrapModeT(m5386m(TextureSampler.WrapMode.values()[samplerDef.params().wrapT()])).build();
    }

    /* renamed from: G */
    private SceneformBundleDef m5369G(SceneformBundleDef sceneformBundleDef) {
        try {
            this.f3420a.collisionShape = SceneformBundle.readCollisionGeometry(sceneformBundleDef);
            return sceneformBundleDef;
        } catch (IOException e) {
            throw new CompletionException("Unable to get collision geometry from sfb", e);
        }
    }

    /* renamed from: H */
    private void m5370H() {
        SkeletonDef skeleton = this.f3423d.skeleton();
        if ((this.f3420a instanceof ModelRenderable) && skeleton.boneTransformsLength() > 0) {
            ((ModelRenderable) this.f3420a).setSkeletonRig(SkeletonRig.createInstance(skeleton, this.f3424e));
        }
    }

    /* renamed from: I */
    private T m5371I(SceneformBundleDef sceneformBundleDef) {
        Preconditions.checkNotNull(sceneformBundleDef);
        m5372J();
        m5373K(sceneformBundleDef);
        m5374L();
        this.f3420a.getId().update();
        return this.f3420a;
    }

    /* renamed from: J */
    private void m5372J() {
        IEngine engine = EngineInstance.getEngine();
        IndexBuffer build = new IndexBuffer.Builder().indexCount(this.f3430k).bufferType(this.f3431l).build(engine.getFilamentEngine());
        build.setBuffer(engine.getFilamentEngine(), this.f3433n);
        this.f3421b.mo17358b(build);
        VertexBuffer.Builder bufferCount = new VertexBuffer.Builder().vertexCount(this.f3428i).bufferCount(1);
        int vertexAttributesLength = this.f3424e.vertexAttributesLength();
        int i = 0;
        for (int i2 = 0; i2 < vertexAttributesLength; i2++) {
            VertexAttribute vertexAttributes = this.f3424e.vertexAttributes(i2);
            VertexBuffer.VertexAttribute o = m5388o(vertexAttributes.usage());
            if (o != null) {
                bufferCount.attribute(o, 0, m5387n(vertexAttributes.type()), i, this.f3429j);
                if (m5391r(vertexAttributes.usage())) {
                    bufferCount.normalized(o);
                }
            }
            i += m5390q(vertexAttributes.type());
        }
        VertexBuffer build2 = bufferCount.build(engine.getFilamentEngine());
        build2.setBufferAt(engine.getFilamentEngine(), 0, this.f3432m);
        this.f3421b.mo17362f(build2);
        m5370H();
    }

    /* renamed from: K */
    private void m5373K(SceneformBundleDef sceneformBundleDef) {
        int compiledMaterialsLength = sceneformBundleDef.compiledMaterialsLength();
        int i = 0;
        while (i < compiledMaterialsLength) {
            CompiledMaterialDef compiledMaterials = sceneformBundleDef.compiledMaterials(i);
            int hashCode = compiledMaterials.compiledMaterialAsByteBuffer().hashCode();
            try {
                Material now = Material.builder().setSource(SceneformBufferUtils.copyByteBuffer(compiledMaterials.compiledMaterialAsByteBuffer())).setRegistryId(Integer.valueOf(hashCode)).build().getNow((Object) null);
                if (now != null) {
                    this.f3435p.add(now);
                    i++;
                } else {
                    throw new AssertionError("Material wasn't loaded.");
                }
            } catch (IOException e) {
                throw new CompletionException("Failed to create material", e);
            }
        }
    }

    /* renamed from: L */
    private void m5374L() {
        Vec3 min = this.f3423d.boundingBox().min();
        Vector3 vector3 = new Vector3(min.mo18215x(), min.mo18216y(), min.mo18217z());
        Vec3 max = this.f3423d.boundingBox().max();
        Vector3 scaled = Vector3.subtract(new Vector3(max.mo18215x(), max.mo18216y(), max.mo18217z()), vector3).scaled(0.5f);
        Vector3 add = Vector3.add(vector3, scaled);
        this.f3421b.mo17363g(scaled);
        this.f3421b.mo17375s(add);
        TransformDef transformDef = this.f3425f;
        if (!(transformDef == null || transformDef.scale() == 0.0f)) {
            Vec3 offset = this.f3425f.offset();
            Vector3 vector32 = new Vector3(offset.mo18215x(), offset.mo18216y(), offset.mo18217z());
            this.f3421b.mo17731B(this.f3425f.scale());
            this.f3421b.mo17730A(vector32);
        }
        ArrayList<Material> materialBindings = this.f3420a.getMaterialBindings();
        ArrayList<String> materialNames = this.f3420a.getMaterialNames();
        materialBindings.clear();
        materialNames.clear();
        for (int i = 0; i < this.f3426g; i++) {
            ModelIndexRange ranges = this.f3424e.ranges(i);
            int start = (int) ranges.start();
            int end = (int) ranges.end();
            Material makeCopy = this.f3435p.get(this.f3436q.get(i).intValue()).makeCopy();
            makeCopy.copyMaterialParameters(this.f3437r.get(i));
            C2140j0.C2141a aVar = new C2140j0.C2141a();
            materialBindings.add(makeCopy);
            materialNames.add(this.f3438s.get(i));
            aVar.f3402a = start;
            aVar.f3403b = end;
            this.f3421b.mo17377u().add(aVar);
        }
    }

    /* renamed from: i */
    private void m5383i() {
        ByteBuffer allocateDirect;
        ByteBuffer indices16AsByteBuffer;
        ByteBuffer vertexDataAsByteBuffer = this.f3424e.vertexDataAsByteBuffer();
        Preconditions.checkNotNull(vertexDataAsByteBuffer, "Model Instance geometry data is invalid (vertexData is null).");
        int vertexDataLength = this.f3424e.vertexDataLength();
        this.f3426g = this.f3424e.rangesLength();
        this.f3428i = vertexDataLength / LullModel.getByteCountPerVertex(this.f3424e);
        if (this.f3424e.indices32Length() > 0) {
            int indices32Length = this.f3424e.indices32Length();
            this.f3430k = indices32Length;
            this.f3431l = IndexBuffer.Builder.IndexType.UINT;
            allocateDirect = ByteBuffer.allocateDirect(indices32Length * 4);
            this.f3433n = allocateDirect;
            indices16AsByteBuffer = this.f3424e.indices32AsByteBuffer();
        } else if (this.f3424e.indices16Length() > 0) {
            int indices16Length = this.f3424e.indices16Length();
            this.f3430k = indices16Length;
            this.f3431l = IndexBuffer.Builder.IndexType.USHORT;
            allocateDirect = ByteBuffer.allocateDirect(indices16Length * 2);
            this.f3433n = allocateDirect;
            indices16AsByteBuffer = this.f3424e.indices16AsByteBuffer();
        } else {
            throw new AssertionError("Model Instance geometry data is invalid (model has no index data).");
        }
        allocateDirect.put(indices16AsByteBuffer);
        this.f3433n.flip();
        ByteBuffer allocateDirect2 = ByteBuffer.allocateDirect(vertexDataAsByteBuffer.remaining());
        this.f3432m = allocateDirect2;
        Preconditions.checkNotNull(allocateDirect2, "Failed to allocate geometry for FilamentModel.");
        this.f3432m.put(vertexDataAsByteBuffer);
        this.f3432m.flip();
        this.f3429j = 0;
        int vertexAttributesLength = this.f3424e.vertexAttributesLength();
        for (int i = 0; i < vertexAttributesLength; i++) {
            this.f3429j += m5390q(this.f3424e.vertexAttributes(i).type());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x01af, code lost:
        r6 = r31;
        r19 = r1;
        r20 = r2;
        r21 = r3;
        r2 = r18;
        r1 = r25;
        r11 = r27;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0200, code lost:
        r19 = r1;
        r20 = r2;
        r21 = r3;
        r2 = r18;
        r1 = r25;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0254, code lost:
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
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0268, code lost:
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
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.google.p017ar.schemas.sceneform.SceneformBundleDef m5384j(com.google.p017ar.schemas.sceneform.SceneformBundleDef r32) {
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
            int r5 = r0.f3426g
            if (r4 >= r5) goto L_0x029a
            if (r2 > r4) goto L_0x0015
            int r5 = r2 + -1
            goto L_0x0016
        L_0x0015:
            r5 = r4
        L_0x0016:
            com.google.ar.schemas.sceneform.MaterialDef r5 = r1.materials(r5)
            if (r5 != 0) goto L_0x0037
            r5 = 29
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r5)
            java.lang.String r5 = "Material "
            r6.append(r5)
            r6.append(r4)
            java.lang.String r5 = " is null."
            r6.append(r5)
            r6 = r0
            r16 = r2
            r17 = r4
            goto L_0x0291
        L_0x0037:
            java.util.ArrayList<java.lang.Integer> r6 = r0.f3436q
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
        L_0x00a3:
            if (r0 >= r11) goto L_0x027c
            r5.parameters(r6, r0)
            r6.initialValue(r7)
            r27 = r0
            java.lang.String r0 = r6.mo18370id()
            byte r19 = r7.initType()
            switch(r19) {
                case 1: goto L_0x0254;
                case 2: goto L_0x0235;
                case 3: goto L_0x020c;
                case 4: goto L_0x01da;
                case 5: goto L_0x01bf;
                case 6: goto L_0x019b;
                case 7: goto L_0x018a;
                case 8: goto L_0x0175;
                case 9: goto L_0x015c;
                case 10: goto L_0x013b;
                case 11: goto L_0x0129;
                case 12: goto L_0x0113;
                case 13: goto L_0x00f9;
                case 14: goto L_0x00dd;
                case 15: goto L_0x00b8;
                case 16: goto L_0x0254;
                default: goto L_0x00b8;
            }
        L_0x00b8:
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
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r3 = r0.length()
            if (r3 == 0) goto L_0x0268
            java.lang.String r3 = "Unknown parameter type: "
            r3.concat(r0)
            goto L_0x0268
        L_0x00dd:
            r7.init(r4)
            int r21 = r4.mo18331x()
            int r22 = r4.mo18332y()
            int r23 = r4.mo18333z()
            int r24 = r4.mo18330w()
            r19 = r10
            r20 = r0
            r19.setInt4(r20, r21, r22, r23, r24)
            goto L_0x0254
        L_0x00f9:
            r7.init(r1)
            r28 = r4
            int r4 = r1.mo18325x()
            r29 = r6
            int r6 = r1.mo18326y()
            r30 = r11
            int r11 = r1.mo18327z()
            r10.setInt3(r0, r4, r6, r11)
            goto L_0x01af
        L_0x0113:
            r28 = r4
            r29 = r6
            r30 = r11
            r7.init(r2)
            int r4 = r2.mo18321x()
            int r6 = r2.mo18322y()
            r10.setInt2(r0, r4, r6)
            goto L_0x01af
        L_0x0129:
            r28 = r4
            r29 = r6
            r30 = r11
            r7.init(r3)
            int r4 = r3.value()
            r10.setInt(r0, r4)
            goto L_0x01af
        L_0x013b:
            r28 = r4
            r29 = r6
            r30 = r11
            r7.init(r15)
            boolean r21 = r15.mo18253x()
            boolean r22 = r15.mo18254y()
            boolean r23 = r15.mo18255z()
            boolean r24 = r15.mo18252w()
            r19 = r10
            r20 = r0
            r19.setBoolean4(r20, r21, r22, r23, r24)
            goto L_0x01af
        L_0x015c:
            r28 = r4
            r29 = r6
            r30 = r11
            r7.init(r14)
            boolean r4 = r14.mo18247x()
            boolean r6 = r14.mo18248y()
            boolean r11 = r14.mo18249z()
            r10.setBoolean3(r0, r4, r6, r11)
            goto L_0x01af
        L_0x0175:
            r28 = r4
            r29 = r6
            r30 = r11
            r7.init(r13)
            boolean r4 = r13.mo18243x()
            boolean r6 = r13.mo18244y()
            r10.setBoolean2(r0, r4, r6)
            goto L_0x01af
        L_0x018a:
            r28 = r4
            r29 = r6
            r30 = r11
            r7.init(r12)
            boolean r4 = r12.value()
            r10.setBoolean(r0, r4)
            goto L_0x01af
        L_0x019b:
            r28 = r4
            r29 = r6
            r30 = r11
            r7.init(r9)
            float r4 = r9.mo18461x()
            float r6 = r9.mo18462y()
            r10.setFloat2(r0, r4, r6)
        L_0x01af:
            r6 = r31
            r19 = r1
            r20 = r2
            r21 = r3
            r2 = r18
            r1 = r25
            r11 = r27
            goto L_0x0268
        L_0x01bf:
            r28 = r4
            r29 = r6
            r30 = r11
            r7.init(r8)
            java.lang.String r4 = r8.path()
            r6 = r31
            r11 = r27
            com.google.ar.sceneform.rendering.Texture r4 = r6.m5389p(r4)
            if (r4 == 0) goto L_0x0200
            r10.setTexture(r0, r4)
            goto L_0x0200
        L_0x01da:
            r28 = r4
            r29 = r6
            r30 = r11
            r4 = r26
            r11 = r27
            r6 = r31
            r7.init(r4)
            float r21 = r4.mo18471x()
            float r22 = r4.mo18472y()
            float r23 = r4.mo18473z()
            float r24 = r4.mo18470w()
            r19 = r10
            r20 = r0
            r19.setFloat4(r20, r21, r22, r23, r24)
        L_0x0200:
            r19 = r1
            r20 = r2
            r21 = r3
            r2 = r18
            r1 = r25
            goto L_0x0268
        L_0x020c:
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
            float r2 = r1.mo18465x()
            r21 = r3
            float r3 = r1.mo18466y()
            float r4 = r1.mo18467z()
            r10.setFloat3(r0, r2, r3, r4)
            r2 = r18
            goto L_0x0268
        L_0x0235:
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
            goto L_0x0268
        L_0x0254:
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
        L_0x0268:
            int r0 = r11 + 1
            r25 = r1
            r18 = r2
            r1 = r19
            r2 = r20
            r3 = r21
            r4 = r28
            r6 = r29
            r11 = r30
            goto L_0x00a3
        L_0x027c:
            r6 = r31
            java.util.ArrayList<com.google.ar.sceneform.rendering.MaterialParameters> r0 = r6.f3437r
            r0.add(r10)
            java.lang.String r0 = r5.name()
            java.util.ArrayList<java.lang.String> r1 = r6.f3438s
            if (r0 == 0) goto L_0x028c
            goto L_0x028e
        L_0x028c:
            java.lang.String r0 = ""
        L_0x028e:
            r1.add(r0)
        L_0x0291:
            int r4 = r17 + 1
            r1 = r32
            r0 = r6
            r2 = r16
            goto L_0x000c
        L_0x029a:
            r6 = r0
            return r32
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.p017ar.sceneform.rendering.C2156s.m5384j(com.google.ar.schemas.sceneform.SceneformBundleDef):com.google.ar.schemas.sceneform.SceneformBundleDef");
    }

    /* renamed from: k */
    private SceneformBundleDef m5385k(ByteBuffer byteBuffer) {
        try {
            SceneformBundleDef tryLoadSceneformBundle = SceneformBundle.tryLoadSceneformBundle(byteBuffer);
            if (tryLoadSceneformBundle != null) {
                return tryLoadSceneformBundle;
            }
            String valueOf = String.valueOf(this.f3422c);
            StringBuilder sb = new StringBuilder(valueOf.length() + 20);
            sb.append("No RCB file at uri: ");
            sb.append(valueOf);
            throw new AssertionError(sb.toString());
        } catch (SceneformBundle.VersionException e) {
            throw new CompletionException(e);
        }
    }

    /* renamed from: m */
    private static Texture.Sampler.WrapMode m5386m(TextureSampler.WrapMode wrapMode) {
        int i = C2157a.f3441c[wrapMode.ordinal()];
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

    /* renamed from: n */
    private static VertexBuffer.AttributeType m5387n(int i) {
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
    /* renamed from: o */
    private static VertexBuffer.VertexAttribute m5388o(int i) {
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
    /* renamed from: p */
    private Texture m5389p(String str) {
        for (int i = 0; i < this.f3427h; i++) {
            if (Objects.equals(str, this.f3434o.get(i).f3442a)) {
                return this.f3434o.get(i).f3443b;
            }
        }
        return null;
    }

    /* renamed from: q */
    private static int m5390q(int i) {
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

    /* renamed from: r */
    private boolean m5391r(int i) {
        return i == 2 || i == 8;
    }

    /* access modifiers changed from: private */
    /* renamed from: s */
    public /* synthetic */ SceneformBundleDef m5392s(Callable callable) {
        SceneformBundleDef k = m5385k(SceneformBufferUtils.inputStreamToByteBuffer(callable));
        m5369G(k);
        m5364B(k);
        return k;
    }

    /* access modifiers changed from: private */
    /* renamed from: t */
    public /* synthetic */ CompletionStage m5393t(SceneformBundleDef sceneformBundleDef) {
        m5363A(sceneformBundleDef);
        return m5365C(sceneformBundleDef);
    }

    /* access modifiers changed from: private */
    /* renamed from: u */
    public /* synthetic */ Renderable m5394u(SceneformBundleDef sceneformBundleDef) {
        m5384j(sceneformBundleDef);
        return m5371I(sceneformBundleDef);
    }

    /* access modifiers changed from: private */
    /* renamed from: v */
    public static /* synthetic */ Renderable m5395v(Throwable th) {
        throw new CompletionException(th);
    }

    /* access modifiers changed from: private */
    /* renamed from: y */
    public static /* synthetic */ Void m5398y(Throwable th) {
        throw new CompletionException("Texture Load Error", th);
    }

    /* access modifiers changed from: private */
    /* renamed from: z */
    public static /* synthetic */ SceneformBundleDef m5399z(SceneformBundleDef sceneformBundleDef, Void voidR) {
        return sceneformBundleDef;
    }

    /* renamed from: l */
    public CompletableFuture<T> mo17746l(Callable<InputStream> callable) {
        CompletableFuture<T> thenApplyAsync = CompletableFuture.supplyAsync(new C2154q(this, callable), ThreadPools.getThreadPoolExecutor()).thenComposeAsync(new C2144l(this), ThreadPools.getMainExecutor()).thenApplyAsync(new C2146m(this), ThreadPools.getMainExecutor());
        thenApplyAsync.exceptionally(C2152p.f3415a);
        return thenApplyAsync;
    }
}
