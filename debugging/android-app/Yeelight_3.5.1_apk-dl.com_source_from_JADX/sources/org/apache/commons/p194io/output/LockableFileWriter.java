package org.apache.commons.p194io.output;

import java.io.File;
import java.io.IOException;
import java.io.Writer;
import java.nio.charset.Charset;
import org.apache.commons.p194io.Charsets;
import org.apache.commons.p194io.FileUtils;

/* renamed from: org.apache.commons.io.output.LockableFileWriter */
public class LockableFileWriter extends Writer {
    private static final String LCK = ".lck";
    private final File lockFile;
    private final Writer out;

    public LockableFileWriter(File file) {
        this(file, false, (String) null);
    }

    public LockableFileWriter(File file, String str) {
        this(file, str, false, (String) null);
    }

    public LockableFileWriter(File file, String str, boolean z, String str2) {
        this(file, Charsets.toCharset(str), z, str2);
    }

    public LockableFileWriter(File file, Charset charset) {
        this(file, charset, false, (String) null);
    }

    public LockableFileWriter(File file, Charset charset, boolean z, String str) {
        File absoluteFile = file.getAbsoluteFile();
        if (absoluteFile.getParentFile() != null) {
            FileUtils.forceMkdir(absoluteFile.getParentFile());
        }
        if (!absoluteFile.isDirectory()) {
            File file2 = new File(str == null ? System.getProperty("java.io.tmpdir") : str);
            FileUtils.forceMkdir(file2);
            testLockDir(file2);
            this.lockFile = new File(file2, absoluteFile.getName() + LCK);
            createLock();
            this.out = initWriter(absoluteFile, charset, z);
            return;
        }
        throw new IOException("File specified is a directory");
    }

    public LockableFileWriter(File file, boolean z) {
        this(file, z, (String) null);
    }

    public LockableFileWriter(File file, boolean z, String str) {
        this(file, Charset.defaultCharset(), z, str);
    }

    public LockableFileWriter(String str) {
        this(str, false, (String) null);
    }

    public LockableFileWriter(String str, boolean z) {
        this(str, z, (String) null);
    }

    public LockableFileWriter(String str, boolean z, String str2) {
        this(new File(str), z, str2);
    }

    private void createLock() {
        synchronized (LockableFileWriter.class) {
            if (this.lockFile.createNewFile()) {
                this.lockFile.deleteOnExit();
            } else {
                throw new IOException("Can't write file, lock " + this.lockFile.getAbsolutePath() + " exists");
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x003e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.io.Writer initWriter(java.io.File r5, java.nio.charset.Charset r6, boolean r7) {
        /*
            r4 = this;
            boolean r0 = r5.exists()
            r1 = 0
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x002f, RuntimeException -> 0x001c }
            java.lang.String r3 = r5.getAbsolutePath()     // Catch:{ IOException -> 0x002f, RuntimeException -> 0x001c }
            r2.<init>(r3, r7)     // Catch:{ IOException -> 0x002f, RuntimeException -> 0x001c }
            java.io.OutputStreamWriter r7 = new java.io.OutputStreamWriter     // Catch:{ IOException -> 0x001a, RuntimeException -> 0x0018 }
            java.nio.charset.Charset r6 = org.apache.commons.p194io.Charsets.toCharset((java.nio.charset.Charset) r6)     // Catch:{ IOException -> 0x001a, RuntimeException -> 0x0018 }
            r7.<init>(r2, r6)     // Catch:{ IOException -> 0x001a, RuntimeException -> 0x0018 }
            return r7
        L_0x0018:
            r6 = move-exception
            goto L_0x001e
        L_0x001a:
            r6 = move-exception
            goto L_0x0031
        L_0x001c:
            r6 = move-exception
            r2 = r1
        L_0x001e:
            org.apache.commons.p194io.IOUtils.closeQuietly((java.io.Writer) r1)
            org.apache.commons.p194io.IOUtils.closeQuietly((java.io.OutputStream) r2)
            java.io.File r7 = r4.lockFile
            org.apache.commons.p194io.FileUtils.deleteQuietly(r7)
            if (r0 != 0) goto L_0x002e
            org.apache.commons.p194io.FileUtils.deleteQuietly(r5)
        L_0x002e:
            throw r6
        L_0x002f:
            r6 = move-exception
            r2 = r1
        L_0x0031:
            org.apache.commons.p194io.IOUtils.closeQuietly((java.io.Writer) r1)
            org.apache.commons.p194io.IOUtils.closeQuietly((java.io.OutputStream) r2)
            java.io.File r7 = r4.lockFile
            org.apache.commons.p194io.FileUtils.deleteQuietly(r7)
            if (r0 != 0) goto L_0x0041
            org.apache.commons.p194io.FileUtils.deleteQuietly(r5)
        L_0x0041:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.p194io.output.LockableFileWriter.initWriter(java.io.File, java.nio.charset.Charset, boolean):java.io.Writer");
    }

    private void testLockDir(File file) {
        if (!file.exists()) {
            throw new IOException("Could not find lockDir: " + file.getAbsolutePath());
        } else if (!file.canWrite()) {
            throw new IOException("Could not write to lockDir: " + file.getAbsolutePath());
        }
    }

    public void close() {
        try {
            this.out.close();
        } finally {
            this.lockFile.delete();
        }
    }

    public void flush() {
        this.out.flush();
    }

    public void write(int i) {
        this.out.write(i);
    }

    public void write(String str) {
        this.out.write(str);
    }

    public void write(String str, int i, int i2) {
        this.out.write(str, i, i2);
    }

    public void write(char[] cArr) {
        this.out.write(cArr);
    }

    public void write(char[] cArr, int i, int i2) {
        this.out.write(cArr, i, i2);
    }
}
