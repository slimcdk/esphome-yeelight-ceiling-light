package com.google.p017ar.sceneform.rendering;

import androidx.annotation.RequiresApi;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.p017ar.sceneform.math.Vector3;
import com.google.p017ar.sceneform.rendering.ModelRenderable;
import com.google.p017ar.sceneform.rendering.RenderableDefinition;
import com.google.p017ar.sceneform.rendering.Vertex;
import com.google.p017ar.sceneform.utilities.AndroidPreconditions;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.ExecutionException;

@RequiresApi(api = 24)
/* renamed from: com.google.ar.sceneform.rendering.ShapeFactory */
public final class ShapeFactory {
    private static final int COORDS_PER_TRIANGLE = 3;
    private static final String TAG = "ShapeFactory";

    public static ModelRenderable makeCube(Vector3 vector3, Vector3 vector32, Material material) {
        Vector3 vector33 = vector32;
        AndroidPreconditions.checkMinAndroidApiLevel();
        Vector3 scaled = vector3.scaled(0.5f);
        Vector3 add = Vector3.add(vector33, new Vector3(-scaled.f3277x, -scaled.f3278y, scaled.f3279z));
        Vector3 add2 = Vector3.add(vector33, new Vector3(scaled.f3277x, -scaled.f3278y, scaled.f3279z));
        Vector3 add3 = Vector3.add(vector33, new Vector3(scaled.f3277x, -scaled.f3278y, -scaled.f3279z));
        Vector3 add4 = Vector3.add(vector33, new Vector3(-scaled.f3277x, -scaled.f3278y, -scaled.f3279z));
        Vector3 add5 = Vector3.add(vector33, new Vector3(-scaled.f3277x, scaled.f3278y, scaled.f3279z));
        Vector3 add6 = Vector3.add(vector33, new Vector3(scaled.f3277x, scaled.f3278y, scaled.f3279z));
        Vector3 add7 = Vector3.add(vector33, new Vector3(scaled.f3277x, scaled.f3278y, -scaled.f3279z));
        Vector3 add8 = Vector3.add(vector33, new Vector3(-scaled.f3277x, scaled.f3278y, -scaled.f3279z));
        Vector3 up = Vector3.m5216up();
        Vector3 down = Vector3.down();
        Vector3 forward = Vector3.forward();
        Vector3 back = Vector3.back();
        Vector3 left = Vector3.left();
        Vector3 right = Vector3.right();
        String str = "Error creating renderable.";
        Vertex.UvCoordinate uvCoordinate = new Vertex.UvCoordinate(0.0f, 0.0f);
        Vector3 vector34 = up;
        Vertex.UvCoordinate uvCoordinate2 = new Vertex.UvCoordinate(1.0f, 0.0f);
        Vector3 vector35 = back;
        Vertex.UvCoordinate uvCoordinate3 = new Vertex.UvCoordinate(0.0f, 1.0f);
        Vertex.UvCoordinate uvCoordinate4 = new Vertex.UvCoordinate(1.0f, 1.0f);
        Vector3 vector36 = add2;
        Vector3 vector37 = add7;
        Vector3 vector38 = vector35;
        Vector3 vector39 = right;
        Vector3 vector310 = vector34;
        ArrayList arrayList = new ArrayList(Arrays.asList(new Vertex[]{Vertex.builder().setPosition(add).setNormal(down).setUvCoordinate(uvCoordinate3).build(), Vertex.builder().setPosition(add2).setNormal(down).setUvCoordinate(uvCoordinate4).build(), Vertex.builder().setPosition(add3).setNormal(down).setUvCoordinate(uvCoordinate2).build(), Vertex.builder().setPosition(add4).setNormal(down).setUvCoordinate(uvCoordinate).build(), Vertex.builder().setPosition(add8).setNormal(left).setUvCoordinate(uvCoordinate3).build(), Vertex.builder().setPosition(add5).setNormal(left).setUvCoordinate(uvCoordinate4).build(), Vertex.builder().setPosition(add).setNormal(left).setUvCoordinate(uvCoordinate2).build(), Vertex.builder().setPosition(add4).setNormal(left).setUvCoordinate(uvCoordinate).build(), Vertex.builder().setPosition(add5).setNormal(forward).setUvCoordinate(uvCoordinate3).build(), Vertex.builder().setPosition(add6).setNormal(forward).setUvCoordinate(uvCoordinate4).build(), Vertex.builder().setPosition(vector36).setNormal(forward).setUvCoordinate(uvCoordinate2).build(), Vertex.builder().setPosition(add).setNormal(forward).setUvCoordinate(uvCoordinate).build(), Vertex.builder().setPosition(vector37).setNormal(vector38).setUvCoordinate(uvCoordinate3).build(), Vertex.builder().setPosition(add8).setNormal(vector38).setUvCoordinate(uvCoordinate4).build(), Vertex.builder().setPosition(add4).setNormal(vector38).setUvCoordinate(uvCoordinate2).build(), Vertex.builder().setPosition(add3).setNormal(vector38).setUvCoordinate(uvCoordinate).build(), Vertex.builder().setPosition(add6).setNormal(vector39).setUvCoordinate(uvCoordinate3).build(), Vertex.builder().setPosition(vector37).setNormal(vector39).setUvCoordinate(uvCoordinate4).build(), Vertex.builder().setPosition(add3).setNormal(vector39).setUvCoordinate(uvCoordinate2).build(), Vertex.builder().setPosition(vector36).setNormal(vector39).setUvCoordinate(uvCoordinate).build(), Vertex.builder().setPosition(add8).setNormal(vector310).setUvCoordinate(uvCoordinate3).build(), Vertex.builder().setPosition(vector37).setNormal(vector310).setUvCoordinate(uvCoordinate4).build(), Vertex.builder().setPosition(add6).setNormal(vector310).setUvCoordinate(uvCoordinate2).build(), Vertex.builder().setPosition(add5).setNormal(vector310).setUvCoordinate(uvCoordinate).build()}));
        ArrayList arrayList2 = new ArrayList(36);
        for (int i = 0; i < 6; i++) {
            int i2 = i * 4;
            int i3 = i2 + 3;
            arrayList2.add(Integer.valueOf(i3));
            int i4 = i2 + 1;
            arrayList2.add(Integer.valueOf(i4));
            arrayList2.add(Integer.valueOf(i2 + 0));
            arrayList2.add(Integer.valueOf(i3));
            arrayList2.add(Integer.valueOf(i2 + 2));
            arrayList2.add(Integer.valueOf(i4));
        }
        RenderableDefinition.Submesh build = RenderableDefinition.Submesh.builder().setTriangleIndices(arrayList2).setMaterial(material).build();
        try {
            ModelRenderable modelRenderable = (ModelRenderable) ((ModelRenderable.Builder) ModelRenderable.builder().setSource(RenderableDefinition.builder().setVertices(arrayList).setSubmeshes(Arrays.asList(new RenderableDefinition.Submesh[]{build})).build())).build().get();
            if (modelRenderable != null) {
                return modelRenderable;
            }
            throw new AssertionError(str);
        } catch (InterruptedException | ExecutionException e) {
            throw new AssertionError(str, e);
        }
    }

