package com.yeelight.yeelib.p150c;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import androidx.core.view.ViewCompat;
import com.yeelight.yeelib.p150c.C6006h;
import com.yeelight.yeelib.p150c.p151i.C4200i;
import com.yeelight.yeelib.p150c.p151i.C6024e;
import com.yeelight.yeelib.p150c.p184n.C7562l;
import com.yeelight.yeelib.p152f.C4222h;
import com.yeelight.yeelib.p153g.C9834e;
import com.yeelight.yeelib.p153g.C9849r;
import com.yeelight.yeelib.p153g.C9856y;
import com.yeelight.yeelib.p185d.C7563a;
import com.yeelight.yeelib.p186e.C9768c;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* renamed from: com.yeelight.yeelib.c.d */
public class C4191d extends C4200i {
    /* access modifiers changed from: private */

    /* renamed from: A */
    public Socket f7213A;
    /* access modifiers changed from: private */

    /* renamed from: B */
    public BufferedOutputStream f7214B;
    /* access modifiers changed from: private */

    /* renamed from: G */
    public BufferedReader f7215G;
    /* access modifiers changed from: private */

    /* renamed from: H */
    public boolean f7216H = true;

    /* renamed from: I */
    private Thread f7217I;

    /* renamed from: J */
    private C6006h.C6016j f7218J;

    /* renamed from: K */
    private C6006h.C6014h f7219K;

    /* renamed from: L */
    private C4196e f7220L;
    /* access modifiers changed from: private */

    /* renamed from: x */
    public InetAddress f7221x;
    /* access modifiers changed from: private */

    /* renamed from: y */
    public int f7222y;

    /* renamed from: z */
    private int f7223z;

    /* renamed from: com.yeelight.yeelib.c.d$a */
    class C4192a implements Runnable {
        C4192a() {
        }

        public void run() {
            try {
                boolean unused = C4191d.this.f7216H = true;
                Socket unused2 = C4191d.this.f7213A = new Socket(C4191d.this.f7221x, C4191d.this.f7222y);
                C4191d.this.f7213A.setKeepAlive(true);
                BufferedOutputStream unused3 = C4191d.this.f7214B = new BufferedOutputStream(C4191d.this.f7213A.getOutputStream());
                BufferedReader unused4 = C4191d.this.f7215G = new BufferedReader(new InputStreamReader(C4191d.this.f7213A.getInputStream()));
                "init device Socket, device id : " + C4191d.this.mo23372G() + ", ip : " + C4191d.this.f7221x;
                C4222h.m11725k().mo23533d(C4191d.this);
                while (C4191d.this.f7216H) {
                    try {
                        String readLine = C4191d.this.f7215G.readLine();
                        "device socket, receive value = " + readLine;
                        if (readLine == null) {
                            boolean unused5 = C4191d.this.f7216H = false;
                            C4222h.m11725k().mo23540s(C4191d.this.mo23372G());
                        } else {
                            C4191d.this.m11380R1(readLine);
                        }
                    } catch (Exception e) {
                        "device socket, Exception = " + e.getMessage();
                        boolean unused6 = C4191d.this.f7216H = false;
                        C4222h.m11725k().mo23540s(C4191d.this.mo23372G());
                    }
                }
            } catch (Exception unused7) {
                boolean unused8 = C4191d.this.f7216H = false;
                C4222h.m11725k().mo23540s(C4191d.this.mo23372G());
            }
        }
    }

