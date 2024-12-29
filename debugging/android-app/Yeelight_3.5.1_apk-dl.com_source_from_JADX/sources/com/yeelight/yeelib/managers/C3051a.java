package com.yeelight.yeelib.managers;

import android.accounts.OperationCanceledException;
import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.AsyncTask;
import android.text.TextUtils;
import com.miot.api.CommonHandler;
import com.miot.api.Constants;
import com.miot.api.MiotManager;
import com.miot.bluetooth.channel.packet.Packet;
import com.miot.common.config.AppConfiguration;
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
import com.yeelight.yeelib.utils.AppUtils;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONException;
import org.json.JSONObject;
import p051j4.C3278f;
import p051j4.C3279g;
import p051j4.C3283v;
import p051j4.C9197p;
import p129b4.C3988b;
import p134c4.C4007b;

/* renamed from: com.yeelight.yeelib.managers.a */
public class C3051a {
    /* access modifiers changed from: private */

    /* renamed from: m */
    public static final String f4821m = "a";

    /* renamed from: n */
    private static C3051a f4822n = null;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public static boolean f4823o = false;

    /* renamed from: a */
    private Context f4824a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C3061j f4825b = new C3061j(this, (C3053a) null);
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final List<C3052i> f4826c = new CopyOnWriteArrayList();

    /* renamed from: d */
    private String f4827d;

    /* renamed from: e */
    private String f4828e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public String f4829f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public String f4830g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public long f4831h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public Long f4832i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public String f4833j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public String f4834k;

    /* renamed from: l */
    private BroadcastReceiver f4835l = new C3053a();

    /* renamed from: com.yeelight.yeelib.managers.a$i */
    public interface C3052i {
        /* renamed from: C */
        void mo23255C(C3062k kVar);

        /* renamed from: H */
        void mo23262H();

        /* renamed from: d */
        void mo23283d();

        /* renamed from: g */
        void mo23288g();

        /* renamed from: h */
        void mo23291h();

        /* renamed from: l */
        void mo23300l();

        /* renamed from: q */
        void mo23308q(String str);

        /* renamed from: r */
        void mo23310r(String str);
    }

    /* renamed from: com.yeelight.yeelib.managers.a$a */
    class C3053a extends BroadcastReceiver {
        C3053a() {
        }

