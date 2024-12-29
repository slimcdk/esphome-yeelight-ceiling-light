package com.google.firebase.crashlytics.p110c.p116k;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.crashlytics.internal.model.C3165v;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.crashlytics.internal.model.p127w.C3173h;
import com.google.firebase.crashlytics.p110c.C2857b;
import com.google.firebase.crashlytics.p110c.p112g.C2943n;
import com.google.firebase.crashlytics.p110c.p122o.C3024e;
import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.firebase.crashlytics.c.k.g */
public class C2990g {

    /* renamed from: g */
    private static final Charset f5810g = Charset.forName("UTF-8");

    /* renamed from: h */
    private static final int f5811h = 15;

    /* renamed from: i */
    private static final C3173h f5812i = new C3173h();

    /* renamed from: j */
    private static final Comparator<? super File> f5813j = C2988e.m9167a();

    /* renamed from: k */
    private static final FilenameFilter f5814k = C2989f.m9168a();
    @NonNull

    /* renamed from: a */
    private final AtomicInteger f5815a = new AtomicInteger(0);
    @NonNull

    /* renamed from: b */
    private final File f5816b;
    @NonNull

    /* renamed from: c */
    private final File f5817c;
    @NonNull

    /* renamed from: d */
    private final File f5818d;
    @NonNull

    /* renamed from: e */
    private final File f5819e;
    @NonNull

    /* renamed from: f */
    private final C3024e f5820f;

