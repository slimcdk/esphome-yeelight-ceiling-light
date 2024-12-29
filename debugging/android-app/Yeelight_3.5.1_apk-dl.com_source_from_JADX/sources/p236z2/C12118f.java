package p236z2;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.miot.service.common.miotcloud.impl.MiotCloudImpl;
import com.miot.service.connection.wifi.step.SmartConfigStep;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import okio.ByteString;
import okio.C3564c;
import okio.C9838e;
import okio.C9845l;
import okio.C9853r;

/* renamed from: z2.f */
final class C12118f {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final C12117e[] f22249a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final Map<ByteString, Integer> f22250b = m31387e();

    /* renamed from: z2.f$a */
    static final class C12119a {

        /* renamed from: a */
        private final List<C12117e> f22251a = new ArrayList();

        /* renamed from: b */
        private final C9838e f22252b;

        /* renamed from: c */
        private int f22253c;

        /* renamed from: d */
        private int f22254d;

        /* renamed from: e */
        C12117e[] f22255e;

        /* renamed from: f */
        int f22256f;

        /* renamed from: g */
        int f22257g;

        /* renamed from: h */
        int f22258h;

        C12119a(int i, C9853r rVar) {
            C12117e[] eVarArr = new C12117e[8];
            this.f22255e = eVarArr;
            this.f22256f = eVarArr.length - 1;
            this.f22257g = 0;
            this.f22258h = 0;
            this.f22253c = i;
            this.f22254d = i;
            this.f22252b = C9845l.m23738d(rVar);
        }

        /* renamed from: a */
        private void m31388a() {
            int i = this.f22254d;
            int i2 = this.f22258h;
            if (i >= i2) {
                return;
            }
            if (i == 0) {
                m31389b();
            } else {
                m31391d(i2 - i);
            }
        }

        /* renamed from: b */
        private void m31389b() {
            this.f22251a.clear();
            Arrays.fill(this.f22255e, (Object) null);
            this.f22256f = this.f22255e.length - 1;
            this.f22257g = 0;
            this.f22258h = 0;
        }

        /* renamed from: c */
        private int m31390c(int i) {
            return this.f22256f + 1 + i;
        }

        /* renamed from: d */
        private int m31391d(int i) {
            int i2;
            int i3 = 0;
            if (i > 0) {
                int length = this.f22255e.length;
                while (true) {
                    length--;
                    i2 = this.f22256f;
                    if (length < i2 || i <= 0) {
                        C12117e[] eVarArr = this.f22255e;
                        System.arraycopy(eVarArr, i2 + 1, eVarArr, i2 + 1 + i3, this.f22257g);
                        this.f22256f += i3;
                    } else {
                        C12117e[] eVarArr2 = this.f22255e;
                        i -= eVarArr2[length].f22248c;
                        this.f22258h -= eVarArr2[length].f22248c;
                        this.f22257g--;
                        i3++;
                    }
                }
                C12117e[] eVarArr3 = this.f22255e;
                System.arraycopy(eVarArr3, i2 + 1, eVarArr3, i2 + 1 + i3, this.f22257g);
                this.f22256f += i3;
            }
            return i3;
        }

        /* renamed from: f */
        private ByteString m31392f(int i) {
            return (m31394i(i) ? C12118f.f22249a[i] : this.f22255e[m31390c(i - C12118f.f22249a.length)]).f22246a;
        }

        /* renamed from: h */
        private void m31393h(int i, C12117e eVar) {
            this.f22251a.add(eVar);
            int i2 = eVar.f22248c;
            if (i != -1) {
                i2 -= this.f22255e[m31390c(i)].f22248c;
            }
            int i3 = this.f22254d;
            if (i2 > i3) {
                m31389b();
                return;
            }
            int d = m31391d((this.f22258h + i2) - i3);
            if (i == -1) {
                int i4 = this.f22257g + 1;
                C12117e[] eVarArr = this.f22255e;
                if (i4 > eVarArr.length) {
                    C12117e[] eVarArr2 = new C12117e[(eVarArr.length * 2)];
                    System.arraycopy(eVarArr, 0, eVarArr2, eVarArr.length, eVarArr.length);
                    this.f22256f = this.f22255e.length - 1;
                    this.f22255e = eVarArr2;
                }
                int i5 = this.f22256f;
                this.f22256f = i5 - 1;
                this.f22255e[i5] = eVar;
                this.f22257g++;
            } else {
                this.f22255e[i + m31390c(i) + d] = eVar;
            }
            this.f22258h += i2;
        }

