package p145d4;

import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.google.gson.C2476f;
import com.google.gson.C2534q;
import com.google.gson.stream.C2537a;
import com.google.gson.stream.JsonToken;
import com.miot.bluetooth.BluetoothConstants;
import com.yeelight.yeelib.device.base.C3010c;
import com.yeelight.yeelib.device.base.C3012e;
import com.yeelight.yeelib.managers.C3051a;
import com.yeelight.yeelib.managers.C8281l;
import com.yeelight.yeelib.managers.YeelightDeviceManager;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import p051j4.C9195n;
import p122z1.C3929a;

/* renamed from: d4.a */
public class C8937a {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public String f16431a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public String f16432b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public int f16433c = 0;

    /* renamed from: d */
    private int f16434d = 15;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public String f16435e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public long f16436f = -1;

    /* renamed from: g */
    private boolean f16437g = false;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public String f16438h;

    /* renamed from: i */
    private String[] f16439i;

    /* renamed from: j */
    private boolean f16440j;

    /* renamed from: k */
    private CopyOnWriteArrayList<C3012e> f16441k = new CopyOnWriteArrayList<>();

    /* renamed from: d4.a$a */
    class C8938a extends C2534q<List<C8937a>> {
        C8938a() {
        }

        /* JADX WARNING: Can't fix incorrect switch cases order */
        /* renamed from: e */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.util.List<p145d4.C8937a> mo19209b(p122z1.C3929a r16) {
            /*
                r15 = this;
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                r16.mo26170a()     // Catch:{ Exception -> 0x00f7 }
            L_0x0008:
                boolean r0 = r16.mo26177n()     // Catch:{ Exception -> 0x00f7 }
                if (r0 == 0) goto L_0x00f3
                r16.mo26171c()     // Catch:{ Exception -> 0x00f7 }
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
                boolean r4 = r16.mo26177n()     // Catch:{ Exception -> 0x00f7 }
                if (r4 == 0) goto L_0x00da
                java.lang.String r4 = r16.mo26166D()     // Catch:{ Exception -> 0x00f7 }
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
                com.google.gson.stream.JsonToken r4 = r16.mo26169N()     // Catch:{ Exception -> 0x00f7 }
                com.google.gson.stream.JsonToken r6 = com.google.gson.stream.JsonToken.NULL     // Catch:{ Exception -> 0x00f7 }
                if (r4 == r6) goto L_0x0094
                java.lang.String r2 = r16.mo26168I()     // Catch:{ Exception -> 0x00f7 }
                goto L_0x0020
            L_0x0094:
                r16.mo26174j0()     // Catch:{ Exception -> 0x00f7 }
                goto L_0x0020
            L_0x0098:
                java.lang.String r3 = "normal"
                java.lang.String r4 = r16.mo26168I()     // Catch:{ Exception -> 0x00f7 }
                boolean r3 = r3.equals(r4)     // Catch:{ Exception -> 0x00f7 }
                r3 = r3 ^ r14
                goto L_0x0020
            L_0x00a5:
                java.lang.String r4 = r16.mo26168I()     // Catch:{ Exception -> 0x00f7 }
                r5 = r4
                goto L_0x0020
            L_0x00ac:
                java.lang.String r4 = r16.mo26168I()     // Catch:{ Exception -> 0x00f7 }
                boolean r6 = android.text.TextUtils.isEmpty(r4)     // Catch:{ Exception -> 0x00f7 }
                if (r6 != 0) goto L_0x0020
                java.lang.String r6 = ";"
                java.lang.String[] r4 = r4.split(r6)     // Catch:{ Exception -> 0x00f7 }
                r13 = r4
                goto L_0x0020
            L_0x00bf:
                long r6 = r16.mo26165B()     // Catch:{ Exception -> 0x00f7 }
                r11 = r6
                goto L_0x0020
            L_0x00c6:
                java.lang.String r4 = r16.mo26168I()     // Catch:{ Exception -> 0x00f7 }
                r10 = r4
                goto L_0x0020
            L_0x00cd:
                int r9 = r16.mo26164A()     // Catch:{ Exception -> 0x00f7 }
                goto L_0x0020
            L_0x00d3:
                java.lang.String r4 = r16.mo26168I()     // Catch:{ Exception -> 0x00f7 }
                r8 = r4
                goto L_0x0020
            L_0x00da:
                d4.a r0 = new d4.a     // Catch:{ Exception -> 0x00f7 }
                r7 = r0
                r7.<init>(r8, r9, r10, r11, r13)     // Catch:{ Exception -> 0x00f7 }
                r0.mo36734y(r3)     // Catch:{ Exception -> 0x00f7 }
                if (r5 == 0) goto L_0x00e8
                r0.mo36735z(r5)     // Catch:{ Exception -> 0x00f7 }
            L_0x00e8:
                r0.mo36710B(r2)     // Catch:{ Exception -> 0x00f7 }
                r1.add(r0)     // Catch:{ Exception -> 0x00f7 }
                r16.mo26175k()     // Catch:{ Exception -> 0x00f7 }
                goto L_0x0008
            L_0x00f3:
                r16.mo26173i()     // Catch:{ Exception -> 0x00f7 }
                goto L_0x00fb
            L_0x00f7:
                r0 = move-exception
                r0.printStackTrace()
            L_0x00fb:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: p145d4.C8937a.C8938a.mo19209b(z1.a):java.util.List");
        }

        /* renamed from: f */
        public void mo19210d(C2537a aVar, List<C8937a> list) {
            aVar.mo19425d();
            for (C8937a next : list) {
                aVar.mo19426f();
                if (next.f16431a != null) {
                    aVar.mo19433p("id").mo19422T(next.f16431a);
                }
                aVar.mo19433p("mid").mo19422T(C3051a.m7925r().mo23366v());
                aVar.mo19433p("uuid").mo19422T(next.f16432b);
                aVar.mo19433p("type").mo19419J((long) next.f16433c);
                aVar.mo19433p("name").mo19422T(next.f16435e);
                aVar.mo19433p("last_time").mo19419J(next.f16436f);
                aVar.mo19433p("server").mo19422T(next.f16438h);
                aVar.mo19433p(BluetoothConstants.KEY_DEVICES).mo19422T(next.mo36716g());
                aVar.mo19433p(NotificationCompat.CATEGORY_STATUS).mo19422T(next.mo36728t() ? "deleted" : "normal");
                aVar.mo19429k();
            }
            aVar.mo19428i();
        }
    }

