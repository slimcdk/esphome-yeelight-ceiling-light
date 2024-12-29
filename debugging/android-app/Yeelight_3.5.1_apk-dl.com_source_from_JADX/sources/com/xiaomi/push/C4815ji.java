package com.xiaomi.push;

/* renamed from: com.xiaomi.push.ji */
public class C4815ji {

    /* renamed from: a */
    private static int f9299a = Integer.MAX_VALUE;

    /* renamed from: a */
    public static void m14965a(C4812jf jfVar, byte b) {
        m14966a(jfVar, b, f9299a);
    }

    /* renamed from: a */
    public static void m14966a(C4812jf jfVar, byte b, int i) {
        if (i > 0) {
            int i2 = 0;
            switch (b) {
                case 2:
                    jfVar.mo29850a();
                    return;
                case 3:
                    jfVar.mo29850a();
                    return;
                case 4:
                    jfVar.mo29850a();
                    return;
                case 6:
                    jfVar.mo29850a();
                    return;
                case 8:
                    jfVar.mo29850a();
                    return;
                case 10:
                    jfVar.mo29850a();
                    return;
                case 11:
                    jfVar.mo29850a();
                    return;
                case 12:
                    jfVar.mo29850a();
                    while (true) {
                        byte b2 = jfVar.mo29850a().f9289a;
                        if (b2 == 0) {
                            jfVar.mo29868f();
                            return;
                        } else {
                            m14966a(jfVar, b2, i - 1);
                            jfVar.mo29869g();
                        }
                    }
                case 13:
                    C4811je a = jfVar.mo29850a();
                    while (i2 < a.f9295a) {
                        int i3 = i - 1;
                        m14966a(jfVar, a.f9294a, i3);
                        m14966a(jfVar, a.f9296b, i3);
                        i2++;
                    }
                    jfVar.mo29870h();
                    return;
                case 14:
                    C4816jj a2 = jfVar.mo29850a();
                    while (i2 < a2.f9301a) {
                        m14966a(jfVar, a2.f9300a, i - 1);
                        i2++;
                    }
                    jfVar.mo29872j();
                    return;
                case 15:
                    C4810jd a3 = jfVar.mo29850a();
                    while (i2 < a3.f9293a) {
                        m14966a(jfVar, a3.f9292a, i - 1);
                        i2++;
                    }
                    jfVar.mo29871i();
                    return;
                default:
                    return;
            }
        } else {
            throw new C4804iz("Maximum skip depth exceeded");
        }
    }
}
