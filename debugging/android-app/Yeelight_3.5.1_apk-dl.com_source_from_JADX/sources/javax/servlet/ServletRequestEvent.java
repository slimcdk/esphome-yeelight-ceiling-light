package javax.servlet;

import java.util.EventObject;
import p208s4.C10359k;
import p208s4.C10364p;

public class ServletRequestEvent extends EventObject {
    private C10364p request;

    public ServletRequestEvent(C10359k kVar, C10364p pVar) {
        super(kVar);
        this.request = pVar;
    }

    public C10359k getServletContext() {
        return (C10359k) super.getSource();
    }

    public C10364p getServletRequest() {
        return this.request;
    }
}
