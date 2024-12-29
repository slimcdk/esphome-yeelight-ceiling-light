package p164h.p211a.p212a.p227g;

import com.xiaomi.mipush.sdk.Constants;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.p271io.IOUtils;
import p154d.p155b.C10705e0;
import p164h.p211a.p212a.p228h.C11127k;
import p164h.p211a.p212a.p228h.p233x.C11145a;
import p164h.p211a.p212a.p228h.p233x.C11146b;
import p164h.p211a.p212a.p228h.p233x.C11152d;
import p164h.p211a.p212a.p228h.p234y.C11156b;
import p164h.p211a.p212a.p228h.p234y.C11158c;

/* renamed from: h.a.a.g.c */
public class C11078c<T> extends C11145a implements C11152d {

    /* renamed from: l */
    private static final C11158c f21834l = C11156b.m29015a(C11078c.class);

    /* renamed from: e */
    protected transient Class<? extends T> f21835e;

    /* renamed from: f */
    protected final Map<String, String> f21836f = new HashMap(3);

    /* renamed from: g */
    protected String f21837g;

    /* renamed from: h */
    protected boolean f21838h;

    /* renamed from: i */
    protected boolean f21839i = true;

    /* renamed from: j */
    protected String f21840j;

    /* renamed from: k */
    protected C11085e f21841k;

    /* renamed from: h.a.a.g.c$a */
    protected class C11079a {
        protected C11079a(C11078c cVar) {
        }
    }

    /* renamed from: h.a.a.g.c$b */
    protected class C11080b {
        protected C11080b(C11078c cVar) {
        }
    }

    /* renamed from: h.a.a.g.c$c */
    public enum C11081c {
        EMBEDDED,
        JAVAX_API,
        DESCRIPTOR,
        ANNOTATION
    }

    protected C11078c(C11081c cVar) {
    }

    /* renamed from: A0 */
    public C11085e mo35181A0() {
        return this.f21841k;
    }

    /* renamed from: B0 */
    public boolean mo35182B0() {
        return this.f21839i;
    }

    /* renamed from: C0 */
    public void mo35183C0(String str) {
        this.f21837g = str;
        this.f21835e = null;
    }

    /* renamed from: D0 */
    public void mo35184D0(Class<? extends T> cls) {
        this.f21835e = cls;
        if (cls != null) {
            this.f21837g = cls.getName();
            if (this.f21840j == null) {
                this.f21840j = cls.getName() + Constants.ACCEPT_TIME_SEPARATOR_SERVER + hashCode();
            }
        }
    }

    /* renamed from: E0 */
    public void mo35185E0(String str, String str2) {
        this.f21836f.put(str, str2);
    }

    /* renamed from: F0 */
    public void mo35186F0(String str) {
        this.f21840j = str;
    }

    /* renamed from: G0 */
    public void mo35187G0(C11085e eVar) {
        this.f21841k = eVar;
    }

    /* renamed from: I */
    public String mo35188I(String str) {
        Map<String, String> map = this.f21836f;
        if (map == null) {
            return null;
        }
        return map.get(str);
    }

    public String getName() {
        return this.f21840j;
    }

    /* renamed from: k0 */
    public void mo34187k0(Appendable appendable, String str) {
        appendable.append(this.f21840j).append("==").append(this.f21837g).append(" - ").append(C11145a.m28963s0(this)).append(IOUtils.LINE_SEPARATOR_UNIX);
        C11146b.m28976B0(appendable, str, this.f21836f.entrySet());
    }

    /* renamed from: p0 */
    public void mo34262p0() {
        String str;
        if (this.f21835e == null && ((str = this.f21837g) == null || str.equals(""))) {
            throw new C10705e0("No class for Servlet or Filter for " + this.f21840j, -1);
        } else if (this.f21835e == null) {
            try {
                this.f21835e = C11127k.m28893b(C11078c.class, this.f21837g);
                if (f21834l.mo35485a()) {
                    f21834l.mo35489e("Holding {}", this.f21835e);
                }
            } catch (Exception e) {
                f21834l.mo35495k(e);
                throw new C10705e0(e.getMessage(), -1);
            }
        }
    }

    /* renamed from: q0 */
    public void mo34263q0() {
        if (!this.f21838h) {
            this.f21835e = null;
        }
    }

    public String toString() {
        return this.f21840j;
    }

    /* renamed from: y0 */
    public String mo35190y0() {
        return this.f21837g;
    }

    /* renamed from: z0 */
    public Class<? extends T> mo35191z0() {
        return this.f21835e;
    }
}
