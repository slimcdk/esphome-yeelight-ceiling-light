package p214t6;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import org.fourthline.cling.model.C10023k;

/* renamed from: t6.j */
public class C10410j {

    /* renamed from: d */
    private static final Logger f19495d = Logger.getLogger(C10410j.class.getName());

    /* renamed from: a */
    private final long f19496a;

    /* renamed from: b */
    private final long f19497b;

    /* renamed from: c */
    private final long f19498c;

    public C10410j(long j, long j2, long j3) {
        if (j > j2) {
            Logger logger = f19495d;
            logger.warning("UPnP specification violation, allowed value range minimum '" + j + "' is greater than maximum '" + j2 + "', switching values.");
            this.f19496a = j2;
            this.f19497b = j;
        } else {
            this.f19496a = j;
            this.f19497b = j2;
        }
        this.f19498c = j3;
    }

    /* renamed from: a */
    public long mo42104a() {
        return this.f19497b;
    }

    /* renamed from: b */
    public long mo42105b() {
        return this.f19496a;
    }

    /* renamed from: c */
    public long mo42106c() {
        return this.f19498c;
    }

    /* renamed from: d */
    public boolean mo42107d(long j) {
        return j >= mo42105b() && j <= mo42104a() && j % this.f19498c == 0;
    }

    /* renamed from: e */
    public List<C10023k> mo42108e() {
        return new ArrayList();
    }

    public String toString() {
        return "Range Min: " + mo42105b() + " Max: " + mo42104a() + " Step: " + mo42106c();
    }
}
