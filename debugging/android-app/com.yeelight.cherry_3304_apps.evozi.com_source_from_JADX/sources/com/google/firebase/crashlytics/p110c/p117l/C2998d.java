package com.google.firebase.crashlytics.p110c.p117l;

import android.app.ActivityManager;
import com.google.firebase.crashlytics.p110c.C2857b;
import com.google.firebase.crashlytics.p110c.p125p.C3044e;
import com.miot.service.manager.timer.TimerCodec;
import com.xiaomi.mipush.sdk.Constants;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.firebase.crashlytics.c.l.d */
public class C2998d {

    /* renamed from: a */
    private static final C2993a f5832a = C2993a.m9215c(TimerCodec.DISENABLE);

    /* renamed from: b */
    private static final C2993a f5833b = C2993a.m9215c("Unity");

    /* renamed from: A */
    private static void m9267A(C2996c cVar, C2993a aVar) {
        if (aVar != null) {
            cVar.mo17385W(6, 2);
            cVar.mo17381R(m9278h(aVar));
            cVar.mo17393z(1, aVar);
        }
    }

    /* renamed from: B */
    public static void m9268B(C2996c cVar, String str, String str2, boolean z) {
        C2993a c = C2993a.m9215c(str);
        C2993a c2 = C2993a.m9215c(str2);
        cVar.mo17385W(8, 2);
        cVar.mo17381R(m9283m(c, c2, z));
        cVar.mo17369B(1, 3);
        cVar.mo17393z(2, c);
        cVar.mo17393z(3, c2);
        cVar.mo17391x(4, z);
    }

    /* renamed from: C */
    public static void m9269C(C2996c cVar, String str, String str2, String str3) {
        if (str == null) {
            str = "";
        }
        C2993a c = C2993a.m9215c(str);
        C2993a o = m9285o(str2);
        C2993a o2 = m9285o(str3);
        int c2 = C2996c.m9222c(1, c) + 0;
        if (str2 != null) {
            c2 += C2996c.m9222c(2, o);
        }
        if (str3 != null) {
            c2 += C2996c.m9222c(3, o2);
        }
        cVar.mo17385W(6, 2);
        cVar.mo17381R(c2);
        cVar.mo17393z(1, c);
        if (str2 != null) {
            cVar.mo17393z(2, o);
        }
        if (str3 != null) {
            cVar.mo17393z(3, o2);
        }
    }

    /* renamed from: D */
    private static void m9270D(C2996c cVar, Thread thread, StackTraceElement[] stackTraceElementArr, int i, boolean z) {
        cVar.mo17385W(1, 2);
        cVar.mo17381R(m9284n(thread, stackTraceElementArr, i, z));
        cVar.mo17393z(1, C2993a.m9215c(thread.getName()));
        cVar.mo17386X(2, i);
        for (StackTraceElement q : stackTraceElementArr) {
            m9287q(cVar, 3, q, z);
        }
    }

    /* renamed from: a */
    private static int m9271a(C2993a aVar, C2993a aVar2) {
        int r = C2996c.m9236r(1, 0) + 0 + C2996c.m9236r(2, 0) + C2996c.m9222c(3, aVar);
        return aVar2 != null ? r + C2996c.m9222c(4, aVar2) : r;
    }

    /* renamed from: b */
    private static int m9272b(String str, String str2) {
        int c = C2996c.m9222c(1, C2993a.m9215c(str));
        if (str2 == null) {
            str2 = "";
        }
        return c + C2996c.m9222c(2, C2993a.m9215c(str2));
    }

    /* renamed from: c */
    private static int m9273c(C3044e eVar, int i, int i2) {
        int i3 = 0;
        int c = C2996c.m9222c(1, C2993a.m9215c(eVar.f5928b)) + 0;
        String str = eVar.f5927a;
        if (str != null) {
            c += C2996c.m9222c(3, C2993a.m9215c(str));
        }
        for (StackTraceElement i4 : eVar.f5929c) {
            int i5 = m9279i(i4, true);
            c += C2996c.m9233o(4) + C2996c.m9229k(i5) + i5;
        }
        C3044e eVar2 = eVar.f5930d;
        if (eVar2 == null) {
            return c;
        }
        if (i < i2) {
            int c2 = m9273c(eVar2, i + 1, i2);
            return c + C2996c.m9233o(6) + C2996c.m9229k(c2) + c2;
        }
        while (eVar2 != null) {
            eVar2 = eVar2.f5930d;
            i3++;
        }
        return c + C2996c.m9234p(7, i3);
    }

