package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.internal.measurement.b1 */
public final class C1023b1 {

    /* renamed from: a */
    final C1233o3 f1243a;

    /* renamed from: b */
    C1250p4 f1244b;

    /* renamed from: c */
    final C1037c f1245c = new C1037c();

    /* renamed from: d */
    private final C1308se f1246d = new C1308se();

    public C1023b1() {
        C1233o3 o3Var = new C1233o3();
        this.f1243a = o3Var;
        this.f1244b = o3Var.f1459b.mo13061a();
        o3Var.f1461d.mo12906a("internal.registerCallback", new C1005a(this));
        o3Var.f1461d.mo12906a("internal.eventLogger", new C1022b0(this));
    }

    /* renamed from: a */
    public final C1037c mo12562a() {
        return this.f1245c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ C1149j mo12563b() {
        return new C1244oe(this.f1246d);
    }

    /* renamed from: c */
    public final void mo12564c(C1139i5 i5Var) {
        C1149j jVar;
        try {
            this.f1244b = this.f1243a.f1459b.mo13061a();
            if (!(this.f1243a.mo13036a(this.f1244b, (C1219n5[]) i5Var.mo12876z().toArray(new C1219n5[0])) instanceof C1117h)) {
                for (C1107g5 g5Var : i5Var.mo12875x().mo12742A()) {
                    List z = g5Var.mo12827z();
                    String y = g5Var.mo12826y();
                    Iterator it = z.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            C1261q a = this.f1243a.mo13036a(this.f1244b, (C1219n5) it.next());
                            if (a instanceof C1213n) {
                                C1250p4 p4Var = this.f1244b;
                                if (!p4Var.mo13068h(y)) {
                                    jVar = null;
                                } else {
                                    C1261q d = p4Var.mo13064d(y);
                                    if (d instanceof C1149j) {
                                        jVar = (C1149j) d;
                                    } else {
                                        throw new IllegalStateException("Invalid function name: ".concat(String.valueOf(y)));
                                    }
                                }
                                if (jVar != null) {
                                    jVar.mo12586a(this.f1244b, Collections.singletonList(a));
                                } else {
                                    throw new IllegalStateException("Rule function is undefined: ".concat(String.valueOf(y)));
                                }
                            } else {
                                throw new IllegalArgumentException("Invalid rule definition");
                            }
                        }
                    }
                }
                return;
            }
            throw new IllegalStateException("Program loading failed");
        } catch (Throwable th) {
            throw new zzd(th);
        }
    }

    /* renamed from: d */
    public final void mo12565d(String str, Callable callable) {
        this.f1243a.f1461d.mo12906a(str, callable);
    }

    /* renamed from: e */
    public final boolean mo12566e(C1021b bVar) {
        try {
            this.f1245c.mo12596d(bVar);
            this.f1243a.f1460c.mo13067g("runtime.counter", new C1133i(Double.valueOf(0.0d)));
            this.f1246d.mo13366b(this.f1244b.mo13061a(), this.f1245c);
            return mo12568g() || mo12567f();
        } catch (Throwable th) {
            throw new zzd(th);
        }
    }

    /* renamed from: f */
    public final boolean mo12567f() {
        return !this.f1245c.mo12594c().isEmpty();
    }

    /* renamed from: g */
    public final boolean mo12568g() {
        C1037c cVar = this.f1245c;
        return !cVar.mo12593b().equals(cVar.mo12592a());
    }
}
