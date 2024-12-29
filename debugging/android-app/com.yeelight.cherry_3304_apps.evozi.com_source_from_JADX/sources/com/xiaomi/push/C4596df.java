package com.xiaomi.push;

import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.channel.commonutils.logger.C3989b;

/* renamed from: com.xiaomi.push.df */
public class C4596df {
    /* renamed from: a */
    public static int m13707a(Context context, int i) {
        int a = C4718gx.m14469a(context);
        if (-1 == a) {
            return -1;
        }
        return (i * (a == 0 ? 13 : 11)) / 10;
    }

    /* renamed from: a */
    public static int m13708a(C4739hm hmVar) {
        return C4660fa.m14135a(hmVar.mo25253a());
    }

    /* renamed from: a */
    public static int m13709a(C4777ix ixVar, C4739hm hmVar) {
        int a;
        switch (C4597dg.f8378a[hmVar.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                return C4660fa.m14135a(hmVar.mo25253a());
            case 11:
                a = C4660fa.m14135a(hmVar.mo25253a());
                if (ixVar != null) {
                    try {
                        if (ixVar instanceof C4757id) {
                            String str = ((C4757id) ixVar).f9422d;
                            if (!TextUtils.isEmpty(str) && C4660fa.m14136a((Enum) C4660fa.m14139a(str)) != -1) {
                                a = C4660fa.m14136a((Enum) C4660fa.m14139a(str));
                                break;
                            }
                        } else if (ixVar instanceof C4765il) {
                            String str2 = ((C4765il) ixVar).f9529d;
                            if (!TextUtils.isEmpty(str2)) {
                                if (C4660fa.m14136a((Enum) C4660fa.m14139a(str2)) != -1) {
                                    a = C4660fa.m14136a((Enum) C4660fa.m14139a(str2));
                                }
                                if (C4749hw.UploadTinyData.equals(C4660fa.m14139a(str2))) {
                                    return -1;
                                }
                            }
                        }
                    } catch (Exception unused) {
                        int i = a;
                        C3989b.m10681d("PERF_ERROR : parse Notification type error");
                        return i;
                    }
                }
                break;
            case 12:
                a = C4660fa.m14135a(hmVar.mo25253a());
                if (ixVar != null) {
                    try {
                        if (ixVar instanceof C4761ih) {
                            String a2 = ((C4761ih) ixVar).mo25504a();
                            if (!TextUtils.isEmpty(a2) && C4668fg.m14180a(a2) != -1) {
                                a = C4668fg.m14180a(a2);
                                break;
                            }
                        } else if (ixVar instanceof C4760ig) {
                            String a3 = ((C4760ig) ixVar).mo25482a();
                            if (!TextUtils.isEmpty(a3) && C4668fg.m14180a(a3) != -1) {
                                return C4668fg.m14180a(a3);
                            }
                        }
                    } catch (Exception unused2) {
                        C3989b.m10681d("PERF_ERROR : parse Command type error");
                        break;
                    }
                }
                break;
            default:
                return -1;
        }
        return a;
    }

    /* renamed from: a */
    public static void m13710a(String str, Context context, int i, int i2) {
        if (i > 0 && i2 > 0) {
            int a = m13707a(context, i2);
            if (i != C4660fa.m14136a((Enum) C4749hw.UploadTinyData)) {
                C4662fb.m14151a(context.getApplicationContext()).mo25058a(str, i, 1, (long) a);
            }
        }
    }

    /* renamed from: a */
    public static void m13711a(String str, Context context, C4762ii iiVar, int i) {
        C4739hm a;
        if (context != null && iiVar != null && (a = iiVar.mo25521a()) != null) {
            int a2 = m13708a(a);
            if (i <= 0) {
                byte[] a3 = C4776iw.m15225a(iiVar);
                i = a3 != null ? a3.length : 0;
            }
            m13710a(str, context, a2, i);
        }
    }

    /* renamed from: a */
    public static void m13712a(String str, Context context, C4777ix ixVar, C4739hm hmVar, int i) {
        m13710a(str, context, m13709a(ixVar, hmVar), i);
    }

    /* renamed from: a */
    public static void m13713a(String str, Context context, byte[] bArr) {
        if (context != null && bArr != null && bArr.length > 0) {
            C4762ii iiVar = new C4762ii();
            try {
                C4776iw.m15224a(iiVar, bArr);
                m13711a(str, context, iiVar, bArr.length);
            } catch (C4787jc unused) {
                C3989b.m10669a("fail to convert bytes to container");
            }
        }
    }
}