        /* renamed from: i */
        private boolean m31394i(int i) {
            return i >= 0 && i <= C12118f.f22249a.length - 1;
        }

        /* renamed from: j */
        private int m31395j() {
            return this.f22252b.readByte() & 255;
        }

        /* renamed from: m */
        private void m31396m(int i) {
            if (m31394i(i)) {
                this.f22251a.add(C12118f.f22249a[i]);
                return;
            }
            int c = m31390c(i - C12118f.f22249a.length);
            if (c >= 0) {
                C12117e[] eVarArr = this.f22255e;
                if (c <= eVarArr.length - 1) {
                    this.f22251a.add(eVarArr[c]);
                    return;
                }
            }
            throw new IOException("Header index too large " + (i + 1));
        }

        /* renamed from: o */
        private void m31397o(int i) {
            m31393h(-1, new C12117e(m31392f(i), mo42875k()));
        }

        /* renamed from: p */
        private void m31398p() {
            m31393h(-1, new C12117e(C12118f.m31386d(mo42875k()), mo42875k()));
        }

        /* renamed from: q */
        private void m31399q(int i) {
            this.f22251a.add(new C12117e(m31392f(i), mo42875k()));
        }

        /* renamed from: r */
        private void m31400r() {
            this.f22251a.add(new C12117e(C12118f.m31386d(mo42875k()), mo42875k()));
        }

