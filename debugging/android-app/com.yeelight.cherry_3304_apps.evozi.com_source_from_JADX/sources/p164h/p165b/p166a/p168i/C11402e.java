package p164h.p165b.p166a.p168i;

import java.util.logging.Logger;
import p164h.p165b.p166a.C4423b;
import p164h.p165b.p166a.p240h.p243r.C11243d;
import p164h.p165b.p166a.p240h.p243r.C11244e;
import p164h.p165b.p166a.p240h.p249t.C11343c;

/* renamed from: h.b.a.i.e */
public abstract class C11402e<IN extends C11243d, OUT extends C11244e> extends C11401d<IN> {

    /* renamed from: f */
    private static final Logger f22680f = Logger.getLogger(C4423b.class.getName());

    /* renamed from: d */
    protected final C11343c f22681d;

    /* renamed from: e */
    protected OUT f22682e;

    protected C11402e(C4423b bVar, IN in) {
        super(bVar, in);
        this.f22681d = new C11343c(in);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo36154b() {
        OUT f = mo36160f();
        this.f22682e = f;
        if (f != null && mo36162h().mo36023d().size() > 0) {
            Logger logger = f22680f;
            logger.fine("Setting extra headers on response message: " + mo36162h().mo36023d().size());
            this.f22682e.mo35747j().putAll(mo36162h().mo36023d());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public abstract OUT mo36160f();

    /* renamed from: g */
    public OUT mo36161g() {
        return this.f22682e;
    }

    /* renamed from: h */
    public C11343c mo36162h() {
        return this.f22681d;
    }

    /* renamed from: i */
    public void mo36163i(Throwable th) {
    }

    /* renamed from: j */
    public void mo36164j(C11244e eVar) {
    }

    public String toString() {
        return "(" + getClass().getSimpleName() + ")";
    }
}
