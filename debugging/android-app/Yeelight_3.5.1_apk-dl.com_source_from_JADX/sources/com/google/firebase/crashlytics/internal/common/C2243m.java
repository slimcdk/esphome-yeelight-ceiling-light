package com.google.firebase.crashlytics.internal.common;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport;
import com.miot.service.manager.timer.TimerCodec;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import p015c1.C0628a;
import p041h1.C3243d;
import p041h1.C3244e;

/* renamed from: com.google.firebase.crashlytics.internal.common.m */
public class C2243m {

    /* renamed from: e */
    private static final Map<String, Integer> f3619e;

    /* renamed from: f */
    static final String f3620f = String.format(Locale.US, "Crashlytics Android SDK/%s", new Object[]{"18.2.11"});

    /* renamed from: a */
    private final Context f3621a;

    /* renamed from: b */
    private final C2254t f3622b;

    /* renamed from: c */
    private final C2203a f3623c;

    /* renamed from: d */
    private final C3243d f3624d;

    static {
        HashMap hashMap = new HashMap();
        f3619e = hashMap;
        hashMap.put("armeabi", 5);
        hashMap.put("armeabi-v7a", 6);
        hashMap.put("arm64-v8a", 9);
        hashMap.put("x86", 0);
        hashMap.put("x86_64", 1);
    }

    public C2243m(Context context, C2254t tVar, C2203a aVar, C3243d dVar) {
        this.f3621a = context;
        this.f3622b = tVar;
        this.f3623c = aVar;
        this.f3624d = dVar;
    }

    /* renamed from: a */
    private CrashlyticsReport.C2263b m5717a() {
        return CrashlyticsReport.m5793b().mo18658h("18.2.11").mo18654d(this.f3623c.f3514a).mo18655e(this.f3622b.mo18611a()).mo18652b(this.f3623c.f3518e).mo18653c(this.f3623c.f3519f).mo18657g(4);
    }

    /* renamed from: e */
    private static int m5718e() {
        Integer num;
        String str = Build.CPU_ABI;
        if (!TextUtils.isEmpty(str) && (num = f3619e.get(str.toLowerCase(Locale.US))) != null) {
            return num.intValue();
        }
        return 7;
    }

    /* renamed from: f */
    private CrashlyticsReport.C2270e.C2277d.C2278a.C2280b.C2281a m5719f() {
        return CrashlyticsReport.C2270e.C2277d.C2278a.C2280b.C2281a.m5942a().mo18766b(0).mo18768d(0).mo18767c(this.f3623c.f3517d).mo18769e(this.f3623c.f3515b).mo18765a();
    }

    /* renamed from: g */
    private C0628a<CrashlyticsReport.C2270e.C2277d.C2278a.C2280b.C2281a> m5720g() {
        return C0628a.m238e(m5719f());
    }

    /* renamed from: h */
    private CrashlyticsReport.C2270e.C2277d.C2278a m5721h(int i, CrashlyticsReport.C2261a aVar) {
        return CrashlyticsReport.C2270e.C2277d.C2278a.m5923a().mo18750b(Boolean.valueOf(aVar.mo18634b() != 100)).mo18754f(i).mo18752d(m5726m(aVar)).mo18749a();
    }

    /* renamed from: i */
    private CrashlyticsReport.C2270e.C2277d.C2278a m5722i(int i, C3244e eVar, Thread thread, int i2, int i3, boolean z) {
        Boolean bool;
        ActivityManager.RunningAppProcessInfo j = CommonUtils.m5541j(this.f3623c.f3517d, this.f3621a);
        if (j != null) {
            bool = Boolean.valueOf(j.importance != 100);
        } else {
            bool = null;
        }
        return CrashlyticsReport.C2270e.C2277d.C2278a.m5923a().mo18750b(bool).mo18754f(i).mo18752d(m5727n(eVar, thread, i2, i3, z)).mo18749a();
    }

    /* renamed from: j */
    private CrashlyticsReport.C2270e.C2277d.C2293c m5723j(int i) {
        C2209d a = C2209d.m5588a(this.f3621a);
        Float b = a.mo18533b();
        Double valueOf = b != null ? Double.valueOf(b.doubleValue()) : null;
        int c = a.mo18534c();
        boolean o = CommonUtils.m5546o(this.f3621a);
        return CrashlyticsReport.C2270e.C2277d.C2293c.m6006a().mo18826b(valueOf).mo18827c(c).mo18830f(o).mo18829e(i).mo18831g(CommonUtils.m5550s() - CommonUtils.m5532a(this.f3621a)).mo18828d(CommonUtils.m5533b(Environment.getDataDirectory().getPath())).mo18825a();
    }

