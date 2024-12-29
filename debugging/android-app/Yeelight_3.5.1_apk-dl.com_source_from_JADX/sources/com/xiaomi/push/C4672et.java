package com.xiaomi.push;

import android.util.Pair;
import com.xiaomi.mipush.sdk.Constants;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.xiaomi.push.et */
public class C4672et {

    /* renamed from: a */
    private static Vector<Pair<String, Long>> f8017a = new Vector<>();

    /* renamed from: a */
    private static ConcurrentHashMap<String, Long> f8018a = new ConcurrentHashMap<>();

    /* renamed from: a */
    public static String m13752a() {
        StringBuilder sb = new StringBuilder();
        synchronized (f8017a) {
            for (int i = 0; i < f8017a.size(); i++) {
                Pair elementAt = f8017a.elementAt(i);
                sb.append((String) elementAt.first);
                sb.append(Constants.COLON_SEPARATOR);
                sb.append(elementAt.second);
                if (i < f8017a.size() - 1) {
                    sb.append(";");
                }
            }
            f8017a.clear();
        }
        return sb.toString();
    }
}
