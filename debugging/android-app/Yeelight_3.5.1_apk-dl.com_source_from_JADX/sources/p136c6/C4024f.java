package p136c6;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.Enumeration;
import javax.servlet.http.C9277a;
import org.eclipse.jetty.util.C9985i;
import p152e6.C9001b;
import p152e6.C9003c;

/* renamed from: c6.f */
public class C4024f extends C4013a {

    /* renamed from: r */
    private static final C9003c f6847r = C9001b.m21450a(C4024f.class);

    /* renamed from: o */
    private final C4020e f6848o;

    /* renamed from: p */
    private transient boolean f6849p = false;

    /* renamed from: q */
    private transient boolean f6850q = false;

    protected C4024f(C4020e eVar, long j, long j2, String str) {
        super(eVar, j, j2, str);
        this.f6848o = eVar;
    }

    protected C4024f(C4020e eVar, C9277a aVar) {
        super(eVar, aVar);
        this.f6848o = eVar;
    }

    /* renamed from: B */
    public void mo26620B(int i) {
        super.mo26620B(i);
        if (mo26648v() > 0) {
            C4020e eVar = this.f6848o;
            if ((((long) mo26648v()) * 1000) / 10 < eVar.f6837W) {
                eVar.mo26701c1((i + 9) / 10);
            }
        }
    }

    /* renamed from: G */
    public synchronized void mo26705G() {
        FileInputStream fileInputStream;
        Exception e;
        if (mo26707I()) {
            mo26631g(System.currentTimeMillis());
            C9003c cVar = f6847r;
            if (cVar.mo36846a()) {
                cVar.mo36850e("Deidling " + super.getId(), new Object[0]);
            }
            try {
                File file = new File(this.f6848o.f6841a0, super.getId());
                if (!file.exists() || !file.canRead()) {
                    throw new FileNotFoundException(file.getName());
                }
                fileInputStream = new FileInputStream(file);
                try {
                    this.f6849p = false;
                    this.f6848o.mo26695W0(fileInputStream, this);
                    mo26638m();
                    if (this.f6848o.f6838X == 0) {
                        file.delete();
                    }
                } catch (Exception e2) {
                    e = e2;
                    f6847r.mo36852g("Problem deidling session " + super.getId(), e);
                    C9985i.m24686a(fileInputStream);
                    mo26629e();
                }
            } catch (Exception e3) {
                fileInputStream = null;
                e = e3;
                f6847r.mo36852g("Problem deidling session " + super.getId(), e);
                C9985i.m24686a(fileInputStream);
                mo26629e();
            }
        }
    }

    /* renamed from: H */
    public synchronized void mo26706H() {
        mo26709K(false);
    }

    /* renamed from: I */
    public synchronized boolean mo26707I() {
        return this.f6849p;
    }

    /* renamed from: J */
    public synchronized void mo26708J(OutputStream outputStream) {
        DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
        dataOutputStream.writeUTF(mo26644s());
        dataOutputStream.writeUTF(mo26649w());
        dataOutputStream.writeLong(mo26647u());
        dataOutputStream.writeLong(mo26642q());
        dataOutputStream.writeInt(mo26650x());
        dataOutputStream.writeInt(mo26643r());
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(dataOutputStream);
        Enumeration<String> f = mo26630f();
        while (f.hasMoreElements()) {
            String nextElement = f.nextElement();
            objectOutputStream.writeUTF(nextElement);
            objectOutputStream.writeObject(mo26639n(nextElement));
        }
        objectOutputStream.close();
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x007e  */
    /* renamed from: K */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void mo26709K(boolean r7) {
        /*
            r6 = this;
            monitor-enter(r6)
            boolean r0 = r6.mo26707I()     // Catch:{ all -> 0x0088 }
            if (r0 != 0) goto L_0x0086
            boolean r0 = r6.f6850q     // Catch:{ all -> 0x0088 }
            if (r0 != 0) goto L_0x0086
            e6.c r0 = f6847r     // Catch:{ all -> 0x0088 }
            boolean r1 = r0.mo36846a()     // Catch:{ all -> 0x0088 }
            r2 = 0
            if (r1 == 0) goto L_0x0029
            java.lang.String r1 = "Saving {} {}"
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x0088 }
            java.lang.String r4 = super.getId()     // Catch:{ all -> 0x0088 }
            r3[r2] = r4     // Catch:{ all -> 0x0088 }
            r4 = 1
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r7)     // Catch:{ all -> 0x0088 }
            r3[r4] = r5     // Catch:{ all -> 0x0088 }
            r0.mo36850e(r1, r3)     // Catch:{ all -> 0x0088 }
        L_0x0029:
            r0 = 0
            java.io.File r1 = new java.io.File     // Catch:{ Exception -> 0x005d }
            c6.e r3 = r6.f6848o     // Catch:{ Exception -> 0x005d }
            java.io.File r3 = r3.f6841a0     // Catch:{ Exception -> 0x005d }
            java.lang.String r4 = super.getId()     // Catch:{ Exception -> 0x005d }
            r1.<init>(r3, r4)     // Catch:{ Exception -> 0x005d }
            boolean r3 = r1.exists()     // Catch:{ Exception -> 0x005b }
            if (r3 == 0) goto L_0x0040
            r1.delete()     // Catch:{ Exception -> 0x005b }
        L_0x0040:
            r1.createNewFile()     // Catch:{ Exception -> 0x005b }
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x005b }
            r3.<init>(r1)     // Catch:{ Exception -> 0x005b }
            r6.mo26624F()     // Catch:{ Exception -> 0x0058 }
            r6.mo26708J(r3)     // Catch:{ Exception -> 0x0058 }
            if (r7 == 0) goto L_0x0054
            r6.mo26638m()     // Catch:{ Exception -> 0x0058 }
            goto L_0x0086
        L_0x0054:
            r6.mo26635j()     // Catch:{ Exception -> 0x0058 }
            goto L_0x0086
        L_0x0058:
            r7 = move-exception
            r0 = r3
            goto L_0x005f
        L_0x005b:
            r7 = move-exception
            goto L_0x005f
        L_0x005d:
            r7 = move-exception
            r1 = r0
        L_0x005f:
            r6.mo26710L()     // Catch:{ all -> 0x0088 }
            e6.c r3 = f6847r     // Catch:{ all -> 0x0088 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0088 }
            r4.<init>()     // Catch:{ all -> 0x0088 }
            java.lang.String r5 = "Problem saving session "
            r4.append(r5)     // Catch:{ all -> 0x0088 }
            java.lang.String r5 = super.getId()     // Catch:{ all -> 0x0088 }
            r4.append(r5)     // Catch:{ all -> 0x0088 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0088 }
            r3.mo36852g(r4, r7)     // Catch:{ all -> 0x0088 }
            if (r0 == 0) goto L_0x0086
            org.eclipse.jetty.util.C9985i.m24687b(r0)     // Catch:{ all -> 0x0088 }
            r1.delete()     // Catch:{ all -> 0x0088 }
            r6.f6849p = r2     // Catch:{ all -> 0x0088 }
        L_0x0086:
            monitor-exit(r6)
            return
        L_0x0088:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p136c6.C4024f.mo26709K(boolean):void");
    }

    /* renamed from: L */
    public synchronized void mo26710L() {
        this.f6850q = true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public void mo26634i() {
        if (this.f6848o.f6839Y != 0) {
            mo26705G();
        }
        super.mo26634i();
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public void mo26640o() {
        super.mo26640o();
        if (this.f6848o.f6841a0 != null && getId() != null) {
            new File(this.f6848o.f6841a0, getId()).delete();
        }
    }
}
