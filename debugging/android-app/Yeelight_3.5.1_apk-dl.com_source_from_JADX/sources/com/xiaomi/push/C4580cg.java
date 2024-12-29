package com.xiaomi.push;

import android.content.ContentValues;
import android.content.Context;
import androidx.core.app.NotificationCompat;
import com.xiaomi.push.C4583cj;

/* renamed from: com.xiaomi.push.cg */
public class C4580cg extends C4583cj.C4588e {

    /* renamed from: a */
    private String f7699a = "MessageInsertJob";

    public C4580cg(String str, ContentValues contentValues, String str2) {
        super(str, contentValues);
        this.f7699a = str2;
    }

    /* renamed from: a */
    public static C4580cg m13150a(Context context, String str, C4764hn hnVar) {
        byte[] a = C4797it.m14834a(hnVar);
        if (a == null || a.length <= 0) {
            return null;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put(NotificationCompat.CATEGORY_STATUS, 0);
        contentValues.put("messageId", "");
        contentValues.put("messageItemId", hnVar.mo29308d());
        contentValues.put("messageItem", a);
        contentValues.put("appId", C4569bx.m13076a(context).mo28796b());
        contentValues.put("packageName", C4569bx.m13076a(context).mo28791a());
        contentValues.put("createTimeStamp", Long.valueOf(System.currentTimeMillis()));
        contentValues.put("uploadTimestamp", 0);
        return new C4580cg(str, contentValues, "a job build to insert message to db");
    }
}
