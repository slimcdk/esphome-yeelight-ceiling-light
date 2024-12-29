package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.BinderThread;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.C1520d;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.C1395d;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.C1577j;
import com.google.android.gms.common.internal.C1590o;
import com.google.android.gms.common.util.VisibleForTesting;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.concurrent.GuardedBy;
import p011c.p012a.p019b.p028b.p032c.p034b.C0574d;

@KeepForSdk
/* renamed from: com.google.android.gms.common.internal.d */
public abstract class C1550d<T extends IInterface> {

    /* renamed from: A */
    private static final Feature[] f2970A = new Feature[0];

    /* renamed from: a */
    private int f2971a;

    /* renamed from: b */
    private long f2972b;

    /* renamed from: c */
    private long f2973c;

    /* renamed from: d */
    private int f2974d;

    /* renamed from: e */
    private long f2975e;
    @VisibleForTesting

    /* renamed from: f */
    private C1589n0 f2976f;

    /* renamed from: g */
    private final Context f2977g;

    /* renamed from: h */
    private final C1577j f2978h;

    /* renamed from: i */
    private final C1520d f2979i;

    /* renamed from: j */
    final Handler f2980j;

    /* renamed from: k */
    private final Object f2981k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public final Object f2982l;
    /* access modifiers changed from: private */
    @GuardedBy("mServiceBrokerLock")

    /* renamed from: m */
    public C1595q f2983m;
    @VisibleForTesting

    /* renamed from: n */
    protected C1553c f2984n;
    @GuardedBy("mLock")

    /* renamed from: o */
    private T f2985o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public final ArrayList<C1558h<?>> f2986p;
    @GuardedBy("mLock")

    /* renamed from: q */
    private C1560j f2987q;
    @GuardedBy("mLock")

    /* renamed from: r */
    private int f2988r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public final C1551a f2989s;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public final C1552b f2990t;

    /* renamed from: u */
    private final int f2991u;

    /* renamed from: v */
    private final String f2992v;
    /* access modifiers changed from: private */

    /* renamed from: w */
    public ConnectionResult f2993w;
    /* access modifiers changed from: private */

    /* renamed from: x */
    public boolean f2994x;

    /* renamed from: y */
    private volatile zzb f2995y;
    @VisibleForTesting

    /* renamed from: z */
    protected AtomicInteger f2996z;

    @KeepForSdk
    /* renamed from: com.google.android.gms.common.internal.d$a */
    public interface C1551a {
        @KeepForSdk
        /* renamed from: a */
        void mo11136a(int i);

        @KeepForSdk
        /* renamed from: c */
        void mo11137c(@Nullable Bundle bundle);
    }

    @KeepForSdk
    /* renamed from: com.google.android.gms.common.internal.d$b */
    public interface C1552b {
        /* renamed from: f */
        void mo11138f(@NonNull ConnectionResult connectionResult);
    }

    @KeepForSdk
    /* renamed from: com.google.android.gms.common.internal.d$c */
    public interface C1553c {
        @KeepForSdk
        /* renamed from: a */
        void mo10937a(@NonNull ConnectionResult connectionResult);
    }

    /* renamed from: com.google.android.gms.common.internal.d$d */
    protected class C1554d implements C1553c {
        @KeepForSdk
        public C1554d() {
        }

        /* renamed from: a */
        public void mo10937a(@NonNull ConnectionResult connectionResult) {
            if (connectionResult.mo10749V()) {
                C1550d dVar = C1550d.this;
                dVar.mo11157d((C1584m) null, dVar.mo11143D());
            } else if (C1550d.this.f2990t != null) {
                C1550d.this.f2990t.mo11138f(connectionResult);
            }
        }
    }

    @KeepForSdk
    /* renamed from: com.google.android.gms.common.internal.d$e */
    public interface C1555e {
        @KeepForSdk
        /* renamed from: a */
        void mo11021a();
    }

    /* renamed from: com.google.android.gms.common.internal.d$f */
    private abstract class C1556f extends C1558h<Boolean> {

        /* renamed from: d */
        private final int f2998d;

        /* renamed from: e */
        private final Bundle f2999e;

        @BinderThread
        protected C1556f(int i, Bundle bundle) {
            super(Boolean.TRUE);
            this.f2998d = i;
            this.f2999e = bundle;
        }

