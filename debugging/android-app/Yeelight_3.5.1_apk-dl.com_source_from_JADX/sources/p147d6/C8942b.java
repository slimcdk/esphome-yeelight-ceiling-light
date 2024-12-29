package p147d6;

import com.xiaomi.mipush.sdk.Constants;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.apache.commons.p194io.IOUtils;
import p152e6.C9001b;
import p152e6.C9003c;

/* renamed from: d6.b */
public class C8942b extends C8941a implements C8948d {

    /* renamed from: g */
    private static final C9003c f16446g = C9001b.m21450a(C8942b.class);

    /* renamed from: e */
    private final List<C8943a> f16447e = new CopyOnWriteArrayList();

    /* renamed from: f */
    private boolean f16448f = false;

    /* renamed from: d6.b$a */
    private class C8943a {

        /* renamed from: a */
        final Object f16449a;

        /* renamed from: b */
        volatile boolean f16450b = true;

        C8943a(C8942b bVar, Object obj) {
            this.f16449a = obj;
        }

        public String toString() {
            return "{" + this.f16449a + Constants.ACCEPT_TIME_SEPARATOR_SP + this.f16450b + "}";
        }
    }

    /* renamed from: G0 */
    public static void m21357G0(Appendable appendable, String str, Collection<?>... collectionArr) {
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
                        if (next instanceof C8948d) {
                            C8948d dVar = (C8948d) next;
                            StringBuilder sb = new StringBuilder();
                            sb.append(str);
                            sb.append(i2 == i ? "    " : " |  ");
                            dVar.mo26544p0(appendable, sb.toString());
                        } else {
                            m21358H0(appendable, next);
                        }
                    }
                    if (i2 != i) {
                        appendable.append(str).append(" |\n");
                    }
                }
            }
        }
    }

    /* renamed from: H0 */
    public static void m21358H0(Appendable appendable, Object obj) {
        try {
            (obj instanceof C8949e ? appendable.append(String.valueOf(obj)).append(" - ").append(C8941a.m21348x0((C8949e) obj)) : appendable.append(String.valueOf(obj))).append(IOUtils.LINE_SEPARATOR_UNIX);
        } catch (Throwable th) {
            appendable.append(" => ").append(th.toString()).append(10);
        }
    }

    /* renamed from: D0 */
    public boolean mo36753D0(Object obj) {
        return mo36754E0(obj, !(obj instanceof C8949e) || !((C8949e) obj).mo36748n0());
    }

    /* renamed from: E0 */
    public boolean mo36754E0(Object obj, boolean z) {
        if (mo36755F0(obj)) {
            return false;
        }
        C8943a aVar = new C8943a(this, obj);
        aVar.f16450b = z;
        this.f16447e.add(aVar);
        if (!(obj instanceof C8949e)) {
            return true;
        }
        C8949e eVar = (C8949e) obj;
        if (!z || !this.f16448f) {
            return true;
        }
        try {
            eVar.start();
            return true;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: F0 */
    public boolean mo36755F0(Object obj) {
        for (C8943a aVar : this.f16447e) {
            if (aVar.f16449a == obj) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: I0 */
    public void mo36756I0() {
        try {
            mo26544p0(System.err, "");
        } catch (IOException e) {
            f16446g.mo36856j(e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: J0 */
    public void mo36757J0(Appendable appendable) {
        appendable.append(String.valueOf(this)).append(" - ").append(mo36752w0()).append(IOUtils.LINE_SEPARATOR_UNIX);
    }

    /* renamed from: K0 */
    public <T> T mo36758K0(Class<T> cls) {
        for (C8943a next : this.f16447e) {
            if (cls.isInstance(next.f16449a)) {
                return next.f16449a;
            }
        }
        return null;
    }

    /* renamed from: L0 */
    public Collection<Object> mo36759L0() {
        return mo36760M0(Object.class);
    }

    /* renamed from: M0 */
    public <T> List<T> mo36760M0(Class<T> cls) {
        ArrayList arrayList = new ArrayList();
        for (C8943a next : this.f16447e) {
            if (cls.isInstance(next.f16449a)) {
                arrayList.add(next.f16449a);
            }
        }
        return arrayList;
    }

    /* renamed from: N0 */
    public boolean mo36761N0(Object obj) {
        for (C8943a next : this.f16447e) {
            if (next.f16449a == obj) {
                this.f16447e.remove(next);
                return true;
            }
        }
        return false;
    }

    /* renamed from: p0 */
    public void mo26544p0(Appendable appendable, String str) {
        mo36757J0(appendable);
        int size = this.f16447e.size();
        if (size != 0) {
            int i = 0;
            for (C8943a next : this.f16447e) {
                i++;
                appendable.append(str).append(" +- ");
                boolean z = next.f16450b;
                Object obj = next.f16449a;
                if (!z || !(obj instanceof C8948d)) {
                    m21358H0(appendable, obj);
                } else {
                    C8948d dVar = (C8948d) obj;
                    StringBuilder sb = new StringBuilder();
                    sb.append(str);
                    sb.append(i == size ? "    " : " |  ");
                    dVar.mo26544p0(appendable, sb.toString());
                }
            }
            if (i != size) {
                appendable.append(str).append(" |\n");
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: u0 */
    public void mo26547u0() {
        for (C8943a next : this.f16447e) {
            if (next.f16450b) {
                Object obj = next.f16449a;
                if (obj instanceof C8949e) {
                    C8949e eVar = (C8949e) obj;
                    if (!eVar.isRunning()) {
                        eVar.start();
                    }
                }
            }
        }
        this.f16448f = true;
        super.mo26547u0();
    }

    /* access modifiers changed from: protected */
    /* renamed from: v0 */
    public void mo26548v0() {
        this.f16448f = false;
        super.mo26548v0();
        ArrayList<C8943a> arrayList = new ArrayList<>(this.f16447e);
        Collections.reverse(arrayList);
        for (C8943a aVar : arrayList) {
            if (aVar.f16450b) {
                Object obj = aVar.f16449a;
                if (obj instanceof C8949e) {
                    C8949e eVar = (C8949e) obj;
                    if (eVar.isRunning()) {
                        eVar.stop();
                    }
                }
            }
        }
    }
}
