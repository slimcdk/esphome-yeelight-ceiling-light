package com.google.android.filament;

import androidx.annotation.NonNull;
import androidx.annotation.Size;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public class Colors {

    /* renamed from: com.google.android.filament.Colors$1 */
    static /* synthetic */ class C07001 {
        static final /* synthetic */ int[] $SwitchMap$com$google$android$filament$Colors$Conversion;
        static final /* synthetic */ int[] $SwitchMap$com$google$android$filament$Colors$RgbaType;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|(2:1|2)|3|(2:5|6)|7|9|10|11|12|13|14|15|16|18) */
        /* JADX WARNING: Can't wrap try/catch for region: R(15:0|(2:1|2)|3|5|6|7|9|10|11|12|13|14|15|16|18) */
        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|5|6|7|9|10|11|12|13|14|15|16|18) */
        /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x002e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0038 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0043 */
        static {
            /*
                com.google.android.filament.Colors$Conversion[] r0 = com.google.android.filament.Colors.Conversion.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$google$android$filament$Colors$Conversion = r0
                r1 = 1
                com.google.android.filament.Colors$Conversion r2 = com.google.android.filament.Colors.Conversion.ACCURATE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = $SwitchMap$com$google$android$filament$Colors$Conversion     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.android.filament.Colors$Conversion r3 = com.google.android.filament.Colors.Conversion.FAST     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                com.google.android.filament.Colors$RgbaType[] r2 = com.google.android.filament.Colors.RgbaType.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                $SwitchMap$com$google$android$filament$Colors$RgbaType = r2
                com.google.android.filament.Colors$RgbaType r3 = com.google.android.filament.Colors.RgbaType.SRGB     // Catch:{ NoSuchFieldError -> 0x002e }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x002e }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x002e }
            L_0x002e:
                int[] r1 = $SwitchMap$com$google$android$filament$Colors$RgbaType     // Catch:{ NoSuchFieldError -> 0x0038 }
                com.google.android.filament.Colors$RgbaType r2 = com.google.android.filament.Colors.RgbaType.LINEAR     // Catch:{ NoSuchFieldError -> 0x0038 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0038 }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0038 }
            L_0x0038:
                int[] r0 = $SwitchMap$com$google$android$filament$Colors$RgbaType     // Catch:{ NoSuchFieldError -> 0x0043 }
                com.google.android.filament.Colors$RgbaType r1 = com.google.android.filament.Colors.RgbaType.PREMULTIPLIED_SRGB     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                int[] r0 = $SwitchMap$com$google$android$filament$Colors$RgbaType     // Catch:{ NoSuchFieldError -> 0x004e }
                com.google.android.filament.Colors$RgbaType r1 = com.google.android.filament.Colors.RgbaType.PREMULTIPLIED_LINEAR     // Catch:{ NoSuchFieldError -> 0x004e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004e }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004e }
            L_0x004e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.filament.Colors.C07001.<clinit>():void");
        }
    }

    public enum Conversion {
        ACCURATE,
        FAST
    }

    @Target({ElementType.PARAMETER, ElementType.METHOD, ElementType.LOCAL_VARIABLE, ElementType.FIELD})
    @Retention(RetentionPolicy.SOURCE)
    public @interface LinearColor {
    }

    public enum RgbType {
        SRGB,
        LINEAR
    }

    public enum RgbaType {
        SRGB,
        LINEAR,
        PREMULTIPLIED_SRGB,
        PREMULTIPLIED_LINEAR
    }

    private Colors() {
    }

    @Size(3)
    @NonNull
    public static float[] cct(float f) {
        float[] fArr = new float[3];
        nCct(f, fArr);
        return fArr;
    }

    @Size(3)
    @NonNull
    public static float[] illuminantD(float f) {
        float[] fArr = new float[3];
        nIlluminantD(f, fArr);
        return fArr;
    }

    private static native void nCct(float f, @Size(3) @NonNull float[] fArr);

    private static native void nIlluminantD(float f, @Size(3) @NonNull float[] fArr);

    @NonNull
    public static float[] toLinear(@NonNull Conversion conversion, @Size(min = 3) @NonNull float[] fArr) {
        int i = C07001.$SwitchMap$com$google$android$filament$Colors$Conversion[conversion.ordinal()];
        int i2 = 0;
        if (i == 1) {
            while (i2 < 3) {
                fArr[i2] = fArr[i2] <= 0.04045f ? fArr[i2] / 12.92f : (float) Math.pow((double) ((fArr[i2] + 0.055f) / 1.055f), 2.4000000953674316d);
                i2++;
            }
        } else if (i == 2) {
            while (i2 < 3) {
                fArr[i2] = (float) Math.sqrt((double) fArr[i2]);
                i2++;
            }
        }
        return fArr;
    }

    @Size(3)
    @NonNull
    public static float[] toLinear(@NonNull RgbType rgbType, float f, float f2, float f3) {
        return toLinear(rgbType, new float[]{f, f2, f3});
    }

    @Size(min = 3)
    @NonNull
    public static float[] toLinear(@NonNull RgbType rgbType, @Size(min = 3) @NonNull float[] fArr) {
        return rgbType == RgbType.LINEAR ? fArr : toLinear(Conversion.ACCURATE, fArr);
    }

    @Size(4)
    @NonNull
    public static float[] toLinear(@NonNull RgbaType rgbaType, float f, float f2, float f3, float f4) {
        return toLinear(rgbaType, new float[]{f, f2, f3, f4});
    }

    @Size(min = 4)
    @NonNull
    public static float[] toLinear(@NonNull RgbaType rgbaType, @Size(min = 4) @NonNull float[] fArr) {
        int i = C07001.$SwitchMap$com$google$android$filament$Colors$RgbaType[rgbaType.ordinal()];
        if (i == 1) {
            toLinear(Conversion.ACCURATE, fArr);
        } else if (i != 2) {
            return i != 3 ? fArr : toLinear(Conversion.ACCURATE, fArr);
        }
        float f = fArr[3];
        fArr[0] = fArr[0] * f;
        fArr[1] = fArr[1] * f;
        fArr[2] = fArr[2] * f;
        return fArr;
    }
}
