package javax.jmdns.impl;

import com.xiaomi.mipush.sdk.Constants;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;
import javax.jmdns.ServiceInfo;
import javax.jmdns.impl.constants.DNSRecordClass;
import javax.jmdns.impl.constants.DNSRecordType;
import p223w3.C11627r;

/* renamed from: javax.jmdns.impl.b */
public abstract class C9240b {

    /* renamed from: a */
    private final String f17123a;

    /* renamed from: b */
    private final String f17124b;

    /* renamed from: c */
    private final String f17125c;

    /* renamed from: d */
    private final DNSRecordType f17126d;

    /* renamed from: e */
    private final DNSRecordClass f17127e;

    /* renamed from: f */
    private final boolean f17128f;

    /* renamed from: g */
    final Map<ServiceInfo.Fields, String> f17129g;

    C9240b(String str, DNSRecordType dNSRecordType, DNSRecordClass dNSRecordClass, boolean z) {
        String str2;
        String str3;
        this.f17124b = str;
        this.f17126d = dNSRecordType;
        this.f17127e = dNSRecordClass;
        this.f17128f = z;
        Map<ServiceInfo.Fields, String> U = ServiceInfoImpl.m22401U(mo37554c());
        this.f17129g = U;
        String str4 = U.get(ServiceInfo.Fields.Domain);
        String str5 = U.get(ServiceInfo.Fields.Protocol);
        String str6 = U.get(ServiceInfo.Fields.Application);
        String lowerCase = U.get(ServiceInfo.Fields.Instance).toLowerCase();
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
        String sb2 = sb.toString();
        this.f17125c = sb2;
        StringBuilder sb3 = new StringBuilder();
        if (lowerCase.length() > 0) {
            str7 = lowerCase + ".";
        }
        sb3.append(str7);
        sb3.append(sb2);
        this.f17123a = sb3.toString().toLowerCase();
    }

    /* renamed from: a */
    public int mo37552a(C9240b bVar) {
        byte[] u = mo37575u();
        byte[] u2 = bVar.mo37575u();
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
    public String mo37553b() {
        String str = this.f17123a;
        return str != null ? str : "";
    }

    /* renamed from: c */
    public String mo37554c() {
        String str = this.f17124b;
        return str != null ? str : "";
    }

    /* renamed from: d */
    public Map<ServiceInfo.Fields, String> mo37555d() {
        return Collections.unmodifiableMap(this.f17129g);
    }

    /* renamed from: e */
    public DNSRecordClass mo37556e() {
        DNSRecordClass dNSRecordClass = this.f17127e;
        return dNSRecordClass != null ? dNSRecordClass : DNSRecordClass.CLASS_UNKNOWN;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C9240b)) {
            return false;
        }
        C9240b bVar = (C9240b) obj;
        return mo37553b().equals(bVar.mo37553b()) && mo37558f().equals(bVar.mo37558f()) && mo37556e() == bVar.mo37556e();
    }

    /* renamed from: f */
    public DNSRecordType mo37558f() {
        DNSRecordType dNSRecordType = this.f17126d;
        return dNSRecordType != null ? dNSRecordType : DNSRecordType.TYPE_IGNORE;
    }

    /* renamed from: g */
    public String mo37559g() {
        String str = mo37555d().get(ServiceInfo.Fields.Subtype);
        return str != null ? str : "";
    }

    /* renamed from: h */
    public String mo37560h() {
        String str = this.f17125c;
        return str != null ? str : "";
    }

    public int hashCode() {
        return mo37553b().hashCode() + mo37558f().indexValue() + mo37556e().indexValue();
    }

    /* renamed from: i */
    public boolean mo37562i() {
        if (!this.f17129g.get(ServiceInfo.Fields.Application).equals("dns-sd")) {
            return false;
        }
        String str = this.f17129g.get(ServiceInfo.Fields.Instance);
        return "b".equals(str) || "db".equals(str) || C11627r.f21359c0.equals(str) || "dr".equals(str) || "lb".equals(str);
    }

    /* renamed from: j */
    public abstract boolean mo37563j(long j);

    /* renamed from: k */
    public boolean mo37564k() {
        return mo37570q() || mo37571r();
    }

    /* renamed from: l */
    public boolean mo37565l(C9240b bVar) {
        return mo37553b().equals(bVar.mo37553b()) && mo37558f().equals(bVar.mo37558f()) && (DNSRecordClass.CLASS_ANY == bVar.mo37556e() || mo37556e().equals(bVar.mo37556e()));
    }

    /* renamed from: m */
    public boolean mo37566m(C9240b bVar) {
        return bVar != null && bVar.mo37556e() == mo37556e();
    }

    /* renamed from: n */
    public boolean mo37567n(C9240b bVar) {
        return bVar != null && bVar.mo37558f() == mo37558f();
    }

    /* renamed from: o */
    public boolean mo37568o() {
        return this.f17129g.get(ServiceInfo.Fields.Application).equals("dns-sd") && this.f17129g.get(ServiceInfo.Fields.Instance).equals("_services");
    }

    /* renamed from: p */
    public boolean mo37569p() {
        return this.f17128f;
    }

    /* renamed from: q */
    public boolean mo37570q() {
        return this.f17129g.get(ServiceInfo.Fields.Domain).endsWith("in-addr.arpa");
    }

    /* renamed from: r */
    public boolean mo37571r() {
        return this.f17129g.get(ServiceInfo.Fields.Domain).endsWith("ip6.arpa");
    }

    /* renamed from: s */
    public boolean mo37572s(C9240b bVar) {
        return mo37559g().equals(bVar.mo37559g());
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public void mo37573t(DataOutputStream dataOutputStream) {
        dataOutputStream.write(mo37554c().getBytes("UTF8"));
        dataOutputStream.writeShort(mo37558f().indexValue());
        dataOutputStream.writeShort(mo37556e().indexValue());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(200);
        sb.append("[" + getClass().getSimpleName() + "@" + System.identityHashCode(this));
        StringBuilder sb2 = new StringBuilder();
        sb2.append(" type: ");
        sb2.append(mo37558f());
        sb.append(sb2.toString());
        sb.append(", class: " + mo37556e());
        sb.append(this.f17128f ? "-unique," : Constants.ACCEPT_TIME_SEPARATOR_SP);
        sb.append(" name: " + this.f17124b);
        mo37576v(sb);
        sb.append("]");
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public byte[] mo37575u() {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            mo37573t(dataOutputStream);
            dataOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException unused) {
            throw new InternalError();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public void mo37576v(StringBuilder sb) {
    }
}
