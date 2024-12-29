package okhttp3.internal.http2;

import androidx.appcompat.widget.ActivityChooserView;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import okhttp3.internal.http2.C9804b;
import okio.C3564c;
import okio.C9837d;
import p056k5.C3300c;

/* renamed from: okhttp3.internal.http2.g */
final class C9826g implements Closeable {

    /* renamed from: g */
    private static final Logger f17798g = Logger.getLogger(C9807c.class.getName());

    /* renamed from: a */
    private final C9837d f17799a;

    /* renamed from: b */
    private final boolean f17800b;

    /* renamed from: c */
    private final C3564c f17801c;

    /* renamed from: d */
    private int f17802d = 16384;

    /* renamed from: e */
    private boolean f17803e;

    /* renamed from: f */
    final C9804b.C9806b f17804f;

    C9826g(C9837d dVar, boolean z) {
        this.f17799a = dVar;
        this.f17800b = z;
        C3564c cVar = new C3564c();
        this.f17801c = cVar;
        this.f17804f = new C9804b.C9806b(cVar);
    }

    /* renamed from: m */
    private void m23624m(int i, long j) {
        while (j > 0) {
            int min = (int) Math.min((long) this.f17802d, j);
            long j2 = (long) min;
            j -= j2;
            mo39054d(i, min, (byte) 9, j == 0 ? (byte) 4 : 0);
            this.f17799a.mo24476q0(this.f17801c, j2);
        }
    }

    /* renamed from: n */
    private static void m23625n(C9837d dVar, int i) {
        dVar.mo24736R((i >>> 16) & 255);
        dVar.mo24736R((i >>> 8) & 255);
        dVar.mo24736R(i & 255);
    }

