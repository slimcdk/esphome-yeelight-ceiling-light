package com.miot.service.qrcode;

import com.google.zxing.C2564h;
import com.google.zxing.C2565i;

final class ViewfinderResultPointCallback implements C2565i {
    private final ViewfinderView viewfinderView;

    ViewfinderResultPointCallback(ViewfinderView viewfinderView2) {
        this.viewfinderView = viewfinderView2;
    }

    public void foundPossibleResultPoint(C2564h hVar) {
        this.viewfinderView.addPossibleResultPoint(hVar);
    }
}
