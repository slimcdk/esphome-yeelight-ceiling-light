package p236z2;

import androidx.appcompat.widget.ActivityChooserView;
import androidx.core.internal.view.SupportMenu;
import androidx.core.view.ViewCompat;
import com.squareup.okhttp.internal.framed.ErrorCode;
import com.squareup.okhttp.internal.framed.HeadersMode;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.ProtocolException;
import java.util.List;
import java.util.zip.Deflater;
import okio.ByteString;
import okio.C3564c;
import okio.C9837d;
import okio.C9838e;
import okio.C9839f;
import okio.C9845l;
import okio.C9852q;
import p231y2.C12033k;
import p236z2.C12097a;

/* renamed from: z2.n */
public final class C12137n implements C12140o {

    /* renamed from: a */
    static final byte[] f22301a;

    /* renamed from: z2.n$a */
    static final class C12138a implements C12097a {

        /* renamed from: a */
        private final C9838e f22302a;

        /* renamed from: b */
        private final boolean f22303b;

        /* renamed from: c */
        private final C12130j f22304c;

        C12138a(C9838e eVar, boolean z) {
            this.f22302a = eVar;
            this.f22304c = new C12130j(eVar);
            this.f22303b = z;
        }

        /* renamed from: a */
        private static IOException m31497a(String str, Object... objArr) {
            throw new IOException(String.format(str, objArr));
        }

        /* renamed from: c */
        private void m31498c(C12097a.C12098a aVar, int i, int i2) {
            if (i2 == 8) {
                int readInt = this.f22302a.readInt() & ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
                int readInt2 = this.f22302a.readInt();
                ErrorCode fromSpdyGoAway = ErrorCode.fromSpdyGoAway(readInt2);
                if (fromSpdyGoAway != null) {
                    aVar.mo42822q(readInt, fromSpdyGoAway, ByteString.EMPTY);
                } else {
                    throw m31497a("TYPE_GOAWAY unexpected error code: %d", Integer.valueOf(readInt2));
                }
            } else {
                throw m31497a("TYPE_GOAWAY length: %d != 8", Integer.valueOf(i2));
            }
        }

        /* renamed from: d */
        private void m31499d(C12097a.C12098a aVar, int i, int i2) {
            aVar.mo42824s(false, false, this.f22302a.readInt() & ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED, -1, this.f22304c.mo42891f(i2 - 4), HeadersMode.SPDY_HEADERS);
        }

        /* renamed from: f */
        private void m31500f(C12097a.C12098a aVar, int i, int i2) {
            boolean z = true;
            if (i2 == 4) {
                int readInt = this.f22302a.readInt();
                if (this.f22303b != ((readInt & 1) == 1)) {
                    z = false;
                }
                aVar.mo42816e(z, readInt, 0);
                return;
            }
            throw m31497a("TYPE_PING length: %d != 4", Integer.valueOf(i2));
        }

        /* renamed from: h */
        private void m31501h(C12097a.C12098a aVar, int i, int i2) {
            if (i2 == 8) {
                int readInt = this.f22302a.readInt() & ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
                int readInt2 = this.f22302a.readInt();
                ErrorCode fromSpdy3Rst = ErrorCode.fromSpdy3Rst(readInt2);
                if (fromSpdy3Rst != null) {
                    aVar.mo42821o(readInt, fromSpdy3Rst);
                } else {
                    throw m31497a("TYPE_RST_STREAM unexpected error code: %d", Integer.valueOf(readInt2));
                }
            } else {
                throw m31497a("TYPE_RST_STREAM length: %d != 8", Integer.valueOf(i2));
            }
        }

        /* renamed from: i */
        private void m31502i(C12097a.C12098a aVar, int i, int i2) {
            int readInt = this.f22302a.readInt();
            boolean z = false;
            if (i2 == (readInt * 8) + 4) {
                C12136m mVar = new C12136m();
                for (int i3 = 0; i3 < readInt; i3++) {
                    int readInt2 = this.f22302a.readInt();
                    int readInt3 = this.f22302a.readInt();
                    mVar.mo42910k(readInt2 & ViewCompat.MEASURED_SIZE_MASK, (-16777216 & readInt2) >>> 24, readInt3);
                }
                if ((i & 1) != 0) {
                    z = true;
                }
                aVar.mo42823r(z, mVar);
                return;
            }
            throw m31497a("TYPE_SETTINGS length: %d != 4 + 8 * %d", Integer.valueOf(i2), Integer.valueOf(readInt));
        }

