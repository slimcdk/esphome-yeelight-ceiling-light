package org.joda.time;

import androidx.appcompat.widget.ActivityChooserView;
import org.joda.convert.FromString;
import org.joda.convert.ToString;
import org.joda.time.base.BaseSingleFieldPeriod;
import org.joda.time.field.C10179e;
import org.joda.time.format.C10208g;
import org.joda.time.format.C10209h;

public final class Years extends BaseSingleFieldPeriod {
    public static final Years MAX_VALUE = new Years(ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED);
    public static final Years MIN_VALUE = new Years(Integer.MIN_VALUE);
    public static final Years ONE = new Years(1);
    private static final C10209h PARSER = C10208g.m25627a().mo41471j(PeriodType.years());
    public static final Years THREE = new Years(3);
    public static final Years TWO = new Years(2);
    public static final Years ZERO = new Years(0);
    private static final long serialVersionUID = 87525275727380868L;

    private Years(int i) {
        super(i);
    }

    @FromString
    public static Years parseYears(String str) {
        return str == null ? ZERO : years(PARSER.mo41469h(str).getYears());
    }

    private Object readResolve() {
        return years(getValue());
    }

    public static Years years(int i) {
        return i != Integer.MIN_VALUE ? i != Integer.MAX_VALUE ? i != 0 ? i != 1 ? i != 2 ? i != 3 ? new Years(i) : THREE : TWO : ONE : ZERO : MAX_VALUE : MIN_VALUE;
    }

    public static Years yearsBetween(C10222i iVar, C10222i iVar2) {
        return years(BaseSingleFieldPeriod.between(iVar, iVar2, DurationFieldType.years()));
    }

    public static Years yearsBetween(C10224k kVar, C10224k kVar2) {
        return years((!(kVar instanceof LocalDate) || !(kVar2 instanceof LocalDate)) ? BaseSingleFieldPeriod.between(kVar, kVar2, (C10225l) ZERO) : C10149c.m25337b(kVar.getChronology()).years().getDifference(((LocalDate) kVar2).getLocalMillis(), ((LocalDate) kVar).getLocalMillis()));
    }

    public static Years yearsIn(C10223j jVar) {
        return jVar == null ? ZERO : years(BaseSingleFieldPeriod.between((C10222i) jVar.getStart(), (C10222i) jVar.getEnd(), DurationFieldType.years()));
    }

    public Years dividedBy(int i) {
        return i == 1 ? this : years(getValue() / i);
    }

    public DurationFieldType getFieldType() {
        return DurationFieldType.years();
    }

    public PeriodType getPeriodType() {
        return PeriodType.years();
    }

    public int getYears() {
        return getValue();
    }

    public boolean isGreaterThan(Years years) {
        return years == null ? getValue() > 0 : getValue() > years.getValue();
    }

    public boolean isLessThan(Years years) {
        return years == null ? getValue() < 0 : getValue() < years.getValue();
    }

    public Years minus(int i) {
        return plus(C10179e.m25393i(i));
    }

    public Years minus(Years years) {
        return years == null ? this : minus(years.getValue());
    }

    public Years multipliedBy(int i) {
        return years(C10179e.m25390f(getValue(), i));
    }

    public Years negated() {
        return years(C10179e.m25393i(getValue()));
    }

    public Years plus(int i) {
        return i == 0 ? this : years(C10179e.m25388d(getValue(), i));
    }

    public Years plus(Years years) {
        return years == null ? this : plus(years.getValue());
    }

    @ToString
    public String toString() {
        return "P" + String.valueOf(getValue()) + "Y";
    }
}
