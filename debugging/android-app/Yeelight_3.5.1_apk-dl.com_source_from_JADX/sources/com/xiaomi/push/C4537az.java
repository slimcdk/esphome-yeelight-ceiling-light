package com.xiaomi.push;

import android.content.Context;

/* renamed from: com.xiaomi.push.az */
class C4537az {

    /* renamed from: a */
    static int f7607a;

    /* renamed from: a */
    public static C4531au m12923a(Context context) {
        if (C4830m.m14997a()) {
            f7607a = 1;
            return new C4536ay(context);
        } else if (C4527as.m12896a(context)) {
            f7607a = 2;
            return new C4527as(context);
        } else if (C4540bb.m12968a(context)) {
            f7607a = 4;
            return new C4540bb(context);
        } else if (C4547bf.m12977a(context)) {
            f7607a = 5;
            return new C4547bf(context);
        } else if (C4535ax.m12918a(context)) {
            f7607a = 3;
            return new C4532av(context);
        } else {
            f7607a = 0;
            return new C4546be();
        }
    }
}
