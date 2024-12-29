package p236z2;

import androidx.appcompat.widget.ActivityChooserView;
import com.google.p017ar.schemas.sceneform.ParameterInitDefType;
import com.squareup.okhttp.internal.framed.ErrorCode;
import com.squareup.okhttp.internal.framed.HeadersMode;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import okio.ByteString;
import okio.C3564c;
import okio.C9837d;
import okio.C9838e;
import okio.C9853r;
import okio.C9854s;
import p236z2.C12097a;
import p236z2.C12118f;

/* renamed from: z2.g */
public final class C12121g implements C12140o {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final Logger f22260a = Logger.getLogger(C12123b.class.getName());
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final ByteString f22261b = ByteString.encodeUtf8("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");

    /* renamed from: z2.g$a */
    static final class C12122a implements C9853r {

        /* renamed from: a */
        private final C9838e f22262a;

        /* renamed from: b */
        int f22263b;

        /* renamed from: c */
        byte f22264c;

        /* renamed from: d */
        int f22265d;

        /* renamed from: e */
        int f22266e;

        /* renamed from: f */
        short f22267f;

        public C12122a(C9838e eVar) {
            this.f22262a = eVar;
        }

        /* renamed from: a */
        private void m31423a() {
            int i = this.f22265d;
            int f = C12121g.m31419m(this.f22262a);
            this.f22266e = f;
            this.f22263b = f;
            byte readByte = (byte) (this.f22262a.readByte() & 255);
            this.f22264c = (byte) (this.f22262a.readByte() & 255);
            if (C12121g.f22260a.isLoggable(Level.FINE)) {
                C12121g.f22260a.fine(C12123b.m31427b(true, this.f22265d, this.f22263b, readByte, this.f22264c));
            }
            int readInt = this.f22262a.readInt() & ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
            this.f22265d = readInt;
            if (readByte != 9) {
                throw C12121g.m31417k("%s != TYPE_CONTINUATION", Byte.valueOf(readByte));
            } else if (readInt != i) {
                throw C12121g.m31417k("TYPE_CONTINUATION streamId changed", new Object[0]);
            }
        }

        /* renamed from: R0 */
        public long mo24477R0(C3564c cVar, long j) {
            while (true) {
                int i = this.f22266e;
                if (i == 0) {
                    this.f22262a.skip((long) this.f22267f);
                    this.f22267f = 0;
                    if ((this.f22264c & 4) != 0) {
                        return -1;
                    }
                    m31423a();
                } else {
                    long R0 = this.f22262a.mo24477R0(cVar, Math.min(j, (long) i));
                    if (R0 == -1) {
                        return -1;
                    }
                    this.f22266e = (int) (((long) this.f22266e) - R0);
                    return R0;
                }
            }
        }

        public void close() {
        }

        /* renamed from: j */
        public C9854s mo24479j() {
            return this.f22262a.mo24479j();
        }
    }

    /* renamed from: z2.g$b */
    static final class C12123b {

        /* renamed from: a */
        private static final String[] f22268a = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};

        /* renamed from: b */
        private static final String[] f22269b = new String[64];

        /* renamed from: c */
        private static final String[] f22270c = new String[256];

        static {
            int i = 0;
            int i2 = 0;
            while (true) {
                String[] strArr = f22270c;
                if (i2 >= strArr.length) {
                    break;
                }
                strArr[i2] = String.format("%8s", new Object[]{Integer.toBinaryString(i2)}).replace(' ', '0');
                i2++;
            }
            String[] strArr2 = f22269b;
            strArr2[0] = "";
            strArr2[1] = "END_STREAM";
            int[] iArr = {1};
            strArr2[8] = "PADDED";
            for (int i3 = 0; i3 < 1; i3++) {
                int i4 = iArr[i3];
                String[] strArr3 = f22269b;
                strArr3[i4 | 8] = strArr3[i4] + "|PADDED";
            }
            String[] strArr4 = f22269b;
            strArr4[4] = "END_HEADERS";
            strArr4[32] = "PRIORITY";
            strArr4[36] = "END_HEADERS|PRIORITY";
            int[] iArr2 = {4, 32, 36};
            for (int i5 = 0; i5 < 3; i5++) {
                int i6 = iArr2[i5];
                for (int i7 = 0; i7 < 1; i7++) {
                    int i8 = iArr[i7];
                    String[] strArr5 = f22269b;
                    int i9 = i8 | i6;
                    strArr5[i9] = strArr5[i8] + '|' + strArr5[i6];
                    strArr5[i9 | 8] = strArr5[i8] + '|' + strArr5[i6] + "|PADDED";
                }
            }
            while (true) {
                String[] strArr6 = f22269b;
                if (i < strArr6.length) {
                    if (strArr6[i] == null) {
                        strArr6[i] = f22270c[i];
                    }
                    i++;
                } else {
                    return;
                }
            }
        }

