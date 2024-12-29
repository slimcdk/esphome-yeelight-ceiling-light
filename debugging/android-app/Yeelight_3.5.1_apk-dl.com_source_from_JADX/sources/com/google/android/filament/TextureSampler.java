package com.google.android.filament;

import androidx.annotation.NonNull;

public class TextureSampler {
    int mSampler;

    /* renamed from: com.google.android.filament.TextureSampler$1 */
    static /* synthetic */ class C07091 {
        static final /* synthetic */ int[] $SwitchMap$com$google$android$filament$TextureSampler$MagFilter;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.google.android.filament.TextureSampler$MagFilter[] r0 = com.google.android.filament.TextureSampler.MagFilter.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$google$android$filament$TextureSampler$MagFilter = r0
                com.google.android.filament.TextureSampler$MagFilter r1 = com.google.android.filament.TextureSampler.MagFilter.NEAREST     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$com$google$android$filament$TextureSampler$MagFilter     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.android.filament.TextureSampler$MagFilter r1 = com.google.android.filament.TextureSampler.MagFilter.LINEAR     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.filament.TextureSampler.C07091.<clinit>():void");
        }
    }

    public enum CompareFunction {
        LESS_EQUAL,
        GREATER_EQUAL,
        LESS,
        GREATER,
        EQUAL,
        NOT_EQUAL,
        ALWAYS,
        NEVER
    }

    public enum CompareMode {
        NONE,
        COMPARE_TO_TEXTURE
    }

    public enum MagFilter {
        NEAREST,
        LINEAR
    }

    public enum MinFilter {
        NEAREST,
        LINEAR,
        NEAREST_MIPMAP_NEAREST,
        LINEAR_MIPMAP_NEAREST,
        NEAREST_MIPMAP_LINEAR,
        LINEAR_MIPMAP_LINEAR
    }

    public enum WrapMode {
        CLAMP_TO_EDGE,
        REPEAT,
        MIRRORED_REPEAT
    }

    public TextureSampler() {
        this(MinFilter.LINEAR_MIPMAP_LINEAR, MagFilter.LINEAR, WrapMode.REPEAT);
    }

    public TextureSampler(@NonNull CompareMode compareMode) {
        this(compareMode, CompareFunction.LESS_EQUAL);
    }

    public TextureSampler(@NonNull CompareMode compareMode, @NonNull CompareFunction compareFunction) {
        this.mSampler = 0;
        this.mSampler = nCreateCompareSampler(compareMode.ordinal(), compareFunction.ordinal());
    }

    public TextureSampler(@NonNull MagFilter magFilter) {
        this(magFilter, WrapMode.CLAMP_TO_EDGE);
    }

    public TextureSampler(@NonNull MagFilter magFilter, @NonNull WrapMode wrapMode) {
        this(minFilterFromMagFilter(magFilter), magFilter, wrapMode);
    }

    public TextureSampler(@NonNull MinFilter minFilter, @NonNull MagFilter magFilter, @NonNull WrapMode wrapMode) {
        this(minFilter, magFilter, wrapMode, wrapMode, wrapMode);
    }

    public TextureSampler(@NonNull MinFilter minFilter, @NonNull MagFilter magFilter, @NonNull WrapMode wrapMode, @NonNull WrapMode wrapMode2, @NonNull WrapMode wrapMode3) {
        this.mSampler = 0;
        this.mSampler = nCreateSampler(minFilter.ordinal(), magFilter.ordinal(), wrapMode.ordinal(), wrapMode2.ordinal(), wrapMode3.ordinal());
    }

    private static MinFilter minFilterFromMagFilter(@NonNull MagFilter magFilter) {
        return C07091.$SwitchMap$com$google$android$filament$TextureSampler$MagFilter[magFilter.ordinal()] != 1 ? MinFilter.LINEAR : MinFilter.NEAREST;
    }

    private static native int nCreateCompareSampler(int i, int i2);

    private static native int nCreateSampler(int i, int i2, int i3, int i4, int i5);

    private static native float nGetAnisotropy(int i);

    private static native int nGetCompareFunction(int i);

    private static native int nGetCompareMode(int i);

    private static native int nGetMagFilter(int i);

    private static native int nGetMinFilter(int i);

    private static native int nGetWrapModeR(int i);

    private static native int nGetWrapModeS(int i);

    private static native int nGetWrapModeT(int i);

    private static native int nSetAnisotropy(int i, float f);

    private static native int nSetCompareFunction(int i, int i2);

    private static native int nSetCompareMode(int i, int i2);

    private static native int nSetMagFilter(int i, int i2);

    private static native int nSetMinFilter(int i, int i2);

    private static native int nSetWrapModeR(int i, int i2);

    private static native int nSetWrapModeS(int i, int i2);

    private static native int nSetWrapModeT(int i, int i2);

    public float getAnisotropy() {
        return nGetAnisotropy(this.mSampler);
    }

    public CompareFunction getCompareFunction() {
        return CompareFunction.values()[nGetCompareFunction(this.mSampler)];
    }

    public CompareMode getCompareMode() {
        return CompareMode.values()[nGetCompareMode(this.mSampler)];
    }

    public MagFilter getMagFilter() {
        return MagFilter.values()[nGetMagFilter(this.mSampler)];
    }

    public MinFilter getMinFilter() {
        return MinFilter.values()[nGetMinFilter(this.mSampler)];
    }

    public WrapMode getWrapModeR() {
        return WrapMode.values()[nGetWrapModeR(this.mSampler)];
    }

    public WrapMode getWrapModeS() {
        return WrapMode.values()[nGetWrapModeS(this.mSampler)];
    }

    public WrapMode getWrapModeT() {
        return WrapMode.values()[nGetWrapModeT(this.mSampler)];
    }

    public void setAnisotropy(float f) {
        this.mSampler = nSetAnisotropy(this.mSampler, f);
    }

    public void setCompareFunction(CompareFunction compareFunction) {
        this.mSampler = nSetCompareFunction(this.mSampler, compareFunction.ordinal());
    }

    public void setCompareMode(CompareMode compareMode) {
        this.mSampler = nSetCompareMode(this.mSampler, compareMode.ordinal());
    }

    public void setMagFilter(MagFilter magFilter) {
        this.mSampler = nSetMagFilter(this.mSampler, magFilter.ordinal());
    }

    public void setMinFilter(MinFilter minFilter) {
        this.mSampler = nSetMinFilter(this.mSampler, minFilter.ordinal());
    }

    public void setWrapModeR(WrapMode wrapMode) {
        this.mSampler = nSetWrapModeR(this.mSampler, wrapMode.ordinal());
    }

    public void setWrapModeS(WrapMode wrapMode) {
        this.mSampler = nSetWrapModeS(this.mSampler, wrapMode.ordinal());
    }

    public void setWrapModeT(WrapMode wrapMode) {
        this.mSampler = nSetWrapModeT(this.mSampler, wrapMode.ordinal());
    }
}
