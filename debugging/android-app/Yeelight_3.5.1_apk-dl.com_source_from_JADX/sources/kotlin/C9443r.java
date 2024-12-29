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
/* renamed from: kotlin.r */
public final class C9443r implements Collection<C9441q> {

    /* renamed from: kotlin.r$a */
    private static final class C9444a implements Iterator<C9441q> {
        @NotNull

        /* renamed from: a */
        private final short[] f17323a;

        /* renamed from: b */
        private int f17324b;

        public C9444a(@NotNull short[] sArr) {
            C9424q.m22996e(sArr, "array");
            this.f17323a = sArr;
        }

        /* renamed from: a */
        public short mo38370a() {
            int i = this.f17324b;
            short[] sArr = this.f17323a;
            if (i < sArr.length) {
                this.f17324b = i + 1;
                return C9441q.m23060b(sArr[i]);
            }
            throw new NoSuchElementException(String.valueOf(this.f17324b));
        }

        public boolean hasNext() {
            return this.f17324b < this.f17323a.length;
        }

        public /* bridge */ /* synthetic */ Object next() {
            return C9441q.m23059a(mo38370a());
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @NotNull
    /* renamed from: b */
    public static Iterator<C9441q> m23065b(short[] sArr) {
        return new C9444a(sArr);
    }
}