        C12123b() {
        }

        /* renamed from: a */
        static String m31426a(byte b, byte b2) {
            if (b2 == 0) {
                return "";
            }
            if (!(b == 2 || b == 3)) {
                if (b == 4 || b == 6) {
                    return b2 == 1 ? "ACK" : f22270c[b2];
                }
                if (!(b == 7 || b == 8)) {
                    String[] strArr = f22269b;
                    String str = b2 < strArr.length ? strArr[b2] : f22270c[b2];
                    return (b != 5 || (b2 & 4) == 0) ? (b != 0 || (b2 & 32) == 0) ? str : str.replace("PRIORITY", "COMPRESSED") : str.replace("HEADERS", "PUSH_PROMISE");
                }
            }
            return f22270c[b2];
        }

        /* renamed from: b */
        static String m31427b(boolean z, int i, int i2, byte b, byte b2) {
            String[] strArr = f22268a;
            String format = b < strArr.length ? strArr[b] : String.format("0x%02x", new Object[]{Byte.valueOf(b)});
            String a = m31426a(b, b2);
            Object[] objArr = new Object[5];
            objArr[0] = z ? "<<" : ">>";
            objArr[1] = Integer.valueOf(i);
            objArr[2] = Integer.valueOf(i2);
            objArr[3] = format;
            objArr[4] = a;
            return String.format("%s 0x%08x %5d %-13s %s", objArr);
        }
    }

    /* renamed from: z2.g$c */
    static final class C12124c implements C12097a {

        /* renamed from: a */
        private final C9838e f22271a;

        /* renamed from: b */
        private final C12122a f22272b;

        /* renamed from: c */
        private final boolean f22273c;

        /* renamed from: d */
        final C12118f.C12119a f22274d;

        C12124c(C9838e eVar, int i, boolean z) {
            this.f22271a = eVar;
            this.f22273c = z;
            C12122a aVar = new C12122a(eVar);
            this.f22272b = aVar;
            this.f22274d = new C12118f.C12119a(i, aVar);
        }

        /* renamed from: a */
        private void m31428a(C12097a.C12098a aVar, int i, byte b, int i2) {
            boolean z = true;
            short s = 0;
            boolean z2 = (b & 1) != 0;
            if ((b & 32) == 0) {
                z = false;
            }
            if (!z) {
                if ((b & 8) != 0) {
                    s = (short) (this.f22271a.readByte() & 255);
                }
                aVar.mo42819i(z2, i2, this.f22271a, C12121g.m31418l(i, b, s));
                this.f22271a.skip((long) s);
                return;
            }
            throw C12121g.m31417k("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA", new Object[0]);
        }

        /* renamed from: c */
        private void m31429c(C12097a.C12098a aVar, int i, byte b, int i2) {
            if (i < 8) {
                throw C12121g.m31417k("TYPE_GOAWAY length < 8: %s", Integer.valueOf(i));
            } else if (i2 == 0) {
                int readInt = this.f22271a.readInt();
                int readInt2 = this.f22271a.readInt();
                int i3 = i - 8;
                ErrorCode fromHttp2 = ErrorCode.fromHttp2(readInt2);
                if (fromHttp2 != null) {
                    ByteString byteString = ByteString.EMPTY;
                    if (i3 > 0) {
                        byteString = this.f22271a.mo24789w((long) i3);
                    }
                    aVar.mo42822q(readInt, fromHttp2, byteString);
                    return;
                }
                throw C12121g.m31417k("TYPE_GOAWAY unexpected error code: %d", Integer.valueOf(readInt2));
            } else {
                throw C12121g.m31417k("TYPE_GOAWAY streamId != 0", new Object[0]);
            }
        }

        /* renamed from: d */
        private List<C12117e> m31430d(int i, short s, byte b, int i2) {
            C12122a aVar = this.f22272b;
            aVar.f22266e = i;
            aVar.f22263b = i;
            aVar.f22267f = s;
            aVar.f22264c = b;
            aVar.f22265d = i2;
            this.f22274d.mo42876l();
            return this.f22274d.mo42873e();
        }

        /* renamed from: f */
        private void m31431f(C12097a.C12098a aVar, int i, byte b, int i2) {
            short s = 0;
            if (i2 != 0) {
                boolean z = (b & 1) != 0;
                if ((b & 8) != 0) {
                    s = (short) (this.f22271a.readByte() & 255);
                }
                if ((b & 32) != 0) {
                    m31433i(aVar, i2);
                    i -= 5;
                }
                aVar.mo42824s(false, z, i2, -1, m31430d(C12121g.m31418l(i, b, s), s, b, i2), HeadersMode.HTTP_20_HEADERS);
                return;
            }
            throw C12121g.m31417k("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0", new Object[0]);
        }

        /* renamed from: h */
        private void m31432h(C12097a.C12098a aVar, int i, byte b, int i2) {
            boolean z = false;
            if (i != 8) {
                throw C12121g.m31417k("TYPE_PING length != 8: %s", Integer.valueOf(i));
            } else if (i2 == 0) {
                int readInt = this.f22271a.readInt();
                int readInt2 = this.f22271a.readInt();
                if ((b & 1) != 0) {
                    z = true;
                }
                aVar.mo42816e(z, readInt, readInt2);
            } else {
                throw C12121g.m31417k("TYPE_PING streamId != 0", new Object[0]);
            }
        }

        /* renamed from: i */
        private void m31433i(C12097a.C12098a aVar, int i) {
            int readInt = this.f22271a.readInt();
            aVar.mo42820j(i, readInt & ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED, (this.f22271a.readByte() & 255) + 1, (Integer.MIN_VALUE & readInt) != 0);
        }

        /* renamed from: k */
        private void m31434k(C12097a.C12098a aVar, int i, byte b, int i2) {
            if (i != 5) {
                throw C12121g.m31417k("TYPE_PRIORITY length: %d != 5", Integer.valueOf(i));
            } else if (i2 != 0) {
                m31433i(aVar, i2);
            } else {
                throw C12121g.m31417k("TYPE_PRIORITY streamId == 0", new Object[0]);
            }
        }

        /* renamed from: l */
        private void m31435l(C12097a.C12098a aVar, int i, byte b, int i2) {
            short s = 0;
            if (i2 != 0) {
                if ((b & 8) != 0) {
                    s = (short) (this.f22271a.readByte() & 255);
                }
                aVar.mo42817g(i2, this.f22271a.readInt() & ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED, m31430d(C12121g.m31418l(i - 4, b, s), s, b, i2));
                return;
            }
            throw C12121g.m31417k("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0", new Object[0]);
        }

        /* renamed from: m */
        private void m31436m(C12097a.C12098a aVar, int i, byte b, int i2) {
            if (i != 4) {
                throw C12121g.m31417k("TYPE_RST_STREAM length: %d != 4", Integer.valueOf(i));
            } else if (i2 != 0) {
                int readInt = this.f22271a.readInt();
                ErrorCode fromHttp2 = ErrorCode.fromHttp2(readInt);
                if (fromHttp2 != null) {
                    aVar.mo42821o(i2, fromHttp2);
                } else {
                    throw C12121g.m31417k("TYPE_RST_STREAM unexpected error code: %d", Integer.valueOf(readInt));
                }
            } else {
                throw C12121g.m31417k("TYPE_RST_STREAM streamId == 0", new Object[0]);
            }
        }

        /* renamed from: n */
        private void m31437n(C12097a.C12098a aVar, int i, byte b, int i2) {
            if (i2 != 0) {
                throw C12121g.m31417k("TYPE_SETTINGS streamId != 0", new Object[0]);
            } else if ((b & 1) != 0) {
                if (i == 0) {
                    aVar.mo42818h();
                    return;
                }
                throw C12121g.m31417k("FRAME_SIZE_ERROR ack frame should be empty!", new Object[0]);
            } else if (i % 6 == 0) {
                C12136m mVar = new C12136m();
                for (int i3 = 0; i3 < i; i3 += 6) {
                    short readShort = this.f22271a.readShort();
                    int readInt = this.f22271a.readInt();
                    switch (readShort) {
                        case 1:
                        case 6:
                            break;
                        case 2:
                            if (!(readInt == 0 || readInt == 1)) {
                                throw C12121g.m31417k("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1", new Object[0]);
                            }
                        case 3:
                            readShort = 4;
                            break;
                        case 4:
                            readShort = 7;
                            if (readInt >= 0) {
                                break;
                            } else {
                                throw C12121g.m31417k("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1", new Object[0]);
                            }
                        case 5:
                            if (readInt >= 16384 && readInt <= 16777215) {
                                break;
                            } else {
                                throw C12121g.m31417k("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: %s", Integer.valueOf(readInt));
                            }
                            break;
                        default:
                            throw C12121g.m31417k("PROTOCOL_ERROR invalid settings id: %s", Short.valueOf(readShort));
                    }
                    mVar.mo42910k(readShort, 0, readInt);
                }
                aVar.mo42823r(false, mVar);
                if (mVar.mo42903d() >= 0) {
                    this.f22274d.mo42874g(mVar.mo42903d());
                }
            } else {
                throw C12121g.m31417k("TYPE_SETTINGS length %% 6 != 0: %s", Integer.valueOf(i));
            }
        }

        /* renamed from: p */
        private void m31438p(C12097a.C12098a aVar, int i, byte b, int i2) {
            if (i == 4) {
                long readInt = ((long) this.f22271a.readInt()) & 2147483647L;
                if (readInt != 0) {
                    aVar.mo42815b(i2, readInt);
                } else {
                    throw C12121g.m31417k("windowSizeIncrement was 0", Long.valueOf(readInt));
                }
            } else {
                throw C12121g.m31417k("TYPE_WINDOW_UPDATE length !=4: %s", Integer.valueOf(i));
            }
        }

        /* renamed from: C */
        public boolean mo42813C(C12097a.C12098a aVar) {
            try {
                this.f22271a.mo24742a1(9);
                int f = C12121g.m31419m(this.f22271a);
                if (f < 0 || f > 16384) {
                    throw C12121g.m31417k("FRAME_SIZE_ERROR: %s", Integer.valueOf(f));
                }
                byte readByte = (byte) (this.f22271a.readByte() & 255);
                byte readByte2 = (byte) (this.f22271a.readByte() & 255);
                int readInt = this.f22271a.readInt() & ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
                if (C12121g.f22260a.isLoggable(Level.FINE)) {
                    C12121g.f22260a.fine(C12123b.m31427b(true, readInt, f, readByte, readByte2));
                }
                switch (readByte) {
                    case 0:
                        m31428a(aVar, f, readByte2, readInt);
                        break;
                    case 1:
                        m31431f(aVar, f, readByte2, readInt);
                        break;
                    case 2:
                        m31434k(aVar, f, readByte2, readInt);
                        break;
                    case 3:
                        m31436m(aVar, f, readByte2, readInt);
                        break;
                    case 4:
                        m31437n(aVar, f, readByte2, readInt);
                        break;
                    case 5:
                        m31435l(aVar, f, readByte2, readInt);
                        break;
                    case 6:
                        m31432h(aVar, f, readByte2, readInt);
                        break;
                    case 7:
                        m31429c(aVar, f, readByte2, readInt);
                        break;
                    case 8:
                        m31438p(aVar, f, readByte2, readInt);
                        break;
                    default:
                        this.f22271a.skip((long) f);
                        break;
                }
                return true;
            } catch (IOException unused) {
                return false;
            }
        }

        /* renamed from: C0 */
        public void mo42814C0() {
            if (!this.f22273c) {
                ByteString w = this.f22271a.mo24789w((long) C12121g.f22261b.size());
                if (C12121g.f22260a.isLoggable(Level.FINE)) {
                    C12121g.f22260a.fine(String.format("<< CONNECTION %s", new Object[]{w.hex()}));
                }
                if (!C12121g.f22261b.equals(w)) {
                    throw C12121g.m31417k("Expected a connection header but was %s", w.utf8());
                }
            }
        }

        public void close() {
            this.f22271a.close();
        }
    }

    /* renamed from: z2.g$d */
    static final class C12125d implements C12099b {

        /* renamed from: a */
        private final C9837d f22275a;

        /* renamed from: b */
        private final boolean f22276b;

        /* renamed from: c */
        private final C3564c f22277c;

        /* renamed from: d */
        private final C12118f.C12120b f22278d;

        /* renamed from: e */
        private int f22279e = 16384;

        /* renamed from: f */
        private boolean f22280f;

        C12125d(C9837d dVar, boolean z) {
            this.f22275a = dVar;
            this.f22276b = z;
            C3564c cVar = new C3564c();
            this.f22277c = cVar;
            this.f22278d = new C12118f.C12120b(cVar);
        }

        /* renamed from: f */
        private void m31441f(int i, long j) {
            while (j > 0) {
                int min = (int) Math.min((long) this.f22279e, j);
                long j2 = (long) min;
                j -= j2;
                mo42885c(i, min, (byte) 9, j == 0 ? (byte) 4 : 0);
                this.f22275a.mo24476q0(this.f22277c, j2);
            }
        }

        /* renamed from: S */
        public synchronized void mo42825S() {
            if (this.f22280f) {
                throw new IOException("closed");
            } else if (this.f22276b) {
                if (C12121g.f22260a.isLoggable(Level.FINE)) {
                    C12121g.f22260a.fine(String.format(">> CONNECTION %s", new Object[]{C12121g.f22261b.hex()}));
                }
                this.f22275a.mo24732O0(C12121g.f22261b.toByteArray());
                this.f22275a.flush();
            }
        }

        /* renamed from: X */
        public synchronized void mo42826X(boolean z, int i, C3564c cVar, int i2) {
            if (!this.f22280f) {
                byte b = 0;
                if (z) {
                    b = (byte) 1;
                }
                mo42884a(i, b, cVar, i2);
            } else {
                throw new IOException("closed");
            }
        }

        /* renamed from: X0 */
        public int mo42827X0() {
            return this.f22279e;
        }

        /* renamed from: Y0 */
        public synchronized void mo42828Y0(boolean z, boolean z2, int i, int i2, List<C12117e> list) {
            if (!z2) {
                try {
                    if (!this.f22280f) {
                        mo42887d(z, i, list);
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
        public void mo42884a(int i, byte b, C3564c cVar, int i2) {
            mo42885c(i, i2, (byte) 0, b);
            if (i2 > 0) {
                this.f22275a.mo24476q0(cVar, (long) i2);
            }
        }

        /* renamed from: b */
        public synchronized void mo42829b(int i, long j) {
            if (this.f22280f) {
                throw new IOException("closed");
            } else if (j == 0 || j > 2147483647L) {
                throw C12121g.m31416j("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: %s", Long.valueOf(j));
            } else {
                mo42885c(i, 4, (byte) 8, (byte) 0);
                this.f22275a.mo24730M((int) j);
                this.f22275a.flush();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo42885c(int i, int i2, byte b, byte b2) {
            if (C12121g.f22260a.isLoggable(Level.FINE)) {
                C12121g.f22260a.fine(C12123b.m31427b(false, i, i2, b, b2));
            }
            int i3 = this.f22279e;
            if (i2 > i3) {
                throw C12121g.m31416j("FRAME_SIZE_ERROR length > %d: %d", Integer.valueOf(i3), Integer.valueOf(i2));
            } else if ((Integer.MIN_VALUE & i) == 0) {
                C12121g.m31420n(this.f22275a, i2);
                this.f22275a.mo24736R(b & 255);
                this.f22275a.mo24736R(b2 & 255);
                this.f22275a.mo24730M(i & ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED);
            } else {
                throw C12121g.m31416j("reserved bit set: %s", Integer.valueOf(i));
            }
        }

        public synchronized void close() {
            this.f22280f = true;
            this.f22275a.close();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo42887d(boolean z, int i, List<C12117e> list) {
            if (!this.f22280f) {
                this.f22278d.mo42879b(list);
                long i1 = this.f22277c.mo24758i1();
                int min = (int) Math.min((long) this.f22279e, i1);
                long j = (long) min;
                byte b = i1 == j ? (byte) 4 : 0;
                if (z) {
                    b = (byte) (b | 1);
                }
                mo42885c(i, min, (byte) 1, b);
                this.f22275a.mo24476q0(this.f22277c, j);
                if (i1 > j) {
                    m31441f(i, i1 - j);
                    return;
                }
                return;
            }
            throw new IOException("closed");
        }

        /* renamed from: e */
        public synchronized void mo42830e(boolean z, int i, int i2) {
            if (!this.f22280f) {
                mo42885c(0, 8, (byte) 6, z ? (byte) 1 : 0);
                this.f22275a.mo24730M(i);
                this.f22275a.mo24730M(i2);
                this.f22275a.flush();
            } else {
                throw new IOException("closed");
            }
        }

        /* renamed from: e0 */
        public synchronized void mo42831e0(C12136m mVar) {
            if (!this.f22280f) {
                int i = 0;
                mo42885c(0, mVar.mo42911l() * 6, (byte) 4, (byte) 0);
                while (i < 10) {
                    if (mVar.mo42907h(i)) {
                        this.f22275a.mo24729L(i == 4 ? 3 : i == 7 ? 4 : i);
                        this.f22275a.mo24730M(mVar.mo42902c(i));
                    }
                    i++;
                }
                this.f22275a.flush();
            } else {
                throw new IOException("closed");
            }
        }

        public synchronized void flush() {
            if (!this.f22280f) {
                this.f22275a.flush();
            } else {
                throw new IOException("closed");
            }
        }

        /* renamed from: g */
        public synchronized void mo42833g(int i, int i2, List<C12117e> list) {
            if (!this.f22280f) {
                this.f22278d.mo42879b(list);
                long i1 = this.f22277c.mo24758i1();
                int min = (int) Math.min((long) (this.f22279e - 4), i1);
                long j = (long) min;
                mo42885c(i, min + 4, (byte) 5, i1 == j ? (byte) 4 : 0);
                this.f22275a.mo24730M(i2 & ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED);
                this.f22275a.mo24476q0(this.f22277c, j);
                if (i1 > j) {
                    m31441f(i, i1 - j);
                }
            } else {
                throw new IOException("closed");
            }
        }

        /* renamed from: o */
        public synchronized void mo42834o(int i, ErrorCode errorCode) {
            if (this.f22280f) {
                throw new IOException("closed");
            } else if (errorCode.httpCode != -1) {
                mo42885c(i, 4, (byte) 3, (byte) 0);
                this.f22275a.mo24730M(errorCode.httpCode);
                this.f22275a.flush();
            } else {
                throw new IllegalArgumentException();
            }
        }

        /* renamed from: x */
        public synchronized void mo42835x(C12136m mVar) {
            if (!this.f22280f) {
                this.f22279e = mVar.mo42905f(this.f22279e);
                mo42885c(0, 0, (byte) 4, (byte) 1);
                this.f22275a.flush();
            } else {
                throw new IOException("closed");
            }
        }

        /* renamed from: y */
        public synchronized void mo42836y(int i, ErrorCode errorCode, byte[] bArr) {
            if (this.f22280f) {
                throw new IOException("closed");
            } else if (errorCode.httpCode != -1) {
                mo42885c(0, bArr.length + 8, (byte) 7, (byte) 0);
                this.f22275a.mo24730M(i);
                this.f22275a.mo24730M(errorCode.httpCode);
                if (bArr.length > 0) {
                    this.f22275a.mo24732O0(bArr);
                }
                this.f22275a.flush();
            } else {
                throw C12121g.m31416j("errorCode.httpCode == -1", new Object[0]);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public static IllegalArgumentException m31416j(String str, Object... objArr) {
        throw new IllegalArgumentException(String.format(str, objArr));
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public static IOException m31417k(String str, Object... objArr) {
        throw new IOException(String.format(str, objArr));
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public static int m31418l(int i, byte b, short s) {
        if ((b & 8) != 0) {
            i--;
        }
        if (s <= i) {
            return (short) (i - s);
        }
        throw m31417k("PROTOCOL_ERROR padding %s > remaining length %s", Short.valueOf(s), Integer.valueOf(i));
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public static int m31419m(C9838e eVar) {
        return (eVar.readByte() & 255) | ((eVar.readByte() & 255) << ParameterInitDefType.ExternalSamplerInit) | ((eVar.readByte() & 255) << 8);
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public static void m31420n(C9837d dVar, int i) {
        dVar.mo24736R((i >>> 16) & 255);
        dVar.mo24736R((i >>> 8) & 255);
        dVar.mo24736R(i & 255);
    }

    /* renamed from: a */
    public C12097a mo42881a(C9838e eVar, boolean z) {
        return new C12124c(eVar, 4096, z);
    }

    /* renamed from: b */
    public C12099b mo42882b(C9837d dVar, boolean z) {
        return new C12125d(dVar, z);
    }
}
