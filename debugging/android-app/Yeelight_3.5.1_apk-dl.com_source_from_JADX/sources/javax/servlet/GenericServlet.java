package javax.servlet;

import java.io.Serializable;
import java.util.Enumeration;
import java.util.ResourceBundle;
import p208s4.C10357i;
import p208s4.C10358j;
import p208s4.C10359k;
import p208s4.C10364p;
import p208s4.C10368t;

public abstract class GenericServlet implements C10357i, C10358j, Serializable {
    private static final String LSTRING_FILE = "javax.servlet.LocalStrings";
    private static ResourceBundle lStrings = ResourceBundle.getBundle(LSTRING_FILE);
    private transient C10358j config;

    public void destroy() {
    }

    public String getInitParameter(String str) {
        C10358j servletConfig = getServletConfig();
        if (servletConfig != null) {
            return servletConfig.getInitParameter(str);
        }
        throw new IllegalStateException(lStrings.getString("err.servlet_config_not_initialized"));
    }

    public Enumeration<String> getInitParameterNames() {
        C10358j servletConfig = getServletConfig();
        if (servletConfig != null) {
            return servletConfig.getInitParameterNames();
        }
        throw new IllegalStateException(lStrings.getString("err.servlet_config_not_initialized"));
    }

    public C10358j getServletConfig() {
        return this.config;
    }

    public C10359k getServletContext() {
        C10358j servletConfig = getServletConfig();
        if (servletConfig != null) {
            return servletConfig.getServletContext();
        }
        throw new IllegalStateException(lStrings.getString("err.servlet_config_not_initialized"));
    }

    public String getServletInfo() {
        return "";
    }

    public String getServletName() {
        C10358j servletConfig = getServletConfig();
        if (servletConfig != null) {
            return servletConfig.getServletName();
        }
        throw new IllegalStateException(lStrings.getString("err.servlet_config_not_initialized"));
    }

    public void init() {
    }

    public void init(C10358j jVar) {
        this.config = jVar;
        init();
    }

    public void log(String str) {
        C10359k servletContext = getServletContext();
        servletContext.log(getServletName() + ": " + str);
    }

    public void log(String str, Throwable th) {
        C10359k servletContext = getServletContext();
        servletContext.log(getServletName() + ": " + str, th);
    }

    public abstract void service(C10364p pVar, C10368t tVar);
}
