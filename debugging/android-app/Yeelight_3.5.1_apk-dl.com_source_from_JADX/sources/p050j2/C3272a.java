package p050j2;

import androidx.appcompat.widget.ActivityChooserView;
import com.google.zxing.NotFoundException;
import com.google.zxing.oned.C2578k;

/* renamed from: j2.a */
public abstract class C3272a extends C2578k {

    /* renamed from: a */
    private final int[] f5262a = new int[4];

    /* renamed from: b */
    private final int[] f5263b;

    /* renamed from: c */
    private final float[] f5264c;

    /* renamed from: d */
    private final float[] f5265d;

    /* renamed from: e */
    private final int[] f5266e;

    /* renamed from: f */
    private final int[] f5267f;

    protected C3272a() {
        int[] iArr = new int[8];
        this.f5263b = iArr;
        this.f5264c = new float[4];
        this.f5265d = new float[4];
        this.f5266e = new int[(iArr.length / 2)];
        this.f5267f = new int[(iArr.length / 2)];
    }

    /* renamed from: g */
    protected static void m8767g(int[] iArr, float[] fArr) {
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
    protected static void m8768n(int[] iArr, float[] fArr) {
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
    protected static boolean m8769o(int[] iArr) {
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
    protected static int m8770p(int[] iArr, int[][] iArr2) {
        for (int i = 0; i < iArr2.length; i++) {
            if (C2578k.m7048d(iArr, iArr2[i], 0.45f) < 0.2f) {
                return i;
            }
        }
        throw NotFoundException.getNotFoundInstance();
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final int[] mo23837h() {
        return this.f5263b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final int[] mo23838i() {
        return this.f5262a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final int[] mo23839j() {
        return this.f5267f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final float[] mo23840k() {
        return this.f5265d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final int[] mo23841l() {
        return this.f5266e;
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final float[] mo23842m() {
        return this.f5264c;
    }
}
