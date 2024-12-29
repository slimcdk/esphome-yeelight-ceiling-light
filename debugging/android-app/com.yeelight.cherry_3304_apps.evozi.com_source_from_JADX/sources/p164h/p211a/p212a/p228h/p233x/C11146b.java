package p164h.p211a.p212a.p228h.p233x;

import com.xiaomi.mipush.sdk.Constants;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.apache.commons.p271io.IOUtils;
import p164h.p211a.p212a.p228h.p234y.C11156b;
import p164h.p211a.p212a.p228h.p234y.C11158c;

/* renamed from: h.a.a.h.x.b */
public class C11146b extends C11145a implements C11152d {

    /* renamed from: g */
    private static final C11158c f22084g = C11156b.m29015a(C11146b.class);

    /* renamed from: e */
    private final List<C11147a> f22085e = new CopyOnWriteArrayList();

    /* renamed from: f */
    private boolean f22086f = false;

    /* renamed from: h.a.a.h.x.b$a */
    private class C11147a {

        /* renamed from: a */
        final Object f22087a;

        /* renamed from: b */
        volatile boolean f22088b = true;

        C11147a(C11146b bVar, Object obj) {
            this.f22087a = obj;
        }

        public String toString() {
            return "{" + this.f22087a + Constants.ACCEPT_TIME_SEPARATOR_SP + this.f22088b + "}";
        }
    }

    /* renamed from: B0 */
    public static void m28976B0(Appendable appendable, String str, Collection<?>... collectionArr) {
        if (collectionArr.length != 0) {
            int i = 0;
            for (Collection<?> size : collectionArr) {
                i += size.size();
            }
            if (i != 0) {
                int i2 = 0;
                for (Collection<?> it : collectionArr) {
                    for (Object next : it) {
                        i2++;
                        appendable.append(str).append(" +- ");
                        if (next instanceof C11152d) {
                            C11152d dVar = (C11152d) next;
                            StringBuilder sb = new StringBuilder();
                            sb.append(str);
                            sb.append(i2 == i ? "    " : " |  ");
                            dVar.mo34187k0(appendable, sb.toString());
                        } else {
                            m28977C0(appendable, next);
                        }
                    }
                    if (i2 != i) {
                        appendable.append(str).append(" |\n");
                    }
                }
            }
        }
    }

    /* renamed from: C0 */
    public static void m28977C0(Appendable appendable, Object obj) {
        try {
            (obj instanceof C11153e ? appendable.append(String.valueOf(obj)).append(" - ").append(C11145a.m28963s0((C11153e) obj)) : appendable.append(String.valueOf(obj))).append(IOUtils.LINE_SEPARATOR_UNIX);
        } catch (Throwable th) {
            appendable.append(" => ").append(th.toString()).append(10);
        }
    }

    /* renamed from: A0 */
    public boolean mo35457A0(Object obj) {
        for (C11147a aVar : this.f22085e) {
            if (aVar.f22087a == obj) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: D0 */
    public void mo35458D0() {
        try {
            mo34187k0(System.err, "");
        } catch (IOException e) {
            f22084g.mo35495k(e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: E0 */
    public void mo35048E0(Appendable appendable) {
        appendable.append(String.valueOf(this)).append(" - ").append(mo35453r0()).append(IOUtils.LINE_SEPARATOR_UNIX);
    }

    /* renamed from: F0 */
    public <T> T mo35459F0(Class<T> cls) {
        for (C11147a next : this.f22085e) {
            if (cls.isInstance(next.f22087a)) {
                return next.f22087a;
            }
        }
        return null;
    }

    /* renamed from: G0 */
    public Collection<Object> mo35460G0() {
        return mo35461H0(Object.class);
    }

    /* renamed from: H0 */
    public <T> List<T> mo35461H0(Class<T> cls) {
        ArrayList arrayList = new ArrayList();
        for (C11147a next : this.f22085e) {
            if (cls.isInstance(next.f22087a)) {
                arrayList.add(next.f22087a);
            }
        }
        return arrayList;
    }

    /* renamed from: I0 */
    public boolean mo35000I0(Object obj) {
        for (C11147a next : this.f22085e) {
            if (next.f22087a == obj) {
                this.f22085e.remove(next);
                return true;
            }
        }
        return false;
    }

    /* renamed from: k0 */
    public void mo34187k0(Appendable appendable, String str) {
        mo35048E0(appendable);
        int size = this.f22085e.size();
        if (size != 0) {
            int i = 0;
            for (C11147a next : this.f22085e) {
                i++;
                appendable.append(str).append(" +- ");
                boolean z = next.f22088b;
                Object obj = next.f22087a;
                if (!z || !(obj instanceof C11152d)) {
                    m28977C0(appendable, obj);
                } else {
                    C11152d dVar = (C11152d) obj;
                    StringBuilder sb = new StringBuilder();
                    sb.append(str);
                    sb.append(i == size ? "    " : " |  ");
                    dVar.mo34187k0(appendable, sb.toString());
                }
            }
            if (i != size) {
                appendable.append(str).append(" |\n");
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: p0 */
    public void mo34262p0() {
        for (C11147a next : this.f22085e) {
            if (next.f22088b) {
                Object obj = next.f22087a;
                if (obj instanceof C11153e) {
                    C11153e eVar = (C11153e) obj;
                    if (!eVar.isRunning()) {
                        eVar.start();
                    }
                }
            }
        }
        this.f22086f = true;
        super.mo34262p0();
    }

    /* access modifiers changed from: protected */
    /* renamed from: q0 */
    public void mo34263q0() {
        this.f22086f = false;
        super.mo34263q0();
        ArrayList<C11147a> arrayList = new ArrayList<>(this.f22085e);
        Collections.reverse(arrayList);
        for (C11147a aVar : arrayList) {
            if (aVar.f22088b) {
                Object obj = aVar.f22087a;
                if (obj instanceof C11153e) {
                    C11153e eVar = (C11153e) obj;
                    if (eVar.isRunning()) {
                        eVar.stop();
                    }
                }
            }
        }
    }

    /* renamed from: y0 */
    public boolean mo35020y0(Object obj) {
        return mo35462z0(obj, !(obj instanceof C11153e) || !((C11153e) obj).mo35452j0());
    }

    /* renamed from: z0 */
    public boolean mo35462z0(Object obj, boolean z) {
        if (mo35457A0(obj)) {
            return false;
        }
        C11147a aVar = new C11147a(this, obj);
        aVar.f22088b = z;
        this.f22085e.add(aVar);
        if (!(obj instanceof C11153e)) {
            return true;
        }
        C11153e eVar = (C11153e) obj;
        if (!z || !this.f22086f) {
            return true;
        }
        try {
            eVar.start();
            return true;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
