package kotlin.collections;

import java.util.Arrays;
import java.util.Iterator;
import java.util.RandomAccess;
import kotlin.jvm.internal.C9424q;
import org.jetbrains.annotations.NotNull;

/* renamed from: kotlin.collections.n0 */
final class C9356n0<T> extends C9311b<T> implements RandomAccess {
    /* access modifiers changed from: private */
    @NotNull

    /* renamed from: b */
    public final Object[] f17264b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final int f17265c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public int f17266d;

    /* renamed from: e */
    private int f17267e;

    /* renamed from: kotlin.collections.n0$a */
    public static final class C9357a extends C9307a<T> {

        /* renamed from: c */
        private int f17268c;

        /* renamed from: d */
        private int f17269d;

        /* renamed from: e */
        final /* synthetic */ C9356n0<T> f17270e;

        C9357a(C9356n0<T> n0Var) {
            this.f17270e = n0Var;
            this.f17268c = n0Var.size();
            this.f17269d = n0Var.f17266d;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo37994a() {
            if (this.f17268c == 0) {
                mo37995b();
                return;
            }
            mo37996c(this.f17270e.f17264b[this.f17269d]);
            this.f17269d = (this.f17269d + 1) % this.f17270e.f17265c;
            this.f17268c--;
        }
    }

    public C9356n0(int i) {
        this(new Object[i], 0);
    }

    public C9356n0(@NotNull Object[] objArr, int i) {
        C9424q.m22996e(objArr, "buffer");
        this.f17264b = objArr;
        boolean z = true;
        if (i >= 0) {
            if (i > objArr.length ? false : z) {
                this.f17265c = objArr.length;
                this.f17267e = i;
                return;
            }
            throw new IllegalArgumentException(("ring buffer filled size: " + i + " cannot be larger than the buffer size: " + objArr.length).toString());
        }
        throw new IllegalArgumentException(("ring buffer filled size should not be negative but it is " + i).toString());
    }

    /* renamed from: b */
    public int mo37904b() {
        return this.f17267e;
    }

    public T get(int i) {
        C9311b.f17241a.mo38014a(i, size());
        return this.f17264b[(this.f17266d + i) % this.f17265c];
    }

    @NotNull
    public Iterator<T> iterator() {
        return new C9357a(this);
    }

    /* renamed from: l */
    public final void mo38196l(T t) {
        if (!mo38198n()) {
            this.f17264b[(this.f17266d + size()) % this.f17265c] = t;
            this.f17267e = size() + 1;
            return;
        }
        throw new IllegalStateException("ring buffer is full");
    }

    @NotNull
    /* renamed from: m */
    public final C9356n0<T> mo38197m(int i) {
        Object[] objArr;
        int i2 = this.f17265c;
        int b = C3979f.m11482b(i2 + (i2 >> 1) + 1, i);
        if (this.f17266d == 0) {
            objArr = Arrays.copyOf(this.f17264b, b);
            C9424q.m22995d(objArr, "copyOf(this, newSize)");
        } else {
            objArr = toArray(new Object[b]);
        }
        return new C9356n0<>(objArr, size());
    }

    /* renamed from: n */
    public final boolean mo38198n() {
        return size() == this.f17265c;
    }

    /* renamed from: o */
    public final void mo38199o(int i) {
        boolean z = true;
        if (i >= 0) {
            if (i > size()) {
                z = false;
            }
            if (!z) {
                throw new IllegalArgumentException(("n shouldn't be greater than the buffer size: n = " + i + ", size = " + size()).toString());
            } else if (i > 0) {
                int i2 = this.f17266d;
                int g = (i2 + i) % this.f17265c;
                if (i2 > g) {
                    C9349k.m22882f(this.f17264b, null, i2, this.f17265c);
                    C9349k.m22882f(this.f17264b, null, 0, g);
                } else {
                    C9349k.m22882f(this.f17264b, null, i2, g);
                }
                this.f17266d = g;
                this.f17267e = size() - i;
            }
        } else {
            throw new IllegalArgumentException(("n shouldn't be negative but it is " + i).toString());
        }
    }

    @NotNull
    public Object[] toArray() {
        return toArray(new Object[size()]);
    }

    @NotNull
    public <T> T[] toArray(@NotNull T[] tArr) {
        C9424q.m22996e(tArr, "array");
        if (tArr.length < size()) {
            tArr = Arrays.copyOf(tArr, size());
            C9424q.m22995d(tArr, "copyOf(this, newSize)");
        }
        int size = size();
        int i = this.f17266d;
        int i2 = 0;
        int i3 = 0;
        while (i3 < size && i < this.f17265c) {
            tArr[i3] = this.f17264b[i];
            i3++;
            i++;
        }
        while (i3 < size) {
            tArr[i3] = this.f17264b[i2];
            i3++;
            i2++;
        }
        if (tArr.length > size()) {
            tArr[size()] = null;
        }
        C9424q.m22994c(tArr, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.RingBuffer.toArray>");
        return tArr;
    }
}
