package com.xiaomi.push;

import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.channel.commonutils.logger.C4408b;

/* renamed from: com.xiaomi.push.db */
public class C4610db {
    /* renamed from: a */
    public static int m13282a(Context context, int i) {
        int a = C4750hb.m14138a(context);
        if (-1 == a) {
            return -1;
        }
        return (i * (a == 0 ? 13 : 11)) / 10;
    }

    /* renamed from: a */
    public static int m13283a(C4760hj hjVar) {
        return C4665en.m13673a(hjVar.mo29282a());
    }

    /* renamed from: a */
    public static int m13284a(C4798iu iuVar, C4760hj hjVar) {
        int a;
        switch (C4611dc.f7777a[hjVar.ordinal()]) {
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
                return C4665en.m13673a(hjVar.mo29282a());
            case 11:
                a = C4665en.m13673a(hjVar.mo29282a());
                if (iuVar != null) {
                    try {
                        if (iuVar instanceof C4778ia) {
                            String str = ((C4778ia) iuVar).f8881d;
                            if (!TextUtils.isEmpty(str) && C4665en.m13674a((Enum) C4665en.m13677a(str)) != -1) {
                                a = C4665en.m13674a((Enum) C4665en.m13677a(str));
                                break;
                            }
                        } else if (iuVar instanceof C4786ii) {
                            String str2 = ((C4786ii) iuVar).f8988d;
                            if (!TextUtils.isEmpty(str2)) {
                                if (C4665en.m13674a((Enum) C4665en.m13677a(str2)) != -1) {
                                    a = C4665en.m13674a((Enum) C4665en.m13677a(str2));
                                }
                                if (C4770ht.UploadTinyData.equals(C4665en.m13677a(str2))) {
                                    return -1;
                                }
                            }
                        }
                    } catch (Exception unused) {
                        int i = a;
                        C4408b.m12483d("PERF_ERROR : parse Notification type error");
                        return i;
                    }
                }
                break;
            case 12:
                a = C4665en.m13673a(hjVar.mo29282a());
                if (iuVar != null) {
                    try {
                        if (iuVar instanceof C4782ie) {
                            String b = ((C4782ie) iuVar).mo29543b();
                            if (!TextUtils.isEmpty(b) && C4678ey.m13770a(b) != -1) {
                                a = C4678ey.m13770a(b);
                                break;
                            }
                        } else if (iuVar instanceof C4781id) {
                            String a2 = ((C4781id) iuVar).mo29519a();
                            if (!TextUtils.isEmpty(a2) && C4678ey.m13770a(a2) != -1) {
                                return C4678ey.m13770a(a2);
                            }
                        }
                    } catch (Exception unused2) {
                        C4408b.m12483d("PERF_ERROR : parse Command type error");
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
    public static void m13285a(String str, Context context, int i, int i2) {
        if (i > 0 && i2 > 0) {
            int a = m13282a(context, i2);
            if (i != C4665en.m13674a((Enum) C4770ht.UploadTinyData)) {
                C4667eo.m13689a(context.getApplicationContext()).mo29049a(str, i, 1, (long) a);
            }
        }
    }

    /* renamed from: a */
    public static void m13286a(String str, Context context, C4783if ifVar, int i) {
        C4760hj a;
        if (context != null && ifVar != null && (a = ifVar.mo29558a()) != null) {
            int a2 = m13283a(a);
            if (i <= 0) {
                byte[] a3 = C4797it.m14834a(ifVar);
                i = a3 != null ? a3.length : 0;
            }
            m13285a(str, context, a2, i);
        }
    }

    /* renamed from: a */
    public static void m13287a(String str, Context context, C4798iu iuVar, C4760hj hjVar, int i) {
        m13285a(str, context, m13284a(iuVar, hjVar), i);
    }

    /* renamed from: a */
    public static void m13288a(String str, Context context, byte[] bArr) {
        if (context != null && bArr != null && bArr.length > 0) {
            C4783if ifVar = new C4783if();
            try {
                C4797it.m14833a(ifVar, bArr);
                m13286a(str, context, ifVar, bArr.length);
            } catch (C4804iz unused) {
                C4408b.m12464a("fail to convert bytes to container");
            }
        }
    }
}
