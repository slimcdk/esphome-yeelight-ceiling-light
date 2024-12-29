package com.yeelight.yeelib.p190i;

import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.miot.bluetooth.BluetoothConstants;
import com.yeelight.yeelib.p150c.p151i.C4198d;
import com.yeelight.yeelib.p150c.p151i.C4200i;
import com.yeelight.yeelib.p152f.C4201a;
import com.yeelight.yeelib.p152f.C4230l;
import com.yeelight.yeelib.p152f.C4257w;
import com.yeelight.yeelib.utils.C10549p;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import p011c.p012a.p046d.C0671g;
import p011c.p012a.p046d.C0688v;
import p011c.p012a.p046d.p052z.C0809a;
import p011c.p012a.p046d.p052z.C0811b;
import p011c.p012a.p046d.p052z.C0812c;

/* renamed from: com.yeelight.yeelib.i.a */
public class C9875a {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public String f17940a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public String f17941b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public int f17942c = 0;

    /* renamed from: d */
    private int f17943d = 15;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public String f17944e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public long f17945f = -1;

    /* renamed from: g */
    private boolean f17946g = false;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public String f17947h;

    /* renamed from: i */
    private String[] f17948i;

    /* renamed from: j */
    private boolean f17949j;

    /* renamed from: k */
    private CopyOnWriteArrayList<C4200i> f17950k = new CopyOnWriteArrayList<>();

    /* renamed from: com.yeelight.yeelib.i.a$a */
    static class C9876a extends C0688v<List<C9875a>> {
        C9876a() {
        }

