package p156f.p157g0.p161i;

import androidx.appcompat.widget.ActivityChooserView;
import com.google.p107ar.schemas.sceneform.ParameterInitDefType;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import p156f.p157g0.C4345c;
import p156f.p157g0.p161i.C10789d;
import p163g.C4406c;
import p163g.C4410e;
import p163g.C4411f;
import p163g.C4416t;
import p163g.C4417u;

/* renamed from: f.g0.i.h */
final class C10808h implements Closeable {

    /* renamed from: e */
    static final Logger f20833e = Logger.getLogger(C10792e.class.getName());

    /* renamed from: a */
    private final C4410e f20834a;

    /* renamed from: b */
    private final C10809a f20835b;

    /* renamed from: c */
    private final boolean f20836c;

    /* renamed from: d */
    final C10789d.C10790a f20837d;

    /* renamed from: f.g0.i.h$a */
    static final class C10809a implements C4416t {

        /* renamed from: a */
        private final C4410e f20838a;

        /* renamed from: b */
        int f20839b;

        /* renamed from: c */
        byte f20840c;

        /* renamed from: d */
        int f20841d;

        /* renamed from: e */
        int f20842e;

        /* renamed from: f */
        short f20843f;

        C10809a(C4410e eVar) {
            this.f20838a = eVar;
        }

        /* renamed from: a */
        private void m26867a() {
            int i = this.f20841d;
            int o = C10808h.m26861o(this.f20838a);
            this.f20842e = o;
            this.f20839b = o;
            byte readByte = (byte) (this.f20838a.readByte() & 255);
            this.f20840c = (byte) (this.f20838a.readByte() & 255);
            if (C10808h.f20833e.isLoggable(Level.FINE)) {
                C10808h.f20833e.fine(C10792e.m26786b(true, this.f20841d, this.f20839b, readByte, this.f20840c));
            }
            int readInt = this.f20838a.readInt() & ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
            this.f20841d = readInt;
            if (readByte != 9) {
                C10792e.m26788d("%s != TYPE_CONTINUATION", Byte.valueOf(readByte));
                throw null;
            } else if (readInt != i) {
                C10792e.m26788d("TYPE_CONTINUATION streamId changed", new Object[0]);
                throw null;
            }
        }

        /* renamed from: P0 */
        public long mo9541P0(C4406c cVar, long j) {
            while (true) {
                int i = this.f20842e;
                if (i == 0) {
                    this.f20838a.skip((long) this.f20843f);
                    this.f20843f = 0;
                    if ((this.f20840c & 4) != 0) {
                        return -1;
                    }
                    m26867a();
                } else {
                    long P0 = this.f20838a.mo9541P0(cVar, Math.min(j, (long) i));
                    if (P0 == -1) {
                        return -1;
                    }
                    this.f20842e = (int) (((long) this.f20842e) - P0);
                    return P0;
                }
            }
        }

        public void close() {
        }

        /* renamed from: f */
        public C4417u mo9542f() {
            return this.f20838a.mo9542f();
        }
    }

    /* renamed from: f.g0.i.h$b */
    interface C10810b {
        /* renamed from: b */
        void mo34085b(boolean z, C10816m mVar);

        /* renamed from: c */
        void mo34086c(int i, long j);

        /* renamed from: d */
        void mo34087d(boolean z, int i, int i2);

        /* renamed from: e */
        void mo34088e(int i, int i2, List<C10787c> list);

        /* renamed from: f */
        void mo34089f();

        /* renamed from: g */
        void mo34090g(boolean z, int i, int i2, List<C10787c> list);

        /* renamed from: h */
        void mo34091h(int i, C10786b bVar);

        /* renamed from: i */
        void mo34092i(int i, C10786b bVar, C4411f fVar);

        /* renamed from: l */
        void mo34093l(boolean z, int i, C4410e eVar, int i2);

        /* renamed from: m */
        void mo34094m(int i, int i2, int i3, boolean z);
    }

    C10808h(C4410e eVar, boolean z) {
        this.f20834a = eVar;
        this.f20836c = z;
        C10809a aVar = new C10809a(eVar);
        this.f20835b = aVar;
        this.f20837d = new C10789d.C10790a(4096, aVar);
    }

    /* renamed from: C */
    private void m26852C(C10810b bVar, int i, byte b, int i2) {
        short s = 0;
        if (i2 != 0) {
            if ((b & 8) != 0) {
                s = (short) (this.f20834a.readByte() & 255);
            }
            bVar.mo34088e(i2, this.f20834a.readInt() & ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED, m26859j(m26856a(i - 4, b, s), s, b, i2));
            return;
        }
        C10792e.m26788d("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0", new Object[0]);
        throw null;
    }

