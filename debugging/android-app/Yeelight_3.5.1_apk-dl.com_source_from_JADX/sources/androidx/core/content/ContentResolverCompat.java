package androidx.core.content;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.os.CancellationSignal;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

public final class ContentResolverCompat {

    @RequiresApi(16)
    static class Api16Impl {
        private Api16Impl() {
        }

        @DoNotInline
        static Cursor query(ContentResolver contentResolver, Uri uri, String[] strArr, String str, String[] strArr2, String str2, CancellationSignal cancellationSignal) {
            return contentResolver.query(uri, strArr, str, strArr2, str2, cancellationSignal);
        }
    }

    private ContentResolverCompat() {
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v1, resolved type: android.os.CancellationSignal} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v2, resolved type: android.os.CancellationSignal} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v4, resolved type: android.os.CancellationSignal} */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.annotation.Nullable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.database.Cursor query(@androidx.annotation.NonNull android.content.ContentResolver r7, @androidx.annotation.NonNull android.net.Uri r8, @androidx.annotation.Nullable java.lang.String[] r9, @androidx.annotation.Nullable java.lang.String r10, @androidx.annotation.Nullable java.lang.String[] r11, @androidx.annotation.Nullable java.lang.String r12, @androidx.annotation.Nullable androidx.core.p007os.CancellationSignal r13) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 16
            if (r0 < r1) goto L_0x0029
            if (r13 == 0) goto L_0x000f
            java.lang.Object r13 = r13.getCancellationSignalObject()     // Catch:{ Exception -> 0x000d }
            goto L_0x0010
        L_0x000d:
            r7 = move-exception
            goto L_0x001e
        L_0x000f:
            r13 = 0
        L_0x0010:
            r6 = r13
            android.os.CancellationSignal r6 = (android.os.CancellationSignal) r6     // Catch:{ Exception -> 0x000d }
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            android.database.Cursor r7 = androidx.core.content.ContentResolverCompat.Api16Impl.query(r0, r1, r2, r3, r4, r5, r6)     // Catch:{ Exception -> 0x000d }
            return r7
        L_0x001e:
            boolean r8 = r7 instanceof android.os.OperationCanceledException
            if (r8 == 0) goto L_0x0028
            androidx.core.os.OperationCanceledException r7 = new androidx.core.os.OperationCanceledException
            r7.<init>()
            throw r7
        L_0x0028:
            throw r7
        L_0x0029:
            if (r13 == 0) goto L_0x002e
            r13.throwIfCanceled()
        L_0x002e:
            android.database.Cursor r7 = r7.query(r8, r9, r10, r11, r12)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.content.ContentResolverCompat.query(android.content.ContentResolver, android.net.Uri, java.lang.String[], java.lang.String, java.lang.String[], java.lang.String, androidx.core.os.CancellationSignal):android.database.Cursor");
    }
}
