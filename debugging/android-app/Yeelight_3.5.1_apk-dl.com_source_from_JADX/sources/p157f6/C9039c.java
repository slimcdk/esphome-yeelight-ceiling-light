package p157f6;

import com.miot.service.common.miotcloud.impl.MiotCloudImpl;
import java.io.File;
import java.net.JarURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import org.apache.commons.p194io.IOUtils;
import p152e6.C9001b;
import p152e6.C9003c;

/* renamed from: f6.c */
class C9039c extends C9040d {

    /* renamed from: s */
    private static final C9003c f16579s = C9001b.m21450a(C9039c.class);

    /* renamed from: k */
    private JarFile f16580k;

    /* renamed from: l */
    private File f16581l;

    /* renamed from: m */
    private String[] f16582m;

    /* renamed from: n */
    private JarEntry f16583n;

    /* renamed from: o */
    private boolean f16584o;

    /* renamed from: p */
    private String f16585p;

    /* renamed from: q */
    private String f16586q;

    /* renamed from: r */
    private boolean f16587r;

    C9039c(URL url, boolean z) {
        super(url, z);
    }

    /* renamed from: x */
    private List<String> m21600x() {
        mo36932u();
        ArrayList arrayList = new ArrayList(32);
        JarFile jarFile = this.f16580k;
        if (jarFile == null) {
            try {
                JarURLConnection jarURLConnection = (JarURLConnection) new URL(this.f16585p).openConnection();
                jarURLConnection.setUseCaches(mo36940v());
                jarFile = jarURLConnection.getJarFile();
            } catch (Exception e) {
                e.printStackTrace();
                f16579s.mo36849d(e);
            }
        }
        Enumeration<JarEntry> entries = jarFile.entries();
        String str = this.f16595d;
        String substring = str.substring(str.indexOf("!/") + 2);
        while (entries.hasMoreElements()) {
            String replace = entries.nextElement().getName().replace(IOUtils.DIR_SEPARATOR_WINDOWS, IOUtils.DIR_SEPARATOR_UNIX);
            if (replace.startsWith(substring) && replace.length() != substring.length()) {
                String substring2 = replace.substring(substring.length());
                int indexOf = substring2.indexOf(47);
                if (indexOf >= 0) {
                    if (indexOf != 0 || substring2.length() != 1) {
                        substring2 = indexOf == 0 ? substring2.substring(indexOf + 1, substring2.length()) : substring2.substring(0, indexOf + 1);
                        if (arrayList.contains(substring2)) {
                        }
                    }
                }
                arrayList.add(substring2);
            }
        }
        return arrayList;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00ad, code lost:
        r8.f16584o = true;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo36919c() {
        /*
            r8 = this;
            boolean r0 = r8.f16587r
            r1 = 1
            if (r0 == 0) goto L_0x0006
            return r1
        L_0x0006:
            java.lang.String r0 = r8.f16595d
            java.lang.String r2 = "!/"
            boolean r0 = r0.endsWith(r2)
            r2 = 0
            if (r0 == 0) goto L_0x002e
            java.lang.String r0 = r8.f16595d
            r1 = 4
            int r3 = r0.length()
            int r3 = r3 + -2
            java.lang.String r0 = r0.substring(r1, r3)
            f6.e r0 = p157f6.C9042e.m21617n(r0)     // Catch:{ Exception -> 0x0027 }
            boolean r0 = r0.mo36919c()     // Catch:{ Exception -> 0x0027 }
            return r0
        L_0x0027:
            r0 = move-exception
            e6.c r1 = f16579s
            r1.mo36849d(r0)
            return r2
        L_0x002e:
            boolean r0 = r8.mo36932u()
            java.lang.String r3 = r8.f16585p
            if (r3 == 0) goto L_0x003d
            java.lang.String r3 = r8.f16586q
            if (r3 != 0) goto L_0x003d
            r8.f16584o = r0
            return r1
        L_0x003d:
            r3 = 0
            if (r0 == 0) goto L_0x0043
            java.util.jar.JarFile r3 = r8.f16580k
            goto L_0x0062
        L_0x0043:
            java.net.URL r0 = new java.net.URL     // Catch:{ Exception -> 0x005c }
            java.lang.String r4 = r8.f16585p     // Catch:{ Exception -> 0x005c }
            r0.<init>(r4)     // Catch:{ Exception -> 0x005c }
            java.net.URLConnection r0 = r0.openConnection()     // Catch:{ Exception -> 0x005c }
            java.net.JarURLConnection r0 = (java.net.JarURLConnection) r0     // Catch:{ Exception -> 0x005c }
            boolean r4 = r8.mo36940v()     // Catch:{ Exception -> 0x005c }
            r0.setUseCaches(r4)     // Catch:{ Exception -> 0x005c }
            java.util.jar.JarFile r3 = r0.getJarFile()     // Catch:{ Exception -> 0x005c }
            goto L_0x0062
        L_0x005c:
            r0 = move-exception
            e6.c r4 = f16579s
            r4.mo36849d(r0)
        L_0x0062:
            if (r3 == 0) goto L_0x0100
            java.util.jar.JarEntry r0 = r8.f16583n
            if (r0 != 0) goto L_0x0100
            boolean r0 = r8.f16584o
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
            java.lang.String r6 = r8.f16586q
            boolean r6 = r5.equals(r6)
            if (r6 == 0) goto L_0x009d
            r8.f16583n = r3
            java.lang.String r0 = r8.f16586q
            boolean r0 = r0.endsWith(r4)
            r8.f16584o = r0
            goto L_0x00d1
        L_0x009d:
            java.lang.String r3 = r8.f16586q
            boolean r3 = r3.endsWith(r4)
            if (r3 == 0) goto L_0x00b0
            java.lang.String r3 = r8.f16586q
            boolean r3 = r5.startsWith(r3)
            if (r3 == 0) goto L_0x0070
        L_0x00ad:
            r8.f16584o = r1
            goto L_0x00d1
        L_0x00b0:
            java.lang.String r3 = r8.f16586q
            boolean r3 = r5.startsWith(r3)
            if (r3 == 0) goto L_0x0070
            int r3 = r5.length()
            java.lang.String r6 = r8.f16586q
            int r6 = r6.length()
            if (r3 <= r6) goto L_0x0070
            java.lang.String r3 = r8.f16586q
            int r3 = r3.length()
            char r3 = r5.charAt(r3)
            if (r3 != r7) goto L_0x0070
            goto L_0x00ad
        L_0x00d1:
            boolean r0 = r8.f16584o
            if (r0 == 0) goto L_0x0100
            java.lang.String r0 = r8.f16595d
            boolean r0 = r0.endsWith(r4)
            if (r0 != 0) goto L_0x0100
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = r8.f16595d
            r0.append(r3)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            r8.f16595d = r0
            java.net.URL r0 = new java.net.URL     // Catch:{ MalformedURLException -> 0x00fa }
            java.lang.String r3 = r8.f16595d     // Catch:{ MalformedURLException -> 0x00fa }
            r0.<init>(r3)     // Catch:{ MalformedURLException -> 0x00fa }
            r8.f16594c = r0     // Catch:{ MalformedURLException -> 0x00fa }
            goto L_0x0100
        L_0x00fa:
            r0 = move-exception
            e6.c r3 = f16579s
            r3.mo36856j(r0)
        L_0x0100:
            boolean r0 = r8.f16584o
            if (r0 != 0) goto L_0x010a
            java.util.jar.JarEntry r0 = r8.f16583n
            if (r0 == 0) goto L_0x0109
            goto L_0x010a
        L_0x0109:
            r1 = 0
        L_0x010a:
            r8.f16587r = r1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p157f6.C9039c.mo36919c():boolean");
    }

    /* renamed from: j */
    public boolean mo36922j() {
        return this.f16595d.endsWith(MiotCloudImpl.COOKIE_PATH) || (mo36919c() && this.f16584o);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0010, code lost:
        r0 = r2.f16583n;
     */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long mo36923k() {
        /*
            r2 = this;
            boolean r0 = r2.mo36932u()
            if (r0 == 0) goto L_0x0020
            java.io.File r0 = r2.f16581l
            if (r0 == 0) goto L_0x0020
            boolean r0 = r2.mo36919c()
            if (r0 == 0) goto L_0x0019
            java.util.jar.JarEntry r0 = r2.f16583n
            if (r0 == 0) goto L_0x0019
            long r0 = r0.getTime()
            return r0
        L_0x0019:
            java.io.File r0 = r2.f16581l
            long r0 = r0.lastModified()
            return r0
        L_0x0020:
            r0 = -1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p157f6.C9039c.mo36923k():long");
    }

    /* renamed from: l */
    public long mo36924l() {
        JarEntry jarEntry;
        if (!mo36922j() && (jarEntry = this.f16583n) != null) {
            return jarEntry.getSize();
        }
        return -1;
    }

    /* renamed from: m */
    public synchronized String[] mo36925m() {
        List<String> list;
        if (mo36922j() && this.f16582m == null) {
            try {
                list = m21600x();
            } catch (Exception e) {
                C9003c cVar = f16579s;
                cVar.mo36847b("Retrying list:" + e, new Object[0]);
                f16579s.mo36848c(e);
                mo36931r();
                list = m21600x();
            }
            if (list != null) {
                String[] strArr = new String[list.size()];
                this.f16582m = strArr;
                list.toArray(strArr);
            }
        }
        return this.f16582m;
    }

    /* renamed from: r */
    public synchronized void mo36931r() {
        this.f16582m = null;
        this.f16583n = null;
        this.f16581l = null;
        this.f16580k = null;
        super.mo36931r();
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public boolean mo36932u() {
        try {
            super.mo36932u();
            return this.f16580k != null;
        } finally {
            if (this.f16589i == null) {
                this.f16583n = null;
                this.f16581l = null;
                this.f16580k = null;
                this.f16582m = null;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public synchronized void mo36933w() {
        super.mo36933w();
        this.f16583n = null;
        this.f16581l = null;
        this.f16580k = null;
        this.f16582m = null;
        int indexOf = this.f16595d.indexOf("!/") + 2;
        this.f16585p = this.f16595d.substring(0, indexOf);
        String substring = this.f16595d.substring(indexOf);
        this.f16586q = substring;
        if (substring.length() == 0) {
            this.f16586q = null;
        }
        this.f16580k = this.f16589i.getJarFile();
        this.f16581l = new File(this.f16580k.getName());
    }
}
