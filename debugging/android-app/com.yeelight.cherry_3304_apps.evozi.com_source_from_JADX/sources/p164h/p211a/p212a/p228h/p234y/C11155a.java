package p164h.p211a.p212a.p228h.p234y;

/* renamed from: h.a.a.h.y.a */
public abstract class C11155a implements C11158c {
    /* renamed from: l */
    private static boolean m29012l(String str) {
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

    /* renamed from: f */
    public final C11158c mo35482f(String str) {
        if (m29012l(str)) {
            return this;
        }
        String name = getName();
        if (!m29012l(name) && C11156b.m29019e() != this) {
            str = name + "." + str;
        }
        C11158c cVar = C11156b.m29017c().get(str);
        if (cVar != null) {
            return cVar;
        }
        C11158c m = mo35483m(str);
        C11158c putIfAbsent = C11156b.m29018d().putIfAbsent(str, m);
        return putIfAbsent == null ? m : putIfAbsent;
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public abstract C11158c mo35483m(String str);
}
