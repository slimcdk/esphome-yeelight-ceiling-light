package p156f.p157g0.p161i;

import androidx.appcompat.widget.ActivityChooserView;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import p156f.p157g0.C4345c;
import p156f.p157g0.p161i.C10789d;
import p163g.C4406c;
import p163g.C4409d;

/* renamed from: f.g0.i.j */
final class C10811j implements Closeable {

    /* renamed from: g */
    private static final Logger f20844g = Logger.getLogger(C10792e.class.getName());

    /* renamed from: a */
    private final C4409d f20845a;

    /* renamed from: b */
    private final boolean f20846b;

    /* renamed from: c */
    private final C4406c f20847c;

    /* renamed from: d */
    private int f20848d = 16384;

    /* renamed from: e */
    private boolean f20849e;

    /* renamed from: f */
    final C10789d.C10791b f20850f;

    C10811j(C4409d dVar, boolean z) {
        this.f20845a = dVar;
        this.f20846b = z;
        C4406c cVar = new C4406c();
        this.f20847c = cVar;
        this.f20850f = new C10789d.C10791b(cVar);
    }

    /* renamed from: s */
    private void m26880s(int i, long j) {
        while (j > 0) {
            int min = (int) Math.min((long) this.f20848d, j);
            long j2 = (long) min;
            j -= j2;
            mo34107g(i, min, (byte) 9, j == 0 ? (byte) 4 : 0);
            this.f20845a.mo9442p0(this.f20847c, j2);
        }
    }

    /* renamed from: t */
    private static void m26881t(C4409d dVar, int i) {
        dVar.mo24217U((i >>> 16) & 255);
        dVar.mo24217U((i >>> 8) & 255);
        dVar.mo24217U(i & 255);
    }

    /* renamed from: A */
    public synchronized void mo34098A(boolean z, int i, C4406c cVar, int i2) {
        if (!this.f20849e) {
            byte b = 0;
            if (z) {
                b = (byte) 1;
            }
            mo34101b(i, b, cVar, i2);
        } else {
            throw new IOException("closed");
        }
    }

    /* renamed from: V0 */
    public int mo34099V0() {
        return this.f20848d;
    }

