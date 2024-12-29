package com.xiaomi.push;

import android.content.Context;
import android.database.Cursor;
import com.xiaomi.push.C4583cj;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.xiaomi.push.ce */
public class C4578ce extends C4583cj.C4585b<Long> {

    /* renamed from: a */
    private long f7696a = 0;

    /* renamed from: a */
    private String f7697a;

    public C4578ce(String str, List<String> list, String str2, String[] strArr, String str3, String str4, String str5, int i, String str6) {
        super(str, list, str2, strArr, str3, str4, str5, i);
        this.f7697a = str6;
    }

    /* renamed from: a */
    public static C4578ce m13144a(String str) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("count(*)");
        return new C4578ce(str, arrayList, (String) null, (String[]) null, (String) null, (String) null, (String) null, 0, "job to get count of all message");
    }

    /* renamed from: a */
    public Long m13147a(Context context, Cursor cursor) {
        return Long.valueOf(cursor.getLong(0));
    }

    /* renamed from: a */
    public Object mo28828a() {
        return Long.valueOf(this.f7696a);
    }

    /* renamed from: a */
    public void mo28829a(Context context, List<Long> list) {
        if (context != null && list != null && list.size() > 0) {
            this.f7696a = list.get(0).longValue();
        }
    }
}
