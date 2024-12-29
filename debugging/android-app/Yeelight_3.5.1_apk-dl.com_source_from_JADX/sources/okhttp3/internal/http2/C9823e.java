package okhttp3.internal.http2;

import androidx.appcompat.widget.ActivityChooserView;
import com.google.p017ar.schemas.sceneform.ParameterInitDefType;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import okhttp3.internal.http2.C9804b;
import okio.ByteString;
import okio.C3564c;
import okio.C9838e;
import okio.C9853r;
import okio.C9854s;
import p056k5.C3300c;

/* renamed from: okhttp3.internal.http2.e */
final class C9823e implements Closeable {

    /* renamed from: e */
    static final Logger f17787e = Logger.getLogger(C9807c.class.getName());

    /* renamed from: a */
    private final C9838e f17788a;

    /* renamed from: b */
    private final C9824a f17789b;

    /* renamed from: c */
    private final boolean f17790c;

    /* renamed from: d */
    final C9804b.C9805a f17791d;

    /* renamed from: okhttp3.internal.http2.e$a */
    static final class C9824a implements C9853r {

        /* renamed from: a */
        private final C9838e f17792a;

        /* renamed from: b */
        int f17793b;

        /* renamed from: c */
        byte f17794c;

        /* renamed from: d */
        int f17795d;

        /* renamed from: e */
        int f17796e;

        /* renamed from: f */
        short f17797f;

        C9824a(C9838e eVar) {
            this.f17792a = eVar;
        }

        /* renamed from: a */
        private void m23611a() {
            int i = this.f17795d;
            int l = C9823e.m23601l(this.f17792a);
            this.f17796e = l;
            this.f17793b = l;
            byte readByte = (byte) (this.f17792a.readByte() & 255);
            this.f17794c = (byte) (this.f17792a.readByte() & 255);
            Logger logger = C9823e.f17787e;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(C9807c.m23537b(true, this.f17795d, this.f17793b, readByte, this.f17794c));
            }
            int readInt = this.f17792a.readInt() & ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
            this.f17795d = readInt;
            if (readByte != 9) {
                throw C9807c.m23539d("%s != TYPE_CONTINUATION", Byte.valueOf(readByte));
            } else if (readInt != i) {
                throw C9807c.m23539d("TYPE_CONTINUATION streamId changed", new Object[0]);
            }
        }

        /* renamed from: R0 */
        public long mo24477R0(C3564c cVar, long j) {
            while (true) {
                int i = this.f17796e;
                if (i == 0) {
                    this.f17792a.skip((long) this.f17797f);
                    this.f17797f = 0;
                    if ((this.f17794c & 4) != 0) {
                        return -1;
                    }
                    m23611a();
                } else {
                    long R0 = this.f17792a.mo24477R0(cVar, Math.min(j, (long) i));
                    if (R0 == -1) {
                        return -1;
                    }
                    this.f17796e = (int) (((long) this.f17796e) - R0);
                    return R0;
                }
            }
        }

        public void close() {
        }