    /* renamed from: d */
    private static int m9274d() {
        return C2996c.m9222c(1, f5832a) + 0 + C2996c.m9222c(2, f5832a) + C2996c.m9236r(3, 0);
    }

    /* renamed from: e */
    private static int m9275e(C3044e eVar, Thread thread, StackTraceElement[] stackTraceElementArr, Thread[] threadArr, List<StackTraceElement[]> list, int i, C2993a aVar, C2993a aVar2) {
        int n = m9284n(thread, stackTraceElementArr, 4, true);
        int o = C2996c.m9233o(1) + C2996c.m9229k(n) + n + 0;
        int length = threadArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            int n2 = m9284n(threadArr[i2], list.get(i2), 0, false);
            o += C2996c.m9233o(1) + C2996c.m9229k(n2) + n2;
        }
        int c = m9273c(eVar, 1, i);
        int d = m9274d();
        int a = m9271a(aVar, aVar2);
        return o + C2996c.m9233o(2) + C2996c.m9229k(c) + c + C2996c.m9233o(3) + C2996c.m9229k(d) + d + C2996c.m9233o(3) + C2996c.m9229k(a) + a;
    }

    /* renamed from: f */
    private static int m9276f(C3044e eVar, Thread thread, StackTraceElement[] stackTraceElementArr, Thread[] threadArr, List<StackTraceElement[]> list, int i, C2993a aVar, C2993a aVar2, Map<String, String> map, ActivityManager.RunningAppProcessInfo runningAppProcessInfo, int i2) {
        int e = m9275e(eVar, thread, stackTraceElementArr, threadArr, list, i, aVar, aVar2);
        boolean z = true;
        int o = C2996c.m9233o(1) + C2996c.m9229k(e) + e + 0;
        if (map != null) {
            for (Map.Entry next : map.entrySet()) {
                int b = m9272b((String) next.getKey(), (String) next.getValue());
                o += C2996c.m9233o(2) + C2996c.m9229k(b) + b;
            }
        }
        if (runningAppProcessInfo != null) {
            if (runningAppProcessInfo.importance == 100) {
                z = false;
            }
            o += C2996c.m9220a(3, z);
        }
        return o + C2996c.m9234p(4, i2);
    }

    /* renamed from: g */
    private static int m9277g(Float f, int i, boolean z, int i2, long j, long j2) {
        int i3 = 0;
        if (f != null) {
            i3 = 0 + C2996c.m9226h(1, f.floatValue());
        }
        return i3 + C2996c.m9231m(2, i) + C2996c.m9220a(3, z) + C2996c.m9234p(4, i2) + C2996c.m9236r(5, j) + C2996c.m9236r(6, j2);
    }

    /* renamed from: h */
    private static int m9278h(C2993a aVar) {
        return C2996c.m9222c(1, aVar);
    }

    /* renamed from: i */
    private static int m9279i(StackTraceElement stackTraceElement, boolean z) {
        int i = 0;
        long max = stackTraceElement.isNativeMethod() ? (long) Math.max(stackTraceElement.getLineNumber(), 0) : 0;
        int r = C2996c.m9236r(1, max) + 0 + C2996c.m9222c(2, C2993a.m9215c(stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName()));
        if (stackTraceElement.getFileName() != null) {
            r += C2996c.m9222c(3, C2993a.m9215c(stackTraceElement.getFileName()));
        }
        if (!stackTraceElement.isNativeMethod() && stackTraceElement.getLineNumber() > 0) {
            r += C2996c.m9236r(4, (long) stackTraceElement.getLineNumber());
        }
        if (z) {
            i = 2;
        }
        return r + C2996c.m9234p(5, i);
    }

    /* renamed from: j */
    private static int m9280j(C2993a aVar, C2993a aVar2, C2993a aVar3, C2993a aVar4, int i, C2993a aVar5) {
        int c = C2996c.m9222c(1, aVar) + 0 + C2996c.m9222c(2, aVar2) + C2996c.m9222c(3, aVar3) + C2996c.m9222c(6, aVar4);
        if (aVar5 != null) {
            c = c + C2996c.m9222c(8, f5833b) + C2996c.m9222c(9, aVar5);
        }
        return c + C2996c.m9224e(10, i);
    }

    /* renamed from: k */
    private static int m9281k(int i, C2993a aVar, int i2, long j, long j2, boolean z, int i3, C2993a aVar2, C2993a aVar3) {
        int i4 = 0;
        int e = C2996c.m9224e(3, i) + 0 + (aVar == null ? 0 : C2996c.m9222c(4, aVar)) + C2996c.m9234p(5, i2) + C2996c.m9236r(6, j) + C2996c.m9236r(7, j2) + C2996c.m9220a(10, z) + C2996c.m9234p(12, i3) + (aVar2 == null ? 0 : C2996c.m9222c(13, aVar2));
        if (aVar3 != null) {
            i4 = C2996c.m9222c(14, aVar3);
        }
        return e + i4;
    }

    /* renamed from: l */
    private static int m9282l(long j, String str, C3044e eVar, Thread thread, StackTraceElement[] stackTraceElementArr, Thread[] threadArr, List<StackTraceElement[]> list, int i, Map<String, String> map, ActivityManager.RunningAppProcessInfo runningAppProcessInfo, int i2, C2993a aVar, C2993a aVar2, Float f, int i3, boolean z, long j2, long j3, C2993a aVar3) {
        long j4 = j;
        int r = C2996c.m9236r(1, j) + 0 + C2996c.m9222c(2, C2993a.m9215c(str));
        int f2 = m9276f(eVar, thread, stackTraceElementArr, threadArr, list, i, aVar, aVar2, map, runningAppProcessInfo, i2);
        int g = m9277g(f, i3, z, i2, j2, j3);
        int o = r + C2996c.m9233o(3) + C2996c.m9229k(f2) + f2 + C2996c.m9233o(5) + C2996c.m9229k(g) + g;
        if (aVar3 == null) {
            return o;
        }
        int h = m9278h(aVar3);
        return o + C2996c.m9233o(6) + C2996c.m9229k(h) + h;
    }

    /* renamed from: m */
    private static int m9283m(C2993a aVar, C2993a aVar2, boolean z) {
        return C2996c.m9224e(1, 3) + 0 + C2996c.m9222c(2, aVar) + C2996c.m9222c(3, aVar2) + C2996c.m9220a(4, z);
    }

    /* renamed from: n */
    private static int m9284n(Thread thread, StackTraceElement[] stackTraceElementArr, int i, boolean z) {
        int c = C2996c.m9222c(1, C2993a.m9215c(thread.getName())) + C2996c.m9234p(2, i);
        for (StackTraceElement i2 : stackTraceElementArr) {
            int i3 = m9279i(i2, z);
            c += C2996c.m9233o(3) + C2996c.m9229k(i3) + i3;
        }
        return c;
    }

    /* renamed from: o */
    private static C2993a m9285o(String str) {
        if (str == null) {
            return null;
        }
        return C2993a.m9215c(str);
    }

    /* renamed from: p */
    public static void m9286p(C2996c cVar, String str, String str2, long j) {
        cVar.mo17393z(1, C2993a.m9215c(str2));
        cVar.mo17393z(2, C2993a.m9215c(str));
        cVar.mo17388a0(3, j);
    }

    /* renamed from: q */
    private static void m9287q(C2996c cVar, int i, StackTraceElement stackTraceElement, boolean z) {
        cVar.mo17385W(i, 2);
        cVar.mo17381R(m9279i(stackTraceElement, z));
        int i2 = 0;
        cVar.mo17388a0(1, stackTraceElement.isNativeMethod() ? (long) Math.max(stackTraceElement.getLineNumber(), 0) : 0);
        cVar.mo17393z(2, C2993a.m9215c(stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName()));
        if (stackTraceElement.getFileName() != null) {
            cVar.mo17393z(3, C2993a.m9215c(stackTraceElement.getFileName()));
        }
        if (!stackTraceElement.isNativeMethod() && stackTraceElement.getLineNumber() > 0) {
            cVar.mo17388a0(4, (long) stackTraceElement.getLineNumber());
        }
        if (z) {
            i2 = 4;
        }
        cVar.mo17386X(5, i2);
    }

    /* renamed from: r */
    public static void m9288r(C2996c cVar, String str, String str2, String str3, String str4, int i, String str5) {
        C2993a c = C2993a.m9215c(str);
        C2993a c2 = C2993a.m9215c(str2);
        C2993a c3 = C2993a.m9215c(str3);
        C2993a c4 = C2993a.m9215c(str4);
        C2993a c5 = str5 != null ? C2993a.m9215c(str5) : null;
        cVar.mo17385W(7, 2);
        cVar.mo17381R(m9280j(c, c2, c3, c4, i, c5));
        cVar.mo17393z(1, c);
        cVar.mo17393z(2, c2);
        cVar.mo17393z(3, c3);
        cVar.mo17393z(6, c4);
        if (c5 != null) {
            cVar.mo17393z(8, f5833b);
            cVar.mo17393z(9, c5);
        }
        cVar.mo17369B(10, i);
    }

    /* renamed from: s */
    public static void m9289s(C2996c cVar, String str) {
        C2993a c = C2993a.m9215c(str);
        cVar.mo17385W(7, 2);
        int c2 = C2996c.m9222c(2, c);
        cVar.mo17381R(C2996c.m9233o(5) + C2996c.m9229k(c2) + c2);
        cVar.mo17385W(5, 2);
        cVar.mo17381R(c2);
        cVar.mo17393z(2, c);
    }

    /* renamed from: t */
    public static void m9290t(C2996c cVar, int i, String str, int i2, long j, long j2, boolean z, int i3, String str2, String str3) {
        C2996c cVar2 = cVar;
        C2993a o = m9285o(str);
        C2993a o2 = m9285o(str3);
        C2993a o3 = m9285o(str2);
        cVar.mo17385W(9, 2);
        cVar.mo17381R(m9281k(i, o, i2, j, j2, z, i3, o3, o2));
        cVar.mo17369B(3, i);
        cVar.mo17393z(4, o);
        cVar.mo17386X(5, i2);
        cVar.mo17388a0(6, j);
        cVar.mo17388a0(7, j2);
        cVar.mo17391x(10, z);
        cVar.mo17386X(12, i3);
        if (o3 != null) {
            cVar.mo17393z(13, o3);
        }
        if (o2 != null) {
            cVar.mo17393z(14, o2);
        }
    }

    /* renamed from: u */
    public static void m9291u(C2996c cVar, long j, String str, C3044e eVar, Thread thread, StackTraceElement[] stackTraceElementArr, Thread[] threadArr, List<StackTraceElement[]> list, int i, Map<String, String> map, byte[] bArr, ActivityManager.RunningAppProcessInfo runningAppProcessInfo, int i2, String str2, String str3, Float f, int i3, boolean z, long j2, long j3) {
        C2996c cVar2 = cVar;
        String str4 = str3;
        C2993a c = C2993a.m9215c(str2);
        C2993a aVar = null;
        C2993a c2 = str4 == null ? null : C2993a.m9215c(str4.replace(Constants.ACCEPT_TIME_SEPARATOR_SERVER, ""));
        if (bArr != null) {
            aVar = C2993a.m9213a(bArr);
        } else {
            C2857b.m8687f().mo17130b("No log data to include with this event.");
        }
        C2993a aVar2 = aVar;
        cVar2.mo17385W(10, 2);
        cVar2.mo17381R(m9282l(j, str, eVar, thread, stackTraceElementArr, threadArr, list, i, map, runningAppProcessInfo, i2, c, c2, f, i3, z, j2, j3, aVar2));
        cVar2.mo17388a0(1, j);
        cVar2.mo17393z(2, C2993a.m9215c(str));
        m9292v(cVar, eVar, thread, stackTraceElementArr, threadArr, list, i, c, c2, map, runningAppProcessInfo, i2);
        m9296z(cVar, f, i3, z, i2, j2, j3);
        m9267A(cVar2, aVar2);
    }

    /* renamed from: v */
    private static void m9292v(C2996c cVar, C3044e eVar, Thread thread, StackTraceElement[] stackTraceElementArr, Thread[] threadArr, List<StackTraceElement[]> list, int i, C2993a aVar, C2993a aVar2, Map<String, String> map, ActivityManager.RunningAppProcessInfo runningAppProcessInfo, int i2) {
        cVar.mo17385W(3, 2);
        cVar.mo17381R(m9276f(eVar, thread, stackTraceElementArr, threadArr, list, i, aVar, aVar2, map, runningAppProcessInfo, i2));
        m9294x(cVar, eVar, thread, stackTraceElementArr, threadArr, list, i, aVar, aVar2);
        if (map != null && !map.isEmpty()) {
            m9293w(cVar, map);
        }
        if (runningAppProcessInfo != null) {
            cVar.mo17391x(3, runningAppProcessInfo.importance != 100);
        }
        cVar.mo17386X(4, i2);
    }

    /* renamed from: w */
    private static void m9293w(C2996c cVar, Map<String, String> map) {
        for (Map.Entry next : map.entrySet()) {
            cVar.mo17385W(2, 2);
            cVar.mo17381R(m9272b((String) next.getKey(), (String) next.getValue()));
            cVar.mo17393z(1, C2993a.m9215c((String) next.getKey()));
            String str = (String) next.getValue();
            if (str == null) {
                str = "";
            }
            cVar.mo17393z(2, C2993a.m9215c(str));
        }
    }

    /* renamed from: x */
    private static void m9294x(C2996c cVar, C3044e eVar, Thread thread, StackTraceElement[] stackTraceElementArr, Thread[] threadArr, List<StackTraceElement[]> list, int i, C2993a aVar, C2993a aVar2) {
        cVar.mo17385W(1, 2);
        cVar.mo17381R(m9275e(eVar, thread, stackTraceElementArr, threadArr, list, i, aVar, aVar2));
        m9270D(cVar, thread, stackTraceElementArr, 4, true);
        int length = threadArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            m9270D(cVar, threadArr[i2], list.get(i2), 0, false);
        }
        m9295y(cVar, eVar, 1, i, 2);
        cVar.mo17385W(3, 2);
        cVar.mo17381R(m9274d());
        cVar.mo17393z(1, f5832a);
        cVar.mo17393z(2, f5832a);
        cVar.mo17388a0(3, 0);
        cVar.mo17385W(4, 2);
        cVar.mo17381R(m9271a(aVar, aVar2));
        cVar.mo17388a0(1, 0);
        cVar.mo17388a0(2, 0);
        cVar.mo17393z(3, aVar);
        if (aVar2 != null) {
            cVar.mo17393z(4, aVar2);
        }
    }

    /* renamed from: y */
    private static void m9295y(C2996c cVar, C3044e eVar, int i, int i2, int i3) {
        cVar.mo17385W(i3, 2);
        cVar.mo17381R(m9273c(eVar, 1, i2));
        cVar.mo17393z(1, C2993a.m9215c(eVar.f5928b));
        String str = eVar.f5927a;
        if (str != null) {
            cVar.mo17393z(3, C2993a.m9215c(str));
        }
        int i4 = 0;
        for (StackTraceElement q : eVar.f5929c) {
            m9287q(cVar, 4, q, true);
        }
        C3044e eVar2 = eVar.f5930d;
        if (eVar2 == null) {
            return;
        }
        if (i < i2) {
            m9295y(cVar, eVar2, i + 1, i2, 6);
            return;
        }
        while (eVar2 != null) {
            eVar2 = eVar2.f5930d;
            i4++;
        }
        cVar.mo17386X(7, i4);
    }

    /* renamed from: z */
    private static void m9296z(C2996c cVar, Float f, int i, boolean z, int i2, long j, long j2) {
        cVar.mo17385W(5, 2);
        cVar.mo17381R(m9277g(f, i, z, i2, j, j2));
        if (f != null) {
            cVar.mo17371D(1, f.floatValue());
        }
        cVar.mo17383T(2, i);
        cVar.mo17391x(3, z);
        cVar.mo17386X(4, i2);
        cVar.mo17388a0(5, j);
        cVar.mo17388a0(6, j2);
    }
}
