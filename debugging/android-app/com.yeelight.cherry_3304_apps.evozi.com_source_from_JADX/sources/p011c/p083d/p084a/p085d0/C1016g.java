package p011c.p083d.p084a.p085d0;

import java.net.InetAddress;
import java.net.UnknownHostException;

/* renamed from: c.d.a.d0.g */
public interface C1016g {

    /* renamed from: a */
    public static final C1016g f1323a = new C1017a();

    /* renamed from: c.d.a.d0.g$a */
    static class C1017a implements C1016g {
        C1017a() {
        }

        /* renamed from: a */
        public InetAddress[] mo9467a(String str) {
            if (str != null) {
                return InetAddress.getAllByName(str);
            }
            throw new UnknownHostException("host == null");
        }
    }

    /* renamed from: a */
    InetAddress[] mo9467a(String str);
}
