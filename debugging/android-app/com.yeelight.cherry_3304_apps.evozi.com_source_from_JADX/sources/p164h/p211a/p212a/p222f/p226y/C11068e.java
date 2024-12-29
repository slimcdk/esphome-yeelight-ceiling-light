package p164h.p211a.p212a.p222f.p226y;

import com.xiaomi.mistatistic.sdk.MiStatInterface;
import java.io.DataInputStream;
import java.io.File;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import p154d.p155b.p204f0.C10709c;
import p164h.p211a.p212a.p222f.p224w.C11052c;
import p164h.p211a.p212a.p228h.p234y.C11158c;

/* renamed from: h.a.a.f.y.e */
public class C11068e extends C11064c {

    /* renamed from: U */
    static final C11158c f21803U = C11073g.f21823o;

    /* renamed from: V */
    private static int f21804V;

    /* renamed from: I */
    protected final ConcurrentMap<String, C11072f> f21805I = new ConcurrentHashMap();

    /* renamed from: J */
    private Timer f21806J;

    /* renamed from: K */
    private boolean f21807K = false;

    /* renamed from: L */
    private TimerTask f21808L;

    /* renamed from: M */
    long f21809M = 30000;

    /* renamed from: N */
    long f21810N = 0;

    /* renamed from: O */
    long f21811O = 0;

    /* renamed from: P */
    private TimerTask f21812P;

    /* renamed from: Q */
    File f21813Q;

    /* renamed from: R */
    private boolean f21814R = false;

    /* renamed from: S */
    private volatile boolean f21815S = false;

    /* renamed from: T */
    private boolean f21816T = false;

    /* renamed from: h.a.a.f.y.e$a */
    class C11069a extends TimerTask {
        C11069a() {
        }

        public void run() {
            try {
                C11068e.this.mo35153U0(true);
            } catch (Exception e) {
                C11068e.f21803U.mo35495k(e);
            }
        }
    }

    /* renamed from: h.a.a.f.y.e$b */
    class C11070b extends TimerTask {
        C11070b() {
        }

        public void run() {
            C11068e.this.mo35154V0();
        }
    }

    /* renamed from: h.a.a.f.y.e$c */
    protected class C11071c extends ObjectInputStream {
        public C11071c(C11068e eVar, InputStream inputStream) {
            super(inputStream);
        }

        public Class<?> resolveClass(ObjectStreamClass objectStreamClass) {
            try {
                return Class.forName(objectStreamClass.getName(), false, Thread.currentThread().getContextClassLoader());
            } catch (ClassNotFoundException unused) {
                return super.resolveClass(objectStreamClass);
            }
        }
    }

