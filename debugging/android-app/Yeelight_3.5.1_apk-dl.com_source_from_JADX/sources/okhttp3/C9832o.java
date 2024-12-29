package okhttp3;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.List;

/* renamed from: okhttp3.o */
public interface C9832o {

    /* renamed from: a */
    public static final C9832o f17823a = new C9833a();

    /* renamed from: okhttp3.o$a */
    class C9833a implements C9832o {
        C9833a() {
        }

        /* renamed from: a */
        public List<InetAddress> mo39079a(String str) {
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
    List<InetAddress> mo39079a(String str);
}
