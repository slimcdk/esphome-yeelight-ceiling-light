package com.xiaomi.push.service;

import android.content.SharedPreferences;
import com.xiaomi.mipush.sdk.Constants;
import com.xiaomi.push.C4561bp;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

/* renamed from: com.xiaomi.push.service.an */
public class C4879an {

    /* renamed from: a */
    private static Object f9467a = new Object();

    /* renamed from: a */
    private static Map<String, Queue<String>> f9468a = new HashMap();

    /* renamed from: a */
    public static boolean m15262a(XMPushService xMPushService, String str, String str2) {
        synchronized (f9467a) {
            SharedPreferences sharedPreferences = xMPushService.getSharedPreferences("push_message_ids", 0);
            Queue queue = f9468a.get(str);
            if (queue == null) {
                String[] split = sharedPreferences.getString(str, "").split(Constants.ACCEPT_TIME_SEPARATOR_SP);
                LinkedList linkedList = new LinkedList();
                for (String add : split) {
                    linkedList.add(add);
                }
                f9468a.put(str, linkedList);
                queue = linkedList;
            }
            if (queue.contains(str2)) {
                return true;
            }
            queue.add(str2);
            if (queue.size() > 25) {
                queue.poll();
            }
            String a = C4561bp.m13044a((Collection<?>) queue, Constants.ACCEPT_TIME_SEPARATOR_SP);
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putString(str, a);
            edit.commit();
            return false;
        }
    }
}
