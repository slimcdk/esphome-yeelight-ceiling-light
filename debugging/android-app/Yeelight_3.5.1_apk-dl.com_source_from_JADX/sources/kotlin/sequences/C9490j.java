package kotlin.sequences;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.C9424q;
import org.jetbrains.annotations.NotNull;
import p233y4.C12060l;

/* renamed from: kotlin.sequences.j */
class C9490j extends C9489i {
    /* renamed from: e */
    public static <T> int m23100e(@NotNull C9482c<? extends T> cVar) {
        C9424q.m22996e(cVar, "<this>");
        Iterator<? extends T> it = cVar.iterator();
        int i = 0;
        while (it.hasNext()) {
            it.next();
            i++;
            if (i < 0) {
                C9366s.m22927h();
            }
        }
        return i;
    }

    /* renamed from: f */
    public static <T> T m23101f(@NotNull C9482c<? extends T> cVar) {
        T next;
        C9424q.m22996e(cVar, "<this>");
        Iterator<? extends T> it = cVar.iterator();
        if (it.hasNext()) {
            do {
                next = it.next();
            } while (it.hasNext());
            return next;
        }
        throw new NoSuchElementException("Sequence is empty.");
    }

    @NotNull
    /* renamed from: g */
    public static <T, R> C9482c<R> m23102g(@NotNull C9482c<? extends T> cVar, @NotNull C12060l<? super T, ? extends R> lVar) {
        C9424q.m22996e(cVar, "<this>");
        C9424q.m22996e(lVar, "transform");
        return new C9491k(cVar, lVar);
    }

    @NotNull
    /* renamed from: h */
    public static final <T, C extends Collection<? super T>> C m23103h(@NotNull C9482c<? extends T> cVar, @NotNull C c) {
        C9424q.m22996e(cVar, "<this>");
        C9424q.m22996e(c, "destination");
        for (Object add : cVar) {
            c.add(add);
        }
        return c;
    }

    @NotNull
    /* renamed from: i */
    public static final <T> List<T> m23104i(@NotNull C9482c<? extends T> cVar) {
        C9424q.m22996e(cVar, "<this>");
        return (List) m23103h(cVar, new ArrayList());
    }
}
