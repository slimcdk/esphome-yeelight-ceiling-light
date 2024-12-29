package com.google.android.datatransport.cct.p103b;

import android.util.SparseArray;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.datatransport.cct.p103b.C1287i;
import com.google.auto.value.AutoValue;

@AutoValue
/* renamed from: com.google.android.datatransport.cct.b.o */
public abstract class C1299o {

    @AutoValue.Builder
    /* renamed from: com.google.android.datatransport.cct.b.o$a */
    public static abstract class C1300a {
        @NonNull
        /* renamed from: a */
        public abstract C1300a mo10195a(@Nullable C1301b bVar);

        @NonNull
        /* renamed from: b */
        public abstract C1300a mo10196b(@Nullable C1302c cVar);

        @NonNull
        /* renamed from: c */
        public abstract C1299o mo10197c();
    }

    /* renamed from: com.google.android.datatransport.cct.b.o$b */
    public enum C1301b {
        UNKNOWN_MOBILE_SUBTYPE(0),
        GPRS(1),
        EDGE(2),
        UMTS(3),
        CDMA(4),
        EVDO_0(5),
        EVDO_A(6),
        RTT(7),
        HSDPA(8),
        HSUPA(9),
        HSPA(10),
        IDEN(11),
        EVDO_B(12),
        LTE(13),
        EHRPD(14),
        HSPAP(15),
        GSM(16),
        TD_SCDMA(17),
        IWLAN(18),
        LTE_CA(19),
        COMBINED(100);
        

        /* renamed from: w */
        private static final SparseArray<C1301b> f2354w = null;

        /* renamed from: a */
        private final int f2355a;

        static {
            UNKNOWN_MOBILE_SUBTYPE = new C1301b("UNKNOWN_MOBILE_SUBTYPE", 0, 0);
            GPRS = new C1301b("GPRS", 1, 1);
            EDGE = new C1301b("EDGE", 2, 2);
            UMTS = new C1301b("UMTS", 3, 3);
            CDMA = new C1301b("CDMA", 4, 4);
            EVDO_0 = new C1301b("EVDO_0", 5, 5);
            EVDO_A = new C1301b("EVDO_A", 6, 6);
            RTT = new C1301b("RTT", 7, 7);
            HSDPA = new C1301b("HSDPA", 8, 8);
            HSUPA = new C1301b("HSUPA", 9, 9);
            HSPA = new C1301b("HSPA", 10, 10);
            IDEN = new C1301b("IDEN", 11, 11);
            EVDO_B = new C1301b("EVDO_B", 12, 12);
            LTE = new C1301b("LTE", 13, 13);
            EHRPD = new C1301b("EHRPD", 14, 14);
            HSPAP = new C1301b("HSPAP", 15, 15);
            GSM = new C1301b("GSM", 16, 16);
            TD_SCDMA = new C1301b("TD_SCDMA", 17, 17);
            IWLAN = new C1301b("IWLAN", 18, 18);
            LTE_CA = new C1301b("LTE_CA", 19, 19);
            COMBINED = new C1301b("COMBINED", 20, 100);
            SparseArray<C1301b> sparseArray = new SparseArray<>();
            f2354w = sparseArray;
            sparseArray.put(0, UNKNOWN_MOBILE_SUBTYPE);
            f2354w.put(1, GPRS);
            f2354w.put(2, EDGE);
            f2354w.put(3, UMTS);
            f2354w.put(4, CDMA);
            f2354w.put(5, EVDO_0);
            f2354w.put(6, EVDO_A);
            f2354w.put(7, RTT);
            f2354w.put(8, HSDPA);
            f2354w.put(9, HSUPA);
            f2354w.put(10, HSPA);
            f2354w.put(11, IDEN);
            f2354w.put(12, EVDO_B);
            f2354w.put(13, LTE);
            f2354w.put(14, EHRPD);
            f2354w.put(15, HSPAP);
            f2354w.put(16, GSM);
            f2354w.put(17, TD_SCDMA);
            f2354w.put(18, IWLAN);
            f2354w.put(19, LTE_CA);
        }

        private C1301b(int i) {
            this.f2355a = i;
        }

