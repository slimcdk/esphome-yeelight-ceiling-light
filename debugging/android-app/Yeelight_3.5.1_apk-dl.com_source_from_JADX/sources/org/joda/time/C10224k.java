package org.joda.time;

/* renamed from: org.joda.time.k */
public interface C10224k extends Comparable<C10224k> {
    int get(DateTimeFieldType dateTimeFieldType);

    C10142a getChronology();

    C10143b getField(int i);

    DateTimeFieldType getFieldType(int i);

    int getValue(int i);

    boolean isSupported(DateTimeFieldType dateTimeFieldType);

    int size();
}
