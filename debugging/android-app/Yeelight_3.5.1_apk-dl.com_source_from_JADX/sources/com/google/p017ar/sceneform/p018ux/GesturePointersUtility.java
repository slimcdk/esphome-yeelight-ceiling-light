package com.google.p017ar.sceneform.p018ux;

import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.MotionEvent;
import com.google.p017ar.sceneform.math.Vector3;
import java.util.HashSet;

/* renamed from: com.google.ar.sceneform.ux.GesturePointersUtility */
public class GesturePointersUtility {
    private final DisplayMetrics displayMetrics;
    private final HashSet<Integer> retainedPointerIds = new HashSet<>();

    public GesturePointersUtility(DisplayMetrics displayMetrics2) {
        this.displayMetrics = displayMetrics2;
    }

    public static Vector3 motionEventToPosition(MotionEvent motionEvent, int i) {
        int findPointerIndex = motionEvent.findPointerIndex(i);
        return new Vector3(motionEvent.getX(findPointerIndex), motionEvent.getY(findPointerIndex), 0.0f);
    }

    public float inchesToPixels(float f) {
        return TypedValue.applyDimension(4, f, this.displayMetrics);
    }

    public boolean isPointerIdRetained(int i) {
        return this.retainedPointerIds.contains(Integer.valueOf(i));
    }

    public float pixelsToInches(float f) {
        return f / TypedValue.applyDimension(4, 1.0f, this.displayMetrics);
    }

    public void releasePointerId(int i) {
        this.retainedPointerIds.remove(Integer.valueOf(i));
    }

    public void retainPointerId(int i) {
        if (!isPointerIdRetained(i)) {
            this.retainedPointerIds.add(Integer.valueOf(i));
        }
    }
}
