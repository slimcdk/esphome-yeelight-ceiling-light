package p011c.p012a.p019b.p020a.p021i.p024u.p025j;

import android.database.Cursor;
import java.util.List;
import p011c.p012a.p019b.p020a.p021i.C0487l;
import p011c.p012a.p019b.p020a.p021i.p024u.p025j.C0514b0;

/* renamed from: c.a.b.a.i.u.j.n */
final /* synthetic */ class C0539n implements C0514b0.C0516b {

    /* renamed from: a */
    private final C0514b0 f191a;

    /* renamed from: b */
    private final List f192b;

    /* renamed from: c */
    private final C0487l f193c;

    private C0539n(C0514b0 b0Var, List list, C0487l lVar) {
        this.f191a = b0Var;
        this.f192b = list;
        this.f193c = lVar;
    }

    /* renamed from: a */
    public static C0514b0.C0516b m299a(C0514b0 b0Var, List list, C0487l lVar) {
        return new C0539n(b0Var, list, lVar);
    }

    public Object apply(Object obj) {
        return C0514b0.m204R(this.f191a, this.f192b, this.f193c, (Cursor) obj);
    }
}
