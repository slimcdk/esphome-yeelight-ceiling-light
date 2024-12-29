package org.joda.time;

import androidx.appcompat.widget.ActivityChooserView;
import org.joda.convert.FromString;
import org.joda.convert.ToString;
import org.joda.time.base.BaseSingleFieldPeriod;
import org.joda.time.field.C10179e;
import org.joda.time.format.C10208g;
import org.joda.time.format.C10209h;

public final class Weeks extends BaseSingleFieldPeriod {
    public static final Weeks MAX_VALUE = new Weeks(ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED);
    public static final Weeks MIN_VALUE = new Weeks(Integer.MIN_VALUE);
    public static final Weeks ONE = new Weeks(1);
    private static final C10209h PARSER = C10208g.m25627a().mo41471j(PeriodType.weeks());
    public static final Weeks THREE = new Weeks(3);
    public static final Weeks TWO = new Weeks(2);
    public static final Weeks ZERO = new Weeks(0);
    private static final long serialVersionUID = 87525275727380866L;

    private Weeks(int i) {
        super(i);
    }

    @FromString
    public static Weeks parseWeeks(String str) {
        return str == null ? ZERO : weeks(PARSER.mo41469h(str).getWeeks());
    }

    private Object readResolve() {
        return weeks(getValue());
    }

    public static Weeks standardWeeksIn(C10225l lVar) {
        return weeks(BaseSingleFieldPeriod.standardPeriodIn(lVar, 604800000));
    }

    public static Weeks weeks(int i) {
        return i != Integer.MIN_VALUE ? i != Integer.MAX_VALUE ? i != 0 ? i != 1 ? i != 2 ? i != 3 ? new Weeks(i) : THREE : TWO : ONE : ZERO : MAX_VALUE : MIN_VALUE;
    }

    public static Weeks weeksBetween(C10222i iVar, C10222i iVar2) {
        return weeks(BaseSingleFieldPeriod.between(iVar, iVar2, DurationFieldType.weeks()));
    }

    public static Weeks weeksBetween(C10224k kVar, C10224k kVar2) {
        return weeks((!(kVar instanceof LocalDate) || !(kVar2 instanceof LocalDate)) ? BaseSingleFieldPeriod.between(kVar, kVar2, (C10225l) ZERO) : C10149c.m25337b(kVar.getChronology()).weeks().getDifference(((LocalDate) kVar2).getLocalMillis(), ((LocalDate) kVar).getLocalMillis()));
    }

    public static Weeks weeksIn(C10223j jVar) {
        return jVar == null ? ZERO : weeks(BaseSingleFieldPeriod.between((C10222i) jVar.getStart(), (C10222i) jVar.getEnd(), DurationFieldType.weeks()));
    }

    public Weeks dividedBy(int i) {
        return i == 1 ? this : weeks(getValue() / i);
    }

    public DurationFieldType getFieldType() {
        return DurationFieldType.weeks();
    }

    public PeriodType getPeriodType() {
        return PeriodType.weeks();
    }

    public int getWeeks() {
        return getValue();
    }

    public boolean isGreaterThan(Weeks weeks) {
        return weeks == null ? getValue() > 0 : getValue() > weeks.getValue();
    }

    public boolean isLessThan(Weeks weeks) {
        return weeks == null ? getValue() < 0 : getValue() < weeks.getValue();
    }

    public Weeks minus(int i) {
        return plus(C10179e.m25393i(i));
    }

    public Weeks minus(Weeks weeks) {
        return weeks == null ? this : minus(weeks.getValue());
    }

    public Weeks multipliedBy(int i) {
        return weeks(C10179e.m25390f(getValue(), i));
    }

    public Weeks negated() {
        return weeks(C10179e.m25393i(getValue()));
    }

    public Weeks plus(int i) {
        return i == 0 ? this : weeks(C10179e.m25388d(getValue(), i));
    }

    public Weeks plus(Weeks weeks) {
        return weeks == null ? this : plus(weeks.getValue());
    }

    public Days toStandardDays() {
        return Days.days(C10179e.m25390f(getValue(), 7));
    }

    public Duration toStandardDuration() {
        return new Duration(((long) getValue()) * 604800000);
    }

    public Hours toStandardHours() {
        return Hours.hours(C10179e.m25390f(getValue(), 168));
    }

    public Minutes toStandardMinutes() {
        return Minutes.minutes(C10179e.m25390f(getValue(), 10080));
    }

    public Seconds toStandardSeconds() {
        return Seconds.seconds(C10179e.m25390f(getValue(), 604800));
    }

    @ToString
    public String toString() {
        return "P" + String.valueOf(getValue()) + "W";
    }
}