    /* renamed from: com.yeelight.yeelib.c.d$b */
    static /* synthetic */ class C4193b {

        /* renamed from: a */
        static final /* synthetic */ int[] f7225a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.yeelight.yeelib.c.d$d[] r0 = com.yeelight.yeelib.p150c.C4191d.C4195d.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f7225a = r0
                com.yeelight.yeelib.c.d$d r1 = com.yeelight.yeelib.p150c.C4191d.C4195d.MESSAGE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f7225a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.yeelight.yeelib.c.d$d r1 = com.yeelight.yeelib.p150c.C4191d.C4195d.EMPTY_MESSAGE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.p150c.C4191d.C4193b.<clinit>():void");
        }
    }

    /* renamed from: com.yeelight.yeelib.c.d$c */
    private class C4194c {

        /* renamed from: a */
        C4195d f7226a;

        /* renamed from: b */
        int f7227b;

        /* renamed from: c */
        Message f7228c;

        /* renamed from: d */
        boolean f7229d;

        /* renamed from: e */
        long f7230e;

        public C4194c(C4191d dVar, C4195d dVar2, int i, Message message, boolean z, long j) {
            this.f7226a = dVar2;
            this.f7227b = i;
            this.f7228c = message;
            this.f7229d = z;
            this.f7230e = j;
        }
    }

    /* renamed from: com.yeelight.yeelib.c.d$d */
    private enum C4195d {
        MESSAGE,
        EMPTY_MESSAGE
    }

    /* renamed from: com.yeelight.yeelib.c.d$e */
    class C4196e extends Thread {

        /* renamed from: a */
        public Handler f7234a;

        /* renamed from: b */
        private List<C4194c> f7235b = new ArrayList();

        /* renamed from: com.yeelight.yeelib.c.d$e$a */
        class C4197a extends Handler {
            C4197a() {
            }

            public void handleMessage(Message message) {
                if (message.what == 0) {
                    String str = C4191d.this.f7260v;
                    C4191d.this.m11379M2((String) message.obj);
                }
            }
        }

        C4196e() {
        }

        /* renamed from: b */
        public void mo23360b(Message message) {
            Handler handler = this.f7234a;
            if (handler == null) {
                this.f7235b.add(new C4194c(C4191d.this, C4195d.MESSAGE, 0, message, false, 0));
            } else {
                handler.sendMessage(message);
            }
        }

        public void run() {
            Looper.prepare();
            this.f7234a = new C4197a();
            Looper.loop();
            for (C4194c next : this.f7235b) {
                int i = C4193b.f7225a[next.f7226a.ordinal()];
                if (i != 1) {
                    if (i == 2) {
                        if (next.f7229d) {
                            this.f7234a.sendEmptyMessageDelayed(next.f7227b, next.f7230e);
                        } else {
                            this.f7234a.sendEmptyMessage(next.f7227b);
                        }
                    }
                } else if (next.f7229d) {
                    this.f7234a.sendMessageDelayed(next.f7228c, next.f7230e);
                } else {
                    this.f7234a.sendMessage(next.f7228c);
                }
            }
        }
    }

    public C4191d(InetAddress inetAddress, String str) {
        super(str, "yeelink.light.landevice", new C7562l((String) null));
        this.f7221x = inetAddress;
        this.f7222y = 55443;
    }

    /* renamed from: A2 */
    private String m11365A2(boolean z) {
        String str;
        String str2;
        if (z) {
            int i = this.f7223z + 1;
            this.f7223z = i;
            str = String.valueOf(i);
            str2 = "{\"id\":%id,\"method\":\"set_power\",\"params\":[\"on\",\"smooth\",500]}\r\n";
        } else {
            int i2 = this.f7223z + 1;
            this.f7223z = i2;
            str = String.valueOf(i2);
            str2 = "{\"id\":%id,\"method\":\"set_power\",\"params\":[\"off\",\"smooth\",500]}\r\n";
        }
        return str2.replace("%id", str);
    }

    /* renamed from: B2 */
    private String m11366B2(boolean z) {
        String str;
        String str2;
        if (z) {
            int i = this.f7223z + 1;
            this.f7223z = i;
            str = String.valueOf(i);
            str2 = "{\"id\":%id,\"method\":\"set_power\",\"params\":[\"on\"]}\r\n";
        } else {
            int i2 = this.f7223z + 1;
            this.f7223z = i2;
            str = String.valueOf(i2);
            str2 = "{\"id\":%id,\"method\":\"set_power\",\"params\":[\"off\"]}\r\n";
        }
        return str2.replace("%id", str);
    }

    /* renamed from: C2 */
    private String m11368C2() {
        int i = this.f7223z + 1;
        this.f7223z = i;
        return "{\"id\":%id,\"method\":\"toggle\",\"params\":[]}\r\n".replace("%id", String.valueOf(i));
    }

    /* access modifiers changed from: private */
    /* renamed from: M2 */
    public void m11379M2(String str) {
        if (this.f7214B != null && this.f7213A.isConnected()) {
            try {
                this.f7214B.write(str.getBytes());
                this.f7214B.flush();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0087 A[Catch:{ JSONException -> 0x0191 }] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00a7 A[Catch:{ JSONException -> 0x0191 }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00c7 A[Catch:{ JSONException -> 0x0191 }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00e7 A[Catch:{ JSONException -> 0x0191 }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0107 A[Catch:{ JSONException -> 0x0191 }] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0123 A[Catch:{ JSONException -> 0x0191 }] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0141 A[Catch:{ JSONException -> 0x0191 }] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x015e A[Catch:{ JSONException -> 0x0191 }] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x017a A[Catch:{ JSONException -> 0x0191 }] */
    /* JADX WARNING: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /* renamed from: R1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m11380R1(java.lang.String r17) {
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
            org.json.JSONObject r12 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0191 }
            r13 = r17
            r12.<init>(r13)     // Catch:{ JSONException -> 0x0191 }
            java.lang.String r13 = "params"
            org.json.JSONObject r12 = r12.getJSONObject(r13)     // Catch:{ JSONException -> 0x0191 }
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x0191 }
            r13.<init>()     // Catch:{ JSONException -> 0x0191 }
            java.lang.String r14 = "params = "
            r13.append(r14)     // Catch:{ JSONException -> 0x0191 }
            java.lang.String r14 = r12.toString()     // Catch:{ JSONException -> 0x0191 }
            r13.append(r14)     // Catch:{ JSONException -> 0x0191 }
            r13.toString()     // Catch:{ JSONException -> 0x0191 }
            boolean r13 = r12.has(r11)     // Catch:{ JSONException -> 0x0191 }
            java.lang.String r14 = "on"
            if (r13 == 0) goto L_0x005c
            java.lang.String r11 = r12.getString(r11)     // Catch:{ JSONException -> 0x0191 }
            com.yeelight.yeelib.c.h$j r13 = r1.f7218J     // Catch:{ JSONException -> 0x0191 }
            if (r13 == 0) goto L_0x005c
            boolean r11 = r11.equals(r14)     // Catch:{ JSONException -> 0x0191 }
            if (r11 == 0) goto L_0x0057
            com.yeelight.yeelib.c.h$j r11 = r1.f7218J     // Catch:{ JSONException -> 0x0191 }
            com.yeelight.yeelib.c.h$i r13 = com.yeelight.yeelib.p150c.C6006h.C6015i.on     // Catch:{ JSONException -> 0x0191 }
        L_0x0053:
            r11.mo27588m(r13)     // Catch:{ JSONException -> 0x0191 }
            goto L_0x005c
        L_0x0057:
            com.yeelight.yeelib.c.h$j r11 = r1.f7218J     // Catch:{ JSONException -> 0x0191 }
            com.yeelight.yeelib.c.h$i r13 = com.yeelight.yeelib.p150c.C6006h.C6015i.off     // Catch:{ JSONException -> 0x0191 }
            goto L_0x0053
        L_0x005c:
            boolean r11 = r12.has(r10)     // Catch:{ JSONException -> 0x0191 }
            if (r11 == 0) goto L_0x007f
            java.lang.String r10 = r12.getString(r10)     // Catch:{ JSONException -> 0x0191 }
            com.yeelight.yeelib.c.h$j r11 = r1.f7218J     // Catch:{ JSONException -> 0x0191 }
            if (r11 == 0) goto L_0x007f
            com.yeelight.yeelib.c.h$j r11 = r1.f7218J     // Catch:{ JSONException -> 0x0191 }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ JSONException -> 0x0191 }
            int r10 = r10.intValue()     // Catch:{ JSONException -> 0x0191 }
            r13 = r2
            r15 = r3
            long r2 = (long) r10     // Catch:{ JSONException -> 0x0191 }
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch:{ JSONException -> 0x0191 }
            r11.mo27583a(r2)     // Catch:{ JSONException -> 0x0191 }
            goto L_0x0081
        L_0x007f:
            r13 = r2
            r15 = r3
        L_0x0081:
            boolean r2 = r12.has(r9)     // Catch:{ JSONException -> 0x0191 }
            if (r2 == 0) goto L_0x00a1
            java.lang.String r2 = r12.getString(r9)     // Catch:{ JSONException -> 0x0191 }
            com.yeelight.yeelib.c.h$j r3 = r1.f7218J     // Catch:{ JSONException -> 0x0191 }
            if (r3 == 0) goto L_0x00a1
            com.yeelight.yeelib.c.h$j r3 = r1.f7218J     // Catch:{ JSONException -> 0x0191 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ JSONException -> 0x0191 }
            int r2 = r2.intValue()     // Catch:{ JSONException -> 0x0191 }
            long r9 = (long) r2     // Catch:{ JSONException -> 0x0191 }
            java.lang.Long r2 = java.lang.Long.valueOf(r9)     // Catch:{ JSONException -> 0x0191 }
            r3.mo27587l(r2)     // Catch:{ JSONException -> 0x0191 }
        L_0x00a1:
            boolean r2 = r12.has(r8)     // Catch:{ JSONException -> 0x0191 }
            if (r2 == 0) goto L_0x00c1
            java.lang.String r2 = r12.getString(r8)     // Catch:{ JSONException -> 0x0191 }
            com.yeelight.yeelib.c.h$j r3 = r1.f7218J     // Catch:{ JSONException -> 0x0191 }
            if (r3 == 0) goto L_0x00c1
            com.yeelight.yeelib.c.h$j r3 = r1.f7218J     // Catch:{ JSONException -> 0x0191 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ JSONException -> 0x0191 }
            int r2 = r2.intValue()     // Catch:{ JSONException -> 0x0191 }
            long r8 = (long) r2     // Catch:{ JSONException -> 0x0191 }
            java.lang.Long r2 = java.lang.Long.valueOf(r8)     // Catch:{ JSONException -> 0x0191 }
            r3.mo27584h(r2)     // Catch:{ JSONException -> 0x0191 }
        L_0x00c1:
            boolean r2 = r12.has(r7)     // Catch:{ JSONException -> 0x0191 }
            if (r2 == 0) goto L_0x00e1
            java.lang.String r2 = r12.getString(r7)     // Catch:{ JSONException -> 0x0191 }
            com.yeelight.yeelib.c.h$j r3 = r1.f7218J     // Catch:{ JSONException -> 0x0191 }
            if (r3 == 0) goto L_0x00e1
            com.yeelight.yeelib.c.h$j r3 = r1.f7218J     // Catch:{ JSONException -> 0x0191 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ JSONException -> 0x0191 }
            int r2 = r2.intValue()     // Catch:{ JSONException -> 0x0191 }
            long r7 = (long) r2     // Catch:{ JSONException -> 0x0191 }
            java.lang.Long r2 = java.lang.Long.valueOf(r7)     // Catch:{ JSONException -> 0x0191 }
            r3.mo27585j(r2)     // Catch:{ JSONException -> 0x0191 }
        L_0x00e1:
            boolean r2 = r12.has(r6)     // Catch:{ JSONException -> 0x0191 }
            if (r2 == 0) goto L_0x0101
            java.lang.String r2 = r12.getString(r6)     // Catch:{ JSONException -> 0x0191 }
            com.yeelight.yeelib.c.h$j r3 = r1.f7218J     // Catch:{ JSONException -> 0x0191 }
            if (r3 == 0) goto L_0x0101
            com.yeelight.yeelib.c.h$j r3 = r1.f7218J     // Catch:{ JSONException -> 0x0191 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ JSONException -> 0x0191 }
            int r2 = r2.intValue()     // Catch:{ JSONException -> 0x0191 }
            long r6 = (long) r2     // Catch:{ JSONException -> 0x0191 }
            java.lang.Long r2 = java.lang.Long.valueOf(r6)     // Catch:{ JSONException -> 0x0191 }
            r3.mo27586k(r2)     // Catch:{ JSONException -> 0x0191 }
        L_0x0101:
            boolean r2 = r12.has(r5)     // Catch:{ JSONException -> 0x0191 }
            if (r2 == 0) goto L_0x011d
            java.lang.String r2 = r12.getString(r5)     // Catch:{ JSONException -> 0x0191 }
            com.yeelight.yeelib.c.h$h r3 = r1.f7219K     // Catch:{ JSONException -> 0x0191 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ JSONException -> 0x0191 }
            int r2 = r2.intValue()     // Catch:{ JSONException -> 0x0191 }
            long r5 = (long) r2     // Catch:{ JSONException -> 0x0191 }
            java.lang.Long r2 = java.lang.Long.valueOf(r5)     // Catch:{ JSONException -> 0x0191 }
            r3.mo27579l(r2)     // Catch:{ JSONException -> 0x0191 }
        L_0x011d:
            boolean r2 = r12.has(r4)     // Catch:{ JSONException -> 0x0191 }
            if (r2 == 0) goto L_0x013a
            java.lang.String r2 = r12.getString(r4)     // Catch:{ JSONException -> 0x0191 }
            boolean r2 = r2.equals(r14)     // Catch:{ JSONException -> 0x0191 }
            if (r2 == 0) goto L_0x0135
            com.yeelight.yeelib.c.h$h r2 = r1.f7219K     // Catch:{ JSONException -> 0x0191 }
            com.yeelight.yeelib.c.h$i r3 = com.yeelight.yeelib.p150c.C6006h.C6015i.on     // Catch:{ JSONException -> 0x0191 }
        L_0x0131:
            r2.mo27582p(r3)     // Catch:{ JSONException -> 0x0191 }
            goto L_0x013a
        L_0x0135:
            com.yeelight.yeelib.c.h$h r2 = r1.f7219K     // Catch:{ JSONException -> 0x0191 }
            com.yeelight.yeelib.c.h$i r3 = com.yeelight.yeelib.p150c.C6006h.C6015i.off     // Catch:{ JSONException -> 0x0191 }
            goto L_0x0131
        L_0x013a:
            r2 = r15
            boolean r3 = r12.has(r2)     // Catch:{ JSONException -> 0x0191 }
            if (r3 == 0) goto L_0x0158
            java.lang.String r2 = r12.getString(r2)     // Catch:{ JSONException -> 0x0191 }
            boolean r2 = r2.equals(r14)     // Catch:{ JSONException -> 0x0191 }
            if (r2 == 0) goto L_0x0153
            com.yeelight.yeelib.c.h$h r2 = r1.f7219K     // Catch:{ JSONException -> 0x0191 }
            com.yeelight.yeelib.c.h$i r3 = com.yeelight.yeelib.p150c.C6006h.C6015i.on     // Catch:{ JSONException -> 0x0191 }
        L_0x014f:
            r2.mo27581o(r3)     // Catch:{ JSONException -> 0x0191 }
            goto L_0x0158
        L_0x0153:
            com.yeelight.yeelib.c.h$h r2 = r1.f7219K     // Catch:{ JSONException -> 0x0191 }
            com.yeelight.yeelib.c.h$i r3 = com.yeelight.yeelib.p150c.C6006h.C6015i.off     // Catch:{ JSONException -> 0x0191 }
            goto L_0x014f
        L_0x0158:
            boolean r2 = r12.has(r13)     // Catch:{ JSONException -> 0x0191 }
            if (r2 == 0) goto L_0x0174
            java.lang.String r2 = r12.getString(r13)     // Catch:{ JSONException -> 0x0191 }
            com.yeelight.yeelib.c.h$h r3 = r1.f7219K     // Catch:{ JSONException -> 0x0191 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ JSONException -> 0x0191 }
            int r2 = r2.intValue()     // Catch:{ JSONException -> 0x0191 }
            long r4 = (long) r2     // Catch:{ JSONException -> 0x0191 }
            java.lang.Long r2 = java.lang.Long.valueOf(r4)     // Catch:{ JSONException -> 0x0191 }
            r3.mo27578j(r2)     // Catch:{ JSONException -> 0x0191 }
        L_0x0174:
            boolean r2 = r12.has(r0)     // Catch:{ JSONException -> 0x0191 }
            if (r2 == 0) goto L_0x01a6
            java.lang.String r0 = r12.getString(r0)     // Catch:{ JSONException -> 0x0191 }
            com.yeelight.yeelib.c.h$h r2 = r1.f7219K     // Catch:{ JSONException -> 0x0191 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ JSONException -> 0x0191 }
            int r0 = r0.intValue()     // Catch:{ JSONException -> 0x0191 }
            long r3 = (long) r0     // Catch:{ JSONException -> 0x0191 }
            java.lang.Long r0 = java.lang.Long.valueOf(r3)     // Catch:{ JSONException -> 0x0191 }
            r2.mo27580n(r0)     // Catch:{ JSONException -> 0x0191 }
            goto L_0x01a6
        L_0x0191:
            r0 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "handleCallback error_msg  = "
            r2.append(r3)
            java.lang.String r0 = r0.getMessage()
            r2.append(r0)
            r2.toString()
        L_0x01a6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.p150c.C4191d.m11380R1(java.lang.String):void");
    }

    /* renamed from: T1 */
    private void m11381T1() {
        Thread thread = new Thread(new C4192a());
        this.f7217I = thread;
        thread.start();
    }

    /* renamed from: a2 */
    private String m11382a2(C9856y yVar) {
        Locale locale = Locale.US;
        int i = this.f7223z + 1;
        this.f7223z = i;
        return String.format(locale, "{\"id\":%id,\"method\":\"set_scene\",\"params\":[\"cf\",%s,%s,\"%s\"]}\r\n".replace("%id", String.valueOf(i)), new Object[]{Integer.valueOf(yVar.mo31879k()), Integer.valueOf(yVar.mo31880l()), yVar.mo31882n()});
    }

    /* renamed from: b2 */
    private String m11383b2(C9856y yVar) {
        Locale locale = Locale.US;
        int i = this.f7223z + 1;
        this.f7223z = i;
        return String.format(locale, "{\"id\":%id,\"method\":\"set_scene_bundle\",\"params\":[\"\\\"keep\\\"\",\"\\\"bright\\\",%s,%s\"]}\r\n".replace("%id", String.valueOf(i)), new Object[]{Integer.valueOf(yVar.mo31874f()), 500});
    }

    /* renamed from: c2 */
    private String m11384c2(C9856y yVar) {
        Locale locale = Locale.US;
        int i = this.f7223z + 1;
        this.f7223z = i;
        return String.format(locale, "{\"id\":%id,\"method\":\"set_scene_bundle\",\"params\":[\"\\\"keep\\\"\",\"\\\"bright\\\",%s\"]}\r\n".replace("%id", String.valueOf(i)), new Object[]{Integer.valueOf(yVar.mo31874f())});
    }

    /* renamed from: d2 */
    private String m11385d2(C9856y yVar) {
        Locale locale = Locale.US;
        int i = this.f7223z + 1;
        this.f7223z = i;
        return String.format(locale, "{\"id\":%id,\"method\":\"set_scene_bundle\",\"params\":[\"\\\"keep\\\"\",\"\\\"cf\\\",%s,%s,\"%s\"\"]}\r\n".replace("%id", String.valueOf(i)), new Object[]{Integer.valueOf(yVar.mo31871c().mo31724i()), Integer.valueOf(yVar.mo31871c().mo31721f().ordinal()), yVar.mo31871c().mo31722g()});
    }

    /* renamed from: e2 */
    private String m11386e2(C9856y yVar) {
        Locale locale = Locale.US;
        int i = this.f7223z + 1;
        this.f7223z = i;
        return String.format(locale, "{\"id\":%id,\"method\":\"set_scene_bundle\",\"params\":[\"\\\"keep\\\"\",\"\\\"color\\\",%s,%s\"]}\r\n".replace("%id", String.valueOf(i)), new Object[]{Integer.valueOf(yVar.mo31875g() & ViewCompat.MEASURED_SIZE_MASK), Integer.valueOf(yVar.mo31874f())});
    }

    /* renamed from: f2 */
    private String m11387f2(C9856y yVar) {
        Locale locale = Locale.US;
        int i = this.f7223z + 1;
        this.f7223z = i;
        return String.format(locale, "{\"id\":%id,\"method\":\"set_scene_bundle\",\"params\":[\"\\\"keep\\\"\",\"\\\"ct\\\",%s,%s\"]}\r\n".replace("%id", String.valueOf(i)), new Object[]{Integer.valueOf(yVar.mo31876h()), Integer.valueOf(yVar.mo31874f())});
    }

    /* renamed from: g2 */
    private String m11388g2(int i) {
        int i2 = this.f7223z + 1;
        this.f7223z = i2;
        return "{\"id\":%id,\"method\":\"bg_set_power\",\"params\":[\"on\",\"smooth\",500,%value]}\r\n".replace("%id", String.valueOf(i2)).replace("%value", String.valueOf(i));
    }

    /* renamed from: h2 */
    private String m11389h2(long j, int i) {
        int i2 = this.f7223z + 1;
        this.f7223z = i2;
        return "{\"id\":%id,\"method\":\"bg_set_power\",\"params\":[\"on\",\"smooth\",%duration,%value]}\r\n".replace("%id", String.valueOf(i2)).replace("%duration", String.valueOf(j)).replace("%value", String.valueOf(i));
    }

    /* renamed from: i2 */
    private String m11390i2(boolean z) {
        String str;
        String str2;
        if (z) {
            int i = this.f7223z + 1;
            this.f7223z = i;
            str = String.valueOf(i);
            str2 = "{\"id\":%id,\"method\":\"bg_set_power\",\"params\":[\"on\",\"smooth\",500]}\r\n";
        } else {
            int i2 = this.f7223z + 1;
            this.f7223z = i2;
            str = String.valueOf(i2);
            str2 = "{\"id\":%id,\"method\":\"bg_set_power\",\"params\":[\"off\",\"smooth\",500]}\r\n";
        }
        return str2.replace("%id", str);
    }

    /* renamed from: j2 */
    private String m11391j2(boolean z) {
        String str;
        String str2;
        if (z) {
            int i = this.f7223z + 1;
            this.f7223z = i;
            str = String.valueOf(i);
            str2 = "{\"id\":%id,\"method\":\"bg_set_power\",\"params\":[\"on\"]}\r\n";
        } else {
            int i2 = this.f7223z + 1;
            this.f7223z = i2;
            str = String.valueOf(i2);
            str2 = "{\"id\":%id,\"method\":\"bg_set_power\",\"params\":[\"off\"]}\r\n";
        }
        return str2.replace("%id", str);
    }

    /* renamed from: k2 */
    private String m11392k2(C9856y yVar) {
        Locale locale = Locale.US;
        int i = this.f7223z + 1;
        this.f7223z = i;
        return String.format(locale, "{\"id\":%id,\"method\":\"set_scene\",\"params\":[\"bright\",%s,%s]}\r\n".replace("%id", String.valueOf(i)), new Object[]{Integer.valueOf(yVar.mo31874f()), 500});
    }

    /* renamed from: l2 */
    private String m11393l2(C9856y yVar) {
        Locale locale = Locale.US;
        int i = this.f7223z + 1;
        this.f7223z = i;
        return String.format(locale, "{\"id\":%id,\"method\":\"set_scene\",\"params\":[\"bright\",%s]}\r\n".replace("%id", String.valueOf(i)), new Object[]{Integer.valueOf(yVar.mo31874f())});
    }

    /* renamed from: m2 */
    private String m11394m2(int i) {
        int i2 = this.f7223z + 1;
        this.f7223z = i2;
        return "{\"id\":%id,\"method\":\"set_bright\",\"params\":[%value, \"smooth\", 200]}\r\n".replace("%id", String.valueOf(i2)).replace("%value", String.valueOf(i));
    }

    /* renamed from: n2 */
    private String m11395n2(int i) {
        int i2 = this.f7223z + 1;
        this.f7223z = i2;
        return "{\"id\":%id,\"method\":\"set_bright\",\"params\":[%value]}\r\n".replace("%id", String.valueOf(i2)).replace("%value", String.valueOf(i));
    }

    /* renamed from: o2 */
    private String m11396o2(C9834e eVar) {
        List<C9849r> a0 = eVar.mo31758a0();
        if (a0 == null || a0.size() < 2) {
            return null;
        }
        Locale locale = Locale.US;
        int i = this.f7223z + 1;
        this.f7223z = i;
        return String.format(locale, "{\"id\":%id,\"method\":\"set_scene_bundle\",\"params\":[\"%s\",\"%s\"]}\r\n".replace("%id", String.valueOf(i)), new Object[]{a0.get(0).mo31742Y().replace("\"", "\\\""), a0.get(1).mo31742Y().replace("\"", "\\\"")});
    }

    /* renamed from: p2 */
    private String m11397p2(int i) {
        int i2 = this.f7223z + 1;
        this.f7223z = i2;
        return "{\"id\":%id,\"method\":\"set_ct_abx\",\"params\":[%value, \"smooth\", 500]}\r\n".replace("%id", String.valueOf(i2)).replace("%value", String.valueOf(i));
    }

    /* renamed from: q2 */
    private String m11398q2(int i) {
        int i2 = this.f7223z + 1;
        this.f7223z = i2;
        return "{\"id\":%id,\"method\":\"set_ct_abx\",\"params\":[%value]}\r\n".replace("%id", String.valueOf(i2)).replace("%value", String.valueOf(i));
    }

    /* renamed from: r2 */
    private String m11399r2(int i) {
        int i2 = this.f7223z + 1;
        this.f7223z = i2;
        return "{\"id\":%id,\"method\":\"set_rgb\",\"params\":[%value,\"smooth\", 500]}\r\n".replace("%id", String.valueOf(i2)).replace("%value", String.valueOf(i));
    }

    /* renamed from: s2 */
    private String m11400s2(int i) {
        int i2 = this.f7223z + 1;
        this.f7223z = i2;
        return "{\"id\":%id,\"method\":\"set_rgb\",\"params\":[%value]}\r\n".replace("%id", String.valueOf(i2)).replace("%value", String.valueOf(i));
    }

    /* renamed from: t2 */
    private String m11401t2(C9856y yVar) {
        Locale locale = Locale.US;
        int i = this.f7223z + 1;
        this.f7223z = i;
        return String.format(locale, "{\"id\":%id,\"method\":\"set_scene\",\"params\":[\"cf\",%s,%s,\"%s\"]}\r\n".replace("%id", String.valueOf(i)), new Object[]{Integer.valueOf(yVar.mo31871c().mo31724i()), Integer.valueOf(yVar.mo31871c().mo31721f().ordinal()), yVar.mo31871c().mo31722g()});
    }

    /* renamed from: u2 */
    private String m11402u2(C9856y yVar) {
        Locale locale = Locale.US;
        int i = this.f7223z + 1;
        this.f7223z = i;
        return String.format(locale, "{\"id\":%id,\"method\":\"set_scene\",\"params\":[\"color\",%s,%s]}\r\n".replace("%id", String.valueOf(i)), new Object[]{Integer.valueOf(yVar.mo31875g() & ViewCompat.MEASURED_SIZE_MASK), Integer.valueOf(yVar.mo31874f())});
    }

    /* renamed from: v2 */
    private String m11403v2(C9856y yVar) {
        Locale locale = Locale.US;
        int i = this.f7223z + 1;
        this.f7223z = i;
        return String.format(locale, "{\"id\":%id,\"method\":\"set_scene\",\"params\":[\"ct\",%s,%s]}\r\n".replace("%id", String.valueOf(i)), new Object[]{Integer.valueOf(yVar.mo31876h()), Integer.valueOf(yVar.mo31874f())});
    }

    /* renamed from: w2 */
    private String m11404w2() {
        int i = this.f7223z + 1;
        this.f7223z = i;
        return "{\"id\":%id,\"method\":\"get_prop\",\"params\":[]}\r\n".replace("%id", String.valueOf(i));
    }

    /* renamed from: x2 */
    private String m11405x2(int i) {
        int i2 = this.f7223z + 1;
        this.f7223z = i2;
        return "{\"id\":%id,\"method\":\"set_scene\",\"params\":[\"nightlight\",%value]}\r\n".replace("%id", String.valueOf(i2)).replace("%value", String.valueOf(i));
    }

    /* renamed from: y2 */
    private String m11406y2(int i) {
        int i2 = this.f7223z + 1;
        this.f7223z = i2;
        return "{\"id\":%id,\"method\":\"set_power\",\"params\":[\"on\",\"smooth\",500,%value]}\r\n".replace("%id", String.valueOf(i2)).replace("%value", String.valueOf(i));
    }

    /* renamed from: z2 */
    private String m11407z2(long j, int i) {
        int i2 = this.f7223z + 1;
        this.f7223z = i2;
        return "{\"id\":%id,\"method\":\"set_power\",\"params\":[\"on\",\"smooth\",%duration,%value]}\r\n".replace("%id", String.valueOf(i2)).replace("%duration", String.valueOf(j)).replace("%value", String.valueOf(i));
    }

    /* renamed from: A */
    public int mo23299A() {
        return 11;
    }

    /* renamed from: A1 */
    public boolean mo23300A1() {
        String C2 = m11368C2();
        "invoke lan device toogle, device id: " + mo23372G() + " , cmd = " + C2;
        Message message = new Message();
        message.what = 0;
        message.obj = C2;
        this.f7220L.mo23360b(message);
        return true;
    }

    /* renamed from: D2 */
    public void mo23301D2(C6006h.C6014h hVar) {
        this.f7219K = hVar;
    }

    /* renamed from: E2 */
    public void mo23302E2(C6006h.C6016j jVar) {
        this.f7218J = jVar;
    }

    /* renamed from: F */
    public int mo23303F() {
        return 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x006b A[RETURN] */
    /* renamed from: F2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo23304F2(com.yeelight.yeelib.p153g.C9856y r3) {
        /*
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "invoke lan device setBgBundleScene, device id: "
            r0.append(r1)
            java.lang.String r1 = r2.mo23372G()
            r0.append(r1)
            r0.toString()
            boolean r0 = r3.mo31890v()
            if (r0 == 0) goto L_0x001f
        L_0x001a:
            java.lang.String r3 = r2.m11385d2(r3)
            goto L_0x0048
        L_0x001f:
            boolean r0 = r3.mo31893y()
            if (r0 == 0) goto L_0x002a
            java.lang.String r3 = r2.m11383b2(r3)
            goto L_0x0048
        L_0x002a:
            boolean r0 = r3.mo31855D()
            if (r0 == 0) goto L_0x0035
            java.lang.String r3 = r2.m11387f2(r3)
            goto L_0x0048
        L_0x0035:
            boolean r0 = r3.mo31853B()
            if (r0 == 0) goto L_0x0040
            java.lang.String r3 = r2.m11386e2(r3)
            goto L_0x0048
        L_0x0040:
            boolean r0 = r3.mo31891w()
            if (r0 == 0) goto L_0x0047
            goto L_0x001a
        L_0x0047:
            r3 = 0
        L_0x0048:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "setBgBundleScene params = "
            r0.append(r1)
            r0.append(r3)
            r0.toString()
            r0 = 0
            if (r3 == 0) goto L_0x006b
            android.os.Message r1 = new android.os.Message
            r1.<init>()
            r1.what = r0
            r1.obj = r3
            com.yeelight.yeelib.c.d$e r3 = r2.f7220L
            r3.mo23360b(r1)
            r3 = 1
            return r3
        L_0x006b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.p150c.C4191d.mo23304F2(com.yeelight.yeelib.g.y):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x006b A[RETURN] */
    /* renamed from: G2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo23305G2(com.yeelight.yeelib.p153g.C9856y r3) {
        /*
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "invoke lan device setBgBundleScene, device id: "
            r0.append(r1)
            java.lang.String r1 = r2.mo23372G()
            r0.append(r1)
            r0.toString()
            boolean r0 = r3.mo31890v()
            if (r0 == 0) goto L_0x001f
        L_0x001a:
            java.lang.String r3 = r2.m11385d2(r3)
            goto L_0x0048
        L_0x001f:
            boolean r0 = r3.mo31893y()
            if (r0 == 0) goto L_0x002a
            java.lang.String r3 = r2.m11384c2(r3)
            goto L_0x0048
        L_0x002a:
            boolean r0 = r3.mo31855D()
            if (r0 == 0) goto L_0x0035
            java.lang.String r3 = r2.m11387f2(r3)
            goto L_0x0048
        L_0x0035:
            boolean r0 = r3.mo31853B()
            if (r0 == 0) goto L_0x0040
            java.lang.String r3 = r2.m11386e2(r3)
            goto L_0x0048
        L_0x0040:
            boolean r0 = r3.mo31891w()
            if (r0 == 0) goto L_0x0047
            goto L_0x001a
        L_0x0047:
            r3 = 0
        L_0x0048:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "setBgBundleScene params = "
            r0.append(r1)
            r0.append(r3)
            r0.toString()
            r0 = 0
            if (r3 == 0) goto L_0x006b
            android.os.Message r1 = new android.os.Message
            r1.<init>()
            r1.what = r0
            r1.obj = r3
            com.yeelight.yeelib.c.d$e r3 = r2.f7220L
            r3.mo23360b(r1)
            r3 = 1
            return r3
        L_0x006b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.p150c.C4191d.mo23305G2(com.yeelight.yeelib.g.y):boolean");
    }

    /* renamed from: H */
    public int mo23306H() {
        return 0;
    }

    /* renamed from: H2 */
    public boolean mo23307H2(long j) {
        String n2 = m11395n2((int) j);
        "invoke lan device setBright, device id: " + mo23372G() + " , cmd = " + n2;
        Message message = new Message();
        message.what = 0;
        message.obj = n2;
        this.f7220L.mo23360b(message);
        return true;
    }

    /* renamed from: I2 */
    public boolean mo23308I2(int i) {
        String s2 = m11400s2(i);
        "invoke lan device setColor, device id: " + mo23372G() + " , cmd = " + s2;
        Message message = new Message();
        message.what = 0;
        message.obj = s2;
        this.f7220L.mo23360b(message);
        return true;
    }

    /* renamed from: J2 */
    public boolean mo23309J2(int i) {
        String q2 = m11398q2(i);
        "invoke lan device setCt, device id: " + mo23372G() + " , cmd = " + q2;
        Message message = new Message();
        message.what = 0;
        message.obj = q2;
        this.f7220L.mo23360b(message);
        return true;
    }

    /* renamed from: K2 */
    public boolean mo23310K2(C9856y yVar) {
        "invoke lan device setScene, device id: " + mo23372G();
        String t2 = yVar.mo31890v() ? m11401t2(yVar) : yVar.mo31893y() ? m11393l2(yVar) : yVar.mo31855D() ? m11403v2(yVar) : yVar.mo31853B() ? m11402u2(yVar) : yVar.mo31891w() ? m11382a2(yVar) : yVar.mo31857F() ? m11405x2(yVar.mo31874f()) : (!yVar.mo31894z() || !(yVar instanceof C9834e)) ? null : m11396o2((C9834e) yVar);
        "setScene params = " + t2;
        if (t2 == null) {
            return false;
        }
        Message message = new Message();
        message.what = 0;
        message.obj = t2;
        this.f7220L.mo23360b(message);
        return true;
    }

    /* renamed from: L2 */
    public void mo23311L2() {
        this.f7218J = null;
        this.f7219K = null;
    }

    /* renamed from: N1 */
    public boolean mo23312N1() {
        String i2 = m11390i2(false);
        "invoke lan device close, device id: " + mo23372G() + " , cmd = " + i2;
        Message message = new Message();
        message.what = 0;
        message.obj = i2;
        this.f7220L.mo23360b(message);
        return true;
    }

    /* renamed from: O1 */
    public boolean mo23313O1() {
        String B2 = m11366B2(false);
        "invoke lan device close, device id: " + mo23372G() + " , cmd = " + B2;
        Message message = new Message();
        message.what = 0;
        message.obj = B2;
        this.f7220L.mo23360b(message);
        return true;
    }

    /* renamed from: P1 */
    public boolean mo23314P1(String str, int i) {
        return false;
    }

    /* renamed from: Q1 */
    public Socket mo23315Q1() {
        return this.f7213A;
    }

    /* renamed from: S1 */
    public void mo23316S1() {
        "initSocket device Id = " + mo23372G();
        m11381T1();
        C4196e eVar = new C4196e();
        this.f7220L = eVar;
        eVar.start();
    }

    /* renamed from: U0 */
    public boolean mo23317U0() {
        return false;
    }

    /* renamed from: U1 */
    public boolean mo23318U1() {
        String i2 = m11390i2(true);
        "invoke lan device open, device id: " + mo23372G() + " , cmd = " + i2;
        Message message = new Message();
        message.what = 0;
        message.obj = i2;
        this.f7220L.mo23360b(message);
        return true;
    }

    /* renamed from: V0 */
    public void mo23319V0(C9768c cVar) {
    }

    /* renamed from: V1 */
    public boolean mo23320V1() {
        String j2 = m11391j2(true);
        "invoke lan device open, device id: " + mo23372G() + " , cmd = " + j2;
        Message message = new Message();
        message.what = 0;
        message.obj = j2;
        this.f7220L.mo23360b(message);
        return true;
    }

    /* renamed from: W1 */
    public boolean mo23321W1(int i) {
        String g2 = m11388g2(i);
        "invoke lan device open, device id: " + mo23372G() + " , cmd = " + g2;
        Message message = new Message();
        message.what = 0;
        message.obj = g2;
        this.f7220L.mo23360b(message);
        return true;
    }

    /* renamed from: X1 */
    public boolean mo23322X1(long j, int i) {
        String h2 = m11389h2(j, i);
        "invoke lan device open, device id: " + mo23372G() + " , cmd = " + h2;
        Message message = new Message();
        message.what = 0;
        message.obj = h2;
        this.f7220L.mo23360b(message);
        return true;
    }

    /* renamed from: Y0 */
    public boolean mo23323Y0() {
        return false;
    }

    /* renamed from: Y1 */
    public boolean mo23324Y1() {
        String B2 = m11366B2(true);
        "invoke lan device open, device id: " + mo23372G() + " , cmd = " + B2;
        Message message = new Message();
        message.what = 0;
        message.obj = B2;
        this.f7220L.mo23360b(message);
        return true;
    }

    /* renamed from: Z1 */
    public boolean mo23325Z1(long j, int i) {
        String z2 = m11407z2(j, i);
        "invoke lan device open, device id: " + mo23372G() + " , cmd = " + z2;
        Message message = new Message();
        message.what = 0;
        message.obj = z2;
        this.f7220L.mo23360b(message);
        return true;
    }

    /* renamed from: b1 */
    public boolean mo23326b1() {
        String A2 = m11365A2(false);
        "invoke lan device close, device id: " + mo23372G() + " , cmd = " + A2;
        Message message = new Message();
        message.what = 0;
        message.obj = A2;
        this.f7220L.mo23360b(message);
        return true;
    }

    /* renamed from: c1 */
    public boolean mo23327c1() {
        return false;
    }

    /* renamed from: f1 */
    public boolean mo23328f1(boolean z) {
        return false;
    }

    /* renamed from: g0 */
    public int mo23329g0() {
        return 0;
    }

    /* renamed from: i1 */
    public String mo23330i1() {
        return this.f7238a;
    }

    /* renamed from: k0 */
    public boolean mo23331k0() {
        return false;
    }

    /* renamed from: k1 */
    public boolean mo23332k1() {
        return false;
    }

    /* renamed from: l0 */
    public boolean mo23333l0() {
        return false;
    }

    /* renamed from: l1 */
    public boolean mo23334l1() {
        String A2 = m11365A2(true);
        "invoke lan device open, device id: " + mo23372G() + " , cmd = " + A2;
        Message message = new Message();
        message.what = 0;
        message.obj = A2;
        this.f7220L.mo23360b(message);
        return true;
    }

    /* renamed from: m0 */
    public boolean mo23335m0() {
        return false;
    }

    /* renamed from: m1 */
    public boolean mo23336m1(int i) {
        String y2 = m11406y2(i);
        "invoke lan device open, device id: " + mo23372G() + " , cmd = " + y2;
        Message message = new Message();
        message.what = 0;
        message.obj = y2;
        this.f7220L.mo23360b(message);
        return true;
    }

    /* renamed from: n */
    public void mo23337n() {
    }

    /* renamed from: o1 */
    public boolean mo23338o1(C6024e.C6028d dVar) {
        return false;
    }

    /* renamed from: p0 */
    public boolean mo23339p0() {
        return false;
    }

    /* renamed from: p1 */
    public boolean mo23340p1(long j) {
        String m2 = m11394m2((int) j);
        "invoke lan device setBright, device id: " + mo23372G() + " , cmd = " + m2;
        Message message = new Message();
        message.what = 0;
        message.obj = m2;
        this.f7220L.mo23360b(message);
        return true;
    }

    /* renamed from: q1 */
    public boolean mo23341q1(int i) {
        String r2 = m11399r2(i);
        "invoke lan device setColor, device id: " + mo23372G() + " , cmd = " + r2;
        Message message = new Message();
        message.what = 0;
        message.obj = r2;
        this.f7220L.mo23360b(message);
        return true;
    }

    /* renamed from: r */
    public void mo23342r() {
        try {
            this.f7216H = false;
            if (this.f7214B != null) {
                this.f7214B.close();
            }
            if (this.f7215G != null) {
                this.f7215G.close();
            }
            if (this.f7213A != null) {
                this.f7213A.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: r1 */
    public boolean mo23343r1(int i, int[] iArr, int i2) {
        return false;
    }

    /* renamed from: s */
    public boolean mo23344s(C7563a aVar) {
        return false;
    }

    /* renamed from: s1 */
    public boolean mo23345s1(int i) {
        String p2 = m11397p2(i);
        "invoke lan device setCt, device id: " + mo23372G() + " , cmd = " + p2;
        Message message = new Message();
        message.what = 0;
        message.obj = p2;
        this.f7220L.mo23360b(message);
        return true;
    }

    /* renamed from: t1 */
    public boolean mo23346t1() {
        return false;
    }

    /* renamed from: u0 */
    public void mo23347u0(View view) {
    }

    /* renamed from: u1 */
    public boolean mo23348u1(int i) {
        return false;
    }

    /* renamed from: v0 */
    public void mo23349v0() {
        super.mo23349v0();
    }

    /* renamed from: v1 */
    public boolean mo23350v1(boolean z) {
        return false;
    }

    /* renamed from: w0 */
    public boolean mo23351w0(String str) {
        return false;
    }

    /* renamed from: w1 */
    public boolean mo23352w1(C6024e.C6028d dVar) {
        return false;
    }

    /* renamed from: x */
    public boolean mo23353x(int i, Object obj) {
        return false;
    }

    /* renamed from: x0 */
    public boolean mo23354x0() {
        String w2 = m11404w2();
        "invoke lan device queryDeviceStatus, device id: " + mo23372G() + " , cmd = " + w2;
        Message message = new Message();
        message.what = 0;
        message.obj = w2;
        this.f7220L.mo23360b(message);
        return true;
    }

    /* renamed from: x1 */
    public boolean mo23355x1(C9856y yVar) {
        "invoke lan device setScene, device id: " + mo23372G();
        String t2 = yVar.mo31890v() ? m11401t2(yVar) : yVar.mo31893y() ? m11392k2(yVar) : yVar.mo31855D() ? m11403v2(yVar) : yVar.mo31853B() ? m11402u2(yVar) : yVar.mo31891w() ? m11382a2(yVar) : yVar.mo31857F() ? m11405x2(yVar.mo31874f()) : (!yVar.mo31894z() || !(yVar instanceof C9834e)) ? null : m11396o2((C9834e) yVar);
        "setScene params = " + t2;
        if (t2 == null) {
            return false;
        }
        Message message = new Message();
        message.what = 0;
        message.obj = t2;
        this.f7220L.mo23360b(message);
        return true;
    }

    /* renamed from: y0 */
    public void mo23356y0() {
    }

    /* renamed from: z */
    public String[] mo23357z() {
        return new String[0];
    }

    /* renamed from: z0 */
    public void mo23358z0(C9768c cVar) {
    }
}
