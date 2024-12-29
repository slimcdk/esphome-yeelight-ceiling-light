package p129b4;

import com.yeelight.yeelib.managers.C3051a;
import com.yeelight.yeelib.retrofit.ContentType;
import java.util.Map;
import p129b4.C3989c;
import p134c4.C4007b;

/* renamed from: b4.b */
public class C3988b {
    /* renamed from: a */
    public static <T> void m11565a(String str, Class<T> cls, C4007b<T> bVar) {
        m11566b(str, (Map<String, String>) null, (Map<String, String>) null, (String) null, cls, bVar);
    }

    /* renamed from: b */
    public static <T> void m11566b(String str, Map<String, String> map, Map<String, String> map2, String str2, Class<T> cls, C4007b<T> bVar) {
        m11571g(str, map, map2, str2).mo26571d(cls, bVar);
    }

    /* renamed from: c */
    public static <T> void m11567c(String str, Class<T> cls, C4007b<T> bVar) {
        m11569e(str, (Map<String, String>) null, (Map<String, String>) null, cls, bVar, true);
    }

    /* renamed from: d */
    public static <T> void m11568d(String str, Class<T> cls, C4007b<T> bVar, boolean z) {
        m11569e(str, (Map<String, String>) null, (Map<String, String>) null, cls, bVar, z);
    }

    /* renamed from: e */
    public static <T> void m11569e(String str, Map<String, String> map, Map<String, String> map2, Class<T> cls, C4007b<T> bVar, boolean z) {
        if (!z || C3051a.m7925r().mo23364q() != null) {
            m11571g(str, map, map2, (String) null).mo26572f(cls, bVar);
        } else if (bVar != null) {
            bVar.onFailure(10001, "Account expiresIn");
        }
    }

    /* renamed from: f */
    private static C3989c m11570f(String str, Map<String, String> map, Map<String, String> map2, ContentType contentType, String str2) {
        return new C3989c.C3991b().mo26582m(str).mo26581l(map).mo26580k(map2).mo26579j(contentType).mo26577g(str2).mo26578h();
    }

    /* renamed from: g */
    private static C3989c m11571g(String str, Map<String, String> map, Map<String, String> map2, String str2) {
        return m11570f(str, map, map2, ContentType.DEFAULT, str2);
    }

    /* renamed from: h */
    public static <T> void m11572h(String str, String str2, Class<T> cls, C4007b<T> bVar) {
        m11574j(str, (Map<String, String>) null, (Map<String, String>) null, str2, cls, bVar, true);
    }

    /* renamed from: i */
    public static <T> void m11573i(String str, String str2, Class<T> cls, C4007b<T> bVar, boolean z) {
        m11574j(str, (Map<String, String>) null, (Map<String, String>) null, str2, cls, bVar, z);
    }

    /* renamed from: j */
    public static <T> void m11574j(String str, Map<String, String> map, Map<String, String> map2, String str2, Class<T> cls, C4007b<T> bVar, boolean z) {
        if (!z || C3051a.m7925r().mo23364q() != null) {
            m11571g(str, map, map2, str2).mo26573i(cls, bVar);
        } else if (bVar != null) {
            bVar.onFailure(10001, "Account expiresIn");
        }
    }

    /* renamed from: k */
    public static <T> void m11575k(String str, Map<String, String> map, Map<String, String> map2, String str2, Class<T> cls, C4007b<T> bVar, boolean z, ContentType contentType) {
        if (!z || C3051a.m7925r().mo23364q() != null) {
            m11570f(str, map, map2, contentType, str2).mo26573i(cls, bVar);
        } else if (bVar != null) {
            bVar.onFailure(10001, "Account expiresIn");
        }
    }

    /* renamed from: l */
    public static <T> void m11576l(String str, String str2, Class<T> cls, C4007b<T> bVar) {
        m11577m(str, (Map<String, String>) null, (Map<String, String>) null, str2, cls, bVar);
    }

    /* renamed from: m */
    public static <T> void m11577m(String str, Map<String, String> map, Map<String, String> map2, String str2, Class<T> cls, C4007b<T> bVar) {
        m11571g(str, map, map2, str2).mo26574j(cls, bVar);
    }
}
