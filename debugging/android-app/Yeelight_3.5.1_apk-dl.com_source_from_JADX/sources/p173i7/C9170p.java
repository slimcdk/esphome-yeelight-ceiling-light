package p173i7;

import com.squareup.okhttp.C4299p;
import com.squareup.okhttp.C4307s;
import com.squareup.okhttp.C4312v;

/* renamed from: i7.p */
final class C9170p {

    /* renamed from: a */
    private final String f16961a;

    /* renamed from: b */
    private final C9130a f16962b;

    /* renamed from: c */
    private final String f16963c;

    /* renamed from: d */
    private final C4299p f16964d;

    /* renamed from: e */
    private final C4307s f16965e;

    /* renamed from: f */
    private final boolean f16966f;

    /* renamed from: g */
    private final boolean f16967g;

    /* renamed from: h */
    private final boolean f16968h;

    /* renamed from: i */
    private final C9159o[] f16969i;

    C9170p(String str, C9130a aVar, String str2, C4299p pVar, C4307s sVar, boolean z, boolean z2, boolean z3, C9159o[] oVarArr) {
        this.f16961a = str;
        this.f16962b = aVar;
        this.f16963c = str2;
        this.f16964d = pVar;
        this.f16965e = sVar;
        this.f16966f = z;
        this.f16967g = z2;
        this.f16968h = z3;
        this.f16969i = oVarArr;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C4312v mo37246a(Object... objArr) {
        C9157n nVar = new C9157n(this.f16961a, this.f16962b.mo37218a(), this.f16963c, this.f16964d, this.f16965e, this.f16966f, this.f16967g, this.f16968h);
        if (objArr != null) {
            C9159o[] oVarArr = this.f16969i;
            if (oVarArr.length == objArr.length) {
                int length = objArr.length;
                for (int i = 0; i < length; i++) {
                    oVarArr[i].mo37245a(nVar, objArr[i]);
                }
            } else {
                throw new IllegalArgumentException("Argument count (" + objArr.length + ") doesn't match action count (" + oVarArr.length + ")");
            }
        }
        return nVar.mo37242f();
    }
}
