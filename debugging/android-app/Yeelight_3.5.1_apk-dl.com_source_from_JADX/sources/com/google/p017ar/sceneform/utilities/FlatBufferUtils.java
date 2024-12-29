package com.google.p017ar.sceneform.utilities;

import androidx.annotation.Nullable;
import java.nio.ByteBuffer;

/* renamed from: com.google.ar.sceneform.utilities.FlatBufferUtils */
public class FlatBufferUtils {
    static {
        System.loadLibrary("ar-runtime-jni");
    }

    @Nullable
    public static ByteBuffer parseJson(String str, String str2) {
        return ByteBuffer.wrap(parseJsonNative(str, str2));
    }

    private static native byte[] parseJsonNative(String str, String str2);
}
