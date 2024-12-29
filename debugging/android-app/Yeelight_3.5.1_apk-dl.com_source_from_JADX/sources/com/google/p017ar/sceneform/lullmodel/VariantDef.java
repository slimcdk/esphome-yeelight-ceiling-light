package com.google.p017ar.sceneform.lullmodel;

import org.eclipse.jetty.util.security.Constraint;

/* renamed from: com.google.ar.sceneform.lullmodel.VariantDef */
public final class VariantDef {
    public static final byte DataBool = 1;
    public static final byte DataBytes = 10;
    public static final byte DataFloat = 3;
    public static final byte DataHashValue = 5;
    public static final byte DataInt = 2;
    public static final byte DataQuat = 9;
    public static final byte DataString = 4;
    public static final byte DataVec2 = 6;
    public static final byte DataVec3 = 7;
    public static final byte DataVec4 = 8;
    public static final byte NONE = 0;
    public static final byte VariantArrayDef = 11;
    public static final byte VariantMapDef = 12;
    public static final String[] names = {Constraint.NONE, "DataBool", "DataInt", "DataFloat", "DataString", "DataHashValue", "DataVec2", "DataVec3", "DataVec4", "DataQuat", "DataBytes", "VariantArrayDef", "VariantMapDef"};

    private VariantDef() {
    }

    public static String name(int i) {
        return names[i];
    }
}
