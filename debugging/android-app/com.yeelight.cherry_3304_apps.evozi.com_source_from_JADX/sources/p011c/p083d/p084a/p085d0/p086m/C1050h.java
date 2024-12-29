package p011c.p083d.p084a.p085d0.p086m;

import com.miot.service.common.miotcloud.impl.MiotCloudImpl;
import com.miot.service.connection.wifi.step.SmartConfigStep;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p163g.C10843m;
import p163g.C4406c;
import p163g.C4410e;
import p163g.C4411f;
import p163g.C4416t;

/* renamed from: c.d.a.d0.m.h */
final class C1050h {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final C1048f[] f1467a = {new C1048f(C1048f.f1456h, ""), new C1048f(C1048f.f1453e, "GET"), new C1048f(C1048f.f1453e, "POST"), new C1048f(C1048f.f1454f, (String) MiotCloudImpl.COOKIE_PATH), new C1048f(C1048f.f1454f, "/index.html"), new C1048f(C1048f.f1455g, "http"), new C1048f(C1048f.f1455g, "https"), new C1048f(C1048f.f1452d, "200"), new C1048f(C1048f.f1452d, "204"), new C1048f(C1048f.f1452d, "206"), new C1048f(C1048f.f1452d, "304"), new C1048f(C1048f.f1452d, "400"), new C1048f(C1048f.f1452d, "404"), new C1048f(C1048f.f1452d, "500"), new C1048f("accept-charset", ""), new C1048f("accept-encoding", "gzip, deflate"), new C1048f("accept-language", ""), new C1048f("accept-ranges", ""), new C1048f("accept", ""), new C1048f("access-control-allow-origin", ""), new C1048f("age", ""), new C1048f("allow", ""), new C1048f("authorization", ""), new C1048f("cache-control", ""), new C1048f("content-disposition", ""), new C1048f("content-encoding", ""), new C1048f("content-language", ""), new C1048f("content-length", ""), new C1048f("content-location", ""), new C1048f("content-range", ""), new C1048f("content-type", ""), new C1048f("cookie", ""), new C1048f("date", ""), new C1048f("etag", ""), new C1048f("expect", ""), new C1048f("expires", ""), new C1048f("from", ""), new C1048f("host", ""), new C1048f("if-match", ""), new C1048f("if-modified-since", ""), new C1048f("if-none-match", ""), new C1048f("if-range", ""), new C1048f("if-unmodified-since", ""), new C1048f("last-modified", ""), new C1048f("link", ""), new C1048f("location", ""), new C1048f("max-forwards", ""), new C1048f("proxy-authenticate", ""), new C1048f("proxy-authorization", ""), new C1048f("range", ""), new C1048f("referer", ""), new C1048f("refresh", ""), new C1048f("retry-after", ""), new C1048f("server", ""), new C1048f("set-cookie", ""), new C1048f("strict-transport-security", ""), new C1048f("transfer-encoding", ""), new C1048f("user-agent", ""), new C1048f("vary", ""), new C1048f("via", ""), new C1048f("www-authenticate", "")};
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final Map<C4411f, Integer> f1468b = m2260e();

    /* renamed from: c.d.a.d0.m.h$a */
    static final class C1051a {

        /* renamed from: a */
        private final List<C1048f> f1469a = new ArrayList();

        /* renamed from: b */
        private final C4410e f1470b;

        /* renamed from: c */
        private int f1471c;

        /* renamed from: d */
        private int f1472d;

        /* renamed from: e */
        C1048f[] f1473e;

        /* renamed from: f */
        int f1474f;

        /* renamed from: g */
        int f1475g;

        /* renamed from: h */
        int f1476h;

        C1051a(int i, C4416t tVar) {
            C1048f[] fVarArr = new C1048f[8];
            this.f1473e = fVarArr;
            this.f1474f = fVarArr.length - 1;
            this.f1475g = 0;
            this.f1476h = 0;
            this.f1471c = i;
            this.f1472d = i;
            this.f1470b = C10843m.m27009d(tVar);
        }

        /* renamed from: a */
        private void m2261a() {
            int i = this.f1472d;
            int i2 = this.f1476h;
            if (i >= i2) {
                return;
            }
            if (i == 0) {
                m2262b();
            } else {
                m2264d(i2 - i);
            }
        }

