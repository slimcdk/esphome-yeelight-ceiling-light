package com.miot.service.qrcode.camera;

import android.annotation.TargetApi;
import android.graphics.Point;
import android.graphics.Rect;
import android.hardware.Camera;
import android.os.Build;
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
public final class CameraConfigurationUtils {
    private static final int AREA_PER_1000 = 400;
    private static final double MAX_ASPECT_DISTORTION = 0.15d;
    private static final float MAX_EXPOSURE_COMPENSATION = 1.5f;
    private static final int MAX_FPS = 20;
    private static final float MIN_EXPOSURE_COMPENSATION = 0.0f;
    private static final int MIN_FPS = 10;
    private static final int MIN_PREVIEW_PIXELS = 153600;
    private static final Pattern SEMICOLON = Pattern.compile(";");
    private static final String TAG = "CameraConfiguration";

    private CameraConfigurationUtils() {
    }

    private static List<Camera.Area> buildMiddleArea(int i) {
        int i2 = -i;
        return Collections.singletonList(new Camera.Area(new Rect(i2, i2, i, i), 1));
    }

    public static String collectStats(Camera.Parameters parameters) {
        return collectStats((CharSequence) parameters.flatten());
    }

    public static String collectStats(CharSequence charSequence) {
        StringBuilder sb = new StringBuilder(1000);
        sb.append("BOARD=");
        sb.append(Build.BOARD);
        sb.append(10);
        sb.append("BRAND=");
        sb.append(Build.BRAND);
        sb.append(10);
        sb.append("CPU_ABI=");
        sb.append(Build.CPU_ABI);
        sb.append(10);
        sb.append("DEVICE=");
        sb.append(Build.DEVICE);
        sb.append(10);
        sb.append("DISPLAY=");
        sb.append(Build.DISPLAY);
        sb.append(10);
        sb.append("FINGERPRINT=");
        sb.append(Build.FINGERPRINT);
        sb.append(10);
        sb.append("HOST=");
        sb.append(Build.HOST);
        sb.append(10);
        sb.append("ID=");
        sb.append(Build.ID);
        sb.append(10);
        sb.append("MANUFACTURER=");
        sb.append(Build.MANUFACTURER);
        sb.append(10);
        sb.append("MODEL=");
        sb.append(Build.MODEL);
        sb.append(10);
        sb.append("PRODUCT=");
        sb.append(Build.PRODUCT);
        sb.append(10);
        sb.append("TAGS=");
        sb.append(Build.TAGS);
        sb.append(10);
        sb.append("TIME=");
        sb.append(Build.TIME);
        sb.append(10);
        sb.append("TYPE=");
        sb.append(Build.TYPE);
        sb.append(10);
        sb.append("USER=");
        sb.append(Build.USER);
        sb.append(10);
        sb.append("VERSION.CODENAME=");
        sb.append(Build.VERSION.CODENAME);
        sb.append(10);
        sb.append("VERSION.INCREMENTAL=");
        sb.append(Build.VERSION.INCREMENTAL);
        sb.append(10);
        sb.append("VERSION.RELEASE=");
        sb.append(Build.VERSION.RELEASE);
        sb.append(10);
        sb.append("VERSION.SDK_INT=");
        sb.append(Build.VERSION.SDK_INT);
        sb.append(10);
        if (charSequence != null) {
            String[] split = SEMICOLON.split(charSequence);
            Arrays.sort(split);
            for (String append : split) {
                sb.append(append);
                sb.append(10);
            }
        }
        return sb.toString();
    }

