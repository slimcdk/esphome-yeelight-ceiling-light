package com.xiaomi.push.service;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.text.TextUtils;
import com.miot.service.common.miotcloud.impl.MiotCloudImpl;
import com.xiaomi.channel.commonutils.logger.C4408b;
import com.xiaomi.mipush.sdk.Constants;
import com.xiaomi.push.C4509ae;
import com.xiaomi.push.C4551bj;
import com.xiaomi.push.C4672et;
import com.xiaomi.push.C4727gk;
import com.xiaomi.push.C4728gl;
import com.xiaomi.push.C4730gm;
import com.xiaomi.push.C4733gp;
import com.xiaomi.push.C4745gy;
import com.xiaomi.push.C4830m;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.http.NameValuePair;

public class ServiceClient {

    /* renamed from: a */
    private static long f9349a = 0;

    /* renamed from: a */
    private static ServiceClient f9350a;

    /* renamed from: a */
    private static String f9351a;

    /* renamed from: b */
    private static String f9352b = (C4745gy.m14114a(5) + Constants.ACCEPT_TIME_SEPARATOR_SERVER);

    /* renamed from: a */
    private Context f9353a;

    /* renamed from: a */
    private Messenger f9354a = null;

    /* renamed from: a */
    private List<Message> f9355a = new ArrayList();

    /* renamed from: a */
    private boolean f9356a = false;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public Messenger f9357b;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public boolean f9358b = false;

    private ServiceClient(Context context) {
        this.f9353a = context.getApplicationContext();
        if (m15036a()) {
            C4408b.m12482c("use miui push service");
            this.f9356a = true;
        }
    }

    /* renamed from: a */
    private Intent m15036a() {
        if (isMiuiPushServiceEnabled()) {
            Intent intent = new Intent();
            intent.setPackage("com.xiaomi.xmsf");
            intent.setClassName("com.xiaomi.xmsf", m15036a());
            intent.putExtra(C4916bk.f9566B, this.f9353a.getPackageName());
            m15036a();
            return intent;
        }
        Intent intent2 = new Intent(this.f9353a, XMPushService.class);
        intent2.putExtra(C4916bk.f9566B, this.f9353a.getPackageName());
        m15049b();
        return intent2;
    }

    /* renamed from: a */
    private Message m15037a(Intent intent) {
        Message obtain = Message.obtain();
        obtain.what = 17;
        obtain.obj = intent;
        return obtain;
    }

    /* renamed from: a */
    private String m15040a() {
        try {
            return this.f9353a.getPackageManager().getPackageInfo("com.xiaomi.xmsf", 4).versionCode >= 106 ? "com.xiaomi.push.service.XMPushService" : "com.xiaomi.xmsf.push.service.XMPushService";
        } catch (Exception unused) {
            return "com.xiaomi.xmsf.push.service.XMPushService";
        }
    }

    /* renamed from: a */
    private String m15041a(Map<String, String> map) {
        StringBuilder sb = new StringBuilder();
        int i = 1;
        for (Map.Entry next : map.entrySet()) {
            sb.append((String) next.getKey());
            sb.append(Constants.COLON_SEPARATOR);
            sb.append((String) next.getValue());
            if (i < map.size()) {
                sb.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
            }
            i++;
        }
        return sb.toString();
    }

    /* renamed from: a */
    private Map<String, String> m15043a(List<NameValuePair> list) {
        HashMap hashMap = new HashMap();
        if (list != null && list.size() > 0) {
            for (NameValuePair next : list) {
                if (next != null) {
                    hashMap.put(next.getName(), next.getValue());
                }
            }
        }
        return hashMap;
    }

    /* renamed from: a */
    private void m15044a() {
        this.f9353a.getPackageManager().setComponentEnabledSetting(new ComponentName(this.f9353a, XMPushService.class), 2, 1);
    }

    /* renamed from: a */
    private synchronized void m15045a(Intent intent) {
        if (this.f9358b) {
            Message a = m15037a(intent);
            if (this.f9355a.size() >= 50) {
                this.f9355a.remove(0);
            }
            this.f9355a.add(a);
            return;
        } else if (this.f9357b == null) {
            this.f9353a.bindService(intent, new C4928bu(this), 1);
            this.f9358b = true;
            this.f9355a.clear();
            this.f9355a.add(m15037a(intent));
        } else {
            try {
                this.f9357b.send(m15037a(intent));
            } catch (RemoteException unused) {
                this.f9357b = null;
                this.f9358b = false;
            }
        }
    }

    /* renamed from: a */
    private void m15046a(Intent intent, String str, String str2, String str3, String str4, String str5, boolean z, Map<String, String> map, Map<String, String> map2) {
        intent.putExtra(C4916bk.f9595q, str);
        intent.putExtra(C4916bk.f9598t, str2);
        intent.putExtra(C4916bk.f9600v, str3);
        intent.putExtra(C4916bk.f9602x, str5);
        intent.putExtra(C4916bk.f9601w, str4);
        intent.putExtra(C4916bk.f9603y, z);
        intent.putExtra(C4916bk.f9570F, f9351a);
        intent.putExtra(C4916bk.f9574J, this.f9354a);
        if (map != null && map.size() > 0) {
            String a = m15041a(map);
            if (!TextUtils.isEmpty(a)) {
                intent.putExtra(C4916bk.f9604z, a);
            }
        }
        if (map2 != null && map2.size() > 0) {
            String a2 = m15041a(map2);
            if (!TextUtils.isEmpty(a2)) {
                intent.putExtra(C4916bk.f9565A, a2);
            }
        }
    }

