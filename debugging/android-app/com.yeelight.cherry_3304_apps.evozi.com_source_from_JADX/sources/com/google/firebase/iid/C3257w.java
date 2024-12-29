package com.google.firebase.iid;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import android.util.Log;
import androidx.collection.SimpleArrayMap;
import com.google.firebase.iid.zzj;
import com.xiaomi.account.openauth.XiaomiOAuthConstants;
import com.xiaomi.mipush.sdk.Constants;
import java.util.concurrent.ExecutionException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.annotation.concurrent.GuardedBy;
import p011c.p012a.p019b.p028b.p038e.C0620i;
import p011c.p012a.p019b.p028b.p038e.C0623k;

/* renamed from: com.google.firebase.iid.w */
final class C3257w {

    /* renamed from: g */
    private static int f6295g;

    /* renamed from: h */
    private static PendingIntent f6296h;
    @GuardedBy("responseCallbacks")

    /* renamed from: a */
    private final SimpleArrayMap<String, C0620i<Bundle>> f6297a = new SimpleArrayMap<>();

    /* renamed from: b */
    private final Context f6298b;

    /* renamed from: c */
    private final C3245q f6299c;

    /* renamed from: d */
    private Messenger f6300d;

    /* renamed from: e */
    private Messenger f6301e;

    /* renamed from: f */
    private zzj f6302f;

    public C3257w(Context context, C3245q qVar) {
        this.f6298b = context;
        this.f6299c = qVar;
        this.f6300d = new Messenger(new C3263z(this, Looper.getMainLooper()));
    }

    /* renamed from: b */
    private static synchronized String m10113b() {
        String num;
        synchronized (C3257w.class) {
            int i = f6295g;
            f6295g = i + 1;
            num = Integer.toString(i);
        }
        return num;
    }

