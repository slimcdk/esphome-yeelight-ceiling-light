package okhttp3.internal.http2;

import androidx.appcompat.widget.ActivityChooserView;
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
import p056k5.C3300c;

/* renamed from: okhttp3.internal.http2.b */
final class C9804b {

    /* renamed from: a */
    static final C9802a[] f17702a;

    /* renamed from: b */
    static final Map<ByteString, Integer> f17703b = m23510b();

    /* renamed from: okhttp3.internal.http2.b$a */
    static final class C9805a {

        /* renamed from: a */
        private final List<C9802a> f17704a;

        /* renamed from: b */
        private final C9838e f17705b;

        /* renamed from: c */
        private final int f17706c;

        /* renamed from: d */
        private int f17707d;

        /* renamed from: e */
        C9802a[] f17708e;

        /* renamed from: f */
        int f17709f;

        /* renamed from: g */
        int f17710g;

        /* renamed from: h */
        int f17711h;

        C9805a(int i, int i2, C9853r rVar) {
            this.f17704a = new ArrayList();
            C9802a[] aVarArr = new C9802a[8];
            this.f17708e = aVarArr;
            this.f17709f = aVarArr.length - 1;
            this.f17710g = 0;
            this.f17711h = 0;
            this.f17706c = i;
            this.f17707d = i2;
            this.f17705b = C9845l.m23738d(rVar);
        }

        C9805a(int i, C9853r rVar) {
            this(i, i, rVar);
        }

        /* renamed from: a */
        private void m23511a() {
            int i = this.f17707d;
            int i2 = this.f17711h;
            if (i >= i2) {
                return;
            }
            if (i == 0) {
                m23512b();
            } else {
                m23514d(i2 - i);
            }
        }

        /* renamed from: b */
        private void m23512b() {
            Arrays.fill(this.f17708e, (Object) null);
            this.f17709f = this.f17708e.length - 1;
            this.f17710g = 0;
            this.f17711h = 0;
        }

        /* renamed from: c */
        private int m23513c(int i) {
            return this.f17709f + 1 + i;
        }

        /* renamed from: d */
        private int m23514d(int i) {
            int i2;
            int i3 = 0;
            if (i > 0) {
                int length = this.f17708e.length;
                while (true) {
                    length--;
                    i2 = this.f17709f;
                    if (length < i2 || i <= 0) {
                        C9802a[] aVarArr = this.f17708e;
                        System.arraycopy(aVarArr, i2 + 1, aVarArr, i2 + 1 + i3, this.f17710g);
                        this.f17709f += i3;
                    } else {
                        C9802a[] aVarArr2 = this.f17708e;
                        i -= aVarArr2[length].f17701c;
                        this.f17711h -= aVarArr2[length].f17701c;
                        this.f17710g--;
                        i3++;
                    }
                }
                C9802a[] aVarArr3 = this.f17708e;
                System.arraycopy(aVarArr3, i2 + 1, aVarArr3, i2 + 1 + i3, this.f17710g);
                this.f17709f += i3;
            }
            return i3;
        }

        /* renamed from: f */
        private ByteString m23515f(int i) {
            C9802a aVar;
            if (m23517h(i)) {
                aVar = C9804b.f17702a[i];
            } else {
                int c = m23513c(i - C9804b.f17702a.length);
                if (c >= 0) {
                    C9802a[] aVarArr = this.f17708e;
                    if (c < aVarArr.length) {
                        aVar = aVarArr[c];
                    }
                }
                throw new IOException("Header index too large " + (i + 1));
            }
            return aVar.f17699a;
        }

        /* renamed from: g */
        private void m23516g(int i, C9802a aVar) {
            this.f17704a.add(aVar);
            int i2 = aVar.f17701c;
            if (i != -1) {
                i2 -= this.f17708e[m23513c(i)].f17701c;
            }
            int i3 = this.f17707d;
            if (i2 > i3) {
                m23512b();
                return;
            }
            int d = m23514d((this.f17711h + i2) - i3);
            if (i == -1) {
                int i4 = this.f17710g + 1;
                C9802a[] aVarArr = this.f17708e;
                if (i4 > aVarArr.length) {
                    C9802a[] aVarArr2 = new C9802a[(aVarArr.length * 2)];
                    System.arraycopy(aVarArr, 0, aVarArr2, aVarArr.length, aVarArr.length);
                    this.f17709f = this.f17708e.length - 1;
                    this.f17708e = aVarArr2;
                }
                int i5 = this.f17709f;
                this.f17709f = i5 - 1;
                this.f17708e[i5] = aVar;
                this.f17710g++;
            } else {
                this.f17708e[i + m23513c(i) + d] = aVar;
            }
            this.f17711h += i2;
        }