    /* renamed from: S */
    public synchronized void mo39047S() {
        if (this.f17803e) {
            throw new IOException("closed");
        } else if (this.f17800b) {
            Logger logger = f17798g;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(C3300c.m8932q(">> CONNECTION %s", C9807c.f17721a.hex()));
            }
            this.f17799a.mo24732O0(C9807c.f17721a.toByteArray());
            this.f17799a.flush();
        }
    }

    /* renamed from: X */
    public synchronized void mo39048X(boolean z, int i, C3564c cVar, int i2) {
        if (!this.f17803e) {
            byte b = 0;
            if (z) {
                b = (byte) 1;
            }
            mo39052c(i, b, cVar, i2);
        } else {
            throw new IOException("closed");
        }
    }

    /* renamed from: X0 */
    public int mo39049X0() {
        return this.f17802d;
    }

    /* renamed from: a */
    public synchronized void mo39050a(C9829i iVar) {
        if (!this.f17803e) {
            this.f17802d = iVar.mo39071f(this.f17802d);
            if (iVar.mo39068c() != -1) {
                this.f17804f.mo39004e(iVar.mo39068c());
            }
            mo39054d(0, 0, (byte) 4, (byte) 1);
            this.f17799a.flush();
        } else {
            throw new IOException("closed");
        }
    }

    /* renamed from: b */
    public synchronized void mo39051b(int i, long j) {
        if (this.f17803e) {
            throw new IOException("closed");
        } else if (j == 0 || j > 2147483647L) {
            throw C9807c.m23538c("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: %s", Long.valueOf(j));
        } else {
            mo39054d(i, 4, (byte) 8, (byte) 0);
            this.f17799a.mo24730M((int) j);
            this.f17799a.flush();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo39052c(int i, byte b, C3564c cVar, int i2) {
        mo39054d(i, i2, (byte) 0, b);
        if (i2 > 0) {
            this.f17799a.mo24476q0(cVar, (long) i2);
        }
    }

    public synchronized void close() {
        this.f17803e = true;
        this.f17799a.close();
    }

    /* renamed from: d */
    public void mo39054d(int i, int i2, byte b, byte b2) {
        Logger logger = f17798g;
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(C9807c.m23537b(false, i, i2, b, b2));
        }
        int i3 = this.f17802d;
        if (i2 > i3) {
            throw C9807c.m23538c("FRAME_SIZE_ERROR length > %d: %d", Integer.valueOf(i3), Integer.valueOf(i2));
        } else if ((Integer.MIN_VALUE & i) == 0) {
            m23625n(this.f17799a, i2);
            this.f17799a.mo24736R(b & 255);
            this.f17799a.mo24736R(b2 & 255);
            this.f17799a.mo24730M(i & ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED);
        } else {
            throw C9807c.m23538c("reserved bit set: %s", Integer.valueOf(i));
        }
    }

    /* renamed from: e */
    public synchronized void mo39055e(boolean z, int i, int i2) {
        if (!this.f17803e) {
            mo39054d(0, 8, (byte) 6, z ? (byte) 1 : 0);
            this.f17799a.mo24730M(i);
            this.f17799a.mo24730M(i2);
            this.f17799a.flush();
        } else {
            throw new IOException("closed");
        }
    }

    /* renamed from: f */
    public synchronized void mo39056f(int i, ErrorCode errorCode, byte[] bArr) {
        if (this.f17803e) {
            throw new IOException("closed");
        } else if (errorCode.httpCode != -1) {
            mo39054d(0, bArr.length + 8, (byte) 7, (byte) 0);
            this.f17799a.mo24730M(i);
            this.f17799a.mo24730M(errorCode.httpCode);
            if (bArr.length > 0) {
                this.f17799a.mo24732O0(bArr);
            }
            this.f17799a.flush();
        } else {
            throw C9807c.m23538c("errorCode.httpCode == -1", new Object[0]);
        }
    }

    public synchronized void flush() {
        if (!this.f17803e) {
            this.f17799a.flush();
        } else {
            throw new IOException("closed");
        }
    }

    /* renamed from: g */
    public synchronized void mo39058g(int i, int i2, List<C9802a> list) {
        if (!this.f17803e) {
            this.f17804f.mo39006g(list);
            long i1 = this.f17801c.mo24758i1();
            int min = (int) Math.min((long) (this.f17802d - 4), i1);
            long j = (long) min;
            mo39054d(i, min + 4, (byte) 5, i1 == j ? (byte) 4 : 0);
            this.f17799a.mo24730M(i2 & ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED);
            this.f17799a.mo24476q0(this.f17801c, j);
            if (i1 > j) {
                m23624m(i, i1 - j);
            }
        } else {
            throw new IOException("closed");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo39059h(boolean z, int i, List<C9802a> list) {
        if (!this.f17803e) {
            this.f17804f.mo39006g(list);
            long i1 = this.f17801c.mo24758i1();
            int min = (int) Math.min((long) this.f17802d, i1);
            long j = (long) min;
            byte b = i1 == j ? (byte) 4 : 0;
            if (z) {
                b = (byte) (b | 1);
            }
            mo39054d(i, min, (byte) 1, b);
            this.f17799a.mo24476q0(this.f17801c, j);
            if (i1 > j) {
                m23624m(i, i1 - j);
                return;
            }
            return;
        }
        throw new IOException("closed");
    }

    /* renamed from: i */
    public synchronized void mo39060i(int i, ErrorCode errorCode) {
        if (this.f17803e) {
            throw new IOException("closed");
        } else if (errorCode.httpCode != -1) {
            mo39054d(i, 4, (byte) 3, (byte) 0);
            this.f17799a.mo24730M(errorCode.httpCode);
            this.f17799a.flush();
        } else {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: k */
    public synchronized void mo39061k(C9829i iVar) {
        if (!this.f17803e) {
            int i = 0;
            mo39054d(0, iVar.mo39075j() * 6, (byte) 4, (byte) 0);
            while (i < 10) {
                if (iVar.mo39072g(i)) {
                    this.f17799a.mo24729L(i == 4 ? 3 : i == 7 ? 4 : i);
                    this.f17799a.mo24730M(iVar.mo39067b(i));
                }
                i++;
            }
            this.f17799a.flush();
        } else {
            throw new IOException("closed");
        }
    }

    /* renamed from: l */
    public synchronized void mo39062l(boolean z, int i, int i2, List<C9802a> list) {
        if (!this.f17803e) {
            mo39059h(z, i, list);
        } else {
            throw new IOException("closed");
        }
    }
}
