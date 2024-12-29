package org.joda.time.format;

import androidx.appcompat.widget.ActivityChooserView;
import androidx.core.location.LocationRequestCompat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.TreeSet;
import org.apache.commons.p194io.FilenameUtils;
import org.joda.time.C10174f;
import org.joda.time.C10225l;
import org.joda.time.DurationFieldType;
import org.joda.time.PeriodType;

/* renamed from: org.joda.time.format.i */
public class C10210i {

    /* renamed from: a */
    private int f18973a;

    /* renamed from: b */
    private int f18974b;

    /* renamed from: c */
    private int f18975c;

    /* renamed from: d */
    private boolean f18976d;

    /* renamed from: e */
    private C10215e f18977e;

    /* renamed from: f */
    private List<Object> f18978f;

    /* renamed from: g */
    private boolean f18979g;

    /* renamed from: h */
    private boolean f18980h;

    /* renamed from: i */
    private C10213c[] f18981i;

    /* renamed from: org.joda.time.format.i$a */
    static class C10211a implements C10219k, C10218j {

        /* renamed from: a */
        private final C10219k[] f18982a;

        /* renamed from: b */
        private final C10218j[] f18983b;

        C10211a(List<Object> list) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            m25659f(list, arrayList, arrayList2);
            if (arrayList.size() <= 0) {
                this.f18982a = null;
            } else {
                this.f18982a = (C10219k[]) arrayList.toArray(new C10219k[arrayList.size()]);
            }
            if (arrayList2.size() <= 0) {
                this.f18983b = null;
            } else {
                this.f18983b = (C10218j[]) arrayList2.toArray(new C10218j[arrayList2.size()]);
            }
        }

        /* renamed from: e */
        private void m25658e(List<Object> list, Object[] objArr) {
            if (objArr != null) {
                for (Object add : objArr) {
                    list.add(add);
                }
            }
        }

        /* renamed from: f */
        private void m25659f(List<Object> list, List<Object> list2, List<Object> list3) {
            int size = list.size();
            for (int i = 0; i < size; i += 2) {
                Object obj = list.get(i);
                if (obj instanceof C10219k) {
                    if (obj instanceof C10211a) {
                        m25658e(list2, ((C10211a) obj).f18982a);
                    } else {
                        list2.add(obj);
                    }
                }
                Object obj2 = list.get(i + 1);
                if (obj2 instanceof C10218j) {
                    if (obj2 instanceof C10211a) {
                        m25658e(list3, ((C10211a) obj2).f18983b);
                    } else {
                        list3.add(obj2);
                    }
                }
            }
        }

        /* renamed from: a */
        public void mo41484a(StringBuffer stringBuffer, C10225l lVar, Locale locale) {
            for (C10219k a : this.f18982a) {
                a.mo41484a(stringBuffer, lVar, locale);
            }
        }

        /* renamed from: b */
        public int mo41485b(C10225l lVar, Locale locale) {
            C10219k[] kVarArr = this.f18982a;
            int length = kVarArr.length;
            int i = 0;
            while (true) {
                length--;
                if (length < 0) {
                    return i;
                }
                i += kVarArr[length].mo41485b(lVar, locale);
            }
        }

        /* renamed from: c */
        public int mo41486c(C10174f fVar, String str, int i, Locale locale) {
            C10218j[] jVarArr = this.f18983b;
            if (jVarArr != null) {
                int length = jVarArr.length;
                for (int i2 = 0; i2 < length && i >= 0; i2++) {
                    i = jVarArr[i2].mo41486c(fVar, str, i, locale);
                }
                return i;
            }
            throw new UnsupportedOperationException();
        }

