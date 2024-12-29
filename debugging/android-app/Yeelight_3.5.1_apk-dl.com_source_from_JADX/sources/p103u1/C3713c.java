package p103u1;

import java.util.Iterator;
import java.util.Set;
import org.apache.commons.p194io.IOUtils;
import p110w0.C3870d;
import p110w0.C3873e;
import p110w0.C3887q;

/* renamed from: u1.c */
public class C3713c implements C3719i {

    /* renamed from: a */
    private final String f6236a;

    /* renamed from: b */
    private final C3714d f6237b;

    C3713c(Set<C3716f> set, C3714d dVar) {
        this.f6236a = m10593e(set);
        this.f6237b = dVar;
    }

    /* renamed from: c */
    public static C3870d<C3719i> m10591c() {
        return C3870d.m10982c(C3719i.class).mo26346b(C3887q.m11059k(C3716f.class)).mo26349e(C10414b.f19509a).mo26347c();
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static /* synthetic */ C3719i m10592d(C3873e eVar) {
        return new C3713c(eVar.mo26334d(C3716f.class), C3714d.m10595a());
    }

    /* renamed from: e */
    private static String m10593e(Set<C3716f> set) {
        StringBuilder sb = new StringBuilder();
        Iterator<C3716f> it = set.iterator();
        while (it.hasNext()) {
            C3716f next = it.next();
            sb.append(next.mo26128b());
            sb.append(IOUtils.DIR_SEPARATOR_UNIX);
            sb.append(next.mo26129c());
            if (it.hasNext()) {
                sb.append(' ');
            }
        }
        return sb.toString();
    }

    /* renamed from: a */
    public String mo26133a() {
        if (this.f6237b.mo26134b().isEmpty()) {
            return this.f6236a;
        }
        return this.f6236a + ' ' + m10593e(this.f6237b.mo26134b());
    }
}
