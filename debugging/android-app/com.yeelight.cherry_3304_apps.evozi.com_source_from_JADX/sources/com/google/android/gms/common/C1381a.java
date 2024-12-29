package com.google.android.gms.common;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.C1609u;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

@KeepForSdk
/* renamed from: com.google.android.gms.common.a */
public class C1381a implements ServiceConnection {

    /* renamed from: a */
    private boolean f2543a = false;

    /* renamed from: b */
    private final BlockingQueue<IBinder> f2544b = new LinkedBlockingQueue();

    @KeepForSdk
    /* renamed from: a */
    public IBinder mo10760a(long j, TimeUnit timeUnit) {
        C1609u.m4474j("BlockingServiceConnection.getServiceWithTimeout() called on main thread");
        if (!this.f2543a) {
            this.f2543a = true;
            IBinder poll = this.f2544b.poll(j, timeUnit);
            if (poll != null) {
                return poll;
            }
            throw new TimeoutException("Timed out waiting for the service connection");
        }
        throw new IllegalStateException("Cannot call get on this connection more than once");
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f2544b.add(iBinder);
    }

    public void onServiceDisconnected(ComponentName componentName) {
    }
}
