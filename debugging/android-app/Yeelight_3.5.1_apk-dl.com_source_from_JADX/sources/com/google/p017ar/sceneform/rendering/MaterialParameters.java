package com.google.p017ar.sceneform.rendering;

import androidx.annotation.Nullable;
import com.google.android.filament.Material;
import com.google.android.filament.MaterialInstance;
import com.google.android.filament.TextureSampler;
import com.google.p017ar.core.annotations.UsedByNative;
import com.google.p017ar.sceneform.math.Vector3;
import com.google.p017ar.sceneform.rendering.Texture;
import java.util.HashMap;

@UsedByNative("material_java_wrappers.h")
/* renamed from: com.google.ar.sceneform.rendering.MaterialParameters */
final class MaterialParameters {

    /* renamed from: a */
    private final HashMap<String, C2105o> f3296a = new HashMap<>();

    /* renamed from: com.google.ar.sceneform.rendering.MaterialParameters$a */
    static /* synthetic */ class C2091a {

        /* renamed from: a */
        static final /* synthetic */ int[] f3297a;

        /* renamed from: b */
        static final /* synthetic */ int[] f3298b;

        /* renamed from: c */
        static final /* synthetic */ int[] f3299c;

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
                com.google.ar.sceneform.rendering.Texture$Sampler$WrapMode[] r0 = com.google.p017ar.sceneform.rendering.Texture.Sampler.WrapMode.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f3299c = r0
                r1 = 1
                com.google.ar.sceneform.rendering.Texture$Sampler$WrapMode r2 = com.google.p017ar.sceneform.rendering.Texture.Sampler.WrapMode.CLAMP_TO_EDGE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f3299c     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.ar.sceneform.rendering.Texture$Sampler$WrapMode r3 = com.google.p017ar.sceneform.rendering.Texture.Sampler.WrapMode.REPEAT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f3299c     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.ar.sceneform.rendering.Texture$Sampler$WrapMode r4 = com.google.p017ar.sceneform.rendering.Texture.Sampler.WrapMode.MIRRORED_REPEAT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                com.google.ar.sceneform.rendering.Texture$Sampler$MagFilter[] r3 = com.google.p017ar.sceneform.rendering.Texture.Sampler.MagFilter.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                f3298b = r3
                com.google.ar.sceneform.rendering.Texture$Sampler$MagFilter r4 = com.google.p017ar.sceneform.rendering.Texture.Sampler.MagFilter.NEAREST     // Catch:{ NoSuchFieldError -> 0x0039 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0039 }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                int[] r3 = f3298b     // Catch:{ NoSuchFieldError -> 0x0043 }
                com.google.ar.sceneform.rendering.Texture$Sampler$MagFilter r4 = com.google.p017ar.sceneform.rendering.Texture.Sampler.MagFilter.LINEAR     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r3[r4] = r0     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                com.google.ar.sceneform.rendering.Texture$Sampler$MinFilter[] r3 = com.google.p017ar.sceneform.rendering.Texture.Sampler.MinFilter.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                f3297a = r3
                com.google.ar.sceneform.rendering.Texture$Sampler$MinFilter r4 = com.google.p017ar.sceneform.rendering.Texture.Sampler.MinFilter.NEAREST     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r1 = f3297a     // Catch:{ NoSuchFieldError -> 0x005e }
                com.google.ar.sceneform.rendering.Texture$Sampler$MinFilter r3 = com.google.p017ar.sceneform.rendering.Texture.Sampler.MinFilter.LINEAR     // Catch:{ NoSuchFieldError -> 0x005e }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x005e }
                r1[r3] = r0     // Catch:{ NoSuchFieldError -> 0x005e }
            L_0x005e:
                int[] r0 = f3297a     // Catch:{ NoSuchFieldError -> 0x0068 }
                com.google.ar.sceneform.rendering.Texture$Sampler$MinFilter r1 = com.google.p017ar.sceneform.rendering.Texture.Sampler.MinFilter.NEAREST_MIPMAP_NEAREST     // Catch:{ NoSuchFieldError -> 0x0068 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0068 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0068 }
            L_0x0068:
                int[] r0 = f3297a     // Catch:{ NoSuchFieldError -> 0x0073 }
                com.google.ar.sceneform.rendering.Texture$Sampler$MinFilter r1 = com.google.p017ar.sceneform.rendering.Texture.Sampler.MinFilter.LINEAR_MIPMAP_NEAREST     // Catch:{ NoSuchFieldError -> 0x0073 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0073 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0073 }
            L_0x0073:
                int[] r0 = f3297a     // Catch:{ NoSuchFieldError -> 0x007e }
                com.google.ar.sceneform.rendering.Texture$Sampler$MinFilter r1 = com.google.p017ar.sceneform.rendering.Texture.Sampler.MinFilter.NEAREST_MIPMAP_LINEAR     // Catch:{ NoSuchFieldError -> 0x007e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x007e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x007e }
            L_0x007e:
                int[] r0 = f3297a     // Catch:{ NoSuchFieldError -> 0x0089 }
                com.google.ar.sceneform.rendering.Texture$Sampler$MinFilter r1 = com.google.p017ar.sceneform.rendering.Texture.Sampler.MinFilter.LINEAR_MIPMAP_LINEAR     // Catch:{ NoSuchFieldError -> 0x0089 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0089 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0089 }
            L_0x0089:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.p017ar.sceneform.rendering.MaterialParameters.C2091a.<clinit>():void");
        }
    }

    /* renamed from: com.google.ar.sceneform.rendering.MaterialParameters$b */
    static class C2092b extends C2105o {

        /* renamed from: b */
        boolean f3300b;

        /* renamed from: c */
        boolean f3301c;

        C2092b(String str, boolean z, boolean z2) {
            this.f3331a = str;
            this.f3300b = z;
            this.f3301c = z2;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo17490a(MaterialInstance materialInstance) {
            materialInstance.setParameter(this.f3331a, this.f3300b, this.f3301c);
        }
    }

    /* renamed from: com.google.ar.sceneform.rendering.MaterialParameters$c */
    static class C2093c extends C2105o {

        /* renamed from: b */
        boolean f3302b;

        /* renamed from: c */
        boolean f3303c;

        /* renamed from: d */
        boolean f3304d;

        C2093c(String str, boolean z, boolean z2, boolean z3) {
            this.f3331a = str;
            this.f3302b = z;
            this.f3303c = z2;
            this.f3304d = z3;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo17490a(MaterialInstance materialInstance) {
            materialInstance.setParameter(this.f3331a, this.f3302b, this.f3303c, this.f3304d);
        }
    }

    /* renamed from: com.google.ar.sceneform.rendering.MaterialParameters$d */
    static class C2094d extends C2105o {

        /* renamed from: b */
        boolean f3305b;

        /* renamed from: c */
        boolean f3306c;

        /* renamed from: d */
        boolean f3307d;

        /* renamed from: e */
        boolean f3308e;

        C2094d(String str, boolean z, boolean z2, boolean z3, boolean z4) {
            this.f3331a = str;
            this.f3305b = z;
            this.f3306c = z2;
            this.f3307d = z3;
            this.f3308e = z4;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo17490a(MaterialInstance materialInstance) {
            materialInstance.setParameter(this.f3331a, this.f3305b, this.f3306c, this.f3307d, this.f3308e);
        }
    }

    /* renamed from: com.google.ar.sceneform.rendering.MaterialParameters$e */
    static class C2095e extends C2105o {

        /* renamed from: b */
        boolean f3309b;

        C2095e(String str, boolean z) {
            this.f3331a = str;
            this.f3309b = z;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo17490a(MaterialInstance materialInstance) {
            materialInstance.setParameter(this.f3331a, this.f3309b);
        }
    }

    /* renamed from: com.google.ar.sceneform.rendering.MaterialParameters$f */
    static class C2096f extends C2105o {
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final ExternalTexture f3310b;

        C2096f(String str, ExternalTexture externalTexture) {
            this.f3331a = str;
            this.f3310b = externalTexture;
        }

        /* renamed from: d */
        private TextureSampler m5277d() {
            TextureSampler textureSampler = new TextureSampler();
            textureSampler.setMinFilter(TextureSampler.MinFilter.LINEAR);
            textureSampler.setMagFilter(TextureSampler.MagFilter.LINEAR);
            TextureSampler.WrapMode wrapMode = TextureSampler.WrapMode.CLAMP_TO_EDGE;
            textureSampler.setWrapModeS(wrapMode);
            textureSampler.setWrapModeT(wrapMode);
            textureSampler.setWrapModeR(wrapMode);
            return textureSampler;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo17490a(MaterialInstance materialInstance) {
            materialInstance.setParameter(this.f3331a, this.f3310b.getFilamentTexture(), m5277d());
        }

        /* renamed from: b */
        public C2105o clone() {
            return new C2096f(this.f3331a, this.f3310b);
        }
    }

    /* renamed from: com.google.ar.sceneform.rendering.MaterialParameters$g */
    static class C2097g extends C2105o {

        /* renamed from: b */
        float f3311b;

        /* renamed from: c */
        float f3312c;

        C2097g(String str, float f, float f2) {
            this.f3331a = str;
            this.f3311b = f;
            this.f3312c = f2;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo17490a(MaterialInstance materialInstance) {
            materialInstance.setParameter(this.f3331a, this.f3311b, this.f3312c);
        }
    }

    /* renamed from: com.google.ar.sceneform.rendering.MaterialParameters$h */
    static class C2098h extends C2105o {

        /* renamed from: b */
        float f3313b;

        /* renamed from: c */
        float f3314c;

        /* renamed from: d */
        float f3315d;

        C2098h(String str, float f, float f2, float f3) {
            this.f3331a = str;
            this.f3313b = f;
            this.f3314c = f2;
            this.f3315d = f3;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo17490a(MaterialInstance materialInstance) {
            materialInstance.setParameter(this.f3331a, this.f3313b, this.f3314c, this.f3315d);
        }
    }

    /* renamed from: com.google.ar.sceneform.rendering.MaterialParameters$i */
    static class C2099i extends C2105o {

        /* renamed from: b */
        float f3316b;

        /* renamed from: c */
        float f3317c;

        /* renamed from: d */
        float f3318d;

        /* renamed from: e */
        float f3319e;

        C2099i(String str, float f, float f2, float f3, float f4) {
            this.f3331a = str;
            this.f3316b = f;
            this.f3317c = f2;
            this.f3318d = f3;
            this.f3319e = f4;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo17490a(MaterialInstance materialInstance) {
            materialInstance.setParameter(this.f3331a, this.f3316b, this.f3317c, this.f3318d, this.f3319e);
        }
    }

    /* renamed from: com.google.ar.sceneform.rendering.MaterialParameters$j */
    static class C2100j extends C2105o {

        /* renamed from: b */
        float f3320b;

        C2100j(String str, float f) {
            this.f3331a = str;
            this.f3320b = f;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo17490a(MaterialInstance materialInstance) {
            materialInstance.setParameter(this.f3331a, this.f3320b);
        }
    }

    /* renamed from: com.google.ar.sceneform.rendering.MaterialParameters$k */
    static class C2101k extends C2105o {

        /* renamed from: b */
        int f3321b;

        /* renamed from: c */
        int f3322c;

        C2101k(String str, int i, int i2) {
            this.f3331a = str;
            this.f3321b = i;
            this.f3322c = i2;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo17490a(MaterialInstance materialInstance) {
            materialInstance.setParameter(this.f3331a, this.f3321b, this.f3322c);
        }
    }

    /* renamed from: com.google.ar.sceneform.rendering.MaterialParameters$l */
    static class C2102l extends C2105o {

        /* renamed from: b */
        int f3323b;

        /* renamed from: c */
        int f3324c;

        /* renamed from: d */
        int f3325d;

        C2102l(String str, int i, int i2, int i3) {
            this.f3331a = str;
            this.f3323b = i;
            this.f3324c = i2;
            this.f3325d = i3;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo17490a(MaterialInstance materialInstance) {
            materialInstance.setParameter(this.f3331a, this.f3323b, this.f3324c, this.f3325d);
        }
    }

    /* renamed from: com.google.ar.sceneform.rendering.MaterialParameters$m */
    static class C2103m extends C2105o {

        /* renamed from: b */
        int f3326b;

        /* renamed from: c */
        int f3327c;

        /* renamed from: d */
        int f3328d;

        /* renamed from: e */
        int f3329e;

        C2103m(String str, int i, int i2, int i3, int i4) {
            this.f3331a = str;
            this.f3326b = i;
            this.f3327c = i2;
            this.f3328d = i3;
            this.f3329e = i4;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo17490a(MaterialInstance materialInstance) {
            materialInstance.setParameter(this.f3331a, this.f3326b, this.f3327c, this.f3328d, this.f3329e);
        }
    }

    /* renamed from: com.google.ar.sceneform.rendering.MaterialParameters$n */
    static class C2104n extends C2105o {

        /* renamed from: b */
        int f3330b;

        C2104n(String str, int i) {
            this.f3331a = str;
            this.f3330b = i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo17490a(MaterialInstance materialInstance) {
            materialInstance.setParameter(this.f3331a, this.f3330b);
        }
    }

    /* renamed from: com.google.ar.sceneform.rendering.MaterialParameters$o */
    static abstract class C2105o implements Cloneable {

        /* renamed from: a */
        String f3331a;

        C2105o() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public abstract void mo17490a(MaterialInstance materialInstance);

        /* renamed from: b */
        public C2105o clone() {
            try {
                return (C2105o) super.clone();
            } catch (CloneNotSupportedException e) {
                throw new AssertionError(e);
            }
        }
    }

    /* renamed from: com.google.ar.sceneform.rendering.MaterialParameters$p */
    static class C2106p extends C2105o {

        /* renamed from: b */
        final Texture f3332b;

        C2106p(String str, Texture texture) {
            this.f3331a = str;
            this.f3332b = texture;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo17490a(MaterialInstance materialInstance) {
            materialInstance.setParameter(this.f3331a, this.f3332b.getFilamentTexture(), MaterialParameters.m5264c(this.f3332b.getSampler()));
        }

        /* renamed from: b */
        public C2105o clone() {
            return new C2106p(this.f3331a, this.f3332b);
        }
    }

    MaterialParameters() {
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static TextureSampler m5264c(Texture.Sampler sampler) {
        TextureSampler.MinFilter minFilter;
        TextureSampler.MagFilter magFilter;
        TextureSampler textureSampler = new TextureSampler();
        switch (C2091a.f3297a[sampler.getMinFilter().ordinal()]) {
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
        int i = C2091a.f3298b[sampler.getMagFilter().ordinal()];
        if (i == 1) {
            magFilter = TextureSampler.MagFilter.NEAREST;
        } else if (i == 2) {
            magFilter = TextureSampler.MagFilter.LINEAR;
        } else {
            throw new IllegalArgumentException("Invalid MagFilter");
        }
        textureSampler.setMagFilter(magFilter);
        textureSampler.setWrapModeS(m5265d(sampler.getWrapModeS()));
        textureSampler.setWrapModeT(m5265d(sampler.getWrapModeT()));
        textureSampler.setWrapModeR(m5265d(sampler.getWrapModeR()));
        return textureSampler;
    }

    /* renamed from: d */
    private static TextureSampler.WrapMode m5265d(Texture.Sampler.WrapMode wrapMode) {
        int i = C2091a.f3299c[wrapMode.ordinal()];
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
    public void mo17471b(MaterialInstance materialInstance) {
        Material material = materialInstance.getMaterial();
        for (C2105o next : this.f3296a.values()) {
            if (material.hasParameter(next.f3331a)) {
                next.mo17490a(materialInstance);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo17472e(MaterialParameters materialParameters) {
        this.f3296a.clear();
        mo17474g(materialParameters);
    }

    /* access modifiers changed from: package-private */
    @Nullable
    /* renamed from: f */
    public ExternalTexture mo17473f(String str) {
        C2105o oVar = this.f3296a.get(str);
        if (oVar instanceof C2096f) {
            return ((C2096f) oVar).f3310b;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo17474g(MaterialParameters materialParameters) {
        for (C2105o b : materialParameters.f3296a.values()) {
            C2105o b2 = b.clone();
            this.f3296a.put(b2.f3331a, b2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo17475h(String str, ExternalTexture externalTexture) {
        this.f3296a.put(str, new C2096f(str, externalTexture));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo17476i(String str, Vector3 vector3) {
        this.f3296a.put(str, new C2098h(str, vector3.f3277x, vector3.f3278y, vector3.f3279z));
    }

    /* access modifiers changed from: package-private */
    @UsedByNative("material_java_wrappers.h")
    public void setBoolean(String str, boolean z) {
        this.f3296a.put(str, new C2095e(str, z));
    }

    /* access modifiers changed from: package-private */
    @UsedByNative("material_java_wrappers.h")
    public void setBoolean2(String str, boolean z, boolean z2) {
        this.f3296a.put(str, new C2092b(str, z, z2));
    }

    /* access modifiers changed from: package-private */
    @UsedByNative("material_java_wrappers.h")
    public void setBoolean3(String str, boolean z, boolean z2, boolean z3) {
        this.f3296a.put(str, new C2093c(str, z, z2, z3));
    }

    /* access modifiers changed from: package-private */
    @UsedByNative("material_java_wrappers.h")
    public void setBoolean4(String str, boolean z, boolean z2, boolean z3, boolean z4) {
        this.f3296a.put(str, new C2094d(str, z, z2, z3, z4));
    }

    /* access modifiers changed from: package-private */
    @UsedByNative("material_java_wrappers.h")
    public void setFloat(String str, float f) {
        this.f3296a.put(str, new C2100j(str, f));
    }

    /* access modifiers changed from: package-private */
    @UsedByNative("material_java_wrappers.h")
    public void setFloat2(String str, float f, float f2) {
        this.f3296a.put(str, new C2097g(str, f, f2));
    }

    /* access modifiers changed from: package-private */
    @UsedByNative("material_java_wrappers.h")
    public void setFloat3(String str, float f, float f2, float f3) {
        this.f3296a.put(str, new C2098h(str, f, f2, f3));
    }

    /* access modifiers changed from: package-private */
    @UsedByNative("material_java_wrappers.h")
    public void setFloat4(String str, float f, float f2, float f3, float f4) {
        this.f3296a.put(str, new C2099i(str, f, f2, f3, f4));
    }

    /* access modifiers changed from: package-private */
    @UsedByNative("material_java_wrappers.h")
    public void setInt(String str, int i) {
        this.f3296a.put(str, new C2104n(str, i));
    }

    /* access modifiers changed from: package-private */
    @UsedByNative("material_java_wrappers.h")
    public void setInt2(String str, int i, int i2) {
        this.f3296a.put(str, new C2101k(str, i, i2));
    }

    /* access modifiers changed from: package-private */
    @UsedByNative("material_java_wrappers.h")
    public void setInt3(String str, int i, int i2, int i3) {
        this.f3296a.put(str, new C2102l(str, i, i2, i3));
    }

    /* access modifiers changed from: package-private */
    @UsedByNative("material_java_wrappers.h")
    public void setInt4(String str, int i, int i2, int i3, int i4) {
        this.f3296a.put(str, new C2103m(str, i, i2, i3, i4));
    }

    /* access modifiers changed from: package-private */
    @UsedByNative("material_java_wrappers.h")
    public void setTexture(String str, Texture texture) {
        this.f3296a.put(str, new C2106p(str, texture));
    }
}
