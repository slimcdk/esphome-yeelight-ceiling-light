package p154d.p198a.p199g;

import com.google.p107ar.schemas.sceneform.ParameterInitDefType;
import com.miot.bluetooth.channel.packet.Packet;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.Vector;
import java.util.logging.Logger;
import org.apache.commons.p271io.IOUtils;
import p154d.p198a.C10613d;
import p154d.p198a.p199g.C10637h;
import p154d.p198a.p199g.C10645i;
import p154d.p198a.p199g.p200r.C10680d;
import p154d.p198a.p199g.p200r.C10683g;
import p154d.p198a.p199g.p201s.C10686a;

/* renamed from: d.a.g.p */
public class C10673p extends C10613d implements C10624d, C10645i {

    /* renamed from: s */
    private static Logger f20439s = Logger.getLogger(C10673p.class.getName());

    /* renamed from: b */
    private String f20440b;

    /* renamed from: c */
    private String f20441c;

    /* renamed from: d */
    private String f20442d;

    /* renamed from: e */
    private String f20443e;

    /* renamed from: f */
    private String f20444f;

    /* renamed from: g */
    private String f20445g;

    /* renamed from: h */
    private int f20446h;

    /* renamed from: i */
    private int f20447i;

    /* renamed from: j */
    private int f20448j;

    /* renamed from: k */
    private byte[] f20449k;

    /* renamed from: l */
    private Map<String, byte[]> f20450l;

    /* renamed from: m */
    private final Set<Inet4Address> f20451m;

    /* renamed from: n */
    private final Set<Inet6Address> f20452n;

    /* renamed from: o */
    private transient String f20453o;

    /* renamed from: p */
    private boolean f20454p;

    /* renamed from: q */
    private boolean f20455q;

    /* renamed from: r */
    private final C10675b f20456r;

