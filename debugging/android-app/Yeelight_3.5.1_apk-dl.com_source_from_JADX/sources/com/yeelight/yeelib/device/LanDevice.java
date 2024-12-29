package com.yeelight.yeelib.device;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import androidx.core.view.ViewCompat;
import com.yeelight.yeelib.device.WifiDeviceBase;
import com.yeelight.yeelib.device.base.C3012e;
import com.yeelight.yeelib.device.base.DeviceStatusBase;
import com.yeelight.yeelib.interaction.ActionType;
import com.yeelight.yeelib.managers.C3072i;
import com.yeelight.yeelib.models.C8312e;
import com.yeelight.yeelib.models.C8321m;
import com.yeelight.yeelib.models.C8327s;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import p232y3.C12048k;
import p237z3.C12143c;

public class LanDevice extends C3012e {
    /* access modifiers changed from: private */

    /* renamed from: A */
    public Socket f4714A;
    /* access modifiers changed from: private */

    /* renamed from: B */
    public BufferedOutputStream f4715B;
    /* access modifiers changed from: private */

    /* renamed from: C */
    public BufferedReader f4716C;
    /* access modifiers changed from: private */

    /* renamed from: Q */
    public boolean f4717Q = true;

    /* renamed from: R */
    private Thread f4718R;

    /* renamed from: S */
    private WifiDeviceBase.C6080i f4719S;

    /* renamed from: T */
    private WifiDeviceBase.C6079h f4720T;

    /* renamed from: U */
    private C3008d f4721U;
    /* access modifiers changed from: private */

    /* renamed from: x */
    public InetAddress f4722x;
    /* access modifiers changed from: private */

    /* renamed from: y */
    public int f4723y;

    /* renamed from: z */
    private int f4724z;

    private enum CachedMessageType {
        MESSAGE,
        EMPTY_MESSAGE
    }

    /* renamed from: com.yeelight.yeelib.device.LanDevice$a */
    class C3005a implements Runnable {
        C3005a() {
        }

