package com.google.android.gms.internal.measurement;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Locale;

/* renamed from: com.google.android.gms.internal.measurement.f3 */
public abstract class C1779f3 implements Serializable, Iterable<Byte> {

    /* renamed from: b */
    public static final C1779f3 f3341b = new C1924o3(C1925o4.f3610b);

    /* renamed from: c */
    private static final C1855k3 f3342c = (C1735c3.m4943b() ? new C1968r3((C1810h3) null) : new C1825i3((C1810h3) null));

    /* renamed from: a */
    private int f3343a = 0;

    C1779f3() {
    }

    /* renamed from: g */
    public static C1779f3 m5073g(String str) {
        return new C1924o3(str.getBytes(C1925o4.f3609a));
    }

    /* renamed from: h */
    public static C1779f3 m5074h(byte[] bArr, int i, int i2) {
        m5075l(i, i + i2, bArr.length);
        return new C1924o3(f3342c.mo11734a(bArr, i, i2));
    }

    /* renamed from: l */
    static int m5075l(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            StringBuilder sb = new StringBuilder(32);
            sb.append("Beginning index: ");
            sb.append(i);
            sb.append(" < 0");
            throw new IndexOutOfBoundsException(sb.toString());
        } else if (i2 < i) {
            StringBuilder sb2 = new StringBuilder(66);
            sb2.append("Beginning index larger than ending index: ");
            sb2.append(i);
            sb2.append(", ");
            sb2.append(i2);
            throw new IndexOutOfBoundsException(sb2.toString());
        } else {
            StringBuilder sb3 = new StringBuilder(37);
            sb3.append("End index: ");
            sb3.append(i2);
            sb3.append(" >= ");
            sb3.append(i3);
            throw new IndexOutOfBoundsException(sb3.toString());
        }
    }

    /* renamed from: n */
    static C1888m3 m5076n(int i) {
        return new C1888m3(i, (C1810h3) null);
    }

    /* renamed from: c */
    public abstract byte mo11637c(int i);

    /* renamed from: d */
    public abstract int mo11638d();

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract int mo11639e(int i, int i2, int i3);

    public abstract boolean equals(Object obj);

    /* renamed from: f */
    public abstract C1779f3 mo11641f(int i, int i2);

    public final int hashCode() {
        int i = this.f3343a;
        if (i == 0) {
            int d = mo11638d();
            i = mo11639e(d, 0, d);
            if (i == 0) {
                i = 1;
            }
            this.f3343a = i;
        }
        return i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public abstract String mo11643i(Charset charset);

    public /* synthetic */ Iterator iterator() {
        return new C1810h3(this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public abstract void mo11645j(C1794g3 g3Var);

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public abstract byte mo11646k(int i);

    /* renamed from: m */
    public final String mo11647m() {
        return mo11638d() == 0 ? "" : mo11643i(C1925o4.f3609a);
    }

    /* renamed from: o */
    public abstract boolean mo11648o();

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public final int mo11649p() {
        return this.f3343a;
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        objArr[1] = Integer.valueOf(mo11638d());
        objArr[2] = mo11638d() <= 50 ? C1707a7.m4717a(this) : String.valueOf(C1707a7.m4717a(mo11641f(0, 47))).concat("...");
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }
}
