package org.joda.time.chrono;

import java.lang.ref.WeakReference;
import java.text.DateFormatSymbols;
import java.util.Comparator;
import java.util.Locale;
import java.util.TreeMap;
import java.util.WeakHashMap;
import org.joda.time.C10149c;
import org.joda.time.DateTimeFieldType;
import org.joda.time.IllegalFieldValueException;

/* renamed from: org.joda.time.chrono.j */
class C10168j {

    /* renamed from: q */
    private static final C10168j[] f18812q = new C10168j[64];

    /* renamed from: r */
    private static WeakHashMap<Locale, C10168j> f18813r = new WeakHashMap<>();

    /* renamed from: a */
    private final WeakReference<Locale> f18814a;

    /* renamed from: b */
    private final String[] f18815b;

    /* renamed from: c */
    private final String[] f18816c;

    /* renamed from: d */
    private final String[] f18817d;

    /* renamed from: e */
    private final String[] f18818e;

    /* renamed from: f */
    private final String[] f18819f;

    /* renamed from: g */
    private final String[] f18820g;

    /* renamed from: h */
    private final TreeMap<String, Integer> f18821h;

    /* renamed from: i */
    private final TreeMap<String, Integer> f18822i;

    /* renamed from: j */
    private final TreeMap<String, Integer> f18823j;

    /* renamed from: k */
    private final int f18824k;

    /* renamed from: l */
    private final int f18825l;

    /* renamed from: m */
    private final int f18826m;

    /* renamed from: n */
    private final int f18827n;

    /* renamed from: o */
    private final int f18828o;

    /* renamed from: p */
    private final int f18829p;

    private C10168j(Locale locale) {
        this.f18814a = new WeakReference<>(locale);
        DateFormatSymbols c = C10149c.m25338c(locale);
        this.f18815b = c.getEras();
        this.f18816c = m25364u(c.getWeekdays());
        this.f18817d = m25364u(c.getShortWeekdays());
        this.f18818e = m25365v(c.getMonths());
        this.f18819f = m25365v(c.getShortMonths());
        this.f18820g = c.getAmPmStrings();
        Integer[] numArr = new Integer[13];
        for (int i = 0; i < 13; i++) {
            numArr[i] = Integer.valueOf(i);
        }
        Comparator comparator = String.CASE_INSENSITIVE_ORDER;
        TreeMap<String, Integer> treeMap = new TreeMap<>(comparator);
        this.f18821h = treeMap;
        m25361b(treeMap, this.f18815b, numArr);
        if ("en".equals(locale.getLanguage())) {
            treeMap.put("BCE", numArr[0]);
            treeMap.put("CE", numArr[1]);
        }
        TreeMap<String, Integer> treeMap2 = new TreeMap<>(comparator);
        this.f18822i = treeMap2;
        m25361b(treeMap2, this.f18816c, numArr);
        m25361b(treeMap2, this.f18817d, numArr);
        m25360a(treeMap2, 1, 7, numArr);
        TreeMap<String, Integer> treeMap3 = new TreeMap<>(comparator);
        this.f18823j = treeMap3;
        m25361b(treeMap3, this.f18818e, numArr);
        m25361b(treeMap3, this.f18819f, numArr);
        m25360a(treeMap3, 1, 12, numArr);
        this.f18824k = m25363q(this.f18815b);
        this.f18825l = m25363q(this.f18816c);
        this.f18826m = m25363q(this.f18817d);
        this.f18827n = m25363q(this.f18818e);
        this.f18828o = m25363q(this.f18819f);
        this.f18829p = m25363q(this.f18820g);
    }

    /* renamed from: a */
    private static void m25360a(TreeMap<String, Integer> treeMap, int i, int i2, Integer[] numArr) {
        while (i <= i2) {
            treeMap.put(String.valueOf(i).intern(), numArr[i]);
            i++;
        }
    }

