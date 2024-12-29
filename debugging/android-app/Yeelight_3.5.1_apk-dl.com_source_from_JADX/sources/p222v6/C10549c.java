package p222v6;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import org.fourthline.cling.model.C10016d;

/* renamed from: v6.c */
public class C10549c<M> {

    /* renamed from: a */
    private URI f19710a;

    /* renamed from: b */
    private M f19711b;

    public C10549c(URI uri, M m) {
        try {
            this.f19710a = new URI((String) null, (String) null, uri.getPath(), uri.getQuery(), (String) null);
            this.f19711b = m;
            if (m == null) {
                throw new IllegalArgumentException("Model instance must not be null");
            }
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    public M mo42211a() {
        return this.f19711b;
    }

    /* renamed from: b */
    public URI mo42212b() {
        return this.f19710a;
    }

    /* renamed from: c */
    public void mo42213c(List<Runnable> list, C10016d dVar) {
    }

    /* renamed from: d */
    public boolean mo42214d(URI uri) {
        return uri.equals(mo42212b());
    }

    /* renamed from: e */
    public void mo42215e() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && mo42212b().equals(((C10549c) obj).mo42212b());
    }

    public int hashCode() {
        return mo42212b().hashCode();
    }

    public String toString() {
        return "(" + getClass().getSimpleName() + ") URI: " + mo42212b();
    }
}