        public void run() {
            try {
                boolean unused = LanDevice.this.f4717Q = true;
                Socket unused2 = LanDevice.this.f4714A = new Socket(LanDevice.this.f4722x, LanDevice.this.f4723y);
                LanDevice.this.f4714A.setKeepAlive(true);
                BufferedOutputStream unused3 = LanDevice.this.f4715B = new BufferedOutputStream(LanDevice.this.f4714A.getOutputStream());
                BufferedReader unused4 = LanDevice.this.f4716C = new BufferedReader(new InputStreamReader(LanDevice.this.f4714A.getInputStream()));
                StringBuilder sb = new StringBuilder();
                sb.append("init device Socket, device id : ");
                sb.append(LanDevice.this.mo23185G());
                sb.append(", ip : ");
                sb.append(LanDevice.this.f4722x);
                C3072i.m8042k().mo23432d(LanDevice.this);
                while (LanDevice.this.f4717Q) {
                    try {
                        String readLine = LanDevice.this.f4716C.readLine();
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("device socket, receive value = ");
                        sb2.append(readLine);
                        if (readLine == null) {
                            boolean unused5 = LanDevice.this.f4717Q = false;
                            C3072i.m8042k().mo23439s(LanDevice.this.mo23185G());
                        } else {
                            LanDevice.this.m7540R1(readLine);
                        }
                    } catch (Exception e) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("device socket, Exception = ");
                        sb3.append(e.getMessage());
                        boolean unused6 = LanDevice.this.f4717Q = false;
                        C3072i.m8042k().mo23439s(LanDevice.this.mo23185G());
                    }
                }
            } catch (Exception unused7) {
                boolean unused8 = LanDevice.this.f4717Q = false;
                C3072i.m8042k().mo23439s(LanDevice.this.mo23185G());
            }
        }
    }

    /* renamed from: com.yeelight.yeelib.device.LanDevice$b */
    static /* synthetic */ class C3006b {

        /* renamed from: a */
        static final /* synthetic */ int[] f4726a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.yeelight.yeelib.device.LanDevice$CachedMessageType[] r0 = com.yeelight.yeelib.device.LanDevice.CachedMessageType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f4726a = r0
                com.yeelight.yeelib.device.LanDevice$CachedMessageType r1 = com.yeelight.yeelib.device.LanDevice.CachedMessageType.MESSAGE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f4726a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.yeelight.yeelib.device.LanDevice$CachedMessageType r1 = com.yeelight.yeelib.device.LanDevice.CachedMessageType.EMPTY_MESSAGE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.device.LanDevice.C3006b.<clinit>():void");
        }
    }

    /* renamed from: com.yeelight.yeelib.device.LanDevice$c */
    private class C3007c {

        /* renamed from: a */
        CachedMessageType f4727a;

        /* renamed from: b */
        int f4728b;

        /* renamed from: c */
        Message f4729c;

        /* renamed from: d */
        boolean f4730d;

        /* renamed from: e */
        long f4731e;

        public C3007c(LanDevice lanDevice, CachedMessageType cachedMessageType, int i, Message message, boolean z, long j) {
            this.f4727a = cachedMessageType;
            this.f4728b = i;
            this.f4729c = message;
            this.f4730d = z;
            this.f4731e = j;
        }
    }

    /* renamed from: com.yeelight.yeelib.device.LanDevice$d */
    class C3008d extends Thread {

        /* renamed from: a */
        public Handler f4732a;

        /* renamed from: b */
        private List<C3007c> f4733b = new ArrayList();

        /* renamed from: com.yeelight.yeelib.device.LanDevice$d$a */
        class C3009a extends Handler {
            C3009a() {
            }

            public void handleMessage(Message message) {
                if (message.what == 0) {
                    String str = LanDevice.this.f4758v;
                    LanDevice.this.m7539N2((String) message.obj);
                }
            }
        }

        C3008d() {
        }

        /* renamed from: b */
        public void mo23173b(Message message) {
            Handler handler = this.f4732a;
            if (handler == null) {
                this.f4733b.add(new C3007c(LanDevice.this, CachedMessageType.MESSAGE, 0, message, false, 0));
            } else {
                handler.sendMessage(message);
            }
        }

        public void run() {
            Looper.prepare();
            this.f4732a = new C3009a();
            Looper.loop();
            for (C3007c next : this.f4733b) {
                int i = C3006b.f4726a[next.f4727a.ordinal()];
                if (i != 1) {
                    if (i == 2) {
                        if (next.f4730d) {
                            this.f4732a.sendEmptyMessageDelayed(next.f4728b, next.f4731e);
                        } else {
                            this.f4732a.sendEmptyMessage(next.f4728b);
                        }
                    }
                } else if (next.f4730d) {
                    this.f4732a.sendMessageDelayed(next.f4729c, next.f4731e);
                } else {
                    this.f4732a.sendMessage(next.f4729c);
                }
            }
        }
    }

    public LanDevice(InetAddress inetAddress, String str) {
        super(str, "yeelink.light.landevice", new C12048k((String) null));
        this.f4722x = inetAddress;
        this.f4723y = 55443;
    }

    /* renamed from: A2 */
    private String m7524A2(long j, int i) {
        int i2 = this.f4724z + 1;
        this.f4724z = i2;
        return "{\"id\":%id,\"method\":\"set_power\",\"params\":[\"on\",\"smooth\",%duration,%value]}\r\n".replace("%id", String.valueOf(i2)).replace("%duration", String.valueOf(j)).replace("%value", String.valueOf(i));
    }

    /* renamed from: B2 */
    private String m7525B2(boolean z) {
        String str;
        String str2;
        if (z) {
            int i = this.f4724z + 1;
            this.f4724z = i;
            str = String.valueOf(i);
            str2 = "{\"id\":%id,\"method\":\"set_power\",\"params\":[\"on\",\"smooth\",500]}\r\n";
        } else {
            int i2 = this.f4724z + 1;
            this.f4724z = i2;
            str = String.valueOf(i2);
            str2 = "{\"id\":%id,\"method\":\"set_power\",\"params\":[\"off\",\"smooth\",500]}\r\n";
        }
        return str2.replace("%id", str);
    }

    /* renamed from: C2 */
    private String m7527C2(boolean z) {
        String str;
        String str2;
        if (z) {
            int i = this.f4724z + 1;
            this.f4724z = i;
            str = String.valueOf(i);
            str2 = "{\"id\":%id,\"method\":\"set_power\",\"params\":[\"on\"]}\r\n";
        } else {
            int i2 = this.f4724z + 1;
            this.f4724z = i2;
            str = String.valueOf(i2);
            str2 = "{\"id\":%id,\"method\":\"set_power\",\"params\":[\"off\"]}\r\n";
        }
        return str2.replace("%id", str);
    }

    /* renamed from: D2 */
    private String m7529D2() {
        int i = this.f4724z + 1;
        this.f4724z = i;
        return "{\"id\":%id,\"method\":\"toggle\",\"params\":[]}\r\n".replace("%id", String.valueOf(i));
    }

    /* access modifiers changed from: private */
    /* renamed from: N2 */
    public void m7539N2(String str) {
        if (this.f4715B != null && this.f4714A.isConnected()) {
            try {
                this.f4715B.write(str.getBytes());
                this.f4715B.flush();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0082 A[Catch:{ JSONException -> 0x0184 }] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00a0 A[Catch:{ JSONException -> 0x0184 }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00be A[Catch:{ JSONException -> 0x0184 }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00dc A[Catch:{ JSONException -> 0x0184 }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00fa A[Catch:{ JSONException -> 0x0184 }] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0116 A[Catch:{ JSONException -> 0x0184 }] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0134 A[Catch:{ JSONException -> 0x0184 }] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0151 A[Catch:{ JSONException -> 0x0184 }] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x016d A[Catch:{ JSONException -> 0x0184 }] */
    /* JADX WARNING: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /* renamed from: R1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m7540R1(java.lang.String r17) {
        /*
            r16 = this;
            r1 = r16
            java.lang.String r0 = "bg_rgb"
            java.lang.String r2 = "bg_ct"
            java.lang.String r3 = "bg_power"
            java.lang.String r4 = "main_power"
            java.lang.String r5 = "bg_bright"
            java.lang.String r6 = "nl_br"
            java.lang.String r7 = "rgb"
            java.lang.String r8 = "ct"
            java.lang.String r9 = "color_mode"
            java.lang.String r10 = "bright"
            java.lang.String r11 = "power"
            org.json.JSONObject r12 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0184 }
            r13 = r17
            r12.<init>(r13)     // Catch:{ JSONException -> 0x0184 }
            java.lang.String r13 = "params"
            org.json.JSONObject r12 = r12.getJSONObject(r13)     // Catch:{ JSONException -> 0x0184 }
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x0184 }
            r13.<init>()     // Catch:{ JSONException -> 0x0184 }
            java.lang.String r14 = "params = "
            r13.append(r14)     // Catch:{ JSONException -> 0x0184 }
            java.lang.String r14 = r12.toString()     // Catch:{ JSONException -> 0x0184 }
            r13.append(r14)     // Catch:{ JSONException -> 0x0184 }
            boolean r13 = r12.has(r11)     // Catch:{ JSONException -> 0x0184 }
            java.lang.String r14 = "on"
            if (r13 == 0) goto L_0x0059
            java.lang.String r11 = r12.getString(r11)     // Catch:{ JSONException -> 0x0184 }
            com.yeelight.yeelib.device.WifiDeviceBase$i r13 = r1.f4719S     // Catch:{ JSONException -> 0x0184 }
            if (r13 == 0) goto L_0x0059
            boolean r11 = r11.equals(r14)     // Catch:{ JSONException -> 0x0184 }
            if (r11 == 0) goto L_0x0054
            com.yeelight.yeelib.device.WifiDeviceBase$i r11 = r1.f4719S     // Catch:{ JSONException -> 0x0184 }
            com.yeelight.yeelib.device.WifiDeviceBase$Power r13 = com.yeelight.yeelib.device.WifiDeviceBase.Power.on     // Catch:{ JSONException -> 0x0184 }
        L_0x0050:
            r11.mo31505m(r13)     // Catch:{ JSONException -> 0x0184 }
            goto L_0x0059
        L_0x0054:
            com.yeelight.yeelib.device.WifiDeviceBase$i r11 = r1.f4719S     // Catch:{ JSONException -> 0x0184 }
            com.yeelight.yeelib.device.WifiDeviceBase$Power r13 = com.yeelight.yeelib.device.WifiDeviceBase.Power.off     // Catch:{ JSONException -> 0x0184 }
            goto L_0x0050
        L_0x0059:
            boolean r11 = r12.has(r10)     // Catch:{ JSONException -> 0x0184 }
            if (r11 == 0) goto L_0x007a
            java.lang.String r10 = r12.getString(r10)     // Catch:{ JSONException -> 0x0184 }
            com.yeelight.yeelib.device.WifiDeviceBase$i r11 = r1.f4719S     // Catch:{ JSONException -> 0x0184 }
            if (r11 == 0) goto L_0x007a
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ JSONException -> 0x0184 }
            int r10 = r10.intValue()     // Catch:{ JSONException -> 0x0184 }
            r13 = r2
            r15 = r3
            long r2 = (long) r10     // Catch:{ JSONException -> 0x0184 }
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch:{ JSONException -> 0x0184 }
            r11.mo31500a(r2)     // Catch:{ JSONException -> 0x0184 }
            goto L_0x007c
        L_0x007a:
            r13 = r2
            r15 = r3
        L_0x007c:
            boolean r2 = r12.has(r9)     // Catch:{ JSONException -> 0x0184 }
            if (r2 == 0) goto L_0x009a
            java.lang.String r2 = r12.getString(r9)     // Catch:{ JSONException -> 0x0184 }
            com.yeelight.yeelib.device.WifiDeviceBase$i r3 = r1.f4719S     // Catch:{ JSONException -> 0x0184 }
            if (r3 == 0) goto L_0x009a
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ JSONException -> 0x0184 }
            int r2 = r2.intValue()     // Catch:{ JSONException -> 0x0184 }
            long r9 = (long) r2     // Catch:{ JSONException -> 0x0184 }
            java.lang.Long r2 = java.lang.Long.valueOf(r9)     // Catch:{ JSONException -> 0x0184 }
            r3.mo31504l(r2)     // Catch:{ JSONException -> 0x0184 }
        L_0x009a:
            boolean r2 = r12.has(r8)     // Catch:{ JSONException -> 0x0184 }
            if (r2 == 0) goto L_0x00b8
            java.lang.String r2 = r12.getString(r8)     // Catch:{ JSONException -> 0x0184 }
            com.yeelight.yeelib.device.WifiDeviceBase$i r3 = r1.f4719S     // Catch:{ JSONException -> 0x0184 }
            if (r3 == 0) goto L_0x00b8
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ JSONException -> 0x0184 }
            int r2 = r2.intValue()     // Catch:{ JSONException -> 0x0184 }
            long r8 = (long) r2     // Catch:{ JSONException -> 0x0184 }
            java.lang.Long r2 = java.lang.Long.valueOf(r8)     // Catch:{ JSONException -> 0x0184 }
            r3.mo31501h(r2)     // Catch:{ JSONException -> 0x0184 }
        L_0x00b8:
            boolean r2 = r12.has(r7)     // Catch:{ JSONException -> 0x0184 }
            if (r2 == 0) goto L_0x00d6
            java.lang.String r2 = r12.getString(r7)     // Catch:{ JSONException -> 0x0184 }
            com.yeelight.yeelib.device.WifiDeviceBase$i r3 = r1.f4719S     // Catch:{ JSONException -> 0x0184 }
            if (r3 == 0) goto L_0x00d6
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ JSONException -> 0x0184 }
            int r2 = r2.intValue()     // Catch:{ JSONException -> 0x0184 }
            long r7 = (long) r2     // Catch:{ JSONException -> 0x0184 }
            java.lang.Long r2 = java.lang.Long.valueOf(r7)     // Catch:{ JSONException -> 0x0184 }
            r3.mo31502j(r2)     // Catch:{ JSONException -> 0x0184 }
        L_0x00d6:
            boolean r2 = r12.has(r6)     // Catch:{ JSONException -> 0x0184 }
            if (r2 == 0) goto L_0x00f4
            java.lang.String r2 = r12.getString(r6)     // Catch:{ JSONException -> 0x0184 }
            com.yeelight.yeelib.device.WifiDeviceBase$i r3 = r1.f4719S     // Catch:{ JSONException -> 0x0184 }
            if (r3 == 0) goto L_0x00f4
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ JSONException -> 0x0184 }
            int r2 = r2.intValue()     // Catch:{ JSONException -> 0x0184 }
            long r6 = (long) r2     // Catch:{ JSONException -> 0x0184 }
            java.lang.Long r2 = java.lang.Long.valueOf(r6)     // Catch:{ JSONException -> 0x0184 }
            r3.mo31503k(r2)     // Catch:{ JSONException -> 0x0184 }
        L_0x00f4:
            boolean r2 = r12.has(r5)     // Catch:{ JSONException -> 0x0184 }
            if (r2 == 0) goto L_0x0110
            java.lang.String r2 = r12.getString(r5)     // Catch:{ JSONException -> 0x0184 }
            com.yeelight.yeelib.device.WifiDeviceBase$h r3 = r1.f4720T     // Catch:{ JSONException -> 0x0184 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ JSONException -> 0x0184 }
            int r2 = r2.intValue()     // Catch:{ JSONException -> 0x0184 }
            long r5 = (long) r2     // Catch:{ JSONException -> 0x0184 }
            java.lang.Long r2 = java.lang.Long.valueOf(r5)     // Catch:{ JSONException -> 0x0184 }
            r3.mo31496l(r2)     // Catch:{ JSONException -> 0x0184 }
        L_0x0110:
            boolean r2 = r12.has(r4)     // Catch:{ JSONException -> 0x0184 }
            if (r2 == 0) goto L_0x012d
            java.lang.String r2 = r12.getString(r4)     // Catch:{ JSONException -> 0x0184 }
            boolean r2 = r2.equals(r14)     // Catch:{ JSONException -> 0x0184 }
            if (r2 == 0) goto L_0x0128
            com.yeelight.yeelib.device.WifiDeviceBase$h r2 = r1.f4720T     // Catch:{ JSONException -> 0x0184 }
            com.yeelight.yeelib.device.WifiDeviceBase$Power r3 = com.yeelight.yeelib.device.WifiDeviceBase.Power.on     // Catch:{ JSONException -> 0x0184 }
        L_0x0124:
            r2.mo31499p(r3)     // Catch:{ JSONException -> 0x0184 }
            goto L_0x012d
        L_0x0128:
            com.yeelight.yeelib.device.WifiDeviceBase$h r2 = r1.f4720T     // Catch:{ JSONException -> 0x0184 }
            com.yeelight.yeelib.device.WifiDeviceBase$Power r3 = com.yeelight.yeelib.device.WifiDeviceBase.Power.off     // Catch:{ JSONException -> 0x0184 }
            goto L_0x0124
        L_0x012d:
            r2 = r15
            boolean r3 = r12.has(r2)     // Catch:{ JSONException -> 0x0184 }
            if (r3 == 0) goto L_0x014b
            java.lang.String r2 = r12.getString(r2)     // Catch:{ JSONException -> 0x0184 }
            boolean r2 = r2.equals(r14)     // Catch:{ JSONException -> 0x0184 }
            if (r2 == 0) goto L_0x0146
            com.yeelight.yeelib.device.WifiDeviceBase$h r2 = r1.f4720T     // Catch:{ JSONException -> 0x0184 }
            com.yeelight.yeelib.device.WifiDeviceBase$Power r3 = com.yeelight.yeelib.device.WifiDeviceBase.Power.on     // Catch:{ JSONException -> 0x0184 }
        L_0x0142:
            r2.mo31498o(r3)     // Catch:{ JSONException -> 0x0184 }
            goto L_0x014b
        L_0x0146:
            com.yeelight.yeelib.device.WifiDeviceBase$h r2 = r1.f4720T     // Catch:{ JSONException -> 0x0184 }
            com.yeelight.yeelib.device.WifiDeviceBase$Power r3 = com.yeelight.yeelib.device.WifiDeviceBase.Power.off     // Catch:{ JSONException -> 0x0184 }
            goto L_0x0142
        L_0x014b:
            boolean r2 = r12.has(r13)     // Catch:{ JSONException -> 0x0184 }
            if (r2 == 0) goto L_0x0167
            java.lang.String r2 = r12.getString(r13)     // Catch:{ JSONException -> 0x0184 }
            com.yeelight.yeelib.device.WifiDeviceBase$h r3 = r1.f4720T     // Catch:{ JSONException -> 0x0184 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ JSONException -> 0x0184 }
            int r2 = r2.intValue()     // Catch:{ JSONException -> 0x0184 }
            long r4 = (long) r2     // Catch:{ JSONException -> 0x0184 }
            java.lang.Long r2 = java.lang.Long.valueOf(r4)     // Catch:{ JSONException -> 0x0184 }
            r3.mo31495j(r2)     // Catch:{ JSONException -> 0x0184 }
        L_0x0167:
            boolean r2 = r12.has(r0)     // Catch:{ JSONException -> 0x0184 }
            if (r2 == 0) goto L_0x0196
            java.lang.String r0 = r12.getString(r0)     // Catch:{ JSONException -> 0x0184 }
            com.yeelight.yeelib.device.WifiDeviceBase$h r2 = r1.f4720T     // Catch:{ JSONException -> 0x0184 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ JSONException -> 0x0184 }
            int r0 = r0.intValue()     // Catch:{ JSONException -> 0x0184 }
            long r3 = (long) r0     // Catch:{ JSONException -> 0x0184 }
            java.lang.Long r0 = java.lang.Long.valueOf(r3)     // Catch:{ JSONException -> 0x0184 }
            r2.mo31497n(r0)     // Catch:{ JSONException -> 0x0184 }
            goto L_0x0196
        L_0x0184:
            r0 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "handleCallback error_msg  = "
            r2.append(r3)
            java.lang.String r0 = r0.getMessage()
            r2.append(r0)
        L_0x0196:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.device.LanDevice.m7540R1(java.lang.String):void");
    }

    /* renamed from: T1 */
    private void m7541T1() {
        Thread thread = new Thread(new C3005a());
        this.f4718R = thread;
        thread.start();
    }

    /* renamed from: a2 */
    private String m7542a2(C8327s sVar) {
        Locale locale = Locale.US;
        int i = this.f4724z + 1;
        this.f4724z = i;
        return String.format(locale, "{\"id\":%id,\"method\":\"set_scene\",\"params\":[\"cf\",%s,%s,\"%s\"]}\r\n".replace("%id", String.valueOf(i)), new Object[]{Integer.valueOf(sVar.mo35444k()), Integer.valueOf(sVar.mo35445l()), sVar.mo35447n()});
    }

    /* renamed from: b2 */
    private String m7543b2(C8327s sVar) {
        Locale locale = Locale.US;
        int i = this.f4724z + 1;
        this.f4724z = i;
        return String.format(locale, "{\"id\":%id,\"method\":\"set_scene_bundle\",\"params\":[\"\\\"keep\\\"\",\"\\\"bright\\\",%s,%s\"]}\r\n".replace("%id", String.valueOf(i)), new Object[]{Integer.valueOf(sVar.mo35439f()), 500});
    }

    /* renamed from: c2 */
    private String m7544c2(C8327s sVar) {
        Locale locale = Locale.US;
        int i = this.f4724z + 1;
        this.f4724z = i;
        return String.format(locale, "{\"id\":%id,\"method\":\"set_scene_bundle\",\"params\":[\"\\\"keep\\\"\",\"\\\"bright\\\",%s\"]}\r\n".replace("%id", String.valueOf(i)), new Object[]{Integer.valueOf(sVar.mo35439f())});
    }

    /* renamed from: d2 */
    private String m7545d2(C8327s sVar) {
        Locale locale = Locale.US;
        int i = this.f4724z + 1;
        this.f4724z = i;
        return String.format(locale, "{\"id\":%id,\"method\":\"set_scene_bundle\",\"params\":[\"\\\"keep\\\"\",\"\\\"cf\\\",%s,%s,\"%s\"\"]}\r\n".replace("%id", String.valueOf(i)), new Object[]{Integer.valueOf(sVar.mo35436c().mo35339i()), Integer.valueOf(sVar.mo35436c().mo35336f().ordinal()), sVar.mo35436c().mo35337g()});
    }

    /* renamed from: e2 */
    private String m7546e2(C8327s sVar) {
        Locale locale = Locale.US;
        int i = this.f4724z + 1;
        this.f4724z = i;
        return String.format(locale, "{\"id\":%id,\"method\":\"set_scene_bundle\",\"params\":[\"\\\"keep\\\"\",\"\\\"color\\\",%s,%s\"]}\r\n".replace("%id", String.valueOf(i)), new Object[]{Integer.valueOf(sVar.mo35440g() & ViewCompat.MEASURED_SIZE_MASK), Integer.valueOf(sVar.mo35439f())});
    }

    /* renamed from: f2 */
    private String m7547f2(C8327s sVar) {
        Locale locale = Locale.US;
        int i = this.f4724z + 1;
        this.f4724z = i;
        return String.format(locale, "{\"id\":%id,\"method\":\"set_scene_bundle\",\"params\":[\"\\\"keep\\\"\",\"\\\"ct\\\",%s,%s\"]}\r\n".replace("%id", String.valueOf(i)), new Object[]{Integer.valueOf(sVar.mo35441h()), Integer.valueOf(sVar.mo35439f())});
    }

    /* renamed from: g2 */
    private String m7548g2(int i) {
        int i2 = this.f4724z + 1;
        this.f4724z = i2;
        return "{\"id\":%id,\"method\":\"bg_set_power\",\"params\":[\"on\",\"smooth\",500,%value]}\r\n".replace("%id", String.valueOf(i2)).replace("%value", String.valueOf(i));
    }

    /* renamed from: h2 */
    private String m7549h2(long j, int i) {
        int i2 = this.f4724z + 1;
        this.f4724z = i2;
        return "{\"id\":%id,\"method\":\"bg_set_power\",\"params\":[\"on\",\"smooth\",%duration,%value]}\r\n".replace("%id", String.valueOf(i2)).replace("%duration", String.valueOf(j)).replace("%value", String.valueOf(i));
    }

    /* renamed from: i2 */
    private String m7550i2(boolean z) {
        String str;
        String str2;
        if (z) {
            int i = this.f4724z + 1;
            this.f4724z = i;
            str = String.valueOf(i);
            str2 = "{\"id\":%id,\"method\":\"bg_set_power\",\"params\":[\"on\",\"smooth\",500]}\r\n";
        } else {
            int i2 = this.f4724z + 1;
            this.f4724z = i2;
            str = String.valueOf(i2);
            str2 = "{\"id\":%id,\"method\":\"bg_set_power\",\"params\":[\"off\",\"smooth\",500]}\r\n";
        }
        return str2.replace("%id", str);
    }

    /* renamed from: j2 */
    private String m7551j2(boolean z) {
        String str;
        String str2;
        if (z) {
            int i = this.f4724z + 1;
            this.f4724z = i;
            str = String.valueOf(i);
            str2 = "{\"id\":%id,\"method\":\"bg_set_power\",\"params\":[\"on\"]}\r\n";
        } else {
            int i2 = this.f4724z + 1;
            this.f4724z = i2;
            str = String.valueOf(i2);
            str2 = "{\"id\":%id,\"method\":\"bg_set_power\",\"params\":[\"off\"]}\r\n";
        }
        return str2.replace("%id", str);
    }

    /* renamed from: k2 */
    private String m7552k2(C8327s sVar) {
        Locale locale = Locale.US;
        int i = this.f4724z + 1;
        this.f4724z = i;
        return String.format(locale, "{\"id\":%id,\"method\":\"set_scene\",\"params\":[\"bright\",%s,%s]}\r\n".replace("%id", String.valueOf(i)), new Object[]{Integer.valueOf(sVar.mo35439f()), 500});
    }

    /* renamed from: l2 */
    private String m7553l2(C8327s sVar) {
        Locale locale = Locale.US;
        int i = this.f4724z + 1;
        this.f4724z = i;
        return String.format(locale, "{\"id\":%id,\"method\":\"set_scene\",\"params\":[\"bright\",%s]}\r\n".replace("%id", String.valueOf(i)), new Object[]{Integer.valueOf(sVar.mo35439f())});
    }

    /* renamed from: m2 */
    private String m7554m2(int i) {
        int i2 = this.f4724z + 1;
        this.f4724z = i2;
        return "{\"id\":%id,\"method\":\"set_bright\",\"params\":[%value, \"smooth\", 200]}\r\n".replace("%id", String.valueOf(i2)).replace("%value", String.valueOf(i));
    }

    /* renamed from: n2 */
    private String m7555n2(int i) {
        int i2 = this.f4724z + 1;
        this.f4724z = i2;
        return "{\"id\":%id,\"method\":\"set_bright\",\"params\":[%value]}\r\n".replace("%id", String.valueOf(i2)).replace("%value", String.valueOf(i));
    }

    /* renamed from: o2 */
    private String m7556o2(C8312e eVar) {
        List<C8321m> b0 = eVar.mo35348b0();
        if (b0 == null || b0.size() < 2) {
            return null;
        }
        Locale locale = Locale.US;
        int i = this.f4724z + 1;
        this.f4724z = i;
        return String.format(locale, "{\"id\":%id,\"method\":\"set_scene_bundle\",\"params\":[\"%s\",\"%s\"]}\r\n".replace("%id", String.valueOf(i)), new Object[]{b0.get(0).mo35345Z().replace("\"", "\\\""), b0.get(1).mo35345Z().replace("\"", "\\\"")});
    }

    /* renamed from: p2 */
    private String m7557p2(int i) {
        int i2 = this.f4724z + 1;
        this.f4724z = i2;
        return "{\"id\":%id,\"method\":\"set_ct_abx\",\"params\":[%value, \"smooth\", 500]}\r\n".replace("%id", String.valueOf(i2)).replace("%value", String.valueOf(i));
    }

    /* renamed from: q2 */
    private String m7558q2(int i) {
        int i2 = this.f4724z + 1;
        this.f4724z = i2;
        return "{\"id\":%id,\"method\":\"set_ct_abx\",\"params\":[%value]}\r\n".replace("%id", String.valueOf(i2)).replace("%value", String.valueOf(i));
    }

    /* renamed from: r2 */
    private String m7559r2(int i) {
        int i2 = this.f4724z + 1;
        this.f4724z = i2;
        return "{\"id\":%id,\"method\":\"set_rgb\",\"params\":[%value,\"smooth\", 500]}\r\n".replace("%id", String.valueOf(i2)).replace("%value", String.valueOf(i));
    }

    /* renamed from: s2 */
    private String m7560s2(int i) {
        int i2 = this.f4724z + 1;
        this.f4724z = i2;
        return "{\"id\":%id,\"method\":\"set_rgb\",\"params\":[%value]}\r\n".replace("%id", String.valueOf(i2)).replace("%value", String.valueOf(i));
    }

    /* renamed from: t2 */
    private String m7561t2(C8327s sVar) {
        Locale locale = Locale.US;
        int i = this.f4724z + 1;
        this.f4724z = i;
        return String.format(locale, "{\"id\":%id,\"method\":\"set_scene\",\"params\":[\"cf\",%s,%s,\"%s\"]}\r\n".replace("%id", String.valueOf(i)), new Object[]{Integer.valueOf(sVar.mo35436c().mo35339i()), Integer.valueOf(sVar.mo35436c().mo35336f().ordinal()), sVar.mo35436c().mo35337g()});
    }

    /* renamed from: u2 */
    private String m7562u2(C8327s sVar) {
        Locale locale = Locale.US;
        int i = this.f4724z + 1;
        this.f4724z = i;
        return String.format(locale, "{\"id\":%id,\"method\":\"set_scene\",\"params\":[\"color\",%s,%s]}\r\n".replace("%id", String.valueOf(i)), new Object[]{Integer.valueOf(sVar.mo35440g() & ViewCompat.MEASURED_SIZE_MASK), Integer.valueOf(sVar.mo35439f())});
    }

    /* renamed from: v2 */
    private String m7563v2(C8327s sVar) {
        Locale locale = Locale.US;
        int i = this.f4724z + 1;
        this.f4724z = i;
        return String.format(locale, "{\"id\":%id,\"method\":\"set_scene\",\"params\":[\"ct\",%s,%s]}\r\n".replace("%id", String.valueOf(i)), new Object[]{Integer.valueOf(sVar.mo35441h()), Integer.valueOf(sVar.mo35439f())});
    }

    /* renamed from: w2 */
    private String m7564w2() {
        int i = this.f4724z + 1;
        this.f4724z = i;
        return "{\"id\":%id,\"method\":\"get_prop\",\"params\":[]}\r\n".replace("%id", String.valueOf(i));
    }

    /* renamed from: x2 */
    private String m7565x2(int i) {
        int i2 = this.f4724z + 1;
        this.f4724z = i2;
        return "{\"id\":%id,\"method\":\"set_scene\",\"params\":[\"nightlight\",%value]}\r\n".replace("%id", String.valueOf(i2)).replace("%value", String.valueOf(i));
    }

    /* renamed from: y2 */
    private String m7566y2(C8327s sVar) {
        Locale locale = Locale.US;
        int i = this.f4724z + 1;
        this.f4724z = i;
        return String.format(locale, "{\"id\":%id,\"method\":\"set_scene\",\"params\":[\"nightlight\",%s,%s]}\r\n".replace("%id", String.valueOf(i)), new Object[]{Integer.valueOf(sVar.mo35439f()), Integer.valueOf(sVar.mo35441h())});
    }

    /* renamed from: z2 */
    private String m7567z2(int i) {
        int i2 = this.f4724z + 1;
        this.f4724z = i2;
        return "{\"id\":%id,\"method\":\"set_power\",\"params\":[\"on\",\"smooth\",500,%value]}\r\n".replace("%id", String.valueOf(i2)).replace("%value", String.valueOf(i));
    }

    /* renamed from: A */
    public int mo23113A() {
        return 11;
    }

    /* renamed from: A1 */
    public boolean mo23114A1() {
        String D2 = m7529D2();
        StringBuilder sb = new StringBuilder();
        sb.append("invoke lan device toogle, device id: ");
        sb.append(mo23185G());
        sb.append(" , cmd = ");
        sb.append(D2);
        Message message = new Message();
        message.what = 0;
        message.obj = D2;
        this.f4721U.mo23173b(message);
        return true;
    }

    /* renamed from: E2 */
    public void mo23115E2(WifiDeviceBase.C6079h hVar) {
        this.f4720T = hVar;
    }

    /* renamed from: F */
    public int mo23116F() {
        return 0;
    }

    /* renamed from: F2 */
    public void mo23117F2(WifiDeviceBase.C6080i iVar) {
        this.f4719S = iVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0065 A[RETURN] */
    /* renamed from: G2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo23118G2(com.yeelight.yeelib.models.C8327s r3) {
        /*
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "invoke lan device setBgBundleScene, device id: "
            r0.append(r1)
            java.lang.String r1 = r2.mo23185G()
            r0.append(r1)
            boolean r0 = r3.mo35455v()
            if (r0 == 0) goto L_0x001c
        L_0x0017:
            java.lang.String r3 = r2.m7545d2(r3)
            goto L_0x0045
        L_0x001c:
            boolean r0 = r3.mo35458y()
            if (r0 == 0) goto L_0x0027
            java.lang.String r3 = r2.m7543b2(r3)
            goto L_0x0045
        L_0x0027:
            boolean r0 = r3.mo35419D()
            if (r0 == 0) goto L_0x0032
            java.lang.String r3 = r2.m7547f2(r3)
            goto L_0x0045
        L_0x0032:
            boolean r0 = r3.mo35417B()
            if (r0 == 0) goto L_0x003d
            java.lang.String r3 = r2.m7546e2(r3)
            goto L_0x0045
        L_0x003d:
            boolean r0 = r3.mo35456w()
            if (r0 == 0) goto L_0x0044
            goto L_0x0017
        L_0x0044:
            r3 = 0
        L_0x0045:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "setBgBundleScene params = "
            r0.append(r1)
            r0.append(r3)
            r0 = 0
            if (r3 == 0) goto L_0x0065
            android.os.Message r1 = new android.os.Message
            r1.<init>()
            r1.what = r0
            r1.obj = r3
            com.yeelight.yeelib.device.LanDevice$d r3 = r2.f4721U
            r3.mo23173b(r1)
            r3 = 1
            return r3
        L_0x0065:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.device.LanDevice.mo23118G2(com.yeelight.yeelib.models.s):boolean");
    }

    /* renamed from: H */
    public int mo23119H() {
        return 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0065 A[RETURN] */
    /* renamed from: H2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo23120H2(com.yeelight.yeelib.models.C8327s r3) {
        /*
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "invoke lan device setBgBundleScene, device id: "
            r0.append(r1)
            java.lang.String r1 = r2.mo23185G()
            r0.append(r1)
            boolean r0 = r3.mo35455v()
            if (r0 == 0) goto L_0x001c
        L_0x0017:
            java.lang.String r3 = r2.m7545d2(r3)
            goto L_0x0045
        L_0x001c:
            boolean r0 = r3.mo35458y()
            if (r0 == 0) goto L_0x0027
            java.lang.String r3 = r2.m7544c2(r3)
            goto L_0x0045
        L_0x0027:
            boolean r0 = r3.mo35419D()
            if (r0 == 0) goto L_0x0032
            java.lang.String r3 = r2.m7547f2(r3)
            goto L_0x0045
        L_0x0032:
            boolean r0 = r3.mo35417B()
            if (r0 == 0) goto L_0x003d
            java.lang.String r3 = r2.m7546e2(r3)
            goto L_0x0045
        L_0x003d:
            boolean r0 = r3.mo35456w()
            if (r0 == 0) goto L_0x0044
            goto L_0x0017
        L_0x0044:
            r3 = 0
        L_0x0045:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "setBgBundleScene params = "
            r0.append(r1)
            r0.append(r3)
            r0 = 0
            if (r3 == 0) goto L_0x0065
            android.os.Message r1 = new android.os.Message
            r1.<init>()
            r1.what = r0
            r1.obj = r3
            com.yeelight.yeelib.device.LanDevice$d r3 = r2.f4721U
            r3.mo23173b(r1)
            r3 = 1
            return r3
        L_0x0065:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.device.LanDevice.mo23120H2(com.yeelight.yeelib.models.s):boolean");
    }

    /* renamed from: I2 */
    public boolean mo23121I2(long j) {
        String n2 = m7555n2((int) j);
        StringBuilder sb = new StringBuilder();
        sb.append("invoke lan device setBright, device id: ");
        sb.append(mo23185G());
        sb.append(" , cmd = ");
        sb.append(n2);
        Message message = new Message();
        message.what = 0;
        message.obj = n2;
        this.f4721U.mo23173b(message);
        return true;
    }

    /* renamed from: J2 */
    public boolean mo23122J2(int i) {
        String s2 = m7560s2(i);
        StringBuilder sb = new StringBuilder();
        sb.append("invoke lan device setColor, device id: ");
        sb.append(mo23185G());
        sb.append(" , cmd = ");
        sb.append(s2);
        Message message = new Message();
        message.what = 0;
        message.obj = s2;
        this.f4721U.mo23173b(message);
        return true;
    }

    /* renamed from: K2 */
    public boolean mo23123K2(int i) {
        String q2 = m7558q2(i);
        StringBuilder sb = new StringBuilder();
        sb.append("invoke lan device setCt, device id: ");
        sb.append(mo23185G());
        sb.append(" , cmd = ");
        sb.append(q2);
        Message message = new Message();
        message.what = 0;
        message.obj = q2;
        this.f4721U.mo23173b(message);
        return true;
    }

    /* renamed from: L2 */
    public boolean mo23124L2(C8327s sVar) {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("invoke lan device setScene, device id: ");
        sb.append(mo23185G());
        if (sVar.mo35455v()) {
            str = m7561t2(sVar);
        } else if (sVar.mo35458y()) {
            str = m7553l2(sVar);
        } else if (sVar.mo35419D()) {
            str = m7563v2(sVar);
        } else if (sVar.mo35417B()) {
            str = m7562u2(sVar);
        } else if (sVar.mo35456w()) {
            str = m7542a2(sVar);
        } else if (sVar.mo35421F()) {
            str = m7565x2(sVar.mo35439f());
        } else {
            if (sVar.mo35459z()) {
                if (sVar instanceof C8312e) {
                    str = m7556o2((C8312e) sVar);
                }
            } else if (sVar.mo35422G()) {
                str = m7566y2(sVar);
            }
            str = null;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("setScene params = ");
        sb2.append(str);
        if (str == null) {
            return false;
        }
        Message message = new Message();
        message.what = 0;
        message.obj = str;
        this.f4721U.mo23173b(message);
        return true;
    }

    /* renamed from: M2 */
    public void mo23125M2() {
        this.f4719S = null;
        this.f4720T = null;
    }

    /* renamed from: N1 */
    public boolean mo23126N1() {
        String i2 = m7550i2(false);
        StringBuilder sb = new StringBuilder();
        sb.append("invoke lan device close, device id: ");
        sb.append(mo23185G());
        sb.append(" , cmd = ");
        sb.append(i2);
        Message message = new Message();
        message.what = 0;
        message.obj = i2;
        this.f4721U.mo23173b(message);
        return true;
    }

    /* renamed from: O1 */
    public boolean mo23127O1() {
        String C2 = m7527C2(false);
        StringBuilder sb = new StringBuilder();
        sb.append("invoke lan device close, device id: ");
        sb.append(mo23185G());
        sb.append(" , cmd = ");
        sb.append(C2);
        Message message = new Message();
        message.what = 0;
        message.obj = C2;
        this.f4721U.mo23173b(message);
        return true;
    }

    /* renamed from: P1 */
    public boolean mo23128P1(String str, int i) {
        return false;
    }

    /* renamed from: Q1 */
    public Socket mo23129Q1() {
        return this.f4714A;
    }

    /* renamed from: S1 */
    public void mo23130S1() {
        StringBuilder sb = new StringBuilder();
        sb.append("initSocket device Id = ");
        sb.append(mo23185G());
        m7541T1();
        C3008d dVar = new C3008d();
        this.f4721U = dVar;
        dVar.start();
    }

    /* renamed from: U0 */
    public boolean mo23131U0() {
        return false;
    }

    /* renamed from: U1 */
    public boolean mo23132U1() {
        String i2 = m7550i2(true);
        StringBuilder sb = new StringBuilder();
        sb.append("invoke lan device open, device id: ");
        sb.append(mo23185G());
        sb.append(" , cmd = ");
        sb.append(i2);
        Message message = new Message();
        message.what = 0;
        message.obj = i2;
        this.f4721U.mo23173b(message);
        return true;
    }

    /* renamed from: V0 */
    public void mo23133V0(C12143c cVar) {
    }

    /* renamed from: V1 */
    public boolean mo23134V1() {
        String j2 = m7551j2(true);
        StringBuilder sb = new StringBuilder();
        sb.append("invoke lan device open, device id: ");
        sb.append(mo23185G());
        sb.append(" , cmd = ");
        sb.append(j2);
        Message message = new Message();
        message.what = 0;
        message.obj = j2;
        this.f4721U.mo23173b(message);
        return true;
    }

    /* renamed from: W1 */
    public boolean mo23135W1(int i) {
        String g2 = m7548g2(i);
        StringBuilder sb = new StringBuilder();
        sb.append("invoke lan device open, device id: ");
        sb.append(mo23185G());
        sb.append(" , cmd = ");
        sb.append(g2);
        Message message = new Message();
        message.what = 0;
        message.obj = g2;
        this.f4721U.mo23173b(message);
        return true;
    }

    /* renamed from: X1 */
    public boolean mo23136X1(long j, int i) {
        String h2 = m7549h2(j, i);
        StringBuilder sb = new StringBuilder();
        sb.append("invoke lan device open, device id: ");
        sb.append(mo23185G());
        sb.append(" , cmd = ");
        sb.append(h2);
        Message message = new Message();
        message.what = 0;
        message.obj = h2;
        this.f4721U.mo23173b(message);
        return true;
    }

    /* renamed from: Y0 */
    public boolean mo23137Y0() {
        return false;
    }

    /* renamed from: Y1 */
    public boolean mo23138Y1() {
        String C2 = m7527C2(true);
        StringBuilder sb = new StringBuilder();
        sb.append("invoke lan device open, device id: ");
        sb.append(mo23185G());
        sb.append(" , cmd = ");
        sb.append(C2);
        Message message = new Message();
        message.what = 0;
        message.obj = C2;
        this.f4721U.mo23173b(message);
        return true;
    }

    /* renamed from: Z1 */
    public boolean mo23139Z1(long j, int i) {
        String A2 = m7524A2(j, i);
        StringBuilder sb = new StringBuilder();
        sb.append("invoke lan device open, device id: ");
        sb.append(mo23185G());
        sb.append(" , cmd = ");
        sb.append(A2);
        Message message = new Message();
        message.what = 0;
        message.obj = A2;
        this.f4721U.mo23173b(message);
        return true;
    }

    /* renamed from: b1 */
    public boolean mo23140b1() {
        String B2 = m7525B2(false);
        StringBuilder sb = new StringBuilder();
        sb.append("invoke lan device close, device id: ");
        sb.append(mo23185G());
        sb.append(" , cmd = ");
        sb.append(B2);
        Message message = new Message();
        message.what = 0;
        message.obj = B2;
        this.f4721U.mo23173b(message);
        return true;
    }

    /* renamed from: c1 */
    public boolean mo23141c1() {
        return false;
    }

    /* renamed from: f1 */
    public boolean mo23142f1(boolean z) {
        return false;
    }

    /* renamed from: g0 */
    public int mo23143g0() {
        return 0;
    }

    /* renamed from: i1 */
    public String mo23144i1() {
        return this.f4736a;
    }

    /* renamed from: k0 */
    public boolean mo23145k0() {
        return false;
    }

    /* renamed from: k1 */
    public boolean mo23146k1() {
        return false;
    }

    /* renamed from: l0 */
    public boolean mo23147l0() {
        return false;
    }

    /* renamed from: l1 */
    public boolean mo23148l1() {
        String B2 = m7525B2(true);
        StringBuilder sb = new StringBuilder();
        sb.append("invoke lan device open, device id: ");
        sb.append(mo23185G());
        sb.append(" , cmd = ");
        sb.append(B2);
        Message message = new Message();
        message.what = 0;
        message.obj = B2;
        this.f4721U.mo23173b(message);
        return true;
    }

    /* renamed from: m0 */
    public boolean mo23149m0() {
        return false;
    }

    /* renamed from: m1 */
    public boolean mo23150m1(int i) {
        String z2 = m7567z2(i);
        StringBuilder sb = new StringBuilder();
        sb.append("invoke lan device open, device id: ");
        sb.append(mo23185G());
        sb.append(" , cmd = ");
        sb.append(z2);
        Message message = new Message();
        message.what = 0;
        message.obj = z2;
        this.f4721U.mo23173b(message);
        return true;
    }

    /* renamed from: n */
    public void mo23151n() {
    }

    /* renamed from: o1 */
    public boolean mo23152o1(DeviceStatusBase.DeviceMode deviceMode) {
        return false;
    }

    /* renamed from: p0 */
    public boolean mo23153p0() {
        return false;
    }

    /* renamed from: p1 */
    public boolean mo23154p1(long j) {
        String m2 = m7554m2((int) j);
        StringBuilder sb = new StringBuilder();
        sb.append("invoke lan device setBright, device id: ");
        sb.append(mo23185G());
        sb.append(" , cmd = ");
        sb.append(m2);
        Message message = new Message();
        message.what = 0;
        message.obj = m2;
        this.f4721U.mo23173b(message);
        return true;
    }

    /* renamed from: q1 */
    public boolean mo23155q1(int i) {
        String r2 = m7559r2(i);
        StringBuilder sb = new StringBuilder();
        sb.append("invoke lan device setColor, device id: ");
        sb.append(mo23185G());
        sb.append(" , cmd = ");
        sb.append(r2);
        Message message = new Message();
        message.what = 0;
        message.obj = r2;
        this.f4721U.mo23173b(message);
        return true;
    }

    /* renamed from: r */
    public void mo23156r() {
        try {
            this.f4717Q = false;
            BufferedOutputStream bufferedOutputStream = this.f4715B;
            if (bufferedOutputStream != null) {
                bufferedOutputStream.close();
            }
            BufferedReader bufferedReader = this.f4716C;
            if (bufferedReader != null) {
                bufferedReader.close();
            }
            Socket socket = this.f4714A;
            if (socket != null) {
                socket.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: r1 */
    public boolean mo23157r1(int i, int[] iArr, int i2) {
        return false;
    }

    /* renamed from: s */
    public boolean mo23158s(ActionType actionType) {
        return false;
    }

    /* renamed from: s1 */
    public boolean mo23159s1(int i) {
        String p2 = m7557p2(i);
        StringBuilder sb = new StringBuilder();
        sb.append("invoke lan device setCt, device id: ");
        sb.append(mo23185G());
        sb.append(" , cmd = ");
        sb.append(p2);
        Message message = new Message();
        message.what = 0;
        message.obj = p2;
        this.f4721U.mo23173b(message);
        return true;
    }

    /* renamed from: t1 */
    public boolean mo23160t1() {
        return false;
    }

    /* renamed from: u0 */
    public void mo23161u0(View view) {
    }

    /* renamed from: u1 */
    public boolean mo23162u1(int i) {
        return false;
    }

    /* renamed from: v0 */
    public void mo23163v0() {
        super.mo23163v0();
    }

    /* renamed from: w0 */
    public boolean mo23164w0(String str) {
        return false;
    }

    /* renamed from: w1 */
    public boolean mo23165w1(DeviceStatusBase.DeviceMode deviceMode) {
        return false;
    }

    /* renamed from: x */
    public boolean mo23166x(int i, Object obj) {
        return false;
    }

    /* renamed from: x0 */
    public boolean mo23167x0() {
        String w2 = m7564w2();
        StringBuilder sb = new StringBuilder();
        sb.append("invoke lan device queryDeviceStatus, device id: ");
        sb.append(mo23185G());
        sb.append(" , cmd = ");
        sb.append(w2);
        Message message = new Message();
        message.what = 0;
        message.obj = w2;
        this.f4721U.mo23173b(message);
        return true;
    }

    /* renamed from: x1 */
    public boolean mo23168x1(C8327s sVar) {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("invoke lan device setScene, device id: ");
        sb.append(mo23185G());
        if (sVar.mo35455v()) {
            str = m7561t2(sVar);
        } else if (sVar.mo35458y()) {
            str = m7552k2(sVar);
        } else if (sVar.mo35419D()) {
            str = m7563v2(sVar);
        } else if (sVar.mo35417B()) {
            str = m7562u2(sVar);
        } else if (sVar.mo35456w()) {
            str = m7542a2(sVar);
        } else if (sVar.mo35421F()) {
            str = m7565x2(sVar.mo35439f());
        } else {
            if (sVar.mo35459z()) {
                if (sVar instanceof C8312e) {
                    str = m7556o2((C8312e) sVar);
                }
            } else if (sVar.mo35422G()) {
                str = m7566y2(sVar);
            }
            str = null;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("setScene params = ");
        sb2.append(str);
        if (str == null) {
            return false;
        }
        Message message = new Message();
        message.what = 0;
        message.obj = str;
        this.f4721U.mo23173b(message);
        return true;
    }

    /* renamed from: y0 */
    public void mo23169y0() {
    }

    /* renamed from: z */
    public String[] mo23170z() {
        return new String[0];
    }

    /* renamed from: z0 */
    public void mo23171z0(C12143c cVar) {
    }
}
