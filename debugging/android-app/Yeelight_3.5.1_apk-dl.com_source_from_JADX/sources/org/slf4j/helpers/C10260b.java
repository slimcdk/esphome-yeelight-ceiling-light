package org.slf4j.helpers;

import java.io.PrintStream;

/* renamed from: org.slf4j.helpers.b */
public class C10260b {
    /* renamed from: a */
    public static final void m25797a(String str) {
        PrintStream printStream = System.err;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("SLF4J: ");
        stringBuffer.append(str);
        printStream.println(stringBuffer.toString());
    }

    /* renamed from: b */
    public static final void m25798b(String str, Throwable th) {
        System.err.println(str);
        System.err.println("Reported exception:");
        th.printStackTrace();
    }
}
