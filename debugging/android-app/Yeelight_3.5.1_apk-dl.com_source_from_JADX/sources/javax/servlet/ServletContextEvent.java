package javax.servlet;

import java.util.EventObject;
import p208s4.C10359k;

public class ServletContextEvent extends EventObject {
    public ServletContextEvent(C10359k kVar) {
        super(kVar);
    }

    public C10359k getServletContext() {
        return (C10359k) super.getSource();
    }
}
