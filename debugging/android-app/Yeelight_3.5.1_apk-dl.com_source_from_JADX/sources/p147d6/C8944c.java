package p147d6;

import java.lang.ref.WeakReference;
import java.util.EventListener;
import java.util.concurrent.CopyOnWriteArrayList;
import org.eclipse.jetty.util.LazyList;
import p152e6.C9001b;
import p152e6.C9003c;

/* renamed from: d6.c */
public class C8944c {

    /* renamed from: b */
    private static final C9003c f16451b = C9001b.m21450a(C8944c.class);

    /* renamed from: a */
    private final CopyOnWriteArrayList<C8946b> f16452a = new CopyOnWriteArrayList<>();

    /* renamed from: d6.c$b */
    public interface C8946b extends EventListener {
        /* renamed from: d */
        void mo36769d(C8947c cVar);

        /* renamed from: i */
        void mo36770i(C8947c cVar);

        /* renamed from: t */
        void mo36771t(Object obj);

        /* renamed from: u */
        void mo36772u(Object obj);
    }

    /* renamed from: d6.c$c */
    public static class C8947c {

        /* renamed from: a */
        private final WeakReference<Object> f16453a;

        /* renamed from: b */
        private final WeakReference<Object> f16454b;

        /* renamed from: c */
        private String f16455c;

        private C8947c(C8944c cVar, Object obj, Object obj2, String str) {
            this.f16453a = new WeakReference<>(obj);
            this.f16454b = new WeakReference<>(obj2);
            this.f16455c = str;
        }

        public boolean equals(Object obj) {
            if (obj == null || !(obj instanceof C8947c)) {
                return false;
            }
            C8947c cVar = (C8947c) obj;
            return cVar.f16453a.get() == this.f16453a.get() && cVar.f16454b.get() == this.f16454b.get() && cVar.f16455c.equals(this.f16455c);
        }

        public int hashCode() {
            return this.f16453a.hashCode() + this.f16454b.hashCode() + this.f16455c.hashCode();
        }

        public String toString() {
            return this.f16453a + "---" + this.f16455c + "-->" + this.f16454b;
        }
    }

    /* renamed from: a */
    private void m21371a(Object obj, Object obj2, String str) {
        C9003c cVar = f16451b;
        if (cVar.mo36846a()) {
            cVar.mo36850e("Container " + obj + " + " + obj2 + " as " + str, new Object[0]);
        }
        if (this.f16452a != null) {
            C8947c cVar2 = new C8947c(obj, obj2, str);
            for (int i = 0; i < LazyList.size(this.f16452a); i++) {
                ((C8946b) LazyList.get(this.f16452a, i)).mo36770i(cVar2);
            }
        }
    }

    /* renamed from: c */
    private void m21372c(Object obj, Object obj2, String str) {
        C9003c cVar = f16451b;
        if (cVar.mo36846a()) {
            cVar.mo36850e("Container " + obj + " - " + obj2 + " as " + str, new Object[0]);
        }
        if (this.f16452a != null) {
            C8947c cVar2 = new C8947c(obj, obj2, str);
            for (int i = 0; i < LazyList.size(this.f16452a); i++) {
                ((C8946b) LazyList.get(this.f16452a, i)).mo36769d(cVar2);
            }
        }
    }

    /* renamed from: b */
    public void mo36763b(Object obj) {
        if (this.f16452a != null) {
            for (int i = 0; i < LazyList.size(this.f16452a); i++) {
                ((C8946b) LazyList.get(this.f16452a, i)).mo36771t(obj);
            }
        }
    }

    /* renamed from: d */
    public void mo36764d(Object obj) {
        if (this.f16452a != null) {
            for (int i = 0; i < LazyList.size(this.f16452a); i++) {
                ((C8946b) LazyList.get(this.f16452a, i)).mo36772u(obj);
            }
        }
    }

    /* renamed from: e */
    public void mo36765e(Object obj, Object obj2, Object obj3, String str) {
        if (obj2 != null && !obj2.equals(obj3)) {
            m21372c(obj, obj2, str);
        }
        if (obj3 != null && !obj3.equals(obj2)) {
            m21371a(obj, obj3, str);
        }
    }

    /* renamed from: f */
    public void mo36766f(Object obj, Object obj2, Object obj3, String str, boolean z) {
        if (obj2 != null && !obj2.equals(obj3)) {
            m21372c(obj, obj2, str);
            if (z) {
                mo36764d(obj2);
            }
        }
        if (obj3 != null && !obj3.equals(obj2)) {
            if (z) {
                mo36763b(obj3);
            }
            m21371a(obj, obj3, str);
        }
    }

    /* renamed from: g */
    public void mo36767g(Object obj, Object[] objArr, Object[] objArr2, String str) {
        mo36768h(obj, objArr, objArr2, str, false);
    }

    /* renamed from: h */
    public void mo36768h(Object obj, Object[] objArr, Object[] objArr2, String str, boolean z) {
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
                    m21372c(obj, objArr[i3], str);
                    if (z) {
                        mo36764d(objArr[i3]);
                    }
                }
                length3 = i3;
            }
        }
        if (objArr3 != null) {
            for (int i4 = 0; i4 < objArr3.length; i4++) {
                if (objArr3[i4] != null) {
                    if (z) {
                        mo36763b(objArr3[i4]);
                    }
                    m21371a(obj, objArr3[i4], str);
                }
            }
        }
    }
}