    /* renamed from: c */
    private static synchronized void m10114c(Context context, Intent intent) {
        synchronized (C3257w.class) {
            if (f6296h == null) {
                Intent intent2 = new Intent();
                intent2.setPackage("com.google.example.invalidpackage");
                f6296h = PendingIntent.getBroadcast(context, 0, intent2, 0);
            }
            intent.putExtra("app", f6296h);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public final void m10115d(Message message) {
        if (message != null) {
            Object obj = message.obj;
            if (obj instanceof Intent) {
                Intent intent = (Intent) obj;
                intent.setExtrasClassLoader(new zzj.C3265a());
                if (intent.hasExtra("google.messenger")) {
                    Parcelable parcelableExtra = intent.getParcelableExtra("google.messenger");
                    if (parcelableExtra instanceof zzj) {
                        this.f6302f = (zzj) parcelableExtra;
                    }
                    if (parcelableExtra instanceof Messenger) {
                        this.f6301e = (Messenger) parcelableExtra;
                    }
                }
                Intent intent2 = (Intent) message.obj;
                String action = intent2.getAction();
                if ("com.google.android.c2dm.intent.REGISTRATION".equals(action)) {
                    String stringExtra = intent2.getStringExtra("registration_id");
                    if (stringExtra == null) {
                        stringExtra = intent2.getStringExtra("unregistered");
                    }
                    if (stringExtra == null) {
                        String stringExtra2 = intent2.getStringExtra(XiaomiOAuthConstants.EXTRA_ERROR_CODE_2);
                        if (stringExtra2 == null) {
                            String valueOf = String.valueOf(intent2.getExtras());
                            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 49);
                            sb.append("Unexpected response, no error or registration id ");
                            sb.append(valueOf);
                            sb.toString();
                            return;
                        }
                        if (Log.isLoggable("FirebaseInstanceId", 3)) {
                            String valueOf2 = String.valueOf(stringExtra2);
                            if (valueOf2.length() != 0) {
                                "Received InstanceID error ".concat(valueOf2);
                            } else {
                                new String("Received InstanceID error ");
                            }
                        }
                        if (stringExtra2.startsWith("|")) {
                            String[] split = stringExtra2.split("\\|");
                            if (split.length <= 2 || !"ID".equals(split[1])) {
                                String valueOf3 = String.valueOf(stringExtra2);
                                if (valueOf3.length() != 0) {
                                    "Unexpected structured response ".concat(valueOf3);
                                } else {
                                    new String("Unexpected structured response ");
                                }
                            } else {
                                String str = split[2];
                                String str2 = split[3];
                                if (str2.startsWith(Constants.COLON_SEPARATOR)) {
                                    str2 = str2.substring(1);
                                }
                                m10117f(str, intent2.putExtra(XiaomiOAuthConstants.EXTRA_ERROR_CODE_2, str2).getExtras());
                            }
                        } else {
                            synchronized (this.f6297a) {
                                for (int i = 0; i < this.f6297a.size(); i++) {
                                    m10117f(this.f6297a.keyAt(i), intent2.getExtras());
                                }
                            }
                        }
                    } else {
                        Matcher matcher = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)").matcher(stringExtra);
                        if (matcher.matches()) {
                            String group = matcher.group(1);
                            String group2 = matcher.group(2);
                            Bundle extras = intent2.getExtras();
                            extras.putString("registration_id", group2);
                            m10117f(group, extras);
                        } else if (Log.isLoggable("FirebaseInstanceId", 3)) {
                            String valueOf4 = String.valueOf(stringExtra);
                            if (valueOf4.length() != 0) {
                                "Unexpected response string: ".concat(valueOf4);
                            } else {
                                new String("Unexpected response string: ");
                            }
                        }
                    }
                } else if (Log.isLoggable("FirebaseInstanceId", 3)) {
                    String valueOf5 = String.valueOf(action);
                    if (valueOf5.length() != 0) {
                        "Unexpected response action: ".concat(valueOf5);
                    } else {
                        new String("Unexpected response action: ");
                    }
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0023, code lost:
        return;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m10117f(java.lang.String r3, android.os.Bundle r4) {
        /*
            r2 = this;
            androidx.collection.SimpleArrayMap<java.lang.String, c.a.b.b.e.i<android.os.Bundle>> r0 = r2.f6297a
            monitor-enter(r0)
            androidx.collection.SimpleArrayMap<java.lang.String, c.a.b.b.e.i<android.os.Bundle>> r1 = r2.f6297a     // Catch:{ all -> 0x0029 }
            java.lang.Object r1 = r1.remove(r3)     // Catch:{ all -> 0x0029 }
            c.a.b.b.e.i r1 = (p011c.p012a.p019b.p028b.p038e.C0620i) r1     // Catch:{ all -> 0x0029 }
            if (r1 != 0) goto L_0x0024
            java.lang.String r4 = "Missing callback for "
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x0029 }
            int r1 = r3.length()     // Catch:{ all -> 0x0029 }
            if (r1 == 0) goto L_0x001d
            r4.concat(r3)     // Catch:{ all -> 0x0029 }
            goto L_0x0022
        L_0x001d:
            java.lang.String r3 = new java.lang.String     // Catch:{ all -> 0x0029 }
            r3.<init>(r4)     // Catch:{ all -> 0x0029 }
        L_0x0022:
            monitor-exit(r0)     // Catch:{ all -> 0x0029 }
            return
        L_0x0024:
            r1.mo8668c(r4)     // Catch:{ all -> 0x0029 }
            monitor-exit(r0)     // Catch:{ all -> 0x0029 }
            return
        L_0x0029:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0029 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.C3257w.m10117f(java.lang.String, android.os.Bundle):void");
    }

    /* renamed from: g */
    private final Bundle m10118g(Bundle bundle) {
        Bundle h = m10119h(bundle);
        if (h == null || !h.containsKey("google.messenger")) {
            return h;
        }
        Bundle h2 = m10119h(bundle);
        if (h2 == null || !h2.containsKey("google.messenger")) {
            return h2;
        }
        return null;
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: h */
    private final android.os.Bundle m10119h(android.os.Bundle r8) {
        /*
            r7 = this;
            java.lang.String r0 = m10113b()
            c.a.b.b.e.i r1 = new c.a.b.b.e.i
            r1.<init>()
            androidx.collection.SimpleArrayMap<java.lang.String, c.a.b.b.e.i<android.os.Bundle>> r2 = r7.f6297a
            monitor-enter(r2)
            androidx.collection.SimpleArrayMap<java.lang.String, c.a.b.b.e.i<android.os.Bundle>> r3 = r7.f6297a     // Catch:{ all -> 0x010d }
            r3.put(r0, r1)     // Catch:{ all -> 0x010d }
            monitor-exit(r2)     // Catch:{ all -> 0x010d }
            com.google.firebase.iid.q r2 = r7.f6299c
            int r2 = r2.mo17856d()
            if (r2 == 0) goto L_0x0105
            android.content.Intent r2 = new android.content.Intent
            r2.<init>()
            java.lang.String r3 = "com.google.android.gms"
            r2.setPackage(r3)
            com.google.firebase.iid.q r3 = r7.f6299c
            int r3 = r3.mo17856d()
            r4 = 2
            if (r3 != r4) goto L_0x0030
            java.lang.String r3 = "com.google.iid.TOKEN_REQUEST"
            goto L_0x0032
        L_0x0030:
            java.lang.String r3 = "com.google.android.c2dm.intent.REGISTER"
        L_0x0032:
            r2.setAction(r3)
            r2.putExtras(r8)
            android.content.Context r8 = r7.f6298b
            m10114c(r8, r2)
            java.lang.String r8 = "kid"
            java.lang.String r3 = java.lang.String.valueOf(r0)
            int r3 = r3.length()
            int r3 = r3 + 5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r3)
            java.lang.String r3 = "|ID|"
            r5.append(r3)
            r5.append(r0)
            java.lang.String r3 = "|"
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            r2.putExtra(r8, r3)
            java.lang.String r8 = "FirebaseInstanceId"
            r3 = 3
            boolean r8 = android.util.Log.isLoggable(r8, r3)
            if (r8 == 0) goto L_0x008d
            android.os.Bundle r8 = r2.getExtras()
            java.lang.String r8 = java.lang.String.valueOf(r8)
            java.lang.String r5 = java.lang.String.valueOf(r8)
            int r5 = r5.length()
            int r5 = r5 + 8
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r5)
            java.lang.String r5 = "Sending "
            r6.append(r5)
            r6.append(r8)
            r6.toString()
        L_0x008d:
            java.lang.String r8 = "google.messenger"
            android.os.Messenger r5 = r7.f6300d
            r2.putExtra(r8, r5)
            android.os.Messenger r8 = r7.f6301e
            if (r8 != 0) goto L_0x009c
            com.google.firebase.iid.zzj r8 = r7.f6302f
            if (r8 == 0) goto L_0x00b9
        L_0x009c:
            android.os.Message r8 = android.os.Message.obtain()
            r8.obj = r2
            android.os.Messenger r5 = r7.f6301e     // Catch:{ RemoteException -> 0x00b2 }
            if (r5 == 0) goto L_0x00ac
            android.os.Messenger r5 = r7.f6301e     // Catch:{ RemoteException -> 0x00b2 }
            r5.send(r8)     // Catch:{ RemoteException -> 0x00b2 }
            goto L_0x00cc
        L_0x00ac:
            com.google.firebase.iid.zzj r5 = r7.f6302f     // Catch:{ RemoteException -> 0x00b2 }
            r5.mo17873b(r8)     // Catch:{ RemoteException -> 0x00b2 }
            goto L_0x00cc
        L_0x00b2:
            java.lang.String r8 = "FirebaseInstanceId"
            boolean r8 = android.util.Log.isLoggable(r8, r3)
        L_0x00b9:
            com.google.firebase.iid.q r8 = r7.f6299c
            int r8 = r8.mo17856d()
            if (r8 != r4) goto L_0x00c7
            android.content.Context r8 = r7.f6298b
            r8.sendBroadcast(r2)
            goto L_0x00cc
        L_0x00c7:
            android.content.Context r8 = r7.f6298b
            r8.startService(r2)
        L_0x00cc:
            c.a.b.b.e.h r8 = r1.mo8666a()     // Catch:{ InterruptedException | TimeoutException -> 0x00f0, ExecutionException -> 0x00e9 }
            r1 = 30000(0x7530, double:1.4822E-319)
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ InterruptedException | TimeoutException -> 0x00f0, ExecutionException -> 0x00e9 }
            java.lang.Object r8 = p011c.p012a.p019b.p028b.p038e.C0623k.m535b(r8, r1, r3)     // Catch:{ InterruptedException | TimeoutException -> 0x00f0, ExecutionException -> 0x00e9 }
            android.os.Bundle r8 = (android.os.Bundle) r8     // Catch:{ InterruptedException | TimeoutException -> 0x00f0, ExecutionException -> 0x00e9 }
            androidx.collection.SimpleArrayMap<java.lang.String, c.a.b.b.e.i<android.os.Bundle>> r1 = r7.f6297a
            monitor-enter(r1)
            androidx.collection.SimpleArrayMap<java.lang.String, c.a.b.b.e.i<android.os.Bundle>> r2 = r7.f6297a     // Catch:{ all -> 0x00e4 }
            r2.remove(r0)     // Catch:{ all -> 0x00e4 }
            monitor-exit(r1)     // Catch:{ all -> 0x00e4 }
            return r8
        L_0x00e4:
            r8 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x00e4 }
            throw r8
        L_0x00e7:
            r8 = move-exception
            goto L_0x00f8
        L_0x00e9:
            r8 = move-exception
            java.io.IOException r1 = new java.io.IOException     // Catch:{ all -> 0x00e7 }
            r1.<init>(r8)     // Catch:{ all -> 0x00e7 }
            throw r1     // Catch:{ all -> 0x00e7 }
        L_0x00f0:
            java.io.IOException r8 = new java.io.IOException     // Catch:{ all -> 0x00e7 }
            java.lang.String r1 = "TIMEOUT"
            r8.<init>(r1)     // Catch:{ all -> 0x00e7 }
            throw r8     // Catch:{ all -> 0x00e7 }
        L_0x00f8:
            androidx.collection.SimpleArrayMap<java.lang.String, c.a.b.b.e.i<android.os.Bundle>> r1 = r7.f6297a
            monitor-enter(r1)
            androidx.collection.SimpleArrayMap<java.lang.String, c.a.b.b.e.i<android.os.Bundle>> r2 = r7.f6297a     // Catch:{ all -> 0x0102 }
            r2.remove(r0)     // Catch:{ all -> 0x0102 }
            monitor-exit(r1)     // Catch:{ all -> 0x0102 }
            throw r8
        L_0x0102:
            r8 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0102 }
            throw r8
        L_0x0105:
            java.io.IOException r8 = new java.io.IOException
            java.lang.String r0 = "MISSING_INSTANCEID_SERVICE"
            r8.<init>(r0)
            throw r8
        L_0x010d:
            r8 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x010d }
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.C3257w.m10119h(android.os.Bundle):android.os.Bundle");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Bundle mo17866a(Bundle bundle) {
        if (this.f6299c.mo17859g() < 12000000) {
            return m10118g(bundle);
        }
        try {
            return (Bundle) C0623k.m534a(C3216e.m10057d(this.f6298b).mo17816e(1, bundle));
        } catch (InterruptedException | ExecutionException e) {
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                String valueOf = String.valueOf(e);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 22);
                sb.append("Error making request: ");
                sb.append(valueOf);
                sb.toString();
            }
            if (!(e.getCause() instanceof C3241o) || ((C3241o) e.getCause()).mo17848a() != 4) {
                return null;
            }
            return m10118g(bundle);
        }
    }
}
