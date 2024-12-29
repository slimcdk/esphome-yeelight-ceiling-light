package com.yeelight.yeelib.p152f;

import android.accounts.OperationCanceledException;
import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.AsyncTask;
import android.text.TextUtils;
import com.miot.api.CommonHandler;
import com.miot.api.Constants;
import com.miot.api.MiotManager;
import com.miot.bluetooth.channel.packet.Packet;
import com.miot.common.exception.MiotException;
import com.miot.common.people.People;
import com.miot.common.people.PeopleFactory;
import com.miot.service.common.miotcloud.MiotAppPath;
import com.xiaomi.account.openauth.AuthorizeActivityBase;
import com.xiaomi.account.openauth.XMAuthericationException;
import com.xiaomi.account.openauth.XiaomiOAuthConstants;
import com.xiaomi.account.openauth.XiaomiOAuthFuture;
import com.xiaomi.account.openauth.XiaomiOAuthResults;
import com.xiaomi.account.openauth.XiaomiOAuthorize;
import com.yeelight.yeelib.p187h.C9862d;
import com.yeelight.yeelib.p187h.p189h.C9874b;
import com.yeelight.yeelib.utils.C10551r;
import com.yeelight.yeelib.utils.C10559w;
import com.yeelight.yeelib.utils.C4308b;
import com.yeelight.yeelib.utils.C4310h;
import com.yeelight.yeelib.utils.C4311i;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.yeelight.yeelib.f.a */
public class C4201a {
    /* access modifiers changed from: private */

    /* renamed from: m */
    public static final String f7262m = "a";

    /* renamed from: n */
    private static C4201a f7263n = null;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public static boolean f7264o = false;

    /* renamed from: a */
    private Context f7265a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C4211j f7266b = new C4211j(this, (C4203a) null);
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final List<C4202i> f7267c = new CopyOnWriteArrayList();

    /* renamed from: d */
    private String f7268d;

    /* renamed from: e */
    private String f7269e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public String f7270f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public String f7271g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public long f7272h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public Long f7273i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public String f7274j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public String f7275k;

    /* renamed from: l */
    private BroadcastReceiver f7276l = new C4203a();

    /* renamed from: com.yeelight.yeelib.f.a$i */
    public interface C4202i {
        /* renamed from: C */
        void mo23456C(C4212k kVar);

        /* renamed from: H */
        void mo23457H();

        /* renamed from: d */
        void mo23458d();

        /* renamed from: g */
        void mo23459g();

        /* renamed from: i */
        void mo23460i();

        /* renamed from: l */
        void mo23461l();

        /* renamed from: q */
        void mo23462q(String str);

        /* renamed from: r */
        void mo23463r(String str);
    }

