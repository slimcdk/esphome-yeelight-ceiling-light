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
/* renamed from: kotlin.k */
public final class C9430k implements Collection<C9403j> {

    /* renamed from: kotlin.k$a */
    private static final class C9431a implements Iterator<C9403j> {
        @NotNull

        /* renamed from: a */
        private final byte[] f17313a;

        /* renamed from: b */
        private int f17314b;

        public C9431a(@NotNull byte[] bArr) {
            C9424q.m22996e(bArr, "array");
            this.f17313a = bArr;
        }

        /* renamed from: a */
        public byte mo38343a() {
            int i = this.f17314b;
            byte[] bArr = this.f17313a;
            if (i < bArr.length) {
                this.f17314b = i + 1;
                return C9403j.m22959b(bArr[i]);
            }
            throw new NoSuchElementException(String.valueOf(this.f17314b));
        }

        public boolean hasNext() {
            return this.f17314b < this.f17313a.length;
        }

        public /* bridge */ /* synthetic */ Object next() {
            return C9403j.m22958a(mo38343a());
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @NotNull
    /* renamed from: b */
    public static Iterator<C9403j> m23041b(byte[] bArr) {
        return new C9431a(bArr);
    }
}
