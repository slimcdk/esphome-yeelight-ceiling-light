package p154d.p198a.p199g;

import java.net.InetAddress;
import java.util.Iterator;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.commons.p271io.IOUtils;
import p154d.p198a.C10613d;
import p154d.p198a.p199g.C10637h;
import p154d.p198a.p199g.p200r.C10680d;
import p154d.p198a.p199g.p200r.C10681e;

/* renamed from: d.a.g.g */
public class C10628g extends C10620b {

    /* renamed from: h */
    private static Logger f20334h = Logger.getLogger(C10628g.class.getName());

    /* renamed from: d.a.g.g$a */
    static /* synthetic */ class C10629a {

        /* renamed from: a */
        static final /* synthetic */ int[] f20335a;

        /* JADX WARNING: Can't wrap try/catch for region: R(18:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|18) */
        /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                d.a.g.r.e[] r0 = p154d.p198a.p199g.p200r.C10681e.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f20335a = r0
                d.a.g.r.e r1 = p154d.p198a.p199g.p200r.C10681e.TYPE_A     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f20335a     // Catch:{ NoSuchFieldError -> 0x001d }
                d.a.g.r.e r1 = p154d.p198a.p199g.p200r.C10681e.TYPE_A6     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f20335a     // Catch:{ NoSuchFieldError -> 0x0028 }
                d.a.g.r.e r1 = p154d.p198a.p199g.p200r.C10681e.TYPE_AAAA     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f20335a     // Catch:{ NoSuchFieldError -> 0x0033 }
                d.a.g.r.e r1 = p154d.p198a.p199g.p200r.C10681e.TYPE_ANY     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f20335a     // Catch:{ NoSuchFieldError -> 0x003e }
                d.a.g.r.e r1 = p154d.p198a.p199g.p200r.C10681e.TYPE_HINFO     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f20335a     // Catch:{ NoSuchFieldError -> 0x0049 }
                d.a.g.r.e r1 = p154d.p198a.p199g.p200r.C10681e.TYPE_PTR     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f20335a     // Catch:{ NoSuchFieldError -> 0x0054 }
                d.a.g.r.e r1 = p154d.p198a.p199g.p200r.C10681e.TYPE_SRV     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f20335a     // Catch:{ NoSuchFieldError -> 0x0060 }
                d.a.g.r.e r1 = p154d.p198a.p199g.p200r.C10681e.TYPE_TXT     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p154d.p198a.p199g.C10628g.C10629a.<clinit>():void");
        }
    }

    /* renamed from: d.a.g.g$b */
    private static class C10630b extends C10628g {
        C10630b(String str, C10681e eVar, C10680d dVar, boolean z) {
            super(str, eVar, dVar, z);
        }

        /* renamed from: n */
        public boolean mo33536n(C10620b bVar) {
            return bVar != null;
        }

        /* renamed from: w */
        public void mo33596w(C10656l lVar, Set<C10637h> set) {
            String lowerCase = mo33523c().toLowerCase();
            if (lVar.mo33729m0().mo33690q().equalsIgnoreCase(lowerCase)) {
                set.addAll(lVar.mo33729m0().mo33679a(mo33538p(), 3600));
            } else if (lVar.mo33741u0().containsKey(lowerCase)) {
                new C10634f(mo33523c(), C10681e.TYPE_PTR, mo33525e(), mo33538p()).mo33596w(lVar, set);
            } else {
                mo33597x(lVar, set, (C10673p) lVar.mo33743v0().get(lowerCase));
            }
        }

        /* renamed from: z */
        public boolean mo33599z(C10656l lVar) {
            String lowerCase = mo33523c().toLowerCase();
            return lVar.mo33729m0().mo33690q().equals(lowerCase) || lVar.mo33743v0().keySet().contains(lowerCase);
        }
    }

    /* renamed from: d.a.g.g$c */
    private static class C10631c extends C10628g {
        C10631c(String str, C10681e eVar, C10680d dVar, boolean z) {
            super(str, eVar, dVar, z);
        }

        /* renamed from: w */
        public void mo33596w(C10656l lVar, Set<C10637h> set) {
            C10637h.C10638a k = lVar.mo33729m0().mo33684k(mo33527f(), true, 3600);
            if (k != null) {
                set.add(k);
            }
        }

        /* renamed from: z */
        public boolean mo33599z(C10656l lVar) {
            String lowerCase = mo33523c().toLowerCase();
            return lVar.mo33729m0().mo33690q().equals(lowerCase) || lVar.mo33743v0().keySet().contains(lowerCase);
        }
    }

    /* renamed from: d.a.g.g$d */
    private static class C10632d extends C10628g {
        C10632d(String str, C10681e eVar, C10680d dVar, boolean z) {
            super(str, eVar, dVar, z);
        }

        /* renamed from: w */
        public void mo33596w(C10656l lVar, Set<C10637h> set) {
            C10637h.C10638a k = lVar.mo33729m0().mo33684k(mo33527f(), true, 3600);
            if (k != null) {
                set.add(k);
            }
        }

        /* renamed from: z */
        public boolean mo33599z(C10656l lVar) {
            String lowerCase = mo33523c().toLowerCase();
            return lVar.mo33729m0().mo33690q().equals(lowerCase) || lVar.mo33743v0().keySet().contains(lowerCase);
        }
    }

    /* renamed from: d.a.g.g$e */
    private static class C10633e extends C10628g {
        C10633e(String str, C10681e eVar, C10680d dVar, boolean z) {
            super(str, eVar, dVar, z);
        }
    }

    /* renamed from: d.a.g.g$f */
    private static class C10634f extends C10628g {
        C10634f(String str, C10681e eVar, C10680d dVar, boolean z) {
            super(str, eVar, dVar, z);
        }

        /* renamed from: w */
        public void mo33596w(C10656l lVar, Set<C10637h> set) {
            Iterator<C10613d> it = lVar.mo33743v0().values().iterator();
            while (it.hasNext()) {
                mo33597x(lVar, set, (C10673p) it.next());
            }
            if (mo33537o()) {
                for (String str : lVar.mo33741u0().keySet()) {
                    set.add(new C10637h.C10642e("_services._dns-sd._udp.local.", C10680d.CLASS_IN, false, 3600, lVar.mo33741u0().get(str).mo33762d()));
                }
            } else if (mo33533k()) {
                String str2 = mo33524d().get(C10613d.C10614a.Instance);
                if (str2 != null && str2.length() > 0) {
                    InetAddress o = lVar.mo33729m0().mo33688o();
                    if (str2.equalsIgnoreCase(o != null ? o.getHostAddress() : "")) {
                        if (mo33539q()) {
                            set.add(lVar.mo33729m0().mo33685l(C10681e.TYPE_A, false, 3600));
                        }
                        if (mo33540r()) {
                            set.add(lVar.mo33729m0().mo33685l(C10681e.TYPE_AAAA, false, 3600));
                        }
                    }
                }
            } else {
                mo33531i();
            }
        }
    }

    /* renamed from: d.a.g.g$g */
    private static class C10635g extends C10628g {
        C10635g(String str, C10681e eVar, C10680d dVar, boolean z) {
            super(str, eVar, dVar, z);
        }

        /* renamed from: w */
        public void mo33596w(C10656l lVar, Set<C10637h> set) {
            String lowerCase = mo33523c().toLowerCase();
            if (lVar.mo33729m0().mo33690q().equalsIgnoreCase(lowerCase)) {
                set.addAll(lVar.mo33729m0().mo33679a(mo33538p(), 3600));
            } else if (lVar.mo33741u0().containsKey(lowerCase)) {
                new C10634f(mo33523c(), C10681e.TYPE_PTR, mo33525e(), mo33538p()).mo33596w(lVar, set);
            } else {
                mo33597x(lVar, set, (C10673p) lVar.mo33743v0().get(lowerCase));
            }
        }

        /* renamed from: z */
        public boolean mo33599z(C10656l lVar) {
            String lowerCase = mo33523c().toLowerCase();
            return lVar.mo33729m0().mo33690q().equals(lowerCase) || lVar.mo33743v0().keySet().contains(lowerCase);
        }
    }

    /* renamed from: d.a.g.g$h */
    private static class C10636h extends C10628g {
        C10636h(String str, C10681e eVar, C10680d dVar, boolean z) {
            super(str, eVar, dVar, z);
        }

        /* renamed from: w */
        public void mo33596w(C10656l lVar, Set<C10637h> set) {
            mo33597x(lVar, set, (C10673p) lVar.mo33743v0().get(mo33523c().toLowerCase()));
        }

        /* renamed from: z */
        public boolean mo33599z(C10656l lVar) {
            String lowerCase = mo33523c().toLowerCase();
            return lVar.mo33729m0().mo33690q().equals(lowerCase) || lVar.mo33743v0().keySet().contains(lowerCase);
        }
    }

    C10628g(String str, C10681e eVar, C10680d dVar, boolean z) {
        super(str, eVar, dVar, z);
    }

    /* renamed from: A */
    public static C10628g m26033A(String str, C10681e eVar, C10680d dVar, boolean z) {
        switch (C10629a.f20335a[eVar.ordinal()]) {
            case 1:
                return new C10631c(str, eVar, dVar, z);
            case 2:
                return new C10632d(str, eVar, dVar, z);
            case 3:
                return new C10632d(str, eVar, dVar, z);
            case 4:
                return new C10630b(str, eVar, dVar, z);
            case 5:
                return new C10633e(str, eVar, dVar, z);
            case 6:
                return new C10634f(str, eVar, dVar, z);
            case 7:
                return new C10635g(str, eVar, dVar, z);
            case 8:
                return new C10636h(str, eVar, dVar, z);
            default:
                return new C10628g(str, eVar, dVar, z);
        }
    }

    /* renamed from: j */
    public boolean mo33532j(long j) {
        return false;
    }

    /* renamed from: v */
    public void mo33545v(StringBuilder sb) {
    }

    /* renamed from: w */
    public void mo33596w(C10656l lVar, Set<C10637h> set) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public void mo33597x(C10656l lVar, Set<C10637h> set, C10673p pVar) {
        if (pVar != null && pVar.mo33813l0()) {
            if (mo33523c().equalsIgnoreCase(pVar.mo33479t()) || mo33523c().equalsIgnoreCase(pVar.mo33483x())) {
                set.addAll(lVar.mo33729m0().mo33679a(true, 3600));
                set.addAll(pVar.mo33795F(true, 3600, lVar.mo33729m0()));
            }
            if (f20334h.isLoggable(Level.FINER)) {
                Logger logger = f20334h;
                logger.finer(lVar.mo33731n0() + " DNSQuestion(" + mo33523c() + ").addAnswersForServiceInfo(): info: " + pVar + IOUtils.LINE_SEPARATOR_UNIX + set);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public boolean mo33598y(C10620b bVar) {
        return mo33535m(bVar) && mo33536n(bVar) && mo33523c().equals(bVar.mo33523c());
    }

    /* renamed from: z */
    public boolean mo33599z(C10656l lVar) {
        return false;
    }
}
