package com.google.firebase.crashlytics.p110c.p112g;

import android.content.SharedPreferences;
import com.google.firebase.C2816c;
import p011c.p012a.p019b.p028b.p038e.C0619h;
import p011c.p012a.p019b.p028b.p038e.C0620i;

/* renamed from: com.google.firebase.crashlytics.c.g.q */
public class C2947q {

    /* renamed from: a */
    private Object f5717a = new Object();

    /* renamed from: b */
    C0620i<Void> f5718b = new C0620i<>();

    /* renamed from: c */
    private final SharedPreferences f5719c;

    /* renamed from: d */
    private volatile boolean f5720d;

    /* renamed from: e */
    private volatile boolean f5721e;

    /* renamed from: f */
    private final C2816c f5722f;

    /* renamed from: g */
    private C0620i<Void> f5723g = new C0620i<>();

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
    public C2947q(com.google.firebase.C2816c r5) {
        /*
            r4 = this;
            r4.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r4.f5717a = r0
            c.a.b.b.e.i r0 = new c.a.b.b.e.i
            r0.<init>()
            r4.f5718b = r0
            c.a.b.b.e.i r0 = new c.a.b.b.e.i
            r0.<init>()
            r4.f5723g = r0
            r4.f5722f = r5
            android.content.Context r5 = r5.mo17061g()
            if (r5 == 0) goto L_0x0086
            android.content.SharedPreferences r0 = com.google.firebase.crashlytics.p110c.p112g.C2884h.m8823t(r5)
            r4.f5719c = r0
            r1 = 0
            java.lang.String r2 = "firebase_crashlytics_collection_enabled"
            boolean r0 = r0.contains(r2)
            r2 = 1
            if (r0 == 0) goto L_0x003b
            android.content.SharedPreferences r5 = r4.f5719c
            java.lang.String r0 = "firebase_crashlytics_collection_enabled"
            boolean r5 = r5.getBoolean(r0, r2)
        L_0x0038:
            r2 = r5
            r1 = 1
            goto L_0x006e
        L_0x003b:
            android.content.pm.PackageManager r0 = r5.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0064 }
            if (r0 == 0) goto L_0x006e
            java.lang.String r5 = r5.getPackageName()     // Catch:{ NameNotFoundException -> 0x0064 }
            r3 = 128(0x80, float:1.794E-43)
            android.content.pm.ApplicationInfo r5 = r0.getApplicationInfo(r5, r3)     // Catch:{ NameNotFoundException -> 0x0064 }
            if (r5 == 0) goto L_0x006e
            android.os.Bundle r0 = r5.metaData     // Catch:{ NameNotFoundException -> 0x0064 }
            if (r0 == 0) goto L_0x006e
            android.os.Bundle r0 = r5.metaData     // Catch:{ NameNotFoundException -> 0x0064 }
            java.lang.String r3 = "firebase_crashlytics_collection_enabled"
            boolean r0 = r0.containsKey(r3)     // Catch:{ NameNotFoundException -> 0x0064 }
            if (r0 == 0) goto L_0x006e
            android.os.Bundle r5 = r5.metaData     // Catch:{ NameNotFoundException -> 0x0064 }
            java.lang.String r0 = "firebase_crashlytics_collection_enabled"
            boolean r5 = r5.getBoolean(r0)     // Catch:{ NameNotFoundException -> 0x0064 }
            goto L_0x0038
        L_0x0064:
            r5 = move-exception
            com.google.firebase.crashlytics.c.b r0 = com.google.firebase.crashlytics.p110c.C2857b.m8687f()
            java.lang.String r3 = "Unable to get PackageManager. Falling through"
            r0.mo17131c(r3, r5)
        L_0x006e:
            r4.f5721e = r2
            r4.f5720d = r1
            java.lang.Object r5 = r4.f5717a
            monitor-enter(r5)
            boolean r0 = r4.mo17288b()     // Catch:{ all -> 0x0083 }
            if (r0 == 0) goto L_0x0081
            c.a.b.b.e.i<java.lang.Void> r0 = r4.f5718b     // Catch:{ all -> 0x0083 }
            r1 = 0
            r0.mo8670e(r1)     // Catch:{ all -> 0x0083 }
        L_0x0081:
            monitor-exit(r5)     // Catch:{ all -> 0x0083 }
            return
        L_0x0083:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0083 }
            throw r0
        L_0x0086:
            java.lang.RuntimeException r5 = new java.lang.RuntimeException
            java.lang.String r0 = "null context"
            r5.<init>(r0)
            goto L_0x008f
        L_0x008e:
            throw r5
        L_0x008f:
            goto L_0x008e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.crashlytics.p110c.p112g.C2947q.<init>(com.google.firebase.c):void");
    }

    /* renamed from: a */
    public void mo17287a(boolean z) {
        if (z) {
            this.f5723g.mo8670e(null);
            return;
        }
        throw new IllegalStateException("An invalid data collection token was used.");
    }

    /* renamed from: b */
    public boolean mo17288b() {
        return this.f5720d ? this.f5721e : this.f5722f.mo17066p();
    }

    /* renamed from: c */
    public C0619h<Void> mo17289c() {
        C0619h<Void> a;
        synchronized (this.f5717a) {
            a = this.f5718b.mo8666a();
        }
        return a;
    }

    /* renamed from: d */
    public C0619h<Void> mo17290d() {
        return C2887h0.m8838g(this.f5723g.mo8666a(), mo17289c());
    }
}
