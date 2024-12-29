package p164h.p211a.p212a.p217d.p219v;

import com.xiaomi.mipush.sdk.Constants;
import com.yeelight.yeelib.p150c.p183m.C7200r;
import com.yeelight.yeelib.p150c.p183m.C7380w;
import java.io.IOException;
import java.nio.channels.SelectableChannel;
import java.nio.channels.SelectionKey;
import java.nio.channels.SocketChannel;
import java.util.Locale;
import p164h.p211a.p212a.p217d.C10928d;
import p164h.p211a.p212a.p217d.C10929e;
import p164h.p211a.p212a.p217d.C10940l;
import p164h.p211a.p212a.p217d.C10941m;
import p164h.p211a.p212a.p217d.C10943o;
import p164h.p211a.p212a.p217d.p219v.C10963h;
import p164h.p211a.p212a.p228h.p232d0.C11115e;
import p164h.p211a.p212a.p228h.p234y.C11156b;
import p164h.p211a.p212a.p228h.p234y.C11158c;

/* renamed from: h.a.a.d.v.g */
public class C10960g extends C10955b implements C10928d, C10940l {

    /* renamed from: y */
    public static final C11158c f21368y = C11156b.m29016b("org.eclipse.jetty.io.nio");

    /* renamed from: j */
    private final boolean f21369j = System.getProperty("os.name").toLowerCase(Locale.ENGLISH).contains("win");

    /* renamed from: k */
    private final C10963h.C10967d f21370k;

    /* renamed from: l */
    private final C10963h f21371l;

    /* renamed from: m */
    private SelectionKey f21372m;

    /* renamed from: n */
    private final Runnable f21373n = new C10961a();

    /* renamed from: o */
    private int f21374o;

    /* renamed from: p */
    private volatile C10954a f21375p;

    /* renamed from: q */
    private boolean f21376q = false;

    /* renamed from: r */
    private boolean f21377r = false;

    /* renamed from: s */
    private volatile boolean f21378s = true;

    /* renamed from: t */
    private boolean f21379t;

    /* renamed from: u */
    private boolean f21380u;

    /* renamed from: v */
    private boolean f21381v;

    /* renamed from: w */
    private volatile long f21382w;

    /* renamed from: x */
    private boolean f21383x;

    /* renamed from: h.a.a.d.v.g$a */
    class C10961a implements Runnable {
        C10961a() {
        }

        public void run() {
            C10960g.this.mo34677F();
        }
    }

    /* renamed from: h.a.a.d.v.g$b */
    class C10962b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ long f21385a;

        C10962b(long j) {
            this.f21385a = j;
        }

