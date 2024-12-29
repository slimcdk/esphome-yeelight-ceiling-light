package org.eclipse.jetty.util.security;

import com.google.p017ar.schemas.sceneform.ParameterInitDefType;
import org.apache.commons.p194io.FilenameUtils;

/* renamed from: org.eclipse.jetty.util.security.c */
public class C10002c {

    /* renamed from: a */
    private static final byte[] f18451a = {58, 50, 42, 34, 26, ParameterInitDefType.DoubleVec2Init, 10, 2, 60, 52, 44, 36, 28, ParameterInitDefType.DoubleVec4Init, 12, 4, 62, 54, 46, 38, 30, 22, ParameterInitDefType.IntVec4Init, 6, 64, 56, 48, 40, 32, 24, ParameterInitDefType.ExternalSamplerInit, 8, 57, 49, 41, 33, 25, ParameterInitDefType.DoubleInit, 9, 1, 59, 51, 43, 35, 27, ParameterInitDefType.DoubleVec3Init, 11, 3, 61, 53, 45, 37, 29, 21, ParameterInitDefType.IntVec3Init, 5, 63, 55, 47, 39, 31, 23, ParameterInitDefType.CubemapSamplerInit, 7};

    /* renamed from: b */
    private static final byte[] f18452b = {32, 1, 2, 3, 4, 5, 4, 5, 6, 7, 8, 9, 8, 9, 10, 11, 12, ParameterInitDefType.IntVec3Init, 12, ParameterInitDefType.IntVec3Init, ParameterInitDefType.IntVec4Init, ParameterInitDefType.CubemapSamplerInit, ParameterInitDefType.ExternalSamplerInit, ParameterInitDefType.DoubleInit, ParameterInitDefType.ExternalSamplerInit, ParameterInitDefType.DoubleInit, ParameterInitDefType.DoubleVec2Init, ParameterInitDefType.DoubleVec3Init, ParameterInitDefType.DoubleVec4Init, 21, ParameterInitDefType.DoubleVec4Init, 21, 22, 23, 24, 25, 24, 25, 26, 27, 28, 29, 28, 29, 30, 31, 32, 1};

    /* renamed from: c */
    private static final byte[] f18453c = {57, 49, 41, 33, 25, ParameterInitDefType.DoubleInit, 9, 1, 58, 50, 42, 34, 26, ParameterInitDefType.DoubleVec2Init, 10, 2, 59, 51, 43, 35, 27, ParameterInitDefType.DoubleVec3Init, 11, 3, 60, 52, 44, 36, 63, 55, 47, 39, 31, 23, ParameterInitDefType.CubemapSamplerInit, 7, 62, 54, 46, 38, 30, 22, ParameterInitDefType.IntVec4Init, 6, 61, 53, 45, 37, 29, 21, ParameterInitDefType.IntVec3Init, 5, 28, ParameterInitDefType.DoubleVec4Init, 12, 4};

    /* renamed from: d */
    private static final byte[] f18454d = {1, 1, 2, 2, 2, 2, 2, 2, 1, 2, 2, 2, 2, 2, 2, 1};

    /* renamed from: e */
    private static final byte[] f18455e = {9, ParameterInitDefType.DoubleVec2Init, ParameterInitDefType.IntVec4Init, ParameterInitDefType.DoubleInit, 11, 24, 1, 5, 22, 25, 3, 28, ParameterInitDefType.CubemapSamplerInit, 6, 21, 10, 35, 38, 23, ParameterInitDefType.DoubleVec3Init, 12, 4, 26, 8, 43, 54, ParameterInitDefType.ExternalSamplerInit, 7, 27, ParameterInitDefType.DoubleVec4Init, ParameterInitDefType.IntVec3Init, 2, 0, 0, 41, 52, 31, 37, 47, 55, 0, 0, 30, 40, 51, 45, 33, 48, 0, 0, 44, 49, 39, 56, 34, 53, 0, 0, 46, 42, 50, 36, 29, 32};

