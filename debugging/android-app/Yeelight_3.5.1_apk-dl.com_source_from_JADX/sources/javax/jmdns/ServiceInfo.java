package javax.jmdns;

import java.net.Inet4Address;
import java.net.Inet6Address;
import java.util.Enumeration;
import java.util.Map;
import javax.jmdns.impl.ServiceInfoImpl;

public abstract class ServiceInfo implements Cloneable {

    /* renamed from: a */
    public static final byte[] f17049a = new byte[0];

    public enum Fields {
        Domain,
        Protocol,
        Application,
        Instance,
        Subtype
    }

    /* renamed from: c */
    public static ServiceInfo m22248c(String str, String str2, int i, int i2, int i3, Map<String, ?> map) {
        return new ServiceInfoImpl(str, str2, "", i, i2, i3, false, map);
    }

    /* renamed from: C */
    public abstract boolean mo37316C();

    /* renamed from: b */
    public ServiceInfo clone() {
        try {
            return (ServiceInfo) super.clone();
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    /* renamed from: d */
    public abstract String mo37319d();

    /* renamed from: e */
    public abstract String mo37320e();

    /* renamed from: f */
    public abstract Inet4Address[] mo37321f();

    /* renamed from: g */
    public abstract Inet6Address[] mo37322g();

    /* renamed from: h */
    public abstract String mo37323h();

    /* renamed from: i */
    public abstract String mo37324i();

    /* renamed from: j */
    public abstract int mo37325j();

    /* renamed from: k */
    public abstract int mo37326k();

    /* renamed from: o */
    public abstract Enumeration<String> mo37327o();

    /* renamed from: p */
    public abstract String mo37328p(String str);

    /* renamed from: q */
    public abstract String mo37329q();

    /* renamed from: r */
    public abstract String mo37330r();

    /* renamed from: s */
    public abstract String mo37331s();

    /* renamed from: t */
    public abstract String mo37332t();

    /* renamed from: u */
    public abstract byte[] mo37333u();

    /* renamed from: w */
    public abstract String mo37334w();

    /* renamed from: x */
    public abstract int mo37335x();

    /* renamed from: y */
    public abstract boolean mo37336y();
}
