package p231y2;

import java.net.InetAddress;
import java.net.UnknownHostException;

/* renamed from: y2.g */
public interface C12025g {

    /* renamed from: a */
    public static final C12025g f22045a = new C12026a();

    /* renamed from: y2.g$a */
    static class C12026a implements C12025g {
        C12026a() {
        }

        /* renamed from: a */
        public InetAddress[] mo42643a(String str) {
            if (str != null) {
                return InetAddress.getAllByName(str);
            }
            throw new UnknownHostException("host == null");
        }
    }

    /* renamed from: a */
    InetAddress[] mo42643a(String str);
}
