package p154d.p198a.p199g;

import com.miot.service.common.miotcloud.impl.MiotCloudImpl;
import com.xiaomi.mipush.sdk.Constants;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.commons.p271io.IOUtils;
import p154d.p198a.C10612c;
import p154d.p198a.C10613d;
import p154d.p198a.p199g.C10626f;
import p154d.p198a.p199g.p200r.C10680d;
import p154d.p198a.p199g.p200r.C10681e;

/* renamed from: d.a.g.h */
public abstract class C10637h extends C10620b {

    /* renamed from: k */
    private static Logger f20336k = Logger.getLogger(C10637h.class.getName());

    /* renamed from: l */
    public static final byte[] f20337l = {0};

    /* renamed from: h */
    private int f20338h;

    /* renamed from: i */
    private long f20339i = System.currentTimeMillis();

    /* renamed from: j */
    private InetAddress f20340j;

    /* renamed from: d.a.g.h$a */
    public static abstract class C10638a extends C10637h {

        /* renamed from: n */
        private static Logger f20341n = Logger.getLogger(C10638a.class.getName());

        /* renamed from: m */
        InetAddress f20342m;

        protected C10638a(String str, C10681e eVar, C10680d dVar, boolean z, int i, InetAddress inetAddress) {
            super(str, eVar, dVar, z, i);
            this.f20342m = inetAddress;
        }

        protected C10638a(String str, C10681e eVar, C10680d dVar, boolean z, int i, byte[] bArr) {
            super(str, eVar, dVar, z, i);
            try {
                this.f20342m = InetAddress.getByAddress(bArr);
            } catch (UnknownHostException e) {
                f20341n.log(Level.WARNING, "Address() exception ", e);
            }
        }

