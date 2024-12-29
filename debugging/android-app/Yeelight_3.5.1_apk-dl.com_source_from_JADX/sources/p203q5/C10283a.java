package p203q5;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import okio.C9845l;
import okio.C9852q;
import okio.C9853r;

/* renamed from: q5.a */
public interface C10283a {

    /* renamed from: a */
    public static final C10283a f19369a = new C10284a();

    /* renamed from: q5.a$a */
    class C10284a implements C10283a {
        C10284a() {
        }

        /* renamed from: a */
        public C9853r mo41795a(File file) {
            return C9845l.m23744j(file);
        }

        /* renamed from: b */
        public C9852q mo41796b(File file) {
            try {
                return C9845l.m23740f(file);
            } catch (FileNotFoundException unused) {
                file.getParentFile().mkdirs();
                return C9845l.m23740f(file);
            }
        }

        /* renamed from: c */
        public void mo41797c(File file) {
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                int length = listFiles.length;
                int i = 0;
                while (i < length) {
                    File file2 = listFiles[i];
                    if (file2.isDirectory()) {
                        mo41797c(file2);
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
        public boolean mo41798d(File file) {
            return file.exists();
        }

        /* renamed from: e */
        public void mo41799e(File file, File file2) {
            mo41800f(file2);
            if (!file.renameTo(file2)) {
                throw new IOException("failed to rename " + file + " to " + file2);
            }
        }

        /* renamed from: f */
        public void mo41800f(File file) {
            if (!file.delete() && file.exists()) {
                throw new IOException("failed to delete " + file);
            }
        }

        /* renamed from: g */
        public C9852q mo41801g(File file) {
            try {
                return C9845l.m23735a(file);
            } catch (FileNotFoundException unused) {
                file.getParentFile().mkdirs();
                return C9845l.m23735a(file);
            }
        }

        /* renamed from: h */
        public long mo41802h(File file) {
            return file.length();
        }
    }

    /* renamed from: a */
    C9853r mo41795a(File file);

    /* renamed from: b */
    C9852q mo41796b(File file);

    /* renamed from: c */
    void mo41797c(File file);

    /* renamed from: d */
    boolean mo41798d(File file);

    /* renamed from: e */
    void mo41799e(File file, File file2);

    /* renamed from: f */
    void mo41800f(File file);

    /* renamed from: g */
    C9852q mo41801g(File file);

    /* renamed from: h */
    long mo41802h(File file);
}
