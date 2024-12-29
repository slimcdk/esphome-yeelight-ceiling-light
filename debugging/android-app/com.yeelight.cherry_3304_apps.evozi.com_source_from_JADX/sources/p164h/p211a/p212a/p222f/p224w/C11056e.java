package p164h.p211a.p212a.p222f.p224w;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import p154d.p155b.p204f0.C10709c;
import p154d.p155b.p204f0.C10711e;
import p164h.p211a.p212a.p216c.C10915p;
import p164h.p211a.p212a.p222f.C11010b;
import p164h.p211a.p212a.p222f.C11037n;
import p164h.p211a.p212a.p228h.C11118f;

/* renamed from: h.a.a.f.w.e */
public class C11056e extends C11050a {

    /* renamed from: j */
    boolean f21742j = true;

    /* renamed from: k */
    boolean f21743k = true;

    /* renamed from: l */
    String f21744l = "must-revalidate,no-cache,no-store";

    /* access modifiers changed from: protected */
    /* renamed from: J0 */
    public void mo35088J0(C10709c cVar, Writer writer, int i, String str) {
        mo35090L0(cVar, writer, i, str, this.f21742j);
    }

    /* access modifiers changed from: protected */
    /* renamed from: K0 */
    public void mo35089K0(Writer writer, String str) {
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

    /* renamed from: L */
    public void mo34757L(String str, C11037n nVar, C10709c cVar, C10711e eVar) {
        C11010b o = C11010b.m28113o();
        o.mo34849v().mo34969o0(true);
        String m = cVar.mo33923m();
        if (m.equals("GET") || m.equals("POST") || m.equals("HEAD")) {
            eVar.mo33886h("text/html;charset=ISO-8859-1");
            String str2 = this.f21744l;
            if (str2 != null) {
                eVar.mo33935l("Cache-Control", str2);
            }
            C11118f fVar = new C11118f(4096);
            mo35088J0(cVar, fVar, o.mo34853z().mo34994u(), o.mo34853z().mo34991s());
            fVar.flush();
            eVar.mo33889k(fVar.mo35347g());
            fVar.mo35349j(eVar.mo33888j());
            fVar.mo35343a();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: L0 */
    public void mo35090L0(C10709c cVar, Writer writer, int i, String str, boolean z) {
        if (str == null) {
            str = C10915p.m27535b(i);
        }
        String str2 = str;
        writer.write("<html>\n<head>\n");
        mo35092N0(cVar, writer, i, str2);
        writer.write("</head>\n<body>");
        mo35091M0(cVar, writer, i, str2, z);
        writer.write("\n</body>\n</html>\n");
    }

    /* access modifiers changed from: protected */
    /* renamed from: M0 */
    public void mo35091M0(C10709c cVar, Writer writer, int i, String str, boolean z) {
        mo35093O0(cVar, writer, i, str, cVar.mo33929v());
        if (z) {
            mo35094P0(cVar, writer);
        }
        writer.write("<hr /><i><small>Powered by Jetty://</small></i>");
        for (int i2 = 0; i2 < 20; i2++) {
            writer.write("<br/>                                                \n");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: N0 */
    public void mo35092N0(C10709c cVar, Writer writer, int i, String str) {
        writer.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\"/>\n");
        writer.write("<title>Error ");
        writer.write(Integer.toString(i));
        if (this.f21743k) {
            writer.write(32);
            mo35089K0(writer, str);
        }
        writer.write("</title>\n");
    }

    /* access modifiers changed from: protected */
    /* renamed from: O0 */
    public void mo35093O0(C10709c cVar, Writer writer, int i, String str, String str2) {
        writer.write("<h2>HTTP ERROR ");
        writer.write(Integer.toString(i));
        writer.write("</h2>\n<p>Problem accessing ");
        mo35089K0(writer, str2);
        writer.write(". Reason:\n<pre>    ");
        mo35089K0(writer, str);
        writer.write("</pre></p>");
    }

    /* access modifiers changed from: protected */
    /* renamed from: P0 */
    public void mo35094P0(C10709c cVar, Writer writer) {
        for (Throwable th = (Throwable) cVar.mo33964a("javax.servlet.error.exception"); th != null; th = th.getCause()) {
            writer.write("<h3>Caused by:</h3><pre>");
            StringWriter stringWriter = new StringWriter();
            PrintWriter printWriter = new PrintWriter(stringWriter);
            th.printStackTrace(printWriter);
            printWriter.flush();
            mo35089K0(writer, stringWriter.getBuffer().toString());
            writer.write("</pre>\n");
        }
    }
}
