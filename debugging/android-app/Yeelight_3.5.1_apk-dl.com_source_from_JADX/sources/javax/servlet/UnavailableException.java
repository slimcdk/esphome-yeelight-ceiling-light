package javax.servlet;

import p208s4.C10357i;

public class UnavailableException extends ServletException {
    private boolean permanent;
    private int seconds;
    private C10357i servlet;

    public UnavailableException(int i, C10357i iVar, String str) {
        super(str);
        this.servlet = iVar;
        this.seconds = i <= 0 ? -1 : i;
        this.permanent = false;
    }

    public UnavailableException(String str) {
        super(str);
        this.permanent = true;
    }

    public UnavailableException(String str, int i) {
        super(str);
        if (i <= 0) {
            this.seconds = -1;
        } else {
            this.seconds = i;
        }
        this.permanent = false;
    }

    public UnavailableException(C10357i iVar, String str) {
        super(str);
        this.servlet = iVar;
        this.permanent = true;
    }

    public C10357i getServlet() {
        return this.servlet;
    }

    public int getUnavailableSeconds() {
        if (this.permanent) {
            return -1;
        }
        return this.seconds;
    }

    public boolean isPermanent() {
        return this.permanent;
    }
}