    /* renamed from: k */
    private CrashlyticsReport.C2270e.C2277d.C2278a.C2280b.C2284c m5724k(C3244e eVar, int i, int i2) {
        return m5725l(eVar, i, i2, 0);
    }

    /* renamed from: l */
    private CrashlyticsReport.C2270e.C2277d.C2278a.C2280b.C2284c m5725l(C3244e eVar, int i, int i2, int i3) {
        String str = eVar.f5226b;
        String str2 = eVar.f5225a;
        StackTraceElement[] stackTraceElementArr = eVar.f5227c;
        int i4 = 0;
        if (stackTraceElementArr == null) {
            stackTraceElementArr = new StackTraceElement[0];
        }
        C3244e eVar2 = eVar.f5228d;
        if (i3 >= i2) {
            C3244e eVar3 = eVar2;
            while (eVar3 != null) {
                eVar3 = eVar3.f5228d;
                i4++;
            }
        }
        CrashlyticsReport.C2270e.C2277d.C2278a.C2280b.C2284c.C2285a d = CrashlyticsReport.C2270e.C2277d.C2278a.C2280b.C2284c.m5960a().mo18787f(str).mo18786e(str2).mo18784c(C0628a.m237b(m5729p(stackTraceElementArr, i))).mo18785d(i4);
        if (eVar2 != null && i4 == 0) {
            d.mo18783b(m5725l(eVar2, i, i2, i3 + 1));
        }
        return d.mo18782a();
    }

    /* renamed from: m */
    private CrashlyticsReport.C2270e.C2277d.C2278a.C2280b m5726m(CrashlyticsReport.C2261a aVar) {
        return CrashlyticsReport.C2270e.C2277d.C2278a.C2280b.m5936a().mo18772b(aVar).mo18775e(m5734u()).mo18773c(m5720g()).mo18771a();
    }

    /* renamed from: n */
    private CrashlyticsReport.C2270e.C2277d.C2278a.C2280b m5727n(C3244e eVar, Thread thread, int i, int i2, boolean z) {
        return CrashlyticsReport.C2270e.C2277d.C2278a.C2280b.m5936a().mo18776f(m5737x(eVar, thread, i, z)).mo18774d(m5724k(eVar, i, i2)).mo18775e(m5734u()).mo18773c(m5720g()).mo18771a();
    }

    /* renamed from: o */
    private CrashlyticsReport.C2270e.C2277d.C2278a.C2280b.C2288e.C2290b m5728o(StackTraceElement stackTraceElement, CrashlyticsReport.C2270e.C2277d.C2278a.C2280b.C2288e.C2290b.C2291a aVar) {
        long j = 0;
        long max = stackTraceElement.isNativeMethod() ? Math.max((long) stackTraceElement.getLineNumber(), 0) : 0;
        String str = stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName();
        String fileName = stackTraceElement.getFileName();
        if (!stackTraceElement.isNativeMethod() && stackTraceElement.getLineNumber() > 0) {
            j = (long) stackTraceElement.getLineNumber();
        }
        return aVar.mo18811e(max).mo18812f(str).mo18808b(fileName).mo18810d(j).mo18807a();
    }