    /* renamed from: d.a.g.p$a */
    static /* synthetic */ class C10674a {

        /* renamed from: a */
        static final /* synthetic */ int[] f20457a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                d.a.g.r.e[] r0 = p154d.p198a.p199g.p200r.C10681e.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f20457a = r0
                d.a.g.r.e r1 = p154d.p198a.p199g.p200r.C10681e.TYPE_A     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f20457a     // Catch:{ NoSuchFieldError -> 0x001d }
                d.a.g.r.e r1 = p154d.p198a.p199g.p200r.C10681e.TYPE_AAAA     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f20457a     // Catch:{ NoSuchFieldError -> 0x0028 }
                d.a.g.r.e r1 = p154d.p198a.p199g.p200r.C10681e.TYPE_SRV     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f20457a     // Catch:{ NoSuchFieldError -> 0x0033 }
                d.a.g.r.e r1 = p154d.p198a.p199g.p200r.C10681e.TYPE_TXT     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f20457a     // Catch:{ NoSuchFieldError -> 0x003e }
                d.a.g.r.e r1 = p154d.p198a.p199g.p200r.C10681e.TYPE_PTR     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p154d.p198a.p199g.C10673p.C10674a.<clinit>():void");
        }
    }

    /* renamed from: d.a.g.p$b */
    private static final class C10675b extends C10645i.C10647b {

        /* renamed from: g */
        private final C10673p f20458g;

        public C10675b(C10673p pVar) {
            this.f20458g = pVar;
        }

        /* renamed from: q */
        public void mo33646q(C10656l lVar) {
            super.mo33646q(lVar);
        }

        /* access modifiers changed from: protected */
        /* renamed from: s */
        public void mo33648s(C10686a aVar) {
            super.mo33648s(aVar);
            if (this.f20357b == null && this.f20458g.mo33817t0()) {
                lock();
                try {
                    if (this.f20357b == null && this.f20458g.mo33817t0()) {
                        if (this.f20358c.mo33832b()) {
                            mo33647r(C10683g.ANNOUNCING_1);
                            if (mo33634d() != null) {
                                mo33634d().mo33662t();
                            }
                        }
                        this.f20458g.mo33801N0(false);
                    }
                } finally {
                    unlock();
                }
            }
        }
    }

    C10673p(C10613d dVar) {
        this.f20451m = Collections.synchronizedSet(new LinkedHashSet());
        this.f20452n = Collections.synchronizedSet(new LinkedHashSet());
        if (dVar != null) {
            this.f20440b = dVar.mo33469e();
            this.f20441c = dVar.mo33478s();
            this.f20442d = dVar.mo33468d();
            this.f20443e = dVar.mo33473m();
            this.f20444f = dVar.mo33481v();
            this.f20446h = dVar.mo33474o();
            this.f20447i = dVar.mo33484y();
            this.f20448j = dVar.mo33475p();
            this.f20449k = dVar.mo33482w();
            this.f20454p = dVar.mo33465A();
            for (Inet6Address add : dVar.mo33471k()) {
                this.f20452n.add(add);
            }
            for (Inet4Address add2 : dVar.mo33470f()) {
                this.f20451m.add(add2);
            }
        }
        this.f20456r = new C10675b(this);
    }

    public C10673p(String str, String str2, String str3, int i, int i2, int i3, boolean z, Map<String, ?> map) {
        this(m26317U(str, str2, str3), i, i2, i3, z, m26316P0(map));
    }

    public C10673p(String str, String str2, String str3, int i, int i2, int i3, boolean z, byte[] bArr) {
        this(m26317U(str, str2, str3), i, i2, i3, z, bArr);
    }

    C10673p(Map<C10613d.C10614a, String> map, int i, int i2, int i3, boolean z, String str) {
        this(map, i, i2, i3, z, (byte[]) null);
        this.f20445g = str;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(str.length());
            m26318U0(byteArrayOutputStream, str);
            this.f20449k = byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            throw new RuntimeException("unexpected exception: " + e);
        }
    }

    public C10673p(Map<C10613d.C10614a, String> map, int i, int i2, int i3, boolean z, Map<String, ?> map2) {
        this(map, i, i2, i3, z, m26316P0(map2));
    }

    C10673p(Map<C10613d.C10614a, String> map, int i, int i2, int i3, boolean z, byte[] bArr) {
        Map<C10613d.C10614a, String> O = m26315O(map);
        this.f20440b = O.get(C10613d.C10614a.Domain);
        this.f20441c = O.get(C10613d.C10614a.Protocol);
        this.f20442d = O.get(C10613d.C10614a.Application);
        this.f20443e = O.get(C10613d.C10614a.Instance);
        this.f20444f = O.get(C10613d.C10614a.Subtype);
        this.f20446h = i;
        this.f20447i = i2;
        this.f20448j = i3;
        this.f20449k = bArr;
        mo33801N0(false);
        this.f20456r = new C10675b(this);
        this.f20454p = z;
        this.f20451m = Collections.synchronizedSet(new LinkedHashSet());
        this.f20452n = Collections.synchronizedSet(new LinkedHashSet());
    }

    /* renamed from: H0 */
    private static String m26314H0(String str) {
        if (str == null) {
            return "";
        }
        String trim = str.trim();
        if (trim.startsWith(".")) {
            trim = trim.substring(1);
        }
        if (trim.startsWith("_")) {
            trim = trim.substring(1);
        }
        return trim.endsWith(".") ? trim.substring(0, trim.length() - 1) : trim;
    }

    /* renamed from: O */
    protected static Map<C10613d.C10614a, String> m26315O(Map<C10613d.C10614a, String> map) {
        HashMap hashMap = new HashMap(5);
        String str = "local";
        String str2 = map.containsKey(C10613d.C10614a.Domain) ? map.get(C10613d.C10614a.Domain) : str;
        if (!(str2 == null || str2.length() == 0)) {
            str = str2;
        }
        hashMap.put(C10613d.C10614a.Domain, m26314H0(str));
        String str3 = "tcp";
        String str4 = map.containsKey(C10613d.C10614a.Protocol) ? map.get(C10613d.C10614a.Protocol) : str3;
        if (!(str4 == null || str4.length() == 0)) {
            str3 = str4;
        }
        hashMap.put(C10613d.C10614a.Protocol, m26314H0(str3));
        String str5 = "";
        String str6 = map.containsKey(C10613d.C10614a.Application) ? map.get(C10613d.C10614a.Application) : str5;
        if (str6 == null || str6.length() == 0) {
            str6 = str5;
        }
        hashMap.put(C10613d.C10614a.Application, m26314H0(str6));
        String str7 = map.containsKey(C10613d.C10614a.Instance) ? map.get(C10613d.C10614a.Instance) : str5;
        if (str7 == null || str7.length() == 0) {
            str7 = str5;
        }
        hashMap.put(C10613d.C10614a.Instance, m26314H0(str7));
        String str8 = map.containsKey(C10613d.C10614a.Subtype) ? map.get(C10613d.C10614a.Subtype) : str5;
        if (!(str8 == null || str8.length() == 0)) {
            str5 = str8;
        }
        hashMap.put(C10613d.C10614a.Subtype, m26314H0(str5));
        return hashMap;
    }

    /* renamed from: P0 */
    private static byte[] m26316P0(Map<String, ?> map) {
        String str;
        byte[] bArr = null;
        if (map != null) {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(256);
                for (String next : map.keySet()) {
                    Object obj = map.get(next);
                    ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream(100);
                    m26318U0(byteArrayOutputStream2, next);
                    if (obj != null) {
                        if (obj instanceof String) {
                            byteArrayOutputStream2.write(61);
                            m26318U0(byteArrayOutputStream2, (String) obj);
                        } else if (obj instanceof byte[]) {
                            byte[] bArr2 = (byte[]) obj;
                            if (bArr2.length > 0) {
                                byteArrayOutputStream2.write(61);
                                byteArrayOutputStream2.write(bArr2, 0, bArr2.length);
                            } else {
                                obj = null;
                            }
                        } else {
                            throw new IllegalArgumentException("invalid property value: " + obj);
                        }
                    }
                    byte[] byteArray = byteArrayOutputStream2.toByteArray();
                    if (byteArray.length > 255) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Cannot have individual values larger that 255 chars. Offending value: ");
                        sb.append(next);
                        if (obj != null) {
                            str = "";
                        } else {
                            str = "=" + obj;
                        }
                        sb.append(str);
                        throw new IOException(sb.toString());
                    }
                    byteArrayOutputStream.write((byte) byteArray.length);
                    byteArrayOutputStream.write(byteArray, 0, byteArray.length);
                }
                bArr = byteArrayOutputStream.toByteArray();
            } catch (IOException e) {
                throw new RuntimeException("unexpected exception: " + e);
            }
        }
        return (bArr == null || bArr.length <= 0) ? C10637h.f20337l : bArr;
    }

    /* renamed from: U */
    public static Map<C10613d.C10614a, String> m26317U(String str, String str2, String str3) {
        Map<C10613d.C10614a, String> Y = m26319Y(str);
        Y.put(C10613d.C10614a.Instance, str2);
        Y.put(C10613d.C10614a.Subtype, str3);
        return m26315O(Y);
    }

    /* renamed from: U0 */
    static void m26318U0(OutputStream outputStream, String str) {
        int i;
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            if (charAt < 1 || charAt > 127) {
                if (charAt > 2047) {
                    outputStream.write(((charAt >> 12) & 15) | 224);
                    i = ((charAt >> 6) & 63) | 128;
                } else {
                    i = ((charAt >> 6) & 31) | 192;
                }
                outputStream.write(i);
                charAt = ((charAt >> 0) & '?') | 128;
            }
            outputStream.write(charAt);
        }
    }

    /* renamed from: Y */
    public static Map<C10613d.C10614a, String> m26319Y(String str) {
        String str2;
        String str3;
        String str4;
        String substring;
        String str5;
        String str6;
        String str7;
        int indexOf;
        String lowerCase = str.toLowerCase();
        String str8 = "";
        if (lowerCase.contains("in-addr.arpa") || lowerCase.contains("ip6.arpa")) {
            int indexOf2 = lowerCase.contains("in-addr.arpa") ? lowerCase.indexOf("in-addr.arpa") : lowerCase.indexOf("ip6.arpa");
            str4 = m26314H0(str.substring(0, indexOf2));
            substring = str.substring(indexOf2);
        } else if (lowerCase.contains("_") || !lowerCase.contains(".")) {
            if ((!lowerCase.startsWith("_") || lowerCase.startsWith("_services")) && (indexOf = lowerCase.indexOf(46)) > 0) {
                str6 = str.substring(0, indexOf);
                int i = indexOf + 1;
                if (i < lowerCase.length()) {
                    str5 = lowerCase.substring(i);
                    str = str.substring(i);
                } else {
                    str5 = lowerCase;
                }
            } else {
                str5 = lowerCase;
                str6 = str8;
            }
            int lastIndexOf = str5.lastIndexOf("._");
            if (lastIndexOf > 0) {
                int i2 = lastIndexOf + 2;
                str7 = str.substring(i2, str5.indexOf(46, i2));
            } else {
                str7 = str8;
            }
            if (str7.length() > 0) {
                int indexOf3 = str5.indexOf("_" + str7.toLowerCase() + ".");
                String substring2 = str.substring(str7.length() + indexOf3 + 2, str5.length() - (str5.endsWith(".") ? 1 : 0));
                lowerCase = str.substring(0, indexOf3 + -1);
                str2 = substring2;
            } else {
                str2 = str8;
            }
            int indexOf4 = lowerCase.toLowerCase().indexOf("._sub");
            if (indexOf4 > 0) {
                str8 = m26314H0(lowerCase.substring(0, indexOf4));
                lowerCase = lowerCase.substring(indexOf4 + 5);
            }
            str4 = str6;
            String str9 = str8;
            str8 = str7;
            str3 = str9;
            HashMap hashMap = new HashMap(5);
            hashMap.put(C10613d.C10614a.Domain, m26314H0(str2));
            hashMap.put(C10613d.C10614a.Protocol, str8);
            hashMap.put(C10613d.C10614a.Application, m26314H0(lowerCase));
            hashMap.put(C10613d.C10614a.Instance, str4);
            hashMap.put(C10613d.C10614a.Subtype, str3);
            return hashMap;
        } else {
            int indexOf5 = lowerCase.indexOf(46);
            str4 = m26314H0(str.substring(0, indexOf5));
            substring = m26314H0(str.substring(indexOf5));
        }
        lowerCase = str8;
        str3 = lowerCase;
        HashMap hashMap2 = new HashMap(5);
        hashMap2.put(C10613d.C10614a.Domain, m26314H0(str2));
        hashMap2.put(C10613d.C10614a.Protocol, str8);
        hashMap2.put(C10613d.C10614a.Application, m26314H0(lowerCase));
        hashMap2.put(C10613d.C10614a.Instance, str4);
        hashMap2.put(C10613d.C10614a.Subtype, str3);
        return hashMap2;
    }

    /* renamed from: k0 */
    private final boolean m26320k0() {
        return this.f20451m.size() > 0 || this.f20452n.size() > 0;
    }

    /* renamed from: A */
    public boolean mo33465A() {
        return this.f20454p;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A0 */
    public String mo33789A0(byte[] bArr, int i, int i2) {
        int i3;
        int i4;
        byte b;
        StringBuffer stringBuffer = new StringBuffer();
        int i5 = i + i2;
        while (i < i5) {
            int i6 = i + 1;
            byte b2 = bArr[i] & 255;
            switch (b2 >> 4) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                    break;
                case 12:
                case 13:
                    if (i6 < i2) {
                        i3 = (b2 & 31) << 6;
                        i4 = i6 + 1;
                        b = bArr[i6] & 63;
                        break;
                    } else {
                        return null;
                    }
                case 14:
                    if (i6 + 2 >= i2) {
                        return null;
                    }
                    int i7 = i6 + 1;
                    byte b3 = ((b2 & ParameterInitDefType.CubemapSamplerInit) << 12) | ((bArr[i6] & 63) << 6);
                    i6 = i7 + 1;
                    b2 = b3 | (bArr[i7] & 63);
                    continue;
                default:
                    i4 = i6 + 1;
                    if (i4 < i2) {
                        i3 = (b2 & 63) << 4;
                        b = bArr[i6] & ParameterInitDefType.CubemapSamplerInit;
                        break;
                    } else {
                        return null;
                    }
            }
            b2 = i3 | b;
            i6 = i4;
            stringBuffer.append((char) b2);
            i = i6;
        }
        return stringBuffer.toString();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public void mo33790B(byte[] bArr) {
        this.f20449k = bArr;
        this.f20450l = null;
    }

    /* renamed from: C0 */
    public boolean mo33791C0() {
        return this.f20456r.mo33643n();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D */
    public void mo33792D(Inet4Address inet4Address) {
        this.f20451m.add(inet4Address);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public void mo33793E(Inet6Address inet6Address) {
        this.f20452n.add(inet6Address);
    }

    /* renamed from: E0 */
    public void mo33794E0(C10686a aVar) {
        this.f20456r.mo33644o(aVar);
    }

    /* renamed from: F */
    public Collection<C10637h> mo33795F(boolean z, int i, C10653k kVar) {
        ArrayList arrayList = new ArrayList();
        if (mo33481v().length() > 0) {
            arrayList.add(new C10637h.C10642e(mo33812i0(), C10680d.CLASS_IN, false, i, mo33479t()));
        }
        arrayList.add(new C10637h.C10642e(mo33483x(), C10680d.CLASS_IN, false, i, mo33479t()));
        String t = mo33479t();
        C10680d dVar = C10680d.CLASS_IN;
        int i2 = this.f20448j;
        int i3 = this.f20447i;
        arrayList.add(new C10637h.C10643f(t, dVar, z, i, i2, i3, this.f20446h, kVar.mo33690q()));
        arrayList.add(new C10637h.C10644g(mo33479t(), C10680d.CLASS_IN, z, i, mo33482w()));
        return arrayList;
    }

    /* renamed from: G */
    public void mo33796G(C10686a aVar, C10683g gVar) {
        this.f20456r.mo33631a(aVar, gVar);
    }

    /* renamed from: K0 */
    public boolean mo33797K0() {
        return this.f20456r.mo33645p();
    }

    /* renamed from: L0 */
    public void mo33798L0(C10656l lVar) {
        this.f20456r.mo33646q(lVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: M0 */
    public void mo33799M0(String str) {
        this.f20443e = str;
        this.f20453o = null;
    }

    /* renamed from: N */
    public boolean mo33800N() {
        return this.f20456r.mo33632b();
    }

    /* renamed from: N0 */
    public void mo33801N0(boolean z) {
        this.f20455q = z;
        if (z) {
            this.f20456r.mo33648s((C10686a) null);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: O0 */
    public void mo33802O0(String str) {
        this.f20445g = str;
    }

    /* renamed from: P */
    public C10673p clone() {
        C10673p pVar = new C10673p(mo33810h0(), this.f20446h, this.f20447i, this.f20448j, this.f20454p, this.f20449k);
        for (Inet6Address add : mo33471k()) {
            pVar.f20452n.add(add);
        }
        for (Inet4Address add2 : mo33470f()) {
            pVar.f20451m.add(add2);
        }
        return pVar;
    }

    /* renamed from: R0 */
    public boolean mo33804R0(long j) {
        return this.f20456r.mo33649t(j);
    }

    /* renamed from: T0 */
    public boolean mo33805T0(long j) {
        return this.f20456r.mo33651u(j);
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: a */
    public void mo33559a(p154d.p198a.p199g.C10617a r6, long r7, p154d.p198a.p199g.C10620b r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof p154d.p198a.p199g.C10637h
            if (r0 == 0) goto L_0x0144
            boolean r0 = r9.mo33532j(r7)
            if (r0 != 0) goto L_0x0144
            int[] r0 = p154d.p198a.p199g.C10673p.C10674a.f20457a
            d.a.g.r.e r1 = r9.mo33527f()
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r1 = 0
            r2 = 1
            if (r0 == r2) goto L_0x00fa
            r3 = 2
            if (r0 == r3) goto L_0x00e0
            r3 = 3
            if (r0 == r3) goto L_0x005d
            r6 = 4
            if (r0 == r6) goto L_0x0044
            r6 = 5
            if (r0 == r6) goto L_0x0028
            goto L_0x0117
        L_0x0028:
            java.lang.String r6 = r5.mo33481v()
            int r6 = r6.length()
            if (r6 != 0) goto L_0x0117
            java.lang.String r6 = r9.mo33528g()
            int r6 = r6.length()
            if (r6 == 0) goto L_0x0117
            java.lang.String r6 = r9.mo33528g()
            r5.f20444f = r6
            goto L_0x0116
        L_0x0044:
            java.lang.String r6 = r9.mo33523c()
            java.lang.String r7 = r5.mo33479t()
            boolean r6 = r6.equalsIgnoreCase(r7)
            if (r6 == 0) goto L_0x0117
            r6 = r9
            d.a.g.h$g r6 = (p154d.p198a.p199g.C10637h.C10644g) r6
            byte[] r6 = r6.mo33626P()
            r5.f20449k = r6
            goto L_0x0116
        L_0x005d:
            java.lang.String r0 = r9.mo33523c()
            java.lang.String r3 = r5.mo33479t()
            boolean r0 = r0.equalsIgnoreCase(r3)
            if (r0 == 0) goto L_0x0117
            r0 = r9
            d.a.g.h$f r0 = (p154d.p198a.p199g.C10637h.C10643f) r0
            java.lang.String r3 = r5.f20445g
            if (r3 == 0) goto L_0x007f
            java.lang.String r4 = r0.mo33624R()
            boolean r3 = r3.equalsIgnoreCase(r4)
            if (r3 != 0) goto L_0x007d
            goto L_0x007f
        L_0x007d:
            r3 = 0
            goto L_0x0080
        L_0x007f:
            r3 = 1
        L_0x0080:
            java.lang.String r4 = r0.mo33624R()
            r5.f20445g = r4
            int r4 = r0.mo33622P()
            r5.f20446h = r4
            int r4 = r0.mo33625S()
            r5.f20447i = r4
            int r0 = r0.mo33623Q()
            r5.f20448j = r0
            if (r3 == 0) goto L_0x0116
            java.util.Set<java.net.Inet4Address> r0 = r5.f20451m
            r0.clear()
            java.util.Set<java.net.Inet6Address> r0 = r5.f20452n
            r0.clear()
            java.lang.String r0 = r5.f20445g
            d.a.g.r.e r2 = p154d.p198a.p199g.p200r.C10681e.TYPE_A
            d.a.g.r.d r3 = p154d.p198a.p199g.p200r.C10680d.CLASS_IN
            java.util.Collection r0 = r6.mo33495g(r0, r2, r3)
            java.util.Iterator r0 = r0.iterator()
        L_0x00b2:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x00c2
            java.lang.Object r2 = r0.next()
            d.a.g.b r2 = (p154d.p198a.p199g.C10620b) r2
            r5.mo33559a(r6, r7, r2)
            goto L_0x00b2
        L_0x00c2:
            java.lang.String r0 = r5.f20445g
            d.a.g.r.e r2 = p154d.p198a.p199g.p200r.C10681e.TYPE_AAAA
            d.a.g.r.d r3 = p154d.p198a.p199g.p200r.C10680d.CLASS_IN
            java.util.Collection r0 = r6.mo33495g(r0, r2, r3)
            java.util.Iterator r0 = r0.iterator()
        L_0x00d0:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0117
            java.lang.Object r2 = r0.next()
            d.a.g.b r2 = (p154d.p198a.p199g.C10620b) r2
            r5.mo33559a(r6, r7, r2)
            goto L_0x00d0
        L_0x00e0:
            java.lang.String r6 = r9.mo33523c()
            java.lang.String r7 = r5.mo33480u()
            boolean r6 = r6.equalsIgnoreCase(r7)
            if (r6 == 0) goto L_0x0117
            java.util.Set<java.net.Inet6Address> r6 = r5.f20452n
            r7 = r9
            d.a.g.h$a r7 = (p154d.p198a.p199g.C10637h.C10638a) r7
            java.net.InetAddress r7 = r7.mo33619P()
            java.net.Inet6Address r7 = (java.net.Inet6Address) r7
            goto L_0x0113
        L_0x00fa:
            java.lang.String r6 = r9.mo33523c()
            java.lang.String r7 = r5.mo33480u()
            boolean r6 = r6.equalsIgnoreCase(r7)
            if (r6 == 0) goto L_0x0117
            java.util.Set<java.net.Inet4Address> r6 = r5.f20451m
            r7 = r9
            d.a.g.h$a r7 = (p154d.p198a.p199g.C10637h.C10638a) r7
            java.net.InetAddress r7 = r7.mo33619P()
            java.net.Inet4Address r7 = (java.net.Inet4Address) r7
        L_0x0113:
            r6.add(r7)
        L_0x0116:
            r1 = 1
        L_0x0117:
            if (r1 == 0) goto L_0x013b
            boolean r6 = r5.mo33485z()
            if (r6 == 0) goto L_0x013b
            d.a.g.l r6 = r5.mo33806b0()
            if (r6 == 0) goto L_0x013b
            d.a.g.h r9 = (p154d.p198a.p199g.C10637h) r9
            d.a.c r7 = r9.mo33618z(r6)
            d.a.g.o r8 = new d.a.g.o
            java.lang.String r9 = r7.mo33464e()
            java.lang.String r7 = r7.mo33463d()
            r8.<init>(r6, r9, r7, r5)
            r6.mo33701D0(r8)
        L_0x013b:
            monitor-enter(r5)
            r5.notifyAll()     // Catch:{ all -> 0x0141 }
            monitor-exit(r5)     // Catch:{ all -> 0x0141 }
            goto L_0x0144
        L_0x0141:
            r6 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0141 }
            throw r6
        L_0x0144:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p154d.p198a.p199g.C10673p.mo33559a(d.a.g.a, long, d.a.g.b):void");
    }

    /* renamed from: b0 */
    public C10656l mo33806b0() {
        return this.f20456r.mo33634d();
    }

    /* renamed from: d */
    public String mo33468d() {
        String str = this.f20442d;
        return str != null ? str : "";
    }

    /* renamed from: d0 */
    public InetAddress[] mo33807d0() {
        ArrayList arrayList = new ArrayList(this.f20451m.size() + this.f20452n.size());
        arrayList.addAll(this.f20451m);
        arrayList.addAll(this.f20452n);
        return (InetAddress[]) arrayList.toArray(new InetAddress[arrayList.size()]);
    }

    /* renamed from: e */
    public String mo33469e() {
        String str = this.f20440b;
        return str != null ? str : "local";
    }

    public boolean equals(Object obj) {
        return (obj instanceof C10673p) && mo33479t().equals(((C10673p) obj).mo33479t());
    }

    /* renamed from: f */
    public Inet4Address[] mo33470f() {
        Set<Inet4Address> set = this.f20451m;
        return (Inet4Address[]) set.toArray(new Inet4Address[set.size()]);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x004b, code lost:
        r0.clear();
     */
    /* renamed from: g0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized java.util.Map<java.lang.String, byte[]> mo33809g0() {
        /*
            r9 = this;
            monitor-enter(r9)
            java.util.Map<java.lang.String, byte[]> r0 = r9.f20450l     // Catch:{ all -> 0x0083 }
            if (r0 != 0) goto L_0x0076
            byte[] r0 = r9.mo33482w()     // Catch:{ all -> 0x0083 }
            if (r0 == 0) goto L_0x0076
            java.util.Hashtable r0 = new java.util.Hashtable     // Catch:{ all -> 0x0083 }
            r0.<init>()     // Catch:{ all -> 0x0083 }
            r1 = 0
            r2 = 0
        L_0x0012:
            byte[] r3 = r9.mo33482w()     // Catch:{ Exception -> 0x006a }
            int r3 = r3.length     // Catch:{ Exception -> 0x006a }
            if (r2 >= r3) goto L_0x0074
            byte[] r3 = r9.mo33482w()     // Catch:{ Exception -> 0x006a }
            int r4 = r2 + 1
            byte r2 = r3[r2]     // Catch:{ Exception -> 0x006a }
            r2 = r2 & 255(0xff, float:3.57E-43)
            if (r2 == 0) goto L_0x004b
            int r3 = r4 + r2
            byte[] r5 = r9.mo33482w()     // Catch:{ Exception -> 0x006a }
            int r5 = r5.length     // Catch:{ Exception -> 0x006a }
            if (r3 <= r5) goto L_0x002f
            goto L_0x004b
        L_0x002f:
            r5 = 0
        L_0x0030:
            if (r5 >= r2) goto L_0x0041
            byte[] r6 = r9.mo33482w()     // Catch:{ Exception -> 0x006a }
            int r7 = r4 + r5
            byte r6 = r6[r7]     // Catch:{ Exception -> 0x006a }
            r7 = 61
            if (r6 == r7) goto L_0x0041
            int r5 = r5 + 1
            goto L_0x0030
        L_0x0041:
            byte[] r6 = r9.mo33482w()     // Catch:{ Exception -> 0x006a }
            java.lang.String r6 = r9.mo33789A0(r6, r4, r5)     // Catch:{ Exception -> 0x006a }
            if (r6 != 0) goto L_0x004f
        L_0x004b:
            r0.clear()     // Catch:{ Exception -> 0x006a }
            goto L_0x0074
        L_0x004f:
            if (r5 != r2) goto L_0x0058
            byte[] r2 = p154d.p198a.C10613d.f20289a     // Catch:{ Exception -> 0x006a }
            r0.put(r6, r2)     // Catch:{ Exception -> 0x006a }
            r2 = r4
            goto L_0x0012
        L_0x0058:
            int r5 = r5 + 1
            int r2 = r2 - r5
            byte[] r7 = new byte[r2]     // Catch:{ Exception -> 0x006a }
            byte[] r8 = r9.mo33482w()     // Catch:{ Exception -> 0x006a }
            int r4 = r4 + r5
            java.lang.System.arraycopy(r8, r4, r7, r1, r2)     // Catch:{ Exception -> 0x006a }
            r0.put(r6, r7)     // Catch:{ Exception -> 0x006a }
            r2 = r3
            goto L_0x0012
        L_0x006a:
            r1 = move-exception
            java.util.logging.Logger r2 = f20439s     // Catch:{ all -> 0x0083 }
            java.util.logging.Level r3 = java.util.logging.Level.WARNING     // Catch:{ all -> 0x0083 }
            java.lang.String r4 = "Malformed TXT Field "
            r2.log(r3, r4, r1)     // Catch:{ all -> 0x0083 }
        L_0x0074:
            r9.f20450l = r0     // Catch:{ all -> 0x0083 }
        L_0x0076:
            java.util.Map<java.lang.String, byte[]> r0 = r9.f20450l     // Catch:{ all -> 0x0083 }
            if (r0 == 0) goto L_0x007d
            java.util.Map<java.lang.String, byte[]> r0 = r9.f20450l     // Catch:{ all -> 0x0083 }
            goto L_0x0081
        L_0x007d:
            java.util.Map r0 = java.util.Collections.emptyMap()     // Catch:{ all -> 0x0083 }
        L_0x0081:
            monitor-exit(r9)
            return r0
        L_0x0083:
            r0 = move-exception
            monitor-exit(r9)
            goto L_0x0087
        L_0x0086:
            throw r0
        L_0x0087:
            goto L_0x0086
        */
        throw new UnsupportedOperationException("Method not decompiled: p154d.p198a.p199g.C10673p.mo33809g0():java.util.Map");
    }

    /* renamed from: h0 */
    public Map<C10613d.C10614a, String> mo33810h0() {
        HashMap hashMap = new HashMap(5);
        hashMap.put(C10613d.C10614a.Domain, mo33469e());
        hashMap.put(C10613d.C10614a.Protocol, mo33478s());
        hashMap.put(C10613d.C10614a.Application, mo33468d());
        hashMap.put(C10613d.C10614a.Instance, mo33473m());
        hashMap.put(C10613d.C10614a.Subtype, mo33481v());
        return hashMap;
    }

    public int hashCode() {
        return mo33479t().hashCode();
    }

    /* renamed from: i0 */
    public String mo33812i0() {
        String str;
        String v = mo33481v();
        StringBuilder sb = new StringBuilder();
        if (v.length() > 0) {
            str = "_" + v.toLowerCase() + "._sub.";
        } else {
            str = "";
        }
        sb.append(str);
        sb.append(mo33483x());
        return sb.toString();
    }

    /* renamed from: j */
    public boolean mo33627j(C10686a aVar) {
        return this.f20456r.mo33627j(aVar);
    }

    /* renamed from: k */
    public Inet6Address[] mo33471k() {
        Set<Inet6Address> set = this.f20452n;
        return (Inet6Address[]) set.toArray(new Inet6Address[set.size()]);
    }

    /* renamed from: l */
    public String mo33472l() {
        if (this.f20453o == null) {
            this.f20453o = mo33479t().toLowerCase();
        }
        return this.f20453o;
    }

    /* renamed from: l0 */
    public boolean mo33813l0() {
        return this.f20456r.mo33635e();
    }

    /* renamed from: m */
    public String mo33473m() {
        String str = this.f20443e;
        return str != null ? str : "";
    }

    /* renamed from: o */
    public int mo33474o() {
        return this.f20446h;
    }

    /* renamed from: p */
    public int mo33475p() {
        return this.f20448j;
    }

    /* renamed from: p0 */
    public boolean mo33814p0() {
        return this.f20456r.mo33636f();
    }

    /* renamed from: q */
    public Enumeration<String> mo33476q() {
        Map<String, byte[]> g0 = mo33809g0();
        return new Vector(g0 != null ? g0.keySet() : Collections.emptySet()).elements();
    }

    /* renamed from: q0 */
    public boolean mo33815q0(C10686a aVar, C10683g gVar) {
        return this.f20456r.mo33637g(aVar, gVar);
    }

    /* renamed from: r */
    public synchronized String mo33477r(String str) {
        byte[] bArr = mo33809g0().get(str);
        if (bArr == null) {
            return null;
        }
        if (bArr == C10613d.f20289a) {
            return "true";
        }
        return mo33789A0(bArr, 0, bArr.length);
    }

    /* renamed from: s */
    public String mo33478s() {
        String str = this.f20441c;
        return str != null ? str : "tcp";
    }

    /* renamed from: s0 */
    public boolean mo33816s0() {
        return this.f20456r.mo33642m();
    }

    /* renamed from: t */
    public String mo33479t() {
        String str;
        String str2;
        String e = mo33469e();
        String s = mo33478s();
        String d = mo33468d();
        String m = mo33473m();
        StringBuilder sb = new StringBuilder();
        String str3 = "";
        if (m.length() > 0) {
            str = m + ".";
        } else {
            str = str3;
        }
        sb.append(str);
        if (d.length() > 0) {
            str2 = "_" + d + ".";
        } else {
            str2 = str3;
        }
        sb.append(str2);
        if (s.length() > 0) {
            str3 = "_" + s + ".";
        }
        sb.append(str3);
        sb.append(e);
        sb.append(".");
        return sb.toString();
    }

    /* renamed from: t0 */
    public boolean mo33817t0() {
        return this.f20455q;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("[" + C10673p.class.getSimpleName() + "@" + System.identityHashCode(this) + " ");
        sb.append("name: '");
        StringBuilder sb2 = new StringBuilder();
        String str2 = "";
        if (mo33473m().length() > 0) {
            str = mo33473m() + ".";
        } else {
            str = str2;
        }
        sb2.append(str);
        sb2.append(mo33812i0());
        sb.append(sb2.toString());
        sb.append("' address: '");
        InetAddress[] d0 = mo33807d0();
        if (d0.length > 0) {
            for (InetAddress append : d0) {
                sb.append(append);
                sb.append(':');
                sb.append(mo33474o());
                sb.append(' ');
            }
        } else {
            sb.append("(null):");
            sb.append(mo33474o());
        }
        sb.append("' status: '");
        sb.append(this.f20456r.toString());
        sb.append(mo33465A() ? "' is persistent," : "',");
        sb.append(" has ");
        if (!mo33485z()) {
            str2 = "NO ";
        }
        sb.append(str2);
        sb.append(Packet.DATA);
        if (mo33482w().length > 0) {
            Map<String, byte[]> g0 = mo33809g0();
            if (!g0.isEmpty()) {
                sb.append(IOUtils.LINE_SEPARATOR_UNIX);
                for (String next : g0.keySet()) {
                    sb.append("\t" + next + ": " + new String(g0.get(next)) + IOUtils.LINE_SEPARATOR_UNIX);
                }
            } else {
                sb.append(" empty");
            }
        }
        sb.append(']');
        return sb.toString();
    }

    /* renamed from: u */
    public String mo33480u() {
        String str = this.f20445g;
        return str != null ? str : "";
    }

    /* renamed from: v */
    public String mo33481v() {
        String str = this.f20444f;
        return str != null ? str : "";
    }

    /* renamed from: w */
    public byte[] mo33482w() {
        byte[] bArr = this.f20449k;
        return (bArr == null || bArr.length <= 0) ? C10637h.f20337l : bArr;
    }

    /* renamed from: x */
    public String mo33483x() {
        String str;
        String e = mo33469e();
        String s = mo33478s();
        String d = mo33468d();
        StringBuilder sb = new StringBuilder();
        String str2 = "";
        if (d.length() > 0) {
            str = "_" + d + ".";
        } else {
            str = str2;
        }
        sb.append(str);
        if (s.length() > 0) {
            str2 = "_" + s + ".";
        }
        sb.append(str2);
        sb.append(e);
        sb.append(".");
        return sb.toString();
    }

    /* renamed from: y */
    public int mo33484y() {
        return this.f20447i;
    }

    /* renamed from: z */
    public synchronized boolean mo33485z() {
        return mo33480u() != null && m26320k0() && mo33482w() != null && mo33482w().length > 0;
    }
}
