package p158f7;

import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: f7.a */
public class C9045a {

    /* renamed from: a */
    private int f16599a = -1;

    /* renamed from: b */
    private int f16600b = -1;

    /* renamed from: c */
    private boolean f16601c = false;

    /* renamed from: d */
    private List<String> f16602d = new ArrayList();

    /* renamed from: e */
    private boolean f16603e = false;

    /* renamed from: f */
    private List<String> f16604f = new ArrayList();

    /* renamed from: g */
    private boolean f16605g = false;

    /* renamed from: h */
    private boolean f16606h = true;

    /* renamed from: i */
    private boolean f16607i = false;

    /* renamed from: j */
    private boolean f16608j = false;

    /* renamed from: k */
    private Map<String, String> f16609k = new HashMap();

    /* renamed from: a */
    private StringBuilder m21647a(String str, StringBuilder sb) {
        if (sb.length() > 0) {
            sb.append(", ");
        }
        sb.append(str);
        return sb;
    }

    /* renamed from: u */
    public static C9045a m21648u(String str) {
        String str2;
        List<String> e;
        if (str == null) {
            return null;
        }
        C9045a aVar = new C9045a();
        for (String trim : str.split(Constants.ACCEPT_TIME_SEPARATOR_SP)) {
            String[] split = trim.trim().split("=");
            String trim2 = split[0].trim();
            if (split.length > 1) {
                str2 = split[1].trim();
                if (str2.startsWith("\"")) {
                    str2 = str2.substring(1);
                }
                if (str2.endsWith("\"")) {
                    str2 = str2.substring(0, str2.length() - 1);
                }
            } else {
                str2 = null;
            }
            String lowerCase = trim2.toLowerCase();
            if ("no-cache".equals(lowerCase)) {
                aVar.mo36956o(true);
                if (str2 != null && !"".equals(str2)) {
                    e = aVar.mo36943d();
                }
            } else {
                if ("private".equals(lowerCase)) {
                    aVar.mo36959r(true);
                    if (str2 != null && !"".equals(str2)) {
                        e = aVar.mo36944e();
                    }
                } else if ("no-store".equals(lowerCase)) {
                    aVar.mo36957p(true);
                } else if ("max-age".equals(lowerCase)) {
                    if (str2 != null) {
                        aVar.mo36954m(Integer.valueOf(str2).intValue());
                    } else {
                        throw new IllegalArgumentException("CacheControl max-age header does not have a value: " + str2);
                    }
                } else if ("s-maxage".equals(lowerCase)) {
                    if (str2 != null) {
                        aVar.mo36961t(Integer.valueOf(str2).intValue());
                    } else {
                        throw new IllegalArgumentException("CacheControl s-maxage header does not have a value: " + str2);
                    }
                } else if ("no-transform".equals(lowerCase)) {
                    aVar.mo36958q(true);
                } else if ("must-revalidate".equals(lowerCase)) {
                    aVar.mo36955n(true);
                } else if ("proxy-revalidate".equals(lowerCase)) {
                    aVar.mo36960s(true);
                } else if (!"public".equals(lowerCase)) {
                    if (str2 == null) {
                        str2 = "";
                    }
                    aVar.mo36941b().put(trim2, str2);
                }
            }
            e.add(str2);
        }
        return aVar;
    }

    /* renamed from: b */
    public Map<String, String> mo36941b() {
        return this.f16609k;
    }

    /* renamed from: c */
    public int mo36942c() {
        return this.f16599a;
    }

    /* renamed from: d */
    public List<String> mo36943d() {
        return this.f16602d;
    }

