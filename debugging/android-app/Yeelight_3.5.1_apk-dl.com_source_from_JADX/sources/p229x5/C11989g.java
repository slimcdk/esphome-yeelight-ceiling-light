package p229x5;

import com.xiaomi.mipush.sdk.Constants;
import java.io.IOException;
import java.nio.channels.SelectableChannel;
import java.nio.channels.SelectionKey;
import java.nio.channels.SocketChannel;
import java.util.Locale;
import org.eclipse.jetty.p195io.EofException;
import p152e6.C9001b;
import p152e6.C9003c;
import p172i6.C9128e;
import p223w3.C11627r;
import p223w3.C11766w;
import p225w5.C11939c;
import p225w5.C11940d;
import p225w5.C11948i;
import p225w5.C11949j;
import p229x5.C11992h;

/* renamed from: x5.g */
public class C11989g extends C11984b implements C11939c, C11948i {

    /* renamed from: y */
    public static final C9003c f21900y = C9001b.m21451b("org.eclipse.jetty.io.nio");

    /* renamed from: j */
    private final boolean f21901j = System.getProperty("os.name").toLowerCase(Locale.ENGLISH).contains("win");

    /* renamed from: k */
    private final C11992h.C11996d f21902k;

    /* renamed from: l */
    private final C11992h f21903l;

    /* renamed from: m */
    private SelectionKey f21904m;

    /* renamed from: n */
    private final Runnable f21905n = new C11990a();

    /* renamed from: o */
    private int f21906o;

    /* renamed from: p */
    private volatile C11983a f21907p;

    /* renamed from: q */
    private boolean f21908q = false;

    /* renamed from: r */
    private boolean f21909r = false;

    /* renamed from: s */
    private volatile boolean f21910s = true;

    /* renamed from: t */
    private boolean f21911t;

    /* renamed from: u */
    private boolean f21912u;

    /* renamed from: v */
    private boolean f21913v;

    /* renamed from: w */
    private volatile long f21914w;

    /* renamed from: x */
    private boolean f21915x;

    /* renamed from: x5.g$a */
    class C11990a implements Runnable {
        C11990a() {
        }

        public void run() {
            C11989g.this.mo42563F();
        }
    }

    /* renamed from: x5.g$b */
    class C11991b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ long f21917a;

        C11991b(long j) {
            this.f21917a = j;
        }

