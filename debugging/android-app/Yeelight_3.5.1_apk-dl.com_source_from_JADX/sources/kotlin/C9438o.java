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
/* renamed from: kotlin.o */
public final class C9438o implements Collection<C9436n> {

    /* renamed from: kotlin.o$a */
    private static final class C9439a implements Iterator<C9436n> {
        @NotNull

        /* renamed from: a */
        private final long[] f17319a;

        /* renamed from: b */
        private int f17320b;

        public C9439a(@NotNull long[] jArr) {
            C9424q.m22996e(jArr, "array");
            this.f17319a = jArr;
        }

        /* renamed from: a */
        public long mo38361a() {
            int i = this.f17320b;
            long[] jArr = this.f17319a;
            if (i < jArr.length) {
                this.f17320b = i + 1;
                return C9436n.m23052b(jArr[i]);
            }
            throw new NoSuchElementException(String.valueOf(this.f17320b));
        }

        public boolean hasNext() {
            return this.f17320b < this.f17319a.length;
        }

        public /* bridge */ /* synthetic */ Object next() {
            return C9436n.m23051a(mo38361a());
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @NotNull
    /* renamed from: b */
    public static Iterator<C9436n> m23057b(long[] jArr) {
        return new C9439a(jArr);
    }
}
