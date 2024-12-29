package com.xiaomi.push;

/* renamed from: com.xiaomi.push.jl */
public class C4797jl {

    /* renamed from: a */
    private static int f9830a = Integer.MAX_VALUE;

    /* renamed from: a */
    public static void m15328a(C4794ji jiVar, byte b) {
        m15329a(jiVar, b, f9830a);
    }

    /* renamed from: a */
    public static void m15329a(C4794ji jiVar, byte b, int i) {
        if (i > 0) {
            int i2 = 0;
            switch (b) {
                case 2:
                    jiVar.mo25816a();
                    return;
                case 3:
                    jiVar.mo25816a();
                    return;
                case 4:
                    jiVar.mo25816a();
                    return;
                case 6:
                    jiVar.mo25816a();
                    return;
                case 8:
                    jiVar.mo25816a();
                    return;
                case 10:
                    jiVar.mo25816a();
                    return;
                case 11:
                    jiVar.mo25816a();
                    return;
                case 12:
                    jiVar.mo25816a();
                    while (true) {
                        byte b2 = jiVar.mo25816a().f9820a;
                        if (b2 == 0) {
                            jiVar.mo25834f();
                            return;
                        } else {
                            m15329a(jiVar, b2, i - 1);
                            jiVar.mo25835g();
                        }
                    }
                case 13:
                    C4793jh a = jiVar.mo25816a();
                    while (i2 < a.f9826a) {
                        int i3 = i - 1;
                        m15329a(jiVar, a.f9825a, i3);
                        m15329a(jiVar, a.f9827b, i3);
                        i2++;
                    }
                    jiVar.mo25836h();
                    return;
                case 14:
                    C4798jm a2 = jiVar.mo25816a();
                    while (i2 < a2.f9832a) {
                        m15329a(jiVar, a2.f9831a, i - 1);
                        i2++;
                    }
                    jiVar.mo25838j();
                    return;
                case 15:
                    C4792jg a3 = jiVar.mo25816a();
                    while (i2 < a3.f9824a) {
                        m15329a(jiVar, a3.f9823a, i - 1);
                        i2++;
                    }
                    jiVar.mo25837i();
                    return;
                default:
                    return;
            }
        } else {
            throw new C4787jc("Maximum skip depth exceeded");
        }
    }
}
