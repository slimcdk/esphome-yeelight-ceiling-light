package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.text.TextUtils;
import com.miot.service.common.miotcloud.impl.MiotCloudImpl;
import com.miot.service.manager.timer.TimerCodec;
import com.xiaomi.channel.commonutils.logger.C3989b;
import com.xiaomi.push.C4942y;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;

/* renamed from: com.xiaomi.mipush.sdk.s */
public class C4075s {

    /* renamed from: a */
    private static volatile C4075s f6952a;

    /* renamed from: a */
    private static final Object f6953a = new Object();

    /* renamed from: a */
    private Context f6954a;

    private C4075s(Context context) {
        this.f6954a = context;
    }

    /* renamed from: a */
    public static C4075s m10979a(Context context) {
        if (f6952a == null) {
            synchronized (C4075s.class) {
                if (f6952a == null) {
                    f6952a = new C4075s(context);
                }
            }
        }
        return f6952a;
    }

    /* renamed from: a */
    private File m10980a(String str) {
        File file = new File(this.f6954a.getFilesDir() + "/crash");
        if (!file.exists()) {
            file.mkdirs();
            return null;
        }
        File[] listFiles = file.listFiles();
        for (int i = 0; i < listFiles.length; i++) {
            if (listFiles[i].isFile() && listFiles[i].getName().startsWith(str)) {
                return listFiles[i];
            }
        }
        return null;
    }

    /* renamed from: a */
    public String mo22971a(File file) {
        if (file == null) {
            return "";
        }
        String[] split = file.getName().split(Constants.COLON_SEPARATOR);
        return split.length != 2 ? "" : split[0];
    }

    /* renamed from: a */
    public ArrayList<File> mo22972a() {
        ArrayList<File> arrayList = new ArrayList<>();
        File file = new File(this.f6954a.getFilesDir() + "/crash");
        if (!file.exists()) {
            file.mkdirs();
            return arrayList;
        }
        File[] listFiles = file.listFiles();
        for (int i = 0; i < listFiles.length; i++) {
            String[] split = listFiles[i].getName().split(Constants.COLON_SEPARATOR);
            if (split.length >= 2 && Integer.parseInt(split[1]) >= 1 && listFiles[i].isFile()) {
                arrayList.add(listFiles[i]);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public void mo22973a(String str, String str2) {
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str)) {
            synchronized (f6953a) {
                File a = m10980a(str2);
                if (a != null) {
                    String[] split = a.getName().split(Constants.COLON_SEPARATOR);
                    if (split.length >= 2) {
                        a.renameTo(new File(this.f6954a.getFilesDir() + "/crash" + MiotCloudImpl.COOKIE_PATH + str2 + Constants.COLON_SEPARATOR + String.valueOf(Integer.parseInt(split[1]) + 1)));
                    }
                } else {
                    FileOutputStream fileOutputStream = null;
                    try {
                        FileOutputStream fileOutputStream2 = new FileOutputStream(new File(this.f6954a.getFilesDir() + "/crash" + MiotCloudImpl.COOKIE_PATH + str2 + Constants.COLON_SEPARATOR + TimerCodec.ENABLE));
                        try {
                            fileOutputStream2.write(str.getBytes());
                            fileOutputStream2.flush();
                            C4942y.m15884a((Closeable) fileOutputStream2);
                        } catch (Exception e) {
                            e = e;
                            fileOutputStream = fileOutputStream2;
                            try {
                                C3989b.m10678a((Throwable) e);
                                C4942y.m15884a((Closeable) fileOutputStream);
                            } catch (Throwable th) {
                                th = th;
                                C4942y.m15884a((Closeable) fileOutputStream);
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            fileOutputStream = fileOutputStream2;
                            C4942y.m15884a((Closeable) fileOutputStream);
                            throw th;
                        }
                    } catch (Exception e2) {
                        e = e2;
                        C3989b.m10678a((Throwable) e);
                        C4942y.m15884a((Closeable) fileOutputStream);
                    }
                }
            }
        }
    }
}
