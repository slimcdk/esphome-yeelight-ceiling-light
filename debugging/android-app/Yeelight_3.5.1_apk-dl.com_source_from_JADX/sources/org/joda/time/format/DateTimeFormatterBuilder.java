package org.joda.time.format;

import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import org.apache.commons.p194io.FilenameUtils;
import org.joda.time.C10142a;
import org.joda.time.C10143b;
import org.joda.time.C10149c;
import org.joda.time.C10224k;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.field.C10181g;
import org.joda.time.field.MillisDurationField;

public class DateTimeFormatterBuilder {

    /* renamed from: a */
    private ArrayList<Object> f18850a = new ArrayList<>();

    /* renamed from: b */
    private Object f18851b;

    enum TimeZoneId implements C10204d, C10200b {
        INSTANCE;
        
        static final Set<String> ALL_IDS = null;
        static final int MAX_LENGTH = 0;

        static {
            int i;
            Set<String> availableIDs = DateTimeZone.getAvailableIDs();
            ALL_IDS = availableIDs;
            for (String length : availableIDs) {
                i = Math.max(i, length.length());
            }
            MAX_LENGTH = i;
        }

        public int estimateParsedLength() {
            return MAX_LENGTH;
        }

        public int estimatePrintedLength() {
            return MAX_LENGTH;
        }

        public int parseInto(C10201c cVar, String str, int i) {
            String substring = str.substring(i);
            String str2 = null;
            for (String next : ALL_IDS) {
                if (substring.startsWith(next) && (str2 == null || next.length() > str2.length())) {
                    str2 = next;
                }
            }
            if (str2 == null) {
                return i ^ -1;
            }
            cVar.mo41460x(DateTimeZone.forID(str2));
            return i + str2.length();
        }

        public void printTo(Writer writer, long j, C10142a aVar, int i, DateTimeZone dateTimeZone, Locale locale) {
            writer.write(dateTimeZone != null ? dateTimeZone.getID() : "");
        }

        public void printTo(Writer writer, C10224k kVar, Locale locale) {
        }

        public void printTo(StringBuffer stringBuffer, long j, C10142a aVar, int i, DateTimeZone dateTimeZone, Locale locale) {
            stringBuffer.append(dateTimeZone != null ? dateTimeZone.getID() : "");
        }

        public void printTo(StringBuffer stringBuffer, C10224k kVar, Locale locale) {
        }
    }

    /* renamed from: org.joda.time.format.DateTimeFormatterBuilder$a */
    static class C10186a implements C10204d, C10200b {

        /* renamed from: a */
        private final char f18852a;

        C10186a(char c) {
            this.f18852a = c;
        }

        public int estimateParsedLength() {
            return 1;
        }