    public C2990g(@NonNull File file, @NonNull C3024e eVar) {
        File file2 = new File(file, "report-persistence");
        this.f5816b = new File(file2, "sessions");
        this.f5817c = new File(file2, "priority-reports");
        this.f5818d = new File(file2, "reports");
        this.f5819e = new File(file2, "native-reports");
        this.f5820f = eVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: A */
    public static int m9169A(@NonNull File file, @NonNull File file2) {
        return m9189o(file.getName()).compareTo(m9189o(file2.getName()));
    }

    @NonNull
    /* renamed from: E */
    private static File m9170E(@NonNull File file) {
        if (m9199z(file)) {
            return file;
        }
        throw new IOException("Could not create directory " + file);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002c, code lost:
        m9179a(r4, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0030, code lost:
        throw r0;
     */
    @androidx.annotation.NonNull
    /* renamed from: F */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String m9171F(@androidx.annotation.NonNull java.io.File r4) {
        /*
            r0 = 8192(0x2000, float:1.14794E-41)
            byte[] r0 = new byte[r0]
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream
            r1.<init>()
            java.io.FileInputStream r2 = new java.io.FileInputStream
            r2.<init>(r4)
        L_0x000e:
            int r4 = r2.read(r0)     // Catch:{ all -> 0x0029 }
            if (r4 <= 0) goto L_0x0019
            r3 = 0
            r1.write(r0, r3, r4)     // Catch:{ all -> 0x0029 }
            goto L_0x000e
        L_0x0019:
            java.lang.String r4 = new java.lang.String     // Catch:{ all -> 0x0029 }
            byte[] r0 = r1.toByteArray()     // Catch:{ all -> 0x0029 }
            java.nio.charset.Charset r1 = f5810g     // Catch:{ all -> 0x0029 }
            r4.<init>(r0, r1)     // Catch:{ all -> 0x0029 }
            r0 = 0
            m9179a(r0, r2)
            return r4
        L_0x0029:
            r4 = move-exception
            throw r4     // Catch:{ all -> 0x002b }
        L_0x002b:
            r0 = move-exception
            m9179a(r4, r2)
            goto L_0x0031
        L_0x0030:
            throw r0
        L_0x0031:
            goto L_0x0030
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.crashlytics.p110c.p116k.C2990g.m9171F(java.io.File):java.lang.String");
    }

    /* renamed from: G */
    private static void m9172G(@Nullable File file) {
        if (file != null) {
            if (file.isDirectory()) {
                for (File G : file.listFiles()) {
                    m9172G(G);
                }
            }
            file.delete();
        }
    }

    @NonNull
    /* renamed from: H */
    private static List<File> m9173H(@NonNull List<File>... listArr) {
        for (List<File> sort : listArr) {
            Collections.sort(sort, f5813j);
        }
        return m9185g(listArr);
    }

    /* renamed from: I */
    private static void m9174I(@NonNull File file, @NonNull File file2, @NonNull CrashlyticsReport.C3050c cVar, @NonNull String str) {
        try {
            CrashlyticsReport n = f5812i.mo17737E(m9171F(file)).mo17441n(cVar);
            m9170E(file2);
            m9178M(new File(file2, str), f5812i.mo17738F(n));
        } catch (IOException e) {
            C2857b f = C2857b.m8687f();
            f.mo17131c("Could not synthesize final native report file for " + file, e);
        }
    }

    /* renamed from: J */
    private void m9175J(@NonNull File file, long j) {
        boolean z;
        List<File> q = m9191q(file, f5814k);
        if (!q.isEmpty()) {
            Collections.sort(q);
            ArrayList arrayList = new ArrayList();
            Iterator<File> it = q.iterator();
            loop0:
            while (true) {
                z = false;
                while (true) {
                    if (!it.hasNext()) {
                        break loop0;
                    }
                    File next = it.next();
                    try {
                        arrayList.add(f5812i.mo17739i(m9171F(next)));
                        if (z || m9193s(next.getName())) {
                            z = true;
                        }
                    } catch (IOException e) {
                        C2857b f = C2857b.m8687f();
                        f.mo17131c("Could not add event to report for " + next, e);
                    }
                }
            }
            String str = null;
            try {
                str = m9171F(new File(file, "user"));
            } catch (IOException e2) {
                C2857b f2 = C2857b.m8687f();
                f2.mo17131c("Could not read user ID file in " + file.getName(), e2);
            }
            m9176K(new File(file, "report"), z ? this.f5817c : this.f5818d, arrayList, j, z, str);
        }
    }

    /* renamed from: K */
    private static void m9176K(@NonNull File file, @NonNull File file2, @NonNull List<CrashlyticsReport.C3054d.C3061d> list, long j, boolean z, @Nullable String str) {
        try {
            CrashlyticsReport m = f5812i.mo17737E(m9171F(file)).mo17442o(j, z, str).mo17440m(C3165v.m9862c(list));
            CrashlyticsReport.C3054d j2 = m.mo17437j();
            if (j2 != null) {
                m9170E(file2);
                m9178M(new File(file2, j2.mo17473h()), f5812i.mo17738F(m));
            }
        } catch (IOException e) {
            C2857b f = C2857b.m8687f();
            f.mo17131c("Could not synthesize final report file for " + file, e);
        }
    }

    /* renamed from: L */
    private static int m9177L(@NonNull File file, int i) {
        List<File> q = m9191q(file, C2986c.m9165a());
        Collections.sort(q, C2987d.m9166a());
        return m9183e(q, i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001a, code lost:
        throw r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0016, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0017, code lost:
        m9179a(r2, r0);
     */
    /* renamed from: M */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m9178M(java.io.File r2, java.lang.String r3) {
        /*
            java.io.OutputStreamWriter r0 = new java.io.OutputStreamWriter
            java.io.FileOutputStream r1 = new java.io.FileOutputStream
            r1.<init>(r2)
            java.nio.charset.Charset r2 = f5810g
            r0.<init>(r1, r2)
            r0.write(r3)     // Catch:{ all -> 0x0014 }
            r2 = 0
            m9179a(r2, r0)
            return
        L_0x0014:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x0016 }
        L_0x0016:
            r3 = move-exception
            m9179a(r2, r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.crashlytics.p110c.p116k.C2990g.m9178M(java.io.File, java.lang.String):void");
    }

    /* renamed from: a */
    private static /* synthetic */ void m9179a(Throwable th, AutoCloseable autoCloseable) {
        if (th != null) {
            try {
                autoCloseable.close();
            } catch (Throwable unused) {
            }
        } else {
            autoCloseable.close();
        }
    }

    @NonNull
    /* renamed from: d */
    private List<File> m9182d(@Nullable String str) {
        List<File> p = m9190p(this.f5816b, C2985b.m9164a(str));
        Collections.sort(p, f5813j);
        if (p.size() <= 8) {
            return p;
        }
        for (File G : p.subList(8, p.size())) {
            m9172G(G);
        }
        return p.subList(0, 8);
    }

    /* renamed from: e */
    private static int m9183e(List<File> list, int i) {
        int size = list.size();
        for (File next : list) {
            if (size <= i) {
                return size;
            }
            m9172G(next);
            size--;
        }
        return size;
    }

    /* renamed from: f */
    private void m9184f() {
        int i = this.f5820f.mo17413b().mo17420b().f5906b;
        List<File> n = m9188n();
        int size = n.size();
        if (size > i) {
            for (File delete : n.subList(i, size)) {
                delete.delete();
            }
        }
    }

    @NonNull
    /* renamed from: g */
    private static List<File> m9185g(@NonNull List<File>... listArr) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (List<File> size : listArr) {
            i += size.size();
        }
        arrayList.ensureCapacity(i);
        for (List<File> addAll : listArr) {
            arrayList.addAll(addAll);
        }
        return arrayList;
    }

    @NonNull
    /* renamed from: l */
    private static String m9186l(int i, boolean z) {
        String format = String.format(Locale.US, "%010d", new Object[]{Integer.valueOf(i)});
        String str = z ? "_" : "";
        return "event" + format + str;
    }

    @NonNull
    /* renamed from: m */
    private static List<File> m9187m(@NonNull File file) {
        return m9190p(file, (FileFilter) null);
    }

    @NonNull
    /* renamed from: n */
    private List<File> m9188n() {
        return m9173H(m9185g(m9187m(this.f5817c), m9187m(this.f5819e)), m9187m(this.f5818d));
    }

    @NonNull
    /* renamed from: o */
    private static String m9189o(@NonNull String str) {
        return str.substring(0, f5811h);
    }

    @NonNull
    /* renamed from: p */
    private static List<File> m9190p(@NonNull File file, @Nullable FileFilter fileFilter) {
        if (!file.isDirectory()) {
            return Collections.emptyList();
        }
        File[] listFiles = fileFilter == null ? file.listFiles() : file.listFiles(fileFilter);
        return listFiles != null ? Arrays.asList(listFiles) : Collections.emptyList();
    }

    @NonNull
    /* renamed from: q */
    private static List<File> m9191q(@NonNull File file, @Nullable FilenameFilter filenameFilter) {
        if (!file.isDirectory()) {
            return Collections.emptyList();
        }
        File[] listFiles = filenameFilter == null ? file.listFiles() : file.listFiles(filenameFilter);
        return listFiles != null ? Arrays.asList(listFiles) : Collections.emptyList();
    }

    @NonNull
    /* renamed from: r */
    private File m9192r(@NonNull String str) {
        return new File(this.f5816b, str);
    }

    /* renamed from: s */
    private static boolean m9193s(@NonNull String str) {
        return str.startsWith("event") && str.endsWith("_");
    }

    /* access modifiers changed from: private */
    /* renamed from: t */
    public static boolean m9194t(@NonNull File file, @NonNull String str) {
        return str.startsWith("event") && !str.endsWith("_");
    }

    /* renamed from: u */
    static /* synthetic */ boolean m9195u(String str, File file) {
        return file.isDirectory() && !file.getName().equals(str);
    }

    /* renamed from: z */
    private static boolean m9199z(@NonNull File file) {
        return file.exists() || file.mkdirs();
    }

    /* renamed from: B */
    public void mo17349B(@NonNull CrashlyticsReport.C3054d.C3061d dVar, @NonNull String str, boolean z) {
        int i = this.f5820f.mo17413b().mo17420b().f5905a;
        File r = m9192r(str);
        try {
            m9178M(new File(r, m9186l(this.f5815a.getAndIncrement(), z)), f5812i.mo17740j(dVar));
        } catch (IOException e) {
            C2857b f = C2857b.m8687f();
            f.mo17131c("Could not persist event for session " + str, e);
        }
        m9177L(r, i);
    }

    /* renamed from: C */
    public void mo17350C(@NonNull CrashlyticsReport crashlyticsReport) {
        CrashlyticsReport.C3054d j = crashlyticsReport.mo17437j();
        if (j == null) {
            C2857b.m8687f().mo17130b("Could not get session for report");
            return;
        }
        String h = j.mo17473h();
        try {
            File r = m9192r(h);
            m9170E(r);
            m9178M(new File(r, "report"), f5812i.mo17738F(crashlyticsReport));
        } catch (IOException e) {
            C2857b f = C2857b.m8687f();
            f.mo17131c("Could not persist report for session " + h, e);
        }
    }

    /* renamed from: D */
    public void mo17351D(@NonNull String str, @NonNull String str2) {
        try {
            m9178M(new File(m9192r(str2), "user"), str);
        } catch (IOException e) {
            C2857b f = C2857b.m8687f();
            f.mo17131c("Could not persist user ID for session " + str2, e);
        }
    }

    /* renamed from: h */
    public void mo17352h() {
        for (File delete : m9188n()) {
            delete.delete();
        }
    }

    /* renamed from: i */
    public void mo17353i(String str) {
        FilenameFilter a = C2984a.m9163a(str);
        for (File delete : m9185g(m9191q(this.f5817c, a), m9191q(this.f5819e, a), m9191q(this.f5818d, a))) {
            delete.delete();
        }
    }

    /* renamed from: j */
    public void mo17354j(@Nullable String str, long j) {
        for (File next : m9182d(str)) {
            m9175J(next, j);
            m9172G(next);
        }
        m9184f();
    }

    /* renamed from: k */
    public void mo17355k(@NonNull String str, @NonNull CrashlyticsReport.C3050c cVar) {
        m9174I(new File(m9192r(str), "report"), this.f5819e, cVar, str);
    }

    @NonNull
    /* renamed from: y */
    public List<C2943n> mo17356y() {
        List<File> n = m9188n();
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(n.size());
        for (File next : m9188n()) {
            try {
                arrayList.add(C2943n.m9030a(f5812i.mo17737E(m9171F(next)), next.getName()));
            } catch (IOException e) {
                C2857b f = C2857b.m8687f();
                f.mo17131c("Could not load report file " + next + "; deleting", e);
                next.delete();
            }
        }
        return arrayList;
    }
}
