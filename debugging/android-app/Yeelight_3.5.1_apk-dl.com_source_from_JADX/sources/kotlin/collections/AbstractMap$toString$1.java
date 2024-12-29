package kotlin.collections;

import java.util.Map;
import kotlin.jvm.internal.C9424q;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import p233y4.C12060l;

final class AbstractMap$toString$1 extends Lambda implements C12060l<Map.Entry<Object, Object>, CharSequence> {
    final /* synthetic */ C9331c<Object, Object> this$0;

    AbstractMap$toString$1(C9331c<Object, Object> cVar) {
        super(1);
    }

    @NotNull
    public final CharSequence invoke(@NotNull Map.Entry<Object, Object> entry) {
        C9424q.m22996e(entry, "it");
        return C9331c.m22853a(this.this$0, entry);
    }
}
