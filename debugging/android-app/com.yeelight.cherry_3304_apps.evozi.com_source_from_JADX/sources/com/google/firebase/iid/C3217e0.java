package com.google.firebase.iid;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.util.Log;
import com.google.android.gms.common.util.VisibleForTesting;
import java.io.IOException;

/* renamed from: com.google.firebase.iid.e0 */
final class C3217e0 implements Runnable {

    /* renamed from: a */
    private final long f6230a;

    /* renamed from: b */
    private final PowerManager.WakeLock f6231b;

    /* renamed from: c */
    private final FirebaseInstanceId f6232c;

    @VisibleForTesting
    C3217e0(FirebaseInstanceId firebaseInstanceId, long j) {
        this.f6232c = firebaseInstanceId;
        this.f6230a = j;
        PowerManager.WakeLock newWakeLock = ((PowerManager) mo17817b().getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.f6231b = newWakeLock;
        newWakeLock.setReferenceCounted(false);
    }

    @VisibleForTesting
    /* renamed from: d */
    private final boolean m10060d() {
        C3205a0 r = this.f6232c.mo17794r();
        boolean z = true;
        if (!this.f6232c.mo17793q(r)) {
            return true;
        }
        try {
            String u = this.f6232c.mo17795u();
            if (u == null) {
                return false;
            }
            boolean isLoggable = Log.isLoggable("FirebaseInstanceId", 3);
            if ((r == null || (r != null && !u.equals(r.f6197a))) && "[DEFAULT]".equals(this.f6232c.mo17790h().mo17063i())) {
                if (Log.isLoggable("FirebaseInstanceId", 3)) {
                    String valueOf = String.valueOf(this.f6232c.mo17790h().mo17063i());
                    if (valueOf.length() != 0) {
                        "Invoking onNewToken for app: ".concat(valueOf);
                    } else {
                        new String("Invoking onNewToken for app: ");
                    }
                }
                Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
                intent.putExtra("token", u);
                Context b = mo17817b();
                Intent intent2 = new Intent(b, FirebaseInstanceIdReceiver.class);
                intent2.setAction("com.google.firebase.MESSAGING_EVENT");
                intent2.putExtra("wrapped_intent", intent);
                b.sendBroadcast(intent2);
            }
            return true;
        } catch (IOException e) {
            String message = e.getMessage();
            if (!"SERVICE_NOT_AVAILABLE".equals(message) && !"INTERNAL_SERVER_ERROR".equals(message) && !"InternalServerError".equals(message)) {
                z = false;
            }
            if (z) {
                String message2 = e.getMessage();
                StringBuilder sb = new StringBuilder(String.valueOf(message2).length() + 52);
                sb.append("Token retrieval failed: ");
                sb.append(message2);
                sb.append(". Will retry token retrieval");
                sb.toString();
                return false;
            } else if (e.getMessage() == null) {
                return false;
            } else {
                throw e;
            }
        } catch (SecurityException unused) {
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final Context mo17817b() {
        return this.f6232c.mo17790h().mo17061g();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final boolean mo17818c() {
        ConnectivityManager connectivityManager = (ConnectivityManager) mo17817b().getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    @SuppressLint({"Wakelock"})
    public final void run() {
        if (C3261y.m10123b().mo17870c(mo17817b())) {
            this.f6231b.acquire();
        }
        try {
            this.f6232c.mo17792p(true);
            if (!this.f6232c.mo17797x()) {
                this.f6232c.mo17792p(false);
                if (C3261y.m10123b().mo17870c(mo17817b())) {
                    this.f6231b.release();
                }
            } else if (!C3261y.m10123b().mo17871e(mo17817b()) || mo17818c()) {
                if (m10060d()) {
                    this.f6232c.mo17792p(false);
                } else {
                    this.f6232c.mo17791l(this.f6230a);
                }
                if (!C3261y.m10123b().mo17870c(mo17817b())) {
                    return;
                }
                this.f6231b.release();
            } else {
                new C3214d0(this).mo17812a();
                if (C3261y.m10123b().mo17870c(mo17817b())) {
                    this.f6231b.release();
                }
            }
        } catch (IOException e) {
            String message = e.getMessage();
            StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 93);
            sb.append("Topic sync or token retrieval failed on hard failure exceptions: ");
            sb.append(message);
            sb.append(". Won't retry the operation.");
            sb.toString();
            this.f6232c.mo17792p(false);
            if (!C3261y.m10123b().mo17870c(mo17817b())) {
            }
        } catch (Throwable th) {
            if (C3261y.m10123b().mo17870c(mo17817b())) {
                this.f6231b.release();
            }
            throw th;
        }
    }
}
