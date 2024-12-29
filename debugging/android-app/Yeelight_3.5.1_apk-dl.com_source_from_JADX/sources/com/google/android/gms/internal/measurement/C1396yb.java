package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.yb */
public final class C1396yb implements C1381xb {

    /* renamed from: a */
    public static final C1252p6 f1731a;

    /* renamed from: b */
    public static final C1252p6 f1732b;

    /* renamed from: c */
    public static final C1252p6 f1733c;

    /* renamed from: d */
    public static final C1252p6 f1734d;

    static {
        C1204m6 a = new C1204m6(C1092f6.m1948a("com.google.android.gms.measurement")).mo12978b().mo12977a();
        f1731a = a.mo12982f("measurement.enhanced_campaign.client", true);
        f1732b = a.mo12982f("measurement.enhanced_campaign.service", true);
        f1733c = a.mo12982f("measurement.enhanced_campaign.srsltid.client", true);
        f1734d = a.mo12982f("measurement.enhanced_campaign.srsltid.service", true);
    }

    /* renamed from: D */
    public final boolean mo13496D() {
        return ((Boolean) f1731a.mo13069b()).booleanValue();
    }

    /* renamed from: E */
    public final boolean mo13497E() {
        return ((Boolean) f1732b.mo13069b()).booleanValue();
    }

    /* renamed from: a */
    public final boolean mo13498a() {
        return ((Boolean) f1734d.mo13069b()).booleanValue();
    }

    /* renamed from: b */
    public final boolean mo13499b() {
        return ((Boolean) f1733c.mo13069b()).booleanValue();
    }

    public final boolean zza() {
        return true;
    }
}