        /* renamed from: d */
        public int mo41487d(C10225l lVar, int i, Locale locale) {
            C10219k[] kVarArr = this.f18982a;
            int length = kVarArr.length;
            int i2 = 0;
            while (i2 < i) {
                length--;
                if (length < 0) {
                    break;
                }
                i2 += kVarArr[length].mo41487d(lVar, ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED, locale);
            }
            return i2;
        }
    }

    /* renamed from: org.joda.time.format.i$b */
    static class C10212b implements C10215e {

        /* renamed from: a */
        private final C10215e f18984a;

        /* renamed from: b */
        private final C10215e f18985b;

        C10212b(C10215e eVar, C10215e eVar2) {
            this.f18984a = eVar;
            this.f18985b = eVar2;
        }

        /* renamed from: a */
        public int mo41488a(String str, int i) {
            int a = this.f18984a.mo41488a(str, i);
            return a >= 0 ? this.f18985b.mo41488a(str, a) : i ^ -1;
        }

        /* renamed from: b */
        public int mo41489b(int i) {
            return this.f18984a.mo41489b(i) + this.f18985b.mo41489b(i);
        }

        /* renamed from: c */
        public int mo41490c(String str, int i) {
            int c = this.f18984a.mo41490c(str, i);
            return c >= 0 ? this.f18985b.mo41490c(str, c) : c;
        }

        /* renamed from: d */
        public void mo41491d(StringBuffer stringBuffer, int i) {
            this.f18984a.mo41491d(stringBuffer, i);
            this.f18985b.mo41491d(stringBuffer, i);
        }
    }

    /* renamed from: org.joda.time.format.i$c */
    static class C10213c implements C10219k, C10218j {

        /* renamed from: a */
        private final int f18986a;

        /* renamed from: b */
        private final int f18987b;

        /* renamed from: c */
        private final int f18988c;

        /* renamed from: d */
        private final boolean f18989d;

        /* renamed from: e */
        private final int f18990e;

        /* renamed from: f */
        private final C10213c[] f18991f;

        /* renamed from: g */
        private final C10215e f18992g;

        /* renamed from: h */
        private final C10215e f18993h;

        C10213c(int i, int i2, int i3, boolean z, int i4, C10213c[] cVarArr, C10215e eVar, C10215e eVar2) {
            this.f18986a = i;
            this.f18987b = i2;
            this.f18988c = i3;
            this.f18989d = z;
            this.f18990e = i4;
            this.f18991f = cVarArr;
            this.f18992g = eVar;
            this.f18993h = eVar2;
        }

        C10213c(C10213c cVar, C10215e eVar) {
            this.f18986a = cVar.f18986a;
            this.f18987b = cVar.f18987b;
            this.f18988c = cVar.f18988c;
            this.f18989d = cVar.f18989d;
            this.f18990e = cVar.f18990e;
            this.f18991f = cVar.f18991f;
            this.f18992g = cVar.f18992g;
            C10215e eVar2 = cVar.f18993h;
            this.f18993h = eVar2 != null ? new C10212b(eVar2, eVar) : eVar;
        }

        /* renamed from: i */
        private int m25668i(String str, int i, int i2) {
            if (i2 >= 10) {
                return Integer.parseInt(str.substring(i, i2 + i));
            }
            boolean z = false;
            if (i2 <= 0) {
                return 0;
            }
            int i3 = i + 1;
            char charAt = str.charAt(i);
            int i4 = i2 - 1;
            if (charAt == '-') {
                i4--;
                if (i4 < 0) {
                    return 0;
                }
                char charAt2 = str.charAt(i3);
                i3++;
                charAt = charAt2;
                z = true;
            }
            int i5 = charAt - '0';
            while (true) {
                int i6 = i4 - 1;
                if (i4 <= 0) {
                    break;
                }
                i3++;
                i5 = (((i5 << 3) + (i5 << 1)) + str.charAt(i3)) - 48;
                i4 = i6;
            }
            return z ? -i5 : i5;
        }

        /* renamed from: a */
        public void mo41484a(StringBuffer stringBuffer, C10225l lVar, Locale locale) {
            long f = mo41493f(lVar);
            if (f != LocationRequestCompat.PASSIVE_INTERVAL) {
                int i = (int) f;
                if (this.f18990e >= 8) {
                    i = (int) (f / 1000);
                }
                C10215e eVar = this.f18992g;
                if (eVar != null) {
                    eVar.mo41491d(stringBuffer, i);
                }
                int length = stringBuffer.length();
                int i2 = this.f18986a;
                if (i2 <= 1) {
                    C10205e.m25527b(stringBuffer, i);
                } else {
                    C10205e.m25526a(stringBuffer, i, i2);
                }
                if (this.f18990e >= 8) {
                    int abs = (int) (Math.abs(f) % 1000);
                    if (this.f18990e == 8 || abs > 0) {
                        if (f < 0 && f > -1000) {
                            stringBuffer.insert(length, '-');
                        }
                        stringBuffer.append(FilenameUtils.EXTENSION_SEPARATOR);
                        C10205e.m25526a(stringBuffer, abs, 3);
                    }
                }
                C10215e eVar2 = this.f18993h;
                if (eVar2 != null) {
                    eVar2.mo41491d(stringBuffer, i);
                }
            }
        }

        /* renamed from: b */
        public int mo41485b(C10225l lVar, Locale locale) {
            long f = mo41493f(lVar);
            if (f == LocationRequestCompat.PASSIVE_INTERVAL) {
                return 0;
            }
            int max = Math.max(C10205e.m25529d(f), this.f18986a);
            if (this.f18990e >= 8) {
                max = Math.max(max, f < 0 ? 5 : 4) + 1;
                if (this.f18990e == 9 && Math.abs(f) % 1000 == 0) {
                    max -= 4;
                }
                f /= 1000;
            }
            int i = (int) f;
            C10215e eVar = this.f18992g;
            if (eVar != null) {
                max += eVar.mo41489b(i);
            }
            C10215e eVar2 = this.f18993h;
            return eVar2 != null ? max + eVar2.mo41489b(i) : max;
        }

        /* JADX WARNING: Removed duplicated region for block: B:108:0x0133  */
        /* JADX WARNING: Removed duplicated region for block: B:122:? A[RETURN, SYNTHETIC] */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int mo41486c(org.joda.time.C10174f r17, java.lang.String r18, int r19, java.util.Locale r20) {
            /*
                r16 = this;
                r0 = r16
                r1 = r17
                r2 = r18
                r3 = r19
                int r4 = r0.f18987b
                r7 = 4
                if (r4 != r7) goto L_0x000f
                r4 = 1
                goto L_0x0010
            L_0x000f:
                r4 = 0
            L_0x0010:
                int r7 = r18.length()
                if (r3 < r7) goto L_0x001d
                if (r4 == 0) goto L_0x001b
                r1 = r3 ^ -1
                goto L_0x001c
            L_0x001b:
                r1 = r3
            L_0x001c:
                return r1
            L_0x001d:
                org.joda.time.format.i$e r7 = r0.f18992g
                r8 = -1
                if (r7 == 0) goto L_0x0030
                int r3 = r7.mo41490c(r2, r3)
                if (r3 < 0) goto L_0x002a
                r4 = 1
                goto L_0x0030
            L_0x002a:
                if (r4 != 0) goto L_0x002f
                r1 = r3 ^ -1
                return r1
            L_0x002f:
                return r3
            L_0x0030:
                org.joda.time.format.i$e r7 = r0.f18993h
                if (r7 == 0) goto L_0x0044
                if (r4 != 0) goto L_0x0044
                int r7 = r7.mo41488a(r2, r3)
                if (r7 < 0) goto L_0x003e
                r4 = 1
                goto L_0x0045
            L_0x003e:
                if (r4 != 0) goto L_0x0043
                r1 = r7 ^ -1
                return r1
            L_0x0043:
                return r7
            L_0x0044:
                r7 = -1
            L_0x0045:
                if (r4 != 0) goto L_0x0054
                org.joda.time.PeriodType r4 = r17.getPeriodType()
                int r9 = r0.f18990e
                boolean r4 = r0.mo41494g(r4, r9)
                if (r4 != 0) goto L_0x0054
                return r3
            L_0x0054:
                int r4 = r0.f18988c
                if (r7 <= 0) goto L_0x005b
                int r9 = r7 - r3
                goto L_0x0060
            L_0x005b:
                int r9 = r18.length()
                int r9 = r9 - r3
            L_0x0060:
                int r4 = java.lang.Math.min(r4, r9)
                r9 = 0
                r10 = -1
                r11 = 0
            L_0x0067:
                r13 = 8
                if (r9 >= r4) goto L_0x00d3
                int r14 = r3 + r9
                char r15 = r2.charAt(r14)
                r6 = 57
                r5 = 48
                if (r9 != 0) goto L_0x00a9
                r8 = 45
                if (r15 == r8) goto L_0x007f
                r12 = 43
                if (r15 != r12) goto L_0x00a9
            L_0x007f:
                boolean r12 = r0.f18989d
                if (r12 != 0) goto L_0x00a9
                if (r15 != r8) goto L_0x0087
                r8 = 1
                goto L_0x0088
            L_0x0087:
                r8 = 0
            L_0x0088:
                int r12 = r9 + 1
                if (r12 >= r4) goto L_0x00d3
                int r14 = r14 + 1
                char r14 = r2.charAt(r14)
                if (r14 < r5) goto L_0x00d3
                if (r14 <= r6) goto L_0x0097
                goto L_0x00d3
            L_0x0097:
                if (r8 == 0) goto L_0x009b
                r9 = r12
                goto L_0x009d
            L_0x009b:
                int r3 = r3 + 1
            L_0x009d:
                int r4 = r4 + 1
                int r5 = r18.length()
                int r5 = r5 - r3
                int r4 = java.lang.Math.min(r4, r5)
                goto L_0x00d1
            L_0x00a9:
                if (r15 < r5) goto L_0x00af
                if (r15 > r6) goto L_0x00af
                r11 = 1
                goto L_0x00cf
            L_0x00af:
                r5 = 46
                if (r15 == r5) goto L_0x00b7
                r5 = 44
                if (r15 != r5) goto L_0x00d3
            L_0x00b7:
                int r5 = r0.f18990e
                if (r5 == r13) goto L_0x00bf
                r6 = 9
                if (r5 != r6) goto L_0x00d3
            L_0x00bf:
                if (r10 < 0) goto L_0x00c2
                goto L_0x00d3
            L_0x00c2:
                int r10 = r14 + 1
                int r4 = r4 + 1
                int r5 = r18.length()
                int r5 = r5 - r3
                int r4 = java.lang.Math.min(r4, r5)
            L_0x00cf:
                int r9 = r9 + 1
            L_0x00d1:
                r8 = -1
                goto L_0x0067
            L_0x00d3:
                if (r11 != 0) goto L_0x00d9
                r4 = -1
                r1 = r3 ^ -1
                return r1
            L_0x00d9:
                if (r7 < 0) goto L_0x00e0
                int r4 = r3 + r9
                if (r4 == r7) goto L_0x00e0
                return r3
            L_0x00e0:
                int r4 = r0.f18990e
                if (r4 == r13) goto L_0x00f0
                r5 = 9
                if (r4 == r5) goto L_0x00f0
                int r5 = r0.m25668i(r2, r3, r9)
            L_0x00ec:
                r0.mo41496j(r1, r4, r5)
                goto L_0x012c
            L_0x00f0:
                r4 = 7
                r5 = 6
                if (r10 >= 0) goto L_0x0100
                int r6 = r0.m25668i(r2, r3, r9)
                r0.mo41496j(r1, r5, r6)
                r6 = 0
                r0.mo41496j(r1, r4, r6)
                goto L_0x012c
            L_0x0100:
                r6 = 0
                int r7 = r10 - r3
                r8 = 1
                int r7 = r7 - r8
                int r7 = r0.m25668i(r2, r3, r7)
                r0.mo41496j(r1, r5, r7)
                int r5 = r3 + r9
                int r5 = r5 - r10
                if (r5 > 0) goto L_0x0113
                r5 = 0
                goto L_0x00ec
            L_0x0113:
                r6 = 3
                if (r5 < r6) goto L_0x011b
                int r5 = r0.m25668i(r2, r10, r6)
                goto L_0x0128
            L_0x011b:
                int r6 = r0.m25668i(r2, r10, r5)
                r8 = 1
                if (r5 != r8) goto L_0x0125
                int r6 = r6 * 100
                goto L_0x0127
            L_0x0125:
                int r6 = r6 * 10
            L_0x0127:
                r5 = r6
            L_0x0128:
                if (r7 >= 0) goto L_0x00ec
                int r5 = -r5
                goto L_0x00ec
            L_0x012c:
                int r3 = r3 + r9
                if (r3 < 0) goto L_0x0137
                org.joda.time.format.i$e r1 = r0.f18993h
                if (r1 == 0) goto L_0x0137
                int r3 = r1.mo41490c(r2, r3)
            L_0x0137:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: org.joda.time.format.C10210i.C10213c.mo41486c(org.joda.time.f, java.lang.String, int, java.util.Locale):int");
        }

        /* renamed from: d */
        public int mo41487d(C10225l lVar, int i, Locale locale) {
            if (i <= 0) {
                return 0;
            }
            return (this.f18987b == 4 || mo41493f(lVar) != LocationRequestCompat.PASSIVE_INTERVAL) ? 1 : 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public int mo41492e() {
            return this.f18990e;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public long mo41493f(C10225l lVar) {
            long j;
            DurationFieldType durationFieldType;
            PeriodType periodType = this.f18987b == 4 ? null : lVar.getPeriodType();
            if (periodType != null && !mo41494g(periodType, this.f18990e)) {
                return LocationRequestCompat.PASSIVE_INTERVAL;
            }
            switch (this.f18990e) {
                case 0:
                    durationFieldType = DurationFieldType.years();
                    break;
                case 1:
                    durationFieldType = DurationFieldType.months();
                    break;
                case 2:
                    durationFieldType = DurationFieldType.weeks();
                    break;
                case 3:
                    durationFieldType = DurationFieldType.days();
                    break;
                case 4:
                    durationFieldType = DurationFieldType.hours();
                    break;
                case 5:
                    durationFieldType = DurationFieldType.minutes();
                    break;
                case 6:
                    durationFieldType = DurationFieldType.seconds();
                    break;
                case 7:
                    durationFieldType = DurationFieldType.millis();
                    break;
                case 8:
                case 9:
                    j = (((long) lVar.get(DurationFieldType.seconds())) * 1000) + ((long) lVar.get(DurationFieldType.millis()));
                    break;
                default:
                    return LocationRequestCompat.PASSIVE_INTERVAL;
            }
            j = (long) lVar.get(durationFieldType);
            if (j == 0) {
                int i = this.f18987b;
                if (i == 1) {
                    if (mo41495h(lVar)) {
                        C10213c[] cVarArr = this.f18991f;
                        int i2 = this.f18990e;
                        if (cVarArr[i2] == this) {
                            int min = Math.min(i2, 8);
                            while (true) {
                                min--;
                                if (min >= 0 && min <= 9) {
                                    if (!mo41494g(periodType, min) || this.f18991f[min] == null) {
                                    }
                                }
                            }
                        }
                    }
                    return LocationRequestCompat.PASSIVE_INTERVAL;
                } else if (i != 2) {
                    return i != 5 ? j : LocationRequestCompat.PASSIVE_INTERVAL;
                } else {
                    if (mo41495h(lVar)) {
                        C10213c[] cVarArr2 = this.f18991f;
                        int i3 = this.f18990e;
                        if (cVarArr2[i3] == this) {
                            for (int i4 = i3 + 1; i4 <= 9; i4++) {
                                if (mo41494g(periodType, i4) && this.f18991f[i4] != null) {
                                    return LocationRequestCompat.PASSIVE_INTERVAL;
                                }
                            }
                        }
                    }
                    return LocationRequestCompat.PASSIVE_INTERVAL;
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public boolean mo41494g(PeriodType periodType, int i) {
            DurationFieldType years;
            switch (i) {
                case 0:
                    years = DurationFieldType.years();
                    break;
                case 1:
                    years = DurationFieldType.months();
                    break;
                case 2:
                    years = DurationFieldType.weeks();
                    break;
                case 3:
                    years = DurationFieldType.days();
                    break;
                case 4:
                    years = DurationFieldType.hours();
                    break;
                case 5:
                    years = DurationFieldType.minutes();
                    break;
                case 6:
                    years = DurationFieldType.seconds();
                    break;
                case 7:
                    years = DurationFieldType.millis();
                    break;
                case 8:
                case 9:
                    return periodType.isSupported(DurationFieldType.seconds()) || periodType.isSupported(DurationFieldType.millis());
                default:
                    return false;
            }
            return periodType.isSupported(years);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public boolean mo41495h(C10225l lVar) {
            int size = lVar.size();
            for (int i = 0; i < size; i++) {
                if (lVar.getValue(i) != 0) {
                    return false;
                }
            }
            return true;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public void mo41496j(C10174f fVar, int i, int i2) {
            switch (i) {
                case 0:
                    fVar.setYears(i2);
                    return;
                case 1:
                    fVar.setMonths(i2);
                    return;
                case 2:
                    fVar.setWeeks(i2);
                    return;
                case 3:
                    fVar.setDays(i2);
                    return;
                case 4:
                    fVar.setHours(i2);
                    return;
                case 5:
                    fVar.setMinutes(i2);
                    return;
                case 6:
                    fVar.setSeconds(i2);
                    return;
                case 7:
                    fVar.setMillis(i2);
                    return;
                default:
                    return;
            }
        }
    }

    /* renamed from: org.joda.time.format.i$d */
    static class C10214d implements C10219k, C10218j {

        /* renamed from: b */
        static final C10214d f18994b = new C10214d("");

        /* renamed from: a */
        private final String f18995a;

        C10214d(String str) {
            this.f18995a = str;
        }

        /* renamed from: a */
        public void mo41484a(StringBuffer stringBuffer, C10225l lVar, Locale locale) {
            stringBuffer.append(this.f18995a);
        }

        /* renamed from: b */
        public int mo41485b(C10225l lVar, Locale locale) {
            return this.f18995a.length();
        }

        /* renamed from: c */
        public int mo41486c(C10174f fVar, String str, int i, Locale locale) {
            String str2 = this.f18995a;
            return str.regionMatches(true, i, str2, 0, str2.length()) ? i + this.f18995a.length() : i ^ -1;
        }

        /* renamed from: d */
        public int mo41487d(C10225l lVar, int i, Locale locale) {
            return 0;
        }
    }

    /* renamed from: org.joda.time.format.i$e */
    interface C10215e {
        /* renamed from: a */
        int mo41488a(String str, int i);

        /* renamed from: b */
        int mo41489b(int i);

        /* renamed from: c */
        int mo41490c(String str, int i);

        /* renamed from: d */
        void mo41491d(StringBuffer stringBuffer, int i);
    }

    /* renamed from: org.joda.time.format.i$f */
    static class C10216f implements C10219k, C10218j {

        /* renamed from: a */
        private final String f18996a;

        /* renamed from: b */
        private final String f18997b;

        /* renamed from: c */
        private final String[] f18998c;

        /* renamed from: d */
        private final boolean f18999d;

        /* renamed from: e */
        private final boolean f19000e;

        /* renamed from: f */
        private final C10219k f19001f;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public volatile C10219k f19002g;

        /* renamed from: h */
        private final C10218j f19003h;
        /* access modifiers changed from: private */

        /* renamed from: i */
        public volatile C10218j f19004i;

        C10216f(String str, String str2, String[] strArr, C10219k kVar, C10218j jVar, boolean z, boolean z2) {
            this.f18996a = str;
            this.f18997b = str2;
            if ((str2 == null || str.equals(str2)) && (strArr == null || strArr.length == 0)) {
                this.f18998c = new String[]{str};
            } else {
                TreeSet treeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
                treeSet.add(str);
                treeSet.add(str2);
                if (strArr != null) {
                    int length = strArr.length;
                    while (true) {
                        length--;
                        if (length < 0) {
                            break;
                        }
                        treeSet.add(strArr[length]);
                    }
                }
                ArrayList arrayList = new ArrayList(treeSet);
                Collections.reverse(arrayList);
                this.f18998c = (String[]) arrayList.toArray(new String[arrayList.size()]);
            }
            this.f19001f = kVar;
            this.f19003h = jVar;
            this.f18999d = z;
            this.f19000e = z2;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:13:0x002b, code lost:
            if (r1.mo41487d(r6, 1, r7) > 0) goto L_0x002d;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo41484a(java.lang.StringBuffer r5, org.joda.time.C10225l r6, java.util.Locale r7) {
            /*
                r4 = this;
                org.joda.time.format.k r0 = r4.f19001f
                org.joda.time.format.k r1 = r4.f19002g
                r0.mo41484a(r5, r6, r7)
                boolean r2 = r4.f18999d
                r3 = 1
                if (r2 == 0) goto L_0x0023
                int r0 = r0.mo41487d(r6, r3, r7)
                if (r0 <= 0) goto L_0x0032
                boolean r0 = r4.f19000e
                if (r0 == 0) goto L_0x002d
                r0 = 2
                int r0 = r1.mo41487d(r6, r0, r7)
                if (r0 <= 0) goto L_0x0032
                if (r0 <= r3) goto L_0x0020
                goto L_0x002d
            L_0x0020:
                java.lang.String r0 = r4.f18997b
                goto L_0x002f
            L_0x0023:
                boolean r0 = r4.f19000e
                if (r0 == 0) goto L_0x0032
                int r0 = r1.mo41487d(r6, r3, r7)
                if (r0 <= 0) goto L_0x0032
            L_0x002d:
                java.lang.String r0 = r4.f18996a
            L_0x002f:
                r5.append(r0)
            L_0x0032:
                r1.mo41484a(r5, r6, r7)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: org.joda.time.format.C10210i.C10216f.mo41484a(java.lang.StringBuffer, org.joda.time.l, java.util.Locale):void");
        }

        /* renamed from: b */
        public int mo41485b(C10225l lVar, Locale locale) {
            String str;
            C10219k kVar = this.f19001f;
            C10219k kVar2 = this.f19002g;
            int b = kVar.mo41485b(lVar, locale) + kVar2.mo41485b(lVar, locale);
            if (this.f18999d) {
                if (kVar.mo41487d(lVar, 1, locale) <= 0) {
                    return b;
                }
                if (this.f19000e) {
                    int d = kVar2.mo41487d(lVar, 2, locale);
                    if (d <= 0) {
                        return b;
                    }
                    if (d <= 1) {
                        str = this.f18997b;
                        return b + str.length();
                    }
                }
            } else if (!this.f19000e || kVar2.mo41487d(lVar, 1, locale) <= 0) {
                return b;
            }
            str = this.f18996a;
            return b + str.length();
        }

        /* JADX WARNING: Removed duplicated region for block: B:20:0x0051 A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x0052  */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int mo41486c(org.joda.time.C10174f r18, java.lang.String r19, int r20, java.util.Locale r21) {
            /*
                r17 = this;
                r0 = r17
                r1 = r18
                r8 = r19
                r2 = r20
                r9 = r21
                org.joda.time.format.j r3 = r0.f19003h
                int r10 = r3.mo41486c(r1, r8, r2, r9)
                if (r10 >= 0) goto L_0x0013
                return r10
            L_0x0013:
                r11 = -1
                r12 = 0
                if (r10 <= r2) goto L_0x0048
                java.lang.String[] r13 = r0.f18998c
                int r14 = r13.length
                r15 = 0
            L_0x001b:
                if (r15 >= r14) goto L_0x0048
                r16 = r13[r15]
                if (r16 == 0) goto L_0x003c
                int r2 = r16.length()
                if (r2 == 0) goto L_0x003c
                r3 = 1
                r6 = 0
                int r7 = r16.length()
                r2 = r19
                r4 = r10
                r5 = r16
                boolean r2 = r2.regionMatches(r3, r4, r5, r6, r7)
                if (r2 == 0) goto L_0x0039
                goto L_0x003c
            L_0x0039:
                int r15 = r15 + 1
                goto L_0x001b
            L_0x003c:
                if (r16 != 0) goto L_0x003f
                goto L_0x0043
            L_0x003f:
                int r12 = r16.length()
            L_0x0043:
                int r10 = r10 + r12
                r2 = 1
                r2 = r12
                r12 = 1
                goto L_0x0049
            L_0x0048:
                r2 = -1
            L_0x0049:
                org.joda.time.format.j r3 = r0.f19004i
                int r1 = r3.mo41486c(r1, r8, r10, r9)
                if (r1 >= 0) goto L_0x0052
                return r1
            L_0x0052:
                if (r12 == 0) goto L_0x005b
                if (r1 != r10) goto L_0x005b
                if (r2 <= 0) goto L_0x005b
                r1 = r10 ^ -1
                return r1
            L_0x005b:
                if (r1 <= r10) goto L_0x0065
                if (r12 != 0) goto L_0x0065
                boolean r2 = r0.f18999d
                if (r2 != 0) goto L_0x0065
                r1 = r10 ^ -1
            L_0x0065:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: org.joda.time.format.C10210i.C10216f.mo41486c(org.joda.time.f, java.lang.String, int, java.util.Locale):int");
        }

        /* renamed from: d */
        public int mo41487d(C10225l lVar, int i, Locale locale) {
            int d = this.f19001f.mo41487d(lVar, i, locale);
            return d < i ? d + this.f19002g.mo41487d(lVar, i, locale) : d;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public C10216f mo41497g(C10219k kVar, C10218j jVar) {
            this.f19002g = kVar;
            this.f19004i = jVar;
            return this;
        }
    }

    /* renamed from: org.joda.time.format.i$g */
    static class C10217g implements C10215e {

        /* renamed from: a */
        private final String f19005a;

        C10217g(String str) {
            this.f19005a = str;
        }

        /* renamed from: a */
        public int mo41488a(String str, int i) {
            String str2 = this.f19005a;
            int length = str2.length();
            int length2 = str.length();
            int i2 = i;
            while (i2 < length2) {
                if (str.regionMatches(true, i2, str2, 0, length)) {
                    return i2;
                }
                switch (str.charAt(i2)) {
                    case '+':
                    case ',':
                    case '-':
                    case '.':
                    case '0':
                    case '1':
                    case '2':
                    case '3':
                    case '4':
                    case '5':
                    case '6':
                    case '7':
                    case '8':
                    case '9':
                        i2++;
                }
                return i ^ -1;
            }
            return i ^ -1;
        }

        /* renamed from: b */
        public int mo41489b(int i) {
            return this.f19005a.length();
        }

        /* renamed from: c */
        public int mo41490c(String str, int i) {
            String str2 = this.f19005a;
            int length = str2.length();
            return str.regionMatches(true, i, str2, 0, length) ? i + length : i ^ -1;
        }

        /* renamed from: d */
        public void mo41491d(StringBuffer stringBuffer, int i) {
            stringBuffer.append(this.f19005a);
        }
    }

    public C10210i() {
        mo41482p();
    }

    /* renamed from: a */
    private C10210i m25638a(C10219k kVar, C10218j jVar) {
        this.f18978f.add(kVar);
        this.f18978f.add(jVar);
        boolean z = true;
        this.f18979g = (kVar == null) | this.f18979g;
        boolean z2 = this.f18980h;
        if (jVar != null) {
            z = false;
        }
        this.f18980h = z2 | z;
        return this;
    }

    /* renamed from: c */
    private void m25639c(int i) {
        m25640d(i, this.f18973a);
    }

    /* renamed from: d */
    private void m25640d(int i, int i2) {
        C10213c cVar = new C10213c(i2, this.f18974b, this.f18975c, this.f18976d, i, this.f18981i, this.f18977e, (C10215e) null);
        m25638a(cVar, cVar);
        this.f18981i[i] = cVar;
        this.f18977e = null;
    }

    /* renamed from: j */
    private C10210i m25641j(String str, String str2, String[] strArr, boolean z, boolean z2) {
        if (str == null || str2 == null) {
            throw new IllegalArgumentException();
        }
        m25643q();
        List<Object> list = this.f18978f;
        if (list.size() == 0) {
            if (z2 && !z) {
                C10214d dVar = C10214d.f18994b;
                C10216f fVar = new C10216f(str, str2, strArr, dVar, dVar, z, z2);
                m25638a(fVar, fVar);
            }
            return this;
        }
        C10216f fVar2 = null;
        int size = list.size();
        while (true) {
            int i = size - 1;
            if (i < 0) {
                break;
            } else if (list.get(i) instanceof C10216f) {
                fVar2 = (C10216f) list.get(i);
                list = list.subList(i + 1, list.size());
                break;
            } else {
                size = i - 1;
            }
        }
        List<Object> list2 = list;
        if (fVar2 == null || list2.size() != 0) {
            Object[] r = m25644r(list2);
            list2.clear();
            C10216f fVar3 = new C10216f(str, str2, strArr, (C10219k) r[0], (C10218j) r[1], z, z2);
            list2.add(fVar3);
            list2.add(fVar3);
            return this;
        }
        throw new IllegalStateException("Cannot have two adjacent separators");
    }

    /* renamed from: m */
    private C10210i m25642m(C10215e eVar) {
        Object obj;
        Object obj2 = null;
        if (this.f18978f.size() > 0) {
            List<Object> list = this.f18978f;
            obj2 = list.get(list.size() - 2);
            List<Object> list2 = this.f18978f;
            obj = list2.get(list2.size() - 1);
        } else {
            obj = null;
        }
        if (obj2 == null || obj == null || obj2 != obj || !(obj2 instanceof C10213c)) {
            throw new IllegalStateException("No field to apply suffix to");
        }
        m25643q();
        C10213c cVar = new C10213c((C10213c) obj2, eVar);
        List<Object> list3 = this.f18978f;
        list3.set(list3.size() - 2, cVar);
        List<Object> list4 = this.f18978f;
        list4.set(list4.size() - 1, cVar);
        this.f18981i[cVar.mo41492e()] = cVar;
        return this;
    }

    /* renamed from: q */
    private void m25643q() {
        if (this.f18977e == null) {
            this.f18977e = null;
            return;
        }
        throw new IllegalStateException("Prefix not followed by field");
    }

    /* renamed from: r */
    private static Object[] m25644r(List<Object> list) {
        int size = list.size();
        if (size == 0) {
            C10214d dVar = C10214d.f18994b;
            return new Object[]{dVar, dVar};
        } else if (size != 1) {
            C10211a aVar = new C10211a(list);
            return new Object[]{aVar, aVar};
        } else {
            return new Object[]{list.get(0), list.get(1)};
        }
    }

    /* renamed from: t */
    private static C10209h m25645t(List<Object> list, boolean z, boolean z2) {
        C10209h hVar;
        if (!z || !z2) {
            int size = list.size();
            if (size >= 2 && (list.get(0) instanceof C10216f)) {
                C10216f fVar = (C10216f) list.get(0);
                if (fVar.f19004i == null && fVar.f19002g == null) {
                    C10209h t = m25645t(list.subList(2, size), z, z2);
                    C10216f g = fVar.mo41497g(t.mo41466e(), t.mo41465d());
                    return new C10209h(g, g);
                }
            }
            Object[] r = m25644r(list);
            if (z) {
                return new C10209h((C10219k) null, (C10218j) r[1]);
            }
            if (z2) {
                C10219k kVar = (C10219k) r[0];
                return hVar;
            }
            hVar = new C10209h((C10219k) r[0], (C10218j) r[1]);
            return hVar;
        }
        throw new IllegalStateException("Builder has created neither a printer nor a parser");
    }

    /* renamed from: b */
    public C10210i mo41472b() {
        m25639c(3);
        return this;
    }

    /* renamed from: e */
    public C10210i mo41473e() {
        m25639c(4);
        return this;
    }

    /* renamed from: f */
    public C10210i mo41474f(String str) {
        if (str != null) {
            m25643q();
            C10214d dVar = new C10214d(str);
            m25638a(dVar, dVar);
            return this;
        }
        throw new IllegalArgumentException("Literal must not be null");
    }

    /* renamed from: g */
    public C10210i mo41475g() {
        m25639c(5);
        return this;
    }

    /* renamed from: h */
    public C10210i mo41476h() {
        m25639c(1);
        return this;
    }

    /* renamed from: i */
    public C10210i mo41477i() {
        m25639c(9);
        return this;
    }

    /* renamed from: k */
    public C10210i mo41478k(String str) {
        return m25641j(str, str, (String[]) null, false, true);
    }

    /* renamed from: l */
    public C10210i mo41479l(String str) {
        if (str != null) {
            return m25642m(new C10217g(str));
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: n */
    public C10210i mo41480n() {
        m25639c(2);
        return this;
    }

    /* renamed from: o */
    public C10210i mo41481o() {
        m25639c(0);
        return this;
    }

    /* renamed from: p */
    public void mo41482p() {
        this.f18973a = 1;
        this.f18974b = 2;
        this.f18975c = 10;
        this.f18976d = false;
        this.f18977e = null;
        List<Object> list = this.f18978f;
        if (list == null) {
            this.f18978f = new ArrayList();
        } else {
            list.clear();
        }
        this.f18979g = false;
        this.f18980h = false;
        this.f18981i = new C10213c[10];
    }

    /* renamed from: s */
    public C10209h mo41483s() {
        C10209h t = m25645t(this.f18978f, this.f18979g, this.f18980h);
        this.f18981i = (C10213c[]) this.f18981i.clone();
        return t;
    }
}
