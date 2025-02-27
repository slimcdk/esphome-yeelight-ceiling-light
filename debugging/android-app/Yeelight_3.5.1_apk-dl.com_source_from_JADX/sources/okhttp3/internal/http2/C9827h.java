package okhttp3.internal.http2;

import androidx.core.view.PointerIconCompat;
import androidx.recyclerview.widget.ItemTouchHelper;
import com.google.p017ar.schemas.sceneform.ParameterInitDefType;
import java.io.ByteArrayOutputStream;
import okio.ByteString;

/* renamed from: okhttp3.internal.http2.h */
class C9827h {

    /* renamed from: b */
    private static final int[] f17805b = {8184, 8388568, 268435426, 268435427, 268435428, 268435429, 268435430, 268435431, 268435432, 16777194, 1073741820, 268435433, 268435434, 1073741821, 268435435, 268435436, 268435437, 268435438, 268435439, 268435440, 268435441, 268435442, 1073741822, 268435443, 268435444, 268435445, 268435446, 268435447, 268435448, 268435449, 268435450, 268435451, 20, PointerIconCompat.TYPE_TOP_RIGHT_DIAGONAL_DOUBLE_ARROW, PointerIconCompat.TYPE_TOP_LEFT_DIAGONAL_DOUBLE_ARROW, 4090, 8185, 21, 248, 2042, PointerIconCompat.TYPE_ZOOM_IN, PointerIconCompat.TYPE_ZOOM_OUT, 249, 2043, ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION, 22, 23, 24, 0, 1, 2, 25, 26, 27, 28, 29, 30, 31, 92, 251, 32764, 32, 4091, PointerIconCompat.TYPE_GRAB, 8186, 33, 93, 94, 95, 96, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 252, 115, 253, 8187, 524272, 8188, 16380, 34, 32765, 3, 35, 4, 36, 5, 37, 38, 39, 6, 116, 117, 40, 41, 42, 7, 43, 118, 44, 8, 9, 45, 119, 120, 121, 122, 123, 32766, 2044, 16381, 8189, 268435452, 1048550, 4194258, 1048551, 1048552, 4194259, 4194260, 4194261, 8388569, 4194262, 8388570, 8388571, 8388572, 8388573, 8388574, 16777195, 8388575, 16777196, 16777197, 4194263, 8388576, 16777198, 8388577, 8388578, 8388579, 8388580, 2097116, 4194264, 8388581, 4194265, 8388582, 8388583, 16777199, 4194266, 2097117, 1048553, 4194267, 4194268, 8388584, 8388585, 2097118, 8388586, 4194269, 4194270, 16777200, 2097119, 4194271, 8388587, 8388588, 2097120, 2097121, 4194272, 2097122, 8388589, 4194273, 8388590, 8388591, 1048554, 4194274, 4194275, 4194276, 8388592, 4194277, 4194278, 8388593, 67108832, 67108833, 1048555, 524273, 4194279, 8388594, 4194280, 33554412, 67108834, 67108835, 67108836, 134217694, 134217695, 67108837, 16777201, 33554413, 524274, 2097123, 67108838, 134217696, 134217697, 67108839, 134217698, 16777202, 2097124, 2097125, 67108840, 67108841, 268435453, 134217699, 134217700, 134217701, 1048556, 16777203, 1048557, 2097126, 4194281, 2097127, 2097128, 8388595, 4194282, 4194283, 33554414, 33554415, 16777204, 16777205, 67108842, 8388596, 67108843, 134217702, 67108844, 67108845, 134217703, 134217704, 134217705, 134217706, 134217707, 268435454, 134217708, 134217709, 134217710, 134217711, 134217712, 67108846};

    /* renamed from: c */
    private static final byte[] f17806c = {ParameterInitDefType.IntVec3Init, 23, 28, 28, 28, 28, 28, 28, 28, 24, 30, 28, 28, 30, 28, 28, 28, 28, 28, 28, 28, 28, 30, 28, 28, 28, 28, 28, 28, 28, 28, 28, 6, 10, 10, 12, ParameterInitDefType.IntVec3Init, 6, 8, 11, 10, 10, 8, 11, 8, 6, 6, 6, 5, 5, 5, 6, 6, 6, 6, 6, 6, 6, 7, 8, ParameterInitDefType.CubemapSamplerInit, 6, 12, 10, ParameterInitDefType.IntVec3Init, 6, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 8, 7, 8, ParameterInitDefType.IntVec3Init, ParameterInitDefType.DoubleVec3Init, ParameterInitDefType.IntVec3Init, ParameterInitDefType.IntVec4Init, 6, ParameterInitDefType.CubemapSamplerInit, 5, 6, 5, 6, 5, 6, 6, 6, 5, 7, 7, 6, 6, 6, 5, 6, 7, 6, 5, 5, 6, 7, 7, 7, 7, 7, ParameterInitDefType.CubemapSamplerInit, 11, ParameterInitDefType.IntVec4Init, ParameterInitDefType.IntVec3Init, 28, ParameterInitDefType.DoubleVec4Init, 22, ParameterInitDefType.DoubleVec4Init, ParameterInitDefType.DoubleVec4Init, 22, 22, 22, 23, 22, 23, 23, 23, 23, 23, 24, 23, 24, 24, 22, 23, 24, 23, 23, 23, 23, 21, 22, 23, 22, 23, 23, 24, 22, 21, ParameterInitDefType.DoubleVec4Init, 22, 22, 23, 23, 21, 23, 22, 22, 24, 21, 22, 23, 23, 21, 21, 22, 21, 23, 22, 23, 23, ParameterInitDefType.DoubleVec4Init, 22, 22, 22, 23, 22, 22, 23, 26, 26, ParameterInitDefType.DoubleVec4Init, ParameterInitDefType.DoubleVec3Init, 22, 23, 22, 25, 26, 26, 26, 27, 27, 26, 24, 25, ParameterInitDefType.DoubleVec3Init, 21, 26, 27, 27, 26, 27, 24, 21, 21, 26, 26, 28, 27, 27, 27, ParameterInitDefType.DoubleVec4Init, 24, ParameterInitDefType.DoubleVec4Init, 21, 22, 21, 21, 23, 22, 22, 25, 25, 24, 24, 26, 23, 26, 27, 26, 26, 27, 27, 27, 27, 27, 28, 27, 27, 27, 27, 27, 26};

