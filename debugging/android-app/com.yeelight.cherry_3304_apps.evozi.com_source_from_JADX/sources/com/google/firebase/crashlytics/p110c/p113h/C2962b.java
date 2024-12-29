package com.google.firebase.crashlytics.p110c.p113h;

import android.content.Context;
import androidx.annotation.Nullable;
import com.google.firebase.crashlytics.p110c.C2857b;
import com.google.firebase.crashlytics.p110c.p112g.C2884h;
import java.io.File;
import java.util.Set;

/* renamed from: com.google.firebase.crashlytics.c.h.b */
public class C2962b {

    /* renamed from: d */
    private static final C2965c f5755d = new C2965c();

    /* renamed from: a */
    private final Context f5756a;

    /* renamed from: b */
    private final C2964b f5757b;

    /* renamed from: c */
    private C2961a f5758c;

    /* renamed from: com.google.firebase.crashlytics.c.h.b$b */
    public interface C2964b {
        /* renamed from: a */
        File mo17232a();
    }

    /* renamed from: com.google.firebase.crashlytics.c.h.b$c */
    private static final class C2965c implements C2961a {
        private C2965c() {
        }

        /* renamed from: a */
        public void mo17306a() {
        }

        /* renamed from: b */
        public String mo17307b() {
            return null;
        }

        /* renamed from: c */
        public byte[] mo17308c() {
            return null;
        }

        /* renamed from: d */
        public void mo17309d() {
        }

        /* renamed from: e */
        public void mo17310e(long j, String str) {
        }
    }

    public C2962b(Context context, C2964b bVar) {
        this(context, bVar, (String) null);
    }

    public C2962b(Context context, C2964b bVar, String str) {
        this.f5756a = context;
        this.f5757b = bVar;
        this.f5758c = f5755d;
        mo17315g(str);
    }

    /* renamed from: e */
    private String m9085e(File file) {
        String name = file.getName();
        int lastIndexOf = name.lastIndexOf(".temp");
        return lastIndexOf == -1 ? name : name.substring(20, lastIndexOf);
    }

    /* renamed from: f */
    private File m9086f(String str) {
        return new File(this.f5757b.mo17232a(), "crashlytics-userlog-" + str + ".temp");
    }

    /* renamed from: a */
    public void mo17311a() {
        this.f5758c.mo17309d();
    }

    /* renamed from: b */
    public void mo17312b(Set<String> set) {
        File[] listFiles = this.f5757b.mo17232a().listFiles();
        if (listFiles != null) {
            for (File file : listFiles) {
                if (!set.contains(m9085e(file))) {
                    file.delete();
                }
            }
        }
    }

    /* renamed from: c */
    public byte[] mo17313c() {
        return this.f5758c.mo17308c();
    }

    @Nullable
    /* renamed from: d */
    public String mo17314d() {
        return this.f5758c.mo17307b();
    }

    /* renamed from: g */
    public final void mo17315g(String str) {
        this.f5758c.mo17306a();
        this.f5758c = f5755d;
        if (str != null) {
            if (!C2884h.m8815l(this.f5756a, "com.crashlytics.CollectCustomLogs", true)) {
                C2857b.m8687f().mo17130b("Preferences requested no custom logs. Aborting log file creation.");
            } else {
                mo17316h(m9086f(str), 65536);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo17316h(File file, int i) {
        this.f5758c = new C2971d(file, i);
    }

    /* renamed from: i */
    public void mo17317i(long j, String str) {
        this.f5758c.mo17310e(j, str);
    }
}
