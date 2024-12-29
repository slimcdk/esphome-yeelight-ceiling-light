package com.google.p107ar.sceneform;

import android.view.MotionEvent;
import androidx.annotation.Nullable;
import com.google.p107ar.sceneform.Scene;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* renamed from: com.google.ar.sceneform.TouchEventSystem */
public class TouchEventSystem {
    @Nullable
    private TouchTarget firstHandlingTouchTarget = null;
    @Nullable
    private Scene.OnTouchListener handlingTouchListener = null;
    private Method motionEventSplitMethod;
    private final Object[] motionEventSplitParams = new Object[1];
    private final ArrayList<Scene.OnPeekTouchListener> onPeekTouchListeners = new ArrayList<>();
    @Nullable
    private Scene.OnTouchListener onTouchListener;

    /* renamed from: com.google.ar.sceneform.TouchEventSystem$TouchTarget */
    static class TouchTarget {

        /* renamed from: a */
        public Node f5181a;

        /* renamed from: b */
        public int f5182b;
        @Nullable

        /* renamed from: c */
        public TouchTarget f5183c;

        private TouchTarget() {
        }

        /* synthetic */ TouchTarget(byte b) {
            this();
        }
    }

    private TouchTarget addTouchTarget(Node node, int i) {
        TouchTarget touchTarget = new TouchTarget((byte) 0);
        touchTarget.f5181a = node;
        touchTarget.f5182b = i;
        touchTarget.f5183c = this.firstHandlingTouchTarget;
        this.firstHandlingTouchTarget = touchTarget;
        return touchTarget;
    }

    private void clearTouchTargets() {
        this.handlingTouchListener = null;
        this.firstHandlingTouchTarget = null;
    }

    @Nullable
    private Node dispatchTouchEvent(MotionEvent motionEvent, HitTestResult hitTestResult, Node node, int i, boolean z) {
        int pointerIdBits = getPointerIdBits(motionEvent);
        int i2 = i & pointerIdBits;
        if (i2 == 0) {
            return null;
        }
        boolean z2 = false;
        if (i2 != pointerIdBits) {
            motionEvent = splitMotionEvent(motionEvent, i2);
            z2 = true;
        }
        while (node != null && !node.dispatchTouchEvent(hitTestResult, motionEvent)) {
            node = z ? node.getParent() : null;
        }
        if (node == null) {
            tryDispatchToSceneTouchListener(hitTestResult, motionEvent);
        }
        if (z2) {
            motionEvent.recycle();
        }
        return node;
    }

    private int getPointerIdBits(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        int i = 0;
        for (int i2 = 0; i2 < pointerCount; i2++) {
            i |= 1 << motionEvent.getPointerId(i2);
        }
        return i;
    }

    @Nullable
    private TouchTarget getTouchTargetForNode(Node node) {
        for (TouchTarget touchTarget = this.firstHandlingTouchTarget; touchTarget != null; touchTarget = touchTarget.f5183c) {
            if (touchTarget.f5181a == node) {
                return touchTarget;
            }
        }
        return null;
    }

    private void removePointersFromTouchTargets(int i) {
        TouchTarget touchTarget = this.firstHandlingTouchTarget;
        TouchTarget touchTarget2 = null;
        while (touchTarget != null) {
            TouchTarget touchTarget3 = touchTarget.f5183c;
            int i2 = touchTarget.f5182b;
            if ((i2 & i) != 0) {
                int i3 = i2 & (i ^ -1);
                touchTarget.f5182b = i3;
                if (i3 == 0) {
                    if (touchTarget2 == null) {
                        this.firstHandlingTouchTarget = touchTarget3;
                    } else {
                        touchTarget2.f5183c = touchTarget3;
                    }
                    touchTarget = touchTarget3;
                }
            }
            touchTarget2 = touchTarget;
            touchTarget = touchTarget3;
        }
    }

    private MotionEvent splitMotionEvent(MotionEvent motionEvent, int i) {
        if (this.motionEventSplitMethod == null) {
            try {
                this.motionEventSplitMethod = MotionEvent.class.getMethod("split", new Class[]{Integer.TYPE});
            } catch (ReflectiveOperationException e) {
                throw new RuntimeException("Splitting MotionEvent not supported.", e);
            }
        }
        try {
            this.motionEventSplitParams[0] = Integer.valueOf(i);
            Object invoke = this.motionEventSplitMethod.invoke(motionEvent, this.motionEventSplitParams);
            return invoke != null ? (MotionEvent) invoke : motionEvent;
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw new RuntimeException("Unable to split MotionEvent.", e2);
        }
    }

