package p156f.p157g0.p208j;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import p163g.C10843m;
import p163g.C4415s;
import p163g.C4416t;

/* renamed from: f.g0.j.a */
public interface C10818a {

    /* renamed from: a */
    public static final C10818a f20862a = new C10819a();

    /* renamed from: f.g0.j.a$a */
    class C10819a implements C10818a {
        C10819a() {
        }

        /* renamed from: a */
        public C4416t mo34131a(File file) {
            return C10843m.m27015j(file);
        }

        /* renamed from: b */
        public C4415s mo34132b(File file) {
            try {
                return C10843m.m27011f(file);
            } catch (FileNotFoundException unused) {
                file.getParentFile().mkdirs();
                return C10843m.m27011f(file);
            }
        }

        /* renamed from: c */
        public void mo34133c(File file) {
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                int length = listFiles.length;
                int i = 0;
                while (i < length) {
                    File file2 = listFiles[i];
                    if (file2.isDirectory()) {
                        mo34133c(file2);
                    }
                    if (file2.delete()) {
                        i++;
                    } else {
                        throw new IOException("failed to delete " + file2);
                    }
                }
                return;
            }
            throw new IOException("not a readable directory: " + file);
        }

        /* renamed from: d */
        public boolean mo34134d(File file) {
            return file.exists();
        }

        /* renamed from: e */
        public void mo34135e(File file, File file2) {
            mo34136f(file2);
            if (!file.renameTo(file2)) {
                throw new IOException("failed to rename " + file + " to " + file2);
            }
        }

        /* renamed from: f */
        public void mo34136f(File file) {
            if (!file.delete() && file.exists()) {
                throw new IOException("failed to delete " + file);
            }
        }

        /* renamed from: g */
        public C4415s mo34137g(File file) {
            try {
                return C10843m.m27006a(file);
            } catch (FileNotFoundException unused) {
                file.getParentFile().mkdirs();
                return C10843m.m27006a(file);
            }
        }

        /* renamed from: h */
        public long mo34138h(File file) {
            return file.length();
        }
    }

    /* renamed from: a */
    C4416t mo34131a(File file);

    /* renamed from: b */
    C4415s mo34132b(File file);

    /* renamed from: c */
    void mo34133c(File file);

    /* renamed from: d */
    boolean mo34134d(File file);

    /* renamed from: e */
    void mo34135e(File file, File file2);

    /* renamed from: f */
    void mo34136f(File file);

    /* renamed from: g */
    C4415s mo34137g(File file);

    /* renamed from: h */
    long mo34138h(File file);
}
