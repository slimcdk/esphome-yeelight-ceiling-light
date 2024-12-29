package com.yeelight.yeelib.pickcolor.p193g;

import android.annotation.TargetApi;
import android.graphics.Point;
import android.hardware.Camera;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

@TargetApi(15)
/* renamed from: com.yeelight.yeelib.pickcolor.g.c */
public final class C9925c {

    /* renamed from: com.yeelight.yeelib.pickcolor.g.c$a */
    static class C9926a implements Comparator<Camera.Size> {
        C9926a() {
        }

        /* renamed from: a */
        public int compare(Camera.Size size, Camera.Size size2) {
            int i = size.height * size.width;
            int i2 = size2.height * size2.width;
            if (i2 < i) {
                return -1;
            }
            return i2 > i ? 1 : 0;
        }
    }

    static {
        Pattern.compile(";");
    }

    /* renamed from: a */
    public static Point m24354a(Camera.Parameters parameters, Point point) {
        List<Camera.Size> supportedPreviewSizes = parameters.getSupportedPreviewSizes();
        if (supportedPreviewSizes == null) {
            Camera.Size previewSize = parameters.getPreviewSize();
            if (previewSize != null) {
                return new Point(previewSize.width, previewSize.height);
            }
            throw new IllegalStateException("Parameters contained no preview size!");
        }
        ArrayList<Camera.Size> arrayList = new ArrayList<>(supportedPreviewSizes);
        Collections.sort(arrayList, new C9926a());
        if (Log.isLoggable("CameraConfiguration", 4)) {
            StringBuilder sb = new StringBuilder();
            for (Camera.Size size : arrayList) {
                sb.append(size.width);
                sb.append('x');
                sb.append(size.height);
                sb.append(' ');
            }
            "Supported preview sizes: " + sb;
        }
        double d = (double) point.x;
        double d2 = (double) point.y;
        Double.isNaN(d);
        Double.isNaN(d2);
        double d3 = d / d2;
        Iterator it = arrayList.iterator();
        while (true) {
            boolean z = false;
            if (it.hasNext()) {
                Camera.Size size2 = (Camera.Size) it.next();
                int i = size2.width;
                int i2 = size2.height;
                if (i * i2 >= 153600) {
                    if (i < i2) {
                        z = true;
                    }
                    int i3 = z ? i2 : i;
                    int i4 = z ? i : i2;
                    double d4 = (double) i3;
                    double d5 = (double) i4;
                    Double.isNaN(d4);
                    Double.isNaN(d5);
                    if (Math.abs((d4 / d5) - d3) <= 0.15d) {
                        if (i3 == point.x && i4 == point.y) {
                            Point point2 = new Point(i, i2);
                            "Found preview size exactly matching screen size: " + point2;
                            return point2;
                        }
                    }
                }
                it.remove();
            } else if (!arrayList.isEmpty()) {
                Camera.Size size3 = (Camera.Size) arrayList.get(0);
                Point point3 = new Point(size3.width, size3.height);
                "Using largest suitable preview size: " + point3;
                return point3;
            } else {
                Camera.Size previewSize2 = parameters.getPreviewSize();
                if (previewSize2 != null) {
                    Point point4 = new Point(previewSize2.width, previewSize2.height);
                    "No suitable preview sizes, using default: " + point4;
                    return point4;
                }
                throw new IllegalStateException("Parameters contained no preview size!");
            }
        }
    }

    /* renamed from: b */
    private static String m24355b(String str, Collection<String> collection, String... strArr) {
        "Requesting " + str + " value from among: " + Arrays.toString(strArr);
        "Supported " + str + " values: " + collection;
        if (collection == null) {
            return null;
        }
        for (String str2 : strArr) {
            if (collection.contains(str2)) {
                "Can set " + str + " to: " + str2;
                return str2;
            }
        }
        return null;
    }

    /* renamed from: c */
    public static void m24356c(Camera.Parameters parameters, boolean z, boolean z2, boolean z3) {
        List<String> supportedFocusModes = parameters.getSupportedFocusModes();
        String b = z ? (z3 || z2) ? m24355b("focus mode", supportedFocusModes, "auto") : m24355b("focus mode", supportedFocusModes, "continuous-picture", "continuous-video", "auto") : null;
        if (!z3 && b == null) {
            b = m24355b("focus mode", supportedFocusModes, "macro", "edof");
        }
        if (b == null) {
            return;
        }
        if (b.equals(parameters.getFocusMode())) {
            "Focus mode already set to " + b;
            return;
        }
        parameters.setFocusMode(b);
    }

    /* renamed from: d */
    public static void m24357d(Camera.Parameters parameters, boolean z) {
        List<String> supportedFlashModes = parameters.getSupportedFlashModes();
        String b = z ? m24355b("flash mode", supportedFlashModes, "torch", "on") : m24355b("flash mode", supportedFlashModes, "off");
        if (b == null) {
            return;
        }
        if (b.equals(parameters.getFlashMode())) {
            "Flash mode already set to " + b;
            return;
        }
        "Setting flash mode to " + b;
        parameters.setFlashMode(b);
    }
}
