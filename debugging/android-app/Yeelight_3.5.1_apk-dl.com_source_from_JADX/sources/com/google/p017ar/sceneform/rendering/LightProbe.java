package com.google.p017ar.sceneform.rendering;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.Image;
import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.filament.IndirectLight;
import com.google.android.filament.Texture;
import com.google.p017ar.sceneform.math.Matrix;
import com.google.p017ar.sceneform.math.Quaternion;
import com.google.p017ar.sceneform.utilities.AndroidPreconditions;
import com.google.p017ar.sceneform.utilities.ChangeId;
import com.google.p017ar.sceneform.utilities.LoadHelper;
import com.google.p017ar.sceneform.utilities.Preconditions;
import com.google.p017ar.schemas.lull.Vec3;
import com.google.p017ar.schemas.sceneform.LightingCubeDef;
import com.google.p017ar.schemas.sceneform.LightingCubeFaceDef;
import com.google.p017ar.schemas.sceneform.LightingDef;
import java.io.InputStream;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.util.concurrent.Callable;
import java.util.concurrent.CompletableFuture;

/* renamed from: com.google.ar.sceneform.rendering.LightProbe */
public class LightProbe {
    private static final int BYTES_PER_FLOAT16 = 2;
    private static final int CUBEMAP_FACE_COUNT = 6;
    private static final int CUBEMAP_MIN_WIDTH = 4;
    private static final float[] ENVIRONMENTAL_HDR_TO_FILAMENT_SH_COEFFIECIENTS = {0.282095f, -0.325735f, 0.325735f, -0.325735f, 0.273137f, -0.273137f, 0.078848f, -0.273137f, 0.136569f};
    private static final int[] ENVIRONMENTAL_HDR_TO_FILAMENT_SH_INDEX_MAP = {0, 1, 2, 3, 4, 5, 7, 6, 8};
    private static final int[] FACE_TO_FILAMENT_MAPPING = {3, 0, 4, 1, 5, 2};
    private static final int FLOATS_PER_VECTOR = 3;
    private static final float LIGHT_ESTIMATE_OFFSET = 0.0f;
    private static final float LIGHT_ESTIMATE_SCALE = 1.8f;
    private static final int RGBA_BYTES_PER_PIXEL = 8;
    private static final int RGBM_BYTES_PER_PIXEL = 4;
    private static final int RGB_BYTES_PER_PIXEL = 6;
    private static final int RGB_CHANNEL_COUNT = 3;
    private static final int SH_ORDER = 3;
    private static final int SH_VECTORS_FOR_THIRD_ORDER = 9;
    /* access modifiers changed from: private */
    public static final String TAG = "LightProbe";
    private final Color ambientColor;
    private ChangeId changeId;
    private final Color colorCorrection;
    private ByteBuffer cubemapBuffer;
    private float intensity;
    private float[] irradianceData;
    private float lightEstimate;
    @Nullable
    private String name;
    @Nullable
    private Texture reflectCubemap;
    @Nullable
    private Quaternion rotation;

    /* renamed from: com.google.ar.sceneform.rendering.LightProbe$Builder */
    public static final class Builder {
        @Nullable
        private Callable<InputStream> inputStreamCreator;
        /* access modifiers changed from: private */
        public float intensity;
        /* access modifiers changed from: private */
        @Nullable
        public String name;
        /* access modifiers changed from: private */
        @Nullable
        public Quaternion rotation;

        private Builder() {
            this.inputStreamCreator = null;
            this.intensity = 220.0f;
            this.name = null;
        }

        public CompletableFuture<LightProbe> build() {
            if (this.inputStreamCreator != null) {
                LightProbe lightProbe = new LightProbe(this);
                CompletableFuture thenApplyAsync = lightProbe.loadInBackground(this.inputStreamCreator).thenApplyAsync(new C2137i(lightProbe), ThreadPools.getMainExecutor());
                if (thenApplyAsync != null) {
                    String access$600 = LightProbe.TAG;
                    String str = this.name;
                    StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 34);
                    sb.append("Unable to load LightProbe: name='");
                    sb.append(str);
                    sb.append("'");
                    return C2129e.m5321c(access$600, thenApplyAsync, sb.toString());
                }
                throw new IllegalStateException("CompletableFuture result is null.");
            }
            throw new IllegalStateException("Light Probe source is NULL, this should never happen.");
        }

