package p011c.p083d.p084a.p085d0.p086m;

import androidx.appcompat.widget.ActivityChooserView;
import androidx.core.internal.view.SupportMenu;
import androidx.core.view.ViewCompat;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.ProtocolException;
import java.util.List;
import java.util.zip.Deflater;
import p011c.p083d.p084a.p085d0.C1024k;
import p011c.p083d.p084a.p085d0.p086m.C1028b;
import p163g.C10837g;
import p163g.C10843m;
import p163g.C4406c;
import p163g.C4409d;
import p163g.C4410e;
import p163g.C4411f;
import p163g.C4415s;

/* renamed from: c.d.a.d0.m.p */
public final class C1069p implements C1072q {

    /* renamed from: a */
    static final byte[] f1519a;

    /* renamed from: c.d.a.d0.m.p$a */
    static final class C1070a implements C1028b {

        /* renamed from: a */
        private final C4410e f1520a;

        /* renamed from: b */
        private final boolean f1521b;

        /* renamed from: c */
        private final C1062l f1522c;

        C1070a(C4410e eVar, boolean z) {
            this.f1520a = eVar;
            this.f1522c = new C1062l(eVar);
            this.f1521b = z;
        }

        /* renamed from: a */
        private static IOException m2370a(String str, Object... objArr) {
            throw new IOException(String.format(str, objArr));
        }

        /* renamed from: b */
        private void m2371b(C1028b.C1029a aVar, int i, int i2) {
            if (i2 == 8) {
                int readInt = this.f1520a.readInt() & ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
                int readInt2 = this.f1520a.readInt();
                C1027a c = C1027a.m2110c(readInt2);
                if (c != null) {
                    aVar.mo9496o(readInt, c, C4411f.f7953e);
                    return;
                }
                m2370a("TYPE_GOAWAY unexpected error code: %d", Integer.valueOf(readInt2));
                throw null;
            }
            m2370a("TYPE_GOAWAY length: %d != 8", Integer.valueOf(i2));
            throw null;
        }

        /* renamed from: g */
        private void m2372g(C1028b.C1029a aVar, int i, int i2) {
            aVar.mo9497p(false, false, this.f1520a.readInt() & ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED, -1, this.f1522c.mo9572f(i2 - 4), C1049g.SPDY_HEADERS);
        }

        /* renamed from: h */
        private void m2373h(C1028b.C1029a aVar, int i, int i2) {
            boolean z = true;
            if (i2 == 4) {
                int readInt = this.f1520a.readInt();
                if (this.f1521b != ((readInt & 1) == 1)) {
                    z = false;
                }
                aVar.mo9489d(z, readInt, 0);
                return;
            }
            m2370a("TYPE_PING length: %d != 4", Integer.valueOf(i2));
            throw null;
        }

        /* renamed from: i */
        private void m2374i(C1028b.C1029a aVar, int i, int i2) {
            if (i2 == 8) {
                int readInt = this.f1520a.readInt() & ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
                int readInt2 = this.f1520a.readInt();
                C1027a b = C1027a.m2109b(readInt2);
                if (b != null) {
                    aVar.mo9492k(readInt, b);
                    return;
                }
                m2370a("TYPE_RST_STREAM unexpected error code: %d", Integer.valueOf(readInt2));
                throw null;
            }
            m2370a("TYPE_RST_STREAM length: %d != 8", Integer.valueOf(i2));
            throw null;
        }

        /* renamed from: j */
        private void m2375j(C1028b.C1029a aVar, int i, int i2) {
            int readInt = this.f1520a.readInt();
            boolean z = false;
            if (i2 == (readInt * 8) + 4) {
                C1068o oVar = new C1068o();
                for (int i3 = 0; i3 < readInt; i3++) {
                    int readInt2 = this.f1520a.readInt();
                    int readInt3 = this.f1520a.readInt();
                    oVar.mo9591k(readInt2 & ViewCompat.MEASURED_SIZE_MASK, (-16777216 & readInt2) >>> 24, readInt3);
                }
                if ((i & 1) != 0) {
                    z = true;
                }
                aVar.mo9495n(z, oVar);
                return;
            }
            m2370a("TYPE_SETTINGS length: %d != 4 + 8 * %d", Integer.valueOf(i2), Integer.valueOf(readInt));
            throw null;
        }

        /* renamed from: n */
        private void m2376n(C1028b.C1029a aVar, int i, int i2) {
            aVar.mo9497p(false, (i & 1) != 0, this.f1520a.readInt() & ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED, -1, this.f1522c.mo9572f(i2 - 4), C1049g.SPDY_REPLY);
        }

