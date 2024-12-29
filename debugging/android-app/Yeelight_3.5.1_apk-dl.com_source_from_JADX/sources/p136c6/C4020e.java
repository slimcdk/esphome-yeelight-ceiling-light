package p136c6;

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
import javax.servlet.http.C9277a;
import org.eclipse.jetty.server.handler.C9943d;
import p152e6.C9003c;

/* renamed from: c6.e */
public class C4020e extends C4015c {

    /* renamed from: e0 */
    static final C9003c f6831e0 = C4025g.f6851o;

    /* renamed from: f0 */
    private static int f6832f0;

    /* renamed from: S */
    protected final ConcurrentMap<String, C4024f> f6833S = new ConcurrentHashMap();

    /* renamed from: T */
    private Timer f6834T;

    /* renamed from: U */
    private boolean f6835U = false;

    /* renamed from: V */
    private TimerTask f6836V;

    /* renamed from: W */
    long f6837W = 30000;

    /* renamed from: X */
    long f6838X = 0;

    /* renamed from: Y */
    long f6839Y = 0;

    /* renamed from: Z */
    private TimerTask f6840Z;

    /* renamed from: a0 */
    File f6841a0;

    /* renamed from: b0 */
    private boolean f6842b0 = false;

    /* renamed from: c0 */
    private volatile boolean f6843c0 = false;

    /* renamed from: d0 */
    private boolean f6844d0 = false;

    /* renamed from: c6.e$a */
    class C4021a extends TimerTask {
        C4021a() {
        }

        public void run() {
            try {
                C4020e.this.mo26698Z0(true);
            } catch (Exception e) {
                C4020e.f6831e0.mo36856j(e);
            }
        }
    }

    /* renamed from: c6.e$b */
    class C4022b extends TimerTask {
        C4022b() {
        }

        public void run() {
            C4020e.this.mo26699a1();
        }
    }

