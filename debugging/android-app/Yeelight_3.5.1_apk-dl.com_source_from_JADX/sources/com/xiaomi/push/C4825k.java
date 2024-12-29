package com.xiaomi.push;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import java.io.IOException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* renamed from: com.xiaomi.push.k */
final class C4825k {

    /* renamed from: com.xiaomi.push.k$a */
    static final class C4826a {

        /* renamed from: a */
        private final String f9316a;

        /* renamed from: a */
        private final boolean f9317a;

        C4826a(String str, boolean z) {
            this.f9316a = str;
            this.f9317a = z;
        }

        /* renamed from: a */
        public String mo29883a() {
            return this.f9316a;
        }
    }

    /* renamed from: com.xiaomi.push.k$b */
    private static final class C4827b implements ServiceConnection {

        /* renamed from: a */
        private final LinkedBlockingQueue<IBinder> f9318a;

        /* renamed from: a */
        boolean f9319a;

        private C4827b() {
            this.f9319a = false;
            this.f9318a = new LinkedBlockingQueue<>(1);
        }

        /* renamed from: a */
        public IBinder mo29884a() {
            if (!this.f9319a) {
                this.f9319a = true;
                return this.f9318a.poll(30000, TimeUnit.MILLISECONDS);
            }
            throw new IllegalStateException();
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                this.f9318a.put(iBinder);
            } catch (InterruptedException unused) {
            }
        }

        public void onServiceDisconnected(ComponentName componentName) {
        }
    }

    /* renamed from: com.xiaomi.push.k$c */
    private static final class C4828c implements IInterface {

        /* renamed from: a */
        private IBinder f9320a;

        public C4828c(IBinder iBinder) {
            this.f9320a = iBinder;
        }

        /* renamed from: a */
        public String mo29887a() {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                this.f9320a.transact(1, obtain, obtain2, 0);
                obtain2.readException();
                return obtain2.readString();
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }

        public IBinder asBinder() {
            return this.f9320a;
        }
    }

    /* renamed from: a */
    public static C4826a m14993a(Context context) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            try {
                context.getPackageManager().getPackageInfo("com.android.vending", 0);
                C4827b bVar = new C4827b();
                Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                intent.setPackage("com.google.android.gms");
                if (context.bindService(intent, bVar, 1)) {
                    try {
                        IBinder a = bVar.mo29884a();
                        if (a != null) {
                            C4826a aVar = new C4826a(new C4828c(a).mo29887a(), false);
                            context.unbindService(bVar);
                            return aVar;
                        }
                        context.unbindService(bVar);
                    } catch (Exception e) {
                        throw e;
                    } catch (Throwable th) {
                        context.unbindService(bVar);
                        throw th;
                    }
                }
                throw new IOException("Google Play connection failed");
            } catch (Exception e2) {
                throw e2;
            }
        } else {
            throw new IllegalStateException("Cannot be called from the main thread");
        }
    }
}