        /* renamed from: B */
        public C10613d mo33601B(boolean z) {
            return new C10673p(mo33524d(), 0, 0, 0, z, (byte[]) null);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: D */
        public boolean mo33603D(C10656l lVar, long j) {
            if (!lVar.mo33729m0().mo33683e(this)) {
                return false;
            }
            int a = mo33521a(lVar.mo33729m0().mo33684k(mo33527f(), mo33538p(), 3600));
            if (a == 0) {
                f20341n.finer("handleQuery() Ignoring an identical address query");
                return false;
            }
            f20341n.finer("handleQuery() Conflicting query detected.");
            if (lVar.mo33721f1() && a > 0) {
                lVar.mo33729m0().mo33691r();
                lVar.mo33715c0().clear();
                Iterator<C10613d> it = lVar.mo33743v0().values().iterator();
                while (it.hasNext()) {
                    ((C10673p) it.next()).mo33797K0();
                }
            }
            lVar.mo33737r1();
            return true;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: E */
        public boolean mo33604E(C10656l lVar) {
            if (!lVar.mo33729m0().mo33683e(this)) {
                return false;
            }
            f20341n.finer("handleResponse() Denial detected");
            if (lVar.mo33721f1()) {
                lVar.mo33729m0().mo33691r();
                lVar.mo33715c0().clear();
                Iterator<C10613d> it = lVar.mo33743v0().values().iterator();
                while (it.hasNext()) {
                    ((C10673p) it.next()).mo33797K0();
                }
            }
            lVar.mo33737r1();
            return true;
        }

        /* renamed from: F */
        public boolean mo33605F() {
            return false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: J */
        public boolean mo33609J(C10637h hVar) {
            if (!(hVar instanceof C10638a)) {
                return false;
            }
            C10638a aVar = (C10638a) hVar;
            if (mo33619P() != null || aVar.mo33619P() == null) {
                return mo33619P().equals(aVar.mo33619P());
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: P */
        public InetAddress mo33619P() {
            return this.f20342m;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: Q */
        public boolean mo33620Q(C10637h hVar) {
            return mo33523c().equalsIgnoreCase(hVar.mo33523c());
        }

        /* access modifiers changed from: protected */
        /* renamed from: t */
        public void mo33542t(DataOutputStream dataOutputStream) {
            super.mo33542t(dataOutputStream);
            byte[] address = mo33619P().getAddress();
            for (byte writeByte : address) {
                dataOutputStream.writeByte(writeByte);
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: v */
        public void mo33545v(StringBuilder sb) {
            C10637h.super.mo33545v(sb);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(" address: '");
            sb2.append(mo33619P() != null ? mo33619P().getHostAddress() : "null");
            sb2.append("'");
            sb.append(sb2.toString());
        }

        /* renamed from: z */
        public C10612c mo33618z(C10656l lVar) {
            C10613d B = mo33601B(false);
            ((C10673p) B).mo33798L0(lVar);
            return new C10672o(lVar, B.mo33483x(), B.mo33473m(), B);
        }
    }

    /* renamed from: d.a.g.h$b */
    public static class C10639b extends C10637h {

        /* renamed from: m */
        String f20343m;

        /* renamed from: n */
        String f20344n;

        public C10639b(String str, C10680d dVar, boolean z, int i, String str2, String str3) {
            super(str, C10681e.TYPE_HINFO, dVar, z, i);
            this.f20344n = str2;
            this.f20343m = str3;
        }

        /* renamed from: B */
        public C10613d mo33601B(boolean z) {
            HashMap hashMap = new HashMap(2);
            hashMap.put("cpu", this.f20344n);
            hashMap.put("os", this.f20343m);
            return new C10673p(mo33524d(), 0, 0, 0, z, (Map<String, ?>) hashMap);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: D */
        public boolean mo33603D(C10656l lVar, long j) {
            return false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: E */
        public boolean mo33604E(C10656l lVar) {
            return false;
        }

        /* renamed from: F */
        public boolean mo33605F() {
            return true;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: J */
        public boolean mo33609J(C10637h hVar) {
            if (!(hVar instanceof C10639b)) {
                return false;
            }
            C10639b bVar = (C10639b) hVar;
            if (this.f20344n != null || bVar.f20344n == null) {
                return (this.f20343m != null || bVar.f20343m == null) && this.f20344n.equals(bVar.f20344n) && this.f20343m.equals(bVar.f20343m);
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: O */
        public void mo33614O(C10626f.C10627a aVar) {
            String str = this.f20344n + " " + this.f20343m;
            aVar.mo33595s(str, 0, str.length());
        }

        /* access modifiers changed from: protected */
        /* renamed from: v */
        public void mo33545v(StringBuilder sb) {
            C10637h.super.mo33545v(sb);
            sb.append(" cpu: '" + this.f20344n + "' os: '" + this.f20343m + "'");
        }

        /* renamed from: z */
        public C10612c mo33618z(C10656l lVar) {
            C10613d B = mo33601B(false);
            ((C10673p) B).mo33798L0(lVar);
            return new C10672o(lVar, B.mo33483x(), B.mo33473m(), B);
        }
    }

    /* renamed from: d.a.g.h$c */
    public static class C10640c extends C10638a {
        C10640c(String str, C10680d dVar, boolean z, int i, InetAddress inetAddress) {
            super(str, C10681e.TYPE_A, dVar, z, i, inetAddress);
        }

        C10640c(String str, C10680d dVar, boolean z, int i, byte[] bArr) {
            super(str, C10681e.TYPE_A, dVar, z, i, bArr);
        }

        /* renamed from: B */
        public C10613d mo33601B(boolean z) {
            C10673p pVar = (C10673p) super.mo33601B(z);
            pVar.mo33792D((Inet4Address) this.f20342m);
            return pVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: O */
        public void mo33614O(C10626f.C10627a aVar) {
            InetAddress inetAddress = this.f20342m;
            if (inetAddress != null) {
                byte[] address = inetAddress.getAddress();
                if (!(this.f20342m instanceof Inet4Address)) {
                    byte[] bArr = new byte[4];
                    System.arraycopy(address, 12, bArr, 0, 4);
                    address = bArr;
                }
                aVar.mo33588b(address, 0, address.length);
            }
        }
    }

    /* renamed from: d.a.g.h$d */
    public static class C10641d extends C10638a {
        C10641d(String str, C10680d dVar, boolean z, int i, InetAddress inetAddress) {
            super(str, C10681e.TYPE_AAAA, dVar, z, i, inetAddress);
        }

        C10641d(String str, C10680d dVar, boolean z, int i, byte[] bArr) {
            super(str, C10681e.TYPE_AAAA, dVar, z, i, bArr);
        }

        /* renamed from: B */
        public C10613d mo33601B(boolean z) {
            C10673p pVar = (C10673p) super.mo33601B(z);
            pVar.mo33793E((Inet6Address) this.f20342m);
            return pVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: O */
        public void mo33614O(C10626f.C10627a aVar) {
            InetAddress inetAddress = this.f20342m;
            if (inetAddress != null) {
                byte[] address = inetAddress.getAddress();
                if (this.f20342m instanceof Inet4Address) {
                    byte[] bArr = new byte[16];
                    for (int i = 0; i < 16; i++) {
                        if (i < 11) {
                            bArr[i] = address[i - 12];
                        } else {
                            bArr[i] = 0;
                        }
                    }
                    address = bArr;
                }
                aVar.mo33588b(address, 0, address.length);
            }
        }
    }

    /* renamed from: d.a.g.h$e */
    public static class C10642e extends C10637h {

        /* renamed from: m */
        private final String f20345m;

        public C10642e(String str, C10680d dVar, boolean z, int i, String str2) {
            super(str, C10681e.TYPE_PTR, dVar, z, i);
            this.f20345m = str2;
        }

        /* renamed from: B */
        public C10613d mo33601B(boolean z) {
            if (mo33537o()) {
                return new C10673p(C10673p.m26319Y(mo33621P()), 0, 0, 0, z, (byte[]) null);
            }
            if (mo33533k()) {
                return new C10673p(mo33524d(), 0, 0, 0, z, (byte[]) null);
            }
            if (mo33531i()) {
                return new C10673p(mo33524d(), 0, 0, 0, z, (byte[]) null);
            }
            Map<C10613d.C10614a, String> Y = C10673p.m26319Y(mo33621P());
            Y.put(C10613d.C10614a.Subtype, mo33524d().get(C10613d.C10614a.Subtype));
            return new C10673p(Y, 0, 0, 0, z, mo33621P());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: D */
        public boolean mo33603D(C10656l lVar, long j) {
            return false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: E */
        public boolean mo33604E(C10656l lVar) {
            return false;
        }

        /* renamed from: F */
        public boolean mo33605F() {
            return false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: J */
        public boolean mo33609J(C10637h hVar) {
            if (!(hVar instanceof C10642e)) {
                return false;
            }
            C10642e eVar = (C10642e) hVar;
            if (this.f20345m != null || eVar.f20345m == null) {
                return this.f20345m.equals(eVar.f20345m);
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: O */
        public void mo33614O(C10626f.C10627a aVar) {
            aVar.mo33590h(this.f20345m);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: P */
        public String mo33621P() {
            return this.f20345m;
        }

        /* renamed from: l */
        public boolean mo33534l(C10620b bVar) {
            return super.mo33534l(bVar) && (bVar instanceof C10642e) && mo33609J((C10642e) bVar);
        }

        /* access modifiers changed from: protected */
        /* renamed from: v */
        public void mo33545v(StringBuilder sb) {
            C10637h.super.mo33545v(sb);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(" alias: '");
            String str = this.f20345m;
            sb2.append(str != null ? str.toString() : "null");
            sb2.append("'");
            sb.append(sb2.toString());
        }

        /* renamed from: z */
        public C10612c mo33618z(C10656l lVar) {
            C10613d B = mo33601B(false);
            ((C10673p) B).mo33798L0(lVar);
            String x = B.mo33483x();
            return new C10672o(lVar, x, C10656l.m26222w1(x, mo33621P()), B);
        }
    }

    /* renamed from: d.a.g.h$f */
    public static class C10643f extends C10637h {

        /* renamed from: q */
        private static Logger f20346q = Logger.getLogger(C10643f.class.getName());

        /* renamed from: m */
        private final int f20347m;

        /* renamed from: n */
        private final int f20348n;

        /* renamed from: o */
        private final int f20349o;

        /* renamed from: p */
        private final String f20350p;

        public C10643f(String str, C10680d dVar, boolean z, int i, int i2, int i3, int i4, String str2) {
            super(str, C10681e.TYPE_SRV, dVar, z, i);
            this.f20347m = i2;
            this.f20348n = i3;
            this.f20349o = i4;
            this.f20350p = str2;
        }

        /* renamed from: B */
        public C10613d mo33601B(boolean z) {
            return new C10673p(mo33524d(), this.f20349o, this.f20348n, this.f20347m, z, this.f20350p);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: D */
        public boolean mo33603D(C10656l lVar, long j) {
            C10673p pVar = (C10673p) lVar.mo33743v0().get(mo33522b());
            if (pVar != null && ((pVar.mo33814p0() || pVar.mo33813l0()) && (this.f20349o != pVar.mo33474o() || !this.f20350p.equalsIgnoreCase(lVar.mo33729m0().mo33690q())))) {
                Logger logger = f20346q;
                logger.finer("handleQuery() Conflicting probe detected from: " + mo33616x());
                C10643f fVar = new C10643f(pVar.mo33479t(), C10680d.CLASS_IN, true, 3600, pVar.mo33475p(), pVar.mo33484y(), pVar.mo33474o(), lVar.mo33729m0().mo33690q());
                try {
                    if (lVar.mo33724j0().equals(mo33616x())) {
                        Logger logger2 = f20346q;
                        logger2.warning("Got conflicting probe from ourselves\nincoming: " + toString() + IOUtils.LINE_SEPARATOR_UNIX + "local   : " + fVar.toString());
                    }
                } catch (IOException e) {
                    f20346q.log(Level.WARNING, "IOException", e);
                }
                int a = mo33521a(fVar);
                if (a == 0) {
                    f20346q.finer("handleQuery() Ignoring a identical service query");
                    return false;
                } else if (pVar.mo33816s0() && a > 0) {
                    String lowerCase = pVar.mo33479t().toLowerCase();
                    pVar.mo33799M0(lVar.mo33702F0(pVar.mo33473m()));
                    lVar.mo33743v0().remove(lowerCase);
                    lVar.mo33743v0().put(pVar.mo33479t().toLowerCase(), pVar);
                    Logger logger3 = f20346q;
                    logger3.finer("handleQuery() Lost tie break: new unique name chosen:" + pVar.mo33473m());
                    pVar.mo33797K0();
                    return true;
                }
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: E */
        public boolean mo33604E(C10656l lVar) {
            C10673p pVar = (C10673p) lVar.mo33743v0().get(mo33522b());
            if (pVar == null) {
                return false;
            }
            if (this.f20349o == pVar.mo33474o() && this.f20350p.equalsIgnoreCase(lVar.mo33729m0().mo33690q())) {
                return false;
            }
            f20346q.finer("handleResponse() Denial detected");
            if (pVar.mo33816s0()) {
                String lowerCase = pVar.mo33479t().toLowerCase();
                pVar.mo33799M0(lVar.mo33702F0(pVar.mo33473m()));
                lVar.mo33743v0().remove(lowerCase);
                lVar.mo33743v0().put(pVar.mo33479t().toLowerCase(), pVar);
                Logger logger = f20346q;
                logger.finer("handleResponse() New unique name chose:" + pVar.mo33473m());
            }
            pVar.mo33797K0();
            return true;
        }

        /* renamed from: F */
        public boolean mo33605F() {
            return true;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: J */
        public boolean mo33609J(C10637h hVar) {
            if (!(hVar instanceof C10643f)) {
                return false;
            }
            C10643f fVar = (C10643f) hVar;
            return this.f20347m == fVar.f20347m && this.f20348n == fVar.f20348n && this.f20349o == fVar.f20349o && this.f20350p.equals(fVar.f20350p);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: O */
        public void mo33614O(C10626f.C10627a aVar) {
            aVar.mo33594o(this.f20347m);
            aVar.mo33594o(this.f20348n);
            aVar.mo33594o(this.f20349o);
            if (C10621c.f20307m) {
                aVar.mo33590h(this.f20350p);
                return;
            }
            String str = this.f20350p;
            aVar.mo33595s(str, 0, str.length());
            aVar.mo33587a(0);
        }

        /* renamed from: P */
        public int mo33622P() {
            return this.f20349o;
        }

        /* renamed from: Q */
        public int mo33623Q() {
            return this.f20347m;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: R */
        public String mo33624R() {
            return this.f20350p;
        }

        /* renamed from: S */
        public int mo33625S() {
            return this.f20348n;
        }

        /* access modifiers changed from: protected */
        /* renamed from: t */
        public void mo33542t(DataOutputStream dataOutputStream) {
            super.mo33542t(dataOutputStream);
            dataOutputStream.writeShort(this.f20347m);
            dataOutputStream.writeShort(this.f20348n);
            dataOutputStream.writeShort(this.f20349o);
            try {
                dataOutputStream.write(this.f20350p.getBytes("UTF-8"));
            } catch (UnsupportedEncodingException unused) {
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: v */
        public void mo33545v(StringBuilder sb) {
            C10637h.super.mo33545v(sb);
            sb.append(" server: '" + this.f20350p + Constants.COLON_SEPARATOR + this.f20349o + "'");
        }

        /* renamed from: z */
        public C10612c mo33618z(C10656l lVar) {
            C10613d B = mo33601B(false);
            ((C10673p) B).mo33798L0(lVar);
            return new C10672o(lVar, B.mo33483x(), B.mo33473m(), B);
        }
    }

    /* renamed from: d.a.g.h$g */
    public static class C10644g extends C10637h {

        /* renamed from: m */
        private final byte[] f20351m;

        public C10644g(String str, C10680d dVar, boolean z, int i, byte[] bArr) {
            super(str, C10681e.TYPE_TXT, dVar, z, i);
            this.f20351m = (bArr == null || bArr.length <= 0) ? C10637h.f20337l : bArr;
        }

        /* renamed from: B */
        public C10613d mo33601B(boolean z) {
            return new C10673p(mo33524d(), 0, 0, 0, z, this.f20351m);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: D */
        public boolean mo33603D(C10656l lVar, long j) {
            return false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: E */
        public boolean mo33604E(C10656l lVar) {
            return false;
        }

        /* renamed from: F */
        public boolean mo33605F() {
            return true;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: J */
        public boolean mo33609J(C10637h hVar) {
            if (!(hVar instanceof C10644g)) {
                return false;
            }
            C10644g gVar = (C10644g) hVar;
            if (this.f20351m == null && gVar.f20351m != null) {
                return false;
            }
            int length = gVar.f20351m.length;
            byte[] bArr = this.f20351m;
            if (length != bArr.length) {
                return false;
            }
            int length2 = bArr.length;
            while (true) {
                int i = length2 - 1;
                if (length2 <= 0) {
                    return true;
                }
                if (gVar.f20351m[i] != this.f20351m[i]) {
                    return false;
                }
                length2 = i;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: O */
        public void mo33614O(C10626f.C10627a aVar) {
            byte[] bArr = this.f20351m;
            aVar.mo33588b(bArr, 0, bArr.length);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: P */
        public byte[] mo33626P() {
            return this.f20351m;
        }

        /* access modifiers changed from: protected */
        /* renamed from: v */
        public void mo33545v(StringBuilder sb) {
            String str;
            C10637h.super.mo33545v(sb);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(" text: '");
            if (this.f20351m.length > 20) {
                str = new String(this.f20351m, 0, 17) + "...";
            } else {
                str = new String(this.f20351m);
            }
            sb2.append(str);
            sb2.append("'");
            sb.append(sb2.toString());
        }

        /* renamed from: z */
        public C10612c mo33618z(C10656l lVar) {
            C10613d B = mo33601B(false);
            ((C10673p) B).mo33798L0(lVar);
            return new C10672o(lVar, B.mo33483x(), B.mo33473m(), B);
        }
    }

    C10637h(String str, C10681e eVar, C10680d dVar, boolean z, int i) {
        super(str, eVar, dVar, z);
        this.f20338h = i;
    }

    /* renamed from: A */
    public C10613d mo33600A() {
        return mo33601B(false);
    }

    /* renamed from: B */
    public abstract C10613d mo33601B(boolean z);

    /* renamed from: C */
    public int mo33602C() {
        return this.f20338h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D */
    public abstract boolean mo33603D(C10656l lVar, long j);

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public abstract boolean mo33604E(C10656l lVar);

    /* renamed from: F */
    public abstract boolean mo33605F();

    /* renamed from: G */
    public boolean mo33606G(long j) {
        return mo33615w(50) <= j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H */
    public void mo33607H(C10637h hVar) {
        this.f20339i = hVar.f20339i;
        this.f20338h = hVar.f20338h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I */
    public boolean mo33608I(C10637h hVar) {
        return mo33527f() == hVar.mo33527f();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J */
    public abstract boolean mo33609J(C10637h hVar);

    /* renamed from: K */
    public void mo33610K(InetAddress inetAddress) {
        this.f20340j = inetAddress;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: L */
    public void mo33611L(long j) {
        this.f20339i = j;
        this.f20338h = 1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: M */
    public boolean mo33612M(C10621c cVar) {
        try {
            for (C10637h N : cVar.mo33561b()) {
                if (mo33613N(N)) {
                    return true;
                }
            }
            return false;
        } catch (ArrayIndexOutOfBoundsException e) {
            Logger logger = f20336k;
            Level level = Level.WARNING;
            logger.log(level, "suppressedBy() message " + cVar + " exception ", e);
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: N */
    public boolean mo33613N(C10637h hVar) {
        return equals(hVar) && hVar.f20338h > this.f20338h / 2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: O */
    public abstract void mo33614O(C10626f.C10627a aVar);

    public boolean equals(Object obj) {
        return (obj instanceof C10637h) && super.equals(obj) && mo33609J((C10637h) obj);
    }

    /* renamed from: j */
    public boolean mo33532j(long j) {
        return mo33615w(100) <= j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public void mo33545v(StringBuilder sb) {
        super.mo33545v(sb);
        sb.append(" ttl: '" + mo33617y(System.currentTimeMillis()) + MiotCloudImpl.COOKIE_PATH + this.f20338h + "'");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public long mo33615w(int i) {
        return this.f20339i + (((long) (i * this.f20338h)) * 10);
    }

    /* renamed from: x */
    public InetAddress mo33616x() {
        return this.f20340j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public int mo33617y(long j) {
        return (int) Math.max(0, (mo33615w(100) - j) / 1000);
    }

    /* renamed from: z */
    public abstract C10612c mo33618z(C10656l lVar);
}
