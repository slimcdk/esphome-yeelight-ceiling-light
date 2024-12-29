package p011b1;

import android.support.p004v4.media.session.PlaybackStateCompat;
import com.google.p017ar.schemas.sceneform.ParameterInitDefType;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: b1.e */
class C0587e implements Closeable {

    /* renamed from: g */
    private static final Logger f189g = Logger.getLogger(C0587e.class.getName());
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final RandomAccessFile f190a;

    /* renamed from: b */
    int f191b;

    /* renamed from: c */
    private int f192c;

    /* renamed from: d */
    private C0589b f193d;

    /* renamed from: e */
    private C0589b f194e;

    /* renamed from: f */
    private final byte[] f195f = new byte[16];

    /* renamed from: b1.e$a */
    class C0588a implements C0591d {

        /* renamed from: a */
        boolean f196a = true;

        /* renamed from: b */
        final /* synthetic */ StringBuilder f197b;

        C0588a(C0587e eVar, StringBuilder sb) {
            this.f197b = sb;
        }

        /* renamed from: a */
        public void mo10953a(InputStream inputStream, int i) {
            if (this.f196a) {
                this.f196a = false;
            } else {
                this.f197b.append(", ");
            }
            this.f197b.append(i);
        }
    }

    /* renamed from: b1.e$b */
    static class C0589b {

        /* renamed from: c */
        static final C0589b f198c = new C0589b(0, 0);

        /* renamed from: a */
        final int f199a;

        /* renamed from: b */
        final int f200b;

        C0589b(int i, int i2) {
            this.f199a = i;
            this.f200b = i2;
        }

        public String toString() {
            return C0589b.class.getSimpleName() + "[position = " + this.f199a + ", length = " + this.f200b + "]";
        }
    }

    /* renamed from: b1.e$c */
    private final class C0590c extends InputStream {

        /* renamed from: a */
        private int f201a;

        /* renamed from: b */
        private int f202b;

        private C0590c(C0589b bVar) {
            this.f201a = C0587e.this.m117J(bVar.f199a + 4);
            this.f202b = bVar.f200b;
        }

        /* synthetic */ C0590c(C0587e eVar, C0589b bVar, C0588a aVar) {
            this(bVar);
        }

        public int read() {
            if (this.f202b == 0) {
                return -1;
            }
            C0587e.this.f190a.seek((long) this.f201a);
            int read = C0587e.this.f190a.read();
            this.f201a = C0587e.this.m117J(this.f201a + 1);
            this.f202b--;
            return read;
        }

        public int read(byte[] bArr, int i, int i2) {
            Object unused = C0587e.m127q(bArr, "buffer");
            if ((i | i2) < 0 || i2 > bArr.length - i) {
                throw new ArrayIndexOutOfBoundsException();
            }
            int i3 = this.f202b;
            if (i3 <= 0) {
                return -1;
            }
            if (i2 > i3) {
                i2 = i3;
            }
            C0587e.this.m114E(this.f201a, bArr, i, i2);
            this.f201a = C0587e.this.m117J(this.f201a + i2);
            this.f202b -= i2;
            return i2;
        }
    }

    /* renamed from: b1.e$d */
    public interface C0591d {
        /* renamed from: a */
        void mo10953a(InputStream inputStream, int i);
    }

    public C0587e(File file) {
        if (!file.exists()) {
            m126n(file);
        }
        this.f190a = m128s(file);
        m130z();
    }

    /* renamed from: A */
    private static int m112A(byte[] bArr, int i) {
        return ((bArr[i] & 255) << 24) + ((bArr[i + 1] & 255) << ParameterInitDefType.ExternalSamplerInit) + ((bArr[i + 2] & 255) << 8) + (bArr[i + 3] & 255);
    }

    /* renamed from: B */
    private int m113B() {
        return this.f191b - mo10945I();
    }

