package p154d.p155b;

/* renamed from: d.b.e0 */
public class C10705e0 extends C10730p {

    /* renamed from: b */
    private boolean f20606b;

    /* renamed from: c */
    private int f20607c;

    public C10705e0(String str) {
        super(str);
        this.f20606b = true;
    }

    public C10705e0(String str, int i) {
        super(str);
        if (i <= 0) {
            this.f20607c = -1;
        } else {
            this.f20607c = i;
        }
        this.f20606b = false;
    }

    /* renamed from: b */
    public int mo33905b() {
        if (this.f20606b) {
            return -1;
        }
        return this.f20607c;
    }

    /* renamed from: c */
    public boolean mo33906c() {
        return this.f20606b;
    }
}
