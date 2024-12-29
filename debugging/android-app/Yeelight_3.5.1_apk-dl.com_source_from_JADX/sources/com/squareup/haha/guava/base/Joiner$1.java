package com.squareup.haha.guava.base;

import javax.annotation.Nullable;

final class Joiner$1 extends Ascii {
    private /* synthetic */ Ascii this$0$5f22bbb7;
    private /* synthetic */ String val$nullText;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    Joiner$1(Ascii ascii, Ascii ascii2, String str) {
        super(ascii2, (byte) 0);
        this.this$0$5f22bbb7 = ascii;
        this.val$nullText = str;
    }

    /* access modifiers changed from: package-private */
    public final CharSequence toString(@Nullable Object obj) {
        return obj == null ? this.val$nullText : this.this$0$5f22bbb7.toString(obj);
    }

    public final Ascii useForNull$5f7c8ce0(String str) {
        throw new UnsupportedOperationException("already specified useForNull");
    }
}
