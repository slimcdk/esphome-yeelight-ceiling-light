package p230x6;

import java.util.logging.Logger;
import org.fourthline.cling.C10010b;
import org.fourthline.cling.model.message.C10030d;
import org.fourthline.cling.model.message.C10031e;
import p218u6.C10542c;

/* renamed from: x6.c */
public abstract class C12006c<IN extends C10030d, OUT extends C10031e> extends C12005b<IN> {

    /* renamed from: f */
    private static final Logger f21981f = Logger.getLogger(C10010b.class.getName());

    /* renamed from: d */
    protected final C10542c f21982d;

    /* renamed from: e */
    protected OUT f21983e;

    protected C12006c(C10010b bVar, IN in) {
        super(bVar, in);
        this.f21982d = new C10542c(in);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo42598b() {
        OUT f = mo42604f();
        this.f21983e = f;
        if (f != null && mo42606h().mo42203d().size() > 0) {
            Logger logger = f21981f;
            logger.fine("Setting extra headers on response message: " + mo42606h().mo42203d().size());
            this.f21983e.mo40403j().putAll(mo42606h().mo42203d());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public abstract OUT mo42604f();

    /* renamed from: g */
    public OUT mo42605g() {
        return this.f21983e;
    }

    /* renamed from: h */
    public C10542c mo42606h() {
        return this.f21982d;
    }

    /* renamed from: i */
    public void mo42607i(Throwable th) {
    }

    /* renamed from: j */
    public void mo42608j(C10031e eVar) {
    }

    public String toString() {
        return "(" + getClass().getSimpleName() + ")";
    }
}
