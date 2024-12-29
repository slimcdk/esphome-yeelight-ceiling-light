package org.joda.time.p196tz;

import com.miot.service.common.miotcloud.impl.MiotCloudImpl;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.SoftReference;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import org.apache.commons.p194io.IOUtils;
import org.joda.time.DateTimeZone;

/* renamed from: org.joda.time.tz.f */
public class C10236f implements C10232c {

    /* renamed from: a */
    private final File f19027a;

    /* renamed from: b */
    private final String f19028b;

    /* renamed from: c */
    private final ClassLoader f19029c;

    /* renamed from: d */
    private final Map<String, Object> f19030d;

    public C10236f(String str) {
        this(str, (ClassLoader) null, false);
    }

    private C10236f(String str, ClassLoader classLoader, boolean z) {
        if (str != null) {
            if (!str.endsWith(MiotCloudImpl.COOKIE_PATH)) {
                str = str + IOUtils.DIR_SEPARATOR_UNIX;
            }
            this.f19027a = null;
            this.f19028b = str;
            if (classLoader == null && !z) {
                classLoader = C10236f.class.getClassLoader();
            }
            this.f19029c = classLoader;
            this.f19030d = m25742d(m25743e("ZoneInfoMap"));
            return;
        }
        throw new IllegalArgumentException("No resource path provided");
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x002c A[SYNTHETIC, Splitter:B:19:0x002c] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0032 A[SYNTHETIC, Splitter:B:24:0x0032] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private org.joda.time.DateTimeZone m25741c(java.lang.String r6) {
        /*
            r5 = this;
            r0 = 0
            java.io.InputStream r1 = r5.m25743e(r6)     // Catch:{ IOException -> 0x0020, all -> 0x001e }
            org.joda.time.DateTimeZone r2 = org.joda.time.p196tz.DateTimeZoneBuilder.m25705b(r1, r6)     // Catch:{ IOException -> 0x001c }
            java.util.Map<java.lang.String, java.lang.Object> r3 = r5.f19030d     // Catch:{ IOException -> 0x001c }
            java.lang.ref.SoftReference r4 = new java.lang.ref.SoftReference     // Catch:{ IOException -> 0x001c }
            r4.<init>(r2)     // Catch:{ IOException -> 0x001c }
            r3.put(r6, r4)     // Catch:{ IOException -> 0x001c }
            if (r1 == 0) goto L_0x0018
            r1.close()     // Catch:{ IOException -> 0x0018 }
        L_0x0018:
            return r2
        L_0x0019:
            r6 = move-exception
            r0 = r1
            goto L_0x0030
        L_0x001c:
            r2 = move-exception
            goto L_0x0022
        L_0x001e:
            r6 = move-exception
            goto L_0x0030
        L_0x0020:
            r2 = move-exception
            r1 = r0
        L_0x0022:
            r5.mo41528g(r2)     // Catch:{ all -> 0x0019 }
            java.util.Map<java.lang.String, java.lang.Object> r2 = r5.f19030d     // Catch:{ all -> 0x0019 }
            r2.remove(r6)     // Catch:{ all -> 0x0019 }
            if (r1 == 0) goto L_0x002f
            r1.close()     // Catch:{ IOException -> 0x002f }
        L_0x002f:
            return r0
        L_0x0030:
            if (r0 == 0) goto L_0x0035
            r0.close()     // Catch:{ IOException -> 0x0035 }
        L_0x0035:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: org.joda.time.p196tz.C10236f.m25741c(java.lang.String):org.joda.time.DateTimeZone");
    }

    /* renamed from: d */
    private static Map<String, Object> m25742d(InputStream inputStream) {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        try {
            m25744f(dataInputStream, concurrentHashMap);
            concurrentHashMap.put("UTC", new SoftReference(DateTimeZone.UTC));
            return concurrentHashMap;
        } finally {
            try {
                dataInputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: e */
    private InputStream m25743e(String str) {
        if (this.f19027a != null) {
            return new FileInputStream(new File(this.f19027a, str));
        }
        String concat = this.f19028b.concat(str);
        ClassLoader classLoader = this.f19029c;
        InputStream resourceAsStream = classLoader != null ? classLoader.getResourceAsStream(concat) : ClassLoader.getSystemResourceAsStream(concat);
        if (resourceAsStream != null) {
            return resourceAsStream;
        }
        StringBuilder sb = new StringBuilder(40);
        sb.append("Resource not found: \"");
        sb.append(concat);
        sb.append("\" ClassLoader: ");
        ClassLoader classLoader2 = this.f19029c;
        sb.append(classLoader2 != null ? classLoader2.toString() : "system");
        throw new IOException(sb.toString());
    }

    /* renamed from: f */
    private static void m25744f(DataInputStream dataInputStream, Map<String, Object> map) {
        int readUnsignedShort = dataInputStream.readUnsignedShort();
        String[] strArr = new String[readUnsignedShort];
        int i = 0;
        for (int i2 = 0; i2 < readUnsignedShort; i2++) {
            strArr[i2] = dataInputStream.readUTF().intern();
        }
        int readUnsignedShort2 = dataInputStream.readUnsignedShort();
        while (i < readUnsignedShort2) {
            try {
                map.put(strArr[dataInputStream.readUnsignedShort()], strArr[dataInputStream.readUnsignedShort()]);
                i++;
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw new IOException("Corrupt zone info map");
            }
        }
    }

    /* renamed from: a */
    public DateTimeZone mo41524a(String str) {
        Object obj;
        if (str == null || (obj = this.f19030d.get(str)) == null) {
            return null;
        }
        if (str.equals(obj)) {
            return m25741c(str);
        }
        if (!(obj instanceof SoftReference)) {
            return mo41524a((String) obj);
        }
        DateTimeZone dateTimeZone = (DateTimeZone) ((SoftReference) obj).get();
        return dateTimeZone != null ? dateTimeZone : m25741c(str);
    }

    /* renamed from: b */
    public Set<String> mo41525b() {
        return new TreeSet(this.f19030d.keySet());
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo41528g(Exception exc) {
        Thread currentThread = Thread.currentThread();
        currentThread.getThreadGroup().uncaughtException(currentThread, exc);
    }
}
