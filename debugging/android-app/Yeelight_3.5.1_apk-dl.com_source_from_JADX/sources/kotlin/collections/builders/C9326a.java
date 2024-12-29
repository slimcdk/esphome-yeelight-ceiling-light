package kotlin.collections.builders;

import java.util.Map;
import java.util.Map.Entry;
import kotlin.collections.C9338f;
import kotlin.jvm.internal.C9424q;
import org.jetbrains.annotations.NotNull;

/* renamed from: kotlin.collections.builders.a */
public abstract class C9326a<E extends Map.Entry<? extends K, ? extends V>, K, V> extends C9338f<E> {
    /* renamed from: b */
    public final boolean mo38133b(@NotNull E e) {
        C9424q.m22996e(e, "element");
        return mo38135e(e);
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        return mo38133b((Map.Entry) obj);
    }

    /* renamed from: e */
    public abstract boolean mo38135e(@NotNull Map.Entry<? extends K, ? extends V> entry);

    /* renamed from: g */
    public abstract /* bridge */ boolean mo38136g(Map.Entry<?, ?> entry);

    public final /* bridge */ boolean remove(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        return mo38136g((Map.Entry) obj);
    }
}