    /* renamed from: f */
    private static final byte[][] f18456f = {new byte[]{ParameterInitDefType.IntVec4Init, 4, ParameterInitDefType.IntVec3Init, 1, 2, ParameterInitDefType.CubemapSamplerInit, 11, 8, 3, 10, 6, 12, 5, 9, 0, 7, 0, ParameterInitDefType.CubemapSamplerInit, 7, 4, ParameterInitDefType.IntVec4Init, 2, ParameterInitDefType.IntVec3Init, 1, 10, 6, 12, 11, 9, 5, 3, 8, 4, 1, ParameterInitDefType.IntVec4Init, 8, ParameterInitDefType.IntVec3Init, 6, 2, 11, ParameterInitDefType.CubemapSamplerInit, 12, 9, 7, 3, 10, 5, 0, ParameterInitDefType.CubemapSamplerInit, 12, 8, 2, 4, 9, 1, 7, 5, 11, 3, ParameterInitDefType.IntVec4Init, 10, 0, 6, ParameterInitDefType.IntVec3Init}, new byte[]{ParameterInitDefType.CubemapSamplerInit, 1, 8, ParameterInitDefType.IntVec4Init, 6, 11, 3, 4, 9, 7, 2, ParameterInitDefType.IntVec3Init, 12, 0, 5, 10, 3, ParameterInitDefType.IntVec3Init, 4, 7, ParameterInitDefType.CubemapSamplerInit, 2, 8, ParameterInitDefType.IntVec4Init, 12, 0, 1, 10, 6, 9, 11, 5, 0, ParameterInitDefType.IntVec4Init, 7, 11, 10, 4, ParameterInitDefType.IntVec3Init, 1, 5, 8, 12, 6, 9, 3, 2, ParameterInitDefType.CubemapSamplerInit, ParameterInitDefType.IntVec3Init, 8, 10, 1, 3, ParameterInitDefType.CubemapSamplerInit, 4, 2, 11, 6, 7, 12, 0, 5, ParameterInitDefType.IntVec4Init, 9}, new byte[]{10, 0, 9, ParameterInitDefType.IntVec4Init, 6, 3, ParameterInitDefType.CubemapSamplerInit, 5, 1, ParameterInitDefType.IntVec3Init, 12, 7, 11, 4, 2, 8, ParameterInitDefType.IntVec3Init, 7, 0, 9, 3, 4, 6, 10, 2, 8, 5, ParameterInitDefType.IntVec4Init, 12, 11, ParameterInitDefType.CubemapSamplerInit, 1, ParameterInitDefType.IntVec3Init, 6, 4, 9, 8, ParameterInitDefType.CubemapSamplerInit, 3, 0, 11, 1, 2, 12, 5, 10, ParameterInitDefType.IntVec4Init, 7, 1, 10, ParameterInitDefType.IntVec3Init, 0, 6, 9, 8, 7, 4, ParameterInitDefType.CubemapSamplerInit, ParameterInitDefType.IntVec4Init, 3, 11, 5, 2, 12}, new byte[]{7, ParameterInitDefType.IntVec3Init, ParameterInitDefType.IntVec4Init, 3, 0, 6, 9, 10, 1, 2, 8, 5, 11, 12, 4, ParameterInitDefType.CubemapSamplerInit, ParameterInitDefType.IntVec3Init, 8, 11, 5, 6, ParameterInitDefType.CubemapSamplerInit, 0, 3, 4, 7, 2, 12, 1, 10, ParameterInitDefType.IntVec4Init, 9, 10, 6, 9, 0, 12, 11, 7, ParameterInitDefType.IntVec3Init, ParameterInitDefType.CubemapSamplerInit, 1, 3, ParameterInitDefType.IntVec4Init, 5, 2, 8, 4, 3, ParameterInitDefType.CubemapSamplerInit, 0, 6, 10, 1, ParameterInitDefType.IntVec3Init, 8, 9, 4, 5, 11, 12, 7, 2, ParameterInitDefType.IntVec4Init}, new byte[]{2, 12, 4, 1, 7, 10, 11, 6, 8, 5, 3, ParameterInitDefType.CubemapSamplerInit, ParameterInitDefType.IntVec3Init, 0, ParameterInitDefType.IntVec4Init, 9, ParameterInitDefType.IntVec4Init, 11, 2, 12, 4, 7, ParameterInitDefType.IntVec3Init, 1, 5, 0, ParameterInitDefType.CubemapSamplerInit, 10, 3, 9, 8, 6, 4, 2, 1, 11, 10, ParameterInitDefType.IntVec3Init, 7, 8, ParameterInitDefType.CubemapSamplerInit, 9, 12, 5, 6, 3, 0, ParameterInitDefType.IntVec4Init, 11, 8, 12, 7, 1, ParameterInitDefType.IntVec4Init, 2, ParameterInitDefType.IntVec3Init, 6, ParameterInitDefType.CubemapSamplerInit, 0, 9, 10, 4, 5, 3}, new byte[]{12, 1, 10, ParameterInitDefType.CubemapSamplerInit, 9, 2, 6, 8, 0, ParameterInitDefType.IntVec3Init, 3, 4, ParameterInitDefType.IntVec4Init, 7, 5, 11, 10, ParameterInitDefType.CubemapSamplerInit, 4, 2, 7, 12, 9, 5, 6, 1, ParameterInitDefType.IntVec3Init, ParameterInitDefType.IntVec4Init, 0, 11, 3, 8, 9, ParameterInitDefType.IntVec4Init, ParameterInitDefType.CubemapSamplerInit, 5, 2, 8, 12, 3, 7, 0, 4, 10, 1, ParameterInitDefType.IntVec3Init, 11, 6, 4, 3, 2, 12, 9, 5, ParameterInitDefType.CubemapSamplerInit, 10, 11, ParameterInitDefType.IntVec4Init, 1, 7, 6, 0, 8, ParameterInitDefType.IntVec3Init}, new byte[]{4, 11, 2, ParameterInitDefType.IntVec4Init, ParameterInitDefType.CubemapSamplerInit, 0, 8, ParameterInitDefType.IntVec3Init, 3, 12, 9, 7, 5, 10, 6, 1, ParameterInitDefType.IntVec3Init, 0, 11, 7, 4, 9, 1, 10, ParameterInitDefType.IntVec4Init, 3, 5, 12, 2, ParameterInitDefType.CubemapSamplerInit, 8, 6, 1, 4, 11, ParameterInitDefType.IntVec3Init, 12, 3, 7, ParameterInitDefType.IntVec4Init, 10, ParameterInitDefType.CubemapSamplerInit, 6, 8, 0, 5, 9, 2, 6, 11, ParameterInitDefType.IntVec3Init, 8, 1, 4, 10, 7, 9, 5, 0, ParameterInitDefType.CubemapSamplerInit, ParameterInitDefType.IntVec4Init, 2, 3, 12}, new byte[]{ParameterInitDefType.IntVec3Init, 2, 8, 4, 6, ParameterInitDefType.CubemapSamplerInit, 11, 1, 10, 9, 3, ParameterInitDefType.IntVec4Init, 5, 0, 12, 7, 1, ParameterInitDefType.CubemapSamplerInit, ParameterInitDefType.IntVec3Init, 8, 10, 3, 7, 4, 12, 5, 6, 11, 0, ParameterInitDefType.IntVec4Init, 9, 2, 7, 11, 4, 1, 9, 12, ParameterInitDefType.IntVec4Init, 2, 0, 6, 10, ParameterInitDefType.IntVec3Init, ParameterInitDefType.CubemapSamplerInit, 3, 5, 8, 2, 1, ParameterInitDefType.IntVec4Init, 7, 4, 10, 8, ParameterInitDefType.IntVec3Init, ParameterInitDefType.CubemapSamplerInit, 12, 9, 0, 3, 5, 6, 11}};

