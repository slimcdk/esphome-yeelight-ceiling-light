package com.google.p107ar.sceneform.collision;

import com.google.p107ar.sceneform.common.TransformProvider;
import com.google.p107ar.sceneform.math.Matrix;
import com.google.p107ar.sceneform.math.Quaternion;
import com.google.p107ar.sceneform.math.Vector3;
import com.google.p107ar.sceneform.utilities.Preconditions;

/* renamed from: com.google.ar.sceneform.collision.Box */
public class Box extends CollisionShape {
    private static final String TAG = "Box";
    private final Vector3 center;
    private final Matrix rotationMatrix;
    private final Vector3 size;

    public Box() {
        this.center = Vector3.zero();
        this.size = Vector3.one();
        this.rotationMatrix = new Matrix();
    }

    public Box(Vector3 vector3) {
        this(vector3, Vector3.zero());
    }

    public Box(Vector3 vector3, Vector3 vector32) {
        this.center = Vector3.zero();
        this.size = Vector3.one();
        this.rotationMatrix = new Matrix();
        Preconditions.checkNotNull(vector32, "Parameter \"center\" was null.");
        Preconditions.checkNotNull(vector3, "Parameter \"size\" was null.");
        setCenter(vector32);
        setSize(vector3);
    }

    /* access modifiers changed from: protected */
    public boolean boxIntersection(Box box) {
        return C2680a.m8226c(this, box);
    }

    public Vector3 getCenter() {
        return new Vector3(this.center);
    }

    public Vector3 getExtents() {
        return getSize().scaled(0.5f);
    }

    /* access modifiers changed from: package-private */
    public Matrix getRawRotationMatrix() {
        return this.rotationMatrix;
    }

    public Quaternion getRotation() {
        Quaternion quaternion = new Quaternion();
        this.rotationMatrix.extractQuaternion(quaternion);
        return quaternion;
    }

    public Vector3 getSize() {
        return new Vector3(this.size);
    }

