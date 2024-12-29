package javax.servlet.http;

import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.ResourceBundle;
import p208s4.C10362n;

/* renamed from: javax.servlet.http.k */
class C9287k extends C9280d {

    /* renamed from: f */
    private static final ResourceBundle f17199f = ResourceBundle.getBundle("javax.servlet.http.LocalStrings");

    /* renamed from: b */
    private C9286j f17200b = new C9286j();

    /* renamed from: c */
    private PrintWriter f17201c;

    /* renamed from: d */
    private boolean f17202d;

    /* renamed from: e */
    private boolean f17203e;

    C9287k(C9279c cVar) {
        super(cVar);
    }

    /* renamed from: f */
    public PrintWriter mo37796f() {
        if (!this.f17203e) {
            if (this.f17201c == null) {
                this.f17201c = new PrintWriter(new OutputStreamWriter(this.f17200b, mo39910i()));
            }
            return this.f17201c;
        }
        throw new IllegalStateException(f17199f.getString("err.ise.getWriter"));
    }

    /* renamed from: h */
    public C10362n mo37797h() {
        if (this.f17201c == null) {
            this.f17203e = true;
            return this.f17200b;
        }
        throw new IllegalStateException(f17199f.getString("err.ise.getOutputStream"));
    }

    /* renamed from: n */
    public void mo37798n(int i) {
        super.mo37798n(i);
        this.f17202d = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public void mo37799t() {
        if (!this.f17202d) {
            PrintWriter printWriter = this.f17201c;
            if (printWriter != null) {
                printWriter.flush();
            }
            mo37798n(this.f17200b.mo37793c());
        }
    }
}
