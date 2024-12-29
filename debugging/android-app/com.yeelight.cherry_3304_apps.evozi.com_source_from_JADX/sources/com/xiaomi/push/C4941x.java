package com.xiaomi.push;

import com.xiaomi.channel.commonutils.logger.C3989b;
import java.io.File;
import java.util.HashMap;

/* renamed from: com.xiaomi.push.x */
public class C4941x {

    /* renamed from: a */
    private static final HashMap<String, String> f10218a;

    static {
        HashMap<String, String> hashMap = new HashMap<>();
        f10218a = hashMap;
        hashMap.put("FFD8FF", "jpg");
        f10218a.put("89504E47", "png");
        f10218a.put("47494638", "gif");
        f10218a.put("474946", "gif");
        f10218a.put("424D", "bmp");
    }

    /* renamed from: a */
    public static long m15882a(File file) {
        long j = 0;
        try {
            File[] listFiles = file.listFiles();
            for (int i = 0; i < listFiles.length; i++) {
                j += listFiles[i].isDirectory() ? m15882a(listFiles[i]) : listFiles[i].length();
            }
        } catch (Exception e) {
            C3989b.m10678a((Throwable) e);
        }
        return j;
    }
}
