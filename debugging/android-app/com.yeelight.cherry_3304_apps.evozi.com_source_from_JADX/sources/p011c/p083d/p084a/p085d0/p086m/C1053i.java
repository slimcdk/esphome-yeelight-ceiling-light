package p011c.p083d.p084a.p085d0.p086m;

import androidx.appcompat.widget.ActivityChooserView;
import com.google.p107ar.schemas.sceneform.ParameterInitDefType;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import p011c.p083d.p084a.p085d0.p086m.C1028b;
import p011c.p083d.p084a.p085d0.p086m.C1050h;
import p163g.C4406c;
import p163g.C4409d;
import p163g.C4410e;
import p163g.C4411f;
import p163g.C4416t;
import p163g.C4417u;

/* renamed from: c.d.a.d0.m.i */
public final class C1053i implements C1072q {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final Logger f1478a = Logger.getLogger(C1055b.class.getName());
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final C4411f f1479b = C4411f.m12868h("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");

    /* renamed from: c.d.a.d0.m.i$a */
    static final class C1054a implements C4416t {

        /* renamed from: a */
        private final C4410e f1480a;

        /* renamed from: b */
        int f1481b;

        /* renamed from: c */
        byte f1482c;

        /* renamed from: d */
        int f1483d;

        /* renamed from: e */
        int f1484e;

        /* renamed from: f */
        short f1485f;

        public C1054a(C4410e eVar) {
            this.f1480a = eVar;
        }

        /* renamed from: a */
        private void m2296a() {
            int i = this.f1483d;
            int f = C1053i.m2292m(this.f1480a);
            this.f1484e = f;
            this.f1481b = f;
            byte readByte = (byte) (this.f1480a.readByte() & 255);
            this.f1482c = (byte) (this.f1480a.readByte() & 255);
            if (C1053i.f1478a.isLoggable(Level.FINE)) {
                C1053i.f1478a.fine(C1055b.m2300b(true, this.f1483d, this.f1481b, readByte, this.f1482c));
            }
            int readInt = this.f1480a.readInt() & ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
            this.f1483d = readInt;
            if (readByte != 9) {
                C1053i.m2284e("%s != TYPE_CONTINUATION", new Object[]{Byte.valueOf(readByte)});
                throw null;
            } else if (readInt != i) {
                C1053i.m2284e("TYPE_CONTINUATION streamId changed", new Object[0]);
                throw null;
            }
        }

        /* renamed from: P0 */
        public long mo9541P0(C4406c cVar, long j) {
            while (true) {
                int i = this.f1484e;
                if (i == 0) {
                    this.f1480a.skip((long) this.f1485f);
                    this.f1485f = 0;
                    if ((this.f1482c & 4) != 0) {
                        return -1;
                    }
                    m2296a();
                } else {
                    long P0 = this.f1480a.mo9541P0(cVar, Math.min(j, (long) i));
                    if (P0 == -1) {
                        return -1;
                    }
                    this.f1484e = (int) (((long) this.f1484e) - P0);
                    return P0;
                }
            }
        }

        public void close() {
        }

        /* renamed from: f */
        public C4417u mo9542f() {
            return this.f1480a.mo9542f();
        }
    }

    /* renamed from: c.d.a.d0.m.i$b */
    static final class C1055b {

        /* renamed from: a */
        private static final String[] f1486a = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};

        /* renamed from: b */
        private static final String[] f1487b = new String[64];

        /* renamed from: c */
        private static final String[] f1488c = new String[256];

