package p124a4;

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
/* renamed from: a4.c */
public final class C3967c {

    /* renamed from: a4.c$a */
    class C3968a implements Comparator<Camera.Size> {
        C3968a() {
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
    public static Point m11443a(Camera.Parameters parameters, Point point) {
        List<Camera.Size> supportedPreviewSizes = parameters.getSupportedPreviewSizes();
        if (supportedPreviewSizes == null) {
            Camera.Size previewSize = parameters.getPreviewSize();
            if (previewSize != null) {
                return new Point(previewSize.width, previewSize.height);
            }
            throw new IllegalStateException("Parameters contained no preview size!");
        }
        ArrayList<Camera.Size> arrayList = new ArrayList<>(supportedPreviewSizes);
        Collections.sort(arrayList, new C3968a());
        if (Log.isLoggable("CameraConfiguration", 4)) {
            StringBuilder sb = new StringBuilder();
            for (Camera.Size size : arrayList) {
                sb.append(size.width);
                sb.append('x');
                sb.append(size.height);
                sb.append(' ');
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Supported preview sizes: ");
            sb2.append(sb);
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
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append("Found preview size exactly matching screen size: ");
                            sb3.append(point2);
                            return point2;
                        }
                    }
                }
                it.remove();
            } else if (!arrayList.isEmpty()) {
                Camera.Size size3 = (Camera.Size) arrayList.get(0);
                Point point3 = new Point(size3.width, size3.height);
                StringBuilder sb4 = new StringBuilder();
                sb4.append("Using largest suitable preview size: ");
                sb4.append(point3);
                return point3;
            } else {
                Camera.Size previewSize2 = parameters.getPreviewSize();
                if (previewSize2 != null) {
                    Point point4 = new Point(previewSize2.width, previewSize2.height);
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append("No suitable preview sizes, using default: ");
                    sb5.append(point4);
                    return point4;
                }
                throw new IllegalStateException("Parameters contained no preview size!");
            }
        }
    }

    /* renamed from: b */
    private static String m11444b(String str, Collection<String> collection, String... strArr) {
        StringBuilder sb = new StringBuilder();
        sb.append("Requesting ");
        sb.append(str);
        sb.append(" value from among: ");
        sb.append(Arrays.toString(strArr));
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Supported ");
        sb2.append(str);
        sb2.append(" values: ");
        sb2.append(collection);
        if (collection == null) {
            return null;
        }
        for (String str2 : strArr) {
            if (collection.contains(str2)) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Can set ");
                sb3.append(str);
                sb3.append(" to: ");
                sb3.append(str2);
                return str2;
            }
        }
        return null;
    }

    /* renamed from: c */
    public static void m11445c(Camera.Parameters parameters, boolean z, boolean z2, boolean z3) {
        List<String> supportedFocusModes = parameters.getSupportedFocusModes();
        String b = z ? (z3 || z2) ? m11444b("focus mode", supportedFocusModes, "auto") : m11444b("focus mode", supportedFocusModes, "continuous-picture", "continuous-video", "auto") : null;
        if (!z3 && b == null) {
            b = m11444b("focus mode", supportedFocusModes, "macro", "edof");
        }
        if (b == null) {
            return;
        }
        if (b.equals(parameters.getFocusMode())) {
            StringBuilder sb = new StringBuilder();
            sb.append("Focus mode already set to ");
            sb.append(b);
            return;
        }
        parameters.setFocusMode(b);
    }

    /* renamed from: d */
    public static void m11446d(Camera.Parameters parameters, boolean z) {
        List<String> supportedFlashModes = parameters.getSupportedFlashModes();
        String b = z ? m11444b("flash mode", supportedFlashModes, "torch", "on") : m11444b("flash mode", supportedFlashModes, "off");
        if (b == null) {
            return;
        }
        if (b.equals(parameters.getFlashMode())) {
            StringBuilder sb = new StringBuilder();
            sb.append("Flash mode already set to ");
            sb.append(b);
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Setting flash mode to ");
        sb2.append(b);
        parameters.setFlashMode(b);
    }
}
