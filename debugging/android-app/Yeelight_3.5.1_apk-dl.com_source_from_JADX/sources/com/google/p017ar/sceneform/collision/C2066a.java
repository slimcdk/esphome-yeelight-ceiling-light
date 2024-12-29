package com.google.p017ar.sceneform.collision;

import com.google.p017ar.sceneform.math.MathHelper;
import com.google.p017ar.sceneform.math.Matrix;
import com.google.p017ar.sceneform.math.Vector3;
import com.google.p017ar.sceneform.utilities.Preconditions;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.ar.sceneform.collision.a */
final class C2066a {
    /* renamed from: a */
    private static Vector3 m5177a(Matrix matrix) {
        float[] fArr = matrix.data;
        return new Vector3(fArr[0], fArr[4], fArr[8]);
    }

    /* renamed from: b */
    private static List<Vector3> m5178b(Box box) {
        Preconditions.checkNotNull(box, "Parameter \"box\" was null.");
        Vector3 center = box.getCenter();
        Vector3 extents = box.getExtents();
        Matrix rawRotationMatrix = box.getRawRotationMatrix();
        Vector3 a = m5177a(rawRotationMatrix);
        Vector3 e = m5181e(rawRotationMatrix);
        Vector3 f = m5182f(rawRotationMatrix);
        Vector3 scaled = a.scaled(extents.f3277x);
        Vector3 scaled2 = e.scaled(extents.f3278y);
        Vector3 scaled3 = f.scaled(extents.f3279z);
        ArrayList arrayList = new ArrayList(8);
        arrayList.add(Vector3.add(Vector3.add(Vector3.add(center, scaled), scaled2), scaled3));
        arrayList.add(Vector3.add(Vector3.add(Vector3.subtract(center, scaled), scaled2), scaled3));
        arrayList.add(Vector3.add(Vector3.subtract(Vector3.add(center, scaled), scaled2), scaled3));
        arrayList.add(Vector3.subtract(Vector3.add(Vector3.add(center, scaled), scaled2), scaled3));
        arrayList.add(Vector3.subtract(Vector3.subtract(Vector3.subtract(center, scaled), scaled2), scaled3));
        arrayList.add(Vector3.subtract(Vector3.subtract(Vector3.add(center, scaled), scaled2), scaled3));
        arrayList.add(Vector3.subtract(Vector3.add(Vector3.subtract(center, scaled), scaled2), scaled3));
        arrayList.add(Vector3.add(Vector3.subtract(Vector3.subtract(center, scaled), scaled2), scaled3));
        return arrayList;
    }

    /* renamed from: c */
    static boolean m5179c(Box box, Box box2) {
        Preconditions.checkNotNull(box, "Parameter \"box1\" was null.");
        Preconditions.checkNotNull(box2, "Parameter \"box2\" was null.");
        List<Vector3> b = m5178b(box);
        List<Vector3> b2 = m5178b(box2);
        Matrix rawRotationMatrix = box.getRawRotationMatrix();
        Matrix rawRotationMatrix2 = box2.getRawRotationMatrix();
        ArrayList arrayList = new ArrayList(15);
        arrayList.add(m5177a(rawRotationMatrix));
        arrayList.add(m5181e(rawRotationMatrix));
        arrayList.add(m5182f(rawRotationMatrix));
        arrayList.add(m5177a(rawRotationMatrix2));
        arrayList.add(m5181e(rawRotationMatrix2));
        arrayList.add(m5182f(rawRotationMatrix2));
        for (int i = 0; i < 3; i++) {
            arrayList.add(Vector3.cross((Vector3) arrayList.get(i), (Vector3) arrayList.get(0)));
            arrayList.add(Vector3.cross((Vector3) arrayList.get(i), (Vector3) arrayList.get(1)));
            arrayList.add(Vector3.cross((Vector3) arrayList.get(i), (Vector3) arrayList.get(2)));
        }
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            Vector3 vector3 = (Vector3) arrayList.get(i2);
            float f = Float.MIN_VALUE;
            float f2 = Float.MAX_VALUE;
            float f3 = Float.MAX_VALUE;
            float f4 = Float.MIN_VALUE;
            for (int i3 = 0; i3 < b.size(); i3++) {
                float dot = Vector3.dot(vector3, b.get(i3));
                f3 = Math.min(dot, f3);
                f4 = Math.max(dot, f4);
            }
            for (int i4 = 0; i4 < b2.size(); i4++) {
                float dot2 = Vector3.dot(vector3, b2.get(i4));
                f2 = Math.min(dot2, f2);
                f = Math.max(dot2, f);
            }
            if (!(f2 <= f4 && f3 <= f)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: d */
    static boolean m5180d(Sphere sphere, Box box) {
        Preconditions.checkNotNull(sphere, "Parameter \"sphere\" was null.");
        Preconditions.checkNotNull(box, "Parameter \"box\" was null.");
        Vector3 center = sphere.getCenter();
        Vector3 vector3 = new Vector3(box.getCenter());
        Vector3 subtract = Vector3.subtract(center, box.getCenter());
        Matrix rawRotationMatrix = box.getRawRotationMatrix();
        Vector3 extents = box.getExtents();
        Vector3 a = m5177a(rawRotationMatrix);
        float dot = Vector3.dot(subtract, a);
        float f = extents.f3277x;
        if (dot > f) {
            dot = f;
        } else if (dot < (-f)) {
            dot = -f;
        }
        Vector3 add = Vector3.add(vector3, a.scaled(dot));
        Vector3 e = m5181e(rawRotationMatrix);
        float dot2 = Vector3.dot(subtract, e);
        float f2 = extents.f3278y;
        if (dot2 > f2) {
            dot2 = f2;
        } else if (dot2 < (-f2)) {
            dot2 = -f2;
        }
        Vector3 add2 = Vector3.add(add, e.scaled(dot2));
        Vector3 f3 = m5182f(rawRotationMatrix);
        float dot3 = Vector3.dot(subtract, f3);
        float f4 = extents.f3279z;
        if (dot3 > f4) {
            dot3 = f4;
        } else if (dot3 < (-f4)) {
            dot3 = -f4;
        }
        Vector3 add3 = Vector3.add(add2, f3.scaled(dot3));
        Vector3 subtract2 = Vector3.subtract(add3, sphere.getCenter());
        float dot4 = Vector3.dot(subtract2, subtract2);
        if (dot4 > sphere.getRadius() * sphere.getRadius()) {
            return false;
        }
        if (!MathHelper.almostEqualRelativeAndAbs(dot4, 0.0f)) {
            return true;
        }
        Vector3 subtract3 = Vector3.subtract(add3, box.getCenter());
        return !MathHelper.almostEqualRelativeAndAbs(Vector3.dot(subtract3, subtract3), 0.0f);
    }

    /* renamed from: e */
    private static Vector3 m5181e(Matrix matrix) {
        float[] fArr = matrix.data;
        return new Vector3(fArr[1], fArr[5], fArr[9]);
    }

    /* renamed from: f */
    private static Vector3 m5182f(Matrix matrix) {
        float[] fArr = matrix.data;
        return new Vector3(fArr[2], fArr[6], fArr[10]);
    }
}
