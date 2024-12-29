package org.joda.time;

import androidx.appcompat.widget.ActivityChooserView;
import org.joda.convert.FromString;
import org.joda.convert.ToString;
import org.joda.time.base.BaseSingleFieldPeriod;
import org.joda.time.field.C10179e;
import org.joda.time.format.C10208g;
import org.joda.time.format.C10209h;

public final class Minutes extends BaseSingleFieldPeriod {
    public static final Minutes MAX_VALUE = new Minutes(ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED);
    public static final Minutes MIN_VALUE = new Minutes(Integer.MIN_VALUE);
    public static final Minutes ONE = new Minutes(1);
    private static final C10209h PARSER = C10208g.m25627a().mo41471j(PeriodType.minutes());
    public static final Minutes THREE = new Minutes(3);
    public static final Minutes TWO = new Minutes(2);
    public static final Minutes ZERO = new Minutes(0);
    private static final long serialVersionUID = 87525275727380863L;

    private Minutes(int i) {
        super(i);
    }

    public static Minutes minutes(int i) {
        return i != Integer.MIN_VALUE ? i != Integer.MAX_VALUE ? i != 0 ? i != 1 ? i != 2 ? i != 3 ? new Minutes(i) : THREE : TWO : ONE : ZERO : MAX_VALUE : MIN_VALUE;
    }

    public static Minutes minutesBetween(C10222i iVar, C10222i iVar2) {
        return minutes(BaseSingleFieldPeriod.between(iVar, iVar2, DurationFieldType.minutes()));
    }

    public static Minutes minutesBetween(C10224k kVar, C10224k kVar2) {
        return minutes((!(kVar instanceof LocalTime) || !(kVar2 instanceof LocalTime)) ? BaseSingleFieldPeriod.between(kVar, kVar2, (C10225l) ZERO) : C10149c.m25337b(kVar.getChronology()).minutes().getDifference(((LocalTime) kVar2).getLocalMillis(), ((LocalTime) kVar).getLocalMillis()));
    }

    public static Minutes minutesIn(C10223j jVar) {
        return jVar == null ? ZERO : minutes(BaseSingleFieldPeriod.between((C10222i) jVar.getStart(), (C10222i) jVar.getEnd(), DurationFieldType.minutes()));
    }

    @FromString
    public static Minutes parseMinutes(String str) {
        return str == null ? ZERO : minutes(PARSER.mo41469h(str).getMinutes());
    }

    private Object readResolve() {
        return minutes(getValue());
    }

    public static Minutes standardMinutesIn(C10225l lVar) {
        return minutes(BaseSingleFieldPeriod.standardPeriodIn(lVar, 60000));
    }

    public Minutes dividedBy(int i) {
        return i == 1 ? this : minutes(getValue() / i);
    }

    public DurationFieldType getFieldType() {
        return DurationFieldType.minutes();
    }

    public int getMinutes() {
        return getValue();
    }

    public PeriodType getPeriodType() {
        return PeriodType.minutes();
    }

    public boolean isGreaterThan(Minutes minutes) {
        return minutes == null ? getValue() > 0 : getValue() > minutes.getValue();
    }

    public boolean isLessThan(Minutes minutes) {
        return minutes == null ? getValue() < 0 : getValue() < minutes.getValue();
    }

    public Minutes minus(int i) {
        return plus(C10179e.m25393i(i));
    }

    public Minutes minus(Minutes minutes) {
        return minutes == null ? this : minus(minutes.getValue());
    }

    public Minutes multipliedBy(int i) {
        return minutes(C10179e.m25390f(getValue(), i));
    }

    public Minutes negated() {
        return minutes(C10179e.m25393i(getValue()));
    }

    public Minutes plus(int i) {
        return i == 0 ? this : minutes(C10179e.m25388d(getValue(), i));
    }

    public Minutes plus(Minutes minutes) {
        return minutes == null ? this : plus(minutes.getValue());
    }

    public Days toStandardDays() {
        return Days.days(getValue() / 1440);
    }

    public Duration toStandardDuration() {
        return new Duration(((long) getValue()) * 60000);
    }

    public Hours toStandardHours() {
        return Hours.hours(getValue() / 60);
    }

    public Seconds toStandardSeconds() {
        return Seconds.seconds(C10179e.m25390f(getValue(), 60));
    }

    public Weeks toStandardWeeks() {
        return Weeks.weeks(getValue() / 10080);
    }

    @ToString
    public String toString() {
        return "PT" + String.valueOf(getValue()) + "M";
    }
}
