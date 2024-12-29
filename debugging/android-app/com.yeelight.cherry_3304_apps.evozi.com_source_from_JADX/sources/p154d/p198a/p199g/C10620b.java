package p154d.p198a.p199g;

import com.xiaomi.mipush.sdk.Constants;
import com.yeelight.yeelib.p150c.p183m.C7200r;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;
import p154d.p198a.C10613d;
import p154d.p198a.p199g.p200r.C10680d;
import p154d.p198a.p199g.p200r.C10681e;

/* renamed from: d.a.g.b */
public abstract class C10620b {

    /* renamed from: a */
    private final String f20299a;

    /* renamed from: b */
    private final String f20300b;

    /* renamed from: c */
    private final String f20301c;

    /* renamed from: d */
    private final C10681e f20302d;

    /* renamed from: e */
    private final C10680d f20303e;

    /* renamed from: f */
    private final boolean f20304f;

    /* renamed from: g */
    final Map<C10613d.C10614a, String> f20305g;

    C10620b(String str, C10681e eVar, C10680d dVar, boolean z) {
        String str2;
        String str3;
        this.f20300b = str;
        this.f20302d = eVar;
        this.f20303e = dVar;
        this.f20304f = z;
        Map<C10613d.C10614a, String> Y = C10673p.m26319Y(mo33523c());
        this.f20305g = Y;
        String str4 = Y.get(C10613d.C10614a.Domain);
        String str5 = this.f20305g.get(C10613d.C10614a.Protocol);
        String str6 = this.f20305g.get(C10613d.C10614a.Application);
        String lowerCase = this.f20305g.get(C10613d.C10614a.Instance).toLowerCase();
        StringBuilder sb = new StringBuilder();
        String str7 = "";
        if (str6.length() > 0) {
            str2 = "_" + str6 + ".";
        } else {
            str2 = str7;
        }
        sb.append(str2);
        if (str5.length() > 0) {
            str3 = "_" + str5 + ".";
        } else {
            str3 = str7;
        }
        sb.append(str3);
        sb.append(str4);
        sb.append(".");
        this.f20301c = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        if (lowerCase.length() > 0) {
            str7 = lowerCase + ".";
        }
        sb2.append(str7);
        sb2.append(this.f20301c);
        this.f20299a = sb2.toString().toLowerCase();
    }

    /* renamed from: a */
    public int mo33521a(C10620b bVar) {
        byte[] u = mo33544u();
        byte[] u2 = bVar.mo33544u();
        int min = Math.min(u.length, u2.length);
        for (int i = 0; i < min; i++) {
            if (u[i] > u2[i]) {
                return 1;
            }
            if (u[i] < u2[i]) {
                return -1;
            }
        }
        return u.length - u2.length;
    }

    /* renamed from: b */
    public String mo33522b() {
        String str = this.f20299a;
        return str != null ? str : "";
    }

    /* renamed from: c */
    public String mo33523c() {
        String str = this.f20300b;
        return str != null ? str : "";
    }

    /* renamed from: d */
    public Map<C10613d.C10614a, String> mo33524d() {
        return Collections.unmodifiableMap(this.f20305g);
    }

    /* renamed from: e */
    public C10680d mo33525e() {
        C10680d dVar = this.f20303e;
        return dVar != null ? dVar : C10680d.CLASS_UNKNOWN;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C10620b)) {
            return false;
        }
        C10620b bVar = (C10620b) obj;
        return mo33522b().equals(bVar.mo33522b()) && mo33527f().equals(bVar.mo33527f()) && mo33525e() == bVar.mo33525e();
    }

    /* renamed from: f */
    public C10681e mo33527f() {
        C10681e eVar = this.f20302d;
        return eVar != null ? eVar : C10681e.TYPE_IGNORE;
    }

    /* renamed from: g */
    public String mo33528g() {
        String str = mo33524d().get(C10613d.C10614a.Subtype);
        return str != null ? str : "";
    }

    /* renamed from: h */
    public String mo33529h() {
        String str = this.f20301c;
        return str != null ? str : "";
    }

    public int hashCode() {
        return mo33522b().hashCode() + mo33527f().mo33827a() + mo33525e().mo33824b();
    }

    /* renamed from: i */
    public boolean mo33531i() {
        if (!this.f20305g.get(C10613d.C10614a.Application).equals("dns-sd")) {
            return false;
        }
        String str = this.f20305g.get(C10613d.C10614a.Instance);
        return "b".equals(str) || "db".equals(str) || C7200r.f14712G.equals(str) || "dr".equals(str) || "lb".equals(str);
    }

    /* renamed from: j */
    public abstract boolean mo33532j(long j);

    /* renamed from: k */
    public boolean mo33533k() {
        return mo33539q() || mo33540r();
    }

    /* renamed from: l */
    public boolean mo33534l(C10620b bVar) {
        return mo33522b().equals(bVar.mo33522b()) && mo33527f().equals(bVar.mo33527f()) && (C10680d.CLASS_ANY == bVar.mo33525e() || mo33525e().equals(bVar.mo33525e()));
    }

    /* renamed from: m */
    public boolean mo33535m(C10620b bVar) {
        return bVar != null && bVar.mo33525e() == mo33525e();
    }

    /* renamed from: n */
    public boolean mo33536n(C10620b bVar) {
        return bVar != null && bVar.mo33527f() == mo33527f();
    }

    /* renamed from: o */
    public boolean mo33537o() {
        return this.f20305g.get(C10613d.C10614a.Application).equals("dns-sd") && this.f20305g.get(C10613d.C10614a.Instance).equals("_services");
    }

    /* renamed from: p */
    public boolean mo33538p() {
        return this.f20304f;
    }

    /* renamed from: q */
    public boolean mo33539q() {
        return this.f20305g.get(C10613d.C10614a.Domain).endsWith("in-addr.arpa");
    }

    /* renamed from: r */
    public boolean mo33540r() {
        return this.f20305g.get(C10613d.C10614a.Domain).endsWith("ip6.arpa");
    }

    /* renamed from: s */
    public boolean mo33541s(C10620b bVar) {
        return mo33528g().equals(bVar.mo33528g());
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public void mo33542t(DataOutputStream dataOutputStream) {
        dataOutputStream.write(mo33523c().getBytes("UTF8"));
        dataOutputStream.writeShort(mo33527f().mo33827a());
        dataOutputStream.writeShort(mo33525e().mo33824b());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(200);
        sb.append("[" + getClass().getSimpleName() + "@" + System.identityHashCode(this));
        StringBuilder sb2 = new StringBuilder();
        sb2.append(" type: ");
        sb2.append(mo33527f());
        sb.append(sb2.toString());
        sb.append(", class: " + mo33525e());
        sb.append(this.f20304f ? "-unique," : Constants.ACCEPT_TIME_SEPARATOR_SP);
        sb.append(" name: " + this.f20300b);
        mo33545v(sb);
        sb.append("]");
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public byte[] mo33544u() {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            mo33542t(dataOutputStream);
            dataOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException unused) {
            throw new InternalError();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public void mo33545v(StringBuilder sb) {
    }
}
