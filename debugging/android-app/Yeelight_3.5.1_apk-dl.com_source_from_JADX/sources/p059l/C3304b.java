package p059l;

/* renamed from: l.b */
public final class C3304b {
    /* renamed from: a */
    public static <TInput, TResult, TException extends Throwable> TResult m8960a(int i, TInput tinput, C3303a<TInput, TResult, TException> aVar, C3305c<TInput, TResult> cVar) {
        TResult apply;
        if (i < 1) {
            return aVar.apply(tinput);
        }
        do {
            apply = aVar.apply(tinput);
            tinput = cVar.mo11104a(tinput, apply);
            if (tinput == null || i - 1 < 1) {
                return apply;
            }
            apply = aVar.apply(tinput);
            tinput = cVar.mo11104a(tinput, apply);
            break;
        } while (i - 1 < 1);
        return apply;
    }
}
