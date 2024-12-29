package com.google.p017ar.sceneform.rendering;

import com.google.android.filament.TextureSampler;
import com.google.p017ar.schemas.lull.ModelInstanceDef;
import com.google.p017ar.schemas.lull.TextureDef;
import java.nio.ByteBuffer;

/* renamed from: com.google.ar.sceneform.rendering.LullModel */
public class LullModel {
    private static final String TAG = "com.google.ar.sceneform.rendering.LullModel";
    public static final TextureSampler.WrapMode[] fromLullWrapMode;

    static {
        TextureSampler.WrapMode wrapMode = TextureSampler.WrapMode.CLAMP_TO_EDGE;
        fromLullWrapMode = new TextureSampler.WrapMode[]{wrapMode, wrapMode, TextureSampler.WrapMode.MIRRORED_REPEAT, wrapMode, TextureSampler.WrapMode.REPEAT};
    }

    public static TextureSampler.MagFilter fromLullToMagFilter(TextureDef textureDef) {
        int magFilter = textureDef.magFilter();
        if (magFilter == 0) {
            return TextureSampler.MagFilter.NEAREST;
        }
        if (magFilter == 1) {
            return TextureSampler.MagFilter.LINEAR;
        }
        String.valueOf(textureDef.name()).concat(": Sampler has unknown mag filter");
        return TextureSampler.MagFilter.NEAREST;
    }

    public static TextureSampler.MinFilter fromLullToMinFilter(TextureDef textureDef) {
        int minFilter = textureDef.minFilter();
        if (minFilter == 0) {
            return TextureSampler.MinFilter.NEAREST;
        }
        if (minFilter == 1) {
            return TextureSampler.MinFilter.LINEAR;
        }
        if (minFilter == 2) {
            return TextureSampler.MinFilter.NEAREST_MIPMAP_NEAREST;
        }
        if (minFilter == 3) {
            return TextureSampler.MinFilter.LINEAR_MIPMAP_NEAREST;
        }
        if (minFilter == 4) {
            return TextureSampler.MinFilter.NEAREST_MIPMAP_LINEAR;
        }
        if (minFilter == 5) {
            return TextureSampler.MinFilter.LINEAR_MIPMAP_LINEAR;
        }
        String.valueOf(textureDef.name()).concat(": Sampler has unknown min filter");
        return TextureSampler.MinFilter.NEAREST;
    }

    public static int getByteCountPerVertex(ModelInstanceDef modelInstanceDef) {
        int vertexAttributesLength = modelInstanceDef.vertexAttributesLength();
        int i = 0;
        for (int i2 = 0; i2 < vertexAttributesLength; i2++) {
            switch (modelInstanceDef.vertexAttributes(i2).type()) {
                case 1:
                case 5:
                case 7:
                    i += 4;
                    break;
                case 2:
                case 6:
                    i += 8;
                    break;
                case 3:
                    i += 12;
                    break;
                case 4:
                    i += 16;
                    break;
            }
        }
        return i;
    }

    public static boolean isLullModel(ByteBuffer byteBuffer) {
        return byteBuffer.limit() > 4 && byteBuffer.get(0) < 32 && byteBuffer.get(1) == 0 && byteBuffer.get(2) == 0;
    }
}
