package p154d.p198a.p199g;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* renamed from: d.a.g.f */
public final class C10626f extends C10625e {

    /* renamed from: n */
    public static boolean f20325n = true;

    /* renamed from: h */
    Map<String, Integer> f20326h;

    /* renamed from: i */
    private int f20327i;

    /* renamed from: j */
    private final C10627a f20328j;

    /* renamed from: k */
    private final C10627a f20329k;

    /* renamed from: l */
    private final C10627a f20330l;

    /* renamed from: m */
    private final C10627a f20331m;

    /* renamed from: d.a.g.f$a */
    public static class C10627a extends ByteArrayOutputStream {

        /* renamed from: a */
        private final C10626f f20332a;

        /* renamed from: b */
        private final int f20333b;

        C10627a(int i, C10626f fVar) {
            this(i, fVar, 0);
        }

        C10627a(int i, C10626f fVar, int i2) {
            super(i);
            this.f20332a = fVar;
            this.f20333b = i2;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo33587a(int i) {
            write(i & 255);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo33588b(byte[] bArr, int i, int i2) {
            for (int i3 = 0; i3 < i2; i3++) {
                mo33587a(bArr[i + i3]);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public void mo33589g(int i) {
            mo33594o(i >> 16);
            mo33594o(i);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public void mo33590h(String str) {
            mo33591i(str, true);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public void mo33591i(String str, boolean z) {
            while (true) {
                int indexOf = str.indexOf(46);
                if (indexOf < 0) {
                    indexOf = str.length();
                }
                if (indexOf <= 0) {
                    mo33587a(0);
                    return;
                }
                String substring = str.substring(0, indexOf);
                if (z && C10626f.f20325n) {
                    Integer num = this.f20332a.f20326h.get(str);
                    if (num != null) {
                        int intValue = num.intValue();
                        mo33587a((intValue >> 8) | 192);
                        mo33587a(intValue & 255);
                        return;
                    }
                    this.f20332a.f20326h.put(str, Integer.valueOf(size() + this.f20333b));
                }
                mo33595s(substring, 0, substring.length());
                str = str.substring(indexOf);
                if (str.startsWith(".")) {
                    str = str.substring(1);
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public void mo33592j(C10628g gVar) {
            mo33590h(gVar.mo33523c());
            mo33594o(gVar.mo33527f().mo33827a());
            mo33594o(gVar.mo33525e().mo33824b());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: n */
        public void mo33593n(C10637h hVar, long j) {
            mo33590h(hVar.mo33523c());
            mo33594o(hVar.mo33527f().mo33827a());
            mo33594o(hVar.mo33525e().mo33824b() | ((!hVar.mo33538p() || !this.f20332a.mo33572m()) ? 0 : 32768));
            mo33589g(j == 0 ? hVar.mo33602C() : hVar.mo33617y(j));
            C10627a aVar = new C10627a(512, this.f20332a, this.f20333b + size() + 2);
            hVar.mo33614O(aVar);
            byte[] byteArray = aVar.toByteArray();
            mo33594o(byteArray.length);
            write(byteArray, 0, byteArray.length);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: o */
        public void mo33594o(int i) {
            mo33587a(i >> 8);
            mo33587a(i);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: s */
        public void mo33595s(String str, int i, int i2) {
            int i3;
            int i4 = 0;
            for (int i5 = 0; i5 < i2; i5++) {
                char charAt = str.charAt(i + i5);
                i4 = (charAt < 1 || charAt > 127) ? charAt > 2047 ? i4 + 3 : i4 + 2 : i4 + 1;
            }
            mo33587a(i4);
            for (int i6 = 0; i6 < i2; i6++) {
                char charAt2 = str.charAt(i + i6);
                if (charAt2 < 1 || charAt2 > 127) {
                    if (charAt2 > 2047) {
                        mo33587a(((charAt2 >> 12) & 15) | 224);
                        i3 = ((charAt2 >> 6) & 63) | 128;
                    } else {
                        i3 = ((charAt2 >> 6) & 31) | 192;
                    }
                    mo33587a(i3);
                    charAt2 = ((charAt2 >> 0) & '?') | 128;
                }
                mo33587a(charAt2);
            }
        }
    }

    public C10626f(int i) {
        this(i, true, 1460);
    }

    public C10626f(int i, boolean z, int i2) {
        super(i, 0, z);
        this.f20326h = new HashMap();
        this.f20327i = i2 > 0 ? i2 : 1460;
        this.f20328j = new C10627a(i2, this);
        this.f20329k = new C10627a(i2, this);
        this.f20330l = new C10627a(i2, this);
        this.f20331m = new C10627a(i2, this);
    }

    /* renamed from: n */
    public boolean mo33573n() {
        return (mo33564e() & 32768) == 0;
    }

    /* renamed from: t */
    public void mo33579t(C10621c cVar, C10637h hVar) {
        if (cVar == null || !hVar.mo33612M(cVar)) {
            mo33581u(hVar, 0);
        }
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(mo33573n() ? "dns[query:" : "dns[response:");
        stringBuffer.append(" id=0x");
        stringBuffer.append(Integer.toHexString(mo33565f()));
        if (mo33564e() != 0) {
            stringBuffer.append(", flags=0x");
            stringBuffer.append(Integer.toHexString(mo33564e()));
            if ((mo33564e() & 32768) != 0) {
                stringBuffer.append(":r");
            }
            if ((mo33564e() & 1024) != 0) {
                stringBuffer.append(":aa");
            }
            if ((mo33564e() & 512) != 0) {
                stringBuffer.append(":tc");
            }
        }
        if (mo33569j() > 0) {
            stringBuffer.append(", questions=");
            stringBuffer.append(mo33569j());
        }
        if (mo33567h() > 0) {
            stringBuffer.append(", answers=");
            stringBuffer.append(mo33567h());
        }
        if (mo33568i() > 0) {
            stringBuffer.append(", authorities=");
            stringBuffer.append(mo33568i());
        }
        if (mo33566g() > 0) {
            stringBuffer.append(", additionals=");
            stringBuffer.append(mo33566g());
        }
        if (mo33569j() > 0) {
            stringBuffer.append("\nquestions:");
            for (C10628g append : this.f20321d) {
                stringBuffer.append("\n\t");
                stringBuffer.append(append);
            }
        }
        if (mo33567h() > 0) {
            stringBuffer.append("\nanswers:");
            for (C10637h append2 : this.f20322e) {
                stringBuffer.append("\n\t");
                stringBuffer.append(append2);
            }
        }
        if (mo33568i() > 0) {
            stringBuffer.append("\nauthorities:");
            for (C10637h append3 : this.f20323f) {
                stringBuffer.append("\n\t");
                stringBuffer.append(append3);
            }
        }
        if (mo33566g() > 0) {
            stringBuffer.append("\nadditionals:");
            for (C10637h append4 : this.f20324g) {
                stringBuffer.append("\n\t");
                stringBuffer.append(append4);
            }
        }
        stringBuffer.append("\nnames=");
        stringBuffer.append(this.f20326h);
        stringBuffer.append("]");
        return stringBuffer.toString();
    }

    /* renamed from: u */
    public void mo33581u(C10637h hVar, long j) {
        if (hVar == null) {
            return;
        }
        if (j == 0 || !hVar.mo33532j(j)) {
            C10627a aVar = new C10627a(512, this);
            aVar.mo33593n(hVar, j);
            byte[] byteArray = aVar.toByteArray();
            if (byteArray.length < mo33584x()) {
                this.f20322e.add(hVar);
                this.f20329k.write(byteArray, 0, byteArray.length);
                return;
            }
            throw new IOException("message full");
        }
    }

    /* renamed from: v */
    public void mo33582v(C10637h hVar) {
        C10627a aVar = new C10627a(512, this);
        aVar.mo33593n(hVar, 0);
        byte[] byteArray = aVar.toByteArray();
        if (byteArray.length < mo33584x()) {
            this.f20323f.add(hVar);
            this.f20330l.write(byteArray, 0, byteArray.length);
            return;
        }
        throw new IOException("message full");
    }

    /* renamed from: w */
    public void mo33583w(C10628g gVar) {
        C10627a aVar = new C10627a(512, this);
        aVar.mo33592j(gVar);
        byte[] byteArray = aVar.toByteArray();
        if (byteArray.length < mo33584x()) {
            this.f20321d.add(gVar);
            this.f20328j.write(byteArray, 0, byteArray.length);
            return;
        }
        throw new IOException("message full");
    }

    /* renamed from: x */
    public int mo33584x() {
        return ((((this.f20327i - 12) - this.f20328j.size()) - this.f20329k.size()) - this.f20330l.size()) - this.f20331m.size();
    }

    /* renamed from: y */
    public byte[] mo33585y() {
        long currentTimeMillis = System.currentTimeMillis();
        this.f20326h.clear();
        C10627a aVar = new C10627a(this.f20327i, this);
        aVar.mo33594o(this.f20319b ? 0 : mo33565f());
        aVar.mo33594o(mo33564e());
        aVar.mo33594o(mo33569j());
        aVar.mo33594o(mo33567h());
        aVar.mo33594o(mo33568i());
        aVar.mo33594o(mo33566g());
        for (C10628g j : this.f20321d) {
            aVar.mo33592j(j);
        }
        for (C10637h n : this.f20322e) {
            aVar.mo33593n(n, currentTimeMillis);
        }
        for (C10637h n2 : this.f20323f) {
            aVar.mo33593n(n2, currentTimeMillis);
        }
        for (C10637h n3 : this.f20324g) {
            aVar.mo33593n(n3, currentTimeMillis);
        }
        return aVar.toByteArray();
    }

    /* renamed from: z */
    public int mo33586z() {
        return this.f20327i;
    }
}