    /* renamed from: g */
    private static final byte[] f18457g = {ParameterInitDefType.ExternalSamplerInit, 7, ParameterInitDefType.DoubleVec4Init, 21, 29, 12, 28, ParameterInitDefType.DoubleInit, 1, ParameterInitDefType.CubemapSamplerInit, 23, 26, 5, ParameterInitDefType.DoubleVec2Init, 31, 10, 2, 8, 24, ParameterInitDefType.IntVec4Init, 32, 27, 3, 9, ParameterInitDefType.DoubleVec3Init, ParameterInitDefType.IntVec3Init, 30, 6, 22, 11, 4, 25};

    /* renamed from: h */
    private static final byte[] f18458h = {1, 2, 3, 4, ParameterInitDefType.DoubleInit, ParameterInitDefType.DoubleVec2Init, ParameterInitDefType.DoubleVec3Init, ParameterInitDefType.DoubleVec4Init, 5, 6, 7, 8, 21, 22, 23, 24, 9, 10, 11, 12, 25, 26, 27, 28, ParameterInitDefType.IntVec3Init, ParameterInitDefType.IntVec4Init, ParameterInitDefType.CubemapSamplerInit, ParameterInitDefType.ExternalSamplerInit, 29, 30, 31, 32, 33, 34, 35, 36, 49, 50, 51, 52, 37, 38, 39, 40, 53, 54, 55, 56, 41, 42, 43, 44, 57, 58, 59, 60, 45, 46, 47, 48, 61, 62, 63, 64};

    /* renamed from: i */
    private static final byte[] f18459i = {46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122};

    /* renamed from: j */
    private static final byte[] f18460j = new byte[128];

    /* renamed from: k */
    private static final long[][] f18461k;

    /* renamed from: l */
    private static final long[][][] f18462l;

    /* renamed from: m */
    private static final long[][] f18463m;

    /* renamed from: n */
    private static final long[][] f18464n;

