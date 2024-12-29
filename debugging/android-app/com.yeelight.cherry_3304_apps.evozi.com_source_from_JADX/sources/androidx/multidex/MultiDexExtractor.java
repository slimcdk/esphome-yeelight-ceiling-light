package androidx.multidex;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileFilter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;

final class MultiDexExtractor implements Closeable {
    private static final int BUFFER_SIZE = 16384;
    private static final String DEX_PREFIX = "classes";
    static final String DEX_SUFFIX = ".dex";
    private static final String EXTRACTED_NAME_EXT = ".classes";
    static final String EXTRACTED_SUFFIX = ".zip";
    private static final String KEY_CRC = "crc";
    private static final String KEY_DEX_CRC = "dex.crc.";
    private static final String KEY_DEX_NUMBER = "dex.number";
    private static final String KEY_DEX_TIME = "dex.time.";
    private static final String KEY_TIME_STAMP = "timestamp";
    private static final String LOCK_FILENAME = "MultiDex.lock";
    private static final int MAX_EXTRACT_ATTEMPTS = 3;
    private static final long NO_VALUE = -1;
    private static final String PREFS_FILE = "multidex.version";
    private static final String TAG = "MultiDex";
    private final FileLock cacheLock;
    private final File dexDir;
    private final FileChannel lockChannel;
    private final RandomAccessFile lockRaf;
    private final File sourceApk;
    private final long sourceCrc;

    private static class ExtractedDex extends File {
        public long crc = -1;

        public ExtractedDex(File file, String str) {
            super(file, str);
        }
    }

    MultiDexExtractor(File file, File file2) {
        "MultiDexExtractor(" + file.getPath() + ", " + file2.getPath() + ")";
        this.sourceApk = file;
        this.dexDir = file2;
        this.sourceCrc = getZipCrc(file);
        File file3 = new File(file2, LOCK_FILENAME);
        RandomAccessFile randomAccessFile = new RandomAccessFile(file3, "rw");
        this.lockRaf = randomAccessFile;
        try {
            this.lockChannel = randomAccessFile.getChannel();
            try {
                "Blocking on lock " + file3.getPath();
                this.cacheLock = this.lockChannel.lock();
                file3.getPath() + " locked";
            } catch (IOException e) {
                e = e;
                closeQuietly(this.lockChannel);
                throw e;
            } catch (RuntimeException e2) {
                e = e2;
                closeQuietly(this.lockChannel);
                throw e;
            } catch (Error e3) {
                e = e3;
                closeQuietly(this.lockChannel);
                throw e;
            }
        } catch (IOException | Error | RuntimeException e4) {
            closeQuietly(this.lockRaf);
            throw e4;
        }
    }

    private void clearDexDir() {
        String str;
        StringBuilder sb;
        File[] listFiles = this.dexDir.listFiles(new FileFilter() {
            public boolean accept(File file) {
                return !file.getName().equals(MultiDexExtractor.LOCK_FILENAME);
            }
        });
        if (listFiles == null) {
            "Failed to list secondary dex dir content (" + this.dexDir.getPath() + ").";
            return;
        }
        for (File file : listFiles) {
            "Trying to delete old file " + file.getPath() + " of size " + file.length();
            if (!file.delete()) {
                sb = new StringBuilder();
                str = "Failed to delete old file ";
            } else {
                sb = new StringBuilder();
                str = "Deleted old file ";
            }
            sb.append(str);
            sb.append(file.getPath());
            sb.toString();
        }
    }

