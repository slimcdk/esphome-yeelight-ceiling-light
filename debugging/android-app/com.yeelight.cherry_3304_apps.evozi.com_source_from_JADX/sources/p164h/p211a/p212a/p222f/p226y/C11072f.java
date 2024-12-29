package p164h.p211a.p212a.p222f.p226y;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.Enumeration;
import p154d.p155b.p204f0.C10709c;
import p164h.p211a.p212a.p228h.C11121i;
import p164h.p211a.p212a.p228h.p234y.C11156b;
import p164h.p211a.p212a.p228h.p234y.C11158c;

/* renamed from: h.a.a.f.y.f */
public class C11072f extends C11062a {

    /* renamed from: r */
    private static final C11158c f21819r = C11156b.m29015a(C11072f.class);

    /* renamed from: o */
    private final C11068e f21820o;

    /* renamed from: p */
    private transient boolean f21821p = false;

    /* renamed from: q */
    private transient boolean f21822q = false;

    protected C11072f(C11068e eVar, long j, long j2, String str) {
        super(eVar, j, j2, str);
        this.f21820o = eVar;
    }

    protected C11072f(C11068e eVar, C10709c cVar) {
        super(eVar, cVar);
        this.f21820o = eVar;
    }

    /* renamed from: B */
    public void mo35104B(int i) {
        super.mo35104B(i);
        if (mo35126v() > 0) {
            C11068e eVar = this.f21820o;
            if ((((long) mo35126v()) * 1000) / 10 < eVar.f21809M) {
                eVar.mo35156X0((i + 9) / 10);
            }
        }
    }

    /* renamed from: G */
    public synchronized void mo35160G() {
        FileInputStream fileInputStream;
        Exception e;
        if (mo35162I()) {
            mo35110d(System.currentTimeMillis());
            if (f21819r.mo35485a()) {
                f21819r.mo35489e("Deidling " + super.getId(), new Object[0]);
            }
            try {
                File file = new File(this.f21820o.f21813Q, super.getId());
                if (!file.exists() || !file.canRead()) {
                    throw new FileNotFoundException(file.getName());
                }
                fileInputStream = new FileInputStream(file);
                try {
                    this.f21821p = false;
                    this.f21820o.mo35150R0(fileInputStream, this);
                    mo35116m();
                    if (this.f21820o.f21810N == 0) {
                        file.delete();
                    }
                } catch (Exception e2) {
                    e = e2;
                    f21819r.mo35492h("Problem deidling session " + super.getId(), e);
                    C11121i.m28871a(fileInputStream);
                    mo33941f();
                }
            } catch (Exception e3) {
                fileInputStream = null;
                e = e3;
                f21819r.mo35492h("Problem deidling session " + super.getId(), e);
                C11121i.m28871a(fileInputStream);
                mo33941f();
            }
        }
    }

    /* renamed from: H */
    public synchronized void mo35161H() {
        mo35164K(false);
    }

    /* renamed from: I */
    public synchronized boolean mo35162I() {
        return this.f21821p;
    }