    /* renamed from: com.yeelight.yeelib.f.a$a */
    class C4203a extends BroadcastReceiver {
        C4203a() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x002b  */
        /* JADX WARNING: Removed duplicated region for block: B:14:0x0032  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onReceive(android.content.Context r3, android.content.Intent r4) {
            /*
                r2 = this;
                java.lang.String r3 = r4.getAction()
                int r4 = r3.hashCode()
                r0 = -802226915(0xffffffffd02efd1d, float:-1.17432945E10)
                r1 = 1
                if (r4 == r0) goto L_0x001e
                r0 = 414943714(0x18bb89e2, float:4.8477593E-24)
                if (r4 == r0) goto L_0x0014
                goto L_0x0028
            L_0x0014:
                java.lang.String r4 = "com.yeelight.cherry.action.BIND_SERVICE_FAILED"
                boolean r3 = r3.equals(r4)
                if (r3 == 0) goto L_0x0028
                r3 = 1
                goto L_0x0029
            L_0x001e:
                java.lang.String r4 = "com.yeelight.cherry.action.BIND_SERVICE_SUCCEED"
                boolean r3 = r3.equals(r4)
                if (r3 == 0) goto L_0x0028
                r3 = 0
                goto L_0x0029
            L_0x0028:
                r3 = -1
            L_0x0029:
                if (r3 == 0) goto L_0x0032
                if (r3 == r1) goto L_0x002e
                goto L_0x007d
            L_0x002e:
                java.lang.String unused = com.yeelight.yeelib.p152f.C4201a.f7262m
                goto L_0x007d
            L_0x0032:
                java.lang.String unused = com.yeelight.yeelib.p152f.C4201a.f7262m
                boolean unused = com.yeelight.yeelib.p152f.C4201a.f7264o = r1
                boolean r3 = com.yeelight.yeelib.p152f.C4201a.m11610z()
                if (r3 == 0) goto L_0x007d
                com.yeelight.yeelib.f.a r3 = com.yeelight.yeelib.p152f.C4201a.this
                r3.mo23455y()
                com.yeelight.yeelib.f.a r3 = com.yeelight.yeelib.p152f.C4201a.this
                r3.m11588F()
                com.yeelight.yeelib.f.l r3 = com.yeelight.yeelib.p152f.C4230l.m11766b()
                java.lang.String r3 = r3.mo23552a()
                boolean r3 = r3.isEmpty()
                if (r3 == 0) goto L_0x005f
                com.yeelight.yeelib.f.l r3 = com.yeelight.yeelib.p152f.C4230l.m11766b()
                com.miot.common.config.AppConfiguration$Locale r4 = com.miot.common.config.AppConfiguration.Locale.cn
                r3.mo23555f(r4)
            L_0x005f:
                boolean r3 = com.yeelight.yeelib.utils.C4308b.f7482a
                if (r3 != 0) goto L_0x006e
                com.yeelight.yeelib.f.l r3 = com.yeelight.yeelib.p152f.C4230l.m11766b()
                java.lang.String r3 = r3.mo23552a()
                com.yeelight.yeelib.utils.C4311i.m12152c(r3)
            L_0x006e:
                com.yeelight.yeelib.f.a r3 = com.yeelight.yeelib.p152f.C4201a.this
                r3.mo23446m()
                com.yeelight.yeelib.f.a r3 = com.yeelight.yeelib.p152f.C4201a.this
                com.yeelight.yeelib.f.a$j r3 = r3.f7266b
                r4 = 2
                r3.mo23483b(r4)
            L_0x007d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.p152f.C4201a.C4203a.onReceive(android.content.Context, android.content.Intent):void");
        }
    }

    /* renamed from: com.yeelight.yeelib.f.a$b */
    class C4204b extends AsyncTask<Void, Void, XiaomiOAuthResults> {

        /* renamed from: a */
        Exception f7278a;

        /* renamed from: b */
        final /* synthetic */ XiaomiOAuthFuture f7279b;

        /* renamed from: c */
        final /* synthetic */ boolean f7280c;

