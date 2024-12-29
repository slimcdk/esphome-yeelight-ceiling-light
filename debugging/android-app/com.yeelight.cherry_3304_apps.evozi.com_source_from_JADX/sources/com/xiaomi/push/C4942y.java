package com.xiaomi.push;

import android.text.TextUtils;
import com.xiaomi.channel.commonutils.logger.C3989b;
import java.io.BufferedInputStream;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.util.Date;
import java.util.zip.GZIPOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/* renamed from: com.xiaomi.push.y */
public class C4942y {

    /* renamed from: a */
    public static final String[] f10219a = {"jpg", "png", "bmp", "gif", "webp"};

    /* renamed from: a */
    public static String m15883a(File file) {
        InputStreamReader inputStreamReader;
        StringWriter stringWriter = new StringWriter();
        InputStreamReader inputStreamReader2 = null;
        try {
            inputStreamReader = new InputStreamReader(new BufferedInputStream(new FileInputStream(file)));
            try {
                char[] cArr = new char[2048];
                while (true) {
                    int read = inputStreamReader.read(cArr);
                    if (read != -1) {
                        stringWriter.write(cArr, 0, read);
                    } else {
                        String stringWriter2 = stringWriter.toString();
                        m15884a((Closeable) inputStreamReader);
                        m15884a((Closeable) stringWriter);
                        return stringWriter2;
                    }
                }
            } catch (IOException e) {
                e = e;
                try {
                    C3989b.m10680c("read file :" + file.getAbsolutePath() + " failure :" + e.getMessage());
                    m15884a((Closeable) inputStreamReader);
                    m15884a((Closeable) stringWriter);
                    return null;
                } catch (Throwable th) {
                    th = th;
                    inputStreamReader2 = inputStreamReader;
                    m15884a((Closeable) inputStreamReader2);
                    m15884a((Closeable) stringWriter);
                    throw th;
                }
            }
        } catch (IOException e2) {
            e = e2;
            inputStreamReader = null;
            C3989b.m10680c("read file :" + file.getAbsolutePath() + " failure :" + e.getMessage());
            m15884a((Closeable) inputStreamReader);
            m15884a((Closeable) stringWriter);
            return null;
        } catch (Throwable th2) {
            th = th2;
            m15884a((Closeable) inputStreamReader2);
            m15884a((Closeable) stringWriter);
            throw th;
        }
    }

