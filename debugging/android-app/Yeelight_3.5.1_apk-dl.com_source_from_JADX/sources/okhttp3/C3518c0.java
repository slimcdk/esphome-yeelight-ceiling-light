package okhttp3;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;
import javax.annotation.Nullable;
import okio.C3564c;
import okio.C9838e;
import p056k5.C3300c;

/* renamed from: okhttp3.c0 */
public abstract class C3518c0 implements Closeable {

    /* renamed from: okhttp3.c0$a */
    class C3519a extends C3518c0 {

        /* renamed from: a */
        final /* synthetic */ C3548v f5679a;

        /* renamed from: b */
        final /* synthetic */ long f5680b;

        /* renamed from: c */
        final /* synthetic */ C9838e f5681c;

        C3519a(C3548v vVar, long j, C9838e eVar) {
            this.f5679a = vVar;
            this.f5680b = j;
            this.f5681c = eVar;
        }

        /* renamed from: d */
        public long mo24148d() {
            return this.f5680b;
        }

        @Nullable
        /* renamed from: f */
        public C3548v mo24149f() {
            return this.f5679a;
        }

        /* renamed from: k */
        public C9838e mo24150k() {
            return this.f5681c;
        }
    }

    /* renamed from: h */
    public static C3518c0 m9640h(@Nullable C3548v vVar, long j, C9838e eVar) {
        Objects.requireNonNull(eVar, "source == null");
        return new C3519a(vVar, j, eVar);
    }

    /* renamed from: i */
    public static C3518c0 m9641i(@Nullable C3548v vVar, byte[] bArr) {
        return m9640h(vVar, (long) bArr.length, new C3564c().mo24732O0(bArr));
    }

    /* renamed from: a */
    public final InputStream mo24409a() {
        return mo24150k().mo24752f1();
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: c */
    public final byte[] mo24410c() {
        long d = mo24148d();
        if (d <= 2147483647L) {
            C9838e k = mo24150k();
            try {
                byte[] O = k.mo24731O();
                C3300c.m8921f(k);
                if (d == -1 || d == ((long) O.length)) {
                    return O;
                }
                throw new IOException("Content-Length (" + d + ") and stream length (" + O.length + ") disagree");
            } catch (Throwable th) {
                C3300c.m8921f(k);
                throw th;
            }
        } else {
            throw new IOException("Cannot buffer entire body for content length: " + d);
        }
    }

    public void close() {
        C3300c.m8921f(mo24150k());
    }

    /* renamed from: d */
    public abstract long mo24148d();

    @Nullable
    /* renamed from: f */
    public abstract C3548v mo24149f();

    /* renamed from: k */
    public abstract C9838e mo24150k();
}
