package org.eclipse.jetty.servlet;

import com.miot.service.common.miotcloud.impl.MiotCloudImpl;
import javax.servlet.DispatcherType;
import org.apache.commons.p194io.IOUtils;
import org.eclipse.jetty.http.PathMap;
import org.eclipse.jetty.util.C9996o;
import p147d6.C8948d;

/* renamed from: org.eclipse.jetty.servlet.b */
public class C9963b implements C8948d {

    /* renamed from: a */
    private int f18320a = 0;

    /* renamed from: b */
    private String f18321b;

    /* renamed from: c */
    private transient C9961a f18322c;

    /* renamed from: d */
    private String[] f18323d;

    /* renamed from: e */
    private String[] f18324e;

    /* renamed from: org.eclipse.jetty.servlet.b$a */
    static /* synthetic */ class C9964a {

        /* renamed from: a */
        static final /* synthetic */ int[] f18325a;

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
                javax.servlet.DispatcherType[] r0 = javax.servlet.DispatcherType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f18325a = r0
                javax.servlet.DispatcherType r1 = javax.servlet.DispatcherType.REQUEST     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f18325a     // Catch:{ NoSuchFieldError -> 0x001d }
                javax.servlet.DispatcherType r1 = javax.servlet.DispatcherType.ASYNC     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f18325a     // Catch:{ NoSuchFieldError -> 0x0028 }
                javax.servlet.DispatcherType r1 = javax.servlet.DispatcherType.FORWARD     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f18325a     // Catch:{ NoSuchFieldError -> 0x0033 }
                javax.servlet.DispatcherType r1 = javax.servlet.DispatcherType.INCLUDE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f18325a     // Catch:{ NoSuchFieldError -> 0x003e }
                javax.servlet.DispatcherType r1 = javax.servlet.DispatcherType.ERROR     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: org.eclipse.jetty.servlet.C9963b.C9964a.<clinit>():void");
        }
    }

    /* renamed from: c */
    public static int m24582c(DispatcherType dispatcherType) {
        int i = C9964a.f18325a[dispatcherType.ordinal()];
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
                throw new IllegalArgumentException(dispatcherType.toString());
            }
        }
        return i2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo40059a(int i) {
        int i2 = this.f18320a;
        return i2 == 0 ? i == 1 || (i == 16 && this.f18322c.mo40027H0()) : (i & i2) != 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo40060b(String str, int i) {
        if (mo40059a(i)) {
            int i2 = 0;
            while (true) {
                String[] strArr = this.f18323d;
                if (i2 >= strArr.length) {
                    break;
                } else if (strArr[i2] != null && PathMap.match(strArr[i2], str, true)) {
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
    public C9961a mo40061d() {
        return this.f18322c;
    }

    /* renamed from: e */
    public String mo40062e() {
        return this.f18321b;
    }

    /* renamed from: f */
    public String[] mo40063f() {
        return this.f18323d;
    }

    /* renamed from: g */
    public String[] mo40064g() {
        return this.f18324e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo40065h(C9961a aVar) {
        this.f18322c = aVar;
        mo40066i(aVar.getName());
    }

    /* renamed from: i */
    public void mo40066i(String str) {
        this.f18321b = str;
    }

    /* renamed from: p0 */
    public void mo26544p0(Appendable appendable, String str) {
        appendable.append(String.valueOf(this)).append(IOUtils.LINE_SEPARATOR_UNIX);
    }

    public String toString() {
        return C9996o.m24714a(this.f18323d) + MiotCloudImpl.COOKIE_PATH + C9996o.m24714a(this.f18324e) + "==" + this.f18320a + "=>" + this.f18321b;
    }
}
