package p128b3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import okio.C9845l;
import okio.C9852q;
import okio.C9853r;

/* renamed from: b3.a */
public interface C3985a {

    /* renamed from: a */
    public static final C3985a f6733a = new C3986a();

    /* renamed from: b3.a$a */
    static class C3986a implements C3985a {
        C3986a() {
        }

        /* renamed from: a */
        public C9853r mo26562a(File file) {
            return C9845l.m23744j(file);
        }

        /* renamed from: b */
        public C9852q mo26563b(File file) {
            try {
                return C9845l.m23740f(file);
            } catch (FileNotFoundException unused) {
                file.getParentFile().mkdirs();
                return C9845l.m23740f(file);
            }
        }

        /* renamed from: c */
        public void mo26564c(File file) {
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                int length = listFiles.length;
                int i = 0;
                while (i < length) {
                    File file2 = listFiles[i];
                    if (file2.isDirectory()) {
                        mo26564c(file2);
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
        public boolean mo26565d(File file) {
            return file.exists();
        }

        /* renamed from: e */
        public void mo26566e(File file, File file2) {
            mo26567f(file2);
            if (!file.renameTo(file2)) {
                throw new IOException("failed to rename " + file + " to " + file2);
            }
        }

        /* renamed from: f */
        public void mo26567f(File file) {
            if (!file.delete() && file.exists()) {
                throw new IOException("failed to delete " + file);
            }
        }

        /* renamed from: g */
        public C9852q mo26568g(File file) {
            try {
                return C9845l.m23735a(file);
            } catch (FileNotFoundException unused) {
                file.getParentFile().mkdirs();
                return C9845l.m23735a(file);
            }
        }

        /* renamed from: h */
        public long mo26569h(File file) {
            return file.length();
        }
    }

    /* renamed from: a */
    C9853r mo26562a(File file);

    /* renamed from: b */
    C9852q mo26563b(File file);

    /* renamed from: c */
    void mo26564c(File file);

    /* renamed from: d */
    boolean mo26565d(File file);

    /* renamed from: e */
    void mo26566e(File file, File file2);

    /* renamed from: f */
    void mo26567f(File file);

    /* renamed from: g */
    C9852q mo26568g(File file);

    /* renamed from: h */
    long mo26569h(File file);
}