        /* JADX WARNING: type inference failed for: r5v11, types: [android.os.Parcelable] */
        /* access modifiers changed from: protected */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ void mo11179c(java.lang.Object r5) {
            /*
                r4 = this;
                java.lang.Boolean r5 = (java.lang.Boolean) r5
                r0 = 1
                r1 = 0
                if (r5 != 0) goto L_0x000c
                com.google.android.gms.common.internal.d r5 = com.google.android.gms.common.internal.C1550d.this
                r5.m4210S(r0, null)
                return
            L_0x000c:
                int r5 = r4.f2998d
                if (r5 == 0) goto L_0x0061
                r2 = 10
                if (r5 == r2) goto L_0x0031
                com.google.android.gms.common.internal.d r5 = com.google.android.gms.common.internal.C1550d.this
                r5.m4210S(r0, null)
                android.os.Bundle r5 = r4.f2999e
                if (r5 == 0) goto L_0x0026
                java.lang.String r0 = "pendingIntent"
                android.os.Parcelable r5 = r5.getParcelable(r0)
                r1 = r5
                android.app.PendingIntent r1 = (android.app.PendingIntent) r1
            L_0x0026:
                com.google.android.gms.common.ConnectionResult r5 = new com.google.android.gms.common.ConnectionResult
                int r0 = r4.f2998d
                r5.<init>(r0, r1)
                r4.mo11181f(r5)
                goto L_0x0076
            L_0x0031:
                com.google.android.gms.common.internal.d r5 = com.google.android.gms.common.internal.C1550d.this
                r5.m4210S(r0, null)
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                r1 = 3
                java.lang.Object[] r1 = new java.lang.Object[r1]
                r2 = 0
                java.lang.Class r3 = r4.getClass()
                java.lang.String r3 = r3.getSimpleName()
                r1[r2] = r3
                com.google.android.gms.common.internal.d r2 = com.google.android.gms.common.internal.C1550d.this
                java.lang.String r2 = r2.mo11172t()
                r1[r0] = r2
                r0 = 2
                com.google.android.gms.common.internal.d r2 = com.google.android.gms.common.internal.C1550d.this
                java.lang.String r2 = r2.mo11164k()
                r1[r0] = r2
                java.lang.String r0 = "A fatal developer error has occurred. Class name: %s. Start service action: %s. Service Descriptor: %s. "
                java.lang.String r0 = java.lang.String.format(r0, r1)
                r5.<init>(r0)
                throw r5
            L_0x0061:
                boolean r5 = r4.mo11182g()
                if (r5 != 0) goto L_0x0076
                com.google.android.gms.common.internal.d r5 = com.google.android.gms.common.internal.C1550d.this
                r5.m4210S(r0, null)
                com.google.android.gms.common.ConnectionResult r5 = new com.google.android.gms.common.ConnectionResult
                r0 = 8
                r5.<init>(r0, r1)
                r4.mo11181f(r5)
            L_0x0076:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.C1550d.C1556f.mo11179c(java.lang.Object):void");
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public final void mo11180d() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: f */
        public abstract void mo11181f(ConnectionResult connectionResult);

        /* access modifiers changed from: protected */
        /* renamed from: g */
        public abstract boolean mo11182g();
    }

    /* renamed from: com.google.android.gms.common.internal.d$g */
    final class C1557g extends C0574d {
        public C1557g(Looper looper) {
            super(looper);
        }

        /* renamed from: a */
        private static void m4274a(Message message) {
            C1558h hVar = (C1558h) message.obj;
            hVar.mo11180d();
            hVar.mo11185b();
        }

