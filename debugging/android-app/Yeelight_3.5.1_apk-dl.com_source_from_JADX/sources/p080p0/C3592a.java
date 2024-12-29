package p080p0;

import com.google.code.microlog4android.Level;
import com.google.code.microlog4android.factory.DefaultAppenderFactory;
import com.google.code.microlog4android.repository.C2187b;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import p084q0.C3613b;

/* renamed from: p0.a */
public final class C3592a {

    /* renamed from: e */
    private static final C3594c f5984e = new C3594c();

    /* renamed from: f */
    private static final List<C3613b> f5985f = new ArrayList(4);

    /* renamed from: g */
    private static boolean f5986g = true;

    /* renamed from: a */
    private C2187b f5987a = null;

    /* renamed from: b */
    private String f5988b = "Microlog";

    /* renamed from: c */
    private String f5989c;

    /* renamed from: d */
    private Level f5990d;

    static {
        Level level = Level.DEBUG;
    }

    public C3592a(String str) {
        this.f5989c = str;
    }

    public C3592a(String str, C2187b bVar) {
        this.f5989c = str;
        this.f5987a = bVar;
    }

    /* renamed from: b */
    private void m10158b() {
        if (f5985f.size() == 0) {
            mo25866a(DefaultAppenderFactory.createDefaultAppender());
        }
    }

    /* renamed from: a */
    public void mo25866a(C3613b bVar) {
        if (bVar != null) {
            List<C3613b> list = f5985f;
            if (!list.contains(bVar)) {
                list.add(bVar);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Appender not allowed to be null");
    }

    /* renamed from: c */
    public void mo25867c() {
        for (C3613b close : f5985f) {
            close.close();
        }
        f5984e.mo25893d();
        f5986g = true;
    }

    /* renamed from: d */
    public void mo25868d(Object obj) {
        mo25879o(Level.DEBUG, obj, (Throwable) null);
    }

    /* renamed from: e */
    public void mo25869e(Object obj, Throwable th) {
        mo25879o(Level.DEBUG, obj, th);
    }

    /* renamed from: f */
    public void mo25870f(Object obj) {
        mo25879o(Level.ERROR, obj, (Throwable) null);
    }

    /* renamed from: g */
    public void mo25871g(Object obj, Throwable th) {
        mo25879o(Level.ERROR, obj, th);
    }

    /* renamed from: h */
    public C3613b mo25872h(int i) {
        return f5985f.get(i);
    }

    /* renamed from: i */
    public Level mo25873i() {
        Level level = this.f5990d;
        if (level != null || this.f5989c.equals("")) {
            return level;
        }
        C2187b bVar = this.f5987a;
        if (bVar != null) {
            return bVar.getEffectiveLevel(this.f5989c);
        }
        throw new IllegalStateException("CommonLoggerRepository has not been set");
    }

    /* renamed from: j */
    public Level mo25874j() {
        return this.f5990d;
    }

    /* renamed from: k */
    public String mo25875k() {
        return this.f5989c;
    }

    /* renamed from: l */
    public int mo25876l() {
        return f5985f.size();
    }

    /* renamed from: m */
    public void mo25877m(Object obj) {
        mo25879o(Level.INFO, obj, (Throwable) null);
    }

    /* renamed from: n */
    public void mo25878n(Object obj, Throwable th) {
        mo25879o(Level.INFO, obj, th);
    }

    /* renamed from: o */
    public void mo25879o(Level level, Object obj, Throwable th) {
        if (level == null) {
            throw new IllegalArgumentException("The level must not be null.");
        } else if (mo25873i().toInt() <= level.toInt() && level.toInt() > -1) {
            if (f5986g) {
                m10158b();
                try {
                    mo25880p();
                } catch (IOException e) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Failed to open the log. ");
                    sb.append(e);
                }
                f5984e.mo25892c();
                f5986g = false;
            }
            for (C3613b a : f5985f) {
                a.mo25917a(this.f5988b, this.f5989c, f5984e.mo25890a(), level, obj, th);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public void mo25880p() {
        for (C3613b open : f5985f) {
            open.open();
        }
    }

    /* renamed from: q */
    public synchronized void mo25881q() {
        f5985f.clear();
        C3594c cVar = f5984e;
        cVar.mo25893d();
        cVar.mo25891b();
        f5986g = true;
    }

    /* renamed from: r */
    public void mo25882r(String str) {
        this.f5988b = str;
    }

    /* renamed from: s */
    public synchronized void mo25883s(C2187b bVar) {
        this.f5987a = bVar;
    }

    /* renamed from: t */
    public void mo25884t(Level level) {
        if (level != null) {
            this.f5990d = level;
            return;
        }
        throw new IllegalArgumentException("The level must not be null.");
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(super.toString());
        stringBuffer.append('[');
        for (C3613b append : f5985f) {
            stringBuffer.append(append);
            stringBuffer.append(';');
        }
        stringBuffer.append(']');
        return stringBuffer.toString();
    }

    /* renamed from: u */
    public void mo25886u(Object obj) {
        mo25879o(Level.TRACE, obj, (Throwable) null);
    }

    /* renamed from: v */
    public void mo25887v(Object obj, Throwable th) {
        mo25879o(Level.TRACE, obj, th);
    }

    /* renamed from: w */
    public void mo25888w(Object obj) {
        mo25879o(Level.WARN, obj, (Throwable) null);
    }

    /* renamed from: x */
    public void mo25889x(Object obj, Throwable th) {
        mo25879o(Level.WARN, obj, th);
    }
}
