package com.google.firebase.crashlytics.p110c.p112g;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import com.google.firebase.crashlytics.internal.model.C3165v;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.google.firebase.crashlytics.p110c.p125p.C3043d;
import com.google.firebase.crashlytics.p110c.p125p.C3044e;
import com.miot.service.manager.timer.TimerCodec;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* renamed from: com.google.firebase.crashlytics.c.g.m */
public class C2942m {

    /* renamed from: e */
    private static final String f5707e = String.format(Locale.US, "Crashlytics Android SDK/%s", new Object[]{"17.0.0"});

    /* renamed from: f */
    private static final Map<String, Integer> f5708f;

    /* renamed from: a */
    private final Context f5709a;

    /* renamed from: b */
    private final C2955v f5710b;

    /* renamed from: c */
    private final C2872b f5711c;

    /* renamed from: d */
    private final C3043d f5712d;

    static {
        HashMap hashMap = new HashMap();
        f5708f = hashMap;
        hashMap.put("armeabi", 5);
        f5708f.put("armeabi-v7a", 6);
        f5708f.put("arm64-v8a", 9);
        f5708f.put("x86", 0);
        f5708f.put("x86_64", 1);
    }

    public C2942m(Context context, C2955v vVar, C2872b bVar, C3043d dVar) {
        this.f5709a = context;
        this.f5710b = vVar;
        this.f5711c = bVar;
        this.f5712d = dVar;
    }

    /* renamed from: a */
    private CrashlyticsReport.C3047a m9009a() {
        CrashlyticsReport.C3047a b = CrashlyticsReport.m9410b();
        b.mo17450h("17.0.0");
        b.mo17446d(this.f5711c.f5532a);
        b.mo17447e(this.f5710b.mo17294a());
        b.mo17444b(this.f5711c.f5536e);
        b.mo17445c(this.f5711c.f5537f);
        b.mo17449g(4);
        return b;
    }

    /* renamed from: d */
    private static int m9010d() {
        Integer num;
        String str = Build.CPU_ABI;
        if (!TextUtils.isEmpty(str) && (num = f5708f.get(str.toLowerCase(Locale.US))) != null) {
            return num.intValue();
        }
        return 7;
    }

    /* renamed from: e */
    private CrashlyticsReport.C3054d.C3061d.C3062a.C3064b.C3065a m9011e() {
        CrashlyticsReport.C3054d.C3061d.C3062a.C3064b.C3065a.C3066a a = CrashlyticsReport.C3054d.C3061d.C3062a.C3064b.C3065a.m9535a();
        a.mo17551b(0);
        a.mo17553d(0);
        a.mo17552c(this.f5711c.f5535d);
        a.mo17554e(this.f5711c.f5533b);
        return a.mo17550a();
    }

    /* renamed from: f */
    private C3165v<CrashlyticsReport.C3054d.C3061d.C3062a.C3064b.C3065a> m9012f() {
        return C3165v.m9863d(m9011e());
    }

    /* renamed from: g */
    private CrashlyticsReport.C3054d.C3061d.C3062a m9013g(int i, C3044e eVar, Thread thread, int i2, int i3, boolean z) {
        Boolean bool;
        ActivityManager.RunningAppProcessInfo k = C2884h.m8814k(this.f5711c.f5535d, this.f5709a);
        if (k != null) {
            bool = Boolean.valueOf(k.importance != 100);
        } else {
            bool = null;
        }
        CrashlyticsReport.C3054d.C3061d.C3062a.C3063a a = CrashlyticsReport.C3054d.C3061d.C3062a.m9519a();
        a.mo17537b(bool);
        a.mo17540e(i);
        a.mo17539d(m9017k(eVar, thread, i2, i3, z));
        return a.mo17536a();
    }

    /* renamed from: h */
    private CrashlyticsReport.C3054d.C3061d.C3077c m9014h(int i) {
        C2878e a = C2878e.m8757a(this.f5709a);
        Float b = a.mo17167b();
        Double valueOf = b != null ? Double.valueOf(b.doubleValue()) : null;
        int c = a.mo17168c();
        boolean q = C2884h.m8820q(this.f5709a);
        long v = C2884h.m8825v() - C2884h.m8804a(this.f5709a);
        long b2 = C2884h.m8805b(Environment.getDataDirectory().getPath());
        CrashlyticsReport.C3054d.C3061d.C3077c.C3078a a2 = CrashlyticsReport.C3054d.C3061d.C3077c.m9598a();
        a2.mo17610b(valueOf);
        a2.mo17611c(c);
        a2.mo17614f(q);
        a2.mo17613e(i);
        a2.mo17615g(v);
        a2.mo17612d(b2);
        return a2.mo17609a();
    }

