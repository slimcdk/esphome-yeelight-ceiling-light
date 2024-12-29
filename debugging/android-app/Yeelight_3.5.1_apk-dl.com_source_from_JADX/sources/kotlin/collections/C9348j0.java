package kotlin.collections;

import androidx.appcompat.widget.ActivityChooserView;
import java.util.Collections;
import java.util.Map;
import kotlin.Pair;
import kotlin.PublishedApi;
import kotlin.SinceKotlin;
import kotlin.collections.builders.MapBuilder;
import kotlin.jvm.internal.C9424q;
import org.jetbrains.annotations.NotNull;

/* renamed from: kotlin.collections.j0 */
class C9348j0 extends C9346i0 {
    @SinceKotlin(version = "1.3")
    @PublishedApi
    @NotNull
    /* renamed from: a */
    public static <K, V> Map<K, V> m22873a(@NotNull Map<K, V> map) {
        C9424q.m22996e(map, "builder");
        return ((MapBuilder) map).build();
    }

    @SinceKotlin(version = "1.3")
    @PublishedApi
    @NotNull
    /* renamed from: b */
    public static <K, V> Map<K, V> m22874b(int i) {
        return new MapBuilder(i);
    }

    @PublishedApi
    /* renamed from: c */
    public static int m22875c(int i) {
        return i < 0 ? i : i < 3 ? i + 1 : i < 1073741824 ? (int) ((((float) i) / 0.75f) + 1.0f) : ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
    }

    @NotNull
    /* renamed from: d */
    public static final <K, V> Map<K, V> m22876d(@NotNull Pair<? extends K, ? extends V> pair) {
        C9424q.m22996e(pair, "pair");
        Map<K, V> singletonMap = Collections.singletonMap(pair.getFirst(), pair.getSecond());
        C9424q.m22995d(singletonMap, "singletonMap(pair.first, pair.second)");
        return singletonMap;
    }

    @NotNull
    /* renamed from: e */
    public static final <K, V> Map<K, V> m22877e(@NotNull Map<? extends K, ? extends V> map) {
        C9424q.m22996e(map, "<this>");
        Map.Entry next = map.entrySet().iterator().next();
        Map<K, V> singletonMap = Collections.singletonMap(next.getKey(), next.getValue());
        C9424q.m22995d(singletonMap, "with(entries.iterator().…ingletonMap(key, value) }");
        return singletonMap;
    }
}