        public Builder setAssetName(String str) {
            this.name = str;
            return this;
        }

        public Builder setIntensity(float f) {
            this.intensity = f;
            return this;
        }

        public Builder setRotation(@Nullable Quaternion quaternion) {
            this.rotation = quaternion;
            return this;
        }

        public Builder setSource(Context context, int i) {
            setSource(LoadHelper.fromResource(context, i));
            return this;
        }

        public Builder setSource(Context context, Uri uri) {
            Preconditions.checkNotNull(uri, "Parameter \"sourceUri\" was null.");
            setSource(LoadHelper.fromUri(context, uri));
            return this;
        }

        public Builder setSource(Callable<InputStream> callable) {
            Preconditions.checkNotNull(callable, "Parameter \"sourceInputStreamCallable\" was null.");
            this.inputStreamCreator = callable;
            return this;
        }
    }

    private LightProbe(Builder builder) {
        this.cubemapBuffer = ByteBuffer.allocate(10000);
        this.reflectCubemap = null;
        this.colorCorrection = new Color(1.0f, 1.0f, 1.0f);
        this.ambientColor = new Color();
        this.name = null;
        this.changeId = new ChangeId();
        this.lightEstimate = 1.0f;
        this.intensity = builder.intensity;
        this.rotation = builder.rotation;
        this.name = builder.name;
    }

    /* access modifiers changed from: private */
    public void buildFilamentResource(LightingDef lightingDef) {
        lambda$finalize$0();
        this.changeId.update();
        if (lightingDef != null) {
            Texture loadReflectCubemapFromLightingDef = loadReflectCubemapFromLightingDef(lightingDef);
            if (loadReflectCubemapFromLightingDef != null) {
                setCubeMapFromTexture(loadReflectCubemapFromLightingDef);
                int shCoefficientsLength = lightingDef.shCoefficientsLength();
                if (shCoefficientsLength >= 9) {
                    int i = shCoefficientsLength * 3;
                    float[] fArr = this.irradianceData;
                    if (fArr == null || fArr.length != i) {
                        this.irradianceData = new float[i];
                    }
                    for (int i2 = 0; i2 < shCoefficientsLength; i2++) {
                        Vec3 shCoefficients = lightingDef.shCoefficients(i2);
                        int i3 = i2 * 3;
                        this.irradianceData[i3 + 0] = shCoefficients.mo18215x() / 3.1415927f;
                        this.irradianceData[i3 + 1] = shCoefficients.mo18216y() / 3.1415927f;
                        this.irradianceData[i3 + 2] = shCoefficients.mo18217z() / 3.1415927f;
                    }
                    Color color = this.ambientColor;
                    float[] fArr2 = this.irradianceData;
                    color.set(fArr2[0], fArr2[1], fArr2[2]);
                    return;
                }
                throw new IllegalStateException("Too few SH vectors for the current Order (3).");
            }
            throw new IllegalStateException("Load reflection cubemap failed.");
        }
        throw new IllegalStateException("buildFilamentResource called but no resource is available to load.");
    }

    public static Builder builder() {
        return new Builder();
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0097, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0098, code lost:
        if (r6 != null) goto L_0x009a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:?, code lost:
        r6.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00a2, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ com.google.p017ar.schemas.sceneform.LightingDef lambda$loadInBackground$1(java.util.concurrent.Callable r6) {
        /*
            r5 = this;
            if (r6 == 0) goto L_0x00aa
            java.lang.Object r6 = r6.call()     // Catch:{ Exception -> 0x00a3 }
            java.io.InputStream r6 = (java.io.InputStream) r6     // Catch:{ Exception -> 0x00a3 }
            java.nio.ByteBuffer r0 = com.google.p017ar.sceneform.utilities.SceneformBufferUtils.readStream(r6)     // Catch:{ all -> 0x0095 }
            if (r6 == 0) goto L_0x0011
            r6.close()     // Catch:{ Exception -> 0x00a3 }
        L_0x0011:
            java.lang.String r6 = "The Sceneform bundle containing the Light Probe could not be loaded."
            if (r0 == 0) goto L_0x008f
            com.google.ar.schemas.sceneform.SceneformBundleDef r0 = com.google.p017ar.sceneform.rendering.SceneformBundle.tryLoadSceneformBundle(r0)     // Catch:{ VersionException -> 0x0088 }
            if (r0 == 0) goto L_0x0082
            int r6 = r0.lightingDefsLength()
            r1 = 1
            if (r6 < r1) goto L_0x007a
            r1 = -1
            java.lang.String r2 = r5.name
            r3 = 0
            if (r2 == 0) goto L_0x006b
        L_0x0028:
            if (r3 >= r6) goto L_0x003f
            com.google.ar.schemas.sceneform.LightingDef r2 = r0.lightingDefs(r3)
            java.lang.String r2 = r2.name()
            java.lang.String r4 = r5.name
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L_0x003c
            r1 = r3
            goto L_0x003f
        L_0x003c:
            int r3 = r3 + 1
            goto L_0x0028
        L_0x003f:
            if (r1 < 0) goto L_0x0043
            r3 = r1
            goto L_0x006b
        L_0x0043:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r5.name
            java.lang.String r1 = java.lang.String.valueOf(r0)
            int r1 = r1.length()
            int r1 = r1 + 41
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r1)
            java.lang.String r1 = "Light Probe asset \""
            r2.append(r1)
            r2.append(r0)
            java.lang.String r0 = "\" not found in bundle."
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r6.<init>(r0)
            throw r6
        L_0x006b:
            com.google.ar.schemas.sceneform.LightingDef r6 = r0.lightingDefs(r3)
            if (r6 == 0) goto L_0x0072
            return r6
        L_0x0072:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "LightingDef is invalid."
            r6.<init>(r0)
            throw r6
        L_0x007a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "Content does not contain any Light Probe data."
            r6.<init>(r0)
            throw r6
        L_0x0082:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>(r6)
            throw r0
        L_0x0088:
            r6 = move-exception
            java.util.concurrent.CompletionException r0 = new java.util.concurrent.CompletionException
            r0.<init>(r6)
            throw r0
        L_0x008f:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>(r6)
            throw r0
        L_0x0095:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0097 }
        L_0x0097:
            r1 = move-exception
            if (r6 == 0) goto L_0x00a2
            r6.close()     // Catch:{ all -> 0x009e }
            goto L_0x00a2
        L_0x009e:
            r6 = move-exception
            r0.addSuppressed(r6)     // Catch:{ Exception -> 0x00a3 }
        L_0x00a2:
            throw r1     // Catch:{ Exception -> 0x00a3 }
        L_0x00a3:
            r6 = move-exception
            java.util.concurrent.CompletionException r0 = new java.util.concurrent.CompletionException
            r0.<init>(r6)
            throw r0
        L_0x00aa:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Invalid source."
            r6.<init>(r0)
            goto L_0x00b3
        L_0x00b2:
            throw r6
        L_0x00b3:
            goto L_0x00b2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.p017ar.sceneform.rendering.LightProbe.lambda$loadInBackground$1(java.util.concurrent.Callable):com.google.ar.schemas.sceneform.LightingDef");
    }

    /* access modifiers changed from: private */
    public CompletableFuture<LightingDef> loadInBackground(Callable<InputStream> callable) {
        return CompletableFuture.supplyAsync(new C2135h(this, callable), ThreadPools.getThreadPoolExecutor());
    }

    private static Texture loadReflectCubemapFromLightingDef(LightingDef lightingDef) {
        LightingDef lightingDef2 = lightingDef;
        Preconditions.checkNotNull(lightingDef2, "Parameter \"lightingDef\" was null.");
        IEngine engine = EngineInstance.getEngine();
        int cubeLevelsLength = lightingDef.cubeLevelsLength();
        if (cubeLevelsLength >= 1) {
            LightingCubeFaceDef faces = lightingDef2.cubeLevels(0).faces(0);
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inPremultiplied = false;
            options.inScaled = false;
            options.inJustDecodeBounds = true;
            ByteBuffer dataAsByteBuffer = faces.dataAsByteBuffer();
            BitmapFactory.decodeByteArray(dataAsByteBuffer.array(), dataAsByteBuffer.arrayOffset() + dataAsByteBuffer.position(), dataAsByteBuffer.limit() - dataAsByteBuffer.position(), options);
            int i = options.outWidth;
            int i2 = options.outHeight;
            if (i < 4 || i2 < 4 || i != i2) {
                StringBuilder sb = new StringBuilder(66);
                sb.append("Lighting cubemap has invalid dimensions: ");
                sb.append(i);
                sb.append(" x ");
                sb.append(i2);
                throw new IllegalStateException(sb.toString());
            }
            Texture build = new Texture.Builder().width(i).height(i2).levels(cubeLevelsLength).format(Texture.InternalFormat.R11F_G11F_B10F).sampler(Texture.Sampler.SAMPLER_CUBEMAP).build(engine.getFilamentEngine());
            int i3 = i * i2 * 4;
            int i4 = 6;
            int[] iArr = new int[6];
            options.inJustDecodeBounds = false;
            int i5 = 0;
            while (i5 < cubeLevelsLength) {
                ByteBuffer allocateDirect = ByteBuffer.allocateDirect(i3 * 6);
                LightingCubeDef cubeLevels = lightingDef2.cubeLevels(i5);
                int i6 = 0;
                while (i6 < i4) {
                    LightingCubeFaceDef faces2 = cubeLevels.faces(FACE_TO_FILAMENT_MAPPING[i6]);
                    iArr[i6] = i3 * i6;
                    ByteBuffer dataAsByteBuffer2 = faces2.dataAsByteBuffer();
                    Bitmap decodeByteArray = BitmapFactory.decodeByteArray(dataAsByteBuffer2.array(), dataAsByteBuffer2.arrayOffset() + dataAsByteBuffer2.position(), dataAsByteBuffer2.limit() - dataAsByteBuffer2.position(), options);
                    if (decodeByteArray.getWidth() == i && decodeByteArray.getHeight() == i2) {
                        decodeByteArray.copyPixelsToBuffer(allocateDirect);
                        i6++;
                        i4 = 6;
                    } else {
                        throw new AssertionError("All cube map textures must have the same size");
                    }
                }
                allocateDirect.rewind();
                build.setImage(engine.getFilamentEngine(), i5, new Texture.PixelBufferDescriptor((Buffer) allocateDirect, Texture.Format.RGB, Texture.Type.UINT_10F_11F_11F_REV), iArr);
                i >>= 1;
                i2 >>= 1;
                i3 = i * i2 * 4;
                i5++;
                i4 = 6;
            }
            return build;
        }
        throw new IllegalStateException("Lighting cubemap has no image data.");
    }

    private static float[] quaternionToRotationMatrix(Quaternion quaternion) {
        Matrix matrix = new Matrix();
        matrix.makeRotation(quaternion);
        float[] fArr = matrix.data;
        return new float[]{fArr[0], fArr[1], fArr[2], fArr[4], fArr[5], fArr[6], fArr[8], fArr[9], fArr[10]};
    }

    private void setCubeMapFromTexture(Texture texture) {
        Texture texture2 = this.reflectCubemap;
        IEngine engine = EngineInstance.getEngine();
        if (!(texture2 == null || engine == null || !engine.isValid())) {
            engine.destroyTexture(texture2);
        }
        this.reflectCubemap = texture;
    }

    /* access modifiers changed from: package-private */
    @Nullable
    public IndirectLight buildIndirectLight() {
        Preconditions.checkNotNull(this.irradianceData, "\"irradianceData\" was null.");
        Preconditions.checkState(this.irradianceData.length >= 3, "\"irradianceData\" does not have enough components to store a vector");
        if (this.reflectCubemap != null) {
            float[] fArr = this.irradianceData;
            Color color = this.ambientColor;
            float f = color.f3288r;
            Color color2 = this.colorCorrection;
            fArr[0] = f * color2.f3288r;
            fArr[1] = color.f3287g * color2.f3287g;
            fArr[2] = color.f3286b * color2.f3286b;
            IndirectLight build = new IndirectLight.Builder().reflections(this.reflectCubemap).irradiance(3, this.irradianceData).intensity(this.intensity * this.lightEstimate).build(EngineInstance.getEngine().getFilamentEngine());
            Quaternion quaternion = this.rotation;
            if (quaternion != null) {
                build.setRotation(quaternionToRotationMatrix(quaternion));
            }
            if (build != null) {
                return build;
            }
            throw new IllegalStateException("Light Probe is invalid.");
        }
        throw new IllegalStateException("reflectCubemap is null.");
    }

    /* renamed from: dispose */
    public void lambda$finalize$0() {
        AndroidPreconditions.checkUiThread();
        setCubeMapFromTexture((Texture) null);
        this.changeId = new ChangeId();
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        try {
            ThreadPools.getMainExecutor().execute(new C2133g(this));
        } catch (Exception unused) {
        } catch (Throwable th) {
            super.finalize();
            throw th;
        }
        super.finalize();
    }

    /* access modifiers changed from: package-private */
    public int getId() {
        return this.changeId.get();
    }

    public float getIntensity() {
        return this.intensity;
    }

    @Nullable
    public Quaternion getRotation() {
        return this.rotation;
    }

    public boolean isReady() {
        return !this.changeId.isEmpty();
    }

    public void setCubeMap(Image[] imageArr) {
        if (imageArr.length == 6) {
            int width = imageArr[0].getWidth();
            int height = imageArr[0].getHeight();
            int i = width * height * 6 * 3 * 2;
            if (this.cubemapBuffer.capacity() < i) {
                this.cubemapBuffer = ByteBuffer.allocate(i);
            } else {
                this.cubemapBuffer.clear();
            }
            int[] iArr = new int[6];
            int i2 = 0;
            while (i2 < 6) {
                iArr[i2] = this.cubemapBuffer.position();
                Image.Plane[] planes = imageArr[i2].getPlanes();
                if (planes.length == 1) {
                    Image.Plane plane = planes[0];
                    if (plane.getPixelStride() == 8) {
                        int i3 = width * 8;
                        if (plane.getRowStride() == i3) {
                            ByteBuffer buffer = plane.getBuffer();
                            while (buffer.hasRemaining()) {
                                for (int i4 = 0; i4 < 8; i4++) {
                                    byte b = buffer.get();
                                    if (i4 < 6) {
                                        this.cubemapBuffer.put(b);
                                    }
                                }
                            }
                            i2++;
                        } else {
                            int rowStride = plane.getRowStride();
                            StringBuilder sb = new StringBuilder(76);
                            sb.append("Unexpected row stride in cubemap data: expected ");
                            sb.append(i3);
                            sb.append(", got ");
                            sb.append(rowStride);
                            throw new IllegalArgumentException(sb.toString());
                        }
                    } else {
                        int pixelStride = plane.getPixelStride();
                        StringBuilder sb2 = new StringBuilder(68);
                        sb2.append("Unexpected pixel stride in cubemap data: expected 8, got ");
                        sb2.append(pixelStride);
                        throw new IllegalArgumentException(sb2.toString());
                    }
                } else {
                    int length = planes.length;
                    StringBuilder sb3 = new StringBuilder(63);
                    sb3.append("Unexpected number of Planes in cubemap Image array: ");
                    sb3.append(length);
                    throw new IllegalArgumentException(sb3.toString());
                }
            }
            this.cubemapBuffer.flip();
            IEngine engine = EngineInstance.getEngine();
            Texture build = new Texture.Builder().width(width).height(height).levels((int) ((Math.log((double) width) / Math.log(2.0d)) + 1.0d)).sampler(Texture.Sampler.SAMPLER_CUBEMAP).format(Texture.InternalFormat.R11F_G11F_B10F).build(engine.getFilamentEngine());
            Texture.PixelBufferDescriptor pixelBufferDescriptor = new Texture.PixelBufferDescriptor((Buffer) this.cubemapBuffer, Texture.Format.RGB, Texture.Type.HALF);
            Texture.PrefilterOptions prefilterOptions = new Texture.PrefilterOptions();
            prefilterOptions.mirror = false;
            build.generatePrefilterMipmap(engine.getFilamentEngine(), pixelBufferDescriptor, iArr, prefilterOptions);
            setCubeMapFromTexture(build);
            return;
        }
        int length2 = imageArr.length;
        StringBuilder sb4 = new StringBuilder(44);
        sb4.append("Unexpected cubemap array length: ");
        sb4.append(length2);
        throw new IllegalArgumentException(sb4.toString());
    }

    public void setIntensity(float f) {
        this.intensity = f;
    }

    public void setLightEstimate(Color color, float f) {
        this.lightEstimate = Math.min((f * LIGHT_ESTIMATE_SCALE) + 0.0f, 1.0f);
        this.colorCorrection.set(color);
    }

    public void setRotation(@Nullable Quaternion quaternion) {
        this.rotation = quaternion;
    }
}