    /* renamed from: a */
    public synchronized void mo34100a(C10816m mVar) {
        if (!this.f20849e) {
            this.f20848d = mVar.mo34126f(this.f20848d);
            if (mVar.mo34123c() != -1) {
                this.f20850f.mo34055e(mVar.mo34123c());
            }
            mo34107g(0, 0, (byte) 4, (byte) 1);
            this.f20845a.flush();
        } else {
            throw new IOException("closed");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo34101b(int i, byte b, C4406c cVar, int i2) {
        mo34107g(i, i2, (byte) 0, b);
        if (i2 > 0) {
            this.f20845a.mo9442p0(cVar, (long) i2);
        }
    }

    /* renamed from: c */
    public synchronized void mo34102c(int i, long j) {
        if (this.f20849e) {
            throw new IOException("closed");
        } else if (j == 0 || j > 2147483647L) {
            C10792e.m26787c("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: %s", Long.valueOf(j));
            throw null;
        } else {
            mo34107g(i, 4, (byte) 8, (byte) 0);
            this.f20845a.mo24215P((int) j);
            this.f20845a.flush();
        }
    }

    public synchronized void close() {
        this.f20849e = true;
        this.f20845a.close();
    }

    /* renamed from: d */
    public synchronized void mo34104d(boolean z, int i, int i2) {
        if (!this.f20849e) {
            mo34107g(0, 8, (byte) 6, z ? (byte) 1 : 0);
            this.f20845a.mo24215P(i);
            this.f20845a.mo24215P(i2);
            this.f20845a.flush();
        } else {
            throw new IOException("closed");
        }
    }

    /* renamed from: e */
    public synchronized void mo34105e(int i, int i2, List<C10787c> list) {
        if (!this.f20849e) {
            this.f20850f.mo34057g(list);
            long g1 = this.f20847c.mo24233g1();
            int min = (int) Math.min((long) (this.f20848d - 4), g1);
            long j = (long) min;
            mo34107g(i, min + 4, (byte) 5, g1 == j ? (byte) 4 : 0);
            this.f20845a.mo24215P(i2 & ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED);
            this.f20845a.mo9442p0(this.f20847c, j);
            if (g1 > j) {
                m26880s(i, g1 - j);
            }
        } else {
            throw new IOException("closed");
        }
    }

    public synchronized void flush() {
        if (!this.f20849e) {
            this.f20845a.flush();
        } else {
            throw new IOException("closed");
        }
    }

    /* renamed from: g */
    public void mo34107g(int i, int i2, byte b, byte b2) {
        if (f20844g.isLoggable(Level.FINE)) {
            f20844g.fine(C10792e.m26786b(false, i, i2, b, b2));
        }
        int i3 = this.f20848d;
        if (i2 > i3) {
            C10792e.m26787c("FRAME_SIZE_ERROR length > %d: %d", Integer.valueOf(i3), Integer.valueOf(i2));
            throw null;
        } else if ((Integer.MIN_VALUE & i) == 0) {
            m26881t(this.f20845a, i2);
            this.f20845a.mo24217U(b & 255);
            this.f20845a.mo24217U(b2 & 255);
            this.f20845a.mo24215P(i & ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED);
        } else {
            C10792e.m26787c("reserved bit set: %s", Integer.valueOf(i));
            throw null;
        }
    }

    /* renamed from: h */
    public synchronized void mo34108h(int i, C10786b bVar, byte[] bArr) {
        if (this.f20849e) {
            throw new IOException("closed");
        } else if (bVar.f20729a != -1) {
            mo34107g(0, bArr.length + 8, (byte) 7, (byte) 0);
            this.f20845a.mo24215P(i);
            this.f20845a.mo24215P(bVar.f20729a);
            if (bArr.length > 0) {
                this.f20845a.mo24210L0(bArr);
            }
            this.f20845a.flush();
        } else {
            C10792e.m26787c("errorCode.httpCode == -1", new Object[0]);
            throw null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo34109i(boolean z, int i, List<C10787c> list) {
        if (!this.f20849e) {
            this.f20850f.mo34057g(list);
            long g1 = this.f20847c.mo24233g1();
            int min = (int) Math.min((long) this.f20848d, g1);
            long j = (long) min;
            byte b = g1 == j ? (byte) 4 : 0;
            if (z) {
                b = (byte) (b | 1);
            }
            mo34107g(i, min, (byte) 1, b);
            this.f20845a.mo9442p0(this.f20847c, j);
            if (g1 > j) {
                m26880s(i, g1 - j);
                return;
            }
            return;
        }
        throw new IOException("closed");
    }

    /* renamed from: j */
    public synchronized void mo34110j(int i, C10786b bVar) {
        if (this.f20849e) {
            throw new IOException("closed");
        } else if (bVar.f20729a != -1) {
            mo34107g(i, 4, (byte) 3, (byte) 0);
            this.f20845a.mo24215P(bVar.f20729a);
            this.f20845a.flush();
        } else {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: n */
    public synchronized void mo34111n(C10816m mVar) {
        if (!this.f20849e) {
            int i = 0;
            mo34107g(0, mVar.mo34130j() * 6, (byte) 4, (byte) 0);
            while (i < 10) {
                if (mVar.mo34127g(i)) {
                    this.f20845a.mo24214O(i == 4 ? 3 : i == 7 ? 4 : i);
                    this.f20845a.mo24215P(mVar.mo34122b(i));
                }
                i++;
            }
            this.f20845a.flush();
        } else {
            throw new IOException("closed");
        }
    }

    /* renamed from: o */
    public synchronized void mo34112o(boolean z, int i, int i2, List<C10787c> list) {
        if (!this.f20849e) {
            mo34109i(z, i, list);
        } else {
            throw new IOException("closed");
        }
    }

    /* renamed from: y */
    public synchronized void mo34113y() {
        if (this.f20849e) {
            throw new IOException("closed");
        } else if (this.f20846b) {
            if (f20844g.isLoggable(Level.FINE)) {
                f20844g.fine(C4345c.m12371r(">> CONNECTION %s", C10792e.f20758a.mo24291j()));
            }
            this.f20845a.mo24210L0(C10792e.f20758a.mo24302u());
            this.f20845a.flush();
        }
    }
}
