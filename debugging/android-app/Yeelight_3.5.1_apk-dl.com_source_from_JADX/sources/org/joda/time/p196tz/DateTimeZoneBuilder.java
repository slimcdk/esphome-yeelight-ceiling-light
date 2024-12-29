package org.joda.time.p196tz;

import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InputStream;
import java.text.DateFormatSymbols;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import org.joda.time.C10142a;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.chrono.ISOChronology;

/* renamed from: org.joda.time.tz.DateTimeZoneBuilder */
public class DateTimeZoneBuilder {

    /* renamed from: org.joda.time.tz.DateTimeZoneBuilder$DSTZone */
    private static final class DSTZone extends DateTimeZone {
        private static final long serialVersionUID = 6941492635554961361L;
        final C10228b iEndRecurrence;
        final int iStandardOffset;
        final C10228b iStartRecurrence;

        DSTZone(String str, int i, C10228b bVar, C10228b bVar2) {
            super(str);
            this.iStandardOffset = i;
            this.iStartRecurrence = bVar;
            this.iEndRecurrence = bVar2;
        }

        private C10228b findMatchingRecurrence(long j) {
            long j2;
            int i = this.iStandardOffset;
            C10228b bVar = this.iStartRecurrence;
            C10228b bVar2 = this.iEndRecurrence;
            try {
                j2 = bVar.mo41511c(j, i, bVar2.mo41510b());
            } catch (ArithmeticException | IllegalArgumentException unused) {
                j2 = j;
            }
            try {
                j = bVar2.mo41511c(j, i, bVar.mo41510b());
            } catch (ArithmeticException | IllegalArgumentException unused2) {
            }
            return j2 > j ? bVar : bVar2;
        }