    /* renamed from: d4.a$b */
    class C8939b extends C2534q<C8937a> {
        C8939b() {
        }

        /* renamed from: e */
        public C8937a mo19209b(C3929a aVar) {
            aVar.mo26171c();
            String str = null;
            String[] strArr = new String[0];
            String str2 = "";
            String str3 = str2;
            long j = 0;
            int i = 0;
            while (aVar.mo26177n()) {
                String D = aVar.mo26166D();
                D.hashCode();
                char c = 65535;
                switch (D.hashCode()) {
                    case -905826493:
                        if (D.equals("server")) {
                            c = 0;
                            break;
                        }
                        break;
                    case 3373707:
                        if (D.equals("name")) {
                            c = 1;
                            break;
                        }
                        break;
                    case 3575610:
                        if (D.equals("type")) {
                            c = 2;
                            break;
                        }
                        break;
                    case 3601339:
                        if (D.equals("uuid")) {
                            c = 3;
                            break;
                        }
                        break;
                    case 1559801053:
                        if (D.equals(BluetoothConstants.KEY_DEVICES)) {
                            c = 4;
                            break;
                        }
                        break;
                    case 2013308630:
                        if (D.equals("last_time")) {
                            c = 5;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        if (aVar.mo26169N() == JsonToken.NULL) {
                            aVar.mo26174j0();
                            break;
                        } else {
                            str = aVar.mo26168I();
                            break;
                        }
                    case 1:
                        str3 = aVar.mo26168I();
                        break;
                    case 2:
                        i = aVar.mo26164A();
                        break;
                    case 3:
                        str2 = aVar.mo26168I();
                        break;
                    case 4:
                        String I = aVar.mo26168I();
                        if (TextUtils.isEmpty(I)) {
                            break;
                        } else {
                            strArr = I.split(";");
                            break;
                        }
                    case 5:
                        j = aVar.mo26165B();
                        break;
                }
            }
            aVar.mo26175k();
            C8937a aVar2 = new C8937a(str2, i, str3, j, strArr);
            aVar2.mo36710B(str);
            return aVar2;
        }

        /* renamed from: f */
        public void mo19210d(C2537a aVar, C8937a aVar2) {
            aVar.mo19425d();
            aVar.mo19426f();
            if (aVar2.f16431a != null) {
                aVar.mo19433p("id").mo19422T(aVar2.f16431a);
            }
            aVar.mo19433p("mid").mo19422T(C3051a.m7925r().mo23366v());
            aVar.mo19433p("uuid").mo19422T(aVar2.f16432b);
            aVar.mo19433p("type").mo19419J((long) aVar2.f16433c);
            aVar.mo19433p("name").mo19422T(aVar2.f16435e);
            aVar.mo19433p("last_time").mo19419J(aVar2.f16436f);
            aVar.mo19433p("server").mo19422T(aVar2.f16438h);
            aVar.mo19433p(BluetoothConstants.KEY_DEVICES).mo19422T(aVar2.mo36716g());
            aVar.mo19433p(NotificationCompat.CATEGORY_STATUS).mo19422T(aVar2.mo36728t() ? "deleted" : "normal");
            aVar.mo19429k();
            aVar.mo19428i();
        }
    }

