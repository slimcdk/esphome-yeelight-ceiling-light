package p262i;

import p011c.p083d.p084a.C1130q;
import p011c.p083d.p084a.C1138t;
import p011c.p083d.p084a.C1144x;

/* renamed from: i.p */
final class C11559p {

    /* renamed from: a */
    private final String f22949a;

    /* renamed from: b */
    private final C11519a f22950b;

    /* renamed from: c */
    private final String f22951c;

    /* renamed from: d */
    private final C1130q f22952d;

    /* renamed from: e */
    private final C1138t f22953e;

    /* renamed from: f */
    private final boolean f22954f;

    /* renamed from: g */
    private final boolean f22955g;

    /* renamed from: h */
    private final boolean f22956h;

    /* renamed from: i */
    private final C11548o[] f22957i;

    C11559p(String str, C11519a aVar, String str2, C1130q qVar, C1138t tVar, boolean z, boolean z2, boolean z3, C11548o[] oVarArr) {
        this.f22949a = str;
        this.f22950b = aVar;
        this.f22951c = str2;
        this.f22952d = qVar;
        this.f22953e = tVar;
        this.f22954f = z;
        this.f22955g = z2;
        this.f22956h = z3;
        this.f22957i = oVarArr;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C1144x mo36470a(Object... objArr) {
        C11546n nVar = new C11546n(this.f22949a, this.f22950b.mo36442a(), this.f22951c, this.f22952d, this.f22953e, this.f22954f, this.f22955g, this.f22956h);
        if (objArr != null) {
            C11548o[] oVarArr = this.f22957i;
            if (oVarArr.length == objArr.length) {
                int length = objArr.length;
                for (int i = 0; i < length; i++) {
                    oVarArr[i].mo36469a(nVar, objArr[i]);
                }
            } else {
                throw new IllegalArgumentException("Argument count (" + objArr.length + ") doesn't match action count (" + oVarArr.length + ")");
            }
        }
        return nVar.mo36466f();
    }
}
