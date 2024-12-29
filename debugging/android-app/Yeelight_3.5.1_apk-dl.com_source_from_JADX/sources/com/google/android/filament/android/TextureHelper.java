package com.google.android.filament.android;

import android.graphics.Bitmap;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import com.google.android.filament.Engine;
import com.google.android.filament.Texture;
import java.lang.reflect.Method;

public final class TextureHelper {
    private static final int BITMAP_CONFIG_ALPHA_8 = 0;
    private static final int BITMAP_CONFIG_HARDWARE = 5;
    private static final int BITMAP_CONFIG_RGBA_4444 = 2;
    private static final int BITMAP_CONFIG_RGBA_8888 = 3;
    private static final int BITMAP_CONFIG_RGBA_F16 = 4;
    private static final int BITMAP_CONFIG_RGB_565 = 1;
    private static Method sEngineGetNativeObject;
    private static Method sTextureGetNativeObject;

    /* renamed from: com.google.android.filament.android.TextureHelper$1 */
    static /* synthetic */ class C07111 {
        static final /* synthetic */ int[] $SwitchMap$android$graphics$Bitmap$Config;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                android.graphics.Bitmap$Config[] r0 = android.graphics.Bitmap.Config.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$android$graphics$Bitmap$Config = r0
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ALPHA_8     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$android$graphics$Bitmap$Config     // Catch:{ NoSuchFieldError -> 0x001d }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.RGB_565     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = $SwitchMap$android$graphics$Bitmap$Config     // Catch:{ NoSuchFieldError -> 0x0028 }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_4444     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = $SwitchMap$android$graphics$Bitmap$Config     // Catch:{ NoSuchFieldError -> 0x0033 }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = $SwitchMap$android$graphics$Bitmap$Config     // Catch:{ NoSuchFieldError -> 0x003e }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.RGBA_F16     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = $SwitchMap$android$graphics$Bitmap$Config     // Catch:{ NoSuchFieldError -> 0x0049 }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.HARDWARE     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.filament.android.TextureHelper.C07111.<clinit>():void");
        }
    }

    static {
        try {
            sEngineGetNativeObject = Engine.class.getDeclaredMethod("getNativeObject", new Class[0]);
            sTextureGetNativeObject = Texture.class.getDeclaredMethod("getNativeObject", new Class[0]);
            sEngineGetNativeObject.setAccessible(true);
            sTextureGetNativeObject.setAccessible(true);
        } catch (NoSuchMethodException unused) {
        }
    }

    private TextureHelper() {
    }

    private static native void nSetBitmap(long j, long j2, int i, int i2, int i3, int i4, int i5, Bitmap bitmap, int i6);

    public static void setBitmap(@NonNull Engine engine, @NonNull Texture texture, @IntRange(from = 0) int i, @IntRange(from = 0) int i2, @IntRange(from = 0) int i3, @IntRange(from = 0) int i4, @IntRange(from = 0) int i5, @NonNull Bitmap bitmap) {
        int nativeFormat = toNativeFormat(bitmap.getConfig());
        if (nativeFormat == 2 || nativeFormat == 5) {
            throw new IllegalArgumentException("Unsupported config: ARGB_4444 or HARDWARE");
        }
        try {
            Texture texture2 = texture;
            Engine engine2 = engine;
            nSetBitmap(((Long) sTextureGetNativeObject.invoke(texture, new Object[0])).longValue(), ((Long) sEngineGetNativeObject.invoke(engine, new Object[0])).longValue(), i, i2, i3, i4, i5, bitmap, nativeFormat);
        } catch (Exception unused) {
        }
    }

    public static void setBitmap(@NonNull Engine engine, @NonNull Texture texture, @IntRange(from = 0) int i, @NonNull Bitmap bitmap) {
        setBitmap(engine, texture, i, 0, 0, texture.getWidth(i), texture.getHeight(i), bitmap);
    }

    private static int toNativeFormat(Bitmap.Config config) {
        int i = C07111.$SwitchMap$android$graphics$Bitmap$Config[config.ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 3) {
            return 2;
        }
        if (i != 5) {
            return i != 6 ? 3 : 5;
        }
        return 4;
    }
}
