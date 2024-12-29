package p115x1;

import com.google.gson.JsonIOException;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;

/* renamed from: x1.c */
final class C3902c extends C3901b {

    /* renamed from: d */
    private static Class f6540d;

    /* renamed from: b */
    private final Object f6541b = m11150d();

    /* renamed from: c */
    private final Field f6542c = m11149c();

    C3902c() {
    }

    /* renamed from: c */
    private static Field m11149c() {
        try {
            return AccessibleObject.class.getDeclaredField("override");
        } catch (NoSuchFieldException unused) {
            return null;
        }
    }

    /* renamed from: d */
    private static Object m11150d() {
        try {
            Class<?> cls = Class.forName("sun.misc.Unsafe");
            f6540d = cls;
            Field declaredField = cls.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            return declaredField.get((Object) null);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: b */
    public void mo26384b(AccessibleObject accessibleObject) {
        if (!mo26385e(accessibleObject)) {
            try {
                accessibleObject.setAccessible(true);
            } catch (SecurityException e) {
                throw new JsonIOException("Gson couldn't modify fields for " + accessibleObject + "\nand sun.misc.Unsafe not found.\nEither write a custom type adapter, or make fields accessible, or include sun.misc.Unsafe.", e);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public boolean mo26385e(AccessibleObject accessibleObject) {
        if (!(this.f6541b == null || this.f6542c == null)) {
            try {
                long longValue = ((Long) f6540d.getMethod("objectFieldOffset", new Class[]{Field.class}).invoke(this.f6541b, new Object[]{this.f6542c})).longValue();
                f6540d.getMethod("putBoolean", new Class[]{Object.class, Long.TYPE, Boolean.TYPE}).invoke(this.f6541b, new Object[]{accessibleObject, Long.valueOf(longValue), Boolean.TRUE});
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }
}
