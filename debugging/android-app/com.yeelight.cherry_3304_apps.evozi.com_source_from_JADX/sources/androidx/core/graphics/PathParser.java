package androidx.core.graphics;

import android.graphics.Path;
import androidx.annotation.RestrictTo;
import com.miot.service.connection.wifi.step.SmartConfigStep;
import java.util.ArrayList;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class PathParser {
    private static final String LOGTAG = "PathParser";

    private static class ExtractFloatResult {
        int mEndPosition;
        boolean mEndWithNegOrDot;

        ExtractFloatResult() {
        }
    }

    public static class PathDataNode {
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public float[] mParams;
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public char mType;

        PathDataNode(char c, float[] fArr) {
            this.mType = c;
            this.mParams = fArr;
        }

        PathDataNode(PathDataNode pathDataNode) {
            this.mType = pathDataNode.mType;
            float[] fArr = pathDataNode.mParams;
            this.mParams = PathParser.copyOfRange(fArr, 0, fArr.length);
        }

        private static void addCommand(Path path, float[] fArr, char c, char c2, float[] fArr2) {
            int i;
            int i2;
            float f;
            float f2;
            float f3;
            float f4;
            float f5;
            float f6;
            float f7;
            float f8;
            float f9;
            float f10;
            Path path2 = path;
            char c3 = c2;
            float[] fArr3 = fArr2;
            float f11 = fArr[0];
            float f12 = fArr[1];
            float f13 = fArr[2];
            float f14 = fArr[3];
            float f15 = fArr[4];
            float f16 = fArr[5];
            switch (c3) {
                case 'A':
                case 'a':
                    i = 7;
                    break;
                case 'C':
                case 'c':
                    i = 6;
                    break;
                case 'H':
                case 'V':
                case 'h':
                case 'v':
                    i = 1;
                    break;
                case 'Q':
                case 'S':
                case 'q':
                case 's':
                    i = 4;
                    break;
                case 'Z':
                case SmartConfigStep.MSG_UPDATE_CHECKOUT /*122*/:
                    path.close();
                    path2.moveTo(f15, f16);
                    f11 = f15;
                    f13 = f11;
                    f12 = f16;
                    f14 = f12;
                    break;
            }
            i = 2;
            float f17 = f11;
            float f18 = f12;
            float f19 = f15;
            float f20 = f16;
            int i3 = 0;
            char c4 = c;
            while (i3 < fArr3.length) {
                if (c3 != 'A') {
                    if (c3 == 'C') {
                        i2 = i3;
                        int i4 = i2 + 2;
                        int i5 = i2 + 3;
                        int i6 = i2 + 4;
                        int i7 = i2 + 5;
                        path.cubicTo(fArr3[i2 + 0], fArr3[i2 + 1], fArr3[i4], fArr3[i5], fArr3[i6], fArr3[i7]);
                        f17 = fArr3[i6];
                        float f21 = fArr3[i7];
                        float f22 = fArr3[i4];
                        float f23 = fArr3[i5];
                        f18 = f21;
                        f14 = f23;
                        f13 = f22;
                    } else if (c3 == 'H') {
                        i2 = i3;
                        int i8 = i2 + 0;
                        path2.lineTo(fArr3[i8], f18);
                        f17 = fArr3[i8];
                    } else if (c3 == 'Q') {
                        i2 = i3;
                        int i9 = i2 + 0;
                        int i10 = i2 + 1;
                        int i11 = i2 + 2;
                        int i12 = i2 + 3;
                        path2.quadTo(fArr3[i9], fArr3[i10], fArr3[i11], fArr3[i12]);
                        float f24 = fArr3[i9];
                        float f25 = fArr3[i10];
                        f17 = fArr3[i11];
                        f18 = fArr3[i12];
                        f13 = f24;
                        f14 = f25;
                    } else if (c3 == 'V') {
                        i2 = i3;
                        int i13 = i2 + 0;
                        path2.lineTo(f17, fArr3[i13]);
                        f18 = fArr3[i13];
                    } else if (c3 != 'a') {
                        if (c3 == 'c') {
                            int i14 = i3 + 2;
                            int i15 = i3 + 3;
                            int i16 = i3 + 4;
                            int i17 = i3 + 5;
                            path.rCubicTo(fArr3[i3 + 0], fArr3[i3 + 1], fArr3[i14], fArr3[i15], fArr3[i16], fArr3[i17]);
                            f4 = fArr3[i14] + f17;
                            f3 = fArr3[i15] + f18;
                            f17 += fArr3[i16];
                            f5 = fArr3[i17];
                            f18 += f5;
                            f13 = f4;
                            f14 = f3;
                        } else if (c3 != 'h') {
                            if (c3 != 'q') {
                                if (c3 == 'v') {
                                    int i18 = i3 + 0;
                                    path2.rLineTo(0.0f, fArr3[i18]);
                                    f6 = fArr3[i18];
                                } else if (c3 != 'L') {
                                    if (c3 == 'M') {
                                        int i19 = i3 + 0;
                                        f17 = fArr3[i19];
                                        int i20 = i3 + 1;
                                        f18 = fArr3[i20];
                                        if (i3 > 0) {
                                            path2.lineTo(fArr3[i19], fArr3[i20]);
                                        } else {
                                            path2.moveTo(fArr3[i19], fArr3[i20]);
                                        }
                                    } else if (c3 == 'S') {
                                        if (c4 == 'c' || c4 == 's' || c4 == 'C' || c4 == 'S') {
                                            f17 = (f17 * 2.0f) - f13;
                                            f18 = (f18 * 2.0f) - f14;
                                        }
                                        float f26 = f18;
                                        int i21 = i3 + 0;
                                        int i22 = i3 + 1;
                                        int i23 = i3 + 2;
                                        int i24 = i3 + 3;
                                        path.cubicTo(f17, f26, fArr3[i21], fArr3[i22], fArr3[i23], fArr3[i24]);
                                        f4 = fArr3[i21];
                                        f3 = fArr3[i22];
                                        f17 = fArr3[i23];
                                        f18 = fArr3[i24];
                                        f13 = f4;
                                        f14 = f3;
                                    } else if (c3 == 'T') {
                                        if (c4 == 'q' || c4 == 't' || c4 == 'Q' || c4 == 'T') {
                                            f17 = (f17 * 2.0f) - f13;
                                            f18 = (f18 * 2.0f) - f14;
                                        }
                                        int i25 = i3 + 0;
                                        int i26 = i3 + 1;
                                        path2.quadTo(f17, f18, fArr3[i25], fArr3[i26]);
                                        float f27 = fArr3[i25];
                                        float f28 = fArr3[i26];
                                        i2 = i3;
                                        f14 = f18;
                                        f13 = f17;
                                        f17 = f27;
                                        f18 = f28;
                                    } else if (c3 == 'l') {
                                        int i27 = i3 + 0;
                                        int i28 = i3 + 1;
                                        path2.rLineTo(fArr3[i27], fArr3[i28]);
                                        f17 += fArr3[i27];
                                        f6 = fArr3[i28];
                                    } else if (c3 == 'm') {
                                        int i29 = i3 + 0;
                                        f17 += fArr3[i29];
                                        int i30 = i3 + 1;
                                        f18 += fArr3[i30];
                                        if (i3 > 0) {
                                            path2.rLineTo(fArr3[i29], fArr3[i30]);
                                        } else {
                                            path2.rMoveTo(fArr3[i29], fArr3[i30]);
                                        }
                                    } else if (c3 == 's') {
                                        if (c4 == 'c' || c4 == 's' || c4 == 'C' || c4 == 'S') {
                                            float f29 = f17 - f13;
                                            f7 = f18 - f14;
                                            f8 = f29;
                                        } else {
                                            f8 = 0.0f;
                                            f7 = 0.0f;
                                        }
                                        int i31 = i3 + 0;
                                        int i32 = i3 + 1;
                                        int i33 = i3 + 2;
                                        int i34 = i3 + 3;
                                        path.rCubicTo(f8, f7, fArr3[i31], fArr3[i32], fArr3[i33], fArr3[i34]);
                                        f4 = fArr3[i31] + f17;
                                        f3 = fArr3[i32] + f18;
                                        f17 += fArr3[i33];
                                        f5 = fArr3[i34];
                                    } else if (c3 == 't') {
                                        if (c4 == 'q' || c4 == 't' || c4 == 'Q' || c4 == 'T') {
                                            f9 = f17 - f13;
                                            f10 = f18 - f14;
                                        } else {
                                            f10 = 0.0f;
                                            f9 = 0;
                                        }
                                        int i35 = i3 + 0;
                                        int i36 = i3 + 1;
                                        path2.rQuadTo(f9, f10, fArr3[i35], fArr3[i36]);
                                        float f30 = f9 + f17;
                                        float f31 = f10 + f18;
                                        f17 += fArr3[i35];
                                        f18 += fArr3[i36];
                                        f14 = f31;
                                        f13 = f30;
                                    }
                                    i2 = i3;
                                    f20 = f18;
                                    f19 = f17;
                                } else {
                                    int i37 = i3 + 0;
                                    int i38 = i3 + 1;
                                    path2.lineTo(fArr3[i37], fArr3[i38]);
                                    f17 = fArr3[i37];
                                    f18 = fArr3[i38];
                                }
                                f18 += f6;
                            } else {
                                int i39 = i3 + 0;
                                int i40 = i3 + 1;
                                int i41 = i3 + 2;
                                int i42 = i3 + 3;
                                path2.rQuadTo(fArr3[i39], fArr3[i40], fArr3[i41], fArr3[i42]);
                                f4 = fArr3[i39] + f17;
                                f3 = fArr3[i40] + f18;
                                f17 += fArr3[i41];
                                f5 = fArr3[i42];
                            }
                            f18 += f5;
                            f13 = f4;
                            f14 = f3;
                        } else {
                            int i43 = i3 + 0;
                            path2.rLineTo(fArr3[i43], 0.0f);
                            f17 += fArr3[i43];
                        }
                        i2 = i3;
                    } else {
                        int i44 = i3 + 5;
                        int i45 = i3 + 6;
                        i2 = i3;
                        drawArc(path, f17, f18, fArr3[i44] + f17, fArr3[i45] + f18, fArr3[i3 + 0], fArr3[i3 + 1], fArr3[i3 + 2], fArr3[i3 + 3] != 0.0f, fArr3[i3 + 4] != 0.0f);
                        f = f17 + fArr3[i44];
                        f2 = f18 + fArr3[i45];
                    }
                    i3 = i2 + i;
                    c4 = c2;
                    c3 = c4;
                } else {
                    i2 = i3;
                    int i46 = i2 + 5;
                    int i47 = i2 + 6;
                    drawArc(path, f17, f18, fArr3[i46], fArr3[i47], fArr3[i2 + 0], fArr3[i2 + 1], fArr3[i2 + 2], fArr3[i2 + 3] != 0.0f, fArr3[i2 + 4] != 0.0f);
                    f = fArr3[i46];
                    f2 = fArr3[i47];
                }
                f14 = f18;
                f13 = f17;
                i3 = i2 + i;
                c4 = c2;
                c3 = c4;
            }
            fArr[0] = f17;
            fArr[1] = f18;
            fArr[2] = f13;
            fArr[3] = f14;
            fArr[4] = f19;
            fArr[5] = f20;
        }

        private static void arcToBezier(Path path, double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9) {
            double d10 = d3;
            int ceil = (int) Math.ceil(Math.abs((d9 * 4.0d) / 3.141592653589793d));
            double cos = Math.cos(d7);
            double sin = Math.sin(d7);
            double cos2 = Math.cos(d8);
            double sin2 = Math.sin(d8);
            double d11 = -d10;
            double d12 = d11 * cos;
            double d13 = d4 * sin;
            double d14 = (d12 * sin2) - (d13 * cos2);
            double d15 = d11 * sin;
            double d16 = d4 * cos;
            double d17 = (sin2 * d15) + (cos2 * d16);
            double d18 = (double) ceil;
            Double.isNaN(d18);
            double d19 = d9 / d18;
            double d20 = d8;
            double d21 = d17;
            double d22 = d14;
            int i = 0;
            double d23 = d5;
            double d24 = d6;
            while (i < ceil) {
                double d25 = d20 + d19;
                double sin3 = Math.sin(d25);
                double cos3 = Math.cos(d25);
                double d26 = (d + ((d10 * cos) * cos3)) - (d13 * sin3);
                double d27 = d2 + (d10 * sin * cos3) + (d16 * sin3);
                double d28 = (d12 * sin3) - (d13 * cos3);
                double d29 = (sin3 * d15) + (cos3 * d16);
                double d30 = d25 - d20;
                double tan = Math.tan(d30 / 2.0d);
                double sin4 = (Math.sin(d30) * (Math.sqrt(((tan * 3.0d) * tan) + 4.0d) - 1.0d)) / 3.0d;
                double d31 = d23 + (d22 * sin4);
                double d32 = cos;
                double d33 = sin;
                path.rLineTo(0.0f, 0.0f);
                float f = (float) (d26 - (sin4 * d28));
                float f2 = (float) (d27 - (sin4 * d29));
                path.cubicTo((float) d31, (float) (d24 + (d21 * sin4)), f, f2, (float) d26, (float) d27);
                i++;
                d19 = d19;
                sin = d33;
                d23 = d26;
                d15 = d15;
                cos = d32;
                d20 = d25;
                d21 = d29;
                d22 = d28;
                ceil = ceil;
                d24 = d27;
                d10 = d3;
            }
        }

        private static void drawArc(Path path, float f, float f2, float f3, float f4, float f5, float f6, float f7, boolean z, boolean z2) {
            double d;
            double d2;
            float f8 = f;
            float f9 = f3;
            float f10 = f5;
            boolean z3 = z2;
            double radians = Math.toRadians((double) f7);
            double cos = Math.cos(radians);
            double sin = Math.sin(radians);
            double d3 = (double) f8;
            Double.isNaN(d3);
            double d4 = d3 * cos;
            double d5 = d3;
            double d6 = (double) f2;
            Double.isNaN(d6);
            double d7 = (double) f10;
            Double.isNaN(d7);
            double d8 = (d4 + (d6 * sin)) / d7;
            double d9 = (double) (-f8);
            Double.isNaN(d9);
            Double.isNaN(d6);
            double d10 = (d9 * sin) + (d6 * cos);
            double d11 = d6;
            double d12 = (double) f6;
            Double.isNaN(d12);
            double d13 = (double) f9;
            Double.isNaN(d13);
            double d14 = d10 / d12;
            double d15 = (double) f4;
            Double.isNaN(d15);
            Double.isNaN(d7);
            double d16 = ((d13 * cos) + (d15 * sin)) / d7;
            double d17 = d7;
            double d18 = (double) (-f9);
            Double.isNaN(d18);
            Double.isNaN(d15);
            Double.isNaN(d12);
            double d19 = ((d18 * sin) + (d15 * cos)) / d12;
            double d20 = d8 - d16;
            double d21 = d14 - d19;
            double d22 = (d8 + d16) / 2.0d;
            double d23 = (d14 + d19) / 2.0d;
            double d24 = sin;
            double d25 = (d20 * d20) + (d21 * d21);
            if (d25 != 0.0d) {
                double d26 = (1.0d / d25) - 0.25d;
                if (d26 < 0.0d) {
                    "Points are too far apart " + d25;
                    float sqrt = (float) (Math.sqrt(d25) / 1.99999d);
                    drawArc(path, f, f2, f3, f4, f10 * sqrt, f6 * sqrt, f7, z, z2);
                    return;
                }
                double sqrt2 = Math.sqrt(d26);
                double d27 = d20 * sqrt2;
                double d28 = sqrt2 * d21;
                boolean z4 = z2;
                if (z == z4) {
                    d2 = d22 - d28;
                    d = d23 + d27;
                } else {
                    d2 = d22 + d28;
                    d = d23 - d27;
                }
                double atan2 = Math.atan2(d14 - d, d8 - d2);
                double atan22 = Math.atan2(d19 - d, d16 - d2) - atan2;
                if (z4 != (atan22 >= 0.0d)) {
                    atan22 = atan22 > 0.0d ? atan22 - 6.283185307179586d : atan22 + 6.283185307179586d;
                }
                Double.isNaN(d17);
                double d29 = d2 * d17;
                Double.isNaN(d12);
                double d30 = d * d12;
                arcToBezier(path, (d29 * cos) - (d30 * d24), (d29 * d24) + (d30 * cos), d17, d12, d5, d11, radians, atan2, atan22);
            }
        }

        public static void nodesToPath(PathDataNode[] pathDataNodeArr, Path path) {
            float[] fArr = new float[6];
            char c = 'm';
            for (int i = 0; i < pathDataNodeArr.length; i++) {
                addCommand(path, fArr, c, pathDataNodeArr[i].mType, pathDataNodeArr[i].mParams);
                c = pathDataNodeArr[i].mType;
            }
        }

        public void interpolatePathDataNode(PathDataNode pathDataNode, PathDataNode pathDataNode2, float f) {
            int i = 0;
            while (true) {
                float[] fArr = pathDataNode.mParams;
                if (i < fArr.length) {
                    this.mParams[i] = (fArr[i] * (1.0f - f)) + (pathDataNode2.mParams[i] * f);
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    private PathParser() {
    }

    private static void addNode(ArrayList<PathDataNode> arrayList, char c, float[] fArr) {
        arrayList.add(new PathDataNode(c, fArr));
    }

    public static boolean canMorph(PathDataNode[] pathDataNodeArr, PathDataNode[] pathDataNodeArr2) {
        if (pathDataNodeArr == null || pathDataNodeArr2 == null || pathDataNodeArr.length != pathDataNodeArr2.length) {
            return false;
        }
        for (int i = 0; i < pathDataNodeArr.length; i++) {
            if (pathDataNodeArr[i].mType != pathDataNodeArr2[i].mType || pathDataNodeArr[i].mParams.length != pathDataNodeArr2[i].mParams.length) {
                return false;
            }
        }
        return true;
    }

    static float[] copyOfRange(float[] fArr, int i, int i2) {
        if (i <= i2) {
            int length = fArr.length;
            if (i < 0 || i > length) {
                throw new ArrayIndexOutOfBoundsException();
            }
            int i3 = i2 - i;
            int min = Math.min(i3, length - i);
            float[] fArr2 = new float[i3];
            System.arraycopy(fArr, i, fArr2, 0, min);
            return fArr2;
        }
        throw new IllegalArgumentException();
    }

    public static PathDataNode[] createNodesFromPathData(String str) {
        if (str == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int i = 1;
        int i2 = 0;
        while (i < str.length()) {
            int nextStart = nextStart(str, i);
            String trim = str.substring(i2, nextStart).trim();
            if (trim.length() > 0) {
                addNode(arrayList, trim.charAt(0), getFloats(trim));
            }
            i2 = nextStart;
            i = nextStart + 1;
        }
        if (i - i2 == 1 && i2 < str.length()) {
            addNode(arrayList, str.charAt(i2), new float[0]);
        }
        return (PathDataNode[]) arrayList.toArray(new PathDataNode[arrayList.size()]);
    }

    public static Path createPathFromPathData(String str) {
        Path path = new Path();
        PathDataNode[] createNodesFromPathData = createNodesFromPathData(str);
        if (createNodesFromPathData == null) {
            return null;
        }
        try {
            PathDataNode.nodesToPath(createNodesFromPathData, path);
            return path;
        } catch (RuntimeException e) {
            throw new RuntimeException("Error in parsing " + str, e);
        }
    }

    public static PathDataNode[] deepCopyNodes(PathDataNode[] pathDataNodeArr) {
        if (pathDataNodeArr == null) {
            return null;
        }
        PathDataNode[] pathDataNodeArr2 = new PathDataNode[pathDataNodeArr.length];
        for (int i = 0; i < pathDataNodeArr.length; i++) {
            pathDataNodeArr2[i] = new PathDataNode(pathDataNodeArr[i]);
        }
        return pathDataNodeArr2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0027, code lost:
        r10.mEndWithNegOrDot = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002c, code lost:
        if (r2 == false) goto L_0x0027;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002f, code lost:
        r2 = false;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0038 A[LOOP:0: B:1:0x0007->B:19:0x0038, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x003b A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void extract(java.lang.String r8, int r9, androidx.core.graphics.PathParser.ExtractFloatResult r10) {
        /*
            r0 = 0
            r10.mEndWithNegOrDot = r0
            r1 = r9
            r2 = 0
            r3 = 0
            r4 = 0
        L_0x0007:
            int r5 = r8.length()
            if (r1 >= r5) goto L_0x003b
            char r5 = r8.charAt(r1)
            r6 = 32
            r7 = 1
            if (r5 == r6) goto L_0x0033
            r6 = 69
            if (r5 == r6) goto L_0x0031
            r6 = 101(0x65, float:1.42E-43)
            if (r5 == r6) goto L_0x0031
            switch(r5) {
                case 44: goto L_0x0033;
                case 45: goto L_0x002a;
                case 46: goto L_0x0022;
                default: goto L_0x0021;
            }
        L_0x0021:
            goto L_0x002f
        L_0x0022:
            if (r3 != 0) goto L_0x0027
            r2 = 0
            r3 = 1
            goto L_0x0035
        L_0x0027:
            r10.mEndWithNegOrDot = r7
            goto L_0x0033
        L_0x002a:
            if (r1 == r9) goto L_0x002f
            if (r2 != 0) goto L_0x002f
            goto L_0x0027
        L_0x002f:
            r2 = 0
            goto L_0x0035
        L_0x0031:
            r2 = 1
            goto L_0x0035
        L_0x0033:
            r2 = 0
            r4 = 1
        L_0x0035:
            if (r4 == 0) goto L_0x0038
            goto L_0x003b
        L_0x0038:
            int r1 = r1 + 1
            goto L_0x0007
        L_0x003b:
            r10.mEndPosition = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.graphics.PathParser.extract(java.lang.String, int, androidx.core.graphics.PathParser$ExtractFloatResult):void");
    }

    private static float[] getFloats(String str) {
        if (str.charAt(0) == 'z' || str.charAt(0) == 'Z') {
            return new float[0];
        }
        try {
            float[] fArr = new float[str.length()];
            ExtractFloatResult extractFloatResult = new ExtractFloatResult();
            int length = str.length();
            int i = 1;
            int i2 = 0;
            while (i < length) {
                extract(str, i, extractFloatResult);
                int i3 = extractFloatResult.mEndPosition;
                if (i < i3) {
                    fArr[i2] = Float.parseFloat(str.substring(i, i3));
                    i2++;
                }
                i = extractFloatResult.mEndWithNegOrDot ? i3 : i3 + 1;
            }
            return copyOfRange(fArr, 0, i2);
        } catch (NumberFormatException e) {
            throw new RuntimeException("error in parsing \"" + str + "\"", e);
        }
    }

    private static int nextStart(String str, int i) {
        while (i < str.length()) {
            char charAt = str.charAt(i);
            if (((charAt - 'A') * (charAt - 'Z') <= 0 || (charAt - 'a') * (charAt - 'z') <= 0) && charAt != 'e' && charAt != 'E') {
                return i;
            }
            i++;
        }
        return i;
    }

    public static void updateNodes(PathDataNode[] pathDataNodeArr, PathDataNode[] pathDataNodeArr2) {
        for (int i = 0; i < pathDataNodeArr2.length; i++) {
            pathDataNodeArr[i].mType = pathDataNodeArr2[i].mType;
            for (int i2 = 0; i2 < pathDataNodeArr2[i].mParams.length; i2++) {
                pathDataNodeArr[i].mParams[i2] = pathDataNodeArr2[i].mParams[i2];
            }
        }
    }
}
