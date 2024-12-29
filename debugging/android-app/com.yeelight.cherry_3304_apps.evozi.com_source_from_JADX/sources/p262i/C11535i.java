package p262i;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.lang.reflect.Type;
import java.nio.charset.Charset;
import p011c.p012a.p046d.C0664f;
import p011c.p083d.p084a.C1138t;
import p011c.p083d.p084a.C1147y;
import p163g.C4406c;

/* renamed from: i.i */
final class C11535i<T> implements C11527e<T, C1147y> {

    /* renamed from: c */
    private static final C1138t f22898c = C1138t.m2782c("application/json; charset=UTF-8");

    /* renamed from: d */
    private static final Charset f22899d = Charset.forName("UTF-8");

    /* renamed from: a */
    private final C0664f f22900a;

    /* renamed from: b */
    private final Type f22901b;

    C11535i(C0664f fVar, Type type) {
        this.f22900a = fVar;
        this.f22901b = type;
    }

    /* renamed from: a */
    public C1147y convert(T t) {
        C4406c cVar = new C4406c();
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(cVar.mo24268u(), f22899d);
        try {
            this.f22900a.mo8718w(t, this.f22901b, outputStreamWriter);
            outputStreamWriter.flush();
            return C1147y.m2879d(f22898c, cVar.mo24207F());
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}