        /* renamed from: b */
        private static boolean m4275b(Message message) {
            int i = message.what;
            return i == 2 || i == 1 || i == 7;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v17, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: android.app.PendingIntent} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void handleMessage(android.os.Message r8) {
            /*
                r7 = this;
                com.google.android.gms.common.internal.d r0 = com.google.android.gms.common.internal.C1550d.this
                java.util.concurrent.atomic.AtomicInteger r0 = r0.f2996z
                int r0 = r0.get()
                int r1 = r8.arg1
                if (r0 == r1) goto L_0x0016
                boolean r0 = m4275b(r8)
                if (r0 == 0) goto L_0x0015
                m4274a(r8)
            L_0x0015:
                return
            L_0x0016:
                int r0 = r8.what
                r1 = 4
                r2 = 1
                r3 = 5
                if (r0 == r2) goto L_0x002e
                r4 = 7
                if (r0 == r4) goto L_0x002e
                if (r0 != r1) goto L_0x002a
                com.google.android.gms.common.internal.d r0 = com.google.android.gms.common.internal.C1550d.this
                boolean r0 = r0.mo11176x()
                if (r0 == 0) goto L_0x002e
            L_0x002a:
                int r0 = r8.what
                if (r0 != r3) goto L_0x003a
            L_0x002e:
                com.google.android.gms.common.internal.d r0 = com.google.android.gms.common.internal.C1550d.this
                boolean r0 = r0.mo11159e()
                if (r0 != 0) goto L_0x003a
                m4274a(r8)
                return
            L_0x003a:
                int r0 = r8.what
                r4 = 8
                r5 = 3
                r6 = 0
                if (r0 != r1) goto L_0x0085
                com.google.android.gms.common.internal.d r0 = com.google.android.gms.common.internal.C1550d.this
                com.google.android.gms.common.ConnectionResult r1 = new com.google.android.gms.common.ConnectionResult
                int r8 = r8.arg2
                r1.<init>(r8)
                com.google.android.gms.common.ConnectionResult unused = r0.f2993w = r1
                com.google.android.gms.common.internal.d r8 = com.google.android.gms.common.internal.C1550d.this
                boolean r8 = r8.m4226i0()
                if (r8 == 0) goto L_0x0064
                com.google.android.gms.common.internal.d r8 = com.google.android.gms.common.internal.C1550d.this
                boolean r8 = r8.f2994x
                if (r8 != 0) goto L_0x0064
                com.google.android.gms.common.internal.d r8 = com.google.android.gms.common.internal.C1550d.this
                r8.m4210S(r5, null)
                return
            L_0x0064:
                com.google.android.gms.common.internal.d r8 = com.google.android.gms.common.internal.C1550d.this
                com.google.android.gms.common.ConnectionResult r8 = r8.f2993w
                if (r8 == 0) goto L_0x0073
                com.google.android.gms.common.internal.d r8 = com.google.android.gms.common.internal.C1550d.this
                com.google.android.gms.common.ConnectionResult r8 = r8.f2993w
                goto L_0x0078
            L_0x0073:
                com.google.android.gms.common.ConnectionResult r8 = new com.google.android.gms.common.ConnectionResult
                r8.<init>(r4)
            L_0x0078:
                com.google.android.gms.common.internal.d r0 = com.google.android.gms.common.internal.C1550d.this
                com.google.android.gms.common.internal.d$c r0 = r0.f2984n
                r0.mo10937a(r8)
                com.google.android.gms.common.internal.d r0 = com.google.android.gms.common.internal.C1550d.this
                r0.mo11147H(r8)
                return
            L_0x0085:
                if (r0 != r3) goto L_0x00a8
                com.google.android.gms.common.internal.d r8 = com.google.android.gms.common.internal.C1550d.this
                com.google.android.gms.common.ConnectionResult r8 = r8.f2993w
                if (r8 == 0) goto L_0x0096
                com.google.android.gms.common.internal.d r8 = com.google.android.gms.common.internal.C1550d.this
                com.google.android.gms.common.ConnectionResult r8 = r8.f2993w
                goto L_0x009b
            L_0x0096:
                com.google.android.gms.common.ConnectionResult r8 = new com.google.android.gms.common.ConnectionResult
                r8.<init>(r4)
            L_0x009b:
                com.google.android.gms.common.internal.d r0 = com.google.android.gms.common.internal.C1550d.this
                com.google.android.gms.common.internal.d$c r0 = r0.f2984n
                r0.mo10937a(r8)
                com.google.android.gms.common.internal.d r0 = com.google.android.gms.common.internal.C1550d.this
                r0.mo11147H(r8)
                return
            L_0x00a8:
                if (r0 != r5) goto L_0x00c7
                java.lang.Object r0 = r8.obj
                boolean r1 = r0 instanceof android.app.PendingIntent
                if (r1 == 0) goto L_0x00b3
                r6 = r0
                android.app.PendingIntent r6 = (android.app.PendingIntent) r6
            L_0x00b3:
                com.google.android.gms.common.ConnectionResult r0 = new com.google.android.gms.common.ConnectionResult
                int r8 = r8.arg2
                r0.<init>(r8, r6)
                com.google.android.gms.common.internal.d r8 = com.google.android.gms.common.internal.C1550d.this
                com.google.android.gms.common.internal.d$c r8 = r8.f2984n
                r8.mo10937a(r0)
                com.google.android.gms.common.internal.d r8 = com.google.android.gms.common.internal.C1550d.this
                r8.mo11147H(r0)
                return
            L_0x00c7:
                r1 = 6
                if (r0 != r1) goto L_0x00ef
                com.google.android.gms.common.internal.d r0 = com.google.android.gms.common.internal.C1550d.this
                r0.m4210S(r3, null)
                com.google.android.gms.common.internal.d r0 = com.google.android.gms.common.internal.C1550d.this
                com.google.android.gms.common.internal.d$a r0 = r0.f2989s
                if (r0 == 0) goto L_0x00e2
                com.google.android.gms.common.internal.d r0 = com.google.android.gms.common.internal.C1550d.this
                com.google.android.gms.common.internal.d$a r0 = r0.f2989s
                int r1 = r8.arg2
                r0.mo11136a(r1)
            L_0x00e2:
                com.google.android.gms.common.internal.d r0 = com.google.android.gms.common.internal.C1550d.this
                int r8 = r8.arg2
                r0.mo11148I(r8)
                com.google.android.gms.common.internal.d r8 = com.google.android.gms.common.internal.C1550d.this
                boolean unused = r8.m4215X(r3, r2, r6)
                return
            L_0x00ef:
                r1 = 2
                if (r0 != r1) goto L_0x00fe
                com.google.android.gms.common.internal.d r0 = com.google.android.gms.common.internal.C1550d.this
                boolean r0 = r0.isConnected()
                if (r0 != 0) goto L_0x00fe
                m4274a(r8)
                return
            L_0x00fe:
                boolean r0 = m4275b(r8)
                if (r0 == 0) goto L_0x010c
                java.lang.Object r8 = r8.obj
                com.google.android.gms.common.internal.d$h r8 = (com.google.android.gms.common.internal.C1550d.C1558h) r8
                r8.mo11186e()
                return
            L_0x010c:
                int r8 = r8.what
                r0 = 45
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>(r0)
                java.lang.String r0 = "Don't know how to handle message: "
                r1.append(r0)
                r1.append(r8)
                java.lang.String r8 = r1.toString()
                java.lang.Exception r0 = new java.lang.Exception
                r0.<init>()
                java.lang.String r1 = "GmsClient"
                android.util.Log.wtf(r1, r8, r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.C1550d.C1557g.handleMessage(android.os.Message):void");
        }
    }

    /* renamed from: com.google.android.gms.common.internal.d$h */
    protected abstract class C1558h<TListener> {

        /* renamed from: a */
        private TListener f3002a;

        /* renamed from: b */
        private boolean f3003b = false;

        public C1558h(TListener tlistener) {
            this.f3002a = tlistener;
        }

        /* renamed from: a */
        public final void mo11184a() {
            synchronized (this) {
                this.f3002a = null;
            }
        }

        /* renamed from: b */
        public final void mo11185b() {
            mo11184a();
            synchronized (C1550d.this.f2986p) {
                C1550d.this.f2986p.remove(this);
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public abstract void mo11179c(TListener tlistener);

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public abstract void mo11180d();

        /* renamed from: e */
        public final void mo11186e() {
            TListener tlistener;
            synchronized (this) {
                tlistener = this.f3002a;
                if (this.f3003b) {
                    String valueOf = String.valueOf(this);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 47);
                    sb.append("Callback proxy ");
                    sb.append(valueOf);
                    sb.append(" being reused. This is not safe.");
                    sb.toString();
                }
            }
            if (tlistener != null) {
                try {
                    mo11179c(tlistener);
                } catch (RuntimeException e) {
                    mo11180d();
                    throw e;
                }
            } else {
                mo11180d();
            }
            synchronized (this) {
                this.f3003b = true;
            }
            mo11185b();
        }
    }

    @VisibleForTesting
    /* renamed from: com.google.android.gms.common.internal.d$i */
    public static final class C1559i extends C1590o.C1591a {

        /* renamed from: a */
        private C1550d f3005a;

        /* renamed from: b */
        private final int f3006b;

        public C1559i(@NonNull C1550d dVar, int i) {
            this.f3005a = dVar;
            this.f3006b = i;
        }

        @BinderThread
        /* renamed from: T */
        public final void mo11187T(int i, @NonNull IBinder iBinder, @NonNull zzb zzb) {
            C1609u.m4476l(this.f3005a, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
            C1609u.m4475k(zzb);
            this.f3005a.m4214W(zzb);
            mo11189h0(i, iBinder, zzb.f3092a);
        }

        @BinderThread
        /* renamed from: a0 */
        public final void mo11188a0(int i, @Nullable Bundle bundle) {
            Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
        }

        @BinderThread
        /* renamed from: h0 */
        public final void mo11189h0(int i, @NonNull IBinder iBinder, @Nullable Bundle bundle) {
            C1609u.m4476l(this.f3005a, "onPostInitComplete can be called only once per call to getRemoteService");
            this.f3005a.mo11149J(i, iBinder, bundle, this.f3006b);
            this.f3005a = null;
        }
    }

    @VisibleForTesting
    /* renamed from: com.google.android.gms.common.internal.d$j */
    public final class C1560j implements ServiceConnection {

        /* renamed from: a */
        private final int f3007a;

        public C1560j(int i) {
            this.f3007a = i;
        }

        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            C1595q qVar;
            C1550d dVar = C1550d.this;
            if (iBinder == null) {
                dVar.m4217Z(16);
                return;
            }
            synchronized (dVar.f2982l) {
                C1550d dVar2 = C1550d.this;
                if (iBinder == null) {
                    qVar = null;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                    qVar = (queryLocalInterface == null || !(queryLocalInterface instanceof C1595q)) ? new C1593p(iBinder) : (C1595q) queryLocalInterface;
                }
                C1595q unused = dVar2.f2983m = qVar;
            }
            C1550d.this.mo11154R(0, (Bundle) null, this.f3007a);
        }

        public final void onServiceDisconnected(ComponentName componentName) {
            synchronized (C1550d.this.f2982l) {
                C1595q unused = C1550d.this.f2983m = null;
            }
            Handler handler = C1550d.this.f2980j;
            handler.sendMessage(handler.obtainMessage(6, this.f3007a, 1));
        }
    }

    /* renamed from: com.google.android.gms.common.internal.d$k */
    protected final class C1561k extends C1556f {

        /* renamed from: g */
        private final IBinder f3009g;

        @BinderThread
        public C1561k(int i, IBinder iBinder, Bundle bundle) {
            super(i, bundle);
            this.f3009g = iBinder;
        }

        /* access modifiers changed from: protected */
        /* renamed from: f */
        public final void mo11181f(ConnectionResult connectionResult) {
            if (C1550d.this.f2990t != null) {
                C1550d.this.f2990t.mo11138f(connectionResult);
            }
            C1550d.this.mo11147H(connectionResult);
        }

        /* access modifiers changed from: protected */
        /* renamed from: g */
        public final boolean mo11182g() {
            try {
                String interfaceDescriptor = this.f3009g.getInterfaceDescriptor();
                if (!C1550d.this.mo11164k().equals(interfaceDescriptor)) {
                    String k = C1550d.this.mo11164k();
                    StringBuilder sb = new StringBuilder(String.valueOf(k).length() + 34 + String.valueOf(interfaceDescriptor).length());
                    sb.append("service descriptor mismatch: ");
                    sb.append(k);
                    sb.append(" vs. ");
                    sb.append(interfaceDescriptor);
                    sb.toString();
                    return false;
                }
                IInterface l = C1550d.this.mo11165l(this.f3009g);
                if (l == null) {
                    return false;
                }
                if (!C1550d.this.m4215X(2, 4, l) && !C1550d.this.m4215X(3, 4, l)) {
                    return false;
                }
                ConnectionResult unused = C1550d.this.f2993w = null;
                Bundle u = C1550d.this.mo11173u();
                if (C1550d.this.f2989s != null) {
                    C1550d.this.f2989s.mo11137c(u);
                }
                return true;
            } catch (RemoteException unused2) {
                return false;
            }
        }
    }

    /* renamed from: com.google.android.gms.common.internal.d$l */
    protected final class C1562l extends C1556f {
        @BinderThread
        public C1562l(int i, @Nullable Bundle bundle) {
            super(i, (Bundle) null);
        }

        /* access modifiers changed from: protected */
        /* renamed from: f */
        public final void mo11181f(ConnectionResult connectionResult) {
            if (!C1550d.this.mo11176x() || !C1550d.this.m4226i0()) {
                C1550d.this.f2984n.mo10937a(connectionResult);
                C1550d.this.mo11147H(connectionResult);
                return;
            }
            C1550d.this.m4217Z(16);
        }

        /* access modifiers changed from: protected */
        /* renamed from: g */
        public final boolean mo11182g() {
            C1550d.this.f2984n.mo10937a(ConnectionResult.RESULT_SUCCESS);
            return true;
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    @com.google.android.gms.common.annotation.KeepForSdk
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected C1550d(android.content.Context r10, android.os.Looper r11, int r12, com.google.android.gms.common.internal.C1550d.C1551a r13, com.google.android.gms.common.internal.C1550d.C1552b r14, java.lang.String r15) {
        /*
            r9 = this;
            com.google.android.gms.common.internal.j r3 = com.google.android.gms.common.internal.C1577j.m4331a(r10)
            com.google.android.gms.common.d r4 = com.google.android.gms.common.C1520d.m4113h()
            com.google.android.gms.common.internal.C1609u.m4475k(r13)
            r6 = r13
            com.google.android.gms.common.internal.d$a r6 = (com.google.android.gms.common.internal.C1550d.C1551a) r6
            com.google.android.gms.common.internal.C1609u.m4475k(r14)
            r7 = r14
            com.google.android.gms.common.internal.d$b r7 = (com.google.android.gms.common.internal.C1550d.C1552b) r7
            r0 = r9
            r1 = r10
            r2 = r11
            r5 = r12
            r8 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.C1550d.<init>(android.content.Context, android.os.Looper, int, com.google.android.gms.common.internal.d$a, com.google.android.gms.common.internal.d$b, java.lang.String):void");
    }

    @KeepForSdk
    @VisibleForTesting
    protected C1550d(Context context, Looper looper, C1577j jVar, C1520d dVar, int i, C1551a aVar, C1552b bVar, String str) {
        this.f2981k = new Object();
        this.f2982l = new Object();
        this.f2986p = new ArrayList<>();
        this.f2988r = 1;
        this.f2993w = null;
        this.f2994x = false;
        this.f2995y = null;
        this.f2996z = new AtomicInteger(0);
        C1609u.m4476l(context, "Context must not be null");
        this.f2977g = context;
        C1609u.m4476l(looper, "Looper must not be null");
        Looper looper2 = looper;
        C1609u.m4476l(jVar, "Supervisor must not be null");
        this.f2978h = jVar;
        C1609u.m4476l(dVar, "API availability must not be null");
        this.f2979i = dVar;
        this.f2980j = new C1557g(looper);
        this.f2991u = i;
        this.f2989s = aVar;
        this.f2990t = bVar;
        this.f2992v = str;
    }

    /* access modifiers changed from: private */
    /* renamed from: S */
    public final void m4210S(int i, T t) {
        C1609u.m4465a((i == 4) == (t != null));
        synchronized (this.f2981k) {
            this.f2988r = i;
            this.f2985o = t;
            mo11150K(i, t);
            if (i != 1) {
                if (i == 2 || i == 3) {
                    if (!(this.f2987q == null || this.f2976f == null)) {
                        String c = this.f2976f.mo11265c();
                        String a = this.f2976f.mo11263a();
                        StringBuilder sb = new StringBuilder(String.valueOf(c).length() + 70 + String.valueOf(a).length());
                        sb.append("Calling connect() while still connected, missing disconnect() for ");
                        sb.append(c);
                        sb.append(" on ");
                        sb.append(a);
                        sb.toString();
                        this.f2978h.mo11229b(this.f2976f.mo11265c(), this.f2976f.mo11263a(), this.f2976f.mo11264b(), this.f2987q, m4224g0());
                        this.f2996z.incrementAndGet();
                    }
                    this.f2987q = new C1560j(this.f2996z.get());
                    C1589n0 n0Var = (this.f2988r != 3 || mo11142C() == null) ? new C1589n0(mo11145F(), mo11172t(), false, 129) : new C1589n0(mo11140A().getPackageName(), mo11142C(), true, 129);
                    this.f2976f = n0Var;
                    if (!this.f2978h.mo11230c(new C1577j.C1578a(n0Var.mo11265c(), this.f2976f.mo11263a(), this.f2976f.mo11264b()), this.f2987q, m4224g0())) {
                        String c2 = this.f2976f.mo11265c();
                        String a2 = this.f2976f.mo11263a();
                        StringBuilder sb2 = new StringBuilder(String.valueOf(c2).length() + 34 + String.valueOf(a2).length());
                        sb2.append("unable to connect to service: ");
                        sb2.append(c2);
                        sb2.append(" on ");
                        sb2.append(a2);
                        sb2.toString();
                        mo11154R(16, (Bundle) null, this.f2996z.get());
                    }
                } else if (i == 4) {
                    mo11146G(t);
                }
            } else if (this.f2987q != null) {
                this.f2978h.mo11229b(this.f2976f.mo11265c(), this.f2976f.mo11263a(), this.f2976f.mo11264b(), this.f2987q, m4224g0());
                this.f2987q = null;
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: W */
    public final void m4214W(zzb zzb) {
        this.f2995y = zzb;
    }

    /* access modifiers changed from: private */
    /* renamed from: X */
    public final boolean m4215X(int i, int i2, T t) {
        synchronized (this.f2981k) {
            if (this.f2988r != i) {
                return false;
            }
            m4210S(i2, t);
            return true;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: Z */
    public final void m4217Z(int i) {
        int i2;
        if (m4225h0()) {
            i2 = 5;
            this.f2994x = true;
        } else {
            i2 = 4;
        }
        Handler handler = this.f2980j;
        handler.sendMessage(handler.obtainMessage(i2, this.f2996z.get(), 16));
    }

    @Nullable
    /* renamed from: g0 */
    private final String m4224g0() {
        String str = this.f2992v;
        return str == null ? this.f2977g.getClass().getName() : str;
    }

    /* renamed from: h0 */
    private final boolean m4225h0() {
        boolean z;
        synchronized (this.f2981k) {
            z = this.f2988r == 3;
        }
        return z;
    }

    /* access modifiers changed from: private */
    /* renamed from: i0 */
    public final boolean m4226i0() {
        if (this.f2994x || TextUtils.isEmpty(mo11164k()) || TextUtils.isEmpty(mo11142C())) {
            return false;
        }
        try {
            Class.forName(mo11164k());
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    @KeepForSdk
    /* renamed from: A */
    public final Context mo11140A() {
        return this.f2977g;
    }

    /* access modifiers changed from: protected */
    @KeepForSdk
    /* renamed from: B */
    public Bundle mo11141B() {
        return new Bundle();
    }

    /* access modifiers changed from: protected */
    @KeepForSdk
    @Nullable
    /* renamed from: C */
    public String mo11142C() {
        return null;
    }

    /* access modifiers changed from: protected */
    @KeepForSdk
    /* renamed from: D */
    public Set<Scope> mo11143D() {
        return Collections.EMPTY_SET;
    }

    @KeepForSdk
    /* renamed from: E */
    public final T mo11144E() {
        T t;
        synchronized (this.f2981k) {
            if (this.f2988r != 5) {
                mo11175w();
                C1609u.m4479o(this.f2985o != null, "Client is connected but service is null");
                t = this.f2985o;
            } else {
                throw new DeadObjectException();
            }
        }
        return t;
    }

    /* access modifiers changed from: protected */
    @KeepForSdk
    /* renamed from: F */
    public String mo11145F() {
        return "com.google.android.gms";
    }

    /* access modifiers changed from: protected */
    @CallSuper
    @KeepForSdk
    /* renamed from: G */
    public void mo11146G(@NonNull T t) {
        this.f2973c = System.currentTimeMillis();
    }

    /* access modifiers changed from: protected */
    @CallSuper
    @KeepForSdk
    /* renamed from: H */
    public void mo11147H(ConnectionResult connectionResult) {
        this.f2974d = connectionResult.mo10745Q();
        this.f2975e = System.currentTimeMillis();
    }

    /* access modifiers changed from: protected */
    @CallSuper
    @KeepForSdk
    /* renamed from: I */
    public void mo11148I(int i) {
        this.f2971a = i;
        this.f2972b = System.currentTimeMillis();
    }

    /* access modifiers changed from: protected */
    @KeepForSdk
    /* renamed from: J */
    public void mo11149J(int i, IBinder iBinder, Bundle bundle, int i2) {
        Handler handler = this.f2980j;
        handler.sendMessage(handler.obtainMessage(1, i2, -1, new C1561k(i, iBinder, bundle)));
    }

    /* access modifiers changed from: package-private */
    @KeepForSdk
    /* renamed from: K */
    public void mo11150K(int i, T t) {
    }

    @KeepForSdk
    /* renamed from: L */
    public boolean mo11151L() {
        return false;
    }

    @KeepForSdk
    /* renamed from: M */
    public void mo11152M(int i) {
        Handler handler = this.f2980j;
        handler.sendMessage(handler.obtainMessage(6, this.f2996z.get(), i));
    }

    /* access modifiers changed from: protected */
    @KeepForSdk
    @VisibleForTesting
    /* renamed from: N */
    public void mo11153N(@NonNull C1553c cVar, int i, @Nullable PendingIntent pendingIntent) {
        C1609u.m4476l(cVar, "Connection progress callbacks cannot be null.");
        this.f2984n = cVar;
        Handler handler = this.f2980j;
        handler.sendMessage(handler.obtainMessage(3, this.f2996z.get(), i, pendingIntent));
    }

    /* access modifiers changed from: protected */
    /* renamed from: R */
    public final void mo11154R(int i, @Nullable Bundle bundle, int i2) {
        Handler handler = this.f2980j;
        handler.sendMessage(handler.obtainMessage(7, i2, -1, new C1562l(i, (Bundle) null)));
    }

    @KeepForSdk
    /* renamed from: b */
    public void mo11155b(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int i;
        T t;
        C1595q qVar;
        synchronized (this.f2981k) {
            i = this.f2988r;
            t = this.f2985o;
        }
        synchronized (this.f2982l) {
            qVar = this.f2983m;
        }
        printWriter.append(str).append("mConnectState=");
        printWriter.print(i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "UNKNOWN" : "DISCONNECTING" : "CONNECTED" : "LOCAL_CONNECTING" : "REMOTE_CONNECTING" : "DISCONNECTED");
        printWriter.append(" mService=");
        if (t == null) {
            printWriter.append("null");
        } else {
            printWriter.append(mo11164k()).append("@").append(Integer.toHexString(System.identityHashCode(t.asBinder())));
        }
        printWriter.append(" mServiceBroker=");
        if (qVar == null) {
            printWriter.println("null");
        } else {
            printWriter.append("IGmsServiceBroker@").println(Integer.toHexString(System.identityHashCode(qVar.asBinder())));
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.US);
        if (this.f2973c > 0) {
            PrintWriter append = printWriter.append(str).append("lastConnectedTime=");
            long j = this.f2973c;
            String format = simpleDateFormat.format(new Date(this.f2973c));
            StringBuilder sb = new StringBuilder(String.valueOf(format).length() + 21);
            sb.append(j);
            sb.append(" ");
            sb.append(format);
            append.println(sb.toString());
        }
        if (this.f2972b > 0) {
            printWriter.append(str).append("lastSuspendedCause=");
            int i2 = this.f2971a;
            printWriter.append(i2 != 1 ? i2 != 2 ? String.valueOf(i2) : "CAUSE_NETWORK_LOST" : "CAUSE_SERVICE_DISCONNECTED");
            PrintWriter append2 = printWriter.append(" lastSuspendedTime=");
            long j2 = this.f2972b;
            String format2 = simpleDateFormat.format(new Date(this.f2972b));
            StringBuilder sb2 = new StringBuilder(String.valueOf(format2).length() + 21);
            sb2.append(j2);
            sb2.append(" ");
            sb2.append(format2);
            append2.println(sb2.toString());
        }
        if (this.f2975e > 0) {
            printWriter.append(str).append("lastFailedStatus=").append(C1395d.m3645a(this.f2974d));
            PrintWriter append3 = printWriter.append(" lastFailedTime=");
            long j3 = this.f2975e;
            String format3 = simpleDateFormat.format(new Date(this.f2975e));
            StringBuilder sb3 = new StringBuilder(String.valueOf(format3).length() + 21);
            sb3.append(j3);
            sb3.append(" ");
            sb3.append(format3);
            append3.println(sb3.toString());
        }
    }

    @KeepForSdk
    /* renamed from: c */
    public boolean mo11156c() {
        return false;
    }

    @WorkerThread
    @KeepForSdk
    /* renamed from: d */
    public void mo11157d(C1584m mVar, Set<Scope> set) {
        Bundle B = mo11141B();
        GetServiceRequest getServiceRequest = new GetServiceRequest(this.f2991u);
        getServiceRequest.f2947d = this.f2977g.getPackageName();
        getServiceRequest.f2950g = B;
        if (set != null) {
            getServiceRequest.f2949f = (Scope[]) set.toArray(new Scope[set.size()]);
        }
        if (mo11170r()) {
            getServiceRequest.f2951h = mo11177y() != null ? mo11177y() : new Account("<<default account>>", "com.google");
            if (mVar != null) {
                getServiceRequest.f2948e = mVar.asBinder();
            }
        } else if (mo11151L()) {
            getServiceRequest.f2951h = mo11177y();
        }
        getServiceRequest.f2952i = f2970A;
        getServiceRequest.f2953j = mo11178z();
        try {
            synchronized (this.f2982l) {
                if (this.f2983m != null) {
                    this.f2983m.mo11268A(new C1559i(this, this.f2996z.get()), getServiceRequest);
                }
            }
        } catch (DeadObjectException unused) {
            mo11152M(1);
        } catch (SecurityException e) {
            throw e;
        } catch (RemoteException | RuntimeException unused2) {
            mo11149J(8, (IBinder) null, (Bundle) null, this.f2996z.get());
        }
    }

    @KeepForSdk
    public void disconnect() {
        this.f2996z.incrementAndGet();
        synchronized (this.f2986p) {
            int size = this.f2986p.size();
            for (int i = 0; i < size; i++) {
                this.f2986p.get(i).mo11184a();
            }
            this.f2986p.clear();
        }
        synchronized (this.f2982l) {
            this.f2983m = null;
        }
        m4210S(1, (IInterface) null);
    }

    @KeepForSdk
    /* renamed from: e */
    public boolean mo11159e() {
        boolean z;
        synchronized (this.f2981k) {
            if (this.f2988r != 2) {
                if (this.f2988r != 3) {
                    z = false;
                }
            }
            z = true;
        }
        return z;
    }

    @KeepForSdk
    /* renamed from: f */
    public String mo11160f() {
        C1589n0 n0Var;
        if (isConnected() && (n0Var = this.f2976f) != null) {
            return n0Var.mo11263a();
        }
        throw new RuntimeException("Failed to connect when checking package");
    }

    @KeepForSdk
    /* renamed from: h */
    public void mo11161h(@NonNull C1553c cVar) {
        C1609u.m4476l(cVar, "Connection progress callbacks cannot be null.");
        this.f2984n = cVar;
        m4210S(2, (IInterface) null);
    }

    @KeepForSdk
    public boolean isConnected() {
        boolean z;
        synchronized (this.f2981k) {
            z = this.f2988r == 4;
        }
        return z;
    }

    @KeepForSdk
    /* renamed from: j */
    public void mo11163j(@NonNull C1555e eVar) {
        eVar.mo11021a();
    }

    /* access modifiers changed from: protected */
    @NonNull
    @KeepForSdk
    /* renamed from: k */
    public abstract String mo11164k();

    /* access modifiers changed from: protected */
    @KeepForSdk
    @Nullable
    /* renamed from: l */
    public abstract T mo11165l(IBinder iBinder);

    @KeepForSdk
    /* renamed from: m */
    public boolean mo11166m() {
        return true;
    }

    @KeepForSdk
    /* renamed from: n */
    public int mo11167n() {
        return C1520d.f2875a;
    }

    @KeepForSdk
    @Nullable
    /* renamed from: p */
    public final Feature[] mo11168p() {
        zzb zzb = this.f2995y;
        if (zzb == null) {
            return null;
        }
        return zzb.f3093b;
    }

    @KeepForSdk
    /* renamed from: q */
    public Intent mo11169q() {
        throw new UnsupportedOperationException("Not a sign in API");
    }

    @KeepForSdk
    /* renamed from: r */
    public boolean mo11170r() {
        return false;
    }

    @KeepForSdk
    @Nullable
    /* renamed from: s */
    public IBinder mo11171s() {
        synchronized (this.f2982l) {
            if (this.f2983m == null) {
                return null;
            }
            IBinder asBinder = this.f2983m.asBinder();
            return asBinder;
        }
    }

    /* access modifiers changed from: protected */
    @NonNull
    @KeepForSdk
    /* renamed from: t */
    public abstract String mo11172t();

    @KeepForSdk
    /* renamed from: u */
    public Bundle mo11173u() {
        return null;
    }

    @KeepForSdk
    /* renamed from: v */
    public void mo11174v() {
        int j = this.f2979i.mo11045j(this.f2977g, mo11167n());
        if (j != 0) {
            m4210S(1, (IInterface) null);
            mo11153N(new C1554d(), j, (PendingIntent) null);
            return;
        }
        mo11161h(new C1554d());
    }

    /* access modifiers changed from: protected */
    @KeepForSdk
    /* renamed from: w */
    public final void mo11175w() {
        if (!isConnected()) {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        }
    }

    /* access modifiers changed from: protected */
    @KeepForSdk
    /* renamed from: x */
    public boolean mo11176x() {
        return false;
    }

    @KeepForSdk
    /* renamed from: y */
    public Account mo11177y() {
        return null;
    }

    @KeepForSdk
    /* renamed from: z */
    public Feature[] mo11178z() {
        return f2970A;
    }
}