    /* renamed from: i */
    private CrashlyticsReport.C3054d.C3061d.C3062a.C3064b.C3068c m9015i(C3044e eVar, int i, int i2) {
        return m9016j(eVar, i, i2, 0);
    }

    /* renamed from: j */
    private CrashlyticsReport.C3054d.C3061d.C3062a.C3064b.C3068c m9016j(C3044e eVar, int i, int i2, int i3) {
        String str = eVar.f5928b;
        String str2 = eVar.f5927a;
        StackTraceElement[] stackTraceElementArr = eVar.f5929c;
        int i4 = 0;
        if (stackTraceElementArr == null) {
            stackTraceElementArr = new StackTraceElement[0];
        }
        C3044e eVar2 = eVar.f5930d;
        if (i3 >= i2) {
            C3044e eVar3 = eVar2;
            while (eVar3 != null) {
                eVar3 = eVar3.f5930d;
                i4++;
            }
        }
        CrashlyticsReport.C3054d.C3061d.C3062a.C3064b.C3068c.C3069a a = CrashlyticsReport.C3054d.C3061d.C3062a.C3064b.C3068c.m9552a();
        a.mo17571f(str);
        a.mo17570e(str2);
        a.mo17568c(C3165v.m9862c(m9019m(stackTraceElementArr, i)));
        a.mo17569d(i4);
        if (eVar2 != null && i4 == 0) {
            a.mo17567b(m9016j(eVar2, i, i2, i3 + 1));
        }
        return a.mo17566a();
    }

    /* renamed from: k */
    private CrashlyticsReport.C3054d.C3061d.C3062a.C3064b m9017k(C3044e eVar, Thread thread, int i, int i2, boolean z) {
        CrashlyticsReport.C3054d.C3061d.C3062a.C3064b.C3067b a = CrashlyticsReport.C3054d.C3061d.C3062a.C3064b.m9530a();
        a.mo17560e(m9027u(eVar, thread, i, z));
        a.mo17558c(m9015i(eVar, i, i2));
        a.mo17559d(m9024r());
        a.mo17557b(m9012f());
        return a.mo17556a();
    }

    /* renamed from: l */
    private CrashlyticsReport.C3054d.C3061d.C3062a.C3064b.C3072e.C3074b m9018l(StackTraceElement stackTraceElement, CrashlyticsReport.C3054d.C3061d.C3062a.C3064b.C3072e.C3074b.C3075a aVar) {
        long j = 0;
        long max = stackTraceElement.isNativeMethod() ? Math.max((long) stackTraceElement.getLineNumber(), 0) : 0;
        String str = stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName();
        String fileName = stackTraceElement.getFileName();
        if (!stackTraceElement.isNativeMethod() && stackTraceElement.getLineNumber() > 0) {
            j = (long) stackTraceElement.getLineNumber();
        }
        aVar.mo17595e(max);
        aVar.mo17596f(str);
        aVar.mo17592b(fileName);
        aVar.mo17594d(j);
        return aVar.mo17591a();
    }

