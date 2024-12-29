package kotlin.collections;

import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import p233y4.C12060l;

final class AbstractCollection$toString$1 extends Lambda implements C12060l<E, CharSequence> {
    final /* synthetic */ AbstractCollection<E> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AbstractCollection$toString$1(AbstractCollection<? extends E> abstractCollection) {
        super(1);
        this.this$0 = abstractCollection;
    }

    @NotNull
    public final CharSequence invoke(E e) {
        return e == this.this$0 ? "(this Collection)" : String.valueOf(e);
    }
}
