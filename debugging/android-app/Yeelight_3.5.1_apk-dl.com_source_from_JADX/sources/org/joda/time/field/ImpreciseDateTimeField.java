package org.joda.time.field;

import org.joda.time.C10172d;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DurationFieldType;

public abstract class ImpreciseDateTimeField extends C10176b {

    /* renamed from: b */
    final long f18832b;

    /* renamed from: c */
    private final C10172d f18833c;

    private final class LinkedDurationField extends BaseDurationField {
        private static final long serialVersionUID = -203813474600094134L;

        LinkedDurationField(DurationFieldType durationFieldType) {
            super(durationFieldType);
        }

        public long add(long j, int i) {
            return ImpreciseDateTimeField.this.add(j, i);
        }

        public long add(long j, long j2) {
            return ImpreciseDateTimeField.this.add(j, j2);
        }

        public int getDifference(long j, long j2) {
            return ImpreciseDateTimeField.this.getDifference(j, j2);
        }

        public long getDifferenceAsLong(long j, long j2) {
            return ImpreciseDateTimeField.this.getDifferenceAsLong(j, j2);
        }

        public long getMillis(int i, long j) {
            return ImpreciseDateTimeField.this.add(j, i) - j;
        }

        public long getMillis(long j, long j2) {
            return ImpreciseDateTimeField.this.add(j2, j) - j2;
        }

        public long getUnitMillis() {
            return ImpreciseDateTimeField.this.f18832b;
        }

        public int getValue(long j, long j2) {
            return ImpreciseDateTimeField.this.getDifference(j + j2, j2);
        }

        public long getValueAsLong(long j, long j2) {
            return ImpreciseDateTimeField.this.getDifferenceAsLong(j + j2, j2);
        }

        public boolean isPrecise() {
            return false;
        }
    }

    public ImpreciseDateTimeField(DateTimeFieldType dateTimeFieldType, long j) {
        super(dateTimeFieldType);
        this.f18832b = j;
        this.f18833c = new LinkedDurationField(dateTimeFieldType.getDurationType());
    }

    public int getDifference(long j, long j2) {
        return C10179e.m25395k(getDifferenceAsLong(j, j2));
    }

    public final C10172d getDurationField() {
        return this.f18833c;
    }
}
