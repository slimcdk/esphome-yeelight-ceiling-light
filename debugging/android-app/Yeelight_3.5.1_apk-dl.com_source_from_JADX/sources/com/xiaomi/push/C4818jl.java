package com.xiaomi.push;

import com.xiaomi.push.C4807jb;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;

/* renamed from: com.xiaomi.push.jl */
public class C4818jl extends C4807jb {

    /* renamed from: b */
    private static int f9303b = 10000;

    /* renamed from: c */
    private static int f9304c = 10000;

    /* renamed from: d */
    private static int f9305d = 10000;

    /* renamed from: e */
    private static int f9306e = 10485760;

    /* renamed from: f */
    private static int f9307f = 104857600;

    /* renamed from: com.xiaomi.push.jl$a */
    public static class C4819a extends C4807jb.C4808a {
        public C4819a() {
            super(false, true);
        }

        public C4819a(boolean z, boolean z2, int i) {
            super(z, z2, i);
        }

        /* renamed from: a */
        public C4812jf mo29873a(C4823jp jpVar) {
            C4818jl jlVar = new C4818jl(jpVar, this.f9287a, this.f9288b);
            int i = this.f9286a;
            if (i != 0) {
                jlVar.mo29863b(i);
            }
            return jlVar;
        }
    }

    public C4818jl(C4823jp jpVar, boolean z, boolean z2) {
        super(jpVar, z, z2);
    }

    /* renamed from: a */
    public C4810jd mo29850a() {
        byte a = mo29850a();
        int a2 = mo29850a();
        if (a2 <= f9304c) {
            return new C4810jd(a, a2);
        }
        throw new C4813jg(3, "Thrift list size " + a2 + " out of range!");
    }

    /* renamed from: a */
    public C4811je m14968a() {
        byte a = mo29850a();
        byte a2 = mo29850a();
        int a3 = mo29850a();
        if (a3 <= f9303b) {
            return new C4811je(a, a2, a3);
        }
        throw new C4813jg(3, "Thrift map size " + a3 + " out of range!");
    }

    /* renamed from: a */
    public C4816jj m14969a() {
        byte a = mo29850a();
        int a2 = mo29850a();
        if (a2 <= f9305d) {
            return new C4816jj(a, a2);
        }
        throw new C4813jg(3, "Thrift set size " + a2 + " out of range!");
    }

    /* renamed from: a */
    public String m14970a() {
        int a = mo29850a();
        if (a > f9306e) {
            throw new C4813jg(3, "Thrift string size " + a + " out of range!");
        } else if (this.f9297a.mo29881b() < a) {
            return mo29851a(a);
        } else {
            try {
                String str = new String(this.f9297a.mo29878a(), this.f9297a.mo29878a(), a, "UTF-8");
                this.f9297a.mo29879a(a);
                return str;
            } catch (UnsupportedEncodingException unused) {
                throw new C4804iz("JVM DOES NOT SUPPORT UTF-8");
            }
        }
    }

    /* renamed from: a */
    public ByteBuffer m14971a() {
        int a = mo29850a();
        if (a <= f9307f) {
            mo29865c(a);
            if (this.f9297a.mo29881b() >= a) {
                ByteBuffer wrap = ByteBuffer.wrap(this.f9297a.mo29878a(), this.f9297a.mo29878a(), a);
                this.f9297a.mo29879a(a);
                return wrap;
            }
            byte[] bArr = new byte[a];
            this.f9297a.mo29882b(bArr, 0, a);
            return ByteBuffer.wrap(bArr);
        }
        throw new C4813jg(3, "Thrift binary size " + a + " out of range!");
    }
}
