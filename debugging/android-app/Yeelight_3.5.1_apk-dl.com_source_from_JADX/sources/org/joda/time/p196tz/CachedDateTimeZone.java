package org.joda.time.p196tz;

import org.joda.time.DateTimeZone;

/* renamed from: org.joda.time.tz.CachedDateTimeZone */
public class CachedDateTimeZone extends DateTimeZone {
    private static final int cInfoCacheMask;
    private static final long serialVersionUID = 5472298452022250685L;
    private final C10226a[] iInfoCache = new C10226a[(cInfoCacheMask + 1)];
    private final DateTimeZone iZone;

    /* renamed from: org.joda.time.tz.CachedDateTimeZone$a */
    private static final class C10226a {

        /* renamed from: a */
        public final long f19006a;

        /* renamed from: b */
        public final DateTimeZone f19007b;

        /* renamed from: c */
        C10226a f19008c;

        /* renamed from: d */
        private String f19009d;

        /* renamed from: e */
        private int f19010e = Integer.MIN_VALUE;

        /* renamed from: f */
        private int f19011f = Integer.MIN_VALUE;

        C10226a(DateTimeZone dateTimeZone, long j) {
            this.f19006a = j;
            this.f19007b = dateTimeZone;
        }

        /* renamed from: a */
        public String mo41499a(long j) {
            C10226a aVar = this.f19008c;
            if (aVar != null && j >= aVar.f19006a) {
                return aVar.mo41499a(j);
            }
            if (this.f19009d == null) {
                this.f19009d = this.f19007b.getNameKey(this.f19006a);
            }
            return this.f19009d;
        }

        /* renamed from: b */
        public int mo41500b(long j) {
            C10226a aVar = this.f19008c;
            if (aVar != null && j >= aVar.f19006a) {
                return aVar.mo41500b(j);
            }
            if (this.f19010e == Integer.MIN_VALUE) {
                this.f19010e = this.f19007b.getOffset(this.f19006a);
            }
            return this.f19010e;
        }

        /* renamed from: c */
        public int mo41501c(long j) {
            C10226a aVar = this.f19008c;
            if (aVar != null && j >= aVar.f19006a) {
                return aVar.mo41501c(j);
            }
            if (this.f19011f == Integer.MIN_VALUE) {
                this.f19011f = this.f19007b.getStandardOffset(this.f19006a);
            }
            return this.f19011f;
        }
    }

    static {
        Integer num;
        int i;
        try {
            num = Integer.getInteger("org.joda.time.tz.CachedDateTimeZone.size");
        } catch (SecurityException unused) {
            num = null;
        }
        if (num == null) {
            i = 512;
        } else {
            int i2 = 0;
            for (int intValue = num.intValue() - 1; intValue > 0; intValue >>= 1) {
                i2++;
            }
            i = 1 << i2;
        }
        cInfoCacheMask = i - 1;
    }

    private CachedDateTimeZone(DateTimeZone dateTimeZone) {
        super(dateTimeZone.getID());
        this.iZone = dateTimeZone;
    }

    private C10226a createInfo(long j) {
        long j2 = j & -4294967296L;
        C10226a aVar = new C10226a(this.iZone, j2);
        long j3 = 4294967295L | j2;
        C10226a aVar2 = aVar;
        while (true) {
            long nextTransition = this.iZone.nextTransition(j2);
            if (nextTransition == j2 || nextTransition > j3) {
                return aVar;
            }
            C10226a aVar3 = new C10226a(this.iZone, nextTransition);
            aVar2.f19008c = aVar3;
            aVar2 = aVar3;
            j2 = nextTransition;
        }
        return aVar;
    }

    public static CachedDateTimeZone forZone(DateTimeZone dateTimeZone) {
        return dateTimeZone instanceof CachedDateTimeZone ? (CachedDateTimeZone) dateTimeZone : new CachedDateTimeZone(dateTimeZone);
    }

    private C10226a getInfo(long j) {
        int i = (int) (j >> 32);
        C10226a[] aVarArr = this.iInfoCache;
        int i2 = cInfoCacheMask & i;
        C10226a aVar = aVarArr[i2];
        if (aVar != null && ((int) (aVar.f19006a >> 32)) == i) {
            return aVar;
        }
        C10226a createInfo = createInfo(j);
        aVarArr[i2] = createInfo;
        return createInfo;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CachedDateTimeZone) {
            return this.iZone.equals(((CachedDateTimeZone) obj).iZone);
        }
        return false;
    }

    public String getNameKey(long j) {
        return getInfo(j).mo41499a(j);
    }

    public int getOffset(long j) {
        return getInfo(j).mo41500b(j);
    }

    public int getStandardOffset(long j) {
        return getInfo(j).mo41501c(j);
    }

    public DateTimeZone getUncachedZone() {
        return this.iZone;
    }

    public int hashCode() {
        return this.iZone.hashCode();
    }

    public boolean isFixed() {
        return this.iZone.isFixed();
    }

    public long nextTransition(long j) {
        return this.iZone.nextTransition(j);
    }

    public long previousTransition(long j) {
        return this.iZone.previousTransition(j);
    }
}
