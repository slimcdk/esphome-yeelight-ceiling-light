package com.google.zxing.multi.qrcode.detector;

import com.google.zxing.qrcode.detector.C2634d;
import java.io.Serializable;
import java.util.Comparator;

final class MultiFinderPatternFinder$ModuleSizeComparator implements Serializable, Comparator<C2634d> {
    private MultiFinderPatternFinder$ModuleSizeComparator() {
    }

    public int compare(C2634d dVar, C2634d dVar2) {
        double i = (double) (dVar2.mo19692i() - dVar.mo19692i());
        if (i < 0.0d) {
            return -1;
        }
        return i > 0.0d ? 1 : 0;
    }
}
