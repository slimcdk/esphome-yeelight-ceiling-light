package p152e6;

/* renamed from: e6.a */
public abstract class C9000a implements C9003c {
    /* renamed from: k */
    private static boolean m21448k(String str) {
        if (str == null) {
            return true;
        }
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (!Character.isWhitespace(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public final C9003c getLogger(String str) {
        if (m21448k(str)) {
            return this;
        }
        String name = getName();
        if (!m21448k(name) && C9001b.m21454e() != this) {
            str = name + "." + str;
        }
        C9003c cVar = C9001b.m21452c().get(str);
        if (cVar != null) {
            return cVar;
        }
        C9003c l = mo36844l(str);
        C9003c putIfAbsent = C9001b.m21453d().putIfAbsent(str, l);
        return putIfAbsent == null ? l : putIfAbsent;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public abstract C9003c mo36844l(String str);
}
