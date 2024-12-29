package okhttp3.internal.publicsuffix;

import java.io.InputStream;
import java.net.IDN;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import okio.C9838e;
import okio.C9843j;
import okio.C9845l;
import org.apache.commons.p194io.FilenameUtils;
import p056k5.C3300c;

public final class PublicSuffixDatabase {

    /* renamed from: e */
    private static final byte[] f17814e = {42};

    /* renamed from: f */
    private static final String[] f17815f = new String[0];

    /* renamed from: g */
    private static final String[] f17816g = {"*"};

    /* renamed from: h */
    private static final PublicSuffixDatabase f17817h = new PublicSuffixDatabase();

    /* renamed from: a */
    private final AtomicBoolean f17818a = new AtomicBoolean(false);

    /* renamed from: b */
    private final CountDownLatch f17819b = new CountDownLatch(1);

    /* renamed from: c */
    private byte[] f17820c;

    /* renamed from: d */
    private byte[] f17821d;

    /* renamed from: a */
    private static String m23656a(byte[] bArr, byte[][] bArr2, int i) {
        int i2;
        boolean z;
        byte b;
        int i3;
        byte[] bArr3 = bArr;
        byte[][] bArr4 = bArr2;
        int length = bArr3.length;
        int i4 = 0;
        while (i4 < length) {
            int i5 = (i4 + length) / 2;
            while (i5 > -1 && bArr3[i5] != 10) {
                i5--;
            }
            int i6 = i5 + 1;
            int i7 = 1;
            while (true) {
                i2 = i6 + i7;
                if (bArr3[i2] == 10) {
                    break;
                }
                i7++;
            }
            int i8 = i2 - i6;
            int i9 = i;
            boolean z2 = false;
            int i10 = 0;
            int i11 = 0;
            while (true) {
                if (z2) {
                    b = 46;
                    z = false;
                } else {
                    z = z2;
                    b = bArr4[i9][i10] & 255;
                }
                i3 = b - (bArr3[i6 + i11] & 255);
                if (i3 == 0) {
                    i11++;
                    i10++;
                    if (i11 == i8) {
                        break;
                    } else if (bArr4[i9].length != i10) {
                        z2 = z;
                    } else if (i9 == bArr4.length - 1) {
                        break;
                    } else {
                        i9++;
                        z2 = true;
                        i10 = -1;
                    }
                } else {
                    break;
                }
            }
            if (i3 >= 0) {
                if (i3 <= 0) {
                    int i12 = i8 - i11;
                    int length2 = bArr4[i9].length - i10;
                    while (true) {
                        i9++;
                        if (i9 >= bArr4.length) {
                            break;
                        }
                        length2 += bArr4[i9].length;
                    }
                    if (length2 >= i12) {
                        if (length2 <= i12) {
                            return new String(bArr3, i6, i8, C3300c.f5335d);
                        }
                    }
                }
                i4 = i2 + 1;
            }
            length = i6 - 1;
        }
        return null;
    }

    /* renamed from: b */
    private String[] m23657b(String[] strArr) {
        String str;
        String str2;
        String str3;
        int i = 0;
        if (this.f17818a.get() || !this.f17818a.compareAndSet(false, true)) {
            try {
                this.f17819b.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        } else {
            m23660f();
        }
        synchronized (this) {
            if (this.f17820c == null) {
                throw new IllegalStateException("Unable to load publicsuffixes.gz resource from the classpath.");
            }
        }
        int length = strArr.length;
        byte[][] bArr = new byte[length][];
        for (int i2 = 0; i2 < strArr.length; i2++) {
            bArr[i2] = strArr[i2].getBytes(C3300c.f5335d);
        }
        int i3 = 0;
        while (true) {
            str = null;
            if (i3 >= length) {
                str2 = null;
                break;
            }
            str2 = m23656a(this.f17820c, bArr, i3);
            if (str2 != null) {
                break;
            }
            i3++;
        }
        if (length > 1) {
            byte[][] bArr2 = (byte[][]) bArr.clone();
            int i4 = 0;
            while (true) {
                if (i4 >= bArr2.length - 1) {
                    break;
                }
                bArr2[i4] = f17814e;
                str3 = m23656a(this.f17820c, bArr2, i4);
                if (str3 != null) {
                    break;
                }
                i4++;
            }
        }
        str3 = null;
        if (str3 != null) {
            while (true) {
                if (i >= length - 1) {
                    break;
                }
                String a = m23656a(this.f17821d, bArr, i);
                if (a != null) {
                    str = a;
                    break;
                }
                i++;
            }
        }
        if (str != null) {
            return ("!" + str).split("\\.");
        } else if (str2 == null && str3 == null) {
            return f17816g;
        } else {
            String[] split = str2 != null ? str2.split("\\.") : f17815f;
            String[] split2 = str3 != null ? str3.split("\\.") : f17815f;
            return split.length > split2.length ? split : split2;
        }
    }

    /* renamed from: c */
    public static PublicSuffixDatabase m23658c() {
        return f17817h;
    }

    /* renamed from: e */
    private void m23659e() {
        InputStream resourceAsStream = PublicSuffixDatabase.class.getResourceAsStream("publicsuffixes.gz");
        if (resourceAsStream != null) {
            C9838e d = C9845l.m23738d(new C9843j(C9845l.m23745k(resourceAsStream)));
            try {
                byte[] bArr = new byte[d.readInt()];
                d.readFully(bArr);
                byte[] bArr2 = new byte[d.readInt()];
                d.readFully(bArr2);
                synchronized (this) {
                    this.f17820c = bArr;
                    this.f17821d = bArr2;
                }
                this.f17819b.countDown();
            } finally {
                C3300c.m8921f(d);
            }
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0025 */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m23660f() {
        /*
            r5 = this;
            r0 = 0
        L_0x0001:
            r5.m23659e()     // Catch:{ InterruptedIOException -> 0x0025, IOException -> 0x0010 }
            if (r0 == 0) goto L_0x000d
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L_0x000d:
            return
        L_0x000e:
            r1 = move-exception
            goto L_0x002a
        L_0x0010:
            r1 = move-exception
            r5.f r2 = p092r5.C3636f.m10368j()     // Catch:{ all -> 0x000e }
            r3 = 5
            java.lang.String r4 = "Failed to read public suffix list"
            r2.mo25943q(r3, r4, r1)     // Catch:{ all -> 0x000e }
            if (r0 == 0) goto L_0x0024
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L_0x0024:
            return
        L_0x0025:
            java.lang.Thread.interrupted()     // Catch:{ all -> 0x000e }
            r0 = 1
            goto L_0x0001
        L_0x002a:
            if (r0 == 0) goto L_0x0033
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L_0x0033:
            goto L_0x0035
        L_0x0034:
            throw r1
        L_0x0035:
            goto L_0x0034
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.publicsuffix.PublicSuffixDatabase.m23660f():void");
    }

    /* renamed from: d */
    public String mo39076d(String str) {
        Objects.requireNonNull(str, "domain == null");
        String[] split = IDN.toUnicode(str).split("\\.");
        String[] b = m23657b(split);
        if (split.length == b.length && b[0].charAt(0) != '!') {
            return null;
        }
        char charAt = b[0].charAt(0);
        int length = split.length;
        int length2 = b.length;
        if (charAt != '!') {
            length2++;
        }
        StringBuilder sb = new StringBuilder();
        String[] split2 = str.split("\\.");
        for (int i = length - length2; i < split2.length; i++) {
            sb.append(split2[i]);
            sb.append(FilenameUtils.EXTENSION_SEPARATOR);
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }
}