        /* renamed from: j */
        public C9854s mo24479j() {
            return this.f17792a.mo24479j();
        }
    }

    /* renamed from: okhttp3.internal.http2.e$b */
    interface C9825b {
        /* renamed from: b */
        void mo39034b(int i, long j);

        /* renamed from: e */
        void mo39035e(boolean z, int i, int i2);

        /* renamed from: g */
        void mo39036g(int i, int i2, List<C9802a> list);

        /* renamed from: h */
        void mo39037h();

        /* renamed from: i */
        void mo39038i(boolean z, int i, C9838e eVar, int i2);

        /* renamed from: j */
        void mo39039j(int i, int i2, int i3, boolean z);

        /* renamed from: k */
        void mo39040k(boolean z, C9829i iVar);

        /* renamed from: l */
        void mo39041l(boolean z, int i, int i2, List<C9802a> list);

        /* renamed from: m */
        void mo39042m(int i, ErrorCode errorCode);

        /* renamed from: n */
        void mo39043n(int i, ErrorCode errorCode, ByteString byteString);
    }

    C9823e(C9838e eVar, boolean z) {
        this.f17788a = eVar;
        this.f17790c = z;
        C9824a aVar = new C9824a(eVar);
        this.f17789b = aVar;
        this.f17791d = new C9804b.C9805a(4096, aVar);
    }

    /* renamed from: a */
    static int m23596a(int i, byte b, short s) {
        if ((b & 8) != 0) {
            i--;
        }
        if (s <= i) {
            return (short) (i - s);
        }
        throw C9807c.m23539d("PROTOCOL_ERROR padding %s > remaining length %s", Short.valueOf(s), Integer.valueOf(i));
    }

    /* renamed from: f */
    private void m23597f(C9825b bVar, int i, byte b, int i2) {
        short s = 0;
        if (i2 != 0) {
            boolean z = true;
            boolean z2 = (b & 1) != 0;
            if ((b & 32) == 0) {
                z = false;
            }
            if (!z) {
                if ((b & 8) != 0) {
                    s = (short) (this.f17788a.readByte() & 255);
                }
                bVar.mo39038i(z2, i2, this.f17788a, m23596a(i, b, s));
                this.f17788a.skip((long) s);
                return;
            }
            throw C9807c.m23539d("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA", new Object[0]);
        }
        throw C9807c.m23539d("PROTOCOL_ERROR: TYPE_DATA streamId == 0", new Object[0]);
    }

    /* renamed from: h */
    private void m23598h(C9825b bVar, int i, byte b, int i2) {
        if (i < 8) {
            throw C9807c.m23539d("TYPE_GOAWAY length < 8: %s", Integer.valueOf(i));
        } else if (i2 == 0) {
            int readInt = this.f17788a.readInt();
            int readInt2 = this.f17788a.readInt();
            int i3 = i - 8;
            ErrorCode fromHttp2 = ErrorCode.fromHttp2(readInt2);
            if (fromHttp2 != null) {
                ByteString byteString = ByteString.EMPTY;
                if (i3 > 0) {
                    byteString = this.f17788a.mo24789w((long) i3);
                }
                bVar.mo39043n(readInt, fromHttp2, byteString);
                return;
            }
            throw C9807c.m23539d("TYPE_GOAWAY unexpected error code: %d", Integer.valueOf(readInt2));
        } else {
            throw C9807c.m23539d("TYPE_GOAWAY streamId != 0", new Object[0]);
        }
    }

    /* renamed from: i */
    private List<C9802a> m23599i(int i, short s, byte b, int i2) {
        C9824a aVar = this.f17789b;
        aVar.f17796e = i;
        aVar.f17793b = i;
        aVar.f17797f = s;
        aVar.f17794c = b;
        aVar.f17795d = i2;
        this.f17791d.mo39002k();
        return this.f17791d.mo39000e();
    }

    /* renamed from: k */
    private void m23600k(C9825b bVar, int i, byte b, int i2) {
        short s = 0;
        if (i2 != 0) {
            boolean z = (b & 1) != 0;
            if ((b & 8) != 0) {
                s = (short) (this.f17788a.readByte() & 255);
            }
            if ((b & 32) != 0) {
                m23603n(bVar, i2);
                i -= 5;
            }
            bVar.mo39041l(z, i2, -1, m23599i(m23596a(i, b, s), s, b, i2));
            return;
        }
        throw C9807c.m23539d("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0", new Object[0]);
    }

    /* renamed from: l */
    static int m23601l(C9838e eVar) {
        return (eVar.readByte() & 255) | ((eVar.readByte() & 255) << ParameterInitDefType.ExternalSamplerInit) | ((eVar.readByte() & 255) << 8);
    }

    /* renamed from: m */
    private void m23602m(C9825b bVar, int i, byte b, int i2) {
        boolean z = false;
        if (i != 8) {
            throw C9807c.m23539d("TYPE_PING length != 8: %s", Integer.valueOf(i));
        } else if (i2 == 0) {
            int readInt = this.f17788a.readInt();
            int readInt2 = this.f17788a.readInt();
            if ((b & 1) != 0) {
                z = true;
            }
            bVar.mo39035e(z, readInt, readInt2);
        } else {
            throw C9807c.m23539d("TYPE_PING streamId != 0", new Object[0]);
        }
    }

    /* renamed from: n */
    private void m23603n(C9825b bVar, int i) {
        int readInt = this.f17788a.readInt();
        bVar.mo39039j(i, readInt & ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED, (this.f17788a.readByte() & 255) + 1, (Integer.MIN_VALUE & readInt) != 0);
    }

    /* renamed from: p */
    private void m23604p(C9825b bVar, int i, byte b, int i2) {
        if (i != 5) {
            throw C9807c.m23539d("TYPE_PRIORITY length: %d != 5", Integer.valueOf(i));
        } else if (i2 != 0) {
            m23603n(bVar, i2);
        } else {
            throw C9807c.m23539d("TYPE_PRIORITY streamId == 0", new Object[0]);
        }
    }

    /* renamed from: q */
    private void m23605q(C9825b bVar, int i, byte b, int i2) {
        short s = 0;
        if (i2 != 0) {
            if ((b & 8) != 0) {
                s = (short) (this.f17788a.readByte() & 255);
            }
            bVar.mo39036g(i2, this.f17788a.readInt() & ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED, m23599i(m23596a(i - 4, b, s), s, b, i2));
            return;
        }
        throw C9807c.m23539d("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0", new Object[0]);
    }

    /* renamed from: s */
    private void m23606s(C9825b bVar, int i, byte b, int i2) {
        if (i != 4) {
            throw C9807c.m23539d("TYPE_RST_STREAM length: %d != 4", Integer.valueOf(i));
        } else if (i2 != 0) {
            int readInt = this.f17788a.readInt();
            ErrorCode fromHttp2 = ErrorCode.fromHttp2(readInt);
            if (fromHttp2 != null) {
                bVar.mo39042m(i2, fromHttp2);
            } else {
                throw C9807c.m23539d("TYPE_RST_STREAM unexpected error code: %d", Integer.valueOf(readInt));
            }
        } else {
            throw C9807c.m23539d("TYPE_RST_STREAM streamId == 0", new Object[0]);
        }
    }

    /* renamed from: v */
    private void m23607v(C9825b bVar, int i, byte b, int i2) {
        if (i2 != 0) {
            throw C9807c.m23539d("TYPE_SETTINGS streamId != 0", new Object[0]);
        } else if ((b & 1) != 0) {
            if (i == 0) {
                bVar.mo39037h();
                return;
            }
            throw C9807c.m23539d("FRAME_SIZE_ERROR ack frame should be empty!", new Object[0]);
        } else if (i % 6 == 0) {
            C9829i iVar = new C9829i();
            for (int i3 = 0; i3 < i; i3 += 6) {
                short readShort = this.f17788a.readShort() & 65535;
                int readInt = this.f17788a.readInt();
                if (readShort != 2) {
                    if (readShort == 3) {
                        readShort = 4;
                    } else if (readShort == 4) {
                        readShort = 7;
                        if (readInt < 0) {
                            throw C9807c.m23539d("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1", new Object[0]);
                        }
                    } else if (readShort == 5 && (readInt < 16384 || readInt > 16777215)) {
                        throw C9807c.m23539d("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: %s", Integer.valueOf(readInt));
                    }
                } else if (!(readInt == 0 || readInt == 1)) {
                    throw C9807c.m23539d("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1", new Object[0]);
                }
                iVar.mo39074i(readShort, readInt);
            }
            bVar.mo39040k(false, iVar);
        } else {
            throw C9807c.m23539d("TYPE_SETTINGS length %% 6 != 0: %s", Integer.valueOf(i));
        }
    }

    /* renamed from: z */
    private void m23608z(C9825b bVar, int i, byte b, int i2) {
        if (i == 4) {
            long readInt = ((long) this.f17788a.readInt()) & 2147483647L;
            if (readInt != 0) {
                bVar.mo39034b(i2, readInt);
            } else {
                throw C9807c.m23539d("windowSizeIncrement was 0", Long.valueOf(readInt));
            }
        } else {
            throw C9807c.m23539d("TYPE_WINDOW_UPDATE length !=4: %s", Integer.valueOf(i));
        }
    }

    /* renamed from: c */
    public boolean mo39044c(boolean z, C9825b bVar) {
        try {
            this.f17788a.mo24742a1(9);
            int l = m23601l(this.f17788a);
            if (l < 0 || l > 16384) {
                throw C9807c.m23539d("FRAME_SIZE_ERROR: %s", Integer.valueOf(l));
            }
            byte readByte = (byte) (this.f17788a.readByte() & 255);
            if (!z || readByte == 4) {
                byte readByte2 = (byte) (this.f17788a.readByte() & 255);
                int readInt = this.f17788a.readInt() & ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
                Logger logger = f17787e;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(C9807c.m23537b(true, readInt, l, readByte, readByte2));
                }
                switch (readByte) {
                    case 0:
                        m23597f(bVar, l, readByte2, readInt);
                        break;
                    case 1:
                        m23600k(bVar, l, readByte2, readInt);
                        break;
                    case 2:
                        m23604p(bVar, l, readByte2, readInt);
                        break;
                    case 3:
                        m23606s(bVar, l, readByte2, readInt);
                        break;
                    case 4:
                        m23607v(bVar, l, readByte2, readInt);
                        break;
                    case 5:
                        m23605q(bVar, l, readByte2, readInt);
                        break;
                    case 6:
                        m23602m(bVar, l, readByte2, readInt);
                        break;
                    case 7:
                        m23598h(bVar, l, readByte2, readInt);
                        break;
                    case 8:
                        m23608z(bVar, l, readByte2, readInt);
                        break;
                    default:
                        this.f17788a.skip((long) l);
                        break;
                }
                return true;
            }
            throw C9807c.m23539d("Expected a SETTINGS frame but was %s", Byte.valueOf(readByte));
        } catch (IOException unused) {
            return false;
        }
    }

    public void close() {
        this.f17788a.close();
    }

    /* renamed from: d */
    public void mo39046d(C9825b bVar) {
        if (!this.f17790c) {
            C9838e eVar = this.f17788a;
            ByteString byteString = C9807c.f17721a;
            ByteString w = eVar.mo24789w((long) byteString.size());
            Logger logger = f17787e;
            if (logger.isLoggable(Level.FINE)) {
                logger.fine(C3300c.m8932q("<< CONNECTION %s", w.hex()));
            }
            if (!byteString.equals(w)) {
                throw C9807c.m23539d("Expected a connection header but was %s", w.utf8());
            }
        } else if (!mo39044c(true, bVar)) {
            throw C9807c.m23539d("Required SETTINGS preface not received", new Object[0]);
        }
    }
}
