package p011c.p012a.p053e.p065w.p066r;

import androidx.appcompat.widget.ActivityChooserView;
import p011c.p012a.p053e.C0823j;
import p011c.p012a.p053e.p065w.C0887k;

/* renamed from: c.a.e.w.r.a */
public abstract class C0894a extends C0887k {

    /* renamed from: a */
    private final int[] f959a = new int[4];

    /* renamed from: b */
    private final int[] f960b;

    /* renamed from: c */
    private final float[] f961c;

    /* renamed from: d */
    private final float[] f962d;

    /* renamed from: e */
    private final int[] f963e;

    /* renamed from: f */
    private final int[] f964f;

    protected C0894a() {
        int[] iArr = new int[8];
        this.f960b = iArr;
        this.f961c = new float[4];
        this.f962d = new float[4];
        this.f963e = new int[(iArr.length / 2)];
        this.f964f = new int[(iArr.length / 2)];
    }

    /* renamed from: g */
    protected static void m1438g(int[] iArr, float[] fArr) {
        int i = 0;
        float f = fArr[0];
        for (int i2 = 1; i2 < iArr.length; i2++) {
            if (fArr[i2] < f) {
                f = fArr[i2];
                i = i2;
            }
        }
        iArr[i] = iArr[i] - 1;
    }

    /* renamed from: n */
    protected static void m1439n(int[] iArr, float[] fArr) {
        int i = 0;
        float f = fArr[0];
        for (int i2 = 1; i2 < iArr.length; i2++) {
            if (fArr[i2] > f) {
                f = fArr[i2];
                i = i2;
            }
        }
        iArr[i] = iArr[i] + 1;
    }

    /* renamed from: o */
    protected static boolean m1440o(int[] iArr) {
        int i = iArr[0] + iArr[1];
        float f = ((float) i) / ((float) ((iArr[2] + i) + iArr[3]));
        if (f >= 0.7916667f && f <= 0.89285713f) {
            int i2 = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
            int i3 = Integer.MIN_VALUE;
            for (int i4 : iArr) {
                if (i4 > i3) {
                    i3 = i4;
                }
                if (i4 < i2) {
                    i2 = i4;
                }
            }
            if (i3 < i2 * 10) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: p */
    protected static int m1441p(int[] iArr, int[][] iArr2) {
        for (int i = 0; i < iArr2.length; i++) {
            if (C0887k.m1400d(iArr, iArr2[i], 0.45f) < 0.2f) {
                return i;
            }
        }
        throw C0823j.m1126a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final int[] mo9159h() {
        return this.f960b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final int[] mo9160i() {
        return this.f959a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final int[] mo9161j() {
        return this.f964f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final float[] mo9162k() {
        return this.f962d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final int[] mo9163l() {
        return this.f963e;
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final float[] mo9164m() {
        return this.f961c;
    }
}