        /* JADX WARNING: Can't fix incorrect switch cases order */
        /* renamed from: e */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.util.List<com.yeelight.yeelib.p190i.C9875a> mo8694b(p011c.p012a.p046d.p052z.C0809a r16) {
            /*
                r15 = this;
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                r16.mo8862a()     // Catch:{ Exception -> 0x00f7 }
            L_0x0008:
                boolean r0 = r16.mo8870t()     // Catch:{ Exception -> 0x00f7 }
                if (r0 == 0) goto L_0x00f3
                r16.mo8863b()     // Catch:{ Exception -> 0x00f7 }
                r2 = 0
                r0 = 0
                java.lang.String[] r4 = new java.lang.String[r0]     // Catch:{ Exception -> 0x00f7 }
                r5 = 0
                java.lang.String r6 = ""
                r11 = r2
                r13 = r4
                r2 = r5
                r8 = r6
                r10 = r8
                r3 = 0
                r9 = 0
            L_0x0020:
                boolean r4 = r16.mo8870t()     // Catch:{ Exception -> 0x00f7 }
                if (r4 == 0) goto L_0x00da
                java.lang.String r4 = r16.mo8858L()     // Catch:{ Exception -> 0x00f7 }
                r6 = -1
                int r7 = r4.hashCode()     // Catch:{ Exception -> 0x00f7 }
                r14 = 1
                switch(r7) {
                    case -905826493: goto L_0x007a;
                    case -892481550: goto L_0x0070;
                    case 3355: goto L_0x0066;
                    case 3373707: goto L_0x005c;
                    case 3575610: goto L_0x0052;
                    case 3601339: goto L_0x0048;
                    case 1559801053: goto L_0x003e;
                    case 2013308630: goto L_0x0034;
                    default: goto L_0x0033;
                }     // Catch:{ Exception -> 0x00f7 }
            L_0x0033:
                goto L_0x0083
            L_0x0034:
                java.lang.String r7 = "last_time"
                boolean r4 = r4.equals(r7)     // Catch:{ Exception -> 0x00f7 }
                if (r4 == 0) goto L_0x0083
                r6 = 3
                goto L_0x0083
            L_0x003e:
                java.lang.String r7 = "devices"
                boolean r4 = r4.equals(r7)     // Catch:{ Exception -> 0x00f7 }
                if (r4 == 0) goto L_0x0083
                r6 = 4
                goto L_0x0083
            L_0x0048:
                java.lang.String r7 = "uuid"
                boolean r4 = r4.equals(r7)     // Catch:{ Exception -> 0x00f7 }
                if (r4 == 0) goto L_0x0083
                r6 = 0
                goto L_0x0083
            L_0x0052:
                java.lang.String r7 = "type"
                boolean r4 = r4.equals(r7)     // Catch:{ Exception -> 0x00f7 }
                if (r4 == 0) goto L_0x0083
                r6 = 1
                goto L_0x0083
            L_0x005c:
                java.lang.String r7 = "name"
                boolean r4 = r4.equals(r7)     // Catch:{ Exception -> 0x00f7 }
                if (r4 == 0) goto L_0x0083
                r6 = 2
                goto L_0x0083
            L_0x0066:
                java.lang.String r7 = "id"
                boolean r4 = r4.equals(r7)     // Catch:{ Exception -> 0x00f7 }
                if (r4 == 0) goto L_0x0083
                r6 = 5
                goto L_0x0083
            L_0x0070:
                java.lang.String r7 = "status"
                boolean r4 = r4.equals(r7)     // Catch:{ Exception -> 0x00f7 }
                if (r4 == 0) goto L_0x0083
                r6 = 6
                goto L_0x0083
            L_0x007a:
                java.lang.String r7 = "server"
                boolean r4 = r4.equals(r7)     // Catch:{ Exception -> 0x00f7 }
                if (r4 == 0) goto L_0x0083
                r6 = 7
            L_0x0083:
                switch(r6) {
                    case 0: goto L_0x00d3;
                    case 1: goto L_0x00cd;
                    case 2: goto L_0x00c6;
                    case 3: goto L_0x00bf;
                    case 4: goto L_0x00ac;
                    case 5: goto L_0x00a5;
                    case 6: goto L_0x0098;
                    case 7: goto L_0x0087;
                    default: goto L_0x0086;
                }     // Catch:{ Exception -> 0x00f7 }
            L_0x0086:
                goto L_0x0094
            L_0x0087:
                c.a.d.z.b r4 = r16.mo8861V()     // Catch:{ Exception -> 0x00f7 }
                c.a.d.z.b r6 = p011c.p012a.p046d.p052z.C0811b.NULL     // Catch:{ Exception -> 0x00f7 }
                if (r4 == r6) goto L_0x0094
                java.lang.String r2 = r16.mo8860S()     // Catch:{ Exception -> 0x00f7 }
                goto L_0x0020
            L_0x0094:
                r16.mo8866j0()     // Catch:{ Exception -> 0x00f7 }
                goto L_0x0020
            L_0x0098:
                java.lang.String r3 = "normal"
                java.lang.String r4 = r16.mo8860S()     // Catch:{ Exception -> 0x00f7 }
                boolean r3 = r3.equals(r4)     // Catch:{ Exception -> 0x00f7 }
                r3 = r3 ^ r14
                goto L_0x0020
            L_0x00a5:
                java.lang.String r4 = r16.mo8860S()     // Catch:{ Exception -> 0x00f7 }
                r5 = r4
                goto L_0x0020
            L_0x00ac:
                java.lang.String r4 = r16.mo8860S()     // Catch:{ Exception -> 0x00f7 }
                boolean r6 = android.text.TextUtils.isEmpty(r4)     // Catch:{ Exception -> 0x00f7 }
                if (r6 != 0) goto L_0x0020
                java.lang.String r6 = ";"
                java.lang.String[] r4 = r4.split(r6)     // Catch:{ Exception -> 0x00f7 }
                r13 = r4
                goto L_0x0020
            L_0x00bf:
                long r6 = r16.mo8857K()     // Catch:{ Exception -> 0x00f7 }
                r11 = r6
                goto L_0x0020
            L_0x00c6:
                java.lang.String r4 = r16.mo8860S()     // Catch:{ Exception -> 0x00f7 }
                r10 = r4
                goto L_0x0020
            L_0x00cd:
                int r9 = r16.mo8856J()     // Catch:{ Exception -> 0x00f7 }
                goto L_0x0020
            L_0x00d3:
                java.lang.String r4 = r16.mo8860S()     // Catch:{ Exception -> 0x00f7 }
                r8 = r4
                goto L_0x0020
            L_0x00da:
                com.yeelight.yeelib.i.a r0 = new com.yeelight.yeelib.i.a     // Catch:{ Exception -> 0x00f7 }
                r7 = r0
                r7.<init>(r8, r9, r10, r11, r13)     // Catch:{ Exception -> 0x00f7 }
                r0.mo31965y(r3)     // Catch:{ Exception -> 0x00f7 }
                if (r5 == 0) goto L_0x00e8
                r0.mo31966z(r5)     // Catch:{ Exception -> 0x00f7 }
            L_0x00e8:
                r0.mo31941B(r2)     // Catch:{ Exception -> 0x00f7 }
                r1.add(r0)     // Catch:{ Exception -> 0x00f7 }
                r16.mo8867n()     // Catch:{ Exception -> 0x00f7 }
                goto L_0x0008
            L_0x00f3:
                r16.mo8865j()     // Catch:{ Exception -> 0x00f7 }
                goto L_0x00fb
            L_0x00f7:
                r0 = move-exception
                r0.printStackTrace()
            L_0x00fb:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.p190i.C9875a.C9876a.mo8694b(c.a.d.z.a):java.util.List");
        }

        /* renamed from: f */
        public void mo8695d(C0812c cVar, List<C9875a> list) {
            cVar.mo8883g();
            for (C9875a next : list) {
                cVar.mo8884h();
                if (next.f17940a != null) {
                    cVar.mo8887u("id").mo8878X(next.f17940a);
                }
                cVar.mo8887u("mid").mo8878X(C4201a.m11607r().mo23452v());
                cVar.mo8887u("uuid").mo8878X(next.f17941b);
                cVar.mo8887u("type").mo8875T((long) next.f17942c);
                cVar.mo8887u("name").mo8878X(next.f17944e);
                cVar.mo8887u("last_time").mo8875T(next.f17945f);
                cVar.mo8887u("server").mo8878X(next.f17947h);
                cVar.mo8887u(BluetoothConstants.KEY_DEVICES).mo8878X(next.mo31947g());
                cVar.mo8887u(NotificationCompat.CATEGORY_STATUS).mo8878X(next.mo31959t() ? "deleted" : "normal");
                cVar.mo8886n();
            }
            cVar.mo8885j();
        }
    }

