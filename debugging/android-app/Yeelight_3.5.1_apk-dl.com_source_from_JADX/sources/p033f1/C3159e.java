package p033f1;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.crashlytics.internal.common.C2244n;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.crashlytics.internal.settings.C2402h;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicInteger;
import p011b1.C0597i;
import p015c1.C0628a;
import p025d1.C3126g;
import p118y0.C3916f;

/* renamed from: f1.e */
public class C3159e {

    /* renamed from: d */
    private static final Charset f5055d = Charset.forName("UTF-8");

    /* renamed from: e */
    private static final int f5056e = 15;

    /* renamed from: f */
    private static final C3126g f5057f = new C3126g();

    /* renamed from: g */
    private static final Comparator<? super File> f5058g = C9027c.f16537a;

    /* renamed from: h */
    private static final FilenameFilter f5059h = C9026b.f16536a;

    /* renamed from: a */
    private final AtomicInteger f5060a = new AtomicInteger(0);

    /* renamed from: b */
    private final C3160f f5061b;
    @NonNull

    /* renamed from: c */
    private final C2402h f5062c;

    public C3159e(C3160f fVar, C2402h hVar) {
        this.f5061b = fVar;
        this.f5062c = hVar;
    }

    @NonNull
    /* renamed from: A */
    private static String m8429A(@NonNull File file) {
        byte[] bArr = new byte[8192];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        FileInputStream fileInputStream = new FileInputStream(file);
        while (true) {
            try {
                int read = fileInputStream.read(bArr);
                if (read > 0) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    String str = new String(byteArrayOutputStream.toByteArray(), f5055d);
                    fileInputStream.close();
                    return str;
                }
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        }
        throw th;
    }

    /* renamed from: B */
    private void m8430B(@NonNull File file, @NonNull CrashlyticsReport.C2266d dVar, @NonNull String str) {
        try {
            C3126g gVar = f5057f;
            m8434F(this.f5061b.mo23661g(str), gVar.mo23596E(gVar.mo23595D(m8429A(file)).mo18632m(dVar)));
        } catch (IOException e) {
            C3916f f = C3916f.m11190f();
            f.mo26408l("Could not synthesize final native report file for " + file, e);
        }
    }

    /* renamed from: C */
    private void m8431C(String str, long j) {
        boolean z;
        List<File> p = this.f5061b.mo23669p(str, f5059h);
        if (p.isEmpty()) {
            C3916f f = C3916f.m11190f();
            f.mo26405i("Session " + str + " has no events.");
            return;
        }
        Collections.sort(p);
        ArrayList arrayList = new ArrayList();
        Iterator<File> it = p.iterator();
        loop0:
        while (true) {
            z = false;
            while (true) {
                if (!it.hasNext()) {
                    break loop0;
                }
                File next = it.next();
                try {
                    arrayList.add(f5057f.mo23597g(m8429A(next)));
                    if (z || m8448s(next.getName())) {
                        z = true;
                    }
                } catch (IOException e) {
                    C3916f f2 = C3916f.m11190f();
                    f2.mo26408l("Could not add event to report for " + next, e);
                }
            }
        }
        if (arrayList.isEmpty()) {
            C3916f f3 = C3916f.m11190f();
            f3.mo26407k("Could not parse event files for session " + str);
            return;
        }
        String j2 = C0597i.m155j(str, this.f5061b);
        m8432D(this.f5061b.mo23668o(str, "report"), arrayList, j, z, j2);
    }

    /* renamed from: D */
    private void m8432D(@NonNull File file, @NonNull List<CrashlyticsReport.C2270e.C2277d> list, long j, boolean z, @Nullable String str) {
        try {
            C3126g gVar = f5057f;
            CrashlyticsReport l = gVar.mo23595D(m8429A(file)).mo18633n(j, z, str).mo18631l(C0628a.m237b(list));
            CrashlyticsReport.C2270e j2 = l.mo18629j();
            if (j2 != null) {
                m8434F(z ? this.f5061b.mo23664j(j2.mo18681h()) : this.f5061b.mo23666l(j2.mo18681h()), gVar.mo23596E(l));
            }
        } catch (IOException e) {
            C3916f f = C3916f.m11190f();
            f.mo26408l("Could not synthesize final report file for " + file, e);
        }
    }

    /* renamed from: E */
    private int m8433E(String str, int i) {
        List<File> p = this.f5061b.mo23669p(str, C9025a.f16535a);
        Collections.sort(p, C9028d.f16538a);
        return m8441f(p, i);
    }

