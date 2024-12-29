package com.google.p017ar.sceneform.rendering;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.android.filament.Texture;
import com.google.android.filament.android.TextureHelper;
import com.google.p017ar.core.annotations.UsedByNative;
import com.google.p017ar.sceneform.utilities.AndroidPreconditions;
import com.google.p017ar.sceneform.utilities.LoadHelper;
import com.google.p017ar.sceneform.utilities.Preconditions;
import java.io.InputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.CompletableFuture;

@RequiresApi(api = 24)
@UsedByNative("material_java_wrappers.h")
/* renamed from: com.google.ar.sceneform.rendering.Texture */
public class Texture {
    private static final int MIP_LEVELS_TO_GENERATE = 255;
    /* access modifiers changed from: private */
    public static final String TAG = "Texture";
    @Nullable
    private final TextureInternalData textureData;

    /* renamed from: com.google.ar.sceneform.rendering.Texture$1 */
    static /* synthetic */ class C21161 {

        /* renamed from: a */
        static final /* synthetic */ int[] f3344a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.google.ar.sceneform.rendering.Texture$Usage[] r0 = com.google.p017ar.sceneform.rendering.Texture.Usage.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f3344a = r0
                com.google.ar.sceneform.rendering.Texture$Usage r1 = com.google.p017ar.sceneform.rendering.Texture.Usage.COLOR     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f3344a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.ar.sceneform.rendering.Texture$Usage r1 = com.google.p017ar.sceneform.rendering.Texture.Usage.NORMAL     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f3344a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.ar.sceneform.rendering.Texture$Usage r1 = com.google.p017ar.sceneform.rendering.Texture.Usage.DATA     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.p017ar.sceneform.rendering.Texture.C21161.<clinit>():void");
        }
    }

    /* renamed from: com.google.ar.sceneform.rendering.Texture$Builder */
    public static final class Builder {
        private static final int MAX_BITMAP_SIZE = 4096;
        @Nullable
        private Bitmap bitmap;
        private boolean inPremultiplied;
        @Nullable
        private Callable<InputStream> inputStreamCreator;
        @Nullable
        private Object registryId;
        private Sampler sampler;
        @Nullable
        private TextureInternalData textureInternalData;
        private Usage usage;

        private Builder() {
            this.inputStreamCreator = null;
            this.bitmap = null;
            this.textureInternalData = null;
            this.usage = Usage.COLOR;
            this.registryId = null;
            this.inPremultiplied = true;
            this.sampler = Sampler.builder().build();
        }

        /* synthetic */ Builder(C21161 r1) {
            this();
        }

        /* access modifiers changed from: private */
        public /* synthetic */ Texture lambda$build$0(Bitmap bitmap2) {
            return new Texture(makeTextureData(bitmap2, this.sampler, this.usage, 255), (C21161) null);
        }

        /* access modifiers changed from: private */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x0037, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0038, code lost:
            if (r2 != null) goto L_0x003a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
            r2.close();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x0042, code lost:
            throw r0;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static /* synthetic */ android.graphics.Bitmap lambda$makeBitmap$1(boolean r2, java.util.concurrent.Callable r3) {
            /*
                android.graphics.BitmapFactory$Options r0 = new android.graphics.BitmapFactory$Options
                r0.<init>()
                r1 = 0
                r0.inScaled = r1
                r0.inPremultiplied = r2
                java.lang.Object r2 = r3.call()     // Catch:{ Exception -> 0x0043 }
                java.io.InputStream r2 = (java.io.InputStream) r2     // Catch:{ Exception -> 0x0043 }
                r3 = 0
                android.graphics.Bitmap r3 = android.graphics.BitmapFactory.decodeStream(r2, r3, r0)     // Catch:{ all -> 0x0035 }
                if (r2 == 0) goto L_0x001a
                r2.close()     // Catch:{ Exception -> 0x0043 }
            L_0x001a:
                if (r3 == 0) goto L_0x002d
                android.graphics.Bitmap$Config r2 = r3.getConfig()
                android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
                if (r2 != r0) goto L_0x0025
                return r3
            L_0x0025:
                java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
                java.lang.String r3 = "Texture must use ARGB8 format."
                r2.<init>(r3)
                throw r2
            L_0x002d:
                java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
                java.lang.String r3 = "Failed to decode the texture bitmap. The InputStream was not a valid bitmap."
                r2.<init>(r3)
                throw r2
            L_0x0035:
                r3 = move-exception
                throw r3     // Catch:{ all -> 0x0037 }
            L_0x0037:
                r0 = move-exception
                if (r2 == 0) goto L_0x0042
                r2.close()     // Catch:{ all -> 0x003e }
                goto L_0x0042
            L_0x003e:
                r2 = move-exception
                r3.addSuppressed(r2)     // Catch:{ Exception -> 0x0043 }
            L_0x0042:
                throw r0     // Catch:{ Exception -> 0x0043 }
            L_0x0043:
                r2 = move-exception
                java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
                r3.<init>(r2)
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.p017ar.sceneform.rendering.Texture.Builder.lambda$makeBitmap$1(boolean, java.util.concurrent.Callable):android.graphics.Bitmap");
        }

        private static CompletableFuture<Bitmap> makeBitmap(Callable<InputStream> callable, boolean z) {
            return CompletableFuture.supplyAsync(new C2145l0(z, callable), ThreadPools.getThreadPoolExecutor());
        }

        private static TextureInternalData makeTextureData(Bitmap bitmap2, Sampler sampler2, Usage usage2, int i) {
            IEngine engine = EngineInstance.getEngine();
            com.google.android.filament.Texture build = new Texture.Builder().width(bitmap2.getWidth()).height(bitmap2.getHeight()).depth(1).levels(i).sampler(Texture.Sampler.SAMPLER_2D).format(Texture.getInternalFormatForUsage(usage2)).build(engine.getFilamentEngine());
            TextureHelper.setBitmap(engine.getFilamentEngine(), build, 0, bitmap2);
            if (i > 1) {
                build.generateMipmaps(engine.getFilamentEngine());
            }
            return new TextureInternalData(build, sampler2);
        }

        public CompletableFuture<Texture> build() {
            CompletableFuture<U> completableFuture;
            CompletableFuture<Bitmap> completableFuture2;
            CompletableFuture<Texture> completableFuture3;
            AndroidPreconditions.checkUiThread();
            Object obj = this.registryId;
            if (obj != null && (completableFuture3 = ResourceManager.getInstance().getTextureRegistry().get(obj)) != null) {
                return completableFuture3;
            }
            TextureInternalData textureInternalData2 = this.textureInternalData;
            if (textureInternalData2 == null || obj == null) {
                if (textureInternalData2 != null) {
                    completableFuture = CompletableFuture.completedFuture(new Texture(this.textureInternalData, (C21161) null));
                } else {
                    Callable<InputStream> callable = this.inputStreamCreator;
                    if (callable != null) {
                        completableFuture2 = makeBitmap(callable, this.inPremultiplied);
                    } else {
                        Bitmap bitmap2 = this.bitmap;
                        if (bitmap2 != null) {
                            completableFuture2 = CompletableFuture.completedFuture(bitmap2);
                        } else {
                            throw new IllegalStateException("Texture must have a source.");
                        }
                    }
                    completableFuture = completableFuture2.thenApplyAsync(new C2143k0(this), ThreadPools.getMainExecutor());
                }
                if (obj != null) {
                    ResourceManager.getInstance().getTextureRegistry().register(obj, completableFuture);
                }
                String access$200 = Texture.TAG;
                String valueOf = String.valueOf(obj);
                StringBuilder sb = new StringBuilder(valueOf.length() + 36);
                sb.append("Unable to load Texture registryId='");
                sb.append(valueOf);
                sb.append("'");
                C2129e.m5321c(access$200, completableFuture, sb.toString());
                return completableFuture;
            }
            throw new IllegalStateException("Builder must not set both a bitmap and filament texture");
        }

        /* access modifiers changed from: package-private */
        public Builder setPremultiplied(boolean z) {
            this.inPremultiplied = z;
            return this;
        }

        public Builder setRegistryId(Object obj) {
            this.registryId = obj;
            return this;
        }

        public Builder setSampler(Sampler sampler2) {
            this.sampler = sampler2;
            return this;
        }

        public Builder setSource(Context context, int i) {
            setSource(LoadHelper.fromResource(context, i));
            this.registryId = context.getResources().getResourceName(i);
            return this;
        }

        public Builder setSource(Context context, Uri uri) {
            Preconditions.checkNotNull(uri, "Parameter \"sourceUri\" was null.");
            this.registryId = uri;
            setSource(LoadHelper.fromUri(context, uri));
            return this;
        }

        public Builder setSource(Bitmap bitmap2) {
            Preconditions.checkNotNull(bitmap2, "Parameter \"bitmap\" was null.");
            if (bitmap2.getConfig() != Bitmap.Config.ARGB_8888) {
                String valueOf = String.valueOf(bitmap2.getConfig());
                StringBuilder sb = new StringBuilder(valueOf.length() + 69);
                sb.append("Invalid Bitmap: Bitmap's configuration must be ARGB_8888, but it was ");
                sb.append(valueOf);
                throw new IllegalArgumentException(sb.toString());
            } else if (bitmap2.hasAlpha() && !bitmap2.isPremultiplied()) {
                throw new IllegalArgumentException("Invalid Bitmap: Bitmap must be premultiplied.");
            } else if (bitmap2.getWidth() > 4096 || bitmap2.getHeight() > 4096) {
                int width = bitmap2.getWidth();
                int height = bitmap2.getHeight();
                StringBuilder sb2 = new StringBuilder(119);
                sb2.append("Invalid Bitmap: Bitmap width and height must be smaller than 4096. Bitmap was ");
                sb2.append(width);
                sb2.append(" width and ");
                sb2.append(height);
                sb2.append(" height.");
                throw new IllegalArgumentException(sb2.toString());
            } else {
                this.bitmap = bitmap2;
                this.registryId = null;
                this.inputStreamCreator = null;
                return this;
            }
        }

        public Builder setSource(Callable<InputStream> callable) {
            Preconditions.checkNotNull(callable, "Parameter \"inputStreamCreator\" was null.");
            this.inputStreamCreator = callable;
            this.bitmap = null;
            return this;
        }

        public Builder setUsage(Usage usage2) {
            this.usage = usage2;
            return this;
        }
    }

    @UsedByNative("material_java_wrappers.h")
    /* renamed from: com.google.ar.sceneform.rendering.Texture$Sampler */
    public static class Sampler {
        private final MagFilter magFilter;
        private final MinFilter minFilter;
        private final WrapMode wrapModeR;
        private final WrapMode wrapModeS;
        private final WrapMode wrapModeT;

        /* renamed from: com.google.ar.sceneform.rendering.Texture$Sampler$Builder */
        public static class Builder {
            /* access modifiers changed from: private */
            public MagFilter magFilter;
            /* access modifiers changed from: private */
            public MinFilter minFilter;
            /* access modifiers changed from: private */
            public WrapMode wrapModeR;
            /* access modifiers changed from: private */
            public WrapMode wrapModeS;
            /* access modifiers changed from: private */
            public WrapMode wrapModeT;

            public Sampler build() {
                return new Sampler(this, (C21161) null);
            }

            public Builder setMagFilter(MagFilter magFilter2) {
                this.magFilter = magFilter2;
                return this;
            }

            public Builder setMinFilter(MinFilter minFilter2) {
                this.minFilter = minFilter2;
                return this;
            }

            /* access modifiers changed from: package-private */
            public Builder setMinMagFilter(MagFilter magFilter2) {
                return setMinFilter(MinFilter.values()[magFilter2.ordinal()]).setMagFilter(magFilter2);
            }

            public Builder setWrapMode(WrapMode wrapMode) {
                return setWrapModeS(wrapMode).setWrapModeT(wrapMode).setWrapModeR(wrapMode);
            }

            public Builder setWrapModeR(WrapMode wrapMode) {
                this.wrapModeR = wrapMode;
                return this;
            }

            public Builder setWrapModeS(WrapMode wrapMode) {
                this.wrapModeS = wrapMode;
                return this;
            }

            public Builder setWrapModeT(WrapMode wrapMode) {
                this.wrapModeT = wrapMode;
                return this;
            }
        }

        @UsedByNative("material_java_wrappers.h")
        /* renamed from: com.google.ar.sceneform.rendering.Texture$Sampler$MagFilter */
        public enum MagFilter {
            NEAREST,
            LINEAR
        }

        @UsedByNative("material_java_wrappers.h")
        /* renamed from: com.google.ar.sceneform.rendering.Texture$Sampler$MinFilter */
        public enum MinFilter {
            NEAREST,
            LINEAR,
            NEAREST_MIPMAP_NEAREST,
            LINEAR_MIPMAP_NEAREST,
            NEAREST_MIPMAP_LINEAR,
            LINEAR_MIPMAP_LINEAR
        }

        @UsedByNative("material_java_wrappers.h")
        /* renamed from: com.google.ar.sceneform.rendering.Texture$Sampler$WrapMode */
        public enum WrapMode {
            CLAMP_TO_EDGE,
            REPEAT,
            MIRRORED_REPEAT
        }

        private Sampler(Builder builder) {
            this.minFilter = builder.minFilter;
            this.magFilter = builder.magFilter;
            this.wrapModeS = builder.wrapModeS;
            this.wrapModeT = builder.wrapModeT;
            this.wrapModeR = builder.wrapModeR;
        }

        /* synthetic */ Sampler(Builder builder, C21161 r2) {
            this(builder);
        }

        public static Builder builder() {
            return new Builder().setMinFilter(MinFilter.LINEAR_MIPMAP_LINEAR).setMagFilter(MagFilter.LINEAR).setWrapMode(WrapMode.CLAMP_TO_EDGE);
        }

        public MagFilter getMagFilter() {
            return this.magFilter;
        }

        public MinFilter getMinFilter() {
            return this.minFilter;
        }

        public WrapMode getWrapModeR() {
            return this.wrapModeR;
        }

        public WrapMode getWrapModeS() {
            return this.wrapModeS;
        }

        public WrapMode getWrapModeT() {
            return this.wrapModeT;
        }
    }

    /* renamed from: com.google.ar.sceneform.rendering.Texture$Usage */
    public enum Usage {
        COLOR,
        NORMAL,
        DATA
    }

    /* renamed from: com.google.ar.sceneform.rendering.Texture$a */
    private static final class C2117a implements Runnable {

        /* renamed from: a */
        private final TextureInternalData f3345a;

        C2117a(TextureInternalData textureInternalData) {
            this.f3345a = textureInternalData;
        }

        public void run() {
            AndroidPreconditions.checkUiThread();
            TextureInternalData textureInternalData = this.f3345a;
            if (textureInternalData != null) {
                textureInternalData.release();
            }
        }
    }

    @UsedByNative("material_java_wrappers.h")
    private Texture(TextureInternalData textureInternalData) {
        this.textureData = textureInternalData;
        textureInternalData.retain();
        ResourceManager.getInstance().getTextureCleanupRegistry().register(this, new C2117a(textureInternalData));
    }

    /* synthetic */ Texture(TextureInternalData textureInternalData, C21161 r2) {
        this(textureInternalData);
    }

    public static Builder builder() {
        AndroidPreconditions.checkMinAndroidApiLevel();
        return new Builder((C21161) null);
    }

    /* access modifiers changed from: private */
    public static Texture.InternalFormat getInternalFormatForUsage(Usage usage) {
        return C21161.f3344a[usage.ordinal()] != 1 ? Texture.InternalFormat.RGBA8 : Texture.InternalFormat.SRGB8_A8;
    }

    /* access modifiers changed from: package-private */
    public com.google.android.filament.Texture getFilamentTexture() {
        return ((TextureInternalData) Preconditions.checkNotNull(this.textureData)).getFilamentTexture();
    }

    /* access modifiers changed from: package-private */
    public Sampler getSampler() {
        return ((TextureInternalData) Preconditions.checkNotNull(this.textureData)).getSampler();
    }
}
