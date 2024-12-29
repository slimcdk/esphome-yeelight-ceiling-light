package p164h.p257c.p259b;

/* renamed from: h.c.b.a */
public class C11495a {
    /* renamed from: a */
    public static Throwable m30173a(Throwable th) {
        if (th != null) {
            Throwable th2 = th;
            while (th != null) {
                th2 = th;
                th = th.getCause();
            }
            return th2;
        }
        throw new IllegalArgumentException("Cannot unwrap null throwable");
    }
}
