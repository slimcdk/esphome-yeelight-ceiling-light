package org.joda.time;

import androidx.appcompat.widget.ActivityChooserView;
import org.joda.convert.FromString;
import org.joda.convert.ToString;
import org.joda.time.base.BaseSingleFieldPeriod;
import org.joda.time.field.C10179e;
import org.joda.time.format.C10208g;
import org.joda.time.format.C10209h;

public final class Months extends BaseSingleFieldPeriod {
    public static final Months EIGHT = new Months(8);
    public static final Months ELEVEN = new Months(11);
    public static final Months FIVE = new Months(5);
    public static final Months FOUR = new Months(4);
    public static final Months MAX_VALUE = new Months(ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED);
    public static final Months MIN_VALUE = new Months(Integer.MIN_VALUE);
    public static final Months NINE = new Months(9);
    public static final Months ONE = new Months(1);
    private static final C10209h PARSER = C10208g.m25627a().mo41471j(PeriodType.months());
    public static final Months SEVEN = new Months(7);
    public static final Months SIX = new Months(6);
    public static final Months TEN = new Months(10);
    public static final Months THREE = new Months(3);
    public static final Months TWELVE = new Months(12);
    public static final Months TWO = new Months(2);
    public static final Months ZERO = new Months(0);
    private static final long serialVersionUID = 87525275727380867L;

    private Months(int i) {
        super(i);
    }

    public static Months months(int i) {
        if (i == Integer.MIN_VALUE) {
            return MIN_VALUE;
        }
        if (i == Integer.MAX_VALUE) {
            return MAX_VALUE;
        }
        switch (i) {
            case 0:
                return ZERO;
            case 1:
                return ONE;
            case 2:
                return TWO;
            case 3:
                return THREE;
            case 4:
                return FOUR;
            case 5:
                return FIVE;
            case 6:
                return SIX;
            case 7:
                return SEVEN;
            case 8:
                return EIGHT;
            case 9:
                return NINE;
            case 10:
                return TEN;
            case 11:
                return ELEVEN;
            case 12:
                return TWELVE;
            default:
                return new Months(i);
        }
    }

    public static Months monthsBetween(C10222i iVar, C10222i iVar2) {
        return months(BaseSingleFieldPeriod.between(iVar, iVar2, DurationFieldType.months()));
    }

    public static Months monthsBetween(C10224k kVar, C10224k kVar2) {
        return months((!(kVar instanceof LocalDate) || !(kVar2 instanceof LocalDate)) ? BaseSingleFieldPeriod.between(kVar, kVar2, (C10225l) ZERO) : C10149c.m25337b(kVar.getChronology()).months().getDifference(((LocalDate) kVar2).getLocalMillis(), ((LocalDate) kVar).getLocalMillis()));
    }

    public static Months monthsIn(C10223j jVar) {
        return jVar == null ? ZERO : months(BaseSingleFieldPeriod.between((C10222i) jVar.getStart(), (C10222i) jVar.getEnd(), DurationFieldType.months()));
    }

    @FromString
    public static Months parseMonths(String str) {
        return str == null ? ZERO : months(PARSER.mo41469h(str).getMonths());
    }

    private Object readResolve() {
        return months(getValue());
    }

    public Months dividedBy(int i) {
        return i == 1 ? this : months(getValue() / i);
    }

    public DurationFieldType getFieldType() {
        return DurationFieldType.months();
    }

    public int getMonths() {
        return getValue();
    }

    public PeriodType getPeriodType() {
        return PeriodType.months();
    }

    public boolean isGreaterThan(Months months) {
        return months == null ? getValue() > 0 : getValue() > months.getValue();
    }

    public boolean isLessThan(Months months) {
        return months == null ? getValue() < 0 : getValue() < months.getValue();
    }

    public Months minus(int i) {
        return plus(C10179e.m25393i(i));
    }

    public Months minus(Months months) {
        return months == null ? this : minus(months.getValue());
    }

    public Months multipliedBy(int i) {
        return months(C10179e.m25390f(getValue(), i));
    }

    public Months negated() {
        return months(C10179e.m25393i(getValue()));
    }

    public Months plus(int i) {
        return i == 0 ? this : months(C10179e.m25388d(getValue(), i));
    }

    public Months plus(Months months) {
        return months == null ? this : plus(months.getValue());
    }

    @ToString
    public String toString() {
        return "P" + String.valueOf(getValue()) + "M";
    }
}