        public void run() {
            try {
                C10960g.this.mo34680I(this.f21385a);
            } finally {
                C10960g.this.mo34682K(true);
            }
        }
    }

    public C10960g(SocketChannel socketChannel, C10963h.C10967d dVar, SelectionKey selectionKey, int i) {
        super(socketChannel, i);
        this.f21371l = dVar.mo34698j();
        this.f21370k = dVar;
        this.f21376q = false;
        this.f21377r = false;
        this.f21381v = true;
        this.f21372m = selectionKey;
        mo34682K(true);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0026 A[Catch:{ Exception -> 0x0063 }] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x003a A[ADDED_TO_REGION, Catch:{ Exception -> 0x0063 }] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0047 A[ADDED_TO_REGION, Catch:{ Exception -> 0x0063 }] */
    /* renamed from: M */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m27809M() {
        /*
            r6 = this;
            monitor-enter(r6)
            java.nio.channels.ByteChannel r0 = r6.mo34671z()     // Catch:{ all -> 0x0080 }
            boolean r0 = r0.isOpen()     // Catch:{ all -> 0x0080 }
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L_0x006c
            boolean r0 = r6.f21379t     // Catch:{ all -> 0x0080 }
            if (r0 != 0) goto L_0x0021
            boolean r0 = r6.f21376q     // Catch:{ all -> 0x0080 }
            if (r0 != 0) goto L_0x001f
            h.a.a.d.v.a r0 = r6.f21375p     // Catch:{ all -> 0x0080 }
            boolean r0 = r0.mo34186d()     // Catch:{ all -> 0x0080 }
            if (r0 != 0) goto L_0x001f
            goto L_0x0021
        L_0x001f:
            r0 = 0
            goto L_0x0022
        L_0x0021:
            r0 = 1
        L_0x0022:
            boolean r4 = r6.f21380u     // Catch:{ all -> 0x0080 }
            if (r4 != 0) goto L_0x0031
            boolean r4 = r6.f21376q     // Catch:{ all -> 0x0080 }
            if (r4 != 0) goto L_0x002f
            boolean r4 = r6.f21378s     // Catch:{ all -> 0x0080 }
            if (r4 != 0) goto L_0x002f
            goto L_0x0031
        L_0x002f:
            r4 = 0
            goto L_0x0032
        L_0x0031:
            r4 = 1
        L_0x0032:
            java.net.Socket r5 = r6.f21353c     // Catch:{ all -> 0x0080 }
            boolean r5 = r5.isInputShutdown()     // Catch:{ all -> 0x0080 }
            if (r5 != 0) goto L_0x003e
            if (r0 == 0) goto L_0x003e
            r0 = 1
            goto L_0x003f
        L_0x003e:
            r0 = 0
        L_0x003f:
            java.net.Socket r5 = r6.f21353c     // Catch:{ all -> 0x0080 }
            boolean r5 = r5.isOutputShutdown()     // Catch:{ all -> 0x0080 }
            if (r5 != 0) goto L_0x004b
            if (r4 == 0) goto L_0x004b
            r4 = 4
            goto L_0x004c
        L_0x004b:
            r4 = 0
        L_0x004c:
            r0 = r0 | r4
            r6.f21374o = r0     // Catch:{ all -> 0x0080 }
            java.nio.channels.SelectionKey r0 = r6.f21372m     // Catch:{ Exception -> 0x0063 }
            if (r0 == 0) goto L_0x006c
            java.nio.channels.SelectionKey r0 = r6.f21372m     // Catch:{ Exception -> 0x0063 }
            boolean r0 = r0.isValid()     // Catch:{ Exception -> 0x0063 }
            if (r0 == 0) goto L_0x006c
            java.nio.channels.SelectionKey r0 = r6.f21372m     // Catch:{ Exception -> 0x0063 }
            int r0 = r0.interestOps()     // Catch:{ Exception -> 0x0063 }
            r1 = r0
            goto L_0x006c
        L_0x0063:
            r0 = move-exception
            r4 = 0
            r6.f21372m = r4     // Catch:{ all -> 0x0080 }
            h.a.a.h.y.c r4 = f21368y     // Catch:{ all -> 0x0080 }
            r4.mo35488d(r0)     // Catch:{ all -> 0x0080 }
        L_0x006c:
            int r0 = r6.f21374o     // Catch:{ all -> 0x0080 }
            if (r0 == r1) goto L_0x0071
            goto L_0x0072
        L_0x0071:
            r2 = 0
        L_0x0072:
            monitor-exit(r6)     // Catch:{ all -> 0x0080 }
            if (r2 == 0) goto L_0x007f
            h.a.a.d.v.h$d r0 = r6.f21370k
            r0.mo34692c(r6)
            h.a.a.d.v.h$d r0 = r6.f21370k
            r0.mo34703p()
        L_0x007f:
            return
        L_0x0080:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0080 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p164h.p211a.p212a.p217d.p219v.C10960g.m27809M():void");
    }

    /* renamed from: C */
    public void mo34674C(long j) {
        long j2 = this.f21382w;
        if (j2 != 0 && this.f21356f > 0) {
            long j3 = j - j2;
            if (j3 > ((long) this.f21356f)) {
                mo34682K(false);
                this.f21371l.mo34347e0(new C10962b(j3));
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D */
    public void mo34675D() {
        SelectionKey selectionKey;
        synchronized (this) {
            int i = 0;
            if (mo34671z().isOpen()) {
                if (this.f21374o > 0) {
                    if (this.f21372m != null) {
                        if (this.f21372m.isValid()) {
                            selectionKey = this.f21372m;
                            i = this.f21374o;
                        }
                    }
                    if (((SelectableChannel) mo34671z()).isRegistered()) {
                        m27809M();
                    } else {
                        try {
                            this.f21372m = ((SelectableChannel) mo34671z()).register(this.f21370k.mo34700l(), this.f21374o, this);
                        } catch (Exception e) {
                            f21368y.mo35488d(e);
                            if (this.f21372m != null && this.f21372m.isValid()) {
                                this.f21372m.cancel();
                            }
                            if (this.f21381v) {
                                this.f21370k.mo34695g(this);
                            }
                            this.f21381v = false;
                        }
                    }
                } else if (this.f21372m != null && this.f21372m.isValid()) {
                    selectionKey = this.f21372m;
                }
                selectionKey.interestOps(i);
            } else {
                if (this.f21372m != null && this.f21372m.isValid()) {
                    this.f21372m.cancel();
                }
                if (this.f21381v) {
                    this.f21381v = false;
                    this.f21370k.mo34695g(this);
                }
            }
            this.f21372m = null;
        }
    }

    /* renamed from: E */
    public C10963h.C10967d mo34676E() {
        return this.f21370k;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:184:0x01a8 A[Catch:{ all -> 0x018c, ClosedChannelException -> 0x0133, o -> 0x00f0, IOException -> 0x00a9, all -> 0x0060, all -> 0x0170, all -> 0x016e, all -> 0x008d }] */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x01aa A[Catch:{ all -> 0x018c, ClosedChannelException -> 0x0133, o -> 0x00f0, IOException -> 0x00a9, all -> 0x0060, all -> 0x0170, all -> 0x016e, all -> 0x008d }] */
    /* renamed from: F */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo34677F() {
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
            h.a.a.d.v.a r5 = r10.f21375p     // Catch:{ ClosedChannelException -> 0x0133, o -> 0x00f0, IOException -> 0x00a9, all -> 0x0060 }
            h.a.a.d.m r5 = r5.mo34225c()     // Catch:{ ClosedChannelException -> 0x0133, o -> 0x00f0, IOException -> 0x00a9, all -> 0x0060 }
            h.a.a.d.v.a r5 = (p164h.p211a.p212a.p217d.p219v.C10954a) r5     // Catch:{ ClosedChannelException -> 0x0133, o -> 0x00f0, IOException -> 0x00a9, all -> 0x0060 }
            h.a.a.d.v.a r6 = r10.f21375p     // Catch:{ ClosedChannelException -> 0x0133, o -> 0x00f0, IOException -> 0x00a9, all -> 0x0060 }
            if (r5 == r6) goto L_0x002f
            h.a.a.h.y.c r6 = f21368y     // Catch:{ ClosedChannelException -> 0x0133, o -> 0x00f0, IOException -> 0x00a9, all -> 0x0060 }
            java.lang.String r7 = "{} replaced {}"
            r8 = 2
            java.lang.Object[] r8 = new java.lang.Object[r8]     // Catch:{ ClosedChannelException -> 0x0133, o -> 0x00f0, IOException -> 0x00a9, all -> 0x0060 }
            r8[r4] = r5     // Catch:{ ClosedChannelException -> 0x0133, o -> 0x00f0, IOException -> 0x00a9, all -> 0x0060 }
            h.a.a.d.v.a r9 = r10.f21375p     // Catch:{ ClosedChannelException -> 0x0133, o -> 0x00f0, IOException -> 0x00a9, all -> 0x0060 }
            r8[r1] = r9     // Catch:{ ClosedChannelException -> 0x0133, o -> 0x00f0, IOException -> 0x00a9, all -> 0x0060 }
            r6.mo35489e(r7, r8)     // Catch:{ ClosedChannelException -> 0x0133, o -> 0x00f0, IOException -> 0x00a9, all -> 0x0060 }
            h.a.a.d.v.a r6 = r10.f21375p     // Catch:{ ClosedChannelException -> 0x0133, o -> 0x00f0, IOException -> 0x00a9, all -> 0x0060 }
            r10.f21375p = r5     // Catch:{ ClosedChannelException -> 0x0133, o -> 0x00f0, IOException -> 0x00a9, all -> 0x0060 }
            h.a.a.d.v.h r5 = r10.f21371l     // Catch:{ ClosedChannelException -> 0x0133, o -> 0x00f0, IOException -> 0x00a9, all -> 0x0060 }
            r5.mo34344J0(r10, r6)     // Catch:{ ClosedChannelException -> 0x0133, o -> 0x00f0, IOException -> 0x00a9, all -> 0x0060 }
            goto L_0x0009
        L_0x002f:
            boolean r5 = r10.f21383x     // Catch:{ all -> 0x016e }
            if (r5 != 0) goto L_0x00a3
            boolean r5 = r10.mo34369s()     // Catch:{ all -> 0x016e }
            if (r5 == 0) goto L_0x00a3
            boolean r5 = r10.isOpen()     // Catch:{ all -> 0x016e }
            if (r5 == 0) goto L_0x00a3
            r10.f21383x = r1     // Catch:{ all -> 0x016e }
            h.a.a.d.v.a r5 = r10.f21375p     // Catch:{ all -> 0x004a }
            r5.mo34226e()     // Catch:{ all -> 0x004a }
        L_0x0046:
            r10.m27809M()     // Catch:{ all -> 0x016e }
            goto L_0x00a3
        L_0x004a:
            r5 = move-exception
            h.a.a.h.y.c r6 = f21368y     // Catch:{ all -> 0x005b }
            r6.mo35492h(r0, r5)     // Catch:{ all -> 0x005b }
            r10.close()     // Catch:{ IOException -> 0x0054 }
            goto L_0x0046
        L_0x0054:
            r5 = move-exception
            h.a.a.h.y.c r6 = f21368y     // Catch:{ all -> 0x005b }
            r6.mo35488d(r5)     // Catch:{ all -> 0x005b }
            goto L_0x0046
        L_0x005b:
            r0 = move-exception
            r10.m27809M()     // Catch:{ all -> 0x016e }
            throw r0     // Catch:{ all -> 0x016e }
        L_0x0060:
            r5 = move-exception
            h.a.a.h.y.c r6 = f21368y     // Catch:{ all -> 0x0170 }
            java.lang.String r7 = "handle failed"
            r6.mo35492h(r7, r5)     // Catch:{ all -> 0x0170 }
            r10.close()     // Catch:{ IOException -> 0x006c }
            goto L_0x0072
        L_0x006c:
            r5 = move-exception
            h.a.a.h.y.c r6 = f21368y     // Catch:{ all -> 0x0170 }
            r6.mo35488d(r5)     // Catch:{ all -> 0x0170 }
        L_0x0072:
            boolean r5 = r10.f21383x     // Catch:{ all -> 0x016e }
            if (r5 != 0) goto L_0x00a3
            boolean r5 = r10.mo34369s()     // Catch:{ all -> 0x016e }
            if (r5 == 0) goto L_0x00a3
            boolean r5 = r10.isOpen()     // Catch:{ all -> 0x016e }
            if (r5 == 0) goto L_0x00a3
            r10.f21383x = r1     // Catch:{ all -> 0x016e }
            h.a.a.d.v.a r5 = r10.f21375p     // Catch:{ all -> 0x008d }
            r5.mo34226e()     // Catch:{ all -> 0x008d }
        L_0x0089:
            r10.m27809M()     // Catch:{ all -> 0x016e }
            goto L_0x00a3
        L_0x008d:
            r5 = move-exception
            h.a.a.h.y.c r6 = f21368y     // Catch:{ all -> 0x009e }
            r6.mo35492h(r0, r5)     // Catch:{ all -> 0x009e }
            r10.close()     // Catch:{ IOException -> 0x0097 }
            goto L_0x0089
        L_0x0097:
            r5 = move-exception
            h.a.a.h.y.c r6 = f21368y     // Catch:{ all -> 0x009e }
            r6.mo35488d(r5)     // Catch:{ all -> 0x009e }
            goto L_0x0089
        L_0x009e:
            r0 = move-exception
            r10.m27809M()     // Catch:{ all -> 0x016e }
            throw r0     // Catch:{ all -> 0x016e }
        L_0x00a3:
            boolean r2 = r10.mo34683L()     // Catch:{ all -> 0x016e }
            goto L_0x016b
        L_0x00a9:
            r5 = move-exception
            h.a.a.h.y.c r6 = f21368y     // Catch:{ all -> 0x0170 }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x0170 }
            java.lang.Object[] r7 = new java.lang.Object[r4]     // Catch:{ all -> 0x0170 }
            r6.mo35486b(r5, r7)     // Catch:{ all -> 0x0170 }
            r10.close()     // Catch:{ IOException -> 0x00b9 }
            goto L_0x00bf
        L_0x00b9:
            r5 = move-exception
            h.a.a.h.y.c r6 = f21368y     // Catch:{ all -> 0x0170 }
            r6.mo35488d(r5)     // Catch:{ all -> 0x0170 }
        L_0x00bf:
            boolean r5 = r10.f21383x     // Catch:{ all -> 0x016e }
            if (r5 != 0) goto L_0x00a3
            boolean r5 = r10.mo34369s()     // Catch:{ all -> 0x016e }
            if (r5 == 0) goto L_0x00a3
            boolean r5 = r10.isOpen()     // Catch:{ all -> 0x016e }
            if (r5 == 0) goto L_0x00a3
            r10.f21383x = r1     // Catch:{ all -> 0x016e }
            h.a.a.d.v.a r5 = r10.f21375p     // Catch:{ all -> 0x00da }
            r5.mo34226e()     // Catch:{ all -> 0x00da }
        L_0x00d6:
            r10.m27809M()     // Catch:{ all -> 0x016e }
            goto L_0x00a3
        L_0x00da:
            r5 = move-exception
            h.a.a.h.y.c r6 = f21368y     // Catch:{ all -> 0x00eb }
            r6.mo35492h(r0, r5)     // Catch:{ all -> 0x00eb }
            r10.close()     // Catch:{ IOException -> 0x00e4 }
            goto L_0x00d6
        L_0x00e4:
            r5 = move-exception
            h.a.a.h.y.c r6 = f21368y     // Catch:{ all -> 0x00eb }
            r6.mo35488d(r5)     // Catch:{ all -> 0x00eb }
            goto L_0x00d6
        L_0x00eb:
            r0 = move-exception
            r10.m27809M()     // Catch:{ all -> 0x016e }
            throw r0     // Catch:{ all -> 0x016e }
        L_0x00f0:
            r5 = move-exception
            h.a.a.h.y.c r6 = f21368y     // Catch:{ all -> 0x0170 }
            java.lang.String r7 = "EOF"
            r6.mo35493i(r7, r5)     // Catch:{ all -> 0x0170 }
            r10.close()     // Catch:{ IOException -> 0x00fc }
            goto L_0x0102
        L_0x00fc:
            r5 = move-exception
            h.a.a.h.y.c r6 = f21368y     // Catch:{ all -> 0x0170 }
            r6.mo35488d(r5)     // Catch:{ all -> 0x0170 }
        L_0x0102:
            boolean r5 = r10.f21383x     // Catch:{ all -> 0x016e }
            if (r5 != 0) goto L_0x00a3
            boolean r5 = r10.mo34369s()     // Catch:{ all -> 0x016e }
            if (r5 == 0) goto L_0x00a3
            boolean r5 = r10.isOpen()     // Catch:{ all -> 0x016e }
            if (r5 == 0) goto L_0x00a3
            r10.f21383x = r1     // Catch:{ all -> 0x016e }
            h.a.a.d.v.a r5 = r10.f21375p     // Catch:{ all -> 0x011d }
            r5.mo34226e()     // Catch:{ all -> 0x011d }
        L_0x0119:
            r10.m27809M()     // Catch:{ all -> 0x016e }
            goto L_0x00a3
        L_0x011d:
            r5 = move-exception
            h.a.a.h.y.c r6 = f21368y     // Catch:{ all -> 0x012e }
            r6.mo35492h(r0, r5)     // Catch:{ all -> 0x012e }
            r10.close()     // Catch:{ IOException -> 0x0127 }
            goto L_0x0119
        L_0x0127:
            r5 = move-exception
            h.a.a.h.y.c r6 = f21368y     // Catch:{ all -> 0x012e }
            r6.mo35488d(r5)     // Catch:{ all -> 0x012e }
            goto L_0x0119
        L_0x012e:
            r0 = move-exception
            r10.m27809M()     // Catch:{ all -> 0x016e }
            throw r0     // Catch:{ all -> 0x016e }
        L_0x0133:
            r5 = move-exception
            h.a.a.h.y.c r6 = f21368y     // Catch:{ all -> 0x0170 }
            r6.mo35488d(r5)     // Catch:{ all -> 0x0170 }
            boolean r5 = r10.f21383x     // Catch:{ all -> 0x016e }
            if (r5 != 0) goto L_0x00a3
            boolean r5 = r10.mo34369s()     // Catch:{ all -> 0x016e }
            if (r5 == 0) goto L_0x00a3
            boolean r5 = r10.isOpen()     // Catch:{ all -> 0x016e }
            if (r5 == 0) goto L_0x00a3
            r10.f21383x = r1     // Catch:{ all -> 0x016e }
            h.a.a.d.v.a r5 = r10.f21375p     // Catch:{ all -> 0x0155 }
            r5.mo34226e()     // Catch:{ all -> 0x0155 }
        L_0x0150:
            r10.m27809M()     // Catch:{ all -> 0x016e }
            goto L_0x00a3
        L_0x0155:
            r5 = move-exception
            h.a.a.h.y.c r6 = f21368y     // Catch:{ all -> 0x0166 }
            r6.mo35492h(r0, r5)     // Catch:{ all -> 0x0166 }
            r10.close()     // Catch:{ IOException -> 0x015f }
            goto L_0x0150
        L_0x015f:
            r5 = move-exception
            h.a.a.h.y.c r6 = f21368y     // Catch:{ all -> 0x0166 }
            r6.mo35488d(r5)     // Catch:{ all -> 0x0166 }
            goto L_0x0150
        L_0x0166:
            r0 = move-exception
            r10.m27809M()     // Catch:{ all -> 0x016e }
            throw r0     // Catch:{ all -> 0x016e }
        L_0x016b:
            r2 = r2 ^ r1
            goto L_0x0004
        L_0x016e:
            r0 = move-exception
            goto L_0x01ac
        L_0x0170:
            r5 = move-exception
            boolean r6 = r10.f21383x     // Catch:{ all -> 0x016e }
            if (r6 != 0) goto L_0x01a2
            boolean r6 = r10.mo34369s()     // Catch:{ all -> 0x016e }
            if (r6 == 0) goto L_0x01a2
            boolean r6 = r10.isOpen()     // Catch:{ all -> 0x016e }
            if (r6 == 0) goto L_0x01a2
            r10.f21383x = r1     // Catch:{ all -> 0x016e }
            h.a.a.d.v.a r6 = r10.f21375p     // Catch:{ all -> 0x018c }
            r6.mo34226e()     // Catch:{ all -> 0x018c }
        L_0x0188:
            r10.m27809M()     // Catch:{ all -> 0x016e }
            goto L_0x01a2
        L_0x018c:
            r6 = move-exception
            h.a.a.h.y.c r7 = f21368y     // Catch:{ all -> 0x019d }
            r7.mo35492h(r0, r6)     // Catch:{ all -> 0x019d }
            r10.close()     // Catch:{ IOException -> 0x0196 }
            goto L_0x0188
        L_0x0196:
            r0 = move-exception
            h.a.a.h.y.c r6 = f21368y     // Catch:{ all -> 0x019d }
            r6.mo35488d(r0)     // Catch:{ all -> 0x019d }
            goto L_0x0188
        L_0x019d:
            r0 = move-exception
            r10.m27809M()     // Catch:{ all -> 0x016e }
            throw r0     // Catch:{ all -> 0x016e }
        L_0x01a2:
            boolean r0 = r10.mo34683L()     // Catch:{ all -> 0x016e }
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
            boolean r2 = r10.mo34683L()
            r2 = r2 ^ r1
            if (r2 == 0) goto L_0x01bd
            h.a.a.h.y.c r2 = f21368y
            java.lang.Object[] r5 = new java.lang.Object[r4]
            r2.mo35486b(r3, r5)
            goto L_0x01ae
        L_0x01bd:
            throw r0
        L_0x01be:
            if (r2 == 0) goto L_0x01cf
        L_0x01c0:
            boolean r0 = r10.mo34683L()
            r0 = r0 ^ r1
            if (r0 == 0) goto L_0x01cf
            h.a.a.h.y.c r0 = f21368y
            java.lang.Object[] r2 = new java.lang.Object[r4]
            r0.mo35486b(r3, r2)
            goto L_0x01c0
        L_0x01cf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p164h.p211a.p212a.p217d.p219v.C10960g.mo34677F():void");
    }

    /* renamed from: G */
    public boolean mo34678G() {
        return this.f21382w != 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: H */
    public void mo34679H() {
        if (this.f21382w != 0) {
            this.f21382w = System.currentTimeMillis();
        }
    }

    /* renamed from: I */
    public void mo34680I(long j) {
        this.f21375p.mo34604f(j);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x005f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x008c, code lost:
        return;
     */
    /* renamed from: J */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo34681J() {
        /*
            r3 = this;
            monitor-enter(r3)
            java.nio.channels.SelectionKey r0 = r3.f21372m     // Catch:{ all -> 0x0096 }
            r1 = 0
            if (r0 == 0) goto L_0x008d
            java.nio.channels.SelectionKey r0 = r3.f21372m     // Catch:{ all -> 0x0096 }
            boolean r0 = r0.isValid()     // Catch:{ all -> 0x0096 }
            if (r0 != 0) goto L_0x0010
            goto L_0x008d
        L_0x0010:
            boolean r0 = r3.f21379t     // Catch:{ all -> 0x0096 }
            if (r0 != 0) goto L_0x0060
            boolean r0 = r3.f21380u     // Catch:{ all -> 0x0096 }
            if (r0 == 0) goto L_0x0019
            goto L_0x0060
        L_0x0019:
            java.nio.channels.SelectionKey r0 = r3.f21372m     // Catch:{ all -> 0x0096 }
            int r0 = r0.readyOps()     // Catch:{ all -> 0x0096 }
            r2 = 4
            r0 = r0 & r2
            if (r0 != r2) goto L_0x003e
            java.nio.channels.SelectionKey r0 = r3.f21372m     // Catch:{ all -> 0x0096 }
            int r0 = r0.interestOps()     // Catch:{ all -> 0x0096 }
            r0 = r0 & r2
            if (r0 != r2) goto L_0x003e
            java.nio.channels.SelectionKey r0 = r3.f21372m     // Catch:{ all -> 0x0096 }
            int r0 = r0.interestOps()     // Catch:{ all -> 0x0096 }
            r0 = r0 & -5
            r3.f21374o = r0     // Catch:{ all -> 0x0096 }
            java.nio.channels.SelectionKey r2 = r3.f21372m     // Catch:{ all -> 0x0096 }
            r2.interestOps(r0)     // Catch:{ all -> 0x0096 }
            r0 = 1
            r3.f21378s = r0     // Catch:{ all -> 0x0096 }
        L_0x003e:
            boolean r0 = r3.f21376q     // Catch:{ all -> 0x0096 }
            if (r0 == 0) goto L_0x0048
            java.nio.channels.SelectionKey r0 = r3.f21372m     // Catch:{ all -> 0x0096 }
        L_0x0044:
            r0.interestOps(r1)     // Catch:{ all -> 0x0096 }
            goto L_0x005e
        L_0x0048:
            r3.mo34350c()     // Catch:{ all -> 0x0096 }
            boolean r0 = r3.f21376q     // Catch:{ all -> 0x0096 }
            if (r0 == 0) goto L_0x005e
            h.a.a.d.v.h$d r0 = r3.f21370k     // Catch:{ all -> 0x0096 }
            h.a.a.d.v.h r0 = r0.mo34698j()     // Catch:{ all -> 0x0096 }
            boolean r0 = r0.mo34689M0()     // Catch:{ all -> 0x0096 }
            if (r0 != 0) goto L_0x005e
            java.nio.channels.SelectionKey r0 = r3.f21372m     // Catch:{ all -> 0x0096 }
            goto L_0x0044
        L_0x005e:
            monitor-exit(r3)     // Catch:{ all -> 0x0096 }
            return
        L_0x0060:
            boolean r0 = r3.f21379t     // Catch:{ all -> 0x0096 }
            if (r0 == 0) goto L_0x006e
            java.nio.channels.SelectionKey r0 = r3.f21372m     // Catch:{ all -> 0x0096 }
            boolean r0 = r0.isReadable()     // Catch:{ all -> 0x0096 }
            if (r0 == 0) goto L_0x006e
            r3.f21379t = r1     // Catch:{ all -> 0x0096 }
        L_0x006e:
            boolean r0 = r3.f21380u     // Catch:{ all -> 0x0096 }
            if (r0 == 0) goto L_0x007c
            java.nio.channels.SelectionKey r0 = r3.f21372m     // Catch:{ all -> 0x0096 }
            boolean r0 = r0.isWritable()     // Catch:{ all -> 0x0096 }
            if (r0 == 0) goto L_0x007c
            r3.f21380u = r1     // Catch:{ all -> 0x0096 }
        L_0x007c:
            r3.notifyAll()     // Catch:{ all -> 0x0096 }
            java.nio.channels.SelectionKey r0 = r3.f21372m     // Catch:{ all -> 0x0096 }
            r0.interestOps(r1)     // Catch:{ all -> 0x0096 }
            boolean r0 = r3.f21376q     // Catch:{ all -> 0x0096 }
            if (r0 != 0) goto L_0x008b
            r3.m27809M()     // Catch:{ all -> 0x0096 }
        L_0x008b:
            monitor-exit(r3)     // Catch:{ all -> 0x0096 }
            return
        L_0x008d:
            r3.f21379t = r1     // Catch:{ all -> 0x0096 }
            r3.f21380u = r1     // Catch:{ all -> 0x0096 }
            r3.notifyAll()     // Catch:{ all -> 0x0096 }
            monitor-exit(r3)     // Catch:{ all -> 0x0096 }
            return
        L_0x0096:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0096 }
            goto L_0x009a
        L_0x0099:
            throw r0
        L_0x009a:
            goto L_0x0099
        */
        throw new UnsupportedOperationException("Method not decompiled: p164h.p211a.p212a.p217d.p219v.C10960g.mo34681J():void");
    }

    /* renamed from: K */
    public void mo34682K(boolean z) {
        this.f21382w = z ? System.currentTimeMillis() : 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: L */
    public boolean mo34683L() {
        synchronized (this) {
            if (this.f21377r) {
                this.f21377r = false;
                return false;
            }
            this.f21376q = false;
            m27809M();
            return true;
        }
    }

    /* renamed from: b */
    public void mo34349b(C11115e.C11116a aVar, long j) {
        mo34676E().mo34701n(aVar, j);
    }

    /* renamed from: c */
    public void mo34350c() {
        synchronized (this) {
            if (!this.f21376q) {
                this.f21376q = true;
                if (!this.f21371l.mo34347e0(this.f21373n)) {
                    this.f21376q = false;
                    C11158c cVar = f21368y;
                    cVar.mo35486b("Dispatched Failed! " + this + " to " + this.f21371l, new Object[0]);
                    m27809M();
                }
            }
        }
    }

    public void close() {
        if (this.f21369j) {
            try {
                SelectionKey selectionKey = this.f21372m;
                if (selectionKey != null) {
                    selectionKey.cancel();
                }
            } catch (Throwable th) {
                f21368y.mo35488d(th);
            }
        }
        try {
            super.close();
        } catch (IOException e) {
            f21368y.mo35488d(e);
        } catch (Throwable th2) {
            m27809M();
            throw th2;
        }
        m27809M();
    }

    /* renamed from: d */
    public boolean mo34352d() {
        return false;
    }

    /* renamed from: e */
    public void mo34353e(C11115e.C11116a aVar) {
        mo34676E().mo34694e(aVar);
    }

    /* renamed from: h */
    public C10941m mo34357h() {
        return this.f21375p;
    }

    /* renamed from: j */
    public void mo34360j(int i) {
        this.f21356f = i;
    }

    /* renamed from: k */
    public void mo34361k(C10941m mVar) {
        C10954a aVar = this.f21375p;
        this.f21375p = (C10954a) mVar;
        if (aVar != null && aVar != this.f21375p) {
            this.f21371l.mo34344J0(this, aVar);
        }
    }

    /* renamed from: n */
    public boolean mo34364n(long j) {
        C10963h.C10967d dVar;
        synchronized (this) {
            if (!mo34369s()) {
                long k = this.f21370k.mo34699k();
                long j2 = k + j;
                boolean G = mo34678G();
                mo34682K(true);
                try {
                    this.f21379t = true;
                    while (!mo34369s() && this.f21379t) {
                        try {
                            m27809M();
                            wait(j > 0 ? j2 - k : 10000);
                            dVar = this.f21370k;
                        } catch (InterruptedException e) {
                            f21368y.mo35495k(e);
                            dVar = this.f21370k;
                        }
                        k = dVar.mo34699k();
                        if (this.f21379t && j > 0 && k >= j2) {
                            this.f21379t = false;
                            mo34682K(G);
                            return false;
                        }
                    }
                    this.f21379t = false;
                    mo34682K(G);
                    return true;
                } catch (Throwable th) {
                    this.f21379t = false;
                    mo34682K(G);
                    throw th;
                }
            } else {
                throw new C10943o();
            }
        }
    }

    /* renamed from: p */
    public int mo34366p(C10929e eVar, C10929e eVar2, C10929e eVar3) {
        int p = super.mo34366p(eVar, eVar2, eVar3);
        if (p == 0 && ((eVar != null && eVar.mo34556F0()) || ((eVar2 != null && eVar2.mo34556F0()) || (eVar3 != null && eVar3.mo34556F0())))) {
            synchronized (this) {
                this.f21378s = false;
                if (!this.f21376q) {
                    m27809M();
                }
            }
        } else if (p > 0) {
            this.f21378s = true;
            mo34679H();
        }
        return p;
    }

    public String toString() {
        String str;
        StringBuilder sb;
        SelectionKey selectionKey = this.f21372m;
        String str2 = "";
        if (selectionKey == null) {
            sb = new StringBuilder();
            sb.append(str2);
            str = Constants.ACCEPT_TIME_SEPARATOR_SERVER;
        } else if (selectionKey.isValid()) {
            if (selectionKey.isReadable()) {
                str2 = str2 + C7200r.f14712G;
            }
            if (selectionKey.isWritable()) {
                sb = new StringBuilder();
                sb.append(str2);
                str = C7380w.f14963G;
            }
            return String.format("SCEP@%x{l(%s)<->r(%s),d=%b,open=%b,ishut=%b,oshut=%b,rb=%b,wb=%b,w=%b,i=%d%s}-{%s}", new Object[]{Integer.valueOf(hashCode()), this.f21353c.getRemoteSocketAddress(), this.f21353c.getLocalSocketAddress(), Boolean.valueOf(this.f21376q), Boolean.valueOf(isOpen()), Boolean.valueOf(mo34369s()), Boolean.valueOf(mo34368r()), Boolean.valueOf(this.f21379t), Boolean.valueOf(this.f21380u), Boolean.valueOf(this.f21378s), Integer.valueOf(this.f21374o), str2, this.f21375p});
        } else {
            sb = new StringBuilder();
            sb.append(str2);
            str = "!";
        }
        sb.append(str);
        str2 = sb.toString();
        return String.format("SCEP@%x{l(%s)<->r(%s),d=%b,open=%b,ishut=%b,oshut=%b,rb=%b,wb=%b,w=%b,i=%d%s}-{%s}", new Object[]{Integer.valueOf(hashCode()), this.f21353c.getRemoteSocketAddress(), this.f21353c.getLocalSocketAddress(), Boolean.valueOf(this.f21376q), Boolean.valueOf(isOpen()), Boolean.valueOf(mo34369s()), Boolean.valueOf(mo34368r()), Boolean.valueOf(this.f21379t), Boolean.valueOf(this.f21380u), Boolean.valueOf(this.f21378s), Integer.valueOf(this.f21374o), str2, this.f21375p});
    }

    /* renamed from: u */
    public int mo34372u(C10929e eVar) {
        int u = super.mo34372u(eVar);
        if (u == 0 && eVar != null && eVar.mo34556F0()) {
            synchronized (this) {
                this.f21378s = false;
                if (!this.f21376q) {
                    m27809M();
                }
            }
        } else if (u > 0) {
            this.f21378s = true;
            mo34679H();
        }
        return u;
    }

    /* renamed from: v */
    public boolean mo34373v(long j) {
        C10963h.C10967d dVar;
        synchronized (this) {
            if (!mo34368r()) {
                long k = this.f21370k.mo34699k();
                long j2 = k + j;
                boolean G = mo34678G();
                mo34682K(true);
                try {
                    this.f21380u = true;
                    while (this.f21380u && !mo34368r()) {
                        try {
                            m27809M();
                            wait(j > 0 ? j2 - k : 10000);
                            dVar = this.f21370k;
                        } catch (InterruptedException e) {
                            f21368y.mo35495k(e);
                            dVar = this.f21370k;
                        }
                        k = dVar.mo34699k();
                        if (this.f21380u && j > 0 && k >= j2) {
                            this.f21380u = false;
                            mo34682K(G);
                            return false;
                        }
                    }
                    this.f21380u = false;
                    mo34682K(G);
                    return true;
                } catch (Throwable th) {
                    this.f21380u = false;
                    mo34682K(G);
                    throw th;
                }
            } else {
                throw new C10943o();
            }
        }
    }

    /* renamed from: w */
    public int mo34374w(C10929e eVar) {
        int w = super.mo34374w(eVar);
        if (w > 0) {
            mo34679H();
        }
        return w;
    }

    /* renamed from: y */
    public void mo34376y() {
        synchronized (this) {
            if (this.f21376q) {
                this.f21377r = true;
            } else {
                mo34350c();
            }
        }
    }
}