    public Box makeCopy() {
        return new Box(getSize(), getCenter());
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0077, code lost:
        if ((r8 + r5.f5202x) >= 0.0f) goto L_0x007b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00c3, code lost:
        if ((r8 + r5.f5203y) >= 0.0f) goto L_0x00c6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0111, code lost:
        if ((r3 + r5.f5204z) >= 0.0f) goto L_0x0114;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean rayIntersection(com.google.p107ar.sceneform.collision.Ray r18, com.google.p107ar.sceneform.collision.RayHit r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            java.lang.String r3 = "Parameter \"ray\" was null."
            com.google.p107ar.sceneform.utilities.Preconditions.checkNotNull(r1, r3)
            java.lang.String r3 = "Parameter \"result\" was null."
            com.google.p107ar.sceneform.utilities.Preconditions.checkNotNull(r2, r3)
            com.google.ar.sceneform.math.Vector3 r3 = r18.getDirection()
            com.google.ar.sceneform.math.Vector3 r4 = r18.getOrigin()
            com.google.ar.sceneform.math.Vector3 r5 = r17.getExtents()
            com.google.ar.sceneform.math.Vector3 r6 = r5.negated()
            com.google.ar.sceneform.math.Vector3 r7 = r0.center
            com.google.ar.sceneform.math.Vector3 r4 = com.google.p107ar.sceneform.math.Vector3.subtract(r7, r4)
            com.google.ar.sceneform.math.Matrix r7 = r0.rotationMatrix
            float[] r7 = r7.data
            com.google.ar.sceneform.math.Vector3 r8 = new com.google.ar.sceneform.math.Vector3
            r9 = 0
            r10 = r7[r9]
            r11 = 1
            r12 = r7[r11]
            r13 = 2
            r13 = r7[r13]
            r8.<init>(r10, r12, r13)
            float r10 = com.google.p107ar.sceneform.math.Vector3.dot(r8, r4)
            float r8 = com.google.p107ar.sceneform.math.Vector3.dot(r3, r8)
            r12 = 0
            boolean r13 = com.google.p107ar.sceneform.math.MathHelper.almostEqualRelativeAndAbs(r8, r12)
            r14 = 2139095039(0x7f7fffff, float:3.4028235E38)
            r15 = 1
            if (r13 != 0) goto L_0x006a
            float r13 = r6.f5202x
            float r13 = r13 + r10
            float r13 = r13 / r8
            float r11 = r5.f5202x
            float r10 = r10 + r11
            float r10 = r10 / r8
            int r8 = (r13 > r10 ? 1 : (r13 == r10 ? 0 : -1))
            if (r8 <= 0) goto L_0x0058
            goto L_0x005d
        L_0x0058:
            r16 = r13
            r13 = r10
            r10 = r16
        L_0x005d:
            float r14 = java.lang.Math.min(r13, r14)
            float r15 = java.lang.Math.max(r10, r15)
            int r8 = (r14 > r15 ? 1 : (r14 == r15 ? 0 : -1))
            if (r8 >= 0) goto L_0x007b
            return r9
        L_0x006a:
            float r8 = -r10
            float r10 = r6.f5202x
            float r10 = r10 + r8
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 > 0) goto L_0x0124
            float r10 = r5.f5202x
            float r8 = r8 + r10
            int r8 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r8 >= 0) goto L_0x007b
            goto L_0x0124
        L_0x007b:
            com.google.ar.sceneform.math.Vector3 r8 = new com.google.ar.sceneform.math.Vector3
            r10 = 4
            r10 = r7[r10]
            r11 = 5
            r11 = r7[r11]
            r13 = 6
            r13 = r7[r13]
            r8.<init>(r10, r11, r13)
            float r10 = com.google.p107ar.sceneform.math.Vector3.dot(r8, r4)
            float r8 = com.google.p107ar.sceneform.math.Vector3.dot(r3, r8)
            boolean r11 = com.google.p107ar.sceneform.math.MathHelper.almostEqualRelativeAndAbs(r8, r12)
            if (r11 != 0) goto L_0x00b6
            float r11 = r6.f5203y
            float r11 = r11 + r10
            float r11 = r11 / r8
            float r13 = r5.f5203y
            float r10 = r10 + r13
            float r10 = r10 / r8
            int r8 = (r11 > r10 ? 1 : (r11 == r10 ? 0 : -1))
            if (r8 <= 0) goto L_0x00a4
            goto L_0x00a9
        L_0x00a4:
            r16 = r11
            r11 = r10
            r10 = r16
        L_0x00a9:
            float r14 = java.lang.Math.min(r11, r14)
            float r15 = java.lang.Math.max(r10, r15)
            int r8 = (r14 > r15 ? 1 : (r14 == r15 ? 0 : -1))
            if (r8 >= 0) goto L_0x00c6
            return r9
        L_0x00b6:
            float r8 = -r10
            float r10 = r6.f5203y
            float r10 = r10 + r8
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 > 0) goto L_0x0124
            float r10 = r5.f5203y
            float r8 = r8 + r10
            int r8 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r8 >= 0) goto L_0x00c6
            goto L_0x0124
        L_0x00c6:
            com.google.ar.sceneform.math.Vector3 r8 = new com.google.ar.sceneform.math.Vector3
            r10 = 8
            r10 = r7[r10]
            r11 = 9
            r11 = r7[r11]
            r13 = 10
            r7 = r7[r13]
            r8.<init>(r10, r11, r7)
            float r4 = com.google.p107ar.sceneform.math.Vector3.dot(r8, r4)
            float r3 = com.google.p107ar.sceneform.math.Vector3.dot(r3, r8)
            boolean r7 = com.google.p107ar.sceneform.math.MathHelper.almostEqualRelativeAndAbs(r3, r12)
            if (r7 != 0) goto L_0x0104
            float r6 = r6.f5204z
            float r6 = r6 + r4
            float r6 = r6 / r3
            float r5 = r5.f5204z
            float r4 = r4 + r5
            float r4 = r4 / r3
            int r3 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r3 <= 0) goto L_0x00f2
            goto L_0x00f7
        L_0x00f2:
            r16 = r6
            r6 = r4
            r4 = r16
        L_0x00f7:
            float r3 = java.lang.Math.min(r6, r14)
            float r15 = java.lang.Math.max(r4, r15)
            int r3 = (r3 > r15 ? 1 : (r3 == r15 ? 0 : -1))
            if (r3 >= 0) goto L_0x0114
            return r9
        L_0x0104:
            float r3 = -r4
            float r4 = r6.f5204z
            float r4 = r4 + r3
            int r4 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r4 > 0) goto L_0x0124
            float r4 = r5.f5204z
            float r3 = r3 + r4
            int r3 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
            if (r3 >= 0) goto L_0x0114
            goto L_0x0124
        L_0x0114:
            r2.setDistance(r15)
            float r3 = r19.getDistance()
            com.google.ar.sceneform.math.Vector3 r1 = r1.getPoint(r3)
            r2.setPoint(r1)
            r1 = 1
            return r1
        L_0x0124:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.p107ar.sceneform.collision.Box.rayIntersection(com.google.ar.sceneform.collision.Ray, com.google.ar.sceneform.collision.RayHit):boolean");
    }

    public void setCenter(Vector3 vector3) {
        Preconditions.checkNotNull(vector3, "Parameter \"center\" was null.");
        this.center.set(vector3);
        onChanged();
    }

    public void setRotation(Quaternion quaternion) {
        Preconditions.checkNotNull(quaternion, "Parameter \"rotation\" was null.");
        this.rotationMatrix.makeRotation(quaternion);
        onChanged();
    }

    public void setSize(Vector3 vector3) {
        Preconditions.checkNotNull(vector3, "Parameter \"size\" was null.");
        this.size.set(vector3);
        onChanged();
    }

    /* access modifiers changed from: protected */
    public boolean shapeIntersection(CollisionShape collisionShape) {
        Preconditions.checkNotNull(collisionShape, "Parameter \"shape\" was null.");
        return collisionShape.boxIntersection(this);
    }

    /* access modifiers changed from: protected */
    public boolean sphereIntersection(Sphere sphere) {
        return C2680a.m8227d(sphere, this);
    }

    /* access modifiers changed from: package-private */
    public CollisionShape transform(TransformProvider transformProvider) {
        Preconditions.checkNotNull(transformProvider, "Parameter \"transformProvider\" was null.");
        Box box = new Box();
        transform(transformProvider, box);
        return box;
    }

    /* access modifiers changed from: package-private */
    public void transform(TransformProvider transformProvider, CollisionShape collisionShape) {
        Preconditions.checkNotNull(transformProvider, "Parameter \"transformProvider\" was null.");
        Preconditions.checkNotNull(collisionShape, "Parameter \"result\" was null.");
        if (collisionShape instanceof Box) {
            if (collisionShape != this) {
                Box box = (Box) collisionShape;
                Matrix worldModelMatrix = transformProvider.getWorldModelMatrix();
                box.center.set(worldModelMatrix.transformPoint(this.center));
                Vector3 vector3 = new Vector3();
                worldModelMatrix.decomposeScale(vector3);
                Vector3 vector32 = box.size;
                Vector3 vector33 = this.size;
                vector32.f5202x = vector33.f5202x * vector3.f5202x;
                vector32.f5203y = vector33.f5203y * vector3.f5203y;
                vector32.f5204z = vector33.f5204z * vector3.f5204z;
                worldModelMatrix.decomposeRotation(vector3, box.rotationMatrix);
                Matrix matrix = this.rotationMatrix;
                Matrix matrix2 = box.rotationMatrix;
                Matrix.multiply(matrix, matrix2, matrix2);
                return;
            }
            throw new IllegalArgumentException("Box cannot transform itself.");
        }
    }
}
