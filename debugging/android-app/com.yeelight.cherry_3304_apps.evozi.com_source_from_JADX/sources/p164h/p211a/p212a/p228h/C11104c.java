package p164h.p211a.p212a.p228h;

import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: h.a.a.h.c */
public class C11104c implements C11100b {

    /* renamed from: a */
    protected final Map<String, Object> f21950a = new HashMap();

    /* renamed from: Z */
    public void mo34249Z() {
        this.f21950a.clear();
    }

    /* renamed from: a */
    public Object mo34251a(String str) {
        return this.f21950a.get(str);
    }

    /* renamed from: b */
    public void mo34253b(String str, Object obj) {
        if (obj == null) {
            this.f21950a.remove(str);
        } else {
            this.f21950a.put(str, obj);
        }
    }

    /* renamed from: c */
    public Set<Map.Entry<String, Object>> mo35284c() {
        return this.f21950a.entrySet();
    }

    /* renamed from: d */
    public Enumeration<String> mo35285d() {
        return Collections.enumeration(this.f21950a.keySet());
    }

    /* renamed from: e */
    public void mo34256e(String str) {
        this.f21950a.remove(str);
    }

    public String toString() {
        return this.f21950a.toString();
    }
}
