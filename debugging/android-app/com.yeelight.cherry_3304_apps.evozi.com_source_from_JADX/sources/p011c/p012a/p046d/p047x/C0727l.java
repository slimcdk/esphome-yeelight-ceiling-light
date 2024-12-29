package p011c.p012a.p046d.p047x;

import java.io.Writer;
import p011c.p012a.p046d.C0676l;
import p011c.p012a.p046d.p047x.p048n.C0764n;
import p011c.p012a.p046d.p052z.C0812c;

/* renamed from: c.a.d.x.l */
public final class C0727l {

    /* renamed from: c.a.d.x.l$a */
    private static final class C0728a extends Writer {

        /* renamed from: a */
        private final Appendable f479a;

        /* renamed from: b */
        private final C0729a f480b = new C0729a();

        /* renamed from: c.a.d.x.l$a$a */
        static class C0729a implements CharSequence {

            /* renamed from: a */
            char[] f481a;

            C0729a() {
            }

            public char charAt(int i) {
                return this.f481a[i];
            }

            public int length() {
                return this.f481a.length;
            }

            public CharSequence subSequence(int i, int i2) {
                return new String(this.f481a, i, i2 - i);
            }
        }

        C0728a(Appendable appendable) {
            this.f479a = appendable;
        }

        public void close() {
        }

        public void flush() {
        }

        public void write(int i) {
            this.f479a.append((char) i);
        }

        public void write(char[] cArr, int i, int i2) {
            C0729a aVar = this.f480b;
            aVar.f481a = cArr;
            this.f479a.append(aVar, i, i2 + i);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0016, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001c, code lost:
        throw new p011c.p012a.p046d.C0677m((java.lang.Throwable) r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001d, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0023, code lost:
        throw new p011c.p012a.p046d.C0684t((java.lang.Throwable) r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x002a, code lost:
        return p011c.p012a.p046d.C0678n.f414a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0030, code lost:
        throw new p011c.p012a.p046d.C0684t((java.lang.Throwable) r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000d, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000f, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0015, code lost:
        throw new p011c.p012a.p046d.C0684t((java.lang.Throwable) r2);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0016 A[ExcHandler: IOException (r2v5 'e' java.io.IOException A[CUSTOM_DECLARE]), Splitter:B:0:0x0000] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x001d A[ExcHandler: d (r2v4 'e' c.a.d.z.d A[CUSTOM_DECLARE]), Splitter:B:0:0x0000] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0028  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x000f A[ExcHandler: NumberFormatException (r2v6 'e' java.lang.NumberFormatException A[CUSTOM_DECLARE]), Splitter:B:0:0x0000] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p011c.p012a.p046d.C0676l m784a(p011c.p012a.p046d.p052z.C0809a r2) {
        /*
            r2.mo8861V()     // Catch:{ EOFException -> 0x0024, d -> 0x001d, IOException -> 0x0016, NumberFormatException -> 0x000f }
            r0 = 0
            c.a.d.v<c.a.d.l> r1 = p011c.p012a.p046d.p047x.p048n.C0764n.f573X     // Catch:{ EOFException -> 0x000d, d -> 0x001d, IOException -> 0x0016, NumberFormatException -> 0x000f }
            java.lang.Object r2 = r1.mo8694b(r2)     // Catch:{ EOFException -> 0x000d, d -> 0x001d, IOException -> 0x0016, NumberFormatException -> 0x000f }
            c.a.d.l r2 = (p011c.p012a.p046d.C0676l) r2     // Catch:{ EOFException -> 0x000d, d -> 0x001d, IOException -> 0x0016, NumberFormatException -> 0x000f }
            return r2
        L_0x000d:
            r2 = move-exception
            goto L_0x0026
        L_0x000f:
            r2 = move-exception
            c.a.d.t r0 = new c.a.d.t
            r0.<init>((java.lang.Throwable) r2)
            throw r0
        L_0x0016:
            r2 = move-exception
            c.a.d.m r0 = new c.a.d.m
            r0.<init>((java.lang.Throwable) r2)
            throw r0
        L_0x001d:
            r2 = move-exception
            c.a.d.t r0 = new c.a.d.t
            r0.<init>((java.lang.Throwable) r2)
            throw r0
        L_0x0024:
            r2 = move-exception
            r0 = 1
        L_0x0026:
            if (r0 == 0) goto L_0x002b
            c.a.d.n r2 = p011c.p012a.p046d.C0678n.f414a
            return r2
        L_0x002b:
            c.a.d.t r0 = new c.a.d.t
            r0.<init>((java.lang.Throwable) r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p011c.p012a.p046d.p047x.C0727l.m784a(c.a.d.z.a):c.a.d.l");
    }

    /* renamed from: b */
    public static void m785b(C0676l lVar, C0812c cVar) {
        C0764n.f573X.mo8695d(cVar, lVar);
    }

    /* renamed from: c */
    public static Writer m786c(Appendable appendable) {
        return appendable instanceof Writer ? (Writer) appendable : new C0728a(appendable);
    }
}
