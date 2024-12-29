package org.apache.commons.p194io.output;

import java.io.File;
import java.io.Writer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;

/* renamed from: org.apache.commons.io.output.FileWriterWithEncoding */
public class FileWriterWithEncoding extends Writer {
    private final Writer out;

    public FileWriterWithEncoding(File file, String str) {
        this(file, str, false);
    }

    public FileWriterWithEncoding(File file, String str, boolean z) {
        this.out = initWriter(file, str, z);
    }

    public FileWriterWithEncoding(File file, Charset charset) {
        this(file, charset, false);
    }

    public FileWriterWithEncoding(File file, Charset charset, boolean z) {
        this.out = initWriter(file, charset, z);
    }

    public FileWriterWithEncoding(File file, CharsetEncoder charsetEncoder) {
        this(file, charsetEncoder, false);
    }

    public FileWriterWithEncoding(File file, CharsetEncoder charsetEncoder, boolean z) {
        this.out = initWriter(file, charsetEncoder, z);
    }

    public FileWriterWithEncoding(String str, String str2) {
        this(new File(str), str2, false);
    }

    public FileWriterWithEncoding(String str, String str2, boolean z) {
        this(new File(str), str2, z);
    }

    public FileWriterWithEncoding(String str, Charset charset) {
        this(new File(str), charset, false);
    }

    public FileWriterWithEncoding(String str, Charset charset, boolean z) {
        this(new File(str), charset, z);
    }

    public FileWriterWithEncoding(String str, CharsetEncoder charsetEncoder) {
        this(new File(str), charsetEncoder, false);
    }

    public FileWriterWithEncoding(String str, CharsetEncoder charsetEncoder, boolean z) {
        this(new File(str), charsetEncoder, z);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0050  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.io.Writer initWriter(java.io.File r3, java.lang.Object r4, boolean r5) {
        /*
            java.lang.String r0 = "File is missing"
            java.util.Objects.requireNonNull(r3, r0)
            java.lang.String r0 = "Encoding is missing"
            java.util.Objects.requireNonNull(r4, r0)
            boolean r0 = r3.exists()
            r1 = 0
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0046, RuntimeException -> 0x0038 }
            r2.<init>(r3, r5)     // Catch:{ IOException -> 0x0046, RuntimeException -> 0x0038 }
            boolean r5 = r4 instanceof java.nio.charset.Charset     // Catch:{ IOException -> 0x0036, RuntimeException -> 0x0034 }
            if (r5 == 0) goto L_0x0020
            java.io.OutputStreamWriter r5 = new java.io.OutputStreamWriter     // Catch:{ IOException -> 0x0036, RuntimeException -> 0x0034 }
            java.nio.charset.Charset r4 = (java.nio.charset.Charset) r4     // Catch:{ IOException -> 0x0036, RuntimeException -> 0x0034 }
            r5.<init>(r2, r4)     // Catch:{ IOException -> 0x0036, RuntimeException -> 0x0034 }
            goto L_0x0033
        L_0x0020:
            boolean r5 = r4 instanceof java.nio.charset.CharsetEncoder     // Catch:{ IOException -> 0x0036, RuntimeException -> 0x0034 }
            if (r5 == 0) goto L_0x002c
            java.io.OutputStreamWriter r5 = new java.io.OutputStreamWriter     // Catch:{ IOException -> 0x0036, RuntimeException -> 0x0034 }
            java.nio.charset.CharsetEncoder r4 = (java.nio.charset.CharsetEncoder) r4     // Catch:{ IOException -> 0x0036, RuntimeException -> 0x0034 }
            r5.<init>(r2, r4)     // Catch:{ IOException -> 0x0036, RuntimeException -> 0x0034 }
            goto L_0x0033
        L_0x002c:
            java.io.OutputStreamWriter r5 = new java.io.OutputStreamWriter     // Catch:{ IOException -> 0x0036, RuntimeException -> 0x0034 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ IOException -> 0x0036, RuntimeException -> 0x0034 }
            r5.<init>(r2, r4)     // Catch:{ IOException -> 0x0036, RuntimeException -> 0x0034 }
        L_0x0033:
            return r5
        L_0x0034:
            r4 = move-exception
            goto L_0x003a
        L_0x0036:
            r4 = move-exception
            goto L_0x0048
        L_0x0038:
            r4 = move-exception
            r2 = r1
        L_0x003a:
            org.apache.commons.p194io.IOUtils.closeQuietly((java.io.Writer) r1)
            org.apache.commons.p194io.IOUtils.closeQuietly((java.io.OutputStream) r2)
            if (r0 != 0) goto L_0x0045
            org.apache.commons.p194io.FileUtils.deleteQuietly(r3)
        L_0x0045:
            throw r4
        L_0x0046:
            r4 = move-exception
            r2 = r1
        L_0x0048:
            org.apache.commons.p194io.IOUtils.closeQuietly((java.io.Writer) r1)
            org.apache.commons.p194io.IOUtils.closeQuietly((java.io.OutputStream) r2)
            if (r0 != 0) goto L_0x0053
            org.apache.commons.p194io.FileUtils.deleteQuietly(r3)
        L_0x0053:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.p194io.output.FileWriterWithEncoding.initWriter(java.io.File, java.lang.Object, boolean):java.io.Writer");
    }

    public void close() {
        this.out.close();
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