        /* renamed from: k */
        private void m31503k(C12097a.C12098a aVar, int i, int i2) {
            aVar.mo42824s(false, (i & 1) != 0, this.f22302a.readInt() & ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED, -1, this.f22304c.mo42891f(i2 - 4), HeadersMode.SPDY_REPLY);
        }

        /* renamed from: l */
        private void m31504l(C12097a.C12098a aVar, int i, int i2) {
            int readInt = this.f22302a.readInt();
            int readInt2 = this.f22302a.readInt();
            int i3 = readInt & ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
            int i4 = readInt2 & ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
            this.f22302a.readShort();
            List<C12117e> f = this.f22304c.mo42891f(i2 - 10);
            aVar.mo42824s((i & 2) != 0, (i & 1) != 0, i3, i4, f, HeadersMode.SPDY_SYN_STREAM);
        }

        /* renamed from: m */
        private void m31505m(C12097a.C12098a aVar, int i, int i2) {
            if (i2 == 8) {
                int readInt = this.f22302a.readInt();
                int readInt2 = this.f22302a.readInt();
                int i3 = readInt & ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
                long j = (long) (readInt2 & ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED);
                if (j != 0) {
                    aVar.mo42815b(i3, j);
                } else {
                    throw m31497a("windowSizeIncrement was 0", Long.valueOf(j));
                }
            } else {
                throw m31497a("TYPE_WINDOW_UPDATE length: %d != 8", Integer.valueOf(i2));
            }
        }