    /* access modifiers changed from: private */
    /* renamed from: E */
    public void m114E(int i, byte[] bArr, int i2, int i3) {
        RandomAccessFile randomAccessFile;
        int J = m117J(i);
        int i4 = J + i3;
        int i5 = this.f191b;
        if (i4 <= i5) {
            this.f190a.seek((long) J);
            randomAccessFile = this.f190a;
        } else {
            int i6 = i5 - J;
            this.f190a.seek((long) J);
            this.f190a.readFully(bArr, i2, i6);
            this.f190a.seek(16);
            randomAccessFile = this.f190a;
            i2 += i6;
            i3 -= i6;
        }
        randomAccessFile.readFully(bArr, i2, i3);
    }

    /* renamed from: G */
    private void m115G(int i, byte[] bArr, int i2, int i3) {
        RandomAccessFile randomAccessFile;
        int J = m117J(i);
        int i4 = J + i3;
        int i5 = this.f191b;
        if (i4 <= i5) {
            this.f190a.seek((long) J);
            randomAccessFile = this.f190a;
        } else {
            int i6 = i5 - J;
            this.f190a.seek((long) J);
            this.f190a.write(bArr, i2, i6);
            this.f190a.seek(16);
            randomAccessFile = this.f190a;
            i2 += i6;
            i3 -= i6;
        }
        randomAccessFile.write(bArr, i2, i3);
    }

    /* renamed from: H */
    private void m116H(int i) {
        this.f190a.setLength((long) i);
        this.f190a.getChannel().force(true);
    }

    /* access modifiers changed from: private */
    /* renamed from: J */
    public int m117J(int i) {
        int i2 = this.f191b;
        return i < i2 ? i : (i + 16) - i2;
    }

    /* renamed from: N */
    private void m118N(int i, int i2, int i3, int i4) {
        m120T(this.f195f, i, i2, i3, i4);
        this.f190a.seek(0);
        this.f190a.write(this.f195f);
    }

    /* renamed from: P */
    private static void m119P(byte[] bArr, int i, int i2) {
        bArr[i] = (byte) (i2 >> 24);
        bArr[i + 1] = (byte) (i2 >> 16);
        bArr[i + 2] = (byte) (i2 >> 8);
        bArr[i + 3] = (byte) i2;
    }

    /* renamed from: T */
    private static void m120T(byte[] bArr, int... iArr) {
        int i = 0;
        for (int P : iArr) {
            m119P(bArr, i, P);
            i += 4;
        }
    }