    /* renamed from: o */
    private static final long[][] f18465o;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v16, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v42, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v44, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v45, resolved type: byte} */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x017f, code lost:
        if (r14 <= 0) goto L_0x0183;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0181, code lost:
        r14 = r14 - 1;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            java.lang.Class<long> r0 = long.class
            r1 = 64
            byte[] r2 = new byte[r1]
            r2 = {58, 50, 42, 34, 26, 18, 10, 2, 60, 52, 44, 36, 28, 20, 12, 4, 62, 54, 46, 38, 30, 22, 14, 6, 64, 56, 48, 40, 32, 24, 16, 8, 57, 49, 41, 33, 25, 17, 9, 1, 59, 51, 43, 35, 27, 19, 11, 3, 61, 53, 45, 37, 29, 21, 13, 5, 63, 55, 47, 39, 31, 23, 15, 7} // fill-array
            f18451a = r2
            r2 = 48
            byte[] r3 = new byte[r2]
            r3 = {32, 1, 2, 3, 4, 5, 4, 5, 6, 7, 8, 9, 8, 9, 10, 11, 12, 13, 12, 13, 14, 15, 16, 17, 16, 17, 18, 19, 20, 21, 20, 21, 22, 23, 24, 25, 24, 25, 26, 27, 28, 29, 28, 29, 30, 31, 32, 1} // fill-array
            f18452b = r3
            r3 = 56
            byte[] r3 = new byte[r3]
            r3 = {57, 49, 41, 33, 25, 17, 9, 1, 58, 50, 42, 34, 26, 18, 10, 2, 59, 51, 43, 35, 27, 19, 11, 3, 60, 52, 44, 36, 63, 55, 47, 39, 31, 23, 15, 7, 62, 54, 46, 38, 30, 22, 14, 6, 61, 53, 45, 37, 29, 21, 13, 5, 28, 20, 12, 4} // fill-array
            f18453c = r3
            r3 = 16
            byte[] r3 = new byte[r3]
            r3 = {1, 1, 2, 2, 2, 2, 2, 2, 1, 2, 2, 2, 2, 2, 2, 1} // fill-array
            f18454d = r3
            byte[] r3 = new byte[r1]
            r3 = {9, 18, 14, 17, 11, 24, 1, 5, 22, 25, 3, 28, 15, 6, 21, 10, 35, 38, 23, 19, 12, 4, 26, 8, 43, 54, 16, 7, 27, 20, 13, 2, 0, 0, 41, 52, 31, 37, 47, 55, 0, 0, 30, 40, 51, 45, 33, 48, 0, 0, 44, 49, 39, 56, 34, 53, 0, 0, 46, 42, 50, 36, 29, 32} // fill-array
            f18455e = r3
            r3 = 8
            byte[][] r4 = new byte[r3][]
            byte[] r5 = new byte[r1]
            r5 = {14, 4, 13, 1, 2, 15, 11, 8, 3, 10, 6, 12, 5, 9, 0, 7, 0, 15, 7, 4, 14, 2, 13, 1, 10, 6, 12, 11, 9, 5, 3, 8, 4, 1, 14, 8, 13, 6, 2, 11, 15, 12, 9, 7, 3, 10, 5, 0, 15, 12, 8, 2, 4, 9, 1, 7, 5, 11, 3, 14, 10, 0, 6, 13} // fill-array
            r6 = 0
            r4[r6] = r5
            byte[] r5 = new byte[r1]
            r5 = {15, 1, 8, 14, 6, 11, 3, 4, 9, 7, 2, 13, 12, 0, 5, 10, 3, 13, 4, 7, 15, 2, 8, 14, 12, 0, 1, 10, 6, 9, 11, 5, 0, 14, 7, 11, 10, 4, 13, 1, 5, 8, 12, 6, 9, 3, 2, 15, 13, 8, 10, 1, 3, 15, 4, 2, 11, 6, 7, 12, 0, 5, 14, 9} // fill-array
            r7 = 1
            r4[r7] = r5
            byte[] r5 = new byte[r1]
            r5 = {10, 0, 9, 14, 6, 3, 15, 5, 1, 13, 12, 7, 11, 4, 2, 8, 13, 7, 0, 9, 3, 4, 6, 10, 2, 8, 5, 14, 12, 11, 15, 1, 13, 6, 4, 9, 8, 15, 3, 0, 11, 1, 2, 12, 5, 10, 14, 7, 1, 10, 13, 0, 6, 9, 8, 7, 4, 15, 14, 3, 11, 5, 2, 12} // fill-array
            r8 = 2
            r4[r8] = r5
            byte[] r5 = new byte[r1]
            r5 = {7, 13, 14, 3, 0, 6, 9, 10, 1, 2, 8, 5, 11, 12, 4, 15, 13, 8, 11, 5, 6, 15, 0, 3, 4, 7, 2, 12, 1, 10, 14, 9, 10, 6, 9, 0, 12, 11, 7, 13, 15, 1, 3, 14, 5, 2, 8, 4, 3, 15, 0, 6, 10, 1, 13, 8, 9, 4, 5, 11, 12, 7, 2, 14} // fill-array
            r9 = 3
            r4[r9] = r5
            byte[] r5 = new byte[r1]
            r5 = {2, 12, 4, 1, 7, 10, 11, 6, 8, 5, 3, 15, 13, 0, 14, 9, 14, 11, 2, 12, 4, 7, 13, 1, 5, 0, 15, 10, 3, 9, 8, 6, 4, 2, 1, 11, 10, 13, 7, 8, 15, 9, 12, 5, 6, 3, 0, 14, 11, 8, 12, 7, 1, 14, 2, 13, 6, 15, 0, 9, 10, 4, 5, 3} // fill-array
            r10 = 4
            r4[r10] = r5
            byte[] r5 = new byte[r1]
            r5 = {12, 1, 10, 15, 9, 2, 6, 8, 0, 13, 3, 4, 14, 7, 5, 11, 10, 15, 4, 2, 7, 12, 9, 5, 6, 1, 13, 14, 0, 11, 3, 8, 9, 14, 15, 5, 2, 8, 12, 3, 7, 0, 4, 10, 1, 13, 11, 6, 4, 3, 2, 12, 9, 5, 15, 10, 11, 14, 1, 7, 6, 0, 8, 13} // fill-array
            r11 = 5
            r4[r11] = r5
            byte[] r5 = new byte[r1]
            r5 = {4, 11, 2, 14, 15, 0, 8, 13, 3, 12, 9, 7, 5, 10, 6, 1, 13, 0, 11, 7, 4, 9, 1, 10, 14, 3, 5, 12, 2, 15, 8, 6, 1, 4, 11, 13, 12, 3, 7, 14, 10, 15, 6, 8, 0, 5, 9, 2, 6, 11, 13, 8, 1, 4, 10, 7, 9, 5, 0, 15, 14, 2, 3, 12} // fill-array
            r12 = 6
            r4[r12] = r5
            byte[] r5 = new byte[r1]
            r5 = {13, 2, 8, 4, 6, 15, 11, 1, 10, 9, 3, 14, 5, 0, 12, 7, 1, 15, 13, 8, 10, 3, 7, 4, 12, 5, 6, 11, 0, 14, 9, 2, 7, 11, 4, 1, 9, 12, 14, 2, 0, 6, 10, 13, 15, 3, 5, 8, 2, 1, 14, 7, 4, 10, 8, 13, 15, 12, 9, 0, 3, 5, 6, 11} // fill-array
            r12 = 7
            r4[r12] = r5
            f18456f = r4
            r4 = 32
            byte[] r5 = new byte[r4]
            r5 = {16, 7, 20, 21, 29, 12, 28, 17, 1, 15, 23, 26, 5, 18, 31, 10, 2, 8, 24, 14, 32, 27, 3, 9, 19, 13, 30, 6, 22, 11, 4, 25} // fill-array
            f18457g = r5
            byte[] r5 = new byte[r1]
            r5 = {1, 2, 3, 4, 17, 18, 19, 20, 5, 6, 7, 8, 21, 22, 23, 24, 9, 10, 11, 12, 25, 26, 27, 28, 13, 14, 15, 16, 29, 30, 31, 32, 33, 34, 35, 36, 49, 50, 51, 52, 37, 38, 39, 40, 53, 54, 55, 56, 41, 42, 43, 44, 57, 58, 59, 60, 45, 46, 47, 48, 61, 62, 63, 64} // fill-array
            f18458h = r5
            byte[] r5 = new byte[r1]
            r5 = {46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122} // fill-array
            f18459i = r5
            r5 = 128(0x80, float:1.794E-43)
            byte[] r5 = new byte[r5]
            f18460j = r5
            int[] r5 = new int[r8]
            r5 = {16, 16} // fill-array
            java.lang.Object r5 = java.lang.reflect.Array.newInstance(r0, r5)
            long[][] r5 = (long[][]) r5
            f18461k = r5
            int[] r5 = new int[r9]
            r5 = {2, 16, 16} // fill-array
            java.lang.Object r5 = java.lang.reflect.Array.newInstance(r0, r5)
            long[][][] r5 = (long[][][]) r5
            f18462l = r5
            int[] r5 = new int[r8]
            r5 = {8, 16} // fill-array
            java.lang.Object r5 = java.lang.reflect.Array.newInstance(r0, r5)
            long[][] r5 = (long[][]) r5
            f18463m = r5
            int[] r5 = new int[r8]
            r5 = {8, 64} // fill-array
            java.lang.Object r5 = java.lang.reflect.Array.newInstance(r0, r5)
            long[][] r5 = (long[][]) r5
            f18464n = r5
            int[] r5 = new int[r8]
            r5 = {16, 16} // fill-array
            java.lang.Object r0 = java.lang.reflect.Array.newInstance(r0, r5)
            long[][] r0 = (long[][]) r0
            f18465o = r0
            byte[] r0 = new byte[r1]
            byte[] r5 = new byte[r1]
            r13 = 0
        L_0x00d6:
            if (r13 >= r1) goto L_0x00e5
            byte[] r14 = f18460j
            byte[] r15 = f18459i
            byte r15 = r15[r13]
            byte r10 = (byte) r13
            r14[r15] = r10
            int r13 = r13 + 1
            r10 = 4
            goto L_0x00d6
        L_0x00e5:
            r10 = 0
        L_0x00e6:
            if (r10 >= r1) goto L_0x00ed
            r0[r10] = r6
            int r10 = r10 + 1
            goto L_0x00e6
        L_0x00ed:
            r10 = 0
        L_0x00ee:
            if (r10 >= r1) goto L_0x0119
            byte[] r13 = f18455e
            byte r13 = r13[r10]
            if (r13 != 0) goto L_0x00f7
            goto L_0x0116
        L_0x00f7:
            byte[] r14 = f18454d
            byte r15 = r14[r6]
            int r15 = r15 - r7
            int r13 = r13 + r15
            int r15 = r13 % 28
            byte r14 = r14[r6]
            if (r15 >= r14) goto L_0x0105
            int r13 = r13 + -28
        L_0x0105:
            byte[] r14 = f18453c
            byte r13 = r14[r13]
            if (r13 <= 0) goto L_0x0113
            int r13 = r13 + -1
            r14 = r13 | 7
            r13 = r13 & r12
            int r14 = r14 - r13
            int r13 = r14 + 1
        L_0x0113:
            byte r13 = (byte) r13
            r0[r10] = r13
        L_0x0116:
            int r10 = r10 + 1
            goto L_0x00ee
        L_0x0119:
            long[][] r10 = f18461k
            m24748d(r10, r0, r3)
            r10 = 0
        L_0x011f:
            if (r10 >= r8) goto L_0x0161
            r13 = 0
        L_0x0122:
            if (r13 >= r1) goto L_0x012b
            r5[r13] = r6
            r0[r13] = r6
            int r13 = r13 + 1
            goto L_0x0122
        L_0x012b:
            r13 = 0
        L_0x012c:
            if (r13 >= r1) goto L_0x013f
            byte[] r14 = f18455e
            byte r14 = r14[r13]
            if (r14 != 0) goto L_0x0135
            goto L_0x013c
        L_0x0135:
            int r14 = r14 + -1
            int r15 = r13 + 1
            byte r15 = (byte) r15
            r5[r14] = r15
        L_0x013c:
            int r13 = r13 + 1
            goto L_0x012c
        L_0x013f:
            r13 = 0
        L_0x0140:
            if (r13 >= r1) goto L_0x0157
            byte[] r14 = f18455e
            byte r14 = r14[r13]
            if (r14 != 0) goto L_0x0149
            goto L_0x0154
        L_0x0149:
            int r14 = r14 + r10
            int r15 = r14 % 28
            if (r15 > r10) goto L_0x0150
            int r14 = r14 + -28
        L_0x0150:
            byte r14 = r5[r14]
            r0[r13] = r14
        L_0x0154:
            int r13 = r13 + 1
            goto L_0x0140
        L_0x0157:
            long[][][] r13 = f18462l
            r13 = r13[r10]
            m24748d(r13, r0, r3)
            int r10 = r10 + 1
            goto L_0x011f
        L_0x0161:
            r10 = 0
        L_0x0162:
            if (r10 >= r3) goto L_0x0199
            r13 = 0
        L_0x0165:
            if (r13 >= r3) goto L_0x0196
            if (r13 >= r8) goto L_0x016b
            r14 = 0
            goto L_0x017a
        L_0x016b:
            byte[] r14 = f18451a
            byte[] r15 = f18452b
            int r17 = r10 * 6
            int r17 = r17 + r13
            int r17 = r17 + -2
            byte r15 = r15[r17]
            int r15 = r15 - r7
            byte r14 = r14[r15]
        L_0x017a:
            if (r14 <= r4) goto L_0x017f
            int r14 = r14 + -32
            goto L_0x0183
        L_0x017f:
            if (r14 <= 0) goto L_0x0183
            int r14 = r14 + -1
        L_0x0183:
            if (r14 <= 0) goto L_0x018d
            int r14 = r14 + -1
            r15 = r14 | 7
            r14 = r14 & r12
            int r15 = r15 - r14
            int r14 = r15 + 1
        L_0x018d:
            int r15 = r10 * 8
            int r15 = r15 + r13
            byte r14 = (byte) r14
            r0[r15] = r14
            int r13 = r13 + 1
            goto L_0x0165
        L_0x0196:
            int r10 = r10 + 1
            goto L_0x0162
        L_0x0199:
            long[][] r10 = f18463m
            m24748d(r10, r0, r3)
            r10 = 0
        L_0x019f:
            if (r10 >= r1) goto L_0x01bb
            byte[] r13 = f18451a
            byte[] r14 = f18458h
            byte r14 = r14[r10]
            int r14 = r14 - r7
            byte r13 = r13[r14]
            if (r13 <= 0) goto L_0x01b4
            int r13 = r13 + -1
            r14 = r13 | 7
            r13 = r13 & r12
            int r14 = r14 - r13
            int r13 = r14 + 1
        L_0x01b4:
            int r13 = r13 - r7
            int r10 = r10 + 1
            byte r14 = (byte) r10
            r0[r13] = r14
            goto L_0x019f
        L_0x01bb:
            long[][] r10 = f18465o
            m24748d(r10, r0, r3)
            r10 = 0
        L_0x01c1:
            if (r10 >= r2) goto L_0x01d1
            byte[] r12 = f18457g
            byte[] r13 = f18452b
            byte r13 = r13[r10]
            int r13 = r13 - r7
            byte r12 = r12[r13]
            r0[r10] = r12
            int r10 = r10 + 1
            goto L_0x01c1
        L_0x01d1:
            r2 = 0
        L_0x01d2:
            if (r2 >= r3) goto L_0x0260
            r10 = 0
        L_0x01d5:
            if (r10 >= r1) goto L_0x0257
            int r12 = r10 >> 0
            r12 = r12 & r7
            int r12 = r12 << r11
            int r13 = r10 >> 1
            r13 = r13 & r7
            int r13 = r13 << r9
            r12 = r12 | r13
            int r13 = r10 >> 2
            r13 = r13 & r7
            int r13 = r13 << r8
            r12 = r12 | r13
            int r13 = r10 >> 3
            r13 = r13 & r7
            int r13 = r13 << r7
            r12 = r12 | r13
            int r13 = r10 >> 4
            r13 = r13 & r7
            int r13 = r13 << r6
            r12 = r12 | r13
            int r13 = r10 >> 5
            r13 = r13 & r7
            r14 = 4
            int r13 = r13 << r14
            r12 = r12 | r13
            byte[][] r13 = f18456f
            r13 = r13[r2]
            byte r12 = r13[r12]
            int r13 = r12 >> 3
            r13 = r13 & r7
            int r13 = r13 << r6
            int r14 = r12 >> 2
            r14 = r14 & r7
            int r14 = r14 << r7
            r13 = r13 | r14
            int r14 = r12 >> 1
            r14 = r14 & r7
            int r14 = r14 << r8
            r13 = r13 | r14
            int r12 = r12 >> r6
            r12 = r12 & r7
            int r12 = r12 << r9
            r12 = r12 | r13
            r13 = 0
        L_0x020e:
            if (r13 >= r4) goto L_0x0215
            r5[r13] = r6
            int r13 = r13 + 1
            goto L_0x020e
        L_0x0215:
            r13 = 0
            r14 = 4
        L_0x0217:
            if (r13 >= r14) goto L_0x0228
            int r15 = r2 * 4
            int r15 = r15 + r13
            int r16 = r12 >> r13
            r1 = r16 & 1
            byte r1 = (byte) r1
            r5[r15] = r1
            int r13 = r13 + 1
            r1 = 64
            goto L_0x0217
        L_0x0228:
            r12 = 0
            r1 = 24
        L_0x022c:
            int r1 = r1 + -1
            if (r1 < 0) goto L_0x0245
            long r12 = r12 << r7
            byte r15 = r0[r1]
            int r15 = r15 - r7
            byte r15 = r5[r15]
            long r8 = (long) r15
            long r8 = r8 << r4
            long r8 = r8 | r12
            int r12 = r1 + 24
            byte r12 = r0[r12]
            int r12 = r12 - r7
            byte r12 = r5[r12]
            long r12 = (long) r12
            long r12 = r12 | r8
            r8 = 2
            r9 = 3
            goto L_0x022c
        L_0x0245:
            long[][] r1 = f18464n
            r1 = r1[r2]
            long r8 = m24752h(r12)
            r1[r10] = r8
            int r10 = r10 + 1
            r1 = 64
            r8 = 2
            r9 = 3
            goto L_0x01d5
        L_0x0257:
            r14 = 4
            int r2 = r2 + 1
            r1 = 64
            r8 = 2
            r9 = 3
            goto L_0x01d2
        L_0x0260:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.eclipse.jetty.util.security.C10002c.<clinit>():void");
    }

    /* renamed from: a */
    public static String m24745a(String str, String str2) {
        byte[] bArr = new byte[13];
        if (str == null || str2 == null) {
            return "*";
        }
        int length = str.length();
        long j = 0;
        int i = 0;
        while (i < 8) {
            j = (j << 8) | ((long) (i < length ? str.charAt(i) * 2 : 0));
            i++;
        }
        long[] c = m24747c(j);
        int i2 = 2;
        byte b = 0;
        while (true) {
            i2--;
            if (i2 < 0) {
                break;
            }
            char charAt = i2 < str2.length() ? str2.charAt(i2) : FilenameUtils.EXTENSION_SEPARATOR;
            bArr[i2] = (byte) charAt;
            b = (b << 6) | (f18460j[charAt] & 255);
        }
        long b2 = m24746b(0, b, 25, c);
        int i3 = 12;
        bArr[12] = f18459i[(((int) b2) << 2) & 63];
        char c2 = 4;
        while (true) {
            b2 >>= c2;
            i3--;
            if (i3 < 2) {
                return new String(bArr, 0, 13);
            }
            bArr[i3] = f18459i[((int) b2) & 63];
            c2 = 6;
        }
    }

    /* renamed from: b */
    private static long m24746b(long j, int i, int i2, long[] jArr) {
        int g = m24751g(i);
        long j2 = j & 6148914691236517205L;
        long j3 = (j & -6148914694099828736L) | ((j >> 1) & 1431655765);
        char c = ' ';
        long j4 = 4294967295L;
        int i3 = (int) (((((j2 << 32) | (j2 << 1)) & -4294967296L) | ((j3 | (j3 >> 32)) & 4294967295L)) >> 32);
        long[][] jArr2 = f18463m;
        long e = m24749e(i3, jArr2);
        long e2 = m24749e((int) (e & -1), jArr2);
        int i4 = i2;
        while (true) {
            i4--;
            if (i4 >= 0) {
                int i5 = 0;
                while (i5 < 8) {
                    int i6 = i5 << 1;
                    long j5 = (long) g;
                    long j6 = ((e2 >> c) ^ e2) & j5 & j4;
                    long j7 = ((j6 | (j6 << c)) ^ e2) ^ jArr[i6];
                    long[][] jArr3 = f18464n;
                    long j8 = e2;
                    e ^= ((((((jArr3[0][(int) ((j7 >> 58) & 63)] ^ jArr3[1][(int) ((j7 >> 50) & 63)]) ^ jArr3[2][(int) ((j7 >> 42) & 63)]) ^ jArr3[3][(int) ((j7 >> 34) & 63)]) ^ jArr3[4][(int) ((j7 >> 26) & 63)]) ^ jArr3[5][(int) ((j7 >> 18) & 63)]) ^ jArr3[6][(int) ((j7 >> 10) & 63)]) ^ jArr3[7][(int) ((j7 >> 2) & 63)];
                    long j9 = ((e >> 32) ^ e) & j5 & 4294967295L;
                    long j10 = jArr[i6 + 1] ^ ((j9 | (j9 << 32)) ^ e);
                    e2 = j8 ^ (jArr3[7][(int) ((j10 >> 2) & 63)] ^ ((((((jArr3[0][(int) ((j10 >> 58) & 63)] ^ jArr3[1][(int) ((j10 >> 50) & 63)]) ^ jArr3[2][(int) ((j10 >> 42) & 63)]) ^ jArr3[3][(int) ((j10 >> 34) & 63)]) ^ jArr3[4][(int) ((j10 >> 26) & 63)]) ^ jArr3[5][(int) ((j10 >> 18) & 63)]) ^ jArr3[6][(int) ((j10 >> 10) & 63)]));
                    i5++;
                    j4 = 4294967295L;
                    c = ' ';
                }
                long j11 = e2;
                long j12 = e ^ j11;
                e2 = j11 ^ j12;
                e = j12 ^ e2;
                j4 = 4294967295L;
                c = ' ';
            } else {
                return m24750f((((((e & -1) << 1) & 4042322160L) | ((e >> 35) & 252645135)) << 32) | (4042322160L & ((e2 & -1) << 1)) | ((e2 >> 35) & 252645135), f18465o);
            }
        }
    }

    /* renamed from: c */
    private static long[] m24747c(long j) {
        long f = m24750f(j, f18461k);
        long[] jArr = new long[16];
        jArr[0] = f & -217020518463700993L;
        for (int i = 1; i < 16; i++) {
            jArr[i] = f;
            f = m24750f(f, f18462l[f18454d[i] - 1]);
            jArr[i] = f & -217020518463700993L;
        }
        return jArr;
    }

    /* renamed from: d */
    private static void m24748d(long[][] jArr, byte[] bArr, int i) {
        for (int i2 = 0; i2 < i * 8; i2++) {
            int i3 = bArr[i2] - 1;
            if (i3 >= 0) {
                int i4 = i3 >> 2;
                int i5 = 1 << (i3 & 3);
                for (int i6 = 0; i6 < 16; i6++) {
                    int i7 = (i2 & 7) + ((7 - (i2 >> 3)) << 3);
                    if ((i6 & i5) != 0) {
                        long[] jArr2 = jArr[i4];
                        jArr2[i6] = jArr2[i6] | (1 << i7);
                    }
                }
            }
        }
    }

    /* renamed from: e */
    private static long m24749e(int i, long[][] jArr) {
        long j = 0;
        int i2 = 4;
        while (true) {
            i2--;
            if (i2 < 0) {
                return j;
            }
            int i3 = i & 255;
            i >>= 8;
            int i4 = i2 << 1;
            j = j | jArr[i4][i3 & 15] | jArr[i4 + 1][i3 >> 4];
        }
    }

    /* renamed from: f */
    private static long m24750f(long j, long[][] jArr) {
        long j2 = 0;
        int i = 8;
        while (true) {
            i--;
            if (i < 0) {
                return j2;
            }
            int i2 = (int) (255 & j);
            j >>= 8;
            int i3 = i << 1;
            j2 = j2 | jArr[i3][i2 & 15] | jArr[i3 + 1][i2 >> 4];
        }
    }

    /* renamed from: g */
    private static int m24751g(int i) {
        return ((i >> 16) & 252) | ((i << 26) & -67108864) | ((i << 12) & 16515072) | ((i >> 2) & 64512);
    }

    /* renamed from: h */
    private static long m24752h(long j) {
        return ((j >> 16) & 1082331758844L) | ((j << 26) & -288230371923853312L) | ((j << 12) & 70931694147600384L) | ((j >> 2) & 277076930264064L);
    }
}