        public int estimatePrintedLength() {
            return 1;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0011, code lost:
            r1 = java.lang.Character.toUpperCase(r1);
            r2 = java.lang.Character.toUpperCase(r2);
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int parseInto(org.joda.time.format.C10201c r1, java.lang.String r2, int r3) {
            /*
                r0 = this;
                int r1 = r2.length()
                if (r3 < r1) goto L_0x0009
                r1 = r3 ^ -1
                return r1
            L_0x0009:
                char r1 = r2.charAt(r3)
                char r2 = r0.f18852a
                if (r1 == r2) goto L_0x0028
                char r1 = java.lang.Character.toUpperCase(r1)
                char r2 = java.lang.Character.toUpperCase(r2)
                if (r1 == r2) goto L_0x0028
                char r1 = java.lang.Character.toLowerCase(r1)
                char r2 = java.lang.Character.toLowerCase(r2)
                if (r1 == r2) goto L_0x0028
                r1 = r3 ^ -1
                return r1
            L_0x0028:
                int r3 = r3 + 1
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: org.joda.time.format.DateTimeFormatterBuilder.C10186a.parseInto(org.joda.time.format.c, java.lang.String, int):int");
        }

        public void printTo(StringBuffer stringBuffer, long j, C10142a aVar, int i, DateTimeZone dateTimeZone, Locale locale) {
            stringBuffer.append(this.f18852a);
        }

        public void printTo(StringBuffer stringBuffer, C10224k kVar, Locale locale) {
            stringBuffer.append(this.f18852a);
        }
    }

    /* renamed from: org.joda.time.format.DateTimeFormatterBuilder$b */
    static class C10187b implements C10204d, C10200b {

        /* renamed from: a */
        private final C10204d[] f18853a;

        /* renamed from: b */
        private final C10200b[] f18854b;

        /* renamed from: c */
        private final int f18855c;

        /* renamed from: d */
        private final int f18856d;

        C10187b(List<Object> list) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            m25464b(list, arrayList, arrayList2);
            if (arrayList.contains((Object) null) || arrayList.isEmpty()) {
                this.f18853a = null;
                this.f18855c = 0;
            } else {
                int size = arrayList.size();
                this.f18853a = new C10204d[size];
                int i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    C10204d dVar = (C10204d) arrayList.get(i2);
                    i += dVar.estimatePrintedLength();
                    this.f18853a[i2] = dVar;
                }
                this.f18855c = i;
            }
            if (arrayList2.contains((Object) null) || arrayList2.isEmpty()) {
                this.f18854b = null;
                this.f18856d = 0;
                return;
            }
            int size2 = arrayList2.size();
            this.f18854b = new C10200b[size2];
            int i3 = 0;
            for (int i4 = 0; i4 < size2; i4++) {
                C10200b bVar = (C10200b) arrayList2.get(i4);
                i3 += bVar.estimateParsedLength();
                this.f18854b[i4] = bVar;
            }
            this.f18856d = i3;
        }

        /* renamed from: a */
        private void m25463a(List<Object> list, Object[] objArr) {
            if (objArr != null) {
                for (Object add : objArr) {
                    list.add(add);
                }
            }
        }

        /* renamed from: b */
        private void m25464b(List<Object> list, List<Object> list2, List<Object> list3) {
            int size = list.size();
            for (int i = 0; i < size; i += 2) {
                Object obj = list.get(i);
                if (obj instanceof C10187b) {
                    m25463a(list2, ((C10187b) obj).f18853a);
                } else {
                    list2.add(obj);
                }
                Object obj2 = list.get(i + 1);
                if (obj2 instanceof C10187b) {
                    m25463a(list3, ((C10187b) obj2).f18854b);
                } else {
                    list3.add(obj2);
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public boolean mo41426c() {
            return this.f18854b != null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public boolean mo41427d() {
            return this.f18853a != null;
        }

        public int estimateParsedLength() {
            return this.f18856d;
        }

        public int estimatePrintedLength() {
            return this.f18855c;
        }

        public int parseInto(C10201c cVar, String str, int i) {
            C10200b[] bVarArr = this.f18854b;
            if (bVarArr != null) {
                int length = bVarArr.length;
                for (int i2 = 0; i2 < length && i >= 0; i2++) {
                    i = bVarArr[i2].parseInto(cVar, str, i);
                }
                return i;
            }
            throw new UnsupportedOperationException();
        }

        public void printTo(StringBuffer stringBuffer, long j, C10142a aVar, int i, DateTimeZone dateTimeZone, Locale locale) {
            C10204d[] dVarArr = this.f18853a;
            if (dVarArr != null) {
                Locale locale2 = locale == null ? Locale.getDefault() : locale;
                for (C10204d printTo : dVarArr) {
                    printTo.printTo(stringBuffer, j, aVar, i, dateTimeZone, locale2);
                }
                return;
            }
            throw new UnsupportedOperationException();
        }

        public void printTo(StringBuffer stringBuffer, C10224k kVar, Locale locale) {
            C10204d[] dVarArr = this.f18853a;
            if (dVarArr != null) {
                if (locale == null) {
                    locale = Locale.getDefault();
                }
                for (C10204d printTo : dVarArr) {
                    printTo.printTo(stringBuffer, kVar, locale);
                }
                return;
            }
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: org.joda.time.format.DateTimeFormatterBuilder$c */
    static class C10188c extends C10192g {
        protected C10188c(DateTimeFieldType dateTimeFieldType, int i, boolean z) {
            super(dateTimeFieldType, i, z, i);
        }

        public int parseInto(C10201c cVar, String str, int i) {
            int i2;
            char charAt;
            int parseInto = super.parseInto(cVar, str, i);
            if (parseInto < 0 || parseInto == (i2 = this.f18863b + i)) {
                return parseInto;
            }
            if (this.f18864c && ((charAt = str.charAt(i)) == '-' || charAt == '+')) {
                i2++;
            }
            return parseInto > i2 ? (i2 + 1) ^ -1 : parseInto < i2 ? parseInto ^ -1 : parseInto;
        }
    }

    /* renamed from: org.joda.time.format.DateTimeFormatterBuilder$d */
    static class C10189d implements C10204d, C10200b {

        /* renamed from: a */
        private final DateTimeFieldType f18857a;

        /* renamed from: b */
        protected int f18858b;

        /* renamed from: c */
        protected int f18859c;

        protected C10189d(DateTimeFieldType dateTimeFieldType, int i, int i2) {
            this.f18857a = dateTimeFieldType;
            i2 = i2 > 18 ? 18 : i2;
            this.f18858b = i;
            this.f18859c = i2;
        }

        /* renamed from: a */
        private long[] m25467a(long j, C10143b bVar) {
            long j2;
            long unitMillis = bVar.getDurationField().getUnitMillis();
            int i = this.f18859c;
            while (true) {
                switch (i) {
                    case 1:
                        j2 = 10;
                        break;
                    case 2:
                        j2 = 100;
                        break;
                    case 3:
                        j2 = 1000;
                        break;
                    case 4:
                        j2 = 10000;
                        break;
                    case 5:
                        j2 = 100000;
                        break;
                    case 6:
                        j2 = 1000000;
                        break;
                    case 7:
                        j2 = 10000000;
                        break;
                    case 8:
                        j2 = 100000000;
                        break;
                    case 9:
                        j2 = 1000000000;
                        break;
                    case 10:
                        j2 = 10000000000L;
                        break;
                    case 11:
                        j2 = 100000000000L;
                        break;
                    case 12:
                        j2 = 1000000000000L;
                        break;
                    case 13:
                        j2 = 10000000000000L;
                        break;
                    case 14:
                        j2 = 100000000000000L;
                        break;
                    case 15:
                        j2 = 1000000000000000L;
                        break;
                    case 16:
                        j2 = 10000000000000000L;
                        break;
                    case 17:
                        j2 = 100000000000000000L;
                        break;
                    case 18:
                        j2 = 1000000000000000000L;
                        break;
                    default:
                        j2 = 1;
                        break;
                }
                if ((unitMillis * j2) / j2 == unitMillis) {
                    return new long[]{(j * j2) / unitMillis, (long) i};
                }
                i--;
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void mo41428b(StringBuffer stringBuffer, Writer writer, long j, C10142a aVar) {
            C10143b field = this.f18857a.getField(aVar);
            int i = this.f18858b;
            try {
                long remainder = field.remainder(j);
                if (remainder != 0) {
                    long[] a = m25467a(remainder, field);
                    int i2 = 0;
                    long j2 = a[0];
                    int i3 = (int) a[1];
                    String num = (2147483647L & j2) == j2 ? Integer.toString((int) j2) : Long.toString(j2);
                    int length = num.length();
                    while (length < i3) {
                        if (stringBuffer != null) {
                            stringBuffer.append('0');
                        } else {
                            writer.write(48);
                        }
                        i--;
                        i3--;
                    }
                    if (i < i3) {
                        while (i < i3 && length > 1 && num.charAt(length - 1) == '0') {
                            i3--;
                            length--;
                        }
                        if (length < num.length()) {
                            if (stringBuffer != null) {
                                while (i2 < length) {
                                    stringBuffer.append(num.charAt(i2));
                                    i2++;
                                }
                                return;
                            }
                            while (i2 < length) {
                                writer.write(num.charAt(i2));
                                i2++;
                            }
                            return;
                        }
                    }
                    if (stringBuffer != null) {
                        stringBuffer.append(num);
                    } else {
                        writer.write(num);
                    }
                } else if (stringBuffer != null) {
                    while (true) {
                        i--;
                        if (i >= 0) {
                            stringBuffer.append('0');
                        } else {
                            return;
                        }
                    }
                } else {
                    while (true) {
                        i--;
                        if (i >= 0) {
                            writer.write(48);
                        } else {
                            return;
                        }
                    }
                }
            } catch (RuntimeException unused) {
                if (stringBuffer != null) {
                    DateTimeFormatterBuilder.m25406Q(stringBuffer, i);
                } else {
                    DateTimeFormatterBuilder.m25413c0(writer, i);
                }
            }
        }

        public int estimateParsedLength() {
            return this.f18859c;
        }

        public int estimatePrintedLength() {
            return this.f18859c;
        }

        public int parseInto(C10201c cVar, String str, int i) {
            C10143b field = this.f18857a.getField(cVar.mo41449l());
            int min = Math.min(this.f18859c, str.length() - i);
            long unitMillis = field.getDurationField().getUnitMillis() * 10;
            long j = 0;
            int i2 = 0;
            while (i2 < min) {
                char charAt = str.charAt(i + i2);
                if (charAt < '0' || charAt > '9') {
                    break;
                }
                i2++;
                unitMillis /= 10;
                j += ((long) (charAt - '0')) * unitMillis;
            }
            long j2 = j / 10;
            if (i2 == 0) {
                return i ^ -1;
            }
            if (j2 > 2147483647L) {
                return i ^ -1;
            }
            cVar.mo41455r(new C10181g(DateTimeFieldType.millisOfSecond(), MillisDurationField.INSTANCE, field.getDurationField()), (int) j2);
            return i + i2;
        }

        public void printTo(StringBuffer stringBuffer, long j, C10142a aVar, int i, DateTimeZone dateTimeZone, Locale locale) {
            try {
                mo41428b(stringBuffer, (Writer) null, j, aVar);
            } catch (IOException unused) {
            }
        }

        public void printTo(StringBuffer stringBuffer, C10224k kVar, Locale locale) {
            try {
                mo41428b(stringBuffer, (Writer) null, kVar.getChronology().set(kVar, 0), kVar.getChronology());
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: org.joda.time.format.DateTimeFormatterBuilder$e */
    static class C10190e implements C10200b {

        /* renamed from: a */
        private final C10200b[] f18860a;

        /* renamed from: b */
        private final int f18861b;

        C10190e(C10200b[] bVarArr) {
            int estimateParsedLength;
            this.f18860a = bVarArr;
            int length = bVarArr.length;
            int i = 0;
            while (true) {
                length--;
                if (length >= 0) {
                    C10200b bVar = bVarArr[length];
                    if (bVar != null && (estimateParsedLength = bVar.estimateParsedLength()) > i) {
                        i = estimateParsedLength;
                    }
                } else {
                    this.f18861b = i;
                    return;
                }
            }
        }

        public int estimateParsedLength() {
            return this.f18861b;
        }

        public int parseInto(C10201c cVar, String str, int i) {
            int i2;
            int i3;
            C10200b[] bVarArr = this.f18860a;
            int length = bVarArr.length;
            Object v = cVar.mo41458v();
            boolean z = false;
            Object obj = null;
            int i4 = i;
            int i5 = i4;
            int i6 = 0;
            while (true) {
                if (i6 >= length) {
                    break;
                }
                C10200b bVar = bVarArr[i6];
                if (bVar != null) {
                    int parseInto = bVar.parseInto(cVar, str, i);
                    if (parseInto >= i) {
                        if (parseInto <= i4) {
                            continue;
                        } else if (parseInto >= str.length() || (i3 = i6 + 1) >= length || bVarArr[i3] == null) {
                            return parseInto;
                        } else {
                            obj = cVar.mo41458v();
                            i4 = parseInto;
                        }
                    } else if (parseInto < 0 && (i2 = parseInto ^ -1) > i5) {
                        i5 = i2;
                    }
                    cVar.mo41454q(v);
                    i6++;
                } else if (i4 <= i) {
                    return i;
                } else {
                    z = true;
                }
            }
            if (i4 <= i && (i4 != i || !z)) {
                return i5 ^ -1;
            }
            if (obj != null) {
                cVar.mo41454q(obj);
            }
            return i4;
        }
    }

    /* renamed from: org.joda.time.format.DateTimeFormatterBuilder$f */
    static abstract class C10191f implements C10204d, C10200b {

        /* renamed from: a */
        protected final DateTimeFieldType f18862a;

        /* renamed from: b */
        protected final int f18863b;

        /* renamed from: c */
        protected final boolean f18864c;

        C10191f(DateTimeFieldType dateTimeFieldType, int i, boolean z) {
            this.f18862a = dateTimeFieldType;
            this.f18863b = i;
            this.f18864c = z;
        }

        public int estimateParsedLength() {
            return this.f18863b;
        }

        public int parseInto(C10201c cVar, String str, int i) {
            int i2;
            int i3;
            char charAt;
            int min = Math.min(this.f18863b, str.length() - i);
            int i4 = 0;
            boolean z = false;
            while (i4 < min) {
                int i5 = i + i4;
                char charAt2 = str.charAt(i5);
                if (i4 != 0 || ((charAt2 != '-' && charAt2 != '+') || !this.f18864c)) {
                    if (charAt2 < '0' || charAt2 > '9') {
                        break;
                    }
                    i4++;
                } else {
                    z = charAt2 == '-';
                    int i6 = i4 + 1;
                    if (i6 >= min || (charAt = str.charAt(i5 + 1)) < '0' || charAt > '9') {
                        break;
                    }
                    if (z) {
                        i4 = i6;
                    } else {
                        i++;
                    }
                    min = Math.min(min + 1, str.length() - i);
                }
            }
            if (i4 == 0) {
                return i ^ -1;
            }
            if (i4 >= 9) {
                i3 = i4 + i;
                i2 = Integer.parseInt(str.substring(i, i3));
            } else {
                int i7 = z ? i + 1 : i;
                int i8 = i7 + 1;
                try {
                    int charAt3 = str.charAt(i7) - '0';
                    i3 = i4 + i;
                    while (i8 < i3) {
                        i8++;
                        charAt3 = (((charAt3 << 3) + (charAt3 << 1)) + str.charAt(i8)) - 48;
                    }
                    i2 = z ? -charAt3 : charAt3;
                } catch (StringIndexOutOfBoundsException unused) {
                    return i ^ -1;
                }
            }
            cVar.mo41456s(this.f18862a, i2);
            return i3;
        }
    }

    /* renamed from: org.joda.time.format.DateTimeFormatterBuilder$g */
    static class C10192g extends C10191f {

        /* renamed from: d */
        protected final int f18865d;

        protected C10192g(DateTimeFieldType dateTimeFieldType, int i, boolean z, int i2) {
            super(dateTimeFieldType, i, z);
            this.f18865d = i2;
        }

        public int estimatePrintedLength() {
            return this.f18863b;
        }

        public void printTo(StringBuffer stringBuffer, long j, C10142a aVar, int i, DateTimeZone dateTimeZone, Locale locale) {
            try {
                C10205e.m25526a(stringBuffer, this.f18862a.getField(aVar).get(j), this.f18865d);
            } catch (RuntimeException unused) {
                DateTimeFormatterBuilder.m25406Q(stringBuffer, this.f18865d);
            }
        }

        public void printTo(StringBuffer stringBuffer, C10224k kVar, Locale locale) {
            if (kVar.isSupported(this.f18862a)) {
                try {
                    C10205e.m25526a(stringBuffer, kVar.get(this.f18862a), this.f18865d);
                    return;
                } catch (RuntimeException unused) {
                }
            }
            DateTimeFormatterBuilder.m25406Q(stringBuffer, this.f18865d);
        }
    }

    /* renamed from: org.joda.time.format.DateTimeFormatterBuilder$h */
    static class C10193h implements C10204d, C10200b {

        /* renamed from: a */
        private final String f18866a;

        C10193h(String str) {
            this.f18866a = str;
        }

        public int estimateParsedLength() {
            return this.f18866a.length();
        }

        public int estimatePrintedLength() {
            return this.f18866a.length();
        }

        public int parseInto(C10201c cVar, String str, int i) {
            String str2 = this.f18866a;
            return str.regionMatches(true, i, str2, 0, str2.length()) ? i + this.f18866a.length() : i ^ -1;
        }

        public void printTo(StringBuffer stringBuffer, long j, C10142a aVar, int i, DateTimeZone dateTimeZone, Locale locale) {
            stringBuffer.append(this.f18866a);
        }

        public void printTo(StringBuffer stringBuffer, C10224k kVar, Locale locale) {
            stringBuffer.append(this.f18866a);
        }
    }

    /* renamed from: org.joda.time.format.DateTimeFormatterBuilder$i */
    static class C10194i implements C10204d, C10200b {

        /* renamed from: c */
        private static Map<Locale, Map<DateTimeFieldType, Object[]>> f18867c = new HashMap();

        /* renamed from: a */
        private final DateTimeFieldType f18868a;

        /* renamed from: b */
        private final boolean f18869b;

        C10194i(DateTimeFieldType dateTimeFieldType, boolean z) {
            this.f18868a = dateTimeFieldType;
            this.f18869b = z;
        }

        /* renamed from: a */
        private String m25469a(long j, C10142a aVar, Locale locale) {
            C10143b field = this.f18868a.getField(aVar);
            return this.f18869b ? field.getAsShortText(j, locale) : field.getAsText(j, locale);
        }

        /* renamed from: b */
        private String m25470b(C10224k kVar, Locale locale) {
            if (!kVar.isSupported(this.f18868a)) {
                return "�";
            }
            C10143b field = this.f18868a.getField(kVar.getChronology());
            return this.f18869b ? field.getAsShortText(kVar, locale) : field.getAsText(kVar, locale);
        }

        public int estimateParsedLength() {
            return estimatePrintedLength();
        }

        public int estimatePrintedLength() {
            return this.f18869b ? 6 : 20;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:24:0x00db, code lost:
            r1 = java.lang.Math.min(r13.length(), r6 + r14);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x00e4, code lost:
            if (r1 <= r14) goto L_0x00f9;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:0x00e6, code lost:
            r2 = r13.substring(r14, r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x00ee, code lost:
            if (r3.contains(r2) == false) goto L_0x00f6;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x00f0, code lost:
            r12.mo41457t(r11.f18868a, r2, r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x00f5, code lost:
            return r1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:30:0x00f6, code lost:
            r1 = r1 - 1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:0x00fb, code lost:
            return r14 ^ -1;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int parseInto(org.joda.time.format.C10201c r12, java.lang.String r13, int r14) {
            /*
                r11 = this;
                java.util.Locale r0 = r12.mo41450m()
                java.util.Map<java.util.Locale, java.util.Map<org.joda.time.DateTimeFieldType, java.lang.Object[]>> r1 = f18867c
                monitor-enter(r1)
                java.util.Map<java.util.Locale, java.util.Map<org.joda.time.DateTimeFieldType, java.lang.Object[]>> r2 = f18867c     // Catch:{ all -> 0x00fc }
                java.lang.Object r2 = r2.get(r0)     // Catch:{ all -> 0x00fc }
                java.util.Map r2 = (java.util.Map) r2     // Catch:{ all -> 0x00fc }
                if (r2 != 0) goto L_0x001b
                java.util.HashMap r2 = new java.util.HashMap     // Catch:{ all -> 0x00fc }
                r2.<init>()     // Catch:{ all -> 0x00fc }
                java.util.Map<java.util.Locale, java.util.Map<org.joda.time.DateTimeFieldType, java.lang.Object[]>> r3 = f18867c     // Catch:{ all -> 0x00fc }
                r3.put(r0, r2)     // Catch:{ all -> 0x00fc }
            L_0x001b:
                org.joda.time.DateTimeFieldType r3 = r11.f18868a     // Catch:{ all -> 0x00fc }
                java.lang.Object r3 = r2.get(r3)     // Catch:{ all -> 0x00fc }
                java.lang.Object[] r3 = (java.lang.Object[]) r3     // Catch:{ all -> 0x00fc }
                r4 = 0
                r5 = 1
                if (r3 != 0) goto L_0x00cd
                java.util.HashSet r3 = new java.util.HashSet     // Catch:{ all -> 0x00fc }
                r6 = 32
                r3.<init>(r6)     // Catch:{ all -> 0x00fc }
                org.joda.time.MutableDateTime r7 = new org.joda.time.MutableDateTime     // Catch:{ all -> 0x00fc }
                r8 = 0
                org.joda.time.DateTimeZone r10 = org.joda.time.DateTimeZone.UTC     // Catch:{ all -> 0x00fc }
                r7.<init>((long) r8, (org.joda.time.DateTimeZone) r10)     // Catch:{ all -> 0x00fc }
                org.joda.time.DateTimeFieldType r8 = r11.f18868a     // Catch:{ all -> 0x00fc }
                org.joda.time.MutableDateTime$Property r7 = r7.property(r8)     // Catch:{ all -> 0x00fc }
                int r8 = r7.getMinimumValueOverall()     // Catch:{ all -> 0x00fc }
                int r9 = r7.getMaximumValueOverall()     // Catch:{ all -> 0x00fc }
                int r10 = r9 - r8
                if (r10 <= r6) goto L_0x004d
                r12 = r14 ^ -1
                monitor-exit(r1)     // Catch:{ all -> 0x00fc }
                return r12
            L_0x004d:
                int r6 = r7.getMaximumTextLength(r0)     // Catch:{ all -> 0x00fc }
            L_0x0051:
                if (r8 > r9) goto L_0x0093
                r7.set((int) r8)     // Catch:{ all -> 0x00fc }
                java.lang.String r10 = r7.getAsShortText(r0)     // Catch:{ all -> 0x00fc }
                r3.add(r10)     // Catch:{ all -> 0x00fc }
                java.lang.String r10 = r7.getAsShortText(r0)     // Catch:{ all -> 0x00fc }
                java.lang.String r10 = r10.toLowerCase(r0)     // Catch:{ all -> 0x00fc }
                r3.add(r10)     // Catch:{ all -> 0x00fc }
                java.lang.String r10 = r7.getAsShortText(r0)     // Catch:{ all -> 0x00fc }
                java.lang.String r10 = r10.toUpperCase(r0)     // Catch:{ all -> 0x00fc }
                r3.add(r10)     // Catch:{ all -> 0x00fc }
                java.lang.String r10 = r7.getAsText(r0)     // Catch:{ all -> 0x00fc }
                r3.add(r10)     // Catch:{ all -> 0x00fc }
                java.lang.String r10 = r7.getAsText(r0)     // Catch:{ all -> 0x00fc }
                java.lang.String r10 = r10.toLowerCase(r0)     // Catch:{ all -> 0x00fc }
                r3.add(r10)     // Catch:{ all -> 0x00fc }
                java.lang.String r10 = r7.getAsText(r0)     // Catch:{ all -> 0x00fc }
                java.lang.String r10 = r10.toUpperCase(r0)     // Catch:{ all -> 0x00fc }
                r3.add(r10)     // Catch:{ all -> 0x00fc }
                int r8 = r8 + 1
                goto L_0x0051
            L_0x0093:
                java.lang.String r7 = "en"
                java.lang.String r8 = r0.getLanguage()     // Catch:{ all -> 0x00fc }
                boolean r7 = r7.equals(r8)     // Catch:{ all -> 0x00fc }
                if (r7 == 0) goto L_0x00bc
                org.joda.time.DateTimeFieldType r7 = r11.f18868a     // Catch:{ all -> 0x00fc }
                org.joda.time.DateTimeFieldType r8 = org.joda.time.DateTimeFieldType.era()     // Catch:{ all -> 0x00fc }
                if (r7 != r8) goto L_0x00bc
                java.lang.String r6 = "BCE"
                r3.add(r6)     // Catch:{ all -> 0x00fc }
                java.lang.String r6 = "bce"
                r3.add(r6)     // Catch:{ all -> 0x00fc }
                java.lang.String r6 = "CE"
                r3.add(r6)     // Catch:{ all -> 0x00fc }
                java.lang.String r6 = "ce"
                r3.add(r6)     // Catch:{ all -> 0x00fc }
                r6 = 3
            L_0x00bc:
                r7 = 2
                java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch:{ all -> 0x00fc }
                r7[r4] = r3     // Catch:{ all -> 0x00fc }
                java.lang.Integer r4 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x00fc }
                r7[r5] = r4     // Catch:{ all -> 0x00fc }
                org.joda.time.DateTimeFieldType r4 = r11.f18868a     // Catch:{ all -> 0x00fc }
                r2.put(r4, r7)     // Catch:{ all -> 0x00fc }
                goto L_0x00da
            L_0x00cd:
                r2 = r3[r4]     // Catch:{ all -> 0x00fc }
                java.util.Set r2 = (java.util.Set) r2     // Catch:{ all -> 0x00fc }
                r3 = r3[r5]     // Catch:{ all -> 0x00fc }
                java.lang.Integer r3 = (java.lang.Integer) r3     // Catch:{ all -> 0x00fc }
                int r6 = r3.intValue()     // Catch:{ all -> 0x00fc }
                r3 = r2
            L_0x00da:
                monitor-exit(r1)     // Catch:{ all -> 0x00fc }
                int r1 = r13.length()
                int r6 = r6 + r14
                int r1 = java.lang.Math.min(r1, r6)
            L_0x00e4:
                if (r1 <= r14) goto L_0x00f9
                java.lang.String r2 = r13.substring(r14, r1)
                boolean r4 = r3.contains(r2)
                if (r4 == 0) goto L_0x00f6
                org.joda.time.DateTimeFieldType r13 = r11.f18868a
                r12.mo41457t(r13, r2, r0)
                return r1
            L_0x00f6:
                int r1 = r1 + -1
                goto L_0x00e4
            L_0x00f9:
                r12 = r14 ^ -1
                return r12
            L_0x00fc:
                r12 = move-exception
                monitor-exit(r1)     // Catch:{ all -> 0x00fc }
                goto L_0x0100
            L_0x00ff:
                throw r12
            L_0x0100:
                goto L_0x00ff
            */
            throw new UnsupportedOperationException("Method not decompiled: org.joda.time.format.DateTimeFormatterBuilder.C10194i.parseInto(org.joda.time.format.c, java.lang.String, int):int");
        }

        public void printTo(StringBuffer stringBuffer, long j, C10142a aVar, int i, DateTimeZone dateTimeZone, Locale locale) {
            try {
                stringBuffer.append(m25469a(j, aVar, locale));
            } catch (RuntimeException unused) {
                stringBuffer.append(65533);
            }
        }

        public void printTo(StringBuffer stringBuffer, C10224k kVar, Locale locale) {
            try {
                stringBuffer.append(m25470b(kVar, locale));
            } catch (RuntimeException unused) {
                stringBuffer.append(65533);
            }
        }
    }

    /* renamed from: org.joda.time.format.DateTimeFormatterBuilder$j */
    static class C10195j implements C10204d, C10200b {

        /* renamed from: a */
        private final Map<String, DateTimeZone> f18870a;

        /* renamed from: b */
        private final int f18871b;

        C10195j(int i, Map<String, DateTimeZone> map) {
            this.f18871b = i;
            this.f18870a = map;
        }

        /* renamed from: a */
        private String m25471a(long j, DateTimeZone dateTimeZone, Locale locale) {
            if (dateTimeZone == null) {
                return "";
            }
            int i = this.f18871b;
            return i != 0 ? i != 1 ? "" : dateTimeZone.getShortName(j, locale) : dateTimeZone.getName(j, locale);
        }

        public int estimateParsedLength() {
            return this.f18871b == 1 ? 4 : 20;
        }

        public int estimatePrintedLength() {
            return this.f18871b == 1 ? 4 : 20;
        }

        public int parseInto(C10201c cVar, String str, int i) {
            Map<String, DateTimeZone> map = this.f18870a;
            if (map == null) {
                map = C10149c.m25339d();
            }
            String substring = str.substring(i);
            String str2 = null;
            for (String next : map.keySet()) {
                if (substring.startsWith(next) && (str2 == null || next.length() > str2.length())) {
                    str2 = next;
                }
            }
            if (str2 == null) {
                return i ^ -1;
            }
            cVar.mo41460x(map.get(str2));
            return i + str2.length();
        }

        public void printTo(StringBuffer stringBuffer, long j, C10142a aVar, int i, DateTimeZone dateTimeZone, Locale locale) {
            stringBuffer.append(m25471a(j - ((long) i), dateTimeZone, locale));
        }

        public void printTo(StringBuffer stringBuffer, C10224k kVar, Locale locale) {
        }
    }

    /* renamed from: org.joda.time.format.DateTimeFormatterBuilder$k */
    static class C10196k implements C10204d, C10200b {

        /* renamed from: a */
        private final String f18872a;

        /* renamed from: b */
        private final String f18873b;

        /* renamed from: c */
        private final boolean f18874c;

        /* renamed from: d */
        private final int f18875d;

        /* renamed from: e */
        private final int f18876e;

        C10196k(String str, String str2, boolean z, int i, int i2) {
            this.f18872a = str;
            this.f18873b = str2;
            this.f18874c = z;
            if (i <= 0 || i2 < i) {
                throw new IllegalArgumentException();
            }
            if (i > 4) {
                i = 4;
                i2 = 4;
            }
            this.f18875d = i;
            this.f18876e = i2;
        }

        /* renamed from: a */
        private int m25472a(String str, int i, int i2) {
            int i3 = 0;
            for (int min = Math.min(str.length() - i, i2); min > 0; min--) {
                char charAt = str.charAt(i + i3);
                if (charAt < '0' || charAt > '9') {
                    break;
                }
                i3++;
            }
            return i3;
        }

        public int estimateParsedLength() {
            return estimatePrintedLength();
        }

        public int estimatePrintedLength() {
            int i = this.f18875d;
            int i2 = (i + 1) << 1;
            if (this.f18874c) {
                i2 += i - 1;
            }
            String str = this.f18872a;
            return (str == null || str.length() <= i2) ? i2 : this.f18872a.length();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:38:0x008b, code lost:
            if (r6 <= '9') goto L_0x008d;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int parseInto(org.joda.time.format.C10201c r13, java.lang.String r14, int r15) {
            /*
                r12 = this;
                int r0 = r14.length()
                int r0 = r0 - r15
                java.lang.String r1 = r12.f18873b
                r2 = 43
                r3 = 45
                r4 = 0
                java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
                if (r1 == 0) goto L_0x0042
                int r1 = r1.length()
                if (r1 != 0) goto L_0x0027
                if (r0 <= 0) goto L_0x0023
                char r1 = r14.charAt(r15)
                if (r1 == r3) goto L_0x0042
                if (r1 != r2) goto L_0x0023
                goto L_0x0042
            L_0x0023:
                r13.mo41459w(r5)
                return r15
            L_0x0027:
                r7 = 1
                java.lang.String r9 = r12.f18873b
                r10 = 0
                int r11 = r9.length()
                r6 = r14
                r8 = r15
                boolean r1 = r6.regionMatches(r7, r8, r9, r10, r11)
                if (r1 == 0) goto L_0x0042
                r13.mo41459w(r5)
                java.lang.String r13 = r12.f18873b
                int r13 = r13.length()
                int r15 = r15 + r13
                return r15
            L_0x0042:
                r1 = 1
                if (r0 > r1) goto L_0x0048
                r13 = r15 ^ -1
                return r13
            L_0x0048:
                char r5 = r14.charAt(r15)
                if (r5 != r3) goto L_0x0050
                r2 = 1
                goto L_0x0053
            L_0x0050:
                if (r5 != r2) goto L_0x0136
                r2 = 0
            L_0x0053:
                int r0 = r0 + -1
                int r15 = r15 + r1
                r3 = 2
                int r5 = r12.m25472a(r14, r15, r3)
                if (r5 >= r3) goto L_0x0060
                r13 = r15 ^ -1
                return r13
            L_0x0060:
                int r5 = org.joda.time.format.C10205e.m25531f(r14, r15)
                r6 = 23
                if (r5 <= r6) goto L_0x006b
                r13 = r15 ^ -1
                return r13
            L_0x006b:
                r6 = 3600000(0x36ee80, float:5.044674E-39)
                int r5 = r5 * r6
                int r0 = r0 + -2
                int r15 = r15 + r3
                if (r0 > 0) goto L_0x0077
                goto L_0x012b
            L_0x0077:
                char r6 = r14.charAt(r15)
                r7 = 58
                r8 = 48
                if (r6 != r7) goto L_0x0087
                int r0 = r0 + -1
                int r15 = r15 + 1
                r4 = 1
                goto L_0x008d
            L_0x0087:
                if (r6 < r8) goto L_0x012b
                r9 = 57
                if (r6 > r9) goto L_0x012b
            L_0x008d:
                int r6 = r12.m25472a(r14, r15, r3)
                if (r6 != 0) goto L_0x0097
                if (r4 != 0) goto L_0x0097
                goto L_0x012b
            L_0x0097:
                if (r6 >= r3) goto L_0x009c
                r13 = r15 ^ -1
                return r13
            L_0x009c:
                int r6 = org.joda.time.format.C10205e.m25531f(r14, r15)
                r9 = 59
                if (r6 <= r9) goto L_0x00a7
                r13 = r15 ^ -1
                return r13
            L_0x00a7:
                r10 = 60000(0xea60, float:8.4078E-41)
                int r6 = r6 * r10
                int r5 = r5 + r6
                int r0 = r0 + -2
                int r15 = r15 + 2
                if (r0 > 0) goto L_0x00b5
                goto L_0x012b
            L_0x00b5:
                if (r4 == 0) goto L_0x00c3
                char r6 = r14.charAt(r15)
                if (r6 == r7) goto L_0x00bf
                goto L_0x012b
            L_0x00bf:
                int r0 = r0 + -1
                int r15 = r15 + 1
            L_0x00c3:
                int r6 = r12.m25472a(r14, r15, r3)
                if (r6 != 0) goto L_0x00cc
                if (r4 != 0) goto L_0x00cc
                goto L_0x012b
            L_0x00cc:
                if (r6 >= r3) goto L_0x00d1
                r13 = r15 ^ -1
                return r13
            L_0x00d1:
                int r6 = org.joda.time.format.C10205e.m25531f(r14, r15)
                if (r6 <= r9) goto L_0x00da
                r13 = r15 ^ -1
                return r13
            L_0x00da:
                int r6 = r6 * 1000
                int r5 = r5 + r6
                int r0 = r0 + -2
                int r15 = r15 + 2
                if (r0 > 0) goto L_0x00e4
                goto L_0x012b
            L_0x00e4:
                if (r4 == 0) goto L_0x00f9
                char r0 = r14.charAt(r15)
                r6 = 46
                if (r0 == r6) goto L_0x00f7
                char r0 = r14.charAt(r15)
                r6 = 44
                if (r0 == r6) goto L_0x00f7
                goto L_0x012b
            L_0x00f7:
                int r15 = r15 + 1
            L_0x00f9:
                r0 = 3
                int r0 = r12.m25472a(r14, r15, r0)
                if (r0 != 0) goto L_0x0103
                if (r4 != 0) goto L_0x0103
                goto L_0x012b
            L_0x0103:
                if (r0 >= r1) goto L_0x0108
                r13 = r15 ^ -1
                return r13
            L_0x0108:
                int r4 = r15 + 1
                char r15 = r14.charAt(r15)
                int r15 = r15 - r8
                int r15 = r15 * 100
                int r5 = r5 + r15
                if (r0 <= r1) goto L_0x012a
                int r15 = r4 + 1
                char r1 = r14.charAt(r4)
                int r1 = r1 - r8
                int r1 = r1 * 10
                int r5 = r5 + r1
                if (r0 <= r3) goto L_0x012b
                int r0 = r15 + 1
                char r14 = r14.charAt(r15)
                int r14 = r14 - r8
                int r5 = r5 + r14
                r15 = r0
                goto L_0x012b
            L_0x012a:
                r15 = r4
            L_0x012b:
                if (r2 == 0) goto L_0x012e
                int r5 = -r5
            L_0x012e:
                java.lang.Integer r14 = java.lang.Integer.valueOf(r5)
                r13.mo41459w(r14)
                return r15
            L_0x0136:
                r13 = r15 ^ -1
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: org.joda.time.format.DateTimeFormatterBuilder.C10196k.parseInto(org.joda.time.format.c, java.lang.String, int):int");
        }

        public void printTo(StringBuffer stringBuffer, long j, C10142a aVar, int i, DateTimeZone dateTimeZone, Locale locale) {
            String str;
            if (dateTimeZone != null) {
                if (i != 0 || (str = this.f18872a) == null) {
                    if (i >= 0) {
                        stringBuffer.append('+');
                    } else {
                        stringBuffer.append('-');
                        i = -i;
                    }
                    int i2 = i / 3600000;
                    C10205e.m25526a(stringBuffer, i2, 2);
                    if (this.f18876e != 1) {
                        int i3 = i - (i2 * 3600000);
                        if (i3 != 0 || this.f18875d > 1) {
                            int i4 = i3 / 60000;
                            if (this.f18874c) {
                                stringBuffer.append(':');
                            }
                            C10205e.m25526a(stringBuffer, i4, 2);
                            if (this.f18876e != 2) {
                                int i5 = i3 - (i4 * 60000);
                                if (i5 != 0 || this.f18875d > 2) {
                                    int i6 = i5 / 1000;
                                    if (this.f18874c) {
                                        stringBuffer.append(':');
                                    }
                                    C10205e.m25526a(stringBuffer, i6, 2);
                                    if (this.f18876e != 3) {
                                        int i7 = i5 - (i6 * 1000);
                                        if (i7 != 0 || this.f18875d > 3) {
                                            if (this.f18874c) {
                                                stringBuffer.append(FilenameUtils.EXTENSION_SEPARATOR);
                                            }
                                            C10205e.m25526a(stringBuffer, i7, 3);
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                stringBuffer.append(str);
            }
        }

        public void printTo(StringBuffer stringBuffer, C10224k kVar, Locale locale) {
        }
    }

    /* renamed from: org.joda.time.format.DateTimeFormatterBuilder$l */
    static class C10197l implements C10204d, C10200b {

        /* renamed from: a */
        private final DateTimeFieldType f18877a;

        /* renamed from: b */
        private final int f18878b;

        /* renamed from: c */
        private final boolean f18879c;

        C10197l(DateTimeFieldType dateTimeFieldType, int i, boolean z) {
            this.f18877a = dateTimeFieldType;
            this.f18878b = i;
            this.f18879c = z;
        }

        /* renamed from: a */
        private int m25473a(long j, C10142a aVar) {
            try {
                int i = this.f18877a.getField(aVar).get(j);
                if (i < 0) {
                    i = -i;
                }
                return i % 100;
            } catch (RuntimeException unused) {
                return -1;
            }
        }

        /* renamed from: b */
        private int m25474b(C10224k kVar) {
            if (!kVar.isSupported(this.f18877a)) {
                return -1;
            }
            try {
                int i = kVar.get(this.f18877a);
                if (i < 0) {
                    i = -i;
                }
                return i % 100;
            } catch (RuntimeException unused) {
                return -1;
            }
        }

        public int estimateParsedLength() {
            return this.f18879c ? 4 : 2;
        }

        public int estimatePrintedLength() {
            return 2;
        }

        public int parseInto(C10201c cVar, String str, int i) {
            int i2;
            int i3;
            int length = str.length() - i;
            int i4 = 0;
            if (this.f18879c) {
                int i5 = 0;
                boolean z = false;
                boolean z2 = false;
                while (i5 < length) {
                    char charAt = str.charAt(i + i5);
                    if (i5 != 0 || (charAt != '-' && charAt != '+')) {
                        if (charAt < '0' || charAt > '9') {
                            break;
                        }
                        i5++;
                    } else {
                        z2 = charAt == '-';
                        if (z2) {
                            i5++;
                        } else {
                            i++;
                            length--;
                        }
                        z = true;
                    }
                }
                if (i5 == 0) {
                    return i ^ -1;
                }
                if (z || i5 != 2) {
                    if (i5 >= 9) {
                        i3 = i5 + i;
                        i2 = Integer.parseInt(str.substring(i, i3));
                    } else {
                        int i6 = z2 ? i + 1 : i;
                        int i7 = i6 + 1;
                        try {
                            int charAt2 = str.charAt(i6) - '0';
                            i3 = i5 + i;
                            while (i7 < i3) {
                                i7++;
                                charAt2 = (((charAt2 << 3) + (charAt2 << 1)) + str.charAt(i7)) - 48;
                            }
                            i2 = z2 ? -charAt2 : charAt2;
                        } catch (StringIndexOutOfBoundsException unused) {
                            return i ^ -1;
                        }
                    }
                    cVar.mo41456s(this.f18877a, i2);
                    return i3;
                }
            } else if (Math.min(2, length) < 2) {
                return i ^ -1;
            }
            char charAt3 = str.charAt(i);
            if (charAt3 < '0' || charAt3 > '9') {
                return i ^ -1;
            }
            int i8 = charAt3 - '0';
            char charAt4 = str.charAt(i + 1);
            if (charAt4 < '0' || charAt4 > '9') {
                return i ^ -1;
            }
            int i9 = (((i8 << 3) + (i8 << 1)) + charAt4) - 48;
            int i10 = this.f18878b;
            if (cVar.mo41452o() != null) {
                i10 = cVar.mo41452o().intValue();
            }
            int i11 = i10 - 50;
            int i12 = i11 >= 0 ? i11 % 100 : ((i11 + 1) % 100) + 99;
            if (i9 < i12) {
                i4 = 100;
            }
            cVar.mo41456s(this.f18877a, i9 + ((i11 + i4) - i12));
            return i + 2;
        }

        public void printTo(StringBuffer stringBuffer, long j, C10142a aVar, int i, DateTimeZone dateTimeZone, Locale locale) {
            int a = m25473a(j, aVar);
            if (a < 0) {
                stringBuffer.append(65533);
                stringBuffer.append(65533);
                return;
            }
            C10205e.m25526a(stringBuffer, a, 2);
        }

        public void printTo(StringBuffer stringBuffer, C10224k kVar, Locale locale) {
            int b = m25474b(kVar);
            if (b < 0) {
                stringBuffer.append(65533);
                stringBuffer.append(65533);
                return;
            }
            C10205e.m25526a(stringBuffer, b, 2);
        }
    }

    /* renamed from: org.joda.time.format.DateTimeFormatterBuilder$m */
    static class C10198m extends C10191f {
        protected C10198m(DateTimeFieldType dateTimeFieldType, int i, boolean z) {
            super(dateTimeFieldType, i, z);
        }

        public int estimatePrintedLength() {
            return this.f18863b;
        }

        public void printTo(StringBuffer stringBuffer, long j, C10142a aVar, int i, DateTimeZone dateTimeZone, Locale locale) {
            try {
                C10205e.m25527b(stringBuffer, this.f18862a.getField(aVar).get(j));
            } catch (RuntimeException unused) {
                stringBuffer.append(65533);
            }
        }

        public void printTo(StringBuffer stringBuffer, C10224k kVar, Locale locale) {
            if (kVar.isSupported(this.f18862a)) {
                try {
                    C10205e.m25527b(stringBuffer, kVar.get(this.f18862a));
                    return;
                } catch (RuntimeException unused) {
                }
            }
            stringBuffer.append(65533);
        }
    }

    /* renamed from: Q */
    static void m25406Q(StringBuffer stringBuffer, int i) {
        while (true) {
            i--;
            if (i >= 0) {
                stringBuffer.append(65533);
            } else {
                return;
            }
        }
    }

    /* renamed from: W */
    private void m25407W(C10200b bVar) {
        if (bVar == null) {
            throw new IllegalArgumentException("No parser supplied");
        }
    }

    /* renamed from: X */
    private void m25408X(C10204d dVar) {
        if (dVar == null) {
            throw new IllegalArgumentException("No printer supplied");
        }
    }

    /* renamed from: Y */
    private Object m25409Y() {
        Object obj = this.f18851b;
        if (obj == null) {
            if (this.f18850a.size() == 2) {
                Object obj2 = this.f18850a.get(0);
                Object obj3 = this.f18850a.get(1);
                if (obj2 == null) {
                    obj = obj3;
                } else if (obj2 == obj3 || obj3 == null) {
                    obj = obj2;
                }
            }
            if (obj == null) {
                obj = new C10187b(this.f18850a);
            }
            this.f18851b = obj;
        }
        return obj;
    }

    /* renamed from: Z */
    private boolean m25410Z(Object obj) {
        return m25412b0(obj) || m25411a0(obj);
    }

    /* renamed from: a0 */
    private boolean m25411a0(Object obj) {
        if (!(obj instanceof C10200b)) {
            return false;
        }
        if (obj instanceof C10187b) {
            return ((C10187b) obj).mo41426c();
        }
        return true;
    }

    /* renamed from: b0 */
    private boolean m25412b0(Object obj) {
        if (!(obj instanceof C10204d)) {
            return false;
        }
        if (obj instanceof C10187b) {
            return ((C10187b) obj).mo41427d();
        }
        return true;
    }

    /* renamed from: c0 */
    static void m25413c0(Writer writer, int i) {
        while (true) {
            i--;
            if (i >= 0) {
                writer.write(65533);
            } else {
                return;
            }
        }
    }

    /* renamed from: d */
    private DateTimeFormatterBuilder m25414d(Object obj) {
        this.f18851b = null;
        this.f18850a.add(obj);
        this.f18850a.add(obj);
        return this;
    }

    /* renamed from: e */
    private DateTimeFormatterBuilder m25415e(C10204d dVar, C10200b bVar) {
        this.f18851b = null;
        this.f18850a.add(dVar);
        this.f18850a.add(bVar);
        return this;
    }

    /* renamed from: A */
    public DateTimeFormatterBuilder mo41372A(int i) {
        return mo41406n(DateTimeFieldType.minuteOfHour(), i, 2);
    }

    /* renamed from: B */
    public DateTimeFormatterBuilder mo41373B(int i) {
        return mo41406n(DateTimeFieldType.monthOfYear(), i, 2);
    }

    /* renamed from: C */
    public DateTimeFormatterBuilder mo41374C() {
        return mo41378G(DateTimeFieldType.monthOfYear());
    }

    /* renamed from: D */
    public DateTimeFormatterBuilder mo41375D() {
        return mo41380I(DateTimeFieldType.monthOfYear());
    }

    /* renamed from: E */
    public DateTimeFormatterBuilder mo41376E(C10200b bVar) {
        m25407W(bVar);
        return m25415e((C10204d) null, new C10190e(new C10200b[]{bVar, null}));
    }

    /* renamed from: F */
    public DateTimeFormatterBuilder mo41377F(int i) {
        return mo41406n(DateTimeFieldType.secondOfMinute(), i, 2);
    }

    /* renamed from: G */
    public DateTimeFormatterBuilder mo41378G(DateTimeFieldType dateTimeFieldType) {
        if (dateTimeFieldType != null) {
            return m25414d(new C10194i(dateTimeFieldType, true));
        }
        throw new IllegalArgumentException("Field type must not be null");
    }

    /* renamed from: H */
    public DateTimeFormatterBuilder mo41379H(DateTimeFieldType dateTimeFieldType, int i, int i2) {
        if (dateTimeFieldType != null) {
            if (i2 < i) {
                i2 = i;
            }
            if (i >= 0 && i2 > 0) {
                return i <= 1 ? m25414d(new C10198m(dateTimeFieldType, i2, true)) : m25414d(new C10192g(dateTimeFieldType, i2, true, i));
            }
            throw new IllegalArgumentException();
        }
        throw new IllegalArgumentException("Field type must not be null");
    }

    /* renamed from: I */
    public DateTimeFormatterBuilder mo41380I(DateTimeFieldType dateTimeFieldType) {
        if (dateTimeFieldType != null) {
            return m25414d(new C10194i(dateTimeFieldType, false));
        }
        throw new IllegalArgumentException("Field type must not be null");
    }

    /* renamed from: J */
    public DateTimeFormatterBuilder mo41381J() {
        TimeZoneId timeZoneId = TimeZoneId.INSTANCE;
        return m25415e(timeZoneId, timeZoneId);
    }

    /* renamed from: K */
    public DateTimeFormatterBuilder mo41382K() {
        return m25415e(new C10195j(0, (Map<String, DateTimeZone>) null), (C10200b) null);
    }

    /* renamed from: L */
    public DateTimeFormatterBuilder mo41383L(String str, String str2, boolean z, int i, int i2) {
        return m25414d(new C10196k(str, str2, z, i, i2));
    }

    /* renamed from: M */
    public DateTimeFormatterBuilder mo41384M(String str, boolean z, int i, int i2) {
        return m25414d(new C10196k(str, str, z, i, i2));
    }

    /* renamed from: N */
    public DateTimeFormatterBuilder mo41385N(Map<String, DateTimeZone> map) {
        C10195j jVar = new C10195j(1, map);
        return m25415e(jVar, jVar);
    }

    /* renamed from: O */
    public DateTimeFormatterBuilder mo41386O(int i, boolean z) {
        return m25414d(new C10197l(DateTimeFieldType.weekyear(), i, z));
    }

    /* renamed from: P */
    public DateTimeFormatterBuilder mo41387P(int i, boolean z) {
        return m25414d(new C10197l(DateTimeFieldType.year(), i, z));
    }

    /* renamed from: R */
    public DateTimeFormatterBuilder mo41388R(int i) {
        return mo41406n(DateTimeFieldType.weekOfWeekyear(), i, 2);
    }

    /* renamed from: S */
    public DateTimeFormatterBuilder mo41389S(int i, int i2) {
        return mo41379H(DateTimeFieldType.weekyear(), i, i2);
    }

    /* renamed from: T */
    public DateTimeFormatterBuilder mo41390T(int i, int i2) {
        return mo41379H(DateTimeFieldType.year(), i, i2);
    }

    /* renamed from: U */
    public DateTimeFormatterBuilder mo41391U(int i, int i2) {
        return mo41406n(DateTimeFieldType.yearOfEra(), i, i2);
    }

    /* renamed from: V */
    public boolean mo41392V() {
        return m25410Z(m25409Y());
    }

    /* renamed from: a */
    public DateTimeFormatterBuilder mo41393a(C10199a aVar) {
        if (aVar != null) {
            return m25415e(aVar.mo41431c(), aVar.mo41430b());
        }
        throw new IllegalArgumentException("No formatter supplied");
    }

    /* renamed from: b */
    public DateTimeFormatterBuilder mo41394b(C10200b bVar) {
        m25407W(bVar);
        return m25415e((C10204d) null, bVar);
    }

    /* renamed from: c */
    public DateTimeFormatterBuilder mo41395c(C10204d dVar, C10200b[] bVarArr) {
        C10190e eVar;
        if (dVar != null) {
            m25408X(dVar);
        }
        if (bVarArr != null) {
            int length = bVarArr.length;
            int i = 0;
            if (length != 1) {
                C10200b[] bVarArr2 = new C10200b[length];
                while (i < length - 1) {
                    C10200b bVar = bVarArr[i];
                    bVarArr2[i] = bVar;
                    if (bVar != null) {
                        i++;
                    } else {
                        throw new IllegalArgumentException("Incomplete parser array");
                    }
                }
                bVarArr2[i] = bVarArr[i];
                eVar = new C10190e(bVarArr2);
            } else if (bVarArr[0] != null) {
                eVar = bVarArr[0];
            } else {
                throw new IllegalArgumentException("No parser supplied");
            }
            return m25415e(dVar, eVar);
        }
        throw new IllegalArgumentException("No parsers supplied");
    }

    /* renamed from: d0 */
    public C10199a mo41396d0() {
        Object Y = m25409Y();
        C10200b bVar = null;
        C10204d dVar = m25412b0(Y) ? (C10204d) Y : null;
        if (m25411a0(Y)) {
            bVar = (C10200b) Y;
        }
        if (dVar != null || bVar != null) {
            return new C10199a(dVar, bVar);
        }
        throw new UnsupportedOperationException("Both printing and parsing not supported");
    }

    /* renamed from: e0 */
    public C10200b mo41397e0() {
        Object Y = m25409Y();
        if (m25411a0(Y)) {
            return (C10200b) Y;
        }
        throw new UnsupportedOperationException("Parsing is not supported");
    }

    /* renamed from: f */
    public DateTimeFormatterBuilder mo41398f(int i, int i2) {
        return mo41379H(DateTimeFieldType.centuryOfEra(), i, i2);
    }

    /* renamed from: g */
    public DateTimeFormatterBuilder mo41399g(int i) {
        return mo41406n(DateTimeFieldType.clockhourOfDay(), i, 2);
    }

    /* renamed from: h */
    public DateTimeFormatterBuilder mo41400h(int i) {
        return mo41406n(DateTimeFieldType.clockhourOfHalfday(), i, 2);
    }

    /* renamed from: i */
    public DateTimeFormatterBuilder mo41401i(int i) {
        return mo41406n(DateTimeFieldType.dayOfMonth(), i, 2);
    }

    /* renamed from: j */
    public DateTimeFormatterBuilder mo41402j(int i) {
        return mo41406n(DateTimeFieldType.dayOfWeek(), i, 1);
    }

    /* renamed from: k */
    public DateTimeFormatterBuilder mo41403k() {
        return mo41378G(DateTimeFieldType.dayOfWeek());
    }

    /* renamed from: l */
    public DateTimeFormatterBuilder mo41404l() {
        return mo41380I(DateTimeFieldType.dayOfWeek());
    }

    /* renamed from: m */
    public DateTimeFormatterBuilder mo41405m(int i) {
        return mo41406n(DateTimeFieldType.dayOfYear(), i, 3);
    }

    /* renamed from: n */
    public DateTimeFormatterBuilder mo41406n(DateTimeFieldType dateTimeFieldType, int i, int i2) {
        if (dateTimeFieldType != null) {
            if (i2 < i) {
                i2 = i;
            }
            if (i >= 0 && i2 > 0) {
                return i <= 1 ? m25414d(new C10198m(dateTimeFieldType, i2, false)) : m25414d(new C10192g(dateTimeFieldType, i2, false, i));
            }
            throw new IllegalArgumentException();
        }
        throw new IllegalArgumentException("Field type must not be null");
    }

    /* renamed from: o */
    public DateTimeFormatterBuilder mo41407o() {
        return mo41380I(DateTimeFieldType.era());
    }

    /* renamed from: p */
    public DateTimeFormatterBuilder mo41408p(DateTimeFieldType dateTimeFieldType, int i) {
        if (dateTimeFieldType == null) {
            throw new IllegalArgumentException("Field type must not be null");
        } else if (i > 0) {
            return m25414d(new C10188c(dateTimeFieldType, i, false));
        } else {
            throw new IllegalArgumentException("Illegal number of digits: " + i);
        }
    }

    /* renamed from: q */
    public DateTimeFormatterBuilder mo41409q(DateTimeFieldType dateTimeFieldType, int i, int i2) {
        if (dateTimeFieldType != null) {
            if (i2 < i) {
                i2 = i;
            }
            if (i >= 0 && i2 > 0) {
                return m25414d(new C10189d(dateTimeFieldType, i, i2));
            }
            throw new IllegalArgumentException();
        }
        throw new IllegalArgumentException("Field type must not be null");
    }

    /* renamed from: r */
    public DateTimeFormatterBuilder mo41410r(int i, int i2) {
        return mo41409q(DateTimeFieldType.hourOfDay(), i, i2);
    }

    /* renamed from: s */
    public DateTimeFormatterBuilder mo41411s(int i, int i2) {
        return mo41409q(DateTimeFieldType.minuteOfDay(), i, i2);
    }

    /* renamed from: t */
    public DateTimeFormatterBuilder mo41412t(int i, int i2) {
        return mo41409q(DateTimeFieldType.secondOfDay(), i, i2);
    }

    /* renamed from: u */
    public DateTimeFormatterBuilder mo41413u() {
        return mo41380I(DateTimeFieldType.halfdayOfDay());
    }

    /* renamed from: v */
    public DateTimeFormatterBuilder mo41414v(int i) {
        return mo41406n(DateTimeFieldType.hourOfDay(), i, 2);
    }

    /* renamed from: w */
    public DateTimeFormatterBuilder mo41415w(int i) {
        return mo41406n(DateTimeFieldType.hourOfHalfday(), i, 2);
    }

    /* renamed from: x */
    public DateTimeFormatterBuilder mo41416x(char c) {
        return m25414d(new C10186a(c));
    }

    /* renamed from: y */
    public DateTimeFormatterBuilder mo41417y(String str) {
        if (str != null) {
            int length = str.length();
            if (length == 0) {
                return this;
            }
            return m25414d(length != 1 ? new C10193h(str) : new C10186a(str.charAt(0)));
        }
        throw new IllegalArgumentException("Literal must not be null");
    }

    /* renamed from: z */
    public DateTimeFormatterBuilder mo41418z(int i) {
        return mo41406n(DateTimeFieldType.millisOfSecond(), i, 3);
    }
}
