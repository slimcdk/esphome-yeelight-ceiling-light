package p051j4;

import android.os.Environment;
import com.miot.service.common.crypto.rc4coder.Coder;
import com.miot.service.manager.timer.TimerCodec;
import com.yeelight.yeelib.managers.C3108x;
import com.yeelight.yeelib.utils.AppUtils;
import java.io.File;
import java.io.FileInputStream;
import java.math.BigInteger;
import java.security.MessageDigest;

/* renamed from: j4.m */
public class C9194m {

    /* renamed from: a */
    public static final String f17010a = "m";

    /* renamed from: a */
    public static void m22158a(File file) {
        if (!file.isDirectory()) {
            AppUtils.m8300u(f17010a, "Target is not directory, fix me! dir: " + String.valueOf(file));
        }
        File[] listFiles = file.listFiles();
        if (listFiles == null || listFiles.length == 0) {
            file.delete();
            return;
        }
        for (File file2 : listFiles) {
            if (file2.isDirectory()) {
                m22158a(file2);
            } else {
                file2.delete();
            }
        }
        file.delete();
    }

    /* renamed from: b */
    public static boolean m22159b() {
        return "mounted".equals(Environment.getExternalStorageState());
    }

    /* renamed from: c */
    public static File m22160c() {
        return m22159b() ? C3108x.f4951e.getExternalCacheDir() : C3108x.f4951e.getCacheDir();
    }

    /* renamed from: d */
    public static String m22161d(File file) {
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
    public static File m22162e(File file) {
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
    public static String m22163f() {
        String str = m22160c() + "/okhttp/";
        File file = new File(str);
        if (!file.exists()) {
            file.mkdirs();
        }
        return str;
    }
}
