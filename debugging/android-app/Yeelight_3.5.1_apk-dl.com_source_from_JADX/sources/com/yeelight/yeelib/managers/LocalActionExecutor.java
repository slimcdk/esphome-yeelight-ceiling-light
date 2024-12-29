package com.yeelight.yeelib.managers;

import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.miot.api.CommonHandler;
import com.miot.api.MiotManager;
import com.miot.common.exception.MiotException;
import com.yeelight.cherry.p141ui.activity.MainActivity;
import com.yeelight.cherry.p141ui.activity.RoomMainActivity;
import com.yeelight.cherry.p141ui.activity.RoomWidgetSettingActivity;
import com.yeelight.yeelib.device.C6081a;
import com.yeelight.yeelib.device.C6119c;
import com.yeelight.yeelib.device.base.C3010c;
import com.yeelight.yeelib.device.base.C3012e;
import com.yeelight.yeelib.models.C8316i;
import com.yeelight.yeelib.utils.AppUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p051j4.C3278f;
import p237z3.C12144d;

public class LocalActionExecutor implements C12144d {

    /* renamed from: c */
    public static final String f14151c = "LocalActionExecutor";

    /* renamed from: d */
    public static LocalActionExecutor f14152d;

    /* renamed from: a */
    private C8258d f14153a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public List<C8316i> f14154b = new CopyOnWriteArrayList();

    private enum CachedMessageType {
        MESSAGE,
        EMPTY_MESSAGE
    }

    /* renamed from: com.yeelight.yeelib.managers.LocalActionExecutor$a */
    class C8255a implements CommonHandler<String> {
        C8255a(LocalActionExecutor localActionExecutor) {
        }

        /* renamed from: a */
        public void onSucceed(String str) {
            StringBuilder sb = new StringBuilder();
            sb.append("do bundle item command, onSucceed ret = ");
            sb.append(str);
        }

        public void onFailed(int i, String str) {
            StringBuilder sb = new StringBuilder();
            sb.append("do bundle item command, onFailed ret = ");
            sb.append(str);
            sb.append(", i = ");
            sb.append(i);
        }
    }

    /* renamed from: com.yeelight.yeelib.managers.LocalActionExecutor$b */
    class C8256b implements CommonHandler<String> {
        C8256b(LocalActionExecutor localActionExecutor) {
        }

        /* renamed from: a */
        public void onSucceed(String str) {
            StringBuilder sb = new StringBuilder();
            sb.append("device group, onSucceed : ");
            sb.append(str);
        }

        public void onFailed(int i, String str) {
            StringBuilder sb = new StringBuilder();
            sb.append("device group, onFailed : error : ");
            sb.append(str);
            sb.append(" , error code : ");
            sb.append(i);
        }
    }

