package p173i7;

import com.google.gson.C2469e;
import com.squareup.okhttp.C4307s;
import com.squareup.okhttp.C4315w;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.lang.reflect.Type;
import java.nio.charset.Charset;
import okio.C3564c;

/* renamed from: i7.i */
final class C9146i<T> implements C9138e<T, C4315w> {

    /* renamed from: c */
    private static final C4307s f16910c = C4307s.m12062c("application/json; charset=UTF-8");

    /* renamed from: d */
    private static final Charset f16911d = Charset.forName("UTF-8");

    /* renamed from: a */
    private final C2469e f16912a;

    /* renamed from: b */
    private final Type f16913b;

    C9146i(C2469e eVar, Type type) {
        this.f16912a = eVar;
        this.f16913b = type;
    }

    /* renamed from: a */
    public C4315w convert(T t) {
        C3564c cVar = new C3564c();
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(cVar.mo24762k(), f16911d);
        try {
            this.f16912a.mo19240w(t, this.f16913b, outputStreamWriter);
            outputStreamWriter.flush();
            return C4315w.m12158d(f16910c, cVar.mo24769p());
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}