        /* renamed from: b */
        private void m2262b() {
            this.f1469a.clear();
            Arrays.fill(this.f1473e, (Object) null);
            this.f1474f = this.f1473e.length - 1;
            this.f1475g = 0;
            this.f1476h = 0;
        }

        /* renamed from: c */
        private int m2263c(int i) {
            return this.f1474f + 1 + i;
        }

        /* renamed from: d */
        private int m2264d(int i) {
            int i2 = 0;
            if (i > 0) {
                int length = this.f1473e.length;
                while (true) {
                    length--;
                    if (length < this.f1474f || i <= 0) {
                        C1048f[] fVarArr = this.f1473e;
                        int i3 = this.f1474f;
                        System.arraycopy(fVarArr, i3 + 1, fVarArr, i3 + 1 + i2, this.f1475g);
                        this.f1474f += i2;
                    } else {
                        C1048f[] fVarArr2 = this.f1473e;
                        i -= fVarArr2[length].f1461c;
                        this.f1476h -= fVarArr2[length].f1461c;
                        this.f1475g--;
                        i2++;
                    }
                }
                C1048f[] fVarArr3 = this.f1473e;
                int i32 = this.f1474f;
                System.arraycopy(fVarArr3, i32 + 1, fVarArr3, i32 + 1 + i2, this.f1475g);
                this.f1474f += i2;
            }
            return i2;
        }

        /* renamed from: f */
        private C4411f m2265f(int i) {
            return (m2267i(i) ? C1050h.f1467a[i] : this.f1473e[m2263c(i - C1050h.f1467a.length)]).f1459a;
        }

        /* renamed from: h */
        private void m2266h(int i, C1048f fVar) {
            this.f1469a.add(fVar);
            int i2 = fVar.f1461c;
            if (i != -1) {
                i2 -= this.f1473e[m2263c(i)].f1461c;
            }
            int i3 = this.f1472d;
            if (i2 > i3) {
                m2262b();
                return;
            }
            int d = m2264d((this.f1476h + i2) - i3);
            if (i == -1) {
                int i4 = this.f1475g + 1;
                C1048f[] fVarArr = this.f1473e;
                if (i4 > fVarArr.length) {
                    C1048f[] fVarArr2 = new C1048f[(fVarArr.length * 2)];
                    System.arraycopy(fVarArr, 0, fVarArr2, fVarArr.length, fVarArr.length);
                    this.f1474f = this.f1473e.length - 1;
                    this.f1473e = fVarArr2;
                }
                int i5 = this.f1474f;
                this.f1474f = i5 - 1;
                this.f1473e[i5] = fVar;
                this.f1475g++;
            } else {
                this.f1473e[i + m2263c(i) + d] = fVar;
            }
            this.f1476h += i2;
        }

        /* renamed from: i */
        private boolean m2267i(int i) {
            return i >= 0 && i <= C1050h.f1467a.length - 1;
        }

        /* renamed from: j */
        private int m2268j() {
            return this.f1470b.readByte() & 255;
        }

        /* renamed from: m */
        private void m2269m(int i) {
            if (m2267i(i)) {
                this.f1469a.add(C1050h.f1467a[i]);
                return;
            }
            int c = m2263c(i - C1050h.f1467a.length);
            if (c >= 0) {
                C1048f[] fVarArr = this.f1473e;
                if (c <= fVarArr.length - 1) {
                    this.f1469a.add(fVarArr[c]);
                    return;
                }
            }
            throw new IOException("Header index too large " + (i + 1));
        }

        /* renamed from: o */
        private void m2270o(int i) {
            m2266h(-1, new C1048f(m2265f(i), mo9556k()));
        }

        /* renamed from: p */
        private void m2271p() {
            C4411f k = mo9556k();
            C4411f unused = C1050h.m2259d(k);
            m2266h(-1, new C1048f(k, mo9556k()));
        }

        /* renamed from: q */
        private void m2272q(int i) {
            this.f1469a.add(new C1048f(m2265f(i), mo9556k()));
        }

        /* renamed from: r */
        private void m2273r() {
            C4411f k = mo9556k();
            C4411f unused = C1050h.m2259d(k);
            this.f1469a.add(new C1048f(k, mo9556k()));
        }

