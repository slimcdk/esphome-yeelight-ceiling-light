package org.joda.time;

import androidx.appcompat.widget.ActivityChooserView;
import org.joda.convert.FromString;
import org.joda.convert.ToString;
import org.joda.time.base.BaseSingleFieldPeriod;
import org.joda.time.field.C10179e;
import org.joda.time.format.C10208g;
import org.joda.time.format.C10209h;

public final class Days extends BaseSingleFieldPeriod {
    public static final Days FIVE = new Days(5);
    public static final Days FOUR = new Days(4);
    public static final Days MAX_VALUE = new Days(ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED);
    public static final Days MIN_VALUE = new Days(Integer.MIN_VALUE);
    public static final Days ONE = new Days(1);
    private static final C10209h PARSER = C10208g.m25627a().mo41471j(PeriodType.days());
    public static final Days SEVEN = new Days(7);
    public static final Days SIX = new Days(6);
    public static final Days THREE = new Days(3);
    public static final Days TWO = new Days(2);
    public static final Days ZERO = new Days(0);
    private static final long serialVersionUID = 87525275727380865L;

    private Days(int i) {
        super(i);
    }

    public static Days days(int i) {
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
            default:
                return new Days(i);
        }
    }

    public static Days daysBetween(C10222i iVar, C10222i iVar2) {
        return days(BaseSingleFieldPeriod.between(iVar, iVar2, DurationFieldType.days()));
    }

    public static Days daysBetween(C10224k kVar, C10224k kVar2) {
        return days((!(kVar instanceof LocalDate) || !(kVar2 instanceof LocalDate)) ? BaseSingleFieldPeriod.between(kVar, kVar2, (C10225l) ZERO) : C10149c.m25337b(kVar.getChronology()).days().getDifference(((LocalDate) kVar2).getLocalMillis(), ((LocalDate) kVar).getLocalMillis()));
    }

    public static Days daysIn(C10223j jVar) {
        return jVar == null ? ZERO : days(BaseSingleFieldPeriod.between((C10222i) jVar.getStart(), (C10222i) jVar.getEnd(), DurationFieldType.days()));
    }

    @FromString
    public static Days parseDays(String str) {
        return str == null ? ZERO : days(PARSER.mo41469h(str).getDays());
    }

    private Object readResolve() {
        return days(getValue());
    }

    public static Days standardDaysIn(C10225l lVar) {
        return days(BaseSingleFieldPeriod.standardPeriodIn(lVar, 86400000));
    }

    public Days dividedBy(int i) {
        return i == 1 ? this : days(getValue() / i);
    }

    public int getDays() {
        return getValue();
    }

    public DurationFieldType getFieldType() {
        return DurationFieldType.days();
    }

    public PeriodType getPeriodType() {
        return PeriodType.days();
    }

    public boolean isGreaterThan(Days days) {
        return days == null ? getValue() > 0 : getValue() > days.getValue();
    }

    public boolean isLessThan(Days days) {
        return days == null ? getValue() < 0 : getValue() < days.getValue();
    }

    public Days minus(int i) {
        return plus(C10179e.m25393i(i));
    }

    public Days minus(Days days) {
        return days == null ? this : minus(days.getValue());
    }

    public Days multipliedBy(int i) {
        return days(C10179e.m25390f(getValue(), i));
    }

    public Days negated() {
        return days(C10179e.m25393i(getValue()));
    }

    public Days plus(int i) {
        return i == 0 ? this : days(C10179e.m25388d(getValue(), i));
    }

    public Days plus(Days days) {
        return days == null ? this : plus(days.getValue());
    }

    public Duration toStandardDuration() {
        return new Duration(((long) getValue()) * 86400000);
    }

    public Hours toStandardHours() {
        return Hours.hours(C10179e.m25390f(getValue(), 24));
    }

    public Minutes toStandardMinutes() {
        return Minutes.minutes(C10179e.m25390f(getValue(), 1440));
    }

    public Seconds toStandardSeconds() {
        return Seconds.seconds(C10179e.m25390f(getValue(), 86400));
    }

    public Weeks toStandardWeeks() {
        return Weeks.weeks(getValue() / 7);
    }

    @ToString
    public String toString() {
        return "P" + String.valueOf(getValue()) + "D";
    }
}