    public C8937a(String str, int i, String str2, long j, String[] strArr) {
        this.f16432b = str;
        this.f16433c = i;
        this.f16435e = str2;
        this.f16436f = j;
        this.f16439i = strArr;
        for (String r0 : strArr) {
            C3012e r02 = YeelightDeviceManager.m7804r0(r0);
            if (r02 != null) {
                this.f16441k.add(r02);
            }
        }
        this.f16438h = C8281l.m19542b().mo35223a();
    }

    /* renamed from: k */
    public static C2476f m21309k() {
        C2476f fVar = new C2476f();
        fVar.mo19253c(C8937a.class, new C8939b()).mo19253c(List.class, new C8938a());
        fVar.mo19254d();
        return fVar;
    }

    /* renamed from: A */
    public void mo36709A(String str) {
        this.f16435e = str;
    }

    /* renamed from: B */
    public void mo36710B(String str) {
        this.f16438h = str;
    }

    /* renamed from: C */
    public void mo36711C(long j) {
        this.f16436f = j;
    }

    /* renamed from: D */
    public void mo36712D(int i) {
        this.f16433c = i;
    }

    /* renamed from: E */
    public String mo36713E() {
        return m21309k().mo19252b().mo19234r(this);
    }

    /* renamed from: F */
    public void mo36714F() {
        this.f16436f = System.currentTimeMillis();
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof C8937a) {
            return ((C8937a) obj).f16432b.equals(this.f16432b);
        }
        return false;
    }

    /* renamed from: g */
    public String mo36716g() {
        StringBuilder sb = new StringBuilder();
        Iterator<C3012e> it = this.f16441k.iterator();
        while (it.hasNext()) {
            sb.append(it.next().mo23185G());
            sb.append(";");
        }
        return sb.length() > 0 ? sb.substring(0, sb.length() - 1) : "";
    }

    /* renamed from: h */
    public int mo36717h() {
        return this.f16434d;
    }

    /* renamed from: i */
    public CopyOnWriteArrayList<C3012e> mo36718i() {
        return this.f16441k;
    }

    /* renamed from: j */
    public String mo36719j() {
        return this.f16431a;
    }

    /* renamed from: l */
    public int mo36720l() {
        return C9195n.f17012b.get(this.f16433c).intValue();
    }

    /* renamed from: m */
    public int mo36721m() {
        return C9195n.f17013c.get(this.f16433c).intValue();
    }

    /* renamed from: n */
    public String mo36722n() {
        return this.f16432b;
    }

    /* renamed from: o */
    public String mo36723o() {
        return this.f16435e;
    }

    /* renamed from: p */
    public String mo36724p() {
        return this.f16438h;
    }

    /* renamed from: q */
    public long mo36725q() {
        return this.f16436f;
    }

    /* renamed from: r */
    public int mo36726r() {
        return this.f16433c;
    }

    /* renamed from: s */
    public boolean mo36727s() {
        return this.f16440j;
    }

    /* renamed from: t */
    public boolean mo36728t() {
        return this.f16437g;
    }

    public String toString() {
        return "Room{mName='" + this.f16435e + '\'' + ", mLocalId='" + this.f16432b + '\'' + ", mType=" + this.f16433c + ", mGlobalId='" + this.f16431a + '\'' + ", mTimestamp=" + this.f16436f + ", isDeleted=" + this.f16437g + ", mDeviceList=" + this.f16441k + '}';
    }

    /* renamed from: u */
    public boolean mo36730u(String str) {
        C3010c j0 = YeelightDeviceManager.m7794j0(str);
        return j0 != null && this.f16441k.contains(j0);
    }

    /* renamed from: v */
    public void mo36731v(String str) {
        C3010c j0 = YeelightDeviceManager.m7794j0(str);
        if (j0 != null && this.f16441k.contains(j0)) {
            this.f16441k.remove(j0);
        }
        LinkedList linkedList = new LinkedList();
        for (String str2 : this.f16439i) {
            if (!str2.equals(str)) {
                linkedList.add(str2);
            }
        }
        this.f16439i = (String[]) linkedList.toArray(new String[0]);
    }

    /* renamed from: w */
    public void mo36732w(boolean z) {
        this.f16440j = z;
    }

    /* renamed from: x */
    public void mo36733x(int i) {
        this.f16434d = i;
    }

    /* renamed from: y */
    public void mo36734y(boolean z) {
        this.f16437g = z;
    }

    /* renamed from: z */
    public void mo36735z(String str) {
        this.f16431a = str;
    }
}
