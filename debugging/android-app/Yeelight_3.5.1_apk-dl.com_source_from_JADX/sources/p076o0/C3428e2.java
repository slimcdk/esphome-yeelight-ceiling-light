package p076o0;

import android.os.ParcelFileDescriptor;
import java.util.concurrent.Callable;

/* renamed from: o0.e2 */
final class C3428e2 implements Callable<Boolean> {

    /* renamed from: a */
    final /* synthetic */ ParcelFileDescriptor f5555a;

    /* renamed from: b */
    final /* synthetic */ byte[] f5556b;

    C3428e2(C3432f2 f2Var, ParcelFileDescriptor parcelFileDescriptor, byte[] bArr) {
        this.f5555a = parcelFileDescriptor;
        this.f5556b = bArr;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0075, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r4 = java.lang.String.valueOf(r7.f5555a);
        r6 = new java.lang.StringBuilder(r4.length() + 36);
        r6.append("processAssets: writing data failed: ");
        r6.append(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00b7, code lost:
        if (android.util.Log.isLoggable("WearableClient", 3) != false) goto L_0x00b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00b9, code lost:
        r1 = java.lang.String.valueOf(r7.f5555a);
        r5 = new java.lang.StringBuilder(r1.length() + 24);
        r5.append("processAssets: closing: ");
        r5.append(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00d0, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00d3, code lost:
        throw r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        return java.lang.Boolean.FALSE;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0077 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object call() {
        /*
            r7 = this;
            java.lang.String r0 = "processAssets: closing: "
            java.lang.String r1 = "WearableClient"
            r2 = 3
            boolean r3 = android.util.Log.isLoggable(r1, r2)
            if (r3 == 0) goto L_0x0024
            android.os.ParcelFileDescriptor r3 = r7.f5555a
            java.lang.String r3 = java.lang.String.valueOf(r3)
            int r4 = r3.length()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            int r4 = r4 + 36
            r5.<init>(r4)
            java.lang.String r4 = "processAssets: writing data to FD : "
            r5.append(r4)
            r5.append(r3)
        L_0x0024:
            android.os.ParcelFileDescriptor$AutoCloseOutputStream r3 = new android.os.ParcelFileDescriptor$AutoCloseOutputStream
            android.os.ParcelFileDescriptor r4 = r7.f5555a
            r3.<init>(r4)
            byte[] r4 = r7.f5556b     // Catch:{ IOException -> 0x0077 }
            r3.write(r4)     // Catch:{ IOException -> 0x0077 }
            r3.flush()     // Catch:{ IOException -> 0x0077 }
            boolean r4 = android.util.Log.isLoggable(r1, r2)     // Catch:{ IOException -> 0x0077 }
            if (r4 == 0) goto L_0x0052
            android.os.ParcelFileDescriptor r4 = r7.f5555a     // Catch:{ IOException -> 0x0077 }
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ IOException -> 0x0077 }
            int r5 = r4.length()     // Catch:{ IOException -> 0x0077 }
            int r5 = r5 + 27
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0077 }
            r6.<init>(r5)     // Catch:{ IOException -> 0x0077 }
            java.lang.String r5 = "processAssets: wrote data: "
            r6.append(r5)     // Catch:{ IOException -> 0x0077 }
            r6.append(r4)     // Catch:{ IOException -> 0x0077 }
        L_0x0052:
            java.lang.Boolean r4 = java.lang.Boolean.TRUE     // Catch:{ IOException -> 0x0077 }
            boolean r1 = android.util.Log.isLoggable(r1, r2)     // Catch:{ IOException -> 0x00b2 }
            if (r1 == 0) goto L_0x0071
            android.os.ParcelFileDescriptor r1 = r7.f5555a     // Catch:{ IOException -> 0x00b2 }
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ IOException -> 0x00b2 }
            int r2 = r1.length()     // Catch:{ IOException -> 0x00b2 }
            int r2 = r2 + 24
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x00b2 }
            r5.<init>(r2)     // Catch:{ IOException -> 0x00b2 }
            r5.append(r0)     // Catch:{ IOException -> 0x00b2 }
            r5.append(r1)     // Catch:{ IOException -> 0x00b2 }
        L_0x0071:
            r3.close()     // Catch:{ IOException -> 0x00b2 }
            goto L_0x00b2
        L_0x0075:
            r4 = move-exception
            goto L_0x00b3
        L_0x0077:
            android.os.ParcelFileDescriptor r4 = r7.f5555a     // Catch:{ all -> 0x0075 }
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x0075 }
            int r5 = r4.length()     // Catch:{ all -> 0x0075 }
            int r5 = r5 + 36
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0075 }
            r6.<init>(r5)     // Catch:{ all -> 0x0075 }
            java.lang.String r5 = "processAssets: writing data failed: "
            r6.append(r5)     // Catch:{ all -> 0x0075 }
            r6.append(r4)     // Catch:{ all -> 0x0075 }
            boolean r1 = android.util.Log.isLoggable(r1, r2)     // Catch:{ IOException -> 0x00b0 }
            if (r1 == 0) goto L_0x00ad
            android.os.ParcelFileDescriptor r1 = r7.f5555a     // Catch:{ IOException -> 0x00b0 }
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ IOException -> 0x00b0 }
            int r2 = r1.length()     // Catch:{ IOException -> 0x00b0 }
            int r2 = r2 + 24
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x00b0 }
            r4.<init>(r2)     // Catch:{ IOException -> 0x00b0 }
            r4.append(r0)     // Catch:{ IOException -> 0x00b0 }
            r4.append(r1)     // Catch:{ IOException -> 0x00b0 }
        L_0x00ad:
            r3.close()     // Catch:{ IOException -> 0x00b0 }
        L_0x00b0:
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
        L_0x00b2:
            return r4
        L_0x00b3:
            boolean r1 = android.util.Log.isLoggable(r1, r2)     // Catch:{ IOException -> 0x00d3 }
            if (r1 == 0) goto L_0x00d0
            android.os.ParcelFileDescriptor r1 = r7.f5555a     // Catch:{ IOException -> 0x00d3 }
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ IOException -> 0x00d3 }
            int r2 = r1.length()     // Catch:{ IOException -> 0x00d3 }
            int r2 = r2 + 24
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x00d3 }
            r5.<init>(r2)     // Catch:{ IOException -> 0x00d3 }
            r5.append(r0)     // Catch:{ IOException -> 0x00d3 }
            r5.append(r1)     // Catch:{ IOException -> 0x00d3 }
        L_0x00d0:
            r3.close()     // Catch:{ IOException -> 0x00d3 }
        L_0x00d3:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p076o0.C3428e2.call():java.lang.Object");
    }
}
