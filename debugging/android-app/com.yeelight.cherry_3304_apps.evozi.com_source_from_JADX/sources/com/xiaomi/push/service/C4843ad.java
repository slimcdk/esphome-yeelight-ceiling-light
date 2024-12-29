package com.xiaomi.push.service;

import android.os.Process;
import android.text.TextUtils;
import com.xiaomi.channel.commonutils.logger.C3989b;
import com.xiaomi.push.C4584cx;
import com.xiaomi.push.C4630ej;
import com.xiaomi.push.C4728he;
import com.xiaomi.push.C4942y;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileReader;
import java.net.Socket;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import org.apache.commons.p271io.IOUtils;

/* renamed from: com.xiaomi.push.service.ad */
public class C4843ad {

    /* renamed from: a */
    private static long f9949a = 0;

    /* renamed from: a */
    private static ThreadPoolExecutor f9950a = new ThreadPoolExecutor(1, 1, 20, TimeUnit.SECONDS, new LinkedBlockingQueue());

    /* renamed from: a */
    private static final Pattern f9951a = Pattern.compile("([0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3})");

    /* renamed from: a */
    private static String m15532a(String str) {
        BufferedReader bufferedReader;
        Throwable th;
        try {
            bufferedReader = new BufferedReader(new FileReader(new File(str)));
            try {
                StringBuilder sb = new StringBuilder();
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine != null) {
                        sb.append(IOUtils.LINE_SEPARATOR_UNIX);
                        sb.append(readLine);
                    } else {
                        String sb2 = sb.toString();
                        C4942y.m15884a((Closeable) bufferedReader);
                        return sb2;
                    }
                }
            } catch (Exception unused) {
                C4942y.m15884a((Closeable) bufferedReader);
                return null;
            } catch (Throwable th2) {
                th = th2;
                C4942y.m15884a((Closeable) bufferedReader);
                throw th;
            }
        } catch (Exception unused2) {
            bufferedReader = null;
            C4942y.m15884a((Closeable) bufferedReader);
            return null;
        } catch (Throwable th3) {
            bufferedReader = null;
            th = th3;
            C4942y.m15884a((Closeable) bufferedReader);
            throw th;
        }
    }

    /* renamed from: a */
    public static void m15533a() {
        C4630ej.C4631a a;
        long currentTimeMillis = System.currentTimeMillis();
        if ((f9950a.getActiveCount() <= 0 || currentTimeMillis - f9949a >= 1800000) && C4728he.mo25240a().mo25240a() && (a = C4884be.mo25947a().mo25947a()) != null && a.mo24947e() > 0) {
            f9949a = currentTimeMillis;
            m15534a(a.mo24930a(), true);
        }
    }

    /* renamed from: a */
    public static void m15534a(List<String> list, boolean z) {
        f9950a.execute(new C4844ae(list, z));
    }

    /* renamed from: b */
    public static void m15536b() {
        String a = m15532a("/proc/self/net/tcp");
        if (!TextUtils.isEmpty(a)) {
            C3989b.m10669a("dump tcp for uid = " + Process.myUid());
            C3989b.m10669a(a);
        }
        String a2 = m15532a("/proc/self/net/tcp6");
        if (!TextUtils.isEmpty(a2)) {
            C3989b.m10669a("dump tcp6 for uid = " + Process.myUid());
            C3989b.m10669a(a2);
        }
    }

    /* renamed from: b */
    private static boolean m15537b(String str) {
        long currentTimeMillis = System.currentTimeMillis();
        try {
            C3989b.m10669a("ConnectivityTest: begin to connect to " + str);
            Socket socket = new Socket();
            socket.connect(C4584cx.m13646a(str, 5222), 5000);
            socket.setTcpNoDelay(true);
            long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
            C3989b.m10669a("ConnectivityTest: connect to " + str + " in " + currentTimeMillis2);
            socket.close();
            return true;
        } catch (Throwable th) {
            C3989b.m10681d("ConnectivityTest: could not connect to:" + str + " exception: " + th.getClass().getSimpleName() + " description: " + th.getMessage());
            return false;
        }
    }
}
