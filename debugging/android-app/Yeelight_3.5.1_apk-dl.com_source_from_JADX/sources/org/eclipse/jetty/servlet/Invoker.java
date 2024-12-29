package org.eclipse.jetty.servlet;

import com.xiaomi.mipush.sdk.Constants;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import javax.servlet.UnavailableException;
import javax.servlet.http.C9277a;
import javax.servlet.http.C9278b;
import javax.servlet.http.C9279c;
import javax.servlet.http.HttpServlet;
import org.eclipse.jetty.http.PathMap;
import org.eclipse.jetty.server.handler.C9943d;
import org.eclipse.jetty.server.handler.C9950h;
import org.eclipse.jetty.util.C9997p;
import org.eclipse.jetty.util.LazyList;
import p152e6.C9001b;
import p152e6.C9003c;
import p208s4.C10357i;
import p223w3.C11671t;
import p239z5.C12151b;
import p239z5.C12175i;
import p239z5.C12181o;

public class Invoker extends HttpServlet {
    private static final C9003c LOG = C9001b.m21450a(Invoker.class);
    private C9943d _contextHandler;
    private Map.Entry _invokerEntry;
    private boolean _nonContextServlets;
    private Map _parameters;
    private C9968d _servletHandler;
    private boolean _verbose;

    /* renamed from: org.eclipse.jetty.servlet.Invoker$a */
    class C9956a extends C9278b {

        /* renamed from: b */
        String f18296b;

        /* renamed from: c */
        String f18297c;

        /* renamed from: d */
        boolean f18298d;

        C9956a(Invoker invoker, C9277a aVar, boolean z, String str, String str2, String str3) {
            super(aVar);
            this.f18298d = z;
            this.f18296b = C9997p.m24723a(str2, str);
            String substring = str3.substring(str.length() + 1);
            this.f18297c = substring;
            if (substring.length() == 0) {
                this.f18297c = null;
            }
        }

        /* renamed from: a */
        public Object mo40040a(String str) {
            if (this.f18298d) {
                if (str.equals("javax.servlet.include.request_uri")) {
                    return C9997p.m24723a(C9997p.m24723a(mo37761e(), this.f18296b), this.f18297c);
                }
                if (str.equals("javax.servlet.include.path_info")) {
                    return this.f18297c;
                }
                if (str.equals("javax.servlet.include.servlet_path")) {
                    return this.f18296b;
                }
            }
            return super.mo40040a(str);
        }

        /* renamed from: g */
        public String mo37763g() {
            return this.f18298d ? super.mo37763g() : this.f18297c;
        }

        /* renamed from: s */
        public String mo37771s() {
            return this.f18298d ? super.mo37771s() : this.f18296b;
        }
    }

    private ServletHolder getHolder(ServletHolder[] servletHolderArr, String str) {
        ServletHolder servletHolder = null;
        if (servletHolderArr == null) {
            return null;
        }
        int i = 0;
        while (servletHolder == null && i < servletHolderArr.length) {
            if (servletHolderArr[i].getName().equals(str)) {
                servletHolder = servletHolderArr[i];
            }
            i++;
        }
        return servletHolder;
    }

