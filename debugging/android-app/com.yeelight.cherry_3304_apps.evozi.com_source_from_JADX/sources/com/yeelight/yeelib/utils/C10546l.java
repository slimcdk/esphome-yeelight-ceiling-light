package com.yeelight.yeelib.utils;

import com.yeelight.yeelib.p150c.p151i.C4200i;
import java.util.Comparator;

/* renamed from: com.yeelight.yeelib.utils.l */
public class C10546l implements Comparator<C4200i> {
    /* renamed from: a */
    public int compare(C4200i iVar, C4200i iVar2) {
        boolean z = iVar == null;
        boolean z2 = iVar2 == null;
        if (z && z2) {
            return 0;
        }
        if (z) {
            return -1;
        }
        if (z2) {
            return 1;
        }
        if (iVar.mo23332k1()) {
            return -1;
        }
        if (!iVar2.mo23332k1() && iVar.mo23416o0()) {
            return !iVar2.mo23416o0() ? -1 : 0;
        }
        return 1;
    }
}
