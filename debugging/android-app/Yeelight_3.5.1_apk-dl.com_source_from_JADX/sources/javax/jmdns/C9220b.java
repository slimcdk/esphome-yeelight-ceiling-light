package javax.jmdns;

import java.net.InetAddress;
import java.util.concurrent.atomic.AtomicReference;
import javax.jmdns.impl.C9275k;

/* renamed from: javax.jmdns.b */
public interface C9220b {

    /* renamed from: javax.jmdns.b$a */
    public static final class C9221a {

        /* renamed from: a */
        private static volatile C9220b f17050a;

        /* renamed from: b */
        private static final AtomicReference<C9222a> f17051b = new AtomicReference<>();

        /* renamed from: javax.jmdns.b$a$a */
        public interface C9222a {
            /* renamed from: a */
            C9220b mo37345a();
        }

        private C9221a() {
        }

        /* renamed from: a */
        public static C9220b m22278a() {
            if (f17050a == null) {
                synchronized (C9221a.class) {
                    if (f17050a == null) {
                        f17050a = m22279b();
                    }
                }
            }
            return f17050a;
        }

        /* renamed from: b */
        protected static C9220b m22279b() {
            C9222a aVar = f17051b.get();
            C9220b a = aVar != null ? aVar.mo37345a() : null;
            return a != null ? a : new C9275k();
        }
    }

    /* renamed from: a */
    InetAddress[] mo37344a();
}
