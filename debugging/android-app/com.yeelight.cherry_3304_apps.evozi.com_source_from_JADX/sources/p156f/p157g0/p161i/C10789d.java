package p156f.p157g0.p161i;

import androidx.appcompat.widget.ActivityChooserView;
import com.miot.service.common.miotcloud.impl.MiotCloudImpl;
import com.miot.service.connection.wifi.step.SmartConfigStep;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p156f.p157g0.C4345c;
import p163g.C10843m;
import p163g.C4406c;
import p163g.C4410e;
import p163g.C4411f;
import p163g.C4416t;

/* renamed from: f.g0.i.d */
final class C10789d {

    /* renamed from: a */
    static final C10787c[] f20739a = {new C10787c(C10787c.f20735i, ""), new C10787c(C10787c.f20732f, "GET"), new C10787c(C10787c.f20732f, "POST"), new C10787c(C10787c.f20733g, (String) MiotCloudImpl.COOKIE_PATH), new C10787c(C10787c.f20733g, "/index.html"), new C10787c(C10787c.f20734h, "http"), new C10787c(C10787c.f20734h, "https"), new C10787c(C10787c.f20731e, "200"), new C10787c(C10787c.f20731e, "204"), new C10787c(C10787c.f20731e, "206"), new C10787c(C10787c.f20731e, "304"), new C10787c(C10787c.f20731e, "400"), new C10787c(C10787c.f20731e, "404"), new C10787c(C10787c.f20731e, "500"), new C10787c("accept-charset", ""), new C10787c("accept-encoding", "gzip, deflate"), new C10787c("accept-language", ""), new C10787c("accept-ranges", ""), new C10787c("accept", ""), new C10787c("access-control-allow-origin", ""), new C10787c("age", ""), new C10787c("allow", ""), new C10787c("authorization", ""), new C10787c("cache-control", ""), new C10787c("content-disposition", ""), new C10787c("content-encoding", ""), new C10787c("content-language", ""), new C10787c("content-length", ""), new C10787c("content-location", ""), new C10787c("content-range", ""), new C10787c("content-type", ""), new C10787c("cookie", ""), new C10787c("date", ""), new C10787c("etag", ""), new C10787c("expect", ""), new C10787c("expires", ""), new C10787c("from", ""), new C10787c("host", ""), new C10787c("if-match", ""), new C10787c("if-modified-since", ""), new C10787c("if-none-match", ""), new C10787c("if-range", ""), new C10787c("if-unmodified-since", ""), new C10787c("last-modified", ""), new C10787c("link", ""), new C10787c("location", ""), new C10787c("max-forwards", ""), new C10787c("proxy-authenticate", ""), new C10787c("proxy-authorization", ""), new C10787c("range", ""), new C10787c("referer", ""), new C10787c("refresh", ""), new C10787c("retry-after", ""), new C10787c("server", ""), new C10787c("set-cookie", ""), new C10787c("strict-transport-security", ""), new C10787c("transfer-encoding", ""), new C10787c("user-agent", ""), new C10787c("vary", ""), new C10787c("via", ""), new C10787c("www-authenticate", "")};

    /* renamed from: b */
    static final Map<C4411f, Integer> f20740b = m26759b();

    /* renamed from: f.g0.i.d$a */
    static final class C10790a {

        /* renamed from: a */
        private final List<C10787c> f20741a;

        /* renamed from: b */
        private final C4410e f20742b;

        /* renamed from: c */
        private final int f20743c;

        /* renamed from: d */
        private int f20744d;

        /* renamed from: e */
        C10787c[] f20745e;

        /* renamed from: f */
        int f20746f;

        /* renamed from: g */
        int f20747g;

        /* renamed from: h */
        int f20748h;

        C10790a(int i, int i2, C4416t tVar) {
            this.f20741a = new ArrayList();
            C10787c[] cVarArr = new C10787c[8];
            this.f20745e = cVarArr;
            this.f20746f = cVarArr.length - 1;
            this.f20747g = 0;
            this.f20748h = 0;
            this.f20743c = i;
            this.f20744d = i2;
            this.f20742b = C10843m.m27009d(tVar);
        }

        C10790a(int i, C4416t tVar) {
            this(i, i, tVar);
        }

        /* renamed from: a */
        private void m26760a() {
            int i = this.f20744d;
            int i2 = this.f20748h;
            if (i >= i2) {
                return;
            }
            if (i == 0) {
                m26761b();
            } else {
                m26763d(i2 - i);
            }
        }

        /* renamed from: b */
        private void m26761b() {
            Arrays.fill(this.f20745e, (Object) null);
            this.f20746f = this.f20745e.length - 1;
            this.f20747g = 0;
            this.f20748h = 0;
        }

        /* renamed from: c */
        private int m26762c(int i) {
            return this.f20746f + 1 + i;
        }