        /* renamed from: C */
        public boolean mo42813C(C12097a.C12098a aVar) {
            boolean z = false;
            try {
                int readInt = this.f22302a.readInt();
                int readInt2 = this.f22302a.readInt();
                boolean z2 = (Integer.MIN_VALUE & readInt) != 0;
                int i = (-16777216 & readInt2) >>> 24;
                int i2 = readInt2 & ViewCompat.MEASURED_SIZE_MASK;
                if (z2) {
                    int i3 = (2147418112 & readInt) >>> 16;
                    int i4 = readInt & SupportMenu.USER_MASK;
                    if (i3 == 3) {
                        switch (i4) {
                            case 1:
                                m31504l(aVar, i, i2);
                                return true;
                            case 2:
                                m31503k(aVar, i, i2);
                                return true;
                            case 3:
                                m31501h(aVar, i, i2);
                                return true;
                            case 4:
                                m31502i(aVar, i, i2);
                                return true;
                            case 6:
                                m31500f(aVar, i, i2);
                                return true;
                            case 7:
                                m31498c(aVar, i, i2);
                                return true;
                            case 8:
                                m31499d(aVar, i, i2);
                                return true;
                            case 9:
                                m31505m(aVar, i, i2);
                                return true;
                            default:
                                this.f22302a.skip((long) i2);
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
                    aVar.mo42819i(z, i5, this.f22302a, i2);
                    return true;
                }
            } catch (IOException unused) {
                return false;
            }
        }

        /* renamed from: C0 */
        public void mo42814C0() {
        }

        public void close() {
            this.f22304c.mo42890c();
        }
    }

    /* renamed from: z2.n$b */
    static final class C12139b implements C12099b {

        /* renamed from: a */
        private final C9837d f22305a;

        /* renamed from: b */
        private final C3564c f22306b;

        /* renamed from: c */
        private final C9837d f22307c;

        /* renamed from: d */
        private final boolean f22308d;

        /* renamed from: e */
        private boolean f22309e;

        C12139b(C9837d dVar, boolean z) {
            this.f22305a = dVar;
            this.f22308d = z;
            Deflater deflater = new Deflater();
            deflater.setDictionary(C12137n.f22301a);
            C3564c cVar = new C3564c();
            this.f22306b = cVar;
            this.f22307c = C9845l.m23737c(new C9839f((C9852q) cVar, deflater));
        }

        /* renamed from: c */
        private void m31508c(List<C12117e> list) {
            this.f22307c.mo24730M(list.size());
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ByteString byteString = list.get(i).f22246a;
                this.f22307c.mo24730M(byteString.size());
                this.f22307c.mo24733P0(byteString);
                ByteString byteString2 = list.get(i).f22247b;
                this.f22307c.mo24730M(byteString2.size());
                this.f22307c.mo24733P0(byteString2);
            }
            this.f22307c.flush();
        }

        /* renamed from: S */
        public synchronized void mo42825S() {
        }

        /* renamed from: X */
        public synchronized void mo42826X(boolean z, int i, C3564c cVar, int i2) {
            mo42913a(i, z ? 1 : 0, cVar, i2);
        }

        /* renamed from: X0 */
        public int mo42827X0() {
            return 16383;
        }

        /* renamed from: Y0 */
        public synchronized void mo42828Y0(boolean z, boolean z2, int i, int i2, List<C12117e> list) {
            if (!this.f22309e) {
                m31508c(list);
                int i1 = (int) (this.f22306b.mo24758i1() + 10);
                boolean z3 = z | (z2 ? (char) 2 : 0);
                this.f22305a.mo24730M(-2147287039);
                this.f22305a.mo24730M(((z3 & true ? 1 : 0) << true) | (i1 & ViewCompat.MEASURED_SIZE_MASK));
                this.f22305a.mo24730M(i & ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED);
                this.f22305a.mo24730M(Integer.MAX_VALUE & i2);
                this.f22305a.mo24729L(0);
                this.f22305a.mo24781s0(this.f22306b);
                this.f22305a.flush();
            } else {
                throw new IOException("closed");
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo42913a(int i, int i2, C3564c cVar, int i3) {
            if (!this.f22309e) {
                long j = (long) i3;
                if (j <= 16777215) {
                    this.f22305a.mo24730M(i & ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED);
                    this.f22305a.mo24730M(((i2 & 255) << 24) | (16777215 & i3));
                    if (i3 > 0) {
                        this.f22305a.mo24476q0(cVar, j);
                        return;
                    }
                    return;
                }
                throw new IllegalArgumentException("FRAME_TOO_LARGE max size is 16Mib: " + i3);
            }
            throw new IOException("closed");
        }

        /* renamed from: b */
        public synchronized void mo42829b(int i, long j) {
            if (this.f22309e) {
                throw new IOException("closed");
            } else if (j == 0 || j > 2147483647L) {
                throw new IllegalArgumentException("windowSizeIncrement must be between 1 and 0x7fffffff: " + j);
            } else {
                this.f22305a.mo24730M(-2147287031);
                this.f22305a.mo24730M(8);
                this.f22305a.mo24730M(i);
                this.f22305a.mo24730M((int) j);
                this.f22305a.flush();
            }
        }

        public synchronized void close() {
            this.f22309e = true;
            C12033k.m31042b(this.f22305a, this.f22307c);
        }

        /* renamed from: e */
        public synchronized void mo42830e(boolean z, int i, int i2) {
            if (!this.f22309e) {
                boolean z2 = false;
                if (this.f22308d != ((i & 1) == 1)) {
                    z2 = true;
                }
                if (z == z2) {
                    this.f22305a.mo24730M(-2147287034);
                    this.f22305a.mo24730M(4);
                    this.f22305a.mo24730M(i);
                    this.f22305a.flush();
                } else {
                    throw new IllegalArgumentException("payload != reply");
                }
            } else {
                throw new IOException("closed");
            }
        }

        /* renamed from: e0 */
        public synchronized void mo42831e0(C12136m mVar) {
            if (!this.f22309e) {
                int l = mVar.mo42911l();
                this.f22305a.mo24730M(-2147287036);
                this.f22305a.mo24730M((((l * 8) + 4) & ViewCompat.MEASURED_SIZE_MASK) | 0);
                this.f22305a.mo24730M(l);
                for (int i = 0; i <= 10; i++) {
                    if (mVar.mo42907h(i)) {
                        this.f22305a.mo24730M(((mVar.mo42901b(i) & 255) << 24) | (i & ViewCompat.MEASURED_SIZE_MASK));
                        this.f22305a.mo24730M(mVar.mo42902c(i));
                    }
                }
                this.f22305a.flush();
            } else {
                throw new IOException("closed");
            }
        }

        public synchronized void flush() {
            if (!this.f22309e) {
                this.f22305a.flush();
            } else {
                throw new IOException("closed");
            }
        }

        /* renamed from: g */
        public void mo42833g(int i, int i2, List<C12117e> list) {
        }

        /* renamed from: o */
        public synchronized void mo42834o(int i, ErrorCode errorCode) {
            if (this.f22309e) {
                throw new IOException("closed");
            } else if (errorCode.spdyRstCode != -1) {
                this.f22305a.mo24730M(-2147287037);
                this.f22305a.mo24730M(8);
                this.f22305a.mo24730M(i & ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED);
                this.f22305a.mo24730M(errorCode.spdyRstCode);
                this.f22305a.flush();
            } else {
                throw new IllegalArgumentException();
            }
        }

        /* renamed from: x */
        public void mo42835x(C12136m mVar) {
        }

        /* renamed from: y */
        public synchronized void mo42836y(int i, ErrorCode errorCode, byte[] bArr) {
            if (this.f22309e) {
                throw new IOException("closed");
            } else if (errorCode.spdyGoAwayCode != -1) {
                this.f22305a.mo24730M(-2147287033);
                this.f22305a.mo24730M(8);
                this.f22305a.mo24730M(i);
                this.f22305a.mo24730M(errorCode.spdyGoAwayCode);
                this.f22305a.flush();
            } else {
                throw new IllegalArgumentException("errorCode.spdyGoAwayCode == -1");
            }
        }
    }

    static {
        try {
            f22301a = "\u0000\u0000\u0000\u0007options\u0000\u0000\u0000\u0004head\u0000\u0000\u0000\u0004post\u0000\u0000\u0000\u0003put\u0000\u0000\u0000\u0006delete\u0000\u0000\u0000\u0005trace\u0000\u0000\u0000\u0006accept\u0000\u0000\u0000\u000eaccept-charset\u0000\u0000\u0000\u000faccept-encoding\u0000\u0000\u0000\u000faccept-language\u0000\u0000\u0000\raccept-ranges\u0000\u0000\u0000\u0003age\u0000\u0000\u0000\u0005allow\u0000\u0000\u0000\rauthorization\u0000\u0000\u0000\rcache-control\u0000\u0000\u0000\nconnection\u0000\u0000\u0000\fcontent-base\u0000\u0000\u0000\u0010content-encoding\u0000\u0000\u0000\u0010content-language\u0000\u0000\u0000\u000econtent-length\u0000\u0000\u0000\u0010content-location\u0000\u0000\u0000\u000bcontent-md5\u0000\u0000\u0000\rcontent-range\u0000\u0000\u0000\fcontent-type\u0000\u0000\u0000\u0004date\u0000\u0000\u0000\u0004etag\u0000\u0000\u0000\u0006expect\u0000\u0000\u0000\u0007expires\u0000\u0000\u0000\u0004from\u0000\u0000\u0000\u0004host\u0000\u0000\u0000\bif-match\u0000\u0000\u0000\u0011if-modified-since\u0000\u0000\u0000\rif-none-match\u0000\u0000\u0000\bif-range\u0000\u0000\u0000\u0013if-unmodified-since\u0000\u0000\u0000\rlast-modified\u0000\u0000\u0000\blocation\u0000\u0000\u0000\fmax-forwards\u0000\u0000\u0000\u0006pragma\u0000\u0000\u0000\u0012proxy-authenticate\u0000\u0000\u0000\u0013proxy-authorization\u0000\u0000\u0000\u0005range\u0000\u0000\u0000\u0007referer\u0000\u0000\u0000\u000bretry-after\u0000\u0000\u0000\u0006server\u0000\u0000\u0000\u0002te\u0000\u0000\u0000\u0007trailer\u0000\u0000\u0000\u0011transfer-encoding\u0000\u0000\u0000\u0007upgrade\u0000\u0000\u0000\nuser-agent\u0000\u0000\u0000\u0004vary\u0000\u0000\u0000\u0003via\u0000\u0000\u0000\u0007warning\u0000\u0000\u0000\u0010www-authenticate\u0000\u0000\u0000\u0006method\u0000\u0000\u0000\u0003get\u0000\u0000\u0000\u0006status\u0000\u0000\u0000\u0006200 OK\u0000\u0000\u0000\u0007version\u0000\u0000\u0000\bHTTP/1.1\u0000\u0000\u0000\u0003url\u0000\u0000\u0000\u0006public\u0000\u0000\u0000\nset-cookie\u0000\u0000\u0000\nkeep-alive\u0000\u0000\u0000\u0006origin100101201202205206300302303304305306307402405406407408409410411412413414415416417502504505203 Non-Authoritative Information204 No Content301 Moved Permanently400 Bad Request401 Unauthorized403 Forbidden404 Not Found500 Internal Server Error501 Not Implemented503 Service UnavailableJan Feb Mar Apr May Jun Jul Aug Sept Oct Nov Dec 00:00:00 Mon, Tue, Wed, Thu, Fri, Sat, Sun, GMTchunked,text/html,image/png,image/jpg,image/gif,application/xml,application/xhtml+xml,text/plain,text/javascript,publicprivatemax-age=gzip,deflate,sdchcharset=utf-8charset=iso-8859-1,utf-,*,enq=0.".getBytes(C12033k.f22067c.name());
        } catch (UnsupportedEncodingException unused) {
            throw new AssertionError();
        }
    }

    /* renamed from: a */
    public C12097a mo42881a(C9838e eVar, boolean z) {
        return new C12138a(eVar, z);
    }

    /* renamed from: b */
    public C12099b mo42882b(C9837d dVar, boolean z) {
        return new C12139b(dVar, z);
    }
}
