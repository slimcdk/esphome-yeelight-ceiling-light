package p164h.p211a.p212a.p228h.p235z;

import java.io.File;
import java.net.URL;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import p164h.p211a.p212a.p228h.p234y.C11156b;
import p164h.p211a.p212a.p228h.p234y.C11158c;

/* renamed from: h.a.a.h.z.c */
class C11162c extends C11163d {

    /* renamed from: r */
    private static final C11158c f22116r = C11156b.m29015a(C11162c.class);

    /* renamed from: k */
    private JarFile f22117k;

    /* renamed from: l */
    private File f22118l;

    /* renamed from: m */
    private JarEntry f22119m;

    /* renamed from: n */
    private boolean f22120n;

    /* renamed from: o */
    private String f22121o;

    /* renamed from: p */
    private String f22122p;

    /* renamed from: q */
    private boolean f22123q;

    C11162c(URL url, boolean z) {
        super(url, z);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00ad, code lost:
        r8.f22120n = true;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo35500a() {
        /*
            r8 = this;
            boolean r0 = r8.f22123q
            r1 = 1
            if (r0 == 0) goto L_0x0006
            return r1
        L_0x0006:
            java.lang.String r0 = r8.f22131d
            java.lang.String r2 = "!/"
            boolean r0 = r0.endsWith(r2)
            r2 = 0
            if (r0 == 0) goto L_0x002e
            java.lang.String r0 = r8.f22131d
            r1 = 4
            int r3 = r0.length()
            int r3 = r3 + -2
            java.lang.String r0 = r0.substring(r1, r3)
            h.a.a.h.z.e r0 = p164h.p211a.p212a.p228h.p235z.C11165e.m29075e(r0)     // Catch:{ Exception -> 0x0027 }
            boolean r0 = r0.mo35500a()     // Catch:{ Exception -> 0x0027 }
            return r0
        L_0x0027:
            r0 = move-exception
            h.a.a.h.y.c r1 = f22116r
            r1.mo35488d(r0)
            return r2
        L_0x002e:
            boolean r0 = r8.mo35508k()
            java.lang.String r3 = r8.f22121o
            if (r3 == 0) goto L_0x003d
            java.lang.String r3 = r8.f22122p
            if (r3 != 0) goto L_0x003d
            r8.f22120n = r0
            return r1
        L_0x003d:
            r3 = 0
            if (r0 == 0) goto L_0x0043
            java.util.jar.JarFile r3 = r8.f22117k
            goto L_0x0062
        L_0x0043:
            java.net.URL r0 = new java.net.URL     // Catch:{ Exception -> 0x005c }
            java.lang.String r4 = r8.f22121o     // Catch:{ Exception -> 0x005c }
            r0.<init>(r4)     // Catch:{ Exception -> 0x005c }
            java.net.URLConnection r0 = r0.openConnection()     // Catch:{ Exception -> 0x005c }
            java.net.JarURLConnection r0 = (java.net.JarURLConnection) r0     // Catch:{ Exception -> 0x005c }
            boolean r4 = r8.mo35512l()     // Catch:{ Exception -> 0x005c }
            r0.setUseCaches(r4)     // Catch:{ Exception -> 0x005c }
            java.util.jar.JarFile r3 = r0.getJarFile()     // Catch:{ Exception -> 0x005c }
            goto L_0x0062
        L_0x005c:
            r0 = move-exception
            h.a.a.h.y.c r4 = f22116r
            r4.mo35488d(r0)
        L_0x0062:
            if (r3 == 0) goto L_0x0100
            java.util.jar.JarEntry r0 = r8.f22119m
            if (r0 != 0) goto L_0x0100
            boolean r0 = r8.f22120n
            if (r0 != 0) goto L_0x0100
            java.util.Enumeration r0 = r3.entries()
        L_0x0070:
            boolean r3 = r0.hasMoreElements()
            java.lang.String r4 = "/"
            if (r3 == 0) goto L_0x00d1
            java.lang.Object r3 = r0.nextElement()
            java.util.jar.JarEntry r3 = (java.util.jar.JarEntry) r3
            java.lang.String r5 = r3.getName()
            r6 = 92
            r7 = 47
            java.lang.String r5 = r5.replace(r6, r7)
            java.lang.String r6 = r8.f22122p
            boolean r6 = r5.equals(r6)
            if (r6 == 0) goto L_0x009d
            r8.f22119m = r3
            java.lang.String r0 = r8.f22122p
            boolean r0 = r0.endsWith(r4)
            r8.f22120n = r0
            goto L_0x00d1
        L_0x009d:
            java.lang.String r3 = r8.f22122p
            boolean r3 = r3.endsWith(r4)
            if (r3 == 0) goto L_0x00b0
            java.lang.String r3 = r8.f22122p
            boolean r3 = r5.startsWith(r3)
            if (r3 == 0) goto L_0x0070
        L_0x00ad:
            r8.f22120n = r1
            goto L_0x00d1
        L_0x00b0:
            java.lang.String r3 = r8.f22122p
            boolean r3 = r5.startsWith(r3)
            if (r3 == 0) goto L_0x0070
            int r3 = r5.length()
            java.lang.String r6 = r8.f22122p
            int r6 = r6.length()
            if (r3 <= r6) goto L_0x0070
            java.lang.String r3 = r8.f22122p
            int r3 = r3.length()
            char r3 = r5.charAt(r3)
            if (r3 != r7) goto L_0x0070
            goto L_0x00ad
        L_0x00d1:
            boolean r0 = r8.f22120n
            if (r0 == 0) goto L_0x0100
            java.lang.String r0 = r8.f22131d
            boolean r0 = r0.endsWith(r4)
            if (r0 != 0) goto L_0x0100
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = r8.f22131d
            r0.append(r3)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            r8.f22131d = r0
            java.net.URL r0 = new java.net.URL     // Catch:{ MalformedURLException -> 0x00fa }
            java.lang.String r3 = r8.f22131d     // Catch:{ MalformedURLException -> 0x00fa }
            r0.<init>(r3)     // Catch:{ MalformedURLException -> 0x00fa }
            r8.f22130c = r0     // Catch:{ MalformedURLException -> 0x00fa }
            goto L_0x0100
        L_0x00fa:
            r0 = move-exception
            h.a.a.h.y.c r3 = f22116r
            r3.mo35495k(r0)
        L_0x0100:
            boolean r0 = r8.f22120n
            if (r0 != 0) goto L_0x010a
            java.util.jar.JarEntry r0 = r8.f22119m
            if (r0 == 0) goto L_0x0109
            goto L_0x010a
        L_0x0109:
            r1 = 0
        L_0x010a:
            r8.f22123q = r1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p164h.p211a.p212a.p228h.p235z.C11162c.mo35500a():boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0010, code lost:
        r0 = r2.f22119m;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long mo35503d() {
        /*
            r2 = this;
            boolean r0 = r2.mo35508k()
            if (r0 == 0) goto L_0x0020
            java.io.File r0 = r2.f22118l
            if (r0 == 0) goto L_0x0020
            boolean r0 = r2.mo35500a()
            if (r0 == 0) goto L_0x0019
            java.util.jar.JarEntry r0 = r2.f22119m
            if (r0 == 0) goto L_0x0019
            long r0 = r0.getTime()
            return r0
        L_0x0019:
            java.io.File r0 = r2.f22118l
            long r0 = r0.lastModified()
            return r0
        L_0x0020:
            r0 = -1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p164h.p211a.p212a.p228h.p235z.C11162c.mo35503d():long");
    }

    /* renamed from: i */
    public synchronized void mo35507i() {
        this.f22119m = null;
        this.f22118l = null;
        this.f22117k = null;
        super.mo35507i();
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public boolean mo35508k() {
        try {
            super.mo35508k();
            return this.f22117k != null;
        } finally {
            if (this.f22125i == null) {
                this.f22119m = null;
                this.f22118l = null;
                this.f22117k = null;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public synchronized void mo35509m() {
        super.mo35509m();
        this.f22119m = null;
        this.f22118l = null;
        this.f22117k = null;
        int indexOf = this.f22131d.indexOf("!/") + 2;
        this.f22121o = this.f22131d.substring(0, indexOf);
        String substring = this.f22131d.substring(indexOf);
        this.f22122p = substring;
        if (substring.length() == 0) {
            this.f22122p = null;
        }
        this.f22117k = this.f22125i.getJarFile();
        this.f22118l = new File(this.f22117k.getName());
    }
}
