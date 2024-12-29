package p164h.p211a.p212a.p228h.p233x;

import java.lang.ref.WeakReference;
import java.util.EventListener;
import java.util.concurrent.CopyOnWriteArrayList;
import p164h.p211a.p212a.p228h.C11126j;
import p164h.p211a.p212a.p228h.p234y.C11156b;
import p164h.p211a.p212a.p228h.p234y.C11158c;

/* renamed from: h.a.a.h.x.c */
public class C11148c {

    /* renamed from: b */
    private static final C11158c f22089b = C11156b.m29015a(C11148c.class);

    /* renamed from: a */
    private final CopyOnWriteArrayList<C11150b> f22090a = new CopyOnWriteArrayList<>();

    /* renamed from: h.a.a.h.x.c$b */
    public interface C11150b extends EventListener {
        /* renamed from: e */
        void mo35470e(C11151c cVar);

        /* renamed from: i */
        void mo35471i(C11151c cVar);

        /* renamed from: x */
        void mo35472x(Object obj);

        /* renamed from: y */
        void mo35473y(Object obj);
    }

    /* renamed from: h.a.a.h.x.c$c */
    public static class C11151c {

        /* renamed from: a */
        private final WeakReference<Object> f22091a;

        /* renamed from: b */
        private final WeakReference<Object> f22092b;

        /* renamed from: c */
        private String f22093c;

        private C11151c(C11148c cVar, Object obj, Object obj2, String str) {
            this.f22091a = new WeakReference<>(obj);
            this.f22092b = new WeakReference<>(obj2);
            this.f22093c = str;
        }

        public boolean equals(Object obj) {
            if (obj == null || !(obj instanceof C11151c)) {
                return false;
            }
            C11151c cVar = (C11151c) obj;
            return cVar.f22091a.get() == this.f22091a.get() && cVar.f22092b.get() == this.f22092b.get() && cVar.f22093c.equals(this.f22093c);
        }

        public int hashCode() {
            return this.f22091a.hashCode() + this.f22092b.hashCode() + this.f22093c.hashCode();
        }

        public String toString() {
            return this.f22091a + "---" + this.f22093c + "-->" + this.f22092b;
        }
    }

    /* renamed from: a */
    private void m28990a(Object obj, Object obj2, String str) {
        if (f22089b.mo35485a()) {
            C11158c cVar = f22089b;
            cVar.mo35489e("Container " + obj + " + " + obj2 + " as " + str, new Object[0]);
        }
        if (this.f22090a != null) {
            C11151c cVar2 = new C11151c(obj, obj2, str);
            for (int i = 0; i < C11126j.m28890q(this.f22090a); i++) {
                ((C11150b) C11126j.m28884j(this.f22090a, i)).mo35471i(cVar2);
            }
        }
    }

    /* renamed from: c */
    private void m28991c(Object obj, Object obj2, String str) {
        if (f22089b.mo35485a()) {
            C11158c cVar = f22089b;
            cVar.mo35489e("Container " + obj + " - " + obj2 + " as " + str, new Object[0]);
        }
        if (this.f22090a != null) {
            C11151c cVar2 = new C11151c(obj, obj2, str);
            for (int i = 0; i < C11126j.m28890q(this.f22090a); i++) {
                ((C11150b) C11126j.m28884j(this.f22090a, i)).mo35470e(cVar2);
            }
        }
    }

    /* renamed from: b */
    public void mo35464b(Object obj) {
        if (this.f22090a != null) {
            for (int i = 0; i < C11126j.m28890q(this.f22090a); i++) {
                ((C11150b) C11126j.m28884j(this.f22090a, i)).mo35472x(obj);
            }
        }
    }

    /* renamed from: d */
    public void mo35465d(Object obj) {
        if (this.f22090a != null) {
            for (int i = 0; i < C11126j.m28890q(this.f22090a); i++) {
                ((C11150b) C11126j.m28884j(this.f22090a, i)).mo35473y(obj);
            }
        }
    }

    /* renamed from: e */
    public void mo35466e(Object obj, Object obj2, Object obj3, String str) {
        if (obj2 != null && !obj2.equals(obj3)) {
            m28991c(obj, obj2, str);
        }
        if (obj3 != null && !obj3.equals(obj2)) {
            m28990a(obj, obj3, str);
        }
    }

    /* renamed from: f */
    public void mo35467f(Object obj, Object obj2, Object obj3, String str, boolean z) {
        if (obj2 != null && !obj2.equals(obj3)) {
            m28991c(obj, obj2, str);
            if (z) {
                mo35465d(obj2);
            }
        }
        if (obj3 != null && !obj3.equals(obj2)) {
            if (z) {
                mo35464b(obj3);
            }
            m28990a(obj, obj3, str);
        }
    }

    /* renamed from: g */
    public void mo35468g(Object obj, Object[] objArr, Object[] objArr2, String str) {
        mo35469h(obj, objArr, objArr2, str, false);
    }

    /* renamed from: h */
    public void mo35469h(Object obj, Object[] objArr, Object[] objArr2, String str, boolean z) {
        Object[] objArr3 = null;
        if (objArr2 != null) {
            Object[] objArr4 = new Object[objArr2.length];
            int length = objArr2.length;
            while (true) {
                int i = length - 1;
                if (length <= 0) {
                    break;
                }
                boolean z2 = true;
                if (objArr != null) {
                    int length2 = objArr.length;
                    while (true) {
                        int i2 = length2 - 1;
                        if (length2 <= 0) {
                            break;
                        } else if (objArr2[i] == null || !objArr2[i].equals(objArr[i2])) {
                            length2 = i2;
                        } else {
                            objArr[i2] = null;
                            length2 = i2;
                            z2 = false;
                        }
                    }
                }
                if (z2) {
                    objArr4[i] = objArr2[i];
                }
                length = i;
            }
            objArr3 = objArr4;
        }
        if (objArr != null) {
            int length3 = objArr.length;
            while (true) {
                int i3 = length3 - 1;
                if (length3 <= 0) {
                    break;
                }
                if (objArr[i3] != null) {
                    m28991c(obj, objArr[i3], str);
                    if (z) {
                        mo35465d(objArr[i3]);
                    }
                }
                length3 = i3;
            }
        }
        if (objArr3 != null) {
            for (int i4 = 0; i4 < objArr3.length; i4++) {
                if (objArr3[i4] != null) {
                    if (z) {
                        mo35464b(objArr3[i4]);
                    }
                    m28990a(obj, objArr3[i4], str);
                }
            }
        }
    }
}
