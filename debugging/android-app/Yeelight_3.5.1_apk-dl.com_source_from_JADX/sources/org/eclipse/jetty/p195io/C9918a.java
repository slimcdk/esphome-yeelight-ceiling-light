package org.eclipse.jetty.p195io;

import org.eclipse.jetty.p195io.Buffers;
import p225w5.C11940d;
import p225w5.C11946h;
import p229x5.C11985c;
import p229x5.C11986d;

/* renamed from: org.eclipse.jetty.io.a */
public abstract class C9918a implements Buffers {

    /* renamed from: a */
    protected final Buffers.Type f18161a;

    /* renamed from: b */
    protected final int f18162b;

    /* renamed from: c */
    protected final Buffers.Type f18163c;

    /* renamed from: d */
    protected final int f18164d;

    /* renamed from: e */
    protected final Buffers.Type f18165e;

    /* renamed from: org.eclipse.jetty.io.a$a */
    static /* synthetic */ class C9919a {

        /* renamed from: a */
        static final /* synthetic */ int[] f18166a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                org.eclipse.jetty.io.Buffers$Type[] r0 = org.eclipse.jetty.p195io.Buffers.Type.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f18166a = r0
                org.eclipse.jetty.io.Buffers$Type r1 = org.eclipse.jetty.p195io.Buffers.Type.BYTE_ARRAY     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f18166a     // Catch:{ NoSuchFieldError -> 0x001d }
                org.eclipse.jetty.io.Buffers$Type r1 = org.eclipse.jetty.p195io.Buffers.Type.DIRECT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f18166a     // Catch:{ NoSuchFieldError -> 0x0028 }
                org.eclipse.jetty.io.Buffers$Type r1 = org.eclipse.jetty.p195io.Buffers.Type.INDIRECT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: org.eclipse.jetty.p195io.C9918a.C9919a.<clinit>():void");
        }
    }

    public C9918a(Buffers.Type type, int i, Buffers.Type type2, int i2, Buffers.Type type3) {
        this.f18161a = type;
        this.f18162b = i;
        this.f18163c = type2;
        this.f18164d = i2;
        this.f18165e = type3;
    }

    /* renamed from: e */
    public int mo39865e() {
        return this.f18164d;
    }

    /* renamed from: f */
    public int mo39866f() {
        return this.f18162b;
    }

    /* renamed from: g */
    public final boolean mo39867g(C11940d dVar) {
        if (dVar.capacity() != this.f18164d) {
            return false;
        }
        int i = C9919a.f18166a[this.f18163c.ordinal()];
        if (i == 1) {
            return (dVar instanceof C11946h) && !(dVar instanceof C11986d);
        }
        if (i == 2) {
            return dVar instanceof C11985c;
        }
        if (i != 3) {
            return false;
        }
        return dVar instanceof C11986d;
    }

    /* renamed from: h */
    public final boolean mo39868h(C11940d dVar) {
        if (dVar.capacity() != this.f18162b) {
            return false;
        }
        int i = C9919a.f18166a[this.f18161a.ordinal()];
        if (i == 1) {
            return (dVar instanceof C11946h) && !(dVar instanceof C11986d);
        }
        if (i == 2) {
            return dVar instanceof C11985c;
        }
        if (i != 3) {
            return false;
        }
        return dVar instanceof C11986d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final C11940d mo39869i() {
        int i = C9919a.f18166a[this.f18163c.ordinal()];
        if (i == 1) {
            return new C11946h(this.f18164d);
        }
        if (i == 2) {
            return new C11985c(this.f18164d);
        }
        if (i == 3) {
            return new C11986d(this.f18164d);
        }
        throw new IllegalStateException();
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final C11940d mo39870j(int i) {
        int i2 = C9919a.f18166a[this.f18165e.ordinal()];
        if (i2 == 1) {
            return new C11946h(i);
        }
        if (i2 == 2) {
            return new C11985c(i);
        }
        if (i2 == 3) {
            return new C11986d(i);
        }
        throw new IllegalStateException();
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final C11940d mo39871k() {
        int i = C9919a.f18166a[this.f18161a.ordinal()];
        if (i == 1) {
            return new C11946h(this.f18162b);
        }
        if (i == 2) {
            return new C11985c(this.f18162b);
        }
        if (i == 3) {
            return new C11986d(this.f18162b);
        }
        throw new IllegalStateException();
    }
}