    /* renamed from: F */
    private static void m8434F(File file, String str) {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), f5055d);
        try {
            outputStreamWriter.write(str);
            outputStreamWriter.close();
            return;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    /* renamed from: G */
    private static void m8435G(File file, String str, long j) {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), f5055d);
        try {
            outputStreamWriter.write(str);
            file.setLastModified(m8443h(j));
            outputStreamWriter.close();
            return;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    /* renamed from: e */
    private SortedSet<String> m8440e(@Nullable String str) {
        this.f5061b.mo23656b();
        SortedSet<String> p = mo23650p();
        if (str != null) {
            p.remove(str);
        }
        if (p.size() <= 8) {
            return p;
        }
        while (p.size() > 8) {
            String last = p.last();
            C3916f f = C3916f.m11190f();
            f.mo26399b("Removing session over cap: " + last);
            this.f5061b.mo23657c(last);
            p.remove(last);
        }
        return p;
    }

    /* renamed from: f */
    private static int m8441f(List<File> list, int i) {
        int size = list.size();
        for (File next : list) {
            if (size <= i) {
                return size;
            }
            C3160f.m8466s(next);
            size--;
        }
        return size;
    }

    /* renamed from: g */
    private void m8442g() {
        int i = this.f5062c.mo18973b().f3997a.f4006b;
        List<File> n = m8446n();
        int size = n.size();
        if (size > i) {
            for (File delete : n.subList(i, size)) {
                delete.delete();
            }
        }
    }

    /* renamed from: h */
    private static long m8443h(long j) {
        return j * 1000;
    }

    /* renamed from: j */
    private void m8444j(List<File> list) {
        for (File delete : list) {
            delete.delete();
        }
    }

    @NonNull
    /* renamed from: m */
    private static String m8445m(int i, boolean z) {
        String format = String.format(Locale.US, "%010d", new Object[]{Integer.valueOf(i)});
        String str = z ? "_" : "";
        return "event" + format + str;
    }

    /* renamed from: n */
    private List<File> m8446n() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f5061b.mo23665k());
        arrayList.addAll(this.f5061b.mo23662h());
        Comparator<? super File> comparator = f5058g;
        Collections.sort(arrayList, comparator);
        List<File> m = this.f5061b.mo23667m();
        Collections.sort(m, comparator);
        arrayList.addAll(m);
        return arrayList;
    }

    @NonNull
    /* renamed from: o */
    private static String m8447o(@NonNull String str) {
        return str.substring(0, f5056e);
    }

    /* renamed from: s */
    private static boolean m8448s(@NonNull String str) {
        return str.startsWith("event") && str.endsWith("_");
    }

    /* access modifiers changed from: private */
    /* renamed from: t */
    public static boolean m8449t(@NonNull File file, @NonNull String str) {
        return str.startsWith("event") && !str.endsWith("_");
    }

    /* access modifiers changed from: private */
    /* renamed from: x */
    public static int m8452x(@NonNull File file, @NonNull File file2) {
        return m8447o(file.getName()).compareTo(m8447o(file2.getName()));
    }

    /* renamed from: i */
    public void mo23647i() {
        m8444j(this.f5061b.mo23667m());
        m8444j(this.f5061b.mo23665k());
        m8444j(this.f5061b.mo23662h());
    }

    /* renamed from: k */
    public void mo23648k(@Nullable String str, long j) {
        for (String next : m8440e(str)) {
            C3916f f = C3916f.m11190f();
            f.mo26405i("Finalizing report for session " + next);
            m8431C(next, j);
            this.f5061b.mo23657c(next);
        }
        m8442g();
    }

    /* renamed from: l */
    public void mo23649l(String str, CrashlyticsReport.C2266d dVar) {
        File o = this.f5061b.mo23668o(str, "report");
        C3916f f = C3916f.m11190f();
        f.mo26399b("Writing native session report for " + str + " to file: " + o);
        m8430B(o, dVar, str);
    }

    /* renamed from: p */
    public SortedSet<String> mo23650p() {
        return new TreeSet(this.f5061b.mo23658d()).descendingSet();
    }

    /* renamed from: q */
    public long mo23651q(String str) {
        return this.f5061b.mo23668o(str, "start-time").lastModified();
    }

    /* renamed from: r */
    public boolean mo23652r() {
        return !this.f5061b.mo23667m().isEmpty() || !this.f5061b.mo23665k().isEmpty() || !this.f5061b.mo23662h().isEmpty();
    }

    @NonNull
    /* renamed from: w */
    public List<C2244n> mo23653w() {
        List<File> n = m8446n();
        ArrayList arrayList = new ArrayList();
        for (File next : n) {
            try {
                arrayList.add(C2244n.m5741a(f5057f.mo23595D(m8429A(next)), next.getName(), next));
            } catch (IOException e) {
                C3916f f = C3916f.m11190f();
                f.mo26408l("Could not load report file " + next + "; deleting", e);
                next.delete();
            }
        }
        return arrayList;
    }

    /* renamed from: y */
    public void mo23654y(@NonNull CrashlyticsReport.C2270e.C2277d dVar, @NonNull String str, boolean z) {
        int i = this.f5062c.mo18973b().f3997a.f4005a;
        try {
            m8434F(this.f5061b.mo23668o(str, m8445m(this.f5060a.getAndIncrement(), z)), f5057f.mo23598h(dVar));
        } catch (IOException e) {
            C3916f f = C3916f.m11190f();
            f.mo26408l("Could not persist event for session " + str, e);
        }
        m8433E(str, i);
    }

    /* renamed from: z */
    public void mo23655z(@NonNull CrashlyticsReport crashlyticsReport) {
        CrashlyticsReport.C2270e j = crashlyticsReport.mo18629j();
        if (j == null) {
            C3916f.m11190f().mo26399b("Could not get session for report");
            return;
        }
        String h = j.mo18681h();
        try {
            m8434F(this.f5061b.mo23668o(h, "report"), f5057f.mo23596E(crashlyticsReport));
            m8435G(this.f5061b.mo23668o(h, "start-time"), "", j.mo18684k());
        } catch (IOException e) {
            C3916f f = C3916f.m11190f();
            f.mo26400c("Could not persist report for session " + h, e);
        }
    }
}
