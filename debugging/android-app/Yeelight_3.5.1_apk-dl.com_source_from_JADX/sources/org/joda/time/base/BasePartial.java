package org.joda.time.base;

import java.io.Serializable;
import java.util.Locale;
import org.joda.time.C10142a;
import org.joda.time.C10149c;
import org.joda.time.C10224k;
import org.joda.time.format.C10199a;
import org.joda.time.format.DateTimeFormat;
import p153e7.C9008d;
import p153e7.C9017l;

public abstract class BasePartial extends C10147e implements Serializable {
    private static final long serialVersionUID = 2353678632973660L;
    private final C10142a iChronology;
    private final int[] iValues;

    protected BasePartial() {
        this(C10149c.m25336a(), (C10142a) null);
    }

    protected BasePartial(long j) {
        this(j, (C10142a) null);
    }

    protected BasePartial(long j, C10142a aVar) {
        C10142a b = C10149c.m25337b(aVar);
        this.iChronology = b.withUTC();
        this.iValues = b.get((C10224k) this, j);
    }

    protected BasePartial(Object obj, C10142a aVar) {
        C9017l e = C9008d.m21502b().mo36873e(obj);
        C10142a b = C10149c.m25337b(e.mo36861a(obj, aVar));
        this.iChronology = b.withUTC();
        this.iValues = e.mo36884j(this, obj, b);
    }

    protected BasePartial(Object obj, C10142a aVar, C10199a aVar2) {
        C9017l e = C9008d.m21502b().mo36873e(obj);
        C10142a b = C10149c.m25337b(e.mo36861a(obj, aVar));
        this.iChronology = b.withUTC();
        this.iValues = e.mo36883i(this, obj, b, aVar2);
    }

    protected BasePartial(C10142a aVar) {
        this(C10149c.m25336a(), aVar);
    }

    protected BasePartial(BasePartial basePartial, C10142a aVar) {
        this.iChronology = aVar.withUTC();
        this.iValues = basePartial.iValues;
    }

    protected BasePartial(BasePartial basePartial, int[] iArr) {
        this.iChronology = basePartial.iChronology;
        this.iValues = iArr;
    }

    protected BasePartial(int[] iArr, C10142a aVar) {
        C10142a b = C10149c.m25337b(aVar);
        this.iChronology = b.withUTC();
        b.validate(this, iArr);
        this.iValues = iArr;
    }

    public C10142a getChronology() {
        return this.iChronology;
    }

    public int getValue(int i) {
        return this.iValues[i];
    }

    public int[] getValues() {
        return (int[]) this.iValues.clone();
    }

    /* access modifiers changed from: protected */
    public void setValue(int i, int i2) {
        int[] iArr = getField(i).set(this, i, this.iValues, i2);
        int[] iArr2 = this.iValues;
        System.arraycopy(iArr, 0, iArr2, 0, iArr2.length);
    }

    /* access modifiers changed from: protected */
    public void setValues(int[] iArr) {
        getChronology().validate(this, iArr);
        int[] iArr2 = this.iValues;
        System.arraycopy(iArr, 0, iArr2, 0, iArr2.length);
    }

    public abstract /* synthetic */ int size();

    public String toString(String str) {
        return str == null ? toString() : DateTimeFormat.m25402b(str).mo41439k(this);
    }

    public String toString(String str, Locale locale) {
        return str == null ? toString() : DateTimeFormat.m25402b(str).mo41444t(locale).mo41439k(this);
    }
}
