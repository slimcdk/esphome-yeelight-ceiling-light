package com.xiaomi.push;

import android.content.ContentValues;
import android.content.Context;
import androidx.core.app.NotificationCompat;
import com.xiaomi.push.C4557cb;

/* renamed from: com.xiaomi.push.by */
public class C4552by extends C4557cb.C4562e {

    /* renamed from: a */
    private String f8264a = "MessageInsertJob";

    public C4552by(String str, ContentValues contentValues, String str2) {
        super(str, contentValues);
        this.f8264a = str2;
    }

    /* renamed from: a */
    public static C4552by m13499a(Context context, String str, C4743hq hqVar) {
        byte[] a = C4776iw.m15225a(hqVar);
        if (a == null || a.length <= 0) {
            return null;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put(NotificationCompat.CATEGORY_STATUS, 0);
        contentValues.put("messageId", "");
        contentValues.put("messageItemId", hqVar.mo25277d());
        contentValues.put("messageItem", a);
        contentValues.put("appId", C4543bp.m13474a(context).mo24788b());
        contentValues.put("packageName", C4543bp.m13474a(context).mo24783a());
        contentValues.put("createTimeStamp", Long.valueOf(System.currentTimeMillis()));
        contentValues.put("uploadTimestamp", 0);
        return new C4552by(str, contentValues, "a job build to insert message to db");
    }
}
