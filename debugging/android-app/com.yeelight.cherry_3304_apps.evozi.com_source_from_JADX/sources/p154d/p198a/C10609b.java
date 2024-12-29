package p154d.p198a;

import java.net.InetAddress;
import java.util.concurrent.atomic.AtomicReference;
import p154d.p198a.p199g.C10671n;

/* renamed from: d.a.b */
public interface C10609b {

    /* renamed from: d.a.b$a */
    public static final class C10610a {

        /* renamed from: a */
        private static volatile C10609b f20287a;

        /* renamed from: b */
        private static final AtomicReference<C10611a> f20288b = new AtomicReference<>();

        /* renamed from: d.a.b$a$a */
        public interface C10611a {
            /* renamed from: a */
            C10609b mo33458a();
        }

        private C10610a() {
        }

        /* renamed from: a */
        public static C10609b m25914a() {
            if (f20287a == null) {
                synchronized (C10610a.class) {
                    if (f20287a == null) {
                        f20287a = m25915b();
                    }
                }
            }
            return f20287a;
        }

        /* renamed from: b */
        protected static C10609b m25915b() {
            C10611a aVar = f20288b.get();
            C10609b a = aVar != null ? aVar.mo33458a() : null;
            return a != null ? a : new C10671n();
        }
    }

    /* renamed from: a */
    InetAddress[] mo33457a();
}
