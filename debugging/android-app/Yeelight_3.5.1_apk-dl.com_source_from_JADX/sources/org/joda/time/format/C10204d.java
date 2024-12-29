package org.joda.time.format;

import java.util.Locale;
import org.joda.time.C10142a;
import org.joda.time.C10224k;
import org.joda.time.DateTimeZone;

/* renamed from: org.joda.time.format.d */
public interface C10204d {
    int estimatePrintedLength();

    void printTo(StringBuffer stringBuffer, long j, C10142a aVar, int i, DateTimeZone dateTimeZone, Locale locale);

    void printTo(StringBuffer stringBuffer, C10224k kVar, Locale locale);
}
