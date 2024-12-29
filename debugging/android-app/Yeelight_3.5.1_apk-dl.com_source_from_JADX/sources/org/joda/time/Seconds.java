package org.joda.time;

import androidx.appcompat.widget.ActivityChooserView;
import org.joda.convert.FromString;
import org.joda.convert.ToString;
import org.joda.time.base.BaseSingleFieldPeriod;
import org.joda.time.field.C10179e;
import org.joda.time.format.C10208g;
import org.joda.time.format.C10209h;

public final class Seconds extends BaseSingleFieldPeriod {
    public static final Seconds MAX_VALUE = new Seconds(ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED);
    public static final Seconds MIN_VALUE = new Seconds(Integer.MIN_VALUE);
    public static final Seconds ONE = new Seconds(1);
    private static final C10209h PARSER = C10208g.m25627a().mo41471j(PeriodType.seconds());
    public static final Seconds THREE = new Seconds(3);
    public static final Seconds TWO = new Seconds(2);
    public static final Seconds ZERO = new Seconds(0);
    private static final long serialVersionUID = 87525275727380862L;

    private Seconds(int i) {
        super(i);
    }

    @FromString
    public static Seconds parseSeconds(String str) {
        return str == null ? ZERO : seconds(PARSER.mo41469h(str).getSeconds());
    }

    private Object readResolve() {
        return seconds(getValue());
    }

    public static Seconds seconds(int i) {
        return i != Integer.MIN_VALUE ? i != Integer.MAX_VALUE ? i != 0 ? i != 1 ? i != 2 ? i != 3 ? new Seconds(i) : THREE : TWO : ONE : ZERO : MAX_VALUE : MIN_VALUE;
    }

    public static Seconds secondsBetween(C10222i iVar, C10222i iVar2) {
        return seconds(BaseSingleFieldPeriod.between(iVar, iVar2, DurationFieldType.seconds()));
    }

    public static Seconds secondsBetween(C10224k kVar, C10224k kVar2) {
        return seconds((!(kVar instanceof LocalTime) || !(kVar2 instanceof LocalTime)) ? BaseSingleFieldPeriod.between(kVar, kVar2, (C10225l) ZERO) : C10149c.m25337b(kVar.getChronology()).seconds().getDifference(((LocalTime) kVar2).getLocalMillis(), ((LocalTime) kVar).getLocalMillis()));
    }

    public static Seconds secondsIn(C10223j jVar) {
        return jVar == null ? ZERO : seconds(BaseSingleFieldPeriod.between((C10222i) jVar.getStart(), (C10222i) jVar.getEnd(), DurationFieldType.seconds()));
    }

    public static Seconds standardSecondsIn(C10225l lVar) {
        return seconds(BaseSingleFieldPeriod.standardPeriodIn(lVar, 1000));
    }

    public Seconds dividedBy(int i) {
        return i == 1 ? this : seconds(getValue() / i);
    }

    public DurationFieldType getFieldType() {
        return DurationFieldType.seconds();
    }

    public PeriodType getPeriodType() {
        return PeriodType.seconds();
    }

    public int getSeconds() {
        return getValue();
    }

    public boolean isGreaterThan(Seconds seconds) {
        return seconds == null ? getValue() > 0 : getValue() > seconds.getValue();
    }

    public boolean isLessThan(Seconds seconds) {
        return seconds == null ? getValue() < 0 : getValue() < seconds.getValue();
    }

    public Seconds minus(int i) {
        return plus(C10179e.m25393i(i));
    }

    public Seconds minus(Seconds seconds) {
        return seconds == null ? this : minus(seconds.getValue());
    }

    public Seconds multipliedBy(int i) {
        return seconds(C10179e.m25390f(getValue(), i));
    }

    public Seconds negated() {
        return seconds(C10179e.m25393i(getValue()));
    }

    public Seconds plus(int i) {
        return i == 0 ? this : seconds(C10179e.m25388d(getValue(), i));
    }

    public Seconds plus(Seconds seconds) {
        return seconds == null ? this : plus(seconds.getValue());
    }

    public Days toStandardDays() {
        return Days.days(getValue() / 86400);
    }

    public Duration toStandardDuration() {
        return new Duration(((long) getValue()) * 1000);
    }

    public Hours toStandardHours() {
        return Hours.hours(getValue() / 3600);
    }

    public Minutes toStandardMinutes() {
        return Minutes.minutes(getValue() / 60);
    }

    public Weeks toStandardWeeks() {
        return Weeks.weeks(getValue() / 604800);
    }

    @ToString
    public String toString() {
        return "PT" + String.valueOf(getValue()) + "S";
    }
}