    /* renamed from: com.yeelight.yeelib.i.a$b */
    static class C9877b extends C0688v<C9875a> {
        C9877b() {
        }

        /* renamed from: e */
        public C9875a mo8694b(C0809a aVar) {
            aVar.mo8863b();
            String str = null;
            String[] strArr = new String[0];
            String str2 = "";
            String str3 = str2;
            long j = 0;
            int i = 0;
            while (aVar.mo8870t()) {
                String L = aVar.mo8858L();
                char c = 65535;
                switch (L.hashCode()) {
                    case -905826493:
                        if (L.equals("server")) {
                            c = 5;
                            break;
                        }
                        break;
                    case 3373707:
                        if (L.equals("name")) {
                            c = 2;
                            break;
                        }
                        break;
                    case 3575610:
                        if (L.equals("type")) {
                            c = 1;
                            break;
                        }
                        break;
                    case 3601339:
                        if (L.equals("uuid")) {
                            c = 0;
                            break;
                        }
                        break;
                    case 1559801053:
                        if (L.equals(BluetoothConstants.KEY_DEVICES)) {
                            c = 4;
                            break;
                        }
                        break;
                    case 2013308630:
                        if (L.equals("last_time")) {
                            c = 3;
                            break;
                        }
                        break;
                }
                if (c == 0) {
                    str2 = aVar.mo8860S();
                } else if (c == 1) {
                    i = aVar.mo8856J();
                } else if (c == 2) {
                    str3 = aVar.mo8860S();
                } else if (c == 3) {
                    j = aVar.mo8857K();
                } else if (c == 4) {
                    String S = aVar.mo8860S();
                    if (!TextUtils.isEmpty(S)) {
                        strArr = S.split(";");
                    }
                } else if (c == 5) {
                    if (aVar.mo8861V() != C0811b.NULL) {
                        str = aVar.mo8860S();
                    } else {
                        aVar.mo8866j0();
                    }
                }
            }
            aVar.mo8867n();
            C9875a aVar2 = new C9875a(str2, i, str3, j, strArr);
            aVar2.mo31941B(str);
            return aVar2;
        }

        /* renamed from: f */
        public void mo8695d(C0812c cVar, C9875a aVar) {
            cVar.mo8883g();
            cVar.mo8884h();
            if (aVar.f17940a != null) {
                cVar.mo8887u("id").mo8878X(aVar.f17940a);
            }
            cVar.mo8887u("mid").mo8878X(C4201a.m11607r().mo23452v());
            cVar.mo8887u("uuid").mo8878X(aVar.f17941b);
            cVar.mo8887u("type").mo8875T((long) aVar.f17942c);
            cVar.mo8887u("name").mo8878X(aVar.f17944e);
            cVar.mo8887u("last_time").mo8875T(aVar.f17945f);
            cVar.mo8887u("server").mo8878X(aVar.f17947h);
            cVar.mo8887u(BluetoothConstants.KEY_DEVICES).mo8878X(aVar.mo31947g());
            cVar.mo8887u(NotificationCompat.CATEGORY_STATUS).mo8878X(aVar.mo31959t() ? "deleted" : "normal");
            cVar.mo8886n();
            cVar.mo8885j();
        }
    }

