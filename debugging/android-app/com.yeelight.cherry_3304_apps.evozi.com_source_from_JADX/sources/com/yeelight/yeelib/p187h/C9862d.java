package com.yeelight.yeelib.p187h;

import com.yeelight.yeelib.p152f.C4201a;
import com.yeelight.yeelib.p187h.C9863e;
import com.yeelight.yeelib.p187h.p189h.C9874b;
import java.util.Map;

/* renamed from: com.yeelight.yeelib.h.d */
public class C9862d {
    /* renamed from: a */
    public static <T> void m24131a(String str, Class<T> cls, C9874b<T> bVar) {
        m24132b(str, (Map<String, String>) null, (Map<String, String>) null, (String) null, cls, bVar);
    }

    /* renamed from: b */
    public static <T> void m24132b(String str, Map<String, String> map, Map<String, String> map2, String str2, Class<T> cls, C9874b<T> bVar) {
        m24137g(str, map, map2, str2).mo31917d(cls, bVar);
    }

    /* renamed from: c */
    public static <T> void m24133c(String str, Class<T> cls, C9874b<T> bVar) {
        m24135e(str, (Map<String, String>) null, (Map<String, String>) null, cls, bVar, true);
    }

    /* renamed from: d */
    public static <T> void m24134d(String str, Class<T> cls, C9874b<T> bVar, boolean z) {
        m24135e(str, (Map<String, String>) null, (Map<String, String>) null, cls, bVar, z);
    }

    /* renamed from: e */
    public static <T> void m24135e(String str, Map<String, String> map, Map<String, String> map2, Class<T> cls, C9874b<T> bVar, boolean z) {
        if (!z || C4201a.m11607r().mo23450q() != null) {
            m24137g(str, map, map2, (String) null).mo31918f(cls, bVar);
        } else if (bVar != null) {
            bVar.onFailure(10001, "Account expiresIn");
        }
    }

    /* renamed from: f */
    private static C9863e m24136f(String str, Map<String, String> map, Map<String, String> map2, C9859a aVar, String str2) {
        C9863e.C9865b bVar = new C9863e.C9865b();
        bVar.mo31928m(str);
        bVar.mo31927l(map);
        bVar.mo31926k(map2);
        bVar.mo31925j(aVar);
        bVar.mo31923g(str2);
        return bVar.mo31924h();
    }

    /* renamed from: g */
    private static C9863e m24137g(String str, Map<String, String> map, Map<String, String> map2, String str2) {
        return m24136f(str, map, map2, C9859a.DEFAULT, str2);
    }

    /* renamed from: h */
    public static <T> void m24138h(String str, String str2, Class<T> cls, C9874b<T> bVar) {
        m24140j(str, (Map<String, String>) null, (Map<String, String>) null, str2, cls, bVar, true);
    }

    /* renamed from: i */
    public static <T> void m24139i(String str, String str2, Class<T> cls, C9874b<T> bVar, boolean z) {
        m24140j(str, (Map<String, String>) null, (Map<String, String>) null, str2, cls, bVar, z);
    }

    /* renamed from: j */
    public static <T> void m24140j(String str, Map<String, String> map, Map<String, String> map2, String str2, Class<T> cls, C9874b<T> bVar, boolean z) {
        if (!z || C4201a.m11607r().mo23450q() != null) {
            m24137g(str, map, map2, str2).mo31919i(cls, bVar);
        } else if (bVar != null) {
            bVar.onFailure(10001, "Account expiresIn");
        }
    }

    /* renamed from: k */
    public static <T> void m24141k(String str, Map<String, String> map, Map<String, String> map2, String str2, Class<T> cls, C9874b<T> bVar, boolean z, C9859a aVar) {
        if (!z || C4201a.m11607r().mo23450q() != null) {
            m24136f(str, map, map2, aVar, str2).mo31919i(cls, bVar);
        } else if (bVar != null) {
            bVar.onFailure(10001, "Account expiresIn");
        }
    }

    /* renamed from: l */
    public static <T> void m24142l(String str, String str2, Class<T> cls, C9874b<T> bVar) {
        m24143m(str, (Map<String, String>) null, (Map<String, String>) null, str2, cls, bVar);
    }

    /* renamed from: m */
    public static <T> void m24143m(String str, Map<String, String> map, Map<String, String> map2, String str2, Class<T> cls, C9874b<T> bVar) {
        m24137g(str, map, map2, str2).mo31920j(cls, bVar);
    }
}