    /* renamed from: l */
    private void m125l(int i) {
        int i2 = i + 4;
        int B = m113B();
        if (B < i2) {
            int i3 = this.f191b;
            do {
                B += i3;
                i3 <<= 1;
            } while (B < i2);
            m116H(i3);
            C0589b bVar = this.f194e;
            int J = m117J(bVar.f199a + 4 + bVar.f200b);
            if (J < this.f193d.f199a) {
                FileChannel channel = this.f190a.getChannel();
                channel.position((long) this.f191b);
                long j = (long) (J - 4);
                if (channel.transferTo(16, j, channel) != j) {
                    throw new AssertionError("Copied insufficient number of bytes!");
                }
            }
            int i4 = this.f194e.f199a;
            int i5 = this.f193d.f199a;
            if (i4 < i5) {
                int i6 = (this.f191b + i4) - 16;
                m118N(i3, this.f192c, i5, i6);
                this.f194e = new C0589b(i6, this.f194e.f200b);
            } else {
                m118N(i3, this.f192c, i5, i4);
            }
            this.f191b = i3;
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: n */
    private static void m126n(File file) {
        File file2 = new File(file.getPath() + ".tmp");
        RandomAccessFile s = m128s(file2);
        try {
            s.setLength(PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM);
            s.seek(0);
            byte[] bArr = new byte[16];
            m120T(bArr, 4096, 0, 0, 0);
            s.write(bArr);
            s.close();
            if (!file2.renameTo(file)) {
                throw new IOException("Rename failed!");
            }
        } catch (Throwable th) {
            s.close();
            throw th;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public static <T> T m127q(T t, String str) {
        Objects.requireNonNull(t, str);
        return t;
    }

    /* renamed from: s */
    private static RandomAccessFile m128s(File file) {
        return new RandomAccessFile(file, "rwd");
    }

    /* renamed from: v */
    private C0589b m129v(int i) {
        if (i == 0) {
            return C0589b.f198c;
        }
        this.f190a.seek((long) i);
        return new C0589b(i, this.f190a.readInt());
    }

    /* renamed from: z */
    private void m130z() {
        this.f190a.seek(0);
        this.f190a.readFully(this.f195f);
        int A = m112A(this.f195f, 0);
        this.f191b = A;
        if (((long) A) <= this.f190a.length()) {
            this.f192c = m112A(this.f195f, 4);
            int A2 = m112A(this.f195f, 8);
            int A3 = m112A(this.f195f, 12);
            this.f193d = m129v(A2);
            this.f194e = m129v(A3);
            return;
        }
        throw new IOException("File is truncated. Expected length: " + this.f191b + ", Actual length: " + this.f190a.length());
    }

    /* renamed from: D */
    public synchronized void mo10944D() {
        if (mo10951p()) {
            throw new NoSuchElementException();
        } else if (this.f192c == 1) {
            mo10949k();
        } else {
            C0589b bVar = this.f193d;
            int J = m117J(bVar.f199a + 4 + bVar.f200b);
            m114E(J, this.f195f, 0, 4);
            int A = m112A(this.f195f, 0);
            m118N(this.f191b, this.f192c - 1, J, this.f194e.f199a);
            this.f192c--;
            this.f193d = new C0589b(J, A);
        }
    }

    /* renamed from: I */
    public int mo10945I() {
        if (this.f192c == 0) {
            return 16;
        }
        C0589b bVar = this.f194e;
        int i = bVar.f199a;
        int i2 = this.f193d.f199a;
        return i >= i2 ? (i - i2) + 4 + bVar.f200b + 16 : (((i + 4) + bVar.f200b) + this.f191b) - i2;
    }

    public synchronized void close() {
        this.f190a.close();
    }

    /* renamed from: h */
    public void mo10947h(byte[] bArr) {
        mo10948i(bArr, 0, bArr.length);
    }

    /* renamed from: i */
    public synchronized void mo10948i(byte[] bArr, int i, int i2) {
        int i3;
        m127q(bArr, "buffer");
        if ((i | i2) < 0 || i2 > bArr.length - i) {
            throw new IndexOutOfBoundsException();
        }
        m125l(i2);
        boolean p = mo10951p();
        if (p) {
            i3 = 16;
        } else {
            C0589b bVar = this.f194e;
            i3 = m117J(bVar.f199a + 4 + bVar.f200b);
        }
        C0589b bVar2 = new C0589b(i3, i2);
        m119P(this.f195f, 0, i2);
        m115G(bVar2.f199a, this.f195f, 0, 4);
        m115G(bVar2.f199a + 4, bArr, i, i2);
        m118N(this.f191b, this.f192c + 1, p ? bVar2.f199a : this.f193d.f199a, bVar2.f199a);
        this.f194e = bVar2;
        this.f192c++;
        if (p) {
            this.f193d = bVar2;
        }
    }

    /* renamed from: k */
    public synchronized void mo10949k() {
        m118N(4096, 0, 0, 0);
        this.f192c = 0;
        C0589b bVar = C0589b.f198c;
        this.f193d = bVar;
        this.f194e = bVar;
        if (this.f191b > 4096) {
            m116H(4096);
        }
        this.f191b = 4096;
    }

    /* renamed from: m */
    public synchronized void mo10950m(C0591d dVar) {
        int i = this.f193d.f199a;
        for (int i2 = 0; i2 < this.f192c; i2++) {
            C0589b v = m129v(i);
            dVar.mo10953a(new C0590c(this, v, (C0588a) null), v.f200b);
            i = m117J(v.f199a + 4 + v.f200b);
        }
    }

    /* renamed from: p */
    public synchronized boolean mo10951p() {
        return this.f192c == 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(C0587e.class.getSimpleName());
        sb.append('[');
        sb.append("fileLength=");
        sb.append(this.f191b);
        sb.append(", size=");
        sb.append(this.f192c);
        sb.append(", first=");
        sb.append(this.f193d);
        sb.append(", last=");
        sb.append(this.f194e);
        sb.append(", element lengths=[");
        try {
            mo10950m(new C0588a(this, sb));
        } catch (IOException e) {
            f189g.log(Level.WARNING, "read error", e);
        }
        sb.append("]]");
        return sb.toString();
    }
}
