package p164h.p211a.p212a.p227g;

import com.miot.service.common.miotcloud.impl.MiotCloudImpl;
import org.apache.commons.p271io.IOUtils;
import p154d.p155b.C4316d;
import p164h.p211a.p212a.p216c.C10922v;
import p164h.p211a.p212a.p228h.C11138r;
import p164h.p211a.p212a.p228h.p233x.C11152d;

/* renamed from: h.a.a.g.b */
public class C11076b implements C11152d {

    /* renamed from: a */
    private int f21828a = 0;

    /* renamed from: b */
    private String f21829b;

    /* renamed from: c */
    private transient C11074a f21830c;

    /* renamed from: d */
    private String[] f21831d;

    /* renamed from: e */
    private String[] f21832e;

    /* renamed from: h.a.a.g.b$a */
    static /* synthetic */ class C11077a {

        /* renamed from: a */
        static final /* synthetic */ int[] f21833a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                d.b.d[] r0 = p154d.p155b.C4316d.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f21833a = r0
                d.b.d r1 = p154d.p155b.C4316d.REQUEST     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f21833a     // Catch:{ NoSuchFieldError -> 0x001d }
                d.b.d r1 = p154d.p155b.C4316d.ASYNC     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f21833a     // Catch:{ NoSuchFieldError -> 0x0028 }
                d.b.d r1 = p154d.p155b.C4316d.FORWARD     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f21833a     // Catch:{ NoSuchFieldError -> 0x0033 }
                d.b.d r1 = p154d.p155b.C4316d.INCLUDE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f21833a     // Catch:{ NoSuchFieldError -> 0x003e }
                d.b.d r1 = p154d.p155b.C4316d.ERROR     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p164h.p211a.p212a.p227g.C11076b.C11077a.<clinit>():void");
        }
    }

    /* renamed from: c */
    public static int m28656c(C4316d dVar) {
        int i = C11077a.f21833a[dVar.ordinal()];
        if (i == 1) {
            return 1;
        }
        int i2 = 2;
        if (i == 2) {
            return 16;
        }
        if (i != 3) {
            i2 = 4;
            if (i != 4) {
                if (i == 5) {
                    return 8;
                }
                throw new IllegalArgumentException(dVar.toString());
            }
        }
        return i2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo35172a(int i) {
        int i2 = this.f21828a;
        return i2 == 0 ? i == 1 || (i == 16 && this.f21830c.mo35182B0()) : (i & i2) != 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo35173b(String str, int i) {
        if (mo35172a(i)) {
            int i2 = 0;
            while (true) {
                String[] strArr = this.f21831d;
                if (i2 >= strArr.length) {
                    break;
                } else if (strArr[i2] != null && C10922v.m27567e(strArr[i2], str, true)) {
                    return true;
                } else {
                    i2++;
                }
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public C11074a mo35174d() {
        return this.f21830c;
    }

    /* renamed from: e */
    public String mo35175e() {
        return this.f21829b;
    }

    /* renamed from: f */
    public String[] mo35176f() {
        return this.f21831d;
    }

    /* renamed from: g */
    public String[] mo35177g() {
        return this.f21832e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo35178h(C11074a aVar) {
        this.f21830c = aVar;
        mo35179i(aVar.getName());
    }

    /* renamed from: i */
    public void mo35179i(String str) {
        this.f21829b = str;
    }

    /* renamed from: k0 */
    public void mo34187k0(Appendable appendable, String str) {
        appendable.append(String.valueOf(this)).append(IOUtils.LINE_SEPARATOR_UNIX);
    }

    public String toString() {
        return C11138r.m28927a(this.f21831d) + MiotCloudImpl.COOKIE_PATH + C11138r.m28927a(this.f21832e) + "==" + this.f21828a + "=>" + this.f21829b;
    }
}
