package com.google.p017ar.schemas.sceneform;

/* renamed from: com.google.ar.schemas.sceneform.CollisionShapeType */
public final class CollisionShapeType {
    public static final int Box = 0;
    public static final int Sphere = 1;
    public static final String[] names = {"Box", "Sphere"};

    private CollisionShapeType() {
    }

    public static String name(int i) {
        return names[i];
    }
}
