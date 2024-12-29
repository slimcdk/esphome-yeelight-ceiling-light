package org.eclipse.jetty.server.handler;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import javax.servlet.http.C9277a;
import javax.servlet.http.C9279c;
import org.eclipse.jetty.http.HttpStatus;
import org.eclipse.jetty.util.C9982f;
import p239z5.C12151b;
import p239z5.C12181o;

/* renamed from: org.eclipse.jetty.server.handler.f */
public class C9947f extends C9940a {

    /* renamed from: j */
    boolean f18256j = true;

    /* renamed from: k */
    boolean f18257k = true;

    /* renamed from: l */
    String f18258l = "must-revalidate,no-cache,no-store";

    /* access modifiers changed from: protected */
    /* renamed from: O0 */
    public void mo39973O0(C9277a aVar, Writer writer, int i, String str) {
        mo39975Q0(aVar, writer, i, str, this.f18256j);
    }

    /* access modifiers changed from: protected */
    /* renamed from: P0 */
    public void mo39974P0(Writer writer, String str) {
        String str2;
        if (str != null) {
            for (int i = 0; i < str.length(); i++) {
                char charAt = str.charAt(i);
                if (charAt == '&') {
                    str2 = "&amp;";
                } else if (charAt == '<') {
                    str2 = "&lt;";
                } else if (charAt != '>') {
                    if (Character.isISOControl(charAt) && !Character.isWhitespace(charAt)) {
                        charAt = '?';
                    }
                    writer.write(charAt);
                } else {
                    str2 = "&gt;";
                }
                writer.write(str2);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: Q0 */
    public void mo39975Q0(C9277a aVar, Writer writer, int i, String str, boolean z) {
        if (str == null) {
            str = HttpStatus.m24064b(i);
        }
        String str2 = str;
        writer.write("<html>\n<head>\n");
        mo39977S0(aVar, writer, i, str2);
        writer.write("</head>\n<body>");
        mo39976R0(aVar, writer, i, str2, z);
        writer.write("\n</body>\n</html>\n");
    }

    /* access modifiers changed from: protected */
    /* renamed from: R0 */
    public void mo39976R0(C9277a aVar, Writer writer, int i, String str, boolean z) {
        mo39978T0(aVar, writer, i, str, aVar.mo37774w());
        if (z) {
            mo39979U0(aVar, writer);
        }
        writer.write("<hr /><i><small>Powered by Jetty://</small></i>");
        for (int i2 = 0; i2 < 20; i2++) {
            writer.write("<br/>                                                \n");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: S0 */
    public void mo39977S0(C9277a aVar, Writer writer, int i, String str) {
        writer.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\"/>\n");
        writer.write("<title>Error ");
        writer.write(Integer.toString(i));
        if (this.f18257k) {
            writer.write(32);
            mo39974P0(writer, str);
        }
        writer.write("</title>\n");
    }

    /* access modifiers changed from: protected */
    /* renamed from: T0 */
    public void mo39978T0(C9277a aVar, Writer writer, int i, String str, String str2) {
        writer.write("<h2>HTTP ERROR ");
        writer.write(Integer.toString(i));
        writer.write("</h2>\n<p>Problem accessing ");
        mo39974P0(writer, str2);
        writer.write(". Reason:\n<pre>    ");
        mo39974P0(writer, str);
        writer.write("</pre></p>");
    }

    /* access modifiers changed from: protected */
    /* renamed from: U0 */
    public void mo39979U0(C9277a aVar, Writer writer) {
        for (Throwable th = (Throwable) aVar.mo40040a("javax.servlet.error.exception"); th != null; th = th.getCause()) {
            writer.write("<h3>Caused by:</h3><pre>");
            StringWriter stringWriter = new StringWriter();
            PrintWriter printWriter = new PrintWriter(stringWriter);
            th.printStackTrace(printWriter);
            printWriter.flush();
            mo39974P0(writer, stringWriter.getBuffer().toString());
            writer.write("</pre>\n");
        }
    }

    /* renamed from: q */
    public void mo39972q(String str, C12181o oVar, C9277a aVar, C9279c cVar) {
        C12151b o = C12151b.m31593o();
        o.mo42994v().mo43115o0(true);
        String l = aVar.mo37767l();
        if (l.equals("GET") || l.equals("POST") || l.equals("HEAD")) {
            cVar.mo39906c("text/html;charset=ISO-8859-1");
            String str2 = this.f18258l;
            if (str2 != null) {
                cVar.mo37781o("Cache-Control", str2);
            }
            C9982f fVar = new C9982f(4096);
            mo39973O0(aVar, fVar, o.mo42998z().mo43149B(), o.mo42998z().mo43166y());
            fVar.flush();
            cVar.mo37798n(fVar.mo40233d());
            fVar.mo40236i(cVar.mo37797h());
            fVar.mo40230a();
        }
    }
}