    /* renamed from: p */
    private C0628a<CrashlyticsReport.C2270e.C2277d.C2278a.C2280b.C2288e.C2290b> m5729p(StackTraceElement[] stackTraceElementArr, int i) {
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement o : stackTraceElementArr) {
            arrayList.add(m5728o(o, CrashlyticsReport.C2270e.C2277d.C2278a.C2280b.C2288e.C2290b.m5988a().mo18809c(i)));
        }
        return C0628a.m237b(arrayList);
    }

    /* renamed from: q */
    private CrashlyticsReport.C2270e.C2271a m5730q() {
        return CrashlyticsReport.C2270e.C2271a.m5867a().mo18701e(this.f3622b.mo18612f()).mo18703g(this.f3623c.f3518e).mo18700d(this.f3623c.f3519f).mo18702f(this.f3622b.mo18611a()).mo18698b(this.f3623c.f3520g.mo26397d()).mo18699c(this.f3623c.f3520g.mo26398e()).mo18697a();
    }

    /* renamed from: r */
    private CrashlyticsReport.C2270e m5731r(String str, long j) {
        return CrashlyticsReport.C2270e.m5851a().mo18716l(j).mo18713i(str).mo18711g(f3620f).mo18706b(m5730q()).mo18715k(m5733t()).mo18708d(m5732s()).mo18712h(3).mo18705a();
    }

    /* renamed from: s */
    private CrashlyticsReport.C2270e.C2275c m5732s() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        int e = m5718e();
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        long s = CommonUtils.m5550s();
        long blockCount = ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize());
        boolean y = CommonUtils.m5556y(this.f3621a);
        int m = CommonUtils.m5544m(this.f3621a);
        String str = Build.MANUFACTURER;
        return CrashlyticsReport.C2270e.C2275c.m5896a().mo18728b(e).mo18732f(Build.MODEL).mo18729c(availableProcessors).mo18734h(s).mo18730d(blockCount).mo18735i(y).mo18736j(m).mo18731e(str).mo18733g(Build.PRODUCT).mo18727a();
    }

    /* renamed from: t */
    private CrashlyticsReport.C2270e.C2297e m5733t() {
        return CrashlyticsReport.C2270e.C2297e.m6024a().mo18842d(3).mo18843e(Build.VERSION.RELEASE).mo18840b(Build.VERSION.CODENAME).mo18841c(CommonUtils.m5557z(this.f3621a)).mo18839a();
    }

    /* renamed from: u */
    private CrashlyticsReport.C2270e.C2277d.C2278a.C2280b.C2286d m5734u() {
        return CrashlyticsReport.C2270e.C2277d.C2278a.C2280b.C2286d.m5972a().mo18794d(TimerCodec.DISENABLE).mo18793c(TimerCodec.DISENABLE).mo18792b(0).mo18791a();
    }

    /* renamed from: v */
    private CrashlyticsReport.C2270e.C2277d.C2278a.C2280b.C2288e m5735v(Thread thread, StackTraceElement[] stackTraceElementArr) {
        return m5736w(thread, stackTraceElementArr, 0);
    }

    /* renamed from: w */
    private CrashlyticsReport.C2270e.C2277d.C2278a.C2280b.C2288e m5736w(Thread thread, StackTraceElement[] stackTraceElementArr, int i) {
        return CrashlyticsReport.C2270e.C2277d.C2278a.C2280b.C2288e.m5980a().mo18801d(thread.getName()).mo18800c(i).mo18799b(C0628a.m237b(m5729p(stackTraceElementArr, i))).mo18798a();
    }

    /* renamed from: x */
    private C0628a<CrashlyticsReport.C2270e.C2277d.C2278a.C2280b.C2288e> m5737x(C3244e eVar, Thread thread, int i, boolean z) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(m5736w(thread, eVar.f5227c, i));
        if (z) {
            for (Map.Entry next : Thread.getAllStackTraces().entrySet()) {
                Thread thread2 = (Thread) next.getKey();
                if (!thread2.equals(thread)) {
                    arrayList.add(m5735v(thread2, this.f3624d.mo23793a((StackTraceElement[]) next.getValue())));
                }
            }
        }
        return C0628a.m237b(arrayList);
    }

    /* renamed from: b */
    public CrashlyticsReport.C2270e.C2277d mo18601b(CrashlyticsReport.C2261a aVar) {
        int i = this.f3621a.getResources().getConfiguration().orientation;
        return CrashlyticsReport.C2270e.C2277d.m5916a().mo18818f("anr").mo18817e(aVar.mo18640h()).mo18814b(m5721h(i, aVar)).mo18815c(m5723j(i)).mo18813a();
    }

    /* renamed from: c */
    public CrashlyticsReport.C2270e.C2277d mo18602c(Throwable th, Thread thread, String str, long j, int i, int i2, boolean z) {
        int i3 = this.f3621a.getResources().getConfiguration().orientation;
        Throwable th2 = th;
        String str2 = str;
        long j2 = j;
        return CrashlyticsReport.C2270e.C2277d.m5916a().mo18818f(str).mo18817e(j).mo18814b(m5722i(i3, new C3244e(th, this.f3624d), thread, i, i2, z)).mo18815c(m5723j(i3)).mo18813a();
    }

    /* renamed from: d */
    public CrashlyticsReport mo18603d(String str, long j) {
        return m5717a().mo18659i(m5731r(str, j)).mo18651a();
    }
}