    public C9875a(String str, int i, String str2, long j, String[] strArr) {
        this.f17941b = str;
        this.f17942c = i;
        this.f17944e = str2;
        this.f17945f = j;
        this.f17948i = strArr;
        for (String o0 : strArr) {
            C4200i o02 = C4257w.m11953o0(o0);
            if (o02 != null) {
                this.f17950k.add(o02);
            }
        }
        this.f17947h = C4230l.m11766b().mo23552a();
    }

    /* renamed from: k */
    public static C0671g m24195k() {
        C0671g gVar = new C0671g();
        gVar.mo8731c(C9875a.class, new C9877b());
        gVar.mo8731c(List.class, new C9876a());
        gVar.mo8732d();
        return gVar;
    }

    /* renamed from: A */
    public void mo31940A(String str) {
        this.f17944e = str;
    }

    /* renamed from: B */
    public void mo31941B(String str) {
        this.f17947h = str;
    }

    /* renamed from: C */
    public void mo31942C(long j) {
        this.f17945f = j;
    }

    /* renamed from: D */
    public void mo31943D(int i) {
        this.f17942c = i;
    }

    /* renamed from: E */
    public String mo31944E() {
        return m24195k().mo8730b().mo8712r(this);
    }

    /* renamed from: F */
    public void mo31945F() {
        this.f17945f = System.currentTimeMillis();
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof C9875a) {
            return ((C9875a) obj).f17941b.equals(this.f17941b);
        }
        return false;
    }

    /* renamed from: g */
    public String mo31947g() {
        StringBuilder sb = new StringBuilder();
        Iterator<C4200i> it = this.f17950k.iterator();
        while (it.hasNext()) {
            sb.append(it.next().mo23372G());
            sb.append(";");
        }
        return sb.length() > 0 ? sb.substring(0, sb.length() - 1) : "";
    }

    /* renamed from: h */
    public int mo31948h() {
        return this.f17943d;
    }

    /* renamed from: i */
    public CopyOnWriteArrayList<C4200i> mo31949i() {
        return this.f17950k;
    }

    /* renamed from: j */
    public String mo31950j() {
        return this.f17940a;
    }

    /* renamed from: l */
    public int mo31951l() {
        return C10549p.f20167b.get(this.f17942c).intValue();
    }

    /* renamed from: m */
    public int mo31952m() {
        return C10549p.f20168c.get(this.f17942c).intValue();
    }

    /* renamed from: n */
    public String mo31953n() {
        return this.f17941b;
    }

    /* renamed from: o */
    public String mo31954o() {
        return this.f17944e;
    }

    /* renamed from: p */
    public String mo31955p() {
        return this.f17947h;
    }

    /* renamed from: q */
    public long mo31956q() {
        return this.f17945f;
    }

    /* renamed from: r */
    public int mo31957r() {
        return this.f17942c;
    }

    /* renamed from: s */
    public boolean mo31958s() {
        return this.f17949j;
    }

    /* renamed from: t */
    public boolean mo31959t() {
        return this.f17946g;
    }

    public String toString() {
        return "Room{mGlobalId='" + this.f17940a + '\'' + ", mLocalId='" + this.f17941b + '\'' + ", mType=" + this.f17942c + ", mName='" + this.f17944e + '\'' + ", mTimestamp=" + this.f17945f + ", isDeleted=" + this.f17946g + ", mDeviceList=" + this.f17950k + '}';
    }

    /* renamed from: u */
    public boolean mo31961u(String str) {
        C4198d h0 = C4257w.m11945h0(str);
        return h0 != null && this.f17950k.contains(h0);
    }

    /* renamed from: v */
    public void mo31962v(String str) {
        C4198d h0 = C4257w.m11945h0(str);
        if (h0 != null && this.f17950k.contains(h0)) {
            this.f17950k.remove(h0);
        }
        LinkedList linkedList = new LinkedList();
        for (String str2 : this.f17948i) {
            if (!str2.equals(str)) {
                linkedList.add(str2);
            }
        }
        this.f17948i = (String[]) linkedList.toArray(new String[0]);
    }

    /* renamed from: w */
    public void mo31963w(boolean z) {
        this.f17949j = z;
    }

    /* renamed from: x */
    public void mo31964x(int i) {
        this.f17943d = i;
    }

    /* renamed from: y */
    public void mo31965y(boolean z) {
        this.f17946g = z;
    }

    /* renamed from: z */
    public void mo31966z(String str) {
        this.f17940a = str;
    }
}
