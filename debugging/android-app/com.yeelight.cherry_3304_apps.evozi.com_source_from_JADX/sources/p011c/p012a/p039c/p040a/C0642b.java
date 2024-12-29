package p011c.p012a.p039c.p040a;

import java.util.ArrayList;
import java.util.List;
import p011c.p012a.p039c.p040a.p041d.C0644a;
import p011c.p012a.p039c.p040a.p045h.C0649b;

/* renamed from: c.a.c.a.b */
public final class C0642b {

    /* renamed from: b */
    private static final List<C0644a> f358b = new ArrayList(4);

    /* renamed from: a */
    private C0641a f359a;

    static {
        C0641a aVar = C0641a.DEBUG;
    }

    public C0642b(String str, C0649b bVar) {
    }

    /* renamed from: a */
    public void mo8683a(C0644a aVar) {
        if (aVar == null) {
            throw new IllegalArgumentException("Appender not allowed to be null");
        } else if (!f358b.contains(aVar)) {
            f358b.add(aVar);
        }
    }

    /* renamed from: b */
    public C0644a mo8684b(int i) {
        return f358b.get(i);
    }

    /* renamed from: c */
    public C0641a mo8685c() {
        return this.f359a;
    }

    /* renamed from: d */
    public int mo8686d() {
        return f358b.size();
    }

    /* renamed from: e */
    public void mo8687e(String str) {
    }

    /* renamed from: f */
    public void mo8688f(C0641a aVar) {
        if (aVar != null) {
            this.f359a = aVar;
            return;
        }
        throw new IllegalArgumentException("The level must not be null.");
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(super.toString());
        stringBuffer.append('[');
        for (C0644a append : f358b) {
            stringBuffer.append(append);
            stringBuffer.append(';');
        }
        stringBuffer.append(']');
        return stringBuffer.toString();
    }
}
