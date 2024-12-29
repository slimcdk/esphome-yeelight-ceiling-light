package kotlin.text;

import kotlin.PublishedApi;
import p125a5.C3975c;

/* renamed from: kotlin.text.b */
class C9499b {
    @PublishedApi
    /* renamed from: a */
    public static int m23120a(int i) {
        if (new C3975c(2, 36).mo26534m(i)) {
            return i;
        }
        throw new IllegalArgumentException("radix " + i + " was not in valid range " + new C3975c(2, 36));
    }

    /* renamed from: b */
    public static final boolean m23121b(char c) {
        return Character.isWhitespace(c) || Character.isSpaceChar(c);
    }
}