    /* renamed from: com.yeelight.yeelib.managers.LocalActionExecutor$c */
    static /* synthetic */ class C8257c {

        /* renamed from: a */
        static final /* synthetic */ int[] f14155a;

        /* renamed from: b */
        static final /* synthetic */ int[] f14156b;

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
                com.yeelight.yeelib.managers.LocalActionExecutor$CachedMessageType[] r0 = com.yeelight.yeelib.managers.LocalActionExecutor.CachedMessageType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f14156b = r0
                r1 = 1
                com.yeelight.yeelib.managers.LocalActionExecutor$CachedMessageType r2 = com.yeelight.yeelib.managers.LocalActionExecutor.CachedMessageType.MESSAGE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f14156b     // Catch:{ NoSuchFieldError -> 0x001d }
                com.yeelight.yeelib.managers.LocalActionExecutor$CachedMessageType r3 = com.yeelight.yeelib.managers.LocalActionExecutor.CachedMessageType.EMPTY_MESSAGE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                com.yeelight.yeelib.interaction.ActionType[] r2 = com.yeelight.yeelib.interaction.ActionType.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                f14155a = r2
                com.yeelight.yeelib.interaction.ActionType r3 = com.yeelight.yeelib.interaction.ActionType.TURN_ON_ALL     // Catch:{ NoSuchFieldError -> 0x002e }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x002e }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x002e }
            L_0x002e:
                int[] r1 = f14155a     // Catch:{ NoSuchFieldError -> 0x0038 }
                com.yeelight.yeelib.interaction.ActionType r2 = com.yeelight.yeelib.interaction.ActionType.TURN_OFF_ALL     // Catch:{ NoSuchFieldError -> 0x0038 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0038 }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0038 }
            L_0x0038:
                int[] r0 = f14155a     // Catch:{ NoSuchFieldError -> 0x0043 }
                com.yeelight.yeelib.interaction.ActionType r1 = com.yeelight.yeelib.interaction.ActionType.SCENE_BUNDLE     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                int[] r0 = f14155a     // Catch:{ NoSuchFieldError -> 0x004e }
                com.yeelight.yeelib.interaction.ActionType r1 = com.yeelight.yeelib.interaction.ActionType.COMMAND     // Catch:{ NoSuchFieldError -> 0x004e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004e }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004e }
            L_0x004e:
                int[] r0 = f14155a     // Catch:{ NoSuchFieldError -> 0x0059 }
                com.yeelight.yeelib.interaction.ActionType r1 = com.yeelight.yeelib.interaction.ActionType.ON     // Catch:{ NoSuchFieldError -> 0x0059 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0059 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0059 }
            L_0x0059:
                int[] r0 = f14155a     // Catch:{ NoSuchFieldError -> 0x0064 }
                com.yeelight.yeelib.interaction.ActionType r1 = com.yeelight.yeelib.interaction.ActionType.OFF     // Catch:{ NoSuchFieldError -> 0x0064 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0064 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0064 }
            L_0x0064:
                int[] r0 = f14155a     // Catch:{ NoSuchFieldError -> 0x006f }
                com.yeelight.yeelib.interaction.ActionType r1 = com.yeelight.yeelib.interaction.ActionType.TOGGLE     // Catch:{ NoSuchFieldError -> 0x006f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006f }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006f }
            L_0x006f:
                int[] r0 = f14155a     // Catch:{ NoSuchFieldError -> 0x007b }
                com.yeelight.yeelib.interaction.ActionType r1 = com.yeelight.yeelib.interaction.ActionType.BRIGHT     // Catch:{ NoSuchFieldError -> 0x007b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x007b }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x007b }
            L_0x007b:
                int[] r0 = f14155a     // Catch:{ NoSuchFieldError -> 0x0087 }
                com.yeelight.yeelib.interaction.ActionType r1 = com.yeelight.yeelib.interaction.ActionType.BRIGHT_VARIABLE     // Catch:{ NoSuchFieldError -> 0x0087 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0087 }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0087 }
            L_0x0087:
                int[] r0 = f14155a     // Catch:{ NoSuchFieldError -> 0x0093 }
                com.yeelight.yeelib.interaction.ActionType r1 = com.yeelight.yeelib.interaction.ActionType.CT_VARIABLE     // Catch:{ NoSuchFieldError -> 0x0093 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0093 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0093 }
            L_0x0093:
                int[] r0 = f14155a     // Catch:{ NoSuchFieldError -> 0x009f }
                com.yeelight.yeelib.interaction.ActionType r1 = com.yeelight.yeelib.interaction.ActionType.COLOR_VARIABLE     // Catch:{ NoSuchFieldError -> 0x009f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x009f }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x009f }
            L_0x009f:
                int[] r0 = f14155a     // Catch:{ NoSuchFieldError -> 0x00ab }
                com.yeelight.yeelib.interaction.ActionType r1 = com.yeelight.yeelib.interaction.ActionType.SCENE     // Catch:{ NoSuchFieldError -> 0x00ab }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00ab }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00ab }
            L_0x00ab:
                int[] r0 = f14155a     // Catch:{ NoSuchFieldError -> 0x00b7 }
                com.yeelight.yeelib.interaction.ActionType r1 = com.yeelight.yeelib.interaction.ActionType.CONNECT     // Catch:{ NoSuchFieldError -> 0x00b7 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b7 }
                r2 = 13
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00b7 }
            L_0x00b7:
                int[] r0 = f14155a     // Catch:{ NoSuchFieldError -> 0x00c3 }
                com.yeelight.yeelib.interaction.ActionType r1 = com.yeelight.yeelib.interaction.ActionType.BRIGHT_UP     // Catch:{ NoSuchFieldError -> 0x00c3 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c3 }
                r2 = 14
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00c3 }
            L_0x00c3:
                int[] r0 = f14155a     // Catch:{ NoSuchFieldError -> 0x00cf }
                com.yeelight.yeelib.interaction.ActionType r1 = com.yeelight.yeelib.interaction.ActionType.BRIGHT_DOWN     // Catch:{ NoSuchFieldError -> 0x00cf }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00cf }
                r2 = 15
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00cf }
            L_0x00cf:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.managers.LocalActionExecutor.C8257c.<clinit>():void");
        }
    }

    /* renamed from: com.yeelight.yeelib.managers.LocalActionExecutor$d */
    private class C8258d extends Thread {

        /* renamed from: a */
        public Handler f14157a;

        /* renamed from: b */
        private List<C8260b> f14158b;

        /* renamed from: com.yeelight.yeelib.managers.LocalActionExecutor$d$a */
        class C8259a extends Handler {
            C8259a() {
            }

            public void handleMessage(Message message) {
                switch (message.what) {
                    case 1:
                        LocalActionExecutor.this.m19456i(1);
                        return;
                    case 2:
                        for (C8316i iVar : LocalActionExecutor.this.f14154b) {
                            if (iVar.mo35357h() == 2) {
                                LocalActionExecutor.this.mo35166d(iVar, true);
                                if (iVar.mo35357h() == 2) {
                                    LocalActionExecutor.this.f14154b.remove(iVar);
                                }
                            }
                        }
                        return;
                    case 3:
                        for (C8316i iVar2 : LocalActionExecutor.this.f14154b) {
                            if (iVar2.mo35357h() == 3) {
                                LocalActionExecutor.this.mo35166d(iVar2, true);
                                if (iVar2.mo35357h() == 3) {
                                    LocalActionExecutor.this.f14154b.remove(iVar2);
                                }
                            }
                        }
                        return;
                    case 4:
                        for (C8316i iVar3 : LocalActionExecutor.this.f14154b) {
                            if (iVar3.mo35357h() == 4) {
                                LocalActionExecutor.this.mo35166d(iVar3, true);
                                if (iVar3.mo35357h() == 4) {
                                    LocalActionExecutor.this.f14154b.remove(iVar3);
                                }
                            }
                        }
                        return;
                    case 5:
                        for (C8316i iVar4 : LocalActionExecutor.this.f14154b) {
                            if (iVar4.mo35357h() == 5) {
                                LocalActionExecutor.this.mo35166d(iVar4, true);
                                if (iVar4.mo35357h() == 5) {
                                    LocalActionExecutor.this.f14154b.remove(iVar4);
                                }
                            }
                        }
                        return;
                    case 6:
                        for (C8316i iVar5 : LocalActionExecutor.this.f14154b) {
                            if (iVar5.mo35357h() == 6) {
                                LocalActionExecutor.this.mo35166d(iVar5, true);
                                if (iVar5.mo35357h() == 6) {
                                    LocalActionExecutor.this.f14154b.remove(iVar5);
                                }
                            }
                        }
                        return;
                    default:
                        return;
                }
            }
        }

        /* renamed from: com.yeelight.yeelib.managers.LocalActionExecutor$d$b */
        private class C8260b {

            /* renamed from: a */
            CachedMessageType f14161a;

            /* renamed from: b */
            int f14162b;

            /* renamed from: c */
            Message f14163c;

            /* renamed from: d */
            boolean f14164d;

            /* renamed from: e */
            long f14165e;

            public C8260b(C8258d dVar, CachedMessageType cachedMessageType, int i, Message message, boolean z, long j) {
                this.f14161a = cachedMessageType;
                this.f14162b = i;
                this.f14163c = message;
                this.f14164d = z;
                this.f14165e = j;
            }
        }

        private C8258d() {
            this.f14158b = new ArrayList();
        }

        /* synthetic */ C8258d(LocalActionExecutor localActionExecutor, C8255a aVar) {
            this();
        }

        /* renamed from: b */
        public boolean mo35172b(int i) {
            return this.f14157a.hasMessages(i);
        }

        /* renamed from: c */
        public void mo35173c(int i) {
            Handler handler = this.f14157a;
            if (handler != null) {
                handler.removeMessages(i);
            }
        }

        /* renamed from: d */
        public void mo35174d(int i, long j) {
            Handler handler = this.f14157a;
            if (handler == null) {
                this.f14158b.add(new C8260b(this, CachedMessageType.EMPTY_MESSAGE, i, (Message) null, true, j));
                return;
            }
            handler.sendEmptyMessageDelayed(i, j);
        }

        public void run() {
            Looper.prepare();
            this.f14157a = new C8259a();
            Looper.loop();
            for (C8260b next : this.f14158b) {
                int i = C8257c.f14156b[next.f14161a.ordinal()];
                if (i != 1) {
                    if (i == 2) {
                        if (next.f14164d) {
                            this.f14157a.sendEmptyMessageDelayed(next.f14162b, next.f14165e);
                        } else {
                            this.f14157a.sendEmptyMessage(next.f14162b);
                        }
                    }
                } else if (next.f14164d) {
                    this.f14157a.sendMessageDelayed(next.f14163c, next.f14165e);
                } else {
                    this.f14157a.sendMessage(next.f14163c);
                }
            }
        }
    }

    private LocalActionExecutor() {
        C8258d dVar = new C8258d(this, (C8255a) null);
        this.f14153a = dVar;
        dVar.start();
        YeelightDeviceManager.m7800o0().mo23309q1(this);
    }

    /* renamed from: e */
    public static LocalActionExecutor m19455e() {
        if (f14152d == null) {
            f14152d = new LocalActionExecutor();
        }
        return f14152d;
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public void m19456i(int i) {
        for (C8316i next : this.f14154b) {
            if (next.mo35357h() == i) {
                this.f14154b.remove(next);
            }
        }
    }

    /* renamed from: j */
    private void m19457j(C8316i iVar) {
        if (iVar.mo35355f() == null) {
            C3278f.m8797b(new AppUtils.SuicideException(f14151c, "sendDeviceCommandType, action command is null, action type: " + iVar.mo35350a() + ", scene id: " + iVar.mo35362m() + ", action device id: = " + iVar.mo35358i() + ", user id: " + C3051a.m7925r().mo23366v() + ", parent scene id: " + iVar.mo35360k()));
            return;
        }
        String str = "/device/rpc/" + iVar.mo35358i();
        JSONObject jSONObject = new JSONObject();
        JSONObject f = iVar.mo35355f();
        try {
            String string = f.getString("method");
            JSONArray jSONArray = f.getJSONArray("params");
            jSONObject.put("did", iVar.mo35358i());
            jSONObject.put("id", 1);
            jSONObject.put("method", string);
            jSONObject.put("params", jSONArray);
            try {
                MiotManager.getDeviceManager().callSmarthomeApi(str, jSONObject, new C8255a(this));
            } catch (MiotException e) {
                e.printStackTrace();
            }
        } catch (JSONException e2) {
            StringBuilder sb = new StringBuilder();
            sb.append("do bundle item command exception:");
            sb.append(e2.toString());
        }
    }

    /* renamed from: l */
    private void m19458l(C8316i iVar, C6119c cVar) {
        StringBuilder sb = new StringBuilder();
        sb.append("do command action, command: ");
        sb.append(iVar.mo35355f().toString());
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        try {
            for (C3010c next : cVar.mo31753K1()) {
                if (!(next instanceof C6081a)) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("did", next.mo23185G());
                    jSONObject2.put("params", iVar.mo35355f().getJSONArray("params"));
                    jSONArray.put(jSONObject2);
                }
            }
            if (jSONArray.length() != 0) {
                jSONObject.put("method", iVar.mo35355f().getString("method"));
                jSONObject.put("rpcs", jSONArray);
                StringBuilder sb2 = new StringBuilder();
                sb2.append("rpcParams : ");
                sb2.append(jSONObject.toString());
                YeelightDeviceManager.m7770S(jSONObject, new C8256b(this));
            }
        } catch (JSONException unused) {
        }
    }

    /* renamed from: E */
    public void mo30149E(C3012e eVar) {
        for (C8316i next : this.f14154b) {
            if (eVar.mo23185G().equals(next.mo35358i()) && next.mo35357h() == 3) {
                StringBuilder sb = new StringBuilder();
                sb.append("Cached action device was found, execute action now! device id: ");
                sb.append(eVar.mo23185G());
                mo35166d(next, true);
            }
        }
    }

    /* renamed from: L */
    public void mo30150L() {
        if (this.f14153a.mo35172b(1) || this.f14153a.mo35172b(5)) {
            this.f14153a.mo35173c(1);
            this.f14153a.mo35173c(5);
            for (C8316i next : this.f14154b) {
                if (next.mo35357h() == 1 || next.mo35357h() == 5) {
                    mo35166d(next, true);
                    if (next.mo35357h() == 1 || next.mo35357h() == 5) {
                        this.f14154b.remove(next);
                    }
                }
            }
        }
    }

    /* renamed from: c */
    public void mo35165c(C8316i iVar) {
        mo35166d(iVar, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0264, code lost:
        if (r8.f14154b.contains(r9) == false) goto L_0x0266;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0288, code lost:
        if (r8.f14154b.contains(r9) == false) goto L_0x0266;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo35166d(com.yeelight.yeelib.models.C8316i r9, boolean r10) {
        /*
            r8 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "cached actions count: "
            r0.append(r1)
            java.util.List<com.yeelight.yeelib.models.i> r1 = r8.f14154b
            int r1 = r1.size()
            r0.append(r1)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Execute action, device id: "
            r0.append(r1)
            java.lang.String r1 = r9.mo35358i()
            r0.append(r1)
            java.lang.String r1 = ", action type: "
            r0.append(r1)
            com.yeelight.yeelib.interaction.ActionType r1 = r9.mo35350a()
            java.lang.String r1 = r1.name()
            r0.append(r1)
            java.lang.String r0 = r9.mo35358i()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r1 = 5000(0x1388, double:2.4703E-320)
            r3 = 3
            r4 = 2
            r5 = 1
            if (r0 == 0) goto L_0x0107
            int[] r0 = com.yeelight.yeelib.managers.LocalActionExecutor.C8257c.f14155a
            com.yeelight.yeelib.interaction.ActionType r6 = r9.mo35350a()
            int r6 = r6.ordinal()
            r6 = r0[r6]
            if (r6 == r5) goto L_0x0099
            if (r6 == r4) goto L_0x0099
            if (r6 == r3) goto L_0x0057
            goto L_0x02bc
        L_0x0057:
            com.yeelight.yeelib.managers.u r0 = com.yeelight.yeelib.managers.C3096u.m8175n()
            boolean r0 = r0.mo23516u()
            if (r0 == 0) goto L_0x0074
            com.yeelight.yeelib.managers.u r10 = com.yeelight.yeelib.managers.C3096u.m8175n()
            java.lang.String r9 = r9.mo35361l()
            com.yeelight.yeelib.models.t r9 = r10.mo23512o(r9)
            if (r9 == 0) goto L_0x02bc
            r9.mo35465b()
            goto L_0x02bc
        L_0x0074:
            r0 = 6
            if (r10 == 0) goto L_0x007d
            int r10 = r9.mo35357h()
            if (r10 == r0) goto L_0x02bc
        L_0x007d:
            r9.mo35365p(r0)
            java.util.List<com.yeelight.yeelib.models.i> r10 = r8.f14154b
            boolean r10 = r10.contains(r9)
            if (r10 != 0) goto L_0x008d
            java.util.List<com.yeelight.yeelib.models.i> r10 = r8.f14154b
            r10.add(r9)
        L_0x008d:
            com.yeelight.yeelib.managers.LocalActionExecutor$d r9 = r8.f14153a
            r9.mo35173c(r0)
            com.yeelight.yeelib.managers.LocalActionExecutor$d r9 = r8.f14153a
            r9.mo35174d(r0, r1)
            goto L_0x02bc
        L_0x0099:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r3 = "type: "
            r10.append(r3)
            com.yeelight.yeelib.interaction.ActionType r3 = r9.mo35350a()
            java.lang.String r3 = r3.name()
            r10.append(r3)
            com.yeelight.yeelib.managers.YeelightDeviceManager r10 = com.yeelight.yeelib.managers.YeelightDeviceManager.m7800o0()
            java.util.List r10 = r10.mo23263H0()
            int r10 = r10.size()
            if (r10 != 0) goto L_0x00de
            r10 = 5
            r9.mo35365p(r10)
            java.util.List<com.yeelight.yeelib.models.i> r0 = r8.f14154b
            r0.add(r9)
            java.util.List<com.yeelight.yeelib.models.i> r0 = r8.f14154b
            boolean r0 = r0.contains(r9)
            if (r0 != 0) goto L_0x00d2
            java.util.List<com.yeelight.yeelib.models.i> r0 = r8.f14154b
            r0.add(r9)
        L_0x00d2:
            com.yeelight.yeelib.managers.LocalActionExecutor$d r9 = r8.f14153a
            r9.mo35173c(r10)
            com.yeelight.yeelib.managers.LocalActionExecutor$d r9 = r8.f14153a
            r9.mo35174d(r10, r1)
            goto L_0x02bc
        L_0x00de:
            com.yeelight.yeelib.interaction.ActionType r9 = r9.mo35350a()
            int r9 = r9.ordinal()
            r9 = r0[r9]
            if (r9 == r5) goto L_0x00fe
            if (r9 == r4) goto L_0x00f5
            java.lang.String r9 = f14151c
            java.lang.String r10 = "Invalid action, action device id is null, but type not TURN_ON_ALL or TURN_OFF_ALL"
            com.yeelight.yeelib.utils.AppUtils.m8300u(r9, r10)
            goto L_0x02bc
        L_0x00f5:
            com.yeelight.yeelib.managers.YeelightDeviceManager r9 = com.yeelight.yeelib.managers.YeelightDeviceManager.m7800o0()
            r9.mo23261G1()
            goto L_0x02bc
        L_0x00fe:
            com.yeelight.yeelib.managers.YeelightDeviceManager r9 = com.yeelight.yeelib.managers.YeelightDeviceManager.m7800o0()
            r9.mo23267I1()
            goto L_0x02bc
        L_0x0107:
            java.lang.String r0 = r9.mo35358i()
            com.yeelight.yeelib.device.base.c r0 = com.yeelight.yeelib.managers.YeelightDeviceManager.m7794j0(r0)
            com.yeelight.yeelib.device.base.e r0 = (com.yeelight.yeelib.device.base.C3012e) r0
            if (r0 == 0) goto L_0x02a8
            boolean r6 = r0 instanceof com.yeelight.yeelib.device.C6119c
            if (r6 == 0) goto L_0x011d
            r7 = r0
            com.yeelight.yeelib.device.c r7 = (com.yeelight.yeelib.device.C6119c) r7
            r7.mo31765W1()
        L_0x011d:
            boolean r7 = r0.mo23145k0()
            if (r7 == 0) goto L_0x0249
            int[] r3 = com.yeelight.yeelib.managers.LocalActionExecutor.C8257c.f14155a
            com.yeelight.yeelib.interaction.ActionType r5 = r9.mo35350a()
            int r5 = r5.ordinal()
            r3 = r3[r5]
            switch(r3) {
                case 4: goto L_0x01e8;
                case 5: goto L_0x01e3;
                case 6: goto L_0x01de;
                case 7: goto L_0x01d9;
                case 8: goto L_0x01d0;
                case 9: goto L_0x01be;
                case 10: goto L_0x01ad;
                case 11: goto L_0x019c;
                case 12: goto L_0x0143;
                case 13: goto L_0x013e;
                case 14: goto L_0x0139;
                case 15: goto L_0x0134;
                default: goto L_0x0132;
            }
        L_0x0132:
            goto L_0x02bc
        L_0x0134:
            r0.mo23241Z0()
            goto L_0x02bc
        L_0x0139:
            r0.mo23242a1()
            goto L_0x02bc
        L_0x013e:
            r0.mo23151n()
            goto L_0x02bc
        L_0x0143:
            com.yeelight.yeelib.models.v r3 = com.yeelight.yeelib.models.C3112v.m8242u()     // Catch:{ NumberFormatException -> 0x02bc }
            java.lang.String r5 = r9.mo35362m()     // Catch:{ NumberFormatException -> 0x02bc }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ NumberFormatException -> 0x02bc }
            int r5 = r5.intValue()     // Catch:{ NumberFormatException -> 0x02bc }
            java.lang.String r6 = r0.mo23144i1()     // Catch:{ NumberFormatException -> 0x02bc }
            com.yeelight.yeelib.models.s r3 = r3.mo23567s(r5, r6)     // Catch:{ NumberFormatException -> 0x02bc }
            if (r3 != 0) goto L_0x0171
            com.yeelight.yeelib.models.v r3 = com.yeelight.yeelib.models.C3112v.m8242u()     // Catch:{ NumberFormatException -> 0x02bc }
            java.lang.String r5 = r9.mo35362m()     // Catch:{ NumberFormatException -> 0x02bc }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ NumberFormatException -> 0x02bc }
            int r5 = r5.intValue()     // Catch:{ NumberFormatException -> 0x02bc }
            com.yeelight.yeelib.models.s r3 = r3.mo23557h(r5)     // Catch:{ NumberFormatException -> 0x02bc }
        L_0x0171:
            if (r3 == 0) goto L_0x0178
            r0.mo23168x1(r3)     // Catch:{ NumberFormatException -> 0x02bc }
            goto L_0x02bc
        L_0x0178:
            if (r10 == 0) goto L_0x0180
            int r10 = r9.mo35357h()     // Catch:{ NumberFormatException -> 0x02bc }
            if (r10 == r4) goto L_0x02bc
        L_0x0180:
            r9.mo35365p(r4)     // Catch:{ NumberFormatException -> 0x02bc }
            java.util.List<com.yeelight.yeelib.models.i> r10 = r8.f14154b     // Catch:{ NumberFormatException -> 0x02bc }
            boolean r10 = r10.contains(r9)     // Catch:{ NumberFormatException -> 0x02bc }
            if (r10 != 0) goto L_0x0190
            java.util.List<com.yeelight.yeelib.models.i> r10 = r8.f14154b     // Catch:{ NumberFormatException -> 0x02bc }
            r10.add(r9)     // Catch:{ NumberFormatException -> 0x02bc }
        L_0x0190:
            com.yeelight.yeelib.managers.LocalActionExecutor$d r9 = r8.f14153a     // Catch:{ NumberFormatException -> 0x02bc }
            r9.mo35173c(r4)     // Catch:{ NumberFormatException -> 0x02bc }
            com.yeelight.yeelib.managers.LocalActionExecutor$d r9 = r8.f14153a     // Catch:{ NumberFormatException -> 0x02bc }
            r9.mo35174d(r4, r1)     // Catch:{ NumberFormatException -> 0x02bc }
            goto L_0x02bc
        L_0x019c:
            java.lang.String r9 = r9.mo35354e()     // Catch:{ NumberFormatException -> 0x02bc }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ NumberFormatException -> 0x02bc }
            int r9 = r9.intValue()     // Catch:{ NumberFormatException -> 0x02bc }
            r0.mo23155q1(r9)     // Catch:{ NumberFormatException -> 0x02bc }
            goto L_0x02bc
        L_0x01ad:
            java.lang.String r9 = r9.mo35356g()     // Catch:{ NumberFormatException -> 0x02bc }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ NumberFormatException -> 0x02bc }
            int r9 = r9.intValue()     // Catch:{ NumberFormatException -> 0x02bc }
            r0.mo23159s1(r9)     // Catch:{ NumberFormatException -> 0x02bc }
            goto L_0x02bc
        L_0x01be:
            java.lang.String r9 = r9.mo35352c()     // Catch:{ NumberFormatException -> 0x02bc }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ NumberFormatException -> 0x02bc }
        L_0x01c6:
            int r9 = r9.intValue()     // Catch:{ NumberFormatException -> 0x02bc }
            long r9 = (long) r9     // Catch:{ NumberFormatException -> 0x02bc }
            r0.mo23154p1(r9)     // Catch:{ NumberFormatException -> 0x02bc }
            goto L_0x02bc
        L_0x01d0:
            java.lang.String r9 = r9.mo35351b()     // Catch:{ NumberFormatException -> 0x02bc }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ NumberFormatException -> 0x02bc }
            goto L_0x01c6
        L_0x01d9:
            r0.mo23114A1()
            goto L_0x02bc
        L_0x01de:
            r0.mo23140b1()
            goto L_0x02bc
        L_0x01e3:
            r0.mo23148l1()
            goto L_0x02bc
        L_0x01e8:
            org.json.JSONObject r10 = r9.mo35355f()
            if (r10 != 0) goto L_0x022a
            com.yeelight.yeelib.utils.AppUtils$SuicideException r10 = new com.yeelight.yeelib.utils.AppUtils$SuicideException
            java.lang.String r0 = f14151c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Invalid command for action, user: "
            r1.append(r2)
            com.yeelight.yeelib.managers.a r2 = com.yeelight.yeelib.managers.C3051a.m7925r()
            java.lang.String r2 = r2.mo23366v()
            r1.append(r2)
            java.lang.String r2 = ", did: "
            r1.append(r2)
            java.lang.String r2 = r9.mo35358i()
            r1.append(r2)
            java.lang.String r2 = ", action: "
            r1.append(r2)
            java.lang.String r9 = r9.toString()
            r1.append(r9)
            java.lang.String r9 = r1.toString()
            r10.<init>(r0, r9)
            p051j4.C3278f.m8797b(r10)
            return
        L_0x022a:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Command type action, command: "
            r1.append(r2)
            java.lang.String r10 = r10.toString()
            r1.append(r10)
            if (r6 == 0) goto L_0x0244
            com.yeelight.yeelib.device.c r0 = (com.yeelight.yeelib.device.C6119c) r0
            r8.m19458l(r9, r0)
            goto L_0x02bc
        L_0x0244:
            r8.m19457j(r9)
            goto L_0x02bc
        L_0x0249:
            boolean r10 = r0 instanceof com.yeelight.yeelib.device.WifiDeviceBase
            r1 = 3000(0xbb8, double:1.482E-320)
            if (r10 == 0) goto L_0x0250
            goto L_0x02aa
        L_0x0250:
            boolean r10 = r0 instanceof com.yeelight.yeelib.device.C6081a
            if (r10 == 0) goto L_0x02bc
            boolean r10 = r0.mo23147l0()
            r4 = 4
            if (r10 == 0) goto L_0x0276
            r9.mo35365p(r4)
            java.util.List<com.yeelight.yeelib.models.i> r10 = r8.f14154b
            boolean r10 = r10.contains(r9)
            if (r10 != 0) goto L_0x026b
        L_0x0266:
            java.util.List<com.yeelight.yeelib.models.i> r10 = r8.f14154b
            r10.add(r9)
        L_0x026b:
            com.yeelight.yeelib.managers.LocalActionExecutor$d r9 = r8.f14153a
            r9.mo35173c(r4)
            com.yeelight.yeelib.managers.LocalActionExecutor$d r9 = r8.f14153a
            r9.mo35174d(r4, r1)
            goto L_0x02bc
        L_0x0276:
            boolean r10 = r0.mo23230o0()
            if (r10 == 0) goto L_0x028b
            r0.mo23151n()
            r9.mo35365p(r4)
            java.util.List<com.yeelight.yeelib.models.i> r10 = r8.f14154b
            boolean r10 = r10.contains(r9)
            if (r10 != 0) goto L_0x026b
            goto L_0x0266
        L_0x028b:
            r9.mo35365p(r3)
            java.util.List<com.yeelight.yeelib.models.i> r10 = r8.f14154b
            boolean r10 = r10.contains(r9)
            if (r10 != 0) goto L_0x029b
            java.util.List<com.yeelight.yeelib.models.i> r10 = r8.f14154b
            r10.add(r9)
        L_0x029b:
            com.yeelight.yeelib.managers.LocalActionExecutor$d r9 = r8.f14153a
            r9.mo35173c(r3)
            com.yeelight.yeelib.managers.LocalActionExecutor$d r9 = r8.f14153a
            r0 = 8000(0x1f40, double:3.9525E-320)
            r9.mo35174d(r3, r0)
            goto L_0x02bc
        L_0x02a8:
            if (r10 != 0) goto L_0x02bc
        L_0x02aa:
            r9.mo35365p(r5)
            java.util.List<com.yeelight.yeelib.models.i> r10 = r8.f14154b
            r10.add(r9)
            com.yeelight.yeelib.managers.LocalActionExecutor$d r9 = r8.f14153a
            r9.mo35173c(r5)
            com.yeelight.yeelib.managers.LocalActionExecutor$d r9 = r8.f14153a
            r9.mo35174d(r5, r1)
        L_0x02bc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.managers.LocalActionExecutor.mo35166d(com.yeelight.yeelib.models.i, boolean):void");
    }

    /* renamed from: f */
    public void mo35167f(String str) {
        try {
            Intent intent = new Intent();
            intent.addFlags(335544320);
            if (str != null) {
                intent.putExtra("com.yeelight.cherry.device_id", str);
            }
            int i = MainActivity.f10688y;
            intent.setClass(C3108x.f4951e, MainActivity.class);
            C3108x.f4951e.startActivity(intent);
        } catch (ClassNotFoundException unused) {
            AppUtils.m8300u(f14151c, "MainActivity, class not found!");
        }
    }

    /* renamed from: g */
    public void mo35168g(String str) {
        try {
            int i = RoomMainActivity.f11243d;
            Intent intent = new Intent(C3108x.f4951e, RoomMainActivity.class);
            intent.addFlags(335544320);
            if (str != null) {
                intent.putExtra("com.yeelight.cherry.device_id", str);
            }
            C3108x.f4951e.startActivity(intent);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: h */
    public void mo35169h(int i) {
        try {
            Intent intent = new Intent();
            intent.addFlags(335544320);
            intent.putExtra("com.yeelight.cherry.widget_id", i);
            int i2 = RoomWidgetSettingActivity.f11272e;
            intent.setClass(C3108x.f4951e, RoomWidgetSettingActivity.class);
            C3108x.f4951e.startActivity(intent);
        } catch (ClassNotFoundException unused) {
            AppUtils.m8300u(f14151c, "RoomWidgetSettingActivity, class not found!");
        }
    }

    /* renamed from: k */
    public void mo30151k() {
    }

    /* renamed from: m */
    public void mo30152m(C3012e eVar) {
    }

    /* renamed from: o */
    public void mo30153o() {
    }

    /* renamed from: t */
    public void mo30160t() {
    }

    /* renamed from: y */
    public void mo30163y(int i) {
    }
}