        C4204b(XiaomiOAuthFuture xiaomiOAuthFuture, boolean z) {
            this.f7279b = xiaomiOAuthFuture;
            this.f7280c = z;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public XiaomiOAuthResults doInBackground(Void... voidArr) {
            try {
                return (XiaomiOAuthResults) this.f7279b.getResult();
            } catch (OperationCanceledException | XMAuthericationException | IOException e) {
                this.f7278a = e;
                return null;
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void onPostExecute(XiaomiOAuthResults xiaomiOAuthResults) {
            if (xiaomiOAuthResults != null) {
                String unused = C4201a.f7262m;
                C4201a.this.mo23442H(xiaomiOAuthResults, this.f7280c);
            } else if (this.f7278a != null) {
                boolean z = this.f7280c;
                String unused2 = C4201a.f7262m;
                if (z) {
                    for (C4202i H : C4201a.this.f7267c) {
                        H.mo23457H();
                    }
                    return;
                }
                C4201a.this.f7266b.mo23483b(3);
                for (C4202i q : C4201a.this.f7267c) {
                    q.mo23462q(this.f7278a.getMessage());
                }
            } else {
                String unused3 = C4201a.f7262m;
                String a = C4201a.f7262m;
                C4310h.m12146b(new C4308b.C4309a(a, "No result and no exception! fast oauth? " + this.f7280c));
                boolean z2 = this.f7280c;
                String unused4 = C4201a.f7262m;
                if (z2) {
                    for (C4202i H2 : C4201a.this.f7267c) {
                        H2.mo23457H();
                    }
                    return;
                }
                C4201a.this.f7266b.mo23483b(3);
                for (C4202i q2 : C4201a.this.f7267c) {
                    q2.mo23462q("Error! Empty result for login request.");
                }
            }
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
        }
    }

    /* renamed from: com.yeelight.yeelib.f.a$c */
    class C4205c extends AsyncTask<Void, Void, String> {

        /* renamed from: a */
        Exception f7282a;

        /* renamed from: b */
        final /* synthetic */ XiaomiOAuthFuture f7283b;

        C4205c(XiaomiOAuthFuture xiaomiOAuthFuture) {
            this.f7283b = xiaomiOAuthFuture;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public String doInBackground(Void... voidArr) {
            try {
                return (String) this.f7283b.getResult();
            } catch (OperationCanceledException | XMAuthericationException | IOException e) {
                this.f7282a = e;
                return null;
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void onPostExecute(String str) {
            if (str != null) {
                String unused = C4201a.f7262m;
                C4201a.this.mo23443I(str);
                return;
            }
            Exception exc = this.f7282a;
            String unused2 = C4201a.f7262m;
            if (exc != null) {
                C4201a.this.f7266b.mo23483b(3);
                for (C4202i r : C4201a.this.f7267c) {
                    r.mo23463r(this.f7282a.getMessage());
                }
                return;
            }
            C4310h.m12146b(new C4308b.C4309a(C4201a.f7262m, "No result and no exception for user profile request "));
            C4201a.this.f7266b.mo23483b(3);
            for (C4202i r2 : C4201a.this.f7267c) {
                r2.mo23463r("Error! Empty result for user profile.");
            }
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
        }
    }

    /* renamed from: com.yeelight.yeelib.f.a$d */
    class C4206d implements C9874b<String> {
        C4206d() {
        }

        /* renamed from: b */
        public void mo23475a(String str) {
            String unused = C4201a.f7262m;
            "getTokenByCode onSuccess, return result: " + str;
            if (str != null) {
                str = str.replace("&&&START&&&", "");
            }
            try {
                JSONObject jSONObject = new JSONObject(str);
                String unused2 = C4201a.this.f7270f = jSONObject.getString(XiaomiOAuthConstants.EXTRA_ACCESS_TOKEN_2);
                String unused3 = C4201a.this.f7271g = jSONObject.getString("refresh_token");
                String string = jSONObject.getString(XiaomiOAuthConstants.EXTRA_EXPIRES_IN_2);
                Long unused4 = C4201a.this.f7273i = Long.valueOf((string == null ? 7776000 : Long.parseLong(string)) + (System.currentTimeMillis() / 1000));
                String unused5 = C4201a.this.f7274j = jSONObject.getString(XiaomiOAuthConstants.EXTRA_MAC_KEY_2);
                String unused6 = C4201a.this.f7275k = jSONObject.getString(XiaomiOAuthConstants.EXTRA_MAC_ALGORITHM_2);
                long unused7 = C4201a.this.f7272h = System.currentTimeMillis();
                C4201a.this.mo23454x();
            } catch (JSONException e) {
                C4201a.this.f7266b.mo23483b(3);
                e.printStackTrace();
                for (C4202i q : C4201a.this.f7267c) {
                    q.mo23462q(e.getMessage());
                }
            }
        }

        public void onFailure(int i, String str) {
            String unused = C4201a.f7262m;
            "getTokenByCode onFailure, errorCode : " + i + ", message = " + str;
            C4201a.this.f7266b.mo23483b(3);
            for (C4202i q : C4201a.this.f7267c) {
                q.mo23462q(str);
            }
        }
    }

    /* renamed from: com.yeelight.yeelib.f.a$e */
    class C4207e implements C9874b<String> {
        C4207e() {
        }

        /* renamed from: b */
        public void mo23475a(String str) {
            String unused = C4201a.f7262m;
            "refreshToken onSuccess, return result: " + str;
            try {
                if (1 == new JSONObject(str).getInt("code")) {
                    String unused2 = C4201a.f7262m;
                    JSONObject jSONObject = new JSONObject(str).getJSONObject(Constants.EXTRA_PUSH_MESSAGE);
                    String unused3 = C4201a.this.f7270f = jSONObject.getString(XiaomiOAuthConstants.EXTRA_ACCESS_TOKEN_2);
                    String string = jSONObject.getString(XiaomiOAuthConstants.EXTRA_EXPIRES_IN_2);
                    Long unused4 = C4201a.this.f7273i = Long.valueOf((string == null ? 7776000 : Long.parseLong(string)) + (System.currentTimeMillis() / 1000));
                    String unused5 = C4201a.this.f7274j = jSONObject.getString(XiaomiOAuthConstants.EXTRA_MAC_KEY_2);
                    String unused6 = C4201a.this.f7275k = jSONObject.getString(XiaomiOAuthConstants.EXTRA_MAC_ALGORITHM_2);
                    long unused7 = C4201a.this.f7272h = System.currentTimeMillis();
                    C4201a.this.m11592O();
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }

        public void onFailure(int i, String str) {
            String unused = C4201a.f7262m;
            "refreshTokenOnYeelightServer onFailure, errorCode : " + i + ", message = " + str;
        }
    }

    /* renamed from: com.yeelight.yeelib.f.a$f */
    class C4208f implements C9874b<String> {
        C4208f() {
        }

        /* renamed from: b */
        public void mo23475a(String str) {
            String unused = C4201a.f7262m;
            "refreshToken onSuccess, return result: " + str;
            if (str != null) {
                try {
                    str = str.replace("&&&START&&&", "");
                } catch (JSONException e) {
                    e.printStackTrace();
                    return;
                }
            }
            String unused2 = C4201a.f7262m;
            JSONObject jSONObject = new JSONObject(str);
            String unused3 = C4201a.this.f7270f = jSONObject.getString(XiaomiOAuthConstants.EXTRA_ACCESS_TOKEN_2);
            String unused4 = C4201a.this.f7271g = jSONObject.getString("refresh_token");
            String string = jSONObject.getString(XiaomiOAuthConstants.EXTRA_EXPIRES_IN_2);
            Long unused5 = C4201a.this.f7273i = Long.valueOf((string == null ? 7776000 : Long.parseLong(string)) + (System.currentTimeMillis() / 1000));
            String unused6 = C4201a.this.f7274j = jSONObject.getString(XiaomiOAuthConstants.EXTRA_MAC_KEY_2);
            String unused7 = C4201a.this.f7275k = jSONObject.getString(XiaomiOAuthConstants.EXTRA_MAC_ALGORITHM_2);
            long unused8 = C4201a.this.f7272h = System.currentTimeMillis();
            C4201a.this.m11592O();
        }

        public void onFailure(int i, String str) {
            String unused = C4201a.f7262m;
            "refreshTokenOnMiServer onFailure, errorCode : " + i + ", message = " + str;
        }
    }

    /* renamed from: com.yeelight.yeelib.f.a$g */
    class C4209g implements C9874b<String> {
        C4209g(C4201a aVar) {
        }

        /* renamed from: b */
        public void mo23475a(String str) {
            String unused = C4201a.f7262m;
        }

        public void onFailure(int i, String str) {
            String unused = C4201a.f7262m;
            "Send single log onFailure! exception msg = " + str;
        }
    }

    /* renamed from: com.yeelight.yeelib.f.a$h */
    class C4210h implements CommonHandler<String> {
        C4210h() {
        }

        /* renamed from: a */
        public void onSucceed(String str) {
            String unused = C4201a.f7262m;
            "getUserAccountInfo, onSucceed : address : " + str;
            try {
                JSONObject jSONObject = new JSONObject(str).getJSONObject("result");
                String str2 = "";
                if (jSONObject.getString("avatarUrl").contains("size_320")) {
                    str2 = jSONObject.getJSONObject("avatarUrl").getString("size_320");
                }
                String string = jSONObject.getString("miId");
                String string2 = jSONObject.getString("nickname");
                for (C4202i C : C4201a.this.f7267c) {
                    C.mo23456C(new C4212k(C4201a.this, string, string2, str2));
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }

        public void onFailed(int i, String str) {
            String unused = C4201a.f7262m;
            "onFailed : error : " + str + " , error code : " + i;
            for (C4202i r : C4201a.this.f7267c) {
                r.mo23463r(str);
            }
        }
    }

    /* renamed from: com.yeelight.yeelib.f.a$j */
    private class C4211j {

        /* renamed from: a */
        private int f7289a;

        private C4211j(C4201a aVar) {
            this.f7289a = -1;
        }

        /* synthetic */ C4211j(C4201a aVar, C4203a aVar2) {
            this(aVar);
        }

        /* renamed from: a */
        public int mo23482a() {
            return this.f7289a;
        }

        /* renamed from: b */
        public void mo23483b(int i) {
            this.f7289a = i;
        }
    }

    /* renamed from: com.yeelight.yeelib.f.a$k */
    public class C4212k {

        /* renamed from: a */
        private String f7290a;

        /* renamed from: b */
        private String f7291b;

        /* renamed from: c */
        private String f7292c;

        public C4212k(C4201a aVar, String str, String str2, String str3) {
            this.f7290a = str;
            this.f7291b = str2;
            this.f7292c = str3;
        }

        /* renamed from: a */
        public String mo23484a() {
            return this.f7292c;
        }

        /* renamed from: b */
        public String mo23485b() {
            return this.f7290a;
        }

        /* renamed from: c */
        public String mo23486c() {
            return this.f7291b;
        }
    }

    private C4201a() {
        if (this.f7265a != null) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("com.yeelight.cherry.action.BIND_SERVICE_SUCCEED");
            intentFilter.addAction("com.yeelight.cherry.action.BIND_SERVICE_FAILED");
            this.f7265a.registerReceiver(this.f7276l, intentFilter);
        }
    }

    private C4201a(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.yeelight.cherry.action.BIND_SERVICE_SUCCEED");
        intentFilter.addAction("com.yeelight.cherry.action.BIND_SERVICE_FAILED");
        context.registerReceiver(this.f7276l, intentFilter);
        this.f7265a = context;
    }

    /* renamed from: E */
    private void m11587E() {
        for (C4202i l : this.f7267c) {
            l.mo23461l();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: F */
    public void m11588F() {
        C10551r.m25781m(new C4209g(this));
        for (C4202i i : this.f7267c) {
            i.mo23460i();
        }
    }

    /* renamed from: J */
    private void m11589J() {
        if (TextUtils.isEmpty(this.f7271g)) {
            m11591L();
        } else {
            m11590K();
        }
    }

    /* renamed from: K */
    private void m11590K() {
        HashMap hashMap = new HashMap();
        hashMap.put("client_id", String.valueOf(2882303761517308695L));
        hashMap.put(AuthorizeActivityBase.KEY_REDIRECT_URI, C4308b.f7496o);
        hashMap.put("client_secret", "OrwZHJ/drEXakH1LsfwwqQ==");
        hashMap.put("grant_type", "refresh_token");
        hashMap.put("refresh_token", this.f7271g);
        String str = C4308b.f7495n;
        "refreshToken url: " + str;
        C9862d.m24140j(str, hashMap, (Map<String, String>) null, (String) null, String.class, new C4208f(), false);
    }

    /* renamed from: L */
    private void m11591L() {
        HashMap hashMap = new HashMap();
        hashMap.put("type", "yeelight-android");
        hashMap.put("accessToken", this.f7270f);
        String str = C10559w.m25810f("REFRESH_TOKEN_BASE_URL", "https://cloud-us.yeelight.com/") + "mi_oauth/refresh_token";
        "refreshToken url: " + str;
        C9862d.m24140j(str, hashMap, (Map<String, String>) null, (String) null, String.class, new C4207e(), false);
    }

    /* access modifiers changed from: private */
    /* renamed from: O */
    public void m11592O() {
        People people = MiotManager.getPeople();
        People createOauthPeople = PeopleFactory.createOauthPeople(this.f7270f, this.f7268d, this.f7273i.longValue(), this.f7274j, this.f7275k);
        createOauthPeople.setRefreshToken(this.f7271g);
        createOauthPeople.setUserName(this.f7269e);
        createOauthPeople.setIcon(people.getIcon());
        createOauthPeople.setIcon75(people.getIcon75());
        createOauthPeople.setIcon90(people.getIcon90());
        createOauthPeople.setIcon120(people.getIcon120());
        createOauthPeople.setIcon320(people.getIcon320());
        if (MiotManager.getPeopleManager() == null) {
            C10551r.m25778j();
            return;
        }
        try {
            MiotManager.getPeopleManager().savePeople(createOauthPeople);
        } catch (MiotException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: P */
    private void m11593P(XiaomiOAuthFuture<XiaomiOAuthResults> xiaomiOAuthFuture, boolean z) {
        new C4204b(xiaomiOAuthFuture, z).execute(new Void[0]);
    }

    /* renamed from: Q */
    private void m11594Q(XiaomiOAuthFuture<String> xiaomiOAuthFuture) {
        new C4205c(xiaomiOAuthFuture).execute(new Void[0]);
    }

    /* renamed from: r */
    public static C4201a m11607r() {
        synchronized (C4201a.class) {
            if (f7263n == null) {
                f7263n = new C4201a();
            }
        }
        return f7263n;
    }

    /* renamed from: s */
    public static C4201a m11608s(Context context) {
        synchronized (C4201a.class) {
            if (f7263n == null) {
                f7263n = new C4201a(context);
            }
        }
        return f7263n;
    }

    /* renamed from: t */
    private void m11609t(String str) {
        "getTokenByCode , code = " + str;
        HashMap hashMap = new HashMap();
        hashMap.put("client_id", String.valueOf(2882303761517308695L));
        hashMap.put(AuthorizeActivityBase.KEY_REDIRECT_URI, C4308b.f7496o);
        hashMap.put("client_secret", "OrwZHJ/drEXakH1LsfwwqQ==");
        hashMap.put("grant_type", "authorization_code");
        hashMap.put("code", str);
        String str2 = C4308b.f7495n;
        "getTokenByCode url: " + str2;
        C9862d.m24135e(str2, hashMap, (Map<String, String>) null, String.class, new C4206d(), false);
    }

    /* renamed from: z */
    public static boolean m11610z() {
        return MiotManager.getPeopleManager() != null && MiotManager.getPeopleManager().isLogin();
    }

    /* renamed from: A */
    public boolean mo23437A() {
        return f7264o;
    }

    /* renamed from: B */
    public int mo23438B(Activity activity) {
        return mo23439C(activity, false);
    }

    /* renamed from: C */
    public int mo23439C(Activity activity, boolean z) {
        m11593P(new XiaomiOAuthorize().setAppId(2882303761517308695L).setRedirectUrl("http://www.mi.com").setNoMiui(true).setScope((int[]) null).startGetOAuthCode(activity), false);
        return 0;
    }

    /* renamed from: D */
    public void mo23440D() {
        m11587E();
        try {
            MiotManager.getPeopleManager().deletePeople();
        } catch (MiotException e) {
            e.printStackTrace();
        }
        mo23447n();
        mo23441G();
        C4308b.f7489h = true;
        this.f7266b.mo23483b(-1);
    }

    /* renamed from: G */
    public void mo23441G() {
        for (C4202i g : this.f7267c) {
            g.mo23459g();
        }
    }

    /* renamed from: H */
    public void mo23442H(XiaomiOAuthResults xiaomiOAuthResults, boolean z) {
        if (xiaomiOAuthResults.hasError()) {
            int errorCode = xiaomiOAuthResults.getErrorCode();
            String errorMessage = xiaomiOAuthResults.getErrorMessage();
            "oauth error, notify onLoginFailed! error code: " + errorCode + ", error message: " + errorMessage;
            for (C4202i next : this.f7267c) {
                if (z) {
                    next.mo23457H();
                } else {
                    this.f7266b.mo23483b(3);
                    next.mo23462q(errorMessage);
                }
            }
            return;
        }
        this.f7266b.mo23483b(0);
        for (C4202i d : this.f7267c) {
            d.mo23458d();
        }
        m11609t(xiaomiOAuthResults.getCode());
    }

    /* renamed from: I */
    public void mo23443I(String str) {
        "process user profile result: " + str;
        try {
            JSONObject jSONObject = new JSONObject(str).getJSONObject(Packet.DATA);
            this.f7268d = jSONObject.getString("userId");
            this.f7269e = jSONObject.getString("miliaoNick");
            String string = jSONObject.getString("miliaoIcon");
            String string2 = jSONObject.getString("miliaoIcon_75");
            String string3 = jSONObject.getString("miliaoIcon_90");
            String string4 = jSONObject.getString("miliaoIcon_120");
            String string5 = jSONObject.getString("miliaoIcon_320");
            People createOauthPeople = PeopleFactory.createOauthPeople(this.f7270f, this.f7268d, this.f7273i.longValue(), this.f7274j, this.f7275k);
            createOauthPeople.setRefreshToken(this.f7271g);
            createOauthPeople.setUserName(this.f7269e);
            createOauthPeople.setIcon(string);
            createOauthPeople.setIcon75(string2);
            createOauthPeople.setIcon90(string3);
            createOauthPeople.setIcon120(string4);
            createOauthPeople.setIcon320(string5);
            if (MiotManager.getPeopleManager() == null) {
                C10551r.m25778j();
            } else {
                MiotManager.getPeopleManager().savePeople(createOauthPeople);
            }
            C4308b.m12138q(this.f7270f, this.f7268d, this.f7272h);
            if (!C4308b.f7482a) {
                C4310h.m12149e(this.f7268d);
            }
            m11588F();
            if (!C4308b.f7482a) {
                C4311i.m12152c(C4230l.m11766b().mo23552a());
            }
        } catch (MiotException | JSONException e) {
            this.f7266b.mo23483b(3);
            e.printStackTrace();
        }
    }

    /* renamed from: M */
    public void mo23444M(C4202i iVar) {
        if (this.f7267c.contains(iVar)) {
            C4308b.m12139r(f7262m, "Invalid listener, already in list");
            return;
        }
        this.f7267c.add(iVar);
        if (m11610z()) {
            iVar.mo23460i();
        } else if (f7264o) {
            if (this.f7266b.mo23482a() == 0 || this.f7266b.mo23482a() == 1) {
                iVar.mo23458d();
            } else if (this.f7266b.mo23482a() == 3) {
                iVar.mo23462q("");
            }
        }
    }

    /* renamed from: N */
    public void mo23445N(C4202i iVar) {
        this.f7267c.remove(iVar);
    }

    /* renamed from: m */
    public void mo23446m() {
        Long l = this.f7273i;
        if (l != null && Long.valueOf(l.longValue() - (System.currentTimeMillis() / 1000)).longValue() < 3888000) {
            m11589J();
        }
    }

    /* renamed from: n */
    public void mo23447n() {
        this.f7268d = null;
        this.f7269e = null;
        this.f7270f = null;
        this.f7271g = null;
        this.f7273i = null;
        this.f7274j = null;
        this.f7275k = null;
    }

    /* renamed from: o */
    public String mo23448o() {
        String str = this.f7270f;
        if (str != null) {
            return str;
        }
        People people = MiotManager.getPeople();
        if (people != null) {
            return people.getAccessToken();
        }
        return null;
    }

    /* renamed from: p */
    public String mo23449p() {
        if (MiotManager.getPeople() == null || "https://account.xiaomi.com/static/res/7c3e9b0/passport/acc-2014/img/n-avator-bg.png".equals(MiotManager.getPeople().getIcon320())) {
            return "";
        }
        People people = MiotManager.getPeople();
        if (people != null) {
            return people.getIcon320();
        }
        return null;
    }

    /* renamed from: q */
    public Long mo23450q() {
        Long l = this.f7273i;
        if (l != null) {
            return l;
        }
        People people = MiotManager.getPeople();
        if (people != null) {
            return people.getExpiresIn();
        }
        return null;
    }

    /* renamed from: u */
    public void mo23451u(String str) {
        if (str == null) {
            for (C4202i r : this.f7267c) {
                r.mo23463r("user is null!!!");
            }
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("uid", str);
        } catch (JSONException unused) {
        }
        "getUserAccountInfo, params : " + jSONObject.toString();
        try {
            MiotManager.getDeviceManager().callSmarthomeApi(MiotAppPath.GET_USER_PROFILE, jSONObject, new C4210h());
        } catch (MiotException unused2) {
        }
    }

    /* renamed from: v */
    public String mo23452v() {
        String str = this.f7268d;
        return str == null ? "" : str;
    }

    /* renamed from: w */
    public String mo23453w() {
        String str = this.f7269e;
        if (str != null) {
            return str;
        }
        People people = MiotManager.getPeople();
        if (people != null) {
            return people.getUserName();
        }
        return null;
    }

    /* renamed from: x */
    public void mo23454x() {
        this.f7266b.mo23483b(1);
        m11594Q(new XiaomiOAuthorize().callOpenApi(this.f7265a, 2882303761517308695L, XiaomiOAuthConstants.OPEN_API_PATH_PROFILE, this.f7270f, this.f7274j, this.f7275k));
    }

    /* renamed from: y */
    public void mo23455y() {
        People people = MiotManager.getPeople();
        if (people != null) {
            this.f7268d = people.getUserId();
            this.f7269e = people.getUserName();
            this.f7270f = people.getAccessToken();
            this.f7271g = people.getRefreshToken();
            this.f7273i = people.getExpiresIn();
            this.f7274j = people.getMacKey();
            this.f7275k = people.getMacAlgorithm();
            if (!C4308b.f7482a) {
                C4310h.m12149e(this.f7268d);
            }
            "initUserInfo access token = " + this.f7270f + " , expires = " + this.f7273i;
            if (System.currentTimeMillis() / 1000 > this.f7273i.longValue()) {
                "user token expires in: " + this.f7273i + ", current time: " + (System.currentTimeMillis() / 1000);
                C4310h.m12146b(new C4308b.C4309a("Token expired, Oauth record: ", C4308b.m12127f()));
                mo23440D();
                return;
            }
            C4308b.m12143v(this.f7270f, this.f7268d);
        }
    }
}