    /* renamed from: b */
    private static void m25361b(TreeMap<String, Integer> treeMap, String[] strArr, Integer[] numArr) {
        int length = strArr.length;
        while (true) {
            length--;
            if (length >= 0) {
                String str = strArr[length];
                if (str != null) {
                    treeMap.put(str, numArr[length]);
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: h */
    public static C10168j m25362h(Locale locale) {
        C10168j jVar;
        if (locale == null) {
            locale = Locale.getDefault();
        }
        int identityHashCode = System.identityHashCode(locale) & 63;
        C10168j[] jVarArr = f18812q;
        C10168j jVar2 = jVarArr[identityHashCode];
        if (jVar2 != null && jVar2.f18814a.get() == locale) {
            return jVar2;
        }
        synchronized (f18813r) {
            jVar = f18813r.get(locale);
            if (jVar == null) {
                jVar = new C10168j(locale);
                f18813r.put(locale, jVar);
            }
        }
        jVarArr[identityHashCode] = jVar;
        return jVar;
    }

    /* renamed from: q */
    private static int m25363q(String[] strArr) {
        int length;
        int length2 = strArr.length;
        int i = 0;
        while (true) {
            length2--;
            if (length2 < 0) {
                return i;
            }
            String str = strArr[length2];
            if (str != null && (length = str.length()) > i) {
                i = length;
            }
        }
    }

    /* renamed from: u */
    private static String[] m25364u(String[] strArr) {
        String[] strArr2 = new String[8];
        int i = 1;
        while (i < 8) {
            strArr2[i] = strArr[i < 7 ? i + 1 : 1];
            i++;
        }
        return strArr2;
    }

    /* renamed from: v */
    private static String[] m25365v(String[] strArr) {
        String[] strArr2 = new String[13];
        for (int i = 1; i < 13; i++) {
            strArr2[i] = strArr[i - 1];
        }
        return strArr2;
    }

    /* renamed from: c */
    public int mo41273c(String str) {
        Integer num = this.f18822i.get(str);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalFieldValueException(DateTimeFieldType.dayOfWeek(), str);
    }

    /* renamed from: d */
    public String mo41274d(int i) {
        return this.f18817d[i];
    }

    /* renamed from: e */
    public String mo41275e(int i) {
        return this.f18816c[i];
    }

    /* renamed from: f */
    public int mo41276f(String str) {
        Integer num = this.f18821h.get(str);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalFieldValueException(DateTimeFieldType.era(), str);
    }

    /* renamed from: g */
    public String mo41277g(int i) {
        return this.f18815b[i];
    }

    /* renamed from: i */
    public int mo41278i() {
        return this.f18826m;
    }

    /* renamed from: j */
    public int mo41279j() {
        return this.f18825l;
    }

    /* renamed from: k */
    public int mo41280k() {
        return this.f18824k;
    }

    /* renamed from: l */
    public int mo41281l() {
        return this.f18829p;
    }

    /* renamed from: m */
    public int mo41282m() {
        return this.f18828o;
    }

    /* renamed from: n */
    public int mo41283n() {
        return this.f18827n;
    }

    /* renamed from: o */
    public int mo41284o(String str) {
        String[] strArr = this.f18820g;
        int length = strArr.length;
        do {
            length--;
            if (length < 0) {
                throw new IllegalFieldValueException(DateTimeFieldType.halfdayOfDay(), str);
            }
        } while (!strArr[length].equalsIgnoreCase(str));
        return length;
    }

    /* renamed from: p */
    public String mo41285p(int i) {
        return this.f18820g[i];
    }

    /* renamed from: r */
    public int mo41286r(String str) {
        Integer num = this.f18823j.get(str);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalFieldValueException(DateTimeFieldType.monthOfYear(), str);
    }

    /* renamed from: s */
    public String mo41287s(int i) {
        return this.f18819f[i];
    }

    /* renamed from: t */
    public String mo41288t(int i) {
        return this.f18818e[i];
    }
}
