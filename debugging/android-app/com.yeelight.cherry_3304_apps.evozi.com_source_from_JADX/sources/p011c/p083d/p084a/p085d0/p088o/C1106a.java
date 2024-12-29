package p011c.p083d.p084a.p085d0.p088o;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import p163g.C10843m;
import p163g.C4415s;
import p163g.C4416t;

/* renamed from: c.d.a.d0.o.a */
public interface C1106a {

    /* renamed from: a */
    public static final C1106a f1635a = new C1107a();

    /* renamed from: c.d.a.d0.o.a$a */
    static class C1107a implements C1106a {
        C1107a() {
        }

        /* renamed from: a */
        public C4416t mo9658a(File file) {
            return C10843m.m27015j(file);
        }

        /* renamed from: b */
        public C4415s mo9659b(File file) {
            try {
                return C10843m.m27011f(file);
            } catch (FileNotFoundException unused) {
                file.getParentFile().mkdirs();
                return C10843m.m27011f(file);
            }
        }

        /* renamed from: c */
        public void mo9660c(File file) {
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                int length = listFiles.length;
                int i = 0;
                while (i < length) {
                    File file2 = listFiles[i];
                    if (file2.isDirectory()) {
                        mo9660c(file2);
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
        public boolean mo9661d(File file) {
            return file.exists();
        }

        /* renamed from: e */
        public void mo9662e(File file, File file2) {
            mo9663f(file2);
            if (!file.renameTo(file2)) {
                throw new IOException("failed to rename " + file + " to " + file2);
            }
        }

        /* renamed from: f */
        public void mo9663f(File file) {
            if (!file.delete() && file.exists()) {
                throw new IOException("failed to delete " + file);
            }
        }

        /* renamed from: g */
        public C4415s mo9664g(File file) {
            try {
                return C10843m.m27006a(file);
            } catch (FileNotFoundException unused) {
                file.getParentFile().mkdirs();
                return C10843m.m27006a(file);
            }
        }

        /* renamed from: h */
        public long mo9665h(File file) {
            return file.length();
        }
    }

    /* renamed from: a */
    C4416t mo9658a(File file);

    /* renamed from: b */
    C4415s mo9659b(File file);

    /* renamed from: c */
    void mo9660c(File file);

    /* renamed from: d */
    boolean mo9661d(File file);

    /* renamed from: e */
    void mo9662e(File file, File file2);

    /* renamed from: f */
    void mo9663f(File file);

    /* renamed from: g */
    C4415s mo9664g(File file);

    /* renamed from: h */
    long mo9665h(File file);
}
