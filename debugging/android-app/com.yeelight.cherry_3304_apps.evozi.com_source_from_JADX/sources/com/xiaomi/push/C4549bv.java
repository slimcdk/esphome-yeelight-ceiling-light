package com.xiaomi.push;

import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.channel.commonutils.logger.C3989b;

/* renamed from: com.xiaomi.push.bv */
public class C4549bv extends C4551bx {
    public C4549bv(String str, String str2, String[] strArr, String str3) {
        super(str, str2, strArr, str3);
    }

    /* renamed from: a */
    public static C4549bv m13490a(Context context, String str, int i) {
        C3989b.m10679b("delete  messages when db size is too bigger");
        String a = C4557cb.m13552a(context).mo24824a(str);
        if (TextUtils.isEmpty(a)) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("rowDataId in (select ");
        sb.append("rowDataId from " + a);
        sb.append(" order by createTimeStamp asc");
        sb.append(" limit ?)");
        return new C4549bv(str, sb.toString(), new String[]{String.valueOf(i)}, "a job build to delete history message");
    }

    /* renamed from: a */
    private void m13491a(long j) {
        String[] strArr = this.f8292a;
        if (strArr != null && strArr.length > 0) {
            strArr[0] = String.valueOf(j);
        }
    }

    /* renamed from: a */
    public void mo24793a(Context context, Object obj) {
        if (obj instanceof Long) {
            long longValue = ((Long) obj).longValue();
            long a = C4568ch.m13584a(mo24795a());
            long j = C4547bt.f8257a;
            if (a > j) {
                double d = (double) (a - j);
                Double.isNaN(d);
                double d2 = (double) j;
                Double.isNaN(d2);
                double d3 = (double) longValue;
                Double.isNaN(d3);
                long j2 = (long) (((d * 1.2d) / d2) * d3);
                m13491a(j2);
                C4543bp a2 = C4543bp.m13474a(context);
                a2.mo24786a("begin delete " + j2 + "noUpload messages , because db size is " + a + "B");
                super.mo24793a(context, obj);
                return;
            }
            C3989b.m10679b("db size is suitable");
        }
    }
}
