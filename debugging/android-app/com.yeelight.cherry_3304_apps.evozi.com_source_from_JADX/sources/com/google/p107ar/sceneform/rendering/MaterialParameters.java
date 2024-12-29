package com.google.p107ar.sceneform.rendering;

import androidx.annotation.Nullable;
import com.google.android.filament.Material;
import com.google.android.filament.MaterialInstance;
import com.google.android.filament.TextureSampler;
import com.google.p107ar.core.annotations.UsedByNative;
import com.google.p107ar.sceneform.math.Vector3;
import com.google.p107ar.sceneform.rendering.Texture;
import java.util.HashMap;

@UsedByNative("material_java_wrappers.h")
/* renamed from: com.google.ar.sceneform.rendering.MaterialParameters */
final class MaterialParameters {

    /* renamed from: a */
    private final HashMap<String, C2719o> f5221a = new HashMap<>();

    /* renamed from: com.google.ar.sceneform.rendering.MaterialParameters$a */
    static /* synthetic */ class C2705a {

        /* renamed from: a */
        static final /* synthetic */ int[] f5222a;

        /* renamed from: b */
        static final /* synthetic */ int[] f5223b;

        /* renamed from: c */
        static final /* synthetic */ int[] f5224c;

        /* JADX WARNING: Can't wrap try/catch for region: R(25:0|(2:1|2)|3|(2:5|6)|7|9|10|11|13|14|(2:15|16)|17|19|20|21|22|23|24|25|26|27|28|29|30|32) */
        /* JADX WARNING: Can't wrap try/catch for region: R(27:0|1|2|3|(2:5|6)|7|9|10|11|13|14|15|16|17|19|20|21|22|23|24|25|26|27|28|29|30|32) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0039 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x005e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0068 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0073 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x007e */
        static {
            /*
                com.google.ar.sceneform.rendering.Texture$Sampler$WrapMode[] r0 = com.google.p107ar.sceneform.rendering.Texture.Sampler.WrapMode.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f5224c = r0
                r1 = 1
                com.google.ar.sceneform.rendering.Texture$Sampler$WrapMode r2 = com.google.p107ar.sceneform.rendering.Texture.Sampler.WrapMode.CLAMP_TO_EDGE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f5224c     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.ar.sceneform.rendering.Texture$Sampler$WrapMode r3 = com.google.p107ar.sceneform.rendering.Texture.Sampler.WrapMode.REPEAT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f5224c     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.ar.sceneform.rendering.Texture$Sampler$WrapMode r4 = com.google.p107ar.sceneform.rendering.Texture.Sampler.WrapMode.MIRRORED_REPEAT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                com.google.ar.sceneform.rendering.Texture$Sampler$MagFilter[] r3 = com.google.p107ar.sceneform.rendering.Texture.Sampler.MagFilter.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                f5223b = r3
                com.google.ar.sceneform.rendering.Texture$Sampler$MagFilter r4 = com.google.p107ar.sceneform.rendering.Texture.Sampler.MagFilter.NEAREST     // Catch:{ NoSuchFieldError -> 0x0039 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0039 }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                int[] r3 = f5223b     // Catch:{ NoSuchFieldError -> 0x0043 }
                com.google.ar.sceneform.rendering.Texture$Sampler$MagFilter r4 = com.google.p107ar.sceneform.rendering.Texture.Sampler.MagFilter.LINEAR     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r3[r4] = r0     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                com.google.ar.sceneform.rendering.Texture$Sampler$MinFilter[] r3 = com.google.p107ar.sceneform.rendering.Texture.Sampler.MinFilter.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                f5222a = r3
                com.google.ar.sceneform.rendering.Texture$Sampler$MinFilter r4 = com.google.p107ar.sceneform.rendering.Texture.Sampler.MinFilter.NEAREST     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r1 = f5222a     // Catch:{ NoSuchFieldError -> 0x005e }
                com.google.ar.sceneform.rendering.Texture$Sampler$MinFilter r3 = com.google.p107ar.sceneform.rendering.Texture.Sampler.MinFilter.LINEAR     // Catch:{ NoSuchFieldError -> 0x005e }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x005e }
                r1[r3] = r0     // Catch:{ NoSuchFieldError -> 0x005e }
            L_0x005e:
                int[] r0 = f5222a     // Catch:{ NoSuchFieldError -> 0x0068 }
                com.google.ar.sceneform.rendering.Texture$Sampler$MinFilter r1 = com.google.p107ar.sceneform.rendering.Texture.Sampler.MinFilter.NEAREST_MIPMAP_NEAREST     // Catch:{ NoSuchFieldError -> 0x0068 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0068 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0068 }
            L_0x0068:
                int[] r0 = f5222a     // Catch:{ NoSuchFieldError -> 0x0073 }
                com.google.ar.sceneform.rendering.Texture$Sampler$MinFilter r1 = com.google.p107ar.sceneform.rendering.Texture.Sampler.MinFilter.LINEAR_MIPMAP_NEAREST     // Catch:{ NoSuchFieldError -> 0x0073 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0073 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0073 }
            L_0x0073:
                int[] r0 = f5222a     // Catch:{ NoSuchFieldError -> 0x007e }
                com.google.ar.sceneform.rendering.Texture$Sampler$MinFilter r1 = com.google.p107ar.sceneform.rendering.Texture.Sampler.MinFilter.NEAREST_MIPMAP_LINEAR     // Catch:{ NoSuchFieldError -> 0x007e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x007e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x007e }
            L_0x007e:
                int[] r0 = f5222a     // Catch:{ NoSuchFieldError -> 0x0089 }
                com.google.ar.sceneform.rendering.Texture$Sampler$MinFilter r1 = com.google.p107ar.sceneform.rendering.Texture.Sampler.MinFilter.LINEAR_MIPMAP_LINEAR     // Catch:{ NoSuchFieldError -> 0x0089 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0089 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0089 }
            L_0x0089:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.p107ar.sceneform.rendering.MaterialParameters.C2705a.<clinit>():void");
        }
    }

    /* renamed from: com.google.ar.sceneform.rendering.MaterialParameters$b */
    static class C2706b extends C2719o {

        /* renamed from: b */
        boolean f5225b;

        /* renamed from: c */
        boolean f5226c;

        C2706b(String str, boolean z, boolean z2) {
            this.f5256a = str;
            this.f5225b = z;
            this.f5226c = z2;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo16042a(MaterialInstance materialInstance) {
            materialInstance.setParameter(this.f5256a, this.f5225b, this.f5226c);
        }
    }

    /* renamed from: com.google.ar.sceneform.rendering.MaterialParameters$c */
    static class C2707c extends C2719o {

        /* renamed from: b */
        boolean f5227b;

        /* renamed from: c */
        boolean f5228c;

        /* renamed from: d */
        boolean f5229d;

        C2707c(String str, boolean z, boolean z2, boolean z3) {
            this.f5256a = str;
            this.f5227b = z;
            this.f5228c = z2;
            this.f5229d = z3;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo16042a(MaterialInstance materialInstance) {
            materialInstance.setParameter(this.f5256a, this.f5227b, this.f5228c, this.f5229d);
        }
    }

    /* renamed from: com.google.ar.sceneform.rendering.MaterialParameters$d */
    static class C2708d extends C2719o {

        /* renamed from: b */
        boolean f5230b;

        /* renamed from: c */
        boolean f5231c;

        /* renamed from: d */
        boolean f5232d;

        /* renamed from: e */
        boolean f5233e;

        C2708d(String str, boolean z, boolean z2, boolean z3, boolean z4) {
            this.f5256a = str;
            this.f5230b = z;
            this.f5231c = z2;
            this.f5232d = z3;
            this.f5233e = z4;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo16042a(MaterialInstance materialInstance) {
            materialInstance.setParameter(this.f5256a, this.f5230b, this.f5231c, this.f5232d, this.f5233e);
        }
    }

    /* renamed from: com.google.ar.sceneform.rendering.MaterialParameters$e */
    static class C2709e extends C2719o {

        /* renamed from: b */
        boolean f5234b;

        C2709e(String str, boolean z) {
            this.f5256a = str;
            this.f5234b = z;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo16042a(MaterialInstance materialInstance) {
            materialInstance.setParameter(this.f5256a, this.f5234b);
        }
    }

    /* renamed from: com.google.ar.sceneform.rendering.MaterialParameters$f */
    static class C2710f extends C2719o {
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final ExternalTexture f5235b;

        C2710f(String str, ExternalTexture externalTexture) {
            this.f5256a = str;
            this.f5235b = externalTexture;
        }

        /* renamed from: d */
        private TextureSampler m8327d() {
            TextureSampler textureSampler = new TextureSampler();
            textureSampler.setMinFilter(TextureSampler.MinFilter.LINEAR);
            textureSampler.setMagFilter(TextureSampler.MagFilter.LINEAR);
            textureSampler.setWrapModeS(TextureSampler.WrapMode.CLAMP_TO_EDGE);
            textureSampler.setWrapModeT(TextureSampler.WrapMode.CLAMP_TO_EDGE);
            textureSampler.setWrapModeR(TextureSampler.WrapMode.CLAMP_TO_EDGE);
            return textureSampler;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo16042a(MaterialInstance materialInstance) {
            materialInstance.setParameter(this.f5256a, this.f5235b.getFilamentTexture(), m8327d());
        }

        /* renamed from: b */
        public C2719o clone() {
            return new C2710f(this.f5256a, this.f5235b);
        }
    }

    /* renamed from: com.google.ar.sceneform.rendering.MaterialParameters$g */
    static class C2711g extends C2719o {

        /* renamed from: b */
        float f5236b;

        /* renamed from: c */
        float f5237c;

        C2711g(String str, float f, float f2) {
            this.f5256a = str;
            this.f5236b = f;
            this.f5237c = f2;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo16042a(MaterialInstance materialInstance) {
            materialInstance.setParameter(this.f5256a, this.f5236b, this.f5237c);
        }
    }

    /* renamed from: com.google.ar.sceneform.rendering.MaterialParameters$h */
    static class C2712h extends C2719o {

        /* renamed from: b */
        float f5238b;

        /* renamed from: c */
        float f5239c;

        /* renamed from: d */
        float f5240d;

        C2712h(String str, float f, float f2, float f3) {
            this.f5256a = str;
            this.f5238b = f;
            this.f5239c = f2;
            this.f5240d = f3;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo16042a(MaterialInstance materialInstance) {
            materialInstance.setParameter(this.f5256a, this.f5238b, this.f5239c, this.f5240d);
        }
    }

    /* renamed from: com.google.ar.sceneform.rendering.MaterialParameters$i */
    static class C2713i extends C2719o {

        /* renamed from: b */
        float f5241b;

        /* renamed from: c */
        float f5242c;

        /* renamed from: d */
        float f5243d;

        /* renamed from: e */
        float f5244e;

        C2713i(String str, float f, float f2, float f3, float f4) {
            this.f5256a = str;
            this.f5241b = f;
            this.f5242c = f2;
            this.f5243d = f3;
            this.f5244e = f4;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo16042a(MaterialInstance materialInstance) {
            materialInstance.setParameter(this.f5256a, this.f5241b, this.f5242c, this.f5243d, this.f5244e);
        }
    }

    /* renamed from: com.google.ar.sceneform.rendering.MaterialParameters$j */
    static class C2714j extends C2719o {

        /* renamed from: b */
        float f5245b;

        C2714j(String str, float f) {
            this.f5256a = str;
            this.f5245b = f;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo16042a(MaterialInstance materialInstance) {
            materialInstance.setParameter(this.f5256a, this.f5245b);
        }
    }

    /* renamed from: com.google.ar.sceneform.rendering.MaterialParameters$k */
    static class C2715k extends C2719o {

        /* renamed from: b */
        int f5246b;

        /* renamed from: c */
        int f5247c;

        C2715k(String str, int i, int i2) {
            this.f5256a = str;
            this.f5246b = i;
            this.f5247c = i2;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo16042a(MaterialInstance materialInstance) {
            materialInstance.setParameter(this.f5256a, this.f5246b, this.f5247c);
        }
    }

    /* renamed from: com.google.ar.sceneform.rendering.MaterialParameters$l */
    static class C2716l extends C2719o {

        /* renamed from: b */
        int f5248b;

        /* renamed from: c */
        int f5249c;

        /* renamed from: d */
        int f5250d;

        C2716l(String str, int i, int i2, int i3) {
            this.f5256a = str;
            this.f5248b = i;
            this.f5249c = i2;
            this.f5250d = i3;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo16042a(MaterialInstance materialInstance) {
            materialInstance.setParameter(this.f5256a, this.f5248b, this.f5249c, this.f5250d);
        }
    }

    /* renamed from: com.google.ar.sceneform.rendering.MaterialParameters$m */
    static class C2717m extends C2719o {

        /* renamed from: b */
        int f5251b;

        /* renamed from: c */
        int f5252c;

        /* renamed from: d */
        int f5253d;

        /* renamed from: e */
        int f5254e;

        C2717m(String str, int i, int i2, int i3, int i4) {
            this.f5256a = str;
            this.f5251b = i;
            this.f5252c = i2;
            this.f5253d = i3;
            this.f5254e = i4;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo16042a(MaterialInstance materialInstance) {
            materialInstance.setParameter(this.f5256a, this.f5251b, this.f5252c, this.f5253d, this.f5254e);
        }
    }

    /* renamed from: com.google.ar.sceneform.rendering.MaterialParameters$n */
    static class C2718n extends C2719o {

        /* renamed from: b */
        int f5255b;

        C2718n(String str, int i) {
            this.f5256a = str;
            this.f5255b = i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo16042a(MaterialInstance materialInstance) {
            materialInstance.setParameter(this.f5256a, this.f5255b);
        }
    }

    /* renamed from: com.google.ar.sceneform.rendering.MaterialParameters$o */
    static abstract class C2719o implements Cloneable {

        /* renamed from: a */
        String f5256a;

        C2719o() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public abstract void mo16042a(MaterialInstance materialInstance);

        /* renamed from: b */
        public C2719o clone() {
            try {
                return (C2719o) super.clone();
            } catch (CloneNotSupportedException e) {
                throw new AssertionError(e);
            }
        }
    }

    /* renamed from: com.google.ar.sceneform.rendering.MaterialParameters$p */
    static class C2720p extends C2719o {

        /* renamed from: b */
        final Texture f5257b;

        C2720p(String str, Texture texture) {
            this.f5256a = str;
            this.f5257b = texture;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo16042a(MaterialInstance materialInstance) {
            materialInstance.setParameter(this.f5256a, this.f5257b.getFilamentTexture(), MaterialParameters.m8314c(this.f5257b.getSampler()));
        }

        /* renamed from: b */
        public C2719o clone() {
            return new C2720p(this.f5256a, this.f5257b);
        }
    }

    MaterialParameters() {
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static TextureSampler m8314c(Texture.Sampler sampler) {
        TextureSampler.MinFilter minFilter;
        TextureSampler.MagFilter magFilter;
        TextureSampler textureSampler = new TextureSampler();
        switch (C2705a.f5222a[sampler.getMinFilter().ordinal()]) {
            case 1:
                minFilter = TextureSampler.MinFilter.NEAREST;
                break;
            case 2:
                minFilter = TextureSampler.MinFilter.LINEAR;
                break;
            case 3:
                minFilter = TextureSampler.MinFilter.NEAREST_MIPMAP_NEAREST;
                break;
            case 4:
                minFilter = TextureSampler.MinFilter.LINEAR_MIPMAP_NEAREST;
                break;
            case 5:
                minFilter = TextureSampler.MinFilter.NEAREST_MIPMAP_LINEAR;
                break;
            case 6:
                minFilter = TextureSampler.MinFilter.LINEAR_MIPMAP_LINEAR;
                break;
            default:
                throw new IllegalArgumentException("Invalid MinFilter");
        }
        textureSampler.setMinFilter(minFilter);
        int i = C2705a.f5223b[sampler.getMagFilter().ordinal()];
        if (i == 1) {
            magFilter = TextureSampler.MagFilter.NEAREST;
        } else if (i == 2) {
            magFilter = TextureSampler.MagFilter.LINEAR;
        } else {
            throw new IllegalArgumentException("Invalid MagFilter");
        }
        textureSampler.setMagFilter(magFilter);
        textureSampler.setWrapModeS(m8315d(sampler.getWrapModeS()));
        textureSampler.setWrapModeT(m8315d(sampler.getWrapModeT()));
        textureSampler.setWrapModeR(m8315d(sampler.getWrapModeR()));
        return textureSampler;
    }

    /* renamed from: d */
    private static TextureSampler.WrapMode m8315d(Texture.Sampler.WrapMode wrapMode) {
        int i = C2705a.f5224c[wrapMode.ordinal()];
        if (i == 1) {
            return TextureSampler.WrapMode.CLAMP_TO_EDGE;
        }
        if (i == 2) {
            return TextureSampler.WrapMode.REPEAT;
        }
        if (i == 3) {
            return TextureSampler.WrapMode.MIRRORED_REPEAT;
        }
        throw new IllegalArgumentException("Invalid WrapMode");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo16023b(MaterialInstance materialInstance) {
        Material material = materialInstance.getMaterial();
        for (C2719o next : this.f5221a.values()) {
            if (material.hasParameter(next.f5256a)) {
                next.mo16042a(materialInstance);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo16024e(MaterialParameters materialParameters) {
        this.f5221a.clear();
        mo16026g(materialParameters);
    }

    /* access modifiers changed from: package-private */
    @Nullable
    /* renamed from: f */
    public ExternalTexture mo16025f(String str) {
        C2719o oVar = this.f5221a.get(str);
        if (oVar instanceof C2710f) {
            return ((C2710f) oVar).f5235b;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo16026g(MaterialParameters materialParameters) {
        for (C2719o b : materialParameters.f5221a.values()) {
            C2719o b2 = b.clone();
            this.f5221a.put(b2.f5256a, b2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo16027h(String str, ExternalTexture externalTexture) {
        this.f5221a.put(str, new C2710f(str, externalTexture));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo16028i(String str, Vector3 vector3) {
        this.f5221a.put(str, new C2712h(str, vector3.f5202x, vector3.f5203y, vector3.f5204z));
    }

    /* access modifiers changed from: package-private */
    @UsedByNative("material_java_wrappers.h")
    public void setBoolean(String str, boolean z) {
        this.f5221a.put(str, new C2709e(str, z));
    }

    /* access modifiers changed from: package-private */
    @UsedByNative("material_java_wrappers.h")
    public void setBoolean2(String str, boolean z, boolean z2) {
        this.f5221a.put(str, new C2706b(str, z, z2));
    }

    /* access modifiers changed from: package-private */
    @UsedByNative("material_java_wrappers.h")
    public void setBoolean3(String str, boolean z, boolean z2, boolean z3) {
        this.f5221a.put(str, new C2707c(str, z, z2, z3));
    }

    /* access modifiers changed from: package-private */
    @UsedByNative("material_java_wrappers.h")
    public void setBoolean4(String str, boolean z, boolean z2, boolean z3, boolean z4) {
        this.f5221a.put(str, new C2708d(str, z, z2, z3, z4));
    }

    /* access modifiers changed from: package-private */
    @UsedByNative("material_java_wrappers.h")
    public void setFloat(String str, float f) {
        this.f5221a.put(str, new C2714j(str, f));
    }

    /* access modifiers changed from: package-private */
    @UsedByNative("material_java_wrappers.h")
    public void setFloat2(String str, float f, float f2) {
        this.f5221a.put(str, new C2711g(str, f, f2));
    }

    /* access modifiers changed from: package-private */
    @UsedByNative("material_java_wrappers.h")
    public void setFloat3(String str, float f, float f2, float f3) {
        this.f5221a.put(str, new C2712h(str, f, f2, f3));
    }

    /* access modifiers changed from: package-private */
    @UsedByNative("material_java_wrappers.h")
    public void setFloat4(String str, float f, float f2, float f3, float f4) {
        this.f5221a.put(str, new C2713i(str, f, f2, f3, f4));
    }

    /* access modifiers changed from: package-private */
    @UsedByNative("material_java_wrappers.h")
    public void setInt(String str, int i) {
        this.f5221a.put(str, new C2718n(str, i));
    }

    /* access modifiers changed from: package-private */
    @UsedByNative("material_java_wrappers.h")
    public void setInt2(String str, int i, int i2) {
        this.f5221a.put(str, new C2715k(str, i, i2));
    }

    /* access modifiers changed from: package-private */
    @UsedByNative("material_java_wrappers.h")
    public void setInt3(String str, int i, int i2, int i3) {
        this.f5221a.put(str, new C2716l(str, i, i2, i3));
    }

    /* access modifiers changed from: package-private */
    @UsedByNative("material_java_wrappers.h")
    public void setInt4(String str, int i, int i2, int i3, int i4) {
        this.f5221a.put(str, new C2717m(str, i, i2, i3, i4));
    }

    /* access modifiers changed from: package-private */
    @UsedByNative("material_java_wrappers.h")
    public void setTexture(String str, Texture texture) {
        this.f5221a.put(str, new C2720p(str, texture));
    }
}
