package org.joda.time;

/* renamed from: org.joda.time.i */
public interface C10222i extends Comparable<C10222i> {
    int get(DateTimeFieldType dateTimeFieldType);

    C10142a getChronology();

    long getMillis();

    boolean isBefore(C10222i iVar);

    Instant toInstant();
}
