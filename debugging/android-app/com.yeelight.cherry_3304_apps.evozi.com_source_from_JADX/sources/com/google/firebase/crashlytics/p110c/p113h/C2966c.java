package com.google.firebase.crashlytics.p110c.p113h;

import android.support.p002v4.media.session.PlaybackStateCompat;
import com.google.p107ar.schemas.sceneform.ParameterInitDefType;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.NoSuchElementException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: com.google.firebase.crashlytics.c.h.c */
class C2966c implements Closeable {

    /* renamed from: g */
    private static final Logger f5759g = Logger.getLogger(C2966c.class.getName());
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final RandomAccessFile f5760a;

    /* renamed from: b */
    int f5761b;

    /* renamed from: c */
    private int f5762c;

    /* renamed from: d */
    private C2968b f5763d;

    /* renamed from: e */
    private C2968b f5764e;

    /* renamed from: f */
    private final byte[] f5765f = new byte[16];

    /* renamed from: com.google.firebase.crashlytics.c.h.c$a */
    class C2967a implements C2970d {

        /* renamed from: a */
        boolean f5766a = true;

        /* renamed from: b */
        final /* synthetic */ StringBuilder f5767b;

        C2967a(StringBuilder sb) {
            this.f5767b = sb;
        }

        /* renamed from: a */
        public void mo17327a(InputStream inputStream, int i) {
            if (this.f5766a) {
                this.f5766a = false;
            } else {
                this.f5767b.append(", ");
            }
            this.f5767b.append(i);
        }
    }

    /* renamed from: com.google.firebase.crashlytics.c.h.c$b */
    static class C2968b {

        /* renamed from: c */
        static final C2968b f5769c = new C2968b(0, 0);

        /* renamed from: a */
        final int f5770a;

        /* renamed from: b */
        final int f5771b;

        C2968b(int i, int i2) {
            this.f5770a = i;
            this.f5771b = i2;
        }

        public String toString() {
            return C2968b.class.getSimpleName() + "[position = " + this.f5770a + ", length = " + this.f5771b + "]";
        }
    }

    /* renamed from: com.google.firebase.crashlytics.c.h.c$c */
    private final class C2969c extends InputStream {

        /* renamed from: a */
        private int f5772a;

        /* renamed from: b */
        private int f5773b;

        private C2969c(C2968b bVar) {
            this.f5772a = C2966c.this.m9109T(bVar.f5770a + 4);
            this.f5773b = bVar.f5771b;
        }

        /* synthetic */ C2969c(C2966c cVar, C2968b bVar, C2967a aVar) {
            this(bVar);
        }

        public int read() {
            if (this.f5773b == 0) {
                return -1;
            }
            C2966c.this.f5760a.seek((long) this.f5772a);
            int read = C2966c.this.f5760a.read();
            this.f5772a = C2966c.this.m9109T(this.f5772a + 1);
            this.f5773b--;
            return read;
        }

        public int read(byte[] bArr, int i, int i2) {
            Object unused = C2966c.m9100C(bArr, "buffer");
            if ((i | i2) < 0 || i2 > bArr.length - i) {
                throw new ArrayIndexOutOfBoundsException();
            }
            int i3 = this.f5773b;
            if (i3 <= 0) {
                return -1;
            }
            if (i2 > i3) {
                i2 = i3;
            }
            C2966c.this.m9106M(this.f5772a, bArr, i, i2);
            this.f5772a = C2966c.this.m9109T(this.f5772a + i2);
            this.f5773b -= i2;
            return i2;
        }
    }

    /* renamed from: com.google.firebase.crashlytics.c.h.c$d */
    public interface C2970d {
        /* renamed from: a */
        void mo17327a(InputStream inputStream, int i);
    }

    public C2966c(File file) {
        if (!file.exists()) {
            m9118t(file);
        }
        this.f5760a = m9101D(file);
        m9103I();
    }

