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

/* renamed from: com.xiaomi.push.j */
final class C4781j {

    /* renamed from: com.xiaomi.push.j$a */
    static final class C4782a {

        /* renamed from: a */
        private final String f9794a;

        /* renamed from: a */
        private final boolean f9795a;

        C4782a(String str, boolean z) {
            this.f9794a = str;
            this.f9795a = z;
        }

        /* renamed from: a */
        public String mo25807a() {
            return this.f9794a;
        }
    }

    /* renamed from: com.xiaomi.push.j$b */
    private static final class C4783b implements ServiceConnection {

        /* renamed from: a */
        private final LinkedBlockingQueue<IBinder> f9796a;

        /* renamed from: a */
        boolean f9797a;

        private C4783b() {
            this.f9797a = false;
            this.f9796a = new LinkedBlockingQueue<>(1);
        }

        /* renamed from: a */
        public IBinder mo25808a() {
            if (!this.f9797a) {
                this.f9797a = true;
                return this.f9796a.poll(30000, TimeUnit.MILLISECONDS);
            }
            throw new IllegalStateException();
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                this.f9796a.put(iBinder);
            } catch (InterruptedException unused) {
            }
        }

        public void onServiceDisconnected(ComponentName componentName) {
        }
    }

    /* renamed from: com.xiaomi.push.j$c */
    private static final class C4784c implements IInterface {

        /* renamed from: a */
        private IBinder f9798a;

        public C4784c(IBinder iBinder) {
            this.f9798a = iBinder;
        }

        /* renamed from: a */
        public String mo25811a() {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                this.f9798a.transact(1, obtain, obtain2, 0);
                obtain2.readException();
                return obtain2.readString();
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }

        public IBinder asBinder() {
            return this.f9798a;
        }
    }

    /* renamed from: a */
    public static C4782a m15245a(Context context) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            try {
                context.getPackageManager().getPackageInfo("com.android.vending", 0);
                C4783b bVar = new C4783b();
                Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                intent.setPackage("com.google.android.gms");
                if (context.bindService(intent, bVar, 1)) {
                    try {
                        IBinder a = bVar.mo25808a();
                        if (a != null) {
                            C4782a aVar = new C4782a(new C4784c(a).mo25811a(), false);
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
