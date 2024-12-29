package org.joda.time.field;

import androidx.appcompat.widget.ActivityChooserView;
import org.joda.time.C10143b;
import org.joda.time.C10172d;
import org.joda.time.DateTimeFieldType;

/* renamed from: org.joda.time.field.f */
public class C10180f extends C10177c {

    /* renamed from: c */
    private final int f18840c;

    /* renamed from: d */
    private final int f18841d;

    /* renamed from: e */
    private final int f18842e;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C10180f(C10143b bVar, int i) {
        this(bVar, bVar == null ? null : bVar.getType(), i, Integer.MIN_VALUE, ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED);
    }

    public C10180f(C10143b bVar, DateTimeFieldType dateTimeFieldType, int i) {
        this(bVar, dateTimeFieldType, i, Integer.MIN_VALUE, ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED);
    }

    public C10180f(C10143b bVar, DateTimeFieldType dateTimeFieldType, int i, int i2, int i3) {
        super(bVar, dateTimeFieldType);
        if (i != 0) {
            this.f18840c = i;
            if (i2 < bVar.getMinimumValue() + i) {
                this.f18841d = bVar.getMinimumValue() + i;
            } else {
                this.f18841d = i2;
            }
            if (i3 > bVar.getMaximumValue() + i) {
                this.f18842e = bVar.getMaximumValue() + i;
            } else {
                this.f18842e = i3;
            }
        } else {
            throw new IllegalArgumentException("The offset cannot be zero");
        }
    }

    public long add(long j, int i) {
        long add = super.add(j, i);
        C10179e.m25396l(this, get(add), this.f18841d, this.f18842e);
        return add;
    }

    public long add(long j, long j2) {
        long add = super.add(j, j2);
        C10179e.m25396l(this, get(add), this.f18841d, this.f18842e);
        return add;
    }

    public long addWrapField(long j, int i) {
        return set(j, C10179e.m25387c(get(j), i, this.f18841d, this.f18842e));
    }

    public int get(long j) {
        return super.get(j) + this.f18840c;
    }

    public int getLeapAmount(long j) {
        return getWrappedField().getLeapAmount(j);
    }

    public C10172d getLeapDurationField() {
        return getWrappedField().getLeapDurationField();
    }

    public int getMaximumValue() {
        return this.f18842e;
    }

    public int getMinimumValue() {
        return this.f18841d;
    }

    public boolean isLeap(long j) {
        return getWrappedField().isLeap(j);
    }

    public long remainder(long j) {
        return getWrappedField().remainder(j);
    }

    public long roundCeiling(long j) {
        return getWrappedField().roundCeiling(j);
    }

    public long roundFloor(long j) {
        return getWrappedField().roundFloor(j);
    }

    public long roundHalfCeiling(long j) {
        return getWrappedField().roundHalfCeiling(j);
    }

    public long roundHalfEven(long j) {
        return getWrappedField().roundHalfEven(j);
    }

    public long roundHalfFloor(long j) {
        return getWrappedField().roundHalfFloor(j);
    }

    public long set(long j, int i) {
        C10179e.m25396l(this, i, this.f18841d, this.f18842e);
        return super.set(j, i - this.f18840c);
    }
}