    /* renamed from: c6.e$c */
    protected class C4023c extends ObjectInputStream {
        public C4023c(C4020e eVar, InputStream inputStream) {
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

    /* access modifiers changed from: protected */
    /* renamed from: D0 */
    public void mo26656D0(C4013a aVar) {
        if (isRunning()) {
            this.f6833S.put(aVar.mo26644s(), (C4024f) aVar);
        }
    }

    /* renamed from: H0 */
    public C4013a mo26660H0(String str) {
        if (this.f6842b0 && !this.f6843c0) {
            try {
                mo26697Y0();
            } catch (Exception e) {
                f6831e0.mo36856j(e);
            }
        }
        ConcurrentMap<String, C4024f> concurrentMap = this.f6833S;
        if (concurrentMap == null) {
            return null;
        }
        C4024f fVar = concurrentMap.get(str);
        if (fVar == null && this.f6842b0) {
            fVar = mo26696X0(str);
        }
        if (fVar == null) {
            return null;
        }
        if (this.f6839Y != 0) {
            fVar.mo26705G();
        }
        return fVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: K0 */
    public void mo26663K0() {
        File file;
        ArrayList arrayList = new ArrayList(this.f6833S.values());
        int i = 100;
        while (arrayList.size() > 0) {
            int i2 = i - 1;
            if (i > 0) {
                if (!mo36751w() || (file = this.f6841a0) == null || !file.exists() || !this.f6841a0.canWrite()) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((C4024f) it.next()).mo26629e();
                    }
                } else {
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        C4024f fVar = (C4024f) it2.next();
                        fVar.mo26709K(false);
                        mo26666N0(fVar, false);
                    }
                }
                arrayList = new ArrayList(this.f6833S.values());
                i = i2;
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: M0 */
    public C4013a mo26665M0(C9277a aVar) {
        return new C4024f(this, aVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: O0 */
    public boolean mo26667O0(String str) {
        return this.f6833S.remove(str) != null;
    }

    /* renamed from: S0 */
    public int mo26691S0() {
        long j = this.f6838X;
        if (j <= 0) {
            return 0;
        }
        return (int) (j / 1000);
    }

    /* renamed from: T0 */
    public int mo26692T0() {
        return (int) (this.f6837W / 1000);
    }

    /* renamed from: U0 */
    public boolean mo26693U0() {
        return this.f6844d0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: V0 */
    public C4013a mo26694V0(long j, long j2, String str) {
        return new C4024f(this, j, j2, str);
    }

    /* renamed from: W0 */
    public C4024f mo26695W0(InputStream inputStream, C4024f fVar) {
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        String readUTF = dataInputStream.readUTF();
        dataInputStream.readUTF();
        long readLong = dataInputStream.readLong();
        long readLong2 = dataInputStream.readLong();
        int readInt = dataInputStream.readInt();
        if (fVar == null) {
            fVar = (C4024f) mo26694V0(readLong, readLong2, readUTF);
        }
        fVar.mo26621C(readInt);
        int readInt2 = dataInputStream.readInt();
        if (readInt2 > 0) {
            C4023c cVar = new C4023c(this, dataInputStream);
            for (int i = 0; i < readInt2; i++) {
                fVar.mo26626b(cVar.readUTF(), cVar.readObject());
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
    /* renamed from: X0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized p136c6.C4024f mo26696X0(java.lang.String r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            java.io.File r0 = new java.io.File     // Catch:{ all -> 0x0092 }
            java.io.File r1 = r5.f6841a0     // Catch:{ all -> 0x0092 }
            r0.<init>(r1, r6)     // Catch:{ all -> 0x0092 }
            r1 = 0
            boolean r2 = r0.exists()     // Catch:{ Exception -> 0x0048, all -> 0x0037 }
            if (r2 == 0) goto L_0x0033
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ Exception -> 0x0048, all -> 0x0037 }
            r2.<init>(r0)     // Catch:{ Exception -> 0x0048, all -> 0x0037 }
            c6.f r3 = r5.mo26695W0(r2, r1)     // Catch:{ Exception -> 0x0031, all -> 0x002e }
            r4 = 0
            r5.mo26657E0(r3, r4)     // Catch:{ Exception -> 0x0031, all -> 0x002e }
            r3.mo26638m()     // Catch:{ Exception -> 0x0031, all -> 0x002e }
            r2.close()     // Catch:{ Exception -> 0x0023 }
            goto L_0x0029
        L_0x0023:
            r6 = move-exception
            e6.c r1 = f6831e0     // Catch:{ all -> 0x0092 }
            r1.mo36849d(r6)     // Catch:{ all -> 0x0092 }
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
            e6.c r2 = f6831e0     // Catch:{ all -> 0x0092 }
            r2.mo36849d(r1)     // Catch:{ all -> 0x0092 }
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
            e6.c r4 = f6831e0     // Catch:{ all -> 0x0092 }
            r4.mo36849d(r2)     // Catch:{ all -> 0x0092 }
        L_0x0056:
            boolean r2 = r5.mo26693U0()     // Catch:{ all -> 0x0092 }
            if (r2 == 0) goto L_0x007c
            boolean r2 = r0.exists()     // Catch:{ all -> 0x0092 }
            if (r2 == 0) goto L_0x007c
            r0.delete()     // Catch:{ all -> 0x0092 }
            e6.c r0 = f6831e0     // Catch:{ all -> 0x0092 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0092 }
            r2.<init>()     // Catch:{ all -> 0x0092 }
            java.lang.String r4 = "Deleting file for unrestorable session "
            r2.append(r4)     // Catch:{ all -> 0x0092 }
            r2.append(r6)     // Catch:{ all -> 0x0092 }
            java.lang.String r6 = r2.toString()     // Catch:{ all -> 0x0092 }
        L_0x0078:
            r0.mo36852g(r6, r3)     // Catch:{ all -> 0x0092 }
            goto L_0x0090
        L_0x007c:
            e6.c r0 = f6831e0     // Catch:{ all -> 0x0092 }
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
        throw new UnsupportedOperationException("Method not decompiled: p136c6.C4020e.mo26696X0(java.lang.String):c6.f");
    }

    /* renamed from: Y0 */
    public void mo26697Y0() {
        this.f6843c0 = true;
        File file = this.f6841a0;
        if (file != null && file.exists()) {
            int i = 0;
            if (!this.f6841a0.canRead()) {
                C9003c cVar = f6831e0;
                cVar.mo36847b("Unable to restore Sessions: Cannot read from Session storage directory " + this.f6841a0.getAbsolutePath(), new Object[0]);
                return;
            }
            String[] list = this.f6841a0.list();
            while (list != null && i < list.length) {
                mo26696X0(list[i]);
                i++;
            }
        }
    }

    /* renamed from: Z0 */
    public void mo26698Z0(boolean z) {
        File file = this.f6841a0;
        if (file != null && file.exists()) {
            if (!this.f6841a0.canWrite()) {
                C9003c cVar = f6831e0;
                cVar.mo36847b("Unable to save Sessions: Session persistence storage directory " + this.f6841a0.getAbsolutePath() + " is not writeable", new Object[0]);
                return;
            }
            for (C4024f K : this.f6833S.values()) {
                K.mo26709K(true);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a1 */
    public void mo26699a1() {
        if (!mo36751w() && !isStopped()) {
            Thread currentThread = Thread.currentThread();
            ClassLoader contextClassLoader = currentThread.getContextClassLoader();
            try {
                ClassLoader classLoader = this.f6817o;
                if (classLoader != null) {
                    currentThread.setContextClassLoader(classLoader);
                }
                long currentTimeMillis = System.currentTimeMillis();
                for (C4024f fVar : this.f6833S.values()) {
                    long v = ((long) fVar.mo26648v()) * 1000;
                    if (v > 0 && fVar.mo26642q() + v < currentTimeMillis) {
                        fVar.mo26622D();
                    } else if (this.f6839Y > 0 && fVar.mo26642q() + this.f6839Y < currentTimeMillis) {
                        fVar.mo26706H();
                    }
                }
            } catch (Throwable th) {
                currentThread.setContextClassLoader(contextClassLoader);
                throw th;
            }
            currentThread.setContextClassLoader(contextClassLoader);
        }
    }

    /* renamed from: b1 */
    public void mo26700b1(int i) {
        long j = ((long) i) * 1000;
        if (j < 0) {
            j = 0;
        }
        this.f6838X = j;
        if (this.f6834T != null) {
            synchronized (this) {
                TimerTask timerTask = this.f6840Z;
                if (timerTask != null) {
                    timerTask.cancel();
                }
                if (this.f6838X > 0 && this.f6841a0 != null) {
                    C4021a aVar = new C4021a();
                    this.f6840Z = aVar;
                    Timer timer = this.f6834T;
                    long j2 = this.f6838X;
                    timer.schedule(aVar, j2, j2);
                }
            }
        }
    }

    /* renamed from: c1 */
    public void mo26701c1(int i) {
        if (i == 0) {
            i = 60;
        }
        long j = this.f6837W;
        long j2 = 1000;
        long j3 = ((long) i) * 1000;
        if (j3 > 60000) {
            j3 = 60000;
        }
        if (j3 >= 1000) {
            j2 = j3;
        }
        this.f6837W = j2;
        if (this.f6834T == null) {
            return;
        }
        if (j2 != j || this.f6836V == null) {
            synchronized (this) {
                TimerTask timerTask = this.f6836V;
                if (timerTask != null) {
                    timerTask.cancel();
                }
                C4022b bVar = new C4022b();
                this.f6836V = bVar;
                Timer timer = this.f6834T;
                long j4 = this.f6837W;
                timer.schedule(bVar, j4, j4);
            }
        }
    }

    /* renamed from: u0 */
    public void mo26547u0() {
        super.mo26547u0();
        this.f6835U = false;
        C9943d.C9945b m1 = C9943d.m24416m1();
        if (m1 != null) {
            this.f6834T = (Timer) m1.mo39957a("org.eclipse.jetty.server.session.timer");
        }
        if (this.f6834T == null) {
            this.f6835U = true;
            StringBuilder sb = new StringBuilder();
            sb.append("HashSessionScavenger-");
            int i = f6832f0;
            f6832f0 = i + 1;
            sb.append(i);
            this.f6834T = new Timer(sb.toString(), true);
        }
        mo26701c1(mo26692T0());
        File file = this.f6841a0;
        if (file != null) {
            if (!file.exists()) {
                this.f6841a0.mkdirs();
            }
            if (!this.f6842b0) {
                mo26697Y0();
            }
        }
        mo26700b1(mo26691S0());
    }

    /* renamed from: v0 */
    public void mo26548v0() {
        synchronized (this) {
            TimerTask timerTask = this.f6840Z;
            if (timerTask != null) {
                timerTask.cancel();
            }
            this.f6840Z = null;
            TimerTask timerTask2 = this.f6836V;
            if (timerTask2 != null) {
                timerTask2.cancel();
            }
            this.f6836V = null;
            Timer timer = this.f6834T;
            if (timer != null && this.f6835U) {
                timer.cancel();
            }
            this.f6834T = null;
        }
        super.mo26548v0();
        this.f6833S.clear();
    }
}