    /* renamed from: a */
    private boolean m15047a() {
        if (C4509ae.f7542e) {
            return false;
        }
        try {
            PackageInfo packageInfo = this.f9353a.getPackageManager().getPackageInfo("com.xiaomi.xmsf", 4);
            return packageInfo != null && packageInfo.versionCode >= 104;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: b */
    private void m15049b() {
        this.f9353a.getPackageManager().setComponentEnabledSetting(new ComponentName(this.f9353a, XMPushService.class), 1, 1);
    }

    public static ServiceClient getInstance(Context context) {
        if (f9350a == null) {
            f9350a = new ServiceClient(context);
        }
        return f9350a;
    }

    public static String getSession() {
        return f9351a;
    }

    public static void setSession(String str) {
        f9351a = str;
    }

    public boolean batchSendMessage(C4730gm[] gmVarArr, boolean z) {
        if (!C4551bj.m13000b(this.f9353a)) {
            return false;
        }
        Intent a = m15036a();
        int length = gmVarArr.length;
        Bundle[] bundleArr = new Bundle[length];
        for (int i = 0; i < gmVarArr.length; i++) {
            String a2 = C4672et.m13752a();
            if (!TextUtils.isEmpty(a2)) {
                C4727gk gkVar = new C4727gk("pf", (String) null, (String[]) null, (String[]) null);
                C4727gk gkVar2 = new C4727gk("sent", (String) null, (String[]) null, (String[]) null);
                gkVar2.mo29217a(a2);
                gkVar.mo29218a(gkVar2);
                gmVarArr[i].mo29249a(gkVar);
            }
            C4408b.m12482c("SEND:" + gmVarArr[i].mo29223a());
            bundleArr[i] = gmVarArr[i].mo29223a();
        }
        if (length <= 0) {
            return false;
        }
        a.setAction(C4916bk.f9585g);
        a.putExtra(C4916bk.f9570F, f9351a);
        a.putExtra("ext_packets", bundleArr);
        a.putExtra("ext_encrypt", z);
        return startServiceSafely(a);
    }

    public void checkAlive() {
        Intent a = m15036a();
        a.setAction("com.xiaomi.push.check_alive");
        startServiceSafely(a);
    }

    public boolean closeChannel() {
        Intent a = m15036a();
        a.setAction(C4916bk.f9587i);
        return startServiceSafely(a);
    }

    public boolean closeChannel(String str) {
        Intent a = m15036a();
        a.setAction(C4916bk.f9587i);
        a.putExtra(C4916bk.f9598t, str);
        return startServiceSafely(a);
    }

    public boolean closeChannel(String str, String str2) {
        Intent a = m15036a();
        a.setAction(C4916bk.f9587i);
        a.putExtra(C4916bk.f9598t, str);
        a.putExtra(C4916bk.f9595q, str2);
        return startServiceSafely(a);
    }

    @Deprecated
    public boolean forceReconnection(String str, String str2, String str3, String str4, String str5, boolean z, List<NameValuePair> list, List<NameValuePair> list2) {
        return forceReconnection(str, str2, str3, str4, str5, z, m15043a(list), m15043a(list2));
    }

    public boolean forceReconnection(String str, String str2, String str3, String str4, String str5, boolean z, Map<String, String> map, Map<String, String> map2) {
        Intent a = m15036a();
        a.setAction(C4916bk.f9588j);
        m15046a(a, str, str2, str3, str4, str5, z, map, map2);
        return startServiceSafely(a);
    }

    public boolean isMiuiPushServiceEnabled() {
        return this.f9356a;
    }

    public int openChannel(String str, String str2, String str3, String str4, String str5, Map<String, String> map, Map<String, String> map2, boolean z) {
        Intent a = m15036a();
        a.setAction(C4916bk.f9582d);
        m15046a(a, str, str2, str3, str4, str5, z, map, map2);
        startServiceSafely(a);
        return 0;
    }

    @Deprecated
    public int openChannel(String str, String str2, String str3, String str4, String str5, boolean z, List<NameValuePair> list, List<NameValuePair> list2) {
        return openChannel(str, str2, str3, str4, str5, m15043a(list), m15043a(list2), z);
    }

    @Deprecated
    public void resetConnection(String str, String str2, String str3, String str4, String str5, boolean z, List<NameValuePair> list, List<NameValuePair> list2) {
        resetConnection(str, str2, str3, str4, str5, z, m15043a(list), m15043a(list2));
    }

    public void resetConnection(String str, String str2, String str3, String str4, String str5, boolean z, Map<String, String> map, Map<String, String> map2) {
        Intent a = m15036a();
        a.setAction(C4916bk.f9589k);
        m15046a(a, str, str2, str3, str4, str5, z, map, map2);
        startServiceSafely(a);
    }

    public boolean sendIQ(C4728gl glVar) {
        if (!C4551bj.m13000b(this.f9353a)) {
            return false;
        }
        Intent a = m15036a();
        Bundle a2 = glVar.mo29223a();
        if (a2 == null) {
            return false;
        }
        C4408b.m12482c("SEND:" + glVar.mo29223a());
        a.setAction(C4916bk.f9584f);
        a.putExtra(C4916bk.f9570F, f9351a);
        a.putExtra("ext_packet", a2);
        return startServiceSafely(a);
    }

    public boolean sendMessage(C4730gm gmVar, boolean z) {
        if (!C4551bj.m13000b(this.f9353a)) {
            return false;
        }
        Intent a = m15036a();
        String a2 = C4672et.m13752a();
        if (!TextUtils.isEmpty(a2)) {
            C4727gk gkVar = new C4727gk("pf", (String) null, (String[]) null, (String[]) null);
            C4727gk gkVar2 = new C4727gk("sent", (String) null, (String[]) null, (String[]) null);
            gkVar2.mo29217a(a2);
            gkVar.mo29218a(gkVar2);
            gmVar.mo29249a(gkVar);
        }
        Bundle a3 = gmVar.mo29223a();
        if (a3 == null) {
            return false;
        }
        C4408b.m12482c("SEND:" + gmVar.mo29223a());
        a.setAction(C4916bk.f9583e);
        a.putExtra(C4916bk.f9570F, f9351a);
        a.putExtra("ext_packet", a3);
        a.putExtra("ext_encrypt", z);
        return startServiceSafely(a);
    }

    public boolean sendMessage(byte[] bArr, String str, String str2) {
        String str3;
        if (!C4551bj.m13000b(this.f9353a) || bArr == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            C4408b.m12464a("Failed to send message: message|userId|chid may be empty, or the network is unavailable.");
            return false;
        }
        Intent a = m15036a();
        a.setAction(C4916bk.f9583e);
        a.putExtra(C4916bk.f9570F, f9351a);
        a.putExtra("ext_raw_packet", bArr);
        int indexOf = str.indexOf("@");
        String str4 = null;
        String substring = indexOf != -1 ? str.substring(0, indexOf) : null;
        int lastIndexOf = str.lastIndexOf(MiotCloudImpl.COOKIE_PATH);
        if (lastIndexOf != -1) {
            str4 = str.substring(indexOf + 1, lastIndexOf);
            str3 = str.substring(lastIndexOf + 1);
        } else {
            str3 = null;
        }
        a.putExtra(C4916bk.f9595q, substring);
        a.putExtra(C4916bk.f9596r, str4);
        a.putExtra(C4916bk.f9597s, str3);
        StringBuilder sb = new StringBuilder();
        sb.append(f9352b);
        long j = f9349a;
        f9349a = 1 + j;
        sb.append(j);
        String sb2 = sb.toString();
        a.putExtra("ext_pkt_id", sb2);
        a.putExtra("ext_chid", str2);
        C4408b.m12484e("SEND: chid=" + str2 + ", packetId=" + sb2);
        return startServiceSafely(a);
    }

    public boolean sendPresence(C4733gp gpVar) {
        if (!C4551bj.m13000b(this.f9353a)) {
            return false;
        }
        Intent a = m15036a();
        Bundle a2 = gpVar.mo29223a();
        if (a2 == null) {
            return false;
        }
        C4408b.m12482c("SEND:" + gpVar.mo29223a());
        a.setAction(C4916bk.f9586h);
        a.putExtra(C4916bk.f9570F, f9351a);
        a.putExtra("ext_packet", a2);
        return startServiceSafely(a);
    }

    public void setMessenger(Messenger messenger) {
        this.f9354a = messenger;
    }

    public boolean startServiceSafely(Intent intent) {
        try {
            if (C4830m.m14997a() || Build.VERSION.SDK_INT < 26) {
                this.f9353a.startService(intent);
                return true;
            }
            m15037a(intent);
            return true;
        } catch (Exception e) {
            C4408b.m12478a((Throwable) e);
            return false;
        }
    }

    @Deprecated
    public void updateChannelInfo(String str, List<NameValuePair> list, List<NameValuePair> list2) {
        updateChannelInfo(str, m15043a(list), m15043a(list2));
    }

    public void updateChannelInfo(String str, Map<String, String> map, Map<String, String> map2) {
        Intent a = m15036a();
        a.setAction(C4916bk.f9590l);
        if (map != null) {
            String a2 = m15041a(map);
            if (!TextUtils.isEmpty(a2)) {
                a.putExtra(C4916bk.f9604z, a2);
            }
        }
        if (map2 != null) {
            String a3 = m15041a(map2);
            if (!TextUtils.isEmpty(a3)) {
                a.putExtra(C4916bk.f9565A, a3);
            }
        }
        a.putExtra(C4916bk.f9598t, str);
        startServiceSafely(a);
    }
}
