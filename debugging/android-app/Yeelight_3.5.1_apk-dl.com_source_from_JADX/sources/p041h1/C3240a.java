package p041h1;

/* renamed from: h1.a */
public class C3240a implements C3243d {

    /* renamed from: a */
    private final int f5220a;

    /* renamed from: b */
    private final C3243d[] f5221b;

    /* renamed from: c */
    private final C3241b f5222c;

    public C3240a(int i, C3243d... dVarArr) {
        this.f5220a = i;
        this.f5221b = dVarArr;
        this.f5222c = new C3241b(i);
    }

    /* renamed from: a */
    public StackTraceElement[] mo23793a(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= this.f5220a) {
            return stackTraceElementArr;
        }
        StackTraceElement[] stackTraceElementArr2 = stackTraceElementArr;
        for (C3243d dVar : this.f5221b) {
            if (stackTraceElementArr2.length <= this.f5220a) {
                break;
            }
            stackTraceElementArr2 = dVar.mo23793a(stackTraceElementArr);
        }
        return stackTraceElementArr2.length > this.f5220a ? this.f5222c.mo23793a(stackTraceElementArr2) : stackTraceElementArr2;
    }
}
