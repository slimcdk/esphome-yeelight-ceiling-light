package org.joda.time;

import androidx.appcompat.widget.ActivityChooserView;
import org.joda.convert.FromString;
import org.joda.convert.ToString;
import org.joda.time.base.BaseSingleFieldPeriod;
import org.joda.time.field.C10179e;
import org.joda.time.format.C10208g;
import org.joda.time.format.C10209h;

public final class Hours extends BaseSingleFieldPeriod {
    public static final Hours EIGHT = new Hours(8);
    public static final Hours FIVE = new Hours(5);
    public static final Hours FOUR = new Hours(4);
    public static final Hours MAX_VALUE = new Hours(ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED);
    public static final Hours MIN_VALUE = new Hours(Integer.MIN_VALUE);
    public static final Hours ONE = new Hours(1);
    private static final C10209h PARSER = C10208g.m25627a().mo41471j(PeriodType.hours());
    public static final Hours SEVEN = new Hours(7);
    public static final Hours SIX = new Hours(6);
    public static final Hours THREE = new Hours(3);
    public static final Hours TWO = new Hours(2);
    public static final Hours ZERO = new Hours(0);
    private static final long serialVersionUID = 87525275727380864L;

    private Hours(int i) {
        super(i);
    }

    public static Hours hours(int i) {
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
            default:
                return new Hours(i);
        }
    }

    public static Hours hoursBetween(C10222i iVar, C10222i iVar2) {
        return hours(BaseSingleFieldPeriod.between(iVar, iVar2, DurationFieldType.hours()));
    }

    public static Hours hoursBetween(C10224k kVar, C10224k kVar2) {
        return hours((!(kVar instanceof LocalTime) || !(kVar2 instanceof LocalTime)) ? BaseSingleFieldPeriod.between(kVar, kVar2, (C10225l) ZERO) : C10149c.m25337b(kVar.getChronology()).hours().getDifference(((LocalTime) kVar2).getLocalMillis(), ((LocalTime) kVar).getLocalMillis()));
    }

    public static Hours hoursIn(C10223j jVar) {
        return jVar == null ? ZERO : hours(BaseSingleFieldPeriod.between((C10222i) jVar.getStart(), (C10222i) jVar.getEnd(), DurationFieldType.hours()));
    }

    @FromString
    public static Hours parseHours(String str) {
        return str == null ? ZERO : hours(PARSER.mo41469h(str).getHours());
    }

    private Object readResolve() {
        return hours(getValue());
    }

    public static Hours standardHoursIn(C10225l lVar) {
        return hours(BaseSingleFieldPeriod.standardPeriodIn(lVar, 3600000));
    }

    public Hours dividedBy(int i) {
        return i == 1 ? this : hours(getValue() / i);
    }

    public DurationFieldType getFieldType() {
        return DurationFieldType.hours();
    }

    public int getHours() {
        return getValue();
    }

    public PeriodType getPeriodType() {
        return PeriodType.hours();
    }

    public boolean isGreaterThan(Hours hours) {
        return hours == null ? getValue() > 0 : getValue() > hours.getValue();
    }

    public boolean isLessThan(Hours hours) {
        return hours == null ? getValue() < 0 : getValue() < hours.getValue();
    }

    public Hours minus(int i) {
        return plus(C10179e.m25393i(i));
    }

    public Hours minus(Hours hours) {
        return hours == null ? this : minus(hours.getValue());
    }

    public Hours multipliedBy(int i) {
        return hours(C10179e.m25390f(getValue(), i));
    }

    public Hours negated() {
        return hours(C10179e.m25393i(getValue()));
    }

    public Hours plus(int i) {
        return i == 0 ? this : hours(C10179e.m25388d(getValue(), i));
    }

    public Hours plus(Hours hours) {
        return hours == null ? this : plus(hours.getValue());
    }

    public Days toStandardDays() {
        return Days.days(getValue() / 24);
    }

    public Duration toStandardDuration() {
        return new Duration(((long) getValue()) * 3600000);
    }

    public Minutes toStandardMinutes() {
        return Minutes.minutes(C10179e.m25390f(getValue(), 60));
    }

    public Seconds toStandardSeconds() {
        return Seconds.seconds(C10179e.m25390f(getValue(), 3600));
    }

    public Weeks toStandardWeeks() {
        return Weeks.weeks(getValue() / 168);
    }

    @ToString
    public String toString() {
        return "PT" + String.valueOf(getValue()) + "H";
    }
}
