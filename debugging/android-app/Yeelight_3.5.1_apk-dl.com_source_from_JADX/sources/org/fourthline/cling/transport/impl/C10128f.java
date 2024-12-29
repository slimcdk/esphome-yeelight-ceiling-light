package org.fourthline.cling.transport.impl;

import java.net.URLStreamHandler;
import java.net.URLStreamHandlerFactory;
import java.util.logging.Logger;
import sun.net.www.protocol.http.Handler;

/* renamed from: org.fourthline.cling.transport.impl.f */
public class C10128f implements URLStreamHandlerFactory {

    /* renamed from: a */
    private static final Logger f18708a = Logger.getLogger(C10128f.class.getName());

    /* renamed from: org.fourthline.cling.transport.impl.f$a */
    class C10129a extends Handler {
        C10129a(C10128f fVar) {
        }
    }

    /* JADX WARNING: type inference failed for: r4v3, types: [java.net.URLStreamHandler, org.fourthline.cling.transport.impl.f$a] */
    public URLStreamHandler createURLStreamHandler(String str) {
        Logger logger = f18708a;
        logger.fine("Creating new URLStreamHandler for protocol: " + str);
        if ("http".equals(str)) {
            return new C10129a(this);
        }
        return null;
    }
}
