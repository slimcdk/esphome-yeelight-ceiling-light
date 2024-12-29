package com.google.firebase.iid;

import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;

/* renamed from: com.google.firebase.iid.n */
final class C3239n {

    /* renamed from: a */
    private final Messenger f6265a;

    /* renamed from: b */
    private final zzj f6266b;

    C3239n(IBinder iBinder) {
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if ("android.os.IMessenger".equals(interfaceDescriptor)) {
            this.f6265a = new Messenger(iBinder);
            this.f6266b = null;
        } else if ("com.google.android.gms.iid.IMessengerCompat".equals(interfaceDescriptor)) {
            this.f6266b = new zzj(iBinder);
            this.f6265a = null;
        } else {
            String valueOf = String.valueOf(interfaceDescriptor);
            if (valueOf.length() != 0) {
                "Invalid interface descriptor: ".concat(valueOf);
            } else {
                new String("Invalid interface descriptor: ");
            }
            throw new RemoteException();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo17847a(Message message) {
        Messenger messenger = this.f6265a;
        if (messenger != null) {
            messenger.send(message);
            return;
        }
        zzj zzj = this.f6266b;
        if (zzj != null) {
            zzj.mo17873b(message);
            return;
        }
        throw new IllegalStateException("Both messengers are null");
    }
}