    private boolean tryDispatchToSceneTouchListener(HitTestResult hitTestResult, MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0) {
            Scene.OnTouchListener onTouchListener2 = this.onTouchListener;
            if (onTouchListener2 == null || !onTouchListener2.onSceneTouch(hitTestResult, motionEvent)) {
                return false;
            }
            this.handlingTouchListener = this.onTouchListener;
            return true;
        }
        Scene.OnTouchListener onTouchListener3 = this.handlingTouchListener;
        if (onTouchListener3 == null) {
            return false;
        }
        onTouchListener3.onSceneTouch(hitTestResult, motionEvent);
        return true;
    }

    public void addOnPeekTouchListener(Scene.OnPeekTouchListener onPeekTouchListener) {
        if (!this.onPeekTouchListeners.contains(onPeekTouchListener)) {
            this.onPeekTouchListeners.add(onPeekTouchListener);
        }
    }

    @Nullable
    public Scene.OnTouchListener getOnTouchListener() {
        return this.onTouchListener;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0099, code lost:
        if (r3 == false) goto L_0x002e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onTouchEvent(com.google.p107ar.sceneform.HitTestResult r13, android.view.MotionEvent r14) {
        /*
            r12 = this;
            java.lang.String r0 = "Parameter \"hitTestResult\" was null."
            com.google.p107ar.sceneform.utilities.Preconditions.checkNotNull(r13, r0)
            java.lang.String r0 = "Parameter \"motionEvent\" was null."
            com.google.p107ar.sceneform.utilities.Preconditions.checkNotNull(r14, r0)
            int r0 = r14.getActionMasked()
            if (r0 != 0) goto L_0x0013
            r12.clearTouchTargets()
        L_0x0013:
            java.util.ArrayList<com.google.ar.sceneform.Scene$OnPeekTouchListener> r1 = r12.onPeekTouchListeners
            int r2 = r1.size()
            r3 = 0
            r4 = 0
        L_0x001b:
            if (r4 >= r2) goto L_0x0029
            java.lang.Object r5 = r1.get(r4)
            int r4 = r4 + 1
            com.google.ar.sceneform.Scene$OnPeekTouchListener r5 = (com.google.p107ar.sceneform.Scene.OnPeekTouchListener) r5
            r5.onPeekTouch(r13, r14)
            goto L_0x001b
        L_0x0029:
            com.google.ar.sceneform.Scene$OnTouchListener r1 = r12.handlingTouchListener
            r2 = 1
            if (r1 == 0) goto L_0x0033
        L_0x002e:
            r12.tryDispatchToSceneTouchListener(r13, r14)
            goto L_0x009c
        L_0x0033:
            r1 = 0
            com.google.ar.sceneform.Node r7 = r13.getNode()
            if (r0 == 0) goto L_0x0040
            r4 = 5
            if (r0 != r4) goto L_0x003e
            goto L_0x0040
        L_0x003e:
            r4 = 0
            goto L_0x0080
        L_0x0040:
            int r4 = r14.getActionIndex()
            int r4 = r14.getPointerId(r4)
            int r10 = r2 << r4
            r12.removePointersFromTouchTargets(r10)
            if (r7 == 0) goto L_0x006e
            com.google.ar.sceneform.TouchEventSystem$TouchTarget r1 = r12.getTouchTargetForNode(r7)
            if (r1 == 0) goto L_0x005b
            int r4 = r1.f5182b
            r4 = r4 | r10
            r1.f5182b = r4
            goto L_0x006e
        L_0x005b:
            r9 = 1
            r4 = r12
            r5 = r14
            r6 = r13
            r8 = r10
            com.google.ar.sceneform.Node r4 = r4.dispatchTouchEvent(r5, r6, r7, r8, r9)
            if (r4 == 0) goto L_0x006b
            com.google.ar.sceneform.TouchEventSystem$TouchTarget r1 = r12.addTouchTarget(r4, r10)
            r3 = 1
        L_0x006b:
            r4 = r3
            r3 = 1
            goto L_0x006f
        L_0x006e:
            r4 = 0
        L_0x006f:
            if (r1 != 0) goto L_0x0080
            com.google.ar.sceneform.TouchEventSystem$TouchTarget r5 = r12.firstHandlingTouchTarget
            if (r5 == 0) goto L_0x0080
        L_0x0075:
            r1 = r5
            com.google.ar.sceneform.TouchEventSystem$TouchTarget r5 = r1.f5183c
            if (r5 == 0) goto L_0x007b
            goto L_0x0075
        L_0x007b:
            int r5 = r1.f5182b
            r5 = r5 | r10
            r1.f5182b = r5
        L_0x0080:
            com.google.ar.sceneform.TouchEventSystem$TouchTarget r5 = r12.firstHandlingTouchTarget
            if (r5 == 0) goto L_0x0099
        L_0x0084:
            if (r5 == 0) goto L_0x009c
            com.google.ar.sceneform.TouchEventSystem$TouchTarget r3 = r5.f5183c
            if (r4 == 0) goto L_0x008c
            if (r5 == r1) goto L_0x0097
        L_0x008c:
            com.google.ar.sceneform.Node r9 = r5.f5181a
            int r10 = r5.f5182b
            r11 = 0
            r6 = r12
            r7 = r14
            r8 = r13
            r6.dispatchTouchEvent(r7, r8, r9, r10, r11)
        L_0x0097:
            r5 = r3
            goto L_0x0084
        L_0x0099:
            if (r3 != 0) goto L_0x009c
            goto L_0x002e
        L_0x009c:
            r13 = 3
            if (r0 == r13) goto L_0x00b3
            if (r0 != r2) goto L_0x00a2
            goto L_0x00b3
        L_0x00a2:
            r13 = 6
            if (r0 != r13) goto L_0x00b2
            int r13 = r14.getActionIndex()
            int r13 = r14.getPointerId(r13)
            int r13 = r2 << r13
            r12.removePointersFromTouchTargets(r13)
        L_0x00b2:
            return
        L_0x00b3:
            r12.clearTouchTargets()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.p107ar.sceneform.TouchEventSystem.onTouchEvent(com.google.ar.sceneform.HitTestResult, android.view.MotionEvent):void");
    }

    public void removeOnPeekTouchListener(Scene.OnPeekTouchListener onPeekTouchListener) {
        this.onPeekTouchListeners.remove(onPeekTouchListener);
    }

    public void setOnTouchListener(@Nullable Scene.OnTouchListener onTouchListener2) {
        this.onTouchListener = onTouchListener2;
    }
}
