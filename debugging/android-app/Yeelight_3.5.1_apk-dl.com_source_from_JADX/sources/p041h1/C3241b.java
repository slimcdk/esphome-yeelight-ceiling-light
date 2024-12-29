package p041h1;

/* renamed from: h1.b */
public class C3241b implements C3243d {

    /* renamed from: a */
    private final int f5223a;

    public C3241b(int i) {
        this.f5223a = i;
    }

    /* renamed from: a */
    public StackTraceElement[] mo23793a(StackTraceElement[] stackTraceElementArr) {
        int length = stackTraceElementArr.length;
        int i = this.f5223a;
        if (length <= i) {
            return stackTraceElementArr;
        }
        int i2 = i / 2;
        int i3 = i - i2;
        StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[i];
        System.arraycopy(stackTraceElementArr, 0, stackTraceElementArr2, 0, i3);
        System.arraycopy(stackTraceElementArr, stackTraceElementArr.length - i2, stackTraceElementArr2, i3, i2);
        return stackTraceElementArr2;
    }
}
