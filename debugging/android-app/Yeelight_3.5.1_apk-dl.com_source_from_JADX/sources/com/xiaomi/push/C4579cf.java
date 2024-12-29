package com.xiaomi.push;

import com.xiaomi.push.C4583cj;

/* renamed from: com.xiaomi.push.cf */
public class C4579cf extends C4583cj.C4587d {

    /* renamed from: a */
    protected String f7698a = "MessageDeleteJob";

    public C4579cf(String str, String str2, String[] strArr, String str3) {
        super(str, str2, strArr);
        this.f7698a = str3;
    }

    /* renamed from: a */
    public static C4579cf m13149a(String str) {
        return new C4579cf(str, "status = ?", new String[]{String.valueOf(2)}, "a job build to delete uploaded job");
    }
}