        @Nullable
        /* renamed from: a */
        public static C1301b m3436a(int i) {
            return f2354w.get(i);
        }

        /* renamed from: C */
        public int mo10200C() {
            return this.f2355a;
        }
    }

    /* renamed from: com.google.android.datatransport.cct.b.o$c */
    public enum C1302c {
        MOBILE(0),
        WIFI(1),
        MOBILE_MMS(2),
        MOBILE_SUPL(3),
        MOBILE_DUN(4),
        MOBILE_HIPRI(5),
        WIMAX(6),
        BLUETOOTH(7),
        DUMMY(8),
        ETHERNET(9),
        MOBILE_FOTA(10),
        MOBILE_IMS(11),
        MOBILE_CBS(12),
        WIFI_P2P(13),
        MOBILE_IA(14),
        MOBILE_EMERGENCY(15),
        PROXY(16),
        VPN(17),
        NONE(-1);
        

        /* renamed from: u */
        private static final SparseArray<C1302c> f2375u = null;

        /* renamed from: a */
        private final int f2376a;

        static {
            MOBILE = new C1302c("MOBILE", 0, 0);
            WIFI = new C1302c("WIFI", 1, 1);
            MOBILE_MMS = new C1302c("MOBILE_MMS", 2, 2);
            MOBILE_SUPL = new C1302c("MOBILE_SUPL", 3, 3);
            MOBILE_DUN = new C1302c("MOBILE_DUN", 4, 4);
            MOBILE_HIPRI = new C1302c("MOBILE_HIPRI", 5, 5);
            WIMAX = new C1302c("WIMAX", 6, 6);
            BLUETOOTH = new C1302c("BLUETOOTH", 7, 7);
            DUMMY = new C1302c("DUMMY", 8, 8);
            ETHERNET = new C1302c("ETHERNET", 9, 9);
            MOBILE_FOTA = new C1302c("MOBILE_FOTA", 10, 10);
            MOBILE_IMS = new C1302c("MOBILE_IMS", 11, 11);
            MOBILE_CBS = new C1302c("MOBILE_CBS", 12, 12);
            WIFI_P2P = new C1302c("WIFI_P2P", 13, 13);
            MOBILE_IA = new C1302c("MOBILE_IA", 14, 14);
            MOBILE_EMERGENCY = new C1302c("MOBILE_EMERGENCY", 15, 15);
            PROXY = new C1302c("PROXY", 16, 16);
            VPN = new C1302c("VPN", 17, 17);
            NONE = new C1302c("NONE", 18, -1);
            SparseArray<C1302c> sparseArray = new SparseArray<>();
            f2375u = sparseArray;
            sparseArray.put(0, MOBILE);
            f2375u.put(1, WIFI);
            f2375u.put(2, MOBILE_MMS);
            f2375u.put(3, MOBILE_SUPL);
            f2375u.put(4, MOBILE_DUN);
            f2375u.put(5, MOBILE_HIPRI);
            f2375u.put(6, WIMAX);
            f2375u.put(7, BLUETOOTH);
            f2375u.put(8, DUMMY);
            f2375u.put(9, ETHERNET);
            f2375u.put(10, MOBILE_FOTA);
            f2375u.put(11, MOBILE_IMS);
            f2375u.put(12, MOBILE_CBS);
            f2375u.put(13, WIFI_P2P);
            f2375u.put(14, MOBILE_IA);
            f2375u.put(15, MOBILE_EMERGENCY);
            f2375u.put(16, PROXY);
            f2375u.put(17, VPN);
            f2375u.put(-1, NONE);
        }

        private C1302c(int i) {
            this.f2376a = i;
        }

        @Nullable
        /* renamed from: a */
        public static C1302c m3438a(int i) {
            return f2375u.get(i);
        }

        /* renamed from: C */
        public int mo10201C() {
            return this.f2376a;
        }
    }

    @NonNull
    /* renamed from: a */
    public static C1300a m3430a() {
        return new C1287i.C1289b();
    }

    @Nullable
    /* renamed from: b */
    public abstract C1301b mo10190b();

    @Nullable
    /* renamed from: c */
    public abstract C1302c mo10191c();
}