    /* renamed from: m */
    private C3165v<CrashlyticsReport.C3054d.C3061d.C3062a.C3064b.C3072e.C3074b> m9019m(StackTraceElement[] stackTraceElementArr, int i) {
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement l : stackTraceElementArr) {
            CrashlyticsReport.C3054d.C3061d.C3062a.C3064b.C3072e.C3074b.C3075a a = CrashlyticsReport.C3054d.C3061d.C3062a.C3064b.C3072e.C3074b.m9580a();
            a.mo17593c(i);
            arrayList.add(m9018l(l, a));
        }
        return C3165v.m9862c(arrayList);
    }

    /* renamed from: n */
    private CrashlyticsReport.C3054d.C3055a m9020n() {
        CrashlyticsReport.C3054d.C3055a.C3056a a = CrashlyticsReport.C3054d.C3055a.m9467a();
        a.mo17489c(this.f5710b.mo17295d());
        a.mo17491e(this.f5711c.f5536e);
        a.mo17488b(this.f5711c.f5537f);
        a.mo17490d(this.f5710b.mo17294a());
        return a.mo17487a();
    }

    /* renamed from: o */
    private CrashlyticsReport.C3054d m9021o(String str, long j) {
        CrashlyticsReport.C3054d.C3058b a = CrashlyticsReport.C3054d.m9451a();
        a.mo17504l(j);
        a.mo17501i(str);
        a.mo17499g(f5707e);
        a.mo17494b(m9020n());
        a.mo17503k(m9023q());
        a.mo17496d(m9022p());
        a.mo17500h(3);
        return a.mo17493a();
    }

    /* renamed from: p */
    private CrashlyticsReport.C3054d.C3059c m9022p() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        int d = m9010d();
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        long v = C2884h.m8825v();
        long blockCount = ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize());
        boolean C = C2884h.m8796C(this.f5709a);
        int n = C2884h.m8817n(this.f5709a);
        String str = Build.MANUFACTURER;
        String str2 = Build.PRODUCT;
        CrashlyticsReport.C3054d.C3059c.C3060a a = CrashlyticsReport.C3054d.C3059c.m9492a();
        a.mo17516b(d);
        a.mo17520f(Build.MODEL);
        a.mo17517c(availableProcessors);
        a.mo17522h(v);
        a.mo17518d(blockCount);
        a.mo17523i(C);
        a.mo17524j(n);
        a.mo17519e(str);
        a.mo17521g(str2);
        return a.mo17515a();
    }

    /* renamed from: q */
    private CrashlyticsReport.C3054d.C3081e m9023q() {
        CrashlyticsReport.C3054d.C3081e.C3082a a = CrashlyticsReport.C3054d.C3081e.m9616a();
        a.mo17626d(3);
        a.mo17627e(Build.VERSION.RELEASE);
        a.mo17624b(Build.VERSION.CODENAME);
        a.mo17625c(C2884h.m8798E(this.f5709a));
        return a.mo17623a();
    }

    /* renamed from: r */
    private CrashlyticsReport.C3054d.C3061d.C3062a.C3064b.C3070d m9024r() {
        CrashlyticsReport.C3054d.C3061d.C3062a.C3064b.C3070d.C3071a a = CrashlyticsReport.C3054d.C3061d.C3062a.C3064b.C3070d.m9564a();
        a.mo17578d(TimerCodec.DISENABLE);
        a.mo17577c(TimerCodec.DISENABLE);
        a.mo17576b(0);
        return a.mo17575a();
    }

    /* renamed from: s */
    private CrashlyticsReport.C3054d.C3061d.C3062a.C3064b.C3072e m9025s(Thread thread, StackTraceElement[] stackTraceElementArr) {
        return m9026t(thread, stackTraceElementArr, 0);
    }

    /* renamed from: t */
    private CrashlyticsReport.C3054d.C3061d.C3062a.C3064b.C3072e m9026t(Thread thread, StackTraceElement[] stackTraceElementArr, int i) {
        CrashlyticsReport.C3054d.C3061d.C3062a.C3064b.C3072e.C3073a a = CrashlyticsReport.C3054d.C3061d.C3062a.C3064b.C3072e.m9572a();
        a.mo17585d(thread.getName());
        a.mo17584c(i);
        a.mo17583b(C3165v.m9862c(m9019m(stackTraceElementArr, i)));
        return a.mo17582a();
    }

    /* renamed from: u */
    private C3165v<CrashlyticsReport.C3054d.C3061d.C3062a.C3064b.C3072e> m9027u(C3044e eVar, Thread thread, int i, boolean z) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(m9026t(thread, eVar.f5929c, i));
        if (z) {
            for (Map.Entry next : Thread.getAllStackTraces().entrySet()) {
                Thread thread2 = (Thread) next.getKey();
                if (!thread2.equals(thread)) {
                    arrayList.add(m9025s(thread2, this.f5712d.mo17428a((StackTraceElement[]) next.getValue())));
                }
            }
        }
        return C3165v.m9862c(arrayList);
    }

    /* renamed from: b */
    public CrashlyticsReport.C3054d.C3061d mo17283b(Throwable th, Thread thread, String str, long j, int i, int i2, boolean z) {
        int i3 = this.f5709a.getResources().getConfiguration().orientation;
        Throwable th2 = th;
        C3044e eVar = new C3044e(th, this.f5712d);
        CrashlyticsReport.C3054d.C3061d.C3076b a = CrashlyticsReport.C3054d.C3061d.m9512a();
        String str2 = str;
        a.mo17602f(str);
        long j2 = j;
        a.mo17601e(j);
        a.mo17598b(m9013g(i3, eVar, thread, i, i2, z));
        a.mo17599c(m9014h(i3));
        return a.mo17597a();
    }

    /* renamed from: c */
    public CrashlyticsReport mo17284c(String str, long j) {
        CrashlyticsReport.C3047a a = m9009a();
        a.mo17451i(m9021o(str, j));
        return a.mo17443a();
    }
}
