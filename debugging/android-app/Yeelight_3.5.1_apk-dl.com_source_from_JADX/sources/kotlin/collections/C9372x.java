package kotlin.collections;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.ExperimentalStdlibApi;
import kotlin.SinceKotlin;
import kotlin.WasExperimental;
import kotlin.jvm.internal.C9424q;
import org.jetbrains.annotations.NotNull;
import p233y4.C12060l;

/* renamed from: kotlin.collections.x */
class C9372x extends C9371w {
    /* renamed from: k */
    private static final <T> boolean m22931k(Iterable<? extends T> iterable, C12060l<? super T, Boolean> lVar, boolean z) {
        Iterator<? extends T> it = iterable.iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            if (lVar.invoke(it.next()).booleanValue() == z) {
                it.remove();
                z2 = true;
            }
        }
        return z2;
    }

    @SinceKotlin(version = "1.4")
    @WasExperimental(markerClass = {ExperimentalStdlibApi.class})
    /* renamed from: l */
    public static <T> T m22932l(@NotNull List<T> list) {
        C9424q.m22996e(list, "<this>");
        if (!list.isEmpty()) {
            return list.remove(C9366s.m22925f(list));
        }
        throw new NoSuchElementException("List is empty.");
    }

    /* renamed from: m */
    public static <T> boolean m22933m(@NotNull Iterable<? extends T> iterable, @NotNull C12060l<? super T, Boolean> lVar) {
        C9424q.m22996e(iterable, "<this>");
        C9424q.m22996e(lVar, "predicate");
        return m22931k(iterable, lVar, false);
    }
}