        /* renamed from: h */
        private boolean m23517h(int i) {
            return i >= 0 && i <= C9804b.f17702a.length - 1;
        }

        /* renamed from: i */
        private int m23518i() {
            return this.f17705b.readByte() & 255;
        }

        /* renamed from: l */
        private void m23519l(int i) {
            if (m23517h(i)) {
                this.f17704a.add(C9804b.f17702a[i]);
                return;
            }
            int c = m23513c(i - C9804b.f17702a.length);
            if (c >= 0) {
                C9802a[] aVarArr = this.f17708e;
                if (c < aVarArr.length) {
                    this.f17704a.add(aVarArr[c]);
                    return;
                }
            }
            throw new IOException("Header index too large " + (i + 1));
        }

        /* renamed from: n */
        private void m23520n(int i) {
            m23516g(-1, new C9802a(m23515f(i), mo39001j()));
        }

        /* renamed from: o */
        private void m23521o() {
            m23516g(-1, new C9802a(C9804b.m23509a(mo39001j()), mo39001j()));
        }

        /* renamed from: p */
        private void m23522p(int i) {
            this.f17704a.add(new C9802a(m23515f(i), mo39001j()));
        }

        /* renamed from: q */
        private void m23523q() {
            this.f17704a.add(new C9802a(C9804b.m23509a(mo39001j()), mo39001j()));
        }

