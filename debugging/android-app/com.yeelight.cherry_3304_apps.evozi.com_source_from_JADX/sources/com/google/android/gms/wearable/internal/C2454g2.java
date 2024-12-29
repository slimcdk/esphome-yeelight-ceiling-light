package com.google.android.gms.wearable.internal;

import android.os.ParcelFileDescriptor;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.wearable.internal.g2 */
final class C2454g2 implements Callable<Boolean> {

    /* renamed from: a */
    private final /* synthetic */ ParcelFileDescriptor f4887a;

    /* renamed from: b */
    private final /* synthetic */ byte[] f4888b;

    C2454g2(C2450f2 f2Var, ParcelFileDescriptor parcelFileDescriptor, byte[] bArr) {
        this.f4887a = parcelFileDescriptor;
        this.f4888b = bArr;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x008a, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        r4 = java.lang.String.valueOf(r7.f4887a);
        r6 = new java.lang.StringBuilder(java.lang.String.valueOf(r4).length() + 36);
        r6.append("processAssets: writing data failed: ");
        r6.append(r4);
        r6.toString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00d5, code lost:
        return java.lang.Boolean.FALSE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00da, code lost:
        if (android.util.Log.isLoggable("WearableClient", 3) != false) goto L_0x00dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00dc, code lost:
        r1 = java.lang.String.valueOf(r7.f4887a);
        r5 = new java.lang.StringBuilder(java.lang.String.valueOf(r1).length() + 24);
        r5.append("processAssets: closing: ");
        r5.append(r1);
        r5.toString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00fa, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00fd, code lost:
        throw r4;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x008c */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Boolean call() {
        /*
            r7 = this;
            java.lang.String r0 = "processAssets: closing: "
            java.lang.String r1 = "WearableClient"
            r2 = 3
            boolean r3 = android.util.Log.isLoggable(r1, r2)
            if (r3 == 0) goto L_0x002b
            android.os.ParcelFileDescriptor r3 = r7.f4887a
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r4 = java.lang.String.valueOf(r3)
            int r4 = r4.length()
            int r4 = r4 + 36
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r4)
            java.lang.String r4 = "processAssets: writing data to FD : "
            r5.append(r4)
            r5.append(r3)
            r5.toString()
        L_0x002b:
            android.os.ParcelFileDescriptor$AutoCloseOutputStream r3 = new android.os.ParcelFileDescriptor$AutoCloseOutputStream
            android.os.ParcelFileDescriptor r4 = r7.f4887a
            r3.<init>(r4)
            byte[] r4 = r7.f4888b     // Catch:{ IOException -> 0x008c }
            r3.write(r4)     // Catch:{ IOException -> 0x008c }
            r3.flush()     // Catch:{ IOException -> 0x008c }
            boolean r4 = android.util.Log.isLoggable(r1, r2)     // Catch:{ IOException -> 0x008c }
            if (r4 == 0) goto L_0x0060
            android.os.ParcelFileDescriptor r4 = r7.f4887a     // Catch:{ IOException -> 0x008c }
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ IOException -> 0x008c }
            java.lang.String r5 = java.lang.String.valueOf(r4)     // Catch:{ IOException -> 0x008c }
            int r5 = r5.length()     // Catch:{ IOException -> 0x008c }
            int r5 = r5 + 27
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x008c }
            r6.<init>(r5)     // Catch:{ IOException -> 0x008c }
            java.lang.String r5 = "processAssets: wrote data: "
            r6.append(r5)     // Catch:{ IOException -> 0x008c }
            r6.append(r4)     // Catch:{ IOException -> 0x008c }
            r6.toString()     // Catch:{ IOException -> 0x008c }
        L_0x0060:
            java.lang.Boolean r4 = java.lang.Boolean.TRUE     // Catch:{ IOException -> 0x008c }
            boolean r1 = android.util.Log.isLoggable(r1, r2)     // Catch:{ IOException -> 0x0089 }
            if (r1 == 0) goto L_0x0086
            android.os.ParcelFileDescriptor r1 = r7.f4887a     // Catch:{ IOException -> 0x0089 }
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ IOException -> 0x0089 }
            java.lang.String r2 = java.lang.String.valueOf(r1)     // Catch:{ IOException -> 0x0089 }
            int r2 = r2.length()     // Catch:{ IOException -> 0x0089 }
            int r2 = r2 + 24
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0089 }
            r5.<init>(r2)     // Catch:{ IOException -> 0x0089 }
            r5.append(r0)     // Catch:{ IOException -> 0x0089 }
            r5.append(r1)     // Catch:{ IOException -> 0x0089 }
            r5.toString()     // Catch:{ IOException -> 0x0089 }
        L_0x0086:
            r3.close()     // Catch:{ IOException -> 0x0089 }
        L_0x0089:
            return r4
        L_0x008a:
            r4 = move-exception
            goto L_0x00d6
        L_0x008c:
            android.os.ParcelFileDescriptor r4 = r7.f4887a     // Catch:{ all -> 0x008a }
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x008a }
            java.lang.String r5 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x008a }
            int r5 = r5.length()     // Catch:{ all -> 0x008a }
            int r5 = r5 + 36
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x008a }
            r6.<init>(r5)     // Catch:{ all -> 0x008a }
            java.lang.String r5 = "processAssets: writing data failed: "
            r6.append(r5)     // Catch:{ all -> 0x008a }
            r6.append(r4)     // Catch:{ all -> 0x008a }
            r6.toString()     // Catch:{ all -> 0x008a }
            boolean r1 = android.util.Log.isLoggable(r1, r2)     // Catch:{ IOException -> 0x00d3 }
            if (r1 == 0) goto L_0x00d0
            android.os.ParcelFileDescriptor r1 = r7.f4887a     // Catch:{ IOException -> 0x00d3 }
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ IOException -> 0x00d3 }
            java.lang.String r2 = java.lang.String.valueOf(r1)     // Catch:{ IOException -> 0x00d3 }
            int r2 = r2.length()     // Catch:{ IOException -> 0x00d3 }
            int r2 = r2 + 24
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x00d3 }
            r4.<init>(r2)     // Catch:{ IOException -> 0x00d3 }
            r4.append(r0)     // Catch:{ IOException -> 0x00d3 }
            r4.append(r1)     // Catch:{ IOException -> 0x00d3 }
            r4.toString()     // Catch:{ IOException -> 0x00d3 }
        L_0x00d0:
            r3.close()     // Catch:{ IOException -> 0x00d3 }
        L_0x00d3:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            return r0
        L_0x00d6:
            boolean r1 = android.util.Log.isLoggable(r1, r2)     // Catch:{ IOException -> 0x00fd }
            if (r1 == 0) goto L_0x00fa
            android.os.ParcelFileDescriptor r1 = r7.f4887a     // Catch:{ IOException -> 0x00fd }
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ IOException -> 0x00fd }
            java.lang.String r2 = java.lang.String.valueOf(r1)     // Catch:{ IOException -> 0x00fd }
            int r2 = r2.length()     // Catch:{ IOException -> 0x00fd }
            int r2 = r2 + 24
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x00fd }
            r5.<init>(r2)     // Catch:{ IOException -> 0x00fd }
            r5.append(r0)     // Catch:{ IOException -> 0x00fd }
            r5.append(r1)     // Catch:{ IOException -> 0x00fd }
            r5.toString()     // Catch:{ IOException -> 0x00fd }
        L_0x00fa:
            r3.close()     // Catch:{ IOException -> 0x00fd }
        L_0x00fd:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.wearable.internal.C2454g2.call():java.lang.Boolean");
    }
}
