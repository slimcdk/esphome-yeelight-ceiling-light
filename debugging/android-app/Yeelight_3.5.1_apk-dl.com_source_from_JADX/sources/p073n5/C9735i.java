package p073n5;

import java.net.Proxy;
import okhttp3.C3546t;
import okhttp3.C3558z;

/* renamed from: n5.i */
public final class C9735i {
    /* renamed from: a */
    public static String m23386a(C3558z zVar, Proxy.Type type) {
        StringBuilder sb = new StringBuilder();
        sb.append(zVar.mo24658g());
        sb.append(' ');
        boolean b = m23387b(zVar, type);
        C3546t i = zVar.mo24660i();
        if (b) {
            sb.append(i);
        } else {
            sb.append(m23388c(i));
        }
        sb.append(" HTTP/1.1");
        return sb.toString();
    }

    /* renamed from: b */
    private static boolean m23387b(C3558z zVar, Proxy.Type type) {
        return !zVar.mo24657f() && type == Proxy.Type.HTTP;
    }

    /* renamed from: c */
    public static String m23388c(C3546t tVar) {
        String h = tVar.mo24568h();
        String j = tVar.mo24571j();
        if (j == null) {
            return h;
        }
        return h + '?' + j;
    }
}
