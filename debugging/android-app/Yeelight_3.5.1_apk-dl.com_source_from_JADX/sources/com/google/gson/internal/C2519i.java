package com.google.gson.internal;

import com.google.gson.C2528k;
import com.google.gson.stream.C2537a;
import java.io.Writer;
import p107v1.C3766n;

/* renamed from: com.google.gson.internal.i */
public final class C2519i {

    /* renamed from: com.google.gson.internal.i$a */
    private static final class C2520a extends Writer {

        /* renamed from: a */
        private final Appendable f4262a;

        /* renamed from: b */
        private final C2521a f4263b = new C2521a();

        /* renamed from: com.google.gson.internal.i$a$a */
        static class C2521a implements CharSequence {

            /* renamed from: a */
            char[] f4264a;

            C2521a() {
            }

            public char charAt(int i) {
                return this.f4264a[i];
            }

            public int length() {
                return this.f4264a.length;
            }

            public CharSequence subSequence(int i, int i2) {
                return new String(this.f4264a, i, i2 - i);
            }
        }

        C2520a(Appendable appendable) {
            this.f4262a = appendable;
        }

        public void close() {
        }

        public void flush() {
        }

        public void write(int i) {
            this.f4262a.append((char) i);
        }

        public void write(char[] cArr, int i, int i2) {
            C2521a aVar = this.f4263b;
            aVar.f4264a = cArr;
            this.f4262a.append(aVar, i, i2 + i);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0016, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001c, code lost:
        throw new com.google.gson.JsonIOException((java.lang.Throwable) r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001d, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0023, code lost:
        throw new com.google.gson.JsonSyntaxException((java.lang.Throwable) r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x002a, code lost:
        return com.google.gson.C2529l.f4270a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0030, code lost:
        throw new com.google.gson.JsonSyntaxException((java.lang.Throwable) r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000d, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000f, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0015, code lost:
        throw new com.google.gson.JsonSyntaxException((java.lang.Throwable) r2);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0016 A[ExcHandler: IOException (r2v5 'e' java.io.IOException A[CUSTOM_DECLARE]), Splitter:B:0:0x0000] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x001d A[ExcHandler: MalformedJsonException (r2v4 'e' com.google.gson.stream.MalformedJsonException A[CUSTOM_DECLARE]), Splitter:B:0:0x0000] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0028  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x000f A[ExcHandler: NumberFormatException (r2v6 'e' java.lang.NumberFormatException A[CUSTOM_DECLARE]), Splitter:B:0:0x0000] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.gson.C2528k m6798a(p122z1.C3929a r2) {
        /*
            r2.mo26169N()     // Catch:{ EOFException -> 0x0024, MalformedJsonException -> 0x001d, IOException -> 0x0016, NumberFormatException -> 0x000f }
            r0 = 0
            com.google.gson.q<com.google.gson.k> r1 = p107v1.C3766n.f6350X     // Catch:{ EOFException -> 0x000d, MalformedJsonException -> 0x001d, IOException -> 0x0016, NumberFormatException -> 0x000f }
            java.lang.Object r2 = r1.mo19209b(r2)     // Catch:{ EOFException -> 0x000d, MalformedJsonException -> 0x001d, IOException -> 0x0016, NumberFormatException -> 0x000f }
            com.google.gson.k r2 = (com.google.gson.C2528k) r2     // Catch:{ EOFException -> 0x000d, MalformedJsonException -> 0x001d, IOException -> 0x0016, NumberFormatException -> 0x000f }
            return r2
        L_0x000d:
            r2 = move-exception
            goto L_0x0026
        L_0x000f:
            r2 = move-exception
            com.google.gson.JsonSyntaxException r0 = new com.google.gson.JsonSyntaxException
            r0.<init>((java.lang.Throwable) r2)
            throw r0
        L_0x0016:
            r2 = move-exception
            com.google.gson.JsonIOException r0 = new com.google.gson.JsonIOException
            r0.<init>((java.lang.Throwable) r2)
            throw r0
        L_0x001d:
            r2 = move-exception
            com.google.gson.JsonSyntaxException r0 = new com.google.gson.JsonSyntaxException
            r0.<init>((java.lang.Throwable) r2)
            throw r0
        L_0x0024:
            r2 = move-exception
            r0 = 1
        L_0x0026:
            if (r0 == 0) goto L_0x002b
            com.google.gson.l r2 = com.google.gson.C2529l.f4270a
            return r2
        L_0x002b:
            com.google.gson.JsonSyntaxException r0 = new com.google.gson.JsonSyntaxException
            r0.<init>((java.lang.Throwable) r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.C2519i.m6798a(z1.a):com.google.gson.k");
    }

    /* renamed from: b */
    public static void m6799b(C2528k kVar, C2537a aVar) {
        C3766n.f6350X.mo19210d(aVar, kVar);
    }

    /* renamed from: c */
    public static Writer m6800c(Appendable appendable) {
        return appendable instanceof Writer ? (Writer) appendable : new C2520a(appendable);
    }
}
