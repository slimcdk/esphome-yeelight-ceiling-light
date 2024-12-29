package com.miot.service.qrcode;

import p011c.p012a.p053e.C0829p;
import p011c.p012a.p053e.C0830q;

final class ViewfinderResultPointCallback implements C0830q {
    private final ViewfinderView viewfinderView;

    ViewfinderResultPointCallback(ViewfinderView viewfinderView2) {
        this.viewfinderView = viewfinderView2;
    }

    public void foundPossibleResultPoint(C0829p pVar) {
        this.viewfinderView.addPossibleResultPoint(pVar);
    }
}
