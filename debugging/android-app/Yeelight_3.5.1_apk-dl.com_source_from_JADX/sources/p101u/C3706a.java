package p101u;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.C0917i;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

@KeepForSdk
/* renamed from: u.a */
public class C3706a implements ServiceConnection {

    /* renamed from: a */
    boolean f6229a = false;

    /* renamed from: b */
    private final BlockingQueue f6230b = new LinkedBlockingQueue();

    @NonNull
    @KeepForSdk
    /* renamed from: a */
    public IBinder mo26120a(long j, @NonNull TimeUnit timeUnit) {
        C0917i.m1418i("BlockingServiceConnection.getServiceWithTimeout() called on main thread");
        if (!this.f6229a) {
            this.f6229a = true;
            IBinder iBinder = (IBinder) this.f6230b.poll(j, timeUnit);
            if (iBinder != null) {
                return iBinder;
            }
            throw new TimeoutException("Timed out waiting for the service connection");
        }
        throw new IllegalStateException("Cannot call get on this connection more than once");
    }

    public final void onServiceConnected(@NonNull ComponentName componentName, @NonNull IBinder iBinder) {
        this.f6230b.add(iBinder);
    }

    public final void onServiceDisconnected(@NonNull ComponentName componentName) {
    }
}
