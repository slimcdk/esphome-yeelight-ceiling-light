package com.google.firebase.crashlytics.p110c.p117l;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;

/* renamed from: com.google.firebase.crashlytics.c.l.b */
public class C2994b extends FileOutputStream {

    /* renamed from: d */
    public static final FilenameFilter f5824d = new C2995a();

    /* renamed from: a */
    private final String f5825a;

    /* renamed from: b */
    private File f5826b;

    /* renamed from: c */
    private boolean f5827c = false;

    /* renamed from: com.google.firebase.crashlytics.c.l.b$a */
    class C2995a implements FilenameFilter {
        C2995a() {
        }

        public boolean accept(File file, String str) {
            return str.endsWith(".cls_temp");
        }
    }

    public C2994b(File file, String str) {
        super(new File(file, str + ".cls_temp"));
        this.f5825a = file + File.separator + str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f5825a);
        sb.append(".cls_temp");
        this.f5826b = new File(sb.toString());
    }

    /* renamed from: a */
    public void mo17365a() {
        if (!this.f5827c) {
            this.f5827c = true;
            super.flush();
            super.close();
        }
    }

    public synchronized void close() {
        if (!this.f5827c) {
            this.f5827c = true;
            super.flush();
            super.close();
            File file = new File(this.f5825a + ".cls");
            if (this.f5826b.renameTo(file)) {
                this.f5826b = null;
                return;
            }
            String str = "";
            if (file.exists()) {
                str = " (target already exists)";
            } else if (!this.f5826b.exists()) {
                str = " (source does not exist)";
            }
            throw new IOException("Could not rename temp file: " + this.f5826b + " -> " + file + str);
        }
    }
}