        /* renamed from: o */
        private void m2377o(C1028b.C1029a aVar, int i, int i2) {
            int readInt = this.f1520a.readInt();
            int readInt2 = this.f1520a.readInt();
            int i3 = readInt & ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
            int i4 = readInt2 & ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
            this.f1520a.readShort();
            List<C1048f> f = this.f1522c.mo9572f(i2 - 10);
            aVar.mo9497p((i & 2) != 0, (i & 1) != 0, i3, i4, f, C1049g.SPDY_SYN_STREAM);
        }

        /* renamed from: s */
        private void m2378s(C1028b.C1029a aVar, int i, int i2) {
            if (i2 == 8) {
                int readInt = this.f1520a.readInt();
                int readInt2 = this.f1520a.readInt();
                int i3 = readInt & ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
                long j = (long) (readInt2 & ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED);
                if (j != 0) {
                    aVar.mo9488c(i3, j);
                    return;
                }
                m2370a("windowSizeIncrement was 0", Long.valueOf(j));
                throw null;
            }
            m2370a("TYPE_WINDOW_UPDATE length: %d != 8", Integer.valueOf(i2));
            throw null;
        }

        /* renamed from: A0 */
        public void mo9486A0() {
        }

        /* renamed from: G */
        public boolean mo9487G(C1028b.C1029a aVar) {
            boolean z = false;
            try {
                int readInt = this.f1520a.readInt();
                int readInt2 = this.f1520a.readInt();
                boolean z2 = (Integer.MIN_VALUE & readInt) != 0;
                int i = (-16777216 & readInt2) >>> 24;
                int i2 = readInt2 & ViewCompat.MEASURED_SIZE_MASK;
                if (z2) {
                    int i3 = (2147418112 & readInt) >>> 16;
                    int i4 = readInt & SupportMenu.USER_MASK;
                    if (i3 == 3) {
                        switch (i4) {
                            case 1:
                                m2377o(aVar, i, i2);
                                return true;
                            case 2:
                                m2376n(aVar, i, i2);
                                return true;
                            case 3:
                                m2374i(aVar, i, i2);
                                return true;
                            case 4:
                                m2375j(aVar, i, i2);
                                return true;
                            case 6:
                                m2373h(aVar, i, i2);
                                return true;
                            case 7:
                                m2371b(aVar, i, i2);
                                return true;
                            case 8:
                                m2372g(aVar, i, i2);
                                return true;
                            case 9:
                                m2378s(aVar, i, i2);
                                return true;
                            default:
                                this.f1520a.skip((long) i2);
                                return true;
                        }
                    } else {
                        throw new ProtocolException("version != 3: " + i3);
                    }
                } else {
                    int i5 = readInt & ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
                    if ((i & 1) != 0) {
                        z = true;
                    }
                    aVar.mo9493l(z, i5, this.f1520a, i2);
                    return true;
                }
            } catch (IOException unused) {
                return false;
            }
        }

        public void close() {
            this.f1522c.mo9571c();
        }
    }

    /* renamed from: c.d.a.d0.m.p$b */
    static final class C1071b implements C1030c {

        /* renamed from: a */
        private final C4409d f1523a;

        /* renamed from: b */
        private final C4406c f1524b;

        /* renamed from: c */
        private final C4409d f1525c;

        /* renamed from: d */
        private final boolean f1526d;

        /* renamed from: e */
        private boolean f1527e;

        C1071b(C4409d dVar, boolean z) {
            this.f1523a = dVar;
            this.f1526d = z;
            Deflater deflater = new Deflater();
            deflater.setDictionary(C1069p.f1519a);
            C4406c cVar = new C4406c();
            this.f1524b = cVar;
            this.f1525c = C10843m.m27008c(new C10837g((C4415s) cVar, deflater));
        }

        /* renamed from: b */
        private void m2381b(List<C1048f> list) {
            this.f1525c.mo24215P(list.size());
            int size = list.size();
            for (int i = 0; i < size; i++) {
                C4411f fVar = list.get(i).f1459a;
                this.f1525c.mo24215P(fVar.mo24297q());
                this.f1525c.mo24211M0(fVar);
                C4411f fVar2 = list.get(i).f1460b;
                this.f1525c.mo24215P(fVar2.mo24297q());
                this.f1525c.mo24211M0(fVar2);
            }
            this.f1525c.flush();
        }

        /* renamed from: A */
        public synchronized void mo9498A(boolean z, int i, C4406c cVar, int i2) {
            mo9594a(i, z ? 1 : 0, cVar, i2);
        }

        /* renamed from: V0 */
        public int mo9499V0() {
            return 16383;
        }