        /* renamed from: d */
        private int m26763d(int i) {
            int i2 = 0;
            if (i > 0) {
                int length = this.f20745e.length;
                while (true) {
                    length--;
                    if (length < this.f20746f || i <= 0) {
                        C10787c[] cVarArr = this.f20745e;
                        int i3 = this.f20746f;
                        System.arraycopy(cVarArr, i3 + 1, cVarArr, i3 + 1 + i2, this.f20747g);
                        this.f20746f += i2;
                    } else {
                        C10787c[] cVarArr2 = this.f20745e;
                        i -= cVarArr2[length].f20738c;
                        this.f20748h -= cVarArr2[length].f20738c;
                        this.f20747g--;
                        i2++;
                    }
                }
                C10787c[] cVarArr3 = this.f20745e;
                int i32 = this.f20746f;
                System.arraycopy(cVarArr3, i32 + 1, cVarArr3, i32 + 1 + i2, this.f20747g);
                this.f20746f += i2;
            }
            return i2;
        }

        /* renamed from: f */
        private C4411f m26764f(int i) {
            C10787c cVar;
            if (m26766h(i)) {
                cVar = C10789d.f20739a[i];
            } else {
                int c = m26762c(i - C10789d.f20739a.length);
                if (c >= 0) {
                    C10787c[] cVarArr = this.f20745e;
                    if (c < cVarArr.length) {
                        cVar = cVarArr[c];
                    }
                }
                throw new IOException("Header index too large " + (i + 1));
            }
            return cVar.f20736a;
        }

        /* renamed from: g */
        private void m26765g(int i, C10787c cVar) {
            this.f20741a.add(cVar);
            int i2 = cVar.f20738c;
            if (i != -1) {
                i2 -= this.f20745e[m26762c(i)].f20738c;
            }
            int i3 = this.f20744d;
            if (i2 > i3) {
                m26761b();
                return;
            }
            int d = m26763d((this.f20748h + i2) - i3);
            if (i == -1) {
                int i4 = this.f20747g + 1;
                C10787c[] cVarArr = this.f20745e;
                if (i4 > cVarArr.length) {
                    C10787c[] cVarArr2 = new C10787c[(cVarArr.length * 2)];
                    System.arraycopy(cVarArr, 0, cVarArr2, cVarArr.length, cVarArr.length);
                    this.f20746f = this.f20745e.length - 1;
                    this.f20745e = cVarArr2;
                }
                int i5 = this.f20746f;
                this.f20746f = i5 - 1;
                this.f20745e[i5] = cVar;
                this.f20747g++;
            } else {
                this.f20745e[i + m26762c(i) + d] = cVar;
            }
            this.f20748h += i2;
        }

        /* renamed from: h */
        private boolean m26766h(int i) {
            return i >= 0 && i <= C10789d.f20739a.length - 1;
        }

        /* renamed from: i */
        private int m26767i() {
            return this.f20742b.readByte() & 255;
        }

        /* renamed from: l */
        private void m26768l(int i) {
            if (m26766h(i)) {
                this.f20741a.add(C10789d.f20739a[i]);
                return;
            }
            int c = m26762c(i - C10789d.f20739a.length);
            if (c >= 0) {
                C10787c[] cVarArr = this.f20745e;
                if (c < cVarArr.length) {
                    this.f20741a.add(cVarArr[c]);
                    return;
                }
            }
            throw new IOException("Header index too large " + (i + 1));
        }

        /* renamed from: n */
        private void m26769n(int i) {
            m26765g(-1, new C10787c(m26764f(i), mo34052j()));
        }

        /* renamed from: o */
        private void m26770o() {
            C4411f j = mo34052j();
            C10789d.m26758a(j);
            m26765g(-1, new C10787c(j, mo34052j()));
        }

        /* renamed from: p */
        private void m26771p(int i) {
            this.f20741a.add(new C10787c(m26764f(i), mo34052j()));
        }

        /* renamed from: q */
        private void m26772q() {
            C4411f j = mo34052j();
            C10789d.m26758a(j);
            this.f20741a.add(new C10787c(j, mo34052j()));
        }

