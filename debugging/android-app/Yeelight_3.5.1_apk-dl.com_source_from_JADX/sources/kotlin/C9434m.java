package kotlin;

import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.C9424q;
import org.jetbrains.annotations.NotNull;

@ExperimentalUnsignedTypes
@JvmInline
@SinceKotlin(version = "1.3")
/* renamed from: kotlin.m */
public final class C9434m implements Collection<C9432l> {

    /* renamed from: kotlin.m$a */
    private static final class C9435a implements Iterator<C9432l> {
        @NotNull

        /* renamed from: a */
        private final int[] f17316a;

        /* renamed from: b */
        private int f17317b;

        public C9435a(@NotNull int[] iArr) {
            C9424q.m22996e(iArr, "array");
            this.f17316a = iArr;
        }

        /* renamed from: a */
        public int mo38352a() {
            int i = this.f17317b;
            int[] iArr = this.f17316a;
            if (i < iArr.length) {
                this.f17317b = i + 1;
                return C9432l.m23044b(iArr[i]);
            }
            throw new NoSuchElementException(String.valueOf(this.f17317b));
        }

        public boolean hasNext() {
            return this.f17317b < this.f17316a.length;
        }

        public /* bridge */ /* synthetic */ Object next() {
            return C9432l.m23043a(mo38352a());
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @NotNull
    /* renamed from: b */
    public static Iterator<C9432l> m23049b(int[] iArr) {
        return new C9435a(iArr);
    }
}