    /* renamed from: J */
    public synchronized void mo35163J(OutputStream outputStream) {
        DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
        dataOutputStream.writeUTF(mo35122s());
        dataOutputStream.writeUTF(mo35127w());
        dataOutputStream.writeLong(mo35125u());
        dataOutputStream.writeLong(mo35120q());
        dataOutputStream.writeInt(mo35128x());
        dataOutputStream.writeInt(mo35121r());
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(dataOutputStream);
        Enumeration<String> g = mo33942g();
        while (g.hasMoreElements()) {
            String nextElement = g.nextElement();
            objectOutputStream.writeUTF(nextElement);
            objectOutputStream.writeObject(mo35117n(nextElement));
        }
        objectOutputStream.close();
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0080  */
    /* renamed from: K */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void mo35164K(boolean r7) {
        /*
            r6 = this;
            monitor-enter(r6)
            boolean r0 = r6.mo35162I()     // Catch:{ all -> 0x008a }
            if (r0 != 0) goto L_0x0088
            boolean r0 = r6.f21822q     // Catch:{ all -> 0x008a }
            if (r0 != 0) goto L_0x0088
            h.a.a.h.y.c r0 = f21819r     // Catch:{ all -> 0x008a }
            boolean r0 = r0.mo35485a()     // Catch:{ all -> 0x008a }
            r1 = 0
            if (r0 == 0) goto L_0x002b
            h.a.a.h.y.c r0 = f21819r     // Catch:{ all -> 0x008a }
            java.lang.String r2 = "Saving {} {}"
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x008a }
            java.lang.String r4 = super.getId()     // Catch:{ all -> 0x008a }
            r3[r1] = r4     // Catch:{ all -> 0x008a }
            r4 = 1
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r7)     // Catch:{ all -> 0x008a }
            r3[r4] = r5     // Catch:{ all -> 0x008a }
            r0.mo35489e(r2, r3)     // Catch:{ all -> 0x008a }
        L_0x002b:
            r0 = 0
            java.io.File r2 = new java.io.File     // Catch:{ Exception -> 0x005f }
            h.a.a.f.y.e r3 = r6.f21820o     // Catch:{ Exception -> 0x005f }
            java.io.File r3 = r3.f21813Q     // Catch:{ Exception -> 0x005f }
            java.lang.String r4 = super.getId()     // Catch:{ Exception -> 0x005f }
            r2.<init>(r3, r4)     // Catch:{ Exception -> 0x005f }
            boolean r3 = r2.exists()     // Catch:{ Exception -> 0x005d }
            if (r3 == 0) goto L_0x0042
            r2.delete()     // Catch:{ Exception -> 0x005d }
        L_0x0042:
            r2.createNewFile()     // Catch:{ Exception -> 0x005d }
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x005d }
            r3.<init>(r2)     // Catch:{ Exception -> 0x005d }
            r6.mo35108F()     // Catch:{ Exception -> 0x005a }
            r6.mo35163J(r3)     // Catch:{ Exception -> 0x005a }
            if (r7 == 0) goto L_0x0056
            r6.mo35116m()     // Catch:{ Exception -> 0x005a }
            goto L_0x0088
        L_0x0056:
            r6.mo35113j()     // Catch:{ Exception -> 0x005a }
            goto L_0x0088
        L_0x005a:
            r7 = move-exception
            r0 = r3
            goto L_0x0061
        L_0x005d:
            r7 = move-exception
            goto L_0x0061
        L_0x005f:
            r7 = move-exception
            r2 = r0
        L_0x0061:
            r6.mo35165L()     // Catch:{ all -> 0x008a }
            h.a.a.h.y.c r3 = f21819r     // Catch:{ all -> 0x008a }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x008a }
            r4.<init>()     // Catch:{ all -> 0x008a }
            java.lang.String r5 = "Problem saving session "
            r4.append(r5)     // Catch:{ all -> 0x008a }
            java.lang.String r5 = super.getId()     // Catch:{ all -> 0x008a }
            r4.append(r5)     // Catch:{ all -> 0x008a }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x008a }
            r3.mo35492h(r4, r7)     // Catch:{ all -> 0x008a }
            if (r0 == 0) goto L_0x0088
            p164h.p211a.p212a.p228h.C11121i.m28872b(r0)     // Catch:{ all -> 0x008a }
            r2.delete()     // Catch:{ all -> 0x008a }
            r6.f21821p = r1     // Catch:{ all -> 0x008a }
        L_0x0088:
            monitor-exit(r6)
            return
        L_0x008a:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p164h.p211a.p212a.p222f.p226y.C11072f.mo35164K(boolean):void");
    }

    /* renamed from: L */
    public synchronized void mo35165L() {
        this.f21822q = true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public void mo35112i() {
        if (this.f21820o.f21811O != 0) {
            mo35160G();
        }
        super.mo35112i();
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public void mo35118o() {
        super.mo35118o();
        if (this.f21820o.f21813Q != null && getId() != null) {
            new File(this.f21820o.f21813Q, getId()).delete();
        }
    }
}
