package p011c.p012a.p019b.p028b.p031b;

import android.os.IBinder;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.lang.reflect.Field;
import p011c.p012a.p019b.p028b.p031b.C0561a;

@KeepForSdk
/* renamed from: c.a.b.b.b.b */
public final class C0564b<T> extends C0561a.C0562a {

    /* renamed from: a */
    private final T f226a;

    private C0564b(T t) {
        this.f226a = t;
    }

    @KeepForSdk
    /* renamed from: e */
    public static <T> T m334e(C0561a aVar) {
        if (aVar instanceof C0564b) {
            return ((C0564b) aVar).f226a;
        }
        IBinder asBinder = aVar.asBinder();
        Field[] declaredFields = asBinder.getClass().getDeclaredFields();
        Field field = null;
        int i = 0;
        for (Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i++;
                field = field2;
            }
        }
        if (i != 1) {
            int length = declaredFields.length;
            StringBuilder sb = new StringBuilder(64);
            sb.append("Unexpected number of IObjectWrapper declared fields: ");
            sb.append(length);
            throw new IllegalArgumentException(sb.toString());
        } else if (!field.isAccessible()) {
            field.setAccessible(true);
            try {
                return field.get(asBinder);
            } catch (NullPointerException e) {
                throw new IllegalArgumentException("Binder object is null.", e);
            } catch (IllegalAccessException e2) {
                throw new IllegalArgumentException("Could not access the field in remoteBinder.", e2);
            }
        } else {
            throw new IllegalArgumentException("IObjectWrapper declared field not private!");
        }
    }

    @KeepForSdk
    /* renamed from: f */
    public static <T> C0561a m335f(T t) {
        return new C0564b(t);
    }
}