    public static Point findBestPreviewSizeValue(Camera.Parameters parameters, Point point) {
        List<Camera.Size> supportedPreviewSizes = parameters.getSupportedPreviewSizes();
        if (supportedPreviewSizes == null) {
            Camera.Size previewSize = parameters.getPreviewSize();
            if (previewSize != null) {
                return new Point(previewSize.width, previewSize.height);
            }
            throw new IllegalStateException("Parameters contained no preview size!");
        }
        ArrayList<Camera.Size> arrayList = new ArrayList<>(supportedPreviewSizes);
        Collections.sort(arrayList, new Comparator<Camera.Size>() {
            public int compare(Camera.Size size, Camera.Size size2) {
                int i = size.height * size.width;
                int i2 = size2.height * size2.width;
                if (i2 < i) {
                    return -1;
                }
                return i2 > i ? 1 : 0;
            }
        });
        if (Log.isLoggable(TAG, 4)) {
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
                if (i * i2 >= MIN_PREVIEW_PIXELS) {
                    if (i < i2) {
                        z = true;
                    }
                    int i3 = z ? i2 : i;
                    int i4 = z ? i : i2;
                    double d4 = (double) i3;
                    double d5 = (double) i4;
                    Double.isNaN(d4);
                    Double.isNaN(d5);
                    if (Math.abs((d4 / d5) - d3) <= MAX_ASPECT_DISTORTION) {
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

    private static String findSettableValue(String str, Collection<String> collection, String... strArr) {
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

    private static Integer indexOfClosestZoom(Camera.Parameters parameters, double d) {
        List<Integer> zoomRatios = parameters.getZoomRatios();
        "Zoom ratios: " + zoomRatios;
        int maxZoom = parameters.getMaxZoom();
        if (zoomRatios == null || zoomRatios.isEmpty() || zoomRatios.size() != maxZoom + 1) {
            return null;
        }
        double d2 = d * 100.0d;
        double d3 = Double.POSITIVE_INFINITY;
        int i = 0;
        for (int i2 = 0; i2 < zoomRatios.size(); i2++) {
            double intValue = (double) zoomRatios.get(i2).intValue();
            Double.isNaN(intValue);
            double abs = Math.abs(intValue - d2);
            if (abs < d3) {
                i = i2;
                d3 = abs;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Chose zoom ratio of ");
        double intValue2 = (double) zoomRatios.get(i).intValue();
        Double.isNaN(intValue2);
        sb.append(intValue2 / 100.0d);
        sb.toString();
        return Integer.valueOf(i);
    }

    public static void setBarcodeSceneMode(Camera.Parameters parameters) {
        String findSettableValue;
        if (!"barcode".equals(parameters.getSceneMode()) && (findSettableValue = findSettableValue("scene mode", parameters.getSupportedSceneModes(), "barcode")) != null) {
            parameters.setSceneMode(findSettableValue);
        }
    }

    public static void setBestExposure(Camera.Parameters parameters, boolean z) {
        int minExposureCompensation = parameters.getMinExposureCompensation();
        int maxExposureCompensation = parameters.getMaxExposureCompensation();
        float exposureCompensationStep = parameters.getExposureCompensationStep();
        if (minExposureCompensation != 0 || maxExposureCompensation != 0) {
            float f = 0.0f;
            if (exposureCompensationStep > 0.0f) {
                if (!z) {
                    f = MAX_EXPOSURE_COMPENSATION;
                }
                int round = Math.round(f / exposureCompensationStep);
                float f2 = exposureCompensationStep * ((float) round);
                int max = Math.max(Math.min(round, maxExposureCompensation), minExposureCompensation);
                if (parameters.getExposureCompensation() == max) {
                    "Exposure compensation already set to " + max + " / " + f2;
                    return;
                }
                "Setting exposure compensation to " + max + " / " + f2;
                parameters.setExposureCompensation(max);
            }
        }
    }

    public static void setBestPreviewFPS(Camera.Parameters parameters) {
        setBestPreviewFPS(parameters, 10, 20);
    }

    public static void setBestPreviewFPS(Camera.Parameters parameters, int i, int i2) {
        List<int[]> supportedPreviewFpsRange = parameters.getSupportedPreviewFpsRange();
        "Supported FPS ranges: " + toString((Collection<int[]>) supportedPreviewFpsRange);
        if (supportedPreviewFpsRange != null && !supportedPreviewFpsRange.isEmpty()) {
            int[] iArr = null;
            Iterator<int[]> it = supportedPreviewFpsRange.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                int[] next = it.next();
                int i3 = next[0];
                int i4 = next[1];
                if (i3 >= i * 1000 && i4 <= i2 * 1000) {
                    iArr = next;
                    break;
                }
            }
            if (iArr != null) {
                int[] iArr2 = new int[2];
                parameters.getPreviewFpsRange(iArr2);
                if (Arrays.equals(iArr2, iArr)) {
                    "FPS range already set to " + Arrays.toString(iArr);
                    return;
                }
                "Setting FPS range to " + Arrays.toString(iArr);
                parameters.setPreviewFpsRange(iArr[0], iArr[1]);
            }
        }
    }

    public static void setFocus(Camera.Parameters parameters, boolean z, boolean z2, boolean z3) {
        List<String> supportedFocusModes = parameters.getSupportedFocusModes();
        String findSettableValue = z ? (z3 || z2) ? findSettableValue("focus mode", supportedFocusModes, "auto") : findSettableValue("focus mode", supportedFocusModes, "continuous-picture", "continuous-video", "auto") : null;
        if (!z3 && findSettableValue == null) {
            findSettableValue = findSettableValue("focus mode", supportedFocusModes, "macro", "edof");
        }
        if (findSettableValue == null) {
            return;
        }
        if (findSettableValue.equals(parameters.getFocusMode())) {
            "Focus mode already set to " + findSettableValue;
            return;
        }
        parameters.setFocusMode(findSettableValue);
    }

    public static void setFocusArea(Camera.Parameters parameters) {
        if (parameters.getMaxNumFocusAreas() > 0) {
            "Old focus areas: " + toString((Iterable<Camera.Area>) parameters.getFocusAreas());
            List<Camera.Area> buildMiddleArea = buildMiddleArea(AREA_PER_1000);
            "Setting focus area to : " + toString((Iterable<Camera.Area>) buildMiddleArea);
            parameters.setFocusAreas(buildMiddleArea);
        }
    }

    public static void setInvertColor(Camera.Parameters parameters) {
        String findSettableValue;
        if (!"negative".equals(parameters.getColorEffect()) && (findSettableValue = findSettableValue("color effect", parameters.getSupportedColorEffects(), "negative")) != null) {
            parameters.setColorEffect(findSettableValue);
        }
    }

    public static void setMetering(Camera.Parameters parameters) {
        if (parameters.getMaxNumMeteringAreas() > 0) {
            "Old metering areas: " + parameters.getMeteringAreas();
            List<Camera.Area> buildMiddleArea = buildMiddleArea(AREA_PER_1000);
            "Setting metering area to : " + toString((Iterable<Camera.Area>) buildMiddleArea);
            parameters.setMeteringAreas(buildMiddleArea);
        }
    }

    public static void setTorch(Camera.Parameters parameters, boolean z) {
        List<String> supportedFlashModes = parameters.getSupportedFlashModes();
        String findSettableValue = z ? findSettableValue("flash mode", supportedFlashModes, "torch", "on") : findSettableValue("flash mode", supportedFlashModes, "off");
        if (findSettableValue == null) {
            return;
        }
        if (findSettableValue.equals(parameters.getFlashMode())) {
            "Flash mode already set to " + findSettableValue;
            return;
        }
        "Setting flash mode to " + findSettableValue;
        parameters.setFlashMode(findSettableValue);
    }

    public static void setVideoStabilization(Camera.Parameters parameters) {
        if (parameters.isVideoStabilizationSupported() && !parameters.getVideoStabilization()) {
            parameters.setVideoStabilization(true);
        }
    }

    public static void setZoom(Camera.Parameters parameters, double d) {
        Integer indexOfClosestZoom;
        if (parameters.isZoomSupported() && (indexOfClosestZoom = indexOfClosestZoom(parameters, d)) != null) {
            if (parameters.getZoom() == indexOfClosestZoom.intValue()) {
                "Zoom is already set to " + indexOfClosestZoom;
                return;
            }
            "Setting zoom to " + indexOfClosestZoom;
            parameters.setZoom(indexOfClosestZoom.intValue());
        }
    }

    private static String toString(Iterable<Camera.Area> iterable) {
        if (iterable == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (Camera.Area next : iterable) {
            sb.append(next.rect);
            sb.append(':');
            sb.append(next.weight);
            sb.append(' ');
        }
        return sb.toString();
    }

    private static String toString(Collection<int[]> collection) {
        if (collection == null || collection.isEmpty()) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        Iterator<int[]> it = collection.iterator();
        while (it.hasNext()) {
            sb.append(Arrays.toString(it.next()));
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(']');
        return sb.toString();
    }
}
