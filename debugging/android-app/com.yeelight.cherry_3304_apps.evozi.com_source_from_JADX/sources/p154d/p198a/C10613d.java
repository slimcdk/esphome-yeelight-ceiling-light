package p154d.p198a;

import java.net.Inet4Address;
import java.net.Inet6Address;
import java.util.Enumeration;
import java.util.Map;
import p154d.p198a.p199g.C10673p;

/* renamed from: d.a.d */
public abstract class C10613d implements Cloneable {

    /* renamed from: a */
    public static final byte[] f20289a = new byte[0];

    /* renamed from: d.a.d$a */
    public enum C10614a {
        Domain,
        Protocol,
        Application,
        Instance,
        Subtype
    }

    /* renamed from: c */
    public static C10613d m25922c(String str, String str2, int i, int i2, int i3, Map<String, ?> map) {
        return new C10673p(str, str2, "", i, i2, i3, false, map);
    }

    /* renamed from: A */
    public abstract boolean mo33465A();

    /* renamed from: b */
    public C10613d clone() {
        try {
            return (C10613d) super.clone();
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    /* renamed from: d */
    public abstract String mo33468d();

    /* renamed from: e */
    public abstract String mo33469e();

    /* renamed from: f */
    public abstract Inet4Address[] mo33470f();

    /* renamed from: k */
    public abstract Inet6Address[] mo33471k();

    /* renamed from: l */
    public abstract String mo33472l();

    /* renamed from: m */
    public abstract String mo33473m();

    /* renamed from: o */
    public abstract int mo33474o();

    /* renamed from: p */
    public abstract int mo33475p();

    /* renamed from: q */
    public abstract Enumeration<String> mo33476q();

    /* renamed from: r */
    public abstract String mo33477r(String str);

    /* renamed from: s */
    public abstract String mo33478s();

    /* renamed from: t */
    public abstract String mo33479t();

    /* renamed from: u */
    public abstract String mo33480u();

    /* renamed from: v */
    public abstract String mo33481v();

    /* renamed from: w */
    public abstract byte[] mo33482w();

    /* renamed from: x */
    public abstract String mo33483x();

    /* renamed from: y */
    public abstract int mo33484y();

    /* renamed from: z */
    public abstract boolean mo33485z();
}
