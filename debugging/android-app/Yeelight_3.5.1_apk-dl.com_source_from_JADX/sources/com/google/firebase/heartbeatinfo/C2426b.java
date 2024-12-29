package com.google.firebase.heartbeatinfo;

import android.content.Context;
import android.util.Base64OutputStream;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import androidx.core.p007os.UserManagerCompat;
import com.google.android.gms.tasks.C1874c;
import com.google.firebase.C2406d;
import com.xiaomi.mipush.sdk.Constants;
import java.io.ByteArrayOutputStream;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONObject;
import p065m0.C3339g;
import p070n1.C3374f;
import p070n1.C3377h;
import p070n1.C9716a;
import p070n1.C9717b;
import p070n1.C9718c;
import p070n1.C9719d;
import p070n1.C9720e;
import p077o1.C3502b;
import p103u1.C3719i;
import p110w0.C3870d;
import p110w0.C3873e;
import p110w0.C3887q;

/* renamed from: com.google.firebase.heartbeatinfo.b */
public class C2426b implements C3377h, HeartBeatInfo {

    /* renamed from: f */
    private static final ThreadFactory f4075f = C9718c.f17533a;

    /* renamed from: a */
    private final C3502b<C2427c> f4076a;

    /* renamed from: b */
    private final Context f4077b;

    /* renamed from: c */
    private final C3502b<C3719i> f4078c;

    /* renamed from: d */
    private final Set<C3374f> f4079d;

    /* renamed from: e */
    private final Executor f4080e;

    private C2426b(Context context, String str, Set<C3374f> set, C3502b<C3719i> bVar) {
        this(new C9719d(context, str), set, new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), f4075f), bVar, context);
    }

    @VisibleForTesting
    C2426b(C3502b<C2427c> bVar, Set<C3374f> set, Executor executor, C3502b<C3719i> bVar2, Context context) {
        this.f4076a = bVar;
        this.f4079d = set;
        this.f4080e = executor;
        this.f4078c = bVar2;
        this.f4077b = context;
    }

    @NonNull
    /* renamed from: g */
    public static C3870d<C2426b> m6472g() {
        return C3870d.m10983d(C2426b.class, C3377h.class, HeartBeatInfo.class).mo26346b(C3887q.m11057i(Context.class)).mo26346b(C3887q.m11057i(C2406d.class)).mo26346b(C3887q.m11059k(C3374f.class)).mo26346b(C3887q.m11058j(C3719i.class)).mo26349e(C9720e.f17536a).mo26347c();
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public static /* synthetic */ C2426b m6473h(C3873e eVar) {
        return new C2426b((Context) eVar.mo26333a(Context.class), ((C2406d) eVar.mo26333a(C2406d.class)).mo18986n(), eVar.mo26334d(C3374f.class), eVar.mo26335b(C3719i.class));
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public /* synthetic */ String m6474i() {
        GZIPOutputStream gZIPOutputStream;
        String byteArrayOutputStream;
        synchronized (this) {
            C2427c cVar = this.f4076a.get();
            List<C2428d> c = cVar.mo19041c();
            cVar.mo19040b();
            JSONArray jSONArray = new JSONArray();
            for (int i = 0; i < c.size(); i++) {
                C2428d dVar = c.get(i);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("agent", dVar.mo19034c());
                jSONObject.put("dates", new JSONArray(dVar.mo19033b()));
                jSONArray.put(jSONObject);
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("heartbeats", jSONArray);
            jSONObject2.put(Constants.VERSION, "2");
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream2, 11);
            try {
                gZIPOutputStream = new GZIPOutputStream(base64OutputStream);
                gZIPOutputStream.write(jSONObject2.toString().getBytes("UTF-8"));
                gZIPOutputStream.close();
                base64OutputStream.close();
                byteArrayOutputStream = byteArrayOutputStream2.toString("UTF-8");
            } catch (Throwable th) {
                try {
                    base64OutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        return byteArrayOutputStream;
        throw th;
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public static /* synthetic */ C2427c m6475j(Context context, String str) {
        return new C2427c(context, str);
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public /* synthetic */ Void m6476k() {
        synchronized (this) {
            this.f4076a.get().mo19042e(System.currentTimeMillis(), this.f4078c.get().mo26133a());
        }
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public static /* synthetic */ Thread m6477l(Runnable runnable) {
        return new Thread(runnable, "heartbeat-information-executor");
    }

    /* renamed from: a */
    public C3339g<String> mo19038a() {
        return UserManagerCompat.isUserUnlocked(this.f4077b) ^ true ? C1874c.m4951e("") : C1874c.m4949c(this.f4080e, new C9716a(this));
    }

    /* renamed from: m */
    public C3339g<Void> mo19039m() {
        return this.f4079d.size() <= 0 ? C1874c.m4951e(null) : UserManagerCompat.isUserUnlocked(this.f4077b) ^ true ? C1874c.m4951e(null) : C1874c.m4949c(this.f4080e, new C9717b(this));
    }
}
