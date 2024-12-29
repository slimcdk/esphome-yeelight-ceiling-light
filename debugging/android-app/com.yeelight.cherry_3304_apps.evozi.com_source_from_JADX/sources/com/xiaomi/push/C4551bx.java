package com.xiaomi.push;

import com.xiaomi.push.C4557cb;

/* renamed from: com.xiaomi.push.bx */
public class C4551bx extends C4557cb.C4561d {

    /* renamed from: a */
    protected String f8263a = "MessageDeleteJob";

    public C4551bx(String str, String str2, String[] strArr, String str3) {
        super(str, str2, strArr);
        this.f8263a = str3;
    }

    /* renamed from: a */
    public static C4551bx m13498a(String str) {
        return new C4551bx(str, "status = ?", new String[]{String.valueOf(2)}, "a job build to delete uploaded job");
    }
}
