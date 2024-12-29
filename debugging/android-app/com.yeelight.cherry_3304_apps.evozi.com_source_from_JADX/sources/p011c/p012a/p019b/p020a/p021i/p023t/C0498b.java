package p011c.p012a.p019b.p020a.p021i.p023t;

/* renamed from: c.a.b.a.i.t.b */
public final class C0498b {
    /* renamed from: a */
    public static <TInput, TResult, TException extends Throwable> TResult m161a(int i, TInput tinput, C0497a<TInput, TResult, TException> aVar, C0499c<TInput, TResult> cVar) {
        TResult apply;
        if (i < 1) {
            return aVar.apply(tinput);
        }
        do {
            apply = aVar.apply(tinput);
            tinput = cVar.mo8477a(tinput, apply);
            if (tinput == null || i - 1 < 1) {
                return apply;
            }
            apply = aVar.apply(tinput);
            tinput = cVar.mo8477a(tinput, apply);
            break;
        } while (i - 1 < 1);
        return apply;
    }
}
