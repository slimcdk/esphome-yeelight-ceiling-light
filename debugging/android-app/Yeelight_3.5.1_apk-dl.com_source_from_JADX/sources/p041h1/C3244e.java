package p041h1;

/* renamed from: h1.e */
public class C3244e {

    /* renamed from: a */
    public final String f5225a;

    /* renamed from: b */
    public final String f5226b;

    /* renamed from: c */
    public final StackTraceElement[] f5227c;

    /* renamed from: d */
    public final C3244e f5228d;

    public C3244e(Throwable th, C3243d dVar) {
        this.f5225a = th.getLocalizedMessage();
        this.f5226b = th.getClass().getName();
        this.f5227c = dVar.mo23793a(th.getStackTrace());
        Throwable cause = th.getCause();
        this.f5228d = cause != null ? new C3244e(cause, dVar) : null;
    }
}
