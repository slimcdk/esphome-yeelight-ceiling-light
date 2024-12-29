package com.google.firebase.iid;

import android.os.Build;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;

public class zzj implements Parcelable {
    public static final Parcelable.Creator<zzj> CREATOR = new C3252t0();

    /* renamed from: a */
    private Messenger f6319a;

    /* renamed from: b */
    private C3224g1 f6320b;

    /* renamed from: com.google.firebase.iid.zzj$a */
    public static final class C3265a extends ClassLoader {
        /* access modifiers changed from: protected */
        public final Class<?> loadClass(String str, boolean z) {
            if (!"com.google.android.gms.iid.MessengerCompat".equals(str)) {
                return super.loadClass(str, z);
            }
            boolean v = FirebaseInstanceId.m10002v();
            return zzj.class;
        }
    }

    public zzj(IBinder iBinder) {
        if (Build.VERSION.SDK_INT >= 21) {
            this.f6319a = new Messenger(iBinder);
        } else {
            this.f6320b = new C3221f1(iBinder);
        }
    }

    /* renamed from: a */
    private final IBinder m10131a() {
        Messenger messenger = this.f6319a;
        return messenger != null ? messenger.getBinder() : this.f6320b.asBinder();
    }

    /* renamed from: b */
    public final void mo17873b(Message message) {
        Messenger messenger = this.f6319a;
        if (messenger != null) {
            messenger.send(message);
        } else {
            this.f6320b.mo17830F0(message);
        }
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            return m10131a().equals(((zzj) obj).m10131a());
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public int hashCode() {
        return m10131a().hashCode();
    }

    public void writeToParcel(Parcel parcel, int i) {
        Messenger messenger = this.f6319a;
        parcel.writeStrongBinder(messenger != null ? messenger.getBinder() : this.f6320b.asBinder());
    }
}
