package com.google.p107ar.schemas.lull;

import com.yeelight.yeelib.service.UpnpDeviceCherry;

/* renamed from: com.google.ar.schemas.lull.VertexAttributeUsage */
public final class VertexAttributeUsage {
    public static final int BoneIndices = 7;
    public static final int BoneWeights = 8;
    public static final int Color = 2;
    public static final int Invalid = 0;
    public static final int Normal = 4;
    public static final int Orientation = 6;
    public static final int Position = 1;
    public static final int Tangent = 5;
    public static final int TexCoord = 3;
    public static final String[] names = {"Invalid", "Position", UpnpDeviceCherry.sColorChangeEventName, "TexCoord", "Normal", "Tangent", "Orientation", "BoneIndices", "BoneWeights"};

    private VertexAttributeUsage() {
    }

    public static String name(int i) {
        return names[i];
    }
}