        /* renamed from: e */
        public List<C10787c> mo34051e() {
            ArrayList arrayList = new ArrayList(this.f20741a);
            this.f20741a.clear();
            return arrayList;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public C4411f mo34052j() {
            int i = m26767i();
            boolean z = (i & 128) == 128;
            int m = mo34054m(i, SmartConfigStep.MSG_BLE_NOTIFY_TIME_OUT);
            return z ? C4411f.m12869l(C10812k.m26898f().mo34114c(this.f20742b.mo24209H0((long) m))) : this.f20742b.mo24250p((long) m);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k */
        public void mo34053k() {
            while (!this.f20742b.mo24274x()) {
                byte readByte = this.f20742b.readByte() & 255;
                if (readByte == 128) {
                    throw new IOException("index == 0");
                } else if ((readByte & 128) == 128) {
                    m26768l(mo34054m(readByte, SmartConfigStep.MSG_BLE_NOTIFY_TIME_OUT) - 1);
                } else if (readByte == 64) {
                    m26770o();
                } else if ((readByte & 64) == 64) {
                    m26769n(mo34054m(readByte, 63) - 1);
                } else if ((readByte & 32) == 32) {
                    int m = mo34054m(readByte, 31);
                    this.f20744d = m;
                    if (m < 0 || m > this.f20743c) {
                        throw new IOException("Invalid dynamic table size update " + this.f20744d);
                    }
                    m26760a();
                } else if (readByte == 16 || readByte == 0) {
                    m26772q();
                } else {
                    m26771p(mo34054m(readByte, 15) - 1);
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: m */
        public int mo34054m(int i, int i2) {
            int i3 = i & i2;
            if (i3 < i2) {
                return i3;
            }
            int i4 = 0;
            while (true) {
                int i5 = m26767i();
                if ((i5 & 128) == 0) {
                    return i2 + (i5 << i4);
                }
                i2 += (i5 & SmartConfigStep.MSG_BLE_NOTIFY_TIME_OUT) << i4;
                i4 += 7;
            }
        }
    }

    /* renamed from: f.g0.i.d$b */
    static final class C10791b {

        /* renamed from: a */
        private final C4406c f20749a;

        /* renamed from: b */
        private final boolean f20750b;

        /* renamed from: c */
        private int f20751c;

        /* renamed from: d */
        private boolean f20752d;

        /* renamed from: e */
        int f20753e;

        /* renamed from: f */
        C10787c[] f20754f;

        /* renamed from: g */
        int f20755g;

        /* renamed from: h */
        int f20756h;

        /* renamed from: i */
        int f20757i;

        C10791b(int i, boolean z, C4406c cVar) {
            this.f20751c = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
            C10787c[] cVarArr = new C10787c[8];
            this.f20754f = cVarArr;
            this.f20755g = cVarArr.length - 1;
            this.f20756h = 0;
            this.f20757i = 0;
            this.f20753e = i;
            this.f20750b = z;
            this.f20749a = cVar;
        }

        C10791b(C4406c cVar) {
            this(4096, true, cVar);
        }

        /* renamed from: a */
        private void m26777a() {
            int i = this.f20753e;
            int i2 = this.f20757i;
            if (i >= i2) {
                return;
            }
            if (i == 0) {
                m26778b();
            } else {
                m26779c(i2 - i);
            }
        }

        /* renamed from: b */
        private void m26778b() {
            Arrays.fill(this.f20754f, (Object) null);
            this.f20755g = this.f20754f.length - 1;
            this.f20756h = 0;
            this.f20757i = 0;
        }

        /* renamed from: c */
        private int m26779c(int i) {
            int i2 = 0;
            if (i > 0) {
                int length = this.f20754f.length;
                while (true) {
                    length--;
                    if (length < this.f20755g || i <= 0) {
                        C10787c[] cVarArr = this.f20754f;
                        int i3 = this.f20755g;
                        System.arraycopy(cVarArr, i3 + 1, cVarArr, i3 + 1 + i2, this.f20756h);
                        C10787c[] cVarArr2 = this.f20754f;
                        int i4 = this.f20755g;
                        Arrays.fill(cVarArr2, i4 + 1, i4 + 1 + i2, (Object) null);
                        this.f20755g += i2;
                    } else {
                        C10787c[] cVarArr3 = this.f20754f;
                        i -= cVarArr3[length].f20738c;
                        this.f20757i -= cVarArr3[length].f20738c;
                        this.f20756h--;
                        i2++;
                    }
                }
                C10787c[] cVarArr4 = this.f20754f;
                int i32 = this.f20755g;
                System.arraycopy(cVarArr4, i32 + 1, cVarArr4, i32 + 1 + i2, this.f20756h);
                C10787c[] cVarArr22 = this.f20754f;
                int i42 = this.f20755g;
                Arrays.fill(cVarArr22, i42 + 1, i42 + 1 + i2, (Object) null);
                this.f20755g += i2;
            }
            return i2;
        }

        /* renamed from: d */
        private void m26780d(C10787c cVar) {
            int i = cVar.f20738c;
            int i2 = this.f20753e;
            if (i > i2) {
                m26778b();
                return;
            }
            m26779c((this.f20757i + i) - i2);
            int i3 = this.f20756h + 1;
            C10787c[] cVarArr = this.f20754f;
            if (i3 > cVarArr.length) {
                C10787c[] cVarArr2 = new C10787c[(cVarArr.length * 2)];
                System.arraycopy(cVarArr, 0, cVarArr2, cVarArr.length, cVarArr.length);
                this.f20755g = this.f20754f.length - 1;
                this.f20754f = cVarArr2;
            }
            int i4 = this.f20755g;
            this.f20755g = i4 - 1;
            this.f20754f[i4] = cVar;
            this.f20756h++;
            this.f20757i += i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo34055e(int i) {
            int min = Math.min(i, 16384);
            int i2 = this.f20753e;
            if (i2 != min) {
                if (min < i2) {
                    this.f20751c = Math.min(this.f20751c, min);
                }
                this.f20752d = true;
                this.f20753e = min;
                m26777a();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public void mo34056f(C4411f fVar) {
            int i;
            int i2;
            if (!this.f20750b || C10812k.m26898f().mo34116e(fVar) >= fVar.mo24297q()) {
                i2 = fVar.mo24297q();
                i = 0;
            } else {
                C4406c cVar = new C4406c();
                C10812k.m26898f().mo34115d(fVar, cVar);
                fVar = cVar.mo24207F();
                i2 = fVar.mo24297q();
                i = 128;
            }
            mo34058h(i2, SmartConfigStep.MSG_BLE_NOTIFY_TIME_OUT, i);
            this.f20749a.mo24243k1(fVar);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public void mo34057g(List<C10787c> list) {
            int i;
            int i2;
            if (this.f20752d) {
                int i3 = this.f20751c;
                if (i3 < this.f20753e) {
                    mo34058h(i3, 31, 32);
                }
                this.f20752d = false;
                this.f20751c = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
                mo34058h(this.f20753e, 31, 32);
            }
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                C10787c cVar = list.get(i4);
                C4411f t = cVar.f20736a.mo24300t();
                C4411f fVar = cVar.f20737b;
                Integer num = C10789d.f20740b.get(t);
                if (num != null) {
                    i2 = num.intValue() + 1;
                    if (i2 > 1 && i2 < 8) {
                        if (C4345c.m12370q(C10789d.f20739a[i2 - 1].f20737b, fVar)) {
                            i = i2;
                        } else if (C4345c.m12370q(C10789d.f20739a[i2].f20737b, fVar)) {
                            i = i2;
                            i2++;
                        }
                    }
                    i = i2;
                    i2 = -1;
                } else {
                    i2 = -1;
                    i = -1;
                }
                if (i2 == -1) {
                    int i5 = this.f20755g + 1;
                    int length = this.f20754f.length;
                    while (true) {
                        if (i5 >= length) {
                            break;
                        }
                        if (C4345c.m12370q(this.f20754f[i5].f20736a, t)) {
                            if (C4345c.m12370q(this.f20754f[i5].f20737b, fVar)) {
                                i2 = C10789d.f20739a.length + (i5 - this.f20755g);
                                break;
                            } else if (i == -1) {
                                i = (i5 - this.f20755g) + C10789d.f20739a.length;
                            }
                        }
                        i5++;
                    }
                }
                if (i2 != -1) {
                    mo34058h(i2, SmartConfigStep.MSG_BLE_NOTIFY_TIME_OUT, 128);
                } else {
                    if (i == -1) {
                        this.f20749a.mo24247n1(64);
                        mo34056f(t);
                    } else if (!t.mo24298r(C10787c.f20730d) || C10787c.f20735i.equals(t)) {
                        mo34058h(i, 63, 64);
                    } else {
                        mo34058h(i, 15, 0);
                        mo34056f(fVar);
                    }
                    mo34056f(fVar);
                    m26780d(cVar);
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public void mo34058h(int i, int i2, int i3) {
            int i4;
            C4406c cVar;
            if (i < i2) {
                cVar = this.f20749a;
                i4 = i | i3;
            } else {
                this.f20749a.mo24247n1(i3 | i2);
                i4 = i - i2;
                while (i4 >= 128) {
                    this.f20749a.mo24247n1(128 | (i4 & SmartConfigStep.MSG_BLE_NOTIFY_TIME_OUT));
                    i4 >>>= 7;
                }
                cVar = this.f20749a;
            }
            cVar.mo24247n1(i4);
        }
    }

    /* renamed from: a */
    static C4411f m26758a(C4411f fVar) {
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

    /* renamed from: b */
    private static Map<C4411f, Integer> m26759b() {
        LinkedHashMap linkedHashMap = new LinkedHashMap(f20739a.length);
        int i = 0;
        while (true) {
            C10787c[] cVarArr = f20739a;
            if (i >= cVarArr.length) {
                return Collections.unmodifiableMap(linkedHashMap);
            }
            if (!linkedHashMap.containsKey(cVarArr[i].f20736a)) {
                linkedHashMap.put(f20739a[i].f20736a, Integer.valueOf(i));
            }
            i++;
        }
    }
}