    /* renamed from: D */
    private void m26853D(C10810b bVar, int i, byte b, int i2) {
        if (i != 4) {
            C10792e.m26788d("TYPE_RST_STREAM length: %d != 4", Integer.valueOf(i));
            throw null;
        } else if (i2 != 0) {
            int readInt = this.f20834a.readInt();
            C10786b a = C10786b.m26756a(readInt);
            if (a != null) {
                bVar.mo34091h(i2, a);
                return;
            }
            C10792e.m26788d("TYPE_RST_STREAM unexpected error code: %d", Integer.valueOf(readInt));
            throw null;
        } else {
            C10792e.m26788d("TYPE_RST_STREAM streamId == 0", new Object[0]);
            throw null;
        }
    }

    /* renamed from: F */
    private void m26854F(C10810b bVar, int i, byte b, int i2) {
        if (i2 != 0) {
            C10792e.m26788d("TYPE_SETTINGS streamId != 0", new Object[0]);
            throw null;
        } else if ((b & 1) != 0) {
            if (i == 0) {
                bVar.mo34089f();
            } else {
                C10792e.m26788d("FRAME_SIZE_ERROR ack frame should be empty!", new Object[0]);
                throw null;
            }
        } else if (i % 6 == 0) {
            C10816m mVar = new C10816m();
            for (int i3 = 0; i3 < i; i3 += 6) {
                short readShort = this.f20834a.readShort() & 65535;
                int readInt = this.f20834a.readInt();
                if (readShort != 2) {
                    if (readShort == 3) {
                        readShort = 4;
                    } else if (readShort == 4) {
                        readShort = 7;
                        if (readInt < 0) {
                            C10792e.m26788d("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1", new Object[0]);
                            throw null;
                        }
                    } else if (readShort == 5 && (readInt < 16384 || readInt > 16777215)) {
                        C10792e.m26788d("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: %s", Integer.valueOf(readInt));
                        throw null;
                    }
                } else if (!(readInt == 0 || readInt == 1)) {
                    C10792e.m26788d("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1", new Object[0]);
                    throw null;
                }
                mVar.mo34129i(readShort, readInt);
            }
            bVar.mo34085b(false, mVar);
        } else {
            C10792e.m26788d("TYPE_SETTINGS length %% 6 != 0: %s", Integer.valueOf(i));
            throw null;
        }
    }

    /* renamed from: I */
    private void m26855I(C10810b bVar, int i, byte b, int i2) {
        if (i == 4) {
            long readInt = ((long) this.f20834a.readInt()) & 2147483647L;
            if (readInt != 0) {
                bVar.mo34086c(i2, readInt);
                return;
            }
            C10792e.m26788d("windowSizeIncrement was 0", Long.valueOf(readInt));
            throw null;
        }
        C10792e.m26788d("TYPE_WINDOW_UPDATE length !=4: %s", Integer.valueOf(i));
        throw null;
    }

    /* renamed from: a */
    static int m26856a(int i, byte b, short s) {
        if ((b & 8) != 0) {
            i--;
        }
        if (s <= i) {
            return (short) (i - s);
        }
        C10792e.m26788d("PROTOCOL_ERROR padding %s > remaining length %s", Short.valueOf(s), Integer.valueOf(i));
        throw null;
    }

    /* renamed from: h */
    private void m26857h(C10810b bVar, int i, byte b, int i2) {
        short s = 0;
        if (i2 != 0) {
            boolean z = true;
            boolean z2 = (b & 1) != 0;
            if ((b & 32) == 0) {
                z = false;
            }
            if (!z) {
                if ((b & 8) != 0) {
                    s = (short) (this.f20834a.readByte() & 255);
                }
                bVar.mo34093l(z2, i2, this.f20834a, m26856a(i, b, s));
                this.f20834a.skip((long) s);
                return;
            }
            C10792e.m26788d("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA", new Object[0]);
            throw null;
        }
        C10792e.m26788d("PROTOCOL_ERROR: TYPE_DATA streamId == 0", new Object[0]);
        throw null;
    }

    /* renamed from: i */
    private void m26858i(C10810b bVar, int i, byte b, int i2) {
        if (i < 8) {
            C10792e.m26788d("TYPE_GOAWAY length < 8: %s", Integer.valueOf(i));
            throw null;
        } else if (i2 == 0) {
            int readInt = this.f20834a.readInt();
            int readInt2 = this.f20834a.readInt();
            int i3 = i - 8;
            C10786b a = C10786b.m26756a(readInt2);
            if (a != null) {
                C4411f fVar = C4411f.f7953e;
                if (i3 > 0) {
                    fVar = this.f20834a.mo24250p((long) i3);
                }
                bVar.mo34092i(readInt, a, fVar);
                return;
            }
            C10792e.m26788d("TYPE_GOAWAY unexpected error code: %d", Integer.valueOf(readInt2));
            throw null;
        } else {
            C10792e.m26788d("TYPE_GOAWAY streamId != 0", new Object[0]);
            throw null;
        }
    }

    /* renamed from: j */
    private List<C10787c> m26859j(int i, short s, byte b, int i2) {
        C10809a aVar = this.f20835b;
        aVar.f20842e = i;
        aVar.f20839b = i;
        aVar.f20843f = s;
        aVar.f20840c = b;
        aVar.f20841d = i2;
        this.f20837d.mo34053k();
        return this.f20837d.mo34051e();
    }