    /* renamed from: d */
    private static final C9827h f17807d = new C9827h();

    /* renamed from: a */
    private final C9828a f17808a = new C9828a();

    /* renamed from: okhttp3.internal.http2.h$a */
    private static final class C9828a {

        /* renamed from: a */
        final C9828a[] f17809a;

        /* renamed from: b */
        final int f17810b;

        /* renamed from: c */
        final int f17811c;

        C9828a() {
            this.f17809a = new C9828a[256];
            this.f17810b = 0;
            this.f17811c = 0;
        }

        C9828a(int i, int i2) {
            this.f17809a = null;
            this.f17810b = i;
            int i3 = i2 & 7;
            this.f17811c = i3 == 0 ? 8 : i3;
        }
    }

    private C9827h() {
        m23641b();
    }

    /* renamed from: a */
    private void m23640a(int i, int i2, byte b) {
        C9828a aVar = new C9828a(i, b);
        C9828a aVar2 = this.f17808a;
        while (b > 8) {
            b = (byte) (b - 8);
            int i3 = (i2 >>> b) & 255;
            C9828a[] aVarArr = aVar2.f17809a;
            if (aVarArr != null) {
                if (aVarArr[i3] == null) {
                    aVarArr[i3] = new C9828a();
                }
                aVar2 = aVar2.f17809a[i3];
            } else {
                throw new IllegalStateException("invalid dictionary: prefix not unique");
            }
        }
        int i4 = 8 - b;
        int i5 = (i2 << i4) & 255;
        int i6 = 1 << i4;
        for (int i7 = i5; i7 < i5 + i6; i7++) {
            aVar2.f17809a[i7] = aVar;
        }
    }

    /* renamed from: b */
    private void m23641b() {
        int i = 0;
        while (true) {
            byte[] bArr = f17806c;
            if (i < bArr.length) {
                m23640a(i, f17805b[i], bArr[i]);
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: f */
    public static C9827h m23642f() {
        return f17807d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public byte[] mo39063c(byte[] bArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        C9828a aVar = this.f17808a;
        byte b = 0;
        int i = 0;
        for (byte b2 : bArr) {
            b = (b << 8) | (b2 & 255);
            i += 8;
            while (i >= 8) {
                aVar = aVar.f17809a[(b >>> (i - 8)) & 255];
                if (aVar.f17809a == null) {
                    byteArrayOutputStream.write(aVar.f17810b);
                    i -= aVar.f17811c;
                    aVar = this.f17808a;
                } else {
                    i -= 8;
                }
            }
        }
        while (i > 0) {
            C9828a aVar2 = aVar.f17809a[(b << (8 - i)) & 255];
            if (aVar2.f17809a != null || aVar2.f17811c > i) {
                break;
            }
            byteArrayOutputStream.write(aVar2.f17810b);
            i -= aVar2.f17811c;
            aVar = this.f17808a;
        }
        return byteArrayOutputStream.toByteArray();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v8, resolved type: byte} */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo39064d(okio.ByteString r8, okio.C9837d r9) {
        /*
            r7 = this;
            r0 = 0
            r1 = 0
            r2 = r1
            r1 = 0
        L_0x0005:
            int r4 = r8.size()
            r5 = 255(0xff, float:3.57E-43)
            if (r0 >= r4) goto L_0x002e
            byte r4 = r8.getByte(r0)
            r4 = r4 & r5
            int[] r5 = f17805b
            r5 = r5[r4]
            byte[] r6 = f17806c
            byte r4 = r6[r4]
            long r2 = r2 << r4
            long r5 = (long) r5
            long r2 = r2 | r5
            int r1 = r1 + r4
        L_0x001e:
            r4 = 8
            if (r1 < r4) goto L_0x002b
            int r1 = r1 + -8
            long r4 = r2 >> r1
            int r5 = (int) r4
            r9.mo24736R(r5)
            goto L_0x001e
        L_0x002b:
            int r0 = r0 + 1
            goto L_0x0005
        L_0x002e:
            if (r1 <= 0) goto L_0x003b
            int r8 = 8 - r1
            long r2 = r2 << r8
            int r8 = r5 >>> r1
            long r0 = (long) r8
            long r0 = r0 | r2
            int r8 = (int) r0
            r9.mo24736R(r8)
        L_0x003b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http2.C9827h.mo39064d(okio.ByteString, okio.d):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public int mo39065e(ByteString byteString) {
        long j = 0;
        for (int i = 0; i < byteString.size(); i++) {
            j += (long) f17806c[byteString.getByte(i) & 255];
        }
        return (int) ((j + 7) >> 3);
    }
}