    /* renamed from: a */
    public static void m15884a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    public static void m15885a(File file) {
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            for (File a : listFiles) {
                m15883a(a);
            }
        } else if (!file.exists()) {
            return;
        }
        file.delete();
    }

    /* renamed from: a */
    public static void m15886a(File file, File file2) {
        ZipOutputStream zipOutputStream = null;
        try {
            ZipOutputStream zipOutputStream2 = new ZipOutputStream(new FileOutputStream(file, false));
            try {
                m15888a(zipOutputStream2, file2, (String) null, (FileFilter) null);
                m15884a((Closeable) zipOutputStream2);
            } catch (FileNotFoundException unused) {
                zipOutputStream = zipOutputStream2;
                m15884a((Closeable) zipOutputStream);
            } catch (IOException e) {
                e = e;
                zipOutputStream = zipOutputStream2;
                try {
                    C3989b.m10669a("zip file failure + " + e.getMessage());
                    m15884a((Closeable) zipOutputStream);
                } catch (Throwable th) {
                    th = th;
                }
            } catch (Throwable th2) {
                th = th2;
                zipOutputStream = zipOutputStream2;
                m15884a((Closeable) zipOutputStream);
                throw th;
            }
        } catch (FileNotFoundException unused2) {
            m15884a((Closeable) zipOutputStream);
        } catch (IOException e2) {
            e = e2;
            C3989b.m10669a("zip file failure + " + e.getMessage());
            m15884a((Closeable) zipOutputStream);
        }
    }

    /* renamed from: a */
    public static void m15887a(File file, String str) {
        if (!file.exists()) {
            C3989b.m10680c("mkdir " + file.getAbsolutePath());
            file.getParentFile().mkdirs();
        }
        BufferedWriter bufferedWriter = null;
        try {
            BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file)));
            try {
                bufferedWriter2.write(str);
                m15884a((Closeable) bufferedWriter2);
            } catch (IOException e) {
                e = e;
                bufferedWriter = bufferedWriter2;
                try {
                    C3989b.m10680c("write file :" + file.getAbsolutePath() + " failure :" + e.getMessage());
                    m15884a((Closeable) bufferedWriter);
                } catch (Throwable th) {
                    th = th;
                    m15884a((Closeable) bufferedWriter);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                bufferedWriter = bufferedWriter2;
                m15884a((Closeable) bufferedWriter);
                throw th;
            }
        } catch (IOException e2) {
            e = e2;
            C3989b.m10680c("write file :" + file.getAbsolutePath() + " failure :" + e.getMessage());
            m15884a((Closeable) bufferedWriter);
        }
    }

    /* renamed from: a */
    public static void m15888a(ZipOutputStream zipOutputStream, File file, String str, FileFilter fileFilter) {
        ZipEntry zipEntry;
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        FileInputStream fileInputStream = null;
        try {
            if (file.isDirectory()) {
                File[] listFiles = fileFilter != null ? file.listFiles(fileFilter) : file.listFiles();
                zipOutputStream.putNextEntry(new ZipEntry(str + File.separator));
                if (!TextUtils.isEmpty(str)) {
                    str2 = str + File.separator;
                }
                for (int i = 0; i < listFiles.length; i++) {
                    m15888a(zipOutputStream, listFiles[i], str2 + listFiles[i].getName(), (FileFilter) null);
                }
                File[] listFiles2 = file.listFiles(new C4943z());
                if (listFiles2 != null) {
                    for (File file2 : listFiles2) {
                        m15888a(zipOutputStream, file2, str2 + File.separator + file2.getName(), fileFilter);
                    }
                }
            } else {
                if (!TextUtils.isEmpty(str)) {
                    zipEntry = new ZipEntry(str);
                } else {
                    Date date = new Date();
                    zipEntry = new ZipEntry(String.valueOf(date.getTime()) + ".txt");
                }
                zipOutputStream.putNextEntry(zipEntry);
                FileInputStream fileInputStream2 = new FileInputStream(file);
                try {
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int read = fileInputStream2.read(bArr);
                        if (read == -1) {
                            break;
                        }
                        zipOutputStream.write(bArr, 0, read);
                    }
                    fileInputStream = fileInputStream2;
                } catch (IOException e) {
                    e = e;
                    fileInputStream = fileInputStream2;
                    try {
                        C3989b.m10681d("zipFiction failed with exception:" + e.toString());
                        m15884a((Closeable) fileInputStream);
                    } catch (Throwable th) {
                        th = th;
                        m15884a((Closeable) fileInputStream);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    fileInputStream = fileInputStream2;
                    m15884a((Closeable) fileInputStream);
                    throw th;
                }
            }
        } catch (IOException e2) {
            e = e2;
            C3989b.m10681d("zipFiction failed with exception:" + e.toString());
            m15884a((Closeable) fileInputStream);
        }
        m15884a((Closeable) fileInputStream);
    }

    /* renamed from: a */
    public static boolean m15889a(File file) {
        try {
            if (file.isDirectory()) {
                return false;
            }
            if (file.exists()) {
                return true;
            }
            File parentFile = file.getParentFile();
            if (parentFile.exists() || parentFile.mkdirs()) {
                return file.createNewFile();
            }
            return false;
        } catch (Throwable th) {
            th.printStackTrace();
            return false;
        }
    }

    /* renamed from: a */
    public static byte[] m15890a(byte[] bArr) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.finish();
            gZIPOutputStream.close();
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (Exception unused) {
            return bArr;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x003f  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m15891b(java.io.File r3, java.io.File r4) {
        /*
            java.lang.String r0 = r3.getAbsolutePath()
            java.lang.String r1 = r4.getAbsolutePath()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x000f
            return
        L_0x000f:
            r0 = 0
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{ all -> 0x0036 }
            r1.<init>(r3)     // Catch:{ all -> 0x0036 }
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ all -> 0x0032 }
            r3.<init>(r4)     // Catch:{ all -> 0x0032 }
            r4 = 1024(0x400, float:1.435E-42)
            byte[] r4 = new byte[r4]     // Catch:{ all -> 0x0030 }
        L_0x001e:
            int r0 = r1.read(r4)     // Catch:{ all -> 0x0030 }
            if (r0 < 0) goto L_0x0029
            r2 = 0
            r3.write(r4, r2, r0)     // Catch:{ all -> 0x0030 }
            goto L_0x001e
        L_0x0029:
            r1.close()
            r3.close()
            return
        L_0x0030:
            r4 = move-exception
            goto L_0x0034
        L_0x0032:
            r4 = move-exception
            r3 = r0
        L_0x0034:
            r0 = r1
            goto L_0x0038
        L_0x0036:
            r4 = move-exception
            r3 = r0
        L_0x0038:
            if (r0 == 0) goto L_0x003d
            r0.close()
        L_0x003d:
            if (r3 == 0) goto L_0x0042
            r3.close()
        L_0x0042:
            goto L_0x0044
        L_0x0043:
            throw r4
        L_0x0044:
            goto L_0x0043
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.C4942y.m15891b(java.io.File, java.io.File):void");
    }
}