    public static ModelRenderable makeCylinder(float f, float f2, Vector3 vector3, Material material) {
        Vector3 vector32 = vector3;
        String str = "Error creating renderable.";
        AndroidPreconditions.checkMinAndroidApiLevel();
        float f3 = f2 / 2.0f;
        ArrayList arrayList = new ArrayList(100);
        ArrayList arrayList2 = new ArrayList(25);
        ArrayList arrayList3 = new ArrayList(25);
        ArrayList arrayList4 = new ArrayList(25);
        float f4 = 0.0f;
        int i = 0;
        float f5 = 0.0f;
        while (i <= 24) {
            double d = (double) f5;
            float cos = (float) Math.cos(d);
            float sin = (float) Math.sin(d);
            float f6 = f * cos;
            float f7 = f * sin;
            Vector3 vector33 = new Vector3(f6, -f3, f7);
            String str2 = str;
            float f8 = f5;
            Vector3 normalized = new Vector3(vector33.f3277x, f4, vector33.f3279z).normalized();
            Vector3 add = Vector3.add(vector33, vector32);
            float f9 = ((float) i) * 0.041666668f;
            arrayList.add(Vertex.builder().setPosition(add).setNormal(normalized).setUvCoordinate(new Vertex.UvCoordinate(f9, f4)).build());
            float f10 = (cos + 1.0f) / 2.0f;
            float f11 = (sin + 1.0f) / 2.0f;
            arrayList2.add(Vertex.builder().setPosition(add).setNormal(Vector3.down()).setUvCoordinate(new Vertex.UvCoordinate(f10, f11)).build());
            Vector3 vector34 = new Vector3(f6, f3, f7);
            Vector3 normalized2 = new Vector3(vector34.f3277x, 0.0f, vector34.f3279z).normalized();
            Vector3 add2 = Vector3.add(vector34, vector32);
            arrayList4.add(Vertex.builder().setPosition(add2).setNormal(normalized2).setUvCoordinate(new Vertex.UvCoordinate(f9, 1.0f)).build());
            arrayList3.add(Vertex.builder().setPosition(add2).setNormal(Vector3.m5216up()).setUvCoordinate(new Vertex.UvCoordinate(f10, f11)).build());
            f5 = f8 + 0.2617994f;
            i++;
            str = str2;
            f4 = 0.0f;
        }
        String str3 = str;
        arrayList.addAll(arrayList4);
        int size = arrayList.size();
        arrayList.add(Vertex.builder().setPosition(Vector3.add(vector32, new Vector3(0.0f, -f3, 0.0f))).setNormal(Vector3.down()).setUvCoordinate(new Vertex.UvCoordinate(0.5f, 0.5f)).build());
        arrayList.addAll(arrayList2);
        int size2 = arrayList.size();
        arrayList.add(Vertex.builder().setPosition(Vector3.add(vector32, new Vector3(0.0f, f3, 0.0f))).setNormal(Vector3.m5216up()).setUvCoordinate(new Vertex.UvCoordinate(0.5f, 0.5f)).build());
        arrayList.addAll(arrayList3);
        ArrayList arrayList5 = new ArrayList();
        int i2 = 0;
        while (i2 < 24) {
            int i3 = i2 + 1;
            int i4 = i2 + 24;
            int i5 = i4 + 1;
            int i6 = i4 + 2;
            arrayList5.add(Integer.valueOf(i2));
            arrayList5.add(Integer.valueOf(i6));
            arrayList5.add(Integer.valueOf(i3));
            arrayList5.add(Integer.valueOf(i2));
            arrayList5.add(Integer.valueOf(i5));
            arrayList5.add(Integer.valueOf(i6));
            arrayList5.add(Integer.valueOf(size));
            int i7 = size + i2;
            arrayList5.add(Integer.valueOf(i7 + 1));
            arrayList5.add(Integer.valueOf(i7 + 2));
            arrayList5.add(Integer.valueOf(size2));
            int i8 = i2 + size2;
            arrayList5.add(Integer.valueOf(i8 + 2));
            arrayList5.add(Integer.valueOf(i8 + 1));
            i2 = i3;
        }
        RenderableDefinition.Submesh build = RenderableDefinition.Submesh.builder().setTriangleIndices(arrayList5).setMaterial(material).build();
        try {
            ModelRenderable modelRenderable = (ModelRenderable) ((ModelRenderable.Builder) ModelRenderable.builder().setSource(RenderableDefinition.builder().setVertices(arrayList).setSubmeshes(Arrays.asList(new RenderableDefinition.Submesh[]{build})).build())).build().get();
            if (modelRenderable != null) {
                return modelRenderable;
            }
            throw new AssertionError(str3);
        } catch (InterruptedException | ExecutionException e) {
            throw new AssertionError(str3, e);
        }
    }

