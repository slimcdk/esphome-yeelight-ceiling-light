package p076o0;

import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C0768e;
import com.google.android.gms.wearable.internal.C1919j;
import com.google.android.gms.wearable.internal.zzd;
import com.google.android.gms.wearable.internal.zzgg;
import com.miot.common.ReturnCode;
import java.util.HashMap;
import java.util.Map;

/* renamed from: o0.v0 */
final class C3486v0<T> {

    /* renamed from: a */
    private final Map<T, C1919j<T>> f5594a = new HashMap();

    C3486v0() {
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [android.os.IInterface] */
    /* JADX WARNING: Can't wrap try/catch for region: R(3:18|19|29) */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        r3 = java.lang.String.valueOf(r3.getKey());
        r4 = java.lang.String.valueOf(r4);
        r6 = new java.lang.StringBuilder((r3.length() + 32) + r4.length());
        r6.append("onPostInitHandler: Didn't add: ");
        r6.append(r3);
        r6.append(com.miot.service.common.miotcloud.impl.MiotCloudImpl.COOKIE_PATH);
        r6.append(r4);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x007a */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo24322a(android.os.IBinder r10) {
        /*
            r9 = this;
            java.util.Map<T, com.google.android.gms.wearable.internal.j<T>> r0 = r9.f5594a
            monitor-enter(r0)
            if (r10 != 0) goto L_0x0007
            r10 = 0
            goto L_0x001b
        L_0x0007:
            java.lang.String r1 = "com.google.android.gms.wearable.internal.IWearableService"
            android.os.IInterface r1 = r10.queryLocalInterface(r1)     // Catch:{ all -> 0x00a9 }
            boolean r2 = r1 instanceof p076o0.C3477s0     // Catch:{ all -> 0x00a9 }
            if (r2 == 0) goto L_0x0015
            r10 = r1
            o0.s0 r10 = (p076o0.C3477s0) r10     // Catch:{ all -> 0x00a9 }
            goto L_0x001b
        L_0x0015:
            o0.s0 r1 = new o0.s0     // Catch:{ all -> 0x00a9 }
            r1.<init>(r10)     // Catch:{ all -> 0x00a9 }
            r10 = r1
        L_0x001b:
            o0.b2 r1 = new o0.b2     // Catch:{ all -> 0x00a9 }
            r1.<init>()     // Catch:{ all -> 0x00a9 }
            java.util.Map<T, com.google.android.gms.wearable.internal.j<T>> r2 = r9.f5594a     // Catch:{ all -> 0x00a9 }
            java.util.Set r2 = r2.entrySet()     // Catch:{ all -> 0x00a9 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x00a9 }
        L_0x002a:
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x00a9 }
            if (r3 == 0) goto L_0x00a7
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x00a9 }
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch:{ all -> 0x00a9 }
            java.lang.Object r4 = r3.getValue()     // Catch:{ all -> 0x00a9 }
            com.google.android.gms.wearable.internal.j r4 = (com.google.android.gms.wearable.internal.C1919j) r4     // Catch:{ all -> 0x00a9 }
            com.google.android.gms.wearable.internal.zzd r5 = new com.google.android.gms.wearable.internal.zzd     // Catch:{ RemoteException -> 0x007a }
            r5.<init>(r4)     // Catch:{ RemoteException -> 0x007a }
            r10.mo24313E0(r1, r5)     // Catch:{ RemoteException -> 0x007a }
            java.lang.String r5 = "WearableClient"
            r6 = 3
            boolean r5 = android.util.Log.isLoggable(r5, r6)     // Catch:{ RemoteException -> 0x007a }
            if (r5 == 0) goto L_0x002a
            java.lang.Object r5 = r3.getKey()     // Catch:{ RemoteException -> 0x007a }
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ RemoteException -> 0x007a }
            java.lang.String r6 = java.lang.String.valueOf(r4)     // Catch:{ RemoteException -> 0x007a }
            int r7 = r5.length()     // Catch:{ RemoteException -> 0x007a }
            int r7 = r7 + 27
            int r8 = r6.length()     // Catch:{ RemoteException -> 0x007a }
            int r7 = r7 + r8
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ RemoteException -> 0x007a }
            r8.<init>(r7)     // Catch:{ RemoteException -> 0x007a }
            java.lang.String r7 = "onPostInitHandler: added: "
            r8.append(r7)     // Catch:{ RemoteException -> 0x007a }
            r8.append(r5)     // Catch:{ RemoteException -> 0x007a }
            java.lang.String r5 = "/"
            r8.append(r5)     // Catch:{ RemoteException -> 0x007a }
            r8.append(r6)     // Catch:{ RemoteException -> 0x007a }
            goto L_0x002a
        L_0x007a:
            java.lang.Object r3 = r3.getKey()     // Catch:{ all -> 0x00a9 }
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x00a9 }
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x00a9 }
            int r5 = r3.length()     // Catch:{ all -> 0x00a9 }
            int r5 = r5 + 32
            int r6 = r4.length()     // Catch:{ all -> 0x00a9 }
            int r5 = r5 + r6
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x00a9 }
            r6.<init>(r5)     // Catch:{ all -> 0x00a9 }
            java.lang.String r5 = "onPostInitHandler: Didn't add: "
            r6.append(r5)     // Catch:{ all -> 0x00a9 }
            r6.append(r3)     // Catch:{ all -> 0x00a9 }
            java.lang.String r3 = "/"
            r6.append(r3)     // Catch:{ all -> 0x00a9 }
            r6.append(r4)     // Catch:{ all -> 0x00a9 }
            goto L_0x002a
        L_0x00a7:
            monitor-exit(r0)     // Catch:{ all -> 0x00a9 }
            return
        L_0x00a9:
            r10 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00a9 }
            goto L_0x00ad
        L_0x00ac:
            throw r10
        L_0x00ad:
            goto L_0x00ac
        */
        throw new UnsupportedOperationException("Method not decompiled: p076o0.C3486v0.mo24322a(android.os.IBinder):void");
    }

    /* renamed from: b */
    public final void mo24323b(C3432f2 f2Var, C0768e<Status> eVar, T t, C1919j<T> jVar) {
        synchronized (this.f5594a) {
            if (this.f5594a.get(t) != null) {
                if (Log.isLoggable("WearableClient", 2)) {
                    String valueOf = String.valueOf(t);
                    StringBuilder sb = new StringBuilder(valueOf.length() + 20);
                    sb.append("duplicate listener: ");
                    sb.append(valueOf);
                }
                eVar.mo11928a(new Status(ReturnCode.E_ACCOUNT_LOGIN));
                return;
            }
            if (Log.isLoggable("WearableClient", 2)) {
                String valueOf2 = String.valueOf(t);
                StringBuilder sb2 = new StringBuilder(valueOf2.length() + 14);
                sb2.append("new listener: ");
                sb2.append(valueOf2);
            }
            this.f5594a.put(t, jVar);
            try {
                ((C3477s0) f2Var.mo12197F()).mo24313E0(new C3480t0(this.f5594a, t, eVar), new zzd(jVar));
            } catch (RemoteException e) {
                if (Log.isLoggable("WearableClient", 3)) {
                    String valueOf3 = String.valueOf(t);
                    StringBuilder sb3 = new StringBuilder(valueOf3.length() + 39);
                    sb3.append("addListener failed, removing listener: ");
                    sb3.append(valueOf3);
                }
                this.f5594a.remove(t);
                throw e;
            }
        }
    }

    /* renamed from: c */
    public final void mo24324c(C3432f2 f2Var, C0768e<Status> eVar, T t) {
        synchronized (this.f5594a) {
            C1919j remove = this.f5594a.remove(t);
            if (remove == null) {
                if (Log.isLoggable("WearableClient", 2)) {
                    String valueOf = String.valueOf(t);
                    StringBuilder sb = new StringBuilder(valueOf.length() + 25);
                    sb.append("remove Listener unknown: ");
                    sb.append(valueOf);
                }
                eVar.mo11928a(new Status(ReturnCode.E_ACCOUNT_LOGOUT));
                return;
            }
            remove.mo14840D0();
            if (Log.isLoggable("WearableClient", 2)) {
                String valueOf2 = String.valueOf(t);
                StringBuilder sb2 = new StringBuilder(valueOf2.length() + 24);
                sb2.append("service.removeListener: ");
                sb2.append(valueOf2);
            }
            ((C3477s0) f2Var.mo12197F()).mo24314F0(new C3483u0(this.f5594a, t, eVar), new zzgg(remove));
        }
    }
}