    /* renamed from: C0 */
    public C11062a mo35134C0(String str) {
        if (this.f21814R && !this.f21815S) {
            try {
                mo35152T0();
            } catch (Exception e) {
                f21803U.mo35495k(e);
            }
        }
        ConcurrentMap<String, C11072f> concurrentMap = this.f21805I;
        if (concurrentMap == null) {
            return null;
        }
        C11072f fVar = concurrentMap.get(str);
        if (fVar == null && this.f21814R) {
            fVar = mo35151S0(str);
        }
        if (fVar == null) {
            return null;
        }
        if (this.f21811O != 0) {
            fVar.mo35160G();
        }
        return fVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: F0 */
    public void mo35137F0() {
        File file;
        ArrayList arrayList = new ArrayList(this.f21805I.values());
        int i = 100;
        while (arrayList.size() > 0) {
            int i2 = i - 1;
            if (i > 0) {
                if (!mo35456u() || (file = this.f21813Q) == null || !file.exists() || !this.f21813Q.canWrite()) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((C11072f) it.next()).mo33941f();
                    }
                } else {
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        C11072f fVar = (C11072f) it2.next();
                        fVar.mo35164K(false);
                        mo35140I0(fVar, false);
                    }
                }
                arrayList = new ArrayList(this.f21805I.values());
                i = i2;
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: H0 */
    public C11062a mo35139H0(C10709c cVar) {
        return new C11072f(this, cVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: J0 */
    public boolean mo35141J0(String str) {
        return this.f21805I.remove(str) != null;
    }

    /* renamed from: N0 */
    public int mo35146N0() {
        long j = this.f21810N;
        if (j <= 0) {
            return 0;
        }
        return (int) (j / 1000);
    }

    /* renamed from: O0 */
    public int mo35147O0() {
        return (int) (this.f21809M / 1000);
    }

    /* renamed from: P0 */
    public boolean mo35148P0() {
        return this.f21816T;
    }

    /* access modifiers changed from: protected */
    /* renamed from: Q0 */
    public C11062a mo35149Q0(long j, long j2, String str) {
        return new C11072f(this, j, j2, str);
    }

    /* renamed from: R0 */
    public C11072f mo35150R0(InputStream inputStream, C11072f fVar) {
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        String readUTF = dataInputStream.readUTF();
        dataInputStream.readUTF();
        long readLong = dataInputStream.readLong();
        long readLong2 = dataInputStream.readLong();
        int readInt = dataInputStream.readInt();
        if (fVar == null) {
            fVar = (C11072f) mo35149Q0(readLong, readLong2, readUTF);
        }
        fVar.mo35105C(readInt);
        int readInt2 = dataInputStream.readInt();
        if (readInt2 > 0) {
            C11071c cVar = new C11071c(this, dataInputStream);
            for (int i = 0; i < readInt2; i++) {
                fVar.mo33939b(cVar.readUTF(), cVar.readObject());
            }
            cVar.close();
        } else {
            dataInputStream.close();
        }
        return fVar;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x003a A[SYNTHETIC, Splitter:B:25:0x003a] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x004c A[SYNTHETIC, Splitter:B:35:0x004c] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0062 A[Catch:{ Exception -> 0x0023 }] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x007c A[Catch:{ Exception -> 0x0023 }] */
    /* renamed from: S0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized p164h.p211a.p212a.p222f.p226y.C11072f mo35151S0(java.lang.String r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            java.io.File r0 = new java.io.File     // Catch:{ all -> 0x0092 }
            java.io.File r1 = r5.f21813Q     // Catch:{ all -> 0x0092 }
            r0.<init>(r1, r6)     // Catch:{ all -> 0x0092 }
            r1 = 0
            boolean r2 = r0.exists()     // Catch:{ Exception -> 0x0048, all -> 0x0037 }
            if (r2 == 0) goto L_0x0033
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ Exception -> 0x0048, all -> 0x0037 }
            r2.<init>(r0)     // Catch:{ Exception -> 0x0048, all -> 0x0037 }
            h.a.a.f.y.f r3 = r5.mo35150R0(r2, r1)     // Catch:{ Exception -> 0x0031, all -> 0x002e }
            r4 = 0
            r5.mo35145z0(r3, r4)     // Catch:{ Exception -> 0x0031, all -> 0x002e }
            r3.mo35116m()     // Catch:{ Exception -> 0x0031, all -> 0x002e }
            r2.close()     // Catch:{ Exception -> 0x0023 }
            goto L_0x0029
        L_0x0023:
            r6 = move-exception
            h.a.a.h.y.c r1 = f21803U     // Catch:{ all -> 0x0092 }
            r1.mo35488d(r6)     // Catch:{ all -> 0x0092 }
        L_0x0029:
            r0.delete()     // Catch:{ all -> 0x0092 }
            monitor-exit(r5)
            return r3
        L_0x002e:
            r6 = move-exception
            r1 = r2
            goto L_0x0038
        L_0x0031:
            r3 = move-exception
            goto L_0x004a
        L_0x0033:
            r0.delete()     // Catch:{ all -> 0x0092 }
            goto L_0x0090
        L_0x0037:
            r6 = move-exception
        L_0x0038:
            if (r1 == 0) goto L_0x0044
            r1.close()     // Catch:{ Exception -> 0x003e }
            goto L_0x0044
        L_0x003e:
            r1 = move-exception
            h.a.a.h.y.c r2 = f21803U     // Catch:{ all -> 0x0092 }
            r2.mo35488d(r1)     // Catch:{ all -> 0x0092 }
        L_0x0044:
            r0.delete()     // Catch:{ all -> 0x0092 }
            throw r6     // Catch:{ all -> 0x0092 }
        L_0x0048:
            r3 = move-exception
            r2 = r1
        L_0x004a:
            if (r2 == 0) goto L_0x0056
            r2.close()     // Catch:{ Exception -> 0x0050 }
            goto L_0x0056
        L_0x0050:
            r2 = move-exception
            h.a.a.h.y.c r4 = f21803U     // Catch:{ all -> 0x0092 }
            r4.mo35488d(r2)     // Catch:{ all -> 0x0092 }
        L_0x0056:
            boolean r2 = r5.mo35148P0()     // Catch:{ all -> 0x0092 }
            if (r2 == 0) goto L_0x007c
            boolean r2 = r0.exists()     // Catch:{ all -> 0x0092 }
            if (r2 == 0) goto L_0x007c
            r0.delete()     // Catch:{ all -> 0x0092 }
            h.a.a.h.y.c r0 = f21803U     // Catch:{ all -> 0x0092 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0092 }
            r2.<init>()     // Catch:{ all -> 0x0092 }
            java.lang.String r4 = "Deleting file for unrestorable session "
            r2.append(r4)     // Catch:{ all -> 0x0092 }
            r2.append(r6)     // Catch:{ all -> 0x0092 }
            java.lang.String r6 = r2.toString()     // Catch:{ all -> 0x0092 }
        L_0x0078:
            r0.mo35492h(r6, r3)     // Catch:{ all -> 0x0092 }
            goto L_0x0090
        L_0x007c:
            h.a.a.h.y.c r0 = f21803U     // Catch:{ all -> 0x0092 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0092 }
            r2.<init>()     // Catch:{ all -> 0x0092 }
            java.lang.String r4 = "Problem restoring session "
            r2.append(r4)     // Catch:{ all -> 0x0092 }
            r2.append(r6)     // Catch:{ all -> 0x0092 }
            java.lang.String r6 = r2.toString()     // Catch:{ all -> 0x0092 }
            goto L_0x0078
        L_0x0090:
            monitor-exit(r5)
            return r1
        L_0x0092:
            r6 = move-exception
            monitor-exit(r5)
            goto L_0x0096
        L_0x0095:
            throw r6
        L_0x0096:
            goto L_0x0095
        */
        throw new UnsupportedOperationException("Method not decompiled: p164h.p211a.p212a.p222f.p226y.C11068e.mo35151S0(java.lang.String):h.a.a.f.y.f");
    }

    /* renamed from: T0 */
    public void mo35152T0() {
        this.f21815S = true;
        File file = this.f21813Q;
        if (file != null && file.exists()) {
            int i = 0;
            if (!this.f21813Q.canRead()) {
                C11158c cVar = f21803U;
                cVar.mo35486b("Unable to restore Sessions: Cannot read from Session storage directory " + this.f21813Q.getAbsolutePath(), new Object[0]);
                return;
            }
            String[] list = this.f21813Q.list();
            while (list != null && i < list.length) {
                mo35151S0(list[i]);
                i++;
            }
        }
    }

    /* renamed from: U0 */
    public void mo35153U0(boolean z) {
        File file = this.f21813Q;
        if (file != null && file.exists()) {
            if (!this.f21813Q.canWrite()) {
                C11158c cVar = f21803U;
                cVar.mo35486b("Unable to save Sessions: Session persistence storage directory " + this.f21813Q.getAbsolutePath() + " is not writeable", new Object[0]);
                return;
            }
            for (C11072f K : this.f21805I.values()) {
                K.mo35164K(true);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: V0 */
    public void mo35154V0() {
        if (!mo35456u() && !mo35450Q()) {
            Thread currentThread = Thread.currentThread();
            ClassLoader contextClassLoader = currentThread.getContextClassLoader();
            try {
                if (this.f21789o != null) {
                    currentThread.setContextClassLoader(this.f21789o);
                }
                long currentTimeMillis = System.currentTimeMillis();
                for (C11072f fVar : this.f21805I.values()) {
                    long v = ((long) fVar.mo35126v()) * 1000;
                    if (v > 0 && fVar.mo35120q() + v < currentTimeMillis) {
                        fVar.mo35106D();
                    } else if (this.f21811O > 0 && fVar.mo35120q() + this.f21811O < currentTimeMillis) {
                        fVar.mo35161H();
                    }
                }
            } catch (Throwable th) {
                currentThread.setContextClassLoader(contextClassLoader);
                throw th;
            }
            currentThread.setContextClassLoader(contextClassLoader);
        }
    }

    /* renamed from: W0 */
    public void mo35155W0(int i) {
        long j = ((long) i) * 1000;
        if (j < 0) {
            j = 0;
        }
        this.f21810N = j;
        if (this.f21806J != null) {
            synchronized (this) {
                if (this.f21812P != null) {
                    this.f21812P.cancel();
                }
                if (this.f21810N > 0 && this.f21813Q != null) {
                    C11069a aVar = new C11069a();
                    this.f21812P = aVar;
                    this.f21806J.schedule(aVar, this.f21810N, this.f21810N);
                }
            }
        }
    }

    /* renamed from: X0 */
    public void mo35156X0(int i) {
        if (i == 0) {
            i = 60;
        }
        long j = this.f21809M;
        long j2 = 1000;
        long j3 = ((long) i) * 1000;
        if (j3 > MiStatInterface.MIN_UPLOAD_INTERVAL) {
            j3 = 60000;
        }
        if (j3 >= 1000) {
            j2 = j3;
        }
        this.f21809M = j2;
        if (this.f21806J == null) {
            return;
        }
        if (j2 != j || this.f21808L == null) {
            synchronized (this) {
                if (this.f21808L != null) {
                    this.f21808L.cancel();
                }
                C11070b bVar = new C11070b();
                this.f21808L = bVar;
                this.f21806J.schedule(bVar, this.f21809M, this.f21809M);
            }
        }
    }

    /* renamed from: p0 */
    public void mo34262p0() {
        super.mo34262p0();
        this.f21807K = false;
        C11052c.C11054b g1 = C11052c.m28456g1();
        if (g1 != null) {
            this.f21806J = (Timer) g1.mo33958a("org.eclipse.jetty.server.session.timer");
        }
        if (this.f21806J == null) {
            this.f21807K = true;
            StringBuilder sb = new StringBuilder();
            sb.append("HashSessionScavenger-");
            int i = f21804V;
            f21804V = i + 1;
            sb.append(i);
            this.f21806J = new Timer(sb.toString(), true);
        }
        mo35156X0(mo35147O0());
        File file = this.f21813Q;
        if (file != null) {
            if (!file.exists()) {
                this.f21813Q.mkdirs();
            }
            if (!this.f21814R) {
                mo35152T0();
            }
        }
        mo35155W0(mo35146N0());
    }

    /* renamed from: q0 */
    public void mo34263q0() {
        synchronized (this) {
            if (this.f21812P != null) {
                this.f21812P.cancel();
            }
            this.f21812P = null;
            if (this.f21808L != null) {
                this.f21808L.cancel();
            }
            this.f21808L = null;
            if (this.f21806J != null && this.f21807K) {
                this.f21806J.cancel();
            }
            this.f21806J = null;
        }
        super.mo34263q0();
        this.f21805I.clear();
    }

    /* access modifiers changed from: protected */
    /* renamed from: y0 */
    public void mo35144y0(C11062a aVar) {
        if (isRunning()) {
            this.f21805I.put(aVar.mo35122s(), (C11072f) aVar);
        }
    }
}