    public static ModelRenderable makeSphere(float f, Vector3 vector3, Material material) {
        AndroidPreconditions.checkMinAndroidApiLevel();
        ArrayList arrayList = new ArrayList(TypedValues.MotionType.TYPE_QUANTIZE_MOTION_PHASE);
        for (int i = 0; i <= 24; i++) {
            float f2 = (float) i;
            float f3 = 24.0f;
            double d = (double) ((3.1415927f * f2) / 24.0f);
            float sin = (float) Math.sin(d);
            float cos = (float) Math.cos(d);
            int i2 = 0;
            while (i2 <= 24) {
                double d2 = (double) ((6.2831855f * ((float) (i2 == 24 ? 0 : i2))) / f3);
                Vector3 scaled = new Vector3(((float) Math.cos(d2)) * sin, cos, ((float) Math.sin(d2)) * sin).scaled(f);
                arrayList.add(Vertex.builder().setPosition(Vector3.add(scaled, vector3)).setNormal(scaled.normalized()).setUvCoordinate(new Vertex.UvCoordinate(1.0f - (((float) i2) / f3), 1.0f - (f2 / f3))).build());
                i2++;
                f3 = 24.0f;
            }
            float f4 = f;
            Vector3 vector32 = vector3;
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size() * 2 * 3);
        int i3 = 0;
        int i4 = 0;
        while (i3 < 24) {
            int i5 = 0;
            while (i5 < 24) {
                boolean z = i3 == 0;
                boolean z2 = i3 == 23;
                int i6 = i5 + 1;
                if (!z) {
                    int i7 = i4 + i5;
                    arrayList2.add(Integer.valueOf(i7));
                    arrayList2.add(Integer.valueOf(i4 + i6));
                    arrayList2.add(Integer.valueOf(i7 + 24 + 1));
                }
                if (!z2) {
                    int i8 = i4 + i6;
                    arrayList2.add(Integer.valueOf(i8));
                    arrayList2.add(Integer.valueOf(i8 + 24 + 1));
                    arrayList2.add(Integer.valueOf(i5 + i4 + 24 + 1));
                }
                i5 = i6;
            }
            i4 += 25;
            i3++;
        }
        try {
            ModelRenderable modelRenderable = (ModelRenderable) ((ModelRenderable.Builder) ModelRenderable.builder().setSource(RenderableDefinition.builder().setVertices(arrayList).setSubmeshes(Arrays.asList(new RenderableDefinition.Submesh[]{RenderableDefinition.Submesh.builder().setTriangleIndices(arrayList2).setMaterial(material).build()})).build())).build().get();
            if (modelRenderable != null) {
                return modelRenderable;
            }
            throw new AssertionError("Error creating renderable.");
        } catch (InterruptedException | ExecutionException e) {
            throw new AssertionError("Error creating renderable.", e);
        }
    }
}
