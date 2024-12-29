package com.yeelight.yeelib.utils;

import android.os.Environment;
import com.miot.service.common.crypto.rc4coder.Coder;
import com.miot.service.manager.timer.TimerCodec;
import com.yeelight.yeelib.p152f.C4297y;
import java.io.File;
import java.io.FileInputStream;
import java.math.BigInteger;
import java.security.MessageDigest;

/* renamed from: com.yeelight.yeelib.utils.o */
public class C10548o {

    /* renamed from: a */
    public static final String f20165a = "o";

    /* renamed from: a */
    public static void m25759a(File file) {
        if (!file.isDirectory()) {
            C4308b.m12139r(f20165a, "Target is not directory, fix me! dir: " + String.valueOf(file));
        }
        File[] listFiles = file.listFiles();
        if (listFiles == null || listFiles.length == 0) {
            file.delete();
            return;
        }
        for (File file2 : listFiles) {
            if (file2.isDirectory()) {
                m25759a(file2);
            } else {
                file2.delete();
            }
        }
        file.delete();
    }

    /* renamed from: b */
    public static boolean m25760b() {
        return "mounted".equals(Environment.getExternalStorageState());
    }

    /* renamed from: c */
    public static File m25761c() {
        return m25760b() ? C4297y.f7456e.getExternalCacheDir() : C4297y.f7456e.getCacheDir();
    }

    /* renamed from: d */
    public static String m25762d(File file) {
        if (!file.isFile()) {
            return null;
        }
        byte[] bArr = new byte[1024];
        try {
            MessageDigest instance = MessageDigest.getInstance(Coder.KEY_MD5);
            FileInputStream fileInputStream = new FileInputStream(file);
            while (true) {
                int read = fileInputStream.read(bArr, 0, 1024);
                if (read == -1) {
                    break;
                }
                instance.update(bArr, 0, read);
            }
            fileInputStream.close();
            String bigInteger = new BigInteger(1, instance.digest()).toString(16);
            while (bigInteger.length() < 32) {
                bigInteger = TimerCodec.DISENABLE + bigInteger;
            }
            return bigInteger;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: e */
    public static File m25763e(File file) {
        File[] listFiles;
        File file2 = null;
        if (file.exists() && file.isDirectory() && (listFiles = file.listFiles()) != null && listFiles.length != 0) {
            long j = 0;
            for (File file3 : listFiles) {
                if (file3.isDirectory() && file3.lastModified() > j) {
                    j = file3.lastModified();
                    file2 = file3;
                }
            }
        }
        return file2;
    }

    /* renamed from: f */
    public static String m25764f() {
        String str = m25761c() + "/okhttp/";
        File file = new File(str);
        if (!file.exists()) {
            file.mkdirs();
        }
        return str;
    }
}
