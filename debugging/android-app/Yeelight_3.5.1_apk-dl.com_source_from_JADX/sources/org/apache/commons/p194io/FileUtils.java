package org.apache.commons.p194io;

import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Reader;
import java.math.BigInteger;
import java.net.URL;
import java.net.URLConnection;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.zip.CRC32;
import java.util.zip.CheckedInputStream;
import java.util.zip.Checksum;
import org.apache.commons.p194io.filefilter.DirectoryFileFilter;
import org.apache.commons.p194io.filefilter.FalseFileFilter;
import org.apache.commons.p194io.filefilter.FileFilterUtils;
import org.apache.commons.p194io.filefilter.IOFileFilter;
import org.apache.commons.p194io.filefilter.SuffixFileFilter;
import org.apache.commons.p194io.filefilter.TrueFileFilter;
import org.apache.commons.p194io.output.NullOutputStream;

/* renamed from: org.apache.commons.io.FileUtils */
public class FileUtils {
    public static final File[] EMPTY_FILE_ARRAY = new File[0];
    private static final long FILE_COPY_BUFFER_SIZE = 31457280;
    public static final long ONE_EB = 1152921504606846976L;
    public static final BigInteger ONE_EB_BI;
    public static final long ONE_GB = 1073741824;
    public static final BigInteger ONE_GB_BI;
    public static final long ONE_KB = 1024;
    public static final BigInteger ONE_KB_BI;
    public static final long ONE_MB = 1048576;
    public static final BigInteger ONE_MB_BI;
    public static final long ONE_PB = 1125899906842624L;
    public static final BigInteger ONE_PB_BI;
    public static final long ONE_TB = 1099511627776L;
    public static final BigInteger ONE_TB_BI;
    public static final BigInteger ONE_YB;
    public static final BigInteger ONE_ZB;
    private static final Charset UTF8 = Charset.forName("UTF-8");

    static {
        BigInteger valueOf = BigInteger.valueOf(1024);
        ONE_KB_BI = valueOf;
        BigInteger multiply = valueOf.multiply(valueOf);
        ONE_MB_BI = multiply;
        BigInteger multiply2 = valueOf.multiply(multiply);
        ONE_GB_BI = multiply2;
        BigInteger multiply3 = valueOf.multiply(multiply2);
        ONE_TB_BI = multiply3;
        BigInteger multiply4 = valueOf.multiply(multiply3);
        ONE_PB_BI = multiply4;
        ONE_EB_BI = valueOf.multiply(multiply4);
        BigInteger multiply5 = BigInteger.valueOf(1024).multiply(BigInteger.valueOf(ONE_EB));
        ONE_ZB = multiply5;
        ONE_YB = valueOf.multiply(multiply5);
    }

    public static String byteCountToDisplaySize(long j) {
        return byteCountToDisplaySize(BigInteger.valueOf(j));
    }

    public static String byteCountToDisplaySize(BigInteger bigInteger) {
        StringBuilder sb;
        String str;
        BigInteger bigInteger2 = ONE_EB_BI;
        BigInteger divide = bigInteger.divide(bigInteger2);
        BigInteger bigInteger3 = BigInteger.ZERO;
        if (divide.compareTo(bigInteger3) > 0) {
            sb = new StringBuilder();
            sb.append(String.valueOf(bigInteger.divide(bigInteger2)));
            str = " EB";
        } else {
            BigInteger bigInteger4 = ONE_PB_BI;
            if (bigInteger.divide(bigInteger4).compareTo(bigInteger3) > 0) {
                sb = new StringBuilder();
                sb.append(String.valueOf(bigInteger.divide(bigInteger4)));
                str = " PB";
            } else {
                BigInteger bigInteger5 = ONE_TB_BI;
                if (bigInteger.divide(bigInteger5).compareTo(bigInteger3) > 0) {
                    sb = new StringBuilder();
                    sb.append(String.valueOf(bigInteger.divide(bigInteger5)));
                    str = " TB";
                } else {
                    BigInteger bigInteger6 = ONE_GB_BI;
                    if (bigInteger.divide(bigInteger6).compareTo(bigInteger3) > 0) {
                        sb = new StringBuilder();
                        sb.append(String.valueOf(bigInteger.divide(bigInteger6)));
                        str = " GB";
                    } else {
                        BigInteger bigInteger7 = ONE_MB_BI;
                        if (bigInteger.divide(bigInteger7).compareTo(bigInteger3) > 0) {
                            sb = new StringBuilder();
                            sb.append(String.valueOf(bigInteger.divide(bigInteger7)));
                            str = " MB";
                        } else {
                            BigInteger bigInteger8 = ONE_KB_BI;
                            if (bigInteger.divide(bigInteger8).compareTo(bigInteger3) > 0) {
                                sb = new StringBuilder();
                                sb.append(String.valueOf(bigInteger.divide(bigInteger8)));
                                str = " KB";
                            } else {
                                return String.valueOf(bigInteger) + " bytes";
                            }
                        }
                    }
                }
            }
        }
        sb.append(str);
        return sb.toString();
    }

    private static void checkDirectory(File file) {
        if (!file.exists()) {
            throw new IllegalArgumentException(file + " does not exist");
        } else if (!file.isDirectory()) {
            throw new IllegalArgumentException(file + " is not a directory");
        }
    }