        /* renamed from: e */
        public List<C1048f> mo9554e() {
            ArrayList arrayList = new ArrayList(this.f1469a);
            this.f1469a.clear();
            return arrayList;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public void mo9555g(int i) {
            this.f1471c = i;
            this.f1472d = i;
            m2261a();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k */
        public C4411f mo9556k() {
            int j = m2268j();
            boolean z = (j & 128) == 128;
            int n = mo9558n(j, SmartConfigStep.MSG_BLE_NOTIFY_TIME_OUT);
            return z ? C4411f.m12869l(C1058j.m2331d().mo9569c(this.f1470b.mo24209H0((long) n))) : this.f1470b.mo24250p((long) n);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: l */
        public void mo9557l() {
            while (!this.f1470b.mo24274x()) {
                byte readByte = this.f1470b.readByte() & 255;
                if (readByte == 128) {
                    throw new IOException("index == 0");
                } else if ((readByte & 128) == 128) {
                    m2269m(mo9558n(readByte, SmartConfigStep.MSG_BLE_NOTIFY_TIME_OUT) - 1);
                } else if (readByte == 64) {
                    m2271p();
                } else if ((readByte & 64) == 64) {
                    m2270o(mo9558n(readByte, 63) - 1);
                } else if ((readByte & 32) == 32) {
                    int n = mo9558n(readByte, 31);
                    this.f1472d = n;
                    if (n < 0 || n > this.f1471c) {
                        throw new IOException("Invalid dynamic table size update " + this.f1472d);
                    }
                    m2261a();
                } else if (readByte == 16 || readByte == 0) {
                    m2273r();
                } else {
                    m2272q(mo9558n(readByte, 15) - 1);
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: n */
        public int mo9558n(int i, int i2) {
            int i3 = i & i2;
            if (i3 < i2) {
                return i3;
            }
            int i4 = 0;
            while (true) {
                int j = m2268j();
                if ((j & 128) == 0) {
                    return i2 + (j << i4);
                }
                i2 += (j & SmartConfigStep.MSG_BLE_NOTIFY_TIME_OUT) << i4;
                i4 += 7;
            }
        }
    }

    /* renamed from: c.d.a.d0.m.h$b */
    static final class C1052b {

        /* renamed from: a */
        private final C4406c f1477a;

        C1052b(C4406c cVar) {
            this.f1477a = cVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo9559a(C4411f fVar) {
            mo9561c(fVar.mo24297q(), SmartConfigStep.MSG_BLE_NOTIFY_TIME_OUT, 0);
            this.f1477a.mo24243k1(fVar);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo9560b(List<C1048f> list) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                C4411f t = list.get(i).f1459a.mo24300t();
                Integer num = (Integer) C1050h.f1468b.get(t);
                if (num != null) {
                    mo9561c(num.intValue() + 1, 15, 0);
                } else {
                    this.f1477a.mo24247n1(0);
                    mo9559a(t);
                }
                mo9559a(list.get(i).f1460b);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo9561c(int i, int i2, int i3) {
            int i4;
            C4406c cVar;
            if (i < i2) {
                cVar = this.f1477a;
                i4 = i | i3;
            } else {
                this.f1477a.mo24247n1(i3 | i2);
                i4 = i - i2;
                while (i4 >= 128) {
                    this.f1477a.mo24247n1(128 | (i4 & SmartConfigStep.MSG_BLE_NOTIFY_TIME_OUT));
                    i4 >>>= 7;
                }
                cVar = this.f1477a;
            }
            cVar.mo24247n1(i4);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static C4411f m2259d(C4411f fVar) {
        int q = fVar.mo24297q();
        int i = 0;
        while (i < q) {
            byte i2 = fVar.mo24290i(i);
            if (i2 < 65 || i2 > 90) {
                i++;
            } else {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: " + fVar.mo24303v());
            }
        }
        return fVar;
    }

    /* renamed from: e */
    private static Map<C4411f, Integer> m2260e() {
        LinkedHashMap linkedHashMap = new LinkedHashMap(f1467a.length);
        int i = 0;
        while (true) {
            C1048f[] fVarArr = f1467a;
            if (i >= fVarArr.length) {
                return Collections.unmodifiableMap(linkedHashMap);
            }
            if (!linkedHashMap.containsKey(fVarArr[i].f1459a)) {
                linkedHashMap.put(f1467a[i].f1459a, Integer.valueOf(i));
            }
            i++;
        }
    }
}
