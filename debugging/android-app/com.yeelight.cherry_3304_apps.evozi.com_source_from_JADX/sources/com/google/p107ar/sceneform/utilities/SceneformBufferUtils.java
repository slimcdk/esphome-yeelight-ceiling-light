package com.google.p107ar.sceneform.utilities;

import android.content.res.AssetManager;
import androidx.annotation.Nullable;
import com.google.devtools.build.android.desugar.runtime.ThrowableExtension;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;

/* renamed from: com.google.ar.sceneform.utilities.SceneformBufferUtils */
public final class SceneformBufferUtils {
    private static final int DEFAULT_BLOCK_SIZE = 8192;
    private static final String TAG = "SceneformBufferUtils";

    private static /* synthetic */ void $closeResource(Throwable th, InputStream inputStream) {
        if (th != null) {
            try {
                inputStream.close();
            } catch (Throwable th2) {
                ThrowableExtension.addSuppressed(th, th2);
            }
        } else {
            inputStream.close();
        }
    }

    private SceneformBufferUtils() {
    }

    private static int copy(InputStream inputStream, OutputStream outputStream) {
        byte[] bArr = new byte[8192];
        int i = 0;
        while (true) {
            int read = inputStream.read(bArr);
            if (read > 0) {
                i += read;
                outputStream.write(bArr, 0, read);
            } else {
                outputStream.flush();
                return i;
            }
        }
    }

    public static ByteBuffer copyByteBuffer(ByteBuffer byteBuffer) {
        return ByteBuffer.wrap(copyByteBufferToArray(byteBuffer));
    }

    public static byte[] copyByteBufferToArray(ByteBuffer byteBuffer) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[8192];
        int limit = byteBuffer.limit();
        while (byteBuffer.position() < limit) {
            int position = byteBuffer.position();
            byteBuffer.get(bArr, 0, Math.min(8192, limit - position));
            byteArrayOutputStream.write(bArr, 0, byteBuffer.position() - position);
        }
        byteArrayOutputStream.flush();
        return byteArrayOutputStream.toByteArray();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0014, code lost:
        if (r2 != null) goto L_0x0016;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0016, code lost:
        $closeResource(r0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0019, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0013, code lost:
        r1 = move-exception;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] inputStreamCallableToByteArray(java.util.concurrent.Callable<java.io.InputStream> r2) {
        /*
            java.lang.Object r2 = r2.call()
            java.io.InputStream r2 = (java.io.InputStream) r2
            byte[] r0 = inputStreamToByteArray(r2)     // Catch:{ all -> 0x0011 }
            if (r2 == 0) goto L_0x0010
            r1 = 0
            $closeResource(r1, r2)
        L_0x0010:
            return r0
        L_0x0011:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0013 }
        L_0x0013:
            r1 = move-exception
            if (r2 == 0) goto L_0x0019
            $closeResource(r0, r2)
        L_0x0019:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.p107ar.sceneform.utilities.SceneformBufferUtils.inputStreamCallableToByteArray(java.util.concurrent.Callable):byte[]");
    }

    public static byte[] inputStreamToByteArray(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        copy(inputStream, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x001d, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x001e, code lost:
        if (r2 != null) goto L_0x0020;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        $closeResource(r0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0023, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.nio.ByteBuffer inputStreamToByteBuffer(java.util.concurrent.Callable<java.io.InputStream> r2) {
        /*
            java.lang.Object r2 = r2.call()     // Catch:{ Exception -> 0x0024 }
            java.io.InputStream r2 = (java.io.InputStream) r2     // Catch:{ Exception -> 0x0024 }
            java.nio.ByteBuffer r0 = readStream(r2)     // Catch:{ all -> 0x001b }
            if (r2 == 0) goto L_0x0010
            r1 = 0
            $closeResource(r1, r2)     // Catch:{ Exception -> 0x0024 }
        L_0x0010:
            if (r0 == 0) goto L_0x0013
            return r0
        L_0x0013:
            java.lang.AssertionError r2 = new java.lang.AssertionError
            java.lang.String r0 = "Failed reading data from stream"
            r2.<init>(r0)
            throw r2
        L_0x001b:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x001d }
        L_0x001d:
            r1 = move-exception
            if (r2 == 0) goto L_0x0023
            $closeResource(r0, r2)     // Catch:{ Exception -> 0x0024 }
        L_0x0023:
            throw r1     // Catch:{ Exception -> 0x0024 }
        L_0x0024:
            r2 = move-exception
            java.util.concurrent.CompletionException r0 = new java.util.concurrent.CompletionException
            r0.<init>(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.p107ar.sceneform.utilities.SceneformBufferUtils.inputStreamToByteBuffer(java.util.concurrent.Callable):java.nio.ByteBuffer");
    }

    @Nullable
    public static ByteBuffer readFile(AssetManager assetManager, String str) {
        try {
            InputStream open = assetManager.open(str);
            ByteBuffer readStream = readStream(open);
            if (open != null) {
                try {
                    open.close();
                } catch (IOException e) {
                    String message = e.getMessage();
                    StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 46 + String.valueOf(message).length());
                    sb.append("Failed to close the input stream from file ");
                    sb.append(str);
                    sb.append(" - ");
                    sb.append(message);
                    sb.toString();
                }
            }
            return readStream;
        } catch (IOException e2) {
            String message2 = e2.getMessage();
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 23 + String.valueOf(message2).length());
            sb2.append("Failed to read file ");
            sb2.append(str);
            sb2.append(" - ");
            sb2.append(message2);
            sb2.toString();
            return null;
        }
    }

    @Nullable
    public static ByteBuffer readStream(@Nullable InputStream inputStream) {
        if (inputStream == null) {
            return null;
        }
        try {
            return ByteBuffer.wrap(inputStreamToByteArray(inputStream));
        } catch (IOException e) {
            String valueOf = String.valueOf(e.getMessage());
            if (valueOf.length() != 0) {
                "Failed to read stream - ".concat(valueOf);
                return null;
            }
            new String("Failed to read stream - ");
            return null;
        }
    }
}