        /* renamed from: e */
        public List<C9802a> mo39000e() {
            ArrayList arrayList = new ArrayList(this.f17704a);
            this.f17704a.clear();
            return arrayList;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public ByteString mo39001j() {
            int i = m23518i();
            boolean z = (i & 128) == 128;
            int m = mo39003m(i, SmartConfigStep.MSG_BLE_NOTIFY_TIME_OUT);
            return z ? ByteString.m9966of(C9827h.m23642f().mo39063c(this.f17705b.mo24728K0((long) m))) : this.f17705b.mo24789w((long) m);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k */
        public void mo39002k() {
            while (!this.f17705b.mo24734Q()) {
                byte readByte = this.f17705b.readByte() & 255;
                if (readByte == 128) {
                    throw new IOException("index == 0");
                } else if ((readByte & 128) == 128) {
                    m23519l(mo39003m(readByte, SmartConfigStep.MSG_BLE_NOTIFY_TIME_OUT) - 1);
                } else if (readByte == 64) {
                    m23521o();
                } else if ((readByte & 64) == 64) {
                    m23520n(mo39003m(readByte, 63) - 1);
                } else if ((readByte & 32) == 32) {
                    int m = mo39003m(readByte, 31);
                    this.f17707d = m;
                    if (m < 0 || m > this.f17706c) {
                        throw new IOException("Invalid dynamic table size update " + this.f17707d);
                    }
                    m23511a();
                } else if (readByte == 16 || readByte == 0) {
                    m23523q();
                } else {
                    m23522p(mo39003m(readByte, 15) - 1);
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: m */
        public int mo39003m(int i, int i2) {
            int i3 = i & i2;
            if (i3 < i2) {
                return i3;
            }
            int i4 = 0;
            while (true) {
                int i5 = m23518i();
                if ((i5 & 128) == 0) {
                    return i2 + (i5 << i4);
                }
                i2 += (i5 & SmartConfigStep.MSG_BLE_NOTIFY_TIME_OUT) << i4;
                i4 += 7;
            }
        }
    }

    /* renamed from: okhttp3.internal.http2.b$b */
    static final class C9806b {

        /* renamed from: a */
        private final C3564c f17712a;

        /* renamed from: b */
        private final boolean f17713b;

        /* renamed from: c */
        private int f17714c;

        /* renamed from: d */
        private boolean f17715d;

        /* renamed from: e */
        int f17716e;

        /* renamed from: f */
        C9802a[] f17717f;

        /* renamed from: g */
        int f17718g;

        /* renamed from: h */
        int f17719h;

        /* renamed from: i */
        int f17720i;

        C9806b(int i, boolean z, C3564c cVar) {
            this.f17714c = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
            C9802a[] aVarArr = new C9802a[8];
            this.f17717f = aVarArr;
            this.f17718g = aVarArr.length - 1;
            this.f17719h = 0;
            this.f17720i = 0;
            this.f17716e = i;
            this.f17713b = z;
            this.f17712a = cVar;
        }

        C9806b(C3564c cVar) {
            this(4096, true, cVar);
        }

        /* renamed from: a */
        private void m23528a() {
            int i = this.f17716e;
            int i2 = this.f17720i;
            if (i >= i2) {
                return;
            }
            if (i == 0) {
                m23529b();
            } else {
                m23530c(i2 - i);
            }
        }

        /* renamed from: b */
        private void m23529b() {
            Arrays.fill(this.f17717f, (Object) null);
            this.f17718g = this.f17717f.length - 1;
            this.f17719h = 0;
            this.f17720i = 0;
        }

        /* renamed from: c */
        private int m23530c(int i) {
            int i2;
            int i3 = 0;
            if (i > 0) {
                int length = this.f17717f.length;
                while (true) {
                    length--;
                    i2 = this.f17718g;
                    if (length < i2 || i <= 0) {
                        C9802a[] aVarArr = this.f17717f;
                        System.arraycopy(aVarArr, i2 + 1, aVarArr, i2 + 1 + i3, this.f17719h);
                        C9802a[] aVarArr2 = this.f17717f;
                        int i4 = this.f17718g;
                        Arrays.fill(aVarArr2, i4 + 1, i4 + 1 + i3, (Object) null);
                        this.f17718g += i3;
                    } else {
                        C9802a[] aVarArr3 = this.f17717f;
                        i -= aVarArr3[length].f17701c;
                        this.f17720i -= aVarArr3[length].f17701c;
                        this.f17719h--;
                        i3++;
                    }
                }
                C9802a[] aVarArr4 = this.f17717f;
                System.arraycopy(aVarArr4, i2 + 1, aVarArr4, i2 + 1 + i3, this.f17719h);
                C9802a[] aVarArr22 = this.f17717f;
                int i42 = this.f17718g;
                Arrays.fill(aVarArr22, i42 + 1, i42 + 1 + i3, (Object) null);
                this.f17718g += i3;
            }
            return i3;
        }

        /* renamed from: d */
        private void m23531d(C9802a aVar) {
            int i = aVar.f17701c;
            int i2 = this.f17716e;
            if (i > i2) {
                m23529b();
                return;
            }
            m23530c((this.f17720i + i) - i2);
            int i3 = this.f17719h + 1;
            C9802a[] aVarArr = this.f17717f;
            if (i3 > aVarArr.length) {
                C9802a[] aVarArr2 = new C9802a[(aVarArr.length * 2)];
                System.arraycopy(aVarArr, 0, aVarArr2, aVarArr.length, aVarArr.length);
                this.f17718g = this.f17717f.length - 1;
                this.f17717f = aVarArr2;
            }
            int i4 = this.f17718g;
            this.f17718g = i4 - 1;
            this.f17717f[i4] = aVar;
            this.f17719h++;
            this.f17720i += i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo39004e(int i) {
            int min = Math.min(i, 16384);
            int i2 = this.f17716e;
            if (i2 != min) {
                if (min < i2) {
                    this.f17714c = Math.min(this.f17714c, min);
                }
                this.f17715d = true;
                this.f17716e = min;
                m23528a();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public void mo39005f(ByteString byteString) {
            int i;
            int i2;
            if (!this.f17713b || C9827h.m23642f().mo39065e(byteString) >= byteString.size()) {
                i2 = byteString.size();
                i = 0;
            } else {
                C3564c cVar = new C3564c();
                C9827h.m23642f().mo39064d(byteString, cVar);
                byteString = cVar.mo24769p();
                i2 = byteString.size();
                i = 128;
            }
            mo39007h(i2, SmartConfigStep.MSG_BLE_NOTIFY_TIME_OUT, i);
            this.f17712a.mo24733P0(byteString);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public void mo39006g(List<C9802a> list) {
            int i;
            int i2;
            if (this.f17715d) {
                int i3 = this.f17714c;
                if (i3 < this.f17716e) {
                    mo39007h(i3, 31, 32);
                }
                this.f17715d = false;
                this.f17714c = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
                mo39007h(this.f17716e, 31, 32);
            }
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                C9802a aVar = list.get(i4);
                ByteString asciiLowercase = aVar.f17699a.toAsciiLowercase();
                ByteString byteString = aVar.f17700b;
                Integer num = C9804b.f17703b.get(asciiLowercase);
                if (num != null) {
                    i2 = num.intValue() + 1;
                    if (i2 > 1 && i2 < 8) {
                        C9802a[] aVarArr = C9804b.f17702a;
                        if (C3300c.m8931p(aVarArr[i2 - 1].f17700b, byteString)) {
                            i = i2;
                        } else if (C3300c.m8931p(aVarArr[i2].f17700b, byteString)) {
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
                    int i5 = this.f17718g + 1;
                    int length = this.f17717f.length;
                    while (true) {
                        if (i5 >= length) {
                            break;
                        }
                        if (C3300c.m8931p(this.f17717f[i5].f17699a, asciiLowercase)) {
                            if (C3300c.m8931p(this.f17717f[i5].f17700b, byteString)) {
                                i2 = C9804b.f17702a.length + (i5 - this.f17718g);
                                break;
                            } else if (i == -1) {
                                i = (i5 - this.f17718g) + C9804b.f17702a.length;
                            }
                        }
                        i5++;
                    }
                }
                if (i2 != -1) {
                    mo39007h(i2, SmartConfigStep.MSG_BLE_NOTIFY_TIME_OUT, 128);
                } else {
                    if (i == -1) {
                        this.f17712a.mo24736R(64);
                        mo39005f(asciiLowercase);
                    } else if (!asciiLowercase.startsWith(C9802a.f17693d) || C9802a.f17698i.equals(asciiLowercase)) {
                        mo39007h(i, 63, 64);
                    } else {
                        mo39007h(i, 15, 0);
                        mo39005f(byteString);
                    }
                    mo39005f(byteString);
                    m23531d(aVar);
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public void mo39007h(int i, int i2, int i3) {
            int i4;
            C3564c cVar;
            if (i < i2) {
                cVar = this.f17712a;
                i4 = i | i3;
            } else {
                this.f17712a.mo24736R(i3 | i2);
                i4 = i - i2;
                while (i4 >= 128) {
                    this.f17712a.mo24736R(128 | (i4 & SmartConfigStep.MSG_BLE_NOTIFY_TIME_OUT));
                    i4 >>>= 7;
                }
                cVar = this.f17712a;
            }
            cVar.mo24736R(i4);
        }
    }

    static {
        ByteString byteString = C9802a.f17695f;
        ByteString byteString2 = C9802a.f17696g;
        ByteString byteString3 = C9802a.f17697h;
        ByteString byteString4 = C9802a.f17694e;
        f17702a = new C9802a[]{new C9802a(C9802a.f17698i, ""), new C9802a(byteString, "GET"), new C9802a(byteString, "POST"), new C9802a(byteString2, (String) MiotCloudImpl.COOKIE_PATH), new C9802a(byteString2, "/index.html"), new C9802a(byteString3, "http"), new C9802a(byteString3, "https"), new C9802a(byteString4, "200"), new C9802a(byteString4, "204"), new C9802a(byteString4, "206"), new C9802a(byteString4, "304"), new C9802a(byteString4, "400"), new C9802a(byteString4, "404"), new C9802a(byteString4, "500"), new C9802a("accept-charset", ""), new C9802a("accept-encoding", "gzip, deflate"), new C9802a("accept-language", ""), new C9802a("accept-ranges", ""), new C9802a("accept", ""), new C9802a("access-control-allow-origin", ""), new C9802a("age", ""), new C9802a("allow", ""), new C9802a("authorization", ""), new C9802a("cache-control", ""), new C9802a("content-disposition", ""), new C9802a("content-encoding", ""), new C9802a("content-language", ""), new C9802a("content-length", ""), new C9802a("content-location", ""), new C9802a("content-range", ""), new C9802a("content-type", ""), new C9802a("cookie", ""), new C9802a("date", ""), new C9802a("etag", ""), new C9802a("expect", ""), new C9802a("expires", ""), new C9802a((String) TypedValues.TransitionType.S_FROM, ""), new C9802a("host", ""), new C9802a("if-match", ""), new C9802a("if-modified-since", ""), new C9802a("if-none-match", ""), new C9802a("if-range", ""), new C9802a("if-unmodified-since", ""), new C9802a("last-modified", ""), new C9802a("link", ""), new C9802a("location", ""), new C9802a("max-forwards", ""), new C9802a("proxy-authenticate", ""), new C9802a("proxy-authorization", ""), new C9802a("range", ""), new C9802a("referer", ""), new C9802a("refresh", ""), new C9802a("retry-after", ""), new C9802a("server", ""), new C9802a("set-cookie", ""), new C9802a("strict-transport-security", ""), new C9802a("transfer-encoding", ""), new C9802a("user-agent", ""), new C9802a("vary", ""), new C9802a("via", ""), new C9802a("www-authenticate", "")};
    }

    /* renamed from: a */
    static ByteString m23509a(ByteString byteString) {
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

    /* renamed from: b */
    private static Map<ByteString, Integer> m23510b() {
        LinkedHashMap linkedHashMap = new LinkedHashMap(f17702a.length);
        int i = 0;
        while (true) {
            C9802a[] aVarArr = f17702a;
            if (i >= aVarArr.length) {
                return Collections.unmodifiableMap(linkedHashMap);
            }
            if (!linkedHashMap.containsKey(aVarArr[i].f17699a)) {
                linkedHashMap.put(aVarArr[i].f17699a, Integer.valueOf(i));
            }
            i++;
        }
    }
}
