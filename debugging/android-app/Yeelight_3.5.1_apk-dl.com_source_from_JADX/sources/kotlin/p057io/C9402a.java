package kotlin.p057io;

import java.io.File;
import kotlin.jvm.internal.C9424q;

/* renamed from: kotlin.io.a */
public final class C9402a {
    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final String m22957b(File file, File file2, String str) {
        StringBuilder sb = new StringBuilder(file.toString());
        if (file2 != null) {
            sb.append(" -> " + file2);
        }
        if (str != null) {
            sb.append(": " + str);
        }
        String sb2 = sb.toString();
        C9424q.m22995d(sb2, "sb.toString()");
        return sb2;
    }
}
