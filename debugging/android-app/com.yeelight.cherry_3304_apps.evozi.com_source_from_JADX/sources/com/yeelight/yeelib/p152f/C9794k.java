package com.yeelight.yeelib.p152f;

import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.miot.api.CommonHandler;
import com.miot.api.MiotManager;
import com.miot.common.exception.MiotException;
import com.yeelight.yeelib.p150c.C5972a;
import com.yeelight.yeelib.p150c.C5980c;
import com.yeelight.yeelib.p150c.p151i.C4198d;
import com.yeelight.yeelib.p150c.p151i.C4200i;
import com.yeelight.yeelib.p153g.C9840j;
import com.yeelight.yeelib.p186e.C9769d;
import com.yeelight.yeelib.utils.C4308b;
import com.yeelight.yeelib.utils.C4310h;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.yeelight.yeelib.f.k */
public class C9794k implements C9769d {

    /* renamed from: c */
    public static final String f17708c = "k";

    /* renamed from: d */
    public static C9794k f17709d;

    /* renamed from: a */
    private C9799e f17710a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public List<C9840j> f17711b = new CopyOnWriteArrayList();

    /* renamed from: com.yeelight.yeelib.f.k$a */
    class C9795a implements CommonHandler<String> {
        C9795a(C9794k kVar) {
        }

        /* renamed from: a */
        public void onSucceed(String str) {
            "do bundle item command, onSucceed ret = " + str;
        }

        public void onFailed(int i, String str) {
            "do bundle item command, onFailed ret = " + str + ", i = " + i;
        }
    }

    /* renamed from: com.yeelight.yeelib.f.k$b */
    class C9796b implements CommonHandler<String> {
        C9796b(C9794k kVar) {
        }

        /* renamed from: a */
        public void onSucceed(String str) {
            "device group, onSucceed : " + str;
        }

        public void onFailed(int i, String str) {
            "device group, onFailed : error : " + str + " , error code : " + i;
        }
    }