        static {
            int i = 0;
            int i2 = 0;
            while (true) {
                String[] strArr = f1488c;
                if (i2 >= strArr.length) {
                    break;
                }
                strArr[i2] = String.format("%8s", new Object[]{Integer.toBinaryString(i2)}).replace(' ', '0');
                i2++;
            }
            String[] strArr2 = f1487b;
            strArr2[0] = "";
            strArr2[1] = "END_STREAM";
            int[] iArr = {1};
            strArr2[8] = "PADDED";
            for (int i3 = 0; i3 < 1; i3++) {
                int i4 = iArr[i3];
                f1487b[i4 | 8] = f1487b[i4] + "|PADDED";
            }
            String[] strArr3 = f1487b;
            strArr3[4] = "END_HEADERS";
            strArr3[32] = "PRIORITY";
            strArr3[36] = "END_HEADERS|PRIORITY";
            int[] iArr2 = {4, 32, 36};
            for (int i5 = 0; i5 < 3; i5++) {
                int i6 = iArr2[i5];
                for (int i7 = 0; i7 < 1; i7++) {
                    int i8 = iArr[i7];
                    String[] strArr4 = f1487b;
                    int i9 = i8 | i6;
                    strArr4[i9] = f1487b[i8] + '|' + f1487b[i6];
                    f1487b[i9 | 8] = f1487b[i8] + '|' + f1487b[i6] + "|PADDED";
                }
            }
            while (true) {
                String[] strArr5 = f1487b;
                if (i < strArr5.length) {
                    if (strArr5[i] == null) {
                        strArr5[i] = f1488c[i];
                    }
                    i++;
                } else {
                    return;
                }
            }
        }

        C1055b() {
        }

        /* renamed from: a */
        static String m2299a(byte b, byte b2) {
            if (b2 == 0) {
                return "";
            }
            if (!(b == 2 || b == 3)) {
                if (b == 4 || b == 6) {
                    return b2 == 1 ? "ACK" : f1488c[b2];
                }
                if (!(b == 7 || b == 8)) {
                    String[] strArr = f1487b;
                    String str = b2 < strArr.length ? strArr[b2] : f1488c[b2];
                    return (b != 5 || (b2 & 4) == 0) ? (b != 0 || (b2 & 32) == 0) ? str : str.replace("PRIORITY", "COMPRESSED") : str.replace("HEADERS", "PUSH_PROMISE");
                }
            }
            return f1488c[b2];
        }

