package org.eclipse.jetty.servlet;

import com.xiaomi.mipush.sdk.Constants;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.UnavailableException;
import org.apache.commons.p194io.IOUtils;
import org.eclipse.jetty.util.C9990j;
import p147d6.C8941a;
import p147d6.C8942b;
import p147d6.C8948d;
import p152e6.C9001b;
import p152e6.C9003c;
import p208s4.C10359k;

public class Holder<T> extends C8941a implements C8948d {

    /* renamed from: l */
    private static final C9003c f18287l = C9001b.m21450a(Holder.class);

    /* renamed from: e */
    protected transient Class<? extends T> f18288e;

    /* renamed from: f */
    protected final Map<String, String> f18289f = new HashMap(3);

    /* renamed from: g */
    protected String f18290g;

    /* renamed from: h */
    protected boolean f18291h;

    /* renamed from: i */
    protected boolean f18292i = true;

    /* renamed from: j */
    protected String f18293j;

    /* renamed from: k */
    protected C9968d f18294k;

    public enum Source {
        EMBEDDED,
        JAVAX_API,
        DESCRIPTOR,
        ANNOTATION
    }

    /* renamed from: org.eclipse.jetty.servlet.Holder$a */
    protected class C9954a {
        protected C9954a() {
        }

        public String getInitParameter(String str) {
            return Holder.this.getInitParameter(str);
        }

        public Enumeration getInitParameterNames() {
            return Holder.this.mo40025F0();
        }

        public C10359k getServletContext() {
            return Holder.this.f18294k.mo40093h1();
        }
    }

    /* renamed from: org.eclipse.jetty.servlet.Holder$b */
    protected class C9955b {
        protected C9955b(Holder holder) {
        }
    }

    protected Holder(Source source) {
    }

    /* renamed from: D0 */
    public String mo40023D0() {
        return this.f18290g;
    }

    /* renamed from: E0 */
    public Class<? extends T> mo40024E0() {
        return this.f18288e;
    }

    /* renamed from: F0 */
    public Enumeration mo40025F0() {
        Map map = this.f18289f;
        return Collections.enumeration(map == null ? Collections.EMPTY_LIST : map.keySet());
    }

    /* renamed from: G0 */
    public C9968d mo40026G0() {
        return this.f18294k;
    }

    /* renamed from: H0 */
    public boolean mo40027H0() {
        return this.f18292i;
    }

    /* renamed from: I0 */
    public void mo40028I0(String str) {
        this.f18290g = str;
        this.f18288e = null;
    }

    /* renamed from: J0 */
    public void mo40029J0(Class<? extends T> cls) {
        this.f18288e = cls;
        if (cls != null) {
            this.f18290g = cls.getName();
            if (this.f18293j == null) {
                this.f18293j = cls.getName() + Constants.ACCEPT_TIME_SEPARATOR_SERVER + hashCode();
            }
        }
    }

    /* renamed from: K0 */
    public void mo40030K0(String str, String str2) {
        this.f18289f.put(str, str2);
    }

    /* renamed from: L0 */
    public void mo40031L0(Map<String, String> map) {
        this.f18289f.clear();
        this.f18289f.putAll(map);
    }

    /* renamed from: M0 */
    public void mo40032M0(String str) {
        this.f18293j = str;
    }

    /* renamed from: N0 */
    public void mo40033N0(C9968d dVar) {
        this.f18294k = dVar;
    }

    public String getInitParameter(String str) {
        Map<String, String> map = this.f18289f;
        if (map == null) {
            return null;
        }
        return map.get(str);
    }

    public String getName() {
        return this.f18293j;
    }

    /* renamed from: p0 */
    public void mo26544p0(Appendable appendable, String str) {
        appendable.append(this.f18293j).append("==").append(this.f18290g).append(" - ").append(C8941a.m21348x0(this)).append(IOUtils.LINE_SEPARATOR_UNIX);
        C8942b.m21357G0(appendable, str, this.f18289f.entrySet());
    }

    public String toString() {
        return this.f18293j;
    }

    /* renamed from: u0 */
    public void mo26547u0() {
        String str;
        if (this.f18288e == null && ((str = this.f18290g) == null || str.equals(""))) {
            throw new UnavailableException("No class for Servlet or Filter for " + this.f18293j, -1);
        } else if (this.f18288e == null) {
            try {
                this.f18288e = C9990j.m24694b(Holder.class, this.f18290g);
                C9003c cVar = f18287l;
                if (cVar.mo36846a()) {
                    cVar.mo36850e("Holding {}", this.f18288e);
                }
            } catch (Exception e) {
                f18287l.mo36856j(e);
                throw new UnavailableException(e.getMessage(), -1);
            }
        }
    }

    /* renamed from: v0 */
    public void mo26548v0() {
        if (!this.f18291h) {
            this.f18288e = null;
        }
    }
}
