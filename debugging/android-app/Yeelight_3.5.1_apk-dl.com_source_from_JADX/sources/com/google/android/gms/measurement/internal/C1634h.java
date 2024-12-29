package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.util.EnumMap;

/* renamed from: com.google.android.gms.measurement.internal.h */
public final class C1634h {

    /* renamed from: b */
    public static final C1634h f2129b = new C1634h((Boolean) null, (Boolean) null);

    /* renamed from: a */
    private final EnumMap f2130a;

    public C1634h(Boolean bool, Boolean bool2) {
        EnumMap enumMap = new EnumMap(zzah.class);
        this.f2130a = enumMap;
        enumMap.put(zzah.AD_STORAGE, bool);
        enumMap.put(zzah.ANALYTICS_STORAGE, bool2);
    }

    public C1634h(EnumMap enumMap) {
        EnumMap enumMap2 = new EnumMap(zzah.class);
        this.f2130a = enumMap2;
        enumMap2.putAll(enumMap);
    }

    /* renamed from: a */
    public static C1634h m4272a(Bundle bundle) {
        if (bundle == null) {
            return f2129b;
        }
        EnumMap enumMap = new EnumMap(zzah.class);
        for (zzah zzah : zzah.values()) {
            enumMap.put(zzah, m4277n(bundle.getString(zzah.zzd)));
        }
        return new C1634h(enumMap);
    }

    /* renamed from: b */
    public static C1634h m4273b(String str) {
        EnumMap enumMap = new EnumMap(zzah.class);
        if (str != null) {
            int i = 0;
            while (true) {
                zzah[] zzahArr = zzah.zzc;
                int length = zzahArr.length;
                if (i >= 2) {
                    break;
                }
                zzah zzah = zzahArr[i];
                int i2 = i + 2;
                if (i2 < str.length()) {
                    char charAt = str.charAt(i2);
                    Boolean bool = null;
                    if (charAt != '-') {
                        if (charAt == '0') {
                            bool = Boolean.FALSE;
                        } else if (charAt == '1') {
                            bool = Boolean.TRUE;
                        }
                    }
                    enumMap.put(zzah, bool);
                }
                i++;
            }
        }
        return new C1634h(enumMap);
    }

    /* renamed from: g */
    public static String m4274g(Bundle bundle) {
        String string;
        for (zzah zzah : zzah.values()) {
            if (bundle.containsKey(zzah.zzd) && (string = bundle.getString(zzah.zzd)) != null && m4277n(string) == null) {
                return string;
            }
        }
        return null;
    }

    /* renamed from: j */
    public static boolean m4275j(int i, int i2) {
        return i <= i2;
    }

    /* renamed from: m */
    static final int m4276m(Boolean bool) {
        if (bool == null) {
            return 0;
        }
        return bool.booleanValue() ? 1 : 2;
    }

    /* renamed from: n */
    private static Boolean m4277n(String str) {
        if (str == null) {
            return null;
        }
        if (str.equals("granted")) {
            return Boolean.TRUE;
        }
        if (str.equals("denied")) {
            return Boolean.FALSE;
        }
        return null;
    }

    /* renamed from: c */
    public final C1634h mo14214c(C1634h hVar) {
        EnumMap enumMap = new EnumMap(zzah.class);
        for (zzah zzah : zzah.values()) {
            Boolean bool = (Boolean) this.f2130a.get(zzah);
            Boolean bool2 = (Boolean) hVar.f2130a.get(zzah);
            if (bool == null) {
                bool = bool2;
            } else if (bool2 != null) {
                bool = Boolean.valueOf(bool.booleanValue() && bool2.booleanValue());
            }
            enumMap.put(zzah, bool);
        }
        return new C1634h(enumMap);
    }

    /* renamed from: d */
    public final C1634h mo14215d(C1634h hVar) {
        EnumMap enumMap = new EnumMap(zzah.class);
        for (zzah zzah : zzah.values()) {
            Boolean bool = (Boolean) this.f2130a.get(zzah);
            if (bool == null) {
                bool = (Boolean) hVar.f2130a.get(zzah);
            }
            enumMap.put(zzah, bool);
        }
        return new C1634h(enumMap);
    }

    /* renamed from: e */
    public final Boolean mo14216e() {
        return (Boolean) this.f2130a.get(zzah.AD_STORAGE);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1634h)) {
            return false;
        }
        C1634h hVar = (C1634h) obj;
        for (zzah zzah : zzah.values()) {
            if (m4276m((Boolean) this.f2130a.get(zzah)) != m4276m((Boolean) hVar.f2130a.get(zzah))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public final Boolean mo14218f() {
        return (Boolean) this.f2130a.get(zzah.ANALYTICS_STORAGE);
    }

    /* renamed from: h */
    public final String mo14219h() {
        StringBuilder sb = new StringBuilder("G1");
        zzah[] zzahArr = zzah.zzc;
        int length = zzahArr.length;
        for (int i = 0; i < 2; i++) {
            Boolean bool = (Boolean) this.f2130a.get(zzahArr[i]);
            sb.append(bool == null ? '-' : bool.booleanValue() ? '1' : '0');
        }
        return sb.toString();
    }

    public final int hashCode() {
        int i = 17;
        for (Boolean m : this.f2130a.values()) {
            i = (i * 31) + m4276m(m);
        }
        return i;
    }

    /* renamed from: i */
    public final boolean mo14221i(zzah zzah) {
        Boolean bool = (Boolean) this.f2130a.get(zzah);
        return bool == null || bool.booleanValue();
    }

    /* renamed from: k */
    public final boolean mo14222k(C1634h hVar) {
        return mo14223l(hVar, (zzah[]) this.f2130a.keySet().toArray(new zzah[0]));
    }

    /* renamed from: l */
    public final boolean mo14223l(C1634h hVar, zzah... zzahArr) {
        for (zzah zzah : zzahArr) {
            Boolean bool = (Boolean) this.f2130a.get(zzah);
            Boolean bool2 = (Boolean) hVar.f2130a.get(zzah);
            Boolean bool3 = Boolean.FALSE;
            if (bool == bool3 && bool2 != bool3) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("settings: ");
        zzah[] values = zzah.values();
        int length = values.length;
        for (int i = 0; i < length; i++) {
            zzah zzah = values[i];
            if (i != 0) {
                sb.append(", ");
            }
            sb.append(zzah.name());
            sb.append("=");
            Boolean bool = (Boolean) this.f2130a.get(zzah);
            sb.append(bool == null ? "uninitialized" : true != bool.booleanValue() ? "denied" : "granted");
        }
        return sb.toString();
    }
}
