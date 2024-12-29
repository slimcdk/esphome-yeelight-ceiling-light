package com.xiaomi.push;

import com.xiaomi.channel.commonutils.logger.C4408b;
import java.io.File;
import java.util.HashMap;

/* renamed from: com.xiaomi.push.aa */
public class C4505aa {

    /* renamed from: a */
    private static final HashMap<String, String> f7534a;

    static {
        HashMap<String, String> hashMap = new HashMap<>();
        f7534a = hashMap;
        hashMap.put("FFD8FF", "jpg");
        hashMap.put("89504E47", "png");
        hashMap.put("47494638", "gif");
        hashMap.put("474946", "gif");
        hashMap.put("424D", "bmp");
    }

    /* renamed from: a */
    public static long m12829a(File file) {
        long j = 0;
        try {
            File[] listFiles = file.listFiles();
            for (int i = 0; i < listFiles.length; i++) {
                j += listFiles[i].isDirectory() ? m12829a(listFiles[i]) : listFiles[i].length();
            }
        } catch (Exception e) {
            C4408b.m12478a((Throwable) e);
        }
        return j;
    }
}