        public void run() {
            try {
                C11989g.this.mo42566I(this.f21917a);
            } finally {
                C11989g.this.mo42568K(true);
            }
        }
    }

    public C11989g(SocketChannel socketChannel, C11992h.C11996d dVar, SelectionKey selectionKey, int i) {
        super(socketChannel, i);
        this.f21903l = dVar.mo42584j();
        this.f21902k = dVar;
        this.f21908q = false;
        this.f21909r = false;
        this.f21913v = true;
        this.f21904m = selectionKey;
        mo42568K(true);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0026 A[Catch:{ Exception -> 0x0061 }] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x003a A[ADDED_TO_REGION, Catch:{ Exception -> 0x0061 }] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0047 A[ADDED_TO_REGION, Catch:{ Exception -> 0x0061 }] */
    /* renamed from: M */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m30770M() {
        /*
            r6 = this;
            monitor-enter(r6)
            java.nio.channels.ByteChannel r0 = r6.mo42556p()     // Catch:{ all -> 0x007e }
            boolean r0 = r0.isOpen()     // Catch:{ all -> 0x007e }
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L_0x006a
            boolean r0 = r6.f21911t     // Catch:{ all -> 0x007e }
            if (r0 != 0) goto L_0x0021
            boolean r0 = r6.f21908q     // Catch:{ all -> 0x007e }
            if (r0 != 0) goto L_0x001f
            x5.a r0 = r6.f21907p     // Catch:{ all -> 0x007e }
            boolean r0 = r0.mo39519d()     // Catch:{ all -> 0x007e }
            if (r0 != 0) goto L_0x001f
            goto L_0x0021
        L_0x001f:
            r0 = 0
            goto L_0x0022
        L_0x0021:
            r0 = 1
        L_0x0022:
            boolean r4 = r6.f21912u     // Catch:{ all -> 0x007e }
            if (r4 != 0) goto L_0x0031
            boolean r4 = r6.f21908q     // Catch:{ all -> 0x007e }
            if (r4 != 0) goto L_0x002f
            boolean r4 = r6.f21910s     // Catch:{ all -> 0x007e }
            if (r4 != 0) goto L_0x002f
            goto L_0x0031
        L_0x002f:
            r4 = 0
            goto L_0x0032
        L_0x0031:
            r4 = 1
        L_0x0032:
            java.net.Socket r5 = r6.f21885c     // Catch:{ all -> 0x007e }
            boolean r5 = r5.isInputShutdown()     // Catch:{ all -> 0x007e }
            if (r5 != 0) goto L_0x003e
            if (r0 == 0) goto L_0x003e
            r0 = 1
            goto L_0x003f
        L_0x003e:
            r0 = 0
        L_0x003f:
            java.net.Socket r5 = r6.f21885c     // Catch:{ all -> 0x007e }
            boolean r5 = r5.isOutputShutdown()     // Catch:{ all -> 0x007e }
            if (r5 != 0) goto L_0x004b
            if (r4 == 0) goto L_0x004b
            r4 = 4
            goto L_0x004c
        L_0x004b:
            r4 = 0
        L_0x004c:
            r0 = r0 | r4
            r6.f21906o = r0     // Catch:{ all -> 0x007e }
            java.nio.channels.SelectionKey r0 = r6.f21904m     // Catch:{ Exception -> 0x0061 }
            if (r0 == 0) goto L_0x006a
            boolean r0 = r0.isValid()     // Catch:{ Exception -> 0x0061 }
            if (r0 == 0) goto L_0x006a
            java.nio.channels.SelectionKey r0 = r6.f21904m     // Catch:{ Exception -> 0x0061 }
            int r0 = r0.interestOps()     // Catch:{ Exception -> 0x0061 }
            r1 = r0
            goto L_0x006a
        L_0x0061:
            r0 = move-exception
            r4 = 0
            r6.f21904m = r4     // Catch:{ all -> 0x007e }
            e6.c r4 = f21900y     // Catch:{ all -> 0x007e }
            r4.mo36849d(r0)     // Catch:{ all -> 0x007e }
        L_0x006a:
            int r0 = r6.f21906o     // Catch:{ all -> 0x007e }
            if (r0 == r1) goto L_0x006f
            goto L_0x0070
        L_0x006f:
            r2 = 0
        L_0x0070:
            monitor-exit(r6)     // Catch:{ all -> 0x007e }
            if (r2 == 0) goto L_0x007d
            x5.h$d r0 = r6.f21902k
            r0.mo42578c(r6)
            x5.h$d r0 = r6.f21902k
            r0.mo42589p()
        L_0x007d:
            return
        L_0x007e:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x007e }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p229x5.C11989g.m30770M():void");
    }

    /* renamed from: A */
    public void mo39649A() {
        synchronized (this) {
            if (this.f21908q) {
                this.f21909r = true;
            } else {
                mo39652c();
            }
        }
    }

    /* renamed from: C */
    public void mo42560C(long j) {
        long j2 = this.f21914w;
        if (j2 != 0 && this.f21888f > 0) {
            long j3 = j - j2;
            if (j3 > ((long) this.f21888f)) {
                mo42568K(false);
                this.f21903l.mo39648h0(new C11991b(j3));
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D */
    public void mo42561D() {
        SelectionKey selectionKey;
        synchronized (this) {
            int i = 0;
            if (mo42556p().isOpen()) {
                if (this.f21906o > 0) {
                    SelectionKey selectionKey2 = this.f21904m;
                    if (selectionKey2 != null) {
                        if (selectionKey2.isValid()) {
                            selectionKey = this.f21904m;
                            i = this.f21906o;
                        }
                    }
                    if (((SelectableChannel) mo42556p()).isRegistered()) {
                        m30770M();
                    } else {
                        try {
                            this.f21904m = ((SelectableChannel) mo42556p()).register(this.f21902k.mo42586l(), this.f21906o, this);
                        } catch (Exception e) {
                            f21900y.mo36849d(e);
                            SelectionKey selectionKey3 = this.f21904m;
                            if (selectionKey3 != null && selectionKey3.isValid()) {
                                this.f21904m.cancel();
                            }
                            if (this.f21913v) {
                                this.f21902k.mo42581g(this);
                            }
                            this.f21913v = false;
                        }
                    }
                } else {
                    SelectionKey selectionKey4 = this.f21904m;
                    if (selectionKey4 != null && selectionKey4.isValid()) {
                        selectionKey = this.f21904m;
                    }
                }
                selectionKey.interestOps(i);
            } else {
                SelectionKey selectionKey5 = this.f21904m;
                if (selectionKey5 != null && selectionKey5.isValid()) {
                    this.f21904m.cancel();
                }
                if (this.f21913v) {
                    this.f21913v = false;
                    this.f21902k.mo42581g(this);
                }
            }
            this.f21904m = null;
        }
    }

    /* renamed from: E */
    public C11992h.C11996d mo42562E() {
        return this.f21902k;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:184:0x01a8 A[Catch:{ all -> 0x018c, ClosedChannelException -> 0x0133, EofException -> 0x00f0, IOException -> 0x00a9, all -> 0x0060, all -> 0x0170, all -> 0x016e, all -> 0x008d }] */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x01aa A[Catch:{ all -> 0x018c, ClosedChannelException -> 0x0133, EofException -> 0x00f0, IOException -> 0x00a9, all -> 0x0060, all -> 0x0170, all -> 0x016e, all -> 0x008d }] */
    /* renamed from: F */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo42563F() {
        /*
            r10 = this;
            java.lang.String r0 = "onInputShutdown failed"
            r1 = 1
            r2 = 1
        L_0x0004:
            java.lang.String r3 = "SCEP.run() finally DISPATCHED"
            r4 = 0
            if (r2 == 0) goto L_0x01be
        L_0x0009:
            x5.a r5 = r10.f21907p     // Catch:{ ClosedChannelException -> 0x0133, EofException -> 0x00f0, IOException -> 0x00a9, all -> 0x0060 }
            w5.j r5 = r5.mo39556c()     // Catch:{ ClosedChannelException -> 0x0133, EofException -> 0x00f0, IOException -> 0x00a9, all -> 0x0060 }
            x5.a r5 = (p229x5.C11983a) r5     // Catch:{ ClosedChannelException -> 0x0133, EofException -> 0x00f0, IOException -> 0x00a9, all -> 0x0060 }
            x5.a r6 = r10.f21907p     // Catch:{ ClosedChannelException -> 0x0133, EofException -> 0x00f0, IOException -> 0x00a9, all -> 0x0060 }
            if (r5 == r6) goto L_0x002f
            e6.c r6 = f21900y     // Catch:{ ClosedChannelException -> 0x0133, EofException -> 0x00f0, IOException -> 0x00a9, all -> 0x0060 }
            java.lang.String r7 = "{} replaced {}"
            r8 = 2
            java.lang.Object[] r8 = new java.lang.Object[r8]     // Catch:{ ClosedChannelException -> 0x0133, EofException -> 0x00f0, IOException -> 0x00a9, all -> 0x0060 }
            r8[r4] = r5     // Catch:{ ClosedChannelException -> 0x0133, EofException -> 0x00f0, IOException -> 0x00a9, all -> 0x0060 }
            x5.a r9 = r10.f21907p     // Catch:{ ClosedChannelException -> 0x0133, EofException -> 0x00f0, IOException -> 0x00a9, all -> 0x0060 }
            r8[r1] = r9     // Catch:{ ClosedChannelException -> 0x0133, EofException -> 0x00f0, IOException -> 0x00a9, all -> 0x0060 }
            r6.mo36850e(r7, r8)     // Catch:{ ClosedChannelException -> 0x0133, EofException -> 0x00f0, IOException -> 0x00a9, all -> 0x0060 }
            x5.a r6 = r10.f21907p     // Catch:{ ClosedChannelException -> 0x0133, EofException -> 0x00f0, IOException -> 0x00a9, all -> 0x0060 }
            r10.f21907p = r5     // Catch:{ ClosedChannelException -> 0x0133, EofException -> 0x00f0, IOException -> 0x00a9, all -> 0x0060 }
            x5.h r5 = r10.f21903l     // Catch:{ ClosedChannelException -> 0x0133, EofException -> 0x00f0, IOException -> 0x00a9, all -> 0x0060 }
            r5.mo39645O0(r10, r6)     // Catch:{ ClosedChannelException -> 0x0133, EofException -> 0x00f0, IOException -> 0x00a9, all -> 0x0060 }
            goto L_0x0009
        L_0x002f:
            boolean r5 = r10.f21915x     // Catch:{ all -> 0x016e }
            if (r5 != 0) goto L_0x00a3
            boolean r5 = r10.mo39669s()     // Catch:{ all -> 0x016e }
            if (r5 == 0) goto L_0x00a3
            boolean r5 = r10.isOpen()     // Catch:{ all -> 0x016e }
            if (r5 == 0) goto L_0x00a3
            r10.f21915x = r1     // Catch:{ all -> 0x016e }
            x5.a r5 = r10.f21907p     // Catch:{ all -> 0x004a }
            r5.mo39557e()     // Catch:{ all -> 0x004a }
        L_0x0046:
            r10.m30770M()     // Catch:{ all -> 0x016e }
            goto L_0x00a3
        L_0x004a:
            r5 = move-exception
            e6.c r6 = f21900y     // Catch:{ all -> 0x005b }
            r6.mo36852g(r0, r5)     // Catch:{ all -> 0x005b }
            r10.close()     // Catch:{ IOException -> 0x0054 }
            goto L_0x0046
        L_0x0054:
            r5 = move-exception
            e6.c r6 = f21900y     // Catch:{ all -> 0x005b }
            r6.mo36849d(r5)     // Catch:{ all -> 0x005b }
            goto L_0x0046
        L_0x005b:
            r0 = move-exception
            r10.m30770M()     // Catch:{ all -> 0x016e }
            throw r0     // Catch:{ all -> 0x016e }
        L_0x0060:
            r5 = move-exception
            e6.c r6 = f21900y     // Catch:{ all -> 0x0170 }
            java.lang.String r7 = "handle failed"
            r6.mo36852g(r7, r5)     // Catch:{ all -> 0x0170 }
            r10.close()     // Catch:{ IOException -> 0x006c }
            goto L_0x0072
        L_0x006c:
            r5 = move-exception
            e6.c r6 = f21900y     // Catch:{ all -> 0x0170 }
            r6.mo36849d(r5)     // Catch:{ all -> 0x0170 }
        L_0x0072:
            boolean r5 = r10.f21915x     // Catch:{ all -> 0x016e }
            if (r5 != 0) goto L_0x00a3
            boolean r5 = r10.mo39669s()     // Catch:{ all -> 0x016e }
            if (r5 == 0) goto L_0x00a3
            boolean r5 = r10.isOpen()     // Catch:{ all -> 0x016e }
            if (r5 == 0) goto L_0x00a3
            r10.f21915x = r1     // Catch:{ all -> 0x016e }
            x5.a r5 = r10.f21907p     // Catch:{ all -> 0x008d }
            r5.mo39557e()     // Catch:{ all -> 0x008d }
        L_0x0089:
            r10.m30770M()     // Catch:{ all -> 0x016e }
            goto L_0x00a3
        L_0x008d:
            r5 = move-exception
            e6.c r6 = f21900y     // Catch:{ all -> 0x009e }
            r6.mo36852g(r0, r5)     // Catch:{ all -> 0x009e }
            r10.close()     // Catch:{ IOException -> 0x0097 }
            goto L_0x0089
        L_0x0097:
            r5 = move-exception
            e6.c r6 = f21900y     // Catch:{ all -> 0x009e }
            r6.mo36849d(r5)     // Catch:{ all -> 0x009e }
            goto L_0x0089
        L_0x009e:
            r0 = move-exception
            r10.m30770M()     // Catch:{ all -> 0x016e }
            throw r0     // Catch:{ all -> 0x016e }
        L_0x00a3:
            boolean r2 = r10.mo42569L()     // Catch:{ all -> 0x016e }
            goto L_0x016b
        L_0x00a9:
            r5 = move-exception
            e6.c r6 = f21900y     // Catch:{ all -> 0x0170 }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x0170 }
            java.lang.Object[] r7 = new java.lang.Object[r4]     // Catch:{ all -> 0x0170 }
            r6.mo36847b(r5, r7)     // Catch:{ all -> 0x0170 }
            r10.close()     // Catch:{ IOException -> 0x00b9 }
            goto L_0x00bf
        L_0x00b9:
            r5 = move-exception
            e6.c r6 = f21900y     // Catch:{ all -> 0x0170 }
            r6.mo36849d(r5)     // Catch:{ all -> 0x0170 }
        L_0x00bf:
            boolean r5 = r10.f21915x     // Catch:{ all -> 0x016e }
            if (r5 != 0) goto L_0x00a3
            boolean r5 = r10.mo39669s()     // Catch:{ all -> 0x016e }
            if (r5 == 0) goto L_0x00a3
            boolean r5 = r10.isOpen()     // Catch:{ all -> 0x016e }
            if (r5 == 0) goto L_0x00a3
            r10.f21915x = r1     // Catch:{ all -> 0x016e }
            x5.a r5 = r10.f21907p     // Catch:{ all -> 0x00da }
            r5.mo39557e()     // Catch:{ all -> 0x00da }
        L_0x00d6:
            r10.m30770M()     // Catch:{ all -> 0x016e }
            goto L_0x00a3
        L_0x00da:
            r5 = move-exception
            e6.c r6 = f21900y     // Catch:{ all -> 0x00eb }
            r6.mo36852g(r0, r5)     // Catch:{ all -> 0x00eb }
            r10.close()     // Catch:{ IOException -> 0x00e4 }
            goto L_0x00d6
        L_0x00e4:
            r5 = move-exception
            e6.c r6 = f21900y     // Catch:{ all -> 0x00eb }
            r6.mo36849d(r5)     // Catch:{ all -> 0x00eb }
            goto L_0x00d6
        L_0x00eb:
            r0 = move-exception
            r10.m30770M()     // Catch:{ all -> 0x016e }
            throw r0     // Catch:{ all -> 0x016e }
        L_0x00f0:
            r5 = move-exception
            e6.c r6 = f21900y     // Catch:{ all -> 0x0170 }
            java.lang.String r7 = "EOF"
            r6.mo36854h(r7, r5)     // Catch:{ all -> 0x0170 }
            r10.close()     // Catch:{ IOException -> 0x00fc }
            goto L_0x0102
        L_0x00fc:
            r5 = move-exception
            e6.c r6 = f21900y     // Catch:{ all -> 0x0170 }
            r6.mo36849d(r5)     // Catch:{ all -> 0x0170 }
        L_0x0102:
            boolean r5 = r10.f21915x     // Catch:{ all -> 0x016e }
            if (r5 != 0) goto L_0x00a3
            boolean r5 = r10.mo39669s()     // Catch:{ all -> 0x016e }
            if (r5 == 0) goto L_0x00a3
            boolean r5 = r10.isOpen()     // Catch:{ all -> 0x016e }
            if (r5 == 0) goto L_0x00a3
            r10.f21915x = r1     // Catch:{ all -> 0x016e }
            x5.a r5 = r10.f21907p     // Catch:{ all -> 0x011d }
            r5.mo39557e()     // Catch:{ all -> 0x011d }
        L_0x0119:
            r10.m30770M()     // Catch:{ all -> 0x016e }
            goto L_0x00a3
        L_0x011d:
            r5 = move-exception
            e6.c r6 = f21900y     // Catch:{ all -> 0x012e }
            r6.mo36852g(r0, r5)     // Catch:{ all -> 0x012e }
            r10.close()     // Catch:{ IOException -> 0x0127 }
            goto L_0x0119
        L_0x0127:
            r5 = move-exception
            e6.c r6 = f21900y     // Catch:{ all -> 0x012e }
            r6.mo36849d(r5)     // Catch:{ all -> 0x012e }
            goto L_0x0119
        L_0x012e:
            r0 = move-exception
            r10.m30770M()     // Catch:{ all -> 0x016e }
            throw r0     // Catch:{ all -> 0x016e }
        L_0x0133:
            r5 = move-exception
            e6.c r6 = f21900y     // Catch:{ all -> 0x0170 }
            r6.mo36849d(r5)     // Catch:{ all -> 0x0170 }
            boolean r5 = r10.f21915x     // Catch:{ all -> 0x016e }
            if (r5 != 0) goto L_0x00a3
            boolean r5 = r10.mo39669s()     // Catch:{ all -> 0x016e }
            if (r5 == 0) goto L_0x00a3
            boolean r5 = r10.isOpen()     // Catch:{ all -> 0x016e }
            if (r5 == 0) goto L_0x00a3
            r10.f21915x = r1     // Catch:{ all -> 0x016e }
            x5.a r5 = r10.f21907p     // Catch:{ all -> 0x0155 }
            r5.mo39557e()     // Catch:{ all -> 0x0155 }
        L_0x0150:
            r10.m30770M()     // Catch:{ all -> 0x016e }
            goto L_0x00a3
        L_0x0155:
            r5 = move-exception
            e6.c r6 = f21900y     // Catch:{ all -> 0x0166 }
            r6.mo36852g(r0, r5)     // Catch:{ all -> 0x0166 }
            r10.close()     // Catch:{ IOException -> 0x015f }
            goto L_0x0150
        L_0x015f:
            r5 = move-exception
            e6.c r6 = f21900y     // Catch:{ all -> 0x0166 }
            r6.mo36849d(r5)     // Catch:{ all -> 0x0166 }
            goto L_0x0150
        L_0x0166:
            r0 = move-exception
            r10.m30770M()     // Catch:{ all -> 0x016e }
            throw r0     // Catch:{ all -> 0x016e }
        L_0x016b:
            r2 = r2 ^ r1
            goto L_0x0004
        L_0x016e:
            r0 = move-exception
            goto L_0x01ac
        L_0x0170:
            r5 = move-exception
            boolean r6 = r10.f21915x     // Catch:{ all -> 0x016e }
            if (r6 != 0) goto L_0x01a2
            boolean r6 = r10.mo39669s()     // Catch:{ all -> 0x016e }
            if (r6 == 0) goto L_0x01a2
            boolean r6 = r10.isOpen()     // Catch:{ all -> 0x016e }
            if (r6 == 0) goto L_0x01a2
            r10.f21915x = r1     // Catch:{ all -> 0x016e }
            x5.a r6 = r10.f21907p     // Catch:{ all -> 0x018c }
            r6.mo39557e()     // Catch:{ all -> 0x018c }
        L_0x0188:
            r10.m30770M()     // Catch:{ all -> 0x016e }
            goto L_0x01a2
        L_0x018c:
            r6 = move-exception
            e6.c r7 = f21900y     // Catch:{ all -> 0x019d }
            r7.mo36852g(r0, r6)     // Catch:{ all -> 0x019d }
            r10.close()     // Catch:{ IOException -> 0x0196 }
            goto L_0x0188
        L_0x0196:
            r0 = move-exception
            e6.c r6 = f21900y     // Catch:{ all -> 0x019d }
            r6.mo36849d(r0)     // Catch:{ all -> 0x019d }
            goto L_0x0188
        L_0x019d:
            r0 = move-exception
            r10.m30770M()     // Catch:{ all -> 0x016e }
            throw r0     // Catch:{ all -> 0x016e }
        L_0x01a2:
            boolean r0 = r10.mo42569L()     // Catch:{ all -> 0x016e }
            if (r0 != 0) goto L_0x01aa
            r2 = 1
            goto L_0x01ab
        L_0x01aa:
            r2 = 0
        L_0x01ab:
            throw r5     // Catch:{ all -> 0x016e }
        L_0x01ac:
            if (r2 == 0) goto L_0x01bd
        L_0x01ae:
            boolean r2 = r10.mo42569L()
            r2 = r2 ^ r1
            if (r2 == 0) goto L_0x01bd
            e6.c r2 = f21900y
            java.lang.Object[] r5 = new java.lang.Object[r4]
            r2.mo36847b(r3, r5)
            goto L_0x01ae
        L_0x01bd:
            throw r0
        L_0x01be:
            if (r2 == 0) goto L_0x01cf
        L_0x01c0:
            boolean r0 = r10.mo42569L()
            r0 = r0 ^ r1
            if (r0 == 0) goto L_0x01cf
            e6.c r0 = f21900y
            java.lang.Object[] r2 = new java.lang.Object[r4]
            r0.mo36847b(r3, r2)
            goto L_0x01c0
        L_0x01cf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p229x5.C11989g.mo42563F():void");
    }

    /* renamed from: G */
    public boolean mo42564G() {
        return this.f21914w != 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: H */
    public void mo42565H() {
        if (this.f21914w != 0) {
            this.f21914w = System.currentTimeMillis();
        }
    }

    /* renamed from: I */
    public void mo42566I(long j) {
        this.f21907p.mo42447f(j);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x005d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0088, code lost:
        return;
     */
    /* renamed from: J */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo42567J() {
        /*
            r3 = this;
            monitor-enter(r3)
            java.nio.channels.SelectionKey r0 = r3.f21904m     // Catch:{ all -> 0x0092 }
            r1 = 0
            if (r0 == 0) goto L_0x0089
            boolean r0 = r0.isValid()     // Catch:{ all -> 0x0092 }
            if (r0 != 0) goto L_0x000e
            goto L_0x0089
        L_0x000e:
            boolean r0 = r3.f21911t     // Catch:{ all -> 0x0092 }
            if (r0 != 0) goto L_0x005e
            boolean r2 = r3.f21912u     // Catch:{ all -> 0x0092 }
            if (r2 == 0) goto L_0x0017
            goto L_0x005e
        L_0x0017:
            java.nio.channels.SelectionKey r0 = r3.f21904m     // Catch:{ all -> 0x0092 }
            int r0 = r0.readyOps()     // Catch:{ all -> 0x0092 }
            r2 = 4
            r0 = r0 & r2
            if (r0 != r2) goto L_0x003c
            java.nio.channels.SelectionKey r0 = r3.f21904m     // Catch:{ all -> 0x0092 }
            int r0 = r0.interestOps()     // Catch:{ all -> 0x0092 }
            r0 = r0 & r2
            if (r0 != r2) goto L_0x003c
            java.nio.channels.SelectionKey r0 = r3.f21904m     // Catch:{ all -> 0x0092 }
            int r0 = r0.interestOps()     // Catch:{ all -> 0x0092 }
            r0 = r0 & -5
            r3.f21906o = r0     // Catch:{ all -> 0x0092 }
            java.nio.channels.SelectionKey r2 = r3.f21904m     // Catch:{ all -> 0x0092 }
            r2.interestOps(r0)     // Catch:{ all -> 0x0092 }
            r0 = 1
            r3.f21910s = r0     // Catch:{ all -> 0x0092 }
        L_0x003c:
            boolean r0 = r3.f21908q     // Catch:{ all -> 0x0092 }
            if (r0 == 0) goto L_0x0046
            java.nio.channels.SelectionKey r0 = r3.f21904m     // Catch:{ all -> 0x0092 }
        L_0x0042:
            r0.interestOps(r1)     // Catch:{ all -> 0x0092 }
            goto L_0x005c
        L_0x0046:
            r3.mo39652c()     // Catch:{ all -> 0x0092 }
            boolean r0 = r3.f21908q     // Catch:{ all -> 0x0092 }
            if (r0 == 0) goto L_0x005c
            x5.h$d r0 = r3.f21902k     // Catch:{ all -> 0x0092 }
            x5.h r0 = r0.mo42584j()     // Catch:{ all -> 0x0092 }
            boolean r0 = r0.mo42575R0()     // Catch:{ all -> 0x0092 }
            if (r0 != 0) goto L_0x005c
            java.nio.channels.SelectionKey r0 = r3.f21904m     // Catch:{ all -> 0x0092 }
            goto L_0x0042
        L_0x005c:
            monitor-exit(r3)     // Catch:{ all -> 0x0092 }
            return
        L_0x005e:
            if (r0 == 0) goto L_0x006a
            java.nio.channels.SelectionKey r0 = r3.f21904m     // Catch:{ all -> 0x0092 }
            boolean r0 = r0.isReadable()     // Catch:{ all -> 0x0092 }
            if (r0 == 0) goto L_0x006a
            r3.f21911t = r1     // Catch:{ all -> 0x0092 }
        L_0x006a:
            boolean r0 = r3.f21912u     // Catch:{ all -> 0x0092 }
            if (r0 == 0) goto L_0x0078
            java.nio.channels.SelectionKey r0 = r3.f21904m     // Catch:{ all -> 0x0092 }
            boolean r0 = r0.isWritable()     // Catch:{ all -> 0x0092 }
            if (r0 == 0) goto L_0x0078
            r3.f21912u = r1     // Catch:{ all -> 0x0092 }
        L_0x0078:
            r3.notifyAll()     // Catch:{ all -> 0x0092 }
            java.nio.channels.SelectionKey r0 = r3.f21904m     // Catch:{ all -> 0x0092 }
            r0.interestOps(r1)     // Catch:{ all -> 0x0092 }
            boolean r0 = r3.f21908q     // Catch:{ all -> 0x0092 }
            if (r0 != 0) goto L_0x0087
            r3.m30770M()     // Catch:{ all -> 0x0092 }
        L_0x0087:
            monitor-exit(r3)     // Catch:{ all -> 0x0092 }
            return
        L_0x0089:
            r3.f21911t = r1     // Catch:{ all -> 0x0092 }
            r3.f21912u = r1     // Catch:{ all -> 0x0092 }
            r3.notifyAll()     // Catch:{ all -> 0x0092 }
            monitor-exit(r3)     // Catch:{ all -> 0x0092 }
            return
        L_0x0092:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0092 }
            goto L_0x0096
        L_0x0095:
            throw r0
        L_0x0096:
            goto L_0x0095
        */
        throw new UnsupportedOperationException("Method not decompiled: p229x5.C11989g.mo42567J():void");
    }

    /* renamed from: K */
    public void mo42568K(boolean z) {
        this.f21914w = z ? System.currentTimeMillis() : 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: L */
    public boolean mo42569L() {
        synchronized (this) {
            if (this.f21909r) {
                this.f21909r = false;
                return false;
            }
            this.f21908q = false;
            m30770M();
            return true;
        }
    }

    /* renamed from: b */
    public void mo39651b(C9128e.C9129a aVar, long j) {
        mo42562E().mo42587n(aVar, j);
    }

    /* renamed from: c */
    public void mo39652c() {
        synchronized (this) {
            if (!this.f21908q) {
                this.f21908q = true;
                if (!this.f21903l.mo39648h0(this.f21905n)) {
                    this.f21908q = false;
                    C9003c cVar = f21900y;
                    cVar.mo36847b("Dispatched Failed! " + this + " to " + this.f21903l, new Object[0]);
                    m30770M();
                }
            }
        }
    }

    public void close() {
        if (this.f21901j) {
            try {
                SelectionKey selectionKey = this.f21904m;
                if (selectionKey != null) {
                    selectionKey.cancel();
                }
            } catch (Throwable th) {
                f21900y.mo36849d(th);
            }
        }
        try {
            super.close();
        } catch (IOException e) {
            f21900y.mo36849d(e);
        } catch (Throwable th2) {
            m30770M();
            throw th2;
        }
        m30770M();
    }

    /* renamed from: d */
    public boolean mo39653d() {
        return false;
    }

    /* renamed from: g */
    public C11949j mo39657g() {
        return this.f21907p;
    }

    /* renamed from: i */
    public void mo39659i(int i) {
        this.f21888f = i;
    }

    /* renamed from: j */
    public void mo39661j(C11949j jVar) {
        C11983a aVar = this.f21907p;
        this.f21907p = (C11983a) jVar;
        if (aVar != null && aVar != this.f21907p) {
            this.f21903l.mo39645O0(this, aVar);
        }
    }

    /* renamed from: k */
    public int mo39662k(C11940d dVar, C11940d dVar2, C11940d dVar3) {
        int k = super.mo39662k(dVar, dVar2, dVar3);
        if (k == 0 && ((dVar != null && dVar.mo42408J0()) || ((dVar2 != null && dVar2.mo42408J0()) || (dVar3 != null && dVar3.mo42408J0())))) {
            synchronized (this) {
                this.f21910s = false;
                if (!this.f21908q) {
                    m30770M();
                }
            }
        } else if (k > 0) {
            this.f21910s = true;
            mo42565H();
        }
        return k;
    }

    /* renamed from: n */
    public boolean mo39665n(long j) {
        C11992h.C11996d dVar;
        synchronized (this) {
            if (!mo39669s()) {
                long k = this.f21902k.mo42585k();
                long j2 = k + j;
                boolean G = mo42564G();
                mo42568K(true);
                try {
                    this.f21911t = true;
                    while (!mo39669s() && this.f21911t) {
                        try {
                            m30770M();
                            wait(j > 0 ? j2 - k : 10000);
                            dVar = this.f21902k;
                        } catch (InterruptedException e) {
                            f21900y.mo36856j(e);
                            dVar = this.f21902k;
                        }
                        k = dVar.mo42585k();
                        if (this.f21911t && j > 0 && k >= j2) {
                            this.f21911t = false;
                            mo42568K(G);
                            return false;
                        }
                    }
                    this.f21911t = false;
                    mo42568K(G);
                    return true;
                } catch (Throwable th) {
                    this.f21911t = false;
                    mo42568K(G);
                    throw th;
                }
            } else {
                throw new EofException();
            }
        }
    }

    public String toString() {
        String str;
        StringBuilder sb;
        SelectionKey selectionKey = this.f21904m;
        String str2 = "";
        if (selectionKey == null) {
            sb = new StringBuilder();
            sb.append(str2);
            str = Constants.ACCEPT_TIME_SEPARATOR_SERVER;
        } else if (selectionKey.isValid()) {
            if (selectionKey.isReadable()) {
                str2 = str2 + C11627r.f21359c0;
            }
            if (selectionKey.isWritable()) {
                sb = new StringBuilder();
                sb.append(str2);
                str = C11766w.f21573C;
            }
            return String.format("SCEP@%x{l(%s)<->r(%s),d=%b,open=%b,ishut=%b,oshut=%b,rb=%b,wb=%b,w=%b,i=%d%s}-{%s}", new Object[]{Integer.valueOf(hashCode()), this.f21885c.getRemoteSocketAddress(), this.f21885c.getLocalSocketAddress(), Boolean.valueOf(this.f21908q), Boolean.valueOf(isOpen()), Boolean.valueOf(mo39669s()), Boolean.valueOf(mo39668r()), Boolean.valueOf(this.f21911t), Boolean.valueOf(this.f21912u), Boolean.valueOf(this.f21910s), Integer.valueOf(this.f21906o), str2, this.f21907p});
        } else {
            sb = new StringBuilder();
            sb.append(str2);
            str = "!";
        }
        sb.append(str);
        str2 = sb.toString();
        return String.format("SCEP@%x{l(%s)<->r(%s),d=%b,open=%b,ishut=%b,oshut=%b,rb=%b,wb=%b,w=%b,i=%d%s}-{%s}", new Object[]{Integer.valueOf(hashCode()), this.f21885c.getRemoteSocketAddress(), this.f21885c.getLocalSocketAddress(), Boolean.valueOf(this.f21908q), Boolean.valueOf(isOpen()), Boolean.valueOf(mo39669s()), Boolean.valueOf(mo39668r()), Boolean.valueOf(this.f21911t), Boolean.valueOf(this.f21912u), Boolean.valueOf(this.f21910s), Integer.valueOf(this.f21906o), str2, this.f21907p});
    }

    /* renamed from: u */
    public boolean mo39672u(long j) {
        C11992h.C11996d dVar;
        synchronized (this) {
            if (!mo39668r()) {
                long k = this.f21902k.mo42585k();
                long j2 = k + j;
                boolean G = mo42564G();
                mo42568K(true);
                try {
                    this.f21912u = true;
                    while (this.f21912u && !mo39668r()) {
                        try {
                            m30770M();
                            wait(j > 0 ? j2 - k : 10000);
                            dVar = this.f21902k;
                        } catch (InterruptedException e) {
                            f21900y.mo36856j(e);
                            dVar = this.f21902k;
                        }
                        k = dVar.mo42585k();
                        if (this.f21912u && j > 0 && k >= j2) {
                            this.f21912u = false;
                            mo42568K(G);
                            return false;
                        }
                    }
                    this.f21912u = false;
                    mo42568K(G);
                    return true;
                } catch (Throwable th) {
                    this.f21912u = false;
                    mo42568K(G);
                    throw th;
                }
            } else {
                throw new EofException();
            }
        }
    }

    /* renamed from: v */
    public void mo39673v(C9128e.C9129a aVar) {
        mo42562E().mo42580e(aVar);
    }

    /* renamed from: x */
    public int mo39674x(C11940d dVar) {
        int x = super.mo39674x(dVar);
        if (x == 0 && dVar != null && dVar.mo42408J0()) {
            synchronized (this) {
                this.f21910s = false;
                if (!this.f21908q) {
                    m30770M();
                }
            }
        } else if (x > 0) {
            this.f21910s = true;
            mo42565H();
        }
        return x;
    }

    /* renamed from: z */
    public int mo26552z(C11940d dVar) {
        int z = super.mo26552z(dVar);
        if (z > 0) {
            mo42565H();
        }
        return z;
    }
}
