package com.google.android.gms.wearable.internal;

import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C1422d;
import com.miot.common.ReturnCode;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.wearable.internal.w0 */
final class C2510w0<T> {

    /* renamed from: a */
    private final Map<T, C2458h2<T>> f4918a = new HashMap();

    C2510w0() {
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [android.os.IInterface] */
    /* JADX WARNING: Can't wrap try/catch for region: R(3:18|19|29) */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        r3 = java.lang.String.valueOf(r3.getKey());
        r4 = java.lang.String.valueOf(r4);
        r6 = new java.lang.StringBuilder((java.lang.String.valueOf(r3).length() + 32) + java.lang.String.valueOf(r4).length());
        r6.append("onPostInitHandler: Didn't add: ");
        r6.append(r3);
        r6.append(com.miot.service.common.miotcloud.impl.MiotCloudImpl.COOKIE_PATH);
        r6.append(r4);
        r6.toString();
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x0085 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo13383a(android.os.IBinder r10) {
        /*
            r9 = this;
            java.util.Map<T, com.google.android.gms.wearable.internal.h2<T>> r0 = r9.f4918a
            monitor-enter(r0)
            if (r10 != 0) goto L_0x0007
            r10 = 0
            goto L_0x001b
        L_0x0007:
            java.lang.String r1 = "com.google.android.gms.wearable.internal.IWearableService"
            android.os.IInterface r1 = r10.queryLocalInterface(r1)     // Catch:{ all -> 0x00c0 }
            boolean r2 = r1 instanceof com.google.android.gms.wearable.internal.C2504u0     // Catch:{ all -> 0x00c0 }
            if (r2 == 0) goto L_0x0015
            r10 = r1
            com.google.android.gms.wearable.internal.u0 r10 = (com.google.android.gms.wearable.internal.C2504u0) r10     // Catch:{ all -> 0x00c0 }
            goto L_0x001b
        L_0x0015:
            com.google.android.gms.wearable.internal.v0 r1 = new com.google.android.gms.wearable.internal.v0     // Catch:{ all -> 0x00c0 }
            r1.<init>(r10)     // Catch:{ all -> 0x00c0 }
            r10 = r1
        L_0x001b:
            com.google.android.gms.wearable.internal.c2 r1 = new com.google.android.gms.wearable.internal.c2     // Catch:{ all -> 0x00c0 }
            r1.<init>()     // Catch:{ all -> 0x00c0 }
            java.util.Map<T, com.google.android.gms.wearable.internal.h2<T>> r2 = r9.f4918a     // Catch:{ all -> 0x00c0 }
            java.util.Set r2 = r2.entrySet()     // Catch:{ all -> 0x00c0 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x00c0 }
        L_0x002a:
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x00c0 }
            if (r3 == 0) goto L_0x00be
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x00c0 }
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch:{ all -> 0x00c0 }
            java.lang.Object r4 = r3.getValue()     // Catch:{ all -> 0x00c0 }
            com.google.android.gms.wearable.internal.h2 r4 = (com.google.android.gms.wearable.internal.C2458h2) r4     // Catch:{ all -> 0x00c0 }
            com.google.android.gms.wearable.internal.zzd r5 = new com.google.android.gms.wearable.internal.zzd     // Catch:{ RemoteException -> 0x0085 }
            r5.<init>(r4)     // Catch:{ RemoteException -> 0x0085 }
            r10.mo13375O(r1, r5)     // Catch:{ RemoteException -> 0x0085 }
            java.lang.String r5 = "WearableClient"
            r6 = 3
            boolean r5 = android.util.Log.isLoggable(r5, r6)     // Catch:{ RemoteException -> 0x0085 }
            if (r5 == 0) goto L_0x002a
            java.lang.Object r5 = r3.getKey()     // Catch:{ RemoteException -> 0x0085 }
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ RemoteException -> 0x0085 }
            java.lang.String r6 = java.lang.String.valueOf(r4)     // Catch:{ RemoteException -> 0x0085 }
            java.lang.String r7 = java.lang.String.valueOf(r5)     // Catch:{ RemoteException -> 0x0085 }
            int r7 = r7.length()     // Catch:{ RemoteException -> 0x0085 }
            int r7 = r7 + 27
            java.lang.String r8 = java.lang.String.valueOf(r6)     // Catch:{ RemoteException -> 0x0085 }
            int r8 = r8.length()     // Catch:{ RemoteException -> 0x0085 }
            int r7 = r7 + r8
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ RemoteException -> 0x0085 }
            r8.<init>(r7)     // Catch:{ RemoteException -> 0x0085 }
            java.lang.String r7 = "onPostInitHandler: added: "
            r8.append(r7)     // Catch:{ RemoteException -> 0x0085 }
            r8.append(r5)     // Catch:{ RemoteException -> 0x0085 }
            java.lang.String r5 = "/"
            r8.append(r5)     // Catch:{ RemoteException -> 0x0085 }
            r8.append(r6)     // Catch:{ RemoteException -> 0x0085 }
            r8.toString()     // Catch:{ RemoteException -> 0x0085 }
            goto L_0x002a
        L_0x0085:
            java.lang.Object r3 = r3.getKey()     // Catch:{ all -> 0x00c0 }
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x00c0 }
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x00c0 }
            java.lang.String r5 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x00c0 }
            int r5 = r5.length()     // Catch:{ all -> 0x00c0 }
            int r5 = r5 + 32
            java.lang.String r6 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x00c0 }
            int r6 = r6.length()     // Catch:{ all -> 0x00c0 }
            int r5 = r5 + r6
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x00c0 }
            r6.<init>(r5)     // Catch:{ all -> 0x00c0 }
            java.lang.String r5 = "onPostInitHandler: Didn't add: "
            r6.append(r5)     // Catch:{ all -> 0x00c0 }
            r6.append(r3)     // Catch:{ all -> 0x00c0 }
            java.lang.String r3 = "/"
            r6.append(r3)     // Catch:{ all -> 0x00c0 }
            r6.append(r4)     // Catch:{ all -> 0x00c0 }
            r6.toString()     // Catch:{ all -> 0x00c0 }
            goto L_0x002a
        L_0x00be:
            monitor-exit(r0)     // Catch:{ all -> 0x00c0 }
            return
        L_0x00c0:
            r10 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00c0 }
            goto L_0x00c4
        L_0x00c3:
            throw r10
        L_0x00c4:
            goto L_0x00c3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.wearable.internal.C2510w0.mo13383a(android.os.IBinder):void");
    }

    /* renamed from: b */
    public final void mo13384b(C2450f2 f2Var, C1422d<Status> dVar, T t) {
        synchronized (this.f4918a) {
            C2458h2 remove = this.f4918a.remove(t);
            if (remove == null) {
                if (Log.isLoggable("WearableClient", 2)) {
                    String valueOf = String.valueOf(t);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 25);
                    sb.append("remove Listener unknown: ");
                    sb.append(valueOf);
                    sb.toString();
                }
                dVar.mo10888a(new Status(ReturnCode.E_ACCOUNT_LOGOUT));
                return;
            }
            remove.mo13324c();
            if (Log.isLoggable("WearableClient", 2)) {
                String valueOf2 = String.valueOf(t);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 24);
                sb2.append("service.removeListener: ");
                sb2.append(valueOf2);
                sb2.toString();
            }
            ((C2504u0) f2Var.mo11144E()).mo13374B0(new C2516y0(this.f4918a, t, dVar), new zzfw(remove));
        }
    }