        static DSTZone readFrom(DataInput dataInput, String str) {
            return new DSTZone(str, (int) DateTimeZoneBuilder.m25706c(dataInput), C10228b.m25716e(dataInput), C10228b.m25716e(dataInput));
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DSTZone)) {
                return false;
            }
            DSTZone dSTZone = (DSTZone) obj;
            return getID().equals(dSTZone.getID()) && this.iStandardOffset == dSTZone.iStandardOffset && this.iStartRecurrence.equals(dSTZone.iStartRecurrence) && this.iEndRecurrence.equals(dSTZone.iEndRecurrence);
        }

        public String getNameKey(long j) {
            return findMatchingRecurrence(j).mo41509a();
        }

        public int getOffset(long j) {
            return this.iStandardOffset + findMatchingRecurrence(j).mo41510b();
        }

        public int getStandardOffset(long j) {
            return this.iStandardOffset;
        }

        public boolean isFixed() {
            return false;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0016, code lost:
            if (r5 < 0) goto L_0x0018;
         */
        /* JADX WARNING: Removed duplicated region for block: B:19:0x0031  */
        /* JADX WARNING: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public long nextTransition(long r9) {
            /*
                r8 = this;
                int r0 = r8.iStandardOffset
                org.joda.time.tz.DateTimeZoneBuilder$b r1 = r8.iStartRecurrence
                org.joda.time.tz.DateTimeZoneBuilder$b r2 = r8.iEndRecurrence
                r3 = 0
                int r5 = r2.mo41510b()     // Catch:{ ArithmeticException | IllegalArgumentException -> 0x0018 }
                long r5 = r1.mo41511c(r9, r0, r5)     // Catch:{ ArithmeticException | IllegalArgumentException -> 0x0018 }
                int r7 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
                if (r7 <= 0) goto L_0x0019
                int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
                if (r7 >= 0) goto L_0x0019
            L_0x0018:
                r5 = r9
            L_0x0019:
                int r1 = r1.mo41510b()     // Catch:{ ArithmeticException | IllegalArgumentException -> 0x002c }
                long r0 = r2.mo41511c(r9, r0, r1)     // Catch:{ ArithmeticException | IllegalArgumentException -> 0x002c }
                int r2 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
                if (r2 <= 0) goto L_0x002a
                int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
                if (r2 >= 0) goto L_0x002a
                goto L_0x002d
            L_0x002a:
                r9 = r0
                goto L_0x002d
            L_0x002c:
            L_0x002d:
                int r0 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
                if (r0 <= 0) goto L_0x0032
                r5 = r9
            L_0x0032:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: org.joda.time.p196tz.DateTimeZoneBuilder.DSTZone.nextTransition(long):long");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0019, code lost:
            if (r7 > 0) goto L_0x001b;
         */
        /* JADX WARNING: Removed duplicated region for block: B:19:0x0035  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public long previousTransition(long r11) {
            /*
                r10 = this;
                r0 = 1
                long r11 = r11 + r0
                int r2 = r10.iStandardOffset
                org.joda.time.tz.DateTimeZoneBuilder$b r3 = r10.iStartRecurrence
                org.joda.time.tz.DateTimeZoneBuilder$b r4 = r10.iEndRecurrence
                r5 = 0
                int r7 = r4.mo41510b()     // Catch:{ ArithmeticException | IllegalArgumentException -> 0x001b }
                long r7 = r3.mo41512d(r11, r2, r7)     // Catch:{ ArithmeticException | IllegalArgumentException -> 0x001b }
                int r9 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
                if (r9 >= 0) goto L_0x001c
                int r9 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
                if (r9 <= 0) goto L_0x001c
            L_0x001b:
                r7 = r11
            L_0x001c:
                int r3 = r3.mo41510b()     // Catch:{ ArithmeticException | IllegalArgumentException -> 0x002f }
                long r2 = r4.mo41512d(r11, r2, r3)     // Catch:{ ArithmeticException | IllegalArgumentException -> 0x002f }
                int r4 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
                if (r4 >= 0) goto L_0x002d
                int r4 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
                if (r4 <= 0) goto L_0x002d
                goto L_0x0030
            L_0x002d:
                r11 = r2
                goto L_0x0030
            L_0x002f:
            L_0x0030:
                int r2 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
                if (r2 <= 0) goto L_0x0035
                goto L_0x0036
            L_0x0035:
                r7 = r11
            L_0x0036:
                long r7 = r7 - r0
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: org.joda.time.p196tz.DateTimeZoneBuilder.DSTZone.previousTransition(long):long");
        }

        public void writeTo(DataOutput dataOutput) {
            DateTimeZoneBuilder.m25707d(dataOutput, (long) this.iStandardOffset);
            this.iStartRecurrence.mo41516h(dataOutput);
            this.iEndRecurrence.mo41516h(dataOutput);
        }
    }

    /* renamed from: org.joda.time.tz.DateTimeZoneBuilder$PrecalculatedZone */
    private static final class PrecalculatedZone extends DateTimeZone {
        private static final long serialVersionUID = 7811976468055766265L;
        private final String[] iNameKeys;
        private final int[] iStandardOffsets;
        private final DSTZone iTailZone;
        private final long[] iTransitions;
        private final int[] iWallOffsets;

        private PrecalculatedZone(String str, long[] jArr, int[] iArr, int[] iArr2, String[] strArr, DSTZone dSTZone) {
            super(str);
            this.iTransitions = jArr;
            this.iWallOffsets = iArr;
            this.iStandardOffsets = iArr2;
            this.iNameKeys = strArr;
            this.iTailZone = dSTZone;
        }

        static PrecalculatedZone create(String str, boolean z, ArrayList<C10229c> arrayList, DSTZone dSTZone) {
            DSTZone dSTZone2;
            String str2 = str;
            DSTZone dSTZone3 = dSTZone;
            int size = arrayList.size();
            if (size != 0) {
                long[] jArr = new long[size];
                int[] iArr = new int[size];
                int[] iArr2 = new int[size];
                String[] strArr = new String[size];
                C10229c cVar = null;
                int i = 0;
                int i2 = 0;
                while (i2 < size) {
                    C10229c cVar2 = arrayList.get(i2);
                    if (cVar2.mo41521e(cVar)) {
                        jArr[i2] = cVar2.mo41517a();
                        iArr[i2] = cVar2.mo41520d();
                        iArr2[i2] = cVar2.mo41519c();
                        strArr[i2] = cVar2.mo41518b();
                        i2++;
                        cVar = cVar2;
                    } else {
                        throw new IllegalArgumentException(str2);
                    }
                }
                String[] strArr2 = new String[5];
                String[][] zoneStrings = new DateFormatSymbols(Locale.ENGLISH).getZoneStrings();
                for (String[] strArr3 : zoneStrings) {
                    if (strArr3 != null && strArr3.length == 5 && str2.equals(strArr3[0])) {
                        strArr2 = strArr3;
                    }
                }
                ISOChronology instanceUTC = ISOChronology.getInstanceUTC();
                while (i < size - 1) {
                    String str3 = strArr[i];
                    int i3 = i + 1;
                    String str4 = strArr[i3];
                    long j = (long) iArr[i];
                    long j2 = (long) iArr[i3];
                    String[] strArr4 = strArr;
                    String[] strArr5 = strArr2;
                    long j3 = (long) iArr2[i];
                    int[] iArr3 = iArr;
                    int[] iArr4 = iArr2;
                    long j4 = (long) iArr2[i3];
                    long j5 = j;
                    int i4 = size;
                    String str5 = str4;
                    Period period = new Period(jArr[i], jArr[i3], PeriodType.yearMonthDay(), (C10142a) instanceUTC);
                    if (j5 != j2 && j3 == j4 && str3.equals(str5) && period.getYears() == 0 && period.getMonths() > 4 && period.getMonths() < 8 && str3.equals(strArr5[2]) && str3.equals(strArr5[4])) {
                        if (C10234e.m25739a()) {
                            System.out.println("Fixing duplicate name key - " + str5);
                            System.out.println("     - " + new DateTime(jArr[i], (C10142a) instanceUTC) + " - " + new DateTime(jArr[i3], (C10142a) instanceUTC));
                        }
                        if (j5 > j2) {
                            strArr4[i] = (str3 + "-Summer").intern();
                        } else if (j5 < j2) {
                            strArr4[i3] = (str5 + "-Summer").intern();
                            i = i3;
                        }
                    }
                    i++;
                    String str6 = str;
                    strArr2 = strArr5;
                    dSTZone3 = dSTZone;
                    strArr = strArr4;
                    iArr = iArr3;
                    iArr2 = iArr4;
                    size = i4;
                }
                DSTZone dSTZone4 = dSTZone3;
                int[] iArr5 = iArr;
                int[] iArr6 = iArr2;
                String[] strArr6 = strArr;
                if (dSTZone4 == null || !dSTZone4.iStartRecurrence.mo41509a().equals(dSTZone4.iEndRecurrence.mo41509a())) {
                    dSTZone2 = dSTZone4;
                } else {
                    if (C10234e.m25739a()) {
                        System.out.println("Fixing duplicate recurrent name key - " + dSTZone4.iStartRecurrence.mo41509a());
                    }
                    dSTZone2 = dSTZone4.iStartRecurrence.mo41510b() > 0 ? new DSTZone(dSTZone.getID(), dSTZone4.iStandardOffset, dSTZone4.iStartRecurrence.mo41515g("-Summer"), dSTZone4.iEndRecurrence) : new DSTZone(dSTZone.getID(), dSTZone4.iStandardOffset, dSTZone4.iStartRecurrence, dSTZone4.iEndRecurrence.mo41515g("-Summer"));
                }
                return new PrecalculatedZone(z ? str : "", jArr, iArr5, iArr6, strArr6, dSTZone2);
            }
            throw new IllegalArgumentException();
        }

        static PrecalculatedZone readFrom(DataInput dataInput, String str) {
            int i;
            int readUnsignedShort = dataInput.readUnsignedShort();
            String[] strArr = new String[readUnsignedShort];
            for (int i2 = 0; i2 < readUnsignedShort; i2++) {
                strArr[i2] = dataInput.readUTF();
            }
            int readInt = dataInput.readInt();
            long[] jArr = new long[readInt];
            int[] iArr = new int[readInt];
            int[] iArr2 = new int[readInt];
            String[] strArr2 = new String[readInt];
            for (int i3 = 0; i3 < readInt; i3++) {
                jArr[i3] = DateTimeZoneBuilder.m25706c(dataInput);
                iArr[i3] = (int) DateTimeZoneBuilder.m25706c(dataInput);
                iArr2[i3] = (int) DateTimeZoneBuilder.m25706c(dataInput);
                if (readUnsignedShort < 256) {
                    try {
                        i = dataInput.readUnsignedByte();
                    } catch (ArrayIndexOutOfBoundsException unused) {
                        throw new IOException("Invalid encoding");
                    }
                } else {
                    i = dataInput.readUnsignedShort();
                }
                strArr2[i3] = strArr[i];
            }
            return new PrecalculatedZone(str, jArr, iArr, iArr2, strArr2, dataInput.readBoolean() ? DSTZone.readFrom(dataInput, str) : null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PrecalculatedZone)) {
                return false;
            }
            PrecalculatedZone precalculatedZone = (PrecalculatedZone) obj;
            if (getID().equals(precalculatedZone.getID()) && Arrays.equals(this.iTransitions, precalculatedZone.iTransitions) && Arrays.equals(this.iNameKeys, precalculatedZone.iNameKeys) && Arrays.equals(this.iWallOffsets, precalculatedZone.iWallOffsets) && Arrays.equals(this.iStandardOffsets, precalculatedZone.iStandardOffsets)) {
                DSTZone dSTZone = this.iTailZone;
                DSTZone dSTZone2 = precalculatedZone.iTailZone;
                if (dSTZone == null) {
                    if (dSTZone2 == null) {
                        return true;
                    }
                } else if (dSTZone.equals(dSTZone2)) {
                    return true;
                }
            }
            return false;
        }

        public String getNameKey(long j) {
            long[] jArr = this.iTransitions;
            int binarySearch = Arrays.binarySearch(jArr, j);
            if (binarySearch >= 0) {
                return this.iNameKeys[binarySearch];
            }
            int i = binarySearch ^ -1;
            if (i < jArr.length) {
                return i > 0 ? this.iNameKeys[i - 1] : "UTC";
            }
            DSTZone dSTZone = this.iTailZone;
            return dSTZone == null ? this.iNameKeys[i - 1] : dSTZone.getNameKey(j);
        }

        public int getOffset(long j) {
            long[] jArr = this.iTransitions;
            int binarySearch = Arrays.binarySearch(jArr, j);
            if (binarySearch >= 0) {
                return this.iWallOffsets[binarySearch];
            }
            int i = binarySearch ^ -1;
            if (i >= jArr.length) {
                DSTZone dSTZone = this.iTailZone;
                return dSTZone == null ? this.iWallOffsets[i - 1] : dSTZone.getOffset(j);
            } else if (i > 0) {
                return this.iWallOffsets[i - 1];
            } else {
                return 0;
            }
        }

        public int getStandardOffset(long j) {
            long[] jArr = this.iTransitions;
            int binarySearch = Arrays.binarySearch(jArr, j);
            if (binarySearch >= 0) {
                return this.iStandardOffsets[binarySearch];
            }
            int i = binarySearch ^ -1;
            if (i >= jArr.length) {
                DSTZone dSTZone = this.iTailZone;
                return dSTZone == null ? this.iStandardOffsets[i - 1] : dSTZone.getStandardOffset(j);
            } else if (i > 0) {
                return this.iStandardOffsets[i - 1];
            } else {
                return 0;
            }
        }

        public boolean isCachable() {
            if (this.iTailZone != null) {
                return true;
            }
            long[] jArr = this.iTransitions;
            if (jArr.length <= 1) {
                return false;
            }
            double d = 0.0d;
            int i = 0;
            for (int i2 = 1; i2 < jArr.length; i2++) {
                long j = jArr[i2] - jArr[i2 - 1];
                if (j < 63158400000L) {
                    double d2 = (double) j;
                    Double.isNaN(d2);
                    d += d2;
                    i++;
                }
            }
            if (i > 0) {
                double d3 = (double) i;
                Double.isNaN(d3);
                if ((d / d3) / 8.64E7d >= 25.0d) {
                    return true;
                }
            }
            return false;
        }

        public boolean isFixed() {
            return false;
        }

        public long nextTransition(long j) {
            long[] jArr = this.iTransitions;
            int binarySearch = Arrays.binarySearch(jArr, j);
            int i = binarySearch >= 0 ? binarySearch + 1 : binarySearch ^ -1;
            if (i < jArr.length) {
                return jArr[i];
            }
            DSTZone dSTZone = this.iTailZone;
            if (dSTZone == null) {
                return j;
            }
            long j2 = jArr[jArr.length - 1];
            if (j < j2) {
                j = j2;
            }
            return dSTZone.nextTransition(j);
        }

        public long previousTransition(long j) {
            long[] jArr = this.iTransitions;
            int binarySearch = Arrays.binarySearch(jArr, j);
            if (binarySearch >= 0) {
                return j > Long.MIN_VALUE ? j - 1 : j;
            }
            int i = binarySearch ^ -1;
            if (i < jArr.length) {
                if (i > 0) {
                    long j2 = jArr[i - 1];
                    if (j2 > Long.MIN_VALUE) {
                        return j2 - 1;
                    }
                }
                return j;
            }
            DSTZone dSTZone = this.iTailZone;
            if (dSTZone != null) {
                long previousTransition = dSTZone.previousTransition(j);
                if (previousTransition < j) {
                    return previousTransition;
                }
            }
            long j3 = jArr[i - 1];
            return j3 > Long.MIN_VALUE ? j3 - 1 : j;
        }

        public void writeTo(DataOutput dataOutput) {
            int length = this.iTransitions.length;
            HashSet<String> hashSet = new HashSet<>();
            boolean z = false;
            for (int i = 0; i < length; i++) {
                hashSet.add(this.iNameKeys[i]);
            }
            int size = hashSet.size();
            if (size <= 65535) {
                String[] strArr = new String[size];
                int i2 = 0;
                for (String str : hashSet) {
                    strArr[i2] = str;
                    i2++;
                }
                dataOutput.writeShort(size);
                for (int i3 = 0; i3 < size; i3++) {
                    dataOutput.writeUTF(strArr[i3]);
                }
                dataOutput.writeInt(length);
                for (int i4 = 0; i4 < length; i4++) {
                    DateTimeZoneBuilder.m25707d(dataOutput, this.iTransitions[i4]);
                    DateTimeZoneBuilder.m25707d(dataOutput, (long) this.iWallOffsets[i4]);
                    DateTimeZoneBuilder.m25707d(dataOutput, (long) this.iStandardOffsets[i4]);
                    String str2 = this.iNameKeys[i4];
                    int i5 = 0;
                    while (true) {
                        if (i5 >= size) {
                            break;
                        } else if (!strArr[i5].equals(str2)) {
                            i5++;
                        } else if (size < 256) {
                            dataOutput.writeByte(i5);
                        } else {
                            dataOutput.writeShort(i5);
                        }
                    }
                }
                if (this.iTailZone != null) {
                    z = true;
                }
                dataOutput.writeBoolean(z);
                DSTZone dSTZone = this.iTailZone;
                if (dSTZone != null) {
                    dSTZone.writeTo(dataOutput);
                    return;
                }
                return;
            }
            throw new UnsupportedOperationException("String pool is too large");
        }
    }

    /* renamed from: org.joda.time.tz.DateTimeZoneBuilder$a */
    private static final class C10227a {

        /* renamed from: a */
        final char f19012a;

        /* renamed from: b */
        final int f19013b;

        /* renamed from: c */
        final int f19014c;

        /* renamed from: d */
        final int f19015d;

        /* renamed from: e */
        final boolean f19016e;

        /* renamed from: f */
        final int f19017f;

        C10227a(char c, int i, int i2, int i3, boolean z, int i4) {
            if (c == 'u' || c == 'w' || c == 's') {
                this.f19012a = c;
                this.f19013b = i;
                this.f19014c = i2;
                this.f19015d = i3;
                this.f19016e = z;
                this.f19017f = i4;
                return;
            }
            throw new IllegalArgumentException("Unknown mode: " + c);
        }

        /* renamed from: c */
        static C10227a m25708c(DataInput dataInput) {
            return new C10227a((char) dataInput.readUnsignedByte(), dataInput.readUnsignedByte(), dataInput.readByte(), dataInput.readUnsignedByte(), dataInput.readBoolean(), (int) DateTimeZoneBuilder.m25706c(dataInput));
        }

        /* renamed from: d */
        private long m25709d(C10142a aVar, long j) {
            if (this.f19014c >= 0) {
                return aVar.dayOfMonth().set(j, this.f19014c);
            }
            return aVar.dayOfMonth().add(aVar.monthOfYear().add(aVar.dayOfMonth().set(j, 1), 1), this.f19014c);
        }

        /* renamed from: e */
        private long m25710e(C10142a aVar, long j) {
            try {
                return m25709d(aVar, j);
            } catch (IllegalArgumentException e) {
                if (this.f19013b == 2 && this.f19014c == 29) {
                    while (!aVar.year().isLeap(j)) {
                        j = aVar.year().add(j, 1);
                    }
                    return m25709d(aVar, j);
                }
                throw e;
            }
        }

        /* renamed from: f */
        private long m25711f(C10142a aVar, long j) {
            try {
                return m25709d(aVar, j);
            } catch (IllegalArgumentException e) {
                if (this.f19013b == 2 && this.f19014c == 29) {
                    while (!aVar.year().isLeap(j)) {
                        j = aVar.year().add(j, -1);
                    }
                    return m25709d(aVar, j);
                }
                throw e;
            }
        }

        /* renamed from: g */
        private long m25712g(C10142a aVar, long j) {
            int i = this.f19015d - aVar.dayOfWeek().get(j);
            if (i == 0) {
                return j;
            }
            if (this.f19016e) {
                if (i < 0) {
                    i += 7;
                }
            } else if (i > 0) {
                i -= 7;
            }
            return aVar.dayOfWeek().add(j, i);
        }

        /* renamed from: a */
        public long mo41505a(long j, int i, int i2) {
            char c = this.f19012a;
            if (c == 'w') {
                i += i2;
            } else if (c != 's') {
                i = 0;
            }
            long j2 = (long) i;
            long j3 = j + j2;
            ISOChronology instanceUTC = ISOChronology.getInstanceUTC();
            long e = m25710e(instanceUTC, instanceUTC.millisOfDay().add(instanceUTC.millisOfDay().set(instanceUTC.monthOfYear().set(j3, this.f19013b), 0), this.f19017f));
            if (this.f19015d != 0) {
                e = m25712g(instanceUTC, e);
                if (e <= j3) {
                    e = m25712g(instanceUTC, m25710e(instanceUTC, instanceUTC.monthOfYear().set(instanceUTC.year().add(e, 1), this.f19013b)));
                }
            } else if (e <= j3) {
                e = m25710e(instanceUTC, instanceUTC.year().add(e, 1));
            }
            return e - j2;
        }

        /* renamed from: b */
        public long mo41506b(long j, int i, int i2) {
            char c = this.f19012a;
            if (c == 'w') {
                i += i2;
            } else if (c != 's') {
                i = 0;
            }
            long j2 = (long) i;
            long j3 = j + j2;
            ISOChronology instanceUTC = ISOChronology.getInstanceUTC();
            long f = m25711f(instanceUTC, instanceUTC.millisOfDay().add(instanceUTC.millisOfDay().set(instanceUTC.monthOfYear().set(j3, this.f19013b), 0), this.f19017f));
            if (this.f19015d != 0) {
                f = m25712g(instanceUTC, f);
                if (f >= j3) {
                    f = m25712g(instanceUTC, m25711f(instanceUTC, instanceUTC.monthOfYear().set(instanceUTC.year().add(f, -1), this.f19013b)));
                }
            } else if (f >= j3) {
                f = m25711f(instanceUTC, instanceUTC.year().add(f, -1));
            }
            return f - j2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C10227a)) {
                return false;
            }
            C10227a aVar = (C10227a) obj;
            return this.f19012a == aVar.f19012a && this.f19013b == aVar.f19013b && this.f19014c == aVar.f19014c && this.f19015d == aVar.f19015d && this.f19016e == aVar.f19016e && this.f19017f == aVar.f19017f;
        }

        /* renamed from: h */
        public void mo41508h(DataOutput dataOutput) {
            dataOutput.writeByte(this.f19012a);
            dataOutput.writeByte(this.f19013b);
            dataOutput.writeByte(this.f19014c);
            dataOutput.writeByte(this.f19015d);
            dataOutput.writeBoolean(this.f19016e);
            DateTimeZoneBuilder.m25707d(dataOutput, (long) this.f19017f);
        }
    }

    /* renamed from: org.joda.time.tz.DateTimeZoneBuilder$b */
    private static final class C10228b {

        /* renamed from: a */
        final C10227a f19018a;

        /* renamed from: b */
        final String f19019b;

        /* renamed from: c */
        final int f19020c;

        C10228b(C10227a aVar, String str, int i) {
            this.f19018a = aVar;
            this.f19019b = str;
            this.f19020c = i;
        }

        /* renamed from: e */
        static C10228b m25716e(DataInput dataInput) {
            return new C10228b(C10227a.m25708c(dataInput), dataInput.readUTF(), (int) DateTimeZoneBuilder.m25706c(dataInput));
        }

        /* renamed from: a */
        public String mo41509a() {
            return this.f19019b;
        }

        /* renamed from: b */
        public int mo41510b() {
            return this.f19020c;
        }

        /* renamed from: c */
        public long mo41511c(long j, int i, int i2) {
            return this.f19018a.mo41505a(j, i, i2);
        }

        /* renamed from: d */
        public long mo41512d(long j, int i, int i2) {
            return this.f19018a.mo41506b(j, i, i2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C10228b)) {
                return false;
            }
            C10228b bVar = (C10228b) obj;
            return this.f19020c == bVar.f19020c && this.f19019b.equals(bVar.f19019b) && this.f19018a.equals(bVar.f19018a);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public C10228b mo41514f(String str) {
            return new C10228b(this.f19018a, str, this.f19020c);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public C10228b mo41515g(String str) {
            return mo41514f((this.f19019b + str).intern());
        }

        /* renamed from: h */
        public void mo41516h(DataOutput dataOutput) {
            this.f19018a.mo41508h(dataOutput);
            dataOutput.writeUTF(this.f19019b);
            DateTimeZoneBuilder.m25707d(dataOutput, (long) this.f19020c);
        }
    }

    /* renamed from: org.joda.time.tz.DateTimeZoneBuilder$c */
    private static final class C10229c {

        /* renamed from: a */
        private final long f19021a;

        /* renamed from: b */
        private final String f19022b;

        /* renamed from: c */
        private final int f19023c;

        /* renamed from: d */
        private final int f19024d;

        /* renamed from: a */
        public long mo41517a() {
            return this.f19021a;
        }

        /* renamed from: b */
        public String mo41518b() {
            return this.f19022b;
        }

        /* renamed from: c */
        public int mo41519c() {
            return this.f19024d;
        }

        /* renamed from: d */
        public int mo41520d() {
            return this.f19023c;
        }

        /* renamed from: e */
        public boolean mo41521e(C10229c cVar) {
            if (cVar == null) {
                return true;
            }
            return this.f19021a > cVar.f19021a && (this.f19023c != cVar.f19023c || !this.f19022b.equals(cVar.f19022b));
        }
    }

    /* renamed from: a */
    public static DateTimeZone m25704a(DataInput dataInput, String str) {
        int readUnsignedByte = dataInput.readUnsignedByte();
        if (readUnsignedByte == 67) {
            return CachedDateTimeZone.forZone(PrecalculatedZone.readFrom(dataInput, str));
        }
        if (readUnsignedByte == 70) {
            FixedDateTimeZone fixedDateTimeZone = new FixedDateTimeZone(str, dataInput.readUTF(), (int) m25706c(dataInput), (int) m25706c(dataInput));
            DateTimeZone dateTimeZone = DateTimeZone.UTC;
            return fixedDateTimeZone.equals(dateTimeZone) ? dateTimeZone : fixedDateTimeZone;
        } else if (readUnsignedByte == 80) {
            return PrecalculatedZone.readFrom(dataInput, str);
        } else {
            throw new IOException("Invalid encoding");
        }
    }

    /* renamed from: b */
    public static DateTimeZone m25705b(InputStream inputStream, String str) {
        return inputStream instanceof DataInput ? m25704a((DataInput) inputStream, str) : m25704a(new DataInputStream(inputStream), str);
    }

    /* renamed from: c */
    static long m25706c(DataInput dataInput) {
        long readUnsignedByte;
        long j;
        int readUnsignedByte2 = dataInput.readUnsignedByte();
        int i = readUnsignedByte2 >> 6;
        if (i == 1) {
            readUnsignedByte = (long) (dataInput.readUnsignedByte() | ((readUnsignedByte2 << 26) >> 2) | (dataInput.readUnsignedByte() << 16) | (dataInput.readUnsignedByte() << 8));
            j = 60000;
        } else if (i == 2) {
            readUnsignedByte = ((((long) readUnsignedByte2) << 58) >> 26) | ((long) (dataInput.readUnsignedByte() << 24)) | ((long) (dataInput.readUnsignedByte() << 16)) | ((long) (dataInput.readUnsignedByte() << 8)) | ((long) dataInput.readUnsignedByte());
            j = 1000;
        } else if (i == 3) {
            return dataInput.readLong();
        } else {
            readUnsignedByte = (long) ((readUnsignedByte2 << 26) >> 26);
            j = 1800000;
        }
        return readUnsignedByte * j;
    }

    /* renamed from: d */
    static void m25707d(DataOutput dataOutput, long j) {
        if (j % 1800000 == 0) {
            long j2 = j / 1800000;
            if (((j2 << 58) >> 58) == j2) {
                dataOutput.writeByte((int) (j2 & 63));
                return;
            }
        }
        if (j % 60000 == 0) {
            long j3 = j / 60000;
            if (((j3 << 34) >> 34) == j3) {
                dataOutput.writeInt(1073741824 | ((int) (j3 & 1073741823)));
                return;
            }
        }
        if (j % 1000 == 0) {
            long j4 = j / 1000;
            if (((j4 << 26) >> 26) == j4) {
                dataOutput.writeByte(((int) ((j4 >> 32) & 63)) | 128);
                dataOutput.writeInt((int) (-1 & j4));
                return;
            }
        }
        dataOutput.writeByte(j < 0 ? 255 : 192);
        dataOutput.writeLong(j);
    }
}
