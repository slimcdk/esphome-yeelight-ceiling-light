package p198p4;

import java.util.Timer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.jmdns.impl.JmDNSImpl;

/* renamed from: p4.b */
public class C10269b extends C10268a {

    /* renamed from: b */
    static Logger f19336b = Logger.getLogger(C10269b.class.getName());

    public C10269b(JmDNSImpl jmDNSImpl) {
        super(jmDNSImpl);
    }

    /* renamed from: g */
    public String mo41754g() {
        StringBuilder sb = new StringBuilder();
        sb.append("RecordReaper(");
        sb.append(mo41753f() != null ? mo41753f().mo37444o0() : "");
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: h */
    public void mo41756h(Timer timer) {
        if (!mo41753f().mo37413S0() && !mo41753f().mo37411N0()) {
            timer.schedule(this, 10000, 10000);
        }
    }

    public void run() {
        if (!mo41753f().mo37413S0() && !mo41753f().mo37411N0()) {
            if (f19336b.isLoggable(Level.FINEST)) {
                Logger logger = f19336b;
                logger.finest(mo41754g() + ".run() JmDNS reaping cache");
            }
            mo41753f().mo37412P();
        }
    }
}
