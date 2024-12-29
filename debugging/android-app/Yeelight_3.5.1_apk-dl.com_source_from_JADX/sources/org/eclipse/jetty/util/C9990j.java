package org.eclipse.jetty.util;

import java.io.File;
import java.net.URL;
import java.net.URLClassLoader;
import p157f6.C9042e;

/* renamed from: org.eclipse.jetty.util.j */
public class C9990j {
    /* renamed from: a */
    public static String m24693a(ClassLoader classLoader) {
        StringBuilder sb = new StringBuilder();
        while (classLoader != null && (classLoader instanceof URLClassLoader)) {
            URL[] uRLs = ((URLClassLoader) classLoader).getURLs();
            if (uRLs != null) {
                for (URL p : uRLs) {
                    File e = C9042e.m21619p(p).mo36920e();
                    if (e != null && e.exists()) {
                        if (sb.length() > 0) {
                            sb.append(File.pathSeparatorChar);
                        }
                        sb.append(e.getAbsolutePath());
                    }
                }
            }
            classLoader = classLoader.getParent();
        }
        return sb.toString();
    }

    /* renamed from: b */
    public static Class m24694b(Class cls, String str) {
        return m24695c(cls, str, false);
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x0044 A[SYNTHETIC, Splitter:B:27:0x0044] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x004f A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0051  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Class m24695c(java.lang.Class r5, java.lang.String r6, boolean r7) {
        /*
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            java.lang.ClassLoader r0 = r0.getContextClassLoader()
            r1 = 0
            r2 = r1
            r3 = r2
        L_0x000b:
            if (r2 != 0) goto L_0x0023
            if (r0 == 0) goto L_0x0023
            java.lang.Class r2 = r0.loadClass(r6)     // Catch:{ ClassNotFoundException -> 0x0014 }
            goto L_0x0018
        L_0x0014:
            r4 = move-exception
            if (r3 != 0) goto L_0x0018
            r3 = r4
        L_0x0018:
            if (r2 != 0) goto L_0x0021
            if (r7 == 0) goto L_0x0021
            java.lang.ClassLoader r0 = r0.getParent()
            goto L_0x000b
        L_0x0021:
            r0 = r1
            goto L_0x000b
        L_0x0023:
            if (r5 != 0) goto L_0x0027
        L_0x0025:
            r5 = r1
            goto L_0x002b
        L_0x0027:
            java.lang.ClassLoader r5 = r5.getClassLoader()
        L_0x002b:
            if (r2 != 0) goto L_0x0042
            if (r5 == 0) goto L_0x0042
            java.lang.Class r0 = r5.loadClass(r6)     // Catch:{ ClassNotFoundException -> 0x0035 }
            r2 = r0
            goto L_0x0039
        L_0x0035:
            r0 = move-exception
            if (r3 != 0) goto L_0x0039
            r3 = r0
        L_0x0039:
            if (r2 != 0) goto L_0x0025
            if (r7 == 0) goto L_0x0025
            java.lang.ClassLoader r5 = r5.getParent()
            goto L_0x002b
        L_0x0042:
            if (r2 != 0) goto L_0x004d
            java.lang.Class r2 = java.lang.Class.forName(r6)     // Catch:{ ClassNotFoundException -> 0x0049 }
            goto L_0x004d
        L_0x0049:
            r5 = move-exception
            if (r3 != 0) goto L_0x004d
            r3 = r5
        L_0x004d:
            if (r2 == 0) goto L_0x0050
            return r2
        L_0x0050:
            goto L_0x0052
        L_0x0051:
            throw r3
        L_0x0052:
            goto L_0x0051
        */
        throw new UnsupportedOperationException("Method not decompiled: org.eclipse.jetty.util.C9990j.m24695c(java.lang.Class, java.lang.String, boolean):java.lang.Class");
    }
}