    public static Checksum checksum(File file, Checksum checksum) {
        if (!file.isDirectory()) {
            CheckedInputStream checkedInputStream = null;
            try {
                CheckedInputStream checkedInputStream2 = new CheckedInputStream(new FileInputStream(file), checksum);
                try {
                    IOUtils.copy((InputStream) checkedInputStream2, (OutputStream) new NullOutputStream());
                    IOUtils.closeQuietly((InputStream) checkedInputStream2);
                    return checksum;
                } catch (Throwable th) {
                    th = th;
                    checkedInputStream = checkedInputStream2;
                    IOUtils.closeQuietly((InputStream) checkedInputStream);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                IOUtils.closeQuietly((InputStream) checkedInputStream);
                throw th;
            }
        } else {
            throw new IllegalArgumentException("Checksums can't be computed on directories");
        }
    }

    public static long checksumCRC32(File file) {
        CRC32 crc32 = new CRC32();
        checksum(file, crc32);
        return crc32.getValue();
    }

    public static void cleanDirectory(File file) {
        if (!file.exists()) {
            throw new IllegalArgumentException(file + " does not exist");
        } else if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                IOException e = null;
                for (File forceDelete : listFiles) {
                    try {
                        forceDelete(forceDelete);
                    } catch (IOException e2) {
                        e = e2;
                    }
                }
                if (e != null) {
                    throw e;
                }
                return;
            }
            throw new IOException("Failed to list contents of " + file);
        } else {
            throw new IllegalArgumentException(file + " is not a directory");
        }
    }

    private static void cleanDirectoryOnExit(File file) {
        if (!file.exists()) {
            throw new IllegalArgumentException(file + " does not exist");
        } else if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                IOException e = null;
                for (File forceDeleteOnExit : listFiles) {
                    try {
                        forceDeleteOnExit(forceDeleteOnExit);
                    } catch (IOException e2) {
                        e = e2;
                    }
                }
                if (e != null) {
                    throw e;
                }
                return;
            }
            throw new IOException("Failed to list contents of " + file);
        } else {
            throw new IllegalArgumentException(file + " is not a directory");
        }
    }

    public static boolean contentEquals(File file, File file2) {
        FileInputStream fileInputStream;
        boolean exists = file.exists();
        if (exists != file2.exists()) {
            return false;
        }
        if (!exists) {
            return true;
        }
        if (file.isDirectory() || file2.isDirectory()) {
            throw new IOException("Can't compare directories, only files");
        } else if (file.length() != file2.length()) {
            return false;
        } else {
            if (file.getCanonicalFile().equals(file2.getCanonicalFile())) {
                return true;
            }
            FileInputStream fileInputStream2 = null;
            try {
                FileInputStream fileInputStream3 = new FileInputStream(file);
                try {
                    fileInputStream = new FileInputStream(file2);
                    try {
                        boolean contentEquals = IOUtils.contentEquals((InputStream) fileInputStream3, (InputStream) fileInputStream);
                        IOUtils.closeQuietly((InputStream) fileInputStream3);
                        IOUtils.closeQuietly((InputStream) fileInputStream);
                        return contentEquals;
                    } catch (Throwable th) {
                        th = th;
                        fileInputStream2 = fileInputStream3;
                        IOUtils.closeQuietly((InputStream) fileInputStream2);
                        IOUtils.closeQuietly((InputStream) fileInputStream);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    fileInputStream = null;
                    fileInputStream2 = fileInputStream3;
                    IOUtils.closeQuietly((InputStream) fileInputStream2);
                    IOUtils.closeQuietly((InputStream) fileInputStream);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                fileInputStream = null;
                IOUtils.closeQuietly((InputStream) fileInputStream2);
                IOUtils.closeQuietly((InputStream) fileInputStream);
                throw th;
            }
        }
    }

    public static boolean contentEqualsIgnoreEOL(File file, File file2, String str) {
        InputStreamReader inputStreamReader;
        InputStreamReader inputStreamReader2;
        InputStreamReader inputStreamReader3;
        boolean exists = file.exists();
        if (exists != file2.exists()) {
            return false;
        }
        if (!exists) {
            return true;
        }
        if (file.isDirectory() || file2.isDirectory()) {
            throw new IOException("Can't compare directories, only files");
        } else if (file.getCanonicalFile().equals(file2.getCanonicalFile())) {
            return true;
        } else {
            InputStreamReader inputStreamReader4 = null;
            if (str == null) {
                try {
                    inputStreamReader3 = new InputStreamReader(new FileInputStream(file));
                } catch (Throwable th) {
                    th = th;
                    inputStreamReader = null;
                    IOUtils.closeQuietly((Reader) inputStreamReader4);
                    IOUtils.closeQuietly((Reader) inputStreamReader);
                    throw th;
                }
                try {
                    inputStreamReader2 = new InputStreamReader(new FileInputStream(file2));
                    inputStreamReader4 = inputStreamReader3;
                } catch (Throwable th2) {
                    th = th2;
                    inputStreamReader = null;
                    inputStreamReader4 = inputStreamReader3;
                    IOUtils.closeQuietly((Reader) inputStreamReader4);
                    IOUtils.closeQuietly((Reader) inputStreamReader);
                    throw th;
                }
            } else {
                InputStreamReader inputStreamReader5 = new InputStreamReader(new FileInputStream(file), str);
                try {
                    inputStreamReader2 = new InputStreamReader(new FileInputStream(file2), str);
                    inputStreamReader4 = inputStreamReader5;
                } catch (Throwable th3) {
                    th = th3;
                    inputStreamReader = null;
                    inputStreamReader4 = inputStreamReader5;
                    IOUtils.closeQuietly((Reader) inputStreamReader4);
                    IOUtils.closeQuietly((Reader) inputStreamReader);
                    throw th;
                }
            }
            try {
                boolean contentEqualsIgnoreEOL = IOUtils.contentEqualsIgnoreEOL(inputStreamReader4, inputStreamReader2);
                IOUtils.closeQuietly((Reader) inputStreamReader4);
                IOUtils.closeQuietly((Reader) inputStreamReader2);
                return contentEqualsIgnoreEOL;
            } catch (Throwable th4) {
                Throwable th5 = th4;
                inputStreamReader = inputStreamReader2;
                th = th5;
                IOUtils.closeQuietly((Reader) inputStreamReader4);
                IOUtils.closeQuietly((Reader) inputStreamReader);
                throw th;
            }
        }
    }

    public static File[] convertFileCollectionToFileArray(Collection<File> collection) {
        return (File[]) collection.toArray(new File[collection.size()]);
    }

    public static void copyDirectory(File file, File file2) {
        copyDirectory(file, file2, true);
    }

    public static void copyDirectory(File file, File file2, FileFilter fileFilter) {
        copyDirectory(file, file2, fileFilter, true);
    }

    public static void copyDirectory(File file, File file2, FileFilter fileFilter, boolean z) {
        Objects.requireNonNull(file, "Source must not be null");
        Objects.requireNonNull(file2, "Destination must not be null");
        if (!file.exists()) {
            throw new FileNotFoundException("Source '" + file + "' does not exist");
        } else if (!file.isDirectory()) {
            throw new IOException("Source '" + file + "' exists but is not a directory");
        } else if (!file.getCanonicalPath().equals(file2.getCanonicalPath())) {
            ArrayList arrayList = null;
            if (file2.getCanonicalPath().startsWith(file.getCanonicalPath())) {
                File[] listFiles = fileFilter == null ? file.listFiles() : file.listFiles(fileFilter);
                if (listFiles != null && listFiles.length > 0) {
                    arrayList = new ArrayList(listFiles.length);
                    for (File name : listFiles) {
                        arrayList.add(new File(file2, name.getName()).getCanonicalPath());
                    }
                }
            }
            doCopyDirectory(file, file2, fileFilter, z, arrayList);
        } else {
            throw new IOException("Source '" + file + "' and destination '" + file2 + "' are the same");
        }
    }

    public static void copyDirectory(File file, File file2, boolean z) {
        copyDirectory(file, file2, (FileFilter) null, z);
    }

    public static void copyDirectoryToDirectory(File file, File file2) {
        Objects.requireNonNull(file, "Source must not be null");
        if (!file.exists() || file.isDirectory()) {
            Objects.requireNonNull(file2, "Destination must not be null");
            if (!file2.exists() || file2.isDirectory()) {
                copyDirectory(file, new File(file2, file.getName()), true);
                return;
            }
            throw new IllegalArgumentException("Destination '" + file2 + "' is not a directory");
        }
        throw new IllegalArgumentException("Source '" + file2 + "' is not a directory");
    }

    public static long copyFile(File file, OutputStream outputStream) {
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            return IOUtils.copyLarge((InputStream) fileInputStream, outputStream);
        } finally {
            fileInputStream.close();
        }
    }

    public static void copyFile(File file, File file2) {
        copyFile(file, file2, true);
    }

    public static void copyFile(File file, File file2, boolean z) {
        Objects.requireNonNull(file, "Source must not be null");
        Objects.requireNonNull(file2, "Destination must not be null");
        if (!file.exists()) {
            throw new FileNotFoundException("Source '" + file + "' does not exist");
        } else if (file.isDirectory()) {
            throw new IOException("Source '" + file + "' exists but is a directory");
        } else if (!file.getCanonicalPath().equals(file2.getCanonicalPath())) {
            File parentFile = file2.getParentFile();
            if (parentFile != null && !parentFile.mkdirs() && !parentFile.isDirectory()) {
                throw new IOException("Destination '" + parentFile + "' directory cannot be created");
            } else if (!file2.exists() || file2.canWrite()) {
                doCopyFile(file, file2, z);
            } else {
                throw new IOException("Destination '" + file2 + "' exists but is read-only");
            }
        } else {
            throw new IOException("Source '" + file + "' and destination '" + file2 + "' are the same");
        }
    }

    public static void copyFileToDirectory(File file, File file2) {
        copyFileToDirectory(file, file2, true);
    }

    public static void copyFileToDirectory(File file, File file2, boolean z) {
        Objects.requireNonNull(file2, "Destination must not be null");
        if (!file2.exists() || file2.isDirectory()) {
            copyFile(file, new File(file2, file.getName()), z);
            return;
        }
        throw new IllegalArgumentException("Destination '" + file2 + "' is not a directory");
    }

    public static void copyInputStreamToFile(InputStream inputStream, File file) {
        FileOutputStream openOutputStream;
        try {
            openOutputStream = openOutputStream(file);
            IOUtils.copy(inputStream, (OutputStream) openOutputStream);
            openOutputStream.close();
            IOUtils.closeQuietly((OutputStream) openOutputStream);
            IOUtils.closeQuietly(inputStream);
        } catch (Throwable th) {
            IOUtils.closeQuietly(inputStream);
            throw th;
        }
    }

    public static void copyURLToFile(URL url, File file) {
        copyInputStreamToFile(url.openStream(), file);
    }

    public static void copyURLToFile(URL url, File file, int i, int i2) {
        URLConnection openConnection = url.openConnection();
        openConnection.setConnectTimeout(i);
        openConnection.setReadTimeout(i2);
        copyInputStreamToFile(openConnection.getInputStream(), file);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x005a, code lost:
        r8 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x005f, code lost:
        if (r3.position() > 0) goto L_0x0061;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0061, code lost:
        r3.flip();
        r2.append(UTF8.decode(r3).toString());
        r3.clear();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0074, code lost:
        throw r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x007c, code lost:
        r3.flip();
        r2.append(UTF8.decode(r3).toString());
        r3.clear();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x005a A[ExcHandler: all (r8v2 'th' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:8:0x0024] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x007c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static java.lang.String decodeUrl(java.lang.String r8) {
        /*
            if (r8 == 0) goto L_0x009f
            r0 = 37
            int r1 = r8.indexOf(r0)
            if (r1 < 0) goto L_0x009f
            int r1 = r8.length()
            java.lang.StringBuffer r2 = new java.lang.StringBuffer
            r2.<init>()
            java.nio.ByteBuffer r3 = java.nio.ByteBuffer.allocate(r1)
            r4 = 0
        L_0x0018:
            if (r4 >= r1) goto L_0x009b
            char r5 = r8.charAt(r4)
            if (r5 != r0) goto L_0x008f
        L_0x0020:
            int r5 = r4 + 1
            int r6 = r4 + 3
            java.lang.String r5 = r8.substring(r5, r6)     // Catch:{ RuntimeException -> 0x0075, all -> 0x005a }
            r7 = 16
            int r5 = java.lang.Integer.parseInt(r5, r7)     // Catch:{ RuntimeException -> 0x0075, all -> 0x005a }
            byte r5 = (byte) r5     // Catch:{ RuntimeException -> 0x0075, all -> 0x005a }
            r3.put(r5)     // Catch:{ RuntimeException -> 0x0075, all -> 0x005a }
            if (r6 >= r1) goto L_0x003f
            char r4 = r8.charAt(r6)     // Catch:{ RuntimeException -> 0x003d, all -> 0x005a }
            if (r4 == r0) goto L_0x003b
            goto L_0x003f
        L_0x003b:
            r4 = r6
            goto L_0x0020
        L_0x003d:
            r4 = r6
            goto L_0x0076
        L_0x003f:
            int r4 = r3.position()
            if (r4 <= 0) goto L_0x0058
            r3.flip()
            java.nio.charset.Charset r4 = UTF8
            java.nio.CharBuffer r4 = r4.decode(r3)
            java.lang.String r4 = r4.toString()
            r2.append(r4)
            r3.clear()
        L_0x0058:
            r4 = r6
            goto L_0x0018
        L_0x005a:
            r8 = move-exception
            int r0 = r3.position()
            if (r0 <= 0) goto L_0x0074
            r3.flip()
            java.nio.charset.Charset r0 = UTF8
            java.nio.CharBuffer r0 = r0.decode(r3)
            java.lang.String r0 = r0.toString()
            r2.append(r0)
            r3.clear()
        L_0x0074:
            throw r8
        L_0x0075:
        L_0x0076:
            int r5 = r3.position()
            if (r5 <= 0) goto L_0x008f
            r3.flip()
            java.nio.charset.Charset r5 = UTF8
            java.nio.CharBuffer r5 = r5.decode(r3)
            java.lang.String r5 = r5.toString()
            r2.append(r5)
            r3.clear()
        L_0x008f:
            int r5 = r4 + 1
            char r4 = r8.charAt(r4)
            r2.append(r4)
            r4 = r5
            goto L_0x0018
        L_0x009b:
            java.lang.String r8 = r2.toString()
        L_0x009f:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.p194io.FileUtils.decodeUrl(java.lang.String):java.lang.String");
    }

    public static void deleteDirectory(File file) {
        if (file.exists()) {
            if (!isSymlink(file)) {
                cleanDirectory(file);
            }
            if (!file.delete()) {
                throw new IOException("Unable to delete directory " + file + ".");
            }
        }
    }

    private static void deleteDirectoryOnExit(File file) {
        if (file.exists()) {
            file.deleteOnExit();
            if (!isSymlink(file)) {
                cleanDirectoryOnExit(file);
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:3|4|(1:6)|7|8|9) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0012, code lost:
        return false;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x000d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean deleteQuietly(java.io.File r2) {
        /*
            r0 = 0
            if (r2 != 0) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r2.isDirectory()     // Catch:{ Exception -> 0x000d }
            if (r1 == 0) goto L_0x000d
            cleanDirectory(r2)     // Catch:{ Exception -> 0x000d }
        L_0x000d:
            boolean r2 = r2.delete()     // Catch:{ Exception -> 0x0012 }
            return r2
        L_0x0012:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.p194io.FileUtils.deleteQuietly(java.io.File):boolean");
    }

    public static boolean directoryContains(File file, File file2) {
        if (file == null) {
            throw new IllegalArgumentException("Directory must not be null");
        } else if (!file.isDirectory()) {
            throw new IllegalArgumentException("Not a directory: " + file);
        } else if (file2 != null && file.exists() && file2.exists()) {
            return FilenameUtils.directoryContains(file.getCanonicalPath(), file2.getCanonicalPath());
        } else {
            return false;
        }
    }

    private static void doCopyDirectory(File file, File file2, FileFilter fileFilter, boolean z, List<String> list) {
        File[] listFiles = fileFilter == null ? file.listFiles() : file.listFiles(fileFilter);
        if (listFiles != null) {
            if (file2.exists()) {
                if (!file2.isDirectory()) {
                    throw new IOException("Destination '" + file2 + "' exists but is not a directory");
                }
            } else if (!file2.mkdirs() && !file2.isDirectory()) {
                throw new IOException("Destination '" + file2 + "' directory cannot be created");
            }
            if (file2.canWrite()) {
                for (File file3 : listFiles) {
                    File file4 = new File(file2, file3.getName());
                    if (list == null || !list.contains(file3.getCanonicalPath())) {
                        if (file3.isDirectory()) {
                            doCopyDirectory(file3, file4, fileFilter, z, list);
                        } else {
                            doCopyFile(file3, file4, z);
                        }
                    }
                }
                if (z) {
                    file2.setLastModified(file.lastModified());
                    return;
                }
                return;
            }
            throw new IOException("Destination '" + file2 + "' cannot be written to");
        }
        throw new IOException("Failed to list contents of " + file);
    }

    private static void doCopyFile(File file, File file2, boolean z) {
        FileChannel fileChannel;
        FileOutputStream fileOutputStream;
        FileInputStream fileInputStream;
        File file3 = file;
        File file4 = file2;
        if (!file2.exists() || !file2.isDirectory()) {
            try {
                fileInputStream = new FileInputStream(file3);
                try {
                    fileOutputStream = new FileOutputStream(file4);
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream = null;
                    fileChannel = fileOutputStream;
                    IOUtils.closeQuietly((Closeable) null);
                    IOUtils.closeQuietly((OutputStream) fileOutputStream);
                    IOUtils.closeQuietly((Closeable) fileChannel);
                    IOUtils.closeQuietly((InputStream) fileInputStream);
                    throw th;
                }
                try {
                    FileChannel channel = fileInputStream.getChannel();
                    try {
                        FileChannel channel2 = fileOutputStream.getChannel();
                        long size = channel.size();
                        long j = 0;
                        while (j < size) {
                            long j2 = size - j;
                            j += channel2.transferFrom(channel, j, j2 > FILE_COPY_BUFFER_SIZE ? 31457280 : j2);
                        }
                        IOUtils.closeQuietly((Closeable) channel2);
                        IOUtils.closeQuietly((OutputStream) fileOutputStream);
                        IOUtils.closeQuietly((Closeable) channel);
                        IOUtils.closeQuietly((InputStream) fileInputStream);
                        if (file.length() != file2.length()) {
                            throw new IOException("Failed to copy full contents from '" + file3 + "' to '" + file4 + "'");
                        } else if (z) {
                            file4.setLastModified(file.lastModified());
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        fileChannel = channel;
                        IOUtils.closeQuietly((Closeable) null);
                        IOUtils.closeQuietly((OutputStream) fileOutputStream);
                        IOUtils.closeQuietly((Closeable) fileChannel);
                        IOUtils.closeQuietly((InputStream) fileInputStream);
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    fileChannel = null;
                    IOUtils.closeQuietly((Closeable) null);
                    IOUtils.closeQuietly((OutputStream) fileOutputStream);
                    IOUtils.closeQuietly((Closeable) fileChannel);
                    IOUtils.closeQuietly((InputStream) fileInputStream);
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                fileInputStream = null;
                fileOutputStream = null;
                fileChannel = fileOutputStream;
                IOUtils.closeQuietly((Closeable) null);
                IOUtils.closeQuietly((OutputStream) fileOutputStream);
                IOUtils.closeQuietly((Closeable) fileChannel);
                IOUtils.closeQuietly((InputStream) fileInputStream);
                throw th;
            }
        } else {
            throw new IOException("Destination '" + file4 + "' exists but is a directory");
        }
    }

    public static void forceDelete(File file) {
        if (file.isDirectory()) {
            deleteDirectory(file);
            return;
        }
        boolean exists = file.exists();
        if (file.delete()) {
            return;
        }
        if (!exists) {
            throw new FileNotFoundException("File does not exist: " + file);
        }
        throw new IOException("Unable to delete file: " + file);
    }

    public static void forceDeleteOnExit(File file) {
        if (file.isDirectory()) {
            deleteDirectoryOnExit(file);
        } else {
            file.deleteOnExit();
        }
    }

    public static void forceMkdir(File file) {
        if (file.exists()) {
            if (!file.isDirectory()) {
                throw new IOException("File " + file + " exists and is " + "not a directory. Unable to create directory.");
            }
        } else if (!file.mkdirs() && !file.isDirectory()) {
            throw new IOException("Unable to create directory " + file);
        }
    }

    public static File getFile(File file, String... strArr) {
        Objects.requireNonNull(file, "directorydirectory must not be null");
        Objects.requireNonNull(strArr, "names must not be null");
        int length = strArr.length;
        int i = 0;
        while (i < length) {
            i++;
            file = new File(file, strArr[i]);
        }
        return file;
    }

    public static File getFile(String... strArr) {
        Objects.requireNonNull(strArr, "names must not be null");
        File file = null;
        for (String str : strArr) {
            file = file == null ? new File(str) : new File(file, str);
        }
        return file;
    }

    public static File getTempDirectory() {
        return new File(getTempDirectoryPath());
    }

    public static String getTempDirectoryPath() {
        return System.getProperty("java.io.tmpdir");
    }

    public static File getUserDirectory() {
        return new File(getUserDirectoryPath());
    }

    public static String getUserDirectoryPath() {
        return System.getProperty("user.home");
    }

    private static void innerListFiles(Collection<File> collection, File file, IOFileFilter iOFileFilter, boolean z) {
        File[] listFiles = file.listFiles(iOFileFilter);
        if (listFiles != null) {
            for (File file2 : listFiles) {
                if (file2.isDirectory()) {
                    if (z) {
                        collection.add(file2);
                    }
                    innerListFiles(collection, file2, iOFileFilter, z);
                } else {
                    collection.add(file2);
                }
            }
        }
    }

    public static boolean isFileNewer(File file, long j) {
        if (file != null) {
            return file.exists() && file.lastModified() > j;
        }
        throw new IllegalArgumentException("No specified file");
    }

    public static boolean isFileNewer(File file, File file2) {
        if (file2 == null) {
            throw new IllegalArgumentException("No specified reference file");
        } else if (file2.exists()) {
            return isFileNewer(file, file2.lastModified());
        } else {
            throw new IllegalArgumentException("The reference file '" + file2 + "' doesn't exist");
        }
    }

    public static boolean isFileNewer(File file, Date date) {
        if (date != null) {
            return isFileNewer(file, date.getTime());
        }
        throw new IllegalArgumentException("No specified date");
    }

    public static boolean isFileOlder(File file, long j) {
        if (file != null) {
            return file.exists() && file.lastModified() < j;
        }
        throw new IllegalArgumentException("No specified file");
    }

    public static boolean isFileOlder(File file, File file2) {
        if (file2 == null) {
            throw new IllegalArgumentException("No specified reference file");
        } else if (file2.exists()) {
            return isFileOlder(file, file2.lastModified());
        } else {
            throw new IllegalArgumentException("The reference file '" + file2 + "' doesn't exist");
        }
    }

    public static boolean isFileOlder(File file, Date date) {
        if (date != null) {
            return isFileOlder(file, date.getTime());
        }
        throw new IllegalArgumentException("No specified date");
    }

    public static boolean isSymlink(File file) {
        Objects.requireNonNull(file, "File must not be null");
        if (FilenameUtils.isSystemWindows()) {
            return false;
        }
        if (file.getParent() != null) {
            file = new File(file.getParentFile().getCanonicalFile(), file.getName());
        }
        return !file.getCanonicalFile().equals(file.getAbsoluteFile());
    }

    public static Iterator<File> iterateFiles(File file, IOFileFilter iOFileFilter, IOFileFilter iOFileFilter2) {
        return listFiles(file, iOFileFilter, iOFileFilter2).iterator();
    }

    public static Iterator<File> iterateFiles(File file, String[] strArr, boolean z) {
        return listFiles(file, strArr, z).iterator();
    }

    public static Iterator<File> iterateFilesAndDirs(File file, IOFileFilter iOFileFilter, IOFileFilter iOFileFilter2) {
        return listFilesAndDirs(file, iOFileFilter, iOFileFilter2).iterator();
    }

    public static LineIterator lineIterator(File file) {
        return lineIterator(file, (String) null);
    }

    public static LineIterator lineIterator(File file, String str) {
        try {
            return IOUtils.lineIterator((InputStream) openInputStream(file), str);
        } catch (IOException e) {
            IOUtils.closeQuietly((InputStream) null);
            throw e;
        } catch (RuntimeException e2) {
            IOUtils.closeQuietly((InputStream) null);
            throw e2;
        }
    }

    public static Collection<File> listFiles(File file, IOFileFilter iOFileFilter, IOFileFilter iOFileFilter2) {
        validateListFilesParameters(file, iOFileFilter);
        IOFileFilter upEffectiveFileFilter = setUpEffectiveFileFilter(iOFileFilter);
        IOFileFilter upEffectiveDirFilter = setUpEffectiveDirFilter(iOFileFilter2);
        LinkedList linkedList = new LinkedList();
        innerListFiles(linkedList, file, FileFilterUtils.m23810or(upEffectiveFileFilter, upEffectiveDirFilter), false);
        return linkedList;
    }

    public static Collection<File> listFiles(File file, String[] strArr, boolean z) {
        return listFiles(file, strArr == null ? TrueFileFilter.INSTANCE : new SuffixFileFilter(toSuffixes(strArr)), z ? TrueFileFilter.INSTANCE : FalseFileFilter.INSTANCE);
    }

    public static Collection<File> listFilesAndDirs(File file, IOFileFilter iOFileFilter, IOFileFilter iOFileFilter2) {
        validateListFilesParameters(file, iOFileFilter);
        IOFileFilter upEffectiveFileFilter = setUpEffectiveFileFilter(iOFileFilter);
        IOFileFilter upEffectiveDirFilter = setUpEffectiveDirFilter(iOFileFilter2);
        LinkedList linkedList = new LinkedList();
        if (file.isDirectory()) {
            linkedList.add(file);
        }
        innerListFiles(linkedList, file, FileFilterUtils.m23810or(upEffectiveFileFilter, upEffectiveDirFilter), true);
        return linkedList;
    }

    public static void moveDirectory(File file, File file2) {
        Objects.requireNonNull(file, "Source must not be null");
        Objects.requireNonNull(file2, "Destination must not be null");
        if (!file.exists()) {
            throw new FileNotFoundException("Source '" + file + "' does not exist");
        } else if (!file.isDirectory()) {
            throw new IOException("Source '" + file + "' is not a directory");
        } else if (file2.exists()) {
            throw new FileExistsException("Destination '" + file2 + "' already exists");
        } else if (file.renameTo(file2)) {
        } else {
            if (!file2.getCanonicalPath().startsWith(file.getCanonicalPath())) {
                copyDirectory(file, file2);
                deleteDirectory(file);
                if (file.exists()) {
                    throw new IOException("Failed to delete original directory '" + file + "' after copy to '" + file2 + "'");
                }
                return;
            }
            throw new IOException("Cannot move directory: " + file + " to a subdirectory of itself: " + file2);
        }
    }

    public static void moveDirectoryToDirectory(File file, File file2, boolean z) {
        Objects.requireNonNull(file, "Source must not be null");
        Objects.requireNonNull(file2, "Destination directory must not be null");
        if (!file2.exists() && z) {
            file2.mkdirs();
        }
        if (!file2.exists()) {
            throw new FileNotFoundException("Destination directory '" + file2 + "' does not exist [createDestDir=" + z + "]");
        } else if (file2.isDirectory()) {
            moveDirectory(file, new File(file2, file.getName()));
        } else {
            throw new IOException("Destination '" + file2 + "' is not a directory");
        }
    }

    public static void moveFile(File file, File file2) {
        Objects.requireNonNull(file, "Source must not be null");
        Objects.requireNonNull(file2, "Destination must not be null");
        if (!file.exists()) {
            throw new FileNotFoundException("Source '" + file + "' does not exist");
        } else if (file.isDirectory()) {
            throw new IOException("Source '" + file + "' is a directory");
        } else if (file2.exists()) {
            throw new FileExistsException("Destination '" + file2 + "' already exists");
        } else if (file2.isDirectory()) {
            throw new IOException("Destination '" + file2 + "' is a directory");
        } else if (!file.renameTo(file2)) {
            copyFile(file, file2);
            if (!file.delete()) {
                deleteQuietly(file2);
                throw new IOException("Failed to delete original file '" + file + "' after copy to '" + file2 + "'");
            }
        }
    }

    public static void moveFileToDirectory(File file, File file2, boolean z) {
        Objects.requireNonNull(file, "Source must not be null");
        Objects.requireNonNull(file2, "Destination directory must not be null");
        if (!file2.exists() && z) {
            file2.mkdirs();
        }
        if (!file2.exists()) {
            throw new FileNotFoundException("Destination directory '" + file2 + "' does not exist [createDestDir=" + z + "]");
        } else if (file2.isDirectory()) {
            moveFile(file, new File(file2, file.getName()));
        } else {
            throw new IOException("Destination '" + file2 + "' is not a directory");
        }
    }

    public static void moveToDirectory(File file, File file2, boolean z) {
        Objects.requireNonNull(file, "Source must not be null");
        Objects.requireNonNull(file2, "Destination must not be null");
        if (!file.exists()) {
            throw new FileNotFoundException("Source '" + file + "' does not exist");
        } else if (file.isDirectory()) {
            moveDirectoryToDirectory(file, file2, z);
        } else {
            moveFileToDirectory(file, file2, z);
        }
    }

    public static FileInputStream openInputStream(File file) {
        if (!file.exists()) {
            throw new FileNotFoundException("File '" + file + "' does not exist");
        } else if (file.isDirectory()) {
            throw new IOException("File '" + file + "' exists but is a directory");
        } else if (file.canRead()) {
            return new FileInputStream(file);
        } else {
            throw new IOException("File '" + file + "' cannot be read");
        }
    }

    public static FileOutputStream openOutputStream(File file) {
        return openOutputStream(file, false);
    }

    public static FileOutputStream openOutputStream(File file, boolean z) {
        if (!file.exists()) {
            File parentFile = file.getParentFile();
            if (parentFile != null && !parentFile.mkdirs() && !parentFile.isDirectory()) {
                throw new IOException("Directory '" + parentFile + "' could not be created");
            }
        } else if (file.isDirectory()) {
            throw new IOException("File '" + file + "' exists but is a directory");
        } else if (!file.canWrite()) {
            throw new IOException("File '" + file + "' cannot be written to");
        }
        return new FileOutputStream(file, z);
    }

    public static byte[] readFileToByteArray(File file) {
        FileInputStream fileInputStream;
        try {
            fileInputStream = openInputStream(file);
            try {
                byte[] byteArray = IOUtils.toByteArray((InputStream) fileInputStream, file.length());
                IOUtils.closeQuietly((InputStream) fileInputStream);
                return byteArray;
            } catch (Throwable th) {
                th = th;
                IOUtils.closeQuietly((InputStream) fileInputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            fileInputStream = null;
            IOUtils.closeQuietly((InputStream) fileInputStream);
            throw th;
        }
    }

    public static String readFileToString(File file) {
        return readFileToString(file, Charset.defaultCharset());
    }

    public static String readFileToString(File file, String str) {
        return readFileToString(file, Charsets.toCharset(str));
    }

    public static String readFileToString(File file, Charset charset) {
        FileInputStream fileInputStream;
        try {
            fileInputStream = openInputStream(file);
            try {
                String iOUtils = IOUtils.toString((InputStream) fileInputStream, Charsets.toCharset(charset));
                IOUtils.closeQuietly((InputStream) fileInputStream);
                return iOUtils;
            } catch (Throwable th) {
                th = th;
                IOUtils.closeQuietly((InputStream) fileInputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            fileInputStream = null;
            IOUtils.closeQuietly((InputStream) fileInputStream);
            throw th;
        }
    }

    public static List<String> readLines(File file) {
        return readLines(file, Charset.defaultCharset());
    }

    public static List<String> readLines(File file, String str) {
        return readLines(file, Charsets.toCharset(str));
    }

    public static List<String> readLines(File file, Charset charset) {
        FileInputStream fileInputStream;
        try {
            fileInputStream = openInputStream(file);
            try {
                List<String> readLines = IOUtils.readLines((InputStream) fileInputStream, Charsets.toCharset(charset));
                IOUtils.closeQuietly((InputStream) fileInputStream);
                return readLines;
            } catch (Throwable th) {
                th = th;
                IOUtils.closeQuietly((InputStream) fileInputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            fileInputStream = null;
            IOUtils.closeQuietly((InputStream) fileInputStream);
            throw th;
        }
    }

    private static IOFileFilter setUpEffectiveDirFilter(IOFileFilter iOFileFilter) {
        if (iOFileFilter == null) {
            return FalseFileFilter.INSTANCE;
        }
        return FileFilterUtils.and(iOFileFilter, DirectoryFileFilter.INSTANCE);
    }

    private static IOFileFilter setUpEffectiveFileFilter(IOFileFilter iOFileFilter) {
        return FileFilterUtils.and(iOFileFilter, FileFilterUtils.notFileFilter(DirectoryFileFilter.INSTANCE));
    }

    public static long sizeOf(File file) {
        if (file.exists()) {
            return file.isDirectory() ? sizeOfDirectory(file) : file.length();
        }
        throw new IllegalArgumentException(file + " does not exist");
    }

    public static BigInteger sizeOfAsBigInteger(File file) {
        if (file.exists()) {
            return file.isDirectory() ? sizeOfDirectoryAsBigInteger(file) : BigInteger.valueOf(file.length());
        }
        throw new IllegalArgumentException(file + " does not exist");
    }

    public static long sizeOfDirectory(File file) {
        checkDirectory(file);
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            return 0;
        }
        long j = 0;
        for (File file2 : listFiles) {
            try {
                if (!isSymlink(file2)) {
                    j += sizeOf(file2);
                    if (j < 0) {
                        break;
                    }
                } else {
                    continue;
                }
            } catch (IOException unused) {
            }
        }
        return j;
    }

    public static BigInteger sizeOfDirectoryAsBigInteger(File file) {
        checkDirectory(file);
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            return BigInteger.ZERO;
        }
        BigInteger bigInteger = BigInteger.ZERO;
        for (File file2 : listFiles) {
            try {
                if (!isSymlink(file2)) {
                    bigInteger = bigInteger.add(BigInteger.valueOf(sizeOf(file2)));
                }
            } catch (IOException unused) {
            }
        }
        return bigInteger;
    }

    public static File toFile(URL url) {
        if (url == null || !"file".equalsIgnoreCase(url.getProtocol())) {
            return null;
        }
        return new File(decodeUrl(url.getFile().replace(IOUtils.DIR_SEPARATOR_UNIX, File.separatorChar)));
    }

    public static File[] toFiles(URL[] urlArr) {
        if (urlArr == null || urlArr.length == 0) {
            return EMPTY_FILE_ARRAY;
        }
        File[] fileArr = new File[urlArr.length];
        for (int i = 0; i < urlArr.length; i++) {
            URL url = urlArr[i];
            if (url != null) {
                if (url.getProtocol().equals("file")) {
                    fileArr[i] = toFile(url);
                } else {
                    throw new IllegalArgumentException("URL could not be converted to a File: " + url);
                }
            }
        }
        return fileArr;
    }

    private static String[] toSuffixes(String[] strArr) {
        String[] strArr2 = new String[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            strArr2[i] = "." + strArr[i];
        }
        return strArr2;
    }

    public static URL[] toURLs(File[] fileArr) {
        int length = fileArr.length;
        URL[] urlArr = new URL[length];
        for (int i = 0; i < length; i++) {
            urlArr[i] = fileArr[i].toURI().toURL();
        }
        return urlArr;
    }

    public static void touch(File file) {
        if (!file.exists()) {
            IOUtils.closeQuietly((OutputStream) openOutputStream(file));
        }
        if (!file.setLastModified(System.currentTimeMillis())) {
            throw new IOException("Unable to set the last modification time for " + file);
        }
    }

    private static void validateListFilesParameters(File file, IOFileFilter iOFileFilter) {
        if (file.isDirectory()) {
            Objects.requireNonNull(iOFileFilter, "Parameter 'fileFilter' is null");
            return;
        }
        throw new IllegalArgumentException("Parameter 'directory' is not a directory");
    }

    public static boolean waitFor(File file, int i) {
        int i2 = 0;
        int i3 = 0;
        while (!file.exists()) {
            int i4 = i2 + 1;
            if (i2 >= 10) {
                int i5 = i3 + 1;
                if (i3 > i) {
                    return false;
                }
                i3 = i5;
                i2 = 0;
            } else {
                i2 = i4;
            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException unused) {
            } catch (Exception unused2) {
                return true;
            }
        }
        return true;
    }

    public static void write(File file, CharSequence charSequence) {
        write(file, charSequence, Charset.defaultCharset(), false);
    }

    public static void write(File file, CharSequence charSequence, String str) {
        write(file, charSequence, str, false);
    }

    public static void write(File file, CharSequence charSequence, String str, boolean z) {
        write(file, charSequence, Charsets.toCharset(str), z);
    }

    public static void write(File file, CharSequence charSequence, Charset charset) {
        write(file, charSequence, charset, false);
    }

    public static void write(File file, CharSequence charSequence, Charset charset, boolean z) {
        writeStringToFile(file, charSequence == null ? null : charSequence.toString(), charset, z);
    }

    public static void write(File file, CharSequence charSequence, boolean z) {
        write(file, charSequence, Charset.defaultCharset(), z);
    }

    public static void writeByteArrayToFile(File file, byte[] bArr) {
        writeByteArrayToFile(file, bArr, false);
    }

    public static void writeByteArrayToFile(File file, byte[] bArr, boolean z) {
        FileOutputStream fileOutputStream;
        try {
            fileOutputStream = openOutputStream(file, z);
            try {
                fileOutputStream.write(bArr);
                fileOutputStream.close();
                IOUtils.closeQuietly((OutputStream) fileOutputStream);
            } catch (Throwable th) {
                th = th;
                IOUtils.closeQuietly((OutputStream) fileOutputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream = null;
            IOUtils.closeQuietly((OutputStream) fileOutputStream);
            throw th;
        }
    }

    public static void writeLines(File file, String str, Collection<?> collection) {
        writeLines(file, str, collection, (String) null, false);
    }

    public static void writeLines(File file, String str, Collection<?> collection, String str2) {
        writeLines(file, str, collection, str2, false);
    }

    public static void writeLines(File file, String str, Collection<?> collection, String str2, boolean z) {
        FileOutputStream fileOutputStream;
        try {
            fileOutputStream = openOutputStream(file, z);
            try {
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
                IOUtils.writeLines(collection, str2, (OutputStream) bufferedOutputStream, str);
                bufferedOutputStream.flush();
                fileOutputStream.close();
                IOUtils.closeQuietly((OutputStream) fileOutputStream);
            } catch (Throwable th) {
                th = th;
                IOUtils.closeQuietly((OutputStream) fileOutputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream = null;
            IOUtils.closeQuietly((OutputStream) fileOutputStream);
            throw th;
        }
    }

    public static void writeLines(File file, String str, Collection<?> collection, boolean z) {
        writeLines(file, str, collection, (String) null, z);
    }

    public static void writeLines(File file, Collection<?> collection) {
        writeLines(file, (String) null, collection, (String) null, false);
    }

    public static void writeLines(File file, Collection<?> collection, String str) {
        writeLines(file, (String) null, collection, str, false);
    }

    public static void writeLines(File file, Collection<?> collection, String str, boolean z) {
        writeLines(file, (String) null, collection, str, z);
    }

    public static void writeLines(File file, Collection<?> collection, boolean z) {
        writeLines(file, (String) null, collection, (String) null, z);
    }

    public static void writeStringToFile(File file, String str) {
        writeStringToFile(file, str, Charset.defaultCharset(), false);
    }

    public static void writeStringToFile(File file, String str, String str2) {
        writeStringToFile(file, str, str2, false);
    }

    public static void writeStringToFile(File file, String str, String str2, boolean z) {
        writeStringToFile(file, str, Charsets.toCharset(str2), z);
    }

    public static void writeStringToFile(File file, String str, Charset charset) {
        writeStringToFile(file, str, charset, false);
    }

    public static void writeStringToFile(File file, String str, Charset charset, boolean z) {
        FileOutputStream fileOutputStream;
        try {
            fileOutputStream = openOutputStream(file, z);
            try {
                IOUtils.write(str, (OutputStream) fileOutputStream, charset);
                fileOutputStream.close();
                IOUtils.closeQuietly((OutputStream) fileOutputStream);
            } catch (Throwable th) {
                th = th;
                IOUtils.closeQuietly((OutputStream) fileOutputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream = null;
            IOUtils.closeQuietly((OutputStream) fileOutputStream);
            throw th;
        }
    }

    public static void writeStringToFile(File file, String str, boolean z) {
        writeStringToFile(file, str, Charset.defaultCharset(), z);
    }
}
