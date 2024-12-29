package kotlin.text;

import kotlin.jvm.internal.Lambda;
import p233y4.C12060l;

final class StringsKt___StringsKt$windowedSequence$2 extends Lambda implements C12060l<Integer, Object> {
    final /* synthetic */ int $size;
    final /* synthetic */ CharSequence $this_windowedSequence;
    final /* synthetic */ C12060l<CharSequence, Object> $transform;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    StringsKt___StringsKt$windowedSequence$2(int i, CharSequence charSequence, C12060l<? super CharSequence, Object> lVar) {
        super(1);
        this.$size = i;
        this.$this_windowedSequence = charSequence;
        this.$transform = lVar;
    }

    public final Object invoke(int i) {
        int i2 = this.$size + i;
        if (i2 < 0 || i2 > this.$this_windowedSequence.length()) {
            i2 = this.$this_windowedSequence.length();
        }
        return this.$transform.invoke(this.$this_windowedSequence.subSequence(i, i2));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke(((Number) obj).intValue());
    }
}
