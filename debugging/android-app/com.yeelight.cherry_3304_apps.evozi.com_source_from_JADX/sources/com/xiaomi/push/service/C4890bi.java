package com.xiaomi.push.service;

import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.channel.commonutils.logger.C3989b;
import com.xiaomi.mipush.sdk.Constants;
import com.xiaomi.push.C4532bf;
import com.xiaomi.push.C4742hp;
import com.xiaomi.push.C4743hq;
import com.xiaomi.push.C4749hw;
import com.xiaomi.push.C4765il;
import com.xiaomi.push.C4776iw;
import com.xiaomi.push.C4937t;
import com.xiaomi.push.C4942y;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.xiaomi.push.service.bi */
public class C4890bi {

    /* renamed from: a */
    private static String f10101a;

    /* renamed from: a */
    private static SimpleDateFormat f10102a;

    /* renamed from: a */
    private static AtomicLong f10103a = new AtomicLong(0);

    static {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd");
        f10102a = simpleDateFormat;
        f10101a = simpleDateFormat.format(Long.valueOf(System.currentTimeMillis()));
    }

    /* renamed from: a */
    public static synchronized String m15702a() {
        String str;
        synchronized (C4890bi.class) {
            String format = f10102a.format(Long.valueOf(System.currentTimeMillis()));
            if (!TextUtils.equals(f10101a, format)) {
                f10103a.set(0);
                f10101a = format;
            }
            str = format + Constants.ACCEPT_TIME_SEPARATOR_SERVER + f10103a.incrementAndGet();
        }
        return str;
    }

    /* renamed from: a */
    public static ArrayList<C4765il> m15703a(List<C4743hq> list, String str, String str2, int i) {
        String str3;
        if (list == null) {
            str3 = "requests can not be null in TinyDataHelper.transToThriftObj().";
        } else if (list.size() == 0) {
            str3 = "requests.length is 0 in TinyDataHelper.transToThriftObj().";
        } else {
            ArrayList<C4765il> arrayList = new ArrayList<>();
            C4742hp hpVar = new C4742hp();
            int i2 = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                C4743hq hqVar = list.get(i3);
                if (hqVar != null) {
                    int length = C4776iw.m15225a(hqVar).length;
                    if (length > i) {
                        C3989b.m10681d("TinyData is too big, ignore upload request item:" + hqVar.mo25277d());
                    } else {
                        if (i2 + length > i) {
                            C4765il ilVar = new C4765il("-1", false);
                            ilVar.mo25569d(str);
                            ilVar.mo25562b(str2);
                            ilVar.mo25565c(C4749hw.UploadTinyData.f9252a);
                            ilVar.mo25559a(C4942y.m15890a(C4776iw.m15225a(hpVar)));
                            arrayList.add(ilVar);
                            hpVar = new C4742hp();
                            i2 = 0;
                        }
                        hpVar.mo25258a(hqVar);
                        i2 += length;
                    }
                }
            }
            if (hpVar.mo25256a() != 0) {
                C4765il ilVar2 = new C4765il("-1", false);
                ilVar2.mo25569d(str);
                ilVar2.mo25562b(str2);
                ilVar2.mo25565c(C4749hw.UploadTinyData.f9252a);
                ilVar2.mo25559a(C4942y.m15890a(C4776iw.m15225a(hpVar)));
                arrayList.add(ilVar2);
            }
            return arrayList;
        }
        C3989b.m10681d(str3);
        return null;
    }

    /* renamed from: a */
    public static void m15704a(Context context, String str, String str2, long j, String str3) {
        C4743hq hqVar = new C4743hq();
        hqVar.mo25276d(str);
        hqVar.mo25272c(str2);
        hqVar.mo25265a(j);
        hqVar.mo25269b(str3);
        hqVar.mo25266a("push_sdk_channel");
        hqVar.mo25283g(context.getPackageName());
        hqVar.mo25278e(context.getPackageName());
        hqVar.mo25267a(true);
        hqVar.mo25268b(System.currentTimeMillis());
        hqVar.mo25281f(m15702a());
        C4891bj.m15707a(context, hqVar);
    }

    /* renamed from: a */
    public static boolean m15705a(C4743hq hqVar, boolean z) {
        String str;
        if (hqVar == null) {
            str = "item is null, verfiy ClientUploadDataItem failed.";
        } else if (!z && TextUtils.isEmpty(hqVar.f9055a)) {
            str = "item.channel is null or empty, verfiy ClientUploadDataItem failed.";
        } else if (TextUtils.isEmpty(hqVar.f9062d)) {
            str = "item.category is null or empty, verfiy ClientUploadDataItem failed.";
        } else if (TextUtils.isEmpty(hqVar.f9061c)) {
            str = "item.name is null or empty, verfiy ClientUploadDataItem failed.";
        } else if (!C4532bf.m13431a(hqVar.f9062d)) {
            str = "item.category can only contain ascii char, verfiy ClientUploadDataItem failed.";
        } else if (!C4532bf.m13431a(hqVar.f9061c)) {
            str = "item.name can only contain ascii char, verfiy ClientUploadDataItem failed.";
        } else {
            String str2 = hqVar.f9060b;
            if (str2 == null || str2.length() <= 10240) {
                return false;
            }
            str = "item.data is too large(" + hqVar.f9060b.length() + "), max size for data is " + 10240 + " , verfiy ClientUploadDataItem failed.";
        }
        C3989b.m10669a(str);
        return true;
    }

    /* renamed from: a */
    public static boolean m15706a(String str) {
        return !C4937t.m15873b() || Constants.HYBRID_PACKAGE_NAME.equals(str);
    }
}
