package p154d.p198a.p199g.p201s;

import java.util.Timer;
import java.util.logging.Level;
import java.util.logging.Logger;
import p154d.p198a.p199g.C10656l;

/* renamed from: d.a.g.s.b */
public class C10687b extends C10686a {

    /* renamed from: b */
    static Logger f20586b = Logger.getLogger(C10687b.class.getName());

    public C10687b(C10656l lVar) {
        super(lVar);
    }

    /* renamed from: g */
    public String mo33846g() {
        StringBuilder sb = new StringBuilder();
        sb.append("RecordReaper(");
        sb.append(mo33845f() != null ? mo33845f().mo33731n0() : "");
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: h */
    public void mo33848h(Timer timer) {
        if (!mo33845f().mo33713Y0() && !mo33845f().mo33709S0()) {
            timer.schedule(this, 10000, 10000);
        }
    }

    public void run() {
        if (!mo33845f().mo33713Y0() && !mo33845f().mo33709S0()) {
            if (f20586b.isLoggable(Level.FINEST)) {
                Logger logger = f20586b;
                logger.finest(mo33846g() + ".run() JmDNS reaping cache");
            }
            mo33845f().mo33712X();
        }
    }
}
