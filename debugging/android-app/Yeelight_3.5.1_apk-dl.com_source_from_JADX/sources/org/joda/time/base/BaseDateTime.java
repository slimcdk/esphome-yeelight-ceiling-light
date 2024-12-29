package org.joda.time.base;

import java.io.Serializable;
import org.joda.time.C10142a;
import org.joda.time.C10149c;
import org.joda.time.DateTimeZone;
import org.joda.time.chrono.ISOChronology;
import p153e7.C9008d;
import p153e7.C9013h;

public abstract class BaseDateTime extends C10145a implements Serializable {
    private static final long serialVersionUID = -6728882245981L;
    private volatile C10142a iChronology;
    private volatile long iMillis;

    public BaseDateTime() {
        this(C10149c.m25336a(), (C10142a) ISOChronology.getInstance());
    }

    public BaseDateTime(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        this(i, i2, i3, i4, i5, i6, i7, (C10142a) ISOChronology.getInstance());
    }

    public BaseDateTime(int i, int i2, int i3, int i4, int i5, int i6, int i7, DateTimeZone dateTimeZone) {
        this(i, i2, i3, i4, i5, i6, i7, (C10142a) ISOChronology.getInstance(dateTimeZone));
    }

    public BaseDateTime(int i, int i2, int i3, int i4, int i5, int i6, int i7, C10142a aVar) {
        this.iChronology = checkChronology(aVar);
        this.iMillis = checkInstant(this.iChronology.getDateTimeMillis(i, i2, i3, i4, i5, i6, i7), this.iChronology);
    }

    public BaseDateTime(long j) {
        this(j, (C10142a) ISOChronology.getInstance());
    }

    public BaseDateTime(long j, DateTimeZone dateTimeZone) {
        this(j, (C10142a) ISOChronology.getInstance(dateTimeZone));
    }

    public BaseDateTime(long j, C10142a aVar) {
        this.iChronology = checkChronology(aVar);
        this.iMillis = checkInstant(j, this.iChronology);
    }

    public BaseDateTime(Object obj, DateTimeZone dateTimeZone) {
        C9013h c = C9008d.m21502b().mo36871c(obj);
        C10142a checkChronology = checkChronology(c.mo36862b(obj, dateTimeZone));
        this.iChronology = checkChronology;
        this.iMillis = checkInstant(c.mo36864d(obj, checkChronology), checkChronology);
    }

    public BaseDateTime(Object obj, C10142a aVar) {
        C9013h c = C9008d.m21502b().mo36871c(obj);
        this.iChronology = checkChronology(c.mo36861a(obj, aVar));
        this.iMillis = checkInstant(c.mo36864d(obj, aVar), this.iChronology);
    }

    public BaseDateTime(DateTimeZone dateTimeZone) {
        this(C10149c.m25336a(), (C10142a) ISOChronology.getInstance(dateTimeZone));
    }

    public BaseDateTime(C10142a aVar) {
        this(C10149c.m25336a(), aVar);
    }

    /* access modifiers changed from: protected */
    public C10142a checkChronology(C10142a aVar) {
        return C10149c.m25337b(aVar);
    }

    /* access modifiers changed from: protected */
    public long checkInstant(long j, C10142a aVar) {
        return j;
    }

    public C10142a getChronology() {
        return this.iChronology;
    }

    public long getMillis() {
        return this.iMillis;
    }

    /* access modifiers changed from: protected */
    public void setChronology(C10142a aVar) {
        this.iChronology = checkChronology(aVar);
    }

    /* access modifiers changed from: protected */
    public void setMillis(long j) {
        this.iMillis = checkInstant(j, this.iChronology);
    }
}