        public void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            action.hashCode();
            if (action.equals("com.yeelight.cherry.action.BIND_SERVICE_SUCCEED")) {
                String unused = C3051a.f4821m;
                boolean unused2 = C3051a.f4823o = true;
                if (C3051a.m7928z()) {
                    C3051a.this.mo23369y();
                    C3051a.this.m7906F();
                    if (C8281l.m19542b().mo35223a().isEmpty()) {
                        C8281l.m19542b().mo35226f(AppConfiguration.Locale.cn);
                    }
                    if (!AppUtils.f4977a) {
                        C3279g.m8803c(C8281l.m19542b().mo35223a());
                    }
                    C3051a.this.mo23360m();
                    C3051a.this.f4825b.mo23386a(2);
                }
            } else if (action.equals("com.yeelight.cherry.action.BIND_SERVICE_FAILED")) {
                String unused3 = C3051a.f4821m;
            }
        }
    }

    /* renamed from: com.yeelight.yeelib.managers.a$b */
    class C3054b extends AsyncTask<Void, Void, XiaomiOAuthResults> {

        /* renamed from: a */
        Exception f4837a;

        /* renamed from: b */
        final /* synthetic */ XiaomiOAuthFuture f4838b;

        /* renamed from: c */
        final /* synthetic */ boolean f4839c;

        C3054b(XiaomiOAuthFuture xiaomiOAuthFuture, boolean z) {
            this.f4838b = xiaomiOAuthFuture;
            this.f4839c = z;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public XiaomiOAuthResults doInBackground(Void... voidArr) {
            try {
                return (XiaomiOAuthResults) this.f4838b.getResult();
            } catch (OperationCanceledException | XMAuthericationException | IOException e) {
                this.f4837a = e;
                return null;
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void onPostExecute(XiaomiOAuthResults xiaomiOAuthResults) {
            if (xiaomiOAuthResults != null) {
                String unused = C3051a.f4821m;
                C3051a.this.mo23356H(xiaomiOAuthResults, this.f4839c);
            } else if (this.f4837a != null) {
                boolean z = this.f4839c;
                String unused2 = C3051a.f4821m;
                if (z) {
                    for (C3052i H : C3051a.this.f4826c) {
                        H.mo23262H();
                    }
                    return;
                }
                C3051a.this.f4825b.mo23386a(3);
                for (C3052i q : C3051a.this.f4826c) {
                    q.mo23308q(this.f4837a.getMessage());
                }
            } else {
                String unused3 = C3051a.f4821m;
                String a = C3051a.f4821m;
                C3278f.m8797b(new AppUtils.SuicideException(a, "No result and no exception! fast oauth? " + this.f4839c));
                boolean z2 = this.f4839c;
                String unused4 = C3051a.f4821m;
                if (z2) {
                    for (C3052i H2 : C3051a.this.f4826c) {
                        H2.mo23262H();
                    }
                    return;
                }
                C3051a.this.f4825b.mo23386a(3);
                for (C3052i q2 : C3051a.this.f4826c) {
                    q2.mo23308q("Error! Empty result for login request.");
                }
            }
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
        }
    }

    /* renamed from: com.yeelight.yeelib.managers.a$c */
    class C3055c extends AsyncTask<Void, Void, String> {

        /* renamed from: a */
        Exception f4841a;

        /* renamed from: b */
        final /* synthetic */ XiaomiOAuthFuture f4842b;

        C3055c(XiaomiOAuthFuture xiaomiOAuthFuture) {
            this.f4842b = xiaomiOAuthFuture;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public String doInBackground(Void... voidArr) {
            try {
                return (String) this.f4842b.getResult();
            } catch (OperationCanceledException | XMAuthericationException | IOException e) {
                this.f4841a = e;
                return null;
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void onPostExecute(String str) {
            if (str != null) {
                String unused = C3051a.f4821m;
                C3051a.this.mo23357I(str);
                return;
            }
            Exception exc = this.f4841a;
            String unused2 = C3051a.f4821m;
            if (exc != null) {
                C3051a.this.f4825b.mo23386a(3);
                for (C3052i r : C3051a.this.f4826c) {
                    r.mo23310r(this.f4841a.getMessage());
                }
                return;
            }
            C3278f.m8797b(new AppUtils.SuicideException(C3051a.f4821m, "No result and no exception for user profile request "));
            C3051a.this.f4825b.mo23386a(3);
            for (C3052i r2 : C3051a.this.f4826c) {
                r2.mo23310r("Error! Empty result for user profile.");
            }
        }

        /* access modifiers changed from: protected */
        public void onPreExecute() {
        }
    }

    /* renamed from: com.yeelight.yeelib.managers.a$d */
    class C3056d implements C4007b<String> {
        C3056d() {
        }

        /* renamed from: b */
        public void mo23338a(String str) {
            String unused = C3051a.f4821m;
            StringBuilder sb = new StringBuilder();
            sb.append("getTokenByCode onSuccess, return result: ");
            sb.append(str);
            if (str != null) {
                str = str.replace("&&&START&&&", "");
            }
            try {
                JSONObject jSONObject = new JSONObject(str);
                String unused2 = C3051a.this.f4829f = jSONObject.getString(XiaomiOAuthConstants.EXTRA_ACCESS_TOKEN_2);
                String unused3 = C3051a.this.f4830g = jSONObject.getString("refresh_token");
                String string = jSONObject.getString(XiaomiOAuthConstants.EXTRA_EXPIRES_IN_2);
                Long unused4 = C3051a.this.f4832i = Long.valueOf((string == null ? 7776000 : Long.parseLong(string)) + (System.currentTimeMillis() / 1000));
                String unused5 = C3051a.this.f4833j = jSONObject.getString(XiaomiOAuthConstants.EXTRA_MAC_KEY_2);
                String unused6 = C3051a.this.f4834k = jSONObject.getString(XiaomiOAuthConstants.EXTRA_MAC_ALGORITHM_2);
                long unused7 = C3051a.this.f4831h = System.currentTimeMillis();
                C3051a.this.mo23368x();
            } catch (JSONException e) {
                C3051a.this.f4825b.mo23386a(3);
                e.printStackTrace();
                for (C3052i q : C3051a.this.f4826c) {
                    q.mo23308q(e.getMessage());
                }
            }
        }

        public void onFailure(int i, String str) {
            String unused = C3051a.f4821m;
            StringBuilder sb = new StringBuilder();
            sb.append("getTokenByCode onFailure, errorCode : ");
            sb.append(i);
            sb.append(", message = ");
            sb.append(str);
            C3051a.this.f4825b.mo23386a(3);
            for (C3052i q : C3051a.this.f4826c) {
                q.mo23308q(str);
            }
        }
    }

    /* renamed from: com.yeelight.yeelib.managers.a$e */
    class C3057e implements C4007b<String> {
        C3057e() {
        }

        /* renamed from: b */
        public void mo23338a(String str) {
            String unused = C3051a.f4821m;
            StringBuilder sb = new StringBuilder();
            sb.append("refreshToken onSuccess, return result: ");
            sb.append(str);
            try {
                if (1 == new JSONObject(str).getInt("code")) {
                    String unused2 = C3051a.f4821m;
                    JSONObject jSONObject = new JSONObject(str).getJSONObject(Constants.EXTRA_PUSH_MESSAGE);
                    String unused3 = C3051a.this.f4829f = jSONObject.getString(XiaomiOAuthConstants.EXTRA_ACCESS_TOKEN_2);
                    String string = jSONObject.getString(XiaomiOAuthConstants.EXTRA_EXPIRES_IN_2);
                    Long unused4 = C3051a.this.f4832i = Long.valueOf((string == null ? 7776000 : Long.parseLong(string)) + (System.currentTimeMillis() / 1000));
                    String unused5 = C3051a.this.f4833j = jSONObject.getString(XiaomiOAuthConstants.EXTRA_MAC_KEY_2);
                    String unused6 = C3051a.this.f4834k = jSONObject.getString(XiaomiOAuthConstants.EXTRA_MAC_ALGORITHM_2);
                    long unused7 = C3051a.this.f4831h = System.currentTimeMillis();
                    C3051a.this.m7910O();
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }

        public void onFailure(int i, String str) {
            String unused = C3051a.f4821m;
            StringBuilder sb = new StringBuilder();
            sb.append("refreshTokenOnYeelightServer onFailure, errorCode : ");
            sb.append(i);
            sb.append(", message = ");
            sb.append(str);
        }
    }

    /* renamed from: com.yeelight.yeelib.managers.a$f */
    class C3058f implements C4007b<String> {
        C3058f() {
        }

        /* renamed from: b */
        public void mo23338a(String str) {
            String unused = C3051a.f4821m;
            StringBuilder sb = new StringBuilder();
            sb.append("refreshToken onSuccess, return result: ");
            sb.append(str);
            if (str != null) {
                try {
                    str = str.replace("&&&START&&&", "");
                } catch (JSONException e) {
                    e.printStackTrace();
                    return;
                }
            }
            String unused2 = C3051a.f4821m;
            JSONObject jSONObject = new JSONObject(str);
            String unused3 = C3051a.this.f4829f = jSONObject.getString(XiaomiOAuthConstants.EXTRA_ACCESS_TOKEN_2);
            String unused4 = C3051a.this.f4830g = jSONObject.getString("refresh_token");
            String string = jSONObject.getString(XiaomiOAuthConstants.EXTRA_EXPIRES_IN_2);
            Long unused5 = C3051a.this.f4832i = Long.valueOf((string == null ? 7776000 : Long.parseLong(string)) + (System.currentTimeMillis() / 1000));
            String unused6 = C3051a.this.f4833j = jSONObject.getString(XiaomiOAuthConstants.EXTRA_MAC_KEY_2);
            String unused7 = C3051a.this.f4834k = jSONObject.getString(XiaomiOAuthConstants.EXTRA_MAC_ALGORITHM_2);
            long unused8 = C3051a.this.f4831h = System.currentTimeMillis();
            C3051a.this.m7910O();
        }

        public void onFailure(int i, String str) {
            String unused = C3051a.f4821m;
            StringBuilder sb = new StringBuilder();
            sb.append("refreshTokenOnMiServer onFailure, errorCode : ");
            sb.append(i);
            sb.append(", message = ");
            sb.append(str);
        }
    }

    /* renamed from: com.yeelight.yeelib.managers.a$g */
    class C3059g implements C4007b<String> {
        C3059g(C3051a aVar) {
        }

        /* renamed from: b */
        public void mo23338a(String str) {
            String unused = C3051a.f4821m;
        }

        public void onFailure(int i, String str) {
            String unused = C3051a.f4821m;
            StringBuilder sb = new StringBuilder();
            sb.append("Send single log onFailure! exception msg = ");
            sb.append(str);
        }
    }

    /* renamed from: com.yeelight.yeelib.managers.a$h */
    class C3060h implements CommonHandler<String> {
        C3060h() {
        }

        /* renamed from: a */
        public void onSucceed(String str) {
            String unused = C3051a.f4821m;
            StringBuilder sb = new StringBuilder();
            sb.append("getUserAccountInfo, onSucceed : address : ");
            sb.append(str);
            try {
                JSONObject jSONObject = new JSONObject(str).getJSONObject("result");
                String str2 = "";
                if (jSONObject.getString("avatarUrl").contains("size_320")) {
                    str2 = jSONObject.getJSONObject("avatarUrl").getString("size_320");
                }
                String string = jSONObject.getString("miId");
                String string2 = jSONObject.getString("nickname");
                for (C3052i C : C3051a.this.f4826c) {
                    C.mo23255C(new C3062k(C3051a.this, string, string2, str2));
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }

        public void onFailed(int i, String str) {
            String unused = C3051a.f4821m;
            StringBuilder sb = new StringBuilder();
            sb.append("onFailed : error : ");
            sb.append(str);
            sb.append(" , error code : ");
            sb.append(i);
            for (C3052i r : C3051a.this.f4826c) {
                r.mo23310r(str);
            }
        }
    }

    /* renamed from: com.yeelight.yeelib.managers.a$j */
    private class C3061j {
        private C3061j(C3051a aVar) {
        }

        /* synthetic */ C3061j(C3051a aVar, C3053a aVar2) {
            this(aVar);
        }

        /* renamed from: a */
        public void mo23386a(int i) {
        }
    }

    /* renamed from: com.yeelight.yeelib.managers.a$k */
    public class C3062k {

        /* renamed from: a */
        private String f4848a;

        /* renamed from: b */
        private String f4849b;

        /* renamed from: c */
        private String f4850c;

        public C3062k(C3051a aVar, String str, String str2, String str3) {
            this.f4848a = str;
            this.f4849b = str2;
            this.f4850c = str3;
        }

        /* renamed from: a */
        public String mo23387a() {
            return this.f4850c;
        }

        /* renamed from: b */
        public String mo23388b() {
            return this.f4848a;
        }

        /* renamed from: c */
        public String mo23389c() {
            return this.f4849b;
        }
    }

    private C3051a() {
        if (this.f4824a != null) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("com.yeelight.cherry.action.BIND_SERVICE_SUCCEED");
            intentFilter.addAction("com.yeelight.cherry.action.BIND_SERVICE_FAILED");
            this.f4824a.registerReceiver(this.f4835l, intentFilter);
        }
    }

    private C3051a(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.yeelight.cherry.action.BIND_SERVICE_SUCCEED");
        intentFilter.addAction("com.yeelight.cherry.action.BIND_SERVICE_FAILED");
        context.registerReceiver(this.f4835l, intentFilter);
        this.f4824a = context;
    }

    /* renamed from: E */
    private void m7905E() {
        for (C3052i l : this.f4826c) {
            l.mo23300l();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: F */
    public void m7906F() {
        C9197p.m22180m(new C3059g(this));
        for (C3052i h : this.f4826c) {
            h.mo23291h();
        }
    }

    /* renamed from: J */
    private void m7907J() {
        if (TextUtils.isEmpty(this.f4830g)) {
            m7909L();
        } else {
            m7908K();
        }
    }

    /* renamed from: K */
    private void m7908K() {
        HashMap hashMap = new HashMap();
        hashMap.put("client_id", String.valueOf(2882303761517308695L));
        hashMap.put(AuthorizeActivityBase.KEY_REDIRECT_URI, "http://www.mi.com");
        hashMap.put("client_secret", "OrwZHJ/drEXakH1LsfwwqQ==");
        hashMap.put("grant_type", "refresh_token");
        hashMap.put("refresh_token", this.f4830g);
        String str = AppUtils.f4996t;
        StringBuilder sb = new StringBuilder();
        sb.append("refreshToken url: ");
        sb.append(str);
        C3988b.m11574j(str, hashMap, (Map<String, String>) null, (String) null, String.class, new C3058f(), false);
    }

    /* renamed from: L */
    private void m7909L() {
        HashMap hashMap = new HashMap();
        hashMap.put("type", "yeelight-android");
        hashMap.put("accessToken", this.f4829f);
        String str = C3283v.m8840f("REFRESH_TOKEN_BASE_URL", "https://api-us.yeelight.com/") + "mi_oauth/refresh_token";
        StringBuilder sb = new StringBuilder();
        sb.append("refreshToken url: ");
        sb.append(str);
        C3988b.m11574j(str, hashMap, (Map<String, String>) null, (String) null, String.class, new C3057e(), false);
    }

    /* access modifiers changed from: private */
    /* renamed from: O */
    public void m7910O() {
        People people = MiotManager.getPeople();
        People createOauthPeople = PeopleFactory.createOauthPeople(this.f4829f, this.f4827d, this.f4832i.longValue(), this.f4833j, this.f4834k);
        createOauthPeople.setRefreshToken(this.f4830g);
        createOauthPeople.setUserName(this.f4828e);
        createOauthPeople.setIcon(people.getIcon());
        createOauthPeople.setIcon75(people.getIcon75());
        createOauthPeople.setIcon90(people.getIcon90());
        createOauthPeople.setIcon120(people.getIcon120());
        createOauthPeople.setIcon320(people.getIcon320());
        if (MiotManager.getPeopleManager() == null) {
            C9197p.m22177j();
            return;
        }
        try {
            MiotManager.getPeopleManager().savePeople(createOauthPeople);
        } catch (MiotException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: P */
    private void m7911P(XiaomiOAuthFuture<XiaomiOAuthResults> xiaomiOAuthFuture, boolean z) {
        new C3054b(xiaomiOAuthFuture, z).execute(new Void[0]);
    }

    /* renamed from: Q */
    private void m7912Q(XiaomiOAuthFuture<String> xiaomiOAuthFuture) {
        new C3055c(xiaomiOAuthFuture).execute(new Void[0]);
    }

    /* renamed from: r */
    public static C3051a m7925r() {
        synchronized (C3051a.class) {
            if (f4822n == null) {
                f4822n = new C3051a();
            }
        }
        return f4822n;
    }

    /* renamed from: s */
    public static C3051a m7926s(Context context) {
        synchronized (C3051a.class) {
            if (f4822n == null) {
                f4822n = new C3051a(context);
            }
        }
        return f4822n;
    }

    /* renamed from: t */
    private void m7927t(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("getTokenByCode , code = ");
        sb.append(str);
        HashMap hashMap = new HashMap();
        hashMap.put("client_id", String.valueOf(2882303761517308695L));
        hashMap.put(AuthorizeActivityBase.KEY_REDIRECT_URI, "http://www.mi.com");
        hashMap.put("client_secret", "OrwZHJ/drEXakH1LsfwwqQ==");
        hashMap.put("grant_type", "authorization_code");
        hashMap.put("code", str);
        String str2 = AppUtils.f4996t;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("getTokenByCode url: ");
        sb2.append(str2);
        C3988b.m11569e(str2, hashMap, (Map<String, String>) null, String.class, new C3056d(), false);
    }

    /* renamed from: z */
    public static boolean m7928z() {
        return MiotManager.getPeopleManager() != null && MiotManager.getPeopleManager().isLogin();
    }

    /* renamed from: A */
    public boolean mo23351A() {
        return f4823o;
    }

    /* renamed from: B */
    public int mo23352B(Activity activity) {
        return mo23353C(activity, false);
    }

    /* renamed from: C */
    public int mo23353C(Activity activity, boolean z) {
        m7911P(new XiaomiOAuthorize().setAppId(2882303761517308695L).setRedirectUrl("http://www.mi.com").setNoMiui(true).setScope((int[]) null).startGetOAuthCode(activity), false);
        return 0;
    }

    /* renamed from: D */
    public void mo23354D() {
        m7905E();
        try {
            MiotManager.getPeopleManager().deletePeople();
        } catch (MiotException e) {
            e.printStackTrace();
        }
        mo23361n();
        mo23355G();
        AppUtils.f4986j = true;
        this.f4825b.mo23386a(-1);
    }

    /* renamed from: G */
    public void mo23355G() {
        for (C3052i g : this.f4826c) {
            g.mo23288g();
        }
    }

    /* renamed from: H */
    public void mo23356H(XiaomiOAuthResults xiaomiOAuthResults, boolean z) {
        if (xiaomiOAuthResults.hasError()) {
            int errorCode = xiaomiOAuthResults.getErrorCode();
            String errorMessage = xiaomiOAuthResults.getErrorMessage();
            StringBuilder sb = new StringBuilder();
            sb.append("oauth error, notify onLoginFailed! error code: ");
            sb.append(errorCode);
            sb.append(", error message: ");
            sb.append(errorMessage);
            for (C3052i next : this.f4826c) {
                if (z) {
                    next.mo23262H();
                } else {
                    this.f4825b.mo23386a(3);
                    next.mo23308q(errorMessage);
                }
            }
            return;
        }
        this.f4825b.mo23386a(0);
        for (C3052i d : this.f4826c) {
            d.mo23283d();
        }
        m7927t(xiaomiOAuthResults.getCode());
    }

    /* renamed from: I */
    public void mo23357I(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("process user profile result: ");
        sb.append(str);
        try {
            JSONObject jSONObject = new JSONObject(str).getJSONObject(Packet.DATA);
            this.f4827d = jSONObject.getString("userId");
            this.f4828e = jSONObject.getString("miliaoNick");
            String string = jSONObject.getString("miliaoIcon");
            String string2 = jSONObject.getString("miliaoIcon_75");
            String string3 = jSONObject.getString("miliaoIcon_90");
            String string4 = jSONObject.getString("miliaoIcon_120");
            String string5 = jSONObject.getString("miliaoIcon_320");
            People createOauthPeople = PeopleFactory.createOauthPeople(this.f4829f, this.f4827d, this.f4832i.longValue(), this.f4833j, this.f4834k);
            createOauthPeople.setRefreshToken(this.f4830g);
            createOauthPeople.setUserName(this.f4828e);
            createOauthPeople.setIcon(string);
            createOauthPeople.setIcon75(string2);
            createOauthPeople.setIcon90(string3);
            createOauthPeople.setIcon120(string4);
            createOauthPeople.setIcon320(string5);
            if (MiotManager.getPeopleManager() == null) {
                C9197p.m22177j();
            } else {
                MiotManager.getPeopleManager().savePeople(createOauthPeople);
            }
            AppUtils.m8298s(this.f4829f, this.f4827d, this.f4831h);
            if (!AppUtils.f4977a) {
                C3278f.m8800e(this.f4827d);
            }
            m7906F();
            if (!AppUtils.f4977a) {
                C3279g.m8803c(C8281l.m19542b().mo35223a());
            }
        } catch (MiotException | JSONException e) {
            this.f4825b.mo23386a(3);
            e.printStackTrace();
        }
    }

    /* renamed from: M */
    public void mo23358M(C3052i iVar) {
        if (this.f4826c.contains(iVar)) {
            AppUtils.m8300u(f4821m, "Invalid listener, already in list");
            return;
        }
        this.f4826c.add(iVar);
        if (m7928z()) {
            iVar.mo23291h();
        }
    }

    /* renamed from: N */
    public void mo23359N(C3052i iVar) {
        this.f4826c.remove(iVar);
    }

    /* renamed from: m */
    public void mo23360m() {
        Long l = this.f4832i;
        if (l != null && Long.valueOf(l.longValue() - (System.currentTimeMillis() / 1000)).longValue() < 3888000) {
            m7907J();
        }
    }

    /* renamed from: n */
    public void mo23361n() {
        this.f4827d = null;
        this.f4828e = null;
        this.f4829f = null;
        this.f4830g = null;
        this.f4832i = null;
        this.f4833j = null;
        this.f4834k = null;
    }

    /* renamed from: o */
    public String mo23362o() {
        String str = this.f4829f;
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
    public String mo23363p() {
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
    public Long mo23364q() {
        Long l = this.f4832i;
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
    public void mo23365u(String str) {
        if (str == null) {
            for (C3052i r : this.f4826c) {
                r.mo23310r("user is null!!!");
            }
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("uid", str);
        } catch (JSONException unused) {
        }
        StringBuilder sb = new StringBuilder();
        sb.append("getUserAccountInfo, params : ");
        sb.append(jSONObject.toString());
        try {
            MiotManager.getDeviceManager().callSmarthomeApi(MiotAppPath.GET_USER_PROFILE, jSONObject, new C3060h());
        } catch (MiotException unused2) {
        }
    }

    /* renamed from: v */
    public String mo23366v() {
        String str = this.f4827d;
        return str == null ? "" : str;
    }

    /* renamed from: w */
    public String mo23367w() {
        String str = this.f4828e;
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
    public void mo23368x() {
        this.f4825b.mo23386a(1);
        m7912Q(new XiaomiOAuthorize().callOpenApi(this.f4824a, 2882303761517308695L, XiaomiOAuthConstants.OPEN_API_PATH_PROFILE, this.f4829f, this.f4833j, this.f4834k));
    }

    /* renamed from: y */
    public void mo23369y() {
        People people = MiotManager.getPeople();
        if (people != null) {
            this.f4827d = people.getUserId();
            this.f4828e = people.getUserName();
            this.f4829f = people.getAccessToken();
            this.f4830g = people.getRefreshToken();
            this.f4832i = people.getExpiresIn();
            this.f4833j = people.getMacKey();
            this.f4834k = people.getMacAlgorithm();
            if (!AppUtils.f4977a) {
                C3278f.m8800e(this.f4827d);
            }
            StringBuilder sb = new StringBuilder();
            sb.append("initUserInfo access token = ");
            sb.append(this.f4829f);
            sb.append(" , expires = ");
            sb.append(this.f4832i);
            if (System.currentTimeMillis() / 1000 > this.f4832i.longValue()) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("user token expires in: ");
                sb2.append(this.f4832i);
                sb2.append(", current time: ");
                sb2.append(System.currentTimeMillis() / 1000);
                C3278f.m8797b(new AppUtils.SuicideException("Token expired, Oauth record: ", AppUtils.m8285f()));
                mo23354D();
                return;
            }
            AppUtils.m8305z(this.f4829f, this.f4827d);
        }
    }
}
