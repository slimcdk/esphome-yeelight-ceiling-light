package p011c.p012a.p053e.p057t;

import java.util.HashMap;
import java.util.Map;
import p011c.p012a.p053e.C0820g;

/* renamed from: c.a.e.t.d */
public enum C0842d {
    Cp437((String) new int[]{0, 2}, (int) new String[0]),
    ISO8859_1((String) new int[]{1, 3}, (int) new String[]{"ISO-8859-1"}),
    ISO8859_2((String) 4, (int) new String[]{"ISO-8859-2"}),
    ISO8859_3((String) 5, (int) new String[]{"ISO-8859-3"}),
    ISO8859_4((String) 6, (int) new String[]{"ISO-8859-4"}),
    ISO8859_5((String) 7, (int) new String[]{"ISO-8859-5"}),
    ISO8859_6((String) 8, (int) new String[]{"ISO-8859-6"}),
    ISO8859_7((String) 9, (int) new String[]{"ISO-8859-7"}),
    ISO8859_8((String) 10, (int) new String[]{"ISO-8859-8"}),
    ISO8859_9((String) 11, (int) new String[]{"ISO-8859-9"}),
    ISO8859_10((String) 12, (int) new String[]{"ISO-8859-10"}),
    ISO8859_11((String) 13, (int) new String[]{"ISO-8859-11"}),
    ISO8859_13((String) 15, (int) new String[]{"ISO-8859-13"}),
    ISO8859_14((String) 16, (int) new String[]{"ISO-8859-14"}),
    ISO8859_15((String) 17, (int) new String[]{"ISO-8859-15"}),
    ISO8859_16((String) 18, (int) new String[]{"ISO-8859-16"}),
    SJIS((String) 20, (int) new String[]{"Shift_JIS"}),
    Cp1250((String) 21, (int) new String[]{"windows-1250"}),
    Cp1251((String) 22, (int) new String[]{"windows-1251"}),
    Cp1252((String) 23, (int) new String[]{"windows-1252"}),
    Cp1256((String) 24, (int) new String[]{"windows-1256"}),
    UnicodeBigUnmarked((String) 25, (int) new String[]{"UTF-16BE", "UnicodeBig"}),
    UTF8((String) 26, (int) new String[]{"UTF-8"}),
    ASCII((String) new int[]{27, 170}, (int) new String[]{"US-ASCII"}),
    Big5(28),
    GB18030((String) 29, (int) new String[]{"GB2312", "EUC_CN", "GBK"}),
    EUC_KR((String) 30, (int) new String[]{"EUC-KR"});
    

    /* renamed from: H */
    private static final Map<Integer, C0842d> f783H = null;

    /* renamed from: I */
    private static final Map<String, C0842d> f784I = null;

    /* renamed from: a */
    private final int[] f810a;

    /* renamed from: b */
    private final String[] f811b;

    static {
        f783H = new HashMap();
        f784I = new HashMap();
        for (C0842d dVar : values()) {
            for (int valueOf : dVar.f810a) {
                f783H.put(Integer.valueOf(valueOf), dVar);
            }
            f784I.put(dVar.name(), dVar);
            for (String put : dVar.f811b) {
                f784I.put(put, dVar);
            }
        }
    }

    private C0842d(int i) {
        this(r3, r4, new int[]{i}, new String[0]);
    }

    private C0842d(int i, String... strArr) {
        this.f810a = new int[]{i};
        this.f811b = strArr;
    }

    private C0842d(int[] iArr, String... strArr) {
        this.f810a = iArr;
        this.f811b = strArr;
    }

    /* renamed from: a */
    public static C0842d m1219a(String str) {
        return f784I.get(str);
    }

    /* renamed from: b */
    public static C0842d m1220b(int i) {
        if (i >= 0 && i < 900) {
            return f783H.get(Integer.valueOf(i));
        }
        throw C0820g.m1114a();
    }

    /* renamed from: c */
    public int mo9078c() {
        return this.f810a[0];
    }
}
