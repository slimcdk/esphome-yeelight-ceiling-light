package org.apache.commons.p194io.input;

import java.io.File;
import java.io.RandomAccessFile;

/* renamed from: org.apache.commons.io.input.Tailer */
public class Tailer implements Runnable {
    private static final int DEFAULT_BUFSIZE = 4096;
    private static final int DEFAULT_DELAY_MILLIS = 1000;
    private static final String RAF_MODE = "r";
    private final long delayMillis;
    private final boolean end;
    private final File file;
    private final byte[] inbuf;
    private final TailerListener listener;
    private final boolean reOpen;
    private volatile boolean run;

    public Tailer(File file2, TailerListener tailerListener) {
        this(file2, tailerListener, 1000);
    }

    public Tailer(File file2, TailerListener tailerListener, long j) {
        this(file2, tailerListener, j, false);
    }

    public Tailer(File file2, TailerListener tailerListener, long j, boolean z) {
        this(file2, tailerListener, j, z, 4096);
    }

    public Tailer(File file2, TailerListener tailerListener, long j, boolean z, int i) {
        this(file2, tailerListener, j, z, false, i);
    }

    public Tailer(File file2, TailerListener tailerListener, long j, boolean z, boolean z2) {
        this(file2, tailerListener, j, z, z2, 4096);
    }

    public Tailer(File file2, TailerListener tailerListener, long j, boolean z, boolean z2, int i) {
        this.run = true;
        this.file = file2;
        this.delayMillis = j;
        this.end = z;
        this.inbuf = new byte[i];
        this.listener = tailerListener;
        tailerListener.init(this);
        this.reOpen = z2;
    }

    public static Tailer create(File file2, TailerListener tailerListener) {
        return create(file2, tailerListener, 1000, false);
    }

    public static Tailer create(File file2, TailerListener tailerListener, long j) {
        return create(file2, tailerListener, j, false);
    }

    public static Tailer create(File file2, TailerListener tailerListener, long j, boolean z) {
        return create(file2, tailerListener, j, z, 4096);
    }

    public static Tailer create(File file2, TailerListener tailerListener, long j, boolean z, int i) {
        Tailer tailer = new Tailer(file2, tailerListener, j, z, i);
        Thread thread = new Thread(tailer);
        thread.setDaemon(true);
        thread.start();
        return tailer;
    }

    public static Tailer create(File file2, TailerListener tailerListener, long j, boolean z, boolean z2) {
        return create(file2, tailerListener, j, z, z2, 4096);
    }

    public static Tailer create(File file2, TailerListener tailerListener, long j, boolean z, boolean z2, int i) {
        Tailer tailer = new Tailer(file2, tailerListener, j, z, z2, i);
        Thread thread = new Thread(tailer);
        thread.setDaemon(true);
        thread.start();
        return tailer;
    }

    private long readLines(RandomAccessFile randomAccessFile) {
        int read;
        StringBuilder sb = new StringBuilder();
        long filePointer = randomAccessFile.getFilePointer();
        long j = filePointer;
        boolean z = false;
        while (this.run && (read = randomAccessFile.read(this.inbuf)) != -1) {
            for (int i = 0; i < read; i++) {
                byte b = this.inbuf[i];
                if (b == 10) {
                    this.listener.handle(sb.toString());
                    sb.setLength(0);
                    filePointer = ((long) i) + j + 1;
                    z = false;
                } else if (b != 13) {
                    if (z) {
                        this.listener.handle(sb.toString());
                        sb.setLength(0);
                        filePointer = ((long) i) + j + 1;
                        z = false;
                    }
                    sb.append((char) b);
                } else {
                    if (z) {
                        sb.append(13);
                    }
                    z = true;
                }
            }
            j = randomAccessFile.getFilePointer();
        }
        randomAccessFile.seek(filePointer);
        return filePointer;
    }

    public long getDelay() {
        return this.delayMillis;
    }

