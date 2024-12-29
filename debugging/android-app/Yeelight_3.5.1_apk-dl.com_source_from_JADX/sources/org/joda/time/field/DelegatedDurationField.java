package org.joda.time.field;

import java.io.Serializable;
import org.joda.time.C10172d;
import org.joda.time.DurationFieldType;

public class DelegatedDurationField extends C10172d implements Serializable {
    private static final long serialVersionUID = -5576443481242007829L;
    private final C10172d iField;
    private final DurationFieldType iType;

    protected DelegatedDurationField(C10172d dVar) {
        this(dVar, (DurationFieldType) null);
    }

    protected DelegatedDurationField(C10172d dVar, DurationFieldType durationFieldType) {
        if (dVar != null) {
            this.iField = dVar;
            this.iType = durationFieldType == null ? dVar.getType() : durationFieldType;
            return;
        }
        throw new IllegalArgumentException("The field must not be null");
    }

    public long add(long j, int i) {
        return this.iField.add(j, i);
    }

    public long add(long j, long j2) {
        return this.iField.add(j, j2);
    }

    public int compareTo(C10172d dVar) {
        return this.iField.compareTo(dVar);
    }

    public boolean equals(Object obj) {
        if (obj instanceof DelegatedDurationField) {
            return this.iField.equals(((DelegatedDurationField) obj).iField);
        }
        return false;
    }

    public int getDifference(long j, long j2) {
        return this.iField.getDifference(j, j2);
    }

    public long getDifferenceAsLong(long j, long j2) {
        return this.iField.getDifferenceAsLong(j, j2);
    }

    public long getMillis(int i) {
        return this.iField.getMillis(i);
    }

    public long getMillis(int i, long j) {
        return this.iField.getMillis(i, j);
    }

    public long getMillis(long j) {
        return this.iField.getMillis(j);
    }

    public long getMillis(long j, long j2) {
        return this.iField.getMillis(j, j2);
    }

    public String getName() {
        return this.iType.getName();
    }

    public DurationFieldType getType() {
        return this.iType;
    }

    public long getUnitMillis() {
        return this.iField.getUnitMillis();
    }

    public int getValue(long j) {
        return this.iField.getValue(j);
    }

    public int getValue(long j, long j2) {
        return this.iField.getValue(j, j2);
    }

    public long getValueAsLong(long j) {
        return this.iField.getValueAsLong(j);
    }

    public long getValueAsLong(long j, long j2) {
        return this.iField.getValueAsLong(j, j2);
    }

    public final C10172d getWrappedField() {
        return this.iField;
    }

    public int hashCode() {
        return this.iField.hashCode() ^ this.iType.hashCode();
    }

    public boolean isPrecise() {
        return this.iField.isPrecise();
    }

    public boolean isSupported() {
        return this.iField.isSupported();
    }

    public String toString() {
        if (this.iType == null) {
            return this.iField.toString();
        }
        return "DurationField[" + this.iType + ']';
    }
}