        /* renamed from: e */
        public List<C12117e> mo42873e() {
            ArrayList arrayList = new ArrayList(this.f22251a);
            this.f22251a.clear();
            return arrayList;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public void mo42874g(int i) {
            this.f22253c = i;
            this.f22254d = i;
            m31388a();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k */
        public ByteString mo42875k() {
            int j = m31395j();
            boolean z = (j & 128) == 128;
            int n = mo42877n(j, SmartConfigStep.MSG_BLE_NOTIFY_TIME_OUT);
            return z ? ByteString.m9966of(C12126h.m31458d().mo42888c(this.f22252b.mo24728K0((long) n))) : this.f22252b.mo24789w((long) n);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: l */
        public void mo42876l() {
            while (!this.f22252b.mo24734Q()) {
                byte readByte = this.f22252b.readByte() & 255;
                if (readByte == 128) {
                    throw new IOException("index == 0");
                } else if ((readByte & 128) == 128) {
                    m31396m(mo42877n(readByte, SmartConfigStep.MSG_BLE_NOTIFY_TIME_OUT) - 1);
                } else if (readByte == 64) {
                    m31398p();
                } else if ((readByte & 64) == 64) {
                    m31397o(mo42877n(readByte, 63) - 1);
                } else if ((readByte & 32) == 32) {
                    int n = mo42877n(readByte, 31);
                    this.f22254d = n;
                    if (n < 0 || n > this.f22253c) {
                        throw new IOException("Invalid dynamic table size update " + this.f22254d);
                    }
                    m31388a();
                } else if (readByte == 16 || readByte == 0) {
                    m31400r();
                } else {
                    m31399q(mo42877n(readByte, 15) - 1);
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: n */
        public int mo42877n(int i, int i2) {
            int i3 = i & i2;
            if (i3 < i2) {
                return i3;
            }
            int i4 = 0;
            while (true) {
                int j = m31395j();
                if ((j & 128) == 0) {
                    return i2 + (j << i4);
                }
                i2 += (j & SmartConfigStep.MSG_BLE_NOTIFY_TIME_OUT) << i4;
                i4 += 7;
            }
        }
    }

    /* renamed from: z2.f$b */
    static final class C12120b {

        /* renamed from: a */
        private final C3564c f22259a;

        C12120b(C3564c cVar) {
            this.f22259a = cVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo42878a(ByteString byteString) {
            mo42880c(byteString.size(), SmartConfigStep.MSG_BLE_NOTIFY_TIME_OUT, 0);
            this.f22259a.mo24733P0(byteString);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo42879b(List<C12117e> list) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ByteString asciiLowercase = list.get(i).f22246a.toAsciiLowercase();
                Integer num = (Integer) C12118f.f22250b.get(asciiLowercase);
                if (num != null) {
                    mo42880c(num.intValue() + 1, 15, 0);
                } else {
                    this.f22259a.mo24736R(0);
                    mo42878a(asciiLowercase);
                }
                mo42878a(list.get(i).f22247b);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo42880c(int i, int i2, int i3) {
            int i4;
            C3564c cVar;
            if (i < i2) {
                cVar = this.f22259a;
                i4 = i | i3;
            } else {
                this.f22259a.mo24736R(i3 | i2);
                i4 = i - i2;
                while (i4 >= 128) {
                    this.f22259a.mo24736R(128 | (i4 & SmartConfigStep.MSG_BLE_NOTIFY_TIME_OUT));
                    i4 >>>= 7;
                }
                cVar = this.f22259a;
            }
            cVar.mo24736R(i4);
        }
    }

    static {
        ByteString byteString = C12117e.f22240e;
        ByteString byteString2 = C12117e.f22241f;
        ByteString byteString3 = C12117e.f22242g;
        ByteString byteString4 = C12117e.f22239d;
        f22249a = new C12117e[]{new C12117e(C12117e.f22243h, ""), new C12117e(byteString, "GET"), new C12117e(byteString, "POST"), new C12117e(byteString2, (String) MiotCloudImpl.COOKIE_PATH), new C12117e(byteString2, "/index.html"), new C12117e(byteString3, "http"), new C12117e(byteString3, "https"), new C12117e(byteString4, "200"), new C12117e(byteString4, "204"), new C12117e(byteString4, "206"), new C12117e(byteString4, "304"), new C12117e(byteString4, "400"), new C12117e(byteString4, "404"), new C12117e(byteString4, "500"), new C12117e("accept-charset", ""), new C12117e("accept-encoding", "gzip, deflate"), new C12117e("accept-language", ""), new C12117e("accept-ranges", ""), new C12117e("accept", ""), new C12117e("access-control-allow-origin", ""), new C12117e("age", ""), new C12117e("allow", ""), new C12117e("authorization", ""), new C12117e("cache-control", ""), new C12117e("content-disposition", ""), new C12117e("content-encoding", ""), new C12117e("content-language", ""), new C12117e("content-length", ""), new C12117e("content-location", ""), new C12117e("content-range", ""), new C12117e("content-type", ""), new C12117e("cookie", ""), new C12117e("date", ""), new C12117e("etag", ""), new C12117e("expect", ""), new C12117e("expires", ""), new C12117e((String) TypedValues.TransitionType.S_FROM, ""), new C12117e("host", ""), new C12117e("if-match", ""), new C12117e("if-modified-since", ""), new C12117e("if-none-match", ""), new C12117e("if-range", ""), new C12117e("if-unmodified-since", ""), new C12117e("last-modified", ""), new C12117e("link", ""), new C12117e("location", ""), new C12117e("max-forwards", ""), new C12117e("proxy-authenticate", ""), new C12117e("proxy-authorization", ""), new C12117e("range", ""), new C12117e("referer", ""), new C12117e("refresh", ""), new C12117e("retry-after", ""), new C12117e("server", ""), new C12117e("set-cookie", ""), new C12117e("strict-transport-security", ""), new C12117e("transfer-encoding", ""), new C12117e("user-agent", ""), new C12117e("vary", ""), new C12117e("via", ""), new C12117e("www-authenticate", "")};
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static ByteString m31386d(ByteString byteString) {
        int size = byteString.size();
        int i = 0;
        while (i < size) {
            byte b = byteString.getByte(i);
            if (b < 65 || b > 90) {
                i++;
            } else {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: " + byteString.utf8());
            }
        }
        return byteString;
    }

    /* renamed from: e */
    private static Map<ByteString, Integer> m31387e() {
        LinkedHashMap linkedHashMap = new LinkedHashMap(f22249a.length);
        int i = 0;
        while (true) {
            C12117e[] eVarArr = f22249a;
            if (i >= eVarArr.length) {
                return Collections.unmodifiableMap(linkedHashMap);
            }
            if (!linkedHashMap.containsKey(eVarArr[i].f22246a)) {
                linkedHashMap.put(eVarArr[i].f22246a, Integer.valueOf(i));
            }
            i++;
        }
    }
}
