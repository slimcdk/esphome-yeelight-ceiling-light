package okhttp3;

import java.nio.charset.Charset;
import java.util.Objects;
import javax.annotation.Nullable;
import okio.C9837d;
import p056k5.C3300c;

/* renamed from: okhttp3.a0 */
public abstract class C3505a0 {

    /* renamed from: okhttp3.a0$a */
    class C3506a extends C3505a0 {

        /* renamed from: a */
        final /* synthetic */ C3548v f5617a;

        /* renamed from: b */
        final /* synthetic */ int f5618b;

        /* renamed from: c */
        final /* synthetic */ byte[] f5619c;

        /* renamed from: d */
        final /* synthetic */ int f5620d;

        C3506a(C3548v vVar, int i, byte[] bArr, int i2) {
            this.f5617a = vVar;
            this.f5618b = i;
            this.f5619c = bArr;
            this.f5620d = i2;
        }

        /* renamed from: a */
        public long mo24351a() {
            return (long) this.f5618b;
        }

        @Nullable
        /* renamed from: b */
        public C3548v mo24352b() {
            return this.f5617a;
        }

        /* renamed from: f */
        public void mo24353f(C9837d dVar) {
            dVar.mo24765m0(this.f5619c, this.f5620d, this.f5618b);
        }
    }

    /* renamed from: c */
    public static C3505a0 m9570c(@Nullable C3548v vVar, String str) {
        Charset charset = C3300c.f5335d;
        if (vVar != null) {
            Charset a = vVar.mo24593a();
            if (a == null) {
                vVar = C3548v.m9872d(vVar + "; charset=utf-8");
            } else {
                charset = a;
            }
        }
        return m9571d(vVar, str.getBytes(charset));
    }

    /* renamed from: d */
    public static C3505a0 m9571d(@Nullable C3548v vVar, byte[] bArr) {
        return m9572e(vVar, bArr, 0, bArr.length);
    }

    /* renamed from: e */
    public static C3505a0 m9572e(@Nullable C3548v vVar, byte[] bArr, int i, int i2) {
        Objects.requireNonNull(bArr, "content == null");
        C3300c.m8920e((long) bArr.length, (long) i, (long) i2);
        return new C3506a(vVar, i2, bArr, i);
    }

    /* renamed from: a */
    public long mo24351a() {
        return -1;
    }

    @Nullable
    /* renamed from: b */
    public abstract C3548v mo24352b();

    /* renamed from: f */
    public abstract void mo24353f(C9837d dVar);
}
