package com.xiaomi.push;

import android.content.Context;
import com.xiaomi.channel.commonutils.logger.C3989b;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileLock;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.xiaomi.push.u */
public final class C4938u {

    /* renamed from: a */
    private static final Set<String> f10209a = Collections.synchronizedSet(new HashSet());

    /* renamed from: a */
    private Context f10210a;

    /* renamed from: a */
    private RandomAccessFile f10211a;

    /* renamed from: a */
    private String f10212a;

    /* renamed from: a */
    private FileLock f10213a;

    private C4938u(Context context) {
        this.f10210a = context;
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public static C4938u m15877a(Context context, File file) {
        C3989b.m10680c("Locking: " + file.getAbsolutePath());
        String str = file.getAbsolutePath() + ".LOCK";
        File file2 = new File(str);
        if (!file2.exists()) {
            file2.getParentFile().mkdirs();
            file2.createNewFile();
        }
        if (f10209a.add(str)) {
            C4938u uVar = new C4938u(context);
            uVar.f10212a = str;
            try {
                RandomAccessFile randomAccessFile = new RandomAccessFile(file2, "rw");
                uVar.f10211a = randomAccessFile;
                uVar.f10213a = randomAccessFile.getChannel().lock();
                C3989b.m10680c("Locked: " + str + " :" + uVar.f10213a);
                if (uVar.f10213a == null) {
                    RandomAccessFile randomAccessFile2 = uVar.f10211a;
                    if (randomAccessFile2 != null) {
                        C4942y.m15884a((Closeable) randomAccessFile2);
                    }
                    f10209a.remove(uVar.f10212a);
                }
                return uVar;
            } catch (Throwable th) {
                if (uVar.f10213a == null) {
                    RandomAccessFile randomAccessFile3 = uVar.f10211a;
                    if (randomAccessFile3 != null) {
                        C4942y.m15884a((Closeable) randomAccessFile3);
                    }
                    f10209a.remove(uVar.f10212a);
                }
                throw th;
            }
        } else {
            throw new IOException("abtain lock failure");
        }
    }

    /* renamed from: a */
    public void mo26006a() {
        C3989b.m10680c("unLock: " + this.f10213a);
        FileLock fileLock = this.f10213a;
        if (fileLock != null && fileLock.isValid()) {
            try {
                this.f10213a.release();
            } catch (IOException unused) {
            }
            this.f10213a = null;
        }
        RandomAccessFile randomAccessFile = this.f10211a;
        if (randomAccessFile != null) {
            C4942y.m15884a((Closeable) randomAccessFile);
        }
        f10209a.remove(this.f10212a);
    }
}