    /* renamed from: c */
    public final void mo13385c(C2450f2 f2Var, C1422d<Status> dVar, T t, C2458h2<T> h2Var) {
        synchronized (this.f4918a) {
            if (this.f4918a.get(t) != null) {
                if (Log.isLoggable("WearableClient", 2)) {
                    String valueOf = String.valueOf(t);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 20);
                    sb.append("duplicate listener: ");
                    sb.append(valueOf);
                    sb.toString();
                }
                dVar.mo10888a(new Status(ReturnCode.E_ACCOUNT_LOGIN));
                return;
            }
            if (Log.isLoggable("WearableClient", 2)) {
                String valueOf2 = String.valueOf(t);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 14);
                sb2.append("new listener: ");
                sb2.append(valueOf2);
                sb2.toString();
            }
            this.f4918a.put(t, h2Var);
            try {
                ((C2504u0) f2Var.mo11144E()).mo13375O(new C2513x0(this.f4918a, t, dVar), new zzd(h2Var));
            } catch (RemoteException e) {
                if (Log.isLoggable("WearableClient", 3)) {
                    String valueOf3 = String.valueOf(t);
                    StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf3).length() + 39);
                    sb3.append("addListener failed, removing listener: ");
                    sb3.append(valueOf3);
                    sb3.toString();
                }
                this.f4918a.remove(t);
                throw e;
            }
        }
    }
}
