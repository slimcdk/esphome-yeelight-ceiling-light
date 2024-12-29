package com.google.p017ar.sceneform;

import android.view.MotionEvent;
import com.google.p017ar.core.Pose;
import com.google.p017ar.sceneform.collision.Plane;
import com.google.p017ar.sceneform.collision.Ray;
import com.google.p017ar.sceneform.collision.RayHit;
import com.google.p017ar.sceneform.math.Quaternion;
import com.google.p017ar.sceneform.math.Vector3;
import com.google.p017ar.sceneform.rendering.ViewRenderable;
import com.google.p017ar.sceneform.utilities.Preconditions;

/* renamed from: com.google.ar.sceneform.a */
class C2063a {
    /* renamed from: a */
    private static float m5172a(ViewRenderable viewRenderable) {
        int width = viewRenderable.getView().getWidth();
        float f = viewRenderable.getSizer().getSize(viewRenderable.getView()).f3277x;
        if (f == 0.0f) {
            return 0.0f;
        }
        return ((float) width) / f;
    }

    /* renamed from: b */
    static Vector3 m5173b(Pose pose) {
        return new Vector3(pose.mo16574tx(), pose.mo16575ty(), pose.mo16576tz());
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0051  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static com.google.p017ar.sceneform.math.Vector3 m5174c(com.google.p017ar.sceneform.Node r7, com.google.p017ar.sceneform.math.Vector3 r8, com.google.p017ar.sceneform.rendering.ViewRenderable r9) {
        /*
            java.lang.String r0 = "Parameter \"node\" was null."
            com.google.p017ar.sceneform.utilities.Preconditions.checkNotNull(r7, r0)
            java.lang.String r0 = "Parameter \"worldPos\" was null."
            com.google.p017ar.sceneform.utilities.Preconditions.checkNotNull(r8, r0)
            java.lang.String r0 = "Parameter \"viewRenderable\" was null."
            com.google.p017ar.sceneform.utilities.Preconditions.checkNotNull(r9, r0)
            com.google.ar.sceneform.math.Vector3 r7 = r7.worldToLocalPoint(r8)
            android.view.View r8 = r9.getView()
            int r0 = r8.getWidth()
            int r8 = r8.getHeight()
            float r1 = m5172a(r9)
            float r2 = r7.f3277x
            float r2 = r2 * r1
            int r2 = (int) r2
            float r7 = r7.f3278y
            float r7 = r7 * r1
            int r7 = (int) r7
            int r1 = r0 / 2
            int r3 = r8 / 2
            com.google.ar.sceneform.rendering.ViewRenderable$VerticalAlignment r4 = r9.getVerticalAlignment()
            int r4 = r4.ordinal()
            r5 = 1
            r6 = 2
            if (r4 == 0) goto L_0x0045
            if (r4 == r5) goto L_0x0044
            if (r4 == r6) goto L_0x0042
            goto L_0x0047
        L_0x0042:
            int r7 = r7 + r8
            goto L_0x0045
        L_0x0044:
            int r7 = r7 + r3
        L_0x0045:
            int r7 = r8 - r7
        L_0x0047:
            com.google.ar.sceneform.rendering.ViewRenderable$HorizontalAlignment r8 = r9.getHorizontalAlignment()
            int r8 = r8.ordinal()
            if (r8 == r5) goto L_0x0056
            if (r8 == r6) goto L_0x0054
            goto L_0x0057
        L_0x0054:
            int r2 = r2 + r0
            goto L_0x0057
        L_0x0056:
            int r2 = r2 + r1
        L_0x0057:
            com.google.ar.sceneform.math.Vector3 r8 = new com.google.ar.sceneform.math.Vector3
            float r9 = (float) r2
            float r7 = (float) r7
            r0 = 0
            r8.<init>(r9, r7, r0)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.p017ar.sceneform.C2063a.m5174c(com.google.ar.sceneform.Node, com.google.ar.sceneform.math.Vector3, com.google.ar.sceneform.rendering.ViewRenderable):com.google.ar.sceneform.math.Vector3");
    }

    /* renamed from: d */
    static boolean m5175d(Node node, MotionEvent motionEvent) {
        Scene scene;
        ViewRenderable viewRenderable;
        Vector3 c;
        float width;
        Node node2 = node;
        MotionEvent motionEvent2 = motionEvent;
        Preconditions.checkNotNull(node2, "Parameter \"node\" was null.");
        Preconditions.checkNotNull(motionEvent2, "Parameter \"motionEvent\" was null.");
        if (!(node.getRenderable() instanceof ViewRenderable) || !node.isActive() || (scene = node.getScene()) == null || (viewRenderable = (ViewRenderable) node.getRenderable()) == null) {
            return false;
        }
        int pointerCount = motionEvent.getPointerCount();
        MotionEvent.PointerProperties[] pointerPropertiesArr = new MotionEvent.PointerProperties[pointerCount];
        MotionEvent.PointerCoords[] pointerCoordsArr = new MotionEvent.PointerCoords[pointerCount];
        Plane plane = new Plane(node.getWorldPosition(), node.getForward());
        RayHit rayHit = new RayHit();
        Plane plane2 = new Plane(node.getWorldPosition(), node.getBack());
        for (int i = 0; i < pointerCount; i++) {
            MotionEvent.PointerProperties pointerProperties = new MotionEvent.PointerProperties();
            MotionEvent.PointerCoords pointerCoords = new MotionEvent.PointerCoords();
            motionEvent2.getPointerProperties(i, pointerProperties);
            motionEvent2.getPointerCoords(i, pointerCoords);
            Ray screenPointToRay = scene.getCamera().screenPointToRay(pointerCoords.x, pointerCoords.y);
            if (plane.rayIntersection(screenPointToRay, rayHit)) {
                c = m5174c(node2, rayHit.getPoint(), viewRenderable);
                width = c.f3277x;
            } else if (plane2.rayIntersection(screenPointToRay, rayHit)) {
                c = m5174c(node2, rayHit.getPoint(), viewRenderable);
                width = ((float) viewRenderable.getView().getWidth()) - c.f3277x;
            } else {
                pointerCoords.clear();
                pointerProperties.clear();
                pointerPropertiesArr[i] = pointerProperties;
                pointerCoordsArr[i] = pointerCoords;
            }
            pointerCoords.x = width;
            pointerCoords.y = c.f3278y;
            pointerPropertiesArr[i] = pointerProperties;
            pointerCoordsArr[i] = pointerCoords;
        }
        return viewRenderable.getView().dispatchTouchEvent(MotionEvent.obtain(motionEvent.getDownTime(), motionEvent.getEventTime(), motionEvent.getAction(), pointerCount, pointerPropertiesArr, pointerCoordsArr, motionEvent.getMetaState(), motionEvent.getButtonState(), motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource(), motionEvent.getFlags()));
    }

    /* renamed from: e */
    static Quaternion m5176e(Pose pose) {
        return new Quaternion(pose.mo16565qx(), pose.mo16566qy(), pose.mo16567qz(), pose.mo16564qw());
    }
}
