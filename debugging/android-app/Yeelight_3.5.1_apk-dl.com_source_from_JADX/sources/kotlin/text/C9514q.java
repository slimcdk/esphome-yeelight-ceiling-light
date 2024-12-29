package kotlin.text;

import kotlin.collections.C9339f0;
import kotlin.jvm.internal.C9424q;
import org.apache.commons.p194io.FilenameUtils;
import org.jetbrains.annotations.NotNull;
import p125a5.C3975c;

/* renamed from: kotlin.text.q */
class C9514q extends C9513p {
    /* JADX WARNING: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean m23139b(@org.jetbrains.annotations.NotNull java.lang.CharSequence r4) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.C9424q.m22996e(r4, r0)
            int r0 = r4.length()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x003e
            a5.c r0 = kotlin.text.C9515r.m23144g(r4)
            boolean r3 = r0 instanceof java.util.Collection
            if (r3 == 0) goto L_0x0020
            r3 = r0
            java.util.Collection r3 = (java.util.Collection) r3
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L_0x0020
        L_0x001e:
            r4 = 1
            goto L_0x003c
        L_0x0020:
            java.util.Iterator r0 = r0.iterator()
        L_0x0024:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x001e
            r3 = r0
            kotlin.collections.f0 r3 = (kotlin.collections.C9339f0) r3
            int r3 = r3.mo26532a()
            char r3 = r4.charAt(r3)
            boolean r3 = kotlin.text.C9499b.m23121b(r3)
            if (r3 != 0) goto L_0x0024
            r4 = 0
        L_0x003c:
            if (r4 == 0) goto L_0x003f
        L_0x003e:
            r1 = 1
        L_0x003f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.text.C9514q.m23139b(java.lang.CharSequence):boolean");
    }

    /* renamed from: c */
    public static final boolean m23140c(@NotNull String str, int i, @NotNull String str2, int i2, int i3, boolean z) {
        C9424q.m22996e(str, "<this>");
        C9424q.m22996e(str2, "other");
        return !z ? str.regionMatches(i, str2, i2, i3) : str.regionMatches(z, i, str2, i2, i3);
    }

    @NotNull
    /* renamed from: d */
    public static String m23141d(@NotNull CharSequence charSequence, int i) {
        C9424q.m22996e(charSequence, "<this>");
        if (!(i >= 0)) {
            throw new IllegalArgumentException(("Count 'n' must be non-negative, but was " + i + FilenameUtils.EXTENSION_SEPARATOR).toString());
        } else if (i == 0) {
            return "";
        } else {
            if (i == 1) {
                return charSequence.toString();
            }
            int length = charSequence.length();
            if (length == 0) {
                return "";
            }
            if (length != 1) {
                StringBuilder sb = new StringBuilder(charSequence.length() * i);
                C9339f0 j = new C3975c(1, i).iterator();
                while (j.hasNext()) {
                    j.mo26532a();
                    sb.append(charSequence);
                }
                String sb2 = sb.toString();
                C9424q.m22995d(sb2, "{\n                    va…tring()\n                }");
                return sb2;
            }
            char charAt = charSequence.charAt(0);
            char[] cArr = new char[i];
            for (int i2 = 0; i2 < i; i2++) {
                cArr[i2] = charAt;
            }
            return new String(cArr);
        }
    }
}