    /* renamed from: com.yeelight.yeelib.f.k$c */
    static /* synthetic */ class C9797c {

        /* renamed from: a */
        static final /* synthetic */ int[] f17712a;

        /* renamed from: b */
        static final /* synthetic */ int[] f17713b;

        /* JADX WARNING: Can't wrap try/catch for region: R(36:0|(2:1|2)|3|(2:5|6)|7|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|40) */
        /* JADX WARNING: Can't wrap try/catch for region: R(37:0|(2:1|2)|3|5|6|7|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|40) */
        /* JADX WARNING: Can't wrap try/catch for region: R(38:0|1|2|3|5|6|7|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|40) */
        /* JADX WARNING: Code restructure failed: missing block: B:41:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x002e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0038 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0043 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x004e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0059 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0064 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x006f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x007b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0087 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0093 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x009f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x00ab */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x00b7 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x00c3 */
        static {
            /*
                com.yeelight.yeelib.f.k$d[] r0 = com.yeelight.yeelib.p152f.C9794k.C9798d.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f17713b = r0
                r1 = 1
                com.yeelight.yeelib.f.k$d r2 = com.yeelight.yeelib.p152f.C9794k.C9798d.MESSAGE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f17713b     // Catch:{ NoSuchFieldError -> 0x001d }
                com.yeelight.yeelib.f.k$d r3 = com.yeelight.yeelib.p152f.C9794k.C9798d.EMPTY_MESSAGE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                com.yeelight.yeelib.d.a[] r2 = com.yeelight.yeelib.p185d.C7563a.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                f17712a = r2
                com.yeelight.yeelib.d.a r3 = com.yeelight.yeelib.p185d.C7563a.TURN_ON_ALL     // Catch:{ NoSuchFieldError -> 0x002e }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x002e }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x002e }
            L_0x002e:
                int[] r1 = f17712a     // Catch:{ NoSuchFieldError -> 0x0038 }
                com.yeelight.yeelib.d.a r2 = com.yeelight.yeelib.p185d.C7563a.TURN_OFF_ALL     // Catch:{ NoSuchFieldError -> 0x0038 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0038 }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0038 }
            L_0x0038:
                int[] r0 = f17712a     // Catch:{ NoSuchFieldError -> 0x0043 }
                com.yeelight.yeelib.d.a r1 = com.yeelight.yeelib.p185d.C7563a.SCENE_BUNDLE     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                int[] r0 = f17712a     // Catch:{ NoSuchFieldError -> 0x004e }
                com.yeelight.yeelib.d.a r1 = com.yeelight.yeelib.p185d.C7563a.COMMAND     // Catch:{ NoSuchFieldError -> 0x004e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004e }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004e }
            L_0x004e:
                int[] r0 = f17712a     // Catch:{ NoSuchFieldError -> 0x0059 }
                com.yeelight.yeelib.d.a r1 = com.yeelight.yeelib.p185d.C7563a.ON     // Catch:{ NoSuchFieldError -> 0x0059 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0059 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0059 }
            L_0x0059:
                int[] r0 = f17712a     // Catch:{ NoSuchFieldError -> 0x0064 }
                com.yeelight.yeelib.d.a r1 = com.yeelight.yeelib.p185d.C7563a.OFF     // Catch:{ NoSuchFieldError -> 0x0064 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0064 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0064 }
            L_0x0064:
                int[] r0 = f17712a     // Catch:{ NoSuchFieldError -> 0x006f }
                com.yeelight.yeelib.d.a r1 = com.yeelight.yeelib.p185d.C7563a.TOGGLE     // Catch:{ NoSuchFieldError -> 0x006f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006f }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006f }
            L_0x006f:
                int[] r0 = f17712a     // Catch:{ NoSuchFieldError -> 0x007b }
                com.yeelight.yeelib.d.a r1 = com.yeelight.yeelib.p185d.C7563a.BRIGHT     // Catch:{ NoSuchFieldError -> 0x007b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x007b }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x007b }
            L_0x007b:
                int[] r0 = f17712a     // Catch:{ NoSuchFieldError -> 0x0087 }
                com.yeelight.yeelib.d.a r1 = com.yeelight.yeelib.p185d.C7563a.BRIGHT_VARIABLE     // Catch:{ NoSuchFieldError -> 0x0087 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0087 }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0087 }
            L_0x0087:
                int[] r0 = f17712a     // Catch:{ NoSuchFieldError -> 0x0093 }
                com.yeelight.yeelib.d.a r1 = com.yeelight.yeelib.p185d.C7563a.CT_VARIABLE     // Catch:{ NoSuchFieldError -> 0x0093 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0093 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0093 }
            L_0x0093:
                int[] r0 = f17712a     // Catch:{ NoSuchFieldError -> 0x009f }
                com.yeelight.yeelib.d.a r1 = com.yeelight.yeelib.p185d.C7563a.COLOR_VARIABLE     // Catch:{ NoSuchFieldError -> 0x009f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x009f }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x009f }
            L_0x009f:
                int[] r0 = f17712a     // Catch:{ NoSuchFieldError -> 0x00ab }
                com.yeelight.yeelib.d.a r1 = com.yeelight.yeelib.p185d.C7563a.SCENE     // Catch:{ NoSuchFieldError -> 0x00ab }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00ab }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00ab }
            L_0x00ab:
                int[] r0 = f17712a     // Catch:{ NoSuchFieldError -> 0x00b7 }
                com.yeelight.yeelib.d.a r1 = com.yeelight.yeelib.p185d.C7563a.CONNECT     // Catch:{ NoSuchFieldError -> 0x00b7 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b7 }
                r2 = 13
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00b7 }
            L_0x00b7:
                int[] r0 = f17712a     // Catch:{ NoSuchFieldError -> 0x00c3 }
                com.yeelight.yeelib.d.a r1 = com.yeelight.yeelib.p185d.C7563a.BRIGHT_UP     // Catch:{ NoSuchFieldError -> 0x00c3 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c3 }
                r2 = 14
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00c3 }
            L_0x00c3:
                int[] r0 = f17712a     // Catch:{ NoSuchFieldError -> 0x00cf }
                com.yeelight.yeelib.d.a r1 = com.yeelight.yeelib.p185d.C7563a.BRIGHT_DOWN     // Catch:{ NoSuchFieldError -> 0x00cf }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00cf }
                r2 = 15
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00cf }
            L_0x00cf:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.p152f.C9794k.C9797c.<clinit>():void");
        }
    }

    /* renamed from: com.yeelight.yeelib.f.k$d */
    private enum C9798d {
        MESSAGE,
        EMPTY_MESSAGE
    }

    /* renamed from: com.yeelight.yeelib.f.k$e */
    private class C9799e extends Thread {

        /* renamed from: a */
        public Handler f17717a;

        /* renamed from: b */
        private List<C9801b> f17718b;

        /* renamed from: com.yeelight.yeelib.f.k$e$a */
        class C9800a extends Handler {
            C9800a() {
            }

            public void handleMessage(Message message) {
                switch (message.what) {
                    case 1:
                        C9794k.this.m23750i(1);
                        return;
                    case 2:
                        for (C9840j jVar : C9794k.this.f17711b) {
                            if (jVar.mo31770h() == 2) {
                                C9794k.this.mo31651d(jVar, true);
                                if (jVar.mo31770h() == 2) {
                                    C9794k.this.f17711b.remove(jVar);
                                }
                            }
                        }
                        return;
                    case 3:
                        for (C9840j jVar2 : C9794k.this.f17711b) {
                            if (jVar2.mo31770h() == 3) {
                                C9794k.this.mo31651d(jVar2, true);
                                if (jVar2.mo31770h() == 3) {
                                    C9794k.this.f17711b.remove(jVar2);
                                }
                            }
                        }
                        return;
                    case 4:
                        for (C9840j jVar3 : C9794k.this.f17711b) {
                            if (jVar3.mo31770h() == 4) {
                                C9794k.this.mo31651d(jVar3, true);
                                if (jVar3.mo31770h() == 4) {
                                    C9794k.this.f17711b.remove(jVar3);
                                }
                            }
                        }
                        return;
                    case 5:
                        for (C9840j jVar4 : C9794k.this.f17711b) {
                            if (jVar4.mo31770h() == 5) {
                                C9794k.this.mo31651d(jVar4, true);
                                if (jVar4.mo31770h() == 5) {
                                    C9794k.this.f17711b.remove(jVar4);
                                }
                            }
                        }
                        return;
                    case 6:
                        for (C9840j jVar5 : C9794k.this.f17711b) {
                            if (jVar5.mo31770h() == 6) {
                                C9794k.this.mo31651d(jVar5, true);
                                if (jVar5.mo31770h() == 6) {
                                    C9794k.this.f17711b.remove(jVar5);
                                }
                            }
                        }
                        return;
                    default:
                        return;
                }
            }
        }

        /* renamed from: com.yeelight.yeelib.f.k$e$b */
        private class C9801b {

            /* renamed from: a */
            C9798d f17721a;

            /* renamed from: b */
            int f17722b;

            /* renamed from: c */
            Message f17723c;

            /* renamed from: d */
            boolean f17724d;

            /* renamed from: e */
            long f17725e;

            public C9801b(C9799e eVar, C9798d dVar, int i, Message message, boolean z, long j) {
                this.f17721a = dVar;
                this.f17722b = i;
                this.f17723c = message;
                this.f17724d = z;
                this.f17725e = j;
            }
        }

        private C9799e() {
            this.f17718b = new ArrayList();
        }

        /* synthetic */ C9799e(C9794k kVar, C9795a aVar) {
            this();
        }

        /* renamed from: b */
        public boolean mo31657b(int i) {
            return this.f17717a.hasMessages(i);
        }

        /* renamed from: c */
        public void mo31658c(int i) {
            Handler handler = this.f17717a;
            if (handler != null) {
                handler.removeMessages(i);
            }
        }

        /* renamed from: d */
        public void mo31659d(int i, long j) {
            Handler handler = this.f17717a;
            if (handler == null) {
                this.f17718b.add(new C9801b(this, C9798d.EMPTY_MESSAGE, i, (Message) null, true, j));
                return;
            }
            handler.sendEmptyMessageDelayed(i, j);
        }

        public void run() {
            Looper.prepare();
            this.f17717a = new C9800a();
            Looper.loop();
            for (C9801b next : this.f17718b) {
                int i = C9797c.f17713b[next.f17721a.ordinal()];
                if (i != 1) {
                    if (i == 2) {
                        if (next.f17724d) {
                            this.f17717a.sendEmptyMessageDelayed(next.f17722b, next.f17725e);
                        } else {
                            this.f17717a.sendEmptyMessage(next.f17722b);
                        }
                    }
                } else if (next.f17724d) {
                    this.f17717a.sendMessageDelayed(next.f17723c, next.f17725e);
                } else {
                    this.f17717a.sendMessage(next.f17723c);
                }
            }
        }
    }

    private C9794k() {
        C9799e eVar = new C9799e(this, (C9795a) null);
        this.f17710a = eVar;
        eVar.start();
        C4257w.m11947l0().mo23678m1(this);
    }

    /* renamed from: e */
    public static C9794k m23749e() {
        if (f17709d == null) {
            f17709d = new C9794k();
        }
        return f17709d;
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public void m23750i(int i) {
        for (C9840j next : this.f17711b) {
            if (next.mo31770h() == i) {
                this.f17711b.remove(next);
            }
        }
    }

    /* renamed from: j */
    private void m23751j(C9840j jVar) {
        if (jVar.mo31768f() == null) {
            C4310h.m12146b(new C4308b.C4309a(f17708c, "sendDeviceCommandType, action command is null, action type: " + jVar.mo31763a() + ", scene id: " + jVar.mo31775m() + ", action device id: = " + jVar.mo31771i() + ", user id: " + C4201a.m11607r().mo23452v() + ", parent scene id: " + jVar.mo31773k()));
            return;
        }
        String str = "/device/rpc/" + jVar.mo31771i();
        JSONObject jSONObject = new JSONObject();
        JSONObject f = jVar.mo31768f();
        try {
            String string = f.getString("method");
            JSONArray jSONArray = f.getJSONArray("params");
            jSONObject.put("did", jVar.mo31771i());
            jSONObject.put("id", 1);
            jSONObject.put("method", string);
            jSONObject.put("params", jSONArray);
            try {
                MiotManager.getDeviceManager().callSmarthomeApi(str, jSONObject, new C9795a(this));
            } catch (MiotException e) {
                e.printStackTrace();
            }
        } catch (JSONException e2) {
            "do bundle item command exception:" + e2.toString();
        }
    }

    /* renamed from: l */
    private void m23752l(C9840j jVar, C5980c cVar) {
        "do command action, command: " + jVar.mo31768f().toString();
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        try {
            for (C4198d next : cVar.mo27498K1()) {
                if (!(next instanceof C5972a)) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("did", next.mo23372G());
                    jSONObject2.put("params", jVar.mo31768f().getJSONArray("params"));
                    jSONArray.put(jSONObject2);
                }
            }
            if (jSONArray.length() != 0) {
                jSONObject.put("method", jVar.mo31768f().getString("method"));
                jSONObject.put("rpcs", jSONArray);
                "rpcParams : " + jSONObject.toString();
                C4257w.m11925R(jSONObject, new C9796b(this));
            }
        } catch (JSONException unused) {
        }
    }

    /* renamed from: E */
    public void mo26093E(C4200i iVar) {
        for (C9840j next : this.f17711b) {
            if (iVar.mo23372G().equals(next.mo31771i()) && next.mo31770h() == 3) {
                "Cached action device was found, execute action now! device id: " + iVar.mo23372G();
                mo31651d(next, true);
            }
        }
    }

    /* renamed from: L */
    public void mo26094L() {
        if (this.f17710a.mo31657b(1) || this.f17710a.mo31657b(5)) {
            this.f17710a.mo31658c(1);
            this.f17710a.mo31658c(5);
            for (C9840j next : this.f17711b) {
                if (next.mo31770h() == 1 || next.mo31770h() == 5) {
                    mo31651d(next, true);
                    if (next.mo31770h() == 1 || next.mo31770h() == 5) {
                        this.f17711b.remove(next);
                    }
                }
            }
        }
    }

    /* renamed from: c */
    public void mo31650c(C9840j jVar) {
        mo31651d(jVar, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0272, code lost:
        if (r8.f17711b.contains(r9) == false) goto L_0x0274;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0296, code lost:
        if (r8.f17711b.contains(r9) == false) goto L_0x0274;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo31651d(com.yeelight.yeelib.p153g.C9840j r9, boolean r10) {
        /*
            r8 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "cached actions count: "
            r0.append(r1)
            java.util.List<com.yeelight.yeelib.g.j> r1 = r8.f17711b
            int r1 = r1.size()
            r0.append(r1)
            r0.toString()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Execute action, device id: "
            r0.append(r1)
            java.lang.String r1 = r9.mo31771i()
            r0.append(r1)
            java.lang.String r1 = ", action type: "
            r0.append(r1)
            com.yeelight.yeelib.d.a r1 = r9.mo31763a()
            java.lang.String r1 = r1.name()
            r0.append(r1)
            r0.toString()
            java.lang.String r0 = r9.mo31771i()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r1 = 5000(0x1388, double:2.4703E-320)
            r3 = 3
            r4 = 2
            r5 = 1
            if (r0 == 0) goto L_0x0112
            int[] r0 = com.yeelight.yeelib.p152f.C9794k.C9797c.f17712a
            com.yeelight.yeelib.d.a r6 = r9.mo31763a()
            int r6 = r6.ordinal()
            r0 = r0[r6]
            if (r0 == r5) goto L_0x009f
            if (r0 == r4) goto L_0x009f
            if (r0 == r3) goto L_0x005d
            goto L_0x02ca
        L_0x005d:
            com.yeelight.yeelib.f.u r0 = com.yeelight.yeelib.p152f.C4247u.m11865n()
            boolean r0 = r0.mo23623u()
            if (r0 == 0) goto L_0x007a
            com.yeelight.yeelib.f.u r10 = com.yeelight.yeelib.p152f.C4247u.m11865n()
            java.lang.String r9 = r9.mo31774l()
            com.yeelight.yeelib.g.z r9 = r10.mo23619o(r9)
            if (r9 == 0) goto L_0x02ca
            r9.mo31900b()
            goto L_0x02ca
        L_0x007a:
            r0 = 6
            if (r10 == 0) goto L_0x0083
            int r10 = r9.mo31770h()
            if (r10 == r0) goto L_0x02ca
        L_0x0083:
            r9.mo31778p(r0)
            java.util.List<com.yeelight.yeelib.g.j> r10 = r8.f17711b
            boolean r10 = r10.contains(r9)
            if (r10 != 0) goto L_0x0093
            java.util.List<com.yeelight.yeelib.g.j> r10 = r8.f17711b
            r10.add(r9)
        L_0x0093:
            com.yeelight.yeelib.f.k$e r9 = r8.f17710a
            r9.mo31658c(r0)
            com.yeelight.yeelib.f.k$e r9 = r8.f17710a
            r9.mo31659d(r0, r1)
            goto L_0x02ca
        L_0x009f:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r0 = "type: "
            r10.append(r0)
            com.yeelight.yeelib.d.a r0 = r9.mo31763a()
            java.lang.String r0 = r0.name()
            r10.append(r0)
            r10.toString()
            com.yeelight.yeelib.f.w r10 = com.yeelight.yeelib.p152f.C4257w.m11947l0()
            java.util.List r10 = r10.mo23644E0()
            int r10 = r10.size()
            if (r10 != 0) goto L_0x00e7
            r10 = 5
            r9.mo31778p(r10)
            java.util.List<com.yeelight.yeelib.g.j> r0 = r8.f17711b
            r0.add(r9)
            java.util.List<com.yeelight.yeelib.g.j> r0 = r8.f17711b
            boolean r0 = r0.contains(r9)
            if (r0 != 0) goto L_0x00db
            java.util.List<com.yeelight.yeelib.g.j> r0 = r8.f17711b
            r0.add(r9)
        L_0x00db:
            com.yeelight.yeelib.f.k$e r9 = r8.f17710a
            r9.mo31658c(r10)
            com.yeelight.yeelib.f.k$e r9 = r8.f17710a
            r9.mo31659d(r10, r1)
            goto L_0x02ca
        L_0x00e7:
            int[] r10 = com.yeelight.yeelib.p152f.C9794k.C9797c.f17712a
            com.yeelight.yeelib.d.a r9 = r9.mo31763a()
            int r9 = r9.ordinal()
            r9 = r10[r9]
            if (r9 == r5) goto L_0x0109
            if (r9 == r4) goto L_0x0100
            java.lang.String r9 = f17708c
            java.lang.String r10 = "Invalid action, action device id is null, but type not TURN_ON_ALL or TURN_OFF_ALL"
            com.yeelight.yeelib.utils.C4308b.m12139r(r9, r10)
            goto L_0x02ca
        L_0x0100:
            com.yeelight.yeelib.f.w r9 = com.yeelight.yeelib.p152f.C4257w.m11947l0()
            r9.mo23639A1()
            goto L_0x02ca
        L_0x0109:
            com.yeelight.yeelib.f.w r9 = com.yeelight.yeelib.p152f.C4257w.m11947l0()
            r9.mo23642C1()
            goto L_0x02ca
        L_0x0112:
            java.lang.String r0 = r9.mo31771i()
            com.yeelight.yeelib.c.i.d r0 = com.yeelight.yeelib.p152f.C4257w.m11945h0(r0)
            com.yeelight.yeelib.c.i.i r0 = (com.yeelight.yeelib.p150c.p151i.C4200i) r0
            if (r0 == 0) goto L_0x02b6
            boolean r6 = r0 instanceof com.yeelight.yeelib.p150c.C5980c
            if (r6 == 0) goto L_0x0128
            r7 = r0
            com.yeelight.yeelib.c.c r7 = (com.yeelight.yeelib.p150c.C5980c) r7
            r7.mo27510W1()
        L_0x0128:
            boolean r7 = r0.mo23331k0()
            if (r7 == 0) goto L_0x0257
            int[] r3 = com.yeelight.yeelib.p152f.C9794k.C9797c.f17712a
            com.yeelight.yeelib.d.a r5 = r9.mo31763a()
            int r5 = r5.ordinal()
            r3 = r3[r5]
            switch(r3) {
                case 4: goto L_0x01f3;
                case 5: goto L_0x01ee;
                case 6: goto L_0x01e9;
                case 7: goto L_0x01e4;
                case 8: goto L_0x01db;
                case 9: goto L_0x01c9;
                case 10: goto L_0x01b8;
                case 11: goto L_0x01a7;
                case 12: goto L_0x014e;
                case 13: goto L_0x0149;
                case 14: goto L_0x0144;
                case 15: goto L_0x013f;
                default: goto L_0x013d;
            }
        L_0x013d:
            goto L_0x02ca
        L_0x013f:
            r0.mo23427Z0()
            goto L_0x02ca
        L_0x0144:
            r0.mo23428a1()
            goto L_0x02ca
        L_0x0149:
            r0.mo23337n()
            goto L_0x02ca
        L_0x014e:
            com.yeelight.yeelib.g.b0 r3 = com.yeelight.yeelib.p153g.C4300b0.m12083u()     // Catch:{ NumberFormatException -> 0x02ca }
            java.lang.String r5 = r9.mo31775m()     // Catch:{ NumberFormatException -> 0x02ca }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ NumberFormatException -> 0x02ca }
            int r5 = r5.intValue()     // Catch:{ NumberFormatException -> 0x02ca }
            java.lang.String r6 = r0.mo23330i1()     // Catch:{ NumberFormatException -> 0x02ca }
            com.yeelight.yeelib.g.y r3 = r3.mo23754s(r5, r6)     // Catch:{ NumberFormatException -> 0x02ca }
            if (r3 != 0) goto L_0x017c
            com.yeelight.yeelib.g.b0 r3 = com.yeelight.yeelib.p153g.C4300b0.m12083u()     // Catch:{ NumberFormatException -> 0x02ca }
            java.lang.String r5 = r9.mo31775m()     // Catch:{ NumberFormatException -> 0x02ca }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ NumberFormatException -> 0x02ca }
            int r5 = r5.intValue()     // Catch:{ NumberFormatException -> 0x02ca }
            com.yeelight.yeelib.g.y r3 = r3.mo23744h(r5)     // Catch:{ NumberFormatException -> 0x02ca }
        L_0x017c:
            if (r3 == 0) goto L_0x0183
            r0.mo23355x1(r3)     // Catch:{ NumberFormatException -> 0x02ca }
            goto L_0x02ca
        L_0x0183:
            if (r10 == 0) goto L_0x018b
            int r10 = r9.mo31770h()     // Catch:{ NumberFormatException -> 0x02ca }
            if (r10 == r4) goto L_0x02ca
        L_0x018b:
            r9.mo31778p(r4)     // Catch:{ NumberFormatException -> 0x02ca }
            java.util.List<com.yeelight.yeelib.g.j> r10 = r8.f17711b     // Catch:{ NumberFormatException -> 0x02ca }
            boolean r10 = r10.contains(r9)     // Catch:{ NumberFormatException -> 0x02ca }
            if (r10 != 0) goto L_0x019b
            java.util.List<com.yeelight.yeelib.g.j> r10 = r8.f17711b     // Catch:{ NumberFormatException -> 0x02ca }
            r10.add(r9)     // Catch:{ NumberFormatException -> 0x02ca }
        L_0x019b:
            com.yeelight.yeelib.f.k$e r9 = r8.f17710a     // Catch:{ NumberFormatException -> 0x02ca }
            r9.mo31658c(r4)     // Catch:{ NumberFormatException -> 0x02ca }
            com.yeelight.yeelib.f.k$e r9 = r8.f17710a     // Catch:{ NumberFormatException -> 0x02ca }
            r9.mo31659d(r4, r1)     // Catch:{ NumberFormatException -> 0x02ca }
            goto L_0x02ca
        L_0x01a7:
            java.lang.String r9 = r9.mo31767e()     // Catch:{ NumberFormatException -> 0x02ca }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ NumberFormatException -> 0x02ca }
            int r9 = r9.intValue()     // Catch:{ NumberFormatException -> 0x02ca }
            r0.mo23341q1(r9)     // Catch:{ NumberFormatException -> 0x02ca }
            goto L_0x02ca
        L_0x01b8:
            java.lang.String r9 = r9.mo31769g()     // Catch:{ NumberFormatException -> 0x02ca }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ NumberFormatException -> 0x02ca }
            int r9 = r9.intValue()     // Catch:{ NumberFormatException -> 0x02ca }
            r0.mo23345s1(r9)     // Catch:{ NumberFormatException -> 0x02ca }
            goto L_0x02ca
        L_0x01c9:
            java.lang.String r9 = r9.mo31765c()     // Catch:{ NumberFormatException -> 0x02ca }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ NumberFormatException -> 0x02ca }
        L_0x01d1:
            int r9 = r9.intValue()     // Catch:{ NumberFormatException -> 0x02ca }
            long r9 = (long) r9     // Catch:{ NumberFormatException -> 0x02ca }
            r0.mo23340p1(r9)     // Catch:{ NumberFormatException -> 0x02ca }
            goto L_0x02ca
        L_0x01db:
            java.lang.String r9 = r9.mo31764b()     // Catch:{ NumberFormatException -> 0x02ca }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ NumberFormatException -> 0x02ca }
            goto L_0x01d1
        L_0x01e4:
            r0.mo23300A1()
            goto L_0x02ca
        L_0x01e9:
            r0.mo23326b1()
            goto L_0x02ca
        L_0x01ee:
            r0.mo23334l1()
            goto L_0x02ca
        L_0x01f3:
            org.json.JSONObject r10 = r9.mo31768f()
            if (r10 != 0) goto L_0x0235
            com.yeelight.yeelib.utils.b$a r10 = new com.yeelight.yeelib.utils.b$a
            java.lang.String r0 = f17708c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Invalid command for action, user: "
            r1.append(r2)
            com.yeelight.yeelib.f.a r2 = com.yeelight.yeelib.p152f.C4201a.m11607r()
            java.lang.String r2 = r2.mo23452v()
            r1.append(r2)
            java.lang.String r2 = ", did: "
            r1.append(r2)
            java.lang.String r2 = r9.mo31771i()
            r1.append(r2)
            java.lang.String r2 = ", action: "
            r1.append(r2)
            java.lang.String r9 = r9.toString()
            r1.append(r9)
            java.lang.String r9 = r1.toString()
            r10.<init>(r0, r9)
            com.yeelight.yeelib.utils.C4310h.m12146b(r10)
            return
        L_0x0235:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Command type action, command: "
            r1.append(r2)
            java.lang.String r10 = r10.toString()
            r1.append(r10)
            r1.toString()
            if (r6 == 0) goto L_0x0252
            com.yeelight.yeelib.c.c r0 = (com.yeelight.yeelib.p150c.C5980c) r0
            r8.m23752l(r9, r0)
            goto L_0x02ca
        L_0x0252:
            r8.m23751j(r9)
            goto L_0x02ca
        L_0x0257:
            boolean r10 = r0 instanceof com.yeelight.yeelib.p150c.C6006h
            r1 = 3000(0xbb8, double:1.482E-320)
            if (r10 == 0) goto L_0x025e
            goto L_0x02b8
        L_0x025e:
            boolean r10 = r0 instanceof com.yeelight.yeelib.p150c.C5972a
            if (r10 == 0) goto L_0x02ca
            boolean r10 = r0.mo23333l0()
            r4 = 4
            if (r10 == 0) goto L_0x0284
            r9.mo31778p(r4)
            java.util.List<com.yeelight.yeelib.g.j> r10 = r8.f17711b
            boolean r10 = r10.contains(r9)
            if (r10 != 0) goto L_0x0279
        L_0x0274:
            java.util.List<com.yeelight.yeelib.g.j> r10 = r8.f17711b
            r10.add(r9)
        L_0x0279:
            com.yeelight.yeelib.f.k$e r9 = r8.f17710a
            r9.mo31658c(r4)
            com.yeelight.yeelib.f.k$e r9 = r8.f17710a
            r9.mo31659d(r4, r1)
            goto L_0x02ca
        L_0x0284:
            boolean r10 = r0.mo23416o0()
            if (r10 == 0) goto L_0x0299
            r0.mo23337n()
            r9.mo31778p(r4)
            java.util.List<com.yeelight.yeelib.g.j> r10 = r8.f17711b
            boolean r10 = r10.contains(r9)
            if (r10 != 0) goto L_0x0279
            goto L_0x0274
        L_0x0299:
            r9.mo31778p(r3)
            java.util.List<com.yeelight.yeelib.g.j> r10 = r8.f17711b
            boolean r10 = r10.contains(r9)
            if (r10 != 0) goto L_0x02a9
            java.util.List<com.yeelight.yeelib.g.j> r10 = r8.f17711b
            r10.add(r9)
        L_0x02a9:
            com.yeelight.yeelib.f.k$e r9 = r8.f17710a
            r9.mo31658c(r3)
            com.yeelight.yeelib.f.k$e r9 = r8.f17710a
            r0 = 8000(0x1f40, double:3.9525E-320)
            r9.mo31659d(r3, r0)
            goto L_0x02ca
        L_0x02b6:
            if (r10 != 0) goto L_0x02ca
        L_0x02b8:
            r9.mo31778p(r5)
            java.util.List<com.yeelight.yeelib.g.j> r10 = r8.f17711b
            r10.add(r9)
            com.yeelight.yeelib.f.k$e r9 = r8.f17710a
            r9.mo31658c(r5)
            com.yeelight.yeelib.f.k$e r9 = r8.f17710a
            r9.mo31659d(r5, r1)
        L_0x02ca:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.p152f.C9794k.mo31651d(com.yeelight.yeelib.g.j, boolean):void");
    }

    /* renamed from: f */
    public void mo31652f(String str) {
        try {
            Intent intent = new Intent();
            intent.addFlags(335544320);
            if (str != null) {
                intent.putExtra("com.yeelight.cherry.device_id", str);
            }
            intent.setClass(C4297y.f7456e, Class.forName("com.yeelight.cherry.ui.activity.MainActivity"));
            C4297y.f7456e.startActivity(intent);
        } catch (ClassNotFoundException unused) {
            C4308b.m12139r(f17708c, "MainActivity, class not found!");
        }
    }

    /* renamed from: g */
    public void mo31653g(String str) {
        try {
            Intent intent = new Intent(C4297y.f7456e, Class.forName("com.yeelight.cherry.ui.activity.RoomMainActivity"));
            intent.addFlags(335544320);
            if (str != null) {
                intent.putExtra("com.yeelight.cherry.device_id", str);
            }
            C4297y.f7456e.startActivity(intent);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: h */
    public void mo31654h(int i) {
        try {
            Intent intent = new Intent();
            intent.addFlags(335544320);
            intent.putExtra("com.yeelight.cherry.widget_id", i);
            intent.setClass(C4297y.f7456e, Class.forName("com.yeelight.cherry.ui.activity.RoomWidgetSettingActivity"));
            C4297y.f7456e.startActivity(intent);
        } catch (ClassNotFoundException unused) {
            C4308b.m12139r(f17708c, "RoomWidgetSettingActivity, class not found!");
        }
    }

    /* renamed from: k */
    public void mo26095k() {
    }

    /* renamed from: m */
    public void mo26096m(C4200i iVar) {
    }

    /* renamed from: o */
    public void mo26097o() {
    }

    /* renamed from: t */
    public void mo26104t() {
    }

    /* renamed from: y */
    public void mo26107y(int i) {
    }
}
