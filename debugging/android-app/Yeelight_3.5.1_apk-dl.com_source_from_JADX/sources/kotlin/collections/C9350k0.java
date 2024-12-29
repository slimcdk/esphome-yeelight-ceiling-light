package kotlin.collections;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.C9424q;
import org.jetbrains.annotations.NotNull;

/* renamed from: kotlin.collections.k0 */
class C9350k0 extends C9348j0 {
    @NotNull
    /* renamed from: f */
    public static <K, V> Map<K, V> m22883f() {
        EmptyMap emptyMap = EmptyMap.INSTANCE;
        C9424q.m22994c(emptyMap, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
        return emptyMap;
    }

    @NotNull
    /* renamed from: g */
    public static final <K, V> Map<K, V> m22884g(@NotNull Map<K, ? extends V> map) {
        C9424q.m22996e(map, "<this>");
        int size = map.size();
        return size != 0 ? size != 1 ? map : C9348j0.m22877e(map) : m22883f();
    }

    /* renamed from: h */
    public static final <K, V> void m22885h(@NotNull Map<? super K, ? super V> map, @NotNull Iterable<? extends Pair<? extends K, ? extends V>> iterable) {
        C9424q.m22996e(map, "<this>");
        C9424q.m22996e(iterable, "pairs");
        for (Pair pair : iterable) {
            map.put(pair.component1(), pair.component2());
        }
    }

    @NotNull
    /* renamed from: i */
    public static <K, V> Map<K, V> m22886i(@NotNull Iterable<? extends Pair<? extends K, ? extends V>> iterable) {
        C9424q.m22996e(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return m22884g(m22887j(iterable, new LinkedHashMap()));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return m22883f();
        }
        if (size != 1) {
            return m22887j(iterable, new LinkedHashMap(C9348j0.m22875c(collection.size())));
        }
        return C9348j0.m22876d((Pair) (iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next()));
    }

    @NotNull
    /* renamed from: j */
    public static final <K, V, M extends Map<? super K, ? super V>> M m22887j(@NotNull Iterable<? extends Pair<? extends K, ? extends V>> iterable, @NotNull M m) {
        C9424q.m22996e(iterable, "<this>");
        C9424q.m22996e(m, "destination");
        m22885h(m, iterable);
        return m;
    }
}
