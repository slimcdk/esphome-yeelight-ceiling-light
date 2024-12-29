package p156f;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.List;

/* renamed from: f.o */
public interface C10831o {

    /* renamed from: a */
    public static final C10831o f20891a = new C10832a();

    /* renamed from: f.o$a */
    class C10832a implements C10831o {
        C10832a() {
        }

        /* renamed from: a */
        public List<InetAddress> mo34159a(String str) {
            if (str != null) {
                try {
                    return Arrays.asList(InetAddress.getAllByName(str));
                } catch (NullPointerException e) {
                    UnknownHostException unknownHostException = new UnknownHostException("Broken system behaviour for dns lookup of " + str);
                    unknownHostException.initCause(e);
                    throw unknownHostException;
                }
            } else {
                throw new UnknownHostException("hostname == null");
            }
        }
    }

    /* renamed from: a */
    List<InetAddress> mo34159a(String str);
}