    private static void closeQuietly(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException unused) {
        }
    }

    private static void extract(ZipFile zipFile, ZipEntry zipEntry, File file, String str) {
        ZipOutputStream zipOutputStream;
        InputStream inputStream = zipFile.getInputStream(zipEntry);
        File createTempFile = File.createTempFile("tmp-" + str, EXTRACTED_SUFFIX, file.getParentFile());
        "Extracting " + createTempFile.getPath();
        try {
            zipOutputStream = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(createTempFile)));
            ZipEntry zipEntry2 = new ZipEntry("classes.dex");
            zipEntry2.setTime(zipEntry.getTime());
            zipOutputStream.putNextEntry(zipEntry2);
            byte[] bArr = new byte[16384];
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    break;
                }
                zipOutputStream.write(bArr, 0, read);
            }
            zipOutputStream.closeEntry();
            zipOutputStream.close();
            if (createTempFile.setReadOnly()) {
                "Renaming to " + file.getPath();
                if (createTempFile.renameTo(file)) {
                    closeQuietly(inputStream);
                    createTempFile.delete();
                    return;
                }
                throw new IOException("Failed to rename \"" + createTempFile.getAbsolutePath() + "\" to \"" + file.getAbsolutePath() + "\"");
            }
            throw new IOException("Failed to mark readonly \"" + createTempFile.getAbsolutePath() + "\" (tmp of \"" + file.getAbsolutePath() + "\")");
        } catch (Throwable th) {
            closeQuietly(inputStream);
            createTempFile.delete();
            throw th;
        }
    }

    private static SharedPreferences getMultiDexPreferences(Context context) {
        return context.getSharedPreferences(PREFS_FILE, Build.VERSION.SDK_INT < 11 ? 0 : 4);
    }

    private static long getTimeStamp(File file) {
        long lastModified = file.lastModified();
        return lastModified == -1 ? lastModified - 1 : lastModified;
    }

    private static long getZipCrc(File file) {
        long zipCrc = ZipUtil.getZipCrc(file);
        return zipCrc == -1 ? zipCrc - 1 : zipCrc;
    }

    private static boolean isModified(Context context, File file, long j, String str) {
        SharedPreferences multiDexPreferences = getMultiDexPreferences(context);
        if (multiDexPreferences.getLong(str + KEY_TIME_STAMP, -1) == getTimeStamp(file)) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(KEY_CRC);
            return multiDexPreferences.getLong(sb.toString(), -1) != j;
        }
    }

    private List<ExtractedDex> loadExistingExtractions(Context context, String str) {
        String str2 = str;
        String str3 = this.sourceApk.getName() + EXTRACTED_NAME_EXT;
        SharedPreferences multiDexPreferences = getMultiDexPreferences(context);
        int i = multiDexPreferences.getInt(str2 + KEY_DEX_NUMBER, 1);
        ArrayList arrayList = new ArrayList(i + -1);
        int i2 = 2;
        while (i2 <= i) {
            ExtractedDex extractedDex = new ExtractedDex(this.dexDir, str3 + i2 + EXTRACTED_SUFFIX);
            if (extractedDex.isFile()) {
                extractedDex.crc = getZipCrc(extractedDex);
                long j = multiDexPreferences.getLong(str2 + KEY_DEX_CRC + i2, -1);
                long j2 = multiDexPreferences.getLong(str2 + KEY_DEX_TIME + i2, -1);
                long lastModified = extractedDex.lastModified();
                if (j2 == lastModified) {
                    String str4 = str3;
                    SharedPreferences sharedPreferences = multiDexPreferences;
                    if (j == extractedDex.crc) {
                        arrayList.add(extractedDex);
                        i2++;
                        multiDexPreferences = sharedPreferences;
                        str3 = str4;
                    }
                }
                throw new IOException("Invalid extracted dex: " + extractedDex + " (key \"" + str2 + "\"), expected modification time: " + j2 + ", modification time: " + lastModified + ", expected crc: " + j + ", file crc: " + extractedDex.crc);
            }
            throw new IOException("Missing extracted secondary dex file '" + extractedDex.getPath() + "'");
        }
        return arrayList;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:13|14) */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        "Failed to read crc from " + r8.getAbsolutePath();
        r10 = false;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0086 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.util.List<androidx.multidex.MultiDexExtractor.ExtractedDex> performExtractions() {
        /*
            r14 = this;
            java.lang.String r0 = ".dex"
            java.lang.String r1 = "classes"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.io.File r3 = r14.sourceApk
            java.lang.String r3 = r3.getName()
            r2.append(r3)
            java.lang.String r3 = ".classes"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r14.clearDexDir()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.zip.ZipFile r4 = new java.util.zip.ZipFile
            java.io.File r5 = r14.sourceApk
            r4.<init>(r5)
            r5 = 2
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x013e }
            r6.<init>()     // Catch:{ all -> 0x013e }
            r6.append(r1)     // Catch:{ all -> 0x013e }
            r6.append(r5)     // Catch:{ all -> 0x013e }
            r6.append(r0)     // Catch:{ all -> 0x013e }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x013e }
        L_0x003d:
            java.util.zip.ZipEntry r6 = r4.getEntry(r6)     // Catch:{ all -> 0x013e }
            if (r6 == 0) goto L_0x013a
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x013e }
            r7.<init>()     // Catch:{ all -> 0x013e }
            r7.append(r2)     // Catch:{ all -> 0x013e }
            r7.append(r5)     // Catch:{ all -> 0x013e }
            java.lang.String r8 = ".zip"
            r7.append(r8)     // Catch:{ all -> 0x013e }
            java.lang.String r7 = r7.toString()     // Catch:{ all -> 0x013e }
            androidx.multidex.MultiDexExtractor$ExtractedDex r8 = new androidx.multidex.MultiDexExtractor$ExtractedDex     // Catch:{ all -> 0x013e }
            java.io.File r9 = r14.dexDir     // Catch:{ all -> 0x013e }
            r8.<init>(r9, r7)     // Catch:{ all -> 0x013e }
            r3.add(r8)     // Catch:{ all -> 0x013e }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x013e }
            r7.<init>()     // Catch:{ all -> 0x013e }
            java.lang.String r9 = "Extraction is needed for file "
            r7.append(r9)     // Catch:{ all -> 0x013e }
            r7.append(r8)     // Catch:{ all -> 0x013e }
            r7.toString()     // Catch:{ all -> 0x013e }
            r7 = 0
            r9 = 0
            r10 = 0
        L_0x0074:
            r11 = 3
            if (r9 >= r11) goto L_0x00fa
            if (r10 != 0) goto L_0x00fa
            int r9 = r9 + 1
            extract(r4, r6, r8, r2)     // Catch:{ all -> 0x013e }
            long r10 = getZipCrc(r8)     // Catch:{ IOException -> 0x0086 }
            r8.crc = r10     // Catch:{ IOException -> 0x0086 }
            r10 = 1
            goto L_0x009b
        L_0x0086:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x013e }
            r10.<init>()     // Catch:{ all -> 0x013e }
            java.lang.String r11 = "Failed to read crc from "
            r10.append(r11)     // Catch:{ all -> 0x013e }
            java.lang.String r11 = r8.getAbsolutePath()     // Catch:{ all -> 0x013e }
            r10.append(r11)     // Catch:{ all -> 0x013e }
            r10.toString()     // Catch:{ all -> 0x013e }
            r10 = 0
        L_0x009b:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x013e }
            r11.<init>()     // Catch:{ all -> 0x013e }
            java.lang.String r12 = "Extraction "
            r11.append(r12)     // Catch:{ all -> 0x013e }
            if (r10 == 0) goto L_0x00aa
            java.lang.String r12 = "succeeded"
            goto L_0x00ac
        L_0x00aa:
            java.lang.String r12 = "failed"
        L_0x00ac:
            r11.append(r12)     // Catch:{ all -> 0x013e }
            java.lang.String r12 = " '"
            r11.append(r12)     // Catch:{ all -> 0x013e }
            java.lang.String r12 = r8.getAbsolutePath()     // Catch:{ all -> 0x013e }
            r11.append(r12)     // Catch:{ all -> 0x013e }
            java.lang.String r12 = "': length "
            r11.append(r12)     // Catch:{ all -> 0x013e }
            long r12 = r8.length()     // Catch:{ all -> 0x013e }
            r11.append(r12)     // Catch:{ all -> 0x013e }
            java.lang.String r12 = " - crc: "
            r11.append(r12)     // Catch:{ all -> 0x013e }
            long r12 = r8.crc     // Catch:{ all -> 0x013e }
            r11.append(r12)     // Catch:{ all -> 0x013e }
            r11.toString()     // Catch:{ all -> 0x013e }
            if (r10 != 0) goto L_0x0074
            r8.delete()     // Catch:{ all -> 0x013e }
            boolean r11 = r8.exists()     // Catch:{ all -> 0x013e }
            if (r11 == 0) goto L_0x0074
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x013e }
            r11.<init>()     // Catch:{ all -> 0x013e }
            java.lang.String r12 = "Failed to delete corrupted secondary dex '"
            r11.append(r12)     // Catch:{ all -> 0x013e }
            java.lang.String r12 = r8.getPath()     // Catch:{ all -> 0x013e }
            r11.append(r12)     // Catch:{ all -> 0x013e }
            java.lang.String r12 = "'"
            r11.append(r12)     // Catch:{ all -> 0x013e }
            r11.toString()     // Catch:{ all -> 0x013e }
            goto L_0x0074
        L_0x00fa:
            if (r10 == 0) goto L_0x0112
            int r5 = r5 + 1
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x013e }
            r6.<init>()     // Catch:{ all -> 0x013e }
            r6.append(r1)     // Catch:{ all -> 0x013e }
            r6.append(r5)     // Catch:{ all -> 0x013e }
            r6.append(r0)     // Catch:{ all -> 0x013e }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x013e }
            goto L_0x003d
        L_0x0112:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x013e }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x013e }
            r1.<init>()     // Catch:{ all -> 0x013e }
            java.lang.String r2 = "Could not create zip file "
            r1.append(r2)     // Catch:{ all -> 0x013e }
            java.lang.String r2 = r8.getAbsolutePath()     // Catch:{ all -> 0x013e }
            r1.append(r2)     // Catch:{ all -> 0x013e }
            java.lang.String r2 = " for secondary dex ("
            r1.append(r2)     // Catch:{ all -> 0x013e }
            r1.append(r5)     // Catch:{ all -> 0x013e }
            java.lang.String r2 = ")"
            r1.append(r2)     // Catch:{ all -> 0x013e }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x013e }
            r0.<init>(r1)     // Catch:{ all -> 0x013e }
            throw r0     // Catch:{ all -> 0x013e }
        L_0x013a:
            r4.close()     // Catch:{ IOException -> 0x013d }
        L_0x013d:
            return r3
        L_0x013e:
            r0 = move-exception
            r4.close()     // Catch:{ IOException -> 0x0142 }
        L_0x0142:
            goto L_0x0144
        L_0x0143:
            throw r0
        L_0x0144:
            goto L_0x0143
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.multidex.MultiDexExtractor.performExtractions():java.util.List");
    }

    private static void putStoredApkInfo(Context context, String str, long j, long j2, List<ExtractedDex> list) {
        SharedPreferences.Editor edit = getMultiDexPreferences(context).edit();
        edit.putLong(str + KEY_TIME_STAMP, j);
        edit.putLong(str + KEY_CRC, j2);
        edit.putInt(str + KEY_DEX_NUMBER, list.size() + 1);
        int i = 2;
        for (ExtractedDex next : list) {
            edit.putLong(str + KEY_DEX_CRC + i, next.crc);
            edit.putLong(str + KEY_DEX_TIME + i, next.lastModified());
            i++;
        }
        edit.commit();
    }

    public void close() {
        this.cacheLock.release();
        this.lockChannel.close();
        this.lockRaf.close();
    }

    /* access modifiers changed from: package-private */
    public List<? extends File> load(Context context, String str, boolean z) {
        List<ExtractedDex> list;
        "MultiDexExtractor.load(" + this.sourceApk.getPath() + ", " + z + ", " + str + ")";
        if (this.cacheLock.isValid()) {
            if (!z && !isModified(context, this.sourceApk, this.sourceCrc, str)) {
                try {
                    list = loadExistingExtractions(context, str);
                } catch (IOException unused) {
                }
                "load found " + list.size() + " secondary dex files";
                return list;
            }
            List<ExtractedDex> performExtractions = performExtractions();
            putStoredApkInfo(context, str, getTimeStamp(this.sourceApk), this.sourceCrc, performExtractions);
            list = performExtractions;
            "load found " + list.size() + " secondary dex files";
            return list;
        }
        throw new IllegalStateException("MultiDexExtractor was closed");
    }
}
