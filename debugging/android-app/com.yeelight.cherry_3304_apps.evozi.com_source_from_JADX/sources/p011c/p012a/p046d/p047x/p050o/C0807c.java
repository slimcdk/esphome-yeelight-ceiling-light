package p011c.p012a.p046d.p047x.p050o;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import p011c.p012a.p046d.C0677m;

/* renamed from: c.a.d.x.o.c */
final class C0807c extends C0806b {

    /* renamed from: d */
    private static Class f622d;

    /* renamed from: b */
    private final Object f623b = m1029d();

    /* renamed from: c */
    private final Field f624c = m1028c();

    C0807c() {
    }

    /* renamed from: c */
    private static Field m1028c() {
        try {
            return AccessibleObject.class.getDeclaredField("override");
        } catch (NoSuchFieldException unused) {
            return null;
        }
    }

    /* renamed from: d */
    private static Object m1029d() {
        try {
            Class<?> cls = Class.forName("sun.misc.Unsafe");
            f622d = cls;
            Field declaredField = cls.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            return declaredField.get((Object) null);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: b */
    public void mo8965b(AccessibleObject accessibleObject) {
        if (!mo8966e(accessibleObject)) {
            try {
                accessibleObject.setAccessible(true);
            } catch (SecurityException e) {
                throw new C0677m("Gson couldn't modify fields for " + accessibleObject + "\nand sun.misc.Unsafe not found.\nEither write a custom type adapter, or make fields accessible, or include sun.misc.Unsafe.", e);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public boolean mo8966e(AccessibleObject accessibleObject) {
        if (!(this.f623b == null || this.f624c == null)) {
            try {
                long longValue = ((Long) f622d.getMethod("objectFieldOffset", new Class[]{Field.class}).invoke(this.f623b, new Object[]{this.f624c})).longValue();
                f622d.getMethod("putBoolean", new Class[]{Object.class, Long.TYPE, Boolean.TYPE}).invoke(this.f623b, new Object[]{accessibleObject, Long.valueOf(longValue), Boolean.TRUE});
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }
}
