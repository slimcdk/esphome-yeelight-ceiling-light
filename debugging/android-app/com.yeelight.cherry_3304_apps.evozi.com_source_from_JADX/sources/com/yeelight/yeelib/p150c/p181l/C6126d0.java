package com.yeelight.yeelib.p150c.p181l;

import android.content.res.Resources;
import android.os.Build;
import com.miot.service.manager.timer.TimerCodec;
import com.yeelight.yeelib.R$drawable;
import com.yeelight.yeelib.R$string;
import com.yeelight.yeelib.p150c.p151i.C4198d;
import com.yeelight.yeelib.p150c.p151i.C6038h;
import com.yeelight.yeelib.p152f.C4297y;
import com.yeelight.yeelib.service.ShortcutUtils;
import com.yeelight.yeelib.utils.C4308b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.yeelight.yeelib.c.l.d0 */
public class C6126d0 {
    /* renamed from: A */
    private static List<C6122c0> m18370A(C4198d dVar) {
        Resources resources = C4297y.f7456e.getResources();
        ArrayList arrayList = new ArrayList();
        int[] iArr = {0, 50, 23, 9, 34, 16};
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < 6; i++) {
            C6038h b = m18435b(iArr[i], dVar);
            if (b != null) {
                arrayList2.add(b);
                dVar.mo23365B0(b);
            }
        }
        if (arrayList2.size() > 0) {
            arrayList.add(new C6122c0(resources.getString(R$string.feature_group_device), arrayList2));
        }
        return arrayList;
    }

    /* renamed from: A0 */
    private static List<C6122c0> m18371A0(C4198d dVar) {
        Resources resources = C4297y.f7456e.getResources();
        ArrayList arrayList = new ArrayList();
        int[] iArr = {0, 40, 23, 9, 34, 16};
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < 6; i++) {
            C6038h b = m18435b(iArr[i], dVar);
            if (b != null) {
                arrayList2.add(b);
                dVar.mo23365B0(b);
            }
        }
        if (arrayList2.size() > 0) {
            arrayList.add(new C6122c0(resources.getString(R$string.feature_group_device), arrayList2));
        }
        return arrayList;
    }

    /* renamed from: A1 */
    private static List<C6038h> m18372A1(C4198d dVar) {
        int[] iArr = {29, 27, 2, 1, 15, 21, 22, 5, 18};
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 9; i++) {
            C6038h c = m18438c(iArr[i], dVar);
            if (c != null) {
                arrayList.add(c);
                dVar.mo23365B0(c);
            }
        }
        return arrayList;
    }

    /* renamed from: B */
    private static Map<Integer, String> m18373B() {
        HashMap hashMap = new HashMap();
        hashMap.put(29, TimerCodec.DISENABLE);
        hashMap.put(0, TimerCodec.DISENABLE);
        hashMap.put(1, TimerCodec.DISENABLE);
        hashMap.put(2, TimerCodec.DISENABLE);
        hashMap.put(5, TimerCodec.DISENABLE);
        hashMap.put(9, TimerCodec.DISENABLE);
        hashMap.put(15, TimerCodec.DISENABLE);
        hashMap.put(18, TimerCodec.DISENABLE);
        hashMap.put(20, TimerCodec.DISENABLE);
        hashMap.put(23, TimerCodec.DISENABLE);
        hashMap.put(25, TimerCodec.DISENABLE);
        hashMap.put(3, TimerCodec.DISENABLE);
        hashMap.put(30, TimerCodec.DISENABLE);
        hashMap.put(31, TimerCodec.DISENABLE);
        hashMap.put(32, TimerCodec.DISENABLE);
        hashMap.put(34, TimerCodec.DISENABLE);
        hashMap.put(36, TimerCodec.DISENABLE);
        hashMap.put(38, TimerCodec.DISENABLE);
        hashMap.put(16, TimerCodec.DISENABLE);
        hashMap.put(50, TimerCodec.DISENABLE);
        hashMap.put(51, TimerCodec.DISENABLE);
        return hashMap;
    }

    /* renamed from: B0 */
    private static List<C6038h> m18374B0(C4198d dVar) {
        int[] iArr = {29, 1, 2, 15, 5, 18};
        int[] iArr2 = {36};
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 6; i++) {
            C6038h c = m18438c(iArr[i], dVar);
            if (c != null) {
                arrayList.add(c);
                dVar.mo23365B0(c);
            }
        }
        if (C4308b.f7482a) {
            for (int i2 = 0; i2 < 1; i2++) {
                C6038h c2 = m18438c(iArr2[i2], dVar);
                if (c2 != null) {
                    arrayList.add(c2);
                    dVar.mo23365B0(c2);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: B1 */
    private static Map<Integer, String> m18375B1() {
        HashMap hashMap = new HashMap();
        hashMap.put(29, TimerCodec.DISENABLE);
        hashMap.put(0, TimerCodec.DISENABLE);
        hashMap.put(1, TimerCodec.DISENABLE);
        hashMap.put(2, TimerCodec.DISENABLE);
        hashMap.put(5, TimerCodec.DISENABLE);
        hashMap.put(9, TimerCodec.DISENABLE);
        hashMap.put(15, TimerCodec.DISENABLE);
        hashMap.put(18, TimerCodec.DISENABLE);
        hashMap.put(21, TimerCodec.DISENABLE);
        hashMap.put(22, TimerCodec.DISENABLE);
        hashMap.put(23, TimerCodec.DISENABLE);
        hashMap.put(27, TimerCodec.DISENABLE);
        hashMap.put(30, "39");
        hashMap.put(31, "41");
        hashMap.put(34, TimerCodec.DISENABLE);
        hashMap.put(16, TimerCodec.DISENABLE);
        return hashMap;
    }

    /* renamed from: C */
    private static List<C6122c0> m18376C(C4198d dVar) {
        Resources resources = C4297y.f7456e.getResources();
        ArrayList arrayList = new ArrayList();
        int[] iArr = {0, 38, 50, 23, 32, 9, 34, 16};
        int[] iArr2 = {36};
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < 8; i++) {
            C6038h b = m18435b(iArr[i], dVar);
            if (b != null) {
                arrayList2.add(b);
                dVar.mo23365B0(b);
            }
        }
        if (C4308b.f7482a) {
            for (int i2 = 0; i2 < 1; i2++) {
                C6038h c = m18438c(iArr2[i2], dVar);
                if (c != null) {
                    arrayList2.add(c);
                    dVar.mo23365B0(c);
                }
            }
        }
        if (arrayList2.size() > 0) {
            arrayList.add(new C6122c0(resources.getString(R$string.feature_group_device), arrayList2));
        }
        return arrayList;
    }

    /* renamed from: C0 */
    private static Map<Integer, String> m18377C0() {
        HashMap hashMap = new HashMap();
        hashMap.put(29, TimerCodec.DISENABLE);
        hashMap.put(0, TimerCodec.DISENABLE);
        hashMap.put(1, TimerCodec.DISENABLE);
        hashMap.put(2, TimerCodec.DISENABLE);
        hashMap.put(5, TimerCodec.DISENABLE);
        hashMap.put(9, TimerCodec.DISENABLE);
        hashMap.put(15, TimerCodec.DISENABLE);
        hashMap.put(18, TimerCodec.DISENABLE);
        hashMap.put(23, TimerCodec.DISENABLE);
        hashMap.put(30, TimerCodec.DISENABLE);
        hashMap.put(31, TimerCodec.DISENABLE);
        hashMap.put(32, TimerCodec.DISENABLE);
        hashMap.put(34, TimerCodec.DISENABLE);
        hashMap.put(36, TimerCodec.DISENABLE);
        hashMap.put(16, TimerCodec.DISENABLE);
        return hashMap;
    }

    /* renamed from: C1 */
    private static List<C6122c0> m18378C1(C4198d dVar) {
        return m18433a0(dVar);
    }

    /* renamed from: D */
    private static List<C6038h> m18379D(C4198d dVar) {
        int[] iArr = {29, 27, 2, 1, 3, 4, 8};
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 7; i++) {
            C6038h c = m18438c(iArr[i], dVar);
            if (c != null) {
                arrayList.add(c);
                dVar.mo23365B0(c);
            }
        }
        return arrayList;
    }

    /* renamed from: D0 */
    private static List<C6038h> m18380D0(C4198d dVar) {
        int[] iArr = {29, 1, 2, 15, 5, 18};
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 6; i++) {
            C6038h c = m18438c(iArr[i], dVar);
            if (c != null) {
                arrayList.add(c);
                dVar.mo23365B0(c);
            }
        }
        return arrayList;
    }

    /* renamed from: D1 */
    private static List<C6038h> m18381D1(C4198d dVar) {
        int[] iArr = {1, 15, 5};
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 3; i++) {
            C6038h c = m18438c(iArr[i], dVar);
            if (c != null) {
                arrayList.add(c);
                dVar.mo23365B0(c);
            }
        }
        return arrayList;
    }

    /* renamed from: E */
    private static Map<Integer, String> m18382E() {
        HashMap hashMap = new HashMap();
        hashMap.put(6, TimerCodec.DISENABLE);
        hashMap.put(29, TimerCodec.DISENABLE);
        hashMap.put(0, TimerCodec.DISENABLE);
        hashMap.put(1, TimerCodec.DISENABLE);
        hashMap.put(2, "2230");
        hashMap.put(3, TimerCodec.DISENABLE);
        hashMap.put(4, "2230");
        hashMap.put(8, "2218");
        hashMap.put(9, TimerCodec.DISENABLE);
        hashMap.put(10, TimerCodec.DISENABLE);
        hashMap.put(13, "2233");
        hashMap.put(14, TimerCodec.DISENABLE);
        hashMap.put(16, TimerCodec.DISENABLE);
        if (Build.VERSION.SDK_INT < 26 || ShortcutUtils.isShortcutSupported()) {
            hashMap.put(23, TimerCodec.DISENABLE);
        } else {
            hashMap.put(23, "-1");
        }
        hashMap.put(24, TimerCodec.DISENABLE);
        hashMap.put(27, TimerCodec.DISENABLE);
        hashMap.put(5, TimerCodec.DISENABLE);
        return hashMap;
    }

    /* renamed from: E0 */
    private static Map<Integer, String> m18383E0() {
        HashMap hashMap = new HashMap();
        hashMap.put(29, TimerCodec.DISENABLE);
        hashMap.put(0, TimerCodec.DISENABLE);
        hashMap.put(1, TimerCodec.DISENABLE);
        hashMap.put(2, TimerCodec.DISENABLE);
        hashMap.put(15, TimerCodec.DISENABLE);
        hashMap.put(18, TimerCodec.DISENABLE);
        hashMap.put(5, TimerCodec.DISENABLE);
        hashMap.put(9, TimerCodec.DISENABLE);
        if (Build.VERSION.SDK_INT < 26 || ShortcutUtils.isShortcutSupported()) {
            hashMap.put(23, TimerCodec.DISENABLE);
        } else {
            hashMap.put(23, "-1");
        }
        hashMap.put(30, TimerCodec.DISENABLE);
        hashMap.put(31, TimerCodec.DISENABLE);
        hashMap.put(34, TimerCodec.DISENABLE);
        hashMap.put(16, TimerCodec.DISENABLE);
        return hashMap;
    }

    /* renamed from: E1 */
    private static Map<Integer, String> m18384E1() {
        HashMap hashMap = new HashMap();
        hashMap.put(0, TimerCodec.DISENABLE);
        hashMap.put(9, TimerCodec.DISENABLE);
        hashMap.put(5, TimerCodec.DISENABLE);
        hashMap.put(34, TimerCodec.DISENABLE);
        hashMap.put(16, TimerCodec.DISENABLE);
        hashMap.put(1, TimerCodec.DISENABLE);
        hashMap.put(15, TimerCodec.DISENABLE);
        hashMap.put(25, TimerCodec.DISENABLE);
        hashMap.put(38, TimerCodec.DISENABLE);
        return hashMap;
    }

    /* renamed from: F */
    private static List<C6122c0> m18385F(C4198d dVar) {
        Resources resources = C4297y.f7456e.getResources();
        ArrayList arrayList = new ArrayList();
        int[] iArr = {0, 23, 16};
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < 3; i++) {
            C6038h b = m18435b(iArr[i], dVar);
            if (b != null) {
                arrayList2.add(b);
                dVar.mo23365B0(b);
            }
        }
        arrayList.add(new C6122c0(resources.getString(R$string.feature_group_device), arrayList2));
        int[] iArr2 = {13, 9, 6, 10};
        ArrayList arrayList3 = new ArrayList();
        for (int i2 = 0; i2 < 4; i2++) {
            C6038h b2 = m18435b(iArr2[i2], dVar);
            if (b2 != null) {
                arrayList3.add(b2);
                dVar.mo23365B0(b2);
            }
        }
        arrayList.add(new C6122c0(resources.getString(R$string.feature_group_connect), arrayList3));
        return arrayList;
    }

    /* renamed from: F0 */
    private static Map<Integer, String> m18386F0() {
        HashMap hashMap = new HashMap();
        hashMap.put(29, TimerCodec.DISENABLE);
        hashMap.put(0, TimerCodec.DISENABLE);
        hashMap.put(17, TimerCodec.DISENABLE);
        hashMap.put(1, TimerCodec.DISENABLE);
        hashMap.put(2, TimerCodec.DISENABLE);
        hashMap.put(11, TimerCodec.DISENABLE);
        hashMap.put(15, TimerCodec.DISENABLE);
        hashMap.put(19, TimerCodec.DISENABLE);
        hashMap.put(5, TimerCodec.DISENABLE);
        hashMap.put(9, TimerCodec.DISENABLE);
        hashMap.put(23, TimerCodec.DISENABLE);
        hashMap.put(31, TimerCodec.DISENABLE);
        hashMap.put(34, TimerCodec.DISENABLE);
        hashMap.put(30, TimerCodec.DISENABLE);
        hashMap.put(16, TimerCodec.DISENABLE);
        return hashMap;
    }

    /* renamed from: F1 */
    private static List<C6122c0> m18387F1(C4198d dVar) {
        Resources resources = C4297y.f7456e.getResources();
        ArrayList arrayList = new ArrayList();
        int[] iArr = {0, 25, 38, 9, 34, 16};
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < 6; i++) {
            C6038h b = m18435b(iArr[i], dVar);
            if (b != null) {
                arrayList2.add(b);
                dVar.mo23365B0(b);
            }
        }
        arrayList.add(new C6122c0(resources.getString(R$string.feature_group_device), arrayList2));
        return arrayList;
    }

    /* renamed from: G */
    private static List<C6038h> m18388G(C4198d dVar) {
        int[] iArr = {29, 27, 2, 1, 15, 5};
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 6; i++) {
            C6038h c = m18438c(iArr[i], dVar);
            if (c != null) {
                arrayList.add(c);
                dVar.mo23365B0(c);
            }
        }
        return arrayList;
    }

    /* renamed from: G0 */
    private static List<C6038h> m18389G0(C4198d dVar) {
        int[] iArr = {29, 1, 2, 15, 5, 18};
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 6; i++) {
            C6038h c = m18438c(iArr[i], dVar);
            if (c != null) {
                arrayList.add(c);
                dVar.mo23365B0(c);
            }
        }
        return arrayList;
    }

    /* renamed from: G1 */
    private static Map<Integer, String> m18390G1() {
        HashMap hashMap = new HashMap();
        hashMap.put(29, TimerCodec.DISENABLE);
        hashMap.put(0, TimerCodec.DISENABLE);
        hashMap.put(1, TimerCodec.DISENABLE);
        hashMap.put(2, TimerCodec.DISENABLE);
        hashMap.put(5, TimerCodec.DISENABLE);
        hashMap.put(9, TimerCodec.DISENABLE);
        hashMap.put(15, TimerCodec.DISENABLE);
        hashMap.put(18, TimerCodec.DISENABLE);
        hashMap.put(21, TimerCodec.DISENABLE);
        if (Build.VERSION.SDK_INT < 26 || ShortcutUtils.isShortcutSupported()) {
            hashMap.put(23, TimerCodec.DISENABLE);
        } else {
            hashMap.put(23, "-1");
        }
        hashMap.put(27, TimerCodec.DISENABLE);
        hashMap.put(30, TimerCodec.DISENABLE);
        hashMap.put(31, TimerCodec.DISENABLE);
        hashMap.put(34, TimerCodec.DISENABLE);
        hashMap.put(16, TimerCodec.DISENABLE);
        return hashMap;
    }

    /* renamed from: H */
    private static Map<Integer, String> m18391H() {
        HashMap hashMap = new HashMap();
        hashMap.put(29, TimerCodec.DISENABLE);
        hashMap.put(0, TimerCodec.DISENABLE);
        hashMap.put(1, TimerCodec.DISENABLE);
        hashMap.put(2, TimerCodec.DISENABLE);
        hashMap.put(5, TimerCodec.DISENABLE);
        hashMap.put(9, TimerCodec.DISENABLE);
        hashMap.put(15, TimerCodec.DISENABLE);
        if (Build.VERSION.SDK_INT < 26 || ShortcutUtils.isShortcutSupported()) {
            hashMap.put(23, TimerCodec.DISENABLE);
        } else {
            hashMap.put(23, "-1");
        }
        hashMap.put(27, TimerCodec.DISENABLE);
        hashMap.put(30, TimerCodec.DISENABLE);
        hashMap.put(31, TimerCodec.DISENABLE);
        hashMap.put(34, TimerCodec.DISENABLE);
        hashMap.put(16, TimerCodec.DISENABLE);
        hashMap.put(50, TimerCodec.DISENABLE);
        return hashMap;
    }

    /* renamed from: H0 */
    private static Map<Integer, String> m18392H0() {
        HashMap hashMap = new HashMap();
        hashMap.put(29, TimerCodec.DISENABLE);
        hashMap.put(0, TimerCodec.DISENABLE);
        hashMap.put(17, TimerCodec.DISENABLE);
        hashMap.put(1, TimerCodec.DISENABLE);
        hashMap.put(2, TimerCodec.DISENABLE);
        hashMap.put(11, TimerCodec.DISENABLE);
        hashMap.put(15, TimerCodec.DISENABLE);
        hashMap.put(18, TimerCodec.DISENABLE);
        hashMap.put(5, TimerCodec.DISENABLE);
        hashMap.put(9, TimerCodec.DISENABLE);
        hashMap.put(23, TimerCodec.DISENABLE);
        hashMap.put(30, TimerCodec.DISENABLE);
        hashMap.put(31, TimerCodec.DISENABLE);
        hashMap.put(34, TimerCodec.DISENABLE);
        hashMap.put(16, TimerCodec.DISENABLE);
        hashMap.put(41, TimerCodec.DISENABLE);
        hashMap.put(42, TimerCodec.DISENABLE);
        hashMap.put(43, TimerCodec.DISENABLE);
        return hashMap;
    }

    /* renamed from: H1 */
    private static List<C6038h> m18393H1(C4198d dVar) {
        int[] iArr = {29, 27, 2, 1, 15, 21, 5, 18};
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 8; i++) {
            C6038h c = m18438c(iArr[i], dVar);
            if (c != null) {
                arrayList.add(c);
                dVar.mo23365B0(c);
            }
        }
        return arrayList;
    }

    /* renamed from: I */
    private static Map<Integer, String> m18394I() {
        HashMap hashMap = new HashMap();
        hashMap.put(29, TimerCodec.DISENABLE);
        hashMap.put(0, TimerCodec.DISENABLE);
        hashMap.put(1, TimerCodec.DISENABLE);
        hashMap.put(2, TimerCodec.DISENABLE);
        hashMap.put(5, TimerCodec.DISENABLE);
        hashMap.put(9, TimerCodec.DISENABLE);
        hashMap.put(15, TimerCodec.DISENABLE);
        hashMap.put(18, TimerCodec.DISENABLE);
        hashMap.put(21, TimerCodec.DISENABLE);
        if (Build.VERSION.SDK_INT < 26 || ShortcutUtils.isShortcutSupported()) {
            hashMap.put(23, TimerCodec.DISENABLE);
        } else {
            hashMap.put(23, "-1");
        }
        hashMap.put(27, TimerCodec.DISENABLE);
        hashMap.put(30, TimerCodec.DISENABLE);
        hashMap.put(31, TimerCodec.DISENABLE);
        hashMap.put(34, TimerCodec.DISENABLE);
        hashMap.put(38, TimerCodec.DISENABLE);
        hashMap.put(16, TimerCodec.DISENABLE);
        return hashMap;
    }

    /* renamed from: I0 */
    private static List<C6122c0> m18395I0(C4198d dVar) {
        Resources resources = C4297y.f7456e.getResources();
        ArrayList arrayList = new ArrayList();
        int[] iArr = {0, 42, 43, 23, 9, 34, 16};
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < 7; i++) {
            C6038h b = m18435b(iArr[i], dVar);
            if (b != null) {
                arrayList2.add(b);
                dVar.mo23365B0(b);
            }
        }
        if (arrayList2.size() > 0) {
            arrayList.add(new C6122c0(resources.getString(R$string.feature_group_device), arrayList2));
        }
        return arrayList;
    }

    /* renamed from: I1 */
    private static Map<Integer, String> m18396I1() {
        HashMap hashMap = new HashMap();
        hashMap.put(29, TimerCodec.DISENABLE);
        hashMap.put(0, TimerCodec.DISENABLE);
        hashMap.put(1, TimerCodec.DISENABLE);
        hashMap.put(2, TimerCodec.DISENABLE);
        hashMap.put(5, TimerCodec.DISENABLE);
        hashMap.put(9, TimerCodec.DISENABLE);
        hashMap.put(15, TimerCodec.DISENABLE);
        hashMap.put(18, "32");
        hashMap.put(21, TimerCodec.DISENABLE);
        if (Build.VERSION.SDK_INT < 26 || ShortcutUtils.isShortcutSupported()) {
            hashMap.put(23, TimerCodec.DISENABLE);
        } else {
            hashMap.put(23, "-1");
        }
        hashMap.put(27, TimerCodec.DISENABLE);
        hashMap.put(31, "59");
        hashMap.put(34, TimerCodec.DISENABLE);
        hashMap.put(16, TimerCodec.DISENABLE);
        return hashMap;
    }

    /* renamed from: J */
    private static List<C6122c0> m18397J(C4198d dVar) {
        return m18501x(dVar);
    }

    /* renamed from: J0 */
    private static List<C6038h> m18398J0(C4198d dVar) {
        int[] iArr = {29, 2, 1, 3, 15, 5, 18};
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 7; i++) {
            C6038h c = m18438c(iArr[i], dVar);
            if (c != null) {
                arrayList.add(c);
                dVar.mo23365B0(c);
            }
        }
        return arrayList;
    }

    /* renamed from: J1 */
    private static List<C6038h> m18399J1(C4198d dVar) {
        int[] iArr = {29, 1, 2, 25, 20, 15, 5, 18};
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 8; i++) {
            C6038h c = m18438c(iArr[i], dVar);
            if (c != null) {
                arrayList.add(c);
                dVar.mo23365B0(c);
            }
        }
        return arrayList;
    }

    /* renamed from: K */
    private static Map<Integer, String> m18400K() {
        HashMap hashMap = new HashMap();
        hashMap.put(29, TimerCodec.DISENABLE);
        hashMap.put(0, TimerCodec.DISENABLE);
        hashMap.put(1, TimerCodec.DISENABLE);
        hashMap.put(2, TimerCodec.DISENABLE);
        hashMap.put(5, TimerCodec.DISENABLE);
        hashMap.put(9, TimerCodec.DISENABLE);
        hashMap.put(15, TimerCodec.DISENABLE);
        hashMap.put(18, TimerCodec.DISENABLE);
        hashMap.put(21, TimerCodec.DISENABLE);
        if (Build.VERSION.SDK_INT < 26 || ShortcutUtils.isShortcutSupported()) {
            hashMap.put(23, TimerCodec.DISENABLE);
        } else {
            hashMap.put(23, "-1");
        }
        hashMap.put(27, TimerCodec.DISENABLE);
        hashMap.put(30, TimerCodec.DISENABLE);
        hashMap.put(31, TimerCodec.DISENABLE);
        hashMap.put(34, TimerCodec.DISENABLE);
        hashMap.put(16, TimerCodec.DISENABLE);
        hashMap.put(50, TimerCodec.DISENABLE);
        return hashMap;
    }

    /* renamed from: K0 */
    private static Map<Integer, String> m18401K0() {
        HashMap hashMap = new HashMap();
        hashMap.put(29, TimerCodec.DISENABLE);
        hashMap.put(0, TimerCodec.DISENABLE);
        hashMap.put(17, TimerCodec.DISENABLE);
        hashMap.put(1, TimerCodec.DISENABLE);
        hashMap.put(2, TimerCodec.DISENABLE);
        hashMap.put(11, TimerCodec.DISENABLE);
        hashMap.put(15, TimerCodec.DISENABLE);
        hashMap.put(18, TimerCodec.DISENABLE);
        hashMap.put(5, TimerCodec.DISENABLE);
        hashMap.put(9, TimerCodec.DISENABLE);
        hashMap.put(23, TimerCodec.DISENABLE);
        hashMap.put(30, TimerCodec.DISENABLE);
        hashMap.put(31, TimerCodec.DISENABLE);
        hashMap.put(34, TimerCodec.DISENABLE);
        hashMap.put(16, TimerCodec.DISENABLE);
        hashMap.put(3, TimerCodec.DISENABLE);
        return hashMap;
    }

    /* renamed from: L */
    private static List<C6038h> m18402L(C4198d dVar) {
        int[] iArr = {29, 2, 1, 15, 21, 5, 18};
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 7; i++) {
            C6038h c = m18438c(iArr[i], dVar);
            if (c != null) {
                arrayList.add(c);
                dVar.mo23365B0(c);
            }
        }
        return arrayList;
    }

    /* renamed from: L0 */
    private static List<C6038h> m18403L0(C4198d dVar) {
        int[] iArr = {29, 1, 2, 3, 25, 20, 15, 5, 18};
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 9; i++) {
            C6038h c = m18438c(iArr[i], dVar);
            if (c != null) {
                arrayList.add(c);
                dVar.mo23365B0(c);
            }
        }
        return arrayList;
    }

    /* renamed from: M */
    private static Map<Integer, String> m18404M() {
        HashMap hashMap = new HashMap();
        hashMap.put(29, TimerCodec.DISENABLE);
        hashMap.put(0, TimerCodec.DISENABLE);
        hashMap.put(1, TimerCodec.DISENABLE);
        hashMap.put(2, TimerCodec.DISENABLE);
        hashMap.put(5, TimerCodec.DISENABLE);
        hashMap.put(9, TimerCodec.DISENABLE);
        hashMap.put(15, TimerCodec.DISENABLE);
        hashMap.put(18, TimerCodec.DISENABLE);
        hashMap.put(21, TimerCodec.DISENABLE);
        if (Build.VERSION.SDK_INT < 26 || ShortcutUtils.isShortcutSupported()) {
            hashMap.put(23, TimerCodec.DISENABLE);
        } else {
            hashMap.put(23, "-1");
        }
        hashMap.put(30, TimerCodec.DISENABLE);
        hashMap.put(31, TimerCodec.DISENABLE);
        hashMap.put(34, TimerCodec.DISENABLE);
        hashMap.put(16, TimerCodec.DISENABLE);
        return hashMap;
    }

    /* renamed from: M0 */
    private static Map<Integer, String> m18405M0() {
        HashMap hashMap = new HashMap();
        hashMap.put(29, TimerCodec.DISENABLE);
        hashMap.put(0, TimerCodec.DISENABLE);
        hashMap.put(1, TimerCodec.DISENABLE);
        hashMap.put(2, TimerCodec.DISENABLE);
        hashMap.put(5, TimerCodec.DISENABLE);
        hashMap.put(9, TimerCodec.DISENABLE);
        hashMap.put(15, TimerCodec.DISENABLE);
        hashMap.put(18, TimerCodec.DISENABLE);
        hashMap.put(20, TimerCodec.DISENABLE);
        hashMap.put(23, TimerCodec.DISENABLE);
        hashMap.put(25, TimerCodec.DISENABLE);
        hashMap.put(3, TimerCodec.DISENABLE);
        hashMap.put(30, "70");
        hashMap.put(31, TimerCodec.DISENABLE);
        hashMap.put(34, TimerCodec.DISENABLE);
        hashMap.put(16, TimerCodec.DISENABLE);
        return hashMap;
    }

    /* renamed from: N */
    private static List<C6122c0> m18406N(C4198d dVar) {
        Resources resources = C4297y.f7456e.getResources();
        ArrayList arrayList = new ArrayList();
        int[] iArr = {0, 23, 9, 34, 16};
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < 5; i++) {
            C6038h b = m18435b(iArr[i], dVar);
            if (b != null) {
                arrayList2.add(b);
                dVar.mo23365B0(b);
            }
        }
        if (arrayList2.size() > 0) {
            arrayList.add(new C6122c0(resources.getString(R$string.feature_group_device), arrayList2));
        }
        return arrayList;
    }

    /* renamed from: N0 */
    private static List<C6038h> m18407N0(C4198d dVar) {
        int[] iArr = {29, 1, 2, 25, 20, 15, 5, 18};
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 8; i++) {
            C6038h c = m18438c(iArr[i], dVar);
            if (c != null) {
                arrayList.add(c);
                dVar.mo23365B0(c);
            }
        }
        return arrayList;
    }

    /* renamed from: O */
    private static List<C6122c0> m18408O(C4198d dVar) {
        return m18433a0(dVar);
    }

    /* renamed from: O0 */
    private static Map<Integer, String> m18409O0() {
        HashMap hashMap = new HashMap();
        hashMap.put(29, TimerCodec.DISENABLE);
        hashMap.put(0, TimerCodec.DISENABLE);
        hashMap.put(1, TimerCodec.DISENABLE);
        hashMap.put(2, TimerCodec.DISENABLE);
        hashMap.put(5, TimerCodec.DISENABLE);
        hashMap.put(9, TimerCodec.DISENABLE);
        hashMap.put(15, TimerCodec.DISENABLE);
        hashMap.put(18, TimerCodec.DISENABLE);
        hashMap.put(20, TimerCodec.DISENABLE);
        hashMap.put(23, TimerCodec.DISENABLE);
        hashMap.put(25, TimerCodec.DISENABLE);
        hashMap.put(3, TimerCodec.DISENABLE);
        hashMap.put(30, "16");
        hashMap.put(31, TimerCodec.DISENABLE);
        hashMap.put(34, TimerCodec.DISENABLE);
        hashMap.put(16, TimerCodec.DISENABLE);
        return hashMap;
    }

    /* renamed from: P */
    private static List<C6122c0> m18410P(C4198d dVar) {
        Resources resources = C4297y.f7456e.getResources();
        ArrayList arrayList = new ArrayList();
        int[] iArr = {0, 50, 23, 9, 34, 16};
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < 6; i++) {
            C6038h b = m18435b(iArr[i], dVar);
            if (b != null) {
                arrayList2.add(b);
                dVar.mo23365B0(b);
            }
        }
        if (arrayList2.size() > 0) {
            arrayList.add(new C6122c0(resources.getString(R$string.feature_group_device), arrayList2));
        }
        return arrayList;
    }

    /* renamed from: P0 */
    private static List<C6038h> m18411P0(C4198d dVar) {
        int[] iArr = {29, 11, 1, 2, 17, 15, 19, 5};
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 8; i++) {
            C6038h c = m18438c(iArr[i], dVar);
            if (c != null) {
                arrayList.add(c);
                dVar.mo23365B0(c);
            }
        }
        return arrayList;
    }

    /* renamed from: Q */
    private static List<C6038h> m18412Q(C4198d dVar) {
        int[] iArr = {29, 2, 1, 15, 5, 18};
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 6; i++) {
            C6038h c = m18438c(iArr[i], dVar);
            if (c != null) {
                arrayList.add(c);
                dVar.mo23365B0(c);
            }
        }
        return arrayList;
    }

    /* renamed from: Q0 */
    private static Map<Integer, String> m18413Q0() {
        HashMap hashMap = new HashMap();
        hashMap.put(29, TimerCodec.DISENABLE);
        hashMap.put(0, TimerCodec.DISENABLE);
        hashMap.put(17, TimerCodec.DISENABLE);
        hashMap.put(1, TimerCodec.DISENABLE);
        hashMap.put(2, TimerCodec.DISENABLE);
        hashMap.put(11, TimerCodec.DISENABLE);
        hashMap.put(15, TimerCodec.DISENABLE);
        hashMap.put(19, "23");
        hashMap.put(5, TimerCodec.DISENABLE);
        hashMap.put(9, TimerCodec.DISENABLE);
        hashMap.put(23, TimerCodec.DISENABLE);
        hashMap.put(30, "52");
        hashMap.put(31, "53");
        hashMap.put(34, TimerCodec.DISENABLE);
        hashMap.put(16, TimerCodec.DISENABLE);
        return hashMap;
    }

    /* renamed from: R */
    private static List<C6122c0> m18414R(C4198d dVar) {
        return m18433a0(dVar);
    }

    /* renamed from: R0 */
    private static List<C6122c0> m18415R0(C4198d dVar) {
        Resources resources = C4297y.f7456e.getResources();
        ArrayList arrayList = new ArrayList();
        int[] iArr = {0, 23, 9, 34, 16};
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < 5; i++) {
            C6038h b = m18435b(iArr[i], dVar);
            if (b != null) {
                arrayList2.add(b);
                dVar.mo23365B0(b);
            }
        }
        if (arrayList2.size() > 0) {
            arrayList.add(new C6122c0(resources.getString(R$string.feature_group_device), arrayList2));
        }
        return arrayList;
    }

    /* renamed from: S */
    private static Map<Integer, String> m18416S() {
        HashMap hashMap = new HashMap();
        hashMap.put(29, TimerCodec.DISENABLE);
        hashMap.put(0, TimerCodec.DISENABLE);
        hashMap.put(1, TimerCodec.DISENABLE);
        hashMap.put(2, TimerCodec.DISENABLE);
        hashMap.put(5, TimerCodec.DISENABLE);
        hashMap.put(9, TimerCodec.DISENABLE);
        hashMap.put(15, TimerCodec.DISENABLE);
        hashMap.put(18, TimerCodec.DISENABLE);
        if (Build.VERSION.SDK_INT < 26 || ShortcutUtils.isShortcutSupported()) {
            hashMap.put(23, TimerCodec.DISENABLE);
        } else {
            hashMap.put(23, "-1");
        }
        hashMap.put(30, TimerCodec.DISENABLE);
        hashMap.put(31, TimerCodec.DISENABLE);
        hashMap.put(34, TimerCodec.DISENABLE);
        hashMap.put(16, TimerCodec.DISENABLE);
        return hashMap;
    }

    /* renamed from: S0 */
    private static List<C6038h> m18417S0(C4198d dVar) {
        int[] iArr = {29, 2, 1, 5};
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 4; i++) {
            C6038h c = m18438c(iArr[i], dVar);
            if (c != null) {
                arrayList.add(c);
                dVar.mo23365B0(c);
            }
        }
        return arrayList;
    }

    /* renamed from: T */
    private static Map<Integer, String> m18418T() {
        HashMap hashMap = new HashMap();
        hashMap.put(29, TimerCodec.DISENABLE);
        hashMap.put(0, TimerCodec.DISENABLE);
        hashMap.put(1, TimerCodec.DISENABLE);
        hashMap.put(2, TimerCodec.DISENABLE);
        hashMap.put(5, TimerCodec.DISENABLE);
        hashMap.put(9, TimerCodec.DISENABLE);
        hashMap.put(15, TimerCodec.DISENABLE);
        hashMap.put(18, TimerCodec.DISENABLE);
        if (Build.VERSION.SDK_INT < 26 || ShortcutUtils.isShortcutSupported()) {
            hashMap.put(23, TimerCodec.DISENABLE);
        } else {
            hashMap.put(23, "-1");
        }
        hashMap.put(30, TimerCodec.DISENABLE);
        hashMap.put(31, TimerCodec.DISENABLE);
        hashMap.put(34, TimerCodec.DISENABLE);
        hashMap.put(16, TimerCodec.DISENABLE);
        hashMap.put(50, TimerCodec.DISENABLE);
        return hashMap;
    }

    /* renamed from: T0 */
    private static List<C6122c0> m18419T0(C4198d dVar) {
        return m18437b1(dVar);
    }

    /* renamed from: U */
    private static Map<Integer, String> m18420U() {
        HashMap hashMap = new HashMap();
        hashMap.put(0, TimerCodec.DISENABLE);
        hashMap.put(9, TimerCodec.DISENABLE);
        hashMap.put(5, TimerCodec.DISENABLE);
        hashMap.put(34, TimerCodec.DISENABLE);
        hashMap.put(16, TimerCodec.DISENABLE);
        hashMap.put(45, TimerCodec.DISENABLE);
        hashMap.put(46, TimerCodec.DISENABLE);
        hashMap.put(47, TimerCodec.DISENABLE);
        hashMap.put(1, TimerCodec.DISENABLE);
        hashMap.put(25, TimerCodec.DISENABLE);
        hashMap.put(49, "45");
        return hashMap;
    }

    /* renamed from: U0 */
    private static Map<Integer, String> m18421U0() {
        HashMap hashMap = new HashMap();
        hashMap.put(29, TimerCodec.DISENABLE);
        hashMap.put(0, TimerCodec.DISENABLE);
        hashMap.put(1, TimerCodec.DISENABLE);
        hashMap.put(2, TimerCodec.DISENABLE);
        hashMap.put(5, TimerCodec.DISENABLE);
        hashMap.put(9, TimerCodec.DISENABLE);
        hashMap.put(15, TimerCodec.DISENABLE);
        hashMap.put(18, "31");
        hashMap.put(23, TimerCodec.DISENABLE);
        hashMap.put(31, "54");
        hashMap.put(34, TimerCodec.DISENABLE);
        hashMap.put(30, TimerCodec.DISENABLE);
        hashMap.put(38, TimerCodec.DISENABLE);
        hashMap.put(16, TimerCodec.DISENABLE);
        return hashMap;
    }

    /* renamed from: V */
    private static List<C6122c0> m18422V(C4198d dVar) {
        Resources resources = C4297y.f7456e.getResources();
        ArrayList arrayList = new ArrayList();
        int[] iArr = {0, 47, 1, 25, 46, 45, 9, 5, 34, 16};
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < 10; i++) {
            C6038h b = m18435b(iArr[i], dVar);
            if (b != null) {
                arrayList2.add(b);
                dVar.mo23365B0(b);
            }
        }
        arrayList.add(new C6122c0(resources.getString(R$string.feature_group_device), arrayList2));
        return arrayList;
    }

    /* renamed from: V0 */
    private static Map<Integer, String> m18423V0() {
        HashMap hashMap = new HashMap();
        hashMap.put(0, TimerCodec.DISENABLE);
        hashMap.put(22, TimerCodec.DISENABLE);
        hashMap.put(9, TimerCodec.DISENABLE);
        hashMap.put(34, TimerCodec.DISENABLE);
        hashMap.put(16, TimerCodec.DISENABLE);
        hashMap.put(5, TimerCodec.DISENABLE);
        return hashMap;
    }

    /* renamed from: W */
    private static Map<Integer, String> m18424W() {
        HashMap hashMap = new HashMap();
        hashMap.put(29, TimerCodec.DISENABLE);
        hashMap.put(0, TimerCodec.DISENABLE);
        hashMap.put(1, TimerCodec.DISENABLE);
        hashMap.put(2, TimerCodec.DISENABLE);
        hashMap.put(5, TimerCodec.DISENABLE);
        hashMap.put(9, TimerCodec.DISENABLE);
        hashMap.put(15, TimerCodec.DISENABLE);
        hashMap.put(18, TimerCodec.DISENABLE);
        hashMap.put(20, TimerCodec.DISENABLE);
        if (Build.VERSION.SDK_INT < 26 || ShortcutUtils.isShortcutSupported()) {
            hashMap.put(23, TimerCodec.DISENABLE);
        } else {
            hashMap.put(23, "-1");
        }
        hashMap.put(25, TimerCodec.DISENABLE);
        hashMap.put(3, TimerCodec.DISENABLE);
        hashMap.put(30, TimerCodec.DISENABLE);
        hashMap.put(31, TimerCodec.DISENABLE);
        hashMap.put(34, TimerCodec.DISENABLE);
        hashMap.put(16, TimerCodec.DISENABLE);
        return hashMap;
    }

    /* renamed from: W0 */
    private static List<C6122c0> m18425W0(C4198d dVar) {
        Resources resources = C4297y.f7456e.getResources();
        ArrayList arrayList = new ArrayList();
        int[] iArr = {0, 22, 5, 9, 34, 16};
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < 6; i++) {
            C6038h b = m18435b(iArr[i], dVar);
            if (b != null) {
                arrayList2.add(b);
                dVar.mo23365B0(b);
            }
        }
        arrayList.add(new C6122c0(resources.getString(R$string.feature_group_device), arrayList2));
        return arrayList;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: X */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.Map<java.lang.Integer, java.lang.String> m18426X(java.lang.String r1) {
        /*
            int r0 = r1.hashCode()
            switch(r0) {
                case -1644531059: goto L_0x04c1;
                case -1494338802: goto L_0x04b6;
                case -1462015191: goto L_0x04ab;
                case -1462015190: goto L_0x04a0;
                case -1462015189: goto L_0x0495;
                case -1462015188: goto L_0x048a;
                case -1462015187: goto L_0x047f;
                case -1462015186: goto L_0x0474;
                case -1462015185: goto L_0x0469;
                case -1462015184: goto L_0x045d;
                case -1462015183: goto L_0x0451;
                case -1462015182: goto L_0x0445;
                case -1462015160: goto L_0x0439;
                case -1462015159: goto L_0x042d;
                case -1462015158: goto L_0x0421;
                case -1462015157: goto L_0x0415;
                case -1462015156: goto L_0x0409;
                case -1400275319: goto L_0x03fe;
                case -1399795410: goto L_0x03f2;
                case -1350780909: goto L_0x03e6;
                case -1317475940: goto L_0x03da;
                case -1317475939: goto L_0x03ce;
                case -1317475937: goto L_0x03c2;
                case -1317475915: goto L_0x03b6;
                case -1317475914: goto L_0x03aa;
                case -1317475913: goto L_0x039e;
                case -1317475912: goto L_0x0392;
                case -1308146495: goto L_0x0386;
                case -1308146494: goto L_0x037a;
                case -1308146493: goto L_0x036e;
                case -1308146492: goto L_0x0362;
                case -1308146491: goto L_0x0356;
                case -1308146490: goto L_0x034a;
                case -1308146488: goto L_0x033e;
                case -1308146447: goto L_0x0332;
                case -1308146446: goto L_0x0326;
                case -1308146445: goto L_0x031a;
                case -1282176368: goto L_0x030f;
                case -1235140472: goto L_0x0303;
                case -1235140471: goto L_0x02f7;
                case -1235140468: goto L_0x02eb;
                case -1235140467: goto L_0x02df;
                case -1199119278: goto L_0x02d3;
                case -1119332198: goto L_0x02c7;
                case -1063384694: goto L_0x02bb;
                case -1063384689: goto L_0x02af;
                case -1063384687: goto L_0x02a3;
                case -1063384685: goto L_0x0297;
                case -1035626052: goto L_0x028b;
                case -1035596261: goto L_0x027f;
                case -948847040: goto L_0x0273;
                case -948847038: goto L_0x0267;
                case -888668266: goto L_0x025b;
                case -888668265: goto L_0x024f;
                case -888668264: goto L_0x0243;
                case -850921852: goto L_0x0237;
                case -845289556: goto L_0x022b;
                case -845289555: goto L_0x021f;
                case -845289553: goto L_0x0213;
                case -845289551: goto L_0x0207;
                case -845289508: goto L_0x01fb;
                case -458141175: goto L_0x01ef;
                case -458141174: goto L_0x01e3;
                case -458141173: goto L_0x01d7;
                case -458141172: goto L_0x01cb;
                case -454053748: goto L_0x01bf;
                case -449944730: goto L_0x01b3;
                case -449944729: goto L_0x01a7;
                case -449944728: goto L_0x019b;
                case -449944727: goto L_0x018f;
                case -449944726: goto L_0x0183;
                case -449944724: goto L_0x0177;
                case -449944722: goto L_0x016b;
                case -448603205: goto L_0x015f;
                case -448603204: goto L_0x0153;
                case -448603202: goto L_0x0147;
                case -448603201: goto L_0x013b;
                case -448603157: goto L_0x012f;
                case -448603156: goto L_0x0123;
                case -443031172: goto L_0x0118;
                case -190173984: goto L_0x010c;
                case -190173936: goto L_0x0100;
                case 250266083: goto L_0x00f4;
                case 674030242: goto L_0x00e8;
                case 922669543: goto L_0x00dc;
                case 922669544: goto L_0x00d0;
                case 922669545: goto L_0x00c4;
                case 922669546: goto L_0x00b8;
                case 922669547: goto L_0x00ac;
                case 922669548: goto L_0x00a0;
                case 922669549: goto L_0x0094;
                case 922669550: goto L_0x0088;
                case 922669551: goto L_0x007c;
                case 1201756974: goto L_0x0070;
                case 1201757021: goto L_0x0064;
                case 1201766335: goto L_0x0059;
                case 1201766336: goto L_0x004e;
                case 1623724661: goto L_0x0042;
                case 1623724662: goto L_0x0036;
                case 1623724663: goto L_0x002a;
                case 2102612488: goto L_0x001f;
                case 2102612489: goto L_0x0014;
                case 2146130361: goto L_0x0009;
                default: goto L_0x0007;
            }
        L_0x0007:
            goto L_0x04cc
        L_0x0009:
            java.lang.String r0 = "yeelink.light.dnlight2"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x04cc
            r1 = 1
            goto L_0x04cd
        L_0x0014:
            java.lang.String r0 = "yeelink.light.meshbulb2"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x04cc
            r1 = 3
            goto L_0x04cd
        L_0x001f:
            java.lang.String r0 = "yeelink.light.meshbulb1"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x04cc
            r1 = 2
            goto L_0x04cd
        L_0x002a:
            java.lang.String r0 = "yeelink.light.bslamp3"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x04cc
            r1 = 88
            goto L_0x04cd
        L_0x0036:
            java.lang.String r0 = "yeelink.light.bslamp2"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x04cc
            r1 = 87
            goto L_0x04cd
        L_0x0042:
            java.lang.String r0 = "yeelink.light.bslamp1"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x04cc
            r1 = 86
            goto L_0x04cd
        L_0x004e:
            java.lang.String r0 = "yeelink.light.ml2"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x04cc
            r1 = 6
            goto L_0x04cd
        L_0x0059:
            java.lang.String r0 = "yeelink.light.ml1"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x04cc
            r1 = 5
            goto L_0x04cd
        L_0x0064:
            java.lang.String r0 = "yeelink.light.cta"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x04cc
            r1 = 30
            goto L_0x04cd
        L_0x0070:
            java.lang.String r0 = "yeelink.light.ct2"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x04cc
            r1 = 29
            goto L_0x04cd
        L_0x007c:
            java.lang.String r0 = "yeelink.light.ceiling9"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x04cc
            r1 = 70
            goto L_0x04cd
        L_0x0088:
            java.lang.String r0 = "yeelink.light.ceiling8"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x04cc
            r1 = 69
            goto L_0x04cd
        L_0x0094:
            java.lang.String r0 = "yeelink.light.ceiling7"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x04cc
            r1 = 68
            goto L_0x04cd
        L_0x00a0:
            java.lang.String r0 = "yeelink.light.ceiling6"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x04cc
            r1 = 67
            goto L_0x04cd
        L_0x00ac:
            java.lang.String r0 = "yeelink.light.ceiling5"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x04cc
            r1 = 63
            goto L_0x04cd
        L_0x00b8:
            java.lang.String r0 = "yeelink.light.ceiling4"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x04cc
            r1 = 51
            goto L_0x04cd
        L_0x00c4:
            java.lang.String r0 = "yeelink.light.ceiling3"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x04cc
            r1 = 50
            goto L_0x04cd
        L_0x00d0:
            java.lang.String r0 = "yeelink.light.ceiling2"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x04cc
            r1 = 49
            goto L_0x04cd
        L_0x00dc:
            java.lang.String r0 = "yeelink.light.ceiling1"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x04cc
            r1 = 48
            goto L_0x04cd
        L_0x00e8:
            java.lang.String r0 = "yeelink.curtain.ctmt1"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x04cc
            r1 = 96
            goto L_0x04cd
        L_0x00f4:
            java.lang.String r0 = "yeelink.light.gingko.group"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x04cc
            r1 = 91
            goto L_0x04cd
        L_0x0100:
            java.lang.String r0 = "yeelink.gateway.va"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x04cc
            r1 = 95
            goto L_0x04cd
        L_0x010c:
            java.lang.String r0 = "yeelink.gateway.v1"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x04cc
            r1 = 94
            goto L_0x04cd
        L_0x0118:
            java.lang.String r0 = "yeelink.light.spot1"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x04cc
            r1 = 4
            goto L_0x04cd
        L_0x0123:
            java.lang.String r0 = "yeelink.light.monob"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x04cc
            r1 = 27
            goto L_0x04cd
        L_0x012f:
            java.lang.String r0 = "yeelink.light.monoa"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x04cc
            r1 = 26
            goto L_0x04cd
        L_0x013b:
            java.lang.String r0 = "yeelink.light.mono5"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x04cc
            r1 = 25
            goto L_0x04cd
        L_0x0147:
            java.lang.String r0 = "yeelink.light.mono4"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x04cc
            r1 = 24
            goto L_0x04cd
        L_0x0153:
            java.lang.String r0 = "yeelink.light.mono2"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x04cc
            r1 = 23
            goto L_0x04cd
        L_0x015f:
            java.lang.String r0 = "yeelink.light.mono1"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x04cc
            r1 = 22
            goto L_0x04cd
        L_0x016b:
            java.lang.String r0 = "yeelink.light.lamp9"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x04cc
            r1 = 35
            goto L_0x04cd
        L_0x0177:
            java.lang.String r0 = "yeelink.light.lamp7"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x04cc
            r1 = 34
            goto L_0x04cd
        L_0x0183:
            java.lang.String r0 = "yeelink.light.lamp5"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x04cc
            r1 = 40
            goto L_0x04cd
        L_0x018f:
            java.lang.String r0 = "yeelink.light.lamp4"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x04cc
            r1 = 37
            goto L_0x04cd
        L_0x019b:
            java.lang.String r0 = "yeelink.light.lamp3"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x04cc
            r1 = 39
            goto L_0x04cd
        L_0x01a7:
            java.lang.String r0 = "yeelink.light.lamp2"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x04cc
            r1 = 38
            goto L_0x04cd
        L_0x01b3:
            java.lang.String r0 = "yeelink.light.lamp1"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x04cc
            r1 = 33
            goto L_0x04cd
        L_0x01bf:
            java.lang.String r0 = "yeelink.light.group"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x04cc
            r1 = 46
            goto L_0x04cd
        L_0x01cb:
            java.lang.String r0 = "yeelink.light.ceild"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x04cc
            r1 = 84
            goto L_0x04cd
        L_0x01d7:
            java.lang.String r0 = "yeelink.light.ceilc"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x04cc
            r1 = 56
            goto L_0x04cd
        L_0x01e3:
            java.lang.String r0 = "yeelink.light.ceilb"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x04cc
            r1 = 55
            goto L_0x04cd
        L_0x01ef:
            java.lang.String r0 = "yeelink.light.ceila"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x04cc
            r1 = 83
            goto L_0x04cd
        L_0x01fb:
            java.lang.String r0 = "yeelink.light.stripa"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x04cc
            r1 = 45
            goto L_0x04cd
        L_0x0207:
            java.lang.String r0 = "yeelink.light.strip6"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x04cc
            r1 = 44
            goto L_0x04cd
        L_0x0213:
            java.lang.String r0 = "yeelink.light.strip4"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x04cc
            r1 = 32
            goto L_0x04cd
        L_0x021f:
            java.lang.String r0 = "yeelink.light.strip2"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x04cc
            r1 = 43
            goto L_0x04cd
        L_0x022b:
            java.lang.String r0 = "yeelink.light.strip1"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x04cc
            r1 = 42
            goto L_0x04cd
        L_0x0237:
            java.lang.String r0 = "yeelink.light.sp1grp"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x04cc
            r1 = 10
            goto L_0x04cd
        L_0x0243:
            java.lang.String r0 = "yilai.light.ceiling3"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x04cc
            r1 = 62
            goto L_0x04cd
        L_0x024f:
            java.lang.String r0 = "yilai.light.ceiling2"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x04cc
            r1 = 61
            goto L_0x04cd
        L_0x025b:
            java.lang.String r0 = "yilai.light.ceiling1"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x04cc
            r1 = 60
            goto L_0x04cd
        L_0x0267:
            java.lang.String r0 = "yeelink.light.panel3"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x04cc
            r1 = 31
            goto L_0x04cd
        L_0x0273:
            java.lang.String r0 = "yeelink.light.panel1"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x04cc
            r1 = 28
            goto L_0x04cd
        L_0x027f:
            java.lang.String r0 = "yeelink.light.mb2grp"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x04cc
            r1 = 9
            goto L_0x04cd
        L_0x028b:
            java.lang.String r0 = "yeelink.light.mb1grp"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x04cc
            r1 = 8
            goto L_0x04cd
        L_0x0297:
            java.lang.String r0 = "yeelink.light.lamp19"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x04cc
            r1 = 89
            goto L_0x04cd
        L_0x02a3:
            java.lang.String r0 = "yeelink.light.lamp17"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x04cc
            r1 = 41
            goto L_0x04cd
        L_0x02af:
            java.lang.String r0 = "yeelink.light.lamp15"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x04cc
            r1 = 36
            goto L_0x04cd
        L_0x02bb:
            java.lang.String r0 = "yeelink.light.lamp10"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x04cc
            r1 = 12
            goto L_0x04cd
        L_0x02c7:
            java.lang.String r0 = "yeelink.wifispeaker.v1"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x04cc
            r1 = 92
            goto L_0x04cd
        L_0x02d3:
            java.lang.String r0 = "yeelink.light.gingko"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x04cc
            r1 = 90
            goto L_0x04cd
        L_0x02df:
            java.lang.String r0 = "yeelink.light.fancl6"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x04cc
            r1 = 102(0x66, float:1.43E-43)
            goto L_0x04cd
        L_0x02eb:
            java.lang.String r0 = "yeelink.light.fancl5"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x04cc
            r1 = 101(0x65, float:1.42E-43)
            goto L_0x04cd
        L_0x02f7:
            java.lang.String r0 = "yeelink.light.fancl2"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x04cc
            r1 = 100
            goto L_0x04cd
        L_0x0303:
            java.lang.String r0 = "yeelink.light.fancl1"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x04cc
            r1 = 99
            goto L_0x04cd
        L_0x030f:
            java.lang.String r0 = "yeelink.light.dn2grp"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x04cc
            r1 = 7
            goto L_0x04cd
        L_0x031a:
            java.lang.String r0 = "yeelink.light.colorc"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x04cc
            r1 = 21
            goto L_0x04cd
        L_0x0326:
            java.lang.String r0 = "yeelink.light.colorb"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x04cc
            r1 = 20
            goto L_0x04cd
        L_0x0332:
            java.lang.String r0 = "yeelink.light.colora"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x04cc
            r1 = 19
            goto L_0x04cd
        L_0x033e:
            java.lang.String r0 = "yeelink.light.color8"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x04cc
            r1 = 16
            goto L_0x04cd
        L_0x034a:
            java.lang.String r0 = "yeelink.light.color6"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x04cc
            r1 = 14
            goto L_0x04cd
        L_0x0356:
            java.lang.String r0 = "yeelink.light.color5"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x04cc
            r1 = 18
            goto L_0x04cd
        L_0x0362:
            java.lang.String r0 = "yeelink.light.color4"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x04cc
            r1 = 15
            goto L_0x04cd
        L_0x036e:
            java.lang.String r0 = "yeelink.light.color3"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x04cc
            r1 = 17
            goto L_0x04cd
        L_0x037a:
            java.lang.String r0 = "yeelink.light.color2"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x04cc
            r1 = 13
            goto L_0x04cd
        L_0x0386:
            java.lang.String r0 = "yeelink.light.color1"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x04cc
            r1 = 11
            goto L_0x04cd
        L_0x0392:
            java.lang.String r0 = "yeelink.light.ceil33"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x04cc
            r1 = 82
            goto L_0x04cd
        L_0x039e:
            java.lang.String r0 = "yeelink.light.ceil32"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x04cc
            r1 = 79
            goto L_0x04cd
        L_0x03aa:
            java.lang.String r0 = "yeelink.light.ceil31"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x04cc
            r1 = 59
            goto L_0x04cd
        L_0x03b6:
            java.lang.String r0 = "yeelink.light.ceil30"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x04cc
            r1 = 78
            goto L_0x04cd
        L_0x03c2:
            java.lang.String r0 = "yeelink.light.ceil29"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x04cc
            r1 = 85
            goto L_0x04cd
        L_0x03ce:
            java.lang.String r0 = "yeelink.light.ceil27"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x04cc
            r1 = 81
            goto L_0x04cd
        L_0x03da:
            java.lang.String r0 = "yeelink.light.ceil26"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x04cc
            r1 = 80
            goto L_0x04cd
        L_0x03e6:
            java.lang.String r0 = "yeelink.plug.plug"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x04cc
            r1 = 98
            goto L_0x04cd
        L_0x03f2:
            java.lang.String r0 = "yeelink.light.room"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x04cc
            r1 = 47
            goto L_0x04cd
        L_0x03fe:
            java.lang.String r0 = "yeelink.light.ble1"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x04cc
            r1 = 0
            goto L_0x04cd
        L_0x0409:
            java.lang.String r0 = "yeelink.light.ceiling24"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x04cc
            r1 = 77
            goto L_0x04cd
        L_0x0415:
            java.lang.String r0 = "yeelink.light.ceiling23"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x04cc
            r1 = 66
            goto L_0x04cd
        L_0x0421:
            java.lang.String r0 = "yeelink.light.ceiling22"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x04cc
            r1 = 65
            goto L_0x04cd
        L_0x042d:
            java.lang.String r0 = "yeelink.light.ceiling21"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x04cc
            r1 = 64
            goto L_0x04cd
        L_0x0439:
            java.lang.String r0 = "yeelink.light.ceiling20"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x04cc
            r1 = 54
            goto L_0x04cd
        L_0x0445:
            java.lang.String r0 = "yeelink.light.ceiling19"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x04cc
            r1 = 53
            goto L_0x04cd
        L_0x0451:
            java.lang.String r0 = "yeelink.light.ceiling18"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x04cc
            r1 = 76
            goto L_0x04cd
        L_0x045d:
            java.lang.String r0 = "yeelink.light.ceiling17"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x04cc
            r1 = 58
            goto L_0x04cd
        L_0x0469:
            java.lang.String r0 = "yeelink.light.ceiling16"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x04cc
            r1 = 57
            goto L_0x04cd
        L_0x0474:
            java.lang.String r0 = "yeelink.light.ceiling15"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x04cc
            r1 = 75
            goto L_0x04cd
        L_0x047f:
            java.lang.String r0 = "yeelink.light.ceiling14"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x04cc
            r1 = 74
            goto L_0x04cd
        L_0x048a:
            java.lang.String r0 = "yeelink.light.ceiling13"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x04cc
            r1 = 73
            goto L_0x04cd
        L_0x0495:
            java.lang.String r0 = "yeelink.light.ceiling12"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x04cc
            r1 = 72
            goto L_0x04cd
        L_0x04a0:
            java.lang.String r0 = "yeelink.light.ceiling11"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x04cc
            r1 = 71
            goto L_0x04cd
        L_0x04ab:
            java.lang.String r0 = "yeelink.light.ceiling10"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x04cc
            r1 = 52
            goto L_0x04cd
        L_0x04b6:
            java.lang.String r0 = "yeelink.switch.sw1"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x04cc
            r1 = 97
            goto L_0x04cd
        L_0x04c1:
            java.lang.String r0 = "yeelink.bhf_light.v1"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x04cc
            r1 = 93
            goto L_0x04cd
        L_0x04cc:
            r1 = -1
        L_0x04cd:
            switch(r1) {
                case 0: goto L_0x05ee;
                case 1: goto L_0x05e9;
                case 2: goto L_0x05e9;
                case 3: goto L_0x05e9;
                case 4: goto L_0x05e9;
                case 5: goto L_0x05e9;
                case 6: goto L_0x05e9;
                case 7: goto L_0x05e4;
                case 8: goto L_0x05e4;
                case 9: goto L_0x05e4;
                case 10: goto L_0x05e4;
                case 11: goto L_0x05df;
                case 12: goto L_0x05da;
                case 13: goto L_0x05d5;
                case 14: goto L_0x05d0;
                case 15: goto L_0x05cb;
                case 16: goto L_0x05cb;
                case 17: goto L_0x05c6;
                case 18: goto L_0x05c1;
                case 19: goto L_0x05c1;
                case 20: goto L_0x05c1;
                case 21: goto L_0x05c1;
                case 22: goto L_0x05bc;
                case 23: goto L_0x05bc;
                case 24: goto L_0x05b7;
                case 25: goto L_0x05b7;
                case 26: goto L_0x05b2;
                case 27: goto L_0x05b2;
                case 28: goto L_0x05ad;
                case 29: goto L_0x05a8;
                case 30: goto L_0x05a3;
                case 31: goto L_0x059e;
                case 32: goto L_0x0599;
                case 33: goto L_0x0594;
                case 34: goto L_0x058f;
                case 35: goto L_0x058a;
                case 36: goto L_0x0585;
                case 37: goto L_0x0580;
                case 38: goto L_0x057b;
                case 39: goto L_0x0576;
                case 40: goto L_0x0576;
                case 41: goto L_0x0571;
                case 42: goto L_0x056c;
                case 43: goto L_0x0567;
                case 44: goto L_0x0562;
                case 45: goto L_0x0562;
                case 46: goto L_0x055d;
                case 47: goto L_0x055d;
                case 48: goto L_0x0558;
                case 49: goto L_0x0553;
                case 50: goto L_0x054e;
                case 51: goto L_0x0549;
                case 52: goto L_0x0544;
                case 53: goto L_0x053f;
                case 54: goto L_0x053f;
                case 55: goto L_0x053a;
                case 56: goto L_0x053a;
                case 57: goto L_0x0535;
                case 58: goto L_0x0535;
                case 59: goto L_0x0535;
                case 60: goto L_0x0535;
                case 61: goto L_0x0535;
                case 62: goto L_0x0535;
                case 63: goto L_0x0530;
                case 64: goto L_0x0530;
                case 65: goto L_0x0530;
                case 66: goto L_0x0530;
                case 67: goto L_0x052b;
                case 68: goto L_0x052b;
                case 69: goto L_0x052b;
                case 70: goto L_0x052b;
                case 71: goto L_0x052b;
                case 72: goto L_0x052b;
                case 73: goto L_0x052b;
                case 74: goto L_0x052b;
                case 75: goto L_0x052b;
                case 76: goto L_0x052b;
                case 77: goto L_0x052b;
                case 78: goto L_0x052b;
                case 79: goto L_0x052b;
                case 80: goto L_0x0526;
                case 81: goto L_0x0526;
                case 82: goto L_0x0526;
                case 83: goto L_0x0526;
                case 84: goto L_0x0521;
                case 85: goto L_0x051c;
                case 86: goto L_0x0517;
                case 87: goto L_0x0512;
                case 88: goto L_0x050d;
                case 89: goto L_0x050d;
                case 90: goto L_0x0508;
                case 91: goto L_0x0503;
                case 92: goto L_0x04fe;
                case 93: goto L_0x04f9;
                case 94: goto L_0x04f4;
                case 95: goto L_0x04f4;
                case 96: goto L_0x04ef;
                case 97: goto L_0x04ea;
                case 98: goto L_0x04e5;
                case 99: goto L_0x04e0;
                case 100: goto L_0x04db;
                case 101: goto L_0x04d6;
                case 102: goto L_0x04d6;
                default: goto L_0x04d0;
            }
        L_0x04d0:
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            return r1
        L_0x04d6:
            java.util.Map r1 = m18475o0()
            return r1
        L_0x04db:
            java.util.Map r1 = m18469m0()
            return r1
        L_0x04e0:
            java.util.Map r1 = m18463k0()
            return r1
        L_0x04e5:
            java.util.Map r1 = m18473n1()
            return r1
        L_0x04ea:
            java.util.Map r1 = m18384E1()
            return r1
        L_0x04ef:
            java.util.Map r1 = m18420U()
            return r1
        L_0x04f4:
            java.util.Map r1 = m18423V0()
            return r1
        L_0x04f9:
            java.util.Map r1 = m18447f()
            return r1
        L_0x04fe:
            java.util.Map r1 = m18488s1()
            return r1
        L_0x0503:
            java.util.Map r1 = m18487s0()
            return r1
        L_0x0508:
            java.util.Map r1 = m18484r0()
            return r1
        L_0x050d:
            java.util.Map r1 = m18456i()
            return r1
        L_0x0512:
            java.util.Map r1 = m18450g()
            return r1
        L_0x0517:
            java.util.Map r1 = m18462k()
            return r1
        L_0x051c:
            java.util.Map r1 = m18489t()
            return r1
        L_0x0521:
            java.util.Map r1 = m18507z()
            return r1
        L_0x0526:
            java.util.Map r1 = m18486s()
            return r1
        L_0x052b:
            java.util.Map r1 = m18504y()
            return r1
        L_0x0530:
            java.util.Map r1 = m18498w()
            return r1
        L_0x0535:
            java.util.Map r1 = m18424W()
            return r1
        L_0x053a:
            java.util.Map r1 = m18373B()
            return r1
        L_0x053f:
            java.util.Map r1 = m18483r()
            return r1
        L_0x0544:
            java.util.Map r1 = m18477p()
            return r1
        L_0x0549:
            java.util.Map r1 = m18448f0()
            return r1
        L_0x054e:
            java.util.Map r1 = m18445e0()
            return r1
        L_0x0553:
            java.util.Map r1 = m18409O0()
            return r1
        L_0x0558:
            java.util.Map r1 = m18405M0()
            return r1
        L_0x055d:
            java.util.Map r1 = m18499w0()
            return r1
        L_0x0562:
            java.util.Map r1 = m18506y1()
            return r1
        L_0x0567:
            java.util.Map r1 = m18494u1()
            return r1
        L_0x056c:
            java.util.Map r1 = m18375B1()
            return r1
        L_0x0571:
            java.util.Map r1 = m18383E0()
            return r1
        L_0x0576:
            java.util.Map r1 = m18452g1()
            return r1
        L_0x057b:
            java.util.Map r1 = m18442d0()
            return r1
        L_0x0580:
            java.util.Map r1 = m18386F0()
            return r1
        L_0x0585:
            java.util.Map r1 = m18377C0()
            return r1
        L_0x058a:
            java.util.Map r1 = m18401K0()
            return r1
        L_0x058f:
            java.util.Map r1 = m18392H0()
            return r1
        L_0x0594:
            java.util.Map r1 = m18413Q0()
            return r1
        L_0x0599:
            java.util.Map r1 = m18500w1()
            return r1
        L_0x059e:
            java.util.Map r1 = m18467l1()
            return r1
        L_0x05a3:
            java.util.Map r1 = m18418T()
            return r1
        L_0x05a8:
            java.util.Map r1 = m18416S()
            return r1
        L_0x05ad:
            java.util.Map r1 = m18464k1()
            return r1
        L_0x05b2:
            java.util.Map r1 = m18443d1()
            return r1
        L_0x05b7:
            java.util.Map r1 = m18479p1()
            return r1
        L_0x05bc:
            java.util.Map r1 = m18430Z()
            return r1
        L_0x05c1:
            java.util.Map r1 = m18400K()
            return r1
        L_0x05c6:
            java.util.Map r1 = m18391H()
            return r1
        L_0x05cb:
            java.util.Map r1 = m18394I()
            return r1
        L_0x05d0:
            java.util.Map r1 = m18404M()
            return r1
        L_0x05d5:
            java.util.Map r1 = m18390G1()
            return r1
        L_0x05da:
            java.util.Map r1 = m18508z0()
            return r1
        L_0x05df:
            java.util.Map r1 = m18396I1()
            return r1
        L_0x05e4:
            java.util.Map r1 = m18431Z0()
            return r1
        L_0x05e9:
            java.util.Map r1 = m18421U0()
            return r1
        L_0x05ee:
            java.util.Map r1 = m18382E()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.p150c.p181l.C6126d0.m18426X(java.lang.String):java.util.Map");
    }

    /* renamed from: X0 */
    private static List<C6122c0> m18427X0(C4198d dVar) {
        Resources resources = C4297y.f7456e.getResources();
        ArrayList arrayList = new ArrayList();
        int[] iArr = {0, 2, 9, 16};
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < 4; i++) {
            C6038h b = m18435b(iArr[i], dVar);
            if (b != null) {
                arrayList2.add(b);
                dVar.mo23365B0(b);
            }
        }
        arrayList.add(new C6122c0(resources.getString(R$string.feature_group_group), arrayList2));
        return arrayList;
    }

    /* renamed from: Y */
    private static List<C6038h> m18428Y(C4198d dVar) {
        int[] iArr = {29, 1, 2, 15, 5, 18};
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 6; i++) {
            C6038h c = m18438c(iArr[i], dVar);
            if (c != null) {
                arrayList.add(c);
                dVar.mo23365B0(c);
            }
        }
        return arrayList;
    }

    /* renamed from: Y0 */
    private static List<C6038h> m18429Y0(C4198d dVar) {
        int[] iArr = {29, 2, 1};
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 3; i++) {
            C6038h c = m18438c(iArr[i], dVar);
            if (c != null) {
                arrayList.add(c);
                dVar.mo23365B0(c);
            }
        }
        return arrayList;
    }

    /* renamed from: Z */
    private static Map<Integer, String> m18430Z() {
        HashMap hashMap = new HashMap();
        hashMap.put(29, TimerCodec.DISENABLE);
        hashMap.put(0, TimerCodec.DISENABLE);
        hashMap.put(1, TimerCodec.DISENABLE);
        hashMap.put(2, TimerCodec.DISENABLE);
        hashMap.put(5, TimerCodec.DISENABLE);
        hashMap.put(9, TimerCodec.DISENABLE);
        hashMap.put(15, TimerCodec.DISENABLE);
        hashMap.put(18, "31");
        hashMap.put(23, TimerCodec.DISENABLE);
        hashMap.put(31, "54");
        hashMap.put(34, TimerCodec.DISENABLE);
        hashMap.put(16, TimerCodec.DISENABLE);
        return hashMap;
    }

    /* renamed from: Z0 */
    private static Map<Integer, String> m18431Z0() {
        HashMap hashMap = new HashMap();
        hashMap.put(29, TimerCodec.DISENABLE);
        hashMap.put(0, TimerCodec.DISENABLE);
        hashMap.put(1, TimerCodec.DISENABLE);
        hashMap.put(2, TimerCodec.DISENABLE);
        hashMap.put(9, TimerCodec.DISENABLE);
        hashMap.put(15, TimerCodec.DISENABLE);
        hashMap.put(18, "31");
        hashMap.put(23, TimerCodec.DISENABLE);
        hashMap.put(31, "54");
        hashMap.put(34, TimerCodec.DISENABLE);
        hashMap.put(30, TimerCodec.DISENABLE);
        hashMap.put(16, TimerCodec.DISENABLE);
        hashMap.put(38, TimerCodec.DISENABLE);
        hashMap.put(12, TimerCodec.DISENABLE);
        return hashMap;
    }

    /* renamed from: a */
    private static C6038h m18432a(int i, C4198d dVar) {
        Resources resources = C4297y.f7456e.getResources();
        if (!dVar.mo23415n0(i)) {
            return null;
        }
        if (i == 1) {
            return new C6161j1(R$drawable.icon_yeelight_featue_timer, resources.getString(R$string.fancl_fan_timer_feature_name), i, dVar.mo23372G());
        }
        if (i == 5) {
            return new C6139f0(R$drawable.icon_yeelight_featue_firmware, resources.getString(R$string.feature_fw_upgrade), i, dVar.mo23372G());
        }
        if (i == 15) {
            return new C6143f1(R$drawable.icon_yeelight_featue_set_default, resources.getString(R$string.fancl_fan_default_feature_name), i, dVar.mo23372G());
        }
        if (i != 25) {
            return null;
        }
        return new C6123c1(R$drawable.icon_yeelight_featue_remote, resources.getString(R$string.remote_title), i, dVar.mo23372G());
    }

    /* renamed from: a0 */
    private static List<C6122c0> m18433a0(C4198d dVar) {
        Resources resources = C4297y.f7456e.getResources();
        ArrayList arrayList = new ArrayList();
        int[] iArr = {0, 23, 9, 34, 16};
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < 5; i++) {
            C6038h b = m18435b(iArr[i], dVar);
            if (b != null) {
                arrayList2.add(b);
                dVar.mo23365B0(b);
            }
        }
        if (arrayList2.size() > 0) {
            arrayList.add(new C6122c0(resources.getString(R$string.feature_group_device), arrayList2));
        }
        return arrayList;
    }

    /* renamed from: a1 */
    private static List<C6122c0> m18434a1(C4198d dVar) {
        Resources resources = C4297y.f7456e.getResources();
        ArrayList arrayList = new ArrayList();
        int[] iArr = {0, 38, 9, 16, 12};
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < 5; i++) {
            C6038h b = m18435b(iArr[i], dVar);
            if (b != null) {
                arrayList2.add(b);
                dVar.mo23365B0(b);
            }
        }
        if (arrayList2.size() > 0) {
            arrayList.add(new C6122c0(resources.getString(R$string.feature_group_device), arrayList2));
        }
        return arrayList;
    }

    /* renamed from: b */
    private static C6038h m18435b(int i, C4198d dVar) {
        Resources resources = C4297y.f7456e.getResources();
        if (!dVar.mo23415n0(i)) {
            return null;
        }
        switch (i) {
            case 0:
                return new C6127d1(R$drawable.setting_rename, resources.getString(R$string.common_text_name), i, dVar.mo23372G());
            case 1:
                return new C6161j1(R$drawable.setting_alarm, resources.getString(R$string.feature_alarm), i, dVar.mo23372G());
            case 2:
                return new C6213y(R$drawable.setting_delay, resources.getString(R$string.feature_delay), i, dVar.mo23372G());
            case 3:
                return new C6222z0(R$drawable.setting_night_light, resources.getString(R$string.feature_night_light), i, dVar.mo23372G());
            case 4:
                return new C6181p(R$drawable.setting_awake, resources.getString(R$string.common_text_awake), i, dVar.mo23372G());
            case 5:
                return new C6139f0(R$drawable.setting_fw, resources.getString(R$string.feature_fw_upgrade), i, dVar.mo23372G());
            case 6:
                return new C6112a0(R$drawable.setting_bt, resources.getString(R$string.feature_disconnect_bt), i, dVar.mo23372G());
            case 7:
                return new C6168l1(R$drawable.setting_unbind, resources.getString(R$string.feature_unbind), i, dVar.mo23372G());
            case 8:
                return new C6208w0(R$drawable.setting_miband, resources.getString(R$string.feature_mi_band), i, dVar.mo23372G());
            case 9:
                return new C6132e0(R$drawable.setting_feedback, resources.getString(R$string.feature_feedback), i, dVar.mo23372G());
            case 10:
                return new C6134e1(R$drawable.setting_restore, resources.getString(R$string.feature_restore), i, dVar.mo23372G());
            case 11:
                return new C6119b1(R$drawable.setting_alarm, resources.getString(R$string.feature_focus), i, dVar.mo23372G());
            case 12:
                return new C6172m0(R$drawable.setting_group_management, resources.getString(R$string.room_setting_manage), i, dVar.mo23372G());
            case 13:
                return new C6174m1(R$drawable.setting_wechat, resources.getString(R$string.feature_wechat), i, dVar.mo23372G());
            case 14:
                return new C6197t(R$drawable.setting_night_light, resources.getString(R$string.feature_call_alarm), i, dVar.mo23372G());
            case 15:
                return new C6143f1(R$drawable.setting_set_default, resources.getString(R$string.feature_set_default), i, dVar.mo23372G());
            case 16:
                return new C6148g1(R$drawable.setting_set_default, resources.getString(R$string.feature_share_device), i, dVar.mo23372G());
            case 17:
                return new C6189q0(R$drawable.setting_kid_mode, resources.getString(R$string.feature_kid_mode), i, dVar.mo23372G());
            case 18:
                return new C6155i0(R$drawable.setting_geek_mode, resources.getString(R$string.feature_geek_mode), i, dVar.mo23372G());
            case 19:
                return new C6202u0(R$drawable.icon_yeelight_mango_short_key, resources.getString(R$string.feature_short_key_mode), i, dVar.mo23372G());
            case 20:
                return new C6211x0(R$drawable.setting_miband, resources.getString(R$string.feature_mi_band), i, dVar.mo23372G());
            case 21:
                return new C6219y0(R$drawable.setting_music_mode, resources.getString(R$string.feature_music_mode), i, dVar.mo23372G());
            case 22:
                return new C6195s0(R$drawable.setting_led_indicator, resources.getString(R$string.feature_led_indicator), i, dVar.mo23372G());
            case 23:
                return new C6152h1(R$drawable.setting_add_shortcut, resources.getString(R$string.feature_add_shortcut), i, dVar.mo23372G());
            case 24:
                return new C6146g0(R$drawable.setting_fw, resources.getString(R$string.feature_fw_version), i, dVar.mo23372G());
            case 25:
                return new C6123c1(R$drawable.setting_kiwi_icon, resources.getString(R$string.remote_title), i, dVar.mo23372G());
            case 28:
                return new C6205v0(R$drawable.setting_kiwi_icon, resources.getString(R$string.feature_group_manage), i, dVar.mo23372G());
            case 32:
                return new C6187q(R$drawable.setting_kiwi_icon, resources.getString(R$string.settings_feature_ambi_title), i, dVar.mo23372G());
            case 34:
                return new C6220z(R$drawable.setting_rename, resources.getString(R$string.feature_device_info), i, dVar.mo23372G());
            case 36:
                return new C6193s(R$drawable.setting_rename, "Bundle Scene Demo", i, dVar.mo23372G());
            case 37:
                return new C6157i1(R$drawable.setting_rename, resources.getString(R$string.speaker_voice_system_switching), i, dVar.mo23372G());
            case 38:
                return new C6151h0(R$drawable.setting_rename, resources.getString(R$string.settings_flex_switch_tm_enable), i, dVar.mo23372G());
            case 39:
                return new C6160j0(R$drawable.setting_rename, resources.getString(R$string.gesture_switch_feature_name), i, dVar.mo23372G());
            case 40:
                return new C6165k1(R$drawable.setting_rename, resources.getString(R$string.touch_panel_turn_off_name), i, dVar.mo23372G());
            case 41:
                return new C6180o0(R$drawable.setting_rename, resources.getString(R$string.vision_setting_induction_name), i, dVar.mo23372G());
            case 42:
                return new C6192r0(R$drawable.setting_rename, resources.getString(R$string.vision_mode_selection), i, dVar.mo23372G());
            case 43:
                return new C6210x(R$drawable.setting_rename, resources.getString(R$string.vision_default_schedule_title), i, dVar.mo23372G());
            case 44:
                return new C6164k0(R$drawable.setting_rename, resources.getString(R$string.settings_google_custom_connect), i, dVar.mo23372G());
            case 45:
                return new C6201u(R$drawable.setting_rename, resources.getString(R$string.setting_curtain_user_guide), i, dVar.mo23372G());
            case 46:
                return new C6207w(R$drawable.setting_rename, resources.getString(R$string.setting_curtain_open_style_title), i, dVar.mo23372G());
            case 47:
                return new C6204v(R$drawable.setting_rename, resources.getString(R$string.setting_curtain_open_by_yourself_title), i, dVar.mo23372G());
            case 48:
                return new C6167l0(R$drawable.setting_rename, resources.getString(R$string.google_home_add_title), i, dVar.mo23372G());
            case 50:
                return new C6200t0(R$drawable.setting_rename, resources.getString(R$string.settings_feature_light_gradient), i, dVar.mo23372G());
            case 51:
                return new C6191r(R$drawable.setting_rename, resources.getString(R$string.common_text_bluetooth_mode), i, dVar.mo23372G());
            default:
                return null;
        }
    }

    /* renamed from: b0 */
    private static List<C6038h> m18436b0(C4198d dVar) {
        int[] iArr = {29, 1, 2, 3, 25, 20, 15, 5, 18};
        int[] iArr2 = {36};
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 9; i++) {
            C6038h c = m18438c(iArr[i], dVar);
            if (c != null) {
                arrayList.add(c);
                dVar.mo23365B0(c);
            }
        }
        if (C4308b.f7482a) {
            for (int i2 = 0; i2 < 1; i2++) {
                C6038h c2 = m18438c(iArr2[i2], dVar);
                if (c2 != null) {
                    arrayList.add(c2);
                    dVar.mo23365B0(c2);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: b1 */
    private static List<C6122c0> m18437b1(C4198d dVar) {
        Resources resources = C4297y.f7456e.getResources();
        ArrayList arrayList = new ArrayList();
        int[] iArr = {0, 38, 9, 16};
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < 4; i++) {
            C6038h b = m18435b(iArr[i], dVar);
            if (b != null) {
                arrayList2.add(b);
                dVar.mo23365B0(b);
            }
        }
        if (arrayList2.size() > 0) {
            arrayList.add(new C6122c0(resources.getString(R$string.feature_group_device), arrayList2));
        }
        return arrayList;
    }

    /* JADX WARNING: type inference failed for: r6v1 */
    /* JADX WARNING: type inference failed for: r0v29, types: [com.yeelight.yeelib.c.l.y] */
    /* JADX WARNING: type inference failed for: r0v30, types: [com.yeelight.yeelib.c.l.y] */
    /* JADX WARNING: type inference failed for: r0v31, types: [com.yeelight.yeelib.c.l.z0] */
    /* JADX WARNING: type inference failed for: r0v32, types: [com.yeelight.yeelib.c.l.p] */
    /* JADX WARNING: type inference failed for: r0v33, types: [com.yeelight.yeelib.c.l.w0] */
    /* JADX WARNING: type inference failed for: r0v34, types: [com.yeelight.yeelib.c.l.b1] */
    /* JADX WARNING: type inference failed for: r0v35, types: [com.yeelight.yeelib.c.l.q0] */
    /* JADX WARNING: type inference failed for: r0v36, types: [com.yeelight.yeelib.c.l.i0] */
    /* JADX WARNING: type inference failed for: r0v37, types: [com.yeelight.yeelib.c.l.x0] */
    /* JADX WARNING: type inference failed for: r0v38, types: [com.yeelight.yeelib.c.l.y0] */
    /* JADX WARNING: type inference failed for: r0v39, types: [com.yeelight.yeelib.c.l.s0] */
    /* JADX WARNING: type inference failed for: r0v40, types: [com.yeelight.yeelib.c.l.p0] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.yeelight.yeelib.p150c.p151i.C6038h m18438c(int r8, com.yeelight.yeelib.p150c.p151i.C4198d r9) {
        /*
            android.content.Context r1 = com.yeelight.yeelib.p152f.C4297y.f7456e
            android.content.res.Resources r1 = r1.getResources()
            boolean r2 = r9.mo23415n0(r8)
            r4 = 0
            if (r2 != 0) goto L_0x000e
            return r4
        L_0x000e:
            switch(r8) {
                case 1: goto L_0x0260;
                case 2: goto L_0x022c;
                case 3: goto L_0x0212;
                case 4: goto L_0x01f9;
                case 5: goto L_0x01e6;
                case 6: goto L_0x01d3;
                case 7: goto L_0x0011;
                case 8: goto L_0x01ba;
                case 9: goto L_0x01a7;
                case 10: goto L_0x0011;
                case 11: goto L_0x018d;
                case 12: goto L_0x017a;
                case 13: goto L_0x0167;
                case 14: goto L_0x0011;
                case 15: goto L_0x013f;
                case 16: goto L_0x0011;
                case 17: goto L_0x0125;
                case 18: goto L_0x010b;
                case 19: goto L_0x00f8;
                case 20: goto L_0x00de;
                case 21: goto L_0x00c4;
                case 22: goto L_0x00aa;
                case 23: goto L_0x0011;
                case 24: goto L_0x0011;
                case 25: goto L_0x0097;
                case 26: goto L_0x0011;
                case 27: goto L_0x0084;
                case 28: goto L_0x0071;
                case 29: goto L_0x005e;
                case 30: goto L_0x0011;
                case 31: goto L_0x0011;
                case 32: goto L_0x0011;
                case 33: goto L_0x004f;
                case 34: goto L_0x0011;
                case 35: goto L_0x0035;
                case 36: goto L_0x0026;
                case 37: goto L_0x0011;
                case 38: goto L_0x0011;
                case 39: goto L_0x0011;
                case 40: goto L_0x0011;
                case 41: goto L_0x0013;
                default: goto L_0x0011;
            }
        L_0x0011:
            goto L_0x0285
        L_0x0013:
            com.yeelight.yeelib.c.l.o0 r4 = new com.yeelight.yeelib.c.l.o0
            int r2 = com.yeelight.yeelib.R$drawable.icon_yeelight_featue_human_induction
            int r5 = com.yeelight.yeelib.R$string.vision_setting_induction_name
            java.lang.String r1 = r1.getString(r5)
            java.lang.String r0 = r9.mo23372G()
            r4.<init>(r2, r1, r8, r0)
            goto L_0x0285
        L_0x0026:
            com.yeelight.yeelib.c.l.s r4 = new com.yeelight.yeelib.c.l.s
            int r1 = com.yeelight.yeelib.R$drawable.icon_yeelight_feature_favorite
            java.lang.String r0 = r9.mo23372G()
            java.lang.String r2 = "Bundle Scene Demo"
            r4.<init>(r1, r2, r8, r0)
            goto L_0x0285
        L_0x0035:
            com.yeelight.yeelib.c.l.p0 r6 = new com.yeelight.yeelib.c.l.p0
            int r2 = com.yeelight.yeelib.R$drawable.icon_yeelight_featue_kid_lock
            int r4 = com.yeelight.yeelib.R$string.feature_child_lock
            java.lang.String r4 = r1.getString(r4)
            java.lang.String r5 = r9.mo23372G()
            r7 = 1
            r0 = r6
            r1 = r2
            r2 = r4
            r3 = r8
            r4 = r5
            r5 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            goto L_0x022a
        L_0x004f:
            com.yeelight.yeelib.c.l.n0 r4 = new com.yeelight.yeelib.c.l.n0
            int r1 = com.yeelight.yeelib.R$drawable.icon_yeelight_featue_timer
            java.lang.String r0 = r9.mo23372G()
            java.lang.String r2 = "灯组特效"
            r4.<init>(r1, r2, r8, r0)
            goto L_0x0285
        L_0x005e:
            com.yeelight.yeelib.c.l.b0 r4 = new com.yeelight.yeelib.c.l.b0
            int r2 = com.yeelight.yeelib.R$drawable.icon_yeelight_feature_favorite
            int r5 = com.yeelight.yeelib.R$string.common_text_favorite
            java.lang.String r1 = r1.getString(r5)
            java.lang.String r0 = r9.mo23372G()
            r4.<init>(r2, r1, r8, r0)
            goto L_0x0285
        L_0x0071:
            com.yeelight.yeelib.c.l.v0 r4 = new com.yeelight.yeelib.c.l.v0
            int r2 = com.yeelight.yeelib.R$drawable.setting_kiwi_icon
            int r5 = com.yeelight.yeelib.R$string.feature_group_manage
            java.lang.String r1 = r1.getString(r5)
            java.lang.String r0 = r9.mo23372G()
            r4.<init>(r2, r1, r8, r0)
            goto L_0x0285
        L_0x0084:
            com.yeelight.yeelib.c.l.a1 r4 = new com.yeelight.yeelib.c.l.a1
            int r2 = com.yeelight.yeelib.R$drawable.icon_yeelight_pick_color
            int r5 = com.yeelight.yeelib.R$string.common_text_color_camera
            java.lang.String r1 = r1.getString(r5)
            java.lang.String r0 = r9.mo23372G()
            r4.<init>(r2, r1, r8, r0)
            goto L_0x0285
        L_0x0097:
            com.yeelight.yeelib.c.l.c1 r4 = new com.yeelight.yeelib.c.l.c1
            int r2 = com.yeelight.yeelib.R$drawable.icon_yeelight_featue_remote
            int r5 = com.yeelight.yeelib.R$string.remote_title
            java.lang.String r1 = r1.getString(r5)
            java.lang.String r0 = r9.mo23372G()
            r4.<init>(r2, r1, r8, r0)
            goto L_0x0285
        L_0x00aa:
            com.yeelight.yeelib.c.l.s0 r6 = new com.yeelight.yeelib.c.l.s0
            int r2 = com.yeelight.yeelib.R$drawable.icon_yeelight_featue_led_indicator
            int r4 = com.yeelight.yeelib.R$string.feature_led_indicator
            java.lang.String r4 = r1.getString(r4)
            java.lang.String r5 = r9.mo23372G()
            r7 = 1
            r0 = r6
            r1 = r2
            r2 = r4
            r3 = r8
            r4 = r5
            r5 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            goto L_0x022a
        L_0x00c4:
            com.yeelight.yeelib.c.l.y0 r6 = new com.yeelight.yeelib.c.l.y0
            int r2 = com.yeelight.yeelib.R$drawable.icon_yeelight_featue_music_mode
            int r4 = com.yeelight.yeelib.R$string.feature_music_mode
            java.lang.String r4 = r1.getString(r4)
            java.lang.String r5 = r9.mo23372G()
            r7 = 1
            r0 = r6
            r1 = r2
            r2 = r4
            r3 = r8
            r4 = r5
            r5 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            goto L_0x022a
        L_0x00de:
            com.yeelight.yeelib.c.l.x0 r6 = new com.yeelight.yeelib.c.l.x0
            int r2 = com.yeelight.yeelib.R$drawable.icon_yeelight_featue_miband
            int r4 = com.yeelight.yeelib.R$string.feature_mi_band
            java.lang.String r4 = r1.getString(r4)
            java.lang.String r5 = r9.mo23372G()
            r7 = 1
            r0 = r6
            r1 = r2
            r2 = r4
            r3 = r8
            r4 = r5
            r5 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            goto L_0x022a
        L_0x00f8:
            com.yeelight.yeelib.c.l.u0 r4 = new com.yeelight.yeelib.c.l.u0
            int r2 = com.yeelight.yeelib.R$drawable.icon_yeelight_featue_short_key
            int r5 = com.yeelight.yeelib.R$string.feature_short_key_mode
            java.lang.String r1 = r1.getString(r5)
            java.lang.String r0 = r9.mo23372G()
            r4.<init>(r2, r1, r8, r0)
            goto L_0x0285
        L_0x010b:
            com.yeelight.yeelib.c.l.i0 r6 = new com.yeelight.yeelib.c.l.i0
            int r2 = com.yeelight.yeelib.R$drawable.icon_yeelight_featue_geekmode
            int r4 = com.yeelight.yeelib.R$string.feature_geek_mode
            java.lang.String r4 = r1.getString(r4)
            java.lang.String r5 = r9.mo23372G()
            r7 = 1
            r0 = r6
            r1 = r2
            r2 = r4
            r3 = r8
            r4 = r5
            r5 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            goto L_0x022a
        L_0x0125:
            com.yeelight.yeelib.c.l.q0 r6 = new com.yeelight.yeelib.c.l.q0
            int r2 = com.yeelight.yeelib.R$drawable.icon_yeelight_featue_kid_mode
            int r4 = com.yeelight.yeelib.R$string.feature_kid_mode
            java.lang.String r4 = r1.getString(r4)
            java.lang.String r5 = r9.mo23372G()
            r7 = 1
            r0 = r6
            r1 = r2
            r2 = r4
            r3 = r8
            r4 = r5
            r5 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            goto L_0x022a
        L_0x013f:
            boolean r2 = r9 instanceof com.yeelight.yeelib.p150c.p151i.C6033g
            com.yeelight.yeelib.c.l.f1 r4 = new com.yeelight.yeelib.c.l.f1
            if (r2 == 0) goto L_0x0156
            int r2 = com.yeelight.yeelib.R$drawable.icon_yeelight_featue_set_default
            int r5 = com.yeelight.yeelib.R$string.fancl_light_default_feature_name
            java.lang.String r1 = r1.getString(r5)
            java.lang.String r0 = r9.mo23372G()
            r4.<init>(r2, r1, r8, r0)
            goto L_0x0285
        L_0x0156:
            int r2 = com.yeelight.yeelib.R$drawable.icon_yeelight_featue_set_default
            int r5 = com.yeelight.yeelib.R$string.feature_set_default
            java.lang.String r1 = r1.getString(r5)
            java.lang.String r0 = r9.mo23372G()
            r4.<init>(r2, r1, r8, r0)
            goto L_0x0285
        L_0x0167:
            com.yeelight.yeelib.c.l.m1 r4 = new com.yeelight.yeelib.c.l.m1
            int r2 = com.yeelight.yeelib.R$drawable.icon_yeelight_featue_wechat
            int r5 = com.yeelight.yeelib.R$string.feature_wechat
            java.lang.String r1 = r1.getString(r5)
            java.lang.String r0 = r9.mo23372G()
            r4.<init>(r2, r1, r8, r0)
            goto L_0x0285
        L_0x017a:
            com.yeelight.yeelib.c.l.m0 r4 = new com.yeelight.yeelib.c.l.m0
            int r2 = com.yeelight.yeelib.R$drawable.icon_yeelight_featue_group_managment
            int r5 = com.yeelight.yeelib.R$string.room_setting_manage
            java.lang.String r1 = r1.getString(r5)
            java.lang.String r0 = r9.mo23372G()
            r4.<init>(r2, r1, r8, r0)
            goto L_0x0285
        L_0x018d:
            com.yeelight.yeelib.c.l.b1 r6 = new com.yeelight.yeelib.c.l.b1
            int r2 = com.yeelight.yeelib.R$drawable.icon_yeelight_featue_pdo
            int r4 = com.yeelight.yeelib.R$string.feature_focus
            java.lang.String r4 = r1.getString(r4)
            java.lang.String r5 = r9.mo23372G()
            r7 = 1
            r0 = r6
            r1 = r2
            r2 = r4
            r3 = r8
            r4 = r5
            r5 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            goto L_0x022a
        L_0x01a7:
            com.yeelight.yeelib.c.l.e0 r4 = new com.yeelight.yeelib.c.l.e0
            int r2 = com.yeelight.yeelib.R$drawable.icon_yeelight_featue_feedback
            int r5 = com.yeelight.yeelib.R$string.feature_feedback
            java.lang.String r1 = r1.getString(r5)
            java.lang.String r0 = r9.mo23372G()
            r4.<init>(r2, r1, r8, r0)
            goto L_0x0285
        L_0x01ba:
            com.yeelight.yeelib.c.l.w0 r6 = new com.yeelight.yeelib.c.l.w0
            int r2 = com.yeelight.yeelib.R$drawable.icon_yeelight_featue_miband
            int r4 = com.yeelight.yeelib.R$string.feature_mi_band
            java.lang.String r4 = r1.getString(r4)
            java.lang.String r5 = r9.mo23372G()
            r7 = 1
            r0 = r6
            r1 = r2
            r2 = r4
            r3 = r8
            r4 = r5
            r5 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            goto L_0x022a
        L_0x01d3:
            com.yeelight.yeelib.c.l.a0 r4 = new com.yeelight.yeelib.c.l.a0
            int r2 = com.yeelight.yeelib.R$drawable.icon_yeelight_featue_disconnect
            int r5 = com.yeelight.yeelib.R$string.feature_disconnect_bt
            java.lang.String r1 = r1.getString(r5)
            java.lang.String r0 = r9.mo23372G()
            r4.<init>(r2, r1, r8, r0)
            goto L_0x0285
        L_0x01e6:
            com.yeelight.yeelib.c.l.f0 r4 = new com.yeelight.yeelib.c.l.f0
            int r2 = com.yeelight.yeelib.R$drawable.icon_yeelight_featue_firmware
            int r5 = com.yeelight.yeelib.R$string.feature_fw_upgrade
            java.lang.String r1 = r1.getString(r5)
            java.lang.String r0 = r9.mo23372G()
            r4.<init>(r2, r1, r8, r0)
            goto L_0x0285
        L_0x01f9:
            com.yeelight.yeelib.c.l.p r6 = new com.yeelight.yeelib.c.l.p
            int r2 = com.yeelight.yeelib.R$drawable.icon_yeelight_featue_wake_up
            int r4 = com.yeelight.yeelib.R$string.common_text_awake
            java.lang.String r4 = r1.getString(r4)
            java.lang.String r5 = r9.mo23372G()
            r7 = 1
            r0 = r6
            r1 = r2
            r2 = r4
            r3 = r8
            r4 = r5
            r5 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            goto L_0x022a
        L_0x0212:
            com.yeelight.yeelib.c.l.z0 r6 = new com.yeelight.yeelib.c.l.z0
            int r2 = com.yeelight.yeelib.R$drawable.icon_yeelight_featue_night_light
            int r4 = com.yeelight.yeelib.R$string.feature_night_light
            java.lang.String r4 = r1.getString(r4)
            java.lang.String r5 = r9.mo23372G()
            r7 = 1
            r0 = r6
            r1 = r2
            r2 = r4
            r3 = r8
            r4 = r5
            r5 = r7
            r0.<init>(r1, r2, r3, r4, r5)
        L_0x022a:
            r4 = r6
            goto L_0x0285
        L_0x022c:
            boolean r2 = r9 instanceof com.yeelight.yeelib.p150c.p151i.C6033g
            com.yeelight.yeelib.c.l.y r6 = new com.yeelight.yeelib.c.l.y
            if (r2 == 0) goto L_0x0249
            int r2 = com.yeelight.yeelib.R$drawable.icon_yeelight_featue_delay
            int r4 = com.yeelight.yeelib.R$string.fancl_light_delay_feature_name
            java.lang.String r4 = r1.getString(r4)
            java.lang.String r5 = r9.mo23372G()
            r7 = 1
            r0 = r6
            r1 = r2
            r2 = r4
            r3 = r8
            r4 = r5
            r5 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            goto L_0x022a
        L_0x0249:
            int r2 = com.yeelight.yeelib.R$drawable.icon_yeelight_featue_delay
            int r4 = com.yeelight.yeelib.R$string.feature_delay
            java.lang.String r4 = r1.getString(r4)
            java.lang.String r5 = r9.mo23372G()
            r7 = 1
            r0 = r6
            r1 = r2
            r2 = r4
            r3 = r8
            r4 = r5
            r5 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            goto L_0x022a
        L_0x0260:
            boolean r2 = r9 instanceof com.yeelight.yeelib.p150c.p151i.C6033g
            com.yeelight.yeelib.c.l.j1 r4 = new com.yeelight.yeelib.c.l.j1
            if (r2 == 0) goto L_0x0276
            int r2 = com.yeelight.yeelib.R$drawable.icon_yeelight_featue_timer
            int r5 = com.yeelight.yeelib.R$string.fancl_light_timer_feature_name
            java.lang.String r1 = r1.getString(r5)
            java.lang.String r0 = r9.mo23372G()
            r4.<init>(r2, r1, r8, r0)
            goto L_0x0285
        L_0x0276:
            int r2 = com.yeelight.yeelib.R$drawable.icon_yeelight_featue_timer
            int r5 = com.yeelight.yeelib.R$string.feature_alarm
            java.lang.String r1 = r1.getString(r5)
            java.lang.String r0 = r9.mo23372G()
            r4.<init>(r2, r1, r8, r0)
        L_0x0285:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.p150c.p181l.C6126d0.m18438c(int, com.yeelight.yeelib.c.i.d):com.yeelight.yeelib.c.i.h");
    }

    /* renamed from: c0 */
    private static List<C6038h> m18439c0(C4198d dVar) {
        int[] iArr = {29, 11, 1, 2, 17, 15, 19, 5};
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 8; i++) {
            C6038h c = m18438c(iArr[i], dVar);
            if (c != null) {
                arrayList.add(c);
                dVar.mo23365B0(c);
            }
        }
        return arrayList;
    }

    /* renamed from: c1 */
    private static List<C6038h> m18440c1(C4198d dVar) {
        int[] iArr = {29, 2, 1, 15, 5};
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 5; i++) {
            C6038h c = m18438c(iArr[i], dVar);
            if (c != null) {
                arrayList.add(c);
                dVar.mo23365B0(c);
            }
        }
        return arrayList;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.List<com.yeelight.yeelib.p150c.p151i.C6038h> m18441d(java.lang.String r1, com.yeelight.yeelib.p150c.p151i.C4198d r2) {
        /*
            int r0 = r1.hashCode()
            switch(r0) {
                case -1644531059: goto L_0x0491;
                case -1494338802: goto L_0x0486;
                case -1462015191: goto L_0x047b;
                case -1462015190: goto L_0x0470;
                case -1462015189: goto L_0x0465;
                case -1462015188: goto L_0x045a;
                case -1462015187: goto L_0x044f;
                case -1462015186: goto L_0x0444;
                case -1462015185: goto L_0x0439;
                case -1462015184: goto L_0x042d;
                case -1462015183: goto L_0x0421;
                case -1462015182: goto L_0x0415;
                case -1462015160: goto L_0x0409;
                case -1462015159: goto L_0x03fd;
                case -1462015158: goto L_0x03f1;
                case -1462015157: goto L_0x03e5;
                case -1462015156: goto L_0x03d9;
                case -1400275319: goto L_0x03ce;
                case -1350780909: goto L_0x03c2;
                case -1317475940: goto L_0x03b6;
                case -1317475939: goto L_0x03aa;
                case -1317475937: goto L_0x039e;
                case -1317475915: goto L_0x0392;
                case -1317475914: goto L_0x0386;
                case -1317475913: goto L_0x037a;
                case -1317475912: goto L_0x036e;
                case -1308146495: goto L_0x0362;
                case -1308146494: goto L_0x0356;
                case -1308146493: goto L_0x034a;
                case -1308146492: goto L_0x033e;
                case -1308146491: goto L_0x0332;
                case -1308146490: goto L_0x0326;
                case -1308146488: goto L_0x031a;
                case -1308146447: goto L_0x030e;
                case -1308146446: goto L_0x0302;
                case -1308146445: goto L_0x02f6;
                case -1282176368: goto L_0x02eb;
                case -1235140472: goto L_0x02df;
                case -1235140471: goto L_0x02d3;
                case -1235140468: goto L_0x02c7;
                case -1235140467: goto L_0x02bb;
                case -1199119278: goto L_0x02af;
                case -1119332198: goto L_0x02a3;
                case -1063384694: goto L_0x0297;
                case -1063384689: goto L_0x028b;
                case -1063384687: goto L_0x027f;
                case -1063384685: goto L_0x0273;
                case -1035626052: goto L_0x0267;
                case -1035596261: goto L_0x025b;
                case -948847040: goto L_0x024f;
                case -948847038: goto L_0x0243;
                case -888668266: goto L_0x0237;
                case -888668265: goto L_0x022b;
                case -888668264: goto L_0x021f;
                case -850921852: goto L_0x0213;
                case -845289556: goto L_0x0207;
                case -845289555: goto L_0x01fb;
                case -845289553: goto L_0x01ef;
                case -845289551: goto L_0x01e3;
                case -845289508: goto L_0x01d7;
                case -458141175: goto L_0x01cb;
                case -458141174: goto L_0x01bf;
                case -458141173: goto L_0x01b3;
                case -458141172: goto L_0x01a7;
                case -454053748: goto L_0x019b;
                case -449944730: goto L_0x018f;
                case -449944729: goto L_0x0183;
                case -449944728: goto L_0x0177;
                case -449944727: goto L_0x016b;
                case -449944726: goto L_0x015f;
                case -449944724: goto L_0x0153;
                case -449944723: goto L_0x0147;
                case -449944722: goto L_0x013b;
                case -448603205: goto L_0x012f;
                case -448603204: goto L_0x0123;
                case -448603202: goto L_0x0117;
                case -448603201: goto L_0x010b;
                case -448603157: goto L_0x00ff;
                case -448603156: goto L_0x00f3;
                case -443031172: goto L_0x00e8;
                case 922669543: goto L_0x00dc;
                case 922669544: goto L_0x00d0;
                case 922669545: goto L_0x00c4;
                case 922669546: goto L_0x00b8;
                case 922669547: goto L_0x00ac;
                case 922669548: goto L_0x00a0;
                case 922669549: goto L_0x0094;
                case 922669550: goto L_0x0088;
                case 922669551: goto L_0x007c;
                case 1201756974: goto L_0x0070;
                case 1201757021: goto L_0x0064;
                case 1201766335: goto L_0x0059;
                case 1201766336: goto L_0x004e;
                case 1623724661: goto L_0x0042;
                case 1623724662: goto L_0x0036;
                case 1623724663: goto L_0x002a;
                case 2102612488: goto L_0x001f;
                case 2102612489: goto L_0x0014;
                case 2146130361: goto L_0x0009;
                default: goto L_0x0007;
            }
        L_0x0007:
            goto L_0x049c
        L_0x0009:
            java.lang.String r0 = "yeelink.light.dnlight2"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x049c
            r1 = 1
            goto L_0x049d
        L_0x0014:
            java.lang.String r0 = "yeelink.light.meshbulb2"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x049c
            r1 = 3
            goto L_0x049d
        L_0x001f:
            java.lang.String r0 = "yeelink.light.meshbulb1"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x049c
            r1 = 2
            goto L_0x049d
        L_0x002a:
            java.lang.String r0 = "yeelink.light.bslamp3"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x049c
            r1 = 88
            goto L_0x049d
        L_0x0036:
            java.lang.String r0 = "yeelink.light.bslamp2"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x049c
            r1 = 87
            goto L_0x049d
        L_0x0042:
            java.lang.String r0 = "yeelink.light.bslamp1"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x049c
            r1 = 86
            goto L_0x049d
        L_0x004e:
            java.lang.String r0 = "yeelink.light.ml2"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x049c
            r1 = 6
            goto L_0x049d
        L_0x0059:
            java.lang.String r0 = "yeelink.light.ml1"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x049c
            r1 = 5
            goto L_0x049d
        L_0x0064:
            java.lang.String r0 = "yeelink.light.cta"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x049c
            r1 = 20
            goto L_0x049d
        L_0x0070:
            java.lang.String r0 = "yeelink.light.ct2"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x049c
            r1 = 19
            goto L_0x049d
        L_0x007c:
            java.lang.String r0 = "yeelink.light.ceiling9"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x049c
            r1 = 58
            goto L_0x049d
        L_0x0088:
            java.lang.String r0 = "yeelink.light.ceiling8"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x049c
            r1 = 57
            goto L_0x049d
        L_0x0094:
            java.lang.String r0 = "yeelink.light.ceiling7"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x049c
            r1 = 56
            goto L_0x049d
        L_0x00a0:
            java.lang.String r0 = "yeelink.light.ceiling6"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x049c
            r1 = 55
            goto L_0x049d
        L_0x00ac:
            java.lang.String r0 = "yeelink.light.ceiling5"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x049c
            r1 = 48
            goto L_0x049d
        L_0x00b8:
            java.lang.String r0 = "yeelink.light.ceiling4"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x049c
            r1 = 80
            goto L_0x049d
        L_0x00c4:
            java.lang.String r0 = "yeelink.light.ceiling3"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x049c
            r1 = 54
            goto L_0x049d
        L_0x00d0:
            java.lang.String r0 = "yeelink.light.ceiling2"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x049c
            r1 = 53
            goto L_0x049d
        L_0x00dc:
            java.lang.String r0 = "yeelink.light.ceiling1"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x049c
            r1 = 52
            goto L_0x049d
        L_0x00e8:
            java.lang.String r0 = "yeelink.light.spot1"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x049c
            r1 = 4
            goto L_0x049d
        L_0x00f3:
            java.lang.String r0 = "yeelink.light.monob"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x049c
            r1 = 16
            goto L_0x049d
        L_0x00ff:
            java.lang.String r0 = "yeelink.light.monoa"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x049c
            r1 = 15
            goto L_0x049d
        L_0x010b:
            java.lang.String r0 = "yeelink.light.mono5"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x049c
            r1 = 14
            goto L_0x049d
        L_0x0117:
            java.lang.String r0 = "yeelink.light.mono4"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x049c
            r1 = 13
            goto L_0x049d
        L_0x0123:
            java.lang.String r0 = "yeelink.light.mono2"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x049c
            r1 = 12
            goto L_0x049d
        L_0x012f:
            java.lang.String r0 = "yeelink.light.mono1"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x049c
            r1 = 11
            goto L_0x049d
        L_0x013b:
            java.lang.String r0 = "yeelink.light.lamp9"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x049c
            r1 = 35
            goto L_0x049d
        L_0x0147:
            java.lang.String r0 = "yeelink.light.lamp8"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x049c
            r1 = 38
            goto L_0x049d
        L_0x0153:
            java.lang.String r0 = "yeelink.light.lamp7"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x049c
            r1 = 37
            goto L_0x049d
        L_0x015f:
            java.lang.String r0 = "yeelink.light.lamp5"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x049c
            r1 = 41
            goto L_0x049d
        L_0x016b:
            java.lang.String r0 = "yeelink.light.lamp4"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x049c
            r1 = 34
            goto L_0x049d
        L_0x0177:
            java.lang.String r0 = "yeelink.light.lamp3"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x049c
            r1 = 40
            goto L_0x049d
        L_0x0183:
            java.lang.String r0 = "yeelink.light.lamp2"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x049c
            r1 = 39
            goto L_0x049d
        L_0x018f:
            java.lang.String r0 = "yeelink.light.lamp1"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x049c
            r1 = 33
            goto L_0x049d
        L_0x019b:
            java.lang.String r0 = "yeelink.light.group"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x049c
            r1 = 47
            goto L_0x049d
        L_0x01a7:
            java.lang.String r0 = "yeelink.light.ceild"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x049c
            r1 = 72
            goto L_0x049d
        L_0x01b3:
            java.lang.String r0 = "yeelink.light.ceilc"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x049c
            r1 = 85
            goto L_0x049d
        L_0x01bf:
            java.lang.String r0 = "yeelink.light.ceilb"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x049c
            r1 = 84
            goto L_0x049d
        L_0x01cb:
            java.lang.String r0 = "yeelink.light.ceila"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x049c
            r1 = 71
            goto L_0x049d
        L_0x01d7:
            java.lang.String r0 = "yeelink.light.stripa"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x049c
            r1 = 46
            goto L_0x049d
        L_0x01e3:
            java.lang.String r0 = "yeelink.light.strip6"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x049c
            r1 = 45
            goto L_0x049d
        L_0x01ef:
            java.lang.String r0 = "yeelink.light.strip4"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x049c
            r1 = 21
            goto L_0x049d
        L_0x01fb:
            java.lang.String r0 = "yeelink.light.strip2"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x049c
            r1 = 44
            goto L_0x049d
        L_0x0207:
            java.lang.String r0 = "yeelink.light.strip1"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x049c
            r1 = 43
            goto L_0x049d
        L_0x0213:
            java.lang.String r0 = "yeelink.light.sp1grp"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x049c
            r1 = 10
            goto L_0x049d
        L_0x021f:
            java.lang.String r0 = "yilai.light.ceiling3"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x049c
            r1 = 79
            goto L_0x049d
        L_0x022b:
            java.lang.String r0 = "yilai.light.ceiling2"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x049c
            r1 = 78
            goto L_0x049d
        L_0x0237:
            java.lang.String r0 = "yilai.light.ceiling1"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x049c
            r1 = 77
            goto L_0x049d
        L_0x0243:
            java.lang.String r0 = "yeelink.light.panel3"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x049c
            r1 = 18
            goto L_0x049d
        L_0x024f:
            java.lang.String r0 = "yeelink.light.panel1"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x049c
            r1 = 17
            goto L_0x049d
        L_0x025b:
            java.lang.String r0 = "yeelink.light.mb2grp"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x049c
            r1 = 9
            goto L_0x049d
        L_0x0267:
            java.lang.String r0 = "yeelink.light.mb1grp"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x049c
            r1 = 8
            goto L_0x049d
        L_0x0273:
            java.lang.String r0 = "yeelink.light.lamp19"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x049c
            r1 = 89
            goto L_0x049d
        L_0x027f:
            java.lang.String r0 = "yeelink.light.lamp17"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x049c
            r1 = 42
            goto L_0x049d
        L_0x028b:
            java.lang.String r0 = "yeelink.light.lamp15"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x049c
            r1 = 36
            goto L_0x049d
        L_0x0297:
            java.lang.String r0 = "yeelink.light.lamp10"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x049c
            r1 = 31
            goto L_0x049d
        L_0x02a3:
            java.lang.String r0 = "yeelink.wifispeaker.v1"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x049c
            r1 = 91
            goto L_0x049d
        L_0x02af:
            java.lang.String r0 = "yeelink.light.gingko"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x049c
            r1 = 90
            goto L_0x049d
        L_0x02bb:
            java.lang.String r0 = "yeelink.light.fancl6"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x049c
            r1 = 98
            goto L_0x049d
        L_0x02c7:
            java.lang.String r0 = "yeelink.light.fancl5"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x049c
            r1 = 97
            goto L_0x049d
        L_0x02d3:
            java.lang.String r0 = "yeelink.light.fancl2"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x049c
            r1 = 96
            goto L_0x049d
        L_0x02df:
            java.lang.String r0 = "yeelink.light.fancl1"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x049c
            r1 = 95
            goto L_0x049d
        L_0x02eb:
            java.lang.String r0 = "yeelink.light.dn2grp"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x049c
            r1 = 7
            goto L_0x049d
        L_0x02f6:
            java.lang.String r0 = "yeelink.light.colorc"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x049c
            r1 = 29
            goto L_0x049d
        L_0x0302:
            java.lang.String r0 = "yeelink.light.colorb"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x049c
            r1 = 28
            goto L_0x049d
        L_0x030e:
            java.lang.String r0 = "yeelink.light.colora"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x049c
            r1 = 27
            goto L_0x049d
        L_0x031a:
            java.lang.String r0 = "yeelink.light.color8"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x049c
            r1 = 26
            goto L_0x049d
        L_0x0326:
            java.lang.String r0 = "yeelink.light.color6"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x049c
            r1 = 32
            goto L_0x049d
        L_0x0332:
            java.lang.String r0 = "yeelink.light.color5"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x049c
            r1 = 25
            goto L_0x049d
        L_0x033e:
            java.lang.String r0 = "yeelink.light.color4"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x049c
            r1 = 24
            goto L_0x049d
        L_0x034a:
            java.lang.String r0 = "yeelink.light.color3"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x049c
            r1 = 30
            goto L_0x049d
        L_0x0356:
            java.lang.String r0 = "yeelink.light.color2"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x049c
            r1 = 23
            goto L_0x049d
        L_0x0362:
            java.lang.String r0 = "yeelink.light.color1"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x049c
            r1 = 22
            goto L_0x049d
        L_0x036e:
            java.lang.String r0 = "yeelink.light.ceil33"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x049c
            r1 = 70
            goto L_0x049d
        L_0x037a:
            java.lang.String r0 = "yeelink.light.ceil32"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x049c
            r1 = 69
            goto L_0x049d
        L_0x0386:
            java.lang.String r0 = "yeelink.light.ceil31"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x049c
            r1 = 76
            goto L_0x049d
        L_0x0392:
            java.lang.String r0 = "yeelink.light.ceil30"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x049c
            r1 = 68
            goto L_0x049d
        L_0x039e:
            java.lang.String r0 = "yeelink.light.ceil29"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x049c
            r1 = 67
            goto L_0x049d
        L_0x03aa:
            java.lang.String r0 = "yeelink.light.ceil27"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x049c
            r1 = 66
            goto L_0x049d
        L_0x03b6:
            java.lang.String r0 = "yeelink.light.ceil26"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x049c
            r1 = 65
            goto L_0x049d
        L_0x03c2:
            java.lang.String r0 = "yeelink.plug.plug"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x049c
            r1 = 94
            goto L_0x049d
        L_0x03ce:
            java.lang.String r0 = "yeelink.light.ble1"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x049c
            r1 = 0
            goto L_0x049d
        L_0x03d9:
            java.lang.String r0 = "yeelink.light.ceiling24"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x049c
            r1 = 75
            goto L_0x049d
        L_0x03e5:
            java.lang.String r0 = "yeelink.light.ceiling23"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x049c
            r1 = 51
            goto L_0x049d
        L_0x03f1:
            java.lang.String r0 = "yeelink.light.ceiling22"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x049c
            r1 = 50
            goto L_0x049d
        L_0x03fd:
            java.lang.String r0 = "yeelink.light.ceiling21"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x049c
            r1 = 49
            goto L_0x049d
        L_0x0409:
            java.lang.String r0 = "yeelink.light.ceiling20"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x049c
            r1 = 83
            goto L_0x049d
        L_0x0415:
            java.lang.String r0 = "yeelink.light.ceiling19"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x049c
            r1 = 82
            goto L_0x049d
        L_0x0421:
            java.lang.String r0 = "yeelink.light.ceiling18"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x049c
            r1 = 64
            goto L_0x049d
        L_0x042d:
            java.lang.String r0 = "yeelink.light.ceiling17"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x049c
            r1 = 74
            goto L_0x049d
        L_0x0439:
            java.lang.String r0 = "yeelink.light.ceiling16"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x049c
            r1 = 73
            goto L_0x049d
        L_0x0444:
            java.lang.String r0 = "yeelink.light.ceiling15"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x049c
            r1 = 63
            goto L_0x049d
        L_0x044f:
            java.lang.String r0 = "yeelink.light.ceiling14"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x049c
            r1 = 62
            goto L_0x049d
        L_0x045a:
            java.lang.String r0 = "yeelink.light.ceiling13"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x049c
            r1 = 61
            goto L_0x049d
        L_0x0465:
            java.lang.String r0 = "yeelink.light.ceiling12"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x049c
            r1 = 60
            goto L_0x049d
        L_0x0470:
            java.lang.String r0 = "yeelink.light.ceiling11"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x049c
            r1 = 59
            goto L_0x049d
        L_0x047b:
            java.lang.String r0 = "yeelink.light.ceiling10"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x049c
            r1 = 81
            goto L_0x049d
        L_0x0486:
            java.lang.String r0 = "yeelink.switch.sw1"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x049c
            r1 = 93
            goto L_0x049d
        L_0x0491:
            java.lang.String r0 = "yeelink.bhf_light.v1"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x049c
            r1 = 92
            goto L_0x049d
        L_0x049c:
            r1 = -1
        L_0x049d:
            switch(r1) {
                case 0: goto L_0x0550;
                case 1: goto L_0x054b;
                case 2: goto L_0x054b;
                case 3: goto L_0x054b;
                case 4: goto L_0x054b;
                case 5: goto L_0x0546;
                case 6: goto L_0x0546;
                case 7: goto L_0x0541;
                case 8: goto L_0x0541;
                case 9: goto L_0x0541;
                case 10: goto L_0x0541;
                case 11: goto L_0x053c;
                case 12: goto L_0x053c;
                case 13: goto L_0x053c;
                case 14: goto L_0x053c;
                case 15: goto L_0x053c;
                case 16: goto L_0x053c;
                case 17: goto L_0x0537;
                case 18: goto L_0x0537;
                case 19: goto L_0x0532;
                case 20: goto L_0x0532;
                case 21: goto L_0x052d;
                case 22: goto L_0x0528;
                case 23: goto L_0x0528;
                case 24: goto L_0x0528;
                case 25: goto L_0x0528;
                case 26: goto L_0x0528;
                case 27: goto L_0x0528;
                case 28: goto L_0x0528;
                case 29: goto L_0x0528;
                case 30: goto L_0x0523;
                case 31: goto L_0x051e;
                case 32: goto L_0x0519;
                case 33: goto L_0x0514;
                case 34: goto L_0x0514;
                case 35: goto L_0x050f;
                case 36: goto L_0x050a;
                case 37: goto L_0x0505;
                case 38: goto L_0x0505;
                case 39: goto L_0x0500;
                case 40: goto L_0x04fb;
                case 41: goto L_0x04fb;
                case 42: goto L_0x04f6;
                case 43: goto L_0x04f1;
                case 44: goto L_0x04f1;
                case 45: goto L_0x04f1;
                case 46: goto L_0x04f1;
                case 47: goto L_0x04ec;
                case 48: goto L_0x04e7;
                case 49: goto L_0x04e7;
                case 50: goto L_0x04e7;
                case 51: goto L_0x04e7;
                case 52: goto L_0x04e2;
                case 53: goto L_0x04e2;
                case 54: goto L_0x04e2;
                case 55: goto L_0x04e2;
                case 56: goto L_0x04e2;
                case 57: goto L_0x04e2;
                case 58: goto L_0x04e2;
                case 59: goto L_0x04e2;
                case 60: goto L_0x04e2;
                case 61: goto L_0x04e2;
                case 62: goto L_0x04e2;
                case 63: goto L_0x04e2;
                case 64: goto L_0x04e2;
                case 65: goto L_0x04e2;
                case 66: goto L_0x04e2;
                case 67: goto L_0x04e2;
                case 68: goto L_0x04e2;
                case 69: goto L_0x04e2;
                case 70: goto L_0x04e2;
                case 71: goto L_0x04e2;
                case 72: goto L_0x04dd;
                case 73: goto L_0x04d8;
                case 74: goto L_0x04d8;
                case 75: goto L_0x04d8;
                case 76: goto L_0x04d8;
                case 77: goto L_0x04d3;
                case 78: goto L_0x04d3;
                case 79: goto L_0x04d3;
                case 80: goto L_0x04ce;
                case 81: goto L_0x04ce;
                case 82: goto L_0x04ce;
                case 83: goto L_0x04ce;
                case 84: goto L_0x04ce;
                case 85: goto L_0x04ce;
                case 86: goto L_0x04c9;
                case 87: goto L_0x04c9;
                case 88: goto L_0x04c4;
                case 89: goto L_0x04c4;
                case 90: goto L_0x04bf;
                case 91: goto L_0x04ba;
                case 92: goto L_0x04b5;
                case 93: goto L_0x04b0;
                case 94: goto L_0x04ab;
                case 95: goto L_0x04a6;
                case 96: goto L_0x04a6;
                case 97: goto L_0x04a6;
                case 98: goto L_0x04a6;
                default: goto L_0x04a0;
            }
        L_0x04a0:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            return r1
        L_0x04a6:
            java.util.List r1 = m18460j0(r2)
            return r1
        L_0x04ab:
            java.util.List r1 = m18470m1(r2)
            return r1
        L_0x04b0:
            java.util.List r1 = m18381D1(r2)
            return r1
        L_0x04b5:
            java.util.List r1 = m18444e(r2)
            return r1
        L_0x04ba:
            java.util.List r1 = m18485r1(r2)
            return r1
        L_0x04bf:
            java.util.List r1 = m18481q0(r2)
            return r1
        L_0x04c4:
            java.util.List r1 = m18453h(r2)
            return r1
        L_0x04c9:
            java.util.List r1 = m18459j(r2)
            return r1
        L_0x04ce:
            java.util.List r1 = m18436b0(r2)
            return r1
        L_0x04d3:
            java.util.List r1 = m18399J1(r2)
            return r1
        L_0x04d8:
            java.util.List r1 = m18407N0(r2)
            return r1
        L_0x04dd:
            java.util.List r1 = m18474o(r2)
            return r1
        L_0x04e2:
            java.util.List r1 = m18403L0(r2)
            return r1
        L_0x04e7:
            java.util.List r1 = m18495v(r2)
            return r1
        L_0x04ec:
            java.util.List r1 = m18496v0(r2)
            return r1
        L_0x04f1:
            java.util.List r1 = m18372A1(r2)
            return r1
        L_0x04f6:
            java.util.List r1 = m18380D0(r2)
            return r1
        L_0x04fb:
            java.util.List r1 = m18449f1(r2)
            return r1
        L_0x0500:
            java.util.List r1 = m18439c0(r2)
            return r1
        L_0x0505:
            java.util.List r1 = m18389G0(r2)
            return r1
        L_0x050a:
            java.util.List r1 = m18374B0(r2)
            return r1
        L_0x050f:
            java.util.List r1 = m18398J0(r2)
            return r1
        L_0x0514:
            java.util.List r1 = m18411P0(r2)
            return r1
        L_0x0519:
            java.util.List r1 = m18402L(r2)
            return r1
        L_0x051e:
            java.util.List r1 = m18505y0(r2)
            return r1
        L_0x0523:
            java.util.List r1 = m18388G(r2)
            return r1
        L_0x0528:
            java.util.List r1 = m18393H1(r2)
            return r1
        L_0x052d:
            java.util.List r1 = m18497v1(r2)
            return r1
        L_0x0532:
            java.util.List r1 = m18412Q(r2)
            return r1
        L_0x0537:
            java.util.List r1 = m18461j1(r2)
            return r1
        L_0x053c:
            java.util.List r1 = m18428Y(r2)
            return r1
        L_0x0541:
            java.util.List r1 = m18429Y0(r2)
            return r1
        L_0x0546:
            java.util.List r1 = m18440c1(r2)
            return r1
        L_0x054b:
            java.util.List r1 = m18417S0(r2)
            return r1
        L_0x0550:
            java.util.List r1 = m18379D(r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.p150c.p181l.C6126d0.m18441d(java.lang.String, com.yeelight.yeelib.c.i.d):java.util.List");
    }

    /* renamed from: d0 */
    private static Map<Integer, String> m18442d0() {
        HashMap hashMap = new HashMap();
        hashMap.put(29, TimerCodec.DISENABLE);
        hashMap.put(0, TimerCodec.DISENABLE);
        hashMap.put(17, TimerCodec.DISENABLE);
        hashMap.put(1, TimerCodec.DISENABLE);
        hashMap.put(2, TimerCodec.DISENABLE);
        hashMap.put(11, TimerCodec.DISENABLE);
        hashMap.put(15, TimerCodec.DISENABLE);
        hashMap.put(19, TimerCodec.DISENABLE);
        hashMap.put(5, TimerCodec.DISENABLE);
        hashMap.put(9, TimerCodec.DISENABLE);
        if (Build.VERSION.SDK_INT < 26 || ShortcutUtils.isShortcutSupported()) {
            hashMap.put(23, TimerCodec.DISENABLE);
        } else {
            hashMap.put(23, "-1");
        }
        hashMap.put(30, TimerCodec.DISENABLE);
        hashMap.put(31, TimerCodec.DISENABLE);
        hashMap.put(34, TimerCodec.DISENABLE);
        hashMap.put(16, TimerCodec.DISENABLE);
        return hashMap;
    }

    /* renamed from: d1 */
    private static Map<Integer, String> m18443d1() {
        HashMap hashMap = new HashMap();
        hashMap.put(29, TimerCodec.DISENABLE);
        hashMap.put(0, TimerCodec.DISENABLE);
        hashMap.put(1, TimerCodec.DISENABLE);
        hashMap.put(2, TimerCodec.DISENABLE);
        hashMap.put(5, TimerCodec.DISENABLE);
        hashMap.put(9, TimerCodec.DISENABLE);
        hashMap.put(15, TimerCodec.DISENABLE);
        hashMap.put(18, TimerCodec.DISENABLE);
        hashMap.put(23, TimerCodec.DISENABLE);
        hashMap.put(31, TimerCodec.DISENABLE);
        hashMap.put(34, TimerCodec.DISENABLE);
        hashMap.put(30, TimerCodec.DISENABLE);
        hashMap.put(16, TimerCodec.DISENABLE);
        hashMap.put(50, TimerCodec.DISENABLE);
        return hashMap;
    }

    /* renamed from: e */
    private static List<C6038h> m18444e(C4198d dVar) {
        int[] iArr = {29, 1, 2, 3, 25, 20, 15, 5, 18};
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 9; i++) {
            C6038h c = m18438c(iArr[i], dVar);
            if (c != null) {
                arrayList.add(c);
                dVar.mo23365B0(c);
            }
        }
        return arrayList;
    }

    /* renamed from: e0 */
    private static Map<Integer, String> m18445e0() {
        HashMap hashMap = new HashMap();
        hashMap.put(29, TimerCodec.DISENABLE);
        hashMap.put(0, TimerCodec.DISENABLE);
        hashMap.put(1, TimerCodec.DISENABLE);
        hashMap.put(2, TimerCodec.DISENABLE);
        hashMap.put(5, TimerCodec.DISENABLE);
        hashMap.put(9, TimerCodec.DISENABLE);
        hashMap.put(15, TimerCodec.DISENABLE);
        hashMap.put(18, TimerCodec.DISENABLE);
        hashMap.put(20, TimerCodec.DISENABLE);
        if (Build.VERSION.SDK_INT < 26 || ShortcutUtils.isShortcutSupported()) {
            hashMap.put(23, TimerCodec.DISENABLE);
        } else {
            hashMap.put(23, "-1");
        }
        hashMap.put(25, TimerCodec.DISENABLE);
        hashMap.put(3, TimerCodec.DISENABLE);
        hashMap.put(30, "23");
        hashMap.put(31, TimerCodec.DISENABLE);
        hashMap.put(34, TimerCodec.DISENABLE);
        hashMap.put(16, TimerCodec.DISENABLE);
        return hashMap;
    }

    /* renamed from: e1 */
    private static List<C6122c0> m18446e1(C4198d dVar) {
        Resources resources = C4297y.f7456e.getResources();
        ArrayList arrayList = new ArrayList();
        int[] iArr = {0, 50, 23, 9, 34, 16};
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < 6; i++) {
            C6038h b = m18435b(iArr[i], dVar);
            if (b != null) {
                arrayList2.add(b);
                dVar.mo23365B0(b);
            }
        }
        if (arrayList2.size() > 0) {
            arrayList.add(new C6122c0(resources.getString(R$string.feature_group_device), arrayList2));
        }
        return arrayList;
    }

    /* renamed from: f */
    private static Map<Integer, String> m18447f() {
        HashMap hashMap = new HashMap();
        hashMap.put(29, TimerCodec.DISENABLE);
        hashMap.put(0, TimerCodec.DISENABLE);
        hashMap.put(1, TimerCodec.DISENABLE);
        hashMap.put(2, TimerCodec.DISENABLE);
        hashMap.put(5, TimerCodec.DISENABLE);
        hashMap.put(9, TimerCodec.DISENABLE);
        hashMap.put(15, TimerCodec.DISENABLE);
        hashMap.put(18, TimerCodec.DISENABLE);
        hashMap.put(20, TimerCodec.DISENABLE);
        if (Build.VERSION.SDK_INT < 26 || ShortcutUtils.isShortcutSupported()) {
            hashMap.put(23, TimerCodec.DISENABLE);
        } else {
            hashMap.put(23, "-1");
        }
        hashMap.put(25, TimerCodec.DISENABLE);
        hashMap.put(3, TimerCodec.DISENABLE);
        hashMap.put(30, "70");
        hashMap.put(31, TimerCodec.DISENABLE);
        hashMap.put(34, TimerCodec.DISENABLE);
        hashMap.put(16, TimerCodec.DISENABLE);
        return hashMap;
    }

    /* renamed from: f0 */
    private static Map<Integer, String> m18448f0() {
        HashMap hashMap = new HashMap();
        hashMap.put(29, TimerCodec.DISENABLE);
        hashMap.put(0, TimerCodec.DISENABLE);
        hashMap.put(1, TimerCodec.DISENABLE);
        hashMap.put(2, TimerCodec.DISENABLE);
        hashMap.put(5, TimerCodec.DISENABLE);
        hashMap.put(9, TimerCodec.DISENABLE);
        hashMap.put(15, TimerCodec.DISENABLE);
        hashMap.put(18, TimerCodec.DISENABLE);
        hashMap.put(20, TimerCodec.DISENABLE);
        hashMap.put(23, TimerCodec.DISENABLE);
        hashMap.put(25, TimerCodec.DISENABLE);
        hashMap.put(3, TimerCodec.DISENABLE);
        hashMap.put(30, "26");
        hashMap.put(31, TimerCodec.DISENABLE);
        hashMap.put(32, TimerCodec.DISENABLE);
        hashMap.put(34, TimerCodec.DISENABLE);
        hashMap.put(36, TimerCodec.DISENABLE);
        hashMap.put(16, TimerCodec.DISENABLE);
        return hashMap;
    }

    /* renamed from: f1 */
    private static List<C6038h> m18449f1(C4198d dVar) {
        int[] iArr = {29, 1, 2, 17, 15, 19, 5, 18, 35};
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 9; i++) {
            C6038h c = m18438c(iArr[i], dVar);
            if (c != null) {
                arrayList.add(c);
                dVar.mo23365B0(c);
            }
        }
        return arrayList;
    }

    /* renamed from: g */
    private static Map<Integer, String> m18450g() {
        HashMap hashMap = new HashMap();
        hashMap.put(29, TimerCodec.DISENABLE);
        hashMap.put(0, TimerCodec.DISENABLE);
        hashMap.put(1, TimerCodec.DISENABLE);
        hashMap.put(2, TimerCodec.DISENABLE);
        hashMap.put(5, TimerCodec.DISENABLE);
        hashMap.put(9, TimerCodec.DISENABLE);
        hashMap.put(20, TimerCodec.DISENABLE);
        hashMap.put(25, TimerCodec.DISENABLE);
        hashMap.put(15, TimerCodec.DISENABLE);
        if (Build.VERSION.SDK_INT < 26 || ShortcutUtils.isShortcutSupported()) {
            hashMap.put(23, TimerCodec.DISENABLE);
        } else {
            hashMap.put(23, "-1");
        }
        hashMap.put(3, TimerCodec.DISENABLE);
        hashMap.put(27, TimerCodec.DISENABLE);
        hashMap.put(31, TimerCodec.DISENABLE);
        hashMap.put(15, TimerCodec.DISENABLE);
        hashMap.put(34, TimerCodec.DISENABLE);
        hashMap.put(16, TimerCodec.DISENABLE);
        hashMap.put(30, TimerCodec.DISENABLE);
        return hashMap;
    }

    /* renamed from: g0 */
    private static List<C6122c0> m18451g0(C4198d dVar) {
        Resources resources = C4297y.f7456e.getResources();
        ArrayList arrayList = new ArrayList();
        int[] iArr = {0, 23, 32, 9, 34, 16};
        int[] iArr2 = {36};
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < 6; i++) {
            C6038h b = m18435b(iArr[i], dVar);
            if (b != null) {
                arrayList2.add(b);
                dVar.mo23365B0(b);
            }
        }
        if (C4308b.f7482a) {
            for (int i2 = 0; i2 < 1; i2++) {
                C6038h c = m18438c(iArr2[i2], dVar);
                if (c != null) {
                    arrayList2.add(c);
                    dVar.mo23365B0(c);
                }
            }
        }
        if (arrayList2.size() > 0) {
            arrayList.add(new C6122c0(resources.getString(R$string.feature_group_device), arrayList2));
        }
        return arrayList;
    }

    /* renamed from: g1 */
    private static Map<Integer, String> m18452g1() {
        HashMap hashMap = new HashMap();
        hashMap.put(29, TimerCodec.DISENABLE);
        hashMap.put(0, TimerCodec.DISENABLE);
        hashMap.put(1, TimerCodec.DISENABLE);
        hashMap.put(2, TimerCodec.DISENABLE);
        hashMap.put(15, TimerCodec.DISENABLE);
        hashMap.put(18, TimerCodec.DISENABLE);
        hashMap.put(35, TimerCodec.DISENABLE);
        hashMap.put(5, TimerCodec.DISENABLE);
        hashMap.put(9, TimerCodec.DISENABLE);
        if (Build.VERSION.SDK_INT < 26 || ShortcutUtils.isShortcutSupported()) {
            hashMap.put(23, TimerCodec.DISENABLE);
        } else {
            hashMap.put(23, "-1");
        }
        hashMap.put(30, TimerCodec.DISENABLE);
        hashMap.put(31, TimerCodec.DISENABLE);
        hashMap.put(34, TimerCodec.DISENABLE);
        hashMap.put(16, TimerCodec.DISENABLE);
        return hashMap;
    }

    /* renamed from: h */
    private static List<C6038h> m18453h(C4198d dVar) {
        int[] iArr = {29, 27, 2, 1, 3, 21, 15, 5, 18};
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 9; i++) {
            C6038h c = m18438c(iArr[i], dVar);
            if (c != null) {
                arrayList.add(c);
                dVar.mo23365B0(c);
            }
        }
        return arrayList;
    }

    /* renamed from: h0 */
    private static List<C6038h> m18454h0(C4198d dVar) {
        int[] iArr = {1, 25, 15, 5};
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 4; i++) {
            C6038h a = m18432a(iArr[i], dVar);
            if (a != null) {
                arrayList.add(a);
                dVar.mo23365B0(a);
            }
        }
        return arrayList;
    }

    /* renamed from: h1 */
    private static List<C6122c0> m18455h1(C4198d dVar) {
        return m18415R0(dVar);
    }

    /* renamed from: i */
    private static Map<Integer, String> m18456i() {
        HashMap hashMap = new HashMap();
        hashMap.put(29, TimerCodec.DISENABLE);
        hashMap.put(0, TimerCodec.DISENABLE);
        hashMap.put(1, TimerCodec.DISENABLE);
        hashMap.put(2, TimerCodec.DISENABLE);
        hashMap.put(5, TimerCodec.DISENABLE);
        hashMap.put(9, TimerCodec.DISENABLE);
        hashMap.put(18, TimerCodec.DISENABLE);
        hashMap.put(20, TimerCodec.DISENABLE);
        hashMap.put(21, TimerCodec.DISENABLE);
        hashMap.put(25, TimerCodec.DISENABLE);
        hashMap.put(15, TimerCodec.DISENABLE);
        if (Build.VERSION.SDK_INT < 26 || ShortcutUtils.isShortcutSupported()) {
            hashMap.put(23, TimerCodec.DISENABLE);
        } else {
            hashMap.put(23, "-1");
        }
        hashMap.put(3, TimerCodec.DISENABLE);
        hashMap.put(27, TimerCodec.DISENABLE);
        hashMap.put(31, TimerCodec.DISENABLE);
        hashMap.put(15, TimerCodec.DISENABLE);
        hashMap.put(34, TimerCodec.DISENABLE);
        hashMap.put(16, TimerCodec.DISENABLE);
        hashMap.put(39, TimerCodec.DISENABLE);
        return hashMap;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: i0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.List<com.yeelight.yeelib.p150c.p151i.C6038h> m18457i0(java.lang.String r4, com.yeelight.yeelib.p150c.p151i.C4198d r5) {
        /*
            int r0 = r4.hashCode()
            r1 = 3
            r2 = 2
            r3 = 1
            switch(r0) {
                case -1235140472: goto L_0x0029;
                case -1235140471: goto L_0x001f;
                case -1235140470: goto L_0x000a;
                case -1235140469: goto L_0x000a;
                case -1235140468: goto L_0x0015;
                case -1235140467: goto L_0x000b;
                default: goto L_0x000a;
            }
        L_0x000a:
            goto L_0x0033
        L_0x000b:
            java.lang.String r0 = "yeelink.light.fancl6"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x0033
            r4 = 3
            goto L_0x0034
        L_0x0015:
            java.lang.String r0 = "yeelink.light.fancl5"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x0033
            r4 = 2
            goto L_0x0034
        L_0x001f:
            java.lang.String r0 = "yeelink.light.fancl2"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x0033
            r4 = 1
            goto L_0x0034
        L_0x0029:
            java.lang.String r0 = "yeelink.light.fancl1"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x0033
            r4 = 0
            goto L_0x0034
        L_0x0033:
            r4 = -1
        L_0x0034:
            if (r4 == 0) goto L_0x0047
            if (r4 == r3) goto L_0x0042
            if (r4 == r2) goto L_0x0042
            if (r4 == r1) goto L_0x0042
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            return r4
        L_0x0042:
            java.util.List r4 = m18454h0(r5)
            return r4
        L_0x0047:
            java.util.List r4 = m18454h0(r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.p150c.p181l.C6126d0.m18457i0(java.lang.String, com.yeelight.yeelib.c.i.d):java.util.List");
    }

    /* renamed from: i1 */
    public static List<Integer> m18458i1() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(0);
        arrayList.add(1);
        arrayList.add(5);
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(8);
        arrayList.add(25);
        arrayList.add(16);
        arrayList.add(12);
        return arrayList;
    }

    /* renamed from: j */
    private static List<C6038h> m18459j(C4198d dVar) {
        int[] iArr = {29, 27, 2, 1, 3, 15, 5};
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 7; i++) {
            C6038h c = m18438c(iArr[i], dVar);
            if (c != null) {
                arrayList.add(c);
                dVar.mo23365B0(c);
            }
        }
        return arrayList;
    }

    /* renamed from: j0 */
    private static List<C6038h> m18460j0(C4198d dVar) {
        int[] iArr = {29, 1, 2, 3, 25, 15, 5};
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 7; i++) {
            C6038h c = m18438c(iArr[i], dVar);
            if (c != null) {
                arrayList.add(c);
                dVar.mo23365B0(c);
            }
        }
        return arrayList;
    }

    /* renamed from: j1 */
    private static List<C6038h> m18461j1(C4198d dVar) {
        int[] iArr = {29, 2, 1, 3, 25, 15, 5, 18};
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 8; i++) {
            C6038h c = m18438c(iArr[i], dVar);
            if (c != null) {
                arrayList.add(c);
                dVar.mo23365B0(c);
            }
        }
        return arrayList;
    }

    /* renamed from: k */
    private static Map<Integer, String> m18462k() {
        HashMap hashMap = new HashMap();
        hashMap.put(29, TimerCodec.DISENABLE);
        hashMap.put(0, TimerCodec.DISENABLE);
        hashMap.put(1, TimerCodec.DISENABLE);
        hashMap.put(2, TimerCodec.DISENABLE);
        hashMap.put(5, TimerCodec.DISENABLE);
        hashMap.put(9, TimerCodec.DISENABLE);
        hashMap.put(20, TimerCodec.DISENABLE);
        hashMap.put(25, TimerCodec.DISENABLE);
        hashMap.put(15, TimerCodec.DISENABLE);
        if (Build.VERSION.SDK_INT < 26 || ShortcutUtils.isShortcutSupported()) {
            hashMap.put(23, TimerCodec.DISENABLE);
        } else {
            hashMap.put(23, "-1");
        }
        hashMap.put(3, TimerCodec.DISENABLE);
        hashMap.put(27, TimerCodec.DISENABLE);
        hashMap.put(31, TimerCodec.DISENABLE);
        hashMap.put(15, TimerCodec.DISENABLE);
        hashMap.put(34, TimerCodec.DISENABLE);
        hashMap.put(16, TimerCodec.DISENABLE);
        return hashMap;
    }

    /* renamed from: k0 */
    private static Map<Integer, String> m18463k0() {
        HashMap hashMap = new HashMap();
        hashMap.put(0, TimerCodec.DISENABLE);
        hashMap.put(9, TimerCodec.DISENABLE);
        hashMap.put(5, TimerCodec.DISENABLE);
        hashMap.put(34, TimerCodec.DISENABLE);
        hashMap.put(16, TimerCodec.DISENABLE);
        hashMap.put(1, TimerCodec.DISENABLE);
        hashMap.put(15, TimerCodec.DISENABLE);
        hashMap.put(29, TimerCodec.DISENABLE);
        hashMap.put(25, TimerCodec.DISENABLE);
        hashMap.put(2, TimerCodec.DISENABLE);
        hashMap.put(3, TimerCodec.DISENABLE);
        return hashMap;
    }

    /* renamed from: k1 */
    private static Map<Integer, String> m18464k1() {
        HashMap hashMap = new HashMap();
        hashMap.put(29, TimerCodec.DISENABLE);
        hashMap.put(0, TimerCodec.DISENABLE);
        hashMap.put(1, TimerCodec.DISENABLE);
        hashMap.put(2, TimerCodec.DISENABLE);
        hashMap.put(5, TimerCodec.DISENABLE);
        hashMap.put(9, TimerCodec.DISENABLE);
        hashMap.put(15, TimerCodec.DISENABLE);
        hashMap.put(18, TimerCodec.DISENABLE);
        hashMap.put(23, TimerCodec.DISENABLE);
        hashMap.put(31, TimerCodec.DISENABLE);
        hashMap.put(34, TimerCodec.DISENABLE);
        hashMap.put(30, TimerCodec.DISENABLE);
        hashMap.put(38, TimerCodec.DISENABLE);
        hashMap.put(16, TimerCodec.DISENABLE);
        hashMap.put(3, TimerCodec.DISENABLE);
        hashMap.put(25, TimerCodec.DISENABLE);
        return hashMap;
    }

    /* renamed from: l */
    private static List<C6122c0> m18465l(C4198d dVar) {
        Resources resources = C4297y.f7456e.getResources();
        ArrayList arrayList = new ArrayList();
        int[] iArr = {0, 23, 9, 34, 16};
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < 5; i++) {
            C6038h b = m18435b(iArr[i], dVar);
            if (b != null) {
                arrayList2.add(b);
                dVar.mo23365B0(b);
            }
        }
        if (arrayList2.size() > 0) {
            arrayList.add(new C6122c0(resources.getString(R$string.feature_group_device), arrayList2));
        }
        return arrayList;
    }

    /* renamed from: l0 */
    private static List<C6122c0> m18466l0(C4198d dVar) {
        Resources resources = C4297y.f7456e.getResources();
        ArrayList arrayList = new ArrayList();
        int[] iArr = {0, 9, 34, 16};
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < 4; i++) {
            C6038h b = m18435b(iArr[i], dVar);
            if (b != null) {
                arrayList2.add(b);
                dVar.mo23365B0(b);
            }
        }
        arrayList.add(new C6122c0(resources.getString(R$string.feature_group_device), arrayList2));
        return arrayList;
    }

    /* renamed from: l1 */
    private static Map<Integer, String> m18467l1() {
        HashMap hashMap = new HashMap();
        hashMap.put(29, TimerCodec.DISENABLE);
        hashMap.put(0, TimerCodec.DISENABLE);
        hashMap.put(1, TimerCodec.DISENABLE);
        hashMap.put(2, TimerCodec.DISENABLE);
        hashMap.put(5, TimerCodec.DISENABLE);
        hashMap.put(9, TimerCodec.DISENABLE);
        hashMap.put(15, TimerCodec.DISENABLE);
        hashMap.put(18, TimerCodec.DISENABLE);
        if (Build.VERSION.SDK_INT < 26 || ShortcutUtils.isShortcutSupported()) {
            hashMap.put(23, TimerCodec.DISENABLE);
        } else {
            hashMap.put(23, "-1");
        }
        hashMap.put(30, TimerCodec.DISENABLE);
        hashMap.put(31, TimerCodec.DISENABLE);
        hashMap.put(34, TimerCodec.DISENABLE);
        hashMap.put(16, TimerCodec.DISENABLE);
        hashMap.put(38, TimerCodec.DISENABLE);
        hashMap.put(3, TimerCodec.DISENABLE);
        hashMap.put(25, TimerCodec.DISENABLE);
        return hashMap;
    }

    /* renamed from: m */
    private static List<C6122c0> m18468m(C4198d dVar) {
        Resources resources = C4297y.f7456e.getResources();
        ArrayList arrayList = new ArrayList();
        int[] iArr = {0, 39, 23, 9, 34, 16};
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < 6; i++) {
            C6038h b = m18435b(iArr[i], dVar);
            if (b != null) {
                arrayList2.add(b);
                dVar.mo23365B0(b);
            }
        }
        if (arrayList2.size() > 0) {
            arrayList.add(new C6122c0(resources.getString(R$string.feature_group_device), arrayList2));
        }
        return arrayList;
    }

    /* renamed from: m0 */
    private static Map<Integer, String> m18469m0() {
        HashMap hashMap = new HashMap();
        hashMap.put(0, TimerCodec.DISENABLE);
        hashMap.put(9, TimerCodec.DISENABLE);
        hashMap.put(5, TimerCodec.DISENABLE);
        hashMap.put(34, TimerCodec.DISENABLE);
        hashMap.put(16, TimerCodec.DISENABLE);
        hashMap.put(1, TimerCodec.DISENABLE);
        hashMap.put(15, TimerCodec.DISENABLE);
        hashMap.put(29, TimerCodec.DISENABLE);
        hashMap.put(25, TimerCodec.DISENABLE);
        hashMap.put(2, TimerCodec.DISENABLE);
        hashMap.put(3, TimerCodec.DISENABLE);
        hashMap.put(38, "77");
        return hashMap;
    }

    /* renamed from: m1 */
    private static List<C6038h> m18470m1(C4198d dVar) {
        int[] iArr = {1, 15, 5};
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 3; i++) {
            C6038h c = m18438c(iArr[i], dVar);
            if (c != null) {
                arrayList.add(c);
                dVar.mo23365B0(c);
            }
        }
        return arrayList;
    }

    /* renamed from: n */
    private static List<C6122c0> m18471n(C4198d dVar) {
        Resources resources = C4297y.f7456e.getResources();
        ArrayList arrayList = new ArrayList();
        int[] iArr = {0, 25, 20, 23, 9, 34, 16};
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < 7; i++) {
            C6038h b = m18435b(iArr[i], dVar);
            if (b != null) {
                arrayList2.add(b);
                dVar.mo23365B0(b);
            }
        }
        if (arrayList2.size() > 0) {
            arrayList.add(new C6122c0(resources.getString(R$string.feature_group_device), arrayList2));
        }
        return arrayList;
    }

    /* renamed from: n0 */
    private static List<C6122c0> m18472n0(C4198d dVar) {
        Resources resources = C4297y.f7456e.getResources();
        ArrayList arrayList = new ArrayList();
        int[] iArr = {0, 38, 9, 34, 16};
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < 5; i++) {
            C6038h b = m18435b(iArr[i], dVar);
            if (b != null) {
                arrayList2.add(b);
                dVar.mo23365B0(b);
            }
        }
        arrayList.add(new C6122c0(resources.getString(R$string.feature_group_device), arrayList2));
        return arrayList;
    }

    /* renamed from: n1 */
    private static Map<Integer, String> m18473n1() {
        HashMap hashMap = new HashMap();
        hashMap.put(0, TimerCodec.DISENABLE);
        hashMap.put(9, TimerCodec.DISENABLE);
        hashMap.put(5, TimerCodec.DISENABLE);
        hashMap.put(34, TimerCodec.DISENABLE);
        hashMap.put(16, TimerCodec.DISENABLE);
        hashMap.put(1, TimerCodec.DISENABLE);
        hashMap.put(15, TimerCodec.DISENABLE);
        return hashMap;
    }

    /* renamed from: o */
    private static List<C6038h> m18474o(C4198d dVar) {
        int[] iArr = {29, 1, 2, 3, 25, 15, 5, 18};
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 8; i++) {
            C6038h c = m18438c(iArr[i], dVar);
            if (c != null) {
                arrayList.add(c);
                dVar.mo23365B0(c);
            }
        }
        return arrayList;
    }

    /* renamed from: o0 */
    private static Map<Integer, String> m18475o0() {
        HashMap hashMap = new HashMap();
        hashMap.put(0, TimerCodec.DISENABLE);
        hashMap.put(9, TimerCodec.DISENABLE);
        hashMap.put(5, TimerCodec.DISENABLE);
        hashMap.put(34, TimerCodec.DISENABLE);
        hashMap.put(16, TimerCodec.DISENABLE);
        hashMap.put(1, TimerCodec.DISENABLE);
        hashMap.put(15, TimerCodec.DISENABLE);
        hashMap.put(29, TimerCodec.DISENABLE);
        hashMap.put(25, TimerCodec.DISENABLE);
        hashMap.put(2, TimerCodec.DISENABLE);
        hashMap.put(3, TimerCodec.DISENABLE);
        hashMap.put(38, TimerCodec.DISENABLE);
        return hashMap;
    }

    /* renamed from: o1 */
    private static List<C6122c0> m18476o1(C4198d dVar) {
        Resources resources = C4297y.f7456e.getResources();
        ArrayList arrayList = new ArrayList();
        int[] iArr = {0, 9, 34, 16};
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < 4; i++) {
            C6038h b = m18435b(iArr[i], dVar);
            if (b != null) {
                arrayList2.add(b);
                dVar.mo23365B0(b);
            }
        }
        arrayList.add(new C6122c0(resources.getString(R$string.feature_group_device), arrayList2));
        return arrayList;
    }

    /* renamed from: p */
    private static Map<Integer, String> m18477p() {
        HashMap hashMap = new HashMap();
        hashMap.put(29, TimerCodec.DISENABLE);
        hashMap.put(0, TimerCodec.DISENABLE);
        hashMap.put(1, TimerCodec.DISENABLE);
        hashMap.put(2, TimerCodec.DISENABLE);
        hashMap.put(5, TimerCodec.DISENABLE);
        hashMap.put(9, TimerCodec.DISENABLE);
        hashMap.put(15, TimerCodec.DISENABLE);
        hashMap.put(18, TimerCodec.DISENABLE);
        hashMap.put(20, TimerCodec.DISENABLE);
        hashMap.put(23, TimerCodec.DISENABLE);
        hashMap.put(25, TimerCodec.DISENABLE);
        hashMap.put(3, TimerCodec.DISENABLE);
        hashMap.put(30, "26");
        hashMap.put(31, TimerCodec.DISENABLE);
        hashMap.put(32, TimerCodec.DISENABLE);
        hashMap.put(34, TimerCodec.DISENABLE);
        hashMap.put(36, TimerCodec.DISENABLE);
        hashMap.put(38, TimerCodec.DISENABLE);
        hashMap.put(16, TimerCodec.DISENABLE);
        return hashMap;
    }

    /* renamed from: p0 */
    private static List<C6122c0> m18478p0(C4198d dVar) {
        Resources resources = C4297y.f7456e.getResources();
        ArrayList arrayList = new ArrayList();
        int[] iArr = {0, 38, 9, 34, 16};
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < 5; i++) {
            C6038h b = m18435b(iArr[i], dVar);
            if (b != null) {
                arrayList2.add(b);
                dVar.mo23365B0(b);
            }
        }
        arrayList.add(new C6122c0(resources.getString(R$string.feature_group_device), arrayList2));
        return arrayList;
    }

    /* renamed from: p1 */
    private static Map<Integer, String> m18479p1() {
        HashMap hashMap = new HashMap();
        hashMap.put(29, TimerCodec.DISENABLE);
        hashMap.put(0, TimerCodec.DISENABLE);
        hashMap.put(1, TimerCodec.DISENABLE);
        hashMap.put(2, TimerCodec.DISENABLE);
        hashMap.put(5, TimerCodec.DISENABLE);
        hashMap.put(9, TimerCodec.DISENABLE);
        hashMap.put(15, TimerCodec.DISENABLE);
        hashMap.put(18, TimerCodec.DISENABLE);
        hashMap.put(23, TimerCodec.DISENABLE);
        hashMap.put(31, TimerCodec.DISENABLE);
        hashMap.put(34, TimerCodec.DISENABLE);
        hashMap.put(30, TimerCodec.DISENABLE);
        hashMap.put(38, TimerCodec.DISENABLE);
        hashMap.put(16, TimerCodec.DISENABLE);
        hashMap.put(50, TimerCodec.DISENABLE);
        return hashMap;
    }

    /* renamed from: q */
    private static List<C6122c0> m18480q(C4198d dVar) {
        Resources resources = C4297y.f7456e.getResources();
        ArrayList arrayList = new ArrayList();
        int[] iArr = {0, 38, 23, 32, 9, 34, 16};
        int[] iArr2 = {36};
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < 7; i++) {
            C6038h b = m18435b(iArr[i], dVar);
            if (b != null) {
                arrayList2.add(b);
                dVar.mo23365B0(b);
            }
        }
        if (C4308b.f7482a) {
            for (int i2 = 0; i2 < 1; i2++) {
                C6038h c = m18438c(iArr2[i2], dVar);
                if (c != null) {
                    arrayList2.add(c);
                    dVar.mo23365B0(c);
                }
            }
        }
        if (arrayList2.size() > 0) {
            arrayList.add(new C6122c0(resources.getString(R$string.feature_group_device), arrayList2));
        }
        return arrayList;
    }

    /* renamed from: q0 */
    private static List<C6038h> m18481q0(C4198d dVar) {
        int[] iArr = {29, 2, 5};
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 3; i++) {
            C6038h c = m18438c(iArr[i], dVar);
            if (c != null) {
                arrayList.add(c);
                dVar.mo23365B0(c);
            }
        }
        return arrayList;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: q1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.List<com.yeelight.yeelib.p150c.p181l.C6122c0> m18482q1(java.lang.String r1, com.yeelight.yeelib.p150c.p151i.C4198d r2) {
        /*
            int r0 = r1.hashCode()
            switch(r0) {
                case -1644531059: goto L_0x04d9;
                case -1494338802: goto L_0x04ce;
                case -1462015191: goto L_0x04c3;
                case -1462015190: goto L_0x04b8;
                case -1462015189: goto L_0x04ad;
                case -1462015188: goto L_0x04a2;
                case -1462015187: goto L_0x0497;
                case -1462015186: goto L_0x048c;
                case -1462015185: goto L_0x0481;
                case -1462015184: goto L_0x0475;
                case -1462015183: goto L_0x0469;
                case -1462015182: goto L_0x045d;
                case -1462015160: goto L_0x0451;
                case -1462015159: goto L_0x0445;
                case -1462015158: goto L_0x0439;
                case -1462015157: goto L_0x042d;
                case -1462015156: goto L_0x0421;
                case -1400275319: goto L_0x0416;
                case -1399953856: goto L_0x040a;
                case -1399795410: goto L_0x03fe;
                case -1350780909: goto L_0x03f2;
                case -1317475940: goto L_0x03e6;
                case -1317475939: goto L_0x03da;
                case -1317475937: goto L_0x03ce;
                case -1317475915: goto L_0x03c2;
                case -1317475914: goto L_0x03b6;
                case -1317475913: goto L_0x03aa;
                case -1317475912: goto L_0x039e;
                case -1308146495: goto L_0x0392;
                case -1308146494: goto L_0x0386;
                case -1308146493: goto L_0x037a;
                case -1308146492: goto L_0x036e;
                case -1308146491: goto L_0x0362;
                case -1308146490: goto L_0x0356;
                case -1308146488: goto L_0x034a;
                case -1308146447: goto L_0x033e;
                case -1308146446: goto L_0x0332;
                case -1308146445: goto L_0x0326;
                case -1282176368: goto L_0x031b;
                case -1235140472: goto L_0x030f;
                case -1235140471: goto L_0x0303;
                case -1235140468: goto L_0x02f7;
                case -1235140467: goto L_0x02eb;
                case -1199119278: goto L_0x02df;
                case -1119332198: goto L_0x02d3;
                case -1063384694: goto L_0x02c7;
                case -1063384689: goto L_0x02bb;
                case -1063384687: goto L_0x02af;
                case -1063384685: goto L_0x02a3;
                case -1035626052: goto L_0x0297;
                case -1035596261: goto L_0x028b;
                case -948847040: goto L_0x027f;
                case -948847038: goto L_0x0273;
                case -888668266: goto L_0x0267;
                case -888668265: goto L_0x025b;
                case -888668264: goto L_0x024f;
                case -850921852: goto L_0x0243;
                case -845289556: goto L_0x0237;
                case -845289555: goto L_0x022b;
                case -845289553: goto L_0x021f;
                case -845289551: goto L_0x0213;
                case -845289508: goto L_0x0207;
                case -458141175: goto L_0x01fb;
                case -458141174: goto L_0x01ef;
                case -458141173: goto L_0x01e3;
                case -458141172: goto L_0x01d7;
                case -454053748: goto L_0x01cb;
                case -449944730: goto L_0x01bf;
                case -449944729: goto L_0x01b3;
                case -449944728: goto L_0x01a7;
                case -449944727: goto L_0x019b;
                case -449944726: goto L_0x018f;
                case -449944724: goto L_0x0183;
                case -449944723: goto L_0x0177;
                case -449944722: goto L_0x016b;
                case -448603205: goto L_0x015f;
                case -448603204: goto L_0x0153;
                case -448603202: goto L_0x0147;
                case -448603201: goto L_0x013b;
                case -448603157: goto L_0x012f;
                case -448603156: goto L_0x0123;
                case -443031172: goto L_0x0118;
                case -190173984: goto L_0x010c;
                case -190173936: goto L_0x0100;
                case 250266083: goto L_0x00f4;
                case 674030242: goto L_0x00e8;
                case 922669543: goto L_0x00dc;
                case 922669544: goto L_0x00d0;
                case 922669545: goto L_0x00c4;
                case 922669546: goto L_0x00b8;
                case 922669547: goto L_0x00ac;
                case 922669548: goto L_0x00a0;
                case 922669549: goto L_0x0094;
                case 922669550: goto L_0x0088;
                case 922669551: goto L_0x007c;
                case 1201756974: goto L_0x0070;
                case 1201757021: goto L_0x0064;
                case 1201766335: goto L_0x0059;
                case 1201766336: goto L_0x004e;
                case 1623724661: goto L_0x0042;
                case 1623724662: goto L_0x0036;
                case 1623724663: goto L_0x002a;
                case 2102612488: goto L_0x001f;
                case 2102612489: goto L_0x0014;
                case 2146130361: goto L_0x0009;
                default: goto L_0x0007;
            }
        L_0x0007:
            goto L_0x04e4
        L_0x0009:
            java.lang.String r0 = "yeelink.light.dnlight2"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x04e4
            r1 = 1
            goto L_0x04e5
        L_0x0014:
            java.lang.String r0 = "yeelink.light.meshbulb2"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x04e4
            r1 = 3
            goto L_0x04e5
        L_0x001f:
            java.lang.String r0 = "yeelink.light.meshbulb1"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x04e4
            r1 = 2
            goto L_0x04e5
        L_0x002a:
            java.lang.String r0 = "yeelink.light.bslamp3"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x04e4
            r1 = 62
            goto L_0x04e5
        L_0x0036:
            java.lang.String r0 = "yeelink.light.bslamp2"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x04e4
            r1 = 61
            goto L_0x04e5
        L_0x0042:
            java.lang.String r0 = "yeelink.light.bslamp1"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x04e4
            r1 = 60
            goto L_0x04e5
        L_0x004e:
            java.lang.String r0 = "yeelink.light.ml2"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x04e4
            r1 = 6
            goto L_0x04e5
        L_0x0059:
            java.lang.String r0 = "yeelink.light.ml1"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x04e4
            r1 = 5
            goto L_0x04e5
        L_0x0064:
            java.lang.String r0 = "yeelink.light.cta"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x04e4
            r1 = 52
            goto L_0x04e5
        L_0x0070:
            java.lang.String r0 = "yeelink.light.ct2"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x04e4
            r1 = 64
            goto L_0x04e5
        L_0x007c:
            java.lang.String r0 = "yeelink.light.ceiling9"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x04e4
            r1 = 31
            goto L_0x04e5
        L_0x0088:
            java.lang.String r0 = "yeelink.light.ceiling8"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x04e4
            r1 = 30
            goto L_0x04e5
        L_0x0094:
            java.lang.String r0 = "yeelink.light.ceiling7"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x04e4
            r1 = 29
            goto L_0x04e5
        L_0x00a0:
            java.lang.String r0 = "yeelink.light.ceiling6"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x04e4
            r1 = 28
            goto L_0x04e5
        L_0x00ac:
            java.lang.String r0 = "yeelink.light.ceiling5"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x04e4
            r1 = 27
            goto L_0x04e5
        L_0x00b8:
            java.lang.String r0 = "yeelink.light.ceiling4"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x04e4
            r1 = 53
            goto L_0x04e5
        L_0x00c4:
            java.lang.String r0 = "yeelink.light.ceiling3"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x04e4
            r1 = 15
            goto L_0x04e5
        L_0x00d0:
            java.lang.String r0 = "yeelink.light.ceiling2"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x04e4
            r1 = 14
            goto L_0x04e5
        L_0x00dc:
            java.lang.String r0 = "yeelink.light.ceiling1"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x04e4
            r1 = 13
            goto L_0x04e5
        L_0x00e8:
            java.lang.String r0 = "yeelink.curtain.ctmt1"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x04e4
            r1 = 98
            goto L_0x04e5
        L_0x00f4:
            java.lang.String r0 = "yeelink.light.gingko.group"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x04e4
            r1 = 94
            goto L_0x04e5
        L_0x0100:
            java.lang.String r0 = "yeelink.gateway.va"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x04e4
            r1 = 97
            goto L_0x04e5
        L_0x010c:
            java.lang.String r0 = "yeelink.gateway.v1"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x04e4
            r1 = 96
            goto L_0x04e5
        L_0x0118:
            java.lang.String r0 = "yeelink.light.spot1"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x04e4
            r1 = 4
            goto L_0x04e5
        L_0x0123:
            java.lang.String r0 = "yeelink.light.monob"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x04e4
            r1 = 51
            goto L_0x04e5
        L_0x012f:
            java.lang.String r0 = "yeelink.light.monoa"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x04e4
            r1 = 50
            goto L_0x04e5
        L_0x013b:
            java.lang.String r0 = "yeelink.light.mono5"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x04e4
            r1 = 24
            goto L_0x04e5
        L_0x0147:
            java.lang.String r0 = "yeelink.light.mono4"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x04e4
            r1 = 23
            goto L_0x04e5
        L_0x0153:
            java.lang.String r0 = "yeelink.light.mono2"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x04e4
            r1 = 12
            goto L_0x04e5
        L_0x015f:
            java.lang.String r0 = "yeelink.light.mono1"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x04e4
            r1 = 11
            goto L_0x04e5
        L_0x016b:
            java.lang.String r0 = "yeelink.light.lamp9"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x04e4
            r1 = 79
            goto L_0x04e5
        L_0x0177:
            java.lang.String r0 = "yeelink.light.lamp8"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x04e4
            r1 = 82
            goto L_0x04e5
        L_0x0183:
            java.lang.String r0 = "yeelink.light.lamp7"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x04e4
            r1 = 81
            goto L_0x04e5
        L_0x018f:
            java.lang.String r0 = "yeelink.light.lamp5"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x04e4
            r1 = 84
            goto L_0x04e5
        L_0x019b:
            java.lang.String r0 = "yeelink.light.lamp4"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x04e4
            r1 = 78
            goto L_0x04e5
        L_0x01a7:
            java.lang.String r0 = "yeelink.light.lamp3"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x04e4
            r1 = 83
            goto L_0x04e5
        L_0x01b3:
            java.lang.String r0 = "yeelink.light.lamp2"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x04e4
            r1 = 80
            goto L_0x04e5
        L_0x01bf:
            java.lang.String r0 = "yeelink.light.lamp1"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x04e4
            r1 = 77
            goto L_0x04e5
        L_0x01cb:
            java.lang.String r0 = "yeelink.light.group"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x04e4
            r1 = 90
            goto L_0x04e5
        L_0x01d7:
            java.lang.String r0 = "yeelink.light.ceild"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x04e4
            r1 = 48
            goto L_0x04e5
        L_0x01e3:
            java.lang.String r0 = "yeelink.light.ceilc"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x04e4
            r1 = 59
            goto L_0x04e5
        L_0x01ef:
            java.lang.String r0 = "yeelink.light.ceilb"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x04e4
            r1 = 58
            goto L_0x04e5
        L_0x01fb:
            java.lang.String r0 = "yeelink.light.ceila"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x04e4
            r1 = 47
            goto L_0x04e5
        L_0x0207:
            java.lang.String r0 = "yeelink.light.stripa"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x04e4
            r1 = 89
            goto L_0x04e5
        L_0x0213:
            java.lang.String r0 = "yeelink.light.strip6"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x04e4
            r1 = 88
            goto L_0x04e5
        L_0x021f:
            java.lang.String r0 = "yeelink.light.strip4"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x04e4
            r1 = 65
            goto L_0x04e5
        L_0x022b:
            java.lang.String r0 = "yeelink.light.strip2"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x04e4
            r1 = 87
            goto L_0x04e5
        L_0x0237:
            java.lang.String r0 = "yeelink.light.strip1"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x04e4
            r1 = 86
            goto L_0x04e5
        L_0x0243:
            java.lang.String r0 = "yeelink.light.sp1grp"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x04e4
            r1 = 10
            goto L_0x04e5
        L_0x024f:
            java.lang.String r0 = "yilai.light.ceiling3"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x04e4
            r1 = 21
            goto L_0x04e5
        L_0x025b:
            java.lang.String r0 = "yilai.light.ceiling2"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x04e4
            r1 = 20
            goto L_0x04e5
        L_0x0267:
            java.lang.String r0 = "yilai.light.ceiling1"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x04e4
            r1 = 19
            goto L_0x04e5
        L_0x0273:
            java.lang.String r0 = "yeelink.light.panel3"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x04e4
            r1 = 26
            goto L_0x04e5
        L_0x027f:
            java.lang.String r0 = "yeelink.light.panel1"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x04e4
            r1 = 25
            goto L_0x04e5
        L_0x028b:
            java.lang.String r0 = "yeelink.light.mb2grp"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x04e4
            r1 = 9
            goto L_0x04e5
        L_0x0297:
            java.lang.String r0 = "yeelink.light.mb1grp"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x04e4
            r1 = 8
            goto L_0x04e5
        L_0x02a3:
            java.lang.String r0 = "yeelink.light.lamp19"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x04e4
            r1 = 63
            goto L_0x04e5
        L_0x02af:
            java.lang.String r0 = "yeelink.light.lamp17"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x04e4
            r1 = 85
            goto L_0x04e5
        L_0x02bb:
            java.lang.String r0 = "yeelink.light.lamp15"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x04e4
            r1 = 54
            goto L_0x04e5
        L_0x02c7:
            java.lang.String r0 = "yeelink.light.lamp10"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x04e4
            r1 = 74
            goto L_0x04e5
        L_0x02d3:
            java.lang.String r0 = "yeelink.wifispeaker.v1"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x04e4
            r1 = 95
            goto L_0x04e5
        L_0x02df:
            java.lang.String r0 = "yeelink.light.gingko"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x04e4
            r1 = 93
            goto L_0x04e5
        L_0x02eb:
            java.lang.String r0 = "yeelink.light.fancl6"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x04e4
            r1 = 104(0x68, float:1.46E-43)
            goto L_0x04e5
        L_0x02f7:
            java.lang.String r0 = "yeelink.light.fancl5"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x04e4
            r1 = 103(0x67, float:1.44E-43)
            goto L_0x04e5
        L_0x0303:
            java.lang.String r0 = "yeelink.light.fancl2"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x04e4
            r1 = 102(0x66, float:1.43E-43)
            goto L_0x04e5
        L_0x030f:
            java.lang.String r0 = "yeelink.light.fancl1"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x04e4
            r1 = 101(0x65, float:1.42E-43)
            goto L_0x04e5
        L_0x031b:
            java.lang.String r0 = "yeelink.light.dn2grp"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x04e4
            r1 = 7
            goto L_0x04e5
        L_0x0326:
            java.lang.String r0 = "yeelink.light.colorc"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x04e4
            r1 = 72
            goto L_0x04e5
        L_0x0332:
            java.lang.String r0 = "yeelink.light.colorb"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x04e4
            r1 = 71
            goto L_0x04e5
        L_0x033e:
            java.lang.String r0 = "yeelink.light.colora"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x04e4
            r1 = 70
            goto L_0x04e5
        L_0x034a:
            java.lang.String r0 = "yeelink.light.color8"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x04e4
            r1 = 76
            goto L_0x04e5
        L_0x0356:
            java.lang.String r0 = "yeelink.light.color6"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x04e4
            r1 = 73
            goto L_0x04e5
        L_0x0362:
            java.lang.String r0 = "yeelink.light.color5"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x04e4
            r1 = 69
            goto L_0x04e5
        L_0x036e:
            java.lang.String r0 = "yeelink.light.color4"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x04e4
            r1 = 75
            goto L_0x04e5
        L_0x037a:
            java.lang.String r0 = "yeelink.light.color3"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x04e4
            r1 = 68
            goto L_0x04e5
        L_0x0386:
            java.lang.String r0 = "yeelink.light.color2"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x04e4
            r1 = 67
            goto L_0x04e5
        L_0x0392:
            java.lang.String r0 = "yeelink.light.color1"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x04e4
            r1 = 66
            goto L_0x04e5
        L_0x039e:
            java.lang.String r0 = "yeelink.light.ceil33"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x04e4
            r1 = 46
            goto L_0x04e5
        L_0x03aa:
            java.lang.String r0 = "yeelink.light.ceil32"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x04e4
            r1 = 45
            goto L_0x04e5
        L_0x03b6:
            java.lang.String r0 = "yeelink.light.ceil31"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x04e4
            r1 = 18
            goto L_0x04e5
        L_0x03c2:
            java.lang.String r0 = "yeelink.light.ceil30"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x04e4
            r1 = 44
            goto L_0x04e5
        L_0x03ce:
            java.lang.String r0 = "yeelink.light.ceil29"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x04e4
            r1 = 49
            goto L_0x04e5
        L_0x03da:
            java.lang.String r0 = "yeelink.light.ceil27"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x04e4
            r1 = 43
            goto L_0x04e5
        L_0x03e6:
            java.lang.String r0 = "yeelink.light.ceil26"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x04e4
            r1 = 42
            goto L_0x04e5
        L_0x03f2:
            java.lang.String r0 = "yeelink.plug.plug"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x04e4
            r1 = 100
            goto L_0x04e5
        L_0x03fe:
            java.lang.String r0 = "yeelink.light.room"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x04e4
            r1 = 91
            goto L_0x04e5
        L_0x040a:
            java.lang.String r0 = "yeelink.light.mesh"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x04e4
            r1 = 92
            goto L_0x04e5
        L_0x0416:
            java.lang.String r0 = "yeelink.light.ble1"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x04e4
            r1 = 0
            goto L_0x04e5
        L_0x0421:
            java.lang.String r0 = "yeelink.light.ceiling24"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x04e4
            r1 = 41
            goto L_0x04e5
        L_0x042d:
            java.lang.String r0 = "yeelink.light.ceiling23"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x04e4
            r1 = 40
            goto L_0x04e5
        L_0x0439:
            java.lang.String r0 = "yeelink.light.ceiling22"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x04e4
            r1 = 39
            goto L_0x04e5
        L_0x0445:
            java.lang.String r0 = "yeelink.light.ceiling21"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x04e4
            r1 = 38
            goto L_0x04e5
        L_0x0451:
            java.lang.String r0 = "yeelink.light.ceiling20"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x04e4
            r1 = 57
            goto L_0x04e5
        L_0x045d:
            java.lang.String r0 = "yeelink.light.ceiling19"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x04e4
            r1 = 56
            goto L_0x04e5
        L_0x0469:
            java.lang.String r0 = "yeelink.light.ceiling18"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x04e4
            r1 = 37
            goto L_0x04e5
        L_0x0475:
            java.lang.String r0 = "yeelink.light.ceiling17"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x04e4
            r1 = 17
            goto L_0x04e5
        L_0x0481:
            java.lang.String r0 = "yeelink.light.ceiling16"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x04e4
            r1 = 16
            goto L_0x04e5
        L_0x048c:
            java.lang.String r0 = "yeelink.light.ceiling15"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x04e4
            r1 = 36
            goto L_0x04e5
        L_0x0497:
            java.lang.String r0 = "yeelink.light.ceiling14"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x04e4
            r1 = 35
            goto L_0x04e5
        L_0x04a2:
            java.lang.String r0 = "yeelink.light.ceiling13"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x04e4
            r1 = 34
            goto L_0x04e5
        L_0x04ad:
            java.lang.String r0 = "yeelink.light.ceiling12"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x04e4
            r1 = 33
            goto L_0x04e5
        L_0x04b8:
            java.lang.String r0 = "yeelink.light.ceiling11"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x04e4
            r1 = 32
            goto L_0x04e5
        L_0x04c3:
            java.lang.String r0 = "yeelink.light.ceiling10"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x04e4
            r1 = 55
            goto L_0x04e5
        L_0x04ce:
            java.lang.String r0 = "yeelink.switch.sw1"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x04e4
            r1 = 99
            goto L_0x04e5
        L_0x04d9:
            java.lang.String r0 = "yeelink.bhf_light.v1"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x04e4
            r1 = 22
            goto L_0x04e5
        L_0x04e4:
            r1 = -1
        L_0x04e5:
            switch(r1) {
                case 0: goto L_0x05a7;
                case 1: goto L_0x05a2;
                case 2: goto L_0x05a2;
                case 3: goto L_0x05a2;
                case 4: goto L_0x05a2;
                case 5: goto L_0x05a2;
                case 6: goto L_0x05a2;
                case 7: goto L_0x059d;
                case 8: goto L_0x059d;
                case 9: goto L_0x059d;
                case 10: goto L_0x059d;
                case 11: goto L_0x0598;
                case 12: goto L_0x0598;
                case 13: goto L_0x0598;
                case 14: goto L_0x0598;
                case 15: goto L_0x0598;
                case 16: goto L_0x0598;
                case 17: goto L_0x0598;
                case 18: goto L_0x0598;
                case 19: goto L_0x0598;
                case 20: goto L_0x0598;
                case 21: goto L_0x0598;
                case 22: goto L_0x0598;
                case 23: goto L_0x0593;
                case 24: goto L_0x0593;
                case 25: goto L_0x0593;
                case 26: goto L_0x0593;
                case 27: goto L_0x0593;
                case 28: goto L_0x0593;
                case 29: goto L_0x0593;
                case 30: goto L_0x0593;
                case 31: goto L_0x0593;
                case 32: goto L_0x0593;
                case 33: goto L_0x0593;
                case 34: goto L_0x0593;
                case 35: goto L_0x0593;
                case 36: goto L_0x0593;
                case 37: goto L_0x0593;
                case 38: goto L_0x0593;
                case 39: goto L_0x0593;
                case 40: goto L_0x0593;
                case 41: goto L_0x0593;
                case 42: goto L_0x0593;
                case 43: goto L_0x0593;
                case 44: goto L_0x0593;
                case 45: goto L_0x0593;
                case 46: goto L_0x0593;
                case 47: goto L_0x0593;
                case 48: goto L_0x058e;
                case 49: goto L_0x0589;
                case 50: goto L_0x0584;
                case 51: goto L_0x0584;
                case 52: goto L_0x0584;
                case 53: goto L_0x057f;
                case 54: goto L_0x057f;
                case 55: goto L_0x057a;
                case 56: goto L_0x057a;
                case 57: goto L_0x057a;
                case 58: goto L_0x0575;
                case 59: goto L_0x0575;
                case 60: goto L_0x0570;
                case 61: goto L_0x056b;
                case 62: goto L_0x0566;
                case 63: goto L_0x0566;
                case 64: goto L_0x0561;
                case 65: goto L_0x055c;
                case 66: goto L_0x0557;
                case 67: goto L_0x0557;
                case 68: goto L_0x0557;
                case 69: goto L_0x0557;
                case 70: goto L_0x0557;
                case 71: goto L_0x0552;
                case 72: goto L_0x0552;
                case 73: goto L_0x054d;
                case 74: goto L_0x0548;
                case 75: goto L_0x0543;
                case 76: goto L_0x0543;
                case 77: goto L_0x053e;
                case 78: goto L_0x053e;
                case 79: goto L_0x053e;
                case 80: goto L_0x053e;
                case 81: goto L_0x0539;
                case 82: goto L_0x0539;
                case 83: goto L_0x0534;
                case 84: goto L_0x0534;
                case 85: goto L_0x0534;
                case 86: goto L_0x052f;
                case 87: goto L_0x052f;
                case 88: goto L_0x052a;
                case 89: goto L_0x052a;
                case 90: goto L_0x0525;
                case 91: goto L_0x0525;
                case 92: goto L_0x0520;
                case 93: goto L_0x051b;
                case 94: goto L_0x0516;
                case 95: goto L_0x0511;
                case 96: goto L_0x050c;
                case 97: goto L_0x050c;
                case 98: goto L_0x0507;
                case 99: goto L_0x0502;
                case 100: goto L_0x04fd;
                case 101: goto L_0x04f8;
                case 102: goto L_0x04f3;
                case 103: goto L_0x04ee;
                case 104: goto L_0x04ee;
                default: goto L_0x04e8;
            }
        L_0x04e8:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            return r1
        L_0x04ee:
            java.util.List r1 = m18478p0(r2)
            return r1
        L_0x04f3:
            java.util.List r1 = m18472n0(r2)
            return r1
        L_0x04f8:
            java.util.List r1 = m18466l0(r2)
            return r1
        L_0x04fd:
            java.util.List r1 = m18476o1(r2)
            return r1
        L_0x0502:
            java.util.List r1 = m18387F1(r2)
            return r1
        L_0x0507:
            java.util.List r1 = m18422V(r2)
            return r1
        L_0x050c:
            java.util.List r1 = m18425W0(r2)
            return r1
        L_0x0511:
            java.util.List r1 = m18491t1(r2)
            return r1
        L_0x0516:
            java.util.List r1 = m18490t0(r2)
            return r1
        L_0x051b:
            java.util.List r1 = m18493u0(r2)
            return r1
        L_0x0520:
            java.util.List r1 = m18427X0(r2)
            return r1
        L_0x0525:
            java.util.List r1 = m18502x0(r2)
            return r1
        L_0x052a:
            java.util.List r1 = m18509z1(r2)
            return r1
        L_0x052f:
            java.util.List r1 = m18378C1(r2)
            return r1
        L_0x0534:
            java.util.List r1 = m18455h1(r2)
            return r1
        L_0x0539:
            java.util.List r1 = m18395I0(r2)
            return r1
        L_0x053e:
            java.util.List r1 = m18415R0(r2)
            return r1
        L_0x0543:
            java.util.List r1 = m18397J(r2)
            return r1
        L_0x0548:
            java.util.List r1 = m18371A0(r2)
            return r1
        L_0x054d:
            java.util.List r1 = m18406N(r2)
            return r1
        L_0x0552:
            java.util.List r1 = m18410P(r2)
            return r1
        L_0x0557:
            java.util.List r1 = m18408O(r2)
            return r1
        L_0x055c:
            java.util.List r1 = m18503x1(r2)
            return r1
        L_0x0561:
            java.util.List r1 = m18414R(r2)
            return r1
        L_0x0566:
            java.util.List r1 = m18468m(r2)
            return r1
        L_0x056b:
            java.util.List r1 = m18465l(r2)
            return r1
        L_0x0570:
            java.util.List r1 = m18471n(r2)
            return r1
        L_0x0575:
            java.util.List r1 = m18376C(r2)
            return r1
        L_0x057a:
            java.util.List r1 = m18480q(r2)
            return r1
        L_0x057f:
            java.util.List r1 = m18451g0(r2)
            return r1
        L_0x0584:
            java.util.List r1 = m18446e1(r2)
            return r1
        L_0x0589:
            java.util.List r1 = m18492u(r2)
            return r1
        L_0x058e:
            java.util.List r1 = m18370A(r2)
            return r1
        L_0x0593:
            java.util.List r1 = m18501x(r2)
            return r1
        L_0x0598:
            java.util.List r1 = m18433a0(r2)
            return r1
        L_0x059d:
            java.util.List r1 = m18434a1(r2)
            return r1
        L_0x05a2:
            java.util.List r1 = m18419T0(r2)
            return r1
        L_0x05a7:
            java.util.List r1 = m18385F(r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.p150c.p181l.C6126d0.m18482q1(java.lang.String, com.yeelight.yeelib.c.i.d):java.util.List");
    }

    /* renamed from: r */
    private static Map<Integer, String> m18483r() {
        HashMap hashMap = new HashMap();
        hashMap.put(29, TimerCodec.DISENABLE);
        hashMap.put(0, TimerCodec.DISENABLE);
        hashMap.put(1, TimerCodec.DISENABLE);
        hashMap.put(2, TimerCodec.DISENABLE);
        hashMap.put(5, TimerCodec.DISENABLE);
        hashMap.put(9, TimerCodec.DISENABLE);
        hashMap.put(15, TimerCodec.DISENABLE);
        hashMap.put(18, TimerCodec.DISENABLE);
        hashMap.put(20, TimerCodec.DISENABLE);
        hashMap.put(23, TimerCodec.DISENABLE);
        hashMap.put(25, TimerCodec.DISENABLE);
        hashMap.put(3, TimerCodec.DISENABLE);
        hashMap.put(30, TimerCodec.DISENABLE);
        hashMap.put(31, TimerCodec.DISENABLE);
        hashMap.put(32, TimerCodec.DISENABLE);
        hashMap.put(34, TimerCodec.DISENABLE);
        hashMap.put(36, TimerCodec.DISENABLE);
        hashMap.put(38, TimerCodec.DISENABLE);
        hashMap.put(16, TimerCodec.DISENABLE);
        return hashMap;
    }

    /* renamed from: r0 */
    private static Map<Integer, String> m18484r0() {
        HashMap hashMap = new HashMap();
        hashMap.put(29, TimerCodec.DISENABLE);
        hashMap.put(0, TimerCodec.DISENABLE);
        hashMap.put(2, TimerCodec.DISENABLE);
        hashMap.put(28, TimerCodec.DISENABLE);
        hashMap.put(5, TimerCodec.DISENABLE);
        hashMap.put(6, TimerCodec.DISENABLE);
        hashMap.put(9, TimerCodec.DISENABLE);
        hashMap.put(10, "210");
        hashMap.put(16, TimerCodec.DISENABLE);
        return hashMap;
    }

    /* renamed from: r1 */
    private static List<C6038h> m18485r1(C4198d dVar) {
        int[] iArr = {5};
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 1; i++) {
            C6038h c = m18438c(iArr[i], dVar);
            if (c != null) {
                arrayList.add(c);
                dVar.mo23365B0(c);
            }
        }
        return arrayList;
    }

    /* renamed from: s */
    private static Map<Integer, String> m18486s() {
        HashMap hashMap = new HashMap();
        hashMap.put(29, TimerCodec.DISENABLE);
        hashMap.put(0, TimerCodec.DISENABLE);
        hashMap.put(1, TimerCodec.DISENABLE);
        hashMap.put(2, TimerCodec.DISENABLE);
        hashMap.put(5, TimerCodec.DISENABLE);
        hashMap.put(9, TimerCodec.DISENABLE);
        hashMap.put(15, TimerCodec.DISENABLE);
        hashMap.put(18, TimerCodec.DISENABLE);
        hashMap.put(20, TimerCodec.DISENABLE);
        if (Build.VERSION.SDK_INT < 26 || ShortcutUtils.isShortcutSupported()) {
            hashMap.put(23, TimerCodec.DISENABLE);
        } else {
            hashMap.put(23, "-1");
        }
        hashMap.put(25, TimerCodec.DISENABLE);
        hashMap.put(3, TimerCodec.DISENABLE);
        hashMap.put(30, TimerCodec.DISENABLE);
        hashMap.put(31, TimerCodec.DISENABLE);
        hashMap.put(34, TimerCodec.DISENABLE);
        hashMap.put(16, TimerCodec.DISENABLE);
        hashMap.put(38, TimerCodec.DISENABLE);
        return hashMap;
    }

    /* renamed from: s0 */
    private static Map<Integer, String> m18487s0() {
        HashMap hashMap = new HashMap();
        hashMap.put(9, TimerCodec.DISENABLE);
        hashMap.put(16, TimerCodec.DISENABLE);
        return hashMap;
    }

    /* renamed from: s1 */
    private static Map<Integer, String> m18488s1() {
        HashMap hashMap = new HashMap();
        hashMap.put(0, TimerCodec.DISENABLE);
        hashMap.put(37, TimerCodec.DISENABLE);
        hashMap.put(9, TimerCodec.DISENABLE);
        hashMap.put(34, TimerCodec.DISENABLE);
        hashMap.put(16, TimerCodec.DISENABLE);
        hashMap.put(5, TimerCodec.DISENABLE);
        return hashMap;
    }

    /* renamed from: t */
    private static Map<Integer, String> m18489t() {
        HashMap hashMap = new HashMap();
        hashMap.put(29, TimerCodec.DISENABLE);
        hashMap.put(0, TimerCodec.DISENABLE);
        hashMap.put(1, TimerCodec.DISENABLE);
        hashMap.put(2, TimerCodec.DISENABLE);
        hashMap.put(5, TimerCodec.DISENABLE);
        hashMap.put(9, TimerCodec.DISENABLE);
        hashMap.put(15, TimerCodec.DISENABLE);
        hashMap.put(18, TimerCodec.DISENABLE);
        hashMap.put(20, TimerCodec.DISENABLE);
        if (Build.VERSION.SDK_INT < 26 || ShortcutUtils.isShortcutSupported()) {
            hashMap.put(23, TimerCodec.DISENABLE);
        } else {
            hashMap.put(23, "-1");
        }
        hashMap.put(25, TimerCodec.DISENABLE);
        hashMap.put(3, TimerCodec.DISENABLE);
        hashMap.put(30, TimerCodec.DISENABLE);
        hashMap.put(31, TimerCodec.DISENABLE);
        hashMap.put(34, TimerCodec.DISENABLE);
        hashMap.put(16, TimerCodec.DISENABLE);
        hashMap.put(38, TimerCodec.DISENABLE);
        hashMap.put(50, TimerCodec.DISENABLE);
        return hashMap;
    }

    /* renamed from: t0 */
    private static List<C6122c0> m18490t0(C4198d dVar) {
        Resources resources = C4297y.f7456e.getResources();
        ArrayList arrayList = new ArrayList();
        int[] iArr = {9, 16};
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < 2; i++) {
            C6038h b = m18435b(iArr[i], dVar);
            if (b != null) {
                arrayList2.add(b);
                dVar.mo23365B0(b);
            }
        }
        arrayList.add(new C6122c0(resources.getString(R$string.feature_group_device), arrayList2));
        return arrayList;
    }

    /* renamed from: t1 */
    private static List<C6122c0> m18491t1(C4198d dVar) {
        Resources resources = C4297y.f7456e.getResources();
        ArrayList arrayList = new ArrayList();
        int[] iArr = {0, 37, 5, 9, 34, 16};
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < 6; i++) {
            C6038h b = m18435b(iArr[i], dVar);
            if (b != null) {
                arrayList2.add(b);
                dVar.mo23365B0(b);
            }
        }
        arrayList.add(new C6122c0(resources.getString(R$string.feature_group_device), arrayList2));
        return arrayList;
    }

    /* renamed from: u */
    private static List<C6122c0> m18492u(C4198d dVar) {
        Resources resources = C4297y.f7456e.getResources();
        ArrayList arrayList = new ArrayList();
        int[] iArr = {0, 38, 23, 9, 34, 16};
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < 6; i++) {
            C6038h b = m18435b(iArr[i], dVar);
            if (b != null) {
                arrayList2.add(b);
                dVar.mo23365B0(b);
            }
        }
        if (arrayList2.size() > 0) {
            arrayList.add(new C6122c0(resources.getString(R$string.feature_group_device), arrayList2));
        }
        return arrayList;
    }

    /* renamed from: u0 */
    private static List<C6122c0> m18493u0(C4198d dVar) {
        Resources resources = C4297y.f7456e.getResources();
        ArrayList arrayList = new ArrayList();
        int[] iArr = {0, 28, 6, 9, 10, 16};
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < 6; i++) {
            C6038h b = m18435b(iArr[i], dVar);
            if (b != null) {
                arrayList2.add(b);
                dVar.mo23365B0(b);
            }
        }
        arrayList.add(new C6122c0(resources.getString(R$string.feature_group_device), arrayList2));
        return arrayList;
    }

    /* renamed from: u1 */
    private static Map<Integer, String> m18494u1() {
        HashMap hashMap = new HashMap();
        hashMap.put(29, TimerCodec.DISENABLE);
        hashMap.put(0, TimerCodec.DISENABLE);
        hashMap.put(1, TimerCodec.DISENABLE);
        hashMap.put(2, TimerCodec.DISENABLE);
        hashMap.put(5, TimerCodec.DISENABLE);
        hashMap.put(9, TimerCodec.DISENABLE);
        hashMap.put(15, TimerCodec.DISENABLE);
        hashMap.put(18, TimerCodec.DISENABLE);
        hashMap.put(21, TimerCodec.DISENABLE);
        hashMap.put(22, TimerCodec.DISENABLE);
        if (Build.VERSION.SDK_INT < 26 || ShortcutUtils.isShortcutSupported()) {
            hashMap.put(23, TimerCodec.DISENABLE);
        } else {
            hashMap.put(23, "-1");
        }
        hashMap.put(27, TimerCodec.DISENABLE);
        hashMap.put(30, TimerCodec.DISENABLE);
        hashMap.put(31, TimerCodec.DISENABLE);
        hashMap.put(34, TimerCodec.DISENABLE);
        hashMap.put(16, TimerCodec.DISENABLE);
        return hashMap;
    }

    /* renamed from: v */
    private static List<C6038h> m18495v(C4198d dVar) {
        int[] iArr = {29, 1, 2, 3, 25, 20, 15, 5};
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 8; i++) {
            C6038h c = m18438c(iArr[i], dVar);
            if (c != null) {
                arrayList.add(c);
                dVar.mo23365B0(c);
            }
        }
        return arrayList;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0056  */
    /* renamed from: v0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.util.List<com.yeelight.yeelib.p150c.p151i.C6038h> m18496v0(com.yeelight.yeelib.p150c.p151i.C4198d r4) {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 2
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.add(r1)
            r1 = r4
            com.yeelight.yeelib.c.c r1 = (com.yeelight.yeelib.p150c.C5980c) r1
            java.util.List r1 = r1.mo27498K1()
            r2 = 21
            if (r1 == 0) goto L_0x0030
            java.util.Iterator r1 = r1.iterator()
        L_0x001c:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x0030
            java.lang.Object r3 = r1.next()
            com.yeelight.yeelib.c.i.i r3 = (com.yeelight.yeelib.p150c.p151i.C4200i) r3
            boolean r3 = r3.mo23415n0(r2)
            if (r3 == 0) goto L_0x001c
            r1 = 1
            goto L_0x0031
        L_0x0030:
            r1 = 0
        L_0x0031:
            if (r1 == 0) goto L_0x003a
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            r0.add(r1)
        L_0x003a:
            boolean r1 = com.yeelight.yeelib.utils.C4308b.f7482a
            if (r1 == 0) goto L_0x0047
            r1 = 33
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.add(r1)
        L_0x0047:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L_0x0050:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x006d
            java.lang.Object r2 = r0.next()
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            com.yeelight.yeelib.c.i.h r2 = m18438c(r2, r4)
            if (r2 == 0) goto L_0x0050
            r1.add(r2)
            r4.mo23365B0(r2)
            goto L_0x0050
        L_0x006d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yeelight.yeelib.p150c.p181l.C6126d0.m18496v0(com.yeelight.yeelib.c.i.d):java.util.List");
    }

    /* renamed from: v1 */
    private static List<C6038h> m18497v1(C4198d dVar) {
        int[] iArr = {29, 2, 1, 25, 15, 5, 18};
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 7; i++) {
            C6038h c = m18438c(iArr[i], dVar);
            if (c != null) {
                arrayList.add(c);
                dVar.mo23365B0(c);
            }
        }
        return arrayList;
    }

    /* renamed from: w */
    private static Map<Integer, String> m18498w() {
        HashMap hashMap = new HashMap();
        hashMap.put(29, TimerCodec.DISENABLE);
        hashMap.put(0, TimerCodec.DISENABLE);
        hashMap.put(1, TimerCodec.DISENABLE);
        hashMap.put(2, TimerCodec.DISENABLE);
        hashMap.put(5, TimerCodec.DISENABLE);
        hashMap.put(9, TimerCodec.DISENABLE);
        hashMap.put(15, TimerCodec.DISENABLE);
        hashMap.put(20, TimerCodec.DISENABLE);
        if (Build.VERSION.SDK_INT < 26 || ShortcutUtils.isShortcutSupported()) {
            hashMap.put(23, TimerCodec.DISENABLE);
        } else {
            hashMap.put(23, "-1");
        }
        hashMap.put(25, TimerCodec.DISENABLE);
        hashMap.put(3, TimerCodec.DISENABLE);
        hashMap.put(30, TimerCodec.DISENABLE);
        hashMap.put(31, TimerCodec.DISENABLE);
        hashMap.put(34, TimerCodec.DISENABLE);
        hashMap.put(38, TimerCodec.DISENABLE);
        hashMap.put(16, TimerCodec.DISENABLE);
        return hashMap;
    }

    /* renamed from: w0 */
    private static Map<Integer, String> m18499w0() {
        HashMap hashMap = new HashMap();
        hashMap.put(29, TimerCodec.DISENABLE);
        hashMap.put(0, TimerCodec.DISENABLE);
        hashMap.put(12, TimerCodec.DISENABLE);
        hashMap.put(9, TimerCodec.DISENABLE);
        if (Build.VERSION.SDK_INT < 26 || ShortcutUtils.isShortcutSupported()) {
            hashMap.put(23, TimerCodec.DISENABLE);
        } else {
            hashMap.put(23, "-1");
        }
        hashMap.put(21, TimerCodec.DISENABLE);
        hashMap.put(2, TimerCodec.DISENABLE);
        hashMap.put(5, TimerCodec.DISENABLE);
        hashMap.put(33, TimerCodec.DISENABLE);
        return hashMap;
    }

    /* renamed from: w1 */
    private static Map<Integer, String> m18500w1() {
        HashMap hashMap = new HashMap();
        hashMap.put(29, TimerCodec.DISENABLE);
        hashMap.put(0, TimerCodec.DISENABLE);
        hashMap.put(1, TimerCodec.DISENABLE);
        hashMap.put(2, TimerCodec.DISENABLE);
        hashMap.put(5, TimerCodec.DISENABLE);
        hashMap.put(9, TimerCodec.DISENABLE);
        hashMap.put(15, TimerCodec.DISENABLE);
        hashMap.put(18, TimerCodec.DISENABLE);
        if (Build.VERSION.SDK_INT < 26 || ShortcutUtils.isShortcutSupported()) {
            hashMap.put(23, TimerCodec.DISENABLE);
        } else {
            hashMap.put(23, "-1");
        }
        hashMap.put(30, TimerCodec.DISENABLE);
        hashMap.put(31, TimerCodec.DISENABLE);
        hashMap.put(34, TimerCodec.DISENABLE);
        hashMap.put(38, TimerCodec.DISENABLE);
        hashMap.put(16, TimerCodec.DISENABLE);
        hashMap.put(25, TimerCodec.DISENABLE);
        return hashMap;
    }

    /* renamed from: x */
    private static List<C6122c0> m18501x(C4198d dVar) {
        Resources resources = C4297y.f7456e.getResources();
        ArrayList arrayList = new ArrayList();
        int[] iArr = {0, 38, 23, 9, 34, 16};
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < 6; i++) {
            C6038h b = m18435b(iArr[i], dVar);
            if (b != null) {
                arrayList2.add(b);
                dVar.mo23365B0(b);
            }
        }
        if (arrayList2.size() > 0) {
            arrayList.add(new C6122c0(resources.getString(R$string.feature_group_device), arrayList2));
        }
        return arrayList;
    }

    /* renamed from: x0 */
    private static List<C6122c0> m18502x0(C4198d dVar) {
        Resources resources = C4297y.f7456e.getResources();
        ArrayList arrayList = new ArrayList();
        int[] iArr = {0, 12, 23, 9, 16};
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < 5; i++) {
            C6038h b = m18435b(iArr[i], dVar);
            if (b != null) {
                arrayList2.add(b);
                dVar.mo23365B0(b);
            }
        }
        arrayList.add(new C6122c0(resources.getString(R$string.feature_group_group), arrayList2));
        return arrayList;
    }

    /* renamed from: x1 */
    private static List<C6122c0> m18503x1(C4198d dVar) {
        return m18501x(dVar);
    }

    /* renamed from: y */
    private static Map<Integer, String> m18504y() {
        HashMap hashMap = new HashMap();
        hashMap.put(29, TimerCodec.DISENABLE);
        hashMap.put(0, TimerCodec.DISENABLE);
        hashMap.put(1, TimerCodec.DISENABLE);
        hashMap.put(2, TimerCodec.DISENABLE);
        hashMap.put(5, TimerCodec.DISENABLE);
        hashMap.put(9, TimerCodec.DISENABLE);
        hashMap.put(15, TimerCodec.DISENABLE);
        hashMap.put(18, TimerCodec.DISENABLE);
        hashMap.put(20, TimerCodec.DISENABLE);
        if (Build.VERSION.SDK_INT < 26 || ShortcutUtils.isShortcutSupported()) {
            hashMap.put(23, TimerCodec.DISENABLE);
        } else {
            hashMap.put(23, "-1");
        }
        hashMap.put(25, TimerCodec.DISENABLE);
        hashMap.put(3, TimerCodec.DISENABLE);
        hashMap.put(30, TimerCodec.DISENABLE);
        hashMap.put(31, TimerCodec.DISENABLE);
        hashMap.put(34, TimerCodec.DISENABLE);
        hashMap.put(38, TimerCodec.DISENABLE);
        hashMap.put(16, TimerCodec.DISENABLE);
        return hashMap;
    }

    /* renamed from: y0 */
    private static List<C6038h> m18505y0(C4198d dVar) {
        int[] iArr = {29, 27, 2, 1, 3, 21, 15, 5, 18};
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 9; i++) {
            C6038h c = m18438c(iArr[i], dVar);
            if (c != null) {
                arrayList.add(c);
                dVar.mo23365B0(c);
            }
        }
        return arrayList;
    }

    /* renamed from: y1 */
    private static Map<Integer, String> m18506y1() {
        HashMap hashMap = new HashMap();
        hashMap.put(29, TimerCodec.DISENABLE);
        hashMap.put(0, TimerCodec.DISENABLE);
        hashMap.put(1, TimerCodec.DISENABLE);
        hashMap.put(2, TimerCodec.DISENABLE);
        hashMap.put(5, TimerCodec.DISENABLE);
        hashMap.put(9, TimerCodec.DISENABLE);
        hashMap.put(15, TimerCodec.DISENABLE);
        hashMap.put(18, TimerCodec.DISENABLE);
        hashMap.put(21, TimerCodec.DISENABLE);
        hashMap.put(22, TimerCodec.DISENABLE);
        if (Build.VERSION.SDK_INT < 26 || ShortcutUtils.isShortcutSupported()) {
            hashMap.put(23, TimerCodec.DISENABLE);
        } else {
            hashMap.put(23, "-1");
        }
        hashMap.put(27, TimerCodec.DISENABLE);
        hashMap.put(30, TimerCodec.DISENABLE);
        hashMap.put(31, TimerCodec.DISENABLE);
        hashMap.put(34, TimerCodec.DISENABLE);
        hashMap.put(16, TimerCodec.DISENABLE);
        hashMap.put(25, TimerCodec.DISENABLE);
        return hashMap;
    }

    /* renamed from: z */
    private static Map<Integer, String> m18507z() {
        HashMap hashMap = new HashMap();
        hashMap.put(29, TimerCodec.DISENABLE);
        hashMap.put(0, TimerCodec.DISENABLE);
        hashMap.put(1, TimerCodec.DISENABLE);
        hashMap.put(2, TimerCodec.DISENABLE);
        hashMap.put(5, TimerCodec.DISENABLE);
        hashMap.put(9, TimerCodec.DISENABLE);
        hashMap.put(15, TimerCodec.DISENABLE);
        hashMap.put(18, TimerCodec.DISENABLE);
        if (Build.VERSION.SDK_INT < 26 || ShortcutUtils.isShortcutSupported()) {
            hashMap.put(23, TimerCodec.DISENABLE);
        } else {
            hashMap.put(23, "-1");
        }
        hashMap.put(25, TimerCodec.DISENABLE);
        hashMap.put(3, TimerCodec.DISENABLE);
        hashMap.put(30, TimerCodec.DISENABLE);
        hashMap.put(31, TimerCodec.DISENABLE);
        hashMap.put(34, TimerCodec.DISENABLE);
        hashMap.put(16, TimerCodec.DISENABLE);
        hashMap.put(50, TimerCodec.DISENABLE);
        return hashMap;
    }

    /* renamed from: z0 */
    private static Map<Integer, String> m18508z0() {
        HashMap hashMap = new HashMap();
        hashMap.put(29, TimerCodec.DISENABLE);
        hashMap.put(0, TimerCodec.DISENABLE);
        hashMap.put(1, TimerCodec.DISENABLE);
        hashMap.put(2, TimerCodec.DISENABLE);
        hashMap.put(5, TimerCodec.DISENABLE);
        hashMap.put(9, TimerCodec.DISENABLE);
        hashMap.put(15, TimerCodec.DISENABLE);
        hashMap.put(18, TimerCodec.DISENABLE);
        hashMap.put(21, TimerCodec.DISENABLE);
        if (Build.VERSION.SDK_INT < 26 || ShortcutUtils.isShortcutSupported()) {
            hashMap.put(23, TimerCodec.DISENABLE);
        } else {
            hashMap.put(23, "-1");
        }
        hashMap.put(27, TimerCodec.DISENABLE);
        hashMap.put(31, TimerCodec.DISENABLE);
        hashMap.put(34, TimerCodec.DISENABLE);
        hashMap.put(40, TimerCodec.DISENABLE);
        hashMap.put(3, TimerCodec.DISENABLE);
        hashMap.put(16, TimerCodec.DISENABLE);
        hashMap.put(30, TimerCodec.DISENABLE);
        return hashMap;
    }

    /* renamed from: z1 */
    private static List<C6122c0> m18509z1(C4198d dVar) {
        Resources resources = C4297y.f7456e.getResources();
        ArrayList arrayList = new ArrayList();
        int[] iArr = {0, 25, 23, 9, 34, 16};
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < 6; i++) {
            C6038h b = m18435b(iArr[i], dVar);
            if (b != null) {
                arrayList2.add(b);
                dVar.mo23365B0(b);
            }
        }
        if (arrayList2.size() > 0) {
            arrayList.add(new C6122c0(resources.getString(R$string.feature_group_device), arrayList2));
        }
        return arrayList;
    }
}
