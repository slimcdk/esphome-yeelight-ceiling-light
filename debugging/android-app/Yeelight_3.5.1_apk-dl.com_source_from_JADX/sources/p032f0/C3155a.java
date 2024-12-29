package p032f0;

import android.os.IBinder;
import android.os.IInterface;
import androidx.annotation.NonNull;
import com.google.android.gms.internal.common.C0996i;

/* renamed from: f0.a */
public interface C3155a extends IInterface {

    /* renamed from: f0.a$a */
    public static abstract class C3156a extends C0996i implements C3155a {
        public C3156a() {
            super("com.google.android.gms.dynamic.IObjectWrapper");
        }

        @NonNull
        /* renamed from: e */
        public static C3155a m8426e(@NonNull IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            return queryLocalInterface instanceof C3155a ? (C3155a) queryLocalInterface : new C3158c(iBinder);
        }
    }
}
