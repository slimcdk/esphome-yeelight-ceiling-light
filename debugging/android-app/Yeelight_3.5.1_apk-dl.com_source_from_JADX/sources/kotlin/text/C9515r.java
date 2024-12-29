package kotlin.text;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.Collection;
import java.util.Iterator;
import kotlin.C9401i;
import kotlin.Pair;
import kotlin.collections.C9339f0;
import kotlin.collections.C9360p;
import kotlin.jvm.internal.C9424q;
import org.jetbrains.annotations.NotNull;
import p125a5.C3972a;
import p125a5.C3975c;

/* renamed from: kotlin.text.r */
class C9515r extends C9514q {

    /* renamed from: kotlin.text.r$a */
    public static final class C9516a extends C9360p {

        /* renamed from: a */
        private int f17356a;

        /* renamed from: b */
        final /* synthetic */ CharSequence f17357b;

        C9516a(CharSequence charSequence) {
            this.f17357b = charSequence;
        }

        /* renamed from: a */
        public char mo38203a() {
            CharSequence charSequence = this.f17357b;
            int i = this.f17356a;
            this.f17356a = i + 1;
            return charSequence.charAt(i);
        }

        public boolean hasNext() {
            return this.f17356a < this.f17357b.length();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public static final Pair<Integer, String> m23143f(CharSequence charSequence, Collection<String> collection, int i, boolean z, boolean z2) {
        int i2;
        T t;
        String str;
        T t2;
        if (z || collection.size() != 1) {
            C3972a cVar = !z2 ? new C3975c(C3979f.m11481a(i, 0), charSequence.length()) : C3979f.m11483c(C3979f.m11482b(i, m23145h(charSequence)), 0);
            if (charSequence instanceof String) {
                i2 = cVar.mo26522b();
                int e = cVar.mo26523e();
                int g = cVar.mo26525g();
                if ((g > 0 && i2 <= e) || (g < 0 && e <= i2)) {
                    while (true) {
                        Iterator<T> it = collection.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                t2 = null;
                                break;
                            }
                            t2 = it.next();
                            String str2 = (String) t2;
                            if (C9514q.m23140c(str2, 0, (String) charSequence, i2, str2.length(), z)) {
                                break;
                            }
                        }
                        str = (String) t2;
                        if (str == null) {
                            if (i2 == e) {
                                break;
                            }
                            i2 += g;
                        } else {
                            break;
                        }
                    }
                }
                return null;
            }
            int b = cVar.mo26522b();
            int e2 = cVar.mo26523e();
            int g2 = cVar.mo26525g();
            if ((g2 > 0 && b <= e2) || (g2 < 0 && e2 <= b)) {
                while (true) {
                    Iterator<T> it2 = collection.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            t = null;
                            break;
                        }
                        t = it2.next();
                        String str3 = (String) t;
                        if (m23159v(str3, 0, charSequence, i2, str3.length(), z)) {
                            break;
                        }
                    }
                    str = (String) t;
                    if (str == null) {
                        if (i2 == e2) {
                            break;
                        }
                        b = i2 + g2;
                    } else {
                        break;
                    }
                }
            }
            return null;
            return C9401i.m22955a(Integer.valueOf(i2), str);
        }
        String str4 = (String) C9309a0.m22812r(collection);
        CharSequence charSequence2 = charSequence;
        String str5 = str4;
        int i3 = i;
        int n = !z2 ? m23151n(charSequence2, str5, i3, false, 4, (Object) null) : m23157t(charSequence2, str5, i3, false, 4, (Object) null);
        if (n < 0) {
            return null;
        }
        return C9401i.m22955a(Integer.valueOf(n), str4);
    }

    @NotNull
    /* renamed from: g */
    public static final C3975c m23144g(@NotNull CharSequence charSequence) {
        C9424q.m22996e(charSequence, "<this>");
        return new C3975c(0, charSequence.length() - 1);
    }

    /* renamed from: h */
    public static final int m23145h(@NotNull CharSequence charSequence) {
        C9424q.m22996e(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    /* renamed from: i */
    public static final int m23146i(@NotNull CharSequence charSequence, char c, int i, boolean z) {
        C9424q.m22996e(charSequence, "<this>");
        if (!z && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(c, i);
        }
        return m23152o(charSequence, new char[]{c}, i, z);
    }

    /* renamed from: j */
    public static final int m23147j(@NotNull CharSequence charSequence, @NotNull String str, int i, boolean z) {
        C9424q.m22996e(charSequence, "<this>");
        C9424q.m22996e(str, TypedValues.Custom.S_STRING);
        if (!z && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(str, i);
        }
        return m23149l(charSequence, str, i, charSequence.length(), z, false, 16, (Object) null);
    }

    /* renamed from: k */
    private static final int m23148k(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z, boolean z2) {
        C3972a cVar = !z2 ? new C3975c(C3979f.m11481a(i, 0), C3979f.m11482b(i2, charSequence.length())) : C3979f.m11483c(C3979f.m11482b(i, m23145h(charSequence)), C3979f.m11481a(i2, 0));
        if (!(charSequence instanceof String) || !(charSequence2 instanceof String)) {
            int b = cVar.mo26522b();
            int e = cVar.mo26523e();
            int g = cVar.mo26525g();
            if ((g <= 0 || b > e) && (g >= 0 || e > b)) {
                return -1;
            }
            while (true) {
                if (m23159v(charSequence2, 0, charSequence, b, charSequence2.length(), z)) {
                    return b;
                }
                if (b == e) {
                    return -1;
                }
                b += g;
            }
        } else {
            int b2 = cVar.mo26522b();
            int e2 = cVar.mo26523e();
            int g2 = cVar.mo26525g();
            if ((g2 <= 0 || b2 > e2) && (g2 >= 0 || e2 > b2)) {
                return -1;
            }
            while (true) {
                if (C9514q.m23140c((String) charSequence2, 0, (String) charSequence, b2, charSequence2.length(), z)) {
                    return b2;
                }
                if (b2 == e2) {
                    return -1;
                }
                b2 += g2;
            }
        }
    }

    /* renamed from: l */
    static /* synthetic */ int m23149l(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z, boolean z2, int i3, Object obj) {
        return m23148k(charSequence, charSequence2, i, i2, z, (i3 & 16) != 0 ? false : z2);
    }

    /* renamed from: m */
    public static /* synthetic */ int m23150m(CharSequence charSequence, char c, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return m23146i(charSequence, c, i, z);
    }

    /* renamed from: n */
    public static /* synthetic */ int m23151n(CharSequence charSequence, String str, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return m23147j(charSequence, str, i, z);
    }

    /* renamed from: o */
    public static final int m23152o(@NotNull CharSequence charSequence, @NotNull char[] cArr, int i, boolean z) {
        boolean z2;
        C9424q.m22996e(charSequence, "<this>");
        C9424q.m22996e(cArr, "chars");
        if (z || cArr.length != 1 || !(charSequence instanceof String)) {
            C9339f0 j = new C3975c(C3979f.m11481a(i, 0), m23145h(charSequence)).iterator();
            while (j.hasNext()) {
                int a = j.mo26532a();
                char charAt = charSequence.charAt(a);
                int length = cArr.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        z2 = false;
                        continue;
                        break;
                    } else if (C9500c.m23122c(cArr[i2], charAt, z)) {
                        z2 = true;
                        continue;
                        break;
                    } else {
                        i2++;
                    }
                }
                if (z2) {
                    return a;
                }
            }
            return -1;
        }
        return ((String) charSequence).indexOf(C9351l.m22888g(cArr), i);
    }

    @NotNull
    /* renamed from: p */
    public static final C9360p m23153p(@NotNull CharSequence charSequence) {
        C9424q.m22996e(charSequence, "<this>");
        return new C9516a(charSequence);
    }

    /* renamed from: q */
    public static final int m23154q(@NotNull CharSequence charSequence, char c, int i, boolean z) {
        C9424q.m22996e(charSequence, "<this>");
        if (!z && (charSequence instanceof String)) {
            return ((String) charSequence).lastIndexOf(c, i);
        }
        return m23158u(charSequence, new char[]{c}, i, z);
    }

    /* renamed from: r */
    public static final int m23155r(@NotNull CharSequence charSequence, @NotNull String str, int i, boolean z) {
        C9424q.m22996e(charSequence, "<this>");
        C9424q.m22996e(str, TypedValues.Custom.S_STRING);
        return (z || !(charSequence instanceof String)) ? m23148k(charSequence, str, i, 0, z, true) : ((String) charSequence).lastIndexOf(str, i);
    }

    /* renamed from: s */
    public static /* synthetic */ int m23156s(CharSequence charSequence, char c, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = m23145h(charSequence);
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return m23154q(charSequence, c, i, z);
    }

    /* renamed from: t */
    public static /* synthetic */ int m23157t(CharSequence charSequence, String str, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = m23145h(charSequence);
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return m23155r(charSequence, str, i, z);
    }

    /* renamed from: u */
    public static final int m23158u(@NotNull CharSequence charSequence, @NotNull char[] cArr, int i, boolean z) {
        C9424q.m22996e(charSequence, "<this>");
        C9424q.m22996e(cArr, "chars");
        if (z || cArr.length != 1 || !(charSequence instanceof String)) {
            for (int b = C3979f.m11482b(i, m23145h(charSequence)); -1 < b; b--) {
                char charAt = charSequence.charAt(b);
                int length = cArr.length;
                boolean z2 = false;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        break;
                    } else if (C9500c.m23122c(cArr[i2], charAt, z)) {
                        z2 = true;
                        break;
                    } else {
                        i2++;
                    }
                }
                if (z2) {
                    return b;
                }
            }
            return -1;
        }
        return ((String) charSequence).lastIndexOf(C9351l.m22888g(cArr), i);
    }

    /* renamed from: v */
    public static final boolean m23159v(@NotNull CharSequence charSequence, int i, @NotNull CharSequence charSequence2, int i2, int i3, boolean z) {
        C9424q.m22996e(charSequence, "<this>");
        C9424q.m22996e(charSequence2, "other");
        if (i2 < 0 || i < 0 || i > charSequence.length() - i3 || i2 > charSequence2.length() - i3) {
            return false;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            if (!C9500c.m23122c(charSequence.charAt(i + i4), charSequence2.charAt(i2 + i4), z)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: w */
    public static final void m23160w(int i) {
        if (!(i >= 0)) {
            throw new IllegalArgumentException(("Limit must be non-negative, but was " + i).toString());
        }
    }

    @NotNull
    /* renamed from: x */
    public static final String m23161x(@NotNull CharSequence charSequence, @NotNull C3975c cVar) {
        C9424q.m22996e(charSequence, "<this>");
        C9424q.m22996e(cVar, "range");
        return charSequence.subSequence(cVar.mo26536o().intValue(), cVar.mo26535n().intValue() + 1).toString();
    }

    @NotNull
    /* renamed from: y */
    public static final String m23162y(@NotNull String str, char c, @NotNull String str2) {
        C9424q.m22996e(str, "<this>");
        C9424q.m22996e(str2, "missingDelimiterValue");
        int s = m23156s(str, c, 0, false, 6, (Object) null);
        if (s == -1) {
            return str2;
        }
        String substring = str.substring(s + 1, str.length());
        C9424q.m22995d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    /* renamed from: z */
    public static /* synthetic */ String m23163z(String str, char c, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = str;
        }
        return m23162y(str, c, str2);
    }
}