        /* renamed from: W0 */
        public synchronized void mo9500W0(boolean z, boolean z2, int i, int i2, List<C1048f> list) {
            if (!this.f1527e) {
                m2381b(list);
                int g1 = (int) (this.f1524b.mo24233g1() + 10);
                boolean z3 = z | (z2 ? (char) 2 : 0);
                this.f1523a.mo24215P(-2147287039);
                this.f1523a.mo24215P(((z3 & true ? 1 : 0) << true) | (g1 & ViewCompat.MEASURED_SIZE_MASK));
                this.f1523a.mo24215P(i & ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED);
                this.f1523a.mo24215P(Integer.MAX_VALUE & i2);
                this.f1523a.mo24214O(0);
                this.f1523a.mo24261s0(this.f1524b);
                this.f1523a.flush();
            } else {
                throw new IOException("closed");
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo9594a(int i, int i2, C4406c cVar, int i3) {
            if (!this.f1527e) {
                long j = (long) i3;
                if (j <= 16777215) {
                    this.f1523a.mo24215P(i & ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED);
                    this.f1523a.mo24215P(((i2 & 255) << 24) | (16777215 & i3));
                    if (i3 > 0) {
                        this.f1523a.mo9442p0(cVar, j);
                        return;
                    }
                    return;
                }
                throw new IllegalArgumentException("FRAME_TOO_LARGE max size is 16Mib: " + i3);
            }
            throw new IOException("closed");
        }

        /* renamed from: a1 */
        public synchronized void mo9501a1(C1068o oVar) {
            if (!this.f1527e) {
                int l = oVar.mo9592l();
                this.f1523a.mo24215P(-2147287036);
                this.f1523a.mo24215P((((l * 8) + 4) & ViewCompat.MEASURED_SIZE_MASK) | 0);
                this.f1523a.mo24215P(l);
                for (int i = 0; i <= 10; i++) {
                    if (oVar.mo9588h(i)) {
                        this.f1523a.mo24215P(((oVar.mo9582b(i) & 255) << 24) | (i & ViewCompat.MEASURED_SIZE_MASK));
                        this.f1523a.mo24215P(oVar.mo9583c(i));
                    }
                }
                this.f1523a.flush();
            } else {
                throw new IOException("closed");
            }
        }

        /* renamed from: c */
        public synchronized void mo9502c(int i, long j) {
            if (this.f1527e) {
                throw new IOException("closed");
            } else if (j == 0 || j > 2147483647L) {
                throw new IllegalArgumentException("windowSizeIncrement must be between 1 and 0x7fffffff: " + j);
            } else {
                this.f1523a.mo24215P(-2147287031);
                this.f1523a.mo24215P(8);
                this.f1523a.mo24215P(i);
                this.f1523a.mo24215P((int) j);
                this.f1523a.flush();
            }
        }

        public synchronized void close() {
            this.f1527e = true;
            C1024k.m2091b(this.f1523a, this.f1525c);
        }

        /* renamed from: d */
        public synchronized void mo9503d(boolean z, int i, int i2) {
            if (!this.f1527e) {
                boolean z2 = false;
                if (this.f1526d != ((i & 1) == 1)) {
                    z2 = true;
                }
                if (z == z2) {
                    this.f1523a.mo24215P(-2147287034);
                    this.f1523a.mo24215P(4);
                    this.f1523a.mo24215P(i);
                    this.f1523a.flush();
                } else {
                    throw new IllegalArgumentException("payload != reply");
                }
            } else {
                throw new IOException("closed");
            }
        }

        /* renamed from: e */
        public void mo9504e(int i, int i2, List<C1048f> list) {
        }

        public synchronized void flush() {
            if (!this.f1527e) {
                this.f1523a.flush();
            } else {
                throw new IOException("closed");
            }
        }

        /* renamed from: k */
        public synchronized void mo9506k(int i, C1027a aVar) {
            if (this.f1527e) {
                throw new IOException("closed");
            } else if (aVar.f1368b != -1) {
                this.f1523a.mo24215P(-2147287037);
                this.f1523a.mo24215P(8);
                this.f1523a.mo24215P(i & ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED);
                this.f1523a.mo24215P(aVar.f1368b);
                this.f1523a.flush();
            } else {
                throw new IllegalArgumentException();
            }
        }

        /* renamed from: q */
        public synchronized void mo9507q(int i, C1027a aVar, byte[] bArr) {
            if (this.f1527e) {
                throw new IOException("closed");
            } else if (aVar.f1369c != -1) {
                this.f1523a.mo24215P(-2147287033);
                this.f1523a.mo24215P(8);
                this.f1523a.mo24215P(i);
                this.f1523a.mo24215P(aVar.f1369c);
                this.f1523a.flush();
            } else {
                throw new IllegalArgumentException("errorCode.spdyGoAwayCode == -1");
            }
        }

        /* renamed from: q0 */
        public void mo9508q0(C1068o oVar) {
        }

        /* renamed from: y */
        public synchronized void mo9509y() {
        }
    }

    static {
        try {
            f1519a = "\u0000\u0000\u0000\u0007options\u0000\u0000\u0000\u0004head\u0000\u0000\u0000\u0004post\u0000\u0000\u0000\u0003put\u0000\u0000\u0000\u0006delete\u0000\u0000\u0000\u0005trace\u0000\u0000\u0000\u0006accept\u0000\u0000\u0000\u000eaccept-charset\u0000\u0000\u0000\u000faccept-encoding\u0000\u0000\u0000\u000faccept-language\u0000\u0000\u0000\raccept-ranges\u0000\u0000\u0000\u0003age\u0000\u0000\u0000\u0005allow\u0000\u0000\u0000\rauthorization\u0000\u0000\u0000\rcache-control\u0000\u0000\u0000\nconnection\u0000\u0000\u0000\fcontent-base\u0000\u0000\u0000\u0010content-encoding\u0000\u0000\u0000\u0010content-language\u0000\u0000\u0000\u000econtent-length\u0000\u0000\u0000\u0010content-location\u0000\u0000\u0000\u000bcontent-md5\u0000\u0000\u0000\rcontent-range\u0000\u0000\u0000\fcontent-type\u0000\u0000\u0000\u0004date\u0000\u0000\u0000\u0004etag\u0000\u0000\u0000\u0006expect\u0000\u0000\u0000\u0007expires\u0000\u0000\u0000\u0004from\u0000\u0000\u0000\u0004host\u0000\u0000\u0000\bif-match\u0000\u0000\u0000\u0011if-modified-since\u0000\u0000\u0000\rif-none-match\u0000\u0000\u0000\bif-range\u0000\u0000\u0000\u0013if-unmodified-since\u0000\u0000\u0000\rlast-modified\u0000\u0000\u0000\blocation\u0000\u0000\u0000\fmax-forwards\u0000\u0000\u0000\u0006pragma\u0000\u0000\u0000\u0012proxy-authenticate\u0000\u0000\u0000\u0013proxy-authorization\u0000\u0000\u0000\u0005range\u0000\u0000\u0000\u0007referer\u0000\u0000\u0000\u000bretry-after\u0000\u0000\u0000\u0006server\u0000\u0000\u0000\u0002te\u0000\u0000\u0000\u0007trailer\u0000\u0000\u0000\u0011transfer-encoding\u0000\u0000\u0000\u0007upgrade\u0000\u0000\u0000\nuser-agent\u0000\u0000\u0000\u0004vary\u0000\u0000\u0000\u0003via\u0000\u0000\u0000\u0007warning\u0000\u0000\u0000\u0010www-authenticate\u0000\u0000\u0000\u0006method\u0000\u0000\u0000\u0003get\u0000\u0000\u0000\u0006status\u0000\u0000\u0000\u0006200 OK\u0000\u0000\u0000\u0007version\u0000\u0000\u0000\bHTTP/1.1\u0000\u0000\u0000\u0003url\u0000\u0000\u0000\u0006public\u0000\u0000\u0000\nset-cookie\u0000\u0000\u0000\nkeep-alive\u0000\u0000\u0000\u0006origin100101201202205206300302303304305306307402405406407408409410411412413414415416417502504505203 Non-Authoritative Information204 No Content301 Moved Permanently400 Bad Request401 Unauthorized403 Forbidden404 Not Found500 Internal Server Error501 Not Implemented503 Service UnavailableJan Feb Mar Apr May Jun Jul Aug Sept Oct Nov Dec 00:00:00 Mon, Tue, Wed, Thu, Fri, Sat, Sun, GMTchunked,text/html,image/png,image/jpg,image/gif,application/xml,application/xhtml+xml,text/plain,text/javascript,publicprivatemax-age=gzip,deflate,sdchcharset=utf-8charset=iso-8859-1,utf-,*,enq=0.".getBytes(C1024k.f1345c.name());
        } catch (UnsupportedEncodingException unused) {
            throw new AssertionError();
        }
    }

    /* renamed from: a */
    public C1028b mo9562a(C4410e eVar, boolean z) {
        return new C1070a(eVar, z);
    }

    /* renamed from: b */
    public C1030c mo9563b(C4409d dVar, boolean z) {
        return new C1071b(dVar, z);
    }
}
