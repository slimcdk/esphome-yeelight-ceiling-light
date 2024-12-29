package com.xiaomi.push.service;

import android.os.Process;
import android.text.TextUtils;
import com.xiaomi.channel.commonutils.logger.C4408b;
import com.xiaomi.push.C4506ab;
import com.xiaomi.push.C4598ct;
import com.xiaomi.push.C4635dw;
import com.xiaomi.push.C4689fh;
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
import org.apache.commons.p194io.IOUtils;

/* renamed from: com.xiaomi.push.service.ap */
public class C4881ap {

    /* renamed from: a */
    private static long f9477a = 0;

    /* renamed from: a */
    private static ThreadPoolExecutor f9478a = new ThreadPoolExecutor(1, 1, 20, TimeUnit.SECONDS, new LinkedBlockingQueue());

    /* renamed from: a */
    private static final Pattern f9479a = Pattern.compile("([0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3})");

    /* renamed from: a */
    private static String m15263a(String str) {
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
                        C4506ab.m12831a((Closeable) bufferedReader);
                        return sb2;
                    }
                }
            } catch (Exception unused) {
                C4506ab.m12831a((Closeable) bufferedReader);
                return null;
            } catch (Throwable th2) {
                th = th2;
                C4506ab.m12831a((Closeable) bufferedReader);
                throw th;
            }
        } catch (Exception unused2) {
            bufferedReader = null;
            C4506ab.m12831a((Closeable) bufferedReader);
            return null;
        } catch (Throwable th3) {
            bufferedReader = null;
            th = th3;
            C4506ab.m12831a((Closeable) bufferedReader);
            throw th;
        }
    }

    /* renamed from: a */
    public static void m15264a() {
        C4635dw.C4636a a;
        long currentTimeMillis = System.currentTimeMillis();
        if ((f9478a.getActiveCount() <= 0 || currentTimeMillis - f9477a >= 1800000) && C4689fh.mo29139a().mo29139a() && (a = C4929bv.mo30029a().mo30029a()) != null && a.mo28935e() > 0) {
            f9477a = currentTimeMillis;
            m15265a(a.mo28924a(), true);
        }
    }

    /* renamed from: a */
    public static void m15265a(List<String> list, boolean z) {
        f9478a.execute(new C4882aq(list, z));
    }

    /* renamed from: b */
    public static void m15267b() {
        String a = m15263a("/proc/self/net/tcp");
        if (!TextUtils.isEmpty(a)) {
            C4408b.m12464a("dump tcp for uid = " + Process.myUid());
            C4408b.m12464a(a);
        }
        String a2 = m15263a("/proc/self/net/tcp6");
        if (!TextUtils.isEmpty(a2)) {
            C4408b.m12464a("dump tcp6 for uid = " + Process.myUid());
            C4408b.m12464a(a2);
        }
    }

    /* renamed from: b */
    private static boolean m15268b(String str) {
        long currentTimeMillis = System.currentTimeMillis();
        try {
            C4408b.m12464a("ConnectivityTest: begin to connect to " + str);
            Socket socket = new Socket();
            socket.connect(C4598ct.m13220a(str, 5222), 5000);
            socket.setTcpNoDelay(true);
            long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
            C4408b.m12464a("ConnectivityTest: connect to " + str + " in " + currentTimeMillis2);
            socket.close();
            return true;
        } catch (Throwable th) {
            C4408b.m12483d("ConnectivityTest: could not connect to:" + str + " exception: " + th.getClass().getSimpleName() + " description: " + th.getMessage());
            return false;
        }
    }
}
