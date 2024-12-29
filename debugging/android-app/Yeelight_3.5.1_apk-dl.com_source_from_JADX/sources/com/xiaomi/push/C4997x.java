package com.xiaomi.push;

import android.content.Context;
import com.xiaomi.channel.commonutils.logger.C4408b;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileLock;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.xiaomi.push.x */
public final class C4997x {

    /* renamed from: a */
    private static final Set<String> f9768a = Collections.synchronizedSet(new HashSet());

    /* renamed from: a */
    private Context f9769a;

    /* renamed from: a */
    private RandomAccessFile f9770a;

    /* renamed from: a */
    private String f9771a;

    /* renamed from: a */
    private FileLock f9772a;

    private C4997x(Context context) {
        this.f9769a = context;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public static C4997x m15750a(Context context, File file) {
        C4408b.m12482c("Locking: " + file.getAbsolutePath());
        String str = file.getAbsolutePath() + ".LOCK";
        File file2 = new File(str);
        if (!file2.exists()) {
            file2.getParentFile().mkdirs();
            file2.createNewFile();
        }
        Set<String> set = f9768a;
        if (set.add(str)) {
            C4997x xVar = new C4997x(context);
            xVar.f9771a = str;
            try {
                RandomAccessFile randomAccessFile = new RandomAccessFile(file2, "rw");
                xVar.f9770a = randomAccessFile;
                xVar.f9772a = randomAccessFile.getChannel().lock();
                C4408b.m12482c("Locked: " + str + " :" + xVar.f9772a);
                if (xVar.f9772a == null) {
                    RandomAccessFile randomAccessFile2 = xVar.f9770a;
                    if (randomAccessFile2 != null) {
                        C4506ab.m12831a((Closeable) randomAccessFile2);
                    }
                    set.remove(xVar.f9771a);
                }
                return xVar;
            } catch (Throwable th) {
                if (xVar.f9772a == null) {
                    RandomAccessFile randomAccessFile3 = xVar.f9770a;
                    if (randomAccessFile3 != null) {
                        C4506ab.m12831a((Closeable) randomAccessFile3);
                    }
                    f9768a.remove(xVar.f9771a);
                }
                throw th;
            }
        } else {
            throw new IOException("abtain lock failure");
        }
    }

    /* renamed from: a */
    public void mo30096a() {
        C4408b.m12482c("unLock: " + this.f9772a);
        FileLock fileLock = this.f9772a;
        if (fileLock != null && fileLock.isValid()) {
            try {
                this.f9772a.release();
            } catch (IOException unused) {
            }
            this.f9772a = null;
        }
        RandomAccessFile randomAccessFile = this.f9770a;
        if (randomAccessFile != null) {
            C4506ab.m12831a((Closeable) randomAccessFile);
        }
        f9768a.remove(this.f9771a);
    }
}
