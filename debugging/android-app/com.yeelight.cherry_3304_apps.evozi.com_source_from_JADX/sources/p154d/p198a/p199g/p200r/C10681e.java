package p154d.p198a.p199g.p200r;

import androidx.recyclerview.widget.ItemTouchHelper;
import com.xiaomi.mistatistic.sdk.BaseService;
import java.util.logging.Logger;

/* renamed from: d.a.g.r.e */
public enum C10681e {
    TYPE_IGNORE("ignore", 0),
    TYPE_A("a", 1),
    TYPE_NS("ns", 2),
    TYPE_MD("md", 3),
    TYPE_MF("mf", 4),
    TYPE_CNAME("cname", 5),
    TYPE_SOA("soa", 6),
    TYPE_MB("mb", 7),
    TYPE_MG("mg", 8),
    TYPE_MR("mr", 9),
    TYPE_NULL("null", 10),
    TYPE_WKS("wks", 11),
    TYPE_PTR("ptr", 12),
    TYPE_HINFO("hinfo", 13),
    TYPE_MINFO("minfo", 14),
    TYPE_MX("mx", 15),
    TYPE_TXT("txt", 16),
    TYPE_RP("rp", 17),
    TYPE_AFSDB("afsdb", 18),
    TYPE_X25("x25", 19),
    TYPE_ISDN("isdn", 20),
    TYPE_RT("rt", 21),
    TYPE_NSAP("nsap", 22),
    TYPE_NSAP_PTR("nsap-otr", 23),
    TYPE_SIG("sig", 24),
    TYPE_KEY(BaseService.KEY, 25),
    TYPE_PX("px", 26),
    TYPE_GPOS("gpos", 27),
    TYPE_AAAA("aaaa", 28),
    TYPE_LOC("loc", 29),
    TYPE_NXT("nxt", 30),
    TYPE_EID("eid", 31),
    TYPE_NIMLOC("nimloc", 32),
    TYPE_SRV("srv", 33),
    TYPE_ATMA("atma", 34),
    TYPE_NAPTR("naptr", 35),
    TYPE_KX("kx", 36),
    TYPE_CERT("cert", 37),
    TYPE_A6("a6", 38),
    TYPE_DNAME("dname", 39),
    TYPE_SINK("sink", 40),
    TYPE_OPT("opt", 41),
    TYPE_APL("apl", 42),
    TYPE_DS("ds", 43),
    TYPE_SSHFP("sshfp", 44),
    TYPE_RRSIG("rrsig", 46),
    TYPE_NSEC("nsec", 47),
    TYPE_DNSKEY("dnskey", 48),
    TYPE_UINFO("uinfo", 100),
    TYPE_UID("uid", 101),
    TYPE_GID("gid", 102),
    TYPE_UNSPEC("unspec", 103),
    TYPE_TKEY("tkey", 249),
    TYPE_TSIG("tsig", ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION),
    TYPE_IXFR("ixfr", 251),
    TYPE_AXFR("axfr", 252),
    TYPE_MAILA("mails", 253),
    TYPE_MAILB("mailb", 254),
    TYPE_ANY("any", 255);
    

    /* renamed from: m0 */
    private static Logger f20531m0;

    /* renamed from: a */
    private final int f20546a;

    static {
        f20531m0 = Logger.getLogger(C10681e.class.getName());
    }

    private C10681e(String str, int i) {
        this.f20546a = i;
    }

    /* renamed from: b */
    public static C10681e m26380b(int i) {
        for (C10681e eVar : values()) {
            if (eVar.f20546a == i) {
                return eVar;
            }
        }
        f20531m0.severe("Could not find record type for index: " + i);
        return TYPE_IGNORE;
    }

    /* renamed from: a */
    public int mo33827a() {
        return this.f20546a;
    }

    public String toString() {
        return name() + " index " + mo33827a();
    }
}
