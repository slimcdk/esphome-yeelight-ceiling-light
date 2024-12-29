package p215u3;

import android.content.res.Resources;
import android.os.Build;
import com.miot.service.manager.timer.TimerCodec;
import com.yeelight.yeelib.R$drawable;
import com.yeelight.yeelib.R$string;
import com.yeelight.yeelib.device.base.C3010c;
import com.yeelight.yeelib.device.base.C6093d;
import com.yeelight.yeelib.managers.C3108x;
import com.yeelight.yeelib.service.ShortcutUtils;
import com.yeelight.yeelib.utils.AppUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.commons.p194io.FilenameUtils;
import org.apache.commons.p194io.IOUtils;

/* renamed from: u3.v */
public class C10510v {
    /* renamed from: A */
    private static List<C10507u> m26688A(C3010c cVar) {
        Resources resources = C3108x.f4951e.getResources();
        ArrayList arrayList = new ArrayList();
        int[] iArr = {0, 50, 23, 9, 34, 16};
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < 6; i++) {
            C6093d b = m26760b(iArr[i], cVar);
            if (b != null) {
                arrayList2.add(b);
                cVar.mo23178B0(b);
            }
        }
        if (arrayList2.size() > 0) {
            arrayList.add(new C10507u(resources.getString(R$string.feature_group_device), arrayList2));
        }
        return arrayList;
    }

    /* renamed from: A0 */
    private static List<C6093d> m26689A0(C3010c cVar) {
        int[] iArr = {29, 27, 2, 1, 3, 21, 15, 5, 18};
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 9; i++) {
            C6093d c = m26763c(iArr[i], cVar);
            if (c != null) {
                arrayList.add(c);
                cVar.mo23178B0(c);
            }
        }
        return arrayList;
    }

    /* renamed from: A1 */
    private static List<C6093d> m26690A1(C3010c cVar) {
        int[] iArr = {29, 2, 1, 25, 15, 5, 18};
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 7; i++) {
            C6093d c = m26763c(iArr[i], cVar);
            if (c != null) {
                arrayList.add(c);
                cVar.mo23178B0(c);
            }
        }
        return arrayList;
    }

    /* renamed from: B */
    private static Map<Integer, String> m26691B() {
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
    private static Map<Integer, String> m26692B0() {
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

    /* renamed from: B1 */
    private static Map<Integer, String> m26693B1() {
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

    /* renamed from: C */
    private static List<C10507u> m26694C(C3010c cVar) {
        Resources resources = C3108x.f4951e.getResources();
        ArrayList arrayList = new ArrayList();
        int[] iArr = {0, 38, 50, 23, 32, 9, 34, 16};
        int[] iArr2 = {36};
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < 8; i++) {
            C6093d b = m26760b(iArr[i], cVar);
            if (b != null) {
                arrayList2.add(b);
                cVar.mo23178B0(b);
            }
        }
        if (AppUtils.f4977a) {
            for (int i2 = 0; i2 < 1; i2++) {
                C6093d c = m26763c(iArr2[i2], cVar);
                if (c != null) {
                    arrayList2.add(c);
                    cVar.mo23178B0(c);
                }
            }
        }
        if (arrayList2.size() > 0) {
            arrayList.add(new C10507u(resources.getString(R$string.feature_group_device), arrayList2));
        }
        return arrayList;
    }

    /* renamed from: C0 */
    private static List<C10507u> m26695C0(C3010c cVar) {
        Resources resources = C3108x.f4951e.getResources();
        ArrayList arrayList = new ArrayList();
        int[] iArr = {0, 40, 23, 9, 34, 16};
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < 6; i++) {
            C6093d b = m26760b(iArr[i], cVar);
            if (b != null) {
                arrayList2.add(b);
                cVar.mo23178B0(b);
            }
        }
        if (arrayList2.size() > 0) {
            arrayList.add(new C10507u(resources.getString(R$string.feature_group_device), arrayList2));
        }
        return arrayList;
    }

    /* renamed from: C1 */
    private static List<C10507u> m26696C1(C3010c cVar) {
        return m26826x(cVar);
    }

    /* renamed from: D */
    private static List<C6093d> m26697D(C3010c cVar) {
        int[] iArr = {29, 27, 2, 1, 3, 4, 8};
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 7; i++) {
            C6093d c = m26763c(iArr[i], cVar);
            if (c != null) {
                arrayList.add(c);
                cVar.mo23178B0(c);
            }
        }
        return arrayList;
    }

    /* renamed from: D0 */
    private static List<C6093d> m26698D0(C3010c cVar) {
        int[] iArr = {29, 1, 2, 15, 5, 18};
        int[] iArr2 = {36};
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 6; i++) {
            C6093d c = m26763c(iArr[i], cVar);
            if (c != null) {
                arrayList.add(c);
                cVar.mo23178B0(c);
            }
        }
        if (AppUtils.f4977a) {
            for (int i2 = 0; i2 < 1; i2++) {
                C6093d c2 = m26763c(iArr2[i2], cVar);
                if (c2 != null) {
                    arrayList.add(c2);
                    cVar.mo23178B0(c2);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: D1 */
    private static Map<Integer, String> m26699D1() {
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

    /* renamed from: E */
    private static Map<Integer, String> m26700E() {
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
    private static Map<Integer, String> m26701E0() {
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

    /* renamed from: E1 */
    private static List<C10507u> m26702E1(C3010c cVar) {
        Resources resources = C3108x.f4951e.getResources();
        ArrayList arrayList = new ArrayList();
        int[] iArr = {0, 25, 23, 9, 34, 16};
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < 6; i++) {
            C6093d b = m26760b(iArr[i], cVar);
            if (b != null) {
                arrayList2.add(b);
                cVar.mo23178B0(b);
            }
        }
        if (arrayList2.size() > 0) {
            arrayList.add(new C10507u(resources.getString(R$string.feature_group_device), arrayList2));
        }
        return arrayList;
    }

    /* renamed from: F */
    private static List<C10507u> m26703F(C3010c cVar) {
        Resources resources = C3108x.f4951e.getResources();
        ArrayList arrayList = new ArrayList();
        int[] iArr = {0, 23, 16};
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < 3; i++) {
            C6093d b = m26760b(iArr[i], cVar);
            if (b != null) {
                arrayList2.add(b);
                cVar.mo23178B0(b);
            }
        }
        arrayList.add(new C10507u(resources.getString(R$string.feature_group_device), arrayList2));
        int[] iArr2 = {13, 9, 6, 10};
        ArrayList arrayList3 = new ArrayList();
        for (int i2 = 0; i2 < 4; i2++) {
            C6093d b2 = m26760b(iArr2[i2], cVar);
            if (b2 != null) {
                arrayList3.add(b2);
                cVar.mo23178B0(b2);
            }
        }
        arrayList.add(new C10507u(resources.getString(R$string.feature_group_connect), arrayList3));
        return arrayList;
    }

    /* renamed from: F0 */
    private static List<C6093d> m26704F0(C3010c cVar) {
        int[] iArr = {29, 1, 2, 15, 5, 18};
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 6; i++) {
            C6093d c = m26763c(iArr[i], cVar);
            if (c != null) {
                arrayList.add(c);
                cVar.mo23178B0(c);
            }
        }
        return arrayList;
    }

    /* renamed from: F1 */
    private static Map<Integer, String> m26705F1() {
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

    /* renamed from: G */
    private static List<C6093d> m26706G(C3010c cVar) {
        int[] iArr = {29, 27, 2, 1, 15, 5};
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 6; i++) {
            C6093d c = m26763c(iArr[i], cVar);
            if (c != null) {
                arrayList.add(c);
                cVar.mo23178B0(c);
            }
        }
        return arrayList;
    }

    /* renamed from: G0 */
    private static Map<Integer, String> m26707G0() {
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

    /* renamed from: G1 */
    private static List<C10507u> m26708G1(C3010c cVar) {
        Resources resources = C3108x.f4951e.getResources();
        ArrayList arrayList = new ArrayList();
        int[] iArr = {0, 23, 9, 34, 16};
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < 5; i++) {
            C6093d b = m26760b(iArr[i], cVar);
            if (b != null) {
                arrayList2.add(b);
                cVar.mo23178B0(b);
            }
        }
        if (arrayList2.size() > 0) {
            arrayList.add(new C10507u(resources.getString(R$string.feature_group_device), arrayList2));
        }
        return arrayList;
    }

    /* renamed from: H */
    private static Map<Integer, String> m26709H() {
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
    private static Map<Integer, String> m26710H0() {
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

    /* renamed from: H1 */
    private static List<C6093d> m26711H1(C3010c cVar) {
        int[] iArr = {29, 27, 2, 1, 15, 21, 22, 5, 18};
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 9; i++) {
            C6093d c = m26763c(iArr[i], cVar);
            if (c != null) {
                arrayList.add(c);
                cVar.mo23178B0(c);
            }
        }
        return arrayList;
    }

    /* renamed from: I */
    private static Map<Integer, String> m26712I() {
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
    private static List<C6093d> m26713I0(C3010c cVar) {
        int[] iArr = {29, 1, 2, 15, 5, 18};
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 6; i++) {
            C6093d c = m26763c(iArr[i], cVar);
            if (c != null) {
                arrayList.add(c);
                cVar.mo23178B0(c);
            }
        }
        return arrayList;
    }

    /* renamed from: I1 */
    private static Map<Integer, String> m26714I1() {
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

    /* renamed from: J */
    private static List<C10507u> m26715J(C3010c cVar) {
        return m26826x(cVar);
    }

    /* renamed from: J0 */
    private static Map<Integer, String> m26716J0() {
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

    /* renamed from: J1 */
    private static List<C10507u> m26717J1(C3010c cVar) {
        return m26764c0(cVar);
    }

    /* renamed from: K */
    private static Map<Integer, String> m26718K() {
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
    private static List<C10507u> m26719K0(C3010c cVar) {
        Resources resources = C3108x.f4951e.getResources();
        ArrayList arrayList = new ArrayList();
        int[] iArr = {0, 42, 43, 23, 9, 34, 16};
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < 7; i++) {
            C6093d b = m26760b(iArr[i], cVar);
            if (b != null) {
                arrayList2.add(b);
                cVar.mo23178B0(b);
            }
        }
        if (arrayList2.size() > 0) {
            arrayList.add(new C10507u(resources.getString(R$string.feature_group_device), arrayList2));
        }
        return arrayList;
    }

    /* renamed from: K1 */
    private static List<C6093d> m26720K1(C3010c cVar) {
        int[] iArr = {1, 15, 5};
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 3; i++) {
            C6093d c = m26763c(iArr[i], cVar);
            if (c != null) {
                arrayList.add(c);
                cVar.mo23178B0(c);
            }
        }
        return arrayList;
    }

    /* renamed from: L */
    private static List<C6093d> m26721L(C3010c cVar) {
        int[] iArr = {29, 2, 1, 15, 21, 5, 18};
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 7; i++) {
            C6093d c = m26763c(iArr[i], cVar);
            if (c != null) {
                arrayList.add(c);
                cVar.mo23178B0(c);
            }
        }
        return arrayList;
    }

    /* renamed from: L0 */
    private static List<C6093d> m26722L0(C3010c cVar) {
        int[] iArr = {29, 2, 1, 3, 15, 5, 18};
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 7; i++) {
            C6093d c = m26763c(iArr[i], cVar);
            if (c != null) {
                arrayList.add(c);
                cVar.mo23178B0(c);
            }
        }
        return arrayList;
    }

    /* renamed from: L1 */
    private static Map<Integer, String> m26723L1() {
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

    /* renamed from: M */
    private static Map<Integer, String> m26724M() {
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
    private static Map<Integer, String> m26725M0() {
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

    /* renamed from: M1 */
    private static List<C10507u> m26726M1(C3010c cVar) {
        Resources resources = C3108x.f4951e.getResources();
        ArrayList arrayList = new ArrayList();
        int[] iArr = {0, 25, 38, 9, 34, 16};
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < 6; i++) {
            C6093d b = m26760b(iArr[i], cVar);
            if (b != null) {
                arrayList2.add(b);
                cVar.mo23178B0(b);
            }
        }
        arrayList.add(new C10507u(resources.getString(R$string.feature_group_device), arrayList2));
        return arrayList;
    }

    /* renamed from: N */
    private static List<C10507u> m26727N(C3010c cVar) {
        Resources resources = C3108x.f4951e.getResources();
        ArrayList arrayList = new ArrayList();
        int[] iArr = {0, 23, 9, 34, 16};
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < 5; i++) {
            C6093d b = m26760b(iArr[i], cVar);
            if (b != null) {
                arrayList2.add(b);
                cVar.mo23178B0(b);
            }
        }
        if (arrayList2.size() > 0) {
            arrayList.add(new C10507u(resources.getString(R$string.feature_group_device), arrayList2));
        }
        return arrayList;
    }

    /* renamed from: N0 */
    private static List<C6093d> m26728N0(C3010c cVar) {
        int[] iArr = {29, 1, 2, 3, 25, 20, 15, 5, 18};
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 9; i++) {
            C6093d c = m26763c(iArr[i], cVar);
            if (c != null) {
                arrayList.add(c);
                cVar.mo23178B0(c);
            }
        }
        return arrayList;
    }

    /* renamed from: N1 */
    private static Map<Integer, String> m26729N1() {
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

    /* renamed from: O */
    private static List<C10507u> m26730O(C3010c cVar) {
        return m26764c0(cVar);
    }

    /* renamed from: O0 */
    private static Map<Integer, String> m26731O0() {
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

    /* renamed from: O1 */
    private static List<C6093d> m26732O1(C3010c cVar) {
        int[] iArr = {29, 27, 2, 1, 15, 21, 5, 18};
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 8; i++) {
            C6093d c = m26763c(iArr[i], cVar);
            if (c != null) {
                arrayList.add(c);
                cVar.mo23178B0(c);
            }
        }
        return arrayList;
    }

    /* renamed from: P */
    private static Map<Integer, String> m26733P() {
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

    /* renamed from: P0 */
    private static List<C6093d> m26734P0(C3010c cVar) {
        int[] iArr = {29, 1, 2, 25, 20, 15, 5, 18};
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 8; i++) {
            C6093d c = m26763c(iArr[i], cVar);
            if (c != null) {
                arrayList.add(c);
                cVar.mo23178B0(c);
            }
        }
        return arrayList;
    }

    /* renamed from: P1 */
    private static Map<Integer, String> m26735P1() {
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

    /* renamed from: Q */
    private static List<C10507u> m26736Q(C3010c cVar) {
        Resources resources = C3108x.f4951e.getResources();
        ArrayList arrayList = new ArrayList();
        int[] iArr = {0, 50, 23, 9, 34, 16};
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < 6; i++) {
            C6093d b = m26760b(iArr[i], cVar);
            if (b != null) {
                arrayList2.add(b);
                cVar.mo23178B0(b);
            }
        }
        if (arrayList2.size() > 0) {
            arrayList.add(new C10507u(resources.getString(R$string.feature_group_device), arrayList2));
        }
        return arrayList;
    }

    /* renamed from: Q0 */
    private static Map<Integer, String> m26737Q0() {
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

    /* renamed from: Q1 */
    private static List<C6093d> m26738Q1(C3010c cVar) {
        int[] iArr = {29, 1, 2, 25, 20, 15, 5, 18};
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 8; i++) {
            C6093d c = m26763c(iArr[i], cVar);
            if (c != null) {
                arrayList.add(c);
                cVar.mo23178B0(c);
            }
        }
        return arrayList;
    }

    /* renamed from: R */
    private static List<C6093d> m26739R(C3010c cVar) {
        int[] iArr = {29, 2, 1, 15, 5, 18};
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 6; i++) {
            C6093d c = m26763c(iArr[i], cVar);
            if (c != null) {
                arrayList.add(c);
                cVar.mo23178B0(c);
            }
        }
        return arrayList;
    }

    /* renamed from: R0 */
    private static List<C6093d> m26740R0(C3010c cVar) {
        int[] iArr = {29, 11, 1, 2, 17, 15, 19, 5};
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 8; i++) {
            C6093d c = m26763c(iArr[i], cVar);
            if (c != null) {
                arrayList.add(c);
                cVar.mo23178B0(c);
            }
        }
        return arrayList;
    }

    /* renamed from: S */
    private static List<C10507u> m26741S(C3010c cVar) {
        return m26764c0(cVar);
    }

    /* renamed from: S0 */
    private static Map<Integer, String> m26742S0() {
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

    /* renamed from: T */
    private static Map<Integer, String> m26743T() {
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

    /* renamed from: T0 */
    private static List<C10507u> m26744T0(C3010c cVar) {
        Resources resources = C3108x.f4951e.getResources();
        ArrayList arrayList = new ArrayList();
        int[] iArr = {0, 23, 9, 34, 16};
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < 5; i++) {
            C6093d b = m26760b(iArr[i], cVar);
            if (b != null) {
                arrayList2.add(b);
                cVar.mo23178B0(b);
            }
        }
        if (arrayList2.size() > 0) {
            arrayList.add(new C10507u(resources.getString(R$string.feature_group_device), arrayList2));
        }
        return arrayList;
    }

    /* renamed from: U */
    private static Map<Integer, String> m26745U() {
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

    /* renamed from: U0 */
    private static List<C6093d> m26746U0(C3010c cVar) {
        int[] iArr = {29, 2, 1, 5};
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 4; i++) {
            C6093d c = m26763c(iArr[i], cVar);
            if (c != null) {
                arrayList.add(c);
                cVar.mo23178B0(c);
            }
        }
        return arrayList;
    }

    /* renamed from: V */
    private static Map<Integer, String> m26747V() {
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

    /* renamed from: V0 */
    private static List<C10507u> m26748V0(C3010c cVar) {
        return m26768d1(cVar);
    }

    /* renamed from: W */
    private static Map<Integer, String> m26749W() {
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

    /* renamed from: W0 */
    private static Map<Integer, String> m26750W0() {
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

    /* renamed from: X */
    private static List<C10507u> m26751X(C3010c cVar) {
        Resources resources = C3108x.f4951e.getResources();
        ArrayList arrayList = new ArrayList();
        int[] iArr = {0, 47, 1, 25, 46, 45, 9, 5, 34, 16};
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < 10; i++) {
            C6093d b = m26760b(iArr[i], cVar);
            if (b != null) {
                arrayList2.add(b);
                cVar.mo23178B0(b);
            }
        }
        arrayList.add(new C10507u(resources.getString(R$string.feature_group_device), arrayList2));
        return arrayList;
    }

    /* renamed from: X0 */
    private static Map<Integer, String> m26752X0() {
        HashMap hashMap = new HashMap();
        hashMap.put(0, TimerCodec.DISENABLE);
        hashMap.put(22, TimerCodec.DISENABLE);
        hashMap.put(9, TimerCodec.DISENABLE);
        hashMap.put(34, TimerCodec.DISENABLE);
        hashMap.put(16, TimerCodec.DISENABLE);
        hashMap.put(5, TimerCodec.DISENABLE);
        return hashMap;
    }

    /* renamed from: Y */
    private static Map<Integer, String> m26753Y() {
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

    /* renamed from: Y0 */
    private static List<C10507u> m26754Y0(C3010c cVar) {
        Resources resources = C3108x.f4951e.getResources();
        ArrayList arrayList = new ArrayList();
        int[] iArr = {0, 22, 5, 9, 34, 16};
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < 6; i++) {
            C6093d b = m26760b(iArr[i], cVar);
            if (b != null) {
                arrayList2.add(b);
                cVar.mo23178B0(b);
            }
        }
        arrayList.add(new C10507u(resources.getString(R$string.feature_group_device), arrayList2));
        return arrayList;
    }

    /* renamed from: Z */
    public static Map<Integer, String> m26755Z(String str) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1644531059:
                if (str.equals("yeelink.bhf_light.v1")) {
                    c = 0;
                    break;
                }
                break;
            case -1494338802:
                if (str.equals("yeelink.switch.sw1")) {
                    c = 1;
                    break;
                }
                break;
            case -1462015191:
                if (str.equals("yeelink.light.ceiling10")) {
                    c = 2;
                    break;
                }
                break;
            case -1462015190:
                if (str.equals("yeelink.light.ceiling11")) {
                    c = 3;
                    break;
                }
                break;
            case -1462015189:
                if (str.equals("yeelink.light.ceiling12")) {
                    c = 4;
                    break;
                }
                break;
            case -1462015188:
                if (str.equals("yeelink.light.ceiling13")) {
                    c = 5;
                    break;
                }
                break;
            case -1462015187:
                if (str.equals("yeelink.light.ceiling14")) {
                    c = 6;
                    break;
                }
                break;
            case -1462015186:
                if (str.equals("yeelink.light.ceiling15")) {
                    c = 7;
                    break;
                }
                break;
            case -1462015185:
                if (str.equals("yeelink.light.ceiling16")) {
                    c = 8;
                    break;
                }
                break;
            case -1462015184:
                if (str.equals("yeelink.light.ceiling17")) {
                    c = 9;
                    break;
                }
                break;
            case -1462015183:
                if (str.equals("yeelink.light.ceiling18")) {
                    c = 10;
                    break;
                }
                break;
            case -1462015182:
                if (str.equals("yeelink.light.ceiling19")) {
                    c = 11;
                    break;
                }
                break;
            case -1462015160:
                if (str.equals("yeelink.light.ceiling20")) {
                    c = 12;
                    break;
                }
                break;
            case -1462015159:
                if (str.equals("yeelink.light.ceiling21")) {
                    c = 13;
                    break;
                }
                break;
            case -1462015158:
                if (str.equals("yeelink.light.ceiling22")) {
                    c = 14;
                    break;
                }
                break;
            case -1462015157:
                if (str.equals("yeelink.light.ceiling23")) {
                    c = 15;
                    break;
                }
                break;
            case -1462015156:
                if (str.equals("yeelink.light.ceiling24")) {
                    c = 16;
                    break;
                }
                break;
            case -1400275319:
                if (str.equals("yeelink.light.ble1")) {
                    c = 17;
                    break;
                }
                break;
            case -1399795410:
                if (str.equals("yeelink.light.room")) {
                    c = 18;
                    break;
                }
                break;
            case -1350780909:
                if (str.equals("yeelink.plug.plug")) {
                    c = 19;
                    break;
                }
                break;
            case -1317475940:
                if (str.equals("yeelink.light.ceil26")) {
                    c = 20;
                    break;
                }
                break;
            case -1317475939:
                if (str.equals("yeelink.light.ceil27")) {
                    c = 21;
                    break;
                }
                break;
            case -1317475937:
                if (str.equals("yeelink.light.ceil29")) {
                    c = 22;
                    break;
                }
                break;
            case -1317475915:
                if (str.equals("yeelink.light.ceil30")) {
                    c = 23;
                    break;
                }
                break;
            case -1317475914:
                if (str.equals("yeelink.light.ceil31")) {
                    c = 24;
                    break;
                }
                break;
            case -1317475913:
                if (str.equals("yeelink.light.ceil32")) {
                    c = 25;
                    break;
                }
                break;
            case -1317475912:
                if (str.equals("yeelink.light.ceil33")) {
                    c = 26;
                    break;
                }
                break;
            case -1317475910:
                if (str.equals("yeelink.light.ceil35")) {
                    c = 27;
                    break;
                }
                break;
            case -1308146495:
                if (str.equals("yeelink.light.color1")) {
                    c = 28;
                    break;
                }
                break;
            case -1308146494:
                if (str.equals("yeelink.light.color2")) {
                    c = 29;
                    break;
                }
                break;
            case -1308146493:
                if (str.equals("yeelink.light.color3")) {
                    c = 30;
                    break;
                }
                break;
            case -1308146492:
                if (str.equals("yeelink.light.color4")) {
                    c = 31;
                    break;
                }
                break;
            case -1308146491:
                if (str.equals("yeelink.light.color5")) {
                    c = ' ';
                    break;
                }
                break;
            case -1308146490:
                if (str.equals("yeelink.light.color6")) {
                    c = '!';
                    break;
                }
                break;
            case -1308146488:
                if (str.equals("yeelink.light.color8")) {
                    c = '\"';
                    break;
                }
                break;
            case -1308146447:
                if (str.equals("yeelink.light.colora")) {
                    c = '#';
                    break;
                }
                break;
            case -1308146446:
                if (str.equals("yeelink.light.colorb")) {
                    c = '$';
                    break;
                }
                break;
            case -1308146445:
                if (str.equals("yeelink.light.colorc")) {
                    c = '%';
                    break;
                }
                break;
            case -1308146443:
                if (str.equals("yeelink.light.colore")) {
                    c = '&';
                    break;
                }
                break;
            case -1282176368:
                if (str.equals("yeelink.light.dn2grp")) {
                    c = '\'';
                    break;
                }
                break;
            case -1235140472:
                if (str.equals("yeelink.light.fancl1")) {
                    c = '(';
                    break;
                }
                break;
            case -1235140471:
                if (str.equals("yeelink.light.fancl2")) {
                    c = ')';
                    break;
                }
                break;
            case -1235140468:
                if (str.equals("yeelink.light.fancl5")) {
                    c = '*';
                    break;
                }
                break;
            case -1235140467:
                if (str.equals("yeelink.light.fancl6")) {
                    c = '+';
                    break;
                }
                break;
            case -1199119278:
                if (str.equals("yeelink.light.gingko")) {
                    c = ',';
                    break;
                }
                break;
            case -1119332198:
                if (str.equals("yeelink.wifispeaker.v1")) {
                    c = '-';
                    break;
                }
                break;
            case -1063384694:
                if (str.equals("yeelink.light.lamp10")) {
                    c = FilenameUtils.EXTENSION_SEPARATOR;
                    break;
                }
                break;
            case -1063384689:
                if (str.equals("yeelink.light.lamp15")) {
                    c = IOUtils.DIR_SEPARATOR_UNIX;
                    break;
                }
                break;
            case -1063384687:
                if (str.equals("yeelink.light.lamp17")) {
                    c = '0';
                    break;
                }
                break;
            case -1063384685:
                if (str.equals("yeelink.light.lamp19")) {
                    c = '1';
                    break;
                }
                break;
            case -1035626052:
                if (str.equals("yeelink.light.mb1grp")) {
                    c = '2';
                    break;
                }
                break;
            case -1035596261:
                if (str.equals("yeelink.light.mb2grp")) {
                    c = '3';
                    break;
                }
                break;
            case -948847040:
                if (str.equals("yeelink.light.panel1")) {
                    c = '4';
                    break;
                }
                break;
            case -948847038:
                if (str.equals("yeelink.light.panel3")) {
                    c = '5';
                    break;
                }
                break;
            case -939061393:
                if (str.equals("yeelink.light.plate2")) {
                    c = '6';
                    break;
                }
                break;
            case -888668266:
                if (str.equals("yilai.light.ceiling1")) {
                    c = '7';
                    break;
                }
                break;
            case -888668265:
                if (str.equals("yilai.light.ceiling2")) {
                    c = '8';
                    break;
                }
                break;
            case -888668264:
                if (str.equals("yilai.light.ceiling3")) {
                    c = '9';
                    break;
                }
                break;
            case -850921852:
                if (str.equals("yeelink.light.sp1grp")) {
                    c = ':';
                    break;
                }
                break;
            case -845289556:
                if (str.equals("yeelink.light.strip1")) {
                    c = ';';
                    break;
                }
                break;
            case -845289555:
                if (str.equals("yeelink.light.strip2")) {
                    c = '<';
                    break;
                }
                break;
            case -845289553:
                if (str.equals("yeelink.light.strip4")) {
                    c = '=';
                    break;
                }
                break;
            case -845289551:
                if (str.equals("yeelink.light.strip6")) {
                    c = '>';
                    break;
                }
                break;
            case -845289549:
                if (str.equals("yeelink.light.strip8")) {
                    c = '?';
                    break;
                }
                break;
            case -845289508:
                if (str.equals("yeelink.light.stripa")) {
                    c = '@';
                    break;
                }
                break;
            case -458141175:
                if (str.equals("yeelink.light.ceila")) {
                    c = 'A';
                    break;
                }
                break;
            case -458141174:
                if (str.equals("yeelink.light.ceilb")) {
                    c = 'B';
                    break;
                }
                break;
            case -458141173:
                if (str.equals("yeelink.light.ceilc")) {
                    c = 'C';
                    break;
                }
                break;
            case -458141172:
                if (str.equals("yeelink.light.ceild")) {
                    c = 'D';
                    break;
                }
                break;
            case -458141171:
                if (str.equals("yeelink.light.ceile")) {
                    c = 'E';
                    break;
                }
                break;
            case -454053748:
                if (str.equals("yeelink.light.group")) {
                    c = 'F';
                    break;
                }
                break;
            case -449944730:
                if (str.equals("yeelink.light.lamp1")) {
                    c = 'G';
                    break;
                }
                break;
            case -449944729:
                if (str.equals("yeelink.light.lamp2")) {
                    c = 'H';
                    break;
                }
                break;
            case -449944728:
                if (str.equals("yeelink.light.lamp3")) {
                    c = 'I';
                    break;
                }
                break;
            case -449944727:
                if (str.equals("yeelink.light.lamp4")) {
                    c = 'J';
                    break;
                }
                break;
            case -449944726:
                if (str.equals("yeelink.light.lamp5")) {
                    c = 'K';
                    break;
                }
                break;
            case -449944724:
                if (str.equals("yeelink.light.lamp7")) {
                    c = 'L';
                    break;
                }
                break;
            case -449944722:
                if (str.equals("yeelink.light.lamp9")) {
                    c = 'M';
                    break;
                }
                break;
            case -448603205:
                if (str.equals("yeelink.light.mono1")) {
                    c = 'N';
                    break;
                }
                break;
            case -448603204:
                if (str.equals("yeelink.light.mono2")) {
                    c = 'O';
                    break;
                }
                break;
            case -448603202:
                if (str.equals("yeelink.light.mono4")) {
                    c = 'P';
                    break;
                }
                break;
            case -448603201:
                if (str.equals("yeelink.light.mono5")) {
                    c = 'Q';
                    break;
                }
                break;
            case -448603157:
                if (str.equals("yeelink.light.monoa")) {
                    c = 'R';
                    break;
                }
                break;
            case -448603156:
                if (str.equals("yeelink.light.monob")) {
                    c = 'S';
                    break;
                }
                break;
            case -443031172:
                if (str.equals("yeelink.light.spot1")) {
                    c = 'T';
                    break;
                }
                break;
            case -190173984:
                if (str.equals("yeelink.gateway.v1")) {
                    c = 'U';
                    break;
                }
                break;
            case -190173936:
                if (str.equals("yeelink.gateway.va")) {
                    c = 'V';
                    break;
                }
                break;
            case 250266083:
                if (str.equals("yeelink.light.gingko.group")) {
                    c = 'W';
                    break;
                }
                break;
            case 674030242:
                if (str.equals("yeelink.curtain.ctmt1")) {
                    c = 'X';
                    break;
                }
                break;
            case 922669543:
                if (str.equals("yeelink.light.ceiling1")) {
                    c = 'Y';
                    break;
                }
                break;
            case 922669544:
                if (str.equals("yeelink.light.ceiling2")) {
                    c = 'Z';
                    break;
                }
                break;
            case 922669545:
                if (str.equals("yeelink.light.ceiling3")) {
                    c = '[';
                    break;
                }
                break;
            case 922669546:
                if (str.equals("yeelink.light.ceiling4")) {
                    c = IOUtils.DIR_SEPARATOR_WINDOWS;
                    break;
                }
                break;
            case 922669547:
                if (str.equals("yeelink.light.ceiling5")) {
                    c = ']';
                    break;
                }
                break;
            case 922669548:
                if (str.equals("yeelink.light.ceiling6")) {
                    c = '^';
                    break;
                }
                break;
            case 922669549:
                if (str.equals("yeelink.light.ceiling7")) {
                    c = '_';
                    break;
                }
                break;
            case 922669550:
                if (str.equals("yeelink.light.ceiling8")) {
                    c = '`';
                    break;
                }
                break;
            case 922669551:
                if (str.equals("yeelink.light.ceiling9")) {
                    c = 'a';
                    break;
                }
                break;
            case 1201756974:
                if (str.equals("yeelink.light.ct2")) {
                    c = 'b';
                    break;
                }
                break;
            case 1201757021:
                if (str.equals("yeelink.light.cta")) {
                    c = 'c';
                    break;
                }
                break;
            case 1201757023:
                if (str.equals("yeelink.light.ctc")) {
                    c = 'd';
                    break;
                }
                break;
            case 1201766335:
                if (str.equals("yeelink.light.ml1")) {
                    c = 'e';
                    break;
                }
                break;
            case 1201766336:
                if (str.equals("yeelink.light.ml2")) {
                    c = 'f';
                    break;
                }
                break;
            case 1623724661:
                if (str.equals("yeelink.light.bslamp1")) {
                    c = 'g';
                    break;
                }
                break;
            case 1623724662:
                if (str.equals("yeelink.light.bslamp2")) {
                    c = 'h';
                    break;
                }
                break;
            case 1623724663:
                if (str.equals("yeelink.light.bslamp3")) {
                    c = 'i';
                    break;
                }
                break;
            case 2102612488:
                if (str.equals("yeelink.light.meshbulb1")) {
                    c = 'j';
                    break;
                }
                break;
            case 2102612489:
                if (str.equals("yeelink.light.meshbulb2")) {
                    c = 'k';
                    break;
                }
                break;
            case 2146130361:
                if (str.equals("yeelink.light.dnlight2")) {
                    c = 'l';
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return m26772f();
            case 1:
                return m26723L1();
            case 2:
                return m26802p();
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 10:
            case 16:
            case 23:
            case 25:
            case 27:
            case 'E':
            case '^':
            case '_':
            case '`':
            case 'a':
                return m26829y();
            case 8:
            case 9:
            case 24:
            case '7':
            case '8':
            case '9':
                return m26753Y();
            case 11:
            case 12:
                return m26808r();
            case 13:
            case 14:
            case 15:
            case ']':
                return m26823w();
            case 17:
                return m26700E();
            case 18:
            case 'F':
                return m26830y0();
            case 19:
                return m26813s1();
            case 20:
            case 21:
            case 26:
            case 'A':
                return m26811s();
            case 22:
                return m26814t();
            case 28:
                return m26735P1();
            case 29:
                return m26729N1();
            case 30:
                return m26709H();
            case 31:
            case '\"':
                return m26712I();
            case ' ':
            case '#':
            case '$':
            case '%':
                return m26718K();
            case '!':
                return m26724M();
            case '&':
                return m26733P();
            case '\'':
            case '2':
            case '3':
            case ':':
                return m26762b1();
            case '(':
                return m26794m0();
            case ')':
                return m26800o0();
            case '*':
            case '+':
                return m26806q0();
            case ',':
                return m26815t0();
            case '-':
                return m26828x1();
            case '.':
                return m26692B0();
            case '/':
                return m26701E0();
            case '0':
                return m26707G0();
            case '1':
            case 'i':
                return m26781i();
            case '4':
                return m26795m1();
            case '5':
                return m26798n1();
            case '6':
                return m26804p1();
            case ';':
                return m26714I1();
            case '<':
                return m26834z1();
            case '=':
                return m26693B1();
            case '>':
            case '@':
                return m26699D1();
            case '?':
                return m26705F1();
            case 'B':
            case 'C':
                return m26691B();
            case 'D':
                return m26832z();
            case 'G':
                return m26742S0();
            case 'H':
                return m26773f0();
            case 'I':
            case 'K':
                return m26783i1();
            case 'J':
                return m26710H0();
            case 'L':
                return m26716J0();
            case 'M':
                return m26725M0();
            case 'N':
            case 'O':
                return m26761b0();
            case 'P':
            case 'Q':
                return m26819u1();
            case 'R':
            case 'S':
                return m26774f1();
            case 'T':
            case 'e':
            case 'f':
            case 'j':
            case 'k':
            case 'l':
                return m26750W0();
            case 'U':
            case 'V':
                return m26752X0();
            case 'W':
                return m26818u0();
            case 'X':
                return m26749W();
            case 'Y':
                return m26731O0();
            case 'Z':
                return m26737Q0();
            case '[':
                return m26776g0();
            case '\\':
                return m26779h0();
            case 'b':
                return m26743T();
            case 'c':
                return m26745U();
            case 'd':
                return m26747V();
            case 'g':
                return m26787k();
            case 'h':
                return m26775g();
            default:
                return new HashMap();
        }
    }

    /* renamed from: Z0 */
    private static List<C10507u> m26756Z0(C3010c cVar) {
        Resources resources = C3108x.f4951e.getResources();
        ArrayList arrayList = new ArrayList();
        int[] iArr = {0, 2, 9, 16};
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < 4; i++) {
            C6093d b = m26760b(iArr[i], cVar);
            if (b != null) {
                arrayList2.add(b);
                cVar.mo23178B0(b);
            }
        }
        arrayList.add(new C10507u(resources.getString(R$string.feature_group_group), arrayList2));
        return arrayList;
    }

    /* renamed from: a */
    private static C6093d m26757a(int i, C3010c cVar) {
        Resources resources = C3108x.f4951e.getResources();
        if (!cVar.mo23229n0(i)) {
            return null;
        }
        if (i == 1) {
            return new C10463i1(R$drawable.icon_yeelight_featue_timer, resources.getString(R$string.fancl_fan_timer_feature_name), i, cVar.mo23185G());
        }
        if (i == 5) {
            return new C10517x(R$drawable.icon_yeelight_featue_firmware, resources.getString(R$string.feature_fw_upgrade), i, cVar.mo23185G());
        }
        if (i == 15) {
            return new C10444e1(R$drawable.icon_yeelight_featue_set_default, resources.getString(R$string.fancl_fan_default_feature_name), i, cVar.mo23185G());
        }
        if (i != 25) {
            return null;
        }
        return new C10427b1(R$drawable.icon_yeelight_featue_remote, resources.getString(R$string.remote_title), i, cVar.mo23185G());
    }

    /* renamed from: a0 */
    private static List<C6093d> m26758a0(C3010c cVar) {
        int[] iArr = {29, 1, 2, 15, 5, 18};
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 6; i++) {
            C6093d c = m26763c(iArr[i], cVar);
            if (c != null) {
                arrayList.add(c);
                cVar.mo23178B0(c);
            }
        }
        return arrayList;
    }

    /* renamed from: a1 */
    private static List<C6093d> m26759a1(C3010c cVar) {
        int[] iArr = {29, 2, 1};
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 3; i++) {
            C6093d c = m26763c(iArr[i], cVar);
            if (c != null) {
                arrayList.add(c);
                cVar.mo23178B0(c);
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    private static C6093d m26760b(int i, C3010c cVar) {
        Resources resources = C3108x.f4951e.getResources();
        if (!cVar.mo23229n0(i)) {
            return null;
        }
        switch (i) {
            case 0:
                return new C10431c1(R$drawable.setting_rename, resources.getString(R$string.common_text_name), i, cVar.mo23185G());
            case 1:
                return new C10463i1(R$drawable.setting_alarm, resources.getString(R$string.feature_alarm), i, cVar.mo23185G());
            case 2:
                return new C10488q(R$drawable.setting_delay, resources.getString(R$string.common_text_delay_off), i, cVar.mo23185G());
            case 3:
                return new C10524y0(R$drawable.setting_night_light, resources.getString(R$string.feature_night_light), i, cVar.mo23185G());
            case 4:
                return new C10416a(R$drawable.setting_awake, resources.getString(R$string.common_text_awake), i, cVar.mo23185G());
            case 5:
                return new C10517x(R$drawable.setting_fw, resources.getString(R$string.feature_fw_upgrade), i, cVar.mo23185G());
            case 6:
                return new C10499s(R$drawable.setting_bt, resources.getString(R$string.feature_disconnect_bt), i, cVar.mo23185G());
            case 7:
                return new C10473l1(R$drawable.setting_unbind, resources.getString(R$string.feature_unbind), i, cVar.mo23185G());
            case 8:
                return new C10511v0(R$drawable.setting_miband, resources.getString(R$string.feature_mi_band), i, cVar.mo23185G());
            case 9:
                return new C10513w(R$drawable.setting_feedback, resources.getString(R$string.feature_feedback), i, cVar.mo23185G());
            case 10:
                return new C10437d1(R$drawable.setting_restore, resources.getString(R$string.feature_restore), i, cVar.mo23185G());
            case 11:
                return new C10421a1(R$drawable.setting_alarm, resources.getString(R$string.feature_focus), i, cVar.mo23185G());
            case 12:
                return new C10461i0(R$drawable.setting_group_management, resources.getString(R$string.room_setting_manage), i, cVar.mo23185G());
            case 13:
                return new C10479m1(R$drawable.setting_wechat, resources.getString(R$string.feature_wechat), i, cVar.mo23185G());
            case 14:
                return new C10446f(R$drawable.setting_night_light, resources.getString(R$string.feature_call_alarm), i, cVar.mo23185G());
            case 15:
                return new C10444e1(R$drawable.setting_set_default, resources.getString(R$string.feature_set_default), i, cVar.mo23185G());
            case 16:
                return new C10450f1(R$drawable.setting_set_default, resources.getString(R$string.feature_share_device), i, cVar.mo23185G());
            case 17:
                return new C10482n0(R$drawable.setting_kid_mode, resources.getString(R$string.feature_kid_mode), i, cVar.mo23185G());
            case 18:
                return new C10425b0(R$drawable.setting_geek_mode, resources.getString(R$string.feature_geek_mode), i, cVar.mo23185G());
            case 19:
                return new C10505t0(R$drawable.icon_yeelight_mango_short_key, resources.getString(R$string.feature_short_key_mode), i, cVar.mo23185G());
            case 20:
                return new C10515w0(R$drawable.setting_miband, resources.getString(R$string.feature_mi_band), i, cVar.mo23185G());
            case 21:
                return new C10521x0(R$drawable.setting_music_mode, resources.getString(R$string.feature_music_mode), i, cVar.mo23185G());
            case 22:
                return new C10494q0(R$drawable.setting_led_indicator, resources.getString(R$string.feature_led_indicator), i, cVar.mo23185G());
            case 23:
                return new C10454g1(R$drawable.setting_add_shortcut, resources.getString(R$string.feature_add_shortcut), i, cVar.mo23185G());
            case 24:
                return new C10522y(R$drawable.setting_fw, resources.getString(R$string.feature_fw_version), i, cVar.mo23185G());
            case 25:
                return new C10427b1(R$drawable.setting_kiwi_icon, resources.getString(R$string.remote_title), i, cVar.mo23185G());
            case 28:
                return new C10508u0(R$drawable.setting_kiwi_icon, resources.getString(R$string.feature_group_manage), i, cVar.mo23185G());
            case 32:
                return new C10423b(R$drawable.setting_kiwi_icon, resources.getString(R$string.settings_feature_ambi_title), i, cVar.mo23185G());
            case 34:
                return new C10496r(R$drawable.setting_rename, resources.getString(R$string.feature_device_info), i, cVar.mo23185G());
            case 36:
                return new C10441e(R$drawable.setting_rename, "Bundle Scene Demo", i, cVar.mo23185G());
            case 37:
                return new C10458h1(R$drawable.setting_rename, resources.getString(R$string.speaker_voice_system_switching), i, cVar.mo23185G());
            case 38:
                return new C10420a0(R$drawable.setting_rename, resources.getString(R$string.settings_flex_switch_tm_enable), i, cVar.mo23185G());
            case 39:
                return new C10436d0(R$drawable.setting_rename, resources.getString(R$string.gesture_switch_feature_name), i, cVar.mo23185G());
            case 40:
                return new C10470k1(R$drawable.setting_rename, resources.getString(R$string.touch_panel_turn_off_name), i, cVar.mo23185G());
            case 41:
                return new C10472l0(R$drawable.setting_rename, resources.getString(R$string.vision_setting_induction_name), i, cVar.mo23185G());
            case 42:
                return new C10487p0(R$drawable.setting_rename, resources.getString(R$string.vision_mode_selection), i, cVar.mo23185G());
            case 43:
                return new C10486p(R$drawable.setting_rename, resources.getString(R$string.vision_default_schedule_title), i, cVar.mo23185G());
            case 44:
                return new C10449f0(R$drawable.setting_rename, resources.getString(R$string.settings_google_custom_connect), i, cVar.mo23185G());
            case 45:
                return new C10456h(R$drawable.setting_rename, resources.getString(R$string.setting_curtain_user_guide), i, cVar.mo23185G());
            case 46:
                return new C10481n(R$drawable.setting_rename, resources.getString(R$string.setting_curtain_open_style_title), i, cVar.mo23185G());
            case 47:
                return new C10471l(R$drawable.setting_rename, resources.getString(R$string.setting_curtain_open_by_yourself_title), i, cVar.mo23185G());
            case 48:
                return new C10457h0(R$drawable.setting_rename, resources.getString(R$string.google_home_add_title), i, cVar.mo23185G());
            case 50:
                return new C10503s0(R$drawable.setting_rename, resources.getString(R$string.settings_feature_light_gradient), i, cVar.mo23185G());
            case 51:
                return new C10435d(R$drawable.setting_rename, resources.getString(R$string.common_text_bluetooth_mode), i, cVar.mo23185G());
            default:
                return null;
        }
    }

    /* renamed from: b0 */
    private static Map<Integer, String> m26761b0() {
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

    /* renamed from: b1 */
    private static Map<Integer, String> m26762b1() {
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

    /* JADX WARNING: type inference failed for: r6v1 */
    /* JADX WARNING: type inference failed for: r0v29, types: [u3.q] */
    /* JADX WARNING: type inference failed for: r0v30, types: [u3.q] */
    /* JADX WARNING: type inference failed for: r0v31, types: [u3.y0] */
    /* JADX WARNING: type inference failed for: r0v32, types: [u3.a] */
    /* JADX WARNING: type inference failed for: r0v33, types: [u3.v0] */
    /* JADX WARNING: type inference failed for: r0v34, types: [u3.a1] */
    /* JADX WARNING: type inference failed for: r0v35, types: [u3.n0] */
    /* JADX WARNING: type inference failed for: r0v36, types: [u3.b0] */
    /* JADX WARNING: type inference failed for: r0v37, types: [u3.w0] */
    /* JADX WARNING: type inference failed for: r0v38, types: [u3.x0] */
    /* JADX WARNING: type inference failed for: r0v39, types: [u3.q0] */
    /* JADX WARNING: type inference failed for: r0v40, types: [u3.m0] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.yeelight.yeelib.device.base.C6093d m26763c(int r8, com.yeelight.yeelib.device.base.C3010c r9) {
        /*
            android.content.Context r1 = com.yeelight.yeelib.managers.C3108x.f4951e
            android.content.res.Resources r1 = r1.getResources()
            boolean r2 = r9.mo23229n0(r8)
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
            u3.l0 r4 = new u3.l0
            int r2 = com.yeelight.yeelib.R$drawable.icon_yeelight_featue_human_induction
            int r5 = com.yeelight.yeelib.R$string.vision_setting_induction_name
            java.lang.String r1 = r1.getString(r5)
            java.lang.String r0 = r9.mo23185G()
            r4.<init>(r2, r1, r8, r0)
            goto L_0x0285
        L_0x0026:
            u3.e r4 = new u3.e
            int r1 = com.yeelight.yeelib.R$drawable.icon_yeelight_feature_favorite
            java.lang.String r0 = r9.mo23185G()
            java.lang.String r2 = "Bundle Scene Demo"
            r4.<init>(r1, r2, r8, r0)
            goto L_0x0285
        L_0x0035:
            u3.m0 r6 = new u3.m0
            int r2 = com.yeelight.yeelib.R$drawable.icon_yeelight_featue_kid_lock
            int r4 = com.yeelight.yeelib.R$string.feature_child_lock
            java.lang.String r4 = r1.getString(r4)
            java.lang.String r5 = r9.mo23185G()
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
            u3.j0 r4 = new u3.j0
            int r1 = com.yeelight.yeelib.R$drawable.icon_yeelight_featue_timer
            java.lang.String r0 = r9.mo23185G()
            java.lang.String r2 = "灯组特效"
            r4.<init>(r1, r2, r8, r0)
            goto L_0x0285
        L_0x005e:
            u3.t r4 = new u3.t
            int r2 = com.yeelight.yeelib.R$drawable.icon_yeelight_feature_favorite
            int r5 = com.yeelight.yeelib.R$string.common_text_favorite
            java.lang.String r1 = r1.getString(r5)
            java.lang.String r0 = r9.mo23185G()
            r4.<init>(r2, r1, r8, r0)
            goto L_0x0285
        L_0x0071:
            u3.u0 r4 = new u3.u0
            int r2 = com.yeelight.yeelib.R$drawable.setting_kiwi_icon
            int r5 = com.yeelight.yeelib.R$string.feature_group_manage
            java.lang.String r1 = r1.getString(r5)
            java.lang.String r0 = r9.mo23185G()
            r4.<init>(r2, r1, r8, r0)
            goto L_0x0285
        L_0x0084:
            u3.z0 r4 = new u3.z0
            int r2 = com.yeelight.yeelib.R$drawable.icon_yeelight_pick_color
            int r5 = com.yeelight.yeelib.R$string.common_text_color_camera
            java.lang.String r1 = r1.getString(r5)
            java.lang.String r0 = r9.mo23185G()
            r4.<init>(r2, r1, r8, r0)
            goto L_0x0285
        L_0x0097:
            u3.b1 r4 = new u3.b1
            int r2 = com.yeelight.yeelib.R$drawable.icon_yeelight_featue_remote
            int r5 = com.yeelight.yeelib.R$string.remote_title
            java.lang.String r1 = r1.getString(r5)
            java.lang.String r0 = r9.mo23185G()
            r4.<init>(r2, r1, r8, r0)
            goto L_0x0285
        L_0x00aa:
            u3.q0 r6 = new u3.q0
            int r2 = com.yeelight.yeelib.R$drawable.icon_yeelight_featue_led_indicator
            int r4 = com.yeelight.yeelib.R$string.feature_led_indicator
            java.lang.String r4 = r1.getString(r4)
            java.lang.String r5 = r9.mo23185G()
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
            u3.x0 r6 = new u3.x0
            int r2 = com.yeelight.yeelib.R$drawable.icon_yeelight_featue_music_mode
            int r4 = com.yeelight.yeelib.R$string.feature_music_mode
            java.lang.String r4 = r1.getString(r4)
            java.lang.String r5 = r9.mo23185G()
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
            u3.w0 r6 = new u3.w0
            int r2 = com.yeelight.yeelib.R$drawable.icon_yeelight_featue_miband
            int r4 = com.yeelight.yeelib.R$string.feature_mi_band
            java.lang.String r4 = r1.getString(r4)
            java.lang.String r5 = r9.mo23185G()
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
            u3.t0 r4 = new u3.t0
            int r2 = com.yeelight.yeelib.R$drawable.icon_yeelight_featue_short_key
            int r5 = com.yeelight.yeelib.R$string.feature_short_key_mode
            java.lang.String r1 = r1.getString(r5)
            java.lang.String r0 = r9.mo23185G()
            r4.<init>(r2, r1, r8, r0)
            goto L_0x0285
        L_0x010b:
            u3.b0 r6 = new u3.b0
            int r2 = com.yeelight.yeelib.R$drawable.icon_yeelight_featue_geekmode
            int r4 = com.yeelight.yeelib.R$string.feature_geek_mode
            java.lang.String r4 = r1.getString(r4)
            java.lang.String r5 = r9.mo23185G()
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
            u3.n0 r6 = new u3.n0
            int r2 = com.yeelight.yeelib.R$drawable.icon_yeelight_featue_kid_mode
            int r4 = com.yeelight.yeelib.R$string.feature_kid_mode
            java.lang.String r4 = r1.getString(r4)
            java.lang.String r5 = r9.mo23185G()
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
            boolean r2 = r9 instanceof p207s3.C10337c
            u3.e1 r4 = new u3.e1
            if (r2 == 0) goto L_0x0156
            int r2 = com.yeelight.yeelib.R$drawable.icon_yeelight_featue_set_default
            int r5 = com.yeelight.yeelib.R$string.fancl_light_default_feature_name
            java.lang.String r1 = r1.getString(r5)
            java.lang.String r0 = r9.mo23185G()
            r4.<init>(r2, r1, r8, r0)
            goto L_0x0285
        L_0x0156:
            int r2 = com.yeelight.yeelib.R$drawable.icon_yeelight_featue_set_default
            int r5 = com.yeelight.yeelib.R$string.feature_set_default
            java.lang.String r1 = r1.getString(r5)
            java.lang.String r0 = r9.mo23185G()
            r4.<init>(r2, r1, r8, r0)
            goto L_0x0285
        L_0x0167:
            u3.m1 r4 = new u3.m1
            int r2 = com.yeelight.yeelib.R$drawable.icon_yeelight_featue_wechat
            int r5 = com.yeelight.yeelib.R$string.feature_wechat
            java.lang.String r1 = r1.getString(r5)
            java.lang.String r0 = r9.mo23185G()
            r4.<init>(r2, r1, r8, r0)
            goto L_0x0285
        L_0x017a:
            u3.i0 r4 = new u3.i0
            int r2 = com.yeelight.yeelib.R$drawable.icon_yeelight_featue_group_managment
            int r5 = com.yeelight.yeelib.R$string.room_setting_manage
            java.lang.String r1 = r1.getString(r5)
            java.lang.String r0 = r9.mo23185G()
            r4.<init>(r2, r1, r8, r0)
            goto L_0x0285
        L_0x018d:
            u3.a1 r6 = new u3.a1
            int r2 = com.yeelight.yeelib.R$drawable.icon_yeelight_featue_pdo
            int r4 = com.yeelight.yeelib.R$string.feature_focus
            java.lang.String r4 = r1.getString(r4)
            java.lang.String r5 = r9.mo23185G()
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
            u3.w r4 = new u3.w
            int r2 = com.yeelight.yeelib.R$drawable.icon_yeelight_featue_feedback
            int r5 = com.yeelight.yeelib.R$string.feature_feedback
            java.lang.String r1 = r1.getString(r5)
            java.lang.String r0 = r9.mo23185G()
            r4.<init>(r2, r1, r8, r0)
            goto L_0x0285
        L_0x01ba:
            u3.v0 r6 = new u3.v0
            int r2 = com.yeelight.yeelib.R$drawable.icon_yeelight_featue_miband
            int r4 = com.yeelight.yeelib.R$string.feature_mi_band
            java.lang.String r4 = r1.getString(r4)
            java.lang.String r5 = r9.mo23185G()
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
            u3.s r4 = new u3.s
            int r2 = com.yeelight.yeelib.R$drawable.icon_yeelight_featue_disconnect
            int r5 = com.yeelight.yeelib.R$string.feature_disconnect_bt
            java.lang.String r1 = r1.getString(r5)
            java.lang.String r0 = r9.mo23185G()
            r4.<init>(r2, r1, r8, r0)
            goto L_0x0285
        L_0x01e6:
            u3.x r4 = new u3.x
            int r2 = com.yeelight.yeelib.R$drawable.icon_yeelight_featue_firmware
            int r5 = com.yeelight.yeelib.R$string.feature_fw_upgrade
            java.lang.String r1 = r1.getString(r5)
            java.lang.String r0 = r9.mo23185G()
            r4.<init>(r2, r1, r8, r0)
            goto L_0x0285
        L_0x01f9:
            u3.a r6 = new u3.a
            int r2 = com.yeelight.yeelib.R$drawable.icon_yeelight_featue_wake_up
            int r4 = com.yeelight.yeelib.R$string.common_text_awake
            java.lang.String r4 = r1.getString(r4)
            java.lang.String r5 = r9.mo23185G()
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
            u3.y0 r6 = new u3.y0
            int r2 = com.yeelight.yeelib.R$drawable.icon_yeelight_featue_night_light
            int r4 = com.yeelight.yeelib.R$string.feature_night_light
            java.lang.String r4 = r1.getString(r4)
            java.lang.String r5 = r9.mo23185G()
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
            boolean r2 = r9 instanceof p207s3.C10337c
            u3.q r6 = new u3.q
            if (r2 == 0) goto L_0x0249
            int r2 = com.yeelight.yeelib.R$drawable.icon_yeelight_featue_delay
            int r4 = com.yeelight.yeelib.R$string.fancl_light_delay_feature_name
            java.lang.String r4 = r1.getString(r4)
            java.lang.String r5 = r9.mo23185G()
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
            int r4 = com.yeelight.yeelib.R$string.common_text_delay_off
            java.lang.String r4 = r1.getString(r4)
            java.lang.String r5 = r9.mo23185G()
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
            boolean r2 = r9 instanceof p207s3.C10337c
            u3.i1 r4 = new u3.i1
            if (r2 == 0) goto L_0x0276
            int r2 = com.yeelight.yeelib.R$drawable.icon_yeelight_featue_timer
            int r5 = com.yeelight.yeelib.R$string.fancl_light_timer_feature_name
            java.lang.String r1 = r1.getString(r5)
            java.lang.String r0 = r9.mo23185G()
            r4.<init>(r2, r1, r8, r0)
            goto L_0x0285
        L_0x0276:
            int r2 = com.yeelight.yeelib.R$drawable.icon_yeelight_featue_timer
            int r5 = com.yeelight.yeelib.R$string.feature_alarm
            java.lang.String r1 = r1.getString(r5)
            java.lang.String r0 = r9.mo23185G()
            r4.<init>(r2, r1, r8, r0)
        L_0x0285:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p215u3.C10510v.m26763c(int, com.yeelight.yeelib.device.base.c):com.yeelight.yeelib.device.base.d");
    }

    /* renamed from: c0 */
    private static List<C10507u> m26764c0(C3010c cVar) {
        Resources resources = C3108x.f4951e.getResources();
        ArrayList arrayList = new ArrayList();
        int[] iArr = {0, 23, 9, 34, 16};
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < 5; i++) {
            C6093d b = m26760b(iArr[i], cVar);
            if (b != null) {
                arrayList2.add(b);
                cVar.mo23178B0(b);
            }
        }
        if (arrayList2.size() > 0) {
            arrayList.add(new C10507u(resources.getString(R$string.feature_group_device), arrayList2));
        }
        return arrayList;
    }

    /* renamed from: c1 */
    private static List<C10507u> m26765c1(C3010c cVar) {
        Resources resources = C3108x.f4951e.getResources();
        ArrayList arrayList = new ArrayList();
        int[] iArr = {0, 38, 9, 16, 12};
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < 5; i++) {
            C6093d b = m26760b(iArr[i], cVar);
            if (b != null) {
                arrayList2.add(b);
                cVar.mo23178B0(b);
            }
        }
        if (arrayList2.size() > 0) {
            arrayList.add(new C10507u(resources.getString(R$string.feature_group_device), arrayList2));
        }
        return arrayList;
    }

    /* renamed from: d */
    public static List<C6093d> m26766d(String str, C3010c cVar) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1644531059:
                if (str.equals("yeelink.bhf_light.v1")) {
                    c = 0;
                    break;
                }
                break;
            case -1494338802:
                if (str.equals("yeelink.switch.sw1")) {
                    c = 1;
                    break;
                }
                break;
            case -1462015191:
                if (str.equals("yeelink.light.ceiling10")) {
                    c = 2;
                    break;
                }
                break;
            case -1462015190:
                if (str.equals("yeelink.light.ceiling11")) {
                    c = 3;
                    break;
                }
                break;
            case -1462015189:
                if (str.equals("yeelink.light.ceiling12")) {
                    c = 4;
                    break;
                }
                break;
            case -1462015188:
                if (str.equals("yeelink.light.ceiling13")) {
                    c = 5;
                    break;
                }
                break;
            case -1462015187:
                if (str.equals("yeelink.light.ceiling14")) {
                    c = 6;
                    break;
                }
                break;
            case -1462015186:
                if (str.equals("yeelink.light.ceiling15")) {
                    c = 7;
                    break;
                }
                break;
            case -1462015185:
                if (str.equals("yeelink.light.ceiling16")) {
                    c = 8;
                    break;
                }
                break;
            case -1462015184:
                if (str.equals("yeelink.light.ceiling17")) {
                    c = 9;
                    break;
                }
                break;
            case -1462015183:
                if (str.equals("yeelink.light.ceiling18")) {
                    c = 10;
                    break;
                }
                break;
            case -1462015182:
                if (str.equals("yeelink.light.ceiling19")) {
                    c = 11;
                    break;
                }
                break;
            case -1462015160:
                if (str.equals("yeelink.light.ceiling20")) {
                    c = 12;
                    break;
                }
                break;
            case -1462015159:
                if (str.equals("yeelink.light.ceiling21")) {
                    c = 13;
                    break;
                }
                break;
            case -1462015158:
                if (str.equals("yeelink.light.ceiling22")) {
                    c = 14;
                    break;
                }
                break;
            case -1462015157:
                if (str.equals("yeelink.light.ceiling23")) {
                    c = 15;
                    break;
                }
                break;
            case -1462015156:
                if (str.equals("yeelink.light.ceiling24")) {
                    c = 16;
                    break;
                }
                break;
            case -1400275319:
                if (str.equals("yeelink.light.ble1")) {
                    c = 17;
                    break;
                }
                break;
            case -1350780909:
                if (str.equals("yeelink.plug.plug")) {
                    c = 18;
                    break;
                }
                break;
            case -1317475940:
                if (str.equals("yeelink.light.ceil26")) {
                    c = 19;
                    break;
                }
                break;
            case -1317475939:
                if (str.equals("yeelink.light.ceil27")) {
                    c = 20;
                    break;
                }
                break;
            case -1317475937:
                if (str.equals("yeelink.light.ceil29")) {
                    c = 21;
                    break;
                }
                break;
            case -1317475915:
                if (str.equals("yeelink.light.ceil30")) {
                    c = 22;
                    break;
                }
                break;
            case -1317475914:
                if (str.equals("yeelink.light.ceil31")) {
                    c = 23;
                    break;
                }
                break;
            case -1317475913:
                if (str.equals("yeelink.light.ceil32")) {
                    c = 24;
                    break;
                }
                break;
            case -1317475912:
                if (str.equals("yeelink.light.ceil33")) {
                    c = 25;
                    break;
                }
                break;
            case -1317475910:
                if (str.equals("yeelink.light.ceil35")) {
                    c = 26;
                    break;
                }
                break;
            case -1308146495:
                if (str.equals("yeelink.light.color1")) {
                    c = 27;
                    break;
                }
                break;
            case -1308146494:
                if (str.equals("yeelink.light.color2")) {
                    c = 28;
                    break;
                }
                break;
            case -1308146493:
                if (str.equals("yeelink.light.color3")) {
                    c = 29;
                    break;
                }
                break;
            case -1308146492:
                if (str.equals("yeelink.light.color4")) {
                    c = 30;
                    break;
                }
                break;
            case -1308146491:
                if (str.equals("yeelink.light.color5")) {
                    c = 31;
                    break;
                }
                break;
            case -1308146490:
                if (str.equals("yeelink.light.color6")) {
                    c = ' ';
                    break;
                }
                break;
            case -1308146488:
                if (str.equals("yeelink.light.color8")) {
                    c = '!';
                    break;
                }
                break;
            case -1308146447:
                if (str.equals("yeelink.light.colora")) {
                    c = '\"';
                    break;
                }
                break;
            case -1308146446:
                if (str.equals("yeelink.light.colorb")) {
                    c = '#';
                    break;
                }
                break;
            case -1308146445:
                if (str.equals("yeelink.light.colorc")) {
                    c = '$';
                    break;
                }
                break;
            case -1308146443:
                if (str.equals("yeelink.light.colore")) {
                    c = '%';
                    break;
                }
                break;
            case -1282176368:
                if (str.equals("yeelink.light.dn2grp")) {
                    c = '&';
                    break;
                }
                break;
            case -1235140472:
                if (str.equals("yeelink.light.fancl1")) {
                    c = '\'';
                    break;
                }
                break;
            case -1235140471:
                if (str.equals("yeelink.light.fancl2")) {
                    c = '(';
                    break;
                }
                break;
            case -1235140468:
                if (str.equals("yeelink.light.fancl5")) {
                    c = ')';
                    break;
                }
                break;
            case -1235140467:
                if (str.equals("yeelink.light.fancl6")) {
                    c = '*';
                    break;
                }
                break;
            case -1199119278:
                if (str.equals("yeelink.light.gingko")) {
                    c = '+';
                    break;
                }
                break;
            case -1119332198:
                if (str.equals("yeelink.wifispeaker.v1")) {
                    c = ',';
                    break;
                }
                break;
            case -1063384694:
                if (str.equals("yeelink.light.lamp10")) {
                    c = '-';
                    break;
                }
                break;
            case -1063384689:
                if (str.equals("yeelink.light.lamp15")) {
                    c = FilenameUtils.EXTENSION_SEPARATOR;
                    break;
                }
                break;
            case -1063384687:
                if (str.equals("yeelink.light.lamp17")) {
                    c = IOUtils.DIR_SEPARATOR_UNIX;
                    break;
                }
                break;
            case -1063384685:
                if (str.equals("yeelink.light.lamp19")) {
                    c = '0';
                    break;
                }
                break;
            case -1035626052:
                if (str.equals("yeelink.light.mb1grp")) {
                    c = '1';
                    break;
                }
                break;
            case -1035596261:
                if (str.equals("yeelink.light.mb2grp")) {
                    c = '2';
                    break;
                }
                break;
            case -948847040:
                if (str.equals("yeelink.light.panel1")) {
                    c = '3';
                    break;
                }
                break;
            case -948847038:
                if (str.equals("yeelink.light.panel3")) {
                    c = '4';
                    break;
                }
                break;
            case -939061393:
                if (str.equals("yeelink.light.plate2")) {
                    c = '5';
                    break;
                }
                break;
            case -888668266:
                if (str.equals("yilai.light.ceiling1")) {
                    c = '6';
                    break;
                }
                break;
            case -888668265:
                if (str.equals("yilai.light.ceiling2")) {
                    c = '7';
                    break;
                }
                break;
            case -888668264:
                if (str.equals("yilai.light.ceiling3")) {
                    c = '8';
                    break;
                }
                break;
            case -850921852:
                if (str.equals("yeelink.light.sp1grp")) {
                    c = '9';
                    break;
                }
                break;
            case -845289556:
                if (str.equals("yeelink.light.strip1")) {
                    c = ':';
                    break;
                }
                break;
            case -845289555:
                if (str.equals("yeelink.light.strip2")) {
                    c = ';';
                    break;
                }
                break;
            case -845289553:
                if (str.equals("yeelink.light.strip4")) {
                    c = '<';
                    break;
                }
                break;
            case -845289551:
                if (str.equals("yeelink.light.strip6")) {
                    c = '=';
                    break;
                }
                break;
            case -845289549:
                if (str.equals("yeelink.light.strip8")) {
                    c = '>';
                    break;
                }
                break;
            case -845289508:
                if (str.equals("yeelink.light.stripa")) {
                    c = '?';
                    break;
                }
                break;
            case -458141175:
                if (str.equals("yeelink.light.ceila")) {
                    c = '@';
                    break;
                }
                break;
            case -458141174:
                if (str.equals("yeelink.light.ceilb")) {
                    c = 'A';
                    break;
                }
                break;
            case -458141173:
                if (str.equals("yeelink.light.ceilc")) {
                    c = 'B';
                    break;
                }
                break;
            case -458141172:
                if (str.equals("yeelink.light.ceild")) {
                    c = 'C';
                    break;
                }
                break;
            case -458141171:
                if (str.equals("yeelink.light.ceile")) {
                    c = 'D';
                    break;
                }
                break;
            case -454053748:
                if (str.equals("yeelink.light.group")) {
                    c = 'E';
                    break;
                }
                break;
            case -449944730:
                if (str.equals("yeelink.light.lamp1")) {
                    c = 'F';
                    break;
                }
                break;
            case -449944729:
                if (str.equals("yeelink.light.lamp2")) {
                    c = 'G';
                    break;
                }
                break;
            case -449944728:
                if (str.equals("yeelink.light.lamp3")) {
                    c = 'H';
                    break;
                }
                break;
            case -449944727:
                if (str.equals("yeelink.light.lamp4")) {
                    c = 'I';
                    break;
                }
                break;
            case -449944726:
                if (str.equals("yeelink.light.lamp5")) {
                    c = 'J';
                    break;
                }
                break;
            case -449944724:
                if (str.equals("yeelink.light.lamp7")) {
                    c = 'K';
                    break;
                }
                break;
            case -449944723:
                if (str.equals("yeelink.light.lamp8")) {
                    c = 'L';
                    break;
                }
                break;
            case -449944722:
                if (str.equals("yeelink.light.lamp9")) {
                    c = 'M';
                    break;
                }
                break;
            case -448603205:
                if (str.equals("yeelink.light.mono1")) {
                    c = 'N';
                    break;
                }
                break;
            case -448603204:
                if (str.equals("yeelink.light.mono2")) {
                    c = 'O';
                    break;
                }
                break;
            case -448603202:
                if (str.equals("yeelink.light.mono4")) {
                    c = 'P';
                    break;
                }
                break;
            case -448603201:
                if (str.equals("yeelink.light.mono5")) {
                    c = 'Q';
                    break;
                }
                break;
            case -448603157:
                if (str.equals("yeelink.light.monoa")) {
                    c = 'R';
                    break;
                }
                break;
            case -448603156:
                if (str.equals("yeelink.light.monob")) {
                    c = 'S';
                    break;
                }
                break;
            case -443031172:
                if (str.equals("yeelink.light.spot1")) {
                    c = 'T';
                    break;
                }
                break;
            case 922669543:
                if (str.equals("yeelink.light.ceiling1")) {
                    c = 'U';
                    break;
                }
                break;
            case 922669544:
                if (str.equals("yeelink.light.ceiling2")) {
                    c = 'V';
                    break;
                }
                break;
            case 922669545:
                if (str.equals("yeelink.light.ceiling3")) {
                    c = 'W';
                    break;
                }
                break;
            case 922669546:
                if (str.equals("yeelink.light.ceiling4")) {
                    c = 'X';
                    break;
                }
                break;
            case 922669547:
                if (str.equals("yeelink.light.ceiling5")) {
                    c = 'Y';
                    break;
                }
                break;
            case 922669548:
                if (str.equals("yeelink.light.ceiling6")) {
                    c = 'Z';
                    break;
                }
                break;
            case 922669549:
                if (str.equals("yeelink.light.ceiling7")) {
                    c = '[';
                    break;
                }
                break;
            case 922669550:
                if (str.equals("yeelink.light.ceiling8")) {
                    c = IOUtils.DIR_SEPARATOR_WINDOWS;
                    break;
                }
                break;
            case 922669551:
                if (str.equals("yeelink.light.ceiling9")) {
                    c = ']';
                    break;
                }
                break;
            case 1201756974:
                if (str.equals("yeelink.light.ct2")) {
                    c = '^';
                    break;
                }
                break;
            case 1201757021:
                if (str.equals("yeelink.light.cta")) {
                    c = '_';
                    break;
                }
                break;
            case 1201757023:
                if (str.equals("yeelink.light.ctc")) {
                    c = '`';
                    break;
                }
                break;
            case 1201766335:
                if (str.equals("yeelink.light.ml1")) {
                    c = 'a';
                    break;
                }
                break;
            case 1201766336:
                if (str.equals("yeelink.light.ml2")) {
                    c = 'b';
                    break;
                }
                break;
            case 1623724661:
                if (str.equals("yeelink.light.bslamp1")) {
                    c = 'c';
                    break;
                }
                break;
            case 1623724662:
                if (str.equals("yeelink.light.bslamp2")) {
                    c = 'd';
                    break;
                }
                break;
            case 1623724663:
                if (str.equals("yeelink.light.bslamp3")) {
                    c = 'e';
                    break;
                }
                break;
            case 2102612488:
                if (str.equals("yeelink.light.meshbulb1")) {
                    c = 'f';
                    break;
                }
                break;
            case 2102612489:
                if (str.equals("yeelink.light.meshbulb2")) {
                    c = 'g';
                    break;
                }
                break;
            case 2146130361:
                if (str.equals("yeelink.light.dnlight2")) {
                    c = 'h';
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return m26769e(cVar);
            case 1:
                return m26720K1(cVar);
            case 2:
            case 11:
            case 12:
            case 'A':
            case 'B':
            case 'X':
                return m26767d0(cVar);
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 10:
            case 19:
            case 20:
            case 21:
            case 22:
            case 24:
            case 25:
            case 26:
            case '@':
            case 'D':
            case 'U':
            case 'V':
            case 'W':
            case 'Z':
            case '[':
            case '\\':
            case ']':
                return m26728N0(cVar);
            case 8:
            case 9:
            case 16:
            case 23:
                return m26734P0(cVar);
            case 13:
            case 14:
            case 15:
            case 'Y':
                return m26820v(cVar);
            case 17:
                return m26697D(cVar);
            case 18:
                return m26810r1(cVar);
            case 27:
            case 28:
            case 30:
            case 31:
            case '!':
            case '\"':
            case '#':
            case '$':
            case '%':
                return m26732O1(cVar);
            case 29:
                return m26706G(cVar);
            case ' ':
                return m26721L(cVar);
            case '&':
            case '1':
            case '2':
            case '9':
                return m26759a1(cVar);
            case '\'':
            case '(':
            case ')':
            case '*':
                return m26791l0(cVar);
            case '+':
                return m26812s0(cVar);
            case ',':
                return m26825w1(cVar);
            case '-':
                return m26689A0(cVar);
            case '.':
                return m26698D0(cVar);
            case '/':
                return m26704F0(cVar);
            case '0':
            case 'e':
                return m26778h(cVar);
            case '3':
            case '4':
                return m26792l1(cVar);
            case '5':
                return m26801o1(cVar);
            case '6':
            case '7':
            case '8':
                return m26738Q1(cVar);
            case ':':
            case ';':
            case '=':
            case '>':
            case '?':
                return m26711H1(cVar);
            case '<':
                return m26690A1(cVar);
            case 'C':
                return m26799o(cVar);
            case 'E':
                return m26827x0(cVar);
            case 'F':
            case 'I':
                return m26740R0(cVar);
            case 'G':
                return m26770e0(cVar);
            case 'H':
            case 'J':
                return m26780h1(cVar);
            case 'K':
            case 'L':
                return m26713I0(cVar);
            case 'M':
                return m26722L0(cVar);
            case 'N':
            case 'O':
            case 'P':
            case 'Q':
            case 'R':
            case 'S':
                return m26758a0(cVar);
            case 'T':
            case 'f':
            case 'g':
            case 'h':
                return m26746U0(cVar);
            case '^':
            case '_':
            case '`':
                return m26739R(cVar);
            case 'a':
            case 'b':
                return m26771e1(cVar);
            case 'c':
            case 'd':
                return m26784j(cVar);
            default:
                return new ArrayList();
        }
    }

    /* renamed from: d0 */
    private static List<C6093d> m26767d0(C3010c cVar) {
        int[] iArr = {29, 1, 2, 3, 25, 20, 15, 5, 18};
        int[] iArr2 = {36};
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 9; i++) {
            C6093d c = m26763c(iArr[i], cVar);
            if (c != null) {
                arrayList.add(c);
                cVar.mo23178B0(c);
            }
        }
        if (AppUtils.f4977a) {
            for (int i2 = 0; i2 < 1; i2++) {
                C6093d c2 = m26763c(iArr2[i2], cVar);
                if (c2 != null) {
                    arrayList.add(c2);
                    cVar.mo23178B0(c2);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: d1 */
    private static List<C10507u> m26768d1(C3010c cVar) {
        Resources resources = C3108x.f4951e.getResources();
        ArrayList arrayList = new ArrayList();
        int[] iArr = {0, 38, 9, 16};
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < 4; i++) {
            C6093d b = m26760b(iArr[i], cVar);
            if (b != null) {
                arrayList2.add(b);
                cVar.mo23178B0(b);
            }
        }
        if (arrayList2.size() > 0) {
            arrayList.add(new C10507u(resources.getString(R$string.feature_group_device), arrayList2));
        }
        return arrayList;
    }

    /* renamed from: e */
    private static List<C6093d> m26769e(C3010c cVar) {
        int[] iArr = {29, 1, 2, 3, 25, 20, 15, 5, 18};
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 9; i++) {
            C6093d c = m26763c(iArr[i], cVar);
            if (c != null) {
                arrayList.add(c);
                cVar.mo23178B0(c);
            }
        }
        return arrayList;
    }

    /* renamed from: e0 */
    private static List<C6093d> m26770e0(C3010c cVar) {
        int[] iArr = {29, 11, 1, 2, 17, 15, 19, 5};
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 8; i++) {
            C6093d c = m26763c(iArr[i], cVar);
            if (c != null) {
                arrayList.add(c);
                cVar.mo23178B0(c);
            }
        }
        return arrayList;
    }

    /* renamed from: e1 */
    private static List<C6093d> m26771e1(C3010c cVar) {
        int[] iArr = {29, 2, 1, 15, 5};
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 5; i++) {
            C6093d c = m26763c(iArr[i], cVar);
            if (c != null) {
                arrayList.add(c);
                cVar.mo23178B0(c);
            }
        }
        return arrayList;
    }

    /* renamed from: f */
    private static Map<Integer, String> m26772f() {
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
    private static Map<Integer, String> m26773f0() {
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

    /* renamed from: f1 */
    private static Map<Integer, String> m26774f1() {
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

    /* renamed from: g */
    private static Map<Integer, String> m26775g() {
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
    private static Map<Integer, String> m26776g0() {
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

    /* renamed from: g1 */
    private static List<C10507u> m26777g1(C3010c cVar) {
        Resources resources = C3108x.f4951e.getResources();
        ArrayList arrayList = new ArrayList();
        int[] iArr = {0, 50, 23, 9, 34, 16};
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < 6; i++) {
            C6093d b = m26760b(iArr[i], cVar);
            if (b != null) {
                arrayList2.add(b);
                cVar.mo23178B0(b);
            }
        }
        if (arrayList2.size() > 0) {
            arrayList.add(new C10507u(resources.getString(R$string.feature_group_device), arrayList2));
        }
        return arrayList;
    }

    /* renamed from: h */
    private static List<C6093d> m26778h(C3010c cVar) {
        int[] iArr = {29, 27, 2, 1, 3, 21, 15, 5, 18};
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 9; i++) {
            C6093d c = m26763c(iArr[i], cVar);
            if (c != null) {
                arrayList.add(c);
                cVar.mo23178B0(c);
            }
        }
        return arrayList;
    }

    /* renamed from: h0 */
    private static Map<Integer, String> m26779h0() {
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

    /* renamed from: h1 */
    private static List<C6093d> m26780h1(C3010c cVar) {
        int[] iArr = {29, 1, 2, 17, 15, 19, 5, 18, 35};
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 9; i++) {
            C6093d c = m26763c(iArr[i], cVar);
            if (c != null) {
                arrayList.add(c);
                cVar.mo23178B0(c);
            }
        }
        return arrayList;
    }

    /* renamed from: i */
    private static Map<Integer, String> m26781i() {
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

    /* renamed from: i0 */
    private static List<C10507u> m26782i0(C3010c cVar) {
        Resources resources = C3108x.f4951e.getResources();
        ArrayList arrayList = new ArrayList();
        int[] iArr = {0, 23, 32, 9, 34, 16};
        int[] iArr2 = {36};
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < 6; i++) {
            C6093d b = m26760b(iArr[i], cVar);
            if (b != null) {
                arrayList2.add(b);
                cVar.mo23178B0(b);
            }
        }
        if (AppUtils.f4977a) {
            for (int i2 = 0; i2 < 1; i2++) {
                C6093d c = m26763c(iArr2[i2], cVar);
                if (c != null) {
                    arrayList2.add(c);
                    cVar.mo23178B0(c);
                }
            }
        }
        if (arrayList2.size() > 0) {
            arrayList.add(new C10507u(resources.getString(R$string.feature_group_device), arrayList2));
        }
        return arrayList;
    }

    /* renamed from: i1 */
    private static Map<Integer, String> m26783i1() {
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

    /* renamed from: j */
    private static List<C6093d> m26784j(C3010c cVar) {
        int[] iArr = {29, 27, 2, 1, 3, 15, 5};
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 7; i++) {
            C6093d c = m26763c(iArr[i], cVar);
            if (c != null) {
                arrayList.add(c);
                cVar.mo23178B0(c);
            }
        }
        return arrayList;
    }

    /* renamed from: j0 */
    private static List<C6093d> m26785j0(C3010c cVar) {
        int[] iArr = {1, 25, 15, 5};
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 4; i++) {
            C6093d a = m26757a(iArr[i], cVar);
            if (a != null) {
                arrayList.add(a);
                cVar.mo23178B0(a);
            }
        }
        return arrayList;
    }

    /* renamed from: j1 */
    private static List<C10507u> m26786j1(C3010c cVar) {
        return m26744T0(cVar);
    }

    /* renamed from: k */
    private static Map<Integer, String> m26787k() {
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
    public static List<C6093d> m26788k0(String str, C3010c cVar) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1235140472:
                if (str.equals("yeelink.light.fancl1")) {
                    c = 0;
                    break;
                }
                break;
            case -1235140471:
                if (str.equals("yeelink.light.fancl2")) {
                    c = 1;
                    break;
                }
                break;
            case -1235140468:
                if (str.equals("yeelink.light.fancl5")) {
                    c = 2;
                    break;
                }
                break;
            case -1235140467:
                if (str.equals("yeelink.light.fancl6")) {
                    c = 3;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return m26785j0(cVar);
            case 1:
            case 2:
            case 3:
                return m26785j0(cVar);
            default:
                return new ArrayList();
        }
    }

    /* renamed from: k1 */
    public static List<Integer> m26789k1() {
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

    /* renamed from: l */
    private static List<C10507u> m26790l(C3010c cVar) {
        Resources resources = C3108x.f4951e.getResources();
        ArrayList arrayList = new ArrayList();
        int[] iArr = {0, 23, 9, 34, 16};
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < 5; i++) {
            C6093d b = m26760b(iArr[i], cVar);
            if (b != null) {
                arrayList2.add(b);
                cVar.mo23178B0(b);
            }
        }
        if (arrayList2.size() > 0) {
            arrayList.add(new C10507u(resources.getString(R$string.feature_group_device), arrayList2));
        }
        return arrayList;
    }

    /* renamed from: l0 */
    private static List<C6093d> m26791l0(C3010c cVar) {
        int[] iArr = {29, 1, 2, 3, 25, 15, 5};
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 7; i++) {
            C6093d c = m26763c(iArr[i], cVar);
            if (c != null) {
                arrayList.add(c);
                cVar.mo23178B0(c);
            }
        }
        return arrayList;
    }

    /* renamed from: l1 */
    private static List<C6093d> m26792l1(C3010c cVar) {
        int[] iArr = {29, 2, 1, 3, 25, 15, 5, 18};
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 8; i++) {
            C6093d c = m26763c(iArr[i], cVar);
            if (c != null) {
                arrayList.add(c);
                cVar.mo23178B0(c);
            }
        }
        return arrayList;
    }

    /* renamed from: m */
    private static List<C10507u> m26793m(C3010c cVar) {
        Resources resources = C3108x.f4951e.getResources();
        ArrayList arrayList = new ArrayList();
        int[] iArr = {0, 39, 23, 9, 34, 16};
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < 6; i++) {
            C6093d b = m26760b(iArr[i], cVar);
            if (b != null) {
                arrayList2.add(b);
                cVar.mo23178B0(b);
            }
        }
        if (arrayList2.size() > 0) {
            arrayList.add(new C10507u(resources.getString(R$string.feature_group_device), arrayList2));
        }
        return arrayList;
    }

    /* renamed from: m0 */
    private static Map<Integer, String> m26794m0() {
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

    /* renamed from: m1 */
    private static Map<Integer, String> m26795m1() {
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

    /* renamed from: n */
    private static List<C10507u> m26796n(C3010c cVar) {
        Resources resources = C3108x.f4951e.getResources();
        ArrayList arrayList = new ArrayList();
        int[] iArr = {0, 25, 20, 23, 9, 34, 16};
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < 7; i++) {
            C6093d b = m26760b(iArr[i], cVar);
            if (b != null) {
                arrayList2.add(b);
                cVar.mo23178B0(b);
            }
        }
        if (arrayList2.size() > 0) {
            arrayList.add(new C10507u(resources.getString(R$string.feature_group_device), arrayList2));
        }
        return arrayList;
    }

    /* renamed from: n0 */
    private static List<C10507u> m26797n0(C3010c cVar) {
        Resources resources = C3108x.f4951e.getResources();
        ArrayList arrayList = new ArrayList();
        int[] iArr = {0, 9, 34, 16};
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < 4; i++) {
            C6093d b = m26760b(iArr[i], cVar);
            if (b != null) {
                arrayList2.add(b);
                cVar.mo23178B0(b);
            }
        }
        arrayList.add(new C10507u(resources.getString(R$string.feature_group_device), arrayList2));
        return arrayList;
    }

    /* renamed from: n1 */
    private static Map<Integer, String> m26798n1() {
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

    /* renamed from: o */
    private static List<C6093d> m26799o(C3010c cVar) {
        int[] iArr = {29, 1, 2, 3, 25, 15, 5, 18};
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 8; i++) {
            C6093d c = m26763c(iArr[i], cVar);
            if (c != null) {
                arrayList.add(c);
                cVar.mo23178B0(c);
            }
        }
        return arrayList;
    }

    /* renamed from: o0 */
    private static Map<Integer, String> m26800o0() {
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

    /* renamed from: o1 */
    private static List<C6093d> m26801o1(C3010c cVar) {
        int[] iArr = {29, 27, 2, 1, 5, 18};
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 6; i++) {
            C6093d c = m26763c(iArr[i], cVar);
            if (c != null) {
                arrayList.add(c);
                cVar.mo23178B0(c);
            }
        }
        return arrayList;
    }

    /* renamed from: p */
    private static Map<Integer, String> m26802p() {
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
    private static List<C10507u> m26803p0(C3010c cVar) {
        Resources resources = C3108x.f4951e.getResources();
        ArrayList arrayList = new ArrayList();
        int[] iArr = {0, 38, 9, 34, 16};
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < 5; i++) {
            C6093d b = m26760b(iArr[i], cVar);
            if (b != null) {
                arrayList2.add(b);
                cVar.mo23178B0(b);
            }
        }
        arrayList.add(new C10507u(resources.getString(R$string.feature_group_device), arrayList2));
        return arrayList;
    }

    /* renamed from: p1 */
    private static Map<Integer, String> m26804p1() {
        HashMap hashMap = new HashMap();
        hashMap.put(29, TimerCodec.DISENABLE);
        hashMap.put(0, TimerCodec.DISENABLE);
        hashMap.put(1, TimerCodec.DISENABLE);
        hashMap.put(2, TimerCodec.DISENABLE);
        hashMap.put(5, TimerCodec.DISENABLE);
        hashMap.put(9, TimerCodec.DISENABLE);
        hashMap.put(18, TimerCodec.DISENABLE);
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

    /* renamed from: q */
    private static List<C10507u> m26805q(C3010c cVar) {
        Resources resources = C3108x.f4951e.getResources();
        ArrayList arrayList = new ArrayList();
        int[] iArr = {0, 38, 23, 32, 9, 34, 16};
        int[] iArr2 = {36};
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < 7; i++) {
            C6093d b = m26760b(iArr[i], cVar);
            if (b != null) {
                arrayList2.add(b);
                cVar.mo23178B0(b);
            }
        }
        if (AppUtils.f4977a) {
            for (int i2 = 0; i2 < 1; i2++) {
                C6093d c = m26763c(iArr2[i2], cVar);
                if (c != null) {
                    arrayList2.add(c);
                    cVar.mo23178B0(c);
                }
            }
        }
        if (arrayList2.size() > 0) {
            arrayList.add(new C10507u(resources.getString(R$string.feature_group_device), arrayList2));
        }
        return arrayList;
    }

    /* renamed from: q0 */
    private static Map<Integer, String> m26806q0() {
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

    /* renamed from: q1 */
    private static List<C10507u> m26807q1(C3010c cVar) {
        Resources resources = C3108x.f4951e.getResources();
        ArrayList arrayList = new ArrayList();
        int[] iArr = {0, 23, 9, 34, 16};
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < 5; i++) {
            C6093d b = m26760b(iArr[i], cVar);
            if (b != null) {
                arrayList2.add(b);
                cVar.mo23178B0(b);
            }
        }
        if (arrayList2.size() > 0) {
            arrayList.add(new C10507u(resources.getString(R$string.feature_group_device), arrayList2));
        }
        return arrayList;
    }

    /* renamed from: r */
    private static Map<Integer, String> m26808r() {
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
    private static List<C10507u> m26809r0(C3010c cVar) {
        Resources resources = C3108x.f4951e.getResources();
        ArrayList arrayList = new ArrayList();
        int[] iArr = {0, 38, 9, 34, 16};
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < 5; i++) {
            C6093d b = m26760b(iArr[i], cVar);
            if (b != null) {
                arrayList2.add(b);
                cVar.mo23178B0(b);
            }
        }
        arrayList.add(new C10507u(resources.getString(R$string.feature_group_device), arrayList2));
        return arrayList;
    }

    /* renamed from: r1 */
    private static List<C6093d> m26810r1(C3010c cVar) {
        int[] iArr = {1, 15, 5};
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 3; i++) {
            C6093d c = m26763c(iArr[i], cVar);
            if (c != null) {
                arrayList.add(c);
                cVar.mo23178B0(c);
            }
        }
        return arrayList;
    }

    /* renamed from: s */
    private static Map<Integer, String> m26811s() {
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
    private static List<C6093d> m26812s0(C3010c cVar) {
        int[] iArr = {29, 2, 5};
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 3; i++) {
            C6093d c = m26763c(iArr[i], cVar);
            if (c != null) {
                arrayList.add(c);
                cVar.mo23178B0(c);
            }
        }
        return arrayList;
    }

    /* renamed from: s1 */
    private static Map<Integer, String> m26813s1() {
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

    /* renamed from: t */
    private static Map<Integer, String> m26814t() {
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
    private static Map<Integer, String> m26815t0() {
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

    /* renamed from: t1 */
    private static List<C10507u> m26816t1(C3010c cVar) {
        Resources resources = C3108x.f4951e.getResources();
        ArrayList arrayList = new ArrayList();
        int[] iArr = {0, 9, 34, 16};
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < 4; i++) {
            C6093d b = m26760b(iArr[i], cVar);
            if (b != null) {
                arrayList2.add(b);
                cVar.mo23178B0(b);
            }
        }
        arrayList.add(new C10507u(resources.getString(R$string.feature_group_device), arrayList2));
        return arrayList;
    }

    /* renamed from: u */
    private static List<C10507u> m26817u(C3010c cVar) {
        Resources resources = C3108x.f4951e.getResources();
        ArrayList arrayList = new ArrayList();
        int[] iArr = {0, 38, 23, 9, 34, 16};
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < 6; i++) {
            C6093d b = m26760b(iArr[i], cVar);
            if (b != null) {
                arrayList2.add(b);
                cVar.mo23178B0(b);
            }
        }
        if (arrayList2.size() > 0) {
            arrayList.add(new C10507u(resources.getString(R$string.feature_group_device), arrayList2));
        }
        return arrayList;
    }

    /* renamed from: u0 */
    private static Map<Integer, String> m26818u0() {
        HashMap hashMap = new HashMap();
        hashMap.put(9, TimerCodec.DISENABLE);
        hashMap.put(16, TimerCodec.DISENABLE);
        return hashMap;
    }

    /* renamed from: u1 */
    private static Map<Integer, String> m26819u1() {
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

    /* renamed from: v */
    private static List<C6093d> m26820v(C3010c cVar) {
        int[] iArr = {29, 1, 2, 3, 25, 20, 15, 5};
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 8; i++) {
            C6093d c = m26763c(iArr[i], cVar);
            if (c != null) {
                arrayList.add(c);
                cVar.mo23178B0(c);
            }
        }
        return arrayList;
    }

    /* renamed from: v0 */
    private static List<C10507u> m26821v0(C3010c cVar) {
        Resources resources = C3108x.f4951e.getResources();
        ArrayList arrayList = new ArrayList();
        int[] iArr = {9, 16};
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < 2; i++) {
            C6093d b = m26760b(iArr[i], cVar);
            if (b != null) {
                arrayList2.add(b);
                cVar.mo23178B0(b);
            }
        }
        arrayList.add(new C10507u(resources.getString(R$string.feature_group_device), arrayList2));
        return arrayList;
    }

    /* renamed from: v1 */
    public static List<C10507u> m26822v1(String str, C3010c cVar) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1644531059:
                if (str.equals("yeelink.bhf_light.v1")) {
                    c = 0;
                    break;
                }
                break;
            case -1494338802:
                if (str.equals("yeelink.switch.sw1")) {
                    c = 1;
                    break;
                }
                break;
            case -1462015191:
                if (str.equals("yeelink.light.ceiling10")) {
                    c = 2;
                    break;
                }
                break;
            case -1462015190:
                if (str.equals("yeelink.light.ceiling11")) {
                    c = 3;
                    break;
                }
                break;
            case -1462015189:
                if (str.equals("yeelink.light.ceiling12")) {
                    c = 4;
                    break;
                }
                break;
            case -1462015188:
                if (str.equals("yeelink.light.ceiling13")) {
                    c = 5;
                    break;
                }
                break;
            case -1462015187:
                if (str.equals("yeelink.light.ceiling14")) {
                    c = 6;
                    break;
                }
                break;
            case -1462015186:
                if (str.equals("yeelink.light.ceiling15")) {
                    c = 7;
                    break;
                }
                break;
            case -1462015185:
                if (str.equals("yeelink.light.ceiling16")) {
                    c = 8;
                    break;
                }
                break;
            case -1462015184:
                if (str.equals("yeelink.light.ceiling17")) {
                    c = 9;
                    break;
                }
                break;
            case -1462015183:
                if (str.equals("yeelink.light.ceiling18")) {
                    c = 10;
                    break;
                }
                break;
            case -1462015182:
                if (str.equals("yeelink.light.ceiling19")) {
                    c = 11;
                    break;
                }
                break;
            case -1462015160:
                if (str.equals("yeelink.light.ceiling20")) {
                    c = 12;
                    break;
                }
                break;
            case -1462015159:
                if (str.equals("yeelink.light.ceiling21")) {
                    c = 13;
                    break;
                }
                break;
            case -1462015158:
                if (str.equals("yeelink.light.ceiling22")) {
                    c = 14;
                    break;
                }
                break;
            case -1462015157:
                if (str.equals("yeelink.light.ceiling23")) {
                    c = 15;
                    break;
                }
                break;
            case -1462015156:
                if (str.equals("yeelink.light.ceiling24")) {
                    c = 16;
                    break;
                }
                break;
            case -1400275319:
                if (str.equals("yeelink.light.ble1")) {
                    c = 17;
                    break;
                }
                break;
            case -1399953856:
                if (str.equals("yeelink.light.mesh")) {
                    c = 18;
                    break;
                }
                break;
            case -1399795410:
                if (str.equals("yeelink.light.room")) {
                    c = 19;
                    break;
                }
                break;
            case -1350780909:
                if (str.equals("yeelink.plug.plug")) {
                    c = 20;
                    break;
                }
                break;
            case -1317475940:
                if (str.equals("yeelink.light.ceil26")) {
                    c = 21;
                    break;
                }
                break;
            case -1317475939:
                if (str.equals("yeelink.light.ceil27")) {
                    c = 22;
                    break;
                }
                break;
            case -1317475937:
                if (str.equals("yeelink.light.ceil29")) {
                    c = 23;
                    break;
                }
                break;
            case -1317475915:
                if (str.equals("yeelink.light.ceil30")) {
                    c = 24;
                    break;
                }
                break;
            case -1317475914:
                if (str.equals("yeelink.light.ceil31")) {
                    c = 25;
                    break;
                }
                break;
            case -1317475913:
                if (str.equals("yeelink.light.ceil32")) {
                    c = 26;
                    break;
                }
                break;
            case -1317475912:
                if (str.equals("yeelink.light.ceil33")) {
                    c = 27;
                    break;
                }
                break;
            case -1317475910:
                if (str.equals("yeelink.light.ceil35")) {
                    c = 28;
                    break;
                }
                break;
            case -1308146495:
                if (str.equals("yeelink.light.color1")) {
                    c = 29;
                    break;
                }
                break;
            case -1308146494:
                if (str.equals("yeelink.light.color2")) {
                    c = 30;
                    break;
                }
                break;
            case -1308146493:
                if (str.equals("yeelink.light.color3")) {
                    c = 31;
                    break;
                }
                break;
            case -1308146492:
                if (str.equals("yeelink.light.color4")) {
                    c = ' ';
                    break;
                }
                break;
            case -1308146491:
                if (str.equals("yeelink.light.color5")) {
                    c = '!';
                    break;
                }
                break;
            case -1308146490:
                if (str.equals("yeelink.light.color6")) {
                    c = '\"';
                    break;
                }
                break;
            case -1308146488:
                if (str.equals("yeelink.light.color8")) {
                    c = '#';
                    break;
                }
                break;
            case -1308146447:
                if (str.equals("yeelink.light.colora")) {
                    c = '$';
                    break;
                }
                break;
            case -1308146446:
                if (str.equals("yeelink.light.colorb")) {
                    c = '%';
                    break;
                }
                break;
            case -1308146445:
                if (str.equals("yeelink.light.colorc")) {
                    c = '&';
                    break;
                }
                break;
            case -1308146443:
                if (str.equals("yeelink.light.colore")) {
                    c = '\'';
                    break;
                }
                break;
            case -1282176368:
                if (str.equals("yeelink.light.dn2grp")) {
                    c = '(';
                    break;
                }
                break;
            case -1235140472:
                if (str.equals("yeelink.light.fancl1")) {
                    c = ')';
                    break;
                }
                break;
            case -1235140471:
                if (str.equals("yeelink.light.fancl2")) {
                    c = '*';
                    break;
                }
                break;
            case -1235140468:
                if (str.equals("yeelink.light.fancl5")) {
                    c = '+';
                    break;
                }
                break;
            case -1235140467:
                if (str.equals("yeelink.light.fancl6")) {
                    c = ',';
                    break;
                }
                break;
            case -1199119278:
                if (str.equals("yeelink.light.gingko")) {
                    c = '-';
                    break;
                }
                break;
            case -1119332198:
                if (str.equals("yeelink.wifispeaker.v1")) {
                    c = FilenameUtils.EXTENSION_SEPARATOR;
                    break;
                }
                break;
            case -1063384694:
                if (str.equals("yeelink.light.lamp10")) {
                    c = IOUtils.DIR_SEPARATOR_UNIX;
                    break;
                }
                break;
            case -1063384689:
                if (str.equals("yeelink.light.lamp15")) {
                    c = '0';
                    break;
                }
                break;
            case -1063384687:
                if (str.equals("yeelink.light.lamp17")) {
                    c = '1';
                    break;
                }
                break;
            case -1063384685:
                if (str.equals("yeelink.light.lamp19")) {
                    c = '2';
                    break;
                }
                break;
            case -1035626052:
                if (str.equals("yeelink.light.mb1grp")) {
                    c = '3';
                    break;
                }
                break;
            case -1035596261:
                if (str.equals("yeelink.light.mb2grp")) {
                    c = '4';
                    break;
                }
                break;
            case -948847040:
                if (str.equals("yeelink.light.panel1")) {
                    c = '5';
                    break;
                }
                break;
            case -948847038:
                if (str.equals("yeelink.light.panel3")) {
                    c = '6';
                    break;
                }
                break;
            case -939061393:
                if (str.equals("yeelink.light.plate2")) {
                    c = '7';
                    break;
                }
                break;
            case -888668266:
                if (str.equals("yilai.light.ceiling1")) {
                    c = '8';
                    break;
                }
                break;
            case -888668265:
                if (str.equals("yilai.light.ceiling2")) {
                    c = '9';
                    break;
                }
                break;
            case -888668264:
                if (str.equals("yilai.light.ceiling3")) {
                    c = ':';
                    break;
                }
                break;
            case -850921852:
                if (str.equals("yeelink.light.sp1grp")) {
                    c = ';';
                    break;
                }
                break;
            case -845289556:
                if (str.equals("yeelink.light.strip1")) {
                    c = '<';
                    break;
                }
                break;
            case -845289555:
                if (str.equals("yeelink.light.strip2")) {
                    c = '=';
                    break;
                }
                break;
            case -845289553:
                if (str.equals("yeelink.light.strip4")) {
                    c = '>';
                    break;
                }
                break;
            case -845289551:
                if (str.equals("yeelink.light.strip6")) {
                    c = '?';
                    break;
                }
                break;
            case -845289549:
                if (str.equals("yeelink.light.strip8")) {
                    c = '@';
                    break;
                }
                break;
            case -845289508:
                if (str.equals("yeelink.light.stripa")) {
                    c = 'A';
                    break;
                }
                break;
            case -458141175:
                if (str.equals("yeelink.light.ceila")) {
                    c = 'B';
                    break;
                }
                break;
            case -458141174:
                if (str.equals("yeelink.light.ceilb")) {
                    c = 'C';
                    break;
                }
                break;
            case -458141173:
                if (str.equals("yeelink.light.ceilc")) {
                    c = 'D';
                    break;
                }
                break;
            case -458141172:
                if (str.equals("yeelink.light.ceild")) {
                    c = 'E';
                    break;
                }
                break;
            case -458141171:
                if (str.equals("yeelink.light.ceile")) {
                    c = 'F';
                    break;
                }
                break;
            case -454053748:
                if (str.equals("yeelink.light.group")) {
                    c = 'G';
                    break;
                }
                break;
            case -449944730:
                if (str.equals("yeelink.light.lamp1")) {
                    c = 'H';
                    break;
                }
                break;
            case -449944729:
                if (str.equals("yeelink.light.lamp2")) {
                    c = 'I';
                    break;
                }
                break;
            case -449944728:
                if (str.equals("yeelink.light.lamp3")) {
                    c = 'J';
                    break;
                }
                break;
            case -449944727:
                if (str.equals("yeelink.light.lamp4")) {
                    c = 'K';
                    break;
                }
                break;
            case -449944726:
                if (str.equals("yeelink.light.lamp5")) {
                    c = 'L';
                    break;
                }
                break;
            case -449944724:
                if (str.equals("yeelink.light.lamp7")) {
                    c = 'M';
                    break;
                }
                break;
            case -449944723:
                if (str.equals("yeelink.light.lamp8")) {
                    c = 'N';
                    break;
                }
                break;
            case -449944722:
                if (str.equals("yeelink.light.lamp9")) {
                    c = 'O';
                    break;
                }
                break;
            case -448603205:
                if (str.equals("yeelink.light.mono1")) {
                    c = 'P';
                    break;
                }
                break;
            case -448603204:
                if (str.equals("yeelink.light.mono2")) {
                    c = 'Q';
                    break;
                }
                break;
            case -448603202:
                if (str.equals("yeelink.light.mono4")) {
                    c = 'R';
                    break;
                }
                break;
            case -448603201:
                if (str.equals("yeelink.light.mono5")) {
                    c = 'S';
                    break;
                }
                break;
            case -448603157:
                if (str.equals("yeelink.light.monoa")) {
                    c = 'T';
                    break;
                }
                break;
            case -448603156:
                if (str.equals("yeelink.light.monob")) {
                    c = 'U';
                    break;
                }
                break;
            case -443031172:
                if (str.equals("yeelink.light.spot1")) {
                    c = 'V';
                    break;
                }
                break;
            case -190173984:
                if (str.equals("yeelink.gateway.v1")) {
                    c = 'W';
                    break;
                }
                break;
            case -190173936:
                if (str.equals("yeelink.gateway.va")) {
                    c = 'X';
                    break;
                }
                break;
            case 250266083:
                if (str.equals("yeelink.light.gingko.group")) {
                    c = 'Y';
                    break;
                }
                break;
            case 674030242:
                if (str.equals("yeelink.curtain.ctmt1")) {
                    c = 'Z';
                    break;
                }
                break;
            case 922669543:
                if (str.equals("yeelink.light.ceiling1")) {
                    c = '[';
                    break;
                }
                break;
            case 922669544:
                if (str.equals("yeelink.light.ceiling2")) {
                    c = IOUtils.DIR_SEPARATOR_WINDOWS;
                    break;
                }
                break;
            case 922669545:
                if (str.equals("yeelink.light.ceiling3")) {
                    c = ']';
                    break;
                }
                break;
            case 922669546:
                if (str.equals("yeelink.light.ceiling4")) {
                    c = '^';
                    break;
                }
                break;
            case 922669547:
                if (str.equals("yeelink.light.ceiling5")) {
                    c = '_';
                    break;
                }
                break;
            case 922669548:
                if (str.equals("yeelink.light.ceiling6")) {
                    c = '`';
                    break;
                }
                break;
            case 922669549:
                if (str.equals("yeelink.light.ceiling7")) {
                    c = 'a';
                    break;
                }
                break;
            case 922669550:
                if (str.equals("yeelink.light.ceiling8")) {
                    c = 'b';
                    break;
                }
                break;
            case 922669551:
                if (str.equals("yeelink.light.ceiling9")) {
                    c = 'c';
                    break;
                }
                break;
            case 1201756974:
                if (str.equals("yeelink.light.ct2")) {
                    c = 'd';
                    break;
                }
                break;
            case 1201757021:
                if (str.equals("yeelink.light.cta")) {
                    c = 'e';
                    break;
                }
                break;
            case 1201757023:
                if (str.equals("yeelink.light.ctc")) {
                    c = 'f';
                    break;
                }
                break;
            case 1201766335:
                if (str.equals("yeelink.light.ml1")) {
                    c = 'g';
                    break;
                }
                break;
            case 1201766336:
                if (str.equals("yeelink.light.ml2")) {
                    c = 'h';
                    break;
                }
                break;
            case 1623724661:
                if (str.equals("yeelink.light.bslamp1")) {
                    c = 'i';
                    break;
                }
                break;
            case 1623724662:
                if (str.equals("yeelink.light.bslamp2")) {
                    c = 'j';
                    break;
                }
                break;
            case 1623724663:
                if (str.equals("yeelink.light.bslamp3")) {
                    c = 'k';
                    break;
                }
                break;
            case 2102612488:
                if (str.equals("yeelink.light.meshbulb1")) {
                    c = 'l';
                    break;
                }
                break;
            case 2102612489:
                if (str.equals("yeelink.light.meshbulb2")) {
                    c = 'm';
                    break;
                }
                break;
            case 2146130361:
                if (str.equals("yeelink.light.dnlight2")) {
                    c = 'n';
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case 8:
            case 9:
            case 25:
            case '8':
            case '9':
            case ':':
            case 'P':
            case 'Q':
            case '[':
            case '\\':
            case ']':
                return m26764c0(cVar);
            case 1:
                return m26726M1(cVar);
            case 2:
            case 11:
            case 12:
                return m26805q(cVar);
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 10:
            case 13:
            case 14:
            case 15:
            case 16:
            case 21:
            case 22:
            case 24:
            case 26:
            case 27:
            case 28:
            case '5':
            case '6':
            case 'B':
            case 'F':
            case 'R':
            case 'S':
            case '_':
            case '`':
            case 'a':
            case 'b':
            case 'c':
                return m26826x(cVar);
            case 17:
                return m26703F(cVar);
            case 18:
                return m26756Z0(cVar);
            case 19:
            case 'G':
                return m26833z0(cVar);
            case 20:
                return m26816t1(cVar);
            case 23:
                return m26817u(cVar);
            case 29:
            case 30:
            case 31:
            case '!':
            case '$':
                return m26730O(cVar);
            case ' ':
            case '#':
                return m26715J(cVar);
            case '\"':
                return m26727N(cVar);
            case '%':
            case '&':
            case '\'':
                return m26736Q(cVar);
            case '(':
            case '3':
            case '4':
            case ';':
                return m26765c1(cVar);
            case ')':
                return m26797n0(cVar);
            case '*':
                return m26803p0(cVar);
            case '+':
            case ',':
                return m26809r0(cVar);
            case '-':
                return m26824w0(cVar);
            case '.':
                return m26831y1(cVar);
            case '/':
                return m26695C0(cVar);
            case '0':
            case '^':
                return m26782i0(cVar);
            case '1':
            case 'J':
            case 'L':
                return m26786j1(cVar);
            case '2':
            case 'k':
                return m26793m(cVar);
            case '7':
                return m26807q1(cVar);
            case '<':
            case '=':
                return m26717J1(cVar);
            case '>':
                return m26696C1(cVar);
            case '?':
            case 'A':
                return m26702E1(cVar);
            case '@':
                return m26708G1(cVar);
            case 'C':
            case 'D':
                return m26694C(cVar);
            case 'E':
                return m26688A(cVar);
            case 'H':
            case 'I':
            case 'K':
            case 'O':
                return m26744T0(cVar);
            case 'M':
            case 'N':
                return m26719K0(cVar);
            case 'T':
            case 'U':
            case 'e':
            case 'f':
                return m26777g1(cVar);
            case 'V':
            case 'g':
            case 'h':
            case 'l':
            case 'm':
            case 'n':
                return m26748V0(cVar);
            case 'W':
            case 'X':
                return m26754Y0(cVar);
            case 'Y':
                return m26821v0(cVar);
            case 'Z':
                return m26751X(cVar);
            case 'd':
                return m26741S(cVar);
            case 'i':
                return m26796n(cVar);
            case 'j':
                return m26790l(cVar);
            default:
                return new ArrayList();
        }
    }

    /* renamed from: w */
    private static Map<Integer, String> m26823w() {
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
    private static List<C10507u> m26824w0(C3010c cVar) {
        Resources resources = C3108x.f4951e.getResources();
        ArrayList arrayList = new ArrayList();
        int[] iArr = {0, 28, 6, 9, 10, 16};
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < 6; i++) {
            C6093d b = m26760b(iArr[i], cVar);
            if (b != null) {
                arrayList2.add(b);
                cVar.mo23178B0(b);
            }
        }
        arrayList.add(new C10507u(resources.getString(R$string.feature_group_device), arrayList2));
        return arrayList;
    }

    /* renamed from: w1 */
    private static List<C6093d> m26825w1(C3010c cVar) {
        int[] iArr = {5};
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 1; i++) {
            C6093d c = m26763c(iArr[i], cVar);
            if (c != null) {
                arrayList.add(c);
                cVar.mo23178B0(c);
            }
        }
        return arrayList;
    }

    /* renamed from: x */
    private static List<C10507u> m26826x(C3010c cVar) {
        Resources resources = C3108x.f4951e.getResources();
        ArrayList arrayList = new ArrayList();
        int[] iArr = {0, 38, 23, 9, 34, 16};
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < 6; i++) {
            C6093d b = m26760b(iArr[i], cVar);
            if (b != null) {
                arrayList2.add(b);
                cVar.mo23178B0(b);
            }
        }
        if (arrayList2.size() > 0) {
            arrayList.add(new C10507u(resources.getString(R$string.feature_group_device), arrayList2));
        }
        return arrayList;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0056  */
    /* renamed from: x0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.util.List<com.yeelight.yeelib.device.base.C6093d> m26827x0(com.yeelight.yeelib.device.base.C3010c r4) {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 2
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.add(r1)
            r1 = r4
            com.yeelight.yeelib.device.c r1 = (com.yeelight.yeelib.device.C6119c) r1
            java.util.List r1 = r1.mo31753K1()
            r2 = 21
            if (r1 == 0) goto L_0x0030
            java.util.Iterator r1 = r1.iterator()
        L_0x001c:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x0030
            java.lang.Object r3 = r1.next()
            com.yeelight.yeelib.device.base.e r3 = (com.yeelight.yeelib.device.base.C3012e) r3
            boolean r3 = r3.mo23229n0(r2)
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
            boolean r1 = com.yeelight.yeelib.utils.AppUtils.f4977a
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
            com.yeelight.yeelib.device.base.d r2 = m26763c(r2, r4)
            if (r2 == 0) goto L_0x0050
            r1.add(r2)
            r4.mo23178B0(r2)
            goto L_0x0050
        L_0x006d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p215u3.C10510v.m26827x0(com.yeelight.yeelib.device.base.c):java.util.List");
    }

    /* renamed from: x1 */
    private static Map<Integer, String> m26828x1() {
        HashMap hashMap = new HashMap();
        hashMap.put(0, TimerCodec.DISENABLE);
        hashMap.put(37, TimerCodec.DISENABLE);
        hashMap.put(9, TimerCodec.DISENABLE);
        hashMap.put(34, TimerCodec.DISENABLE);
        hashMap.put(16, TimerCodec.DISENABLE);
        hashMap.put(5, TimerCodec.DISENABLE);
        return hashMap;
    }

    /* renamed from: y */
    private static Map<Integer, String> m26829y() {
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
    private static Map<Integer, String> m26830y0() {
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

    /* renamed from: y1 */
    private static List<C10507u> m26831y1(C3010c cVar) {
        Resources resources = C3108x.f4951e.getResources();
        ArrayList arrayList = new ArrayList();
        int[] iArr = {0, 37, 5, 9, 34, 16};
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < 6; i++) {
            C6093d b = m26760b(iArr[i], cVar);
            if (b != null) {
                arrayList2.add(b);
                cVar.mo23178B0(b);
            }
        }
        arrayList.add(new C10507u(resources.getString(R$string.feature_group_device), arrayList2));
        return arrayList;
    }

    /* renamed from: z */
    private static Map<Integer, String> m26832z() {
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
    private static List<C10507u> m26833z0(C3010c cVar) {
        Resources resources = C3108x.f4951e.getResources();
        ArrayList arrayList = new ArrayList();
        int[] iArr = {0, 12, 23, 9, 16};
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < 5; i++) {
            C6093d b = m26760b(iArr[i], cVar);
            if (b != null) {
                arrayList2.add(b);
                cVar.mo23178B0(b);
            }
        }
        arrayList.add(new C10507u(resources.getString(R$string.feature_group_group), arrayList2));
        return arrayList;
    }

    /* renamed from: z1 */
    private static Map<Integer, String> m26834z1() {
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
}
