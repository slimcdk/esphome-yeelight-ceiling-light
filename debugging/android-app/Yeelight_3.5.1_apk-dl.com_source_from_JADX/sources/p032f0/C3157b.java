package p032f0;

import android.os.IBinder;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.C0917i;
import com.google.android.gms.common.util.RetainForClient;
import java.lang.reflect.Field;
import p032f0.C3155a;

@RetainForClient
@KeepForSdk
/* renamed from: f0.b */
public final class C3157b<T> extends C3155a.C3156a {

    /* renamed from: a */
    private final Object f5054a;

    private C3157b(Object obj) {
        this.f5054a = obj;
    }

    @NonNull
    @KeepForSdk
    /* renamed from: T */
    public static <T> C3155a m8427T(@NonNull T t) {
        return new C3157b(t);
    }

    @NonNull
    @KeepForSdk
    /* renamed from: f */
    public static <T> T m8428f(@NonNull C3155a aVar) {
        if (aVar instanceof C3157b) {
            return ((C3157b) aVar).f5054a;
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
        if (i == 1) {
            C0917i.m1419j(field);
            if (!field.isAccessible()) {
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
        } else {
            throw new IllegalArgumentException("Unexpected number of IObjectWrapper declared fields: " + declaredFields.length);
        }
    }
}
