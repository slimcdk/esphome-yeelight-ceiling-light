package p156f.p157g0.p160g;

import java.net.Proxy;
import p156f.C4318a0;
import p156f.C4390t;

/* renamed from: f.g0.g.i */
public final class C10774i {
    /* renamed from: a */
    public static String m26716a(C4318a0 a0Var, Proxy.Type type) {
        StringBuilder sb = new StringBuilder();
        sb.append(a0Var.mo23813g());
        sb.append(' ');
        boolean b = m26717b(a0Var, type);
        C4390t i = a0Var.mo23815i();
        if (b) {
            sb.append(i);
        } else {
            sb.append(m26718c(i));
        }
        sb.append(" HTTP/1.1");
        return sb.toString();
    }

    /* renamed from: b */
    private static boolean m26717b(C4318a0 a0Var, Proxy.Type type) {
        return !a0Var.mo23812f() && type == Proxy.Type.HTTP;
    }

    /* renamed from: c */
    public static String m26718c(C4390t tVar) {
        String h = tVar.mo24109h();
        String j = tVar.mo24112j();
        if (j == null) {
            return h;
        }
        return h + '?' + j;
    }
}