    /* renamed from: n */
    private void m26860n(C10810b bVar, int i, byte b, int i2) {
        short s = 0;
        if (i2 != 0) {
            boolean z = (b & 1) != 0;
            if ((b & 8) != 0) {
                s = (short) (this.f20834a.readByte() & 255);
            }
            if ((b & 32) != 0) {
                m26863t(bVar, i2);
                i -= 5;
            }
            bVar.mo34090g(z, i2, -1, m26859j(m26856a(i, b, s), s, b, i2));
            return;
        }
        C10792e.m26788d("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0", new Object[0]);
        throw null;
    }

    /* renamed from: o */
    static int m26861o(C4410e eVar) {
        return (eVar.readByte() & 255) | ((eVar.readByte() & 255) << ParameterInitDefType.ExternalSamplerInit) | ((eVar.readByte() & 255) << 8);
    }

    /* renamed from: s */
    private void m26862s(C10810b bVar, int i, byte b, int i2) {
        boolean z = false;
        if (i != 8) {
            C10792e.m26788d("TYPE_PING length != 8: %s", Integer.valueOf(i));
            throw null;
        } else if (i2 == 0) {
            int readInt = this.f20834a.readInt();
            int readInt2 = this.f20834a.readInt();
            if ((b & 1) != 0) {
                z = true;
            }
            bVar.mo34087d(z, readInt, readInt2);
        } else {
            C10792e.m26788d("TYPE_PING streamId != 0", new Object[0]);
            throw null;
        }
    }

    /* renamed from: t */
    private void m26863t(C10810b bVar, int i) {
        int readInt = this.f20834a.readInt();
        bVar.mo34094m(i, readInt & ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED, (this.f20834a.readByte() & 255) + 1, (Integer.MIN_VALUE & readInt) != 0);
    }

    /* renamed from: u */
    private void m26864u(C10810b bVar, int i, byte b, int i2) {
        if (i != 5) {
            C10792e.m26788d("TYPE_PRIORITY length: %d != 5", Integer.valueOf(i));
            throw null;
        } else if (i2 != 0) {
            m26863t(bVar, i2);
        } else {
            C10792e.m26788d("TYPE_PRIORITY streamId == 0", new Object[0]);
            throw null;
        }
    }

    /* renamed from: b */
    public boolean mo34095b(boolean z, C10810b bVar) {
        try {
            this.f20834a.mo24218X0(9);
            int o = m26861o(this.f20834a);
            if (o < 0 || o > 16384) {
                C10792e.m26788d("FRAME_SIZE_ERROR: %s", Integer.valueOf(o));
                throw null;
            }
            byte readByte = (byte) (this.f20834a.readByte() & 255);
            if (!z || readByte == 4) {
                byte readByte2 = (byte) (this.f20834a.readByte() & 255);
                int readInt = this.f20834a.readInt() & ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
                if (f20833e.isLoggable(Level.FINE)) {
                    f20833e.fine(C10792e.m26786b(true, readInt, o, readByte, readByte2));
                }
                switch (readByte) {
                    case 0:
                        m26857h(bVar, o, readByte2, readInt);
                        break;
                    case 1:
                        m26860n(bVar, o, readByte2, readInt);
                        break;
                    case 2:
                        m26864u(bVar, o, readByte2, readInt);
                        break;
                    case 3:
                        m26853D(bVar, o, readByte2, readInt);
                        break;
                    case 4:
                        m26854F(bVar, o, readByte2, readInt);
                        break;
                    case 5:
                        m26852C(bVar, o, readByte2, readInt);
                        break;
                    case 6:
                        m26862s(bVar, o, readByte2, readInt);
                        break;
                    case 7:
                        m26858i(bVar, o, readByte2, readInt);
                        break;
                    case 8:
                        m26855I(bVar, o, readByte2, readInt);
                        break;
                    default:
                        this.f20834a.skip((long) o);
                        break;
                }
                return true;
            }
            C10792e.m26788d("Expected a SETTINGS frame but was %s", Byte.valueOf(readByte));
            throw null;
        } catch (IOException unused) {
            return false;
        }
    }

    public void close() {
        this.f20834a.close();
    }

    /* renamed from: g */
    public void mo34097g(C10810b bVar) {
        if (!this.f20836c) {
            C4411f p = this.f20834a.mo24250p((long) C10792e.f20758a.mo24297q());
            if (f20833e.isLoggable(Level.FINE)) {
                f20833e.fine(C4345c.m12371r("<< CONNECTION %s", p.mo24291j()));
            }
            if (!C10792e.f20758a.equals(p)) {
                C10792e.m26788d("Expected a connection header but was %s", p.mo24303v());
                throw null;
            }
        } else if (!mo34095b(true, bVar)) {
            C10792e.m26788d("Required SETTINGS preface not received", new Object[0]);
            throw null;
        }
    }
}
