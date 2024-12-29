package org.eclipse.jetty.servlet;

import javax.servlet.http.C9277a;
import javax.servlet.http.C9279c;
import javax.servlet.http.HttpServlet;

public class NoJspServlet extends HttpServlet {
    private boolean _warned;

    /* access modifiers changed from: protected */
    public void doGet(C9277a aVar, C9279c cVar) {
        if (!this._warned) {
            getServletContext().log("No JSP support.  Check that JSP jars are in lib/jsp and that the JSP option has been specified to start.jar");
        }
        this._warned = true;
        cVar.mo37776d(500, "JSP support not configured");
    }
}
