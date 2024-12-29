package p164h.p165b.p166a.p240h.p248s;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import p164h.p165b.p166a.p240h.C11222l;

/* renamed from: h.b.a.h.s.q */
public class C11337q {

    /* renamed from: d */
    private static final Logger f22513d = Logger.getLogger(C11337q.class.getName());

    /* renamed from: a */
    private final long f22514a;

    /* renamed from: b */
    private final long f22515b;

    /* renamed from: c */
    private final long f22516c;

    public C11337q(long j, long j2, long j3) {
        if (j > j2) {
            Logger logger = f22513d;
            logger.warning("UPnP specification violation, allowed value range minimum '" + j + "' is greater than maximum '" + j2 + "', switching values.");
            this.f22514a = j2;
            this.f22515b = j;
        } else {
            this.f22514a = j;
            this.f22515b = j2;
        }
        this.f22516c = j3;
    }

    /* renamed from: a */
    public long mo36001a() {
        return this.f22515b;
    }

    /* renamed from: b */
    public long mo36002b() {
        return this.f22514a;
    }

    /* renamed from: c */
    public long mo36003c() {
        return this.f22516c;
    }

    /* renamed from: d */
    public boolean mo36004d(long j) {
        return j >= mo36002b() && j <= mo36001a() && j % this.f22516c == 0;
    }

    /* renamed from: e */
    public List<C11222l> mo36005e() {
        return new ArrayList();
    }

    public String toString() {
        return "Range Min: " + mo36002b() + " Max: " + mo36001a() + " Step: " + mo36003c();
    }
}
