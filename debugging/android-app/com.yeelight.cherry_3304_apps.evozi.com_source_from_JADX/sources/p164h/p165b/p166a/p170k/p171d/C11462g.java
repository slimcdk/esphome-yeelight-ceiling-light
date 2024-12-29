package p164h.p165b.p166a.p170k.p171d;

import java.net.URLStreamHandler;
import java.net.URLStreamHandlerFactory;
import java.util.logging.Logger;
import sun.net.www.protocol.http.Handler;

/* renamed from: h.b.a.k.d.g */
public class C11462g implements URLStreamHandlerFactory {

    /* renamed from: a */
    private static final Logger f22802a = Logger.getLogger(C11462g.class.getName());

    /* renamed from: h.b.a.k.d.g$a */
    class C11463a extends Handler {
        C11463a(C11462g gVar) {
        }
    }

    /* JADX WARNING: type inference failed for: r4v3, types: [h.b.a.k.d.g$a, java.net.URLStreamHandler] */
    public URLStreamHandler createURLStreamHandler(String str) {
        Logger logger = f22802a;
        logger.fine("Creating new URLStreamHandler for protocol: " + str);
        if ("http".equals(str)) {
            return new C11463a(this);
        }
        return null;
    }
}
