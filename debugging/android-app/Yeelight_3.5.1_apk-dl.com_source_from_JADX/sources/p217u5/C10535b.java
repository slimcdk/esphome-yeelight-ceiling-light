package p217u5;

import com.xiaomi.mipush.sdk.Constants;
import org.eclipse.jetty.client.C9877j;
import org.eclipse.jetty.http.C9908k;
import org.eclipse.jetty.util.C9980d;
import p225w5.C11940d;
import p225w5.C11946h;

/* renamed from: u5.b */
public class C10535b implements C10534a {

    /* renamed from: a */
    private C11940d f19697a;

    public C10535b(C10537d dVar) {
        StringBuilder sb = new StringBuilder();
        sb.append("Basic ");
        sb.append(C9980d.m24667c(dVar.mo42195b() + Constants.COLON_SEPARATOR + dVar.mo42194a(), "ISO-8859-1"));
        this.f19697a = new C11946h(sb.toString());
    }

    /* renamed from: a */
    public void mo42191a(C9877j jVar) {
        jVar.mo39611S(C9908k.f18093m, this.f19697a);
    }
}
