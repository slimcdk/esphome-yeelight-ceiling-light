package com.xiaomi.push;

import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.channel.commonutils.logger.C4408b;

/* renamed from: com.xiaomi.push.cd */
public class C4577cd extends C4579cf {
    public C4577cd(String str, String str2, String[] strArr, String str3) {
        super(str, str2, strArr, str3);
    }

    /* renamed from: a */
    public static C4577cd m13141a(Context context, String str, int i) {
        C4408b.m12481b("delete  messages when db size is too bigger");
        String a = C4583cj.m13154a(context).mo28832a(str);
        if (TextUtils.isEmpty(a)) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("rowDataId in (select ");
        sb.append("rowDataId from " + a);
        sb.append(" order by createTimeStamp asc");
        sb.append(" limit ?)");
        return new C4577cd(str, sb.toString(), new String[]{String.valueOf(i)}, "a job build to delete history message");
    }

    /* renamed from: a */
    private void m13142a(long j) {
        String[] strArr = this.f7723a;
        if (strArr != null && strArr.length > 0) {
            strArr[0] = String.valueOf(j);
        }
    }

    /* renamed from: a */
    public void mo28826a(Context context, Object obj) {
        if (obj instanceof Long) {
            long longValue = ((Long) obj).longValue();
            long a = C4594cp.m13186a(mo28828a());
            long j = C4575cb.f7692a;
            if (a > j) {
                double d = (double) (a - j);
                Double.isNaN(d);
                double d2 = (double) j;
                Double.isNaN(d2);
                double d3 = (double) longValue;
                Double.isNaN(d3);
                long j2 = (long) (((d * 1.2d) / d2) * d3);
                m13142a(j2);
                C4569bx a2 = C4569bx.m13076a(context);
                a2.mo28794a("begin delete " + j2 + "noUpload messages , because db size is " + a + "B");
                super.mo28826a(context, obj);
                return;
            }
            C4408b.m12481b("db size is suitable");
        }
    }
}