    public File getFile() {
        return this.file;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        r14.listener.fileNotFound();
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:1:0x0005 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x0066 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:50:0x0092 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0016 */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x001d A[SYNTHETIC, Splitter:B:12:0x001d] */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0023 A[SYNTHETIC, Splitter:B:14:0x0023] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x008a A[Catch:{ Exception -> 0x00a7 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r14 = this;
            r0 = 0
            r2 = 0
            r3 = r0
            r5 = r3
        L_0x0005:
            boolean r7 = r14.run     // Catch:{ Exception -> 0x00a7 }
            java.lang.String r8 = "r"
            if (r7 == 0) goto L_0x0038
            if (r2 != 0) goto L_0x0038
            java.io.RandomAccessFile r7 = new java.io.RandomAccessFile     // Catch:{ FileNotFoundException -> 0x0016 }
            java.io.File r9 = r14.file     // Catch:{ FileNotFoundException -> 0x0016 }
            r7.<init>(r9, r8)     // Catch:{ FileNotFoundException -> 0x0016 }
            r2 = r7
            goto L_0x001b
        L_0x0016:
            org.apache.commons.io.input.TailerListener r7 = r14.listener     // Catch:{ Exception -> 0x00a7 }
            r7.fileNotFound()     // Catch:{ Exception -> 0x00a7 }
        L_0x001b:
            if (r2 != 0) goto L_0x0023
            long r7 = r14.delayMillis     // Catch:{ InterruptedException -> 0x0005 }
            java.lang.Thread.sleep(r7)     // Catch:{ InterruptedException -> 0x0005 }
            goto L_0x0005
        L_0x0023:
            boolean r3 = r14.end     // Catch:{ Exception -> 0x00a7 }
            if (r3 == 0) goto L_0x002f
            java.io.File r3 = r14.file     // Catch:{ Exception -> 0x00a7 }
            long r3 = r3.length()     // Catch:{ Exception -> 0x00a7 }
            r5 = r3
            goto L_0x0030
        L_0x002f:
            r5 = r0
        L_0x0030:
            long r3 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x00a7 }
            r2.seek(r5)     // Catch:{ Exception -> 0x00a7 }
            goto L_0x0005
        L_0x0038:
            boolean r7 = r14.run     // Catch:{ Exception -> 0x00a7 }
            if (r7 == 0) goto L_0x00ad
            java.io.File r7 = r14.file     // Catch:{ Exception -> 0x00a7 }
            boolean r7 = org.apache.commons.p194io.FileUtils.isFileNewer((java.io.File) r7, (long) r3)     // Catch:{ Exception -> 0x00a7 }
            java.io.File r9 = r14.file     // Catch:{ Exception -> 0x00a7 }
            long r9 = r9.length()     // Catch:{ Exception -> 0x00a7 }
            int r11 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r11 >= 0) goto L_0x006c
            org.apache.commons.io.input.TailerListener r7 = r14.listener     // Catch:{ Exception -> 0x00a7 }
            r7.fileRotated()     // Catch:{ Exception -> 0x00a7 }
            java.io.RandomAccessFile r7 = new java.io.RandomAccessFile     // Catch:{ FileNotFoundException -> 0x0066 }
            java.io.File r9 = r14.file     // Catch:{ FileNotFoundException -> 0x0066 }
            r7.<init>(r9, r8)     // Catch:{ FileNotFoundException -> 0x0066 }
            org.apache.commons.p194io.IOUtils.closeQuietly((java.io.Closeable) r2)     // Catch:{ FileNotFoundException -> 0x0064 }
            r5 = r0
        L_0x005c:
            r2 = r7
            goto L_0x0038
        L_0x005e:
            r0 = move-exception
            r2 = r7
            goto L_0x00b1
        L_0x0061:
            r0 = move-exception
            r2 = r7
            goto L_0x00a8
        L_0x0064:
            r5 = r0
            r2 = r7
        L_0x0066:
            org.apache.commons.io.input.TailerListener r7 = r14.listener     // Catch:{ Exception -> 0x00a7 }
            r7.fileNotFound()     // Catch:{ Exception -> 0x00a7 }
            goto L_0x0038
        L_0x006c:
            int r11 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r11 <= 0) goto L_0x007c
            long r3 = r14.readLines(r2)     // Catch:{ Exception -> 0x00a7 }
        L_0x0074:
            long r5 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x00a7 }
            r12 = r3
            r3 = r5
            r5 = r12
            goto L_0x0086
        L_0x007c:
            if (r7 == 0) goto L_0x0086
            r2.seek(r0)     // Catch:{ Exception -> 0x00a7 }
            long r3 = r14.readLines(r2)     // Catch:{ Exception -> 0x00a7 }
            goto L_0x0074
        L_0x0086:
            boolean r7 = r14.reOpen     // Catch:{ Exception -> 0x00a7 }
            if (r7 == 0) goto L_0x008d
            org.apache.commons.p194io.IOUtils.closeQuietly((java.io.Closeable) r2)     // Catch:{ Exception -> 0x00a7 }
        L_0x008d:
            long r9 = r14.delayMillis     // Catch:{ InterruptedException -> 0x0092 }
            java.lang.Thread.sleep(r9)     // Catch:{ InterruptedException -> 0x0092 }
        L_0x0092:
            boolean r7 = r14.run     // Catch:{ Exception -> 0x00a7 }
            if (r7 == 0) goto L_0x0038
            boolean r7 = r14.reOpen     // Catch:{ Exception -> 0x00a7 }
            if (r7 == 0) goto L_0x0038
            java.io.RandomAccessFile r7 = new java.io.RandomAccessFile     // Catch:{ Exception -> 0x00a7 }
            java.io.File r9 = r14.file     // Catch:{ Exception -> 0x00a7 }
            r7.<init>(r9, r8)     // Catch:{ Exception -> 0x00a7 }
            r7.seek(r5)     // Catch:{ Exception -> 0x0061, all -> 0x005e }
            goto L_0x005c
        L_0x00a5:
            r0 = move-exception
            goto L_0x00b1
        L_0x00a7:
            r0 = move-exception
        L_0x00a8:
            org.apache.commons.io.input.TailerListener r1 = r14.listener     // Catch:{ all -> 0x00a5 }
            r1.handle((java.lang.Exception) r0)     // Catch:{ all -> 0x00a5 }
        L_0x00ad:
            org.apache.commons.p194io.IOUtils.closeQuietly((java.io.Closeable) r2)
            return
        L_0x00b1:
            org.apache.commons.p194io.IOUtils.closeQuietly((java.io.Closeable) r2)
            goto L_0x00b6
        L_0x00b5:
            throw r0
        L_0x00b6:
            goto L_0x00b5
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.p194io.input.Tailer.run():void");
    }

    public void stop() {
        this.run = false;
    }
}
