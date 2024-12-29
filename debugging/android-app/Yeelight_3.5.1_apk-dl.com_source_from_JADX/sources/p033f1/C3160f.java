package p033f1;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p118y0.C3916f;

/* renamed from: f1.f */
public class C3160f {

    /* renamed from: a */
    private final File f5063a;

    /* renamed from: b */
    private final File f5064b;

    /* renamed from: c */
    private final File f5065c;

    /* renamed from: d */
    private final File f5066d;

    /* renamed from: e */
    private final File f5067e;

    /* renamed from: f */
    private final File f5068f;

    public C3160f(Context context) {
        String str;
        File filesDir = context.getFilesDir();
        this.f5063a = filesDir;
        if (m8469v()) {
            str = ".com.google.firebase.crashlytics.files.v2" + File.pathSeparator + m8468u(Application.getProcessName());
        } else {
            str = ".com.google.firebase.crashlytics.files.v1";
        }
        File q = m8464q(new File(filesDir, str));
        this.f5064b = q;
        this.f5065c = m8464q(new File(q, "open-sessions"));
        this.f5066d = m8464q(new File(q, "reports"));
        this.f5067e = m8464q(new File(q, "priority-reports"));
        this.f5068f = m8464q(new File(q, "native-reports"));
    }

    /* renamed from: a */
    private void m8462a(File file) {
        if (file.exists() && m8466s(file)) {
            C3916f f = C3916f.m11190f();
            f.mo26399b("Deleted previous Crashlytics file system: " + file.getPath());
        }
    }

    /* renamed from: n */
    private File m8463n(String str) {
        return m8465r(new File(this.f5065c, str));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0050, code lost:
        return r4;
     */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static synchronized java.io.File m8464q(java.io.File r4) {
        /*
            java.lang.Class<f1.f> r0 = p033f1.C3160f.class
            monitor-enter(r0)
            boolean r1 = r4.exists()     // Catch:{ all -> 0x0051 }
            if (r1 == 0) goto L_0x0031
            boolean r1 = r4.isDirectory()     // Catch:{ all -> 0x0051 }
            if (r1 == 0) goto L_0x0011
            monitor-exit(r0)
            return r4
        L_0x0011:
            y0.f r1 = p118y0.C3916f.m11190f()     // Catch:{ all -> 0x0051 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0051 }
            r2.<init>()     // Catch:{ all -> 0x0051 }
            java.lang.String r3 = "Unexpected non-directory file: "
            r2.append(r3)     // Catch:{ all -> 0x0051 }
            r2.append(r4)     // Catch:{ all -> 0x0051 }
            java.lang.String r3 = "; deleting file and creating new directory."
            r2.append(r3)     // Catch:{ all -> 0x0051 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0051 }
            r1.mo26399b(r2)     // Catch:{ all -> 0x0051 }
            r4.delete()     // Catch:{ all -> 0x0051 }
        L_0x0031:
            boolean r1 = r4.mkdirs()     // Catch:{ all -> 0x0051 }
            if (r1 != 0) goto L_0x004f
            y0.f r1 = p118y0.C3916f.m11190f()     // Catch:{ all -> 0x0051 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0051 }
            r2.<init>()     // Catch:{ all -> 0x0051 }
            java.lang.String r3 = "Could not create Crashlytics-specific directory: "
            r2.append(r3)     // Catch:{ all -> 0x0051 }
            r2.append(r4)     // Catch:{ all -> 0x0051 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0051 }
            r1.mo26401d(r2)     // Catch:{ all -> 0x0051 }
        L_0x004f:
            monitor-exit(r0)
            return r4
        L_0x0051:
            r4 = move-exception
            monitor-exit(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p033f1.C3160f.m8464q(java.io.File):java.io.File");
    }

    /* renamed from: r */
    private static File m8465r(File file) {
        file.mkdirs();
        return file;
    }

    /* renamed from: s */
    static boolean m8466s(File file) {
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File s : listFiles) {
                m8466s(s);
            }
        }
        return file.delete();
    }

    /* renamed from: t */
    private static <T> List<T> m8467t(@Nullable T[] tArr) {
        return tArr == null ? Collections.emptyList() : Arrays.asList(tArr);
    }

    @VisibleForTesting
    /* renamed from: u */
    static String m8468u(String str) {
        return str.replaceAll("[^a-zA-Z0-9.]", "_");
    }

    @SuppressLint({"AnnotateVersionCheck"})
    /* renamed from: v */
    private static boolean m8469v() {
        return Build.VERSION.SDK_INT >= 28;
    }

    /* renamed from: b */
    public void mo23656b() {
        m8462a(new File(this.f5063a, ".com.google.firebase.crashlytics"));
        m8462a(new File(this.f5063a, ".com.google.firebase.crashlytics-ndk"));
        if (m8469v()) {
            m8462a(new File(this.f5063a, ".com.google.firebase.crashlytics.files.v1"));
        }
    }

    /* renamed from: c */
    public boolean mo23657c(String str) {
        return m8466s(new File(this.f5065c, str));
    }

    /* renamed from: d */
    public List<String> mo23658d() {
        return m8467t(this.f5065c.list());
    }

    /* renamed from: e */
    public File mo23659e(String str) {
        return new File(this.f5064b, str);
    }

    /* renamed from: f */
    public List<File> mo23660f(FilenameFilter filenameFilter) {
        return m8467t(this.f5064b.listFiles(filenameFilter));
    }

    /* renamed from: g */
    public File mo23661g(String str) {
        return new File(this.f5068f, str);
    }

    /* renamed from: h */
    public List<File> mo23662h() {
        return m8467t(this.f5068f.listFiles());
    }

    /* renamed from: i */
    public File mo23663i(String str) {
        return m8465r(new File(m8463n(str), "native"));
    }

    /* renamed from: j */
    public File mo23664j(String str) {
        return new File(this.f5067e, str);
    }

    /* renamed from: k */
    public List<File> mo23665k() {
        return m8467t(this.f5067e.listFiles());
    }

    /* renamed from: l */
    public File mo23666l(String str) {
        return new File(this.f5066d, str);
    }

    /* renamed from: m */
    public List<File> mo23667m() {
        return m8467t(this.f5066d.listFiles());
    }

    /* renamed from: o */
    public File mo23668o(String str, String str2) {
        return new File(m8463n(str), str2);
    }

    /* renamed from: p */
    public List<File> mo23669p(String str, FilenameFilter filenameFilter) {
        return m8467t(m8463n(str).listFiles(filenameFilter));
    }
}