        /* renamed from: b */
        static String m2300b(boolean z, int i, int i2, byte b, byte b2) {
            String[] strArr = f1486a;
            String format = b < strArr.length ? strArr[b] : String.format("0x%02x", new Object[]{Byte.valueOf(b)});
            String a = m2299a(b, b2);
            Object[] objArr = new Object[5];
            objArr[0] = z ? "<<" : ">>";
            objArr[1] = Integer.valueOf(i);
            objArr[2] = Integer.valueOf(i2);
            objArr[3] = format;
            objArr[4] = a;
            return String.format("%s 0x%08x %5d %-13s %s", objArr);
        }
    }

    /* renamed from: c.d.a.d0.m.i$c */
    static final class C1056c implements C1028b {

        /* renamed from: a */
        private final C4410e f1489a;

        /* renamed from: b */
        private final C1054a f1490b;

        /* renamed from: c */
        private final boolean f1491c;

        /* renamed from: d */
        final C1050h.C1051a f1492d;

        C1056c(C4410e eVar, int i, boolean z) {
            this.f1489a = eVar;
            this.f1491c = z;
            C1054a aVar = new C1054a(eVar);
            this.f1490b = aVar;
            this.f1492d = new C1050h.C1051a(i, aVar);
        }

        /* renamed from: a */
        private void m2301a(C1028b.C1029a aVar, int i, byte b, int i2) {
            boolean z = true;
            short s = 0;
            boolean z2 = (b & 1) != 0;
            if ((b & 32) == 0) {
                z = false;
            }
            if (!z) {
                if ((b & 8) != 0) {
                    s = (short) (this.f1489a.readByte() & 255);
                }
                aVar.mo9493l(z2, i2, this.f1489a, C1053i.m2291l(i, b, s));
                this.f1489a.skip((long) s);
                return;
            }
            C1053i.m2284e("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA", new Object[0]);
            throw null;
        }

        /* renamed from: b */
        private void m2302b(C1028b.C1029a aVar, int i, byte b, int i2) {
            if (i < 8) {
                C1053i.m2284e("TYPE_GOAWAY length < 8: %s", new Object[]{Integer.valueOf(i)});
                throw null;
            } else if (i2 == 0) {
                int readInt = this.f1489a.readInt();
                int readInt2 = this.f1489a.readInt();
                int i3 = i - 8;
                C1027a a = C1027a.m2108a(readInt2);
                if (a != null) {
                    C4411f fVar = C4411f.f7953e;
                    if (i3 > 0) {
                        fVar = this.f1489a.mo24250p((long) i3);
                    }
                    aVar.mo9496o(readInt, a, fVar);
                    return;
                }
                C1053i.m2284e("TYPE_GOAWAY unexpected error code: %d", new Object[]{Integer.valueOf(readInt2)});
                throw null;
            } else {
                C1053i.m2284e("TYPE_GOAWAY streamId != 0", new Object[0]);
                throw null;
            }
        }

        /* renamed from: g */
        private List<C1048f> m2303g(int i, short s, byte b, int i2) {
            C1054a aVar = this.f1490b;
            aVar.f1484e = i;
            aVar.f1481b = i;
            aVar.f1485f = s;
            aVar.f1482c = b;
            aVar.f1483d = i2;
            this.f1492d.mo9557l();
            return this.f1492d.mo9554e();
        }

        /* renamed from: h */
        private void m2304h(C1028b.C1029a aVar, int i, byte b, int i2) {
            short s = 0;
            if (i2 != 0) {
                boolean z = (b & 1) != 0;
                if ((b & 8) != 0) {
                    s = (short) (this.f1489a.readByte() & 255);
                }
                if ((b & 32) != 0) {
                    m2306j(aVar, i2);
                    i -= 5;
                }
                aVar.mo9497p(false, z, i2, -1, m2303g(C1053i.m2291l(i, b, s), s, b, i2), C1049g.HTTP_20_HEADERS);
                return;
            }
            C1053i.m2284e("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0", new Object[0]);
            throw null;
        }

        /* renamed from: i */
        private void m2305i(C1028b.C1029a aVar, int i, byte b, int i2) {
            boolean z = false;
            if (i != 8) {
                C1053i.m2284e("TYPE_PING length != 8: %s", new Object[]{Integer.valueOf(i)});
                throw null;
            } else if (i2 == 0) {
                int readInt = this.f1489a.readInt();
                int readInt2 = this.f1489a.readInt();
                if ((b & 1) != 0) {
                    z = true;
                }
                aVar.mo9489d(z, readInt, readInt2);
            } else {
                C1053i.m2284e("TYPE_PING streamId != 0", new Object[0]);
                throw null;
            }
        }

        /* renamed from: j */
        private void m2306j(C1028b.C1029a aVar, int i) {
            int readInt = this.f1489a.readInt();
            aVar.mo9494m(i, readInt & ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED, (this.f1489a.readByte() & 255) + 1, (Integer.MIN_VALUE & readInt) != 0);
        }

        /* renamed from: n */
        private void m2307n(C1028b.C1029a aVar, int i, byte b, int i2) {
            if (i != 5) {
                C1053i.m2284e("TYPE_PRIORITY length: %d != 5", new Object[]{Integer.valueOf(i)});
                throw null;
            } else if (i2 != 0) {
                m2306j(aVar, i2);
            } else {
                C1053i.m2284e("TYPE_PRIORITY streamId == 0", new Object[0]);
                throw null;
            }
        }

        /* renamed from: o */
        private void m2308o(C1028b.C1029a aVar, int i, byte b, int i2) {
            short s = 0;
            if (i2 != 0) {
                if ((b & 8) != 0) {
                    s = (short) (this.f1489a.readByte() & 255);
                }
                aVar.mo9490e(i2, this.f1489a.readInt() & ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED, m2303g(C1053i.m2291l(i - 4, b, s), s, b, i2));
                return;
            }
            C1053i.m2284e("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0", new Object[0]);
            throw null;
        }

        /* renamed from: s */
        private void m2309s(C1028b.C1029a aVar, int i, byte b, int i2) {
            if (i != 4) {
                C1053i.m2284e("TYPE_RST_STREAM length: %d != 4", new Object[]{Integer.valueOf(i)});
                throw null;
            } else if (i2 != 0) {
                int readInt = this.f1489a.readInt();
                C1027a a = C1027a.m2108a(readInt);
                if (a != null) {
                    aVar.mo9492k(i2, a);
                    return;
                }
                C1053i.m2284e("TYPE_RST_STREAM unexpected error code: %d", new Object[]{Integer.valueOf(readInt)});
                throw null;
            } else {
                C1053i.m2284e("TYPE_RST_STREAM streamId == 0", new Object[0]);
                throw null;
            }
        }

        /* renamed from: t */
        private void m2310t(C1028b.C1029a aVar, int i, byte b, int i2) {
            if (i2 != 0) {
                C1053i.m2284e("TYPE_SETTINGS streamId != 0", new Object[0]);
                throw null;
            } else if ((b & 1) != 0) {
                if (i == 0) {
                    aVar.mo9491f();
                } else {
                    C1053i.m2284e("FRAME_SIZE_ERROR ack frame should be empty!", new Object[0]);
                    throw null;
                }
            } else if (i % 6 == 0) {
                C1068o oVar = new C1068o();
                for (int i3 = 0; i3 < i; i3 += 6) {
                    short readShort = this.f1489a.readShort();
                    int readInt = this.f1489a.readInt();
                    switch (readShort) {
                        case 1:
                        case 6:
                            break;
                        case 2:
                            if (!(readInt == 0 || readInt == 1)) {
                                C1053i.m2284e("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1", new Object[0]);
                                throw null;
                            }
                        case 3:
                            readShort = 4;
                            break;
                        case 4:
                            readShort = 7;
                            if (readInt >= 0) {
                                break;
                            } else {
                                C1053i.m2284e("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1", new Object[0]);
                                throw null;
                            }
                        case 5:
                            if (readInt >= 16384 && readInt <= 16777215) {
                                break;
                            } else {
                                C1053i.m2284e("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: %s", new Object[]{Integer.valueOf(readInt)});
                                throw null;
                            }
                            break;
                        default:
                            C1053i.m2284e("PROTOCOL_ERROR invalid settings id: %s", new Object[]{Short.valueOf(readShort)});
                            throw null;
                    }
                    oVar.mo9591k(readShort, 0, readInt);
                }
                aVar.mo9495n(false, oVar);
                if (oVar.mo9584d() >= 0) {
                    this.f1492d.mo9555g(oVar.mo9584d());
                }
            } else {
                C1053i.m2284e("TYPE_SETTINGS length %% 6 != 0: %s", new Object[]{Integer.valueOf(i)});
                throw null;
            }
        }

        /* renamed from: u */
        private void m2311u(C1028b.C1029a aVar, int i, byte b, int i2) {
            if (i == 4) {
                long readInt = ((long) this.f1489a.readInt()) & 2147483647L;
                if (readInt != 0) {
                    aVar.mo9488c(i2, readInt);
                    return;
                }
                C1053i.m2284e("windowSizeIncrement was 0", new Object[]{Long.valueOf(readInt)});
                throw null;
            }
            C1053i.m2284e("TYPE_WINDOW_UPDATE length !=4: %s", new Object[]{Integer.valueOf(i)});
            throw null;
        }

        /* renamed from: A0 */
        public void mo9486A0() {
            if (!this.f1491c) {
                C4411f p = this.f1489a.mo24250p((long) C1053i.f1479b.mo24297q());
                if (C1053i.f1478a.isLoggable(Level.FINE)) {
                    C1053i.f1478a.fine(String.format("<< CONNECTION %s", new Object[]{p.mo24291j()}));
                }
                if (!C1053i.f1479b.equals(p)) {
                    C1053i.m2284e("Expected a connection header but was %s", new Object[]{p.mo24303v()});
                    throw null;
                }
            }
        }

        /* renamed from: G */
        public boolean mo9487G(C1028b.C1029a aVar) {
            try {
                this.f1489a.mo24218X0(9);
                int f = C1053i.m2292m(this.f1489a);
                if (f < 0 || f > 16384) {
                    C1053i.m2284e("FRAME_SIZE_ERROR: %s", new Object[]{Integer.valueOf(f)});
                    throw null;
                }
                byte readByte = (byte) (this.f1489a.readByte() & 255);
                byte readByte2 = (byte) (this.f1489a.readByte() & 255);
                int readInt = this.f1489a.readInt() & ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
                if (C1053i.f1478a.isLoggable(Level.FINE)) {
                    C1053i.f1478a.fine(C1055b.m2300b(true, readInt, f, readByte, readByte2));
                }
                switch (readByte) {
                    case 0:
                        m2301a(aVar, f, readByte2, readInt);
                        break;
                    case 1:
                        m2304h(aVar, f, readByte2, readInt);
                        break;
                    case 2:
                        m2307n(aVar, f, readByte2, readInt);
                        break;
                    case 3:
                        m2309s(aVar, f, readByte2, readInt);
                        break;
                    case 4:
                        m2310t(aVar, f, readByte2, readInt);
                        break;
                    case 5:
                        m2308o(aVar, f, readByte2, readInt);
                        break;
                    case 6:
                        m2305i(aVar, f, readByte2, readInt);
                        break;
                    case 7:
                        m2302b(aVar, f, readByte2, readInt);
                        break;
                    case 8:
                        m2311u(aVar, f, readByte2, readInt);
                        break;
                    default:
                        this.f1489a.skip((long) f);
                        break;
                }
                return true;
            } catch (IOException unused) {
                return false;
            }
        }

        public void close() {
            this.f1489a.close();
        }
    }

    /* renamed from: c.d.a.d0.m.i$d */
    static final class C1057d implements C1030c {

        /* renamed from: a */
        private final C4409d f1493a;

        /* renamed from: b */
        private final boolean f1494b;

        /* renamed from: c */
        private final C4406c f1495c;

        /* renamed from: d */
        private final C1050h.C1052b f1496d;

        /* renamed from: e */
        private int f1497e = 16384;

        /* renamed from: f */
        private boolean f1498f;

        C1057d(C4409d dVar, boolean z) {
            this.f1493a = dVar;
            this.f1494b = z;
            C4406c cVar = new C4406c();
            this.f1495c = cVar;
            this.f1496d = new C1050h.C1052b(cVar);
        }

        /* renamed from: h */
        private void m2314h(int i, long j) {
            while (j > 0) {
                int min = (int) Math.min((long) this.f1497e, j);
                long j2 = (long) min;
                j -= j2;
                mo9566b(i, min, (byte) 9, j == 0 ? (byte) 4 : 0);
                this.f1493a.mo9442p0(this.f1495c, j2);
            }
        }

        /* renamed from: A */
        public synchronized void mo9498A(boolean z, int i, C4406c cVar, int i2) {
            if (!this.f1498f) {
                byte b = 0;
                if (z) {
                    b = (byte) 1;
                }
                mo9565a(i, b, cVar, i2);
            } else {
                throw new IOException("closed");
            }
        }

        /* renamed from: V0 */
        public int mo9499V0() {
            return this.f1497e;
        }

        /* renamed from: W0 */
        public synchronized void mo9500W0(boolean z, boolean z2, int i, int i2, List<C1048f> list) {
            if (!z2) {
                try {
                    if (!this.f1498f) {
                        mo9568g(z, i, list);
                    } else {
                        throw new IOException("closed");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            } else {
                throw new UnsupportedOperationException();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo9565a(int i, byte b, C4406c cVar, int i2) {
            mo9566b(i, i2, (byte) 0, b);
            if (i2 > 0) {
                this.f1493a.mo9442p0(cVar, (long) i2);
            }
        }

        /* renamed from: a1 */
        public synchronized void mo9501a1(C1068o oVar) {
            if (!this.f1498f) {
                int i = 0;
                mo9566b(0, oVar.mo9592l() * 6, (byte) 4, (byte) 0);
                while (i < 10) {
                    if (oVar.mo9588h(i)) {
                        this.f1493a.mo24214O(i == 4 ? 3 : i == 7 ? 4 : i);
                        this.f1493a.mo24215P(oVar.mo9583c(i));
                    }
                    i++;
                }
                this.f1493a.flush();
            } else {
                throw new IOException("closed");
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo9566b(int i, int i2, byte b, byte b2) {
            if (C1053i.f1478a.isLoggable(Level.FINE)) {
                C1053i.f1478a.fine(C1055b.m2300b(false, i, i2, b, b2));
            }
            int i3 = this.f1497e;
            if (i2 > i3) {
                C1053i.m2287h("FRAME_SIZE_ERROR length > %d: %d", new Object[]{Integer.valueOf(i3), Integer.valueOf(i2)});
                throw null;
            } else if ((Integer.MIN_VALUE & i) == 0) {
                C1053i.m2293n(this.f1493a, i2);
                this.f1493a.mo24217U(b & 255);
                this.f1493a.mo24217U(b2 & 255);
                this.f1493a.mo24215P(i & ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED);
            } else {
                C1053i.m2287h("reserved bit set: %s", new Object[]{Integer.valueOf(i)});
                throw null;
            }
        }

        /* renamed from: c */
        public synchronized void mo9502c(int i, long j) {
            if (this.f1498f) {
                throw new IOException("closed");
            } else if (j == 0 || j > 2147483647L) {
                C1053i.m2287h("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: %s", new Object[]{Long.valueOf(j)});
                throw null;
            } else {
                mo9566b(i, 4, (byte) 8, (byte) 0);
                this.f1493a.mo24215P((int) j);
                this.f1493a.flush();
            }
        }

        public synchronized void close() {
            this.f1498f = true;
            this.f1493a.close();
        }

        /* renamed from: d */
        public synchronized void mo9503d(boolean z, int i, int i2) {
            if (!this.f1498f) {
                mo9566b(0, 8, (byte) 6, z ? (byte) 1 : 0);
                this.f1493a.mo24215P(i);
                this.f1493a.mo24215P(i2);
                this.f1493a.flush();
            } else {
                throw new IOException("closed");
            }
        }

        /* renamed from: e */
        public synchronized void mo9504e(int i, int i2, List<C1048f> list) {
            if (!this.f1498f) {
                this.f1496d.mo9560b(list);
                long g1 = this.f1495c.mo24233g1();
                int min = (int) Math.min((long) (this.f1497e - 4), g1);
                long j = (long) min;
                mo9566b(i, min + 4, (byte) 5, g1 == j ? (byte) 4 : 0);
                this.f1493a.mo24215P(i2 & ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED);
                this.f1493a.mo9442p0(this.f1495c, j);
                if (g1 > j) {
                    m2314h(i, g1 - j);
                }
            } else {
                throw new IOException("closed");
            }
        }

        public synchronized void flush() {
            if (!this.f1498f) {
                this.f1493a.flush();
            } else {
                throw new IOException("closed");
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public void mo9568g(boolean z, int i, List<C1048f> list) {
            if (!this.f1498f) {
                this.f1496d.mo9560b(list);
                long g1 = this.f1495c.mo24233g1();
                int min = (int) Math.min((long) this.f1497e, g1);
                long j = (long) min;
                byte b = g1 == j ? (byte) 4 : 0;
                if (z) {
                    b = (byte) (b | 1);
                }
                mo9566b(i, min, (byte) 1, b);
                this.f1493a.mo9442p0(this.f1495c, j);
                if (g1 > j) {
                    m2314h(i, g1 - j);
                    return;
                }
                return;
            }
            throw new IOException("closed");
        }

        /* renamed from: k */
        public synchronized void mo9506k(int i, C1027a aVar) {
            if (this.f1498f) {
                throw new IOException("closed");
            } else if (aVar.f1367a != -1) {
                mo9566b(i, 4, (byte) 3, (byte) 0);
                this.f1493a.mo24215P(aVar.f1367a);
                this.f1493a.flush();
            } else {
                throw new IllegalArgumentException();
            }
        }

        /* renamed from: q */
        public synchronized void mo9507q(int i, C1027a aVar, byte[] bArr) {
            if (this.f1498f) {
                throw new IOException("closed");
            } else if (aVar.f1367a != -1) {
                mo9566b(0, bArr.length + 8, (byte) 7, (byte) 0);
                this.f1493a.mo24215P(i);
                this.f1493a.mo24215P(aVar.f1367a);
                if (bArr.length > 0) {
                    this.f1493a.mo24210L0(bArr);
                }
                this.f1493a.flush();
            } else {
                C1053i.m2287h("errorCode.httpCode == -1", new Object[0]);
                throw null;
            }
        }

        /* renamed from: q0 */
        public synchronized void mo9508q0(C1068o oVar) {
            if (!this.f1498f) {
                this.f1497e = oVar.mo9586f(this.f1497e);
                mo9566b(0, 0, (byte) 4, (byte) 1);
                this.f1493a.flush();
            } else {
                throw new IOException("closed");
            }
        }

        /* renamed from: y */
        public synchronized void mo9509y() {
            if (this.f1498f) {
                throw new IOException("closed");
            } else if (this.f1494b) {
                if (C1053i.f1478a.isLoggable(Level.FINE)) {
                    C1053i.f1478a.fine(String.format(">> CONNECTION %s", new Object[]{C1053i.f1479b.mo24291j()}));
                }
                this.f1493a.mo24210L0(C1053i.f1479b.mo24302u());
                this.f1493a.flush();
            }
        }
    }

    /* renamed from: e */
    static /* synthetic */ IOException m2284e(String str, Object[] objArr) {
        m2290k(str, objArr);
        throw null;
    }

    /* renamed from: h */
    static /* synthetic */ IllegalArgumentException m2287h(String str, Object[] objArr) {
        m2289j(str, objArr);
        throw null;
    }

    /* renamed from: j */
    private static IllegalArgumentException m2289j(String str, Object... objArr) {
        throw new IllegalArgumentException(String.format(str, objArr));
    }

    /* renamed from: k */
    private static IOException m2290k(String str, Object... objArr) {
        throw new IOException(String.format(str, objArr));
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public static int m2291l(int i, byte b, short s) {
        if ((b & 8) != 0) {
            i--;
        }
        if (s <= i) {
            return (short) (i - s);
        }
        m2290k("PROTOCOL_ERROR padding %s > remaining length %s", Short.valueOf(s), Integer.valueOf(i));
        throw null;
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public static int m2292m(C4410e eVar) {
        return (eVar.readByte() & 255) | ((eVar.readByte() & 255) << ParameterInitDefType.ExternalSamplerInit) | ((eVar.readByte() & 255) << 8);
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public static void m2293n(C4409d dVar, int i) {
        dVar.mo24217U((i >>> 16) & 255);
        dVar.mo24217U((i >>> 8) & 255);
        dVar.mo24217U(i & 255);
    }

    /* renamed from: a */
    public C1028b mo9562a(C4410e eVar, boolean z) {
        return new C1056c(eVar, 4096, z);
    }

    /* renamed from: b */
    public C1030c mo9563b(C4409d dVar, boolean z) {
        return new C1057d(dVar, z);
    }
}
