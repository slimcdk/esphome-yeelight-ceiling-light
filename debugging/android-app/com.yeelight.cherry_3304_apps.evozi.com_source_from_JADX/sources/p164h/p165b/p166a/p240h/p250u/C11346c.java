package p164h.p165b.p166a.p240h.p250u;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import p164h.p165b.p166a.p240h.C11214d;

/* renamed from: h.b.a.h.u.c */
public class C11346c<M> {

    /* renamed from: a */
    private URI f22530a;

    /* renamed from: b */
    private M f22531b;

    public C11346c(URI uri, M m) {
        try {
            this.f22530a = new URI((String) null, (String) null, uri.getPath(), uri.getQuery(), (String) null);
            this.f22531b = m;
            if (m == null) {
                throw new IllegalArgumentException("Model instance must not be null");
            }
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    public M mo36026a() {
        return this.f22531b;
    }

    /* renamed from: b */
    public URI mo36027b() {
        return this.f22530a;
    }

    /* renamed from: c */
    public void mo36028c(List<Runnable> list, C11214d dVar) {
    }

    /* renamed from: d */
    public boolean mo36029d(URI uri) {
        return uri.equals(mo36027b());
    }

    /* renamed from: e */
    public void mo36030e() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && mo36027b().equals(((C11346c) obj).mo36027b());
    }

    public int hashCode() {
        return mo36027b().hashCode();
    }

    public String toString() {
        return "(" + getClass().getSimpleName() + ") URI: " + mo36027b();
    }
}