    public void init() {
        C12175i R0;
        C9943d d = ((C9943d.C9945b) getServletContext()).mo39960d();
        this._contextHandler = d;
        C9950h hVar = d;
        while (true) {
            R0 = hVar.mo39983R0();
            if (R0 == null || (R0 instanceof C9968d) || !(R0 instanceof C9950h)) {
                this._servletHandler = (C9968d) R0;
                Enumeration<String> initParameterNames = getInitParameterNames();
            } else {
                hVar = (C9950h) R0;
            }
        }
        this._servletHandler = (C9968d) R0;
        Enumeration<String> initParameterNames2 = getInitParameterNames();
        while (initParameterNames2.hasMoreElements()) {
            String nextElement = initParameterNames2.nextElement();
            String initParameter = getInitParameter(nextElement);
            String lowerCase = initParameter.toLowerCase(Locale.ENGLISH);
            boolean z = true;
            if ("nonContextServlets".equals(nextElement)) {
                this._nonContextServlets = initParameter.length() > 0 && lowerCase.startsWith(C11671t.f21438C);
            }
            if ("verbose".equals(nextElement)) {
                if (initParameter.length() <= 0 || !lowerCase.startsWith(C11671t.f21438C)) {
                    z = false;
                }
                this._verbose = z;
            } else {
                if (this._parameters == null) {
                    this._parameters = new HashMap();
                }
                this._parameters.put(nextElement, initParameter);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void service(C9277a aVar, C9279c cVar) {
        String str;
        boolean z;
        String str2;
        ServletHolder servletHolder;
        ServletHolder servletHolder2;
        String str3 = (String) aVar.mo40040a("javax.servlet.include.servlet_path");
        int i = 1;
        if (str3 == null) {
            str = aVar.mo37771s();
            z = false;
        } else {
            str = str3;
            z = true;
        }
        String str4 = (String) aVar.mo40040a("javax.servlet.include.path_info");
        if (str4 == null) {
            str4 = aVar.mo37763g();
        }
        String str5 = str4;
        if (str5 == null || str5.length() <= 1) {
            cVar.mo37778k(404);
            return;
        }
        if (str5.charAt(0) != '/') {
            i = 0;
        }
        int indexOf = str5.indexOf(47, i);
        String substring = indexOf < 0 ? str5.substring(i) : str5.substring(i, indexOf);
        ServletHolder holder = getHolder(this._servletHandler.mo40095j1(), substring);
        if (holder != null) {
            C9003c cVar2 = LOG;
            if (cVar2.mo36846a()) {
                cVar2.mo36850e("Adding servlet mapping for named servlet:" + substring + Constants.COLON_SEPARATOR + C9997p.m24723a(str, substring) + "/*", new Object[0]);
            }
            C9971e eVar = new C9971e();
            eVar.mo40110d(substring);
            eVar.mo40109c(C9997p.m24723a(str, substring) + "/*");
            C9968d dVar = this._servletHandler;
            dVar.mo40100p1((C9971e[]) LazyList.addToArray(dVar.mo40094i1(), eVar, C9971e.class));
            str2 = substring;
            servletHolder = holder;
        } else {
            if (substring.endsWith(".class")) {
                substring = substring.substring(0, substring.length() - 6);
            }
            if (substring == null || substring.length() == 0) {
                cVar.mo37778k(404);
                return;
            }
            synchronized (this._servletHandler) {
                this._invokerEntry = this._servletHandler.mo40091g1(str);
                String a = C9997p.m24723a(str, substring);
                PathMap.C9886a g1 = this._servletHandler.mo40091g1(a);
                if (g1 == null || g1.equals(this._invokerEntry)) {
                    C9003c cVar3 = LOG;
                    if (cVar3.mo36846a()) {
                        cVar3.mo36850e("Making new servlet=" + substring + " with path=" + a + "/*", new Object[0]);
                    }
                    C9968d dVar2 = this._servletHandler;
                    ServletHolder Z0 = dVar2.mo40085Z0(substring, a + "/*");
                    Map map = this._parameters;
                    if (map != null) {
                        Z0.mo40031L0(map);
                    }
                    try {
                        Z0.start();
                        if (!this._nonContextServlets) {
                            C10357i U0 = Z0.mo40045U0();
                            if (this._contextHandler.mo39940j1() != U0.getClass().getClassLoader()) {
                                Z0.stop();
                                C9003c cVar4 = LOG;
                                cVar4.mo36847b("Dynamic servlet " + U0 + " not loaded from context " + aVar.mo37761e(), new Object[0]);
                                throw new UnavailableException("Not in context");
                            }
                        }
                        if (this._verbose && cVar3.mo36846a()) {
                            cVar3.mo36850e("Dynamic load '" + substring + "' at " + a, new Object[0]);
                        }
                        servletHolder2 = Z0;
                    } catch (Exception e) {
                        LOG.mo36848c(e);
                        throw new UnavailableException(e.toString());
                    } catch (Exception e2) {
                        LOG.mo36849d(e2);
                    }
                } else {
                    servletHolder2 = (ServletHolder) g1.getValue();
                }
            }
            str2 = substring;
            servletHolder = servletHolder2;
        }
        if (servletHolder != null) {
            servletHolder.mo40047W0(aVar instanceof C12181o ? (C12181o) aVar : C12151b.m31593o().mo42994v(), new C9956a(this, aVar, z, str2, str, str5), cVar);
            return;
        }
        C9003c cVar5 = LOG;
        cVar5.mo36855i("Can't find holder for servlet: " + str2, new Object[0]);
        cVar.mo37778k(404);
    }
}
