package com.google.android.gms.internal.wearable;

import java.lang.reflect.Field;
import java.security.PrivilegedExceptionAction;
import sun.misc.Unsafe;

/* renamed from: com.google.android.gms.internal.wearable.u2 */
final class C1517u2 implements PrivilegedExceptionAction<Unsafe> {
    C1517u2() {
    }

    /* renamed from: a */
    public static final Unsafe m3823a() {
        Class<Unsafe> cls = Unsafe.class;
        for (Field field : cls.getDeclaredFields()) {
            field.setAccessible(true);
            Object obj = field.get((Object) null);
            if (cls.isInstance(obj)) {
                return cls.cast(obj);
            }
        }
        return null;
    }

    public final /* bridge */ /* synthetic */ Object run() {
        return m3823a();
    }
}
