package javax.jmdns.impl;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* renamed from: javax.jmdns.impl.f */
public final class C9248f extends C9247e {

    /* renamed from: n */
    public static boolean f17152n = true;

    /* renamed from: h */
    Map<String, Integer> f17153h;

    /* renamed from: i */
    private int f17154i;

    /* renamed from: j */
    private final C9249a f17155j;

    /* renamed from: k */
    private final C9249a f17156k;

    /* renamed from: l */
    private final C9249a f17157l;

    /* renamed from: m */
    private final C9249a f17158m;

    /* renamed from: javax.jmdns.impl.f$a */
    public static class C9249a extends ByteArrayOutputStream {

        /* renamed from: a */
        private final C9248f f17159a;

        /* renamed from: b */
        private final int f17160b;

        C9249a(int i, C9248f fVar) {
            this(i, fVar, 0);
        }

        C9249a(int i, C9248f fVar, int i2) {
            super(i);
            this.f17159a = fVar;
            this.f17160b = i2;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo37646a(int i) {
            write(i & 255);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo37647c(byte[] bArr, int i, int i2) {
            for (int i3 = 0; i3 < i2; i3++) {
                mo37646a(bArr[i + i3]);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo37648d(int i) {
            mo37653l(i >> 16);
            mo37653l(i);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public void mo37649f(String str) {
            mo37650h(str, true);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public void mo37650h(String str, boolean z) {
            while (true) {
                int indexOf = str.indexOf(46);
                if (indexOf < 0) {
                    indexOf = str.length();
                }
                if (indexOf <= 0) {
                    mo37646a(0);
                    return;
                }
                String substring = str.substring(0, indexOf);
                if (z && C9248f.f17152n) {
                    Integer num = this.f17159a.f17153h.get(str);
                    if (num != null) {
                        int intValue = num.intValue();
                        mo37646a((intValue >> 8) | 192);
                        mo37646a(intValue & 255);
                        return;
                    }
                    this.f17159a.f17153h.put(str, Integer.valueOf(size() + this.f17160b));
                }
                mo37654m(substring, 0, substring.length());
                str = str.substring(indexOf);
                if (str.startsWith(".")) {
                    str = str.substring(1);
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public void mo37651i(C9250g gVar) {
            mo37649f(gVar.mo37554c());
            mo37653l(gVar.mo37558f().indexValue());
            mo37653l(gVar.mo37556e().indexValue());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k */
        public void mo37652k(C9259h hVar, long j) {
            mo37649f(hVar.mo37554c());
            mo37653l(hVar.mo37558f().indexValue());
            mo37653l(hVar.mo37556e().indexValue() | ((!hVar.mo37569p() || !this.f17159a.mo37631m()) ? 0 : 32768));
            mo37648d(j == 0 ? hVar.mo37662C() : hVar.mo37677y(j));
            C9249a aVar = new C9249a(512, this.f17159a, this.f17160b + size() + 2);
            hVar.mo37674O(aVar);
            byte[] byteArray = aVar.toByteArray();
            mo37653l(byteArray.length);
            write(byteArray, 0, byteArray.length);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: l */
        public void mo37653l(int i) {
            mo37646a(i >> 8);
            mo37646a(i);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: m */
        public void mo37654m(String str, int i, int i2) {
            int i3;
            int i4 = 0;
            for (int i5 = 0; i5 < i2; i5++) {
                char charAt = str.charAt(i + i5);
                i4 = (charAt < 1 || charAt > 127) ? charAt > 2047 ? i4 + 3 : i4 + 2 : i4 + 1;
            }
            mo37646a(i4);
            for (int i6 = 0; i6 < i2; i6++) {
                char charAt2 = str.charAt(i + i6);
                if (charAt2 < 1 || charAt2 > 127) {
                    if (charAt2 > 2047) {
                        mo37646a(((charAt2 >> 12) & 15) | 224);
                        i3 = ((charAt2 >> 6) & 63) | 128;
                    } else {
                        i3 = ((charAt2 >> 6) & 31) | 192;
                    }
                    mo37646a(i3);
                    charAt2 = ((charAt2 >> 0) & '?') | 128;
                }
                mo37646a(charAt2);
            }
        }

        /* access modifiers changed from: package-private */
        public void writeBytes(byte[] bArr) {
            if (bArr != null) {
                mo37647c(bArr, 0, bArr.length);
            }
        }
    }

    public C9248f(int i) {
        this(i, true, 1460);
    }

    public C9248f(int i, boolean z, int i2) {
        super(i, 0, z);
        this.f17153h = new HashMap();
        this.f17154i = i2 > 0 ? i2 : 1460;
        this.f17155j = new C9249a(i2, this);
        this.f17156k = new C9249a(i2, this);
        this.f17157l = new C9249a(i2, this);
        this.f17158m = new C9249a(i2, this);
    }

    /* renamed from: n */
    public boolean mo37632n() {
        return (mo37623e() & 32768) == 0;
    }

    /* renamed from: t */
    public void mo37638t(C9241c cVar, C9259h hVar) {
        if (cVar == null || !hVar.mo37672M(cVar)) {
            mo37640u(hVar, 0);
        }
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(mo37632n() ? "dns[query:" : "dns[response:");
        stringBuffer.append(" id=0x");
        stringBuffer.append(Integer.toHexString(mo37624f()));
        if (mo37623e() != 0) {
            stringBuffer.append(", flags=0x");
            stringBuffer.append(Integer.toHexString(mo37623e()));
            if ((mo37623e() & 32768) != 0) {
                stringBuffer.append(":r");
            }
            if ((mo37623e() & 1024) != 0) {
                stringBuffer.append(":aa");
            }
            if ((mo37623e() & 512) != 0) {
                stringBuffer.append(":tc");
            }
        }
        if (mo37628j() > 0) {
            stringBuffer.append(", questions=");
            stringBuffer.append(mo37628j());
        }
        if (mo37626h() > 0) {
            stringBuffer.append(", answers=");
            stringBuffer.append(mo37626h());
        }
        if (mo37627i() > 0) {
            stringBuffer.append(", authorities=");
            stringBuffer.append(mo37627i());
        }
        if (mo37625g() > 0) {
            stringBuffer.append(", additionals=");
            stringBuffer.append(mo37625g());
        }
        if (mo37628j() > 0) {
            stringBuffer.append("\nquestions:");
            for (C9250g append : this.f17148d) {
                stringBuffer.append("\n\t");
                stringBuffer.append(append);
            }
        }
        if (mo37626h() > 0) {
            stringBuffer.append("\nanswers:");
            for (C9259h append2 : this.f17149e) {
                stringBuffer.append("\n\t");
                stringBuffer.append(append2);
            }
        }
        if (mo37627i() > 0) {
            stringBuffer.append("\nauthorities:");
            for (C9259h append3 : this.f17150f) {
                stringBuffer.append("\n\t");
                stringBuffer.append(append3);
            }
        }
        if (mo37625g() > 0) {
            stringBuffer.append("\nadditionals:");
            for (C9259h append4 : this.f17151g) {
                stringBuffer.append("\n\t");
                stringBuffer.append(append4);
            }
        }
        stringBuffer.append("\nnames=");
        stringBuffer.append(this.f17153h);
        stringBuffer.append("]");
        return stringBuffer.toString();
    }

    /* renamed from: u */
    public void mo37640u(C9259h hVar, long j) {
        if (hVar == null) {
            return;
        }
        if (j == 0 || !hVar.mo37563j(j)) {
            C9249a aVar = new C9249a(512, this);
            aVar.mo37652k(hVar, j);
            byte[] byteArray = aVar.toByteArray();
            if (byteArray.length < mo37643x()) {
                this.f17149e.add(hVar);
                this.f17156k.write(byteArray, 0, byteArray.length);
                return;
            }
            throw new IOException("message full");
        }
    }

    /* renamed from: v */
    public void mo37641v(C9259h hVar) {
        C9249a aVar = new C9249a(512, this);
        aVar.mo37652k(hVar, 0);
        byte[] byteArray = aVar.toByteArray();
        if (byteArray.length < mo37643x()) {
            this.f17150f.add(hVar);
            this.f17157l.write(byteArray, 0, byteArray.length);
            return;
        }
        throw new IOException("message full");
    }

    /* renamed from: w */
    public void mo37642w(C9250g gVar) {
        C9249a aVar = new C9249a(512, this);
        aVar.mo37651i(gVar);
        byte[] byteArray = aVar.toByteArray();
        if (byteArray.length < mo37643x()) {
            this.f17148d.add(gVar);
            this.f17155j.write(byteArray, 0, byteArray.length);
            return;
        }
        throw new IOException("message full");
    }

    /* renamed from: x */
    public int mo37643x() {
        return ((((this.f17154i - 12) - this.f17155j.size()) - this.f17156k.size()) - this.f17157l.size()) - this.f17158m.size();
    }

    /* renamed from: y */
    public byte[] mo37644y() {
        long currentTimeMillis = System.currentTimeMillis();
        this.f17153h.clear();
        C9249a aVar = new C9249a(this.f17154i, this);
        aVar.mo37653l(this.f17146b ? 0 : mo37624f());
        aVar.mo37653l(mo37623e());
        aVar.mo37653l(mo37628j());
        aVar.mo37653l(mo37626h());
        aVar.mo37653l(mo37627i());
        aVar.mo37653l(mo37625g());
        for (C9250g i : this.f17148d) {
            aVar.mo37651i(i);
        }
        for (C9259h k : this.f17149e) {
            aVar.mo37652k(k, currentTimeMillis);
        }
        for (C9259h k2 : this.f17150f) {
            aVar.mo37652k(k2, currentTimeMillis);
        }
        for (C9259h k3 : this.f17151g) {
            aVar.mo37652k(k3, currentTimeMillis);
        }
        return aVar.toByteArray();
    }

    /* renamed from: z */
    public int mo37645z() {
        return this.f17154i;
    }
}
