package com.xiaomi.push;

import com.xiaomi.push.C4789je;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;

/* renamed from: com.xiaomi.push.jo */
public class C4800jo extends C4789je {

    /* renamed from: b */
    private static int f9834b = 10000;

    /* renamed from: c */
    private static int f9835c = 10000;

    /* renamed from: d */
    private static int f9836d = 10000;

    /* renamed from: e */
    private static int f9837e = 10485760;

    /* renamed from: f */
    private static int f9838f = 104857600;

    /* renamed from: com.xiaomi.push.jo$a */
    public static class C4801a extends C4789je.C4790a {
        public C4801a() {
            super(false, true);
        }

        public C4801a(boolean z, boolean z2, int i) {
            super(z, z2, i);
        }

        /* renamed from: a */
        public C4794ji mo25839a(C4805js jsVar) {
            C4800jo joVar = new C4800jo(jsVar, this.f9818a, this.f9819b);
            int i = this.f9817a;
            if (i != 0) {
                joVar.mo25829b(i);
            }
            return joVar;
        }
    }

    public C4800jo(C4805js jsVar, boolean z, boolean z2) {
        super(jsVar, z, z2);
    }

    /* renamed from: a */
    public C4792jg mo25816a() {
        byte a = mo25816a();
        int a2 = mo25816a();
        if (a2 <= f9835c) {
            return new C4792jg(a, a2);
        }
        throw new C4795jj(3, "Thrift list size " + a2 + " out of range!");
    }

    /* renamed from: a */
    public C4793jh m15331a() {
        byte a = mo25816a();
        byte a2 = mo25816a();
        int a3 = mo25816a();
        if (a3 <= f9834b) {
            return new C4793jh(a, a2, a3);
        }
        throw new C4795jj(3, "Thrift map size " + a3 + " out of range!");
    }

    /* renamed from: a */
    public C4798jm m15332a() {
        byte a = mo25816a();
        int a2 = mo25816a();
        if (a2 <= f9836d) {
            return new C4798jm(a, a2);
        }
        throw new C4795jj(3, "Thrift set size " + a2 + " out of range!");
    }

    /* renamed from: a */
    public String m15333a() {
        int a = mo25816a();
        if (a > f9837e) {
            throw new C4795jj(3, "Thrift string size " + a + " out of range!");
        } else if (this.f9828a.mo25847b() < a) {
            return mo25817a(a);
        } else {
            try {
                String str = new String(this.f9828a.mo25844a(), this.f9828a.mo25844a(), a, "UTF-8");
                this.f9828a.mo25845a(a);
                return str;
            } catch (UnsupportedEncodingException unused) {
                throw new C4787jc("JVM DOES NOT SUPPORT UTF-8");
            }
        }
    }

    /* renamed from: a */
    public ByteBuffer m15334a() {
        int a = mo25816a();
        if (a <= f9838f) {
            mo25831c(a);
            if (this.f9828a.mo25847b() >= a) {
                ByteBuffer wrap = ByteBuffer.wrap(this.f9828a.mo25844a(), this.f9828a.mo25844a(), a);
                this.f9828a.mo25845a(a);
                return wrap;
            }
            byte[] bArr = new byte[a];
            this.f9828a.mo25848b(bArr, 0, a);
            return ByteBuffer.wrap(bArr);
        }
        throw new C4795jj(3, "Thrift binary size " + a + " out of range!");
    }
}
