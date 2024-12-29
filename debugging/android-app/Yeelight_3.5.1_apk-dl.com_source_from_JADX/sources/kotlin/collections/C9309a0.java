package kotlin.collections;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.C9424q;
import kotlin.sequences.C9482c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p233y4.C12060l;

/* renamed from: kotlin.collections.a0 */
class C9309a0 extends C9374z {

    /* renamed from: kotlin.collections.a0$a */
    public static final class C9310a implements C9482c<T> {

        /* renamed from: a */
        final /* synthetic */ Iterable f17240a;

        public C9310a(Iterable iterable) {
            this.f17240a = iterable;
        }

        @NotNull
        public Iterator<T> iterator() {
            return this.f17240a.iterator();
        }
    }

    @NotNull
    /* renamed from: n */
    public static <T> C9482c<T> m22808n(@NotNull Iterable<? extends T> iterable) {
        C9424q.m22996e(iterable, "<this>");
        return new C9310a(iterable);
    }

    @NotNull
    /* renamed from: o */
    public static final <T, A extends Appendable> A m22809o(@NotNull Iterable<? extends T> iterable, @NotNull A a, @NotNull CharSequence charSequence, @NotNull CharSequence charSequence2, @NotNull CharSequence charSequence3, int i, @NotNull CharSequence charSequence4, @Nullable C12060l<? super T, ? extends CharSequence> lVar) {
        C9424q.m22996e(iterable, "<this>");
        C9424q.m22996e(a, "buffer");
        C9424q.m22996e(charSequence, "separator");
        C9424q.m22996e(charSequence2, "prefix");
        C9424q.m22996e(charSequence3, "postfix");
        C9424q.m22996e(charSequence4, "truncated");
        a.append(charSequence2);
        int i2 = 0;
        for (Object next : iterable) {
            i2++;
            if (i2 > 1) {
                a.append(charSequence);
            }
            if (i >= 0 && i2 > i) {
                break;
            }
            C9506i.m23138a(a, next, lVar);
        }
        if (i >= 0 && i2 > i) {
            a.append(charSequence4);
        }
        a.append(charSequence3);
        return a;
    }

    @NotNull
    /* renamed from: p */
    public static final <T> String m22810p(@NotNull Iterable<? extends T> iterable, @NotNull CharSequence charSequence, @NotNull CharSequence charSequence2, @NotNull CharSequence charSequence3, int i, @NotNull CharSequence charSequence4, @Nullable C12060l<? super T, ? extends CharSequence> lVar) {
        C9424q.m22996e(iterable, "<this>");
        C9424q.m22996e(charSequence, "separator");
        C9424q.m22996e(charSequence2, "prefix");
        C9424q.m22996e(charSequence3, "postfix");
        C9424q.m22996e(charSequence4, "truncated");
        String sb = ((StringBuilder) m22809o(iterable, new StringBuilder(), charSequence, charSequence2, charSequence3, i, charSequence4, lVar)).toString();
        C9424q.m22995d(sb, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb;
    }

    /* renamed from: q */
    public static /* synthetic */ String m22811q(Iterable iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, C12060l lVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = "";
        CharSequence charSequence6 = (i2 & 2) != 0 ? charSequence5 : charSequence2;
        if ((i2 & 4) == 0) {
            charSequence5 = charSequence3;
        }
        int i3 = (i2 & 8) != 0 ? -1 : i;
        if ((i2 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i2 & 32) != 0) {
            lVar = null;
        }
        return m22810p(iterable, charSequence, charSequence6, charSequence5, i3, charSequence7, lVar);
    }

    /* renamed from: r */
    public static <T> T m22812r(@NotNull Iterable<? extends T> iterable) {
        C9424q.m22996e(iterable, "<this>");
        if (iterable instanceof List) {
            return m22813s((List) iterable);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            T next = it.next();
            if (!it.hasNext()) {
                return next;
            }
            throw new IllegalArgumentException("Collection has more than one element.");
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    /* renamed from: s */
    public static final <T> T m22813s(@NotNull List<? extends T> list) {
        C9424q.m22996e(list, "<this>");
        int size = list.size();
        if (size == 0) {
            throw new NoSuchElementException("List is empty.");
        } else if (size == 1) {
            return list.get(0);
        } else {
            throw new IllegalArgumentException("List has more than one element.");
        }
    }
}