    /* access modifiers changed from: private */
    /* renamed from: C */
    public static <T> T m9100C(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    /* renamed from: D */
    private static RandomAccessFile m9101D(File file) {
        return new RandomAccessFile(file, "rwd");
    }

    /* renamed from: F */
    private C2968b m9102F(int i) {
        if (i == 0) {
            return C2968b.f5769c;
        }
        this.f5760a.seek((long) i);
        return new C2968b(i, this.f5760a.readInt());
    }

    /* renamed from: I */
    private void m9103I() {
        this.f5760a.seek(0);
        this.f5760a.readFully(this.f5765f);
        int J = m9104J(this.f5765f, 0);
        this.f5761b = J;
        if (((long) J) <= this.f5760a.length()) {
            this.f5762c = m9104J(this.f5765f, 4);
            int J2 = m9104J(this.f5765f, 8);
            int J3 = m9104J(this.f5765f, 12);
            this.f5763d = m9102F(J2);
            this.f5764e = m9102F(J3);
            return;
        }
        throw new IOException("File is truncated. Expected length: " + this.f5761b + ", Actual length: " + this.f5760a.length());
    }

    /* renamed from: J */
    private static int m9104J(byte[] bArr, int i) {
        return ((bArr[i] & 255) << 24) + ((bArr[i + 1] & 255) << ParameterInitDefType.ExternalSamplerInit) + ((bArr[i + 2] & 255) << 8) + (bArr[i + 3] & 255);
    }

    /* renamed from: K */
    private int m9105K() {
        return this.f5761b - mo17319S();
    }

    /* access modifiers changed from: private */
    /* renamed from: M */
    public void m9106M(int i, byte[] bArr, int i2, int i3) {
        RandomAccessFile randomAccessFile;
        int T = m9109T(i);
        int i4 = T + i3;
        int i5 = this.f5761b;
        if (i4 <= i5) {
            this.f5760a.seek((long) T);
            randomAccessFile = this.f5760a;
        } else {
            int i6 = i5 - T;
            this.f5760a.seek((long) T);
            this.f5760a.readFully(bArr, i2, i6);
            this.f5760a.seek(16);
            randomAccessFile = this.f5760a;
            i2 += i6;
            i3 -= i6;
        }
        randomAccessFile.readFully(bArr, i2, i3);
    }

    /* renamed from: Q */
    private void m9107Q(int i, byte[] bArr, int i2, int i3) {
        RandomAccessFile randomAccessFile;
        int T = m9109T(i);
        int i4 = T + i3;
        int i5 = this.f5761b;
        if (i4 <= i5) {
            this.f5760a.seek((long) T);
            randomAccessFile = this.f5760a;
        } else {
            int i6 = i5 - T;
            this.f5760a.seek((long) T);
            this.f5760a.write(bArr, i2, i6);
            this.f5760a.seek(16);
            randomAccessFile = this.f5760a;
            i2 += i6;
            i3 -= i6;
        }
        randomAccessFile.write(bArr, i2, i3);
    }

    /* renamed from: R */
    private void m9108R(int i) {
        this.f5760a.setLength((long) i);
        this.f5760a.getChannel().force(true);
    }

    /* access modifiers changed from: private */
    /* renamed from: T */
    public int m9109T(int i) {
        int i2 = this.f5761b;
        return i < i2 ? i : (i + 16) - i2;
    }

    /* renamed from: V */
    private void m9110V(int i, int i2, int i3, int i4) {
        m9112X(this.f5765f, i, i2, i3, i4);
        this.f5760a.seek(0);
        this.f5760a.write(this.f5765f);
    }

    /* renamed from: W */
    private static void m9111W(byte[] bArr, int i, int i2) {
        bArr[i] = (byte) (i2 >> 24);
        bArr[i + 1] = (byte) (i2 >> 16);
        bArr[i + 2] = (byte) (i2 >> 8);
        bArr[i + 3] = (byte) i2;
    }

    /* renamed from: X */
    private static void m9112X(byte[] bArr, int... iArr) {
        int i = 0;
        for (int W : iArr) {
            m9111W(bArr, i, W);
            i += 4;
        }
    }

    /* renamed from: o */
    private void m9117o(int i) {
        int i2 = i + 4;
        int K = m9105K();
        if (K < i2) {
            int i3 = this.f5761b;
            do {
                K += i3;
                i3 <<= 1;
            } while (K < i2);
            m9108R(i3);
            C2968b bVar = this.f5764e;
            int T = m9109T(bVar.f5770a + 4 + bVar.f5771b);
            if (T < this.f5763d.f5770a) {
                FileChannel channel = this.f5760a.getChannel();
                channel.position((long) this.f5761b);
                long j = (long) (T - 4);
                if (channel.transferTo(16, j, channel) != j) {
                    throw new AssertionError("Copied insufficient number of bytes!");
                }
            }
            int i4 = this.f5764e.f5770a;
            int i5 = this.f5763d.f5770a;
            if (i4 < i5) {
                int i6 = (this.f5761b + i4) - 16;
                m9110V(i3, this.f5762c, i5, i6);
                this.f5764e = new C2968b(i6, this.f5764e.f5771b);
            } else {
                m9110V(i3, this.f5762c, i5, i4);
            }
            this.f5761b = i3;
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: t */
    private static void m9118t(File file) {
        File file2 = new File(file.getPath() + ".tmp");
        RandomAccessFile D = m9101D(file2);
        try {
            D.setLength(PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM);
            D.seek(0);
            byte[] bArr = new byte[16];
            m9112X(bArr, 4096, 0, 0, 0);
            D.write(bArr);
            D.close();
            if (!file2.renameTo(file)) {
                throw new IOException("Rename failed!");
            }
        } catch (Throwable th) {
            D.close();
            throw th;
        }
    }

    /* renamed from: L */
    public synchronized void mo17318L() {
        if (mo17326u()) {
            throw new NoSuchElementException();
        } else if (this.f5762c == 1) {
            mo17323n();
        } else {
            int T = m9109T(this.f5763d.f5770a + 4 + this.f5763d.f5771b);
            m9106M(T, this.f5765f, 0, 4);
            int J = m9104J(this.f5765f, 0);
            m9110V(this.f5761b, this.f5762c - 1, T, this.f5764e.f5770a);
            this.f5762c--;
            this.f5763d = new C2968b(T, J);
        }
    }

    /* renamed from: S */
    public int mo17319S() {
        if (this.f5762c == 0) {
            return 16;
        }
        C2968b bVar = this.f5764e;
        int i = bVar.f5770a;
        int i2 = this.f5763d.f5770a;
        return i >= i2 ? (i - i2) + 4 + bVar.f5771b + 16 : (((i + 4) + bVar.f5771b) + this.f5761b) - i2;
    }

    public synchronized void close() {
        this.f5760a.close();
    }

    /* renamed from: i */
    public void mo17321i(byte[] bArr) {
        mo17322j(bArr, 0, bArr.length);
    }

    /* renamed from: j */
    public synchronized void mo17322j(byte[] bArr, int i, int i2) {
        m9100C(bArr, "buffer");
        if ((i | i2) < 0 || i2 > bArr.length - i) {
            throw new IndexOutOfBoundsException();
        }
        m9117o(i2);
        boolean u = mo17326u();
        C2968b bVar = new C2968b(u ? 16 : m9109T(this.f5764e.f5770a + 4 + this.f5764e.f5771b), i2);
        m9111W(this.f5765f, 0, i2);
        m9107Q(bVar.f5770a, this.f5765f, 0, 4);
        m9107Q(bVar.f5770a + 4, bArr, i, i2);
        m9110V(this.f5761b, this.f5762c + 1, u ? bVar.f5770a : this.f5763d.f5770a, bVar.f5770a);
        this.f5764e = bVar;
        this.f5762c++;
        if (u) {
            this.f5763d = bVar;
        }
    }

    /* renamed from: n */
    public synchronized void mo17323n() {
        m9110V(4096, 0, 0, 0);
        this.f5762c = 0;
        this.f5763d = C2968b.f5769c;
        this.f5764e = C2968b.f5769c;
        if (this.f5761b > 4096) {
            m9108R(4096);
        }
        this.f5761b = 4096;
    }

    /* renamed from: s */
    public synchronized void mo17324s(C2970d dVar) {
        int i = this.f5763d.f5770a;
        for (int i2 = 0; i2 < this.f5762c; i2++) {
            C2968b F = m9102F(i);
            dVar.mo17327a(new C2969c(this, F, (C2967a) null), F.f5771b);
            i = m9109T(F.f5770a + 4 + F.f5771b);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(C2966c.class.getSimpleName());
        sb.append('[');
        sb.append("fileLength=");
        sb.append(this.f5761b);
        sb.append(", size=");
        sb.append(this.f5762c);
        sb.append(", first=");
        sb.append(this.f5763d);
        sb.append(", last=");
        sb.append(this.f5764e);
        sb.append(", element lengths=[");
        try {
            mo17324s(new C2967a(sb));
        } catch (IOException e) {
            f5759g.log(Level.WARNING, "read error", e);
        }
        sb.append("]]");
        return sb.toString();
    }

    /* renamed from: u */
    public synchronized boolean mo17326u() {
        return this.f5762c == 0;
    }
}
