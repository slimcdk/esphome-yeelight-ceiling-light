package com.xiaomi.push;

import android.content.Context;
import android.database.Cursor;
import com.xiaomi.push.C4557cb;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.xiaomi.push.bw */
public class C4550bw extends C4557cb.C4559b<Long> {

    /* renamed from: a */
    private long f8261a = 0;

    /* renamed from: a */
    private String f8262a;

    public C4550bw(String str, List<String> list, String str2, String[] strArr, String str3, String str4, String str5, int i, String str6) {
        super(str, list, str2, strArr, str3, str4, str5, i);
        this.f8262a = str6;
    }

    /* renamed from: a */
    public static C4550bw m13493a(String str) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("count(*)");
        return new C4550bw(str, arrayList, (String) null, (String[]) null, (String) null, (String) null, (String) null, 0, "job to get count of all message");
    }

    /* renamed from: a */
    public Long m13496a(Context context, Cursor cursor) {
        return Long.valueOf(cursor.getLong(0));
    }

    /* renamed from: a */
    public Object mo24795a() {
        return Long.valueOf(this.f8261a);
    }

    /* renamed from: a */
    public void mo24796a(Context context, List<Long> list) {
        if (context != null && list != null && list.size() > 0) {
            this.f8261a = list.get(0).longValue();
        }
    }
}
