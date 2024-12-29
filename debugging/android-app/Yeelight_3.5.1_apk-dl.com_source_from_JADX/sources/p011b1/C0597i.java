package p011b1;

import androidx.annotation.Nullable;
import com.google.firebase.crashlytics.internal.common.C2215g;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;
import p033f1.C3160f;

/* renamed from: b1.i */
public class C0597i {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C0585d f214a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C2215g f215b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final String f216c;

    /* renamed from: d */
    private final C0598a f217d = new C0598a(false);

    /* renamed from: e */
    private final C0598a f218e = new C0598a(true);

    /* renamed from: f */
    private final AtomicMarkableReference<String> f219f = new AtomicMarkableReference<>((Object) null, false);

    /* renamed from: b1.i$a */
    private class C0598a {

        /* renamed from: a */
        final AtomicMarkableReference<C0581b> f220a;

        /* renamed from: b */
        private final AtomicReference<Callable<Void>> f221b = new AtomicReference<>((Object) null);

        /* renamed from: c */
        private final boolean f222c;

        public C0598a(boolean z) {
            this.f222c = z;
            this.f220a = new AtomicMarkableReference<>(new C0581b(64, z ? 8192 : 1024), false);
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public /* synthetic */ Void m163c() {
            this.f221b.set((Object) null);
            m165e();
            return null;
        }

        /* renamed from: d */
        private void m164d() {
            C0596h hVar = new C0596h(this);
            if (this.f221b.compareAndSet((Object) null, hVar)) {
                C0597i.this.f215b.mo18542h(hVar);
            }
        }

        /* renamed from: e */
        private void m165e() {
            Map<String, String> map;
            synchronized (this) {
                if (this.f220a.isMarked()) {
                    map = this.f220a.getReference().mo10928a();
                    AtomicMarkableReference<C0581b> atomicMarkableReference = this.f220a;
                    atomicMarkableReference.set(atomicMarkableReference.getReference(), false);
                } else {
                    map = null;
                }
            }
            if (map != null) {
                C0597i.this.f214a.mo10942l(C0597i.this.f216c, map, this.f222c);
            }
        }

        /* renamed from: b */
        public Map<String, String> mo10964b() {
            return this.f220a.getReference().mo10928a();
        }

        /* renamed from: f */
        public boolean mo10965f(String str, String str2) {
            synchronized (this) {
                if (!this.f220a.getReference().mo10929d(str, str2)) {
                    return false;
                }
                AtomicMarkableReference<C0581b> atomicMarkableReference = this.f220a;
                atomicMarkableReference.set(atomicMarkableReference.getReference(), true);
                m164d();
                return true;
            }
        }
    }

    public C0597i(String str, C3160f fVar, C2215g gVar) {
        this.f216c = str;
        this.f214a = new C0585d(fVar);
        this.f215b = gVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public /* synthetic */ Object m153h() {
        m156k();
        return null;
    }

    /* renamed from: i */
    public static C0597i m154i(String str, C3160f fVar, C2215g gVar) {
        C0585d dVar = new C0585d(fVar);
        C0597i iVar = new C0597i(str, fVar, gVar);
        iVar.f217d.f220a.getReference().mo10930e(dVar.mo10940g(str, false));
        iVar.f218e.f220a.getReference().mo10930e(dVar.mo10940g(str, true));
        iVar.f219f.set(dVar.mo10941h(str), false);
        return iVar;
    }

    @Nullable
    /* renamed from: j */
    public static String m155j(String str, C3160f fVar) {
        return new C0585d(fVar).mo10941h(str);
    }

    /* renamed from: k */
    private void m156k() {
        boolean z;
        String str;
        synchronized (this.f219f) {
            z = false;
            if (this.f219f.isMarked()) {
                str = mo10961g();
                this.f219f.set(str, false);
                z = true;
            } else {
                str = null;
            }
        }
        if (z) {
            this.f214a.mo10943m(this.f216c, str);
        }
    }

    /* renamed from: e */
    public Map<String, String> mo10959e() {
        return this.f217d.mo10964b();
    }

    /* renamed from: f */
    public Map<String, String> mo10960f() {
        return this.f218e.mo10964b();
    }

    @Nullable
    /* renamed from: g */
    public String mo10961g() {
        return this.f219f.getReference();
    }

    /* renamed from: l */
    public boolean mo10962l(String str, String str2) {
        return this.f217d.mo10965f(str, str2);
    }

    /* renamed from: m */
    public void mo10963m(String str) {
        String c = C0581b.m83c(str, 1024);
        synchronized (this.f219f) {
            if (!CommonUtils.m5529A(c, this.f219f.getReference())) {
                this.f219f.set(c, true);
                this.f215b.mo18542h(new C0595g(this));
            }
        }
    }
}