    /* renamed from: e */
    public List<String> mo36944e() {
        return this.f16604f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C9045a.class != obj.getClass()) {
            return false;
        }
        C9045a aVar = (C9045a) obj;
        return this.f16599a == aVar.f16599a && this.f16607i == aVar.f16607i && this.f16601c == aVar.f16601c && this.f16605g == aVar.f16605g && this.f16606h == aVar.f16606h && this.f16603e == aVar.f16603e && this.f16608j == aVar.f16608j && this.f16600b == aVar.f16600b && this.f16609k.equals(aVar.f16609k) && this.f16602d.equals(aVar.f16602d) && this.f16604f.equals(aVar.f16604f);
    }

    /* renamed from: f */
    public int mo36946f() {
        return this.f16600b;
    }

    /* renamed from: g */
    public boolean mo36947g() {
        return this.f16607i;
    }

    /* renamed from: h */
    public boolean mo36948h() {
        return this.f16601c;
    }

    public int hashCode() {
        return (((((((((((((((((((this.f16599a * 31) + this.f16600b) * 31) + (this.f16601c ? 1 : 0)) * 31) + this.f16602d.hashCode()) * 31) + (this.f16603e ? 1 : 0)) * 31) + this.f16604f.hashCode()) * 31) + (this.f16605g ? 1 : 0)) * 31) + (this.f16606h ? 1 : 0)) * 31) + (this.f16607i ? 1 : 0)) * 31) + (this.f16608j ? 1 : 0)) * 31) + this.f16609k.hashCode();
    }

    /* renamed from: i */
    public boolean mo36950i() {
        return this.f16605g;
    }

    /* renamed from: j */
    public boolean mo36951j() {
        return this.f16606h;
    }

    /* renamed from: k */
    public boolean mo36952k() {
        return this.f16603e;
    }

    /* renamed from: l */
    public boolean mo36953l() {
        return this.f16608j;
    }

    /* renamed from: m */
    public void mo36954m(int i) {
        this.f16599a = i;
    }

    /* renamed from: n */
    public void mo36955n(boolean z) {
        this.f16607i = z;
    }

    /* renamed from: o */
    public void mo36956o(boolean z) {
        this.f16601c = z;
    }

    /* renamed from: p */
    public void mo36957p(boolean z) {
        this.f16605g = z;
    }

    /* renamed from: q */
    public void mo36958q(boolean z) {
        this.f16606h = z;
    }

    /* renamed from: r */
    public void mo36959r(boolean z) {
        this.f16603e = z;
    }

    /* renamed from: s */
    public void mo36960s(boolean z) {
        this.f16608j = z;
    }

    /* renamed from: t */
    public void mo36961t(int i) {
        this.f16600b = i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (!mo36952k()) {
            sb.append("public");
        }
        if (mo36947g()) {
            m21647a("must-revalidate", sb);
        }
        if (mo36951j()) {
            m21647a("no-transform", sb);
        }
        if (mo36950i()) {
            m21647a("no-store", sb);
        }
        if (mo36953l()) {
            m21647a("proxy-revalidate", sb);
        }
        if (mo36946f() > -1) {
            StringBuilder a = m21647a("s-maxage", sb);
            a.append("=");
            a.append(mo36946f());
        }
        if (mo36942c() > -1) {
            StringBuilder a2 = m21647a("max-age", sb);
            a2.append("=");
            a2.append(mo36942c());
        }
        if (mo36948h()) {
            if (mo36943d().size() < 1) {
                m21647a("no-cache", sb);
            } else {
                for (String append : mo36943d()) {
                    StringBuilder a3 = m21647a("no-cache", sb);
                    a3.append("=\"");
                    a3.append(append);
                    a3.append("\"");
                }
            }
        }
        if (mo36952k()) {
            if (mo36944e().size() < 1) {
                m21647a("private", sb);
            } else {
                for (String append2 : mo36944e()) {
                    StringBuilder a4 = m21647a("private", sb);
                    a4.append("=\"");
                    a4.append(append2);
                    a4.append("\"");
                }
            }
        }
        for (String next : mo36941b().keySet()) {
            String str = mo36941b().get(next);
            m21647a(next, sb);
            if (str != null && !"".equals(str)) {
                sb.append("=\"");
                sb.append(str);
                sb.append("\"");
            }
        }
        return sb.toString();
    }
}
