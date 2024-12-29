package javax.servlet.http;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.lang.reflect.Method;
import java.text.MessageFormat;
import java.util.Enumeration;
import java.util.ResourceBundle;
import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import org.apache.commons.p194io.IOUtils;
import p208s4.C10364p;
import p208s4.C10368t;

public abstract class HttpServlet extends GenericServlet {
    private static final String HEADER_IFMODSINCE = "If-Modified-Since";
    private static final String HEADER_LASTMOD = "Last-Modified";
    private static final String LSTRING_FILE = "javax.servlet.http.LocalStrings";
    private static final String METHOD_DELETE = "DELETE";
    private static final String METHOD_GET = "GET";
    private static final String METHOD_HEAD = "HEAD";
    private static final String METHOD_OPTIONS = "OPTIONS";
    private static final String METHOD_POST = "POST";
    private static final String METHOD_PUT = "PUT";
    private static final String METHOD_TRACE = "TRACE";
    private static ResourceBundle lStrings = ResourceBundle.getBundle(LSTRING_FILE);

    private Method[] getAllDeclaredMethods(Class<?> cls) {
        if (cls.equals(HttpServlet.class)) {
            return null;
        }
        Method[] allDeclaredMethods = getAllDeclaredMethods(cls.getSuperclass());
        Method[] declaredMethods = cls.getDeclaredMethods();
        if (allDeclaredMethods == null || allDeclaredMethods.length <= 0) {
            return declaredMethods;
        }
        Method[] methodArr = new Method[(allDeclaredMethods.length + declaredMethods.length)];
        System.arraycopy(allDeclaredMethods, 0, methodArr, 0, allDeclaredMethods.length);
        System.arraycopy(declaredMethods, 0, methodArr, allDeclaredMethods.length, declaredMethods.length);
        return methodArr;
    }

    private void maybeSetLastModified(C9279c cVar, long j) {
        if (!cVar.mo37780m(HEADER_LASTMOD) && j >= 0) {
            cVar.mo37775a(HEADER_LASTMOD, j);
        }
    }

    /* access modifiers changed from: protected */
    public void doDelete(C9277a aVar, C9279c cVar) {
        String m = aVar.mo41950m();
        cVar.mo37776d(m.endsWith("1.1") ? 405 : 400, lStrings.getString("http.method_delete_not_supported"));
    }

    /* access modifiers changed from: protected */
    public void doGet(C9277a aVar, C9279c cVar) {
        String m = aVar.mo41950m();
        cVar.mo37776d(m.endsWith("1.1") ? 405 : 400, lStrings.getString("http.method_get_not_supported"));
    }

    /* access modifiers changed from: protected */
    public void doHead(C9277a aVar, C9279c cVar) {
        C9287k kVar = new C9287k(cVar);
        doGet(aVar, kVar);
        kVar.mo37799t();
    }

    /* access modifiers changed from: protected */
    public void doOptions(C9277a aVar, C9279c cVar) {
        String str;
        String str2;
        Method[] allDeclaredMethods = getAllDeclaredMethods(getClass());
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        for (Method method : allDeclaredMethods) {
            if (method.getName().equals("doGet")) {
                z = true;
                z2 = true;
            }
            if (method.getName().equals("doPost")) {
                z3 = true;
            }
            if (method.getName().equals("doPut")) {
                z4 = true;
            }
            if (method.getName().equals("doDelete")) {
                z5 = true;
            }
        }
        String str3 = null;
        if (z) {
            str3 = METHOD_GET;
        }
        if (z2) {
            if (str3 == null) {
                str3 = METHOD_HEAD;
            } else {
                str3 = str3 + ", HEAD";
            }
        }
        if (z3) {
            if (str3 == null) {
                str3 = METHOD_POST;
            } else {
                str3 = str3 + ", POST";
            }
        }
        if (z4) {
            if (str3 == null) {
                str3 = METHOD_PUT;
            } else {
                str3 = str3 + ", PUT";
            }
        }
        if (z5) {
            if (str3 == null) {
                str3 = METHOD_DELETE;
            } else {
                str3 = str3 + ", DELETE";
            }
        }
        if (str3 == null) {
            str = METHOD_TRACE;
        } else {
            str = str3 + ", TRACE";
        }
        if (str == null) {
            str2 = METHOD_OPTIONS;
        } else {
            str2 = str + ", OPTIONS";
        }
        cVar.mo37781o("Allow", str2);
    }

    /* access modifiers changed from: protected */
    public void doPost(C9277a aVar, C9279c cVar) {
        String m = aVar.mo41950m();
        cVar.mo37776d(m.endsWith("1.1") ? 405 : 400, lStrings.getString("http.method_post_not_supported"));
    }

    /* access modifiers changed from: protected */
    public void doPut(C9277a aVar, C9279c cVar) {
        String m = aVar.mo41950m();
        cVar.mo37776d(m.endsWith("1.1") ? 405 : 400, lStrings.getString("http.method_put_not_supported"));
    }

    /* access modifiers changed from: protected */
    public void doTrace(C9277a aVar, C9279c cVar) {
        StringBuilder sb = new StringBuilder("TRACE ");
        sb.append(aVar.mo37774w());
        sb.append(" ");
        sb.append(aVar.mo41950m());
        Enumeration<String> f = aVar.mo37762f();
        while (f.hasMoreElements()) {
            String nextElement = f.nextElement();
            sb.append(IOUtils.LINE_SEPARATOR_WINDOWS);
            sb.append(nextElement);
            sb.append(": ");
            sb.append(aVar.mo37770r(nextElement));
        }
        sb.append(IOUtils.LINE_SEPARATOR_WINDOWS);
        int length = sb.length();
        cVar.mo39906c("message/http");
        cVar.mo37798n(length);
        cVar.mo37797h().mo39911a(sb.toString());
    }

    /* access modifiers changed from: protected */
    public long getLastModified(C9277a aVar) {
        return -1;
    }

    /* access modifiers changed from: protected */
    public void service(C9277a aVar, C9279c cVar) {
        String l = aVar.mo37767l();
        if (l.equals(METHOD_GET)) {
            long lastModified = getLastModified(aVar);
            if (lastModified != -1) {
                if (aVar.mo37772t(HEADER_IFMODSINCE) < lastModified) {
                    maybeSetLastModified(cVar, lastModified);
                } else {
                    cVar.mo37782p(304);
                    return;
                }
            }
            doGet(aVar, cVar);
        } else if (l.equals(METHOD_HEAD)) {
            maybeSetLastModified(cVar, getLastModified(aVar));
            doHead(aVar, cVar);
        } else if (l.equals(METHOD_POST)) {
            doPost(aVar, cVar);
        } else if (l.equals(METHOD_PUT)) {
            doPut(aVar, cVar);
        } else if (l.equals(METHOD_DELETE)) {
            doDelete(aVar, cVar);
        } else if (l.equals(METHOD_OPTIONS)) {
            doOptions(aVar, cVar);
        } else if (l.equals(METHOD_TRACE)) {
            doTrace(aVar, cVar);
        } else {
            cVar.mo37776d(TypedValues.PositionType.TYPE_TRANSITION_EASING, MessageFormat.format(lStrings.getString("http.method_not_implemented"), new Object[]{l}));
        }
    }

    public void service(C10364p pVar, C10368t tVar) {
        try {
            service((C9277a) pVar, (C9279c) tVar);
        } catch (ClassCastException unused) {
            throw new ServletException("non-HTTP request or response");
        }
    }
}
